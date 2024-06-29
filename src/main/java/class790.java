import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class790 implements class518 {
   @OriginalMember(
      owner = "client!f",
      name = "b",
      descriptor = "I"
   )
   public int field11585;
   @OriginalMember(
      owner = "client!f",
      name = "p",
      descriptor = "Lkt;"
   )
   public class169 field11587;
   @OriginalMember(
      owner = "client!f",
      name = "n",
      descriptor = "I"
   )
   public int field11594;
   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "I"
   )
   public int field11588;
   @OriginalMember(
      owner = "client!f",
      name = "q",
      descriptor = "I"
   )
   public int field11598;
   @OriginalMember(
      owner = "client!f",
      name = "e",
      descriptor = "I"
   )
   public int field11599;
   @OriginalMember(
      owner = "client!f",
      name = "h",
      descriptor = "I"
   )
   public int field11582;
   @OriginalMember(
      owner = "client!f",
      name = "m",
      descriptor = "Lada;"
   )
   public class175 field11586;
   @OriginalMember(
      owner = "client!f",
      name = "j",
      descriptor = "I"
   )
   public int field11589;
   @OriginalMember(
      owner = "client!f",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   public String field11584;
   @OriginalMember(
      owner = "client!f",
      name = "l",
      descriptor = "I"
   )
   public int field11593;
   @OriginalMember(
      owner = "client!f",
      name = "d",
      descriptor = "I"
   )
   public int field11590;
   @OriginalMember(
      owner = "client!f",
      name = "f",
      descriptor = "I"
   )
   public int field11591;
   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11600 = new String[]{method5705(method5704("SD\u001bh;\\\u001e\u0019)")), method5705(method5704("[\u001fKm")), method5705(method5704("ND\t/(")), method5705(method5704("}\u000fKw0A\u0003D`")), method5705(method5704("SDd)")), method5705(method5704("SDf)")), method5705(method5704("SDe)")), method5705(method5704("SDc)"))};
   @OriginalMember(
      owner = "client!f",
      name = "k",
      descriptor = "Lgca;"
   )
   public static class263 field11583 = new class263(true);
   @OriginalMember(
      owner = "client!f",
      name = "o",
      descriptor = "I"
   )
   public static int field11592;
   @OriginalMember(
      owner = "client!f",
      name = "c",
      descriptor = "I"
   )
   public static int field11595;
   @OriginalMember(
      owner = "client!f",
      name = "g",
      descriptor = "I"
   )
   public static int field11596;
   @OriginalMember(
      owner = "client!f",
      name = "i",
      descriptor = "I"
   )
   public static int field11597;

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(Ljava/awt/Color;Ljava/lang/String;Ljava/awt/Color;ILjava/awt/Color;I)V",
      line = 6
   )
   public static final void method5701(Color arg0, String arg1, Color arg2, int arg3, Color arg4, int arg5) {
      try {
         try {
            Graphics var6 = class557.field7990.getGraphics();
            if (class116.field1444 == null) {
               class116.field1444 = new Font(field11600[3], 1, 13);
            }

            if (arg4 == null) {
               arg4 = new Color(140, 17, 17);
            }

            if (arg2 == null) {
               arg2 = new Color(140, 17, 17);
            }

            int var7 = 25 % ((arg5 - 83) / 34);
            if (arg0 == null) {
               arg0 = new Color(255, 255, 255);
            }

            try {
               if (class385.field5596 == null) {
                  class385.field5596 = class557.field7990.createImage(class237.field3310, class692.field10185);
               }

               Graphics var8 = class385.field5596.getGraphics();
               var8.setColor(Color.black);
               var8.fillRect(0, 0, class237.field3310, class692.field10185);
               int var9 = class237.field3310 / 2 - 152;
               int var10 = class692.field10185 / 2 + -18;
               var8.setColor(arg2);
               var8.drawRect(var9, var10, 303, 33);
               var8.setColor(arg4);
               var8.fillRect(var9 + 2, var10 - -2, arg3 * 3, 30);
               var8.setColor(Color.black);
               var8.drawRect(var9 + 1, var10 + 1, 301, 31);
               var8.fillRect(var9 - (-(arg3 * 3) + -2), var10 - -2, -(arg3 * 3) + 300, 30);
               var8.setFont(class116.field1444);
               var8.setColor(arg0);
               var8.drawString(arg1, (-(arg1.length() * 6) + 304) / 2 + var9, var10 + 22);
               if (class750.field11100 != null) {
                  var8.setFont(class116.field1444);
                  var8.setColor(arg0);
                  var8.drawString(class750.field11100, class237.field3310 / 2 + -(class750.field11100.length() * 6 / 2), class692.field10185 / 2 + -26);
               }

               var6.drawImage(class385.field5596, 0, 0, (ImageObserver)null);
            } catch (Exception var14) {
               var6.setColor(Color.black);
               var6.fillRect(0, 0, class237.field3310, class692.field10185);
               int var11 = class237.field3310 / 2 + -152;
               int var12 = class692.field10185 / 2 + -18;
               var6.setColor(arg2);
               var6.drawRect(var11, var12, 303, 33);
               var6.setColor(arg4);
               var6.fillRect(var11 + 2, var12 + 2, arg3 * 3, 30);
               var6.setColor(Color.black);
               var6.drawRect(var11 + 1, var12 + 1, 301, 31);
               var6.fillRect(arg3 * 3 + var11 + 2, var12 - -2, -(arg3 * 3) + 300, 30);
               var6.setFont(class116.field1444);
               var6.setColor(arg0);
               if (class750.field11100 != null) {
                  var6.setFont(class116.field1444);
                  var6.setColor(arg0);
                  var6.drawString(class750.field11100, class237.field3310 / 2 + -(6 * class750.field11100.length() / 2), class692.field10185 / 2 + -26);
               }

               var6.drawString(arg1, var11 + (304 + -(6 * arg1.length())) / 2, var12 + 22);
            }
         } catch (Exception var15) {
            class557.field7990.repaint();
         }

         ++field11595;
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field11600[4] + (arg0 != null ? field11600[2] : field11600[1]) + ',' + (arg1 != null ? field11600[2] : field11600[1]) + ',' + (arg2 != null ? field11600[2] : field11600[1]) + ',' + arg3 + ',' + (arg4 != null ? field11600[2] : field11600[1]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(B)Lqca;",
      line = 95
   )
   public final class127 method993(byte arg0) {
      try {
         if (arg0 != -48) {
            return null;
         } else {
            ++field11592;
            return class271.field3741;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11600[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(I)V",
      line = 115
   )
   public static void method5702(int arg0) {
      try {
         if (arg0 != 2) {
            method5703(-108);
         }

         field11583 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11600[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "b",
      descriptor = "(I)Lrd;",
      line = 125
   )
   public static final class357 method5703(int arg0) {
      try {
         ++field11597;
         if (class650.field9493 != null && class189.field2695 != null) {
            class189.field2695.method2546(class650.field9493, -125);
            if (arg0 < 31) {
               return null;
            } else {
               class357 var1 = (class357)class189.field2695.method2541(10);
               if (var1 == null) {
                  return null;
               } else {
                  class326 var2 = class650.field9488.method5666(var1.field4793, false);
                  return var2 != null && var2.field4437 && var2.method2418((byte)126, class650.field9489) ? var1 : class92.method800((byte)33);
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11600[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Lkt;Lada;IIIIIIIIII)V",
      line = 164
   )
   public class790(String arg0, class169 arg1, class175 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         this.field11585 = arg12;
         this.field11587 = arg1;
         this.field11594 = arg6;
         this.field11588 = arg7;
         this.field11598 = arg4;
         this.field11599 = arg3;
         this.field11582 = arg5;
         this.field11586 = arg2;
         this.field11589 = arg10;
         this.field11584 = arg0;
         this.field11593 = arg11;
         this.field11590 = arg8;
         this.field11591 = arg9;
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field11600[0] + (arg0 != null ? field11600[2] : field11600[1]) + ',' + (arg1 != null ? field11600[2] : field11600[1]) + ',' + (arg2 != null ? field11600[2] : field11600[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5704(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5705(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
