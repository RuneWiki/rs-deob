import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class587 extends class194 {
   @OriginalMember(
      owner = "client!rc",
      name = "J",
      descriptor = "Lto;"
   )
   public class523 field8667;
   @OriginalMember(
      owner = "client!rc",
      name = "N",
      descriptor = "S"
   )
   private short field8675;
   @OriginalMember(
      owner = "client!rc",
      name = "G",
      descriptor = "S"
   )
   private short field8671;
   @OriginalMember(
      owner = "client!rc",
      name = "H",
      descriptor = "S"
   )
   private short field8669;
   @OriginalMember(
      owner = "client!rc",
      name = "L",
      descriptor = "S"
   )
   private short field8668;
   @OriginalMember(
      owner = "client!rc",
      name = "M",
      descriptor = "S"
   )
   private short field8673;
   @OriginalMember(
      owner = "client!rc",
      name = "K",
      descriptor = "I"
   )
   private int field8674;
   @OriginalMember(
      owner = "client!rc",
      name = "O",
      descriptor = "I"
   )
   private int field8670;
   @OriginalMember(
      owner = "client!rc",
      name = "I",
      descriptor = "S"
   )
   private short field8672;

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(Lha;J)V"
   )
   public final void method4385(class610 arg0, long arg1) {
      int var4 = super.field3005 >> class394.field6180 + 12;
      int var5 = super.field3014 >> class394.field6180 + 12;
      int var6 = super.field3009 >> 12;
      if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class247.field3734 && var5 >= 0 && var5 < class365.field5634) {
         class743 var7 = this.field8667.field7973;
         class257 var8 = this.field8667.field7972;
         class271[] var9 = class385.field6076;
         int var10 = var7.field11048;
         class190 var11 = class711.field10694[var7.field11048][var4][var5];
         if (var11 != null) {
            var10 = var11.field2954;
         }

         int var12 = var9[var10].method2313(-123, var4, var5);
         int var13;
         if (var10 < class461.field7016 - 1) {
            var13 = var9[var10 + 1].method2313(-128, var4, var5);
         } else {
            var13 = var12 - (8 << class394.field6180);
         }

         if (var8.field3917) {
            if (var8.field3883 == -1 && var6 > var12) {
               this.method4389();
               return;
            }

            if (var8.field3883 >= 0 && var6 > var9[var8.field3883].method2313(-122, var4, var5)) {
               this.method4389();
               return;
            }

            if (var8.field3936 == -1 && var6 < var13) {
               this.method4389();
               return;
            }

            if (var8.field3936 >= 0 && var6 < var9[var8.field3936 + 1].method2313(-119, var4, var5)) {
               this.method4389();
               return;
            }
         }

         int var14;
         for(var14 = class461.field7016 - 1; var14 > 0 && var6 > var9[var14].method2313(-121, var4, var5); --var14) {
         }

         if (var8.field3942 && var14 == 0 && var6 > var9[0].method2313(117, var4, var5)) {
            this.method4389();
         } else if (class461.field7016 - 1 == var14 && var9[var14].method2313(24, var4, var5) - var6 > 8 << class394.field6180) {
            this.method4389();
         } else {
            class190 var15 = class711.field10694[var14][var4][var5];
            if (var15 == null) {
               if (var14 == 0 || class711.field10694[0][var4][var5] == null) {
                  var15 = class711.field10694[0][var4][var5] = new class190(0);
               }

               boolean var16 = class711.field10694[0][var4][var5].field2959 != null;
               if (var14 == 3 && var16) {
                  this.method4389();
                  return;
               }

               for(int var17 = 1; var17 <= var14; ++var17) {
                  if (class711.field10694[var17][var4][var5] == null) {
                     var15 = class711.field10694[var17][var4][var5] = new class190(var17);
                     if (var16) {
                        ++var15.field2954;
                     }
                  }
               }
            }

            if (var8.field3935) {
               int var18 = super.field3005 >> 12;
               int var19 = super.field3014 >> 12;
               if (var15.field2960 != null) {
                  class680 var20 = var15.field2960.method41(4058, arg0);
                  if (var20 != null && var20.method5038(false, var19, var18, var6)) {
                     this.method4389();
                     return;
                  }
               }

               if (var15.field2955 != null) {
                  class680 var21 = var15.field2955.method41(4058, arg0);
                  if (var21 != null && var21.method5038(false, var19, var18, var6)) {
                     this.method4389();
                     return;
                  }
               }

               if (var15.field2952 != null) {
                  class680 var22 = var15.field2952.method41(4058, arg0);
                  if (var22 != null && var22.method5038(false, var19, var18, var6)) {
                     this.method4389();
                     return;
                  }
               }

               for(class605 var23 = var15.field2962; var23 != null; var23 = var23.field8840) {
                  class680 var24 = var23.field8839.method41(4058, arg0);
                  if (var24 != null && var24.method5038(false, var19, var18, var6)) {
                     this.method4389();
                     return;
                  }
               }
            }

            var7.field11047.field571.method123(this, -84);
         }
      } else {
         this.method4389();
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(Lto;IIIIIIIIIIIZZ)V"
   )
   public final void method4386(class523 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
      this.field8667 = arg0;
      super.field3005 = arg1 << 12;
      super.field3009 = arg2 << 12;
      super.field3014 = arg3 << 12;
      super.field3011 = arg9;
      this.field8671 = this.field8675 = (short)arg8;
      super.field3013 = arg10;
      super.field3007 = arg11;
      super.field3004 = arg13;
      this.field8669 = (short)arg4;
      this.field8668 = (short)arg5;
      this.field8673 = (short)arg6;
      this.field8674 = arg7;
      super.field3010 = this.field8667.field7968.field8511;
      this.method4388();
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(JI)V"
   )
   public final void method4387(long arg0, int arg1) {
      this.field8675 = (short)(this.field8675 - arg1);
      if (this.field8675 <= 0) {
         this.method4389();
      } else {
         int var4 = super.field3005 >> 12;
         int var5 = super.field3009 >> 12;
         int var6 = super.field3014 >> 12;
         class743 var7 = this.field8667.field7973;
         class257 var8 = this.field8667.field7972;
         if (var8.field3926 != 0) {
            if (this.field8671 - this.field8675 <= var8.field3922) {
               int var9 = var8.field3893 * arg1 + (this.field8670 >> 16 & 255) + (super.field3011 >> 8 & 65280);
               int var10 = var8.field3930 * arg1 + (this.field8670 >> 8 & 255) + (super.field3011 & 65280);
               int var11 = var8.field3933 * arg1 + (super.field3011 << 8 & 65280) + (this.field8670 & 255);
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

               super.field3011 &= -16777216;
               super.field3011 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
               this.field8670 &= -16777216;
               this.field8670 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
            }

            if (this.field8671 - this.field8675 <= var8.field3919) {
               int var12 = var8.field3900 * arg1 + (this.field8670 >> 24 & 255) + (super.field3011 >> 16 & 65280);
               if (var12 < 0) {
                  var12 = 0;
               } else if (var12 > 65535) {
                  var12 = 65535;
               }

               super.field3011 &= 16777215;
               super.field3011 |= (var12 & 65280) << 16;
               this.field8670 &= 16777215;
               this.field8670 |= (var12 & 255) << 24;
            }
         }

         if (var8.field3889 != -1 && this.field8671 - this.field8675 <= var8.field3902) {
            this.field8674 += var8.field3878 * arg1;
         }

         if (var8.field3931 != -1 && this.field8671 - this.field8675 <= var8.field3914) {
            super.field3013 += var8.field3896 * arg1;
         }

         double var13 = (double)this.field8669;
         double var15 = (double)this.field8668;
         double var17 = (double)this.field8673;
         boolean var19 = false;
         if (var8.field3921 == 1) {
            int var20 = var4 - this.field8667.field7970.field1401;
            int var21 = var5 - this.field8667.field7970.field1410;
            int var22 = var6 - this.field8667.field7970.field1409;
            int var23 = (int)Math.sqrt((double)(var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
            long var24 = (long)(var8.field3899 * var23 * arg1);
            this.field8674 = (int)((long)this.field8674 - ((long)this.field8674 * var24 >> 18));
         } else if (var8.field3921 == 2) {
            int var26 = var4 - this.field8667.field7970.field1401;
            int var27 = var5 - this.field8667.field7970.field1410;
            int var28 = var6 - this.field8667.field7970.field1409;
            int var29 = var28 * var28 + var26 * var26 + var27 * var27;
            long var30 = (long)(var8.field3899 * var29 * arg1);
            this.field8674 = (int)((long)this.field8674 - ((long)this.field8674 * var30 >> 28));
         }

         if (var8.field3940 != null) {
            class294 var32 = var7.field11044.field10053;

            for(class294 var33 = var32.field4656; var32 != var33; var33 = var33.field4656) {
               class734 var34 = (class734)var33;
               class481 var35 = var34.field10938;
               if (var35.field7307 != 1) {
                  boolean var36 = false;

                  for(int var37 = 0; var37 < var8.field3940.length; ++var37) {
                     if (var8.field3940[var37] == var35.field7310) {
                        var36 = true;
                        break;
                     }
                  }

                  if (var36) {
                     double var38 = (double)(var4 - var34.field10941);
                     double var40 = (double)(var5 - var34.field10940);
                     double var42 = (double)(var6 - var34.field10932);
                     double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                     if (!(var44 > (double)var35.field7311)) {
                        double var46 = Math.sqrt(var44);
                        if (var46 == 0.0D) {
                           var46 = 1.0D;
                        }

                        double var48 = ((double)var34.field10937 * var42 + (double)var34.field10933 * var38 + (double)var35.field7304 * var40) * 65535.0D / ((double)var35.field7314 * var46);
                        if (!(var48 < (double)var35.field7317)) {
                           double var50 = 0.0D;
                           if (var35.field7299 == 1) {
                              var50 = var46 / 16.0D * (double)var35.field7300;
                           } else if (var35.field7299 == 2) {
                              var50 = var46 / 16.0D * (var46 / 16.0D) * (double)var35.field7300;
                           }

                           if (var35.field7301 == 0) {
                              if (var35.field7312 == 0) {
                                 var13 += ((double)var34.field10933 - var50) * (double)arg1;
                                 var15 += ((double)var35.field7304 - var50) * (double)arg1;
                                 var17 += ((double)var34.field10937 - var50) * (double)arg1;
                                 var19 = true;
                              } else {
                                 super.field3005 = (int)((double)super.field3005 + ((double)var34.field10933 - var50) * (double)arg1);
                                 super.field3009 = (int)((double)super.field3009 + ((double)var35.field7304 - var50) * (double)arg1);
                                 super.field3014 = (int)((double)super.field3014 + ((double)var34.field10937 - var50) * (double)arg1);
                              }
                           } else {
                              double var52 = var38 / var46 * (double)var35.field7314;
                              double var54 = var40 / var46 * (double)var35.field7314;
                              double var56 = var42 / var46 * (double)var35.field7314;
                              if (var35.field7312 == 0) {
                                 var13 += (double)arg1 * var52;
                                 var15 += (double)arg1 * var54;
                                 var17 += (double)arg1 * var56;
                                 var19 = true;
                              } else {
                                 super.field3005 = (int)((double)super.field3005 + (double)arg1 * var52);
                                 super.field3009 = (int)((double)super.field3009 + (double)arg1 * var54);
                                 super.field3014 = (int)((double)super.field3014 + (double)arg1 * var56);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if (var8.field3941 != null) {
            for(int var58 = 0; var58 < var8.field3941.length; ++var58) {
               class734 var59 = (class734)class278.field4453.method4817((long)var8.field3941[var58], (byte)-68);

               while(var59 != null) {
                  class481 var60 = var59.field10938;
                  double var61 = (double)(var4 - var59.field10941);
                  double var63 = (double)(var5 - var59.field10940);
                  double var65 = (double)(var6 - var59.field10932);
                  double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                  if (var67 > (double)var60.field7311) {
                     var59 = (class734)class278.field4453.method4816(-1);
                  } else {
                     double var69 = Math.sqrt(var67);
                     if (var69 == 0.0D) {
                        var69 = 1.0D;
                     }

                     double var71 = ((double)var59.field10937 * var65 + (double)var59.field10933 * var61 + (double)var60.field7304 * var63) * 65535.0D / ((double)var60.field7314 * var69);
                     if (var71 < (double)var60.field7317) {
                        var59 = (class734)class278.field4453.method4816(-1);
                     } else {
                        double var73 = 0.0D;
                        if (var60.field7299 == 1) {
                           var73 = var69 / 16.0D * (double)var60.field7300;
                        } else if (var60.field7299 == 2) {
                           var73 = var69 / 16.0D * (var69 / 16.0D) * (double)var60.field7300;
                        }

                        if (var60.field7301 == 0) {
                           if (var60.field7312 == 0) {
                              var13 += ((double)var59.field10933 - var73) * (double)arg1;
                              var15 += ((double)var60.field7304 - var73) * (double)arg1;
                              var17 += ((double)var59.field10937 - var73) * (double)arg1;
                              var19 = true;
                           } else {
                              super.field3005 = (int)((double)super.field3005 + ((double)var59.field10933 - var73) * (double)arg1);
                              super.field3009 = (int)((double)super.field3009 + ((double)var60.field7304 - var73) * (double)arg1);
                              super.field3014 = (int)((double)super.field3014 + ((double)var59.field10937 - var73) * (double)arg1);
                           }
                        } else {
                           double var75 = var61 / var69 * (double)var60.field7314;
                           double var77 = var63 / var69 * (double)var60.field7314;
                           double var79 = var65 / var69 * (double)var60.field7314;
                           if (var60.field7312 == 0) {
                              var13 += (double)arg1 * var75;
                              var15 += (double)arg1 * var77;
                              var17 += (double)arg1 * var79;
                              var19 = true;
                           } else {
                              super.field3005 = (int)((double)super.field3005 + (double)arg1 * var75);
                              super.field3009 = (int)((double)super.field3009 + (double)arg1 * var77);
                              super.field3014 = (int)((double)super.field3014 + (double)arg1 * var79);
                           }
                        }

                        var59 = (class734)class278.field4453.method4816(-1);
                     }
                  }
               }
            }
         }

         if (var8.field3910 != null) {
            if (var8.field3892 == null) {
               var8.field3892 = new int[var8.field3910.length];

               for(int var81 = 0; var81 < var8.field3910.length; ++var81) {
                  class523.method4035(1, var8.field3910[var81]);
                  var8.field3892[var81] = ((class668)class96.field1351.method3141((long)var8.field3910[var81], true)).field9986;
               }
            }

            for(int var82 = 0; var82 < var8.field3892.length; ++var82) {
               class481 var83 = class87.field1270[var8.field3892[var82]];
               if (var83.field7312 == 0) {
                  var13 += (double)(var83.field7303 * arg1);
                  var15 += (double)(var83.field7304 * arg1);
                  var17 += (double)(var83.field7316 * arg1);
                  var19 = true;
               } else {
                  super.field3005 += var83.field7303 * arg1;
                  super.field3009 += var83.field7304 * arg1;
                  super.field3014 += var83.field7316 * arg1;
               }
            }
         }

         if (var19) {
            while(true) {
               if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                  this.field8669 = (short)((int)var13);
                  this.field8668 = (short)((int)var15);
                  this.field8673 = (short)((int)var17);
                  break;
               }

               var13 /= 2.0D;
               var15 /= 2.0D;
               var17 /= 2.0D;
               this.field8674 <<= 1;
            }
         }

         super.field3005 = (int)((long)super.field3005 + ((long)(this.field8674 << 2) * (long)this.field8669 >> 23) * (long)arg1);
         super.field3009 = (int)((long)super.field3009 + ((long)(this.field8674 << 2) * (long)this.field8668 >> 23) * (long)arg1);
         super.field3014 = (int)((long)super.field3014 + ((long)(this.field8674 << 2) * (long)this.field8673 >> 23) * (long)arg1);
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "()V"
   )
   private final void method4388() {
      int var1 = this.field8667.field7973.field11041;
      if (this.field8667.field7973.field11039[var1] != null) {
         this.field8667.field7973.field11039[var1].method4389();
      }

      this.field8667.field7973.field11039[var1] = this;
      this.field8672 = (short)this.field8667.field7973.field11041;
      this.field8667.field7973.field11041 = var1 + 1 & 8191;
      this.field8667.field7978.method1813(this, 0);
   }

   @OriginalMember(
      owner = "client!rc",
      name = "b",
      descriptor = "()V"
   )
   public final void method4389() {
      this.field8667.field7973.field11039[this.field8672] = null;
      class592.field8721[class568.field8408] = this;
      class568.field8408 = class568.field8408 + 1 & 1023;
      this.method3159(true);
      this.method3491(107);
   }

   @OriginalMember(
      owner = "client!rc",
      name = "<init>",
      descriptor = "(Lto;IIIIIIIIIIIZZ)V"
   )
   public class587(class523 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
      this.field8667 = arg0;
      super.field3005 = arg1 << 12;
      super.field3009 = arg2 << 12;
      super.field3014 = arg3 << 12;
      super.field3011 = arg9;
      this.field8671 = this.field8675 = (short)arg8;
      super.field3013 = arg10;
      super.field3007 = arg11;
      super.field3004 = arg13;
      this.field8669 = (short)arg4;
      this.field8668 = (short)arg5;
      this.field8673 = (short)arg6;
      this.field8674 = arg7;
      super.field3010 = this.field8667.field7968.field8511;
      this.method4388();
   }
}
