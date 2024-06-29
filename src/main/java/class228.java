import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class228 extends class347 implements class558 {
   @OriginalMember(
      owner = "client!p",
      name = "i",
      descriptor = "Ljava/awt/Canvas;"
   )
   public Canvas field2917;
   @OriginalMember(
      owner = "client!p",
      name = "m",
      descriptor = "I"
   )
   public int field2914;
   @OriginalMember(
      owner = "client!p",
      name = "l",
      descriptor = "I"
   )
   public int field2913;
   @OriginalMember(
      owner = "client!p",
      name = "j",
      descriptor = "Z"
   )
   private static boolean field2915 = false;
   @OriginalMember(
      owner = "client!p",
      name = "k",
      descriptor = "J"
   )
   private static long field2916;
   @OriginalMember(
      owner = "client!p",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(II)V",
      line = 3
   )
   public final void method1719(int arg0, int arg1) {
      try {
         synchronized(this.field2917.getTreeLock()) {
            Dimension var4 = this.field2917.getSize();
            this.method1726(arg0, arg1, var4.width, var4.height);
            field2915 = false;
         }
      } catch (Exception var7) {
         this.method1724(var7);
      }
   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V",
      line = 18
   )
   public final void method1721(Rectangle[] arg0, int arg1, int arg2, int arg3) {
      try {
         synchronized(this.field2917.getTreeLock()) {
            for(int var6 = 0; var6 < arg1; ++var6) {
               Rectangle var7 = arg0[var6];
               if (var7.width > 0 && var7.height > 0) {
                  this.method1720(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
               }
            }

            field2915 = false;
         }
      } catch (Exception var10) {
         this.method1724(var10);
      }
   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(Ljava/lang/Exception;)V",
      line = 45
   )
   private final void method1724(Exception arg0) {
      if (!field2915) {
         field2916 = class188.method1462(true);
         field2915 = true;
      } else if (class188.method1462(true) - field2916 < 30000L) {
         this.field2917.repaint();
      } else {
         throw new RuntimeException(arg0.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V",
      line = 67
   )
   public final void method1725(Canvas arg0, int arg1, int arg2) {
      this.field2914 = arg1;
      this.field2913 = arg2;
      this.method1723(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!p",
      name = "finalize",
      descriptor = "()V",
      line = 74
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class206.method1578(0, this);
      }

   }

   @OriginalMember(
      owner = "client!p",
      name = "<init>",
      descriptor = "(Loa;Ljava/awt/Canvas;II)V",
      line = 81
   )
   public class228(class722 arg0, Canvas arg1, int arg2, int arg3) {
      this.field2917 = arg1;
      this.field2914 = arg2;
      this.field2913 = arg3;
      this.method1722(arg0, this.field2917, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!p",
      name = "a",
      descriptor = "()V",
      line = 89
   )
   public final void method1727() {
      this.method134(true);
      this.nativeid = 0L;
      this.field2917 = null;
   }

   @OriginalMember(
      owner = "client!p",
      name = "K",
      descriptor = "(IIIIII)V"
   )
   private final native void method1720(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!p",
      name = "sa",
      descriptor = "(Loa;Ljava/awt/Canvas;II)V"
   )
   private final native void method1722(class722 arg0, Canvas arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!p",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method134(boolean arg0);

   @OriginalMember(
      owner = "client!p",
      name = "oa",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   private final native void method1723(Canvas arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!p",
      name = "H",
      descriptor = "(IIII)V"
   )
   private final native void method1726(int arg0, int arg1, int arg2, int arg3);
}
