import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class676 extends class293 {
   @OriginalMember(
      owner = "client!fh",
      name = "E",
      descriptor = "I"
   )
   private int field9923 = -1;
   @OriginalMember(
      owner = "client!fh",
      name = "q",
      descriptor = "Llga;"
   )
   private class739 field9903;
   @OriginalMember(
      owner = "client!fh",
      name = "C",
      descriptor = "I"
   )
   private int field9917;
   @OriginalMember(
      owner = "client!fh",
      name = "p",
      descriptor = "[[B"
   )
   private byte[][] field9910;
   @OriginalMember(
      owner = "client!fh",
      name = "x",
      descriptor = "[[B"
   )
   private byte[][] field9921;
   @OriginalMember(
      owner = "client!fh",
      name = "w",
      descriptor = "F"
   )
   private float field9904;
   @OriginalMember(
      owner = "client!fh",
      name = "o",
      descriptor = "F"
   )
   private float field9905;
   @OriginalMember(
      owner = "client!fh",
      name = "z",
      descriptor = "F"
   )
   private float field9906;
   @OriginalMember(
      owner = "client!fh",
      name = "B",
      descriptor = "F"
   )
   private float field9907;
   @OriginalMember(
      owner = "client!fh",
      name = "y",
      descriptor = "F"
   )
   private float field9908;
   @OriginalMember(
      owner = "client!fh",
      name = "v",
      descriptor = "F"
   )
   private float field9911;
   @OriginalMember(
      owner = "client!fh",
      name = "k",
      descriptor = "F"
   )
   private float field9912;
   @OriginalMember(
      owner = "client!fh",
      name = "s",
      descriptor = "F"
   )
   private float field9913;
   @OriginalMember(
      owner = "client!fh",
      name = "j",
      descriptor = "F"
   )
   private float field9914;
   @OriginalMember(
      owner = "client!fh",
      name = "r",
      descriptor = "F"
   )
   private float field9918;
   @OriginalMember(
      owner = "client!fh",
      name = "l",
      descriptor = "F"
   )
   private float field9919;
   @OriginalMember(
      owner = "client!fh",
      name = "D",
      descriptor = "F"
   )
   private float field9922;
   @OriginalMember(
      owner = "client!fh",
      name = "m",
      descriptor = "[[Ldi;"
   )
   private class137[][] field9909;
   @OriginalMember(
      owner = "client!fh",
      name = "t",
      descriptor = "[[Luha;"
   )
   private class254[][] field9916;
   @OriginalMember(
      owner = "client!fh",
      name = "A",
      descriptor = "[[Lel;"
   )
   private class571[][] field9920;
   @OriginalMember(
      owner = "client!fh",
      name = "n",
      descriptor = "[[Lnh;"
   )
   private class777[][] field9915;
   @OriginalMember(
      owner = "client!fh",
      name = "u",
      descriptor = "[[Lff;"
   )
   private class9[][] field9902;

   @OriginalMember(
      owner = "client!fh",
      name = "ka",
      descriptor = "(III)V"
   )
   public final void method2280(int arg0, int arg1, int arg2) {
      if (this.field9921[arg0][arg1] < arg2) {
         this.field9921[arg0][arg1] = (byte)arg2;
      }

   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(III[[ZZII)V"
   )
   public final void method2291(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
      class784 var8 = this.field9903.field10617;
      this.field9923 = arg5;
      this.field9906 = var8.field11475;
      this.field9913 = var8.field11499;
      this.field9919 = var8.field11493;
      this.field9905 = var8.field11485;
      this.field9918 = var8.field11481;
      this.field9907 = var8.field11473;
      this.field9908 = var8.field11476;
      this.field9911 = var8.field11495;
      this.field9914 = var8.field11487;
      this.field9912 = var8.field11479;
      this.field9904 = var8.field11500;
      this.field9922 = var8.field11492;

      for(int var9 = 0; var9 < arg2 + arg2; ++var9) {
         for(int var10 = 0; var10 < arg2 + arg2; ++var10) {
            if (arg3[var9][var10]) {
               int var11 = arg0 - arg2 + var9;
               int var12 = arg1 - arg2 + var10;
               if (var11 >= 0 && var11 < super.field4080 && var12 >= 0 && var12 < super.field4077) {
                  this.method4941(var11, var12, arg6);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!fh",
      name = "fa",
      descriptor = "(IILr;)Lr;"
   )
   public final class192 method2286(int arg0, int arg1, class192 arg2) {
      return null;
   }

   @OriginalMember(
      owner = "client!fh",
      name = "b",
      descriptor = "(II)I"
   )
   private static final int method4938(int arg0, int arg1) {
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
      owner = "client!fh",
      name = "b",
      descriptor = "(IIZLdaa;Lom;[I[I[I[II)V"
   )
   private final void method4939(int arg0, int arg1, boolean arg2, class12 arg3, class390 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
      class777 var11 = this.field9915[arg0][arg1];
      if (arg9 == 0 || (arg9 & 2) == 0) {
         if (var11 != null) {
            if (this.field9923 == -1) {
               for(int var12 = 0; var12 < var11.field11360; ++var12) {
                  int var13 = (arg0 << super.field4081) + var11.field11358[var12];
                  int var14 = var11.field11363[var12];
                  int var15 = (arg1 << super.field4081) + var11.field11365[var12];
                  float var16 = (float)var15 * this.field9904 + (float)var13 * this.field9914 + (float)var14 * this.field9912 + this.field9922;
                  if (var16 <= (float)this.field9903.field10628) {
                     return;
                  }

                  arg8[var12] = 0;
                  if (arg2) {
                     int var17 = (int)(var16 - (float)arg3.field138);
                     if (var17 > 255) {
                        var17 = 255;
                     }

                     if (var17 > 0) {
                        arg8[var12] = var17;
                        int var18 = var11.field11362[var12] * var17 / 255;
                        if (var18 > 0) {
                           var14 -= var18;
                        }
                     }
                  } else if (arg3.field137) {
                     int var19 = (int)(var16 - (float)arg3.field138);
                     if (var19 > 0) {
                        arg8[var12] = var19;
                        if (arg8[var12] > 255) {
                           arg8[var12] = 255;
                        }
                     }
                  }

                  float var20 = (float)var15 * this.field9919 + (float)var13 * this.field9906 + (float)var14 * this.field9913 + this.field9905;
                  float var21 = (float)var15 * this.field9908 + (float)var13 * this.field9918 + (float)var14 * this.field9907 + this.field9911;
                  arg5[var12] = (int)((float)this.field9903.field10622 * var20 / var16) + arg4.field5748;
                  arg6[var12] = (int)((float)this.field9903.field10646 * var21 / var16) + arg4.field5756;
                  arg7[var12] = (int)var16;
               }
            } else {
               for(int var22 = 0; var22 < var11.field11360; ++var22) {
                  int var36 = (arg0 << super.field4081) + var11.field11358[var22];
                  int var37 = var11.field11363[var22];
                  int var38 = (arg1 << super.field4081) + var11.field11365[var22];
                  float var39 = (float)var38 * this.field9904 + (float)var36 * this.field9914 + (float)var37 * this.field9912 + this.field9922;
                  arg8[var22] = 0;
                  if (arg2) {
                     int var40 = this.field9923 - arg3.field138;
                     if (var40 > 255) {
                        var40 = 255;
                     }

                     if (var40 > 0) {
                        arg8[var22] = var40;
                        int var41 = var11.field11362[var22] * var40 / 255;
                        if (var41 > 0) {
                           var37 -= var41;
                        }
                     }
                  } else if (arg3.field137) {
                     int var42 = this.field9923 - arg3.field138;
                     if (var42 > 0) {
                        arg8[var22] = var42;
                        if (arg8[var22] > 255) {
                           arg8[var22] = 255;
                        }
                     }
                  }

                  float var43 = (float)var38 * this.field9919 + (float)var36 * this.field9906 + (float)var37 * this.field9913 + this.field9905;
                  float var44 = (float)var38 * this.field9908 + (float)var36 * this.field9918 + (float)var37 * this.field9907 + this.field9911;
                  arg5[var22] = (int)((float)this.field9903.field10622 * var43 / (float)this.field9923) + arg4.field5748;
                  arg6[var22] = (int)((float)this.field9903.field10646 * var44 / (float)this.field9923) + arg4.field5756;
                  arg7[var22] = (int)var39;
               }
            }

            float var23 = (float)super.field4083;

            for(int var24 = 0; var24 < var11.field11359; ++var24) {
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
                  arg4.field5757 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field5761 || var29 > arg4.field5761 || var30 > arg4.field5761;
                  if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                     int var34 = arg0 << super.field4081;
                     int var35 = arg1 << super.field4081;
                     if ((var11.field11366[var25] & 16777215) != 0) {
                        if (var11.field11367[var25] == var11.field11367[var26] && var11.field11367[var25] == var11.field11367[var27] && var11.field11364[var25] == var11.field11364[var26] && var11.field11364[var25] == var11.field11364[var27]) {
                           arg4.method3039((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], (float)(var11.field11358[var25] + var34) / (float)var11.field11364[var25], (float)(var11.field11358[var26] + var34) / (float)var11.field11364[var26], (float)(var11.field11358[var27] + var34) / (float)var11.field11364[var27], (float)(var11.field11365[var25] + var35) / (float)var11.field11364[var25], (float)(var11.field11365[var26] + var35) / (float)var11.field11364[var26], (float)(var11.field11365[var27] + var35) / (float)var11.field11364[var27], var11.field11366[var25], var11.field11366[var26], var11.field11366[var27], arg3.field135, arg8[var25], arg8[var26], arg8[var27], var11.field11367[var25]);
                        } else {
                           arg4.method3021((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], (float)(var11.field11358[var25] + var34) / var23, (float)(var11.field11358[var26] + var34) / var23, (float)(var11.field11358[var27] + var34) / var23, (float)(var11.field11365[var25] + var35) / var23, (float)(var11.field11365[var26] + var35) / var23, (float)(var11.field11365[var27] + var35) / var23, var11.field11366[var25], var11.field11366[var26], var11.field11366[var27], arg3.field135, arg8[var25], arg8[var26], arg8[var27], var11.field11367[var25], var23 / (float)var11.field11364[var25], var11.field11367[var26], var23 / (float)var11.field11364[var26], var11.field11367[var27], var23 / (float)var11.field11364[var27]);
                        }
                     }
                  } else {
                     arg4.method3037((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], arg3.field135);
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(IIZLdaa;Lom;[I[I[I[II)V"
   )
   private final void method4940(int arg0, int arg1, boolean arg2, class12 arg3, class390 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
      class137 var11 = this.field9909[arg0][arg1];
      if (var11 != null) {
         if ((var11.field2239 & 2) == 0) {
            if (arg9 != 0) {
               if ((var11.field2239 & 4) != 0) {
                  if ((arg9 & 1) != 0) {
                     return;
                  }
               } else if ((arg9 & 2) != 0) {
                  return;
               }
            }

            int var12 = super.field4083 * arg0;
            int var13 = super.field4083 + var12;
            int var14 = super.field4083 * arg1;
            int var15 = super.field4083 + var14;
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
            if ((var11.field2239 & 1) != 0 && !arg2) {
               int var20 = super.field4078[arg0][arg1];
               float var21 = (float)var20 * this.field9912;
               if (this.field9923 == -1) {
                  var22 = (float)var14 * this.field9904 + (float)var12 * this.field9914 + var21 + this.field9922;
                  if (var22 <= (float)this.field9903.field10628) {
                     return;
                  }

                  var23 = (float)var14 * this.field9904 + (float)var13 * this.field9914 + var21 + this.field9922;
                  if (var23 <= (float)this.field9903.field10628) {
                     return;
                  }

                  var24 = (float)var15 * this.field9904 + (float)var13 * this.field9914 + var21 + this.field9922;
                  if (var24 <= (float)this.field9903.field10628) {
                     return;
                  }

                  var25 = (float)var15 * this.field9904 + (float)var12 * this.field9914 + var21 + this.field9922;
                  if (var25 <= (float)this.field9903.field10628) {
                     return;
                  }
               } else {
                  var22 = (float)var14 * this.field9904 + (float)var12 * this.field9914 + var21 + this.field9922;
                  var23 = (float)var14 * this.field9904 + (float)var13 * this.field9914 + var21 + this.field9922;
                  var24 = (float)var15 * this.field9904 + (float)var13 * this.field9914 + var21 + this.field9922;
                  var25 = (float)var15 * this.field9904 + (float)var12 * this.field9914 + var21 + this.field9922;
               }

               if (arg3.field137) {
                  int var26 = (int)(var22 - (float)arg3.field138);
                  if (var26 > 0) {
                     var16 = var26;
                     if (var26 > 255) {
                        var16 = 255;
                     }
                  }

                  int var27 = (int)(var23 - (float)arg3.field138);
                  if (var27 > 0) {
                     var17 = var27;
                     if (var27 > 255) {
                        var17 = 255;
                     }
                  }

                  int var28 = (int)(var24 - (float)arg3.field138);
                  if (var28 > 0) {
                     var18 = var28;
                     if (var28 > 255) {
                        var18 = 255;
                     }
                  }

                  int var29 = (int)(var25 - (float)arg3.field138);
                  if (var29 > 0) {
                     var19 = var29;
                     if (var29 > 255) {
                        var19 = 255;
                     }
                  }
               }

               float var30 = (float)var20 * this.field9913;
               float var31 = (float)var20 * this.field9907;
               if (this.field9923 == -1) {
                  float var32 = (float)var14 * this.field9919 + (float)var12 * this.field9906 + var30 + this.field9905;
                  var33 = (int)((float)this.field9903.field10622 * var32 / var22) + arg4.field5748;
                  float var34 = (float)var14 * this.field9908 + (float)var12 * this.field9918 + var31 + this.field9911;
                  var35 = (int)((float)this.field9903.field10646 * var34 / var22) + arg4.field5756;
                  float var36 = (float)var14 * this.field9919 + (float)var13 * this.field9906 + var30 + this.field9905;
                  var37 = (int)((float)this.field9903.field10622 * var36 / var23) + arg4.field5748;
                  float var38 = (float)var14 * this.field9908 + (float)var13 * this.field9918 + var31 + this.field9911;
                  var39 = (int)((float)this.field9903.field10646 * var38 / var23) + arg4.field5756;
                  float var40 = (float)var15 * this.field9919 + (float)var13 * this.field9906 + var30 + this.field9905;
                  var41 = (int)((float)this.field9903.field10622 * var40 / var24) + arg4.field5748;
                  float var42 = (float)var15 * this.field9908 + (float)var13 * this.field9918 + var31 + this.field9911;
                  var43 = (int)((float)this.field9903.field10646 * var42 / var24) + arg4.field5756;
                  float var44 = (float)var15 * this.field9919 + (float)var12 * this.field9906 + var30 + this.field9905;
                  var45 = (int)((float)this.field9903.field10622 * var44 / var25) + arg4.field5748;
                  float var46 = (float)var15 * this.field9908 + (float)var12 * this.field9918 + var31 + this.field9911;
                  var47 = (int)((float)this.field9903.field10646 * var46 / var25) + arg4.field5756;
               } else {
                  float var48 = (float)var14 * this.field9919 + (float)var12 * this.field9906 + var30 + this.field9905;
                  var33 = (int)((float)this.field9903.field10622 * var48 / (float)this.field9923) + arg4.field5748;
                  float var49 = (float)var14 * this.field9908 + (float)var12 * this.field9918 + var31 + this.field9911;
                  var35 = (int)((float)this.field9903.field10646 * var49 / (float)this.field9923) + arg4.field5756;
                  float var50 = (float)var14 * this.field9919 + (float)var13 * this.field9906 + var30 + this.field9905;
                  var37 = (int)((float)this.field9903.field10622 * var50 / (float)this.field9923) + arg4.field5748;
                  float var51 = (float)var14 * this.field9908 + (float)var13 * this.field9918 + var31 + this.field9911;
                  var39 = (int)((float)this.field9903.field10646 * var51 / (float)this.field9923) + arg4.field5756;
                  float var52 = (float)var15 * this.field9919 + (float)var13 * this.field9906 + var30 + this.field9905;
                  var41 = (int)((float)this.field9903.field10622 * var52 / (float)this.field9923) + arg4.field5748;
                  float var53 = (float)var15 * this.field9908 + (float)var13 * this.field9918 + var31 + this.field9911;
                  var43 = (int)((float)this.field9903.field10646 * var53 / (float)this.field9923) + arg4.field5756;
                  float var54 = (float)var15 * this.field9919 + (float)var12 * this.field9906 + var30 + this.field9905;
                  var45 = (int)((float)this.field9903.field10622 * var54 / (float)this.field9923) + arg4.field5748;
                  float var55 = (float)var15 * this.field9908 + (float)var12 * this.field9918 + var31 + this.field9911;
                  var47 = (int)((float)this.field9903.field10646 * var55 / (float)this.field9923) + arg4.field5756;
               }
            } else {
               int var56 = super.field4078[arg0][arg1];
               int var57 = super.field4078[arg0 + 1][arg1];
               int var58 = super.field4078[arg0 + 1][arg1 + 1];
               int var59 = super.field4078[arg0][arg1 + 1];
               if (this.field9923 == -1) {
                  var22 = (float)var14 * this.field9904 + (float)var12 * this.field9914 + (float)var56 * this.field9912 + this.field9922;
                  if (var22 <= (float)this.field9903.field10628) {
                     return;
                  }

                  var23 = (float)var14 * this.field9904 + (float)var13 * this.field9914 + (float)var57 * this.field9912 + this.field9922;
                  if (var23 <= (float)this.field9903.field10628) {
                     return;
                  }

                  var24 = (float)var15 * this.field9904 + (float)var13 * this.field9914 + (float)var58 * this.field9912 + this.field9922;
                  if (var24 <= (float)this.field9903.field10628) {
                     return;
                  }

                  var25 = (float)var15 * this.field9904 + (float)var12 * this.field9914 + (float)var59 * this.field9912 + this.field9922;
                  if (var25 <= (float)this.field9903.field10628) {
                     return;
                  }
               } else {
                  var22 = (float)var14 * this.field9904 + (float)var12 * this.field9914 + (float)var56 * this.field9912 + this.field9922;
                  var23 = (float)var14 * this.field9904 + (float)var13 * this.field9914 + (float)var57 * this.field9912 + this.field9922;
                  var24 = (float)var15 * this.field9904 + (float)var13 * this.field9914 + (float)var58 * this.field9912 + this.field9922;
                  var25 = (float)var15 * this.field9904 + (float)var12 * this.field9914 + (float)var59 * this.field9912 + this.field9922;
               }

               if (arg2) {
                  int var60 = (int)(var22 - (float)arg3.field138);
                  if (var60 > 255) {
                     var60 = 255;
                  }

                  if (var60 > 0) {
                     var16 = var60;
                     int var61 = var11.field2230 * var60 / 255;
                     if (var61 > 0) {
                        var56 -= var61;
                     }
                  }

                  int var62 = (int)(var23 - (float)arg3.field138);
                  if (var62 > 255) {
                     var62 = 255;
                  }

                  if (var62 > 0) {
                     var17 = var62;
                     int var63 = var11.field2235 * var62 / 255;
                     if (var63 > 0) {
                        var57 -= var63;
                     }
                  }

                  int var64 = (int)(var24 - (float)arg3.field138);
                  if (var64 > 255) {
                     var64 = 255;
                  }

                  if (var64 > 0) {
                     var18 = var64;
                     int var65 = var11.field2231 * var64 / 255;
                     if (var65 > 0) {
                        var58 -= var65;
                     }
                  }

                  int var66 = (int)(var25 - (float)arg3.field138);
                  if (var66 > 255) {
                     var66 = 255;
                  }

                  if (var66 > 0) {
                     var19 = var66;
                     int var67 = var11.field2238 * var66 / 255;
                     if (var67 > 0) {
                        var59 -= var67;
                     }
                  }
               } else if (arg3.field137) {
                  int var68 = (int)(var22 - (float)arg3.field138);
                  if (var68 > 0) {
                     var16 = var68;
                     if (var68 > 255) {
                        var16 = 255;
                     }
                  }

                  int var69 = (int)(var23 - (float)arg3.field138);
                  if (var69 > 0) {
                     var17 = var69;
                     if (var69 > 255) {
                        var17 = 255;
                     }
                  }

                  int var70 = (int)(var24 - (float)arg3.field138);
                  if (var70 > 0) {
                     var18 = var70;
                     if (var70 > 255) {
                        var18 = 255;
                     }
                  }

                  int var71 = (int)(var25 - (float)arg3.field138);
                  if (var71 > 0) {
                     var19 = var71;
                     if (var71 > 255) {
                        var19 = 255;
                     }
                  }
               }

               if (this.field9923 == -1) {
                  float var72 = (float)var14 * this.field9919 + (float)var12 * this.field9906 + (float)var56 * this.field9913 + this.field9905;
                  var33 = (int)((float)this.field9903.field10622 * var72 / var22) + arg4.field5748;
                  float var73 = (float)var14 * this.field9908 + (float)var12 * this.field9918 + (float)var56 * this.field9907 + this.field9911;
                  var35 = (int)((float)this.field9903.field10646 * var73 / var22) + arg4.field5756;
                  float var74 = (float)var14 * this.field9919 + (float)var13 * this.field9906 + (float)var57 * this.field9913 + this.field9905;
                  var37 = (int)((float)this.field9903.field10622 * var74 / var23) + arg4.field5748;
                  float var75 = (float)var14 * this.field9908 + (float)var13 * this.field9918 + (float)var57 * this.field9907 + this.field9911;
                  var39 = (int)((float)this.field9903.field10646 * var75 / var23) + arg4.field5756;
                  float var76 = (float)var15 * this.field9919 + (float)var13 * this.field9906 + (float)var58 * this.field9913 + this.field9905;
                  var41 = (int)((float)this.field9903.field10622 * var76 / var24) + arg4.field5748;
                  float var77 = (float)var15 * this.field9908 + (float)var13 * this.field9918 + (float)var58 * this.field9907 + this.field9911;
                  var43 = (int)((float)this.field9903.field10646 * var77 / var24) + arg4.field5756;
                  float var78 = (float)var15 * this.field9919 + (float)var12 * this.field9906 + (float)var59 * this.field9913 + this.field9905;
                  var45 = (int)((float)this.field9903.field10622 * var78 / var25) + arg4.field5748;
                  float var79 = (float)var15 * this.field9908 + (float)var12 * this.field9918 + (float)var59 * this.field9907 + this.field9911;
                  var47 = (int)((float)this.field9903.field10646 * var79 / var25) + arg4.field5756;
               } else {
                  float var80 = (float)var14 * this.field9919 + (float)var12 * this.field9906 + (float)var56 * this.field9913 + this.field9905;
                  var33 = (int)((float)this.field9903.field10622 * var80 / (float)this.field9923) + arg4.field5748;
                  float var81 = (float)var14 * this.field9908 + (float)var12 * this.field9918 + (float)var56 * this.field9907 + this.field9911;
                  var35 = (int)((float)this.field9903.field10646 * var81 / (float)this.field9923) + arg4.field5756;
                  float var82 = (float)var14 * this.field9919 + (float)var13 * this.field9906 + (float)var57 * this.field9913 + this.field9905;
                  var37 = (int)((float)this.field9903.field10622 * var82 / (float)this.field9923) + arg4.field5748;
                  float var83 = (float)var14 * this.field9908 + (float)var13 * this.field9918 + (float)var57 * this.field9907 + this.field9911;
                  var39 = (int)((float)this.field9903.field10646 * var83 / (float)this.field9923) + arg4.field5756;
                  float var84 = (float)var15 * this.field9919 + (float)var13 * this.field9906 + (float)var58 * this.field9913 + this.field9905;
                  var41 = (int)((float)this.field9903.field10622 * var84 / (float)this.field9923) + arg4.field5748;
                  float var85 = (float)var15 * this.field9908 + (float)var13 * this.field9918 + (float)var58 * this.field9907 + this.field9911;
                  var43 = (int)((float)this.field9903.field10646 * var85 / (float)this.field9923) + arg4.field5756;
                  float var86 = (float)var15 * this.field9919 + (float)var12 * this.field9906 + (float)var59 * this.field9913 + this.field9905;
                  var45 = (int)((float)this.field9903.field10622 * var86 / (float)this.field9923) + arg4.field5748;
                  float var87 = (float)var15 * this.field9908 + (float)var12 * this.field9918 + (float)var59 * this.field9907 + this.field9911;
                  var47 = (int)((float)this.field9903.field10646 * var87 / (float)this.field9923) + arg4.field5756;
               }
            }

            boolean var88 = var11.field2240 != -1 && this.method4945(this.field9903.field1192.method1456(-8988, var11.field2240).field10167);
            if (this.field9923 == -1) {
               int var89 = var17 + var18 + var19;
               if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                  arg4.field5757 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field5761 || var45 > arg4.field5761 || var37 > arg4.field5761;
                  if (var89 < 765) {
                     if (var89 > 0) {
                        if (var11.field2240 >= 0) {
                           int var90 = -16777216;
                           if (var88) {
                              var90 = -1694498816;
                           }

                           arg4.method3039((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field2234 & 16777215, var90 | var11.field2236 & 16777215, var90 | var11.field2232 & 16777215, arg3.field135, var18, var19, var17, var11.field2240);
                        } else {
                           if (var88) {
                              arg4.field5760 = 100;
                           }

                           arg4.method3040((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), class625.method4581(var18 << 24 | arg3.field135, 255, var11.field2234), class625.method4581(var19 << 24 | arg3.field135, 255, var11.field2236), class625.method4581(var17 << 24 | arg3.field135, 255, var11.field2232));
                           arg4.field5760 = 0;
                        }
                     } else if (var11.field2240 >= 0) {
                        int var91 = -16777216;
                        if (var88) {
                           var91 = -1694498816;
                        }

                        arg4.method3039((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field2234 & 16777215, var91 | var11.field2236 & 16777215, var91 | var11.field2232 & 16777215, 0, 0, 0, 0, var11.field2240);
                     } else {
                        if (var88) {
                           arg4.field5760 = 100;
                        }

                        arg4.method3040((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), var11.field2234, var11.field2236, var11.field2232);
                        arg4.field5760 = 0;
                     }
                  } else {
                     arg4.method3037((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), arg3.field135);
                  }
               }

               int var92 = var16 + var17 + var19;
               if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                  arg4.field5757 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field5761 || var37 > arg4.field5761 || var45 > arg4.field5761;
                  if (var92 < 765) {
                     if (var88) {
                        arg4.field5760 = -1694498816;
                     }

                     if (var92 > 0) {
                        if (var11.field2240 >= 0) {
                           int var93 = -16777216;
                           if (var88) {
                              var93 = -1694498816;
                           }

                           arg4.method3039((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field2237 & 16777215, var93 | var11.field2232 & 16777215, var93 | var11.field2236 & 16777215, arg3.field135, var16, var17, var19, var11.field2240);
                           return;
                        }

                        if (var88) {
                           arg4.field5760 = 100;
                        }

                        arg4.method3040((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), class625.method4581(var16 << 24 | arg3.field135, 255, var11.field2237), class625.method4581(var17 << 24 | arg3.field135, 255, var11.field2232), class625.method4581(var19 << 24 | arg3.field135, 255, var11.field2236));
                        arg4.field5760 = 0;
                        return;
                     }

                     if (var11.field2240 >= 0) {
                        int var94 = -16777216;
                        if (var88) {
                           var94 = -1694498816;
                        }

                        arg4.method3039((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field2237 & 16777215, var94 | var11.field2232 & 16777215, var94 | var11.field2236 & 16777215, 0, 0, 0, 0, var11.field2240);
                        return;
                     }

                     if (var88) {
                        arg4.field5760 = 100;
                     }

                     arg4.method3040((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), var11.field2237, var11.field2232, var11.field2236);
                     arg4.field5760 = 0;
                     return;
                  }

                  arg4.method3037((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), arg3.field135);
                  return;
               }
            } else {
               int var95 = var17 + var18 + var19;
               if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                  arg4.field5757 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field5761 || var45 > arg4.field5761 || var37 > arg4.field5761;
                  if (var95 < 765) {
                     if (var88) {
                        arg4.field5760 = -1694498816;
                     }

                     if (var95 > 0) {
                        if (var11.field2240 >= 0) {
                           int var96 = -16777216;
                           if (var88) {
                              var96 = -1694498816;
                           }

                           arg4.method3039((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field2234 & 16777215, var96 | var11.field2236 & 16777215, var96 | var11.field2232 & 16777215, arg3.field135, var18, var19, var17, var11.field2240);
                        } else {
                           if (var88) {
                              arg4.field5760 = 100;
                           }

                           arg4.method3040((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), class625.method4581(var18 << 24 | arg3.field135, 255, var11.field2234), class625.method4581(var19 << 24 | arg3.field135, 255, var11.field2236), class625.method4581(var17 << 24 | arg3.field135, 255, var11.field2232));
                           arg4.field5760 = 0;
                        }
                     } else if (var11.field2240 >= 0) {
                        int var97 = -16777216;
                        if (var88) {
                           var97 = -1694498816;
                        }

                        arg4.method3039((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field2234 & 16777215, var97 | var11.field2236 & 16777215, var97 | var11.field2232 & 16777215, 0, 0, 0, 0, var11.field2240);
                     } else {
                        if (var88) {
                           arg4.field5760 = 100;
                        }

                        arg4.method3040((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), var11.field2234, var11.field2236, var11.field2232);
                        arg4.field5760 = 0;
                     }
                  } else {
                     arg4.method3037((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), arg3.field135);
                  }
               }

               int var98 = var16 + var17 + var19;
               if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                  arg4.field5757 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field5761 || var37 > arg4.field5761 || var45 > arg4.field5761;
                  if (var98 < 765) {
                     if (var88) {
                        arg4.field5760 = -1694498816;
                     }

                     if (var98 > 0) {
                        if (var11.field2240 >= 0) {
                           int var99 = -16777216;
                           if (var88) {
                              var99 = -1694498816;
                           }

                           arg4.method3039((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field2237 & 16777215, var99 | var11.field2232 & 16777215, var99 | var11.field2236 & 16777215, arg3.field135, var16, var17, var19, var11.field2240);
                           return;
                        }

                        if (var88) {
                           arg4.field5760 = 100;
                        }

                        arg4.method3040((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), class625.method4581(var16 << 24 | arg3.field135, 255, var11.field2237), class625.method4581(var17 << 24 | arg3.field135, 255, var11.field2232), class625.method4581(var19 << 24 | arg3.field135, 255, var11.field2236));
                        arg4.field5760 = 0;
                        return;
                     }

                     if (var11.field2240 >= 0) {
                        int var100 = -16777216;
                        if (var88) {
                           var100 = -1694498816;
                        }

                        arg4.method3039((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field2237 & 16777215, var100 | var11.field2232 & 16777215, var100 | var11.field2236 & 16777215, 0, 0, 0, 0, var11.field2240);
                        return;
                     }

                     if (var88) {
                        arg4.field5760 = 100;
                     }

                     arg4.method3040((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), var11.field2237, var11.field2232, var11.field2236);
                     arg4.field5760 = 0;
                     return;
                  }

                  arg4.method3037((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), arg3.field135);
               }
            }

         }
      } else {
         class571 var101 = this.field9920[arg0][arg1];
         if (var101 != null) {
            if (arg9 != 0) {
               if ((var101.field8262 & 4) != 0) {
                  if ((arg9 & 1) != 0) {
                     return;
                  }
               } else if ((arg9 & 2) != 0) {
                  return;
               }
            }

            if (this.field9923 == -1) {
               for(int var102 = 0; var102 < var101.field8260; ++var102) {
                  int var103 = (arg0 << super.field4081) + var101.field8256[var102];
                  int var104 = var101.field8263[var102];
                  int var105 = (arg1 << super.field4081) + var101.field8259[var102];
                  float var106 = (float)var105 * this.field9904 + (float)var103 * this.field9914 + (float)var104 * this.field9912 + this.field9922;
                  if (var106 <= (float)this.field9903.field10628) {
                     return;
                  }

                  arg8[var102] = 0;
                  if (arg2) {
                     int var107 = (int)(var106 - (float)arg3.field138);
                     if (var107 > 255) {
                        var107 = 255;
                     }

                     if (var107 > 0) {
                        arg8[var102] = var107;
                        int var108 = var101.field8258[var102] * var107 / 255;
                        if (var108 > 0) {
                           var104 -= var108;
                        }
                     }
                  } else if (arg3.field137) {
                     int var109 = (int)(var106 - (float)arg3.field138);
                     if (var109 > 0) {
                        arg8[var102] = var109;
                        if (arg8[var102] > 255) {
                           arg8[var102] = 255;
                        }
                     }
                  }

                  float var110 = (float)var105 * this.field9919 + (float)var103 * this.field9906 + (float)var104 * this.field9913 + this.field9905;
                  float var111 = (float)var105 * this.field9908 + (float)var103 * this.field9918 + (float)var104 * this.field9907 + this.field9911;
                  arg5[var102] = (int)((float)this.field9903.field10622 * var110 / var106) + arg4.field5748;
                  arg6[var102] = (int)((float)this.field9903.field10646 * var111 / var106) + arg4.field5756;
                  arg7[var102] = (int)var106;
               }
            } else {
               for(int var112 = 0; var112 < var101.field8260; ++var112) {
                  int var152 = (arg0 << super.field4081) + var101.field8256[var112];
                  int var153 = var101.field8263[var112];
                  int var154 = (arg1 << super.field4081) + var101.field8259[var112];
                  float var155 = (float)var154 * this.field9904 + (float)var152 * this.field9914 + (float)var153 * this.field9912 + this.field9922;
                  arg8[var112] = 0;
                  if (arg2) {
                     int var156 = this.field9923 - arg3.field138;
                     if (var156 > 255) {
                        var156 = 255;
                     }

                     if (var156 > 0) {
                        arg8[var112] = var156;
                        int var157 = var101.field8258[var112] * var156 / 255;
                        if (var157 > 0) {
                           var153 -= var157;
                        }
                     }
                  } else if (arg3.field137) {
                     int var158 = this.field9923 - arg3.field138;
                     if (var158 > 0) {
                        arg8[var112] = var158;
                        if (arg8[var112] > 255) {
                           arg8[var112] = 255;
                        }
                     }
                  }

                  float var159 = (float)var154 * this.field9919 + (float)var152 * this.field9906 + (float)var153 * this.field9913 + this.field9905;
                  float var160 = (float)var154 * this.field9908 + (float)var152 * this.field9918 + (float)var153 * this.field9907 + this.field9911;
                  arg5[var112] = (int)((float)this.field9903.field10622 * var159 / (float)this.field9923) + arg4.field5748;
                  arg6[var112] = (int)((float)this.field9903.field10646 * var160 / (float)this.field9923) + arg4.field5756;
                  arg7[var112] = (int)var155;
               }
            }

            if (var101.field8261 != null) {
               if (this.field9923 == -1) {
                  for(int var113 = 0; var113 < var101.field8255; ++var113) {
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
                        arg4.field5757 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field5761 || var118 > arg4.field5761 || var119 > arg4.field5761;
                        short var124 = var101.field8261[var113];
                        if (var123 < 765) {
                           if (var123 > 0) {
                              if (var124 != -1) {
                                 int var125 = -16777216;
                                 if (var124 != -1 && this.method4945(this.field9903.field1192.method1456(-8988, var124).field10167)) {
                                    var125 = -1694498816;
                                 }

                                 arg4.method3039((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], (float)var101.field8256[var114] / (float)super.field4083, (float)var101.field8256[var115] / (float)super.field4083, (float)var101.field8256[var116] / (float)super.field4083, (float)var101.field8259[var114] / (float)super.field4083, (float)var101.field8259[var115] / (float)super.field4083, (float)var101.field8259[var116] / (float)super.field4083, var125 | var101.field8264[var114] & 16777215, var125 | var101.field8264[var115] & 16777215, var125 | var101.field8264[var116] & 16777215, arg3.field135, arg8[var114], arg8[var115], arg8[var116], var124);
                              } else if ((var101.field8264[var114] & 16777215) != 0) {
                                 if (var124 != -1 && this.method4945(this.field9903.field1192.method1456(-8988, var124).field10167)) {
                                    arg4.field5760 = -1694498816;
                                 }

                                 arg4.method3040((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], class625.method4581(arg8[var114] << 24 | arg3.field135, 255, var101.field8264[var114]), class625.method4581(arg8[var115] << 24 | arg3.field135, 255, var101.field8264[var115]), class625.method4581(arg8[var116] << 24 | arg3.field135, 255, var101.field8264[var116]));
                                 arg4.field5760 = 0;
                              }
                           } else if (var124 != -1) {
                              int var126 = -16777216;
                              if (var124 != -1 && this.method4945(this.field9903.field1192.method1456(-8988, var124).field10167)) {
                                 var126 = -1694498816;
                              }

                              arg4.method3039((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], (float)var101.field8256[var114] / (float)super.field4083, (float)var101.field8256[var115] / (float)super.field4083, (float)var101.field8256[var116] / (float)super.field4083, (float)var101.field8259[var114] / (float)super.field4083, (float)var101.field8259[var115] / (float)super.field4083, (float)var101.field8259[var116] / (float)super.field4083, var126 | var101.field8264[var114] & 16777215, var126 | var101.field8264[var115] & 16777215, var126 | var101.field8264[var116] & 16777215, 0, 0, 0, 0, var124);
                           } else if ((var101.field8264[var114] & 16777215) != 0) {
                              if (var124 != -1 && this.method4945(this.field9903.field1192.method1456(-8988, var124).field10167)) {
                                 arg4.field5760 = -1694498816;
                              }

                              arg4.method3040((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], var101.field8264[var114], var101.field8264[var115], var101.field8264[var116]);
                              arg4.field5760 = 0;
                           }
                        } else {
                           arg4.method3037((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], arg3.field135);
                        }
                     }
                  }

                  return;
               }

               for(int var127 = 0; var127 < var101.field8255; ++var127) {
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
                     arg4.field5757 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field5761 || var132 > arg4.field5761 || var133 > arg4.field5761;
                     short var138 = var101.field8261[var127];
                     if (var137 < 765) {
                        if (var138 != -1 && this.method4945(this.field9903.field1192.method1456(-8988, var138).field10167)) {
                           arg4.field5760 = -1694498816;
                        }

                        if (var137 > 0) {
                           if (var138 != -1) {
                              int var139 = -16777216;
                              if (var138 != -1 && this.method4945(this.field9903.field1192.method1456(-8988, var138).field10167)) {
                                 var139 = -1694498816;
                              }

                              arg4.method3039((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], (float)var101.field8256[var128] / (float)super.field4083, (float)var101.field8256[var129] / (float)super.field4083, (float)var101.field8256[var130] / (float)super.field4083, (float)var101.field8259[var128] / (float)super.field4083, (float)var101.field8259[var129] / (float)super.field4083, (float)var101.field8259[var130] / (float)super.field4083, var139 | var101.field8264[var128] & 16777215, var139 | var101.field8264[var129] & 16777215, var139 | var101.field8264[var130] & 16777215, arg3.field135, arg8[var128], arg8[var129], arg8[var130], var138);
                           } else if ((var101.field8264[var128] & 16777215) != 0) {
                              if (var138 != -1 && this.method4945(this.field9903.field1192.method1456(-8988, var138).field10167)) {
                                 arg4.field5760 = -1694498816;
                              }

                              arg4.method3040((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], class625.method4581(arg8[var128] << 24 | arg3.field135, 255, var101.field8264[var128]), class625.method4581(arg8[var129] << 24 | arg3.field135, 255, var101.field8264[var129]), class625.method4581(arg8[var130] << 24 | arg3.field135, 255, var101.field8264[var130]));
                              arg4.field5760 = 0;
                           }
                        } else if (var138 != -1) {
                           int var140 = -16777216;
                           if (var138 != -1 && this.method4945(this.field9903.field1192.method1456(-8988, var138).field10167)) {
                              var140 = -1694498816;
                           }

                           arg4.method3039((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], (float)var101.field8256[var128] / (float)super.field4083, (float)var101.field8256[var129] / (float)super.field4083, (float)var101.field8256[var130] / (float)super.field4083, (float)var101.field8259[var128] / (float)super.field4083, (float)var101.field8259[var129] / (float)super.field4083, (float)var101.field8259[var130] / (float)super.field4083, var140 | var101.field8264[var128] & 16777215, var140 | var101.field8264[var129] & 16777215, var140 | var101.field8264[var130] & 16777215, 0, 0, 0, 0, var138);
                        } else if ((var101.field8264[var128] & 16777215) != 0) {
                           if (var138 != -1 && this.method4945(this.field9903.field1192.method1456(-8988, var138).field10167)) {
                              arg4.field5760 = -1694498816;
                           }

                           arg4.method3040((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], var101.field8264[var128], var101.field8264[var129], var101.field8264[var130]);
                           arg4.field5760 = 0;
                        }

                        arg4.field5760 = 0;
                     } else {
                        arg4.method3037((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], arg3.field135);
                     }
                  }
               }

               return;
            }

            for(int var141 = 0; var141 < var101.field8255; ++var141) {
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
                  arg4.field5757 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field5761 || var146 > arg4.field5761 || var147 > arg4.field5761;
                  if (var151 < 765) {
                     if (var151 > 0) {
                        if ((var101.field8264[var142] & 16777215) != 0) {
                           arg4.method3040((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], class586.method4344(arg3.field135, (byte)95, var101.field8264[var142], arg8[var142]), class586.method4344(arg3.field135, (byte)94, var101.field8264[var143], arg8[var143]), class586.method4344(arg3.field135, (byte)63, var101.field8264[var144], arg8[var144]));
                        }
                     } else if ((var101.field8264[var142] & 16777215) != 0) {
                        arg4.method3040((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], var101.field8264[var142], var101.field8264[var143], var101.field8264[var144]);
                     }
                  } else {
                     arg4.method3037((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], arg3.field135);
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(IIIIIII[[Z)V"
   )
   public final void method2290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
      class12 var9 = this.field9903.method5317(Thread.currentThread());
      class390 var10 = var9.field173;
      var10.field5760 = 0;
      var10.field5757 = true;
      this.field9903.method380();
      if (this.field9909 == null && this.field9915 == null) {
         if (this.field9916 != null) {
            this.method4943(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field178, var9.field168);
         }

      } else {
         this.method4942(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field178, var9.field168);
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "YA",
      descriptor = "()V"
   )
   public final void method2281() {
      this.field9910 = null;
      this.field9921 = null;
   }

   @OriginalMember(
      owner = "client!fh",
      name = "b",
      descriptor = "(III)V"
   )
   private final void method4941(int arg0, int arg1, int arg2) {
      class12 var4 = this.field9903.method5317(Thread.currentThread());
      var4.field173.field5760 = 0;
      if (this.field9909 != null) {
         this.method4940(arg0, arg1, var4.field130, var4, var4.field173, var4.field178, var4.field168, var4.field150, var4.field144, arg2);
      } else if (this.field9916 != null) {
         this.method4944(arg0, arg1, var4.field173, var4.field178, var4.field168, var4.field150, var4.field144, arg2);
      } else {
         if (this.field9915 != null) {
            this.method4939(arg0, arg1, var4.field130, var4, var4.field173, var4.field178, var4.field168, var4.field150, var4.field144, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V"
   )
   public final void method2285(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
   }

   @OriginalMember(
      owner = "client!fh",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public final void method2292(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
      boolean var15 = (this.field9917 & 32) == 0;
      if (this.field9909 == null && !var15) {
         this.field9909 = new class137[super.field4080][super.field4077];
         this.field9920 = new class571[super.field4080][super.field4077];
      } else if (this.field9915 == null && var15) {
         this.field9915 = new class777[super.field4080][super.field4077];
      } else if (this.field9916 != null) {
         throw new IllegalStateException();
      }

      if (arg2 != null && arg2.length != 0) {
         for(int var16 = 0; var16 < arg6.length; ++var16) {
            if (arg6[var16] == -1) {
               arg6[var16] = 0;
            } else {
               arg6[var16] = class634.field9255[class223.method1870(arg6[var16], 1859335297) & 65535] << 8 | 255;
            }
         }

         if (arg7 != null) {
            for(int var17 = 0; var17 < arg7.length; ++var17) {
               if (arg7[var17] == -1) {
                  arg7[var17] = 0;
               } else {
                  arg7[var17] = class634.field9255[class223.method1870(arg7[var17], 1859335297) & 65535] << 8 | 255;
               }
            }
         }

         if (var15) {
            class777 var18 = new class777();
            var18.field11360 = (short)arg2.length;
            var18.field11359 = (short)(arg2.length / 3);
            var18.field11358 = new short[var18.field11360];
            var18.field11363 = new short[var18.field11360];
            var18.field11365 = new short[var18.field11360];
            var18.field11366 = new int[var18.field11360];
            var18.field11367 = new short[var18.field11360];
            var18.field11364 = new short[var18.field11360];
            var18.field11361 = new byte[var18.field11360];
            if (arg5 != null) {
               var18.field11362 = new short[var18.field11360];
            }

            for(int var19 = 0; var19 < var18.field11360; ++var19) {
               int var22 = arg2[var19];
               int var23 = arg4[var19];
               boolean var24 = false;
               int var25;
               if (var22 == 0 && var23 == 0) {
                  var25 = this.field9910[arg0][arg1] - this.field9921[arg0][arg1];
               } else if (var22 == 0 && super.field4083 == var23) {
                  var25 = this.field9910[arg0][arg1 + 1] - this.field9921[arg0][arg1 + 1];
               } else if (super.field4083 == var22 && super.field4083 == var23) {
                  var25 = this.field9910[arg0 + 1][arg1 + 1] - this.field9921[arg0 + 1][arg1 + 1];
               } else if (super.field4083 == var22 && var23 == 0) {
                  var25 = this.field9910[arg0 + 1][arg1] - this.field9921[arg0 + 1][arg1];
               } else {
                  int var26 = (this.field9910[arg0 + 1][arg1] - this.field9921[arg0 + 1][arg1]) * var22 + (this.field9910[arg0][arg1] - this.field9921[arg0][arg1]) * (super.field4083 - var22);
                  int var27 = (this.field9910[arg0 + 1][arg1 + 1] - this.field9921[arg0 + 1][arg1 + 1]) * var22 + (this.field9910[arg0][arg1 + 1] - this.field9921[arg0][arg1 + 1]) * (super.field4083 - var22);
                  var25 = (super.field4083 - var23) * var26 + var23 * var27 >> super.field4081 * 2;
               }

               int var28 = (arg0 << super.field4081) + var22;
               int var29 = (arg1 << super.field4081) + var23;
               var18.field11358[var19] = (short)var22;
               var18.field11365[var19] = (short)var23;
               var18.field11363[var19] = (short)(this.method2287(-86, var29, var28) + (arg3 != null ? arg3[var19] : 0));
               if (var25 < 0) {
                  var25 = 0;
               }

               if (arg6[var19] == 0) {
                  var18.field11366[var19] = 0;
                  if (arg7 != null) {
                     var18.field11361[var19] = (byte)var25;
                  }
               } else {
                  int var30 = 0;
                  if (arg5 != null) {
                     short var31 = var18.field11362[var19] = (short)arg5[var19];
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
                  if (arg8[var19] != -1 && this.method4945(this.field9903.field1192.method1456(-8988, arg8[var19]).field10167)) {
                     var32 = -1694498816;
                  }

                  var18.field11366[var19] = var32 | class586.method4344(arg10, (byte)74, method4938(arg6[var19] >> 8, var25), var30);
                  if (arg7 != null) {
                     var18.field11361[var19] = (byte)var25;
                  }
               }

               var18.field11367[var19] = (short)arg8[var19];
               var18.field11364[var19] = (short)arg9[var19];
            }

            if (arg7 != null) {
               var18.field11368 = new int[var18.field11359];
            }

            for(int var20 = 0; var20 < var18.field11359; ++var20) {
               int var21 = var20 * 3;
               if (arg7 != null && arg7[var21] != 0) {
                  var18.field11368[var20] = -16777216 | arg7[var21] >> 8;
               }
            }

            this.field9915[arg0][arg1] = var18;
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
                  } else if (arg2[var38] == super.field4083 && arg4[var38] == 0) {
                     if (var35 != -1 && arg6[var35] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var35 = var38;
                  } else if (arg2[var38] == super.field4083 && arg4[var38] == super.field4083) {
                     if (var36 != -1 && arg6[var36] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var36 = var38;
                  } else if (arg2[var38] == 0 && arg4[var38] == super.field4083) {
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
                        if (arg2[var40] != arg2[0] && arg2[0] + super.field4083 != arg2[var40] && arg2[0] - super.field4083 != arg2[var40]) {
                           var33 = false;
                           break;
                        }

                        if (arg4[var40] != arg4[0] && arg4[0] + super.field4083 != arg4[var40] && arg4[0] - super.field4083 != arg4[var40]) {
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
               class137 var41 = new class137();
               int var42 = arg6[0];
               int var43 = arg8[0];
               if (arg7 != null) {
                  var41.field2233 = arg7[0] >> 8;
                  if (var42 == 0) {
                     var41.field2239 = (byte)(var41.field2239 | 2);
                  }
               } else if (var42 == 0) {
                  return;
               }

               if (super.field4078[arg0 + 1][arg1] == super.field4078[arg0][arg1] && super.field4078[arg0 + 1][arg1 + 1] == super.field4078[arg0][arg1] && super.field4078[arg0][arg1 + 1] == super.field4078[arg0][arg1]) {
                  var41.field2239 = (byte)(var41.field2239 | 1);
               }

               if (var43 != -1 && (var41.field2239 & 2) == 0 && !this.field9903.field1192.method1456(-8988, var43).field10175) {
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

                  var41.field2237 = class586.method4344(arg10, (byte)107, method4938(arg6[var34] >> 8, this.field9910[arg0][arg1] - this.field9921[arg0][arg1]), var44);
                  if (var41.field2233 != 0) {
                     var41.field2237 |= 255 - (this.field9910[arg0][arg1] - this.field9921[arg0][arg1]) << 25;
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

                  var41.field2232 = class586.method4344(arg10, (byte)110, method4938(arg6[var35] >> 8, this.field9910[arg0 + 1][arg1] - this.field9921[arg0 + 1][arg1]), var45);
                  if (var41.field2233 != 0) {
                     var41.field2232 |= 255 - (this.field9910[arg0 + 1][arg1] - this.field9921[arg0 + 1][arg1]) << 25;
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

                  var41.field2234 = class586.method4344(arg10, (byte)99, method4938(arg6[var36] >> 8, this.field9910[arg0 + 1][arg1 + 1] - this.field9921[arg0 + 1][arg1 + 1]), var46);
                  if (var41.field2233 != 0) {
                     var41.field2234 |= 255 - (this.field9910[arg0 + 1][arg1 + 1] - this.field9921[arg0 + 1][arg1 + 1]) << 25;
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

                  var41.field2236 = class586.method4344(arg10, (byte)103, method4938(arg6[var37] >> 8, this.field9910[arg0][arg1 + 1] - this.field9921[arg0][arg1 + 1]), var47);
                  var41.field2240 = (short)var43;
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

                  var41.field2237 = class586.method4344(arg10, (byte)61, method4938(arg6[var34] >> 8, this.field9910[arg0][arg1] - this.field9921[arg0][arg1]), var48);
                  if (var41.field2233 != 0) {
                     var41.field2237 |= 255 - (this.field9910[arg0][arg1] - this.field9921[arg0][arg1]) << 25;
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

                  var41.field2232 = class586.method4344(arg10, (byte)88, method4938(arg6[var35] >> 8, this.field9910[arg0 + 1][arg1] - this.field9921[arg0 + 1][arg1]), var49);
                  if (var41.field2233 != 0) {
                     var41.field2232 |= 255 - (this.field9910[arg0 + 1][arg1] - this.field9921[arg0 + 1][arg1]) << 25;
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

                  var41.field2234 = class586.method4344(arg10, (byte)76, method4938(arg6[var36] >> 8, this.field9910[arg0 + 1][arg1 + 1] - this.field9921[arg0 + 1][arg1 + 1]), var50);
                  if (var41.field2233 != 0) {
                     var41.field2234 |= 255 - (this.field9910[arg0 + 1][arg1 + 1] - this.field9921[arg0 + 1][arg1 + 1]) << 25;
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

                  var41.field2236 = class586.method4344(arg10, (byte)87, method4938(arg6[var37] >> 8, this.field9910[arg0][arg1 + 1] - this.field9921[arg0][arg1 + 1]), var51);
                  if (var41.field2233 != 0) {
                     var41.field2236 |= 255 - (this.field9910[arg0][arg1 + 1] - this.field9921[arg0][arg1 + 1]) << 25;
                  }

                  var41.field2240 = -1;
               }

               if (arg5 != null) {
                  var41.field2231 = (short)arg5[var36];
                  var41.field2238 = (short)arg5[var37];
                  var41.field2235 = (short)arg5[var35];
                  var41.field2230 = (short)arg5[var34];
               }

               this.field9909[arg0][arg1] = var41;
            } else {
               class571 var52 = new class571();
               var52.field8260 = (short)arg2.length;
               var52.field8255 = (short)(arg2.length / 3);
               var52.field8256 = new short[var52.field8260];
               var52.field8263 = new short[var52.field8260];
               var52.field8259 = new short[var52.field8260];
               var52.field8264 = new int[var52.field8260];
               if (arg5 != null) {
                  var52.field8258 = new short[var52.field8260];
               }

               for(int var53 = 0; var53 < var52.field8260; ++var53) {
                  int var68 = arg2[var53];
                  int var69 = arg4[var53];
                  boolean var70 = false;
                  int var71;
                  if (var68 == 0 && var69 == 0) {
                     var71 = this.field9910[arg0][arg1] - this.field9921[arg0][arg1];
                  } else if (var68 == 0 && super.field4083 == var69) {
                     var71 = this.field9910[arg0][arg1 + 1] - this.field9921[arg0][arg1 + 1];
                  } else if (super.field4083 == var68 && super.field4083 == var69) {
                     var71 = this.field9910[arg0 + 1][arg1 + 1] - this.field9921[arg0 + 1][arg1 + 1];
                  } else if (super.field4083 == var68 && var69 == 0) {
                     var71 = this.field9910[arg0 + 1][arg1] - this.field9921[arg0 + 1][arg1];
                  } else {
                     int var72 = (this.field9910[arg0 + 1][arg1] - this.field9921[arg0 + 1][arg1]) * var68 + (this.field9910[arg0][arg1] - this.field9921[arg0][arg1]) * (super.field4083 - var68);
                     int var73 = (this.field9910[arg0 + 1][arg1 + 1] - this.field9921[arg0 + 1][arg1 + 1]) * var68 + (this.field9910[arg0][arg1 + 1] - this.field9921[arg0][arg1 + 1]) * (super.field4083 - var68);
                     var71 = (super.field4083 - var69) * var72 + var69 * var73 >> super.field4081 * 2;
                  }

                  int var74 = (arg0 << super.field4081) + var68;
                  int var75 = (arg1 << super.field4081) + var69;
                  var52.field8256[var53] = (short)var68;
                  var52.field8259[var53] = (short)var69;
                  var52.field8263[var53] = (short)(this.method2287(-74, var75, var74) + (arg3 != null ? arg3[var53] : 0));
                  if (var71 < 0) {
                     var71 = 0;
                  }

                  if (arg6[var53] == 0) {
                     if (arg7 != null) {
                        var52.field8264[var53] = var71 << 25;
                     } else {
                        var52.field8264[var53] = 0;
                     }
                  } else {
                     int var76 = 0;
                     if (arg5 != null) {
                        short var77 = var52.field8258[var53] = (short)arg5[var53];
                        if (arg11 != 0) {
                           var76 = var77 * 255 / arg11;
                           if (var76 < 0) {
                              var76 = 0;
                           } else if (var76 > 255) {
                              var76 = 255;
                           }
                        }
                     }

                     var52.field8264[var53] = class586.method4344(arg10, (byte)100, method4938(arg6[var53] >> 8, var71), var76);
                     if (arg7 != null) {
                        var52.field8264[var53] |= var71 << 25;
                     }
                  }
               }

               boolean var54 = false;

               for(int var55 = 0; var55 < var52.field8255; ++var55) {
                  if (arg8[var55 * 3] != -1 && !this.field9903.field1192.method1456(-8988, arg8[var55 * 3]).field10175) {
                     var54 = true;
                  }
               }

               if (arg7 != null) {
                  var52.field8257 = new int[var52.field8255];
               }

               if (var54) {
                  var52.field8261 = new short[var52.field8255];
                  var52.field8254 = new short[var52.field8255];
               }

               for(int var56 = 0; var56 < var52.field8255; ++var56) {
                  int var57 = var56 * 3;
                  if (arg7 != null && arg7[var57] != 0) {
                     var52.field8257[var56] = arg7[var57] >> 8;
                  }

                  if (var54) {
                     int var58 = var57 + 1;
                     int var59 = var58 + 1;
                     boolean var60 = false;
                     boolean var61 = true;
                     int var62 = arg8[var57];
                     if (var62 != -1 && !this.field9903.field1192.method1456(-8988, var62).field10175) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     int var63 = arg8[var58];
                     if (var63 != -1 && !this.field9903.field1192.method1456(-8988, var63).field10175) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     int var64 = arg8[var59];
                     if (var64 != -1 && !this.field9903.field1192.method1456(-8988, var64).field10175) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     if (var61) {
                        var52.field8261[var56] = (short)var64;
                        var52.field8254[var56] = (short)arg9[var57];
                     } else {
                        if (var60) {
                           int var65 = arg8[var57];
                           if (var65 != -1 && !this.field9903.field1192.method1456(-8988, var65).field10175) {
                              var52.field8264[var57] = class634.field9255[class223.method1870(this.field9903.field1192.method1456(-8988, var65).field10162 & 65535, 1859335297) & 65535];
                           }

                           int var66 = arg8[var58];
                           if (var66 != -1 && !this.field9903.field1192.method1456(-8988, var66).field10175) {
                              var52.field8264[var58] = class634.field9255[class223.method1870(this.field9903.field1192.method1456(-8988, var66).field10162 & 65535, 1859335297) & 65535];
                           }

                           int var67 = arg8[var59];
                           if (var67 != -1 && !this.field9903.field1192.method1456(-8988, var67).field10175) {
                              var52.field8264[var59] = class634.field9255[class223.method1870(this.field9903.field1192.method1456(-8988, var67).field10162 & 65535, 1859335297) & 65535];
                           }
                        }

                        var52.field8261[var56] = -1;
                     }
                  }
               }

               this.field9920[arg0][arg1] = var52;
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2279(int arg0, int arg1) {
      this.method4941(arg0, arg1, 0);
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z"
   )
   public final boolean method2277(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return false;
   }

   @OriginalMember(
      owner = "client!fh",
      name = "b",
      descriptor = "(IIIIIII[[ZLdaa;Lom;[I[I)V"
   )
   private final void method4942(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class12 arg8, class390 arg9, int[] arg10, int[] arg11) {
      int var13 = (arg6 - arg4) * arg2 / 256;
      int var14 = arg2 >> 8;
      boolean var15 = arg8.field125;
      this.field9903.method316(false);
      arg9.field5755 = false;
      arg9.field5753 = false;
      int var16 = arg0;
      int var17 = arg1 + var13;

      for(int var18 = arg3; var18 < arg5; ++var18) {
         for(int var19 = arg4; var19 < arg6; ++var19) {
            if (arg7[var18 - arg3][var19 - arg4]) {
               if (this.field9909 != null) {
                  if (this.field9909[var18][var19] != null) {
                     class137 var20 = this.field9909[var18][var19];
                     if (var20.field2240 != -1 && (var20.field2239 & 2) == 0 && var20.field2233 == 0) {
                        int var21 = this.field9903.method5324(var20.field2240);
                        arg9.method3029((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)class88.method862(var21, var20.field2234, -127), (float)class88.method862(var21, var20.field2236, -127), (float)class88.method862(var21, var20.field2232, -127));
                        arg9.method3029((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)class88.method862(var21, var20.field2237, -127), (float)class88.method862(var21, var20.field2232, -127), (float)class88.method862(var21, var20.field2236, -127));
                     } else if (var20.field2233 == 0) {
                        arg9.method3040((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, var20.field2234, var20.field2236, var20.field2232);
                        arg9.method3040((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, var20.field2237, var20.field2232, var20.field2236);
                     } else {
                        int var22 = var20.field2233;
                        arg9.method3040((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, class625.method4581(var20.field2234 & -16777216, 255, var22), class625.method4581(var20.field2236 & -16777216, 255, var22), class625.method4581(var20.field2232 & -16777216, 255, var22));
                        arg9.method3040((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, class625.method4581(var20.field2237 & -16777216, 255, var22), class625.method4581(var20.field2232 & -16777216, 255, var22), class625.method4581(var20.field2236 & -16777216, 255, var22));
                     }
                  } else if (this.field9920[var18][var19] != null) {
                     class571 var23 = this.field9920[var18][var19];

                     for(int var24 = 0; var24 < var23.field8260; ++var24) {
                        arg10[var24] = var23.field8256[var24] * var14 / super.field4083 + var16;
                        arg11[var24] = var17 - var23.field8259[var24] * var14 / super.field4083;
                     }

                     for(int var25 = 0; var25 < var23.field8255; ++var25) {
                        int var26 = var25 * 3;
                        int var27 = var26 + 1;
                        int var28 = var27 + 1;
                        int var29 = arg10[var26];
                        int var30 = arg10[var27];
                        int var31 = arg10[var28];
                        int var32 = arg11[var26];
                        int var33 = arg11[var27];
                        int var34 = arg11[var28];
                        if (var23.field8257 != null && var23.field8257[var25] != 0 && (var23.field8261 == null || var23.field8261 != null && var23.field8261[var25] == -1)) {
                           int var35 = var23.field8257[var25];
                           arg9.method3040((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, class625.method4581(-16777216 - (var23.field8264[var26] & -16777216), 255, var35), class625.method4581(-16777216 - (var23.field8264[var27] & -16777216), 255, var35), class625.method4581(-16777216 - (var23.field8264[var28] & -16777216), 255, var35));
                        } else if (var23.field8261 != null && var23.field8261[var25] != -1) {
                           int var36 = this.field9903.method5324(var23.field8261[var25]);
                           arg9.method3029((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)var36, (float)var36, (float)var36);
                        } else {
                           arg9.method3040((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, var23.field8264[var26], var23.field8264[var27], var23.field8264[var28]);
                        }
                     }
                  }
               } else if (this.field9915[var18][var19] != null) {
                  class777 var37 = this.field9915[var18][var19];

                  for(int var38 = 0; var38 < var37.field11360; ++var38) {
                     arg10[var38] = var37.field11358[var38] * var14 / super.field4083 + var16;
                     arg11[var38] = var17 - var37.field11365[var38] * var14 / super.field4083;
                  }

                  for(int var39 = 0; var39 < var37.field11359; ++var39) {
                     int var40 = var39 * 3;
                     int var41 = var40 + 1;
                     int var42 = var41 + 1;
                     int var43 = arg10[var40];
                     int var44 = arg10[var41];
                     int var45 = arg10[var42];
                     int var46 = arg11[var40];
                     int var47 = arg11[var41];
                     int var48 = arg11[var42];
                     if (var37.field11368 != null && var37.field11368[var39] != 0) {
                        int var49 = var37.field11368[var39];
                        arg9.method3040((float)var46, (float)var47, (float)var48, (float)var43, (float)var44, (float)var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                     } else {
                        arg9.method3040((float)var46, (float)var47, (float)var48, (float)var43, (float)var44, (float)var45, 100.0F, 100.0F, 100.0F, var37.field11366[var40], var37.field11366[var41], var37.field11366[var42]);
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = arg1 + var13;
         var16 += var14;
      }

      arg9.field5755 = true;
      this.field9903.method316(var15);
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(Lke;[I)V"
   )
   public final void method2283(class622 arg0, int[] arg1) {
   }

   @OriginalMember(
      owner = "client!fh",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V"
   )
   public final void method2288(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(III[[ZZI)V"
   )
   public final void method2284(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
      class784 var7 = this.field9903.field10617;
      this.field9923 = -1;
      this.field9906 = var7.field11475;
      this.field9913 = var7.field11499;
      this.field9919 = var7.field11493;
      this.field9905 = var7.field11485;
      this.field9918 = var7.field11481;
      this.field9907 = var7.field11473;
      this.field9908 = var7.field11476;
      this.field9911 = var7.field11495;
      this.field9914 = var7.field11487;
      this.field9912 = var7.field11479;
      this.field9904 = var7.field11500;
      this.field9922 = var7.field11492;

      for(int var8 = 0; var8 < arg2 + arg2; ++var8) {
         for(int var9 = 0; var9 < arg2 + arg2; ++var9) {
            if (arg3[var8][var9]) {
               int var10 = arg0 - arg2 + var8;
               int var11 = arg1 - arg2 + var9;
               if (var10 >= 0 && var10 < super.field4080 && var11 >= 0 && var11 < super.field4077) {
                  this.method4941(var10, var11, arg5);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(IIIIIII[[ZLdaa;Lom;[I[I)V"
   )
   private final void method4943(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class12 arg8, class390 arg9, int[] arg10, int[] arg11) {
      int var13 = (arg6 - arg4) * arg2 / 256;
      int var14 = arg2 >> 8;
      boolean var15 = arg8.field125;
      this.field9903.method316(false);
      arg9.field5755 = false;
      arg9.field5753 = false;
      int var16 = arg0;
      int var17 = arg1 + var13;

      for(int var18 = arg3; var18 < arg5; ++var18) {
         for(int var19 = arg4; var19 < arg6; ++var19) {
            if (arg7[var18 - arg3][var19 - arg4]) {
               if (this.field9916[var18][var19] != null) {
                  class254 var20 = this.field9916[var18][var19];
                  if (var20.field3616 != -1 && (var20.field3615 & 2) == 0 && var20.field3619 == -1) {
                     int var21 = this.field9903.method5324(var20.field3616);
                     arg9.method3029((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)class88.method862(var21, var20.field3618 & 65535, -127), (float)class88.method862(var21, var20.field3620 & 65535, -127), (float)class88.method862(var21, var20.field3614 & 65535, -127));
                     arg9.method3029((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)class88.method862(var21, var20.field3617 & 65535, -127), (float)class88.method862(var21, var20.field3614 & 65535, -127), (float)class88.method862(var21, var20.field3620 & 65535, -127));
                  } else if (var20.field3619 == -1) {
                     arg9.method3029((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)(var20.field3618 & 65535), (float)(var20.field3620 & 65535), (float)(var20.field3614 & 65535));
                     arg9.method3029((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)(var20.field3617 & 65535), (float)(var20.field3614 & 65535), (float)(var20.field3620 & 65535));
                  } else {
                     int var22 = var20.field3619;
                     arg9.method3029((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)var22, (float)var22, (float)var22);
                     arg9.method3029((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)var22, (float)var22, (float)var22);
                  }
               } else if (this.field9902[var18][var19] != null) {
                  class9 var23 = this.field9902[var18][var19];

                  for(int var24 = 0; var24 < var23.field88; ++var24) {
                     arg10[var24] = var23.field87[var24] * var14 / super.field4083 + var16;
                     arg11[var24] = var17 - var23.field94[var24] * var14 / super.field4083;
                  }

                  for(int var25 = 0; var25 < var23.field96; ++var25) {
                     short var26 = var23.field98[var25];
                     short var27 = var23.field89[var25];
                     short var28 = var23.field92[var25];
                     int var29 = arg10[var26];
                     int var30 = arg10[var27];
                     int var31 = arg10[var28];
                     int var32 = arg11[var26];
                     int var33 = arg11[var27];
                     int var34 = arg11[var28];
                     if (var23.field91 != null && var23.field91[var25] != -1) {
                        int var35 = var23.field91[var25];
                        arg9.method3029((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class88.method862(var35, var23.field90[var26], -127), (float)class88.method862(var35, var23.field90[var27], -127), (float)class88.method862(var35, var23.field90[var28], -127));
                     } else if (var23.field99 != null && var23.field99[var25] != -1) {
                        int var36 = this.field9903.method5324(var23.field99[var25]);
                        arg9.method3029((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class88.method862(var36, var23.field90[var26], -127), (float)class88.method862(var36, var23.field90[var27], -127), (float)class88.method862(var36, var23.field90[var28], -127));
                     } else {
                        int var37 = var23.field95[var25];
                        arg9.method3029((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class88.method862(var37, var23.field90[var26], -127), (float)class88.method862(var37, var23.field90[var27], -127), (float)class88.method862(var37, var23.field90[var28], -127));
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = arg1 + var13;
         var16 += var14;
      }

      arg9.field5755 = true;
      this.field9903.method316(var15);
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(IILom;[I[I[I[II)V"
   )
   private final void method4944(int arg0, int arg1, class390 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
      class254 var9 = this.field9916[arg0][arg1];
      if (var9 != null) {
         if ((var9.field3615 & 2) == 0) {
            if (arg7 != 0) {
               if ((var9.field3615 & 4) != 0) {
                  if ((arg7 & 1) != 0) {
                     return;
                  }
               } else if ((arg7 & 2) != 0) {
                  return;
               }
            }

            int var10 = super.field4083 * arg0;
            int var11 = super.field4083 + var10;
            int var12 = super.field4083 * arg1;
            int var13 = super.field4083 + var12;
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
            if ((var9.field3615 & 1) != 0) {
               int var14 = super.field4078[arg0][arg1];
               float var15 = (float)var14 * this.field9912;
               if (this.field9923 == -1) {
                  var16 = (float)var12 * this.field9904 + (float)var10 * this.field9914 + var15 + this.field9922;
                  if (var16 <= (float)this.field9903.field10628) {
                     return;
                  }

                  var17 = (float)var12 * this.field9904 + (float)var11 * this.field9914 + var15 + this.field9922;
                  if (var17 <= (float)this.field9903.field10628) {
                     return;
                  }

                  var18 = (float)var13 * this.field9904 + (float)var11 * this.field9914 + var15 + this.field9922;
                  if (var18 <= (float)this.field9903.field10628) {
                     return;
                  }

                  var19 = (float)var13 * this.field9904 + (float)var10 * this.field9914 + var15 + this.field9922;
                  if (var19 <= (float)this.field9903.field10628) {
                     return;
                  }
               } else {
                  var16 = (float)var12 * this.field9904 + (float)var10 * this.field9914 + var15 + this.field9922;
                  var17 = (float)var12 * this.field9904 + (float)var11 * this.field9914 + var15 + this.field9922;
                  var18 = (float)var13 * this.field9904 + (float)var11 * this.field9914 + var15 + this.field9922;
                  var19 = (float)var13 * this.field9904 + (float)var10 * this.field9914 + var15 + this.field9922;
               }

               float var20 = (float)var14 * this.field9913;
               float var21 = (float)var14 * this.field9907;
               if (this.field9923 == -1) {
                  float var22 = (float)var12 * this.field9919 + (float)var10 * this.field9906 + var20 + this.field9905;
                  var23 = (int)((float)this.field9903.field10622 * var22 / var16) + arg2.field5748;
                  float var24 = (float)var12 * this.field9908 + (float)var10 * this.field9918 + var21 + this.field9911;
                  var25 = (int)((float)this.field9903.field10646 * var24 / var16) + arg2.field5756;
                  float var26 = (float)var12 * this.field9919 + (float)var11 * this.field9906 + var20 + this.field9905;
                  var27 = (int)((float)this.field9903.field10622 * var26 / var17) + arg2.field5748;
                  float var28 = (float)var12 * this.field9908 + (float)var11 * this.field9918 + var21 + this.field9911;
                  var29 = (int)((float)this.field9903.field10646 * var28 / var17) + arg2.field5756;
                  float var30 = (float)var13 * this.field9919 + (float)var11 * this.field9906 + var20 + this.field9905;
                  var31 = (int)((float)this.field9903.field10622 * var30 / var18) + arg2.field5748;
                  float var32 = (float)var13 * this.field9908 + (float)var11 * this.field9918 + var21 + this.field9911;
                  var33 = (int)((float)this.field9903.field10646 * var32 / var18) + arg2.field5756;
                  float var34 = (float)var13 * this.field9919 + (float)var10 * this.field9906 + var20 + this.field9905;
                  var35 = (int)((float)this.field9903.field10622 * var34 / var19) + arg2.field5748;
                  float var36 = (float)var13 * this.field9908 + (float)var10 * this.field9918 + var21 + this.field9911;
                  var37 = (int)((float)this.field9903.field10646 * var36 / var19) + arg2.field5756;
               } else {
                  float var38 = (float)var12 * this.field9919 + (float)var10 * this.field9906 + var20 + this.field9905;
                  var23 = (int)((float)this.field9903.field10622 * var38 / (float)this.field9923) + arg2.field5748;
                  float var39 = (float)var12 * this.field9908 + (float)var10 * this.field9918 + var21 + this.field9911;
                  var25 = (int)((float)this.field9903.field10646 * var39 / (float)this.field9923) + arg2.field5756;
                  float var40 = (float)var12 * this.field9919 + (float)var11 * this.field9906 + var20 + this.field9905;
                  var27 = (int)((float)this.field9903.field10622 * var40 / (float)this.field9923) + arg2.field5748;
                  float var41 = (float)var12 * this.field9908 + (float)var11 * this.field9918 + var21 + this.field9911;
                  var29 = (int)((float)this.field9903.field10646 * var41 / (float)this.field9923) + arg2.field5756;
                  float var42 = (float)var13 * this.field9919 + (float)var11 * this.field9906 + var20 + this.field9905;
                  var31 = (int)((float)this.field9903.field10622 * var42 / (float)this.field9923) + arg2.field5748;
                  float var43 = (float)var13 * this.field9908 + (float)var11 * this.field9918 + var21 + this.field9911;
                  var33 = (int)((float)this.field9903.field10646 * var43 / (float)this.field9923) + arg2.field5756;
                  float var44 = (float)var13 * this.field9919 + (float)var10 * this.field9906 + var20 + this.field9905;
                  var35 = (int)((float)this.field9903.field10622 * var44 / (float)this.field9923) + arg2.field5748;
                  float var45 = (float)var13 * this.field9908 + (float)var10 * this.field9918 + var21 + this.field9911;
                  var37 = (int)((float)this.field9903.field10646 * var45 / (float)this.field9923) + arg2.field5756;
               }
            } else {
               int var46 = super.field4078[arg0][arg1];
               int var47 = super.field4078[arg0 + 1][arg1];
               int var48 = super.field4078[arg0 + 1][arg1 + 1];
               int var49 = super.field4078[arg0][arg1 + 1];
               if (this.field9923 == -1) {
                  var16 = (float)var12 * this.field9904 + (float)var10 * this.field9914 + (float)var46 * this.field9912 + this.field9922;
                  if (var16 <= (float)this.field9903.field10628) {
                     return;
                  }

                  var17 = (float)var12 * this.field9904 + (float)var11 * this.field9914 + (float)var47 * this.field9912 + this.field9922;
                  if (var17 <= (float)this.field9903.field10628) {
                     return;
                  }

                  var18 = (float)var13 * this.field9904 + (float)var11 * this.field9914 + (float)var48 * this.field9912 + this.field9922;
                  if (var18 <= (float)this.field9903.field10628) {
                     return;
                  }

                  var19 = (float)var13 * this.field9904 + (float)var10 * this.field9914 + (float)var49 * this.field9912 + this.field9922;
                  if (var19 <= (float)this.field9903.field10628) {
                     return;
                  }

                  float var50 = (float)var12 * this.field9919 + (float)var10 * this.field9906 + (float)var46 * this.field9913 + this.field9905;
                  var23 = (int)((float)this.field9903.field10622 * var50 / var16) + arg2.field5748;
                  float var51 = (float)var12 * this.field9908 + (float)var10 * this.field9918 + (float)var46 * this.field9907 + this.field9911;
                  var25 = (int)((float)this.field9903.field10646 * var51 / var16) + arg2.field5756;
                  float var52 = (float)var12 * this.field9919 + (float)var11 * this.field9906 + (float)var47 * this.field9913 + this.field9905;
                  var27 = (int)((float)this.field9903.field10622 * var52 / var17) + arg2.field5748;
                  float var53 = (float)var12 * this.field9908 + (float)var11 * this.field9918 + (float)var47 * this.field9907 + this.field9911;
                  var29 = (int)((float)this.field9903.field10646 * var53 / var17) + arg2.field5756;
                  float var54 = (float)var13 * this.field9919 + (float)var11 * this.field9906 + (float)var48 * this.field9913 + this.field9905;
                  var31 = (int)((float)this.field9903.field10622 * var54 / var18) + arg2.field5748;
                  float var55 = (float)var13 * this.field9908 + (float)var11 * this.field9918 + (float)var48 * this.field9907 + this.field9911;
                  var33 = (int)((float)this.field9903.field10646 * var55 / var18) + arg2.field5756;
                  float var56 = (float)var13 * this.field9919 + (float)var10 * this.field9906 + (float)var49 * this.field9913 + this.field9905;
                  var35 = (int)((float)this.field9903.field10622 * var56 / var19) + arg2.field5748;
                  float var57 = (float)var13 * this.field9908 + (float)var10 * this.field9918 + (float)var49 * this.field9907 + this.field9911;
                  var37 = (int)((float)this.field9903.field10646 * var57 / var19) + arg2.field5756;
               } else {
                  var16 = (float)var12 * this.field9904 + (float)var10 * this.field9914 + (float)var46 * this.field9912 + this.field9922;
                  var17 = (float)var12 * this.field9904 + (float)var11 * this.field9914 + (float)var47 * this.field9912 + this.field9922;
                  var18 = (float)var13 * this.field9904 + (float)var11 * this.field9914 + (float)var48 * this.field9912 + this.field9922;
                  var19 = (float)var13 * this.field9904 + (float)var10 * this.field9914 + (float)var49 * this.field9912 + this.field9922;
                  float var58 = (float)var12 * this.field9919 + (float)var10 * this.field9906 + (float)var46 * this.field9913 + this.field9905;
                  var23 = (int)((float)this.field9903.field10622 * var58 / (float)this.field9923) + arg2.field5748;
                  float var59 = (float)var12 * this.field9908 + (float)var10 * this.field9918 + (float)var46 * this.field9907 + this.field9911;
                  var25 = (int)((float)this.field9903.field10646 * var59 / (float)this.field9923) + arg2.field5756;
                  float var60 = (float)var12 * this.field9919 + (float)var11 * this.field9906 + (float)var47 * this.field9913 + this.field9905;
                  var27 = (int)((float)this.field9903.field10622 * var60 / (float)this.field9923) + arg2.field5748;
                  float var61 = (float)var12 * this.field9908 + (float)var11 * this.field9918 + (float)var47 * this.field9907 + this.field9911;
                  var29 = (int)((float)this.field9903.field10646 * var61 / (float)this.field9923) + arg2.field5756;
                  float var62 = (float)var13 * this.field9919 + (float)var11 * this.field9906 + (float)var48 * this.field9913 + this.field9905;
                  var31 = (int)((float)this.field9903.field10622 * var62 / (float)this.field9923) + arg2.field5748;
                  float var63 = (float)var13 * this.field9908 + (float)var11 * this.field9918 + (float)var48 * this.field9907 + this.field9911;
                  var33 = (int)((float)this.field9903.field10646 * var63 / (float)this.field9923) + arg2.field5756;
                  float var64 = (float)var13 * this.field9919 + (float)var10 * this.field9906 + (float)var49 * this.field9913 + this.field9905;
                  var35 = (int)((float)this.field9903.field10622 * var64 / (float)this.field9923) + arg2.field5748;
                  float var65 = (float)var13 * this.field9908 + (float)var10 * this.field9918 + (float)var49 * this.field9907 + this.field9911;
                  var37 = (int)((float)this.field9903.field10646 * var65 / (float)this.field9923) + arg2.field5756;
               }
            }

            if (this.field9923 == -1) {
               if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                  arg2.field5757 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field5761 || var35 > arg2.field5761 || var27 > arg2.field5761;
                  if (var9.field3616 >= 0) {
                     arg2.method3039((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class634.field9255[var9.field3618 & 65535] & 16777215, -16777216 | class634.field9255[var9.field3620 & 65535] & 16777215, -16777216 | class634.field9255[var9.field3614 & 65535] & 16777215, 0, 0, 0, 0, var9.field3616);
                  } else {
                     arg2.method3029((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, (float)((int)var18), (float)((int)var19), (float)((int)var17), (float)(var9.field3618 & 65535), (float)(var9.field3620 & 65535), (float)(var9.field3614 & 65535));
                  }
               }

               if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                  arg2.field5757 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field5761 || var27 > arg2.field5761 || var35 > arg2.field5761;
                  if (var9.field3616 >= 0) {
                     arg2.method3039((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class634.field9255[var9.field3617 & 65535] & 16777215, -16777216 | class634.field9255[var9.field3614 & 65535] & 16777215, -16777216 | class634.field9255[var9.field3620 & 65535] & 16777215, 0, 0, 0, 0, var9.field3616);
                     return;
                  }

                  arg2.method3029((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, (float)((int)var16), (float)((int)var17), (float)((int)var19), (float)(var9.field3617 & 65535), (float)(var9.field3614 & 65535), (float)(var9.field3620 & 65535));
                  return;
               }
            } else {
               if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                  arg2.field5757 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field5761 || var35 > arg2.field5761 || var27 > arg2.field5761;
                  if (var9.field3616 >= 0) {
                     arg2.method3039((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class634.field9255[var9.field3618 & 65535] & 16777215, -16777216 | class634.field9255[var9.field3620 & 65535] & 16777215, -16777216 | class634.field9255[var9.field3614 & 65535] & 16777215, 0, 0, 0, 0, var9.field3616);
                  } else {
                     arg2.method3029((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, (float)((int)var18), (float)((int)var19), (float)((int)var17), (float)(var9.field3618 & 65535), (float)(var9.field3620 & 65535), (float)(var9.field3614 & 65535));
                  }
               }

               if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                  arg2.field5757 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field5761 || var27 > arg2.field5761 || var35 > arg2.field5761;
                  if (var9.field3616 >= 0) {
                     arg2.method3039((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class634.field9255[var9.field3617 & 65535] & 16777215, -16777216 | class634.field9255[var9.field3614 & 65535] & 16777215, -16777216 | class634.field9255[var9.field3620 & 65535] & 16777215, 0, 0, 0, 0, var9.field3616);
                     return;
                  }

                  arg2.method3029((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, (float)((int)var16), (float)((int)var17), (float)((int)var19), (float)(var9.field3617 & 65535), (float)(var9.field3614 & 65535), (float)(var9.field3620 & 65535));
               }
            }

         }
      } else {
         class9 var66 = this.field9902[arg0][arg1];
         if (var66 != null) {
            if (arg7 != 0) {
               if ((var66.field93 & 4) != 0) {
                  if ((arg7 & 1) != 0) {
                     return;
                  }
               } else if ((arg7 & 2) != 0) {
                  return;
               }
            }

            if (this.field9923 == -1) {
               for(int var67 = 0; var67 < var66.field88; ++var67) {
                  int var68 = (arg0 << super.field4081) + var66.field87[var67];
                  short var69 = var66.field86[var67];
                  int var70 = (arg1 << super.field4081) + var66.field94[var67];
                  float var71 = (float)var70 * this.field9904 + (float)var68 * this.field9914 + (float)var69 * this.field9912 + this.field9922;
                  if (var71 <= (float)this.field9903.field10628) {
                     return;
                  }

                  float var72 = (float)var70 * this.field9919 + (float)var68 * this.field9906 + (float)var69 * this.field9913 + this.field9905;
                  float var73 = (float)var70 * this.field9908 + (float)var68 * this.field9918 + (float)var69 * this.field9907 + this.field9911;
                  arg3[var67] = (int)((float)this.field9903.field10622 * var72 / var71) + arg2.field5748;
                  arg4[var67] = (int)((float)this.field9903.field10646 * var73 / var71) + arg2.field5756;
                  arg5[var67] = (int)var71;
               }
            } else {
               for(int var74 = 0; var74 < var66.field88; ++var74) {
                  int var110 = (arg0 << super.field4081) + var66.field87[var74];
                  short var111 = var66.field86[var74];
                  int var112 = (arg1 << super.field4081) + var66.field94[var74];
                  float var113 = (float)var112 * this.field9904 + (float)var110 * this.field9914 + (float)var111 * this.field9912 + this.field9922;
                  float var114 = (float)var112 * this.field9919 + (float)var110 * this.field9906 + (float)var111 * this.field9913 + this.field9905;
                  float var115 = (float)var112 * this.field9908 + (float)var110 * this.field9918 + (float)var111 * this.field9907 + this.field9911;
                  arg3[var74] = (int)((float)this.field9903.field10622 * var114 / (float)this.field9923) + arg2.field5748;
                  arg4[var74] = (int)((float)this.field9903.field10646 * var115 / (float)this.field9923) + arg2.field5756;
                  arg5[var74] = (int)var113;
               }
            }

            if (var66.field99 != null) {
               if (this.field9923 == -1) {
                  for(int var75 = 0; var75 < var66.field96; ++var75) {
                     short var76 = var66.field98[var75];
                     short var77 = var66.field89[var75];
                     short var78 = var66.field92[var75];
                     int var79 = arg3[var76];
                     int var80 = arg3[var77];
                     int var81 = arg3[var78];
                     int var82 = arg4[var76];
                     int var83 = arg4[var77];
                     int var84 = arg4[var78];
                     if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                        arg2.field5757 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field5761 || var80 > arg2.field5761 || var81 > arg2.field5761;
                        short var85 = var66.field99[var75];
                        if (var85 != -1) {
                           arg2.method3039((float)var82, (float)var83, (float)var84, (float)var79, (float)var80, (float)var81, (float)arg5[var76], (float)arg5[var77], (float)arg5[var78], (float)var66.field87[var76] / (float)super.field4083, (float)var66.field87[var77] / (float)super.field4083, (float)var66.field87[var78] / (float)super.field4083, (float)var66.field94[var76] / (float)super.field4083, (float)var66.field94[var77] / (float)super.field4083, (float)var66.field94[var78] / (float)super.field4083, -16777216 | class634.field9255[var66.field90[var76] & 65535] & 16777215, -16777216 | class634.field9255[var66.field90[var77] & 65535] & 16777215, -16777216 | class634.field9255[var66.field90[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                        } else {
                           int var86 = var66.field95[var75];
                           if (var86 != -1) {
                              arg2.method3029((float)var82, (float)var83, (float)var84, (float)var79, (float)var80, (float)var81, (float)arg5[var76], (float)arg5[var77], (float)arg5[var78], (float)class88.method862(var86, var66.field90[var76], -127), (float)class88.method862(var86, var66.field90[var77], -127), (float)class88.method862(var86, var66.field90[var78], -127));
                           }
                        }
                     }
                  }

                  return;
               }

               for(int var87 = 0; var87 < var66.field96; ++var87) {
                  short var88 = var66.field98[var87];
                  short var89 = var66.field89[var87];
                  short var90 = var66.field92[var87];
                  int var91 = arg3[var88];
                  int var92 = arg3[var89];
                  int var93 = arg3[var90];
                  int var94 = arg4[var88];
                  int var95 = arg4[var89];
                  int var96 = arg4[var90];
                  if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                     arg2.field5757 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field5761 || var92 > arg2.field5761 || var93 > arg2.field5761;
                     short var97 = var66.field99[var87];
                     if (var97 != -1) {
                        arg2.method3039((float)var94, (float)var95, (float)var96, (float)var91, (float)var92, (float)var93, (float)arg5[var88], (float)arg5[var89], (float)arg5[var90], (float)var66.field87[var88] / (float)super.field4083, (float)var66.field87[var89] / (float)super.field4083, (float)var66.field87[var90] / (float)super.field4083, (float)var66.field94[var88] / (float)super.field4083, (float)var66.field94[var89] / (float)super.field4083, (float)var66.field94[var90] / (float)super.field4083, -16777216 | class634.field9255[var66.field90[var88] & 65535] & 16777215, -16777216 | class634.field9255[var66.field90[var89] & 65535] & 16777215, -16777216 | class634.field9255[var66.field90[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                     } else {
                        int var98 = var66.field95[var87];
                        if (var98 != -1) {
                           arg2.method3029((float)var94, (float)var95, (float)var96, (float)var91, (float)var92, (float)var93, (float)arg5[var88], (float)arg5[var89], (float)arg5[var90], (float)class88.method862(var98, var66.field90[var88], -127), (float)class88.method862(var98, var66.field90[var89], -127), (float)class88.method862(var98, var66.field90[var90], -127));
                        }
                     }
                  }
               }

               return;
            }

            for(int var99 = 0; var99 < var66.field96; ++var99) {
               short var100 = var66.field98[var99];
               short var101 = var66.field89[var99];
               short var102 = var66.field92[var99];
               int var103 = arg3[var100];
               int var104 = arg3[var101];
               int var105 = arg3[var102];
               int var106 = arg4[var100];
               int var107 = arg4[var101];
               int var108 = arg4[var102];
               if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                  int var109 = var66.field95[var99];
                  if (var109 != -1) {
                     arg2.field5757 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field5761 || var104 > arg2.field5761 || var105 > arg2.field5761;
                     arg2.method3029((float)var106, (float)var107, (float)var108, (float)var103, (float)var104, (float)var105, (float)arg5[var100], (float)arg5[var101], (float)arg5[var102], (float)class88.method862(var109, var66.field90[var100], -127), (float)class88.method862(var109, var66.field90[var101], -127), (float)class88.method862(var109, var66.field90[var102], -127));
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(I)Z"
   )
   private final boolean method4945(int arg0) {
      if ((this.field9917 & 8) == 0) {
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
      owner = "client!fh",
      name = "<init>",
      descriptor = "(Llga;IIII[[I[[II)V"
   )
   public class676(class739 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
      super(arg3, arg4, arg7, arg5);
      this.field9903 = arg0;
      this.field9917 = arg2;
      this.field9910 = new byte[arg3 + 1][arg4 + 1];
      int var9 = this.field9903.field10625 >> 9;

      for(int var10 = 1; var10 < arg4; ++var10) {
         for(int var11 = 1; var11 < arg3; ++var11) {
            int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
            int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
            int var15 = (int)Math.sqrt((double)(var14 * var14 + arg7 * 512 + var13 * var13));
            int var16 = (var13 << 8) / var15;
            int var17 = arg7 * -512 / var15;
            int var18 = (var14 << 8) / var15;
            int var19 = (this.field9903.field10635 * var18 + this.field9903.field10632 * var17 + this.field9903.field10610 * var16 >> 17) + var9;
            int var20 = var19 >> 1;
            if (var20 < 2) {
               var20 = 2;
            } else if (var20 > 126) {
               var20 = 126;
            }

            this.field9910[var11][var10] = (byte)var20;
         }
      }

      this.field9921 = new byte[arg3 + 1][arg4 + 1];
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public final void method2282(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
      if (this.field9916 == null) {
         this.field9916 = new class254[super.field4080][super.field4077];
         this.field9902 = new class9[super.field4080][super.field4077];
      } else if (this.field9909 != null || this.field9915 != null) {
         throw new IllegalStateException();
      }

      boolean var18 = false;
      if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
         var18 = true;

         for(int var19 = 1; var19 < 2; ++var19) {
            int var20 = arg2[arg6[var19]];
            int var21 = arg4[arg6[var19]];
            if (var20 != 0 && super.field4083 != var20 || var21 != 0 && super.field4083 != var21) {
               var18 = false;
               break;
            }
         }
      }

      if (!var18) {
         class9 var22 = new class9();
         short var23 = (short)arg2.length;
         short var24 = (short)arg9.length;
         var22.field88 = var23;
         var22.field90 = new short[var23];
         var22.field87 = new short[var23];
         var22.field86 = new short[var23];
         var22.field94 = new short[var23];

         for(int var25 = 0; var25 < var23; ++var25) {
            int var32 = arg2[var25];
            int var33 = arg4[var25];
            if (var32 == 0 && var33 == 0) {
               var22.field90[var25] = (short)(this.field9910[arg0][arg1] - this.field9921[arg0][arg1]);
            } else if (var32 == 0 && super.field4083 == var33) {
               var22.field90[var25] = (short)(this.field9910[arg0][arg1 + 1] - this.field9921[arg0][arg1 + 1]);
            } else if (super.field4083 == var32 && super.field4083 == var33) {
               var22.field90[var25] = (short)(this.field9910[arg0 + 1][arg1 + 1] - this.field9921[arg0 + 1][arg1 + 1]);
            } else if (super.field4083 == var32 && var33 == 0) {
               var22.field90[var25] = (short)(this.field9910[arg0 + 1][arg1] - this.field9921[arg0 + 1][arg1]);
            } else {
               int var34 = (this.field9910[arg0 + 1][arg1] - this.field9921[arg0 + 1][arg1]) * var32 + (this.field9910[arg0][arg1] - this.field9921[arg0][arg1]) * (super.field4083 - var32);
               int var35 = (this.field9910[arg0 + 1][arg1 + 1] - this.field9921[arg0 + 1][arg1 + 1]) * var32 + (this.field9910[arg0][arg1 + 1] - this.field9921[arg0][arg1 + 1]) * (super.field4083 - var32);
               var22.field90[var25] = (short)((super.field4083 - var33) * var34 + var33 * var35 >> super.field4081 * 2);
            }

            int var36 = (arg0 << super.field4081) + var32;
            int var37 = (arg1 << super.field4081) + var33;
            var22.field87[var25] = (short)var32;
            var22.field94[var25] = (short)var33;
            var22.field86[var25] = (short)(this.method2287(94, var37, var36) + (arg3 != null ? arg3[var25] : 0));
            if (var22.field90[var25] < 2) {
               var22.field90[var25] = 2;
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
               class693 var31 = this.field9903.field1192.method1456(-8988, var30);
               if (!var31.field10175) {
                  var26 = true;
                  if (this.method4945(var31.field10167) || var31.field10152 != 0 || var31.field10173 != 0) {
                     var22.field93 = (byte)(var22.field93 | 4);
                  }
               }
            }
         }

         var22.field95 = new int[var27];
         if (arg10 != null) {
            var22.field91 = new int[var27];
         }

         var22.field98 = new short[var27];
         var22.field89 = new short[var27];
         var22.field92 = new short[var27];
         if (var26) {
            var22.field99 = new short[var27];
            var22.field97 = new short[var27];
         }

         for(int var29 = 0; var29 < var24; ++var29) {
            if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
               if (arg9[var29] >= 0) {
                  var22.field95[var22.field96] = class223.method1870(arg9[var29], 1859335297);
               } else {
                  var22.field95[var22.field96] = -1;
               }

               if (arg10 != null) {
                  if (arg10[var29] != -1) {
                     var22.field91[var22.field96] = class223.method1870(arg10[var29], 1859335297);
                  } else {
                     var22.field91[var22.field96] = -1;
                  }
               }

               var22.field98[var22.field96] = (short)arg6[var29];
               var22.field89[var22.field96] = (short)arg7[var29];
               var22.field92[var22.field96] = (short)arg8[var29];
               if (var26) {
                  if (arg11[var29] != -1 && !this.field9903.field1192.method1456(-8988, arg11[var29]).field10175) {
                     var22.field99[var22.field96] = (short)arg11[var29];
                     var22.field97[var22.field96] = (short)arg12[var29];
                  } else {
                     var22.field99[var22.field96] = -1;
                  }
               }

               ++var22.field96;
            }
         }

         this.field9902[arg0][arg1] = var22;
      } else {
         if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
            class254 var38 = new class254();
            int var39 = arg9[0];
            int var40 = arg11[0];
            if (arg10 != null) {
               var38.field3619 = class88.method862(class223.method1870(arg10[0], 1859335297), this.field9910[arg0][arg1] - this.field9921[arg0][arg1], -127);
               if (var39 == -1) {
                  var38.field3615 = (byte)(var38.field3615 | 2);
               }
            }

            if (super.field4078[arg0 + 1][arg1] == super.field4078[arg0][arg1] && super.field4078[arg0 + 1][arg1 + 1] == super.field4078[arg0][arg1] && super.field4078[arg0][arg1 + 1] == super.field4078[arg0][arg1]) {
               var38.field3615 = (byte)(var38.field3615 | 1);
            }

            class693 var41 = null;
            if (var40 != -1) {
               var41 = this.field9903.field1192.method1456(-8988, var40);
            }

            if (var41 != null && (var38.field3615 & 2) == 0 && !var41.field10175) {
               var38.field3617 = (short)(this.field9910[arg0][arg1] - this.field9921[arg0][arg1]);
               var38.field3614 = (short)(this.field9910[arg0 + 1][arg1] - this.field9921[arg0 + 1][arg1]);
               var38.field3618 = (short)(this.field9910[arg0 + 1][arg1 + 1] - this.field9921[arg0 + 1][arg1 + 1]);
               var38.field3620 = (short)(this.field9910[arg0][arg1 + 1] - this.field9921[arg0][arg1 + 1]);
               var38.field3616 = (short)var40;
               if (this.method4945(var41.field10167) || var41.field10152 != 0 || var41.field10173 != 0) {
                  var38.field3615 = (byte)(var38.field3615 | 4);
               }
            } else {
               short var42 = class223.method1870(var39, 1859335297);
               var38.field3617 = (short)class88.method862(var42, this.field9910[arg0][arg1] - this.field9921[arg0][arg1], -127);
               var38.field3614 = (short)class88.method862(var42, this.field9910[arg0 + 1][arg1] - this.field9921[arg0 + 1][arg1], -127);
               var38.field3618 = (short)class88.method862(var42, this.field9910[arg0 + 1][arg1 + 1] - this.field9921[arg0 + 1][arg1 + 1], -127);
               var38.field3620 = (short)class88.method862(var42, this.field9910[arg0][arg1 + 1] - this.field9921[arg0][arg1 + 1], -127);
               var38.field3616 = -1;
            }

            this.field9916[arg0][arg1] = var38;
         }

      }
   }
}
