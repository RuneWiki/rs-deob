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

@OriginalClass("client!fq")
public class class215 extends class224 implements ImageProducer {
   @OriginalMember(
      owner = "client!fq",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3084 = new String[]{method1704(method1703("j\u001eQK%")), method1704(method1703("j\u001eQcih,\u0010l~y\u0002\u001ap%")), method1704(method1703("wAQ,p")), method1704(method1703("b\u001a\u0013n")), method1704(method1703("j\u001eQJ%")), method1704(method1703("j\u001eQD%")), method1704(method1703("j\u001eQpha\u0000\tgNc\u0001\fw`i\u001dW")), method1704(method1703("j\u001eQph}\u001a\u001aqyX\u0000\u000fFb{\u00013gkx=\u0016eex=\u001aqhb\u000bW")), method1704(method1703("j\u001eQ@%")), method1704(method1703("j\u001eQC%")), method1704(method1703("j\u001eQk~O\u0000\u0011qxa\n\r*")), method1704(method1703("j\u001eQqym\u001d\u000bR\u007fc\u000b\naye\u0000\u0011*")), method1704(method1703("j\u001eQE%"))};
   @OriginalMember(
      owner = "client!fq",
      name = "E",
      descriptor = "I"
   )
   public static int field3081 = 0;
   @OriginalMember(
      owner = "client!fq",
      name = "G",
      descriptor = "I"
   )
   public static int field3068;
   @OriginalMember(
      owner = "client!fq",
      name = "J",
      descriptor = "I"
   )
   public static int field3069;
   @OriginalMember(
      owner = "client!fq",
      name = "K",
      descriptor = "I"
   )
   public static int field3070;
   @OriginalMember(
      owner = "client!fq",
      name = "x",
      descriptor = "I"
   )
   public static int field3071;
   @OriginalMember(
      owner = "client!fq",
      name = "y",
      descriptor = "I"
   )
   public static int field3073;
   @OriginalMember(
      owner = "client!fq",
      name = "C",
      descriptor = "I"
   )
   public static int field3074;
   @OriginalMember(
      owner = "client!fq",
      name = "H",
      descriptor = "I"
   )
   public static int field3077;
   @OriginalMember(
      owner = "client!fq",
      name = "L",
      descriptor = "I"
   )
   public static int field3078;
   @OriginalMember(
      owner = "client!fq",
      name = "B",
      descriptor = "I"
   )
   public static int field3082;
   @OriginalMember(
      owner = "client!fq",
      name = "I",
      descriptor = "I"
   )
   public static int field3083;
   @OriginalMember(
      owner = "client!fq",
      name = "F",
      descriptor = "Lda;"
   )
   public static class67 field3075;
   @OriginalMember(
      owner = "client!fq",
      name = "z",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field3072;
   @OriginalMember(
      owner = "client!fq",
      name = "w",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field3080;
   @OriginalMember(
      owner = "client!fq",
      name = "M",
      descriptor = "Ljava/awt/image/ColorModel;"
   )
   private ColorModel field3076;
   @OriginalMember(
      owner = "client!fq",
      name = "D",
      descriptor = "Ljava/awt/image/ImageConsumer;"
   )
   private ImageConsumer field3079;

   @OriginalMember(
      owner = "client!fq",
      name = "c",
      descriptor = "(I)V",
      line = 10
   )
   private final synchronized void method1697(int arg0) {
      try {
         ++field3069;
         if (this.field3079 != null) {
            this.field3079.setPixels(0, 0, super.field3197, super.field3192, this.field3076, super.field3196, 0, super.field3197);
            this.field3079.imageComplete(arg0);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3084[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "removeConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V",
      line = 24
   )
   public final synchronized void removeConsumer(ImageConsumer arg0) {
      try {
         if (this.field3079 == arg0) {
            this.field3079 = null;
         }

         ++field3073;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3084[6] + (arg0 != null ? field3084[2] : field3084[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "requestTopDownLeftRightResend",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V",
      line = 34
   )
   public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
      try {
         ++field3068;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3084[7] + (arg0 != null ? field3084[2] : field3084[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(BIILjava/awt/Canvas;)V",
      line = 42
   )
   public final void method1698(byte arg0, int arg1, int arg2, Canvas arg3) {
      try {
         super.field3197 = arg2;
         super.field3192 = arg1;
         this.field3072 = arg3;
         ++field3070;
         super.field3196 = new int[super.field3197 * super.field3192];
         this.field3076 = new DirectColorModel(32, 16711680, 65280, 255);
         this.field3080 = this.field3072.createImage(this);
         if (arg0 > -57) {
            this.field3076 = null;
         }

         this.method1697(2);
         this.field3072.prepareImage(this.field3080, this.field3072);
         this.method1697(2);
         this.field3072.prepareImage(this.field3080, this.field3072);
         this.method1697(2);
         this.field3072.prepareImage(this.field3080, this.field3072);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field3084[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3084[2] : field3084[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "d",
      descriptor = "(I)V",
      line = 66
   )
   public static void method1699(int arg0) {
      try {
         if (arg0 != 65280) {
            method1701(-53, true, (String)null);
         }

         field3075 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3084[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(Ljava/awt/Graphics;IIIIIII)V",
      line = 77
   )
   public final void method1700(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field3083;
         int var9 = -82 % ((arg1 - 62) / 48);
         this.method1702(arg5, arg2, arg7, -597, arg3);
         Shape var10 = arg0.getClip();
         arg0.clipRect(arg6, arg4, arg3, arg7);
         arg0.drawImage(this.field3080, -arg5 + arg6, arg4 - arg2, this.field3072);
         arg0.setClip(var10);
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field3084[8] + (arg0 != null ? field3084[2] : field3084[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "isConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)Z",
      line = 95
   )
   public final synchronized boolean isConsumer(ImageConsumer arg0) {
      try {
         ++field3078;
         return this.field3079 == arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3084[10] + (arg0 != null ? field3084[2] : field3084[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(IZLjava/lang/String;)V",
      line = 107
   )
   public static final void method1701(int arg0, boolean arg1, String arg2) {
      try {
         ++field3074;
         if (!arg1) {
            field3081 = -62;
         }

         class755 var3 = class317.method2325((long)arg0, 113, 2);
         var3.method5479(1288);
         var3.field11186 = arg2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field3084[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3084[2] : field3084[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "addConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V",
      line = 121
   )
   public final synchronized void addConsumer(ImageConsumer arg0) {
      try {
         this.field3079 = arg0;
         ++field3077;
         arg0.setDimensions(super.field3197, super.field3192);
         arg0.setProperties((Hashtable)null);
         arg0.setColorModel(this.field3076);
         arg0.setHints(14);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3084[1] + (arg0 != null ? field3084[2] : field3084[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(IIIII)V",
      line = 135
   )
   private final synchronized void method1702(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg3 == -597) {
            ++field3082;
            if (this.field3079 != null) {
               this.field3079.setPixels(arg0, arg1, arg4, arg2, this.field3076, super.field3196, super.field3197 * arg1 + arg0, super.field3197);
               this.field3079.imageComplete(2);
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field3084[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "startProduction",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V",
      line = 152
   )
   public final void startProduction(ImageConsumer arg0) {
      try {
         this.addConsumer(arg0);
         ++field3071;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3084[11] + (arg0 != null ? field3084[2] : field3084[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1703(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1704(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
