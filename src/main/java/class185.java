import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class185 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "[J")
    public static long[] field3288 = new long[100];

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field3291 = 0;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Loh;")
    public static class258 field3287 = class153.method1046("<img=0>", 86);

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Loh;")
    public static class258 field3293 = class153.method1046("blaugr-Un:", 97);

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field3289 = 0;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "[I")
    public static int[] field3296 = new int[4096];

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lqj;Z)V", line = 28)
    public static final void method1250(class231 arg0, boolean arg1) {
        class124 var2 = (class124) class205.field3542.method986(arg0.field4007.method1769(16), 0);
        field3290++;
        if (arg1) {
            method1254((byte) -55);
        }
        if (var2 == null) {
            return;
        }
        if (var2.field2193 != null) {
            class184.field3279.method112(var2.field2193);
            var2.field2193 = null;
        }
        var2.method1054((byte) 111);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZLva;)V", line = 56)
    public static final void method1251(boolean arg0, class235 arg1) {
        field3292++;
        if (!arg0) {
            return;
        }
        for (int var2 = 0; var2 < class3.field43; var2++) {
            int var3 = arg1.method1613((byte) 87);
            int var4 = arg1.method1615(56);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class109.field1928[var3] != null) {
                class109.field1928[var3].field76 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIII)I", line = 93)
    public static final int method1252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 25919) {
            method1255(-91, 107, true, true, 40);
        }
        int var7 = arg5 & 0x3;
        field3297++;
        if ((arg6 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return arg0;
        } else if (var7 == 2) {
            return 1 + 7 - arg4 - arg3;
        } else {
            return 7 + 1 - arg0 - arg2;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)I", line = 136)
    public static final int method1253(byte arg0) {
        field3294++;
        if (class71.field1253 != null) {
            return 3;
        }
        if (arg0 <= 73) {
            method1255(-13, -77, true, false, -61);
        }
        if (class257.field4390 && class180.field3217) {
            return 2;
        } else if (class257.field4390 && !class180.field3217) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V", line = 177)
    public static void method1254(byte arg0) {
        field3293 = null;
        field3288 = null;
        int var1 = 94 / ((-arg0 - 11) / 63);
        field3296 = null;
        field3287 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIZZI)V", line = 189)
    public static final void method1255(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        class180.method1236(arg0, arg4, arg2, false, class144.field2426.length - 1, arg3, arg1);
        field3295++;
    }
}
