import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class115 {
   @OriginalMember(
      owner = "client!pfa",
      name = "u",
      descriptor = "[I"
   )
   private int[] field1807 = new int[]{0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256};
   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "[I"
   )
   private int[] field1815 = new int[]{0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256};
   @OriginalMember(
      owner = "client!pfa",
      name = "l",
      descriptor = "I"
   )
   public int field1833;
   @OriginalMember(
      owner = "client!pfa",
      name = "q",
      descriptor = "Lro;"
   )
   private class759 field1808;
   @OriginalMember(
      owner = "client!pfa",
      name = "g",
      descriptor = "I"
   )
   public int field1814;
   @OriginalMember(
      owner = "client!pfa",
      name = "t",
      descriptor = "Lvl;"
   )
   private class340 field1825;
   @OriginalMember(
      owner = "client!pfa",
      name = "n",
      descriptor = "I"
   )
   public int field1823;
   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "Z"
   )
   public boolean field1832;
   @OriginalMember(
      owner = "client!pfa",
      name = "r",
      descriptor = "[[[B"
   )
   private byte[][][] field1810;
   @OriginalMember(
      owner = "client!pfa",
      name = "c",
      descriptor = "[[[B"
   )
   private byte[][][] field1829;
   @OriginalMember(
      owner = "client!pfa",
      name = "w",
      descriptor = "[[[B"
   )
   private byte[][][] field1830;
   @OriginalMember(
      owner = "client!pfa",
      name = "f",
      descriptor = "[[[I"
   )
   public int[][][] field1822;
   @OriginalMember(
      owner = "client!pfa",
      name = "h",
      descriptor = "[[[B"
   )
   private byte[][][] field1819;
   @OriginalMember(
      owner = "client!pfa",
      name = "v",
      descriptor = "[[[B"
   )
   public byte[][][] field1820;
   @OriginalMember(
      owner = "client!pfa",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1835 = new String[]{method1132(method1131("r\u0010Wd")), method1132(method1131("l\u0003Z&/4")), method1132(method1131("gK\u0015&\u0004")), method1132(method1131("l\u0003Z&)4")), method1132(method1131("l\u0003Z&;]M")), method1132(method1131("l\u0003Z&Eu\u000bR|G4")), method1132(method1131("l\u0003Z&74")), method1132(method1131("l\u0003Z&(4")), method1132(method1131("l\u0003Z&-4")), method1132(method1131("l\u0003Z&,4")), method1132(method1131("l\u0003Z&.4")), method1132(method1131("l\u0003Z&+4")), method1132(method1131("l\u0003Z&8]M")), method1132(method1131("l\u0003Z&64")), method1132(method1131("l\u0003Z&*4"))};
   @OriginalMember(
      owner = "client!pfa",
      name = "b",
      descriptor = "I"
   )
   public static int field1809;
   @OriginalMember(
      owner = "client!pfa",
      name = "s",
      descriptor = "I"
   )
   public static int field1811;
   @OriginalMember(
      owner = "client!pfa",
      name = "A",
      descriptor = "I"
   )
   public static int field1812;
   @OriginalMember(
      owner = "client!pfa",
      name = "p",
      descriptor = "I"
   )
   public static int field1813;
   @OriginalMember(
      owner = "client!pfa",
      name = "B",
      descriptor = "I"
   )
   public static int field1816;
   @OriginalMember(
      owner = "client!pfa",
      name = "j",
      descriptor = "I"
   )
   public static int field1818;
   @OriginalMember(
      owner = "client!pfa",
      name = "i",
      descriptor = "I"
   )
   public static int field1821;
   @OriginalMember(
      owner = "client!pfa",
      name = "k",
      descriptor = "I"
   )
   public static int field1824;
   @OriginalMember(
      owner = "client!pfa",
      name = "y",
      descriptor = "I"
   )
   public static int field1826;
   @OriginalMember(
      owner = "client!pfa",
      name = "x",
      descriptor = "I"
   )
   public static int field1827;
   @OriginalMember(
      owner = "client!pfa",
      name = "e",
      descriptor = "I"
   )
   public static int field1831;
   @OriginalMember(
      owner = "client!pfa",
      name = "m",
      descriptor = "I"
   )
   public static int field1834;
   @OriginalMember(
      owner = "client!pfa",
      name = "o",
      descriptor = "Ltl;"
   )
   public static class224 field1817;
   @OriginalMember(
      owner = "client!pfa",
      name = "d",
      descriptor = "[[[B"
   )
   public byte[][][] field1828;

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "([[BLc;Lai;IILha;III[[B[ZI[[BI)V"
   )
   private final void method1119(byte[][] arg0, class266 arg1, class376 arg2, int arg3, int arg4, class17 arg5, int arg6, int arg7, int arg8, byte[][] arg9, boolean[] arg10, int arg11, byte[][] arg12, int arg13) {
      boolean var15 = client.field10022;

      try {
         ++field1827;
         boolean[] var16 = arg2 != null && arg2.field5489 ? class317.field4728[arg13] : class62.field880[arg13];
         if (arg8 > 0) {
            if (arg4 > 0) {
               int var17 = arg0[arg4 + -1][arg8 + -1] & 255;
               if (var17 > 0) {
                  class376 var18 = this.field1808.method5479(var17 + -1, (byte)-12);
                  if (var18.field5504 != -1 && var18.field5489) {
                     byte var19 = arg12[arg4 - 1][arg8 + -1];
                     int var20 = arg9[arg4 - 1][arg8 + -1] * 2 + 4 & 7;
                     int var21 = class308.method2524(arg5, var18, -1);
                     if (class416.field6099[var19][var20]) {
                        class6.field83[0] = var18.field5504;
                        class478.field6883[0] = var21;
                        class792.field11531[0] = var18.field5486;
                        class215.field3073[0] = var18.field5497;
                        class801.field11650[0] = var18.field5503;
                        class47.field725[0] = 256;
                     }
                  }
               }
            }

            if (arg4 < arg11 - 1) {
               int var22 = arg0[arg4 - -1][arg8 + -1] & 255;
               if (~var22 < -1) {
                  class376 var23 = this.field1808.method5479(var22 + -1, (byte)-12);
                  if (~var23.field5504 != 0 && var23.field5489) {
                     byte var24 = arg12[arg4 + 1][arg8 - 1];
                     int var25 = 7 & 6 - -(arg9[arg4 - -1][arg8 + -1] * 2);
                     int var26 = class308.method2524(arg5, var23, -1);
                     if (class416.field6099[var24][var25]) {
                        class6.field83[2] = var23.field5504;
                        class478.field6883[2] = var26;
                        class792.field11531[2] = var23.field5486;
                        class215.field3073[2] = var23.field5497;
                        class801.field11650[2] = var23.field5503;
                        class47.field725[2] = 512;
                     }
                  }
               }
            }
         }

         if (arg7 + -1 > arg8) {
            if (~arg4 < -1) {
               int var27 = arg0[arg4 - 1][arg8 + 1] & 255;
               if (~var27 < -1) {
                  class376 var28 = this.field1808.method5479(var27 + -1, (byte)-12);
                  if (~var28.field5504 != 0 && var28.field5489) {
                     byte var29 = arg12[arg4 - 1][arg8 + 1];
                     int var30 = arg9[arg4 + -1][arg8 - -1] * 2 + 2 & 7;
                     int var31 = class308.method2524(arg5, var28, -1);
                     if (class416.field6099[var29][var30]) {
                        class6.field83[6] = var28.field5504;
                        class478.field6883[6] = var31;
                        class792.field11531[6] = var28.field5486;
                        class215.field3073[6] = var28.field5497;
                        class801.field11650[6] = var28.field5503;
                        class47.field725[6] = 64;
                     }
                  }
               }
            }

            if (arg4 < arg11 + -1) {
               int var32 = 255 & arg0[arg4 - -1][arg8 + 1];
               if (~var32 < -1) {
                  class376 var33 = this.field1808.method5479(var32 + -1, (byte)-12);
                  if (var33.field5504 != -1 && var33.field5489) {
                     byte var34 = arg12[arg4 + 1][arg8 + 1];
                     int var35 = 7 & arg9[arg4 + 1][arg8 - -1] * 2;
                     int var36 = class308.method2524(arg5, var33, -1);
                     if (class416.field6099[var34][var35]) {
                        class6.field83[4] = var33.field5504;
                        class478.field6883[4] = var36;
                        class792.field11531[4] = var33.field5486;
                        class215.field3073[4] = var33.field5497;
                        class801.field11650[4] = var33.field5503;
                        class47.field725[4] = 128;
                     }
                  }
               }
            }
         }

         if (arg3 <= 23) {
            this.method1128(-20, (class65)null, 94, -70, -54, 96, -76, (byte)-3, (class663[])null, -62);
         }

         boolean var10000;
         if (~arg8 < -1) {
            int var37 = 255 & arg0[arg4][arg8 + -1];
            if (var37 > 0) {
               class376 var38 = this.field1808.method5479(var37 + -1, (byte)-12);
               if (~var38.field5504 != 0) {
                  label397: {
                     byte var39 = arg12[arg4][arg8 + -1];
                     byte var40 = arg9[arg4][arg8 + -1];
                     if (var38.field5489) {
                        label394: {
                           int var41 = 2;
                           int var42 = var40 * 2 + 4;
                           int var43 = class308.method2524(arg5, var38, -1);
                           int var44 = 0;
                           if (var15) {
                              var42 &= 7;
                              var41 &= 7;
                              var10000 = class416.field6099[var39][var42];
                           } else if (var44 >= 3) {
                              var10000 = var16[arg6 & 3];
                              if (!var15) {
                                 break label394;
                              }
                           } else {
                              var42 &= 7;
                              var41 &= 7;
                              var10000 = class416.field6099[var39][var42];
                           }

                           while(true) {
                              if (var10000 && ~class801.field11650[var41] >= ~var38.field5503) {
                                 class6.field83[var41] = var38.field5504;
                                 class478.field6883[var41] = var43;
                                 class792.field11531[var41] = var38.field5486;
                                 class215.field3073[var41] = var38.field5497;
                                 if (class801.field11650[var41] == var38.field5503) {
                                    class47.field725[var41] = class91.method932(class47.field725[var41], 32);
                                    if (var15) {
                                       class47.field725[var41] = 32;
                                    }
                                 } else {
                                    class47.field725[var41] = 32;
                                 }

                                 class801.field11650[var41] = var38.field5503;
                              }

                              --var41;
                              ++var42;
                              ++var44;
                              if (var44 >= 3) {
                                 var10000 = var16[arg6 & 3];
                                 if (!var15) {
                                    break;
                                 }
                              } else {
                                 var42 &= 7;
                                 var41 &= 7;
                                 var10000 = class416.field6099[var39][var42];
                              }
                           }
                        }

                        if (var10000) {
                           break label397;
                        }

                        arg10[0] = class317.field4728[var39][class697.method5101(3, var40 + 2)];
                        if (!var15) {
                           break label397;
                        }
                     }

                     if (!var16[3 & arg6]) {
                        arg10[0] = class62.field880[var39][class697.method5101(3, 2 - -var40)];
                     }
                  }
               }
            }
         }

         if (arg7 - 1 > arg8) {
            int var45 = 255 & arg0[arg4][arg8 + 1];
            if (var45 > 0) {
               class376 var46 = this.field1808.method5479(var45 + -1, (byte)-12);
               if (~var46.field5504 != 0) {
                  label416: {
                     byte var47 = arg12[arg4][arg8 + 1];
                     byte var48 = arg9[arg4][arg8 + 1];
                     if (!var46.field5489) {
                        if (var16[3 & arg6 + 2]) {
                           break label416;
                        }

                        arg10[2] = class62.field880[var47][class697.method5101(3, var48)];
                        if (!var15) {
                           break label416;
                        }
                     }

                     label354: {
                        int var49 = 4;
                        int var50 = var48 * 2 + 2;
                        int var51 = class308.method2524(arg5, var46, -1);
                        int var52 = 0;
                        if (var15) {
                           var50 &= 7;
                           var49 &= 7;
                           var10000 = class416.field6099[var47][var50];
                        } else if (var52 >= 3) {
                           var10000 = var16[3 & arg6 + 2];
                           if (!var15) {
                              break label354;
                           }
                        } else {
                           var50 &= 7;
                           var49 &= 7;
                           var10000 = class416.field6099[var47][var50];
                        }

                        while(true) {
                           if (var10000 && ~class801.field11650[var49] >= ~var46.field5503) {
                              class6.field83[var49] = var46.field5504;
                              class478.field6883[var49] = var51;
                              class792.field11531[var49] = var46.field5486;
                              class215.field3073[var49] = var46.field5497;
                              if (~class801.field11650[var49] == ~var46.field5503) {
                                 class47.field725[var49] = class91.method932(class47.field725[var49], 16);
                                 if (var15) {
                                    class47.field725[var49] = 16;
                                 }
                              } else {
                                 class47.field725[var49] = 16;
                              }

                              class801.field11650[var49] = var46.field5503;
                           }

                           --var50;
                           ++var49;
                           ++var52;
                           if (var52 >= 3) {
                              var10000 = var16[3 & arg6 + 2];
                              if (!var15) {
                                 break;
                              }
                           } else {
                              var50 &= 7;
                              var49 &= 7;
                              var10000 = class416.field6099[var47][var50];
                           }
                        }
                     }

                     if (!var10000) {
                        arg10[2] = class317.field4728[var47][class697.method5101(3, var48)];
                     }
                  }
               }
            }
         }

         if (arg4 > 0) {
            int var53 = arg0[arg4 + -1][arg8] & 255;
            if (var53 > 0) {
               class376 var54 = this.field1808.method5479(var53 - 1, (byte)-12);
               if (var54.field5504 != -1) {
                  label325: {
                     byte var55 = arg12[arg4 + -1][arg8];
                     byte var56 = arg9[arg4 - 1][arg8];
                     if (var54.field5489) {
                        label322: {
                           int var57 = 6;
                           int var58 = var56 * 2 + 4;
                           int var59 = class308.method2524(arg5, var54, -1);
                           int var60 = 0;
                           if (var15) {
                              var58 &= 7;
                              var57 &= 7;
                              var10000 = class416.field6099[var55][var58];
                           } else if (var60 >= 3) {
                              var10000 = var16[3 & arg6 + 3];
                              if (!var15) {
                                 break label322;
                              }
                           } else {
                              var58 &= 7;
                              var57 &= 7;
                              var10000 = class416.field6099[var55][var58];
                           }

                           while(true) {
                              if (var10000 && class801.field11650[var57] <= var54.field5503) {
                                 class6.field83[var57] = var54.field5504;
                                 class478.field6883[var57] = var59;
                                 class792.field11531[var57] = var54.field5486;
                                 class215.field3073[var57] = var54.field5497;
                                 if (class801.field11650[var57] == var54.field5503) {
                                    class47.field725[var57] = class91.method932(class47.field725[var57], 8);
                                    if (var15) {
                                       class47.field725[var57] = 8;
                                    }
                                 } else {
                                    class47.field725[var57] = 8;
                                 }

                                 class801.field11650[var57] = var54.field5503;
                              }

                              --var58;
                              ++var57;
                              ++var60;
                              if (var60 >= 3) {
                                 var10000 = var16[3 & arg6 + 3];
                                 if (!var15) {
                                    break;
                                 }
                              } else {
                                 var58 &= 7;
                                 var57 &= 7;
                                 var10000 = class416.field6099[var55][var58];
                              }
                           }
                        }

                        if (var10000) {
                           break label325;
                        }

                        arg10[3] = class317.field4728[var55][class697.method5101(3, 1 - -var56)];
                        if (!var15) {
                           break label325;
                        }
                     }

                     if (!var16[3 & arg6 + 3]) {
                        arg10[3] = class62.field880[var55][class697.method5101(var56 + 1, 3)];
                     }
                  }
               }
            }
         }

         if (arg4 < arg11 + -1) {
            int var61 = arg0[arg4 - -1][arg8] & 255;
            if (var61 > 0) {
               class376 var62 = this.field1808.method5479(var61 + -1, (byte)-12);
               if (~var62.field5504 != 0) {
                  label289: {
                     byte var63 = arg12[arg4 + 1][arg8];
                     byte var64 = arg9[arg4 - -1][arg8];
                     if (var62.field5489) {
                        label286: {
                           int var65 = 4;
                           int var66 = var64 * 2 + 6;
                           int var67 = class308.method2524(arg5, var62, -1);
                           int var68 = 0;
                           if (var15) {
                              var66 &= 7;
                              var65 &= 7;
                              var10000 = class416.field6099[var63][var66];
                           } else if (~var68 <= -4) {
                              var10000 = var16[3 & arg6 + 1];
                              if (!var15) {
                                 break label286;
                              }
                           } else {
                              var66 &= 7;
                              var65 &= 7;
                              var10000 = class416.field6099[var63][var66];
                           }

                           while(true) {
                              if (var10000 && class801.field11650[var65] <= var62.field5503) {
                                 class6.field83[var65] = var62.field5504;
                                 class478.field6883[var65] = var67;
                                 class792.field11531[var65] = var62.field5486;
                                 class215.field3073[var65] = var62.field5497;
                                 if (class801.field11650[var65] == var62.field5503) {
                                    class47.field725[var65] = class91.method932(class47.field725[var65], 4);
                                    if (var15) {
                                       class47.field725[var65] = 4;
                                    }
                                 } else {
                                    class47.field725[var65] = 4;
                                 }

                                 class801.field11650[var65] = var62.field5503;
                              }

                              --var65;
                              ++var66;
                              ++var68;
                              if (~var68 <= -4) {
                                 var10000 = var16[3 & arg6 + 1];
                                 if (!var15) {
                                    break;
                                 }
                              } else {
                                 var66 &= 7;
                                 var65 &= 7;
                                 var10000 = class416.field6099[var63][var66];
                              }
                           }
                        }

                        if (var10000) {
                           break label289;
                        }

                        arg10[1] = class317.field4728[var63][class697.method5101(var64 + 3, 3)];
                        if (!var15) {
                           break label289;
                        }
                     }

                     if (!var16[3 & 1 - -arg6]) {
                        arg10[1] = class62.field880[var63][class697.method5101(var64 + 3, 3)];
                     }
                  }
               }
            }
         }

         if (arg2 != null) {
            int var69 = class308.method2524(arg5, arg2, -1);
            if (arg2.field5489) {
               int var70 = 0;
               if (!var15 && ~var70 <= -9) {
                  return;
               }

               do {
                  int var71 = -(arg6 * 2) + var70 & 7;
                  if (class416.field6099[arg13][var70]) {
                     if (~arg2.field5503 <= ~class801.field11650[var71]) {
                        class6.field83[var71] = arg2.field5504;
                        class478.field6883[var71] = var69;
                        class792.field11531[var71] = arg2.field5486;
                        class215.field3073[var71] = arg2.field5497;
                        if (class801.field11650[var71] == arg2.field5503) {
                           class47.field725[var71] = class91.method932(class47.field725[var71], 2);
                           if (var15) {
                              class47.field725[var71] = 2;
                           }
                        } else {
                           class47.field725[var71] = 2;
                        }

                        class801.field11650[var71] = arg2.field5503;
                        ++var70;
                     } else {
                        ++var70;
                     }
                  } else {
                     ++var70;
                  }
               } while(~var70 > -9);

               return;
            }
         }

      } catch (RuntimeException var73) {
         throw class612.method4503(var73, field1835[7] + (arg0 != null ? field1835[2] : field1835[0]) + ',' + (arg1 != null ? field1835[2] : field1835[0]) + ',' + (arg2 != null ? field1835[2] : field1835[0]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1835[2] : field1835[0]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field1835[2] : field1835[0]) + ',' + (arg10 != null ? field1835[2] : field1835[0]) + ',' + arg11 + ',' + (arg12 != null ? field1835[2] : field1835[0]) + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(IILcu;II[Lbc;I)V"
   )
   public final void method1120(int arg0, int arg1, class65 arg2, int arg3, int arg4, class663[] arg5, int arg6) {
      boolean var8 = client.field10022;

      try {
         if (!this.field1832) {
            int var9 = 0;
            if (var8 || var9 < 4) {
               do {
                  class663 var10 = arg5[var9];
                  int var11 = 0;
                  if (var8 || ~var11 > -65) {
                     do {
                        int var12 = 0;
                        if (var8 || var12 < 64) {
                           do {
                              int var13 = arg3 + var11;
                              int var14 = arg0 + var12;
                              if (~var13 <= -1 && ~var13 > ~this.field1833 && ~var14 <= -1 && ~var14 > ~this.field1814) {
                                 var10.method4808(var13, (byte)-60, var14);
                              }

                              ++var12;
                           } while(var12 < 64);
                        }

                        ++var11;
                     } while(~var11 > -65);
                  }

                  ++var9;
               } while(var9 < 4);
            }
         }

         ++field1809;
         int var15 = arg3 + arg6;
         int var16 = arg0 + arg4;
         if (arg1 < 4) {
            this.field1833 = 101;
         }

         int var17 = 0;
         if (var8 || var17 < this.field1823) {
            do {
               int var18 = 0;
               if (var8 || var18 < 64) {
                  do {
                     int var19 = 0;
                     if (var8) {
                        this.method1129(-114, var16 + var19, var17, 0, arg2, false, arg0 + var19, 0, var15 - -var18, arg3 + var18, 0);
                        ++var19;
                     }

                     while(true) {
                        while(~var19 > -65) {
                           this.method1129(-114, var16 + var19, var17, 0, arg2, false, arg0 + var19, 0, var15 - -var18, arg3 + var18, 0);
                           ++var19;
                        }

                        if (!var8) {
                           ++var18;
                           break;
                        }

                        ++var19;
                     }
                  } while(var18 < 64);
               }

               ++var17;
            } while(var17 < this.field1823);

         }
      } catch (RuntimeException var21) {
         throw class612.method4503(var21, field1835[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1835[2] : field1835[0]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1835[2] : field1835[0]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public final void method1121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field10022;

      try {
         ++field1826;
         int var8 = arg3;
         int var9;
         int var10;
         int var11;
         int var10000;
         if (var7) {
            var9 = arg4;
            if (var7) {
               if (arg4 >= 0 && arg4 < this.field1833 && ~arg3 <= -1 && this.field1814 > arg3) {
                  this.field1822[arg1][arg4][arg3] = arg1 <= 0 ? 0 : this.field1822[arg1 + -1][arg4][arg3] + -960;
               }

               var9 = arg4 + 1;
            }
         } else {
            if (~(arg2 + arg3) >= ~arg3) {
               var10000 = arg4;
               if (!var7) {
                  if (arg4 > 0 && this.field1833 > arg4) {
                     var10 = arg3 + 1;
                     if (var7 || arg2 + arg3 > var10) {
                        do {
                           if (~var10 <= -1 && ~var10 > ~this.field1814) {
                              this.field1822[arg1][arg4][var10] = this.field1822[arg1][arg4 + -1][var10];
                           }

                           ++var10;
                        } while(arg2 + arg3 > var10);
                     }
                  }

                  if (~arg3 < -1 && ~arg3 > ~this.field1814) {
                     var11 = arg4 + 1;
                     if (var7 || ~var11 > ~(arg0 + arg4)) {
                        do {
                           if (var11 >= 0 && ~this.field1833 < ~var11) {
                              this.field1822[arg1][var11][arg3] = this.field1822[arg1][var11][arg3 + -1];
                           }

                           ++var11;
                        } while(~var11 > ~(arg0 + arg4));
                     }
                  }

                  if (~arg4 <= arg5 && ~arg3 <= -1 && ~arg4 > ~this.field1833 && ~this.field1814 < ~arg3) {
                     if (~arg1 != -1) {
                        if (arg4 > 0 && this.field1822[arg1 + -1][arg4 + -1][arg3] != this.field1822[arg1][arg4 + -1][arg3]) {
                           this.field1822[arg1][arg4][arg3] = this.field1822[arg1][arg4 + -1][arg3];
                           return;
                        }

                        if (arg3 > 0 && ~this.field1822[arg1 + -1][arg4][arg3 + -1] != ~this.field1822[arg1][arg4][arg3 + -1]) {
                           this.field1822[arg1][arg4][arg3] = this.field1822[arg1][arg4][arg3 - 1];
                           return;
                        }

                        if (~arg4 < -1 && arg3 > 0 && ~this.field1822[arg1 + -1][arg4 + -1][arg3 + -1] != ~this.field1822[arg1][arg4 + -1][arg3 + -1]) {
                           this.field1822[arg1][arg4][arg3] = this.field1822[arg1][arg4 + -1][arg3 + -1];
                           return;
                        }

                        return;
                     }

                     if (~arg4 < -1 && ~this.field1822[arg1][arg4 + -1][arg3] != -1) {
                        this.field1822[arg1][arg4][arg3] = this.field1822[arg1][arg4 + -1][arg3];
                        return;
                     }

                     if (arg3 > 0 && ~this.field1822[arg1][arg4][arg3 - 1] != -1) {
                        this.field1822[arg1][arg4][arg3] = this.field1822[arg1][arg4][arg3 - 1];
                        return;
                     }

                     if (~arg4 < -1 && ~arg3 < -1 && ~this.field1822[arg1][arg4 + -1][arg3 - 1] != -1) {
                        this.field1822[arg1][arg4][arg3] = this.field1822[arg1][arg4 - 1][arg3 - 1];
                        return;
                     }
                  }

                  return;
               }
            } else {
               var10000 = arg4;
            }

            var9 = var10000;
            if (var7) {
               if (var9 >= 0 && var9 < this.field1833 && ~arg3 <= -1 && this.field1814 > arg3) {
                  this.field1822[arg1][var9][arg3] = arg1 <= 0 ? 0 : this.field1822[arg1 + -1][var9][arg3] + -960;
               }

               ++var9;
            }
         }

         while(true) {
            while(arg0 + arg4 > var9) {
               if (var9 >= 0 && var9 < this.field1833 && ~var8 <= -1 && this.field1814 > var8) {
                  this.field1822[arg1][var9][var8] = arg1 <= 0 ? 0 : this.field1822[arg1 + -1][var9][var8] + -960;
               }

               ++var9;
            }

            if (!var7) {
               ++var8;
               if (~(arg2 + arg3) >= ~var8) {
                  var10000 = arg4;
                  if (!var7) {
                     if (arg4 > 0 && this.field1833 > arg4) {
                        var10 = arg3 + 1;
                        if (var7 || arg2 + arg3 > var10) {
                           do {
                              if (~var10 <= -1 && ~var10 > ~this.field1814) {
                                 this.field1822[arg1][arg4][var10] = this.field1822[arg1][arg4 + -1][var10];
                              }

                              ++var10;
                           } while(arg2 + arg3 > var10);
                        }
                     }

                     if (~arg3 < -1 && ~arg3 > ~this.field1814) {
                        var11 = arg4 + 1;
                        if (var7 || ~var11 > ~(arg0 + arg4)) {
                           do {
                              if (var11 >= 0 && ~this.field1833 < ~var11) {
                                 this.field1822[arg1][var11][arg3] = this.field1822[arg1][var11][arg3 + -1];
                              }

                              ++var11;
                           } while(~var11 > ~(arg0 + arg4));
                        }
                     }

                     if (~arg4 <= arg5 && ~arg3 <= -1 && ~arg4 > ~this.field1833 && ~this.field1814 < ~arg3) {
                        if (~arg1 != -1) {
                           if (arg4 > 0 && this.field1822[arg1 + -1][arg4 + -1][arg3] != this.field1822[arg1][arg4 + -1][arg3]) {
                              this.field1822[arg1][arg4][arg3] = this.field1822[arg1][arg4 + -1][arg3];
                              return;
                           }

                           if (arg3 > 0 && ~this.field1822[arg1 + -1][arg4][arg3 + -1] != ~this.field1822[arg1][arg4][arg3 + -1]) {
                              this.field1822[arg1][arg4][arg3] = this.field1822[arg1][arg4][arg3 - 1];
                              return;
                           }

                           if (~arg4 < -1 && arg3 > 0 && ~this.field1822[arg1 + -1][arg4 + -1][arg3 + -1] != ~this.field1822[arg1][arg4 + -1][arg3 + -1]) {
                              this.field1822[arg1][arg4][arg3] = this.field1822[arg1][arg4 + -1][arg3 + -1];
                              return;
                           }

                           return;
                        }

                        if (~arg4 < -1 && ~this.field1822[arg1][arg4 + -1][arg3] != -1) {
                           this.field1822[arg1][arg4][arg3] = this.field1822[arg1][arg4 + -1][arg3];
                           return;
                        }

                        if (arg3 > 0 && ~this.field1822[arg1][arg4][arg3 - 1] != -1) {
                           this.field1822[arg1][arg4][arg3] = this.field1822[arg1][arg4][arg3 - 1];
                           return;
                        }

                        if (~arg4 < -1 && ~arg3 < -1 && ~this.field1822[arg1][arg4 + -1][arg3 - 1] != -1) {
                           this.field1822[arg1][arg4][arg3] = this.field1822[arg1][arg4 - 1][arg3 - 1];
                           return;
                        }
                     }

                     return;
                  }
               } else {
                  var10000 = arg4;
               }

               var9 = var10000;
               if (var7) {
                  if (var9 >= 0 && var9 < this.field1833 && ~var8 <= -1 && this.field1814 > var8) {
                     this.field1822[arg1][var9][var8] = arg1 <= 0 ? 0 : this.field1822[arg1 + -1][var9][var8] + -960;
                  }

                  ++var9;
               }
            } else {
               ++var9;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field1835[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "([[[IILha;[Lbc;)V"
   )
   public final void method1122(int[][][] arg0, int arg1, class17 arg2, class663[] arg3) {
      boolean var5 = client.field10022;

      try {
         if (!this.field1832) {
            int var6 = 0;
            if (var5 || var6 < 4) {
               do {
                  int var7 = 0;
                  if (var5 || ~var7 > ~this.field1833) {
                     do {
                        int var8 = 0;
                        int var9;
                        if (var5) {
                           if ((1 & class644.field9070[var6][var7][var8]) != 0) {
                              var9 = var6;
                              if (~(class644.field9070[1][var7][var8] & 2) != -1) {
                                 var9 = var6 - 1;
                              }

                              if (~var9 <= -1) {
                                 arg3[var9].method4822(true, var8, var7);
                              }
                           }

                           ++var8;
                        }

                        while(true) {
                           while(~var8 > ~this.field1814) {
                              if ((1 & class644.field9070[var6][var7][var8]) != 0) {
                                 var9 = var6;
                                 if (~(class644.field9070[1][var7][var8] & 2) != -1) {
                                    var9 = var6 - 1;
                                 }

                                 if (~var9 <= -1) {
                                    arg3[var9].method4822(true, var8, var7);
                                 }
                              }

                              ++var8;
                           }

                           if (!var5) {
                              ++var7;
                              break;
                           }

                           ++var8;
                        }
                     } while(~var7 > ~this.field1833);
                  }

                  ++var6;
               } while(var6 < 4);
            }
         }

         ++field1834;
         if (arg1 != 25496) {
            this.method1121(70, -100, -115, 80, 60, -53);
         }

         int var10 = 0;
         if (var5 || this.field1823 > var10) {
            do {
               int var11 = 0;
               int var12 = 0;
               if (!this.field1832) {
                  if (class587.field8248) {
                     var12 |= 8;
                  }

                  if (class261.field4009) {
                     var11 |= 2;
                  }

                  if (~class637.field9010 != -1) {
                     var11 |= 1;
                     if (class306.field4637 | var10 == 0) {
                        var12 |= 16;
                     }
                  }
               }

               if (class261.field4009) {
                  var12 |= 7;
               }

               if (!class272.field4164) {
                  var12 |= 32;
               }

               int[][] var13 = arg0 != null ? (var10 < arg0.length ? arg0[var10] : this.field1822[var10]) : this.field1822[var10];
               class44.method497(var10, arg2.method245(this.field1833, this.field1814, this.field1822[var10], var13, 512, var11, var12));
               ++var10;
            } while(this.field1823 > var10);

         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field1835[3] + (arg0 != null ? field1835[2] : field1835[0]) + ',' + arg1 + ',' + (arg2 != null ? field1835[2] : field1835[0]) + ',' + (arg3 != null ? field1835[2] : field1835[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(Ls;Ls;BLha;)V"
   )
   public final void method1123(class751 param1, class751 param2, byte param3, class17 param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(I[[II)V"
   )
   public final void method1124(int arg0, int[][] arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         if (arg0 > -52) {
            this.method1123((class751)null, (class751)null, (byte)-82, (class17)null);
         }

         ++field1821;
         int[][] var5 = this.field1822[arg2];
         int var6 = 0;
         if (var4 || var6 < this.field1833 - -1) {
            do {
               int var7 = 0;
               if (var4) {
                  var5[var6][var7] += arg1[var6][var7];
                  ++var7;
               }

               while(true) {
                  while(~var7 > ~(this.field1814 + 1)) {
                     var5[var6][var7] += arg1[var6][var7];
                     ++var7;
                  }

                  if (!var4) {
                     ++var6;
                     break;
                  }

                  ++var7;
               }
            } while(var6 < this.field1833 - -1);

         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field1835[6] + arg0 + ',' + (arg1 != null ? field1835[2] : field1835[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(Ls;IILs;[[ILs;Lha;)V"
   )
   private final void method1125(class751 param1, int param2, int param3, class751 param4, int[][] param5, class751 param6, class17 param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "<init>",
      descriptor = "(IIIZLro;Lvl;)V"
   )
   public class115(int arg0, int arg1, int arg2, boolean arg3, class759 arg4, class340 arg5) {
      try {
         this.field1833 = arg1;
         this.field1808 = arg4;
         this.field1814 = arg2;
         this.field1825 = arg5;
         this.field1823 = arg0;
         this.field1832 = arg3;
         this.field1810 = new byte[this.field1823][this.field1833][this.field1814];
         this.field1829 = new byte[this.field1823][this.field1833][this.field1814];
         this.field1830 = new byte[this.field1823][this.field1833][this.field1814];
         this.field1822 = new int[this.field1823][this.field1833 + 1][this.field1814 + 1];
         this.field1819 = new byte[this.field1823][this.field1833][this.field1814];
         this.field1820 = new byte[this.field1823][this.field1833 + 1][this.field1814 + 1];
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1835[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1835[2] : field1835[0]) + ',' + (arg5 != null ? field1835[2] : field1835[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1126(byte arg0) {
      try {
         if (arg0 >= 100) {
            field1817 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1835[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method1127(int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(ILcu;IIIIIB[Lbc;I)V"
   )
   public final void method1128(int param1, class65 param2, int param3, int param4, int param5, int param6, int param7, byte param8, class663[] param9, int param10) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(IIIILcu;ZIIIII)V"
   )
   private final void method1129(int arg0, int arg1, int arg2, int arg3, class65 arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      boolean var12 = client.field10022;

      try {
         label172: {
            if (~arg7 != -2) {
               if (~arg7 != -3) {
                  if (~arg7 != -4) {
                     break label172;
                  }

                  arg10 = 1;
                  if (!var12) {
                     break label172;
                  }
               }

               arg3 = 1;
               arg10 = 1;
               if (!var12) {
                  break label172;
               }
            }

            arg3 = 1;
         }

         label188: {
            ++field1818;
            if (arg9 < 0 || this.field1833 <= arg9 || ~arg6 > -1 || arg6 >= this.field1814) {
               while(true) {
                  int var13 = arg4.method665(false);
                  if (var13 != 0) {
                     if (var13 == 1) {
                        arg4.method665(false);
                        if (!var12) {
                           break label188;
                        }
                     }

                     if (var13 > 49) {
                        continue;
                     }

                     arg4.method665(false);
                     if (var12) {
                        break label188;
                     }

                     if (!var12) {
                        continue;
                     }
                  }

                  if (!var12) {
                     break label188;
                  }
                  break;
               }
            }

            if (!this.field1832 && !arg5) {
               class644.field9070[arg2][arg9][arg6] = 0;
            }

            label140:
            do {
               int var14;
               while(true) {
                  while(true) {
                     int var10000;
                     label118: {
                        var14 = arg4.method665(false);
                        if (~var14 == -1) {
                           var10000 = this.field1832;
                           if (var12) {
                              break label118;
                           }

                           if (var10000 == 0) {
                              if (~arg2 == -1) {
                                 this.field1822[0][arg9 + arg10][arg3 + arg6] = 8 * -class370.method2907(arg1 + 556238, 23629, arg8 + 932731) << 2;
                                 if (!var12) {
                                    break label140;
                                 }
                              }

                              this.field1822[arg2][arg9 + arg10][arg3 + arg6] = this.field1822[arg2 + -1][arg9 + arg10][arg3 + arg6] - 960;
                              if (!var12) {
                                 break label140;
                              }
                           }

                           this.field1822[0][arg9 + arg10][arg3 + arg6] = 0;
                           if (!var12) {
                              break label140;
                           }
                        }

                        var10000 = var14;
                     }

                     if (var10000 == 1) {
                        int var15 = arg4.method665(false);
                        if (!this.field1832) {
                           if (~var15 == -2) {
                              var15 = 0;
                           }

                           if (~arg2 != -1) {
                              this.field1822[arg2][arg9 + arg10][arg3 + arg6] = this.field1822[arg2 + -1][arg9 - -arg10][arg3 + arg6] + -(var15 * 8 << 2);
                              if (!var12) {
                                 break label140;
                              }
                           }

                           this.field1822[0][arg9 - -arg10][arg3 + arg6] = -var15 * 8 << 2;
                           if (!var12) {
                              break label140;
                           }
                        }

                        this.field1822[0][arg9 + arg10][arg3 + arg6] = var15 * 8 << 2;
                        if (!var12) {
                           break label140;
                        }
                     }

                     if (var14 > 49) {
                        break;
                     }

                     if (arg5) {
                        arg4.method665(false);
                        if (!var12) {
                           continue;
                        }
                     }

                     this.field1829[arg2][arg9][arg6] = arg4.method638(true);
                     this.field1819[arg2][arg9][arg6] = (byte)((var14 + -2) / 4);
                     this.field1830[arg2][arg9][arg6] = (byte)class697.method5101(var14 + -2 + arg7, 3);
                     if (var12) {
                        break;
                     }
                  }

                  if (~var14 < -82) {
                     break;
                  }

                  if (!this.field1832 && !arg5) {
                     class644.field9070[arg2][arg9][arg6] = (byte)(var14 + -49);
                     if (var12) {
                        break;
                     }
                  }
               }

               if (!arg5) {
                  this.field1810[arg2][arg9][arg6] = (byte)(var14 + -81);
               }
            } while(!var12);
         }

         if (arg0 >= -113) {
            this.field1830 = null;
         }
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field1835[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1835[2] : field1835[0]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "([[ILs;Lha;Ls;Ls;II)V"
   )
   private final void method1130(int[][] param1, class751 param2, class17 param3, class751 param4, class751 param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1131(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1132(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
