import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class179 {

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "B")
    private byte field2883;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public int field2890;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public int field2884;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public int field2896;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public int field2886;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public int field2882;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "Luf;")
    private static class168 field2885 = class148.method1019(-1720, "Loaded textures");

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field2889 = 0;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "Luf;")
    public static class168 field2891 = field2885;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Lcc;")
    public static class199 field2881;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "Ldk;")
    public static class241 field2895;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "Lqa;")
    public static class74 field2887;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I", line = 9)
    public final int method1283(byte arg0) {
        field2894++;
        if (arg0 < 31) {
            return -84;
        } else if ((this.field2883 & 0x8) == 8) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIII)I", line = 20)
    public static final int method1284(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 243) {
            arg0 >>= 0x4;
        } else if (arg2 > 217) {
            arg0 >>= 0x3;
        } else if (arg2 > 192) {
            arg0 >>= 0x2;
        } else if (arg2 > 179) {
            arg0 >>= 0x1;
        }
        if (arg3 > -99) {
            return 29;
        } else {
            field2893++;
            return (arg2 >> 1) + (arg0 >> 5 << 7) + (arg1 >> 2 << 10);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIIII)Z", line = 47)
    public static final boolean method1285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V", line = 76)
    public static void method1286(byte arg0) {
        field2887 = null;
        if (arg0 != -4) {
            field2891 = (class168) null;
        }
        field2881 = null;
        field2895 = null;
        field2891 = null;
        field2885 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)Luf;", line = 91)
    public static final class168 method1287(int arg0, int arg1, int arg2) {
        field2892++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return class198.field3278;
        } else if (var3 < -6) {
            return class38.field475;
        } else if (var3 < -3) {
            return class284.field4818;
        } else if (var3 < 0) {
            return class103.field1603;
        } else if (var3 > 9) {
            return class252.field4309;
        } else if (arg0 < var3) {
            return class151.field2339;
        } else if (var3 <= 3) {
            return var3 > 0 ? class190.field3069 : class94.field1497;
        } else {
            return class225.field3641;
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)I", line = 148)
    public final int method1288(byte arg0) {
        field2888++;
        if (arg0 != 62) {
            this.field2886 = 126;
        }
        return this.field2883 & 0x7;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V", line = 171)
    public class179() {
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lj;)V", line = 173)
    public class179(class153 arg0) {
        this.field2883 = arg0.method1078(-6338);
        this.field2890 = arg0.method1069(74);
        this.field2884 = arg0.method1089((byte) -14);
        this.field2896 = arg0.method1089((byte) -14);
        this.field2886 = arg0.method1089((byte) -14);
        this.field2882 = arg0.method1089((byte) -14);
    }
}
