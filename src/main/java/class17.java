import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class17 extends class162 {

    @OriginalMember(owner = "client!n", name = "H", descriptor = "Z")
    public boolean field239 = false;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "Lfi;")
    public class117 field241;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "Z")
    private boolean field238;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "Z")
    private boolean field240;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "F")
    private float field236;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "[I")
    private int[] field234;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "[I")
    public static int[] field242;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
    public static void method106() {
        field242 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lvb;Lfa;FZ)[I")
    public final int[] method107(class61 arg0, class273 arg1, float arg2, boolean arg3) {
        if (this.field234 == null || this.field236 != arg2) {
            if (!this.field241.method758(1, arg1, arg0)) {
                return null;
            }
            this.field237 = arg3 ? 64 : 128;
            this.field234 = this.field241.method757(true, (double) arg2, arg0, 28607, this.field237, arg1, this.field240, this.field237);
            this.field236 = arg2;
            if (this.field238) {
                int[] var5 = new int[this.field237];
                int[] var6 = new int[this.field237];
                int[] var7 = new int[this.field237];
                int[] var8 = new int[this.field237 * this.field237];
                int var9 = this.field237;
                int var10 = this.field237;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field234[var14];
                        var5[var32] += var33 >> 16 & 0xFF;
                        var6[var32] += var33 >> 8 & 0xFF;
                        var7[var32] += var33 & 0xFF;
                    }
                    if (var14 == 0) {
                        var14 = var13;
                    }
                }
                int var17 = var13;
                for (int var18 = var12; var18 >= 0; var18--) {
                    int var19 = 1;
                    int var20 = 1;
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    for (int var24 = 2; var24 >= 0; var24--) {
                        var20--;
                        var23 += var5[var20];
                        var21 += var6[var20];
                        var22 += var7[var20];
                        if (var20 == 0) {
                            var20 = var9;
                        }
                    }
                    for (int var25 = var11; var25 >= 0; var25--) {
                        var20--;
                        var19--;
                        int var29 = var23 / 9;
                        int var30 = var21 / 9;
                        int var31 = var22 / 9;
                        var17--;
                        var8[var17] = var29 << 16 | var30 << 8 | var31;
                        var23 += var5[var20] - var5[var19];
                        var22 += var7[var20] - var7[var19];
                        var21 += var6[var20] - var6[var19];
                        if (var20 == 0) {
                            var20 = var9;
                        }
                        if (var19 == 0) {
                            var19 = var9;
                        }
                    }
                    for (int var26 = var11; var26 >= 0; var26--) {
                        var14--;
                        int var27 = this.field234[var14];
                        var15--;
                        int var28 = this.field234[var15];
                        var5[var26] += (var27 >> 16 & 0xFF) - (var28 >> 16 & 0xFF);
                        var6[var26] += (var27 >> 8 & 0xFF) - (var28 >> 8 & 0xFF);
                        var7[var26] += (var27 & 0xFF) - (var28 & 0xFF);
                    }
                    if (var14 == 0) {
                        var14 = var13;
                    }
                    if (var15 == 0) {
                        var15 = var13;
                    }
                }
                this.field234 = var8;
            }
        }
        return this.field234;
    }

    @OriginalMember(owner = "client!n", name = "g", descriptor = "(I)V")
    public final void method108(int arg0) {
        if (this.field234 == null || this.field233 == 0 && this.field235 == 0) {
            return;
        }
        if (field242 == null || field242.length < this.field234.length) {
            field242 = new int[this.field234.length];
        }
        int var2 = this.field234.length;
        int var3 = this.field235 * arg0;
        int var4 = this.field237 - 1;
        int var5 = this.field237 * arg0 * this.field233;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field237) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field237; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field242[var11] = this.field234[var12];
            }
        }
        int[] var8 = this.field234;
        this.field234 = field242;
        field242 = var8;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lvb;Lfa;)Z")
    public final boolean method109(class61 arg0, class273 arg1) {
        return this.field241.method758(1, arg1, arg0);
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lma;)V")
    public class17(class202 arg0) {
        this.field241 = new class117(arg0);
        this.field238 = arg0.method1420((byte) 0) == 1;
        this.field240 = arg0.method1420((byte) 0) == 1;
        arg0.method1420((byte) 0);
        arg0.method1420((byte) 0);
        int var2 = arg0.method1420((byte) 0) & 0x3;
        this.field235 = arg0.method1457((byte) -94);
        this.field233 = arg0.method1457((byte) -49);
        arg0.method1420((byte) 0);
        arg0.method1420((byte) 0);
        arg0.method1420((byte) 0);
    }
}
