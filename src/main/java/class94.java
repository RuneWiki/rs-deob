import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class94 {
   @OriginalMember(
      owner = "client!tn",
      name = "f",
      descriptor = "I"
   )
   public int field1520;
   @OriginalMember(
      owner = "client!tn",
      name = "c",
      descriptor = "I"
   )
   public int field1522;
   @OriginalMember(
      owner = "client!tn",
      name = "b",
      descriptor = "I"
   )
   public int field1523;
   @OriginalMember(
      owner = "client!tn",
      name = "a",
      descriptor = "I"
   )
   public int field1524;
   @OriginalMember(
      owner = "client!tn",
      name = "g",
      descriptor = "I"
   )
   public int field1525;
   @OriginalMember(
      owner = "client!tn",
      name = "i",
      descriptor = "I"
   )
   public int field1526;
   @OriginalMember(
      owner = "client!tn",
      name = "d",
      descriptor = "[B"
   )
   public byte[] field1519;
   @OriginalMember(
      owner = "client!tn",
      name = "h",
      descriptor = "[B"
   )
   public byte[] field1527;
   @OriginalMember(
      owner = "client!tn",
      name = "e",
      descriptor = "[I"
   )
   public int[] field1521;

   @OriginalMember(
      owner = "client!tn",
      name = "c",
      descriptor = "()V",
      line = 5
   )
   public final void method905() {
      byte[] var1 = this.field1519;
      if (this.field1527 == null) {
         for(int var2 = (this.field1520 >> 1) - 1; var2 >= 0; --var2) {
            int var3 = this.field1523 * var2;
            int var4 = (this.field1520 - var2 - 1) * this.field1523;

            for(int var5 = -this.field1523; var5 < 0; ++var5) {
               byte var6 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var6;
               ++var3;
               ++var4;
            }
         }
      } else {
         byte[] var7 = this.field1527;

         for(int var8 = (this.field1520 >> 1) - 1; var8 >= 0; --var8) {
            int var10 = this.field1523 * var8;
            int var11 = (this.field1520 - var8 - 1) * this.field1523;

            for(int var12 = -this.field1523; var12 < 0; ++var12) {
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

      int var9 = this.field1525;
      this.field1525 = this.field1524;
      this.field1524 = var9;
   }

   @OriginalMember(
      owner = "client!tn",
      name = "a",
      descriptor = "([B)[Ltn;",
      line = 75
   )
   private static final class94[] method906(byte[] arg0) {
      class473 var1 = new class473(arg0);
      var1.field6907 = arg0.length - 2;
      int var2 = var1.method3565(true);
      class94[] var3 = new class94[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = new class94();
      }

      var1.field6907 = arg0.length - 7 - var2 * 8;
      int var5 = var1.method3565(true);
      int var6 = var1.method3565(true);
      int var7 = (var1.method3564((byte)-96) & 255) + 1;

      for(int var8 = 0; var8 < var2; ++var8) {
         var3[var8].field1522 = var1.method3565(true);
      }

      for(int var9 = 0; var9 < var2; ++var9) {
         var3[var9].field1525 = var1.method3565(true);
      }

      for(int var10 = 0; var10 < var2; ++var10) {
         var3[var10].field1523 = var1.method3565(true);
      }

      for(int var11 = 0; var11 < var2; ++var11) {
         var3[var11].field1520 = var1.method3565(true);
      }

      for(int var12 = 0; var12 < var2; ++var12) {
         class94 var32 = var3[var12];
         var32.field1526 = var5 - var32.field1523 - var32.field1522;
         var32.field1524 = var6 - var32.field1520 - var32.field1525;
      }

      var1.field6907 = arg0.length - 7 - var2 * 8 - (var7 - 1) * 3;
      int[] var13 = new int[var7];

      for(int var14 = 1; var14 < var7; ++var14) {
         var13[var14] = var1.method3577(-2);
         if (var13[var14] == 0) {
            var13[var14] = 1;
         }
      }

      for(int var15 = 0; var15 < var2; ++var15) {
         var3[var15].field1521 = var13;
      }

      var1.field6907 = 0;

      for(int var16 = 0; var16 < var2; ++var16) {
         class94 var17 = var3[var16];
         int var18 = var17.field1523 * var17.field1520;
         var17.field1519 = new byte[var18];
         int var19 = var1.method3564((byte)-60);
         if ((var19 & 2) == 0) {
            if ((var19 & 1) == 0) {
               for(int var20 = 0; var20 < var18; ++var20) {
                  var17.field1519[var20] = var1.method3543(-1132613840);
               }
            } else {
               for(int var21 = 0; var21 < var17.field1523; ++var21) {
                  for(int var22 = 0; var22 < var17.field1520; ++var22) {
                     var17.field1519[var17.field1523 * var22 + var21] = var1.method3543(-1132613840);
                  }
               }
            }
         } else {
            boolean var23 = false;
            var17.field1527 = new byte[var18];
            if ((var19 & 1) == 0) {
               for(int var24 = 0; var24 < var18; ++var24) {
                  var17.field1519[var24] = var1.method3543(-1132613840);
               }

               for(int var25 = 0; var25 < var18; ++var25) {
                  byte var26 = var17.field1527[var25] = var1.method3543(-1132613840);
                  var23 |= var26 != -1;
               }
            } else {
               for(int var27 = 0; var27 < var17.field1523; ++var27) {
                  for(int var31 = 0; var31 < var17.field1520; ++var31) {
                     var17.field1519[var17.field1523 * var31 + var27] = var1.method3543(-1132613840);
                  }
               }

               for(int var28 = 0; var28 < var17.field1523; ++var28) {
                  for(int var29 = 0; var29 < var17.field1520; ++var29) {
                     byte var30 = var17.field1527[var17.field1523 * var29 + var28] = var1.method3543(-1132613840);
                     var23 |= var30 != -1;
                  }
               }
            }

            if (!var23) {
               var17.field1527 = null;
            }
         }
      }

      return var3;
   }

   @OriginalMember(
      owner = "client!tn",
      name = "a",
      descriptor = "(Lhw;I)[Ltn;",
      line = 282
   )
   public static final class94[] method907(class141 arg0, int arg1) {
      byte[] var2 = arg0.method1331((byte)-98, arg1);
      return var2 == null ? null : method906(var2);
   }

   @OriginalMember(
      owner = "client!tn",
      name = "e",
      descriptor = "()I",
      line = 289
   )
   public final int method908() {
      return this.field1525 + this.field1520 + this.field1524;
   }

   @OriginalMember(
      owner = "client!tn",
      name = "c",
      descriptor = "(I)V",
      line = 294
   )
   public final void method909(int arg0) {
      int var2 = this.method912();
      int var3 = this.method908();
      if (this.field1523 != var2 || this.field1520 != var3) {
         int var4 = arg0;
         if (arg0 > this.field1522) {
            var4 = this.field1522;
         }

         int var5 = arg0;
         if (this.field1522 + arg0 + this.field1523 > var2) {
            var5 = var2 - this.field1522 - this.field1523;
         }

         int var6 = arg0;
         if (arg0 > this.field1525) {
            var6 = this.field1525;
         }

         int var7 = arg0;
         if (this.field1525 + arg0 + this.field1520 > var3) {
            var7 = var3 - this.field1525 - this.field1520;
         }

         int var8 = this.field1523 + var4 + var5;
         int var9 = this.field1520 + var6 + var7;
         byte[] var10 = new byte[var8 * var9];
         if (this.field1527 == null) {
            for(int var11 = 0; var11 < this.field1520; ++var11) {
               int var12 = this.field1523 * var11;
               int var13 = (var6 + var11) * var8 + var4;

               for(int var14 = 0; var14 < this.field1523; ++var14) {
                  var10[var13++] = this.field1519[var12++];
               }
            }
         } else {
            byte[] var15 = new byte[var8 * var9];

            for(int var16 = 0; var16 < this.field1520; ++var16) {
               int var17 = this.field1523 * var16;
               int var18 = (var6 + var16) * var8 + var4;

               for(int var19 = 0; var19 < this.field1523; ++var19) {
                  var15[var18] = this.field1527[var17];
                  var10[var18++] = this.field1519[var17++];
               }
            }

            this.field1527 = var15;
         }

         this.field1522 -= var4;
         this.field1525 -= var6;
         this.field1526 -= var5;
         this.field1524 -= var7;
         this.field1523 = var8;
         this.field1520 = var9;
         this.field1519 = var10;
      }
   }

   @OriginalMember(
      owner = "client!tn",
      name = "a",
      descriptor = "()V",
      line = 390
   )
   public final void method910() {
      byte[] var1 = new byte[this.field1523 * this.field1520];
      int var2 = 0;
      if (this.field1527 == null) {
         for(int var3 = 0; var3 < this.field1523; ++var3) {
            for(int var4 = this.field1520 - 1; var4 >= 0; --var4) {
               var1[var2++] = this.field1519[this.field1523 * var4 + var3];
            }
         }

         this.field1519 = var1;
      } else {
         byte[] var5 = new byte[this.field1523 * this.field1520];

         for(int var6 = 0; var6 < this.field1523; ++var6) {
            for(int var9 = this.field1520 - 1; var9 >= 0; --var9) {
               var1[var2] = this.field1519[this.field1523 * var9 + var6];
               var5[var2++] = this.field1527[this.field1523 * var9 + var6];
            }
         }

         this.field1519 = var1;
         this.field1527 = var5;
      }

      int var7 = this.field1525;
      this.field1525 = this.field1522;
      this.field1522 = this.field1524;
      this.field1524 = this.field1526;
      this.field1526 = this.field1525;
      int var8 = this.field1520;
      this.field1520 = this.field1523;
      this.field1523 = var8;
   }

   @OriginalMember(
      owner = "client!tn",
      name = "a",
      descriptor = "(I)V",
      line = 450
   )
   public final void method911(int arg0) {
      int var2 = -1;
      if (this.field1521.length < 255) {
         for(int var3 = 0; var3 < this.field1521.length; ++var3) {
            if (this.field1521[var3] == arg0) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field1521.length;
            int[] var4 = new int[this.field1521.length + 1];
            class365.method2855(this.field1521, 0, var4, 0, this.field1521.length);
            this.field1521 = var4;
            var4[var2] = arg0;
         }
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = arg0 >> 16 & 255;
         int var7 = arg0 >> 8 & 255;
         int var8 = arg0 & 255;

         for(int var9 = 0; var9 < this.field1521.length; ++var9) {
            int var13 = this.field1521[var9];
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

      for(int var10 = this.field1520 - 1; var10 > 0; --var10) {
         int var11 = this.field1523 * var10;

         for(int var12 = this.field1523 - 1; var12 > 0; --var12) {
            if (this.field1521[this.field1519[var11 + var12] & 255] == 0 && this.field1521[this.field1519[var11 + var12 - 1 - this.field1523] & 255] != 0) {
               this.field1519[var11 + var12] = (byte)var2;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!tn",
      name = "g",
      descriptor = "()I",
      line = 552
   )
   public final int method912() {
      return this.field1523 + this.field1522 + this.field1526;
   }

   @OriginalMember(
      owner = "client!tn",
      name = "a",
      descriptor = "(Lhw;II)Ltn;",
      line = 558
   )
   public static final class94 method913(class141 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method1347((byte)122, arg1, arg2);
      return var3 == null ? null : method906(var3)[0];
   }

   @OriginalMember(
      owner = "client!tn",
      name = "b",
      descriptor = "(I)V",
      line = 570
   )
   public final void method914(int arg0) {
      int var2 = -1;
      if (this.field1521.length < 255) {
         for(int var3 = 0; var3 < this.field1521.length; ++var3) {
            if (this.field1521[var3] == arg0) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field1521.length;
            int[] var4 = new int[this.field1521.length + 1];
            class365.method2855(this.field1521, 0, var4, 0, this.field1521.length);
            this.field1521 = var4;
            var4[var2] = arg0;
         }
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = arg0 >> 16 & 255;
         int var7 = arg0 >> 8 & 255;
         int var8 = arg0 & 255;

         for(int var9 = 0; var9 < this.field1521.length; ++var9) {
            int var15 = this.field1521[var9];
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
      byte[] var11 = new byte[this.field1523 * this.field1520];

      for(int var12 = 0; var12 < this.field1520; ++var12) {
         for(int var13 = 0; var13 < this.field1523; ++var13) {
            int var14 = this.field1519[var10] & 255;
            if (this.field1521[var14] == 0) {
               if (var13 > 0 && this.field1521[this.field1519[var10 - 1] & 255] != 0) {
                  var14 = var2;
               } else if (var12 > 0 && this.field1521[this.field1519[var10 - this.field1523] & 255] != 0) {
                  var14 = var2;
               } else if (var13 < this.field1523 - 1 && this.field1521[this.field1519[var10 + 1] & 255] != 0) {
                  var14 = var2;
               } else if (var12 < this.field1520 - 1 && this.field1521[this.field1519[this.field1523 + var10] & 255] != 0) {
                  var14 = var2;
               }
            }

            var11[var10++] = (byte)var14;
         }
      }

      this.field1519 = var11;
   }

   @OriginalMember(
      owner = "client!tn",
      name = "f",
      descriptor = "()[I",
      line = 696
   )
   public final int[] method915() {
      int var1 = this.method912();
      int[] var2 = new int[var1 * this.method908()];
      if (this.field1527 != null) {
         for(int var3 = 0; var3 < this.field1520; ++var3) {
            int var4 = this.field1523 * var3;
            int var5 = (this.field1525 + var3) * var1 + this.field1522;

            for(int var6 = 0; var6 < this.field1523; ++var6) {
               var2[var5++] = this.field1527[var4] << 24 | this.field1521[this.field1519[var4] & 255];
               ++var4;
            }
         }
      } else {
         for(int var7 = 0; var7 < this.field1520; ++var7) {
            int var8 = this.field1523 * var7;
            int var9 = (this.field1525 + var7) * var1 + this.field1522;

            for(int var10 = 0; var10 < this.field1523; ++var10) {
               int var11 = this.field1521[this.field1519[var8++] & 255];
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
      owner = "client!tn",
      name = "d",
      descriptor = "()V",
      line = 759
   )
   public final void method916() {
      int var1 = this.method912();
      int var2 = this.method908();
      if (this.field1523 != var1 || this.field1520 != var2) {
         byte[] var3 = new byte[var1 * var2];
         if (this.field1527 != null) {
            byte[] var4 = new byte[var1 * var2];

            for(int var5 = 0; var5 < this.field1520; ++var5) {
               int var6 = this.field1523 * var5;
               int var7 = (this.field1525 + var5) * var1 + this.field1522;

               for(int var8 = 0; var8 < this.field1523; ++var8) {
                  var3[var7] = this.field1519[var6];
                  var4[var7++] = this.field1527[var6++];
               }
            }

            this.field1527 = var4;
         } else {
            for(int var9 = 0; var9 < this.field1520; ++var9) {
               int var10 = this.field1523 * var9;
               int var11 = (this.field1525 + var9) * var1 + this.field1522;

               for(int var12 = 0; var12 < this.field1523; ++var12) {
                  var3[var11++] = this.field1519[var10++];
               }
            }
         }

         this.field1522 = this.field1526 = this.field1525 = this.field1524 = 0;
         this.field1523 = var1;
         this.field1520 = var2;
         this.field1519 = var3;
      }
   }

   @OriginalMember(
      owner = "client!tn",
      name = "b",
      descriptor = "(Lhw;II)[Ltn;",
      line = 827
   )
   public static final class94[] method917(class141 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method1347((byte)122, arg1, arg2);
      return var3 == null ? null : method906(var3);
   }

   @OriginalMember(
      owner = "client!tn",
      name = "b",
      descriptor = "()V",
      line = 838
   )
   public final void method918() {
      byte[] var1 = this.field1519;
      if (this.field1527 == null) {
         for(int var2 = this.field1520 - 1; var2 >= 0; --var2) {
            int var3 = this.field1523 * var2;
            int var4 = (var2 + 1) * this.field1523;

            while(var3 < var4) {
               --var4;
               byte var5 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var5;
               ++var3;
            }
         }
      } else {
         byte[] var6 = this.field1527;

         for(int var7 = this.field1520 - 1; var7 >= 0; --var7) {
            int var9 = this.field1523 * var7;
            int var10 = (var7 + 1) * this.field1523;

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

      int var8 = this.field1522;
      this.field1522 = this.field1526;
      this.field1526 = var8;
   }

   @OriginalMember(
      owner = "client!tn",
      name = "b",
      descriptor = "(Lhw;I)Ltn;",
      line = 901
   )
   public static final class94 method919(class141 arg0, int arg1) {
      byte[] var2 = arg0.method1331((byte)-98, arg1);
      return var2 == null ? null : method906(var2)[0];
   }
}
