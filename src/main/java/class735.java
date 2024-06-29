import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class735 extends Callback {
   @OriginalMember(
      owner = "client!ip",
      name = "c",
      descriptor = "Z"
   )
   private volatile boolean field10920 = true;
   @OriginalMember(
      owner = "client!ip",
      name = "b",
      descriptor = "I"
   )
   private int field10916;
   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "I"
   )
   private volatile int field10918;
   @OriginalMember(
      owner = "client!ip",
      name = "e",
      descriptor = "I"
   )
   private volatile int field10919;
   @OriginalMember(
      owner = "client!ip",
      name = "d",
      descriptor = "Z"
   )
   private boolean field10917;

   @OriginalMember(
      owner = "client!ip",
      name = "callback",
      descriptor = "(IIII)I",
      line = 4
   )
   public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
      if (this.field10918 != arg0) {
         int var5 = User32.GetWindowLong(arg0, -4);
         return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
      } else {
         if (~arg1 == -33) {
            int var6 = 65535 & arg3;
            if (~var6 == -2) {
               User32.SetCursor(this.field10920 ? this.field10916 : 0);
               return 0;
            }
         }

         if (~arg1 == -101025) {
            User32.SetCursor(this.field10920 ? this.field10916 : 0);
            return 0;
         } else {
            if (arg1 == 1) {
               this.field10918 = 0;
               this.field10920 = true;
            }

            return User32.CallWindowProc(this.field10919, arg0, arg1, arg2, arg3);
         }
      }
   }

   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "(III)V",
      line = 46
   )
   public final void method5348(int arg0, int arg1, int arg2) {
      User32.SetCursorPos(arg1, arg0);
      int var4 = -40 % ((arg2 - 62) / 34);
   }

   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "(Ljava/awt/Component;BZ)V",
      line = 58
   )
   public final void method5349(Component arg0, byte arg1, boolean arg2) {
      WComponentPeer var4 = (WComponentPeer)arg0.getPeer();
      int var5 = var4.getTopHwnd();
      if (~this.field10918 != ~var5 || this.field10920 == !arg2) {
         if (!this.field10917) {
            this.field10916 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field10917 = true;
         }

         if (arg1 != -36) {
            this.callback(8, -51, 45, 120);
         }

         if (~this.field10918 != ~var5) {
            if (~this.field10918 != -1) {
               this.field10920 = true;
               User32.SendMessage(var5, 101024, 0, 0);
               synchronized(this) {
                  User32.SetWindowLong(this.field10918, -4, this.field10919);
               }
            }

            synchronized(this) {
               this.field10918 = var5;
               this.field10919 = User32.SetWindowLong(this.field10918, -4, this);
            }
         }

         this.field10920 = arg2;
         User32.SendMessage(var5, 101024, 0, 0);
      }
   }
}
