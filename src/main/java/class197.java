import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class197 {

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "J")
    public long field3523 = 0L;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field3518 = 0;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Lha;")
    private static class46 field3526 = class271.method1828("Loading)3)3)3", -46);

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Lha;")
    public static class46 field3529 = class271.method1828("rot:", -46);

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Lha;")
    public static class46 field3514 = field3526;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "Lha;")
    public static class46 field3534 = class271.method1828("Bitte warten Sie)3)3)3", -46);

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "[[[I")
    public static int[][][] field3536 = new int[2][][];

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "Lha;")
    public static class46 field3538 = class271.method1828("Suche nach Updates )2 ", -46);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public int field3515;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public int field3516;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public int field3519;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public int field3527;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public int field3530;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public int field3531;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public int field3533;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public int field3537;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
    public int field3539;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public int field3540;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public int field3541;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "Lj;")
    public class139 field3532;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Lpi;")
    public static class181 field3520;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "[Lhh;")
    public static class263[] field3521;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)I")
    public static final int method1404(int arg0, int arg1) {
        if (arg0 != 0) {
            method1407(41, false, 118);
        }
        field3535++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)I")
    public static final int method1405(int arg0, int arg1) {
        field3513++;
        int var2 = arg0 & 0x3F;
        if (arg1 != 0) {
            field3529 = null;
        }
        int var3 = (arg0 & 0xC8) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lpi;I)V")
    public static final void method1406(class181 arg0, int arg1) {
        field3525++;
        class273.field4766 = class181.method1315(arg1 ^ 0xFFFFFC18, 0, class128.field2347, arg0);
        class37.field657 = new class179[class273.field4766.length];
        class257.field4484 = new class179[class273.field4766.length];
        class24.field497 = new class179[class273.field4766.length];
        for (int var2 = 0; var2 < class273.field4766.length; var2++) {
            class273.field4766[var2].method1280();
            class37.field657[var2] = class273.field4766[var2].method1281();
            class273.field4766[var2].method1280();
            class257.field4484[var2] = class273.field4766[var2].method1281();
            class273.field4766[var2].method1280();
            class24.field497[var2] = class273.field4766[var2].method1281();
            class273.field4766[var2].method1280();
        }
        class8.field127 = class144.method1078(12, 0, class260.field4535, arg0);
        class212.field3786 = class103.method780(class92.field1716, true, arg0, 0);
        class152.field2700 = class103.method780(class201.field3582, true, arg0, 0);
        class6.field91 = class103.method780(class190.field3392, true, arg0, 0);
        if (arg1 != -900) {
            field3536 = null;
        }
        class218.field3848 = class103.method780(class269.field4650, true, arg0, 0);
        class168.field2956 = class6.method28(arg0, 0, class33.field610, (byte) -42);
        class271.field4732 = class6.method28(arg0, 0, class234.field4073, (byte) -61);
        class82.field1586 = class214.method1507(arg0, class90.field1698, 0, 28974);
        field3521 = class6.method28(arg0, 0, class218.field3853, (byte) -115);
        class108.field2011 = class6.method28(arg0, 0, class188.field3365, (byte) -119);
        class86.field1639 = class50.method374(arg0, 0, arg1 + 856302950, class268.field4640);
        class74.field1313 = class50.method374(arg0, 0, 856302050, class209.field3739);
        class37.field663.method131(class74.field1313, (int[]) null);
        class261.field4547.method131(class74.field1313, (int[]) null);
        class190.field3384.method131(class74.field1313, (int[]) null);
        class21 var3 = class89.method691(arg0, class176.field3165, 39, 0);
        var3.method128();
        class51.field891 = var3;
        class21[] var4 = class144.method1078(12, 0, client.field4697, arg0);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method128();
        }
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class46.field754 = var4;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 41.0D) - 20;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        for (int var10 = 0; var10 < class8.field127.length; var10++) {
            class8.field127[var10].method116(var8 + var9, var6 + var8, var7 + var8);
        }
        class273.field4766[0].method1283(var9 + var8, var6 - -var8, var7 + var8);
        class270.field4719 = class8.field127;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZI)V")
    public static final void method1407(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field3536 = null;
        }
        class146 var3 = class6.method22((byte) 16, 1, arg0);
        field3528++;
        var3.method1088(11102);
        var3.field2640 = arg2;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static void method1408(byte arg0) {
        field3526 = null;
        field3514 = null;
        field3538 = null;
        int var1 = 19 / ((arg0 - 60) / 54);
        field3529 = null;
        field3536 = null;
        field3520 = null;
        field3521 = null;
        field3534 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V")
    public static final void method1409(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3522++;
        for (class269 var5 = (class269) class154.field2719.method264(-120); var5 != null; var5 = (class269) class154.field2719.method269((byte) 7)) {
            class83.method659(arg0, arg3, arg4, arg2, true, var5);
        }
        if (arg1 != 3) {
            return;
        }
        for (class269 var6 = (class269) class6.field101.method264(-99); var6 != null; var6 = (class269) class6.field101.method269((byte) 7)) {
            byte var10 = 1;
            if (var6.field4660.field2553 == var6.field4660.field2537) {
                var10 = 0;
            } else if (var6.field4660.field2540 == var6.field4660.field2537) {
                var10 = 2;
            }
            if (var6.field4673 != var10) {
                int var11 = class48.method357(var6.field4660, (byte) 42);
                if (var6.field4643 != var11) {
                    if (var6.field4671 != null) {
                        class236.field4116.method1711(var6.field4671);
                        var6.field4671 = null;
                    }
                    var6.field4643 = var11;
                }
                var6.field4673 = var10;
            }
            var6.field4670 = var6.field4660.field2585;
            var6.field4645 = var6.field4660.field2585 + var6.field4660.method642(89) * 64;
            var6.field4675 = var6.field4660.field2546;
            var6.field4648 = var6.field4660.field2546 + var6.field4660.method642(45) * 64;
            class83.method659(arg0, arg3, arg4, arg2, true, var6);
        }
        for (class269 var7 = (class269) class47.field820.method1592(false); var7 != null; var7 = (class269) class47.field820.method1591(102)) {
            byte var8 = 1;
            if (var7.field4663.field2553 == var7.field4663.field2537) {
                var8 = 0;
            } else if (var7.field4663.field2540 == var7.field4663.field2537) {
                var8 = 2;
            }
            if (var7.field4673 != var8) {
                int var9 = class155.method1146(1, var7.field4663);
                if (var7.field4643 != var9) {
                    if (var7.field4671 != null) {
                        class236.field4116.method1711(var7.field4671);
                        var7.field4671 = null;
                    }
                    var7.field4643 = var9;
                }
                var7.field4673 = var8;
            }
            var7.field4670 = var7.field4663.field2585;
            var7.field4645 = var7.field4663.field2585 + (var7.field4663.method642(94) * 64);
            var7.field4675 = var7.field4663.field2546;
            var7.field4648 = var7.field4663.field2546 + var7.field4663.method642(35) * 64;
            class83.method659(arg0, arg3, arg4, arg2, true, var7);
        }
    }
}
