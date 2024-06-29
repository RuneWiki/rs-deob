import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class5 extends class179 {

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "Z")
    public static boolean field82 = false;

    @OriginalMember(owner = "client!ma", name = "bb", descriptor = "Lke;")
    public static class256 field85 = class316.method2202("::wm3", 27626);

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "Z")
    public static boolean field81 = false;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ma", name = "db", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ma", name = "eb", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ma", name = "fb", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "[Lrd;")
    public static class135[] field75;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lra;I)Lhm;", line = 8)
    public static final class86 method39(class41 arg0, int arg1) {
        field84++;
        if (arg1 != 2) {
            method40(43, -105);
        }
        return new class86(arg0.method309(2), arg0.method309(arg1 ^ 0x0), arg0.method309(2), arg0.method309(2), arg0.method349((byte) -123), arg0.method357(false));
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V", line = 23)
    public static final void method40(int arg0, int arg1) {
        field80++;
        if (!class298.method2087(arg1, 20330)) {
            return;
        }
        class188[] var2 = class50.field921[arg1];
        int var3 = 0;
        if (arg0 != -11122) {
            field85 = (class256) null;
        }
        while (var3 < var2.length) {
            class188 var4 = var2[var3];
            if (var4 != null) {
                var4.field3392 = 0;
                var4.field3394 = 0;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V", line = 68)
    public class5() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)[I", line = 76)
    public final int[] method41(int arg0, int arg1) {
        field83++;
        if (arg1 != -31598) {
            return (int[]) null;
        }
        int[] var3 = this.field3157.method1258(-74, arg0);
        if (this.field3157.field3081) {
            int var4 = class292.field5049[arg0];
            for (int var5 = 0; var5 < class161.field2858; var5++) {
                var3[var5] = this.method46(class290.field5017[var5], var4, -32599) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIII)Z", line = 104)
    public static final boolean method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLng;)V", line = 131)
    public static final void method43(boolean arg0, class138 arg1) {
        class318.field5469 = arg1.method1006((byte) 114, class247.field4215);
        class257.field4445 = arg1.method1006((byte) 82, class305.field5276);
        field79++;
        class230.field3941 = arg1.method1006((byte) 88, class95.field1694);
        class164.field2920 = arg1.method1006((byte) -57, class156.field2772);
        class67.field1240 = arg1.method1006((byte) 94, class257.field4453);
        class205.field3725 = arg1.method1006((byte) 95, class138.field2441);
        class144.field2519 = arg1.method1006((byte) 79, class290.field5024);
        class230.field3944 = arg1.method1006((byte) 108, class240.field4098);
        class118.field2073 = arg1.method1006((byte) 89, class25.field328);
        class99.field1773 = arg1.method1006((byte) -99, class307.field5295);
        class211.field3801 = arg1.method1006((byte) -76, class9.field135);
        if (arg0) {
            method42(-22, -86, 94, -80, 108, -103, -42, -31);
        }
        class254.field4345 = arg1.method1006((byte) 69, class305.field5279);
        class122.field2137 = arg1.method1006((byte) 46, class57.field1050);
        class254.field4359 = arg1.method1006((byte) -76, class7.field119);
        class172.field3053 = arg1.method1006((byte) 45, class170.field3014);
        class269.field4596 = arg1.method1006((byte) -94, class80.field1489);
        class301.field5187 = arg1.method1006((byte) 57, class300.field5167);
        class295.field5120 = arg1.method1006((byte) 45, class145.field2561);
        class196.field3593 = arg1.method1006((byte) 105, class267.field4570);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V", line = 174)
    public static void method44(byte arg0) {
        field75 = null;
        int var1 = -90 / ((-arg0 - 6) / 39);
        field85 = null;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)I", line = 185)
    public static final int method45(byte arg0) {
        field86++;
        if (arg0 != -34) {
            field78 = -102;
        }
        return class302.field5230 && class140.field2468[81] && class17.field244 > 2 ? class310.field5352[class17.field244 - 2] : class310.field5352[class17.field244 - 1];
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(III)I", line = 205)
    private final int method46(int arg0, int arg1, int arg2) {
        if (arg2 != -32599) {
            method42(80, 46, 66, 75, 47, 30, -28, -50);
        }
        field74++;
        int var4 = arg1 * 57 + arg0;
        int var5 = var4 ^ var4 << 1;
        return 4096 - (((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
    }
}
