import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class135 extends class134 {

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field2019 = 0;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field2016 = 0;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Lv;")
    public static class154 field2021 = null;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Z")
    public static boolean field2027 = false;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public int field2020;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public int field2023;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public int field2024;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Lub;")
    public static class92 field2018;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIILnh;Lnh;IIJ)V")
    public static final void method1000(int arg0, int arg1, int arg2, int arg3, class55 arg4, class55 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class163 var10 = new class163();
        var10.field2448 = arg8;
        var10.field2462 = arg1 * 128 + 64;
        var10.field2458 = arg2 * 128 + 64;
        var10.field2466 = arg3;
        var10.field2456 = arg4;
        var10.field2459 = arg5;
        var10.field2460 = arg6;
        var10.field2447 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class149.field2210[var11][arg1][arg2] == null) {
                class149.field2210[var11][arg1][arg2] = new class22(var11, arg1, arg2);
            }
        }
        class149.field2210[arg0][arg1][arg2].field375 = var10;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIIZLtc;II)Lel;")
    public static final class213 method1001(boolean arg0, int arg1, int arg2, boolean arg3, class186 arg4, int arg5, int arg6) {
        field2026++;
        int var8 = (arg5 << 19) + (arg3 ? 65536 : 0) + arg2 + (arg6 << 17);
        long var9 = (long) arg1 * 3147483667L + ((long) var8 * 3849834839L);
        class213 var11 = (class213) class250.field4009.method1173(var9, true);
        if (var11 != null) {
            return var11;
        }
        class224.field3603 = false;
        class213 var12 = class43.method373(arg6, arg0, arg2, arg4, arg3, arg5, false, arg1, arg0);
        if (var12 != null && !class224.field3603) {
            class250.field4009.method1167((byte) 97, var12, var9);
        }
        return var12;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
    public static void method1002(boolean arg0) {
        field2018 = null;
        if (arg0) {
            field2016 = 26;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I")
    public static final int method1003(int arg0, int arg1) {
        field2017++;
        if (arg1 < 26) {
            method1000(123, -66, -35, 87, (class55) null, (class55) null, -101, -117, 30L);
        }
        return arg0 >>> 7;
    }
}
