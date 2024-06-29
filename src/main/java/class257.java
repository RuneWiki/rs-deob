import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class257 extends class118 {

    @OriginalMember(owner = "client!fs", name = "K", descriptor = "Z")
    private boolean field3950 = true;

    @OriginalMember(owner = "client!fs", name = "J", descriptor = "Z")
    private boolean field3949 = true;

    @OriginalMember(owner = "client!fs", name = "G", descriptor = "Lnn;")
    public static class151 field3946 = new class151("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!fs", name = "L", descriptor = "[I")
    public static int[] field3951 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!fs", name = "H", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!fs", name = "I", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!fs", name = "M", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!fs", name = "N", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1600(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        class126.field1615 = arg3;
        class44.field546 = arg6;
        class453.field6708 = arg0;
        int var7 = -93 / ((-8 - arg2) / 35);
        class31.field399 = arg1;
        class90.field1276 = arg5;
        ++field3947;
        class423.field6231 = arg4;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        ++field3952;
        if (arg0) {
            method1600(3, -118, (byte) -18, 14, -56, -64, 10);
        }
        int[][] var3 = super.field1549.method2013(arg1, !arg0);
        if (super.field1549.field4903) {
            int[][] var4 = this.method708(this.field3949 ? -arg1 + class438.field6441 : arg1, (byte) -91, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field3950) {
                for (int var11 = 0; class440.field6474 > var11; ++var11) {
                    var8[var11] = var5[-var11 + class87.field1230];
                    var9[var11] = var6[class87.field1230 - var11];
                    var10[var11] = var7[-var11 + class87.field1230];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class440.field6474; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (arg1 == 1) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        super.field1552 = arg2.method2343(255) == 1;
                    }
                } else {
                    this.field3949 = arg2.method2343(255) == 1;
                }
            } else {
                this.field3950 = ~arg2.method2343(arg1 ^ 254) == -2;
            }
            ++field3948;
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
    public class257() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(Z)V")
    public static void method1601(boolean arg0) {
        field3946 = null;
        if (arg0) {
            method1600(57, -19, (byte) -119, -77, -33, 71, 84);
        }
        field3951 = null;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field3953;
        if (arg0 != 1) {
            method1600(95, 73, (byte) 114, -102, -115, 47, 68);
        }
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (super.field1537.field5756) {
            int[] var4 = this.method703(0, this.field3949 ? -arg1 + class438.field6441 : arg1, arg0 + -3);
            if (!this.field3950) {
                class129.method765(var4, 0, var3, 0, class440.field6474);
            } else {
                for (int var5 = 0; ~class440.field6474 < ~var5; ++var5) {
                    var3[var5] = var4[class87.field1230 - var5];
                }
            }
        }
        return var3;
    }
}
