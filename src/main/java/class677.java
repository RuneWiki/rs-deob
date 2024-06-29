import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class677 {
   @OriginalMember(
      owner = "client!it",
      name = "y",
      descriptor = "I"
   )
   private int field10058 = 100;
   @OriginalMember(
      owner = "client!it",
      name = "g",
      descriptor = "[I"
   )
   private int[] field10070 = new int[5];
   @OriginalMember(
      owner = "client!it",
      name = "x",
      descriptor = "[I"
   )
   private int[] field10063 = new int[5];
   @OriginalMember(
      owner = "client!it",
      name = "c",
      descriptor = "I"
   )
   private int field10060 = 0;
   @OriginalMember(
      owner = "client!it",
      name = "p",
      descriptor = "I"
   )
   public int field10057 = 0;
   @OriginalMember(
      owner = "client!it",
      name = "l",
      descriptor = "[I"
   )
   private int[] field10066 = new int[5];
   @OriginalMember(
      owner = "client!it",
      name = "f",
      descriptor = "I"
   )
   public int field10071 = 500;
   @OriginalMember(
      owner = "client!it",
      name = "n",
      descriptor = "[I"
   )
   private static int[] field10062 = new int[32768];
   @OriginalMember(
      owner = "client!it",
      name = "r",
      descriptor = "[I"
   )
   private static int[] field10073;
   @OriginalMember(
      owner = "client!it",
      name = "s",
      descriptor = "[I"
   )
   private static int[] field10065;
   @OriginalMember(
      owner = "client!it",
      name = "w",
      descriptor = "[I"
   )
   private static int[] field10074;
   @OriginalMember(
      owner = "client!it",
      name = "u",
      descriptor = "[I"
   )
   private static int[] field10079;
   @OriginalMember(
      owner = "client!it",
      name = "o",
      descriptor = "[I"
   )
   private static int[] field10077;
   @OriginalMember(
      owner = "client!it",
      name = "j",
      descriptor = "[I"
   )
   private static int[] field10081;
   @OriginalMember(
      owner = "client!it",
      name = "q",
      descriptor = "[I"
   )
   private static int[] field10080;
   @OriginalMember(
      owner = "client!it",
      name = "t",
      descriptor = "Loca;"
   )
   private class134 field10068;
   @OriginalMember(
      owner = "client!it",
      name = "k",
      descriptor = "Leka;"
   )
   private class763 field10059;
   @OriginalMember(
      owner = "client!it",
      name = "d",
      descriptor = "Leka;"
   )
   private class763 field10061;
   @OriginalMember(
      owner = "client!it",
      name = "i",
      descriptor = "Leka;"
   )
   private class763 field10064;
   @OriginalMember(
      owner = "client!it",
      name = "h",
      descriptor = "Leka;"
   )
   private class763 field10067;
   @OriginalMember(
      owner = "client!it",
      name = "b",
      descriptor = "Leka;"
   )
   private class763 field10069;
   @OriginalMember(
      owner = "client!it",
      name = "m",
      descriptor = "Leka;"
   )
   private class763 field10072;
   @OriginalMember(
      owner = "client!it",
      name = "v",
      descriptor = "Leka;"
   )
   private class763 field10075;
   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "Leka;"
   )
   private class763 field10076;
   @OriginalMember(
      owner = "client!it",
      name = "e",
      descriptor = "Leka;"
   )
   private class763 field10078;

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(Lica;)V"
   )
   public final void method4990(class354 arg0) {
      this.field10075 = new class763();
      this.field10075.method5592(arg0);
      this.field10059 = new class763();
      this.field10059.method5592(arg0);
      int var2 = arg0.method2855(-31007);
      if (var2 != 0) {
         --arg0.field5436;
         this.field10067 = new class763();
         this.field10067.method5592(arg0);
         this.field10078 = new class763();
         this.field10078.method5592(arg0);
      }

      int var3 = arg0.method2855(-31007);
      if (var3 != 0) {
         --arg0.field5436;
         this.field10076 = new class763();
         this.field10076.method5592(arg0);
         this.field10072 = new class763();
         this.field10072.method5592(arg0);
      }

      int var4 = arg0.method2855(-31007);
      if (var4 != 0) {
         --arg0.field5436;
         this.field10069 = new class763();
         this.field10069.method5592(arg0);
         this.field10064 = new class763();
         this.field10064.method5592(arg0);
      }

      for(int var5 = 0; var5 < 10; ++var5) {
         int var6 = arg0.method2896(0);
         if (var6 == 0) {
            break;
         }

         this.field10063[var5] = var6;
         this.field10070[var5] = arg0.method2881(-108);
         this.field10066[var5] = arg0.method2896(0);
      }

      this.field10060 = arg0.method2896(0);
      this.field10058 = arg0.method2896(0);
      this.field10071 = arg0.method2848(-127);
      this.field10057 = arg0.method2848(-111);
      this.field10068 = new class134();
      this.field10061 = new class763();
      this.field10068.method1239(arg0, this.field10061);
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(III)I"
   )
   private final int method4991(int arg0, int arg1, int arg2) {
      if (arg2 == 1) {
         return (arg0 & 32767) < 16384 ? arg1 : -arg1;
      } else if (arg2 == 2) {
         return field10073[arg0 & 32767] * arg1 >> 14;
      } else if (arg2 == 3) {
         return ((arg0 & 32767) * arg1 >> 14) - arg1;
      } else {
         return arg2 == 4 ? field10062[arg0 / 2607 & 32767] * arg1 : 0;
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "()V"
   )
   public static void method4992() {
      field10065 = null;
      field10062 = null;
      field10073 = null;
      field10077 = null;
      field10074 = null;
      field10081 = null;
      field10079 = null;
      field10080 = null;
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method4993(int arg0, int arg1) {
      class107.method1026(field10065, 0, arg0);
      if (arg1 < 10) {
         return field10065;
      } else {
         double var3 = (double)arg0 / ((double)arg1 + 0.0D);
         this.field10075.method5591();
         this.field10059.method5591();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field10067 != null) {
            this.field10067.method5591();
            this.field10078.method5591();
            var5 = (int)((double)(this.field10067.field11289 - this.field10067.field11290) * 32.768D / var3);
            var6 = (int)((double)this.field10067.field11290 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field10076 != null) {
            this.field10076.method5591();
            this.field10072.method5591();
            var8 = (int)((double)(this.field10076.field11289 - this.field10076.field11290) * 32.768D / var3);
            var9 = (int)((double)this.field10076.field11290 * 32.768D / var3);
         }

         for(int var11 = 0; var11 < 5; ++var11) {
            if (this.field10063[var11] != 0) {
               field10077[var11] = 0;
               field10074[var11] = (int)((double)this.field10066[var11] * var3);
               field10081[var11] = (this.field10063[var11] << 14) / 100;
               field10079[var11] = (int)((double)(this.field10075.field11289 - this.field10075.field11290) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field10070[var11]) / var3);
               field10080[var11] = (int)((double)this.field10075.field11290 * 32.768D / var3);
            }
         }

         for(int var12 = 0; var12 < arg0; ++var12) {
            int var39 = this.field10075.method5589(arg0);
            int var40 = this.field10059.method5589(arg0);
            if (this.field10067 != null) {
               int var41 = this.field10067.method5589(arg0);
               int var42 = this.field10078.method5589(arg0);
               var39 += this.method4991(var7, var42, this.field10067.field11288) >> 1;
               var7 += (var5 * var41 >> 16) + var6;
            }

            if (this.field10076 != null) {
               int var43 = this.field10076.method5589(arg0);
               int var44 = this.field10072.method5589(arg0);
               var40 = var40 * ((this.method4991(var10, var44, this.field10076.field11288) >> 1) + 32768) >> 15;
               var10 += (var8 * var43 >> 16) + var9;
            }

            for(int var45 = 0; var45 < 5; ++var45) {
               if (this.field10063[var45] != 0) {
                  int var46 = field10074[var45] + var12;
                  if (var46 < arg0) {
                     field10065[var46] += this.method4991(field10077[var45], field10081[var45] * var40 >> 15, this.field10075.field11288);
                     field10077[var45] += (field10079[var45] * var39 >> 16) + field10080[var45];
                  }
               }
            }
         }

         if (this.field10069 != null) {
            this.field10069.method5591();
            this.field10064.method5591();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;

            for(int var16 = 0; var16 < arg0; ++var16) {
               int var17 = this.field10069.method5589(arg0);
               int var18 = this.field10064.method5589(arg0);
               int var19;
               if (var15) {
                  var19 = ((this.field10069.field11289 - this.field10069.field11290) * var17 >> 8) + this.field10069.field11290;
               } else {
                  var19 = ((this.field10069.field11289 - this.field10069.field11290) * var18 >> 8) + this.field10069.field11290;
               }

               var13 += 256;
               if (var13 >= var19) {
                  var13 = 0;
                  var15 = !var15;
               }

               if (var15) {
                  field10065[var16] = 0;
               }
            }
         }

         if (this.field10060 > 0 && this.field10058 > 0) {
            int var20 = (int)((double)this.field10060 * var3);

            for(int var21 = var20; var21 < arg0; ++var21) {
               field10065[var21] += field10065[var21 - var20] * this.field10058 / 100;
            }
         }

         if (this.field10068.field1900[0] > 0 || this.field10068.field1900[1] > 0) {
            this.field10061.method5591();
            int var22 = this.field10061.method5589(arg0 + 1);
            int var23 = this.field10068.method1242(0, (float)var22 / 65536.0F);
            int var24 = this.field10068.method1242(1, (float)var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
               int var25 = 0;
               int var26 = var24;
               if (var24 > arg0 - var23) {
                  var26 = arg0 - var23;
               }

               while(var25 < var26) {
                  int var35 = (int)((long)field10065[var23 + var25] * (long)class134.field1895 >> 16);

                  for(int var36 = 0; var36 < var23; ++var36) {
                     var35 += (int)((long)field10065[var23 + var25 - 1 - var36] * (long)class134.field1901[0][var36] >> 16);
                  }

                  for(int var37 = 0; var37 < var25; ++var37) {
                     var35 -= (int)((long)field10065[var25 - 1 - var37] * (long)class134.field1901[1][var37] >> 16);
                  }

                  field10065[var25] = var35;
                  var22 = this.field10061.method5589(arg0 + 1);
                  ++var25;
               }

               int var27 = 128;

               while(true) {
                  if (var27 > arg0 - var23) {
                     var27 = arg0 - var23;
                  }

                  while(var25 < var27) {
                     int var32 = (int)((long)field10065[var23 + var25] * (long)class134.field1895 >> 16);

                     for(int var33 = 0; var33 < var23; ++var33) {
                        var32 += (int)((long)field10065[var23 + var25 - 1 - var33] * (long)class134.field1901[0][var33] >> 16);
                     }

                     for(int var34 = 0; var34 < var24; ++var34) {
                        var32 -= (int)((long)field10065[var25 - 1 - var34] * (long)class134.field1901[1][var34] >> 16);
                     }

                     field10065[var25] = var32;
                     var22 = this.field10061.method5589(arg0 + 1);
                     ++var25;
                  }

                  if (var25 >= arg0 - var23) {
                     while(var25 < arg0) {
                        int var28 = 0;

                        for(int var29 = var23 + var25 - arg0; var29 < var23; ++var29) {
                           var28 += (int)((long)field10065[var23 + var25 - 1 - var29] * (long)class134.field1901[0][var29] >> 16);
                        }

                        for(int var30 = 0; var30 < var24; ++var30) {
                           var28 -= (int)((long)field10065[var25 - 1 - var30] * (long)class134.field1901[1][var30] >> 16);
                        }

                        field10065[var25] = var28;
                        this.field10061.method5589(arg0 + 1);
                        ++var25;
                     }
                     break;
                  }

                  var23 = this.field10068.method1242(0, (float)var22 / 65536.0F);
                  var24 = this.field10068.method1242(1, (float)var22 / 65536.0F);
                  var27 += 128;
               }
            }
         }

         for(int var38 = 0; var38 < arg0; ++var38) {
            if (field10065[var38] < -32768) {
               field10065[var38] = -32768;
            }

            if (field10065[var38] > 32767) {
               field10065[var38] = 32767;
            }
         }

         return field10065;
      }
   }

   static {
      Random var0 = new Random(0L);

      for(int var1 = 0; var1 < 32768; ++var1) {
         field10062[var1] = (var0.nextInt() & 2) - 1;
      }

      field10073 = new int[32768];

      for(int var2 = 0; var2 < 32768; ++var2) {
         field10073[var2] = (int)(Math.sin((double)var2 / 5215.1903D) * 16384.0D);
      }

      field10065 = new int[220500];
      field10074 = new int[5];
      field10079 = new int[5];
      field10077 = new int[5];
      field10081 = new int[5];
      field10080 = new int[5];
   }
}
