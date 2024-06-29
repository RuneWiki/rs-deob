import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class531 {
   @OriginalMember(
      owner = "client!is",
      name = "r",
      descriptor = "I"
   )
   private int field7565 = 0;
   @OriginalMember(
      owner = "client!is",
      name = "g",
      descriptor = "[I"
   )
   private int[] field7561 = new int[5];
   @OriginalMember(
      owner = "client!is",
      name = "n",
      descriptor = "[I"
   )
   private int[] field7571 = new int[5];
   @OriginalMember(
      owner = "client!is",
      name = "i",
      descriptor = "I"
   )
   public int field7573 = 0;
   @OriginalMember(
      owner = "client!is",
      name = "m",
      descriptor = "I"
   )
   private int field7575 = 100;
   @OriginalMember(
      owner = "client!is",
      name = "t",
      descriptor = "[I"
   )
   private int[] field7578 = new int[5];
   @OriginalMember(
      owner = "client!is",
      name = "u",
      descriptor = "I"
   )
   public int field7563 = 500;
   @OriginalMember(
      owner = "client!is",
      name = "j",
      descriptor = "[I"
   )
   private static int[] field7574 = new int[32768];
   @OriginalMember(
      owner = "client!is",
      name = "s",
      descriptor = "[I"
   )
   private static int[] field7568;
   @OriginalMember(
      owner = "client!is",
      name = "q",
      descriptor = "[I"
   )
   private static int[] field7567;
   @OriginalMember(
      owner = "client!is",
      name = "v",
      descriptor = "[I"
   )
   private static int[] field7583;
   @OriginalMember(
      owner = "client!is",
      name = "d",
      descriptor = "[I"
   )
   private static int[] field7582;
   @OriginalMember(
      owner = "client!is",
      name = "l",
      descriptor = "[I"
   )
   private static int[] field7584;
   @OriginalMember(
      owner = "client!is",
      name = "f",
      descriptor = "[I"
   )
   private static int[] field7580;
   @OriginalMember(
      owner = "client!is",
      name = "c",
      descriptor = "[I"
   )
   private static int[] field7585;
   @OriginalMember(
      owner = "client!is",
      name = "k",
      descriptor = "Lhea;"
   )
   private class449 field7562;
   @OriginalMember(
      owner = "client!is",
      name = "h",
      descriptor = "Lhea;"
   )
   private class449 field7564;
   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "Lhea;"
   )
   private class449 field7566;
   @OriginalMember(
      owner = "client!is",
      name = "e",
      descriptor = "Lhea;"
   )
   private class449 field7569;
   @OriginalMember(
      owner = "client!is",
      name = "w",
      descriptor = "Lhea;"
   )
   private class449 field7570;
   @OriginalMember(
      owner = "client!is",
      name = "o",
      descriptor = "Lhea;"
   )
   private class449 field7572;
   @OriginalMember(
      owner = "client!is",
      name = "p",
      descriptor = "Lhea;"
   )
   private class449 field7577;
   @OriginalMember(
      owner = "client!is",
      name = "x",
      descriptor = "Lhea;"
   )
   private class449 field7579;
   @OriginalMember(
      owner = "client!is",
      name = "y",
      descriptor = "Lhea;"
   )
   private class449 field7581;
   @OriginalMember(
      owner = "client!is",
      name = "b",
      descriptor = "Lgr;"
   )
   private class462 field7576;

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "()V"
   )
   public static void method3828() {
      field7567 = null;
      field7574 = null;
      field7568 = null;
      field7583 = null;
      field7582 = null;
      field7584 = null;
      field7585 = null;
      field7580 = null;
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(III)I"
   )
   private final int method3829(int arg0, int arg1, int arg2) {
      if (arg2 == 1) {
         return (arg0 & 32767) < 16384 ? arg1 : -arg1;
      } else if (arg2 == 2) {
         return field7568[arg0 & 32767] * arg1 >> 14;
      } else if (arg2 == 3) {
         return ((arg0 & 32767) * arg1 >> 14) - arg1;
      } else {
         return arg2 == 4 ? field7574[arg0 / 2607 & 32767] * arg1 : 0;
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(Lwf;)V"
   )
   public final void method3830(class147 arg0) {
      this.field7577 = new class449();
      this.field7577.method3284(arg0);
      this.field7570 = new class449();
      this.field7570.method3284(arg0);
      int var2 = arg0.method1143(-15465);
      if (var2 != 0) {
         --arg0.field1856;
         this.field7581 = new class449();
         this.field7581.method3284(arg0);
         this.field7572 = new class449();
         this.field7572.method3284(arg0);
      }

      int var3 = arg0.method1143(-15465);
      if (var3 != 0) {
         --arg0.field1856;
         this.field7579 = new class449();
         this.field7579.method3284(arg0);
         this.field7562 = new class449();
         this.field7562.method3284(arg0);
      }

      int var4 = arg0.method1143(-15465);
      if (var4 != 0) {
         --arg0.field1856;
         this.field7566 = new class449();
         this.field7566.method3284(arg0);
         this.field7569 = new class449();
         this.field7569.method3284(arg0);
      }

      for(int var5 = 0; var5 < 10; ++var5) {
         int var6 = arg0.method1145((byte)84);
         if (var6 == 0) {
            break;
         }

         this.field7571[var5] = var6;
         this.field7561[var5] = arg0.method1147(-64);
         this.field7578[var5] = arg0.method1145((byte)59);
      }

      this.field7565 = arg0.method1145((byte)32);
      this.field7575 = arg0.method1145((byte)80);
      this.field7563 = arg0.method1211(-26166);
      this.field7573 = arg0.method1211(-26166);
      this.field7576 = new class462();
      this.field7564 = new class449();
      this.field7576.method3355(arg0, this.field7564);
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method3831(int arg0, int arg1) {
      class242.method1850(field7567, 0, arg0);
      if (arg1 < 10) {
         return field7567;
      } else {
         double var3 = (double)arg0 / ((double)arg1 + 0.0D);
         this.field7577.method3287();
         this.field7570.method3287();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field7581 != null) {
            this.field7581.method3287();
            this.field7572.method3287();
            var5 = (int)((double)(this.field7581.field6378 - this.field7581.field6375) * 32.768D / var3);
            var6 = (int)((double)this.field7581.field6375 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field7579 != null) {
            this.field7579.method3287();
            this.field7562.method3287();
            var8 = (int)((double)(this.field7579.field6378 - this.field7579.field6375) * 32.768D / var3);
            var9 = (int)((double)this.field7579.field6375 * 32.768D / var3);
         }

         for(int var11 = 0; var11 < 5; ++var11) {
            if (this.field7571[var11] != 0) {
               field7583[var11] = 0;
               field7582[var11] = (int)((double)this.field7578[var11] * var3);
               field7584[var11] = (this.field7571[var11] << 14) / 100;
               field7585[var11] = (int)((double)(this.field7577.field6378 - this.field7577.field6375) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field7561[var11]) / var3);
               field7580[var11] = (int)((double)this.field7577.field6375 * 32.768D / var3);
            }
         }

         for(int var12 = 0; var12 < arg0; ++var12) {
            int var39 = this.field7577.method3285(arg0);
            int var40 = this.field7570.method3285(arg0);
            if (this.field7581 != null) {
               int var41 = this.field7581.method3285(arg0);
               int var42 = this.field7572.method3285(arg0);
               var39 += this.method3829(var7, var42, this.field7581.field6379) >> 1;
               var7 += (var5 * var41 >> 16) + var6;
            }

            if (this.field7579 != null) {
               int var43 = this.field7579.method3285(arg0);
               int var44 = this.field7562.method3285(arg0);
               var40 = var40 * ((this.method3829(var10, var44, this.field7579.field6379) >> 1) + 32768) >> 15;
               var10 += (var8 * var43 >> 16) + var9;
            }

            for(int var45 = 0; var45 < 5; ++var45) {
               if (this.field7571[var45] != 0) {
                  int var46 = field7582[var45] + var12;
                  if (var46 < arg0) {
                     field7567[var46] += this.method3829(field7583[var45], field7584[var45] * var40 >> 15, this.field7577.field6379);
                     field7583[var45] += (field7585[var45] * var39 >> 16) + field7580[var45];
                  }
               }
            }
         }

         if (this.field7566 != null) {
            this.field7566.method3287();
            this.field7569.method3287();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;

            for(int var16 = 0; var16 < arg0; ++var16) {
               int var17 = this.field7566.method3285(arg0);
               int var18 = this.field7569.method3285(arg0);
               int var19;
               if (var15) {
                  var19 = ((this.field7566.field6378 - this.field7566.field6375) * var17 >> 8) + this.field7566.field6375;
               } else {
                  var19 = ((this.field7566.field6378 - this.field7566.field6375) * var18 >> 8) + this.field7566.field6375;
               }

               var13 += 256;
               if (var13 >= var19) {
                  var13 = 0;
                  var15 = !var15;
               }

               if (var15) {
                  field7567[var16] = 0;
               }
            }
         }

         if (this.field7565 > 0 && this.field7575 > 0) {
            int var20 = (int)((double)this.field7565 * var3);

            for(int var21 = var20; var21 < arg0; ++var21) {
               field7567[var21] += field7567[var21 - var20] * this.field7575 / 100;
            }
         }

         if (this.field7576.field6636[0] > 0 || this.field7576.field6636[1] > 0) {
            this.field7564.method3287();
            int var22 = this.field7564.method3285(arg0 + 1);
            int var23 = this.field7576.method3357(0, (float)var22 / 65536.0F);
            int var24 = this.field7576.method3357(1, (float)var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
               int var25 = 0;
               int var26 = var24;
               if (var24 > arg0 - var23) {
                  var26 = arg0 - var23;
               }

               while(var25 < var26) {
                  int var35 = (int)((long)field7567[var23 + var25] * (long)class462.field6640 >> 16);

                  for(int var36 = 0; var36 < var23; ++var36) {
                     var35 += (int)((long)field7567[var23 + var25 - 1 - var36] * (long)class462.field6643[0][var36] >> 16);
                  }

                  for(int var37 = 0; var37 < var25; ++var37) {
                     var35 -= (int)((long)field7567[var25 - 1 - var37] * (long)class462.field6643[1][var37] >> 16);
                  }

                  field7567[var25] = var35;
                  var22 = this.field7564.method3285(arg0 + 1);
                  ++var25;
               }

               int var27 = 128;

               while(true) {
                  if (var27 > arg0 - var23) {
                     var27 = arg0 - var23;
                  }

                  while(var25 < var27) {
                     int var32 = (int)((long)field7567[var23 + var25] * (long)class462.field6640 >> 16);

                     for(int var33 = 0; var33 < var23; ++var33) {
                        var32 += (int)((long)field7567[var23 + var25 - 1 - var33] * (long)class462.field6643[0][var33] >> 16);
                     }

                     for(int var34 = 0; var34 < var24; ++var34) {
                        var32 -= (int)((long)field7567[var25 - 1 - var34] * (long)class462.field6643[1][var34] >> 16);
                     }

                     field7567[var25] = var32;
                     var22 = this.field7564.method3285(arg0 + 1);
                     ++var25;
                  }

                  if (var25 >= arg0 - var23) {
                     while(var25 < arg0) {
                        int var28 = 0;

                        for(int var29 = var23 + var25 - arg0; var29 < var23; ++var29) {
                           var28 += (int)((long)field7567[var23 + var25 - 1 - var29] * (long)class462.field6643[0][var29] >> 16);
                        }

                        for(int var30 = 0; var30 < var24; ++var30) {
                           var28 -= (int)((long)field7567[var25 - 1 - var30] * (long)class462.field6643[1][var30] >> 16);
                        }

                        field7567[var25] = var28;
                        this.field7564.method3285(arg0 + 1);
                        ++var25;
                     }
                     break;
                  }

                  var23 = this.field7576.method3357(0, (float)var22 / 65536.0F);
                  var24 = this.field7576.method3357(1, (float)var22 / 65536.0F);
                  var27 += 128;
               }
            }
         }

         for(int var38 = 0; var38 < arg0; ++var38) {
            if (field7567[var38] < -32768) {
               field7567[var38] = -32768;
            }

            if (field7567[var38] > 32767) {
               field7567[var38] = 32767;
            }
         }

         return field7567;
      }
   }

   static {
      Random var0 = new Random(0L);

      for(int var1 = 0; var1 < 32768; ++var1) {
         field7574[var1] = (var0.nextInt() & 2) - 1;
      }

      field7568 = new int[32768];

      for(int var2 = 0; var2 < 32768; ++var2) {
         field7568[var2] = (int)(Math.sin((double)var2 / 5215.1903D) * 16384.0D);
      }

      field7567 = new int[220500];
      field7583 = new int[5];
      field7582 = new int[5];
      field7584 = new int[5];
      field7580 = new int[5];
      field7585 = new int[5];
   }
}
