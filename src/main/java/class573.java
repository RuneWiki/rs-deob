import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class573 {
   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8112 = new String[]{method4245(method4244("\u007fckcK")), method4245(method4244("\u007fck`K")), method4245(method4244("\u007fckbK")), method4245(method4244("k=k\u000f\u001e")), method4245(method4244("\u007fckdK")), method4245(method4244("~f)M")), method4245(method4244("\u007fckeK"))};
   @OriginalMember(
      owner = "client!op",
      name = "b",
      descriptor = "Ldb;"
   )
   public static class685 field8105 = new class685(5, 3);
   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "Lhha;"
   )
   public static class724 field8107 = new class724(30, -1);
   @OriginalMember(
      owner = "client!op",
      name = "d",
      descriptor = "Lbga;"
   )
   public static class398 field8110 = new class398(64);
   @OriginalMember(
      owner = "client!op",
      name = "f",
      descriptor = "I"
   )
   public static int field8104;
   @OriginalMember(
      owner = "client!op",
      name = "e",
      descriptor = "I"
   )
   public static int field8106;
   @OriginalMember(
      owner = "client!op",
      name = "g",
      descriptor = "I"
   )
   public static int field8108;
   @OriginalMember(
      owner = "client!op",
      name = "c",
      descriptor = "I"
   )
   public static int field8109;
   @OriginalMember(
      owner = "client!op",
      name = "h",
      descriptor = "I"
   )
   public static int field8111;

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public static final void method4239(int arg0, String arg1) {
      try {
         ++field8108;
         if (!arg1.equals("")) {
            ++class139.field2229;
            class242 var2 = class735.method5318(-127);
            class381 var3 = class801.method5775(class245.field3758, 0, var2.field3718);
            var3.field5570.method656((byte)-99, class519.method3880(false, arg1));
            var3.field5570.method658(arg1, -29);
            if (arg0 > 119) {
               var2.method2111(14024, var3);
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8112[6] + arg0 + ',' + (arg1 != null ? field8112[3] : field8112[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4240(int arg0) {
      try {
         if (arg0 != 12) {
            field8105 = null;
         }

         field8105 = null;
         field8107 = null;
         field8110 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8112[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(ZIIIII)V"
   )
   public static final void method4241(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field10022;

      try {
         ++field8106;
         long var7 = (long)(arg3 | (arg0 ? Integer.MIN_VALUE : 0));
         if (arg2 != 2) {
            method4242(100, 20, -25, -16, 14, 124, -107);
         }

         class380 var9 = (class380)class656.field9285.method3101(-1, var7);
         if (var9 == null) {
            var9 = new class380();
            class656.field9285.method3098(var7, var9, -1);
         }

         if (var9.field5559.length <= arg5) {
            int[] var10 = new int[arg5 + 1];
            int[] var11 = new int[arg5 + 1];
            int var12 = 0;
            if (var6) {
               var10[var12] = var9.field5559[var12];
               var11[var12] = var9.field5560[var12];
               ++var12;
            }

            label69:
            while(true) {
               while(var12 < var9.field5559.length) {
                  var10[var12] = var9.field5559[var12];
                  var11[var12] = var9.field5560[var12];
                  ++var12;
               }

               int var13 = var9.field5559.length;
               if (!var6) {
                  if (var6) {
                     var10[var13] = -1;
                     var11[var13] = 0;
                     ++var13;
                  }

                  while(true) {
                     while(~arg5 < ~var13) {
                        var10[var13] = -1;
                        var11[var13] = 0;
                        ++var13;
                     }

                     var9.field5559 = var10;
                     if (!var6) {
                        var9.field5560 = var11;
                        break label69;
                     }

                     ++var13;
                  }
               }

               ++var12;
            }
         }

         var9.field5559[arg5] = arg4;
         var9.field5560[arg5] = arg1;
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field8112[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method4242(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(IZLha;)V"
   )
   public static final void method4243(int arg0, boolean arg1, class17 arg2) {
      boolean var3 = client.field10022;

      try {
         ++field8104;
         if (class66.field971 && class174.field2594) {
            if (class381.field5564) {
               class783.field11413 = class344.field5072.method888(-26038);
            }

            class278.field4202 = 0;
            class48.field729 = 0;
            class40.field622 = 0;
            int[] var4 = arg2.method147();
            class156.field2385 = (int)((float)var4[3] / 3.0F);
            class412.field6048 = (int)((float)var4[2] / 3.0F);
            arg2.method239(class755.field10798);
            if (~((int)((float)class755.field10798[0] / 3.0F)) != ~class597.field8402 || (int)((float)class755.field10798[1] / 3.0F) != class358.field5300) {
               class358.field5300 = (int)((float)class755.field10798[1] / 3.0F);
               class597.field8402 = (int)((float)class755.field10798[0] / 3.0F);
               class595.field8383 = new int[class597.field8402 * class358.field5300];
               class710.field10191 = class597.field8402 >> 1;
               class175.field2600 = class358.field5300 >> 1;
            }

            class366.field5422 = arg2.method176();
            class499.field7108 = 0;
            int var5 = 0;
            if (var3) {
               class344.method2734(arg0, class548.field7815[var5], (byte)78, arg2);
               ++var5;
            }

            while(true) {
               while(~var5 > ~class517.field7317) {
                  class344.method2734(arg0, class548.field7815[var5], (byte)78, arg2);
                  ++var5;
               }

               int var6 = 0;
               if (!var3) {
                  if (var3) {
                     class344.method2734(arg0, class130.field2084[var6], (byte)87, arg2);
                     ++var6;
                  }

                  while(true) {
                     int var10000;
                     if (~var6 <= ~class29.field421) {
                        var10000 = arg1;
                        if (!var3) {
                           if (arg1 != 1) {
                              field8105 = null;
                           }

                           int var7 = 0;
                           if (var3) {
                              class344.method2734(arg0, class114.field1804[var7], (byte)10, arg2);
                              ++var7;
                           }

                           while(true) {
                              if (class229.field3566 <= var7) {
                                 class526.field7443 = 0;
                                 var10000 = ~class499.field7108;
                                 if (!var3) {
                                    if (var10000 < -1) {
                                       int var8 = class595.field8383.length;
                                       int var9 = 7 & -var8 + var8;
                                       int var10 = 0;
                                       if (var3) {
                                          class595.field8383[var10++] = Integer.MAX_VALUE;
                                          class595.field8383[var10++] = Integer.MAX_VALUE;
                                          class595.field8383[var10++] = Integer.MAX_VALUE;
                                          class595.field8383[var10++] = Integer.MAX_VALUE;
                                          class595.field8383[var10++] = Integer.MAX_VALUE;
                                          class595.field8383[var10++] = Integer.MAX_VALUE;
                                          class595.field8383[var10++] = Integer.MAX_VALUE;
                                          class595.field8383[var10++] = Integer.MAX_VALUE;
                                       }

                                       while(true) {
                                          while(~var10 > ~var9) {
                                             class595.field8383[var10++] = Integer.MAX_VALUE;
                                             class595.field8383[var10++] = Integer.MAX_VALUE;
                                             class595.field8383[var10++] = Integer.MAX_VALUE;
                                             class595.field8383[var10++] = Integer.MAX_VALUE;
                                             class595.field8383[var10++] = Integer.MAX_VALUE;
                                             class595.field8383[var10++] = Integer.MAX_VALUE;
                                             class595.field8383[var10++] = Integer.MAX_VALUE;
                                             class595.field8383[var10++] = Integer.MAX_VALUE;
                                          }

                                          if (!var3) {
                                             if (var3 || var8 > var10) {
                                                do {
                                                   class595.field8383[var10++] = Integer.MAX_VALUE;
                                                } while(var8 > var10);
                                             }

                                             class613.field8721 = 1;
                                             int var11 = 0;
                                             if (var3 || ~var11 > ~class499.field7108) {
                                                do {
                                                   class662 var12 = class774.field11262[var11];
                                                   class217.method1888(var12.field9316[1], var12.field9314[1], var12.field9317[1], var12.field9314[3], var12.field9317[0], var12.field9316[3], var12.field9317[3], (byte)-125, var12.field9314[0], var12.field9316[0]);
                                                   class217.method1888(var12.field9316[2], var12.field9314[2], var12.field9317[2], var12.field9314[3], var12.field9317[1], var12.field9316[3], var12.field9317[3], (byte)-125, var12.field9314[1], var12.field9316[1]);
                                                   ++var11;
                                                } while(~var11 > ~class499.field7108);
                                             }

                                             class613.field8721 = 2;
                                             break;
                                          }

                                          class595.field8383[var10++] = Integer.MAX_VALUE;
                                       }
                                    }

                                    if (class381.field5564) {
                                       class118.field1851 = class344.field5072.method888(-26038) - class783.field11413;
                                       return;
                                    }

                                    return;
                                 }
                              } else {
                                 var10000 = arg0;
                              }

                              class344.method2734(var10000, class114.field1804[var7], (byte)10, arg2);
                              ++var7;
                           }
                        }
                     } else {
                        var10000 = arg0;
                     }

                     class344.method2734(var10000, class130.field2084[var6], (byte)87, arg2);
                     ++var6;
                  }
               }

               ++var5;
            }
         } else {
            class499.field7108 = 0;
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field8112[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8112[3] : field8112[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4244(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4245(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
