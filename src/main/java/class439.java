import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class439 {
   @OriginalMember(
      owner = "client!mha",
      name = "h",
      descriptor = "I"
   )
   public int field6262;
   @OriginalMember(
      owner = "client!mha",
      name = "b",
      descriptor = "I"
   )
   public int field6263;
   @OriginalMember(
      owner = "client!mha",
      name = "i",
      descriptor = "I"
   )
   public int field6265;
   @OriginalMember(
      owner = "client!mha",
      name = "d",
      descriptor = "I"
   )
   public int field6266;
   @OriginalMember(
      owner = "client!mha",
      name = "c",
      descriptor = "I"
   )
   public int field6267;
   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "I"
   )
   public int field6269;
   @OriginalMember(
      owner = "client!mha",
      name = "g",
      descriptor = "[B"
   )
   public byte[] field6268;
   @OriginalMember(
      owner = "client!mha",
      name = "e",
      descriptor = "[B"
   )
   public byte[] field6270;
   @OriginalMember(
      owner = "client!mha",
      name = "f",
      descriptor = "[I"
   )
   public int[] field6264;

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   public final void method3230(int arg0) {
      int var2 = -1;
      if (this.field6264.length < 255) {
         for(int var3 = 0; var3 < this.field6264.length; ++var3) {
            if (this.field6264[var3] == arg0) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field6264.length;
            int[] var4 = new int[this.field6264.length + 1];
            class242.method1853(this.field6264, 0, var4, 0, this.field6264.length);
            this.field6264 = var4;
            var4[var2] = arg0;
         }
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = arg0 >> 16 & 255;
         int var7 = arg0 >> 8 & 255;
         int var8 = arg0 & 255;

         for(int var9 = 0; var9 < this.field6264.length; ++var9) {
            int var13 = this.field6264[var9];
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

      for(int var10 = this.field6267 - 1; var10 > 0; --var10) {
         int var11 = this.field6269 * var10;

         for(int var12 = this.field6269 - 1; var12 > 0; --var12) {
            if (this.field6264[this.field6268[var11 + var12] & 255] == 0 && this.field6264[this.field6268[var11 + var12 - 1 - this.field6269] & 255] != 0) {
               this.field6268[var11 + var12] = (byte)var2;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!mha",
      name = "d",
      descriptor = "()V",
      line = 109
   )
   public final void method3231() {
      byte[] var1 = this.field6268;
      if (this.field6270 == null) {
         for(int var2 = this.field6267 - 1; var2 >= 0; --var2) {
            int var3 = this.field6269 * var2;
            int var4 = (var2 + 1) * this.field6269;

            while(var3 < var4) {
               --var4;
               byte var5 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var5;
               ++var3;
            }
         }
      } else {
         byte[] var6 = this.field6270;

         for(int var7 = this.field6267 - 1; var7 >= 0; --var7) {
            int var9 = this.field6269 * var7;
            int var10 = (var7 + 1) * this.field6269;

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

      int var8 = this.field6265;
      this.field6265 = this.field6266;
      this.field6266 = var8;
   }

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "(Lkf;I)[Lmha;",
      line = 171
   )
   public static final class439[] method3232(class266 arg0, int arg1) {
      byte[] var2 = arg0.method2061((byte)123, arg1);
      return var2 == null ? null : method3236(var2);
   }

   @OriginalMember(
      owner = "client!mha",
      name = "b",
      descriptor = "()I",
      line = 181
   )
   public final int method3233() {
      return this.field6267 + this.field6262 + this.field6263;
   }

   @OriginalMember(
      owner = "client!mha",
      name = "e",
      descriptor = "()V",
      line = 185
   )
   public final void method3234() {
      int var1 = this.method3242();
      int var2 = this.method3233();
      if (this.field6269 != var1 || this.field6267 != var2) {
         byte[] var3 = new byte[var1 * var2];
         if (this.field6270 != null) {
            byte[] var4 = new byte[var1 * var2];

            for(int var5 = 0; var5 < this.field6267; ++var5) {
               int var6 = this.field6269 * var5;
               int var7 = (this.field6262 + var5) * var1 + this.field6265;

               for(int var8 = 0; var8 < this.field6269; ++var8) {
                  var3[var7] = this.field6268[var6];
                  var4[var7++] = this.field6270[var6++];
               }
            }

            this.field6270 = var4;
         } else {
            for(int var9 = 0; var9 < this.field6267; ++var9) {
               int var10 = this.field6269 * var9;
               int var11 = (this.field6262 + var9) * var1 + this.field6265;

               for(int var12 = 0; var12 < this.field6269; ++var12) {
                  var3[var11++] = this.field6268[var10++];
               }
            }
         }

         this.field6265 = this.field6266 = this.field6262 = this.field6263 = 0;
         this.field6269 = var1;
         this.field6267 = var2;
         this.field6268 = var3;
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "b",
      descriptor = "(Lkf;I)Lmha;",
      line = 253
   )
   public static final class439 method3235(class266 arg0, int arg1) {
      byte[] var2 = arg0.method2061((byte)-120, arg1);
      return var2 == null ? null : method3236(var2)[0];
   }

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "([B)[Lmha;",
      line = 261
   )
   private static final class439[] method3236(byte[] arg0) {
      class147 var1 = new class147(arg0);
      var1.field1856 = arg0.length - 2;
      int var2 = var1.method1211(-26166);
      class439[] var3 = new class439[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = new class439();
      }

      var1.field1856 = arg0.length - 7 - var2 * 8;
      int var5 = var1.method1211(-26166);
      int var6 = var1.method1211(-26166);
      int var7 = (var1.method1143(-15465) & 255) + 1;

      for(int var8 = 0; var8 < var2; ++var8) {
         var3[var8].field6265 = var1.method1211(-26166);
      }

      for(int var9 = 0; var9 < var2; ++var9) {
         var3[var9].field6262 = var1.method1211(-26166);
      }

      for(int var10 = 0; var10 < var2; ++var10) {
         var3[var10].field6269 = var1.method1211(-26166);
      }

      for(int var11 = 0; var11 < var2; ++var11) {
         var3[var11].field6267 = var1.method1211(-26166);
      }

      for(int var12 = 0; var12 < var2; ++var12) {
         class439 var32 = var3[var12];
         var32.field6266 = var5 - var32.field6269 - var32.field6265;
         var32.field6263 = var6 - var32.field6267 - var32.field6262;
      }

      var1.field1856 = arg0.length - 7 - var2 * 8 - (var7 - 1) * 3;
      int[] var13 = new int[var7];

      for(int var14 = 1; var14 < var7; ++var14) {
         var13[var14] = var1.method1166((byte)-51);
         if (var13[var14] == 0) {
            var13[var14] = 1;
         }
      }

      for(int var15 = 0; var15 < var2; ++var15) {
         var3[var15].field6264 = var13;
      }

      var1.field1856 = 0;

      for(int var16 = 0; var16 < var2; ++var16) {
         class439 var17 = var3[var16];
         int var18 = var17.field6269 * var17.field6267;
         var17.field6268 = new byte[var18];
         int var19 = var1.method1143(-15465);
         if ((var19 & 2) == 0) {
            if ((var19 & 1) == 0) {
               for(int var20 = 0; var20 < var18; ++var20) {
                  var17.field6268[var20] = var1.method1162(4);
               }
            } else {
               for(int var21 = 0; var21 < var17.field6269; ++var21) {
                  for(int var22 = 0; var22 < var17.field6267; ++var22) {
                     var17.field6268[var17.field6269 * var22 + var21] = var1.method1162(4);
                  }
               }
            }
         } else {
            boolean var23 = false;
            var17.field6270 = new byte[var18];
            if ((var19 & 1) == 0) {
               for(int var24 = 0; var24 < var18; ++var24) {
                  var17.field6268[var24] = var1.method1162(4);
               }

               for(int var25 = 0; var25 < var18; ++var25) {
                  byte var26 = var17.field6270[var25] = var1.method1162(4);
                  var23 |= var26 != -1;
               }
            } else {
               for(int var27 = 0; var27 < var17.field6269; ++var27) {
                  for(int var31 = 0; var31 < var17.field6267; ++var31) {
                     var17.field6268[var17.field6269 * var31 + var27] = var1.method1162(4);
                  }
               }

               for(int var28 = 0; var28 < var17.field6269; ++var28) {
                  for(int var29 = 0; var29 < var17.field6267; ++var29) {
                     byte var30 = var17.field6270[var17.field6269 * var29 + var28] = var1.method1162(4);
                     var23 |= var30 != -1;
                  }
               }
            }

            if (!var23) {
               var17.field6270 = null;
            }
         }
      }

      return var3;
   }

   @OriginalMember(
      owner = "client!mha",
      name = "b",
      descriptor = "(Lkf;II)[Lmha;",
      line = 471
   )
   public static final class439[] method3237(class266 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method2037(false, arg2, arg1);
      return var3 == null ? null : method3236(var3);
   }

   @OriginalMember(
      owner = "client!mha",
      name = "c",
      descriptor = "()V",
      line = 481
   )
   public final void method3238() {
      byte[] var1 = this.field6268;
      if (this.field6270 == null) {
         for(int var2 = (this.field6267 >> 1) - 1; var2 >= 0; --var2) {
            int var3 = this.field6269 * var2;
            int var4 = (this.field6267 - var2 - 1) * this.field6269;

            for(int var5 = -this.field6269; var5 < 0; ++var5) {
               byte var6 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var6;
               ++var3;
               ++var4;
            }
         }
      } else {
         byte[] var7 = this.field6270;

         for(int var8 = (this.field6267 >> 1) - 1; var8 >= 0; --var8) {
            int var10 = this.field6269 * var8;
            int var11 = (this.field6267 - var8 - 1) * this.field6269;

            for(int var12 = -this.field6269; var12 < 0; ++var12) {
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

      int var9 = this.field6262;
      this.field6262 = this.field6263;
      this.field6263 = var9;
   }

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "(Lkf;II)Lmha;",
      line = 551
   )
   public static final class439 method3239(class266 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method2037(false, arg2, arg1);
      return var3 == null ? null : method3236(var3)[0];
   }

   @OriginalMember(
      owner = "client!mha",
      name = "b",
      descriptor = "(I)V",
      line = 559
   )
   public final void method3240(int arg0) {
      int var2 = -1;
      if (this.field6264.length < 255) {
         for(int var3 = 0; var3 < this.field6264.length; ++var3) {
            if (this.field6264[var3] == arg0) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field6264.length;
            int[] var4 = new int[this.field6264.length + 1];
            class242.method1853(this.field6264, 0, var4, 0, this.field6264.length);
            this.field6264 = var4;
            var4[var2] = arg0;
         }
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = arg0 >> 16 & 255;
         int var7 = arg0 >> 8 & 255;
         int var8 = arg0 & 255;

         for(int var9 = 0; var9 < this.field6264.length; ++var9) {
            int var15 = this.field6264[var9];
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
      byte[] var11 = new byte[this.field6269 * this.field6267];

      for(int var12 = 0; var12 < this.field6267; ++var12) {
         for(int var13 = 0; var13 < this.field6269; ++var13) {
            int var14 = this.field6268[var10] & 255;
            if (this.field6264[var14] == 0) {
               if (var13 > 0 && this.field6264[this.field6268[var10 - 1] & 255] != 0) {
                  var14 = var2;
               } else if (var12 > 0 && this.field6264[this.field6268[var10 - this.field6269] & 255] != 0) {
                  var14 = var2;
               } else if (var13 < this.field6269 - 1 && this.field6264[this.field6268[var10 + 1] & 255] != 0) {
                  var14 = var2;
               } else if (var12 < this.field6267 - 1 && this.field6264[this.field6268[this.field6269 + var10] & 255] != 0) {
                  var14 = var2;
               }
            }

            var11[var10++] = (byte)var14;
         }
      }

      this.field6268 = var11;
   }

   @OriginalMember(
      owner = "client!mha",
      name = "c",
      descriptor = "(I)V",
      line = 687
   )
   public final void method3241(int arg0) {
      int var2 = this.method3242();
      int var3 = this.method3233();
      if (this.field6269 != var2 || this.field6267 != var3) {
         int var4 = arg0;
         if (arg0 > this.field6265) {
            var4 = this.field6265;
         }

         int var5 = arg0;
         if (this.field6265 + arg0 + this.field6269 > var2) {
            var5 = var2 - this.field6265 - this.field6269;
         }

         int var6 = arg0;
         if (arg0 > this.field6262) {
            var6 = this.field6262;
         }

         int var7 = arg0;
         if (this.field6262 + arg0 + this.field6267 > var3) {
            var7 = var3 - this.field6262 - this.field6267;
         }

         int var8 = this.field6269 + var4 + var5;
         int var9 = this.field6267 + var6 + var7;
         byte[] var10 = new byte[var8 * var9];
         if (this.field6270 == null) {
            for(int var11 = 0; var11 < this.field6267; ++var11) {
               int var12 = this.field6269 * var11;
               int var13 = (var6 + var11) * var8 + var4;

               for(int var14 = 0; var14 < this.field6269; ++var14) {
                  var10[var13++] = this.field6268[var12++];
               }
            }
         } else {
            byte[] var15 = new byte[var8 * var9];

            for(int var16 = 0; var16 < this.field6267; ++var16) {
               int var17 = this.field6269 * var16;
               int var18 = (var6 + var16) * var8 + var4;

               for(int var19 = 0; var19 < this.field6269; ++var19) {
                  var15[var18] = this.field6270[var17];
                  var10[var18++] = this.field6268[var17++];
               }
            }

            this.field6270 = var15;
         }

         this.field6265 -= var4;
         this.field6262 -= var6;
         this.field6266 -= var5;
         this.field6263 -= var7;
         this.field6269 = var8;
         this.field6267 = var9;
         this.field6268 = var10;
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "()I",
      line = 781
   )
   public final int method3242() {
      return this.field6269 + this.field6265 + this.field6266;
   }

   @OriginalMember(
      owner = "client!mha",
      name = "f",
      descriptor = "()V",
      line = 785
   )
   public final void method3243() {
      byte[] var1 = new byte[this.field6269 * this.field6267];
      int var2 = 0;
      if (this.field6270 == null) {
         for(int var3 = 0; var3 < this.field6269; ++var3) {
            for(int var4 = this.field6267 - 1; var4 >= 0; --var4) {
               var1[var2++] = this.field6268[this.field6269 * var4 + var3];
            }
         }

         this.field6268 = var1;
      } else {
         byte[] var5 = new byte[this.field6269 * this.field6267];

         for(int var6 = 0; var6 < this.field6269; ++var6) {
            for(int var9 = this.field6267 - 1; var9 >= 0; --var9) {
               var1[var2] = this.field6268[this.field6269 * var9 + var6];
               var5[var2++] = this.field6270[this.field6269 * var9 + var6];
            }
         }

         this.field6268 = var1;
         this.field6270 = var5;
      }

      int var7 = this.field6262;
      this.field6262 = this.field6265;
      this.field6265 = this.field6263;
      this.field6263 = this.field6266;
      this.field6266 = this.field6262;
      int var8 = this.field6267;
      this.field6267 = this.field6269;
      this.field6269 = var8;
   }

   @OriginalMember(
      owner = "client!mha",
      name = "g",
      descriptor = "()[I",
      line = 845
   )
   public final int[] method3244() {
      int var1 = this.method3242();
      int[] var2 = new int[var1 * this.method3233()];
      if (this.field6270 != null) {
         for(int var3 = 0; var3 < this.field6267; ++var3) {
            int var4 = this.field6269 * var3;
            int var5 = (this.field6262 + var3) * var1 + this.field6265;

            for(int var6 = 0; var6 < this.field6269; ++var6) {
               var2[var5++] = this.field6270[var4] << 24 | this.field6264[this.field6268[var4] & 255];
               ++var4;
            }
         }
      } else {
         for(int var7 = 0; var7 < this.field6267; ++var7) {
            int var8 = this.field6269 * var7;
            int var9 = (this.field6262 + var7) * var1 + this.field6265;

            for(int var10 = 0; var10 < this.field6269; ++var10) {
               int var11 = this.field6264[this.field6268[var8++] & 255];
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
}
