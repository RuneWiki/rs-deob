import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class15 extends class132 {

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Ltg;")
    private static class184 field283 = class135.method812("Service unavailable)3", 3);

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Ltg;")
    public static class184 field284 = field283;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "[I")
    public static int[] field286 = new int[32];

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Ltg;")
    private static class184 field288 = class135.method812(" more options", 3);

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "Ltg;")
    public static class184 field295 = field288;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public int field292;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Loe;")
    public static class137 field287;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Lpb;")
    public class143 field281;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Ltf;")
    public static class183 field291;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Lud;")
    public class190 field285;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "Lud;")
    public static class190 field296;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "[B")
    public byte[] field289;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
    public static void method91(byte arg0) {
        field295 = null;
        field288 = null;
        field291 = null;
        field284 = null;
        field286 = null;
        field287 = null;
        int var1 = 92 % ((arg0 - 27) / 32);
        field296 = null;
        field283 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIII)I")
    public static final int method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg1;
            arg1 = var8;
        }
        field290++;
        if (arg2 != 27994) {
            return -52;
        } else if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return 8 - arg4 - arg0;
        } else if (var7 == 2) {
            return 8 - arg6 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BILvb;I)[Lsc;")
    public static final class171[] method93(byte arg0, int arg1, class197 arg2, int arg3) {
        if (arg0 != -97) {
            method93((byte) 36, 83, null, -66);
        }
        field282++;
        return class94.method542(arg2, 84, arg1, arg3) ? class39.method229((byte) 107) : null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILvb;I)[Lsc;")
    public static final class171[] method94(int arg0, class197 arg1, int arg2) {
        if (arg2 != 0) {
            method93((byte) -95, 126, null, 0);
        }
        field293++;
        return class128.method781(-31807, arg0, arg1) ? class39.method229((byte) 107) : null;
    }
}
