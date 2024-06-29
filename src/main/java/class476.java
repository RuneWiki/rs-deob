import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class476 {
   @OriginalMember(
      owner = "client!ci",
      name = "c",
      descriptor = "Z"
   )
   private boolean field6839 = false;
   @OriginalMember(
      owner = "client!ci",
      name = "b",
      descriptor = "[I"
   )
   private int[] field6841 = new int[4];
   @OriginalMember(
      owner = "client!ci",
      name = "h",
      descriptor = "[Lbg;"
   )
   private class492[] field6843;
   @OriginalMember(
      owner = "client!ci",
      name = "e",
      descriptor = "[I"
   )
   private int[] field6842;
   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6846 = new String[]{method3468(method3467("5\u000e-\u0016\u0016\t\u0002\"\u0001")), method3468(method3467("<)\u0002$6;,\t)96'\f.<-:\u00133'(=\u00168*'\n#\u0003\u0017\u0018\r&\b\u001a\u0017\u0000-\r\u001d\u0012\u001b0\u0012\u0000\t\u001e7\u0017\u000b\u0004\u0011qQAN_tVDER`BÐYN\u001fFYUBl?NV0:=\u000eFQf P\u0003G}NMRT\u001d\u001cS¹ \u008e¶¯\u0099\u0080®\u0096\u008f\u0082´\u0080 ºµ¦\u008d³¡§² \u0080\u009a\u0095\u0086\u00ad\u0093\u0081\u0087\u0092\u0083ª½©°£\u008a\u009d\u0089\u0090\u0087\u0086\u0090¾\u009e\u0094\u0087´"))};
   @OriginalMember(
      owner = "client!ci",
      name = "f",
      descriptor = "I"
   )
   private static int field6844 = field6846[1].length();
   @OriginalMember(
      owner = "client!ci",
      name = "g",
      descriptor = "[I"
   )
   private static int[] field6845 = new int[256];
   @OriginalMember(
      owner = "client!ci",
      name = "d",
      descriptor = "I"
   )
   private int field6838;
   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "I"
   )
   private int field6840;

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = field6846[1].indexOf(var0);
         if (var1 == -1) {
            var1 = 74;
         }

         field6845[var0] = var1;
      }

   }

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "(Lha;Ljava/lang/String;IIIZ)V",
      line = 4
   )
   public final void method3460(class66 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
      int var7 = this.method3461(arg1) / 2;
      arg0.method605(this.field6841);
      if (arg2 - var7 <= this.field6841[2]) {
         if (arg2 + var7 >= this.field6841[0]) {
            if (arg3 - this.field6838 <= this.field6841[3]) {
               if (this.field6840 + arg3 >= this.field6841[1]) {
                  this.method3462(arg0, arg1, this.field6841, arg2 - var7, arg3, arg4, arg5);
               }
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "(Ljava/lang/String;)I",
      line = 22
   )
   public final int method3461(String arg0) {
      int var2 = 0;

      for(int var3 = 0; var3 < arg0.length(); ++var3) {
         int var4 = field6845[arg0.charAt(var3)];
         var2 += this.field6842[var4];
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "(Lha;Ljava/lang/String;[IIIIZ)V",
      line = 39
   )
   private final void method3462(class66 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
      if (arg5 == 0) {
         arg6 = false;
      }

      int var8 = arg5 | -16777216;

      for(int var9 = 0; var9 < arg1.length(); ++var9) {
         int var10 = field6845[arg1.charAt(var9)];
         if (arg6) {
            this.field6843[var10].method429(arg3 + 1, arg4 + 1, 0, -16777216, 1);
         }

         this.field6843[var10].method429(arg3, arg4, 0, var8, 1);
         arg3 += this.field6842[var10];
      }

   }

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "()I",
      line = 61
   )
   public final int method3463() {
      return this.field6840 - 1;
   }

   @OriginalMember(
      owner = "client!ci",
      name = "<init>",
      descriptor = "(Lha;IZLjava/awt/Component;)V",
      line = 172
   )
   public class476(class66 arg0, int arg1, boolean arg2, Component arg3) {
      this.field6839 = false;
      this.field6843 = new class492[256];
      this.field6842 = new int[256];
      Font var5 = new Font(field6846[0], arg2 ? 1 : 0, arg1);
      FontMetrics var6 = arg3.getFontMetrics(var5);

      for(int var7 = 0; var7 < field6844; ++var7) {
         this.method3464(arg0, var5, var6, field6846[1].charAt(var7), var7, false);
      }

      if (arg2 && this.field6839) {
         this.field6839 = false;
         Font var8 = new Font(field6846[0], 0, arg1);
         FontMetrics var9 = arg3.getFontMetrics(var8);

         for(int var10 = 0; var10 < field6844; ++var10) {
            this.method3464(arg0, var8, var9, field6846[1].charAt(var10), var10, false);
         }

         if (!this.field6839) {
            this.field6839 = false;

            for(int var11 = 0; var11 < field6844; ++var11) {
               this.method3464(arg0, var8, var9, field6846[1].charAt(var11), var11, true);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!ci",
      name = "a",
      descriptor = "(Lha;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V",
      line = 71
   )
   private final void method3464(class66 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
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
      Image var12 = class557.field7990.createImage(var7, var10);
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

      this.field6838 = var9 - var17;
      this.field6840 = var11;
      this.field6842[arg4] = var8;
      this.field6843[arg4] = arg0.method548(-19069, var10, var14, var7, var7, 0);
   }

   @OriginalMember(
      owner = "client!ci",
      name = "b",
      descriptor = "()I",
      line = 159
   )
   public final int method3465() {
      return this.field6838;
   }

   @OriginalMember(
      owner = "client!ci",
      name = "c",
      descriptor = "()V",
      line = 162
   )
   public static void method3466() {
      field6845 = null;
   }

   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3467(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ci",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3468(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
