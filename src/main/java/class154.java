import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class154 extends class137 {
   @OriginalMember(
      owner = "client!fga",
      name = "P",
      descriptor = "Lvu;"
   )
   public class775 field2350;
   @OriginalMember(
      owner = "client!fga",
      name = "Q",
      descriptor = "S"
   )
   private short field2346;
   @OriginalMember(
      owner = "client!fga",
      name = "O",
      descriptor = "S"
   )
   private short field2347;
   @OriginalMember(
      owner = "client!fga",
      name = "N",
      descriptor = "S"
   )
   private short field2349;
   @OriginalMember(
      owner = "client!fga",
      name = "M",
      descriptor = "S"
   )
   private short field2352;
   @OriginalMember(
      owner = "client!fga",
      name = "I",
      descriptor = "S"
   )
   private short field2345;
   @OriginalMember(
      owner = "client!fga",
      name = "K",
      descriptor = "I"
   )
   private int field2351;
   @OriginalMember(
      owner = "client!fga",
      name = "L",
      descriptor = "I"
   )
   private int field2348;
   @OriginalMember(
      owner = "client!fga",
      name = "J",
      descriptor = "S"
   )
   private short field2344;

   @OriginalMember(
      owner = "client!fga",
      name = "b",
      descriptor = "()V"
   )
   public final void method1480() {
      this.field2350.field11296.field7502[this.field2344] = null;
      class742.field10567[class661.field9302] = this;
      class661.field9302 = class661.field9302 + 1 & 1023;
      this.method4994((byte)-100);
      this.method315(-10441);
   }

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(Lha;J)V"
   )
   public final void method1481(class17 arg0, long arg1) {
      int var4 = super.field2201 >> class313.field4707 + 12;
      int var5 = super.field2198 >> class313.field4707 + 12;
      int var6 = super.field2209 >> 12;
      if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class155.field2381 && var5 >= 0 && var5 < class25.field360) {
         class532 var7 = this.field2350.field11296;
         class351 var8 = this.field2350.field11305;
         class751[] var9 = class225.field3197;
         int var10 = var7.field7510;
         class312 var11 = class324.field4826[var7.field7510][var4][var5];
         if (var11 != null) {
            var10 = var11.field4687;
         }

         int var12 = var9[var10].method5400(-1, var5, var4);
         int var13;
         if (var10 < class522.field7337 - 1) {
            var13 = var9[var10 + 1].method5400(-1, var5, var4);
         } else {
            var13 = var12 - (8 << class313.field4707);
         }

         if (var8.field5140) {
            if (var8.field5166 == -1 && var6 > var12) {
               this.method1480();
               return;
            }

            if (var8.field5166 >= 0 && var6 > var9[var8.field5166].method5400(-1, var5, var4)) {
               this.method1480();
               return;
            }

            if (var8.field5151 == -1 && var6 < var13) {
               this.method1480();
               return;
            }

            if (var8.field5151 >= 0 && var6 < var9[var8.field5151 + 1].method5400(-1, var5, var4)) {
               this.method1480();
               return;
            }
         }

         int var14;
         for(var14 = class522.field7337 - 1; var14 > 0 && var6 > var9[var14].method5400(-1, var5, var4); --var14) {
         }

         if (var8.field5138 && var14 == 0 && var6 > var9[0].method5400(-1, var5, var4)) {
            this.method1480();
         } else if (class522.field7337 - 1 == var14 && var9[var14].method5400(-1, var5, var4) - var6 > 8 << class313.field4707) {
            this.method1480();
         } else {
            class312 var15 = class324.field4826[var14][var4][var5];
            if (var15 == null) {
               if (var14 == 0 || class324.field4826[0][var4][var5] == null) {
                  var15 = class324.field4826[0][var4][var5] = new class312(0);
               }

               boolean var16 = class324.field4826[0][var4][var5].field4685 != null;
               if (var14 == 3 && var16) {
                  this.method1480();
                  return;
               }

               for(int var17 = 1; var17 <= var14; ++var17) {
                  if (class324.field4826[var17][var4][var5] == null) {
                     var15 = class324.field4826[var17][var4][var5] = new class312(var17);
                     if (var16) {
                        ++var15.field4687;
                     }
                  }
               }
            }

            if (var8.field5156) {
               int var18 = super.field2201 >> 12;
               int var19 = super.field2198 >> 12;
               if (var15.field4688 != null) {
                  class358 var20 = var15.field4688.method722(false, arg0);
                  if (var20 != null && var20.method2816(var18, var19, -118, var6)) {
                     this.method1480();
                     return;
                  }
               }

               if (var15.field4689 != null) {
                  class358 var21 = var15.field4689.method722(false, arg0);
                  if (var21 != null && var21.method2816(var18, var19, -104, var6)) {
                     this.method1480();
                     return;
                  }
               }

               if (var15.field4677 != null) {
                  class358 var22 = var15.field4677.method722(false, arg0);
                  if (var22 != null && var22.method2816(var18, var19, -99, var6)) {
                     this.method1480();
                     return;
                  }
               }

               for(class84 var23 = var15.field4678; var23 != null; var23 = var23.field1305) {
                  class358 var24 = var23.field1299.method722(false, arg0);
                  if (var24 != null && var24.method2816(var18, var19, -113, var6)) {
                     this.method1480();
                     return;
                  }
               }
            }

            var7.field7507.field7334.method4838(this, true);
         }
      } else {
         this.method1480();
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(JI)V"
   )
   public final void method1482(long arg0, int arg1) {
      this.field2346 = (short)(this.field2346 - arg1);
      if (this.field2346 <= 0) {
         this.method1480();
      } else {
         int var4 = super.field2201 >> 12;
         int var5 = super.field2209 >> 12;
         int var6 = super.field2198 >> 12;
         class532 var7 = this.field2350.field11296;
         class351 var8 = this.field2350.field11305;
         if (var8.field5194 != 0) {
            if (this.field2347 - this.field2346 <= var8.field5210) {
               int var9 = var8.field5175 * arg1 + (this.field2348 >> 16 & 255) + (super.field2207 >> 8 & 65280);
               int var10 = var8.field5167 * arg1 + (this.field2348 >> 8 & 255) + (super.field2207 & 65280);
               int var11 = var8.field5178 * arg1 + (super.field2207 << 8 & 65280) + (this.field2348 & 255);
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

               super.field2207 &= -16777216;
               super.field2207 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
               this.field2348 &= -16777216;
               this.field2348 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
            }

            if (this.field2347 - this.field2346 <= var8.field5168) {
               int var12 = var8.field5179 * arg1 + (this.field2348 >> 24 & 255) + (super.field2207 >> 16 & 65280);
               if (var12 < 0) {
                  var12 = 0;
               } else if (var12 > 65535) {
                  var12 = 65535;
               }

               super.field2207 &= 16777215;
               super.field2207 |= (var12 & 65280) << 16;
               this.field2348 &= 16777215;
               this.field2348 |= (var12 & 255) << 24;
            }
         }

         if (var8.field5193 != -1 && this.field2347 - this.field2346 <= var8.field5146) {
            this.field2351 += var8.field5157 * arg1;
         }

         if (var8.field5185 != -1 && this.field2347 - this.field2346 <= var8.field5205) {
            super.field2204 += var8.field5206 * arg1;
         }

         double var13 = (double)this.field2349;
         double var15 = (double)this.field2352;
         double var17 = (double)this.field2345;
         boolean var19 = false;
         if (var8.field5202 == 1) {
            int var20 = var4 - this.field2350.field11303.field6003;
            int var21 = var5 - this.field2350.field11303.field5994;
            int var22 = var6 - this.field2350.field11303.field6002;
            int var23 = (int)Math.sqrt((double)(var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
            long var24 = (long)(var8.field5153 * var23 * arg1);
            this.field2351 = (int)((long)this.field2351 - ((long)this.field2351 * var24 >> 18));
         } else if (var8.field5202 == 2) {
            int var26 = var4 - this.field2350.field11303.field6003;
            int var27 = var5 - this.field2350.field11303.field5994;
            int var28 = var6 - this.field2350.field11303.field6002;
            int var29 = var28 * var28 + var26 * var26 + var27 * var27;
            long var30 = (long)(var8.field5153 * var29 * arg1);
            this.field2351 = (int)((long)this.field2351 - ((long)this.field2351 * var30 >> 28));
         }

         if (var8.field5201 != null) {
            class247 var32 = var7.field7506.field4002;

            for(class247 var33 = var32.field3781; var32 != var33; var33 = var33.field3781) {
               class1 var34 = (class1)var33;
               class34 var35 = var34.field6;
               if (var35.field507 != 1) {
                  boolean var36 = false;

                  for(int var37 = 0; var37 < var8.field5201.length; ++var37) {
                     if (var8.field5201[var37] == var35.field511) {
                        var36 = true;
                        break;
                     }
                  }

                  if (var36) {
                     double var38 = (double)(var4 - var34.field8);
                     double var40 = (double)(var5 - var34.field7);
                     double var42 = (double)(var6 - var34.field9);
                     double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                     if (!(var44 > (double)var35.field497)) {
                        double var46 = Math.sqrt(var44);
                        if (var46 == 0.0D) {
                           var46 = 1.0D;
                        }

                        double var48 = ((double)var34.field2 * var42 + (double)var34.field1 * var38 + (double)var35.field500 * var40) * 65535.0D / ((double)var35.field505 * var46);
                        if (!(var48 < (double)var35.field513)) {
                           double var50 = 0.0D;
                           if (var35.field498 == 1) {
                              var50 = var46 / 16.0D * (double)var35.field495;
                           } else if (var35.field498 == 2) {
                              var50 = var46 / 16.0D * (var46 / 16.0D) * (double)var35.field495;
                           }

                           if (var35.field506 == 0) {
                              if (var35.field502 == 0) {
                                 var13 += ((double)var34.field1 - var50) * (double)arg1;
                                 var15 += ((double)var35.field500 - var50) * (double)arg1;
                                 var17 += ((double)var34.field2 - var50) * (double)arg1;
                                 var19 = true;
                              } else {
                                 super.field2201 = (int)((double)super.field2201 + ((double)var34.field1 - var50) * (double)arg1);
                                 super.field2209 = (int)((double)super.field2209 + ((double)var35.field500 - var50) * (double)arg1);
                                 super.field2198 = (int)((double)super.field2198 + ((double)var34.field2 - var50) * (double)arg1);
                              }
                           } else {
                              double var52 = var38 / var46 * (double)var35.field505;
                              double var54 = var40 / var46 * (double)var35.field505;
                              double var56 = var42 / var46 * (double)var35.field505;
                              if (var35.field502 == 0) {
                                 var13 += (double)arg1 * var52;
                                 var15 += (double)arg1 * var54;
                                 var17 += (double)arg1 * var56;
                                 var19 = true;
                              } else {
                                 super.field2201 = (int)((double)super.field2201 + (double)arg1 * var52);
                                 super.field2209 = (int)((double)super.field2209 + (double)arg1 * var54);
                                 super.field2198 = (int)((double)super.field2198 + (double)arg1 * var56);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if (var8.field5199 != null) {
            for(int var58 = 0; var58 < var8.field5199.length; ++var58) {
               class1 var59 = (class1)class459.field6692.method4004((long)var8.field5199[var58], false);

               while(var59 != null) {
                  class34 var60 = var59.field6;
                  double var61 = (double)(var4 - var59.field8);
                  double var63 = (double)(var5 - var59.field7);
                  double var65 = (double)(var6 - var59.field9);
                  double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                  if (var67 > (double)var60.field497) {
                     var59 = (class1)class459.field6692.method4001((byte)76);
                  } else {
                     double var69 = Math.sqrt(var67);
                     if (var69 == 0.0D) {
                        var69 = 1.0D;
                     }

                     double var71 = ((double)var59.field2 * var65 + (double)var59.field1 * var61 + (double)var60.field500 * var63) * 65535.0D / ((double)var60.field505 * var69);
                     if (var71 < (double)var60.field513) {
                        var59 = (class1)class459.field6692.method4001((byte)101);
                     } else {
                        double var73 = 0.0D;
                        if (var60.field498 == 1) {
                           var73 = var69 / 16.0D * (double)var60.field495;
                        } else if (var60.field498 == 2) {
                           var73 = var69 / 16.0D * (var69 / 16.0D) * (double)var60.field495;
                        }

                        if (var60.field506 == 0) {
                           if (var60.field502 == 0) {
                              var13 += ((double)var59.field1 - var73) * (double)arg1;
                              var15 += ((double)var60.field500 - var73) * (double)arg1;
                              var17 += ((double)var59.field2 - var73) * (double)arg1;
                              var19 = true;
                           } else {
                              super.field2201 = (int)((double)super.field2201 + ((double)var59.field1 - var73) * (double)arg1);
                              super.field2209 = (int)((double)super.field2209 + ((double)var60.field500 - var73) * (double)arg1);
                              super.field2198 = (int)((double)super.field2198 + ((double)var59.field2 - var73) * (double)arg1);
                           }
                        } else {
                           double var75 = var61 / var69 * (double)var60.field505;
                           double var77 = var63 / var69 * (double)var60.field505;
                           double var79 = var65 / var69 * (double)var60.field505;
                           if (var60.field502 == 0) {
                              var13 += (double)arg1 * var75;
                              var15 += (double)arg1 * var77;
                              var17 += (double)arg1 * var79;
                              var19 = true;
                           } else {
                              super.field2201 = (int)((double)super.field2201 + (double)arg1 * var75);
                              super.field2209 = (int)((double)super.field2209 + (double)arg1 * var77);
                              super.field2198 = (int)((double)super.field2198 + (double)arg1 * var79);
                           }
                        }

                        var59 = (class1)class459.field6692.method4001((byte)125);
                     }
                  }
               }
            }
         }

         if (var8.field5162 != null) {
            if (var8.field5143 == null) {
               var8.field5143 = new int[var8.field5162.length];

               for(int var81 = 0; var81 < var8.field5162.length; ++var81) {
                  class777.method5614(121, var8.field5162[var81]);
                  var8.field5143[var81] = ((class288)class30.field434.method3101(-1, (long)var8.field5162[var81])).field4298;
               }
            }

            for(int var82 = 0; var82 < var8.field5143.length; ++var82) {
               class34 var83 = class316.field4724[var8.field5143[var82]];
               if (var83.field502 == 0) {
                  var13 += (double)(var83.field499 * arg1);
                  var15 += (double)(var83.field500 * arg1);
                  var17 += (double)(var83.field501 * arg1);
                  var19 = true;
               } else {
                  super.field2201 += var83.field499 * arg1;
                  super.field2209 += var83.field500 * arg1;
                  super.field2198 += var83.field501 * arg1;
               }
            }
         }

         if (var19) {
            while(true) {
               if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                  this.field2349 = (short)((int)var13);
                  this.field2352 = (short)((int)var15);
                  this.field2345 = (short)((int)var17);
                  break;
               }

               var13 /= 2.0D;
               var15 /= 2.0D;
               var17 /= 2.0D;
               this.field2351 <<= 1;
            }
         }

         super.field2201 = (int)((long)super.field2201 + ((long)(this.field2351 << 2) * (long)this.field2349 >> 23) * (long)arg1);
         super.field2209 = (int)((long)super.field2209 + ((long)(this.field2351 << 2) * (long)this.field2352 >> 23) * (long)arg1);
         super.field2198 = (int)((long)super.field2198 + ((long)(this.field2351 << 2) * (long)this.field2345 >> 23) * (long)arg1);
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(Lvu;IIIIIIIIIIIZZ)V"
   )
   public final void method1483(class775 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
      this.field2350 = arg0;
      super.field2201 = arg1 << 12;
      super.field2209 = arg2 << 12;
      super.field2198 = arg3 << 12;
      super.field2207 = arg9;
      this.field2347 = this.field2346 = (short)arg8;
      super.field2204 = arg10;
      super.field2199 = arg11;
      super.field2202 = arg13;
      this.field2349 = (short)arg4;
      this.field2352 = (short)arg5;
      this.field2345 = (short)arg6;
      this.field2351 = arg7;
      super.field2210 = this.field2350.field11300.field10241;
      this.method1484();
   }

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "()V"
   )
   private final void method1484() {
      int var1 = this.field2350.field11296.field7501;
      if (this.field2350.field11296.field7502[var1] != null) {
         this.field2350.field11296.field7502[var1].method1480();
      }

      this.field2350.field11296.field7502[var1] = this;
      this.field2344 = (short)this.field2350.field11296.field7501;
      this.field2350.field11296.field7501 = var1 + 1 & 8191;
      this.field2350.field11294.method3310(0, this);
   }

   @OriginalMember(
      owner = "client!fga",
      name = "<init>",
      descriptor = "(Lvu;IIIIIIIIIIIZZ)V"
   )
   public class154(class775 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
      this.field2350 = arg0;
      super.field2201 = arg1 << 12;
      super.field2209 = arg2 << 12;
      super.field2198 = arg3 << 12;
      super.field2207 = arg9;
      this.field2347 = this.field2346 = (short)arg8;
      super.field2204 = arg10;
      super.field2199 = arg11;
      super.field2202 = arg13;
      this.field2349 = (short)arg4;
      this.field2352 = (short)arg5;
      this.field2345 = (short)arg6;
      this.field2351 = arg7;
      super.field2210 = this.field2350.field11300.field10241;
      this.method1484();
   }
}
