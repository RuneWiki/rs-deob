import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class187 {

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Ltl;")
    private static class59 field3129 = class85.method639("Examine", 9588);

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "[I")
    public static int[] field3130 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Ltl;")
    private static class59 field3133 = class85.method639("Your ignore list is full)3 Max of 100 users)3", 9588);

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Ltl;")
    public static class59 field3134 = class85.method639("Nehmen", 9588);

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "Z")
    public static volatile boolean field3137 = true;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Ltl;")
    public static class59 field3136 = field3133;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Ltl;")
    public static class59 field3138 = field3129;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Lme;")
    public static class295 field3128;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIII)V", line = 7)
    public static final void method1382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3126++;
        int var6 = -98 % ((arg5 + 22) / 38);
        if (arg3 == arg4) {
            class248.method1744(arg1, arg3, arg2, (byte) -27, arg0);
        } else if (arg0 - arg3 >= class69.field1061 && class153.field2504 >= arg0 + arg3 && class28.field369 <= (arg1 - arg4) && arg1 + arg4 <= class62.field957) {
            class218.method1509(-120, arg3, arg0, arg1, arg2, arg4);
        } else {
            class149.method1075(arg4, -85, arg3, arg2, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)Lsb;", line = 29)
    public static final class165 method1383(int arg0, int arg1, int arg2) {
        class245 var3 = class120.field2010[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4092; var4++) {
            class165 var5 = var3.field4107[var4];
            if ((var5.field2673 >> 29 & 0x3L) == 2L && var5.field2682 == arg1 && var5.field2670 == arg2) {
                class146.method1058(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLfj;Leh;)Lkj;", line = 53)
    public static final class32 method1384(boolean arg0, class34 arg1, class94 arg2) {
        field3131++;
        long var3 = ((long) arg1.field492 << 32) + ((long) arg1.field498 << 56) + (long) ((arg1.field508 + 1 << 16) - -arg1.field493);
        if (!arg0) {
            return (class32) null;
        }
        class32 var5 = (class32) arg2.method685(var3, 128);
        if (var5 == null) {
            var5 = new class32(arg1.field508, (float) arg1.field493, true, false, arg1.field492);
            arg2.method694(var5, (byte) -90, var3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 74)
    public static final void method1385(int arg0) {
        class60.field934.method690(arg0 - 24028);
        if (arg0 != 24038) {
            method1383(6, 73, 27);
        }
        field3125++;
        class97.field1547.method9(true);
        class207.field3380.method9(true);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I", line = 87)
    public static final int method1386(int arg0, int arg1) {
        field3132++;
        return arg1 == 16711935 ? (arg0 & 0x1DA1A9) >> 18 : 95;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V", line = 108)
    public static void method1387(byte arg0) {
        field3130 = null;
        field3128 = null;
        field3138 = null;
        field3134 = null;
        field3133 = null;
        if (arg0 != 78) {
            method1383(-34, 31, 28);
        }
        field3136 = null;
        field3129 = null;
    }
}
