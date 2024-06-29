import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class195 extends class236 {

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "[I")
    public int[] field3529 = new int[5];

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public int field3528 = 0;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "[Lqd;")
    public class35[] field3540 = new class35[5];

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public int field3525;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public int field3530;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    public int field3539;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public int field3527;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "[I")
    public static int[] field3509 = new int[4096];

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field3515 = 0;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Lsg;")
    public static class30 field3507 = class167.method1221((byte) 33, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field3517 = 0;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "[Z")
    public static boolean[] field3508 = new boolean[100];

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "J")
    public static long field3543 = 0L;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public int field3523;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public int field3533;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public int field3536;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lsk;")
    public class104 field3541;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "Lse;")
    public class10 field3521;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "Lrk;")
    public class146 field3537;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "Lfg;")
    public class177 field3520;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "Lne;")
    public class195 field3524;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "Lw;")
    public class225 field3532;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "Lre;")
    public class231 field3535;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "Z")
    public boolean field3526;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "Z")
    public boolean field3538;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "Z")
    public boolean field3542;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lwe;Lrc;IIIBILva;)V")
    public static final void method1410(class40 arg0, class275 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, class120 arg7) {
        field3519++;
        class91 var8 = new class91();
        var8.field1828 = arg3 * 128;
        if (arg5 != -97) {
            return;
        }
        var8.field1834 = arg6 * 128;
        var8.field1844 = arg4;
        if (arg0 != null) {
            var8.field1853 = arg0;
            var8.field1836 = arg0.field950;
            var8.field1840 = arg0.field993;
            var8.field1852 = arg0.field940;
            int var10 = arg0.field937;
            var8.field1845 = arg0.field946 * 128;
            var8.field1854 = arg0.field942;
            int var11 = arg0.field955;
            if (arg2 == 1 || arg2 == 3) {
                var11 = arg0.field937;
                var10 = arg0.field955;
            }
            var8.field1850 = (arg3 + var11) * 128;
            var8.field1846 = (arg6 + var10) * 128;
            if (arg0.field997 != null) {
                var8.field1830 = true;
                var8.method740((byte) -40);
            }
            if (var8.field1840 != null) {
                var8.field1839 = var8.field1852 + ((int) (Math.random() * (double) (var8.field1854 - var8.field1852)));
            }
            class167.field3084.method477(var8, (byte) 6);
        } else if (arg1 != null) {
            var8.field1838 = arg1;
            class241 var9 = arg1.field4805;
            if (var9.field4295 != null) {
                var8.field1830 = true;
                var9 = var9.method1700((byte) 59);
            }
            if (var9 != null) {
                var8.field1846 = (var9.field4307 + arg6) * 128;
                var8.field1850 = (var9.field4307 + arg3) * 128;
                var8.field1836 = class31.method316(arg1, -1);
                var8.field1845 = var9.field4273 * 128;
            }
            class239.field4254.method477(var8, (byte) 6);
        } else if (arg7 != null) {
            var8.field1843 = arg7;
            var8.field1846 = (arg7.method574(true) + arg6) * 128;
            var8.field1850 = (arg7.method574(true) + arg3) * 128;
            var8.field1836 = class201.method1426(31, arg7);
            var8.field1845 = arg7.field2358 * 128;
            class68.field1482.method1164((byte) 110, arg7.field2349.method297((byte) -113), var8);
            return;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)I")
    public static final int method1411(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3531++;
        if (arg0 >= -80) {
            return -53;
        } else {
            int var5 = 65536 - class213.field3846[arg4 * 1024 / arg1] >> 1;
            return ((65536 - var5) * arg3 >> 16) + (arg2 * var5 >> 16);
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
    public static final void method1412(int arg0) {
        class124.field2432++;
        field3512++;
        if (arg0 != 5) {
            method1415(-100, 81);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIB)I")
    public static final int method1413(int arg0, int arg1, int arg2, byte arg3) {
        if (arg1 > 243) {
            arg2 >>= 0x4;
        } else if (arg1 > 217) {
            arg2 >>= 0x3;
        } else if (arg1 > 192) {
            arg2 >>= 0x2;
        } else if (arg1 > 179) {
            arg2 >>= 0x1;
        }
        if (arg3 > -84) {
            field3517 = 100;
        }
        field3511++;
        return (arg1 >> 1) + (arg0 >> 2 << 10) + (arg2 >> 5 << 7);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)Lce;")
    public static final class205 method1414(byte arg0) {
        class69.field1545 = 0;
        field3518++;
        if (arg0 != -77) {
            field3509 = null;
        }
        return class204.method1442(false);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)Lwe;")
    public static final class40 method1415(int arg0, int arg1) {
        field3510++;
        class40 var2 = (class40) class277.field4830.method1644((byte) -111, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class273.field4794.method1115(class190.method1379(arg1, -6488), (byte) -99, class9.method102(arg1, 1645251272));
        class40 var4 = new class40();
        var4.field989 = arg1;
        if (var3 != null) {
            var4.method415(-11548, new class8(var3));
        }
        var4.method410(119);
        int var5 = 127 % ((-arg0 - 48) / 55);
        if (!class76.field1676 && var4.field939) {
            var4.field932 = null;
        }
        if (var4.field975) {
            var4.field944 = 0;
            var4.field981 = false;
        }
        class277.field4830.method1646((long) arg1, var4, -126);
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)I")
    public static final int method1416(int arg0, int arg1) {
        field3516++;
        return arg0 == 11475 ? arg1 >> 18 & 0x7 : 10;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(III)V")
    public class195(int arg0, int arg1, int arg2) {
        this.field3525 = arg2;
        this.field3530 = arg1;
        this.field3527 = this.field3539 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public static void method1417(byte arg0) {
        int var1 = 39 / ((-arg0 - 71) / 54);
        field3509 = null;
        field3507 = null;
        field3508 = null;
    }
}
