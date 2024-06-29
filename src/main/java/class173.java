import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class173 extends class147 {

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "Lvf;")
    public class166 field2080 = new class166();

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public static int field2081 = 0;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "Z")
    public static boolean field2083 = false;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "Lco;")
    public static class210 field2079 = new class210(8);

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    public static int field2086 = 0;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "Lec;")
    public static class40 field2085 = new class40("M", "M", "M", "M");

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "[I")
    public static int[] field2087 = new int[2];

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "Lvf;")
    public static class166 field2089 = new class166();

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "Lhi;")
    public static class382 field2084;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "Leu;")
    public static class61 field2088;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V", line = 5)
    public static void method855(boolean arg0) {
        field2079 = null;
        field2084 = null;
        field2089 = null;
        field2087 = null;
        field2088 = null;
        field2085 = null;
        if (arg0) {
            method856(72, (class280) null, 127, 114, 85, -16, -71, 124, (byte) -121, -118, 37, (byte[][][]) null, 9);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILoj;IIIIIIBII[[[BI)V", line = 22)
    public static final void method856(int arg0, class280 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, byte[][][] arg11, int arg12) {
        field2082++;
        if (arg2 == 0 || arg0 == 0 || arg8 != 10) {
            return;
        }
        if (arg2 == 9) {
            arg2 = 1;
            arg10 = arg10 + 1 & 0x3;
        }
        if (arg2 == 10) {
            arg2 = 1;
            arg10 = arg10 + 3 & 0x3;
        }
        if (arg2 == 11) {
            arg2 = 8;
            arg10 = arg10 + 3 & 0x3;
        }
        arg1.method1367(arg3, arg5, arg9, arg7, arg4, arg6, arg11[arg2 - 1][arg10], arg0, arg12);
    }
}
