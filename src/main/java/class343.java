import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class343 {
   @OriginalMember(
      owner = "client!iba",
      name = "d",
      descriptor = "Z"
   )
   private boolean field5210 = false;
   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "[I"
   )
   private int[] field5207 = new int[4];
   @OriginalMember(
      owner = "client!iba",
      name = "g",
      descriptor = "[Ljq;"
   )
   private class672[] field5208;
   @OriginalMember(
      owner = "client!iba",
      name = "h",
      descriptor = "[I"
   )
   private int[] field5212;
   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5214 = new String[]{method2776(method2775("\u007f#\u0002.<C/\r9")), method2776(method2775("v\u0004-\u001c\u001cq\u0001&\u0011\u0013|\n#\u0016\u0016g\u0017<\u000b\rb\u00109\u0000\u0000m'\f;=R \t00]-\u000257X6\u001f**C3\u0018/!N<^ik\u0004r[nn\u000f\u007fOzú\u0013c0~s\u001foC\u0007d\u001c\u001d\u0015\u0005$\f|I\u0018zIjRvg\u0018y2$yó\u008d¡\u008e\u0085Ó\u00ad\u0081®¥È\u0099¯\u0098\u0090ÿ\u008b¢\u008b\u008bí\u009f\u008f¸°ß«\u0082««Í¿¬\u0092\u0097ã\u009d\u008c²·Ã½¨¾ºô³»¿\u009e"))};
   @OriginalMember(
      owner = "client!iba",
      name = "e",
      descriptor = "I"
   )
   private static int field5211 = field5214[1].length();
   @OriginalMember(
      owner = "client!iba",
      name = "b",
      descriptor = "[I"
   )
   private static int[] field5213 = new int[256];
   @OriginalMember(
      owner = "client!iba",
      name = "c",
      descriptor = "I"
   )
   private int field5206;
   @OriginalMember(
      owner = "client!iba",
      name = "f",
      descriptor = "I"
   )
   private int field5209;

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = field5214[1].indexOf(var0);
         if (var1 == -1) {
            var1 = 74;
         }

         field5213[var0] = var1;
      }

   }

   @OriginalMember(
      owner = "client!iba",
      name = "b",
      descriptor = "()I",
      line = 4
   )
   public final int method2768() {
      return this.field5209 - 1;
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(Lha;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V",
      line = 10
   )
   private final void method2769(class610 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
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
      Image var12 = class544.field8183.createImage(var7, var10);
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

      this.field5206 = var9 - var17;
      this.field5209 = var11;
      this.field5212[arg4] = var8;
      this.field5208[arg4] = arg0.method4494((byte)79, var10, var7, var7, 0, var14);
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(Lha;Ljava/lang/String;IIIZ)V",
      line = 100
   )
   public final void method2770(class610 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
      int var7 = this.method2773(arg1) / 2;
      arg0.method626(this.field5207);
      if (arg2 - var7 <= this.field5207[2]) {
         if (arg2 + var7 >= this.field5207[0]) {
            if (arg3 - this.field5206 <= this.field5207[3]) {
               if (this.field5209 + arg3 >= this.field5207[1]) {
                  this.method2772(arg0, arg1, this.field5207, arg2 - var7, arg3, arg4, arg5);
               }
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "()I",
      line = 117
   )
   public final int method2771() {
      return this.field5206;
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(Lha;Ljava/lang/String;[IIIIZ)V",
      line = 121
   )
   private final void method2772(class610 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
      if (arg5 == 0) {
         arg6 = false;
      }

      int var8 = arg5 | -16777216;

      for(int var9 = 0; var9 < arg1.length(); ++var9) {
         int var10 = field5213[arg1.charAt(var9)];
         if (arg6) {
            this.field5208[var10].method938(arg3 + 1, arg4 + 1, 0, -16777216, 1);
         }

         this.field5208[var10].method938(arg3, arg4, 0, var8, 1);
         arg3 += this.field5212[var10];
      }

   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(Ljava/lang/String;)I",
      line = 145
   )
   public final int method2773(String arg0) {
      int var2 = 0;

      for(int var3 = 0; var3 < arg0.length(); ++var3) {
         int var4 = field5213[arg0.charAt(var3)];
         var2 += this.field5212[var4];
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!iba",
      name = "<init>",
      descriptor = "(Lha;IZLjava/awt/Component;)V",
      line = 169
   )
   public class343(class610 arg0, int arg1, boolean arg2, Component arg3) {
      this.field5210 = false;
      this.field5208 = new class672[256];
      this.field5212 = new int[256];
      Font var5 = new Font(field5214[0], arg2 ? 1 : 0, arg1);
      FontMetrics var6 = arg3.getFontMetrics(var5);

      for(int var7 = 0; var7 < field5211; ++var7) {
         this.method2769(arg0, var5, var6, field5214[1].charAt(var7), var7, false);
      }

      if (arg2 && this.field5210) {
         this.field5210 = false;
         Font var8 = new Font(field5214[0], 0, arg1);
         FontMetrics var9 = arg3.getFontMetrics(var8);

         for(int var10 = 0; var10 < field5211; ++var10) {
            this.method2769(arg0, var8, var9, field5214[1].charAt(var10), var10, false);
         }

         if (!this.field5210) {
            this.field5210 = false;

            for(int var11 = 0; var11 < field5211; ++var11) {
               this.method2769(arg0, var8, var9, field5214[1].charAt(var11), var11, true);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!iba",
      name = "c",
      descriptor = "()V",
      line = 167
   )
   public static void method2774() {
      field5213 = null;
   }

   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2775(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2776(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
