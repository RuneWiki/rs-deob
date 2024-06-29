import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class106 {

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "[J")
    public static long[] field2306 = new long[100];

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Z")
    public static boolean field2307 = false;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Llc;")
    public static class69 field2309 = class69.method470((byte) -108, "Loaded config");

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field2312 = 0;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Llc;")
    public static class69 field2308 = class69.method470((byte) -124, " @cya@");

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Lcb;")
    public static class15 field2311;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Lcc;")
    public static class16 field2301;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lcc;")
    public static class16 field2303;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Lkc;")
    public static class63 field2302;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Lkc;")
    public static class63 field2304;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Lna;")
    public static class79 field2298;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "[[Lbb;")
    public static class9[][] field2310;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)I")
    public static final int method788(int arg0, int arg1, int arg2, int arg3) {
        field2299++;
        if (arg1 != 3265) {
            return 84;
        } else if ((class43.field856[arg2][arg3][arg0] & 0x8) == 0) {
            return arg2 <= 0 || (class43.field856[1][arg3][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method789(int arg0) {
        field2303 = null;
        field2298 = null;
        field2304 = null;
        field2309 = null;
        field2308 = null;
        field2310 = null;
        field2306 = null;
        field2311 = null;
        field2302 = null;
        if (arg0 > 29) {
            field2301 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Llc;")
    public static final class69 method790(int arg0, int arg1, int arg2) {
        field2300++;
        int var3 = arg1 - arg0;
        if (~var3 > arg2) {
            return class54.field1152;
        } else if (var3 < -6) {
            return class13.field266;
        } else if (var3 < -3) {
            return class67.field1399;
        } else if (var3 < 0) {
            return class104.field2270;
        } else if (var3 > 9) {
            return class98.field2157;
        } else if (var3 > 6) {
            return class82.field1864;
        } else if (var3 > 3) {
            return class51.field1107;
        } else if (var3 > 0) {
            return class73.field1635;
        } else {
            return class120.field2561;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)Llc;")
    public static final class69 method791(int arg0, byte arg1) {
        if (arg1 > -36) {
            return null;
        } else {
            field2305++;
            return class23.method150(10, arg0, -31890, false);
        }
    }
}
