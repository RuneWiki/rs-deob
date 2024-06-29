import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class297 {
   @OriginalMember(
      owner = "client!sm",
      name = "b",
      descriptor = "Z"
   )
   private boolean field4156 = false;
   @OriginalMember(
      owner = "client!sm",
      name = "g",
      descriptor = "[I"
   )
   private int[] field4158 = new int[4];
   @OriginalMember(
      owner = "client!sm",
      name = "c",
      descriptor = "[Ltd;"
   )
   private class476[] field4157;
   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "[I"
   )
   private int[] field4160;
   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4164 = new String[]{method2323(method2322(" Y\u0003#_'\\\b.P*W\r)U1J\u00124N4M\u0017?C;z\"\u0004~\u0004}'\u000fs\u000bp,\nt\u000ek1\u0015i\u0015n6\u0010b\u0018apV(R/uQ-Y\"aE¹E>\u001eA0I2m8'J@;:gZ!g'9\u001f7|I$N$\u001c\u001b:¥Ð\u008f±Æ\u0085ð¯\u0091æ\u009eÄ\u0081§Ó©Ö\u008c´È»Â¡\u0087ó\u0089ö¬\u0094è\u009bâ\u0082\u00adÔµÀ¢\u008dô\u0095à\u0086\u0081ù¢î\u0095\u0080Ý")), method2323(method2322(")~,\u0011\u007f\u0015r#\u0006"))};
   @OriginalMember(
      owner = "client!sm",
      name = "f",
      descriptor = "I"
   )
   private static int field4162 = field4164[0].length();
   @OriginalMember(
      owner = "client!sm",
      name = "d",
      descriptor = "[I"
   )
   private static int[] field4163 = new int[256];
   @OriginalMember(
      owner = "client!sm",
      name = "h",
      descriptor = "I"
   )
   private int field4159;
   @OriginalMember(
      owner = "client!sm",
      name = "e",
      descriptor = "I"
   )
   private int field4161;

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "()V"
   )
   public static void method2315() {
      field4163 = null;
   }

   @OriginalMember(
      owner = "client!sm",
      name = "c",
      descriptor = "()I"
   )
   public final int method2316() {
      return this.field4159;
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(Lha;Ljava/lang/String;[IIIIZ)V"
   )
   private final void method2317(class65 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
      if (arg5 == 0) {
         arg6 = false;
      }

      int var8 = arg5 | -16777216;

      for(int var9 = 0; var9 < arg1.length(); ++var9) {
         int var10 = field4163[arg1.charAt(var9)];
         if (arg6) {
            this.field4157[var10].method1055(arg3 + 1, arg4 + 1, 0, -16777216, 1);
         }

         this.field4157[var10].method1055(arg3, arg4, 0, var8, 1);
         arg3 += this.field4160[var10];
      }

   }

   @OriginalMember(
      owner = "client!sm",
      name = "<init>",
      descriptor = "(Lha;IZLjava/awt/Component;)V"
   )
   public class297(class65 arg0, int arg1, boolean arg2, Component arg3) {
      this.field4156 = false;
      this.field4157 = new class476[256];
      this.field4160 = new int[256];
      Font var5 = new Font(field4164[1], arg2 ? 1 : 0, arg1);
      FontMetrics var6 = arg3.getFontMetrics(var5);

      for(int var7 = 0; var7 < field4162; ++var7) {
         this.method2321(arg0, var5, var6, field4164[0].charAt(var7), var7, false);
      }

      if (arg2 && this.field4156) {
         this.field4156 = false;
         Font var8 = new Font(field4164[1], 0, arg1);
         FontMetrics var9 = arg3.getFontMetrics(var8);

         for(int var10 = 0; var10 < field4162; ++var10) {
            this.method2321(arg0, var8, var9, field4164[0].charAt(var10), var10, false);
         }

         if (!this.field4156) {
            this.field4156 = false;

            for(int var11 = 0; var11 < field4162; ++var11) {
               this.method2321(arg0, var8, var9, field4164[0].charAt(var11), var11, true);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(Ljava/lang/String;)I"
   )
   public final int method2318(String arg0) {
      int var2 = 0;

      for(int var3 = 0; var3 < arg0.length(); ++var3) {
         int var4 = field4163[arg0.charAt(var3)];
         var2 += this.field4160[var4];
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!sm",
      name = "b",
      descriptor = "()I"
   )
   public final int method2319() {
      return this.field4161 - 1;
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(Lha;Ljava/lang/String;IIIZ)V"
   )
   public final void method2320(class65 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
      int var7 = this.method2318(arg1) / 2;
      arg0.method254(this.field4158);
      if (arg2 - var7 <= this.field4158[2]) {
         if (arg2 + var7 >= this.field4158[0]) {
            if (arg3 - this.field4159 <= this.field4158[3]) {
               if (this.field4161 + arg3 >= this.field4158[1]) {
                  this.method2317(arg0, arg1, this.field4158, arg2 - var7, arg3, arg4, arg5);
               }
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(Lha;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V"
   )
   private final void method2321(class65 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
      int var7 = arg2.charWidth(arg3);
      int var8 = var7;
      if (arg5) {
         try {
            if (arg3 == '/') {
               arg5 = false;
            }

            if (arg3 == 'f' || arg3 == 't' || arg3 == 'w' || arg3 == 'v' || arg3 == 'k' || arg3 == 'x' || arg3 == 'y' || arg3 == 'A' || arg3 == 'V' || arg3 == 'W') {
               ++var7;
            }
         } catch (Exception var23) {
         }
      }

      int var9 = arg2.getMaxAscent();
      int var10 = arg2.getMaxAscent() + arg2.getMaxDescent();
      int var11 = arg2.getHeight();
      Image var12 = class386.field5692.createImage(var7, var10);
      Graphics var13 = var12.getGraphics();
      var13.setColor(Color.black);
      var13.fillRect(0, 0, var7, var10);
      var13.setColor(Color.white);
      var13.setFont(arg1);
      var13.drawString(String.valueOf(arg3), 0, var9);
      if (arg5) {
         var13.drawString(String.valueOf(arg3), 1, var9);
      }

      int[] var14 = new int[var7 * var10];
      PixelGrabber var15 = new PixelGrabber(var12, 0, 0, var7, var10, var14, 0, var7);

      try {
         var15.grabPixels();
      } catch (Exception var22) {
      }

      var12.flush();
      Object var16 = null;
      int var17 = 0;

      label75:
      for(int var18 = 0; var18 < var10; ++var18) {
         for(int var19 = 0; var19 < var7; ++var19) {
            int var20 = var14[var7 * var18 + var19];
            if ((var20 & 16777215) != 0) {
               var17 = var18;
               break label75;
            }
         }
      }

      for(int var21 = 0; var21 < var14.length; ++var21) {
         if ((var14[var21] & 16777215) == 0) {
            var14[var21] = 0;
         }
      }

      this.field4159 = var9 - var17;
      this.field4161 = var11;
      this.field4160[arg4] = var8;
      this.field4157[arg4] = arg0.method696(var10, var7, 0, -71, var7, var14);
   }

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = field4164[0].indexOf(var0);
         if (var1 == -1) {
            var1 = 74;
         }

         field4163[var0] = var1;
      }

   }

   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2322(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2323(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
