import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class121 {

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "Lce;")
    public class20 field2762 = new class20();

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Lsc;")
    private static class128 field2754 = class129.method1017(false, "Choose Option");

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Lsc;")
    public static class128 field2752 = class129.method1017(false, "sl_arrows");

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "Lsc;")
    public static class128 field2756 = class129.method1017(false, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Lsc;")
    private static class128 field2759 = class129.method1017(false, "Location");

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field2744 = 0;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "[I")
    public static int[] field2760 = new int[500];

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Z")
    public static volatile boolean field2755 = true;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lsc;")
    public static class128 field2745 = field2754;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "Lsc;")
    public static class128 field2758 = field2759;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "Lsc;")
    public static class128 field2764 = class129.method1017(false, "compass");

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "J")
    public static long field2766 = 0L;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "Lce;")
    private class20 field2768;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2742;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)Lce;")
    public final class20 method920(byte arg0) {
        int var2 = -41 / ((-arg0 - 18) / 40);
        field2757++;
        class20 var3 = this.field2762.field368;
        if (this.field2762 == var3) {
            this.field2768 = null;
            return null;
        } else {
            this.field2768 = var3.field368;
            return var3;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lsc;IIBIILsc;)V")
    public static final void method921(class128 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class128 arg6) {
        field2767++;
        if (arg3 != -70 || (class135.field3180 || class7.field103 >= 500)) {
            return;
        }
        class120.field2738[class7.field103] = arg0;
        class105.field2394[class7.field103] = arg6;
        field2760[class7.field103] = arg1;
        class41.field764[class7.field103] = arg5;
        class82.field1840[class7.field103] = arg4;
        class67.field1518[class7.field103] = arg2;
        class7.field103++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)Lce;")
    public final class20 method922(int arg0) {
        field2765++;
        class20 var2 = this.field2768;
        if (this.field2762 == var2) {
            this.field2768 = null;
            return null;
        }
        if (arg0 != 0) {
            method929((byte) 45);
        }
        this.field2768 = var2.field372;
        return var2;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILsc;)V")
    public static final void method923(int arg0, class128 arg1) {
        field2743++;
        if (class41.field756 >= 2) {
            if (arg1.method1010(1, class51.field1030)) {
                System.gc();
            }
            if (arg1.method1010(arg0, class35.field669)) {
                class44.method316(4550);
            }
            if (arg1.method1010(1, class66.field1464)) {
                class151.field3488 = true;
            }
            if (arg1.method1010(arg0, class6.field98)) {
                class151.field3488 = false;
            }
            if (arg1.method1010(1, class25.field499)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class104.field2359[var2].field457[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg1.method1010(1, class112.field2508) && class151.field3484 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method996(class33.field632, false)) {
                class90.field2058 = arg1.method998((byte) 85, 12).method975(arg0 ^ 0xFFFFFFFE).method1007((byte) 126);
                class126.method958(0, arg0, null, class51.method395(new class128[] { class6.field93, class111.method857(class90.field2058, (byte) -127) }, false));
            }
            if (arg1.method1010(arg0, class142.field3322)) {
                class5.field43 = true;
            }
        }
        class65.field1445++;
        class152.field3502.method507(67, 150);
        class152.field3502.method653(arg1.method1014(arg0 ^ 0xFFFFFFF6) - 1, 0);
        class152.field3502.method644(1965040587, arg1.method998((byte) 81, 2));
        if (arg0 != 1) {
            method929((byte) -14);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B[Lsc;)[Lsc;")
    public static final class128[] method924(byte arg0, class128[] arg1) {
        class128[] var2 = new class128[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class51.method395(new class128[] { class111.method857(var3, (byte) 90), class62.field1323 }, false);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class51.method395(new class128[] { var2[var3], arg1[var3] }, false);
            }
        }
        field2770++;
        if (arg0 == -126) {
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)Lce;")
    public final class20 method925(int arg0) {
        field2749++;
        class20 var2 = this.field2762.field372;
        if (this.field2762 == var2) {
            this.field2768 = null;
            return null;
        } else if (arg0 == 6230) {
            this.field2768 = var2.field372;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILce;)V")
    public final void method926(int arg0, class20 arg1) {
        if (arg1.field372 != null) {
            arg1.method172(-2658);
        }
        arg1.field372 = this.field2762.field372;
        arg1.field368 = this.field2762;
        arg1.field372.field368 = arg1;
        if (arg0 != 5569) {
            field2760 = null;
        }
        field2751++;
        arg1.field368.field372 = arg1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lce;Z)V")
    public final void method927(class20 arg0, boolean arg1) {
        if (arg0.field372 != null) {
            arg0.method172(-2658);
        }
        if (!arg1) {
            method929((byte) -73);
        }
        arg0.field368 = this.field2762.field368;
        arg0.field372 = this.field2762;
        arg0.field372.field368 = arg0;
        field2750++;
        arg0.field368.field372 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)Lce;")
    public final class20 method928(byte arg0) {
        field2761++;
        class20 var2 = this.field2762.field368;
        int var3 = -114 / ((arg0 + 12) / 46);
        if (this.field2762 == var2) {
            return null;
        } else {
            var2.method172(-2658);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
    public static void method929(byte arg0) {
        field2760 = null;
        field2742 = null;
        if (arg0 != 63) {
            return;
        }
        field2756 = null;
        field2754 = null;
        field2745 = null;
        field2752 = null;
        field2758 = null;
        field2764 = null;
        field2759 = null;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)Lce;")
    public final class20 method930(byte arg0) {
        if (arg0 > -52) {
            method923(4, null);
        }
        class20 var2 = this.field2762.field372;
        field2769++;
        if (this.field2762 == var2) {
            return null;
        } else {
            var2.method172(-2658);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lce;ILce;)V")
    public final void method931(class20 arg0, int arg1, class20 arg2) {
        if (arg1 < 95) {
            return;
        }
        if (arg2.field372 != null) {
            arg2.method172(-2658);
        }
        arg2.field368 = arg0;
        field2753++;
        arg2.field372 = arg0.field372;
        arg2.field372.field368 = arg2;
        arg2.field368.field372 = arg2;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)Lce;")
    public final class20 method932(int arg0) {
        if (arg0 != -6) {
            method924((byte) -74, null);
        }
        field2763++;
        class20 var2 = this.field2768;
        if (this.field2762 == var2) {
            this.field2768 = null;
            return null;
        } else {
            this.field2768 = var2.field368;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
    public final void method933(int arg0) {
        field2746++;
        if (arg0 != -12359) {
            this.method933(-21);
        }
        while (true) {
            class20 var2 = this.field2762.field368;
            if (this.field2762 == var2) {
                return;
            }
            var2.method172(-2658);
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class121() {
        this.field2762.field372 = this.field2762;
        this.field2762.field368 = this.field2762;
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)Lb;")
    public static final class8 method934(byte arg0) {
        field2748++;
        class8 var1 = new class8();
        var1.field123 = class122.field2777[0];
        var1.field125 = class36.field698[0];
        byte[] var2 = class37.field721[0];
        var1.field122 = field2747;
        var1.field121 = class150.field3443[0];
        int var3 = -67 % ((-arg0 - 85) / 37);
        var1.field126 = class62.field1336;
        var1.field124 = class19.field361[0];
        int var4 = var1.field124 * var1.field121;
        var1.field127 = new int[var4];
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field127[var5] = class21.field412[class25.method224(var2[var5], 255)];
        }
        class29.method239(111);
        return var1;
    }
}
