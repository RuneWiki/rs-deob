import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class404 extends class611 {
   @OriginalMember(
      owner = "client!ah",
      name = "D",
      descriptor = "Laia;"
   )
   public class238 field6201;
   @OriginalMember(
      owner = "client!ah",
      name = "G",
      descriptor = "S"
   )
   private short field6199;
   @OriginalMember(
      owner = "client!ah",
      name = "E",
      descriptor = "S"
   )
   private short field6195;
   @OriginalMember(
      owner = "client!ah",
      name = "C",
      descriptor = "S"
   )
   private short field6198;
   @OriginalMember(
      owner = "client!ah",
      name = "F",
      descriptor = "S"
   )
   private short field6197;
   @OriginalMember(
      owner = "client!ah",
      name = "I",
      descriptor = "S"
   )
   private short field6202;
   @OriginalMember(
      owner = "client!ah",
      name = "H",
      descriptor = "I"
   )
   private int field6203;
   @OriginalMember(
      owner = "client!ah",
      name = "A",
      descriptor = "I"
   )
   private int field6200;
   @OriginalMember(
      owner = "client!ah",
      name = "B",
      descriptor = "S"
   )
   private short field6196;

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(Laia;IIIIIIIIIIIZZ)V"
   )
   public final void method3101(class238 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
      this.field6201 = arg0;
      super.field8960 = arg1 << 12;
      super.field8954 = arg2 << 12;
      super.field8953 = arg3 << 12;
      super.field8948 = arg9;
      this.field6195 = this.field6199 = (short)arg8;
      super.field8952 = arg10;
      super.field8956 = arg11;
      super.field8957 = arg13;
      this.field6198 = (short)arg4;
      this.field6197 = (short)arg5;
      this.field6202 = (short)arg6;
      this.field6203 = arg7;
      super.field8950 = this.field6201.field3011.field4277;
      this.method3103();
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(Lha;J)V"
   )
   public final void method3102(class66 arg0, long arg1) {
      int var4 = super.field8960 >> class459.field6950 + 12;
      int var5 = super.field8953 >> class459.field6950 + 12;
      int var6 = super.field8954 >> 12;
      if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class239.field3036 && var5 >= 0 && var5 < class220.field2796) {
         class737 var7 = this.field6201.field3014;
         class344 var8 = this.field6201.field3015;
         class293[] var9 = class377.field5711;
         int var10 = var7.field10950;
         class72 var11 = class353.field5360[var7.field10950][var4][var5];
         if (var11 != null) {
            var10 = var11.field921;
         }

         int var12 = var9[var10].method2235(var5, 2116912585, var4);
         int var13;
         if (var10 < class424.field6437 - 1) {
            var13 = var9[var10 + 1].method2235(var5, 2116912585, var4);
         } else {
            var13 = var12 - (8 << class459.field6950);
         }

         if (var8.field5255) {
            if (var8.field5192 == -1 && var6 > var12) {
               this.method3105();
               return;
            }

            if (var8.field5192 >= 0 && var6 > var9[var8.field5192].method2235(var5, 2116912585, var4)) {
               this.method3105();
               return;
            }

            if (var8.field5203 == -1 && var6 < var13) {
               this.method3105();
               return;
            }

            if (var8.field5203 >= 0 && var6 < var9[var8.field5203 + 1].method2235(var5, 2116912585, var4)) {
               this.method3105();
               return;
            }
         }

         int var14;
         for(var14 = class424.field6437 - 1; var14 > 0 && var6 > var9[var14].method2235(var5, 2116912585, var4); --var14) {
         }

         if (var8.field5208 && var14 == 0 && var6 > var9[0].method2235(var5, 2116912585, var4)) {
            this.method3105();
         } else if (class424.field6437 - 1 == var14 && var9[var14].method2235(var5, 2116912585, var4) - var6 > 8 << class459.field6950) {
            this.method3105();
         } else {
            class72 var15 = class353.field5360[var14][var4][var5];
            if (var15 == null) {
               if (var14 == 0 || class353.field5360[0][var4][var5] == null) {
                  var15 = class353.field5360[0][var4][var5] = new class72(0);
               }

               boolean var16 = class353.field5360[0][var4][var5].field918 != null;
               if (var14 == 3 && var16) {
                  this.method3105();
                  return;
               }

               for(int var17 = 1; var17 <= var14; ++var17) {
                  if (class353.field5360[var17][var4][var5] == null) {
                     var15 = class353.field5360[var17][var4][var5] = new class72(var17);
                     if (var16) {
                        ++var15.field921;
                     }
                  }
               }
            }

            if (var8.field5240) {
               int var18 = super.field8960 >> 12;
               int var19 = super.field8953 >> 12;
               if (var15.field907 != null) {
                  class185 var20 = var15.field907.method16(-116, arg0);
                  if (var20 != null && var20.method1440(var19, var18, var6, 0)) {
                     this.method3105();
                     return;
                  }
               }

               if (var15.field915 != null) {
                  class185 var21 = var15.field915.method16(-118, arg0);
                  if (var21 != null && var21.method1440(var19, var18, var6, 0)) {
                     this.method3105();
                     return;
                  }
               }

               if (var15.field919 != null) {
                  class185 var22 = var15.field919.method16(-123, arg0);
                  if (var22 != null && var22.method1440(var19, var18, var6, 0)) {
                     this.method3105();
                     return;
                  }
               }

               for(class389 var23 = var15.field910; var23 != null; var23 = var23.field5942) {
                  class185 var24 = var23.field5943.method16(-122, arg0);
                  if (var24 != null && var24.method1440(var19, var18, var6, 0)) {
                     this.method3105();
                     return;
                  }
               }
            }

            var7.field10949.field1524.method395(-25224, this);
         }
      } else {
         this.method3105();
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "b",
      descriptor = "()V"
   )
   private final void method3103() {
      int var1 = this.field6201.field3014.field10944;
      if (this.field6201.field3014.field10941[var1] != null) {
         this.field6201.field3014.field10941[var1].method3105();
      }

      this.field6201.field3014.field10941[var1] = this;
      this.field6196 = (short)this.field6201.field3014.field10944;
      this.field6201.field3014.field10944 = var1 + 1 & 8191;
      this.field6201.field3009.method100(this, 1);
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(JI)V"
   )
   public final void method3104(long arg0, int arg1) {
      this.field6199 = (short)(this.field6199 - arg1);
      if (this.field6199 <= 0) {
         this.method3105();
      } else {
         int var4 = super.field8960 >> 12;
         int var5 = super.field8954 >> 12;
         int var6 = super.field8953 >> 12;
         class737 var7 = this.field6201.field3014;
         class344 var8 = this.field6201.field3015;
         if (var8.field5189 != 0) {
            if (this.field6195 - this.field6199 <= var8.field5243) {
               int var9 = var8.field5228 * arg1 + (super.field8948 >> 8 & 65280) + (this.field6200 >> 16 & 255);
               int var10 = var8.field5222 * arg1 + (this.field6200 >> 8 & 255) + (super.field8948 & 65280);
               int var11 = var8.field5202 * arg1 + (super.field8948 << 8 & 65280) + (this.field6200 & 255);
               if (var9 < 0) {
                  var9 = 0;
               } else if (var9 > 65535) {
                  var9 = 65535;
               }

               if (var10 < 0) {
                  var10 = 0;
               } else if (var10 > 65535) {
                  var10 = 65535;
               }

               if (var11 < 0) {
                  var11 = 0;
               } else if (var11 > 65535) {
                  var11 = 65535;
               }

               super.field8948 &= -16777216;
               super.field8948 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
               this.field6200 &= -16777216;
               this.field6200 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
            }

            if (this.field6195 - this.field6199 <= var8.field5216) {
               int var12 = var8.field5200 * arg1 + (super.field8948 >> 16 & 65280) + (this.field6200 >> 24 & 255);
               if (var12 < 0) {
                  var12 = 0;
               } else if (var12 > 65535) {
                  var12 = 65535;
               }

               super.field8948 &= 16777215;
               super.field8948 |= (var12 & 65280) << 16;
               this.field6200 &= 16777215;
               this.field6200 |= (var12 & 255) << 24;
            }
         }

         if (var8.field5223 != -1 && this.field6195 - this.field6199 <= var8.field5206) {
            this.field6203 += var8.field5233 * arg1;
         }

         if (var8.field5217 != -1 && this.field6195 - this.field6199 <= var8.field5254) {
            super.field8952 += var8.field5249 * arg1;
         }

         double var13 = (double)this.field6198;
         double var15 = (double)this.field6197;
         double var17 = (double)this.field6202;
         boolean var19 = false;
         if (var8.field5204 == 1) {
            int var20 = var4 - this.field6201.field3013.field9176;
            int var21 = var5 - this.field6201.field3013.field9169;
            int var22 = var6 - this.field6201.field3013.field9175;
            int var23 = (int)Math.sqrt((double)(var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
            long var24 = (long)(var8.field5199 * var23 * arg1);
            this.field6203 = (int)((long)this.field6203 - ((long)this.field6203 * var24 >> 18));
         } else if (var8.field5204 == 2) {
            int var26 = var4 - this.field6201.field3013.field9176;
            int var27 = var5 - this.field6201.field3013.field9169;
            int var28 = var6 - this.field6201.field3013.field9175;
            int var29 = var28 * var28 + var26 * var26 + var27 * var27;
            long var30 = (long)(var8.field5199 * var29 * arg1);
            this.field6203 = (int)((long)this.field6203 - ((long)this.field6203 * var30 >> 28));
         }

         if (var8.field5257 != null) {
            class347 var32 = var7.field10947.field8129;

            for(class347 var33 = var32.field5278; var32 != var33; var33 = var33.field5278) {
               class350 var34 = (class350)var33;
               class225 var35 = var34.field5312;
               if (var35.field2890 != 1) {
                  boolean var36 = false;

                  for(int var37 = 0; var37 < var8.field5257.length; ++var37) {
                     if (var8.field5257[var37] == var35.field2884) {
                        var36 = true;
                        break;
                     }
                  }

                  if (var36) {
                     double var38 = (double)(var4 - var34.field5300);
                     double var40 = (double)(var5 - var34.field5304);
                     double var42 = (double)(var6 - var34.field5303);
                     double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                     if (!(var44 > (double)var35.field2889)) {
                        double var46 = Math.sqrt(var44);
                        if (var46 == 0.0D) {
                           var46 = 1.0D;
                        }

                        double var48 = ((double)var34.field5307 * var42 + (double)var34.field5309 * var38 + (double)var35.field2876 * var40) * 65535.0D / ((double)var35.field2877 * var46);
                        if (!(var48 < (double)var35.field2878)) {
                           double var50 = 0.0D;
                           if (var35.field2873 == 1) {
                              var50 = var46 / 16.0D * (double)var35.field2881;
                           } else if (var35.field2873 == 2) {
                              var50 = var46 / 16.0D * (var46 / 16.0D) * (double)var35.field2881;
                           }

                           if (var35.field2888 == 0) {
                              if (var35.field2874 == 0) {
                                 var13 += ((double)var34.field5309 - var50) * (double)arg1;
                                 var15 += ((double)var35.field2876 - var50) * (double)arg1;
                                 var17 += ((double)var34.field5307 - var50) * (double)arg1;
                                 var19 = true;
                              } else {
                                 super.field8960 = (int)((double)super.field8960 + ((double)var34.field5309 - var50) * (double)arg1);
                                 super.field8954 = (int)((double)super.field8954 + ((double)var35.field2876 - var50) * (double)arg1);
                                 super.field8953 = (int)((double)super.field8953 + ((double)var34.field5307 - var50) * (double)arg1);
                              }
                           } else {
                              double var52 = var38 / var46 * (double)var35.field2877;
                              double var54 = var40 / var46 * (double)var35.field2877;
                              double var56 = var42 / var46 * (double)var35.field2877;
                              if (var35.field2874 == 0) {
                                 var13 += (double)arg1 * var52;
                                 var15 += (double)arg1 * var54;
                                 var17 += (double)arg1 * var56;
                                 var19 = true;
                              } else {
                                 super.field8960 = (int)((double)super.field8960 + (double)arg1 * var52);
                                 super.field8954 = (int)((double)super.field8954 + (double)arg1 * var54);
                                 super.field8953 = (int)((double)super.field8953 + (double)arg1 * var56);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if (var8.field5211 != null) {
            for(int var58 = 0; var58 < var8.field5211.length; ++var58) {
               class350 var59 = (class350)class441.field6719.method1370((long)var8.field5211[var58], 0);

               while(var59 != null) {
                  class225 var60 = var59.field5312;
                  double var61 = (double)(var4 - var59.field5300);
                  double var63 = (double)(var5 - var59.field5304);
                  double var65 = (double)(var6 - var59.field5303);
                  double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                  if (var67 > (double)var60.field2889) {
                     var59 = (class350)class441.field6719.method1371(-15141);
                  } else {
                     double var69 = Math.sqrt(var67);
                     if (var69 == 0.0D) {
                        var69 = 1.0D;
                     }

                     double var71 = ((double)var59.field5307 * var65 + (double)var59.field5309 * var61 + (double)var60.field2876 * var63) * 65535.0D / ((double)var60.field2877 * var69);
                     if (var71 < (double)var60.field2878) {
                        var59 = (class350)class441.field6719.method1371(-15141);
                     } else {
                        double var73 = 0.0D;
                        if (var60.field2873 == 1) {
                           var73 = var69 / 16.0D * (double)var60.field2881;
                        } else if (var60.field2873 == 2) {
                           var73 = var69 / 16.0D * (var69 / 16.0D) * (double)var60.field2881;
                        }

                        if (var60.field2888 == 0) {
                           if (var60.field2874 == 0) {
                              var13 += ((double)var59.field5309 - var73) * (double)arg1;
                              var15 += ((double)var60.field2876 - var73) * (double)arg1;
                              var17 += ((double)var59.field5307 - var73) * (double)arg1;
                              var19 = true;
                           } else {
                              super.field8960 = (int)((double)super.field8960 + ((double)var59.field5309 - var73) * (double)arg1);
                              super.field8954 = (int)((double)super.field8954 + ((double)var60.field2876 - var73) * (double)arg1);
                              super.field8953 = (int)((double)super.field8953 + ((double)var59.field5307 - var73) * (double)arg1);
                           }
                        } else {
                           double var75 = var61 / var69 * (double)var60.field2877;
                           double var77 = var63 / var69 * (double)var60.field2877;
                           double var79 = var65 / var69 * (double)var60.field2877;
                           if (var60.field2874 == 0) {
                              var13 += (double)arg1 * var75;
                              var15 += (double)arg1 * var77;
                              var17 += (double)arg1 * var79;
                              var19 = true;
                           } else {
                              super.field8960 = (int)((double)super.field8960 + (double)arg1 * var75);
                              super.field8954 = (int)((double)super.field8954 + (double)arg1 * var77);
                              super.field8953 = (int)((double)super.field8953 + (double)arg1 * var79);
                           }
                        }

                        var59 = (class350)class441.field6719.method1371(-15141);
                     }
                  }
               }
            }
         }

         if (var8.field5205 != null) {
            if (var8.field5241 == null) {
               var8.field5241 = new int[var8.field5205.length];

               for(int var81 = 0; var81 < var8.field5205.length; ++var81) {
                  class721.method5222(0, var8.field5205[var81]);
                  var8.field5241[var81] = ((class10)class367.field5523.method5681((long)var8.field5205[var81], -1)).field141;
               }
            }

            for(int var82 = 0; var82 < var8.field5241.length; ++var82) {
               class225 var83 = class483.field7171[var8.field5241[var82]];
               if (var83.field2874 == 0) {
                  var13 += (double)(var83.field2875 * arg1);
                  var15 += (double)(var83.field2876 * arg1);
                  var17 += (double)(var83.field2892 * arg1);
                  var19 = true;
               } else {
                  super.field8960 += var83.field2875 * arg1;
                  super.field8954 += var83.field2876 * arg1;
                  super.field8953 += var83.field2892 * arg1;
               }
            }
         }

         if (var19) {
            while(true) {
               if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                  this.field6198 = (short)((int)var13);
                  this.field6197 = (short)((int)var15);
                  this.field6202 = (short)((int)var17);
                  break;
               }

               var13 /= 2.0D;
               var15 /= 2.0D;
               var17 /= 2.0D;
               this.field6203 <<= 1;
            }
         }

         super.field8960 = (int)((long)super.field8960 + ((long)(this.field6203 << 2) * (long)this.field6198 >> 23) * (long)arg1);
         super.field8954 = (int)((long)super.field8954 + ((long)(this.field6203 << 2) * (long)this.field6197 >> 23) * (long)arg1);
         super.field8953 = (int)((long)super.field8953 + ((long)(this.field6203 << 2) * (long)this.field6202 >> 23) * (long)arg1);
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "()V"
   )
   public final void method3105() {
      this.field6201.field3014.field10941[this.field6196] = null;
      class442.field6738[class733.field10869] = this;
      class733.field10869 = class733.field10869 + 1 & 1023;
      this.method4413((byte)113);
      this.method5468(true);
   }

   @OriginalMember(
      owner = "client!ah",
      name = "<init>",
      descriptor = "(Laia;IIIIIIIIIIIZZ)V"
   )
   public class404(class238 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
      this.field6201 = arg0;
      super.field8960 = arg1 << 12;
      super.field8954 = arg2 << 12;
      super.field8953 = arg3 << 12;
      super.field8948 = arg9;
      this.field6195 = this.field6199 = (short)arg8;
      super.field8952 = arg10;
      super.field8956 = arg11;
      super.field8957 = arg13;
      this.field6198 = (short)arg4;
      this.field6197 = (short)arg5;
      this.field6202 = (short)arg6;
      this.field6203 = arg7;
      super.field8950 = this.field6201.field3011.field4277;
      this.method3103();
   }
}
