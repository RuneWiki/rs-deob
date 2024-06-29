import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class133 {

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Z")
    public boolean field2208 = true;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    public int field2216;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public int field2207;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Ltl;")
    public static class59 field2206 = class85.method639("(U(Y", 9588);

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Ltl;")
    public static class59 field2205 = class85.method639("W-=hlen Sie eine Option", 9588);

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Ltl;")
    private static class59 field2202 = class85.method639("Loading title screen )2 ", 9588);

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "J")
    public static long field2211 = 0L;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "Ltl;")
    public static class59 field2215 = field2202;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "Ltl;")
    public static class59 field2213 = class85.method639("lila:", 9588);

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "Z")
    public static boolean field2212;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V", line = 11)
    public static void method970(boolean arg0) {
        field2215 = null;
        if (arg0) {
            method973(122, 9, -112);
        }
        field2213 = null;
        field2206 = null;
        field2202 = null;
        field2205 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 26)
    public static final void method971(byte arg0) {
        field2200++;
        for (int var1 = 0; var1 < class255.field4242; var1++) {
            int var2 = class301.field5143[var1];
            class102 var3 = class211.field3438[var2];
            int var4 = class18.field236.method1221(102);
            if ((var4 & 0x4) != 0) {
                var4 += class18.field236.method1221(82) << 8;
            }
            class26.method167(var4, var3, false, var2);
        }
        int var5 = -44 / ((-arg0 - 41) / 44);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 55)
    public static final void method972(int arg0) {
        field2203++;
        int var1 = class251.field4187.method705(class275.field4741);
        for (int var2 = 0; var2 < class231.field3803; var2++) {
            int var3 = class251.field4187.method705(class224.method1546(var2, (byte) 120));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class231.field3803 * 15 + 21;
        int var5 = class90.field1402 - var1 / 2;
        if (class152.field2498 < (var1 + var5)) {
            var5 = class152.field2498 - var1;
        }
        int var6 = class84.field1315;
        if (var5 < 0) {
            var5 = 0;
        }
        if (class53.field792 < var4 + var6) {
            var6 = class53.field792 - var4;
        }
        if (arg0 != -32199) {
            method973(-87, -60, 54);
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class184.field3090 == 1) {
            if (class90.field1402 == class16.field204 && class84.field1315 == class248.field4135) {
                class184.field3090 = 0;
                class105.field1736 = var1;
                class1.field4 = var5;
                class247.field4117 = var6;
                class162.field2640 = class231.field3803 * 15 + 22;
                class85.field1336 = true;
            }
        } else if (class90.field1402 == class231.field3794 && class84.field1315 == class149.field2444) {
            class162.field2640 = class231.field3803 * 15 + 22;
            class105.field1736 = var1;
            class247.field4117 = var6;
            class184.field3090 = 0;
            class85.field1336 = true;
            class1.field4 = var5;
        } else {
            class16.field204 = class231.field3794;
            class184.field3090 = 1;
            class248.field4135 = class149.field2444;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V", line = 155)
    public static final void method973(int arg0, int arg1, int arg2) {
        field2209++;
        if (class56.field835 != arg0) {
            class31.field430 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class31.field430[var3] = (var3 << 12) / arg0;
            }
            class260.field4346 = arg0 == 64 ? 2048 : 4096;
            class56.field835 = arg0;
            class310.field5270 = arg0 - 1;
        }
        if (arg2 <= 113) {
            field2212 = false;
        }
        if (class284.field4887 == arg1) {
            return;
        }
        if (class56.field835 == arg1) {
            class71.field1104 = class31.field430;
        } else {
            class71.field1104 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class71.field1104[var4] = (var4 << 12) / arg1;
            }
        }
        class284.field4887 = arg1;
        class132.field2197 = arg1 - 1;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V", line = 212)
    public static final void method974(byte arg0) {
        class41.field615 = null;
        field2210++;
        class284.field4879 = null;
        class236.field3925 = null;
        class53.field794 = (byte[][]) null;
        class243.field4061 = null;
        int var1 = 69 / ((-arg0 - 27) / 44);
        class311.field5274 = null;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IIIIIIZ)V", line = 257)
    public class133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2214 = arg2;
        this.field2208 = arg6;
        this.field2204 = arg5;
        this.field2216 = arg1;
        this.field2201 = arg0;
        this.field2207 = arg3;
        this.field2199 = arg4;
    }
}
