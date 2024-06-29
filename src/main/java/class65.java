import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class65 {
   @OriginalMember(
      owner = "client!u",
      name = "d",
      descriptor = "I"
   )
   public int field814;
   @OriginalMember(
      owner = "client!u",
      name = "c",
      descriptor = "I"
   )
   public int field816;
   @OriginalMember(
      owner = "client!u",
      name = "i",
      descriptor = "I"
   )
   public int field817;
   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "I"
   )
   public int field819;
   @OriginalMember(
      owner = "client!u",
      name = "e",
      descriptor = "I"
   )
   public int field820;
   @OriginalMember(
      owner = "client!u",
      name = "g",
      descriptor = "I"
   )
   public int field821;
   @OriginalMember(
      owner = "client!u",
      name = "f",
      descriptor = "[B"
   )
   public byte[] field815;
   @OriginalMember(
      owner = "client!u",
      name = "b",
      descriptor = "[B"
   )
   public byte[] field818;
   @OriginalMember(
      owner = "client!u",
      name = "h",
      descriptor = "[I"
   )
   public int[] field813;

   @OriginalMember(
      owner = "client!u",
      name = "f",
      descriptor = "()I"
   )
   public final int method576() {
      return this.field820 + this.field814 + this.field821;
   }

   @OriginalMember(
      owner = "client!u",
      name = "b",
      descriptor = "(Lww;I)Lu;"
   )
   public static final class65 method577(class339 arg0, int arg1) {
      byte[] var2 = arg0.method2700(arg1, -2);
      return var2 == null ? null : method587(var2)[0];
   }

   @OriginalMember(
      owner = "client!u",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method578(int arg0) {
      int var2 = -1;
      if (this.field813.length < 255) {
         for(int var3 = 0; var3 < this.field813.length; ++var3) {
            if (this.field813[var3] == arg0) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field813.length;
            int[] var4 = new int[this.field813.length + 1];
            class349.method2759(this.field813, 0, var4, 0, this.field813.length);
            this.field813 = var4;
            var4[var2] = arg0;
         }
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = arg0 >> 16 & 255;
         int var7 = arg0 >> 8 & 255;
         int var8 = arg0 & 255;

         for(int var9 = 0; var9 < this.field813.length; ++var9) {
            int var15 = this.field813[var9];
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
      byte[] var11 = new byte[this.field820 * this.field819];

      for(int var12 = 0; var12 < this.field820; ++var12) {
         for(int var13 = 0; var13 < this.field819; ++var13) {
            int var14 = this.field818[var10] & 255;
            if (this.field813[var14] == 0) {
               if (var13 > 0 && this.field813[this.field818[var10 - 1] & 255] != 0) {
                  var14 = var2;
               } else if (var12 > 0 && this.field813[this.field818[var10 - this.field819] & 255] != 0) {
                  var14 = var2;
               } else if (var13 < this.field819 - 1 && this.field813[this.field818[var10 + 1] & 255] != 0) {
                  var14 = var2;
               } else if (var12 < this.field820 - 1 && this.field813[this.field818[this.field819 + var10] & 255] != 0) {
                  var14 = var2;
               }
            }

            var11[var10++] = (byte)var14;
         }
      }

      this.field818 = var11;
   }

   @OriginalMember(
      owner = "client!u",
      name = "e",
      descriptor = "()V"
   )
   public final void method579() {
      byte[] var1 = new byte[this.field820 * this.field819];
      int var2 = 0;
      if (this.field815 == null) {
         for(int var3 = 0; var3 < this.field819; ++var3) {
            for(int var4 = this.field820 - 1; var4 >= 0; --var4) {
               var1[var2++] = this.field818[this.field819 * var4 + var3];
            }
         }

         this.field818 = var1;
      } else {
         byte[] var5 = new byte[this.field820 * this.field819];

         for(int var6 = 0; var6 < this.field819; ++var6) {
            for(int var9 = this.field820 - 1; var9 >= 0; --var9) {
               var1[var2] = this.field818[this.field819 * var9 + var6];
               var5[var2++] = this.field815[this.field819 * var9 + var6];
            }
         }

         this.field818 = var1;
         this.field815 = var5;
      }

      int var7 = this.field814;
      this.field814 = this.field816;
      this.field816 = this.field821;
      this.field821 = this.field817;
      this.field817 = this.field814;
      int var8 = this.field820;
      this.field820 = this.field819;
      this.field819 = var8;
   }

   @OriginalMember(
      owner = "client!u",
      name = "c",
      descriptor = "()V"
   )
   public final void method580() {
      byte[] var1 = this.field818;
      if (this.field815 == null) {
         for(int var2 = this.field820 - 1; var2 >= 0; --var2) {
            int var3 = this.field819 * var2;
            int var4 = (var2 + 1) * this.field819;

            while(var3 < var4) {
               --var4;
               byte var5 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var5;
               ++var3;
            }
         }
      } else {
         byte[] var6 = this.field815;

         for(int var7 = this.field820 - 1; var7 >= 0; --var7) {
            int var9 = this.field819 * var7;
            int var10 = (var7 + 1) * this.field819;

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

      int var8 = this.field816;
      this.field816 = this.field817;
      this.field817 = var8;
   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method581(int arg0) {
      int var2 = this.method583();
      int var3 = this.method576();
      if (this.field819 != var2 || this.field820 != var3) {
         int var4 = arg0;
         if (arg0 > this.field816) {
            var4 = this.field816;
         }

         int var5 = arg0;
         if (this.field816 + arg0 + this.field819 > var2) {
            var5 = var2 - this.field816 - this.field819;
         }

         int var6 = arg0;
         if (arg0 > this.field814) {
            var6 = this.field814;
         }

         int var7 = arg0;
         if (this.field814 + arg0 + this.field820 > var3) {
            var7 = var3 - this.field814 - this.field820;
         }

         int var8 = this.field819 + var4 + var5;
         int var9 = this.field820 + var6 + var7;
         byte[] var10 = new byte[var8 * var9];
         if (this.field815 == null) {
            for(int var11 = 0; var11 < this.field820; ++var11) {
               int var12 = this.field819 * var11;
               int var13 = (var6 + var11) * var8 + var4;

               for(int var14 = 0; var14 < this.field819; ++var14) {
                  var10[var13++] = this.field818[var12++];
               }
            }
         } else {
            byte[] var15 = new byte[var8 * var9];

            for(int var16 = 0; var16 < this.field820; ++var16) {
               int var17 = this.field819 * var16;
               int var18 = (var6 + var16) * var8 + var4;

               for(int var19 = 0; var19 < this.field819; ++var19) {
                  var15[var18] = this.field815[var17];
                  var10[var18++] = this.field818[var17++];
               }
            }

            this.field815 = var15;
         }

         this.field816 -= var4;
         this.field814 -= var6;
         this.field817 -= var5;
         this.field821 -= var7;
         this.field819 = var8;
         this.field820 = var9;
         this.field818 = var10;
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method582(int arg0) {
      int var2 = -1;
      if (this.field813.length < 255) {
         for(int var3 = 0; var3 < this.field813.length; ++var3) {
            if (this.field813[var3] == arg0) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            var2 = this.field813.length;
            int[] var4 = new int[this.field813.length + 1];
            class349.method2759(this.field813, 0, var4, 0, this.field813.length);
            this.field813 = var4;
            var4[var2] = arg0;
         }
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = arg0 >> 16 & 255;
         int var7 = arg0 >> 8 & 255;
         int var8 = arg0 & 255;

         for(int var9 = 0; var9 < this.field813.length; ++var9) {
            int var13 = this.field813[var9];
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

      for(int var10 = this.field820 - 1; var10 > 0; --var10) {
         int var11 = this.field819 * var10;

         for(int var12 = this.field819 - 1; var12 > 0; --var12) {
            if (this.field813[this.field818[var11 + var12] & 255] == 0 && this.field813[this.field818[var11 + var12 - 1 - this.field819] & 255] != 0) {
               this.field818[var11 + var12] = (byte)var2;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "()I"
   )
   public final int method583() {
      return this.field819 + this.field816 + this.field817;
   }

   @OriginalMember(
      owner = "client!u",
      name = "b",
      descriptor = "(Lww;II)[Lu;"
   )
   public static final class65[] method584(class339 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method2697(arg2, arg1, false);
      return var3 == null ? null : method587(var3);
   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(Lww;I)[Lu;"
   )
   public static final class65[] method585(class339 arg0, int arg1) {
      byte[] var2 = arg0.method2700(arg1, -2);
      return var2 == null ? null : method587(var2);
   }

   @OriginalMember(
      owner = "client!u",
      name = "g",
      descriptor = "()V"
   )
   public final void method586() {
      int var1 = this.method583();
      int var2 = this.method576();
      if (this.field819 != var1 || this.field820 != var2) {
         byte[] var3 = new byte[var1 * var2];
         if (this.field815 != null) {
            byte[] var4 = new byte[var1 * var2];

            for(int var5 = 0; var5 < this.field820; ++var5) {
               int var6 = this.field819 * var5;
               int var7 = (this.field814 + var5) * var1 + this.field816;

               for(int var8 = 0; var8 < this.field819; ++var8) {
                  var3[var7] = this.field818[var6];
                  var4[var7++] = this.field815[var6++];
               }
            }

            this.field815 = var4;
         } else {
            for(int var9 = 0; var9 < this.field820; ++var9) {
               int var10 = this.field819 * var9;
               int var11 = (this.field814 + var9) * var1 + this.field816;

               for(int var12 = 0; var12 < this.field819; ++var12) {
                  var3[var11++] = this.field818[var10++];
               }
            }
         }

         this.field816 = this.field817 = this.field814 = this.field821 = 0;
         this.field819 = var1;
         this.field820 = var2;
         this.field818 = var3;
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "([B)[Lu;"
   )
   private static final class65[] method587(byte[] arg0) {
      class66 var1 = new class66(arg0);
      var1.field864 = arg0.length - 2;
      int var2 = var1.method603(-2);
      class65[] var3 = new class65[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = new class65();
      }

      var1.field864 = arg0.length - 7 - var2 * 8;
      int var5 = var1.method603(-2);
      int var6 = var1.method603(-2);
      int var7 = (var1.method640(255) & 255) + 1;

      for(int var8 = 0; var8 < var2; ++var8) {
         var3[var8].field816 = var1.method603(-2);
      }

      for(int var9 = 0; var9 < var2; ++var9) {
         var3[var9].field814 = var1.method603(-2);
      }

      for(int var10 = 0; var10 < var2; ++var10) {
         var3[var10].field819 = var1.method603(-2);
      }

      for(int var11 = 0; var11 < var2; ++var11) {
         var3[var11].field820 = var1.method603(-2);
      }

      for(int var12 = 0; var12 < var2; ++var12) {
         class65 var32 = var3[var12];
         var32.field817 = var5 - var32.field819 - var32.field816;
         var32.field821 = var6 - var32.field820 - var32.field814;
      }

      var1.field864 = arg0.length - 7 - var2 * 8 - (var7 - 1) * 3;
      int[] var13 = new int[var7];

      for(int var14 = 1; var14 < var7; ++var14) {
         var13[var14] = var1.method645((byte)-26);
         if (var13[var14] == 0) {
            var13[var14] = 1;
         }
      }

      for(int var15 = 0; var15 < var2; ++var15) {
         var3[var15].field813 = var13;
      }

      var1.field864 = 0;

      for(int var16 = 0; var16 < var2; ++var16) {
         class65 var17 = var3[var16];
         int var18 = var17.field820 * var17.field819;
         var17.field818 = new byte[var18];
         int var19 = var1.method640(255);
         if ((var19 & 2) == 0) {
            if ((var19 & 1) == 0) {
               for(int var20 = 0; var20 < var18; ++var20) {
                  var17.field818[var20] = var1.method628((byte)-12);
               }
            } else {
               for(int var21 = 0; var21 < var17.field819; ++var21) {
                  for(int var22 = 0; var22 < var17.field820; ++var22) {
                     var17.field818[var17.field819 * var22 + var21] = var1.method628((byte)-12);
                  }
               }
            }
         } else {
            boolean var23 = false;
            var17.field815 = new byte[var18];
            if ((var19 & 1) == 0) {
               for(int var24 = 0; var24 < var18; ++var24) {
                  var17.field818[var24] = var1.method628((byte)-12);
               }

               for(int var25 = 0; var25 < var18; ++var25) {
                  byte var26 = var17.field815[var25] = var1.method628((byte)-12);
                  var23 |= var26 != -1;
               }
            } else {
               for(int var27 = 0; var27 < var17.field819; ++var27) {
                  for(int var31 = 0; var31 < var17.field820; ++var31) {
                     var17.field818[var17.field819 * var31 + var27] = var1.method628((byte)-12);
                  }
               }

               for(int var28 = 0; var28 < var17.field819; ++var28) {
                  for(int var29 = 0; var29 < var17.field820; ++var29) {
                     byte var30 = var17.field815[var17.field819 * var29 + var28] = var1.method628((byte)-12);
                     var23 |= var30 != -1;
                  }
               }
            }

            if (!var23) {
               var17.field815 = null;
            }
         }
      }

      return var3;
   }

   @OriginalMember(
      owner = "client!u",
      name = "d",
      descriptor = "()V"
   )
   public final void method588() {
      byte[] var1 = this.field818;
      if (this.field815 == null) {
         for(int var2 = (this.field820 >> 1) - 1; var2 >= 0; --var2) {
            int var3 = this.field819 * var2;
            int var4 = (this.field820 - var2 - 1) * this.field819;

            for(int var5 = -this.field819; var5 < 0; ++var5) {
               byte var6 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var6;
               ++var3;
               ++var4;
            }
         }
      } else {
         byte[] var7 = this.field815;

         for(int var8 = (this.field820 >> 1) - 1; var8 >= 0; --var8) {
            int var10 = this.field819 * var8;
            int var11 = (this.field820 - var8 - 1) * this.field819;

            for(int var12 = -this.field819; var12 < 0; ++var12) {
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

      int var9 = this.field814;
      this.field814 = this.field821;
      this.field821 = var9;
   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(Lww;II)Lu;"
   )
   public static final class65 method589(class339 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method2697(arg2, arg1, false);
      return var3 == null ? null : method587(var3)[0];
   }

   @OriginalMember(
      owner = "client!u",
      name = "b",
      descriptor = "()[I"
   )
   public final int[] method590() {
      int var1 = this.method583();
      int[] var2 = new int[var1 * this.method576()];
      if (this.field815 != null) {
         for(int var3 = 0; var3 < this.field820; ++var3) {
            int var4 = this.field819 * var3;
            int var5 = (this.field814 + var3) * var1 + this.field816;

            for(int var6 = 0; var6 < this.field819; ++var6) {
               var2[var5++] = this.field815[var4] << 24 | this.field813[this.field818[var4] & 255];
               ++var4;
            }
         }
      } else {
         for(int var7 = 0; var7 < this.field820; ++var7) {
            int var8 = this.field819 * var7;
            int var9 = (this.field814 + var7) * var1 + this.field816;

            for(int var10 = 0; var10 < this.field819; ++var10) {
               int var11 = this.field813[this.field818[var8++] & 255];
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
