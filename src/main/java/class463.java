import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class463 {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public int field6361 = -1;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public int field6360 = -1;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public int field6368 = -1;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "Z")
    public static boolean field6373 = false;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public int field6362;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public int field6363;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public int field6364;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public int field6365;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public int field6366;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public int field6369;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "J")
    public static long field6372;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIBIIII)I", line = 3)
    public static final int method2626(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field6367++;
        if ((arg5 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg1;
            arg1 = var7;
        }
        int var8 = arg4 & 0x3;
        if (arg2 != 54) {
            field6373 = true;
        }
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return -arg6 - (arg3 - 1 - 7);
        } else {
            return 7 + 1 - arg0 - arg1;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lkn;)V", line = 83)
    public class463(class742 arg0) {
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)I", line = 43)
    public static final int method2627(int arg0, int arg1) {
        field6370++;
        if (arg0 <= 59) {
            method2628(-12, 41, 50);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)Z", line = 62)
    public static final boolean method2628(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            field6372 = -41L;
        }
        field6371++;
        boolean var3 = (arg1 & 0x37) == 0 ? class548.method3062(arg1, 55, arg2) : class224.method1432(arg1, arg2, (byte) 63);
        return class672.method3713(arg0 - 78, arg2, arg1) | (arg2 & 0x10000) != 0 | var3;
    }
}
