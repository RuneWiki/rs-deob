import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class504 {
   @OriginalMember(
      owner = "client!gk",
      name = "j",
      descriptor = "Ltv;"
   )
   private class590 field6904 = new class590(64);
   @OriginalMember(
      owner = "client!gk",
      name = "b",
      descriptor = "I"
   )
   public int field6911 = 0;
   @OriginalMember(
      owner = "client!gk",
      name = "g",
      descriptor = "Lqh;"
   )
   private class74 field6905;
   @OriginalMember(
      owner = "client!gk",
      name = "f",
      descriptor = "I"
   )
   public int field6910;
   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6913 = new String[]{method3642(method3641("hS![\u000f")), method3642(method3641("G]chB{Ql\u007f")), method3642(method3641("hS!X\u000f")), method3642(method3641("aMcr")), method3642(method3641("t\u0016!0Z")), method3642(method3641("hS!\\\u000f")), method3642(method3641("hS!\"NaQ{ \u000f")), method3642(method3641("hS!]\u000f")), method3642(method3641("hS!_\u000f")), method3642(method3641("hS!Z\u000f"))};
   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "Lw;"
   )
   public static class317 field6901 = new class317();
   @OriginalMember(
      owner = "client!gk",
      name = "c",
      descriptor = "Lw;"
   )
   public static class317 field6912 = new class317();
   @OriginalMember(
      owner = "client!gk",
      name = "i",
      descriptor = "I"
   )
   public static int field6900;
   @OriginalMember(
      owner = "client!gk",
      name = "d",
      descriptor = "I"
   )
   public static int field6902;
   @OriginalMember(
      owner = "client!gk",
      name = "h",
      descriptor = "I"
   )
   public static int field6903;
   @OriginalMember(
      owner = "client!gk",
      name = "l",
      descriptor = "I"
   )
   public static int field6907;
   @OriginalMember(
      owner = "client!gk",
      name = "k",
      descriptor = "I"
   )
   public static int field6909;
   @OriginalMember(
      owner = "client!gk",
      name = "m",
      descriptor = "Ltt;"
   )
   public static class100 field6908;
   @OriginalMember(
      owner = "client!gk",
      name = "e",
      descriptor = "[[Z"
   )
   public static boolean[][] field6906;

   @OriginalMember(
      owner = "client!gk",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3635(byte arg0) {
      try {
         class590 var2 = this.field6904;
         synchronized(this.field6904) {
            this.field6904.method4244(true);
         }

         if (arg0 != -81) {
            method3636((Color)null, (Color)null, (String)null, 64, -126, (Color)null);
         }

         ++field6907;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6913[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;IILjava/awt/Color;)V"
   )
   public static final void method3636(Color arg0, Color arg1, String arg2, int arg3, int arg4, Color arg5) {
      try {
         ++field6902;

         try {
            if (arg3 == 23291) {
               Graphics var6 = class204.field2515.getGraphics();
               if (class209.field2584 == null) {
                  class209.field2584 = new Font(field6913[1], 1, 13);
               }

               if (arg5 == null) {
                  arg5 = new Color(140, 17, 17);
               }

               if (arg0 == null) {
                  arg0 = new Color(140, 17, 17);
               }

               if (arg1 == null) {
                  arg1 = new Color(255, 255, 255);
               }

               try {
                  if (class616.field8589 == null) {
                     class616.field8589 = class204.field2515.createImage(class252.field3194, class41.field479);
                  }

                  Graphics var7 = class616.field8589.getGraphics();
                  var7.setColor(Color.black);
                  var7.fillRect(0, 0, class252.field3194, class41.field479);
                  int var8 = class252.field3194 / 2 - 152;
                  int var9 = class41.field479 / 2 + -18;
                  var7.setColor(arg0);
                  var7.drawRect(var8, var9, 303, 33);
                  var7.setColor(arg5);
                  var7.fillRect(var8 - -2, var9 + 2, arg4 * 3, 30);
                  var7.setColor(Color.black);
                  var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                  var7.fillRect(arg4 * 3 + var8 + 2, var9 + 2, -(arg4 * 3) + 300, 30);
                  var7.setFont(class209.field2584);
                  var7.setColor(arg1);
                  var7.drawString(arg2, var8 + (-(6 * arg2.length()) + 304) / 2, var9 + 22);
                  if (class271.field3583 != null) {
                     var7.setFont(class209.field2584);
                     var7.setColor(arg1);
                     var7.drawString(class271.field3583, class252.field3194 / 2 + -(class271.field3583.length() * 6 / 2), class41.field479 / 2 - 26);
                  }

                  var6.drawImage(class616.field8589, 0, 0, (ImageObserver)null);
               } catch (Exception var13) {
                  var6.setColor(Color.black);
                  var6.fillRect(0, 0, class252.field3194, class41.field479);
                  int var10 = class252.field3194 / 2 + -152;
                  int var11 = class41.field479 / 2 - 18;
                  var6.setColor(arg0);
                  var6.drawRect(var10, var11, 303, 33);
                  var6.setColor(arg5);
                  var6.fillRect(var10 - -2, var11 - -2, arg4 * 3, 30);
                  var6.setColor(Color.black);
                  var6.drawRect(var10 - -1, var11 + 1, 301, 31);
                  var6.fillRect(arg4 * 3 + var10 + 2, var11 - -2, -(arg4 * 3) + 300, 30);
                  var6.setFont(class209.field2584);
                  var6.setColor(arg1);
                  if (class271.field3583 != null) {
                     var6.setFont(class209.field2584);
                     var6.setColor(arg1);
                     var6.drawString(class271.field3583, class252.field3194 / 2 + -(class271.field3583.length() * 6 / 2), class41.field479 / 2 + -26);
                  }

                  var6.drawString(arg2, var10 - -((-(6 * arg2.length()) + 304) / 2), var11 - -22);
               }
            }
         } catch (Exception var14) {
            class204.field2515.repaint();
         }
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field6913[2] + (arg0 != null ? field6913[4] : field6913[3]) + ',' + (arg1 != null ? field6913[4] : field6913[3]) + ',' + (arg2 != null ? field6913[4] : field6913[3]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6913[4] : field6913[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3637(int arg0) {
      try {
         class590 var2 = this.field6904;
         synchronized(this.field6904) {
            this.field6904.method4245(true);
         }

         ++field6900;
         if (arg0 <= 14) {
            field6901 = null;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6913[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3638(byte arg0) {
      try {
         field6901 = null;
         field6912 = null;
         int var1 = 126 / ((arg0 - 37) / 59);
         field6908 = null;
         field6906 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6913[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(II)Ldi;"
   )
   public final class136 method3639(int arg0, int arg1) {
      try {
         ++field6909;
         class590 var3 = this.field6904;
         class136 var4;
         synchronized(this.field6904) {
            var4 = (class136)this.field6904.method4239((long)arg1, 0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field6905;
            byte[] var6;
            synchronized(this.field6905) {
               var6 = this.field6905.method732(arg1, 4, (byte)51);
            }

            class136 var7 = new class136();
            var7.field1763 = arg1;
            int var8 = 11 / ((5 - arg0) / 37);
            var7.field1765 = this;
            if (var6 != null) {
               var7.method1141(new class594(var6), -46);
            }

            var7.method1140((byte)-102);
            class590 var9 = this.field6904;
            synchronized(this.field6904) {
               this.field6904.method4238(47, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field6913[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method3640(int arg0, byte arg1) {
      try {
         ++field6903;
         class590 var3 = this.field6904;
         synchronized(this.field6904) {
            this.field6904.method4234(2, arg0);
         }

         if (arg1 != 98) {
            this.method3640(117, (byte)70);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6913[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "<init>",
      descriptor = "(Lnc;ILqh;)V"
   )
   public class504(class26 arg0, int arg1, class74 arg2) {
      try {
         this.field6905 = arg2;
         this.field6910 = this.field6905.method727(4, -32767);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6913[6] + (arg0 != null ? field6913[4] : field6913[3]) + ',' + arg1 + ',' + (arg2 != null ? field6913[4] : field6913[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3641(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3642(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
