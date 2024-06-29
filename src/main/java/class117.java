import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class117 extends class211 {

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field2145 = 0;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "Lub;")
    public static class227 field2147 = class257.method1749(")2", 17263);

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIIIIZI)Z")
    public static final boolean method736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        if (arg0 <= 42) {
            method737(false);
        }
        field2142++;
        if (class216.field3639.field45 == 2) {
            return class201.method1297((byte) 58, arg5, arg6, arg11, arg4, arg8, arg1, arg9, arg2, arg3, arg7, arg10);
        } else if (class216.field3639.field45 > 2) {
            return class204.method1309(arg2, arg8, arg1, arg11, arg4, arg7, -103, arg6, arg10, arg3, class216.field3639.field45, arg9, arg5);
        } else {
            return class91.method537(arg4, arg11, arg3, arg9, arg10, arg2, arg1, -104, arg8, arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
    public static void method737(boolean arg0) {
        field2147 = null;
        if (!arg0) {
            method737(true);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIILfh;IJIIII)Z")
    public static final boolean method738(int arg0, int arg1, int arg2, int arg3, class180 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class250.method1674(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method739(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class208.field3531 = arg3;
        class59.field1096 = arg1;
        field2144++;
        if (arg5 != 128) {
            field2145 = 105;
        }
        class199.field3416 = arg4;
        class245.field4273 = arg2;
        class235.field4066 = arg6;
        if (arg0 && class235.field4066 >= 100) {
            class88.field1527 = class199.field3416 * 128 + 64;
            class184.field3135 = class208.field3531 * 128 + 64;
            class25.field422 = class193.method1227(class184.field3135, true, class64.field1171, class88.field1527) - class59.field1096;
        }
        client.field1447 = 2;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)Lsg;")
    public static final class243 method740(int arg0, int arg1) {
        field2146++;
        if (arg1 < 1) {
            field2147 = null;
        }
        if (arg0 == 0) {
            return new class256();
        } else if (arg0 == 1) {
            return new class97();
        } else if (arg0 == 2) {
            return new class197();
        } else if (arg0 == 3) {
            return new class102();
        } else if (arg0 == 4) {
            return new class33();
        } else if (arg0 == 5) {
            return new class52();
        } else if (arg0 == 6) {
            return new class59();
        } else if (arg0 == 7) {
            return new class257();
        } else if (arg0 == 8) {
            return new class245();
        } else if (arg0 == 9) {
            return new class235();
        } else if (arg0 == 10) {
            return new class179();
        } else if (arg0 == 11) {
            return new class36();
        } else if (arg0 == 12) {
            return new class250();
        } else if (arg0 == 13) {
            return new class104();
        } else if (arg0 == 14) {
            return new class95();
        } else if (arg0 == 15) {
            return new class112();
        } else if (arg0 == 16) {
            return new class30();
        } else if (arg0 == 17) {
            return new class223();
        } else if (arg0 == 18) {
            return new class232();
        } else if (arg0 == 19) {
            return new class72();
        } else if (arg0 == 20) {
            return new class229();
        } else if (arg0 == 21) {
            return new class16();
        } else if (arg0 == 22) {
            return new class114();
        } else if (arg0 == 23) {
            return new class204();
        } else if (arg0 == 24) {
            return new class22();
        } else if (arg0 == 25) {
            return new class185();
        } else if (arg0 == 26) {
            return new class219();
        } else if (arg0 == 27) {
            return new class218();
        } else if (arg0 == 28) {
            return new class162();
        } else if (arg0 == 29) {
            return new class80();
        } else if (arg0 == 30) {
            return new class91();
        } else if (arg0 == 31) {
            return new class236();
        } else if (arg0 == 32) {
            return new class141();
        } else if (arg0 == 33) {
            return new class156();
        } else if (arg0 == 34) {
            return new class81();
        } else if (arg0 == 35) {
            return new class207();
        } else if (arg0 == 36) {
            return new class42();
        } else if (arg0 == 37) {
            return new class63();
        } else if (arg0 == 38) {
            return new class37();
        } else if (arg0 == 39) {
            return new class76();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIBLn;)Lna;")
    public static final class209 method741(int arg0, int arg1, byte arg2, class138 arg3) {
        field2143++;
        if (arg2 != 20) {
            method737(true);
        }
        return class123.method760(arg3, arg1, arg0, 107) ? class138.method863(arg2 - 20) : null;
    }
}
