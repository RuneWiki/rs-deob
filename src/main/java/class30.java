import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class30 {

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "[[[I")
    private int[][][] field821 = new int[2][2][4];

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "[[[I")
    private int[][][] field827 = new int[2][2][4];

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "[I")
    public int[] field826 = new int[2];

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "[I")
    private int[] field825 = new int[2];

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "[[I")
    public static int[][] field822 = new int[2][8];

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "[[F")
    private static float[][] field823 = new float[2][8];

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "F")
    private static float field820;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lba;Lc;)V", line = 14)
    public final void method376(class8 arg0, class13 arg1) {
        int var3 = arg0.method145(false);
        this.field826[0] = var3 >> 4;
        this.field826[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field825[0] = this.field825[1] = 0;
            return;
        }
        this.field825[0] = arg0.method146(65280);
        this.field825[1] = arg0.method146(65280);
        int var4 = arg0.method145(false);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field826[var5]; var8++) {
                this.field821[var5][0][var8] = arg0.method146(65280);
                this.field827[var5][0][var8] = arg0.method146(65280);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field826[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field821[var6][1][var7] = this.field821[var6][0][var7];
                    this.field827[var6][1][var7] = this.field827[var6][0][var7];
                } else {
                    this.field821[var6][1][var7] = arg0.method146(65280);
                    this.field827[var6][1][var7] = arg0.method146(65280);
                }
            }
        }
        if (var4 != 0 || this.field825[1] != this.field825[0]) {
            arg1.method251(arg0);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()V", line = 83)
    public static void method377() {
        field823 = null;
        field822 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIF)F", line = 102)
    private final float method378(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field827[arg0][1][arg1] - this.field827[arg0][0][arg1]) * arg2 + (float) this.field827[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IF)I", line = 112)
    public final int method379(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field825[1] - this.field825[0]) * arg1 + (float) this.field825[0];
            float var4 = var3 * 0.0030517578F;
            field820 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field824 = (int) (field820 * 65536.0F);
        }
        if (this.field826[arg0] == 0) {
            return 0;
        }
        float var5 = this.method378(arg0, 0, arg1);
        field823[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method380(arg0, 0, arg1));
        field823[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field826[arg0]; var6++) {
            float var9 = this.method378(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method380(arg0, var6, arg1));
            float var11 = var9 * var9;
            field823[arg0][var6 * 2 + 1] = field823[arg0][var6 * 2 - 1] * var11;
            field823[arg0][var6 * 2] = field823[arg0][var6 * 2 - 1] * var10 + field823[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field823[arg0][var12] += field823[arg0][var12 - 1] * var10 + field823[arg0][var12 - 2] * var11;
            }
            field823[arg0][1] += field823[arg0][0] * var10 + var11;
            field823[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field826[0] * 2; var7++) {
                field823[0][var7] *= field820;
            }
        }
        for (int var8 = 0; var8 < this.field826[arg0] * 2; var8++) {
            field822[arg0][var8] = (int) (field823[arg0][var8] * 65536.0F);
        }
        return this.field826[arg0] * 2;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIF)F", line = 172)
    private final float method380(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field821[arg0][1][arg1] - this.field821[arg0][0][arg1]) * arg2 + (float) this.field821[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method381(var5);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(F)F", line = 178)
    private static final float method381(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }
}
