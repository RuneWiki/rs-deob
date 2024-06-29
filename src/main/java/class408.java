import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class408 {
   @OriginalMember(
      owner = "client!bp",
      name = "r",
      descriptor = "I"
   )
   private int field5762;
   @OriginalMember(
      owner = "client!bp",
      name = "e",
      descriptor = "I"
   )
   private int field5758;
   @OriginalMember(
      owner = "client!bp",
      name = "o",
      descriptor = "I"
   )
   private int field5771;
   @OriginalMember(
      owner = "client!bp",
      name = "l",
      descriptor = "Z"
   )
   private boolean field5766;
   @OriginalMember(
      owner = "client!bp",
      name = "i",
      descriptor = "I"
   )
   private int field5765;
   @OriginalMember(
      owner = "client!bp",
      name = "q",
      descriptor = "I"
   )
   private int field5761;
   @OriginalMember(
      owner = "client!bp",
      name = "c",
      descriptor = "I"
   )
   private int field5767;
   @OriginalMember(
      owner = "client!bp",
      name = "f",
      descriptor = "I"
   )
   private int field5756;
   @OriginalMember(
      owner = "client!bp",
      name = "m",
      descriptor = "[I"
   )
   private static int[] field5760 = new int[4];
   @OriginalMember(
      owner = "client!bp",
      name = "g",
      descriptor = "I"
   )
   public int field5757;
   @OriginalMember(
      owner = "client!bp",
      name = "j",
      descriptor = "I"
   )
   private int field5759;
   @OriginalMember(
      owner = "client!bp",
      name = "d",
      descriptor = "I"
   )
   private int field5764;
   @OriginalMember(
      owner = "client!bp",
      name = "p",
      descriptor = "I"
   )
   private int field5768;
   @OriginalMember(
      owner = "client!bp",
      name = "n",
      descriptor = "I"
   )
   private int field5769;
   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "Lka;"
   )
   private static class501 field5772;
   @OriginalMember(
      owner = "client!bp",
      name = "h",
      descriptor = "Lbo;"
   )
   private static class763 field5763;
   @OriginalMember(
      owner = "client!bp",
      name = "b",
      descriptor = "Lbo;"
   )
   private static class763 field5770;
   @OriginalMember(
      owner = "client!bp",
      name = "k",
      descriptor = "Lbo;"
   )
   private class763 field5773;

   @OriginalMember(
      owner = "client!bp",
      name = "b",
      descriptor = "(Lha;Lbp;)V"
   )
   private final void method3094(class65 arg0, class408 arg1) {
      method3097(arg0);
      method3100(arg0);
      arg0.method582(field5760);
      arg0.method577(0, 0, this.field5768, this.field5768);
      arg0.method608();
      arg0.method508(0, 0, this.field5768, this.field5768, -16777216 | this.field5761, 0);
      int var3 = 0;
      int var4 = 0;
      int var5 = 256;
      if (arg1 != null) {
         if (arg1.field5766) {
            var3 = -arg1.field5762;
            var4 = -arg1.field5758;
            var5 = -arg1.field5771;
         } else {
            var3 = arg1.field5762 - this.field5762;
            var4 = arg1.field5758 - this.field5758;
            var5 = arg1.field5771 - this.field5771;
         }
      }

      if (this.field5764 != 0) {
         int var6 = class192.field2342[this.field5764];
         int var7 = class192.field2341[this.field5764];
         int var8 = var4 * var7 - var5 * var6 >> 14;
         var5 = var4 * var6 + var5 * var7 >> 14;
         var4 = var8;
      }

      if (this.field5759 != 0) {
         int var9 = class192.field2342[this.field5759];
         int var10 = class192.field2341[this.field5759];
         int var11 = var3 * var10 + var5 * var9 >> 14;
         var5 = var5 * var10 - var3 * var9 >> 14;
         var3 = var11;
      }

      class501 var12 = field5772.method338((byte)0, 51200, true);
      var12.method347((short)0, (short)this.field5765);
      arg0.method557(1.0F);
      arg0.method509(16777215, 1.0F, 1.0F, (float)var3, (float)var4, (float)var5);
      int var13 = this.field5768 * 1024 / (var12.method329() - var12.method334());
      if (this.field5761 != 0) {
         var13 = var13 * 13 / 16;
      }

      arg0.method526(this.field5768 / 2, this.field5768 / 2, var13, var13);
      arg0.method581(arg0.method603());
      class17 var14 = arg0.method603();
      var14.method143(0, 0, arg0.method567() - var12.method345());
      var12.method321(var14, (class52)null, 1024, 1);
      int var15 = this.field5768 * 13 / 16;
      int var16 = (this.field5768 - var15) / 2;
      field5770.method5486(var16, var16, var15, var15, 0, -16777216 | this.field5761, 1);
      this.field5773 = arg0.method513(0, 0, this.field5768, this.field5768, true);
      arg0.method608();
      arg0.method508(0, 0, this.field5768, this.field5768, 0, 0);
      field5763.method5486(0, 0, this.field5768, this.field5768, 1, 0, 0);
      this.field5773.method1625(0, 0, 0);
      arg0.method577(field5760[0], field5760[1], field5760[2], field5760[3]);
   }

   @OriginalMember(
      owner = "client!bp",
      name = "c",
      descriptor = "(Lha;Lbp;)V"
   )
   private final void method3095(class65 arg0, class408 arg1) {
      class200 var3 = class246.method1854(true, this.field5765, class720.field10547, 0);
      if (var3 != null) {
         arg0.method582(field5760);
         arg0.method577(0, 0, this.field5768, this.field5768);
         arg0.method508(0, 0, this.field5768, this.field5768, 0, 0);
         int var4 = 0;
         int var5 = 0;
         int var6 = 256;
         if (arg1 != null) {
            if (arg1.field5766) {
               var4 = -arg1.field5762;
               var5 = -arg1.field5758;
               var6 = -arg1.field5771;
            } else {
               var4 = this.field5762 - arg1.field5762;
               var5 = this.field5758 - arg1.field5758;
               var6 = this.field5771 - arg1.field5771;
            }
         }

         if (this.field5764 != 0) {
            int var7 = -this.field5764 & 16383;
            int var8 = class192.field2342[var7];
            int var9 = class192.field2341[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
         }

         if (this.field5759 != 0) {
            int var11 = -this.field5759 & 16383;
            int var12 = class192.field2342[var11];
            int var13 = class192.field2341[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
         }

         arg0.method557(1.0F);
         arg0.method509(16777215, 1.0F, 1.0F, (float)var4, (float)var5, (float)var6);
         class501 var15 = arg0.method573(var3, 2048, 0, 64, 768);
         int var16 = var15.method329() - var15.method334();
         int var17 = var15.method344() - var15.method366();
         int var18 = var15.method334() + var16 / 2;
         int var19 = var15.method366() + var17 / 2;
         int var20 = var16 > var17 ? var16 : var17;
         arg0.method526(var18, var19, var20, var20);
         arg0.method581(arg0.method603());
         class17 var21 = arg0.method600();
         var21.method143(0, 0, arg0.method567() - var15.method345());
         var15.method321(var21, (class52)null, arg0.method567(), 1);
         this.field5773 = arg0.method513(0, 0, this.field5768, this.field5768, true);
         this.field5773.method1625(0, 0, 3);
         arg0.method577(field5760[0], field5760[1], field5760[2], field5760[3]);
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "c",
      descriptor = "()V"
   )
   public static final void method3096() {
      field5772 = null;
      field5763 = null;
   }

   @OriginalMember(
      owner = "client!bp",
      name = "b",
      descriptor = "(Lha;)V"
   )
   private static final void method3097(class65 arg0) {
      if (field5772 == null) {
         class200 var1 = new class200(580, 1104, 1);
         var1.method1496((short)1024, (byte)-110, (short)32767, (short)0, (byte)0, (short)1024, (byte)0, (short)0, (byte)0, (short)1024);
         var1.method1509(0, 30705, 128, 0);
         var1.method1509(0, 30705, -128, 0);

         for(int var2 = 0; var2 <= 24; ++var2) {
            int var3 = var2 * 8192 / 24;
            int var4 = class192.field2342[var3];
            int var5 = class192.field2341[var3];

            for(int var6 = 1; var6 < 24; ++var6) {
               int var12 = var6 * 8192 / 24;
               int var13 = class192.field2341[var12] >> 7;
               int var14 = class192.field2342[var12] * var4 >> 21;
               int var15 = class192.field2342[var12] * var5 >> 21;
               var1.method1509(var15, 30705, var13, -var14);
            }

            if (var2 > 0) {
               int var7 = var2 * 23 + 2;
               int var8 = var7 - 23;
               var1.method1508((byte)0, (byte)0, (byte)0, var7, 0, var8, (short)0, (short)127, -78);

               for(int var9 = 1; var9 < 23; ++var9) {
                  int var10 = var8 + 1;
                  int var11 = var7 + 1;
                  var1.method1508((byte)0, (byte)0, (byte)0, var7, var8, var10, (short)0, (short)127, -107);
                  var1.method1508((byte)0, (byte)0, (byte)0, var7, var10, var11, (short)0, (short)127, -105);
                  var8 = var10;
                  var7 = var11;
               }

               var1.method1508((byte)0, (byte)0, (byte)0, 1, var7, var8, (short)0, (short)127, -93);
            }
         }

         var1.field2415 = var1.field2418;
         var1.field2446 = null;
         var1.field2447 = null;
         var1.field2443 = null;
         field5772 = arg0.method573(var1, 51200, 33, 64, 768);
      }

   }

   @OriginalMember(
      owner = "client!bp",
      name = "d",
      descriptor = "(Lha;Lbp;)Z"
   )
   public final boolean method3098(class65 arg0, class408 arg1) {
      return this.field5773 != null || this.method3102(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "()V"
   )
   public final void method3099() {
      this.field5773 = null;
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(Lha;)V"
   )
   private static final void method3100(class65 arg0) {
      if (field5763 == null) {
         int[] var1 = new int[16384];
         int[] var2 = new int[16384];

         for(int var3 = 0; var3 < 64; ++var3) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;

            for(int var9 = 0; var9 < 64; ++var9) {
               int var10 = 64 - var9;
               int var11 = var10 * var10;
               int var12 = 128 - var9 - 1;
               int var13 = 256 - (var5 + var11 << 8) / 4096;
               int var14 = var13 * 16 * 192 / 1536;
               if (var14 < 0) {
                  var14 = 0;
               } else if (var14 > 255) {
                  var14 = 255;
               }

               int var15 = var14 / 2;
               var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = -16777216 | var14 << 16;
               var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 16777215;
            }
         }

         field5763 = arg0.method525(128, var2, 128, 128, 0, 0);
         field5770 = arg0.method525(128, var1, 128, 128, 0, 0);
      }

   }

   @OriginalMember(
      owner = "client!bp",
      name = "b",
      descriptor = "()V"
   )
   public static void method3101() {
      field5772 = null;
      field5770 = null;
      field5763 = null;
      field5760 = null;
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(Lha;Lbp;)Z"
   )
   private final boolean method3102(class65 arg0, class408 arg1) {
      if (this.field5773 == null) {
         if (this.field5756 == 0) {
            if (class87.field1117.method1289((byte)-115, this.field5765)) {
               int[] var3 = class87.field1117.method1291(this.field5768, false, this.field5768, 0.7F, this.field5765, (byte)63);
               this.field5773 = arg0.method525(this.field5768, var3, this.field5768, this.field5768, 0, 0);
            }
         } else if (this.field5756 == 2) {
            this.method3095(arg0, arg1);
         } else if (this.field5756 == 1) {
            this.method3094(arg0, arg1);
         }
      }

      return this.field5773 != null;
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public final boolean method3103(int arg0, int arg1, int arg2, int arg3) {
      int var8;
      int var9;
      int var10;
      if (!this.field5766) {
         int var5 = this.field5762 - arg0;
         int var6 = this.field5758 - arg1;
         int var7 = this.field5771 - arg2;
         this.field5757 = (int)Math.sqrt((double)(var7 * var7 + var5 * var5 + var6 * var6));
         if (this.field5757 == 0) {
            this.field5757 = 1;
         }

         var8 = (var5 << 8) / this.field5757;
         var9 = (var6 << 8) / this.field5757;
         var10 = (var7 << 8) / this.field5757;
      } else {
         this.field5757 = 1073741823;
         var8 = this.field5762;
         var9 = this.field5758;
         var10 = this.field5771;
      }

      int var11 = (int)(Math.sqrt((double)(var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
      if (var11 > 128) {
         var8 = (var8 << 16) / var11;
         var9 = (var9 << 16) / var11;
         var10 = (var10 << 16) / var11;
         this.field5769 = this.field5767 * arg3 / (this.field5766 ? 1024 : this.field5757);
      } else {
         this.field5769 = 0;
      }

      if (this.field5769 < 8) {
         this.field5773 = null;
         return false;
      } else {
         int var12 = class546.method3944(10, this.field5769);
         if (var12 > arg3) {
            var12 = class558.method4015(arg3, false);
         }

         if (var12 > 512) {
            var12 = 512;
         }

         if (this.field5768 != var12) {
            this.field5768 = var12;
         }

         this.field5764 = (int)(Math.asin((double)((float)var9 / 256.0F)) * 2607.5945876176133D) & 16383;
         this.field5759 = (int)(Math.atan2((double)var8, (double)(-var10)) * 2607.5945876176133D) & 16383;
         this.field5773 = null;
         return true;
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(Lha;IIIIII)V"
   )
   public final void method3104(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (this.field5773 != null) {
         int var8 = this.field5764 - arg5 & 16383;
         int var9 = this.field5759 - arg6 & 16383;
         if (var9 > 8192) {
            var9 -= 16384;
         }

         if (var8 > 8192) {
            var8 -= 16384;
         }

         int var10 = arg4 * var8 / 4096 + (arg4 - this.field5769) / 2;
         int var11 = arg4 * var9 / -4096 + (arg3 - this.field5769) / 2;
         if (var10 < arg4 && this.field5769 + var10 > 0 && var11 < arg3 && this.field5769 + var11 > 0) {
            this.field5773.method5477(arg1 + var11, arg2 + var10, this.field5769, this.field5769);
         }

      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "<init>",
      descriptor = "(IIIIIIIZ)V"
   )
   public class408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
      this.field5762 = arg2;
      this.field5758 = arg3;
      this.field5771 = arg4;
      this.field5766 = arg7;
      this.field5765 = arg1;
      this.field5761 = arg6;
      this.field5767 = arg5;
      this.field5756 = arg0;
   }
}
