import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class418 extends class271 {
   @OriginalMember(
      owner = "client!tp",
      name = "D",
      descriptor = "I"
   )
   private int field6471 = -1;
   @OriginalMember(
      owner = "client!tp",
      name = "q",
      descriptor = "Lld;"
   )
   private class164 field6475;
   @OriginalMember(
      owner = "client!tp",
      name = "m",
      descriptor = "I"
   )
   private int field6467;
   @OriginalMember(
      owner = "client!tp",
      name = "w",
      descriptor = "[[B"
   )
   private byte[][] field6476;
   @OriginalMember(
      owner = "client!tp",
      name = "F",
      descriptor = "[[B"
   )
   private byte[][] field6468;
   @OriginalMember(
      owner = "client!tp",
      name = "y",
      descriptor = "F"
   )
   private float field6458;
   @OriginalMember(
      owner = "client!tp",
      name = "l",
      descriptor = "F"
   )
   private float field6459;
   @OriginalMember(
      owner = "client!tp",
      name = "G",
      descriptor = "F"
   )
   private float field6460;
   @OriginalMember(
      owner = "client!tp",
      name = "t",
      descriptor = "F"
   )
   private float field6461;
   @OriginalMember(
      owner = "client!tp",
      name = "E",
      descriptor = "F"
   )
   private float field6462;
   @OriginalMember(
      owner = "client!tp",
      name = "x",
      descriptor = "F"
   )
   private float field6463;
   @OriginalMember(
      owner = "client!tp",
      name = "o",
      descriptor = "F"
   )
   private float field6464;
   @OriginalMember(
      owner = "client!tp",
      name = "v",
      descriptor = "F"
   )
   private float field6465;
   @OriginalMember(
      owner = "client!tp",
      name = "C",
      descriptor = "F"
   )
   private float field6469;
   @OriginalMember(
      owner = "client!tp",
      name = "p",
      descriptor = "F"
   )
   private float field6474;
   @OriginalMember(
      owner = "client!tp",
      name = "z",
      descriptor = "F"
   )
   private float field6477;
   @OriginalMember(
      owner = "client!tp",
      name = "r",
      descriptor = "F"
   )
   private float field6478;
   @OriginalMember(
      owner = "client!tp",
      name = "n",
      descriptor = "[[Laea;"
   )
   private class380[][] field6466;
   @OriginalMember(
      owner = "client!tp",
      name = "B",
      descriptor = "[[Lte;"
   )
   private class39[][] field6472;
   @OriginalMember(
      owner = "client!tp",
      name = "A",
      descriptor = "[[Laf;"
   )
   private class521[][] field6473;
   @OriginalMember(
      owner = "client!tp",
      name = "u",
      descriptor = "[[Lwja;"
   )
   private class643[][] field6479;
   @OriginalMember(
      owner = "client!tp",
      name = "s",
      descriptor = "[[Lvu;"
   )
   private class685[][] field6470;

   @OriginalMember(
      owner = "client!tp",
      name = "c",
      descriptor = "(III)V",
      line = 4
   )
   private final void method3329(int arg0, int arg1, int arg2) {
      class182 var4 = this.field6475.method1517(Thread.currentThread());
      var4.field2854.field6849 = 0;
      if (this.field6473 != null) {
         this.method3332(arg0, arg1, var4.field2818, var4, var4.field2854, var4.field2838, var4.field2867, var4.field2855, var4.field2863, arg2);
      } else if (this.field6479 != null) {
         this.method3334(arg0, arg1, var4.field2854, var4.field2838, var4.field2867, var4.field2855, var4.field2863, arg2);
      } else {
         if (this.field6472 != null) {
            this.method3335(arg0, arg1, var4.field2818, var4, var4.field2854, var4.field2838, var4.field2867, var4.field2855, var4.field2863, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(Llja;[I)V",
      line = 18
   )
   public final void method1129(class404 arg0, int[] arg1) {
   }

   @OriginalMember(
      owner = "client!tp",
      name = "c",
      descriptor = "(II)I",
      line = 22
   )
   private static final int method3330(int arg0, int arg1) {
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
      owner = "client!tp",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V",
      line = 50
   )
   public final void method1133(class273 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
   }

   @OriginalMember(
      owner = "client!tp",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V",
      line = 52
   )
   public final void method1123(class273 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(IIIIIII[[Z)V",
      line = 56
   )
   public final void method1118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
      class182 var9 = this.field6475.method1517(Thread.currentThread());
      class448 var10 = var9.field2854;
      var10.field6849 = 0;
      var10.field6856 = true;
      this.field6475.method655();
      if (this.field6473 == null && this.field6472 == null) {
         if (this.field6479 != null) {
            this.method3331(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field2838, var9.field2867);
         }

      } else {
         this.method3336(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field2838, var9.field2867);
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "<init>",
      descriptor = "(Lld;IIII[[I[[II)V",
      line = 72
   )
   public class418(class164 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
      super(arg3, arg4, arg7, arg5);
      this.field6475 = arg0;
      this.field6467 = arg2;
      this.field6476 = new byte[arg3 + 1][arg4 + 1];
      int var9 = this.field6475.field2470 >> 9;

      for(int var10 = 1; var10 < arg4; ++var10) {
         for(int var11 = 1; var11 < arg3; ++var11) {
            int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
            int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
            int var15 = (int)Math.sqrt((double)(var14 * var14 + arg7 * 512 + var13 * var13));
            int var16 = (var13 << 8) / var15;
            int var17 = arg7 * -512 / var15;
            int var18 = (var14 << 8) / var15;
            int var19 = (this.field6475.field2471 * var18 + this.field6475.field2490 * var17 + this.field6475.field2485 * var16 >> 17) + var9;
            int var20 = var19 >> 1;
            if (var20 < 2) {
               var20 = 2;
            } else if (var20 > 126) {
               var20 = 126;
            }

            this.field6476[var11][var10] = (byte)var20;
         }
      }

      this.field6468 = new byte[arg3 + 1][arg4 + 1];
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(IIIIIII[[ZLnr;Lke;[I[I)V",
      line = 122
   )
   private final void method3331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class182 arg8, class448 arg9, int[] arg10, int[] arg11) {
      int var13 = (arg6 - arg4) * arg2 / 256;
      int var14 = arg2 >> 8;
      boolean var15 = arg8.field2820;
      this.field6475.method581(false);
      arg9.field6860 = false;
      arg9.field6852 = false;
      int var16 = arg0;
      int var17 = arg1 + var13;

      for(int var18 = arg3; var18 < arg5; ++var18) {
         for(int var19 = arg4; var19 < arg6; ++var19) {
            if (arg7[var18 - arg3][var19 - arg4]) {
               if (this.field6479[var18][var19] != null) {
                  class643 var20 = this.field6479[var18][var19];
                  if (var20.field9301 != -1 && (var20.field9304 & 2) == 0 && var20.field9299 == -1) {
                     int var21 = this.field6475.method1519(var20.field9301);
                     arg9.method3518((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)class696.method5113(var21, var20.field9300 & 65535, 125), (float)class696.method5113(var21, var20.field9303 & 65535, 117), (float)class696.method5113(var21, var20.field9302 & 65535, 110));
                     arg9.method3518((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)class696.method5113(var21, var20.field9298 & 65535, 125), (float)class696.method5113(var21, var20.field9302 & 65535, 116), (float)class696.method5113(var21, var20.field9303 & 65535, 115));
                  } else if (var20.field9299 == -1) {
                     arg9.method3518((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)(var20.field9300 & 65535), (float)(var20.field9303 & 65535), (float)(var20.field9302 & 65535));
                     arg9.method3518((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)(var20.field9298 & 65535), (float)(var20.field9302 & 65535), (float)(var20.field9303 & 65535));
                  } else {
                     int var22 = var20.field9299;
                     arg9.method3518((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)var22, (float)var22, (float)var22);
                     arg9.method3518((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)var22, (float)var22, (float)var22);
                  }
               } else if (this.field6470[var18][var19] != null) {
                  class685 var23 = this.field6470[var18][var19];

                  for(int var24 = 0; var24 < var23.field10184; ++var24) {
                     arg10[var24] = var23.field10185[var24] * var14 / super.field4377 + var16;
                     arg11[var24] = var17 - var23.field10196[var24] * var14 / super.field4377;
                  }

                  for(int var25 = 0; var25 < var23.field10191; ++var25) {
                     short var26 = var23.field10190[var25];
                     short var27 = var23.field10183[var25];
                     short var28 = var23.field10194[var25];
                     int var29 = arg10[var26];
                     int var30 = arg10[var27];
                     int var31 = arg10[var28];
                     int var32 = arg11[var26];
                     int var33 = arg11[var27];
                     int var34 = arg11[var28];
                     if (var23.field10195 != null && var23.field10195[var25] != -1) {
                        int var35 = var23.field10195[var25];
                        arg9.method3518((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class696.method5113(var35, var23.field10189[var26], 111), (float)class696.method5113(var35, var23.field10189[var27], 115), (float)class696.method5113(var35, var23.field10189[var28], 119));
                     } else if (var23.field10192 != null && var23.field10192[var25] != -1) {
                        int var36 = this.field6475.method1519(var23.field10192[var25]);
                        arg9.method3518((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class696.method5113(var36, var23.field10189[var26], 114), (float)class696.method5113(var36, var23.field10189[var27], 117), (float)class696.method5113(var36, var23.field10189[var28], 117));
                     } else {
                        int var37 = var23.field10193[var25];
                        arg9.method3518((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class696.method5113(var37, var23.field10189[var26], 114), (float)class696.method5113(var37, var23.field10189[var27], 118), (float)class696.method5113(var37, var23.field10189[var28], 116));
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = arg1 + var13;
         var16 += var14;
      }

      arg9.field6860 = true;
      this.field6475.method581(var15);
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(IIZLnr;Lke;[I[I[I[II)V",
      line = 263
   )
   private final void method3332(int arg0, int arg1, boolean arg2, class182 arg3, class448 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
      class521 var11 = this.field6473[arg0][arg1];
      if (var11 != null) {
         if ((var11.field7921 & 2) == 0) {
            if (arg9 != 0) {
               if ((var11.field7921 & 4) != 0) {
                  if ((arg9 & 1) != 0) {
                     return;
                  }
               } else if ((arg9 & 2) != 0) {
                  return;
               }
            }

            int var12 = super.field4377 * arg0;
            int var13 = super.field4377 + var12;
            int var14 = super.field4377 * arg1;
            int var15 = super.field4377 + var14;
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
            if ((var11.field7921 & 1) != 0 && !arg2) {
               int var20 = super.field4373[arg0][arg1];
               float var21 = (float)var20 * this.field6458;
               if (this.field6471 == -1) {
                  var22 = (float)var14 * this.field6464 + (float)var12 * this.field6465 + var21 + this.field6461;
                  if (var22 <= (float)this.field6475.field2488) {
                     return;
                  }

                  var23 = (float)var14 * this.field6464 + (float)var13 * this.field6465 + var21 + this.field6461;
                  if (var23 <= (float)this.field6475.field2488) {
                     return;
                  }

                  var24 = (float)var15 * this.field6464 + (float)var13 * this.field6465 + var21 + this.field6461;
                  if (var24 <= (float)this.field6475.field2488) {
                     return;
                  }

                  var25 = (float)var15 * this.field6464 + (float)var12 * this.field6465 + var21 + this.field6461;
                  if (var25 <= (float)this.field6475.field2488) {
                     return;
                  }
               } else {
                  var22 = (float)var14 * this.field6464 + (float)var12 * this.field6465 + var21 + this.field6461;
                  var23 = (float)var14 * this.field6464 + (float)var13 * this.field6465 + var21 + this.field6461;
                  var24 = (float)var15 * this.field6464 + (float)var13 * this.field6465 + var21 + this.field6461;
                  var25 = (float)var15 * this.field6464 + (float)var12 * this.field6465 + var21 + this.field6461;
               }

               if (arg3.field2824) {
                  int var26 = (int)(var22 - (float)arg3.field2831);
                  if (var26 > 0) {
                     var16 = var26;
                     if (var26 > 255) {
                        var16 = 255;
                     }
                  }

                  int var27 = (int)(var23 - (float)arg3.field2831);
                  if (var27 > 0) {
                     var17 = var27;
                     if (var27 > 255) {
                        var17 = 255;
                     }
                  }

                  int var28 = (int)(var24 - (float)arg3.field2831);
                  if (var28 > 0) {
                     var18 = var28;
                     if (var28 > 255) {
                        var18 = 255;
                     }
                  }

                  int var29 = (int)(var25 - (float)arg3.field2831);
                  if (var29 > 0) {
                     var19 = var29;
                     if (var29 > 255) {
                        var19 = 255;
                     }
                  }
               }

               float var30 = (float)var20 * this.field6459;
               float var31 = (float)var20 * this.field6460;
               if (this.field6471 == -1) {
                  float var32 = (float)var14 * this.field6477 + (float)var12 * this.field6462 + var30 + this.field6474;
                  var33 = (int)((float)this.field6475.field2493 * var32 / var22) + arg4.field6853;
                  float var34 = (float)var14 * this.field6478 + (float)var12 * this.field6463 + var31 + this.field6469;
                  var35 = (int)((float)this.field6475.field2499 * var34 / var22) + arg4.field6854;
                  float var36 = (float)var14 * this.field6477 + (float)var13 * this.field6462 + var30 + this.field6474;
                  var37 = (int)((float)this.field6475.field2493 * var36 / var23) + arg4.field6853;
                  float var38 = (float)var14 * this.field6478 + (float)var13 * this.field6463 + var31 + this.field6469;
                  var39 = (int)((float)this.field6475.field2499 * var38 / var23) + arg4.field6854;
                  float var40 = (float)var15 * this.field6477 + (float)var13 * this.field6462 + var30 + this.field6474;
                  var41 = (int)((float)this.field6475.field2493 * var40 / var24) + arg4.field6853;
                  float var42 = (float)var15 * this.field6478 + (float)var13 * this.field6463 + var31 + this.field6469;
                  var43 = (int)((float)this.field6475.field2499 * var42 / var24) + arg4.field6854;
                  float var44 = (float)var15 * this.field6477 + (float)var12 * this.field6462 + var30 + this.field6474;
                  var45 = (int)((float)this.field6475.field2493 * var44 / var25) + arg4.field6853;
                  float var46 = (float)var15 * this.field6478 + (float)var12 * this.field6463 + var31 + this.field6469;
                  var47 = (int)((float)this.field6475.field2499 * var46 / var25) + arg4.field6854;
               } else {
                  float var48 = (float)var14 * this.field6477 + (float)var12 * this.field6462 + var30 + this.field6474;
                  var33 = (int)((float)this.field6475.field2493 * var48 / (float)this.field6471) + arg4.field6853;
                  float var49 = (float)var14 * this.field6478 + (float)var12 * this.field6463 + var31 + this.field6469;
                  var35 = (int)((float)this.field6475.field2499 * var49 / (float)this.field6471) + arg4.field6854;
                  float var50 = (float)var14 * this.field6477 + (float)var13 * this.field6462 + var30 + this.field6474;
                  var37 = (int)((float)this.field6475.field2493 * var50 / (float)this.field6471) + arg4.field6853;
                  float var51 = (float)var14 * this.field6478 + (float)var13 * this.field6463 + var31 + this.field6469;
                  var39 = (int)((float)this.field6475.field2499 * var51 / (float)this.field6471) + arg4.field6854;
                  float var52 = (float)var15 * this.field6477 + (float)var13 * this.field6462 + var30 + this.field6474;
                  var41 = (int)((float)this.field6475.field2493 * var52 / (float)this.field6471) + arg4.field6853;
                  float var53 = (float)var15 * this.field6478 + (float)var13 * this.field6463 + var31 + this.field6469;
                  var43 = (int)((float)this.field6475.field2499 * var53 / (float)this.field6471) + arg4.field6854;
                  float var54 = (float)var15 * this.field6477 + (float)var12 * this.field6462 + var30 + this.field6474;
                  var45 = (int)((float)this.field6475.field2493 * var54 / (float)this.field6471) + arg4.field6853;
                  float var55 = (float)var15 * this.field6478 + (float)var12 * this.field6463 + var31 + this.field6469;
                  var47 = (int)((float)this.field6475.field2499 * var55 / (float)this.field6471) + arg4.field6854;
               }
            } else {
               int var56 = super.field4373[arg0][arg1];
               int var57 = super.field4373[arg0 + 1][arg1];
               int var58 = super.field4373[arg0 + 1][arg1 + 1];
               int var59 = super.field4373[arg0][arg1 + 1];
               if (this.field6471 == -1) {
                  var22 = (float)var14 * this.field6464 + (float)var12 * this.field6465 + (float)var56 * this.field6458 + this.field6461;
                  if (var22 <= (float)this.field6475.field2488) {
                     return;
                  }

                  var23 = (float)var14 * this.field6464 + (float)var13 * this.field6465 + (float)var57 * this.field6458 + this.field6461;
                  if (var23 <= (float)this.field6475.field2488) {
                     return;
                  }

                  var24 = (float)var15 * this.field6464 + (float)var13 * this.field6465 + (float)var58 * this.field6458 + this.field6461;
                  if (var24 <= (float)this.field6475.field2488) {
                     return;
                  }

                  var25 = (float)var15 * this.field6464 + (float)var12 * this.field6465 + (float)var59 * this.field6458 + this.field6461;
                  if (var25 <= (float)this.field6475.field2488) {
                     return;
                  }
               } else {
                  var22 = (float)var14 * this.field6464 + (float)var12 * this.field6465 + (float)var56 * this.field6458 + this.field6461;
                  var23 = (float)var14 * this.field6464 + (float)var13 * this.field6465 + (float)var57 * this.field6458 + this.field6461;
                  var24 = (float)var15 * this.field6464 + (float)var13 * this.field6465 + (float)var58 * this.field6458 + this.field6461;
                  var25 = (float)var15 * this.field6464 + (float)var12 * this.field6465 + (float)var59 * this.field6458 + this.field6461;
               }

               if (arg2) {
                  int var60 = (int)(var22 - (float)arg3.field2831);
                  if (var60 > 255) {
                     var60 = 255;
                  }

                  if (var60 > 0) {
                     var16 = var60;
                     int var61 = var11.field7917 * var60 / 255;
                     if (var61 > 0) {
                        var56 -= var61;
                     }
                  }

                  int var62 = (int)(var23 - (float)arg3.field2831);
                  if (var62 > 255) {
                     var62 = 255;
                  }

                  if (var62 > 0) {
                     var17 = var62;
                     int var63 = var11.field7915 * var62 / 255;
                     if (var63 > 0) {
                        var57 -= var63;
                     }
                  }

                  int var64 = (int)(var24 - (float)arg3.field2831);
                  if (var64 > 255) {
                     var64 = 255;
                  }

                  if (var64 > 0) {
                     var18 = var64;
                     int var65 = var11.field7916 * var64 / 255;
                     if (var65 > 0) {
                        var58 -= var65;
                     }
                  }

                  int var66 = (int)(var25 - (float)arg3.field2831);
                  if (var66 > 255) {
                     var66 = 255;
                  }

                  if (var66 > 0) {
                     var19 = var66;
                     int var67 = var11.field7923 * var66 / 255;
                     if (var67 > 0) {
                        var59 -= var67;
                     }
                  }
               } else if (arg3.field2824) {
                  int var68 = (int)(var22 - (float)arg3.field2831);
                  if (var68 > 0) {
                     var16 = var68;
                     if (var68 > 255) {
                        var16 = 255;
                     }
                  }

                  int var69 = (int)(var23 - (float)arg3.field2831);
                  if (var69 > 0) {
                     var17 = var69;
                     if (var69 > 255) {
                        var17 = 255;
                     }
                  }

                  int var70 = (int)(var24 - (float)arg3.field2831);
                  if (var70 > 0) {
                     var18 = var70;
                     if (var70 > 255) {
                        var18 = 255;
                     }
                  }

                  int var71 = (int)(var25 - (float)arg3.field2831);
                  if (var71 > 0) {
                     var19 = var71;
                     if (var71 > 255) {
                        var19 = 255;
                     }
                  }
               }

               if (this.field6471 == -1) {
                  float var72 = (float)var14 * this.field6477 + (float)var12 * this.field6462 + (float)var56 * this.field6459 + this.field6474;
                  var33 = (int)((float)this.field6475.field2493 * var72 / var22) + arg4.field6853;
                  float var73 = (float)var14 * this.field6478 + (float)var12 * this.field6463 + (float)var56 * this.field6460 + this.field6469;
                  var35 = (int)((float)this.field6475.field2499 * var73 / var22) + arg4.field6854;
                  float var74 = (float)var14 * this.field6477 + (float)var13 * this.field6462 + (float)var57 * this.field6459 + this.field6474;
                  var37 = (int)((float)this.field6475.field2493 * var74 / var23) + arg4.field6853;
                  float var75 = (float)var14 * this.field6478 + (float)var13 * this.field6463 + (float)var57 * this.field6460 + this.field6469;
                  var39 = (int)((float)this.field6475.field2499 * var75 / var23) + arg4.field6854;
                  float var76 = (float)var15 * this.field6477 + (float)var13 * this.field6462 + (float)var58 * this.field6459 + this.field6474;
                  var41 = (int)((float)this.field6475.field2493 * var76 / var24) + arg4.field6853;
                  float var77 = (float)var15 * this.field6478 + (float)var13 * this.field6463 + (float)var58 * this.field6460 + this.field6469;
                  var43 = (int)((float)this.field6475.field2499 * var77 / var24) + arg4.field6854;
                  float var78 = (float)var15 * this.field6477 + (float)var12 * this.field6462 + (float)var59 * this.field6459 + this.field6474;
                  var45 = (int)((float)this.field6475.field2493 * var78 / var25) + arg4.field6853;
                  float var79 = (float)var15 * this.field6478 + (float)var12 * this.field6463 + (float)var59 * this.field6460 + this.field6469;
                  var47 = (int)((float)this.field6475.field2499 * var79 / var25) + arg4.field6854;
               } else {
                  float var80 = (float)var14 * this.field6477 + (float)var12 * this.field6462 + (float)var56 * this.field6459 + this.field6474;
                  var33 = (int)((float)this.field6475.field2493 * var80 / (float)this.field6471) + arg4.field6853;
                  float var81 = (float)var14 * this.field6478 + (float)var12 * this.field6463 + (float)var56 * this.field6460 + this.field6469;
                  var35 = (int)((float)this.field6475.field2499 * var81 / (float)this.field6471) + arg4.field6854;
                  float var82 = (float)var14 * this.field6477 + (float)var13 * this.field6462 + (float)var57 * this.field6459 + this.field6474;
                  var37 = (int)((float)this.field6475.field2493 * var82 / (float)this.field6471) + arg4.field6853;
                  float var83 = (float)var14 * this.field6478 + (float)var13 * this.field6463 + (float)var57 * this.field6460 + this.field6469;
                  var39 = (int)((float)this.field6475.field2499 * var83 / (float)this.field6471) + arg4.field6854;
                  float var84 = (float)var15 * this.field6477 + (float)var13 * this.field6462 + (float)var58 * this.field6459 + this.field6474;
                  var41 = (int)((float)this.field6475.field2493 * var84 / (float)this.field6471) + arg4.field6853;
                  float var85 = (float)var15 * this.field6478 + (float)var13 * this.field6463 + (float)var58 * this.field6460 + this.field6469;
                  var43 = (int)((float)this.field6475.field2499 * var85 / (float)this.field6471) + arg4.field6854;
                  float var86 = (float)var15 * this.field6477 + (float)var12 * this.field6462 + (float)var59 * this.field6459 + this.field6474;
                  var45 = (int)((float)this.field6475.field2493 * var86 / (float)this.field6471) + arg4.field6853;
                  float var87 = (float)var15 * this.field6478 + (float)var12 * this.field6463 + (float)var59 * this.field6460 + this.field6469;
                  var47 = (int)((float)this.field6475.field2499 * var87 / (float)this.field6471) + arg4.field6854;
               }
            }

            boolean var88 = var11.field7922 != -1 && this.method3333(this.field6475.field8891.method1373(var11.field7922, (byte)-54).field6924);
            if (this.field6471 == -1) {
               int var89 = var17 + var18 + var19;
               if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                  arg4.field6856 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field6851 || var45 > arg4.field6851 || var37 > arg4.field6851;
                  if (var89 < 765) {
                     if (var89 > 0) {
                        if (var11.field7922 >= 0) {
                           int var90 = -16777216;
                           if (var88) {
                              var90 = -1694498816;
                           }

                           arg4.method3507((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field7918 & 16777215, var90 | var11.field7914 & 16777215, var90 | var11.field7920 & 16777215, arg3.field2823, var18, var19, var17, var11.field7922);
                        } else {
                           if (var88) {
                              arg4.field6849 = 100;
                           }

                           arg4.method3512((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), class573.method4311(var11.field7918, 1313937672, var18 << 24 | arg3.field2823), class573.method4311(var11.field7914, 1313937672, var19 << 24 | arg3.field2823), class573.method4311(var11.field7920, 1313937672, var17 << 24 | arg3.field2823));
                           arg4.field6849 = 0;
                        }
                     } else if (var11.field7922 >= 0) {
                        int var91 = -16777216;
                        if (var88) {
                           var91 = -1694498816;
                        }

                        arg4.method3507((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field7918 & 16777215, var91 | var11.field7914 & 16777215, var91 | var11.field7920 & 16777215, 0, 0, 0, 0, var11.field7922);
                     } else {
                        if (var88) {
                           arg4.field6849 = 100;
                        }

                        arg4.method3512((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), var11.field7918, var11.field7914, var11.field7920);
                        arg4.field6849 = 0;
                     }
                  } else {
                     arg4.method3514((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), arg3.field2823);
                  }
               }

               int var92 = var16 + var17 + var19;
               if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                  arg4.field6856 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field6851 || var37 > arg4.field6851 || var45 > arg4.field6851;
                  if (var92 < 765) {
                     if (var88) {
                        arg4.field6849 = -1694498816;
                     }

                     if (var92 > 0) {
                        if (var11.field7922 >= 0) {
                           int var93 = -16777216;
                           if (var88) {
                              var93 = -1694498816;
                           }

                           arg4.method3507((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field7913 & 16777215, var93 | var11.field7920 & 16777215, var93 | var11.field7914 & 16777215, arg3.field2823, var16, var17, var19, var11.field7922);
                           return;
                        }

                        if (var88) {
                           arg4.field6849 = 100;
                        }

                        arg4.method3512((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), class573.method4311(var11.field7913, 1313937672, var16 << 24 | arg3.field2823), class573.method4311(var11.field7920, 1313937672, var17 << 24 | arg3.field2823), class573.method4311(var11.field7914, 1313937672, var19 << 24 | arg3.field2823));
                        arg4.field6849 = 0;
                        return;
                     }

                     if (var11.field7922 >= 0) {
                        int var94 = -16777216;
                        if (var88) {
                           var94 = -1694498816;
                        }

                        arg4.method3507((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field7913 & 16777215, var94 | var11.field7920 & 16777215, var94 | var11.field7914 & 16777215, 0, 0, 0, 0, var11.field7922);
                        return;
                     }

                     if (var88) {
                        arg4.field6849 = 100;
                     }

                     arg4.method3512((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), var11.field7913, var11.field7920, var11.field7914);
                     arg4.field6849 = 0;
                     return;
                  }

                  arg4.method3514((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), arg3.field2823);
                  return;
               }
            } else {
               int var95 = var17 + var18 + var19;
               if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                  arg4.field6856 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field6851 || var45 > arg4.field6851 || var37 > arg4.field6851;
                  if (var95 < 765) {
                     if (var88) {
                        arg4.field6849 = -1694498816;
                     }

                     if (var95 > 0) {
                        if (var11.field7922 >= 0) {
                           int var96 = -16777216;
                           if (var88) {
                              var96 = -1694498816;
                           }

                           arg4.method3507((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field7918 & 16777215, var96 | var11.field7914 & 16777215, var96 | var11.field7920 & 16777215, arg3.field2823, var18, var19, var17, var11.field7922);
                        } else {
                           if (var88) {
                              arg4.field6849 = 100;
                           }

                           arg4.method3512((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), class573.method4311(var11.field7918, 1313937672, var18 << 24 | arg3.field2823), class573.method4311(var11.field7914, 1313937672, var19 << 24 | arg3.field2823), class573.method4311(var11.field7920, 1313937672, var17 << 24 | arg3.field2823));
                           arg4.field6849 = 0;
                        }
                     } else if (var11.field7922 >= 0) {
                        int var97 = -16777216;
                        if (var88) {
                           var97 = -1694498816;
                        }

                        arg4.method3507((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field7918 & 16777215, var97 | var11.field7914 & 16777215, var97 | var11.field7920 & 16777215, 0, 0, 0, 0, var11.field7922);
                     } else {
                        if (var88) {
                           arg4.field6849 = 100;
                        }

                        arg4.method3512((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), var11.field7918, var11.field7914, var11.field7920);
                        arg4.field6849 = 0;
                     }
                  } else {
                     arg4.method3514((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), arg3.field2823);
                  }
               }

               int var98 = var16 + var17 + var19;
               if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                  arg4.field6856 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field6851 || var37 > arg4.field6851 || var45 > arg4.field6851;
                  if (var98 < 765) {
                     if (var88) {
                        arg4.field6849 = -1694498816;
                     }

                     if (var98 > 0) {
                        if (var11.field7922 >= 0) {
                           int var99 = -16777216;
                           if (var88) {
                              var99 = -1694498816;
                           }

                           arg4.method3507((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field7913 & 16777215, var99 | var11.field7920 & 16777215, var99 | var11.field7914 & 16777215, arg3.field2823, var16, var17, var19, var11.field7922);
                           return;
                        }

                        if (var88) {
                           arg4.field6849 = 100;
                        }

                        arg4.method3512((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), class573.method4311(var11.field7913, 1313937672, var16 << 24 | arg3.field2823), class573.method4311(var11.field7920, 1313937672, var17 << 24 | arg3.field2823), class573.method4311(var11.field7914, 1313937672, var19 << 24 | arg3.field2823));
                        arg4.field6849 = 0;
                        return;
                     }

                     if (var11.field7922 >= 0) {
                        int var100 = -16777216;
                        if (var88) {
                           var100 = -1694498816;
                        }

                        arg4.method3507((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field7913 & 16777215, var100 | var11.field7920 & 16777215, var100 | var11.field7914 & 16777215, 0, 0, 0, 0, var11.field7922);
                        return;
                     }

                     if (var88) {
                        arg4.field6849 = 100;
                     }

                     arg4.method3512((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), var11.field7913, var11.field7920, var11.field7914);
                     arg4.field6849 = 0;
                     return;
                  }

                  arg4.method3514((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), arg3.field2823);
               }
            }

         }
      } else {
         class380 var101 = this.field6466[arg0][arg1];
         if (var101 != null) {
            if (arg9 != 0) {
               if ((var101.field6012 & 4) != 0) {
                  if ((arg9 & 1) != 0) {
                     return;
                  }
               } else if ((arg9 & 2) != 0) {
                  return;
               }
            }

            if (this.field6471 == -1) {
               for(int var102 = 0; var102 < var101.field6010; ++var102) {
                  int var103 = (arg0 << super.field4375) + var101.field6017[var102];
                  int var104 = var101.field6018[var102];
                  int var105 = (arg1 << super.field4375) + var101.field6009[var102];
                  float var106 = (float)var105 * this.field6464 + (float)var103 * this.field6465 + (float)var104 * this.field6458 + this.field6461;
                  if (var106 <= (float)this.field6475.field2488) {
                     return;
                  }

                  arg8[var102] = 0;
                  if (arg2) {
                     int var107 = (int)(var106 - (float)arg3.field2831);
                     if (var107 > 255) {
                        var107 = 255;
                     }

                     if (var107 > 0) {
                        arg8[var102] = var107;
                        int var108 = var101.field6019[var102] * var107 / 255;
                        if (var108 > 0) {
                           var104 -= var108;
                        }
                     }
                  } else if (arg3.field2824) {
                     int var109 = (int)(var106 - (float)arg3.field2831);
                     if (var109 > 0) {
                        arg8[var102] = var109;
                        if (arg8[var102] > 255) {
                           arg8[var102] = 255;
                        }
                     }
                  }

                  float var110 = (float)var105 * this.field6477 + (float)var103 * this.field6462 + (float)var104 * this.field6459 + this.field6474;
                  float var111 = (float)var105 * this.field6478 + (float)var103 * this.field6463 + (float)var104 * this.field6460 + this.field6469;
                  arg5[var102] = (int)((float)this.field6475.field2493 * var110 / var106) + arg4.field6853;
                  arg6[var102] = (int)((float)this.field6475.field2499 * var111 / var106) + arg4.field6854;
                  arg7[var102] = (int)var106;
               }
            } else {
               for(int var112 = 0; var112 < var101.field6010; ++var112) {
                  int var152 = (arg0 << super.field4375) + var101.field6017[var112];
                  int var153 = var101.field6018[var112];
                  int var154 = (arg1 << super.field4375) + var101.field6009[var112];
                  float var155 = (float)var154 * this.field6464 + (float)var152 * this.field6465 + (float)var153 * this.field6458 + this.field6461;
                  arg8[var112] = 0;
                  if (arg2) {
                     int var156 = this.field6471 - arg3.field2831;
                     if (var156 > 255) {
                        var156 = 255;
                     }

                     if (var156 > 0) {
                        arg8[var112] = var156;
                        int var157 = var101.field6019[var112] * var156 / 255;
                        if (var157 > 0) {
                           var153 -= var157;
                        }
                     }
                  } else if (arg3.field2824) {
                     int var158 = this.field6471 - arg3.field2831;
                     if (var158 > 0) {
                        arg8[var112] = var158;
                        if (arg8[var112] > 255) {
                           arg8[var112] = 255;
                        }
                     }
                  }

                  float var159 = (float)var154 * this.field6477 + (float)var152 * this.field6462 + (float)var153 * this.field6459 + this.field6474;
                  float var160 = (float)var154 * this.field6478 + (float)var152 * this.field6463 + (float)var153 * this.field6460 + this.field6469;
                  arg5[var112] = (int)((float)this.field6475.field2493 * var159 / (float)this.field6471) + arg4.field6853;
                  arg6[var112] = (int)((float)this.field6475.field2499 * var160 / (float)this.field6471) + arg4.field6854;
                  arg7[var112] = (int)var155;
               }
            }

            if (var101.field6016 != null) {
               if (this.field6471 == -1) {
                  for(int var113 = 0; var113 < var101.field6015; ++var113) {
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
                        arg4.field6856 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field6851 || var118 > arg4.field6851 || var119 > arg4.field6851;
                        short var124 = var101.field6016[var113];
                        if (var123 < 765) {
                           if (var123 > 0) {
                              if (var124 != -1) {
                                 int var125 = -16777216;
                                 if (var124 != -1 && this.method3333(this.field6475.field8891.method1373(var124, (byte)-54).field6924)) {
                                    var125 = -1694498816;
                                 }

                                 arg4.method3507((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], (float)var101.field6017[var114] / (float)super.field4377, (float)var101.field6017[var115] / (float)super.field4377, (float)var101.field6017[var116] / (float)super.field4377, (float)var101.field6009[var114] / (float)super.field4377, (float)var101.field6009[var115] / (float)super.field4377, (float)var101.field6009[var116] / (float)super.field4377, var125 | var101.field6014[var114] & 16777215, var125 | var101.field6014[var115] & 16777215, var125 | var101.field6014[var116] & 16777215, arg3.field2823, arg8[var114], arg8[var115], arg8[var116], var124);
                              } else if ((var101.field6014[var114] & 16777215) != 0) {
                                 if (var124 != -1 && this.method3333(this.field6475.field8891.method1373(var124, (byte)-54).field6924)) {
                                    arg4.field6849 = -1694498816;
                                 }

                                 arg4.method3512((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], class573.method4311(var101.field6014[var114], 1313937672, arg8[var114] << 24 | arg3.field2823), class573.method4311(var101.field6014[var115], 1313937672, arg8[var115] << 24 | arg3.field2823), class573.method4311(var101.field6014[var116], 1313937672, arg8[var116] << 24 | arg3.field2823));
                                 arg4.field6849 = 0;
                              }
                           } else if (var124 != -1) {
                              int var126 = -16777216;
                              if (var124 != -1 && this.method3333(this.field6475.field8891.method1373(var124, (byte)-54).field6924)) {
                                 var126 = -1694498816;
                              }

                              arg4.method3507((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], (float)var101.field6017[var114] / (float)super.field4377, (float)var101.field6017[var115] / (float)super.field4377, (float)var101.field6017[var116] / (float)super.field4377, (float)var101.field6009[var114] / (float)super.field4377, (float)var101.field6009[var115] / (float)super.field4377, (float)var101.field6009[var116] / (float)super.field4377, var126 | var101.field6014[var114] & 16777215, var126 | var101.field6014[var115] & 16777215, var126 | var101.field6014[var116] & 16777215, 0, 0, 0, 0, var124);
                           } else if ((var101.field6014[var114] & 16777215) != 0) {
                              if (var124 != -1 && this.method3333(this.field6475.field8891.method1373(var124, (byte)-54).field6924)) {
                                 arg4.field6849 = -1694498816;
                              }

                              arg4.method3512((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], var101.field6014[var114], var101.field6014[var115], var101.field6014[var116]);
                              arg4.field6849 = 0;
                           }
                        } else {
                           arg4.method3514((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], arg3.field2823);
                        }
                     }
                  }

                  return;
               }

               for(int var127 = 0; var127 < var101.field6015; ++var127) {
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
                     arg4.field6856 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field6851 || var132 > arg4.field6851 || var133 > arg4.field6851;
                     short var138 = var101.field6016[var127];
                     if (var137 < 765) {
                        if (var138 != -1 && this.method3333(this.field6475.field8891.method1373(var138, (byte)-54).field6924)) {
                           arg4.field6849 = -1694498816;
                        }

                        if (var137 > 0) {
                           if (var138 != -1) {
                              int var139 = -16777216;
                              if (var138 != -1 && this.method3333(this.field6475.field8891.method1373(var138, (byte)-54).field6924)) {
                                 var139 = -1694498816;
                              }

                              arg4.method3507((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], (float)var101.field6017[var128] / (float)super.field4377, (float)var101.field6017[var129] / (float)super.field4377, (float)var101.field6017[var130] / (float)super.field4377, (float)var101.field6009[var128] / (float)super.field4377, (float)var101.field6009[var129] / (float)super.field4377, (float)var101.field6009[var130] / (float)super.field4377, var139 | var101.field6014[var128] & 16777215, var139 | var101.field6014[var129] & 16777215, var139 | var101.field6014[var130] & 16777215, arg3.field2823, arg8[var128], arg8[var129], arg8[var130], var138);
                           } else if ((var101.field6014[var128] & 16777215) != 0) {
                              if (var138 != -1 && this.method3333(this.field6475.field8891.method1373(var138, (byte)-54).field6924)) {
                                 arg4.field6849 = -1694498816;
                              }

                              arg4.method3512((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], class573.method4311(var101.field6014[var128], 1313937672, arg8[var128] << 24 | arg3.field2823), class573.method4311(var101.field6014[var129], 1313937672, arg8[var129] << 24 | arg3.field2823), class573.method4311(var101.field6014[var130], 1313937672, arg8[var130] << 24 | arg3.field2823));
                              arg4.field6849 = 0;
                           }
                        } else if (var138 != -1) {
                           int var140 = -16777216;
                           if (var138 != -1 && this.method3333(this.field6475.field8891.method1373(var138, (byte)-54).field6924)) {
                              var140 = -1694498816;
                           }

                           arg4.method3507((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], (float)var101.field6017[var128] / (float)super.field4377, (float)var101.field6017[var129] / (float)super.field4377, (float)var101.field6017[var130] / (float)super.field4377, (float)var101.field6009[var128] / (float)super.field4377, (float)var101.field6009[var129] / (float)super.field4377, (float)var101.field6009[var130] / (float)super.field4377, var140 | var101.field6014[var128] & 16777215, var140 | var101.field6014[var129] & 16777215, var140 | var101.field6014[var130] & 16777215, 0, 0, 0, 0, var138);
                        } else if ((var101.field6014[var128] & 16777215) != 0) {
                           if (var138 != -1 && this.method3333(this.field6475.field8891.method1373(var138, (byte)-54).field6924)) {
                              arg4.field6849 = -1694498816;
                           }

                           arg4.method3512((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], var101.field6014[var128], var101.field6014[var129], var101.field6014[var130]);
                           arg4.field6849 = 0;
                        }

                        arg4.field6849 = 0;
                     } else {
                        arg4.method3514((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], arg3.field2823);
                     }
                  }
               }

               return;
            }

            for(int var141 = 0; var141 < var101.field6015; ++var141) {
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
                  arg4.field6856 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field6851 || var146 > arg4.field6851 || var147 > arg4.field6851;
                  if (var151 < 765) {
                     if (var151 > 0) {
                        if ((var101.field6014[var142] & 16777215) != 0) {
                           arg4.method3512((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], class52.method351(arg8[var142], var101.field6014[var142], arg3.field2823, 107), class52.method351(arg8[var143], var101.field6014[var143], arg3.field2823, -68), class52.method351(arg8[var144], var101.field6014[var144], arg3.field2823, -22));
                        }
                     } else if ((var101.field6014[var142] & 16777215) != 0) {
                        arg4.method3512((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], var101.field6014[var142], var101.field6014[var143], var101.field6014[var144]);
                     }
                  } else {
                     arg4.method3514((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], arg3.field2823);
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(III[[ZZI)V",
      line = 1254
   )
   public final void method1119(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
      class225 var7 = this.field6475.field2491;
      this.field6471 = -1;
      this.field6462 = var7.field3419;
      this.field6459 = var7.field3427;
      this.field6477 = var7.field3422;
      this.field6474 = var7.field3428;
      this.field6463 = var7.field3429;
      this.field6460 = var7.field3410;
      this.field6478 = var7.field3420;
      this.field6469 = var7.field3430;
      this.field6465 = var7.field3421;
      this.field6458 = var7.field3418;
      this.field6464 = var7.field3426;
      this.field6461 = var7.field3408;

      for(int var8 = 0; var8 < arg2 + arg2; ++var8) {
         for(int var9 = 0; var9 < arg2 + arg2; ++var9) {
            if (arg3[var8][var9]) {
               int var10 = arg0 - arg2 + var8;
               int var11 = arg1 - arg2 + var9;
               if (var10 >= 0 && var10 < super.field4383 && var11 >= 0 && var11 < super.field4379) {
                  this.method3329(var10, var11, arg5);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(II)V",
      line = 1308
   )
   public final void method1121(int arg0, int arg1) {
      this.method3329(arg0, arg1, 0);
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V",
      line = 1311
   )
   public final void method1131(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
      if (this.field6479 == null) {
         this.field6479 = new class643[super.field4383][super.field4379];
         this.field6470 = new class685[super.field4383][super.field4379];
      } else if (this.field6473 != null || this.field6472 != null) {
         throw new IllegalStateException();
      }

      boolean var18 = false;
      if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
         var18 = true;

         for(int var19 = 1; var19 < 2; ++var19) {
            int var20 = arg2[arg6[var19]];
            int var21 = arg4[arg6[var19]];
            if (var20 != 0 && super.field4377 != var20 || var21 != 0 && super.field4377 != var21) {
               var18 = false;
               break;
            }
         }
      }

      if (!var18) {
         class685 var22 = new class685();
         short var23 = (short)arg2.length;
         short var24 = (short)arg9.length;
         var22.field10184 = var23;
         var22.field10189 = new short[var23];
         var22.field10185 = new short[var23];
         var22.field10187 = new short[var23];
         var22.field10196 = new short[var23];

         for(int var25 = 0; var25 < var23; ++var25) {
            int var32 = arg2[var25];
            int var33 = arg4[var25];
            if (var32 == 0 && var33 == 0) {
               var22.field10189[var25] = (short)(this.field6476[arg0][arg1] - this.field6468[arg0][arg1]);
            } else if (var32 == 0 && super.field4377 == var33) {
               var22.field10189[var25] = (short)(this.field6476[arg0][arg1 + 1] - this.field6468[arg0][arg1 + 1]);
            } else if (super.field4377 == var32 && super.field4377 == var33) {
               var22.field10189[var25] = (short)(this.field6476[arg0 + 1][arg1 + 1] - this.field6468[arg0 + 1][arg1 + 1]);
            } else if (super.field4377 == var32 && var33 == 0) {
               var22.field10189[var25] = (short)(this.field6476[arg0 + 1][arg1] - this.field6468[arg0 + 1][arg1]);
            } else {
               int var34 = (this.field6476[arg0 + 1][arg1] - this.field6468[arg0 + 1][arg1]) * var32 + (this.field6476[arg0][arg1] - this.field6468[arg0][arg1]) * (super.field4377 - var32);
               int var35 = (this.field6476[arg0 + 1][arg1 + 1] - this.field6468[arg0 + 1][arg1 + 1]) * var32 + (this.field6476[arg0][arg1 + 1] - this.field6468[arg0][arg1 + 1]) * (super.field4377 - var32);
               var22.field10189[var25] = (short)((super.field4377 - var33) * var34 + var33 * var35 >> super.field4375 * 2);
            }

            int var36 = (arg0 << super.field4375) + var32;
            int var37 = (arg1 << super.field4375) + var33;
            var22.field10185[var25] = (short)var32;
            var22.field10196[var25] = (short)var33;
            var22.field10187[var25] = (short)(this.method2312(var36, var37, -125) + (arg3 != null ? arg3[var25] : 0));
            if (var22.field10189[var25] < 2) {
               var22.field10189[var25] = 2;
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
               class453 var31 = this.field6475.field8891.method1373(var30, (byte)-54);
               if (!var31.field6934) {
                  var26 = true;
                  if (this.method3333(var31.field6924) || var31.field6926 != 0 || var31.field6932 != 0) {
                     var22.field10186 = (byte)(var22.field10186 | 4);
                  }
               }
            }
         }

         var22.field10193 = new int[var27];
         if (arg10 != null) {
            var22.field10195 = new int[var27];
         }

         var22.field10190 = new short[var27];
         var22.field10183 = new short[var27];
         var22.field10194 = new short[var27];
         if (var26) {
            var22.field10192 = new short[var27];
            var22.field10188 = new short[var27];
         }

         for(int var29 = 0; var29 < var24; ++var29) {
            if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
               if (arg9[var29] >= 0) {
                  var22.field10193[var22.field10191] = class221.method1909((byte)-121, arg9[var29]);
               } else {
                  var22.field10193[var22.field10191] = -1;
               }

               if (arg10 != null) {
                  if (arg10[var29] != -1) {
                     var22.field10195[var22.field10191] = class221.method1909((byte)-67, arg10[var29]);
                  } else {
                     var22.field10195[var22.field10191] = -1;
                  }
               }

               var22.field10190[var22.field10191] = (short)arg6[var29];
               var22.field10183[var22.field10191] = (short)arg7[var29];
               var22.field10194[var22.field10191] = (short)arg8[var29];
               if (var26) {
                  if (arg11[var29] != -1 && !this.field6475.field8891.method1373(arg11[var29], (byte)-54).field6934) {
                     var22.field10192[var22.field10191] = (short)arg11[var29];
                     var22.field10188[var22.field10191] = (short)arg12[var29];
                  } else {
                     var22.field10192[var22.field10191] = -1;
                  }
               }

               ++var22.field10191;
            }
         }

         this.field6470[arg0][arg1] = var22;
      } else {
         if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
            class643 var38 = new class643();
            int var39 = arg9[0];
            int var40 = arg11[0];
            if (arg10 != null) {
               var38.field9299 = class696.method5113(class221.method1909((byte)-43, arg10[0]), this.field6476[arg0][arg1] - this.field6468[arg0][arg1], 126);
               if (var39 == -1) {
                  var38.field9304 = (byte)(var38.field9304 | 2);
               }
            }

            if (super.field4373[arg0 + 1][arg1] == super.field4373[arg0][arg1] && super.field4373[arg0 + 1][arg1 + 1] == super.field4373[arg0][arg1] && super.field4373[arg0][arg1 + 1] == super.field4373[arg0][arg1]) {
               var38.field9304 = (byte)(var38.field9304 | 1);
            }

            class453 var41 = null;
            if (var40 != -1) {
               var41 = this.field6475.field8891.method1373(var40, (byte)-54);
            }

            if (var41 != null && (var38.field9304 & 2) == 0 && !var41.field6934) {
               var38.field9298 = (short)(this.field6476[arg0][arg1] - this.field6468[arg0][arg1]);
               var38.field9302 = (short)(this.field6476[arg0 + 1][arg1] - this.field6468[arg0 + 1][arg1]);
               var38.field9300 = (short)(this.field6476[arg0 + 1][arg1 + 1] - this.field6468[arg0 + 1][arg1 + 1]);
               var38.field9303 = (short)(this.field6476[arg0][arg1 + 1] - this.field6468[arg0][arg1 + 1]);
               var38.field9301 = (short)var40;
               if (this.method3333(var41.field6924) || var41.field6926 != 0 || var41.field6932 != 0) {
                  var38.field9304 = (byte)(var38.field9304 | 4);
               }
            } else {
               short var42 = class221.method1909((byte)-97, var39);
               var38.field9298 = (short)class696.method5113(var42, this.field6476[arg0][arg1] - this.field6468[arg0][arg1], 114);
               var38.field9302 = (short)class696.method5113(var42, this.field6476[arg0 + 1][arg1] - this.field6468[arg0 + 1][arg1], 118);
               var38.field9300 = (short)class696.method5113(var42, this.field6476[arg0 + 1][arg1 + 1] - this.field6468[arg0 + 1][arg1 + 1], 121);
               var38.field9303 = (short)class696.method5113(var42, this.field6476[arg0][arg1 + 1] - this.field6468[arg0][arg1 + 1], 110);
               var38.field9301 = -1;
            }

            this.field6479[arg0][arg1] = var38;
         }

      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(III[[ZZII)V",
      line = 1560
   )
   public final void method1130(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
      class225 var8 = this.field6475.field2491;
      this.field6471 = arg5;
      this.field6462 = var8.field3419;
      this.field6459 = var8.field3427;
      this.field6477 = var8.field3422;
      this.field6474 = var8.field3428;
      this.field6463 = var8.field3429;
      this.field6460 = var8.field3410;
      this.field6478 = var8.field3420;
      this.field6469 = var8.field3430;
      this.field6465 = var8.field3421;
      this.field6458 = var8.field3418;
      this.field6464 = var8.field3426;
      this.field6461 = var8.field3408;

      for(int var9 = 0; var9 < arg2 + arg2; ++var9) {
         for(int var10 = 0; var10 < arg2 + arg2; ++var10) {
            if (arg3[var9][var10]) {
               int var11 = arg0 - arg2 + var9;
               int var12 = arg1 - arg2 + var10;
               if (var11 >= 0 && var11 < super.field4383 && var12 >= 0 && var12 < super.field4379) {
                  this.method3329(var11, var12, arg6);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!tp",
      name = "b",
      descriptor = "(I)Z",
      line = 1604
   )
   private final boolean method3333(int arg0) {
      if ((this.field6467 & 8) == 0) {
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
      owner = "client!tp",
      name = "a",
      descriptor = "(IILke;[I[I[I[II)V",
      line = 1620
   )
   private final void method3334(int arg0, int arg1, class448 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
      class643 var9 = this.field6479[arg0][arg1];
      if (var9 != null) {
         if ((var9.field9304 & 2) == 0) {
            if (arg7 != 0) {
               if ((var9.field9304 & 4) != 0) {
                  if ((arg7 & 1) != 0) {
                     return;
                  }
               } else if ((arg7 & 2) != 0) {
                  return;
               }
            }

            int var10 = super.field4377 * arg0;
            int var11 = super.field4377 + var10;
            int var12 = super.field4377 * arg1;
            int var13 = super.field4377 + var12;
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
            if ((var9.field9304 & 1) != 0) {
               int var14 = super.field4373[arg0][arg1];
               float var15 = (float)var14 * this.field6458;
               if (this.field6471 == -1) {
                  var16 = (float)var12 * this.field6464 + (float)var10 * this.field6465 + var15 + this.field6461;
                  if (var16 <= (float)this.field6475.field2488) {
                     return;
                  }

                  var17 = (float)var12 * this.field6464 + (float)var11 * this.field6465 + var15 + this.field6461;
                  if (var17 <= (float)this.field6475.field2488) {
                     return;
                  }

                  var18 = (float)var13 * this.field6464 + (float)var11 * this.field6465 + var15 + this.field6461;
                  if (var18 <= (float)this.field6475.field2488) {
                     return;
                  }

                  var19 = (float)var13 * this.field6464 + (float)var10 * this.field6465 + var15 + this.field6461;
                  if (var19 <= (float)this.field6475.field2488) {
                     return;
                  }
               } else {
                  var16 = (float)var12 * this.field6464 + (float)var10 * this.field6465 + var15 + this.field6461;
                  var17 = (float)var12 * this.field6464 + (float)var11 * this.field6465 + var15 + this.field6461;
                  var18 = (float)var13 * this.field6464 + (float)var11 * this.field6465 + var15 + this.field6461;
                  var19 = (float)var13 * this.field6464 + (float)var10 * this.field6465 + var15 + this.field6461;
               }

               float var20 = (float)var14 * this.field6459;
               float var21 = (float)var14 * this.field6460;
               if (this.field6471 == -1) {
                  float var22 = (float)var12 * this.field6477 + (float)var10 * this.field6462 + var20 + this.field6474;
                  var23 = (int)((float)this.field6475.field2493 * var22 / var16) + arg2.field6853;
                  float var24 = (float)var12 * this.field6478 + (float)var10 * this.field6463 + var21 + this.field6469;
                  var25 = (int)((float)this.field6475.field2499 * var24 / var16) + arg2.field6854;
                  float var26 = (float)var12 * this.field6477 + (float)var11 * this.field6462 + var20 + this.field6474;
                  var27 = (int)((float)this.field6475.field2493 * var26 / var17) + arg2.field6853;
                  float var28 = (float)var12 * this.field6478 + (float)var11 * this.field6463 + var21 + this.field6469;
                  var29 = (int)((float)this.field6475.field2499 * var28 / var17) + arg2.field6854;
                  float var30 = (float)var13 * this.field6477 + (float)var11 * this.field6462 + var20 + this.field6474;
                  var31 = (int)((float)this.field6475.field2493 * var30 / var18) + arg2.field6853;
                  float var32 = (float)var13 * this.field6478 + (float)var11 * this.field6463 + var21 + this.field6469;
                  var33 = (int)((float)this.field6475.field2499 * var32 / var18) + arg2.field6854;
                  float var34 = (float)var13 * this.field6477 + (float)var10 * this.field6462 + var20 + this.field6474;
                  var35 = (int)((float)this.field6475.field2493 * var34 / var19) + arg2.field6853;
                  float var36 = (float)var13 * this.field6478 + (float)var10 * this.field6463 + var21 + this.field6469;
                  var37 = (int)((float)this.field6475.field2499 * var36 / var19) + arg2.field6854;
               } else {
                  float var38 = (float)var12 * this.field6477 + (float)var10 * this.field6462 + var20 + this.field6474;
                  var23 = (int)((float)this.field6475.field2493 * var38 / (float)this.field6471) + arg2.field6853;
                  float var39 = (float)var12 * this.field6478 + (float)var10 * this.field6463 + var21 + this.field6469;
                  var25 = (int)((float)this.field6475.field2499 * var39 / (float)this.field6471) + arg2.field6854;
                  float var40 = (float)var12 * this.field6477 + (float)var11 * this.field6462 + var20 + this.field6474;
                  var27 = (int)((float)this.field6475.field2493 * var40 / (float)this.field6471) + arg2.field6853;
                  float var41 = (float)var12 * this.field6478 + (float)var11 * this.field6463 + var21 + this.field6469;
                  var29 = (int)((float)this.field6475.field2499 * var41 / (float)this.field6471) + arg2.field6854;
                  float var42 = (float)var13 * this.field6477 + (float)var11 * this.field6462 + var20 + this.field6474;
                  var31 = (int)((float)this.field6475.field2493 * var42 / (float)this.field6471) + arg2.field6853;
                  float var43 = (float)var13 * this.field6478 + (float)var11 * this.field6463 + var21 + this.field6469;
                  var33 = (int)((float)this.field6475.field2499 * var43 / (float)this.field6471) + arg2.field6854;
                  float var44 = (float)var13 * this.field6477 + (float)var10 * this.field6462 + var20 + this.field6474;
                  var35 = (int)((float)this.field6475.field2493 * var44 / (float)this.field6471) + arg2.field6853;
                  float var45 = (float)var13 * this.field6478 + (float)var10 * this.field6463 + var21 + this.field6469;
                  var37 = (int)((float)this.field6475.field2499 * var45 / (float)this.field6471) + arg2.field6854;
               }
            } else {
               int var46 = super.field4373[arg0][arg1];
               int var47 = super.field4373[arg0 + 1][arg1];
               int var48 = super.field4373[arg0 + 1][arg1 + 1];
               int var49 = super.field4373[arg0][arg1 + 1];
               if (this.field6471 == -1) {
                  var16 = (float)var12 * this.field6464 + (float)var10 * this.field6465 + (float)var46 * this.field6458 + this.field6461;
                  if (var16 <= (float)this.field6475.field2488) {
                     return;
                  }

                  var17 = (float)var12 * this.field6464 + (float)var11 * this.field6465 + (float)var47 * this.field6458 + this.field6461;
                  if (var17 <= (float)this.field6475.field2488) {
                     return;
                  }

                  var18 = (float)var13 * this.field6464 + (float)var11 * this.field6465 + (float)var48 * this.field6458 + this.field6461;
                  if (var18 <= (float)this.field6475.field2488) {
                     return;
                  }

                  var19 = (float)var13 * this.field6464 + (float)var10 * this.field6465 + (float)var49 * this.field6458 + this.field6461;
                  if (var19 <= (float)this.field6475.field2488) {
                     return;
                  }

                  float var50 = (float)var12 * this.field6477 + (float)var10 * this.field6462 + (float)var46 * this.field6459 + this.field6474;
                  var23 = (int)((float)this.field6475.field2493 * var50 / var16) + arg2.field6853;
                  float var51 = (float)var12 * this.field6478 + (float)var10 * this.field6463 + (float)var46 * this.field6460 + this.field6469;
                  var25 = (int)((float)this.field6475.field2499 * var51 / var16) + arg2.field6854;
                  float var52 = (float)var12 * this.field6477 + (float)var11 * this.field6462 + (float)var47 * this.field6459 + this.field6474;
                  var27 = (int)((float)this.field6475.field2493 * var52 / var17) + arg2.field6853;
                  float var53 = (float)var12 * this.field6478 + (float)var11 * this.field6463 + (float)var47 * this.field6460 + this.field6469;
                  var29 = (int)((float)this.field6475.field2499 * var53 / var17) + arg2.field6854;
                  float var54 = (float)var13 * this.field6477 + (float)var11 * this.field6462 + (float)var48 * this.field6459 + this.field6474;
                  var31 = (int)((float)this.field6475.field2493 * var54 / var18) + arg2.field6853;
                  float var55 = (float)var13 * this.field6478 + (float)var11 * this.field6463 + (float)var48 * this.field6460 + this.field6469;
                  var33 = (int)((float)this.field6475.field2499 * var55 / var18) + arg2.field6854;
                  float var56 = (float)var13 * this.field6477 + (float)var10 * this.field6462 + (float)var49 * this.field6459 + this.field6474;
                  var35 = (int)((float)this.field6475.field2493 * var56 / var19) + arg2.field6853;
                  float var57 = (float)var13 * this.field6478 + (float)var10 * this.field6463 + (float)var49 * this.field6460 + this.field6469;
                  var37 = (int)((float)this.field6475.field2499 * var57 / var19) + arg2.field6854;
               } else {
                  var16 = (float)var12 * this.field6464 + (float)var10 * this.field6465 + (float)var46 * this.field6458 + this.field6461;
                  var17 = (float)var12 * this.field6464 + (float)var11 * this.field6465 + (float)var47 * this.field6458 + this.field6461;
                  var18 = (float)var13 * this.field6464 + (float)var11 * this.field6465 + (float)var48 * this.field6458 + this.field6461;
                  var19 = (float)var13 * this.field6464 + (float)var10 * this.field6465 + (float)var49 * this.field6458 + this.field6461;
                  float var58 = (float)var12 * this.field6477 + (float)var10 * this.field6462 + (float)var46 * this.field6459 + this.field6474;
                  var23 = (int)((float)this.field6475.field2493 * var58 / (float)this.field6471) + arg2.field6853;
                  float var59 = (float)var12 * this.field6478 + (float)var10 * this.field6463 + (float)var46 * this.field6460 + this.field6469;
                  var25 = (int)((float)this.field6475.field2499 * var59 / (float)this.field6471) + arg2.field6854;
                  float var60 = (float)var12 * this.field6477 + (float)var11 * this.field6462 + (float)var47 * this.field6459 + this.field6474;
                  var27 = (int)((float)this.field6475.field2493 * var60 / (float)this.field6471) + arg2.field6853;
                  float var61 = (float)var12 * this.field6478 + (float)var11 * this.field6463 + (float)var47 * this.field6460 + this.field6469;
                  var29 = (int)((float)this.field6475.field2499 * var61 / (float)this.field6471) + arg2.field6854;
                  float var62 = (float)var13 * this.field6477 + (float)var11 * this.field6462 + (float)var48 * this.field6459 + this.field6474;
                  var31 = (int)((float)this.field6475.field2493 * var62 / (float)this.field6471) + arg2.field6853;
                  float var63 = (float)var13 * this.field6478 + (float)var11 * this.field6463 + (float)var48 * this.field6460 + this.field6469;
                  var33 = (int)((float)this.field6475.field2499 * var63 / (float)this.field6471) + arg2.field6854;
                  float var64 = (float)var13 * this.field6477 + (float)var10 * this.field6462 + (float)var49 * this.field6459 + this.field6474;
                  var35 = (int)((float)this.field6475.field2493 * var64 / (float)this.field6471) + arg2.field6853;
                  float var65 = (float)var13 * this.field6478 + (float)var10 * this.field6463 + (float)var49 * this.field6460 + this.field6469;
                  var37 = (int)((float)this.field6475.field2499 * var65 / (float)this.field6471) + arg2.field6854;
               }
            }

            if (this.field6471 == -1) {
               if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                  arg2.field6856 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field6851 || var35 > arg2.field6851 || var27 > arg2.field6851;
                  if (var9.field9301 >= 0) {
                     arg2.method3507((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class77.field1028[var9.field9300 & 65535] & 16777215, -16777216 | class77.field1028[var9.field9303 & 65535] & 16777215, -16777216 | class77.field1028[var9.field9302 & 65535] & 16777215, 0, 0, 0, 0, var9.field9301);
                  } else {
                     arg2.method3518((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, (float)((int)var18), (float)((int)var19), (float)((int)var17), (float)(var9.field9300 & 65535), (float)(var9.field9303 & 65535), (float)(var9.field9302 & 65535));
                  }
               }

               if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                  arg2.field6856 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field6851 || var27 > arg2.field6851 || var35 > arg2.field6851;
                  if (var9.field9301 >= 0) {
                     arg2.method3507((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class77.field1028[var9.field9298 & 65535] & 16777215, -16777216 | class77.field1028[var9.field9302 & 65535] & 16777215, -16777216 | class77.field1028[var9.field9303 & 65535] & 16777215, 0, 0, 0, 0, var9.field9301);
                     return;
                  }

                  arg2.method3518((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, (float)((int)var16), (float)((int)var17), (float)((int)var19), (float)(var9.field9298 & 65535), (float)(var9.field9302 & 65535), (float)(var9.field9303 & 65535));
                  return;
               }
            } else {
               if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                  arg2.field6856 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field6851 || var35 > arg2.field6851 || var27 > arg2.field6851;
                  if (var9.field9301 >= 0) {
                     arg2.method3507((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class77.field1028[var9.field9300 & 65535] & 16777215, -16777216 | class77.field1028[var9.field9303 & 65535] & 16777215, -16777216 | class77.field1028[var9.field9302 & 65535] & 16777215, 0, 0, 0, 0, var9.field9301);
                  } else {
                     arg2.method3518((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, (float)((int)var18), (float)((int)var19), (float)((int)var17), (float)(var9.field9300 & 65535), (float)(var9.field9303 & 65535), (float)(var9.field9302 & 65535));
                  }
               }

               if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                  arg2.field6856 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field6851 || var27 > arg2.field6851 || var35 > arg2.field6851;
                  if (var9.field9301 >= 0) {
                     arg2.method3507((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class77.field1028[var9.field9298 & 65535] & 16777215, -16777216 | class77.field1028[var9.field9302 & 65535] & 16777215, -16777216 | class77.field1028[var9.field9303 & 65535] & 16777215, 0, 0, 0, 0, var9.field9301);
                     return;
                  }

                  arg2.method3518((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, (float)((int)var16), (float)((int)var17), (float)((int)var19), (float)(var9.field9298 & 65535), (float)(var9.field9302 & 65535), (float)(var9.field9303 & 65535));
               }
            }

         }
      } else {
         class685 var66 = this.field6470[arg0][arg1];
         if (var66 != null) {
            if (arg7 != 0) {
               if ((var66.field10186 & 4) != 0) {
                  if ((arg7 & 1) != 0) {
                     return;
                  }
               } else if ((arg7 & 2) != 0) {
                  return;
               }
            }

            if (this.field6471 == -1) {
               for(int var67 = 0; var67 < var66.field10184; ++var67) {
                  int var68 = (arg0 << super.field4375) + var66.field10185[var67];
                  short var69 = var66.field10187[var67];
                  int var70 = (arg1 << super.field4375) + var66.field10196[var67];
                  float var71 = (float)var70 * this.field6464 + (float)var68 * this.field6465 + (float)var69 * this.field6458 + this.field6461;
                  if (var71 <= (float)this.field6475.field2488) {
                     return;
                  }

                  float var72 = (float)var70 * this.field6477 + (float)var68 * this.field6462 + (float)var69 * this.field6459 + this.field6474;
                  float var73 = (float)var70 * this.field6478 + (float)var68 * this.field6463 + (float)var69 * this.field6460 + this.field6469;
                  arg3[var67] = (int)((float)this.field6475.field2493 * var72 / var71) + arg2.field6853;
                  arg4[var67] = (int)((float)this.field6475.field2499 * var73 / var71) + arg2.field6854;
                  arg5[var67] = (int)var71;
               }
            } else {
               for(int var74 = 0; var74 < var66.field10184; ++var74) {
                  int var110 = (arg0 << super.field4375) + var66.field10185[var74];
                  short var111 = var66.field10187[var74];
                  int var112 = (arg1 << super.field4375) + var66.field10196[var74];
                  float var113 = (float)var112 * this.field6464 + (float)var110 * this.field6465 + (float)var111 * this.field6458 + this.field6461;
                  float var114 = (float)var112 * this.field6477 + (float)var110 * this.field6462 + (float)var111 * this.field6459 + this.field6474;
                  float var115 = (float)var112 * this.field6478 + (float)var110 * this.field6463 + (float)var111 * this.field6460 + this.field6469;
                  arg3[var74] = (int)((float)this.field6475.field2493 * var114 / (float)this.field6471) + arg2.field6853;
                  arg4[var74] = (int)((float)this.field6475.field2499 * var115 / (float)this.field6471) + arg2.field6854;
                  arg5[var74] = (int)var113;
               }
            }

            if (var66.field10192 != null) {
               if (this.field6471 == -1) {
                  for(int var75 = 0; var75 < var66.field10191; ++var75) {
                     short var76 = var66.field10190[var75];
                     short var77 = var66.field10183[var75];
                     short var78 = var66.field10194[var75];
                     int var79 = arg3[var76];
                     int var80 = arg3[var77];
                     int var81 = arg3[var78];
                     int var82 = arg4[var76];
                     int var83 = arg4[var77];
                     int var84 = arg4[var78];
                     if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                        arg2.field6856 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field6851 || var80 > arg2.field6851 || var81 > arg2.field6851;
                        short var85 = var66.field10192[var75];
                        if (var85 != -1) {
                           arg2.method3507((float)var82, (float)var83, (float)var84, (float)var79, (float)var80, (float)var81, (float)arg5[var76], (float)arg5[var77], (float)arg5[var78], (float)var66.field10185[var76] / (float)super.field4377, (float)var66.field10185[var77] / (float)super.field4377, (float)var66.field10185[var78] / (float)super.field4377, (float)var66.field10196[var76] / (float)super.field4377, (float)var66.field10196[var77] / (float)super.field4377, (float)var66.field10196[var78] / (float)super.field4377, -16777216 | class77.field1028[var66.field10189[var76] & 65535] & 16777215, -16777216 | class77.field1028[var66.field10189[var77] & 65535] & 16777215, -16777216 | class77.field1028[var66.field10189[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                        } else {
                           int var86 = var66.field10193[var75];
                           if (var86 != -1) {
                              arg2.method3518((float)var82, (float)var83, (float)var84, (float)var79, (float)var80, (float)var81, (float)arg5[var76], (float)arg5[var77], (float)arg5[var78], (float)class696.method5113(var86, var66.field10189[var76], 110), (float)class696.method5113(var86, var66.field10189[var77], 124), (float)class696.method5113(var86, var66.field10189[var78], 125));
                           }
                        }
                     }
                  }

                  return;
               }

               for(int var87 = 0; var87 < var66.field10191; ++var87) {
                  short var88 = var66.field10190[var87];
                  short var89 = var66.field10183[var87];
                  short var90 = var66.field10194[var87];
                  int var91 = arg3[var88];
                  int var92 = arg3[var89];
                  int var93 = arg3[var90];
                  int var94 = arg4[var88];
                  int var95 = arg4[var89];
                  int var96 = arg4[var90];
                  if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                     arg2.field6856 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field6851 || var92 > arg2.field6851 || var93 > arg2.field6851;
                     short var97 = var66.field10192[var87];
                     if (var97 != -1) {
                        arg2.method3507((float)var94, (float)var95, (float)var96, (float)var91, (float)var92, (float)var93, (float)arg5[var88], (float)arg5[var89], (float)arg5[var90], (float)var66.field10185[var88] / (float)super.field4377, (float)var66.field10185[var89] / (float)super.field4377, (float)var66.field10185[var90] / (float)super.field4377, (float)var66.field10196[var88] / (float)super.field4377, (float)var66.field10196[var89] / (float)super.field4377, (float)var66.field10196[var90] / (float)super.field4377, -16777216 | class77.field1028[var66.field10189[var88] & 65535] & 16777215, -16777216 | class77.field1028[var66.field10189[var89] & 65535] & 16777215, -16777216 | class77.field1028[var66.field10189[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                     } else {
                        int var98 = var66.field10193[var87];
                        if (var98 != -1) {
                           arg2.method3518((float)var94, (float)var95, (float)var96, (float)var91, (float)var92, (float)var93, (float)arg5[var88], (float)arg5[var89], (float)arg5[var90], (float)class696.method5113(var98, var66.field10189[var88], 124), (float)class696.method5113(var98, var66.field10189[var89], 110), (float)class696.method5113(var98, var66.field10189[var90], 117));
                        }
                     }
                  }
               }

               return;
            }

            for(int var99 = 0; var99 < var66.field10191; ++var99) {
               short var100 = var66.field10190[var99];
               short var101 = var66.field10183[var99];
               short var102 = var66.field10194[var99];
               int var103 = arg3[var100];
               int var104 = arg3[var101];
               int var105 = arg3[var102];
               int var106 = arg4[var100];
               int var107 = arg4[var101];
               int var108 = arg4[var102];
               if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                  int var109 = var66.field10193[var99];
                  if (var109 != -1) {
                     arg2.field6856 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field6851 || var104 > arg2.field6851 || var105 > arg2.field6851;
                     arg2.method3518((float)var106, (float)var107, (float)var108, (float)var103, (float)var104, (float)var105, (float)arg5[var100], (float)arg5[var101], (float)arg5[var102], (float)class696.method5113(var109, var66.field10189[var100], 122), (float)class696.method5113(var109, var66.field10189[var101], 115), (float)class696.method5113(var109, var66.field10189[var102], 116));
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "b",
      descriptor = "(IIZLnr;Lke;[I[I[I[II)V",
      line = 2097
   )
   private final void method3335(int arg0, int arg1, boolean arg2, class182 arg3, class448 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
      class39 var11 = this.field6472[arg0][arg1];
      if (arg9 == 0 || (arg9 & 2) == 0) {
         if (var11 != null) {
            if (this.field6471 == -1) {
               for(int var12 = 0; var12 < var11.field475; ++var12) {
                  int var13 = (arg0 << super.field4375) + var11.field471[var12];
                  int var14 = var11.field478[var12];
                  int var15 = (arg1 << super.field4375) + var11.field469[var12];
                  float var16 = (float)var15 * this.field6464 + (float)var13 * this.field6465 + (float)var14 * this.field6458 + this.field6461;
                  if (var16 <= (float)this.field6475.field2488) {
                     return;
                  }

                  arg8[var12] = 0;
                  if (arg2) {
                     int var17 = (int)(var16 - (float)arg3.field2831);
                     if (var17 > 255) {
                        var17 = 255;
                     }

                     if (var17 > 0) {
                        arg8[var12] = var17;
                        int var18 = var11.field470[var12] * var17 / 255;
                        if (var18 > 0) {
                           var14 -= var18;
                        }
                     }
                  } else if (arg3.field2824) {
                     int var19 = (int)(var16 - (float)arg3.field2831);
                     if (var19 > 0) {
                        arg8[var12] = var19;
                        if (arg8[var12] > 255) {
                           arg8[var12] = 255;
                        }
                     }
                  }

                  float var20 = (float)var15 * this.field6477 + (float)var13 * this.field6462 + (float)var14 * this.field6459 + this.field6474;
                  float var21 = (float)var15 * this.field6478 + (float)var13 * this.field6463 + (float)var14 * this.field6460 + this.field6469;
                  arg5[var12] = (int)((float)this.field6475.field2493 * var20 / var16) + arg4.field6853;
                  arg6[var12] = (int)((float)this.field6475.field2499 * var21 / var16) + arg4.field6854;
                  arg7[var12] = (int)var16;
               }
            } else {
               for(int var22 = 0; var22 < var11.field475; ++var22) {
                  int var36 = (arg0 << super.field4375) + var11.field471[var22];
                  int var37 = var11.field478[var22];
                  int var38 = (arg1 << super.field4375) + var11.field469[var22];
                  float var39 = (float)var38 * this.field6464 + (float)var36 * this.field6465 + (float)var37 * this.field6458 + this.field6461;
                  arg8[var22] = 0;
                  if (arg2) {
                     int var40 = this.field6471 - arg3.field2831;
                     if (var40 > 255) {
                        var40 = 255;
                     }

                     if (var40 > 0) {
                        arg8[var22] = var40;
                        int var41 = var11.field470[var22] * var40 / 255;
                        if (var41 > 0) {
                           var37 -= var41;
                        }
                     }
                  } else if (arg3.field2824) {
                     int var42 = this.field6471 - arg3.field2831;
                     if (var42 > 0) {
                        arg8[var22] = var42;
                        if (arg8[var22] > 255) {
                           arg8[var22] = 255;
                        }
                     }
                  }

                  float var43 = (float)var38 * this.field6477 + (float)var36 * this.field6462 + (float)var37 * this.field6459 + this.field6474;
                  float var44 = (float)var38 * this.field6478 + (float)var36 * this.field6463 + (float)var37 * this.field6460 + this.field6469;
                  arg5[var22] = (int)((float)this.field6475.field2493 * var43 / (float)this.field6471) + arg4.field6853;
                  arg6[var22] = (int)((float)this.field6475.field2499 * var44 / (float)this.field6471) + arg4.field6854;
                  arg7[var22] = (int)var39;
               }
            }

            float var23 = (float)super.field4377;

            for(int var24 = 0; var24 < var11.field474; ++var24) {
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
                  arg4.field6856 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field6851 || var29 > arg4.field6851 || var30 > arg4.field6851;
                  if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                     int var34 = arg0 << super.field4375;
                     int var35 = arg1 << super.field4375;
                     if ((var11.field477[var25] & 16777215) != 0) {
                        if (var11.field473[var25] == var11.field473[var26] && var11.field473[var25] == var11.field473[var27] && var11.field476[var25] == var11.field476[var26] && var11.field476[var25] == var11.field476[var27]) {
                           arg4.method3507((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], (float)(var11.field471[var25] + var34) / (float)var11.field476[var25], (float)(var11.field471[var26] + var34) / (float)var11.field476[var26], (float)(var11.field471[var27] + var34) / (float)var11.field476[var27], (float)(var11.field469[var25] + var35) / (float)var11.field476[var25], (float)(var11.field469[var26] + var35) / (float)var11.field476[var26], (float)(var11.field469[var27] + var35) / (float)var11.field476[var27], var11.field477[var25], var11.field477[var26], var11.field477[var27], arg3.field2823, arg8[var25], arg8[var26], arg8[var27], var11.field473[var25]);
                        } else {
                           arg4.method3521((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], (float)(var11.field471[var25] + var34) / var23, (float)(var11.field471[var26] + var34) / var23, (float)(var11.field471[var27] + var34) / var23, (float)(var11.field469[var25] + var35) / var23, (float)(var11.field469[var26] + var35) / var23, (float)(var11.field469[var27] + var35) / var23, var11.field477[var25], var11.field477[var26], var11.field477[var27], arg3.field2823, arg8[var25], arg8[var26], arg8[var27], var11.field473[var25], var23 / (float)var11.field476[var25], var11.field473[var26], var23 / (float)var11.field476[var26], var11.field473[var27], var23 / (float)var11.field476[var27]);
                        }
                     }
                  } else {
                     arg4.method3514((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], arg3.field2823);
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "b",
      descriptor = "(IIIIIII[[ZLnr;Lke;[I[I)V",
      line = 2288
   )
   private final void method3336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class182 arg8, class448 arg9, int[] arg10, int[] arg11) {
      int var13 = (arg6 - arg4) * arg2 / 256;
      int var14 = arg2 >> 8;
      boolean var15 = arg8.field2820;
      this.field6475.method581(false);
      arg9.field6860 = false;
      arg9.field6852 = false;
      int var16 = arg0;
      int var17 = arg1 + var13;

      for(int var18 = arg3; var18 < arg5; ++var18) {
         for(int var19 = arg4; var19 < arg6; ++var19) {
            if (arg7[var18 - arg3][var19 - arg4]) {
               if (this.field6473 != null) {
                  if (this.field6473[var18][var19] != null) {
                     class521 var20 = this.field6473[var18][var19];
                     if (var20.field7922 != -1 && (var20.field7921 & 2) == 0 && var20.field7919 == 0) {
                        int var21 = this.field6475.method1519(var20.field7922);
                        arg9.method3518((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)class696.method5113(var21, var20.field7918, 118), (float)class696.method5113(var21, var20.field7914, 114), (float)class696.method5113(var21, var20.field7920, 112));
                        arg9.method3518((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)class696.method5113(var21, var20.field7913, 118), (float)class696.method5113(var21, var20.field7920, 123), (float)class696.method5113(var21, var20.field7914, 122));
                     } else if (var20.field7919 == 0) {
                        arg9.method3512((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, var20.field7918, var20.field7914, var20.field7920);
                        arg9.method3512((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, var20.field7913, var20.field7920, var20.field7914);
                     } else {
                        int var22 = var20.field7919;
                        arg9.method3512((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, class573.method4311(var22, 1313937672, var20.field7918 & -16777216), class573.method4311(var22, 1313937672, var20.field7914 & -16777216), class573.method4311(var22, 1313937672, var20.field7920 & -16777216));
                        arg9.method3512((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, class573.method4311(var22, 1313937672, var20.field7913 & -16777216), class573.method4311(var22, 1313937672, var20.field7920 & -16777216), class573.method4311(var22, 1313937672, var20.field7914 & -16777216));
                     }
                  } else if (this.field6466[var18][var19] != null) {
                     class380 var23 = this.field6466[var18][var19];

                     for(int var24 = 0; var24 < var23.field6010; ++var24) {
                        arg10[var24] = var23.field6017[var24] * var14 / super.field4377 + var16;
                        arg11[var24] = var17 - var23.field6009[var24] * var14 / super.field4377;
                     }

                     for(int var25 = 0; var25 < var23.field6015; ++var25) {
                        int var26 = var25 * 3;
                        int var27 = var26 + 1;
                        int var28 = var27 + 1;
                        int var29 = arg10[var26];
                        int var30 = arg10[var27];
                        int var31 = arg10[var28];
                        int var32 = arg11[var26];
                        int var33 = arg11[var27];
                        int var34 = arg11[var28];
                        if (var23.field6013 != null && var23.field6013[var25] != 0 && (var23.field6016 == null || var23.field6016 != null && var23.field6016[var25] == -1)) {
                           int var35 = var23.field6013[var25];
                           arg9.method3512((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, class573.method4311(var35, 1313937672, -16777216 - (var23.field6014[var26] & -16777216)), class573.method4311(var35, 1313937672, -16777216 - (var23.field6014[var27] & -16777216)), class573.method4311(var35, 1313937672, -16777216 - (var23.field6014[var28] & -16777216)));
                        } else if (var23.field6016 != null && var23.field6016[var25] != -1) {
                           int var36 = this.field6475.method1519(var23.field6016[var25]);
                           arg9.method3518((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)var36, (float)var36, (float)var36);
                        } else {
                           arg9.method3512((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, var23.field6014[var26], var23.field6014[var27], var23.field6014[var28]);
                        }
                     }
                  }
               } else if (this.field6472[var18][var19] != null) {
                  class39 var37 = this.field6472[var18][var19];

                  for(int var38 = 0; var38 < var37.field475; ++var38) {
                     arg10[var38] = var37.field471[var38] * var14 / super.field4377 + var16;
                     arg11[var38] = var17 - var37.field469[var38] * var14 / super.field4377;
                  }

                  for(int var39 = 0; var39 < var37.field474; ++var39) {
                     int var40 = var39 * 3;
                     int var41 = var40 + 1;
                     int var42 = var41 + 1;
                     int var43 = arg10[var40];
                     int var44 = arg10[var41];
                     int var45 = arg10[var42];
                     int var46 = arg11[var40];
                     int var47 = arg11[var41];
                     int var48 = arg11[var42];
                     if (var37.field468 != null && var37.field468[var39] != 0) {
                        int var49 = var37.field468[var39];
                        arg9.method3512((float)var46, (float)var47, (float)var48, (float)var43, (float)var44, (float)var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                     } else {
                        arg9.method3512((float)var46, (float)var47, (float)var48, (float)var43, (float)var44, (float)var45, 100.0F, 100.0F, 100.0F, var37.field477[var40], var37.field477[var41], var37.field477[var42]);
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = arg1 + var13;
         var16 += var14;
      }

      arg9.field6860 = true;
      this.field6475.method581(var15);
   }

   @OriginalMember(
      owner = "client!tp",
      name = "ka",
      descriptor = "(III)V",
      line = 2486
   )
   public final void method1126(int arg0, int arg1, int arg2) {
      if (this.field6468[arg0][arg1] < arg2) {
         this.field6468[arg0][arg1] = (byte)arg2;
      }

   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z",
      line = 2492
   )
   public final boolean method1117(class273 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return false;
   }

   @OriginalMember(
      owner = "client!tp",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V",
      line = 2496
   )
   public final void method1127(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
      boolean var15 = (this.field6467 & 32) == 0;
      if (this.field6473 == null && !var15) {
         this.field6473 = new class521[super.field4383][super.field4379];
         this.field6466 = new class380[super.field4383][super.field4379];
      } else if (this.field6472 == null && var15) {
         this.field6472 = new class39[super.field4383][super.field4379];
      } else if (this.field6479 != null) {
         throw new IllegalStateException();
      }

      if (arg2 != null && arg2.length != 0) {
         for(int var16 = 0; var16 < arg6.length; ++var16) {
            if (arg6[var16] == -1) {
               arg6[var16] = 0;
            } else {
               arg6[var16] = class77.field1028[class221.method1909((byte)-119, arg6[var16]) & 65535] << 8 | 255;
            }
         }

         if (arg7 != null) {
            for(int var17 = 0; var17 < arg7.length; ++var17) {
               if (arg7[var17] == -1) {
                  arg7[var17] = 0;
               } else {
                  arg7[var17] = class77.field1028[class221.method1909((byte)-89, arg7[var17]) & 65535] << 8 | 255;
               }
            }
         }

         if (var15) {
            class39 var18 = new class39();
            var18.field475 = (short)arg2.length;
            var18.field474 = (short)(arg2.length / 3);
            var18.field471 = new short[var18.field475];
            var18.field478 = new short[var18.field475];
            var18.field469 = new short[var18.field475];
            var18.field477 = new int[var18.field475];
            var18.field473 = new short[var18.field475];
            var18.field476 = new short[var18.field475];
            var18.field472 = new byte[var18.field475];
            if (arg5 != null) {
               var18.field470 = new short[var18.field475];
            }

            for(int var19 = 0; var19 < var18.field475; ++var19) {
               int var22 = arg2[var19];
               int var23 = arg4[var19];
               boolean var24 = false;
               int var25;
               if (var22 == 0 && var23 == 0) {
                  var25 = this.field6476[arg0][arg1] - this.field6468[arg0][arg1];
               } else if (var22 == 0 && super.field4377 == var23) {
                  var25 = this.field6476[arg0][arg1 + 1] - this.field6468[arg0][arg1 + 1];
               } else if (super.field4377 == var22 && super.field4377 == var23) {
                  var25 = this.field6476[arg0 + 1][arg1 + 1] - this.field6468[arg0 + 1][arg1 + 1];
               } else if (super.field4377 == var22 && var23 == 0) {
                  var25 = this.field6476[arg0 + 1][arg1] - this.field6468[arg0 + 1][arg1];
               } else {
                  int var26 = (this.field6476[arg0 + 1][arg1] - this.field6468[arg0 + 1][arg1]) * var22 + (this.field6476[arg0][arg1] - this.field6468[arg0][arg1]) * (super.field4377 - var22);
                  int var27 = (this.field6476[arg0 + 1][arg1 + 1] - this.field6468[arg0 + 1][arg1 + 1]) * var22 + (this.field6476[arg0][arg1 + 1] - this.field6468[arg0][arg1 + 1]) * (super.field4377 - var22);
                  var25 = (super.field4377 - var23) * var26 + var23 * var27 >> super.field4375 * 2;
               }

               int var28 = (arg0 << super.field4375) + var22;
               int var29 = (arg1 << super.field4375) + var23;
               var18.field471[var19] = (short)var22;
               var18.field469[var19] = (short)var23;
               var18.field478[var19] = (short)(this.method2312(var28, var29, 95) + (arg3 != null ? arg3[var19] : 0));
               if (var25 < 0) {
                  var25 = 0;
               }

               if (arg6[var19] == 0) {
                  var18.field477[var19] = 0;
                  if (arg7 != null) {
                     var18.field472[var19] = (byte)var25;
                  }
               } else {
                  int var30 = 0;
                  if (arg5 != null) {
                     short var31 = var18.field470[var19] = (short)arg5[var19];
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
                  if (arg8[var19] != -1 && this.method3333(this.field6475.field8891.method1373(arg8[var19], (byte)-54).field6924)) {
                     var32 = -1694498816;
                  }

                  var18.field477[var19] = var32 | class52.method351(var30, method3330(arg6[var19] >> 8, var25), arg10, 125);
                  if (arg7 != null) {
                     var18.field472[var19] = (byte)var25;
                  }
               }

               var18.field473[var19] = (short)arg8[var19];
               var18.field476[var19] = (short)arg9[var19];
            }

            if (arg7 != null) {
               var18.field468 = new int[var18.field474];
            }

            for(int var20 = 0; var20 < var18.field474; ++var20) {
               int var21 = var20 * 3;
               if (arg7 != null && arg7[var21] != 0) {
                  var18.field468[var20] = -16777216 | arg7[var21] >> 8;
               }
            }

            this.field6472[arg0][arg1] = var18;
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
                  } else if (arg2[var38] == super.field4377 && arg4[var38] == 0) {
                     if (var35 != -1 && arg6[var35] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var35 = var38;
                  } else if (arg2[var38] == super.field4377 && arg4[var38] == super.field4377) {
                     if (var36 != -1 && arg6[var36] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var36 = var38;
                  } else if (arg2[var38] == 0 && arg4[var38] == super.field4377) {
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
                        if (arg2[var40] != arg2[0] && arg2[0] + super.field4377 != arg2[var40] && arg2[0] - super.field4377 != arg2[var40]) {
                           var33 = false;
                           break;
                        }

                        if (arg4[var40] != arg4[0] && arg4[0] + super.field4377 != arg4[var40] && arg4[0] - super.field4377 != arg4[var40]) {
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
               class521 var41 = new class521();
               int var42 = arg6[0];
               int var43 = arg8[0];
               if (arg7 != null) {
                  var41.field7919 = arg7[0] >> 8;
                  if (var42 == 0) {
                     var41.field7921 = (byte)(var41.field7921 | 2);
                  }
               } else if (var42 == 0) {
                  return;
               }

               if (super.field4373[arg0 + 1][arg1] == super.field4373[arg0][arg1] && super.field4373[arg0 + 1][arg1 + 1] == super.field4373[arg0][arg1] && super.field4373[arg0][arg1 + 1] == super.field4373[arg0][arg1]) {
                  var41.field7921 = (byte)(var41.field7921 | 1);
               }

               if (var43 != -1 && (var41.field7921 & 2) == 0 && !this.field6475.field8891.method1373(var43, (byte)-54).field6934) {
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

                  var41.field7913 = class52.method351(var44, method3330(arg6[var34] >> 8, this.field6476[arg0][arg1] - this.field6468[arg0][arg1]), arg10, 94);
                  if (var41.field7919 != 0) {
                     var41.field7913 |= 255 - (this.field6476[arg0][arg1] - this.field6468[arg0][arg1]) << 25;
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

                  var41.field7920 = class52.method351(var45, method3330(arg6[var35] >> 8, this.field6476[arg0 + 1][arg1] - this.field6468[arg0 + 1][arg1]), arg10, -66);
                  if (var41.field7919 != 0) {
                     var41.field7920 |= 255 - (this.field6476[arg0 + 1][arg1] - this.field6468[arg0 + 1][arg1]) << 25;
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

                  var41.field7918 = class52.method351(var46, method3330(arg6[var36] >> 8, this.field6476[arg0 + 1][arg1 + 1] - this.field6468[arg0 + 1][arg1 + 1]), arg10, -88);
                  if (var41.field7919 != 0) {
                     var41.field7918 |= 255 - (this.field6476[arg0 + 1][arg1 + 1] - this.field6468[arg0 + 1][arg1 + 1]) << 25;
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

                  var41.field7914 = class52.method351(var47, method3330(arg6[var37] >> 8, this.field6476[arg0][arg1 + 1] - this.field6468[arg0][arg1 + 1]), arg10, -125);
                  var41.field7922 = (short)var43;
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

                  var41.field7913 = class52.method351(var48, method3330(arg6[var34] >> 8, this.field6476[arg0][arg1] - this.field6468[arg0][arg1]), arg10, -108);
                  if (var41.field7919 != 0) {
                     var41.field7913 |= 255 - (this.field6476[arg0][arg1] - this.field6468[arg0][arg1]) << 25;
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

                  var41.field7920 = class52.method351(var49, method3330(arg6[var35] >> 8, this.field6476[arg0 + 1][arg1] - this.field6468[arg0 + 1][arg1]), arg10, -101);
                  if (var41.field7919 != 0) {
                     var41.field7920 |= 255 - (this.field6476[arg0 + 1][arg1] - this.field6468[arg0 + 1][arg1]) << 25;
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

                  var41.field7918 = class52.method351(var50, method3330(arg6[var36] >> 8, this.field6476[arg0 + 1][arg1 + 1] - this.field6468[arg0 + 1][arg1 + 1]), arg10, 79);
                  if (var41.field7919 != 0) {
                     var41.field7918 |= 255 - (this.field6476[arg0 + 1][arg1 + 1] - this.field6468[arg0 + 1][arg1 + 1]) << 25;
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

                  var41.field7914 = class52.method351(var51, method3330(arg6[var37] >> 8, this.field6476[arg0][arg1 + 1] - this.field6468[arg0][arg1 + 1]), arg10, 64);
                  if (var41.field7919 != 0) {
                     var41.field7914 |= 255 - (this.field6476[arg0][arg1 + 1] - this.field6468[arg0][arg1 + 1]) << 25;
                  }

                  var41.field7922 = -1;
               }

               if (arg5 != null) {
                  var41.field7916 = (short)arg5[var36];
                  var41.field7923 = (short)arg5[var37];
                  var41.field7915 = (short)arg5[var35];
                  var41.field7917 = (short)arg5[var34];
               }

               this.field6473[arg0][arg1] = var41;
            } else {
               class380 var52 = new class380();
               var52.field6010 = (short)arg2.length;
               var52.field6015 = (short)(arg2.length / 3);
               var52.field6017 = new short[var52.field6010];
               var52.field6018 = new short[var52.field6010];
               var52.field6009 = new short[var52.field6010];
               var52.field6014 = new int[var52.field6010];
               if (arg5 != null) {
                  var52.field6019 = new short[var52.field6010];
               }

               for(int var53 = 0; var53 < var52.field6010; ++var53) {
                  int var68 = arg2[var53];
                  int var69 = arg4[var53];
                  boolean var70 = false;
                  int var71;
                  if (var68 == 0 && var69 == 0) {
                     var71 = this.field6476[arg0][arg1] - this.field6468[arg0][arg1];
                  } else if (var68 == 0 && super.field4377 == var69) {
                     var71 = this.field6476[arg0][arg1 + 1] - this.field6468[arg0][arg1 + 1];
                  } else if (super.field4377 == var68 && super.field4377 == var69) {
                     var71 = this.field6476[arg0 + 1][arg1 + 1] - this.field6468[arg0 + 1][arg1 + 1];
                  } else if (super.field4377 == var68 && var69 == 0) {
                     var71 = this.field6476[arg0 + 1][arg1] - this.field6468[arg0 + 1][arg1];
                  } else {
                     int var72 = (this.field6476[arg0 + 1][arg1] - this.field6468[arg0 + 1][arg1]) * var68 + (this.field6476[arg0][arg1] - this.field6468[arg0][arg1]) * (super.field4377 - var68);
                     int var73 = (this.field6476[arg0 + 1][arg1 + 1] - this.field6468[arg0 + 1][arg1 + 1]) * var68 + (this.field6476[arg0][arg1 + 1] - this.field6468[arg0][arg1 + 1]) * (super.field4377 - var68);
                     var71 = (super.field4377 - var69) * var72 + var69 * var73 >> super.field4375 * 2;
                  }

                  int var74 = (arg0 << super.field4375) + var68;
                  int var75 = (arg1 << super.field4375) + var69;
                  var52.field6017[var53] = (short)var68;
                  var52.field6009[var53] = (short)var69;
                  var52.field6018[var53] = (short)(this.method2312(var74, var75, -52) + (arg3 != null ? arg3[var53] : 0));
                  if (var71 < 0) {
                     var71 = 0;
                  }

                  if (arg6[var53] == 0) {
                     if (arg7 != null) {
                        var52.field6014[var53] = var71 << 25;
                     } else {
                        var52.field6014[var53] = 0;
                     }
                  } else {
                     int var76 = 0;
                     if (arg5 != null) {
                        short var77 = var52.field6019[var53] = (short)arg5[var53];
                        if (arg11 != 0) {
                           var76 = var77 * 255 / arg11;
                           if (var76 < 0) {
                              var76 = 0;
                           } else if (var76 > 255) {
                              var76 = 255;
                           }
                        }
                     }

                     var52.field6014[var53] = class52.method351(var76, method3330(arg6[var53] >> 8, var71), arg10, 127);
                     if (arg7 != null) {
                        var52.field6014[var53] |= var71 << 25;
                     }
                  }
               }

               boolean var54 = false;

               for(int var55 = 0; var55 < var52.field6015; ++var55) {
                  if (arg8[var55 * 3] != -1 && !this.field6475.field8891.method1373(arg8[var55 * 3], (byte)-54).field6934) {
                     var54 = true;
                  }
               }

               if (arg7 != null) {
                  var52.field6013 = new int[var52.field6015];
               }

               if (var54) {
                  var52.field6016 = new short[var52.field6015];
                  var52.field6011 = new short[var52.field6015];
               }

               for(int var56 = 0; var56 < var52.field6015; ++var56) {
                  int var57 = var56 * 3;
                  if (arg7 != null && arg7[var57] != 0) {
                     var52.field6013[var56] = arg7[var57] >> 8;
                  }

                  if (var54) {
                     int var58 = var57 + 1;
                     int var59 = var58 + 1;
                     boolean var60 = false;
                     boolean var61 = true;
                     int var62 = arg8[var57];
                     if (var62 != -1 && !this.field6475.field8891.method1373(var62, (byte)-54).field6934) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     int var63 = arg8[var58];
                     if (var63 != -1 && !this.field6475.field8891.method1373(var63, (byte)-54).field6934) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     int var64 = arg8[var59];
                     if (var64 != -1 && !this.field6475.field8891.method1373(var64, (byte)-54).field6934) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     if (var61) {
                        var52.field6016[var56] = (short)var64;
                        var52.field6011[var56] = (short)arg9[var57];
                     } else {
                        if (var60) {
                           int var65 = arg8[var57];
                           if (var65 != -1 && !this.field6475.field8891.method1373(var65, (byte)-54).field6934) {
                              var52.field6014[var57] = class77.field1028[class221.method1909((byte)-125, this.field6475.field8891.method1373(var65, (byte)-54).field6922 & 65535) & 65535];
                           }

                           int var66 = arg8[var58];
                           if (var66 != -1 && !this.field6475.field8891.method1373(var66, (byte)-54).field6934) {
                              var52.field6014[var58] = class77.field1028[class221.method1909((byte)-86, this.field6475.field8891.method1373(var66, (byte)-54).field6922 & 65535) & 65535];
                           }

                           int var67 = arg8[var59];
                           if (var67 != -1 && !this.field6475.field8891.method1373(var67, (byte)-54).field6934) {
                              var52.field6014[var59] = class77.field1028[class221.method1909((byte)-62, this.field6475.field8891.method1373(var67, (byte)-54).field6922 & 65535) & 65535];
                           }
                        }

                        var52.field6016[var56] = -1;
                     }
                  }
               }

               this.field6466[arg0][arg1] = var52;
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "YA",
      descriptor = "()V",
      line = 3198
   )
   public final void method1125() {
      this.field6476 = null;
      this.field6468 = null;
   }

   @OriginalMember(
      owner = "client!tp",
      name = "fa",
      descriptor = "(IILr;)Lr;",
      line = 3202
   )
   public final class273 method1128(int arg0, int arg1, class273 arg2) {
      return null;
   }
}
