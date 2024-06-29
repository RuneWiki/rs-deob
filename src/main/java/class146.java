import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class146 {

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "[I")
    public static int[] field2527 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Z")
    public static boolean field2530 = true;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Lmd;")
    public static class80 field2531;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "[Loe;")
    public static class207[] field2526;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method1027(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < 76) {
            method1028(86, (class50) null, true);
        }
        field2525++;
        int var8 = 2048 - arg4 & 0x7FF;
        int var9 = 2048 - arg6 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg2;
        if (var8 != 0) {
            int var13 = class13.field313[var8];
            var11 = -arg2 * var13 >> 16;
            int var14 = class13.field311[var8];
            var12 = arg2 * var14 >> 16;
        }
        if (var9 != 0) {
            int var15 = class13.field313[var9];
            var10 = var12 * var15 >> 16;
            int var16 = class13.field311[var9];
            var12 = var12 * var16 >> 16;
        }
        class1.field15 = arg7 - var12;
        class221.field3723 = arg4;
        class68.field1286 = arg6;
        class129.field2268 = arg0 - var11;
        class32.field644 = arg3 - var10;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILij;Z)V")
    public static final void method1028(int arg0, class50 arg1, boolean arg2) {
        field2529++;
        if (!arg2) {
            field2531 = null;
        }
        class137 var3 = client.method608(2, !arg2, arg0);
        var3.method952((byte) 34);
        var3.field2372 = arg1;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII)V")
    public static final void method1029(int arg0, int arg1, int arg2, int arg3) {
        field2528++;
        class10 var4 = class62.method475(arg2, arg0, arg3 ^ 0xFFFFEB7A);
        if (var4 != null && var4.field168 != null) {
            class93 var5 = new class93();
            var5.field1739 = var4.field168;
            var5.field1740 = var4;
            class214.method1422(var5, -15181);
        }
        class63.field1214 = arg0;
        if (arg3 != 5253) {
            method1030((byte) 79);
        }
        class188.field3116 = true;
        class231.field3883 = arg2;
        class129.field2270 = arg1;
        class140.method979((byte) 126, var4);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static void method1030(byte arg0) {
        field2526 = null;
        field2531 = null;
        if (arg0 == -82) {
            field2527 = null;
        }
    }
}
