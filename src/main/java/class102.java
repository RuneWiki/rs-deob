import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class102 extends class601 {

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
    public static int field1401 = 0;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "Lst;")
    public static class335 field1397 = new class335(59, 1);

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ct", name = "v", descriptor = "Luu;")
    public static class237 field1405;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)V", line = 6)
    public final void method43(int arg0, int arg1) {
        int var3 = -127 % ((22 - arg0) / 34);
        super.field8131 = arg1;
        ++field1395;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(ILqea;)V", line = 17)
    public class102(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)I", line = 22)
    public final int method45(int arg0) {
        if (arg0 != 8976) {
            return 25;
        } else {
            ++field1398;
            return 0;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIII[I)V", line = 36)
    public static final void method675(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field1403;
        --arg2;
        int var5 = 93 % ((4 - arg1) / 33);
        int var9 = arg3 - 1;
        int var6 = -7 + var9;
        while (arg2 < var6) {
            int var7 = arg2 + 1;
            arg4[var7] = arg0;
            int var8 = var7 + 1;
            arg4[var8] = arg0;
            int var10 = var8 + 1;
            arg4[var10] = arg0;
            int var11 = var10 + 1;
            arg4[var11] = arg0;
            int var12 = var11 + 1;
            arg4[var12] = arg0;
            int var13 = var12 + 1;
            arg4[var13] = arg0;
            int var14 = var13 + 1;
            arg4[var14] = arg0;
            arg2 = var14 + 1;
            arg4[arg2] = arg0;
        }
        while (~var9 < ~arg2) {
            ++arg2;
            arg4[arg2] = arg0;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)I", line = 63)
    public final int method36(int arg0, byte arg1) {
        if (arg1 != 22) {
            return 16;
        } else {
            ++field1400;
            if (class754.method4183(-70, arg0)) {
                if (super.field8137.field4789.method962(0) && !class449.method2735(super.field8137.field4789.method963(arg1 + -22), (byte) -88)) {
                    return 3;
                }
                if (~super.field8137.field4761.method2799(arg1 ^ 22) == -2) {
                    return 3;
                }
            }
            if (arg0 == 3) {
                return 3;
            } else {
                return class754.method4183(-107, arg0) ? 2 : 1;
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)Z", line = 93)
    public final boolean method676(int arg0) {
        ++field1404;
        return arg0 != 2048 ? true : true;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lqea;)V", line = 108)
    public class102(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)I", line = 112)
    public final int method677(int arg0) {
        if (arg0 != 0) {
            this.method43(92, 41);
        }
        ++field1399;
        return super.field8131;
    }

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "(B)V", line = 124)
    public static void method678(byte arg0) {
        if (arg0 != -75) {
            field1397 = null;
        }
        field1397 = null;
        field1405 = null;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V", line = 135)
    public final void method41(byte arg0) {
        ++field1402;
        if (this.method679((byte) -114)) {
            if (super.field8137.field4789.method962(0) && !class449.method2735(super.field8137.field4789.method963(0), (byte) -93)) {
                super.field8131 = 1;
            }
            if (~super.field8137.field4761.method2799(0) == -2) {
                super.field8131 = 1;
            }
        }
        int var2 = 121 / ((59 - arg0) / 33);
        if (~super.field8131 == -4) {
            super.field8131 = 2;
        }
        if (super.field8131 < 0 || super.field8131 > 3) {
            super.field8131 = this.method45(8976);
        }
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(B)Z", line = 162)
    public final boolean method679(byte arg0) {
        if (arg0 >= -61) {
            this.method45(-112);
        }
        ++field1396;
        return class754.method4183(-92, super.field8131);
    }
}
