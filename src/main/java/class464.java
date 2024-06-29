import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class464 {
   @OriginalMember(
      owner = "client!ti",
      name = "d",
      descriptor = "[I"
   )
   private int[] field6974 = new int[4];
   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "Z"
   )
   private boolean field6972 = false;
   @OriginalMember(
      owner = "client!ti",
      name = "h",
      descriptor = "[Lat;"
   )
   private class396[] field6978;
   @OriginalMember(
      owner = "client!ti",
      name = "c",
      descriptor = "[I"
   )
   private int[] field6976;
   @OriginalMember(
      owner = "client!ti",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6979 = new String[]{method3473(method3472("rt\u001f 2Nx\u00107")), method3473(method3472("{S0\u0012\u0012|V;\u001f\u001dq]>\u0018\u0018j@!\u0005\u0003oG$\u000e\u000e`p\u001153_w\u0014>>Pz\u001f;9Ua\u0002$$Nd\u0005!/CkCge\t%F``\u0002(Rtô\u001e4-p}\u00128^\tj\u0011J\b\u000b*\u0001+T\u0016tD=Oxi\u0015./*wþÚ¼\u0080\u008bÞú\u009c «ÅÎ²\u0096\u009eòÜ¿\u0085\u0085àÈ\u0092¶¾Òü\u009f¥¥Àè±\u009c\u0099îÊ\u0091¼¹Îêµ°´ùä¦±\u0090"))};
   @OriginalMember(
      owner = "client!ti",
      name = "g",
      descriptor = "I"
   )
   private static int field6973 = field6979[1].length();
   @OriginalMember(
      owner = "client!ti",
      name = "f",
      descriptor = "[I"
   )
   private static int[] field6977 = new int[256];
   @OriginalMember(
      owner = "client!ti",
      name = "e",
      descriptor = "I"
   )
   private int field6971;
   @OriginalMember(
      owner = "client!ti",
      name = "b",
      descriptor = "I"
   )
   private int field6975;

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(Lha;Ljava/lang/String;IIIZ)V"
   )
   public final void method3465(class66 arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
      int var7 = this.method3471(arg1) / 2;
      arg0.method618(this.field6974);
      if (arg2 - var7 <= this.field6974[2]) {
         if (arg2 + var7 >= this.field6974[0]) {
            if (arg3 - this.field6971 <= this.field6974[3]) {
               if (this.field6975 + arg3 >= this.field6974[1]) {
                  this.method3470(arg0, arg1, this.field6974, arg2 - var7, arg3, arg4, arg5);
               }
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "c",
      descriptor = "()I"
   )
   public final int method3466() {
      return this.field6975 - 1;
   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(Lha;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V"
   )
   private final void method3467(class66 arg0, Font arg1, FontMetrics arg2, char arg3, int arg4, boolean arg5) {
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
      Image var12 = class769.field11271.createImage(var7, var10);
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

      this.field6971 = var9 - var17;
      this.field6975 = var11;
      this.field6976[arg4] = var8;
      this.field6978[arg4] = arg0.method589(var7, 0, 0, var14, var7, var10);
   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "()V"
   )
   public static void method3468() {
      field6977 = null;
   }

   @OriginalMember(
      owner = "client!ti",
      name = "b",
      descriptor = "()I"
   )
   public final int method3469() {
      return this.field6971;
   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(Lha;Ljava/lang/String;[IIIIZ)V"
   )
   private final void method3470(class66 arg0, String arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
      if (arg5 == 0) {
         arg6 = false;
      }

      int var8 = arg5 | -16777216;

      for(int var9 = 0; var9 < arg1.length(); ++var9) {
         int var10 = field6977[arg1.charAt(var9)];
         if (arg6) {
            this.field6978[var10].method264(arg3 + 1, arg4 + 1, 0, -16777216, 1);
         }

         this.field6978[var10].method264(arg3, arg4, 0, var8, 1);
         arg3 += this.field6976[var10];
      }

   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(Ljava/lang/String;)I"
   )
   public final int method3471(String arg0) {
      int var2 = 0;

      for(int var3 = 0; var3 < arg0.length(); ++var3) {
         int var4 = field6977[arg0.charAt(var3)];
         var2 += this.field6976[var4];
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!ti",
      name = "<init>",
      descriptor = "(Lha;IZLjava/awt/Component;)V"
   )
   public class464(class66 arg0, int arg1, boolean arg2, Component arg3) {
      this.field6972 = false;
      this.field6978 = new class396[256];
      this.field6976 = new int[256];
      Font var5 = new Font(field6979[0], arg2 ? 1 : 0, arg1);
      FontMetrics var6 = arg3.getFontMetrics(var5);

      for(int var7 = 0; var7 < field6973; ++var7) {
         this.method3467(arg0, var5, var6, field6979[1].charAt(var7), var7, false);
      }

      if (arg2 && this.field6972) {
         this.field6972 = false;
         Font var8 = new Font(field6979[0], 0, arg1);
         FontMetrics var9 = arg3.getFontMetrics(var8);

         for(int var10 = 0; var10 < field6973; ++var10) {
            this.method3467(arg0, var8, var9, field6979[1].charAt(var10), var10, false);
         }

         if (!this.field6972) {
            this.field6972 = false;

            for(int var11 = 0; var11 < field6973; ++var11) {
               this.method3467(arg0, var8, var9, field6979[1].charAt(var11), var11, true);
            }
         }
      }

   }

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = field6979[1].indexOf(var0);
         if (var1 == -1) {
            var1 = 74;
         }

         field6977[var0] = var1;
      }

   }

   @OriginalMember(
      owner = "client!ti",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3472(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ti",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3473(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
