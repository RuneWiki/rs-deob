import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class141 extends class206 {

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field2553 = 0;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Loc;")
    public static class151 field2554 = class137.method873(2, "::fpsoff");

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Luc;")
    public static class211 field2556 = new class211(64);

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "[Lta;")
    public static class199[] field2561 = new class199[50];

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "Loc;")
    private static class151 field2563 = class137.method873(2, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "Loc;")
    private static class151 field2562 = class137.method873(2, "Unable to find ");

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "Loc;")
    public static class151 field2564 = field2563;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "Loc;")
    public static class151 field2560 = field2562;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "[I")
    public static int[] field2558;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIZ)V")
    public static final void method904(int arg0, int arg1, int arg2, boolean arg3) {
        field2555++;
        if (arg1 != 3569035) {
            method904(-28, 107, 34, false);
        }
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class222.field3854 = arg0;
        class149.field2668 = arg3;
        class204.field3624 = arg2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ln;IIIIIB)V")
    public static final void method905(class138 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field2557++;
        long var7 = 0L;
        boolean var9 = true;
        if (arg5 == 0) {
            var7 = class225.method1413(arg2, arg1, arg4);
        }
        boolean var10 = false;
        if (arg5 == 1) {
            var7 = class111.method669(arg2, arg1, arg4);
        }
        boolean var11 = false;
        if (arg6 >= -3) {
            field2561 = null;
        }
        if (arg5 == 2) {
            var7 = class229.method1448(arg2, arg1, arg4);
        }
        if (arg5 == 3) {
            var7 = class28.method219(arg2, arg1, arg4);
        }
        if (var7 == 0L) {
            return;
        }
        int var12 = (int) var7 >> 14 & 0x1F;
        int var13 = (int) var7 >> 20 & 0x3;
        int var14 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        class93 var15 = class5.method32((byte) 34, var14);
        if (arg5 == 0) {
            class225.method1415(arg2, arg1, arg4);
            if (var15.field1719 != 0) {
                arg0.method893(var13, arg1, arg4, var15.field1714, var12, -4);
            }
        }
        if (arg5 == 1) {
            class202.method1283(arg2, arg1, arg4);
        }
        if (arg5 == 2) {
            class187.method1158(arg2, arg1, arg4);
            if (var15.field1719 != 0 && arg1 + var15.field1697 < 104 && var15.field1697 + arg4 < 104 && var15.field1715 + arg1 < 104 && var15.field1715 + arg4 < 104) {
                arg0.method885(-29049, arg4, var13, var15.field1697, arg1, var15.field1714, var15.field1715);
            }
        }
        if (arg5 != 3) {
            return;
        }
        class138.method876(arg2, arg1, arg4);
        if (var15.field1719 == 1) {
            arg0.method892(arg1, arg4, 7735);
            return;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public static void method906(int arg0) {
        field2560 = null;
        field2563 = null;
        field2554 = null;
        field2558 = null;
        field2561 = null;
        field2564 = null;
        int var1 = -57 % ((-arg0 - 44) / 59);
        field2556 = null;
        field2562 = null;
    }
}
