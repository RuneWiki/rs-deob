import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class84 {
   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "[I"
   )
   private int[] field1090 = new int[4];
   @OriginalMember(
      owner = "client!dha",
      name = "h",
      descriptor = "Z"
   )
   private boolean field1093 = false;
   @OriginalMember(
      owner = "client!dha",
      name = "f",
      descriptor = "[Lbo;"
   )
   private class763[] field1094;
   @OriginalMember(
      owner = "client!dha",
      name = "e",
      descriptor = "[I"
   )
   private int[] field1092;
   @OriginalMember(
      owner = "client!dha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1096 = new String[]{method827(method826("0\u0018\r7\u001d\f\u0014\u0002 ")), method827(method826("9?\"\u0005=>:)\b231,\u000f7(,3\u0012,-+6\u0019!\"\u001c\u0003\"\u001c\u001d\u001b\u0006)\u0011\u0012\u0016\r,\u0016\u0017\r\u00103\u000b\f\b\u00176\u0000\u0001\u0007QpJKITwO@D@cÛ\\X?gRPTL\u001eES&\u001a\u001c\u0005CGF\u0001[\u0006Q]oFWB==X¼¶®\u0097¤\u009c\u0096\u008e·\u0084\u0087¢ \u0081±°°\u00ad\u0092ª¢¤\u0080¡\u0091\u0090\u0090\u008d²\u008a\u0082\u0084£\u008b¶¬¦\u0083«\u0096\u008c\u0086§§\u009b»\u0088´¦¿"))};
   @OriginalMember(
      owner = "client!dha",
      name = "c",
      descriptor = "I"
   )
   private static int field1091 = field1096[1].length();
   @OriginalMember(
      owner = "client!dha",
      name = "d",
      descriptor = "[I"
   )
   private static int[] field1095 = new int[256];
   @OriginalMember(
      owner = "client!dha",
      name = "g",
      descriptor = "I"
   )
   private int field1088;
   @OriginalMember(
      owner = "client!dha",
      name = "b",
      descriptor = "I"
   )
   private int field1089;

   @OriginalMember(
      owner = "client!dha",
      name = "c",
      descriptor = "()V"
   )
   public static void method819() {
      field1095 = null;
   }

   @OriginalMember(
      owner = "client!dha",
      name = "b",
      descriptor = "()I"
   )
   public final int method820() {
      return this.field1089;
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(Lha;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V"
   )
   private final void method821(class65 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
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
      Image var12 = class204.field2515.createImage(var7, var10);
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

      this.field1089 = var9 - var17;
      this.field1088 = var11;
      this.field1092[arg4] = var8;
      this.field1094[arg4] = arg0.method525(var7, var14, var10, var7, 0, 0);
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(Lha;Ljava/lang/String;IIIZ)V"
   )
   public final void method822(class65 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
      int var7 = this.method823(arg1) / 2;
      arg0.method582(this.field1090);
      if (arg2 - var7 <= this.field1090[2]) {
         if (arg2 + var7 >= this.field1090[0]) {
            if (arg3 - this.field1089 <= this.field1090[3]) {
               if (this.field1088 + arg3 >= this.field1090[1]) {
                  this.method824(arg0, arg1, this.field1090, arg2 - var7, arg3, arg4, arg5);
               }
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(Ljava/lang/String;)I"
   )
   public final int method823(String arg0) {
      int var2 = 0;

      for(int var3 = 0; var3 < arg0.length(); ++var3) {
         int var4 = field1095[arg0.charAt(var3)];
         var2 += this.field1092[var4];
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(Lha;Ljava/lang/String;[IIIIZ)V"
   )
   private final void method824(class65 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
      if (arg5 == 0) {
         arg6 = false;
      }

      int var8 = arg5 | -16777216;

      for(int var9 = 0; var9 < arg1.length(); ++var9) {
         int var10 = field1095[arg1.charAt(var9)];
         if (arg6) {
            this.field1094[var10].method1631(arg3 + 1, arg4 + 1, 0, -16777216, 1);
         }

         this.field1094[var10].method1631(arg3, arg4, 0, var8, 1);
         arg3 += this.field1092[var10];
      }

   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "()I"
   )
   public final int method825() {
      return this.field1088 - 1;
   }

   @OriginalMember(
      owner = "client!dha",
      name = "<init>",
      descriptor = "(Lha;IZLjava/awt/Component;)V"
   )
   public class84(class65 arg0, int arg1, boolean arg2, Component arg3) {
      this.field1093 = false;
      this.field1094 = new class763[256];
      this.field1092 = new int[256];
      Font var5 = new Font(field1096[0], arg2 ? 1 : 0, arg1);
      FontMetrics var6 = arg3.getFontMetrics(var5);

      for(int var7 = 0; var7 < field1091; ++var7) {
         this.method821(arg0, var5, var6, field1096[1].charAt(var7), var7, false);
      }

      if (arg2 && this.field1093) {
         this.field1093 = false;
         Font var8 = new Font(field1096[0], 0, arg1);
         FontMetrics var9 = arg3.getFontMetrics(var8);

         for(int var10 = 0; var10 < field1091; ++var10) {
            this.method821(arg0, var8, var9, field1096[1].charAt(var10), var10, false);
         }

         if (!this.field1093) {
            this.field1093 = false;

            for(int var11 = 0; var11 < field1091; ++var11) {
               this.method821(arg0, var8, var9, field1096[1].charAt(var11), var11, true);
            }
         }
      }

   }

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = field1096[1].indexOf(var0);
         if (var1 == -1) {
            var1 = 74;
         }

         field1095[var0] = var1;
      }

   }

   @OriginalMember(
      owner = "client!dha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method826(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method827(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
