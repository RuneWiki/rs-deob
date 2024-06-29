import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class683 {
   @OriginalMember(
      owner = "client!rp",
      name = "k",
      descriptor = "[I"
   )
   private int[] field10048 = new int[5];
   @OriginalMember(
      owner = "client!rp",
      name = "n",
      descriptor = "I"
   )
   public int field10049 = 500;
   @OriginalMember(
      owner = "client!rp",
      name = "s",
      descriptor = "[I"
   )
   private int[] field10064 = new int[5];
   @OriginalMember(
      owner = "client!rp",
      name = "o",
      descriptor = "[I"
   )
   private int[] field10068 = new int[5];
   @OriginalMember(
      owner = "client!rp",
      name = "h",
      descriptor = "I"
   )
   public int field10051 = 0;
   @OriginalMember(
      owner = "client!rp",
      name = "x",
      descriptor = "I"
   )
   private int field10057 = 0;
   @OriginalMember(
      owner = "client!rp",
      name = "l",
      descriptor = "I"
   )
   private int field10069 = 100;
   @OriginalMember(
      owner = "client!rp",
      name = "d",
      descriptor = "[I"
   )
   private static int[] field10050 = new int[32768];
   @OriginalMember(
      owner = "client!rp",
      name = "r",
      descriptor = "[I"
   )
   private static int[] field10053;
   @OriginalMember(
      owner = "client!rp",
      name = "y",
      descriptor = "[I"
   )
   private static int[] field10056;
   @OriginalMember(
      owner = "client!rp",
      name = "v",
      descriptor = "[I"
   )
   private static int[] field10063;
   @OriginalMember(
      owner = "client!rp",
      name = "c",
      descriptor = "[I"
   )
   private static int[] field10061;
   @OriginalMember(
      owner = "client!rp",
      name = "b",
      descriptor = "[I"
   )
   private static int[] field10060;
   @OriginalMember(
      owner = "client!rp",
      name = "f",
      descriptor = "[I"
   )
   private static int[] field10067;
   @OriginalMember(
      owner = "client!rp",
      name = "m",
      descriptor = "[I"
   )
   private static int[] field10070;
   @OriginalMember(
      owner = "client!rp",
      name = "q",
      descriptor = "Leu;"
   )
   private class200 field10065;
   @OriginalMember(
      owner = "client!rp",
      name = "e",
      descriptor = "Ldca;"
   )
   private class691 field10046;
   @OriginalMember(
      owner = "client!rp",
      name = "j",
      descriptor = "Ldca;"
   )
   private class691 field10047;
   @OriginalMember(
      owner = "client!rp",
      name = "p",
      descriptor = "Ldca;"
   )
   private class691 field10052;
   @OriginalMember(
      owner = "client!rp",
      name = "t",
      descriptor = "Ldca;"
   )
   private class691 field10054;
   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "Ldca;"
   )
   private class691 field10055;
   @OriginalMember(
      owner = "client!rp",
      name = "w",
      descriptor = "Ldca;"
   )
   private class691 field10058;
   @OriginalMember(
      owner = "client!rp",
      name = "i",
      descriptor = "Ldca;"
   )
   private class691 field10059;
   @OriginalMember(
      owner = "client!rp",
      name = "u",
      descriptor = "Ldca;"
   )
   private class691 field10062;
   @OriginalMember(
      owner = "client!rp",
      name = "g",
      descriptor = "Ldca;"
   )
   private class691 field10066;

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(III)I"
   )
   private final int method4972(int arg0, int arg1, int arg2) {
      if (arg2 == 1) {
         return (arg0 & 32767) < 16384 ? arg1 : -arg1;
      } else if (arg2 == 2) {
         return field10053[arg0 & 32767] * arg1 >> 14;
      } else if (arg2 == 3) {
         return ((arg0 & 32767) * arg1 >> 14) - arg1;
      } else {
         return arg2 == 4 ? field10050[arg0 / 2607 & 32767] * arg1 : 0;
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "()V"
   )
   public static void method4973() {
      field10056 = null;
      field10050 = null;
      field10053 = null;
      field10060 = null;
      field10067 = null;
      field10070 = null;
      field10063 = null;
      field10061 = null;
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(Lgea;)V"
   )
   public final void method4974(class66 arg0) {
      this.field10062 = new class691();
      this.field10062.method5046(arg0);
      this.field10052 = new class691();
      this.field10052.method5046(arg0);
      int var2 = arg0.method640(255);
      if (var2 != 0) {
         --arg0.field864;
         this.field10047 = new class691();
         this.field10047.method5046(arg0);
         this.field10059 = new class691();
         this.field10059.method5046(arg0);
      }

      int var3 = arg0.method640(255);
      if (var3 != 0) {
         --arg0.field864;
         this.field10055 = new class691();
         this.field10055.method5046(arg0);
         this.field10054 = new class691();
         this.field10054.method5046(arg0);
      }

      int var4 = arg0.method640(255);
      if (var4 != 0) {
         --arg0.field864;
         this.field10066 = new class691();
         this.field10066.method5046(arg0);
         this.field10046 = new class691();
         this.field10046.method5046(arg0);
      }

      for(int var5 = 0; var5 < 10; ++var5) {
         int var6 = arg0.method653((byte)106);
         if (var6 == 0) {
            break;
         }

         this.field10068[var5] = var6;
         this.field10064[var5] = arg0.method623(-49152);
         this.field10048[var5] = arg0.method653((byte)-56);
      }

      this.field10057 = arg0.method653((byte)-64);
      this.field10069 = arg0.method653((byte)43);
      this.field10049 = arg0.method603(-2);
      this.field10051 = arg0.method603(-2);
      this.field10065 = new class200();
      this.field10058 = new class691();
      this.field10065.method1657(arg0, this.field10058);
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method4975(int arg0, int arg1) {
      class349.method2760(field10056, 0, arg0);
      if (arg1 < 10) {
         return field10056;
      } else {
         double var3 = (double)arg0 / ((double)arg1 + 0.0D);
         this.field10062.method5047();
         this.field10052.method5047();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field10047 != null) {
            this.field10047.method5047();
            this.field10059.method5047();
            var5 = (int)((double)(this.field10047.field10154 - this.field10047.field10151) * 32.768D / var3);
            var6 = (int)((double)this.field10047.field10151 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field10055 != null) {
            this.field10055.method5047();
            this.field10054.method5047();
            var8 = (int)((double)(this.field10055.field10154 - this.field10055.field10151) * 32.768D / var3);
            var9 = (int)((double)this.field10055.field10151 * 32.768D / var3);
         }

         for(int var11 = 0; var11 < 5; ++var11) {
            if (this.field10068[var11] != 0) {
               field10060[var11] = 0;
               field10067[var11] = (int)((double)this.field10048[var11] * var3);
               field10070[var11] = (this.field10068[var11] << 14) / 100;
               field10063[var11] = (int)((double)(this.field10062.field10154 - this.field10062.field10151) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field10064[var11]) / var3);
               field10061[var11] = (int)((double)this.field10062.field10151 * 32.768D / var3);
            }
         }

         for(int var12 = 0; var12 < arg0; ++var12) {
            int var39 = this.field10062.method5044(arg0);
            int var40 = this.field10052.method5044(arg0);
            if (this.field10047 != null) {
               int var41 = this.field10047.method5044(arg0);
               int var42 = this.field10059.method5044(arg0);
               var39 += this.method4972(var7, var42, this.field10047.field10152) >> 1;
               var7 += (var5 * var41 >> 16) + var6;
            }

            if (this.field10055 != null) {
               int var43 = this.field10055.method5044(arg0);
               int var44 = this.field10054.method5044(arg0);
               var40 = var40 * ((this.method4972(var10, var44, this.field10055.field10152) >> 1) + 32768) >> 15;
               var10 += (var8 * var43 >> 16) + var9;
            }

            for(int var45 = 0; var45 < 5; ++var45) {
               if (this.field10068[var45] != 0) {
                  int var46 = field10067[var45] + var12;
                  if (var46 < arg0) {
                     field10056[var46] += this.method4972(field10060[var45], field10070[var45] * var40 >> 15, this.field10062.field10152);
                     field10060[var45] += (field10063[var45] * var39 >> 16) + field10061[var45];
                  }
               }
            }
         }

         if (this.field10066 != null) {
            this.field10066.method5047();
            this.field10046.method5047();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;

            for(int var16 = 0; var16 < arg0; ++var16) {
               int var17 = this.field10066.method5044(arg0);
               int var18 = this.field10046.method5044(arg0);
               int var19;
               if (var15) {
                  var19 = ((this.field10066.field10154 - this.field10066.field10151) * var17 >> 8) + this.field10066.field10151;
               } else {
                  var19 = ((this.field10066.field10154 - this.field10066.field10151) * var18 >> 8) + this.field10066.field10151;
               }

               var13 += 256;
               if (var13 >= var19) {
                  var13 = 0;
                  var15 = !var15;
               }

               if (var15) {
                  field10056[var16] = 0;
               }
            }
         }

         if (this.field10057 > 0 && this.field10069 > 0) {
            int var20 = (int)((double)this.field10057 * var3);

            for(int var21 = var20; var21 < arg0; ++var21) {
               field10056[var21] += field10056[var21 - var20] * this.field10069 / 100;
            }
         }

         if (this.field10065.field2542[0] > 0 || this.field10065.field2542[1] > 0) {
            this.field10058.method5047();
            int var22 = this.field10058.method5044(arg0 + 1);
            int var23 = this.field10065.method1655(0, (float)var22 / 65536.0F);
            int var24 = this.field10065.method1655(1, (float)var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
               int var25 = 0;
               int var26 = var24;
               if (var24 > arg0 - var23) {
                  var26 = arg0 - var23;
               }

               while(var25 < var26) {
                  int var35 = (int)((long)field10056[var23 + var25] * (long)class200.field2539 >> 16);

                  for(int var36 = 0; var36 < var23; ++var36) {
                     var35 += (int)((long)field10056[var23 + var25 - 1 - var36] * (long)class200.field2545[0][var36] >> 16);
                  }

                  for(int var37 = 0; var37 < var25; ++var37) {
                     var35 -= (int)((long)field10056[var25 - 1 - var37] * (long)class200.field2545[1][var37] >> 16);
                  }

                  field10056[var25] = var35;
                  var22 = this.field10058.method5044(arg0 + 1);
                  ++var25;
               }

               int var27 = 128;

               while(true) {
                  if (var27 > arg0 - var23) {
                     var27 = arg0 - var23;
                  }

                  while(var25 < var27) {
                     int var32 = (int)((long)field10056[var23 + var25] * (long)class200.field2539 >> 16);

                     for(int var33 = 0; var33 < var23; ++var33) {
                        var32 += (int)((long)field10056[var23 + var25 - 1 - var33] * (long)class200.field2545[0][var33] >> 16);
                     }

                     for(int var34 = 0; var34 < var24; ++var34) {
                        var32 -= (int)((long)field10056[var25 - 1 - var34] * (long)class200.field2545[1][var34] >> 16);
                     }

                     field10056[var25] = var32;
                     var22 = this.field10058.method5044(arg0 + 1);
                     ++var25;
                  }

                  if (var25 >= arg0 - var23) {
                     while(var25 < arg0) {
                        int var28 = 0;

                        for(int var29 = var23 + var25 - arg0; var29 < var23; ++var29) {
                           var28 += (int)((long)field10056[var23 + var25 - 1 - var29] * (long)class200.field2545[0][var29] >> 16);
                        }

                        for(int var30 = 0; var30 < var24; ++var30) {
                           var28 -= (int)((long)field10056[var25 - 1 - var30] * (long)class200.field2545[1][var30] >> 16);
                        }

                        field10056[var25] = var28;
                        this.field10058.method5044(arg0 + 1);
                        ++var25;
                     }
                     break;
                  }

                  var23 = this.field10065.method1655(0, (float)var22 / 65536.0F);
                  var24 = this.field10065.method1655(1, (float)var22 / 65536.0F);
                  var27 += 128;
               }
            }
         }

         for(int var38 = 0; var38 < arg0; ++var38) {
            if (field10056[var38] < -32768) {
               field10056[var38] = -32768;
            }

            if (field10056[var38] > 32767) {
               field10056[var38] = 32767;
            }
         }

         return field10056;
      }
   }

   static {
      Random var0 = new Random(0L);

      for(int var1 = 0; var1 < 32768; ++var1) {
         field10050[var1] = (var0.nextInt() & 2) - 1;
      }

      field10053 = new int[32768];

      for(int var2 = 0; var2 < 32768; ++var2) {
         field10053[var2] = (int)(Math.sin((double)var2 / 5215.1903D) * 16384.0D);
      }

      field10056 = new int[220500];
      field10063 = new int[5];
      field10061 = new int[5];
      field10060 = new int[5];
      field10067 = new int[5];
      field10070 = new int[5];
   }
}
