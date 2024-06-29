import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class111 extends class428 {
   @OriginalMember(
      owner = "client!hk",
      name = "p",
      descriptor = "[I"
   )
   public int[] field1391 = new int[]{-1};
   @OriginalMember(
      owner = "client!hk",
      name = "w",
      descriptor = "[I"
   )
   public int[] field1396 = new int[1];
   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1404 = new String[]{method909(method908("0z# )")), method909(method908("%!ab")), method909(method908("#?#H|")), method909(method908("#?#J|")), method909(method908("#?#K|")), method909(method908("#?#L|")), method909(method908("#?#M|")), method909(method908("#?#I|")), method909(method908("#?#O|"))};
   @OriginalMember(
      owner = "client!hk",
      name = "x",
      descriptor = "I"
   )
   public static int field1392 = 0;
   @OriginalMember(
      owner = "client!hk",
      name = "v",
      descriptor = "Llea;"
   )
   public static class639 field1393 = new class639(0, 3);
   @OriginalMember(
      owner = "client!hk",
      name = "o",
      descriptor = "J"
   )
   public static long field1403 = 0L;
   @OriginalMember(
      owner = "client!hk",
      name = "q",
      descriptor = "F"
   )
   public static float field1402;
   @OriginalMember(
      owner = "client!hk",
      name = "s",
      descriptor = "I"
   )
   public static int field1394;
   @OriginalMember(
      owner = "client!hk",
      name = "n",
      descriptor = "I"
   )
   public static int field1395;
   @OriginalMember(
      owner = "client!hk",
      name = "m",
      descriptor = "I"
   )
   public static int field1397;
   @OriginalMember(
      owner = "client!hk",
      name = "u",
      descriptor = "I"
   )
   public static int field1398;
   @OriginalMember(
      owner = "client!hk",
      name = "t",
      descriptor = "I"
   )
   public static int field1399;
   @OriginalMember(
      owner = "client!hk",
      name = "r",
      descriptor = "I"
   )
   public static int field1400;
   @OriginalMember(
      owner = "client!hk",
      name = "y",
      descriptor = "I"
   )
   public static int field1401;

   @OriginalMember(
      owner = "client!hk",
      name = "b",
      descriptor = "(I)V",
      line = 3
   )
   public static final void method901(int arg0) {
      try {
         class50.field660.method532(class603.field8876);
         ++field1394;
         if (arg0 == 64) {
            class50.field660.method492(class285.field3950, class138.field1759, class159.field2267, class679.field9998);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1404[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(I)V",
      line = 19
   )
   public static void method902(int arg0) {
      try {
         if (arg0 >= 13) {
            field1393 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1404[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(Z[III[I)J",
      line = 33
   )
   private final long method903(boolean arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
      boolean var6 = client.field4360;

      try {
         ++field1395;
         long[] var7 = class89.field1158;
         if (arg3 != 24385) {
            method907((byte)107, -83L);
         }

         long var8 = -1L;
         long var10 = var7[(int)(((long)(arg2 >> 8) ^ var8) & 255L)] ^ var8 >>> 8;
         long var12 = var10 >>> 8 ^ var7[(int)((var10 ^ (long)arg2) & 255L)];
         int var14 = 0;
         long var15;
         long var17;
         long var19;
         if (var6) {
            var15 = var7[(int)(255L & ((long)(arg1[var14] >> 24) ^ var12))] ^ var12 >>> 8;
            var17 = var15 >>> 8 ^ var7[(int)(255L & (var15 ^ (long)(arg1[var14] >> 16)))];
            var19 = var7[(int)(255L & (var17 ^ (long)(arg1[var14] >> 8)))] ^ var17 >>> 8;
            var12 = var7[(int)(((long)arg1[var14] ^ var19) & 255L)] ^ var19 >>> 8;
            ++var14;
         }

         while(true) {
            while(~arg1.length < ~var14) {
               var15 = var7[(int)(255L & ((long)(arg1[var14] >> 24) ^ var12))] ^ var12 >>> 8;
               var17 = var15 >>> 8 ^ var7[(int)(255L & (var15 ^ (long)(arg1[var14] >> 16)))];
               var19 = var7[(int)(255L & (var17 ^ (long)(arg1[var14] >> 8)))] ^ var17 >>> 8;
               var12 = var7[(int)(((long)arg1[var14] ^ var19) & 255L)] ^ var19 >>> 8;
               ++var14;
            }

            if (!var6) {
               if (arg4 != null) {
                  int var21 = 0;
                  if (var6 || var21 < 5) {
                     do {
                        var12 = var12 >>> 8 ^ var7[(int)(((long)arg4[var21] ^ var12) & 255L)];
                        ++var21;
                     } while(var21 < 5);
                  }
               }

               return var7[(int)(255L & (var12 ^ (long)(!arg0 ? 0 : 1)))] ^ var12 >>> 8;
            }

            ++var14;
         }
      } catch (RuntimeException var25) {
         throw class237.method1823(var25, field1404[8] + arg0 + ',' + (arg1 != null ? field1404[0] : field1404[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1404[0] : field1404[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(IILsk;ZLdha;IIZLha;I)Lka;",
      line = 77
   )
   public final class500 method904(int arg0, int arg1, class651 arg2, boolean arg3, class85 arg4, int arg5, int arg6, boolean arg7, class66 arg8, int arg9) {
      boolean var11 = client.field4360;

      try {
         ++field1397;
         class500 var12 = null;
         int var13 = arg9;
         class425 var14 = null;
         if (~arg1 != 0) {
            var14 = class780.field11425.method1108(arg1, false);
         }

         int[] var15 = this.field1391;
         int var16;
         int var10000;
         int var17;
         boolean var18;
         boolean var19;
         int var20;
         int var21;
         int var22;
         class106 var23;
         class106 var24;
         int var25;
         int var26;
         int var27;
         int var28;
         long var29;
         int var31;
         byte var32;
         int var33;
         class464[] var34;
         int var35;
         int var36;
         int var37;
         int var38;
         int var39;
         int var40;
         int var41;
         int var42;
         class464 var43;
         int var44;
         int var45;
         class500 var46;
         if (var14 != null) {
            if (var14.field6045 != null) {
               var15 = new int[var14.field6045.length];
               var16 = 0;
               if (var11) {
                  var17 = var14.field6045[var16];
                  if (var17 >= 0) {
                     if (var17 >= this.field1391.length) {
                        var15[var16] = -1;
                        if (var11) {
                           var15[var16] = this.field1391[var17];
                           ++var16;
                        } else {
                           ++var16;
                        }
                     } else {
                        var15[var16] = this.field1391[var17];
                        ++var16;
                     }
                  } else {
                     var15[var16] = -1;
                     if (var11) {
                        var15[var16] = this.field1391[var17];
                        ++var16;
                     } else {
                        ++var16;
                     }
                  }
               }
            } else {
               var16 = 0;
               var17 = 0;
               var18 = false;
               var19 = arg7;
               var20 = -1;
               var21 = -1;
               var22 = 0;
               var23 = null;
               var24 = null;
               if (!var11) {
                  if (arg4 != null) {
                     var13 = arg9 | 32;
                     var25 = arg4.field1102[arg6];
                     var26 = var25 >>> 16;
                     var20 = var25 & 65535;
                     var23 = class190.field2702.method4414(74, var26);
                     if (var23 != null) {
                        var17 |= var23.method872((byte)51, var20);
                        var16 |= var23.method873(0, var20);
                        var19 = arg7 | var23.method869(var20, true);
                        var18 |= arg4.field1117;
                     }

                     if ((arg4.field1125 || class112.field1408) && ~arg0 != 0 && ~arg4.field1102.length < ~arg0) {
                        var27 = arg4.field1102[arg0];
                        var22 = arg4.field1123[arg6];
                        var28 = var27 >>> 16;
                        var21 = var27 & 65535;
                        if (~var26 != ~var28) {
                           var24 = class190.field2702.method4414(107, var21 >>> 16);
                        } else {
                           var24 = var23;
                        }

                        if (var24 != null) {
                           var17 |= var24.method872((byte)51, var21);
                           var16 |= var24.method873(0, var21);
                           var19 |= var24.method869(var21, !arg7);
                        }
                     }

                     if (var17 != 0) {
                        var13 |= 128;
                     }

                     if (var16 != 0) {
                        var13 |= 256;
                     }

                     if (var18) {
                        var13 |= 512;
                     }

                     if (var19) {
                        var13 |= 1024;
                     }
                  }

                  var29 = this.method903(arg3, var15, arg1, 24385, arg2 != null ? arg2.field9548 : null);
                  if (class84.field1088 != null) {
                     var12 = (class500)class84.field1088.method725(0, var29);
                  }

                  if (var12 == null || ~arg8.method531(var12.method214(), var13) != -1) {
                     if (var12 != null) {
                        var13 = arg8.method543(var13, var12.method214());
                     }

                     label874: {
                        var31 = var13;
                        var32 = 0;
                        var33 = 0;
                        if (var11) {
                           var10000 = var15[var33];
                        } else if (~var15.length >= ~var33) {
                           var10000 = var32;
                           if (!var11) {
                              break label874;
                           }
                        } else {
                           var10000 = var15[var33];
                        }

                        while(true) {
                           if (var10000 != -1 && !class468.field6728.method2261(-1, var15[var33]).method2679(4195, (class192)null, arg3)) {
                              var32 = 1;
                           }

                           ++var33;
                           if (~var15.length >= ~var33) {
                              var10000 = var32;
                              if (!var11) {
                                 break;
                              }
                           } else {
                              var10000 = var15[var33];
                           }
                        }
                     }

                     if (var10000 != 0) {
                        return null;
                     }

                     var34 = new class464[var15.length];
                     var35 = 0;
                     if (var11) {
                        if (~var15[var35] != 0) {
                           var34[var35] = class468.field6728.method2261(-1, var15[var35]).method2680(arg3, -10387, (class192)null);
                        }

                        ++var35;
                     }

                     while(true) {
                        while(~var15.length < ~var35) {
                           if (~var15[var35] != 0) {
                              var34[var35] = class468.field6728.method2261(-1, var15[var35]).method2680(arg3, -10387, (class192)null);
                           }

                           ++var35;
                        }

                        if (!var11) {
                           if (var14 != null && var14.field6101 != null) {
                              var36 = 0;
                              if (var11 || var36 < var14.field6101.length) {
                                 do {
                                    if (var14.field6101[var36] != null) {
                                       if (var34[var36] == null && !var11) {
                                          ++var36;
                                       } else {
                                          var37 = var14.field6101[var36][0];
                                          var38 = var14.field6101[var36][1];
                                          var39 = var14.field6101[var36][2];
                                          var40 = var14.field6101[var36][3];
                                          var41 = var14.field6101[var36][4];
                                          var42 = var14.field6101[var36][5];
                                          if (var40 == 0) {
                                             if (~var41 == -1) {
                                                if (var42 != 0) {
                                                   var34[var36].method3369(var42, var41, false, var40);
                                                }
                                             } else {
                                                var34[var36].method3369(var42, var41, false, var40);
                                             }
                                          } else {
                                             var34[var36].method3369(var42, var41, false, var40);
                                          }

                                          if (~var37 == -1) {
                                             if (~var38 == -1) {
                                                if (~var39 != -1) {
                                                   var34[var36].method3376(var39, false, var38, var37);
                                                   ++var36;
                                                } else {
                                                   ++var36;
                                                }
                                             } else {
                                                var34[var36].method3376(var39, false, var38, var37);
                                                ++var36;
                                             }
                                          } else {
                                             var34[var36].method3376(var39, false, var38, var37);
                                             ++var36;
                                          }
                                       }
                                    } else {
                                       ++var36;
                                    }
                                 } while(var36 < var14.field6101.length);
                              }
                           }

                           var43 = new class464(var34, var34.length);
                           if (arg2 != null) {
                              var31 = var13 | 16384;
                           }

                           var12 = arg8.method555(var43, var31, class581.field8551, 64, 850);
                           if (arg2 != null) {
                              var44 = 0;
                              if (var11 || ~var44 > -6) {
                                 do {
                                    var45 = 0;
                                    if (var11) {
                                       if (~arg2.field9548[var44] > ~class589.field8693[var45][var44].length) {
                                          var12.method157(class729.field10680[var45][var44], class589.field8693[var45][var44][arg2.field9548[var44]]);
                                       }

                                       ++var45;
                                    }

                                    while(true) {
                                       while(~var45 > ~class589.field8693.length) {
                                          if (~arg2.field9548[var44] > ~class589.field8693[var45][var44].length) {
                                             var12.method157(class729.field10680[var45][var44], class589.field8693[var45][var44][arg2.field9548[var44]]);
                                          }

                                          ++var45;
                                       }

                                       if (!var11) {
                                          ++var44;
                                          break;
                                       }

                                       ++var45;
                                    }
                                 } while(~var44 > -6);
                              }
                           }

                           if (class84.field1088 != null) {
                              var12.method195(var13);
                              class84.field1088.method723(0, var29, var12);
                           }
                           break;
                        }

                        ++var35;
                     }
                  }

                  if (arg4 != null && var23 != null) {
                     var46 = var12.method159((byte)1, var13, true);
                     var46.method3622(arg4.field1117, var20, var23, var21, 30379, var22, arg5 - 1, 0, var24);
                     return var46;
                  }

                  return var12;
               }

               if (var17 >= 0) {
                  if (var17 >= this.field1391.length) {
                     var15[var16] = -1;
                     if (var11) {
                        var15[var16] = this.field1391[var17];
                        ++var16;
                     } else {
                        ++var16;
                     }
                  } else {
                     var15[var16] = this.field1391[var17];
                     ++var16;
                  }
               } else {
                  var15[var16] = -1;
                  if (var11) {
                     var15[var16] = this.field1391[var17];
                     ++var16;
                  } else {
                     ++var16;
                  }
               }
            }
         } else {
            var16 = 0;
            var17 = 0;
            var18 = false;
            var19 = arg7;
            var20 = -1;
            var21 = -1;
            var22 = 0;
            var23 = null;
            var24 = null;
            if (!var11) {
               if (arg4 != null) {
                  var13 = arg9 | 32;
                  var25 = arg4.field1102[arg6];
                  var26 = var25 >>> 16;
                  var20 = var25 & 65535;
                  var23 = class190.field2702.method4414(74, var26);
                  if (var23 != null) {
                     var17 |= var23.method872((byte)51, var20);
                     var16 |= var23.method873(0, var20);
                     var19 = arg7 | var23.method869(var20, true);
                     var18 |= arg4.field1117;
                  }

                  if ((arg4.field1125 || class112.field1408) && ~arg0 != 0 && ~arg4.field1102.length < ~arg0) {
                     var27 = arg4.field1102[arg0];
                     var22 = arg4.field1123[arg6];
                     var28 = var27 >>> 16;
                     var21 = var27 & 65535;
                     if (~var26 != ~var28) {
                        var24 = class190.field2702.method4414(107, var21 >>> 16);
                     } else {
                        var24 = var23;
                     }

                     if (var24 != null) {
                        var17 |= var24.method872((byte)51, var21);
                        var16 |= var24.method873(0, var21);
                        var19 |= var24.method869(var21, !arg7);
                     }
                  }

                  if (var17 != 0) {
                     var13 |= 128;
                  }

                  if (var16 != 0) {
                     var13 |= 256;
                  }

                  if (var18) {
                     var13 |= 512;
                  }

                  if (var19) {
                     var13 |= 1024;
                  }
               }

               var29 = this.method903(arg3, var15, arg1, 24385, arg2 != null ? arg2.field9548 : null);
               if (class84.field1088 != null) {
                  var12 = (class500)class84.field1088.method725(0, var29);
               }

               if (var12 == null || ~arg8.method531(var12.method214(), var13) != -1) {
                  if (var12 != null) {
                     var13 = arg8.method543(var13, var12.method214());
                  }

                  label514: {
                     var31 = var13;
                     var32 = 0;
                     var33 = 0;
                     if (var11) {
                        var10000 = var15[var33];
                     } else if (~var15.length >= ~var33) {
                        var10000 = var32;
                        if (!var11) {
                           break label514;
                        }
                     } else {
                        var10000 = var15[var33];
                     }

                     while(true) {
                        if (var10000 != -1 && !class468.field6728.method2261(-1, var15[var33]).method2679(4195, (class192)null, arg3)) {
                           var32 = 1;
                        }

                        ++var33;
                        if (~var15.length >= ~var33) {
                           var10000 = var32;
                           if (!var11) {
                              break;
                           }
                        } else {
                           var10000 = var15[var33];
                        }
                     }
                  }

                  if (var10000 != 0) {
                     return null;
                  }

                  var34 = new class464[var15.length];
                  var35 = 0;
                  if (var11) {
                     if (~var15[var35] != 0) {
                        var34[var35] = class468.field6728.method2261(-1, var15[var35]).method2680(arg3, -10387, (class192)null);
                     }

                     ++var35;
                  }

                  while(true) {
                     while(~var15.length < ~var35) {
                        if (~var15[var35] != 0) {
                           var34[var35] = class468.field6728.method2261(-1, var15[var35]).method2680(arg3, -10387, (class192)null);
                        }

                        ++var35;
                     }

                     if (!var11) {
                        if (var14 != null && var14.field6101 != null) {
                           var36 = 0;
                           if (var11 || var36 < var14.field6101.length) {
                              do {
                                 if (var14.field6101[var36] != null) {
                                    if (var34[var36] == null && !var11) {
                                       ++var36;
                                    } else {
                                       var37 = var14.field6101[var36][0];
                                       var38 = var14.field6101[var36][1];
                                       var39 = var14.field6101[var36][2];
                                       var40 = var14.field6101[var36][3];
                                       var41 = var14.field6101[var36][4];
                                       var42 = var14.field6101[var36][5];
                                       if (var40 == 0) {
                                          if (~var41 == -1) {
                                             if (var42 != 0) {
                                                var34[var36].method3369(var42, var41, false, var40);
                                             }
                                          } else {
                                             var34[var36].method3369(var42, var41, false, var40);
                                          }
                                       } else {
                                          var34[var36].method3369(var42, var41, false, var40);
                                       }

                                       if (~var37 == -1) {
                                          if (~var38 == -1) {
                                             if (~var39 != -1) {
                                                var34[var36].method3376(var39, false, var38, var37);
                                                ++var36;
                                             } else {
                                                ++var36;
                                             }
                                          } else {
                                             var34[var36].method3376(var39, false, var38, var37);
                                             ++var36;
                                          }
                                       } else {
                                          var34[var36].method3376(var39, false, var38, var37);
                                          ++var36;
                                       }
                                    }
                                 } else {
                                    ++var36;
                                 }
                              } while(var36 < var14.field6101.length);
                           }
                        }

                        var43 = new class464(var34, var34.length);
                        if (arg2 != null) {
                           var31 = var13 | 16384;
                        }

                        var12 = arg8.method555(var43, var31, class581.field8551, 64, 850);
                        if (arg2 != null) {
                           var44 = 0;
                           if (var11 || ~var44 > -6) {
                              do {
                                 var45 = 0;
                                 if (var11) {
                                    if (~arg2.field9548[var44] > ~class589.field8693[var45][var44].length) {
                                       var12.method157(class729.field10680[var45][var44], class589.field8693[var45][var44][arg2.field9548[var44]]);
                                    }

                                    ++var45;
                                 }

                                 while(true) {
                                    while(~var45 > ~class589.field8693.length) {
                                       if (~arg2.field9548[var44] > ~class589.field8693[var45][var44].length) {
                                          var12.method157(class729.field10680[var45][var44], class589.field8693[var45][var44][arg2.field9548[var44]]);
                                       }

                                       ++var45;
                                    }

                                    if (!var11) {
                                       ++var44;
                                       break;
                                    }

                                    ++var45;
                                 }
                              } while(~var44 > -6);
                           }
                        }

                        if (class84.field1088 != null) {
                           var12.method195(var13);
                           class84.field1088.method723(0, var29, var12);
                        }
                        break;
                     }

                     ++var35;
                  }
               }

               if (arg4 != null && var23 != null) {
                  var46 = var12.method159((byte)1, var13, true);
                  var46.method3622(arg4.field1117, var20, var23, var21, 30379, var22, arg5 - 1, 0, var24);
                  return var46;
               }

               return var12;
            }

            if (var17 >= 0) {
               if (var17 >= this.field1391.length) {
                  var15[var16] = -1;
                  if (var11) {
                     var15[var16] = this.field1391[var17];
                     ++var16;
                  } else {
                     ++var16;
                  }
               } else {
                  var15[var16] = this.field1391[var17];
                  ++var16;
               }
            } else {
               var15[var16] = -1;
               if (var11) {
                  var15[var16] = this.field1391[var17];
                  ++var16;
               } else {
                  ++var16;
               }
            }
         }

         while(true) {
            while(var16 < var14.field6045.length) {
               var17 = var14.field6045[var16];
               if (var17 >= 0) {
                  if (var17 >= this.field1391.length) {
                     var15[var16] = -1;
                     if (var11) {
                        var15[var16] = this.field1391[var17];
                        ++var16;
                     } else {
                        ++var16;
                     }
                  } else {
                     var15[var16] = this.field1391[var17];
                     ++var16;
                  }
               } else {
                  var15[var16] = -1;
                  if (var11) {
                     var15[var16] = this.field1391[var17];
                     ++var16;
                  } else {
                     ++var16;
                  }
               }
            }

            var16 = 0;
            var17 = 0;
            var18 = false;
            var19 = arg7;
            var20 = -1;
            var21 = -1;
            var22 = 0;
            var23 = null;
            var24 = null;
            if (!var11) {
               if (arg4 != null) {
                  var13 = arg9 | 32;
                  var25 = arg4.field1102[arg6];
                  var26 = var25 >>> 16;
                  var20 = var25 & 65535;
                  var23 = class190.field2702.method4414(74, var26);
                  if (var23 != null) {
                     var17 |= var23.method872((byte)51, var20);
                     var16 |= var23.method873(0, var20);
                     var19 = arg7 | var23.method869(var20, true);
                     var18 |= arg4.field1117;
                  }

                  if ((arg4.field1125 || class112.field1408) && ~arg0 != 0 && ~arg4.field1102.length < ~arg0) {
                     var27 = arg4.field1102[arg0];
                     var22 = arg4.field1123[arg6];
                     var28 = var27 >>> 16;
                     var21 = var27 & 65535;
                     if (~var26 != ~var28) {
                        var24 = class190.field2702.method4414(107, var21 >>> 16);
                     } else {
                        var24 = var23;
                     }

                     if (var24 != null) {
                        var17 |= var24.method872((byte)51, var21);
                        var16 |= var24.method873(0, var21);
                        var19 |= var24.method869(var21, !arg7);
                     }
                  }

                  if (var17 != 0) {
                     var13 |= 128;
                  }

                  if (var16 != 0) {
                     var13 |= 256;
                  }

                  if (var18) {
                     var13 |= 512;
                  }

                  if (var19) {
                     var13 |= 1024;
                  }
               }

               var29 = this.method903(arg3, var15, arg1, 24385, arg2 != null ? arg2.field9548 : null);
               if (class84.field1088 != null) {
                  var12 = (class500)class84.field1088.method725(0, var29);
               }

               if (var12 == null || ~arg8.method531(var12.method214(), var13) != -1) {
                  if (var12 != null) {
                     var13 = arg8.method543(var13, var12.method214());
                  }

                  label302: {
                     var31 = var13;
                     var32 = 0;
                     var33 = 0;
                     if (var11) {
                        var10000 = var15[var33];
                     } else if (~var15.length >= ~var33) {
                        var10000 = var32;
                        if (!var11) {
                           break label302;
                        }
                     } else {
                        var10000 = var15[var33];
                     }

                     while(true) {
                        if (var10000 != -1 && !class468.field6728.method2261(-1, var15[var33]).method2679(4195, (class192)null, arg3)) {
                           var32 = 1;
                        }

                        ++var33;
                        if (~var15.length >= ~var33) {
                           var10000 = var32;
                           if (!var11) {
                              break;
                           }
                        } else {
                           var10000 = var15[var33];
                        }
                     }
                  }

                  if (var10000 != 0) {
                     return null;
                  }

                  var34 = new class464[var15.length];
                  var35 = 0;
                  if (var11) {
                     if (~var15[var35] != 0) {
                        var34[var35] = class468.field6728.method2261(-1, var15[var35]).method2680(arg3, -10387, (class192)null);
                     }

                     ++var35;
                  }

                  while(true) {
                     while(~var15.length < ~var35) {
                        if (~var15[var35] != 0) {
                           var34[var35] = class468.field6728.method2261(-1, var15[var35]).method2680(arg3, -10387, (class192)null);
                        }

                        ++var35;
                     }

                     if (!var11) {
                        if (var14 != null && var14.field6101 != null) {
                           var36 = 0;
                           if (var11 || var36 < var14.field6101.length) {
                              do {
                                 if (var14.field6101[var36] != null) {
                                    if (var34[var36] == null && !var11) {
                                       ++var36;
                                    } else {
                                       var37 = var14.field6101[var36][0];
                                       var38 = var14.field6101[var36][1];
                                       var39 = var14.field6101[var36][2];
                                       var40 = var14.field6101[var36][3];
                                       var41 = var14.field6101[var36][4];
                                       var42 = var14.field6101[var36][5];
                                       if (var40 == 0) {
                                          if (~var41 == -1) {
                                             if (var42 != 0) {
                                                var34[var36].method3369(var42, var41, false, var40);
                                             }
                                          } else {
                                             var34[var36].method3369(var42, var41, false, var40);
                                          }
                                       } else {
                                          var34[var36].method3369(var42, var41, false, var40);
                                       }

                                       if (~var37 == -1) {
                                          if (~var38 == -1) {
                                             if (~var39 != -1) {
                                                var34[var36].method3376(var39, false, var38, var37);
                                                ++var36;
                                             } else {
                                                ++var36;
                                             }
                                          } else {
                                             var34[var36].method3376(var39, false, var38, var37);
                                             ++var36;
                                          }
                                       } else {
                                          var34[var36].method3376(var39, false, var38, var37);
                                          ++var36;
                                       }
                                    }
                                 } else {
                                    ++var36;
                                 }
                              } while(var36 < var14.field6101.length);
                           }
                        }

                        var43 = new class464(var34, var34.length);
                        if (arg2 != null) {
                           var31 = var13 | 16384;
                        }

                        var12 = arg8.method555(var43, var31, class581.field8551, 64, 850);
                        if (arg2 != null) {
                           var44 = 0;
                           if (var11 || ~var44 > -6) {
                              do {
                                 var45 = 0;
                                 if (var11) {
                                    if (~arg2.field9548[var44] > ~class589.field8693[var45][var44].length) {
                                       var12.method157(class729.field10680[var45][var44], class589.field8693[var45][var44][arg2.field9548[var44]]);
                                    }

                                    ++var45;
                                 }

                                 while(true) {
                                    while(~var45 > ~class589.field8693.length) {
                                       if (~arg2.field9548[var44] > ~class589.field8693[var45][var44].length) {
                                          var12.method157(class729.field10680[var45][var44], class589.field8693[var45][var44][arg2.field9548[var44]]);
                                       }

                                       ++var45;
                                    }

                                    if (!var11) {
                                       ++var44;
                                       break;
                                    }

                                    ++var45;
                                 }
                              } while(~var44 > -6);
                           }
                        }

                        if (class84.field1088 != null) {
                           var12.method195(var13);
                           class84.field1088.method723(0, var29, var12);
                        }
                        break;
                     }

                     ++var35;
                  }
               }

               if (arg4 != null && var23 != null) {
                  var46 = var12.method159((byte)1, var13, true);
                  var46.method3622(arg4.field1117, var20, var23, var21, 30379, var22, arg5 - 1, 0, var24);
                  return var46;
               }

               return var12;
            }

            if (var17 >= 0) {
               if (var17 >= this.field1391.length) {
                  var15[var16] = -1;
                  if (var11) {
                     var15[var16] = this.field1391[var17];
                     ++var16;
                  } else {
                     ++var16;
                  }
               } else {
                  var15[var16] = this.field1391[var17];
                  ++var16;
               }
            } else {
               var15[var16] = -1;
               if (var11) {
                  var15[var16] = this.field1391[var17];
                  ++var16;
               } else {
                  ++var16;
               }
            }
         }
      } catch (RuntimeException var48) {
         throw class237.method1823(var48, field1404[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1404[0] : field1404[1]) + ',' + arg3 + ',' + (arg4 != null ? field1404[0] : field1404[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field1404[0] : field1404[1]) + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(IIIIIIIII)Z",
      line = 328
   )
   public static final boolean method905(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field1400;
         if (arg8 - -arg2 > arg3 && ~arg8 > ~(arg3 - -arg7)) {
            if (~arg4 > ~(arg0 + arg5) && arg1 + arg4 > arg0) {
               if (arg6 >= -74) {
                  field1403 = 3L;
               }

               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field1404[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(IIIIILrba;)V",
      line = 346
   )
   public static final void method906(int arg0, int arg1, int arg2, int arg3, int arg4, class460 arg5) {
      boolean var6 = client.field4360;

      try {
         ++field1399;
         if (~arg5.field6611 != 0 || arg5.field6617 != null) {
            if (arg4 == -371769232) {
               int var7;
               int var8;
               label209: {
                  var7 = 0;
                  var8 = arg5.field6607 * class300.field4107.field6438.method4286(arg4 + 371769209) >> 8;
                  if (arg0 > arg5.field6620) {
                     var7 += -arg5.field6620 + arg0;
                     if (!var6) {
                        break label209;
                     }
                  }

                  if (~arg5.field6628 < ~arg0) {
                     var7 += -arg0 + arg5.field6628;
                  }
               }

               label204: {
                  if (arg5.field6605 >= arg2) {
                     if (~arg2 <= ~arg5.field6618) {
                        break label204;
                     }

                     var7 += -arg2 + arg5.field6618;
                     if (!var6) {
                        break label204;
                     }
                  }

                  var7 += -arg5.field6605 + arg2;
               }

               if (arg5.field6602 != 0 && arg5.field6602 >= var7 + -256 && class300.field4107.field6438.method4286(-102) != 0 && ~arg5.field6630 == ~arg3) {
                  var7 -= 256;
                  if (var7 < 0) {
                     var7 = 0;
                  }

                  int var9 = -arg5.field6627 + arg5.field6602;
                  if (var9 < 0) {
                     var9 = arg5.field6602;
                  }

                  int var10 = var8;
                  int var11 = -arg5.field6627 + var7;
                  if (var11 > 0 && ~var9 < -1) {
                     var10 = (var9 - var11) * var8 / var9;
                  }

                  class564.field8045.method972(arg4 ^ 371769231);
                  int var12 = 8192;
                  int var13 = (arg5.field6628 + arg5.field6620) / 2 + -arg0;
                  int var14 = (arg5.field6618 + arg5.field6605) / 2 + -arg2;
                  if (var13 != 0 || ~var14 != -1) {
                     int var15 = 16383 & -class10.field96 - (int)(Math.atan2((double)var13, (double)var14) * 2607.5945876176133D) - 4096;
                     if (var15 > 8192) {
                        var15 = 16384 - var15;
                     }

                     int var16;
                     label182: {
                        if (var7 > 0) {
                           if (~var7 <= -4097) {
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

                     var12 = (-var16 + 16384 >> 1) + var15 * var16 / 8192;
                  }

                  label174: {
                     if (arg5.field6614 == null) {
                        if (arg5.field6611 < 0) {
                           break label174;
                        }

                        int var17 = arg5.field6606 == 256 && ~arg5.field6634 == -257 ? 256 : class648.method4721(arg5.field6634, arg5.field6606, -49);
                        if (arg5.field6615) {
                           if (arg5.field6621 == null) {
                              arg5.field6621 = class332.method2452(class525.field7531, arg5.field6611);
                           }

                           if (arg5.field6621 == null) {
                              break label174;
                           }

                           if (arg5.field6609 == null) {
                              arg5.field6609 = arg5.field6621.method2458(new int[]{22050});
                           }

                           if (arg5.field6609 == null) {
                              break label174;
                           }

                           class248 var18 = class248.method1886(arg5.field6609, var17, var10 << 6, var12);
                           var18.method1898(-1);
                           class280.field3897.method4814(var18);
                           arg5.field6614 = var18;
                           if (!var6) {
                              break label174;
                           }
                        }

                        class344 var19 = class344.method2524(class146.field1852, arg5.field6611, 0);
                        if (var19 == null) {
                           break label174;
                        }

                        class289 var20 = var19.method2522().method2182(class472.field6810);
                        class248 var21 = class248.method1886(var20, var17, var10 << 6, var12);
                        var21.method1898(-1);
                        class280.field3897.method4814(var21);
                        arg5.field6614 = var21;
                        if (!var6) {
                           break label174;
                        }
                     }

                     arg5.field6614.method1916(var10);
                     arg5.field6614.method1918(var12);
                  }

                  if (arg5.field6603 == null) {
                     if (arg5.field6617 != null && ~(arg5.field6619 -= arg1) >= -1) {
                        int var22 = ~arg5.field6606 == -257 && arg5.field6634 == 256 ? 256 : arg5.field6634 + (int)(Math.random() * (double)(-arg5.field6634 + arg5.field6606));
                        if (!arg5.field6610) {
                           int var23 = (int)((double)arg5.field6617.length * Math.random());
                           class344 var24 = class344.method2524(class146.field1852, arg5.field6617[var23], 0);
                           if (var24 != null) {
                              class289 var25 = var24.method2522().method2182(class472.field6810);
                              class248 var26 = class248.method1886(var25, var22, var10 << 6, var12);
                              var26.method1898(0);
                              class280.field3897.method4814(var26);
                              arg5.field6619 = (int)((double)(-arg5.field6608 + arg5.field6623) * Math.random()) + arg5.field6608;
                              arg5.field6603 = var26;
                              return;
                           }
                        } else {
                           if (arg5.field6625 == null) {
                              int var27 = (int)((double)arg5.field6617.length * Math.random());
                              arg5.field6625 = class332.method2452(class525.field7531, arg5.field6617[var27]);
                           }

                           if (arg5.field6625 == null) {
                              return;
                           }

                           if (arg5.field6613 == null) {
                              arg5.field6613 = arg5.field6625.method2458(new int[]{22050});
                           }

                           if (arg5.field6613 == null) {
                              return;
                           }

                           class248 var28 = class248.method1886(arg5.field6613, var22, var10 << 6, var12);
                           var28.method1898(0);
                           class280.field3897.method4814(var28);
                           arg5.field6603 = var28;
                           arg5.field6619 = (int)((double)(-arg5.field6608 + arg5.field6623) * Math.random()) + arg5.field6608;
                        }

                        return;
                     }
                  } else {
                     arg5.field6603.method1916(var10);
                     arg5.field6603.method1918(var12);
                     if (arg5.field6603.method3169(-11402)) {
                        return;
                     }

                     arg5.field6613 = null;
                     arg5.field6603 = null;
                     arg5.field6625 = null;
                  }

               } else {
                  if (arg5.field6614 != null) {
                     class280.field3897.method4815(arg5.field6614);
                     arg5.field6621 = null;
                     arg5.field6614 = null;
                     arg5.field6609 = null;
                  }

                  if (arg5.field6603 != null) {
                     class280.field3897.method4815(arg5.field6603);
                     arg5.field6603 = null;
                     arg5.field6613 = null;
                     arg5.field6625 = null;
                  }

               }
            }
         }
      } catch (RuntimeException var30) {
         throw class237.method1823(var30, field1404[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1404[0] : field1404[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(BJ)V",
      line = 625
   )
   public static final void method907(byte arg0, long arg1) {
      try {
         class176.field2442.setTime(new Date(arg1));
         if (arg0 < -26) {
            ++field1398;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1404[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method908(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method909(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
