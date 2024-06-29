import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class347 extends Callback {
   @OriginalMember(
      owner = "client!vc",
      name = "e",
      descriptor = "Z"
   )
   private volatile boolean field5313 = true;
   @OriginalMember(
      owner = "client!vc",
      name = "c",
      descriptor = "I"
   )
   private int field5310;
   @OriginalMember(
      owner = "client!vc",
      name = "b",
      descriptor = "I"
   )
   private volatile int field5312;
   @OriginalMember(
      owner = "client!vc",
      name = "d",
      descriptor = "I"
   )
   private volatile int field5314;
   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "Z"
   )
   private boolean field5311;

   @OriginalMember(
      owner = "client!vc",
      name = "callback",
      descriptor = "(IIII)I",
      line = 4
   )
   public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
      if (~this.field5312 != ~arg0) {
         int var5 = User32.GetWindowLong(arg0, -4);
         return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
      } else {
         if (~arg1 == -33) {
            int var6 = arg3 & 65535;
            if (var6 == 1) {
               User32.SetCursor(!this.field5313 ? 0 : this.field5310);
               return 0;
            }
         }

         if (~arg1 == -101025) {
            User32.SetCursor(!this.field5313 ? 0 : this.field5310);
            return 0;
         } else {
            if (arg1 == 1) {
               this.field5312 = 0;
               this.field5313 = true;
            }

            return User32.CallWindowProc(this.field5314, arg0, arg1, arg2, arg3);
         }
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "(ZII)V",
      line = 46
   )
   public final void method2801(boolean arg0, int arg1, int arg2) {
      User32.SetCursorPos(arg1, arg2);
      if (arg0) {
         this.field5312 = -90;
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "(ZILjava/awt/Component;)V",
      line = 58
   )
   public final void method2802(boolean arg0, int arg1, Component arg2) {
      WComponentPeer var4 = (WComponentPeer)arg2.getPeer();
      int var5 = var4.getTopHwnd();
      if (~this.field5312 != ~var5 || arg0 == !this.field5313) {
         if (!this.field5311) {
            this.field5310 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field5311 = true;
         }

         if (~this.field5312 != ~var5) {
            if (~this.field5312 != -1) {
               this.field5313 = true;
               User32.SendMessage(var5, 101024, 0, 0);
               synchronized(this) {
                  User32.SetWindowLong(this.field5312, -4, this.field5314);
               }
            }

            synchronized(this) {
               this.field5312 = var5;
               this.field5314 = User32.SetWindowLong(this.field5312, -4, this);
            }
         }

         this.field5313 = arg0;
         User32.SendMessage(var5, 101024, 0, arg1);
      }
   }
}
