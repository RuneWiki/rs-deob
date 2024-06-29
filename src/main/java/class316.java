import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class316 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "[[[I")
    private int[][][] field4615 = new int[2][2][4];

    @OriginalMember(owner = "client!k", name = "f", descriptor = "[[[I")
    private int[][][] field4619 = new int[2][2][4];

    @OriginalMember(owner = "client!k", name = "c", descriptor = "[I")
    private int[] field4616 = new int[2];

    @OriginalMember(owner = "client!k", name = "h", descriptor = "[I")
    public int[] field4621 = new int[2];

    @OriginalMember(owner = "client!k", name = "g", descriptor = "[[F")
    private static float[][] field4620 = new float[2][8];

    @OriginalMember(owner = "client!k", name = "d", descriptor = "[[I")
    public static int[][] field4617 = new int[2][8];

    @OriginalMember(owner = "client!k", name = "a", descriptor = "F")
    private static float field4614;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(F)F")
    private static final float method1947(float arg0) {
        float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        return var1 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIF)F")
    private final float method1948(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4615[arg0][1][arg1] - this.field4615[arg0][0][arg1]) * arg2 + (float) this.field4615[arg0][0][arg1];
        float var5 = var4 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()V")
    public static void method1949() {
        field4620 = null;
        field4617 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lvt;Lng;)V")
    public final void method1950(class179 arg0, class123 arg1) {
        int var3 = arg0.method895((byte) -88);
        this.field4621[0] = var3 >> 4;
        this.field4621[1] = var3 & 0xF;
        if (var3 == 0) {
            this.field4616[0] = this.field4616[1] = 0;
            return;
        }
        this.field4616[0] = arg0.method916(21933);
        this.field4616[1] = arg0.method916(21933);
        int var4 = arg0.method895((byte) -85);
        for (int var5 = 0; var5 < 2; var5++) {
            for (int var8 = 0; var8 < this.field4621[var5]; var8++) {
                this.field4619[var5][0][var8] = arg0.method916(21933);
                this.field4615[var5][0][var8] = arg0.method916(21933);
            }
        }
        for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < this.field4621[var6]; var7++) {
                if ((var4 & 0x1 << var6 * 4 << var7) == 0) {
                    this.field4619[var6][1][var7] = this.field4619[var6][0][var7];
                    this.field4615[var6][1][var7] = this.field4615[var6][0][var7];
                } else {
                    this.field4619[var6][1][var7] = arg0.method916(21933);
                    this.field4615[var6][1][var7] = arg0.method916(21933);
                }
            }
        }
        if (var4 != 0 || this.field4616[1] != this.field4616[0]) {
            arg1.method593(arg0);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(IIF)F")
    private final float method1951(int arg0, int arg1, float arg2) {
        float var4 = (float) (this.field4619[arg0][1][arg1] - this.field4619[arg0][0][arg1]) * arg2 + (float) this.field4619[arg0][0][arg1];
        float var5 = var4 * 1.2207031E-4F;
        return method1947(var5);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IF)I")
    public final int method1952(int arg0, float arg1) {
        if (arg0 == 0) {
            float var3 = (float) (this.field4616[1] - this.field4616[0]) * arg1 + (float) this.field4616[0];
            float var4 = var3 * 0.0030517578F;
            field4614 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
            field4618 = (int) (field4614 * 65536.0F);
        }
        if (this.field4621[arg0] == 0) {
            return 0;
        }
        float var5 = this.method1948(arg0, 0, arg1);
        field4620[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method1951(arg0, 0, arg1));
        field4620[arg0][1] = var5 * var5;
        for (int var6 = 1; var6 < this.field4621[arg0]; var6++) {
            float var9 = this.method1948(arg0, var6, arg1);
            float var10 = var9 * -2.0F * (float) Math.cos((double) this.method1951(arg0, var6, arg1));
            float var11 = var9 * var9;
            field4620[arg0][var6 * 2 + 1] = field4620[arg0][var6 * 2 - 1] * var11;
            field4620[arg0][var6 * 2] = field4620[arg0][var6 * 2 - 1] * var10 + field4620[arg0][var6 * 2 - 2] * var11;
            for (int var12 = var6 * 2 - 1; var12 >= 2; var12--) {
                field4620[arg0][var12] += field4620[arg0][var12 - 1] * var10 + field4620[arg0][var12 - 2] * var11;
            }
            field4620[arg0][1] += field4620[arg0][0] * var10 + var11;
            field4620[arg0][0] += var10;
        }
        if (arg0 == 0) {
            for (int var7 = 0; var7 < this.field4621[0] * 2; var7++) {
                field4620[0][var7] *= field4614;
            }
        }
        for (int var8 = 0; var8 < this.field4621[arg0] * 2; var8++) {
            field4617[arg0][var8] = (int) (field4620[arg0][var8] * 65536.0F);
        }
        return this.field4621[arg0] * 2;
    }
}
