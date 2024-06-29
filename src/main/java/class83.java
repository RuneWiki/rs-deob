import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class83 extends class293 {
   @OriginalMember(
      owner = "client!qw",
      name = "m",
      descriptor = "I"
   )
   private int field1018 = -1;
   @OriginalMember(
      owner = "client!qw",
      name = "o",
      descriptor = "Lbda;"
   )
   private class531 field1014;
   @OriginalMember(
      owner = "client!qw",
      name = "E",
      descriptor = "I"
   )
   private int field1027;
   @OriginalMember(
      owner = "client!qw",
      name = "z",
      descriptor = "[[B"
   )
   private byte[][] field1013;
   @OriginalMember(
      owner = "client!qw",
      name = "y",
      descriptor = "[[B"
   )
   private byte[][] field1017;
   @OriginalMember(
      owner = "client!qw",
      name = "p",
      descriptor = "F"
   )
   private float field1010;
   @OriginalMember(
      owner = "client!qw",
      name = "v",
      descriptor = "F"
   )
   private float field1011;
   @OriginalMember(
      owner = "client!qw",
      name = "C",
      descriptor = "F"
   )
   private float field1012;
   @OriginalMember(
      owner = "client!qw",
      name = "n",
      descriptor = "F"
   )
   private float field1015;
   @OriginalMember(
      owner = "client!qw",
      name = "r",
      descriptor = "F"
   )
   private float field1019;
   @OriginalMember(
      owner = "client!qw",
      name = "x",
      descriptor = "F"
   )
   private float field1022;
   @OriginalMember(
      owner = "client!qw",
      name = "q",
      descriptor = "F"
   )
   private float field1023;
   @OriginalMember(
      owner = "client!qw",
      name = "u",
      descriptor = "F"
   )
   private float field1024;
   @OriginalMember(
      owner = "client!qw",
      name = "l",
      descriptor = "F"
   )
   private float field1028;
   @OriginalMember(
      owner = "client!qw",
      name = "w",
      descriptor = "F"
   )
   private float field1029;
   @OriginalMember(
      owner = "client!qw",
      name = "D",
      descriptor = "F"
   )
   private float field1030;
   @OriginalMember(
      owner = "client!qw",
      name = "k",
      descriptor = "F"
   )
   private float field1031;
   @OriginalMember(
      owner = "client!qw",
      name = "s",
      descriptor = "[[Lbea;"
   )
   private class233[][] field1016;
   @OriginalMember(
      owner = "client!qw",
      name = "t",
      descriptor = "[[Lfp;"
   )
   private class341[][] field1025;
   @OriginalMember(
      owner = "client!qw",
      name = "F",
      descriptor = "[[Lvv;"
   )
   private class342[][] field1020;
   @OriginalMember(
      owner = "client!qw",
      name = "A",
      descriptor = "[[Lpu;"
   )
   private class588[][] field1021;
   @OriginalMember(
      owner = "client!qw",
      name = "B",
      descriptor = "[[Lkn;"
   )
   private class771[][] field1026;

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z",
      line = 4
   )
   public final boolean method770(class193 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return false;
   }

   @OriginalMember(
      owner = "client!qw",
      name = "b",
      descriptor = "(IIZLig;Lpo;[I[I[I[II)V",
      line = 8
   )
   private final void method771(int arg0, int arg1, boolean arg2, class255 arg3, class584 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
      class588 var11 = this.field1021[arg0][arg1];
      if (arg9 == 0 || (arg9 & 2) == 0) {
         if (var11 != null) {
            if (this.field1018 == -1) {
               for(int var12 = 0; var12 < var11.field8704; ++var12) {
                  int var13 = (arg0 << super.field4086) + var11.field8706[var12];
                  int var14 = var11.field8707[var12];
                  int var15 = (arg1 << super.field4086) + var11.field8705[var12];
                  float var16 = (float)var15 * this.field1024 + (float)var13 * this.field1023 + (float)var14 * this.field1015 + this.field1030;
                  if (var16 <= (float)this.field1014.field7741) {
                     return;
                  }

                  arg8[var12] = 0;
                  if (arg2) {
                     int var17 = (int)(var16 - (float)arg3.field3402);
                     if (var17 > 255) {
                        var17 = 255;
                     }

                     if (var17 > 0) {
                        arg8[var12] = var17;
                        int var18 = var11.field8702[var12] * var17 / 255;
                        if (var18 > 0) {
                           var14 -= var18;
                        }
                     }
                  } else if (arg3.field3403) {
                     int var19 = (int)(var16 - (float)arg3.field3402);
                     if (var19 > 0) {
                        arg8[var12] = var19;
                        if (arg8[var12] > 255) {
                           arg8[var12] = 255;
                        }
                     }
                  }

                  float var20 = (float)var15 * this.field1012 + (float)var13 * this.field1031 + (float)var14 * this.field1028 + this.field1010;
                  float var21 = (float)var15 * this.field1022 + (float)var13 * this.field1011 + (float)var14 * this.field1029 + this.field1019;
                  arg5[var12] = (int)((float)this.field1014.field7725 * var20 / var16) + arg4.field8654;
                  arg6[var12] = (int)((float)this.field1014.field7739 * var21 / var16) + arg4.field8647;
                  arg7[var12] = (int)var16;
               }
            } else {
               for(int var22 = 0; var22 < var11.field8704; ++var22) {
                  int var36 = (arg0 << super.field4086) + var11.field8706[var22];
                  int var37 = var11.field8707[var22];
                  int var38 = (arg1 << super.field4086) + var11.field8705[var22];
                  float var39 = (float)var38 * this.field1024 + (float)var36 * this.field1023 + (float)var37 * this.field1015 + this.field1030;
                  arg8[var22] = 0;
                  if (arg2) {
                     int var40 = this.field1018 - arg3.field3402;
                     if (var40 > 255) {
                        var40 = 255;
                     }

                     if (var40 > 0) {
                        arg8[var22] = var40;
                        int var41 = var11.field8702[var22] * var40 / 255;
                        if (var41 > 0) {
                           var37 -= var41;
                        }
                     }
                  } else if (arg3.field3403) {
                     int var42 = this.field1018 - arg3.field3402;
                     if (var42 > 0) {
                        arg8[var22] = var42;
                        if (arg8[var22] > 255) {
                           arg8[var22] = 255;
                        }
                     }
                  }

                  float var43 = (float)var38 * this.field1012 + (float)var36 * this.field1031 + (float)var37 * this.field1028 + this.field1010;
                  float var44 = (float)var38 * this.field1022 + (float)var36 * this.field1011 + (float)var37 * this.field1029 + this.field1019;
                  arg5[var22] = (int)((float)this.field1014.field7725 * var43 / (float)this.field1018) + arg4.field8654;
                  arg6[var22] = (int)((float)this.field1014.field7739 * var44 / (float)this.field1018) + arg4.field8647;
                  arg7[var22] = (int)var39;
               }
            }

            float var23 = (float)super.field4080;

            for(int var24 = 0; var24 < var11.field8699; ++var24) {
               int var25 = var24 * 3;
               int var26 = var25 + 1;
               int var27 = var26 + 1;
               int var28 = arg5[var25];
               int var29 = arg5[var26];
               int var30 = arg5[var27];
               int var31 = arg6[var25];
               int var32 = arg6[var26];
               int var33 = arg6[var27];
               if ((var28 - var29) * (var33 - var32) - (var30 - var29) * (var31 - var32) > 0) {
                  arg4.field8662 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field8649 || var29 > arg4.field8649 || var30 > arg4.field8649;
                  if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                     int var34 = arg0 << super.field4086;
                     int var35 = arg1 << super.field4086;
                     if ((var11.field8698[var25] & 16777215) != 0) {
                        if (var11.field8703[var25] == var11.field8703[var26] && var11.field8703[var25] == var11.field8703[var27] && var11.field8708[var25] == var11.field8708[var26] && var11.field8708[var25] == var11.field8708[var27]) {
                           arg4.method4317((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], (float)(var11.field8706[var25] + var34) / (float)var11.field8708[var25], (float)(var11.field8706[var26] + var34) / (float)var11.field8708[var26], (float)(var11.field8706[var27] + var34) / (float)var11.field8708[var27], (float)(var11.field8705[var25] + var35) / (float)var11.field8708[var25], (float)(var11.field8705[var26] + var35) / (float)var11.field8708[var26], (float)(var11.field8705[var27] + var35) / (float)var11.field8708[var27], var11.field8698[var25], var11.field8698[var26], var11.field8698[var27], arg3.field3395, arg8[var25], arg8[var26], arg8[var27], var11.field8703[var25]);
                        } else {
                           arg4.method4311((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], (float)(var11.field8706[var25] + var34) / var23, (float)(var11.field8706[var26] + var34) / var23, (float)(var11.field8706[var27] + var34) / var23, (float)(var11.field8705[var25] + var35) / var23, (float)(var11.field8705[var26] + var35) / var23, (float)(var11.field8705[var27] + var35) / var23, var11.field8698[var25], var11.field8698[var26], var11.field8698[var27], arg3.field3395, arg8[var25], arg8[var26], arg8[var27], var11.field8703[var25], var23 / (float)var11.field8708[var25], var11.field8703[var26], var23 / (float)var11.field8708[var26], var11.field8703[var27], var23 / (float)var11.field8708[var27]);
                        }
                     }
                  } else {
                     arg4.method4307((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], arg3.field3395);
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(IIZLig;Lpo;[I[I[I[II)V",
      line = 200
   )
   private final void method772(int arg0, int arg1, boolean arg2, class255 arg3, class584 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
      class233 var11 = this.field1016[arg0][arg1];
      if (var11 != null) {
         if ((var11.field2964 & 2) == 0) {
            if (arg9 != 0) {
               if ((var11.field2964 & 4) != 0) {
                  if ((arg9 & 1) != 0) {
                     return;
                  }
               } else if ((arg9 & 2) != 0) {
                  return;
               }
            }

            int var12 = super.field4080 * arg0;
            int var13 = super.field4080 + var12;
            int var14 = super.field4080 * arg1;
            int var15 = super.field4080 + var14;
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            int var19 = 0;
            float var22;
            float var23;
            float var24;
            float var25;
            int var33;
            int var35;
            int var37;
            int var39;
            int var41;
            int var43;
            int var45;
            int var47;
            if ((var11.field2964 & 1) != 0 && !arg2) {
               int var20 = super.field4082[arg0][arg1];
               float var21 = (float)var20 * this.field1015;
               if (this.field1018 == -1) {
                  var22 = (float)var14 * this.field1024 + (float)var12 * this.field1023 + var21 + this.field1030;
                  if (var22 <= (float)this.field1014.field7741) {
                     return;
                  }

                  var23 = (float)var14 * this.field1024 + (float)var13 * this.field1023 + var21 + this.field1030;
                  if (var23 <= (float)this.field1014.field7741) {
                     return;
                  }

                  var24 = (float)var15 * this.field1024 + (float)var13 * this.field1023 + var21 + this.field1030;
                  if (var24 <= (float)this.field1014.field7741) {
                     return;
                  }

                  var25 = (float)var15 * this.field1024 + (float)var12 * this.field1023 + var21 + this.field1030;
                  if (var25 <= (float)this.field1014.field7741) {
                     return;
                  }
               } else {
                  var22 = (float)var14 * this.field1024 + (float)var12 * this.field1023 + var21 + this.field1030;
                  var23 = (float)var14 * this.field1024 + (float)var13 * this.field1023 + var21 + this.field1030;
                  var24 = (float)var15 * this.field1024 + (float)var13 * this.field1023 + var21 + this.field1030;
                  var25 = (float)var15 * this.field1024 + (float)var12 * this.field1023 + var21 + this.field1030;
               }

               if (arg3.field3403) {
                  int var26 = (int)(var22 - (float)arg3.field3402);
                  if (var26 > 0) {
                     var16 = var26;
                     if (var26 > 255) {
                        var16 = 255;
                     }
                  }

                  int var27 = (int)(var23 - (float)arg3.field3402);
                  if (var27 > 0) {
                     var17 = var27;
                     if (var27 > 255) {
                        var17 = 255;
                     }
                  }

                  int var28 = (int)(var24 - (float)arg3.field3402);
                  if (var28 > 0) {
                     var18 = var28;
                     if (var28 > 255) {
                        var18 = 255;
                     }
                  }

                  int var29 = (int)(var25 - (float)arg3.field3402);
                  if (var29 > 0) {
                     var19 = var29;
                     if (var29 > 255) {
                        var19 = 255;
                     }
                  }
               }

               float var30 = (float)var20 * this.field1028;
               float var31 = (float)var20 * this.field1029;
               if (this.field1018 == -1) {
                  float var32 = (float)var14 * this.field1012 + (float)var12 * this.field1031 + var30 + this.field1010;
                  var33 = (int)((float)this.field1014.field7725 * var32 / var22) + arg4.field8654;
                  float var34 = (float)var14 * this.field1022 + (float)var12 * this.field1011 + var31 + this.field1019;
                  var35 = (int)((float)this.field1014.field7739 * var34 / var22) + arg4.field8647;
                  float var36 = (float)var14 * this.field1012 + (float)var13 * this.field1031 + var30 + this.field1010;
                  var37 = (int)((float)this.field1014.field7725 * var36 / var23) + arg4.field8654;
                  float var38 = (float)var14 * this.field1022 + (float)var13 * this.field1011 + var31 + this.field1019;
                  var39 = (int)((float)this.field1014.field7739 * var38 / var23) + arg4.field8647;
                  float var40 = (float)var15 * this.field1012 + (float)var13 * this.field1031 + var30 + this.field1010;
                  var41 = (int)((float)this.field1014.field7725 * var40 / var24) + arg4.field8654;
                  float var42 = (float)var15 * this.field1022 + (float)var13 * this.field1011 + var31 + this.field1019;
                  var43 = (int)((float)this.field1014.field7739 * var42 / var24) + arg4.field8647;
                  float var44 = (float)var15 * this.field1012 + (float)var12 * this.field1031 + var30 + this.field1010;
                  var45 = (int)((float)this.field1014.field7725 * var44 / var25) + arg4.field8654;
                  float var46 = (float)var15 * this.field1022 + (float)var12 * this.field1011 + var31 + this.field1019;
                  var47 = (int)((float)this.field1014.field7739 * var46 / var25) + arg4.field8647;
               } else {
                  float var48 = (float)var14 * this.field1012 + (float)var12 * this.field1031 + var30 + this.field1010;
                  var33 = (int)((float)this.field1014.field7725 * var48 / (float)this.field1018) + arg4.field8654;
                  float var49 = (float)var14 * this.field1022 + (float)var12 * this.field1011 + var31 + this.field1019;
                  var35 = (int)((float)this.field1014.field7739 * var49 / (float)this.field1018) + arg4.field8647;
                  float var50 = (float)var14 * this.field1012 + (float)var13 * this.field1031 + var30 + this.field1010;
                  var37 = (int)((float)this.field1014.field7725 * var50 / (float)this.field1018) + arg4.field8654;
                  float var51 = (float)var14 * this.field1022 + (float)var13 * this.field1011 + var31 + this.field1019;
                  var39 = (int)((float)this.field1014.field7739 * var51 / (float)this.field1018) + arg4.field8647;
                  float var52 = (float)var15 * this.field1012 + (float)var13 * this.field1031 + var30 + this.field1010;
                  var41 = (int)((float)this.field1014.field7725 * var52 / (float)this.field1018) + arg4.field8654;
                  float var53 = (float)var15 * this.field1022 + (float)var13 * this.field1011 + var31 + this.field1019;
                  var43 = (int)((float)this.field1014.field7739 * var53 / (float)this.field1018) + arg4.field8647;
                  float var54 = (float)var15 * this.field1012 + (float)var12 * this.field1031 + var30 + this.field1010;
                  var45 = (int)((float)this.field1014.field7725 * var54 / (float)this.field1018) + arg4.field8654;
                  float var55 = (float)var15 * this.field1022 + (float)var12 * this.field1011 + var31 + this.field1019;
                  var47 = (int)((float)this.field1014.field7739 * var55 / (float)this.field1018) + arg4.field8647;
               }
            } else {
               int var56 = super.field4082[arg0][arg1];
               int var57 = super.field4082[arg0 + 1][arg1];
               int var58 = super.field4082[arg0 + 1][arg1 + 1];
               int var59 = super.field4082[arg0][arg1 + 1];
               if (this.field1018 == -1) {
                  var22 = (float)var14 * this.field1024 + (float)var12 * this.field1023 + (float)var56 * this.field1015 + this.field1030;
                  if (var22 <= (float)this.field1014.field7741) {
                     return;
                  }

                  var23 = (float)var14 * this.field1024 + (float)var13 * this.field1023 + (float)var57 * this.field1015 + this.field1030;
                  if (var23 <= (float)this.field1014.field7741) {
                     return;
                  }

                  var24 = (float)var15 * this.field1024 + (float)var13 * this.field1023 + (float)var58 * this.field1015 + this.field1030;
                  if (var24 <= (float)this.field1014.field7741) {
                     return;
                  }

                  var25 = (float)var15 * this.field1024 + (float)var12 * this.field1023 + (float)var59 * this.field1015 + this.field1030;
                  if (var25 <= (float)this.field1014.field7741) {
                     return;
                  }
               } else {
                  var22 = (float)var14 * this.field1024 + (float)var12 * this.field1023 + (float)var56 * this.field1015 + this.field1030;
                  var23 = (float)var14 * this.field1024 + (float)var13 * this.field1023 + (float)var57 * this.field1015 + this.field1030;
                  var24 = (float)var15 * this.field1024 + (float)var13 * this.field1023 + (float)var58 * this.field1015 + this.field1030;
                  var25 = (float)var15 * this.field1024 + (float)var12 * this.field1023 + (float)var59 * this.field1015 + this.field1030;
               }

               if (arg2) {
                  int var60 = (int)(var22 - (float)arg3.field3402);
                  if (var60 > 255) {
                     var60 = 255;
                  }

                  if (var60 > 0) {
                     var16 = var60;
                     int var61 = var11.field2963 * var60 / 255;
                     if (var61 > 0) {
                        var56 -= var61;
                     }
                  }

                  int var62 = (int)(var23 - (float)arg3.field3402);
                  if (var62 > 255) {
                     var62 = 255;
                  }

                  if (var62 > 0) {
                     var17 = var62;
                     int var63 = var11.field2968 * var62 / 255;
                     if (var63 > 0) {
                        var57 -= var63;
                     }
                  }

                  int var64 = (int)(var24 - (float)arg3.field3402);
                  if (var64 > 255) {
                     var64 = 255;
                  }

                  if (var64 > 0) {
                     var18 = var64;
                     int var65 = var11.field2962 * var64 / 255;
                     if (var65 > 0) {
                        var58 -= var65;
                     }
                  }

                  int var66 = (int)(var25 - (float)arg3.field3402);
                  if (var66 > 255) {
                     var66 = 255;
                  }

                  if (var66 > 0) {
                     var19 = var66;
                     int var67 = var11.field2965 * var66 / 255;
                     if (var67 > 0) {
                        var59 -= var67;
                     }
                  }
               } else if (arg3.field3403) {
                  int var68 = (int)(var22 - (float)arg3.field3402);
                  if (var68 > 0) {
                     var16 = var68;
                     if (var68 > 255) {
                        var16 = 255;
                     }
                  }

                  int var69 = (int)(var23 - (float)arg3.field3402);
                  if (var69 > 0) {
                     var17 = var69;
                     if (var69 > 255) {
                        var17 = 255;
                     }
                  }

                  int var70 = (int)(var24 - (float)arg3.field3402);
                  if (var70 > 0) {
                     var18 = var70;
                     if (var70 > 255) {
                        var18 = 255;
                     }
                  }

                  int var71 = (int)(var25 - (float)arg3.field3402);
                  if (var71 > 0) {
                     var19 = var71;
                     if (var71 > 255) {
                        var19 = 255;
                     }
                  }
               }

               if (this.field1018 == -1) {
                  float var72 = (float)var14 * this.field1012 + (float)var12 * this.field1031 + (float)var56 * this.field1028 + this.field1010;
                  var33 = (int)((float)this.field1014.field7725 * var72 / var22) + arg4.field8654;
                  float var73 = (float)var14 * this.field1022 + (float)var12 * this.field1011 + (float)var56 * this.field1029 + this.field1019;
                  var35 = (int)((float)this.field1014.field7739 * var73 / var22) + arg4.field8647;
                  float var74 = (float)var14 * this.field1012 + (float)var13 * this.field1031 + (float)var57 * this.field1028 + this.field1010;
                  var37 = (int)((float)this.field1014.field7725 * var74 / var23) + arg4.field8654;
                  float var75 = (float)var14 * this.field1022 + (float)var13 * this.field1011 + (float)var57 * this.field1029 + this.field1019;
                  var39 = (int)((float)this.field1014.field7739 * var75 / var23) + arg4.field8647;
                  float var76 = (float)var15 * this.field1012 + (float)var13 * this.field1031 + (float)var58 * this.field1028 + this.field1010;
                  var41 = (int)((float)this.field1014.field7725 * var76 / var24) + arg4.field8654;
                  float var77 = (float)var15 * this.field1022 + (float)var13 * this.field1011 + (float)var58 * this.field1029 + this.field1019;
                  var43 = (int)((float)this.field1014.field7739 * var77 / var24) + arg4.field8647;
                  float var78 = (float)var15 * this.field1012 + (float)var12 * this.field1031 + (float)var59 * this.field1028 + this.field1010;
                  var45 = (int)((float)this.field1014.field7725 * var78 / var25) + arg4.field8654;
                  float var79 = (float)var15 * this.field1022 + (float)var12 * this.field1011 + (float)var59 * this.field1029 + this.field1019;
                  var47 = (int)((float)this.field1014.field7739 * var79 / var25) + arg4.field8647;
               } else {
                  float var80 = (float)var14 * this.field1012 + (float)var12 * this.field1031 + (float)var56 * this.field1028 + this.field1010;
                  var33 = (int)((float)this.field1014.field7725 * var80 / (float)this.field1018) + arg4.field8654;
                  float var81 = (float)var14 * this.field1022 + (float)var12 * this.field1011 + (float)var56 * this.field1029 + this.field1019;
                  var35 = (int)((float)this.field1014.field7739 * var81 / (float)this.field1018) + arg4.field8647;
                  float var82 = (float)var14 * this.field1012 + (float)var13 * this.field1031 + (float)var57 * this.field1028 + this.field1010;
                  var37 = (int)((float)this.field1014.field7725 * var82 / (float)this.field1018) + arg4.field8654;
                  float var83 = (float)var14 * this.field1022 + (float)var13 * this.field1011 + (float)var57 * this.field1029 + this.field1019;
                  var39 = (int)((float)this.field1014.field7739 * var83 / (float)this.field1018) + arg4.field8647;
                  float var84 = (float)var15 * this.field1012 + (float)var13 * this.field1031 + (float)var58 * this.field1028 + this.field1010;
                  var41 = (int)((float)this.field1014.field7725 * var84 / (float)this.field1018) + arg4.field8654;
                  float var85 = (float)var15 * this.field1022 + (float)var13 * this.field1011 + (float)var58 * this.field1029 + this.field1019;
                  var43 = (int)((float)this.field1014.field7739 * var85 / (float)this.field1018) + arg4.field8647;
                  float var86 = (float)var15 * this.field1012 + (float)var12 * this.field1031 + (float)var59 * this.field1028 + this.field1010;
                  var45 = (int)((float)this.field1014.field7725 * var86 / (float)this.field1018) + arg4.field8654;
                  float var87 = (float)var15 * this.field1022 + (float)var12 * this.field1011 + (float)var59 * this.field1029 + this.field1019;
                  var47 = (int)((float)this.field1014.field7739 * var87 / (float)this.field1018) + arg4.field8647;
               }
            }

            boolean var88 = var11.field2966 != -1 && this.method773(this.field1014.field813.method1159(var11.field2966, 123).field4655);
            if (this.field1018 == -1) {
               int var89 = var17 + var18 + var19;
               if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                  arg4.field8662 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field8649 || var45 > arg4.field8649 || var37 > arg4.field8649;
                  if (var89 < 765) {
                     if (var89 > 0) {
                        if (var11.field2966 >= 0) {
                           int var90 = -16777216;
                           if (var88) {
                              var90 = -1694498816;
                           }

                           arg4.method4317((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field2967 & 16777215, var90 | var11.field2971 & 16777215, var90 | var11.field2969 & 16777215, arg3.field3395, var18, var19, var17, var11.field2966);
                        } else {
                           if (var88) {
                              arg4.field8650 = 100;
                           }

                           arg4.method4322((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), class599.method4382(125, var11.field2967, var18 << 24 | arg3.field3395), class599.method4382(-112, var11.field2971, var19 << 24 | arg3.field3395), class599.method4382(-108, var11.field2969, var17 << 24 | arg3.field3395));
                           arg4.field8650 = 0;
                        }
                     } else if (var11.field2966 >= 0) {
                        int var91 = -16777216;
                        if (var88) {
                           var91 = -1694498816;
                        }

                        arg4.method4317((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field2967 & 16777215, var91 | var11.field2971 & 16777215, var91 | var11.field2969 & 16777215, 0, 0, 0, 0, var11.field2966);
                     } else {
                        if (var88) {
                           arg4.field8650 = 100;
                        }

                        arg4.method4322((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), var11.field2967, var11.field2971, var11.field2969);
                        arg4.field8650 = 0;
                     }
                  } else {
                     arg4.method4307((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), arg3.field3395);
                  }
               }

               int var92 = var16 + var17 + var19;
               if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                  arg4.field8662 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field8649 || var37 > arg4.field8649 || var45 > arg4.field8649;
                  if (var92 < 765) {
                     if (var88) {
                        arg4.field8650 = -1694498816;
                     }

                     if (var92 > 0) {
                        if (var11.field2966 >= 0) {
                           int var93 = -16777216;
                           if (var88) {
                              var93 = -1694498816;
                           }

                           arg4.method4317((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field2961 & 16777215, var93 | var11.field2969 & 16777215, var93 | var11.field2971 & 16777215, arg3.field3395, var16, var17, var19, var11.field2966);
                           return;
                        }

                        if (var88) {
                           arg4.field8650 = 100;
                        }

                        arg4.method4322((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), class599.method4382(93, var11.field2961, var16 << 24 | arg3.field3395), class599.method4382(-62, var11.field2969, var17 << 24 | arg3.field3395), class599.method4382(66, var11.field2971, var19 << 24 | arg3.field3395));
                        arg4.field8650 = 0;
                        return;
                     }

                     if (var11.field2966 >= 0) {
                        int var94 = -16777216;
                        if (var88) {
                           var94 = -1694498816;
                        }

                        arg4.method4317((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field2961 & 16777215, var94 | var11.field2969 & 16777215, var94 | var11.field2971 & 16777215, 0, 0, 0, 0, var11.field2966);
                        return;
                     }

                     if (var88) {
                        arg4.field8650 = 100;
                     }

                     arg4.method4322((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), var11.field2961, var11.field2969, var11.field2971);
                     arg4.field8650 = 0;
                     return;
                  }

                  arg4.method4307((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), arg3.field3395);
                  return;
               }
            } else {
               int var95 = var17 + var18 + var19;
               if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                  arg4.field8662 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field8649 || var45 > arg4.field8649 || var37 > arg4.field8649;
                  if (var95 < 765) {
                     if (var88) {
                        arg4.field8650 = -1694498816;
                     }

                     if (var95 > 0) {
                        if (var11.field2966 >= 0) {
                           int var96 = -16777216;
                           if (var88) {
                              var96 = -1694498816;
                           }

                           arg4.method4317((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field2967 & 16777215, var96 | var11.field2971 & 16777215, var96 | var11.field2969 & 16777215, arg3.field3395, var18, var19, var17, var11.field2966);
                        } else {
                           if (var88) {
                              arg4.field8650 = 100;
                           }

                           arg4.method4322((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), class599.method4382(-127, var11.field2967, var18 << 24 | arg3.field3395), class599.method4382(103, var11.field2971, var19 << 24 | arg3.field3395), class599.method4382(96, var11.field2969, var17 << 24 | arg3.field3395));
                           arg4.field8650 = 0;
                        }
                     } else if (var11.field2966 >= 0) {
                        int var97 = -16777216;
                        if (var88) {
                           var97 = -1694498816;
                        }

                        arg4.method4317((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field2967 & 16777215, var97 | var11.field2971 & 16777215, var97 | var11.field2969 & 16777215, 0, 0, 0, 0, var11.field2966);
                     } else {
                        if (var88) {
                           arg4.field8650 = 100;
                        }

                        arg4.method4322((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), var11.field2967, var11.field2971, var11.field2969);
                        arg4.field8650 = 0;
                     }
                  } else {
                     arg4.method4307((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), arg3.field3395);
                  }
               }

               int var98 = var16 + var17 + var19;
               if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                  arg4.field8662 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field8649 || var37 > arg4.field8649 || var45 > arg4.field8649;
                  if (var98 < 765) {
                     if (var88) {
                        arg4.field8650 = -1694498816;
                     }

                     if (var98 > 0) {
                        if (var11.field2966 >= 0) {
                           int var99 = -16777216;
                           if (var88) {
                              var99 = -1694498816;
                           }

                           arg4.method4317((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field2961 & 16777215, var99 | var11.field2969 & 16777215, var99 | var11.field2971 & 16777215, arg3.field3395, var16, var17, var19, var11.field2966);
                           return;
                        }

                        if (var88) {
                           arg4.field8650 = 100;
                        }

                        arg4.method4322((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), class599.method4382(92, var11.field2961, var16 << 24 | arg3.field3395), class599.method4382(77, var11.field2969, var17 << 24 | arg3.field3395), class599.method4382(-80, var11.field2971, var19 << 24 | arg3.field3395));
                        arg4.field8650 = 0;
                        return;
                     }

                     if (var11.field2966 >= 0) {
                        int var100 = -16777216;
                        if (var88) {
                           var100 = -1694498816;
                        }

                        arg4.method4317((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field2961 & 16777215, var100 | var11.field2969 & 16777215, var100 | var11.field2971 & 16777215, 0, 0, 0, 0, var11.field2966);
                        return;
                     }

                     if (var88) {
                        arg4.field8650 = 100;
                     }

                     arg4.method4322((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), var11.field2961, var11.field2969, var11.field2971);
                     arg4.field8650 = 0;
                     return;
                  }

                  arg4.method4307((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), arg3.field3395);
               }
            }

         }
      } else {
         class771 var101 = this.field1026[arg0][arg1];
         if (var101 != null) {
            if (arg9 != 0) {
               if ((var101.field11299 & 4) != 0) {
                  if ((arg9 & 1) != 0) {
                     return;
                  }
               } else if ((arg9 & 2) != 0) {
                  return;
               }
            }

            if (this.field1018 == -1) {
               for(int var102 = 0; var102 < var101.field11308; ++var102) {
                  int var103 = (arg0 << super.field4086) + var101.field11304[var102];
                  int var104 = var101.field11301[var102];
                  int var105 = (arg1 << super.field4086) + var101.field11309[var102];
                  float var106 = (float)var105 * this.field1024 + (float)var103 * this.field1023 + (float)var104 * this.field1015 + this.field1030;
                  if (var106 <= (float)this.field1014.field7741) {
                     return;
                  }

                  arg8[var102] = 0;
                  if (arg2) {
                     int var107 = (int)(var106 - (float)arg3.field3402);
                     if (var107 > 255) {
                        var107 = 255;
                     }

                     if (var107 > 0) {
                        arg8[var102] = var107;
                        int var108 = var101.field11307[var102] * var107 / 255;
                        if (var108 > 0) {
                           var104 -= var108;
                        }
                     }
                  } else if (arg3.field3403) {
                     int var109 = (int)(var106 - (float)arg3.field3402);
                     if (var109 > 0) {
                        arg8[var102] = var109;
                        if (arg8[var102] > 255) {
                           arg8[var102] = 255;
                        }
                     }
                  }

                  float var110 = (float)var105 * this.field1012 + (float)var103 * this.field1031 + (float)var104 * this.field1028 + this.field1010;
                  float var111 = (float)var105 * this.field1022 + (float)var103 * this.field1011 + (float)var104 * this.field1029 + this.field1019;
                  arg5[var102] = (int)((float)this.field1014.field7725 * var110 / var106) + arg4.field8654;
                  arg6[var102] = (int)((float)this.field1014.field7739 * var111 / var106) + arg4.field8647;
                  arg7[var102] = (int)var106;
               }
            } else {
               for(int var112 = 0; var112 < var101.field11308; ++var112) {
                  int var152 = (arg0 << super.field4086) + var101.field11304[var112];
                  int var153 = var101.field11301[var112];
                  int var154 = (arg1 << super.field4086) + var101.field11309[var112];
                  float var155 = (float)var154 * this.field1024 + (float)var152 * this.field1023 + (float)var153 * this.field1015 + this.field1030;
                  arg8[var112] = 0;
                  if (arg2) {
                     int var156 = this.field1018 - arg3.field3402;
                     if (var156 > 255) {
                        var156 = 255;
                     }

                     if (var156 > 0) {
                        arg8[var112] = var156;
                        int var157 = var101.field11307[var112] * var156 / 255;
                        if (var157 > 0) {
                           var153 -= var157;
                        }
                     }
                  } else if (arg3.field3403) {
                     int var158 = this.field1018 - arg3.field3402;
                     if (var158 > 0) {
                        arg8[var112] = var158;
                        if (arg8[var112] > 255) {
                           arg8[var112] = 255;
                        }
                     }
                  }

                  float var159 = (float)var154 * this.field1012 + (float)var152 * this.field1031 + (float)var153 * this.field1028 + this.field1010;
                  float var160 = (float)var154 * this.field1022 + (float)var152 * this.field1011 + (float)var153 * this.field1029 + this.field1019;
                  arg5[var112] = (int)((float)this.field1014.field7725 * var159 / (float)this.field1018) + arg4.field8654;
                  arg6[var112] = (int)((float)this.field1014.field7739 * var160 / (float)this.field1018) + arg4.field8647;
                  arg7[var112] = (int)var155;
               }
            }

            if (var101.field11306 != null) {
               if (this.field1018 == -1) {
                  for(int var113 = 0; var113 < var101.field11305; ++var113) {
                     int var114 = var113 * 3;
                     int var115 = var114 + 1;
                     int var116 = var115 + 1;
                     int var117 = arg5[var114];
                     int var118 = arg5[var115];
                     int var119 = arg5[var116];
                     int var120 = arg6[var114];
                     int var121 = arg6[var115];
                     int var122 = arg6[var116];
                     int var123 = arg8[var114] + arg8[var115] + arg8[var116];
                     if ((var117 - var118) * (var122 - var121) - (var119 - var118) * (var120 - var121) > 0) {
                        arg4.field8662 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field8649 || var118 > arg4.field8649 || var119 > arg4.field8649;
                        short var124 = var101.field11306[var113];
                        if (var123 < 765) {
                           if (var123 > 0) {
                              if (var124 != -1) {
                                 int var125 = -16777216;
                                 if (var124 != -1 && this.method773(this.field1014.field813.method1159(var124, 122).field4655)) {
                                    var125 = -1694498816;
                                 }

                                 arg4.method4317((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], (float)var101.field11304[var114] / (float)super.field4080, (float)var101.field11304[var115] / (float)super.field4080, (float)var101.field11304[var116] / (float)super.field4080, (float)var101.field11309[var114] / (float)super.field4080, (float)var101.field11309[var115] / (float)super.field4080, (float)var101.field11309[var116] / (float)super.field4080, var125 | var101.field11302[var114] & 16777215, var125 | var101.field11302[var115] & 16777215, var125 | var101.field11302[var116] & 16777215, arg3.field3395, arg8[var114], arg8[var115], arg8[var116], var124);
                              } else if ((var101.field11302[var114] & 16777215) != 0) {
                                 if (var124 != -1 && this.method773(this.field1014.field813.method1159(var124, 127).field4655)) {
                                    arg4.field8650 = -1694498816;
                                 }

                                 arg4.method4322((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], class599.method4382(73, var101.field11302[var114], arg8[var114] << 24 | arg3.field3395), class599.method4382(94, var101.field11302[var115], arg8[var115] << 24 | arg3.field3395), class599.method4382(-106, var101.field11302[var116], arg8[var116] << 24 | arg3.field3395));
                                 arg4.field8650 = 0;
                              }
                           } else if (var124 != -1) {
                              int var126 = -16777216;
                              if (var124 != -1 && this.method773(this.field1014.field813.method1159(var124, 124).field4655)) {
                                 var126 = -1694498816;
                              }

                              arg4.method4317((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], (float)var101.field11304[var114] / (float)super.field4080, (float)var101.field11304[var115] / (float)super.field4080, (float)var101.field11304[var116] / (float)super.field4080, (float)var101.field11309[var114] / (float)super.field4080, (float)var101.field11309[var115] / (float)super.field4080, (float)var101.field11309[var116] / (float)super.field4080, var126 | var101.field11302[var114] & 16777215, var126 | var101.field11302[var115] & 16777215, var126 | var101.field11302[var116] & 16777215, 0, 0, 0, 0, var124);
                           } else if ((var101.field11302[var114] & 16777215) != 0) {
                              if (var124 != -1 && this.method773(this.field1014.field813.method1159(var124, 127).field4655)) {
                                 arg4.field8650 = -1694498816;
                              }

                              arg4.method4322((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], var101.field11302[var114], var101.field11302[var115], var101.field11302[var116]);
                              arg4.field8650 = 0;
                           }
                        } else {
                           arg4.method4307((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], arg3.field3395);
                        }
                     }
                  }

                  return;
               }

               for(int var127 = 0; var127 < var101.field11305; ++var127) {
                  int var128 = var127 * 3;
                  int var129 = var128 + 1;
                  int var130 = var129 + 1;
                  int var131 = arg5[var128];
                  int var132 = arg5[var129];
                  int var133 = arg5[var130];
                  int var134 = arg6[var128];
                  int var135 = arg6[var129];
                  int var136 = arg6[var130];
                  int var137 = arg8[var128] + arg8[var129] + arg8[var130];
                  if ((var131 - var132) * (var136 - var135) - (var133 - var132) * (var134 - var135) > 0) {
                     arg4.field8662 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field8649 || var132 > arg4.field8649 || var133 > arg4.field8649;
                     short var138 = var101.field11306[var127];
                     if (var137 < 765) {
                        if (var138 != -1 && this.method773(this.field1014.field813.method1159(var138, 126).field4655)) {
                           arg4.field8650 = -1694498816;
                        }

                        if (var137 > 0) {
                           if (var138 != -1) {
                              int var139 = -16777216;
                              if (var138 != -1 && this.method773(this.field1014.field813.method1159(var138, 124).field4655)) {
                                 var139 = -1694498816;
                              }

                              arg4.method4317((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], (float)var101.field11304[var128] / (float)super.field4080, (float)var101.field11304[var129] / (float)super.field4080, (float)var101.field11304[var130] / (float)super.field4080, (float)var101.field11309[var128] / (float)super.field4080, (float)var101.field11309[var129] / (float)super.field4080, (float)var101.field11309[var130] / (float)super.field4080, var139 | var101.field11302[var128] & 16777215, var139 | var101.field11302[var129] & 16777215, var139 | var101.field11302[var130] & 16777215, arg3.field3395, arg8[var128], arg8[var129], arg8[var130], var138);
                           } else if ((var101.field11302[var128] & 16777215) != 0) {
                              if (var138 != -1 && this.method773(this.field1014.field813.method1159(var138, 125).field4655)) {
                                 arg4.field8650 = -1694498816;
                              }

                              arg4.method4322((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], class599.method4382(-83, var101.field11302[var128], arg8[var128] << 24 | arg3.field3395), class599.method4382(-126, var101.field11302[var129], arg8[var129] << 24 | arg3.field3395), class599.method4382(-69, var101.field11302[var130], arg8[var130] << 24 | arg3.field3395));
                              arg4.field8650 = 0;
                           }
                        } else if (var138 != -1) {
                           int var140 = -16777216;
                           if (var138 != -1 && this.method773(this.field1014.field813.method1159(var138, 127).field4655)) {
                              var140 = -1694498816;
                           }

                           arg4.method4317((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], (float)var101.field11304[var128] / (float)super.field4080, (float)var101.field11304[var129] / (float)super.field4080, (float)var101.field11304[var130] / (float)super.field4080, (float)var101.field11309[var128] / (float)super.field4080, (float)var101.field11309[var129] / (float)super.field4080, (float)var101.field11309[var130] / (float)super.field4080, var140 | var101.field11302[var128] & 16777215, var140 | var101.field11302[var129] & 16777215, var140 | var101.field11302[var130] & 16777215, 0, 0, 0, 0, var138);
                        } else if ((var101.field11302[var128] & 16777215) != 0) {
                           if (var138 != -1 && this.method773(this.field1014.field813.method1159(var138, 126).field4655)) {
                              arg4.field8650 = -1694498816;
                           }

                           arg4.method4322((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], var101.field11302[var128], var101.field11302[var129], var101.field11302[var130]);
                           arg4.field8650 = 0;
                        }

                        arg4.field8650 = 0;
                     } else {
                        arg4.method4307((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], arg3.field3395);
                     }
                  }
               }

               return;
            }

            for(int var141 = 0; var141 < var101.field11305; ++var141) {
               int var142 = var141 * 3;
               int var143 = var142 + 1;
               int var144 = var143 + 1;
               int var145 = arg5[var142];
               int var146 = arg5[var143];
               int var147 = arg5[var144];
               int var148 = arg6[var142];
               int var149 = arg6[var143];
               int var150 = arg6[var144];
               int var151 = arg8[var142] + arg8[var143] + arg8[var144];
               if ((var145 - var146) * (var150 - var149) - (var147 - var146) * (var148 - var149) > 0) {
                  arg4.field8662 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field8649 || var146 > arg4.field8649 || var147 > arg4.field8649;
                  if (var151 < 765) {
                     if (var151 > 0) {
                        if ((var101.field11302[var142] & 16777215) != 0) {
                           arg4.method4322((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], class635.method4575(var101.field11302[var142], arg8[var142], arg3.field3395, (byte)55), class635.method4575(var101.field11302[var143], arg8[var143], arg3.field3395, (byte)86), class635.method4575(var101.field11302[var144], arg8[var144], arg3.field3395, (byte)37));
                        }
                     } else if ((var101.field11302[var142] & 16777215) != 0) {
                        arg4.method4322((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], var101.field11302[var142], var101.field11302[var143], var101.field11302[var144]);
                     }
                  } else {
                     arg4.method4307((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], arg3.field3395);
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "b",
      descriptor = "(I)Z",
      line = 1190
   )
   private final boolean method773(int arg0) {
      if ((this.field1027 & 8) == 0) {
         return false;
      } else if (arg0 == 4) {
         return true;
      } else if (arg0 == 8) {
         return true;
      } else {
         return arg0 == 9;
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "b",
      descriptor = "(IIIIIII[[ZLig;Lpo;[I[I)V",
      line = 1208
   )
   private final void method774(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class255 arg8, class584 arg9, int[] arg10, int[] arg11) {
      int var13 = (arg6 - arg4) * arg2 / 256;
      int var14 = arg2 >> 8;
      boolean var15 = arg8.field3400;
      this.field1014.method622(false);
      arg9.field8657 = false;
      arg9.field8659 = false;
      int var16 = arg0;
      int var17 = arg1 + var13;

      for(int var18 = arg3; var18 < arg5; ++var18) {
         for(int var19 = arg4; var19 < arg6; ++var19) {
            if (arg7[var18 - arg3][var19 - arg4]) {
               if (this.field1025[var18][var19] != null) {
                  class341 var20 = this.field1025[var18][var19];
                  if (var20.field5165 != -1 && (var20.field5166 & 2) == 0 && var20.field5169 == -1) {
                     int var21 = this.field1014.method3938(var20.field5165);
                     arg9.method4314((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)class70.method698(-128, var20.field5167 & 65535, var21), (float)class70.method698(-126, var20.field5168 & 65535, var21), (float)class70.method698(-125, var20.field5163 & 65535, var21));
                     arg9.method4314((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)class70.method698(-126, var20.field5164 & 65535, var21), (float)class70.method698(-122, var20.field5163 & 65535, var21), (float)class70.method698(-124, var20.field5168 & 65535, var21));
                  } else if (var20.field5169 == -1) {
                     arg9.method4314((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)(var20.field5167 & 65535), (float)(var20.field5168 & 65535), (float)(var20.field5163 & 65535));
                     arg9.method4314((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)(var20.field5164 & 65535), (float)(var20.field5163 & 65535), (float)(var20.field5168 & 65535));
                  } else {
                     int var22 = var20.field5169;
                     arg9.method4314((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)var22, (float)var22, (float)var22);
                     arg9.method4314((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)var22, (float)var22, (float)var22);
                  }
               } else if (this.field1020[var18][var19] != null) {
                  class342 var23 = this.field1020[var18][var19];

                  for(int var24 = 0; var24 < var23.field5181; ++var24) {
                     arg10[var24] = var23.field5183[var24] * var14 / super.field4080 + var16;
                     arg11[var24] = var17 - var23.field5177[var24] * var14 / super.field4080;
                  }

                  for(int var25 = 0; var25 < var23.field5176; ++var25) {
                     short var26 = var23.field5180[var25];
                     short var27 = var23.field5173[var25];
                     short var28 = var23.field5175[var25];
                     int var29 = arg10[var26];
                     int var30 = arg10[var27];
                     int var31 = arg10[var28];
                     int var32 = arg11[var26];
                     int var33 = arg11[var27];
                     int var34 = arg11[var28];
                     if (var23.field5182 != null && var23.field5182[var25] != -1) {
                        int var35 = var23.field5182[var25];
                        arg9.method4314((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class70.method698(-122, var23.field5174[var26], var35), (float)class70.method698(-125, var23.field5174[var27], var35), (float)class70.method698(-126, var23.field5174[var28], var35));
                     } else if (var23.field5178 != null && var23.field5178[var25] != -1) {
                        int var36 = this.field1014.method3938(var23.field5178[var25]);
                        arg9.method4314((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class70.method698(-122, var23.field5174[var26], var36), (float)class70.method698(-124, var23.field5174[var27], var36), (float)class70.method698(-124, var23.field5174[var28], var36));
                     } else {
                        int var37 = var23.field5179[var25];
                        arg9.method4314((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class70.method698(-128, var23.field5174[var26], var37), (float)class70.method698(-126, var23.field5174[var27], var37), (float)class70.method698(-125, var23.field5174[var28], var37));
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = arg1 + var13;
         var16 += var14;
      }

      arg9.field8657 = true;
      this.field1014.method622(var15);
   }

   @OriginalMember(
      owner = "client!qw",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V",
      line = 1345
   )
   public final void method775(class193 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(Llja;[I)V",
      line = 1350
   )
   public final void method776(class744 arg0, int[] arg1) {
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V",
      line = 1354
   )
   public final void method777(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
      if (this.field1025 == null) {
         this.field1025 = new class341[super.field4087][super.field4081];
         this.field1020 = new class342[super.field4087][super.field4081];
      } else if (this.field1016 != null || this.field1021 != null) {
         throw new IllegalStateException();
      }

      boolean var18 = false;
      if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
         var18 = true;

         for(int var19 = 1; var19 < 2; ++var19) {
            int var20 = arg2[arg6[var19]];
            int var21 = arg4[arg6[var19]];
            if (var20 != 0 && super.field4080 != var20 || var21 != 0 && super.field4080 != var21) {
               var18 = false;
               break;
            }
         }
      }

      if (!var18) {
         class342 var22 = new class342();
         short var23 = (short)arg2.length;
         short var24 = (short)arg9.length;
         var22.field5181 = var23;
         var22.field5174 = new short[var23];
         var22.field5183 = new short[var23];
         var22.field5170 = new short[var23];
         var22.field5177 = new short[var23];

         for(int var25 = 0; var25 < var23; ++var25) {
            int var32 = arg2[var25];
            int var33 = arg4[var25];
            if (var32 == 0 && var33 == 0) {
               var22.field5174[var25] = (short)(this.field1013[arg0][arg1] - this.field1017[arg0][arg1]);
            } else if (var32 == 0 && super.field4080 == var33) {
               var22.field5174[var25] = (short)(this.field1013[arg0][arg1 + 1] - this.field1017[arg0][arg1 + 1]);
            } else if (super.field4080 == var32 && super.field4080 == var33) {
               var22.field5174[var25] = (short)(this.field1013[arg0 + 1][arg1 + 1] - this.field1017[arg0 + 1][arg1 + 1]);
            } else if (super.field4080 == var32 && var33 == 0) {
               var22.field5174[var25] = (short)(this.field1013[arg0 + 1][arg1] - this.field1017[arg0 + 1][arg1]);
            } else {
               int var34 = (this.field1013[arg0 + 1][arg1] - this.field1017[arg0 + 1][arg1]) * var32 + (this.field1013[arg0][arg1] - this.field1017[arg0][arg1]) * (super.field4080 - var32);
               int var35 = (this.field1013[arg0 + 1][arg1 + 1] - this.field1017[arg0 + 1][arg1 + 1]) * var32 + (this.field1013[arg0][arg1 + 1] - this.field1017[arg0][arg1 + 1]) * (super.field4080 - var32);
               var22.field5174[var25] = (short)((super.field4080 - var33) * var34 + var33 * var35 >> super.field4086 * 2);
            }

            int var36 = (arg0 << super.field4086) + var32;
            int var37 = (arg1 << super.field4086) + var33;
            var22.field5183[var25] = (short)var32;
            var22.field5177[var25] = (short)var33;
            var22.field5170[var25] = (short)(this.method2236((byte)113, var36, var37) + (arg3 != null ? arg3[var25] : 0));
            if (var22.field5174[var25] < 2) {
               var22.field5174[var25] = 2;
            }
         }

         boolean var26 = false;
         int var27 = 0;

         for(int var28 = 0; var28 < var24; ++var28) {
            if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
               ++var27;
            }

            int var30 = arg11[var28];
            if (var30 != -1) {
               class327 var31 = this.field1014.field813.method1159(var30, 122);
               if (!var31.field4649) {
                  var26 = true;
                  if (this.method773(var31.field4655) || var31.field4654 != 0 || var31.field4656 != 0) {
                     var22.field5172 = (byte)(var22.field5172 | 4);
                  }
               }
            }
         }

         var22.field5179 = new int[var27];
         if (arg10 != null) {
            var22.field5182 = new int[var27];
         }

         var22.field5180 = new short[var27];
         var22.field5173 = new short[var27];
         var22.field5175 = new short[var27];
         if (var26) {
            var22.field5178 = new short[var27];
            var22.field5171 = new short[var27];
         }

         for(int var29 = 0; var29 < var24; ++var29) {
            if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
               if (arg9[var29] >= 0) {
                  var22.field5179[var22.field5176] = class562.method4163(-126, arg9[var29]);
               } else {
                  var22.field5179[var22.field5176] = -1;
               }

               if (arg10 != null) {
                  if (arg10[var29] != -1) {
                     var22.field5182[var22.field5176] = class562.method4163(-125, arg10[var29]);
                  } else {
                     var22.field5182[var22.field5176] = -1;
                  }
               }

               var22.field5180[var22.field5176] = (short)arg6[var29];
               var22.field5173[var22.field5176] = (short)arg7[var29];
               var22.field5175[var22.field5176] = (short)arg8[var29];
               if (var26) {
                  if (arg11[var29] != -1 && !this.field1014.field813.method1159(arg11[var29], 122).field4649) {
                     var22.field5178[var22.field5176] = (short)arg11[var29];
                     var22.field5171[var22.field5176] = (short)arg12[var29];
                  } else {
                     var22.field5178[var22.field5176] = -1;
                  }
               }

               ++var22.field5176;
            }
         }

         this.field1020[arg0][arg1] = var22;
      } else {
         if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
            class341 var38 = new class341();
            int var39 = arg9[0];
            int var40 = arg11[0];
            if (arg10 != null) {
               var38.field5169 = class70.method698(-128, this.field1013[arg0][arg1] - this.field1017[arg0][arg1], class562.method4163(-128, arg10[0]));
               if (var39 == -1) {
                  var38.field5166 = (byte)(var38.field5166 | 2);
               }
            }

            if (super.field4082[arg0 + 1][arg1] == super.field4082[arg0][arg1] && super.field4082[arg0 + 1][arg1 + 1] == super.field4082[arg0][arg1] && super.field4082[arg0][arg1 + 1] == super.field4082[arg0][arg1]) {
               var38.field5166 = (byte)(var38.field5166 | 1);
            }

            class327 var41 = null;
            if (var40 != -1) {
               var41 = this.field1014.field813.method1159(var40, 127);
            }

            if (var41 != null && (var38.field5166 & 2) == 0 && !var41.field4649) {
               var38.field5164 = (short)(this.field1013[arg0][arg1] - this.field1017[arg0][arg1]);
               var38.field5163 = (short)(this.field1013[arg0 + 1][arg1] - this.field1017[arg0 + 1][arg1]);
               var38.field5167 = (short)(this.field1013[arg0 + 1][arg1 + 1] - this.field1017[arg0 + 1][arg1 + 1]);
               var38.field5168 = (short)(this.field1013[arg0][arg1 + 1] - this.field1017[arg0][arg1 + 1]);
               var38.field5165 = (short)var40;
               if (this.method773(var41.field4655) || var41.field4654 != 0 || var41.field4656 != 0) {
                  var38.field5166 = (byte)(var38.field5166 | 4);
               }
            } else {
               short var42 = class562.method4163(-122, var39);
               var38.field5164 = (short)class70.method698(-124, this.field1013[arg0][arg1] - this.field1017[arg0][arg1], var42);
               var38.field5163 = (short)class70.method698(-128, this.field1013[arg0 + 1][arg1] - this.field1017[arg0 + 1][arg1], var42);
               var38.field5167 = (short)class70.method698(-127, this.field1013[arg0 + 1][arg1 + 1] - this.field1017[arg0 + 1][arg1 + 1], var42);
               var38.field5168 = (short)class70.method698(-125, this.field1013[arg0][arg1 + 1] - this.field1017[arg0][arg1 + 1], var42);
               var38.field5165 = -1;
            }

            this.field1025[arg0][arg1] = var38;
         }

      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(IIIIIII[[Z)V",
      line = 1604
   )
   public final void method778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
      class255 var9 = this.field1014.method3934(Thread.currentThread());
      class584 var10 = var9.field3411;
      var10.field8650 = 0;
      var10.field8662 = true;
      this.field1014.method561();
      if (this.field1016 == null && this.field1021 == null) {
         if (this.field1025 != null) {
            this.method774(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field3408, var9.field3419);
         }

      } else {
         this.method788(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field3408, var9.field3419);
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "fa",
      descriptor = "(IILr;)Lr;",
      line = 1619
   )
   public final class193 method779(int arg0, int arg1, class193 arg2) {
      return null;
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(III[[ZZII)V",
      line = 1623
   )
   public final void method780(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
      class199 var8 = this.field1014.field7729;
      this.field1018 = arg5;
      this.field1031 = var8.field2494;
      this.field1028 = var8.field2470;
      this.field1012 = var8.field2484;
      this.field1010 = var8.field2491;
      this.field1011 = var8.field2479;
      this.field1029 = var8.field2497;
      this.field1022 = var8.field2473;
      this.field1019 = var8.field2476;
      this.field1023 = var8.field2492;
      this.field1015 = var8.field2485;
      this.field1024 = var8.field2486;
      this.field1030 = var8.field2472;

      for(int var9 = 0; var9 < arg2 + arg2; ++var9) {
         for(int var10 = 0; var10 < arg2 + arg2; ++var10) {
            if (arg3[var9][var10]) {
               int var11 = arg0 - arg2 + var9;
               int var12 = arg1 - arg2 + var10;
               if (var11 >= 0 && var11 < super.field4087 && var12 >= 0 && var12 < super.field4081) {
                  this.method785(var11, var12, arg6);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!qw",
      name = "YA",
      descriptor = "()V",
      line = 1668
   )
   public final void method781() {
      this.field1013 = null;
      this.field1017 = null;
   }

   @OriginalMember(
      owner = "client!qw",
      name = "b",
      descriptor = "(II)I",
      line = 1673
   )
   private static final int method782(int arg0, int arg1) {
      int var2 = (arg0 & 16711680) * arg1 >> 23;
      if (var2 < 2) {
         var2 = 2;
      } else if (var2 > 253) {
         var2 = 253;
      }

      int var3 = (arg0 & 65280) * arg1 >> 15;
      if (var3 < 2) {
         var3 = 2;
      } else if (var3 > 253) {
         var3 = 253;
      }

      int var4 = (arg0 & 255) * arg1 >> 7;
      if (var4 < 2) {
         var4 = 2;
      } else if (var4 > 253) {
         var4 = 253;
      }

      return var2 << 16 | var3 << 8 | var4;
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(IILpo;[I[I[I[II)V",
      line = 1703
   )
   private final void method783(int arg0, int arg1, class584 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
      class341 var9 = this.field1025[arg0][arg1];
      if (var9 != null) {
         if ((var9.field5166 & 2) == 0) {
            if (arg7 != 0) {
               if ((var9.field5166 & 4) != 0) {
                  if ((arg7 & 1) != 0) {
                     return;
                  }
               } else if ((arg7 & 2) != 0) {
                  return;
               }
            }

            int var10 = super.field4080 * arg0;
            int var11 = super.field4080 + var10;
            int var12 = super.field4080 * arg1;
            int var13 = super.field4080 + var12;
            float var16;
            float var17;
            float var18;
            float var19;
            int var23;
            int var25;
            int var27;
            int var29;
            int var31;
            int var33;
            int var35;
            int var37;
            if ((var9.field5166 & 1) != 0) {
               int var14 = super.field4082[arg0][arg1];
               float var15 = (float)var14 * this.field1015;
               if (this.field1018 == -1) {
                  var16 = (float)var12 * this.field1024 + (float)var10 * this.field1023 + var15 + this.field1030;
                  if (var16 <= (float)this.field1014.field7741) {
                     return;
                  }

                  var17 = (float)var12 * this.field1024 + (float)var11 * this.field1023 + var15 + this.field1030;
                  if (var17 <= (float)this.field1014.field7741) {
                     return;
                  }

                  var18 = (float)var13 * this.field1024 + (float)var11 * this.field1023 + var15 + this.field1030;
                  if (var18 <= (float)this.field1014.field7741) {
                     return;
                  }

                  var19 = (float)var13 * this.field1024 + (float)var10 * this.field1023 + var15 + this.field1030;
                  if (var19 <= (float)this.field1014.field7741) {
                     return;
                  }
               } else {
                  var16 = (float)var12 * this.field1024 + (float)var10 * this.field1023 + var15 + this.field1030;
                  var17 = (float)var12 * this.field1024 + (float)var11 * this.field1023 + var15 + this.field1030;
                  var18 = (float)var13 * this.field1024 + (float)var11 * this.field1023 + var15 + this.field1030;
                  var19 = (float)var13 * this.field1024 + (float)var10 * this.field1023 + var15 + this.field1030;
               }

               float var20 = (float)var14 * this.field1028;
               float var21 = (float)var14 * this.field1029;
               if (this.field1018 == -1) {
                  float var22 = (float)var12 * this.field1012 + (float)var10 * this.field1031 + var20 + this.field1010;
                  var23 = (int)((float)this.field1014.field7725 * var22 / var16) + arg2.field8654;
                  float var24 = (float)var12 * this.field1022 + (float)var10 * this.field1011 + var21 + this.field1019;
                  var25 = (int)((float)this.field1014.field7739 * var24 / var16) + arg2.field8647;
                  float var26 = (float)var12 * this.field1012 + (float)var11 * this.field1031 + var20 + this.field1010;
                  var27 = (int)((float)this.field1014.field7725 * var26 / var17) + arg2.field8654;
                  float var28 = (float)var12 * this.field1022 + (float)var11 * this.field1011 + var21 + this.field1019;
                  var29 = (int)((float)this.field1014.field7739 * var28 / var17) + arg2.field8647;
                  float var30 = (float)var13 * this.field1012 + (float)var11 * this.field1031 + var20 + this.field1010;
                  var31 = (int)((float)this.field1014.field7725 * var30 / var18) + arg2.field8654;
                  float var32 = (float)var13 * this.field1022 + (float)var11 * this.field1011 + var21 + this.field1019;
                  var33 = (int)((float)this.field1014.field7739 * var32 / var18) + arg2.field8647;
                  float var34 = (float)var13 * this.field1012 + (float)var10 * this.field1031 + var20 + this.field1010;
                  var35 = (int)((float)this.field1014.field7725 * var34 / var19) + arg2.field8654;
                  float var36 = (float)var13 * this.field1022 + (float)var10 * this.field1011 + var21 + this.field1019;
                  var37 = (int)((float)this.field1014.field7739 * var36 / var19) + arg2.field8647;
               } else {
                  float var38 = (float)var12 * this.field1012 + (float)var10 * this.field1031 + var20 + this.field1010;
                  var23 = (int)((float)this.field1014.field7725 * var38 / (float)this.field1018) + arg2.field8654;
                  float var39 = (float)var12 * this.field1022 + (float)var10 * this.field1011 + var21 + this.field1019;
                  var25 = (int)((float)this.field1014.field7739 * var39 / (float)this.field1018) + arg2.field8647;
                  float var40 = (float)var12 * this.field1012 + (float)var11 * this.field1031 + var20 + this.field1010;
                  var27 = (int)((float)this.field1014.field7725 * var40 / (float)this.field1018) + arg2.field8654;
                  float var41 = (float)var12 * this.field1022 + (float)var11 * this.field1011 + var21 + this.field1019;
                  var29 = (int)((float)this.field1014.field7739 * var41 / (float)this.field1018) + arg2.field8647;
                  float var42 = (float)var13 * this.field1012 + (float)var11 * this.field1031 + var20 + this.field1010;
                  var31 = (int)((float)this.field1014.field7725 * var42 / (float)this.field1018) + arg2.field8654;
                  float var43 = (float)var13 * this.field1022 + (float)var11 * this.field1011 + var21 + this.field1019;
                  var33 = (int)((float)this.field1014.field7739 * var43 / (float)this.field1018) + arg2.field8647;
                  float var44 = (float)var13 * this.field1012 + (float)var10 * this.field1031 + var20 + this.field1010;
                  var35 = (int)((float)this.field1014.field7725 * var44 / (float)this.field1018) + arg2.field8654;
                  float var45 = (float)var13 * this.field1022 + (float)var10 * this.field1011 + var21 + this.field1019;
                  var37 = (int)((float)this.field1014.field7739 * var45 / (float)this.field1018) + arg2.field8647;
               }
            } else {
               int var46 = super.field4082[arg0][arg1];
               int var47 = super.field4082[arg0 + 1][arg1];
               int var48 = super.field4082[arg0 + 1][arg1 + 1];
               int var49 = super.field4082[arg0][arg1 + 1];
               if (this.field1018 == -1) {
                  var16 = (float)var12 * this.field1024 + (float)var10 * this.field1023 + (float)var46 * this.field1015 + this.field1030;
                  if (var16 <= (float)this.field1014.field7741) {
                     return;
                  }

                  var17 = (float)var12 * this.field1024 + (float)var11 * this.field1023 + (float)var47 * this.field1015 + this.field1030;
                  if (var17 <= (float)this.field1014.field7741) {
                     return;
                  }

                  var18 = (float)var13 * this.field1024 + (float)var11 * this.field1023 + (float)var48 * this.field1015 + this.field1030;
                  if (var18 <= (float)this.field1014.field7741) {
                     return;
                  }

                  var19 = (float)var13 * this.field1024 + (float)var10 * this.field1023 + (float)var49 * this.field1015 + this.field1030;
                  if (var19 <= (float)this.field1014.field7741) {
                     return;
                  }

                  float var50 = (float)var12 * this.field1012 + (float)var10 * this.field1031 + (float)var46 * this.field1028 + this.field1010;
                  var23 = (int)((float)this.field1014.field7725 * var50 / var16) + arg2.field8654;
                  float var51 = (float)var12 * this.field1022 + (float)var10 * this.field1011 + (float)var46 * this.field1029 + this.field1019;
                  var25 = (int)((float)this.field1014.field7739 * var51 / var16) + arg2.field8647;
                  float var52 = (float)var12 * this.field1012 + (float)var11 * this.field1031 + (float)var47 * this.field1028 + this.field1010;
                  var27 = (int)((float)this.field1014.field7725 * var52 / var17) + arg2.field8654;
                  float var53 = (float)var12 * this.field1022 + (float)var11 * this.field1011 + (float)var47 * this.field1029 + this.field1019;
                  var29 = (int)((float)this.field1014.field7739 * var53 / var17) + arg2.field8647;
                  float var54 = (float)var13 * this.field1012 + (float)var11 * this.field1031 + (float)var48 * this.field1028 + this.field1010;
                  var31 = (int)((float)this.field1014.field7725 * var54 / var18) + arg2.field8654;
                  float var55 = (float)var13 * this.field1022 + (float)var11 * this.field1011 + (float)var48 * this.field1029 + this.field1019;
                  var33 = (int)((float)this.field1014.field7739 * var55 / var18) + arg2.field8647;
                  float var56 = (float)var13 * this.field1012 + (float)var10 * this.field1031 + (float)var49 * this.field1028 + this.field1010;
                  var35 = (int)((float)this.field1014.field7725 * var56 / var19) + arg2.field8654;
                  float var57 = (float)var13 * this.field1022 + (float)var10 * this.field1011 + (float)var49 * this.field1029 + this.field1019;
                  var37 = (int)((float)this.field1014.field7739 * var57 / var19) + arg2.field8647;
               } else {
                  var16 = (float)var12 * this.field1024 + (float)var10 * this.field1023 + (float)var46 * this.field1015 + this.field1030;
                  var17 = (float)var12 * this.field1024 + (float)var11 * this.field1023 + (float)var47 * this.field1015 + this.field1030;
                  var18 = (float)var13 * this.field1024 + (float)var11 * this.field1023 + (float)var48 * this.field1015 + this.field1030;
                  var19 = (float)var13 * this.field1024 + (float)var10 * this.field1023 + (float)var49 * this.field1015 + this.field1030;
                  float var58 = (float)var12 * this.field1012 + (float)var10 * this.field1031 + (float)var46 * this.field1028 + this.field1010;
                  var23 = (int)((float)this.field1014.field7725 * var58 / (float)this.field1018) + arg2.field8654;
                  float var59 = (float)var12 * this.field1022 + (float)var10 * this.field1011 + (float)var46 * this.field1029 + this.field1019;
                  var25 = (int)((float)this.field1014.field7739 * var59 / (float)this.field1018) + arg2.field8647;
                  float var60 = (float)var12 * this.field1012 + (float)var11 * this.field1031 + (float)var47 * this.field1028 + this.field1010;
                  var27 = (int)((float)this.field1014.field7725 * var60 / (float)this.field1018) + arg2.field8654;
                  float var61 = (float)var12 * this.field1022 + (float)var11 * this.field1011 + (float)var47 * this.field1029 + this.field1019;
                  var29 = (int)((float)this.field1014.field7739 * var61 / (float)this.field1018) + arg2.field8647;
                  float var62 = (float)var13 * this.field1012 + (float)var11 * this.field1031 + (float)var48 * this.field1028 + this.field1010;
                  var31 = (int)((float)this.field1014.field7725 * var62 / (float)this.field1018) + arg2.field8654;
                  float var63 = (float)var13 * this.field1022 + (float)var11 * this.field1011 + (float)var48 * this.field1029 + this.field1019;
                  var33 = (int)((float)this.field1014.field7739 * var63 / (float)this.field1018) + arg2.field8647;
                  float var64 = (float)var13 * this.field1012 + (float)var10 * this.field1031 + (float)var49 * this.field1028 + this.field1010;
                  var35 = (int)((float)this.field1014.field7725 * var64 / (float)this.field1018) + arg2.field8654;
                  float var65 = (float)var13 * this.field1022 + (float)var10 * this.field1011 + (float)var49 * this.field1029 + this.field1019;
                  var37 = (int)((float)this.field1014.field7739 * var65 / (float)this.field1018) + arg2.field8647;
               }
            }

            if (this.field1018 == -1) {
               if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                  arg2.field8662 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field8649 || var35 > arg2.field8649 || var27 > arg2.field8649;
                  if (var9.field5165 >= 0) {
                     arg2.method4317((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class672.field10111[var9.field5167 & 65535] & 16777215, -16777216 | class672.field10111[var9.field5168 & 65535] & 16777215, -16777216 | class672.field10111[var9.field5163 & 65535] & 16777215, 0, 0, 0, 0, var9.field5165);
                  } else {
                     arg2.method4314((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, (float)((int)var18), (float)((int)var19), (float)((int)var17), (float)(var9.field5167 & 65535), (float)(var9.field5168 & 65535), (float)(var9.field5163 & 65535));
                  }
               }

               if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                  arg2.field8662 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field8649 || var27 > arg2.field8649 || var35 > arg2.field8649;
                  if (var9.field5165 >= 0) {
                     arg2.method4317((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class672.field10111[var9.field5164 & 65535] & 16777215, -16777216 | class672.field10111[var9.field5163 & 65535] & 16777215, -16777216 | class672.field10111[var9.field5168 & 65535] & 16777215, 0, 0, 0, 0, var9.field5165);
                     return;
                  }

                  arg2.method4314((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, (float)((int)var16), (float)((int)var17), (float)((int)var19), (float)(var9.field5164 & 65535), (float)(var9.field5163 & 65535), (float)(var9.field5168 & 65535));
                  return;
               }
            } else {
               if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                  arg2.field8662 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field8649 || var35 > arg2.field8649 || var27 > arg2.field8649;
                  if (var9.field5165 >= 0) {
                     arg2.method4317((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class672.field10111[var9.field5167 & 65535] & 16777215, -16777216 | class672.field10111[var9.field5168 & 65535] & 16777215, -16777216 | class672.field10111[var9.field5163 & 65535] & 16777215, 0, 0, 0, 0, var9.field5165);
                  } else {
                     arg2.method4314((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, (float)((int)var18), (float)((int)var19), (float)((int)var17), (float)(var9.field5167 & 65535), (float)(var9.field5168 & 65535), (float)(var9.field5163 & 65535));
                  }
               }

               if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                  arg2.field8662 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field8649 || var27 > arg2.field8649 || var35 > arg2.field8649;
                  if (var9.field5165 >= 0) {
                     arg2.method4317((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class672.field10111[var9.field5164 & 65535] & 16777215, -16777216 | class672.field10111[var9.field5163 & 65535] & 16777215, -16777216 | class672.field10111[var9.field5168 & 65535] & 16777215, 0, 0, 0, 0, var9.field5165);
                     return;
                  }

                  arg2.method4314((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, (float)((int)var16), (float)((int)var17), (float)((int)var19), (float)(var9.field5164 & 65535), (float)(var9.field5163 & 65535), (float)(var9.field5168 & 65535));
               }
            }

         }
      } else {
         class342 var66 = this.field1020[arg0][arg1];
         if (var66 != null) {
            if (arg7 != 0) {
               if ((var66.field5172 & 4) != 0) {
                  if ((arg7 & 1) != 0) {
                     return;
                  }
               } else if ((arg7 & 2) != 0) {
                  return;
               }
            }

            if (this.field1018 == -1) {
               for(int var67 = 0; var67 < var66.field5181; ++var67) {
                  int var68 = (arg0 << super.field4086) + var66.field5183[var67];
                  short var69 = var66.field5170[var67];
                  int var70 = (arg1 << super.field4086) + var66.field5177[var67];
                  float var71 = (float)var70 * this.field1024 + (float)var68 * this.field1023 + (float)var69 * this.field1015 + this.field1030;
                  if (var71 <= (float)this.field1014.field7741) {
                     return;
                  }

                  float var72 = (float)var70 * this.field1012 + (float)var68 * this.field1031 + (float)var69 * this.field1028 + this.field1010;
                  float var73 = (float)var70 * this.field1022 + (float)var68 * this.field1011 + (float)var69 * this.field1029 + this.field1019;
                  arg3[var67] = (int)((float)this.field1014.field7725 * var72 / var71) + arg2.field8654;
                  arg4[var67] = (int)((float)this.field1014.field7739 * var73 / var71) + arg2.field8647;
                  arg5[var67] = (int)var71;
               }
            } else {
               for(int var74 = 0; var74 < var66.field5181; ++var74) {
                  int var110 = (arg0 << super.field4086) + var66.field5183[var74];
                  short var111 = var66.field5170[var74];
                  int var112 = (arg1 << super.field4086) + var66.field5177[var74];
                  float var113 = (float)var112 * this.field1024 + (float)var110 * this.field1023 + (float)var111 * this.field1015 + this.field1030;
                  float var114 = (float)var112 * this.field1012 + (float)var110 * this.field1031 + (float)var111 * this.field1028 + this.field1010;
                  float var115 = (float)var112 * this.field1022 + (float)var110 * this.field1011 + (float)var111 * this.field1029 + this.field1019;
                  arg3[var74] = (int)((float)this.field1014.field7725 * var114 / (float)this.field1018) + arg2.field8654;
                  arg4[var74] = (int)((float)this.field1014.field7739 * var115 / (float)this.field1018) + arg2.field8647;
                  arg5[var74] = (int)var113;
               }
            }

            if (var66.field5178 != null) {
               if (this.field1018 == -1) {
                  for(int var75 = 0; var75 < var66.field5176; ++var75) {
                     short var76 = var66.field5180[var75];
                     short var77 = var66.field5173[var75];
                     short var78 = var66.field5175[var75];
                     int var79 = arg3[var76];
                     int var80 = arg3[var77];
                     int var81 = arg3[var78];
                     int var82 = arg4[var76];
                     int var83 = arg4[var77];
                     int var84 = arg4[var78];
                     if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                        arg2.field8662 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field8649 || var80 > arg2.field8649 || var81 > arg2.field8649;
                        short var85 = var66.field5178[var75];
                        if (var85 != -1) {
                           arg2.method4317((float)var82, (float)var83, (float)var84, (float)var79, (float)var80, (float)var81, (float)arg5[var76], (float)arg5[var77], (float)arg5[var78], (float)var66.field5183[var76] / (float)super.field4080, (float)var66.field5183[var77] / (float)super.field4080, (float)var66.field5183[var78] / (float)super.field4080, (float)var66.field5177[var76] / (float)super.field4080, (float)var66.field5177[var77] / (float)super.field4080, (float)var66.field5177[var78] / (float)super.field4080, -16777216 | class672.field10111[var66.field5174[var76] & 65535] & 16777215, -16777216 | class672.field10111[var66.field5174[var77] & 65535] & 16777215, -16777216 | class672.field10111[var66.field5174[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                        } else {
                           int var86 = var66.field5179[var75];
                           if (var86 != -1) {
                              arg2.method4314((float)var82, (float)var83, (float)var84, (float)var79, (float)var80, (float)var81, (float)arg5[var76], (float)arg5[var77], (float)arg5[var78], (float)class70.method698(-123, var66.field5174[var76], var86), (float)class70.method698(-127, var66.field5174[var77], var86), (float)class70.method698(-126, var66.field5174[var78], var86));
                           }
                        }
                     }
                  }

                  return;
               }

               for(int var87 = 0; var87 < var66.field5176; ++var87) {
                  short var88 = var66.field5180[var87];
                  short var89 = var66.field5173[var87];
                  short var90 = var66.field5175[var87];
                  int var91 = arg3[var88];
                  int var92 = arg3[var89];
                  int var93 = arg3[var90];
                  int var94 = arg4[var88];
                  int var95 = arg4[var89];
                  int var96 = arg4[var90];
                  if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                     arg2.field8662 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field8649 || var92 > arg2.field8649 || var93 > arg2.field8649;
                     short var97 = var66.field5178[var87];
                     if (var97 != -1) {
                        arg2.method4317((float)var94, (float)var95, (float)var96, (float)var91, (float)var92, (float)var93, (float)arg5[var88], (float)arg5[var89], (float)arg5[var90], (float)var66.field5183[var88] / (float)super.field4080, (float)var66.field5183[var89] / (float)super.field4080, (float)var66.field5183[var90] / (float)super.field4080, (float)var66.field5177[var88] / (float)super.field4080, (float)var66.field5177[var89] / (float)super.field4080, (float)var66.field5177[var90] / (float)super.field4080, -16777216 | class672.field10111[var66.field5174[var88] & 65535] & 16777215, -16777216 | class672.field10111[var66.field5174[var89] & 65535] & 16777215, -16777216 | class672.field10111[var66.field5174[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                     } else {
                        int var98 = var66.field5179[var87];
                        if (var98 != -1) {
                           arg2.method4314((float)var94, (float)var95, (float)var96, (float)var91, (float)var92, (float)var93, (float)arg5[var88], (float)arg5[var89], (float)arg5[var90], (float)class70.method698(-122, var66.field5174[var88], var98), (float)class70.method698(-128, var66.field5174[var89], var98), (float)class70.method698(-125, var66.field5174[var90], var98));
                        }
                     }
                  }
               }

               return;
            }

            for(int var99 = 0; var99 < var66.field5176; ++var99) {
               short var100 = var66.field5180[var99];
               short var101 = var66.field5173[var99];
               short var102 = var66.field5175[var99];
               int var103 = arg3[var100];
               int var104 = arg3[var101];
               int var105 = arg3[var102];
               int var106 = arg4[var100];
               int var107 = arg4[var101];
               int var108 = arg4[var102];
               if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                  int var109 = var66.field5179[var99];
                  if (var109 != -1) {
                     arg2.field8662 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field8649 || var104 > arg2.field8649 || var105 > arg2.field8649;
                     arg2.method4314((float)var106, (float)var107, (float)var108, (float)var103, (float)var104, (float)var105, (float)arg5[var100], (float)arg5[var101], (float)arg5[var102], (float)class70.method698(-128, var66.field5174[var100], var109), (float)class70.method698(-124, var66.field5174[var101], var109), (float)class70.method698(-124, var66.field5174[var102], var109));
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(III[[ZZI)V",
      line = 2181
   )
   public final void method784(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
      class199 var7 = this.field1014.field7729;
      this.field1018 = -1;
      this.field1031 = var7.field2494;
      this.field1028 = var7.field2470;
      this.field1012 = var7.field2484;
      this.field1010 = var7.field2491;
      this.field1011 = var7.field2479;
      this.field1029 = var7.field2497;
      this.field1022 = var7.field2473;
      this.field1019 = var7.field2476;
      this.field1023 = var7.field2492;
      this.field1015 = var7.field2485;
      this.field1024 = var7.field2486;
      this.field1030 = var7.field2472;

      for(int var8 = 0; var8 < arg2 + arg2; ++var8) {
         for(int var9 = 0; var9 < arg2 + arg2; ++var9) {
            if (arg3[var8][var9]) {
               int var10 = arg0 - arg2 + var8;
               int var11 = arg1 - arg2 + var9;
               if (var10 >= 0 && var10 < super.field4087 && var11 >= 0 && var11 < super.field4081) {
                  this.method785(var10, var11, arg5);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!qw",
      name = "b",
      descriptor = "(III)V",
      line = 2226
   )
   private final void method785(int arg0, int arg1, int arg2) {
      class255 var4 = this.field1014.method3934(Thread.currentThread());
      var4.field3411.field8650 = 0;
      if (this.field1016 != null) {
         this.method772(arg0, arg1, var4.field3406, var4, var4.field3411, var4.field3408, var4.field3419, var4.field3431, var4.field3426, arg2);
      } else if (this.field1025 != null) {
         this.method783(arg0, arg1, var4.field3411, var4.field3408, var4.field3419, var4.field3431, var4.field3426, arg2);
      } else {
         if (this.field1021 != null) {
            this.method771(arg0, arg1, var4.field3406, var4, var4.field3411, var4.field3408, var4.field3419, var4.field3431, var4.field3426, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "<init>",
      descriptor = "(Lbda;IIII[[I[[II)V",
      line = 2241
   )
   public class83(class531 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
      super(arg3, arg4, arg7, arg5);
      this.field1014 = arg0;
      this.field1027 = arg2;
      this.field1013 = new byte[arg3 + 1][arg4 + 1];
      int var9 = this.field1014.field7749 >> 9;

      for(int var10 = 1; var10 < arg4; ++var10) {
         for(int var11 = 1; var11 < arg3; ++var11) {
            int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
            int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
            int var15 = (int)Math.sqrt((double)(var14 * var14 + arg7 * 512 + var13 * var13));
            int var16 = (var13 << 8) / var15;
            int var17 = arg7 * -512 / var15;
            int var18 = (var14 << 8) / var15;
            int var19 = (this.field1014.field7724 * var18 + this.field1014.field7756 * var17 + this.field1014.field7736 * var16 >> 17) + var9;
            int var20 = var19 >> 1;
            if (var20 < 2) {
               var20 = 2;
            } else if (var20 > 126) {
               var20 = 126;
            }

            this.field1013[var11][var10] = (byte)var20;
         }
      }

      this.field1017 = new byte[arg3 + 1][arg4 + 1];
   }

   @OriginalMember(
      owner = "client!qw",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V",
      line = 2296
   )
   public final void method786(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
      boolean var15 = (this.field1027 & 32) == 0;
      if (this.field1016 == null && !var15) {
         this.field1016 = new class233[super.field4087][super.field4081];
         this.field1026 = new class771[super.field4087][super.field4081];
      } else if (this.field1021 == null && var15) {
         this.field1021 = new class588[super.field4087][super.field4081];
      } else if (this.field1025 != null) {
         throw new IllegalStateException();
      }

      if (arg2 != null && arg2.length != 0) {
         for(int var16 = 0; var16 < arg6.length; ++var16) {
            if (arg6[var16] == -1) {
               arg6[var16] = 0;
            } else {
               arg6[var16] = class672.field10111[class562.method4163(-123, arg6[var16]) & 65535] << 8 | 255;
            }
         }

         if (arg7 != null) {
            for(int var17 = 0; var17 < arg7.length; ++var17) {
               if (arg7[var17] == -1) {
                  arg7[var17] = 0;
               } else {
                  arg7[var17] = class672.field10111[class562.method4163(-126, arg7[var17]) & 65535] << 8 | 255;
               }
            }
         }

         if (var15) {
            class588 var18 = new class588();
            var18.field8704 = (short)arg2.length;
            var18.field8699 = (short)(arg2.length / 3);
            var18.field8706 = new short[var18.field8704];
            var18.field8707 = new short[var18.field8704];
            var18.field8705 = new short[var18.field8704];
            var18.field8698 = new int[var18.field8704];
            var18.field8703 = new short[var18.field8704];
            var18.field8708 = new short[var18.field8704];
            var18.field8701 = new byte[var18.field8704];
            if (arg5 != null) {
               var18.field8702 = new short[var18.field8704];
            }

            for(int var19 = 0; var19 < var18.field8704; ++var19) {
               int var22 = arg2[var19];
               int var23 = arg4[var19];
               boolean var24 = false;
               int var25;
               if (var22 == 0 && var23 == 0) {
                  var25 = this.field1013[arg0][arg1] - this.field1017[arg0][arg1];
               } else if (var22 == 0 && super.field4080 == var23) {
                  var25 = this.field1013[arg0][arg1 + 1] - this.field1017[arg0][arg1 + 1];
               } else if (super.field4080 == var22 && super.field4080 == var23) {
                  var25 = this.field1013[arg0 + 1][arg1 + 1] - this.field1017[arg0 + 1][arg1 + 1];
               } else if (super.field4080 == var22 && var23 == 0) {
                  var25 = this.field1013[arg0 + 1][arg1] - this.field1017[arg0 + 1][arg1];
               } else {
                  int var26 = (this.field1013[arg0 + 1][arg1] - this.field1017[arg0 + 1][arg1]) * var22 + (this.field1013[arg0][arg1] - this.field1017[arg0][arg1]) * (super.field4080 - var22);
                  int var27 = (this.field1013[arg0 + 1][arg1 + 1] - this.field1017[arg0 + 1][arg1 + 1]) * var22 + (this.field1013[arg0][arg1 + 1] - this.field1017[arg0][arg1 + 1]) * (super.field4080 - var22);
                  var25 = (super.field4080 - var23) * var26 + var23 * var27 >> super.field4086 * 2;
               }

               int var28 = (arg0 << super.field4086) + var22;
               int var29 = (arg1 << super.field4086) + var23;
               var18.field8706[var19] = (short)var22;
               var18.field8705[var19] = (short)var23;
               var18.field8707[var19] = (short)(this.method2236((byte)114, var28, var29) + (arg3 != null ? arg3[var19] : 0));
               if (var25 < 0) {
                  var25 = 0;
               }

               if (arg6[var19] == 0) {
                  var18.field8698[var19] = 0;
                  if (arg7 != null) {
                     var18.field8701[var19] = (byte)var25;
                  }
               } else {
                  int var30 = 0;
                  if (arg5 != null) {
                     short var31 = var18.field8702[var19] = (short)arg5[var19];
                     if (arg11 != 0) {
                        var30 = var31 * 255 / arg11;
                        if (var30 < 0) {
                           var30 = 0;
                        } else if (var30 > 255) {
                           var30 = 255;
                        }
                     }
                  }

                  int var32 = -16777216;
                  if (arg8[var19] != -1 && this.method773(this.field1014.field813.method1159(arg8[var19], 125).field4655)) {
                     var32 = -1694498816;
                  }

                  var18.field8698[var19] = var32 | class635.method4575(method782(arg6[var19] >> 8, var25), var30, arg10, (byte)63);
                  if (arg7 != null) {
                     var18.field8701[var19] = (byte)var25;
                  }
               }

               var18.field8703[var19] = (short)arg8[var19];
               var18.field8708[var19] = (short)arg9[var19];
            }

            if (arg7 != null) {
               var18.field8700 = new int[var18.field8699];
            }

            for(int var20 = 0; var20 < var18.field8699; ++var20) {
               int var21 = var20 * 3;
               if (arg7 != null && arg7[var21] != 0) {
                  var18.field8700[var20] = -16777216 | arg7[var21] >> 8;
               }
            }

            this.field1021[arg0][arg1] = var18;
         } else {
            boolean var33 = true;
            int var34 = -1;
            int var35 = -1;
            int var36 = -1;
            int var37 = -1;
            if (arg2.length == 6) {
               for(int var38 = 0; var38 < 6; ++var38) {
                  if (arg2[var38] == 0 && arg4[var38] == 0) {
                     if (var34 != -1 && arg6[var34] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var34 = var38;
                  } else if (arg2[var38] == super.field4080 && arg4[var38] == 0) {
                     if (var35 != -1 && arg6[var35] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var35 = var38;
                  } else if (arg2[var38] == super.field4080 && arg4[var38] == super.field4080) {
                     if (var36 != -1 && arg6[var36] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var36 = var38;
                  } else if (arg2[var38] == 0 && arg4[var38] == super.field4080) {
                     if (var37 != -1 && arg6[var37] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var37 = var38;
                  }
               }

               if (var34 == -1 || var35 == -1 || var36 == -1 || var37 == -1) {
                  var33 = false;
               }

               if (var33) {
                  if (arg3 != null) {
                     for(int var39 = 0; var39 < 4; ++var39) {
                        if (arg3[var39] != 0) {
                           var33 = false;
                           break;
                        }
                     }
                  }

                  if (var33) {
                     for(int var40 = 1; var40 < 4; ++var40) {
                        if (arg2[var40] != arg2[0] && arg2[0] + super.field4080 != arg2[var40] && arg2[0] - super.field4080 != arg2[var40]) {
                           var33 = false;
                           break;
                        }

                        if (arg4[var40] != arg4[0] && arg4[0] + super.field4080 != arg4[var40] && arg4[0] - super.field4080 != arg4[var40]) {
                           var33 = false;
                           break;
                        }
                     }
                  }
               }
            } else {
               var33 = false;
            }

            if (var33) {
               class233 var41 = new class233();
               int var42 = arg6[0];
               int var43 = arg8[0];
               if (arg7 != null) {
                  var41.field2970 = arg7[0] >> 8;
                  if (var42 == 0) {
                     var41.field2964 = (byte)(var41.field2964 | 2);
                  }
               } else if (var42 == 0) {
                  return;
               }

               if (super.field4082[arg0 + 1][arg1] == super.field4082[arg0][arg1] && super.field4082[arg0 + 1][arg1 + 1] == super.field4082[arg0][arg1] && super.field4082[arg0][arg1 + 1] == super.field4082[arg0][arg1]) {
                  var41.field2964 = (byte)(var41.field2964 | 1);
               }

               if (var43 != -1 && (var41.field2964 & 2) == 0 && !this.field1014.field813.method1159(var43, 124).field4649) {
                  int var44;
                  if (arg5 != null && arg11 != 0) {
                     var44 = arg5[var34] * 255 / arg11;
                     if (var44 < 0) {
                        var44 = 0;
                     } else if (var44 > 255) {
                        var44 = 255;
                     }
                  } else {
                     var44 = 0;
                  }

                  var41.field2961 = class635.method4575(method782(arg6[var34] >> 8, this.field1013[arg0][arg1] - this.field1017[arg0][arg1]), var44, arg10, (byte)123);
                  if (var41.field2970 != 0) {
                     var41.field2961 |= 255 - (this.field1013[arg0][arg1] - this.field1017[arg0][arg1]) << 25;
                  }

                  int var45;
                  if (arg5 != null && arg11 != 0) {
                     var45 = arg5[var35] * 255 / arg11;
                     if (var45 < 0) {
                        var45 = 0;
                     } else if (var45 > 255) {
                        var45 = 255;
                     }
                  } else {
                     var45 = 0;
                  }

                  var41.field2969 = class635.method4575(method782(arg6[var35] >> 8, this.field1013[arg0 + 1][arg1] - this.field1017[arg0 + 1][arg1]), var45, arg10, (byte)57);
                  if (var41.field2970 != 0) {
                     var41.field2969 |= 255 - (this.field1013[arg0 + 1][arg1] - this.field1017[arg0 + 1][arg1]) << 25;
                  }

                  int var46;
                  if (arg5 != null && arg11 != 0) {
                     var46 = arg5[var36] * 255 / arg11;
                     if (var46 < 0) {
                        var46 = 0;
                     } else if (var46 > 255) {
                        var46 = 255;
                     }
                  } else {
                     var46 = 0;
                  }

                  var41.field2967 = class635.method4575(method782(arg6[var36] >> 8, this.field1013[arg0 + 1][arg1 + 1] - this.field1017[arg0 + 1][arg1 + 1]), var46, arg10, (byte)70);
                  if (var41.field2970 != 0) {
                     var41.field2967 |= 255 - (this.field1013[arg0 + 1][arg1 + 1] - this.field1017[arg0 + 1][arg1 + 1]) << 25;
                  }

                  int var47;
                  if (arg5 != null && arg11 != 0) {
                     var47 = arg5[var37] * 255 / arg11;
                     if (var47 < 0) {
                        var47 = 0;
                     } else if (var47 > 255) {
                        var47 = 255;
                     }
                  } else {
                     var47 = 0;
                  }

                  var41.field2971 = class635.method4575(method782(arg6[var37] >> 8, this.field1013[arg0][arg1 + 1] - this.field1017[arg0][arg1 + 1]), var47, arg10, (byte)30);
                  var41.field2966 = (short)var43;
               } else {
                  int var48;
                  if (arg5 != null && arg11 != 0) {
                     var48 = arg5[var34] * 255 / arg11;
                     if (var48 < 0) {
                        var48 = 0;
                     } else if (var48 > 255) {
                        var48 = 255;
                     }
                  } else {
                     var48 = 0;
                  }

                  var41.field2961 = class635.method4575(method782(arg6[var34] >> 8, this.field1013[arg0][arg1] - this.field1017[arg0][arg1]), var48, arg10, (byte)72);
                  if (var41.field2970 != 0) {
                     var41.field2961 |= 255 - (this.field1013[arg0][arg1] - this.field1017[arg0][arg1]) << 25;
                  }

                  int var49;
                  if (arg5 != null && arg11 != 0) {
                     var49 = arg5[var35] * 255 / arg11;
                     if (var49 < 0) {
                        var49 = 0;
                     } else if (var49 > 255) {
                        var49 = 255;
                     }
                  } else {
                     var49 = 0;
                  }

                  var41.field2969 = class635.method4575(method782(arg6[var35] >> 8, this.field1013[arg0 + 1][arg1] - this.field1017[arg0 + 1][arg1]), var49, arg10, (byte)83);
                  if (var41.field2970 != 0) {
                     var41.field2969 |= 255 - (this.field1013[arg0 + 1][arg1] - this.field1017[arg0 + 1][arg1]) << 25;
                  }

                  int var50;
                  if (arg5 != null && arg11 != 0) {
                     var50 = arg5[var36] * 255 / arg11;
                     if (var50 < 0) {
                        var50 = 0;
                     } else if (var50 > 255) {
                        var50 = 255;
                     }
                  } else {
                     var50 = 0;
                  }

                  var41.field2967 = class635.method4575(method782(arg6[var36] >> 8, this.field1013[arg0 + 1][arg1 + 1] - this.field1017[arg0 + 1][arg1 + 1]), var50, arg10, (byte)88);
                  if (var41.field2970 != 0) {
                     var41.field2967 |= 255 - (this.field1013[arg0 + 1][arg1 + 1] - this.field1017[arg0 + 1][arg1 + 1]) << 25;
                  }

                  int var51;
                  if (arg5 != null && arg11 != 0) {
                     var51 = arg5[var37] * 255 / arg11;
                     if (var51 < 0) {
                        var51 = 0;
                     } else if (var51 > 255) {
                        var51 = 255;
                     }
                  } else {
                     var51 = 0;
                  }

                  var41.field2971 = class635.method4575(method782(arg6[var37] >> 8, this.field1013[arg0][arg1 + 1] - this.field1017[arg0][arg1 + 1]), var51, arg10, (byte)113);
                  if (var41.field2970 != 0) {
                     var41.field2971 |= 255 - (this.field1013[arg0][arg1 + 1] - this.field1017[arg0][arg1 + 1]) << 25;
                  }

                  var41.field2966 = -1;
               }

               if (arg5 != null) {
                  var41.field2962 = (short)arg5[var36];
                  var41.field2965 = (short)arg5[var37];
                  var41.field2968 = (short)arg5[var35];
                  var41.field2963 = (short)arg5[var34];
               }

               this.field1016[arg0][arg1] = var41;
            } else {
               class771 var52 = new class771();
               var52.field11308 = (short)arg2.length;
               var52.field11305 = (short)(arg2.length / 3);
               var52.field11304 = new short[var52.field11308];
               var52.field11301 = new short[var52.field11308];
               var52.field11309 = new short[var52.field11308];
               var52.field11302 = new int[var52.field11308];
               if (arg5 != null) {
                  var52.field11307 = new short[var52.field11308];
               }

               for(int var53 = 0; var53 < var52.field11308; ++var53) {
                  int var68 = arg2[var53];
                  int var69 = arg4[var53];
                  boolean var70 = false;
                  int var71;
                  if (var68 == 0 && var69 == 0) {
                     var71 = this.field1013[arg0][arg1] - this.field1017[arg0][arg1];
                  } else if (var68 == 0 && super.field4080 == var69) {
                     var71 = this.field1013[arg0][arg1 + 1] - this.field1017[arg0][arg1 + 1];
                  } else if (super.field4080 == var68 && super.field4080 == var69) {
                     var71 = this.field1013[arg0 + 1][arg1 + 1] - this.field1017[arg0 + 1][arg1 + 1];
                  } else if (super.field4080 == var68 && var69 == 0) {
                     var71 = this.field1013[arg0 + 1][arg1] - this.field1017[arg0 + 1][arg1];
                  } else {
                     int var72 = (this.field1013[arg0 + 1][arg1] - this.field1017[arg0 + 1][arg1]) * var68 + (this.field1013[arg0][arg1] - this.field1017[arg0][arg1]) * (super.field4080 - var68);
                     int var73 = (this.field1013[arg0 + 1][arg1 + 1] - this.field1017[arg0 + 1][arg1 + 1]) * var68 + (this.field1013[arg0][arg1 + 1] - this.field1017[arg0][arg1 + 1]) * (super.field4080 - var68);
                     var71 = (super.field4080 - var69) * var72 + var69 * var73 >> super.field4086 * 2;
                  }

                  int var74 = (arg0 << super.field4086) + var68;
                  int var75 = (arg1 << super.field4086) + var69;
                  var52.field11304[var53] = (short)var68;
                  var52.field11309[var53] = (short)var69;
                  var52.field11301[var53] = (short)(this.method2236((byte)107, var74, var75) + (arg3 != null ? arg3[var53] : 0));
                  if (var71 < 0) {
                     var71 = 0;
                  }

                  if (arg6[var53] == 0) {
                     if (arg7 != null) {
                        var52.field11302[var53] = var71 << 25;
                     } else {
                        var52.field11302[var53] = 0;
                     }
                  } else {
                     int var76 = 0;
                     if (arg5 != null) {
                        short var77 = var52.field11307[var53] = (short)arg5[var53];
                        if (arg11 != 0) {
                           var76 = var77 * 255 / arg11;
                           if (var76 < 0) {
                              var76 = 0;
                           } else if (var76 > 255) {
                              var76 = 255;
                           }
                        }
                     }

                     var52.field11302[var53] = class635.method4575(method782(arg6[var53] >> 8, var71), var76, arg10, (byte)37);
                     if (arg7 != null) {
                        var52.field11302[var53] |= var71 << 25;
                     }
                  }
               }

               boolean var54 = false;

               for(int var55 = 0; var55 < var52.field11305; ++var55) {
                  if (arg8[var55 * 3] != -1 && !this.field1014.field813.method1159(arg8[var55 * 3], 126).field4649) {
                     var54 = true;
                  }
               }

               if (arg7 != null) {
                  var52.field11300 = new int[var52.field11305];
               }

               if (var54) {
                  var52.field11306 = new short[var52.field11305];
                  var52.field11303 = new short[var52.field11305];
               }

               for(int var56 = 0; var56 < var52.field11305; ++var56) {
                  int var57 = var56 * 3;
                  if (arg7 != null && arg7[var57] != 0) {
                     var52.field11300[var56] = arg7[var57] >> 8;
                  }

                  if (var54) {
                     int var58 = var57 + 1;
                     int var59 = var58 + 1;
                     boolean var60 = false;
                     boolean var61 = true;
                     int var62 = arg8[var57];
                     if (var62 != -1 && !this.field1014.field813.method1159(var62, 127).field4649) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     int var63 = arg8[var58];
                     if (var63 != -1 && !this.field1014.field813.method1159(var63, 126).field4649) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     int var64 = arg8[var59];
                     if (var64 != -1 && !this.field1014.field813.method1159(var64, 124).field4649) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     if (var61) {
                        var52.field11306[var56] = (short)var64;
                        var52.field11303[var56] = (short)arg9[var57];
                     } else {
                        if (var60) {
                           int var65 = arg8[var57];
                           if (var65 != -1 && !this.field1014.field813.method1159(var65, 124).field4649) {
                              var52.field11302[var57] = class672.field10111[class562.method4163(-126, this.field1014.field813.method1159(var65, 125).field4650 & 65535) & 65535];
                           }

                           int var66 = arg8[var58];
                           if (var66 != -1 && !this.field1014.field813.method1159(var66, 124).field4649) {
                              var52.field11302[var58] = class672.field10111[class562.method4163(-126, this.field1014.field813.method1159(var66, 127).field4650 & 65535) & 65535];
                           }

                           int var67 = arg8[var59];
                           if (var67 != -1 && !this.field1014.field813.method1159(var67, 127).field4649) {
                              var52.field11302[var59] = class672.field10111[class562.method4163(-128, this.field1014.field813.method1159(var67, 127).field4650 & 65535) & 65535];
                           }
                        }

                        var52.field11306[var56] = -1;
                     }
                  }
               }

               this.field1026[arg0][arg1] = var52;
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V",
      line = 2995
   )
   public final void method787(class193 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(IIIIIII[[ZLig;Lpo;[I[I)V",
      line = 3000
   )
   private final void method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class255 arg8, class584 arg9, int[] arg10, int[] arg11) {
      int var13 = (arg6 - arg4) * arg2 / 256;
      int var14 = arg2 >> 8;
      boolean var15 = arg8.field3400;
      this.field1014.method622(false);
      arg9.field8657 = false;
      arg9.field8659 = false;
      int var16 = arg0;
      int var17 = arg1 + var13;

      for(int var18 = arg3; var18 < arg5; ++var18) {
         for(int var19 = arg4; var19 < arg6; ++var19) {
            if (arg7[var18 - arg3][var19 - arg4]) {
               if (this.field1016 != null) {
                  if (this.field1016[var18][var19] != null) {
                     class233 var20 = this.field1016[var18][var19];
                     if (var20.field2966 != -1 && (var20.field2964 & 2) == 0 && var20.field2970 == 0) {
                        int var21 = this.field1014.method3938(var20.field2966);
                        arg9.method4314((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)class70.method698(-128, var20.field2967, var21), (float)class70.method698(-128, var20.field2971, var21), (float)class70.method698(-122, var20.field2969, var21));
                        arg9.method4314((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)class70.method698(-122, var20.field2961, var21), (float)class70.method698(-122, var20.field2969, var21), (float)class70.method698(-122, var20.field2971, var21));
                     } else if (var20.field2970 == 0) {
                        arg9.method4322((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, var20.field2967, var20.field2971, var20.field2969);
                        arg9.method4322((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, var20.field2961, var20.field2969, var20.field2971);
                     } else {
                        int var22 = var20.field2970;
                        arg9.method4322((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, class599.method4382(62, var22, var20.field2967 & -16777216), class599.method4382(82, var22, var20.field2971 & -16777216), class599.method4382(-51, var22, var20.field2969 & -16777216));
                        arg9.method4322((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, class599.method4382(-97, var22, var20.field2961 & -16777216), class599.method4382(-91, var22, var20.field2969 & -16777216), class599.method4382(-96, var22, var20.field2971 & -16777216));
                     }
                  } else if (this.field1026[var18][var19] != null) {
                     class771 var23 = this.field1026[var18][var19];

                     for(int var24 = 0; var24 < var23.field11308; ++var24) {
                        arg10[var24] = var23.field11304[var24] * var14 / super.field4080 + var16;
                        arg11[var24] = var17 - var23.field11309[var24] * var14 / super.field4080;
                     }

                     for(int var25 = 0; var25 < var23.field11305; ++var25) {
                        int var26 = var25 * 3;
                        int var27 = var26 + 1;
                        int var28 = var27 + 1;
                        int var29 = arg10[var26];
                        int var30 = arg10[var27];
                        int var31 = arg10[var28];
                        int var32 = arg11[var26];
                        int var33 = arg11[var27];
                        int var34 = arg11[var28];
                        if (var23.field11300 != null && var23.field11300[var25] != 0 && (var23.field11306 == null || var23.field11306 != null && var23.field11306[var25] == -1)) {
                           int var35 = var23.field11300[var25];
                           arg9.method4322((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, class599.method4382(101, var35, -16777216 - (var23.field11302[var26] & -16777216)), class599.method4382(-75, var35, -16777216 - (var23.field11302[var27] & -16777216)), class599.method4382(121, var35, -16777216 - (var23.field11302[var28] & -16777216)));
                        } else if (var23.field11306 != null && var23.field11306[var25] != -1) {
                           int var36 = this.field1014.method3938(var23.field11306[var25]);
                           arg9.method4314((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)var36, (float)var36, (float)var36);
                        } else {
                           arg9.method4322((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, var23.field11302[var26], var23.field11302[var27], var23.field11302[var28]);
                        }
                     }
                  }
               } else if (this.field1021[var18][var19] != null) {
                  class588 var37 = this.field1021[var18][var19];

                  for(int var38 = 0; var38 < var37.field8704; ++var38) {
                     arg10[var38] = var37.field8706[var38] * var14 / super.field4080 + var16;
                     arg11[var38] = var17 - var37.field8705[var38] * var14 / super.field4080;
                  }

                  for(int var39 = 0; var39 < var37.field8699; ++var39) {
                     int var40 = var39 * 3;
                     int var41 = var40 + 1;
                     int var42 = var41 + 1;
                     int var43 = arg10[var40];
                     int var44 = arg10[var41];
                     int var45 = arg10[var42];
                     int var46 = arg11[var40];
                     int var47 = arg11[var41];
                     int var48 = arg11[var42];
                     if (var37.field8700 != null && var37.field8700[var39] != 0) {
                        int var49 = var37.field8700[var39];
                        arg9.method4322((float)var46, (float)var47, (float)var48, (float)var43, (float)var44, (float)var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                     } else {
                        arg9.method4322((float)var46, (float)var47, (float)var48, (float)var43, (float)var44, (float)var45, 100.0F, 100.0F, 100.0F, var37.field8698[var40], var37.field8698[var41], var37.field8698[var42]);
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = arg1 + var13;
         var16 += var14;
      }

      arg9.field8657 = true;
      this.field1014.method622(var15);
   }

   @OriginalMember(
      owner = "client!qw",
      name = "ka",
      descriptor = "(III)V",
      line = 3196
   )
   public final void method789(int arg0, int arg1, int arg2) {
      if (this.field1017[arg0][arg1] < arg2) {
         this.field1017[arg0][arg1] = (byte)arg2;
      }

   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(II)V",
      line = 3201
   )
   public final void method790(int arg0, int arg1) {
      this.method785(arg0, arg1, 0);
   }
}
