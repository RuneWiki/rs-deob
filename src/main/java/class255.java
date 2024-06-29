import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class255 extends class139 {

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "Z")
    public boolean field4209 = false;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "Lam;")
    public class181 field4206;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "Z")
    private boolean field4207;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "Z")
    private boolean field4202;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    private int field4204;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    private int field4210;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "F")
    private float field4201;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    private int field4208;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "[I")
    public static int[] field4203;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "[I")
    private int[] field4205;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()V")
    public static void method1804() {
        field4203 = null;
    }

    @OriginalMember(owner = "client!pj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
    public final void method1805(int arg0) {
        if (this.field4205 == null || this.field4210 == 0 && this.field4204 == 0) {
            return;
        }
        if (field4203 == null || field4203.length < this.field4205.length) {
            field4203 = new int[this.field4205.length];
        }
        int var2 = this.field4205.length;
        int var3 = this.field4204 * arg0;
        int var4 = this.field4208 - 1;
        int var5 = this.field4208 * arg0 * this.field4210;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field4208) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field4208; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field4203[var11] = this.field4205[var12];
            }
        }
        int[] var8 = this.field4205;
        this.field4205 = field4203;
        field4203 = var8;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lhc;Llc;FZ)[I")
    public final int[] method1806(class236 arg0, class86 arg1, float arg2, boolean arg3) {
        if (this.field4205 == null || this.field4201 != arg2) {
            if (!this.field4206.method1349(arg1, arg0, false)) {
                return null;
            }
            this.field4208 = arg3 ? 64 : 128;
            this.field4205 = this.field4206.method1344(this.field4202, (byte) 56, (double) arg2, arg1, true, arg0, this.field4208, this.field4208);
            this.field4201 = arg2;
            if (this.field4207) {
                int[] var5 = new int[this.field4208];
                int[] var6 = new int[this.field4208];
                int[] var7 = new int[this.field4208];
                int[] var8 = new int[this.field4208 * this.field4208];
                int var9 = this.field4208;
                int var10 = this.field4208;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field4205[var14];
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
                        int var27 = this.field4205[var14];
                        var15--;
                        int var28 = this.field4205[var15];
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
                this.field4205 = var8;
            }
        }
        return this.field4205;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lhc;Llc;)Z")
    public final boolean method1807(class236 arg0, class86 arg1) {
        return this.field4206.method1349(arg1, arg0, false);
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lv;)V")
    public class255(class152 arg0) {
        this.field4206 = new class181(arg0);
        this.field4207 = arg0.method1111(255) == 1;
        this.field4202 = arg0.method1111(255) == 1;
        arg0.method1111(255);
        arg0.method1111(255);
        int var2 = arg0.method1111(255) & 0x3;
        this.field4204 = arg0.method1092((byte) -62);
        this.field4210 = arg0.method1092((byte) -62);
        arg0.method1111(255);
        arg0.method1111(255);
        arg0.method1111(255);
    }
}
