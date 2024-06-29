import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class784 extends class500 {
   @OriginalMember(
      owner = "client!hda",
      name = "s",
      descriptor = "[I"
   )
   public int[] field11456 = new int[1];
   @OriginalMember(
      owner = "client!hda",
      name = "p",
      descriptor = "[I"
   )
   public int[] field11463 = new int[]{-1};
   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11466 = new String[]{method5653(method5652("\tuE8'I")), method5653(method5652("\u001a?\n8\u0018")), method5653(method5652("\u000fdHz")), method5653(method5652("\tuE8 I")), method5653(method5652("\tuE8$I")), method5653(method5652("\tuE8#I")), method5653(method5652("\tuE8!I")), method5653(method5652("\u0016xJ")), method5653(method5652("\tuE8&I"))};
   @OriginalMember(
      owner = "client!hda",
      name = "o",
      descriptor = "I"
   )
   public static int field11465 = 0;
   @OriginalMember(
      owner = "client!hda",
      name = "m",
      descriptor = "I"
   )
   public static int field11457;
   @OriginalMember(
      owner = "client!hda",
      name = "k",
      descriptor = "I"
   )
   public static int field11458;
   @OriginalMember(
      owner = "client!hda",
      name = "j",
      descriptor = "I"
   )
   public static int field11459;
   @OriginalMember(
      owner = "client!hda",
      name = "n",
      descriptor = "I"
   )
   public static int field11460;
   @OriginalMember(
      owner = "client!hda",
      name = "l",
      descriptor = "I"
   )
   public static int field11461;
   @OriginalMember(
      owner = "client!hda",
      name = "r",
      descriptor = "I"
   )
   public static int field11462;
   @OriginalMember(
      owner = "client!hda",
      name = "q",
      descriptor = "I"
   )
   public static int field11464;

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method5646(byte arg0) {
      boolean var1 = client.field4273;

      try {
         class671.field9871 = 0;
         class458.field6280 = 0;
         ++field11464;
         if (arg0 < -90) {
            int var2 = 0;
            if (var1 || class124.field1540 > var2) {
               do {
                  int var3 = class498.field6856 * var2;
                  int var4 = 0;
                  if (var1 || ~class498.field6856 < ~var4) {
                     do {
                        int var5 = var3 - -var4;
                        class599.field8362[var5].method1310(class477.field6599 * var4, class182.field2249 * var2, class477.field6599, class182.field2249, 0, 0, true, true);
                        ++var4;
                     } while(~class498.field6856 < ~var4);
                  }

                  ++var2;
               } while(class124.field1540 > var2);

            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field11466[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method5647(int arg0) {
      boolean var1 = client.field4273;

      try {
         ++field11462;
         boolean var2 = false;
         boolean var3 = false;
         boolean var4 = false;
         if (class61.field671.field3257 && !class61.field671.field3265) {
            label132: {
               var2 = true;
               if (~class334.field4792.field10589 > -513 && class334.field4792.field10589 != 0) {
                  var2 = false;
               }

               if (class255.field3248.startsWith(field11466[7])) {
                  var4 = true;
                  var3 = true;
                  if (!var1) {
                     break label132;
                  }
               }

               var3 = true;
            }
         }

         if (class393.field5558) {
            var4 = false;
         }

         if (class134.field1745) {
            var3 = false;
         }

         if (class421.field5902) {
            var2 = false;
         }

         if (!var2 && !var3 && !var4) {
            return class536.method3868((byte)-30);
         } else {
            int var5 = -1;
            if (arg0 != 1024) {
               method5647(87);
            }

            int var6 = -1;
            int var7 = -1;
            if (var2) {
               try {
                  var5 = class683.method4990(arg0 ^ -1088, 2, 1000);
               } catch (Exception var16) {
               }
            }

            if (var4) {
               try {
                  var7 = class683.method4990(-57, 3, 1000);
                  if (~class674.field9907.field8451.method2770((byte)-118) == -4) {
                     label133: {
                        long var9;
                        label134: {
                           class386 var8 = class338.field4832.method499();
                           var9 = 281474976710655L & var8.field5412;
                           int var11 = var8.field5409;
                           if (var11 != 4318) {
                              if (var11 != 4098) {
                                 break label133;
                              }

                              if (!var1) {
                                 break label134;
                              }
                           }

                           var3 &= ~var9 <= -64425238955L;
                           if (!var1) {
                              break label133;
                           }
                        }

                        var3 &= var9 >= 60129613779L;
                     }
                  }
               } catch (Exception var17) {
               }
            }

            if (var3) {
               try {
                  var6 = class683.method4990(-78, 1, 1000);
               } catch (Exception var15) {
               }
            }

            if (~var5 == 0 && ~var6 == 0 && ~var7 == 0) {
               return class536.method3868((byte)-30);
            } else {
               int var12 = (int)((float)var6 * 1.1F);
               int var13 = (int)((float)var7 * 1.1F);
               if (var13 < var5 && var5 > var12) {
                  return class250.method1880(var5, (byte)47);
               } else {
                  return var13 <= var12 ? class9.method77(1, -127, var12) : class9.method77(3, -127, var13);
               }
            }
         }
      } catch (RuntimeException var18) {
         throw class534.method3846(var18, field11466[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public static final void method5648(boolean arg0, boolean arg1) {
      try {
         ++field11459;
         class736.method5336((byte)96);
         if (class422.method3188(-6196, class445.field6162)) {
            class223[] var2 = class605.field8475;
            int var3 = 0;
            if (arg0) {
               while(~var2.length < ~var3) {
                  class223 var4 = var2[var3];
                  ++var4.field2791;
                  if (var4.field2791 < 50 && !arg1) {
                     return;
                  }

                  var4.field2791 = 0;
                  if (!var4.field2800 && var4.field2779 != null) {
                     ++class25.field318;
                     class471 var5 = class133.method1118(var4.field2787, 2, class179.field2230);
                     var4.method1702((byte)-121, var5);

                     try {
                        var4.method1699(-16186);
                     } catch (IOException var7) {
                        var4.field2800 = true;
                     }
                  }

                  ++var3;
               }

               class736.method5336((byte)96);
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field11466[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(I[I[IZI)J"
   )
   private final long method5649(int arg0, int[] arg1, int[] arg2, boolean arg3, int arg4) {
      boolean var6 = client.field4273;

      try {
         ++field11460;
         long[] var7 = class511.field7075;
         long var8 = -1L;
         long var10 = var8 >>> 8 ^ var7[(int)(255L & ((long)(arg4 >> 8) ^ var8))];
         long var12 = var7[(int)(255L & (var10 ^ (long)arg4))] ^ var10 >>> 8;
         int var14 = -77 / ((-52 - arg0) / 38);
         int var15 = 0;
         long var16;
         long var18;
         long var20;
         if (var6) {
            var16 = var12 >>> 8 ^ var7[(int)((var12 ^ (long)(arg2[var15] >> 24)) & 255L)];
            var18 = var16 >>> 8 ^ var7[(int)(255L & (var16 ^ (long)(arg2[var15] >> 16)))];
            var20 = var7[(int)(((long)(arg2[var15] >> 8) ^ var18) & 255L)] ^ var18 >>> 8;
            var12 = var7[(int)(255L & (var20 ^ (long)arg2[var15]))] ^ var20 >>> 8;
            ++var15;
         }

         while(true) {
            while(~arg2.length < ~var15) {
               var16 = var12 >>> 8 ^ var7[(int)((var12 ^ (long)(arg2[var15] >> 24)) & 255L)];
               var18 = var16 >>> 8 ^ var7[(int)(255L & (var16 ^ (long)(arg2[var15] >> 16)))];
               var20 = var7[(int)(((long)(arg2[var15] >> 8) ^ var18) & 255L)] ^ var18 >>> 8;
               var12 = var7[(int)(255L & (var20 ^ (long)arg2[var15]))] ^ var20 >>> 8;
               ++var15;
            }

            if (!var6) {
               if (arg1 != null) {
                  int var22 = 0;
                  if (var6 || var22 < 5) {
                     do {
                        var12 = var12 >>> 8 ^ var7[(int)(255L & (var12 ^ (long)arg1[var22]))];
                        ++var22;
                     } while(var22 < 5);
                  }
               }

               return var12 >>> 8 ^ var7[(int)((var12 ^ (long)(arg3 ? 1 : 0)) & 255L)];
            }

            ++var15;
         }
      } catch (RuntimeException var26) {
         throw class534.method3846(var26, field11466[3] + arg0 + ',' + (arg1 != null ? field11466[1] : field11466[2]) + ',' + (arg2 != null ? field11466[1] : field11466[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(ZLjia;ILmk;IILha;III)Lka;"
   )
   public final class501 method5650(boolean arg0, class648 arg1, int arg2, class61 arg3, int arg4, int arg5, class65 arg6, int arg7, int arg8, int arg9) {
      boolean var11 = client.field4273;

      try {
         ++field11461;
         class501 var12 = null;
         int var13 = arg4;
         class120 var14 = null;
         if (~arg8 != 0) {
            var14 = class581.field7984.method3691((byte)-24, arg8);
         }

         int[] var15 = this.field11463;
         int var16;
         int var10000;
         int var17;
         boolean var18;
         boolean var19;
         int var20;
         int var21;
         int var22;
         class477 var23;
         class477 var24;
         int var25;
         int var26;
         int var27;
         int var28;
         long var29;
         int var31;
         byte var32;
         int var33;
         class200[] var34;
         int var35;
         int var36;
         int var37;
         int var38;
         int var39;
         int var40;
         int var41;
         int var42;
         class200 var43;
         int var44;
         int var45;
         class501 var46;
         if (var14 != null) {
            if (var14.field1507 != null) {
               var15 = new int[var14.field1507.length];
               var16 = 0;
               if (var11) {
                  var17 = var14.field1507[var16];
                  if (var17 >= 0) {
                     if (var17 < this.field11463.length) {
                        var15[var16] = this.field11463[var17];
                        if (var11) {
                           var15[var16] = -1;
                           ++var16;
                        } else {
                           ++var16;
                        }
                     } else {
                        var15[var16] = -1;
                        ++var16;
                     }
                  } else {
                     var15[var16] = -1;
                     ++var16;
                  }
               }
            } else {
               var16 = 0;
               var17 = 0;
               var18 = false;
               var19 = false;
               var20 = -1;
               if (!var11) {
                  if (arg2 < 86) {
                     this.field11463 = null;
                  }

                  var21 = -1;
                  var22 = 0;
                  var23 = null;
                  var24 = null;
                  if (arg3 != null) {
                     var25 = arg3.field667[arg7];
                     var13 = arg4 | 32;
                     var26 = var25 >>> 16;
                     var23 = class392.field5479.method1478(75, var26);
                     var20 = var25 & 65535;
                     if (var23 != null) {
                        var17 |= var23.method3482(-19443, var20);
                        var16 |= var23.method3479(var20, 0);
                        var19 |= var23.method3480(var20, 4);
                        var18 |= arg3.field645;
                     }

                     if ((arg3.field669 || class305.field4050) && ~arg5 != 0 && ~arg5 > ~arg3.field667.length) {
                        var22 = arg3.field661[arg7];
                        var27 = arg3.field667[arg5];
                        var28 = var27 >>> 16;
                        var21 = var27 & 65535;
                        if (var26 == var28) {
                           var24 = var23;
                        } else {
                           var24 = class392.field5479.method1478(78, var21 >>> 16);
                        }

                        if (var24 != null) {
                           var17 |= var24.method3482(-19443, var21);
                           var16 |= var24.method3479(var21, 0);
                           var19 |= var24.method3480(var21, 4);
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

                  var29 = this.method5649(38, arg1 == null ? null : arg1.field9078, var15, arg0, arg8);
                  if (class622.field8690 != null) {
                     var12 = (class501)class622.field8690.method4239(var29, 0);
                  }

                  if (var12 == null || ~arg6.method540(var12.method341(), var13) != -1) {
                     if (var12 != null) {
                        var13 = arg6.method503(var13, var12.method341());
                     }

                     label832: {
                        var31 = var13;
                        var32 = 0;
                        var33 = 0;
                        if (var11) {
                           var10000 = var15[var33];
                        } else if (var15.length <= var33) {
                           var10000 = var32;
                           if (!var11) {
                              break label832;
                           }
                        } else {
                           var10000 = var15[var33];
                        }

                        while(true) {
                           if (var10000 != -1 && !class645.field9054.method485(0, var15[var33]).method2004(arg0, 2, (class745)null)) {
                              var32 = 1;
                           }

                           ++var33;
                           if (var15.length <= var33) {
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

                     var34 = new class200[var15.length];
                     var35 = 0;
                     if (var11) {
                        if (~var15[var35] != 0) {
                           var34[var35] = class645.field9054.method485(0, var15[var35]).method2009(arg0, (class745)null, (byte)35);
                        }

                        ++var35;
                     }

                     while(true) {
                        while(var15.length > var35) {
                           if (~var15[var35] != 0) {
                              var34[var35] = class645.field9054.method485(0, var15[var35]).method2009(arg0, (class745)null, (byte)35);
                           }

                           ++var35;
                        }

                        if (!var11) {
                           if (var14 != null && var14.field1480 != null) {
                              var36 = 0;
                              if (var11 || ~var36 > ~var14.field1480.length) {
                                 do {
                                    if (var14.field1480[var36] != null) {
                                       if (var34[var36] == null && !var11) {
                                          ++var36;
                                       } else {
                                          var37 = var14.field1480[var36][0];
                                          var38 = var14.field1480[var36][1];
                                          var39 = var14.field1480[var36][2];
                                          var40 = var14.field1480[var36][3];
                                          var41 = var14.field1480[var36][4];
                                          var42 = var14.field1480[var36][5];
                                          if (~var40 == -1) {
                                             if (~var41 == -1) {
                                                if (~var42 != -1) {
                                                   var34[var36].method1507(var42, var40, (byte)36, var41);
                                                }
                                             } else {
                                                var34[var36].method1507(var42, var40, (byte)36, var41);
                                             }
                                          } else {
                                             var34[var36].method1507(var42, var40, (byte)36, var41);
                                          }

                                          if (var37 == 0) {
                                             if (~var38 == -1) {
                                                if (~var39 != -1) {
                                                   var34[var36].method1510((byte)106, var39, var37, var38);
                                                   ++var36;
                                                } else {
                                                   ++var36;
                                                }
                                             } else {
                                                var34[var36].method1510((byte)106, var39, var37, var38);
                                                ++var36;
                                             }
                                          } else {
                                             var34[var36].method1510((byte)106, var39, var37, var38);
                                             ++var36;
                                          }
                                       }
                                    } else {
                                       ++var36;
                                    }
                                 } while(~var36 > ~var14.field1480.length);
                              }
                           }

                           var43 = new class200(var34, var34.length);
                           if (arg1 != null) {
                              var31 = var13 | 16384;
                           }

                           var12 = arg6.method573(var43, var31, class49.field563, 64, 850);
                           if (arg1 != null) {
                              var44 = 0;
                              if (var11 || ~var44 > -6) {
                                 do {
                                    var45 = 0;
                                    if (var11) {
                                       if (class648.field9085[var45][var44].length > arg1.field9078[var44]) {
                                          var12.method349(class24.field309[var45][var44], class648.field9085[var45][var44][arg1.field9078[var44]]);
                                       }

                                       ++var45;
                                    }

                                    while(true) {
                                       while(~var45 > ~class648.field9085.length) {
                                          if (class648.field9085[var45][var44].length > arg1.field9078[var44]) {
                                             var12.method349(class24.field309[var45][var44], class648.field9085[var45][var44][arg1.field9078[var44]]);
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

                           if (class622.field8690 != null) {
                              var12.method352(var13);
                              class622.field8690.method4238(118, var12, var29);
                           }
                           break;
                        }

                        ++var35;
                     }
                  }

                  if (arg3 != null && var23 != null) {
                     var46 = var12.method338((byte)1, var13, true);
                     var46.method3623(var21, var20, arg9 + -1, 8353, 0, var24, var23, var22, arg3.field645);
                     return var46;
                  }

                  return var12;
               }

               if (arg2 < 86) {
                  var15[var16] = this.field11463[var17];
                  if (var11) {
                     var15[var16] = -1;
                     ++var16;
                  } else {
                     ++var16;
                  }
               } else {
                  var15[var16] = -1;
                  ++var16;
               }
            }
         } else {
            var16 = 0;
            var17 = 0;
            var18 = false;
            var19 = false;
            var20 = -1;
            if (!var11) {
               if (arg2 < 86) {
                  this.field11463 = null;
               }

               var21 = -1;
               var22 = 0;
               var23 = null;
               var24 = null;
               if (arg3 != null) {
                  var25 = arg3.field667[arg7];
                  var13 = arg4 | 32;
                  var26 = var25 >>> 16;
                  var23 = class392.field5479.method1478(75, var26);
                  var20 = var25 & 65535;
                  if (var23 != null) {
                     var17 |= var23.method3482(-19443, var20);
                     var16 |= var23.method3479(var20, 0);
                     var19 |= var23.method3480(var20, 4);
                     var18 |= arg3.field645;
                  }

                  if ((arg3.field669 || class305.field4050) && ~arg5 != 0 && ~arg5 > ~arg3.field667.length) {
                     var22 = arg3.field661[arg7];
                     var27 = arg3.field667[arg5];
                     var28 = var27 >>> 16;
                     var21 = var27 & 65535;
                     if (var26 == var28) {
                        var24 = var23;
                     } else {
                        var24 = class392.field5479.method1478(78, var21 >>> 16);
                     }

                     if (var24 != null) {
                        var17 |= var24.method3482(-19443, var21);
                        var16 |= var24.method3479(var21, 0);
                        var19 |= var24.method3480(var21, 4);
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

               var29 = this.method5649(38, arg1 == null ? null : arg1.field9078, var15, arg0, arg8);
               if (class622.field8690 != null) {
                  var12 = (class501)class622.field8690.method4239(var29, 0);
               }

               if (var12 == null || ~arg6.method540(var12.method341(), var13) != -1) {
                  if (var12 != null) {
                     var13 = arg6.method503(var13, var12.method341());
                  }

                  label487: {
                     var31 = var13;
                     var32 = 0;
                     var33 = 0;
                     if (var11) {
                        var10000 = var15[var33];
                     } else if (var15.length <= var33) {
                        var10000 = var32;
                        if (!var11) {
                           break label487;
                        }
                     } else {
                        var10000 = var15[var33];
                     }

                     while(true) {
                        if (var10000 != -1 && !class645.field9054.method485(0, var15[var33]).method2004(arg0, 2, (class745)null)) {
                           var32 = 1;
                        }

                        ++var33;
                        if (var15.length <= var33) {
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

                  var34 = new class200[var15.length];
                  var35 = 0;
                  if (var11) {
                     if (~var15[var35] != 0) {
                        var34[var35] = class645.field9054.method485(0, var15[var35]).method2009(arg0, (class745)null, (byte)35);
                     }

                     ++var35;
                  }

                  while(true) {
                     while(var15.length > var35) {
                        if (~var15[var35] != 0) {
                           var34[var35] = class645.field9054.method485(0, var15[var35]).method2009(arg0, (class745)null, (byte)35);
                        }

                        ++var35;
                     }

                     if (!var11) {
                        if (var14 != null && var14.field1480 != null) {
                           var36 = 0;
                           if (var11 || ~var36 > ~var14.field1480.length) {
                              do {
                                 if (var14.field1480[var36] != null) {
                                    if (var34[var36] == null && !var11) {
                                       ++var36;
                                    } else {
                                       var37 = var14.field1480[var36][0];
                                       var38 = var14.field1480[var36][1];
                                       var39 = var14.field1480[var36][2];
                                       var40 = var14.field1480[var36][3];
                                       var41 = var14.field1480[var36][4];
                                       var42 = var14.field1480[var36][5];
                                       if (~var40 == -1) {
                                          if (~var41 == -1) {
                                             if (~var42 != -1) {
                                                var34[var36].method1507(var42, var40, (byte)36, var41);
                                             }
                                          } else {
                                             var34[var36].method1507(var42, var40, (byte)36, var41);
                                          }
                                       } else {
                                          var34[var36].method1507(var42, var40, (byte)36, var41);
                                       }

                                       if (var37 == 0) {
                                          if (~var38 == -1) {
                                             if (~var39 != -1) {
                                                var34[var36].method1510((byte)106, var39, var37, var38);
                                                ++var36;
                                             } else {
                                                ++var36;
                                             }
                                          } else {
                                             var34[var36].method1510((byte)106, var39, var37, var38);
                                             ++var36;
                                          }
                                       } else {
                                          var34[var36].method1510((byte)106, var39, var37, var38);
                                          ++var36;
                                       }
                                    }
                                 } else {
                                    ++var36;
                                 }
                              } while(~var36 > ~var14.field1480.length);
                           }
                        }

                        var43 = new class200(var34, var34.length);
                        if (arg1 != null) {
                           var31 = var13 | 16384;
                        }

                        var12 = arg6.method573(var43, var31, class49.field563, 64, 850);
                        if (arg1 != null) {
                           var44 = 0;
                           if (var11 || ~var44 > -6) {
                              do {
                                 var45 = 0;
                                 if (var11) {
                                    if (class648.field9085[var45][var44].length > arg1.field9078[var44]) {
                                       var12.method349(class24.field309[var45][var44], class648.field9085[var45][var44][arg1.field9078[var44]]);
                                    }

                                    ++var45;
                                 }

                                 while(true) {
                                    while(~var45 > ~class648.field9085.length) {
                                       if (class648.field9085[var45][var44].length > arg1.field9078[var44]) {
                                          var12.method349(class24.field309[var45][var44], class648.field9085[var45][var44][arg1.field9078[var44]]);
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

                        if (class622.field8690 != null) {
                           var12.method352(var13);
                           class622.field8690.method4238(118, var12, var29);
                        }
                        break;
                     }

                     ++var35;
                  }
               }

               if (arg3 != null && var23 != null) {
                  var46 = var12.method338((byte)1, var13, true);
                  var46.method3623(var21, var20, arg9 + -1, 8353, 0, var24, var23, var22, arg3.field645);
                  return var46;
               }

               return var12;
            }

            if (arg2 < 86) {
               var15[var16] = this.field11463[var17];
               if (var11) {
                  var15[var16] = -1;
                  ++var16;
               } else {
                  ++var16;
               }
            } else {
               var15[var16] = -1;
               ++var16;
            }
         }

         while(true) {
            while(var14.field1507.length > var16) {
               var17 = var14.field1507[var16];
               if (var17 >= 0) {
                  if (var17 < this.field11463.length) {
                     var15[var16] = this.field11463[var17];
                     if (var11) {
                        var15[var16] = -1;
                        ++var16;
                     } else {
                        ++var16;
                     }
                  } else {
                     var15[var16] = -1;
                     ++var16;
                  }
               } else {
                  var15[var16] = -1;
                  ++var16;
               }
            }

            var16 = 0;
            var17 = 0;
            var18 = false;
            var19 = false;
            var20 = -1;
            if (!var11) {
               if (arg2 < 86) {
                  this.field11463 = null;
               }

               var21 = -1;
               var22 = 0;
               var23 = null;
               var24 = null;
               if (arg3 != null) {
                  var25 = arg3.field667[arg7];
                  var13 = arg4 | 32;
                  var26 = var25 >>> 16;
                  var23 = class392.field5479.method1478(75, var26);
                  var20 = var25 & 65535;
                  if (var23 != null) {
                     var17 |= var23.method3482(-19443, var20);
                     var16 |= var23.method3479(var20, 0);
                     var19 |= var23.method3480(var20, 4);
                     var18 |= arg3.field645;
                  }

                  if ((arg3.field669 || class305.field4050) && ~arg5 != 0 && ~arg5 > ~arg3.field667.length) {
                     var22 = arg3.field661[arg7];
                     var27 = arg3.field667[arg5];
                     var28 = var27 >>> 16;
                     var21 = var27 & 65535;
                     if (var26 == var28) {
                        var24 = var23;
                     } else {
                        var24 = class392.field5479.method1478(78, var21 >>> 16);
                     }

                     if (var24 != null) {
                        var17 |= var24.method3482(-19443, var21);
                        var16 |= var24.method3479(var21, 0);
                        var19 |= var24.method3480(var21, 4);
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

               var29 = this.method5649(38, arg1 == null ? null : arg1.field9078, var15, arg0, arg8);
               if (class622.field8690 != null) {
                  var12 = (class501)class622.field8690.method4239(var29, 0);
               }

               if (var12 == null || ~arg6.method540(var12.method341(), var13) != -1) {
                  if (var12 != null) {
                     var13 = arg6.method503(var13, var12.method341());
                  }

                  label299: {
                     var31 = var13;
                     var32 = 0;
                     var33 = 0;
                     if (var11) {
                        var10000 = var15[var33];
                     } else if (var15.length <= var33) {
                        var10000 = var32;
                        if (!var11) {
                           break label299;
                        }
                     } else {
                        var10000 = var15[var33];
                     }

                     while(true) {
                        if (var10000 != -1 && !class645.field9054.method485(0, var15[var33]).method2004(arg0, 2, (class745)null)) {
                           var32 = 1;
                        }

                        ++var33;
                        if (var15.length <= var33) {
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

                  var34 = new class200[var15.length];
                  var35 = 0;
                  if (var11) {
                     if (~var15[var35] != 0) {
                        var34[var35] = class645.field9054.method485(0, var15[var35]).method2009(arg0, (class745)null, (byte)35);
                     }

                     ++var35;
                  }

                  while(true) {
                     while(var15.length > var35) {
                        if (~var15[var35] != 0) {
                           var34[var35] = class645.field9054.method485(0, var15[var35]).method2009(arg0, (class745)null, (byte)35);
                        }

                        ++var35;
                     }

                     if (!var11) {
                        if (var14 != null && var14.field1480 != null) {
                           var36 = 0;
                           if (var11 || ~var36 > ~var14.field1480.length) {
                              do {
                                 if (var14.field1480[var36] != null) {
                                    if (var34[var36] == null && !var11) {
                                       ++var36;
                                    } else {
                                       var37 = var14.field1480[var36][0];
                                       var38 = var14.field1480[var36][1];
                                       var39 = var14.field1480[var36][2];
                                       var40 = var14.field1480[var36][3];
                                       var41 = var14.field1480[var36][4];
                                       var42 = var14.field1480[var36][5];
                                       if (~var40 == -1) {
                                          if (~var41 == -1) {
                                             if (~var42 != -1) {
                                                var34[var36].method1507(var42, var40, (byte)36, var41);
                                             }
                                          } else {
                                             var34[var36].method1507(var42, var40, (byte)36, var41);
                                          }
                                       } else {
                                          var34[var36].method1507(var42, var40, (byte)36, var41);
                                       }

                                       if (var37 == 0) {
                                          if (~var38 == -1) {
                                             if (~var39 != -1) {
                                                var34[var36].method1510((byte)106, var39, var37, var38);
                                                ++var36;
                                             } else {
                                                ++var36;
                                             }
                                          } else {
                                             var34[var36].method1510((byte)106, var39, var37, var38);
                                             ++var36;
                                          }
                                       } else {
                                          var34[var36].method1510((byte)106, var39, var37, var38);
                                          ++var36;
                                       }
                                    }
                                 } else {
                                    ++var36;
                                 }
                              } while(~var36 > ~var14.field1480.length);
                           }
                        }

                        var43 = new class200(var34, var34.length);
                        if (arg1 != null) {
                           var31 = var13 | 16384;
                        }

                        var12 = arg6.method573(var43, var31, class49.field563, 64, 850);
                        if (arg1 != null) {
                           var44 = 0;
                           if (var11 || ~var44 > -6) {
                              do {
                                 var45 = 0;
                                 if (var11) {
                                    if (class648.field9085[var45][var44].length > arg1.field9078[var44]) {
                                       var12.method349(class24.field309[var45][var44], class648.field9085[var45][var44][arg1.field9078[var44]]);
                                    }

                                    ++var45;
                                 }

                                 while(true) {
                                    while(~var45 > ~class648.field9085.length) {
                                       if (class648.field9085[var45][var44].length > arg1.field9078[var44]) {
                                          var12.method349(class24.field309[var45][var44], class648.field9085[var45][var44][arg1.field9078[var44]]);
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

                        if (class622.field8690 != null) {
                           var12.method352(var13);
                           class622.field8690.method4238(118, var12, var29);
                        }
                        break;
                     }

                     ++var35;
                  }
               }

               if (arg3 != null && var23 != null) {
                  var46 = var12.method338((byte)1, var13, true);
                  var46.method3623(var21, var20, arg9 + -1, 8353, 0, var24, var23, var22, arg3.field645);
                  return var46;
               }

               return var12;
            }

            if (arg2 < 86) {
               var15[var16] = this.field11463[var17];
               if (var11) {
                  var15[var16] = -1;
                  ++var16;
               } else {
                  ++var16;
               }
            } else {
               var15[var16] = -1;
               ++var16;
            }
         }
      } catch (RuntimeException var48) {
         throw class534.method3846(var48, field11466[8] + arg0 + ',' + (arg1 != null ? field11466[1] : field11466[2]) + ',' + arg2 + ',' + (arg3 != null ? field11466[1] : field11466[2]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field11466[1] : field11466[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(IZIIII)V"
   )
   public static final void method5651(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field4273;

      try {
         ++field11457;
         if (class111.field1404 == null) {
            class338.field4832.method510(3966, arg2, arg5, -16777216, arg3, arg0);
         } else if (~class278.field3709.field999 <= -1 && ~(class507.field7030 * 512) < ~class278.field3709.field999 && class278.field3709.field1003 >= 0 && class215.field2667 * 512 > class278.field3709.field1003) {
            ++class766.field11053;
            if (class278.field3709 != null && class278.field3709.field999 - (-1 + class278.field3709.method3060((byte)38)) * 256 >> 9 == class529.field7262 && ~(class278.field3709.field1003 - (class278.field3709.method3060((byte)38) * 256 + -256) >> 9) == ~class196.field2380) {
               class529.field7262 = -1;
               class196.field2380 = -1;
               class624.method4533(15);
            }

            class235.method1773(3);
            if (!arg1) {
               class307.method2310((byte)-20);
            }

            int var22;
            int var23;
            int var24;
            int var25;
            label328: {
               class767.method5499((byte)-102);
               class296.method2229(arg3, arg2, arg5, 90, arg0, true);
               var23 = class111.field1400;
               var25 = class119.field1451;
               class334.field4784 = class334.field4788;
               var24 = class479.field6610;
               var22 = class414.field5819;
               if (~class635.field8977 == -2) {
                  int var7 = (int)class676.field9918;
                  if (~(class524.field7180 >> 8) < ~var7) {
                     var7 = class524.field7180 >> 8;
                  }

                  if (class205.field2521[4] && ~var7 > ~(class311.field4123[4] + 128)) {
                     var7 = class311.field4123[4] - -128;
                  }

                  int var8 = (int)class363.field5142 + class719.field10538 & 16383;
                  class254.method1933(var7, (var7 >> 3) * 3 + 600 << 2, var22, class682.field10004, class109.field1383, class687.method5016(class278.field3709.field999, class239.field2981, class278.field3709.field1003, 2) - 200, var8, 3);
                  if (!var6) {
                     break label328;
                  }
               }

               if (class635.field8977 == 4) {
                  int var9 = (int)class676.field9918;
                  if (var9 < class524.field7180 >> 8) {
                     var9 = class524.field7180 >> 8;
                  }

                  if (class205.field2521[4] && ~var9 > ~(class311.field4123[4] + 128)) {
                     var9 = class311.field4123[4] + 128;
                  }

                  int var10 = 16383 & (int)class363.field5142;
                  class254.method1933(var9, (var9 >> 3) * 3 + 600 << 2, var22, class682.field10004, class109.field1383, -200 + class687.method5016(class338.field4839, class239.field2981, class221.field2763, 2), var10, 3);
                  if (!var6) {
                     break label328;
                  }
               }

               if (~class635.field8977 == -6) {
                  class89.method850((byte)48, var22);
               }
            }

            int var11 = class737.field10747;
            int var12 = class331.field4733;
            int var13 = class532.field7284;
            int var14 = class171.field2144;
            int var15 = class749.field10899;
            int var16 = 0;
            int var17;
            if (var6) {
               if (class205.field2521[var16]) {
                  var17 = (int)((double)(class44.field501[var16] * 2 + 1) * Math.random() - (double)class44.field501[var16] + Math.sin((double)class497.field6833[var16] / 100.0D * (double)class235.field2907[var16]) * (double)class311.field4123[var16]);
                  if (~var16 == -5) {
                     class171.field2144 += var17;
                     if (class171.field2144 < 1024) {
                        class171.field2144 = 1024;
                        if (var6 && ~class171.field2144 < -3073) {
                           class171.field2144 = 3072;
                        }
                     } else if (~class171.field2144 < -3073) {
                        class171.field2144 = 3072;
                     }
                  }

                  if (~var16 == -3) {
                     class532.field7284 += var17 << 2;
                  }

                  if (var16 == 1) {
                     class331.field4733 += var17 << 2;
                  }

                  if (var16 == 0) {
                     class737.field10747 += var17 << 2;
                  }

                  if (var16 == 3) {
                     class749.field10899 = class749.field10899 + var17 & 16383;
                  }

                  ++var16;
               } else {
                  ++var16;
               }
            }

            while(true) {
               while(~var16 > -6) {
                  if (class205.field2521[var16]) {
                     var17 = (int)((double)(class44.field501[var16] * 2 + 1) * Math.random() - (double)class44.field501[var16] + Math.sin((double)class497.field6833[var16] / 100.0D * (double)class235.field2907[var16]) * (double)class311.field4123[var16]);
                     if (~var16 == -5) {
                        class171.field2144 += var17;
                        if (class171.field2144 < 1024) {
                           class171.field2144 = 1024;
                           if (var6 && ~class171.field2144 < -3073) {
                              class171.field2144 = 3072;
                           }
                        } else if (~class171.field2144 < -3073) {
                           class171.field2144 = 3072;
                        }
                     }

                     if (~var16 == -3) {
                        class532.field7284 += var17 << 2;
                     }

                     if (var16 == 1) {
                        class331.field4733 += var17 << 2;
                     }

                     if (var16 == 0) {
                        class737.field10747 += var17 << 2;
                     }

                     if (var16 == 3) {
                        class749.field10899 = class749.field10899 + var17 & 16383;
                     }

                     ++var16;
                  } else {
                     ++var16;
                  }
               }

               int var10000 = ~class737.field10747;
               if (!var6) {
                  if (var10000 > -1) {
                     class737.field10747 = 0;
                  }

                  if (class532.field7284 < 0) {
                     class532.field7284 = 0;
                  }

                  if (~class737.field10747 < ~((class635.field8973 << 9) + -1)) {
                     class737.field10747 = (class635.field8973 << 9) + -1;
                  }

                  if (~((class304.field4042 << 9) + -1) > ~class532.field7284) {
                     class532.field7284 = (class304.field4042 << 9) - 1;
                  }

                  class246.method1857((byte)122);
                  class665.method4815((byte)-21);
                  class338.field4832.method577(var25, var23, var24 + var25, var22 + var23);
                  if (arg4 > -68) {
                     return;
                  }

                  label335: {
                     class78.method757(true, 57);
                     if (class775.field11283) {
                        class341.method2703(62, class277.field3704);
                        if (~class648.field9093 != ~class334.field4784) {
                           class591.field8180 = true;
                        }

                        class648.field9093 = class334.field4784;
                        if (!var6) {
                           break label335;
                        }
                     }

                     class338.field4832.method608();
                     int var18 = class277.field3704;
                     if (class256.field3271 != null) {
                        class256.field3271.method1816(var23, class593.field8192 << 3, var24, false, var22, class749.field10899, var18, class171.field2144, var25, class338.field4832);
                        if (!var6) {
                           break label335;
                        }
                     }

                     class338.field4832.method589(var18);
                  }

                  label336: {
                     class736.method5336((byte)96);
                     class92.field1230.method149(class737.field10747, class331.field4733, class532.field7284, 16383 & -class171.field2144, 16383 & -class749.field10899, -class191.field2317 & 16383);
                     class338.field4832.method581(class92.field1230);
                     class338.field4832.method526(var25 - -(var24 / 2), var23 - -(var22 / 2), class56.field606 << 1, class56.field606 << 1);
                     class617.method4477(25258, var23 - -(var22 / 2), var25 - -(var24 / 2), class56.field606 << 1, class56.field606 << 1);
                     class405.method3074(class331.field4733, 16383 & -class171.field2144, class532.field7284, -class191.field2317 & 16383, -835637152, class737.field10747, 16383 & -class749.field10899);
                     byte var19 = ~class674.field9907.field8421.method4193((byte)-126) == -3 ? (byte)class766.field11053 : 1;
                     if (class775.field11283) {
                        class498.method3604((byte)105, 16383 & -class171.field2144, 16383 & -class749.field10899, 16383 & -class191.field2317);
                        class402.method3044(class329.field4719, class441.field6116, class540.field7380, class737.field10749, class532.field7284, class737.field10747, ~class674.field9907.field8445.method3776((byte)-106) == -1, class278.field3709.field1001 + 1, true, class334.field4784, class278.field3709.field999 >> 9, class369.field5205, class53.field579, var19, class779.field11372, (byte)28, class331.field4733, class278.field3709.field1003 >> 9);
                        if (!var6) {
                           break label336;
                        }
                     }

                     class136.method1138(class369.field5205, class737.field10747, class331.field4733, class532.field7284, class737.field10749, class329.field4719, class779.field11372, class540.field7380, class441.field6116, class53.field579, class278.field3709.field1001 + 1, var19, class278.field3709.field999 >> 9, class278.field3709.field1003 >> 9, class674.field9907.field8445.method3776((byte)-84) == 0, true, !class33.field392 ? -1 : class334.field4784, 0, false);
                  }

                  class736.method5336((byte)96);
                  if (~class445.field6162 == -12) {
                     class90.method859(var22, var24, 256, -12900, var23, 256, var25);
                     class349.method2753(var23, 256, var22, var25, (byte)-70, var24, 256);
                     class443.method3295(var22, 683, var23, 256, var25, 256, var24);
                     class697.method5065((byte)-121, var25, var23, var24, var22);
                  }

                  class247.method1862();
                  class331.field4733 = var12;
                  class171.field2144 = var14;
                  class749.field10899 = var15;
                  class737.field10747 = var11;
                  class532.field7284 = var13;
                  if (class124.field1549 && ~class73.field896.method1103((byte)37) == -1) {
                     class124.field1549 = false;
                  }

                  if (class124.field1549) {
                     class338.field4832.method510(3966, var23, var25, -16777216, var24, var22);
                     class134.method1128(class551.field7533.method3980(class494.field6787, true), false, class163.field2095, class22.field281, class338.field4832, false);
                  }

                  class78.method757(false, 30);
                  return;
               }

               var17 = (int)((double)(var10000 + -1) * Math.random() - (double)class44.field501[var16] + Math.sin((double)class497.field6833[var16] / 100.0D * (double)class235.field2907[var16]) * (double)class311.field4123[var16]);
               if (~var16 == -5) {
                  class171.field2144 += var17;
                  if (class171.field2144 < 1024) {
                     class171.field2144 = 1024;
                     if (var6 && ~class171.field2144 < -3073) {
                        class171.field2144 = 3072;
                     }
                  } else if (~class171.field2144 < -3073) {
                     class171.field2144 = 3072;
                  }
               }

               if (~var16 == -3) {
                  class532.field7284 += var17 << 2;
               }

               if (var16 == 1) {
                  class331.field4733 += var17 << 2;
               }

               if (var16 == 0) {
                  class737.field10747 += var17 << 2;
               }

               if (var16 == 3) {
                  class749.field10899 = class749.field10899 + var17 & 16383;
               }

               ++var16;
            }
         } else {
            class338.field4832.method510(3966, arg2, arg5, -16777216, arg3, arg0);
         }
      } catch (RuntimeException var21) {
         throw class534.method3846(var21, field11466[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5652(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5653(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
