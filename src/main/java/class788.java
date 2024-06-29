import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class788 extends class74 {
   @OriginalMember(
      owner = "client!eia",
      name = "E",
      descriptor = "Lol;"
   )
   public class435 field11494;
   @OriginalMember(
      owner = "client!eia",
      name = "G",
      descriptor = "S"
   )
   private short field11490;
   @OriginalMember(
      owner = "client!eia",
      name = "B",
      descriptor = "S"
   )
   private short field11489;
   @OriginalMember(
      owner = "client!eia",
      name = "F",
      descriptor = "S"
   )
   private short field11491;
   @OriginalMember(
      owner = "client!eia",
      name = "H",
      descriptor = "S"
   )
   private short field11495;
   @OriginalMember(
      owner = "client!eia",
      name = "D",
      descriptor = "S"
   )
   private short field11496;
   @OriginalMember(
      owner = "client!eia",
      name = "J",
      descriptor = "I"
   )
   private int field11492;
   @OriginalMember(
      owner = "client!eia",
      name = "I",
      descriptor = "I"
   )
   private int field11497;
   @OriginalMember(
      owner = "client!eia",
      name = "C",
      descriptor = "S"
   )
   private short field11493;

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(Lol;IIIIIIIIIIIZZ)V"
   )
   public final void method5673(class435 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
      this.field11494 = arg0;
      super.field974 = arg1 << 12;
      super.field976 = arg2 << 12;
      super.field977 = arg3 << 12;
      super.field980 = arg9;
      this.field11489 = this.field11490 = (short)arg8;
      super.field982 = arg10;
      super.field975 = arg11;
      super.field981 = arg13;
      this.field11491 = (short)arg4;
      this.field11495 = (short)arg5;
      this.field11496 = (short)arg6;
      this.field11492 = arg7;
      super.field983 = this.field11494.field5929.field5792;
      this.method5674();
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "()V"
   )
   private final void method5674() {
      int var1 = this.field11494.field5926.field9112;
      if (this.field11494.field5926.field9110[var1] != null) {
         this.field11494.field5926.field9110[var1].method5675();
      }

      this.field11494.field5926.field9110[var1] = this;
      this.field11493 = (short)this.field11494.field5926.field9112;
      this.field11494.field5926.field9112 = var1 + 1 & 8191;
      this.field11494.field5918.method4637(this, (byte)99);
   }

   @OriginalMember(
      owner = "client!eia",
      name = "b",
      descriptor = "()V"
   )
   public final void method5675() {
      this.field11494.field5926.field9110[this.field11493] = null;
      class275.field3514[class669.field9914] = this;
      class669.field9914 = class669.field9914 + 1 & 1023;
      this.method797((byte)79);
      this.method3387(122);
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(JI)V"
   )
   public final void method5676(long arg0, int arg1) {
      this.field11490 = (short)(this.field11490 - arg1);
      if (this.field11490 <= 0) {
         this.method5675();
      } else {
         int var4 = super.field974 >> 12;
         int var5 = super.field976 >> 12;
         int var6 = super.field977 >> 12;
         class619 var7 = this.field11494.field5926;
         class48 var8 = this.field11494.field5917;
         if (var8.field652 != 0) {
            if (this.field11489 - this.field11490 <= var8.field602) {
               int var9 = var8.field622 * arg1 + (this.field11497 >> 16 & 255) + (super.field980 >> 8 & 65280);
               int var10 = var8.field625 * arg1 + (this.field11497 >> 8 & 255) + (super.field980 & 65280);
               int var11 = var8.field624 * arg1 + (super.field980 << 8 & 65280) + (this.field11497 & 255);
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

               super.field980 &= -16777216;
               super.field980 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
               this.field11497 &= -16777216;
               this.field11497 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
            }

            if (this.field11489 - this.field11490 <= var8.field637) {
               int var12 = var8.field603 * arg1 + (this.field11497 >> 24 & 255) + (super.field980 >> 16 & 65280);
               if (var12 < 0) {
                  var12 = 0;
               } else if (var12 > 65535) {
                  var12 = 65535;
               }

               super.field980 &= 16777215;
               super.field980 |= (var12 & 65280) << 16;
               this.field11497 &= 16777215;
               this.field11497 |= (var12 & 255) << 24;
            }
         }

         if (var8.field614 != -1 && this.field11489 - this.field11490 <= var8.field632) {
            this.field11492 += var8.field636 * arg1;
         }

         if (var8.field626 != -1 && this.field11489 - this.field11490 <= var8.field655) {
            super.field982 += var8.field668 * arg1;
         }

         double var13 = (double)this.field11491;
         double var15 = (double)this.field11495;
         double var17 = (double)this.field11496;
         boolean var19 = false;
         if (var8.field664 == 1) {
            int var20 = var4 - this.field11494.field5928.field11341;
            int var21 = var5 - this.field11494.field5928.field11333;
            int var22 = var6 - this.field11494.field5928.field11336;
            int var23 = (int)Math.sqrt((double)(var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
            long var24 = (long)(var8.field657 * var23 * arg1);
            this.field11492 = (int)((long)this.field11492 - ((long)this.field11492 * var24 >> 18));
         } else if (var8.field664 == 2) {
            int var26 = var4 - this.field11494.field5928.field11341;
            int var27 = var5 - this.field11494.field5928.field11333;
            int var28 = var6 - this.field11494.field5928.field11336;
            int var29 = var28 * var28 + var26 * var26 + var27 * var27;
            long var30 = (long)(var8.field657 * var29 * arg1);
            this.field11492 = (int)((long)this.field11492 - ((long)this.field11492 * var30 >> 28));
         }

         if (var8.field635 != null) {
            class673 var32 = var7.field9115.field527;

            for(class673 var33 = var32.field9972; var32 != var33; var33 = var33.field9972) {
               class686 var34 = (class686)var33;
               class289 var35 = var34.field10107;
               if (var35.field3989 != 1) {
                  boolean var36 = false;

                  for(int var37 = 0; var37 < var8.field635.length; ++var37) {
                     if (var8.field635[var37] == var35.field4001) {
                        var36 = true;
                        break;
                     }
                  }

                  if (var36) {
                     double var38 = (double)(var4 - var34.field10110);
                     double var40 = (double)(var5 - var34.field10111);
                     double var42 = (double)(var6 - var34.field10109);
                     double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                     if (!(var44 > (double)var35.field3996)) {
                        double var46 = Math.sqrt(var44);
                        if (var46 == 0.0D) {
                           var46 = 1.0D;
                        }

                        double var48 = ((double)var34.field10113 * var42 + (double)var34.field10102 * var38 + (double)var35.field4002 * var40) * 65535.0D / ((double)var35.field3994 * var46);
                        if (!(var48 < (double)var35.field4003)) {
                           double var50 = 0.0D;
                           if (var35.field3992 == 1) {
                              var50 = var46 / 16.0D * (double)var35.field4006;
                           } else if (var35.field3992 == 2) {
                              var50 = var46 / 16.0D * (var46 / 16.0D) * (double)var35.field4006;
                           }

                           if (var35.field4000 == 0) {
                              if (var35.field4005 == 0) {
                                 var13 += ((double)var34.field10102 - var50) * (double)arg1;
                                 var15 += ((double)var35.field4002 - var50) * (double)arg1;
                                 var17 += ((double)var34.field10113 - var50) * (double)arg1;
                                 var19 = true;
                              } else {
                                 super.field974 = (int)((double)super.field974 + ((double)var34.field10102 - var50) * (double)arg1);
                                 super.field976 = (int)((double)super.field976 + ((double)var35.field4002 - var50) * (double)arg1);
                                 super.field977 = (int)((double)super.field977 + ((double)var34.field10113 - var50) * (double)arg1);
                              }
                           } else {
                              double var52 = var38 / var46 * (double)var35.field3994;
                              double var54 = var40 / var46 * (double)var35.field3994;
                              double var56 = var42 / var46 * (double)var35.field3994;
                              if (var35.field4005 == 0) {
                                 var13 += (double)arg1 * var52;
                                 var15 += (double)arg1 * var54;
                                 var17 += (double)arg1 * var56;
                                 var19 = true;
                              } else {
                                 super.field974 = (int)((double)super.field974 + (double)arg1 * var52);
                                 super.field976 = (int)((double)super.field976 + (double)arg1 * var54);
                                 super.field977 = (int)((double)super.field977 + (double)arg1 * var56);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if (var8.field616 != null) {
            for(int var58 = 0; var58 < var8.field616.length; ++var58) {
               class686 var59 = (class686)class705.field10316.method4386((byte)-95, (long)var8.field616[var58]);

               while(var59 != null) {
                  class289 var60 = var59.field10107;
                  double var61 = (double)(var4 - var59.field10110);
                  double var63 = (double)(var5 - var59.field10111);
                  double var65 = (double)(var6 - var59.field10109);
                  double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                  if (var67 > (double)var60.field3996) {
                     var59 = (class686)class705.field10316.method4383((byte)-28);
                  } else {
                     double var69 = Math.sqrt(var67);
                     if (var69 == 0.0D) {
                        var69 = 1.0D;
                     }

                     double var71 = ((double)var59.field10113 * var65 + (double)var59.field10102 * var61 + (double)var60.field4002 * var63) * 65535.0D / ((double)var60.field3994 * var69);
                     if (var71 < (double)var60.field4003) {
                        var59 = (class686)class705.field10316.method4383((byte)-68);
                     } else {
                        double var73 = 0.0D;
                        if (var60.field3992 == 1) {
                           var73 = var69 / 16.0D * (double)var60.field4006;
                        } else if (var60.field3992 == 2) {
                           var73 = var69 / 16.0D * (var69 / 16.0D) * (double)var60.field4006;
                        }

                        if (var60.field4000 == 0) {
                           if (var60.field4005 == 0) {
                              var13 += ((double)var59.field10102 - var73) * (double)arg1;
                              var15 += ((double)var60.field4002 - var73) * (double)arg1;
                              var17 += ((double)var59.field10113 - var73) * (double)arg1;
                              var19 = true;
                           } else {
                              super.field974 = (int)((double)super.field974 + ((double)var59.field10102 - var73) * (double)arg1);
                              super.field976 = (int)((double)super.field976 + ((double)var60.field4002 - var73) * (double)arg1);
                              super.field977 = (int)((double)super.field977 + ((double)var59.field10113 - var73) * (double)arg1);
                           }
                        } else {
                           double var75 = var61 / var69 * (double)var60.field3994;
                           double var77 = var63 / var69 * (double)var60.field3994;
                           double var79 = var65 / var69 * (double)var60.field3994;
                           if (var60.field4005 == 0) {
                              var13 += (double)arg1 * var75;
                              var15 += (double)arg1 * var77;
                              var17 += (double)arg1 * var79;
                              var19 = true;
                           } else {
                              super.field974 = (int)((double)super.field974 + (double)arg1 * var75);
                              super.field976 = (int)((double)super.field976 + (double)arg1 * var77);
                              super.field977 = (int)((double)super.field977 + (double)arg1 * var79);
                           }
                        }

                        var59 = (class686)class705.field10316.method4383((byte)-31);
                     }
                  }
               }
            }
         }

         if (var8.field607 != null) {
            if (var8.field666 == null) {
               var8.field666 = new int[var8.field607.length];

               for(int var81 = 0; var81 < var8.field607.length; ++var81) {
                  class588.method4380((byte)62, var8.field607[var81]);
                  var8.field666[var81] = ((class278)class763.field11177.method1818(-1, (long)var8.field607[var81])).field3546;
               }
            }

            for(int var82 = 0; var82 < var8.field666.length; ++var82) {
               class289 var83 = class244.field3083[var8.field666[var82]];
               if (var83.field4005 == 0) {
                  var13 += (double)(var83.field3995 * arg1);
                  var15 += (double)(var83.field4002 * arg1);
                  var17 += (double)(var83.field4007 * arg1);
                  var19 = true;
               } else {
                  super.field974 += var83.field3995 * arg1;
                  super.field976 += var83.field4002 * arg1;
                  super.field977 += var83.field4007 * arg1;
               }
            }
         }

         if (var19) {
            while(true) {
               if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                  this.field11491 = (short)((int)var13);
                  this.field11495 = (short)((int)var15);
                  this.field11496 = (short)((int)var17);
                  break;
               }

               var13 /= 2.0D;
               var15 /= 2.0D;
               var17 /= 2.0D;
               this.field11492 <<= 1;
            }
         }

         super.field974 = (int)((long)super.field974 + ((long)(this.field11492 << 2) * (long)this.field11491 >> 23) * (long)arg1);
         super.field976 = (int)((long)super.field976 + ((long)(this.field11492 << 2) * (long)this.field11495 >> 23) * (long)arg1);
         super.field977 = (int)((long)super.field977 + ((long)(this.field11492 << 2) * (long)this.field11496 >> 23) * (long)arg1);
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(Lha;J)V"
   )
   public final void method5677(class479 arg0, long arg1) {
      int var4 = super.field974 >> class783.field11447 + 12;
      int var5 = super.field977 >> class783.field11447 + 12;
      int var6 = super.field976 >> 12;
      if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class137.field1743 && var5 >= 0 && var5 < class181.field2297) {
         class619 var7 = this.field11494.field5926;
         class48 var8 = this.field11494.field5917;
         class423[] var9 = class659.field9815;
         int var10 = var7.field9121;
         class731 var11 = class548.field8080[var7.field9121][var4][var5];
         if (var11 != null) {
            var10 = var11.field10647;
         }

         int var12 = var9[var10].method3284(-1, var4, var5);
         int var13;
         if (var10 < class174.field2251 - 1) {
            var13 = var9[var10 + 1].method3284(-1, var4, var5);
         } else {
            var13 = var12 - (8 << class783.field11447);
         }

         if (var8.field661) {
            if (var8.field612 == -1 && var6 > var12) {
               this.method5675();
               return;
            }

            if (var8.field612 >= 0 && var6 > var9[var8.field612].method3284(-1, var4, var5)) {
               this.method5675();
               return;
            }

            if (var8.field656 == -1 && var6 < var13) {
               this.method5675();
               return;
            }

            if (var8.field656 >= 0 && var6 < var9[var8.field656 + 1].method3284(-1, var4, var5)) {
               this.method5675();
               return;
            }
         }

         int var14;
         for(var14 = class174.field2251 - 1; var14 > 0 && var6 > var9[var14].method3284(-1, var4, var5); --var14) {
         }

         if (var8.field673 && var14 == 0 && var6 > var9[0].method3284(-1, var4, var5)) {
            this.method5675();
         } else if (class174.field2251 - 1 == var14 && var9[var14].method3284(-1, var4, var5) - var6 > 8 << class783.field11447) {
            this.method5675();
         } else {
            class731 var15 = class548.field8080[var14][var4][var5];
            if (var15 == null) {
               if (var14 == 0 || class548.field8080[0][var4][var5] == null) {
                  var15 = class548.field8080[0][var4][var5] = new class731(0);
               }

               boolean var16 = class548.field8080[0][var4][var5].field10646 != null;
               if (var14 == 3 && var16) {
                  this.method5675();
                  return;
               }

               for(int var17 = 1; var17 <= var14; ++var17) {
                  if (class548.field8080[var17][var4][var5] == null) {
                     var15 = class548.field8080[var17][var4][var5] = new class731(var17);
                     if (var16) {
                        ++var15.field10647;
                     }
                  }
               }
            }

            if (var8.field647) {
               int var18 = super.field974 >> 12;
               int var19 = super.field977 >> 12;
               if (var15.field10656 != null) {
                  class484 var20 = var15.field10656.method186((byte)120, arg0);
                  if (var20 != null && var20.method3674((byte)25, var6, var18, var19)) {
                     this.method5675();
                     return;
                  }
               }

               if (var15.field10642 != null) {
                  class484 var21 = var15.field10642.method186((byte)-8, arg0);
                  if (var21 != null && var21.method3674((byte)87, var6, var18, var19)) {
                     this.method5675();
                     return;
                  }
               }

               if (var15.field10649 != null) {
                  class484 var22 = var15.field10649.method186((byte)111, arg0);
                  if (var22 != null && var22.method3674((byte)86, var6, var18, var19)) {
                     this.method5675();
                     return;
                  }
               }

               for(class131 var23 = var15.field10654; var23 != null; var23 = var23.field1670) {
                  class484 var24 = var23.field1676.method186((byte)-88, arg0);
                  if (var24 != null && var24.method3674((byte)38, var6, var18, var19)) {
                     this.method5675();
                     return;
                  }
               }
            }

            var7.field9119.field8138.method678(this, (byte)108);
         }
      } else {
         this.method5675();
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "<init>",
      descriptor = "(Lol;IIIIIIIIIIIZZ)V"
   )
   public class788(class435 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
      this.field11494 = arg0;
      super.field974 = arg1 << 12;
      super.field976 = arg2 << 12;
      super.field977 = arg3 << 12;
      super.field980 = arg9;
      this.field11489 = this.field11490 = (short)arg8;
      super.field982 = arg10;
      super.field975 = arg11;
      super.field981 = arg13;
      this.field11491 = (short)arg4;
      this.field11495 = (short)arg5;
      this.field11496 = (short)arg6;
      this.field11492 = arg7;
      super.field983 = this.field11494.field5929.field5792;
      this.method5674();
   }
}
