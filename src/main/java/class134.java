import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class134 {
   @OriginalMember(
      owner = "client!oca",
      name = "g",
      descriptor = "[I"
   )
   private int[] field1896 = new int[2];
   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "[[[I"
   )
   private int[][][] field1899 = new int[2][2][4];
   @OriginalMember(
      owner = "client!oca",
      name = "e",
      descriptor = "[[[I"
   )
   private int[][][] field1897 = new int[2][2][4];
   @OriginalMember(
      owner = "client!oca",
      name = "h",
      descriptor = "[I"
   )
   public int[] field1900 = new int[2];
   @OriginalMember(
      owner = "client!oca",
      name = "b",
      descriptor = "[[F"
   )
   private static float[][] field1898 = new float[2][8];
   @OriginalMember(
      owner = "client!oca",
      name = "d",
      descriptor = "[[I"
   )
   public static int[][] field1901 = new int[2][8];
   @OriginalMember(
      owner = "client!oca",
      name = "c",
      descriptor = "F"
   )
   private static float field1894;
   @OriginalMember(
      owner = "client!oca",
      name = "f",
      descriptor = "I"
   )
   public static int field1895;

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "()V",
      line = 4
   )
   public static void method1237() {
      field1898 = null;
      field1901 = null;
   }

   @OriginalMember(
      owner = "client!oca",
      name = "b",
      descriptor = "(IIF)F",
      line = 9
   )
   private final float method1238(int arg0, int arg1, float arg2) {
      float var4 = (float)(this.field1897[arg0][1][arg1] - this.field1897[arg0][0][arg1]) * arg2 + (float)this.field1897[arg0][0][arg1];
      float var5 = var4 * 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var5 / 20.0F));
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(Lica;Leka;)V",
      line = 19
   )
   public final void method1239(class354 arg0, class763 arg1) {
      int var3 = arg0.method2855(-31007);
      this.field1900[0] = var3 >> 4;
      this.field1900[1] = var3 & 15;
      if (var3 == 0) {
         this.field1896[0] = this.field1896[1] = 0;
      } else {
         this.field1896[0] = arg0.method2848(-102);
         this.field1896[1] = arg0.method2848(-93);
         int var4 = arg0.method2855(-31007);

         for(int var5 = 0; var5 < 2; ++var5) {
            for(int var8 = 0; var8 < this.field1900[var5]; ++var8) {
               this.field1899[var5][0][var8] = arg0.method2848(-124);
               this.field1897[var5][0][var8] = arg0.method2848(-128);
            }
         }

         for(int var6 = 0; var6 < 2; ++var6) {
            for(int var7 = 0; var7 < this.field1900[var6]; ++var7) {
               if ((var4 & 1 << var6 * 4 << var7) != 0) {
                  this.field1899[var6][1][var7] = arg0.method2848(-123);
                  this.field1897[var6][1][var7] = arg0.method2848(-104);
               } else {
                  this.field1899[var6][1][var7] = this.field1899[var6][0][var7];
                  this.field1897[var6][1][var7] = this.field1897[var6][0][var7];
               }
            }
         }

         if (var4 != 0 || this.field1896[1] != this.field1896[0]) {
            arg1.method5590(arg0);
         }

      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(IIF)F",
      line = 85
   )
   private final float method1240(int arg0, int arg1, float arg2) {
      float var4 = (float)(this.field1899[arg0][1][arg1] - this.field1899[arg0][0][arg1]) * arg2 + (float)this.field1899[arg0][0][arg1];
      float var5 = var4 * 1.2207031E-4F;
      return method1241(var5);
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(F)F",
      line = 93
   )
   private static final float method1241(float arg0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)arg0);
      return var1 * 3.1415927F / 11025.0F;
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(IF)I",
      line = 107
   )
   public final int method1242(int arg0, float arg1) {
      if (arg0 == 0) {
         float var3 = (float)(this.field1896[1] - this.field1896[0]) * arg1 + (float)this.field1896[0];
         float var4 = var3 * 0.0030517578F;
         field1894 = (float)Math.pow(0.1D, (double)(var4 / 20.0F));
         field1895 = (int)(field1894 * 65536.0F);
      }

      if (this.field1900[arg0] == 0) {
         return 0;
      } else {
         float var5 = this.method1238(arg0, 0, arg1);
         field1898[arg0][0] = var5 * -2.0F * (float)Math.cos((double)this.method1240(arg0, 0, arg1));
         field1898[arg0][1] = var5 * var5;

         for(int var6 = 1; var6 < this.field1900[arg0]; ++var6) {
            float var9 = this.method1238(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float)Math.cos((double)this.method1240(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1898[arg0][var6 * 2 + 1] = field1898[arg0][var6 * 2 - 1] * var11;
            field1898[arg0][var6 * 2] = field1898[arg0][var6 * 2 - 1] * var10 + field1898[arg0][var6 * 2 - 2] * var11;

            for(int var12 = var6 * 2 - 1; var12 >= 2; --var12) {
               field1898[arg0][var12] += field1898[arg0][var12 - 1] * var10 + field1898[arg0][var12 - 2] * var11;
            }

            field1898[arg0][1] += field1898[arg0][0] * var10 + var11;
            field1898[arg0][0] += var10;
         }

         if (arg0 == 0) {
            for(int var7 = 0; var7 < this.field1900[0] * 2; ++var7) {
               field1898[0][var7] *= field1894;
            }
         }

         for(int var8 = 0; var8 < this.field1900[arg0] * 2; ++var8) {
            field1901[arg0][var8] = (int)(field1898[arg0][var8] * 65536.0F);
         }

         return this.field1900[arg0] * 2;
      }
   }
}
