import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class633 extends class775 {
   @OriginalMember(
      owner = "client!me",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9165 = new String[]{method4632(method4631("O3\u0004^.")), method4632(method4631("Yx\u00042{")), method4632(method4631("O3\u0004].")), method4632(method4631("L#Fp")), method4632(method4631("O3\u0004_.")), method4632(method4631("j3FjcV?I}")), method4632(method4631("O3\u0004X."))};
   @OriginalMember(
      owner = "client!me",
      name = "t",
      descriptor = "Z"
   )
   public static boolean field9158 = false;
   @OriginalMember(
      owner = "client!me",
      name = "z",
      descriptor = "I"
   )
   public static int field9159;
   @OriginalMember(
      owner = "client!me",
      name = "B",
      descriptor = "I"
   )
   public static int field9160;
   @OriginalMember(
      owner = "client!me",
      name = "y",
      descriptor = "I"
   )
   public static int field9161;
   @OriginalMember(
      owner = "client!me",
      name = "x",
      descriptor = "I"
   )
   private int field9162;
   @OriginalMember(
      owner = "client!me",
      name = "A",
      descriptor = "I"
   )
   public static int field9163;
   @OriginalMember(
      owner = "client!me",
      name = "v",
      descriptor = "I"
   )
   public static int field9164;
   @OriginalMember(
      owner = "client!me",
      name = "u",
      descriptor = "Lrr;"
   )
   public static class678 field9156;
   @OriginalMember(
      owner = "client!me",
      name = "C",
      descriptor = "Lrr;"
   )
   public static class678 field9157;
   @OriginalMember(
      owner = "client!me",
      name = "w",
      descriptor = "Ljava/lang/String;"
   )
   private String field9155;

   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "(Ljava/awt/Color;ILjava/awt/Color;Ljava/lang/String;ILjava/awt/Color;)V"
   )
   public static final void method4629(Color arg0, int arg1, Color arg2, String arg3, int arg4, Color arg5) {
      try {
         try {
            Graphics var6 = class544.field8183.getGraphics();
            if (class372.field5764 == null) {
               class372.field5764 = new Font(field9165[5], 1, 13);
            }

            if (arg2 == null) {
               arg2 = new Color(140, 17, 17);
            }

            if (arg0 == null) {
               arg0 = new Color(140, 17, 17);
            }

            if (arg5 == null) {
               arg5 = new Color(255, 255, 255);
            }

            try {
               if (class119.field1653 == null) {
                  class119.field1653 = class544.field8183.createImage(class316.field4878, class692.field10301);
               }

               Graphics var7 = class119.field1653.getGraphics();
               var7.setColor(Color.black);
               var7.fillRect(0, 0, class316.field4878, class692.field10301);
               int var8 = class316.field4878 / 2 - 152;
               int var9 = class692.field10301 / 2 + -18;
               var7.setColor(arg0);
               var7.drawRect(var8, var9, 303, 33);
               var7.setColor(arg2);
               var7.fillRect(var8 + 2, var9 + 2, arg4 * 3, 30);
               var7.setColor(Color.black);
               var7.drawRect(var8 + 1, var9 + 1, 301, 31);
               var7.fillRect(var8 + 2 - -(arg4 * 3), var9 + 2, -(arg1 * arg4) + 300, 30);
               var7.setFont(class372.field5764);
               var7.setColor(arg5);
               var7.drawString(arg3, (-(arg3.length() * 6) + 304) / 2 + var8, var9 + 22);
               if (class149.field2256 != null) {
                  var7.setFont(class372.field5764);
                  var7.setColor(arg5);
                  var7.drawString(class149.field2256, class316.field4878 / 2 + -(6 * class149.field2256.length() / 2), class692.field10301 / 2 + -26);
               }

               var6.drawImage(class119.field1653, 0, 0, (ImageObserver)null);
            } catch (Exception var13) {
               var6.setColor(Color.black);
               var6.fillRect(0, 0, class316.field4878, class692.field10301);
               int var10 = class316.field4878 / 2 + -152;
               int var11 = class692.field10301 / 2 - 18;
               var6.setColor(arg0);
               var6.drawRect(var10, var11, 303, 33);
               var6.setColor(arg2);
               var6.fillRect(var10 + 2, var11 + 2, arg4 * 3, 30);
               var6.setColor(Color.black);
               var6.drawRect(var10 - -1, var11 - -1, 301, 31);
               var6.fillRect(arg4 * 3 + var10 + 2, var11 + 2, -(arg4 * 3) + 300, 30);
               var6.setFont(class372.field5764);
               var6.setColor(arg5);
               if (class149.field2256 != null) {
                  var6.setFont(class372.field5764);
                  var6.setColor(arg5);
                  var6.drawString(class149.field2256, class316.field4878 / 2 + -(class149.field2256.length() * 6 / 2), class692.field10301 / 2 + -26);
               }

               var6.drawString(arg3, var10 + (304 - arg3.length() * 6) / 2, var11 + 22);
            }
         } catch (Exception var14) {
            class544.field8183.repaint();
         }

         ++field9164;
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field9165[6] + (arg0 != null ? field9165[1] : field9165[3]) + ',' + arg1 + ',' + (arg2 != null ? field9165[1] : field9165[3]) + ',' + (arg3 != null ? field9165[1] : field9165[3]) + ',' + arg4 + ',' + (arg5 != null ? field9165[1] : field9165[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4630(int arg0) {
      try {
         if (arg0 == 3) {
            field9157 = null;
            field9156 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9165[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "(Lsda;I)V"
   )
   public final void method1190(class223 arg0, int arg1) {
      try {
         ++field9163;
         int var3 = 80 / ((arg1 - -23) / 45);
         arg0.method1940(this.field9155, -18907, this.field9162);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9165[2] + (arg0 != null ? field9165[1] : field9165[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "(Lica;B)V"
   )
   public final void method1189(class354 arg0, byte arg1) {
      try {
         ++field9159;
         this.field9162 = arg0.method2894(98);
         this.field9155 = arg0.method2843(-1);
         int var3 = -113 / ((-84 - arg1) / 34);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9165[4] + (arg0 != null ? field9165[1] : field9165[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4631(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!me",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4632(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
