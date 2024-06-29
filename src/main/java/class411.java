import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class411 extends class295 {
   @OriginalMember(
      owner = "client!ml",
      name = "H",
      descriptor = "I"
   )
   private int field5938 = -1;
   @OriginalMember(
      owner = "client!ml",
      name = "r",
      descriptor = "Lsfa;"
   )
   private class726 field5942;
   @OriginalMember(
      owner = "client!ml",
      name = "m",
      descriptor = "I"
   )
   private int field5928;
   @OriginalMember(
      owner = "client!ml",
      name = "u",
      descriptor = "[[B"
   )
   private byte[][] field5935;
   @OriginalMember(
      owner = "client!ml",
      name = "C",
      descriptor = "[[B"
   )
   private byte[][] field5945;
   @OriginalMember(
      owner = "client!ml",
      name = "F",
      descriptor = "F"
   )
   private float field5924;
   @OriginalMember(
      owner = "client!ml",
      name = "x",
      descriptor = "F"
   )
   private float field5925;
   @OriginalMember(
      owner = "client!ml",
      name = "o",
      descriptor = "F"
   )
   private float field5927;
   @OriginalMember(
      owner = "client!ml",
      name = "y",
      descriptor = "F"
   )
   private float field5929;
   @OriginalMember(
      owner = "client!ml",
      name = "n",
      descriptor = "F"
   )
   private float field5931;
   @OriginalMember(
      owner = "client!ml",
      name = "A",
      descriptor = "F"
   )
   private float field5932;
   @OriginalMember(
      owner = "client!ml",
      name = "s",
      descriptor = "F"
   )
   private float field5933;
   @OriginalMember(
      owner = "client!ml",
      name = "v",
      descriptor = "F"
   )
   private float field5934;
   @OriginalMember(
      owner = "client!ml",
      name = "D",
      descriptor = "F"
   )
   private float field5936;
   @OriginalMember(
      owner = "client!ml",
      name = "t",
      descriptor = "F"
   )
   private float field5937;
   @OriginalMember(
      owner = "client!ml",
      name = "p",
      descriptor = "F"
   )
   private float field5940;
   @OriginalMember(
      owner = "client!ml",
      name = "I",
      descriptor = "F"
   )
   private float field5944;
   @OriginalMember(
      owner = "client!ml",
      name = "q",
      descriptor = "[[Lvl;"
   )
   private class15[][] field5943;
   @OriginalMember(
      owner = "client!ml",
      name = "E",
      descriptor = "[[Lcu;"
   )
   private class232[][] field5926;
   @OriginalMember(
      owner = "client!ml",
      name = "G",
      descriptor = "[[Lcd;"
   )
   private class334[][] field5930;
   @OriginalMember(
      owner = "client!ml",
      name = "w",
      descriptor = "[[Lqe;"
   )
   private class496[][] field5939;
   @OriginalMember(
      owner = "client!ml",
      name = "z",
      descriptor = "[[Lie;"
   )
   private class6[][] field5941;

   @OriginalMember(
      owner = "client!ml",
      name = "fa",
      descriptor = "(IILr;)Lr;",
      line = 4
   )
   public final class196 method1621(int arg0, int arg1, class196 arg2) {
      return null;
   }

   @OriginalMember(
      owner = "client!ml",
      name = "b",
      descriptor = "(III)V",
      line = 12
   )
   private final void method3082(int arg0, int arg1, int arg2) {
      class79 var4 = this.field5942.method5290(Thread.currentThread());
      var4.field994.field8090 = 0;
      if (this.field5926 != null) {
         this.method3084(arg0, arg1, var4.field976, var4, var4.field994, var4.field1010, var4.field1013, var4.field1015, var4.field989, arg2);
      } else if (this.field5930 != null) {
         this.method3088(arg0, arg1, var4.field994, var4.field1010, var4.field1013, var4.field1015, var4.field989, arg2);
      } else {
         if (this.field5943 != null) {
            this.method3087(arg0, arg1, var4.field976, var4, var4.field994, var4.field1010, var4.field1013, var4.field1015, var4.field989, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "<init>",
      descriptor = "(Lsfa;IIII[[I[[II)V",
      line = 27
   )
   public class411(class726 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
      super(arg3, arg4, arg7, arg5);
      this.field5942 = arg0;
      this.field5928 = arg2;
      this.field5935 = new byte[arg3 + 1][arg4 + 1];
      int var9 = this.field5942.field10630 >> 9;

      for(int var10 = 1; var10 < arg4; ++var10) {
         for(int var11 = 1; var11 < arg3; ++var11) {
            int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
            int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
            int var15 = (int)Math.sqrt((double)(var14 * var14 + arg7 * 512 + var13 * var13));
            int var16 = (var13 << 8) / var15;
            int var17 = arg7 * -512 / var15;
            int var18 = (var14 << 8) / var15;
            int var19 = (this.field5942.field10600 * var18 + this.field5942.field10623 * var17 + this.field5942.field10598 * var16 >> 17) + var9;
            int var20 = var19 >> 1;
            if (var20 < 2) {
               var20 = 2;
            } else if (var20 > 126) {
               var20 = 126;
            }

            this.field5935[var11][var10] = (byte)var20;
         }
      }

      this.field5945 = new byte[arg3 + 1][arg4 + 1];
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(I)Z",
      line = 76
   )
   private final boolean method3083(int arg0) {
      if ((this.field5928 & 8) == 0) {
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
      owner = "client!ml",
      name = "a",
      descriptor = "(III[[ZZII)V",
      line = 92
   )
   public final void method1626(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
      class148 var8 = this.field5942.field10617;
      this.field5938 = arg5;
      this.field5937 = var8.field1955;
      this.field5932 = var8.field1957;
      this.field5940 = var8.field1952;
      this.field5936 = var8.field1941;
      this.field5933 = var8.field1939;
      this.field5924 = var8.field1951;
      this.field5929 = var8.field1956;
      this.field5944 = var8.field1965;
      this.field5925 = var8.field1962;
      this.field5927 = var8.field1937;
      this.field5931 = var8.field1953;
      this.field5934 = var8.field1966;

      for(int var9 = 0; var9 < arg2 + arg2; ++var9) {
         for(int var10 = 0; var10 < arg2 + arg2; ++var10) {
            if (arg3[var9][var10]) {
               int var11 = arg0 - arg2 + var9;
               int var12 = arg1 - arg2 + var10;
               if (var11 >= 0 && var11 < super.field4071 && var12 >= 0 && var12 < super.field4064) {
                  this.method3082(var11, var12, arg6);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(II)V",
      line = 136
   )
   public final void method1617(int arg0, int arg1) {
      this.method3082(arg0, arg1, 0);
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(IIZLnaa;Lac;[I[I[I[II)V",
      line = 142
   )
   private final void method3084(int arg0, int arg1, boolean arg2, class79 arg3, class567 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
      class232 var11 = this.field5926[arg0][arg1];
      if (var11 != null) {
         if ((var11.field3258 & 2) == 0) {
            if (arg9 != 0) {
               if ((var11.field3258 & 4) != 0) {
                  if ((arg9 & 1) != 0) {
                     return;
                  }
               } else if ((arg9 & 2) != 0) {
                  return;
               }
            }

            int var12 = super.field4062 * arg0;
            int var13 = super.field4062 + var12;
            int var14 = super.field4062 * arg1;
            int var15 = super.field4062 + var14;
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
            if ((var11.field3258 & 1) != 0 && !arg2) {
               int var20 = super.field4066[arg0][arg1];
               float var21 = (float)var20 * this.field5927;
               if (this.field5938 == -1) {
                  var22 = (float)var14 * this.field5931 + (float)var12 * this.field5925 + var21 + this.field5934;
                  if (var22 <= (float)this.field5942.field10624) {
                     return;
                  }

                  var23 = (float)var14 * this.field5931 + (float)var13 * this.field5925 + var21 + this.field5934;
                  if (var23 <= (float)this.field5942.field10624) {
                     return;
                  }

                  var24 = (float)var15 * this.field5931 + (float)var13 * this.field5925 + var21 + this.field5934;
                  if (var24 <= (float)this.field5942.field10624) {
                     return;
                  }

                  var25 = (float)var15 * this.field5931 + (float)var12 * this.field5925 + var21 + this.field5934;
                  if (var25 <= (float)this.field5942.field10624) {
                     return;
                  }
               } else {
                  var22 = (float)var14 * this.field5931 + (float)var12 * this.field5925 + var21 + this.field5934;
                  var23 = (float)var14 * this.field5931 + (float)var13 * this.field5925 + var21 + this.field5934;
                  var24 = (float)var15 * this.field5931 + (float)var13 * this.field5925 + var21 + this.field5934;
                  var25 = (float)var15 * this.field5931 + (float)var12 * this.field5925 + var21 + this.field5934;
               }

               if (arg3.field973) {
                  int var26 = (int)(var22 - (float)arg3.field983);
                  if (var26 > 0) {
                     var16 = var26;
                     if (var26 > 255) {
                        var16 = 255;
                     }
                  }

                  int var27 = (int)(var23 - (float)arg3.field983);
                  if (var27 > 0) {
                     var17 = var27;
                     if (var27 > 255) {
                        var17 = 255;
                     }
                  }

                  int var28 = (int)(var24 - (float)arg3.field983);
                  if (var28 > 0) {
                     var18 = var28;
                     if (var28 > 255) {
                        var18 = 255;
                     }
                  }

                  int var29 = (int)(var25 - (float)arg3.field983);
                  if (var29 > 0) {
                     var19 = var29;
                     if (var29 > 255) {
                        var19 = 255;
                     }
                  }
               }

               float var30 = (float)var20 * this.field5932;
               float var31 = (float)var20 * this.field5924;
               if (this.field5938 == -1) {
                  float var32 = (float)var14 * this.field5940 + (float)var12 * this.field5937 + var30 + this.field5936;
                  var33 = (int)((float)this.field5942.field10629 * var32 / var22) + arg4.field8091;
                  float var34 = (float)var14 * this.field5929 + (float)var12 * this.field5933 + var31 + this.field5944;
                  var35 = (int)((float)this.field5942.field10609 * var34 / var22) + arg4.field8096;
                  float var36 = (float)var14 * this.field5940 + (float)var13 * this.field5937 + var30 + this.field5936;
                  var37 = (int)((float)this.field5942.field10629 * var36 / var23) + arg4.field8091;
                  float var38 = (float)var14 * this.field5929 + (float)var13 * this.field5933 + var31 + this.field5944;
                  var39 = (int)((float)this.field5942.field10609 * var38 / var23) + arg4.field8096;
                  float var40 = (float)var15 * this.field5940 + (float)var13 * this.field5937 + var30 + this.field5936;
                  var41 = (int)((float)this.field5942.field10629 * var40 / var24) + arg4.field8091;
                  float var42 = (float)var15 * this.field5929 + (float)var13 * this.field5933 + var31 + this.field5944;
                  var43 = (int)((float)this.field5942.field10609 * var42 / var24) + arg4.field8096;
                  float var44 = (float)var15 * this.field5940 + (float)var12 * this.field5937 + var30 + this.field5936;
                  var45 = (int)((float)this.field5942.field10629 * var44 / var25) + arg4.field8091;
                  float var46 = (float)var15 * this.field5929 + (float)var12 * this.field5933 + var31 + this.field5944;
                  var47 = (int)((float)this.field5942.field10609 * var46 / var25) + arg4.field8096;
               } else {
                  float var48 = (float)var14 * this.field5940 + (float)var12 * this.field5937 + var30 + this.field5936;
                  var33 = (int)((float)this.field5942.field10629 * var48 / (float)this.field5938) + arg4.field8091;
                  float var49 = (float)var14 * this.field5929 + (float)var12 * this.field5933 + var31 + this.field5944;
                  var35 = (int)((float)this.field5942.field10609 * var49 / (float)this.field5938) + arg4.field8096;
                  float var50 = (float)var14 * this.field5940 + (float)var13 * this.field5937 + var30 + this.field5936;
                  var37 = (int)((float)this.field5942.field10629 * var50 / (float)this.field5938) + arg4.field8091;
                  float var51 = (float)var14 * this.field5929 + (float)var13 * this.field5933 + var31 + this.field5944;
                  var39 = (int)((float)this.field5942.field10609 * var51 / (float)this.field5938) + arg4.field8096;
                  float var52 = (float)var15 * this.field5940 + (float)var13 * this.field5937 + var30 + this.field5936;
                  var41 = (int)((float)this.field5942.field10629 * var52 / (float)this.field5938) + arg4.field8091;
                  float var53 = (float)var15 * this.field5929 + (float)var13 * this.field5933 + var31 + this.field5944;
                  var43 = (int)((float)this.field5942.field10609 * var53 / (float)this.field5938) + arg4.field8096;
                  float var54 = (float)var15 * this.field5940 + (float)var12 * this.field5937 + var30 + this.field5936;
                  var45 = (int)((float)this.field5942.field10629 * var54 / (float)this.field5938) + arg4.field8091;
                  float var55 = (float)var15 * this.field5929 + (float)var12 * this.field5933 + var31 + this.field5944;
                  var47 = (int)((float)this.field5942.field10609 * var55 / (float)this.field5938) + arg4.field8096;
               }
            } else {
               int var56 = super.field4066[arg0][arg1];
               int var57 = super.field4066[arg0 + 1][arg1];
               int var58 = super.field4066[arg0 + 1][arg1 + 1];
               int var59 = super.field4066[arg0][arg1 + 1];
               if (this.field5938 == -1) {
                  var22 = (float)var14 * this.field5931 + (float)var12 * this.field5925 + (float)var56 * this.field5927 + this.field5934;
                  if (var22 <= (float)this.field5942.field10624) {
                     return;
                  }

                  var23 = (float)var14 * this.field5931 + (float)var13 * this.field5925 + (float)var57 * this.field5927 + this.field5934;
                  if (var23 <= (float)this.field5942.field10624) {
                     return;
                  }

                  var24 = (float)var15 * this.field5931 + (float)var13 * this.field5925 + (float)var58 * this.field5927 + this.field5934;
                  if (var24 <= (float)this.field5942.field10624) {
                     return;
                  }

                  var25 = (float)var15 * this.field5931 + (float)var12 * this.field5925 + (float)var59 * this.field5927 + this.field5934;
                  if (var25 <= (float)this.field5942.field10624) {
                     return;
                  }
               } else {
                  var22 = (float)var14 * this.field5931 + (float)var12 * this.field5925 + (float)var56 * this.field5927 + this.field5934;
                  var23 = (float)var14 * this.field5931 + (float)var13 * this.field5925 + (float)var57 * this.field5927 + this.field5934;
                  var24 = (float)var15 * this.field5931 + (float)var13 * this.field5925 + (float)var58 * this.field5927 + this.field5934;
                  var25 = (float)var15 * this.field5931 + (float)var12 * this.field5925 + (float)var59 * this.field5927 + this.field5934;
               }

               if (arg2) {
                  int var60 = (int)(var22 - (float)arg3.field983);
                  if (var60 > 255) {
                     var60 = 255;
                  }

                  if (var60 > 0) {
                     var16 = var60;
                     int var61 = var11.field3256 * var60 / 255;
                     if (var61 > 0) {
                        var56 -= var61;
                     }
                  }

                  int var62 = (int)(var23 - (float)arg3.field983);
                  if (var62 > 255) {
                     var62 = 255;
                  }

                  if (var62 > 0) {
                     var17 = var62;
                     int var63 = var11.field3255 * var62 / 255;
                     if (var63 > 0) {
                        var57 -= var63;
                     }
                  }

                  int var64 = (int)(var24 - (float)arg3.field983);
                  if (var64 > 255) {
                     var64 = 255;
                  }

                  if (var64 > 0) {
                     var18 = var64;
                     int var65 = var11.field3252 * var64 / 255;
                     if (var65 > 0) {
                        var58 -= var65;
                     }
                  }

                  int var66 = (int)(var25 - (float)arg3.field983);
                  if (var66 > 255) {
                     var66 = 255;
                  }

                  if (var66 > 0) {
                     var19 = var66;
                     int var67 = var11.field3249 * var66 / 255;
                     if (var67 > 0) {
                        var59 -= var67;
                     }
                  }
               } else if (arg3.field973) {
                  int var68 = (int)(var22 - (float)arg3.field983);
                  if (var68 > 0) {
                     var16 = var68;
                     if (var68 > 255) {
                        var16 = 255;
                     }
                  }

                  int var69 = (int)(var23 - (float)arg3.field983);
                  if (var69 > 0) {
                     var17 = var69;
                     if (var69 > 255) {
                        var17 = 255;
                     }
                  }

                  int var70 = (int)(var24 - (float)arg3.field983);
                  if (var70 > 0) {
                     var18 = var70;
                     if (var70 > 255) {
                        var18 = 255;
                     }
                  }

                  int var71 = (int)(var25 - (float)arg3.field983);
                  if (var71 > 0) {
                     var19 = var71;
                     if (var71 > 255) {
                        var19 = 255;
                     }
                  }
               }

               if (this.field5938 == -1) {
                  float var72 = (float)var14 * this.field5940 + (float)var12 * this.field5937 + (float)var56 * this.field5932 + this.field5936;
                  var33 = (int)((float)this.field5942.field10629 * var72 / var22) + arg4.field8091;
                  float var73 = (float)var14 * this.field5929 + (float)var12 * this.field5933 + (float)var56 * this.field5924 + this.field5944;
                  var35 = (int)((float)this.field5942.field10609 * var73 / var22) + arg4.field8096;
                  float var74 = (float)var14 * this.field5940 + (float)var13 * this.field5937 + (float)var57 * this.field5932 + this.field5936;
                  var37 = (int)((float)this.field5942.field10629 * var74 / var23) + arg4.field8091;
                  float var75 = (float)var14 * this.field5929 + (float)var13 * this.field5933 + (float)var57 * this.field5924 + this.field5944;
                  var39 = (int)((float)this.field5942.field10609 * var75 / var23) + arg4.field8096;
                  float var76 = (float)var15 * this.field5940 + (float)var13 * this.field5937 + (float)var58 * this.field5932 + this.field5936;
                  var41 = (int)((float)this.field5942.field10629 * var76 / var24) + arg4.field8091;
                  float var77 = (float)var15 * this.field5929 + (float)var13 * this.field5933 + (float)var58 * this.field5924 + this.field5944;
                  var43 = (int)((float)this.field5942.field10609 * var77 / var24) + arg4.field8096;
                  float var78 = (float)var15 * this.field5940 + (float)var12 * this.field5937 + (float)var59 * this.field5932 + this.field5936;
                  var45 = (int)((float)this.field5942.field10629 * var78 / var25) + arg4.field8091;
                  float var79 = (float)var15 * this.field5929 + (float)var12 * this.field5933 + (float)var59 * this.field5924 + this.field5944;
                  var47 = (int)((float)this.field5942.field10609 * var79 / var25) + arg4.field8096;
               } else {
                  float var80 = (float)var14 * this.field5940 + (float)var12 * this.field5937 + (float)var56 * this.field5932 + this.field5936;
                  var33 = (int)((float)this.field5942.field10629 * var80 / (float)this.field5938) + arg4.field8091;
                  float var81 = (float)var14 * this.field5929 + (float)var12 * this.field5933 + (float)var56 * this.field5924 + this.field5944;
                  var35 = (int)((float)this.field5942.field10609 * var81 / (float)this.field5938) + arg4.field8096;
                  float var82 = (float)var14 * this.field5940 + (float)var13 * this.field5937 + (float)var57 * this.field5932 + this.field5936;
                  var37 = (int)((float)this.field5942.field10629 * var82 / (float)this.field5938) + arg4.field8091;
                  float var83 = (float)var14 * this.field5929 + (float)var13 * this.field5933 + (float)var57 * this.field5924 + this.field5944;
                  var39 = (int)((float)this.field5942.field10609 * var83 / (float)this.field5938) + arg4.field8096;
                  float var84 = (float)var15 * this.field5940 + (float)var13 * this.field5937 + (float)var58 * this.field5932 + this.field5936;
                  var41 = (int)((float)this.field5942.field10629 * var84 / (float)this.field5938) + arg4.field8091;
                  float var85 = (float)var15 * this.field5929 + (float)var13 * this.field5933 + (float)var58 * this.field5924 + this.field5944;
                  var43 = (int)((float)this.field5942.field10609 * var85 / (float)this.field5938) + arg4.field8096;
                  float var86 = (float)var15 * this.field5940 + (float)var12 * this.field5937 + (float)var59 * this.field5932 + this.field5936;
                  var45 = (int)((float)this.field5942.field10629 * var86 / (float)this.field5938) + arg4.field8091;
                  float var87 = (float)var15 * this.field5929 + (float)var12 * this.field5933 + (float)var59 * this.field5924 + this.field5944;
                  var47 = (int)((float)this.field5942.field10609 * var87 / (float)this.field5938) + arg4.field8096;
               }
            }

            boolean var88 = var11.field3248 != -1 && this.method3083(this.field5942.field802.method1354(var11.field3248, (byte)-109).field4308);
            if (this.field5938 == -1) {
               int var89 = var17 + var18 + var19;
               if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                  arg4.field8082 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field8088 || var45 > arg4.field8088 || var37 > arg4.field8088;
                  if (var89 < 765) {
                     if (var89 > 0) {
                        if (var11.field3248 >= 0) {
                           int var90 = -16777216;
                           if (var88) {
                              var90 = -1694498816;
                           }

                           arg4.method4052((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field3251 & 16777215, var90 | var11.field3254 & 16777215, var90 | var11.field3257 & 16777215, arg3.field978, var18, var19, var17, var11.field3248);
                        } else {
                           if (var88) {
                              arg4.field8090 = 100;
                           }

                           arg4.method4043((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), class391.method2973(var11.field3251, var18 << 24 | arg3.field978, 16711680), class391.method2973(var11.field3254, var19 << 24 | arg3.field978, 16711680), class391.method2973(var11.field3257, var17 << 24 | arg3.field978, 16711680));
                           arg4.field8090 = 0;
                        }
                     } else if (var11.field3248 >= 0) {
                        int var91 = -16777216;
                        if (var88) {
                           var91 = -1694498816;
                        }

                        arg4.method4052((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field3251 & 16777215, var91 | var11.field3254 & 16777215, var91 | var11.field3257 & 16777215, 0, 0, 0, 0, var11.field3248);
                     } else {
                        if (var88) {
                           arg4.field8090 = 100;
                        }

                        arg4.method4043((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), var11.field3251, var11.field3254, var11.field3257);
                        arg4.field8090 = 0;
                     }
                  } else {
                     arg4.method4041((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), arg3.field978);
                  }
               }

               int var92 = var16 + var17 + var19;
               if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                  arg4.field8082 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field8088 || var37 > arg4.field8088 || var45 > arg4.field8088;
                  if (var92 < 765) {
                     if (var88) {
                        arg4.field8090 = -1694498816;
                     }

                     if (var92 > 0) {
                        if (var11.field3248 >= 0) {
                           int var93 = -16777216;
                           if (var88) {
                              var93 = -1694498816;
                           }

                           arg4.method4052((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field3253 & 16777215, var93 | var11.field3257 & 16777215, var93 | var11.field3254 & 16777215, arg3.field978, var16, var17, var19, var11.field3248);
                           return;
                        }

                        if (var88) {
                           arg4.field8090 = 100;
                        }

                        arg4.method4043((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), class391.method2973(var11.field3253, var16 << 24 | arg3.field978, 16711680), class391.method2973(var11.field3257, var17 << 24 | arg3.field978, 16711680), class391.method2973(var11.field3254, var19 << 24 | arg3.field978, 16711680));
                        arg4.field8090 = 0;
                        return;
                     }

                     if (var11.field3248 >= 0) {
                        int var94 = -16777216;
                        if (var88) {
                           var94 = -1694498816;
                        }

                        arg4.method4052((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field3253 & 16777215, var94 | var11.field3257 & 16777215, var94 | var11.field3254 & 16777215, 0, 0, 0, 0, var11.field3248);
                        return;
                     }

                     if (var88) {
                        arg4.field8090 = 100;
                     }

                     arg4.method4043((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), var11.field3253, var11.field3257, var11.field3254);
                     arg4.field8090 = 0;
                     return;
                  }

                  arg4.method4041((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), arg3.field978);
                  return;
               }
            } else {
               int var95 = var17 + var18 + var19;
               if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                  arg4.field8082 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field8088 || var45 > arg4.field8088 || var37 > arg4.field8088;
                  if (var95 < 765) {
                     if (var88) {
                        arg4.field8090 = -1694498816;
                     }

                     if (var95 > 0) {
                        if (var11.field3248 >= 0) {
                           int var96 = -16777216;
                           if (var88) {
                              var96 = -1694498816;
                           }

                           arg4.method4052((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field3251 & 16777215, var96 | var11.field3254 & 16777215, var96 | var11.field3257 & 16777215, arg3.field978, var18, var19, var17, var11.field3248);
                        } else {
                           if (var88) {
                              arg4.field8090 = 100;
                           }

                           arg4.method4043((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), class391.method2973(var11.field3251, var18 << 24 | arg3.field978, 16711680), class391.method2973(var11.field3254, var19 << 24 | arg3.field978, 16711680), class391.method2973(var11.field3257, var17 << 24 | arg3.field978, 16711680));
                           arg4.field8090 = 0;
                        }
                     } else if (var11.field3248 >= 0) {
                        int var97 = -16777216;
                        if (var88) {
                           var97 = -1694498816;
                        }

                        arg4.method4052((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field3251 & 16777215, var97 | var11.field3254 & 16777215, var97 | var11.field3257 & 16777215, 0, 0, 0, 0, var11.field3248);
                     } else {
                        if (var88) {
                           arg4.field8090 = 100;
                        }

                        arg4.method4043((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), var11.field3251, var11.field3254, var11.field3257);
                        arg4.field8090 = 0;
                     }
                  } else {
                     arg4.method4041((float)var43, (float)var47, (float)var39, (float)var41, (float)var45, (float)var37, (float)((int)var24), (float)((int)var25), (float)((int)var23), arg3.field978);
                  }
               }

               int var98 = var16 + var17 + var19;
               if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                  arg4.field8082 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field8088 || var37 > arg4.field8088 || var45 > arg4.field8088;
                  if (var98 < 765) {
                     if (var88) {
                        arg4.field8090 = -1694498816;
                     }

                     if (var98 > 0) {
                        if (var11.field3248 >= 0) {
                           int var99 = -16777216;
                           if (var88) {
                              var99 = -1694498816;
                           }

                           arg4.method4052((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field3253 & 16777215, var99 | var11.field3257 & 16777215, var99 | var11.field3254 & 16777215, arg3.field978, var16, var17, var19, var11.field3248);
                           return;
                        }

                        if (var88) {
                           arg4.field8090 = 100;
                        }

                        arg4.method4043((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), class391.method2973(var11.field3253, var16 << 24 | arg3.field978, 16711680), class391.method2973(var11.field3257, var17 << 24 | arg3.field978, 16711680), class391.method2973(var11.field3254, var19 << 24 | arg3.field978, 16711680));
                        arg4.field8090 = 0;
                        return;
                     }

                     if (var11.field3248 >= 0) {
                        int var100 = -16777216;
                        if (var88) {
                           var100 = -1694498816;
                        }

                        arg4.method4052((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field3253 & 16777215, var100 | var11.field3257 & 16777215, var100 | var11.field3254 & 16777215, 0, 0, 0, 0, var11.field3248);
                        return;
                     }

                     if (var88) {
                        arg4.field8090 = 100;
                     }

                     arg4.method4043((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), var11.field3253, var11.field3257, var11.field3254);
                     arg4.field8090 = 0;
                     return;
                  }

                  arg4.method4041((float)var35, (float)var39, (float)var47, (float)var33, (float)var37, (float)var45, (float)((int)var22), (float)((int)var23), (float)((int)var25), arg3.field978);
               }
            }

         }
      } else {
         class496 var101 = this.field5939[arg0][arg1];
         if (var101 != null) {
            if (arg9 != 0) {
               if ((var101.field7198 & 4) != 0) {
                  if ((arg9 & 1) != 0) {
                     return;
                  }
               } else if ((arg9 & 2) != 0) {
                  return;
               }
            }

            if (this.field5938 == -1) {
               for(int var102 = 0; var102 < var101.field7195; ++var102) {
                  int var103 = (arg0 << super.field4065) + var101.field7193[var102];
                  int var104 = var101.field7199[var102];
                  int var105 = (arg1 << super.field4065) + var101.field7189[var102];
                  float var106 = (float)var105 * this.field5931 + (float)var103 * this.field5925 + (float)var104 * this.field5927 + this.field5934;
                  if (var106 <= (float)this.field5942.field10624) {
                     return;
                  }

                  arg8[var102] = 0;
                  if (arg2) {
                     int var107 = (int)(var106 - (float)arg3.field983);
                     if (var107 > 255) {
                        var107 = 255;
                     }

                     if (var107 > 0) {
                        arg8[var102] = var107;
                        int var108 = var101.field7196[var102] * var107 / 255;
                        if (var108 > 0) {
                           var104 -= var108;
                        }
                     }
                  } else if (arg3.field973) {
                     int var109 = (int)(var106 - (float)arg3.field983);
                     if (var109 > 0) {
                        arg8[var102] = var109;
                        if (arg8[var102] > 255) {
                           arg8[var102] = 255;
                        }
                     }
                  }

                  float var110 = (float)var105 * this.field5940 + (float)var103 * this.field5937 + (float)var104 * this.field5932 + this.field5936;
                  float var111 = (float)var105 * this.field5929 + (float)var103 * this.field5933 + (float)var104 * this.field5924 + this.field5944;
                  arg5[var102] = (int)((float)this.field5942.field10629 * var110 / var106) + arg4.field8091;
                  arg6[var102] = (int)((float)this.field5942.field10609 * var111 / var106) + arg4.field8096;
                  arg7[var102] = (int)var106;
               }
            } else {
               for(int var112 = 0; var112 < var101.field7195; ++var112) {
                  int var152 = (arg0 << super.field4065) + var101.field7193[var112];
                  int var153 = var101.field7199[var112];
                  int var154 = (arg1 << super.field4065) + var101.field7189[var112];
                  float var155 = (float)var154 * this.field5931 + (float)var152 * this.field5925 + (float)var153 * this.field5927 + this.field5934;
                  arg8[var112] = 0;
                  if (arg2) {
                     int var156 = this.field5938 - arg3.field983;
                     if (var156 > 255) {
                        var156 = 255;
                     }

                     if (var156 > 0) {
                        arg8[var112] = var156;
                        int var157 = var101.field7196[var112] * var156 / 255;
                        if (var157 > 0) {
                           var153 -= var157;
                        }
                     }
                  } else if (arg3.field973) {
                     int var158 = this.field5938 - arg3.field983;
                     if (var158 > 0) {
                        arg8[var112] = var158;
                        if (arg8[var112] > 255) {
                           arg8[var112] = 255;
                        }
                     }
                  }

                  float var159 = (float)var154 * this.field5940 + (float)var152 * this.field5937 + (float)var153 * this.field5932 + this.field5936;
                  float var160 = (float)var154 * this.field5929 + (float)var152 * this.field5933 + (float)var153 * this.field5924 + this.field5944;
                  arg5[var112] = (int)((float)this.field5942.field10629 * var159 / (float)this.field5938) + arg4.field8091;
                  arg6[var112] = (int)((float)this.field5942.field10609 * var160 / (float)this.field5938) + arg4.field8096;
                  arg7[var112] = (int)var155;
               }
            }

            if (var101.field7192 != null) {
               if (this.field5938 == -1) {
                  for(int var113 = 0; var113 < var101.field7191; ++var113) {
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
                        arg4.field8082 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field8088 || var118 > arg4.field8088 || var119 > arg4.field8088;
                        short var124 = var101.field7192[var113];
                        if (var123 < 765) {
                           if (var123 > 0) {
                              if (var124 != -1) {
                                 int var125 = -16777216;
                                 if (var124 != -1 && this.method3083(this.field5942.field802.method1354(var124, (byte)-109).field4308)) {
                                    var125 = -1694498816;
                                 }

                                 arg4.method4052((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], (float)var101.field7193[var114] / (float)super.field4062, (float)var101.field7193[var115] / (float)super.field4062, (float)var101.field7193[var116] / (float)super.field4062, (float)var101.field7189[var114] / (float)super.field4062, (float)var101.field7189[var115] / (float)super.field4062, (float)var101.field7189[var116] / (float)super.field4062, var125 | var101.field7197[var114] & 16777215, var125 | var101.field7197[var115] & 16777215, var125 | var101.field7197[var116] & 16777215, arg3.field978, arg8[var114], arg8[var115], arg8[var116], var124);
                              } else if ((var101.field7197[var114] & 16777215) != 0) {
                                 if (var124 != -1 && this.method3083(this.field5942.field802.method1354(var124, (byte)-109).field4308)) {
                                    arg4.field8090 = -1694498816;
                                 }

                                 arg4.method4043((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], class391.method2973(var101.field7197[var114], arg8[var114] << 24 | arg3.field978, 16711680), class391.method2973(var101.field7197[var115], arg8[var115] << 24 | arg3.field978, 16711680), class391.method2973(var101.field7197[var116], arg8[var116] << 24 | arg3.field978, 16711680));
                                 arg4.field8090 = 0;
                              }
                           } else if (var124 != -1) {
                              int var126 = -16777216;
                              if (var124 != -1 && this.method3083(this.field5942.field802.method1354(var124, (byte)-109).field4308)) {
                                 var126 = -1694498816;
                              }

                              arg4.method4052((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], (float)var101.field7193[var114] / (float)super.field4062, (float)var101.field7193[var115] / (float)super.field4062, (float)var101.field7193[var116] / (float)super.field4062, (float)var101.field7189[var114] / (float)super.field4062, (float)var101.field7189[var115] / (float)super.field4062, (float)var101.field7189[var116] / (float)super.field4062, var126 | var101.field7197[var114] & 16777215, var126 | var101.field7197[var115] & 16777215, var126 | var101.field7197[var116] & 16777215, 0, 0, 0, 0, var124);
                           } else if ((var101.field7197[var114] & 16777215) != 0) {
                              if (var124 != -1 && this.method3083(this.field5942.field802.method1354(var124, (byte)-109).field4308)) {
                                 arg4.field8090 = -1694498816;
                              }

                              arg4.method4043((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], var101.field7197[var114], var101.field7197[var115], var101.field7197[var116]);
                              arg4.field8090 = 0;
                           }
                        } else {
                           arg4.method4041((float)var120, (float)var121, (float)var122, (float)var117, (float)var118, (float)var119, (float)arg7[var114], (float)arg7[var115], (float)arg7[var116], arg3.field978);
                        }
                     }
                  }

                  return;
               }

               for(int var127 = 0; var127 < var101.field7191; ++var127) {
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
                     arg4.field8082 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field8088 || var132 > arg4.field8088 || var133 > arg4.field8088;
                     short var138 = var101.field7192[var127];
                     if (var137 < 765) {
                        if (var138 != -1 && this.method3083(this.field5942.field802.method1354(var138, (byte)-109).field4308)) {
                           arg4.field8090 = -1694498816;
                        }

                        if (var137 > 0) {
                           if (var138 != -1) {
                              int var139 = -16777216;
                              if (var138 != -1 && this.method3083(this.field5942.field802.method1354(var138, (byte)-109).field4308)) {
                                 var139 = -1694498816;
                              }

                              arg4.method4052((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], (float)var101.field7193[var128] / (float)super.field4062, (float)var101.field7193[var129] / (float)super.field4062, (float)var101.field7193[var130] / (float)super.field4062, (float)var101.field7189[var128] / (float)super.field4062, (float)var101.field7189[var129] / (float)super.field4062, (float)var101.field7189[var130] / (float)super.field4062, var139 | var101.field7197[var128] & 16777215, var139 | var101.field7197[var129] & 16777215, var139 | var101.field7197[var130] & 16777215, arg3.field978, arg8[var128], arg8[var129], arg8[var130], var138);
                           } else if ((var101.field7197[var128] & 16777215) != 0) {
                              if (var138 != -1 && this.method3083(this.field5942.field802.method1354(var138, (byte)-109).field4308)) {
                                 arg4.field8090 = -1694498816;
                              }

                              arg4.method4043((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], class391.method2973(var101.field7197[var128], arg8[var128] << 24 | arg3.field978, 16711680), class391.method2973(var101.field7197[var129], arg8[var129] << 24 | arg3.field978, 16711680), class391.method2973(var101.field7197[var130], arg8[var130] << 24 | arg3.field978, 16711680));
                              arg4.field8090 = 0;
                           }
                        } else if (var138 != -1) {
                           int var140 = -16777216;
                           if (var138 != -1 && this.method3083(this.field5942.field802.method1354(var138, (byte)-109).field4308)) {
                              var140 = -1694498816;
                           }

                           arg4.method4052((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], (float)var101.field7193[var128] / (float)super.field4062, (float)var101.field7193[var129] / (float)super.field4062, (float)var101.field7193[var130] / (float)super.field4062, (float)var101.field7189[var128] / (float)super.field4062, (float)var101.field7189[var129] / (float)super.field4062, (float)var101.field7189[var130] / (float)super.field4062, var140 | var101.field7197[var128] & 16777215, var140 | var101.field7197[var129] & 16777215, var140 | var101.field7197[var130] & 16777215, 0, 0, 0, 0, var138);
                        } else if ((var101.field7197[var128] & 16777215) != 0) {
                           if (var138 != -1 && this.method3083(this.field5942.field802.method1354(var138, (byte)-109).field4308)) {
                              arg4.field8090 = -1694498816;
                           }

                           arg4.method4043((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], var101.field7197[var128], var101.field7197[var129], var101.field7197[var130]);
                           arg4.field8090 = 0;
                        }

                        arg4.field8090 = 0;
                     } else {
                        arg4.method4041((float)var134, (float)var135, (float)var136, (float)var131, (float)var132, (float)var133, (float)arg7[var128], (float)arg7[var129], (float)arg7[var130], arg3.field978);
                     }
                  }
               }

               return;
            }

            for(int var141 = 0; var141 < var101.field7191; ++var141) {
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
                  arg4.field8082 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field8088 || var146 > arg4.field8088 || var147 > arg4.field8088;
                  if (var151 < 765) {
                     if (var151 > 0) {
                        if ((var101.field7197[var142] & 16777215) != 0) {
                           arg4.method4043((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], class259.method1989(10555, var101.field7197[var142], arg8[var142], arg3.field978), class259.method1989(10555, var101.field7197[var143], arg8[var143], arg3.field978), class259.method1989(10555, var101.field7197[var144], arg8[var144], arg3.field978));
                        }
                     } else if ((var101.field7197[var142] & 16777215) != 0) {
                        arg4.method4043((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], var101.field7197[var142], var101.field7197[var143], var101.field7197[var144]);
                     }
                  } else {
                     arg4.method4041((float)var148, (float)var149, (float)var150, (float)var145, (float)var146, (float)var147, (float)arg7[var142], (float)arg7[var143], (float)arg7[var144], arg3.field978);
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "b",
      descriptor = "(II)I",
      line = 1131
   )
   private static final int method3085(int arg0, int arg1) {
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
      owner = "client!ml",
      name = "a",
      descriptor = "(Lmn;[I)V",
      line = 1162
   )
   public final void method1619(class389 arg0, int[] arg1) {
   }

   @OriginalMember(
      owner = "client!ml",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V",
      line = 1165
   )
   public final void method1623(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(III[[ZZI)V",
      line = 1170
   )
   public final void method1624(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
      class148 var7 = this.field5942.field10617;
      this.field5938 = -1;
      this.field5937 = var7.field1955;
      this.field5932 = var7.field1957;
      this.field5940 = var7.field1952;
      this.field5936 = var7.field1941;
      this.field5933 = var7.field1939;
      this.field5924 = var7.field1951;
      this.field5929 = var7.field1956;
      this.field5944 = var7.field1965;
      this.field5925 = var7.field1962;
      this.field5927 = var7.field1937;
      this.field5931 = var7.field1953;
      this.field5934 = var7.field1966;

      for(int var8 = 0; var8 < arg2 + arg2; ++var8) {
         for(int var9 = 0; var9 < arg2 + arg2; ++var9) {
            if (arg3[var8][var9]) {
               int var10 = arg0 - arg2 + var8;
               int var11 = arg1 - arg2 + var9;
               if (var10 >= 0 && var10 < super.field4071 && var11 >= 0 && var11 < super.field4064) {
                  this.method3082(var10, var11, arg5);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!ml",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V",
      line = 1216
   )
   public final void method1615(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z",
      line = 1222
   )
   public final boolean method1625(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return false;
   }

   @OriginalMember(
      owner = "client!ml",
      name = "ka",
      descriptor = "(III)V",
      line = 1225
   )
   public final void method1613(int arg0, int arg1, int arg2) {
      if (this.field5945[arg0][arg1] < arg2) {
         this.field5945[arg0][arg1] = (byte)arg2;
      }

   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(IIIIIII[[Z)V",
      line = 1231
   )
   public final void method1616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
      class79 var9 = this.field5942.method5290(Thread.currentThread());
      class567 var10 = var9.field994;
      var10.field8090 = 0;
      var10.field8082 = true;
      this.field5942.method523();
      if (this.field5926 == null && this.field5943 == null) {
         if (this.field5930 != null) {
            this.method3089(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field1010, var9.field1013);
         }

      } else {
         this.method3086(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field1010, var9.field1013);
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "YA",
      descriptor = "()V",
      line = 1247
   )
   public final void method1622() {
      this.field5935 = null;
      this.field5945 = null;
   }

   @OriginalMember(
      owner = "client!ml",
      name = "b",
      descriptor = "(IIIIIII[[ZLnaa;Lac;[I[I)V",
      line = 1258
   )
   private final void method3086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class79 arg8, class567 arg9, int[] arg10, int[] arg11) {
      int var13 = (arg6 - arg4) * arg2 / 256;
      int var14 = arg2 >> 8;
      boolean var15 = arg8.field984;
      this.field5942.method493(false);
      arg9.field8086 = false;
      arg9.field8095 = false;
      int var16 = arg0;
      int var17 = arg1 + var13;

      for(int var18 = arg3; var18 < arg5; ++var18) {
         for(int var19 = arg4; var19 < arg6; ++var19) {
            if (arg7[var18 - arg3][var19 - arg4]) {
               if (this.field5926 != null) {
                  if (this.field5926[var18][var19] != null) {
                     class232 var20 = this.field5926[var18][var19];
                     if (var20.field3248 != -1 && (var20.field3258 & 2) == 0 && var20.field3250 == 0) {
                        int var21 = this.field5942.method5284(var20.field3248);
                        arg9.method4047((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)class81.method734(1, var21, var20.field3251), (float)class81.method734(1, var21, var20.field3254), (float)class81.method734(1, var21, var20.field3257));
                        arg9.method4047((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)class81.method734(1, var21, var20.field3253), (float)class81.method734(1, var21, var20.field3257), (float)class81.method734(1, var21, var20.field3254));
                     } else if (var20.field3250 == 0) {
                        arg9.method4043((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, var20.field3251, var20.field3254, var20.field3257);
                        arg9.method4043((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, var20.field3253, var20.field3257, var20.field3254);
                     } else {
                        int var22 = var20.field3250;
                        arg9.method4043((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, class391.method2973(var22, var20.field3251 & -16777216, 16711680), class391.method2973(var22, var20.field3254 & -16777216, 16711680), class391.method2973(var22, var20.field3257 & -16777216, 16711680));
                        arg9.method4043((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, class391.method2973(var22, var20.field3253 & -16777216, 16711680), class391.method2973(var22, var20.field3257 & -16777216, 16711680), class391.method2973(var22, var20.field3254 & -16777216, 16711680));
                     }
                  } else if (this.field5939[var18][var19] != null) {
                     class496 var23 = this.field5939[var18][var19];

                     for(int var24 = 0; var24 < var23.field7195; ++var24) {
                        arg10[var24] = var23.field7193[var24] * var14 / super.field4062 + var16;
                        arg11[var24] = var17 - var23.field7189[var24] * var14 / super.field4062;
                     }

                     for(int var25 = 0; var25 < var23.field7191; ++var25) {
                        int var26 = var25 * 3;
                        int var27 = var26 + 1;
                        int var28 = var27 + 1;
                        int var29 = arg10[var26];
                        int var30 = arg10[var27];
                        int var31 = arg10[var28];
                        int var32 = arg11[var26];
                        int var33 = arg11[var27];
                        int var34 = arg11[var28];
                        if (var23.field7194 != null && var23.field7194[var25] != 0 && (var23.field7192 == null || var23.field7192 != null && var23.field7192[var25] == -1)) {
                           int var35 = var23.field7194[var25];
                           arg9.method4043((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, class391.method2973(var35, -16777216 - (var23.field7197[var26] & -16777216), 16711680), class391.method2973(var35, -16777216 - (var23.field7197[var27] & -16777216), 16711680), class391.method2973(var35, -16777216 - (var23.field7197[var28] & -16777216), 16711680));
                        } else if (var23.field7192 != null && var23.field7192[var25] != -1) {
                           int var36 = this.field5942.method5284(var23.field7192[var25]);
                           arg9.method4047((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)var36, (float)var36, (float)var36);
                        } else {
                           arg9.method4043((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, var23.field7197[var26], var23.field7197[var27], var23.field7197[var28]);
                        }
                     }
                  }
               } else if (this.field5943[var18][var19] != null) {
                  class15 var37 = this.field5943[var18][var19];

                  for(int var38 = 0; var38 < var37.field178; ++var38) {
                     arg10[var38] = var37.field174[var38] * var14 / super.field4062 + var16;
                     arg11[var38] = var17 - var37.field171[var38] * var14 / super.field4062;
                  }

                  for(int var39 = 0; var39 < var37.field176; ++var39) {
                     int var40 = var39 * 3;
                     int var41 = var40 + 1;
                     int var42 = var41 + 1;
                     int var43 = arg10[var40];
                     int var44 = arg10[var41];
                     int var45 = arg10[var42];
                     int var46 = arg11[var40];
                     int var47 = arg11[var41];
                     int var48 = arg11[var42];
                     if (var37.field170 != null && var37.field170[var39] != 0) {
                        int var49 = var37.field170[var39];
                        arg9.method4043((float)var46, (float)var47, (float)var48, (float)var43, (float)var44, (float)var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                     } else {
                        arg9.method4043((float)var46, (float)var47, (float)var48, (float)var43, (float)var44, (float)var45, 100.0F, 100.0F, 100.0F, var37.field173[var40], var37.field173[var41], var37.field173[var42]);
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = arg1 + var13;
         var16 += var14;
      }

      arg9.field8086 = true;
      this.field5942.method493(var15);
   }

   @OriginalMember(
      owner = "client!ml",
      name = "b",
      descriptor = "(IIZLnaa;Lac;[I[I[I[II)V",
      line = 1450
   )
   private final void method3087(int arg0, int arg1, boolean arg2, class79 arg3, class567 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
      class15 var11 = this.field5943[arg0][arg1];
      if (arg9 == 0 || (arg9 & 2) == 0) {
         if (var11 != null) {
            if (this.field5938 == -1) {
               for(int var12 = 0; var12 < var11.field178; ++var12) {
                  int var13 = (arg0 << super.field4065) + var11.field174[var12];
                  int var14 = var11.field169[var12];
                  int var15 = (arg1 << super.field4065) + var11.field171[var12];
                  float var16 = (float)var15 * this.field5931 + (float)var13 * this.field5925 + (float)var14 * this.field5927 + this.field5934;
                  if (var16 <= (float)this.field5942.field10624) {
                     return;
                  }

                  arg8[var12] = 0;
                  if (arg2) {
                     int var17 = (int)(var16 - (float)arg3.field983);
                     if (var17 > 255) {
                        var17 = 255;
                     }

                     if (var17 > 0) {
                        arg8[var12] = var17;
                        int var18 = var11.field177[var12] * var17 / 255;
                        if (var18 > 0) {
                           var14 -= var18;
                        }
                     }
                  } else if (arg3.field973) {
                     int var19 = (int)(var16 - (float)arg3.field983);
                     if (var19 > 0) {
                        arg8[var12] = var19;
                        if (arg8[var12] > 255) {
                           arg8[var12] = 255;
                        }
                     }
                  }

                  float var20 = (float)var15 * this.field5940 + (float)var13 * this.field5937 + (float)var14 * this.field5932 + this.field5936;
                  float var21 = (float)var15 * this.field5929 + (float)var13 * this.field5933 + (float)var14 * this.field5924 + this.field5944;
                  arg5[var12] = (int)((float)this.field5942.field10629 * var20 / var16) + arg4.field8091;
                  arg6[var12] = (int)((float)this.field5942.field10609 * var21 / var16) + arg4.field8096;
                  arg7[var12] = (int)var16;
               }
            } else {
               for(int var22 = 0; var22 < var11.field178; ++var22) {
                  int var36 = (arg0 << super.field4065) + var11.field174[var22];
                  int var37 = var11.field169[var22];
                  int var38 = (arg1 << super.field4065) + var11.field171[var22];
                  float var39 = (float)var38 * this.field5931 + (float)var36 * this.field5925 + (float)var37 * this.field5927 + this.field5934;
                  arg8[var22] = 0;
                  if (arg2) {
                     int var40 = this.field5938 - arg3.field983;
                     if (var40 > 255) {
                        var40 = 255;
                     }

                     if (var40 > 0) {
                        arg8[var22] = var40;
                        int var41 = var11.field177[var22] * var40 / 255;
                        if (var41 > 0) {
                           var37 -= var41;
                        }
                     }
                  } else if (arg3.field973) {
                     int var42 = this.field5938 - arg3.field983;
                     if (var42 > 0) {
                        arg8[var22] = var42;
                        if (arg8[var22] > 255) {
                           arg8[var22] = 255;
                        }
                     }
                  }

                  float var43 = (float)var38 * this.field5940 + (float)var36 * this.field5937 + (float)var37 * this.field5932 + this.field5936;
                  float var44 = (float)var38 * this.field5929 + (float)var36 * this.field5933 + (float)var37 * this.field5924 + this.field5944;
                  arg5[var22] = (int)((float)this.field5942.field10629 * var43 / (float)this.field5938) + arg4.field8091;
                  arg6[var22] = (int)((float)this.field5942.field10609 * var44 / (float)this.field5938) + arg4.field8096;
                  arg7[var22] = (int)var39;
               }
            }

            float var23 = (float)super.field4062;

            for(int var24 = 0; var24 < var11.field176; ++var24) {
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
                  arg4.field8082 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field8088 || var29 > arg4.field8088 || var30 > arg4.field8088;
                  if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                     int var34 = arg0 << super.field4065;
                     int var35 = arg1 << super.field4065;
                     if ((var11.field173[var25] & 16777215) != 0) {
                        if (var11.field168[var25] == var11.field168[var26] && var11.field168[var25] == var11.field168[var27] && var11.field175[var25] == var11.field175[var26] && var11.field175[var25] == var11.field175[var27]) {
                           arg4.method4052((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], (float)(var11.field174[var25] + var34) / (float)var11.field175[var25], (float)(var11.field174[var26] + var34) / (float)var11.field175[var26], (float)(var11.field174[var27] + var34) / (float)var11.field175[var27], (float)(var11.field171[var25] + var35) / (float)var11.field175[var25], (float)(var11.field171[var26] + var35) / (float)var11.field175[var26], (float)(var11.field171[var27] + var35) / (float)var11.field175[var27], var11.field173[var25], var11.field173[var26], var11.field173[var27], arg3.field978, arg8[var25], arg8[var26], arg8[var27], var11.field168[var25]);
                        } else {
                           arg4.method4048((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], (float)(var11.field174[var25] + var34) / var23, (float)(var11.field174[var26] + var34) / var23, (float)(var11.field174[var27] + var34) / var23, (float)(var11.field171[var25] + var35) / var23, (float)(var11.field171[var26] + var35) / var23, (float)(var11.field171[var27] + var35) / var23, var11.field173[var25], var11.field173[var26], var11.field173[var27], arg3.field978, arg8[var25], arg8[var26], arg8[var27], var11.field168[var25], var23 / (float)var11.field175[var25], var11.field168[var26], var23 / (float)var11.field175[var26], var11.field168[var27], var23 / (float)var11.field175[var27]);
                        }
                     }
                  } else {
                     arg4.method4041((float)var31, (float)var32, (float)var33, (float)var28, (float)var29, (float)var30, (float)arg7[var25], (float)arg7[var26], (float)arg7[var27], arg3.field978);
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V",
      line = 1642
   )
   public final void method1620(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
      boolean var15 = (this.field5928 & 32) == 0;
      if (this.field5926 == null && !var15) {
         this.field5926 = new class232[super.field4071][super.field4064];
         this.field5939 = new class496[super.field4071][super.field4064];
      } else if (this.field5943 == null && var15) {
         this.field5943 = new class15[super.field4071][super.field4064];
      } else if (this.field5930 != null) {
         throw new IllegalStateException();
      }

      if (arg2 != null && arg2.length != 0) {
         for(int var16 = 0; var16 < arg6.length; ++var16) {
            if (arg6[var16] == -1) {
               arg6[var16] = 0;
            } else {
               arg6[var16] = class130.field1665[class572.method4093(-84, arg6[var16]) & 65535] << 8 | 255;
            }
         }

         if (arg7 != null) {
            for(int var17 = 0; var17 < arg7.length; ++var17) {
               if (arg7[var17] == -1) {
                  arg7[var17] = 0;
               } else {
                  arg7[var17] = class130.field1665[class572.method4093(-87, arg7[var17]) & 65535] << 8 | 255;
               }
            }
         }

         if (var15) {
            class15 var18 = new class15();
            var18.field178 = (short)arg2.length;
            var18.field176 = (short)(arg2.length / 3);
            var18.field174 = new short[var18.field178];
            var18.field169 = new short[var18.field178];
            var18.field171 = new short[var18.field178];
            var18.field173 = new int[var18.field178];
            var18.field168 = new short[var18.field178];
            var18.field175 = new short[var18.field178];
            var18.field172 = new byte[var18.field178];
            if (arg5 != null) {
               var18.field177 = new short[var18.field178];
            }

            for(int var19 = 0; var19 < var18.field178; ++var19) {
               int var22 = arg2[var19];
               int var23 = arg4[var19];
               boolean var24 = false;
               int var25;
               if (var22 == 0 && var23 == 0) {
                  var25 = this.field5935[arg0][arg1] - this.field5945[arg0][arg1];
               } else if (var22 == 0 && super.field4062 == var23) {
                  var25 = this.field5935[arg0][arg1 + 1] - this.field5945[arg0][arg1 + 1];
               } else if (super.field4062 == var22 && super.field4062 == var23) {
                  var25 = this.field5935[arg0 + 1][arg1 + 1] - this.field5945[arg0 + 1][arg1 + 1];
               } else if (super.field4062 == var22 && var23 == 0) {
                  var25 = this.field5935[arg0 + 1][arg1] - this.field5945[arg0 + 1][arg1];
               } else {
                  int var26 = (this.field5935[arg0 + 1][arg1] - this.field5945[arg0 + 1][arg1]) * var22 + (this.field5935[arg0][arg1] - this.field5945[arg0][arg1]) * (super.field4062 - var22);
                  int var27 = (this.field5935[arg0 + 1][arg1 + 1] - this.field5945[arg0 + 1][arg1 + 1]) * var22 + (this.field5935[arg0][arg1 + 1] - this.field5945[arg0][arg1 + 1]) * (super.field4062 - var22);
                  var25 = (super.field4062 - var23) * var26 + var23 * var27 >> super.field4065 * 2;
               }

               int var28 = (arg0 << super.field4065) + var22;
               int var29 = (arg1 << super.field4065) + var23;
               var18.field174[var19] = (short)var22;
               var18.field171[var19] = (short)var23;
               var18.field169[var19] = (short)(this.method2220(var29, var28, 94) + (arg3 != null ? arg3[var19] : 0));
               if (var25 < 0) {
                  var25 = 0;
               }

               if (arg6[var19] == 0) {
                  var18.field173[var19] = 0;
                  if (arg7 != null) {
                     var18.field172[var19] = (byte)var25;
                  }
               } else {
                  int var30 = 0;
                  if (arg5 != null) {
                     short var31 = var18.field177[var19] = (short)arg5[var19];
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
                  if (arg8[var19] != -1 && this.method3083(this.field5942.field802.method1354(arg8[var19], (byte)-109).field4308)) {
                     var32 = -1694498816;
                  }

                  var18.field173[var19] = var32 | class259.method1989(10555, method3085(arg6[var19] >> 8, var25), var30, arg10);
                  if (arg7 != null) {
                     var18.field172[var19] = (byte)var25;
                  }
               }

               var18.field168[var19] = (short)arg8[var19];
               var18.field175[var19] = (short)arg9[var19];
            }

            if (arg7 != null) {
               var18.field170 = new int[var18.field176];
            }

            for(int var20 = 0; var20 < var18.field176; ++var20) {
               int var21 = var20 * 3;
               if (arg7 != null && arg7[var21] != 0) {
                  var18.field170[var20] = -16777216 | arg7[var21] >> 8;
               }
            }

            this.field5943[arg0][arg1] = var18;
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
                  } else if (arg2[var38] == super.field4062 && arg4[var38] == 0) {
                     if (var35 != -1 && arg6[var35] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var35 = var38;
                  } else if (arg2[var38] == super.field4062 && arg4[var38] == super.field4062) {
                     if (var36 != -1 && arg6[var36] != arg6[var38]) {
                        var33 = false;
                        break;
                     }

                     var36 = var38;
                  } else if (arg2[var38] == 0 && arg4[var38] == super.field4062) {
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
                        if (arg2[var40] != arg2[0] && arg2[0] + super.field4062 != arg2[var40] && arg2[0] - super.field4062 != arg2[var40]) {
                           var33 = false;
                           break;
                        }

                        if (arg4[var40] != arg4[0] && arg4[0] + super.field4062 != arg4[var40] && arg4[0] - super.field4062 != arg4[var40]) {
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
               class232 var41 = new class232();
               int var42 = arg6[0];
               int var43 = arg8[0];
               if (arg7 != null) {
                  var41.field3250 = arg7[0] >> 8;
                  if (var42 == 0) {
                     var41.field3258 = (byte)(var41.field3258 | 2);
                  }
               } else if (var42 == 0) {
                  return;
               }

               if (super.field4066[arg0 + 1][arg1] == super.field4066[arg0][arg1] && super.field4066[arg0 + 1][arg1 + 1] == super.field4066[arg0][arg1] && super.field4066[arg0][arg1 + 1] == super.field4066[arg0][arg1]) {
                  var41.field3258 = (byte)(var41.field3258 | 1);
               }

               if (var43 != -1 && (var41.field3258 & 2) == 0 && !this.field5942.field802.method1354(var43, (byte)-109).field4328) {
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

                  var41.field3253 = class259.method1989(10555, method3085(arg6[var34] >> 8, this.field5935[arg0][arg1] - this.field5945[arg0][arg1]), var44, arg10);
                  if (var41.field3250 != 0) {
                     var41.field3253 |= 255 - (this.field5935[arg0][arg1] - this.field5945[arg0][arg1]) << 25;
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

                  var41.field3257 = class259.method1989(10555, method3085(arg6[var35] >> 8, this.field5935[arg0 + 1][arg1] - this.field5945[arg0 + 1][arg1]), var45, arg10);
                  if (var41.field3250 != 0) {
                     var41.field3257 |= 255 - (this.field5935[arg0 + 1][arg1] - this.field5945[arg0 + 1][arg1]) << 25;
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

                  var41.field3251 = class259.method1989(10555, method3085(arg6[var36] >> 8, this.field5935[arg0 + 1][arg1 + 1] - this.field5945[arg0 + 1][arg1 + 1]), var46, arg10);
                  if (var41.field3250 != 0) {
                     var41.field3251 |= 255 - (this.field5935[arg0 + 1][arg1 + 1] - this.field5945[arg0 + 1][arg1 + 1]) << 25;
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

                  var41.field3254 = class259.method1989(10555, method3085(arg6[var37] >> 8, this.field5935[arg0][arg1 + 1] - this.field5945[arg0][arg1 + 1]), var47, arg10);
                  var41.field3248 = (short)var43;
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

                  var41.field3253 = class259.method1989(10555, method3085(arg6[var34] >> 8, this.field5935[arg0][arg1] - this.field5945[arg0][arg1]), var48, arg10);
                  if (var41.field3250 != 0) {
                     var41.field3253 |= 255 - (this.field5935[arg0][arg1] - this.field5945[arg0][arg1]) << 25;
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

                  var41.field3257 = class259.method1989(10555, method3085(arg6[var35] >> 8, this.field5935[arg0 + 1][arg1] - this.field5945[arg0 + 1][arg1]), var49, arg10);
                  if (var41.field3250 != 0) {
                     var41.field3257 |= 255 - (this.field5935[arg0 + 1][arg1] - this.field5945[arg0 + 1][arg1]) << 25;
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

                  var41.field3251 = class259.method1989(10555, method3085(arg6[var36] >> 8, this.field5935[arg0 + 1][arg1 + 1] - this.field5945[arg0 + 1][arg1 + 1]), var50, arg10);
                  if (var41.field3250 != 0) {
                     var41.field3251 |= 255 - (this.field5935[arg0 + 1][arg1 + 1] - this.field5945[arg0 + 1][arg1 + 1]) << 25;
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

                  var41.field3254 = class259.method1989(10555, method3085(arg6[var37] >> 8, this.field5935[arg0][arg1 + 1] - this.field5945[arg0][arg1 + 1]), var51, arg10);
                  if (var41.field3250 != 0) {
                     var41.field3254 |= 255 - (this.field5935[arg0][arg1 + 1] - this.field5945[arg0][arg1 + 1]) << 25;
                  }

                  var41.field3248 = -1;
               }

               if (arg5 != null) {
                  var41.field3252 = (short)arg5[var36];
                  var41.field3249 = (short)arg5[var37];
                  var41.field3255 = (short)arg5[var35];
                  var41.field3256 = (short)arg5[var34];
               }

               this.field5926[arg0][arg1] = var41;
            } else {
               class496 var52 = new class496();
               var52.field7195 = (short)arg2.length;
               var52.field7191 = (short)(arg2.length / 3);
               var52.field7193 = new short[var52.field7195];
               var52.field7199 = new short[var52.field7195];
               var52.field7189 = new short[var52.field7195];
               var52.field7197 = new int[var52.field7195];
               if (arg5 != null) {
                  var52.field7196 = new short[var52.field7195];
               }

               for(int var53 = 0; var53 < var52.field7195; ++var53) {
                  int var68 = arg2[var53];
                  int var69 = arg4[var53];
                  boolean var70 = false;
                  int var71;
                  if (var68 == 0 && var69 == 0) {
                     var71 = this.field5935[arg0][arg1] - this.field5945[arg0][arg1];
                  } else if (var68 == 0 && super.field4062 == var69) {
                     var71 = this.field5935[arg0][arg1 + 1] - this.field5945[arg0][arg1 + 1];
                  } else if (super.field4062 == var68 && super.field4062 == var69) {
                     var71 = this.field5935[arg0 + 1][arg1 + 1] - this.field5945[arg0 + 1][arg1 + 1];
                  } else if (super.field4062 == var68 && var69 == 0) {
                     var71 = this.field5935[arg0 + 1][arg1] - this.field5945[arg0 + 1][arg1];
                  } else {
                     int var72 = (this.field5935[arg0 + 1][arg1] - this.field5945[arg0 + 1][arg1]) * var68 + (this.field5935[arg0][arg1] - this.field5945[arg0][arg1]) * (super.field4062 - var68);
                     int var73 = (this.field5935[arg0 + 1][arg1 + 1] - this.field5945[arg0 + 1][arg1 + 1]) * var68 + (this.field5935[arg0][arg1 + 1] - this.field5945[arg0][arg1 + 1]) * (super.field4062 - var68);
                     var71 = (super.field4062 - var69) * var72 + var69 * var73 >> super.field4065 * 2;
                  }

                  int var74 = (arg0 << super.field4065) + var68;
                  int var75 = (arg1 << super.field4065) + var69;
                  var52.field7193[var53] = (short)var68;
                  var52.field7189[var53] = (short)var69;
                  var52.field7199[var53] = (short)(this.method2220(var75, var74, -79) + (arg3 != null ? arg3[var53] : 0));
                  if (var71 < 0) {
                     var71 = 0;
                  }

                  if (arg6[var53] == 0) {
                     if (arg7 != null) {
                        var52.field7197[var53] = var71 << 25;
                     } else {
                        var52.field7197[var53] = 0;
                     }
                  } else {
                     int var76 = 0;
                     if (arg5 != null) {
                        short var77 = var52.field7196[var53] = (short)arg5[var53];
                        if (arg11 != 0) {
                           var76 = var77 * 255 / arg11;
                           if (var76 < 0) {
                              var76 = 0;
                           } else if (var76 > 255) {
                              var76 = 255;
                           }
                        }
                     }

                     var52.field7197[var53] = class259.method1989(10555, method3085(arg6[var53] >> 8, var71), var76, arg10);
                     if (arg7 != null) {
                        var52.field7197[var53] |= var71 << 25;
                     }
                  }
               }

               boolean var54 = false;

               for(int var55 = 0; var55 < var52.field7191; ++var55) {
                  if (arg8[var55 * 3] != -1 && !this.field5942.field802.method1354(arg8[var55 * 3], (byte)-109).field4328) {
                     var54 = true;
                  }
               }

               if (arg7 != null) {
                  var52.field7194 = new int[var52.field7191];
               }

               if (var54) {
                  var52.field7192 = new short[var52.field7191];
                  var52.field7190 = new short[var52.field7191];
               }

               for(int var56 = 0; var56 < var52.field7191; ++var56) {
                  int var57 = var56 * 3;
                  if (arg7 != null && arg7[var57] != 0) {
                     var52.field7194[var56] = arg7[var57] >> 8;
                  }

                  if (var54) {
                     int var58 = var57 + 1;
                     int var59 = var58 + 1;
                     boolean var60 = false;
                     boolean var61 = true;
                     int var62 = arg8[var57];
                     if (var62 != -1 && !this.field5942.field802.method1354(var62, (byte)-109).field4328) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     int var63 = arg8[var58];
                     if (var63 != -1 && !this.field5942.field802.method1354(var63, (byte)-109).field4328) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     int var64 = arg8[var59];
                     if (var64 != -1 && !this.field5942.field802.method1354(var64, (byte)-109).field4328) {
                        var60 = true;
                     } else {
                        var61 = false;
                     }

                     if (var61) {
                        var52.field7192[var56] = (short)var64;
                        var52.field7190[var56] = (short)arg9[var57];
                     } else {
                        if (var60) {
                           int var65 = arg8[var57];
                           if (var65 != -1 && !this.field5942.field802.method1354(var65, (byte)-109).field4328) {
                              var52.field7197[var57] = class130.field1665[class572.method4093(-63, this.field5942.field802.method1354(var65, (byte)-109).field4314 & 65535) & 65535];
                           }

                           int var66 = arg8[var58];
                           if (var66 != -1 && !this.field5942.field802.method1354(var66, (byte)-109).field4328) {
                              var52.field7197[var58] = class130.field1665[class572.method4093(-25, this.field5942.field802.method1354(var66, (byte)-109).field4314 & 65535) & 65535];
                           }

                           int var67 = arg8[var59];
                           if (var67 != -1 && !this.field5942.field802.method1354(var67, (byte)-109).field4328) {
                              var52.field7197[var59] = class130.field1665[class572.method4093(-76, this.field5942.field802.method1354(var67, (byte)-109).field4314 & 65535) & 65535];
                           }
                        }

                        var52.field7192[var56] = -1;
                     }
                  }
               }

               this.field5939[arg0][arg1] = var52;
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(IILac;[I[I[I[II)V",
      line = 2342
   )
   private final void method3088(int arg0, int arg1, class567 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
      class334 var9 = this.field5930[arg0][arg1];
      if (var9 != null) {
         if ((var9.field4553 & 2) == 0) {
            if (arg7 != 0) {
               if ((var9.field4553 & 4) != 0) {
                  if ((arg7 & 1) != 0) {
                     return;
                  }
               } else if ((arg7 & 2) != 0) {
                  return;
               }
            }

            int var10 = super.field4062 * arg0;
            int var11 = super.field4062 + var10;
            int var12 = super.field4062 * arg1;
            int var13 = super.field4062 + var12;
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
            if ((var9.field4553 & 1) != 0) {
               int var14 = super.field4066[arg0][arg1];
               float var15 = (float)var14 * this.field5927;
               if (this.field5938 == -1) {
                  var16 = (float)var12 * this.field5931 + (float)var10 * this.field5925 + var15 + this.field5934;
                  if (var16 <= (float)this.field5942.field10624) {
                     return;
                  }

                  var17 = (float)var12 * this.field5931 + (float)var11 * this.field5925 + var15 + this.field5934;
                  if (var17 <= (float)this.field5942.field10624) {
                     return;
                  }

                  var18 = (float)var13 * this.field5931 + (float)var11 * this.field5925 + var15 + this.field5934;
                  if (var18 <= (float)this.field5942.field10624) {
                     return;
                  }

                  var19 = (float)var13 * this.field5931 + (float)var10 * this.field5925 + var15 + this.field5934;
                  if (var19 <= (float)this.field5942.field10624) {
                     return;
                  }
               } else {
                  var16 = (float)var12 * this.field5931 + (float)var10 * this.field5925 + var15 + this.field5934;
                  var17 = (float)var12 * this.field5931 + (float)var11 * this.field5925 + var15 + this.field5934;
                  var18 = (float)var13 * this.field5931 + (float)var11 * this.field5925 + var15 + this.field5934;
                  var19 = (float)var13 * this.field5931 + (float)var10 * this.field5925 + var15 + this.field5934;
               }

               float var20 = (float)var14 * this.field5932;
               float var21 = (float)var14 * this.field5924;
               if (this.field5938 == -1) {
                  float var22 = (float)var12 * this.field5940 + (float)var10 * this.field5937 + var20 + this.field5936;
                  var23 = (int)((float)this.field5942.field10629 * var22 / var16) + arg2.field8091;
                  float var24 = (float)var12 * this.field5929 + (float)var10 * this.field5933 + var21 + this.field5944;
                  var25 = (int)((float)this.field5942.field10609 * var24 / var16) + arg2.field8096;
                  float var26 = (float)var12 * this.field5940 + (float)var11 * this.field5937 + var20 + this.field5936;
                  var27 = (int)((float)this.field5942.field10629 * var26 / var17) + arg2.field8091;
                  float var28 = (float)var12 * this.field5929 + (float)var11 * this.field5933 + var21 + this.field5944;
                  var29 = (int)((float)this.field5942.field10609 * var28 / var17) + arg2.field8096;
                  float var30 = (float)var13 * this.field5940 + (float)var11 * this.field5937 + var20 + this.field5936;
                  var31 = (int)((float)this.field5942.field10629 * var30 / var18) + arg2.field8091;
                  float var32 = (float)var13 * this.field5929 + (float)var11 * this.field5933 + var21 + this.field5944;
                  var33 = (int)((float)this.field5942.field10609 * var32 / var18) + arg2.field8096;
                  float var34 = (float)var13 * this.field5940 + (float)var10 * this.field5937 + var20 + this.field5936;
                  var35 = (int)((float)this.field5942.field10629 * var34 / var19) + arg2.field8091;
                  float var36 = (float)var13 * this.field5929 + (float)var10 * this.field5933 + var21 + this.field5944;
                  var37 = (int)((float)this.field5942.field10609 * var36 / var19) + arg2.field8096;
               } else {
                  float var38 = (float)var12 * this.field5940 + (float)var10 * this.field5937 + var20 + this.field5936;
                  var23 = (int)((float)this.field5942.field10629 * var38 / (float)this.field5938) + arg2.field8091;
                  float var39 = (float)var12 * this.field5929 + (float)var10 * this.field5933 + var21 + this.field5944;
                  var25 = (int)((float)this.field5942.field10609 * var39 / (float)this.field5938) + arg2.field8096;
                  float var40 = (float)var12 * this.field5940 + (float)var11 * this.field5937 + var20 + this.field5936;
                  var27 = (int)((float)this.field5942.field10629 * var40 / (float)this.field5938) + arg2.field8091;
                  float var41 = (float)var12 * this.field5929 + (float)var11 * this.field5933 + var21 + this.field5944;
                  var29 = (int)((float)this.field5942.field10609 * var41 / (float)this.field5938) + arg2.field8096;
                  float var42 = (float)var13 * this.field5940 + (float)var11 * this.field5937 + var20 + this.field5936;
                  var31 = (int)((float)this.field5942.field10629 * var42 / (float)this.field5938) + arg2.field8091;
                  float var43 = (float)var13 * this.field5929 + (float)var11 * this.field5933 + var21 + this.field5944;
                  var33 = (int)((float)this.field5942.field10609 * var43 / (float)this.field5938) + arg2.field8096;
                  float var44 = (float)var13 * this.field5940 + (float)var10 * this.field5937 + var20 + this.field5936;
                  var35 = (int)((float)this.field5942.field10629 * var44 / (float)this.field5938) + arg2.field8091;
                  float var45 = (float)var13 * this.field5929 + (float)var10 * this.field5933 + var21 + this.field5944;
                  var37 = (int)((float)this.field5942.field10609 * var45 / (float)this.field5938) + arg2.field8096;
               }
            } else {
               int var46 = super.field4066[arg0][arg1];
               int var47 = super.field4066[arg0 + 1][arg1];
               int var48 = super.field4066[arg0 + 1][arg1 + 1];
               int var49 = super.field4066[arg0][arg1 + 1];
               if (this.field5938 == -1) {
                  var16 = (float)var12 * this.field5931 + (float)var10 * this.field5925 + (float)var46 * this.field5927 + this.field5934;
                  if (var16 <= (float)this.field5942.field10624) {
                     return;
                  }

                  var17 = (float)var12 * this.field5931 + (float)var11 * this.field5925 + (float)var47 * this.field5927 + this.field5934;
                  if (var17 <= (float)this.field5942.field10624) {
                     return;
                  }

                  var18 = (float)var13 * this.field5931 + (float)var11 * this.field5925 + (float)var48 * this.field5927 + this.field5934;
                  if (var18 <= (float)this.field5942.field10624) {
                     return;
                  }

                  var19 = (float)var13 * this.field5931 + (float)var10 * this.field5925 + (float)var49 * this.field5927 + this.field5934;
                  if (var19 <= (float)this.field5942.field10624) {
                     return;
                  }

                  float var50 = (float)var12 * this.field5940 + (float)var10 * this.field5937 + (float)var46 * this.field5932 + this.field5936;
                  var23 = (int)((float)this.field5942.field10629 * var50 / var16) + arg2.field8091;
                  float var51 = (float)var12 * this.field5929 + (float)var10 * this.field5933 + (float)var46 * this.field5924 + this.field5944;
                  var25 = (int)((float)this.field5942.field10609 * var51 / var16) + arg2.field8096;
                  float var52 = (float)var12 * this.field5940 + (float)var11 * this.field5937 + (float)var47 * this.field5932 + this.field5936;
                  var27 = (int)((float)this.field5942.field10629 * var52 / var17) + arg2.field8091;
                  float var53 = (float)var12 * this.field5929 + (float)var11 * this.field5933 + (float)var47 * this.field5924 + this.field5944;
                  var29 = (int)((float)this.field5942.field10609 * var53 / var17) + arg2.field8096;
                  float var54 = (float)var13 * this.field5940 + (float)var11 * this.field5937 + (float)var48 * this.field5932 + this.field5936;
                  var31 = (int)((float)this.field5942.field10629 * var54 / var18) + arg2.field8091;
                  float var55 = (float)var13 * this.field5929 + (float)var11 * this.field5933 + (float)var48 * this.field5924 + this.field5944;
                  var33 = (int)((float)this.field5942.field10609 * var55 / var18) + arg2.field8096;
                  float var56 = (float)var13 * this.field5940 + (float)var10 * this.field5937 + (float)var49 * this.field5932 + this.field5936;
                  var35 = (int)((float)this.field5942.field10629 * var56 / var19) + arg2.field8091;
                  float var57 = (float)var13 * this.field5929 + (float)var10 * this.field5933 + (float)var49 * this.field5924 + this.field5944;
                  var37 = (int)((float)this.field5942.field10609 * var57 / var19) + arg2.field8096;
               } else {
                  var16 = (float)var12 * this.field5931 + (float)var10 * this.field5925 + (float)var46 * this.field5927 + this.field5934;
                  var17 = (float)var12 * this.field5931 + (float)var11 * this.field5925 + (float)var47 * this.field5927 + this.field5934;
                  var18 = (float)var13 * this.field5931 + (float)var11 * this.field5925 + (float)var48 * this.field5927 + this.field5934;
                  var19 = (float)var13 * this.field5931 + (float)var10 * this.field5925 + (float)var49 * this.field5927 + this.field5934;
                  float var58 = (float)var12 * this.field5940 + (float)var10 * this.field5937 + (float)var46 * this.field5932 + this.field5936;
                  var23 = (int)((float)this.field5942.field10629 * var58 / (float)this.field5938) + arg2.field8091;
                  float var59 = (float)var12 * this.field5929 + (float)var10 * this.field5933 + (float)var46 * this.field5924 + this.field5944;
                  var25 = (int)((float)this.field5942.field10609 * var59 / (float)this.field5938) + arg2.field8096;
                  float var60 = (float)var12 * this.field5940 + (float)var11 * this.field5937 + (float)var47 * this.field5932 + this.field5936;
                  var27 = (int)((float)this.field5942.field10629 * var60 / (float)this.field5938) + arg2.field8091;
                  float var61 = (float)var12 * this.field5929 + (float)var11 * this.field5933 + (float)var47 * this.field5924 + this.field5944;
                  var29 = (int)((float)this.field5942.field10609 * var61 / (float)this.field5938) + arg2.field8096;
                  float var62 = (float)var13 * this.field5940 + (float)var11 * this.field5937 + (float)var48 * this.field5932 + this.field5936;
                  var31 = (int)((float)this.field5942.field10629 * var62 / (float)this.field5938) + arg2.field8091;
                  float var63 = (float)var13 * this.field5929 + (float)var11 * this.field5933 + (float)var48 * this.field5924 + this.field5944;
                  var33 = (int)((float)this.field5942.field10609 * var63 / (float)this.field5938) + arg2.field8096;
                  float var64 = (float)var13 * this.field5940 + (float)var10 * this.field5937 + (float)var49 * this.field5932 + this.field5936;
                  var35 = (int)((float)this.field5942.field10629 * var64 / (float)this.field5938) + arg2.field8091;
                  float var65 = (float)var13 * this.field5929 + (float)var10 * this.field5933 + (float)var49 * this.field5924 + this.field5944;
                  var37 = (int)((float)this.field5942.field10609 * var65 / (float)this.field5938) + arg2.field8096;
               }
            }

            if (this.field5938 == -1) {
               if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                  arg2.field8082 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field8088 || var35 > arg2.field8088 || var27 > arg2.field8088;
                  if (var9.field4551 >= 0) {
                     arg2.method4052((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class130.field1665[var9.field4552 & 65535] & 16777215, -16777216 | class130.field1665[var9.field4554 & 65535] & 16777215, -16777216 | class130.field1665[var9.field4550 & 65535] & 16777215, 0, 0, 0, 0, var9.field4551);
                  } else {
                     arg2.method4047((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, (float)((int)var18), (float)((int)var19), (float)((int)var17), (float)(var9.field4552 & 65535), (float)(var9.field4554 & 65535), (float)(var9.field4550 & 65535));
                  }
               }

               if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                  arg2.field8082 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field8088 || var27 > arg2.field8088 || var35 > arg2.field8088;
                  if (var9.field4551 >= 0) {
                     arg2.method4052((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class130.field1665[var9.field4549 & 65535] & 16777215, -16777216 | class130.field1665[var9.field4550 & 65535] & 16777215, -16777216 | class130.field1665[var9.field4554 & 65535] & 16777215, 0, 0, 0, 0, var9.field4551);
                     return;
                  }

                  arg2.method4047((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, (float)((int)var16), (float)((int)var17), (float)((int)var19), (float)(var9.field4549 & 65535), (float)(var9.field4550 & 65535), (float)(var9.field4554 & 65535));
                  return;
               }
            } else {
               if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                  arg2.field8082 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field8088 || var35 > arg2.field8088 || var27 > arg2.field8088;
                  if (var9.field4551 >= 0) {
                     arg2.method4052((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class130.field1665[var9.field4552 & 65535] & 16777215, -16777216 | class130.field1665[var9.field4554 & 65535] & 16777215, -16777216 | class130.field1665[var9.field4550 & 65535] & 16777215, 0, 0, 0, 0, var9.field4551);
                  } else {
                     arg2.method4047((float)var33, (float)var37, (float)var29, (float)var31, (float)var35, (float)var27, (float)((int)var18), (float)((int)var19), (float)((int)var17), (float)(var9.field4552 & 65535), (float)(var9.field4554 & 65535), (float)(var9.field4550 & 65535));
                  }
               }

               if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                  arg2.field8082 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field8088 || var27 > arg2.field8088 || var35 > arg2.field8088;
                  if (var9.field4551 >= 0) {
                     arg2.method4052((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class130.field1665[var9.field4549 & 65535] & 16777215, -16777216 | class130.field1665[var9.field4550 & 65535] & 16777215, -16777216 | class130.field1665[var9.field4554 & 65535] & 16777215, 0, 0, 0, 0, var9.field4551);
                     return;
                  }

                  arg2.method4047((float)var25, (float)var29, (float)var37, (float)var23, (float)var27, (float)var35, (float)((int)var16), (float)((int)var17), (float)((int)var19), (float)(var9.field4549 & 65535), (float)(var9.field4550 & 65535), (float)(var9.field4554 & 65535));
               }
            }

         }
      } else {
         class6 var66 = this.field5941[arg0][arg1];
         if (var66 != null) {
            if (arg7 != 0) {
               if ((var66.field70 & 4) != 0) {
                  if ((arg7 & 1) != 0) {
                     return;
                  }
               } else if ((arg7 & 2) != 0) {
                  return;
               }
            }

            if (this.field5938 == -1) {
               for(int var67 = 0; var67 < var66.field59; ++var67) {
                  int var68 = (arg0 << super.field4065) + var66.field64[var67];
                  short var69 = var66.field63[var67];
                  int var70 = (arg1 << super.field4065) + var66.field58[var67];
                  float var71 = (float)var70 * this.field5931 + (float)var68 * this.field5925 + (float)var69 * this.field5927 + this.field5934;
                  if (var71 <= (float)this.field5942.field10624) {
                     return;
                  }

                  float var72 = (float)var70 * this.field5940 + (float)var68 * this.field5937 + (float)var69 * this.field5932 + this.field5936;
                  float var73 = (float)var70 * this.field5929 + (float)var68 * this.field5933 + (float)var69 * this.field5924 + this.field5944;
                  arg3[var67] = (int)((float)this.field5942.field10629 * var72 / var71) + arg2.field8091;
                  arg4[var67] = (int)((float)this.field5942.field10609 * var73 / var71) + arg2.field8096;
                  arg5[var67] = (int)var71;
               }
            } else {
               for(int var74 = 0; var74 < var66.field59; ++var74) {
                  int var110 = (arg0 << super.field4065) + var66.field64[var74];
                  short var111 = var66.field63[var74];
                  int var112 = (arg1 << super.field4065) + var66.field58[var74];
                  float var113 = (float)var112 * this.field5931 + (float)var110 * this.field5925 + (float)var111 * this.field5927 + this.field5934;
                  float var114 = (float)var112 * this.field5940 + (float)var110 * this.field5937 + (float)var111 * this.field5932 + this.field5936;
                  float var115 = (float)var112 * this.field5929 + (float)var110 * this.field5933 + (float)var111 * this.field5924 + this.field5944;
                  arg3[var74] = (int)((float)this.field5942.field10629 * var114 / (float)this.field5938) + arg2.field8091;
                  arg4[var74] = (int)((float)this.field5942.field10609 * var115 / (float)this.field5938) + arg2.field8096;
                  arg5[var74] = (int)var113;
               }
            }

            if (var66.field65 != null) {
               if (this.field5938 == -1) {
                  for(int var75 = 0; var75 < var66.field61; ++var75) {
                     short var76 = var66.field62[var75];
                     short var77 = var66.field69[var75];
                     short var78 = var66.field68[var75];
                     int var79 = arg3[var76];
                     int var80 = arg3[var77];
                     int var81 = arg3[var78];
                     int var82 = arg4[var76];
                     int var83 = arg4[var77];
                     int var84 = arg4[var78];
                     if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                        arg2.field8082 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field8088 || var80 > arg2.field8088 || var81 > arg2.field8088;
                        short var85 = var66.field65[var75];
                        if (var85 != -1) {
                           arg2.method4052((float)var82, (float)var83, (float)var84, (float)var79, (float)var80, (float)var81, (float)arg5[var76], (float)arg5[var77], (float)arg5[var78], (float)var66.field64[var76] / (float)super.field4062, (float)var66.field64[var77] / (float)super.field4062, (float)var66.field64[var78] / (float)super.field4062, (float)var66.field58[var76] / (float)super.field4062, (float)var66.field58[var77] / (float)super.field4062, (float)var66.field58[var78] / (float)super.field4062, -16777216 | class130.field1665[var66.field67[var76] & 65535] & 16777215, -16777216 | class130.field1665[var66.field67[var77] & 65535] & 16777215, -16777216 | class130.field1665[var66.field67[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                        } else {
                           int var86 = var66.field71[var75];
                           if (var86 != -1) {
                              arg2.method4047((float)var82, (float)var83, (float)var84, (float)var79, (float)var80, (float)var81, (float)arg5[var76], (float)arg5[var77], (float)arg5[var78], (float)class81.method734(1, var86, var66.field67[var76]), (float)class81.method734(1, var86, var66.field67[var77]), (float)class81.method734(1, var86, var66.field67[var78]));
                           }
                        }
                     }
                  }

                  return;
               }

               for(int var87 = 0; var87 < var66.field61; ++var87) {
                  short var88 = var66.field62[var87];
                  short var89 = var66.field69[var87];
                  short var90 = var66.field68[var87];
                  int var91 = arg3[var88];
                  int var92 = arg3[var89];
                  int var93 = arg3[var90];
                  int var94 = arg4[var88];
                  int var95 = arg4[var89];
                  int var96 = arg4[var90];
                  if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                     arg2.field8082 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field8088 || var92 > arg2.field8088 || var93 > arg2.field8088;
                     short var97 = var66.field65[var87];
                     if (var97 != -1) {
                        arg2.method4052((float)var94, (float)var95, (float)var96, (float)var91, (float)var92, (float)var93, (float)arg5[var88], (float)arg5[var89], (float)arg5[var90], (float)var66.field64[var88] / (float)super.field4062, (float)var66.field64[var89] / (float)super.field4062, (float)var66.field64[var90] / (float)super.field4062, (float)var66.field58[var88] / (float)super.field4062, (float)var66.field58[var89] / (float)super.field4062, (float)var66.field58[var90] / (float)super.field4062, -16777216 | class130.field1665[var66.field67[var88] & 65535] & 16777215, -16777216 | class130.field1665[var66.field67[var89] & 65535] & 16777215, -16777216 | class130.field1665[var66.field67[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                     } else {
                        int var98 = var66.field71[var87];
                        if (var98 != -1) {
                           arg2.method4047((float)var94, (float)var95, (float)var96, (float)var91, (float)var92, (float)var93, (float)arg5[var88], (float)arg5[var89], (float)arg5[var90], (float)class81.method734(1, var98, var66.field67[var88]), (float)class81.method734(1, var98, var66.field67[var89]), (float)class81.method734(1, var98, var66.field67[var90]));
                        }
                     }
                  }
               }

               return;
            }

            for(int var99 = 0; var99 < var66.field61; ++var99) {
               short var100 = var66.field62[var99];
               short var101 = var66.field69[var99];
               short var102 = var66.field68[var99];
               int var103 = arg3[var100];
               int var104 = arg3[var101];
               int var105 = arg3[var102];
               int var106 = arg4[var100];
               int var107 = arg4[var101];
               int var108 = arg4[var102];
               if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                  int var109 = var66.field71[var99];
                  if (var109 != -1) {
                     arg2.field8082 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field8088 || var104 > arg2.field8088 || var105 > arg2.field8088;
                     arg2.method4047((float)var106, (float)var107, (float)var108, (float)var103, (float)var104, (float)var105, (float)arg5[var100], (float)arg5[var101], (float)arg5[var102], (float)class81.method734(1, var109, var66.field67[var100]), (float)class81.method734(1, var109, var66.field67[var101]), (float)class81.method734(1, var109, var66.field67[var102]));
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(IIIIIII[[ZLnaa;Lac;[I[I)V",
      line = 2821
   )
   private final void method3089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class79 arg8, class567 arg9, int[] arg10, int[] arg11) {
      int var13 = (arg6 - arg4) * arg2 / 256;
      int var14 = arg2 >> 8;
      boolean var15 = arg8.field984;
      this.field5942.method493(false);
      arg9.field8086 = false;
      arg9.field8095 = false;
      int var16 = arg0;
      int var17 = arg1 + var13;

      for(int var18 = arg3; var18 < arg5; ++var18) {
         for(int var19 = arg4; var19 < arg6; ++var19) {
            if (arg7[var18 - arg3][var19 - arg4]) {
               if (this.field5930[var18][var19] != null) {
                  class334 var20 = this.field5930[var18][var19];
                  if (var20.field4551 != -1 && (var20.field4553 & 2) == 0 && var20.field4548 == -1) {
                     int var21 = this.field5942.method5284(var20.field4551);
                     arg9.method4047((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)class81.method734(1, var21, var20.field4552 & 65535), (float)class81.method734(1, var21, var20.field4554 & 65535), (float)class81.method734(1, var21, var20.field4550 & 65535));
                     arg9.method4047((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)class81.method734(1, var21, var20.field4549 & 65535), (float)class81.method734(1, var21, var20.field4550 & 65535), (float)class81.method734(1, var21, var20.field4554 & 65535));
                  } else if (var20.field4548 == -1) {
                     arg9.method4047((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)(var20.field4552 & 65535), (float)(var20.field4554 & 65535), (float)(var20.field4550 & 65535));
                     arg9.method4047((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)(var20.field4549 & 65535), (float)(var20.field4550 & 65535), (float)(var20.field4554 & 65535));
                  } else {
                     int var22 = var20.field4548;
                     arg9.method4047((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var14 + var16), (float)var16, (float)(var14 + var16), 100.0F, 100.0F, 100.0F, (float)var22, (float)var22, (float)var22);
                     arg9.method4047((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var14 + var16), (float)var16, 100.0F, 100.0F, 100.0F, (float)var22, (float)var22, (float)var22);
                  }
               } else if (this.field5941[var18][var19] != null) {
                  class6 var23 = this.field5941[var18][var19];

                  for(int var24 = 0; var24 < var23.field59; ++var24) {
                     arg10[var24] = var23.field64[var24] * var14 / super.field4062 + var16;
                     arg11[var24] = var17 - var23.field58[var24] * var14 / super.field4062;
                  }

                  for(int var25 = 0; var25 < var23.field61; ++var25) {
                     short var26 = var23.field62[var25];
                     short var27 = var23.field69[var25];
                     short var28 = var23.field68[var25];
                     int var29 = arg10[var26];
                     int var30 = arg10[var27];
                     int var31 = arg10[var28];
                     int var32 = arg11[var26];
                     int var33 = arg11[var27];
                     int var34 = arg11[var28];
                     if (var23.field66 != null && var23.field66[var25] != -1) {
                        int var35 = var23.field66[var25];
                        arg9.method4047((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class81.method734(1, var35, var23.field67[var26]), (float)class81.method734(1, var35, var23.field67[var27]), (float)class81.method734(1, var35, var23.field67[var28]));
                     } else if (var23.field65 != null && var23.field65[var25] != -1) {
                        int var36 = this.field5942.method5284(var23.field65[var25]);
                        arg9.method4047((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class81.method734(1, var36, var23.field67[var26]), (float)class81.method734(1, var36, var23.field67[var27]), (float)class81.method734(1, var36, var23.field67[var28]));
                     } else {
                        int var37 = var23.field71[var25];
                        arg9.method4047((float)var32, (float)var33, (float)var34, (float)var29, (float)var30, (float)var31, 100.0F, 100.0F, 100.0F, (float)class81.method734(1, var37, var23.field67[var26]), (float)class81.method734(1, var37, var23.field67[var27]), (float)class81.method734(1, var37, var23.field67[var28]));
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = arg1 + var13;
         var16 += var14;
      }

      arg9.field8086 = true;
      this.field5942.method493(var15);
   }

   @OriginalMember(
      owner = "client!ml",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V",
      line = 2956
   )
   public final void method1618(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
      if (this.field5930 == null) {
         this.field5930 = new class334[super.field4071][super.field4064];
         this.field5941 = new class6[super.field4071][super.field4064];
      } else if (this.field5926 != null || this.field5943 != null) {
         throw new IllegalStateException();
      }

      boolean var18 = false;
      if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
         var18 = true;

         for(int var19 = 1; var19 < 2; ++var19) {
            int var20 = arg2[arg6[var19]];
            int var21 = arg4[arg6[var19]];
            if (var20 != 0 && super.field4062 != var20 || var21 != 0 && super.field4062 != var21) {
               var18 = false;
               break;
            }
         }
      }

      if (!var18) {
         class6 var22 = new class6();
         short var23 = (short)arg2.length;
         short var24 = (short)arg9.length;
         var22.field59 = var23;
         var22.field67 = new short[var23];
         var22.field64 = new short[var23];
         var22.field63 = new short[var23];
         var22.field58 = new short[var23];

         for(int var25 = 0; var25 < var23; ++var25) {
            int var32 = arg2[var25];
            int var33 = arg4[var25];
            if (var32 == 0 && var33 == 0) {
               var22.field67[var25] = (short)(this.field5935[arg0][arg1] - this.field5945[arg0][arg1]);
            } else if (var32 == 0 && super.field4062 == var33) {
               var22.field67[var25] = (short)(this.field5935[arg0][arg1 + 1] - this.field5945[arg0][arg1 + 1]);
            } else if (super.field4062 == var32 && super.field4062 == var33) {
               var22.field67[var25] = (short)(this.field5935[arg0 + 1][arg1 + 1] - this.field5945[arg0 + 1][arg1 + 1]);
            } else if (super.field4062 == var32 && var33 == 0) {
               var22.field67[var25] = (short)(this.field5935[arg0 + 1][arg1] - this.field5945[arg0 + 1][arg1]);
            } else {
               int var34 = (this.field5935[arg0 + 1][arg1] - this.field5945[arg0 + 1][arg1]) * var32 + (this.field5935[arg0][arg1] - this.field5945[arg0][arg1]) * (super.field4062 - var32);
               int var35 = (this.field5935[arg0 + 1][arg1 + 1] - this.field5945[arg0 + 1][arg1 + 1]) * var32 + (this.field5935[arg0][arg1 + 1] - this.field5945[arg0][arg1 + 1]) * (super.field4062 - var32);
               var22.field67[var25] = (short)((super.field4062 - var33) * var34 + var33 * var35 >> super.field4065 * 2);
            }

            int var36 = (arg0 << super.field4065) + var32;
            int var37 = (arg1 << super.field4065) + var33;
            var22.field64[var25] = (short)var32;
            var22.field58[var25] = (short)var33;
            var22.field63[var25] = (short)(this.method2220(var37, var36, -20) + (arg3 != null ? arg3[var25] : 0));
            if (var22.field67[var25] < 2) {
               var22.field67[var25] = 2;
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
               class317 var31 = this.field5942.field802.method1354(var30, (byte)-109);
               if (!var31.field4328) {
                  var26 = true;
                  if (this.method3083(var31.field4308) || var31.field4326 != 0 || var31.field4327 != 0) {
                     var22.field70 = (byte)(var22.field70 | 4);
                  }
               }
            }
         }

         var22.field71 = new int[var27];
         if (arg10 != null) {
            var22.field66 = new int[var27];
         }

         var22.field62 = new short[var27];
         var22.field69 = new short[var27];
         var22.field68 = new short[var27];
         if (var26) {
            var22.field65 = new short[var27];
            var22.field60 = new short[var27];
         }

         for(int var29 = 0; var29 < var24; ++var29) {
            if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
               if (arg9[var29] >= 0) {
                  var22.field71[var22.field61] = class572.method4093(-123, arg9[var29]);
               } else {
                  var22.field71[var22.field61] = -1;
               }

               if (arg10 != null) {
                  if (arg10[var29] != -1) {
                     var22.field66[var22.field61] = class572.method4093(-46, arg10[var29]);
                  } else {
                     var22.field66[var22.field61] = -1;
                  }
               }

               var22.field62[var22.field61] = (short)arg6[var29];
               var22.field69[var22.field61] = (short)arg7[var29];
               var22.field68[var22.field61] = (short)arg8[var29];
               if (var26) {
                  if (arg11[var29] != -1 && !this.field5942.field802.method1354(arg11[var29], (byte)-109).field4328) {
                     var22.field65[var22.field61] = (short)arg11[var29];
                     var22.field60[var22.field61] = (short)arg12[var29];
                  } else {
                     var22.field65[var22.field61] = -1;
                  }
               }

               ++var22.field61;
            }
         }

         this.field5941[arg0][arg1] = var22;
      } else {
         if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
            class334 var38 = new class334();
            int var39 = arg9[0];
            int var40 = arg11[0];
            if (arg10 != null) {
               var38.field4548 = class81.method734(1, class572.method4093(-102, arg10[0]), this.field5935[arg0][arg1] - this.field5945[arg0][arg1]);
               if (var39 == -1) {
                  var38.field4553 = (byte)(var38.field4553 | 2);
               }
            }

            if (super.field4066[arg0 + 1][arg1] == super.field4066[arg0][arg1] && super.field4066[arg0 + 1][arg1 + 1] == super.field4066[arg0][arg1] && super.field4066[arg0][arg1 + 1] == super.field4066[arg0][arg1]) {
               var38.field4553 = (byte)(var38.field4553 | 1);
            }

            class317 var41 = null;
            if (var40 != -1) {
               var41 = this.field5942.field802.method1354(var40, (byte)-109);
            }

            if (var41 != null && (var38.field4553 & 2) == 0 && !var41.field4328) {
               var38.field4549 = (short)(this.field5935[arg0][arg1] - this.field5945[arg0][arg1]);
               var38.field4550 = (short)(this.field5935[arg0 + 1][arg1] - this.field5945[arg0 + 1][arg1]);
               var38.field4552 = (short)(this.field5935[arg0 + 1][arg1 + 1] - this.field5945[arg0 + 1][arg1 + 1]);
               var38.field4554 = (short)(this.field5935[arg0][arg1 + 1] - this.field5945[arg0][arg1 + 1]);
               var38.field4551 = (short)var40;
               if (this.method3083(var41.field4308) || var41.field4326 != 0 || var41.field4327 != 0) {
                  var38.field4553 = (byte)(var38.field4553 | 4);
               }
            } else {
               short var42 = class572.method4093(-71, var39);
               var38.field4549 = (short)class81.method734(1, var42, this.field5935[arg0][arg1] - this.field5945[arg0][arg1]);
               var38.field4550 = (short)class81.method734(1, var42, this.field5935[arg0 + 1][arg1] - this.field5945[arg0 + 1][arg1]);
               var38.field4552 = (short)class81.method734(1, var42, this.field5935[arg0 + 1][arg1 + 1] - this.field5945[arg0 + 1][arg1 + 1]);
               var38.field4554 = (short)class81.method734(1, var42, this.field5935[arg0][arg1 + 1] - this.field5945[arg0][arg1 + 1]);
               var38.field4551 = -1;
            }

            this.field5930[arg0][arg1] = var38;
         }

      }
   }
}
