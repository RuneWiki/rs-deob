import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class152 extends class70 {
   @OriginalMember(
      owner = "client!lp",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2286 = new String[]{method1389(method1388("7\u0017]\u0016%")), method1389(method1388(" I]rp")), method1389(method1388("5\u0012\u001f0")), method1389(method1388("7\u0017]\u0019%")), method1389(method1388("7\u0017]\u001f%")), method1389(method1388("7\u0017]\u0018%")), method1389(method1388("7\u0017]\u001d%")), method1389(method1388("7\u0017]\u0014%"))};
   @OriginalMember(
      owner = "client!lp",
      name = "G",
      descriptor = "I"
   )
   public static int field2277;
   @OriginalMember(
      owner = "client!lp",
      name = "H",
      descriptor = "I"
   )
   public static int field2278;
   @OriginalMember(
      owner = "client!lp",
      name = "K",
      descriptor = "I"
   )
   public static int field2279;
   @OriginalMember(
      owner = "client!lp",
      name = "M",
      descriptor = "I"
   )
   public static int field2281;
   @OriginalMember(
      owner = "client!lp",
      name = "L",
      descriptor = "I"
   )
   public static int field2282;
   @OriginalMember(
      owner = "client!lp",
      name = "I",
      descriptor = "I"
   )
   public static int field2283;
   @OriginalMember(
      owner = "client!lp",
      name = "F",
      descriptor = "I"
   )
   public static int field2284;
   @OriginalMember(
      owner = "client!lp",
      name = "J",
      descriptor = "I"
   )
   public static int field2285;
   @OriginalMember(
      owner = "client!lp",
      name = "N",
      descriptor = "[Leba;"
   )
   private class730[] field2280;

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "([[II)V",
      line = 3
   )
   private final void method1385(int[][] arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field2279;
         int var4 = class678.field10127;
         int var5 = class304.field4744;
         class232.method1996(arg0, 34067);
         class705.method5206((byte)-120, 0, class578.field8547, class50.field637, 0);
         if (arg1 < -87) {
            if (this.field2280 != null) {
               int var6 = 0;
               if (var3 || this.field2280.length > var6) {
                  do {
                     class730 var7 = this.field2280[var6];
                     int var8 = var7.field10892;
                     int var9 = var7.field10896;
                     if (var8 >= 0) {
                        if (~var9 > -1) {
                           var7.method2081(true, var5, var4);
                           if (var3) {
                              var7.method2080(var5, var4, 19856);
                              if (var3) {
                                 if (var9 >= 0) {
                                    var7.method2083(var5, -83, var4);
                                 }

                                 ++var6;
                              } else {
                                 ++var6;
                              }
                           } else {
                              ++var6;
                           }
                        } else {
                           var7.method2080(var5, var4, 19856);
                           if (var3) {
                              if (var9 >= 0) {
                                 var7.method2083(var5, -83, var4);
                              }

                              ++var6;
                           } else {
                              ++var6;
                           }
                        }
                     } else {
                        if (var9 >= 0) {
                           var7.method2083(var5, -83, var4);
                        }

                        ++var6;
                     }
                  } while(this.field2280.length > var6);

               }
            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field2286[3] + (arg0 != null ? field2286[1] : field2286[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(II)[[I",
      line = 52
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field2277;
         if (arg0 != 32) {
            this.method274(23, -76, (class354)null);
         }

         int[][] var4 = super.field918.method3276((byte)101, arg1);
         if (super.field918.field6361) {
            int var5 = class678.field10127;
            int var6 = class304.field4744;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field918.method3271(arg0 ^ 12889);
            this.method1385(var7, -108);
            int var9 = 0;
            if (var3 || ~class304.field4744 < ~var9) {
               do {
                  int[] var10 = var7[var9];
                  int[][] var11 = var8[var9];
                  int[] var12 = var11[0];
                  int[] var13 = var11[1];
                  int[] var14 = var11[2];
                  int var15 = 0;
                  if (var3 || class678.field10127 > var15) {
                     do {
                        int var16 = var10[var15];
                        var14[var15] = class408.method3277(255, var16) << 4;
                        var13[var15] = class408.method3277(var16, 65280) >> 4;
                        var12[var15] = class408.method3277(4080, var16 >> 12);
                        ++var15;
                     } while(class678.field10127 > var15);
                  }

                  ++var9;
               } while(~class304.field4744 < ~var9);
            }
         }

         return var4;
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field2286[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(IBIII)Z",
      line = 120
   )
   public static final boolean method1386(int arg0, byte arg1, int arg2, int arg3, int arg4) {
      try {
         ++field2285;
         if (~(2 & class757.field11211[0][arg4][arg3]) != -1) {
            return true;
         } else if ((16 & class757.field11211[arg2][arg4][arg3]) != 0) {
            return false;
         } else {
            if (arg1 != 39) {
               method1386(-93, (byte)67, -127, 66, -16);
            }

            return ~class629.method4607(arg4, arg2, arg3, (byte)116) == ~arg0;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2286[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(BI)[I",
      line = 141
   )
   public final int[] method8(byte arg0, int arg1) {
      try {
         ++field2282;
         int[] var3 = super.field923.method3718(-2, arg1);
         if (arg0 != 87) {
            this.field2280 = null;
         }

         if (super.field923.field7284) {
            this.method1385(super.field923.method3719((byte)22), -128);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field2286[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(IILica;)V",
      line = 164
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         ++field2278;
         if (~arg1 != arg0) {
            if (~arg1 == -2) {
               super.field933 = arg2.method2855(-31007) == 1;
            }
         } else {
            this.field2280 = new class730[arg2.method2855(-31007)];
            int var5 = 0;
            if (var4 || this.field2280.length > var5) {
               do {
                  int var6 = arg2.method2855(arg0 ^ 31006);
                  if (~var6 != -1) {
                     if (var6 == 1) {
                        this.field2280[var5] = class104.method1005(-1, arg2);
                        if (var4) {
                           this.field2280[var5] = class205.method1791(arg2, -104);
                           if (var4) {
                              this.field2280[var5] = class518.method4001(arg2, -95);
                              ++var5;
                           } else {
                              ++var5;
                           }
                        } else {
                           ++var5;
                        }
                        continue;
                     }

                     if (var6 == 2) {
                        this.field2280[var5] = class205.method1791(arg2, -104);
                        if (var4) {
                           this.field2280[var5] = class518.method4001(arg2, -95);
                           ++var5;
                        } else {
                           ++var5;
                        }
                        continue;
                     }

                     if (~var6 != -4) {
                        ++var5;
                        continue;
                     }

                     if (!var4) {
                        this.field2280[var5] = class518.method4001(arg2, -95);
                        ++var5;
                        continue;
                     }
                  }

                  this.field2280[var5] = class510.method3967(arg2, (byte)-59);
                  if (var4) {
                     this.field2280[var5] = class104.method1005(-1, arg2);
                     if (var4) {
                        this.field2280[var5] = class205.method1791(arg2, -104);
                        if (var4) {
                           this.field2280[var5] = class518.method4001(arg2, -95);
                           ++var5;
                        } else {
                           ++var5;
                        }
                     } else {
                        ++var5;
                     }
                  } else {
                     ++var5;
                  }
               } while(this.field2280.length > var5);

            }
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field2286[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2286[1] : field2286[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "<init>",
      descriptor = "()V",
      line = 237
   )
   public class152() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!lp",
      name = "g",
      descriptor = "(I)V",
      line = 243
   )
   public static final void method1387(int arg0) {
      try {
         label123: {
            ++field2284;
            int var1 = class754.field11172 * 512 + 256;
            int var2 = class621.field9036 * 512 + 256;
            int var3 = class477.method3711(class464.field7054, var1, (byte)0, var2) + -class666.field9975;
            if (class532.field8068 < 100) {
               if (class401.field6288 < var1) {
                  class401.field6288 += (var1 - class401.field6288) * class532.field8068 / 1000 + class148.field2231;
                  if (~class401.field6288 < ~var1) {
                     class401.field6288 = var1;
                  }
               }

               if (~class401.field6288 < ~var1) {
                  class401.field6288 -= (-var1 + class401.field6288) * class532.field8068 / 1000 + class148.field2231;
                  if (class401.field6288 < var1) {
                     class401.field6288 = var1;
                  }
               }

               if (~var3 < ~class653.field9780) {
                  class653.field9780 += (-class653.field9780 + var3) * class532.field8068 / 1000 + class148.field2231;
                  if (~var3 > ~class653.field9780) {
                     class653.field9780 = var3;
                  }
               }

               if (~class653.field9780 < ~var3) {
                  class653.field9780 -= (-var3 + class653.field9780) * class532.field8068 / 1000 + class148.field2231;
                  if (var3 > class653.field9780) {
                     class653.field9780 = var3;
                  }
               }

               if (~class691.field10259 > ~var2) {
                  class691.field10259 += class148.field2231 - -((-class691.field10259 + var2) * class532.field8068 / 1000);
                  if (class691.field10259 > var2) {
                     class691.field10259 = var2;
                  }
               }

               if (~class691.field10259 >= ~var2) {
                  break label123;
               }

               class691.field10259 -= (class691.field10259 - var2) * class532.field8068 / 1000 + class148.field2231;
               if (var2 <= class691.field10259) {
                  break label123;
               }

               class691.field10259 = var2;
               if (!client.field1786) {
                  break label123;
               }
            }

            class691.field10259 = class621.field9036 * 512 + 256;
            class401.field6288 = class754.field11172 * 512 - -256;
            class653.field9780 = class477.method3711(class464.field7054, class401.field6288, (byte)0, class691.field10259) + -class666.field9975;
         }

         int var4 = class459.field7004 * 512 + 256;
         int var5 = class103.field1437 * 512 - -256;
         int var6 = class477.method3711(class464.field7054, var4, (byte)0, var5) + -class400.field6271;
         int var7 = -class401.field6288 + var4;
         int var8 = -class653.field9780 + var6;
         int var9 = -class691.field10259 + var5;
         int var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
         int var11 = (int)(2607.5945876176133D * Math.atan2((double)var8, (double)var10)) & 16383;
         if (~var11 > -1025) {
            var11 = 1024;
         }

         int var12 = 16383 & (int)(-2607.5945876176133D * Math.atan2((double)var7, (double)var9));
         if (~var11 < -3073) {
            var11 = 3072;
         }

         if (~class703.field10589 > ~var11) {
            class703.field10589 += (var11 - class703.field10589 >> 3) * class603.field8817 / 1000 + class85.field1247 << 3;
            if (~var11 > ~class703.field10589) {
               class703.field10589 = var11;
            }
         }

         if (class703.field10589 > var11) {
            class703.field10589 -= (class703.field10589 - var11 >> 3) * class603.field8817 / 1000 + class85.field1247 << 3;
            if (var11 > class703.field10589) {
               class703.field10589 = var11;
            }
         }

         int var13 = -class317.field4895 + var12;
         if (var13 > 8192) {
            var13 -= 16384;
         }

         if (var13 < -8192) {
            var13 += 16384;
         }

         int var14 = var13 >> arg0;
         if (~var14 < -1) {
            class317.field4895 += class603.field8817 * var14 / 1000 + class85.field1247 << 3;
            class317.field4895 &= 16383;
         }

         if (~var14 > -1) {
            class317.field4895 -= -var14 * class603.field8817 / 1000 + class85.field1247 << 3;
            class317.field4895 &= 16383;
         }

         int var15 = -class317.field4895 + var12;
         if (var15 > 8192) {
            var15 -= 16384;
         }

         if (var15 < -8192) {
            var15 += 16384;
         }

         if (var15 < 0 && ~var14 < -1 || ~var15 < -1 && var14 < 0) {
            class317.field4895 = var12;
         }

         class674.field10029 = 0;
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field2286[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1388(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1389(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
