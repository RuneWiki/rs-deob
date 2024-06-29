import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class272 extends class333 {

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public volatile int field3380 = -1;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "Ljava/lang/String;")
    public volatile String field3385;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "Lsb;")
    public static class305 field3381 = new class305(74, 8);

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "F")
    public static float field3388;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "Lbp;")
    public static class88 field3387;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)Z", line = 3)
    public static final boolean method1596(byte arg0, int arg1) {
        int var2 = -10 % ((67 - arg0) / 48);
        field3383++;
        return arg1 == 3 || arg1 == 7 || arg1 == 10;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZIII[Lwp;)V", line = 13)
    public static final void method1597(int arg0, boolean arg1, int arg2, int arg3, int arg4, class452[] arg5) {
        field3382++;
        int var6 = -74 % ((-arg0 - 71) / 38);
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class452 var8 = arg5[var7];
            if (var8 != null && var8.field6467 == arg4) {
                class182.method1106(arg2, arg3, var8, arg1, (byte) 68);
                class528.method2972(var8, 2, arg3, arg2);
                if (var8.field6414 > (var8.field6340 - var8.field6483)) {
                    var8.field6414 = var8.field6340 - var8.field6483;
                }
                if (var8.field6414 < 0) {
                    var8.field6414 = 0;
                }
                if (var8.field6451 > var8.field6444 - var8.field6443) {
                    var8.field6451 = var8.field6444 - var8.field6443;
                }
                if (var8.field6451 < 0) {
                    var8.field6451 = 0;
                }
                if (var8.field6471 == 0) {
                    class8.method50(arg1, var8, -17006);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 175)
    public class272(String arg0) {
        this.field3385 = arg0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lr;Z)V", line = 65)
    public static final void method1598(class564 arg0, boolean arg1) {
        arg0.method982(0, 0, class146.field1618, 350);
        field3384++;
        arg0.method1022(0, 0, class146.field1618, 350, class323.field3974 << 24 | 0x332277, 1);
        if (!arg1) {
            return;
        }
        int var2 = 350 / class490.field7121;
        if (class90.field903 > 0) {
            int var3 = 346 - (class490.field7121 + 4);
            int var4 = var2 * var3 / (var2 + class90.field903 - 1);
            int var5 = 4;
            if (class90.field903 > 1) {
                var5 += (var3 - var4) * (class90.field903 - class406.field5429 - 1) / (class90.field903 - 1);
            }
            arg0.method1022(class146.field1618 - 16, var5, 12, var4, class323.field3974 << 24 | 0x332277, 2);
            for (int var6 = class406.field5429; var6 < (class406.field5429 + var2) && class90.field903 > var6; var6++) {
                String[] var7 = class182.method1105('\b', (byte) -75, class210.field2549[var6]);
                int var8 = (class146.field1618 - 24) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg0.method982(var10, 0, var8 + var10 - 8, 350);
                    class698.field9799.method2318(class394.method2235(var7[var9], (byte) 123), -16777216, var10, 0, -1, 348 - ((var6 - class406.field5429) * class490.field7121) - class257.field3236 - class436.field6153.field6596);
                }
            }
        }
        class198.field2349.method2312(-1, class146.field1618 - 25, "Build: 622", -16777216, 330, (byte) 112);
        arg0.method982(0, 0, class146.field1618, 350);
        arg0.method3207(0, 350 - class257.field3236, class146.field1618, -1, false);
        class282.field3535.method2318("--> " + class394.method2235(class222.field2755, (byte) 121), -16777216, 10, 0, -1, 350 - class488.field7097.field6596 - 1);
        if (!class32.field310) {
            return;
        }
        int var11 = -1;
        if (class678.field9539 % 30 > 15) {
            var11 = 16777215;
        }
        arg0.method3202(1, 350 - class488.field7097.field6596 - 11, var11, class488.field7097.method2657((byte) 62, "--> " + class394.method2235(class222.field2755, (byte) 121).substring(0, class68.field678)) + 10, 12);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V", line = 137)
    public static final void method1599(byte arg0) {
        for (int var1 = 0; var1 < class266.field3308.length; var1++) {
            for (int var2 = 0; var2 < class266.field3308[var1].length; var2++) {
                class266.field3308[var1][var2] = class662.field9282;
            }
        }
        if (arg0 <= 46) {
            method1597(56, true, 49, -111, -39, null);
        }
        field3386++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 164)
    public static void method1600(int arg0) {
        if (arg0 == 0) {
            field3387 = null;
            field3381 = null;
        }
    }
}
