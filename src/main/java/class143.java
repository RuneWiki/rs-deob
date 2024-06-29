import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class143 {

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Ldd;")
    public static class35 field2998 = class180.method1196((byte) -90, "(Z");

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Ldd;")
    public static class35 field2997 = class180.method1196((byte) 126, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Ldd;")
    private static class35 field3006 = class180.method1196((byte) 127, "World");

    @OriginalMember(owner = "client!p", name = "g", descriptor = "[J")
    public static long[] field3001 = new long[500];

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Ldd;")
    public static class35 field2999 = class180.method1196((byte) 126, "gr-Un:");

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Ldd;")
    public static class35 field3004 = field3006;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Ldd;")
    public static class35 field3007 = field3006;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Ldd;")
    public static class35 field2996 = class180.method1196((byte) 126, ":duelstake:");

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Ldd;")
    private static class35 field3008 = class180.method1196((byte) -95, "glow2:");

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Ldd;")
    public static class35 field3009 = class180.method1196((byte) 126, "Fertigkeit)2");

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Ldd;")
    public static class35 field3002 = field3008;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Ldd;")
    public static class35 field3000 = field3008;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "[I")
    public static int[] field3003;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)I")
    public static final int method980(int arg0, int arg1, int arg2) {
        field2995++;
        int var3 = arg0;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method981(byte arg0) {
        field3003 = null;
        field2998 = null;
        field3000 = null;
        field2999 = null;
        if (arg0 > -80) {
            return;
        }
        field2996 = null;
        field3008 = null;
        field3001 = null;
        field3004 = null;
        field3009 = null;
        field3002 = null;
        field2997 = null;
        field3007 = null;
        field3006 = null;
    }
}
