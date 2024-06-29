import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class243 extends class500 {
   @OriginalMember(
      owner = "client!tg",
      name = "p",
      descriptor = "Lpl;"
   )
   public class680 field3043;
   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3045 = new String[]{method1826(method1825("Wr$!s")), method1826(method1825("Rs")), method1826(method1825("Wr$&s")), method1826(method1825("Wr$'s")), method1826(method1825("X;$L&")), method1826(method1825("Wr$ s")), method1826(method1825("M`f\u000e")), method1826(method1825("Wr$#s")), method1826(method1825("Wr$^2M|~\\s"))};
   @OriginalMember(
      owner = "client!tg",
      name = "n",
      descriptor = "Ll;"
   )
   public static class20 field3036 = new class20(128);
   @OriginalMember(
      owner = "client!tg",
      name = "k",
      descriptor = "I"
   )
   public static int field3040 = 0;
   @OriginalMember(
      owner = "client!tg",
      name = "r",
      descriptor = "I"
   )
   public static int field3041 = -1;
   @OriginalMember(
      owner = "client!tg",
      name = "m",
      descriptor = "I"
   )
   public static int field3037;
   @OriginalMember(
      owner = "client!tg",
      name = "l",
      descriptor = "I"
   )
   public static int field3038;
   @OriginalMember(
      owner = "client!tg",
      name = "j",
      descriptor = "I"
   )
   public static int field3039;
   @OriginalMember(
      owner = "client!tg",
      name = "q",
      descriptor = "I"
   )
   public static int field3042;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!tg",
      name = "o",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field3044;

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method1819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         if (arg6 > -64) {
            field3041 = -68;
         }

         ++field3039;
         if (arg5 >= 0 && ~arg4 <= -1 && ~arg5 > ~(class507.field7030 - 1) && class215.field2667 + -1 > arg4) {
            if (class111.field1404 == null) {
               return;
            }

            if (~arg3 != -1) {
               if (arg3 != 1) {
                  if (~arg3 != -3) {
                     if (arg3 == 3) {
                        class712 var8 = (class712)class270.method2064(arg7, arg5, arg4);
                        if (var8 != null) {
                           if (var8 instanceof class398) {
                              ((class398)var8).field5589.method2341(arg1, false);
                              return;
                           }

                           class172.method1343(arg3, arg2, -119, arg0, arg5, var8.method2281((byte)-127), arg1, arg7, arg4);
                           return;
                        }
                     }

                     return;
                  }

                  class712 var9 = (class712)class737.method5341(arg7, arg5, arg4, field3044 != null ? field3044 : (field3044 = method1824(field3045[1])));
                  if (var9 != null) {
                     if (arg2 == 11) {
                        arg2 = 10;
                     }

                     if (var9 instanceof class771) {
                        ((class771)var9).field11112.method2341(arg1, false);
                        return;
                     }

                     class172.method1343(arg3, arg2, -88, arg0, arg5, var9.method2281((byte)-127), arg1, arg7, arg4);
                     return;
                  }
               } else {
                  class712 var10 = (class712)class401.method3033(arg7, arg5, arg4);
                  if (var10 == null) {
                     return;
                  }

                  if (var10 instanceof class314) {
                     ((class314)var10).field4194.method2341(arg1, false);
                     return;
                  }

                  int var11 = var10.method2281((byte)-127);
                  if (arg2 == 4 || ~arg2 == -6) {
                     class172.method1343(arg3, 4, -116, arg0, arg5, var11, arg1, arg7, arg4);
                     return;
                  }

                  if (~arg2 != -7) {
                     if (~arg2 == -8) {
                        class172.method1343(arg3, 4, -88, (arg0 + 2 & 3) + 4, arg5, var11, arg1, arg7, arg4);
                        return;
                     }

                     if (~arg2 == -9) {
                        class172.method1343(arg3, 4, -90, arg0 - -4, arg5, var11, arg1, arg7, arg4);
                        class172.method1343(arg3, 4, -114, (arg0 + 2 & 3) - -4, arg5, var11, arg1, arg7, arg4);
                        return;
                     }
                  } else {
                     class172.method1343(arg3, 4, -85, arg0 + 4, arg5, var11, arg1, arg7, arg4);
                  }
               }

               return;
            }

            class712 var12 = (class712)class396.method3009(arg7, arg5, arg4);
            class712 var13 = (class712)class21.method182(arg7, arg5, arg4);
            if (var12 != null && ~arg2 != -3) {
               label139: {
                  if (!(var12 instanceof class627)) {
                     class172.method1343(arg3, arg2, -103, arg0, arg5, var12.method2281((byte)-127), arg1, arg7, arg4);
                     if (!client.field4273) {
                        break label139;
                     }
                  }

                  ((class627)var12).field8762.method2341(arg1, false);
               }
            }

            if (var13 != null) {
               if (!(var13 instanceof class627)) {
                  class172.method1343(arg3, arg2, -97, arg0, arg5, var13.method2281((byte)-128), arg1, arg7, arg4);
                  return;
               }

               ((class627)var13).field8762.method2341(arg1, false);
               return;
            }
         }

      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field3045[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(Lhq;Lha;BLkd;)V"
   )
   public static final void method1820(class168 arg0, class65 arg1, byte arg2, class297 arg3) {
      boolean var4 = client.field4273;

      try {
         ++field3037;
         class763 var5 = arg3.method2237(arg1, -1278433379);
         if (var5 != null) {
            int var6 = var5.method2126();
            if (~var6 > ~var5.method2137()) {
               var6 = var5.method2137();
            }

            byte var7 = 10;
            int var8 = arg0.field2120;
            int var9 = arg0.field2121;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            if (arg3.field3918 != null) {
               var10 = class632.field8875.method4800((int[])null, 18619, class121.field1528, arg3.field3918, (class763[])null);
               int var13 = 0;
               if (var4 || ~var13 > ~var10) {
                  do {
                     String var14 = class121.field1528[var13];
                     if (~(var10 + -1) < ~var13) {
                        var14 = var14.substring(0, -4 + var14.length());
                     }

                     int var15 = class621.field8679.method823(var14);
                     if (var11 < var15) {
                        var11 = var15;
                     }

                     ++var13;
                  } while(~var13 > ~var10);
               }

               var12 = class621.field8679.method825() * var10 - -(class621.field8679.method820() / 2);
            }

            int var16;
            int var17;
            label105: {
               var16 = var6 / 2 + arg0.field2120;
               var17 = arg0.field2121;
               if (class618.field8639 - -var6 > var8) {
                  var16 = var6 / 2 + var7 + var11 / 2 + 5 + class618.field8639;
                  var8 = class618.field8639;
                  if (!var4) {
                     break label105;
                  }
               }

               if (~var8 < ~(class618.field8635 - var6)) {
                  var8 = -var6 + class618.field8635;
                  var16 = -(var6 / 2) + class618.field8635 - var7 + -(var11 / 2) + -5;
               }
            }

            label100: {
               if (var9 < class618.field8640 + var6) {
                  var9 = class618.field8640;
                  var17 = var6 / 2 + var7 + class618.field8640;
                  if (!var4) {
                     break label100;
                  }
               }

               if (~var9 < ~(-var6 + class618.field8632)) {
                  var17 = class618.field8632 - var6 / 2 + -var12 - var7;
                  var9 = class618.field8632 - var6;
               }
            }

            int var18 = 65535 & (int)(32767.0D * (Math.atan2((double)(-arg0.field2120 + var8), (double)(-arg0.field2121 + var9)) / 3.141592653589793D));
            var5.method5478((float)var6 / 2.0F + (float)var8, (float)var6 / 2.0F + (float)var9, 4096, var18);
            int var19 = -2;
            int var20 = -2;
            int var21 = -2;
            int var22 = -2;
            if (arg2 <= 15) {
               field3036 = null;
            }

            if (arg3.field3918 != null) {
               var20 = var17;
               var19 = -(var11 / 2) + var16 - 5;
               var22 = var17 + var10 * class621.field8679.method825() - -3;
               var21 = var11 + 10 + var19;
               if (arg3.field3919 != 0) {
                  arg1.method510(3966, var17, var19, arg3.field3919, -var19 + var21, -var17 + var22);
               }

               if (arg3.field3905 != 0) {
                  arg1.method575(arg3.field3905, var17, -var19 + var21, -var17 + var22, 1, var19);
               }

               int var23 = 0;
               if (var4 || ~var23 > ~var10) {
                  do {
                     String var24 = class121.field1528[var23];
                     if (~var23 > ~(var10 + -1)) {
                        var24 = var24.substring(0, -4 + var24.length());
                     }

                     class621.field8679.method822(arg1, var24, var16, var17, arg3.field3927, true);
                     var17 += class621.field8679.method825();
                     ++var23;
                  } while(~var23 > ~var10);
               }
            }

            if (~arg3.field3932 != 0 || arg3.field3918 != null) {
               class623 var25 = new class623(arg0);
               int var26 = var6 >> 1;
               var25.field8699 = var22;
               var25.field8705 = var9 - var26;
               var25.field8700 = -var26 + var8;
               var25.field8704 = var19;
               var25.field8708 = var9 + var26;
               var25.field8707 = var21;
               var25.field8697 = var8 - -var26;
               var25.field8698 = var20;
               class572.field7867.method3859(2, var25);
            }

         }
      } catch (RuntimeException var28) {
         throw class534.method3846(var28, field3045[5] + (arg0 != null ? field3045[4] : field3045[6]) + ',' + (arg1 != null ? field3045[4] : field3045[6]) + ',' + arg2 + ',' + (arg3 != null ? field3045[4] : field3045[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method1821(int arg0, int arg1) {
      try {
         ++field3038;
         return arg1 != 2 ? 41 : arg0 & 255;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3045[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method1822(int arg0) {
      try {
         if (arg0 != -30288) {
            method1823((byte)-29);
         }

         ++field3042;
         return class444.field6156.method5573(arg0 + -274429976);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3045[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "<init>",
      descriptor = "(Lpl;)V"
   )
   public class243(class680 arg0) {
      try {
         this.field3043 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3045[8] + (arg0 != null ? field3045[4] : field3045[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1823(byte arg0) {
      try {
         field3036 = null;
         if (arg0 != -38) {
            method1819(87, -86, 47, 41, -113, 10, -121, -59);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3045[0] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!tg",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method1824(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1825(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1826(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
