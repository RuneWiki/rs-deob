import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class132 {

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field1728 = 0;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "[I")
    public static int[] field1730 = new int[14];

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "[I")
    public static int[] field1733 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public static void method945(byte arg0) {
        field1733 = null;
        if (arg0 != 38) {
            field1729 = 83;
        }
        field1730 = null;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
    public static final void method946(byte arg0) {
        class261.field3671 = true;
        if (arg0 <= 48) {
            field1730 = null;
        }
        field1731++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lib;ZLib;IZ)I")
    public static final int method947(class162 arg0, boolean arg1, class162 arg2, int arg3, boolean arg4) {
        field1732++;
        if (arg3 == 1) {
            int var5 = arg0.field10799;
            int var6 = arg2.field10799;
            if (!arg4) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class466.method2754((byte) -117, arg0.method1274((byte) -120).field5285, class526.field7494, arg2.method1274((byte) -120).field5285);
        } else if (arg3 == 3) {
            if (arg0.field2386.equals("-")) {
                if (arg2.field2386.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field2386.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class466.method2754((byte) 94, arg0.field2386, class526.field7494, arg2.field2386);
            }
        } else if (arg3 == 4) {
            if (arg0.method4306((byte) 112)) {
                return arg2.method4306((byte) 116) ? 0 : 1;
            } else if (arg2.method4306((byte) 96)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 5) {
            if (arg0.method4311(-1)) {
                return arg2.method4311(-1) ? 0 : 1;
            } else if (arg2.method4311(-1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 != 6) {
            if (!arg1) {
                field1728 = -96;
            }
            if (arg3 == 7) {
                if (arg0.method4308(arg1)) {
                    return arg2.method4308(arg1) ? 0 : 1;
                } else if (arg2.method4308(true)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 8) {
                int var7 = arg0.field2382;
                int var8 = arg2.field2382;
                if (arg4) {
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                } else {
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg0.field2380 - arg2.field2380;
            }
        } else if (arg0.method4309(-122)) {
            return arg2.method4309(-125) ? 0 : 1;
        } else if (arg2.method4309(-122)) {
            return -1;
        } else {
            return 0;
        }
    }
}
