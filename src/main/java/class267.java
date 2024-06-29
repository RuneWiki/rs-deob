import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class267 {
   @OriginalMember(
      owner = "client!ok",
      name = "d",
      descriptor = "I"
   )
   public int field3465;
   @OriginalMember(
      owner = "client!ok",
      name = "f",
      descriptor = "I"
   )
   public int field3466;
   @OriginalMember(
      owner = "client!ok",
      name = "b",
      descriptor = "I"
   )
   public int field3467;
   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "I"
   )
   public int field3469;
   @OriginalMember(
      owner = "client!ok",
      name = "e",
      descriptor = "I"
   )
   public int field3470;
   @OriginalMember(
      owner = "client!ok",
      name = "g",
      descriptor = "I"
   )
   public int field3471;
   @OriginalMember(
      owner = "client!ok",
      name = "h",
      descriptor = "[B"
   )
   public byte[] field3464;
   @OriginalMember(
      owner = "client!ok",
      name = "i",
      descriptor = "[B"
   )
   public byte[] field3472;
   @OriginalMember(
      owner = "client!ok",
      name = "c",
      descriptor = "[I"
   )
   public int[] field3468;

   @OriginalMember(
      owner = "client!ok",
      name = "g",
      descriptor = "()I"
   )
   public final int method2042() {
      return this.field3469 + this.field3466 + this.field3470;
   }

   @OriginalMember(
      owner = "client!ok",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method2043(int arg0) {
      int var2 = this.method2047();
      int var3 = this.method2042();
      if (this.field3467 != var2 || this.field3469 != var3) {
         int var4 = arg0;
         if (arg0 > this.field3465) {
            var4 = this.field3465;
         }

         int var5 = arg0;
         if (this.field3465 + arg0 + this.field3467 > var2) {
            var5 = var2 - this.field3465 - this.field3467;
         }

         int var6 = arg0;
         if (arg0 > this.field3466) {
            var6 = this.field3466;
         }

         int var7 = arg0;
         if (this.field3466 + arg0 + this.field3469 > var3) {
            var7 = var3 - this.field3466 - this.field3469;
         }

         int var8 = this.field3467 + var4 + var5;
         int var9 = this.field3469 + var6 + var7;
         byte[] var10 = new byte[var8 * var9];
         if (this.field3464 == null) {
            for(int var11 = 0; var11 < this.field3469; ++var11) {
               int var12 = this.field3467 * var11;
               int var13 = (var6 + var11) * var8 + var4;

               for(int var14 = 0; var14 < this.field3467; ++var14) {
                  var10[var13++] = this.field3472[var12++];
               }
            }
         } else {
            byte[] var15 = new byte[var8 * var9];

            for(int var16 = 0; var16 < this.field3469; ++var16) {
               int var17 = this.field3467 * var16;
               int var18 = (var6 + var16) * var8 + var4;

               for(int var19 = 0; var19 < this.field3467; ++var19) {
                  var15[var18] = this.field3464[var17];
                  var10[var18++] = this.field3472[var17++];
               }
            }

            this.field3464 = var15;
         }

         this.field3465 -= var4;
         this.field3466 -= var6;
         this.field3471 -= var5;
         this.field3470 -= var7;
         this.field3467 = var8;
         this.field3469 = var9;
         this.field3472 = var10;
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2044(int arg0) {
      int var2 = -1;
      if (this.field3468.length < 255) {
         for(int var3 = 0; var3 < this.field3468.length; ++var3) {
            if (this.field3468[var3] == arg0) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field3468.length;
            int[] var4 = new int[this.field3468.length + 1];
            class714.method5199(this.field3468, 0, var4, 0, this.field3468.length);
            this.field3468 = var4;
            var4[var2] = arg0;
         }
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = arg0 >> 16 & 255;
         int var7 = arg0 >> 8 & 255;
         int var8 = arg0 & 255;

         for(int var9 = 0; var9 < this.field3468.length; ++var9) {
            int var15 = this.field3468[var9];
            int var16 = var15 >> 16 & 255;
            int var17 = var15 >> 8 & 255;
            int var18 = var15 & 255;
            int var19 = var6 - var16;
            if (var19 < 0) {
               var19 = -var19;
            }

            int var20 = var7 - var17;
            if (var20 < 0) {
               var20 = -var20;
            }

            int var21 = var8 - var18;
            if (var21 < 0) {
               var21 = -var21;
            }

            int var22 = var19 + var20 + var21;
            if (var22 < var5) {
               var5 = var22;
               var2 = var9;
            }
         }
      }

      int var10 = 0;
      byte[] var11 = new byte[this.field3469 * this.field3467];

      for(int var12 = 0; var12 < this.field3469; ++var12) {
         for(int var13 = 0; var13 < this.field3467; ++var13) {
            int var14 = this.field3472[var10] & 255;
            if (this.field3468[var14] == 0) {
               if (var13 > 0 && this.field3468[this.field3472[var10 - 1] & 255] != 0) {
                  var14 = var2;
               } else if (var12 > 0 && this.field3468[this.field3472[var10 - this.field3467] & 255] != 0) {
                  var14 = var2;
               } else if (var13 < this.field3467 - 1 && this.field3468[this.field3472[var10 + 1] & 255] != 0) {
                  var14 = var2;
               } else if (var12 < this.field3469 - 1 && this.field3468[this.field3472[this.field3467 + var10] & 255] != 0) {
                  var14 = var2;
               }
            }

            var11[var10++] = (byte)var14;
         }
      }

      this.field3472 = var11;
   }

   @OriginalMember(
      owner = "client!ok",
      name = "f",
      descriptor = "()V"
   )
   public final void method2045() {
      byte[] var1 = this.field3472;
      if (this.field3464 == null) {
         for(int var2 = this.field3469 - 1; var2 >= 0; --var2) {
            int var3 = this.field3467 * var2;
            int var4 = (var2 + 1) * this.field3467;

            while(var3 < var4) {
               --var4;
               byte var5 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var5;
               ++var3;
            }
         }
      } else {
         byte[] var6 = this.field3464;

         for(int var7 = this.field3469 - 1; var7 >= 0; --var7) {
            int var9 = this.field3467 * var7;
            int var10 = (var7 + 1) * this.field3467;

            while(var9 < var10) {
               --var10;
               byte var11 = var1[var9];
               var1[var9] = var1[var10];
               var1[var10] = var11;
               byte var12 = var6[var9];
               var6[var9] = var6[var10];
               var6[var10] = var12;
               ++var9;
            }
         }
      }

      int var8 = this.field3465;
      this.field3465 = this.field3471;
      this.field3471 = var8;
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(Lqh;I)[Lok;"
   )
   public static final class267[] method2046(class74 arg0, int arg1) {
      byte[] var2 = arg0.method733(arg1, (byte)-71);
      return var2 == null ? null : method2056(var2);
   }

   @OriginalMember(
      owner = "client!ok",
      name = "d",
      descriptor = "()I"
   )
   public final int method2047() {
      return this.field3467 + this.field3465 + this.field3471;
   }

   @OriginalMember(
      owner = "client!ok",
      name = "b",
      descriptor = "(Lqh;I)Lok;"
   )
   public static final class267 method2048(class74 arg0, int arg1) {
      byte[] var2 = arg0.method733(arg1, (byte)-71);
      return var2 == null ? null : method2056(var2)[0];
   }

   @OriginalMember(
      owner = "client!ok",
      name = "e",
      descriptor = "()V"
   )
   public final void method2049() {
      int var1 = this.method2047();
      int var2 = this.method2042();
      if (this.field3467 != var1 || this.field3469 != var2) {
         byte[] var3 = new byte[var1 * var2];
         if (this.field3464 != null) {
            byte[] var4 = new byte[var1 * var2];

            for(int var5 = 0; var5 < this.field3469; ++var5) {
               int var6 = this.field3467 * var5;
               int var7 = (this.field3466 + var5) * var1 + this.field3465;

               for(int var8 = 0; var8 < this.field3467; ++var8) {
                  var3[var7] = this.field3472[var6];
                  var4[var7++] = this.field3464[var6++];
               }
            }

            this.field3464 = var4;
         } else {
            for(int var9 = 0; var9 < this.field3469; ++var9) {
               int var10 = this.field3467 * var9;
               int var11 = (this.field3466 + var9) * var1 + this.field3465;

               for(int var12 = 0; var12 < this.field3467; ++var12) {
                  var3[var11++] = this.field3472[var10++];
               }
            }
         }

         this.field3465 = this.field3471 = this.field3466 = this.field3470 = 0;
         this.field3467 = var1;
         this.field3469 = var2;
         this.field3472 = var3;
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "b",
      descriptor = "(Lqh;II)Lok;"
   )
   public static final class267 method2050(class74 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method732(arg2, arg1, (byte)78);
      return var3 == null ? null : method2056(var3)[0];
   }

   @OriginalMember(
      owner = "client!ok",
      name = "b",
      descriptor = "()V"
   )
   public final void method2051() {
      byte[] var1 = this.field3472;
      if (this.field3464 == null) {
         for(int var2 = (this.field3469 >> 1) - 1; var2 >= 0; --var2) {
            int var3 = this.field3467 * var2;
            int var4 = (this.field3469 - var2 - 1) * this.field3467;

            for(int var5 = -this.field3467; var5 < 0; ++var5) {
               byte var6 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var6;
               ++var3;
               ++var4;
            }
         }
      } else {
         byte[] var7 = this.field3464;

         for(int var8 = (this.field3469 >> 1) - 1; var8 >= 0; --var8) {
            int var10 = this.field3467 * var8;
            int var11 = (this.field3469 - var8 - 1) * this.field3467;

            for(int var12 = -this.field3467; var12 < 0; ++var12) {
               byte var13 = var1[var10];
               var1[var10] = var1[var11];
               var1[var11] = var13;
               byte var14 = var7[var10];
               var7[var10] = var7[var11];
               var7[var11] = var14;
               ++var10;
               ++var11;
            }
         }
      }

      int var9 = this.field3466;
      this.field3466 = this.field3470;
      this.field3470 = var9;
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "()V"
   )
   public final void method2052() {
      byte[] var1 = new byte[this.field3469 * this.field3467];
      int var2 = 0;
      if (this.field3464 == null) {
         for(int var3 = 0; var3 < this.field3467; ++var3) {
            for(int var4 = this.field3469 - 1; var4 >= 0; --var4) {
               var1[var2++] = this.field3472[this.field3467 * var4 + var3];
            }
         }

         this.field3472 = var1;
      } else {
         byte[] var5 = new byte[this.field3469 * this.field3467];

         for(int var6 = 0; var6 < this.field3467; ++var6) {
            for(int var9 = this.field3469 - 1; var9 >= 0; --var9) {
               var1[var2] = this.field3472[this.field3467 * var9 + var6];
               var5[var2++] = this.field3464[this.field3467 * var9 + var6];
            }
         }

         this.field3472 = var1;
         this.field3464 = var5;
      }

      int var7 = this.field3466;
      this.field3466 = this.field3465;
      this.field3465 = this.field3470;
      this.field3470 = this.field3471;
      this.field3471 = this.field3466;
      int var8 = this.field3469;
      this.field3469 = this.field3467;
      this.field3467 = var8;
   }

   @OriginalMember(
      owner = "client!ok",
      name = "c",
      descriptor = "()[I"
   )
   public final int[] method2053() {
      int var1 = this.method2047();
      int[] var2 = new int[var1 * this.method2042()];
      if (this.field3464 != null) {
         for(int var3 = 0; var3 < this.field3469; ++var3) {
            int var4 = this.field3467 * var3;
            int var5 = (this.field3466 + var3) * var1 + this.field3465;

            for(int var6 = 0; var6 < this.field3467; ++var6) {
               var2[var5++] = this.field3464[var4] << 24 | this.field3468[this.field3472[var4] & 255];
               ++var4;
            }
         }
      } else {
         for(int var7 = 0; var7 < this.field3469; ++var7) {
            int var8 = this.field3467 * var7;
            int var9 = (this.field3466 + var7) * var1 + this.field3465;

            for(int var10 = 0; var10 < this.field3467; ++var10) {
               int var11 = this.field3468[this.field3472[var8++] & 255];
               if (var11 != 0) {
                  var2[var9++] = -16777216 | var11;
               } else {
                  var2[var9++] = 0;
               }
            }
         }
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!ok",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2054(int arg0) {
      int var2 = -1;
      if (this.field3468.length < 255) {
         for(int var3 = 0; var3 < this.field3468.length; ++var3) {
            if (this.field3468[var3] == arg0) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field3468.length;
            int[] var4 = new int[this.field3468.length + 1];
            class714.method5199(this.field3468, 0, var4, 0, this.field3468.length);
            this.field3468 = var4;
            var4[var2] = arg0;
         }
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = arg0 >> 16 & 255;
         int var7 = arg0 >> 8 & 255;
         int var8 = arg0 & 255;

         for(int var9 = 0; var9 < this.field3468.length; ++var9) {
            int var13 = this.field3468[var9];
            int var14 = var13 >> 16 & 255;
            int var15 = var13 >> 8 & 255;
            int var16 = var13 & 255;
            int var17 = var6 - var14;
            if (var17 < 0) {
               var17 = -var17;
            }

            int var18 = var7 - var15;
            if (var18 < 0) {
               var18 = -var18;
            }

            int var19 = var8 - var16;
            if (var19 < 0) {
               var19 = -var19;
            }

            int var20 = var17 + var18 + var19;
            if (var20 < var5) {
               var5 = var20;
               var2 = var9;
            }
         }
      }

      for(int var10 = this.field3469 - 1; var10 > 0; --var10) {
         int var11 = this.field3467 * var10;

         for(int var12 = this.field3467 - 1; var12 > 0; --var12) {
            if (this.field3468[this.field3472[var11 + var12] & 255] == 0 && this.field3468[this.field3472[var11 + var12 - 1 - this.field3467] & 255] != 0) {
               this.field3472[var11 + var12] = (byte)var2;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(Lqh;II)[Lok;"
   )
   public static final class267[] method2055(class74 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method732(arg2, arg1, (byte)89);
      return var3 == null ? null : method2056(var3);
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "([B)[Lok;"
   )
   private static final class267[] method2056(byte[] arg0) {
      class594 var1 = new class594(arg0);
      var1.field8243 = arg0.length - 2;
      int var2 = var1.method4280(-19104);
      class267[] var3 = new class267[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = new class267();
      }

      var1.field8243 = arg0.length - 7 - var2 * 8;
      int var5 = var1.method4280(-19104);
      int var6 = var1.method4280(-19104);
      int var7 = (var1.method4288((byte)91) & 255) + 1;

      for(int var8 = 0; var8 < var2; ++var8) {
         var3[var8].field3465 = var1.method4280(-19104);
      }

      for(int var9 = 0; var9 < var2; ++var9) {
         var3[var9].field3466 = var1.method4280(-19104);
      }

      for(int var10 = 0; var10 < var2; ++var10) {
         var3[var10].field3467 = var1.method4280(-19104);
      }

      for(int var11 = 0; var11 < var2; ++var11) {
         var3[var11].field3469 = var1.method4280(-19104);
      }

      for(int var12 = 0; var12 < var2; ++var12) {
         class267 var32 = var3[var12];
         var32.field3471 = var5 - var32.field3467 - var32.field3465;
         var32.field3470 = var6 - var32.field3469 - var32.field3466;
      }

      var1.field8243 = arg0.length - 7 - var2 * 8 - (var7 - 1) * 3;
      int[] var13 = new int[var7];

      for(int var14 = 1; var14 < var7; ++var14) {
         var13[var14] = var1.method4293(113);
         if (var13[var14] == 0) {
            var13[var14] = 1;
         }
      }

      for(int var15 = 0; var15 < var2; ++var15) {
         var3[var15].field3468 = var13;
      }

      var1.field8243 = 0;

      for(int var16 = 0; var16 < var2; ++var16) {
         class267 var17 = var3[var16];
         int var18 = var17.field3469 * var17.field3467;
         var17.field3472 = new byte[var18];
         int var19 = var1.method4288((byte)102);
         if ((var19 & 2) == 0) {
            if ((var19 & 1) == 0) {
               for(int var20 = 0; var20 < var18; ++var20) {
                  var17.field3472[var20] = var1.method4340(409855200);
               }
            } else {
               for(int var21 = 0; var21 < var17.field3467; ++var21) {
                  for(int var22 = 0; var22 < var17.field3469; ++var22) {
                     var17.field3472[var17.field3467 * var22 + var21] = var1.method4340(409855200);
                  }
               }
            }
         } else {
            boolean var23 = false;
            var17.field3464 = new byte[var18];
            if ((var19 & 1) == 0) {
               for(int var24 = 0; var24 < var18; ++var24) {
                  var17.field3472[var24] = var1.method4340(409855200);
               }

               for(int var25 = 0; var25 < var18; ++var25) {
                  byte var26 = var17.field3464[var25] = var1.method4340(409855200);
                  var23 |= var26 != -1;
               }
            } else {
               for(int var27 = 0; var27 < var17.field3467; ++var27) {
                  for(int var31 = 0; var31 < var17.field3469; ++var31) {
                     var17.field3472[var17.field3467 * var31 + var27] = var1.method4340(409855200);
                  }
               }

               for(int var28 = 0; var28 < var17.field3467; ++var28) {
                  for(int var29 = 0; var29 < var17.field3469; ++var29) {
                     byte var30 = var17.field3464[var17.field3467 * var29 + var28] = var1.method4340(409855200);
                     var23 |= var30 != -1;
                  }
               }
            }

            if (!var23) {
               var17.field3464 = null;
            }
         }
      }

      return var3;
   }
}
