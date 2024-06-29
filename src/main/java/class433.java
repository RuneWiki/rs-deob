import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class433 {
   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "I"
   )
   public int field6353;
   @OriginalMember(
      owner = "client!iaa",
      name = "b",
      descriptor = "I"
   )
   public int field6355;
   @OriginalMember(
      owner = "client!iaa",
      name = "c",
      descriptor = "I"
   )
   public int field6358;
   @OriginalMember(
      owner = "client!iaa",
      name = "g",
      descriptor = "I"
   )
   public int field6359;
   @OriginalMember(
      owner = "client!iaa",
      name = "i",
      descriptor = "I"
   )
   public int field6360;
   @OriginalMember(
      owner = "client!iaa",
      name = "h",
      descriptor = "I"
   )
   public int field6361;
   @OriginalMember(
      owner = "client!iaa",
      name = "f",
      descriptor = "[B"
   )
   public byte[] field6354;
   @OriginalMember(
      owner = "client!iaa",
      name = "d",
      descriptor = "[B"
   )
   public byte[] field6356;
   @OriginalMember(
      owner = "client!iaa",
      name = "e",
      descriptor = "[I"
   )
   public int[] field6357;

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "(Lsa;I)Liaa;"
   )
   public static final class433 method3371(class39 arg0, int arg1) {
      byte[] var2 = arg0.method449(arg1, (byte)-62);
      return var2 == null ? null : method3374(var2)[0];
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "c",
      descriptor = "()I"
   )
   public final int method3372() {
      return this.field6361 + this.field6355 + this.field6360;
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "b",
      descriptor = "()V"
   )
   public final void method3373() {
      byte[] var1 = this.field6354;
      if (this.field6356 == null) {
         for(int var2 = this.field6353 - 1; var2 >= 0; --var2) {
            int var3 = this.field6361 * var2;
            int var4 = (var2 + 1) * this.field6361;

            while(var3 < var4) {
               --var4;
               byte var5 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var5;
               ++var3;
            }
         }
      } else {
         byte[] var6 = this.field6356;

         for(int var7 = this.field6353 - 1; var7 >= 0; --var7) {
            int var9 = this.field6361 * var7;
            int var10 = (var7 + 1) * this.field6361;

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

      int var8 = this.field6355;
      this.field6355 = this.field6360;
      this.field6360 = var8;
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "([B)[Liaa;"
   )
   private static final class433[] method3374(byte[] arg0) {
      class65 var1 = new class65(arg0);
      var1.field945 = arg0.length - 2;
      int var2 = var1.method685(-2);
      class433[] var3 = new class433[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = new class433();
      }

      var1.field945 = arg0.length - 7 - var2 * 8;
      int var5 = var1.method685(-2);
      int var6 = var1.method685(-2);
      int var7 = (var1.method665(false) & 255) + 1;

      for(int var8 = 0; var8 < var2; ++var8) {
         var3[var8].field6355 = var1.method685(-2);
      }

      for(int var9 = 0; var9 < var2; ++var9) {
         var3[var9].field6358 = var1.method685(-2);
      }

      for(int var10 = 0; var10 < var2; ++var10) {
         var3[var10].field6361 = var1.method685(-2);
      }

      for(int var11 = 0; var11 < var2; ++var11) {
         var3[var11].field6353 = var1.method685(-2);
      }

      for(int var12 = 0; var12 < var2; ++var12) {
         class433 var32 = var3[var12];
         var32.field6360 = var5 - var32.field6361 - var32.field6355;
         var32.field6359 = var6 - var32.field6353 - var32.field6358;
      }

      var1.field945 = arg0.length - 7 - var2 * 8 - (var7 - 1) * 3;
      int[] var13 = new int[var7];

      for(int var14 = 1; var14 < var7; ++var14) {
         var13[var14] = var1.method691((byte)-128);
         if (var13[var14] == 0) {
            var13[var14] = 1;
         }
      }

      for(int var15 = 0; var15 < var2; ++var15) {
         var3[var15].field6357 = var13;
      }

      var1.field945 = 0;

      for(int var16 = 0; var16 < var2; ++var16) {
         class433 var17 = var3[var16];
         int var18 = var17.field6361 * var17.field6353;
         var17.field6354 = new byte[var18];
         int var19 = var1.method665(false);
         if ((var19 & 2) == 0) {
            if ((var19 & 1) == 0) {
               for(int var20 = 0; var20 < var18; ++var20) {
                  var17.field6354[var20] = var1.method638(true);
               }
            } else {
               for(int var21 = 0; var21 < var17.field6361; ++var21) {
                  for(int var22 = 0; var22 < var17.field6353; ++var22) {
                     var17.field6354[var17.field6361 * var22 + var21] = var1.method638(true);
                  }
               }
            }
         } else {
            boolean var23 = false;
            var17.field6356 = new byte[var18];
            if ((var19 & 1) == 0) {
               for(int var24 = 0; var24 < var18; ++var24) {
                  var17.field6354[var24] = var1.method638(true);
               }

               for(int var25 = 0; var25 < var18; ++var25) {
                  byte var26 = var17.field6356[var25] = var1.method638(true);
                  var23 |= var26 != -1;
               }
            } else {
               for(int var27 = 0; var27 < var17.field6361; ++var27) {
                  for(int var31 = 0; var31 < var17.field6353; ++var31) {
                     var17.field6354[var17.field6361 * var31 + var27] = var1.method638(true);
                  }
               }

               for(int var28 = 0; var28 < var17.field6361; ++var28) {
                  for(int var29 = 0; var29 < var17.field6353; ++var29) {
                     byte var30 = var17.field6356[var17.field6361 * var29 + var28] = var1.method638(true);
                     var23 |= var30 != -1;
                  }
               }
            }

            if (!var23) {
               var17.field6356 = null;
            }
         }
      }

      return var3;
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "d",
      descriptor = "()I"
   )
   public final int method3375() {
      return this.field6358 + this.field6353 + this.field6359;
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "()V"
   )
   public final void method3376() {
      byte[] var1 = this.field6354;
      if (this.field6356 == null) {
         for(int var2 = (this.field6353 >> 1) - 1; var2 >= 0; --var2) {
            int var3 = this.field6361 * var2;
            int var4 = (this.field6353 - var2 - 1) * this.field6361;

            for(int var5 = -this.field6361; var5 < 0; ++var5) {
               byte var6 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var6;
               ++var3;
               ++var4;
            }
         }
      } else {
         byte[] var7 = this.field6356;

         for(int var8 = (this.field6353 >> 1) - 1; var8 >= 0; --var8) {
            int var10 = this.field6361 * var8;
            int var11 = (this.field6353 - var8 - 1) * this.field6361;

            for(int var12 = -this.field6361; var12 < 0; ++var12) {
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

      int var9 = this.field6358;
      this.field6358 = this.field6359;
      this.field6359 = var9;
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "f",
      descriptor = "()V"
   )
   public final void method3377() {
      int var1 = this.method3372();
      int var2 = this.method3375();
      if (this.field6361 != var1 || this.field6353 != var2) {
         byte[] var3 = new byte[var1 * var2];
         if (this.field6356 != null) {
            byte[] var4 = new byte[var1 * var2];

            for(int var5 = 0; var5 < this.field6353; ++var5) {
               int var6 = this.field6361 * var5;
               int var7 = (this.field6358 + var5) * var1 + this.field6355;

               for(int var8 = 0; var8 < this.field6361; ++var8) {
                  var3[var7] = this.field6354[var6];
                  var4[var7++] = this.field6356[var6++];
               }
            }

            this.field6356 = var4;
         } else {
            for(int var9 = 0; var9 < this.field6353; ++var9) {
               int var10 = this.field6361 * var9;
               int var11 = (this.field6358 + var9) * var1 + this.field6355;

               for(int var12 = 0; var12 < this.field6361; ++var12) {
                  var3[var11++] = this.field6354[var10++];
               }
            }
         }

         this.field6355 = this.field6360 = this.field6358 = this.field6359 = 0;
         this.field6361 = var1;
         this.field6353 = var2;
         this.field6354 = var3;
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "e",
      descriptor = "()V"
   )
   public final void method3378() {
      byte[] var1 = new byte[this.field6361 * this.field6353];
      int var2 = 0;
      if (this.field6356 == null) {
         for(int var3 = 0; var3 < this.field6361; ++var3) {
            for(int var4 = this.field6353 - 1; var4 >= 0; --var4) {
               var1[var2++] = this.field6354[this.field6361 * var4 + var3];
            }
         }

         this.field6354 = var1;
      } else {
         byte[] var5 = new byte[this.field6361 * this.field6353];

         for(int var6 = 0; var6 < this.field6361; ++var6) {
            for(int var9 = this.field6353 - 1; var9 >= 0; --var9) {
               var1[var2] = this.field6354[this.field6361 * var9 + var6];
               var5[var2++] = this.field6356[this.field6361 * var9 + var6];
            }
         }

         this.field6354 = var1;
         this.field6356 = var5;
      }

      int var7 = this.field6358;
      this.field6358 = this.field6355;
      this.field6355 = this.field6359;
      this.field6359 = this.field6360;
      this.field6360 = this.field6358;
      int var8 = this.field6353;
      this.field6353 = this.field6361;
      this.field6361 = var8;
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3379(int arg0) {
      int var2 = this.method3372();
      int var3 = this.method3375();
      if (this.field6361 != var2 || this.field6353 != var3) {
         int var4 = arg0;
         if (arg0 > this.field6355) {
            var4 = this.field6355;
         }

         int var5 = arg0;
         if (this.field6355 + arg0 + this.field6361 > var2) {
            var5 = var2 - this.field6355 - this.field6361;
         }

         int var6 = arg0;
         if (arg0 > this.field6358) {
            var6 = this.field6358;
         }

         int var7 = arg0;
         if (this.field6358 + arg0 + this.field6353 > var3) {
            var7 = var3 - this.field6358 - this.field6353;
         }

         int var8 = this.field6361 + var4 + var5;
         int var9 = this.field6353 + var6 + var7;
         byte[] var10 = new byte[var8 * var9];
         if (this.field6356 == null) {
            for(int var11 = 0; var11 < this.field6353; ++var11) {
               int var12 = this.field6361 * var11;
               int var13 = (var6 + var11) * var8 + var4;

               for(int var14 = 0; var14 < this.field6361; ++var14) {
                  var10[var13++] = this.field6354[var12++];
               }
            }
         } else {
            byte[] var15 = new byte[var8 * var9];

            for(int var16 = 0; var16 < this.field6353; ++var16) {
               int var17 = this.field6361 * var16;
               int var18 = (var6 + var16) * var8 + var4;

               for(int var19 = 0; var19 < this.field6361; ++var19) {
                  var15[var18] = this.field6356[var17];
                  var10[var18++] = this.field6354[var17++];
               }
            }

            this.field6356 = var15;
         }

         this.field6355 -= var4;
         this.field6358 -= var6;
         this.field6360 -= var5;
         this.field6359 -= var7;
         this.field6361 = var8;
         this.field6353 = var9;
         this.field6354 = var10;
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method3380(int arg0) {
      int var2 = -1;
      if (this.field6357.length < 255) {
         for(int var3 = 0; var3 < this.field6357.length; ++var3) {
            if (this.field6357[var3] == arg0) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field6357.length;
            int[] var4 = new int[this.field6357.length + 1];
            class474.method3641(this.field6357, 0, var4, 0, this.field6357.length);
            this.field6357 = var4;
            var4[var2] = arg0;
         }
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = arg0 >> 16 & 255;
         int var7 = arg0 >> 8 & 255;
         int var8 = arg0 & 255;

         for(int var9 = 0; var9 < this.field6357.length; ++var9) {
            int var13 = this.field6357[var9];
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

      for(int var10 = this.field6353 - 1; var10 > 0; --var10) {
         int var11 = this.field6361 * var10;

         for(int var12 = this.field6361 - 1; var12 > 0; --var12) {
            if (this.field6357[this.field6354[var11 + var12] & 255] == 0 && this.field6357[this.field6354[var11 + var12 - 1 - this.field6361] & 255] != 0) {
               this.field6354[var11 + var12] = (byte)var2;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!iaa",
      name = "b",
      descriptor = "(Lsa;I)[Liaa;"
   )
   public static final class433[] method3381(class39 arg0, int arg1) {
      byte[] var2 = arg0.method449(arg1, (byte)-62);
      return var2 == null ? null : method3374(var2);
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "b",
      descriptor = "(Lsa;II)Liaa;"
   )
   public static final class433 method3382(class39 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method460((byte)-11, arg2, arg1);
      return var3 == null ? null : method3374(var3)[0];
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "g",
      descriptor = "()[I"
   )
   public final int[] method3383() {
      int var1 = this.method3372();
      int[] var2 = new int[var1 * this.method3375()];
      if (this.field6356 != null) {
         for(int var3 = 0; var3 < this.field6353; ++var3) {
            int var4 = this.field6361 * var3;
            int var5 = (this.field6358 + var3) * var1 + this.field6355;

            for(int var6 = 0; var6 < this.field6361; ++var6) {
               var2[var5++] = this.field6356[var4] << 24 | this.field6357[this.field6354[var4] & 255];
               ++var4;
            }
         }
      } else {
         for(int var7 = 0; var7 < this.field6353; ++var7) {
            int var8 = this.field6361 * var7;
            int var9 = (this.field6358 + var7) * var1 + this.field6355;

            for(int var10 = 0; var10 < this.field6361; ++var10) {
               int var11 = this.field6357[this.field6354[var8++] & 255];
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
      owner = "client!iaa",
      name = "a",
      descriptor = "(Lsa;II)[Liaa;"
   )
   public static final class433[] method3384(class39 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method460((byte)-11, arg2, arg1);
      return var3 == null ? null : method3374(var3);
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3385(int arg0) {
      int var2 = -1;
      if (this.field6357.length < 255) {
         for(int var3 = 0; var3 < this.field6357.length; ++var3) {
            if (this.field6357[var3] == arg0) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field6357.length;
            int[] var4 = new int[this.field6357.length + 1];
            class474.method3641(this.field6357, 0, var4, 0, this.field6357.length);
            this.field6357 = var4;
            var4[var2] = arg0;
         }
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = arg0 >> 16 & 255;
         int var7 = arg0 >> 8 & 255;
         int var8 = arg0 & 255;

         for(int var9 = 0; var9 < this.field6357.length; ++var9) {
            int var15 = this.field6357[var9];
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
      byte[] var11 = new byte[this.field6361 * this.field6353];

      for(int var12 = 0; var12 < this.field6353; ++var12) {
         for(int var13 = 0; var13 < this.field6361; ++var13) {
            int var14 = this.field6354[var10] & 255;
            if (this.field6357[var14] == 0) {
               if (var13 > 0 && this.field6357[this.field6354[var10 - 1] & 255] != 0) {
                  var14 = var2;
               } else if (var12 > 0 && this.field6357[this.field6354[var10 - this.field6361] & 255] != 0) {
                  var14 = var2;
               } else if (var13 < this.field6361 - 1 && this.field6357[this.field6354[var10 + 1] & 255] != 0) {
                  var14 = var2;
               } else if (var12 < this.field6353 - 1 && this.field6357[this.field6354[this.field6361 + var10] & 255] != 0) {
                  var14 = var2;
               }
            }

            var11[var10++] = (byte)var14;
         }
      }

      this.field6354 = var11;
   }
}
