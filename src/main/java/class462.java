import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class462 {
   @OriginalMember(
      owner = "client!gr",
      name = "c",
      descriptor = "[I"
   )
   public int[] field6636 = new int[2];
   @OriginalMember(
      owner = "client!gr",
      name = "h",
      descriptor = "[[[I"
   )
   private int[][][] field6641 = new int[2][2][4];
   @OriginalMember(
      owner = "client!gr",
      name = "e",
      descriptor = "[I"
   )
   private int[] field6637 = new int[2];
   @OriginalMember(
      owner = "client!gr",
      name = "f",
      descriptor = "[[[I"
   )
   private int[][][] field6638 = new int[2][2][4];
   @OriginalMember(
      owner = "client!gr",
      name = "g",
      descriptor = "[[F"
   )
   private static float[][] field6639 = new float[2][8];
   @OriginalMember(
      owner = "client!gr",
      name = "b",
      descriptor = "[[I"
   )
   public static int[][] field6643 = new int[2][8];
   @OriginalMember(
      owner = "client!gr",
      name = "d",
      descriptor = "F"
   )
   private static float field6642;
   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "I"
   )
   public static int field6640;

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(F)F"
   )
   private static final float method3354(float arg0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)arg0);
      return var1 * 3.1415927F / 11025.0F;
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(Lwf;Lhea;)V"
   )
   public final void method3355(class147 arg0, class449 arg1) {
      int var3 = arg0.method1143(-15465);
      this.field6636[0] = var3 >> 4;
      this.field6636[1] = var3 & 15;
      if (var3 == 0) {
         this.field6637[0] = this.field6637[1] = 0;
      } else {
         this.field6637[0] = arg0.method1211(-26166);
         this.field6637[1] = arg0.method1211(-26166);
         int var4 = arg0.method1143(-15465);

         for(int var5 = 0; var5 < 2; ++var5) {
            for(int var8 = 0; var8 < this.field6636[var5]; ++var8) {
               this.field6638[var5][0][var8] = arg0.method1211(-26166);
               this.field6641[var5][0][var8] = arg0.method1211(-26166);
            }
         }

         for(int var6 = 0; var6 < 2; ++var6) {
            for(int var7 = 0; var7 < this.field6636[var6]; ++var7) {
               if ((var4 & 1 << var6 * 4 << var7) != 0) {
                  this.field6638[var6][1][var7] = arg0.method1211(-26166);
                  this.field6641[var6][1][var7] = arg0.method1211(-26166);
               } else {
                  this.field6638[var6][1][var7] = this.field6638[var6][0][var7];
                  this.field6641[var6][1][var7] = this.field6641[var6][0][var7];
               }
            }
         }

         if (var4 != 0 || this.field6637[1] != this.field6637[0]) {
            arg1.method3286(arg0);
         }

      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "b",
      descriptor = "(IIF)F"
   )
   private final float method3356(int arg0, int arg1, float arg2) {
      float var4 = (float)(this.field6641[arg0][1][arg1] - this.field6641[arg0][0][arg1]) * arg2 + (float)this.field6641[arg0][0][arg1];
      float var5 = var4 * 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var5 / 20.0F));
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(IF)I"
   )
   public final int method3357(int arg0, float arg1) {
      if (arg0 == 0) {
         float var3 = (float)(this.field6637[1] - this.field6637[0]) * arg1 + (float)this.field6637[0];
         float var4 = var3 * 0.0030517578F;
         field6642 = (float)Math.pow(0.1D, (double)(var4 / 20.0F));
         field6640 = (int)(field6642 * 65536.0F);
      }

      if (this.field6636[arg0] == 0) {
         return 0;
      } else {
         float var5 = this.method3356(arg0, 0, arg1);
         field6639[arg0][0] = var5 * -2.0F * (float)Math.cos((double)this.method3358(arg0, 0, arg1));
         field6639[arg0][1] = var5 * var5;

         for(int var6 = 1; var6 < this.field6636[arg0]; ++var6) {
            float var9 = this.method3356(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float)Math.cos((double)this.method3358(arg0, var6, arg1));
            float var11 = var9 * var9;
            field6639[arg0][var6 * 2 + 1] = field6639[arg0][var6 * 2 - 1] * var11;
            field6639[arg0][var6 * 2] = field6639[arg0][var6 * 2 - 1] * var10 + field6639[arg0][var6 * 2 - 2] * var11;

            for(int var12 = var6 * 2 - 1; var12 >= 2; --var12) {
               field6639[arg0][var12] += field6639[arg0][var12 - 1] * var10 + field6639[arg0][var12 - 2] * var11;
            }

            field6639[arg0][1] += field6639[arg0][0] * var10 + var11;
            field6639[arg0][0] += var10;
         }

         if (arg0 == 0) {
            for(int var7 = 0; var7 < this.field6636[0] * 2; ++var7) {
               field6639[0][var7] *= field6642;
            }
         }

         for(int var8 = 0; var8 < this.field6636[arg0] * 2; ++var8) {
            field6643[arg0][var8] = (int)(field6639[arg0][var8] * 65536.0F);
         }

         return this.field6636[arg0] * 2;
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(IIF)F"
   )
   private final float method3358(int arg0, int arg1, float arg2) {
      float var4 = (float)(this.field6638[arg0][1][arg1] - this.field6638[arg0][0][arg1]) * arg2 + (float)this.field6638[arg0][0][arg1];
      float var5 = var4 * 1.2207031E-4F;
      return method3354(var5);
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "()V"
   )
   public static void method3359() {
      field6639 = null;
      field6643 = null;
   }
}
