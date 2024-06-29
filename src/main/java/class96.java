import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class96 {

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "[I")
    private int[] field1763 = new int[2];

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "[I")
    public int[] field1764 = new int[2];

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "[[[I")
    private int[][][] field1766 = new int[2][2][4];

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "[[[I")
    private int[][][] field1768 = new int[2][2][4];

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "[[I")
    public static int[][] field1765 = new int[2][8];

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "[[F")
    private static float[][] field1767 = new float[2][8];

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "F")
    private static float field1762;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
    public static void method564() {
        field1767 = null;
        field1765 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIF)F")
    private final float method565(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1768[arg0][1][arg1] - this.field1768[arg0][0][arg1]) * arg2 + (float) this.field1768[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method567(var5);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lh;Lsk;)V")
    public final void method566(class190 arg0, class108 arg1) {
        int var3 = arg0.method1265(121);
        this.field1764[0] = var3 >> 4;
        this.field1764[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1763[0] = this.field1763[1] = 0;
            return;
        }
        this.field1763[0] = arg0.method1275(128);
        this.field1763[1] = arg0.method1275(128);
        int var4 = arg0.method1265(118);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1764[var5]; var8++) {
                this.field1768[var5][0][var8] = arg0.method1275(128);
                this.field1766[var5][0][var8] = arg0.method1275(128);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1764[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1768[var6][1][var7] = this.field1768[var6][0][var7];
                    this.field1766[var6][1][var7] = this.field1766[var6][0][var7];
                } else {
                    this.field1768[var6][1][var7] = arg0.method1275(128);
                    this.field1766[var6][1][var7] = arg0.method1275(128);
                }
            }
        }
        if (var4 != 0 || this.field1763[1] != this.field1763[0]) {
            arg1.method653(arg0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(F)F")
    private static final float method567(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IF)I")
    public final int method568(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1763[1] - this.field1763[0]) * arg1 + (float) this.field1763[0];
            float var4 = var3 * 0.0030517578F;
            field1762 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1761 = (int) (field1762 * 65536.0F);
        }
        if (this.field1764[arg0] == 0) {
            return 0;
        }
        float var5 = this.method569(arg0, 0, arg1);
        field1767[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method565(arg0, 0, arg1));
        field1767[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1764[arg0]; var6++) {
            float var9 = this.method569(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method565(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1767[arg0][var6 * 2 + 1] = field1767[arg0][var6 * 2 - 1] * var11;
            field1767[arg0][var6 * 2] = field1767[arg0][var6 * 2 - 1] * var10 + field1767[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1767[arg0][var12] += field1767[arg0][var12 - 1] * var10 + field1767[arg0][var12 - 2] * var11;
            }
            field1767[arg0][1] += field1767[arg0][0] * var10 + var11;
            field1767[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1764[0] * 2; var7++) {
                field1767[0][var7] *= field1762;
            }
        }
        for (int var8 = 0; var8 < this.field1764[arg0] * 2; var8++) {
            field1765[arg0][var8] = (int) (field1767[arg0][var8] * 65536.0F);
        }
        return this.field1764[arg0] * 2;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIF)F")
    private final float method569(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1766[arg0][1][arg1] - this.field1766[arg0][0][arg1]) * arg2 + (float) this.field1766[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }
}
