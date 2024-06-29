import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class375 {
   @OriginalMember(
      owner = "client!bga",
      name = "u",
      descriptor = "I"
   )
   public int field5683 = 0;
   @OriginalMember(
      owner = "client!bga",
      name = "d",
      descriptor = "I"
   )
   public int field5691 = 500;
   @OriginalMember(
      owner = "client!bga",
      name = "y",
      descriptor = "I"
   )
   private int field5687 = 100;
   @OriginalMember(
      owner = "client!bga",
      name = "c",
      descriptor = "[I"
   )
   private int[] field5685 = new int[5];
   @OriginalMember(
      owner = "client!bga",
      name = "q",
      descriptor = "[I"
   )
   private int[] field5689 = new int[5];
   @OriginalMember(
      owner = "client!bga",
      name = "x",
      descriptor = "I"
   )
   private int field5684 = 0;
   @OriginalMember(
      owner = "client!bga",
      name = "s",
      descriptor = "[I"
   )
   private int[] field5698 = new int[5];
   @OriginalMember(
      owner = "client!bga",
      name = "p",
      descriptor = "[I"
   )
   private static int[] field5682 = new int[32768];
   @OriginalMember(
      owner = "client!bga",
      name = "b",
      descriptor = "[I"
   )
   private static int[] field5697;
   @OriginalMember(
      owner = "client!bga",
      name = "w",
      descriptor = "[I"
   )
   private static int[] field5692;
   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "[I"
   )
   private static int[] field5700;
   @OriginalMember(
      owner = "client!bga",
      name = "n",
      descriptor = "[I"
   )
   private static int[] field5703;
   @OriginalMember(
      owner = "client!bga",
      name = "h",
      descriptor = "[I"
   )
   private static int[] field5702;
   @OriginalMember(
      owner = "client!bga",
      name = "f",
      descriptor = "[I"
   )
   private static int[] field5704;
   @OriginalMember(
      owner = "client!bga",
      name = "v",
      descriptor = "[I"
   )
   private static int[] field5706;
   @OriginalMember(
      owner = "client!bga",
      name = "m",
      descriptor = "Lir;"
   )
   private class28 field5694;
   @OriginalMember(
      owner = "client!bga",
      name = "t",
      descriptor = "Lsm;"
   )
   private class297 field5686;
   @OriginalMember(
      owner = "client!bga",
      name = "k",
      descriptor = "Lsm;"
   )
   private class297 field5688;
   @OriginalMember(
      owner = "client!bga",
      name = "o",
      descriptor = "Lsm;"
   )
   private class297 field5690;
   @OriginalMember(
      owner = "client!bga",
      name = "g",
      descriptor = "Lsm;"
   )
   private class297 field5693;
   @OriginalMember(
      owner = "client!bga",
      name = "i",
      descriptor = "Lsm;"
   )
   private class297 field5695;
   @OriginalMember(
      owner = "client!bga",
      name = "e",
      descriptor = "Lsm;"
   )
   private class297 field5696;
   @OriginalMember(
      owner = "client!bga",
      name = "r",
      descriptor = "Lsm;"
   )
   private class297 field5699;
   @OriginalMember(
      owner = "client!bga",
      name = "j",
      descriptor = "Lsm;"
   )
   private class297 field5701;
   @OriginalMember(
      owner = "client!bga",
      name = "l",
      descriptor = "Lsm;"
   )
   private class297 field5705;

   static {
      Random var0 = new Random(0L);

      for(int var1 = 0; var1 < 32768; ++var1) {
         field5682[var1] = (var0.nextInt() & 2) - 1;
      }

      field5697 = new int[32768];

      for(int var2 = 0; var2 < 32768; ++var2) {
         field5697[var2] = (int)(Math.sin((double)var2 / 5215.1903D) * 16384.0D);
      }

      field5692 = new int[220500];
      field5700 = new int[5];
      field5703 = new int[5];
      field5702 = new int[5];
      field5704 = new int[5];
      field5706 = new int[5];
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(II)[I",
      line = 9
   )
   public final int[] method2907(int arg0, int arg1) {
      class195.method1493(field5692, 0, arg0);
      if (arg1 < 10) {
         return field5692;
      } else {
         double var3 = (double)arg0 / ((double)arg1 + 0.0D);
         this.field5695.method2258();
         this.field5688.method2258();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field5701 != null) {
            this.field5701.method2258();
            this.field5699.method2258();
            var5 = (int)((double)(this.field5701.field4118 - this.field5701.field4119) * 32.768D / var3);
            var6 = (int)((double)this.field5701.field4119 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field5696 != null) {
            this.field5696.method2258();
            this.field5690.method2258();
            var8 = (int)((double)(this.field5696.field4118 - this.field5696.field4119) * 32.768D / var3);
            var9 = (int)((double)this.field5696.field4119 * 32.768D / var3);
         }

         for(int var11 = 0; var11 < 5; ++var11) {
            if (this.field5685[var11] != 0) {
               field5702[var11] = 0;
               field5704[var11] = (int)((double)this.field5698[var11] * var3);
               field5703[var11] = (this.field5685[var11] << 14) / 100;
               field5706[var11] = (int)((double)(this.field5695.field4118 - this.field5695.field4119) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field5689[var11]) / var3);
               field5700[var11] = (int)((double)this.field5695.field4119 * 32.768D / var3);
            }
         }

         for(int var12 = 0; var12 < arg0; ++var12) {
            int var39 = this.field5695.method2260(arg0);
            int var40 = this.field5688.method2260(arg0);
            if (this.field5701 != null) {
               int var41 = this.field5701.method2260(arg0);
               int var42 = this.field5699.method2260(arg0);
               var39 += this.method2910(var7, var42, this.field5701.field4120) >> 1;
               var7 += (var5 * var41 >> 16) + var6;
            }

            if (this.field5696 != null) {
               int var43 = this.field5696.method2260(arg0);
               int var44 = this.field5690.method2260(arg0);
               var40 = var40 * ((this.method2910(var10, var44, this.field5696.field4120) >> 1) + 32768) >> 15;
               var10 += (var8 * var43 >> 16) + var9;
            }

            for(int var45 = 0; var45 < 5; ++var45) {
               if (this.field5685[var45] != 0) {
                  int var46 = field5704[var45] + var12;
                  if (var46 < arg0) {
                     field5692[var46] += this.method2910(field5702[var45], field5703[var45] * var40 >> 15, this.field5695.field4120);
                     field5702[var45] += (field5706[var45] * var39 >> 16) + field5700[var45];
                  }
               }
            }
         }

         if (this.field5686 != null) {
            this.field5686.method2258();
            this.field5705.method2258();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;

            for(int var16 = 0; var16 < arg0; ++var16) {
               int var17 = this.field5686.method2260(arg0);
               int var18 = this.field5705.method2260(arg0);
               int var19;
               if (var15) {
                  var19 = ((this.field5686.field4118 - this.field5686.field4119) * var17 >> 8) + this.field5686.field4119;
               } else {
                  var19 = ((this.field5686.field4118 - this.field5686.field4119) * var18 >> 8) + this.field5686.field4119;
               }

               var13 += 256;
               if (var13 >= var19) {
                  var13 = 0;
                  var15 = !var15;
               }

               if (var15) {
                  field5692[var16] = 0;
               }
            }
         }

         if (this.field5684 > 0 && this.field5687 > 0) {
            int var20 = (int)((double)this.field5684 * var3);

            for(int var21 = var20; var21 < arg0; ++var21) {
               field5692[var21] += field5692[var21 - var20] * this.field5687 / 100;
            }
         }

         if (this.field5694.field308[0] > 0 || this.field5694.field308[1] > 0) {
            this.field5693.method2258();
            int var22 = this.field5693.method2260(arg0 + 1);
            int var23 = this.field5694.method197(0, (float)var22 / 65536.0F);
            int var24 = this.field5694.method197(1, (float)var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
               int var25 = 0;
               int var26 = var24;
               if (var24 > arg0 - var23) {
                  var26 = arg0 - var23;
               }

               while(var25 < var26) {
                  int var35 = (int)((long)field5692[var23 + var25] * (long)class28.field312 >> 16);

                  for(int var36 = 0; var36 < var23; ++var36) {
                     var35 += (int)((long)field5692[var23 + var25 - 1 - var36] * (long)class28.field311[0][var36] >> 16);
                  }

                  for(int var37 = 0; var37 < var25; ++var37) {
                     var35 -= (int)((long)field5692[var25 - 1 - var37] * (long)class28.field311[1][var37] >> 16);
                  }

                  field5692[var25] = var35;
                  var22 = this.field5693.method2260(arg0 + 1);
                  ++var25;
               }

               int var27 = 128;

               while(true) {
                  if (var27 > arg0 - var23) {
                     var27 = arg0 - var23;
                  }

                  while(var25 < var27) {
                     int var32 = (int)((long)field5692[var23 + var25] * (long)class28.field312 >> 16);

                     for(int var33 = 0; var33 < var23; ++var33) {
                        var32 += (int)((long)field5692[var23 + var25 - 1 - var33] * (long)class28.field311[0][var33] >> 16);
                     }

                     for(int var34 = 0; var34 < var24; ++var34) {
                        var32 -= (int)((long)field5692[var25 - 1 - var34] * (long)class28.field311[1][var34] >> 16);
                     }

                     field5692[var25] = var32;
                     var22 = this.field5693.method2260(arg0 + 1);
                     ++var25;
                  }

                  if (var25 >= arg0 - var23) {
                     while(var25 < arg0) {
                        int var28 = 0;

                        for(int var29 = var23 + var25 - arg0; var29 < var23; ++var29) {
                           var28 += (int)((long)field5692[var23 + var25 - 1 - var29] * (long)class28.field311[0][var29] >> 16);
                        }

                        for(int var30 = 0; var30 < var24; ++var30) {
                           var28 -= (int)((long)field5692[var25 - 1 - var30] * (long)class28.field311[1][var30] >> 16);
                        }

                        field5692[var25] = var28;
                        this.field5693.method2260(arg0 + 1);
                        ++var25;
                     }
                     break;
                  }

                  var23 = this.field5694.method197(0, (float)var22 / 65536.0F);
                  var24 = this.field5694.method197(1, (float)var22 / 65536.0F);
                  var27 += 128;
               }
            }
         }

         for(int var38 = 0; var38 < arg0; ++var38) {
            if (field5692[var38] < -32768) {
               field5692[var38] = -32768;
            }

            if (field5692[var38] > 32767) {
               field5692[var38] = 32767;
            }
         }

         return field5692;
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "()V",
      line = 292
   )
   public static void method2908() {
      field5692 = null;
      field5682 = null;
      field5697 = null;
      field5702 = null;
      field5704 = null;
      field5703 = null;
      field5706 = null;
      field5700 = null;
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(Ljj;)V",
      line = 328
   )
   public final void method2909(class128 arg0) {
      this.field5695 = new class297();
      this.field5695.method2259(arg0);
      this.field5688 = new class297();
      this.field5688.method2259(arg0);
      int var2 = arg0.method1104(255);
      if (var2 != 0) {
         --arg0.field1590;
         this.field5701 = new class297();
         this.field5701.method2259(arg0);
         this.field5699 = new class297();
         this.field5699.method2259(arg0);
      }

      int var3 = arg0.method1104(255);
      if (var3 != 0) {
         --arg0.field1590;
         this.field5696 = new class297();
         this.field5696.method2259(arg0);
         this.field5690 = new class297();
         this.field5690.method2259(arg0);
      }

      int var4 = arg0.method1104(255);
      if (var4 != 0) {
         --arg0.field1590;
         this.field5686 = new class297();
         this.field5686.method2259(arg0);
         this.field5705 = new class297();
         this.field5705.method2259(arg0);
      }

      for(int var5 = 0; var5 < 10; ++var5) {
         int var6 = arg0.method1061((byte)60);
         if (var6 == 0) {
            break;
         }

         this.field5685[var5] = var6;
         this.field5689[var5] = arg0.method1098(-2883);
         this.field5698[var5] = arg0.method1061((byte)60);
      }

      this.field5684 = arg0.method1061((byte)60);
      this.field5687 = arg0.method1061((byte)60);
      this.field5691 = arg0.method1038((byte)-107);
      this.field5683 = arg0.method1038((byte)-114);
      this.field5694 = new class28();
      this.field5693 = new class297();
      this.field5694.method196(arg0, this.field5693);
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(III)I",
      line = 421
   )
   private final int method2910(int arg0, int arg1, int arg2) {
      if (arg2 == 1) {
         return (arg0 & 32767) < 16384 ? arg1 : -arg1;
      } else if (arg2 == 2) {
         return field5697[arg0 & 32767] * arg1 >> 14;
      } else if (arg2 == 3) {
         return ((arg0 & 32767) * arg1 >> 14) - arg1;
      } else {
         return arg2 == 4 ? field5682[arg0 / 2607 & 32767] * arg1 : 0;
      }
   }
}
