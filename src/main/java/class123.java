import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class123 implements class518 {
   @OriginalMember(
      owner = "client!ri",
      name = "i",
      descriptor = "I"
   )
   public int field1597;
   @OriginalMember(
      owner = "client!ri",
      name = "c",
      descriptor = "I"
   )
   public int field1603;
   @OriginalMember(
      owner = "client!ri",
      name = "m",
      descriptor = "I"
   )
   public int field1600;
   @OriginalMember(
      owner = "client!ri",
      name = "f",
      descriptor = "I"
   )
   public int field1604;
   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "Z"
   )
   public boolean field1590;
   @OriginalMember(
      owner = "client!ri",
      name = "r",
      descriptor = "I"
   )
   public int field1591;
   @OriginalMember(
      owner = "client!ri",
      name = "k",
      descriptor = "Lada;"
   )
   public class175 field1596;
   @OriginalMember(
      owner = "client!ri",
      name = "j",
      descriptor = "Lkt;"
   )
   public class169 field1605;
   @OriginalMember(
      owner = "client!ri",
      name = "d",
      descriptor = "I"
   )
   public int field1592;
   @OriginalMember(
      owner = "client!ri",
      name = "o",
      descriptor = "I"
   )
   public int field1593;
   @OriginalMember(
      owner = "client!ri",
      name = "n",
      descriptor = "I"
   )
   public int field1601;
   @OriginalMember(
      owner = "client!ri",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1607 = new String[]{method998(method997("!a\t!7")), method998(method997("!a\t&7")), method998(method997("(&\tLb")), method998(method997("!a\t^v=aS\\7")), method998(method997("=}K\u000e")), method998(method997("!a\t 7")), method998(method997("!a\t'7")), method998(method997("!a\t#7"))};
   @OriginalMember(
      owner = "client!ri",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field1599 = new int[2048];
   @OriginalMember(
      owner = "client!ri",
      name = "p",
      descriptor = "Lwu;"
   )
   public static class395 field1594 = new class395(4, 1, 1, 1);
   @OriginalMember(
      owner = "client!ri",
      name = "h",
      descriptor = "I"
   )
   public static int field1589;
   @OriginalMember(
      owner = "client!ri",
      name = "b",
      descriptor = "I"
   )
   public static int field1595;
   @OriginalMember(
      owner = "client!ri",
      name = "l",
      descriptor = "I"
   )
   public static int field1598;
   @OriginalMember(
      owner = "client!ri",
      name = "q",
      descriptor = "I"
   )
   public static int field1602;
   @OriginalMember(
      owner = "client!ri",
      name = "g",
      descriptor = "[Lgk;"
   )
   public static class503[] field1606;

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(IIIILjava/lang/String;)V",
      line = 6
   )
   public static final void method992(int arg0, int arg1, int arg2, int arg3, String arg4) {
      try {
         ++field1589;
         class678 var5 = class504.method3657(-100, arg1, arg3);
         if (var5 != null) {
            if (var5.field9975 != null) {
               class421 var6 = new class421();
               var6.field6015 = arg0;
               var6.field6014 = var5;
               var6.field6012 = arg4;
               var6.field6010 = var5.field9975;
               class200.method1583(var6);
            }

            if (arg2 == -19390) {
               if (class622.field9156 == 11) {
                  if (client.method2351(var5).method2169(arg2 ^ 19389, arg0 - 1)) {
                     if (~arg0 == -2) {
                        ++class36.field510;
                        class447 var7 = class40.method350(class445.field6337, class430.field6150.field106, true);
                        class389.method2957(var7, arg3, var5.field9912, (byte)85, arg1);
                        class430.field6150.method55(13256, var7);
                     }

                     if (~arg0 == -3) {
                        ++class99.field1265;
                        class447 var8 = class40.method350(class29.field429, class430.field6150.field106, true);
                        class389.method2957(var8, arg3, var5.field9912, (byte)85, arg1);
                        class430.field6150.method55(13256, var8);
                     }

                     if (~arg0 == -4) {
                        ++class255.field3472;
                        class447 var9 = class40.method350(class418.field6001, class430.field6150.field106, true);
                        class389.method2957(var9, arg3, var5.field9912, (byte)85, arg1);
                        class430.field6150.method55(13256, var9);
                     }

                     if (~arg0 == -5) {
                        ++class20.field220;
                        class447 var10 = class40.method350(class73.field900, class430.field6150.field106, true);
                        class389.method2957(var10, arg3, var5.field9912, (byte)85, arg1);
                        class430.field6150.method55(13256, var10);
                     }

                     if (~arg0 == -6) {
                        ++class529.field7556;
                        class447 var11 = class40.method350(class282.field3911, class430.field6150.field106, true);
                        class389.method2957(var11, arg3, var5.field9912, (byte)85, arg1);
                        class430.field6150.method55(13256, var11);
                     }

                     if (~arg0 == -7) {
                        ++class158.field2263;
                        class447 var12 = class40.method350(class156.field2220, class430.field6150.field106, true);
                        class389.method2957(var12, arg3, var5.field9912, (byte)85, arg1);
                        class430.field6150.method55(13256, var12);
                     }

                     if (~arg0 == -8) {
                        ++class31.field452;
                        class447 var13 = class40.method350(class292.field4041, class430.field6150.field106, true);
                        class389.method2957(var13, arg3, var5.field9912, (byte)85, arg1);
                        class430.field6150.method55(arg2 ^ -30838, var13);
                     }

                     if (~arg0 == -9) {
                        ++class522.field7506;
                        class447 var14 = class40.method350(class494.field7056, class430.field6150.field106, true);
                        class389.method2957(var14, arg3, var5.field9912, (byte)85, arg1);
                        class430.field6150.method55(arg2 + 32646, var14);
                     }

                     if (arg0 == 9) {
                        ++class740.field10792;
                        class447 var15 = class40.method350(class212.field3031, class430.field6150.field106, true);
                        class389.method2957(var15, arg3, var5.field9912, (byte)85, arg1);
                        class430.field6150.method55(13256, var15);
                     }

                     if (~arg0 == -11) {
                        ++class394.field5692;
                        class447 var16 = class40.method350(class590.field8702, class430.field6150.field106, true);
                        class389.method2957(var16, arg3, var5.field9912, (byte)85, arg1);
                        class430.field6150.method55(13256, var16);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var18) {
         throw class237.method1823(var18, field1607[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1607[2] : field1607[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(B)Lqca;",
      line = 143
   )
   public final class127 method993(byte arg0) {
      try {
         ++field1595;
         return arg0 != -48 ? null : class245.field3376;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1607[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "b",
      descriptor = "(B)V",
      line = 154
   )
   public static final void method994(byte arg0) {
      boolean var1 = client.field4360;

      try {
         ++field1602;
         if (class326.field4414 == null) {
            int var2 = class150.field2097;
            int var3 = class278.field3787;
            int var4 = -class237.field3310 + class79.field982 + -var2;
            int var5 = -var3 + class689.field10151 - class692.field10185;
            if (arg0 != -15) {
               field1606 = null;
            }

            if (var2 > 0 || var4 > 0 || var3 > 0 || ~var5 < -1) {
               try {
                  Container var6;
                  label72: {
                     if (class549.field7865 != null) {
                        var6 = class549.field7865;
                        if (!var1) {
                           break label72;
                        }
                     }

                     if (class216.field3093 == null) {
                        var6 = class362.field4931;
                        if (!var1) {
                           break label72;
                        }
                     }

                     var6 = class216.field3093;
                  }

                  int var7 = 0;
                  int var8 = 0;
                  if (class549.field7865 == var6) {
                     Insets var9 = class549.field7865.getInsets();
                     var8 = var9.top;
                     var7 = var9.left;
                  }

                  Graphics var10 = var6.getGraphics();
                  var10.setColor(Color.black);
                  if (~var2 < -1) {
                     var10.fillRect(var7, var8, var2, class689.field10151);
                  }

                  if (~var3 < -1) {
                     var10.fillRect(var7, var8, class79.field982, var3);
                  }

                  if (var4 > 0) {
                     var10.fillRect(-var4 + class79.field982 + var7, var8, var4, class689.field10151);
                  }

                  if (var5 > 0) {
                     var10.fillRect(var7, -var5 + var8 - -class689.field10151, class79.field982, var5);
                     return;
                  }
               } catch (Exception var12) {
                  return;
               }
            }

         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field1607[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(IZ)V",
      line = 238
   )
   public static final void method995(int arg0, boolean arg1) {
      try {
         ++field1598;
         int var2 = class338.field4605;
         int var3 = class450.field6385;
         if (arg0 != -2) {
            field1594 = null;
         }

         if (arg1 && class183.field2581) {
            var2 <<= 1;
            var3 = -var2;
         }

         class383.field5543.method506(var3, var2);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1607[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(Z)V",
      line = 263
   )
   public static void method996(boolean arg0) {
      try {
         field1599 = null;
         if (!arg0) {
            method994((byte)-8);
         }

         field1594 = null;
         field1606 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1607[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "<init>",
      descriptor = "(ILkt;Lada;IIIIIIIZ)V",
      line = 279
   )
   public class123(int arg0, class169 arg1, class175 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
      try {
         this.field1597 = arg0;
         this.field1603 = arg7;
         this.field1600 = arg3;
         this.field1604 = arg8;
         this.field1590 = arg10;
         this.field1591 = arg5;
         this.field1596 = arg2;
         this.field1605 = arg1;
         this.field1592 = arg6;
         this.field1593 = arg4;
         this.field1601 = arg9;
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field1607[3] + arg0 + ',' + (arg1 != null ? field1607[2] : field1607[4]) + ',' + (arg2 != null ? field1607[2] : field1607[4]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ri",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method997(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ri",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method998(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
