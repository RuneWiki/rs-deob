import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class158 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Lp;")
    private static class280 field2756 = class18.method140((byte) -124, "Loading config )2 ");

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "[Z")
    public static boolean[] field2757 = new boolean[200];

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Lp;")
    public static class280 field2758 = field2756;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "Lp;")
    private static class280 field2763 = class18.method140((byte) -122, " ");

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "Lp;")
    public static class280 field2764 = class18.method140((byte) -118, "::setparticles");

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Lp;")
    public static class280 field2760 = field2763;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Lp;")
    public static class280 field2768 = class18.method140((byte) -118, ":clan:");

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "Lua;")
    public static class113 field2766;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)I")
    public static final int method1123(int arg0, int arg1, int arg2, int arg3) {
        field2761++;
        if (class145.field2529 == null) {
            return 0;
        }
        int var4 = arg1 >> 7;
        if (arg2 != -6230) {
            field2758 = null;
        }
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class259.field4598[1][var4][var5] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg3 & 0x7F;
        int var9 = (128 - var7) * class145.field2529[var6][var4][var5] + class145.field2529[var6][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * class145.field2529[var6][var4][var5 + 1] + class145.field2529[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static void method1124(int arg0) {
        field2764 = null;
        field2756 = null;
        field2766 = null;
        field2760 = null;
        field2758 = null;
        int var1 = -70 % ((arg0 - 46) / 53);
        field2768 = null;
        field2757 = null;
        field2763 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBIIII)V")
    public static final void method1125(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -53) {
            method1127(-44, (byte) -18);
        }
        if (arg3 >= class89.field1440 && class12.field249 >= arg4 && arg2 >= class36.field654 && class249.field4360 >= arg5) {
            class65.method451(arg0, arg3, arg4, arg2, arg1 + 52, arg5);
        } else {
            class222.method1491(arg4, arg3, arg2, arg0, arg5, -1);
        }
        field2759++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "()V")
    public static final void method1126() {
        for (int var0 = 0; var0 < class230.field4012; var0++) {
            class160 var1 = class232.field4050[var0];
            class221.method1490(var1);
            class232.field4050[var0] = null;
        }
        class230.field4012 = 0;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)I")
    public static final int method1127(int arg0, byte arg1) {
        field2767++;
        int var2 = 0;
        if (arg1 > -106) {
            field2760 = null;
        }
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
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
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }
}
