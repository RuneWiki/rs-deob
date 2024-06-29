import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class181 {

    @OriginalMember(owner = "client!am", name = "c", descriptor = "[I")
    public static int[] field2534 = new int[2];

    @OriginalMember(owner = "client!am", name = "e", descriptor = "[J")
    public static long[] field2536 = new long[32];

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Llc;")
    public static class86 field2533 = new class86(64);

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field2540 = 0;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public int field2537;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Lga;")
    public static class175 field2543;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "Lel;")
    public static class208 field2541;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "Lel;")
    public static class208 field2544;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "Ljava/lang/String;")
    public String field2535;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
    public static final void method1178(byte arg0) {
        class172.field2398.method546(-90762264);
        field2532++;
        if (arg0 > -123) {
            field2543 = null;
        }
        class71.field991.method546(-90762264);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
    public static final void method1179(int arg0) {
        while (true) {
            if (class233.field3518.method1863(-7686, class105.field1460) >= 27) {
                int var1 = class233.field3518.method1865(15, 8);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class119.field1679[var1] == null) {
                        class119.field1679[var1] = new class140();
                        var2 = true;
                    }
                    class140 var3 = class119.field1679[var1];
                    class194.field2688[class92.field1283++] = var1;
                    var3.field4090 = class52.field740;
                    if (var3.field1946 != null && var3.field1946.method1904((byte) 49)) {
                        class88.method559(var3, -1);
                    }
                    int var4 = class233.field3518.method1865(1, 8);
                    var3.method946(class270.method1783((byte) 119, class233.field3518.method1865(14, 8)), -1);
                    int var5 = class233.field3518.method1865(1, 8);
                    if (var5 == 1) {
                        class63.field870[class242.field3711++] = var1;
                    }
                    int var6 = class290.field4566[class233.field3518.method1865(3, 8)];
                    if (var2) {
                        var3.field4009 = var3.field4010 = var6;
                    }
                    int var7 = class233.field3518.method1865(5, 8);
                    int var8 = class233.field3518.method1865(5, 8);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method1744(var3.field1946.field4431, (byte) -97);
                    var3.field3991 = var3.field1946.field4401;
                    if (var3.field3991 == 0) {
                        var3.field4010 = 0;
                    }
                    var3.field4025 = var3.field1946.field4442;
                    var3.method1740((byte) 114, var3.method561(-1), var4 == 1, class217.field3280.field4032[0] + var7, class217.field3280.field4076[0] + var8);
                    if (var3.field1946.method1904((byte) 49)) {
                        class253.method1692(var3, 0, 128, var3.field4076[0], class295.field4642, var3.field4032[0], (class88) null, (class111) null);
                    }
                    continue;
                }
            }
            if (arg0 < 97) {
                method1180(-43, 69, -53);
            }
            field2539++;
            class233.field3518.method1860(-16973);
            return;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)Ltj;")
    public static final class280 method1180(int arg0, int arg1, int arg2) {
        class280 var3 = (class280) class282.field4364.method23(216, (long) arg0 | (long) arg2 << 32);
        if (arg1 != 0) {
            return null;
        }
        if (var3 == null) {
            var3 = new class280(arg2, arg0);
            class282.field4364.method20(var3, var3.field2369, 0);
        }
        field2538++;
        return var3;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
    public static void method1181(byte arg0) {
        field2544 = null;
        if (arg0 > -73) {
            field2541 = null;
        }
        field2543 = null;
        field2541 = null;
        field2533 = null;
        field2536 = null;
        field2534 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1182(String arg0, int arg1) {
        field2542++;
        String var2 = class274.method1828(0, class73.method465((byte) -67, arg0));
        if (var2 == null) {
            var2 = "";
        }
        return arg1 <= 15 ? null : var2;
    }
}
