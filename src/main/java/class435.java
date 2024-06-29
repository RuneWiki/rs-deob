import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class435 extends class82 {
   @OriginalMember(
      owner = "client!ol",
      name = "C",
      descriptor = "Z"
   )
   public boolean field5924 = false;
   @OriginalMember(
      owner = "client!ol",
      name = "l",
      descriptor = "I"
   )
   private int field5932 = 0;
   @OriginalMember(
      owner = "client!ol",
      name = "h",
      descriptor = "Lqda;"
   )
   public class778 field5928 = new class778();
   @OriginalMember(
      owner = "client!ol",
      name = "A",
      descriptor = "Lqda;"
   )
   private class778 field5933 = new class778();
   @OriginalMember(
      owner = "client!ol",
      name = "g",
      descriptor = "Z"
   )
   private boolean field5941 = false;
   @OriginalMember(
      owner = "client!ol",
      name = "y",
      descriptor = "Lmha;"
   )
   public class426 field5929;
   @OriginalMember(
      owner = "client!ol",
      name = "u",
      descriptor = "Luj;"
   )
   public class619 field5926;
   @OriginalMember(
      owner = "client!ol",
      name = "s",
      descriptor = "J"
   )
   private long field5930;
   @OriginalMember(
      owner = "client!ol",
      name = "n",
      descriptor = "Lgv;"
   )
   public class48 field5917;
   @OriginalMember(
      owner = "client!ol",
      name = "j",
      descriptor = "Lvia;"
   )
   public class627 field5918;
   @OriginalMember(
      owner = "client!ol",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5942 = new String[]{method3367(method3366("xs\u000f\u0019:")), method3367(method3366("yjM1")), method3367(method3366("l1\u000fso")), method3367(method3366("xs\u000f\u001c:")), method3367(method3366("xs\u000f\u001e:")), method3367(method3366("xs\u000f\u0018:")), method3367(method3366("xs\u000f\u001b:")), method3367(method3366("xs\u000f\u001a:")), method3367(method3366("xs\u000fa{yvUc:")), method3367(method3366("xs\u000f\u001f:"))};
   @OriginalMember(
      owner = "client!ol",
      name = "t",
      descriptor = "[I"
   )
   public static int[] field5923 = new int[64];
   @OriginalMember(
      owner = "client!ol",
      name = "v",
      descriptor = "I"
   )
   public static int field5916;
   @OriginalMember(
      owner = "client!ol",
      name = "x",
      descriptor = "I"
   )
   public static int field5919;
   @OriginalMember(
      owner = "client!ol",
      name = "q",
      descriptor = "I"
   )
   public static int field5920;
   @OriginalMember(
      owner = "client!ol",
      name = "w",
      descriptor = "I"
   )
   public static int field5921;
   @OriginalMember(
      owner = "client!ol",
      name = "B",
      descriptor = "I"
   )
   public static int field5922;
   @OriginalMember(
      owner = "client!ol",
      name = "o",
      descriptor = "I"
   )
   public static int field5925;
   @OriginalMember(
      owner = "client!ol",
      name = "z",
      descriptor = "I"
   )
   public static int field5927;
   @OriginalMember(
      owner = "client!ol",
      name = "p",
      descriptor = "I"
   )
   public int field5931;
   @OriginalMember(
      owner = "client!ol",
      name = "k",
      descriptor = "I"
   )
   private int field5934;
   @OriginalMember(
      owner = "client!ol",
      name = "D",
      descriptor = "I"
   )
   private int field5935;
   @OriginalMember(
      owner = "client!ol",
      name = "m",
      descriptor = "I"
   )
   private int field5936;
   @OriginalMember(
      owner = "client!ol",
      name = "r",
      descriptor = "I"
   )
   private int field5937;
   @OriginalMember(
      owner = "client!ol",
      name = "F",
      descriptor = "I"
   )
   private int field5938;
   @OriginalMember(
      owner = "client!ol",
      name = "E",
      descriptor = "I"
   )
   private int field5939;
   @OriginalMember(
      owner = "client!ol",
      name = "i",
      descriptor = "I"
   )
   private int field5940;

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(ILoe;Loe;)V"
   )
   public static final void method3359(int arg0, class15 arg1, class15 arg2) {
      try {
         ++field5916;
         if (arg1.field274 != null) {
            arg1.method125(13582);
         }

         arg1.field274 = arg2.field274;
         arg1.field272 = arg2;
         int var3 = -123 % ((54 - arg0) / 47);
         arg1.field274.field272 = arg1;
         arg1.field272.field274 = arg1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5942[0] + arg0 + ',' + (arg1 != null ? field5942[2] : field5942[1]) + ',' + (arg2 != null ? field5942[2] : field5942[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3360(int arg0) {
      try {
         if (arg0 != 2) {
            field5925 = 21;
         }

         field5923 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5942[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(I[Loca;Z)V"
   )
   public static final void method3361(int param0, class642[] param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3362(byte arg0) {
      try {
         class757.field11093.method5438(true, class757.field11093.field10983, 1);
         ++field5921;
         class757.field11093.method5438(true, class757.field11093.field10978, 1);
         class757.field11093.method5438(true, class757.field11093.field11004, 2);
         class757.field11093.method5438(true, class757.field11093.field11018, 2);
         class757.field11093.method5438(true, class757.field11093.field11011, 1);
         class757.field11093.method5438(true, class757.field11093.field10967, 1);
         class757.field11093.method5438(true, class757.field11093.field10987, 1);
         class757.field11093.method5438(true, class757.field11093.field10998, 1);
         class757.field11093.method5438(true, class757.field11093.field11015, 1);
         class757.field11093.method5438(true, class757.field11093.field10973, 1);
         class757.field11093.method5438(true, class757.field11093.field11003, 2);
         if (arg0 <= 79) {
            method3360(-119);
         }

         class757.field11093.method5438(true, class757.field11093.field11016, 1);
         class757.field11093.method5438(true, class757.field11093.field11005, 2);
         class757.field11093.method5438(true, class757.field11093.field10999, 1);
         class757.field11093.method5438(true, class757.field11093.field11019, 0);
         class757.field11093.method5438(true, class757.field11093.field10969, 0);
         class757.field11093.method5438(true, class757.field11093.field10972, 2);
         class757.field11093.method5438(true, class757.field11093.field11009, 0);
         class757.field11093.method5438(true, class757.field11093.field11000, 0);
         class315.method2498((byte)44);
         class757.field11093.method5438(true, class757.field11093.field11010, 0);
         class757.field11093.method5438(true, class757.field11093.field10966, 4);
         class281.method2266(true);
         class274.method2167(-1662);
         class187.field2382 = true;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5942[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(ILha;JBZ)V"
   )
   public final void method3363(int arg0, class479 arg1, long arg2, byte arg3, boolean arg4) {
      boolean var7 = client.field1481;

      try {
         label229: {
            ++field5922;
            if (this.field5924) {
               arg4 = false;
               if (!var7) {
                  break label229;
               }
            }

            if (~class323.field4426 > ~this.field5917.field605) {
               arg4 = false;
               if (!var7) {
                  break label229;
               }
            }

            if (class543.field7922 <= class233.field2895[class323.field4426]) {
               if (this.field5941) {
                  arg4 = false;
                  if (!var7) {
                     break label229;
                  }
               }

               if (this.field5917.field643 == -1) {
                  break label229;
               }

               int var8;
               label210: {
                  var8 = (int)(arg2 - this.field5930);
                  if (!this.field5917.field617 && ~var8 < ~this.field5917.field643) {
                     arg4 = false;
                     if (!var7) {
                        break label210;
                     }
                  }

                  var8 %= this.field5917.field643;
               }

               if (!this.field5917.field629 && this.field5917.field648 > var8) {
                  arg4 = false;
               }

               if (!this.field5917.field629 || this.field5917.field648 > var8) {
                  break label229;
               }

               arg4 = false;
               if (!var7) {
                  break label229;
               }
            }

            arg4 = false;
         }

         if (arg4) {
            ++class9.field167;
            int var9 = (this.field5928.field11353 + this.field5928.field11344 + this.field5928.field11348) / 3;
            int var10 = (this.field5928.field11352 + this.field5928.field11347 + this.field5928.field11335) / 3;
            int var11 = (this.field5928.field11350 - -this.field5928.field11345 - -this.field5928.field11343) / 3;
            if (~this.field5928.field11341 != ~var9 || ~this.field5928.field11333 != ~var10 || this.field5928.field11336 != var11) {
               this.field5928.field11336 = var11;
               this.field5928.field11333 = var10;
               this.field5928.field11341 = var9;
               int var12 = this.field5928.field11344 - this.field5928.field11348;
               int var13 = -this.field5928.field11352 + this.field5928.field11335;
               int var14 = -this.field5928.field11350 + this.field5928.field11345;
               int var15 = this.field5928.field11353 - this.field5928.field11348;
               int var16 = -this.field5928.field11352 + this.field5928.field11347;
               int var17 = -this.field5928.field11350 + this.field5928.field11343;
               this.field5940 = var13 * var17 - var14 * var16;
               this.field5938 = var14 * var15 + -(var12 * var17);
               this.field5939 = var12 * var16 - var13 * var15;
               if (var7) {
                  this.field5938 >>= 1;
                  this.field5939 >>= 1;
                  this.field5940 >>= 1;
               }

               label191:
               while(true) {
                  while(true) {
                     if (this.field5940 <= 32767) {
                        if (var7) {
                           this.field5940 >>= 1;
                           continue;
                        }

                        if (~this.field5938 >= -32768 && this.field5939 <= 32767 && ~this.field5940 <= 32766 && this.field5938 >= -32767 && this.field5939 >= -32767) {
                           int var18 = (int)Math.sqrt((double)(this.field5940 * this.field5940 + this.field5939 * this.field5939 + this.field5938 * this.field5938));
                           if (~var18 >= -1) {
                              var18 = 1;
                           }

                           this.field5939 = this.field5939 * 32767 / var18;
                           this.field5938 = this.field5938 * 32767 / var18;
                           this.field5940 = this.field5940 * 32767 / var18;
                           if (this.field5917.field631 > 0 || this.field5917.field663 > 0) {
                              int var19 = (int)(2607.5945876176133D * Math.atan2((double)this.field5939, (double)this.field5940));
                              int var20 = (int)(2607.5945876176133D * Math.atan2((double)this.field5938, Math.sqrt((double)(this.field5940 * this.field5940 + this.field5939 * this.field5939))));
                              this.field5936 = -this.field5917.field667 + this.field5917.field631;
                              this.field5934 = -this.field5917.field644 + this.field5917.field663;
                              this.field5935 = var19 - -this.field5917.field667 - (this.field5936 >> 1);
                              this.field5937 = var20 - -this.field5917.field644 - (this.field5934 >> 1);
                           }
                           break label191;
                        }
                     }

                     this.field5938 >>= 1;
                     this.field5939 >>= 1;
                     this.field5940 >>= 1;
                  }
               }
            }

            this.field5932 += (int)(((double)this.field5917.field670 + (double)(-this.field5917.field670 + this.field5917.field618) * Math.random()) * (double)arg0);
            if (~this.field5932 < -64) {
               int var21 = this.field5932 >> 6;
               this.field5932 &= 63;
               int var22 = 0;
               if (var7 || var22 < var21) {
                  do {
                     int var32;
                     int var33;
                     int var34;
                     label241: {
                        if (this.field5917.field631 > 0 || this.field5917.field663 > 0) {
                           int var23 = this.field5935 + (int)(Math.random() * (double)this.field5936);
                           int var24 = var23 & 16383;
                           int var25 = class746.field10907[var24];
                           int var26 = class746.field10897[var24];
                           int var27 = (int)((double)this.field5934 * Math.random()) + this.field5937;
                           int var28 = var27 & 8191;
                           int var29 = class746.field10907[var28];
                           int var30 = class746.field10897[var28];
                           byte var31 = 13;
                           var32 = var26 * var29 >> var31;
                           var33 = (var30 << 1) * -1;
                           var34 = var25 * var29 >> var31;
                           if (!var7) {
                              break label241;
                           }
                        }

                        var34 = this.field5939;
                        var32 = this.field5940;
                        var33 = this.field5938;
                     }

                     float var35 = (float)Math.random();
                     float var36 = (float)Math.random();
                     if (var35 + var36 > 1.0F) {
                        var36 = -var36 + 1.0F;
                        var35 = 1.0F - var35;
                     }

                     int var47;
                     int var48;
                     int var49;
                     int var50;
                     int var51;
                     int var52;
                     int var55;
                     label149: {
                        float var37 = -var35 - var36 + 1.0F;
                        int var38 = (int)((float)this.field5928.field11353 * var37 + (float)this.field5928.field11348 * var35 + (float)this.field5928.field11344 * var36);
                        int var39 = (int)((float)this.field5928.field11347 * var37 + (float)this.field5928.field11352 * var35 + (float)this.field5928.field11335 * var36);
                        int var40 = (int)((float)this.field5928.field11343 * var37 + (float)this.field5928.field11350 * var35 + (float)this.field5928.field11345 * var36);
                        int var41 = (int)((float)this.field5933.field11353 * var37 + (float)this.field5933.field11348 * var35 + (float)this.field5933.field11344 * var36);
                        int var42 = (int)((float)this.field5933.field11347 * var37 + (float)this.field5933.field11352 * var35 + (float)this.field5933.field11335 * var36);
                        int var43 = (int)((float)this.field5933.field11343 * var37 + (float)this.field5933.field11350 * var35 + (float)this.field5933.field11345 * var36);
                        int var44 = var38 - var41;
                        int var45 = -var42 + var39;
                        int var46 = -var43 + var40;
                        var47 = (int)((double)var41 + (double)var44 * Math.random());
                        var48 = (int)(Math.random() * (double)var45 + (double)var42);
                        var49 = (int)((double)var43 + (double)var46 * Math.random());
                        var50 = this.field5917.field645 - -((int)(Math.random() * (double)(-this.field5917.field645 + this.field5917.field609)));
                        var51 = (int)((double)(-this.field5917.field660 + this.field5917.field650) * Math.random()) + this.field5917.field660;
                        var52 = (int)(Math.random() * (double)(this.field5917.field676 - this.field5917.field639)) + this.field5917.field639;
                        if (this.field5917.field621) {
                           double var53 = Math.random();
                           var55 = (int)(Math.random() * (double)this.field5917.field653 + (double)this.field5917.field662) << 24 | (int)((double)this.field5917.field649 * var53 + (double)this.field5917.field671) | (int)((double)this.field5917.field623 * var53 + (double)this.field5917.field627) << 16 | (int)((double)this.field5917.field630 * var53 + (double)this.field5917.field638) << 8;
                           if (!var7) {
                              break label149;
                           }
                        }

                        var55 = (int)((double)this.field5917.field623 * Math.random() + (double)this.field5917.field627) << 16 | (int)((double)this.field5917.field638 + Math.random() * (double)this.field5917.field630) << 8 | (int)((double)this.field5917.field649 * Math.random() + (double)this.field5917.field671) | (int)((double)this.field5917.field653 * Math.random() + (double)this.field5917.field662) << 24;
                     }

                     int var56 = this.field5917.field651;
                     if (!arg1.method465() && !this.field5917.field634) {
                        var56 = -1;
                     }

                     if (~class669.field9914 != ~class234.field2924) {
                        class788 var57 = class275.field3514[class234.field2924];
                        class234.field2924 = 1023 & class234.field2924 + 1;
                        var57.method5673(this, var47, var48, var49, var32, var33, var34, var50, var51, var55, var52, var56, this.field5917.field608, this.field5917.field658);
                        if (!var7) {
                           ++var22;
                           continue;
                        }
                     }

                     new class788(this, var47, var48, var49, var32, var33, var34, var50, var51, var55, var52, var56, this.field5917.field608, this.field5917.field658);
                     ++var22;
                  } while(var22 < var21);
               }
            }
         }

         if (!this.field5928.method5622(false, this.field5933)) {
            class778 var59 = this.field5933;
            this.field5933 = this.field5928;
            this.field5928 = var59;
            this.field5928.field11344 = this.field5929.field5787;
            this.field5928.field11348 = this.field5929.field5800;
            this.field5928.field11343 = this.field5929.field5806;
            this.field5928.field11347 = this.field5929.field5786;
            this.field5928.field11335 = this.field5929.field5796;
            this.field5928.field11350 = this.field5929.field5798;
            this.field5928.field11333 = this.field5933.field11333;
            this.field5928.field11352 = this.field5929.field5804;
            this.field5928.field11353 = this.field5929.field5799;
            this.field5928.field11336 = this.field5933.field11336;
            this.field5928.field11341 = this.field5933.field11341;
            this.field5928.field11345 = this.field5929.field5797;
         }

         this.field5931 = 0;
         class788 var60 = (class788)this.field5918.method4639(-85);
         if (var7) {
            var60.method5676(arg2, arg0);
            ++this.field5931;
            var60 = (class788)this.field5918.method4636((byte)52);
         }

         while(true) {
            while(var60 != null) {
               var60.method5676(arg2, arg0);
               ++this.field5931;
               var60 = (class788)this.field5918.method4636((byte)52);
            }

            class314.field4355 += this.field5931;
            if (!var7) {
               if (arg3 < 89) {
                  this.field5940 = 14;
                  return;
               }

               return;
            }

            var60 = (class788)this.field5918.method4636((byte)52);
         }
      } catch (RuntimeException var62) {
         throw class93.method866(var62, field5942[4] + arg0 + ',' + (arg1 != null ? field5942[2] : field5942[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3364(int arg0) {
      try {
         this.field5928.field11348 = this.field5929.field5800;
         this.field5928.field11343 = this.field5929.field5806;
         this.field5928.field11345 = this.field5929.field5797;
         if (arg0 == -1) {
            this.field5928.field11344 = this.field5929.field5787;
            ++field5919;
            this.field5928.field11352 = this.field5929.field5804;
            this.field5928.field11350 = this.field5929.field5798;
            this.field5928.field11335 = this.field5929.field5796;
            this.field5928.field11347 = this.field5929.field5786;
            this.field5928.field11353 = this.field5929.field5799;
            if (this.field5928.field11348 == this.field5928.field11344 && this.field5928.field11353 == this.field5928.field11344 && ~this.field5928.field11352 == ~this.field5928.field11335 && this.field5928.field11347 == this.field5928.field11335 && ~this.field5928.field11350 == ~this.field5928.field11345 && ~this.field5928.field11345 == ~this.field5928.field11343) {
               this.field5941 = true;
            } else if (this.field5941) {
               this.field5933.field11348 = this.field5928.field11348;
               this.field5941 = false;
               this.field5933.field11352 = this.field5928.field11352;
               this.field5933.field11335 = this.field5928.field11335;
               this.field5933.field11353 = this.field5928.field11353;
               this.field5933.field11344 = this.field5928.field11344;
               this.field5933.field11343 = this.field5928.field11343;
               this.field5933.field11350 = this.field5928.field11350;
               this.field5933.field11347 = this.field5928.field11347;
               this.field5933.field11345 = this.field5928.field11345;
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5942[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(Lha;ZJ)V"
   )
   public final void method3365(class479 arg0, boolean arg1, long arg2) {
      boolean var5 = client.field1481;

      try {
         class788 var6 = (class788)this.field5918.method4639(-90);
         if (var5) {
            var6.method5677(arg0, arg2);
            var6 = (class788)this.field5918.method4636((byte)25);
         }

         while(true) {
            if (var6 == null) {
               ++field5920;
               if (!var5) {
                  if (!arg1) {
                     this.field5930 = 60L;
                     return;
                  }

                  return;
               }
            } else {
               var6.method5677(arg0, arg2);
            }

            var6 = (class788)this.field5918.method4636((byte)25);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field5942[3] + (arg0 != null ? field5942[2] : field5942[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "<init>",
      descriptor = "(Lha;Lmha;Luj;J)V"
   )
   public class435(class479 arg0, class426 arg1, class619 arg2, long arg3) {
      try {
         this.field5929 = arg1;
         this.field5926 = arg2;
         this.field5930 = arg3;
         this.field5917 = this.field5929.method3302(22713);
         if (!arg0.method465() && this.field5917.field620 != -1) {
            this.field5917 = class429.method3318((byte)12, this.field5917.field620);
         }

         this.field5918 = new class627();
         this.field5932 = (int)((double)this.field5932 + Math.random() * 64.0D);
         this.method3364(-1);
         this.field5933.field11344 = this.field5928.field11344;
         this.field5933.field11335 = this.field5928.field11335;
         this.field5933.field11353 = this.field5928.field11353;
         this.field5933.field11350 = this.field5928.field11350;
         this.field5933.field11343 = this.field5928.field11343;
         this.field5933.field11345 = this.field5928.field11345;
         this.field5933.field11347 = this.field5928.field11347;
         this.field5933.field11348 = this.field5928.field11348;
         this.field5933.field11352 = this.field5928.field11352;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field5942[8] + (arg0 != null ? field5942[2] : field5942[1]) + ',' + (arg1 != null ? field5942[2] : field5942[1]) + ',' + (arg2 != null ? field5942[2] : field5942[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3366(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ol",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3367(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
