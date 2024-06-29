import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class139 extends class32 {

    @OriginalMember(owner = "client!aq", name = "E", descriptor = "Lcba;")
    public static class471 field2174 = new class471(15, -1);

    @OriginalMember(owner = "client!aq", name = "H", descriptor = "[I")
    public static int[] field2177 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!aq", name = "w", descriptor = "I")
    public int field2166;

    @OriginalMember(owner = "client!aq", name = "x", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!aq", name = "y", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!aq", name = "z", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!aq", name = "A", descriptor = "I")
    public int field2170;

    @OriginalMember(owner = "client!aq", name = "B", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!aq", name = "C", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!aq", name = "D", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!aq", name = "F", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!aq", name = "G", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "J")
    public long field2165;

    @OriginalMember(owner = "client!aq", name = "I", descriptor = "Lao;")
    public static class240 field2178;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)J")
    public final long method329(int arg0) {
        if (arg0 == 120) {
            field2176++;
            return this.field2165;
        } else {
            return 56L;
        }
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(Z)[Lhr;")
    public static final class448[] method927(boolean arg0) {
        field2171++;
        return arg0 ? new class448[] { class21.field268, class21.field301, class21.field302, class21.field303, class21.field304, class21.field305, class21.field306, class21.field307, class21.field308, class21.field309, class21.field310, class21.field311, class21.field312, class21.field313 } : null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIILqa;IIII[[[BIII)V")
    public static final void method928(int arg0, int arg1, int arg2, int arg3, class207 arg4, int arg5, int arg6, int arg7, int arg8, byte[][][] arg9, int arg10, int arg11, int arg12) {
        field2175++;
        if (arg6 == 0 || arg3 == 0) {
            return;
        }
        if (arg6 == 9) {
            arg2 = arg2 + 1 & 0x3;
            arg6 = 1;
        }
        if (arg6 == 10) {
            arg2 = arg2 + 3 & 0x3;
            arg6 = 1;
        }
        if (arg6 == 11) {
            arg2 = arg2 + 3 & 0x3;
            arg6 = 8;
        }
        if (arg11 != 6) {
            field2178 = null;
        }
        arg4.method1264(arg8, arg0, arg10, arg7, arg1, arg5, arg9[arg6 - 1][arg2], arg3, arg12);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
    public static final void method929(int arg0, int arg1) {
        field2169++;
        class314 var2 = class483.method2819(4, arg1, 21303);
        var2.method1962((byte) 0);
        if (arg0 >= -110) {
            field2174 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)I")
    public final int method323(boolean arg0) {
        if (arg0) {
            this.method324(10);
        }
        field2164++;
        return this.field2170;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)I")
    public final int method325(int arg0) {
        field2167++;
        if (arg0 != -19995) {
            this.method328((byte) -45);
        }
        return 0;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)I")
    public final int method324(int arg0) {
        field2173++;
        if (arg0 != -5) {
            field2174 = null;
        }
        return this.field2172;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)V")
    public static void method930(byte arg0) {
        field2174 = null;
        field2177 = null;
        if (arg0 != -96) {
            method927(false);
        }
        field2178 = null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)I")
    public final int method328(byte arg0) {
        if (arg0 >= -99) {
            this.field2170 = 58;
        }
        field2168++;
        return this.field2166;
    }
}
