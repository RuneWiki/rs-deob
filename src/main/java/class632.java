import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class632 extends class347 {
   @OriginalMember(
      owner = "client!raa",
      name = "k",
      descriptor = "I"
   )
   public int field9189;
   @OriginalMember(
      owner = "client!raa",
      name = "j",
      descriptor = "I"
   )
   private int field9184;
   @OriginalMember(
      owner = "client!raa",
      name = "i",
      descriptor = "[I"
   )
   private int[] field9187;
   @OriginalMember(
      owner = "client!raa",
      name = "m",
      descriptor = "I"
   )
   public int field9186;
   @OriginalMember(
      owner = "client!raa",
      name = "n",
      descriptor = "Z"
   )
   public boolean field9185;
   @OriginalMember(
      owner = "client!raa",
      name = "l",
      descriptor = "[I"
   )
   private static int[] field9188;

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(II)V",
      line = 4
   )
   public final void method4549(int arg0, int arg1) {
      if (arg0 != 0 || arg1 != 0) {
         if (field9188 == null || field9188.length != this.field9187.length) {
            field9188 = new int[this.field9187.length];
         }

         int var3 = this.field9187.length;
         int var4 = arg0;
         int var5 = this.field9184 - 1;
         int var6 = this.field9184 * arg1;
         int var7 = var3 - 1;

         for(int var8 = 0; var8 < var3; var8 += this.field9184) {
            int var10 = var6 + var8 & var7;

            for(int var11 = 0; var11 < this.field9184; ++var11) {
               int var12 = var8 + var11;
               int var13 = (var4 + var11 & var5) + var10;
               field9188[var12] = this.field9187[var13];
            }
         }

         int[] var9 = this.field9187;
         this.field9187 = field9188;
         field9188 = var9;
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "()[I",
      line = 51
   )
   public final int[] method4550() {
      return this.field9187;
   }

   @OriginalMember(
      owner = "client!raa",
      name = "b",
      descriptor = "()V",
      line = 55
   )
   public static void method4551() {
      field9188 = null;
   }

   @OriginalMember(
      owner = "client!raa",
      name = "<init>",
      descriptor = "(II[IZ)V",
      line = 59
   )
   public class632(int arg0, int arg1, int[] arg2, boolean arg3) {
      this.field9189 = arg0;
      this.field9184 = arg1;
      this.field9187 = arg2;
      if (arg3) {
         int[] var5 = new int[this.field9184];
         int[] var6 = new int[this.field9184];
         int[] var7 = new int[this.field9184];
         int[] var8 = new int[this.field9184];
         if (field9188 == null || field9188.length != this.field9187.length) {
            field9188 = new int[this.field9187.length];
         }

         int var9 = this.field9184;
         int var10 = this.field9184;
         int var11 = var9 - 1;
         int var12 = var10 - 1;
         int var13 = var9 * var10;
         int var14 = var9;
         int var15 = var9;

         for(int var16 = 2; var16 >= 0; --var16) {
            for(int var35 = var11; var35 >= 0; --var35) {
               --var14;
               int var36 = this.field9187[var14];
               var5[var35] += var36 >> 24 & 255;
               var6[var35] += var36 >> 16 & 255;
               var7[var35] += var36 >> 8 & 255;
               var8[var35] += var36 & 255;
            }

            if (var14 == 0) {
               var14 = var13;
            }
         }

         int var17 = var13;

         for(int var18 = var12; var18 >= 0; --var18) {
            int var20 = 1;
            int var21 = 1;
            int var22 = 0;
            int var23 = 0;
            int var24 = 0;
            int var25 = 0;

            for(int var26 = 2; var26 >= 0; --var26) {
               --var21;
               var25 += var5[var21];
               var24 += var6[var21];
               var22 += var7[var21];
               var23 += var8[var21];
               if (var21 == 0) {
                  var21 = var9;
               }
            }

            for(int var27 = var11; var27 >= 0; --var27) {
               --var21;
               --var20;
               int var31 = var25 / 9;
               int var32 = var24 / 9;
               int var33 = var22 / 9;
               int var34 = var23 / 9;
               --var17;
               field9188[var17] = var31 << 24 | var32 << 16 | var33 << 8 | var34;
               var25 += var5[var21] - var5[var20];
               var24 += var6[var21] - var6[var20];
               var23 += var8[var21] - var8[var20];
               var22 += var7[var21] - var7[var20];
               if (var21 == 0) {
                  var21 = var9;
               }

               if (var20 == 0) {
                  var20 = var9;
               }
            }

            for(int var28 = var11; var28 >= 0; --var28) {
               --var14;
               int var29 = this.field9187[var14];
               --var15;
               int var30 = this.field9187[var15];
               var5[var28] += (var29 >> 24 & 255) - (var30 >> 24 & 255);
               var6[var28] += (var29 >> 16 & 255) - (var30 >> 16 & 255);
               var7[var28] += (var29 >> 8 & 255) - (var30 >> 8 & 255);
               var8[var28] += (var29 & 255) - (var30 & 255);
            }

            if (var14 == 0) {
               var14 = var13;
            }

            if (var15 == 0) {
               var15 = var13;
            }
         }

         int[] var19 = this.field9187;
         this.field9187 = field9188;
         field9188 = var19;
      }

   }
}
