import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class347 {
   @OriginalMember(
      owner = "client!dc",
      name = "o",
      descriptor = "[I"
   )
   public int[] field87 = new int[1];
   @OriginalMember(
      owner = "client!dc",
      name = "i",
      descriptor = "[I"
   )
   public int[] field88 = new int[]{-1};
   @OriginalMember(
      owner = "client!dc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field99 = new String[]{method50(method49("5[f\u0013^")), method50(method49("5[f\u001d^")), method50(method49("?M$9")), method50(method49("5[f\u0017^")), method50(method49("*\u0016f{\u000b")), method50(method49("5[f\u0011^")), method50(method49("5[f\u0012^")), method50(method49("5[f\u0016^")), method50(method49("5[f\u0010^")), method50(method49("5[f\u0014^"))};
   @OriginalMember(
      owner = "client!dc",
      name = "p",
      descriptor = "I"
   )
   public static int field91 = 1339;
   @OriginalMember(
      owner = "client!dc",
      name = "j",
      descriptor = "Ljava/util/Random;"
   )
   public static Random field92 = new Random();
   @OriginalMember(
      owner = "client!dc",
      name = "l",
      descriptor = "I"
   )
   public static int field89;
   @OriginalMember(
      owner = "client!dc",
      name = "n",
      descriptor = "I"
   )
   public static int field90;
   @OriginalMember(
      owner = "client!dc",
      name = "t",
      descriptor = "I"
   )
   public static int field93;
   @OriginalMember(
      owner = "client!dc",
      name = "k",
      descriptor = "I"
   )
   public static int field94;
   @OriginalMember(
      owner = "client!dc",
      name = "m",
      descriptor = "I"
   )
   public static int field95;
   @OriginalMember(
      owner = "client!dc",
      name = "r",
      descriptor = "I"
   )
   public static int field96;
   @OriginalMember(
      owner = "client!dc",
      name = "s",
      descriptor = "I"
   )
   public static int field97;
   @OriginalMember(
      owner = "client!dc",
      name = "q",
      descriptor = "[Lat;"
   )
   public static class396[] field98;

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(B)V",
      line = 6
   )
   public static final void method41(byte arg0) {
      try {
         ++field94;
         if (arg0 > -110) {
            field98 = null;
         }

         class752.field11122 = -1;
         class591.field8737 = "";
         class256.field3450 = 0L;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field99[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(I)V",
      line = 20
   )
   public static final void method42(int arg0) {
      int var1 = client.field4530;

      try {
         ++field93;
         if (class437.field6663 != null) {
            int var2 = 0;
            if (var1 != 0) {
               class437.field6663[var2] = null;
               ++var2;
            }

            while(true) {
               while(~var2 > ~class486.field7191) {
                  class437.field6663[var2] = null;
                  ++var2;
               }

               if (var1 == 0) {
                  class437.field6663 = null;
                  break;
               }

               ++var2;
            }
         }

         if (class604.field8885 != null) {
            int var3 = 0;
            if (var1 != 0) {
               class604.field8885[var3] = null;
               ++var3;
            }

            while(true) {
               while(class57.field713 > var3) {
                  class604.field8885[var3] = null;
                  ++var3;
               }

               if (var1 == 0) {
                  class604.field8885 = null;
                  break;
               }

               ++var3;
            }
         }

         if (class368.field5540 != null) {
            int var4 = 0;
            if (var1 != 0) {
               class368.field5540[var4] = null;
               ++var4;
            }

            while(true) {
               while(var4 < class601.field8821) {
                  class368.field5540[var4] = null;
                  ++var4;
               }

               if (var1 == 0) {
                  class368.field5540 = null;
                  break;
               }

               ++var4;
            }
         }

         class40.field433 = -1;
         class25.field261 = -1;
         if (arg0 == 26648) {
            class755.field11143 = null;
            class664.field9661 = null;
            class66.field819 = null;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field99[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Z",
      line = 73
   )
   public static final boolean method43(String arg0, int arg1) {
      try {
         if (arg1 != -20946) {
            return true;
         } else {
            ++field90;
            return class40.field425.containsKey(arg0);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field99[9] + (arg0 != null ? field99[4] : field99[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(ILha;Lfv;IIIZIILpl;)Lka;",
      line = 84
   )
   public final class497 method44(int arg0, class66 arg1, class131 arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, class676 arg9) {
      int var11 = client.field4530;

      try {
         ++field97;
         class497 var12 = null;
         int var13 = arg0;
         class283 var14 = null;
         if (~arg8 != 0) {
            var14 = class759.field11174.method1655(arg8, (byte)-119);
         }

         int[] var15 = this.field88;
         int var16;
         int var10000;
         int var17;
         boolean var18;
         boolean var19;
         int var20;
         int var21;
         int var22;
         class441 var23;
         class441 var24;
         int var25;
         int var26;
         int var27;
         int var28;
         long var29;
         int var31;
         byte var32;
         int var33;
         class134[] var34;
         int var35;
         int var36;
         int var37;
         int var38;
         int var39;
         int var40;
         int var41;
         int var42;
         class134 var43;
         int var44;
         int var45;
         class497 var46;
         if (var14 != null) {
            if (var14.field3981 != null) {
               var15 = new int[var14.field3981.length];
               var16 = 0;
               if (var11 != 0) {
                  var17 = var14.field3981[var16];
                  if (var17 >= 0) {
                     if (this.field88.length <= var17) {
                        var15[var16] = -1;
                        if (var11 != 0) {
                           var15[var16] = this.field88[var17];
                           ++var16;
                        } else {
                           ++var16;
                        }
                     } else {
                        var15[var16] = this.field88[var17];
                        ++var16;
                     }
                  } else {
                     var15[var16] = -1;
                     if (var11 != 0) {
                        var15[var16] = this.field88[var17];
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
               var19 = false;
               var20 = -1;
               if (var11 == 0) {
                  if (arg7 != -28923) {
                     method45(19);
                  }

                  var21 = -1;
                  var22 = 0;
                  var23 = null;
                  var24 = null;
                  if (arg9 != null) {
                     var25 = arg9.field10165[arg4];
                     var13 = arg0 | 32;
                     var26 = var25 >>> 16;
                     var23 = class576.field8554.method3192(arg7 + 391, var26);
                     var20 = var25 & 65535;
                     if (var23 != null) {
                        var17 |= var23.method3338(116, var20);
                        var16 |= var23.method3339(arg7 ^ -28805, var20);
                        var19 |= var23.method3334(var20, 1359);
                        var18 |= arg9.field10161;
                     }

                     if ((arg9.field10149 || class631.field9178) && arg5 != -1 && ~arg9.field10165.length < ~arg5) {
                        var27 = arg9.field10165[arg5];
                        var22 = arg9.field10151[arg4];
                        var28 = var27 >>> 16;
                        var21 = var27 & 65535;
                        if (~var26 == ~var28) {
                           var24 = var23;
                        } else {
                           var24 = class576.field8554.method3192(-28532, var21 >>> 16);
                        }

                        if (var24 != null) {
                           var17 |= var24.method3338(arg7 + 29045, var21);
                           var16 |= var24.method3339(123, var21);
                           var19 |= var24.method3334(var21, arg7 + 30282);
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

                  var29 = this.method46(0, var15, arg8, arg6, arg2 != null ? arg2.field1626 : null);
                  if (class310.field4409 != null) {
                     var12 = (class497)class310.field4409.method5454(var29, 18261);
                  }

                  if (var12 == null || arg1.method632(var12.method326(), var13) != 0) {
                     if (var12 != null) {
                        var13 = arg1.method560(var13, var12.method326());
                     }

                     label842: {
                        var31 = var13;
                        var32 = 0;
                        var33 = 0;
                        if (var11 != 0) {
                           var10000 = ~var15[var33];
                        } else if (var15.length <= var33) {
                           var10000 = var32;
                           if (var11 == 0) {
                              break label842;
                           }
                        } else {
                           var10000 = ~var15[var33];
                        }

                        while(true) {
                           if (var10000 != 0 && !class54.field616.method1689(var15[var33], (byte)-58).method836(false, arg6, (class258)null)) {
                              var32 = 1;
                           }

                           ++var33;
                           if (var15.length <= var33) {
                              var10000 = var32;
                              if (var11 == 0) {
                                 break;
                              }
                           } else {
                              var10000 = ~var15[var33];
                           }
                        }
                     }

                     if (var10000 != 0) {
                        return null;
                     }

                     var34 = new class134[var15.length];
                     var35 = 0;
                     if (var11 != 0) {
                        if (var15[var35] != -1) {
                           var34[var35] = class54.field616.method1689(var15[var35], (byte)-16).method827((byte)45, (class258)null, arg6);
                        }

                        ++var35;
                     }

                     while(true) {
                        while(~var35 > ~var15.length) {
                           if (var15[var35] != -1) {
                              var34[var35] = class54.field616.method1689(var15[var35], (byte)-16).method827((byte)45, (class258)null, arg6);
                           }

                           ++var35;
                        }

                        if (var11 == 0) {
                           if (var14 != null && var14.field3967 != null) {
                              var36 = 0;
                              if (var11 != 0 || var14.field3967.length > var36) {
                                 do {
                                    if (var14.field3967[var36] != null) {
                                       if (var34[var36] == null && var11 == 0) {
                                          ++var36;
                                       } else {
                                          var37 = var14.field3967[var36][0];
                                          var38 = var14.field3967[var36][1];
                                          var39 = var14.field3967[var36][2];
                                          var40 = var14.field3967[var36][3];
                                          var41 = var14.field3967[var36][4];
                                          var42 = var14.field3967[var36][5];
                                          if (~var40 == -1) {
                                             if (~var41 == -1) {
                                                if (~var42 != -1) {
                                                   var34[var36].method1146(806800366, var42, var40, var41);
                                                }
                                             } else {
                                                var34[var36].method1146(806800366, var42, var40, var41);
                                             }
                                          } else {
                                             var34[var36].method1146(806800366, var42, var40, var41);
                                          }

                                          if (~var37 == -1) {
                                             if (var38 == 0) {
                                                if (~var39 != -1) {
                                                   var34[var36].method1145(var38, var39, var37, 0);
                                                   ++var36;
                                                } else {
                                                   ++var36;
                                                }
                                             } else {
                                                var34[var36].method1145(var38, var39, var37, 0);
                                                ++var36;
                                             }
                                          } else {
                                             var34[var36].method1145(var38, var39, var37, 0);
                                             ++var36;
                                          }
                                       }
                                    } else {
                                       ++var36;
                                    }
                                 } while(var14.field3967.length > var36);
                              }
                           }

                           var43 = new class134(var34, var34.length);
                           if (arg2 != null) {
                              var31 = var13 | 16384;
                           }

                           var12 = arg1.method547(var43, var31, class91.field1167, 64, 850);
                           if (arg2 != null) {
                              var44 = 0;
                              if (var11 != 0 || ~var44 > -6) {
                                 do {
                                    var45 = 0;
                                    if (var11 != 0) {
                                       if (~class314.field4496[var45][var44].length < ~arg2.field1626[var44]) {
                                          var12.method320(class680.field10218[var45][var44], class314.field4496[var45][var44][arg2.field1626[var44]]);
                                       }

                                       ++var45;
                                    }

                                    while(true) {
                                       while(~class314.field4496.length < ~var45) {
                                          if (~class314.field4496[var45][var44].length < ~arg2.field1626[var44]) {
                                             var12.method320(class680.field10218[var45][var44], class314.field4496[var45][var44][arg2.field1626[var44]]);
                                          }

                                          ++var45;
                                       }

                                       if (var11 == 0) {
                                          ++var44;
                                          break;
                                       }

                                       ++var45;
                                    }
                                 } while(~var44 > -6);
                              }
                           }

                           if (class310.field4409 != null) {
                              var12.method333(var13);
                              class310.field4409.method5455(-2049, var12, var29);
                           }
                           break;
                        }

                        ++var35;
                     }
                  }

                  if (arg9 != null && var23 != null) {
                     var46 = var12.method343((byte)1, var13, true);
                     var46.method3710(arg7 ^ -13845, var21, var24, arg9.field10161, arg3 + -1, var22, 0, var23, var20);
                     return var46;
                  }

                  return var12;
               }

               if (arg7 <= -28923) {
                  var15[var16] = -1;
                  if (var11 != 0) {
                     var15[var16] = this.field88[var17];
                     ++var16;
                  } else {
                     ++var16;
                  }
               } else {
                  var15[var16] = this.field88[var17];
                  ++var16;
               }
            }
         } else {
            var16 = 0;
            var17 = 0;
            var18 = false;
            var19 = false;
            var20 = -1;
            if (var11 == 0) {
               if (arg7 != -28923) {
                  method45(19);
               }

               var21 = -1;
               var22 = 0;
               var23 = null;
               var24 = null;
               if (arg9 != null) {
                  var25 = arg9.field10165[arg4];
                  var13 = arg0 | 32;
                  var26 = var25 >>> 16;
                  var23 = class576.field8554.method3192(arg7 + 391, var26);
                  var20 = var25 & 65535;
                  if (var23 != null) {
                     var17 |= var23.method3338(116, var20);
                     var16 |= var23.method3339(arg7 ^ -28805, var20);
                     var19 |= var23.method3334(var20, 1359);
                     var18 |= arg9.field10161;
                  }

                  if ((arg9.field10149 || class631.field9178) && arg5 != -1 && ~arg9.field10165.length < ~arg5) {
                     var27 = arg9.field10165[arg5];
                     var22 = arg9.field10151[arg4];
                     var28 = var27 >>> 16;
                     var21 = var27 & 65535;
                     if (~var26 == ~var28) {
                        var24 = var23;
                     } else {
                        var24 = class576.field8554.method3192(-28532, var21 >>> 16);
                     }

                     if (var24 != null) {
                        var17 |= var24.method3338(arg7 + 29045, var21);
                        var16 |= var24.method3339(123, var21);
                        var19 |= var24.method3334(var21, arg7 + 30282);
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

               var29 = this.method46(0, var15, arg8, arg6, arg2 != null ? arg2.field1626 : null);
               if (class310.field4409 != null) {
                  var12 = (class497)class310.field4409.method5454(var29, 18261);
               }

               if (var12 == null || arg1.method632(var12.method326(), var13) != 0) {
                  if (var12 != null) {
                     var13 = arg1.method560(var13, var12.method326());
                  }

                  label497: {
                     var31 = var13;
                     var32 = 0;
                     var33 = 0;
                     if (var11 != 0) {
                        var10000 = ~var15[var33];
                     } else if (var15.length <= var33) {
                        var10000 = var32;
                        if (var11 == 0) {
                           break label497;
                        }
                     } else {
                        var10000 = ~var15[var33];
                     }

                     while(true) {
                        if (var10000 != 0 && !class54.field616.method1689(var15[var33], (byte)-58).method836(false, arg6, (class258)null)) {
                           var32 = 1;
                        }

                        ++var33;
                        if (var15.length <= var33) {
                           var10000 = var32;
                           if (var11 == 0) {
                              break;
                           }
                        } else {
                           var10000 = ~var15[var33];
                        }
                     }
                  }

                  if (var10000 != 0) {
                     return null;
                  }

                  var34 = new class134[var15.length];
                  var35 = 0;
                  if (var11 != 0) {
                     if (var15[var35] != -1) {
                        var34[var35] = class54.field616.method1689(var15[var35], (byte)-16).method827((byte)45, (class258)null, arg6);
                     }

                     ++var35;
                  }

                  while(true) {
                     while(~var35 > ~var15.length) {
                        if (var15[var35] != -1) {
                           var34[var35] = class54.field616.method1689(var15[var35], (byte)-16).method827((byte)45, (class258)null, arg6);
                        }

                        ++var35;
                     }

                     if (var11 == 0) {
                        if (var14 != null && var14.field3967 != null) {
                           var36 = 0;
                           if (var11 != 0 || var14.field3967.length > var36) {
                              do {
                                 if (var14.field3967[var36] != null) {
                                    if (var34[var36] == null && var11 == 0) {
                                       ++var36;
                                    } else {
                                       var37 = var14.field3967[var36][0];
                                       var38 = var14.field3967[var36][1];
                                       var39 = var14.field3967[var36][2];
                                       var40 = var14.field3967[var36][3];
                                       var41 = var14.field3967[var36][4];
                                       var42 = var14.field3967[var36][5];
                                       if (~var40 == -1) {
                                          if (~var41 == -1) {
                                             if (~var42 != -1) {
                                                var34[var36].method1146(806800366, var42, var40, var41);
                                             }
                                          } else {
                                             var34[var36].method1146(806800366, var42, var40, var41);
                                          }
                                       } else {
                                          var34[var36].method1146(806800366, var42, var40, var41);
                                       }

                                       if (~var37 == -1) {
                                          if (var38 == 0) {
                                             if (~var39 != -1) {
                                                var34[var36].method1145(var38, var39, var37, 0);
                                                ++var36;
                                             } else {
                                                ++var36;
                                             }
                                          } else {
                                             var34[var36].method1145(var38, var39, var37, 0);
                                             ++var36;
                                          }
                                       } else {
                                          var34[var36].method1145(var38, var39, var37, 0);
                                          ++var36;
                                       }
                                    }
                                 } else {
                                    ++var36;
                                 }
                              } while(var14.field3967.length > var36);
                           }
                        }

                        var43 = new class134(var34, var34.length);
                        if (arg2 != null) {
                           var31 = var13 | 16384;
                        }

                        var12 = arg1.method547(var43, var31, class91.field1167, 64, 850);
                        if (arg2 != null) {
                           var44 = 0;
                           if (var11 != 0 || ~var44 > -6) {
                              do {
                                 var45 = 0;
                                 if (var11 != 0) {
                                    if (~class314.field4496[var45][var44].length < ~arg2.field1626[var44]) {
                                       var12.method320(class680.field10218[var45][var44], class314.field4496[var45][var44][arg2.field1626[var44]]);
                                    }

                                    ++var45;
                                 }

                                 while(true) {
                                    while(~class314.field4496.length < ~var45) {
                                       if (~class314.field4496[var45][var44].length < ~arg2.field1626[var44]) {
                                          var12.method320(class680.field10218[var45][var44], class314.field4496[var45][var44][arg2.field1626[var44]]);
                                       }

                                       ++var45;
                                    }

                                    if (var11 == 0) {
                                       ++var44;
                                       break;
                                    }

                                    ++var45;
                                 }
                              } while(~var44 > -6);
                           }
                        }

                        if (class310.field4409 != null) {
                           var12.method333(var13);
                           class310.field4409.method5455(-2049, var12, var29);
                        }
                        break;
                     }

                     ++var35;
                  }
               }

               if (arg9 != null && var23 != null) {
                  var46 = var12.method343((byte)1, var13, true);
                  var46.method3710(arg7 ^ -13845, var21, var24, arg9.field10161, arg3 + -1, var22, 0, var23, var20);
                  return var46;
               }

               return var12;
            }

            if (arg7 <= -28923) {
               var15[var16] = -1;
               if (var11 != 0) {
                  var15[var16] = this.field88[var17];
                  ++var16;
               } else {
                  ++var16;
               }
            } else {
               var15[var16] = this.field88[var17];
               ++var16;
            }
         }

         while(true) {
            while(~var14.field3981.length < ~var16) {
               var17 = var14.field3981[var16];
               if (var17 >= 0) {
                  if (this.field88.length <= var17) {
                     var15[var16] = -1;
                     if (var11 != 0) {
                        var15[var16] = this.field88[var17];
                        ++var16;
                     } else {
                        ++var16;
                     }
                  } else {
                     var15[var16] = this.field88[var17];
                     ++var16;
                  }
               } else {
                  var15[var16] = -1;
                  if (var11 != 0) {
                     var15[var16] = this.field88[var17];
                     ++var16;
                  } else {
                     ++var16;
                  }
               }
            }

            var16 = 0;
            var17 = 0;
            var18 = false;
            var19 = false;
            var20 = -1;
            if (var11 == 0) {
               if (arg7 != -28923) {
                  method45(19);
               }

               var21 = -1;
               var22 = 0;
               var23 = null;
               var24 = null;
               if (arg9 != null) {
                  var25 = arg9.field10165[arg4];
                  var13 = arg0 | 32;
                  var26 = var25 >>> 16;
                  var23 = class576.field8554.method3192(arg7 + 391, var26);
                  var20 = var25 & 65535;
                  if (var23 != null) {
                     var17 |= var23.method3338(116, var20);
                     var16 |= var23.method3339(arg7 ^ -28805, var20);
                     var19 |= var23.method3334(var20, 1359);
                     var18 |= arg9.field10161;
                  }

                  if ((arg9.field10149 || class631.field9178) && arg5 != -1 && ~arg9.field10165.length < ~arg5) {
                     var27 = arg9.field10165[arg5];
                     var22 = arg9.field10151[arg4];
                     var28 = var27 >>> 16;
                     var21 = var27 & 65535;
                     if (~var26 == ~var28) {
                        var24 = var23;
                     } else {
                        var24 = class576.field8554.method3192(-28532, var21 >>> 16);
                     }

                     if (var24 != null) {
                        var17 |= var24.method3338(arg7 + 29045, var21);
                        var16 |= var24.method3339(123, var21);
                        var19 |= var24.method3334(var21, arg7 + 30282);
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

               var29 = this.method46(0, var15, arg8, arg6, arg2 != null ? arg2.field1626 : null);
               if (class310.field4409 != null) {
                  var12 = (class497)class310.field4409.method5454(var29, 18261);
               }

               if (var12 == null || arg1.method632(var12.method326(), var13) != 0) {
                  if (var12 != null) {
                     var13 = arg1.method560(var13, var12.method326());
                  }

                  label299: {
                     var31 = var13;
                     var32 = 0;
                     var33 = 0;
                     if (var11 != 0) {
                        var10000 = ~var15[var33];
                     } else if (var15.length <= var33) {
                        var10000 = var32;
                        if (var11 == 0) {
                           break label299;
                        }
                     } else {
                        var10000 = ~var15[var33];
                     }

                     while(true) {
                        if (var10000 != 0 && !class54.field616.method1689(var15[var33], (byte)-58).method836(false, arg6, (class258)null)) {
                           var32 = 1;
                        }

                        ++var33;
                        if (var15.length <= var33) {
                           var10000 = var32;
                           if (var11 == 0) {
                              break;
                           }
                        } else {
                           var10000 = ~var15[var33];
                        }
                     }
                  }

                  if (var10000 != 0) {
                     return null;
                  }

                  var34 = new class134[var15.length];
                  var35 = 0;
                  if (var11 != 0) {
                     if (var15[var35] != -1) {
                        var34[var35] = class54.field616.method1689(var15[var35], (byte)-16).method827((byte)45, (class258)null, arg6);
                     }

                     ++var35;
                  }

                  while(true) {
                     while(~var35 > ~var15.length) {
                        if (var15[var35] != -1) {
                           var34[var35] = class54.field616.method1689(var15[var35], (byte)-16).method827((byte)45, (class258)null, arg6);
                        }

                        ++var35;
                     }

                     if (var11 == 0) {
                        if (var14 != null && var14.field3967 != null) {
                           var36 = 0;
                           if (var11 != 0 || var14.field3967.length > var36) {
                              do {
                                 if (var14.field3967[var36] != null) {
                                    if (var34[var36] == null && var11 == 0) {
                                       ++var36;
                                    } else {
                                       var37 = var14.field3967[var36][0];
                                       var38 = var14.field3967[var36][1];
                                       var39 = var14.field3967[var36][2];
                                       var40 = var14.field3967[var36][3];
                                       var41 = var14.field3967[var36][4];
                                       var42 = var14.field3967[var36][5];
                                       if (~var40 == -1) {
                                          if (~var41 == -1) {
                                             if (~var42 != -1) {
                                                var34[var36].method1146(806800366, var42, var40, var41);
                                             }
                                          } else {
                                             var34[var36].method1146(806800366, var42, var40, var41);
                                          }
                                       } else {
                                          var34[var36].method1146(806800366, var42, var40, var41);
                                       }

                                       if (~var37 == -1) {
                                          if (var38 == 0) {
                                             if (~var39 != -1) {
                                                var34[var36].method1145(var38, var39, var37, 0);
                                                ++var36;
                                             } else {
                                                ++var36;
                                             }
                                          } else {
                                             var34[var36].method1145(var38, var39, var37, 0);
                                             ++var36;
                                          }
                                       } else {
                                          var34[var36].method1145(var38, var39, var37, 0);
                                          ++var36;
                                       }
                                    }
                                 } else {
                                    ++var36;
                                 }
                              } while(var14.field3967.length > var36);
                           }
                        }

                        var43 = new class134(var34, var34.length);
                        if (arg2 != null) {
                           var31 = var13 | 16384;
                        }

                        var12 = arg1.method547(var43, var31, class91.field1167, 64, 850);
                        if (arg2 != null) {
                           var44 = 0;
                           if (var11 != 0 || ~var44 > -6) {
                              do {
                                 var45 = 0;
                                 if (var11 != 0) {
                                    if (~class314.field4496[var45][var44].length < ~arg2.field1626[var44]) {
                                       var12.method320(class680.field10218[var45][var44], class314.field4496[var45][var44][arg2.field1626[var44]]);
                                    }

                                    ++var45;
                                 }

                                 while(true) {
                                    while(~class314.field4496.length < ~var45) {
                                       if (~class314.field4496[var45][var44].length < ~arg2.field1626[var44]) {
                                          var12.method320(class680.field10218[var45][var44], class314.field4496[var45][var44][arg2.field1626[var44]]);
                                       }

                                       ++var45;
                                    }

                                    if (var11 == 0) {
                                       ++var44;
                                       break;
                                    }

                                    ++var45;
                                 }
                              } while(~var44 > -6);
                           }
                        }

                        if (class310.field4409 != null) {
                           var12.method333(var13);
                           class310.field4409.method5455(-2049, var12, var29);
                        }
                        break;
                     }

                     ++var35;
                  }
               }

               if (arg9 != null && var23 != null) {
                  var46 = var12.method343((byte)1, var13, true);
                  var46.method3710(arg7 ^ -13845, var21, var24, arg9.field10161, arg3 + -1, var22, 0, var23, var20);
                  return var46;
               }

               return var12;
            }

            if (arg7 <= -28923) {
               var15[var16] = -1;
               if (var11 != 0) {
                  var15[var16] = this.field88[var17];
                  ++var16;
               } else {
                  ++var16;
               }
            } else {
               var15[var16] = this.field88[var17];
               ++var16;
            }
         }
      } catch (RuntimeException var48) {
         throw class670.method4877(var48, field99[3] + arg0 + ',' + (arg1 != null ? field99[4] : field99[2]) + ',' + (arg2 != null ? field99[4] : field99[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field99[4] : field99[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "b",
      descriptor = "(I)V",
      line = 327
   )
   public static void method45(int arg0) {
      try {
         field98 = null;
         field92 = null;
         if (arg0 != -21104) {
            field98 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field99[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(I[IIZ[I)J",
      line = 346
   )
   private final long method46(int arg0, int[] arg1, int arg2, boolean arg3, int[] arg4) {
      int var6 = client.field4530;

      try {
         ++field89;
         long[] var7 = class503.field7465;
         long var8 = -1L;
         long var10 = var7[(int)(255L & (var8 ^ (long)(arg2 >> 8)))] ^ var8 >>> 8;
         long var12 = var10 >>> 8 ^ var7[(int)(((long)arg2 ^ var10) & 255L)];
         int var14 = arg0;
         long var15;
         long var17;
         long var19;
         if (var6 != 0) {
            var15 = var7[(int)(255L & (var12 ^ (long)(arg1[arg0] >> 24)))] ^ var12 >>> 8;
            var17 = var7[(int)(((long)(arg1[arg0] >> 16) ^ var15) & 255L)] ^ var15 >>> 8;
            var19 = var7[(int)(((long)(arg1[arg0] >> 8) ^ var17) & 255L)] ^ var17 >>> 8;
            var12 = var7[(int)(255L & (var19 ^ (long)arg1[arg0]))] ^ var19 >>> 8;
            var14 = arg0 + 1;
         }

         while(true) {
            while(var14 < arg1.length) {
               var15 = var7[(int)(255L & (var12 ^ (long)(arg1[var14] >> 24)))] ^ var12 >>> 8;
               var17 = var7[(int)(((long)(arg1[var14] >> 16) ^ var15) & 255L)] ^ var15 >>> 8;
               var19 = var7[(int)(((long)(arg1[var14] >> 8) ^ var17) & 255L)] ^ var17 >>> 8;
               var12 = var7[(int)(255L & (var19 ^ (long)arg1[var14]))] ^ var19 >>> 8;
               ++var14;
            }

            if (var6 == 0) {
               if (arg4 != null) {
                  int var21 = 0;
                  if (var6 != 0 || ~var21 > -6) {
                     do {
                        var12 = var7[(int)(((long)arg4[var21] ^ var12) & 255L)] ^ var12 >>> 8;
                        ++var21;
                     } while(~var21 > -6);
                  }
               }

               return var12 >>> 8 ^ var7[(int)(255L & ((long)(arg3 ? 1 : 0) ^ var12))];
            }

            ++var14;
         }
      } catch (RuntimeException var25) {
         throw class670.method4877(var25, field99[5] + arg0 + ',' + (arg1 != null ? field99[4] : field99[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field99[4] : field99[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "b",
      descriptor = "(III)Z",
      line = 387
   )
   public static final boolean method47(int arg0, int arg1, int arg2) {
      try {
         ++field96;
         boolean var3 = ~(arg1 & arg0) != -1 ? class506.method3753(13596, arg1, arg2) : class672.method4895(-18045, arg1, arg2);
         return var3 | (arg2 & 65536) != 0 | class3.method32(arg1, (byte)82, arg2);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field99[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(ZF)F",
      line = 404
   )
   public static final float method48(boolean arg0, float arg1) {
      try {
         if (!arg0) {
            method41((byte)69);
         }

         ++field95;
         return arg1 * arg1 * arg1 * ((arg1 * 6.0F + -15.0F) * arg1 + 10.0F);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field99[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method49(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method50(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
