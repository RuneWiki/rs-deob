import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class256 {
   @OriginalMember(
      owner = "client!st",
      name = "x",
      descriptor = "I"
   )
   public int field3875 = 500;
   @OriginalMember(
      owner = "client!st",
      name = "c",
      descriptor = "I"
   )
   public int field3878 = 0;
   @OriginalMember(
      owner = "client!st",
      name = "o",
      descriptor = "I"
   )
   private int field3874 = 100;
   @OriginalMember(
      owner = "client!st",
      name = "q",
      descriptor = "[I"
   )
   private int[] field3890 = new int[5];
   @OriginalMember(
      owner = "client!st",
      name = "l",
      descriptor = "[I"
   )
   private int[] field3889 = new int[5];
   @OriginalMember(
      owner = "client!st",
      name = "y",
      descriptor = "I"
   )
   private int field3876 = 0;
   @OriginalMember(
      owner = "client!st",
      name = "f",
      descriptor = "[I"
   )
   private int[] field3888 = new int[5];
   @OriginalMember(
      owner = "client!st",
      name = "h",
      descriptor = "[I"
   )
   private static int[] field3882 = new int[32768];
   @OriginalMember(
      owner = "client!st",
      name = "d",
      descriptor = "[I"
   )
   private static int[] field3881;
   @OriginalMember(
      owner = "client!st",
      name = "m",
      descriptor = "[I"
   )
   private static int[] field3884;
   @OriginalMember(
      owner = "client!st",
      name = "b",
      descriptor = "[I"
   )
   private static int[] field3885;
   @OriginalMember(
      owner = "client!st",
      name = "u",
      descriptor = "[I"
   )
   private static int[] field3895;
   @OriginalMember(
      owner = "client!st",
      name = "k",
      descriptor = "[I"
   )
   private static int[] field3892;
   @OriginalMember(
      owner = "client!st",
      name = "e",
      descriptor = "[I"
   )
   private static int[] field3893;
   @OriginalMember(
      owner = "client!st",
      name = "g",
      descriptor = "[I"
   )
   private static int[] field3894;
   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "Lct;"
   )
   private class493 field3877;
   @OriginalMember(
      owner = "client!st",
      name = "i",
      descriptor = "Ldc;"
   )
   private class601 field3879;
   @OriginalMember(
      owner = "client!st",
      name = "n",
      descriptor = "Ldc;"
   )
   private class601 field3880;
   @OriginalMember(
      owner = "client!st",
      name = "p",
      descriptor = "Ldc;"
   )
   private class601 field3883;
   @OriginalMember(
      owner = "client!st",
      name = "t",
      descriptor = "Ldc;"
   )
   private class601 field3886;
   @OriginalMember(
      owner = "client!st",
      name = "v",
      descriptor = "Ldc;"
   )
   private class601 field3887;
   @OriginalMember(
      owner = "client!st",
      name = "s",
      descriptor = "Ldc;"
   )
   private class601 field3891;
   @OriginalMember(
      owner = "client!st",
      name = "j",
      descriptor = "Ldc;"
   )
   private class601 field3896;
   @OriginalMember(
      owner = "client!st",
      name = "w",
      descriptor = "Ldc;"
   )
   private class601 field3897;
   @OriginalMember(
      owner = "client!st",
      name = "r",
      descriptor = "Ldc;"
   )
   private class601 field3898;

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method2180(int arg0, int arg1) {
      class474.method3642(field3884, 0, arg0);
      if (arg1 < 10) {
         return field3884;
      } else {
         double var3 = (double)arg0 / ((double)arg1 + 0.0D);
         this.field3898.method4430();
         this.field3891.method4430();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field3880 != null) {
            this.field3880.method4430();
            this.field3883.method4430();
            var5 = (int)((double)(this.field3880.field8569 - this.field3880.field8566) * 32.768D / var3);
            var6 = (int)((double)this.field3880.field8566 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field3887 != null) {
            this.field3887.method4430();
            this.field3879.method4430();
            var8 = (int)((double)(this.field3887.field8569 - this.field3887.field8566) * 32.768D / var3);
            var9 = (int)((double)this.field3887.field8566 * 32.768D / var3);
         }

         for(int var11 = 0; var11 < 5; ++var11) {
            if (this.field3888[var11] != 0) {
               field3893[var11] = 0;
               field3892[var11] = (int)((double)this.field3889[var11] * var3);
               field3885[var11] = (this.field3888[var11] << 14) / 100;
               field3895[var11] = (int)((double)(this.field3898.field8569 - this.field3898.field8566) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field3890[var11]) / var3);
               field3894[var11] = (int)((double)this.field3898.field8566 * 32.768D / var3);
            }
         }

         for(int var12 = 0; var12 < arg0; ++var12) {
            int var39 = this.field3898.method4431(arg0);
            int var40 = this.field3891.method4431(arg0);
            if (this.field3880 != null) {
               int var41 = this.field3880.method4431(arg0);
               int var42 = this.field3883.method4431(arg0);
               var39 += this.method2183(var7, var42, this.field3880.field8571) >> 1;
               var7 += (var5 * var41 >> 16) + var6;
            }

            if (this.field3887 != null) {
               int var43 = this.field3887.method4431(arg0);
               int var44 = this.field3879.method4431(arg0);
               var40 = var40 * ((this.method2183(var10, var44, this.field3887.field8571) >> 1) + 32768) >> 15;
               var10 += (var8 * var43 >> 16) + var9;
            }

            for(int var45 = 0; var45 < 5; ++var45) {
               if (this.field3888[var45] != 0) {
                  int var46 = field3892[var45] + var12;
                  if (var46 < arg0) {
                     field3884[var46] += this.method2183(field3893[var45], field3885[var45] * var40 >> 15, this.field3898.field8571);
                     field3893[var45] += (field3895[var45] * var39 >> 16) + field3894[var45];
                  }
               }
            }
         }

         if (this.field3886 != null) {
            this.field3886.method4430();
            this.field3896.method4430();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;

            for(int var16 = 0; var16 < arg0; ++var16) {
               int var17 = this.field3886.method4431(arg0);
               int var18 = this.field3896.method4431(arg0);
               int var19;
               if (var15) {
                  var19 = ((this.field3886.field8569 - this.field3886.field8566) * var17 >> 8) + this.field3886.field8566;
               } else {
                  var19 = ((this.field3886.field8569 - this.field3886.field8566) * var18 >> 8) + this.field3886.field8566;
               }

               var13 += 256;
               if (var13 >= var19) {
                  var13 = 0;
                  var15 = !var15;
               }

               if (var15) {
                  field3884[var16] = 0;
               }
            }
         }

         if (this.field3876 > 0 && this.field3874 > 0) {
            int var20 = (int)((double)this.field3876 * var3);

            for(int var21 = var20; var21 < arg0; ++var21) {
               field3884[var21] += field3884[var21 - var20] * this.field3874 / 100;
            }
         }

         if (this.field3877.field7036[0] > 0 || this.field3877.field7036[1] > 0) {
            this.field3897.method4430();
            int var22 = this.field3897.method4431(arg0 + 1);
            int var23 = this.field3877.method3749(0, (float)var22 / 65536.0F);
            int var24 = this.field3877.method3749(1, (float)var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
               int var25 = 0;
               int var26 = var24;
               if (var24 > arg0 - var23) {
                  var26 = arg0 - var23;
               }

               while(var25 < var26) {
                  int var35 = (int)((long)field3884[var23 + var25] * (long)class493.field7038 >> 16);

                  for(int var36 = 0; var36 < var23; ++var36) {
                     var35 += (int)((long)field3884[var23 + var25 - 1 - var36] * (long)class493.field7034[0][var36] >> 16);
                  }

                  for(int var37 = 0; var37 < var25; ++var37) {
                     var35 -= (int)((long)field3884[var25 - 1 - var37] * (long)class493.field7034[1][var37] >> 16);
                  }

                  field3884[var25] = var35;
                  var22 = this.field3897.method4431(arg0 + 1);
                  ++var25;
               }

               int var27 = 128;

               while(true) {
                  if (var27 > arg0 - var23) {
                     var27 = arg0 - var23;
                  }

                  while(var25 < var27) {
                     int var32 = (int)((long)field3884[var23 + var25] * (long)class493.field7038 >> 16);

                     for(int var33 = 0; var33 < var23; ++var33) {
                        var32 += (int)((long)field3884[var23 + var25 - 1 - var33] * (long)class493.field7034[0][var33] >> 16);
                     }

                     for(int var34 = 0; var34 < var24; ++var34) {
                        var32 -= (int)((long)field3884[var25 - 1 - var34] * (long)class493.field7034[1][var34] >> 16);
                     }

                     field3884[var25] = var32;
                     var22 = this.field3897.method4431(arg0 + 1);
                     ++var25;
                  }

                  if (var25 >= arg0 - var23) {
                     while(var25 < arg0) {
                        int var28 = 0;

                        for(int var29 = var23 + var25 - arg0; var29 < var23; ++var29) {
                           var28 += (int)((long)field3884[var23 + var25 - 1 - var29] * (long)class493.field7034[0][var29] >> 16);
                        }

                        for(int var30 = 0; var30 < var24; ++var30) {
                           var28 -= (int)((long)field3884[var25 - 1 - var30] * (long)class493.field7034[1][var30] >> 16);
                        }

                        field3884[var25] = var28;
                        this.field3897.method4431(arg0 + 1);
                        ++var25;
                     }
                     break;
                  }

                  var23 = this.field3877.method3749(0, (float)var22 / 65536.0F);
                  var24 = this.field3877.method3749(1, (float)var22 / 65536.0F);
                  var27 += 128;
               }
            }
         }

         for(int var38 = 0; var38 < arg0; ++var38) {
            if (field3884[var38] < -32768) {
               field3884[var38] = -32768;
            }

            if (field3884[var38] > 32767) {
               field3884[var38] = 32767;
            }
         }

         return field3884;
      }
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "()V"
   )
   public static void method2181() {
      field3884 = null;
      field3882 = null;
      field3881 = null;
      field3893 = null;
      field3892 = null;
      field3885 = null;
      field3895 = null;
      field3894 = null;
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(Lcu;)V"
   )
   public final void method2182(class65 arg0) {
      this.field3898 = new class601();
      this.field3898.method4432(arg0);
      this.field3891 = new class601();
      this.field3891.method4432(arg0);
      int var2 = arg0.method665(false);
      if (var2 != 0) {
         --arg0.field945;
         this.field3880 = new class601();
         this.field3880.method4432(arg0);
         this.field3883 = new class601();
         this.field3883.method4432(arg0);
      }

      int var3 = arg0.method665(false);
      if (var3 != 0) {
         --arg0.field945;
         this.field3887 = new class601();
         this.field3887.method4432(arg0);
         this.field3879 = new class601();
         this.field3879.method4432(arg0);
      }

      int var4 = arg0.method665(false);
      if (var4 != 0) {
         --arg0.field945;
         this.field3886 = new class601();
         this.field3886.method4432(arg0);
         this.field3896 = new class601();
         this.field3896.method4432(arg0);
      }

      for(int var5 = 0; var5 < 10; ++var5) {
         int var6 = arg0.method682(-117);
         if (var6 == 0) {
            break;
         }

         this.field3888[var5] = var6;
         this.field3890[var5] = arg0.method646((byte)111);
         this.field3889[var5] = arg0.method682(-124);
      }

      this.field3876 = arg0.method682(-72);
      this.field3874 = arg0.method682(-110);
      this.field3875 = arg0.method685(-2);
      this.field3878 = arg0.method685(-2);
      this.field3877 = new class493();
      this.field3897 = new class601();
      this.field3877.method3745(arg0, this.field3897);
   }

   @OriginalMember(
      owner = "client!st",
      name = "a",
      descriptor = "(III)I"
   )
   private final int method2183(int arg0, int arg1, int arg2) {
      if (arg2 == 1) {
         return (arg0 & 32767) < 16384 ? arg1 : -arg1;
      } else if (arg2 == 2) {
         return field3881[arg0 & 32767] * arg1 >> 14;
      } else if (arg2 == 3) {
         return ((arg0 & 32767) * arg1 >> 14) - arg1;
      } else {
         return arg2 == 4 ? field3882[arg0 / 2607 & 32767] * arg1 : 0;
      }
   }

   static {
      Random var0 = new Random(0L);

      for(int var1 = 0; var1 < 32768; ++var1) {
         field3882[var1] = (var0.nextInt() & 2) - 1;
      }

      field3881 = new int[32768];

      for(int var2 = 0; var2 < 32768; ++var2) {
         field3881[var2] = (int)(Math.sin((double)var2 / 5215.1903D) * 16384.0D);
      }

      field3884 = new int[220500];
      field3885 = new int[5];
      field3895 = new int[5];
      field3892 = new int[5];
      field3893 = new int[5];
      field3894 = new int[5];
   }
}
