import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class161 extends class263 {

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "B")
    public byte field2141 = 5;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "Llg;")
    public static class237 field2126 = new class237(64);

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "Z")
    public static boolean field2131 = false;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "[I")
    public static int[] field2137 = new int[14];

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field2138 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public static int field2134 = -1;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field2140 = 0;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "[I")
    public static int[] field2133 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public int field2124;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public int field2125;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public int field2128;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
    public int field2132;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "[Lgh;")
    public static class327[] field2122;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)I")
    public static final int method1033(int arg0, int arg1) {
        field2130++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg1 >= ~arg0) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
    public static void method1034(byte arg0) {
        field2133 = null;
        field2138 = null;
        field2122 = null;
        field2137 = null;
        if (arg0 >= -2) {
            method1033(6, 47);
        }
        field2126 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)I")
    public static final int method1035(int arg0, int arg1, int arg2) {
        field2123++;
        int var3 = arg0 - 1 & arg1 >> 31;
        if (arg2 < 54) {
            field2140 = -71;
        }
        return ((arg1 >>> 31) + arg1) % arg0 + var3;
    }
}
