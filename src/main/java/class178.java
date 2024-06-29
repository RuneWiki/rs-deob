import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class178 extends class208 {

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public int field2540 = -1;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "[[I")
    public static int[][] field2537 = new int[128][128];

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "[I")
    public static int[] field2533 = new int[50];

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public int field2535;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Ljava/lang/String;")
    public String field2532;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Ljava/lang/String;")
    public String field2539;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "[Lvh;")
    public static class327[] field2538;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
    public static void method1207(int arg0) {
        field2533 = null;
        if (arg0 != 16) {
            method1210(-121, (byte) -23);
        }
        field2538 = null;
        field2537 = null;
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)Lun;")
    public final class386 method1208(int arg0) {
        ++field2531;
        int var2 = -66 % ((arg0 - -17) / 33);
        return class127.field1895[super.field2927];
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lvg;BZII)V")
    public static final void method1209(class49 arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        ++field2530;
        int var5 = arg0.field967;
        if (~arg0.field917 == -1) {
            arg0.field967 = arg0.field975;
        } else if (arg0.field917 == 1) {
            arg0.field967 = -arg0.field975 + arg4;
        } else if (arg0.field917 == 2) {
            arg0.field967 = arg0.field975 * arg4 >> 14;
        }
        int var6 = arg0.field877;
        if (arg0.field970 != 0) {
            if (arg0.field970 != 1) {
                if (arg0.field970 == 2) {
                    arg0.field877 = arg0.field971 * arg3 >> 14;
                }
            } else {
                arg0.field877 = arg3 - arg0.field971;
            }
        } else {
            arg0.field877 = arg0.field971;
        }
        if (~arg0.field917 == -5) {
            arg0.field967 = arg0.field882 * arg0.field877 / arg0.field997;
        }
        if (arg0.field970 == 4) {
            arg0.field877 = arg0.field997 * arg0.field967 / arg0.field882;
        }
        if (class681.field9611 && (~client.method1767(arg0).field1943 != -1 || ~arg0.field980 == -1)) {
            if (arg0.field877 < 5 && arg0.field967 < 5) {
                arg0.field877 = 5;
                arg0.field967 = 5;
            } else {
                if (~arg0.field877 >= -1) {
                    arg0.field877 = 5;
                }
                if (~arg0.field967 >= -1) {
                    arg0.field967 = 5;
                }
            }
        }
        if (arg1 != 1) {
            field2533 = null;
        }
        if (~class235.field3642 == ~arg0.field963) {
            class575.field8091 = arg0;
        }
        if (arg2 && arg0.field1016 != null) {
            if (~arg0.field967 != ~var5 || ~arg0.field877 != ~var6) {
                class14 var7 = new class14();
                var7.field129 = arg0;
                var7.field122 = arg0.field1016;
                class293.field4324.method474(var7, 6);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)C")
    public static final char method1210(int arg0, byte arg1) {
        ++field2529;
        int var2 = arg1 & 255;
        if (arg0 != 32062) {
            field2538 = null;
        }
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (var2 >= 128 && ~var2 > -161) {
                char var3 = class497.field7043[var2 + -128];
                if (~var3 == -1) {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)I")
    public static final int method1211(byte arg0) {
        ++field2534;
        return arg0 != -48 ? 18 : 16;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
    public static final void method1212(int arg0, int arg1) {
        ++field2536;
        if (arg1 != -1) {
            if (class518.field7302[arg1]) {
                class261.field3971.method2995(arg1, 127);
                class181.field2558[arg1] = null;
                if (arg0 != 2) {
                    field2538 = null;
                }
                class277.field4197[arg1] = null;
                class518.field7302[arg1] = false;
            }
        }
    }
}
