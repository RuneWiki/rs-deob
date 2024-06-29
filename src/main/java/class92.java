import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class92 extends class294 {
   @OriginalMember(
      owner = "client!iq",
      name = "s",
      descriptor = "I"
   )
   public volatile int field1326 = -1;
   @OriginalMember(
      owner = "client!iq",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   public volatile String field1324;
   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1329 = new String[]{method931(method930("#S\u0006L`")), method931(method930("$WDd")), method931(method930("1\f\u0006&5")), method931(method930("#S\u0006I`")), method931(method930("#S\u00064!$K\\6`")), method931(method930("#S\u0006K`")), method931(method930("#S\u0006J`"))};
   @OriginalMember(
      owner = "client!iq",
      name = "q",
      descriptor = "Lbea;"
   )
   public static class699 field1327 = null;
   @OriginalMember(
      owner = "client!iq",
      name = "t",
      descriptor = "[I"
   )
   public static int[] field1328 = new int[]{0, -1, 0, 1};
   @OriginalMember(
      owner = "client!iq",
      name = "m",
      descriptor = "I"
   )
   public static int field1321;
   @OriginalMember(
      owner = "client!iq",
      name = "p",
      descriptor = "I"
   )
   public static int field1323;
   @OriginalMember(
      owner = "client!iq",
      name = "o",
      descriptor = "I"
   )
   public static int field1325;
   @OriginalMember(
      owner = "client!iq",
      name = "n",
      descriptor = "Liba;"
   )
   public static class343 field1322;

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method926(int arg0) {
      try {
         field1322 = null;
         field1328 = null;
         if (arg0 != 795706438) {
            field1328 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1329[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(IIIILrr;IZ)V"
   )
   public static final void method927(int arg0, int arg1, int arg2, int arg3, class678 arg4, int arg5, boolean arg6) {
      try {
         label29: {
            if (arg0 <= 0) {
               class228.method1975(arg4, arg1, 80, arg5, arg6, arg3);
               if (!client.field1786) {
                  break label29;
               }
            }

            class489.field7417 = null;
            class218.field3277 = arg4;
            class222.field3337 = arg1;
            class583.field8598 = arg3;
            class487.field7407 = arg6;
            class326.field4957 = 1;
            class61.field788 = arg5;
            class618.field8993 = class259.field4270.method753(2) / arg0;
            if (~class618.field8993 > -2) {
               class618.field8993 = 1;
            }
         }

         ++field1325;
         if (arg2 > 123) {
            ;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field1329[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1329[2] : field1329[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(ZIIIILil;I)Z"
   )
   public static final boolean method928(boolean arg0, int arg1, int arg2, int arg3, int arg4, class680 arg5, int arg6) {
      boolean var7 = client.field1786;

      try {
         ++field1321;
         if (class439.field6716 && class665.field9966) {
            if (class84.field1223 < 100) {
               return false;
            } else if (arg3 == arg4 && ~arg2 == ~arg6) {
               if (!client.method1174(arg2, arg1, arg4, 94)) {
                  return false;
               } else if (class612.method4510(arg5, 8448)) {
                  ++class467.field7105;
                  return true;
               } else {
                  return false;
               }
            } else {
               int var8 = arg4;
               int var10000;
               int var9;
               if (var7) {
                  var9 = arg2;
                  if (var7) {
                     if (~class590.field8696[arg1][arg4][arg2] == ~(-class406.field6331)) {
                        return false;
                     }

                     var9 = arg2 + 1;
                  }
               } else {
                  if (arg4 > arg3) {
                     var10000 = class612.method4510(arg5, 8448);
                     if (!var7) {
                        if (var10000 == 0) {
                           return false;
                        }

                        ++class467.field7105;
                        if (arg0) {
                           return false;
                        }

                        return true;
                     }
                  } else {
                     var10000 = arg2;
                  }

                  var9 = var10000;
                  if (var7) {
                     if (~class590.field8696[arg1][arg4][var9] == ~(-class406.field6331)) {
                        return false;
                     }

                     ++var9;
                  }
               }

               while(true) {
                  while(~var9 >= ~arg6) {
                     if (~class590.field8696[arg1][var8][var9] == ~(-class406.field6331)) {
                        return false;
                     }

                     ++var9;
                  }

                  if (!var7) {
                     ++var8;
                     if (var8 > arg3) {
                        var10000 = class612.method4510(arg5, 8448);
                        if (!var7) {
                           if (var10000 == 0) {
                              return false;
                           }

                           ++class467.field7105;
                           if (arg0) {
                              return false;
                           }

                           return true;
                        }
                     } else {
                        var10000 = arg2;
                     }

                     var9 = var10000;
                     if (var7) {
                        if (~class590.field8696[arg1][var8][var9] == ~(-class406.field6331)) {
                           return false;
                        }

                        ++var9;
                     }
                  } else {
                     ++var9;
                  }
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field1329[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1329[2] : field1329[1]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(ILlo;IIII)V"
   )
   public static final void method929(int arg0, class168 arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1786;

      try {
         ++field1323;
         if (arg1.field2549 != -1 || arg1.field2546 != null) {
            int var7;
            int var8;
            label207: {
               var7 = arg2;
               var8 = arg1.field2553 * class687.field10213.field514.method1774(480102311) >> 8;
               if (~arg1.field2559 > ~arg3) {
                  var7 = -arg1.field2559 + arg3 + arg2;
                  if (!var6) {
                     break label207;
                  }
               }

               if (~arg1.field2576 < ~arg3) {
                  var7 += -arg3 + arg1.field2576;
               }
            }

            label202: {
               if (arg5 <= arg1.field2547) {
                  if (arg5 >= arg1.field2566) {
                     break label202;
                  }

                  var7 += arg1.field2566 - arg5;
                  if (!var6) {
                     break label202;
                  }
               }

               var7 += -arg1.field2547 + arg5;
            }

            if (arg1.field2554 != 0 && ~(var7 + -256) >= ~arg1.field2554 && class687.field10213.field514.method1774(480102311) != 0 && arg1.field2571 == arg4) {
               var7 -= 256;
               if (~var7 > -1) {
                  var7 = 0;
               }

               int var9 = -arg1.field2563 + arg1.field2554;
               if (~var9 > -1) {
                  var9 = arg1.field2554;
               }

               int var10 = var8;
               int var11 = -arg1.field2563 + var7;
               if (var11 > 0 && var9 > 0) {
                  var10 = (-var11 + var9) * var8 / var9;
               }

               class476.field7251.method61((byte)70);
               int var12 = 8192;
               int var13 = (arg1.field2576 + arg1.field2559) / 2 + -arg3;
               int var14 = (arg1.field2547 - -arg1.field2566) / 2 + -arg5;
               if (~var13 != -1 || var14 != 0) {
                  int var15 = -class317.field4895 + -4096 - (int)(Math.atan2((double)var13, (double)var14) * 2607.5945876176133D) & 16383;
                  if (var15 > 8192) {
                     var15 = -var15 + 16384;
                  }

                  int var16;
                  label180: {
                     if (~var7 < -1) {
                        if (~var7 > -4097) {
                           var16 = 8192 - -(var7 * 8192 / 4096);
                           if (!var6) {
                              break label180;
                           }
                        }

                        var16 = 16384;
                        if (!var6) {
                           break label180;
                        }
                     }

                     var16 = 8192;
                  }

                  var12 = (-var16 + 16384 >> 1) + var15 * var16 / 8192;
               }

               label172: {
                  if (arg1.field2557 == null) {
                     if (~arg1.field2549 > -1) {
                        break label172;
                     }

                     int var17 = ~arg1.field2561 == -257 && arg1.field2570 == 256 ? 256 : class479.method3727((byte)-83, arg1.field2570, arg1.field2561);
                     if (arg1.field2552) {
                        if (arg1.field2548 == null) {
                           arg1.field2548 = class617.method4538(class450.field6891, arg1.field2549);
                        }

                        if (arg1.field2548 == null) {
                           break label172;
                        }

                        if (arg1.field2551 == null) {
                           arg1.field2551 = arg1.field2548.method4536(new int[]{22050});
                        }

                        if (arg1.field2551 == null) {
                           break label172;
                        }

                        class54 var18 = class54.method387(arg1.field2551, var17, var10 << 6, var12);
                        var18.method395(-1);
                        class426.field6579.method4699(var18);
                        arg1.field2557 = var18;
                        if (!var6) {
                           break label172;
                        }
                     }

                     class138 var19 = class138.method1275(class633.field9157, arg1.field2549, 0);
                     if (var19 == null) {
                        break label172;
                     }

                     class184 var20 = var19.method1277().method1665(class80.field1107);
                     class54 var21 = class54.method387(var20, var17, var10 << 6, var12);
                     var21.method395(-1);
                     class426.field6579.method4699(var21);
                     arg1.field2557 = var21;
                     if (!var6) {
                        break label172;
                     }
                  }

                  arg1.field2557.method381(var10);
                  arg1.field2557.method366(var12);
               }

               if (arg1.field2567 == null) {
                  if (arg1.field2546 != null && ~(arg1.field2572 -= arg0) >= -1) {
                     int var22 = arg1.field2561 == 256 && ~arg1.field2570 == -257 ? 256 : (int)(Math.random() * (double)(arg1.field2561 - arg1.field2570)) + arg1.field2570;
                     if (!arg1.field2558) {
                        int var23 = (int)((double)arg1.field2546.length * Math.random());
                        class138 var24 = class138.method1275(class633.field9157, arg1.field2546[var23], 0);
                        if (var24 != null) {
                           class184 var25 = var24.method1277().method1665(class80.field1107);
                           class54 var26 = class54.method387(var25, var22, var10 << 6, var12);
                           var26.method395(0);
                           class426.field6579.method4699(var26);
                           arg1.field2572 = arg1.field2564 - -((int)((double)(arg1.field2569 - arg1.field2564) * Math.random()));
                           arg1.field2567 = var26;
                           return;
                        }
                     } else {
                        if (arg1.field2545 == null) {
                           int var27 = (int)(Math.random() * (double)arg1.field2546.length);
                           arg1.field2545 = class617.method4538(class450.field6891, arg1.field2546[var27]);
                        }

                        if (arg1.field2545 == null) {
                           return;
                        }

                        if (arg1.field2560 == null) {
                           arg1.field2560 = arg1.field2545.method4536(new int[]{22050});
                        }

                        if (arg1.field2560 == null) {
                           return;
                        }

                        class54 var28 = class54.method387(arg1.field2560, var22, var10 << 6, var12);
                        var28.method395(0);
                        class426.field6579.method4699(var28);
                        arg1.field2572 = (int)(Math.random() * (double)(-arg1.field2564 + arg1.field2569)) + arg1.field2564;
                        arg1.field2567 = var28;
                     }

                     return;
                  }
               } else {
                  arg1.field2567.method381(var10);
                  arg1.field2567.method366(var12);
                  if (arg1.field2567.method2478(1001)) {
                     return;
                  }

                  arg1.field2545 = null;
                  arg1.field2567 = null;
                  arg1.field2560 = null;
               }

            } else {
               if (arg1.field2557 != null) {
                  class426.field6579.method4704(arg1.field2557);
                  arg1.field2551 = null;
                  arg1.field2557 = null;
                  arg1.field2548 = null;
               }

               if (arg1.field2567 != null) {
                  class426.field6579.method4704(arg1.field2567);
                  arg1.field2567 = null;
                  arg1.field2560 = null;
                  arg1.field2545 = null;
               }

            }
         }
      } catch (RuntimeException var30) {
         throw class482.method3757(var30, field1329[0] + arg0 + ',' + (arg1 != null ? field1329[2] : field1329[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class92(String arg0) {
      try {
         this.field1324 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1329[4] + (arg0 != null ? field1329[2] : field1329[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method930(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method931(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
