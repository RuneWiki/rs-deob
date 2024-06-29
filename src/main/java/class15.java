import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class15 {
   @OriginalMember(
      owner = "client!iv",
      name = "n",
      descriptor = "I"
   )
   private int field196;
   @OriginalMember(
      owner = "client!iv",
      name = "l",
      descriptor = "I"
   )
   private int field190;
   @OriginalMember(
      owner = "client!iv",
      name = "f",
      descriptor = "I"
   )
   private int field197;
   @OriginalMember(
      owner = "client!iv",
      name = "r",
      descriptor = "Z"
   )
   private boolean field189;
   @OriginalMember(
      owner = "client!iv",
      name = "m",
      descriptor = "I"
   )
   private int field207;
   @OriginalMember(
      owner = "client!iv",
      name = "d",
      descriptor = "I"
   )
   private int field199;
   @OriginalMember(
      owner = "client!iv",
      name = "j",
      descriptor = "I"
   )
   private int field206;
   @OriginalMember(
      owner = "client!iv",
      name = "i",
      descriptor = "I"
   )
   private int field203;
   @OriginalMember(
      owner = "client!iv",
      name = "k",
      descriptor = "I"
   )
   private int field194;
   @OriginalMember(
      owner = "client!iv",
      name = "o",
      descriptor = "I"
   )
   private int field192;
   @OriginalMember(
      owner = "client!iv",
      name = "h",
      descriptor = "I"
   )
   private int field195;
   @OriginalMember(
      owner = "client!iv",
      name = "s",
      descriptor = "[I"
   )
   private static int[] field193 = new int[4];
   @OriginalMember(
      owner = "client!iv",
      name = "t",
      descriptor = "I"
   )
   private int field198;
   @OriginalMember(
      owner = "client!iv",
      name = "q",
      descriptor = "I"
   )
   private int field200;
   @OriginalMember(
      owner = "client!iv",
      name = "u",
      descriptor = "I"
   )
   private int field202;
   @OriginalMember(
      owner = "client!iv",
      name = "e",
      descriptor = "I"
   )
   private int field205;
   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "I"
   )
   public int field209;
   @OriginalMember(
      owner = "client!iv",
      name = "p",
      descriptor = "Ljq;"
   )
   private class672 field201;
   @OriginalMember(
      owner = "client!iv",
      name = "g",
      descriptor = "Ljq;"
   )
   private static class672 field204;
   @OriginalMember(
      owner = "client!iv",
      name = "b",
      descriptor = "Ljq;"
   )
   private static class672 field208;
   @OriginalMember(
      owner = "client!iv",
      name = "c",
      descriptor = "Lka;"
   )
   private static class91 field191;

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(Lha;Liv;)Z"
   )
   private final boolean method110(class610 arg0, class15 arg1) {
      if (this.field201 == null) {
         if (this.field203 == 0) {
            if (class437.field6698.method1372(-119, this.field207)) {
               int[] var3 = class437.field6698.method1374(-2395, this.field200, false, this.field207, 0.7F, this.field200);
               this.field201 = arg0.method4494((byte)46, this.field200, this.field200, this.field200, 0, var3);
            }
         } else if (this.field203 == 2) {
            this.method111(arg0, arg1);
         } else if (this.field203 == 1) {
            this.method114(arg0, arg1);
         }
      }

      return this.field201 != null;
   }

   @OriginalMember(
      owner = "client!iv",
      name = "b",
      descriptor = "(Lha;Liv;)V"
   )
   private final void method111(class610 arg0, class15 arg1) {
      class159 var3 = class489.method3795(class11.field147, this.field207, true, 0);
      if (var3 != null) {
         arg0.method626(field193);
         arg0.method629(0, 0, this.field200, this.field200);
         arg0.method655();
         arg0.method631(0, 0, this.field200, this.field200, 0, 0);
         int var4 = 0;
         int var5 = 0;
         int var6 = 256;
         if (arg1 != null) {
            if (arg1.field189) {
               var4 = -arg1.field196;
               var5 = -arg1.field190;
               var6 = -arg1.field197;
            } else {
               var4 = this.field196 - arg1.field196;
               var5 = this.field190 - arg1.field190;
               var6 = this.field197 - arg1.field197;
            }
         }

         if (this.field205 != 0) {
            int var7 = -this.field205 & 16383;
            int var8 = class83.field1196[var7];
            int var9 = class83.field1194[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
         }

         if (this.field198 != 0) {
            int var11 = -this.field198 & 16383;
            int var12 = class83.field1196[var11];
            int var13 = class83.field1194[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
         }

         arg0.method679(1.0F);
         arg0.method656(this.field199, 1.0F, 1.0F, (float)var4, (float)var5, (float)var6);
         var3.method1434(this.field195 & 16383, this.field192 & 16383, 733, this.field194 & 16383);
         class91 var15 = arg0.method614(var3, 2048, 0, 64, 768);
         int var16 = var15.method876() - var15.method902();
         int var17 = var15.method871() - var15.method911();
         int var18 = var16 > var17 ? var16 : var17;
         int var19 = this.field200 * 1024 / var18;
         int[] var20 = arg0.method669();
         arg0.method639(this.field200 / 2, this.field200 / 2, var19, var19);
         arg0.method688(arg0.method624());
         class401 var21 = arg0.method640();
         var21.method1542(0, 0, arg0.method635() - var15.method918());
         var15.method905(var21, (class49)null, arg0.method635(), 1);
         this.field201 = arg0.method630(0, 0, this.field200, this.field200, true);
         this.field201.method935(0, 0, 3);
         arg0.method639(var20[0], var20[1], var20[2], var20[3]);
         arg0.method629(field193[0], field193[1], field193[2], field193[3]);
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public final boolean method112(int arg0, int arg1, int arg2, int arg3) {
      int var8;
      int var9;
      int var10;
      if (!this.field189) {
         int var5 = this.field196 - arg0;
         int var6 = this.field190 - arg1;
         int var7 = this.field197 - arg2;
         this.field209 = (int)Math.sqrt((double)(var7 * var7 + var5 * var5 + var6 * var6));
         if (this.field209 == 0) {
            this.field209 = 1;
         }

         var8 = (var5 << 8) / this.field209;
         var9 = (var6 << 8) / this.field209;
         var10 = (var7 << 8) / this.field209;
      } else {
         this.field209 = 1073741823;
         var8 = this.field196;
         var9 = this.field190;
         var10 = this.field197;
      }

      int var11 = (int)(Math.sqrt((double)(var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
      if (var11 > 128) {
         var8 = (var8 << 16) / var11;
         var9 = (var9 << 16) / var11;
         var10 = (var10 << 16) / var11;
         this.field202 = this.field206 * arg3 / (this.field189 ? 1024 : this.field209);
      } else {
         this.field202 = 0;
      }

      if (this.field202 < 8) {
         this.field201 = null;
         return false;
      } else {
         int var12 = class510.method3964(this.field202, (byte)118);
         if (var12 > arg3) {
            var12 = class652.method4773(arg3, (byte)-44);
         }

         if (var12 > 512) {
            var12 = 512;
         }

         if (this.field200 != var12) {
            this.field200 = var12;
         }

         this.field205 = (int)(Math.asin((double)((float)var9 / 256.0F)) * 2607.5945876176133D) & 16383;
         this.field198 = (int)(Math.atan2((double)var8, (double)(-var10)) * 2607.5945876176133D) & 16383;
         this.field201 = null;
         return true;
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "b",
      descriptor = "(Lha;)V"
   )
   private static final void method113(class610 arg0) {
      if (field204 == null) {
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

         field204 = arg0.method4494((byte)31, 128, 128, 128, 0, var2);
         field208 = arg0.method4494((byte)-66, 128, 128, 128, 0, var1);
      }

   }

   @OriginalMember(
      owner = "client!iv",
      name = "c",
      descriptor = "(Lha;Liv;)V"
   )
   private final void method114(class610 arg0, class15 arg1) {
      method116(arg0);
      method113(arg0);
      arg0.method626(field193);
      arg0.method629(0, 0, this.field200, this.field200);
      arg0.method655();
      arg0.method631(0, 0, this.field200, this.field200, -16777216 | this.field199, 0);
      int var3 = 0;
      int var4 = 0;
      int var5 = 256;
      if (arg1 != null) {
         if (arg1.field189) {
            var3 = -arg1.field196;
            var4 = -arg1.field190;
            var5 = -arg1.field197;
         } else {
            var3 = arg1.field196 - this.field196;
            var4 = arg1.field190 - this.field190;
            var5 = arg1.field197 - this.field197;
         }
      }

      if (this.field205 != 0) {
         int var6 = class83.field1196[this.field205];
         int var7 = class83.field1194[this.field205];
         int var8 = var4 * var7 - var5 * var6 >> 14;
         var5 = var4 * var6 + var5 * var7 >> 14;
         var4 = var8;
      }

      if (this.field198 != 0) {
         int var9 = class83.field1196[this.field198];
         int var10 = class83.field1194[this.field198];
         int var11 = var3 * var10 + var5 * var9 >> 14;
         var5 = var5 * var10 - var3 * var9 >> 14;
         var3 = var11;
      }

      class91 var12 = field191.method868((byte)0, 51200, true);
      var12.method922((short)0, (short)this.field207);
      arg0.method679(1.0F);
      arg0.method656(16777215, 1.0F, 1.0F, (float)var3, (float)var4, (float)var5);
      int var13 = this.field200 * 1024 / (var12.method876() - var12.method902());
      if (this.field199 != 0) {
         var13 = var13 * 13 / 16;
      }

      int[] var14 = arg0.method669();
      arg0.method639(this.field200 / 2, this.field200 / 2, var13, var13);
      arg0.method688(arg0.method624());
      class401 var15 = arg0.method624();
      var15.method1542(0, 0, arg0.method635() - var12.method918());
      var12.method905(var15, (class49)null, 1024, 1);
      int var16 = this.field200 * 13 / 16;
      int var17 = (this.field200 - var16) / 2;
      field208.method4953(var17, var17, var16, var16, 0, -16777216 | this.field199, 1);
      this.field201 = arg0.method630(0, 0, this.field200, this.field200, true);
      arg0.method655();
      arg0.method631(0, 0, this.field200, this.field200, 0, 0);
      field204.method4953(0, 0, this.field200, this.field200, 1, 0, 0);
      this.field201.method935(0, 0, 3);
      arg0.method639(var14[0], var14[1], var14[2], var14[3]);
      arg0.method629(field193[0], field193[1], field193[2], field193[3]);
   }

   @OriginalMember(
      owner = "client!iv",
      name = "d",
      descriptor = "(Lha;Liv;)Z"
   )
   public final boolean method115(class610 arg0, class15 arg1) {
      return this.field201 != null || this.method110(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(Lha;)V"
   )
   private static final void method116(class610 arg0) {
      if (field191 == null) {
         class159 var1 = new class159(580, 1104, 1);
         var1.method1429((short)1024, (short)0, (short)1024, (byte)0, false, (byte)0, (short)0, (short)1024, (byte)0, (short)32767);
         var1.method1436(128, 0, false, 0);
         var1.method1436(-128, 0, false, 0);

         for(int var2 = 0; var2 <= 24; ++var2) {
            int var3 = var2 * 8192 / 24;
            int var4 = class83.field1196[var3];
            int var5 = class83.field1194[var3];

            for(int var6 = 1; var6 < 24; ++var6) {
               int var12 = var6 * 8192 / 24;
               int var13 = class83.field1194[var12] >> 7;
               int var14 = class83.field1196[var12] * var4 >> 21;
               int var15 = class83.field1196[var12] * var5 >> 21;
               var1.method1436(var13, var15, false, -var14);
            }

            if (var2 > 0) {
               int var7 = var2 * 23 + 2;
               int var8 = var7 - 23;
               var1.method1427((byte)0, 0, (byte)0, (byte)127, (short)0, (byte)0, var7, var8, (short)127);

               for(int var9 = 1; var9 < 23; ++var9) {
                  int var10 = var8 + 1;
                  int var11 = var7 + 1;
                  var1.method1427((byte)0, var8, (byte)0, (byte)-21, (short)0, (byte)0, var7, var10, (short)127);
                  var1.method1427((byte)0, var10, (byte)0, (byte)120, (short)0, (byte)0, var7, var11, (short)127);
                  var8 = var10;
                  var7 = var11;
               }

               var1.method1427((byte)0, var7, (byte)0, (byte)-126, (short)0, (byte)0, 1, var8, (short)127);
            }
         }

         var1.field2391 = var1.field2384;
         var1.field2364 = null;
         var1.field2376 = null;
         var1.field2388 = null;
         field191 = arg0.method614(var1, 51200, 33, 64, 768);
      }

   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "()V"
   )
   public static void method117() {
      field191 = null;
      field208 = null;
      field204 = null;
      field193 = null;
   }

   @OriginalMember(
      owner = "client!iv",
      name = "b",
      descriptor = "()V"
   )
   public static final void method118() {
      field191 = null;
      field204 = null;
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(Lha;IIIIIIIIII)V"
   )
   public final void method119(class610 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      if (this.field201 != null) {
         int[] var12 = new int[3];
         int var13 = -(this.field196 - arg7 << 16);
         int var14 = this.field190 - arg8 << 15;
         int var15 = -(this.field197 - arg9 << 16);
         class401 var16 = arg0.method605();
         var16.method1550(0, 0, 0, var12);
         int var17 = var12[0] + var13;
         int var18 = var12[1] + var14;
         int var19 = var12[2] + var15;
         arg0.method600(var17, var18, var19, var12);
         if (var12[2] >= 0) {
            int var20 = var12[0] - this.field202 / 2;
            int var21 = var12[1] - this.field202 / 2;
            if (var21 < arg4 && this.field202 + var21 > 0 && var20 < arg3 && this.field202 + var20 > 0) {
               this.field201.method4953(var20, var21, this.field202, this.field202, 0, arg10 << 24 | 16777215, 1);
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "<init>",
      descriptor = "(IIIIIIIZIII)V"
   )
   public class15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
      this.field196 = arg2;
      this.field190 = arg3;
      this.field197 = arg4;
      this.field189 = arg7;
      this.field207 = arg1;
      this.field199 = arg6;
      this.field206 = arg5;
      this.field203 = arg0;
      this.field194 = arg8;
      this.field192 = arg9;
      this.field195 = arg10;
   }
}
