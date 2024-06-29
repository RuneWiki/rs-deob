import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class113 {

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "[I")
    private int[] field1371 = new int[2];

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "[I")
    public int[] field1373 = new int[2];

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "[[[I")
    private int[][][] field1369 = new int[2][2][4];

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "[[[I")
    private int[][][] field1375 = new int[2][2][4];

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "[[F")
    private static float[][] field1374 = new float[2][8];

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "[[I")
    public static int[][] field1376 = new int[2][8];

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "F")
    private static float field1370;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "()V", line = 4)
    public static void method631() {
        field1374 = null;
        field1376 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IF)I", line = 20)
    public final int method632(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field1371[1] - this.field1371[0]) * arg1 + (float) this.field1371[0];
            float var4 = var3 * 0.0030517578F;
            field1370 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field1372 = (int) (field1370 * 65536.0F);
        }
        if (this.field1373[arg0] == 0) {
            return 0;
        }
        float var5 = this.method634(arg0, 0, arg1);
        field1374[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method636(arg0, 0, arg1));
        field1374[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field1373[arg0]; var6++) {
            float var9 = this.method634(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method636(arg0, var6, arg1));
            float var11 = var9 * var9;
            field1374[arg0][var6 * 2 + 1] = field1374[arg0][var6 * 2 - 1] * var11;
            field1374[arg0][var6 * 2] = field1374[arg0][var6 * 2 - 1] * var10 + field1374[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field1374[arg0][var12] += field1374[arg0][var12 - 1] * var10 + field1374[arg0][var12 - 2] * var11;
            }
            field1374[arg0][1] += field1374[arg0][0] * var10 + var11;
            field1374[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field1373[0] * 2; var7++) {
                field1374[0][var7] *= field1370;
            }
        }
        for (int var8 = 0; var8 < this.field1373[arg0] * 2; var8++) {
            field1376[arg0][var8] = (int) (field1374[arg0][var8] * 65536.0F);
        }
        return this.field1373[arg0] * 2;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(F)F", line = 90)
    private static final float method633(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIF)F", line = 96)
    private final float method634(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1375[arg0][1][arg1] - this.field1375[arg0][0][arg1]) * arg2 + (float) this.field1375[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ldga;Ltu;)V", line = 102)
    public final void method635(class138 arg0, class510 arg1) {
        int var3 = arg0.method957((byte) -113);
        this.field1373[0] = var3 >> 4;
        this.field1373[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field1371[0] = this.field1371[1] = 0;
            return;
        }
        this.field1371[0] = arg0.method922((byte) -127);
        this.field1371[1] = arg0.method922((byte) -121);
        int var4 = arg0.method957((byte) -89);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field1373[var5]; var8++) {
                this.field1369[var5][0][var8] = arg0.method922((byte) -126);
                this.field1375[var5][0][var8] = arg0.method922((byte) -126);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field1373[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field1369[var6][1][var7] = this.field1369[var6][0][var7];
                    this.field1375[var6][1][var7] = this.field1375[var6][0][var7];
                } else {
                    this.field1369[var6][1][var7] = arg0.method922((byte) -113);
                    this.field1375[var6][1][var7] = arg0.method922((byte) -114);
                }
            }
        }
        if (var4 != 0 || this.field1371[1] != this.field1371[0]) {
            arg1.method2883(arg0);
        }
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(IIF)F", line = 173)
    private final float method636(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field1369[arg0][1][arg1] - this.field1369[arg0][0][arg1]) * arg2 + (float) this.field1369[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method633(var5);
    }
}
