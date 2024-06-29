import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class610 extends Callback {
   @OriginalMember(
      owner = "client!fs",
      name = "c",
      descriptor = "Z"
   )
   private volatile boolean field9005 = true;
   @OriginalMember(
      owner = "client!fs",
      name = "b",
      descriptor = "I"
   )
   private int field9006;
   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "I"
   )
   private volatile int field9007;
   @OriginalMember(
      owner = "client!fs",
      name = "e",
      descriptor = "I"
   )
   private volatile int field9008;
   @OriginalMember(
      owner = "client!fs",
      name = "d",
      descriptor = "Z"
   )
   private boolean field9004;

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(ZBLjava/awt/Component;)V"
   )
   public final void method4504(boolean arg0, byte arg1, Component arg2) {
      WComponentPeer var4 = (WComponentPeer)arg2.getPeer();
      if (arg1 > -67) {
         this.method4505(-49, -102, 115);
      }

      int var5 = var4.getTopHwnd();
      if (this.field9007 != var5 || !this.field9005 == arg0) {
         if (!this.field9004) {
            this.field9006 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field9004 = true;
         }

         if (this.field9007 != var5) {
            if (~this.field9007 != -1) {
               this.field9005 = true;
               User32.SendMessage(var5, 101024, 0, 0);
               synchronized(this) {
                  User32.SetWindowLong(this.field9007, -4, this.field9008);
               }
            }

            synchronized(this) {
               this.field9007 = var5;
               this.field9008 = User32.SetWindowLong(this.field9007, -4, this);
            }
         }

         this.field9005 = arg0;
         User32.SendMessage(var5, 101024, 0, 0);
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method4505(int arg0, int arg1, int arg2) {
      User32.SetCursorPos(arg0, arg2);
      if (arg1 != 101024) {
         this.field9008 = 45;
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "callback",
      descriptor = "(IIII)I"
   )
   public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
      if (~this.field9007 != ~arg0) {
         int var5 = User32.GetWindowLong(arg0, -4);
         return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
      } else {
         if (~arg1 == -33) {
            int var6 = arg3 & 65535;
            if (var6 == 1) {
               User32.SetCursor(!this.field9005 ? 0 : this.field9006);
               return 0;
            }
         }

         if (arg1 == 101024) {
            User32.SetCursor(this.field9005 ? this.field9006 : 0);
            return 0;
         } else {
            if (arg1 == 1) {
               this.field9007 = 0;
               this.field9005 = true;
            }

            return User32.CallWindowProc(this.field9008, arg0, arg1, arg2, arg3);
         }
      }
   }
}
