import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class65 extends class259 {

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "Z")
    public boolean field1076 = false;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "Lof;")
    public class183 field1081;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "Z")
    private boolean field1079;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "Z")
    private boolean field1083;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    private int field1085;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    private int field1080;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "F")
    private float field1082;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "[I")
    public static int[] field1077;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "[I")
    private int[] field1078;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()V")
    public static void method523() {
        field1077 = null;
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V")
    public final void method524(int arg0) {
        if (this.field1078 == null || this.field1080 == 0 && this.field1085 == 0) {
            return;
        }
        if (field1077 == null || field1077.length < this.field1078.length) {
            field1077 = new int[this.field1078.length];
        }
        int var2 = this.field1078.length;
        int var3 = this.field1085 * arg0;
        int var4 = this.field1084 - 1;
        int var5 = this.field1084 * arg0 * this.field1080;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field1084) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field1084; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field1077[var11] = this.field1078[var12];
            }
        }
        int[] var8 = this.field1078;
        this.field1078 = field1077;
        field1077 = var8;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lb;Lpk;)Z")
    public final boolean method525(class80 arg0, class237 arg1) {
        return this.field1081.method1203((byte) 89, arg0, arg1);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lb;Lpk;FZ)[I")
    public final int[] method526(class80 arg0, class237 arg1, float arg2, boolean arg3) {
        if (this.field1078 == null || this.field1082 != arg2) {
            if (!this.field1081.method1203((byte) 89, arg0, arg1)) {
                return null;
            }
            this.field1084 = arg3 ? 64 : 128;
            this.field1078 = this.field1081.method1200(arg0, true, this.field1083, this.field1084, -1839, this.field1084, (double) arg2, arg1);
            this.field1082 = arg2;
            if (this.field1079) {
                int[] var5 = new int[this.field1084];
                int[] var6 = new int[this.field1084];
                int[] var7 = new int[this.field1084];
                int[] var8 = new int[this.field1084 * this.field1084];
                int var9 = this.field1084;
                int var10 = this.field1084;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field1078[var14];
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
                        int var27 = this.field1078[var14];
                        var15--;
                        int var28 = this.field1078[var15];
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
                this.field1078 = var8;
            }
        }
        return this.field1078;
    }

    @OriginalMember(owner = "client!bi", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lca;)V")
    public class65(class54 arg0) {
        this.field1081 = new class183(arg0);
        this.field1079 = arg0.method407(255) == 1;
        this.field1083 = arg0.method407(255) == 1;
        arg0.method407(255);
        arg0.method407(255);
        int var2 = arg0.method407(255) & 0x3;
        this.field1085 = arg0.method459(false);
        this.field1080 = arg0.method459(false);
        arg0.method407(255);
        arg0.method407(255);
        arg0.method407(255);
    }
}
