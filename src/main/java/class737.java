import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class737 extends class624 {
   @OriginalMember(
      owner = "client!ip",
      name = "J",
      descriptor = "Ldm;"
   )
   public class58 field10764;
   @OriginalMember(
      owner = "client!ip",
      name = "I",
      descriptor = "S"
   )
   private short field10766;
   @OriginalMember(
      owner = "client!ip",
      name = "N",
      descriptor = "S"
   )
   private short field10760;
   @OriginalMember(
      owner = "client!ip",
      name = "F",
      descriptor = "S"
   )
   private short field10762;
   @OriginalMember(
      owner = "client!ip",
      name = "L",
      descriptor = "S"
   )
   private short field10765;
   @OriginalMember(
      owner = "client!ip",
      name = "G",
      descriptor = "S"
   )
   private short field10763;
   @OriginalMember(
      owner = "client!ip",
      name = "H",
      descriptor = "I"
   )
   private int field10767;
   @OriginalMember(
      owner = "client!ip",
      name = "M",
      descriptor = "I"
   )
   private int field10761;
   @OriginalMember(
      owner = "client!ip",
      name = "K",
      descriptor = "S"
   )
   private short field10768;

   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "()V"
   )
   private final void method5349() {
      int var1 = this.field10764.field723.field8520;
      if (this.field10764.field723.field8516[var1] != null) {
         this.field10764.field723.field8516[var1].method5353();
      }

      this.field10764.field723.field8516[var1] = this;
      this.field10768 = (short)this.field10764.field723.field8520;
      this.field10764.field723.field8520 = var1 + 1 & 8191;
      this.field10764.field725.method5530(127, this);
   }

   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "(Ldm;IIIIIIIIIIIZZ)V"
   )
   public final void method5350(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
      this.field10764 = arg0;
      super.field9180 = arg1 << 12;
      super.field9172 = arg2 << 12;
      super.field9174 = arg3 << 12;
      super.field9175 = arg9;
      this.field10760 = this.field10766 = (short)arg8;
      super.field9181 = arg10;
      super.field9179 = arg11;
      super.field9173 = arg13;
      this.field10762 = (short)arg4;
      this.field10765 = (short)arg5;
      this.field10763 = (short)arg6;
      this.field10767 = arg7;
      super.field9170 = this.field10764.field724.field5374;
      this.method5349();
   }

   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "(JI)V"
   )
   public final void method5351(long arg0, int arg1) {
      this.field10766 = (short)(this.field10766 - arg1);
      if (this.field10766 <= 0) {
         this.method5353();
      } else {
         int var4 = super.field9180 >> 12;
         int var5 = super.field9172 >> 12;
         int var6 = super.field9174 >> 12;
         class577 var7 = this.field10764.field723;
         class457 var8 = this.field10764.field726;
         if (var8.field6544 != 0) {
            if (this.field10760 - this.field10766 <= var8.field6507) {
               int var9 = var8.field6522 * arg1 + (this.field10761 >> 16 & 255) + (super.field9175 >> 8 & 65280);
               int var10 = var8.field6512 * arg1 + (this.field10761 >> 8 & 255) + (super.field9175 & 65280);
               int var11 = var8.field6550 * arg1 + (super.field9175 << 8 & 65280) + (this.field10761 & 255);
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

               super.field9175 &= -16777216;
               super.field9175 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
               this.field10761 &= -16777216;
               this.field10761 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
            }

            if (this.field10760 - this.field10766 <= var8.field6565) {
               int var12 = var8.field6511 * arg1 + (this.field10761 >> 24 & 255) + (super.field9175 >> 16 & 65280);
               if (var12 < 0) {
                  var12 = 0;
               } else if (var12 > 65535) {
                  var12 = 65535;
               }

               super.field9175 &= 16777215;
               super.field9175 |= (var12 & 65280) << 16;
               this.field10761 &= 16777215;
               this.field10761 |= (var12 & 255) << 24;
            }
         }

         if (var8.field6547 != -1 && this.field10760 - this.field10766 <= var8.field6549) {
            this.field10767 += var8.field6503 * arg1;
         }

         if (var8.field6531 != -1 && this.field10760 - this.field10766 <= var8.field6545) {
            super.field9181 += var8.field6564 * arg1;
         }

         double var13 = (double)this.field10762;
         double var15 = (double)this.field10765;
         double var17 = (double)this.field10763;
         boolean var19 = false;
         if (var8.field6530 == 1) {
            int var20 = var4 - this.field10764.field719.field9766;
            int var21 = var5 - this.field10764.field719.field9763;
            int var22 = var6 - this.field10764.field719.field9762;
            int var23 = (int)Math.sqrt((double)(var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
            long var24 = (long)(var8.field6516 * var23 * arg1);
            this.field10767 = (int)((long)this.field10767 - ((long)this.field10767 * var24 >> 18));
         } else if (var8.field6530 == 2) {
            int var26 = var4 - this.field10764.field719.field9766;
            int var27 = var5 - this.field10764.field719.field9763;
            int var28 = var6 - this.field10764.field719.field9762;
            int var29 = var28 * var28 + var26 * var26 + var27 * var27;
            long var30 = (long)(var8.field6516 * var29 * arg1);
            this.field10767 = (int)((long)this.field10767 - ((long)this.field10767 * var30 >> 28));
         }

         if (var8.field6562 != null) {
            class428 var32 = var7.field8522.field5611;

            for(class428 var33 = var32.field6126; var32 != var33; var33 = var33.field6126) {
               class382 var34 = (class382)var33;
               class377 var35 = var34.field5498;
               if (var35.field5432 != 1) {
                  boolean var36 = false;

                  for(int var37 = 0; var37 < var8.field6562.length; ++var37) {
                     if (var8.field6562[var37] == var35.field5434) {
                        var36 = true;
                        break;
                     }
                  }

                  if (var36) {
                     double var38 = (double)(var4 - var34.field5506);
                     double var40 = (double)(var5 - var34.field5502);
                     double var42 = (double)(var6 - var34.field5495);
                     double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                     if (!(var44 > (double)var35.field5439)) {
                        double var46 = Math.sqrt(var44);
                        if (var46 == 0.0D) {
                           var46 = 1.0D;
                        }

                        double var48 = ((double)var34.field5496 * var42 + (double)var34.field5507 * var38 + (double)var35.field5436 * var40) * 65535.0D / ((double)var35.field5435 * var46);
                        if (!(var48 < (double)var35.field5445)) {
                           double var50 = 0.0D;
                           if (var35.field5447 == 1) {
                              var50 = var46 / 16.0D * (double)var35.field5433;
                           } else if (var35.field5447 == 2) {
                              var50 = var46 / 16.0D * (var46 / 16.0D) * (double)var35.field5433;
                           }

                           if (var35.field5441 == 0) {
                              if (var35.field5449 == 0) {
                                 var13 += ((double)var34.field5507 - var50) * (double)arg1;
                                 var15 += ((double)var35.field5436 - var50) * (double)arg1;
                                 var17 += ((double)var34.field5496 - var50) * (double)arg1;
                                 var19 = true;
                              } else {
                                 super.field9180 = (int)((double)super.field9180 + ((double)var34.field5507 - var50) * (double)arg1);
                                 super.field9172 = (int)((double)super.field9172 + ((double)var35.field5436 - var50) * (double)arg1);
                                 super.field9174 = (int)((double)super.field9174 + ((double)var34.field5496 - var50) * (double)arg1);
                              }
                           } else {
                              double var52 = var38 / var46 * (double)var35.field5435;
                              double var54 = var40 / var46 * (double)var35.field5435;
                              double var56 = var42 / var46 * (double)var35.field5435;
                              if (var35.field5449 == 0) {
                                 var13 += (double)arg1 * var52;
                                 var15 += (double)arg1 * var54;
                                 var17 += (double)arg1 * var56;
                                 var19 = true;
                              } else {
                                 super.field9180 = (int)((double)super.field9180 + (double)arg1 * var52);
                                 super.field9172 = (int)((double)super.field9172 + (double)arg1 * var54);
                                 super.field9174 = (int)((double)super.field9174 + (double)arg1 * var56);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if (var8.field6527 != null) {
            for(int var58 = 0; var58 < var8.field6527.length; ++var58) {
               class382 var59 = (class382)class17.field194.method3151((long)var8.field6527[var58], 7210);

               while(var59 != null) {
                  class377 var60 = var59.field5498;
                  double var61 = (double)(var4 - var59.field5506);
                  double var63 = (double)(var5 - var59.field5502);
                  double var65 = (double)(var6 - var59.field5495);
                  double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                  if (var67 > (double)var60.field5439) {
                     var59 = (class382)class17.field194.method3156(21291);
                  } else {
                     double var69 = Math.sqrt(var67);
                     if (var69 == 0.0D) {
                        var69 = 1.0D;
                     }

                     double var71 = ((double)var59.field5496 * var65 + (double)var59.field5507 * var61 + (double)var60.field5436 * var63) * 65535.0D / ((double)var60.field5435 * var69);
                     if (var71 < (double)var60.field5445) {
                        var59 = (class382)class17.field194.method3156(21291);
                     } else {
                        double var73 = 0.0D;
                        if (var60.field5447 == 1) {
                           var73 = var69 / 16.0D * (double)var60.field5433;
                        } else if (var60.field5447 == 2) {
                           var73 = var69 / 16.0D * (var69 / 16.0D) * (double)var60.field5433;
                        }

                        if (var60.field5441 == 0) {
                           if (var60.field5449 == 0) {
                              var13 += ((double)var59.field5507 - var73) * (double)arg1;
                              var15 += ((double)var60.field5436 - var73) * (double)arg1;
                              var17 += ((double)var59.field5496 - var73) * (double)arg1;
                              var19 = true;
                           } else {
                              super.field9180 = (int)((double)super.field9180 + ((double)var59.field5507 - var73) * (double)arg1);
                              super.field9172 = (int)((double)super.field9172 + ((double)var60.field5436 - var73) * (double)arg1);
                              super.field9174 = (int)((double)super.field9174 + ((double)var59.field5496 - var73) * (double)arg1);
                           }
                        } else {
                           double var75 = var61 / var69 * (double)var60.field5435;
                           double var77 = var63 / var69 * (double)var60.field5435;
                           double var79 = var65 / var69 * (double)var60.field5435;
                           if (var60.field5449 == 0) {
                              var13 += (double)arg1 * var75;
                              var15 += (double)arg1 * var77;
                              var17 += (double)arg1 * var79;
                              var19 = true;
                           } else {
                              super.field9180 = (int)((double)super.field9180 + (double)arg1 * var75);
                              super.field9172 = (int)((double)super.field9172 + (double)arg1 * var77);
                              super.field9174 = (int)((double)super.field9174 + (double)arg1 * var79);
                           }
                        }

                        var59 = (class382)class17.field194.method3156(21291);
                     }
                  }
               }
            }
         }

         if (var8.field6554 != null) {
            if (var8.field6523 == null) {
               var8.field6523 = new int[var8.field6554.length];

               for(int var81 = 0; var81 < var8.field6554.length; ++var81) {
                  class216.method1706(var8.field6554[var81], 1);
                  var8.field6523[var81] = ((class713)class543.field7802.method329((byte)120, (long)var8.field6554[var81])).field10388;
               }
            }

            for(int var82 = 0; var82 < var8.field6523.length; ++var82) {
               class377 var83 = class708.field10336[var8.field6523[var82]];
               if (var83.field5449 == 0) {
                  var13 += (double)(var83.field5451 * arg1);
                  var15 += (double)(var83.field5436 * arg1);
                  var17 += (double)(var83.field5444 * arg1);
                  var19 = true;
               } else {
                  super.field9180 += var83.field5451 * arg1;
                  super.field9172 += var83.field5436 * arg1;
                  super.field9174 += var83.field5444 * arg1;
               }
            }
         }

         if (var19) {
            while(true) {
               if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                  this.field10762 = (short)((int)var13);
                  this.field10765 = (short)((int)var15);
                  this.field10763 = (short)((int)var17);
                  break;
               }

               var13 /= 2.0D;
               var15 /= 2.0D;
               var17 /= 2.0D;
               this.field10767 <<= 1;
            }
         }

         super.field9180 = (int)((long)super.field9180 + ((long)(this.field10767 << 2) * (long)this.field10762 >> 23) * (long)arg1);
         super.field9172 = (int)((long)super.field9172 + ((long)(this.field10767 << 2) * (long)this.field10765 >> 23) * (long)arg1);
         super.field9174 = (int)((long)super.field9174 + ((long)(this.field10767 << 2) * (long)this.field10763 >> 23) * (long)arg1);
      }
   }

   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "(Lha;J)V"
   )
   public final void method5352(class66 arg0, long arg1) {
      int var4 = super.field9180 >> class773.field11359 + 12;
      int var5 = super.field9174 >> class773.field11359 + 12;
      int var6 = super.field9172 >> 12;
      if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class457.field6539 && var5 >= 0 && var5 < class16.field190) {
         class577 var7 = this.field10764.field723;
         class457 var8 = this.field10764.field726;
         class295[] var9 = class731.field10698;
         int var10 = var7.field8526;
         class517 var11 = class663.field9659[var7.field8526][var4][var5];
         if (var11 != null) {
            var10 = var11.field7466;
         }

         int var12 = var9[var10].method2219(true, var4, var5);
         int var13;
         if (var10 < class154.field2185 - 1) {
            var13 = var9[var10 + 1].method2219(true, var4, var5);
         } else {
            var13 = var12 - (8 << class773.field11359);
         }

         if (var8.field6571) {
            if (var8.field6534 == -1 && var6 > var12) {
               this.method5353();
               return;
            }

            if (var8.field6534 >= 0 && var6 > var9[var8.field6534].method2219(true, var4, var5)) {
               this.method5353();
               return;
            }

            if (var8.field6557 == -1 && var6 < var13) {
               this.method5353();
               return;
            }

            if (var8.field6557 >= 0 && var6 < var9[var8.field6557 + 1].method2219(true, var4, var5)) {
               this.method5353();
               return;
            }
         }

         int var14;
         for(var14 = class154.field2185 - 1; var14 > 0 && var6 > var9[var14].method2219(true, var4, var5); --var14) {
         }

         if (var8.field6563 && var14 == 0 && var6 > var9[0].method2219(true, var4, var5)) {
            this.method5353();
         } else if (class154.field2185 - 1 == var14 && var9[var14].method2219(true, var4, var5) - var6 > 8 << class773.field11359) {
            this.method5353();
         } else {
            class517 var15 = class663.field9659[var14][var4][var5];
            if (var15 == null) {
               if (var14 == 0 || class663.field9659[0][var4][var5] == null) {
                  var15 = class663.field9659[0][var4][var5] = new class517(0);
               }

               boolean var16 = class663.field9659[0][var4][var5].field7467 != null;
               if (var14 == 3 && var16) {
                  this.method5353();
                  return;
               }

               for(int var17 = 1; var17 <= var14; ++var17) {
                  if (class663.field9659[var17][var4][var5] == null) {
                     var15 = class663.field9659[var17][var4][var5] = new class517(var17);
                     if (var16) {
                        ++var15.field7466;
                     }
                  }
               }
            }

            if (var8.field6561) {
               int var18 = super.field9180 >> 12;
               int var19 = super.field9174 >> 12;
               if (var15.field7476 != null) {
                  class62 var20 = var15.field7476.method244(arg0, 92160000);
                  if (var20 != null && var20.method475(var6, -900129020, var18, var19)) {
                     this.method5353();
                     return;
                  }
               }

               if (var15.field7469 != null) {
                  class62 var21 = var15.field7469.method244(arg0, 92160000);
                  if (var21 != null && var21.method475(var6, -900129020, var18, var19)) {
                     this.method5353();
                     return;
                  }
               }

               if (var15.field7464 != null) {
                  class62 var22 = var15.field7464.method244(arg0, 92160000);
                  if (var22 != null && var22.method475(var6, -900129020, var18, var19)) {
                     this.method5353();
                     return;
                  }
               }

               for(class772 var23 = var15.field7468; var23 != null; var23 = var23.field11354) {
                  class62 var24 = var23.field11352.method244(arg0, 92160000);
                  if (var24 != null && var24.method475(var6, -900129020, var18, var19)) {
                     this.method5353();
                     return;
                  }
               }
            }

            var7.field8527.field3266.method4922(15, this);
         }
      } else {
         this.method5353();
      }
   }

   @OriginalMember(
      owner = "client!ip",
      name = "<init>",
      descriptor = "(Ldm;IIIIIIIIIIIZZ)V"
   )
   public class737(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
      this.field10764 = arg0;
      super.field9180 = arg1 << 12;
      super.field9172 = arg2 << 12;
      super.field9174 = arg3 << 12;
      super.field9175 = arg9;
      this.field10760 = this.field10766 = (short)arg8;
      super.field9181 = arg10;
      super.field9179 = arg11;
      super.field9173 = arg13;
      this.field10762 = (short)arg4;
      this.field10765 = (short)arg5;
      this.field10763 = (short)arg6;
      this.field10767 = arg7;
      super.field9170 = this.field10764.field724.field5374;
      this.method5349();
   }

   @OriginalMember(
      owner = "client!ip",
      name = "b",
      descriptor = "()V"
   )
   public final void method5353() {
      this.field10764.field723.field8516[this.field10768] = null;
      class508.field7406[class238.field3340] = this;
      class238.field3340 = class238.field3340 + 1 & 1023;
      this.method12((byte)23);
      this.method2967(-125);
   }
}
