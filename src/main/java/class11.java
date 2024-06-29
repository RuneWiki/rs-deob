import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field142 = -1;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(JZ)V")
    public static final void method51(long arg0, boolean arg1) {
        field147++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class150.field2164 < 100 || class22.field262) || class150.field2164 >= 200) {
            class48.method321(0, "", class53.field858, -126);
            return;
        }
        String var3 = class200.method1255(arg0, false);
        for (int var4 = 0; var4 < class150.field2164; var4++) {
            if (class259.field3944[var4] == arg0) {
                class48.method321(0, "", var3 + class194.field2964, -103);
                return;
            }
        }
        for (int var5 = 0; var5 < class154.field2307; var5++) {
            if (class35.field493[var5] == arg0) {
                class48.method321(0, "", class235.field3543 + var3 + class47.field756, 121);
                return;
            }
        }
        if (var3.equals(class165.field2537.field1663)) {
            class48.method321(0, "", class36.field500, -115);
            return;
        }
        if (!arg1) {
            field142 = 77;
        }
        class262.field3965++;
        class7.field114[class150.field2164] = var3;
        class259.field3944[class150.field2164] = arg0;
        class285.field4275[class150.field2164] = 0;
        class128.field1917[class150.field2164] = "";
        class223.field3344[class150.field2164] = 0;
        class32.field462[class150.field2164] = false;
        class112.field1724 = class68.field1077;
        class150.field2164++;
        class196.field2979.method1106(132, !arg1);
        class196.field2979.method1610(791715792, arg0);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class141 var7 = new class141();
        var7.field2072 = arg1 / 128;
        var7.field2078 = arg2 / 128;
        var7.field2059 = arg3 / 128;
        var7.field2067 = arg4 / 128;
        var7.field2079 = arg0;
        var7.field2055 = arg1;
        var7.field2076 = arg2;
        var7.field2064 = arg3;
        var7.field2073 = arg4;
        var7.field2054 = arg5;
        var7.field2068 = arg6;
        class268.field4044[class80.field1291++] = var7;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static final void method53(int arg0) {
        class116.field1773++;
        if (arg0 == 23067) {
            class196.field2979.method1106(193, false);
            class196.field2979.method1605(class255.field3885, (byte) 108);
            field143++;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lpf;ZLpf;)V")
    public static final void method54(class294 arg0, boolean arg1, class294 arg2) {
        if (!arg1) {
            method52(-110, 73, -11, -78, 108, -31, 85);
        }
        class197.field2994 = arg0;
        class199.field3027 = arg2;
        field145++;
        class232.field3503 = class197.field2994.method1976(1, 3);
    }
}
