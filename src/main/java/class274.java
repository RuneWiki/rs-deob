import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class274 extends class56 {

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field3211 = -1;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "[J")
    public static long[] field3215 = new long[32];

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field3218 = 0;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "Lifa;")
    public static class450 field3216 = new class450();

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "Lbt;")
    public static class48 field3212;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)I", line = 4)
    public static final int method1602(int arg0, boolean arg1) {
        field3217++;
        return arg1 ? arg0 >>> 7 : -88;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V", line = 26)
    public static void method1603(int arg0) {
        int var1 = -40 / ((arg0 - 23) / 46);
        field3215 = null;
        field3212 = null;
        field3216 = null;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 37)
    public class274() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[I", line = 47)
    public final int[] method145(int arg0, int arg1) {
        if (arg0 != 0) {
            method1603(62);
        }
        field3213++;
        return class648.field8837;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(III)I", line = 58)
    public static final int method1604(int arg0, int arg1, int arg2) {
        if (arg2 < 8) {
            return 112;
        }
        field3214++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }
}
