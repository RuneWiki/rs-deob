import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class126 extends class194 {

    @OriginalMember(owner = "client!we", name = "O", descriptor = "Z")
    private boolean field1408 = true;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "Z")
    private boolean field1403 = true;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "[I")
    public static int[] field1412 = new int[32];

    @OriginalMember(owner = "client!we", name = "P", descriptor = "Lcq;")
    public static class72 field1409 = new class72("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "[[B")
    public static byte[][] field1411;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V", line = 4)
    public static final void method814(byte arg0) {
        class137.field1567 = null;
        class411.field5666 = null;
        class446.field6232 = null;
        if (arg0 != 0) {
            method817((byte) 103);
        }
        class433.field5910 = null;
        class234.field3080 = null;
        class35.field386 = null;
        class276.field3574 = null;
        ++field1402;
        class97.field1141 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)[I", line = 22)
    public final int[] method55(int arg0, int arg1) {
        int var3 = -20 % ((57 - arg1) / 46);
        ++field1407;
        int[] var4 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            int[] var5 = this.method1203(0, 74, !this.field1403 ? arg0 : -arg0 + class210.field2551);
            if (this.field1408) {
                for (int var6 = 0; var6 < class138.field1579; ++var6) {
                    var4[var6] = var5[class442.field6113 - var6];
                }
            } else {
                class114.method669(var5, 0, var4, 0, class138.field1579);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIII)I", line = 61)
    public static final int method815(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1405;
        int var7 = arg6 & 3;
        if (~(1 & arg2) == -2) {
            int var8 = arg1;
            arg1 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg5;
        } else {
            if (arg0 != -1) {
                field1409 = null;
            }
            if (var7 == 1) {
                return -arg4 + 7 - arg1 - -1;
            } else {
                return ~var7 == -3 ? -arg5 + 7 - (arg3 + -1) : arg4;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V", line = 99)
    public class126() {
        super(1, false);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILbg;)V", line = 102)
    public final void method54(int arg0, int arg1, class242 arg2) {
        int var4 = 111 / ((52 - arg1) / 61);
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field2278 = arg2.method1563(-128) == 1;
                }
            } else {
                this.field1403 = arg2.method1563(-128) == 1;
            }
        } else {
            this.field1408 = arg2.method1563(-128) == 1;
        }
        ++field1406;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIILuo;ILeq;II)Lc;", line = 144)
    public static final class436 method816(int arg0, int arg1, int arg2, class118 arg3, int arg4, class434 arg5, int arg6, int arg7) {
        class18.field203.field1892 = arg5 != null;
        if (arg1 != 8) {
            return null;
        } else {
            class18.field203.field1883 = arg6;
            class18.field203.field1884 = arg0;
            class18.field203.field1880 = arg2;
            class18.field203.field1882 = arg7;
            class18.field203.field1889 = arg3.field1360;
            class18.field203.field1887 = arg4;
            ++field1404;
            return (class436) class450.field6285.method1010((byte) 86, class18.field203);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)[[I", line = 173)
    public final int[][] method59(int arg0, int arg1) {
        ++field1410;
        if (arg0 != -730) {
            method817((byte) -89);
        }
        int[][] var3 = super.field2283.method1667(arg1, -95);
        if (super.field2283.field3451) {
            int[][] var4 = this.method1200(arg0 ^ -742, !this.field1403 ? arg1 : class210.field2551 - arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field1408) {
                for (int var11 = 0; ~class138.field1579 < ~var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~class138.field1579 < ~var12; ++var12) {
                    var8[var12] = var5[class442.field6113 - var12];
                    var9[var12] = var6[-var12 + class442.field6113];
                    var10[var12] = var7[-var12 + class442.field6113];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V", line = 238)
    public static void method817(byte arg0) {
        field1412 = null;
        if (arg0 >= -124) {
            field1413 = 55;
        }
        field1409 = null;
        field1411 = null;
    }
}
