import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class87 extends class297 {

    @OriginalMember(owner = "client!vl", name = "N", descriptor = "I")
    private int field1396 = 0;

    @OriginalMember(owner = "client!vl", name = "X", descriptor = "I")
    private int field1406 = 0;

    @OriginalMember(owner = "client!vl", name = "ab", descriptor = "I")
    private int field1409 = 0;

    @OriginalMember(owner = "client!vl", name = "K", descriptor = "[I")
    public static int[] field1393 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!vl", name = "T", descriptor = "[I")
    public static int[] field1402 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!vl", name = "M", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!vl", name = "O", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "client!vl", name = "P", descriptor = "I")
    private int field1398;

    @OriginalMember(owner = "client!vl", name = "Q", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!vl", name = "R", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!vl", name = "S", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!vl", name = "U", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!vl", name = "V", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!vl", name = "W", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client!vl", name = "Y", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!vl", name = "Z", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client!vl", name = "bb", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!vl", name = "cb", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IB)[[I", line = 10)
    public final int[][] method172(int arg0, byte arg1) {
        field1394++;
        if (arg1 != 63) {
            this.method687(-40, 30, 35, 13);
        }
        int[][] var3 = this.field4767.method1141(-1677, arg0);
        if (this.field4767.field2480) {
            int[][] var4 = this.method2105(arg0, 2, 0);
            int[] var5 = var4[1];
            int[] var6 = var3[0];
            int[] var7 = var4[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var4[2];
            for (int var11 = 0; var11 < class31.field491; var11++) {
                this.method690(var10[var11], var7[var11], var5[var11], 4976);
                this.field1405 += this.field1406;
                this.field1397 += this.field1409;
                this.field1408 += this.field1396;
                if (this.field1405 < 0) {
                    this.field1405 = 0;
                }
                while (this.field1408 < 0) {
                    this.field1408 += 4096;
                }
                if (this.field1397 < 0) {
                    this.field1397 = 0;
                }
                while (this.field1408 > 4096) {
                    this.field1408 -= 4096;
                }
                if (this.field1405 > 4096) {
                    this.field1405 = 4096;
                }
                if (this.field1397 > 4096) {
                    this.field1397 = 4096;
                }
                this.method687(this.field1397, this.field1405, -1908736212, this.field1408);
                var6[var11] = this.field1392;
                var9[var11] = this.field1411;
                var8[var11] = this.field1398;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILaj;)V", line = 92)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg0 == 0) {
            this.field1396 = arg2.method41((byte) -66);
        } else if (arg0 == 1) {
            this.field1409 = (arg2.method55(4) << 12) / 100;
        } else if (arg0 == 2) {
            this.field1406 = (arg2.method55(arg1 ^ 0xFB) << 12) / 100;
        }
        field1399++;
        if (arg1 != 255) {
            this.method687(32, -82, -37, 51);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIIIB)V", line = 128)
    public static final void method686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 != -47) {
            method692(false, -23);
        }
        if (arg6 >= class310.field4897 && arg2 <= class180.field2862 && arg5 >= class104.field1719 && class333.field5188 >= arg1) {
            class63.method501(109, arg6, arg5, arg1, arg2, arg4, arg0, arg3);
        } else {
            class296.method2101(arg1, arg4, arg2, arg0, -111, arg6, arg3, arg5);
        }
        field1410++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIII)V", line = 149)
    private final void method687(int arg0, int arg1, int arg2, int arg3) {
        field1407++;
        if (arg2 != -1908736212) {
            this.field1396 = -12;
        }
        int var5 = arg1 > 2048 ? arg1 + arg0 - (arg0 * arg1 >> 12) : (arg0 + 4096) * arg1 >> 12;
        if (var5 <= 0) {
            this.field1392 = this.field1411 = this.field1398 = arg1;
            return;
        }
        int var6 = arg1 + arg1 - var5;
        int var7 = arg3 * 6;
        int var8 = (var5 - var6 << 12) / var5;
        int var9 = var7 >> 12;
        int var10 = var7 - (var9 << 12);
        int var12 = var8 * var5 >> 12;
        int var13 = var10 * var12 >> 12;
        int var14 = var5 - var13;
        int var15 = var6 + var13;
        if (var9 == 0) {
            this.field1392 = var5;
            this.field1398 = var6;
            this.field1411 = var15;
        } else if (var9 == 1) {
            this.field1411 = var5;
            this.field1398 = var6;
            this.field1392 = var14;
        } else if (var9 == 2) {
            this.field1392 = var6;
            this.field1411 = var5;
            this.field1398 = var15;
        } else if (var9 == 3) {
            this.field1398 = var5;
            this.field1392 = var6;
            this.field1411 = var14;
        } else if (var9 == 4) {
            this.field1411 = var6;
            this.field1398 = var5;
            this.field1392 = var15;
        } else if (var9 == 5) {
            this.field1392 = var5;
            this.field1398 = var14;
            this.field1411 = var6;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V", line = 259)
    public class87() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "(I)V", line = 263)
    public static void method688(int arg0) {
        if (arg0 != 3) {
            field1403 = 89;
        }
        field1393 = null;
        field1402 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILpk;)V", line = 275)
    public static final void method689(int arg0, class120 arg1) {
        field1401++;
        class147.field2403 = arg1.method958(113, "p11_full");
        class74.field1119 = arg1.method958(124, "p12_full");
        class258.field3838 = arg1.method958(106, "b12_full");
        class217.field3367 = arg1.method958(126, "mapfunction");
        class218.field3413 = arg1.method958(127, "hitmarks");
        class274.field4292 = arg1.method958(116, "hitbar_default");
        class213.field3329 = arg1.method958(104, "headicons_pk");
        class111.field1812 = arg1.method958(117, "headicons_prayer");
        class299.field4786 = arg1.method958(103, "hint_headicons");
        class36.field533 = arg1.method958(118, "hint_mapmarkers");
        if (arg0 <= 69) {
            field1393 = (int[]) null;
        }
        class150.field2446 = arg1.method958(110, "mapflag");
        class86.field1376 = arg1.method958(120, "cross");
        class151.field2472 = arg1.method958(117, "mapdots");
        class133.field2114 = arg1.method958(111, "scrollbar");
        class185.field2931 = arg1.method958(103, "name_icons");
        class176.field2814 = arg1.method958(116, "floorshadows");
        class229.field3523 = arg1.method958(117, "compass");
        class160.field2599 = arg1.method958(110, "hint_mapedge");
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(IIII)V", line = 303)
    private final void method690(int arg0, int arg1, int arg2, int arg3) {
        field1400++;
        if (arg3 != 4976) {
            this.method169(-123, 74, (class1) null);
        }
        int var5 = arg1 < arg2 ? arg1 : arg2;
        int var6 = arg0 < var5 ? arg0 : var5;
        int var7 = arg2 >= arg1 ? arg2 : arg1;
        int var8 = arg0 <= var7 ? var7 : arg0;
        this.field1405 = (var6 + var8) / 2;
        int var9 = var8 - var6;
        if (this.field1405 > 0 && this.field1405 < 4096) {
            this.field1397 = (var9 << 12) / (this.field1405 <= 2048 ? this.field1405 * 2 : 8192 - (this.field1405 * 2));
        } else {
            this.field1397 = 0;
        }
        if (var9 <= 0) {
            this.field1408 = 0;
            return;
        }
        int var10 = (var8 - arg2 << 12) / var9;
        int var11 = (var8 - arg1 << 12) / var9;
        int var12 = (var8 - arg0 << 12) / var9;
        if (arg1 == var8) {
            this.field1408 = arg2 == var6 ? var12 + 20480 : -var10 + 4096;
        } else if (arg2 == var8) {
            this.field1408 = arg0 == var6 ? var11 + 4096 : -var12 + 12288;
        } else {
            this.field1408 = arg1 == var6 ? var10 + 12288 : 20480 - var11;
        }
        this.field1408 /= 6;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BILpk;)Lwd;", line = 359)
    public static final class88 method691(byte arg0, int arg1, class120 arg2) {
        if (arg0 >= -1) {
            field1402 = (int[]) null;
        }
        field1395++;
        return class75.method592(arg2, -114, arg1) ? class343.method2381(88) : null;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(ZI)V", line = 379)
    public static final void method692(boolean arg0, int arg1) {
        field1404++;
        class313.field4923.method2285(arg1, (byte) -76);
        if (arg0) {
            method688(-86);
        }
        class260.field3857.method2285(arg1, (byte) 121);
    }
}
