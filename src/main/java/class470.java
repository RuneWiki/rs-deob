import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class470 extends class294 implements class245 {
   @OriginalMember(
      owner = "client!p",
      name = "o",
      descriptor = "Ljava/awt/Canvas;"
   )
   public Canvas field7155;
   @OriginalMember(
      owner = "client!p",
      name = "q",
      descriptor = "I"
   )
   public int field7154;
   @OriginalMember(
      owner = "client!p",
      name = "m",
      descriptor = "I"
   )
   public int field7153;
   @OriginalMember(
      owner = "client!p",
      name = "n",
      descriptor = "Z"
   )
   private static boolean field7151 = false;
   @OriginalMember(
      owner = "client!p",
      name = "p",
      descriptor = "J"
   )
   private static long field7152;
   @OriginalMember(
      owner = "client!p",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!p",
      name = "finalize",
      descriptor = "()V",
      line = 6
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class613.method4518(this, -1);
      }

   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V",
      line = 12
   )
   public final void method3654(Rectangle[] arg0, int arg1, int arg2, int arg3) {
      try {
         synchronized(this.field7155.getTreeLock()) {
            for(int var6 = 0; var6 < arg1; ++var6) {
               Rectangle var7 = arg0[var6];
               if (var7.width > 0 && var7.height > 0) {
                  this.method3659(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
               }
            }

            field7151 = false;
         }
      } catch (Exception var10) {
         this.method3656(var10);
      }
   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V",
      line = 36
   )
   public final void method3655(Canvas arg0, int arg1, int arg2) {
      this.field7154 = arg1;
      this.field7153 = arg2;
      this.method3652(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(Ljava/lang/Exception;)V",
      line = 44
   )
   private final void method3656(Exception arg0) {
      if (!field7151) {
         field7152 = class162.method1442(14080);
         field7151 = true;
      } else if (class162.method1442(14080) - field7152 < 30000L) {
         this.field7155.repaint();
      } else {
         throw new RuntimeException(arg0.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(II)V",
      line = 70
   )
   public final void method3658(int arg0, int arg1) {
      try {
         synchronized(this.field7155.getTreeLock()) {
            Dimension var4 = this.field7155.getSize();
            this.method3653(arg0, arg1, var4.width, var4.height);
            field7151 = false;
         }
      } catch (Exception var7) {
         this.method3656(var7);
      }
   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "()V",
      line = 83
   )
   public final void method3660() {
      this.method625(true);
      this.nativeid = 0L;
      this.field7155 = null;
   }

   @OriginalMember(
      owner = "client!p",
      name = "<init>",
      descriptor = "(Loa;Ljava/awt/Canvas;II)V",
      line = 87
   )
   public class470(class74 arg0, Canvas arg1, int arg2, int arg3) {
      this.field7155 = arg1;
      this.field7154 = arg2;
      this.field7153 = arg3;
      this.method3657(arg0, this.field7155, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!p",
      name = "oa",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   private final native void method3652(Canvas arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!p",
      name = "H",
      descriptor = "(IIII)V"
   )
   private final native void method3653(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!p",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method625(boolean arg0);

   @OriginalMember(
      owner = "client!p",
      name = "sa",
      descriptor = "(Loa;Ljava/awt/Canvas;II)V"
   )
   private final native void method3657(class74 arg0, Canvas arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!p",
      name = "K",
      descriptor = "(IIIIII)V"
   )
   private final native void method3659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
