import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class57 extends class500 {
   @OriginalMember(
      owner = "client!dm",
      name = "k",
      descriptor = "I"
   )
   public int field616;
   @OriginalMember(
      owner = "client!dm",
      name = "m",
      descriptor = "I"
   )
   private int field613;
   @OriginalMember(
      owner = "client!dm",
      name = "o",
      descriptor = "[I"
   )
   private int[] field614;
   @OriginalMember(
      owner = "client!dm",
      name = "l",
      descriptor = "I"
   )
   public int field618;
   @OriginalMember(
      owner = "client!dm",
      name = "n",
      descriptor = "Z"
   )
   public boolean field617;
   @OriginalMember(
      owner = "client!dm",
      name = "j",
      descriptor = "[I"
   )
   private static int[] field615;

   @OriginalMember(
      owner = "client!dm",
      name = "b",
      descriptor = "()V"
   )
   public static void method436() {
      field615 = null;
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "()[I"
   )
   public final int[] method437() {
      return this.field614;
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method438(int arg0, int arg1) {
      if (arg0 != 0 || arg1 != 0) {
         if (field615 == null || field615.length != this.field614.length) {
            field615 = new int[this.field614.length];
         }

         int var3 = this.field614.length;
         int var4 = arg0;
         int var5 = this.field613 - 1;
         int var6 = this.field613 * arg1;
         int var7 = var3 - 1;

         for(int var8 = 0; var8 < var3; var8 += this.field613) {
            int var10 = var6 + var8 & var7;

            for(int var11 = 0; var11 < this.field613; ++var11) {
               int var12 = var8 + var11;
               int var13 = (var4 + var11 & var5) + var10;
               field615[var12] = this.field614[var13];
            }
         }

         int[] var9 = this.field614;
         this.field614 = field615;
         field615 = var9;
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "<init>",
      descriptor = "(II[IZ)V"
   )
   public class57(int arg0, int arg1, int[] arg2, boolean arg3) {
      this.field616 = arg0;
      this.field613 = arg1;
      this.field614 = arg2;
      if (arg3) {
         int[] var5 = new int[this.field613];
         int[] var6 = new int[this.field613];
         int[] var7 = new int[this.field613];
         int[] var8 = new int[this.field613];
         if (field615 == null || field615.length != this.field614.length) {
            field615 = new int[this.field614.length];
         }

         int var9 = this.field613;
         int var10 = this.field613;
         int var11 = var9 - 1;
         int var12 = var10 - 1;
         int var13 = var9 * var10;
         int var14 = var9;
         int var15 = var9;

         for(int var16 = 2; var16 >= 0; --var16) {
            for(int var35 = var11; var35 >= 0; --var35) {
               --var14;
               int var36 = this.field614[var14];
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
               field615[var17] = var31 << 24 | var32 << 16 | var33 << 8 | var34;
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
               int var29 = this.field614[var14];
               --var15;
               int var30 = this.field614[var15];
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

         int[] var19 = this.field614;
         this.field614 = field615;
         field615 = var19;
      }

   }
}
