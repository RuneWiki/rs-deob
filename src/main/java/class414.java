import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class414 {
   @OriginalMember(
      owner = "client!wj",
      name = "e",
      descriptor = "I"
   )
   private int field6325;
   @OriginalMember(
      owner = "client!wj",
      name = "g",
      descriptor = "I"
   )
   private int field6338;
   @OriginalMember(
      owner = "client!wj",
      name = "d",
      descriptor = "I"
   )
   private int field6336;
   @OriginalMember(
      owner = "client!wj",
      name = "k",
      descriptor = "Z"
   )
   private boolean field6327;
   @OriginalMember(
      owner = "client!wj",
      name = "f",
      descriptor = "I"
   )
   private int field6331;
   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "I"
   )
   private int field6329;
   @OriginalMember(
      owner = "client!wj",
      name = "l",
      descriptor = "I"
   )
   private int field6341;
   @OriginalMember(
      owner = "client!wj",
      name = "m",
      descriptor = "I"
   )
   private int field6340;
   @OriginalMember(
      owner = "client!wj",
      name = "r",
      descriptor = "[I"
   )
   private static int[] field6332 = new int[4];
   @OriginalMember(
      owner = "client!wj",
      name = "n",
      descriptor = "I"
   )
   private int field6326;
   @OriginalMember(
      owner = "client!wj",
      name = "p",
      descriptor = "I"
   )
   private int field6330;
   @OriginalMember(
      owner = "client!wj",
      name = "j",
      descriptor = "I"
   )
   public int field6333;
   @OriginalMember(
      owner = "client!wj",
      name = "i",
      descriptor = "I"
   )
   private int field6335;
   @OriginalMember(
      owner = "client!wj",
      name = "q",
      descriptor = "I"
   )
   private int field6337;
   @OriginalMember(
      owner = "client!wj",
      name = "b",
      descriptor = "Lat;"
   )
   private class396 field6328;
   @OriginalMember(
      owner = "client!wj",
      name = "o",
      descriptor = "Lat;"
   )
   private static class396 field6334;
   @OriginalMember(
      owner = "client!wj",
      name = "h",
      descriptor = "Lat;"
   )
   private static class396 field6342;
   @OriginalMember(
      owner = "client!wj",
      name = "c",
      descriptor = "Lka;"
   )
   private static class497 field6339;

   @OriginalMember(
      owner = "client!wj",
      name = "b",
      descriptor = "()V",
      line = 4
   )
   public static void method3160() {
      field6339 = null;
      field6342 = null;
      field6334 = null;
      field6332 = null;
   }

   @OriginalMember(
      owner = "client!wj",
      name = "d",
      descriptor = "(Lha;Lwj;)V",
      line = 22
   )
   private final void method3161(class66 arg0, class414 arg1) {
      class134 var3 = class307.method2325(0, this.field6331, 0, class239.field3030);
      if (var3 != null) {
         arg0.method618(field6332);
         arg0.method554(0, 0, this.field6330, this.field6330);
         arg0.method645(0, 0, this.field6330, this.field6330, 0, 0);
         int var4 = 0;
         int var5 = 0;
         int var6 = 256;
         if (arg1 != null) {
            if (arg1.field6327) {
               var4 = -arg1.field6325;
               var5 = -arg1.field6338;
               var6 = -arg1.field6336;
            } else {
               var4 = this.field6325 - arg1.field6325;
               var5 = this.field6338 - arg1.field6338;
               var6 = this.field6336 - arg1.field6336;
            }
         }

         if (this.field6335 != 0) {
            int var7 = -this.field6335 & 16383;
            int var8 = class689.field10389[var7];
            int var9 = class689.field10391[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
         }

         if (this.field6326 != 0) {
            int var11 = -this.field6326 & 16383;
            int var12 = class689.field10389[var11];
            int var13 = class689.field10391[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
         }

         arg0.method654(1.0F);
         arg0.method660(16777215, 1.0F, 1.0F, (float)var4, (float)var5, (float)var6);
         class497 var15 = arg0.method547(var3, 2048, 0, 64, 768);
         int var16 = var15.method306() - var15.method344();
         int var17 = var15.method304() - var15.method339();
         int var18 = var15.method344() + var16 / 2;
         int var19 = var15.method339() + var17 / 2;
         int var20 = var16 > var17 ? var16 : var17;
         arg0.method630(var18, var19, var20, var20);
         arg0.method550(arg0.method559());
         class540 var21 = arg0.method659();
         var21.method1530(0, 0, arg0.method635() - var15.method342());
         var15.method338(var21, (class655)null, arg0.method635(), 1);
         this.field6328 = arg0.method602(0, 0, this.field6330, this.field6330, true);
         this.field6328.method263(0, 0, 3);
         arg0.method554(field6332[0], field6332[1], field6332[2], field6332[3]);
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "()V",
      line = 106
   )
   public final void method3162() {
      this.field6328 = null;
   }

   @OriginalMember(
      owner = "client!wj",
      name = "c",
      descriptor = "(Lha;Lwj;)V",
      line = 109
   )
   private final void method3163(class66 arg0, class414 arg1) {
      method3169(arg0);
      method3166(arg0);
      arg0.method618(field6332);
      arg0.method554(0, 0, this.field6330, this.field6330);
      arg0.method561();
      arg0.method645(0, 0, this.field6330, this.field6330, -16777216 | this.field6329, 0);
      int var3 = 0;
      int var4 = 0;
      int var5 = 256;
      if (arg1 != null) {
         if (arg1.field6327) {
            var3 = -arg1.field6325;
            var4 = -arg1.field6338;
            var5 = -arg1.field6336;
         } else {
            var3 = arg1.field6325 - this.field6325;
            var4 = arg1.field6338 - this.field6338;
            var5 = arg1.field6336 - this.field6336;
         }
      }

      if (this.field6335 != 0) {
         int var6 = class689.field10389[this.field6335];
         int var7 = class689.field10391[this.field6335];
         int var8 = var4 * var7 - var5 * var6 >> 14;
         var5 = var4 * var6 + var5 * var7 >> 14;
         var4 = var8;
      }

      if (this.field6326 != 0) {
         int var9 = class689.field10389[this.field6326];
         int var10 = class689.field10391[this.field6326];
         int var11 = var3 * var10 + var5 * var9 >> 14;
         var5 = var5 * var10 - var3 * var9 >> 14;
         var3 = var11;
      }

      class497 var12 = field6339.method343((byte)0, 51200, true);
      var12.method324((short)0, (short)this.field6331);
      arg0.method654(1.0F);
      arg0.method660(16777215, 1.0F, 1.0F, (float)var3, (float)var4, (float)var5);
      int var13 = this.field6330 * 1024 / (var12.method306() - var12.method344());
      if (this.field6329 != 0) {
         var13 = var13 * 13 / 16;
      }

      arg0.method630(this.field6330 / 2, this.field6330 / 2, var13, var13);
      arg0.method550(arg0.method559());
      class540 var14 = arg0.method559();
      var14.method1530(0, 0, arg0.method635() - var12.method342());
      var12.method338(var14, (class655)null, 1024, 1);
      int var15 = this.field6330 * 13 / 16;
      int var16 = (this.field6330 - var15) / 2;
      field6342.method3028(var16, var16, var15, var15, 0, -16777216 | this.field6329, 1);
      this.field6328 = arg0.method602(0, 0, this.field6330, this.field6330, true);
      arg0.method561();
      arg0.method645(0, 0, this.field6330, this.field6330, 0, 0);
      field6334.method3028(0, 0, this.field6330, this.field6330, 1, 0, 0);
      this.field6328.method263(0, 0, 0);
      arg0.method554(field6332[0], field6332[1], field6332[2], field6332[3]);
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(Lha;IIIIII)V",
      line = 196
   )
   public final void method3164(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (this.field6328 != null) {
         int var8 = this.field6335 - arg5 & 16383;
         int var9 = this.field6326 - arg6 & 16383;
         if (var9 > 8192) {
            var9 -= 16384;
         }

         if (var8 > 8192) {
            var8 -= 16384;
         }

         int var10 = arg4 * var8 / 4096 + (arg4 - this.field6337) / 2;
         int var11 = arg4 * var9 / -4096 + (arg3 - this.field6337) / 2;
         if (var10 < arg4 && this.field6337 + var10 > 0 && var11 < arg3 && this.field6337 + var11 > 0) {
            this.field6328.method3037(arg1 + var11, arg2 + var10, this.field6337, this.field6337);
         }

      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(IIII)Z",
      line = 225
   )
   public final boolean method3165(int arg0, int arg1, int arg2, int arg3) {
      int var8;
      int var9;
      int var10;
      if (!this.field6327) {
         int var5 = this.field6325 - arg0;
         int var6 = this.field6338 - arg1;
         int var7 = this.field6336 - arg2;
         this.field6333 = (int)Math.sqrt((double)(var7 * var7 + var5 * var5 + var6 * var6));
         if (this.field6333 == 0) {
            this.field6333 = 1;
         }

         var8 = (var5 << 8) / this.field6333;
         var9 = (var6 << 8) / this.field6333;
         var10 = (var7 << 8) / this.field6333;
      } else {
         this.field6333 = 1073741823;
         var8 = this.field6325;
         var9 = this.field6338;
         var10 = this.field6336;
      }

      int var11 = (int)(Math.sqrt((double)(var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
      if (var11 > 128) {
         var8 = (var8 << 16) / var11;
         var9 = (var9 << 16) / var11;
         var10 = (var10 << 16) / var11;
         this.field6337 = this.field6341 * arg3 / (this.field6327 ? 1024 : this.field6333);
      } else {
         this.field6337 = 0;
      }

      if (this.field6337 < 8) {
         this.field6328 = null;
         return false;
      } else {
         int var12 = class7.method63(this.field6337, false);
         if (var12 > arg3) {
            var12 = class605.method4419(arg3, (byte)-112);
         }

         if (var12 > 512) {
            var12 = 512;
         }

         if (this.field6330 != var12) {
            this.field6330 = var12;
         }

         this.field6335 = (int)(Math.asin((double)((float)var9 / 256.0F)) * 2607.5945876176133D) & 16383;
         this.field6326 = (int)(Math.atan2((double)var8, (double)(-var10)) * 2607.5945876176133D) & 16383;
         this.field6328 = null;
         return true;
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "b",
      descriptor = "(Lha;)V",
      line = 281
   )
   private static final void method3166(class66 arg0) {
      if (field6334 == null) {
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

         field6334 = arg0.method589(128, 0, 0, var2, 128, 128);
         field6342 = arg0.method589(128, 0, 0, var1, 128, 128);
      }

   }

   @OriginalMember(
      owner = "client!wj",
      name = "b",
      descriptor = "(Lha;Lwj;)Z",
      line = 344
   )
   private final boolean method3167(class66 arg0, class414 arg1) {
      if (this.field6328 == null) {
         if (this.field6340 == 0) {
            if (class91.field1164.method1165(this.field6331, -23239)) {
               int[] var3 = class91.field1164.method1168(0.7F, false, this.field6330, 24521, this.field6331, this.field6330);
               this.field6328 = arg0.method589(this.field6330, 0, 0, var3, this.field6330, this.field6330);
            }
         } else if (this.field6340 == 2) {
            this.method3161(arg0, arg1);
         } else if (this.field6340 == 1) {
            this.method3163(arg0, arg1);
         }
      }

      return this.field6328 != null;
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(Lha;Lwj;)Z",
      line = 378
   )
   public final boolean method3168(class66 arg0, class414 arg1) {
      return this.field6328 != null || this.method3167(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(Lha;)V",
      line = 384
   )
   private static final void method3169(class66 arg0) {
      if (field6339 == null) {
         class134 var1 = new class134(580, 1104, 1);
         var1.method1139((short)0, (byte)82, (byte)0, (short)1024, (short)1024, (short)1024, (short)32767, (byte)0, (short)0, (byte)0);
         var1.method1141(-1, 0, 0, 128);
         var1.method1141(-1, 0, 0, -128);

         for(int var2 = 0; var2 <= 24; ++var2) {
            int var3 = var2 * 8192 / 24;
            int var4 = class689.field10389[var3];
            int var5 = class689.field10391[var3];

            for(int var6 = 1; var6 < 24; ++var6) {
               int var12 = var6 * 8192 / 24;
               int var13 = class689.field10391[var12] >> 7;
               int var14 = class689.field10389[var12] * var4 >> 21;
               int var15 = class689.field10389[var12] * var5 >> 21;
               var1.method1141(-1, var15, -var14, var13);
            }

            if (var2 > 0) {
               int var7 = var2 * 23 + 2;
               int var8 = var7 - 23;
               var1.method1144((short)127, -34, (byte)0, (byte)0, var8, var7, (short)0, (byte)0, 0);

               for(int var9 = 1; var9 < 23; ++var9) {
                  int var10 = var8 + 1;
                  int var11 = var7 + 1;
                  var1.method1144((short)127, -115, (byte)0, (byte)0, var10, var7, (short)0, (byte)0, var8);
                  var1.method1144((short)127, -60, (byte)0, (byte)0, var11, var7, (short)0, (byte)0, var10);
                  var8 = var10;
                  var7 = var11;
               }

               var1.method1144((short)127, -97, (byte)0, (byte)0, var8, 1, (short)0, (byte)0, var7);
            }
         }

         var1.field1671 = var1.field1672;
         var1.field1693 = null;
         var1.field1718 = null;
         var1.field1688 = null;
         field6339 = arg0.method547(var1, 51200, 33, 64, 768);
      }

   }

   @OriginalMember(
      owner = "client!wj",
      name = "c",
      descriptor = "()V",
      line = 467
   )
   public static final void method3170() {
      field6339 = null;
      field6334 = null;
   }

   @OriginalMember(
      owner = "client!wj",
      name = "<init>",
      descriptor = "(IIIIIIIZ)V",
      line = 470
   )
   public class414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
      this.field6325 = arg2;
      this.field6338 = arg3;
      this.field6336 = arg4;
      this.field6327 = arg7;
      this.field6331 = arg1;
      this.field6329 = arg6;
      this.field6341 = arg5;
      this.field6340 = arg0;
   }
}
