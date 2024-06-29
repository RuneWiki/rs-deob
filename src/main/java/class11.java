import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class11 {

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Ltd;")
    private static class136 field186 = class145.method1172("Loaded wordpack", 45);

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Z")
    public static boolean field188 = false;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "[I")
    public static int[] field191 = new int[50];

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "Ltd;")
    public static class136 field195 = class145.method1172("Ladevorgang )2 bitte warten Sie)3", 45);

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field179 = 0;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "[J")
    public static long[] field196 = new long[200];

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Ltd;")
    public static class136 field187 = field186;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lue;")
    public static class143 field178 = new class143(64);

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "Ltd;")
    private static class136 field202 = class145.method1172("To play on this world move to a free area first", 45);

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "Ltd;")
    public static class136 field201 = field202;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "Ltd;")
    public static class136 field200 = class145.method1172(": ", 45);

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public int field197;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Ltd;")
    public class136 field176;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Z")
    public boolean field181;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "[Lbc;")
    public static class11[] field189;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)Z")
    public static final boolean method72(int arg0) {
        field192++;
        return class155.field3604 == arg0 ? class18.field367.method594(false) : true;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILke;I)Ltd;")
    public static final class136 method73(int arg0, class74 arg1, int arg2) {
        field194++;
        if (!class93.method694(arg0, class56.method444(arg1, 0), 20625) && arg1.field1559 == null) {
            return null;
        }
        if (arg2 <= 81) {
            field202 = null;
        }
        if (arg1.field1599 == null || arg0 >= arg1.field1599.length || arg1.field1599[arg0] == null || arg1.field1599[arg0].method1129(false).method1119(-10511) == 0) {
            return class86.field2010 ? class79.method570(0, new class136[] { class152.field3485, class19.method140(arg0, -113) }) : null;
        } else {
            return arg1.field1599[arg0];
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IJ)Ltd;")
    public static final class136 method74(int arg0, long arg1) {
        field190++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class21.field427[(int) (var8 - arg1 * 37L)];
            }
            if (arg0 != -8261) {
                method75((byte) -50);
            }
            class136 var7 = new class136();
            var7.field3182 = var6;
            var7.field3183 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static final void method75(byte arg0) {
        field183++;
        for (int var1 = 0; var1 < class26.field591; var1++) {
            int var2 = class108.field2532[var1];
            class67 var3 = class122.field2846[var2];
            int var4 = class4.field70.method1011(75);
            if ((var4 & 0x8) != 0) {
                int var5 = class4.field70.method1011(95);
                int var6 = class4.field70.method1034(-43);
                var3.method1211(class44.field1013, var5, (byte) -117, var6);
                var3.field3596 = class44.field1013 + 300;
                var3.field3600 = class4.field70.method1011(30);
                var3.field3549 = class4.field70.method1034(-29);
            }
            if ((var4 & 0x20) != 0) {
                int var7 = class4.field70.method1020(false);
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = class4.field70.method1034(-103);
                if (var3.field3585 == var7 && var7 != -1) {
                    int var9 = class29.method252(true, var7).field2675;
                    if (var9 == 1) {
                        var3.field3546 = 0;
                        var3.field3588 = 0;
                        var3.field3591 = 0;
                        var3.field3598 = var8;
                    }
                    if (var9 == 2) {
                        var3.field3591 = 0;
                    }
                } else if (var7 == -1 || var3.field3585 == -1 || class29.method252(true, var7).field2672 >= class29.method252(true, var3.field3585).field2672) {
                    var3.field3591 = 0;
                    var3.field3588 = 0;
                    var3.field3598 = var8;
                    var3.field3536 = var3.field3564;
                    var3.field3546 = 0;
                    var3.field3585 = var7;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var10 = class4.field70.method994((byte) 120);
                int var11 = class4.field70.method994((byte) 116);
                var3.method1211(class44.field1013, var10, (byte) -117, var11);
                var3.field3596 = class44.field1013 + 300;
                var3.field3600 = class4.field70.method1011(63);
                var3.field3549 = class4.field70.method994((byte) 122);
            }
            if ((var4 & 0x1) != 0) {
                var3.field3566 = class4.field70.method1019((byte) -90);
                var3.field3597 = class4.field70.method1020(false);
            }
            if ((var4 & 0x40) != 0) {
                var3.field1428 = class139.method1136(class4.field70.method1019((byte) -7), 9);
                var3.field3595 = var3.field1428.field2284;
                var3.field3556 = var3.field1428.field2304;
                var3.field3608 = var3.field1428.field2277;
                var3.field3599 = var3.field1428.field2253;
                var3.field3541 = var3.field1428.field2263;
                var3.field3565 = var3.field1428.field2307;
                var3.field3575 = var3.field1428.field2262;
                var3.field3592 = var3.field1428.field2297;
                var3.field3573 = var3.field1428.field2269;
            }
            if ((var4 & 0x2) != 0) {
                var3.field3587 = class4.field70.method1019((byte) -92);
                if (var3.field3587 == 65535) {
                    var3.field3587 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field3579 = class4.field70.method1004((byte) -74);
                int var12 = class4.field70.method1018(4);
                var3.field3567 = var12 >> 16;
                var3.field3551 = 0;
                var3.field3590 = 0;
                if (var3.field3579 == 65535) {
                    var3.field3579 = -1;
                }
                var3.field3607 = (var12 & 0xFFFF) + class44.field1013;
                if (class44.field1013 < var3.field3607) {
                    var3.field3551 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field3548 = class4.field70.method1010(-14330);
                var3.field3609 = 100;
            }
        }
        if (arg0 >= -30) {
            field187 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static void method76(int arg0) {
        field191 = null;
        if (arg0 != -17905) {
            return;
        }
        field178 = null;
        field202 = null;
        field200 = null;
        field186 = null;
        field201 = null;
        field196 = null;
        field187 = null;
        field189 = null;
        field195 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ltd;B)Z")
    public static final boolean method77(class136 arg0, byte arg1) {
        int var2 = -123 % ((-arg1 - 53) / 55);
        field184++;
        if (arg0 == null) {
            return false;
        }
        for (int var3 = 0; var3 < class1.field14; var3++) {
            if (arg0.method1092(1853, class89.field2103[var3])) {
                return true;
            }
        }
        return arg0.method1092(1853, class24.field555.field249);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ltd;Ltd;ILtd;)V")
    public static final void method78(class136 arg0, class136 arg1, int arg2, class136 arg3) {
        class81.field1931 = arg1;
        class81.field1942 = arg0;
        class81.field1925 = arg3;
        if (arg2 > -118) {
            field202 = null;
        }
        field177++;
    }
}
