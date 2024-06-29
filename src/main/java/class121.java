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

@OriginalClass("client!vea")
public class class121 extends class633 implements ImageProducer {
   @OriginalMember(
      owner = "client!vea",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1957 = new String[]{method1199(method1198("\u0010:R\\!\u0002;p\u001d.\u0015*^\u00172N")), method1199(method1198("\u001dq\u001d\\=")), method1199(method1198("\b*_\u001e")), method1199(method1198("\u0010:R\\3\u0012>A\u0006\u0010\u00140W\u0007#\u00126\\\u001ch")), method1199(method1198("\u0010:R\\2\u0003.F\u00173\u0012\u000b\\\u0002\u0004\t(]>%\u0000+a\u001b'\u000e+a\u00173\u00031WZ")), method1199(method1198("\u0010:R\\\u0002N")), method1199(method1198("\u0010:R\\\u0007N")), method1199(method1198("\u0010:R\\\tN")), method1199(method1198("\u0010:R\\)\u0015\u001c\\\u001c3\u00132V\u0000h")), method1199(method1198("\u0010:R\\2\u00032\\\u0004%%0]\u00015\u000b:AZ")), method1199(method1198("\u0010:R\\\bN")), method1199(method1198("\u0010:R\\\u0006N"))};
   @OriginalMember(
      owner = "client!vea",
      name = "A",
      descriptor = "Lhha;"
   )
   public static class724 field1945 = new class724(55, 3);
   @OriginalMember(
      owner = "client!vea",
      name = "u",
      descriptor = "Lhha;"
   )
   public static class724 field1952 = new class724(2, -2);
   @OriginalMember(
      owner = "client!vea",
      name = "F",
      descriptor = "I"
   )
   public static int field1956 = 0;
   @OriginalMember(
      owner = "client!vea",
      name = "C",
      descriptor = "I"
   )
   public static int field1939;
   @OriginalMember(
      owner = "client!vea",
      name = "K",
      descriptor = "I"
   )
   public static int field1941;
   @OriginalMember(
      owner = "client!vea",
      name = "J",
      descriptor = "I"
   )
   public static int field1942;
   @OriginalMember(
      owner = "client!vea",
      name = "L",
      descriptor = "I"
   )
   public static int field1946;
   @OriginalMember(
      owner = "client!vea",
      name = "D",
      descriptor = "I"
   )
   public static int field1947;
   @OriginalMember(
      owner = "client!vea",
      name = "v",
      descriptor = "I"
   )
   public static int field1948;
   @OriginalMember(
      owner = "client!vea",
      name = "G",
      descriptor = "I"
   )
   public static int field1949;
   @OriginalMember(
      owner = "client!vea",
      name = "H",
      descriptor = "I"
   )
   public static int field1950;
   @OriginalMember(
      owner = "client!vea",
      name = "E",
      descriptor = "I"
   )
   public static int field1951;
   @OriginalMember(
      owner = "client!vea",
      name = "w",
      descriptor = "I"
   )
   public static int field1953;
   @OriginalMember(
      owner = "client!vea",
      name = "y",
      descriptor = "Lsa;"
   )
   public static class39 field1955;
   @OriginalMember(
      owner = "client!vea",
      name = "I",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field1944;
   @OriginalMember(
      owner = "client!vea",
      name = "z",
      descriptor = "Ljava/awt/Image;"
   )
   private Image field1943;
   @OriginalMember(
      owner = "client!vea",
      name = "B",
      descriptor = "Ljava/awt/image/ColorModel;"
   )
   private ColorModel field1954;
   @OriginalMember(
      owner = "client!vea",
      name = "x",
      descriptor = "Ljava/awt/image/ImageConsumer;"
   )
   private ImageConsumer field1940;

   @OriginalMember(
      owner = "client!vea",
      name = "requestTopDownLeftRightResend",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
      try {
         ++field1941;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1957[4] + (arg0 != null ? field1957[1] : field1957[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "startProduction",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final void startProduction(ImageConsumer arg0) {
      try {
         ++field1953;
         this.addConsumer(arg0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1957[3] + (arg0 != null ? field1957[1] : field1957[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "removeConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final synchronized void removeConsumer(ImageConsumer arg0) {
      try {
         ++field1949;
         if (this.field1940 == arg0) {
            this.field1940 = null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1957[9] + (arg0 != null ? field1957[1] : field1957[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "b",
      descriptor = "(I)V"
   )
   private final synchronized void method1193(int arg0) {
      try {
         ++field1946;
         if (this.field1940 != null) {
            this.field1940.setPixels(0, 0, super.field8979, super.field8983, this.field1954, super.field8975, 0, super.field8979);
            this.field1940.imageComplete(2);
            if (arg0 != 5506) {
               method1197(80);
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1957[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "addConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)V"
   )
   public final synchronized void addConsumer(ImageConsumer arg0) {
      try {
         ++field1942;
         this.field1940 = arg0;
         arg0.setDimensions(super.field8979, super.field8983);
         arg0.setProperties((Hashtable)null);
         arg0.setColorModel(this.field1954);
         arg0.setHints(14);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1957[0] + (arg0 != null ? field1957[1] : field1957[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(ILjava/awt/Graphics;IIIIII)V"
   )
   public final void method1194(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         if (arg6 != 1) {
            this.field1943 = null;
         }

         this.method1195(arg7, arg2, arg4, arg0, 71);
         ++field1951;
         Shape var9 = arg1.getClip();
         arg1.clipRect(arg3, arg5, arg0, arg4);
         arg1.drawImage(this.field1943, -arg2 + arg3, -arg7 + arg5, this.field1944);
         arg1.setClip(var9);
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field1957[5] + arg0 + ',' + (arg1 != null ? field1957[1] : field1957[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(IIIII)V"
   )
   private final synchronized void method1195(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         int var6 = 49 % ((26 - arg4) / 32);
         ++field1948;
         if (this.field1940 != null) {
            this.field1940.setPixels(arg1, arg0, arg3, arg2, this.field1954, super.field8975, super.field8979 * arg0 + arg1, super.field8979);
            this.field1940.imageComplete(2);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1957[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "isConsumer",
      descriptor = "(Ljava/awt/image/ImageConsumer;)Z"
   )
   public final synchronized boolean isConsumer(ImageConsumer arg0) {
      try {
         ++field1947;
         return this.field1940 == arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1957[8] + (arg0 != null ? field1957[1] : field1957[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;II)V"
   )
   public final void method1196(int arg0, Canvas arg1, int arg2, int arg3) {
      try {
         super.field8979 = arg3;
         ++field1950;
         super.field8983 = arg0;
         this.field1944 = arg1;
         super.field8975 = new int[super.field8983 * super.field8979];
         this.field1954 = new DirectColorModel(32, 16711680, 65280, 255);
         this.field1943 = this.field1944.createImage(this);
         if (arg2 != 12) {
            this.addConsumer((ImageConsumer)null);
         }

         this.method1193(5506);
         this.field1944.prepareImage(this.field1943, this.field1944);
         this.method1193(5506);
         this.field1944.prepareImage(this.field1943, this.field1944);
         this.method1193(5506);
         this.field1944.prepareImage(this.field1943, this.field1944);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1957[11] + arg0 + ',' + (arg1 != null ? field1957[1] : field1957[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method1197(int arg0) {
      try {
         field1955 = null;
         field1945 = null;
         int var1 = -82 / ((-83 - arg0) / 42);
         field1952 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1957[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1198(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1199(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
