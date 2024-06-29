import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class100 extends class259 {

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "I")
    private int field2041 = 0;

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "I")
    private int field2040 = 0;

    @OriginalMember(owner = "client!ld", name = "ob", descriptor = "I")
    private int field2053 = 0;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "[Lue;")
    public static class13[] field2032 = new class13[4];

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "Lsg;")
    public static class30 field2035 = class167.method1221((byte) 33, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!ld", name = "mb", descriptor = "I")
    public static int field2051 = 0;

    @OriginalMember(owner = "client!ld", name = "ib", descriptor = "Lsg;")
    private static class30 field2047 = class167.method1221((byte) 33, "Attack");

    @OriginalMember(owner = "client!ld", name = "kb", descriptor = "Lsg;")
    public static class30 field2049 = class167.method1221((byte) 33, " )2>");

    @OriginalMember(owner = "client!ld", name = "nb", descriptor = "Lsg;")
    public static class30 field2052 = class167.method1221((byte) 33, "Okay");

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "Lsg;")
    public static class30 field2038 = field2047;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    private int field2037;

    @OriginalMember(owner = "client!ld", name = "db", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!ld", name = "eb", descriptor = "I")
    private int field2043;

    @OriginalMember(owner = "client!ld", name = "fb", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!ld", name = "gb", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!ld", name = "hb", descriptor = "I")
    private int field2046;

    @OriginalMember(owner = "client!ld", name = "jb", descriptor = "I")
    private int field2048;

    @OriginalMember(owner = "client!ld", name = "lb", descriptor = "I")
    private int field2050;

    @OriginalMember(owner = "client!ld", name = "pb", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!ld", name = "qb", descriptor = "I")
    private int field2055;

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "[Lnb;")
    public static class265[] field2039;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        ++field2034;
        if (arg1 == -1586849108) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (arg0 == 2) {
                        this.field2053 = (arg2.method98(1) << 12) / 100;
                    }
                } else {
                    this.field2040 = (arg2.method98(1) << 12) / 100;
                }
            } else {
                this.field2041 = arg2.method74(arg1 ^ -1586849068);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class100() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    public static void method816(byte arg0) {
        field2035 = null;
        field2032 = null;
        field2038 = null;
        field2052 = null;
        field2047 = null;
        field2039 = null;
        if (arg0 <= 3) {
            method816((byte) -118);
        }
        field2049 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
    private final void method817(int arg0, int arg1, int arg2, int arg3) {
        ++field2042;
        int var5 = arg3 > arg0 ? arg3 : arg0;
        int var6 = arg0 > arg3 ? arg3 : arg0;
        int var7 = var6 > arg2 ? arg2 : var6;
        int var8 = arg2 > var5 ? arg2 : var5;
        int var9 = var8 - var7;
        if (~var9 >= -1) {
            this.field2043 = 0;
        } else {
            int var10 = (-arg3 + var8 << 12) / var9;
            int var11 = (-arg0 + var8 << 12) / var9;
            int var12 = (-arg2 + var8 << 12) / var9;
            if (~arg3 == ~var8) {
                this.field2043 = arg0 != var7 ? -var11 + 4096 : var12 + 20480;
            } else if (arg0 != var8) {
                this.field2043 = ~arg3 != ~var7 ? -var10 + 20480 : var11 + 12288;
            } else {
                this.field2043 = ~arg2 != ~var7 ? -var12 + 12288 : var10 + 4096;
            }
            this.field2043 /= 6;
        }
        this.field2055 = (var7 + var8) / arg1;
        if (this.field2055 > 0 && this.field2055 < 4096) {
            this.field2046 = (var9 << 12) / (this.field2055 <= 2048 ? this.field2055 * 2 : 8192 - this.field2055 * 2);
        } else {
            this.field2046 = 0;
        }
    }

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "(I)V")
    public static final void method818(int arg0) {
        ++field2031;
        if (class110.field2204 != 0 && ~class110.field2204 != -6) {
            try {
                if (++class87.field1792 > 2000) {
                    if (class175.field3261 != null) {
                        class175.field3261.method1516(-115);
                        class175.field3261 = null;
                    }
                    if (class275.field4800 >= 1) {
                        class68.field1498 = -5;
                        class110.field2204 = 0;
                        return;
                    }
                    ++class275.field4800;
                    if (class241.field4309 == class101.field2056) {
                        class101.field2056 = class135.field2637;
                    } else {
                        class101.field2056 = class241.field4309;
                    }
                    class110.field2204 = 1;
                    class87.field1792 = 0;
                }
                int var1 = -19 % ((80 - arg0) / 42);
                if (class110.field2204 == 1) {
                    class2.field36 = class190.field3452.method602(-16536, class101.field2056, class197.field3564);
                    class110.field2204 = 2;
                }
                if (~class110.field2204 == -3) {
                    if (~class2.field36.field493 == -3) {
                        throw new IOException();
                    }
                    if (class2.field36.field493 != 1) {
                        return;
                    }
                    class175.field3261 = new class212((Socket) class2.field36.field492, class190.field3452);
                    class2.field36 = null;
                    long var2 = class88.field1799 = class55.field1227.method297((byte) -96);
                    int var4 = (int) (var2 >> 16 & 31L);
                    class196.field3553.field146 = 0;
                    class196.field3553.method76(5305, 14);
                    class196.field3553.method76(5305, var4);
                    class175.field3261.method1509(class196.field3553.field124, 0, 2, true);
                    if (class11.field217 != null) {
                        class11.field217.method499(121);
                    }
                    if (class149.field2843 != null) {
                        class149.field2843.method499(125);
                    }
                    int var5 = class175.field3261.method1515(0);
                    if (class11.field217 != null) {
                        class11.field217.method499(117);
                    }
                    if (class149.field2843 != null) {
                        class149.field2843.method499(127);
                    }
                    if (~var5 != -1) {
                        class110.field2204 = 0;
                        class68.field1498 = var5;
                        class175.field3261.method1516(-122);
                        class175.field3261 = null;
                        return;
                    }
                    class110.field2204 = 3;
                }
                if (~class110.field2204 == -4) {
                    if (~class175.field3261.method1508(0) > -9) {
                        return;
                    }
                    class175.field3261.method1510(0, class59.field1289.field124, 8, (byte) -6);
                    int[] var6 = new int[4];
                    class59.field1289.field146 = 0;
                    class157.field2953 = class59.field1289.method101(-122);
                    var6[3] = (int) class157.field2953;
                    var6[1] = (int) (9.9999999E7D * Math.random());
                    class196.field3553.field146 = 0;
                    var6[0] = (int) (9.9999999E7D * Math.random());
                    var6[2] = (int) (class157.field2953 >> 32);
                    class196.field3553.method76(5305, 10);
                    class196.field3553.method57(var6[0], 124);
                    class196.field3553.method57(var6[1], 119);
                    class196.field3553.method57(var6[2], 123);
                    class196.field3553.method57(var6[3], 95);
                    class196.field3553.method72(-1033389592, class55.field1227.method297((byte) -90));
                    class196.field3553.method85(class55.field1215, (byte) 104);
                    class196.field3553.method75(class266.field4696, 15955, class88.field1800);
                    class50.field1132.field146 = 0;
                    if (~class193.field3485 != -41) {
                        class50.field1132.method76(5305, 16);
                    } else {
                        class50.field1132.method76(5305, 18);
                    }
                    class50.field1132.method97(class196.field3553.field146 + (154 - -class63.method563(-127, class219.field3963)), (byte) -2);
                    class50.field1132.method57(519, 86);
                    class50.field1132.method76(5305, class69.field1562);
                    class50.field1132.method76(5305, !class197.field3566 ? 0 : 1);
                    class50.field1132.method76(5305, 0);
                    class50.field1132.method76(5305, class150.method1089((byte) 67));
                    class50.field1132.method97(class15.field324, (byte) -2);
                    class50.field1132.method97(class238.field4238, (byte) -2);
                    class57.method537((byte) -100, class50.field1132);
                    class50.field1132.method85(class219.field3963, (byte) 23);
                    class50.field1132.method57(class197.field3563, 106);
                    class50.field1132.method57(class16.method164(-96), 121);
                    class35.field865 = true;
                    class50.field1132.method97(class37.field899, (byte) -2);
                    class50.field1132.method57(class104.field2097.method1126(true), 105);
                    class50.field1132.method57(class62.field1333.method1126(true), 62);
                    class50.field1132.method57(class36.field877.method1126(true), 123);
                    class50.field1132.method57(class90.field1825.method1126(true), 112);
                    class50.field1132.method57(class5.field71.method1126(true), 90);
                    class50.field1132.method57(class178.field3298.method1126(true), 92);
                    class50.field1132.method57(class139.field2713.method1126(true), 88);
                    class50.field1132.method57(class233.field4151.method1126(true), 116);
                    class50.field1132.method57(class134.field2625.method1126(true), 101);
                    class50.field1132.method57(class175.field3260.method1126(true), 82);
                    class50.field1132.method57(class33.field826.method1126(true), 85);
                    class50.field1132.method57(class113.field2243.method1126(true), 91);
                    class50.field1132.method57(class116.field2292.method1126(true), 81);
                    class50.field1132.method57(class130.field2567.method1126(true), 86);
                    class50.field1132.method57(class250.field4418.method1126(true), 60);
                    class50.field1132.method57(class191.field3471.method1126(true), 101);
                    class50.field1132.method57(class263.field4660.method1126(true), 113);
                    class50.field1132.method57(class35.field862.method1126(true), 75);
                    class50.field1132.method57(class236.field4226.method1126(true), 79);
                    class50.field1132.method57(class48.field1092.method1126(true), 104);
                    class50.field1132.method57(class151.field2878.method1126(true), 57);
                    class50.field1132.method57(class17.field336.method1126(true), 114);
                    class50.field1132.method57(class262.field4635.method1126(true), 72);
                    class50.field1132.method57(class58.field1268.method1126(true), 77);
                    class50.field1132.method57(class136.field2662.method1126(true), 79);
                    class50.field1132.method57(class232.field4127.method1126(true), 70);
                    class50.field1132.method57(class260.field4602.method1126(true), 111);
                    class50.field1132.method62(class196.field3553.field146, 0, class196.field3553.field124, 0);
                    class175.field3261.method1509(class50.field1132.field124, 0, class50.field1132.field146, true);
                    class196.field3553.method1273(-39, var6);
                    for (int var7 = 0; var7 < 4; ++var7) {
                        var6[var7] += 50;
                    }
                    class59.field1289.method1273(-71, var6);
                    class110.field2204 = 4;
                }
                if (class110.field2204 == 4) {
                    if (~class175.field3261.method1508(0) > -2) {
                        return;
                    }
                    int var8 = class175.field3261.method1515(0);
                    if (var8 == 21) {
                        class110.field2204 = 7;
                    } else if (~var8 != -30) {
                        if (var8 == 1) {
                            class68.field1498 = var8;
                            class110.field2204 = 5;
                            return;
                        }
                        if (~var8 != -3) {
                            if (~var8 != -16) {
                                if (~var8 == -24 && class275.field4800 < 1) {
                                    class87.field1792 = 0;
                                    ++class275.field4800;
                                    class110.field2204 = 1;
                                    class175.field3261.method1516(-117);
                                    class175.field3261 = null;
                                    return;
                                }
                                class110.field2204 = 0;
                                class68.field1498 = var8;
                                class175.field3261.method1516(-92);
                                class175.field3261 = null;
                                return;
                            }
                            class68.field1498 = var8;
                            class110.field2204 = 0;
                            return;
                        }
                        class110.field2204 = 8;
                    } else {
                        class110.field2204 = 10;
                    }
                }
                if (~class110.field2204 == -7) {
                    class196.field3553.field146 = 0;
                    class196.field3553.method1267(17, -9);
                    class175.field3261.method1509(class196.field3553.field124, 0, class196.field3553.field146, true);
                    class110.field2204 = 4;
                } else if (~class110.field2204 == -8) {
                    if (~class175.field3261.method1508(0) <= -2) {
                        class249.field4404 = (3 + class175.field3261.method1515(0)) * 60;
                        class68.field1498 = 21;
                        class110.field2204 = 0;
                        class175.field3261.method1516(-90);
                        class175.field3261 = null;
                    }
                } else if (class110.field2204 == 10) {
                    if (~class175.field3261.method1508(0) <= -2) {
                        class20.field379 = class175.field3261.method1515(0);
                        class110.field2204 = 0;
                        class68.field1498 = 29;
                        class175.field3261.method1516(-101);
                        class175.field3261 = null;
                    }
                } else {
                    if (~class110.field2204 == -9) {
                        if (class175.field3261.method1508(0) < 12) {
                            return;
                        }
                        class175.field3261.method1510(0, class59.field1289.field124, 12, (byte) -6);
                        class59.field1289.field146 = 0;
                        class133.field2610 = class59.field1289.method63((byte) 54);
                        class250.field4430 = class59.field1289.method63((byte) 75);
                        class36.field874 = class59.field1289.method63((byte) 108);
                        class230.field4091 = class59.field1289.method63((byte) 124);
                        class80.field1722 = class59.field1289.method63((byte) 113) == 1;
                        class249.field4405 = class59.field1289.method65((byte) 113);
                        class2.field43 = class59.field1289.method63((byte) 88) == 1;
                        class65.field1429 = class59.field1289.method63((byte) 74) == 1;
                        class242.method1713(class65.field1429, 1);
                        class123.method935(113, class65.field1429);
                        if (!class197.field3566) {
                            if (class36.field874 != 1 && !class2.field43) {
                                try {
                                    class173.field3238.method294(class190.field3452.field1449, 0);
                                } catch (Throwable var9) {
                                }
                            } else {
                                try {
                                    class172.field3211.method294(class190.field3452.field1449, 0);
                                } catch (Throwable var10) {
                                }
                            }
                        }
                        class70.field1586 = class59.field1289.method1274((byte) -124);
                        class163.field3041 = class59.field1289.method65((byte) 125);
                        class110.field2204 = 9;
                    }
                    if (class110.field2204 == 9) {
                        if (class175.field3261.method1508(0) >= class163.field3041) {
                            class59.field1289.field146 = 0;
                            class175.field3261.method1510(0, class59.field1289.field124, class163.field3041, (byte) -6);
                            class110.field2204 = 0;
                            class68.field1498 = 2;
                            class21.method198((byte) 107);
                            field2054 = -1;
                            class193.method1398(false, -50);
                            class70.field1586 = -1;
                        }
                    }
                }
            } catch (IOException var11) {
                if (class175.field3261 != null) {
                    class175.field3261.method1516(-84);
                    class175.field3261 = null;
                }
                if (~class275.field4800 <= -2) {
                    class68.field1498 = -4;
                    class110.field2204 = 0;
                } else {
                    ++class275.field4800;
                    class110.field2204 = 1;
                    if (class241.field4309 == class101.field2056) {
                        class101.field2056 = class135.field2637;
                    } else {
                        class101.field2056 = class241.field4309;
                    }
                    class87.field1792 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBI)V")
    private final void method819(int arg0, int arg1, byte arg2, int arg3) {
        ++field2033;
        int var5 = arg0 <= 2048 ? (arg3 + 4096) * arg0 >> 12 : arg0 - (arg0 * arg3 >> 12) + arg3;
        if (var5 > 0) {
            int var6 = arg1 * 6;
            int var7 = var6 >> 12;
            int var8 = arg0 + arg0 + -var5;
            int var9 = -(var7 << 12) + var6;
            int var10 = (-var8 + var5 << 12) / var5;
            int var12 = var10 * var5 >> 12;
            int var13 = var9 * var12 >> 12;
            int var14 = -var13 + var5;
            int var15 = var8 - -var13;
            if (~var7 != -1) {
                if (~var7 != -2) {
                    if (var7 != 2) {
                        if (~var7 != -4) {
                            if (var7 != 4) {
                                if (~var7 == -6) {
                                    this.field2048 = var8;
                                    this.field2050 = var14;
                                    this.field2037 = var5;
                                }
                            } else {
                                this.field2037 = var15;
                                this.field2048 = var8;
                                this.field2050 = var5;
                            }
                        } else {
                            this.field2037 = var8;
                            this.field2050 = var5;
                            this.field2048 = var14;
                        }
                    } else {
                        this.field2037 = var8;
                        this.field2050 = var15;
                        this.field2048 = var5;
                    }
                } else {
                    this.field2050 = var8;
                    this.field2048 = var5;
                    this.field2037 = var14;
                }
            } else {
                this.field2050 = var8;
                this.field2037 = var5;
                this.field2048 = var15;
            }
        } else {
            this.field2037 = this.field2048 = this.field2050 = arg0;
        }
        int var17 = -62 / ((arg2 - -48) / 38);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        int[][] var3 = super.field4568.method241(-75, arg1);
        if (super.field4568.field564) {
            int[][] var4 = this.method1795(arg1, 2, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class223.field3999 < ~var11; ++var11) {
                this.method817(var5[var11], 2, var7[var11], var6[var11]);
                this.field2043 += this.field2041;
                this.field2046 += this.field2040;
                if (~this.field2046 > -1) {
                    this.field2046 = 0;
                }
                while (this.field2043 < 0) {
                    this.field2043 += 4096;
                }
                this.field2055 += this.field2053;
                while (this.field2043 > 4096) {
                    this.field2043 -= 4096;
                }
                if (~this.field2055 > -1) {
                    this.field2055 = 0;
                }
                if (~this.field2055 < -4097) {
                    this.field2055 = 4096;
                }
                if (this.field2046 > 4096) {
                    this.field2046 = 4096;
                }
                this.method819(this.field2055, this.field2043, (byte) -99, this.field2046);
                var8[var11] = this.field2037;
                var10[var11] = this.field2048;
                var9[var11] = this.field2050;
            }
        }
        ++field2036;
        int var12 = -121 / ((arg0 - -48) / 42);
        return var3;
    }
}
