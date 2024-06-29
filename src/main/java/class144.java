import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class144 {

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "J")
    public static long field1921 = 0L;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Z")
    public static boolean field1922 = false;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Lum;")
    public static class366 field1914;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;IIJZZB)V", line = 4)
    public static final void method878(int arg0, int arg1, int arg2, String arg3, String arg4, int arg5, int arg6, long arg7, boolean arg8, boolean arg9, byte arg10) {
        field1920++;
        if (class483.field7125 || class391.field5656 >= 500) {
            return;
        }
        int var12 = arg6 == -1 ? class256.field3403 : arg6;
        class36 var13 = new class36(arg3, arg4, var12, arg2, arg0, arg7, arg1, arg5, arg8, arg9);
        class69.field806.method975(0, var13);
        if (arg10 > -56) {
            field1914 = null;
        }
        class391.field5656++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZII)Z", line = 26)
    public static final boolean method879(boolean arg0, int arg1, int arg2) {
        field1918++;
        class70 var3 = class123.field1593.method2920(arg1, 19219);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg0) {
            if (arg2 >= 5 && arg2 <= 8) {
                arg2 = 4;
            }
            return var3.method404(0, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)V", line = 49)
    public static final void method880(int arg0, byte arg1) {
        if (arg1 <= 33) {
            method878(103, 66, 121, null, null, 72, -3, -118L, true, true, (byte) -93);
        }
        field1919++;
        class184 var2 = class277.method1682(arg0, 11, -103);
        var2.method1075((byte) -80);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 62)
    public static void method881(int arg0) {
        field1914 = null;
        if (arg0 >= -41) {
            method878(26, 6, 61, null, null, 53, -26, -18L, false, true, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BII)V", line = 73)
    public static final void method882(byte arg0, int arg1, int arg2) {
        field1915++;
        if (class488.field7161 == 1) {
            class76.method442(arg2, 0, class249.field3317, arg1);
        } else if (class488.field7161 == 2) {
            class349.method2052(arg2, arg1, 23938);
        }
        if (arg0 > -85) {
            field1914 = null;
        }
        class249.field3317 = null;
        class488.field7161 = 0;
    }
}
