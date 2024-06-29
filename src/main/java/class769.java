import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class769 {
   @OriginalMember(
      owner = "client!sia",
      name = "g",
      descriptor = "[[[I"
   )
   private int[][][] field11086 = new int[2][2][4];
   @OriginalMember(
      owner = "client!sia",
      name = "d",
      descriptor = "[I"
   )
   public int[] field11082 = new int[2];
   @OriginalMember(
      owner = "client!sia",
      name = "c",
      descriptor = "[[[I"
   )
   private int[][][] field11084 = new int[2][2][4];
   @OriginalMember(
      owner = "client!sia",
      name = "h",
      descriptor = "[I"
   )
   private int[] field11087 = new int[2];
   @OriginalMember(
      owner = "client!sia",
      name = "f",
      descriptor = "[[I"
   )
   public static int[][] field11083 = new int[2][8];
   @OriginalMember(
      owner = "client!sia",
      name = "e",
      descriptor = "[[F"
   )
   private static float[][] field11089 = new float[2][8];
   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "F"
   )
   private static float field11088;
   @OriginalMember(
      owner = "client!sia",
      name = "b",
      descriptor = "I"
   )
   public static int field11085;

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(F)F"
   )
   private static final float method5506(float arg0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)arg0);
      return var1 * 3.1415927F / 11025.0F;
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(Lwm;Ler;)V"
   )
   public final void method5507(class594 arg0, class116 arg1) {
      int var3 = arg0.method4288((byte)62);
      this.field11082[0] = var3 >> 4;
      this.field11082[1] = var3 & 15;
      if (var3 == 0) {
         this.field11087[0] = this.field11087[1] = 0;
      } else {
         this.field11087[0] = arg0.method4280(-19104);
         this.field11087[1] = arg0.method4280(-19104);
         int var4 = arg0.method4288((byte)69);

         for(int var5 = 0; var5 < 2; ++var5) {
            for(int var8 = 0; var8 < this.field11082[var5]; ++var8) {
               this.field11084[var5][0][var8] = arg0.method4280(-19104);
               this.field11086[var5][0][var8] = arg0.method4280(-19104);
            }
         }

         for(int var6 = 0; var6 < 2; ++var6) {
            for(int var7 = 0; var7 < this.field11082[var6]; ++var7) {
               if ((var4 & 1 << var6 * 4 << var7) != 0) {
                  this.field11084[var6][1][var7] = arg0.method4280(-19104);
                  this.field11086[var6][1][var7] = arg0.method4280(-19104);
               } else {
                  this.field11084[var6][1][var7] = this.field11084[var6][0][var7];
                  this.field11086[var6][1][var7] = this.field11086[var6][0][var7];
               }
            }
         }

         if (var4 != 0 || this.field11087[1] != this.field11087[0]) {
            arg1.method1001(arg0);
         }

      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(IIF)F"
   )
   private final float method5508(int arg0, int arg1, float arg2) {
      float var4 = (float)(this.field11084[arg0][1][arg1] - this.field11084[arg0][0][arg1]) * arg2 + (float)this.field11084[arg0][0][arg1];
      float var5 = var4 * 1.2207031E-4F;
      return method5506(var5);
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(IF)I"
   )
   public final int method5509(int arg0, float arg1) {
      if (arg0 == 0) {
         float var3 = (float)(this.field11087[1] - this.field11087[0]) * arg1 + (float)this.field11087[0];
         float var4 = var3 * 0.0030517578F;
         field11088 = (float)Math.pow(0.1D, (double)(var4 / 20.0F));
         field11085 = (int)(field11088 * 65536.0F);
      }

      if (this.field11082[arg0] == 0) {
         return 0;
      } else {
         float var5 = this.method5511(arg0, 0, arg1);
         field11089[arg0][0] = var5 * -2.0F * (float)Math.cos((double)this.method5508(arg0, 0, arg1));
         field11089[arg0][1] = var5 * var5;

         for(int var6 = 1; var6 < this.field11082[arg0]; ++var6) {
            float var9 = this.method5511(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float)Math.cos((double)this.method5508(arg0, var6, arg1));
            float var11 = var9 * var9;
            field11089[arg0][var6 * 2 + 1] = field11089[arg0][var6 * 2 - 1] * var11;
            field11089[arg0][var6 * 2] = field11089[arg0][var6 * 2 - 1] * var10 + field11089[arg0][var6 * 2 - 2] * var11;

            for(int var12 = var6 * 2 - 1; var12 >= 2; --var12) {
               field11089[arg0][var12] += field11089[arg0][var12 - 1] * var10 + field11089[arg0][var12 - 2] * var11;
            }

            field11089[arg0][1] += field11089[arg0][0] * var10 + var11;
            field11089[arg0][0] += var10;
         }

         if (arg0 == 0) {
            for(int var7 = 0; var7 < this.field11082[0] * 2; ++var7) {
               field11089[0][var7] *= field11088;
            }
         }

         for(int var8 = 0; var8 < this.field11082[arg0] * 2; ++var8) {
            field11083[arg0][var8] = (int)(field11089[arg0][var8] * 65536.0F);
         }

         return this.field11082[arg0] * 2;
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "()V"
   )
   public static void method5510() {
      field11089 = null;
      field11083 = null;
   }

   @OriginalMember(
      owner = "client!sia",
      name = "b",
      descriptor = "(IIF)F"
   )
   private final float method5511(int arg0, int arg1, float arg2) {
      float var4 = (float)(this.field11086[arg0][1][arg1] - this.field11086[arg0][0][arg1]) * arg2 + (float)this.field11086[arg0][0][arg1];
      float var5 = var4 * 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var5 / 20.0F));
   }
}
