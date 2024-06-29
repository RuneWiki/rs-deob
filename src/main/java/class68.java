import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class68 extends class4 {

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    private int field1082 = -1;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Z")
    private boolean field1061 = false;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    private int field1070 = 0;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    private int field1089 = 0;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    private int field1099 = -32768;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "Z")
    private boolean field1094 = false;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    public int field1087;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    private int field1086;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    private int field1072;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    private int field1083;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "Loe;")
    private class76 field1095;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "D")
    private double field1069;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "D")
    private double field1073;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "D")
    public double field1074;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "D")
    public double field1075;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "D")
    public double field1092;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "D")
    private double field1096;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "D")
    private double field1097;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "D")
    private double field1098;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "Lui;")
    private class88 field1085;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
    public final void method15(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1081++;
        if (!this.field1094) {
            class58 var6 = this.method521(1024);
            if (var6 == null) {
                return;
            }
            this.method520(var6, false);
        }
        if (this.field1085 != null) {
            this.field1085.method650(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    public final void method511(int arg0, int arg1) {
        this.field1061 = true;
        this.field1074 += (double) arg0 * this.field1098;
        this.field1075 += (double) arg0 * this.field1073;
        if (this.field1068 == -1) {
            this.field1092 += (double) arg0 * this.field1096;
        } else {
            this.field1092 += this.field1097 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1096;
            this.field1096 += (double) arg0 * this.field1097;
        }
        field1076++;
        if (arg1 != 0) {
            this.field1094 = false;
        }
        this.field1079 = (int) (Math.atan2(this.field1073, this.field1098) * 325.949D) + 1024 & 0x7FF;
        this.field1091 = (int) (Math.atan2(this.field1096, this.field1069) * 325.949D) & 0x7FF;
        if (this.field1095 == null) {
            return;
        }
        this.field1070 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1070 <= this.field1095.field1194[this.field1089]) {
                        return;
                    }
                    this.field1070 -= this.field1095.field1194[this.field1089];
                    this.field1089++;
                    if (this.field1089 >= this.field1095.field1191.length) {
                        this.field1089 -= this.field1095.field1186;
                        if (this.field1089 < 0 || this.field1095.field1191.length <= this.field1089) {
                            this.field1089 = 0;
                        }
                    }
                    this.field1082 = this.field1089 + 1;
                } while (this.field1082 < this.field1095.field1191.length);
                this.field1082 -= this.field1095.field1186;
            } while (this.field1082 >= 0 && this.field1095.field1191.length > this.field1082);
            this.field1082 = -1;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)V")
    public static final void method512(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class159.field2481 = arg1;
        class7.field67 = arg2;
        class91.field1457 = arg3;
        class53.field790 = new class313[arg0][class159.field2481][class7.field67];
        class297.field4763 = new int[arg0][class159.field2481 + 1][class7.field67 + 1];
        if (arg4) {
            class276.field4472 = new class313[1][class159.field2481][class7.field67];
            class263.field4058 = new int[class159.field2481][class7.field67];
            class277.field4486 = new int[1][class159.field2481 + 1][class7.field67 + 1];
        } else {
            class276.field4472 = null;
            class263.field4058 = null;
            class277.field4486 = null;
        }
        class20.method141(false);
        class254.field3829 = new class57[500];
        class139.field2268 = 0;
        class199.field2934 = new class57[500];
        class71.field1117 = 0;
        class131.field2171 = new int[arg0][class159.field2481 + 1][class7.field67 + 1];
        class2.field28 = new class156[5000];
        class115.field1914 = 0;
        class5.field51 = new class156[100];
        class79.field1276 = new boolean[class91.field1457 + class91.field1457 + 1][class91.field1457 + class91.field1457 + 1];
        class64.field971 = new boolean[class91.field1457 + class91.field1457 + 2][class91.field1457 + class91.field1457 + 2];
        class26.field286 = new byte[arg0][class159.field2481][class7.field67];
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)[Lbc;")
    public static final class148[] method513(int arg0) {
        field1093++;
        class148[] var1 = new class148[class223.field3270];
        for (int var2 = arg0; var2 < class223.field3270; var2++) {
            int var3 = class283.field4559[var2] * class165.field2534[var2];
            byte[] var4 = class280.field4506[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class53.field748[class301.method2056(var4[var6], 255)];
            }
            var1[var2] = new class148(class250.field3792, class19.field202, class32.field399[var2], class297.field4765[var2], class165.field2534[var2], class283.field4559[var2], var5);
        }
        class137.method1032(-117);
        return var1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBIIII)V")
    public static final void method514(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        class190.field2812[0].method1041(arg5, arg3);
        class190.field2812[1].method1041(arg5, arg3 + arg4 - 16);
        field1066++;
        int var6 = (arg4 - 32) * arg4 / arg2;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg4 - var6 - 32) * arg0 / (arg2 - arg4);
        class130.method996(arg5, arg3 + 16, 16, arg4 - 32, class6.field56);
        class130.method996(arg5, arg3 + var7 + 16, 16, var6, class265.field4246);
        class130.method998(arg5, arg3 + var7 + 16, var6, class98.field1672);
        class130.method998(arg5 + 1, arg3 - -16 + var7, var6, class98.field1672);
        class130.method1001(arg5, var7 + arg3 + 16, 16, class98.field1672);
        class130.method1001(arg5, arg3 + var7 + 17, 16, class98.field1672);
        if (arg1 != 48) {
            method514(-87, (byte) 72, -115, 60, 76, -70);
        }
        class130.method998(arg5 + 15, var7 + 16 + arg3, var6, class288.field4612);
        class130.method998(arg5 + 14, arg3 - (-17 - var7), var6 - 1, class288.field4612);
        class130.method1001(arg5, var6 + var7 + arg3 + 15, 16, class288.field4612);
        class130.method1001(arg5 + 1, arg3 + 14 + var6 + var7, 15, class288.field4612);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIII)V")
    public static final void method515(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 125) {
            method514(99, (byte) -60, -108, 64, 93, 41);
        }
        if (class110.field1840 == 1) {
            class261.field4038[class84.field1329 / 100].method726(class151.field2393 - 8, class11.field131 + -8);
        }
        field1065++;
        if (class110.field1840 == 2) {
            class261.field4038[class84.field1329 / 100 + 4].method726(class151.field2393 - 8, class11.field131 + -8);
        }
        class115.method860((byte) -59);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)[Laf;")
    public static final class176[] method516(byte arg0) {
        if (arg0 < 34) {
            return null;
        }
        field1063++;
        class176[] var1 = new class176[class223.field3270];
        for (int var2 = 0; var2 < class223.field3270; var2++) {
            var1[var2] = new class176(class250.field3792, class19.field202, class32.field399[var2], class297.field4765[var2], class165.field2534[var2], class283.field4559[var2], class280.field4506[var2], class53.field748);
        }
        class137.method1032(-126);
        return var1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(CB)C")
    public static final char method517(char arg0, byte arg1) {
        field1100++;
        if (arg1 != 80) {
            return '"';
        } else if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
    public static final void method518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1071++;
        if (class264.field4230 <= (arg2 - arg3) && class273.field4418 >= arg2 + arg3 && arg4 - arg3 >= class73.field1156 && class59.field859 >= (arg3 + arg4)) {
            class137.method1035(arg1, -1, arg2, arg6, arg4, arg3, arg0);
        } else {
            class35.method225(arg0, arg1, arg6, arg5 ^ 0x724C, arg3, arg4, arg2);
        }
        if (arg5 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIII)V")
    public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1088++;
        if (!this.field1061) {
            double var6 = (double) (arg0 - this.field1086);
            double var8 = (double) (arg1 - this.field1083);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1092 = (double) this.field1084;
            this.field1074 = (double) this.field1072 * var6 / var10 + (double) this.field1086;
            this.field1075 = (double) this.field1072 * var8 / var10 + (double) this.field1083;
        }
        double var12 = (double) (this.field1080 + 1 - arg3);
        this.field1073 = ((double) arg1 - this.field1075) / var12;
        this.field1098 = ((double) arg0 - this.field1074) / var12;
        this.field1069 = Math.sqrt(this.field1098 * this.field1098 + this.field1073 * this.field1073);
        if (this.field1068 == arg4) {
            this.field1096 = ((double) arg2 - this.field1092) / var12;
        } else {
            if (!this.field1061) {
                this.field1096 = -this.field1069 * Math.tan((double) this.field1068 * 0.02454369D);
            }
            this.field1097 = ((double) arg2 - this.field1092 - this.field1096 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIJILui;)V")
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class88 arg10) {
        field1077++;
        class58 var13 = this.method521(1024);
        if (var13 != null) {
            this.method520(var13, false);
            var13.method16(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1085);
            this.field1099 = var13.method17();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lmg;Z)V")
    private final void method520(class58 arg0, boolean arg1) {
        class257 var3 = (class257) arg0;
        if ((this.field1085 == null || this.field1085.field1407) && (var3.field3885 != null || var3.field3909 != null)) {
            this.field1085 = new class88(class199.field2930, 1, 1);
        }
        if (this.field1085 != null) {
            this.field1085.method660(var3.field3885, var3.field3909, false, var3.field3896, var3.field3888, var3.field3899);
        }
        if (arg1) {
            this.field1069 = 1.0548787180686405D;
        }
        field1090++;
        this.field1094 = true;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)Lmg;")
    private final class58 method521(int arg0) {
        if (arg0 != 1024) {
            this.field1069 = -0.19711981787115018D;
        }
        field1062++;
        class120 var2 = class152.method1126(this.field1067, (byte) -1);
        class58 var3 = var2.method895(this.field1070, this.field1082, (byte) -122, this.field1089);
        if (var3 == null) {
            return null;
        } else {
            var3.method411(this.field1091);
            return var3;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()I")
    public final int method17() {
        field1064++;
        return this.field1099;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1061 = false;
        this.field1060 = arg5;
        this.field1101 = arg1;
        this.field1084 = arg4;
        this.field1087 = arg10;
        this.field1086 = arg3;
        this.field1068 = arg7;
        this.field1072 = arg8;
        this.field1083 = arg2;
        this.field1080 = arg6;
        this.field1067 = arg0;
        this.field1078 = arg9;
        int var12 = class152.method1126(this.field1067, (byte) -1).field1944;
        if (var12 == -1) {
            this.field1095 = null;
        } else {
            this.field1095 = class232.method1609((byte) -32, var12);
        }
    }
}
