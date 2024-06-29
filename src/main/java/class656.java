import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class656 {
   @OriginalMember(
      owner = "client!mq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9287 = new String[]{method4787(method4786("\u0003^?\u000e]")), method4787(method4786("\u0015\u0001?a\b")), method4787(method4786("&J}9\u0010\u001aFr.")), method4787(method4786("\u0003^?\r]")), method4787(method4786("\u0000Z}#"))};
   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "Lbga;"
   )
   public static class398 field9285 = new class398(32);
   @OriginalMember(
      owner = "client!mq",
      name = "b",
      descriptor = "I"
   )
   public static int field9286;

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(IILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V"
   )
   public static final void method4784(int arg0, int arg1, Color arg2, Color arg3, Color arg4, String arg5) {
      try {
         ++field9286;

         try {
            Graphics var6 = class729.field10389.getGraphics();
            if (class172.field2578 == null) {
               class172.field2578 = new Font(field9287[2], 1, 13);
            }

            if (arg4 == null) {
               arg4 = new Color(140, 17, 17);
            }

            if (arg0 != 24893) {
               field9285 = null;
            }

            if (arg2 == null) {
               arg2 = new Color(140, 17, 17);
            }

            if (arg3 == null) {
               arg3 = new Color(255, 255, 255);
            }

            try {
               if (class424.field6199 == null) {
                  class424.field6199 = class729.field10389.createImage(class557.field7909, class140.field2243);
               }

               Graphics var7 = class424.field6199.getGraphics();
               var7.setColor(Color.black);
               var7.fillRect(0, 0, class557.field7909, class140.field2243);
               int var8 = class557.field7909 / 2 + -152;
               int var9 = class140.field2243 / 2 + -18;
               var7.setColor(arg2);
               var7.drawRect(var8, var9, 303, 33);
               var7.setColor(arg4);
               var7.fillRect(var8 + 2, var9 - -2, arg1 * 3, 30);
               var7.setColor(Color.black);
               var7.drawRect(var8 + 1, var9 - -1, 301, 31);
               var7.fillRect(var8 - -2 - -(arg1 * 3), var9 - -2, -(arg1 * 3) + 300, 30);
               var7.setFont(class172.field2578);
               var7.setColor(arg3);
               var7.drawString(arg5, var8 + (304 - arg5.length() * 6) / 2, var9 + 22);
               if (class476.field6872 != null) {
                  var7.setFont(class172.field2578);
                  var7.setColor(arg3);
                  var7.drawString(class476.field6872, class557.field7909 / 2 - 6 * class476.field6872.length() / 2, class140.field2243 / 2 + -26);
               }

               var6.drawImage(class424.field6199, 0, 0, (ImageObserver)null);
            } catch (Exception var13) {
               var6.setColor(Color.black);
               var6.fillRect(0, 0, class557.field7909, class140.field2243);
               int var10 = class557.field7909 / 2 + -152;
               int var11 = class140.field2243 / 2 + -18;
               var6.setColor(arg2);
               var6.drawRect(var10, var11, 303, 33);
               var6.setColor(arg4);
               var6.fillRect(var10 + 2, var11 + 2, arg1 * 3, 30);
               var6.setColor(Color.black);
               var6.drawRect(var10 + 1, var11 + 1, 301, 31);
               var6.fillRect(arg1 * 3 + var10 + 2, var11 + 2, 300 - arg1 * 3, 30);
               var6.setFont(class172.field2578);
               var6.setColor(arg3);
               if (class476.field6872 != null) {
                  var6.setFont(class172.field2578);
                  var6.setColor(arg3);
                  var6.drawString(class476.field6872, class557.field7909 / 2 + -(class476.field6872.length() * 6 / 2), class140.field2243 / 2 + -26);
               }

               var6.drawString(arg5, var10 + (-(arg5.length() * 6) + 304) / 2, var11 + 22);
            }
         } catch (Exception var14) {
            class729.field10389.repaint();
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field9287[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9287[1] : field9287[4]) + ',' + (arg3 != null ? field9287[1] : field9287[4]) + ',' + (arg4 != null ? field9287[1] : field9287[4]) + ',' + (arg5 != null ? field9287[1] : field9287[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4785(int arg0) {
      try {
         if (arg0 < 46) {
            field9285 = null;
         }

         field9285 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9287[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4786(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4787(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
