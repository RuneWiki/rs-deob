import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class232 {
   @OriginalMember(
      owner = "client!qj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3608 = new String[]{method2066(method2065("9n\u0016\u0002/")), method2066(method2065("9n\u0016\u0005/")), method2066(method2065("9n\u0016\u0003/")), method2066(method2065("&qT-")), method2066(method2065("9n\u0016\u0000/")), method2066(method2065("3*\u0016oz"))};
   @OriginalMember(
      owner = "client!qj",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field3599 = new int[]{99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120};
   @OriginalMember(
      owner = "client!qj",
      name = "d",
      descriptor = "I"
   )
   public static int field3606 = 0;
   @OriginalMember(
      owner = "client!qj",
      name = "g",
      descriptor = "Lfm;"
   )
   public static class164 field3605 = new class164(62, -1);
   @OriginalMember(
      owner = "client!qj",
      name = "f",
      descriptor = "I"
   )
   public static int field3600;
   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "I"
   )
   public static int field3603;
   @OriginalMember(
      owner = "client!qj",
      name = "h",
      descriptor = "I"
   )
   public static int field3607;
   @OriginalMember(
      owner = "client!qj",
      name = "c",
      descriptor = "[Lma;"
   )
   public static class148[] field3601;
   @OriginalMember(
      owner = "client!qj",
      name = "b",
      descriptor = "[[Z"
   )
   public static boolean[][] field3602;
   @OriginalMember(
      owner = "client!qj",
      name = "i",
      descriptor = "[[[J"
   )
   public static long[][][] field3604;

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2061(int arg0) {
      try {
         if (arg0 != 9311) {
            method2062((byte)0);
         }

         field3604 = null;
         field3605 = null;
         field3602 = null;
         field3601 = null;
         field3599 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3608[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(B)Ldba;"
   )
   public static final class215 method2062(byte arg0) {
      try {
         if (arg0 >= -122) {
            field3605 = null;
         }

         ++field3607;
         class215 var1 = (class215)class11.field177.method3303((byte)98);
         if (var1 != null) {
            --class316.field4725;
            return var1;
         } else {
            return new class215();
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3608[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(DB)V"
   )
   public static final void method2063(double arg0, byte arg1) {
      try {
         if (arg1 >= -18) {
            method2063(1.0295111860349004D, (byte)82);
         }

         ++field3603;
         class162.field2469.method323(class292.field4377);
         class162.field2469.method327(0, 0, (int)arg0);
         class712.field10231.method255(class162.field2469);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3608[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(IIILgda;BI)V"
   )
   public static final void method2064(int arg0, int arg1, int arg2, class268 arg3, byte arg4, int arg5) {
      boolean var6 = client.field10022;

      try {
         ++field3600;
         if (arg3.field4094 != -1 || arg3.field4104 != null) {
            int var7;
            int var8;
            label209: {
               var7 = 0;
               var8 = arg3.field4105 * class476.field6870.field9102.method3775(arg4 ^ -42) >> 8;
               if (~arg3.field4106 > ~arg2) {
                  var7 += -arg3.field4106 + arg2;
                  if (!var6) {
                     break label209;
                  }
               }

               if (arg3.field4111 > arg2) {
                  var7 += -arg2 + arg3.field4111;
               }
            }

            label204: {
               if (~arg3.field4099 > ~arg5) {
                  var7 += -arg3.field4099 + arg5;
                  if (!var6) {
                     break label204;
                  }
               }

               if (~arg5 > ~arg3.field4108) {
                  var7 += -arg5 + arg3.field4108;
               }
            }

            if (arg3.field4109 != 0 && arg3.field4109 >= var7 - 256 && ~class476.field6870.field9102.method3775(-97) != -1 && arg3.field4098 == arg1) {
               var7 -= 256;
               if (~var7 > -1) {
                  var7 = 0;
               }

               int var9 = -arg3.field4101 + arg3.field4109;
               if (var9 < 0) {
                  var9 = arg3.field4109;
               }

               int var10 = var8;
               int var11 = -arg3.field4101 + var7;
               if (~var11 < -1 && ~var9 < -1) {
                  var10 = (var9 - var11) * var8 / var9;
               }

               if (arg4 != 79) {
                  method2063(-0.5087671021545875D, (byte)-55);
               }

               class117.field1849.method1507(-91);
               int var12 = 8192;
               int var13 = (arg3.field4111 + arg3.field4106) / 2 + -arg2;
               int var14 = (arg3.field4099 - -arg3.field4108) / 2 + -arg5;
               if (var13 != 0 || var14 != 0) {
                  int var15 = -class75.field1201 + -4096 - (int)(Math.atan2((double)var13, (double)var14) * 2607.5945876176133D) & 16383;
                  if (var15 > 8192) {
                     var15 = -var15 + 16384;
                  }

                  int var16;
                  label182: {
                     if (var7 > 0) {
                        if (var7 >= 4096) {
                           var16 = 16384;
                           if (!var6) {
                              break label182;
                           }
                        }

                        var16 = var7 * 8192 / 4096 + 8192;
                        if (!var6) {
                           break label182;
                        }
                     }

                     var16 = 8192;
                  }

                  var12 = var15 * var16 / 8192 - -(-var16 + 16384 >> 1);
               }

               label174: {
                  if (arg3.field4092 != null) {
                     arg3.field4092.method2419(var10);
                     arg3.field4092.method2415(var12);
                     if (!var6) {
                        break label174;
                     }
                  }

                  if (arg3.field4094 >= 0) {
                     label234: {
                        int var17 = ~arg3.field4088 == -257 && arg3.field4114 == 256 ? 256 : class133.method1369((byte)106, arg3.field4114, arg3.field4088);
                        if (arg3.field4089) {
                           if (arg3.field4115 == null) {
                              arg3.field4115 = class469.method3600(class306.field4638, arg3.field4094);
                           }

                           if (arg3.field4115 == null) {
                              break label234;
                           }

                           if (arg3.field4119 == null) {
                              arg3.field4119 = arg3.field4115.method3605(new int[]{22050});
                           }

                           if (arg3.field4119 == null) {
                              break label234;
                           }

                           class291 var18 = class291.method2420(arg3.field4119, var17, var10 << 6, var12);
                           var18.method2423(-1);
                           class129.field2068.method568(var18);
                           arg3.field4092 = var18;
                           if (!var6) {
                              break label234;
                           }
                        }

                        class120 var19 = class120.method1190(class327.field4855, arg3.field4094, 0);
                        if (var19 != null) {
                           class301 var20 = var19.method1191().method2494(class794.field11555);
                           class291 var21 = class291.method2420(var20, var17, var10 << 6, var12);
                           var21.method2423(-1);
                           class129.field2068.method568(var21);
                           arg3.field4092 = var21;
                        }
                     }
                  }
               }

               if (arg3.field4117 != null) {
                  arg3.field4117.method2419(var10);
                  arg3.field4117.method2415(var12);
                  if (!arg3.field4117.method2143(29962)) {
                     arg3.field4117 = null;
                     arg3.field4107 = null;
                     arg3.field4087 = null;
                  }
               } else {
                  if (arg3.field4104 != null && ~(arg3.field4086 -= arg0) >= -1) {
                     int var22 = arg3.field4088 == 256 && ~arg3.field4114 == -257 ? 256 : arg3.field4114 + (int)(Math.random() * (double)(-arg3.field4114 + arg3.field4088));
                     if (arg3.field4112) {
                        if (arg3.field4087 == null) {
                           int var23 = (int)(Math.random() * (double)arg3.field4104.length);
                           arg3.field4087 = class469.method3600(class306.field4638, arg3.field4104[var23]);
                        }

                        if (arg3.field4087 != null) {
                           if (arg3.field4107 == null) {
                              arg3.field4107 = arg3.field4087.method3605(new int[]{22050});
                           }

                           if (arg3.field4107 != null) {
                              class291 var24 = class291.method2420(arg3.field4107, var22, var10 << 6, var12);
                              var24.method2423(0);
                              class129.field2068.method568(var24);
                              arg3.field4086 = arg3.field4091 - -((int)(Math.random() * (double)(arg3.field4100 - arg3.field4091)));
                              arg3.field4117 = var24;
                              return;
                           }
                        }

                        return;
                     }

                     int var25 = (int)(Math.random() * (double)arg3.field4104.length);
                     class120 var26 = class120.method1190(class327.field4855, arg3.field4104[var25], 0);
                     if (var26 != null) {
                        class301 var27 = var26.method1191().method2494(class794.field11555);
                        class291 var28 = class291.method2420(var27, var22, var10 << 6, var12);
                        var28.method2423(0);
                        class129.field2068.method568(var28);
                        arg3.field4117 = var28;
                        arg3.field4086 = (int)((double)(arg3.field4100 - arg3.field4091) * Math.random()) + arg3.field4091;
                        return;
                     }
                  }

               }
            } else {
               if (arg3.field4092 != null) {
                  class129.field2068.method557(arg3.field4092);
                  arg3.field4115 = null;
                  arg3.field4119 = null;
                  arg3.field4092 = null;
               }

               if (arg3.field4117 != null) {
                  class129.field2068.method557(arg3.field4117);
                  arg3.field4087 = null;
                  arg3.field4117 = null;
                  arg3.field4107 = null;
               }

            }
         }
      } catch (RuntimeException var30) {
         throw class612.method4503(var30, field3608[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3608[5] : field3608[3]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2065(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2066(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
