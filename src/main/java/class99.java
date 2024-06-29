import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class99 extends class599 {
   @OriginalMember(
      owner = "client!aja",
      name = "H",
      descriptor = "Lcw;"
   )
   public class190 field1587;
   @OriginalMember(
      owner = "client!aja",
      name = "K",
      descriptor = "S"
   )
   private short field1589;
   @OriginalMember(
      owner = "client!aja",
      name = "I",
      descriptor = "S"
   )
   private short field1593;
   @OriginalMember(
      owner = "client!aja",
      name = "N",
      descriptor = "S"
   )
   private short field1588;
   @OriginalMember(
      owner = "client!aja",
      name = "M",
      descriptor = "S"
   )
   private short field1592;
   @OriginalMember(
      owner = "client!aja",
      name = "L",
      descriptor = "S"
   )
   private short field1595;
   @OriginalMember(
      owner = "client!aja",
      name = "G",
      descriptor = "I"
   )
   private int field1591;
   @OriginalMember(
      owner = "client!aja",
      name = "O",
      descriptor = "I"
   )
   private int field1594;
   @OriginalMember(
      owner = "client!aja",
      name = "J",
      descriptor = "S"
   )
   private short field1590;

   @OriginalMember(
      owner = "client!aja",
      name = "b",
      descriptor = "(JI)V"
   )
   public final void method954(long arg0, int arg1) {
      this.field1589 = (short)(this.field1589 - arg1);
      if (this.field1589 <= 0) {
         this.method956();
      } else {
         int var4 = super.field8645 >> 12;
         int var5 = super.field8630 >> 12;
         int var6 = super.field8634 >> 12;
         class42 var7 = this.field1587.field2854;
         class522 var8 = this.field1587.field2857;
         if (var8.field7601 != 0) {
            if (this.field1593 - this.field1589 <= var8.field7595) {
               int var9 = var8.field7627 * arg1 + (this.field1594 >> 16 & 255) + (super.field8641 >> 8 & 65280);
               int var10 = var8.field7619 * arg1 + (this.field1594 >> 8 & 255) + (super.field8641 & 65280);
               int var11 = var8.field7631 * arg1 + (super.field8641 << 8 & 65280) + (this.field1594 & 255);
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

               super.field8641 &= -16777216;
               super.field8641 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
               this.field1594 &= -16777216;
               this.field1594 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
            }

            if (this.field1593 - this.field1589 <= var8.field7608) {
               int var12 = var8.field7603 * arg1 + (this.field1594 >> 24 & 255) + (super.field8641 >> 16 & 65280);
               if (var12 < 0) {
                  var12 = 0;
               } else if (var12 > 65535) {
                  var12 = 65535;
               }

               super.field8641 &= 16777215;
               super.field8641 |= (var12 & 65280) << 16;
               this.field1594 &= 16777215;
               this.field1594 |= (var12 & 255) << 24;
            }
         }

         if (var8.field7638 != -1 && this.field1593 - this.field1589 <= var8.field7624) {
            this.field1591 += var8.field7607 * arg1;
         }

         if (var8.field7612 != -1 && this.field1593 - this.field1589 <= var8.field7644) {
            super.field8638 += var8.field7654 * arg1;
         }

         double var13 = (double)this.field1588;
         double var15 = (double)this.field1592;
         double var17 = (double)this.field1595;
         boolean var19 = false;
         if (var8.field7622 == 1) {
            int var20 = var4 - this.field1587.field2850.field10791;
            int var21 = var5 - this.field1587.field2850.field10793;
            int var22 = var6 - this.field1587.field2850.field10787;
            int var23 = (int)Math.sqrt((double)(var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
            long var24 = (long)(var8.field7623 * var23 * arg1);
            this.field1591 = (int)((long)this.field1591 - ((long)this.field1591 * var24 >> 18));
         } else if (var8.field7622 == 2) {
            int var26 = var4 - this.field1587.field2850.field10791;
            int var27 = var5 - this.field1587.field2850.field10793;
            int var28 = var6 - this.field1587.field2850.field10787;
            int var29 = var28 * var28 + var26 * var26 + var27 * var27;
            long var30 = (long)(var8.field7623 * var29 * arg1);
            this.field1591 = (int)((long)this.field1591 - ((long)this.field1591 * var30 >> 28));
         }

         if (var8.field7639 != null) {
            class22 var32 = var7.field973.field4749;

            for(class22 var33 = var32.field346; var32 != var33; var33 = var33.field346) {
               class217 var34 = (class217)var33;
               class732 var35 = var34.field3284;
               if (var35.field10519 != 1) {
                  boolean var36 = false;

                  for(int var37 = 0; var37 < var8.field7639.length; ++var37) {
                     if (var8.field7639[var37] == var35.field10526) {
                        var36 = true;
                        break;
                     }
                  }

                  if (var36) {
                     double var38 = (double)(var4 - var34.field3285);
                     double var40 = (double)(var5 - var34.field3283);
                     double var42 = (double)(var6 - var34.field3276);
                     double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                     if (!(var44 > (double)var35.field10514)) {
                        double var46 = Math.sqrt(var44);
                        if (var46 == 0.0D) {
                           var46 = 1.0D;
                        }

                        double var48 = ((double)var34.field3280 * var42 + (double)var34.field3278 * var38 + (double)var35.field10520 * var40) * 65535.0D / ((double)var35.field10518 * var46);
                        if (!(var48 < (double)var35.field10525)) {
                           double var50 = 0.0D;
                           if (var35.field10532 == 1) {
                              var50 = var46 / 16.0D * (double)var35.field10512;
                           } else if (var35.field10532 == 2) {
                              var50 = var46 / 16.0D * (var46 / 16.0D) * (double)var35.field10512;
                           }

                           if (var35.field10516 == 0) {
                              if (var35.field10522 == 0) {
                                 var13 += ((double)var34.field3278 - var50) * (double)arg1;
                                 var15 += ((double)var35.field10520 - var50) * (double)arg1;
                                 var17 += ((double)var34.field3280 - var50) * (double)arg1;
                                 var19 = true;
                              } else {
                                 super.field8645 = (int)((double)super.field8645 + ((double)var34.field3278 - var50) * (double)arg1);
                                 super.field8630 = (int)((double)super.field8630 + ((double)var35.field10520 - var50) * (double)arg1);
                                 super.field8634 = (int)((double)super.field8634 + ((double)var34.field3280 - var50) * (double)arg1);
                              }
                           } else {
                              double var52 = var38 / var46 * (double)var35.field10518;
                              double var54 = var40 / var46 * (double)var35.field10518;
                              double var56 = var42 / var46 * (double)var35.field10518;
                              if (var35.field10522 == 0) {
                                 var13 += (double)arg1 * var52;
                                 var15 += (double)arg1 * var54;
                                 var17 += (double)arg1 * var56;
                                 var19 = true;
                              } else {
                                 super.field8645 = (int)((double)super.field8645 + (double)arg1 * var52);
                                 super.field8630 = (int)((double)super.field8630 + (double)arg1 * var54);
                                 super.field8634 = (int)((double)super.field8634 + (double)arg1 * var56);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if (var8.field7646 != null) {
            for(int var58 = 0; var58 < var8.field7646.length; ++var58) {
               class217 var59 = (class217)class69.field1241.method2927((long)var8.field7646[var58], (byte)98);

               while(var59 != null) {
                  class732 var60 = var59.field3284;
                  double var61 = (double)(var4 - var59.field3285);
                  double var63 = (double)(var5 - var59.field3283);
                  double var65 = (double)(var6 - var59.field3276);
                  double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                  if (var67 > (double)var60.field10514) {
                     var59 = (class217)class69.field1241.method2928((byte)-82);
                  } else {
                     double var69 = Math.sqrt(var67);
                     if (var69 == 0.0D) {
                        var69 = 1.0D;
                     }

                     double var71 = ((double)var59.field3280 * var65 + (double)var59.field3278 * var61 + (double)var60.field10520 * var63) * 65535.0D / ((double)var60.field10518 * var69);
                     if (var71 < (double)var60.field10525) {
                        var59 = (class217)class69.field1241.method2928((byte)-82);
                     } else {
                        double var73 = 0.0D;
                        if (var60.field10532 == 1) {
                           var73 = var69 / 16.0D * (double)var60.field10512;
                        } else if (var60.field10532 == 2) {
                           var73 = var69 / 16.0D * (var69 / 16.0D) * (double)var60.field10512;
                        }

                        if (var60.field10516 == 0) {
                           if (var60.field10522 == 0) {
                              var13 += ((double)var59.field3278 - var73) * (double)arg1;
                              var15 += ((double)var60.field10520 - var73) * (double)arg1;
                              var17 += ((double)var59.field3280 - var73) * (double)arg1;
                              var19 = true;
                           } else {
                              super.field8645 = (int)((double)super.field8645 + ((double)var59.field3278 - var73) * (double)arg1);
                              super.field8630 = (int)((double)super.field8630 + ((double)var60.field10520 - var73) * (double)arg1);
                              super.field8634 = (int)((double)super.field8634 + ((double)var59.field3280 - var73) * (double)arg1);
                           }
                        } else {
                           double var75 = var61 / var69 * (double)var60.field10518;
                           double var77 = var63 / var69 * (double)var60.field10518;
                           double var79 = var65 / var69 * (double)var60.field10518;
                           if (var60.field10522 == 0) {
                              var13 += (double)arg1 * var75;
                              var15 += (double)arg1 * var77;
                              var17 += (double)arg1 * var79;
                              var19 = true;
                           } else {
                              super.field8645 = (int)((double)super.field8645 + (double)arg1 * var75);
                              super.field8630 = (int)((double)super.field8630 + (double)arg1 * var77);
                              super.field8634 = (int)((double)super.field8634 + (double)arg1 * var79);
                           }
                        }

                        var59 = (class217)class69.field1241.method2928((byte)-82);
                     }
                  }
               }
            }
         }

         if (var8.field7618 != null) {
            if (var8.field7648 == null) {
               var8.field7648 = new int[var8.field7618.length];

               for(int var81 = 0; var81 < var8.field7618.length; ++var81) {
                  class640.method4689(var8.field7618[var81], -128);
                  var8.field7648[var81] = ((class459)class445.field6489.method1572((long)var8.field7618[var81], -16289)).field6727;
               }
            }

            for(int var82 = 0; var82 < var8.field7648.length; ++var82) {
               class732 var83 = class322.field4634[var8.field7648[var82]];
               if (var83.field10522 == 0) {
                  var13 += (double)(var83.field10521 * arg1);
                  var15 += (double)(var83.field10520 * arg1);
                  var17 += (double)(var83.field10528 * arg1);
                  var19 = true;
               } else {
                  super.field8645 += var83.field10521 * arg1;
                  super.field8630 += var83.field10520 * arg1;
                  super.field8634 += var83.field10528 * arg1;
               }
            }
         }

         if (var19) {
            while(true) {
               if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                  this.field1588 = (short)((int)var13);
                  this.field1592 = (short)((int)var15);
                  this.field1595 = (short)((int)var17);
                  break;
               }

               var13 /= 2.0D;
               var15 /= 2.0D;
               var17 /= 2.0D;
               this.field1591 <<= 1;
            }
         }

         super.field8645 = (int)((long)super.field8645 + ((long)(this.field1591 << 2) * (long)this.field1588 >> 23) * (long)arg1);
         super.field8630 = (int)((long)super.field8630 + ((long)(this.field1591 << 2) * (long)this.field1592 >> 23) * (long)arg1);
         super.field8634 = (int)((long)super.field8634 + ((long)(this.field1591 << 2) * (long)this.field1595 >> 23) * (long)arg1);
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(Lha;J)V"
   )
   public final void method955(class65 arg0, long arg1) {
      int var4 = super.field8645 >> class76.field1336 + 12;
      int var5 = super.field8634 >> class76.field1336 + 12;
      int var6 = super.field8630 >> 12;
      if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class479.field6989 && var5 >= 0 && var5 < class357.field5100) {
         class42 var7 = this.field1587.field2854;
         class522 var8 = this.field1587.field2857;
         class293[] var9 = class269.field3810;
         int var10 = var7.field978;
         class600 var11 = class90.field1473[var7.field978][var4][var5];
         if (var11 != null) {
            var10 = var11.field8664;
         }

         int var12 = var9[var10].method2289(var4, var5, (byte)125);
         int var13;
         if (var10 < class323.field4655 - 1) {
            var13 = var9[var10 + 1].method2289(var4, var5, (byte)110);
         } else {
            var13 = var12 - (8 << class76.field1336);
         }

         if (var8.field7614) {
            if (var8.field7599 == -1 && var6 > var12) {
               this.method956();
               return;
            }

            if (var8.field7599 >= 0 && var6 > var9[var8.field7599].method2289(var4, var5, (byte)125)) {
               this.method956();
               return;
            }

            if (var8.field7643 == -1 && var6 < var13) {
               this.method956();
               return;
            }

            if (var8.field7643 >= 0 && var6 < var9[var8.field7643 + 1].method2289(var4, var5, (byte)127)) {
               this.method956();
               return;
            }
         }

         int var14;
         for(var14 = class323.field4655 - 1; var14 > 0 && var6 > var9[var14].method2289(var4, var5, (byte)115); --var14) {
         }

         if (var8.field7645 && var14 == 0 && var6 > var9[0].method2289(var4, var5, (byte)114)) {
            this.method956();
         } else if (class323.field4655 - 1 == var14 && var9[var14].method2289(var4, var5, (byte)116) - var6 > 8 << class76.field1336) {
            this.method956();
         } else {
            class600 var15 = class90.field1473[var14][var4][var5];
            if (var15 == null) {
               if (var14 == 0 || class90.field1473[0][var4][var5] == null) {
                  var15 = class90.field1473[0][var4][var5] = new class600(0);
               }

               boolean var16 = class90.field1473[0][var4][var5].field8656 != null;
               if (var14 == 3 && var16) {
                  this.method956();
                  return;
               }

               for(int var17 = 1; var17 <= var14; ++var17) {
                  if (class90.field1473[var17][var4][var5] == null) {
                     var15 = class90.field1473[var17][var4][var5] = new class600(var17);
                     if (var16) {
                        ++var15.field8664;
                     }
                  }
               }
            }

            if (var8.field7637) {
               int var18 = super.field8645 >> 12;
               int var19 = super.field8634 >> 12;
               if (var15.field8659 != null) {
                  class744 var20 = var15.field8659.method586(arg0, 0);
                  if (var20 != null && var20.method5399(var6, -7601, var19, var18)) {
                     this.method956();
                     return;
                  }
               }

               if (var15.field8661 != null) {
                  class744 var21 = var15.field8661.method586(arg0, 0);
                  if (var21 != null && var21.method5399(var6, -7601, var19, var18)) {
                     this.method956();
                     return;
                  }
               }

               if (var15.field8654 != null) {
                  class744 var22 = var15.field8654.method586(arg0, 0);
                  if (var22 != null && var22.method5399(var6, -7601, var19, var18)) {
                     this.method956();
                     return;
                  }
               }

               for(class533 var23 = var15.field8653; var23 != null; var23 = var23.field7763) {
                  class744 var24 = var23.field7766.method586(arg0, 0);
                  if (var24 != null && var24.method5399(var6, -7601, var19, var18)) {
                     this.method956();
                     return;
                  }
               }
            }

            var7.field976.field10342.method3165(this, -1);
         }
      } else {
         this.method956();
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "b",
      descriptor = "()V"
   )
   public final void method956() {
      this.field1587.field2854.field967[this.field1590] = null;
      class662.field9622[class572.field8270] = this;
      class572.field8270 = class572.field8270 + 1 & 1023;
      this.method1995((byte)35);
      this.method3241(2);
   }

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "()V"
   )
   private final void method957() {
      int var1 = this.field1587.field2854.field969;
      if (this.field1587.field2854.field967[var1] != null) {
         this.field1587.field2854.field967[var1].method956();
      }

      this.field1587.field2854.field967[var1] = this;
      this.field1590 = (short)this.field1587.field2854.field969;
      this.field1587.field2854.field969 = var1 + 1 & 8191;
      this.field1587.field2848.method1398(true, this);
   }

   @OriginalMember(
      owner = "client!aja",
      name = "<init>",
      descriptor = "(Lcw;IIIIIIIIIIIZZ)V"
   )
   public class99(class190 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
      this.field1587 = arg0;
      super.field8645 = arg1 << 12;
      super.field8630 = arg2 << 12;
      super.field8634 = arg3 << 12;
      super.field8641 = arg9;
      this.field1593 = this.field1589 = (short)arg8;
      super.field8638 = arg10;
      super.field8644 = arg11;
      super.field8632 = arg13;
      this.field1588 = (short)arg4;
      this.field1592 = (short)arg5;
      this.field1595 = (short)arg6;
      this.field1591 = arg7;
      super.field8642 = this.field1587.field2858.field4460;
      this.method957();
   }

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(Lcw;IIIIIIIIIIIZZ)V"
   )
   public final void method958(class190 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
      this.field1587 = arg0;
      super.field8645 = arg1 << 12;
      super.field8630 = arg2 << 12;
      super.field8634 = arg3 << 12;
      super.field8641 = arg9;
      this.field1593 = this.field1589 = (short)arg8;
      super.field8638 = arg10;
      super.field8644 = arg11;
      super.field8632 = arg13;
      this.field1588 = (short)arg4;
      this.field1592 = (short)arg5;
      this.field1595 = (short)arg6;
      this.field1591 = arg7;
      super.field8642 = this.field1587.field2858.field4460;
      this.method957();
   }
}
