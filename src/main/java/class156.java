import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class156 {

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "Lfr;")
    private class231 field2526 = new class231(64);

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "Lfr;")
    public class231 field2535 = new class231(50);

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "Lfr;")
    public class231 field2538 = new class231(5);

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "Lqs;")
    public class496 field2519;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "Lwv;")
    public class535 field2530;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "Z")
    public boolean field2528;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "Lqs;")
    private class496 field2527;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field2525 = 0;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public static int field2529 = 0;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "Lvv;")
    public static class313 field2534 = new class313(100, 4);

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "Ldw;")
    public static class403 field2536 = new class403("", 11);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public int field2539;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBIII)V")
    public static final void method1084(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2523++;
        class266 var5 = class308.method1961(true, arg0, 10);
        var5.method1781((byte) 95);
        var5.field4454 = arg4;
        if (arg1 != -53) {
            field2537 = -114;
        }
        var5.field4453 = arg3;
        var5.field4457 = arg2;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)Lak;")
    public final class510 method1085(int arg0, int arg1) {
        field2532++;
        class231 var3 = this.field2526;
        class510 var4;
        synchronized (this.field2526) {
            var4 = (class510) this.field2526.method1593((byte) -85, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field2527;
        byte[] var6;
        synchronized (this.field2527) {
            var6 = this.field2527.method2926(class146.method1061(-20355, arg0), arg1 - 537461764, class26.method189(arg0, -118));
        }
        class510 var7 = new class510();
        var7.field7461 = this;
        var7.field7465 = arg0;
        if (var6 != null) {
            var7.method3008(new class23(var6), true);
        }
        if (arg1 != 537461692) {
            this.field2538 = null;
        }
        var7.method3003(56);
        class231 var8 = this.field2526;
        synchronized (this.field2526) {
            this.field2526.method1595(var7, (long) arg0, (byte) 57);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIII)V")
    public static final void method1086(int arg0, int arg1, int arg2, int arg3) {
        field2522++;
        if (arg0 > -99) {
            method1095(14, 84, false, -44);
        }
        int var4 = class16.field181 + arg1;
        int var5 = arg2 + class455.field6794;
        if (class66.field977 == null || arg1 < 0 || arg2 < 0 || arg1 >= class217.field3775 || class277.field4548 <= arg2) {
            return;
        }
        long var6 = (long) (var4 | var5 << 14 | arg3 << 28);
        class279 var8 = (class279) class244.field4176.method2516(var6, -1);
        if (var8 == null) {
            class69.method487(arg3, arg1, arg2);
            return;
        }
        class292 var9 = (class292) var8.field4577.method2538(-3);
        if (var9 == null) {
            class69.method487(arg3, arg1, arg2);
            return;
        }
        class118 var10 = (class118) class69.method487(arg3, arg1, arg2);
        if (var10 == null) {
            var10 = new class118();
        } else {
            var10.field2096 = var10.field2100 = -1;
        }
        var10.field2093 = var9.field4738;
        var10.field2091 = var9.field4737;
        label50: while (true) {
            class292 var11 = (class292) var8.field4577.method2535((byte) -79);
            if (var11 == null) {
                break;
            }
            if (var10.field2091 != var11.field4737) {
                var10.field2102 = var11.field4738;
                var10.field2096 = var11.field4737;
                while (true) {
                    class292 var12 = (class292) var8.field4577.method2535((byte) -108);
                    if (var12 == null) {
                        break label50;
                    }
                    if (var10.field2091 != var12.field4737 && var10.field2096 != var12.field4737) {
                        var10.field2100 = var12.field4737;
                        var10.field2098 = var12.field4738;
                    }
                }
            }
        }
        int var13 = class81.method592((arg1 << 7) + 64, (arg2 << 7) + 64, 9251, arg3);
        class317.method2012(arg3, arg1, arg2, var13, var10);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZZ)V")
    public final void method1087(boolean arg0, boolean arg1) {
        field2531++;
        if (this.field2528 != arg0) {
            this.field2528 = arg0;
            if (!arg1) {
                this.method1093((byte) 22);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public final void method1088(byte arg0) {
        class231 var2 = this.field2535;
        synchronized (this.field2535) {
            this.field2535.method1604(4);
            int var3 = 22 / ((-arg0 - 30) / 42);
        }
        field2516++;
        class231 var4 = this.field2538;
        synchronized (this.field2538) {
            this.field2538.method1604(4);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BZ)V")
    public static final void method1089(byte arg0, boolean arg1) {
        field2517++;
        class451 var2 = (class451) class305.field4874.method2538(-3);
        int var3 = -96 / ((25 - arg0) / 45);
        while (var2 != null) {
            if (var2.field6723 != null) {
                class510.field7455.method1734(var2.field6723);
                var2.field6723 = null;
            }
            if (var2.field6734 != null) {
                class510.field7455.method1734(var2.field6734);
                var2.field6734 = null;
            }
            var2.method1821((byte) 50);
            var2 = (class451) class305.field4874.method2535((byte) -70);
        }
        if (!arg1) {
            return;
        }
        for (class451 var4 = (class451) class511.field7481.method2538(-3); var4 != null; var4 = (class451) class511.field7481.method2535((byte) -112)) {
            if (var4.field6723 != null) {
                class510.field7455.method1734(var4.field6723);
                var4.field6723 = null;
            }
            var4.method1821((byte) -113);
        }
        for (class451 var5 = (class451) class101.field1683.method2518(-118); var5 != null; var5 = (class451) class101.field1683.method2524(0)) {
            if (var5.field6723 != null) {
                class510.field7455.method1734(var5.field6723);
                var5.field6723 = null;
            }
            var5.method1821((byte) -96);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)V")
    public final void method1090(byte arg0, int arg1) {
        field2521++;
        if (arg0 > -28) {
            field2536 = null;
        }
        class231 var3 = this.field2526;
        synchronized (this.field2526) {
            this.field2526.method1603((byte) -127, arg1);
        }
        class231 var4 = this.field2535;
        synchronized (this.field2535) {
            this.field2535.method1603((byte) -101, arg1);
        }
        class231 var5 = this.field2538;
        synchronized (this.field2538) {
            this.field2538.method1603((byte) -102, arg1);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public static final void method1091(int arg0) {
        field2520++;
        class508.field7389 = new class68[class162.field2580.method2919((byte) 62)][];
        class251.field4291 = new class68[class162.field2580.method2919((byte) -57)][];
        class406.field6157 = new boolean[class162.field2580.method2919((byte) 121)];
        int var1 = 125 % ((40 - arg0) / 50);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
    public static void method1092(int arg0) {
        field2534 = null;
        if (arg0 != 100) {
            field2525 = 54;
        }
        field2536 = null;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V")
    public final void method1093(byte arg0) {
        field2514++;
        class231 var2 = this.field2526;
        synchronized (this.field2526) {
            this.field2526.method1604(4);
        }
        class231 var3 = this.field2535;
        synchronized (this.field2535) {
            this.field2535.method1604(4);
        }
        class231 var4 = this.field2538;
        synchronized (this.field2538) {
            this.field2538.method1604(4);
            if (arg0 != 22) {
                method1089((byte) 65, false);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([Lec;ZIIII)V")
    public static final void method1094(class68[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2524++;
        if (arg3 != -20837) {
            method1094(null, false, 15, 28, -19, -104);
        }
        for (int var6 = 0; var6 < arg0.length; var6++) {
            class68 var7 = arg0[var6];
            if (var7 != null && var7.field1047 == arg4) {
                class509.method2994(var7, true, arg1, arg2, arg5);
                class117.method939(var7, false, arg2, arg5);
                if ((var7.field1048 - var7.field1009) < var7.field1041) {
                    var7.field1041 = var7.field1048 - var7.field1009;
                }
                if (var7.field1037 - var7.field1081 < var7.field1042) {
                    var7.field1042 = var7.field1037 - var7.field1081;
                }
                if (var7.field1041 < 0) {
                    var7.field1041 = 0;
                }
                if (var7.field1042 < 0) {
                    var7.field1042 = 0;
                }
                if (var7.field1086 == 0) {
                    class226.method1554(var7, -12295, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIZI)V")
    public static final void method1095(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            class192.field2982 = new byte[arg3][arg1][arg0];
            field2518++;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)V")
    public final void method1096(int arg0, int arg1) {
        field2515++;
        this.field2539 = arg0;
        class231 var3 = this.field2535;
        synchronized (this.field2535) {
            if (arg1 != 64) {
                this.field2527 = null;
            }
            this.field2535.method1604(4);
        }
        class231 var4 = this.field2538;
        synchronized (this.field2538) {
            this.field2538.method1604(4);
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
    public final void method1097(int arg0) {
        field2533++;
        class231 var2 = this.field2526;
        synchronized (this.field2526) {
            this.field2526.method1598(106);
        }
        class231 var3 = this.field2535;
        synchronized (this.field2535) {
            this.field2535.method1598(94);
        }
        if (arg0 >= -59) {
            this.field2530 = null;
        }
        class231 var4 = this.field2538;
        synchronized (this.field2538) {
            this.field2538.method1598(-58);
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lwv;IZLqs;Lqs;)V")
    public class156(class535 arg0, int arg1, boolean arg2, class496 arg3, class496 arg4) {
        this.field2519 = arg4;
        this.field2530 = arg0;
        this.field2528 = arg2;
        this.field2527 = arg3;
        if (this.field2527 != null) {
            int var6 = this.field2527.method2919((byte) 112) - 1;
            this.field2527.method2940(var6, -10511);
        }
    }
}
