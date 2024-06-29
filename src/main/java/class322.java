import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class322 {

    @OriginalMember(owner = "client!um", name = "f", descriptor = "Luc;")
    public static class51 field4795 = new class51(5);

    @OriginalMember(owner = "client!um", name = "g", descriptor = "Z")
    public static boolean field4796 = false;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "Z")
    public static boolean field4797 = false;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "Z")
    public static boolean field4803 = false;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public int field4791;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "Lme;")
    public static class277 field4798;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "Ll;")
    public static class315 field4804;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "Lmk;")
    public static class325 field4801;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "Ljava/lang/String;")
    public String field4792;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4800;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "()V")
    public static final void method2118() {
        if (class189.field2597 != null) {
            for (int var0 = 0; var0 < class189.field2597.length; var0++) {
                for (int var1 = 0; var1 < class108.field1421; var1++) {
                    for (int var2 = 0; var2 < class186.field2554; var2++) {
                        if (class189.field2597[var0][var1][var2] != null) {
                            class189.field2597[var0][var1][var2].method615((byte) 0);
                        }
                        class189.field2597[var0][var1][var2] = null;
                    }
                }
            }
        }
        class189.field2597 = null;
        class142.field1804 = null;
        if (class197.field2727 != null) {
            for (int var3 = 0; var3 < class197.field2727.length; var3++) {
                for (int var4 = 0; var4 < class108.field1421; var4++) {
                    for (int var5 = 0; var5 < class186.field2554; var5++) {
                        if (class197.field2727[var3][var4][var5] != null) {
                            class197.field2727[var3][var4][var5].method615((byte) 0);
                        }
                        class197.field2727[var3][var4][var5] = null;
                    }
                }
            }
        }
        class197.field2727 = null;
        class370.field5469 = null;
        class106.field1405 = null;
        class266.field3950 = null;
        class199.field2754 = 0;
        if (class114.field1489 != null) {
            for (int var6 = 0; var6 < class199.field2754; var6++) {
                class114.field1489[var6] = null;
            }
        }
        if (class13.field211 != null) {
            for (int var7 = 0; var7 < class355.field5261; var7++) {
                class13.field211[var7] = null;
            }
            class355.field5261 = 0;
        }
        if (class280.field4131 != null) {
            for (int var8 = 0; var8 < class197.field2720; var8++) {
                class280.field4131[var8] = null;
            }
            for (int var9 = 0; var9 < class134.field1752; var9++) {
                for (int var10 = 0; var10 < class108.field1421; var10++) {
                    for (int var11 = 0; var11 < class186.field2554; var11++) {
                        class131.field1714[var9][var10][var11] = 0;
                    }
                }
            }
            class197.field2720 = 0;
        }
        class301.field4539 = null;
        class365.method2412(0);
        class308.field4573.method48(22754);
        class395.field5742 = null;
        class50.field777 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
    public static final void method2119(byte arg0) {
        if (arg0 > -1) {
            field4795 = null;
        }
        field4793++;
        class408 var1 = null;
        try {
            class225 var2 = class63.field948.method2396(true);
            while (var2.field3104 == 0) {
                class31.method245(1L, -88);
            }
            if (var2.field3104 == 1) {
                var1 = (class408) var2.field3105;
                class341 var3 = new class341(class329.field4855 * 6 + 3);
                var3.method2204(1, 8);
                var3.method2250(false, class329.field4855);
                for (int var4 = 0; var4 < class216.field3014.length; var4++) {
                    if (class28.field476[var4]) {
                        var3.method2250(false, var4);
                        var3.method2240((byte) -88, class216.field3014[var4]);
                    }
                }
                var1.method2583(var3.field5049, 1, 0, var3.field5042);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method2584((byte) -125);
            }
        } catch (Exception var5) {
        }
        class171.field2341 = class98.method768((byte) -75);
        class320.field4757 = false;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lqc;B)V")
    public static final void method2120(class163 arg0, byte arg1) {
        field4794++;
        for (class144 var2 = (class144) class107.field1413.method1575(0); var2 != null; var2 = (class144) class107.field1413.method1573((byte) -128)) {
            if (var2.field1820 == arg0) {
                if (var2.field1840 != null) {
                    class40.field602.method249(var2.field1840);
                    var2.field1840 = null;
                }
                var2.method2632(true);
                return;
            }
        }
        if (arg1 > -73) {
            method2121((class340) null, -29, 71, -18);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lnb;III)V")
    public static final void method2121(class340 arg0, int arg1, int arg2, int arg3) {
        int var4 = class131.field1714[arg1][arg2][arg3];
        int var5 = 0;
        arg0.field5014 = 0;
        while (var5 <= 24) {
            int var6 = var4 >> var5 & 0xFF;
            if (var6 <= 0) {
                break;
            }
            arg0.field5015[arg0.field5014++] = class280.field4131[var6 - 1];
            var5 += 8;
        }
        for (int var7 = arg0.field5014; var7 < 4; var7++) {
            arg0.field5015[var7] = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)I")
    public static final int method2122(int arg0, int arg1) {
        field4790++;
        if (arg1 <= 38) {
            field4796 = false;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method2123(String arg0, byte arg1) {
        field4802++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class184.field2479; var2++) {
            if (arg0.equalsIgnoreCase(class7.field89[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class309.field4577[var2])) {
                return true;
            }
        }
        if (arg1 > -83) {
            method2119((byte) -30);
        }
        return false;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V")
    public static void method2124(byte arg0) {
        if (arg0 > -123) {
            method2121((class340) null, 110, 39, 14);
        }
        field4795 = null;
        field4801 = null;
        field4798 = null;
        field4804 = null;
        field4800 = null;
    }
}
