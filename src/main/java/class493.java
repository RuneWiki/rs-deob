import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class493 {
   @OriginalMember(
      owner = "client!ct",
      name = "a",
      descriptor = "[[[I"
   )
   private int[][][] field7033 = new int[2][2][4];
   @OriginalMember(
      owner = "client!ct",
      name = "h",
      descriptor = "[I"
   )
   private int[] field7031 = new int[2];
   @OriginalMember(
      owner = "client!ct",
      name = "c",
      descriptor = "[[[I"
   )
   private int[][][] field7037 = new int[2][2][4];
   @OriginalMember(
      owner = "client!ct",
      name = "f",
      descriptor = "[I"
   )
   public int[] field7036 = new int[2];
   @OriginalMember(
      owner = "client!ct",
      name = "e",
      descriptor = "[[I"
   )
   public static int[][] field7034 = new int[2][8];
   @OriginalMember(
      owner = "client!ct",
      name = "d",
      descriptor = "[[F"
   )
   private static float[][] field7032 = new float[2][8];
   @OriginalMember(
      owner = "client!ct",
      name = "g",
      descriptor = "F"
   )
   private static float field7035;
   @OriginalMember(
      owner = "client!ct",
      name = "b",
      descriptor = "I"
   )
   public static int field7038;

   @OriginalMember(
      owner = "client!ct",
      name = "b",
      descriptor = "(IIF)F"
   )
   private final float method3744(int arg0, int arg1, float arg2) {
      float var4 = (float)(this.field7033[arg0][1][arg1] - this.field7033[arg0][0][arg1]) * arg2 + (float)this.field7033[arg0][0][arg1];
      float var5 = var4 * 1.2207031E-4F;
      return method3746(var5);
   }

   @OriginalMember(
      owner = "client!ct",
      name = "a",
      descriptor = "(Lcu;Ldc;)V"
   )
   public final void method3745(class65 arg0, class601 arg1) {
      int var3 = arg0.method665(false);
      this.field7036[0] = var3 >> 4;
      this.field7036[1] = var3 & 15;
      if (var3 == 0) {
         this.field7031[0] = this.field7031[1] = 0;
      } else {
         this.field7031[0] = arg0.method685(-2);
         this.field7031[1] = arg0.method685(-2);
         int var4 = arg0.method665(false);

         for(int var5 = 0; var5 < 2; ++var5) {
            for(int var8 = 0; var8 < this.field7036[var5]; ++var8) {
               this.field7033[var5][0][var8] = arg0.method685(-2);
               this.field7037[var5][0][var8] = arg0.method685(-2);
            }
         }

         for(int var6 = 0; var6 < 2; ++var6) {
            for(int var7 = 0; var7 < this.field7036[var6]; ++var7) {
               if ((var4 & 1 << var6 * 4 << var7) != 0) {
                  this.field7033[var6][1][var7] = arg0.method685(-2);
                  this.field7037[var6][1][var7] = arg0.method685(-2);
               } else {
                  this.field7033[var6][1][var7] = this.field7033[var6][0][var7];
                  this.field7037[var6][1][var7] = this.field7037[var6][0][var7];
               }
            }
         }

         if (var4 != 0 || this.field7031[1] != this.field7031[0]) {
            arg1.method4429(arg0);
         }

      }
   }

   @OriginalMember(
      owner = "client!ct",
      name = "a",
      descriptor = "(F)F"
   )
   private static final float method3746(float arg0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)arg0);
      return var1 * 3.1415927F / 11025.0F;
   }

   @OriginalMember(
      owner = "client!ct",
      name = "a",
      descriptor = "(IIF)F"
   )
   private final float method3747(int arg0, int arg1, float arg2) {
      float var4 = (float)(this.field7037[arg0][1][arg1] - this.field7037[arg0][0][arg1]) * arg2 + (float)this.field7037[arg0][0][arg1];
      float var5 = var4 * 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var5 / 20.0F));
   }

   @OriginalMember(
      owner = "client!ct",
      name = "a",
      descriptor = "()V"
   )
   public static void method3748() {
      field7032 = null;
      field7034 = null;
   }

   @OriginalMember(
      owner = "client!ct",
      name = "a",
      descriptor = "(IF)I"
   )
   public final int method3749(int arg0, float arg1) {
      if (arg0 == 0) {
         float var3 = (float)(this.field7031[1] - this.field7031[0]) * arg1 + (float)this.field7031[0];
         float var4 = var3 * 0.0030517578F;
         field7035 = (float)Math.pow(0.1D, (double)(var4 / 20.0F));
         field7038 = (int)(field7035 * 65536.0F);
      }

      if (this.field7036[arg0] == 0) {
         return 0;
      } else {
         float var5 = this.method3747(arg0, 0, arg1);
         field7032[arg0][0] = var5 * -2.0F * (float)Math.cos((double)this.method3744(arg0, 0, arg1));
         field7032[arg0][1] = var5 * var5;

         for(int var6 = 1; var6 < this.field7036[arg0]; ++var6) {
            float var9 = this.method3747(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float)Math.cos((double)this.method3744(arg0, var6, arg1));
            float var11 = var9 * var9;
            field7032[arg0][var6 * 2 + 1] = field7032[arg0][var6 * 2 - 1] * var11;
            field7032[arg0][var6 * 2] = field7032[arg0][var6 * 2 - 1] * var10 + field7032[arg0][var6 * 2 - 2] * var11;

            for(int var12 = var6 * 2 - 1; var12 >= 2; --var12) {
               field7032[arg0][var12] += field7032[arg0][var12 - 1] * var10 + field7032[arg0][var12 - 2] * var11;
            }

            field7032[arg0][1] += field7032[arg0][0] * var10 + var11;
            field7032[arg0][0] += var10;
         }

         if (arg0 == 0) {
            for(int var7 = 0; var7 < this.field7036[0] * 2; ++var7) {
               field7032[0][var7] *= field7035;
            }
         }

         for(int var8 = 0; var8 < this.field7036[arg0] * 2; ++var8) {
            field7034[arg0][var8] = (int)(field7032[arg0][var8] * 65536.0F);
         }

         return this.field7036[arg0] * 2;
      }
   }
}
