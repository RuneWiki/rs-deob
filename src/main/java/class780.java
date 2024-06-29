import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class780 extends class247 implements class64 {
   @OriginalMember(
      owner = "client!p",
      name = "n",
      descriptor = "Ljava/awt/Canvas;"
   )
   public Canvas field11380;
   @OriginalMember(
      owner = "client!p",
      name = "k",
      descriptor = "I"
   )
   public int field11383;
   @OriginalMember(
      owner = "client!p",
      name = "m",
      descriptor = "I"
   )
   public int field11382;
   @OriginalMember(
      owner = "client!p",
      name = "l",
      descriptor = "Z"
   )
   private static boolean field11384 = false;
   @OriginalMember(
      owner = "client!p",
      name = "j",
      descriptor = "J"
   )
   private static long field11381;
   @OriginalMember(
      owner = "client!p",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!p",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method633(boolean arg0);

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(Ljava/lang/Exception;)V"
   )
   private final void method5633(Exception arg0) {
      if (!field11384) {
         field11381 = class604.method4452(-9);
         field11384 = true;
      } else if (class604.method4452(28) - field11381 < 30000L) {
         this.field11380.repaint();
      } else {
         throw new RuntimeException(arg0.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!p",
      name = "oa",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   private final native void method5634(Canvas arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "()V"
   )
   public final void method5635() {
      this.method633(true);
      this.nativeid = 0L;
      this.field11380 = null;
   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method5636(Canvas arg0, int arg1, int arg2) {
      this.field11383 = arg1;
      this.field11382 = arg2;
      this.method5634(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!p",
      name = "H",
      descriptor = "(IIII)V"
   )
   private final native void method5637(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method5638(Rectangle[] arg0, int arg1, int arg2, int arg3) {
      try {
         synchronized(this.field11380.getTreeLock()) {
            for(int var6 = 0; var6 < arg1; ++var6) {
               Rectangle var7 = arg0[var6];
               if (var7.width > 0 && var7.height > 0) {
                  this.method5639(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
               }
            }

            field11384 = false;
         }
      } catch (Exception var10) {
         this.method5633(var10);
      }
   }

   @OriginalMember(
      owner = "client!p",
      name = "K",
      descriptor = "(IIIIII)V"
   )
   private final native void method5639(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!p",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class422.method3289((byte)-31, this);
      }

   }

   @OriginalMember(
      owner = "client!p",
      name = "sa",
      descriptor = "(Loa;Ljava/awt/Canvas;II)V"
   )
   private final native void method5640(class473 arg0, Canvas arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!p",
      name = "<init>",
      descriptor = "(Loa;Ljava/awt/Canvas;II)V"
   )
   public class780(class473 arg0, Canvas arg1, int arg2, int arg3) {
      this.field11380 = arg1;
      this.field11383 = arg2;
      this.field11382 = arg3;
      this.method5640(arg0, this.field11380, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method5641(int arg0, int arg1) {
      try {
         synchronized(this.field11380.getTreeLock()) {
            Dimension var4 = this.field11380.getSize();
            this.method5637(arg0, arg1, var4.width, var4.height);
            field11384 = false;
         }
      } catch (Exception var7) {
         this.method5633(var7);
      }
   }
}
