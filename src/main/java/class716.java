import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class716 extends class96 {
   @OriginalMember(
      owner = "client!ih",
      name = "B",
      descriptor = "[I"
   )
   private int[] field10262;
   @OriginalMember(
      owner = "client!ih",
      name = "y",
      descriptor = "[I"
   )
   private int[] field10266;
   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "Lhi;"
   )
   private class606 field10267;
   @OriginalMember(
      owner = "client!ih",
      name = "q",
      descriptor = "Lhi;"
   )
   private class606 field10259;
   @OriginalMember(
      owner = "client!ih",
      name = "s",
      descriptor = "Lhi;"
   )
   private class606 field10269;
   @OriginalMember(
      owner = "client!ih",
      name = "C",
      descriptor = "[Lhi;"
   )
   private class606[] field10265;
   @OriginalMember(
      owner = "client!ih",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10273 = new String[]{method5194(method5193("\u0007CS\u001cd")), method5194(method5193("\u0000^\u00115")), method5194(method5193("\u0007CS\u001bd")), method5194(method5193("\u0015\u0005Sw1")), method5194(method5193("\u0007CS\u001ad")), method5194(method5193("\u0007CS\u001fd")), method5194(method5193("\u0007CS\u0018d")), method5194(method5193("\u0007CS\u001dd")), method5194(method5193("\u0007CSe%\u0000B\tgd")), method5194(method5193("\u0007CS\u001ed"))};
   @OriginalMember(
      owner = "client!ih",
      name = "r",
      descriptor = "Lfm;"
   )
   public static class164 field10270 = new class164(39, 7);
   @OriginalMember(
      owner = "client!ih",
      name = "u",
      descriptor = "I"
   )
   public static int field10260;
   @OriginalMember(
      owner = "client!ih",
      name = "w",
      descriptor = "I"
   )
   public static int field10261;
   @OriginalMember(
      owner = "client!ih",
      name = "D",
      descriptor = "I"
   )
   public static int field10263;
   @OriginalMember(
      owner = "client!ih",
      name = "v",
      descriptor = "I"
   )
   public static int field10264;
   @OriginalMember(
      owner = "client!ih",
      name = "x",
      descriptor = "I"
   )
   public static int field10268;
   @OriginalMember(
      owner = "client!ih",
      name = "A",
      descriptor = "I"
   )
   public static int field10271;
   @OriginalMember(
      owner = "client!ih",
      name = "t",
      descriptor = "[J"
   )
   public static long[] field10272;

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(ZBLd;DLsa;II)[I"
   )
   public final int[] method5186(boolean arg0, byte arg1, class672 arg2, double arg3, class39 arg4, int arg5, int arg6) {
      boolean var9 = client.field10022;

      try {
         ++field10271;
         class759.field10844 = arg2;
         class30.field436 = arg4;
         int var10 = 0;
         if (var9) {
            this.field10265[var10].method4464(arg6, arg5, (byte)93);
            ++var10;
         }

         while(true) {
            while(~this.field10265.length < ~var10) {
               this.field10265[var10].method4464(arg6, arg5, (byte)93);
               ++var10;
            }

            class739.method5341(arg3, 200);
            class261.method2250(arg6, arg5, 32);
            int[] var11 = new int[arg5 * arg6];
            int var12 = 0;
            if (!var9) {
               if (arg1 < 101) {
                  return null;
               }

               int var28;
               label533: {
                  int var13 = 0;
                  int[] var14;
                  int[] var15;
                  int[] var16;
                  int[] var17;
                  int[][] var18;
                  int[] var19;
                  if (var9) {
                     if (this.field10259.field8641) {
                        var14 = this.field10259.method9(0, var13);
                        var15 = var14;
                        var16 = var14;
                        var17 = var14;
                        if (var9) {
                           var18 = this.field10259.method5(373, var13);
                           var15 = var18[1];
                           var17 = var18[2];
                           var16 = var18[0];
                           if (arg0) {
                              var12 = var13;
                           }

                           if (!this.field10269.field8641) {
                              var19 = this.field10269.method5(373, var13)[0];
                              if (var9) {
                                 var19 = this.field10269.method9(0, var13);
                              }
                           } else {
                              var19 = this.field10269.method9(0, var13);
                           }
                        } else {
                           if (arg0) {
                              var12 = var13;
                           }

                           if (!this.field10269.field8641) {
                              var19 = this.field10269.method5(373, var13)[0];
                              if (var9) {
                                 var19 = this.field10269.method9(0, var13);
                              }
                           } else {
                              var19 = this.field10269.method9(0, var13);
                           }
                        }
                     } else {
                        var18 = this.field10259.method5(373, var13);
                        var15 = var18[1];
                        var17 = var18[2];
                        var16 = var18[0];
                        if (arg0) {
                           var12 = var13;
                        }

                        if (!this.field10269.field8641) {
                           var19 = this.field10269.method5(373, var13)[0];
                           if (var9) {
                              var19 = this.field10269.method9(0, var13);
                           }
                        } else {
                           var19 = this.field10269.method9(0, var13);
                        }
                     }
                  } else if (arg5 <= var13) {
                     var28 = 0;
                     if (!var9) {
                        break label533;
                     }

                     var18 = this.field10259.method5(373, var13);
                     var15 = var18[1];
                     var17 = var18[2];
                     var16 = var18[0];
                     if (arg0) {
                        var12 = var13;
                     }

                     if (!this.field10269.field8641) {
                        var19 = this.field10269.method5(373, var13)[0];
                        if (var9) {
                           var19 = this.field10269.method9(0, var13);
                        }
                     } else {
                        var19 = this.field10269.method9(0, var13);
                     }
                  } else if (this.field10259.field8641) {
                     var14 = this.field10259.method9(0, var13);
                     var15 = var14;
                     var16 = var14;
                     var17 = var14;
                     if (var9) {
                        var18 = this.field10259.method5(373, var13);
                        var15 = var18[1];
                        var17 = var18[2];
                        var16 = var18[0];
                        if (arg0) {
                           var12 = var13;
                        }

                        if (!this.field10269.field8641) {
                           var19 = this.field10269.method5(373, var13)[0];
                           if (var9) {
                              var19 = this.field10269.method9(0, var13);
                           }
                        } else {
                           var19 = this.field10269.method9(0, var13);
                        }
                     } else {
                        if (arg0) {
                           var12 = var13;
                        }

                        if (!this.field10269.field8641) {
                           var19 = this.field10269.method5(373, var13)[0];
                           if (var9) {
                              var19 = this.field10269.method9(0, var13);
                           }
                        } else {
                           var19 = this.field10269.method9(0, var13);
                        }
                     }
                  } else {
                     var18 = this.field10259.method5(373, var13);
                     var15 = var18[1];
                     var17 = var18[2];
                     var16 = var18[0];
                     if (arg0) {
                        var12 = var13;
                     }

                     if (!this.field10269.field8641) {
                        var19 = this.field10269.method5(373, var13)[0];
                        if (var9) {
                           var19 = this.field10269.method9(0, var13);
                        }
                     } else {
                        var19 = this.field10269.method9(0, var13);
                     }
                  }

                  while(true) {
                     int var20 = arg6 + -1;
                     int var21;
                     int var22;
                     int var23;
                     int var24;
                     int var25;
                     int var26;
                     int var27;
                     byte var31;
                     if (var9) {
                        var21 = var16[var20] >> 4;
                        if (var21 > 255) {
                           var21 = 255;
                           if (var21 < 0) {
                              var21 = 0;
                           }
                        } else if (var21 < 0) {
                           var21 = 0;
                        }

                        var22 = var15[var20] >> 4;
                        if (var22 > 255) {
                           var22 = 255;
                           if (~var22 > -1) {
                              var22 = 0;
                           }
                        } else if (~var22 > -1) {
                           var22 = 0;
                        }

                        var23 = var17[var20] >> 4;
                        if (~var23 < -256) {
                           var23 = 255;
                           var24 = class57.field814[var21];
                           if (var23 < 0) {
                              var23 = 0;
                           }
                        } else {
                           var24 = class57.field814[var21];
                           if (var23 < 0) {
                              var23 = 0;
                           }
                        }

                        var25 = class57.field814[var22];
                        var26 = class57.field814[var23];
                        if (~var24 == -1) {
                           if (var25 == 0) {
                              if (var26 != 0) {
                                 var27 = var19[var20] >> 4;
                                 if (var27 > 255) {
                                    var27 = 255;
                                 }

                                 if (var27 < 0) {
                                    var27 = 0;
                                    if (var9) {
                                       var27 = 0;
                                    }
                                 }

                                 var11[var12++] = (var27 << 24) - (-(var24 << 16) - ((var25 << 8) + var26));
                                 if (arg0) {
                                    var12 += arg6 + -1;
                                 }

                                 --var20;
                              } else {
                                 var31 = 0;
                                 var11[var12++] = (var31 << 24) - (-(var24 << 16) - ((var25 << 8) + var26));
                                 if (arg0) {
                                    var12 += arg6 + -1;
                                 }

                                 --var20;
                              }
                           } else {
                              var27 = var19[var20] >> 4;
                              if (var27 > 255) {
                                 var27 = 255;
                              }

                              if (var27 < 0) {
                                 var27 = 0;
                                 if (var9) {
                                    var27 = 0;
                                 }
                              }

                              var11[var12++] = (var27 << 24) - (-(var24 << 16) - ((var25 << 8) + var26));
                              if (arg0) {
                                 var12 += arg6 + -1;
                              }

                              --var20;
                           }
                        } else {
                           var27 = var19[var20] >> 4;
                           if (var27 > 255) {
                              var27 = 255;
                           }

                           if (var27 < 0) {
                              var27 = 0;
                              if (var9) {
                                 var27 = 0;
                              }
                           }

                           var11[var12++] = (var27 << 24) - (-(var24 << 16) - ((var25 << 8) + var26));
                           if (arg0) {
                              var12 += arg6 + -1;
                           }

                           --var20;
                        }
                     }

                     while(var20 >= 0) {
                        var21 = var16[var20] >> 4;
                        if (var21 > 255) {
                           var21 = 255;
                           if (var21 < 0) {
                              var21 = 0;
                           }
                        } else if (var21 < 0) {
                           var21 = 0;
                        }

                        var22 = var15[var20] >> 4;
                        if (var22 > 255) {
                           var22 = 255;
                           if (~var22 > -1) {
                              var22 = 0;
                           }
                        } else if (~var22 > -1) {
                           var22 = 0;
                        }

                        var23 = var17[var20] >> 4;
                        if (~var23 < -256) {
                           var23 = 255;
                           var24 = class57.field814[var21];
                           if (var23 < 0) {
                              var23 = 0;
                           }
                        } else {
                           var24 = class57.field814[var21];
                           if (var23 < 0) {
                              var23 = 0;
                           }
                        }

                        var25 = class57.field814[var22];
                        var26 = class57.field814[var23];
                        if (~var24 == -1) {
                           if (var25 == 0) {
                              if (var26 != 0) {
                                 var27 = var19[var20] >> 4;
                                 if (var27 > 255) {
                                    var27 = 255;
                                 }

                                 if (var27 < 0) {
                                    var27 = 0;
                                    if (var9) {
                                       var27 = 0;
                                    }
                                 }

                                 var11[var12++] = (var27 << 24) - (-(var24 << 16) - ((var25 << 8) + var26));
                                 if (arg0) {
                                    var12 += arg6 + -1;
                                 }

                                 --var20;
                              } else {
                                 var31 = 0;
                                 var11[var12++] = (var31 << 24) - (-(var24 << 16) - ((var25 << 8) + var26));
                                 if (arg0) {
                                    var12 += arg6 + -1;
                                 }

                                 --var20;
                              }
                           } else {
                              var27 = var19[var20] >> 4;
                              if (var27 > 255) {
                                 var27 = 255;
                              }

                              if (var27 < 0) {
                                 var27 = 0;
                                 if (var9) {
                                    var27 = 0;
                                 }
                              }

                              var11[var12++] = (var27 << 24) - (-(var24 << 16) - ((var25 << 8) + var26));
                              if (arg0) {
                                 var12 += arg6 + -1;
                              }

                              --var20;
                           }
                        } else {
                           var27 = var19[var20] >> 4;
                           if (var27 > 255) {
                              var27 = 255;
                           }

                           if (var27 < 0) {
                              var27 = 0;
                              if (var9) {
                                 var27 = 0;
                              }
                           }

                           var11[var12++] = (var27 << 24) - (-(var24 << 16) - ((var25 << 8) + var26));
                           if (arg0) {
                              var12 += arg6 + -1;
                           }

                           --var20;
                        }
                     }

                     ++var13;
                     if (arg5 <= var13) {
                        var28 = 0;
                        if (!var9) {
                           break;
                        }

                        var18 = this.field10259.method5(373, var13);
                        var15 = var18[1];
                        var17 = var18[2];
                        var16 = var18[0];
                        if (arg0) {
                           var12 = var13;
                        }

                        if (!this.field10269.field8641) {
                           var19 = this.field10269.method5(373, var13)[0];
                           if (var9) {
                              var19 = this.field10269.method9(0, var13);
                           }
                        } else {
                           var19 = this.field10269.method9(0, var13);
                        }
                     } else if (this.field10259.field8641) {
                        var14 = this.field10259.method9(0, var13);
                        var15 = var14;
                        var16 = var14;
                        var17 = var14;
                        if (var9) {
                           var18 = this.field10259.method5(373, var13);
                           var15 = var18[1];
                           var17 = var18[2];
                           var16 = var18[0];
                           if (arg0) {
                              var12 = var13;
                           }

                           if (!this.field10269.field8641) {
                              var19 = this.field10269.method5(373, var13)[0];
                              if (var9) {
                                 var19 = this.field10269.method9(0, var13);
                              }
                           } else {
                              var19 = this.field10269.method9(0, var13);
                           }
                        } else {
                           if (arg0) {
                              var12 = var13;
                           }

                           if (!this.field10269.field8641) {
                              var19 = this.field10269.method5(373, var13)[0];
                              if (var9) {
                                 var19 = this.field10269.method9(0, var13);
                              }
                           } else {
                              var19 = this.field10269.method9(0, var13);
                           }
                        }
                     } else {
                        var18 = this.field10259.method5(373, var13);
                        var15 = var18[1];
                        var17 = var18[2];
                        var16 = var18[0];
                        if (arg0) {
                           var12 = var13;
                        }

                        if (!this.field10269.field8641) {
                           var19 = this.field10269.method5(373, var13)[0];
                           if (var9) {
                              var19 = this.field10269.method9(0, var13);
                           }
                        } else {
                           var19 = this.field10269.method9(0, var13);
                        }
                     }
                  }
               }

               if (var9) {
                  this.field10265[var28].method4470(1);
                  ++var28;
               }

               while(true) {
                  while(this.field10265.length > var28) {
                     this.field10265[var28].method4470(1);
                     ++var28;
                  }

                  if (!var9) {
                     return var11;
                  }

                  ++var28;
               }
            }

            ++var10;
         }
      } catch (RuntimeException var30) {
         throw class612.method4503(var30, field10273[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10273[3] : field10273[1]) + ',' + arg3 + ',' + (arg4 != null ? field10273[3] : field10273[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(Lsa;IIIZZLd;D)[I"
   )
   public final int[] method5187(class39 arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, class672 arg6, double arg7) {
      boolean var10 = client.field10022;

      try {
         class759.field10844 = arg6;
         ++field10261;
         class30.field436 = arg0;
         int var11 = 0;
         if (arg2 != 255) {
            this.method5188(-21, (class39)null, (class672)null);
            if (var10) {
               this.field10265[var11].method4464(arg1, arg3, (byte)93);
               ++var11;
            }
         }

         while(true) {
            while(~var11 > ~this.field10265.length) {
               this.field10265[var11].method4464(arg1, arg3, (byte)93);
               ++var11;
            }

            class739.method5341(arg7, arg2 + -55);
            class261.method2250(arg1, arg3, arg2 ^ 223);
            int[] var12 = new int[arg1 * arg3];
            if (!var10) {
               byte var13;
               int var14;
               int var15;
               label218: {
                  if (arg5) {
                     var13 = -1;
                     var14 = arg1 - 1;
                     var15 = -1;
                     if (!var10) {
                        break label218;
                     }
                  }

                  var14 = 0;
                  var13 = 1;
                  var15 = arg1;
               }

               int var31;
               label194: {
                  int var16 = 0;
                  int var17 = 0;
                  int[][] var18;
                  int[] var19;
                  int[] var20;
                  int[] var21;
                  int[] var22;
                  if (var10) {
                     if (!this.field10259.field8641) {
                        var18 = this.field10259.method5(373, var17);
                        var19 = var18[1];
                        var20 = var18[2];
                        var21 = var18[0];
                        if (var10) {
                           var22 = this.field10259.method9(0, var17);
                           var19 = var22;
                           var21 = var22;
                           var20 = var22;
                           if (arg4) {
                              var16 = var17;
                           }
                        } else if (arg4) {
                           var16 = var17;
                        }
                     } else {
                        var22 = this.field10259.method9(0, var17);
                        var19 = var22;
                        var21 = var22;
                        var20 = var22;
                        if (arg4) {
                           var16 = var17;
                        }
                     }
                  } else if (~var17 <= ~arg3) {
                     var31 = 0;
                     if (!var10) {
                        break label194;
                     }

                     var22 = this.field10259.method9(0, var17);
                     var19 = var22;
                     var21 = var22;
                     var20 = var22;
                     if (arg4) {
                        var16 = var17;
                     }
                  } else if (!this.field10259.field8641) {
                     var18 = this.field10259.method5(373, var17);
                     var19 = var18[1];
                     var20 = var18[2];
                     var21 = var18[0];
                     if (var10) {
                        var22 = this.field10259.method9(0, var17);
                        var19 = var22;
                        var21 = var22;
                        var20 = var22;
                        if (arg4) {
                           var16 = var17;
                        }
                     } else if (arg4) {
                        var16 = var17;
                     }
                  } else {
                     var22 = this.field10259.method9(0, var17);
                     var19 = var22;
                     var21 = var22;
                     var20 = var22;
                     if (arg4) {
                        var16 = var17;
                     }
                  }

                  while(true) {
                     int var23 = var14;
                     if (var10 || ~var15 != ~var14) {
                        do {
                           int var24 = var21[var23] >> 4;
                           if (var24 > 255) {
                              var24 = 255;
                           }

                           if (~var24 > -1) {
                              var24 = 0;
                           }

                           int var25 = var19[var23] >> 4;
                           if (~var25 < -256) {
                              var25 = 255;
                           }

                           if (~var25 > -1) {
                              var25 = 0;
                           }

                           int var26 = var20[var23] >> 4;
                           if (var26 > 255) {
                              var26 = 255;
                           }

                           if (var26 < 0) {
                              var26 = 0;
                           }

                           int var27 = class57.field814[var25];
                           int var28 = class57.field814[var24];
                           int var29 = class57.field814[var26];
                           int var30 = (var28 << 16) + (var27 << 8) + var29;
                           if (~var30 != -1) {
                              var30 |= -16777216;
                           }

                           var12[var16++] = var30;
                           if (arg4) {
                              var16 += arg1 + -1;
                           }

                           var23 += var13;
                        } while(~var15 != ~var23);
                     }

                     ++var17;
                     if (~var17 <= ~arg3) {
                        var31 = 0;
                        if (!var10) {
                           break;
                        }

                        var22 = this.field10259.method9(0, var17);
                        var19 = var22;
                        var21 = var22;
                        var20 = var22;
                        if (arg4) {
                           var16 = var17;
                        }
                     } else if (!this.field10259.field8641) {
                        var18 = this.field10259.method5(373, var17);
                        var19 = var18[1];
                        var20 = var18[2];
                        var21 = var18[0];
                        if (var10) {
                           var22 = this.field10259.method9(0, var17);
                           var19 = var22;
                           var21 = var22;
                           var20 = var22;
                           if (arg4) {
                              var16 = var17;
                           }
                        } else if (arg4) {
                           var16 = var17;
                        }
                     } else {
                        var22 = this.field10259.method9(0, var17);
                        var19 = var22;
                        var21 = var22;
                        var20 = var22;
                        if (arg4) {
                           var16 = var17;
                        }
                     }
                  }
               }

               if (var10) {
                  this.field10265[var31].method4470(1);
                  ++var31;
               }

               while(true) {
                  while(this.field10265.length > var31) {
                     this.field10265[var31].method4470(1);
                     ++var31;
                  }

                  if (!var10) {
                     return var12;
                  }

                  ++var31;
               }
            }

            ++var11;
         }
      } catch (RuntimeException var33) {
         throw class612.method4503(var33, field10273[4] + (arg0 != null ? field10273[3] : field10273[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field10273[3] : field10273[1]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(ILsa;Ld;)Z"
   )
   public final boolean method5188(int arg0, class39 arg1, class672 arg2) {
      boolean var4 = client.field10022;

      try {
         int var7;
         label105: {
            int var6;
            label104: {
               ++field10268;
               if (class409.field6007 < 0) {
                  int var5 = 0;
                  if (var4) {
                     if (!arg1.method450(0, this.field10266[var5])) {
                        return false;
                     }

                     ++var5;
                  }

                  while(true) {
                     while(~this.field10266.length < ~var5) {
                        if (!arg1.method450(0, this.field10266[var5])) {
                           return false;
                        }

                        ++var5;
                     }

                     if (!var4) {
                        if (!var4) {
                           var6 = -4 / ((arg0 - -12) / 33);
                           var7 = 0;
                           if (!var4) {
                              break label105;
                           }

                           ++var6;
                           break label104;
                        }
                        break;
                     }

                     ++var5;
                  }
               }

               var6 = 0;
               if (var4) {
                  if (!arg1.method442(true, this.field10266[var6], class409.field6007)) {
                     return false;
                  }

                  ++var6;
               }
            }

            while(true) {
               while(this.field10266.length > var6) {
                  if (!arg1.method442(true, this.field10266[var6], class409.field6007)) {
                     return false;
                  }

                  ++var6;
               }

               var6 = -4 / ((arg0 - -12) / 33);
               var7 = 0;
               if (!var4) {
                  break;
               }

               ++var6;
            }
         }

         if (var4) {
            if (!arg2.method2036(this.field10262[var7], (byte)-107)) {
               return false;
            }

            ++var7;
         }

         while(true) {
            while(~this.field10262.length < ~var7) {
               if (!arg2.method2036(this.field10262[var7], (byte)-107)) {
                  return false;
               }

               ++var7;
            }

            if (!var4) {
               return true;
            }

            if (false) {
               return false;
            }

            ++var7;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field10273[5] + arg0 + ',' + (arg1 != null ? field10273[3] : field10273[1]) + ',' + (arg2 != null ? field10273[3] : field10273[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5189(int arg0) {
      try {
         field10272 = null;
         field10270 = null;
         if (arg0 != 0) {
            method5189(-81);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10273[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(ILd;IBLsa;Z)[F"
   )
   public final float[] method5190(int arg0, class672 arg1, int arg2, byte arg3, class39 arg4, boolean arg5) {
      boolean var7 = client.field10022;

      try {
         class30.field436 = arg4;
         class759.field10844 = arg1;
         ++field10264;
         int var8 = 0;
         if (var7) {
            this.field10265[var8].method4464(arg0, arg2, (byte)93);
            ++var8;
         }

         while(true) {
            while(this.field10265.length > var8) {
               this.field10265[var8].method4464(arg0, arg2, (byte)93);
               ++var8;
            }

            if (!var7) {
               if (arg3 != -70) {
                  this.method5187((class39)null, 11, 114, 99, false, true, (class672)null, -0.7677257095053813D);
               }

               float[] var9;
               int var22;
               label147: {
                  class261.method2250(arg0, arg2, 32);
                  var9 = new float[arg0 * arg2 * 4];
                  int var10 = 0;
                  int var11 = 0;
                  int[][] var12;
                  int[] var13;
                  int[] var14;
                  int[] var15;
                  int[] var16;
                  if (var7) {
                     if (!this.field10259.field8641) {
                        var12 = this.field10259.method5(373, var11);
                        var13 = var12[2];
                        var14 = var12[0];
                        var15 = var12[1];
                        if (var7) {
                           var16 = this.field10259.method9(0, var11);
                           var13 = var16;
                           var15 = var16;
                           var14 = var16;
                        }
                     } else {
                        var16 = this.field10259.method9(0, var11);
                        var13 = var16;
                        var15 = var16;
                        var14 = var16;
                     }
                  } else if (var11 >= arg2) {
                     var22 = 0;
                     if (!var7) {
                        break label147;
                     }

                     var16 = this.field10259.method9(0, var11);
                     var13 = var16;
                     var15 = var16;
                     var14 = var16;
                  } else if (!this.field10259.field8641) {
                     var12 = this.field10259.method5(373, var11);
                     var13 = var12[2];
                     var14 = var12[0];
                     var15 = var12[1];
                     if (var7) {
                        var16 = this.field10259.method9(0, var11);
                        var13 = var16;
                        var15 = var16;
                        var14 = var16;
                     }
                  } else {
                     var16 = this.field10259.method9(0, var11);
                     var13 = var16;
                     var15 = var16;
                     var14 = var16;
                  }

                  while(true) {
                     int[] var17;
                     if (!this.field10269.field8641) {
                        var17 = this.field10269.method5(373, var11)[0];
                        if (var7) {
                           var17 = this.field10269.method9(0, var11);
                        }
                     } else {
                        var17 = this.field10269.method9(0, var11);
                     }

                     int[] var18;
                     if (this.field10267.field8641) {
                        var18 = this.field10267.method9(0, var11);
                        if (var7) {
                           var18 = this.field10267.method5(373, var11)[0];
                           if (arg5) {
                              var10 = var11 << 2;
                           }
                        } else if (arg5) {
                           var10 = var11 << 2;
                        }
                     } else {
                        var18 = this.field10267.method5(373, var11)[0];
                        if (arg5) {
                           var10 = var11 << 2;
                        }
                     }

                     int var19 = arg0 + -1;
                     if (var7 || ~var19 <= -1) {
                        do {
                           float var20 = (float)var17[var19] / 4096.0F;
                           if (!(var20 < 0.0F)) {
                              if (var20 > 1.0F) {
                                 var20 = 1.0F;
                                 if (var7) {
                                    var20 = 0.0F;
                                 }
                              }
                           } else {
                              var20 = 0.0F;
                           }

                           float var21 = ((float)var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                           var9[var10++] = (float)var14[var19] * var21;
                           var9[var10++] = (float)var15[var19] * var21;
                           var9[var10++] = (float)var13[var19] * var21;
                           var9[var10++] = var20;
                           if (arg5) {
                              var10 += (arg0 << 2) + -4;
                           }

                           --var19;
                        } while(~var19 <= -1);
                     }

                     ++var11;
                     if (var11 >= arg2) {
                        var22 = 0;
                        if (!var7) {
                           break;
                        }

                        var16 = this.field10259.method9(0, var11);
                        var13 = var16;
                        var15 = var16;
                        var14 = var16;
                     } else if (!this.field10259.field8641) {
                        var12 = this.field10259.method5(373, var11);
                        var13 = var12[2];
                        var14 = var12[0];
                        var15 = var12[1];
                        if (var7) {
                           var16 = this.field10259.method9(0, var11);
                           var13 = var16;
                           var15 = var16;
                           var14 = var16;
                        }
                     } else {
                        var16 = this.field10259.method9(0, var11);
                        var13 = var16;
                        var15 = var16;
                        var14 = var16;
                     }
                  }
               }

               if (var7) {
                  this.field10265[var22].method4470(arg3 + 71);
                  ++var22;
               }

               while(true) {
                  while(var22 < this.field10265.length) {
                     this.field10265[var22].method4470(arg3 + 71);
                     ++var22;
                  }

                  if (!var7) {
                     return var9;
                  }

                  ++var22;
               }
            }

            ++var8;
         }
      } catch (RuntimeException var24) {
         throw class612.method4503(var24, field10273[2] + arg0 + ',' + (arg1 != null ? field10273[3] : field10273[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10273[3] : field10273[1]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method5191(int arg0, boolean arg1) {
      try {
         if (class752.field10681 == null) {
            class268.method2290(0);
         }

         ++field10260;
         int var2 = -14 % ((-4 - arg0) / 57);
         if (arg1) {
            class752.field10681.method1832(false);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10273[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(IIIBI)V"
   )
   public static final void method5192(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         ++field10263;
         class111 var5 = class796.method5734(4, (long)arg0, (byte)-110);
         var5.method1087(0);
         var5.field1732 = arg1;
         var5.field1739 = arg2;
         var5.field1740 = arg4;
         if (arg3 != 62) {
            method5192(40, 119, 18, (byte)-70, 6);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field10273[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "<init>",
      descriptor = "()V"
   )
   public class716() {
      try {
         this.field10262 = new int[0];
         this.field10266 = new int[0];
         this.field10267 = new class72(0);
         this.field10267.field8637 = 1;
         this.field10259 = new class72();
         this.field10259.field8637 = 1;
         this.field10269 = new class72();
         this.field10269.field8637 = 1;
         this.field10265 = new class606[]{this.field10259, this.field10269, this.field10267};
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10273[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "<init>",
      descriptor = "(Lcu;)V"
   )
   public class716(class65 arg0) {
      boolean var2 = client.field10022;
      super();

      try {
         int var3 = arg0.method665(false);
         int var4 = 0;
         int var5 = 0;
         int[][] var6 = new int[var3][];
         this.field10265 = new class606[var3];
         int var7 = 0;
         if (var2 || ~var3 < ~var7) {
            do {
               class606 var8 = class685.method4986(arg0, (byte)-125);
               if (~var8.method4469(-1) <= -1) {
                  ++var4;
               }

               if (~var8.method4468((byte)121) <= -1) {
                  ++var5;
               }

               int var9 = var8.field8651.length;
               var6[var7] = new int[var9];
               int var10 = 0;
               if (var2) {
                  var6[var7][var10] = arg0.method665(false);
                  ++var10;
               }

               while(true) {
                  while(var10 < var9) {
                     var6[var7][var10] = arg0.method665(false);
                     ++var10;
                  }

                  this.field10265[var7] = var8;
                  if (!var2) {
                     ++var7;
                     break;
                  }

                  ++var10;
               }
            } while(~var3 < ~var7);
         }

         this.field10266 = new int[var4];
         this.field10262 = new int[var5];
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         class606 var14;
         int var15;
         int var16;
         class716 var10000;
         Object var19;
         if (var2) {
            var14 = this.field10265[var13];
            var15 = var14.field8651.length;
            var16 = 0;
            if (var2) {
               var14.field8651[var16] = this.field10265[var6[var13][var16]];
               ++var16;
            }
         } else {
            if (~var13 <= ~var3) {
               this.field10259 = this.field10265[arg0.method665(false)];
               var10000 = this;
               if (!var2) {
                  this.field10269 = this.field10265[arg0.method665(false)];
                  var19 = null;
                  this.field10267 = this.field10265[arg0.method665(false)];
                  return;
               }
            } else {
               var10000 = this;
            }

            var14 = var10000.field10265[var13];
            var15 = var14.field8651.length;
            var16 = 0;
            if (var2) {
               var14.field8651[var16] = this.field10265[var6[var13][var16]];
               ++var16;
            }
         }

         while(true) {
            while(var16 < var15) {
               var14.field8651[var16] = this.field10265[var6[var13][var16]];
               ++var16;
            }

            int var17 = var14.method4469(-1);
            int var18 = var14.method4468((byte)121);
            if (!var2) {
               if (var17 > 0) {
                  this.field10266[var11++] = var17;
               }

               if (~var18 < -1) {
                  this.field10262[var12++] = var18;
               }

               var6[var13] = null;
               ++var13;
               if (~var13 <= ~var3) {
                  this.field10259 = this.field10265[arg0.method665(false)];
                  var10000 = this;
                  if (!var2) {
                     this.field10269 = this.field10265[arg0.method665(false)];
                     var19 = null;
                     this.field10267 = this.field10265[arg0.method665(false)];
                     return;
                  }
               } else {
                  var10000 = this;
               }

               var14 = var10000.field10265[var13];
               var15 = var14.field8651.length;
               var16 = 0;
               if (var2) {
                  var14.field8651[var16] = this.field10265[var6[var13][var16]];
                  ++var16;
               }
            } else {
               ++var16;
            }
         }
      } catch (RuntimeException var21) {
         throw class612.method4503(var21, field10273[8] + (arg0 != null ? field10273[3] : field10273[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5193(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5194(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
