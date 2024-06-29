import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class378 {
   @OriginalMember(
      owner = "client!rr",
      name = "d",
      descriptor = "I"
   )
   private int field5629;
   @OriginalMember(
      owner = "client!rr",
      name = "i",
      descriptor = "I"
   )
   private int field5631;
   @OriginalMember(
      owner = "client!rr",
      name = "q",
      descriptor = "I"
   )
   private int field5620;
   @OriginalMember(
      owner = "client!rr",
      name = "l",
      descriptor = "Z"
   )
   private boolean field5627;
   @OriginalMember(
      owner = "client!rr",
      name = "h",
      descriptor = "I"
   )
   private int field5619;
   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "I"
   )
   private int field5615;
   @OriginalMember(
      owner = "client!rr",
      name = "o",
      descriptor = "I"
   )
   private int field5622;
   @OriginalMember(
      owner = "client!rr",
      name = "k",
      descriptor = "I"
   )
   private int field5618;
   @OriginalMember(
      owner = "client!rr",
      name = "m",
      descriptor = "[I"
   )
   private static int[] field5614 = new int[4];
   @OriginalMember(
      owner = "client!rr",
      name = "c",
      descriptor = "I"
   )
   private int field5617;
   @OriginalMember(
      owner = "client!rr",
      name = "g",
      descriptor = "I"
   )
   private int field5621;
   @OriginalMember(
      owner = "client!rr",
      name = "e",
      descriptor = "I"
   )
   public int field5624;
   @OriginalMember(
      owner = "client!rr",
      name = "r",
      descriptor = "I"
   )
   private int field5625;
   @OriginalMember(
      owner = "client!rr",
      name = "b",
      descriptor = "I"
   )
   private int field5628;
   @OriginalMember(
      owner = "client!rr",
      name = "n",
      descriptor = "Ltd;"
   )
   private class476 field5623;
   @OriginalMember(
      owner = "client!rr",
      name = "j",
      descriptor = "Ltd;"
   )
   private static class476 field5626;
   @OriginalMember(
      owner = "client!rr",
      name = "p",
      descriptor = "Ltd;"
   )
   private static class476 field5630;
   @OriginalMember(
      owner = "client!rr",
      name = "f",
      descriptor = "Lka;"
   )
   private static class495 field5616;

   @OriginalMember(
      owner = "client!rr",
      name = "b",
      descriptor = "(Lha;Lrr;)V"
   )
   private final void method2951(class65 arg0, class378 arg1) {
      method2961(arg0);
      method2960(arg0);
      arg0.method254(field5614);
      arg0.method333(0, 0, this.field5621, this.field5621);
      arg0.method380();
      arg0.method295(0, 0, this.field5621, this.field5621, -16777216 | this.field5615, 0);
      int var3 = 0;
      int var4 = 0;
      int var5 = 256;
      if (arg1 != null) {
         if (arg1.field5627) {
            var3 = -arg1.field5629;
            var4 = -arg1.field5631;
            var5 = -arg1.field5620;
         } else {
            var3 = arg1.field5629 - this.field5629;
            var4 = arg1.field5631 - this.field5631;
            var5 = arg1.field5620 - this.field5620;
         }
      }

      if (this.field5617 != 0) {
         int var6 = class593.field8539[this.field5617];
         int var7 = class593.field8548[this.field5617];
         int var8 = var4 * var7 - var5 * var6 >> 14;
         var5 = var4 * var6 + var5 * var7 >> 14;
         var4 = var8;
      }

      if (this.field5625 != 0) {
         int var9 = class593.field8539[this.field5625];
         int var10 = class593.field8548[this.field5625];
         int var11 = var3 * var10 + var5 * var9 >> 14;
         var5 = var5 * var10 - var3 * var9 >> 14;
         var3 = var11;
      }

      class495 var12 = field5616.method549((byte)0, 51200, true);
      var12.method502((short)0, (short)this.field5619);
      arg0.method297(1.0F);
      arg0.method337(16777215, 1.0F, 1.0F, (float)var3, (float)var4, (float)var5);
      int var13 = this.field5621 * 1024 / (var12.method531() - var12.method528());
      if (this.field5615 != 0) {
         var13 = var13 * 13 / 16;
      }

      arg0.method429(this.field5621 / 2, this.field5621 / 2, var13, var13);
      arg0.method338(arg0.method432());
      class173 var14 = arg0.method432();
      var14.method1008(0, 0, arg0.method291() - var12.method517());
      var12.method552(var14, (class362)null, 1024, 1);
      int var15 = this.field5621 * 13 / 16;
      int var16 = (this.field5621 - var15) / 2;
      field5626.method3605(var16, var16, var15, var15, 0, -16777216 | this.field5615, 1);
      this.field5623 = arg0.method342(0, 0, this.field5621, this.field5621, true);
      arg0.method380();
      arg0.method295(0, 0, this.field5621, this.field5621, 0, 0);
      field5630.method3605(0, 0, this.field5621, this.field5621, 1, 0, 0);
      this.field5623.method1056(0, 0, 0);
      arg0.method333(field5614[0], field5614[1], field5614[2], field5614[3]);
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public final boolean method2952(int arg0, int arg1, int arg2, int arg3) {
      int var8;
      int var9;
      int var10;
      if (!this.field5627) {
         int var5 = this.field5629 - arg0;
         int var6 = this.field5631 - arg1;
         int var7 = this.field5620 - arg2;
         this.field5624 = (int)Math.sqrt((double)(var7 * var7 + var5 * var5 + var6 * var6));
         if (this.field5624 == 0) {
            this.field5624 = 1;
         }

         var8 = (var5 << 8) / this.field5624;
         var9 = (var6 << 8) / this.field5624;
         var10 = (var7 << 8) / this.field5624;
      } else {
         this.field5624 = 1073741823;
         var8 = this.field5629;
         var9 = this.field5631;
         var10 = this.field5620;
      }

      int var11 = (int)(Math.sqrt((double)(var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
      if (var11 > 128) {
         var8 = (var8 << 16) / var11;
         var9 = (var9 << 16) / var11;
         var10 = (var10 << 16) / var11;
         this.field5628 = this.field5622 * arg3 / (this.field5627 ? 1024 : this.field5624);
      } else {
         this.field5628 = 0;
      }

      if (this.field5628 < 8) {
         this.field5623 = null;
         return false;
      } else {
         int var12 = class71.method752(this.field5628, true);
         if (var12 > arg3) {
            var12 = class223.method1872(arg3, 969328545);
         }

         if (var12 > 512) {
            var12 = 512;
         }

         if (this.field5621 != var12) {
            this.field5621 = var12;
         }

         this.field5617 = (int)(Math.asin((double)((float)var9 / 256.0F)) * 2607.5945876176133D) & 16383;
         this.field5625 = (int)(Math.atan2((double)var8, (double)(-var10)) * 2607.5945876176133D) & 16383;
         this.field5623 = null;
         return true;
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "d",
      descriptor = "(Lha;Lrr;)Z"
   )
   private final boolean method2953(class65 arg0, class378 arg1) {
      if (this.field5623 == null) {
         if (this.field5618 == 0) {
            if (class484.field7035.method1455(this.field5619, 9777)) {
               int[] var3 = class484.field7035.method1460(0.7F, this.field5621, this.field5619, false, 5517, this.field5621);
               this.field5623 = arg0.method696(this.field5621, this.field5621, 0, -60, this.field5621, var3);
            }
         } else if (this.field5618 == 2) {
            this.method2954(arg0, arg1);
         } else if (this.field5618 == 1) {
            this.method2951(arg0, arg1);
         }
      }

      return this.field5623 != null;
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(Lha;Lrr;)V"
   )
   private final void method2954(class65 arg0, class378 arg1) {
      class668 var3 = class783.method5653(0, true, class474.field6926, this.field5619);
      if (var3 != null) {
         arg0.method254(field5614);
         arg0.method333(0, 0, this.field5621, this.field5621);
         arg0.method295(0, 0, this.field5621, this.field5621, 0, 0);
         int var4 = 0;
         int var5 = 0;
         int var6 = 256;
         if (arg1 != null) {
            if (arg1.field5627) {
               var4 = -arg1.field5629;
               var5 = -arg1.field5631;
               var6 = -arg1.field5620;
            } else {
               var4 = this.field5629 - arg1.field5629;
               var5 = this.field5631 - arg1.field5631;
               var6 = this.field5620 - arg1.field5620;
            }
         }

         if (this.field5617 != 0) {
            int var7 = -this.field5617 & 16383;
            int var8 = class593.field8539[var7];
            int var9 = class593.field8548[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
         }

         if (this.field5625 != 0) {
            int var11 = -this.field5625 & 16383;
            int var12 = class593.field8539[var11];
            int var13 = class593.field8548[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
         }

         arg0.method297(1.0F);
         arg0.method337(16777215, 1.0F, 1.0F, (float)var4, (float)var5, (float)var6);
         class495 var15 = arg0.method352(var3, 2048, 0, 64, 768);
         int var16 = var15.method531() - var15.method528();
         int var17 = var15.method507() - var15.method540();
         int var18 = var15.method528() + var16 / 2;
         int var19 = var15.method540() + var17 / 2;
         int var20 = var16 > var17 ? var16 : var17;
         arg0.method429(var18, var19, var20, var20);
         arg0.method338(arg0.method432());
         class173 var21 = arg0.method255();
         var21.method1008(0, 0, arg0.method291() - var15.method517());
         var15.method552(var21, (class362)null, arg0.method291(), 1);
         this.field5623 = arg0.method342(0, 0, this.field5621, this.field5621, true);
         this.field5623.method1056(0, 0, 3);
         arg0.method333(field5614[0], field5614[1], field5614[2], field5614[3]);
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "b",
      descriptor = "()V"
   )
   public static final void method2955() {
      field5616 = null;
      field5630 = null;
   }

   @OriginalMember(
      owner = "client!rr",
      name = "c",
      descriptor = "(Lha;Lrr;)Z"
   )
   public final boolean method2956(class65 arg0, class378 arg1) {
      return this.field5623 != null || this.method2953(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "()V"
   )
   public final void method2957() {
      this.field5623 = null;
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(Lha;IIIIII)V"
   )
   public final void method2958(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (this.field5623 != null) {
         int var8 = this.field5617 - arg5 & 16383;
         int var9 = this.field5625 - arg6 & 16383;
         if (var9 > 8192) {
            var9 -= 16384;
         }

         if (var8 > 8192) {
            var8 -= 16384;
         }

         int var10 = arg4 * var8 / 4096 + (arg4 - this.field5628) / 2;
         int var11 = arg4 * var9 / -4096 + (arg3 - this.field5628) / 2;
         if (var10 < arg4 && this.field5628 + var10 > 0 && var11 < arg3 && this.field5628 + var11 > 0) {
            this.field5623.method3602(arg1 + var11, arg2 + var10, this.field5628, this.field5628);
         }

      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "c",
      descriptor = "()V"
   )
   public static void method2959() {
      field5616 = null;
      field5626 = null;
      field5630 = null;
      field5614 = null;
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(Lha;)V"
   )
   private static final void method2960(class65 arg0) {
      if (field5630 == null) {
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

         field5630 = arg0.method696(128, 128, 0, -85, 128, var2);
         field5626 = arg0.method696(128, 128, 0, -61, 128, var1);
      }

   }

   @OriginalMember(
      owner = "client!rr",
      name = "<init>",
      descriptor = "(IIIIIIIZ)V"
   )
   public class378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
      this.field5629 = arg2;
      this.field5631 = arg3;
      this.field5620 = arg4;
      this.field5627 = arg7;
      this.field5619 = arg1;
      this.field5615 = arg6;
      this.field5622 = arg5;
      this.field5618 = arg0;
   }

   @OriginalMember(
      owner = "client!rr",
      name = "b",
      descriptor = "(Lha;)V"
   )
   private static final void method2961(class65 arg0) {
      if (field5616 == null) {
         class668 var1 = new class668(580, 1104, 1);
         var1.method4872((short)1024, (short)1024, 25846, (short)0, (short)0, (short)32767, (byte)0, (byte)0, (short)1024, (byte)0);
         var1.method4874(0, (byte)-117, 0, 128);
         var1.method4874(0, (byte)-82, 0, -128);

         for(int var2 = 0; var2 <= 24; ++var2) {
            int var3 = var2 * 8192 / 24;
            int var4 = class593.field8539[var3];
            int var5 = class593.field8548[var3];

            for(int var6 = 1; var6 < 24; ++var6) {
               int var12 = var6 * 8192 / 24;
               int var13 = class593.field8548[var12] >> 7;
               int var14 = class593.field8539[var12] * var4 >> 21;
               int var15 = class593.field8539[var12] * var5 >> 21;
               var1.method4874(var15, (byte)-86, -var14, var13);
            }

            if (var2 > 0) {
               int var7 = var2 * 23 + 2;
               int var8 = var7 - 23;
               var1.method4880(var7, var8, (short)127, (byte)0, (short)0, (byte)0, 1508, (byte)0, 0);

               for(int var9 = 1; var9 < 23; ++var9) {
                  int var10 = var8 + 1;
                  int var11 = var7 + 1;
                  var1.method4880(var7, var10, (short)127, (byte)0, (short)0, (byte)0, 1508, (byte)0, var8);
                  var1.method4880(var7, var11, (short)127, (byte)0, (short)0, (byte)0, 1508, (byte)0, var10);
                  var8 = var10;
                  var7 = var11;
               }

               var1.method4880(1, var8, (short)127, (byte)0, (short)0, (byte)0, 1508, (byte)0, var7);
            }
         }

         var1.field9708 = var1.field9717;
         var1.field9711 = null;
         var1.field9697 = null;
         var1.field9727 = null;
         field5616 = arg0.method352(var1, 51200, 33, 64, 768);
      }

   }
}
