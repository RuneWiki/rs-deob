import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class105 extends Callback {
   @OriginalMember(
      owner = "client!ps",
      name = "e",
      descriptor = "Z"
   )
   private volatile boolean field1328 = true;
   @OriginalMember(
      owner = "client!ps",
      name = "c",
      descriptor = "I"
   )
   private volatile int field1329;
   @OriginalMember(
      owner = "client!ps",
      name = "b",
      descriptor = "I"
   )
   private int field1330;
   @OriginalMember(
      owner = "client!ps",
      name = "d",
      descriptor = "I"
   )
   private volatile int field1331;
   @OriginalMember(
      owner = "client!ps",
      name = "a",
      descriptor = "Z"
   )
   private boolean field1327;

   @OriginalMember(
      owner = "client!ps",
      name = "a",
      descriptor = "(Ljava/awt/Component;IZ)V"
   )
   public final void method865(Component arg0, int arg1, boolean arg2) {
      WComponentPeer var4 = (WComponentPeer)arg0.getPeer();
      if (arg1 == -31672) {
         int var5 = var4.getTopHwnd();
         if (~this.field1329 != ~var5 || !arg2 != !this.field1328) {
            if (!this.field1327) {
               this.field1330 = User32.LoadCursor(0, 32512);
               Root.alloc(this);
               this.field1327 = true;
            }

            if (~this.field1329 != ~var5) {
               if (~this.field1329 != -1) {
                  this.field1328 = true;
                  User32.SendMessage(var5, 101024, 0, 0);
                  synchronized(this) {
                     User32.SetWindowLong(this.field1329, -4, this.field1331);
                  }
               }

               synchronized(this) {
                  this.field1329 = var5;
                  this.field1331 = User32.SetWindowLong(this.field1329, -4, this);
               }
            }

            this.field1328 = arg2;
            User32.SendMessage(var5, 101024, 0, 0);
         }
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method866(int arg0, int arg1, int arg2) {
      if (arg1 == 65535) {
         User32.SetCursorPos(arg0, arg2);
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "callback",
      descriptor = "(IIII)I"
   )
   public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
      if (~this.field1329 != ~arg0) {
         int var5 = User32.GetWindowLong(arg0, -4);
         return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
      } else {
         if (arg1 == 32) {
            int var6 = 65535 & arg3;
            if (var6 == 1) {
               User32.SetCursor(this.field1328 ? this.field1330 : 0);
               return 0;
            }
         }

         if (~arg1 == -101025) {
            User32.SetCursor(this.field1328 ? this.field1330 : 0);
            return 0;
         } else {
            if (~arg1 == -2) {
               this.field1329 = 0;
               this.field1328 = true;
            }

            return User32.CallWindowProc(this.field1331, arg0, arg1, arg2, arg3);
         }
      }
   }
}
