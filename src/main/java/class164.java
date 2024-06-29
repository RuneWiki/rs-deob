import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class164 extends class45 {

    @OriginalMember(owner = "client!sr", name = "O", descriptor = "I")
    private int field2537;

    @OriginalMember(owner = "client!sr", name = "L", descriptor = "Liv;")
    public static class64 field2534 = new class64(74, 2);

    @OriginalMember(owner = "client!sr", name = "P", descriptor = "[I")
    public static int[] field2538 = new int[14];

    @OriginalMember(owner = "client!sr", name = "H", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!sr", name = "I", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!sr", name = "J", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!sr", name = "K", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!sr", name = "M", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!sr", name = "N", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)[I", line = 8)
    public final int[] method35(int arg0, int arg1) {
        ++field2532;
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (arg0 != 0) {
            method1209(64);
        }
        if (super.field854.field1928) {
            class73.method595(var3, 0, class259.field3768, this.field2537);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "(I)V", line = 30)
    public static void method1209(int arg0) {
        field2534 = null;
        if (arg0 != 1) {
            field2534 = null;
        }
        field2538 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIII)V", line = 42)
    public static final void method1210(int arg0, int arg1, int arg2, int arg3) {
        ++field2530;
        class226 var4 = class237.field3431[arg3][arg0];
        class488.method2893(var4 == null ? class427.field6352 : var4, arg2 ^ 17911, arg1);
        if (arg2 != -17838) {
            field2534 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(III)I", line = 55)
    public static final int method1211(int arg0, int arg1, int arg2) {
        ++field2533;
        int var3 = 1;
        while (~arg2 < -2) {
            if (~(arg2 & 1) != -1) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 1;
        }
        if (arg0 != 26861) {
            return -61;
        } else if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(I)V", line = 81)
    public class164(int arg0) {
        super(0, true);
        this.field2537 = 4096;
        this.field2537 = arg0;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lcu;II)V", line = 90)
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg1 != -26471) {
            field2534 = null;
        }
        ++field2536;
        if (arg2 == 0) {
            this.field2537 = (arg0.method1063((byte) -35) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(II)I", line = 117)
    public static final int method1212(int arg0, int arg1) {
        return class98.field1633 != null ? class98.field1633[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IB)Z", line = 121)
    public static final boolean method1213(int arg0, byte arg1) {
        ++field2535;
        if (arg0 != 19 && arg0 != 58 && arg0 != 51 && ~arg0 != -19 && ~arg0 != -26) {
            if (arg0 != 49 && arg0 != 1004) {
                if (arg1 != -65) {
                    field2538 = null;
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIB)I", line = 139)
    public static final int method1214(int arg0, int arg1, byte arg2) {
        int var3 = (arg0 & 127) * arg1 >> 7;
        ++field2531;
        if (~var3 > -3) {
            var3 = 2;
        } else if (~var3 < -127) {
            var3 = 126;
        }
        if (arg2 != 47) {
            field2534 = null;
        }
        return (65408 & arg0) - -var3;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V", line = 165)
    public class164() {
        this(4096);
    }
}
