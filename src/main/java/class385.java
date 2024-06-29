import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class385 extends Callback {
   @OriginalMember(
      owner = "client!uia",
      name = "a",
      descriptor = "Z"
   )
   private volatile boolean field5402 = true;
   @OriginalMember(
      owner = "client!uia",
      name = "b",
      descriptor = "I"
   )
   private volatile int field5400;
   @OriginalMember(
      owner = "client!uia",
      name = "e",
      descriptor = "I"
   )
   private volatile int field5401;
   @OriginalMember(
      owner = "client!uia",
      name = "d",
      descriptor = "I"
   )
   private int field5403;
   @OriginalMember(
      owner = "client!uia",
      name = "c",
      descriptor = "Z"
   )
   private boolean field5404;

   @OriginalMember(
      owner = "client!uia",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2953(int arg0, int arg1, int arg2) {
      User32.SetCursorPos(arg1, arg0);
      if (arg2 != 9341) {
         this.method2953(22, 18, 25);
      }
   }

   @OriginalMember(
      owner = "client!uia",
      name = "callback",
      descriptor = "(IIII)I"
   )
   public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
      if (~this.field5401 != ~arg0) {
         int var5 = User32.GetWindowLong(arg0, -4);
         return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
      } else {
         if (arg1 == 32) {
            int var6 = 65535 & arg3;
            if (~var6 == -2) {
               User32.SetCursor(this.field5402 ? this.field5403 : 0);
               return 0;
            }
         }

         if (arg1 == 101024) {
            User32.SetCursor(!this.field5402 ? 0 : this.field5403);
            return 0;
         } else {
            if (~arg1 == -2) {
               this.field5401 = 0;
               this.field5402 = true;
            }

            return User32.CallWindowProc(this.field5400, arg0, arg1, arg2, arg3);
         }
      }
   }

   @OriginalMember(
      owner = "client!uia",
      name = "a",
      descriptor = "(BLjava/awt/Component;Z)V"
   )
   public final void method2954(byte arg0, Component arg1, boolean arg2) {
      WComponentPeer var4 = (WComponentPeer)arg1.getPeer();
      if (arg0 != -51) {
         this.field5404 = true;
      }

      int var5 = var4.getTopHwnd();
      if (~this.field5401 != ~var5 || !arg2 != !this.field5402) {
         if (!this.field5404) {
            this.field5403 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field5404 = true;
         }

         if (~this.field5401 != ~var5) {
            if (~this.field5401 != -1) {
               this.field5402 = true;
               User32.SendMessage(var5, 101024, 0, 0);
               synchronized(this) {
                  User32.SetWindowLong(this.field5401, -4, this.field5400);
               }
            }

            synchronized(this) {
               this.field5401 = var5;
               this.field5400 = User32.SetWindowLong(this.field5401, -4, this);
            }
         }

         this.field5402 = arg2;
         User32.SendMessage(var5, 101024, 0, 0);
      }
   }
}
