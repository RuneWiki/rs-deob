import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class788 {
   @OriginalMember(
      owner = "client!nca",
      name = "r",
      descriptor = "I"
   )
   private int field11495 = 100;
   @OriginalMember(
      owner = "client!nca",
      name = "x",
      descriptor = "I"
   )
   public int field11497 = 500;
   @OriginalMember(
      owner = "client!nca",
      name = "v",
      descriptor = "I"
   )
   private int field11504 = 0;
   @OriginalMember(
      owner = "client!nca",
      name = "g",
      descriptor = "[I"
   )
   private int[] field11507 = new int[5];
   @OriginalMember(
      owner = "client!nca",
      name = "e",
      descriptor = "I"
   )
   public int field11510 = 0;
   @OriginalMember(
      owner = "client!nca",
      name = "h",
      descriptor = "[I"
   )
   private int[] field11500 = new int[5];
   @OriginalMember(
      owner = "client!nca",
      name = "t",
      descriptor = "[I"
   )
   private int[] field11513 = new int[5];
   @OriginalMember(
      owner = "client!nca",
      name = "y",
      descriptor = "[I"
   )
   private static int[] field11511 = new int[32768];
   @OriginalMember(
      owner = "client!nca",
      name = "m",
      descriptor = "[I"
   )
   private static int[] field11506;
   @OriginalMember(
      owner = "client!nca",
      name = "d",
      descriptor = "[I"
   )
   private static int[] field11505;
   @OriginalMember(
      owner = "client!nca",
      name = "s",
      descriptor = "[I"
   )
   private static int[] field11514;
   @OriginalMember(
      owner = "client!nca",
      name = "o",
      descriptor = "[I"
   )
   private static int[] field11516;
   @OriginalMember(
      owner = "client!nca",
      name = "l",
      descriptor = "[I"
   )
   private static int[] field11517;
   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "[I"
   )
   private static int[] field11519;
   @OriginalMember(
      owner = "client!nca",
      name = "n",
      descriptor = "[I"
   )
   private static int[] field11518;
   @OriginalMember(
      owner = "client!nca",
      name = "k",
      descriptor = "Ler;"
   )
   private class116 field11496;
   @OriginalMember(
      owner = "client!nca",
      name = "q",
      descriptor = "Ler;"
   )
   private class116 field11498;
   @OriginalMember(
      owner = "client!nca",
      name = "w",
      descriptor = "Ler;"
   )
   private class116 field11499;
   @OriginalMember(
      owner = "client!nca",
      name = "p",
      descriptor = "Ler;"
   )
   private class116 field11501;
   @OriginalMember(
      owner = "client!nca",
      name = "u",
      descriptor = "Ler;"
   )
   private class116 field11502;
   @OriginalMember(
      owner = "client!nca",
      name = "b",
      descriptor = "Ler;"
   )
   private class116 field11508;
   @OriginalMember(
      owner = "client!nca",
      name = "i",
      descriptor = "Ler;"
   )
   private class116 field11509;
   @OriginalMember(
      owner = "client!nca",
      name = "j",
      descriptor = "Ler;"
   )
   private class116 field11512;
   @OriginalMember(
      owner = "client!nca",
      name = "f",
      descriptor = "Ler;"
   )
   private class116 field11515;
   @OriginalMember(
      owner = "client!nca",
      name = "c",
      descriptor = "Lsia;"
   )
   private class769 field11503;

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(Lwm;)V"
   )
   public final void method5669(class594 arg0) {
      this.field11512 = new class116();
      this.field11512.method1002(arg0);
      this.field11502 = new class116();
      this.field11502.method1002(arg0);
      int var2 = arg0.method4288((byte)63);
      if (var2 != 0) {
         --arg0.field8243;
         this.field11509 = new class116();
         this.field11509.method1002(arg0);
         this.field11515 = new class116();
         this.field11515.method1002(arg0);
      }

      int var3 = arg0.method4288((byte)114);
      if (var3 != 0) {
         --arg0.field8243;
         this.field11496 = new class116();
         this.field11496.method1002(arg0);
         this.field11508 = new class116();
         this.field11508.method1002(arg0);
      }

      int var4 = arg0.method4288((byte)97);
      if (var4 != 0) {
         --arg0.field8243;
         this.field11499 = new class116();
         this.field11499.method1002(arg0);
         this.field11501 = new class116();
         this.field11501.method1002(arg0);
      }

      for(int var5 = 0; var5 < 10; ++var5) {
         int var6 = arg0.method4338(false);
         if (var6 == 0) {
            break;
         }

         this.field11513[var5] = var6;
         this.field11507[var5] = arg0.method4319(255);
         this.field11500[var5] = arg0.method4338(false);
      }

      this.field11504 = arg0.method4338(false);
      this.field11495 = arg0.method4338(false);
      this.field11497 = arg0.method4280(-19104);
      this.field11510 = arg0.method4280(-19104);
      this.field11503 = new class769();
      this.field11498 = new class116();
      this.field11503.method5507(arg0, this.field11498);
   }

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method5670(int arg0, int arg1) {
      class714.method5198(field11505, 0, arg0);
      if (arg1 < 10) {
         return field11505;
      } else {
         double var3 = (double)arg0 / ((double)arg1 + 0.0D);
         this.field11512.method999();
         this.field11502.method999();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field11509 != null) {
            this.field11509.method999();
            this.field11515.method999();
            var5 = (int)((double)(this.field11509.field1431 - this.field11509.field1433) * 32.768D / var3);
            var6 = (int)((double)this.field11509.field1433 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field11496 != null) {
            this.field11496.method999();
            this.field11508.method999();
            var8 = (int)((double)(this.field11496.field1431 - this.field11496.field1433) * 32.768D / var3);
            var9 = (int)((double)this.field11496.field1433 * 32.768D / var3);
         }

         for(int var11 = 0; var11 < 5; ++var11) {
            if (this.field11513[var11] != 0) {
               field11517[var11] = 0;
               field11514[var11] = (int)((double)this.field11500[var11] * var3);
               field11518[var11] = (this.field11513[var11] << 14) / 100;
               field11516[var11] = (int)((double)(this.field11512.field1431 - this.field11512.field1433) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field11507[var11]) / var3);
               field11519[var11] = (int)((double)this.field11512.field1433 * 32.768D / var3);
            }
         }

         for(int var12 = 0; var12 < arg0; ++var12) {
            int var39 = this.field11512.method1000(arg0);
            int var40 = this.field11502.method1000(arg0);
            if (this.field11509 != null) {
               int var41 = this.field11509.method1000(arg0);
               int var42 = this.field11515.method1000(arg0);
               var39 += this.method5672(var7, var42, this.field11509.field1428) >> 1;
               var7 += (var5 * var41 >> 16) + var6;
            }

            if (this.field11496 != null) {
               int var43 = this.field11496.method1000(arg0);
               int var44 = this.field11508.method1000(arg0);
               var40 = var40 * ((this.method5672(var10, var44, this.field11496.field1428) >> 1) + 32768) >> 15;
               var10 += (var8 * var43 >> 16) + var9;
            }

            for(int var45 = 0; var45 < 5; ++var45) {
               if (this.field11513[var45] != 0) {
                  int var46 = field11514[var45] + var12;
                  if (var46 < arg0) {
                     field11505[var46] += this.method5672(field11517[var45], field11518[var45] * var40 >> 15, this.field11512.field1428);
                     field11517[var45] += (field11516[var45] * var39 >> 16) + field11519[var45];
                  }
               }
            }
         }

         if (this.field11499 != null) {
            this.field11499.method999();
            this.field11501.method999();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;

            for(int var16 = 0; var16 < arg0; ++var16) {
               int var17 = this.field11499.method1000(arg0);
               int var18 = this.field11501.method1000(arg0);
               int var19;
               if (var15) {
                  var19 = ((this.field11499.field1431 - this.field11499.field1433) * var17 >> 8) + this.field11499.field1433;
               } else {
                  var19 = ((this.field11499.field1431 - this.field11499.field1433) * var18 >> 8) + this.field11499.field1433;
               }

               var13 += 256;
               if (var13 >= var19) {
                  var13 = 0;
                  var15 = !var15;
               }

               if (var15) {
                  field11505[var16] = 0;
               }
            }
         }

         if (this.field11504 > 0 && this.field11495 > 0) {
            int var20 = (int)((double)this.field11504 * var3);

            for(int var21 = var20; var21 < arg0; ++var21) {
               field11505[var21] += field11505[var21 - var20] * this.field11495 / 100;
            }
         }

         if (this.field11503.field11082[0] > 0 || this.field11503.field11082[1] > 0) {
            this.field11498.method999();
            int var22 = this.field11498.method1000(arg0 + 1);
            int var23 = this.field11503.method5509(0, (float)var22 / 65536.0F);
            int var24 = this.field11503.method5509(1, (float)var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
               int var25 = 0;
               int var26 = var24;
               if (var24 > arg0 - var23) {
                  var26 = arg0 - var23;
               }

               while(var25 < var26) {
                  int var35 = (int)((long)field11505[var23 + var25] * (long)class769.field11085 >> 16);

                  for(int var36 = 0; var36 < var23; ++var36) {
                     var35 += (int)((long)field11505[var23 + var25 - 1 - var36] * (long)class769.field11083[0][var36] >> 16);
                  }

                  for(int var37 = 0; var37 < var25; ++var37) {
                     var35 -= (int)((long)field11505[var25 - 1 - var37] * (long)class769.field11083[1][var37] >> 16);
                  }

                  field11505[var25] = var35;
                  var22 = this.field11498.method1000(arg0 + 1);
                  ++var25;
               }

               int var27 = 128;

               while(true) {
                  if (var27 > arg0 - var23) {
                     var27 = arg0 - var23;
                  }

                  while(var25 < var27) {
                     int var32 = (int)((long)field11505[var23 + var25] * (long)class769.field11085 >> 16);

                     for(int var33 = 0; var33 < var23; ++var33) {
                        var32 += (int)((long)field11505[var23 + var25 - 1 - var33] * (long)class769.field11083[0][var33] >> 16);
                     }

                     for(int var34 = 0; var34 < var24; ++var34) {
                        var32 -= (int)((long)field11505[var25 - 1 - var34] * (long)class769.field11083[1][var34] >> 16);
                     }

                     field11505[var25] = var32;
                     var22 = this.field11498.method1000(arg0 + 1);
                     ++var25;
                  }

                  if (var25 >= arg0 - var23) {
                     while(var25 < arg0) {
                        int var28 = 0;

                        for(int var29 = var23 + var25 - arg0; var29 < var23; ++var29) {
                           var28 += (int)((long)field11505[var23 + var25 - 1 - var29] * (long)class769.field11083[0][var29] >> 16);
                        }

                        for(int var30 = 0; var30 < var24; ++var30) {
                           var28 -= (int)((long)field11505[var25 - 1 - var30] * (long)class769.field11083[1][var30] >> 16);
                        }

                        field11505[var25] = var28;
                        this.field11498.method1000(arg0 + 1);
                        ++var25;
                     }
                     break;
                  }

                  var23 = this.field11503.method5509(0, (float)var22 / 65536.0F);
                  var24 = this.field11503.method5509(1, (float)var22 / 65536.0F);
                  var27 += 128;
               }
            }
         }

         for(int var38 = 0; var38 < arg0; ++var38) {
            if (field11505[var38] < -32768) {
               field11505[var38] = -32768;
            }

            if (field11505[var38] > 32767) {
               field11505[var38] = 32767;
            }
         }

         return field11505;
      }
   }

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "()V"
   )
   public static void method5671() {
      field11505 = null;
      field11511 = null;
      field11506 = null;
      field11517 = null;
      field11514 = null;
      field11518 = null;
      field11516 = null;
      field11519 = null;
   }

   @OriginalMember(
      owner = "client!nca",
      name = "a",
      descriptor = "(III)I"
   )
   private final int method5672(int arg0, int arg1, int arg2) {
      if (arg2 == 1) {
         return (arg0 & 32767) < 16384 ? arg1 : -arg1;
      } else if (arg2 == 2) {
         return field11506[arg0 & 32767] * arg1 >> 14;
      } else if (arg2 == 3) {
         return ((arg0 & 32767) * arg1 >> 14) - arg1;
      } else {
         return arg2 == 4 ? field11511[arg0 / 2607 & 32767] * arg1 : 0;
      }
   }

   static {
      Random var0 = new Random(0L);

      for(int var1 = 0; var1 < 32768; ++var1) {
         field11511[var1] = (var0.nextInt() & 2) - 1;
      }

      field11506 = new int[32768];

      for(int var2 = 0; var2 < 32768; ++var2) {
         field11506[var2] = (int)(Math.sin((double)var2 / 5215.1903D) * 16384.0D);
      }

      field11505 = new int[220500];
      field11514 = new int[5];
      field11516 = new int[5];
      field11517 = new int[5];
      field11519 = new int[5];
      field11518 = new int[5];
   }
}
