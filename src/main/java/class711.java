import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class711 {
   @OriginalMember(
      owner = "client!jca",
      name = "d",
      descriptor = "[I"
   )
   public int[] field10327 = new int[2];
   @OriginalMember(
      owner = "client!jca",
      name = "b",
      descriptor = "[I"
   )
   private int[] field10325 = new int[2];
   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "[[[I"
   )
   private int[][][] field10332 = new int[2][2][4];
   @OriginalMember(
      owner = "client!jca",
      name = "h",
      descriptor = "[[[I"
   )
   private int[][][] field10331 = new int[2][2][4];
   @OriginalMember(
      owner = "client!jca",
      name = "f",
      descriptor = "[[F"
   )
   private static float[][] field10326 = new float[2][8];
   @OriginalMember(
      owner = "client!jca",
      name = "c",
      descriptor = "[[I"
   )
   public static int[][] field10328 = new int[2][8];
   @OriginalMember(
      owner = "client!jca",
      name = "e",
      descriptor = "F"
   )
   private static float field10329;
   @OriginalMember(
      owner = "client!jca",
      name = "g",
      descriptor = "I"
   )
   public static int field10330;

   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "(F)F"
   )
   private static final float method5170(float arg0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)arg0);
      return var1 * 3.1415927F / 11025.0F;
   }

   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "(IF)I"
   )
   public final int method5171(int arg0, float arg1) {
      if (arg0 == 0) {
         float var3 = (float)(this.field10325[1] - this.field10325[0]) * arg1 + (float)this.field10325[0];
         float var4 = var3 * 0.0030517578F;
         field10329 = (float)Math.pow(0.1D, (double)(var4 / 20.0F));
         field10330 = (int)(field10329 * 65536.0F);
      }

      if (this.field10327[arg0] == 0) {
         return 0;
      } else {
         float var5 = this.method5172(arg0, 0, arg1);
         field10326[arg0][0] = var5 * -2.0F * (float)Math.cos((double)this.method5173(arg0, 0, arg1));
         field10326[arg0][1] = var5 * var5;

         for(int var6 = 1; var6 < this.field10327[arg0]; ++var6) {
            float var9 = this.method5172(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float)Math.cos((double)this.method5173(arg0, var6, arg1));
            float var11 = var9 * var9;
            field10326[arg0][var6 * 2 + 1] = field10326[arg0][var6 * 2 - 1] * var11;
            field10326[arg0][var6 * 2] = field10326[arg0][var6 * 2 - 1] * var10 + field10326[arg0][var6 * 2 - 2] * var11;

            for(int var12 = var6 * 2 - 1; var12 >= 2; --var12) {
               field10326[arg0][var12] += field10326[arg0][var12 - 1] * var10 + field10326[arg0][var12 - 2] * var11;
            }

            field10326[arg0][1] += field10326[arg0][0] * var10 + var11;
            field10326[arg0][0] += var10;
         }

         if (arg0 == 0) {
            for(int var7 = 0; var7 < this.field10327[0] * 2; ++var7) {
               field10326[0][var7] *= field10329;
            }
         }

         for(int var8 = 0; var8 < this.field10327[arg0] * 2; ++var8) {
            field10328[arg0][var8] = (int)(field10326[arg0][var8] * 65536.0F);
         }

         return this.field10327[arg0] * 2;
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "b",
      descriptor = "(IIF)F"
   )
   private final float method5172(int arg0, int arg1, float arg2) {
      float var4 = (float)(this.field10331[arg0][1][arg1] - this.field10331[arg0][0][arg1]) * arg2 + (float)this.field10331[arg0][0][arg1];
      float var5 = var4 * 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var5 / 20.0F));
   }

   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "(IIF)F"
   )
   private final float method5173(int arg0, int arg1, float arg2) {
      float var4 = (float)(this.field10332[arg0][1][arg1] - this.field10332[arg0][0][arg1]) * arg2 + (float)this.field10332[arg0][0][arg1];
      float var5 = var4 * 1.2207031E-4F;
      return method5170(var5);
   }

   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "(Luda;Lwea;)V"
   )
   public final void method5174(class473 arg0, class165 arg1) {
      int var3 = arg0.method3564((byte)-61);
      this.field10327[0] = var3 >> 4;
      this.field10327[1] = var3 & 15;
      if (var3 == 0) {
         this.field10325[0] = this.field10325[1] = 0;
      } else {
         this.field10325[0] = arg0.method3565(true);
         this.field10325[1] = arg0.method3565(true);
         int var4 = arg0.method3564((byte)-127);

         for(int var5 = 0; var5 < 2; ++var5) {
            for(int var8 = 0; var8 < this.field10327[var5]; ++var8) {
               this.field10332[var5][0][var8] = arg0.method3565(true);
               this.field10331[var5][0][var8] = arg0.method3565(true);
            }
         }

         for(int var6 = 0; var6 < 2; ++var6) {
            for(int var7 = 0; var7 < this.field10327[var6]; ++var7) {
               if ((var4 & 1 << var6 * 4 << var7) != 0) {
                  this.field10332[var6][1][var7] = arg0.method3565(true);
                  this.field10331[var6][1][var7] = arg0.method3565(true);
               } else {
                  this.field10332[var6][1][var7] = this.field10332[var6][0][var7];
                  this.field10331[var6][1][var7] = this.field10331[var6][0][var7];
               }
            }
         }

         if (var4 != 0 || this.field10325[1] != this.field10325[0]) {
            arg1.method1504(arg0);
         }

      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "()V"
   )
   public static void method5175() {
      field10326 = null;
      field10328 = null;
   }
}
