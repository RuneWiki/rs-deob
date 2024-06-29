import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class176 {

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Z")
    public static boolean field3021 = true;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Ljd;")
    public static class85 field3022 = class221.method1499("Nehmen", (byte) -98);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static final void method1188(byte arg0) {
        if (arg0 < 31) {
            field3022 = null;
        }
        class127.field2218.method1262(17244);
        field3019++;
        class221.field3875.method1262(17244);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BII)I")
    public static final int method1189(byte arg0, int arg1, int arg2) {
        field3020++;
        int var3 = -101 / ((-arg0 - 42) / 60);
        if (arg1 > arg2) {
            int var4 = arg2;
            arg2 = arg1;
            arg1 = var4;
        }
        while (arg1 != 0) {
            int var5 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var5;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method1190(int arg0) {
        if (arg0 == -19970) {
            field3022 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIBZI)Lfg;")
    public static final class12 method1191(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        field3018++;
        int var6 = (arg0 << 19) + (arg2 << 17) + arg1 + (arg4 ? 65536 : 0);
        if (arg3 >= -35) {
            method1191(63, -127, -68, (byte) 33, true, -36);
        }
        long var8 = (long) var6 * 3849834839L + (long) arg5 * 3147483667L;
        class12 var10 = (class12) class6.field74.method1269(var8, (byte) 61);
        if (var10 != null) {
            return var10;
        }
        class173.field2997 = false;
        class12 var11 = class5.method20((byte) -54, false, arg0, arg1, arg4, arg5, false, arg2);
        if (var11 != null && !class173.field2997) {
            class6.field74.method1271(-15561, var11, var8);
        }
        return var11;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)Z")
    public static final boolean method1192(int arg0, byte arg1) {
        int var2 = -47 / ((18 - arg1) / 42);
        field3017++;
        return (arg0 & 0x1) != 0;
    }
}
