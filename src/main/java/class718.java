import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class718 extends class304 {
   @OriginalMember(
      owner = "client!bl",
      name = "H",
      descriptor = "[I"
   )
   public int[] field10287;

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1360(int arg0, int arg1, int arg2) {
      if (arg2 == 0) {
         int[] var4 = super.field4601.field312;

         for(int var5 = 0; var5 < super.field4607; ++var5) {
            int var6 = super.field4618 * var5;
            int var7 = (arg1 + var5) * super.field4601.field299 + arg0;

            for(int var8 = 0; var8 < super.field4618; ++var8) {
               this.field10287[var6 + var8] = this.field10287[var6 + var8] & 16777215 | var4[var7 + var8] << 8 & -16777216;
            }
         }

      } else if (arg2 == 1) {
         int[] var9 = super.field4601.field312;

         for(int var10 = 0; var10 < super.field4607; ++var10) {
            int var11 = super.field4618 * var10;
            int var12 = (arg1 + var10) * super.field4601.field299 + arg0;

            for(int var13 = 0; var13 < super.field4618; ++var13) {
               this.field10287[var11 + var13] = this.field10287[var11 + var13] & 16777215 | var9[var12 + var13] << 16 & -16777216;
            }
         }

      } else if (arg2 == 2) {
         int[] var14 = super.field4601.field312;

         for(int var15 = 0; var15 < super.field4607; ++var15) {
            int var16 = super.field4618 * var15;
            int var17 = (arg1 + var15) * super.field4601.field299 + arg0;

            for(int var18 = 0; var18 < super.field4618; ++var18) {
               this.field10287[var16 + var18] = this.field10287[var16 + var18] & 16777215 | var14[var17 + var18] << 24 & -16777216;
            }
         }

      } else {
         if (arg2 == 3) {
            int[] var19 = super.field4601.field312;

            for(int var20 = 0; var20 < super.field4607; ++var20) {
               int var21 = super.field4618 * var20;
               int var22 = (arg1 + var20) * super.field4601.field299 + arg0;

               for(int var23 = 0; var23 < super.field4618; ++var23) {
                  this.field10287[var21 + var23] = this.field10287[var21 + var23] & 16777215 | (var19[var22 + var23] != 0 ? -16777216 : 0);
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method2327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      if (arg3 > 0 && arg4 > 0) {
         int var10 = 0;
         int var11 = 0;
         int var12 = super.field4618 + super.field4608 + super.field4605;
         int var13 = super.field4614 + super.field4607 + super.field4613;
         int var14 = (var12 << 16) / arg3;
         int var15 = (var13 << 16) / arg4;
         if (super.field4608 > 0) {
            int var16 = ((super.field4608 << 16) + var14 - 1) / var14;
            arg0 += var16;
            var10 += var14 * var16 - (super.field4608 << 16);
         }

         if (super.field4614 > 0) {
            int var17 = ((super.field4614 << 16) + var15 - 1) / var15;
            arg1 += var17;
            var11 += var15 * var17 - (super.field4614 << 16);
         }

         if (super.field4618 < var12) {
            arg3 = ((super.field4618 << 16) - var10 + var14 - 1) / var14;
         }

         if (super.field4607 < var13) {
            arg4 = ((super.field4607 << 16) - var11 + var15 - 1) / var15;
         }

         int var18 = super.field4601.field299 * arg1 + arg0;
         int var19 = super.field4601.field299 - arg3;
         if (arg1 + arg4 > super.field4601.field281) {
            arg4 -= arg1 + arg4 - super.field4601.field281;
         }

         if (arg1 < super.field4601.field280) {
            int var20 = super.field4601.field280 - arg1;
            arg4 -= var20;
            var18 += super.field4601.field299 * var20;
            var11 += var15 * var20;
         }

         if (arg0 + arg3 > super.field4601.field306) {
            int var21 = arg0 + arg3 - super.field4601.field306;
            arg3 -= var21;
            var19 += var21;
         }

         if (arg0 < super.field4601.field298) {
            int var22 = super.field4601.field298 - arg0;
            arg3 -= var22;
            var18 += var22;
            var10 += var14 * var22;
            var19 += var22;
         }

         float[] var23 = super.field4601.field303;
         int[] var24 = super.field4601.field312;
         if (arg7 == 0) {
            if (arg5 == 1) {
               int var25 = var10;

               for(int var26 = -arg4; var26 < 0; ++var26) {
                  int var27 = (var11 >> 16) * super.field4618;

                  for(int var28 = -arg3; var28 < 0; ++var28) {
                     if ((float)arg2 < var23[var18]) {
                        var24[var18] = this.field10287[(var10 >> 16) + var27];
                        var23[var18] = (float)arg2;
                     }

                     var10 += var14;
                     ++var18;
                  }

                  var11 += var15;
                  var10 = var25;
                  var18 += var19;
               }

            } else if (arg5 == 0) {
               int var29 = (arg6 & 16711680) >> 16;
               int var30 = (arg6 & 65280) >> 8;
               int var31 = arg6 & 255;
               int var32 = var10;

               for(int var33 = -arg4; var33 < 0; ++var33) {
                  int var34 = (var11 >> 16) * super.field4618;

                  for(int var35 = -arg3; var35 < 0; ++var35) {
                     if ((float)arg2 < var23[var18]) {
                        int var36 = this.field10287[(var10 >> 16) + var34];
                        int var37 = (var36 & 16711680) * var29 & -16777216;
                        int var38 = (var36 & 65280) * var30 & 16711680;
                        int var39 = (var36 & 255) * var31 & 65280;
                        var24[var18] = (var37 | var38 | var39) >>> 8;
                        var23[var18] = (float)arg2;
                     }

                     var10 += var14;
                     ++var18;
                  }

                  var11 += var15;
                  var10 = var32;
                  var18 += var19;
               }

            } else if (arg5 == 3) {
               int var40 = var10;

               for(int var41 = -arg4; var41 < 0; ++var41) {
                  int var42 = (var11 >> 16) * super.field4618;

                  for(int var43 = -arg3; var43 < 0; ++var43) {
                     if ((float)arg2 < var23[var18]) {
                        int var44 = this.field10287[(var10 >> 16) + var42];
                        int var45 = arg6 + var44;
                        int var46 = (arg6 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        var24[var18] = var45 - var47 | var47 - (var47 >>> 8);
                        var23[var18] = (float)arg2;
                     }

                     var10 += var14;
                     ++var18;
                  }

                  var11 += var15;
                  var10 = var40;
                  var18 += var19;
               }

            } else if (arg5 != 2) {
               throw new IllegalArgumentException();
            } else {
               int var48 = arg6 >>> 24;
               int var49 = 256 - var48;
               int var50 = (arg6 & 16711935) * var49 & -16711936;
               int var51 = (arg6 & 65280) * var49 & 16711680;
               int var52 = (var50 | var51) >>> 8;
               int var53 = var10;

               for(int var54 = -arg4; var54 < 0; ++var54) {
                  int var55 = (var11 >> 16) * super.field4618;

                  for(int var56 = -arg3; var56 < 0; ++var56) {
                     if ((float)arg2 < var23[var18]) {
                        int var57 = this.field10287[(var10 >> 16) + var55];
                        int var58 = (var57 & 16711935) * var48 & -16711936;
                        int var59 = (var57 & 65280) * var48 & 16711680;
                        var24[var18] = ((var58 | var59) >>> 8) + var52;
                        var23[var18] = (float)arg2;
                     }

                     var10 += var14;
                     ++var18;
                  }

                  var11 += var15;
                  var10 = var53;
                  var18 += var19;
               }

            }
         } else if (arg7 == 1) {
            if (arg5 == 1) {
               int var60 = var10;

               for(int var61 = -arg4; var61 < 0; ++var61) {
                  int var62 = (var11 >> 16) * super.field4618;

                  for(int var63 = -arg3; var63 < 0; ++var63) {
                     if ((float)arg2 < var23[var18]) {
                        int var64 = this.field10287[(var10 >> 16) + var62];
                        int var65 = var64 >>> 24;
                        int var66 = 256 - var65;
                        int var67 = var24[var18];
                        var24[var18] = (((var64 & 16711935) * var65 + (var67 & 16711935) * var66 & -16711936) >> 8) + (((var64 & -16711936) >>> 8) * var65 + ((var67 & -16711936) >>> 8) * var66 & -16711936);
                        var23[var18] = (float)arg2;
                     }

                     var10 += var14;
                     ++var18;
                  }

                  var11 += var15;
                  var10 = var60;
                  var18 += var19;
               }

            } else if (arg5 == 0) {
               int var68 = var10;
               if ((arg6 & 16777215) == 16777215) {
                  for(int var69 = -arg4; var69 < 0; ++var69) {
                     int var70 = (var11 >> 16) * super.field4618;

                     for(int var71 = -arg3; var71 < 0; ++var71) {
                        if ((float)arg2 < var23[var18]) {
                           int var72 = this.field10287[(var10 >> 16) + var70];
                           int var73 = (arg6 >>> 24) * (var72 >>> 24) >> 8;
                           int var74 = 256 - var73;
                           int var75 = var24[var18];
                           var24[var18] = ((var72 & 16711935) * var73 + (var75 & 16711935) * var74 & -16711936) + ((var72 & 65280) * var73 + (var75 & 65280) * var74 & 16711680) >> 8;
                           var23[var18] = (float)arg2;
                        }

                        var10 += var14;
                        ++var18;
                     }

                     var11 += var15;
                     var10 = var68;
                     var18 += var19;
                  }

               } else {
                  int var76 = (arg6 & 16711680) >> 16;
                  int var77 = (arg6 & 65280) >> 8;
                  int var78 = arg6 & 255;

                  for(int var79 = -arg4; var79 < 0; ++var79) {
                     int var80 = (var11 >> 16) * super.field4618;

                     for(int var81 = -arg3; var81 < 0; ++var81) {
                        if ((float)arg2 < var23[var18]) {
                           int var82 = this.field10287[(var10 >> 16) + var80];
                           int var83 = (arg6 >>> 24) * (var82 >>> 24) >> 8;
                           int var84 = 256 - var83;
                           if (var83 != 255) {
                              int var85 = (var82 & 16711680) * var76 & -16777216;
                              int var86 = (var82 & 65280) * var77 & 16711680;
                              int var87 = (var82 & 255) * var78 & 65280;
                              int var88 = (var85 | var86 | var87) >>> 8;
                              int var89 = var24[var18];
                              var24[var18] = ((var88 & 16711935) * var83 + (var89 & 16711935) * var84 & -16711936) + ((var88 & 65280) * var83 + (var89 & 65280) * var84 & 16711680) >> 8;
                              var23[var18] = (float)arg2;
                           } else {
                              int var90 = (var82 & 16711680) * var76 & -16777216;
                              int var91 = (var82 & 65280) * var77 & 16711680;
                              int var92 = (var82 & 255) * var78 & 65280;
                              var24[var18] = (var90 | var91 | var92) >>> 8;
                              var23[var18] = (float)arg2;
                           }
                        }

                        var10 += var14;
                        ++var18;
                     }

                     var11 += var15;
                     var10 = var68;
                     var18 += var19;
                  }

               }
            } else if (arg5 == 3) {
               int var93 = var10;

               for(int var94 = -arg4; var94 < 0; ++var94) {
                  int var95 = (var11 >> 16) * super.field4618;

                  for(int var96 = -arg3; var96 < 0; ++var96) {
                     if ((float)arg2 < var23[var18]) {
                        int var97 = this.field10287[(var10 >> 16) + var95];
                        int var98 = arg6 + var97;
                        int var99 = (arg6 & 16711935) + (var97 & 16711935);
                        int var100 = (var98 - var99 & 65536) + (var99 & 16777472);
                        int var101 = var98 - var100 | var100 - (var100 >>> 8);
                        int var102 = (arg6 >>> 24) * (var101 >>> 24) >> 8;
                        int var103 = 256 - var102;
                        if (var102 != 255) {
                           int var105 = var24[var18];
                           var101 = ((var101 & 16711935) * var102 + (var105 & 16711935) * var103 & -16711936) + ((var101 & 65280) * var102 + (var105 & 65280) * var103 & 16711680) >> 8;
                        }

                        var24[var18] = var101;
                        var23[var18] = (float)arg2;
                     }

                     var10 += var14;
                     ++var18;
                  }

                  var11 += var15;
                  var10 = var93;
                  var18 += var19;
               }

            } else if (arg5 != 2) {
               throw new IllegalArgumentException();
            } else {
               int var106 = arg6 >>> 24;
               int var107 = 256 - var106;
               int var108 = (arg6 & 16711935) * var107 & -16711936;
               int var109 = (arg6 & 65280) * var107 & 16711680;
               int var110 = (var108 | var109) >>> 8;
               int var111 = var10;

               for(int var112 = -arg4; var112 < 0; ++var112) {
                  int var113 = (var11 >> 16) * super.field4618;

                  for(int var114 = -arg3; var114 < 0; ++var114) {
                     if ((float)arg2 < var23[var18]) {
                        int var115 = this.field10287[(var10 >> 16) + var113];
                        int var116 = var115 >>> 24;
                        int var117 = 256 - var116;
                        int var118 = (var115 & 16711935) * var106 & -16711936;
                        int var119 = (var115 & 65280) * var106 & 16711680;
                        int var120 = ((var118 | var119) >>> 8) + var110;
                        int var121 = var24[var18];
                        var24[var18] = ((var120 & 16711935) * var116 + (var121 & 16711935) * var117 & -16711936) + ((var120 & 65280) * var116 + (var121 & 65280) * var117 & 16711680) >> 8;
                        var23[var18] = (float)arg2;
                     }

                     var10 += var14;
                     ++var18;
                  }

                  var11 += var15;
                  var10 = var111;
                  var18 += var19;
               }

            }
         } else if (arg7 != 2) {
            throw new IllegalArgumentException();
         } else if (arg5 == 1) {
            int var122 = var10;

            for(int var123 = -arg4; var123 < 0; ++var123) {
               int var124 = (var11 >> 16) * super.field4618;

               for(int var125 = -arg3; var125 < 0; ++var125) {
                  if ((float)arg2 < var23[var18]) {
                     int var126 = this.field10287[(var10 >> 16) + var124];
                     if (var126 != 0) {
                        int var127 = var24[var18];
                        int var128 = var126 + var127;
                        int var129 = (var126 & 16711935) + (var127 & 16711935);
                        int var130 = (var128 - var129 & 65536) + (var129 & 16777472);
                        var24[var18] = var128 - var130 | var130 - (var130 >>> 8);
                        var23[var18] = (float)arg2;
                     }
                  }

                  var10 += var14;
                  ++var18;
               }

               var11 += var15;
               var10 = var122;
               var18 += var19;
            }

         } else if (arg5 == 0) {
            int var131 = var10;
            int var132 = (arg6 & 16711680) >> 16;
            int var133 = (arg6 & 65280) >> 8;
            int var134 = arg6 & 255;

            for(int var135 = -arg4; var135 < 0; ++var135) {
               int var136 = (var11 >> 16) * super.field4618;

               for(int var137 = -arg3; var137 < 0; ++var137) {
                  if ((float)arg2 < var23[var18]) {
                     int var138 = this.field10287[(var10 >> 16) + var136];
                     if (var138 != 0) {
                        int var139 = (var138 & 16711680) * var132 & -16777216;
                        int var140 = (var138 & 65280) * var133 & 16711680;
                        int var141 = (var138 & 255) * var134 & 65280;
                        int var142 = (var139 | var140 | var141) >>> 8;
                        int var143 = var24[var18];
                        int var144 = var142 + var143;
                        int var145 = (var142 & 16711935) + (var143 & 16711935);
                        int var146 = (var144 - var145 & 65536) + (var145 & 16777472);
                        var24[var18] = var144 - var146 | var146 - (var146 >>> 8);
                        var23[var18] = (float)arg2;
                     }
                  }

                  var10 += var14;
                  ++var18;
               }

               var11 += var15;
               var10 = var131;
               var18 += var19;
            }

         } else if (arg5 == 3) {
            int var147 = var10;

            for(int var148 = -arg4; var148 < 0; ++var148) {
               int var149 = (var11 >> 16) * super.field4618;

               for(int var150 = -arg3; var150 < 0; ++var150) {
                  if ((float)arg2 < var23[var18]) {
                     int var151 = this.field10287[(var10 >> 16) + var149];
                     int var152 = arg6 + var151;
                     int var153 = (arg6 & 16711935) + (var151 & 16711935);
                     int var154 = (var152 - var153 & 65536) + (var153 & 16777472);
                     int var155 = var152 - var154 | var154 - (var154 >>> 8);
                     int var156 = var24[var18];
                     int var157 = var155 + var156;
                     int var158 = (var155 & 16711935) + (var156 & 16711935);
                     int var159 = (var157 - var158 & 65536) + (var158 & 16777472);
                     var24[var18] = var157 - var159 | var159 - (var159 >>> 8);
                     var23[var18] = (float)arg2;
                  }

                  var10 += var14;
                  ++var18;
               }

               var11 += var15;
               var10 = var147;
               var18 += var19;
            }

         } else if (arg5 != 2) {
            throw new IllegalArgumentException();
         } else {
            int var160 = arg6 >>> 24;
            int var161 = 256 - var160;
            int var162 = (arg6 & 16711935) * var161 & -16711936;
            int var163 = (arg6 & 65280) * var161 & 16711680;
            int var164 = (var162 | var163) >>> 8;
            int var165 = var10;

            for(int var166 = -arg4; var166 < 0; ++var166) {
               int var167 = (var11 >> 16) * super.field4618;

               for(int var168 = -arg3; var168 < 0; ++var168) {
                  if ((float)arg2 < var23[var18]) {
                     int var169 = this.field10287[(var10 >> 16) + var167];
                     if (var169 != 0) {
                        int var170 = (var169 & 16711935) * var160 & -16711936;
                        int var171 = (var169 & 65280) * var160 & 16711680;
                        int var172 = ((var170 | var171) >>> 8) + var164;
                        int var173 = var24[var18];
                        int var174 = var172 + var173;
                        int var175 = (var172 & 16711935) + (var173 & 16711935);
                        int var176 = (var174 - var175 & 65536) + (var175 & 16777472);
                        var24[var18] = var174 - var176 | var176 - (var176 >>> 8);
                        var23[var18] = (float)arg2;
                     }
                  }

                  var10 += var14;
                  ++var18;
               }

               var11 += var15;
               var10 = var165;
               var18 += var19;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method1352(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (super.field4601.method275()) {
         throw new IllegalStateException();
      } else {
         int var6 = super.field4601.field299;
         int var7 = super.field4608 + arg0;
         int var8 = super.field4614 + arg1;
         int var9 = var6 * var8 + var7;
         int var10 = 0;
         int var11 = super.field4607;
         int var12 = super.field4618;
         int var13 = var6 - var12;
         int var14 = 0;
         if (var8 < super.field4601.field280) {
            int var15 = super.field4601.field280 - var8;
            var11 -= var15;
            var8 = super.field4601.field280;
            var10 += var12 * var15;
            var9 += var6 * var15;
         }

         if (var8 + var11 > super.field4601.field281) {
            var11 -= var8 + var11 - super.field4601.field281;
         }

         if (var7 < super.field4601.field298) {
            int var16 = super.field4601.field298 - var7;
            var12 -= var16;
            var7 = super.field4601.field298;
            var10 += var16;
            var9 += var16;
            var14 += var16;
            var13 += var16;
         }

         if (var7 + var12 > super.field4601.field306) {
            int var17 = var7 + var12 - super.field4601.field306;
            var12 -= var17;
            var14 += var17;
            var13 += var17;
         }

         if (var12 > 0 && var11 > 0) {
            int[] var18 = super.field4601.field312;
            if (arg4 == 0) {
               if (arg2 == 1) {
                  for(int var19 = -var11; var19 < 0; ++var19) {
                     int var20 = var9 + var12 - 3;

                     while(var9 < var20) {
                        var18[var9++] = this.field10287[var10++];
                        var18[var9++] = this.field10287[var10++];
                        var18[var9++] = this.field10287[var10++];
                        var18[var9++] = this.field10287[var10++];
                     }

                     var20 += 3;

                     while(var9 < var20) {
                        var18[var9++] = this.field10287[var10++];
                     }

                     var9 += var13;
                     var10 += var14;
                  }

               } else if (arg2 == 0) {
                  int var21 = (arg3 & 16711680) >> 16;
                  int var22 = (arg3 & 65280) >> 8;
                  int var23 = arg3 & 255;

                  for(int var24 = -var11; var24 < 0; ++var24) {
                     for(int var25 = -var12; var25 < 0; ++var25) {
                        int var26 = this.field10287[var10++];
                        int var27 = (var26 & 16711680) * var21 & -16777216;
                        int var28 = (var26 & 65280) * var22 & 16711680;
                        int var29 = (var26 & 255) * var23 & 65280;
                        var18[var9++] = (var27 | var28 | var29) >>> 8;
                     }

                     var9 += var13;
                     var10 += var14;
                  }

               } else if (arg2 == 3) {
                  for(int var30 = -var11; var30 < 0; ++var30) {
                     for(int var31 = -var12; var31 < 0; ++var31) {
                        int var32 = this.field10287[var10++];
                        int var33 = arg3 + var32;
                        int var34 = (arg3 & 16711935) + (var32 & 16711935);
                        int var35 = (var33 - var34 & 65536) + (var34 & 16777472);
                        var18[var9++] = var33 - var35 | var35 - (var35 >>> 8);
                     }

                     var9 += var13;
                     var10 += var14;
                  }

               } else if (arg2 != 2) {
                  throw new IllegalArgumentException();
               } else {
                  int var36 = arg3 >>> 24;
                  int var37 = 256 - var36;
                  int var38 = (arg3 & 16711935) * var37 & -16711936;
                  int var39 = (arg3 & 65280) * var37 & 16711680;
                  int var40 = (var38 | var39) >>> 8;

                  for(int var41 = -var11; var41 < 0; ++var41) {
                     for(int var42 = -var12; var42 < 0; ++var42) {
                        int var43 = this.field10287[var10++];
                        int var44 = (var43 & 16711935) * var36 & -16711936;
                        int var45 = (var43 & 65280) * var36 & 16711680;
                        var18[var9++] = ((var44 | var45) >>> 8) + var40;
                     }

                     var9 += var13;
                     var10 += var14;
                  }

               }
            } else if (arg4 == 1) {
               if (arg2 == 1) {
                  for(int var46 = -var11; var46 < 0; ++var46) {
                     for(int var47 = -var12; var47 < 0; ++var47) {
                        int var48 = this.field10287[var10++];
                        int var49 = var48 >>> 24;
                        int var50 = 256 - var49;
                        int var51 = var18[var9];
                        var18[var9++] = (((var48 & 16711935) * var49 + (var51 & 16711935) * var50 & -16711936) >> 8) + (((var48 & -16711936) >>> 8) * var49 + ((var51 & -16711936) >>> 8) * var50 & -16711936);
                     }

                     var9 += var13;
                     var10 += var14;
                  }

               } else if (arg2 == 0) {
                  if ((arg3 & 16777215) == 16777215) {
                     for(int var52 = -var11; var52 < 0; ++var52) {
                        for(int var53 = -var12; var53 < 0; ++var53) {
                           int var54 = this.field10287[var10++];
                           int var55 = (arg3 >>> 24) * (var54 >>> 24) >> 8;
                           int var56 = 256 - var55;
                           int var57 = var18[var9];
                           var18[var9++] = ((var54 & 16711935) * var55 + (var57 & 16711935) * var56 & -16711936) + ((var54 & 65280) * var55 + (var57 & 65280) * var56 & 16711680) >> 8;
                        }

                        var9 += var13;
                        var10 += var14;
                     }

                  } else {
                     int var58 = (arg3 & 16711680) >> 16;
                     int var59 = (arg3 & 65280) >> 8;
                     int var60 = arg3 & 255;

                     for(int var61 = -var11; var61 < 0; ++var61) {
                        for(int var62 = -var12; var62 < 0; ++var62) {
                           int var63 = this.field10287[var10++];
                           int var64 = (arg3 >>> 24) * (var63 >>> 24) >> 8;
                           int var65 = 256 - var64;
                           if (var64 != 255) {
                              int var66 = (var63 & 16711680) * var58 & -16777216;
                              int var67 = (var63 & 65280) * var59 & 16711680;
                              int var68 = (var63 & 255) * var60 & 65280;
                              int var69 = (var66 | var67 | var68) >>> 8;
                              int var70 = var18[var9];
                              var18[var9++] = ((var69 & 16711935) * var64 + (var70 & 16711935) * var65 & -16711936) + ((var69 & 65280) * var64 + (var70 & 65280) * var65 & 16711680) >> 8;
                           } else {
                              int var71 = (var63 & 16711680) * var58 & -16777216;
                              int var72 = (var63 & 65280) * var59 & 16711680;
                              int var73 = (var63 & 255) * var60 & 65280;
                              var18[var9++] = (var71 | var72 | var73) >>> 8;
                           }
                        }

                        var9 += var13;
                        var10 += var14;
                     }

                  }
               } else if (arg2 == 3) {
                  for(int var74 = -var11; var74 < 0; ++var74) {
                     for(int var75 = -var12; var75 < 0; ++var75) {
                        int var76 = this.field10287[var10++];
                        int var77 = arg3 + var76;
                        int var78 = (arg3 & 16711935) + (var76 & 16711935);
                        int var79 = (var77 - var78 & 65536) + (var78 & 16777472);
                        int var80 = var77 - var79 | var79 - (var79 >>> 8);
                        int var81 = (arg3 >>> 24) * (var80 >>> 24) >> 8;
                        int var82 = 256 - var81;
                        if (var81 != 255) {
                           int var84 = var18[var9];
                           var80 = ((var80 & 16711935) * var81 + (var84 & 16711935) * var82 & -16711936) + ((var80 & 65280) * var81 + (var84 & 65280) * var82 & 16711680) >> 8;
                        }

                        var18[var9++] = var80;
                     }

                     var9 += var13;
                     var10 += var14;
                  }

               } else if (arg2 != 2) {
                  throw new IllegalArgumentException();
               } else {
                  int var85 = arg3 >>> 24;
                  int var86 = 256 - var85;
                  int var87 = (arg3 & 16711935) * var86 & -16711936;
                  int var88 = (arg3 & 65280) * var86 & 16711680;
                  int var89 = (var87 | var88) >>> 8;

                  for(int var90 = -var11; var90 < 0; ++var90) {
                     for(int var91 = -var12; var91 < 0; ++var91) {
                        int var92 = this.field10287[var10++];
                        int var93 = var92 >>> 24;
                        int var94 = 256 - var93;
                        int var95 = (var92 & 16711935) * var85 & -16711936;
                        int var96 = (var92 & 65280) * var85 & 16711680;
                        int var97 = ((var95 | var96) >>> 8) + var89;
                        int var98 = var18[var9];
                        var18[var9++] = ((var97 & 16711935) * var93 + (var98 & 16711935) * var94 & -16711936) + ((var97 & 65280) * var93 + (var98 & 65280) * var94 & 16711680) >> 8;
                     }

                     var9 += var13;
                     var10 += var14;
                  }

               }
            } else if (arg4 != 2) {
               throw new IllegalArgumentException();
            } else if (arg2 == 1) {
               for(int var99 = -var11; var99 < 0; ++var99) {
                  for(int var100 = -var12; var100 < 0; ++var100) {
                     int var101 = this.field10287[var10++];
                     if (var101 != 0) {
                        int var102 = var18[var9];
                        int var103 = var101 + var102;
                        int var104 = (var101 & 16711935) + (var102 & 16711935);
                        int var105 = (var103 - var104 & 65536) + (var104 & 16777472);
                        var18[var9++] = var103 - var105 | var105 - (var105 >>> 8);
                     } else {
                        ++var9;
                     }
                  }

                  var9 += var13;
                  var10 += var14;
               }

            } else if (arg2 == 0) {
               int var106 = (arg3 & 16711680) >> 16;
               int var107 = (arg3 & 65280) >> 8;
               int var108 = arg3 & 255;

               for(int var109 = -var11; var109 < 0; ++var109) {
                  for(int var110 = -var12; var110 < 0; ++var110) {
                     int var111 = this.field10287[var10++];
                     if (var111 != 0) {
                        int var112 = (var111 & 16711680) * var106 & -16777216;
                        int var113 = (var111 & 65280) * var107 & 16711680;
                        int var114 = (var111 & 255) * var108 & 65280;
                        int var115 = (var112 | var113 | var114) >>> 8;
                        int var116 = var18[var9];
                        int var117 = var115 + var116;
                        int var118 = (var115 & 16711935) + (var116 & 16711935);
                        int var119 = (var117 - var118 & 65536) + (var118 & 16777472);
                        var18[var9++] = var117 - var119 | var119 - (var119 >>> 8);
                     } else {
                        ++var9;
                     }
                  }

                  var9 += var13;
                  var10 += var14;
               }

            } else if (arg2 == 3) {
               for(int var120 = -var11; var120 < 0; ++var120) {
                  for(int var121 = -var12; var121 < 0; ++var121) {
                     int var122 = this.field10287[var10++];
                     int var123 = arg3 + var122;
                     int var124 = (arg3 & 16711935) + (var122 & 16711935);
                     int var125 = (var123 - var124 & 65536) + (var124 & 16777472);
                     int var126 = var123 - var125 | var125 - (var125 >>> 8);
                     int var127 = var18[var9];
                     int var128 = var126 + var127;
                     int var129 = (var126 & 16711935) + (var127 & 16711935);
                     int var130 = (var128 - var129 & 65536) + (var129 & 16777472);
                     var18[var9++] = var128 - var130 | var130 - (var130 >>> 8);
                  }

                  var9 += var13;
                  var10 += var14;
               }

            } else if (arg2 != 2) {
               throw new IllegalArgumentException();
            } else {
               int var131 = arg3 >>> 24;
               int var132 = 256 - var131;
               int var133 = (arg3 & 16711935) * var132 & -16711936;
               int var134 = (arg3 & 65280) * var132 & 16711680;
               int var135 = (var133 | var134) >>> 8;

               for(int var136 = -var11; var136 < 0; ++var136) {
                  for(int var137 = -var12; var137 < 0; ++var137) {
                     int var138 = this.field10287[var10++];
                     if (var138 != 0) {
                        int var139 = (var138 & 16711935) * var131 & -16711936;
                        int var140 = (var138 & 65280) * var131 & 16711680;
                        int var141 = ((var139 | var140) >>> 8) + var135;
                        int var142 = var18[var9];
                        int var143 = var141 + var142;
                        int var144 = (var141 & 16711935) + (var142 & 16711935);
                        int var145 = (var143 - var144 & 65536) + (var144 & 16777472);
                        var18[var9++] = var143 - var145 | var145 - (var145 >>> 8);
                     } else {
                        ++var9;
                     }
                  }

                  var9 += var13;
                  var10 += var14;
               }

            }
         }
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public final void method1361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int[] var7 = super.field4601.field312;

      for(int var8 = 0; var8 < arg3; ++var8) {
         int var9 = (arg1 + var8) * arg2 + arg0;
         int var10 = (arg5 + var8) * arg2 + arg4;

         for(int var11 = 0; var11 < arg2; ++var11) {
            this.field10287[var9 + var11] = var7[var10 + var11] & 16777215;
         }
      }

   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public final void method1359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (super.field4601.method275()) {
         throw new IllegalStateException();
      } else if (arg2 > 0 && arg3 > 0) {
         int var9 = 0;
         int var10 = 0;
         int var11 = super.field4601.field299;
         int var12 = super.field4618 + super.field4608 + super.field4605;
         int var13 = super.field4614 + super.field4607 + super.field4613;
         int var14 = (var12 << 16) / arg2;
         int var15 = (var13 << 16) / arg3;
         if (super.field4608 > 0) {
            int var16 = ((super.field4608 << 16) + var14 - 1) / var14;
            arg0 += var16;
            var9 += var14 * var16 - (super.field4608 << 16);
         }

         if (super.field4614 > 0) {
            int var17 = ((super.field4614 << 16) + var15 - 1) / var15;
            arg1 += var17;
            var10 += var15 * var17 - (super.field4614 << 16);
         }

         if (super.field4618 < var12) {
            arg2 = ((super.field4618 << 16) - var9 + var14 - 1) / var14;
         }

         if (super.field4607 < var13) {
            arg3 = ((super.field4607 << 16) - var10 + var15 - 1) / var15;
         }

         int var18 = arg1 * var11 + arg0;
         int var19 = var11 - arg2;
         if (arg1 + arg3 > super.field4601.field281) {
            arg3 -= arg1 + arg3 - super.field4601.field281;
         }

         if (arg1 < super.field4601.field280) {
            int var20 = super.field4601.field280 - arg1;
            arg3 -= var20;
            var18 += var11 * var20;
            var10 += var15 * var20;
         }

         if (arg0 + arg2 > super.field4601.field306) {
            int var21 = arg0 + arg2 - super.field4601.field306;
            arg2 -= var21;
            var19 += var21;
         }

         if (arg0 < super.field4601.field298) {
            int var22 = super.field4601.field298 - arg0;
            arg2 -= var22;
            var18 += var22;
            var9 += var14 * var22;
            var19 += var22;
         }

         int[] var23 = super.field4601.field312;
         if (arg6 == 0) {
            if (arg4 == 1) {
               int var24 = var9;

               for(int var25 = -arg3; var25 < 0; ++var25) {
                  int var26 = (var10 >> 16) * super.field4618;

                  for(int var27 = -arg2; var27 < 0; ++var27) {
                     var23[var18++] = this.field10287[(var9 >> 16) + var26];
                     var9 += var14;
                  }

                  var10 += var15;
                  var9 = var24;
                  var18 += var19;
               }

            } else if (arg4 == 0) {
               int var28 = (arg5 & 16711680) >> 16;
               int var29 = (arg5 & 65280) >> 8;
               int var30 = arg5 & 255;
               int var31 = var9;

               for(int var32 = -arg3; var32 < 0; ++var32) {
                  int var33 = (var10 >> 16) * super.field4618;

                  for(int var34 = -arg2; var34 < 0; ++var34) {
                     int var35 = this.field10287[(var9 >> 16) + var33];
                     int var36 = (var35 & 16711680) * var28 & -16777216;
                     int var37 = (var35 & 65280) * var29 & 16711680;
                     int var38 = (var35 & 255) * var30 & 65280;
                     var23[var18++] = (var36 | var37 | var38) >>> 8;
                     var9 += var14;
                  }

                  var10 += var15;
                  var9 = var31;
                  var18 += var19;
               }

            } else if (arg4 == 3) {
               int var39 = var9;

               for(int var40 = -arg3; var40 < 0; ++var40) {
                  int var41 = (var10 >> 16) * super.field4618;

                  for(int var42 = -arg2; var42 < 0; ++var42) {
                     int var43 = this.field10287[(var9 >> 16) + var41];
                     int var44 = arg5 + var43;
                     int var45 = (arg5 & 16711935) + (var43 & 16711935);
                     int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                     var23[var18++] = var44 - var46 | var46 - (var46 >>> 8);
                     var9 += var14;
                  }

                  var10 += var15;
                  var9 = var39;
                  var18 += var19;
               }

            } else if (arg4 != 2) {
               throw new IllegalArgumentException();
            } else {
               int var47 = arg5 >>> 24;
               int var48 = 256 - var47;
               int var49 = (arg5 & 16711935) * var48 & -16711936;
               int var50 = (arg5 & 65280) * var48 & 16711680;
               int var51 = (var49 | var50) >>> 8;
               int var52 = var9;

               for(int var53 = -arg3; var53 < 0; ++var53) {
                  int var54 = (var10 >> 16) * super.field4618;

                  for(int var55 = -arg2; var55 < 0; ++var55) {
                     int var56 = this.field10287[(var9 >> 16) + var54];
                     int var57 = (var56 & 16711935) * var47 & -16711936;
                     int var58 = (var56 & 65280) * var47 & 16711680;
                     var23[var18++] = ((var57 | var58) >>> 8) + var51;
                     var9 += var14;
                  }

                  var10 += var15;
                  var9 = var52;
                  var18 += var19;
               }

            }
         } else if (arg6 == 1) {
            if (arg4 == 1) {
               int var59 = var9;

               for(int var60 = -arg3; var60 < 0; ++var60) {
                  int var61 = (var10 >> 16) * super.field4618;

                  for(int var62 = -arg2; var62 < 0; ++var62) {
                     int var63 = this.field10287[(var9 >> 16) + var61];
                     int var64 = var63 >>> 24;
                     int var65 = 256 - var64;
                     int var66 = var23[var18];
                     var23[var18++] = (((var63 & 16711935) * var64 + (var66 & 16711935) * var65 & -16711936) >> 8) + (((var63 & -16711936) >>> 8) * var64 + ((var66 & -16711936) >>> 8) * var65 & -16711936);
                     var9 += var14;
                  }

                  var10 += var15;
                  var9 = var59;
                  var18 += var19;
               }

            } else if (arg4 == 0) {
               int var67 = var9;
               if ((arg5 & 16777215) == 16777215) {
                  for(int var68 = -arg3; var68 < 0; ++var68) {
                     int var69 = (var10 >> 16) * super.field4618;

                     for(int var70 = -arg2; var70 < 0; ++var70) {
                        int var71 = this.field10287[(var9 >> 16) + var69];
                        int var72 = (arg5 >>> 24) * (var71 >>> 24) >> 8;
                        int var73 = 256 - var72;
                        int var74 = var23[var18];
                        var23[var18++] = ((var71 & 16711935) * var72 + (var74 & 16711935) * var73 & -16711936) + ((var71 & 65280) * var72 + (var74 & 65280) * var73 & 16711680) >> 8;
                        var9 += var14;
                     }

                     var10 += var15;
                     var9 = var67;
                     var18 += var19;
                  }

               } else {
                  int var75 = (arg5 & 16711680) >> 16;
                  int var76 = (arg5 & 65280) >> 8;
                  int var77 = arg5 & 255;

                  for(int var78 = -arg3; var78 < 0; ++var78) {
                     int var79 = (var10 >> 16) * super.field4618;

                     for(int var80 = -arg2; var80 < 0; ++var80) {
                        int var81 = this.field10287[(var9 >> 16) + var79];
                        int var82 = (arg5 >>> 24) * (var81 >>> 24) >> 8;
                        int var83 = 256 - var82;
                        if (var82 != 255) {
                           int var84 = (var81 & 16711680) * var75 & -16777216;
                           int var85 = (var81 & 65280) * var76 & 16711680;
                           int var86 = (var81 & 255) * var77 & 65280;
                           int var87 = (var84 | var85 | var86) >>> 8;
                           int var88 = var23[var18];
                           var23[var18++] = ((var87 & 16711935) * var82 + (var88 & 16711935) * var83 & -16711936) + ((var87 & 65280) * var82 + (var88 & 65280) * var83 & 16711680) >> 8;
                        } else {
                           int var89 = (var81 & 16711680) * var75 & -16777216;
                           int var90 = (var81 & 65280) * var76 & 16711680;
                           int var91 = (var81 & 255) * var77 & 65280;
                           var23[var18++] = (var89 | var90 | var91) >>> 8;
                        }

                        var9 += var14;
                     }

                     var10 += var15;
                     var9 = var67;
                     var18 += var19;
                  }

               }
            } else if (arg4 == 3) {
               int var92 = var9;

               for(int var93 = -arg3; var93 < 0; ++var93) {
                  int var94 = (var10 >> 16) * super.field4618;

                  for(int var95 = -arg2; var95 < 0; ++var95) {
                     int var96 = this.field10287[(var9 >> 16) + var94];
                     int var97 = arg5 + var96;
                     int var98 = (arg5 & 16711935) + (var96 & 16711935);
                     int var99 = (var97 - var98 & 65536) + (var98 & 16777472);
                     int var100 = var97 - var99 | var99 - (var99 >>> 8);
                     int var101 = (arg5 >>> 24) * (var100 >>> 24) >> 8;
                     int var102 = 256 - var101;
                     if (var101 != 255) {
                        int var104 = var23[var18];
                        var100 = ((var100 & 16711935) * var101 + (var104 & 16711935) * var102 & -16711936) + ((var100 & 65280) * var101 + (var104 & 65280) * var102 & 16711680) >> 8;
                     }

                     var23[var18++] = var100;
                     var9 += var14;
                  }

                  var10 += var15;
                  var9 = var92;
                  var18 += var19;
               }

            } else if (arg4 != 2) {
               throw new IllegalArgumentException();
            } else {
               int var105 = arg5 >>> 24;
               int var106 = 256 - var105;
               int var107 = (arg5 & 16711935) * var106 & -16711936;
               int var108 = (arg5 & 65280) * var106 & 16711680;
               int var109 = (var107 | var108) >>> 8;
               int var110 = var9;

               for(int var111 = -arg3; var111 < 0; ++var111) {
                  int var112 = (var10 >> 16) * super.field4618;

                  for(int var113 = -arg2; var113 < 0; ++var113) {
                     int var114 = this.field10287[(var9 >> 16) + var112];
                     int var115 = var114 >>> 24;
                     int var116 = 256 - var115;
                     int var117 = (var114 & 16711935) * var105 & -16711936;
                     int var118 = (var114 & 65280) * var105 & 16711680;
                     int var119 = ((var117 | var118) >>> 8) + var109;
                     int var120 = var23[var18];
                     var23[var18++] = ((var119 & 16711935) * var115 + (var120 & 16711935) * var116 & -16711936) + ((var119 & 65280) * var115 + (var120 & 65280) * var116 & 16711680) >> 8;
                     var9 += var14;
                  }

                  var10 += var15;
                  var9 = var110;
                  var18 += var19;
               }

            }
         } else if (arg6 != 2) {
            throw new IllegalArgumentException();
         } else if (arg4 == 1) {
            int var121 = var9;

            for(int var122 = -arg3; var122 < 0; ++var122) {
               int var123 = (var10 >> 16) * super.field4618;

               for(int var124 = -arg2; var124 < 0; ++var124) {
                  int var125 = this.field10287[(var9 >> 16) + var123];
                  if (var125 != 0) {
                     int var126 = var23[var18];
                     int var127 = var125 + var126;
                     int var128 = (var125 & 16711935) + (var126 & 16711935);
                     int var129 = (var127 - var128 & 65536) + (var128 & 16777472);
                     var23[var18++] = var127 - var129 | var129 - (var129 >>> 8);
                  } else {
                     ++var18;
                  }

                  var9 += var14;
               }

               var10 += var15;
               var9 = var121;
               var18 += var19;
            }

         } else if (arg4 == 0) {
            int var130 = var9;
            int var131 = (arg5 & 16711680) >> 16;
            int var132 = (arg5 & 65280) >> 8;
            int var133 = arg5 & 255;

            for(int var134 = -arg3; var134 < 0; ++var134) {
               int var135 = (var10 >> 16) * super.field4618;

               for(int var136 = -arg2; var136 < 0; ++var136) {
                  int var137 = this.field10287[(var9 >> 16) + var135];
                  if (var137 != 0) {
                     int var138 = (var137 & 16711680) * var131 & -16777216;
                     int var139 = (var137 & 65280) * var132 & 16711680;
                     int var140 = (var137 & 255) * var133 & 65280;
                     int var141 = (var138 | var139 | var140) >>> 8;
                     int var142 = var23[var18];
                     int var143 = var141 + var142;
                     int var144 = (var141 & 16711935) + (var142 & 16711935);
                     int var145 = (var143 - var144 & 65536) + (var144 & 16777472);
                     var23[var18++] = var143 - var145 | var145 - (var145 >>> 8);
                  } else {
                     ++var18;
                  }

                  var9 += var14;
               }

               var10 += var15;
               var9 = var130;
               var18 += var19;
            }

         } else if (arg4 == 3) {
            int var146 = var9;

            for(int var147 = -arg3; var147 < 0; ++var147) {
               int var148 = (var10 >> 16) * super.field4618;

               for(int var149 = -arg2; var149 < 0; ++var149) {
                  int var150 = this.field10287[(var9 >> 16) + var148];
                  int var151 = arg5 + var150;
                  int var152 = (arg5 & 16711935) + (var150 & 16711935);
                  int var153 = (var151 - var152 & 65536) + (var152 & 16777472);
                  int var154 = var151 - var153 | var153 - (var153 >>> 8);
                  int var155 = var23[var18];
                  int var156 = var154 + var155;
                  int var157 = (var154 & 16711935) + (var155 & 16711935);
                  int var158 = (var156 - var157 & 65536) + (var157 & 16777472);
                  var23[var18++] = var156 - var158 | var158 - (var158 >>> 8);
                  var9 += var14;
               }

               var10 += var15;
               var9 = var146;
               var18 += var19;
            }

         } else if (arg4 != 2) {
            throw new IllegalArgumentException();
         } else {
            int var159 = arg5 >>> 24;
            int var160 = 256 - var159;
            int var161 = (arg5 & 16711935) * var160 & -16711936;
            int var162 = (arg5 & 65280) * var160 & 16711680;
            int var163 = (var161 | var162) >>> 8;
            int var164 = var9;

            for(int var165 = -arg3; var165 < 0; ++var165) {
               int var166 = (var10 >> 16) * super.field4618;

               for(int var167 = -arg2; var167 < 0; ++var167) {
                  int var168 = this.field10287[(var9 >> 16) + var166];
                  if (var168 != 0) {
                     int var169 = (var168 & 16711935) * var159 & -16711936;
                     int var170 = (var168 & 65280) * var159 & 16711680;
                     int var171 = ((var169 | var170) >>> 8) + var163;
                     int var172 = var23[var18];
                     int var173 = var171 + var172;
                     int var174 = (var171 & 16711935) + (var172 & 16711935);
                     int var175 = (var173 - var174 & 65536) + (var174 & 16777472);
                     var23[var18++] = var173 - var175 | var175 - (var175 >>> 8);
                  } else {
                     ++var18;
                  }

                  var9 += var14;
               }

               var10 += var15;
               var9 = var164;
               var18 += var19;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method2328(int arg0, int arg1) {
      int[] var3 = super.field4601.field312;
      if (class304.field4606 == 0) {
         if (class304.field4610 == 0) {
            int var4 = class304.field4616;

            while(var4 < 0) {
               int var5 = class304.field4604;
               int var6 = class304.field4599;
               int var7 = class304.field4598;
               int var8 = class304.field4597;
               if (var6 >= 0 && var7 >= 0 && var6 - (super.field4618 << 12) < 0 && var7 - (super.field4607 << 12) < 0) {
                  while(var8 < 0) {
                     int var9 = (var6 >> 12) + (var7 >> 12) * super.field4618;
                     int var10 = var5++;
                     if (arg1 == 0) {
                        if (arg0 == 1) {
                           var3[var10] = this.field10287[var9];
                        } else if (arg0 == 0) {
                           int var14 = this.field10287[var9++];
                           int var15 = (var14 & 16711680) * class304.field4594 & -16777216;
                           int var16 = (var14 & 65280) * class304.field4609 & 16711680;
                           int var17 = (var14 & 255) * class304.field4615 & 65280;
                           var3[var10] = (var15 | var16 | var17) >>> 8;
                        } else if (arg0 == 3) {
                           int var18 = this.field10287[var9++];
                           int var19 = class304.field4600;
                           int var20 = var18 + var19;
                           int var21 = (var18 & 16711935) + (var19 & 16711935);
                           int var22 = (var20 - var21 & 65536) + (var21 & 16777472);
                           var3[var10] = var20 - var22 | var22 - (var22 >>> 8);
                        } else {
                           if (arg0 != 2) {
                              throw new IllegalArgumentException();
                           }

                           int var23 = this.field10287[var9];
                           int var24 = (var23 & 16711935) * class304.field4612 & -16711936;
                           int var25 = (var23 & 65280) * class304.field4612 & 16711680;
                           var3[var10] = ((var24 | var25) >>> 8) + class304.field4592;
                        }
                     } else if (arg1 == 1) {
                        if (arg0 == 1) {
                           int var26 = this.field10287[var9];
                           int var27 = var26 >>> 24;
                           int var28 = 256 - var27;
                           int var29 = var3[var10];
                           var3[var10] = ((var26 & 16711935) * var27 + (var29 & 16711935) * var28 & -16711936) + ((var26 & 65280) * var27 + (var29 & 65280) * var28 & 16711680) >> 8;
                        } else if (arg0 == 0) {
                           int var30 = this.field10287[var9];
                           int var31 = (var30 >>> 24) * class304.field4612 >> 8;
                           int var32 = 256 - var31;
                           if ((class304.field4600 & 16777215) == 16777215) {
                              int var33 = var3[var10];
                              var3[var10] = ((var30 & 16711935) * var31 + (var33 & 16711935) * var32 & -16711936) + ((var30 & 65280) * var31 + (var33 & 65280) * var32 & 16711680) >> 8;
                           } else if (var31 != 255) {
                              int var34 = (var30 & 16711680) * class304.field4594 & -16777216;
                              int var35 = (var30 & 65280) * class304.field4609 & 16711680;
                              int var36 = (var30 & 255) * class304.field4615 & 65280;
                              int var37 = (var34 | var35 | var36) >>> 8;
                              int var38 = var3[var10];
                              var3[var10] = ((var37 & 16711935) * var31 + (var38 & 16711935) * var32 & -16711936) + ((var37 & 65280) * var31 + (var38 & 65280) * var32 & 16711680) >> 8;
                           } else {
                              int var39 = (var30 & 16711680) * class304.field4594 & -16777216;
                              int var40 = (var30 & 65280) * class304.field4609 & 16711680;
                              int var41 = (var30 & 255) * class304.field4615 & 65280;
                              var3[var10] = (var39 | var40 | var41) >>> 8;
                           }
                        } else if (arg0 == 3) {
                           int var42 = this.field10287[var9];
                           int var43 = class304.field4600;
                           int var44 = var42 + var43;
                           int var45 = (var42 & 16711935) + (var43 & 16711935);
                           int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                           int var47 = var44 - var46 | var46 - (var46 >>> 8);
                           int var48 = (var42 >>> 24) * class304.field4612 >> 8;
                           int var49 = 256 - var48;
                           if (var48 != 255) {
                              int var51 = var3[var10];
                              var47 = ((var47 & 16711935) * var48 + (var51 & 16711935) * var49 & -16711936) + ((var47 & 65280) * var48 + (var51 & 65280) * var49 & 16711680) >> 8;
                           }

                           var3[var10] = var47;
                        } else {
                           if (arg0 != 2) {
                              throw new IllegalArgumentException();
                           }

                           int var52 = this.field10287[var9];
                           int var53 = var52 >>> 24;
                           int var54 = 256 - var53;
                           int var55 = (var52 & 16711935) * class304.field4612 & -16711936;
                           int var56 = (var52 & 65280) * class304.field4612 & 16711680;
                           int var57 = ((var55 | var56) >>> 8) + class304.field4592;
                           int var58 = var3[var10];
                           var3[var10] = ((var57 & 16711935) * var53 + (var58 & 16711935) * var54 & -16711936) + ((var57 & 65280) * var53 + (var58 & 65280) * var54 & 16711680) >> 8;
                        }
                     } else {
                        if (arg1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (arg0 == 1) {
                           int var59 = this.field10287[var9];
                           int var60 = var3[var10];
                           int var61 = var59 + var60;
                           int var62 = (var59 & 16711935) + (var60 & 16711935);
                           int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                           var3[var10] = var61 - var63 | var63 - (var63 >>> 8);
                        } else if (arg0 == 0) {
                           int var64 = this.field10287[var9];
                           int var65 = (var64 & 16711680) * class304.field4594 & -16777216;
                           int var66 = (var64 & 65280) * class304.field4609 & 16711680;
                           int var67 = (var64 & 255) * class304.field4615 & 65280;
                           int var68 = (var65 | var66 | var67) >>> 8;
                           int var69 = var3[var10];
                           int var70 = var68 + var69;
                           int var71 = (var68 & 16711935) + (var69 & 16711935);
                           int var72 = (var70 - var71 & 65536) + (var71 & 16777472);
                           var3[var10] = var70 - var72 | var72 - (var72 >>> 8);
                        } else if (arg0 == 3) {
                           int var73 = this.field10287[var9];
                           int var74 = class304.field4600;
                           int var75 = var73 + var74;
                           int var76 = (var73 & 16711935) + (var74 & 16711935);
                           int var77 = (var75 - var76 & 65536) + (var76 & 16777472);
                           int var78 = var75 - var77 | var77 - (var77 >>> 8);
                           int var79 = var3[var10];
                           int var80 = var78 + var79;
                           int var81 = (var78 & 16711935) + (var79 & 16711935);
                           int var82 = (var80 - var81 & 65536) + (var81 & 16777472);
                           var3[var10] = var80 - var82 | var82 - (var82 >>> 8);
                        } else if (arg0 == 2) {
                           int var83 = this.field10287[var9];
                           int var84 = (var83 & 16711935) * class304.field4612 & -16711936;
                           int var85 = (var83 & 65280) * class304.field4612 & 16711680;
                           int var86 = ((var84 | var85) >>> 8) + class304.field4592;
                           int var87 = var3[var10];
                           int var88 = var86 + var87;
                           int var89 = (var86 & 16711935) + (var87 & 16711935);
                           int var90 = (var88 - var89 & 65536) + (var89 & 16777472);
                           var3[var10] = var88 - var90 | var90 - (var90 >>> 8);
                        }
                     }

                     ++var8;
                  }
               }

               ++var4;
               class304.field4604 += class304.field4595;
            }

         } else if (class304.field4610 < 0) {
            int var91 = class304.field4616;

            while(var91 < 0) {
               int var92 = class304.field4604;
               int var93 = class304.field4599;
               int var94 = class304.field4598 + class304.field4593;
               int var95 = class304.field4597;
               if (var93 >= 0 && var93 - (super.field4618 << 12) < 0) {
                  int var96;
                  if ((var96 = var94 - (super.field4607 << 12)) >= 0) {
                     int var97 = (class304.field4610 - var96) / class304.field4610;
                     var95 += var97;
                     var94 += class304.field4610 * var97;
                     var92 += var97;
                  }

                  int var98;
                  if ((var98 = (var94 - class304.field4610) / class304.field4610) > var95) {
                     var95 = var98;
                  }

                  while(var95 < 0) {
                     int var99 = (var93 >> 12) + (var94 >> 12) * super.field4618;
                     int var100 = var92++;
                     if (arg1 == 0) {
                        if (arg0 == 1) {
                           var3[var100] = this.field10287[var99];
                        } else if (arg0 == 0) {
                           int var104 = this.field10287[var99++];
                           int var105 = (var104 & 16711680) * class304.field4594 & -16777216;
                           int var106 = (var104 & 65280) * class304.field4609 & 16711680;
                           int var107 = (var104 & 255) * class304.field4615 & 65280;
                           var3[var100] = (var105 | var106 | var107) >>> 8;
                        } else if (arg0 == 3) {
                           int var108 = this.field10287[var99++];
                           int var109 = class304.field4600;
                           int var110 = var108 + var109;
                           int var111 = (var108 & 16711935) + (var109 & 16711935);
                           int var112 = (var110 - var111 & 65536) + (var111 & 16777472);
                           var3[var100] = var110 - var112 | var112 - (var112 >>> 8);
                        } else {
                           if (arg0 != 2) {
                              throw new IllegalArgumentException();
                           }

                           int var113 = this.field10287[var99];
                           int var114 = (var113 & 16711935) * class304.field4612 & -16711936;
                           int var115 = (var113 & 65280) * class304.field4612 & 16711680;
                           var3[var100] = ((var114 | var115) >>> 8) + class304.field4592;
                        }
                     } else if (arg1 == 1) {
                        if (arg0 == 1) {
                           int var116 = this.field10287[var99];
                           int var117 = var116 >>> 24;
                           int var118 = 256 - var117;
                           int var119 = var3[var100];
                           var3[var100] = ((var116 & 16711935) * var117 + (var119 & 16711935) * var118 & -16711936) + ((var116 & 65280) * var117 + (var119 & 65280) * var118 & 16711680) >> 8;
                        } else if (arg0 == 0) {
                           int var120 = this.field10287[var99];
                           int var121 = (var120 >>> 24) * class304.field4612 >> 8;
                           int var122 = 256 - var121;
                           if ((class304.field4600 & 16777215) == 16777215) {
                              int var123 = var3[var100];
                              var3[var100] = ((var120 & 16711935) * var121 + (var123 & 16711935) * var122 & -16711936) + ((var120 & 65280) * var121 + (var123 & 65280) * var122 & 16711680) >> 8;
                           } else if (var121 != 255) {
                              int var124 = (var120 & 16711680) * class304.field4594 & -16777216;
                              int var125 = (var120 & 65280) * class304.field4609 & 16711680;
                              int var126 = (var120 & 255) * class304.field4615 & 65280;
                              int var127 = (var124 | var125 | var126) >>> 8;
                              int var128 = var3[var100];
                              var3[var100] = ((var127 & 16711935) * var121 + (var128 & 16711935) * var122 & -16711936) + ((var127 & 65280) * var121 + (var128 & 65280) * var122 & 16711680) >> 8;
                           } else {
                              int var129 = (var120 & 16711680) * class304.field4594 & -16777216;
                              int var130 = (var120 & 65280) * class304.field4609 & 16711680;
                              int var131 = (var120 & 255) * class304.field4615 & 65280;
                              var3[var100] = (var129 | var130 | var131) >>> 8;
                           }
                        } else if (arg0 == 3) {
                           int var132 = this.field10287[var99];
                           int var133 = class304.field4600;
                           int var134 = var132 + var133;
                           int var135 = (var132 & 16711935) + (var133 & 16711935);
                           int var136 = (var134 - var135 & 65536) + (var135 & 16777472);
                           int var137 = var134 - var136 | var136 - (var136 >>> 8);
                           int var138 = (var132 >>> 24) * class304.field4612 >> 8;
                           int var139 = 256 - var138;
                           if (var138 != 255) {
                              int var141 = var3[var100];
                              var137 = ((var137 & 16711935) * var138 + (var141 & 16711935) * var139 & -16711936) + ((var137 & 65280) * var138 + (var141 & 65280) * var139 & 16711680) >> 8;
                           }

                           var3[var100] = var137;
                        } else {
                           if (arg0 != 2) {
                              throw new IllegalArgumentException();
                           }

                           int var142 = this.field10287[var99];
                           int var143 = var142 >>> 24;
                           int var144 = 256 - var143;
                           int var145 = (var142 & 16711935) * class304.field4612 & -16711936;
                           int var146 = (var142 & 65280) * class304.field4612 & 16711680;
                           int var147 = ((var145 | var146) >>> 8) + class304.field4592;
                           int var148 = var3[var100];
                           var3[var100] = ((var147 & 16711935) * var143 + (var148 & 16711935) * var144 & -16711936) + ((var147 & 65280) * var143 + (var148 & 65280) * var144 & 16711680) >> 8;
                        }
                     } else {
                        if (arg1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (arg0 == 1) {
                           int var149 = this.field10287[var99];
                           int var150 = var3[var100];
                           int var151 = var149 + var150;
                           int var152 = (var149 & 16711935) + (var150 & 16711935);
                           int var153 = (var151 - var152 & 65536) + (var152 & 16777472);
                           var3[var100] = var151 - var153 | var153 - (var153 >>> 8);
                        } else if (arg0 == 0) {
                           int var154 = this.field10287[var99];
                           int var155 = (var154 & 16711680) * class304.field4594 & -16777216;
                           int var156 = (var154 & 65280) * class304.field4609 & 16711680;
                           int var157 = (var154 & 255) * class304.field4615 & 65280;
                           int var158 = (var155 | var156 | var157) >>> 8;
                           int var159 = var3[var100];
                           int var160 = var158 + var159;
                           int var161 = (var158 & 16711935) + (var159 & 16711935);
                           int var162 = (var160 - var161 & 65536) + (var161 & 16777472);
                           var3[var100] = var160 - var162 | var162 - (var162 >>> 8);
                        } else if (arg0 == 3) {
                           int var163 = this.field10287[var99];
                           int var164 = class304.field4600;
                           int var165 = var163 + var164;
                           int var166 = (var163 & 16711935) + (var164 & 16711935);
                           int var167 = (var165 - var166 & 65536) + (var166 & 16777472);
                           int var168 = var165 - var167 | var167 - (var167 >>> 8);
                           int var169 = var3[var100];
                           int var170 = var168 + var169;
                           int var171 = (var168 & 16711935) + (var169 & 16711935);
                           int var172 = (var170 - var171 & 65536) + (var171 & 16777472);
                           var3[var100] = var170 - var172 | var172 - (var172 >>> 8);
                        } else if (arg0 == 2) {
                           int var173 = this.field10287[var99];
                           int var174 = (var173 & 16711935) * class304.field4612 & -16711936;
                           int var175 = (var173 & 65280) * class304.field4612 & 16711680;
                           int var176 = ((var174 | var175) >>> 8) + class304.field4592;
                           int var177 = var3[var100];
                           int var178 = var176 + var177;
                           int var179 = (var176 & 16711935) + (var177 & 16711935);
                           int var180 = (var178 - var179 & 65536) + (var179 & 16777472);
                           var3[var100] = var178 - var180 | var180 - (var180 >>> 8);
                        }
                     }

                     var94 += class304.field4610;
                     ++var95;
                  }
               }

               ++var91;
               class304.field4599 += class304.field4620;
               class304.field4604 += class304.field4595;
            }

         } else {
            int var181 = class304.field4616;

            while(var181 < 0) {
               int var182 = class304.field4604;
               int var183 = class304.field4599;
               int var184 = class304.field4598 + class304.field4593;
               int var185 = class304.field4597;
               if (var183 >= 0 && var183 - (super.field4618 << 12) < 0) {
                  if (var184 < 0) {
                     int var186 = (class304.field4610 - 1 - var184) / class304.field4610;
                     var185 += var186;
                     var184 += class304.field4610 * var186;
                     var182 += var186;
                  }

                  int var187;
                  if ((var187 = (var184 + 1 - (super.field4607 << 12) - class304.field4610) / class304.field4610) > var185) {
                     var185 = var187;
                  }

                  while(var185 < 0) {
                     int var188 = (var183 >> 12) + (var184 >> 12) * super.field4618;
                     int var189 = var182++;
                     if (arg1 == 0) {
                        if (arg0 == 1) {
                           var3[var189] = this.field10287[var188];
                        } else if (arg0 == 0) {
                           int var193 = this.field10287[var188++];
                           int var194 = (var193 & 16711680) * class304.field4594 & -16777216;
                           int var195 = (var193 & 65280) * class304.field4609 & 16711680;
                           int var196 = (var193 & 255) * class304.field4615 & 65280;
                           var3[var189] = (var194 | var195 | var196) >>> 8;
                        } else if (arg0 == 3) {
                           int var197 = this.field10287[var188++];
                           int var198 = class304.field4600;
                           int var199 = var197 + var198;
                           int var200 = (var197 & 16711935) + (var198 & 16711935);
                           int var201 = (var199 - var200 & 65536) + (var200 & 16777472);
                           var3[var189] = var199 - var201 | var201 - (var201 >>> 8);
                        } else {
                           if (arg0 != 2) {
                              throw new IllegalArgumentException();
                           }

                           int var202 = this.field10287[var188];
                           int var203 = (var202 & 16711935) * class304.field4612 & -16711936;
                           int var204 = (var202 & 65280) * class304.field4612 & 16711680;
                           var3[var189] = ((var203 | var204) >>> 8) + class304.field4592;
                        }
                     } else if (arg1 == 1) {
                        if (arg0 == 1) {
                           int var205 = this.field10287[var188];
                           int var206 = var205 >>> 24;
                           int var207 = 256 - var206;
                           int var208 = var3[var189];
                           var3[var189] = ((var205 & 16711935) * var206 + (var208 & 16711935) * var207 & -16711936) + ((var205 & 65280) * var206 + (var208 & 65280) * var207 & 16711680) >> 8;
                        } else if (arg0 == 0) {
                           int var209 = this.field10287[var188];
                           int var210 = (var209 >>> 24) * class304.field4612 >> 8;
                           int var211 = 256 - var210;
                           if ((class304.field4600 & 16777215) == 16777215) {
                              int var212 = var3[var189];
                              var3[var189] = ((var209 & 16711935) * var210 + (var212 & 16711935) * var211 & -16711936) + ((var209 & 65280) * var210 + (var212 & 65280) * var211 & 16711680) >> 8;
                           } else if (var210 != 255) {
                              int var213 = (var209 & 16711680) * class304.field4594 & -16777216;
                              int var214 = (var209 & 65280) * class304.field4609 & 16711680;
                              int var215 = (var209 & 255) * class304.field4615 & 65280;
                              int var216 = (var213 | var214 | var215) >>> 8;
                              int var217 = var3[var189];
                              var3[var189] = ((var216 & 16711935) * var210 + (var217 & 16711935) * var211 & -16711936) + ((var216 & 65280) * var210 + (var217 & 65280) * var211 & 16711680) >> 8;
                           } else {
                              int var218 = (var209 & 16711680) * class304.field4594 & -16777216;
                              int var219 = (var209 & 65280) * class304.field4609 & 16711680;
                              int var220 = (var209 & 255) * class304.field4615 & 65280;
                              var3[var189] = (var218 | var219 | var220) >>> 8;
                           }
                        } else if (arg0 == 3) {
                           int var221 = this.field10287[var188];
                           int var222 = class304.field4600;
                           int var223 = var221 + var222;
                           int var224 = (var221 & 16711935) + (var222 & 16711935);
                           int var225 = (var223 - var224 & 65536) + (var224 & 16777472);
                           int var226 = var223 - var225 | var225 - (var225 >>> 8);
                           int var227 = (var221 >>> 24) * class304.field4612 >> 8;
                           int var228 = 256 - var227;
                           if (var227 != 255) {
                              int var230 = var3[var189];
                              var226 = ((var226 & 16711935) * var227 + (var230 & 16711935) * var228 & -16711936) + ((var226 & 65280) * var227 + (var230 & 65280) * var228 & 16711680) >> 8;
                           }

                           var3[var189] = var226;
                        } else {
                           if (arg0 != 2) {
                              throw new IllegalArgumentException();
                           }

                           int var231 = this.field10287[var188];
                           int var232 = var231 >>> 24;
                           int var233 = 256 - var232;
                           int var234 = (var231 & 16711935) * class304.field4612 & -16711936;
                           int var235 = (var231 & 65280) * class304.field4612 & 16711680;
                           int var236 = ((var234 | var235) >>> 8) + class304.field4592;
                           int var237 = var3[var189];
                           var3[var189] = ((var236 & 16711935) * var232 + (var237 & 16711935) * var233 & -16711936) + ((var236 & 65280) * var232 + (var237 & 65280) * var233 & 16711680) >> 8;
                        }
                     } else {
                        if (arg1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (arg0 == 1) {
                           int var238 = this.field10287[var188];
                           int var239 = var3[var189];
                           int var240 = var238 + var239;
                           int var241 = (var238 & 16711935) + (var239 & 16711935);
                           int var242 = (var240 - var241 & 65536) + (var241 & 16777472);
                           var3[var189] = var240 - var242 | var242 - (var242 >>> 8);
                        } else if (arg0 == 0) {
                           int var243 = this.field10287[var188];
                           int var244 = (var243 & 16711680) * class304.field4594 & -16777216;
                           int var245 = (var243 & 65280) * class304.field4609 & 16711680;
                           int var246 = (var243 & 255) * class304.field4615 & 65280;
                           int var247 = (var244 | var245 | var246) >>> 8;
                           int var248 = var3[var189];
                           int var249 = var247 + var248;
                           int var250 = (var247 & 16711935) + (var248 & 16711935);
                           int var251 = (var249 - var250 & 65536) + (var250 & 16777472);
                           var3[var189] = var249 - var251 | var251 - (var251 >>> 8);
                        } else if (arg0 == 3) {
                           int var252 = this.field10287[var188];
                           int var253 = class304.field4600;
                           int var254 = var252 + var253;
                           int var255 = (var252 & 16711935) + (var253 & 16711935);
                           int var256 = (var254 - var255 & 65536) + (var255 & 16777472);
                           int var257 = var254 - var256 | var256 - (var256 >>> 8);
                           int var258 = var3[var189];
                           int var259 = var257 + var258;
                           int var260 = (var257 & 16711935) + (var258 & 16711935);
                           int var261 = (var259 - var260 & 65536) + (var260 & 16777472);
                           var3[var189] = var259 - var261 | var261 - (var261 >>> 8);
                        } else if (arg0 == 2) {
                           int var262 = this.field10287[var188];
                           int var263 = (var262 & 16711935) * class304.field4612 & -16711936;
                           int var264 = (var262 & 65280) * class304.field4612 & 16711680;
                           int var265 = ((var263 | var264) >>> 8) + class304.field4592;
                           int var266 = var3[var189];
                           int var267 = var265 + var266;
                           int var268 = (var265 & 16711935) + (var266 & 16711935);
                           int var269 = (var267 - var268 & 65536) + (var268 & 16777472);
                           var3[var189] = var267 - var269 | var269 - (var269 >>> 8);
                        }
                     }

                     var184 += class304.field4610;
                     ++var185;
                  }
               }

               ++var181;
               class304.field4599 += class304.field4620;
               class304.field4604 += class304.field4595;
            }

         }
      } else if (class304.field4606 < 0) {
         if (class304.field4610 == 0) {
            int var270 = class304.field4616;

            while(var270 < 0) {
               int var271 = class304.field4604;
               int var272 = class304.field4611 + class304.field4599;
               int var273 = class304.field4598;
               int var274 = class304.field4597;
               if (var273 >= 0 && var273 - (super.field4607 << 12) < 0) {
                  int var275;
                  if ((var275 = var272 - (super.field4618 << 12)) >= 0) {
                     int var276 = (class304.field4606 - var275) / class304.field4606;
                     var274 += var276;
                     var272 += class304.field4606 * var276;
                     var271 += var276;
                  }

                  int var277;
                  if ((var277 = (var272 - class304.field4606) / class304.field4606) > var274) {
                     var274 = var277;
                  }

                  while(var274 < 0) {
                     int var278 = (var272 >> 12) + (var273 >> 12) * super.field4618;
                     int var279 = var271++;
                     if (arg1 == 0) {
                        if (arg0 == 1) {
                           var3[var279] = this.field10287[var278];
                        } else if (arg0 == 0) {
                           int var283 = this.field10287[var278++];
                           int var284 = (var283 & 16711680) * class304.field4594 & -16777216;
                           int var285 = (var283 & 65280) * class304.field4609 & 16711680;
                           int var286 = (var283 & 255) * class304.field4615 & 65280;
                           var3[var279] = (var284 | var285 | var286) >>> 8;
                        } else if (arg0 == 3) {
                           int var287 = this.field10287[var278++];
                           int var288 = class304.field4600;
                           int var289 = var287 + var288;
                           int var290 = (var287 & 16711935) + (var288 & 16711935);
                           int var291 = (var289 - var290 & 65536) + (var290 & 16777472);
                           var3[var279] = var289 - var291 | var291 - (var291 >>> 8);
                        } else {
                           if (arg0 != 2) {
                              throw new IllegalArgumentException();
                           }

                           int var292 = this.field10287[var278];
                           int var293 = (var292 & 16711935) * class304.field4612 & -16711936;
                           int var294 = (var292 & 65280) * class304.field4612 & 16711680;
                           var3[var279] = ((var293 | var294) >>> 8) + class304.field4592;
                        }
                     } else if (arg1 == 1) {
                        if (arg0 == 1) {
                           int var295 = this.field10287[var278];
                           int var296 = var295 >>> 24;
                           int var297 = 256 - var296;
                           int var298 = var3[var279];
                           var3[var279] = ((var295 & 16711935) * var296 + (var298 & 16711935) * var297 & -16711936) + ((var295 & 65280) * var296 + (var298 & 65280) * var297 & 16711680) >> 8;
                        } else if (arg0 == 0) {
                           int var299 = this.field10287[var278];
                           int var300 = (var299 >>> 24) * class304.field4612 >> 8;
                           int var301 = 256 - var300;
                           if ((class304.field4600 & 16777215) == 16777215) {
                              int var302 = var3[var279];
                              var3[var279] = ((var299 & 16711935) * var300 + (var302 & 16711935) * var301 & -16711936) + ((var299 & 65280) * var300 + (var302 & 65280) * var301 & 16711680) >> 8;
                           } else if (var300 != 255) {
                              int var303 = (var299 & 16711680) * class304.field4594 & -16777216;
                              int var304 = (var299 & 65280) * class304.field4609 & 16711680;
                              int var305 = (var299 & 255) * class304.field4615 & 65280;
                              int var306 = (var303 | var304 | var305) >>> 8;
                              int var307 = var3[var279];
                              var3[var279] = ((var306 & 16711935) * var300 + (var307 & 16711935) * var301 & -16711936) + ((var306 & 65280) * var300 + (var307 & 65280) * var301 & 16711680) >> 8;
                           } else {
                              int var308 = (var299 & 16711680) * class304.field4594 & -16777216;
                              int var309 = (var299 & 65280) * class304.field4609 & 16711680;
                              int var310 = (var299 & 255) * class304.field4615 & 65280;
                              var3[var279] = (var308 | var309 | var310) >>> 8;
                           }
                        } else if (arg0 == 3) {
                           int var311 = this.field10287[var278];
                           int var312 = class304.field4600;
                           int var313 = var311 + var312;
                           int var314 = (var311 & 16711935) + (var312 & 16711935);
                           int var315 = (var313 - var314 & 65536) + (var314 & 16777472);
                           int var316 = var313 - var315 | var315 - (var315 >>> 8);
                           int var317 = (var311 >>> 24) * class304.field4612 >> 8;
                           int var318 = 256 - var317;
                           if (var317 != 255) {
                              int var320 = var3[var279];
                              var316 = ((var316 & 16711935) * var317 + (var320 & 16711935) * var318 & -16711936) + ((var316 & 65280) * var317 + (var320 & 65280) * var318 & 16711680) >> 8;
                           }

                           var3[var279] = var316;
                        } else {
                           if (arg0 != 2) {
                              throw new IllegalArgumentException();
                           }

                           int var321 = this.field10287[var278];
                           int var322 = var321 >>> 24;
                           int var323 = 256 - var322;
                           int var324 = (var321 & 16711935) * class304.field4612 & -16711936;
                           int var325 = (var321 & 65280) * class304.field4612 & 16711680;
                           int var326 = ((var324 | var325) >>> 8) + class304.field4592;
                           int var327 = var3[var279];
                           var3[var279] = ((var326 & 16711935) * var322 + (var327 & 16711935) * var323 & -16711936) + ((var326 & 65280) * var322 + (var327 & 65280) * var323 & 16711680) >> 8;
                        }
                     } else {
                        if (arg1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (arg0 == 1) {
                           int var328 = this.field10287[var278];
                           int var329 = var3[var279];
                           int var330 = var328 + var329;
                           int var331 = (var328 & 16711935) + (var329 & 16711935);
                           int var332 = (var330 - var331 & 65536) + (var331 & 16777472);
                           var3[var279] = var330 - var332 | var332 - (var332 >>> 8);
                        } else if (arg0 == 0) {
                           int var333 = this.field10287[var278];
                           int var334 = (var333 & 16711680) * class304.field4594 & -16777216;
                           int var335 = (var333 & 65280) * class304.field4609 & 16711680;
                           int var336 = (var333 & 255) * class304.field4615 & 65280;
                           int var337 = (var334 | var335 | var336) >>> 8;
                           int var338 = var3[var279];
                           int var339 = var337 + var338;
                           int var340 = (var337 & 16711935) + (var338 & 16711935);
                           int var341 = (var339 - var340 & 65536) + (var340 & 16777472);
                           var3[var279] = var339 - var341 | var341 - (var341 >>> 8);
                        } else if (arg0 == 3) {
                           int var342 = this.field10287[var278];
                           int var343 = class304.field4600;
                           int var344 = var342 + var343;
                           int var345 = (var342 & 16711935) + (var343 & 16711935);
                           int var346 = (var344 - var345 & 65536) + (var345 & 16777472);
                           int var347 = var344 - var346 | var346 - (var346 >>> 8);
                           int var348 = var3[var279];
                           int var349 = var347 + var348;
                           int var350 = (var347 & 16711935) + (var348 & 16711935);
                           int var351 = (var349 - var350 & 65536) + (var350 & 16777472);
                           var3[var279] = var349 - var351 | var351 - (var351 >>> 8);
                        } else if (arg0 == 2) {
                           int var352 = this.field10287[var278];
                           int var353 = (var352 & 16711935) * class304.field4612 & -16711936;
                           int var354 = (var352 & 65280) * class304.field4612 & 16711680;
                           int var355 = ((var353 | var354) >>> 8) + class304.field4592;
                           int var356 = var3[var279];
                           int var357 = var355 + var356;
                           int var358 = (var355 & 16711935) + (var356 & 16711935);
                           int var359 = (var357 - var358 & 65536) + (var358 & 16777472);
                           var3[var279] = var357 - var359 | var359 - (var359 >>> 8);
                        }
                     }

                     var272 += class304.field4606;
                     ++var274;
                  }
               }

               ++var270;
               class304.field4598 += class304.field4591;
               class304.field4604 += class304.field4595;
            }

         } else if (class304.field4610 < 0) {
            int var360 = class304.field4616;

            while(var360 < 0) {
               int var361 = class304.field4604;
               int var362 = class304.field4611 + class304.field4599;
               int var363 = class304.field4598 + class304.field4593;
               int var364 = class304.field4597;
               int var365;
               if ((var365 = var362 - (super.field4618 << 12)) >= 0) {
                  int var366 = (class304.field4606 - var365) / class304.field4606;
                  var364 += var366;
                  var362 += class304.field4606 * var366;
                  var363 += class304.field4610 * var366;
                  var361 += var366;
               }

               int var367;
               if ((var367 = (var362 - class304.field4606) / class304.field4606) > var364) {
                  var364 = var367;
               }

               int var368;
               if ((var368 = var363 - (super.field4607 << 12)) >= 0) {
                  int var369 = (class304.field4610 - var368) / class304.field4610;
                  var364 += var369;
                  var362 += class304.field4606 * var369;
                  var363 += class304.field4610 * var369;
                  var361 += var369;
               }

               int var370;
               if ((var370 = (var363 - class304.field4610) / class304.field4610) > var364) {
                  var364 = var370;
               }

               while(var364 < 0) {
                  int var371 = (var362 >> 12) + (var363 >> 12) * super.field4618;
                  int var372 = var361++;
                  if (arg1 == 0) {
                     if (arg0 == 1) {
                        var3[var372] = this.field10287[var371];
                     } else if (arg0 == 0) {
                        int var376 = this.field10287[var371++];
                        int var377 = (var376 & 16711680) * class304.field4594 & -16777216;
                        int var378 = (var376 & 65280) * class304.field4609 & 16711680;
                        int var379 = (var376 & 255) * class304.field4615 & 65280;
                        var3[var372] = (var377 | var378 | var379) >>> 8;
                     } else if (arg0 == 3) {
                        int var380 = this.field10287[var371++];
                        int var381 = class304.field4600;
                        int var382 = var380 + var381;
                        int var383 = (var380 & 16711935) + (var381 & 16711935);
                        int var384 = (var382 - var383 & 65536) + (var383 & 16777472);
                        var3[var372] = var382 - var384 | var384 - (var384 >>> 8);
                     } else {
                        if (arg0 != 2) {
                           throw new IllegalArgumentException();
                        }

                        int var385 = this.field10287[var371];
                        int var386 = (var385 & 16711935) * class304.field4612 & -16711936;
                        int var387 = (var385 & 65280) * class304.field4612 & 16711680;
                        var3[var372] = ((var386 | var387) >>> 8) + class304.field4592;
                     }
                  } else if (arg1 == 1) {
                     if (arg0 == 1) {
                        int var388 = this.field10287[var371];
                        int var389 = var388 >>> 24;
                        int var390 = 256 - var389;
                        int var391 = var3[var372];
                        var3[var372] = ((var388 & 16711935) * var389 + (var391 & 16711935) * var390 & -16711936) + ((var388 & 65280) * var389 + (var391 & 65280) * var390 & 16711680) >> 8;
                     } else if (arg0 == 0) {
                        int var392 = this.field10287[var371];
                        int var393 = (var392 >>> 24) * class304.field4612 >> 8;
                        int var394 = 256 - var393;
                        if ((class304.field4600 & 16777215) == 16777215) {
                           int var395 = var3[var372];
                           var3[var372] = ((var392 & 16711935) * var393 + (var395 & 16711935) * var394 & -16711936) + ((var392 & 65280) * var393 + (var395 & 65280) * var394 & 16711680) >> 8;
                        } else if (var393 != 255) {
                           int var396 = (var392 & 16711680) * class304.field4594 & -16777216;
                           int var397 = (var392 & 65280) * class304.field4609 & 16711680;
                           int var398 = (var392 & 255) * class304.field4615 & 65280;
                           int var399 = (var396 | var397 | var398) >>> 8;
                           int var400 = var3[var372];
                           var3[var372] = ((var399 & 16711935) * var393 + (var400 & 16711935) * var394 & -16711936) + ((var399 & 65280) * var393 + (var400 & 65280) * var394 & 16711680) >> 8;
                        } else {
                           int var401 = (var392 & 16711680) * class304.field4594 & -16777216;
                           int var402 = (var392 & 65280) * class304.field4609 & 16711680;
                           int var403 = (var392 & 255) * class304.field4615 & 65280;
                           var3[var372] = (var401 | var402 | var403) >>> 8;
                        }
                     } else if (arg0 == 3) {
                        int var404 = this.field10287[var371];
                        int var405 = class304.field4600;
                        int var406 = var404 + var405;
                        int var407 = (var404 & 16711935) + (var405 & 16711935);
                        int var408 = (var406 - var407 & 65536) + (var407 & 16777472);
                        int var409 = var406 - var408 | var408 - (var408 >>> 8);
                        int var410 = (var404 >>> 24) * class304.field4612 >> 8;
                        int var411 = 256 - var410;
                        if (var410 != 255) {
                           int var413 = var3[var372];
                           var409 = ((var409 & 16711935) * var410 + (var413 & 16711935) * var411 & -16711936) + ((var409 & 65280) * var410 + (var413 & 65280) * var411 & 16711680) >> 8;
                        }

                        var3[var372] = var409;
                     } else {
                        if (arg0 != 2) {
                           throw new IllegalArgumentException();
                        }

                        int var414 = this.field10287[var371];
                        int var415 = var414 >>> 24;
                        int var416 = 256 - var415;
                        int var417 = (var414 & 16711935) * class304.field4612 & -16711936;
                        int var418 = (var414 & 65280) * class304.field4612 & 16711680;
                        int var419 = ((var417 | var418) >>> 8) + class304.field4592;
                        int var420 = var3[var372];
                        var3[var372] = ((var419 & 16711935) * var415 + (var420 & 16711935) * var416 & -16711936) + ((var419 & 65280) * var415 + (var420 & 65280) * var416 & 16711680) >> 8;
                     }
                  } else {
                     if (arg1 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (arg0 == 1) {
                        int var421 = this.field10287[var371];
                        int var422 = var3[var372];
                        int var423 = var421 + var422;
                        int var424 = (var421 & 16711935) + (var422 & 16711935);
                        int var425 = (var423 - var424 & 65536) + (var424 & 16777472);
                        var3[var372] = var423 - var425 | var425 - (var425 >>> 8);
                     } else if (arg0 == 0) {
                        int var426 = this.field10287[var371];
                        int var427 = (var426 & 16711680) * class304.field4594 & -16777216;
                        int var428 = (var426 & 65280) * class304.field4609 & 16711680;
                        int var429 = (var426 & 255) * class304.field4615 & 65280;
                        int var430 = (var427 | var428 | var429) >>> 8;
                        int var431 = var3[var372];
                        int var432 = var430 + var431;
                        int var433 = (var430 & 16711935) + (var431 & 16711935);
                        int var434 = (var432 - var433 & 65536) + (var433 & 16777472);
                        var3[var372] = var432 - var434 | var434 - (var434 >>> 8);
                     } else if (arg0 == 3) {
                        int var435 = this.field10287[var371];
                        int var436 = class304.field4600;
                        int var437 = var435 + var436;
                        int var438 = (var435 & 16711935) + (var436 & 16711935);
                        int var439 = (var437 - var438 & 65536) + (var438 & 16777472);
                        int var440 = var437 - var439 | var439 - (var439 >>> 8);
                        int var441 = var3[var372];
                        int var442 = var440 + var441;
                        int var443 = (var440 & 16711935) + (var441 & 16711935);
                        int var444 = (var442 - var443 & 65536) + (var443 & 16777472);
                        var3[var372] = var442 - var444 | var444 - (var444 >>> 8);
                     } else if (arg0 == 2) {
                        int var445 = this.field10287[var371];
                        int var446 = (var445 & 16711935) * class304.field4612 & -16711936;
                        int var447 = (var445 & 65280) * class304.field4612 & 16711680;
                        int var448 = ((var446 | var447) >>> 8) + class304.field4592;
                        int var449 = var3[var372];
                        int var450 = var448 + var449;
                        int var451 = (var448 & 16711935) + (var449 & 16711935);
                        int var452 = (var450 - var451 & 65536) + (var451 & 16777472);
                        var3[var372] = var450 - var452 | var452 - (var452 >>> 8);
                     }
                  }

                  var362 += class304.field4606;
                  var363 += class304.field4610;
                  ++var364;
               }

               ++var360;
               class304.field4599 += class304.field4620;
               class304.field4598 += class304.field4591;
               class304.field4604 += class304.field4595;
            }

         } else {
            int var453 = class304.field4616;

            while(var453 < 0) {
               int var454 = class304.field4604;
               int var455 = class304.field4611 + class304.field4599;
               int var456 = class304.field4598 + class304.field4593;
               int var457 = class304.field4597;
               int var458;
               if ((var458 = var455 - (super.field4618 << 12)) >= 0) {
                  int var459 = (class304.field4606 - var458) / class304.field4606;
                  var457 += var459;
                  var455 += class304.field4606 * var459;
                  var456 += class304.field4610 * var459;
                  var454 += var459;
               }

               int var460;
               if ((var460 = (var455 - class304.field4606) / class304.field4606) > var457) {
                  var457 = var460;
               }

               if (var456 < 0) {
                  int var461 = (class304.field4610 - 1 - var456) / class304.field4610;
                  var457 += var461;
                  var455 += class304.field4606 * var461;
                  var456 += class304.field4610 * var461;
                  var454 += var461;
               }

               int var462;
               if ((var462 = (var456 + 1 - (super.field4607 << 12) - class304.field4610) / class304.field4610) > var457) {
                  var457 = var462;
               }

               while(var457 < 0) {
                  int var463 = (var455 >> 12) + (var456 >> 12) * super.field4618;
                  int var464 = var454++;
                  if (arg1 == 0) {
                     if (arg0 == 1) {
                        var3[var464] = this.field10287[var463];
                     } else if (arg0 == 0) {
                        int var468 = this.field10287[var463++];
                        int var469 = (var468 & 16711680) * class304.field4594 & -16777216;
                        int var470 = (var468 & 65280) * class304.field4609 & 16711680;
                        int var471 = (var468 & 255) * class304.field4615 & 65280;
                        var3[var464] = (var469 | var470 | var471) >>> 8;
                     } else if (arg0 == 3) {
                        int var472 = this.field10287[var463++];
                        int var473 = class304.field4600;
                        int var474 = var472 + var473;
                        int var475 = (var472 & 16711935) + (var473 & 16711935);
                        int var476 = (var474 - var475 & 65536) + (var475 & 16777472);
                        var3[var464] = var474 - var476 | var476 - (var476 >>> 8);
                     } else {
                        if (arg0 != 2) {
                           throw new IllegalArgumentException();
                        }

                        int var477 = this.field10287[var463];
                        int var478 = (var477 & 16711935) * class304.field4612 & -16711936;
                        int var479 = (var477 & 65280) * class304.field4612 & 16711680;
                        var3[var464] = ((var478 | var479) >>> 8) + class304.field4592;
                     }
                  } else if (arg1 == 1) {
                     if (arg0 == 1) {
                        int var480 = this.field10287[var463];
                        int var481 = var480 >>> 24;
                        int var482 = 256 - var481;
                        int var483 = var3[var464];
                        var3[var464] = ((var480 & 16711935) * var481 + (var483 & 16711935) * var482 & -16711936) + ((var480 & 65280) * var481 + (var483 & 65280) * var482 & 16711680) >> 8;
                     } else if (arg0 == 0) {
                        int var484 = this.field10287[var463];
                        int var485 = (var484 >>> 24) * class304.field4612 >> 8;
                        int var486 = 256 - var485;
                        if ((class304.field4600 & 16777215) == 16777215) {
                           int var487 = var3[var464];
                           var3[var464] = ((var484 & 16711935) * var485 + (var487 & 16711935) * var486 & -16711936) + ((var484 & 65280) * var485 + (var487 & 65280) * var486 & 16711680) >> 8;
                        } else if (var485 != 255) {
                           int var488 = (var484 & 16711680) * class304.field4594 & -16777216;
                           int var489 = (var484 & 65280) * class304.field4609 & 16711680;
                           int var490 = (var484 & 255) * class304.field4615 & 65280;
                           int var491 = (var488 | var489 | var490) >>> 8;
                           int var492 = var3[var464];
                           var3[var464] = ((var491 & 16711935) * var485 + (var492 & 16711935) * var486 & -16711936) + ((var491 & 65280) * var485 + (var492 & 65280) * var486 & 16711680) >> 8;
                        } else {
                           int var493 = (var484 & 16711680) * class304.field4594 & -16777216;
                           int var494 = (var484 & 65280) * class304.field4609 & 16711680;
                           int var495 = (var484 & 255) * class304.field4615 & 65280;
                           var3[var464] = (var493 | var494 | var495) >>> 8;
                        }
                     } else if (arg0 == 3) {
                        int var496 = this.field10287[var463];
                        int var497 = class304.field4600;
                        int var498 = var496 + var497;
                        int var499 = (var496 & 16711935) + (var497 & 16711935);
                        int var500 = (var498 - var499 & 65536) + (var499 & 16777472);
                        int var501 = var498 - var500 | var500 - (var500 >>> 8);
                        int var502 = (var496 >>> 24) * class304.field4612 >> 8;
                        int var503 = 256 - var502;
                        if (var502 != 255) {
                           int var505 = var3[var464];
                           var501 = ((var501 & 16711935) * var502 + (var505 & 16711935) * var503 & -16711936) + ((var501 & 65280) * var502 + (var505 & 65280) * var503 & 16711680) >> 8;
                        }

                        var3[var464] = var501;
                     } else {
                        if (arg0 != 2) {
                           throw new IllegalArgumentException();
                        }

                        int var506 = this.field10287[var463];
                        int var507 = var506 >>> 24;
                        int var508 = 256 - var507;
                        int var509 = (var506 & 16711935) * class304.field4612 & -16711936;
                        int var510 = (var506 & 65280) * class304.field4612 & 16711680;
                        int var511 = ((var509 | var510) >>> 8) + class304.field4592;
                        int var512 = var3[var464];
                        var3[var464] = ((var511 & 16711935) * var507 + (var512 & 16711935) * var508 & -16711936) + ((var511 & 65280) * var507 + (var512 & 65280) * var508 & 16711680) >> 8;
                     }
                  } else {
                     if (arg1 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (arg0 == 1) {
                        int var513 = this.field10287[var463];
                        int var514 = var3[var464];
                        int var515 = var513 + var514;
                        int var516 = (var513 & 16711935) + (var514 & 16711935);
                        int var517 = (var515 - var516 & 65536) + (var516 & 16777472);
                        var3[var464] = var515 - var517 | var517 - (var517 >>> 8);
                     } else if (arg0 == 0) {
                        int var518 = this.field10287[var463];
                        int var519 = (var518 & 16711680) * class304.field4594 & -16777216;
                        int var520 = (var518 & 65280) * class304.field4609 & 16711680;
                        int var521 = (var518 & 255) * class304.field4615 & 65280;
                        int var522 = (var519 | var520 | var521) >>> 8;
                        int var523 = var3[var464];
                        int var524 = var522 + var523;
                        int var525 = (var522 & 16711935) + (var523 & 16711935);
                        int var526 = (var524 - var525 & 65536) + (var525 & 16777472);
                        var3[var464] = var524 - var526 | var526 - (var526 >>> 8);
                     } else if (arg0 == 3) {
                        int var527 = this.field10287[var463];
                        int var528 = class304.field4600;
                        int var529 = var527 + var528;
                        int var530 = (var527 & 16711935) + (var528 & 16711935);
                        int var531 = (var529 - var530 & 65536) + (var530 & 16777472);
                        int var532 = var529 - var531 | var531 - (var531 >>> 8);
                        int var533 = var3[var464];
                        int var534 = var532 + var533;
                        int var535 = (var532 & 16711935) + (var533 & 16711935);
                        int var536 = (var534 - var535 & 65536) + (var535 & 16777472);
                        var3[var464] = var534 - var536 | var536 - (var536 >>> 8);
                     } else if (arg0 == 2) {
                        int var537 = this.field10287[var463];
                        int var538 = (var537 & 16711935) * class304.field4612 & -16711936;
                        int var539 = (var537 & 65280) * class304.field4612 & 16711680;
                        int var540 = ((var538 | var539) >>> 8) + class304.field4592;
                        int var541 = var3[var464];
                        int var542 = var540 + var541;
                        int var543 = (var540 & 16711935) + (var541 & 16711935);
                        int var544 = (var542 - var543 & 65536) + (var543 & 16777472);
                        var3[var464] = var542 - var544 | var544 - (var544 >>> 8);
                     }
                  }

                  var455 += class304.field4606;
                  var456 += class304.field4610;
                  ++var457;
               }

               ++var453;
               class304.field4599 += class304.field4620;
               class304.field4598 += class304.field4591;
               class304.field4604 += class304.field4595;
            }

         }
      } else if (class304.field4610 == 0) {
         int var545 = class304.field4616;

         while(var545 < 0) {
            int var546 = class304.field4604;
            int var547 = class304.field4611 + class304.field4599;
            int var548 = class304.field4598;
            int var549 = class304.field4597;
            if (var548 >= 0 && var548 - (super.field4607 << 12) < 0) {
               if (var547 < 0) {
                  int var550 = (class304.field4606 - 1 - var547) / class304.field4606;
                  var549 += var550;
                  var547 += class304.field4606 * var550;
                  var546 += var550;
               }

               int var551;
               if ((var551 = (var547 + 1 - (super.field4618 << 12) - class304.field4606) / class304.field4606) > var549) {
                  var549 = var551;
               }

               while(var549 < 0) {
                  int var552 = (var547 >> 12) + (var548 >> 12) * super.field4618;
                  int var553 = var546++;
                  if (arg1 == 0) {
                     if (arg0 == 1) {
                        var3[var553] = this.field10287[var552];
                     } else if (arg0 == 0) {
                        int var557 = this.field10287[var552++];
                        int var558 = (var557 & 16711680) * class304.field4594 & -16777216;
                        int var559 = (var557 & 65280) * class304.field4609 & 16711680;
                        int var560 = (var557 & 255) * class304.field4615 & 65280;
                        var3[var553] = (var558 | var559 | var560) >>> 8;
                     } else if (arg0 == 3) {
                        int var561 = this.field10287[var552++];
                        int var562 = class304.field4600;
                        int var563 = var561 + var562;
                        int var564 = (var561 & 16711935) + (var562 & 16711935);
                        int var565 = (var563 - var564 & 65536) + (var564 & 16777472);
                        var3[var553] = var563 - var565 | var565 - (var565 >>> 8);
                     } else {
                        if (arg0 != 2) {
                           throw new IllegalArgumentException();
                        }

                        int var566 = this.field10287[var552];
                        int var567 = (var566 & 16711935) * class304.field4612 & -16711936;
                        int var568 = (var566 & 65280) * class304.field4612 & 16711680;
                        var3[var553] = ((var567 | var568) >>> 8) + class304.field4592;
                     }
                  } else if (arg1 == 1) {
                     if (arg0 == 1) {
                        int var569 = this.field10287[var552];
                        int var570 = var569 >>> 24;
                        int var571 = 256 - var570;
                        int var572 = var3[var553];
                        var3[var553] = ((var569 & 16711935) * var570 + (var572 & 16711935) * var571 & -16711936) + ((var569 & 65280) * var570 + (var572 & 65280) * var571 & 16711680) >> 8;
                     } else if (arg0 == 0) {
                        int var573 = this.field10287[var552];
                        int var574 = (var573 >>> 24) * class304.field4612 >> 8;
                        int var575 = 256 - var574;
                        if ((class304.field4600 & 16777215) == 16777215) {
                           int var576 = var3[var553];
                           var3[var553] = ((var573 & 16711935) * var574 + (var576 & 16711935) * var575 & -16711936) + ((var573 & 65280) * var574 + (var576 & 65280) * var575 & 16711680) >> 8;
                        } else if (var574 != 255) {
                           int var577 = (var573 & 16711680) * class304.field4594 & -16777216;
                           int var578 = (var573 & 65280) * class304.field4609 & 16711680;
                           int var579 = (var573 & 255) * class304.field4615 & 65280;
                           int var580 = (var577 | var578 | var579) >>> 8;
                           int var581 = var3[var553];
                           var3[var553] = ((var580 & 16711935) * var574 + (var581 & 16711935) * var575 & -16711936) + ((var580 & 65280) * var574 + (var581 & 65280) * var575 & 16711680) >> 8;
                        } else {
                           int var582 = (var573 & 16711680) * class304.field4594 & -16777216;
                           int var583 = (var573 & 65280) * class304.field4609 & 16711680;
                           int var584 = (var573 & 255) * class304.field4615 & 65280;
                           var3[var553] = (var582 | var583 | var584) >>> 8;
                        }
                     } else if (arg0 == 3) {
                        int var585 = this.field10287[var552];
                        int var586 = class304.field4600;
                        int var587 = var585 + var586;
                        int var588 = (var585 & 16711935) + (var586 & 16711935);
                        int var589 = (var587 - var588 & 65536) + (var588 & 16777472);
                        int var590 = var587 - var589 | var589 - (var589 >>> 8);
                        int var591 = (var585 >>> 24) * class304.field4612 >> 8;
                        int var592 = 256 - var591;
                        if (var591 != 255) {
                           int var594 = var3[var553];
                           var590 = ((var590 & 16711935) * var591 + (var594 & 16711935) * var592 & -16711936) + ((var590 & 65280) * var591 + (var594 & 65280) * var592 & 16711680) >> 8;
                        }

                        var3[var553] = var590;
                     } else {
                        if (arg0 != 2) {
                           throw new IllegalArgumentException();
                        }

                        int var595 = this.field10287[var552];
                        int var596 = var595 >>> 24;
                        int var597 = 256 - var596;
                        int var598 = (var595 & 16711935) * class304.field4612 & -16711936;
                        int var599 = (var595 & 65280) * class304.field4612 & 16711680;
                        int var600 = ((var598 | var599) >>> 8) + class304.field4592;
                        int var601 = var3[var553];
                        var3[var553] = ((var600 & 16711935) * var596 + (var601 & 16711935) * var597 & -16711936) + ((var600 & 65280) * var596 + (var601 & 65280) * var597 & 16711680) >> 8;
                     }
                  } else {
                     if (arg1 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (arg0 == 1) {
                        int var602 = this.field10287[var552];
                        int var603 = var3[var553];
                        int var604 = var602 + var603;
                        int var605 = (var602 & 16711935) + (var603 & 16711935);
                        int var606 = (var604 - var605 & 65536) + (var605 & 16777472);
                        var3[var553] = var604 - var606 | var606 - (var606 >>> 8);
                     } else if (arg0 == 0) {
                        int var607 = this.field10287[var552];
                        int var608 = (var607 & 16711680) * class304.field4594 & -16777216;
                        int var609 = (var607 & 65280) * class304.field4609 & 16711680;
                        int var610 = (var607 & 255) * class304.field4615 & 65280;
                        int var611 = (var608 | var609 | var610) >>> 8;
                        int var612 = var3[var553];
                        int var613 = var611 + var612;
                        int var614 = (var611 & 16711935) + (var612 & 16711935);
                        int var615 = (var613 - var614 & 65536) + (var614 & 16777472);
                        var3[var553] = var613 - var615 | var615 - (var615 >>> 8);
                     } else if (arg0 == 3) {
                        int var616 = this.field10287[var552];
                        int var617 = class304.field4600;
                        int var618 = var616 + var617;
                        int var619 = (var616 & 16711935) + (var617 & 16711935);
                        int var620 = (var618 - var619 & 65536) + (var619 & 16777472);
                        int var621 = var618 - var620 | var620 - (var620 >>> 8);
                        int var622 = var3[var553];
                        int var623 = var621 + var622;
                        int var624 = (var621 & 16711935) + (var622 & 16711935);
                        int var625 = (var623 - var624 & 65536) + (var624 & 16777472);
                        var3[var553] = var623 - var625 | var625 - (var625 >>> 8);
                     } else if (arg0 == 2) {
                        int var626 = this.field10287[var552];
                        int var627 = (var626 & 16711935) * class304.field4612 & -16711936;
                        int var628 = (var626 & 65280) * class304.field4612 & 16711680;
                        int var629 = ((var627 | var628) >>> 8) + class304.field4592;
                        int var630 = var3[var553];
                        int var631 = var629 + var630;
                        int var632 = (var629 & 16711935) + (var630 & 16711935);
                        int var633 = (var631 - var632 & 65536) + (var632 & 16777472);
                        var3[var553] = var631 - var633 | var633 - (var633 >>> 8);
                     }
                  }

                  var547 += class304.field4606;
                  ++var549;
               }
            }

            ++var545;
            class304.field4599 += class304.field4620;
            class304.field4598 += class304.field4591;
            class304.field4604 += class304.field4595;
         }

      } else if (class304.field4610 < 0) {
         for(int var634 = class304.field4616; var634 < 0; ++var634) {
            int var635 = class304.field4604;
            int var636 = class304.field4611 + class304.field4599;
            int var637 = class304.field4598 + class304.field4593;
            int var638 = class304.field4597;
            if (var636 < 0) {
               int var639 = (class304.field4606 - 1 - var636) / class304.field4606;
               var638 += var639;
               var636 += class304.field4606 * var639;
               var637 += class304.field4610 * var639;
               var635 += var639;
            }

            int var640;
            if ((var640 = (var636 + 1 - (super.field4618 << 12) - class304.field4606) / class304.field4606) > var638) {
               var638 = var640;
            }

            int var641;
            if ((var641 = var637 - (super.field4607 << 12)) >= 0) {
               int var642 = (class304.field4610 - var641) / class304.field4610;
               var638 += var642;
               var636 += class304.field4606 * var642;
               var637 += class304.field4610 * var642;
               var635 += var642;
            }

            int var643;
            if ((var643 = (var637 - class304.field4610) / class304.field4610) > var638) {
               var638 = var643;
            }

            while(var638 < 0) {
               int var644 = (var636 >> 12) + (var637 >> 12) * super.field4618;
               int var645 = var635++;
               if (arg1 == 0) {
                  if (arg0 == 1) {
                     var3[var645] = this.field10287[var644];
                  } else if (arg0 == 0) {
                     int var649 = this.field10287[var644++];
                     int var650 = (var649 & 16711680) * class304.field4594 & -16777216;
                     int var651 = (var649 & 65280) * class304.field4609 & 16711680;
                     int var652 = (var649 & 255) * class304.field4615 & 65280;
                     var3[var645] = (var650 | var651 | var652) >>> 8;
                  } else if (arg0 == 3) {
                     int var653 = this.field10287[var644++];
                     int var654 = class304.field4600;
                     int var655 = var653 + var654;
                     int var656 = (var653 & 16711935) + (var654 & 16711935);
                     int var657 = (var655 - var656 & 65536) + (var656 & 16777472);
                     var3[var645] = var655 - var657 | var657 - (var657 >>> 8);
                  } else {
                     if (arg0 != 2) {
                        throw new IllegalArgumentException();
                     }

                     int var658 = this.field10287[var644];
                     int var659 = (var658 & 16711935) * class304.field4612 & -16711936;
                     int var660 = (var658 & 65280) * class304.field4612 & 16711680;
                     var3[var645] = ((var659 | var660) >>> 8) + class304.field4592;
                  }
               } else if (arg1 == 1) {
                  if (arg0 == 1) {
                     int var661 = this.field10287[var644];
                     int var662 = var661 >>> 24;
                     int var663 = 256 - var662;
                     int var664 = var3[var645];
                     var3[var645] = ((var661 & 16711935) * var662 + (var664 & 16711935) * var663 & -16711936) + ((var661 & 65280) * var662 + (var664 & 65280) * var663 & 16711680) >> 8;
                  } else if (arg0 == 0) {
                     int var665 = this.field10287[var644];
                     int var666 = (var665 >>> 24) * class304.field4612 >> 8;
                     int var667 = 256 - var666;
                     if ((class304.field4600 & 16777215) == 16777215) {
                        int var668 = var3[var645];
                        var3[var645] = ((var665 & 16711935) * var666 + (var668 & 16711935) * var667 & -16711936) + ((var665 & 65280) * var666 + (var668 & 65280) * var667 & 16711680) >> 8;
                     } else if (var666 != 255) {
                        int var669 = (var665 & 16711680) * class304.field4594 & -16777216;
                        int var670 = (var665 & 65280) * class304.field4609 & 16711680;
                        int var671 = (var665 & 255) * class304.field4615 & 65280;
                        int var672 = (var669 | var670 | var671) >>> 8;
                        int var673 = var3[var645];
                        var3[var645] = ((var672 & 16711935) * var666 + (var673 & 16711935) * var667 & -16711936) + ((var672 & 65280) * var666 + (var673 & 65280) * var667 & 16711680) >> 8;
                     } else {
                        int var674 = (var665 & 16711680) * class304.field4594 & -16777216;
                        int var675 = (var665 & 65280) * class304.field4609 & 16711680;
                        int var676 = (var665 & 255) * class304.field4615 & 65280;
                        var3[var645] = (var674 | var675 | var676) >>> 8;
                     }
                  } else if (arg0 == 3) {
                     int var677 = this.field10287[var644];
                     int var678 = class304.field4600;
                     int var679 = var677 + var678;
                     int var680 = (var677 & 16711935) + (var678 & 16711935);
                     int var681 = (var679 - var680 & 65536) + (var680 & 16777472);
                     int var682 = var679 - var681 | var681 - (var681 >>> 8);
                     int var683 = (var677 >>> 24) * class304.field4612 >> 8;
                     int var684 = 256 - var683;
                     if (var683 != 255) {
                        int var686 = var3[var645];
                        var682 = ((var682 & 16711935) * var683 + (var686 & 16711935) * var684 & -16711936) + ((var682 & 65280) * var683 + (var686 & 65280) * var684 & 16711680) >> 8;
                     }

                     var3[var645] = var682;
                  } else {
                     if (arg0 != 2) {
                        throw new IllegalArgumentException();
                     }

                     int var687 = this.field10287[var644];
                     int var688 = var687 >>> 24;
                     int var689 = 256 - var688;
                     int var690 = (var687 & 16711935) * class304.field4612 & -16711936;
                     int var691 = (var687 & 65280) * class304.field4612 & 16711680;
                     int var692 = ((var690 | var691) >>> 8) + class304.field4592;
                     int var693 = var3[var645];
                     var3[var645] = ((var692 & 16711935) * var688 + (var693 & 16711935) * var689 & -16711936) + ((var692 & 65280) * var688 + (var693 & 65280) * var689 & 16711680) >> 8;
                  }
               } else {
                  if (arg1 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if (arg0 == 1) {
                     int var694 = this.field10287[var644];
                     int var695 = var3[var645];
                     int var696 = var694 + var695;
                     int var697 = (var694 & 16711935) + (var695 & 16711935);
                     int var698 = (var696 - var697 & 65536) + (var697 & 16777472);
                     var3[var645] = var696 - var698 | var698 - (var698 >>> 8);
                  } else if (arg0 == 0) {
                     int var699 = this.field10287[var644];
                     int var700 = (var699 & 16711680) * class304.field4594 & -16777216;
                     int var701 = (var699 & 65280) * class304.field4609 & 16711680;
                     int var702 = (var699 & 255) * class304.field4615 & 65280;
                     int var703 = (var700 | var701 | var702) >>> 8;
                     int var704 = var3[var645];
                     int var705 = var703 + var704;
                     int var706 = (var703 & 16711935) + (var704 & 16711935);
                     int var707 = (var705 - var706 & 65536) + (var706 & 16777472);
                     var3[var645] = var705 - var707 | var707 - (var707 >>> 8);
                  } else if (arg0 == 3) {
                     int var708 = this.field10287[var644];
                     int var709 = class304.field4600;
                     int var710 = var708 + var709;
                     int var711 = (var708 & 16711935) + (var709 & 16711935);
                     int var712 = (var710 - var711 & 65536) + (var711 & 16777472);
                     int var713 = var710 - var712 | var712 - (var712 >>> 8);
                     int var714 = var3[var645];
                     int var715 = var713 + var714;
                     int var716 = (var713 & 16711935) + (var714 & 16711935);
                     int var717 = (var715 - var716 & 65536) + (var716 & 16777472);
                     var3[var645] = var715 - var717 | var717 - (var717 >>> 8);
                  } else if (arg0 == 2) {
                     int var718 = this.field10287[var644];
                     int var719 = (var718 & 16711935) * class304.field4612 & -16711936;
                     int var720 = (var718 & 65280) * class304.field4612 & 16711680;
                     int var721 = ((var719 | var720) >>> 8) + class304.field4592;
                     int var722 = var3[var645];
                     int var723 = var721 + var722;
                     int var724 = (var721 & 16711935) + (var722 & 16711935);
                     int var725 = (var723 - var724 & 65536) + (var724 & 16777472);
                     var3[var645] = var723 - var725 | var725 - (var725 >>> 8);
                  }
               }

               var636 += class304.field4606;
               var637 += class304.field4610;
               ++var638;
            }

            class304.field4599 += class304.field4620;
            class304.field4598 += class304.field4591;
            class304.field4604 += class304.field4595;
         }

      } else {
         for(int var726 = class304.field4616; var726 < 0; ++var726) {
            int var727 = class304.field4604;
            int var728 = class304.field4611 + class304.field4599;
            int var729 = class304.field4598 + class304.field4593;
            int var730 = class304.field4597;
            if (var728 < 0) {
               int var731 = (class304.field4606 - 1 - var728) / class304.field4606;
               var730 += var731;
               var728 += class304.field4606 * var731;
               var729 += class304.field4610 * var731;
               var727 += var731;
            }

            int var732;
            if ((var732 = (var728 + 1 - (super.field4618 << 12) - class304.field4606) / class304.field4606) > var730) {
               var730 = var732;
            }

            if (var729 < 0) {
               int var733 = (class304.field4610 - 1 - var729) / class304.field4610;
               var730 += var733;
               var728 += class304.field4606 * var733;
               var729 += class304.field4610 * var733;
               var727 += var733;
            }

            int var734;
            if ((var734 = (var729 + 1 - (super.field4607 << 12) - class304.field4610) / class304.field4610) > var730) {
               var730 = var734;
            }

            while(var730 < 0) {
               int var735 = (var728 >> 12) + (var729 >> 12) * super.field4618;
               int var736 = var727++;
               if (arg1 == 0) {
                  if (arg0 == 1) {
                     var3[var736] = this.field10287[var735];
                  } else if (arg0 == 0) {
                     int var740 = this.field10287[var735++];
                     int var741 = (var740 & 16711680) * class304.field4594 & -16777216;
                     int var742 = (var740 & 65280) * class304.field4609 & 16711680;
                     int var743 = (var740 & 255) * class304.field4615 & 65280;
                     var3[var736] = (var741 | var742 | var743) >>> 8;
                  } else if (arg0 == 3) {
                     int var744 = this.field10287[var735++];
                     int var745 = class304.field4600;
                     int var746 = var744 + var745;
                     int var747 = (var744 & 16711935) + (var745 & 16711935);
                     int var748 = (var746 - var747 & 65536) + (var747 & 16777472);
                     var3[var736] = var746 - var748 | var748 - (var748 >>> 8);
                  } else {
                     if (arg0 != 2) {
                        throw new IllegalArgumentException();
                     }

                     int var749 = this.field10287[var735];
                     int var750 = (var749 & 16711935) * class304.field4612 & -16711936;
                     int var751 = (var749 & 65280) * class304.field4612 & 16711680;
                     var3[var736] = ((var750 | var751) >>> 8) + class304.field4592;
                  }
               } else if (arg1 == 1) {
                  if (arg0 == 1) {
                     int var752 = this.field10287[var735];
                     int var753 = var752 >>> 24;
                     int var754 = 256 - var753;
                     int var755 = var3[var736];
                     var3[var736] = ((var752 & 16711935) * var753 + (var755 & 16711935) * var754 & -16711936) + ((var752 & 65280) * var753 + (var755 & 65280) * var754 & 16711680) >> 8;
                  } else if (arg0 == 0) {
                     int var756 = this.field10287[var735];
                     int var757 = (var756 >>> 24) * class304.field4612 >> 8;
                     int var758 = 256 - var757;
                     if ((class304.field4600 & 16777215) == 16777215) {
                        int var759 = var3[var736];
                        var3[var736] = ((var756 & 16711935) * var757 + (var759 & 16711935) * var758 & -16711936) + ((var756 & 65280) * var757 + (var759 & 65280) * var758 & 16711680) >> 8;
                     } else if (var757 != 255) {
                        int var760 = (var756 & 16711680) * class304.field4594 & -16777216;
                        int var761 = (var756 & 65280) * class304.field4609 & 16711680;
                        int var762 = (var756 & 255) * class304.field4615 & 65280;
                        int var763 = (var760 | var761 | var762) >>> 8;
                        int var764 = var3[var736];
                        var3[var736] = ((var763 & 16711935) * var757 + (var764 & 16711935) * var758 & -16711936) + ((var763 & 65280) * var757 + (var764 & 65280) * var758 & 16711680) >> 8;
                     } else {
                        int var765 = (var756 & 16711680) * class304.field4594 & -16777216;
                        int var766 = (var756 & 65280) * class304.field4609 & 16711680;
                        int var767 = (var756 & 255) * class304.field4615 & 65280;
                        var3[var736] = (var765 | var766 | var767) >>> 8;
                     }
                  } else if (arg0 == 3) {
                     int var768 = this.field10287[var735];
                     int var769 = class304.field4600;
                     int var770 = var768 + var769;
                     int var771 = (var768 & 16711935) + (var769 & 16711935);
                     int var772 = (var770 - var771 & 65536) + (var771 & 16777472);
                     int var773 = var770 - var772 | var772 - (var772 >>> 8);
                     int var774 = (var768 >>> 24) * class304.field4612 >> 8;
                     int var775 = 256 - var774;
                     if (var774 != 255) {
                        int var777 = var3[var736];
                        var773 = ((var773 & 16711935) * var774 + (var777 & 16711935) * var775 & -16711936) + ((var773 & 65280) * var774 + (var777 & 65280) * var775 & 16711680) >> 8;
                     }

                     var3[var736] = var773;
                  } else {
                     if (arg0 != 2) {
                        throw new IllegalArgumentException();
                     }

                     int var778 = this.field10287[var735];
                     int var779 = var778 >>> 24;
                     int var780 = 256 - var779;
                     int var781 = (var778 & 16711935) * class304.field4612 & -16711936;
                     int var782 = (var778 & 65280) * class304.field4612 & 16711680;
                     int var783 = ((var781 | var782) >>> 8) + class304.field4592;
                     int var784 = var3[var736];
                     var3[var736] = ((var783 & 16711935) * var779 + (var784 & 16711935) * var780 & -16711936) + ((var783 & 65280) * var779 + (var784 & 65280) * var780 & 16711680) >> 8;
                  }
               } else {
                  if (arg1 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if (arg0 == 1) {
                     int var785 = this.field10287[var735];
                     int var786 = var3[var736];
                     int var787 = var785 + var786;
                     int var788 = (var785 & 16711935) + (var786 & 16711935);
                     int var789 = (var787 - var788 & 65536) + (var788 & 16777472);
                     var3[var736] = var787 - var789 | var789 - (var789 >>> 8);
                  } else if (arg0 == 0) {
                     int var790 = this.field10287[var735];
                     int var791 = (var790 & 16711680) * class304.field4594 & -16777216;
                     int var792 = (var790 & 65280) * class304.field4609 & 16711680;
                     int var793 = (var790 & 255) * class304.field4615 & 65280;
                     int var794 = (var791 | var792 | var793) >>> 8;
                     int var795 = var3[var736];
                     int var796 = var794 + var795;
                     int var797 = (var794 & 16711935) + (var795 & 16711935);
                     int var798 = (var796 - var797 & 65536) + (var797 & 16777472);
                     var3[var736] = var796 - var798 | var798 - (var798 >>> 8);
                  } else if (arg0 == 3) {
                     int var799 = this.field10287[var735];
                     int var800 = class304.field4600;
                     int var801 = var799 + var800;
                     int var802 = (var799 & 16711935) + (var800 & 16711935);
                     int var803 = (var801 - var802 & 65536) + (var802 & 16777472);
                     int var804 = var801 - var803 | var803 - (var803 >>> 8);
                     int var805 = var3[var736];
                     int var806 = var804 + var805;
                     int var807 = (var804 & 16711935) + (var805 & 16711935);
                     int var808 = (var806 - var807 & 65536) + (var807 & 16777472);
                     var3[var736] = var806 - var808 | var808 - (var808 >>> 8);
                  } else if (arg0 == 2) {
                     int var809 = this.field10287[var735];
                     int var810 = (var809 & 16711935) * class304.field4612 & -16711936;
                     int var811 = (var809 & 65280) * class304.field4612 & 16711680;
                     int var812 = ((var810 | var811) >>> 8) + class304.field4592;
                     int var813 = var3[var736];
                     int var814 = var812 + var813;
                     int var815 = (var812 & 16711935) + (var813 & 16711935);
                     int var816 = (var814 - var815 & 65536) + (var815 & 16777472);
                     var3[var736] = var814 - var816 | var816 - (var816 >>> 8);
                  }
               }

               var728 += class304.field4606;
               var729 += class304.field4610;
               ++var730;
            }

            class304.field4599 += class304.field4620;
            class304.field4598 += class304.field4591;
            class304.field4604 += class304.field4595;
         }

      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "<init>",
      descriptor = "(Lmi;II)V"
   )
   public class718(class20 arg0, int arg1, int arg2) {
      super(arg0, arg1, arg2);
      this.field10287 = new int[arg1 * arg2];
   }

   @OriginalMember(
      owner = "client!bl",
      name = "<init>",
      descriptor = "(Lmi;[III)V"
   )
   public class718(class20 arg0, int[] arg1, int arg2, int arg3) {
      super(arg0, arg2, arg3);
      this.field10287 = arg1;
   }

   @OriginalMember(
      owner = "client!bl",
      name = "<init>",
      descriptor = "(Lmi;[IIIIIZ)V"
   )
   public class718(class20 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      super(arg0, arg4, arg5);
      if (arg6) {
         this.field10287 = new int[arg4 * arg5];
      } else {
         this.field10287 = arg1;
      }

      int var8 = arg3 - super.field4618;
      int var9 = 0;

      for(int var10 = 0; var10 < arg5; ++var10) {
         for(int var11 = 0; var11 < arg4; ++var11) {
            this.field10287[var9++] = arg1[arg2++];
         }

         arg2 += var8;
      }

   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public final void method1347(int arg0, int arg1, class684 arg2, int arg3, int arg4) {
      if (super.field4601.method275()) {
         throw new IllegalStateException();
      } else {
         int var6 = super.field4608 + arg0;
         int var7 = super.field4614 + arg1;
         int var8 = 0;
         int var9 = super.field4601.field299;
         int var10 = super.field4618;
         int var11 = super.field4607;
         int var12 = var9 - var10;
         int var13 = 0;
         int var14 = var7 * var9 + var6;
         if (var7 < super.field4601.field280) {
            int var15 = super.field4601.field280 - var7;
            var11 -= var15;
            var7 = super.field4601.field280;
            var8 += var10 * var15;
            var14 += var9 * var15;
         }

         if (var7 + var11 > super.field4601.field281) {
            var11 -= var7 + var11 - super.field4601.field281;
         }

         if (var6 < super.field4601.field298) {
            int var16 = super.field4601.field298 - var6;
            var10 -= var16;
            var6 = super.field4601.field298;
            var8 += var16;
            var14 += var16;
            var13 += var16;
            var12 += var16;
         }

         if (var6 + var10 > super.field4601.field306) {
            int var17 = var6 + var10 - super.field4601.field306;
            var10 -= var17;
            var13 += var17;
            var12 += var17;
         }

         if (var10 > 0 && var11 > 0) {
            class540 var18 = (class540)arg2;
            int[] var19 = var18.field7582;
            int[] var20 = var18.field7581;
            int[] var21 = super.field4601.field312;
            int var22 = var7;
            if (arg4 > var7) {
               var22 = arg4;
               var14 += (arg4 - var7) * var9;
               var8 += (arg4 - var7) * super.field4618;
            }

            int var23 = var19.length + arg4 < var7 + var11 ? var19.length + arg4 : var7 + var11;

            for(int var24 = var22; var24 < var23; ++var24) {
               int var25 = var19[var24 - arg4] + arg3;
               int var26 = var20[var24 - arg4];
               int var27 = var10;
               if (var6 > var25) {
                  int var28 = var6 - var25;
                  if (var28 >= var26) {
                     var8 += var10 + var13;
                     var14 += var10 + var12;
                     continue;
                  }

                  var26 -= var28;
               } else {
                  int var29 = var25 - var6;
                  if (var29 >= var10) {
                     var8 += var10 + var13;
                     var14 += var10 + var12;
                     continue;
                  }

                  var8 += var29;
                  var27 = var10 - var29;
                  var14 += var29;
               }

               int var30 = 0;
               if (var27 < var26) {
                  var26 = var27;
               } else {
                  var30 = var27 - var26;
               }

               for(int var31 = -var26; var31 < 0; ++var31) {
                  int var32 = this.field10287[var8++];
                  int var33 = var32 >>> 24;
                  int var34 = 256 - var33;
                  int var35 = var21[var14];
                  var21[var14++] = ((var32 & 16711935) * var33 + (var35 & 16711935) * var34 & -16711936) + ((var32 & 65280) * var33 + (var35 & 65280) * var34 & 16711680) >> 8;
               }

               var8 += var13 + var30;
               var14 += var12 + var30;
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "([I[III)V"
   )
   public final void method2325(int[] arg0, int[] arg1, int arg2, int arg3) {
      int[] var5 = super.field4601.field312;
      if (class304.field4606 == 0) {
         if (class304.field4610 == 0) {
            int var6 = class304.field4616;

            while(var6 < 0) {
               int var7 = arg3 + var6;
               if (var7 >= 0) {
                  if (var7 >= arg0.length) {
                     return;
                  }

                  int var8 = class304.field4604;
                  int var9 = class304.field4599;
                  int var10 = class304.field4598;
                  int var11 = class304.field4597;
                  if (var9 >= 0 && var10 >= 0 && var9 - (super.field4618 << 12) < 0 && var10 - (super.field4607 << 12) < 0) {
                     int var12 = arg0[var7] - arg2;
                     int var13 = -arg1[var7];
                     int var14 = var12 - (var8 - class304.field4604);
                     if (var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += class304.field4606 * var14;
                        var10 += class304.field4610 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if (var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        int var15 = this.field10287[(var9 >> 12) + (var10 >> 12) * super.field4618];
                        int var16 = var15 >>> 24;
                        int var17 = 256 - var16;
                        int var18 = var5[var8];
                        var5[var8++] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                        ++var11;
                     }
                  }
               }

               ++var6;
               class304.field4604 += class304.field4595;
            }

         } else if (class304.field4610 < 0) {
            int var19 = class304.field4616;

            while(var19 < 0) {
               int var20 = arg3 + var19;
               if (var20 >= 0) {
                  if (var20 >= arg0.length) {
                     return;
                  }

                  int var21 = class304.field4604;
                  int var22 = class304.field4599;
                  int var23 = class304.field4598 + class304.field4593;
                  int var24 = class304.field4597;
                  if (var22 >= 0 && var22 - (super.field4618 << 12) < 0) {
                     int var25;
                     if ((var25 = var23 - (super.field4607 << 12)) >= 0) {
                        int var26 = (class304.field4610 - var25) / class304.field4610;
                        var24 += var26;
                        var23 += class304.field4610 * var26;
                        var21 += var26;
                     }

                     int var27;
                     if ((var27 = (var23 - class304.field4610) / class304.field4610) > var24) {
                        var24 = var27;
                     }

                     int var28 = arg0[var20] - arg2;
                     int var29 = -arg1[var20];
                     int var30 = var28 - (var21 - class304.field4604);
                     if (var30 > 0) {
                        var21 += var30;
                        var24 += var30;
                        var22 += class304.field4606 * var30;
                        var23 += class304.field4610 * var30;
                     } else {
                        var29 -= var30;
                     }

                     if (var24 < var29) {
                        var24 = var29;
                     }

                     while(var24 < 0) {
                        int var31 = this.field10287[(var22 >> 12) + (var23 >> 12) * super.field4618];
                        int var32 = var31 >>> 24;
                        int var33 = 256 - var32;
                        int var34 = var5[var21];
                        var5[var21++] = ((var31 & 16711935) * var32 + (var34 & 16711935) * var33 & -16711936) + ((var31 & 65280) * var32 + (var34 & 65280) * var33 & 16711680) >> 8;
                        var23 += class304.field4610;
                        ++var24;
                     }
                  }
               }

               ++var19;
               class304.field4599 += class304.field4620;
               class304.field4604 += class304.field4595;
            }

         } else {
            int var35 = class304.field4616;

            while(var35 < 0) {
               int var36 = arg3 + var35;
               if (var36 >= 0) {
                  if (var36 >= arg0.length) {
                     return;
                  }

                  int var37 = class304.field4604;
                  int var38 = class304.field4599;
                  int var39 = class304.field4598 + class304.field4593;
                  int var40 = class304.field4597;
                  if (var38 >= 0 && var38 - (super.field4618 << 12) < 0) {
                     if (var39 < 0) {
                        int var41 = (class304.field4610 - 1 - var39) / class304.field4610;
                        var40 += var41;
                        var39 += class304.field4610 * var41;
                        var37 += var41;
                     }

                     int var42;
                     if ((var42 = (var39 + 1 - (super.field4607 << 12) - class304.field4610) / class304.field4610) > var40) {
                        var40 = var42;
                     }

                     int var43 = arg0[var36] - arg2;
                     int var44 = -arg1[var36];
                     int var45 = var43 - (var37 - class304.field4604);
                     if (var45 > 0) {
                        var37 += var45;
                        var40 += var45;
                        var38 += class304.field4606 * var45;
                        var39 += class304.field4610 * var45;
                     } else {
                        var44 -= var45;
                     }

                     if (var40 < var44) {
                        var40 = var44;
                     }

                     while(var40 < 0) {
                        int var46 = this.field10287[(var38 >> 12) + (var39 >> 12) * super.field4618];
                        int var47 = var46 >>> 24;
                        int var48 = 256 - var47;
                        int var49 = var5[var37];
                        var5[var37++] = ((var46 & 16711935) * var47 + (var49 & 16711935) * var48 & -16711936) + ((var46 & 65280) * var47 + (var49 & 65280) * var48 & 16711680) >> 8;
                        var39 += class304.field4610;
                        ++var40;
                     }
                  }
               }

               ++var35;
               class304.field4599 += class304.field4620;
               class304.field4604 += class304.field4595;
            }

         }
      } else if (class304.field4606 < 0) {
         if (class304.field4610 == 0) {
            int var50 = class304.field4616;

            while(var50 < 0) {
               int var51 = arg3 + var50;
               if (var51 >= 0) {
                  if (var51 >= arg0.length) {
                     return;
                  }

                  int var52 = class304.field4604;
                  int var53 = class304.field4611 + class304.field4599;
                  int var54 = class304.field4598;
                  int var55 = class304.field4597;
                  if (var54 >= 0 && var54 - (super.field4607 << 12) < 0) {
                     int var56;
                     if ((var56 = var53 - (super.field4618 << 12)) >= 0) {
                        int var57 = (class304.field4606 - var56) / class304.field4606;
                        var55 += var57;
                        var53 += class304.field4606 * var57;
                        var52 += var57;
                     }

                     int var58;
                     if ((var58 = (var53 - class304.field4606) / class304.field4606) > var55) {
                        var55 = var58;
                     }

                     int var59 = arg0[var51] - arg2;
                     int var60 = -arg1[var51];
                     int var61 = var59 - (var52 - class304.field4604);
                     if (var61 > 0) {
                        var52 += var61;
                        var55 += var61;
                        var53 += class304.field4606 * var61;
                        var54 += class304.field4610 * var61;
                     } else {
                        var60 -= var61;
                     }

                     if (var55 < var60) {
                        var55 = var60;
                     }

                     while(var55 < 0) {
                        int var62 = this.field10287[(var53 >> 12) + (var54 >> 12) * super.field4618];
                        int var63 = var62 >>> 24;
                        int var64 = 256 - var63;
                        int var65 = var5[var52];
                        var5[var52++] = ((var62 & 16711935) * var63 + (var65 & 16711935) * var64 & -16711936) + ((var62 & 65280) * var63 + (var65 & 65280) * var64 & 16711680) >> 8;
                        var53 += class304.field4606;
                        ++var55;
                     }
                  }
               }

               ++var50;
               class304.field4598 += class304.field4591;
               class304.field4604 += class304.field4595;
            }

         } else if (class304.field4610 < 0) {
            int var66 = class304.field4616;

            while(var66 < 0) {
               int var67 = arg3 + var66;
               if (var67 >= 0) {
                  if (var67 >= arg0.length) {
                     return;
                  }

                  int var68 = class304.field4604;
                  int var69 = class304.field4611 + class304.field4599;
                  int var70 = class304.field4598 + class304.field4593;
                  int var71 = class304.field4597;
                  int var72;
                  if ((var72 = var69 - (super.field4618 << 12)) >= 0) {
                     int var73 = (class304.field4606 - var72) / class304.field4606;
                     var71 += var73;
                     var69 += class304.field4606 * var73;
                     var70 += class304.field4610 * var73;
                     var68 += var73;
                  }

                  int var74;
                  if ((var74 = (var69 - class304.field4606) / class304.field4606) > var71) {
                     var71 = var74;
                  }

                  int var75;
                  if ((var75 = var70 - (super.field4607 << 12)) >= 0) {
                     int var76 = (class304.field4610 - var75) / class304.field4610;
                     var71 += var76;
                     var69 += class304.field4606 * var76;
                     var70 += class304.field4610 * var76;
                     var68 += var76;
                  }

                  int var77;
                  if ((var77 = (var70 - class304.field4610) / class304.field4610) > var71) {
                     var71 = var77;
                  }

                  int var78 = arg0[var67] - arg2;
                  int var79 = -arg1[var67];
                  int var80 = var78 - (var68 - class304.field4604);
                  if (var80 > 0) {
                     var68 += var80;
                     var71 += var80;
                     var69 += class304.field4606 * var80;
                     var70 += class304.field4610 * var80;
                  } else {
                     var79 -= var80;
                  }

                  if (var71 < var79) {
                     var71 = var79;
                  }

                  while(var71 < 0) {
                     int var81 = this.field10287[(var69 >> 12) + (var70 >> 12) * super.field4618];
                     int var82 = var81 >>> 24;
                     int var83 = 256 - var82;
                     int var84 = var5[var68];
                     var5[var68++] = ((var81 & 16711935) * var82 + (var84 & 16711935) * var83 & -16711936) + ((var81 & 65280) * var82 + (var84 & 65280) * var83 & 16711680) >> 8;
                     var69 += class304.field4606;
                     var70 += class304.field4610;
                     ++var71;
                  }
               }

               ++var66;
               class304.field4599 += class304.field4620;
               class304.field4598 += class304.field4591;
               class304.field4604 += class304.field4595;
            }

         } else {
            int var85 = class304.field4616;

            while(var85 < 0) {
               int var86 = arg3 + var85;
               if (var86 >= 0) {
                  if (var86 >= arg0.length) {
                     return;
                  }

                  int var87 = class304.field4604;
                  int var88 = class304.field4611 + class304.field4599;
                  int var89 = class304.field4598 + class304.field4593;
                  int var90 = class304.field4597;
                  int var91;
                  if ((var91 = var88 - (super.field4618 << 12)) >= 0) {
                     int var92 = (class304.field4606 - var91) / class304.field4606;
                     var90 += var92;
                     var88 += class304.field4606 * var92;
                     var89 += class304.field4610 * var92;
                     var87 += var92;
                  }

                  int var93;
                  if ((var93 = (var88 - class304.field4606) / class304.field4606) > var90) {
                     var90 = var93;
                  }

                  if (var89 < 0) {
                     int var94 = (class304.field4610 - 1 - var89) / class304.field4610;
                     var90 += var94;
                     var88 += class304.field4606 * var94;
                     var89 += class304.field4610 * var94;
                     var87 += var94;
                  }

                  int var95;
                  if ((var95 = (var89 + 1 - (super.field4607 << 12) - class304.field4610) / class304.field4610) > var90) {
                     var90 = var95;
                  }

                  int var96 = arg0[var86] - arg2;
                  int var97 = -arg1[var86];
                  int var98 = var96 - (var87 - class304.field4604);
                  if (var98 > 0) {
                     var87 += var98;
                     var90 += var98;
                     var88 += class304.field4606 * var98;
                     var89 += class304.field4610 * var98;
                  } else {
                     var97 -= var98;
                  }

                  if (var90 < var97) {
                     var90 = var97;
                  }

                  while(var90 < 0) {
                     int var99 = this.field10287[(var88 >> 12) + (var89 >> 12) * super.field4618];
                     int var100 = var99 >>> 24;
                     int var101 = 256 - var100;
                     int var102 = var5[var87];
                     var5[var87++] = ((var99 & 16711935) * var100 + (var102 & 16711935) * var101 & -16711936) + ((var99 & 65280) * var100 + (var102 & 65280) * var101 & 16711680) >> 8;
                     var88 += class304.field4606;
                     var89 += class304.field4610;
                     ++var90;
                  }
               }

               ++var85;
               class304.field4599 += class304.field4620;
               class304.field4598 += class304.field4591;
               class304.field4604 += class304.field4595;
            }

         }
      } else if (class304.field4610 == 0) {
         int var103 = class304.field4616;

         while(var103 < 0) {
            int var104 = arg3 + var103;
            if (var104 >= 0) {
               if (var104 >= arg0.length) {
                  return;
               }

               int var105 = class304.field4604;
               int var106 = class304.field4611 + class304.field4599;
               int var107 = class304.field4598;
               int var108 = class304.field4597;
               if (var107 >= 0 && var107 - (super.field4607 << 12) < 0) {
                  if (var106 < 0) {
                     int var109 = (class304.field4606 - 1 - var106) / class304.field4606;
                     var108 += var109;
                     var106 += class304.field4606 * var109;
                     var105 += var109;
                  }

                  int var110;
                  if ((var110 = (var106 + 1 - (super.field4618 << 12) - class304.field4606) / class304.field4606) > var108) {
                     var108 = var110;
                  }

                  int var111 = arg0[var104] - arg2;
                  int var112 = -arg1[var104];
                  int var113 = var111 - (var105 - class304.field4604);
                  if (var113 > 0) {
                     var105 += var113;
                     var108 += var113;
                     var106 += class304.field4606 * var113;
                     var107 += class304.field4610 * var113;
                  } else {
                     var112 -= var113;
                  }

                  if (var108 < var112) {
                     var108 = var112;
                  }

                  while(var108 < 0) {
                     int var114 = this.field10287[(var106 >> 12) + (var107 >> 12) * super.field4618];
                     int var115 = var114 >>> 24;
                     int var116 = 256 - var115;
                     int var117 = var5[var105];
                     var5[var105++] = ((var114 & 16711935) * var115 + (var117 & 16711935) * var116 & -16711936) + ((var114 & 65280) * var115 + (var117 & 65280) * var116 & 16711680) >> 8;
                     var106 += class304.field4606;
                     ++var108;
                  }
               }
            }

            ++var103;
            class304.field4599 += class304.field4620;
            class304.field4598 += class304.field4591;
            class304.field4604 += class304.field4595;
         }

      } else if (class304.field4610 < 0) {
         int var118 = class304.field4616;

         while(var118 < 0) {
            int var119 = arg3 + var118;
            if (var119 >= 0) {
               if (var119 >= arg0.length) {
                  return;
               }

               int var120 = class304.field4604;
               int var121 = class304.field4611 + class304.field4599;
               int var122 = class304.field4598 + class304.field4593;
               int var123 = class304.field4597;
               if (var121 < 0) {
                  int var124 = (class304.field4606 - 1 - var121) / class304.field4606;
                  var123 += var124;
                  var121 += class304.field4606 * var124;
                  var122 += class304.field4610 * var124;
                  var120 += var124;
               }

               int var125;
               if ((var125 = (var121 + 1 - (super.field4618 << 12) - class304.field4606) / class304.field4606) > var123) {
                  var123 = var125;
               }

               int var126;
               if ((var126 = var122 - (super.field4607 << 12)) >= 0) {
                  int var127 = (class304.field4610 - var126) / class304.field4610;
                  var123 += var127;
                  var121 += class304.field4606 * var127;
                  var122 += class304.field4610 * var127;
                  var120 += var127;
               }

               int var128;
               if ((var128 = (var122 - class304.field4610) / class304.field4610) > var123) {
                  var123 = var128;
               }

               int var129 = arg0[var119] - arg2;
               int var130 = -arg1[var119];
               int var131 = var129 - (var120 - class304.field4604);
               if (var131 > 0) {
                  var120 += var131;
                  var123 += var131;
                  var121 += class304.field4606 * var131;
                  var122 += class304.field4610 * var131;
               } else {
                  var130 -= var131;
               }

               if (var123 < var130) {
                  var123 = var130;
               }

               while(var123 < 0) {
                  int var132 = this.field10287[(var121 >> 12) + (var122 >> 12) * super.field4618];
                  int var133 = var132 >>> 24;
                  int var134 = 256 - var133;
                  int var135 = var5[var120];
                  var5[var120++] = ((var132 & 16711935) * var133 + (var135 & 16711935) * var134 & -16711936) + ((var132 & 65280) * var133 + (var135 & 65280) * var134 & 16711680) >> 8;
                  var121 += class304.field4606;
                  var122 += class304.field4610;
                  ++var123;
               }
            }

            ++var118;
            class304.field4599 += class304.field4620;
            class304.field4598 += class304.field4591;
            class304.field4604 += class304.field4595;
         }

      } else {
         int var136 = class304.field4616;

         while(var136 < 0) {
            int var137 = arg3 + var136;
            if (var137 >= 0) {
               if (var137 >= arg0.length) {
                  return;
               }

               int var138 = class304.field4604;
               int var139 = class304.field4611 + class304.field4599;
               int var140 = class304.field4598 + class304.field4593;
               int var141 = class304.field4597;
               if (var139 < 0) {
                  int var142 = (class304.field4606 - 1 - var139) / class304.field4606;
                  var141 += var142;
                  var139 += class304.field4606 * var142;
                  var140 += class304.field4610 * var142;
                  var138 += var142;
               }

               int var143;
               if ((var143 = (var139 + 1 - (super.field4618 << 12) - class304.field4606) / class304.field4606) > var141) {
                  var141 = var143;
               }

               if (var140 < 0) {
                  int var144 = (class304.field4610 - 1 - var140) / class304.field4610;
                  var141 += var144;
                  var139 += class304.field4606 * var144;
                  var140 += class304.field4610 * var144;
                  var138 += var144;
               }

               int var145;
               if ((var145 = (var140 + 1 - (super.field4607 << 12) - class304.field4610) / class304.field4610) > var141) {
                  var141 = var145;
               }

               int var146 = arg0[var137] - arg2;
               int var147 = -arg1[var137];
               int var148 = var146 - (var138 - class304.field4604);
               if (var148 > 0) {
                  var138 += var148;
                  var141 += var148;
                  var139 += class304.field4606 * var148;
                  var140 += class304.field4610 * var148;
               } else {
                  var147 -= var148;
               }

               if (var141 < var147) {
                  var141 = var147;
               }

               while(var141 < 0) {
                  int var149 = this.field10287[(var139 >> 12) + (var140 >> 12) * super.field4618];
                  int var150 = var149 >>> 24;
                  int var151 = 256 - var150;
                  int var152 = var5[var138];
                  var5[var138++] = ((var149 & 16711935) * var150 + (var152 & 16711935) * var151 & -16711936) + ((var149 & 65280) * var150 + (var152 & 65280) * var151 & 16711680) >> 8;
                  var139 += class304.field4606;
                  var140 += class304.field4610;
                  ++var141;
               }
            }

            ++var136;
            class304.field4599 += class304.field4620;
            class304.field4598 += class304.field4591;
            class304.field4604 += class304.field4595;
         }

      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "b",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method2326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      if (arg3 > 0 && arg4 > 0) {
         int var10 = 0;
         int var11 = 0;
         int var12 = super.field4618 + super.field4608 + super.field4605;
         int var13 = super.field4614 + super.field4607 + super.field4613;
         int var14 = (var12 << 16) / arg3;
         int var15 = (var13 << 16) / arg4;
         if (super.field4608 > 0) {
            int var16 = ((super.field4608 << 16) + var14 - 1) / var14;
            arg0 += var16;
            var10 += var14 * var16 - (super.field4608 << 16);
         }

         if (super.field4614 > 0) {
            int var17 = ((super.field4614 << 16) + var15 - 1) / var15;
            arg1 += var17;
            var11 += var15 * var17 - (super.field4614 << 16);
         }

         if (super.field4618 < var12) {
            arg3 = ((super.field4618 << 16) - var10 + var14 - 1) / var14;
         }

         if (super.field4607 < var13) {
            arg4 = ((super.field4607 << 16) - var11 + var15 - 1) / var15;
         }

         int var18 = super.field4601.field299 * arg1 + arg0;
         int var19 = super.field4601.field299 - arg3;
         if (arg1 + arg4 > super.field4601.field281) {
            arg4 -= arg1 + arg4 - super.field4601.field281;
         }

         if (arg1 < super.field4601.field280) {
            int var20 = super.field4601.field280 - arg1;
            arg4 -= var20;
            var18 += super.field4601.field299 * var20;
            var11 += var15 * var20;
         }

         if (arg0 + arg3 > super.field4601.field306) {
            int var21 = arg0 + arg3 - super.field4601.field306;
            arg3 -= var21;
            var19 += var21;
         }

         if (arg0 < super.field4601.field298) {
            int var22 = super.field4601.field298 - arg0;
            arg3 -= var22;
            var18 += var22;
            var10 += var14 * var22;
            var19 += var22;
         }

         float[] var23 = super.field4601.field303;
         int[] var24 = super.field4601.field312;
         if (arg7 == 0) {
            if (arg5 == 1) {
               int var25 = var10;

               for(int var26 = -arg4; var26 < 0; ++var26) {
                  int var27 = (var11 >> 16) * super.field4618;

                  for(int var28 = -arg3; var28 < 0; ++var28) {
                     if ((float)arg2 < var23[var18]) {
                        var24[var18] = this.field10287[(var10 >> 16) + var27];
                        var23[var18] = (float)arg2;
                     }

                     var10 += var14;
                     ++var18;
                  }

                  var11 += var15;
                  var10 = var25;
                  var18 += var19;
               }

            } else if (arg5 == 0) {
               int var29 = (arg6 & 16711680) >> 16;
               int var30 = (arg6 & 65280) >> 8;
               int var31 = arg6 & 255;
               int var32 = var10;

               for(int var33 = -arg4; var33 < 0; ++var33) {
                  int var34 = (var11 >> 16) * super.field4618;

                  for(int var35 = -arg3; var35 < 0; ++var35) {
                     if ((float)arg2 < var23[var18]) {
                        int var36 = this.field10287[(var10 >> 16) + var34];
                        int var37 = (var36 & 16711680) * var29 & -16777216;
                        int var38 = (var36 & 65280) * var30 & 16711680;
                        int var39 = (var36 & 255) * var31 & 65280;
                        var24[var18] = (var37 | var38 | var39) >>> 8;
                        var23[var18] = (float)arg2;
                     }

                     var10 += var14;
                     ++var18;
                  }

                  var11 += var15;
                  var10 = var32;
                  var18 += var19;
               }

            } else if (arg5 == 3) {
               int var40 = var10;

               for(int var41 = -arg4; var41 < 0; ++var41) {
                  int var42 = (var11 >> 16) * super.field4618;

                  for(int var43 = -arg3; var43 < 0; ++var43) {
                     if ((float)arg2 < var23[var18]) {
                        int var44 = this.field10287[(var10 >> 16) + var42];
                        int var45 = arg6 + var44;
                        int var46 = (arg6 & 16711935) + (var44 & 16711935);
                        int var47 = (var45 - var46 & 65536) + (var46 & 16777472);
                        var24[var18] = var45 - var47 | var47 - (var47 >>> 8);
                        var23[var18] = (float)arg2;
                     }

                     var10 += var14;
                     ++var18;
                  }

                  var11 += var15;
                  var10 = var40;
                  var18 += var19;
               }

            } else if (arg5 != 2) {
               throw new IllegalArgumentException();
            } else {
               int var48 = arg6 >>> 24;
               int var49 = 256 - var48;
               int var50 = (arg6 & 16711935) * var49 & -16711936;
               int var51 = (arg6 & 65280) * var49 & 16711680;
               int var52 = (var50 | var51) >>> 8;
               int var53 = var10;

               for(int var54 = -arg4; var54 < 0; ++var54) {
                  int var55 = (var11 >> 16) * super.field4618;

                  for(int var56 = -arg3; var56 < 0; ++var56) {
                     if ((float)arg2 < var23[var18]) {
                        int var57 = this.field10287[(var10 >> 16) + var55];
                        int var58 = (var57 & 16711935) * var48 & -16711936;
                        int var59 = (var57 & 65280) * var48 & 16711680;
                        var24[var18] = ((var58 | var59) >>> 8) + var52;
                        var23[var18] = (float)arg2;
                     }

                     var10 += var14;
                     ++var18;
                  }

                  var11 += var15;
                  var10 = var53;
                  var18 += var19;
               }

            }
         } else if (arg7 == 1) {
            if (arg5 == 1) {
               int var60 = var10;

               for(int var61 = -arg4; var61 < 0; ++var61) {
                  int var62 = (var11 >> 16) * super.field4618;

                  for(int var63 = -arg3; var63 < 0; ++var63) {
                     if ((float)arg2 < var23[var18]) {
                        int var64 = this.field10287[(var10 >> 16) + var62];
                        int var65 = var64 >>> 24;
                        int var66 = 256 - var65;
                        int var67 = var24[var18];
                        var24[var18] = (((var64 & 16711935) * var65 + (var67 & 16711935) * var66 & -16711936) >> 8) + (((var64 & -16711936) >>> 8) * var65 + ((var67 & -16711936) >>> 8) * var66 & -16711936);
                        var23[var18] = (float)arg2;
                     }

                     var10 += var14;
                     ++var18;
                  }

                  var11 += var15;
                  var10 = var60;
                  var18 += var19;
               }

            } else if (arg5 == 0) {
               int var68 = var10;
               if ((arg6 & 16777215) == 16777215) {
                  for(int var69 = -arg4; var69 < 0; ++var69) {
                     int var70 = (var11 >> 16) * super.field4618;

                     for(int var71 = -arg3; var71 < 0; ++var71) {
                        if ((float)arg2 < var23[var18]) {
                           int var72 = this.field10287[(var10 >> 16) + var70];
                           int var73 = (arg6 >>> 24) * (var72 >>> 24) >> 8;
                           int var74 = 256 - var73;
                           int var75 = var24[var18];
                           var24[var18] = ((var72 & 16711935) * var73 + (var75 & 16711935) * var74 & -16711936) + ((var72 & 65280) * var73 + (var75 & 65280) * var74 & 16711680) >> 8;
                           var23[var18] = (float)arg2;
                        }

                        var10 += var14;
                        ++var18;
                     }

                     var11 += var15;
                     var10 = var68;
                     var18 += var19;
                  }

               } else {
                  int var76 = (arg6 & 16711680) >> 16;
                  int var77 = (arg6 & 65280) >> 8;
                  int var78 = arg6 & 255;

                  for(int var79 = -arg4; var79 < 0; ++var79) {
                     int var80 = (var11 >> 16) * super.field4618;

                     for(int var81 = -arg3; var81 < 0; ++var81) {
                        if ((float)arg2 < var23[var18]) {
                           int var82 = this.field10287[(var10 >> 16) + var80];
                           int var83 = (arg6 >>> 24) * (var82 >>> 24) >> 8;
                           int var84 = 256 - var83;
                           if (var83 != 255) {
                              int var85 = (var82 & 16711680) * var76 & -16777216;
                              int var86 = (var82 & 65280) * var77 & 16711680;
                              int var87 = (var82 & 255) * var78 & 65280;
                              int var88 = (var85 | var86 | var87) >>> 8;
                              int var89 = var24[var18];
                              var24[var18] = ((var88 & 16711935) * var83 + (var89 & 16711935) * var84 & -16711936) + ((var88 & 65280) * var83 + (var89 & 65280) * var84 & 16711680) >> 8;
                              var23[var18] = (float)arg2;
                              int var90 = (var89 >>> 24) + var83;
                              if (var90 > 255) {
                                 var90 = 255;
                              }

                              var24[var18] |= var90 << 24;
                           } else {
                              int var91 = (var82 & 16711680) * var76 & -16777216;
                              int var92 = (var82 & 65280) * var77 & 16711680;
                              int var93 = (var82 & 255) * var78 & 65280;
                              var24[var18] = (var91 | var92 | var93) >>> 8;
                              var23[var18] = (float)arg2;
                           }
                        }

                        var10 += var14;
                        ++var18;
                     }

                     var11 += var15;
                     var10 = var68;
                     var18 += var19;
                  }

               }
            } else if (arg5 == 3) {
               int var94 = var10;

               for(int var95 = -arg4; var95 < 0; ++var95) {
                  int var96 = (var11 >> 16) * super.field4618;

                  for(int var97 = -arg3; var97 < 0; ++var97) {
                     if ((float)arg2 < var23[var18]) {
                        int var98 = this.field10287[(var10 >> 16) + var96];
                        int var99 = arg6 + var98;
                        int var100 = (arg6 & 16711935) + (var98 & 16711935);
                        int var101 = (var99 - var100 & 65536) + (var100 & 16777472);
                        int var102 = var99 - var101 | var101 - (var101 >>> 8);
                        int var103 = (arg6 >>> 24) * (var102 >>> 24) >> 8;
                        int var104 = 256 - var103;
                        if (var103 != 255) {
                           int var106 = var24[var18];
                           var102 = ((var102 & 16711935) * var103 + (var106 & 16711935) * var104 & -16711936) + ((var102 & 65280) * var103 + (var106 & 65280) * var104 & 16711680) >> 8;
                        }

                        var24[var18] = var102;
                        var23[var18] = (float)arg2;
                     }

                     var10 += var14;
                     ++var18;
                  }

                  var11 += var15;
                  var10 = var94;
                  var18 += var19;
               }

            } else if (arg5 != 2) {
               throw new IllegalArgumentException();
            } else {
               int var107 = arg6 >>> 24;
               int var108 = 256 - var107;
               int var109 = (arg6 & 16711935) * var108 & -16711936;
               int var110 = (arg6 & 65280) * var108 & 16711680;
               int var111 = (var109 | var110) >>> 8;
               int var112 = var10;

               for(int var113 = -arg4; var113 < 0; ++var113) {
                  int var114 = (var11 >> 16) * super.field4618;

                  for(int var115 = -arg3; var115 < 0; ++var115) {
                     if ((float)arg2 < var23[var18]) {
                        int var116 = this.field10287[(var10 >> 16) + var114];
                        int var117 = var116 >>> 24;
                        int var118 = 256 - var117;
                        int var119 = (var116 & 16711935) * var107 & -16711936;
                        int var120 = (var116 & 65280) * var107 & 16711680;
                        int var121 = ((var119 | var120) >>> 8) + var111;
                        int var122 = var24[var18];
                        var24[var18] = ((var121 & 16711935) * var117 + (var122 & 16711935) * var118 & -16711936) + ((var121 & 65280) * var117 + (var122 & 65280) * var118 & 16711680) >> 8;
                        var23[var18] = (float)arg2;
                     }

                     var10 += var14;
                     ++var18;
                  }

                  var11 += var15;
                  var10 = var112;
                  var18 += var19;
               }

            }
         } else if (arg7 != 2) {
            throw new IllegalArgumentException();
         } else if (arg5 == 1) {
            int var123 = var10;

            for(int var124 = -arg4; var124 < 0; ++var124) {
               int var125 = (var11 >> 16) * super.field4618;

               for(int var126 = -arg3; var126 < 0; ++var126) {
                  if ((float)arg2 < var23[var18]) {
                     int var127 = this.field10287[(var10 >> 16) + var125];
                     if (var127 != 0) {
                        int var128 = var24[var18];
                        int var129 = var127 + var128;
                        int var130 = (var127 & 16711935) + (var128 & 16711935);
                        int var131 = (var129 - var130 & 65536) + (var130 & 16777472);
                        var24[var18] = var129 - var131 | var131 - (var131 >>> 8);
                        var23[var18] = (float)arg2;
                     }
                  }

                  var10 += var14;
                  ++var18;
               }

               var11 += var15;
               var10 = var123;
               var18 += var19;
            }

         } else if (arg5 == 0) {
            int var132 = var10;
            int var133 = (arg6 & 16711680) >> 16;
            int var134 = (arg6 & 65280) >> 8;
            int var135 = arg6 & 255;

            for(int var136 = -arg4; var136 < 0; ++var136) {
               int var137 = (var11 >> 16) * super.field4618;

               for(int var138 = -arg3; var138 < 0; ++var138) {
                  if ((float)arg2 < var23[var18]) {
                     int var139 = this.field10287[(var10 >> 16) + var137];
                     if (var139 != 0) {
                        int var140 = (var139 & 16711680) * var133 & -16777216;
                        int var141 = (var139 & 65280) * var134 & 16711680;
                        int var142 = (var139 & 255) * var135 & 65280;
                        int var143 = (var140 | var141 | var142) >>> 8;
                        int var144 = var24[var18];
                        int var145 = var143 + var144;
                        int var146 = (var143 & 16711935) + (var144 & 16711935);
                        int var147 = (var145 - var146 & 65536) + (var146 & 16777472);
                        var24[var18] = var145 - var147 | var147 - (var147 >>> 8);
                        var23[var18] = (float)arg2;
                     }
                  }

                  var10 += var14;
                  ++var18;
               }

               var11 += var15;
               var10 = var132;
               var18 += var19;
            }

         } else if (arg5 == 3) {
            int var148 = var10;

            for(int var149 = -arg4; var149 < 0; ++var149) {
               int var150 = (var11 >> 16) * super.field4618;

               for(int var151 = -arg3; var151 < 0; ++var151) {
                  if ((float)arg2 < var23[var18]) {
                     int var152 = this.field10287[(var10 >> 16) + var150];
                     int var153 = arg6 + var152;
                     int var154 = (arg6 & 16711935) + (var152 & 16711935);
                     int var155 = (var153 - var154 & 65536) + (var154 & 16777472);
                     int var156 = var153 - var155 | var155 - (var155 >>> 8);
                     int var157 = var24[var18];
                     int var158 = var156 + var157;
                     int var159 = (var156 & 16711935) + (var157 & 16711935);
                     int var160 = (var158 - var159 & 65536) + (var159 & 16777472);
                     var24[var18] = var158 - var160 | var160 - (var160 >>> 8);
                     var23[var18] = (float)arg2;
                  }

                  var10 += var14;
                  ++var18;
               }

               var11 += var15;
               var10 = var148;
               var18 += var19;
            }

         } else if (arg5 != 2) {
            throw new IllegalArgumentException();
         } else {
            int var161 = arg6 >>> 24;
            int var162 = 256 - var161;
            int var163 = (arg6 & 16711935) * var162 & -16711936;
            int var164 = (arg6 & 65280) * var162 & 16711680;
            int var165 = (var163 | var164) >>> 8;
            int var166 = var10;

            for(int var167 = -arg4; var167 < 0; ++var167) {
               int var168 = (var11 >> 16) * super.field4618;

               for(int var169 = -arg3; var169 < 0; ++var169) {
                  if ((float)arg2 < var23[var18]) {
                     int var170 = this.field10287[(var10 >> 16) + var168];
                     if (var170 != 0) {
                        int var171 = (var170 & 16711935) * var161 & -16711936;
                        int var172 = (var170 & 65280) * var161 & 16711680;
                        int var173 = ((var171 | var172) >>> 8) + var165;
                        int var174 = var24[var18];
                        int var175 = var173 + var174;
                        int var176 = (var173 & 16711935) + (var174 & 16711935);
                        int var177 = (var175 - var176 & 65536) + (var176 & 16777472);
                        var24[var18] = var175 - var177 | var177 - (var177 >>> 8);
                        var23[var18] = (float)arg2;
                     }
                  }

                  var10 += var14;
                  ++var18;
               }

               var11 += var15;
               var10 = var166;
               var18 += var19;
            }

         }
      }
   }
}
