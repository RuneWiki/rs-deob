import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class525 {
   @OriginalMember(
      owner = "client!cm",
      name = "j",
      descriptor = "Ldaa;"
   )
   private class226 field7439;
   @OriginalMember(
      owner = "client!cm",
      name = "r",
      descriptor = "Lpj;"
   )
   private class423 field7437;
   @OriginalMember(
      owner = "client!cm",
      name = "i",
      descriptor = "I"
   )
   public int field7432;
   @OriginalMember(
      owner = "client!cm",
      name = "k",
      descriptor = "I"
   )
   private int field7423;
   @OriginalMember(
      owner = "client!cm",
      name = "c",
      descriptor = "[B"
   )
   public byte[] field7422;
   @OriginalMember(
      owner = "client!cm",
      name = "o",
      descriptor = "I"
   )
   private int field7434;
   @OriginalMember(
      owner = "client!cm",
      name = "l",
      descriptor = "I"
   )
   private int field7438;
   @OriginalMember(
      owner = "client!cm",
      name = "d",
      descriptor = "I"
   )
   private int field7431;
   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7441 = new String[]{method3941(method3940("g \u0000b")), method3941(method3940("r{B F")), method3941(method3940("j8BM\u0013")), method3941(method3940("j8BG\u0013")), method3941(method3940("j8BJ\u0013")), method3941(method3940("j8BH\u0013")), method3941(method3940("j8BI\u0013")), method3941(method3940("j8BK\u0013")), method3941(method3940("j8BL\u0013")), method3941(method3940("j8BD\u0013")), method3941(method3940("j8BF\u0013")), method3941(method3940("j8B2Rg<\u00180\u0013")), method3941(method3940("j8BO\u0013"))};
   @OriginalMember(
      owner = "client!cm",
      name = "b",
      descriptor = "I"
   )
   public static int field7421 = 0;
   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "I"
   )
   public static int field7424;
   @OriginalMember(
      owner = "client!cm",
      name = "s",
      descriptor = "I"
   )
   public static int field7425;
   @OriginalMember(
      owner = "client!cm",
      name = "f",
      descriptor = "I"
   )
   public static int field7426;
   @OriginalMember(
      owner = "client!cm",
      name = "m",
      descriptor = "I"
   )
   public static int field7427;
   @OriginalMember(
      owner = "client!cm",
      name = "p",
      descriptor = "I"
   )
   public static int field7429;
   @OriginalMember(
      owner = "client!cm",
      name = "h",
      descriptor = "I"
   )
   public static int field7430;
   @OriginalMember(
      owner = "client!cm",
      name = "t",
      descriptor = "I"
   )
   public static int field7433;
   @OriginalMember(
      owner = "client!cm",
      name = "g",
      descriptor = "I"
   )
   public static int field7435;
   @OriginalMember(
      owner = "client!cm",
      name = "n",
      descriptor = "I"
   )
   public static int field7436;
   @OriginalMember(
      owner = "client!cm",
      name = "q",
      descriptor = "I"
   )
   public static int field7440;
   @OriginalMember(
      owner = "client!cm",
      name = "e",
      descriptor = "[[Lq;"
   )
   private class235[][] field7428;

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3930(byte arg0) {
      boolean var2 = client.field10022;

      try {
         ++field7426;
         this.field7428 = new class235[this.field7438][this.field7431];
         int var3 = 0;
         if (arg0 != -74) {
            this.method3932((class412)null, -81, 71, -44);
            if (!var2 && this.field7431 <= var3) {
               return;
            }
         } else if (this.field7431 <= var3) {
            return;
         }

         do {
            int var4 = 0;
            if (var2) {
               this.field7428[var4][var3] = new class235(this.field7439, this, this.field7437, var4, var3, this.field7434, var4 * 128 + 1, var3 * 128 + 1);
               if (this.field7428[var4][var3].field3628 == 0) {
                  this.field7428[var4][var3] = null;
               }

               ++var4;
            }

            while(true) {
               while(~var4 > ~this.field7438) {
                  this.field7428[var4][var3] = new class235(this.field7439, this, this.field7437, var4, var3, this.field7434, var4 * 128 + 1, var3 * 128 + 1);
                  if (this.field7428[var4][var3].field3628 == 0) {
                     this.field7428[var4][var3] = null;
                  }

                  ++var4;
               }

               if (!var2) {
                  ++var3;
                  break;
               }

               if (this.field7428[var4][var3].field3628 == 0) {
                  this.field7428[var4][var3] = null;
               }

               ++var4;
            }
         } while(this.field7431 > var3);

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7441[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(IILr;I)V"
   )
   public final void method3931(int arg0, int arg1, class412 arg2, int arg3) {
      try {
         ++field7429;
         class484 var5 = (class484)arg2;
         arg0 += var5.field6928 + 1;
         arg1 += var5.field6934 + 1;
         int var6 = this.field7432 * arg0 + arg1;
         int var7 = arg3;
         int var8 = var5.field6937;
         int var9 = var5.field6931;
         int var10 = this.field7432 - var9;
         if (~arg0 >= -1) {
            int var11 = 1 - arg0;
            arg0 = 1;
            var7 = var9 * var11 + arg3;
            var8 -= var11;
            var6 += this.field7432 * var11;
         }

         int var12 = 0;
         if (this.field7423 <= arg0 + var8) {
            int var13 = arg0 + 1 - -var8 - this.field7423;
            var8 -= var13;
         }

         if (arg1 <= 0) {
            int var14 = -arg1 + 1;
            var10 += var14;
            arg1 = 1;
            var7 += var14;
            var12 += var14;
            var9 -= var14;
            var6 += var14;
         }

         if (~(arg1 - -var9) <= ~this.field7432) {
            int var15 = arg1 + 1 + -this.field7432 - -var9;
            var9 -= var15;
            var12 += var15;
            var10 += var15;
         }

         if (~var9 < -1 && var8 > 0) {
            class425.method3316(var9, this.field7422, var10, var8, var5.field6935, arg3 + 1369181506, var7, var12, var6);
            this.method3939(arg0, var8, var9, (byte)119, arg1);
         }
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field7441[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7441[1] : field7441[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(Lr;III)V"
   )
   public final void method3932(class412 arg0, int arg1, int arg2, int arg3) {
      try {
         ++field7424;
         class484 var5 = (class484)arg0;
         arg1 += var5.field6928 + 1;
         arg2 += var5.field6934 + 1;
         if (arg3 == -2) {
            int var6 = this.field7432 * arg1 + arg2;
            int var7 = 0;
            int var8 = var5.field6937;
            int var9 = var5.field6931;
            int var10 = this.field7432 - var9;
            int var11 = 0;
            if (arg1 <= 0) {
               int var12 = 1 - arg1;
               arg1 = 1;
               var6 += this.field7432 * var12;
               var8 -= var12;
               var7 += var9 * var12;
            }

            if (this.field7423 <= arg1 + var8) {
               int var13 = arg1 + var8 - (this.field7423 + -1);
               var8 -= var13;
            }

            if (~arg2 >= -1) {
               int var14 = -arg2 + 1;
               arg2 = 1;
               var10 += var14;
               var6 += var14;
               var7 += var14;
               var9 -= var14;
               var11 += var14;
            }

            if (arg2 + var9 >= this.field7432) {
               int var15 = arg2 + var9 - -1 + -this.field7432;
               var10 += var15;
               var11 += var15;
               var9 -= var15;
            }

            if (var9 > 0 && var8 > 0) {
               class586.method4303(var7, var10, var8, var5.field6935, var11, var9, var6, (byte)-83, this.field7422);
               this.method3939(arg1, var8, var9, (byte)112, arg2);
            }
         }
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field7441[2] + (arg0 != null ? field7441[1] : field7441[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "([I[Ljava/lang/Object;III)V"
   )
   public static final void method3933(int[] arg0, Object[] arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field10022;

      try {
         ++field7427;
         if (~arg4 > ~arg2) {
            int var6 = (arg4 - -arg2) / 2;
            int var7 = arg4;
            int var8 = arg0[var6];
            arg0[var6] = arg0[arg2];
            arg0[arg2] = var8;
            Object var9 = arg1[var6];
            arg1[var6] = arg1[arg2];
            arg1[arg2] = var9;
            int var10 = ~var8 == Integer.MIN_VALUE ? 0 : 1;
            int var11 = arg4;
            int var12;
            Object var13;
            if (var5) {
               if ((arg4 & var10) + var8 > arg0[arg4]) {
                  var12 = arg0[arg4];
                  arg0[arg4] = arg0[arg4];
                  arg0[arg4] = var12;
                  var13 = arg1[arg4];
                  arg1[arg4] = arg1[arg4];
                  var7 = arg4 + 1;
                  arg1[arg4] = var13;
                  var11 = arg4 + 1;
               } else {
                  var11 = arg4 + 1;
               }
            }

            while(true) {
               while(~arg2 < ~var11) {
                  if ((var11 & var10) + var8 > arg0[var11]) {
                     var12 = arg0[var11];
                     arg0[var11] = arg0[var7];
                     arg0[var7] = var12;
                     var13 = arg1[var11];
                     arg1[var11] = arg1[var7];
                     arg1[var7++] = var13;
                     ++var11;
                  } else {
                     ++var11;
                  }
               }

               arg0[arg2] = arg0[var7];
               arg0[var7] = var8;
               arg1[arg2] = arg1[var7];
               arg1[var7] = var9;
               method3933(arg0, arg1, var7 + -1, 14845, arg4);
               if (!var5) {
                  method3933(arg0, arg1, arg2, 14845, var7 + 1);
                  break;
               }

               var12 = arg0[var11];
               arg0[var11] = arg0[var7];
               arg0[var7] = var12;
               var13 = arg1[var11];
               arg1[var11] = arg1[var7];
               arg1[var7++] = var13;
               ++var11;
            }
         }

         if (arg3 != 14845) {
            method3937(40);
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field7441[9] + (arg0 != null ? field7441[1] : field7441[0]) + ',' + (arg1 != null ? field7441[1] : field7441[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(IZILr;)Z"
   )
   public final boolean method3934(int arg0, boolean arg1, int arg2, class412 arg3) {
      try {
         ++field7435;
         class484 var5 = (class484)arg3;
         arg0 += var5.field6928 + 1;
         arg2 += var5.field6934 - -1;
         int var6 = this.field7432 * arg0 + arg2;
         int var7 = var5.field6937;
         if (!arg1) {
            this.method3932((class412)null, 41, -125, 54);
         }

         int var8 = var5.field6931;
         int var9 = this.field7432 - var8;
         if (arg0 <= 0) {
            int var10 = 1 - arg0;
            arg0 = 1;
            var7 -= var10;
            var6 += this.field7432 * var10;
         }

         if (~(arg0 + var7) <= ~this.field7423) {
            int var11 = -this.field7423 + arg0 - (-var7 - 1);
            var7 -= var11;
         }

         if (arg2 <= 0) {
            int var12 = -arg2 + 1;
            var6 += var12;
            var9 += var12;
            var8 -= var12;
            arg2 = 1;
         }

         if (arg2 - -var8 >= this.field7432) {
            int var13 = arg2 - (-var8 - 1) + -this.field7432;
            var9 += var13;
            var8 -= var13;
         }

         if (~var8 < -1 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 + -1) * this.field7432 + var9;
            return class496.method3765(var6, var7, var8, var14, (byte)122, this.field7422, var15);
         } else {
            return false;
         }
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field7441[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7441[1] : field7441[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "([[ZIIZBI)V"
   )
   public final void method3935(boolean[][] param1, int param2, int param3, boolean param4, byte param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(ZI)I"
   )
   public static final int method3936(boolean arg0, int arg1) {
      try {
         ++field7433;
         int var2 = arg1 & 63;
         int var3 = (232 & arg1) >> 6;
         if (var2 != 18) {
            if (var2 == 19 || ~var2 == -22) {
               if (~var3 == -1) {
                  return 16;
               }

               if (var3 == 1) {
                  return 32;
               }

               if (var3 == 2) {
                  return 64;
               }

               if (var3 == 3) {
                  return 128;
               }
            }
         } else {
            if (var3 == 0) {
               return 1;
            }

            if (~var3 == -2) {
               return 2;
            }

            if (var3 == 2) {
               return 4;
            }

            if (var3 == 3) {
               return 8;
            }
         }

         if (!arg0) {
            method3937(-78);
         }

         return 0;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7441[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(I)[Lkia;"
   )
   public static final class788[] method3937(int arg0) {
      try {
         if (arg0 != -16948) {
            return null;
         } else {
            ++field7425;
            return new class788[]{class765.field10969, class765.field10971, class765.field10972, class765.field10973, class765.field10974, class765.field10975, class765.field10976, class765.field10977, class765.field10978, class765.field10979, class765.field10980, class765.field10981, class765.field10982};
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7441[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(IIBIII)V"
   )
   public static final void method3938(int param0, int param1, byte param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(IIIBI)V"
   )
   private final void method3939(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      boolean var6 = client.field10022;

      try {
         ++field7440;
         if (arg3 < 84) {
            this.field7422 = null;
         }

         if (this.field7428 != null) {
            int var7 = arg4 + -1 >> 7;
            int var8 = arg2 + -1 + arg4 + -1 >> 7;
            int var9 = arg0 + -1 >> 7;
            int var10 = arg0 + -2 - -arg1 >> 7;
            int var11 = var7;
            if (var6 || var8 >= var7) {
               do {
                  class235[] var12 = this.field7428[var11];
                  int var13 = var9;
                  if (var6) {
                     if (var12[var9] != null) {
                        var12[var9].field3648 = true;
                     }

                     var13 = var9 + 1;
                  }

                  while(true) {
                     while(~var13 >= ~var10) {
                        if (var12[var13] != null) {
                           var12[var13].field3648 = true;
                        }

                        ++var13;
                     }

                     if (!var6) {
                        ++var11;
                        break;
                     }

                     ++var13;
                  }
               } while(var8 >= var11);

            }
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field7441[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "<init>",
      descriptor = "(Ldaa;Lpj;)V"
   )
   public class525(class226 arg0, class423 arg1) {
      try {
         this.field7439 = arg0;
         this.field7437 = arg1;
         this.field7432 = (this.field7437.field10672 * this.field7437.field10665 >> this.field7439.field3441) + 2;
         this.field7423 = (this.field7437.field10672 * this.field7437.field10666 >> this.field7439.field3441) + 2;
         this.field7422 = new byte[this.field7432 * this.field7423];
         this.field7434 = -this.field7437.field10671 + 7 - -this.field7439.field3441;
         this.field7438 = this.field7437.field10665 >> this.field7434;
         this.field7431 = this.field7437.field10666 >> this.field7434;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7441[11] + (arg0 != null ? field7441[1] : field7441[0]) + ',' + (arg1 != null ? field7441[1] : field7441[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3940(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3941(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
