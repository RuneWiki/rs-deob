import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 {

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "[I")
    public static int[] field25 = new int[5];

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static final void method17(int arg0) {
        class307.field4536 = null;
        class444.field6480 = null;
        class264.field3910 = null;
        class86.field1063 = null;
        class82.field1007 = null;
        class349.field5116 = null;
        class282.field4150 = null;
        class245.field3626 = null;
        class455.field6725 = null;
        class427.field6211 = null;
        if (arg0 == 0) {
            field26++;
            class316.field4632 = null;
            class263.field3897 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[Lkg;I)V")
    public static final void method18(int arg0, class223[] arg1, int arg2) {
        if (arg2 >= -2) {
            field27 = -90;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class223 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field3216 == 0) {
                    if (var4.field3340 != null) {
                        method18(arg0, var4.field3340, -28);
                    }
                    class182 var5 = (class182) class252.field3703.method609((long) var4.field3223, 119);
                    if (var5 != null) {
                        class433.method2657(arg0, (byte) -119, var5.field2564);
                    }
                }
                if (arg0 == 0 && var4.field3207 != null) {
                    class288 var6 = new class288();
                    var6.field4218 = var4.field3207;
                    var6.field4217 = var4;
                    class107.method762(var6);
                }
                if (arg0 == 1 && var4.field3276 != null) {
                    if (var4.field3270 >= 0) {
                        class223 var7 = class432.method2655((byte) -114, var4.field3223);
                        if (var7 == null || var7.field3340 == null || var7.field3340.length <= var4.field3270 || var7.field3340[var4.field3270] != var4) {
                            continue;
                        }
                    }
                    class288 var8 = new class288();
                    var8.field4218 = var4.field3276;
                    var8.field4217 = var4;
                    class107.method762(var8);
                }
            }
        }
        field22++;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public static final void method19(int arg0) {
        field24++;
        class456.method2828(-2145393524, 5);
        class404.method2526(5, 8);
        class260.method1787(false, 5);
        class316.method2086(4, 5);
        class175.method1206(16949, 5);
        class157.field2119.method177(5, -10920);
        class349.method2246(0, 5);
        class163.method1080((byte) 124, 5);
        class234.method1586(true, 5);
        class106.method759(-126, 5);
        class196.method1361(5, -1);
        class152.method1043((byte) 102, 5);
        class401.method2508(255, 5);
        class36.method333((byte) 118, 5);
        class336.method2176(true, 5);
        class84.method558(5, 125);
        class364.method2316(5, 10);
        class231.method1577(0, 5);
        class186.method1274(5, (byte) 17);
        class288.method1931(5, (byte) 15);
        class160.method1072(50, true);
        class265.method1829(5, 1000);
        class192.method1337((byte) -77, 5);
        class327.field4877.method2300(5, true);
        int var1 = 82 % ((-arg0 - 32) / 59);
        class286.field4195.method2300(5, true);
        class450.field6642.method2300(5, true);
        class322.field4751.method2300(5, true);
        class107.field1461.method2300(5, true);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIIILdf;ILfp;)V")
    public static final void method20(boolean arg0, int arg1, int arg2, int arg3, class85 arg4, int arg5, class9 arg6) {
        field23++;
        if (arg0) {
            class38.field533.method1915((class214.field3016 - class38.field533.method1861()) / 2, (class375.field5473 - class38.field533.method1860()) / 2);
            class149.field2023.method1915((class214.field3016 - class149.field2023.method1861()) / 2, 18);
        }
        arg4.method576(arg1, class375.field5473 / 2 - 26, (class92.field1139 == class408.field5869 ? class354.field5164 : class267.field3979).method2543(false, class153.field2073), true, -1, class214.field3016 / 2);
        int var7 = class375.field5473 / 2 - 18;
        arg6.method156(class214.field3016 / 2 - 152, var7, 304, 34, arg2, 0);
        arg6.method156(class214.field3016 / 2 - 151, var7 - -1, 302, 32, 0, 0);
        arg6.method164(class214.field3016 / 2 - 150, var7 - -2, class381.field5602 * 3, 30, arg3, 0);
        arg6.method164(class381.field5602 * 3 + class214.field3016 / 2 - 150, var7 + 2, arg5 - (class381.field5602 * 3), 30, 0, 0);
        arg4.method576(arg1, class375.field5473 / 2 + 4, class381.field5604, true, -1, class214.field3016 / 2);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method21(byte arg0) {
        field25 = null;
        if (arg0 != -1) {
            method22(92);
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public static final void method22(int arg0) {
        field28++;
        if (arg0 != 5) {
            return;
        }
        for (class138 var1 = (class138) class208.field2940.method2478(arg0 + 1598); var1 != null; var1 = (class138) class208.field2940.method2486((byte) -82)) {
            if (var1.field1889) {
                var1.method917(0);
            }
        }
        for (class138 var2 = (class138) class422.field6101.method2478(1603); var2 != null; var2 = (class138) class422.field6101.method2486((byte) -82)) {
            if (var2.field1889) {
                var2.method917(0);
            }
        }
    }
}
