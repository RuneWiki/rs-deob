import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class345 extends class629 implements ImageProducer {
   @OriginalMember(
      owner = "client!qaa",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4745 = new String[]{method2734(method2733("r%\u00013")), method2734(method2733("g~Cq>")), method2734(method2733("m1\fq\u00004")), method2734(method2733("m1\fq1y=\u0002)&_?\u0003,6q5\u001fw")), method2734(method2733("m1\fq\u00024")), method2734(method2733("m1\fq\"x4.0-o%\u0000:14")), method2734(method2733("m1\fq1y!\u0018:0h\u0004\u0002/\u0007s'\u0003\u0013&z$?6$t$?:0y>\tw")), method2734(method2733("m1\fq\u00074")), method2734(method2733("m1\fq*o\u0013\u000210i=\b-k")), method2734(method2733("m1\fq\u00014")), method2734(method2733("m1\fq0h1\u001f+\u0013n?\t* h9\u00021k"))};
   @OriginalMember(
      owner = "client!qaa",
      name = "M",
      descriptor = "I"
   )
   public static int field4734 = 0;
   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "Z"
   )
   public static boolean field4730 = false;
   @OriginalMember(
      owner = "client!qaa",
      name = "D",
      descriptor = "I"
   )
   public static int field4727;
   @OriginalMember(
      owner = "client!qaa",
      name = "w",
      descriptor = "I"
   )
   public static int field4728;
   @OriginalMember(
      owner = "client!qaa",
      name = "C",
      descriptor = "I"
   )
   public static int field4731;
   @OriginalMember(
      owner = "client!qaa",
      name = "K",
      descriptor = "I"
   )
   public static int field4732;
   @OriginalMember(
      owner = "client!qaa",
      name = "A",
      descriptor = "I"
   )
   public static int field4733;
   @OriginalMember(
      owner = "client!qaa",
      name = "G",
      descriptor = "I"
   )
   public static int field4735;
   @OriginalMember(
      owner = "client!qaa",
      name = "y",
      descriptor = "I"
   )
   public static int field4737;
   @OriginalMember(
      owner = "client!qaa",
      name = "J",
      descriptor = "I"
   )
   public static int field4738;
   @OriginalMember(
      owner = "client!qaa",
      name = "F",
      descriptor = "I"
   )
   public static int field4739;
   @OriginalMember(
      owner = "client!qaa",
      name = "L",
      descriptor = "I"
   )
   public static int field4740;
   @OriginalMember(
      owner = "client!qaa",
      name = "x",
      descriptor = "I"
   )
   public static int field4742;
   @OriginalMember(
      owner = "client!qaa",
      name = "E",
      descriptor = "I"
   )
   public static int field4744;
   @OriginalMember(
      owner = "client!qaa",
      name = "I",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field4729;
   @OriginalMember(
      owner = "client!qaa",
      name = "H",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field4743;
   @OriginalMember(
      owner = "client!qaa",
      name = "B",
      descriptor = "Ljava/awt/image/ColorModel;"
   )
   private ColorModel field4741;
   @OriginalMember(
      owner = "client!qaa",
      name = "N",
      descriptor = "Ljava/awt/image/ImageConsumer;"
   )
   private ImageConsumer field4736;

   @OriginalMember(
      owner = "client!qaa",
      name = "addConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final synchronized void addConsumer(ImageConsumer arg0) {
      try {
         this.field4736 = arg0;
         ++field4742;
         arg0.setDimensions(super.field9287, super.field9288);
         arg0.setProperties((Hashtable)null);
         arg0.setColorModel(this.field4741);
         arg0.setHints(14);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4745[5] + (arg0 != null ? field4745[1] : field4745[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "startProduction",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final void startProduction(ImageConsumer arg0) {
      try {
         ++field4737;
         this.addConsumer(arg0);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4745[10] + (arg0 != null ? field4745[1] : field4745[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(ZIIILjava/awt/Graphics;III)V"
   )
   public final void method382(boolean arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5, int arg6, int arg7) {
      try {
         ++field4740;
         this.method2732(arg6, arg0, arg2, arg1, arg3);
         Shape var9 = arg4.getClip();
         arg4.clipRect(arg7, arg5, arg3, arg2);
         arg4.drawImage(this.field4743, -arg1 + arg7, -arg6 + arg5, this.field4729);
         arg4.setClip(var9);
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field4745[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4745[1] : field4745[0]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "b",
      descriptor = "(I)V"
   )
   private final synchronized void method2731(int arg0) {
      try {
         ++field4727;
         if (this.field4736 != null) {
            if (arg0 != 3148) {
               field4731 = -22;
            }

            this.field4736.setPixels(0, 0, super.field9287, super.field9288, this.field4741, super.field9291, 0, super.field9287);
            this.field4736.imageComplete(2);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4745[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(IZILjava/awt/Canvas;)V"
   )
   public final void method381(int arg0, boolean arg1, int arg2, Canvas arg3) {
      try {
         this.field4729 = arg3;
         ++field4739;
         super.field9287 = arg0;
         super.field9288 = arg2;
         super.field9291 = new int[super.field9288 * super.field9287];
         this.field4741 = new DirectColorModel(32, 16711680, 65280, 255);
         this.field4743 = this.field4729.createImage(this);
         this.method2731(3148);
         this.field4729.prepareImage(this.field4743, this.field4729);
         this.method2731(3148);
         this.field4729.prepareImage(this.field4743, this.field4729);
         this.method2731(3148);
         if (!arg1) {
            this.field4729.prepareImage(this.field4743, this.field4729);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4745[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4745[1] : field4745[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "isConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)Z"
   )
   public final synchronized boolean isConsumer(ImageConsumer arg0) {
      try {
         ++field4744;
         return this.field4736 == arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4745[8] + (arg0 != null ? field4745[1] : field4745[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "requestTopDownLeftRightResend",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
      try {
         ++field4728;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4745[6] + (arg0 != null ? field4745[1] : field4745[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(IZIII)V"
   )
   private final synchronized void method2732(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg1) {
            this.startProduction((ImageConsumer)null);
         }

         ++field4738;
         if (this.field4736 != null) {
            this.field4736.setPixels(arg3, arg0, arg4, arg2, this.field4741, super.field9291, super.field9287 * arg0 + arg3, super.field9287);
            this.field4736.imageComplete(2);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field4745[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "removeConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final synchronized void removeConsumer(ImageConsumer arg0) {
      try {
         ++field4732;
         if (this.field4736 == arg0) {
            this.field4736 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4745[3] + (arg0 != null ? field4745[1] : field4745[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2733(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2734(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
