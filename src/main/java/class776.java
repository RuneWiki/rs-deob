import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class776 {
   @OriginalMember(
      owner = "client!kp",
      name = "d",
      descriptor = "I"
   )
   public int field11394;
   @OriginalMember(
      owner = "client!kp",
      name = "g",
      descriptor = "I"
   )
   public int field11395;
   @OriginalMember(
      owner = "client!kp",
      name = "e",
      descriptor = "I"
   )
   public int field11397;
   @OriginalMember(
      owner = "client!kp",
      name = "a",
      descriptor = "I"
   )
   public int field11399;
   @OriginalMember(
      owner = "client!kp",
      name = "i",
      descriptor = "I"
   )
   public int field11401;
   @OriginalMember(
      owner = "client!kp",
      name = "f",
      descriptor = "I"
   )
   public int field11402;
   @OriginalMember(
      owner = "client!kp",
      name = "b",
      descriptor = "[B"
   )
   public byte[] field11396;
   @OriginalMember(
      owner = "client!kp",
      name = "h",
      descriptor = "[B"
   )
   public byte[] field11398;
   @OriginalMember(
      owner = "client!kp",
      name = "c",
      descriptor = "[I"
   )
   public int[] field11400;

   @OriginalMember(
      owner = "client!kp",
      name = "b",
      descriptor = "()I"
   )
   public final int method5636() {
      return this.field11397 + this.field11394 + this.field11399;
   }

   @OriginalMember(
      owner = "client!kp",
      name = "f",
      descriptor = "()V"
   )
   public final void method5637() {
      byte[] var1 = this.field11396;
      if (this.field11398 == null) {
         for(int var2 = (this.field11394 >> 1) - 1; var2 >= 0; --var2) {
            int var3 = this.field11395 * var2;
            int var4 = (this.field11394 - var2 - 1) * this.field11395;

            for(int var5 = -this.field11395; var5 < 0; ++var5) {
               byte var6 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var6;
               ++var3;
               ++var4;
            }
         }
      } else {
         byte[] var7 = this.field11398;

         for(int var8 = (this.field11394 >> 1) - 1; var8 >= 0; --var8) {
            int var10 = this.field11395 * var8;
            int var11 = (this.field11394 - var8 - 1) * this.field11395;

            for(int var12 = -this.field11395; var12 < 0; ++var12) {
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

      int var9 = this.field11397;
      this.field11397 = this.field11399;
      this.field11399 = var9;
   }

   @OriginalMember(
      owner = "client!kp",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method5638(int arg0) {
      int var2 = -1;
      if (this.field11400.length < 255) {
         for(int var3 = 0; var3 < this.field11400.length; ++var3) {
            if (this.field11400[var3] == arg0) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field11400.length;
            int[] var4 = new int[this.field11400.length + 1];
            class107.method1029(this.field11400, 0, var4, 0, this.field11400.length);
            this.field11400 = var4;
            var4[var2] = arg0;
         }
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = arg0 >> 16 & 255;
         int var7 = arg0 >> 8 & 255;
         int var8 = arg0 & 255;

         for(int var9 = 0; var9 < this.field11400.length; ++var9) {
            int var13 = this.field11400[var9];
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

      for(int var10 = this.field11394 - 1; var10 > 0; --var10) {
         int var11 = this.field11395 * var10;

         for(int var12 = this.field11395 - 1; var12 > 0; --var12) {
            if (this.field11400[this.field11396[var11 + var12] & 255] == 0 && this.field11400[this.field11396[var11 + var12 - 1 - this.field11395] & 255] != 0) {
               this.field11396[var11 + var12] = (byte)var2;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!kp",
      name = "a",
      descriptor = "(Lrr;II)Lkp;"
   )
   public static final class776 method5639(class678 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method5017(arg1, arg2, (byte)71);
      return var3 == null ? null : method5640(var3)[0];
   }

   @OriginalMember(
      owner = "client!kp",
      name = "a",
      descriptor = "([B)[Lkp;"
   )
   private static final class776[] method5640(byte[] arg0) {
      class354 var1 = new class354(arg0);
      var1.field5436 = arg0.length - 2;
      int var2 = var1.method2848(-122);
      class776[] var3 = new class776[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = new class776();
      }

      var1.field5436 = arg0.length - 7 - var2 * 8;
      int var5 = var1.method2848(-123);
      int var6 = var1.method2848(-94);
      int var7 = (var1.method2855(-31007) & 255) + 1;

      for(int var8 = 0; var8 < var2; ++var8) {
         var3[var8].field11401 = var1.method2848(-122);
      }

      for(int var9 = 0; var9 < var2; ++var9) {
         var3[var9].field11397 = var1.method2848(-120);
      }

      for(int var10 = 0; var10 < var2; ++var10) {
         var3[var10].field11395 = var1.method2848(-96);
      }

      for(int var11 = 0; var11 < var2; ++var11) {
         var3[var11].field11394 = var1.method2848(-112);
      }

      for(int var12 = 0; var12 < var2; ++var12) {
         class776 var32 = var3[var12];
         var32.field11402 = var5 - var32.field11395 - var32.field11401;
         var32.field11399 = var6 - var32.field11394 - var32.field11397;
      }

      var1.field5436 = arg0.length - 7 - var2 * 8 - (var7 - 1) * 3;
      int[] var13 = new int[var7];

      for(int var14 = 1; var14 < var7; ++var14) {
         var13[var14] = var1.method2872(2);
         if (var13[var14] == 0) {
            var13[var14] = 1;
         }
      }

      for(int var15 = 0; var15 < var2; ++var15) {
         var3[var15].field11400 = var13;
      }

      var1.field5436 = 0;

      for(int var16 = 0; var16 < var2; ++var16) {
         class776 var17 = var3[var16];
         int var18 = var17.field11395 * var17.field11394;
         var17.field11396 = new byte[var18];
         int var19 = var1.method2855(-31007);
         if ((var19 & 2) == 0) {
            if ((var19 & 1) == 0) {
               for(int var20 = 0; var20 < var18; ++var20) {
                  var17.field11396[var20] = var1.method2886((byte)88);
               }
            } else {
               for(int var21 = 0; var21 < var17.field11395; ++var21) {
                  for(int var22 = 0; var22 < var17.field11394; ++var22) {
                     var17.field11396[var17.field11395 * var22 + var21] = var1.method2886((byte)88);
                  }
               }
            }
         } else {
            boolean var23 = false;
            var17.field11398 = new byte[var18];
            if ((var19 & 1) == 0) {
               for(int var24 = 0; var24 < var18; ++var24) {
                  var17.field11396[var24] = var1.method2886((byte)88);
               }

               for(int var25 = 0; var25 < var18; ++var25) {
                  byte var26 = var17.field11398[var25] = var1.method2886((byte)88);
                  var23 |= var26 != -1;
               }
            } else {
               for(int var27 = 0; var27 < var17.field11395; ++var27) {
                  for(int var31 = 0; var31 < var17.field11394; ++var31) {
                     var17.field11396[var17.field11395 * var31 + var27] = var1.method2886((byte)88);
                  }
               }

               for(int var28 = 0; var28 < var17.field11395; ++var28) {
                  for(int var29 = 0; var29 < var17.field11394; ++var29) {
                     byte var30 = var17.field11398[var17.field11395 * var29 + var28] = var1.method2886((byte)88);
                     var23 |= var30 != -1;
                  }
               }
            }

            if (!var23) {
               var17.field11398 = null;
            }
         }
      }

      return var3;
   }

   @OriginalMember(
      owner = "client!kp",
      name = "d",
      descriptor = "()[I"
   )
   public final int[] method5641() {
      int var1 = this.method5648();
      int[] var2 = new int[var1 * this.method5636()];
      if (this.field11398 != null) {
         for(int var3 = 0; var3 < this.field11394; ++var3) {
            int var4 = this.field11395 * var3;
            int var5 = (this.field11397 + var3) * var1 + this.field11401;

            for(int var6 = 0; var6 < this.field11395; ++var6) {
               var2[var5++] = this.field11398[var4] << 24 | this.field11400[this.field11396[var4] & 255];
               ++var4;
            }
         }
      } else {
         for(int var7 = 0; var7 < this.field11394; ++var7) {
            int var8 = this.field11395 * var7;
            int var9 = (this.field11397 + var7) * var1 + this.field11401;

            for(int var10 = 0; var10 < this.field11395; ++var10) {
               int var11 = this.field11400[this.field11396[var8++] & 255];
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
      owner = "client!kp",
      name = "c",
      descriptor = "()V"
   )
   public final void method5642() {
      byte[] var1 = this.field11396;
      if (this.field11398 == null) {
         for(int var2 = this.field11394 - 1; var2 >= 0; --var2) {
            int var3 = this.field11395 * var2;
            int var4 = (var2 + 1) * this.field11395;

            while(var3 < var4) {
               --var4;
               byte var5 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var5;
               ++var3;
            }
         }
      } else {
         byte[] var6 = this.field11398;

         for(int var7 = this.field11394 - 1; var7 >= 0; --var7) {
            int var9 = this.field11395 * var7;
            int var10 = (var7 + 1) * this.field11395;

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

      int var8 = this.field11401;
      this.field11401 = this.field11402;
      this.field11402 = var8;
   }

   @OriginalMember(
      owner = "client!kp",
      name = "a",
      descriptor = "(Lrr;I)[Lkp;"
   )
   public static final class776[] method5643(class678 arg0, int arg1) {
      byte[] var2 = arg0.method5025(0, arg1);
      return var2 == null ? null : method5640(var2);
   }

   @OriginalMember(
      owner = "client!kp",
      name = "a",
      descriptor = "()V"
   )
   public final void method5644() {
      int var1 = this.method5648();
      int var2 = this.method5636();
      if (this.field11395 != var1 || this.field11394 != var2) {
         byte[] var3 = new byte[var1 * var2];
         if (this.field11398 != null) {
            byte[] var4 = new byte[var1 * var2];

            for(int var5 = 0; var5 < this.field11394; ++var5) {
               int var6 = this.field11395 * var5;
               int var7 = (this.field11397 + var5) * var1 + this.field11401;

               for(int var8 = 0; var8 < this.field11395; ++var8) {
                  var3[var7] = this.field11396[var6];
                  var4[var7++] = this.field11398[var6++];
               }
            }

            this.field11398 = var4;
         } else {
            for(int var9 = 0; var9 < this.field11394; ++var9) {
               int var10 = this.field11395 * var9;
               int var11 = (this.field11397 + var9) * var1 + this.field11401;

               for(int var12 = 0; var12 < this.field11395; ++var12) {
                  var3[var11++] = this.field11396[var10++];
               }
            }
         }

         this.field11401 = this.field11402 = this.field11397 = this.field11399 = 0;
         this.field11395 = var1;
         this.field11394 = var2;
         this.field11396 = var3;
      }
   }

   @OriginalMember(
      owner = "client!kp",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5645(int arg0) {
      int var2 = -1;
      if (this.field11400.length < 255) {
         for(int var3 = 0; var3 < this.field11400.length; ++var3) {
            if (this.field11400[var3] == arg0) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field11400.length;
            int[] var4 = new int[this.field11400.length + 1];
            class107.method1029(this.field11400, 0, var4, 0, this.field11400.length);
            this.field11400 = var4;
            var4[var2] = arg0;
         }
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = arg0 >> 16 & 255;
         int var7 = arg0 >> 8 & 255;
         int var8 = arg0 & 255;

         for(int var9 = 0; var9 < this.field11400.length; ++var9) {
            int var15 = this.field11400[var9];
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
      byte[] var11 = new byte[this.field11395 * this.field11394];

      for(int var12 = 0; var12 < this.field11394; ++var12) {
         for(int var13 = 0; var13 < this.field11395; ++var13) {
            int var14 = this.field11396[var10] & 255;
            if (this.field11400[var14] == 0) {
               if (var13 > 0 && this.field11400[this.field11396[var10 - 1] & 255] != 0) {
                  var14 = var2;
               } else if (var12 > 0 && this.field11400[this.field11396[var10 - this.field11395] & 255] != 0) {
                  var14 = var2;
               } else if (var13 < this.field11395 - 1 && this.field11400[this.field11396[var10 + 1] & 255] != 0) {
                  var14 = var2;
               } else if (var12 < this.field11394 - 1 && this.field11400[this.field11396[this.field11395 + var10] & 255] != 0) {
                  var14 = var2;
               }
            }

            var11[var10++] = (byte)var14;
         }
      }

      this.field11396 = var11;
   }

   @OriginalMember(
      owner = "client!kp",
      name = "e",
      descriptor = "()V"
   )
   public final void method5646() {
      byte[] var1 = new byte[this.field11395 * this.field11394];
      int var2 = 0;
      if (this.field11398 == null) {
         for(int var3 = 0; var3 < this.field11395; ++var3) {
            for(int var4 = this.field11394 - 1; var4 >= 0; --var4) {
               var1[var2++] = this.field11396[this.field11395 * var4 + var3];
            }
         }

         this.field11396 = var1;
      } else {
         byte[] var5 = new byte[this.field11395 * this.field11394];

         for(int var6 = 0; var6 < this.field11395; ++var6) {
            for(int var9 = this.field11394 - 1; var9 >= 0; --var9) {
               var1[var2] = this.field11396[this.field11395 * var9 + var6];
               var5[var2++] = this.field11398[this.field11395 * var9 + var6];
            }
         }

         this.field11396 = var1;
         this.field11398 = var5;
      }

      int var7 = this.field11397;
      this.field11397 = this.field11401;
      this.field11401 = this.field11399;
      this.field11399 = this.field11402;
      this.field11402 = this.field11397;
      int var8 = this.field11394;
      this.field11394 = this.field11395;
      this.field11395 = var8;
   }

   @OriginalMember(
      owner = "client!kp",
      name = "b",
      descriptor = "(Lrr;II)[Lkp;"
   )
   public static final class776[] method5647(class678 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method5017(arg1, arg2, (byte)71);
      return var3 == null ? null : method5640(var3);
   }

   @OriginalMember(
      owner = "client!kp",
      name = "g",
      descriptor = "()I"
   )
   public final int method5648() {
      return this.field11401 + this.field11395 + this.field11402;
   }

   @OriginalMember(
      owner = "client!kp",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5649(int arg0) {
      int var2 = this.method5648();
      int var3 = this.method5636();
      if (this.field11395 != var2 || this.field11394 != var3) {
         int var4 = arg0;
         if (arg0 > this.field11401) {
            var4 = this.field11401;
         }

         int var5 = arg0;
         if (this.field11401 + arg0 + this.field11395 > var2) {
            var5 = var2 - this.field11401 - this.field11395;
         }

         int var6 = arg0;
         if (arg0 > this.field11397) {
            var6 = this.field11397;
         }

         int var7 = arg0;
         if (this.field11397 + arg0 + this.field11394 > var3) {
            var7 = var3 - this.field11397 - this.field11394;
         }

         int var8 = this.field11395 + var4 + var5;
         int var9 = this.field11394 + var6 + var7;
         byte[] var10 = new byte[var8 * var9];
         if (this.field11398 == null) {
            for(int var11 = 0; var11 < this.field11394; ++var11) {
               int var12 = this.field11395 * var11;
               int var13 = (var6 + var11) * var8 + var4;

               for(int var14 = 0; var14 < this.field11395; ++var14) {
                  var10[var13++] = this.field11396[var12++];
               }
            }
         } else {
            byte[] var15 = new byte[var8 * var9];

            for(int var16 = 0; var16 < this.field11394; ++var16) {
               int var17 = this.field11395 * var16;
               int var18 = (var6 + var16) * var8 + var4;

               for(int var19 = 0; var19 < this.field11395; ++var19) {
                  var15[var18] = this.field11398[var17];
                  var10[var18++] = this.field11396[var17++];
               }
            }

            this.field11398 = var15;
         }

         this.field11401 -= var4;
         this.field11397 -= var6;
         this.field11402 -= var5;
         this.field11399 -= var7;
         this.field11395 = var8;
         this.field11394 = var9;
         this.field11396 = var10;
      }
   }

   @OriginalMember(
      owner = "client!kp",
      name = "b",
      descriptor = "(Lrr;I)Lkp;"
   )
   public static final class776 method5650(class678 arg0, int arg1) {
      byte[] var2 = arg0.method5025(0, arg1);
      return var2 == null ? null : method5640(var2)[0];
   }
}
