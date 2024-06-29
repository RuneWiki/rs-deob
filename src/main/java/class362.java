import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class362 extends class37 {

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "[I")
    private int[] field4953 = new int[16];

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "[I")
    public int[] field4970 = new int[16];

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "[[Lrr;")
    private class242[][] field4956 = new class242[16][128];

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "[I")
    private int[] field4965 = new int[16];

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "[I")
    private int[] field4972 = new int[16];

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
    private int field4968 = 256;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "[I")
    private int[] field4977 = new int[16];

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "[I")
    private int[] field4967 = new int[16];

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "[I")
    public int[] field4991 = new int[16];

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "[I")
    public int[] field4955 = new int[16];

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "[I")
    private int[] field4984 = new int[16];

    @OriginalMember(owner = "client!sf", name = "sb", descriptor = "[I")
    private int[] field5006 = new int[16];

    @OriginalMember(owner = "client!sf", name = "kb", descriptor = "[I")
    private int[] field4998 = new int[16];

    @OriginalMember(owner = "client!sf", name = "xb", descriptor = "[I")
    private int[] field5011 = new int[16];

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "[I")
    private int[] field4988 = new int[16];

    @OriginalMember(owner = "client!sf", name = "hb", descriptor = "[[Lrr;")
    private class242[][] field4995 = new class242[16][128];

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "[I")
    private int[] field4976 = new int[16];

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "[I")
    private int[] field4981 = new int[16];

    @OriginalMember(owner = "client!sf", name = "rb", descriptor = "I")
    private int field5005 = 1000000;

    @OriginalMember(owner = "client!sf", name = "nb", descriptor = "[I")
    private int[] field5001 = new int[16];

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "Lbl;")
    private class459 field4975 = new class459();

    @OriginalMember(owner = "client!sf", name = "Ib", descriptor = "Lpf;")
    private class411 field5022 = new class411(this);

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "Lbj;")
    private class159 field4992 = new class159(128);

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
    public static int field4979 = -1;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!sf", name = "ib", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!sf", name = "jb", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!sf", name = "lb", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!sf", name = "mb", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!sf", name = "ob", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!sf", name = "pb", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!sf", name = "qb", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!sf", name = "tb", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!sf", name = "ub", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!sf", name = "vb", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!sf", name = "wb", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!sf", name = "yb", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!sf", name = "zb", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!sf", name = "Ab", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!sf", name = "Bb", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!sf", name = "Cb", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!sf", name = "Db", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!sf", name = "Eb", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!sf", name = "Fb", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!sf", name = "Gb", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!sf", name = "Kb", descriptor = "I")
    private int field5024;

    @OriginalMember(owner = "client!sf", name = "Lb", descriptor = "I")
    private int field5025;

    @OriginalMember(owner = "client!sf", name = "Ob", descriptor = "I")
    private int field5028;

    @OriginalMember(owner = "client!sf", name = "Jb", descriptor = "J")
    private long field5023;

    @OriginalMember(owner = "client!sf", name = "Mb", descriptor = "J")
    private long field5026;

    @OriginalMember(owner = "client!sf", name = "Nb", descriptor = "Ltv;")
    private class392 field5027;

    @OriginalMember(owner = "client!sf", name = "Hb", descriptor = "Z")
    private boolean field5021;

    @OriginalMember(owner = "client!sf", name = "Pb", descriptor = "Z")
    private boolean field5029;

    static {
        new class83("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BIII)V", line = 6)
    public static final void method2006(byte arg0, int arg1, int arg2, int arg3) {
        field4958++;
        String var4 = "tele " + arg3 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var4);
        class109.method701(-3, true, var4);
        if (arg0 != -74) {
            field5019 = -117;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILrr;[II)Z", line = 20)
    public final boolean method2007(int arg0, int arg1, class242 arg2, int[] arg3, int arg4) {
        arg2.field3360 = class12.field141 / 100;
        field4982++;
        if (arg2.field3353 >= 0 && arg2.field3349 == null || arg2.field3349.method1609()) {
            arg2.method1430(arg0 ^ 0x4B);
            arg2.method2946(arg0 - 95);
            if (arg2.field3367 > 0 && this.field4995[arg2.field3348][arg2.field3367] == arg2) {
                this.field4995[arg2.field3348][arg2.field3367] = null;
            }
            return true;
        }
        int var6 = arg2.field3364;
        if (var6 > 0) {
            int var7 = var6 - (int) (Math.pow(2.0D, (double) this.field4988[arg2.field3348] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var7 < 0) {
                var7 = 0;
            }
            arg2.field3364 = var7;
        }
        arg2.field3349.method1579(this.method2034(-1, arg2));
        class116 var8 = arg2.field3347;
        arg2.field3354++;
        boolean var9 = false;
        arg2.field3345 += var8.field1562;
        double var10 = (double) ((arg2.field3359 - 60 << 8) + (arg2.field3364 * arg2.field3355 >> 12)) * 5.086263020833333E-6D;
        if (var8.field1568 > 0) {
            if (var8.field1571 <= 0) {
                arg2.field3370 += 128;
            } else {
                arg2.field3370 += (int) (Math.pow(2.0D, (double) var8.field1571 * var10) * 128.0D + 0.5D);
            }
            if ((arg2.field3370 * var8.field1568) >= 819200) {
                var9 = true;
            }
        }
        if (var8.field1563 != null) {
            if (var8.field1565 <= 0) {
                arg2.field3366 += 128;
            } else {
                arg2.field3366 += (int) (Math.pow(2.0D, (double) var8.field1565 * var10) * 128.0D + 0.5D);
            }
            while (arg2.field3362 < (var8.field1563.length - 2) && (var8.field1563[arg2.field3362 + 2] & 0xFF << 8) < arg2.field3366) {
                arg2.field3362 += 2;
            }
            if ((var8.field1563.length - 2) == arg2.field3362 && var8.field1563[arg2.field3362 + 1] == 0) {
                var9 = true;
            }
        }
        if (arg2.field3353 >= arg0 && var8.field1570 != null && (this.field4970[arg2.field3348] & 0x1) == 0 && (arg2.field3367 < 0 || this.field4995[arg2.field3348][arg2.field3367] != arg2)) {
            if (var8.field1572 > 0) {
                arg2.field3353 += (int) (Math.pow(2.0D, (double) var8.field1572 * var10) * 128.0D + 0.5D);
            } else {
                arg2.field3353 += 128;
            }
            while (arg2.field3352 < (var8.field1570.length - 2) && ((var8.field1570[arg2.field3352 + 2] & 0xFF) << 8) < arg2.field3353) {
                arg2.field3352 += 2;
            }
            if (var8.field1570.length - 2 == arg2.field3352) {
                var9 = true;
            }
        }
        if (!var9) {
            arg2.field3349.method1610(arg2.field3360, this.method2042(arg2, -126), this.method2021((byte) 62, arg2));
            return false;
        }
        arg2.field3349.method1580(arg2.field3360);
        if (arg3 == null) {
            arg2.field3349.method239(arg4);
        } else {
            arg2.field3349.method240(arg3, arg1, arg4);
        }
        if (arg2.field3349.method1586()) {
            this.field5022.field6024.method939(arg2.field3349);
        }
        arg2.method1430(115);
        if (arg2.field3353 >= 0) {
            arg2.method2946(-126);
            if (arg2.field3367 > 0 && this.field4995[arg2.field3348][arg2.field3367] == arg2) {
                this.field4995[arg2.field3348][arg2.field3367] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIB)V", line = 140)
    private final void method2008(int arg0, int arg1, int arg2, byte arg3) {
        field5000++;
        this.method2014(arg2, arg3 ^ 0x14, arg1, 64);
        if ((this.field4970[arg1] & 0x2) != 0) {
            for (class242 var5 = (class242) this.field5022.field6011.method3077((byte) -77); var5 != null; var5 = (class242) this.field5022.field6011.method3075((byte) 109)) {
                if (var5.field3348 == arg1 && var5.field3353 < 0) {
                    this.field4956[arg1][var5.field3359] = null;
                    this.field4956[arg1][arg2] = var5;
                    int var6 = (var5.field3364 * var5.field3355 >> 12) + var5.field3358;
                    var5.field3358 += arg2 - var5.field3359 << 8;
                    var5.field3355 = var6 - var5.field3358;
                    var5.field3359 = arg2;
                    var5.field3364 = 4096;
                    return;
                }
            }
        }
        class105 var7 = (class105) this.field4992.method979((byte) 28, (long) this.field4972[arg1]);
        if (var7 == null) {
            return;
        }
        class286 var8 = var7.field1423[arg2];
        if (var8 == null) {
            return;
        }
        class242 var9 = new class242();
        if (arg3 != -21) {
            this.method2020((byte) 124);
        }
        var9.field3361 = var8;
        var9.field3348 = arg1;
        var9.field3346 = var7;
        var9.field3347 = var7.field1428[arg2];
        var9.field3367 = var7.field1422[arg2];
        var9.field3359 = arg2;
        var9.field3344 = var7.field1419[arg2] * arg0 * var7.field1425 * arg0 + 1024 >> 11;
        var9.field3350 = var7.field1420[arg2] & 0xFF;
        var9.field3358 = (arg2 << 8) - (var7.field1424[arg2] & 0x7FFF);
        var9.field3366 = 0;
        var9.field3362 = 0;
        var9.field3353 = -1;
        var9.field3370 = 0;
        var9.field3352 = 0;
        if (this.field4955[arg1] == 0) {
            var9.field3349 = class280.method1603(var8, this.method2034(arg3 ^ 0x14, var9), this.method2042(var9, 125), this.method2021((byte) 62, var9));
        } else {
            var9.field3349 = class280.method1603(var8, this.method2034(-1, var9), 0, this.method2021((byte) 62, var9));
            this.method2030(109, var7.field1424[arg2] < 0, var9);
        }
        if (var7.field1424[arg2] < 0) {
            var9.field3349.method1575(-1);
        }
        if (var9.field3367 >= 0) {
            class242 var10 = this.field4995[arg1][var9.field3367];
            if (var10 != null && var10.field3353 < 0) {
                this.field4956[arg1][var10.field3359] = null;
                var10.field3353 = 0;
            }
            this.field4995[arg1][var9.field3367] = var9;
        }
        this.field5022.field6011.method3070(var9, (byte) -125);
        this.field4956[arg1][arg2] = var9;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V", line = 238)
    private final void method2009(int arg0, int arg1) {
        if (~(this.field4970[arg0] & 0x4) != arg1) {
            for (class242 var3 = (class242) this.field5022.field6011.method3072((byte) 29); var3 != null; var3 = (class242) this.field5022.field6011.method3066(arg1 ^ 0xFFFFFFFD)) {
                if (var3.field3348 == arg0) {
                    var3.field3357 = 0;
                }
            }
        }
        field4974++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)Z", line = 263)
    public final synchronized boolean method2010(boolean arg0) {
        field5015++;
        return arg0 ? this.field4975.method2702() : false;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)V", line = 278)
    private final void method2011(int arg0, int arg1) {
        int var3 = -108 / ((18 - arg1) / 55);
        field4987++;
        if (arg0 < 0) {
            for (int var4 = 0; var4 < 16; var4++) {
                this.method2011(var4, 101);
            }
            return;
        }
        this.field4998[arg0] = 12800;
        this.field4965[arg0] = 8192;
        this.field5001[arg0] = 16383;
        this.field4953[arg0] = 8192;
        this.field4967[arg0] = 0;
        this.field4988[arg0] = 8192;
        this.method2033(arg0, (byte) 121);
        this.method2009(arg0, -1);
        this.field4970[arg0] = 0;
        this.field4976[arg0] = 32767;
        this.field5011[arg0] = 256;
        this.field4955[arg0] = 0;
        this.method2041(-107, 8192, arg0);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BZ)V", line = 312)
    private final synchronized void method2012(byte arg0, boolean arg1) {
        this.field4975.method2703();
        field5007++;
        this.field5027 = null;
        if (arg0 >= -64) {
            this.field4984 = null;
        }
        this.method2018(arg1, -97);
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(II)V", line = 325)
    private final void method2013(int arg0, int arg1) {
        field4993++;
        if (arg1 > -64) {
            return;
        }
        for (class242 var3 = (class242) this.field5022.field6011.method3072((byte) 126); var3 != null; var3 = (class242) this.field5022.field6011.method3066(2)) {
            if ((arg0 < 0 || var3.field3348 == arg0) && var3.field3353 < 0) {
                this.field4956[var3.field3348][var3.field3359] = null;
                var3.field3353 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIII)V", line = 353)
    private final void method2014(int arg0, int arg1, int arg2, int arg3) {
        field4999++;
        class242 var5 = this.field4956[arg2][arg0];
        if (var5 == null) {
            return;
        }
        this.field4956[arg2][arg0] = null;
        if (~(this.field4970[arg2] & 0x2) == arg1) {
            var5.field3353 = 0;
            return;
        }
        for (class242 var6 = (class242) this.field5022.field6011.method3072((byte) 121); var6 != null; var6 = (class242) this.field5022.field6011.method3066(arg1 + 3)) {
            if (var5.field3348 == var6.field3348 && var6.field3353 < 0 && var5 != var6) {
                var5.field3353 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "()Ldm;", line = 390)
    public final synchronized class37 method242() {
        field4985++;
        return this.field5022;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)V", line = 407)
    private final void method2015(byte arg0, int arg1, int arg2) {
        int var4 = -38 % ((-arg0 - 58) / 45);
        field4964++;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V", line = 1675)
    public class362() {
        this.method2027(256, 8949, -1);
        this.method2018(true, -122);
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "()Ldm;", line = 420)
    public final synchronized class37 method244() {
        field4966++;
        return null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZLtv;)V", line = 432)
    public final synchronized void method2016(int arg0, boolean arg1, class392 arg2) {
        this.method2039(true, arg1, 0, arg2);
        field4994++;
        if (arg0 != 16256) {
            this.field5023 = 126L;
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V", line = 444)
    public final synchronized void method2017(int arg0) {
        field5009++;
        class105 var2 = (class105) this.field4992.method981(0);
        if (arg0 == 255) {
            while (var2 != null) {
                var2.method2946(arg0 - 363);
                var2 = (class105) this.field4992.method989(arg0 ^ 0xFF);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 463)
    public final synchronized void method239(int arg0) {
        field5004++;
        if (this.field4975.method2702()) {
            int var2 = this.field4975.field6696 * this.field5005 / class12.field141;
            do {
                long var3 = this.field5026 + ((long) arg0 * (long) var2);
                if (this.field5023 - var3 >= 0L) {
                    this.field5026 = var3;
                    break;
                }
                int var5 = (int) (((long) var2 + this.field5023 - this.field5026 - 1L) / (long) var2);
                this.field5026 += (long) var2 * (long) var5;
                this.field5022.method239(var5);
                arg0 -= var5;
                this.method2020((byte) 121);
            } while (this.field4975.method2702());
        }
        this.field5022.method239(arg0);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)V", line = 509)
    private final void method2018(boolean arg0, int arg1) {
        if (arg0) {
            this.method2038(-1, -5);
        } else {
            this.method2013(-1, -108);
        }
        field5010++;
        this.method2011(-1, -59);
        int var3 = -95 % ((-arg1 - 19) / 55);
        for (int var4 = 0; var4 < 16; var4++) {
            this.field4972[var4] = this.field4977[var4];
        }
        for (int var5 = 0; var5 < 16; var5++) {
            this.field4981[var5] = class118.method750(this.field4977[var5], -128);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLss;)Z", line = 538)
    public static final boolean method2019(boolean arg0, class295 arg1) {
        field4960++;
        if (!arg0) {
            field4979 = 35;
        }
        if (class163.field2331 == arg1.field3995) {
            class471.field6890 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V", line = 559)
    private final void method2020(byte arg0) {
        field4969++;
        int var2 = this.field5025;
        int var3 = this.field5024;
        long var4 = this.field5023;
        if (this.field5027 != null && this.field5028 == var3) {
            this.method2039(this.field5029, this.field5021, 0, this.field5027);
            this.method2020((byte) 121);
            return;
        }
        while (this.field5024 == var3) {
            while (this.field4975.field6693[var2] == var3) {
                this.field4975.method2696(var2);
                int var6 = this.field4975.method2704(var2);
                if (var6 == 1) {
                    this.field4975.method2698();
                    this.field4975.method2711(var2);
                    if (this.field4975.method2701()) {
                        if (this.field5027 != null) {
                            this.method2016(16256, this.field5021, this.field5027);
                            this.method2020((byte) 121);
                            return;
                        }
                        if (!this.field5021 || var3 == 0) {
                            this.method2018(true, 48);
                            this.field4975.method2703();
                            return;
                        }
                        this.field4975.method2700(var4);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method2032(1, var6);
                }
                this.field4975.method2699(var2);
                this.field4975.method2711(var2);
            }
            var2 = this.field4975.method2705();
            var3 = this.field4975.field6693[var2];
            var4 = this.field4975.method2707(var3);
        }
        this.field5025 = var2;
        this.field5023 = var4;
        this.field5024 = var3;
        if (this.field5027 != null && var3 > this.field5028) {
            this.field5024 = this.field5028;
            this.field5025 = -1;
            this.field5023 = this.field4975.method2707(this.field5024);
        }
        if (arg0 != 121) {
            this.field4967 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLrr;)I", line = 640)
    private final int method2021(byte arg0, class242 arg1) {
        field4989++;
        if (arg0 == 62) {
            int var3 = this.field4965[arg1.field3348];
            return var3 >= 8192 ? 16384 - ((16384 - var3) * (128 - arg1.field3350) + 32 >> 6) : arg1.field3350 * var3 - -32 >> 6;
        } else {
            return -7;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V", line = 657)
    private final void method2022(int arg0, int arg1, int arg2) {
        field5018++;
        this.field4977[arg2] = arg1;
        this.field4981[arg2] = class118.method750(-128, arg1);
        this.method2029(128, arg1, arg2);
        if (arg0 != -23366) {
            this.field4955 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lrr;B)Z", line = 681)
    public final boolean method2023(class242 arg0, byte arg1) {
        field4996++;
        if (arg0.field3349 != null) {
            if (arg1 != -114) {
                this.field4955 = null;
            }
            return false;
        }
        if (arg0.field3353 >= 0) {
            arg0.method2946(-117);
            if (arg0.field3367 > 0 && this.field4995[arg0.field3348][arg0.field3367] == arg0) {
                this.field4995[arg0.field3348][arg0.field3367] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(IIII)V", line = 711)
    private final void method2024(int arg0, int arg1, int arg2, int arg3) {
        field5014++;
        int var5 = -116 / ((-arg3 - 56) / 33);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)V", line = 720)
    public final synchronized void method2025(int arg0, byte arg1) {
        if (arg1 > -109) {
            this.field5021 = true;
        }
        this.field4968 = arg0;
        field5008++;
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V", line = 731)
    public static final void method2026(int arg0) {
        field4963++;
        if (arg0 != -2757) {
            field4979 = -33;
        }
        if (class476.field6960 != null) {
            class476.field6960.method1994((byte) -123);
        }
        if (class254.field3531 != null) {
            class254.field3531.method1994((byte) 67);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(III)V", line = 754)
    private final synchronized void method2027(int arg0, int arg1, int arg2) {
        if (arg2 >= 0) {
            this.field5006[arg2] = arg0;
        } else {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field5006[var4] = arg0;
            }
        }
        field4957++;
        if (arg1 != 8949) {
            this.field4975 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)I", line = 780)
    public final int method2028(boolean arg0) {
        field5013++;
        return arg0 ? this.field4968 : 115;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(III)V", line = 791)
    private final void method2029(int arg0, int arg1, int arg2) {
        if (this.field4972[arg2] != arg1) {
            this.field4972[arg2] = arg1;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field4995[arg2][var4] = null;
            }
        }
        field4986++;
        if (arg0 != 128) {
            this.field4953 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZLrr;)V", line = 821)
    public final void method2030(int arg0, boolean arg1, class242 arg2) {
        field4954++;
        if (arg0 <= 106) {
            this.method2021((byte) -112, null);
        }
        int var4 = arg2.field3361.field3842.length;
        int var6;
        if (arg1 && arg2.field3361.field3840) {
            int var5 = var4 + var4 - arg2.field3361.field3839;
            var6 = (int) ((long) this.field4955[arg2.field3348] * (long) var5 >> 6);
            int var7 = var4 << 8;
            if (var7 <= var6) {
                arg2.field3349.method1601(true);
                var6 = var7 + var7 - var6 - 1;
            }
        } else {
            var6 = (int) ((long) this.field4955[arg2.field3348] * (long) var4 >> 6);
        }
        arg2.field3349.method1582(var6);
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(III)V", line = 854)
    public final synchronized void method2031(int arg0, int arg1, int arg2) {
        field4971++;
        if (arg1 > -5) {
            this.field4981 = null;
        }
        this.method2022(-23366, arg2, arg0);
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(II)V", line = 866)
    private final void method2032(int arg0, int arg1) {
        field4962++;
        int var3 = arg1 & 0xF0;
        if (var3 == 128) {
            int var4 = arg1 & 0xF;
            int var5 = arg1 >> 8 & 0x7F;
            int var6 = arg1 >> 16 & 0x7F;
            this.method2014(var5, -1, var4, var6);
        } else if (var3 == 144) {
            int var7 = arg1 & 0xF;
            int var8 = (arg1 & 0x7F85) >> 8;
            int var9 = arg1 >> 16 & 0x7F;
            if (var9 <= 0) {
                this.method2014(var8, arg0 - 2, var7, 64);
            } else {
                this.method2008(var9, var7, var8, (byte) -21);
            }
        } else if (var3 == 160) {
            int var10 = arg1 & 0xF;
            int var11 = (arg1 & 0x7F0D) >> 8;
            int var12 = arg1 >> 16 & 0x7F;
            this.method2024(var10, var11, var12, arg0 ^ 0xFFFFFF9E);
        } else if (var3 == 176) {
            int var13 = arg1 & 0xF;
            int var14 = (arg1 & 0x7F7D) >> 8;
            int var15 = arg1 >> 16 & 0x7F;
            if (var14 == 0) {
                this.field4981[var13] = (var15 << 14) + class118.method750(-2080769, this.field4981[var13]);
            }
            if (var14 == 32) {
                this.field4981[var13] = class118.method750(this.field4981[var13], -16257) + (var15 << 7);
            }
            if (var14 == 1) {
                this.field4967[var13] = (var15 << 7) + class118.method750(this.field4967[var13], -16257);
            }
            if (var14 == 33) {
                this.field4967[var13] = var15 + class118.method750(this.field4967[var13], -128);
            }
            if (var14 == 5) {
                this.field4988[var13] = (var15 << 7) + class118.method750(this.field4988[var13], -16257);
            }
            if (var14 == 37) {
                this.field4988[var13] = var15 + class118.method750(this.field4988[var13], -128);
            }
            if (var14 == 7) {
                this.field4998[var13] = class118.method750(this.field4998[var13], -16257) + (var15 << 7);
            }
            if (var14 == 39) {
                this.field4998[var13] = var15 + class118.method750(-128, this.field4998[var13]);
            }
            if (var14 == 10) {
                this.field4965[var13] = (var15 << 7) + class118.method750(-16257, this.field4965[var13]);
            }
            if (var14 == 42) {
                this.field4965[var13] = var15 + class118.method750(this.field4965[var13], -128);
            }
            if (var14 == 11) {
                this.field5001[var13] = (var15 << 7) + class118.method750(this.field5001[var13], -16257);
            }
            if (var14 == 43) {
                this.field5001[var13] = var15 + class118.method750(-128, this.field5001[var13]);
            }
            if (var14 == 64) {
                if (var15 < 64) {
                    this.field4970[var13] = class118.method750(this.field4970[var13], -2);
                } else {
                    this.field4970[var13] = class25.method183(this.field4970[var13], 1);
                }
            }
            if (var14 == 65) {
                if (var15 < 64) {
                    this.method2033(var13, (byte) 114);
                    this.field4970[var13] = class118.method750(this.field4970[var13], -3);
                } else {
                    this.field4970[var13] = class25.method183(this.field4970[var13], 2);
                }
            }
            if (var14 == 99) {
                this.field4976[var13] = class118.method750(this.field4976[var13], 127) + (var15 << 7);
            }
            if (var14 == 98) {
                this.field4976[var13] = class118.method750(16256, this.field4976[var13]) + var15;
            }
            if (var14 == 101) {
                this.field4976[var13] = (var15 << 7) + class118.method750(127, this.field4976[var13]) + 16384;
            }
            if (var14 == 100) {
                this.field4976[var13] = class118.method750(this.field4976[var13], 16256) + var15 + 16384;
            }
            if (var14 == 120) {
                this.method2038(var13, -5);
            }
            if (var14 == 121) {
                this.method2011(var13, -48);
            }
            if (var14 == 123) {
                this.method2013(var13, -109);
            }
            if (var14 == 6) {
                int var16 = this.field4976[var13];
                if (var16 == 16384) {
                    this.field5011[var13] = (var15 << 7) + class118.method750(-16257, this.field5011[var13]);
                }
            }
            if (var14 == 38) {
                int var17 = this.field4976[var13];
                if (var17 == 16384) {
                    this.field5011[var13] = class118.method750(-128, this.field5011[var13]) + var15;
                }
            }
            if (var14 == 16) {
                this.field4955[var13] = (var15 << 7) + class118.method750(-16257, this.field4955[var13]);
            }
            if (var14 == 48) {
                this.field4955[var13] = var15 + class118.method750(this.field4955[var13], -128);
            }
            if (var14 == 81) {
                if (var15 < 64) {
                    this.method2009(var13, -1);
                    this.field4970[var13] = class118.method750(this.field4970[var13], -5);
                } else {
                    this.field4970[var13] = class25.method183(this.field4970[var13], 4);
                }
            }
            if (var14 == 17) {
                this.method2041(-92, (var15 << 7) + (this.field4984[var13] & -16257), var13);
            }
            if (var14 == 49) {
                this.method2041(-67, (-128 & this.field4984[var13]) + var15, var13);
            }
        } else if (var3 == 192) {
            int var18 = arg1 & 0xF;
            int var19 = arg1 >> 8 & 0x7F;
            this.method2029(128, this.field4981[var18] + var19, var18);
        } else if (var3 == 208) {
            int var20 = arg1 & 0xF;
            int var21 = (arg1 & 0x7FD7) >> 8;
            this.method2015((byte) -103, var21, var20);
        } else {
            if (arg0 != 1) {
                this.field4965 = null;
            }
            if (var3 == 224) {
                int var22 = arg1 & 0xF;
                int var23 = ((arg1 & 0x7F0018) >> 9) + ((arg1 & 0x7F5E) >> 8);
                this.method2040(var22, var23, arg0 ^ 0x5CFA);
            } else {
                int var24 = arg1 & 0xFF;
                if (var24 == 255) {
                    this.method2018(true, 40);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(IB)V", line = 1104)
    private final void method2033(int arg0, byte arg1) {
        if ((this.field4970[arg0] & 0x2) != 0) {
            for (class242 var3 = (class242) this.field5022.field6011.method3072((byte) 75); var3 != null; var3 = (class242) this.field5022.field6011.method3066(2)) {
                if (var3.field3348 == arg0 && this.field4956[arg0][var3.field3359] == null && var3.field3353 < 0) {
                    var3.field3353 = 0;
                }
            }
        }
        if (arg1 < 112) {
            this.method2023(null, (byte) 86);
        }
        field5016++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILrr;)I", line = 1138)
    private final int method2034(int arg0, class242 arg1) {
        field4990++;
        if (arg0 != -1) {
            this.field5001 = null;
        }
        int var3 = arg1.field3358 + (arg1.field3364 * arg1.field3355 >> 12);
        int var4 = ((this.field4953[arg1.field3348] - 8192) * this.field5011[arg1.field3348] >> 12) + var3;
        class116 var5 = arg1.field3347;
        if (var5.field1562 > 0 && (var5.field1566 > 0 || this.field4967[arg1.field3348] > 0)) {
            int var6 = var5.field1566 << 2;
            int var7 = var5.field1567 << 1;
            if (var7 > arg1.field3354) {
                var6 = arg1.field3354 * var6 / var7;
            }
            int var8 = (this.field4967[arg1.field3348] >> 7) + var6;
            double var9 = Math.sin((double) (arg1.field3345 & 0x1FF) * 0.01227184630308513D);
            var4 += (int) ((double) var8 * var9);
        }
        int var11 = (int) ((double) (arg1.field3361.field3841 * 256) * Math.pow(2.0D, (double) var4 * 3.255208333333333E-4D) / (double) class12.field141 + 0.5D);
        return var11 >= 1 ? var11 : 1;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(Z)V", line = 1178)
    public final synchronized void method2035(boolean arg0) {
        if (!arg0) {
            this.method2012((byte) -78, true);
            field4978++;
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V", line = 1190)
    public final synchronized void method2036(byte arg0) {
        field5017++;
        if (arg0 == -57) {
            for (class105 var2 = (class105) this.field4992.method981(0); var2 != null; var2 = (class105) this.field4992.method989(0)) {
                var2.method685(2);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V", line = 1209)
    public static final void method2037(byte arg0) {
        field5012++;
        if (class190.field2644 == 0) {
            return;
        }
        try {
            if (++class238.field3276 > 1500) {
                if (class117.field1578 != null) {
                    class117.field1578.method644(-93);
                    class117.field1578 = null;
                }
                if (class420.field6144 >= 1) {
                    class190.field2644 = 0;
                    class320.field4424 = -5;
                    return;
                }
                if (class414.field6081 == class321.field4432) {
                    class414.field6081 = class109.field1503;
                } else {
                    class414.field6081 = class321.field4432;
                }
                class238.field3276 = 0;
                class190.field2644 = 1;
                class420.field6144++;
            }
            int var1 = 117 % ((-arg0 - 43) / 50);
            if (class190.field2644 == 1) {
                class456.field6668 = class282.field3804.method2281(true, class414.field6081, class36.field503);
                class190.field2644 = 2;
            }
            if (class190.field2644 == 2) {
                if (class456.field6668.field5652 == 2) {
                    throw new IOException();
                }
                if (class456.field6668.field5652 != 1) {
                    return;
                }
                class117.field1578 = new class95((Socket) class456.field6668.field5654, class282.field3804);
                class456.field6668 = null;
                class117.field1578.method643(class244.field3395.field5073, class244.field3395.field5069, -1, 0);
                method2026(-2757);
                int var2 = class117.field1578.method650((byte) -94);
                method2026(-2757);
                if (var2 != 101) {
                    class190.field2644 = 0;
                    class320.field4424 = var2;
                    class117.field1578.method644(-96);
                    class117.field1578 = null;
                    return;
                }
                class190.field2644 = 3;
            }
            if (class190.field2644 == 3 && class117.field1578.method645((byte) -70) >= 2) {
                int var3 = class117.field1578.method650((byte) -23) << 8 | class117.field1578.method650((byte) -74);
                class170.method1049(16816, var3);
                if (class223.field3140 == -1) {
                    class320.field4424 = 6;
                    class190.field2644 = 0;
                    class117.field1578.method644(-103);
                    class117.field1578 = null;
                } else {
                    class190.field2644 = 0;
                    class117.field1578.method644(-121);
                    class117.field1578 = null;
                    class339.method1883((byte) -59);
                }
            }
        } catch (IOException var4) {
            if (class117.field1578 != null) {
                class117.field1578.method644(-98);
                class117.field1578 = null;
            }
            if (class420.field6144 >= 1) {
                class190.field2644 = 0;
                class320.field4424 = -4;
            } else {
                class238.field3276 = 0;
                class420.field6144++;
                if (class414.field6081 == class321.field4432) {
                    class414.field6081 = class109.field1503;
                } else {
                    class414.field6081 = class321.field4432;
                }
                class190.field2644 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(II)V", line = 1353)
    private final void method2038(int arg0, int arg1) {
        if (arg1 != -5) {
            this.method2029(56, -8, -7);
        }
        for (class242 var3 = (class242) this.field5022.field6011.method3072((byte) 43); var3 != null; var3 = (class242) this.field5022.field6011.method3066(arg1 ^ 0xFFFFFFF9)) {
            if (arg0 < 0 || var3.field3348 == arg0) {
                if (var3.field3349 != null) {
                    var3.field3349.method1580(class12.field141 / 100);
                    if (var3.field3349.method1586()) {
                        this.field5022.field6024.method939(var3.field3349);
                    }
                    var3.method1430(98);
                }
                if (var3.field3353 < 0) {
                    this.field4956[var3.field3348][var3.field3359] = null;
                }
                var3.method2946(-93);
            }
        }
        field4983++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZZILtv;)V", line = 1398)
    private final synchronized void method2039(boolean arg0, boolean arg1, int arg2, class392 arg3) {
        field5003++;
        this.method2012((byte) -121, arg0);
        this.field4975.method2710(arg3.field5475);
        this.field5026 = 0L;
        this.field5021 = arg1;
        int var5 = this.field4975.method2709();
        for (int var6 = arg2; var6 < var5; var6++) {
            this.field4975.method2696(var6);
            this.field4975.method2699(var6);
            this.field4975.method2711(var6);
        }
        this.field5025 = this.field4975.method2705();
        this.field5024 = this.field4975.field6693[this.field5025];
        this.field5023 = this.field4975.method2707(this.field5024);
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(III)V", line = 1427)
    private final void method2040(int arg0, int arg1, int arg2) {
        if (arg2 != 23803) {
            this.method2023(null, (byte) 18);
        }
        this.field4953[arg0] = arg1;
        field5002++;
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(III)V", line = 1438)
    private final void method2041(int arg0, int arg1, int arg2) {
        field4961++;
        this.field4984[arg2] = arg1;
        this.field4991[arg2] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
        if (arg0 >= -61) {
            this.field4975 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([III)V", line = 1451)
    public final synchronized void method240(int[] arg0, int arg1, int arg2) {
        if (this.field4975.method2702()) {
            int var4 = this.field4975.field6696 * this.field5005 / class12.field141;
            do {
                long var5 = this.field5026 + ((long) arg2 * (long) var4);
                if (this.field5023 - var5 >= 0L) {
                    this.field5026 = var5;
                    break;
                }
                int var7 = (int) (((long) var4 + this.field5023 - this.field5026 - 1L) / (long) var4);
                this.field5026 += (long) var4 * (long) var7;
                this.field5022.method240(arg0, arg1, var7);
                arg2 -= var7;
                arg1 += var7;
                this.method2020((byte) 121);
            } while (this.field4975.method2702());
        }
        field4980++;
        this.field5022.method240(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()I", line = 1489)
    public final synchronized int method238() {
        field4973++;
        return 0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lrr;I)I", line = 1518)
    private final int method2042(class242 arg0, int arg1) {
        field4997++;
        if (this.field5006[arg0.field3348] == 0) {
            return 0;
        }
        int var3 = 57 / ((arg1 - 21) / 51);
        class116 var4 = arg0.field3347;
        int var5 = this.field5001[arg0.field3348] * this.field4998[arg0.field3348] + 4096 >> 13;
        int var6 = var5 * var5 + 16384 >> 15;
        int var7 = arg0.field3344 * var6 + 16384 >> 15;
        int var8 = this.field4968 * var7 + 128 >> 8;
        int var9 = this.field5006[arg0.field3348] * var8 + 128 >> 8;
        if (var4.field1568 > 0) {
            var9 = (int) (Math.pow(0.5D, (double) arg0.field3370 * 1.953125E-5D * (double) var4.field1568) * (double) var9 + 0.5D);
        }
        if (var4.field1563 != null) {
            int var10 = arg0.field3366;
            int var11 = var4.field1563[arg0.field3362 + 1];
            if (arg0.field3362 < (var4.field1563.length - 2)) {
                int var12 = (var4.field1563[arg0.field3362] & 0xFF) << 8;
                int var13 = (var4.field1563[arg0.field3362 + 2] & 0xFF) << 8;
                var11 += (var4.field1563[arg0.field3362 + 3] - var11) * (var10 - var12) / (var13 - var12);
            }
            var9 = var9 * var11 + 32 >> 6;
        }
        if (arg0.field3353 > 0 && var4.field1570 != null) {
            int var14 = arg0.field3353;
            int var15 = var4.field1570[arg0.field3352 + 1];
            if (var4.field1570.length - 2 > arg0.field3352) {
                int var16 = (var4.field1570[arg0.field3352] & 0xFF) << 8;
                int var17 = var4.field1570[arg0.field3352 + 2] & 0xFF << 8;
                var15 += (var4.field1570[arg0.field3352 + 3] - var15) * (var14 - var16) / (var17 - var16);
            }
            var9 = var9 * var15 + 32 >> 6;
        }
        return var9;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BILtm;Ltv;Lvh;)Z", line = 1615)
    public final synchronized boolean method2043(byte arg0, int arg1, class264 arg2, class392 arg3, class240 arg4) {
        arg3.method2245();
        field4959++;
        int var6 = -122 / ((arg0 + 84) / 37);
        boolean var7 = true;
        int[] var8 = null;
        if (arg1 > 0) {
            var8 = new int[] { arg1 };
        }
        for (class294 var9 = (class294) arg3.field5476.method981(0); var9 != null; var9 = (class294) arg3.field5476.method989(0)) {
            int var10 = (int) var9.field7342;
            class105 var11 = (class105) this.field4992.method979((byte) 28, (long) var10);
            if (var11 == null) {
                var11 = class102.method676(-17, var10, arg4);
                if (var11 == null) {
                    var7 = false;
                    continue;
                }
                this.field4992.method990((long) var10, (byte) 105, var11);
            }
            if (!var11.method684(var8, var9.field3919, arg2, 1019323106)) {
                var7 = false;
            }
        }
        if (var7) {
            arg3.method2246();
        }
        return var7;
    }
}
