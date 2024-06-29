import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class671 extends Callback {
   @OriginalMember(
      owner = "client!it",
      name = "d",
      descriptor = "Z"
   )
   private volatile boolean field9849 = true;
   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "I"
   )
   private volatile int field9850;
   @OriginalMember(
      owner = "client!it",
      name = "e",
      descriptor = "I"
   )
   private int field9851;
   @OriginalMember(
      owner = "client!it",
      name = "c",
      descriptor = "I"
   )
   private volatile int field9853;
   @OriginalMember(
      owner = "client!it",
      name = "b",
      descriptor = "Z"
   )
   private boolean field9852;

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method4913(int arg0, int arg1, int arg2) {
      User32.SetCursorPos(arg2, arg0);
      if (arg1 != 65535) {
         this.method4913(18, -42, -97);
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(ILjava/awt/Component;Z)V"
   )
   public final void method4914(int arg0, Component arg1, boolean arg2) {
      WComponentPeer var4 = (WComponentPeer)arg1.getPeer();
      int var5 = var4.getTopHwnd();
      if (~this.field9853 != ~var5 || this.field9849 == !arg2) {
         if (!this.field9852) {
            this.field9851 = User32.LoadCursor(0, 32512);
            Root.alloc(this);
            this.field9852 = true;
         }

         if (~this.field9853 != ~var5) {
            if (~this.field9853 != -1) {
               this.field9849 = true;
               User32.SendMessage(var5, 101024, 0, 0);
               synchronized(this) {
                  User32.SetWindowLong(this.field9853, -4, this.field9850);
               }
            }

            synchronized(this) {
               this.field9853 = var5;
               this.field9850 = User32.SetWindowLong(this.field9853, -4, this);
            }
         }

         this.field9849 = arg2;
         User32.SendMessage(var5, 101024, arg0, 0);
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "callback",
      descriptor = "(IIII)I"
   )
   public final synchronized int callback(int arg0, int arg1, int arg2, int arg3) {
      if (~this.field9853 != ~arg0) {
         int var5 = User32.GetWindowLong(arg0, -4);
         return User32.CallWindowProc(var5, arg0, arg1, arg2, arg3);
      } else {
         if (~arg1 == -33) {
            int var6 = arg3 & 65535;
            if (~var6 == -2) {
               User32.SetCursor(!this.field9849 ? 0 : this.field9851);
               return 0;
            }
         }

         if (arg1 == 101024) {
            User32.SetCursor(!this.field9849 ? 0 : this.field9851);
            return 0;
         } else {
            if (arg1 == 1) {
               this.field9853 = 0;
               this.field9849 = true;
            }

            return User32.CallWindowProc(this.field9850, arg0, arg1, arg2, arg3);
         }
      }
   }
}
