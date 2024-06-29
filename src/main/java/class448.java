import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class448 extends class526 {
   @OriginalMember(
      owner = "client!un",
      name = "z",
      descriptor = "Luj;"
   )
   public class406 field6191;
   @OriginalMember(
      owner = "client!un",
      name = "F",
      descriptor = "S"
   )
   private short field6197;
   @OriginalMember(
      owner = "client!un",
      name = "B",
      descriptor = "S"
   )
   private short field6199;
   @OriginalMember(
      owner = "client!un",
      name = "J",
      descriptor = "S"
   )
   private short field6193;
   @OriginalMember(
      owner = "client!un",
      name = "I",
      descriptor = "S"
   )
   private short field6195;
   @OriginalMember(
      owner = "client!un",
      name = "A",
      descriptor = "S"
   )
   private short field6196;
   @OriginalMember(
      owner = "client!un",
      name = "D",
      descriptor = "I"
   )
   private int field6194;
   @OriginalMember(
      owner = "client!un",
      name = "G",
      descriptor = "I"
   )
   private int field6198;
   @OriginalMember(
      owner = "client!un",
      name = "H",
      descriptor = "S"
   )
   private short field6192;

   @OriginalMember(
      owner = "client!un",
      name = "b",
      descriptor = "()V"
   )
   public final void method3325() {
      this.field6191.field5728.field9879[this.field6192] = null;
      class421.field5900[class710.field10423] = this;
      class710.field10423 = class710.field10423 + 1 & 1023;
      this.method5512((byte)-125);
      this.method4642(121);
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(Luj;IIIIIIIIIIIZZ)V"
   )
   public final void method3326(class406 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
      this.field6191 = arg0;
      super.field7196 = arg1 << 12;
      super.field7191 = arg2 << 12;
      super.field7195 = arg3 << 12;
      super.field7200 = arg9;
      this.field6199 = this.field6197 = (short)arg8;
      super.field7194 = arg10;
      super.field7192 = arg11;
      super.field7193 = arg13;
      this.field6193 = (short)arg4;
      this.field6195 = (short)arg5;
      this.field6196 = (short)arg6;
      this.field6194 = arg7;
      super.field7197 = this.field6191.field5722.field272;
      this.method3327();
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "()V"
   )
   private final void method3327() {
      int var1 = this.field6191.field5728.field9880;
      if (this.field6191.field5728.field9879[var1] != null) {
         this.field6191.field5728.field9879[var1].method3325();
      }

      this.field6191.field5728.field9879[var1] = this;
      this.field6192 = (short)this.field6191.field5728.field9880;
      this.field6191.field5728.field9880 = var1 + 1 & 8191;
      this.field6191.field5721.method3116(this, -74);
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(Lha;J)V"
   )
   public final void method3328(class65 arg0, long arg1) {
      int var4 = super.field7196 >> class76.field965 + 12;
      int var5 = super.field7195 >> class76.field965 + 12;
      int var6 = super.field7191 >> 12;
      if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class635.field8973 && var5 >= 0 && var5 < class304.field4042) {
         class672 var7 = this.field6191.field5728;
         class91 var8 = this.field6191.field5733;
         class295[] var9 = class93.field1241;
         int var10 = var7.field9889;
         class225 var11 = class111.field1404[var7.field9889][var4][var5];
         if (var11 != null) {
            var10 = var11.field2825;
         }

         int var12 = var9[var10].method2221(false, var5, var4);
         int var13;
         if (var10 < class398.field5594 - 1) {
            var13 = var9[var10 + 1].method2221(false, var5, var4);
         } else {
            var13 = var12 - (8 << class76.field965);
         }

         if (var8.field1188) {
            if (var8.field1181 == -1 && var6 > var12) {
               this.method3325();
               return;
            }

            if (var8.field1181 >= 0 && var6 > var9[var8.field1181].method2221(false, var5, var4)) {
               this.method3325();
               return;
            }

            if (var8.field1219 == -1 && var6 < var13) {
               this.method3325();
               return;
            }

            if (var8.field1219 >= 0 && var6 < var9[var8.field1219 + 1].method2221(false, var5, var4)) {
               this.method3325();
               return;
            }
         }

         int var14;
         for(var14 = class398.field5594 - 1; var14 > 0 && var6 > var9[var14].method2221(false, var5, var4); --var14) {
         }

         if (var8.field1164 && var14 == 0 && var6 > var9[0].method2221(false, var5, var4)) {
            this.method3325();
         } else if (class398.field5594 - 1 == var14 && var9[var14].method2221(false, var5, var4) - var6 > 8 << class76.field965) {
            this.method3325();
         } else {
            class225 var15 = class111.field1404[var14][var4][var5];
            if (var15 == null) {
               if (var14 == 0 || class111.field1404[0][var4][var5] == null) {
                  var15 = class111.field1404[0][var4][var5] = new class225(0);
               }

               boolean var16 = class111.field1404[0][var4][var5].field2828 != null;
               if (var14 == 3 && var16) {
                  this.method3325();
                  return;
               }

               for(int var17 = 1; var17 <= var14; ++var17) {
                  if (class111.field1404[var17][var4][var5] == null) {
                     var15 = class111.field1404[var17][var4][var5] = new class225(var17);
                     if (var16) {
                        ++var15.field2825;
                     }
                  }
               }
            }

            if (var8.field1172) {
               int var18 = super.field7196 >> 12;
               int var19 = super.field7195 >> 12;
               if (var15.field2831 != null) {
                  class79 var20 = var15.field2831.method779(arg0, 0);
                  if (var20 != null && var20.method763(var18, var6, -114, var19)) {
                     this.method3325();
                     return;
                  }
               }

               if (var15.field2830 != null) {
                  class79 var21 = var15.field2830.method779(arg0, 0);
                  if (var21 != null && var21.method763(var18, var6, -124, var19)) {
                     this.method3325();
                     return;
                  }
               }

               if (var15.field2820 != null) {
                  class79 var22 = var15.field2820.method779(arg0, 0);
                  if (var22 != null && var22.method763(var18, var6, -114, var19)) {
                     this.method3325();
                     return;
                  }
               }

               for(class752 var23 = var15.field2821; var23 != null; var23 = var23.field10923) {
                  class79 var24 = var23.field10922.method779(arg0, 0);
                  if (var24 != null && var24.method763(var18, var6, 56, var19)) {
                     this.method3325();
                     return;
                  }
               }
            }

            var7.field9888.field6608.method1834(-5531, this);
         }
      } else {
         this.method3325();
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(JI)V"
   )
   public final void method3329(long arg0, int arg1) {
      this.field6197 = (short)(this.field6197 - arg1);
      if (this.field6197 <= 0) {
         this.method3325();
      } else {
         int var4 = super.field7196 >> 12;
         int var5 = super.field7191 >> 12;
         int var6 = super.field7195 >> 12;
         class672 var7 = this.field6191.field5728;
         class91 var8 = this.field6191.field5733;
         if (var8.field1216 != 0) {
            if (this.field6199 - this.field6197 <= var8.field1212) {
               int var9 = var8.field1176 * arg1 + (super.field7200 >> 8 & 65280) + (this.field6198 >> 16 & 255);
               int var10 = var8.field1168 * arg1 + (this.field6198 >> 8 & 255) + (super.field7200 & 65280);
               int var11 = var8.field1179 * arg1 + (super.field7200 << 8 & 65280) + (this.field6198 & 255);
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

               super.field7200 &= -16777216;
               super.field7200 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
               this.field6198 &= -16777216;
               this.field6198 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
            }

            if (this.field6199 - this.field6197 <= var8.field1197) {
               int var12 = var8.field1187 * arg1 + (super.field7200 >> 16 & 65280) + (this.field6198 >> 24 & 255);
               if (var12 < 0) {
                  var12 = 0;
               } else if (var12 > 65535) {
                  var12 = 65535;
               }

               super.field7200 &= 16777215;
               super.field7200 |= (var12 & 65280) << 16;
               this.field6198 &= 16777215;
               this.field6198 |= (var12 & 255) << 24;
            }
         }

         if (var8.field1184 != -1 && this.field6199 - this.field6197 <= var8.field1161) {
            this.field6194 += var8.field1185 * arg1;
         }

         if (var8.field1194 != -1 && this.field6199 - this.field6197 <= var8.field1170) {
            super.field7194 += var8.field1166 * arg1;
         }

         double var13 = (double)this.field6193;
         double var15 = (double)this.field6195;
         double var17 = (double)this.field6196;
         boolean var19 = false;
         if (var8.field1165 == 1) {
            int var20 = var4 - this.field6191.field5726.field188;
            int var21 = var5 - this.field6191.field5726.field173;
            int var22 = var6 - this.field6191.field5726.field177;
            int var23 = (int)Math.sqrt((double)(var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
            long var24 = (long)(var8.field1193 * var23 * arg1);
            this.field6194 = (int)((long)this.field6194 - ((long)this.field6194 * var24 >> 18));
         } else if (var8.field1165 == 2) {
            int var26 = var4 - this.field6191.field5726.field188;
            int var27 = var5 - this.field6191.field5726.field173;
            int var28 = var6 - this.field6191.field5726.field177;
            int var29 = var28 * var28 + var26 * var26 + var27 * var27;
            long var30 = (long)(var8.field1193 * var29 * arg1);
            this.field6194 = (int)((long)this.field6194 - ((long)this.field6194 * var30 >> 28));
         }

         if (var8.field1163 != null) {
            class500 var32 = var7.field9885.field7319;

            for(class500 var33 = var32.field6867; var32 != var33; var33 = var33.field6867) {
               class458 var34 = (class458)var33;
               class307 var35 = var34.field6276;
               if (var35.field4089 != 1) {
                  boolean var36 = false;

                  for(int var37 = 0; var37 < var8.field1163.length; ++var37) {
                     if (var8.field1163[var37] == var35.field4080) {
                        var36 = true;
                        break;
                     }
                  }

                  if (var36) {
                     double var38 = (double)(var4 - var34.field6278);
                     double var40 = (double)(var5 - var34.field6273);
                     double var42 = (double)(var6 - var34.field6282);
                     double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                     if (!(var44 > (double)var35.field4077)) {
                        double var46 = Math.sqrt(var44);
                        if (var46 == 0.0D) {
                           var46 = 1.0D;
                        }

                        double var48 = ((double)var34.field6270 * var42 + (double)var34.field6283 * var38 + (double)var35.field4082 * var40) * 65535.0D / ((double)var35.field4073 * var46);
                        if (!(var48 < (double)var35.field4086)) {
                           double var50 = 0.0D;
                           if (var35.field4090 == 1) {
                              var50 = var46 / 16.0D * (double)var35.field4078;
                           } else if (var35.field4090 == 2) {
                              var50 = var46 / 16.0D * (var46 / 16.0D) * (double)var35.field4078;
                           }

                           if (var35.field4081 == 0) {
                              if (var35.field4074 == 0) {
                                 var13 += ((double)var34.field6283 - var50) * (double)arg1;
                                 var15 += ((double)var35.field4082 - var50) * (double)arg1;
                                 var17 += ((double)var34.field6270 - var50) * (double)arg1;
                                 var19 = true;
                              } else {
                                 super.field7196 = (int)((double)super.field7196 + ((double)var34.field6283 - var50) * (double)arg1);
                                 super.field7191 = (int)((double)super.field7191 + ((double)var35.field4082 - var50) * (double)arg1);
                                 super.field7195 = (int)((double)super.field7195 + ((double)var34.field6270 - var50) * (double)arg1);
                              }
                           } else {
                              double var52 = var38 / var46 * (double)var35.field4073;
                              double var54 = var40 / var46 * (double)var35.field4073;
                              double var56 = var42 / var46 * (double)var35.field4073;
                              if (var35.field4074 == 0) {
                                 var13 += (double)arg1 * var52;
                                 var15 += (double)arg1 * var54;
                                 var17 += (double)arg1 * var56;
                                 var19 = true;
                              } else {
                                 super.field7196 = (int)((double)super.field7196 + (double)arg1 * var52);
                                 super.field7191 = (int)((double)super.field7191 + (double)arg1 * var54);
                                 super.field7195 = (int)((double)super.field7195 + (double)arg1 * var56);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if (var8.field1191 != null) {
            for(int var58 = 0; var58 < var8.field1191.length; ++var58) {
               class458 var59 = (class458)class569.field7809.method4603(119, (long)var8.field1191[var58]);

               while(var59 != null) {
                  class307 var60 = var59.field6276;
                  double var61 = (double)(var4 - var59.field6278);
                  double var63 = (double)(var5 - var59.field6273);
                  double var65 = (double)(var6 - var59.field6282);
                  double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                  if (var67 > (double)var60.field4077) {
                     var59 = (class458)class569.field7809.method4601(-82);
                  } else {
                     double var69 = Math.sqrt(var67);
                     if (var69 == 0.0D) {
                        var69 = 1.0D;
                     }

                     double var71 = ((double)var59.field6270 * var65 + (double)var59.field6283 * var61 + (double)var60.field4082 * var63) * 65535.0D / ((double)var60.field4073 * var69);
                     if (var71 < (double)var60.field4086) {
                        var59 = (class458)class569.field7809.method4601(-60);
                     } else {
                        double var73 = 0.0D;
                        if (var60.field4090 == 1) {
                           var73 = var69 / 16.0D * (double)var60.field4078;
                        } else if (var60.field4090 == 2) {
                           var73 = var69 / 16.0D * (var69 / 16.0D) * (double)var60.field4078;
                        }

                        if (var60.field4081 == 0) {
                           if (var60.field4074 == 0) {
                              var13 += ((double)var59.field6283 - var73) * (double)arg1;
                              var15 += ((double)var60.field4082 - var73) * (double)arg1;
                              var17 += ((double)var59.field6270 - var73) * (double)arg1;
                              var19 = true;
                           } else {
                              super.field7196 = (int)((double)super.field7196 + ((double)var59.field6283 - var73) * (double)arg1);
                              super.field7191 = (int)((double)super.field7191 + ((double)var60.field4082 - var73) * (double)arg1);
                              super.field7195 = (int)((double)super.field7195 + ((double)var59.field6270 - var73) * (double)arg1);
                           }
                        } else {
                           double var75 = var61 / var69 * (double)var60.field4073;
                           double var77 = var63 / var69 * (double)var60.field4073;
                           double var79 = var65 / var69 * (double)var60.field4073;
                           if (var60.field4074 == 0) {
                              var13 += (double)arg1 * var75;
                              var15 += (double)arg1 * var77;
                              var17 += (double)arg1 * var79;
                              var19 = true;
                           } else {
                              super.field7196 = (int)((double)super.field7196 + (double)arg1 * var75);
                              super.field7191 = (int)((double)super.field7191 + (double)arg1 * var77);
                              super.field7195 = (int)((double)super.field7195 + (double)arg1 * var79);
                           }
                        }

                        var59 = (class458)class569.field7809.method4601(-110);
                     }
                  }
               }
            }
         }

         if (var8.field1221 != null) {
            if (var8.field1204 == null) {
               var8.field1204 = new int[var8.field1221.length];

               for(int var81 = 0; var81 < var8.field1221.length; ++var81) {
                  class505.method3645(-115, var8.field1221[var81]);
                  var8.field1204[var81] = ((class144)class306.field4065.method1839(-127, (long)var8.field1221[var81])).field1905;
               }
            }

            for(int var82 = 0; var82 < var8.field1204.length; ++var82) {
               class307 var83 = class483.field6661[var8.field1204[var82]];
               if (var83.field4074 == 0) {
                  var13 += (double)(var83.field4084 * arg1);
                  var15 += (double)(var83.field4082 * arg1);
                  var17 += (double)(var83.field4070 * arg1);
                  var19 = true;
               } else {
                  super.field7196 += var83.field4084 * arg1;
                  super.field7191 += var83.field4082 * arg1;
                  super.field7195 += var83.field4070 * arg1;
               }
            }
         }

         if (var19) {
            while(true) {
               if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                  this.field6193 = (short)((int)var13);
                  this.field6195 = (short)((int)var15);
                  this.field6196 = (short)((int)var17);
                  break;
               }

               var13 /= 2.0D;
               var15 /= 2.0D;
               var17 /= 2.0D;
               this.field6194 <<= 1;
            }
         }

         super.field7196 = (int)((long)super.field7196 + ((long)(this.field6194 << 2) * (long)this.field6193 >> 23) * (long)arg1);
         super.field7191 = (int)((long)super.field7191 + ((long)(this.field6194 << 2) * (long)this.field6195 >> 23) * (long)arg1);
         super.field7195 = (int)((long)super.field7195 + ((long)(this.field6194 << 2) * (long)this.field6196 >> 23) * (long)arg1);
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "<init>",
      descriptor = "(Luj;IIIIIIIIIIIZZ)V"
   )
   public class448(class406 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
      this.field6191 = arg0;
      super.field7196 = arg1 << 12;
      super.field7191 = arg2 << 12;
      super.field7195 = arg3 << 12;
      super.field7200 = arg9;
      this.field6199 = this.field6197 = (short)arg8;
      super.field7194 = arg10;
      super.field7192 = arg11;
      super.field7193 = arg13;
      this.field6193 = (short)arg4;
      this.field6195 = (short)arg5;
      this.field6196 = (short)arg6;
      this.field6194 = arg7;
      super.field7197 = this.field6191.field5722.field272;
      this.method3327();
   }
}
