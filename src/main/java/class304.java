import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class304 extends class128 {

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "Z")
    public boolean field4864 = false;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "Lmk;")
    public class227 field4865;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "Z")
    private boolean field4867;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "Z")
    private boolean field4866;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
    private int field4868;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    private int field4869;

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "F")
    private float field4871;

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "I")
    private int field4870;

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "[I")
    private int[] field4872;

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "[I")
    public static int[] field4873;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lmh;Lnh;FZ)[I")
    public final int[] method2043(class64 arg0, class305 arg1, float arg2, boolean arg3) {
        if (this.field4872 == null || this.field4871 != arg2) {
            if (!this.field4865.method1501(-1, arg1, arg0)) {
                return null;
            }
            this.field4870 = arg3 ? 64 : 128;
            this.field4872 = this.field4865.method1504((double) arg2, this.field4866, this.field4870, 117, arg0, this.field4870, true, arg1);
            this.field4871 = arg2;
            if (this.field4867) {
                int[] var5 = new int[this.field4870];
                int[] var6 = new int[this.field4870];
                int[] var7 = new int[this.field4870];
                int[] var8 = new int[this.field4870 * this.field4870];
                int var9 = this.field4870;
                int var10 = this.field4870;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14 = var9;
                int var15 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var32 = var11; var32 >= 0; var32--) {
                        var14--;
                        int var33 = this.field4872[var14];
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
                        int var27 = this.field4872[var14];
                        var15--;
                        int var28 = this.field4872[var15];
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
                this.field4872 = var8;
            }
        }
        return this.field4872;
    }

    @OriginalMember(owner = "client!wl", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lmh;Lnh;)Z")
    public final boolean method2044(class64 arg0, class305 arg1) {
        return this.field4865.method1501(-1, arg1, arg0);
    }

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "(I)V")
    public final void method2045(int arg0) {
        if (this.field4872 == null || this.field4869 == 0 && this.field4868 == 0) {
            return;
        }
        if (field4873 == null || field4873.length < this.field4872.length) {
            field4873 = new int[this.field4872.length];
        }
        int var2 = this.field4872.length;
        int var3 = this.field4868 * arg0;
        int var4 = this.field4870 - 1;
        int var5 = this.field4870 * arg0 * this.field4869;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field4870) {
            int var9 = var5 + var7 & var6;
            for (int var10 = 0; var10 < this.field4870; var10++) {
                int var11 = var7 + var10;
                int var12 = (var3 + var10 & var4) + var9;
                field4873[var11] = this.field4872[var12];
            }
        }
        int[] var8 = this.field4872;
        this.field4872 = field4873;
        field4873 = var8;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "()V")
    public static void method2046() {
        field4873 = null;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lbj;)V")
    public class304(class215 arg0) {
        this.field4865 = new class227(arg0);
        this.field4867 = arg0.method1374((byte) -60) == 1;
        this.field4866 = arg0.method1374((byte) -60) == 1;
        arg0.method1374((byte) -60);
        arg0.method1374((byte) -60);
        int var2 = arg0.method1374((byte) -60) & 0x3;
        this.field4868 = arg0.method1350((byte) -80);
        this.field4869 = arg0.method1350((byte) -34);
        arg0.method1374((byte) -60);
        arg0.method1374((byte) -60);
        arg0.method1374((byte) -60);
    }
}
