import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class345 extends class463 {

    @OriginalMember(owner = "client!he", name = "n", descriptor = "[I")
    public int[] field4379 = new int[16];

    @OriginalMember(owner = "client!he", name = "m", descriptor = "[I")
    private int[] field4378 = new int[16];

    @OriginalMember(owner = "client!he", name = "A", descriptor = "[I")
    private int[] field4392 = new int[16];

    @OriginalMember(owner = "client!he", name = "s", descriptor = "[[Ljh;")
    private class149[][] field4384 = new class149[16][128];

    @OriginalMember(owner = "client!he", name = "t", descriptor = "[I")
    private int[] field4385 = new int[16];

    @OriginalMember(owner = "client!he", name = "E", descriptor = "[I")
    private int[] field4396 = new int[16];

    @OriginalMember(owner = "client!he", name = "M", descriptor = "[I")
    private int[] field4403 = new int[16];

    @OriginalMember(owner = "client!he", name = "w", descriptor = "[[Ljh;")
    private class149[][] field4388 = new class149[16][128];

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    private int field4377 = 256;

    @OriginalMember(owner = "client!he", name = "eb", descriptor = "[I")
    private int[] field4421 = new int[16];

    @OriginalMember(owner = "client!he", name = "I", descriptor = "[I")
    private int[] field4399 = new int[16];

    @OriginalMember(owner = "client!he", name = "P", descriptor = "[I")
    private int[] field4406 = new int[16];

    @OriginalMember(owner = "client!he", name = "fb", descriptor = "[I")
    private int[] field4422 = new int[16];

    @OriginalMember(owner = "client!he", name = "W", descriptor = "[I")
    public int[] field4413 = new int[16];

    @OriginalMember(owner = "client!he", name = "D", descriptor = "[I")
    private int[] field4395 = new int[16];

    @OriginalMember(owner = "client!he", name = "db", descriptor = "[I")
    private int[] field4420 = new int[16];

    @OriginalMember(owner = "client!he", name = "sb", descriptor = "[I")
    private int[] field4435 = new int[16];

    @OriginalMember(owner = "client!he", name = "yb", descriptor = "[I")
    public int[] field4441 = new int[16];

    @OriginalMember(owner = "client!he", name = "R", descriptor = "[I")
    private int[] field4408 = new int[16];

    @OriginalMember(owner = "client!he", name = "Ab", descriptor = "I")
    private int field4443 = 1000000;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "Lkt;")
    private class147 field4390 = new class147();

    @OriginalMember(owner = "client!he", name = "Db", descriptor = "Lnga;")
    private class480 field4446 = new class480(this);

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "Lhd;")
    private class694 field4415 = new class694(128);

    @OriginalMember(owner = "client!he", name = "vb", descriptor = "Lws;")
    public static class333 field4438 = new class333();

    @OriginalMember(owner = "client!he", name = "z", descriptor = "F")
    public static float field4391;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!he", name = "gb", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!he", name = "hb", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!he", name = "ib", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!he", name = "jb", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!he", name = "kb", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!he", name = "lb", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!he", name = "mb", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!he", name = "nb", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!he", name = "ob", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!he", name = "pb", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!he", name = "qb", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!he", name = "rb", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!he", name = "tb", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!he", name = "ub", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!he", name = "wb", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!he", name = "xb", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!he", name = "Cb", descriptor = "I")
    private int field4445;

    @OriginalMember(owner = "client!he", name = "Eb", descriptor = "I")
    private int field4447;

    @OriginalMember(owner = "client!he", name = "Jb", descriptor = "I")
    private int field4452;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "J")
    public static long field4414;

    @OriginalMember(owner = "client!he", name = "Bb", descriptor = "J")
    private long field4444;

    @OriginalMember(owner = "client!he", name = "Fb", descriptor = "J")
    private long field4448;

    @OriginalMember(owner = "client!he", name = "zb", descriptor = "Lxa;")
    public static class468 field4442;

    @OriginalMember(owner = "client!he", name = "Hb", descriptor = "Lia;")
    private class551 field4450;

    @OriginalMember(owner = "client!he", name = "Gb", descriptor = "Z")
    private boolean field4449;

    @OriginalMember(owner = "client!he", name = "Ib", descriptor = "Z")
    private boolean field4451;

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 2281)
    public class345() {
        this.method1977((byte) 123, 256, -1);
        this.method1978(true, (byte) -63);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V", line = 17)
    private final void method1959(int arg0, int arg1, int arg2) {
        field4439++;
        if (arg2 != 1) {
            this.method1979(-95, -100);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILjh;I[I)Z", line = 29)
    public final boolean method1960(int arg0, int arg1, class149 arg2, int arg3, int[] arg4) {
        field4412++;
        arg2.field1777 = class278.field3535 / 100;
        if (arg2.field1775 >= 0 && arg2.field1786 == null || arg2.field1786.method3402()) {
            arg2.method933(0);
            arg2.method1566(-67);
            if (arg2.field1795 > 0 && this.field4384[arg2.field1793][arg2.field1795] == arg2) {
                this.field4384[arg2.field1793][arg2.field1795] = null;
            }
            return true;
        }
        int var6 = arg2.field1783;
        if (var6 > 0) {
            int var7 = var6 - (int) (Math.pow(2.0D, (double) this.field4403[arg2.field1793] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var7 < 0) {
                var7 = 0;
            }
            arg2.field1783 = var7;
        }
        arg2.field1786.method3405(this.method1994(arg2, arg0 - 109));
        class309 var8 = arg2.field1772;
        boolean var9 = false;
        arg2.field1776++;
        arg2.field1778 += var8.field3902;
        double var10 = (double) ((arg2.field1792 - 60 << 8) + (arg2.field1790 * arg2.field1783 >> 12)) * 5.086263020833333E-6D;
        if (var8.field3899 > 0) {
            if (var8.field3901 <= 0) {
                arg2.field1787 += 128;
            } else {
                arg2.field1787 += (int) (Math.pow(2.0D, (double) var8.field3901 * var10) * 128.0D + 0.5D);
            }
            if (arg2.field1787 * var8.field3899 >= 819200) {
                var9 = true;
            }
        }
        if (var8.field3889 != null) {
            if (var8.field3895 <= 0) {
                arg2.field1780 += 128;
            } else {
                arg2.field1780 += (int) (Math.pow(2.0D, (double) var8.field3895 * var10) * 128.0D + 0.5D);
            }
            while (var8.field3889.length - 2 > arg2.field1781 && arg2.field1780 > ((var8.field3889[arg2.field1781 + 2] & 0xFF) << 8)) {
                arg2.field1781 += 2;
            }
            if (var8.field3889.length - 2 == arg2.field1781 && var8.field3889[arg2.field1781 + 1] == 0) {
                var9 = true;
            }
        }
        if (arg2.field1775 >= arg0 && var8.field3894 != null && (this.field4441[arg2.field1793] & 0x1) == 0 && (arg2.field1795 < 0 || this.field4384[arg2.field1793][arg2.field1795] != arg2)) {
            if (var8.field3897 <= 0) {
                arg2.field1775 += 128;
            } else {
                arg2.field1775 += (int) (Math.pow(2.0D, (double) var8.field3897 * var10) * 128.0D + 0.5D);
            }
            while (arg2.field1794 < var8.field3894.length - 2 && arg2.field1775 > (var8.field3894[arg2.field1794 + 2] & 0xFF << 8)) {
                arg2.field1794 += 2;
            }
            if ((var8.field3894.length - 2) == arg2.field1794) {
                var9 = true;
            }
        }
        if (!var9) {
            arg2.field1786.method3403(arg2.field1777, this.method1981(arg2, (byte) 96), this.method1970(arg2, arg0 - 117));
            return false;
        }
        arg2.field1786.method3408(arg2.field1777);
        if (arg4 == null) {
            arg2.field1786.method1486(arg3);
        } else {
            arg2.field1786.method1493(arg4, arg1, arg3);
        }
        if (arg2.field1786.method3397()) {
            this.field4446.field5984.method1485(arg2.field1786);
        }
        arg2.method933(0);
        if (arg2.field1775 >= 0) {
            arg2.method1566(-70);
            if (arg2.field1795 > 0 && this.field4384[arg2.field1793][arg2.field1795] == arg2) {
                this.field4384[arg2.field1793][arg2.field1795] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 151)
    public final synchronized void method1961(int arg0) {
        if (arg0 != 18234) {
            this.method1975(81, -68);
        }
        field4380++;
        this.method1963((byte) 95, true);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BII)V", line = 165)
    private final void method1962(byte arg0, int arg1, int arg2) {
        this.field4396[arg2] = arg1;
        int var4 = -111 % ((arg0 - 64) / 57);
        field4405++;
        this.field4422[arg2] = class109.method762(arg1, -128);
        this.method1974(32, arg2, arg1);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BZ)V", line = 179)
    private final synchronized void method1963(byte arg0, boolean arg1) {
        field4428++;
        this.field4390.method922();
        if (arg0 == 95) {
            this.field4450 = null;
            this.method1978(arg1, (byte) -63);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([III)V", line = 193)
    public final synchronized void method1493(int[] arg0, int arg1, int arg2) {
        field4436++;
        if (this.field4390.method919()) {
            int var4 = this.field4390.field1760 * this.field4443 / class278.field3535;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field4444;
                if ((this.field4448 - var5) >= 0L) {
                    this.field4444 = var5;
                    break;
                }
                int var7 = (int) (((long) var4 + this.field4448 - this.field4444 - 1L) / (long) var4);
                this.field4444 += (long) var4 * (long) var7;
                this.field4446.method1493(arg0, arg1, var7);
                arg2 -= var7;
                this.method1995(1288185542);
                arg1 += var7;
            } while (this.field4390.method919());
        }
        this.field4446.method1493(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 241)
    public final synchronized void method1964(byte arg0) {
        field4376++;
        int var2 = -68 / ((arg0 - 32) / 53);
        for (class74 var3 = (class74) this.field4415.method3830((byte) 76); var3 != null; var3 = (class74) this.field4415.method3838((byte) -92)) {
            var3.method1566(-108);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(III)V", line = 257)
    private final void method1965(int arg0, int arg1, int arg2) {
        this.field4395[arg2] = arg1;
        if (arg0 != -24397) {
            this.field4421 = null;
        }
        field4425++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZZLia;B)V", line = 268)
    private final synchronized void method1966(boolean arg0, boolean arg1, class551 arg2, byte arg3) {
        this.method1963((byte) 95, arg0);
        field4426++;
        this.field4390.method915(arg2.field6909);
        if (arg3 != 125) {
            return;
        }
        this.field4444 = 0L;
        this.field4449 = arg1;
        int var5 = this.field4390.method928();
        for (int var6 = 0; var6 < var5; var6++) {
            this.field4390.method921(var6);
            this.field4390.method920(var6);
            this.field4390.method924(var6);
        }
        this.field4447 = this.field4390.method918();
        this.field4445 = this.field4390.field1755[this.field4447];
        this.field4448 = this.field4390.method923(this.field4445);
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()I", line = 307)
    public final synchronized int method1495() {
        field4411++;
        return 0;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V", line = 318)
    public static final void method1967(int arg0) {
        field4430++;
        if (class583.field7833 == 0 || class583.field7833 == 6) {
            return;
        }
        try {
            if ((++class623.field8444) > 2000) {
                if (class335.field4139 != null) {
                    class335.field4139.method2511((byte) 59);
                    class335.field4139 = null;
                }
                if (class402.field5156 >= 2) {
                    class583.field7833 = 0;
                    class29.method177(-5, 32768);
                    return;
                }
                if (class628.field8531 == 2 || class628.field8531 == 3) {
                    class360.field4628.method1410(35714);
                } else {
                    class194.field2293.method1410(35714);
                }
                class583.field7833 = 1;
                class402.field5156++;
                class623.field8444 = 0;
            }
            if (class583.field7833 == 1) {
                if (class628.field8531 == 2 || class628.field8531 == 3) {
                    class169.field1983 = class360.field4628.method1409(class386.field4955, -128);
                } else {
                    class169.field1983 = class194.field2293.method1409(class386.field4955, -124);
                }
                class583.field7833 = 2;
            }
            if (class583.field7833 == 2) {
                if (class169.field1983.field2546 == 2) {
                    throw new IOException();
                }
                if (class169.field1983.field2546 != 1) {
                    return;
                }
                class335.field4139 = class149.method932(7500, -7656, (Socket) class169.field1983.field2547);
                class169.field1983 = null;
                long var1 = class269.field3413 = class291.method1746(class469.field5798, (byte) -124);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class161.method991(0);
                class124 var4 = class590.method3275(81);
                var4.field1516.method3090(class295.field3746.field7095, 3);
                var4.field1516.method3090(var3, 3);
                class197.method1156((byte) 125, var4);
                class605.method3355(-101);
                class583.field7833 = 3;
            }
            if (class583.field7833 == 3) {
                if (!class335.field4139.method2514(-1, 1)) {
                    return;
                }
                class335.field4139.method2513((byte) -124, 1, 0, class222.field2585.field7318);
                int var5 = class222.field2585.field7318[0] & 0xFF;
                if (var5 != 0) {
                    class583.field7833 = 0;
                    class29.method177(var5, 32768);
                    class335.field4139.method2511((byte) -51);
                    class335.field4139 = null;
                    class146.method912(3);
                    return;
                }
                class583.field7833 = 4;
            }
            if (class583.field7833 == 4) {
                if (!class335.field4139.method2514(-1, 8)) {
                    return;
                }
                class335.field4139.method2513((byte) -127, 8, 0, class222.field2585.field7318);
                class222.field2585.field7313 = 0;
                class27.field321 = class222.field2585.method3046(false);
                class572 var6 = new class572(518);
                int[] var7 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class27.field321 >> 32), (int) class27.field321 };
                var6.method3090(10, 3);
                var6.method3061(var7[0], (byte) 115);
                var6.method3061(var7[1], (byte) 115);
                var6.method3061(var7[2], (byte) 115);
                var6.method3061(var7[3], (byte) 115);
                var6.method3047(true, class291.method1746(class469.field5798, (byte) -124));
                var6.method3050(false, class33.field515);
                var6.method3047(true, class125.field1522);
                var6.method3047(true, class674.field9213);
                var6.method3098(class269.field3410, 93, class339.field4329);
                class161.method991(0);
                class124 var8 = class590.method3275(-117);
                class638 var9 = var8.field1516;
                if (class628.field8531 == 2 || class628.field8531 == 3) {
                    if (class470.field5804 == 13) {
                        var9.method3090(class295.field3750.field7095, 3);
                    } else {
                        var9.method3090(class295.field3748.field7095, 3);
                    }
                    var9.method3080((byte) -67, 0);
                    int var11 = var9.field7313;
                    var9.method3061(616, (byte) 115);
                    var9.method3090(class139.field1674, 3);
                    var9.method3090(class207.method1211(3), 3);
                    var9.method3080((byte) -71, class309.field3890);
                    var9.method3080((byte) -73, class491.field6129);
                    var9.method3090(class611.field8310.field8721, 3);
                    class401.method2260((byte) -87, var9);
                    var9.method3050(false, class122.field1487);
                    var9.method3061(class594.field7969, (byte) 115);
                    class572 var12 = new class572(class510.method2781(true));
                    class611.field8310.method3596(var12, (byte) 57);
                    var9.method3090(var12.field7313, 3);
                    var9.method3091(var12.field7318, (byte) -118, 0, var12.field7313);
                    class528.field6662 = true;
                    class572 var13 = new class572(class558.method2968(19));
                    (new class116(true, class386.field4955)).method788(var13, 0);
                    var9.method3091(var13.field7318, (byte) -12, 0, var13.field7318.length);
                    var9.method3080((byte) -125, class340.field4343);
                    var9.method3047(true, class192.field2274);
                    class173.method1035(29, var9);
                    var9.method3091(var6.field7318, (byte) -57, 0, var6.field7313);
                    var9.method3042(var9.field7313 - var11, 823690976);
                } else {
                    var9.method3090(class295.field3751.field7095, 3);
                    var9.method3080((byte) -102, 0);
                    int var10 = var9.field7313;
                    var9.method3061(616, (byte) 115);
                    var9.method3090(class341.field4353.field8728, 3);
                    var9.method3090(class71.field912, 3);
                    class401.method2260((byte) -86, var9);
                    var9.method3050(false, class122.field1487);
                    var9.method3061(class594.field7969, (byte) 115);
                    class173.method1035(29, var9);
                    var9.method3091(var6.field7318, (byte) -49, 0, var6.field7313);
                    var9.method3042(var9.field7313 - var10, 823690976);
                }
                class197.method1156((byte) 94, var8);
                class605.method3355(-111);
                class636.field8620 = new class324(var7);
                for (int var14 = 0; var14 < 4; var14++) {
                    var7[var14] += 50;
                }
                class222.field2585.method3575(-1, var7);
                class583.field7833 = 5;
            }
            if (class583.field7833 == 5) {
                if (!class335.field4139.method2514(-1, 1)) {
                    return;
                }
                class335.field4139.method2513((byte) -106, 1, 0, class222.field2585.field7318);
                int var15 = class222.field2585.field7318[0] & 0xFF;
                if (var15 == 21) {
                    class583.field7833 = 8;
                } else if (var15 == 29) {
                    class583.field7833 = 14;
                } else if (var15 == 1) {
                    class583.field7833 = 6;
                    class29.method177(var15, 32768);
                    return;
                } else if (var15 == 2) {
                    class583.field7833 = 9;
                } else if (var15 == 15) {
                    class10.field100 = -2;
                    class583.field7833 = 15;
                } else if (var15 == 23 && class402.field5156 < 2) {
                    class402.field5156++;
                    class583.field7833 = 1;
                    class623.field8444 = 0;
                    class335.field4139.method2511((byte) 127);
                    class335.field4139 = null;
                    return;
                } else {
                    class583.field7833 = 0;
                    class29.method177(var15, 32768);
                    class335.field4139.method2511((byte) -80);
                    class335.field4139 = null;
                    class146.method912(3);
                    return;
                }
            }
            if (class583.field7833 == 7) {
                class161.method991(0);
                class124 var16 = class590.method3275(-83);
                class638 var17 = var16.field1516;
                var17.method3572((byte) 122, class636.field8620);
                var17.method3580((byte) -115, class295.field3758.field7095);
                class197.method1156((byte) 119, var16);
                class605.method3355(106);
                class583.field7833 = 5;
            } else if (class583.field7833 == 8) {
                if (class335.field4139.method2514(-1, 1)) {
                    class335.field4139.method2513((byte) -120, 1, 0, class222.field2585.field7318);
                    int var18 = class222.field2585.field7318[0] & 0xFF;
                    class583.field7833 = 0;
                    class307.field3880 = var18 * 60 + 180;
                    class29.method177(21, 32768);
                    class335.field4139.method2511((byte) 69);
                    class335.field4139 = null;
                    class146.method912(3);
                }
            } else if (class583.field7833 == 14) {
                if (class335.field4139.method2514(-1, 1)) {
                    class335.field4139.method2513((byte) -106, 1, 0, class222.field2585.field7318);
                    class583.field7833 = 0;
                    class164.field1930 = class222.field2585.field7318[0] & 0xFF;
                    class29.method177(29, 32768);
                    class335.field4139.method2511((byte) 69);
                    class335.field4139 = null;
                    class146.method912(3);
                }
            } else if (class583.field7833 != 9) {
                int var19 = 15 % ((-arg0 - 31) / 63);
                if (class583.field7833 == 10) {
                    class638 var20 = class222.field2585;
                    if (class628.field8531 == 3) {
                        class614.field8343 = true;
                    } else {
                        class614.field8343 = false;
                    }
                    if (class628.field8531 == 2 || class628.field8531 == 3) {
                        if (!class335.field4139.method2514(-1, class673.field9199)) {
                            return;
                        }
                        class335.field4139.method2513((byte) -112, class673.field9199, 0, var20.field7318);
                        var20.field7313 = 0;
                        class146.field1745 = var20.method3097((byte) 12);
                        class185.field2187 = var20.method3097((byte) 12);
                        class701.field9811 = var20.method3097((byte) 12) == 1;
                        class493.field6149 = var20.method3097((byte) 12) == 1;
                        class2.field9 = var20.method3097((byte) 12) == 1;
                        class165.field1938 = var20.method3097((byte) 12) == 1;
                        class350.field4523 = var20.method3031(-1);
                        class700.field9795 = var20.method3097((byte) 12) == 1;
                        class173.field2033 = var20.method3071(228709168);
                        class196.field2308 = var20.method3097((byte) 12) == 1;
                        if (class628.field8531 == 3) {
                            boolean var21 = var20.method3097((byte) 12) == 1;
                            if (var21) {
                                long var22 = var20.method3046(false);
                                String var24 = class182.method1086(var22, -30150);
                                int var25 = var20.method3097((byte) 12);
                                byte[] var26 = new byte[var25];
                                var20.method3577((byte) 15, var26, 0, var25);
                                String var27 = class32.method229(-8193, var26);
                                class448 var28 = null;
                                try {
                                    class218 var29 = class386.field4955.method2596((byte) 112, false, "3");
                                    while (var29.field2546 == 0) {
                                        class700.method3867(29279, 1L);
                                    }
                                    if (var29.field2546 == 1) {
                                        var28 = (class448) var29.field2547;
                                        int var30 = (var24.length() + 5 - ((-var27.length() - 8) + -2)) + 4;
                                        if (var30 > 60) {
                                            throw new RuntimeException(">60");
                                        }
                                        class572 var31 = new class572(var30 + 1);
                                        var31.method3090(var30, 3);
                                        var31.method3090(2, 3);
                                        var31.method3039(var24, (byte) -102);
                                        var31.method3039(var27, (byte) -111);
                                        var31.method3080((byte) -94, class594.field7969);
                                        var31.method3047(true, class192.field2274);
                                        var31.method3045((byte) 125);
                                        var28.method2449(var31.field7318, var31.field7313, (byte) 31, 0);
                                    }
                                } catch (Exception var41) {
                                }
                                try {
                                    if (var28 != null) {
                                        var28.method2451(true);
                                    }
                                } catch (Exception var39) {
                                }
                                try {
                                    class104.method744(class95.field1241, "demoaccountcreated", 111);
                                } catch (Throwable var38) {
                                }
                            }
                        }
                        class232.field3017.method2361(false, class196.field2308);
                        class504.field6287.method1621(class196.field2308, 27700);
                        class46.field620.method3764((byte) -18, class196.field2308);
                    } else if (class335.field4139.method2514(-1, class673.field9199)) {
                        class335.field4139.method2513((byte) -127, class673.field9199, 0, var20.field7318);
                        var20.field7313 = 0;
                        class146.field1745 = var20.method3097((byte) 12);
                        class185.field2187 = var20.method3097((byte) 12);
                        class701.field9811 = var20.method3097((byte) 12) == 1;
                        class493.field6149 = var20.method3097((byte) 12) == 1;
                        class2.field9 = var20.method3097((byte) 12) == 1;
                        class471.field5827 = var20.method3031(-1);
                        class700.field9795 = class471.field5827 > 0;
                        class366.field4724 = var20.method3031(-1);
                        class286.field3630 = var20.method3031(-1);
                        class110.field1373 = var20.method3031(-1);
                        class370.field4783 = var20.method3064(-2031091464);
                        class354.field4577 = class386.field4955.method2595(class370.field4783, 65535);
                        class255.field3279 = var20.method3097((byte) 12);
                        class237.field3063 = var20.method3031(-1);
                        class671.field9180 = var20.method3031(-1);
                        class488.field6100 = var20.method3097((byte) 12) == 1;
                        class67.field815.field4673 = class67.field815.field4710 = var20.method3057((byte) -115);
                        class285.field3610 = var20.method3097((byte) 12);
                        class217.field2538 = var20.method3064(-2031091464);
                        class76.field997 = new class234();
                        class76.field997.field3030 = var20.method3031(-1);
                        if (class76.field997.field3030 == 65535) {
                            class76.field997.field3030 = -1;
                        }
                        class76.field997.field3035 = var20.method3057((byte) -122);
                        if (class257.field3292 != class255.field3277) {
                            class76.field997.field3037 = class76.field997.field3030 + 50000;
                            class76.field997.field3031 = class76.field997.field3030 + 40000;
                        }
                        if (class257.field3292 != class235.field3043 && (class360.field4628.method1412(class373.field4810, (byte) -56) || class360.field4628.method1412(class349.field4478, (byte) -36))) {
                            class234.method1415((byte) -89);
                        }
                    } else {
                        return;
                    }
                    if ((!class701.field9811 || class2.field9) && !class700.field9795) {
                        try {
                            class104.method744(class95.field1241, "unzap", 116);
                        } catch (Throwable var36) {
                        }
                    } else {
                        try {
                            class104.method744(class95.field1241, "zap", 120);
                        } catch (Throwable var40) {
                            if (class385.field4948) {
                                try {
                                    class95.field1241.getAppletContext().showDocument(new URL(class95.field1241.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var37) {
                                }
                            }
                        }
                    }
                    if (class257.field3292 == class255.field3277) {
                        try {
                            class104.method744(class95.field1241, "loggedin", 120);
                        } catch (Throwable var35) {
                        }
                    }
                    if (class628.field8531 != 2 && class628.field8531 != 3) {
                        class583.field7833 = 0;
                        class29.method177(2, 32768);
                        class377.method2176((byte) 90);
                        class78.method609(10503, 7);
                        class613.field8339 = null;
                        return;
                    }
                    class583.field7833 = 12;
                }
                if (class583.field7833 == 12) {
                    if (!class335.field4139.method2514(-1, 3)) {
                        return;
                    }
                    class335.field4139.method2513((byte) -110, 3, 0, class222.field2585.field7318);
                    class583.field7833 = 13;
                }
                if (class583.field7833 == 13) {
                    class638 var32 = class222.field2585;
                    var32.field7313 = 0;
                    if (var32.method3586(-30965)) {
                        if (!class335.field4139.method2514(-1, 1)) {
                            return;
                        }
                        class335.field4139.method2513((byte) -114, 1, 3, var32.field7318);
                    }
                    class613.field8339 = class501.method2726(3063)[var32.method3574(-129)];
                    class10.field100 = var32.method3031(-1);
                    class583.field7833 = 11;
                }
                if (class583.field7833 == 11) {
                    if (class335.field4139.method2514(-1, class10.field100)) {
                        class335.field4139.method2513((byte) -127, class10.field100, 0, class222.field2585.field7318);
                        class222.field2585.field7313 = 0;
                        int var33 = class10.field100;
                        class583.field7833 = 0;
                        class29.method177(2, 32768);
                        class485.method2636(0);
                        class72.method567(20789, class222.field2585);
                        class563.field7027 = -1;
                        if (class613.field8339 == class585.field7861) {
                            class596.method3294(42);
                        } else {
                            class367.method2138(true);
                        }
                        if (class222.field2585.field7313 != var33) {
                            throw new RuntimeException("lswp pos:" + class222.field2585.field7313 + " psize:" + var33);
                        }
                        class613.field8339 = null;
                    }
                } else if (class583.field7833 == 15) {
                    if (class10.field100 == -2) {
                        if (!class335.field4139.method2514(-1, 2)) {
                            return;
                        }
                        class335.field4139.method2513((byte) -124, 2, 0, class222.field2585.field7318);
                        class222.field2585.field7313 = 0;
                        class10.field100 = class222.field2585.method3031(-1);
                    }
                    if (class335.field4139.method2514(-1, class10.field100)) {
                        class335.field4139.method2513((byte) -110, class10.field100, 0, class222.field2585.field7318);
                        class222.field2585.field7313 = 0;
                        int var34 = class10.field100;
                        class583.field7833 = 0;
                        class29.method177(15, 32768);
                        class35.method235((byte) -122);
                        class72.method567(20789, class222.field2585);
                        if (class222.field2585.field7313 != var34) {
                            throw new RuntimeException("lswpr pos:" + class222.field2585.field7313 + " psize:" + var34);
                        }
                        class613.field8339 = null;
                    }
                }
            } else if (class335.field4139.method2514(-1, 1)) {
                class335.field4139.method2513((byte) -116, 1, 0, class222.field2585.field7318);
                class583.field7833 = 10;
                class673.field9199 = class222.field2585.field7318[0] & 0xFF;
            }
        } catch (IOException var42) {
            if (class335.field4139 != null) {
                class335.field4139.method2511((byte) 101);
                class335.field4139 = null;
            }
            if (class402.field5156 >= 2) {
                class583.field7833 = 0;
                class29.method177(-4, 32768);
                class146.method912(3);
            } else {
                if (class628.field8531 == 2 || class628.field8531 == 3) {
                    class360.field4628.method1410(35714);
                } else {
                    class194.field2293.method1410(35714);
                }
                class402.field5156++;
                class583.field7833 = 1;
                class623.field8444 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V", line = 971)
    public static void method1968(int arg0) {
        field4438 = null;
        if (arg0 > -14) {
            method1991(93, null, 25, -125, 64);
        }
        field4442 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLjh;)Z", line = 983)
    public final boolean method1969(boolean arg0, class149 arg1) {
        if (!arg0) {
            this.field4420 = null;
        }
        field4429++;
        if (arg1.field1786 != null) {
            return false;
        }
        if (arg1.field1775 >= 0) {
            arg1.method1566(-61);
            if (arg1.field1795 > 0 && this.field4384[arg1.field1793][arg1.field1795] == arg1) {
                this.field4384[arg1.field1793][arg1.field1795] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljh;I)I", line = 1016)
    private final int method1970(class149 arg0, int arg1) {
        field4419++;
        if (arg1 > -1) {
            this.field4420 = null;
        }
        int var3 = this.field4385[arg0.field1793];
        return var3 < 8192 ? arg0.field1785 * var3 + 32 >> 6 : 16384 - ((16384 - var3) * (128 - arg0.field1785) + 32 >> 6);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()Lmi;", line = 1036)
    public final synchronized class463 method1487() {
        field4433++;
        return null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V", line = 1045)
    private final void method1971(int arg0, int arg1) {
        field4389++;
        int var3 = 71 / ((arg0 - 32) / 54);
        for (class149 var4 = (class149) this.field4446.field5968.method1909(true); var4 != null; var4 = (class149) this.field4446.field5968.method1916((byte) 113)) {
            if ((arg1 < 0 || var4.field1793 == arg1) && var4.field1775 < 0) {
                this.field4388[var4.field1793][var4.field1792] = null;
                var4.field1775 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)V", line = 1080)
    private final void method1972(int arg0, int arg1) {
        field4381++;
        if ((arg0 & this.field4441[arg1]) == 0) {
            return;
        }
        for (class149 var3 = (class149) this.field4446.field5968.method1909(true); var3 != null; var3 = (class149) this.field4446.field5968.method1916((byte) 120)) {
            if (var3.field1793 == arg1) {
                var3.field1784 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(II)V", line = 1114)
    private final void method1973(int arg0, int arg1) {
        field4432++;
        int var3 = arg0 & 0xF0;
        if (var3 == 128) {
            int var4 = arg0 & 0xF;
            int var5 = (arg0 & 0x7FBE) >> 8;
            int var6 = (arg0 & 0x7F906D) >> 16;
            this.method1983(var6, var4, (byte) -103, var5);
        } else if (var3 == 144) {
            int var7 = arg0 & 0xF;
            int var8 = (arg0 & 0x7FEE) >> 8;
            int var9 = (arg0 & 0x7FBAF9) >> 16;
            if (var9 <= 0) {
                this.method1983(64, var7, (byte) 99, var8);
            } else {
                this.method1989(var7, var9, -79, var8);
            }
        } else if (var3 == 160) {
            int var10 = arg0 & 0xF;
            int var11 = (arg0 & 0x7F17) >> 8;
            int var12 = arg0 >> 16 & 0x7F;
            this.method1976(arg1 ^ 0x5B16, var12, var11, var10);
        } else if (var3 == 176) {
            int var13 = arg0 & 0xF;
            int var14 = (arg0 & 0x7F52) >> 8;
            int var15 = (arg0 & 0x7F1783) >> 16;
            if (var14 == 0) {
                this.field4422[var13] = (var15 << 14) + class109.method762(-2080769, this.field4422[var13]);
            }
            if (var14 == 32) {
                this.field4422[var13] = (var15 << 7) + class109.method762(this.field4422[var13], -16257);
            }
            if (var14 == 1) {
                this.field4406[var13] = (var15 << 7) + class109.method762(-16257, this.field4406[var13]);
            }
            if (var14 == 33) {
                this.field4406[var13] = var15 + class109.method762(this.field4406[var13], -128);
            }
            if (var14 == 5) {
                this.field4403[var13] = (var15 << 7) + class109.method762(this.field4403[var13], -16257);
            }
            if (var14 == 37) {
                this.field4403[var13] = class109.method762(this.field4403[var13], -128) + var15;
            }
            if (var14 == 7) {
                this.field4399[var13] = class109.method762(-16257, this.field4399[var13]) + (var15 << 7);
            }
            if (var14 == 39) {
                this.field4399[var13] = class109.method762(this.field4399[var13], -128) + var15;
            }
            if (var14 == 10) {
                this.field4385[var13] = class109.method762(-16257, this.field4385[var13]) + (var15 << 7);
            }
            if (var14 == 42) {
                this.field4385[var13] = var15 + class109.method762(-128, this.field4385[var13]);
            }
            if (var14 == 11) {
                this.field4378[var13] = (var15 << 7) + class109.method762(-16257, this.field4378[var13]);
            }
            if (var14 == 43) {
                this.field4378[var13] = var15 + class109.method762(-128, this.field4378[var13]);
            }
            if (var14 == 64) {
                if (var15 >= 64) {
                    this.field4441[var13] = class364.method2113(this.field4441[var13], 1);
                } else {
                    this.field4441[var13] = class109.method762(this.field4441[var13], -2);
                }
            }
            if (var14 == 65) {
                if (var15 < 64) {
                    this.method1992(var13, 2);
                    this.field4441[var13] = class109.method762(this.field4441[var13], -3);
                } else {
                    this.field4441[var13] = class364.method2113(this.field4441[var13], 2);
                }
            }
            if (var14 == 99) {
                this.field4421[var13] = (var15 << 7) + class109.method762(this.field4421[var13], 127);
            }
            if (var14 == 98) {
                this.field4421[var13] = var15 + class109.method762(this.field4421[var13], 16256);
            }
            if (var14 == 101) {
                this.field4421[var13] = (var15 << 7) + class109.method762(this.field4421[var13], 127) + 16384;
            }
            if (var14 == 100) {
                this.field4421[var13] = class109.method762(16256, this.field4421[var13]) + var15 + 16384;
            }
            if (var14 == 120) {
                this.method1979(var13, arg1 - 23219);
            }
            if (var14 == 121) {
                this.method1975(-1297164953, var13);
            }
            if (var14 == 123) {
                this.method1971(arg1 ^ 0xFFFFA49C, var13);
            }
            if (var14 == 6) {
                int var16 = this.field4421[var13];
                if (var16 == 16384) {
                    this.field4420[var13] = class109.method762(-16257, this.field4420[var13]) + (var15 << 7);
                }
            }
            if (var14 == 38) {
                int var17 = this.field4421[var13];
                if (var17 == 16384) {
                    this.field4420[var13] = class109.method762(-128, this.field4420[var13]) + var15;
                }
            }
            if (var14 == 16) {
                this.field4379[var13] = (var15 << 7) + class109.method762(this.field4379[var13], -16257);
            }
            if (var14 == 48) {
                this.field4379[var13] = class109.method762(this.field4379[var13], -128) + var15;
            }
            if (var14 == 81) {
                if (var15 >= 64) {
                    this.field4441[var13] = class364.method2113(this.field4441[var13], 4);
                } else {
                    this.method1972(4, var13);
                    this.field4441[var13] = class109.method762(this.field4441[var13], -5);
                }
            }
            if (var14 == 17) {
                this.method1988(var13, (byte) -86, (var15 << 7) + (this.field4435[var13] & 0xFFFFC07F));
            }
            if (var14 == 49) {
                this.method1988(var13, (byte) -86, (this.field4435[var13] & 0xFFFFFF80) + var15);
            }
        } else if (var3 == 192) {
            int var18 = arg0 & 0xF;
            int var19 = (arg0 & 0x7F23) >> 8;
            this.method1974(32, var18, this.field4422[var18] + var19);
        } else if (var3 == 208) {
            int var20 = arg0 & 0xF;
            int var21 = arg0 >> 8 & 0x7F;
            this.method1959(var21, var20, 1);
        } else if (var3 == 224) {
            int var22 = arg0 & 0xF;
            int var23 = ((arg0 & 0x7F00C0) >> 9) + (arg0 >> 8 & 0x7F);
            this.method1965(-24397, var23, var22);
        } else {
            int var24 = arg0 & 0xFF;
            if (arg1 != 23319) {
                this.field4421 = null;
            }
            if (var24 == 255) {
                this.method1978(true, (byte) -63);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(III)V", line = 1354)
    private final void method1974(int arg0, int arg1, int arg2) {
        field4393++;
        if (arg0 == 32 && this.field4392[arg1] != arg2) {
            this.field4392[arg1] = arg2;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field4384[arg1][var4] = null;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(II)V", line = 1376)
    private final void method1975(int arg0, int arg1) {
        field4402++;
        if (arg1 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.method1975(-1297164953, var3);
            }
            return;
        }
        this.field4399[arg1] = 12800;
        this.field4385[arg1] = 8192;
        this.field4378[arg1] = 16383;
        this.field4395[arg1] = 8192;
        this.field4406[arg1] = 0;
        this.field4403[arg1] = 8192;
        this.method1992(arg1, 2);
        this.method1972(arg0 ^ 0xB2AED563, arg1);
        this.field4441[arg1] = 0;
        this.field4421[arg1] = 32767;
        this.field4420[arg1] = 256;
        this.field4379[arg1] = 0;
        this.method1988(arg1, (byte) -86, 8192);
        if (arg0 != -1297164953) {
            this.method1975(55, -21);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)V", line = 1410)
    private final void method1976(int arg0, int arg1, int arg2, int arg3) {
        field4394++;
        if (arg0 != 1) {
            this.method1990(-112);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(BII)V", line = 1420)
    private final synchronized void method1977(byte arg0, int arg1, int arg2) {
        field4386++;
        int var4 = 32 % ((70 - arg0) / 35);
        if (arg2 >= 0) {
            this.field4408[arg2] = arg1;
        } else {
            for (int var5 = 0; var5 < 16; var5++) {
                this.field4408[var5] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZB)V", line = 1445)
    private final void method1978(boolean arg0, byte arg1) {
        field4401++;
        if (arg0) {
            this.method1979(-1, arg1 ^ -91);
        } else {
            this.method1971(104, -1);
        }
        this.method1975(-1297164953, -1);
        if (arg1 != -63) {
            this.field4392 = null;
        }
        for (int var3 = 0; var3 < 16; var3++) {
            this.field4392[var3] = this.field4396[var3];
        }
        for (int var4 = 0; var4 < 16; var4++) {
            this.field4422[var4] = class109.method762(-128, this.field4396[var4]);
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()Lmi;", line = 1489)
    public final synchronized class463 method1496() {
        field4383++;
        return this.field4446;
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(II)V", line = 1497)
    private final void method1979(int arg0, int arg1) {
        if (arg1 != 100) {
            this.field4435 = null;
        }
        for (class149 var3 = (class149) this.field4446.field5968.method1909(true); var3 != null; var3 = (class149) this.field4446.field5968.method1916((byte) 98)) {
            if (arg0 < 0 || var3.field1793 == arg0) {
                if (var3.field1786 != null) {
                    var3.field1786.method3408(class278.field3535 / 100);
                    if (var3.field1786.method3397()) {
                        this.field4446.field5984.method1485(var3.field1786);
                    }
                    var3.method933(0);
                }
                if (var3.field1775 < 0) {
                    this.field4388[var3.field1793][var3.field1792] = null;
                }
                var3.method1566(-90);
            }
        }
        field4423++;
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(I)Z", line = 1536)
    public final synchronized boolean method1980(int arg0) {
        field4387++;
        return arg0 == 0 ? this.field4390.method919() : false;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljh;B)I", line = 1559)
    private final int method1981(class149 arg0, byte arg1) {
        field4440++;
        if (this.field4408[arg0.field1793] == 0) {
            return 0;
        }
        class309 var3 = arg0.field1772;
        int var4 = this.field4399[arg0.field1793] * this.field4378[arg0.field1793] + 4096 >> 13;
        int var5 = var4 * var4 + 16384 >> 15;
        int var6 = arg0.field1791 * var5 + 16384 >> 15;
        int var7 = this.field4377 * var6 + 128 >> 8;
        int var8 = this.field4408[arg0.field1793] * var7 + 128 >> 8;
        if (var3.field3899 > 0) {
            var8 = (int) (Math.pow(0.5D, (double) arg0.field1787 * 1.953125E-5D * (double) var3.field3899) * (double) var8 + 0.5D);
        }
        if (var3.field3889 != null) {
            int var9 = arg0.field1780;
            int var10 = var3.field3889[arg0.field1781 + 1];
            if (arg0.field1781 < var3.field3889.length - 2) {
                int var11 = (var3.field3889[arg0.field1781] & 0xFF) << 8;
                int var12 = var3.field3889[arg0.field1781 + 2] & 0xFF << 8;
                var10 += (var9 - var11) * (var3.field3889[arg0.field1781 + 3] - var10) / (var12 - var11);
            }
            var8 = var8 * var10 + 32 >> 6;
        }
        int var13 = -41 / ((-arg1 - 22) / 40);
        if (arg0.field1775 > 0 && var3.field3894 != null) {
            int var14 = arg0.field1775;
            int var15 = var3.field3894[arg0.field1794 + 1];
            if ((var3.field3894.length - 2) > arg0.field1794) {
                int var16 = var3.field3894[arg0.field1794] & 0xFF << 8;
                int var17 = (var3.field3894[arg0.field1794 + 2] & 0xFF) << 8;
                var15 += (var3.field3894[arg0.field1794 + 3] - var15) * (var14 - var16) / (var17 - var16);
            }
            var8 = var8 * var15 + 32 >> 6;
        }
        return var8;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BZLjh;)V", line = 1631)
    public final void method1982(byte arg0, boolean arg1, class149 arg2) {
        field4424++;
        int var4 = arg2.field1782.field30.length;
        if (arg0 < 113) {
            this.method1969(false, null);
        }
        int var7;
        if (arg1 && arg2.field1782.field29) {
            int var5 = var4 + var4 - arg2.field1782.field31;
            int var6 = var4 << 8;
            var7 = (int) ((long) this.field4379[arg2.field1793] * (long) var5 >> 6);
            if (var7 >= var6) {
                arg2.field1786.method3418(true);
                var7 = var6 + var6 - var7 - 1;
            }
        } else {
            var7 = (int) ((long) this.field4379[arg2.field1793] * (long) var4 >> 6);
        }
        arg2.field1786.method3395(var7);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIBI)V", line = 1664)
    private final void method1983(int arg0, int arg1, byte arg2, int arg3) {
        field4418++;
        class149 var5 = this.field4388[arg1][arg3];
        if (var5 == null) {
            return;
        }
        this.field4388[arg1][arg3] = null;
        int var6 = 98 % ((arg2 + 20) / 47);
        if ((this.field4441[arg1] & 0x2) == 0) {
            var5.field1775 = 0;
            return;
        }
        for (class149 var7 = (class149) this.field4446.field5968.method1909(true); var7 != null; var7 = (class149) this.field4446.field5968.method1916((byte) 109)) {
            if (var5.field1793 == var7.field1793 && var7.field1775 < 0 && var5 != var7) {
                var5.field1775 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(II)V", line = 1709)
    public final synchronized void method1984(int arg0, int arg1) {
        this.field4377 = arg1;
        field4382++;
        int var3 = 116 % ((arg0 + 46) / 35);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lia;ZB)V", line = 1722)
    public final synchronized void method1985(class551 arg0, boolean arg1, byte arg2) {
        if (arg2 <= -41) {
            this.method1966(true, arg1, arg0, (byte) 125);
            field4431++;
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(III)V", line = 1733)
    public final synchronized void method1986(int arg0, int arg1, int arg2) {
        int var4 = -22 % ((-arg1 - 58) / 39);
        this.method1962((byte) 126, arg2, arg0);
        field4410++;
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "(I)I", line = 1743)
    public final int method1987(int arg0) {
        field4398++;
        if (arg0 > -5) {
            this.method1995(-11);
        }
        return this.field4377;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBI)V", line = 1754)
    private final void method1988(int arg0, byte arg1, int arg2) {
        this.field4435[arg0] = arg2;
        field4400++;
        if (arg1 == -86) {
            this.field4413[arg0] = (int) (Math.pow(2.0D, (double) arg2 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(IIII)V", line = 1767)
    private final void method1989(int arg0, int arg1, int arg2, int arg3) {
        field4427++;
        this.method1983(64, arg0, (byte) 39, arg3);
        if ((this.field4441[arg0] & 0x2) != 0) {
            for (class149 var5 = (class149) this.field4446.field5968.method1911(7); var5 != null; var5 = (class149) this.field4446.field5968.method1903((byte) 127)) {
                if (var5.field1793 == arg0 && var5.field1775 < 0) {
                    this.field4388[arg0][var5.field1792] = null;
                    this.field4388[arg0][arg3] = var5;
                    int var6 = (var5.field1790 * var5.field1783 >> 12) + var5.field1774;
                    var5.field1774 += arg3 - var5.field1792 << 8;
                    var5.field1790 = var6 - var5.field1774;
                    var5.field1783 = 4096;
                    var5.field1792 = arg3;
                    return;
                }
            }
        }
        class74 var7 = (class74) this.field4415.method3828((long) this.field4392[arg0], (byte) -91);
        if (var7 == null) {
            return;
        }
        class4 var8 = var7.field974[arg3];
        if (var8 == null) {
            return;
        }
        class149 var9 = new class149();
        var9.field1779 = var7;
        var9.field1793 = arg0;
        var9.field1782 = var8;
        var9.field1772 = var7.field977[arg3];
        var9.field1795 = var7.field978[arg3];
        var9.field1792 = arg3;
        var9.field1791 = arg1 * arg1 * var7.field984[arg3] * var7.field980 + 1024 >> 11;
        var9.field1785 = var7.field981[arg3] & 0xFF;
        var9.field1774 = (arg3 << 8) - (var7.field982[arg3] & 0x7FFF);
        var9.field1781 = 0;
        var9.field1787 = 0;
        var9.field1794 = 0;
        var9.field1780 = 0;
        var9.field1775 = -1;
        int var10 = 116 % ((arg2 + 25) / 48);
        if (this.field4379[arg0] == 0) {
            var9.field1786 = class609.method3386(var8, this.method1994(var9, -125), this.method1981(var9, (byte) -94), this.method1970(var9, -82));
        } else {
            var9.field1786 = class609.method3386(var8, this.method1994(var9, -78), 0, this.method1970(var9, -47));
            this.method1982((byte) 121, var7.field982[arg3] < 0, var9);
        }
        if (var7.field982[arg3] < 0) {
            var9.field1786.method3394(-1);
        }
        if (var9.field1795 >= 0) {
            class149 var11 = this.field4384[arg0][var9.field1795];
            if (var11 != null && var11.field1775 < 0) {
                this.field4388[arg0][var11.field1792] = null;
                var11.field1775 = 0;
            }
            this.field4384[arg0][var9.field1795] = var9;
        }
        this.field4446.field5968.method1904(var9, -110);
        this.field4388[arg0][arg3] = var9;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 1865)
    public final synchronized void method1486(int arg0) {
        field4434++;
        if (this.field4390.method919()) {
            int var2 = this.field4390.field1760 * this.field4443 / class278.field3535;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field4444;
                if (this.field4448 - var3 >= 0L) {
                    this.field4444 = var3;
                    break;
                }
                int var5 = (int) ((this.field4448 - (this.field4444 + 1L - ((long) var2))) / (long) var2);
                this.field4444 += (long) var2 * (long) var5;
                arg0 -= var5;
                this.field4446.method1486(var5);
                this.method1995(1288185542);
            } while (this.field4390.method919());
        }
        this.field4446.method1486(arg0);
    }

    @OriginalMember(owner = "client!he", name = "h", descriptor = "(I)V", line = 1902)
    public final synchronized void method1990(int arg0) {
        class74 var2 = (class74) this.field4415.method3830((byte) 126);
        if (arg0 != 1) {
            return;
        }
        while (var2 != null) {
            var2.method594((byte) -5);
            var2 = (class74) this.field4415.method3838((byte) -92);
        }
        field4437++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILjava/lang/String;III)V", line = 1924)
    public static final void method1991(int arg0, String arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 31281) {
            return;
        }
        field4417++;
        class337 var5 = class680.method3758(true, arg4, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field4164 != null) {
            class402 var6 = new class402();
            var6.field5154 = var5;
            var6.field5160 = arg1;
            var6.field5162 = arg3;
            var6.field5153 = var5.field4164;
            class620.method3450(var6);
        }
        if (class470.field5804 != 10 || !client.method1693(var5).method2041(arg3 - 1, 0)) {
            return;
        }
        if (arg3 == 1) {
            class284.field3608++;
            class124 var7 = class336.method1924(class357.field4603, class636.field8620, (byte) -19);
            class346.method1998(arg4, arg0, arg2 - 1100128556, var7, var5.field4252);
            class197.method1156((byte) 104, var7);
        }
        if (arg3 == 2) {
            class115.field1429++;
            class124 var8 = class336.method1924(class190.field2266, class636.field8620, (byte) 113);
            class346.method1998(arg4, arg0, -1100097275, var8, var5.field4252);
            class197.method1156((byte) 121, var8);
        }
        if (arg3 == 3) {
            class691.field9584++;
            class124 var9 = class336.method1924(class272.field3437, class636.field8620, (byte) -64);
            class346.method1998(arg4, arg0, -1100097275, var9, var5.field4252);
            class197.method1156((byte) 104, var9);
        }
        if (arg3 == 4) {
            class200.field2325++;
            class124 var10 = class336.method1924(class180.field2121, class636.field8620, (byte) 90);
            class346.method1998(arg4, arg0, -1100097275, var10, var5.field4252);
            class197.method1156((byte) 124, var10);
        }
        if (arg3 == 5) {
            class424.field5368++;
            class124 var11 = class336.method1924(class475.field5891, class636.field8620, (byte) 111);
            class346.method1998(arg4, arg0, -1100097275, var11, var5.field4252);
            class197.method1156((byte) 105, var11);
        }
        if (arg3 == 6) {
            class286.field3635++;
            class124 var12 = class336.method1924(class62.field769, class636.field8620, (byte) -30);
            class346.method1998(arg4, arg0, -1100097275, var12, var5.field4252);
            class197.method1156((byte) 91, var12);
        }
        if (arg3 == 7) {
            class710.field9912++;
            class124 var13 = class336.method1924(class356.field4593, class636.field8620, (byte) 101);
            class346.method1998(arg4, arg0, -1100097275, var13, var5.field4252);
            class197.method1156((byte) 90, var13);
        }
        if (arg3 == 8) {
            class203.field2358++;
            class124 var14 = class336.method1924(class597.field8007, class636.field8620, (byte) 111);
            class346.method1998(arg4, arg0, -1100097275, var14, var5.field4252);
            class197.method1156((byte) 86, var14);
        }
        if (arg3 == 9) {
            class598.field8026++;
            class124 var15 = class336.method1924(class674.field9207, class636.field8620, (byte) -99);
            class346.method1998(arg4, arg0, -1100097275, var15, var5.field4252);
            class197.method1156((byte) 89, var15);
        }
        if (arg3 == 10) {
            class10.field93++;
            class124 var16 = class336.method1924(class474.field5869, class636.field8620, (byte) 90);
            class346.method1998(arg4, arg0, -1100097275, var16, var5.field4252);
            class197.method1156((byte) 100, var16);
        }
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "(II)V", line = 2064)
    private final void method1992(int arg0, int arg1) {
        field4397++;
        if ((arg1 & this.field4441[arg0]) == 0) {
            return;
        }
        for (class149 var3 = (class149) this.field4446.field5968.method1909(true); var3 != null; var3 = (class149) this.field4446.field5968.method1916((byte) 101)) {
            if (var3.field1793 == arg0 && this.field4388[arg0][var3.field1792] == null && var3.field1775 < 0) {
                var3.field1775 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILfea;Lpfa;Lia;Z)Z", line = 2093)
    public final synchronized boolean method1993(int arg0, class131 arg1, class275 arg2, class551 arg3, boolean arg4) {
        arg3.method2946();
        field4416++;
        if (arg4) {
            return true;
        }
        boolean var6 = true;
        int[] var7 = null;
        if (arg0 > 0) {
            var7 = new int[] { arg0 };
        }
        for (class400 var8 = (class400) arg3.field6910.method3830((byte) -41); var8 != null; var8 = (class400) arg3.field6910.method3838((byte) -92)) {
            int var9 = (int) var8.field3321;
            class74 var10 = (class74) this.field4415.method3828((long) var9, (byte) -91);
            if (var10 == null) {
                var10 = class222.method1270(var9, arg2, -115);
                if (var10 == null) {
                    var6 = false;
                    continue;
                }
                this.field4415.method3832(var10, (long) var9, 119);
            }
            if (!var10.method596(arg1, var8.field5074, var7, 1)) {
                var6 = false;
            }
        }
        if (var6) {
            arg3.method2945();
        }
        return var6;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Ljh;I)I", line = 2149)
    private final int method1994(class149 arg0, int arg1) {
        field4404++;
        int var3 = (arg0.field1790 * arg0.field1783 >> 12) + arg0.field1774;
        if (arg1 > -60) {
            return -22;
        }
        int var4 = ((this.field4395[arg0.field1793] - 8192) * this.field4420[arg0.field1793] >> 12) + var3;
        class309 var5 = arg0.field1772;
        if (var5.field3902 > 0 && (var5.field3892 > 0 || this.field4406[arg0.field1793] > 0)) {
            int var6 = var5.field3892 << 2;
            int var7 = var5.field3900 << 1;
            if (arg0.field1776 < var7) {
                var6 = arg0.field1776 * var6 / var7;
            }
            int var8 = (this.field4406[arg0.field1793] >> 7) + var6;
            double var9 = Math.sin((double) (arg0.field1778 & 0x1FF) * 0.01227184630308513D);
            var4 += (int) ((double) var8 * var9);
        }
        int var11 = (int) ((double) (arg0.field1782.field32 * 256) * Math.pow(2.0D, (double) var4 * 3.255208333333333E-4D) / (double) class278.field3535 + 0.5D);
        return var11 < 1 ? 1 : var11;
    }

    @OriginalMember(owner = "client!he", name = "i", descriptor = "(I)V", line = 2183)
    private final void method1995(int arg0) {
        field4407++;
        int var2 = this.field4447;
        if (arg0 != 1288185542) {
            this.method1960(23, 112, null, 117, null);
        }
        int var3 = this.field4445;
        long var4 = this.field4448;
        if (this.field4450 != null && this.field4452 == var3) {
            this.method1966(this.field4451, this.field4449, this.field4450, (byte) 125);
            this.method1995(1288185542);
            return;
        }
        while (this.field4445 == var3) {
            while (this.field4390.field1755[var2] == var3) {
                this.field4390.method921(var2);
                int var6 = this.field4390.method925(var2);
                if (var6 == 1) {
                    this.field4390.method926();
                    this.field4390.method924(var2);
                    if (this.field4390.method916()) {
                        if (this.field4450 != null) {
                            this.method1985(this.field4450, this.field4449, (byte) -119);
                            this.method1995(1288185542);
                            return;
                        }
                        if (!this.field4449 || var3 == 0) {
                            this.method1978(true, (byte) -63);
                            this.field4390.method922();
                            return;
                        }
                        this.field4390.method913(var4);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method1973(var6, arg0 - 1288162223);
                }
                this.field4390.method920(var2);
                this.field4390.method924(var2);
            }
            var2 = this.field4390.method918();
            var3 = this.field4390.field1755[var2];
            var4 = this.field4390.method923(var3);
        }
        this.field4447 = var2;
        this.field4448 = var4;
        this.field4445 = var3;
        if (this.field4450 != null && this.field4452 < var3) {
            this.field4447 = -1;
            this.field4445 = this.field4452;
            this.field4448 = this.field4390.method923(this.field4445);
        }
    }
}
