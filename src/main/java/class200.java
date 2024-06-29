import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class200 {
   @OriginalMember(
      owner = "client!eu",
      name = "d",
      descriptor = "[I"
   )
   private int[] field2538 = new int[2];
   @OriginalMember(
      owner = "client!eu",
      name = "c",
      descriptor = "[[[I"
   )
   private int[][][] field2540 = new int[2][2][4];
   @OriginalMember(
      owner = "client!eu",
      name = "g",
      descriptor = "[I"
   )
   public int[] field2542 = new int[2];
   @OriginalMember(
      owner = "client!eu",
      name = "f",
      descriptor = "[[[I"
   )
   private int[][][] field2544 = new int[2][2][4];
   @OriginalMember(
      owner = "client!eu",
      name = "b",
      descriptor = "[[F"
   )
   private static float[][] field2541 = new float[2][8];
   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "[[I"
   )
   public static int[][] field2545 = new int[2][8];
   @OriginalMember(
      owner = "client!eu",
      name = "h",
      descriptor = "F"
   )
   private static float field2543;
   @OriginalMember(
      owner = "client!eu",
      name = "e",
      descriptor = "I"
   )
   public static int field2539;

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "()V"
   )
   public static void method1654() {
      field2541 = null;
      field2545 = null;
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(IF)I"
   )
   public final int method1655(int arg0, float arg1) {
      if (arg0 == 0) {
         float var3 = (float)(this.field2538[1] - this.field2538[0]) * arg1 + (float)this.field2538[0];
         float var4 = var3 * 0.0030517578F;
         field2543 = (float)Math.pow(0.1D, (double)(var4 / 20.0F));
         field2539 = (int)(field2543 * 65536.0F);
      }

      if (this.field2542[arg0] == 0) {
         return 0;
      } else {
         float var5 = this.method1656(arg0, 0, arg1);
         field2541[arg0][0] = var5 * -2.0F * (float)Math.cos((double)this.method1659(arg0, 0, arg1));
         field2541[arg0][1] = var5 * var5;

         for(int var6 = 1; var6 < this.field2542[arg0]; ++var6) {
            float var9 = this.method1656(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float)Math.cos((double)this.method1659(arg0, var6, arg1));
            float var11 = var9 * var9;
            field2541[arg0][var6 * 2 + 1] = field2541[arg0][var6 * 2 - 1] * var11;
            field2541[arg0][var6 * 2] = field2541[arg0][var6 * 2 - 1] * var10 + field2541[arg0][var6 * 2 - 2] * var11;

            for(int var12 = var6 * 2 - 1; var12 >= 2; --var12) {
               field2541[arg0][var12] += field2541[arg0][var12 - 1] * var10 + field2541[arg0][var12 - 2] * var11;
            }

            field2541[arg0][1] += field2541[arg0][0] * var10 + var11;
            field2541[arg0][0] += var10;
         }

         if (arg0 == 0) {
            for(int var7 = 0; var7 < this.field2542[0] * 2; ++var7) {
               field2541[0][var7] *= field2543;
            }
         }

         for(int var8 = 0; var8 < this.field2542[arg0] * 2; ++var8) {
            field2545[arg0][var8] = (int)(field2541[arg0][var8] * 65536.0F);
         }

         return this.field2542[arg0] * 2;
      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "b",
      descriptor = "(IIF)F"
   )
   private final float method1656(int arg0, int arg1, float arg2) {
      float var4 = (float)(this.field2540[arg0][1][arg1] - this.field2540[arg0][0][arg1]) * arg2 + (float)this.field2540[arg0][0][arg1];
      float var5 = var4 * 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var5 / 20.0F));
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(Lgea;Ldca;)V"
   )
   public final void method1657(class66 arg0, class691 arg1) {
      int var3 = arg0.method640(255);
      this.field2542[0] = var3 >> 4;
      this.field2542[1] = var3 & 15;
      if (var3 == 0) {
         this.field2538[0] = this.field2538[1] = 0;
      } else {
         this.field2538[0] = arg0.method603(-2);
         this.field2538[1] = arg0.method603(-2);
         int var4 = arg0.method640(255);

         for(int var5 = 0; var5 < 2; ++var5) {
            for(int var8 = 0; var8 < this.field2542[var5]; ++var8) {
               this.field2544[var5][0][var8] = arg0.method603(-2);
               this.field2540[var5][0][var8] = arg0.method603(-2);
            }
         }

         for(int var6 = 0; var6 < 2; ++var6) {
            for(int var7 = 0; var7 < this.field2542[var6]; ++var7) {
               if ((var4 & 1 << var6 * 4 << var7) != 0) {
                  this.field2544[var6][1][var7] = arg0.method603(-2);
                  this.field2540[var6][1][var7] = arg0.method603(-2);
               } else {
                  this.field2544[var6][1][var7] = this.field2544[var6][0][var7];
                  this.field2540[var6][1][var7] = this.field2540[var6][0][var7];
               }
            }
         }

         if (var4 != 0 || this.field2538[1] != this.field2538[0]) {
            arg1.method5045(arg0);
         }

      }
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(F)F"
   )
   private static final float method1658(float arg0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)arg0);
      return var1 * 3.1415927F / 11025.0F;
   }

   @OriginalMember(
      owner = "client!eu",
      name = "a",
      descriptor = "(IIF)F"
   )
   private final float method1659(int arg0, int arg1, float arg2) {
      float var4 = (float)(this.field2544[arg0][1][arg1] - this.field2544[arg0][0][arg1]) * arg2 + (float)this.field2544[arg0][0][arg1];
      float var5 = var4 * 1.2207031E-4F;
      return method1658(var5);
   }
}
