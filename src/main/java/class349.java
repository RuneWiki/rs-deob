import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class349 extends class22 {
   @OriginalMember(
      owner = "client!pba",
      name = "o",
      descriptor = "[I"
   )
   public int[] field4964 = new int[1];
   @OriginalMember(
      owner = "client!pba",
      name = "n",
      descriptor = "[I"
   )
   public int[] field4963 = new int[]{-1};
   @OriginalMember(
      owner = "client!pba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4969 = new String[]{method2699(method2698("juu(b2")), method2699(method2698("tbxj")), method2699(method2698("a9:(X")), method2699(method2698("juu(a2")), method2699(method2698("ituv@:zuoK")), method2699(method2698("rbr`H{y")), method2699(method2698("juu(f2")), method2699(method2698("juu(d2")), method2699(method2698("juu(`2")), method2699(method2698("juu(c2")), method2699(method2698("juu(m2")), method2699(method2698("juu(g2"))};
   @OriginalMember(
      owner = "client!pba",
      name = "u",
      descriptor = "I"
   )
   public static int field4962 = -1;
   @OriginalMember(
      owner = "client!pba",
      name = "q",
      descriptor = "Lgh;"
   )
   public static class572 field4956 = new class572(38, 1);
   @OriginalMember(
      owner = "client!pba",
      name = "s",
      descriptor = "Z"
   )
   public static boolean field4967 = false;
   @OriginalMember(
      owner = "client!pba",
      name = "p",
      descriptor = "I"
   )
   public static int field4968 = -2;
   @OriginalMember(
      owner = "client!pba",
      name = "t",
      descriptor = "I"
   )
   public static int field4957;
   @OriginalMember(
      owner = "client!pba",
      name = "m",
      descriptor = "I"
   )
   public static int field4958;
   @OriginalMember(
      owner = "client!pba",
      name = "j",
      descriptor = "I"
   )
   public static int field4959;
   @OriginalMember(
      owner = "client!pba",
      name = "v",
      descriptor = "I"
   )
   public static int field4960;
   @OriginalMember(
      owner = "client!pba",
      name = "l",
      descriptor = "I"
   )
   public static int field4961;
   @OriginalMember(
      owner = "client!pba",
      name = "k",
      descriptor = "I"
   )
   public static int field4965;
   @OriginalMember(
      owner = "client!pba",
      name = "r",
      descriptor = "I"
   )
   public static int field4966;

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method2690(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4564;

      try {
         ++field4959;
         int var4 = 1;
         if (var3) {
            if ((1 & arg1) != 0) {
               var4 = arg0 * var4;
            }

            arg0 *= arg0;
            arg1 >>= 1;
         }

         while(true) {
            int var10000;
            int var10001;
            if (~arg1 >= -2) {
               var10000 = arg1;
               var10001 = 1;
               if (!var3) {
                  if (arg1 == 1) {
                     return arg0 * var4;
                  }

                  if (arg2 != -8739) {
                     return -127;
                  }

                  return var4;
               }
            } else {
               var10000 = 1;
               var10001 = arg1;
            }

            if ((var10000 & var10001) != 0) {
               var4 = arg0 * var4;
            }

            arg0 *= arg0;
            arg1 >>= 1;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4969[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(JII)Ljava/lang/String;"
   )
   public static final String method2691(long arg0, int arg1, int arg2) {
      try {
         ++field4961;
         class62.method673(arg0, (byte)51);
         int var4 = class62.field1161.get(5);
         int var5 = -29 % ((arg2 - -53) / 38);
         int var6 = class62.field1161.get(2);
         int var7 = class62.field1161.get(1);
         return arg1 == 3 ? class752.method5445(arg0, false, arg1) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class459.field6726[arg1][var6] + "-" + var7;
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field4969[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(Ltw;ILha;ZIIILkd;II)Lka;"
   )
   public final class495 method2692(class212 arg0, int arg1, class65 arg2, boolean arg3, int arg4, int arg5, int arg6, class295 arg7, int arg8, int arg9) {
      boolean var11 = client.field4564;

      try {
         ++field4958;
         class495 var12 = null;
         int var13 = arg8;
         class654 var14 = null;
         if (arg5 != -1) {
            var14 = class424.field6167.method1731(arg5, (byte)-26);
         }

         int[] var15 = this.field4963;
         int var16;
         int var10000;
         int var17;
         boolean var18;
         boolean var19;
         int var20;
         int var21;
         int var22;
         class513 var23;
         class513 var24;
         int var25;
         int var26;
         int var27;
         int var28;
         long var29;
         int var31;
         byte var32;
         int var33;
         class668[] var34;
         int var35;
         int var36;
         int var37;
         int var38;
         int var39;
         int var40;
         int var41;
         int var42;
         class668 var43;
         int var44;
         int var45;
         class495 var46;
         if (var14 != null) {
            if (var14.field9496 != null) {
               var15 = new int[var14.field9496.length];
               var16 = 0;
               if (var11) {
                  var17 = var14.field9496[var16];
                  if (var17 >= 0) {
                     if (this.field4963.length <= var17) {
                        var15[var16] = -1;
                        if (var11) {
                           var15[var16] = this.field4963[var17];
                           ++var16;
                        } else {
                           ++var16;
                        }
                     } else {
                        var15[var16] = this.field4963[var17];
                        ++var16;
                     }
                  } else {
                     var15[var16] = -1;
                     if (var11) {
                        var15[var16] = this.field4963[var17];
                        ++var16;
                     } else {
                        ++var16;
                     }
                  }
               }
            } else {
               var16 = 0;
               var17 = 0;
               if (!var11) {
                  if (arg4 != 610855664) {
                     return null;
                  }

                  var18 = false;
                  var19 = false;
                  var20 = -1;
                  var21 = -1;
                  var22 = 0;
                  var23 = null;
                  var24 = null;
                  if (arg7 != null) {
                     var25 = arg7.field4136[arg1];
                     var13 = arg8 | 32;
                     var26 = var25 >>> 16;
                     var20 = var25 & 65535;
                     var23 = class588.field8496.method3776(var26, 18);
                     if (var23 != null) {
                        var17 |= var23.method3879(-1, var20);
                        var16 |= var23.method3880((byte)44, var20);
                        var19 |= var23.method3881(76, var20);
                        var18 |= arg7.field4116;
                     }

                     if ((arg7.field4131 || class408.field6000) && arg9 != -1 && ~arg7.field4136.length < ~arg9) {
                        var22 = arg7.field4128[arg1];
                        var27 = arg7.field4136[arg9];
                        var28 = var27 >>> 16;
                        var21 = var27 & 65535;
                        if (var26 != var28) {
                           var24 = class588.field8496.method3776(var21 >>> 16, 18);
                        } else {
                           var24 = var23;
                        }

                        if (var24 != null) {
                           var17 |= var24.method3879(-1, var21);
                           var16 |= var24.method3880((byte)44, var21);
                           var19 |= var24.method3881(-118, var21);
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

                  var29 = this.method2693(arg3, var15, arg0 != null ? arg0.field3174 : null, arg5, (byte)-110);
                  if (class283.field3959 != null) {
                     var12 = (class495)class283.field3959.method1584(var29, 1);
                  }

                  if (var12 == null || ~arg2.method269(var12.method510(), var13) != -1) {
                     if (var12 != null) {
                        var13 = arg2.method354(var13, var12.method510());
                     }

                     var31 = var13;
                     var32 = 0;
                     var33 = 0;
                     if (var11) {
                        if (~var15[var33] != 0 && !class408.field5993.method845((byte)99, var15[var33]).method3299((class589)null, arg3, 0)) {
                           var32 = 1;
                        }

                        ++var33;
                     }

                     label853:
                     while(true) {
                        if (~var15.length >= ~var33) {
                           var10000 = var32;
                           if (!var11) {
                              if (var32 != 0) {
                                 return null;
                              }

                              var34 = new class668[var15.length];
                              var35 = 0;
                              if (var11) {
                                 if (~var15[var35] != 0) {
                                    var34[var35] = class408.field5993.method845((byte)-51, var15[var35]).method3291((class589)null, 32, arg3);
                                 }

                                 ++var35;
                              }

                              while(true) {
                                 while(~var15.length < ~var35) {
                                    if (~var15[var35] != 0) {
                                       var34[var35] = class408.field5993.method845((byte)-51, var15[var35]).method3291((class589)null, 32, arg3);
                                    }

                                    ++var35;
                                 }

                                 if (!var11) {
                                    if (var14 != null && var14.field9532 != null) {
                                       var36 = 0;
                                       if (var11 || ~var36 > ~var14.field9532.length) {
                                          do {
                                             if (var14.field9532[var36] != null) {
                                                if (var34[var36] == null && !var11) {
                                                   ++var36;
                                                } else {
                                                   var37 = var14.field9532[var36][0];
                                                   var38 = var14.field9532[var36][1];
                                                   var39 = var14.field9532[var36][2];
                                                   var40 = var14.field9532[var36][3];
                                                   var41 = var14.field9532[var36][4];
                                                   var42 = var14.field9532[var36][5];
                                                   if (var40 == 0) {
                                                      if (var41 == 0) {
                                                         if (var42 != 0) {
                                                            var34[var36].method4873(var41, var40, var42, (byte)-49);
                                                         }
                                                      } else {
                                                         var34[var36].method4873(var41, var40, var42, (byte)-49);
                                                      }
                                                   } else {
                                                      var34[var36].method4873(var41, var40, var42, (byte)-49);
                                                   }

                                                   if (var37 == 0) {
                                                      if (var38 == 0) {
                                                         if (var39 != 0) {
                                                            var34[var36].method4869(var39, var38, var37, 25915);
                                                            ++var36;
                                                         } else {
                                                            ++var36;
                                                         }
                                                      } else {
                                                         var34[var36].method4869(var39, var38, var37, 25915);
                                                         ++var36;
                                                      }
                                                   } else {
                                                      var34[var36].method4869(var39, var38, var37, 25915);
                                                      ++var36;
                                                   }
                                                }
                                             } else {
                                                ++var36;
                                             }
                                          } while(~var36 > ~var14.field9532.length);
                                       }
                                    }

                                    var43 = new class668(var34, var34.length);
                                    if (arg0 != null) {
                                       var31 = var13 | 16384;
                                    }

                                    var12 = arg2.method352(var43, var31, class637.field9300, 64, 850);
                                    if (arg0 != null) {
                                       var44 = 0;
                                       if (var11 || var44 < 5) {
                                          do {
                                             var45 = 0;
                                             if (var11) {
                                                if (~class152.field2430[var45][var44].length < ~arg0.field3174[var44]) {
                                                   var12.method526(class367.field5456[var45][var44], class152.field2430[var45][var44][arg0.field3174[var44]]);
                                                }

                                                ++var45;
                                             }

                                             while(true) {
                                                while(~var45 > ~class152.field2430.length) {
                                                   if (~class152.field2430[var45][var44].length < ~arg0.field3174[var44]) {
                                                      var12.method526(class367.field5456[var45][var44], class152.field2430[var45][var44][arg0.field3174[var44]]);
                                                   }

                                                   ++var45;
                                                }

                                                if (!var11) {
                                                   ++var44;
                                                   break;
                                                }

                                                ++var45;
                                             }
                                          } while(var44 < 5);
                                       }
                                    }

                                    if (class283.field3959 != null) {
                                       var12.method530(var13);
                                       class283.field3959.method1581(var29, 0, var12);
                                    }
                                    break label853;
                                 }

                                 ++var35;
                              }
                           }
                        } else {
                           var10000 = ~var15[var33];
                        }

                        if (var10000 != 0 && !class408.field5993.method845((byte)99, var15[var33]).method3299((class589)null, arg3, 0)) {
                           var32 = 1;
                        }

                        ++var33;
                     }
                  }

                  if (arg7 != null && var23 != null) {
                     var46 = var12.method549((byte)1, var13, true);
                     var46.method3733(var20, var22, var23, arg6 + -1, var24, arg7.field4116, arg4 + -610823692, var21, 0);
                     return var46;
                  }

                  return var12;
               }

               if (arg4 <= 610855664) {
                  var15[var16] = -1;
                  if (var11) {
                     var15[var16] = this.field4963[var17];
                     ++var16;
                  } else {
                     ++var16;
                  }
               } else {
                  var15[var16] = this.field4963[var17];
                  ++var16;
               }
            }
         } else {
            var16 = 0;
            var17 = 0;
            if (!var11) {
               if (arg4 != 610855664) {
                  return null;
               }

               var18 = false;
               var19 = false;
               var20 = -1;
               var21 = -1;
               var22 = 0;
               var23 = null;
               var24 = null;
               if (arg7 != null) {
                  var25 = arg7.field4136[arg1];
                  var13 = arg8 | 32;
                  var26 = var25 >>> 16;
                  var20 = var25 & 65535;
                  var23 = class588.field8496.method3776(var26, 18);
                  if (var23 != null) {
                     var17 |= var23.method3879(-1, var20);
                     var16 |= var23.method3880((byte)44, var20);
                     var19 |= var23.method3881(76, var20);
                     var18 |= arg7.field4116;
                  }

                  if ((arg7.field4131 || class408.field6000) && arg9 != -1 && ~arg7.field4136.length < ~arg9) {
                     var22 = arg7.field4128[arg1];
                     var27 = arg7.field4136[arg9];
                     var28 = var27 >>> 16;
                     var21 = var27 & 65535;
                     if (var26 != var28) {
                        var24 = class588.field8496.method3776(var21 >>> 16, 18);
                     } else {
                        var24 = var23;
                     }

                     if (var24 != null) {
                        var17 |= var24.method3879(-1, var21);
                        var16 |= var24.method3880((byte)44, var21);
                        var19 |= var24.method3881(-118, var21);
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

               var29 = this.method2693(arg3, var15, arg0 != null ? arg0.field3174 : null, arg5, (byte)-110);
               if (class283.field3959 != null) {
                  var12 = (class495)class283.field3959.method1584(var29, 1);
               }

               if (var12 == null || ~arg2.method269(var12.method510(), var13) != -1) {
                  if (var12 != null) {
                     var13 = arg2.method354(var13, var12.method510());
                  }

                  var31 = var13;
                  var32 = 0;
                  var33 = 0;
                  if (var11) {
                     if (~var15[var33] != 0 && !class408.field5993.method845((byte)99, var15[var33]).method3299((class589)null, arg3, 0)) {
                        var32 = 1;
                     }

                     ++var33;
                  }

                  label504:
                  while(true) {
                     if (~var15.length >= ~var33) {
                        var10000 = var32;
                        if (!var11) {
                           if (var32 != 0) {
                              return null;
                           }

                           var34 = new class668[var15.length];
                           var35 = 0;
                           if (var11) {
                              if (~var15[var35] != 0) {
                                 var34[var35] = class408.field5993.method845((byte)-51, var15[var35]).method3291((class589)null, 32, arg3);
                              }

                              ++var35;
                           }

                           while(true) {
                              while(~var15.length < ~var35) {
                                 if (~var15[var35] != 0) {
                                    var34[var35] = class408.field5993.method845((byte)-51, var15[var35]).method3291((class589)null, 32, arg3);
                                 }

                                 ++var35;
                              }

                              if (!var11) {
                                 if (var14 != null && var14.field9532 != null) {
                                    var36 = 0;
                                    if (var11 || ~var36 > ~var14.field9532.length) {
                                       do {
                                          if (var14.field9532[var36] != null) {
                                             if (var34[var36] == null && !var11) {
                                                ++var36;
                                             } else {
                                                var37 = var14.field9532[var36][0];
                                                var38 = var14.field9532[var36][1];
                                                var39 = var14.field9532[var36][2];
                                                var40 = var14.field9532[var36][3];
                                                var41 = var14.field9532[var36][4];
                                                var42 = var14.field9532[var36][5];
                                                if (var40 == 0) {
                                                   if (var41 == 0) {
                                                      if (var42 != 0) {
                                                         var34[var36].method4873(var41, var40, var42, (byte)-49);
                                                      }
                                                   } else {
                                                      var34[var36].method4873(var41, var40, var42, (byte)-49);
                                                   }
                                                } else {
                                                   var34[var36].method4873(var41, var40, var42, (byte)-49);
                                                }

                                                if (var37 == 0) {
                                                   if (var38 == 0) {
                                                      if (var39 != 0) {
                                                         var34[var36].method4869(var39, var38, var37, 25915);
                                                         ++var36;
                                                      } else {
                                                         ++var36;
                                                      }
                                                   } else {
                                                      var34[var36].method4869(var39, var38, var37, 25915);
                                                      ++var36;
                                                   }
                                                } else {
                                                   var34[var36].method4869(var39, var38, var37, 25915);
                                                   ++var36;
                                                }
                                             }
                                          } else {
                                             ++var36;
                                          }
                                       } while(~var36 > ~var14.field9532.length);
                                    }
                                 }

                                 var43 = new class668(var34, var34.length);
                                 if (arg0 != null) {
                                    var31 = var13 | 16384;
                                 }

                                 var12 = arg2.method352(var43, var31, class637.field9300, 64, 850);
                                 if (arg0 != null) {
                                    var44 = 0;
                                    if (var11 || var44 < 5) {
                                       do {
                                          var45 = 0;
                                          if (var11) {
                                             if (~class152.field2430[var45][var44].length < ~arg0.field3174[var44]) {
                                                var12.method526(class367.field5456[var45][var44], class152.field2430[var45][var44][arg0.field3174[var44]]);
                                             }

                                             ++var45;
                                          }

                                          while(true) {
                                             while(~var45 > ~class152.field2430.length) {
                                                if (~class152.field2430[var45][var44].length < ~arg0.field3174[var44]) {
                                                   var12.method526(class367.field5456[var45][var44], class152.field2430[var45][var44][arg0.field3174[var44]]);
                                                }

                                                ++var45;
                                             }

                                             if (!var11) {
                                                ++var44;
                                                break;
                                             }

                                             ++var45;
                                          }
                                       } while(var44 < 5);
                                    }
                                 }

                                 if (class283.field3959 != null) {
                                    var12.method530(var13);
                                    class283.field3959.method1581(var29, 0, var12);
                                 }
                                 break label504;
                              }

                              ++var35;
                           }
                        }
                     } else {
                        var10000 = ~var15[var33];
                     }

                     if (var10000 != 0 && !class408.field5993.method845((byte)99, var15[var33]).method3299((class589)null, arg3, 0)) {
                        var32 = 1;
                     }

                     ++var33;
                  }
               }

               if (arg7 != null && var23 != null) {
                  var46 = var12.method549((byte)1, var13, true);
                  var46.method3733(var20, var22, var23, arg6 + -1, var24, arg7.field4116, arg4 + -610823692, var21, 0);
                  return var46;
               }

               return var12;
            }

            if (arg4 <= 610855664) {
               var15[var16] = -1;
               if (var11) {
                  var15[var16] = this.field4963[var17];
                  ++var16;
               } else {
                  ++var16;
               }
            } else {
               var15[var16] = this.field4963[var17];
               ++var16;
            }
         }

         while(true) {
            while(~var14.field9496.length < ~var16) {
               var17 = var14.field9496[var16];
               if (var17 >= 0) {
                  if (this.field4963.length <= var17) {
                     var15[var16] = -1;
                     if (var11) {
                        var15[var16] = this.field4963[var17];
                        ++var16;
                     } else {
                        ++var16;
                     }
                  } else {
                     var15[var16] = this.field4963[var17];
                     ++var16;
                  }
               } else {
                  var15[var16] = -1;
                  if (var11) {
                     var15[var16] = this.field4963[var17];
                     ++var16;
                  } else {
                     ++var16;
                  }
               }
            }

            var16 = 0;
            var17 = 0;
            if (!var11) {
               if (arg4 != 610855664) {
                  return null;
               }

               var18 = false;
               var19 = false;
               var20 = -1;
               var21 = -1;
               var22 = 0;
               var23 = null;
               var24 = null;
               if (arg7 != null) {
                  var25 = arg7.field4136[arg1];
                  var13 = arg8 | 32;
                  var26 = var25 >>> 16;
                  var20 = var25 & 65535;
                  var23 = class588.field8496.method3776(var26, 18);
                  if (var23 != null) {
                     var17 |= var23.method3879(-1, var20);
                     var16 |= var23.method3880((byte)44, var20);
                     var19 |= var23.method3881(76, var20);
                     var18 |= arg7.field4116;
                  }

                  if ((arg7.field4131 || class408.field6000) && arg9 != -1 && ~arg7.field4136.length < ~arg9) {
                     var22 = arg7.field4128[arg1];
                     var27 = arg7.field4136[arg9];
                     var28 = var27 >>> 16;
                     var21 = var27 & 65535;
                     if (var26 != var28) {
                        var24 = class588.field8496.method3776(var21 >>> 16, 18);
                     } else {
                        var24 = var23;
                     }

                     if (var24 != null) {
                        var17 |= var24.method3879(-1, var21);
                        var16 |= var24.method3880((byte)44, var21);
                        var19 |= var24.method3881(-118, var21);
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

               var29 = this.method2693(arg3, var15, arg0 != null ? arg0.field3174 : null, arg5, (byte)-110);
               if (class283.field3959 != null) {
                  var12 = (class495)class283.field3959.method1584(var29, 1);
               }

               if (var12 == null || ~arg2.method269(var12.method510(), var13) != -1) {
                  if (var12 != null) {
                     var13 = arg2.method354(var13, var12.method510());
                  }

                  var31 = var13;
                  var32 = 0;
                  var33 = 0;
                  if (var11) {
                     if (~var15[var33] != 0 && !class408.field5993.method845((byte)99, var15[var33]).method3299((class589)null, arg3, 0)) {
                        var32 = 1;
                     }

                     ++var33;
                  }

                  label300:
                  while(true) {
                     if (~var15.length >= ~var33) {
                        var10000 = var32;
                        if (!var11) {
                           if (var32 != 0) {
                              return null;
                           }

                           var34 = new class668[var15.length];
                           var35 = 0;
                           if (var11) {
                              if (~var15[var35] != 0) {
                                 var34[var35] = class408.field5993.method845((byte)-51, var15[var35]).method3291((class589)null, 32, arg3);
                              }

                              ++var35;
                           }

                           while(true) {
                              while(~var15.length < ~var35) {
                                 if (~var15[var35] != 0) {
                                    var34[var35] = class408.field5993.method845((byte)-51, var15[var35]).method3291((class589)null, 32, arg3);
                                 }

                                 ++var35;
                              }

                              if (!var11) {
                                 if (var14 != null && var14.field9532 != null) {
                                    var36 = 0;
                                    if (var11 || ~var36 > ~var14.field9532.length) {
                                       do {
                                          if (var14.field9532[var36] != null) {
                                             if (var34[var36] == null && !var11) {
                                                ++var36;
                                             } else {
                                                var37 = var14.field9532[var36][0];
                                                var38 = var14.field9532[var36][1];
                                                var39 = var14.field9532[var36][2];
                                                var40 = var14.field9532[var36][3];
                                                var41 = var14.field9532[var36][4];
                                                var42 = var14.field9532[var36][5];
                                                if (var40 == 0) {
                                                   if (var41 == 0) {
                                                      if (var42 != 0) {
                                                         var34[var36].method4873(var41, var40, var42, (byte)-49);
                                                      }
                                                   } else {
                                                      var34[var36].method4873(var41, var40, var42, (byte)-49);
                                                   }
                                                } else {
                                                   var34[var36].method4873(var41, var40, var42, (byte)-49);
                                                }

                                                if (var37 == 0) {
                                                   if (var38 == 0) {
                                                      if (var39 != 0) {
                                                         var34[var36].method4869(var39, var38, var37, 25915);
                                                         ++var36;
                                                      } else {
                                                         ++var36;
                                                      }
                                                   } else {
                                                      var34[var36].method4869(var39, var38, var37, 25915);
                                                      ++var36;
                                                   }
                                                } else {
                                                   var34[var36].method4869(var39, var38, var37, 25915);
                                                   ++var36;
                                                }
                                             }
                                          } else {
                                             ++var36;
                                          }
                                       } while(~var36 > ~var14.field9532.length);
                                    }
                                 }

                                 var43 = new class668(var34, var34.length);
                                 if (arg0 != null) {
                                    var31 = var13 | 16384;
                                 }

                                 var12 = arg2.method352(var43, var31, class637.field9300, 64, 850);
                                 if (arg0 != null) {
                                    var44 = 0;
                                    if (var11 || var44 < 5) {
                                       do {
                                          var45 = 0;
                                          if (var11) {
                                             if (~class152.field2430[var45][var44].length < ~arg0.field3174[var44]) {
                                                var12.method526(class367.field5456[var45][var44], class152.field2430[var45][var44][arg0.field3174[var44]]);
                                             }

                                             ++var45;
                                          }

                                          while(true) {
                                             while(~var45 > ~class152.field2430.length) {
                                                if (~class152.field2430[var45][var44].length < ~arg0.field3174[var44]) {
                                                   var12.method526(class367.field5456[var45][var44], class152.field2430[var45][var44][arg0.field3174[var44]]);
                                                }

                                                ++var45;
                                             }

                                             if (!var11) {
                                                ++var44;
                                                break;
                                             }

                                             ++var45;
                                          }
                                       } while(var44 < 5);
                                    }
                                 }

                                 if (class283.field3959 != null) {
                                    var12.method530(var13);
                                    class283.field3959.method1581(var29, 0, var12);
                                 }
                                 break label300;
                              }

                              ++var35;
                           }
                        }
                     } else {
                        var10000 = ~var15[var33];
                     }

                     if (var10000 != 0 && !class408.field5993.method845((byte)99, var15[var33]).method3299((class589)null, arg3, 0)) {
                        var32 = 1;
                     }

                     ++var33;
                  }
               }

               if (arg7 != null && var23 != null) {
                  var46 = var12.method549((byte)1, var13, true);
                  var46.method3733(var20, var22, var23, arg6 + -1, var24, arg7.field4116, arg4 + -610823692, var21, 0);
                  return var46;
               }

               return var12;
            }

            if (arg4 <= 610855664) {
               var15[var16] = -1;
               if (var11) {
                  var15[var16] = this.field4963[var17];
                  ++var16;
               } else {
                  ++var16;
               }
            } else {
               var15[var16] = this.field4963[var17];
               ++var16;
            }
         }
      } catch (RuntimeException var48) {
         throw class608.method4462(var48, field4969[9] + (arg0 != null ? field4969[2] : field4969[1]) + ',' + arg1 + ',' + (arg2 != null ? field4969[2] : field4969[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field4969[2] : field4969[1]) + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(Z[I[IIB)J"
   )
   private final long method2693(boolean arg0, int[] arg1, int[] arg2, int arg3, byte arg4) {
      boolean var6 = client.field4564;

      try {
         ++field4960;
         long[] var7 = class275.field3894;
         long var8 = -1L;
         long var10 = var7[(int)(255L & ((long)(arg3 >> 8) ^ var8))] ^ var8 >>> 8;
         long var12 = var7[(int)(255L & (var10 ^ (long)arg3))] ^ var10 >>> 8;
         int var14 = 0;
         long var15;
         long var17;
         long var19;
         if (var6) {
            var15 = var7[(int)((var12 ^ (long)(arg1[var14] >> 24)) & 255L)] ^ var12 >>> 8;
            var17 = var7[(int)((var15 ^ (long)(arg1[var14] >> 16)) & 255L)] ^ var15 >>> 8;
            var19 = var17 >>> 8 ^ var7[(int)(255L & (var17 ^ (long)(arg1[var14] >> 8)))];
            var12 = var19 >>> 8 ^ var7[(int)(((long)arg1[var14] ^ var19) & 255L)];
            ++var14;
         }

         while(true) {
            while(~var14 > ~arg1.length) {
               var15 = var7[(int)((var12 ^ (long)(arg1[var14] >> 24)) & 255L)] ^ var12 >>> 8;
               var17 = var7[(int)((var15 ^ (long)(arg1[var14] >> 16)) & 255L)] ^ var15 >>> 8;
               var19 = var17 >>> 8 ^ var7[(int)(255L & (var17 ^ (long)(arg1[var14] >> 8)))];
               var12 = var19 >>> 8 ^ var7[(int)(((long)arg1[var14] ^ var19) & 255L)];
               ++var14;
            }

            if (!var6) {
               if (arg4 >= -65) {
                  field4967 = false;
               }

               if (arg2 != null) {
                  int var21 = 0;
                  if (var6 || var21 < 5) {
                     do {
                        var12 = var12 >>> 8 ^ var7[(int)((var12 ^ (long)arg2[var21]) & 255L)];
                        ++var21;
                     } while(var21 < 5);
                  }
               }

               return var7[(int)(255L & (var12 ^ (long)(!arg0 ? 0 : 1)))] ^ var12 >>> 8;
            }

            ++var14;
         }
      } catch (RuntimeException var25) {
         throw class608.method4462(var25, field4969[0] + arg0 + ',' + (arg1 != null ? field4969[2] : field4969[1]) + ',' + (arg2 != null ? field4969[2] : field4969[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2694(int arg0) throws IOException {
      boolean var1 = client.field4564;

      try {
         if (arg0 != -1) {
            field4956 = null;
         }

         ++field4957;
         if (class361.field5404 != null && class782.field11454 > 0) {
            class300.field4197.field6907 = 0;

            int var10000;
            int var10001;
            while(true) {
               class542 var2 = (class542)class59.field1130.method2579(-801);
               if (var2 != null) {
                  var10000 = class300.field4197.field6889.length - class300.field4197.field6907;
                  var10001 = var2.field7861;
                  if (var1) {
                     break;
                  }

                  if (var10000 >= var10001) {
                     class300.field4197.method3536(0, var2.field7861, var2.field7859.field6889, arg0 + -13090);
                     class782.field11454 -= var2.field7861;
                     var2.method154(78);
                     var2.field7859.method3587((byte)-59);
                     var2.method4057(88);
                     if (!var1) {
                        continue;
                     }
                  }
               }

               class361.field5404.method2050(class300.field4197.field6889, arg0 + -1935658334, class300.field4197.field6907, 0);
               class463.field6768 = 0;
               var10000 = class270.field3836;
               var10001 = class300.field4197.field6907;
               break;
            }

            class270.field3836 = var10000 + var10001;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4969[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method2695(int arg0) {
      boolean var1 = client.field4564;

      try {
         if (class510.field7454.field11157.method1615(false) == 0) {
            int var2 = 0;
            if (var1 || ~var2 > ~class78.field1350) {
               do {
                  if (~class405.field5979[var2].method1623((byte)-116) != -116) {
                     if (~class405.field5979[var2].method1623((byte)-35) == -84) {
                        class510.field7454.method5552(1, -126, class510.field7454.field11157);
                        class138.field2243 = true;
                        if (!var1) {
                           break;
                        }

                        ++var2;
                     } else {
                        ++var2;
                     }
                  } else {
                     class510.field7454.method5552(1, -126, class510.field7454.field11157);
                     class138.field2243 = true;
                     if (!var1) {
                        break;
                     }

                     ++var2;
                  }
               } while(~var2 > ~class78.field1350);
            }
         }

         ++field4966;
         if (class431.field6221 == class195.field2948) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int)((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class57.method650(120);
            if (~class266.field3780 == -1L) {
               class266.field3780 = var5;
            }

            if (~var4 < -16385 && ~(-class266.field3780 + var5) > -5001L) {
               if (-class34.field502 + var5 > 1000L) {
                  System.gc();
                  class34.field502 = var5;
               }

               return 0;
            }
         }

         if (class431.field6226 == class195.field2948) {
            if (class775.field11347 == null) {
               class775.field11347 = new class448(class70.field1247, class277.field3909, class582.field8394, class319.field4602);
            }

            if (!class775.field11347.method3371((byte)-104)) {
               return 0;
            }

            class495.method3737((String)null, 0, (byte)-50, true);
            class455.field6646 = !class206.method1759(-104);
            class771.field11299 = class150.method1399(1, -117, class455.field6646 ? 34 : 32, false);
            class682.field10020 = class150.method1399(1, -65, 33, false);
            class329.field4702 = class150.method1399(1, -113, 13, false);
         }

         if (class431.field6227 == class195.field2948) {
            boolean var7 = class682.field10020.method1353(-116);
            int var8 = class478.field6964[33].method765((byte)53);
            int var9 = var8 + class478.field6964[!class455.field6646 ? 32 : 34].method765((byte)-92);
            int var10 = var9 + class478.field6964[13].method765((byte)-97);
            int var11 = var10 + (!var7 ? class682.field10020.method1349(125) : 100);
            if (var11 != 400) {
               return var11 / 4;
            }

            class642.field9354 = class771.field11299.method1345(0);
            class124.field2055 = class682.field10020.method1345(0);
            class373.method2917(125, class771.field11299);
            int var12 = class510.field7454.field11183.method4753(false);
            class689.field10131 = new class76(class128.field2145, class385.field5684, class682.field10020);
            int[] var13 = class689.field10131.method791(var12, 21886);
            if (var13.length == 0) {
               var13 = class689.field10131.method791(0, 21886);
            }

            class174 var14 = new class174(class771.field11299, class329.field4702);
            if (var13.length > 0) {
               class143.field2345 = new class705[var13.length];
               int var15 = 0;
               if (var1 || class143.field2345.length > var15) {
                  do {
                     class143.field2345[var15] = new class791(class689.field10131.method789(true, var13[var15]), var14);
                     ++var15;
                  } while(class143.field2345.length > var15);
               }
            }
         }

         if (class431.field6228 == class195.field2948) {
            class524.method3939(class771.field11299, class352.method2706(9), (byte)53, class329.field4702);
         }

         if (class431.field6229 == class195.field2948) {
            int var16 = class326.method2529((byte)-115);
            int var17 = class614.method4508(3);
            if (var17 > var16) {
               return var16 * 100 / var17;
            }
         }

         if (class431.field6230 == class195.field2948) {
            if (class143.field2345 != null && ~class143.field2345.length < -1) {
               if (~class143.field2345[0].method4127(-3441) > -101) {
                  return 0;
               }

               if (~class143.field2345.length < -2 && class689.field10131.method790(122) && ~class143.field2345[1].method4127(-3441) > -101) {
                  return 0;
               }
            }

            class155.method1436(11506, class444.field6473);
            class259.method2080(12, class444.field6473);
            class645.method4735(1, -111);
         }

         if (class431.field6231 == class195.field2948) {
            int var18 = 0;
            if (var1 || ~var18 > -5) {
               do {
                  class218.field3299[var18] = class560.method4181(true, class1.field3, class209.field3112);
                  ++var18;
               } while(~var18 > -5);
            }
         }

         if (class431.field6232 == class195.field2948) {
            class392.field5782 = class150.method1399(1, -86, 8, false);
            class304.field4397 = class150.method1399(1, -80, 0, false);
            class5.field55 = class150.method1399(1, -67, 1, false);
            class333.field4762 = class150.method1399(1, -60, 2, false);
            class244.field3512 = class150.method1399(1, -53, 3, false);
            class421.field6129 = class150.method1399(1, -55, 4, false);
            class515.field7506 = class150.method1399(1, -127, 5, true);
            class534.field7784 = class150.method1399(1, -94, 6, true);
            class549.field7925 = class150.method1399(1, -126, 7, false);
            class347.field4940 = class150.method1399(1, -90, 9, false);
            class96.field1538 = class150.method1399(1, -111, 10, false);
            class463.field6769 = class150.method1399(1, -57, 11, false);
            class647.field9406 = class150.method1399(1, -73, 12, false);
            class650.field9426 = class150.method1399(1, -112, 14, false);
            class273.field3866 = class150.method1399(1, -102, 15, false);
            class311.field4482 = class150.method1399(1, -113, 16, false);
            class433.field6258 = class150.method1399(1, -124, 17, false);
            class115.field1859 = class150.method1399(1, -68, 18, false);
            class273.field3860 = class150.method1399(1, -74, 19, false);
            class422.field6148 = class150.method1399(1, -100, 20, false);
            class628.field9155 = class150.method1399(1, -78, 21, false);
            class7.field73 = class150.method1399(1, -125, 22, false);
            class392.field5783 = class150.method1399(1, -86, 23, true);
            class729.field10490 = class150.method1399(1, -101, 24, false);
            class684.field10069 = class150.method1399(1, -110, 25, false);
            class783.field11464 = class150.method1399(1, -77, 26, true);
            class688.field10106 = class150.method1399(1, -55, 27, false);
            class65.field1191 = class150.method1399(1, -106, 28, true);
            class513.field7480 = class150.method1399(1, -112, 29, false);
            class63.field1166 = class150.method1399(1, -115, 30, true);
            class169.field2640 = class150.method1399(1, -75, 31, true);
            class347.field4944 = class150.method1399(2, -67, 36, true);
         }

         if (class431.field6233 == class195.field2948) {
            int var19 = 0;
            int var20 = 0;
            if (var1) {
               if (class478.field6964[var20] != null) {
                  var19 += class478.field6964[var20].method765((byte)79) * class190.field2851[var20] / 100;
                  ++var20;
               } else {
                  ++var20;
               }
            }

            while(true) {
               while(var20 < 37) {
                  if (class478.field6964[var20] != null) {
                     var19 += class478.field6964[var20].method765((byte)79) * class190.field2851[var20] / 100;
                     ++var20;
                  } else {
                     ++var20;
                  }
               }

               int var10000 = ~var19;
               if (!var1) {
                  if (var10000 != -101) {
                     if (class121.field1951 < 0) {
                        class121.field1951 = var19;
                     }

                     return (-class121.field1951 + var19) * 100 / (-class121.field1951 + 100);
                  }

                  class458.method3447(class392.field5782, 31627);
                  class524.method3939(class392.field5782, class352.method2706(9), (byte)53, class329.field4702);
                  break;
               }

               var19 = var10000 + -101;
               ++var20;
            }
         }

         if (class431.field6234 == class195.field2948) {
            if (~field4962 == 0) {
               field4962 = class534.field7784.method1329(-1, field4969[4]);
            }

            class516.method3903(false);
            class645.method4735(2, -104);
         }

         if (class431.field6235 == class195.field2948) {
            class468.method3506(2, class63.field1166, class412.field6033);
         }

         if (class431.field6236 == class195.field2948) {
            int var21 = class195.method1691(true);
            if (var21 < 100) {
               return var21;
            }

            class483.method3649(class65.field1191.method1331((byte)-98, 1), (byte)42);
            class480.method3633(true, class65.field1191.method1331((byte)-98, 3));
            class317.field4570 = new class335(class65.field1191);
         }

         if (class431.field6237 == class195.field2948) {
            if (~class149.field2397 != 0 && !class549.field7925.method1339(0, -71, class149.field2397)) {
               return 99;
            }

            class64.field1169 = new class641(class783.field11464, class347.field4940, class392.field5782);
            class559.field8143 = new class434(class128.field2145, class385.field5684, class333.field4762);
            class424.field6167 = new class202(class128.field2145, class385.field5684, class333.field4762, class317.field4570);
            class549.field7930 = new class218(class128.field2145, class385.field5684, class333.field4762, class392.field5782);
            class289.field4048 = new class546(class128.field2145, class385.field5684, class433.field6258);
            class201.field3017 = new class530(class128.field2145, class385.field5684, class333.field4762);
            class193.field2905 = new class640(class128.field2145, class385.field5684, class333.field4762);
            class307.field4434 = new class694(class128.field2145, class385.field5684, class333.field4762, class392.field5782);
            class604.field8696 = new class123(class128.field2145, class385.field5684, class333.field4762, class549.field7925);
            class511.field7468 = new class661(class128.field2145, class385.field5684, class333.field4762);
            class543.field7876 = new class483(class128.field2145, class385.field5684, class333.field4762);
            class634.field9256 = new class330(class128.field2145, class385.field5684, true, class311.field4482, class549.field7925);
            class542.field7856 = new class423(class128.field2145, class385.field5684, class333.field4762, class392.field5782);
            class126.field2114 = new class696(class128.field2145, class385.field5684, class333.field4762, class392.field5782);
            class373.field5547 = new class257(class128.field2145, class385.field5684, true, class115.field1859, class549.field7925);
            class408.field5993 = new class85(class128.field2145, class385.field5684, true, class559.field8143, class273.field3860, class549.field7925);
            class681.field9992 = new class519(class128.field2145, class385.field5684, class333.field4762);
            class588.field8496 = new class503(class128.field2145, class385.field5684, class422.field6148, class304.field4397, class5.field55);
            class300.field4199 = new class557(class128.field2145, class385.field5684, class333.field4762);
            class29.field455 = new class709(class128.field2145, class385.field5684, class333.field4762);
            class760.field11030 = new class455(class128.field2145, class385.field5684, class628.field9155, class549.field7925);
            class354.field4998 = new class27(class128.field2145, class385.field5684, class333.field4762);
            class514.field7492 = new class69(class128.field2145, class385.field5684, class333.field4762);
            class482.field7011 = new class620(class128.field2145, class385.field5684, class333.field4762);
            class440.field6431 = new class258(class128.field2145, class385.field5684, class7.field73);
            class516.field7514 = new class761(class128.field2145, class385.field5684, class333.field4762);
            class252.field3601 = new class166(class128.field2145, class385.field5684, class333.field4762);
            class133.method1272(class244.field3512, class549.field7925, class329.field4702, (byte)-95, class392.field5782);
            class531.method3978(class513.field7480, 1);
            class475.field6937 = new class492(class385.field5684, class729.field10490, class684.field10069);
            class32.field482 = new class340(class385.field5684, class729.field10490, class684.field10069, new class590());
            class131.method1252(0);
            class634.field9256.method2561(false, class510.field7454.field11159.method1137(false) == 0);
            class616.field8951 = new class206();
            class416.method3174(false);
            class483.method3656(class688.field10106, true);
            class331.method2567(class64.field1169, class549.field7925, 3072);
            class400 var22 = new class400(class96.field1538.method1348(field4969[5], "", 53));
            class264.method2111(-25109, var22);

            try {
               jagmisc.init();
            } catch (Throwable var32) {
            }

            class344.field4894 = class758.method5485(0);
            class359.field5381 = new class663(true, class412.field6033);
         }

         if (class431.field6239 == class195.field2948) {
            int var23 = class493.method3718(class392.field5782, false) + class591.method4366(true, false);
            int var24 = class720.method5201(127) - -class614.method4508(109);
            if (var23 < var24) {
               return var23 * 100 / var24;
            }
         }

         if (class431.field6240 == class195.field2948) {
            class370.method2898(class392.field5783, class201.field3017, class193.field2905, class634.field9256, class542.field7856, class126.field2114, class616.field8951);
         }

         if (class431.field6241 == class195.field2948) {
            class645.field9383 = new String[class514.field7492.field1242];
            class421.field6133 = new int[class482.field7011.field9011];
            class39.field937 = new boolean[class482.field7011.field9011];
            int var25 = 0;
            if (var1) {
               if (class482.field7011.method4532(var25, (byte)-43).field3332 == 0) {
                  class39.field937[var25] = true;
                  ++class70.field1252;
               }

               class421.field6133[var25] = -1;
               ++var25;
            }

            while(true) {
               while(class482.field7011.field9011 > var25) {
                  if (class482.field7011.method4532(var25, (byte)-43).field3332 == 0) {
                     class39.field937[var25] = true;
                     ++class70.field1252;
                  }

                  class421.field6133[var25] = -1;
                  ++var25;
               }

               class585.method4339(92);
               class515.field7506.method1325(true, true, false);
               class534.field7784.method1325(true, true, true);
               class392.field5782.method1325(true, true, true);
               class329.field4702.method1325(true, true, true);
               class96.field1538.method1325(true, true, true);
               class333.field4762.field2320 = 2;
               class248.field3575 = true;
               class433.field6258.field2320 = 2;
               class311.field4482.field2320 = 2;
               class115.field1859.field2320 = 2;
               class273.field3860.field2320 = 2;
               class422.field6148.field2320 = 2;
               if (!var1) {
                  class628.field9155.field2320 = 2;
                  break;
               }

               ++var25;
            }
         }

         if (class431.field6242 == class195.field2948) {
            if (!class28.method199(0, class5.field56)) {
               return 0;
            }

            boolean var26 = true;
            int var27 = 0;
            if (var1 || ~class253.field3608[class5.field56].length < ~var27) {
               do {
                  class303 var28 = class253.field3608[class5.field56][var27];
                  if (~var28.field4270 == -6 && ~var28.field4252 != 0 && !class392.field5782.method1339(0, -81, var28.field4252)) {
                     var26 = false;
                  }

                  ++var27;
               } while(~class253.field3608[class5.field56].length < ~var27);
            }

            if (!var26) {
               return 0;
            }
         }

         if (class431.field6243 == class195.field2948) {
            class486.method3674(true, -755203543);
         }

         int var29 = -59 / ((55 - arg0) / 53);
         if (class431.field6244 == class195.field2948) {
            class445.field6487.method1071(-48);

            try {
               class673.field9873.join();
            } catch (InterruptedException var31) {
               return 0;
            }

            label264: {
               class771.field11299 = null;
               class682.field10020 = null;
               class673.field9873 = null;
               class445.field6487 = null;
               class689.field10131 = null;
               class143.field2345 = null;
               class411.method3142(-101);
               class357.field5057 = class510.field7454.field11157.method1615(false) == 1;
               class510.field7454.method5552(1, 98, class510.field7454.field11157);
               if (!class357.field5057) {
                  if (!class510.field7454.field11171.field3718 || class359.field5381.field9635 >= 512 || ~class359.field5381.field9635 == -1) {
                     break label264;
                  }

                  class510.field7454.method5552(0, -105, class510.field7454.field11171);
                  if (!var1) {
                     break label264;
                  }
               }

               class510.field7454.method5552(0, -118, class510.field7454.field11171);
            }

            label253: {
               class14.method99(-104);
               if (!class357.field5057) {
                  class363.method2847((byte)34, false, class510.field7454.field11171.method2098(false));
                  if (!var1) {
                     break label253;
                  }
               }

               class363.method2847((byte)34, false, 0);
            }

            class511.method3871(-1, false, class510.field7454.field11142.method2680(false), true, -1);
            class155.method1436(11506, class444.field6473);
            class259.method2080(12, class444.field6473);
            class420.method3195(class392.field5782, -102, class444.field6473);
            class238.method1947(false, class150.field2414);
         }

         return class587.method4350(100);
      } catch (RuntimeException var33) {
         throw class608.method4462(var33, field4969[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method2696(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4965;
         class536 var4 = class108.method1038((long)arg2, 55, 11);
         var4.method4017(24076);
         var4.field7798 = arg0;
         int var5 = 58 % ((arg1 - 5) / 45);
         var4.field7800 = arg3;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field4969[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method2697(int arg0) {
      try {
         if (arg0 != -24392) {
            method2691(115L, -27, 35);
         }

         field4956 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4969[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2698(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2699(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
