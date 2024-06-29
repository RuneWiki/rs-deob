import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class671 {
   @OriginalMember(
      owner = "client!nia",
      name = "g",
      descriptor = "I"
   )
   public int field10097;
   @OriginalMember(
      owner = "client!nia",
      name = "i",
      descriptor = "I"
   )
   public int field10098;
   @OriginalMember(
      owner = "client!nia",
      name = "b",
      descriptor = "I"
   )
   public int field10100;
   @OriginalMember(
      owner = "client!nia",
      name = "e",
      descriptor = "I"
   )
   public int field10101;
   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "I"
   )
   public int field10102;
   @OriginalMember(
      owner = "client!nia",
      name = "f",
      descriptor = "I"
   )
   public int field10103;
   @OriginalMember(
      owner = "client!nia",
      name = "h",
      descriptor = "[B"
   )
   public byte[] field10095;
   @OriginalMember(
      owner = "client!nia",
      name = "d",
      descriptor = "[B"
   )
   public byte[] field10099;
   @OriginalMember(
      owner = "client!nia",
      name = "c",
      descriptor = "[I"
   )
   public int[] field10096;

   @OriginalMember(
      owner = "client!nia",
      name = "b",
      descriptor = "(I)V",
      line = 6
   )
   public final void method4880(int arg0) {
      int var2 = this.method4887();
      int var3 = this.method4885();
      if (this.field10100 != var2 || this.field10097 != var3) {
         int var4 = arg0;
         if (arg0 > this.field10103) {
            var4 = this.field10103;
         }

         int var5 = arg0;
         if (this.field10103 + arg0 + this.field10100 > var2) {
            var5 = var2 - this.field10103 - this.field10100;
         }

         int var6 = arg0;
         if (arg0 > this.field10102) {
            var6 = this.field10102;
         }

         int var7 = arg0;
         if (this.field10102 + arg0 + this.field10097 > var3) {
            var7 = var3 - this.field10102 - this.field10097;
         }

         int var8 = this.field10100 + var4 + var5;
         int var9 = this.field10097 + var6 + var7;
         byte[] var10 = new byte[var8 * var9];
         if (this.field10095 == null) {
            for(int var11 = 0; var11 < this.field10097; ++var11) {
               int var12 = this.field10100 * var11;
               int var13 = (var6 + var11) * var8 + var4;

               for(int var14 = 0; var14 < this.field10100; ++var14) {
                  var10[var13++] = this.field10099[var12++];
               }
            }
         } else {
            byte[] var15 = new byte[var8 * var9];

            for(int var16 = 0; var16 < this.field10097; ++var16) {
               int var17 = this.field10100 * var16;
               int var18 = (var6 + var16) * var8 + var4;

               for(int var19 = 0; var19 < this.field10100; ++var19) {
                  var15[var18] = this.field10095[var17];
                  var10[var18++] = this.field10099[var17++];
               }
            }

            this.field10095 = var15;
         }

         this.field10103 -= var4;
         this.field10102 -= var6;
         this.field10101 -= var5;
         this.field10098 -= var7;
         this.field10100 = var8;
         this.field10097 = var9;
         this.field10099 = var10;
      }
   }

   @OriginalMember(
      owner = "client!nia",
      name = "b",
      descriptor = "(Leaa;II)[Lnia;",
      line = 101
   )
   public static final class671[] method4881(class526 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method3899(-103, arg2, arg1);
      return var3 == null ? null : method4891(var3);
   }

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "()V",
      line = 109
   )
   public final void method4882() {
      byte[] var1 = new byte[this.field10100 * this.field10097];
      int var2 = 0;
      if (this.field10095 == null) {
         for(int var3 = 0; var3 < this.field10100; ++var3) {
            for(int var4 = this.field10097 - 1; var4 >= 0; --var4) {
               var1[var2++] = this.field10099[this.field10100 * var4 + var3];
            }
         }

         this.field10099 = var1;
      } else {
         byte[] var5 = new byte[this.field10100 * this.field10097];

         for(int var6 = 0; var6 < this.field10100; ++var6) {
            for(int var9 = this.field10097 - 1; var9 >= 0; --var9) {
               var1[var2] = this.field10099[this.field10100 * var9 + var6];
               var5[var2++] = this.field10095[this.field10100 * var9 + var6];
            }
         }

         this.field10099 = var1;
         this.field10095 = var5;
      }

      int var7 = this.field10102;
      this.field10102 = this.field10103;
      this.field10103 = this.field10098;
      this.field10098 = this.field10101;
      this.field10101 = this.field10102;
      int var8 = this.field10097;
      this.field10097 = this.field10100;
      this.field10100 = var8;
   }

   @OriginalMember(
      owner = "client!nia",
      name = "c",
      descriptor = "(I)V",
      line = 169
   )
   public final void method4883(int arg0) {
      int var2 = -1;
      if (this.field10096.length < 255) {
         for(int var3 = 0; var3 < this.field10096.length; ++var3) {
            if (this.field10096[var3] == arg0) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field10096.length;
            int[] var4 = new int[this.field10096.length + 1];
            class195.method1495(this.field10096, 0, var4, 0, this.field10096.length);
            this.field10096 = var4;
            var4[var2] = arg0;
         }
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = arg0 >> 16 & 255;
         int var7 = arg0 >> 8 & 255;
         int var8 = arg0 & 255;

         for(int var9 = 0; var9 < this.field10096.length; ++var9) {
            int var15 = this.field10096[var9];
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
      byte[] var11 = new byte[this.field10100 * this.field10097];

      for(int var12 = 0; var12 < this.field10097; ++var12) {
         for(int var13 = 0; var13 < this.field10100; ++var13) {
            int var14 = this.field10099[var10] & 255;
            if (this.field10096[var14] == 0) {
               if (var13 > 0 && this.field10096[this.field10099[var10 - 1] & 255] != 0) {
                  var14 = var2;
               } else if (var12 > 0 && this.field10096[this.field10099[var10 - this.field10100] & 255] != 0) {
                  var14 = var2;
               } else if (var13 < this.field10100 - 1 && this.field10096[this.field10099[var10 + 1] & 255] != 0) {
                  var14 = var2;
               } else if (var12 < this.field10097 - 1 && this.field10096[this.field10099[this.field10100 + var10] & 255] != 0) {
                  var14 = var2;
               }
            }

            var11[var10++] = (byte)var14;
         }
      }

      this.field10099 = var11;
   }

   @OriginalMember(
      owner = "client!nia",
      name = "b",
      descriptor = "(Leaa;I)[Lnia;",
      line = 295
   )
   public static final class671[] method4884(class526 arg0, int arg1) {
      byte[] var2 = arg0.method3888((byte)40, arg1);
      return var2 == null ? null : method4891(var2);
   }

   @OriginalMember(
      owner = "client!nia",
      name = "d",
      descriptor = "()I",
      line = 303
   )
   public final int method4885() {
      return this.field10102 + this.field10097 + this.field10098;
   }

   @OriginalMember(
      owner = "client!nia",
      name = "g",
      descriptor = "()V",
      line = 309
   )
   public final void method4886() {
      byte[] var1 = this.field10099;
      if (this.field10095 == null) {
         for(int var2 = this.field10097 - 1; var2 >= 0; --var2) {
            int var3 = this.field10100 * var2;
            int var4 = (var2 + 1) * this.field10100;

            while(var3 < var4) {
               --var4;
               byte var5 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var5;
               ++var3;
            }
         }
      } else {
         byte[] var6 = this.field10095;

         for(int var7 = this.field10097 - 1; var7 >= 0; --var7) {
            int var9 = this.field10100 * var7;
            int var10 = (var7 + 1) * this.field10100;

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

      int var8 = this.field10103;
      this.field10103 = this.field10101;
      this.field10101 = var8;
   }

   @OriginalMember(
      owner = "client!nia",
      name = "b",
      descriptor = "()I",
      line = 370
   )
   public final int method4887() {
      return this.field10103 + this.field10100 + this.field10101;
   }

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "(I)V",
      line = 374
   )
   public final void method4888(int arg0) {
      int var2 = -1;
      if (this.field10096.length < 255) {
         for(int var3 = 0; var3 < this.field10096.length; ++var3) {
            if (this.field10096[var3] == arg0) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field10096.length;
            int[] var4 = new int[this.field10096.length + 1];
            class195.method1495(this.field10096, 0, var4, 0, this.field10096.length);
            this.field10096 = var4;
            var4[var2] = arg0;
         }
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = arg0 >> 16 & 255;
         int var7 = arg0 >> 8 & 255;
         int var8 = arg0 & 255;

         for(int var9 = 0; var9 < this.field10096.length; ++var9) {
            int var13 = this.field10096[var9];
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

      for(int var10 = this.field10097 - 1; var10 > 0; --var10) {
         int var11 = this.field10100 * var10;

         for(int var12 = this.field10100 - 1; var12 > 0; --var12) {
            if (this.field10096[this.field10099[var11 + var12] & 255] == 0 && this.field10096[this.field10099[var11 + var12 - 1 - this.field10100] & 255] != 0) {
               this.field10099[var11 + var12] = (byte)var2;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!nia",
      name = "e",
      descriptor = "()V",
      line = 478
   )
   public final void method4889() {
      byte[] var1 = this.field10099;
      if (this.field10095 == null) {
         for(int var2 = (this.field10097 >> 1) - 1; var2 >= 0; --var2) {
            int var3 = this.field10100 * var2;
            int var4 = (this.field10097 - var2 - 1) * this.field10100;

            for(int var5 = -this.field10100; var5 < 0; ++var5) {
               byte var6 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var6;
               ++var3;
               ++var4;
            }
         }
      } else {
         byte[] var7 = this.field10095;

         for(int var8 = (this.field10097 >> 1) - 1; var8 >= 0; --var8) {
            int var10 = this.field10100 * var8;
            int var11 = (this.field10097 - var8 - 1) * this.field10100;

            for(int var12 = -this.field10100; var12 < 0; ++var12) {
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

      int var9 = this.field10102;
      this.field10102 = this.field10098;
      this.field10098 = var9;
   }

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "(Leaa;I)Lnia;",
      line = 549
   )
   public static final class671 method4890(class526 arg0, int arg1) {
      byte[] var2 = arg0.method3888((byte)40, arg1);
      return var2 == null ? null : method4891(var2)[0];
   }

   @OriginalMember(
      owner = "client!nia",
      name = "a",
      descriptor = "([B)[Lnia;",
      line = 562
   )
   private static final class671[] method4891(byte[] arg0) {
      class128 var1 = new class128(arg0);
      var1.field1590 = arg0.length - 2;
      int var2 = var1.method1038((byte)-121);
      class671[] var3 = new class671[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = new class671();
      }

      var1.field1590 = arg0.length - 7 - var2 * 8;
      int var5 = var1.method1038((byte)-105);
      int var6 = var1.method1038((byte)-110);
      int var7 = (var1.method1104(255) & 255) + 1;

      for(int var8 = 0; var8 < var2; ++var8) {
         var3[var8].field10103 = var1.method1038((byte)-95);
      }

      for(int var9 = 0; var9 < var2; ++var9) {
         var3[var9].field10102 = var1.method1038((byte)-103);
      }

      for(int var10 = 0; var10 < var2; ++var10) {
         var3[var10].field10100 = var1.method1038((byte)-107);
      }

      for(int var11 = 0; var11 < var2; ++var11) {
         var3[var11].field10097 = var1.method1038((byte)-118);
      }

      for(int var12 = 0; var12 < var2; ++var12) {
         class671 var32 = var3[var12];
         var32.field10101 = var5 - var32.field10100 - var32.field10103;
         var32.field10098 = var6 - var32.field10097 - var32.field10102;
      }

      var1.field1590 = arg0.length - 7 - var2 * 8 - (var7 - 1) * 3;
      int[] var13 = new int[var7];

      for(int var14 = 1; var14 < var7; ++var14) {
         var13[var14] = var1.method1077(-33);
         if (var13[var14] == 0) {
            var13[var14] = 1;
         }
      }

      for(int var15 = 0; var15 < var2; ++var15) {
         var3[var15].field10096 = var13;
      }

      var1.field1590 = 0;

      for(int var16 = 0; var16 < var2; ++var16) {
         class671 var17 = var3[var16];
         int var18 = var17.field10100 * var17.field10097;
         var17.field10099 = new byte[var18];
         int var19 = var1.method1104(255);
         if ((var19 & 2) == 0) {
            if ((var19 & 1) == 0) {
               for(int var20 = 0; var20 < var18; ++var20) {
                  var17.field10099[var20] = var1.method1047((byte)79);
               }
            } else {
               for(int var21 = 0; var21 < var17.field10100; ++var21) {
                  for(int var22 = 0; var22 < var17.field10097; ++var22) {
                     var17.field10099[var17.field10100 * var22 + var21] = var1.method1047((byte)-102);
                  }
               }
            }
         } else {
            boolean var23 = false;
            var17.field10095 = new byte[var18];
            if ((var19 & 1) == 0) {
               for(int var24 = 0; var24 < var18; ++var24) {
                  var17.field10099[var24] = var1.method1047((byte)106);
               }

               for(int var25 = 0; var25 < var18; ++var25) {
                  byte var26 = var17.field10095[var25] = var1.method1047((byte)-104);
                  var23 |= var26 != -1;
               }
            } else {
               for(int var27 = 0; var27 < var17.field10100; ++var27) {
                  for(int var31 = 0; var31 < var17.field10097; ++var31) {
                     var17.field10099[var17.field10100 * var31 + var27] = var1.method1047((byte)-103);
                  }
               }

               for(int var28 = 0; var28 < var17.field10100; ++var28) {
                  for(int var29 = 0; var29 < var17.field10097; ++var29) {
                     byte var30 = var17.field10095[var17.field10100 * var29 + var28] = var1.method1047((byte)39);
                     var23 |= var30 != -1;
                  }
               }
            }

            if (!var23) {
               var17.field10095 = null;
            }
         }
      }

      return var3;
   }

   @OriginalMember(
      owner = "client!nia",
      name = "f",
      descriptor = "()V",
      line = 771
   )
   public final void method4892() {
      int var1 = this.method4887();
      int var2 = this.method4885();
      if (this.field10100 != var1 || this.field10097 != var2) {
         byte[] var3 = new byte[var1 * var2];
         if (this.field10095 != null) {
            byte[] var4 = new byte[var1 * var2];

            for(int var5 = 0; var5 < this.field10097; ++var5) {
               int var6 = this.field10100 * var5;
               int var7 = (this.field10102 + var5) * var1 + this.field10103;

               for(int var8 = 0; var8 < this.field10100; ++var8) {
                  var3[var7] = this.field10099[var6];
                  var4[var7++] = this.field10095[var6++];
               }
            }

            this.field10095 = var4;
         } else {
            for(int var9 = 0; var9 < this.field10097; ++var9) {
               int var10 = this.field10100 * var9;
               int var11 = (this.field10102 + var9) * var1 + this.field10103;

               for(int var12 = 0; var12 < this.field10100; ++var12) {
                  var3[var11++] = this.field10099[var10++];
               }
            }
         }

         this.field10103 = this.field10101 = this.field10102 = this.field10098 = 0;
         this.field10100 = var1;
         this.field10097 = var2;
         this.field10099 = var3;
      }
   }

   @OriginalMember(
      owner = "client!nia",
      name = "c",
      descriptor = "()[I",
      line = 840
   )
   public final int[] method4893() {
      int var1 = this.method4887();
      int[] var2 = new int[var1 * this.method4885()];
      if (this.field10095 != null) {
         for(int var3 = 0; var3 < this.field10097; ++var3) {
            int var4 = this.field10100 * var3;
            int var5 = (this.field10102 + var3) * var1 + this.field10103;

            for(int var6 = 0; var6 < this.field10100; ++var6) {
               var2[var5++] = this.field10095[var4] << 24 | this.field10096[this.field10099[var4] & 255];
               ++var4;
            }
         }
      } else {
         for(int var7 = 0; var7 < this.field10097; ++var7) {
            int var8 = this.field10100 * var7;
            int var9 = (this.field10102 + var7) * var1 + this.field10103;

            for(int var10 = 0; var10 < this.field10100; ++var10) {
               int var11 = this.field10096[this.field10099[var8++] & 255];
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
      owner = "client!nia",
      name = "a",
      descriptor = "(Leaa;II)Lnia;",
      line = 903
   )
   public static final class671 method4894(class526 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method3899(-53, arg2, arg1);
      return var3 == null ? null : method4891(var3)[0];
   }
}
