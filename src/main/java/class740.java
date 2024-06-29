import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class740 extends Callback {
   @OriginalMember(
      owner = "client!kl",
      name = "c",
      descriptor = "Z"
   )
   private volatile boolean field10558 = true;
   @OriginalMember(
      owner = "client!kl",
      name = "d",
      descriptor = "I"
   )
   private int field10559;
   @OriginalMember(
      owner = "client!kl",
      name = "b",
      descriptor = "I"
   )
   private volatile int field10560;
   @OriginalMember(
      owner = "client!kl",
      name = "a",
      descriptor = "I"
   )
   private volatile int field10562;
   @OriginalMember(
      owner = "client!kl",
      name = "e",
      descriptor = "Z"
   )
   private boolean field10561;

   @OriginalMember(
      owner = "client!kl",
      name = "a",
      descriptor = "(Ljava/awt/Component;ZZ)V"
   )
   public final void method5345(Component arg0, boolean arg1, boolean arg2) {
      if (!arg2) {
         WComponentPeer var4 = (WComponentPeer)arg0.getPeer();
         int var5 = var4.getTopHwnd();
         if (this.field10560 != var5 || !arg1 == this.field10558) {
            if (!this.field10561) {
               this.field10559 = User32.LoadCursor(0, 32512);
               Root.alloc(this);
               this.field10561 = true;
            }

            if (this.field10560 != var5) {
               if (~this.field10560 != -1) {
                  this.field10558 = true;
                  User32.SendMessage(var5, 101024, 0, 0);
                  synchronized(this) {
                     User32.SetWindowLong(this.field10560, -4, this.field10562);
                  }
               }

               synchronized(this) {
                  this.field10560 = var5;
                  this.field10562 = User32.SetWindowLong(this.field10560, -4, this);
               }
            }

            this.field10558 = arg1;
            User32.SendMessage(var5, 101024, 0, 0);
         }
      }
   }

   @OriginalMember(
      owner = "client!kl",
      name = "callback",
      descriptor = "(IIII)I"
   )
   public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
      if (~this.field10560 != ~arg0) {
         int var5 = User32.GetWindowLong(arg0, -4);
         return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
      } else {
         if (arg1 == 32) {
            int var6 = arg3 & 65535;
            if (var6 == 1) {
               User32.SetCursor(!this.field10558 ? 0 : this.field10559);
               return 0;
            }
         }

         if (arg1 == 101024) {
            User32.SetCursor(this.field10558 ? this.field10559 : 0);
            return 0;
         } else {
            if (arg1 == 1) {
               this.field10560 = 0;
               this.field10558 = true;
            }

            return User32.CallWindowProc(this.field10562, arg0, arg1, arg2, arg3);
         }
      }
   }

   @OriginalMember(
      owner = "client!kl",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public final void method5346(int arg0, int arg1, boolean arg2) {
      if (!arg2) {
         this.method5346(61, -81, true);
      }

      User32.SetCursorPos(arg0, arg1);
   }
}
