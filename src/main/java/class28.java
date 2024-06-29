import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class28 {
   @OriginalMember(
      owner = "client!ir",
      name = "f",
      descriptor = "[I"
   )
   public int[] field308 = new int[2];
   @OriginalMember(
      owner = "client!ir",
      name = "e",
      descriptor = "[[[I"
   )
   private int[][][] field306 = new int[2][2][4];
   @OriginalMember(
      owner = "client!ir",
      name = "d",
      descriptor = "[I"
   )
   private int[] field309 = new int[2];
   @OriginalMember(
      owner = "client!ir",
      name = "g",
      descriptor = "[[[I"
   )
   private int[][][] field313 = new int[2][2][4];
   @OriginalMember(
      owner = "client!ir",
      name = "c",
      descriptor = "[[F"
   )
   private static float[][] field310 = new float[2][8];
   @OriginalMember(
      owner = "client!ir",
      name = "h",
      descriptor = "[[I"
   )
   public static int[][] field311 = new int[2][8];
   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "F"
   )
   private static float field307;
   @OriginalMember(
      owner = "client!ir",
      name = "b",
      descriptor = "I"
   )
   public static int field312;

   @OriginalMember(
      owner = "client!ir",
      name = "b",
      descriptor = "(IIF)F",
      line = 7
   )
   private final float method194(int arg0, int arg1, float arg2) {
      float var4 = (float)(this.field306[arg0][1][arg1] - this.field306[arg0][0][arg1]) * arg2 + (float)this.field306[arg0][0][arg1];
      float var5 = var4 * 1.2207031E-4F;
      return method195(var5);
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(F)F",
      line = 19
   )
   private static final float method195(float arg0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)arg0);
      return var1 * 3.1415927F / 11025.0F;
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(Ljj;Lsm;)V",
      line = 26
   )
   public final void method196(class128 arg0, class297 arg1) {
      int var3 = arg0.method1104(255);
      this.field308[0] = var3 >> 4;
      this.field308[1] = var3 & 15;
      if (var3 == 0) {
         this.field309[0] = this.field309[1] = 0;
      } else {
         this.field309[0] = arg0.method1038((byte)-95);
         this.field309[1] = arg0.method1038((byte)-112);
         int var4 = arg0.method1104(255);

         for(int var5 = 0; var5 < 2; ++var5) {
            for(int var8 = 0; var8 < this.field308[var5]; ++var8) {
               this.field306[var5][0][var8] = arg0.method1038((byte)-102);
               this.field313[var5][0][var8] = arg0.method1038((byte)-104);
            }
         }

         for(int var6 = 0; var6 < 2; ++var6) {
            for(int var7 = 0; var7 < this.field308[var6]; ++var7) {
               if ((var4 & 1 << var6 * 4 << var7) != 0) {
                  this.field306[var6][1][var7] = arg0.method1038((byte)-105);
                  this.field313[var6][1][var7] = arg0.method1038((byte)-125);
               } else {
                  this.field306[var6][1][var7] = this.field306[var6][0][var7];
                  this.field313[var6][1][var7] = this.field313[var6][0][var7];
               }
            }
         }

         if (var4 != 0 || this.field309[1] != this.field309[0]) {
            arg1.method2261(arg0);
         }

      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(IF)I",
      line = 94
   )
   public final int method197(int arg0, float arg1) {
      if (arg0 == 0) {
         float var3 = (float)(this.field309[1] - this.field309[0]) * arg1 + (float)this.field309[0];
         float var4 = var3 * 0.0030517578F;
         field307 = (float)Math.pow(0.1D, (double)(var4 / 20.0F));
         field312 = (int)(field307 * 65536.0F);
      }

      if (this.field308[arg0] == 0) {
         return 0;
      } else {
         float var5 = this.method199(arg0, 0, arg1);
         field310[arg0][0] = var5 * -2.0F * (float)Math.cos((double)this.method194(arg0, 0, arg1));
         field310[arg0][1] = var5 * var5;

         for(int var6 = 1; var6 < this.field308[arg0]; ++var6) {
            float var9 = this.method199(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float)Math.cos((double)this.method194(arg0, var6, arg1));
            float var11 = var9 * var9;
            field310[arg0][var6 * 2 + 1] = field310[arg0][var6 * 2 - 1] * var11;
            field310[arg0][var6 * 2] = field310[arg0][var6 * 2 - 1] * var10 + field310[arg0][var6 * 2 - 2] * var11;

            for(int var12 = var6 * 2 - 1; var12 >= 2; --var12) {
               field310[arg0][var12] += field310[arg0][var12 - 1] * var10 + field310[arg0][var12 - 2] * var11;
            }

            field310[arg0][1] += field310[arg0][0] * var10 + var11;
            field310[arg0][0] += var10;
         }

         if (arg0 == 0) {
            for(int var7 = 0; var7 < this.field308[0] * 2; ++var7) {
               field310[0][var7] *= field307;
            }
         }

         for(int var8 = 0; var8 < this.field308[arg0] * 2; ++var8) {
            field311[arg0][var8] = (int)(field310[arg0][var8] * 65536.0F);
         }

         return this.field308[arg0] * 2;
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "()V",
      line = 160
   )
   public static void method198() {
      field310 = null;
      field311 = null;
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(IIF)F",
      line = 174
   )
   private final float method199(int arg0, int arg1, float arg2) {
      float var4 = (float)(this.field313[arg0][1][arg1] - this.field313[arg0][0][arg1]) * arg2 + (float)this.field313[arg0][0][arg1];
      float var5 = var4 * 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var5 / 20.0F));
   }
}
