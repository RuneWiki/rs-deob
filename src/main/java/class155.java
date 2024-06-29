import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class155 extends class431 {

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public int field2295 = -1;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public int field2309 = 0;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "[I")
    public static int[] field2293 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "Z")
    public static boolean field2296 = false;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "Lob;")
    public static class521 field2303 = new class521(70, 3);

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public static int field2312 = 0;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public static int field2310 = -1;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    public static int field2314 = 0;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public int field2294;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public int field2298;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public int field2299;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public int field2300;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public int field2301;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public int field2302;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    public int field2305;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public int field2306;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public int field2308;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "[[B")
    public static byte[][] field2311;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method1064(int arg0) {
        field2311 = null;
        field2303 = null;
        if (arg0 > 41) {
            field2293 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
    public static final void method1065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field2304++;
        if (class491.field7059 == null) {
            return;
        }
        int var14 = 64 % ((arg10 + 55) / 60);
        class129 var16;
        if (arg11 >= 0) {
            int var15 = arg11 - 1;
            var16 = class153.field2265[var15];
        } else {
            int var17 = -arg11 - 1;
            if (class261.field4008 == var17) {
                var16 = class398.field5947;
            } else {
                var16 = class26.field319[var17];
            }
        }
        if (var16 == null) {
            return;
        }
        class69 var18 = class510.field7458.method2973(-119, arg8);
        int var19;
        int var20;
        if (arg1 == 1 || arg1 == 3) {
            var19 = var18.field941;
            var20 = var18.field927;
        } else {
            var19 = var18.field927;
            var20 = var18.field941;
        }
        int var21 = arg0 + (var20 >> 1);
        int var22 = (var20 + 1 >> 1) + arg0;
        int var23 = (var19 >> 1) + arg2;
        int var24 = arg2 + (var19 + 1 >> 1);
        class145 var25 = class491.field7059[arg5];
        int var26 = var25.method411(var21, var23) + var25.method411(var22, var23) + var25.method411(var21, var24) + var25.method411(var22, var24) >> 2;
        class383 var27 = new class383();
        var27.field5754 = arg0;
        var27.field5755 = class475.field6854 + arg13;
        var27.field5769 = class475.field6854 + arg12;
        var27.field5756 = arg2;
        var27.field5763 = arg8;
        var27.field5768 = var16.field5826;
        if (arg9 < arg7) {
            int var28 = arg7;
            arg7 = arg9;
            arg9 = var28;
        }
        var27.field5753 = arg3;
        var27.field5762 = arg1;
        var27.field5759 = arg0 + arg9;
        if (arg4 > arg6) {
            int var29 = arg4;
            arg4 = arg6;
            arg6 = var29;
        }
        var27.field5767 = arg0 + arg7;
        var27.field5761 = arg2 + arg6;
        var27.field5758 = var26;
        var27.field5764 = (var27.field5754 << 7) + (var20 << 6);
        var27.field5765 = (var27.field5756 << 7) + (var19 << 6);
        var27.field5766 = arg2 + arg4;
        class18.field226.method994(var27, -3610);
        var16.field1986 = var27;
    }
}
