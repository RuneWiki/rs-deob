import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class258 extends class84 {

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "Z")
    public boolean field3939 = false;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "Lbl;")
    public class34 field3935;

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "Z")
    private boolean field3934;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "Z")
    private boolean field3936;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    private int field3937;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
    private int field3943;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "F")
    private float field3941;

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    private int field3938;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "[I")
    private int[] field3940;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "[I")
    private static int[] field3942;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "(I)V")
    public final void method1718(int arg0) {
        if (this.field3940 == null || this.field3943 == 0 && this.field3937 == 0) {
            return;
        }
        if (field3942 == null || field3942.length < this.field3940.length) {
            field3942 = new int[this.field3940.length];
        }
        int var2 = this.field3940.length;
        int var3 = this.field3937 * arg0;
        int var4 = this.field3938 - 1;
        int var5 = this.field3938 * arg0 * this.field3943;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field3938) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field3938; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field3942[var11] = this.field3940[var12];
            }
        }
        int[] var8 = this.field3940;
        this.field3940 = field3942;
        field3942 = var8;
    }

    @OriginalMember(owner = "client!fj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lv;Lhc;FZ)[I")
    public final int[] method1719(class152 arg0, class235 arg1, float arg2, boolean arg3) {
        if (this.field3940 == null || this.field3941 != arg2) {
            if (!this.field3935.method225(arg1, arg0, 683499716)) {
                return null;
            }
            this.field3938 = arg3 ? 64 : 128;
            this.field3940 = this.field3935.method227(arg1, this.field3936, arg0, this.field3938, this.field3938, true, (byte) -4, (double) arg2);
            this.field3941 = arg2;
            if (this.field3934) {
                int[] var5 = new int[this.field3938];
                int[] var6 = new int[this.field3938];
                int[] var7 = new int[this.field3938];
                int[] var8 = new int[this.field3938 * this.field3938];
                int var9 = this.field3938;
                int var10 = this.field3938;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field3940[var14];
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
                        int var27 = this.field3940[var14];
                        var15--;
                        int var28 = this.field3940[var15];
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
                this.field3940 = var8;
            }
        }
        return this.field3940;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lv;Lhc;)Z")
    public final boolean method1720(class152 arg0, class235 arg1) {
        return this.field3935.method225(arg1, arg0, 683499716);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "()V")
    public static void method1721() {
        field3942 = null;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lql;)V")
    public class258(class224 arg0) {
        this.field3935 = new class34(arg0);
        this.field3934 = arg0.method1453((byte) -127) == 1;
        this.field3936 = arg0.method1453((byte) -127) == 1;
        arg0.method1453((byte) -128);
        arg0.method1453((byte) -127);
        int var2 = arg0.method1453((byte) -128) & 0x3;
        this.field3937 = arg0.method1437((byte) -116);
        this.field3943 = arg0.method1437((byte) -112);
        arg0.method1453((byte) -127);
        arg0.method1453((byte) -127);
        arg0.method1453((byte) -127);
    }
}
