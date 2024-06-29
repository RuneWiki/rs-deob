import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class231 extends class428 implements class560 {
   @OriginalMember(
      owner = "client!p",
      name = "m",
      descriptor = "Ljava/awt/Canvas;"
   )
   public Canvas field3244;
   @OriginalMember(
      owner = "client!p",
      name = "o",
      descriptor = "I"
   )
   public int field3247;
   @OriginalMember(
      owner = "client!p",
      name = "n",
      descriptor = "I"
   )
   public int field3245;
   @OriginalMember(
      owner = "client!p",
      name = "p",
      descriptor = "Z"
   )
   private static boolean field3243 = false;
   @OriginalMember(
      owner = "client!p",
      name = "q",
      descriptor = "J"
   )
   private static long field3246;
   @OriginalMember(
      owner = "client!p",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!p",
      name = "H",
      descriptor = "(IIII)V"
   )
   private final native void method1795(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!p",
      name = "K",
      descriptor = "(IIIIII)V"
   )
   private final native void method1796(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!p",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method113(boolean arg0);

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "()V"
   )
   public final void method1797() {
      this.method113(true);
      this.nativeid = 0L;
      this.field3244 = null;
   }

   @OriginalMember(
      owner = "client!p",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class499.method3617(this, 0);
      }

   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(Ljava/lang/Exception;)V"
   )
   private final void method1798(Exception arg0) {
      if (!field3243) {
         field3246 = class133.method1054(-29025);
         field3243 = true;
      } else if (class133.method1054(-29025) - field3246 < 30000L) {
         this.field3244.repaint();
      } else {
         throw new RuntimeException(arg0.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method1799(Rectangle[] arg0, int arg1, int arg2, int arg3) {
      try {
         synchronized(this.field3244.getTreeLock()) {
            for(int var6 = 0; var6 < arg1; ++var6) {
               Rectangle var7 = arg0[var6];
               if (var7.width > 0 && var7.height > 0) {
                  this.method1796(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
               }
            }

            field3243 = false;
         }
      } catch (Exception var10) {
         this.method1798(var10);
      }
   }

   @OriginalMember(
      owner = "client!p",
      name = "sa",
      descriptor = "(Loa;Ljava/awt/Canvas;II)V"
   )
   private final native void method1800(class724 arg0, Canvas arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method1801(Canvas arg0, int arg1, int arg2) {
      this.field3247 = arg1;
      this.field3245 = arg2;
      this.method1803(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1802(int arg0, int arg1) {
      try {
         synchronized(this.field3244.getTreeLock()) {
            Dimension var4 = this.field3244.getSize();
            this.method1795(arg0, arg1, var4.width, var4.height);
            field3243 = false;
         }
      } catch (Exception var7) {
         this.method1798(var7);
      }
   }

   @OriginalMember(
      owner = "client!p",
      name = "oa",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   private final native void method1803(Canvas arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!p",
      name = "<init>",
      descriptor = "(Loa;Ljava/awt/Canvas;II)V"
   )
   public class231(class724 arg0, Canvas arg1, int arg2, int arg3) {
      this.field3244 = arg1;
      this.field3247 = arg2;
      this.field3245 = arg3;
      this.method1800(arg0, this.field3244, arg2, arg3);
   }
}
