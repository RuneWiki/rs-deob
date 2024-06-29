import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class170 extends class255 {

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "Leb;")
    private static class230 field3008 = class68.method589(0, "Jan");

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "Leb;")
    private static class230 field3000 = class68.method589(0, "Sep");

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "Leb;")
    private static class230 field3016 = class68.method589(0, "Aug");

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
    public static int field3013 = 0;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "Leb;")
    private static class230 field3011 = class68.method589(0, "Oct");

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "Leb;")
    private static class230 field3014 = class68.method589(0, "Feb");

    @OriginalMember(owner = "client!bc", name = "gb", descriptor = "Leb;")
    private static class230 field3021 = class68.method589(0, "Jul");

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "Leb;")
    private static class230 field3002 = class68.method589(0, "Mar");

    @OriginalMember(owner = "client!bc", name = "fb", descriptor = "Leb;")
    public static class230 field3020 = class68.method589(0, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!bc", name = "cb", descriptor = "Leb;")
    private static class230 field3017 = class68.method589(0, "May");

    @OriginalMember(owner = "client!bc", name = "eb", descriptor = "[I")
    public static int[] field3019 = new int[5];

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "Leb;")
    private static class230 field3007 = class68.method589(0, "Dec");

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "Leb;")
    private static class230 field3001 = class68.method589(0, "Jun");

    @OriginalMember(owner = "client!bc", name = "db", descriptor = "Leb;")
    private static class230 field3018 = class68.method589(0, "Apr");

    @OriginalMember(owner = "client!bc", name = "ib", descriptor = "Leb;")
    private static class230 field3023 = class68.method589(0, "Allocated memory");

    @OriginalMember(owner = "client!bc", name = "kb", descriptor = "Leb;")
    private static class230 field3025 = class68.method589(0, "Nov");

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "Leb;")
    public static class230 field3006 = field3023;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "[Leb;")
    public static class230[] field3004 = new class230[] { field3008, field3014, field3002, field3018, field3017, field3001, field3021, field3016, field3000, field3011, field3025, field3007 };

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!bc", name = "hb", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!bc", name = "jb", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "Laj;")
    private class46 field3009;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lfk;BI)V")
    private final void method1249(class14 arg0, byte arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg0.method200(255);
            if (this.field3009 == null) {
                int var5 = class52.method415(-13538, var4);
                this.field3009 = new class46(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method200(255) == 1;
                int var8 = arg0.method190(-25267);
                class61 var9;
                if (var7) {
                    var9 = new class259(arg0.method171((byte) 79));
                } else {
                    var9 = new class244(arg0.method187((byte) 61));
                }
                this.field3009.method388(-1, (long) var8, var9);
            }
        }
        field3012++;
        int var10 = 56 % ((-arg1 - 59) / 48);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)I")
    public final int method1250(int arg0, int arg1, int arg2) {
        field3024++;
        if (arg1 != 21597) {
            method1252(123, true);
        }
        if (this.field3009 == null) {
            return arg2;
        } else {
            class244 var4 = (class244) this.field3009.method394((long) arg0, arg1 - 42680);
            return var4 == null ? arg2 : var4.field4189;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lfk;Z)V")
    public final void method1251(class14 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method200(255);
            if (var3 == 0) {
                field3005++;
                return;
            }
            this.method1249(arg0, (byte) 86, var3);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V")
    public static final void method1252(int arg0, boolean arg1) {
        if (class56.field1033.field2274 >> 7 == class227.field3918 && class56.field1033.field2300 >> 7 == class16.field372) {
            class227.field3918 = 0;
        }
        field3010++;
        int var2 = class169.field2984;
        if (arg1) {
            var2 = 1;
        }
        if (arg0 != 104) {
            method1252(-13, false);
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class260 var6;
            if (arg1) {
                var4 = 8791798054912L;
                var6 = class56.field1033;
            } else {
                var4 = (long) class233.field4042[var3] << 32;
                var6 = class230.field4011[class233.field4042[var3]];
            }
            if (var6 != null && var6.method890(2)) {
                var6.field4606 = false;
                if ((class154.field2748 && class169.field2984 > 200 || class169.field2984 > 50) && !arg1 && var6.field2305 == var6.field2282) {
                    var6.field4606 = true;
                }
                int var7 = var6.field2274 >> 7;
                int var8 = var6.field2300 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field4594 == null || var6.field4609 > class259.field4584 || var6.field4605 <= class259.field4584) {
                        if (var6.method1005(0) == 1 && (var6.field2274 & 0x7F) == 64 && (var6.field2300 & 0x7F) == 64) {
                            if (class117.field2100[var7][var8] == class150.field2676) {
                                continue;
                            }
                            class117.field2100[var7][var8] = class150.field2676;
                        }
                        var6.field2307 = class37.method333(var6.field2300, 1637367879, class124.field2174, var6.field2274);
                        class227.method1569(class124.field2174, var6.field2274, var6.field2300, var6.field2307, (var6.method1005(0) - 1) * 64 + 60, var6, var6.field2289, var4, var6.field2267);
                    } else {
                        var6.field4606 = false;
                        var6.field2307 = class37.method333(var6.field2300, 1637367879, class124.field2174, var6.field2274);
                        class100.method848(class124.field2174, var6.field2274, var6.field2300, var6.field2307, var6, var6.field2289, var4, var6.field4590, var6.field4592, var6.field4604, var6.field4595);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
    public static void method1253(int arg0) {
        field3021 = null;
        field3001 = null;
        field3025 = null;
        field3000 = null;
        field3004 = null;
        field3023 = null;
        field3019 = null;
        field3017 = null;
        field3006 = null;
        field3018 = null;
        field3016 = null;
        field3014 = null;
        field3008 = null;
        field3020 = null;
        if (arg0 != -1) {
            method1255(true, (class208) null);
        }
        field3007 = null;
        field3002 = null;
        field3011 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILeb;I)Leb;")
    public final class230 method1254(int arg0, class230 arg1, int arg2) {
        field3003++;
        if (this.field3009 == null) {
            return arg1;
        }
        if (arg0 != 0) {
            field3000 = null;
        }
        class259 var4 = (class259) this.field3009.method394((long) arg2, arg0 - 21083);
        return var4 == null ? arg1 : var4.field4585;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZLck;)V")
    public static final void method1255(boolean arg0, class208 arg1) {
        arg1.field3646 = arg0;
        if (arg1.field3647 != null) {
            arg1.field3647.field3778 = 0;
        }
        field3015++;
        for (class208 var2 = arg1.method437(); var2 != null; var2 = arg1.method454()) {
            method1255(false, var2);
        }
    }
}
