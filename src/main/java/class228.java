import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class228 extends class22 implements class556 {
   @OriginalMember(
      owner = "client!p",
      name = "n",
      descriptor = "Ljava/awt/Canvas;"
   )
   public Canvas field3364;
   @OriginalMember(
      owner = "client!p",
      name = "m",
      descriptor = "I"
   )
   public int field3366;
   @OriginalMember(
      owner = "client!p",
      name = "j",
      descriptor = "I"
   )
   public int field3363;
   @OriginalMember(
      owner = "client!p",
      name = "k",
      descriptor = "Z"
   )
   private static boolean field3365 = false;
   @OriginalMember(
      owner = "client!p",
      name = "l",
      descriptor = "J"
   )
   private static long field3367;
   @OriginalMember(
      owner = "client!p",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "()V",
      line = 4
   )
   public final void method1893() {
      this.method139(true);
      this.nativeid = 0L;
      this.field3364 = null;
   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V",
      line = 9
   )
   public final void method1894(Rectangle[] arg0, int arg1, int arg2, int arg3) {
      try {
         synchronized(this.field3364.getTreeLock()) {
            for(int var6 = 0; var6 < arg1; ++var6) {
               Rectangle var7 = arg0[var6];
               if (var7.width > 0 && var7.height > 0) {
                  this.method1900(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
               }
            }

            field3365 = false;
         }
      } catch (Exception var10) {
         this.method1897(var10);
      }
   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(II)V",
      line = 35
   )
   public final void method1896(int arg0, int arg1) {
      try {
         synchronized(this.field3364.getTreeLock()) {
            Dimension var4 = this.field3364.getSize();
            this.method1901(arg0, arg1, var4.width, var4.height);
            field3365 = false;
         }
      } catch (Exception var7) {
         this.method1897(var7);
      }
   }

   @OriginalMember(
      owner = "client!p",
      name = "finalize",
      descriptor = "()V",
      line = 49
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class350.method2702((byte)-51, this);
      }

   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(Ljava/lang/Exception;)V",
      line = 55
   )
   private final void method1897(Exception arg0) {
      if (!field3365) {
         field3367 = class57.method650(112);
         field3365 = true;
      } else if (class57.method650(96) - field3367 < 30000L) {
         this.field3364.repaint();
      } else {
         throw new RuntimeException(arg0.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V",
      line = 77
   )
   public final void method1899(Canvas arg0, int arg1, int arg2) {
      this.field3366 = arg1;
      this.field3363 = arg2;
      this.method1895(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!p",
      name = "<init>",
      descriptor = "(Loa;Ljava/awt/Canvas;II)V",
      line = 82
   )
   public class228(class721 arg0, Canvas arg1, int arg2, int arg3) {
      this.field3364 = arg1;
      this.field3366 = arg2;
      this.field3363 = arg3;
      this.method1898(arg0, this.field3364, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!p",
      name = "oa",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   private final native void method1895(Canvas arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!p",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method139(boolean arg0);

   @OriginalMember(
      owner = "client!p",
      name = "sa",
      descriptor = "(Loa;Ljava/awt/Canvas;II)V"
   )
   private final native void method1898(class721 arg0, Canvas arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!p",
      name = "K",
      descriptor = "(IIIIII)V"
   )
   private final native void method1900(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!p",
      name = "H",
      descriptor = "(IIII)V"
   )
   private final native void method1901(int arg0, int arg1, int arg2, int arg3);
}
