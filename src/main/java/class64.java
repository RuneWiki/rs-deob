import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class64 extends class673 implements class787 {
   @OriginalMember(
      owner = "client!p",
      name = "m",
      descriptor = "Ljava/awt/Canvas;"
   )
   public Canvas field812;
   @OriginalMember(
      owner = "client!p",
      name = "n",
      descriptor = "I"
   )
   public int field809;
   @OriginalMember(
      owner = "client!p",
      name = "o",
      descriptor = "I"
   )
   public int field811;
   @OriginalMember(
      owner = "client!p",
      name = "p",
      descriptor = "Z"
   )
   private static boolean field810 = false;
   @OriginalMember(
      owner = "client!p",
      name = "l",
      descriptor = "J"
   )
   private static long field808;
   @OriginalMember(
      owner = "client!p",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!p",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class611.method4509(-7155, this);
      }

   }

   @OriginalMember(
      owner = "client!p",
      name = "sa",
      descriptor = "(Loa;Ljava/awt/Canvas;II)V"
   )
   private final native void method567(class53 arg0, Canvas arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "()V"
   )
   public final void method568() {
      this.method477(true);
      this.nativeid = 0L;
      this.field812 = null;
   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method569(int arg0, int arg1) {
      try {
         synchronized(this.field812.getTreeLock()) {
            Dimension var4 = this.field812.getSize();
            this.method571(arg0, arg1, var4.width, var4.height);
            field810 = false;
         }
      } catch (Exception var7) {
         this.method570(var7);
      }
   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(Ljava/lang/Exception;)V"
   )
   private final void method570(Exception arg0) {
      if (!field810) {
         field808 = class163.method1353(-128);
         field810 = true;
      } else if (class163.method1353(-128) - field808 < 30000L) {
         this.field812.repaint();
      } else {
         throw new RuntimeException(arg0.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!p",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method477(boolean arg0);

   @OriginalMember(
      owner = "client!p",
      name = "H",
      descriptor = "(IIII)V"
   )
   private final native void method571(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!p",
      name = "oa",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   private final native void method572(Canvas arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method573(Canvas arg0, int arg1, int arg2) {
      this.field809 = arg1;
      this.field811 = arg2;
      this.method572(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!p",
      name = "<init>",
      descriptor = "(Loa;Ljava/awt/Canvas;II)V"
   )
   public class64(class53 arg0, Canvas arg1, int arg2, int arg3) {
      this.field812 = arg1;
      this.field809 = arg2;
      this.field811 = arg3;
      this.method567(arg0, this.field812, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!p",
      name = "K",
      descriptor = "(IIIIII)V"
   )
   private final native void method574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method575(Rectangle[] arg0, int arg1, int arg2, int arg3) {
      try {
         synchronized(this.field812.getTreeLock()) {
            for(int var6 = 0; var6 < arg1; ++var6) {
               Rectangle var7 = arg0[var6];
               if (var7.width > 0 && var7.height > 0) {
                  this.method574(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
               }
            }

            field810 = false;
         }
      } catch (Exception var10) {
         this.method570(var10);
      }
   }
}
