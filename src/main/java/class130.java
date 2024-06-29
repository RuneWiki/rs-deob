import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class130 extends class601 {

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    private int field2133 = 4;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    private int field2138 = 4;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(IZ)[[I", line = 4)
    public final int[][] method7(int arg0, boolean arg1) {
        if (!arg1) {
            method1022(false, (class236) null);
        }
        ++field2135;
        int[][] var3 = super.field7890.method3963(1, arg0);
        if (super.field7890.field9769) {
            int var4 = class171.field2624 / this.field2138;
            int var5 = class671.field9149 / this.field2133;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method3268(class671.field9149 * var6 / var5, 0, 65535);
            } else {
                var7 = this.method3268(0, 0, 65535);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class171.field2624 < ~var14; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class171.field2624 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V", line = 74)
    public class130() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)[I", line = 77)
    public final int[] method5(byte arg0, int arg1) {
        if (arg0 != -40) {
            return null;
        } else {
            ++field2136;
            int[] var3 = super.field7902.method382(arg1, true);
            if (super.field7902.field704) {
                int var4 = class171.field2624 / this.field2138;
                int var5 = class671.field9149 / this.field2133;
                int[] var7;
                if (~var5 < -1) {
                    int var6 = arg1 % var5;
                    var7 = this.method3266((byte) 64, class671.field9149 * var6 / var5, 0);
                } else {
                    var7 = this.method3266((byte) 64, 0, 0);
                }
                for (int var8 = 0; var8 < class171.field2624; ++var8) {
                    if (var4 > 0) {
                        int var9 = var8 % var4;
                        var3[var8] = var7[class171.field2624 * var9 / var4];
                    } else {
                        var3[var8] = var7[0];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lee;BI)V", line = 130)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field2133 = arg0.method3821((byte) 100);
            }
        } else {
            this.field2138 = arg0.method3821((byte) 95);
        }
        if (arg1 == -61) {
            ++field2132;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(IIB)Z", line = 164)
    public static final boolean method1021(int arg0, int arg1, byte arg2) {
        ++field2131;
        if (arg2 != -74) {
            method1022(false, (class236) null);
        }
        return class101.method761(arg2 + 90, arg0, arg1) & class730.method4094(arg1, arg0, 125);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZLfa;)V", line = 182)
    public static final void method1022(boolean arg0, class236 arg1) {
        ++field2137;
        if (!arg0) {
            method1021(-4, 74, (byte) 34);
        }
        boolean var2 = false;
        arg1.method2414((byte) -26);
        for (class236 var3 = (class236) class592.field7703.method4051(896); var3 != null; var3 = (class236) class592.field7703.method4049(true)) {
            if (class294.method1822(arg1.method1485(116), 0, var3.method1485(119))) {
                var2 = true;
                class328.method1985(var3, (byte) -29, arg1);
                break;
            }
        }
        if (!var2) {
            class592.field7703.method4050(arg1, -119);
        }
    }
}
