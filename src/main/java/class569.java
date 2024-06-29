import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class569 {
   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "[I"
   )
   private int[] field8073 = new int[4];
   @OriginalMember(
      owner = "client!ua",
      name = "b",
      descriptor = "Z"
   )
   private boolean field8072 = false;
   @OriginalMember(
      owner = "client!ua",
      name = "e",
      descriptor = "[Lma;"
   )
   private class148[] field8068;
   @OriginalMember(
      owner = "client!ua",
      name = "f",
      descriptor = "[I"
   )
   private int[] field8069;
   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8076 = new String[]{method4221(method4220("9~?m\u007f\u0005r0z")), method4221(method4220("0Y\u0010__7\\\u001bRP:W\u001eUU!J\u0001HN$M\u0004CC+z1x~\u0014}4ss\u001bp?vt\u001ek\"ii\u0005n%lb\bac*(B/f--I\"r9¹U>\r=0Y2~D'Z@(FgJ!t[9\u000f7o5$^$\u000fg:µÐ\u009cÍÆ\u0095ð¼íæ\u008eÄ\u0092ÛÓ¹Ö\u009fÈÈ«Â²ûó\u0099ö¿èè\u008bâ\u0091ÑÔ¥À±ñô\u0085à\u0095ýù²î\u0086üÝ"))};
   @OriginalMember(
      owner = "client!ua",
      name = "g",
      descriptor = "I"
   )
   private static int field8074 = field8076[1].length();
   @OriginalMember(
      owner = "client!ua",
      name = "d",
      descriptor = "[I"
   )
   private static int[] field8075 = new int[256];
   @OriginalMember(
      owner = "client!ua",
      name = "c",
      descriptor = "I"
   )
   private int field8070;
   @OriginalMember(
      owner = "client!ua",
      name = "h",
      descriptor = "I"
   )
   private int field8071;

   @OriginalMember(
      owner = "client!ua",
      name = "b",
      descriptor = "()I"
   )
   public final int method4213() {
      return this.field8071;
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(Lha;Ljava/lang/String;[IIIIZ)V"
   )
   private final void method4214(class17 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
      if (arg5 == 0) {
         arg6 = false;
      }

      int var8 = arg5 | -16777216;

      for(int var9 = 0; var9 < arg1.length(); ++var9) {
         int var10 = field8075[arg1.charAt(var9)];
         if (arg6) {
            this.field8068[var10].method1352(arg3 + 1, arg4 + 1, 0, -16777216, 1);
         }

         this.field8068[var10].method1352(arg3, arg4, 0, var8, 1);
         arg3 += this.field8069[var10];
      }

   }

   @OriginalMember(
      owner = "client!ua",
      name = "c",
      descriptor = "()I"
   )
   public final int method4215() {
      return this.field8070 - 1;
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(Lha;Ljava/lang/String;IIIZ)V"
   )
   public final void method4216(class17 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
      int var7 = this.method4218(arg1) / 2;
      arg0.method211(this.field8073);
      if (arg2 - var7 <= this.field8073[2]) {
         if (arg2 + var7 >= this.field8073[0]) {
            if (arg3 - this.field8071 <= this.field8073[3]) {
               if (this.field8070 + arg3 >= this.field8073[1]) {
                  this.method4214(arg0, arg1, this.field8073, arg2 - var7, arg3, arg4, arg5);
               }
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(Lha;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V"
   )
   private final void method4217(class17 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
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
      Image var12 = class729.field10389.createImage(var7, var10);
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

      this.field8071 = var9 - var17;
      this.field8070 = var11;
      this.field8069[arg4] = var8;
      this.field8068[arg4] = arg0.method215(var7, var7, var14, var10, 0, 1);
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(Ljava/lang/String;)I"
   )
   public final int method4218(String arg0) {
      int var2 = 0;

      for(int var3 = 0; var3 < arg0.length(); ++var3) {
         int var4 = field8075[arg0.charAt(var3)];
         var2 += this.field8069[var4];
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "()V"
   )
   public static void method4219() {
      field8075 = null;
   }

   @OriginalMember(
      owner = "client!ua",
      name = "<init>",
      descriptor = "(Lha;IZLjava/awt/Component;)V"
   )
   public class569(class17 arg0, int arg1, boolean arg2, Component arg3) {
      this.field8072 = false;
      this.field8068 = new class148[256];
      this.field8069 = new int[256];
      Font var5 = new Font(field8076[0], arg2 ? 1 : 0, arg1);
      FontMetrics var6 = arg3.getFontMetrics(var5);

      for(int var7 = 0; var7 < field8074; ++var7) {
         this.method4217(arg0, var5, var6, field8076[1].charAt(var7), var7, false);
      }

      if (arg2 && this.field8072) {
         this.field8072 = false;
         Font var8 = new Font(field8076[0], 0, arg1);
         FontMetrics var9 = arg3.getFontMetrics(var8);

         for(int var10 = 0; var10 < field8074; ++var10) {
            this.method4217(arg0, var8, var9, field8076[1].charAt(var10), var10, false);
         }

         if (!this.field8072) {
            this.field8072 = false;

            for(int var11 = 0; var11 < field8074; ++var11) {
               this.method4217(arg0, var8, var9, field8076[1].charAt(var11), var11, true);
            }
         }
      }

   }

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = field8076[1].indexOf(var0);
         if (var1 == -1) {
            var1 = 74;
         }

         field8075[var0] = var1;
      }

   }

   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4220(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4221(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
