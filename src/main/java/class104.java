import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 {

    @OriginalMember(owner = "client!p", name = "p", descriptor = "[I")
    private int[] field2559;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Lid;")
    public static class60 field2548 = class11.method72("mapfunction", (byte) -77);

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lid;")
    public static class60 field2546 = class11.method72("<br>", (byte) -39);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lid;")
    public static class60 field2544 = class11.method72("leuchten2:", (byte) 109);

    @OriginalMember(owner = "client!p", name = "g", descriptor = "Lid;")
    private static class60 field2550 = class11.method72("Click to switch", (byte) -17);

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lid;")
    public static class60 field2549 = class11.method72("null", (byte) -28);

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lid;")
    private static class60 field2558 = class11.method72("Username: ", (byte) -52);

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Lid;")
    public static class60 field2554 = field2558;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Lid;")
    public static class60 field2553 = field2550;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Lve;")
    public static class151 field2547 = new class151();

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "[I")
    public static int[] field2551;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "[Le;")
    public static class29[] field2561;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method852(byte arg0) {
        field2561 = null;
        field2551 = null;
        field2546 = null;
        field2554 = null;
        if (arg0 > -113) {
            return;
        }
        field2547 = null;
        field2553 = null;
        field2550 = null;
        field2548 = null;
        field2558 = null;
        field2549 = null;
        field2544 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[Lid;)Lid;")
    public static final class60 method853(int arg0, class60[] arg1) {
        field2556++;
        if (arg0 > -76) {
            field2553 = null;
        }
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class152.method1158(arg1.length, arg1, 0, 25692);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lie;ILie;)I")
    public static final int method854(class61 arg0, int arg1, class61 arg2) {
        field2545++;
        int var3 = arg1;
        if (arg0.method466(class75.field1815, class141.field3219, 2)) {
            var3 = arg1 + 1;
        }
        if (arg2.method466(class74.field1793, class141.field3219, 2)) {
            var3++;
        }
        if (arg2.method466(class45.field1176, class141.field3219, arg1 + 2)) {
            var3++;
        }
        if (arg2.method466(class157.field3607, class141.field3219, 2)) {
            var3++;
        }
        if (arg2.method466(class109.field2649, class141.field3219, 2)) {
            var3++;
        }
        if (arg2.method466(class158.field3620, class141.field3219, 2)) {
            var3++;
        }
        arg2.method466(class116.field2737, class141.field3219, 2);
        arg2.method466(class139.field3168, class141.field3219, arg1 ^ 0x2);
        arg2.method466(class16.field406, class141.field3219, 2);
        arg2.method466(class47.field1244, class141.field3219, arg1 ^ 0x2);
        arg2.method466(class97.field2381, class141.field3219, arg1 + 2);
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I")
    public final int method855(int arg0, int arg1) {
        if (arg1 != 28654) {
            field2553 = null;
        }
        int var3 = this.field2559.length - 2;
        field2560++;
        int var4 = arg0 << 1 & var3;
        while (true) {
            int var5 = this.field2559[var4];
            if (arg0 == var5) {
                return this.field2559[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)Z")
    public static final boolean method856(byte arg0, int arg1) {
        field2557++;
        if (arg0 <= 86) {
            return false;
        } else {
            return (arg1 >> 31 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IBIIBZLpa;)V")
    public static final void method857(int arg0, byte arg1, int arg2, int arg3, byte arg4, boolean arg5, class105 arg6) {
        field2555++;
        long var7 = (long) ((arg3 << 16) + arg0);
        class93 var9 = (class93) class41.field1080.method716((byte) 14, var7);
        if (var9 != null) {
            return;
        }
        class93 var10 = (class93) class38.field921.method716((byte) 13, var7);
        if (var10 != null) {
            return;
        }
        int var11 = 35 / ((arg4 + 82) / 38);
        class93 var12 = (class93) class32.field741.method716((byte) 126, var7);
        if (var12 == null) {
            if (!arg5) {
                class93 var13 = (class93) class111.field2675.method716((byte) 46, var7);
                if (var13 != null) {
                    return;
                }
            }
            class93 var14 = new class93();
            var14.field2306 = arg6;
            var14.field2295 = arg1;
            var14.field2300 = arg2;
            if (arg5) {
                class41.field1080.method712(var7, var14, (byte) 99);
                class13.field232++;
            } else {
                field2547.method1147(-26819, var14);
                class32.field741.method712(var7, var14, (byte) 86);
                class157.field3588++;
            }
        } else if (arg5) {
            var12.method234(66);
            class41.field1080.method712(var7, var12, (byte) 70);
            class13.field232++;
            class157.field3588--;
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "([I)V")
    public class104(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2559 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2559[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2559[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field2559[var5 + var5] = arg0[var4];
            this.field2559[var5 + var5 + 1] = var4++;
        }
    }
}
