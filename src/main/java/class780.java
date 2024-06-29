import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class780 implements class725 {
   @OriginalMember(
      owner = "client!mo",
      name = "i",
      descriptor = "Lbda;"
   )
   private class531 field11380;
   @OriginalMember(
      owner = "client!mo",
      name = "h",
      descriptor = "I"
   )
   public int field11390;
   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "I"
   )
   public int field11381;
   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "[I"
   )
   public int[] field11382;
   @OriginalMember(
      owner = "client!mo",
      name = "f",
      descriptor = "Laka;"
   )
   private class85 field11383;
   @OriginalMember(
      owner = "client!mo",
      name = "l",
      descriptor = "[F"
   )
   public float[] field11389;
   @OriginalMember(
      owner = "client!mo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11391 = new String[]{method5617(method5616("\u0013\u00149fu")), method5617(method5616("\u0013\u00149\u001e4\u0010\u0012c\u001cu")), method5617(method5616("\u0010\u000e{N")), method5617(method5616("\u0005U9\f ")), method5617(method5616("\u0013\u00149cu")), method5617(method5616("\u0013\u00149au")), method5617(method5616("\u0013\u00149`u"))};
   @OriginalMember(
      owner = "client!mo",
      name = "d",
      descriptor = "I"
   )
   public static int field11379 = -1;
   @OriginalMember(
      owner = "client!mo",
      name = "e",
      descriptor = "I"
   )
   public static int field11384;
   @OriginalMember(
      owner = "client!mo",
      name = "j",
      descriptor = "I"
   )
   public static int field11385;
   @OriginalMember(
      owner = "client!mo",
      name = "k",
      descriptor = "I"
   )
   public static int field11386;
   @OriginalMember(
      owner = "client!mo",
      name = "g",
      descriptor = "I"
   )
   public static int field11387;
   @OriginalMember(
      owner = "client!mo",
      name = "c",
      descriptor = "I"
   )
   public static int field11388;

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "(IIIIIIZZ)V",
      line = 3
   )
   public final void method4581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      try {
         ++field11386;
         class42.method290(arg4, this.field11380.field7719.field8751, arg1, !arg7 ? null : this.field11380.field7760, this.field11390, arg2, arg3, this.field11380.field7719.field8750, arg7 ? this.field11389 : null, arg0, !arg6 ? null : this.field11382, arg5, (byte)-46);
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field11391[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(ZLln;B)V",
      line = 12
   )
   public static final void method5614(boolean arg0, class397 arg1, byte arg2) {
      int var3 = client.field4530;

      try {
         ++field11388;
         class283 var4 = arg1.method3052(20733);
         if (~arg1.field6121 == -1) {
            class149.field1869 = 0;
            class453.field6879 = -1;
            arg1.field6123 = 0;
         } else {
            if (~arg1.field6072 != 0 && ~arg1.field6092 == -1) {
               class676 var5 = class576.field8554.method3189(arg1.field6072, (byte)-53);
               if (arg1.field6119 > 0 && ~var5.field10167 == -1) {
                  class149.field1869 = 0;
                  ++arg1.field6123;
                  class453.field6879 = -1;
                  return;
               }

               if (~arg1.field6119 >= -1 && var5.field10164 == 0) {
                  class149.field1869 = 0;
                  ++arg1.field6123;
                  class453.field6879 = -1;
                  return;
               }
            }

            int var6 = 0;
            class330 var7;
            class676 var8;
            if (var3 != 0) {
               if (~arg1.field6066[var6].field10190 != 0 && class314.field4488 >= arg1.field6066[var6].field10186) {
                  var7 = class619.field9029.method3638(arg1.field6066[var6].field10190, 123);
                  if (var7.field4730 && ~var7.field4721 != 0) {
                     var8 = class576.field8554.method3189(var7.field4721, (byte)-120);
                     if (~arg1.field6119 < -1 && ~var8.field10167 == -1) {
                        ++arg1.field6123;
                        class149.field1869 = 0;
                        class453.field6879 = -1;
                        return;
                     }

                     if (~arg1.field6119 >= -1 && var8.field10164 == 0) {
                        ++arg1.field6123;
                        class149.field1869 = 0;
                        class453.field6879 = -1;
                        return;
                     }
                  }
               }

               ++var6;
            }

            while(true) {
               int var10000;
               byte var10001;
               if (arg1.field6066.length <= var6) {
                  int var9 = arg1.field9003;
                  int var10 = arg1.field9007;
                  var10000 = arg2;
                  var10001 = -1;
                  if (var3 == 0) {
                     if (arg2 != -1) {
                        method5615(18, -49);
                     }

                     int var11;
                     int var12;
                     label417: {
                        var11 = arg1.field6114[arg1.field6121 - 1] * 512 + 256 * arg1.method3046(-127);
                        var12 = arg1.field6116[arg1.field6121 + -1] * 512 - -(256 * arg1.method3046(arg2 ^ -106));
                        if (var9 >= var11) {
                           if (~var9 >= ~var11) {
                              if (var10 < var12) {
                                 arg1.method3045(8192, -18952);
                                 if (var3 == 0) {
                                    break label417;
                                 }
                              }

                              if (var10 <= var12) {
                                 break label417;
                              }

                              arg1.method3045(0, arg2 + -18951);
                              if (var3 == 0) {
                                 break label417;
                              }
                           }

                           if (~var12 < ~var10) {
                              arg1.method3045(6144, -18952);
                              if (var3 == 0) {
                                 break label417;
                              }
                           }

                           if (~var10 >= ~var12) {
                              arg1.method3045(4096, arg2 + -18951);
                              if (var3 == 0) {
                                 break label417;
                              }
                           }

                           arg1.method3045(2048, -18952);
                           if (var3 == 0) {
                              break label417;
                           }
                        }

                        if (var10 < var12) {
                           arg1.method3045(10240, -18952);
                           if (var3 == 0) {
                              break label417;
                           }
                        }

                        if (var10 > var12) {
                           arg1.method3045(14336, -18952);
                           if (var3 == 0) {
                              break label417;
                           }
                        }

                        arg1.method3045(12288, -18952);
                     }

                     byte var13 = arg1.field6113[arg1.field6121 + -1];
                     if (!arg0 && (~(-var9 + var11) < -1025 || -var9 + var11 < -1024 || var12 - var10 > 1024 || ~(-var10 + var12) > 1023)) {
                        arg1.field9007 = var12;
                        arg1.field9003 = var11;
                        arg1.method3048(10, arg1.field6019, false);
                        if (~arg1.field6119 < -1) {
                           --arg1.field6119;
                        }

                        class453.field6879 = -1;
                        --arg1.field6121;
                        class149.field1869 = 0;
                        return;
                     }

                     int var14 = 16;
                     boolean var15 = true;
                     if (arg1 instanceof class155) {
                        var15 = ((class155)arg1).field1971.field5620;
                     }

                     label421: {
                        if (var15) {
                           int var16 = -arg1.field6077.field11424 + arg1.field6019;
                           if (~var16 != -1 && arg1.field6048 == -1 && ~arg1.field6104 != -1) {
                              var14 = 8;
                           }

                           if (!arg0 && arg1.field6121 > 2) {
                              var14 = 24;
                           }

                           if (arg0 || arg1.field6121 <= 3) {
                              break label421;
                           }

                           var14 = 32;
                           if (var3 == 0) {
                              break label421;
                           }
                        }

                        if (!arg0 && ~arg1.field6121 < -2) {
                           var14 = 24;
                        }

                        if (!arg0 && ~arg1.field6121 < -3) {
                           var14 = 32;
                        }
                     }

                     if (arg1.field6123 > 0 && arg1.field6121 > 1) {
                        var14 = 32;
                        --arg1.field6123;
                     }

                     label311: {
                        if (var13 != 2) {
                           if (~var13 != -1) {
                              break label311;
                           }

                           var14 >>= 1;
                           if (var3 == 0) {
                              break label311;
                           }
                        }

                        var14 <<= 1;
                     }

                     if (~var4.field3973 != 0) {
                        label423: {
                           int var17 = var14 << 9;
                           if (~arg1.field6121 == -2) {
                              int var18 = arg1.field6120 * arg1.field6120;
                              int var19 = (var11 < arg1.field9003 ? -var11 + arg1.field9003 : var11 - arg1.field9003) << 9;
                              int var20 = (~arg1.field9007 < ~var12 ? -var12 + arg1.field9007 : -arg1.field9007 + var12) << 9;
                              int var21 = ~var20 > ~var19 ? var19 : var20;
                              int var22 = var4.field3973 * 2 * var21;
                              if (~var18 >= ~var22) {
                                 if (var21 >= var18 / 2) {
                                    if (var17 <= arg1.field6120) {
                                       break label423;
                                    }

                                    arg1.field6120 += var4.field3973;
                                    if (var17 >= arg1.field6120) {
                                       break label423;
                                    }

                                    arg1.field6120 = var17;
                                    if (var3 == 0) {
                                       break label423;
                                    }
                                 }

                                 arg1.field6120 -= var4.field3973;
                                 if (~arg1.field6120 <= -1) {
                                    break label423;
                                 }

                                 arg1.field6120 = 0;
                                 if (var3 == 0) {
                                    break label423;
                                 }
                              }

                              arg1.field6120 /= 2;
                              if (var3 == 0) {
                                 break label423;
                              }
                           }

                           if (arg1.field6120 >= var17) {
                              if (~arg1.field6120 >= -1) {
                                 break label423;
                              }

                              arg1.field6120 -= var4.field3973;
                              if (arg1.field6120 >= 0) {
                                 break label423;
                              }

                              arg1.field6120 = 0;
                              if (var3 == 0) {
                                 break label423;
                              }
                           }

                           arg1.field6120 += var4.field3973;
                           if (~arg1.field6120 < ~var17) {
                              arg1.field6120 = var17;
                           }
                        }

                        var14 = arg1.field6120 >> 9;
                        if (~var14 > -2) {
                           var14 = 1;
                        }
                     }

                     label443: {
                        class149.field1869 = 0;
                        if (var9 != var11 || ~var10 != ~var12) {
                           label271: {
                              if (~var9 > ~var11) {
                                 class149.field1869 |= 4;
                                 arg1.field9003 += var14;
                                 if (~var11 <= ~arg1.field9003) {
                                    break label271;
                                 }

                                 arg1.field9003 = var11;
                                 if (var3 == 0) {
                                    break label271;
                                 }
                              }

                              if (~var11 > ~var9) {
                                 arg1.field9003 -= var14;
                                 class149.field1869 |= 8;
                                 if (~arg1.field9003 > ~var11) {
                                    arg1.field9003 = var11;
                                 }
                              }
                           }

                           label264: {
                              if (~var12 >= ~var10) {
                                 if (var10 <= var12) {
                                    break label264;
                                 }

                                 class149.field1869 |= 2;
                                 arg1.field9007 -= var14;
                                 if (~arg1.field9007 <= ~var12) {
                                    break label264;
                                 }

                                 arg1.field9007 = var12;
                                 if (var3 == 0) {
                                    break label264;
                                 }
                              }

                              arg1.field9007 += var14;
                              class149.field1869 |= 1;
                              if (arg1.field9007 > var12) {
                                 arg1.field9007 = var12;
                              }
                           }

                           if (~var14 <= -33) {
                              class453.field6879 = 2;
                              if (var3 == 0) {
                                 break label443;
                              }
                           }

                           class453.field6879 = var13;
                           if (var3 == 0) {
                              break label443;
                           }
                        }

                        class453.field6879 = -1;
                     }

                     if (arg1.field9003 == var11 && ~arg1.field9007 == ~var12) {
                        if (~arg1.field6119 < -1) {
                           --arg1.field6119;
                        }

                        --arg1.field6121;
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = arg1.field6066[var6].field10190;
                  var10001 = -1;
               }

               if ((var10000 ^ var10001) != 0 && class314.field4488 >= arg1.field6066[var6].field10186) {
                  var7 = class619.field9029.method3638(arg1.field6066[var6].field10190, 123);
                  if (var7.field4730 && ~var7.field4721 != 0) {
                     var8 = class576.field8554.method3189(var7.field4721, (byte)-120);
                     if (~arg1.field6119 < -1 && ~var8.field10167 == -1) {
                        ++arg1.field6123;
                        class149.field1869 = 0;
                        class453.field6879 = -1;
                        return;
                     }

                     if (~arg1.field6119 >= -1 && var8.field10164 == 0) {
                        ++arg1.field6123;
                        class149.field1869 = 0;
                        class453.field6879 = -1;
                        return;
                     }
                  }
               }

               ++var6;
            }
         }
      } catch (RuntimeException var24) {
         throw class670.method4877(var24, field11391[5] + arg0 + ',' + (arg1 != null ? field11391[3] : field11391[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(IIIIIIZZ)V",
      line = 342
   )
   public final void method4580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      try {
         class42.method290(arg4, this.field11382, arg1, !arg7 ? null : this.field11389, this.field11380.field7719.field8750, arg2, arg3, this.field11390, !arg7 ? null : this.field11380.field7760, arg0, !arg6 ? null : this.field11380.field7719.field8751, arg5, (byte)-97);
         ++field11385;
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field11391[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(II)V",
      line = 354
   )
   public static final void method5615(int arg0, int arg1) {
      try {
         ++field11384;
         class748 var2 = class413.field6322;
         synchronized(class413.field6322) {
            class413.field6322.method5453(arg0, false);
            int var3 = 54 / ((-64 - arg1) / 41);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11391[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "<init>",
      descriptor = "(Lbda;Lat;Laka;)V",
      line = 374
   )
   public class780(class531 arg0, class396 arg1, class85 arg2) {
      int var4 = client.field4530;
      super();

      try {
         label59: {
            this.field11380 = arg0;
            if (arg1 instanceof class343) {
               class343 var5 = (class343)arg1;
               this.field11390 = var5.field6644;
               this.field11381 = var5.field6641;
               this.field11382 = var5.field5184;
               if (var4 == 0) {
                  break label59;
               }
            }

            if (!(arg1 instanceof class381)) {
               throw new RuntimeException();
            }

            class381 var6 = (class381)arg1;
            this.field11390 = var6.field6644;
            this.field11382 = var6.field5850;
            this.field11381 = var6.field6641;
            if (var4 != 0) {
               throw new RuntimeException();
            }
         }

         if (arg2 != null) {
            this.field11383 = arg2;
            if (~this.field11383.field1045 == ~this.field11390 && ~this.field11383.field1042 == ~this.field11381) {
               this.field11389 = this.field11383.field1041;
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field11391[1] + (arg0 != null ? field11391[3] : field11391[2]) + ',' + (arg1 != null ? field11391[3] : field11391[2]) + ',' + (arg2 != null ? field11391[3] : field11391[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5616(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5617(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
