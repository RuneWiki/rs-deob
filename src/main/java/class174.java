import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sh")
public class class174 extends class97 {

    @OriginalMember(owner = "sh", name = "G", descriptor = "[I")
    private int[] field3255 = new int[16];

    @OriginalMember(owner = "sh", name = "F", descriptor = "[I")
    private int[] field3254 = new int[16];

    @OriginalMember(owner = "sh", name = "N", descriptor = "[I")
    private int[] field3261 = new int[16];

    @OriginalMember(owner = "sh", name = "r", descriptor = "[I")
    public int[] field3240 = new int[16];

    @OriginalMember(owner = "sh", name = "T", descriptor = "[I")
    private int[] field3267 = new int[16];

    @OriginalMember(owner = "sh", name = "E", descriptor = "[I")
    private int[] field3253 = new int[16];

    @OriginalMember(owner = "sh", name = "Q", descriptor = "[I")
    private int[] field3264 = new int[16];

    @OriginalMember(owner = "sh", name = "Z", descriptor = "I")
    private int field3273 = 256;

    @OriginalMember(owner = "sh", name = "u", descriptor = "[I")
    private int[] field3243 = new int[16];

    @OriginalMember(owner = "sh", name = "S", descriptor = "[I")
    public int[] field3266 = new int[16];

    @OriginalMember(owner = "sh", name = "A", descriptor = "[I")
    private int[] field3249 = new int[16];

    @OriginalMember(owner = "sh", name = "db", descriptor = "[[Lvf;")
    private class199[][] field3277 = new class199[16][128];

    @OriginalMember(owner = "sh", name = "lb", descriptor = "[I")
    public int[] field3285 = new int[16];

    @OriginalMember(owner = "sh", name = "rb", descriptor = "[[Lvf;")
    private class199[][] field3291 = new class199[16][128];

    @OriginalMember(owner = "sh", name = "fb", descriptor = "[I")
    private int[] field3279 = new int[16];

    @OriginalMember(owner = "sh", name = "t", descriptor = "[I")
    private int[] field3242 = new int[16];

    @OriginalMember(owner = "sh", name = "tb", descriptor = "[I")
    private int[] field3293 = new int[16];

    @OriginalMember(owner = "sh", name = "Eb", descriptor = "I")
    private int field3304 = 1000000;

    @OriginalMember(owner = "sh", name = "Hb", descriptor = "[I")
    private int[] field3307 = new int[16];

    @OriginalMember(owner = "sh", name = "V", descriptor = "Lqf;")
    private class154 field3269 = new class154();

    @OriginalMember(owner = "sh", name = "Qb", descriptor = "Lmf;")
    private class118 field3316 = new class118(this);

    @OriginalMember(owner = "sh", name = "O", descriptor = "Leh;")
    private class49 field3262 = new class49(128);

    @OriginalMember(owner = "sh", name = "gb", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field3280 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "sh", name = "ub", descriptor = "I")
    public static int field3294 = 50;

    @OriginalMember(owner = "sh", name = "yb", descriptor = "I")
    public static int field3298 = 0;

    @OriginalMember(owner = "sh", name = "sb", descriptor = "Llf;")
    public static class109 field3292 = class35.method275("<)4col> x", 2);

    @OriginalMember(owner = "sh", name = "Ab", descriptor = "I")
    public static int field3300 = 0;

    @OriginalMember(owner = "sh", name = "Gb", descriptor = "Llf;")
    public static class109 field3306 = class35.method275("", 2);

    @OriginalMember(owner = "sh", name = "Jb", descriptor = "Llf;")
    public static class109 field3309 = field3306;

    @OriginalMember(owner = "sh", name = "s", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "sh", name = "v", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "sh", name = "w", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "sh", name = "x", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "sh", name = "y", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "sh", name = "z", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "sh", name = "B", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "sh", name = "C", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "sh", name = "D", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "sh", name = "H", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "sh", name = "I", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "sh", name = "J", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "sh", name = "K", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "sh", name = "L", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "sh", name = "P", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "sh", name = "R", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "sh", name = "U", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "sh", name = "W", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "sh", name = "X", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "sh", name = "Y", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "sh", name = "ab", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "sh", name = "bb", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "sh", name = "cb", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "sh", name = "eb", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "sh", name = "hb", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "sh", name = "ib", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "sh", name = "jb", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "sh", name = "kb", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "sh", name = "mb", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "sh", name = "nb", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "sh", name = "ob", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "sh", name = "pb", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "sh", name = "vb", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "sh", name = "zb", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "sh", name = "Cb", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "sh", name = "Db", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "sh", name = "Fb", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "sh", name = "Ib", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "sh", name = "Kb", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "sh", name = "Mb", descriptor = "I")
    private int field3312;

    @OriginalMember(owner = "sh", name = "Nb", descriptor = "I")
    private int field3313;

    @OriginalMember(owner = "sh", name = "Ob", descriptor = "J")
    private long field3314;

    @OriginalMember(owner = "sh", name = "Pb", descriptor = "J")
    private long field3315;

    @OriginalMember(owner = "sh", name = "xb", descriptor = "Loh;")
    public static class138 field3297;

    @OriginalMember(owner = "sh", name = "qb", descriptor = "Lbg;")
    public static class18 field3290;

    @OriginalMember(owner = "sh", name = "wb", descriptor = "Lvg;")
    public static class200 field3296;

    @OriginalMember(owner = "sh", name = "Bb", descriptor = "Ldf;")
    public static class37 field3301;

    @OriginalMember(owner = "sh", name = "Lb", descriptor = "Z")
    private boolean field3311;

    @OriginalMember(owner = "sh", name = "d", descriptor = "()I")
    public final synchronized int method650() {
        field3251++;
        return 0;
    }

    @OriginalMember(owner = "sh", name = "c", descriptor = "()Lkc;")
    public final synchronized class97 method630() {
        field3289++;
        return null;
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "([III)V")
    public final synchronized void method620(int[] arg0, int arg1, int arg2) {
        if (this.field3269.method1065()) {
            int var4 = this.field3269.field2925 * this.field3304 / class23.field519;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3314;
                if (this.field3315 - var5 >= 0L) {
                    this.field3314 = var5;
                    break;
                }
                int var7 = (int) (((long) var4 + this.field3315 - this.field3314 - 1L) / (long) var4);
                this.field3314 += (long) var4 * (long) var7;
                arg2 -= var7;
                this.field3316.method620(arg0, arg1, var7);
                arg1 += var7;
                this.method1187(0);
            } while (this.field3269.method1065());
        }
        this.field3316.method620(arg0, arg1, arg2);
        field3263++;
    }

    @OriginalMember(owner = "sh", name = "b", descriptor = "(Z)V")
    public static final void method1162(boolean arg0) {
        field3268++;
        try {
            if (class31.field745 == 0) {
                if (class55.field1114 != null) {
                    class55.field1114.method915((byte) -59);
                    class55.field1114 = null;
                }
                class4.field48 = false;
                class31.field745 = 1;
                class20.field436 = null;
                class46.field960 = 0;
            }
            if (class31.field745 == 1) {
                if (class20.field436 == null) {
                    class20.field436 = class49.field1009.method701(class129.field2490, false, class190.field3646);
                }
                if (class20.field436.field746 == 2) {
                    throw new IOException();
                }
                if (class20.field436.field746 == 1) {
                    class55.field1114 = new class125((Socket) class20.field436.field748, class49.field1009);
                    class20.field436 = null;
                    class31.field745 = 2;
                }
            }
            if (class31.field745 == 2) {
                long var1 = class203.field3998 = class145.field2787.method784(false);
                class200.field3850.field1773 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class200.field3850.method568(-13488, 14);
                class200.field3850.method568(-13488, var3);
                class55.field1114.method908(-69, 0, 2, class200.field3850.field1808);
                class31.field745 = 3;
                class95.field1934.field1773 = 0;
            }
            if (class31.field745 == 3) {
                if (class164.field3071 != null) {
                    class164.field3071.method40(8);
                }
                if (class41.field872 != null) {
                    class41.field872.method40(8);
                }
                int var4 = class55.field1114.method914(true);
                if (class164.field3071 != null) {
                    class164.field3071.method40(8);
                }
                if (class41.field872 != null) {
                    class41.field872.method40(8);
                }
                if (var4 != 0) {
                    class20.method192(var4, (byte) 90);
                    return;
                }
                class95.field1934.field1773 = 0;
                class31.field745 = 4;
            }
            if (class31.field745 == 4) {
                if (class95.field1934.field1773 < 8) {
                    int var5 = class55.field1114.method907(-75);
                    if (8 - class95.field1934.field1773 < var5) {
                        var5 = 8 - class95.field1934.field1773;
                    }
                    if (var5 > 0) {
                        class55.field1114.method906(5, var5, class95.field1934.field1808, class95.field1934.field1773);
                        class95.field1934.field1773 += var5;
                    }
                }
                if (class95.field1934.field1773 == 8) {
                    class95.field1934.field1773 = 0;
                    class95.field1950 = class95.field1934.method572(-1495411552);
                    class31.field745 = 5;
                }
            }
            if (class31.field745 == 5) {
                class200.field3850.field1773 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class95.field1950 >> 32), (int) class95.field1950 };
                class200.field3850.method568(-13488, 10);
                class200.field3850.method588((byte) 101, var6[0]);
                class200.field3850.method588((byte) 117, var6[1]);
                class200.field3850.method588((byte) 113, var6[2]);
                class200.field3850.method588((byte) 103, var6[3]);
                class200.field3850.method592(class145.field2787.method784(false), -562765672);
                class200.field3850.method585(class145.field2807, (byte) -108);
                class200.field3850.method570(class30.field639, field3280, (byte) 108);
                class185.field3512.field1773 = 0;
                if (class107.field2123 == 40) {
                    class185.field3512.method568(-13488, 18);
                } else {
                    class185.field3512.method568(-13488, 16);
                }
                class185.field3512.method568(-13488, class200.field3850.field1773 + 93);
                class185.field3512.method588((byte) 123, 484);
                class185.field3512.method568(-13488, class181.field3420 ? 1 : 0);
                class84.method538(arg0, class185.field3512);
                class185.field3512.method588((byte) 109, class62.field1199.field388);
                class185.field3512.method588((byte) 112, class46.field965.field388);
                class185.field3512.method588((byte) 115, class50.field1025.field388);
                class185.field3512.method588((byte) 107, class57.field1161.field388);
                class185.field3512.method588((byte) 117, class136.field2625.field388);
                class185.field3512.method588((byte) 114, class171.field3212.field388);
                class185.field3512.method588((byte) 110, class103.field2030.field388);
                class185.field3512.method588((byte) 126, field3297.field388);
                class185.field3512.method588((byte) 111, class73.field1410.field388);
                class185.field3512.method588((byte) 125, class132.field2555.field388);
                class185.field3512.method588((byte) 113, class39.field835.field388);
                class185.field3512.method588((byte) 119, class95.field1937.field388);
                class185.field3512.method588((byte) 127, class50.field1021.field388);
                class185.field3512.method588((byte) 124, class68.field1322.field388);
                class185.field3512.method588((byte) 127, class95.field1943.field388);
                class185.field3512.method588((byte) 105, class139.field2704.field388);
                class185.field3512.method567(0, class200.field3850.field1773, class200.field3850.field1808, arg0);
                class55.field1114.method908(-118, 0, class185.field3512.field1773, class185.field3512.field1808);
                class200.field3850.method1335(!arg0, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class95.field1934.method1335(!arg0, var6);
                class31.field745 = 6;
            }
            if (class31.field745 == 6 && class55.field1114.method907(-110) > 0) {
                int var8 = class55.field1114.method914(true);
                if (var8 == 21 && class107.field2123 == 20) {
                    class31.field745 = 7;
                } else if (var8 == 2) {
                    class31.field745 = 9;
                } else if (var8 == 15 && class107.field2123 == 40) {
                    class121.method869(0);
                    return;
                } else if (var8 == 23 && class31.field732 < 1) {
                    class31.field732++;
                    class31.field745 = 0;
                } else {
                    class20.method192(var8, (byte) 90);
                    return;
                }
            }
            if (!arg0) {
                field3298 = 113;
            }
            if (class31.field745 == 7 && class55.field1114.method907(-100) > 0) {
                class145.field2808 = class55.field1114.method914(true) * 60 + 180;
                class31.field745 = 8;
            }
            if (class31.field745 == 8) {
                class46.field960 = 0;
                class67.method437(95, class36.method279(new class109[] { class52.method345((byte) 85, class145.field2808 / 60), class112.field2215 }, 121), class199.field3785, class191.field3658);
                if (--class145.field2808 <= 0) {
                    class31.field745 = 0;
                }
            } else {
                if (class31.field745 == 9 && class55.field1114.method907(-80) >= 9) {
                    class115.field2280 = class55.field1114.method914(true);
                    class202.field3973 = class55.field1114.method914(true);
                    class179.field3389 = class55.field1114.method914(true) == 1;
                    class59.field1168 = class55.field1114.method914(true);
                    class59.field1168 <<= 0x8;
                    class59.field1168 += class55.field1114.method914(true);
                    class84.field1712 = class55.field1114.method914(arg0);
                    class55.field1114.method906(112, 1, class95.field1934.field1808, 0);
                    class95.field1934.field1773 = 0;
                    class136.field2628 = class95.field1934.method1334(30882);
                    class55.field1114.method906(-58, 2, class95.field1934.field1808, 0);
                    class95.field1934.field1773 = 0;
                    class204.field4006 = class95.field1934.method569(true);
                    class31.field745 = 10;
                }
                if (class31.field745 != 10) {
                    class46.field960++;
                    if (class46.field960 > 2000) {
                        if (class31.field732 < 1) {
                            if (class206.field4050 == class129.field2490) {
                                class129.field2490 = class63.field1211;
                            } else {
                                class129.field2490 = class206.field4050;
                            }
                            class31.field732++;
                            class31.field745 = 0;
                        } else {
                            class20.method192(-3, (byte) 90);
                        }
                    }
                } else if (class55.field1114.method907(-91) >= class204.field4006) {
                    class95.field1934.field1773 = 0;
                    class55.field1114.method906(-111, class204.field4006, class95.field1934.field1808, 0);
                    class84.method536((byte) 104);
                    class106.field2102 = -1;
                    class93.method674(false, (byte) -111);
                    class136.field2628 = -1;
                }
            }
        } catch (IOException var9) {
            if (class31.field732 < 1) {
                class31.field745 = 0;
                class31.field732++;
                if (class206.field4050 == class129.field2490) {
                    class129.field2490 = class63.field1211;
                } else {
                    class129.field2490 = class206.field4050;
                }
            } else {
                class20.method192(-2, (byte) 90);
            }
        }
    }

    @OriginalMember(owner = "sh", name = "c", descriptor = "(B)I")
    public final int method1163(byte arg0) {
        if (arg0 <= 35) {
            this.method1172(116, false, 11);
        }
        field3305++;
        return this.field3273;
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "(BLvf;)I")
    private final int method1164(byte arg0, class199 arg1) {
        int var3 = this.field3254[arg1.field3808];
        field3276++;
        if (arg0 <= 85) {
            this.field3253 = null;
        }
        return var3 < 8192 ? arg1.field3804 * var3 + 32 >> 6 : 16384 - ((128 - arg1.field3804) * (-var3 + 16384) + 32 >> 6);
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "(IIII)V")
    private final void method1165(int arg0, int arg1, int arg2, int arg3) {
        class199 var5 = this.field3291[arg0][arg1];
        field3260++;
        if (var5 == null) {
            return;
        }
        this.field3291[arg0][arg1] = null;
        int var6 = 0 / ((arg2 - 28) / 53);
        if ((this.field3285[arg0] & 0x2) == 0) {
            var5.field3782 = 0;
            return;
        }
        for (class199 var7 = (class199) this.field3316.field2324.method1230(68); var7 != null; var7 = (class199) this.field3316.field2324.method1234(-1)) {
            if (var5.field3808 == var7.field3808 && var7.field3782 < 0 && var5 != var7) {
                var5.field3782 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "(BI)V")
    private final void method1166(byte arg0, int arg1) {
        field3257++;
        if (arg1 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.method1166((byte) -103, var3);
            }
            return;
        }
        this.field3243[arg1] = 12800;
        this.field3254[arg1] = 8192;
        this.field3249[arg1] = 16383;
        this.field3255[arg1] = 8192;
        this.field3253[arg1] = 0;
        this.field3242[arg1] = 8192;
        this.method1177(74, arg1);
        this.method1191(arg1, 128);
        this.field3285[arg1] = 0;
        this.field3307[arg1] = 32767;
        this.field3267[arg1] = 256;
        if (arg0 < -55) {
            this.field3240[arg1] = 0;
            this.method1186(arg1, 8192, 2795);
        }
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "(ZBLs;)V")
    public final synchronized void method1167(boolean arg0, byte arg1, class166 arg2) {
        this.method1195((byte) 126);
        field3252++;
        this.field3269.method1064(arg2.field3106);
        this.field3314 = 0L;
        this.field3311 = arg0;
        int var4 = this.field3269.method1058();
        for (int var5 = 0; var5 < var4; var5++) {
            this.field3269.method1059(var5);
            this.field3269.method1055(var5);
            this.field3269.method1060(var5);
        }
        this.field3313 = this.field3269.method1057();
        this.field3312 = this.field3269.field2926[this.field3313];
        this.field3315 = this.field3269.method1063(this.field3312);
        if (arg1 != -85) {
            this.method1187(-95);
        }
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "(II)V")
    private final void method1168(int arg0, int arg1) {
        field3287++;
        for (class199 var3 = (class199) this.field3316.field2324.method1230(109); var3 != null; var3 = (class199) this.field3316.field2324.method1234(-1)) {
            if ((arg0 < 0 || var3.field3808 == arg0) && var3.field3782 < 0) {
                this.field3291[var3.field3808][var3.field3813] = null;
                var3.field3782 = 0;
            }
        }
        if (arg1 != 0) {
            method1174(-65L, 108);
        }
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "(III)V")
    private final void method1169(int arg0, int arg1, int arg2) {
        field3288++;
        if (this.field3279[arg2] != arg1) {
            this.field3279[arg2] = arg1;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field3277[arg2][var4] = null;
            }
        }
        if (arg0 > -90) {
            this.method1175(65);
        }
    }

    @OriginalMember(owner = "sh", name = "b", descriptor = "(I)V")
    public final synchronized void method1170(int arg0) {
        int var2 = -115 % ((40 - arg0) / 50);
        for (class114 var3 = (class114) this.field3262.method338((byte) 91); var3 != null; var3 = (class114) this.field3262.method335(1)) {
            var3.method452(true);
        }
        field3299++;
    }

    @OriginalMember(owner = "sh", name = "d", descriptor = "(B)V")
    public static void method1171(byte arg0) {
        field3290 = null;
        field3301 = null;
        field3296 = null;
        field3309 = null;
        field3292 = null;
        field3306 = null;
        field3297 = null;
        int var1 = 52 / ((arg0 + 18) / 60);
        field3280 = null;
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "(IZI)V")
    private final void method1172(int arg0, boolean arg1, int arg2) {
        this.field3293[arg0] = arg2;
        this.field3261[arg0] = class170.method1140(-128, arg2);
        if (!arg1) {
            this.field3311 = false;
        }
        this.method1169(-118, arg2, arg0);
        field3272++;
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "(Lvf;ZI)V")
    public final void method1173(class199 arg0, boolean arg1, int arg2) {
        field3244++;
        if (arg2 != -4123) {
            this.method1185(true, -46, -95, -124);
        }
        int var4 = arg0.field3799.field1929.length;
        int var6;
        if (arg1 && arg0.field3799.field1927) {
            int var5 = var4 + var4 - arg0.field3799.field1928;
            var6 = (int) ((long) this.field3240[arg0.field3808] * (long) var5 >> 6);
            int var7 = var4 << 8;
            if (var7 <= var6) {
                var6 = var7 + var7 - var6 - 1;
                arg0.field3792.method640(true);
            }
        } else {
            var6 = (int) ((long) this.field3240[arg0.field3808] * (long) var4 >> 6);
        }
        arg0.field3792.method612(var6);
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "(JI)V")
    public static final void method1174(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
            if (arg1 > -82) {
                method1174(121L, 14);
            }
        } catch (InterruptedException var3) {
        }
        field3281++;
    }

    @OriginalMember(owner = "sh", name = "c", descriptor = "(I)V")
    private final void method1175(int arg0) {
        this.method1190(0, -1);
        this.method1166((byte) -125, -1);
        field3283++;
        if (arg0 >= -14) {
            return;
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3279[var2] = this.field3293[var2];
        }
        for (int var3 = 0; var3 < 16; var3++) {
            this.field3261[var3] = class170.method1140(-128, this.field3293[var3]);
        }
    }

    @OriginalMember(owner = "sh", name = "d", descriptor = "(I)Z")
    public final synchronized boolean method1176(int arg0) {
        int var2 = -5 / ((-arg0 - 18) / 60);
        field3271++;
        return this.field3269.method1065();
    }

    @OriginalMember(owner = "sh", name = "b", descriptor = "(II)V")
    private final void method1177(int arg0, int arg1) {
        if ((this.field3285[arg1] & 0x2) != 0) {
            for (class199 var3 = (class199) this.field3316.field2324.method1230(113); var3 != null; var3 = (class199) this.field3316.field2324.method1234(-1)) {
                if (var3.field3808 == arg1 && this.field3291[arg1][var3.field3813] == null && var3.field3782 < 0) {
                    var3.field3782 = 0;
                }
            }
        }
        field3308++;
        if (arg0 < 50) {
            this.method622(107);
        }
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "(I[IILvf;I)Z")
    public final boolean method1178(int arg0, int[] arg1, int arg2, class199 arg3, int arg4) {
        arg3.field3810 = class23.field519 / 100;
        field3250++;
        if (arg3.field3782 >= 0 && (arg3.field3792 == null || arg3.field3792.method615())) {
            arg3.method1311((byte) 91);
            arg3.method452(true);
            if (arg3.field3811 > 0 && this.field3277[arg3.field3808][arg3.field3811] == arg3) {
                this.field3277[arg3.field3808][arg3.field3811] = null;
            }
            return true;
        } else if (arg4 < 102) {
            return false;
        } else {
            boolean var6 = false;
            int var7 = arg3.field3788;
            if (var7 > 0) {
                int var8 = var7 - (int) (Math.pow(2.0D, (double) this.field3242[arg3.field3808] * 4.921259842519685E-4D) * 16.0D + 0.5D);
                if (var8 < 0) {
                    var8 = 0;
                }
                arg3.field3788 = var8;
            }
            arg3.field3792.method617(this.method1193(arg3, (byte) 37));
            double var9 = (double) ((arg3.field3813 - 60 << 8) + (arg3.field3807 * arg3.field3788 >> 12)) * 5.086263020833333E-6D;
            arg3.field3809++;
            class126 var11 = arg3.field3814;
            arg3.field3791 += var11.field2425;
            if (var11.field2426 > 0) {
                if (var11.field2438 <= 0) {
                    arg3.field3797 += 128;
                } else {
                    arg3.field3797 += (int) (Math.pow(2.0D, (double) var11.field2438 * var9) * 128.0D + 0.5D);
                }
                if (arg3.field3797 * var11.field2426 >= 819200) {
                    var6 = true;
                }
            }
            if (var11.field2433 != null) {
                if (var11.field2430 > 0) {
                    arg3.field3787 += (int) (Math.pow(2.0D, (double) var11.field2430 * var9) * 128.0D + 0.5D);
                } else {
                    arg3.field3787 += 128;
                }
                while (arg3.field3801 < var11.field2433.length - 2 && (var11.field2433[arg3.field3801 + 2] & 0xFF) << 8 < arg3.field3787) {
                    arg3.field3801 += 2;
                }
                if (var11.field2433.length - 2 == arg3.field3801 && var11.field2433[arg3.field3801 + 1] == 0) {
                    var6 = true;
                }
            }
            if (arg3.field3782 >= 0 && var11.field2445 != null && (this.field3285[arg3.field3808] & 0x1) == 0 && (arg3.field3811 < 0 || this.field3277[arg3.field3808][arg3.field3811] != arg3)) {
                if (var11.field2443 > 0) {
                    arg3.field3782 += (int) (Math.pow(2.0D, (double) var11.field2443 * var9) * 128.0D + 0.5D);
                } else {
                    arg3.field3782 += 128;
                }
                while (arg3.field3790 < var11.field2445.length - 2 && arg3.field3782 > (var11.field2445[arg3.field3790 + 2] & 0xFF) << 8) {
                    arg3.field3790 += 2;
                }
                if (var11.field2445.length - 2 == arg3.field3790) {
                    var6 = true;
                }
            }
            if (!var6) {
                arg3.field3792.method606(arg3.field3810, this.method1181(arg3, (byte) 127), this.method1164((byte) 104, arg3));
                return false;
            }
            arg3.field3792.method647(arg3.field3810);
            if (arg1 == null) {
                arg3.field3792.method622(arg2);
            } else {
                arg3.field3792.method620(arg1, arg0, arg2);
            }
            if (arg3.field3792.method624()) {
                this.field3316.field2335.method1196(arg3.field3792);
            }
            arg3.method1311((byte) 88);
            if (arg3.field3782 >= 0) {
                arg3.method452(true);
                if (arg3.field3811 > 0 && this.field3277[arg3.field3808][arg3.field3811] == arg3) {
                    this.field3277[arg3.field3808][arg3.field3811] = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "(IIB)V")
    private final void method1179(int arg0, int arg1, byte arg2) {
        field3270++;
        if (arg2 == -93) {
            this.field3255[arg0] = arg1;
        }
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "(I)V")
    public final synchronized void method622(int arg0) {
        field3258++;
        if (this.field3269.method1065()) {
            int var2 = this.field3269.field2925 * this.field3304 / class23.field519;
            do {
                long var3 = this.field3314 + (long) arg0 * (long) var2;
                if (this.field3315 - var3 >= 0L) {
                    this.field3314 = var3;
                    break;
                }
                int var5 = (int) (((long) var2 + this.field3315 - this.field3314 - 1L) / (long) var2);
                this.field3314 += (long) var2 * (long) var5;
                this.field3316.method622(var5);
                this.method1187(0);
                arg0 -= var5;
            } while (this.field3269.method1065());
        }
        this.field3316.method622(arg0);
    }

    @OriginalMember(owner = "sh", name = "e", descriptor = "(B)V")
    public final synchronized void method1180(byte arg0) {
        if (arg0 >= -51) {
            method1162(true);
        }
        for (class114 var2 = (class114) this.field3262.method338((byte) 82); var2 != null; var2 = (class114) this.field3262.method335(1)) {
            var2.method844((byte) 53);
        }
        field3248++;
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "(Lvf;B)I")
    private final int method1181(class199 arg0, byte arg1) {
        field3284++;
        if (arg1 < 90) {
            this.method650();
        }
        int var3 = this.field3249[arg0.field3808] * this.field3243[arg0.field3808] + 4096 >> 13;
        class126 var4 = arg0.field3814;
        int var5 = var3 * var3 + 16384 >> 15;
        int var6 = arg0.field3798 * var5 + 16384 >> 15;
        int var7 = this.field3273 * var6 + 128 >> 8;
        if (var4.field2426 > 0) {
            var7 = (int) (Math.pow(0.5D, (double) arg0.field3797 * 1.953125E-5D * (double) var4.field2426) * (double) var7 + 0.5D);
        }
        if (var4.field2433 != null) {
            int var8 = var4.field2433[arg0.field3801 + 1];
            int var9 = arg0.field3787;
            if (arg0.field3801 < var4.field2433.length - 2) {
                int var10 = (var4.field2433[arg0.field3801 + 2] & 0xFF) << 8;
                int var11 = (var4.field2433[arg0.field3801] & 0xFF) << 8;
                var8 += (var4.field2433[arg0.field3801 + 3] - var8) * (var9 - var11) / (var10 - var11);
            }
            var7 = var7 * var8 + 32 >> 6;
        }
        if (arg0.field3782 > 0 && var4.field2445 != null) {
            int var12 = arg0.field3782;
            int var13 = var4.field2445[arg0.field3790 + 1];
            if (arg0.field3790 < var4.field2445.length - 2) {
                int var14 = (var4.field2445[arg0.field3790 + 2] & 0xFF) << 8;
                int var15 = (var4.field2445[arg0.field3790] & 0xFF) << 8;
                var13 += (var4.field2445[arg0.field3790 + 3] - var13) * (var12 - var15) / (var14 - var15);
            }
            var7 = var7 * var13 + 32 >> 6;
        }
        return var7;
    }

    @OriginalMember(owner = "sh", name = "b", descriptor = "()Lkc;")
    public final synchronized class97 method613() {
        field3302++;
        return this.field3316;
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "(ILs;Lbg;ILcb;)Z")
    public final synchronized boolean method1182(int arg0, class166 arg1, class18 arg2, int arg3, class23 arg4) {
        arg1.method1118();
        boolean var6 = true;
        int[] var7 = null;
        if (arg3 > 0) {
            var7 = new int[] { arg3 };
        }
        class36 var8 = (class36) arg1.field3107.method338((byte) 105);
        if (arg0 <= 52) {
            return true;
        }
        while (var8 != null) {
            label30: {
                int var9 = (int) var8.field1381;
                class114 var10 = (class114) this.field3262.method337((long) var9, (byte) -76);
                if (var10 == null) {
                    var10 = class116.method852((byte) 86, arg2, var9);
                    if (var10 == null) {
                        var6 = false;
                        break label30;
                    }
                    this.field3262.method339((long) var9, false, var10);
                }
                if (!var10.method840(-8812, var8.field795, arg4, var7)) {
                    var6 = false;
                }
            }
            var8 = (class36) arg1.field3107.method335(1);
        }
        field3310++;
        if (var6) {
            arg1.method1117();
        }
        return var6;
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "(IIBI)V")
    private final void method1183(int arg0, int arg1, byte arg2, int arg3) {
        field3245++;
        this.method1165(arg0, arg1, 85, 64);
        if ((this.field3285[arg0] & 0x2) != 0) {
            for (class199 var5 = (class199) this.field3316.field2324.method1226(127); var5 != null; var5 = (class199) this.field3316.field2324.method1233((byte) -101)) {
                if (var5.field3808 == arg0 && var5.field3782 < 0) {
                    this.field3291[arg0][var5.field3813] = null;
                    this.field3291[arg0][arg1] = var5;
                    int var6 = (var5.field3807 * var5.field3788 >> 12) + var5.field3781;
                    var5.field3788 = 4096;
                    var5.field3781 += arg1 - var5.field3813 << 8;
                    var5.field3807 = var6 - var5.field3781;
                    var5.field3813 = arg1;
                    return;
                }
            }
        }
        class114 var7 = (class114) this.field3262.method337((long) this.field3279[arg0], (byte) -122);
        if (var7 == null) {
            return;
        }
        class94 var8 = var7.field2262[arg1];
        if (var8 == null) {
            return;
        }
        class199 var9 = new class199();
        var9.field3799 = var8;
        var9.field3805 = var7;
        var9.field3808 = arg0;
        var9.field3814 = var7.field2259[arg1];
        var9.field3811 = var7.field2257[arg1];
        var9.field3813 = arg1;
        var9.field3798 = arg3 * arg3 * var7.field2255 * var7.field2258[arg1] + 1024 >> 11;
        var9.field3804 = var7.field2263[arg1] & 0xFF;
        var9.field3781 = (arg1 << 8) - (var7.field2254[arg1] & 0x7FFF);
        var9.field3797 = 0;
        var9.field3787 = 0;
        var9.field3782 = -1;
        var9.field3790 = 0;
        if (arg2 != -28) {
            return;
        }
        var9.field3801 = 0;
        if (this.field3240[arg0] == 0) {
            var9.field3792 = class87.method625(var8, this.method1193(var9, (byte) 37), this.method1181(var9, (byte) 96), this.method1164((byte) 93, var9));
        } else {
            var9.field3792 = class87.method625(var8, this.method1193(var9, (byte) 37), 0, this.method1164((byte) 125, var9));
            this.method1173(var9, var7.field2254[arg1] < 0, -4123);
        }
        if (var7.field2254[arg1] < 0) {
            var9.field3792.method609(-1);
        }
        if (var9.field3811 >= 0) {
            class199 var10 = this.field3277[arg0][var9.field3811];
            if (var10 != null && var10.field3782 < 0) {
                this.field3291[arg0][var10.field3813] = null;
                var10.field3782 = 0;
            }
            this.field3277[arg0][var9.field3811] = var9;
        }
        this.field3316.field2324.method1231(var9, arg2 + 28);
        this.field3291[arg0][arg1] = var9;
    }

    @OriginalMember(owner = "sh", name = "b", descriptor = "(IIB)V")
    private final void method1184(int arg0, int arg1, byte arg2) {
        field3247++;
        if (arg2 != -9) {
            this.method1181(null, (byte) -108);
        }
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "(ZIII)V")
    private final void method1185(boolean arg0, int arg1, int arg2, int arg3) {
        field3286++;
        if (!arg0) {
            this.method630();
        }
    }

    @OriginalMember(owner = "sh", name = "b", descriptor = "(III)V")
    private final void method1186(int arg0, int arg1, int arg2) {
        this.field3264[arg0] = arg1;
        field3259++;
        this.field3266[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
        if (arg2 != 2795) {
            this.method1165(-13, 123, 61, -58);
        }
    }

    @OriginalMember(owner = "sh", name = "e", descriptor = "(I)V")
    private final void method1187(int arg0) {
        field3295++;
        int var2 = this.field3313;
        long var3 = this.field3315;
        int var5 = this.field3312;
        while (this.field3312 == var5) {
            while (this.field3269.field2926[var2] == var5) {
                this.field3269.method1059(var2);
                int var6 = this.field3269.method1052(var2);
                if (var6 == 1) {
                    this.field3269.method1062();
                    this.field3269.method1060(var2);
                    if (this.field3269.method1066()) {
                        if (!this.field3311 || var5 == 0) {
                            this.method1175(-59);
                            this.field3269.method1051();
                            return;
                        }
                        this.field3269.method1053(var3);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method1189(arg0 ^ 0xFFFFFF94, var6);
                }
                this.field3269.method1055(var2);
                this.field3269.method1060(var2);
            }
            var2 = this.field3269.method1057();
            var5 = this.field3269.field2926[var2];
            var3 = this.field3269.method1063(var5);
        }
        this.field3312 = var5;
        this.field3313 = var2;
        this.field3315 = var3;
        if (arg0 != 0) {
            this.field3242 = null;
        }
    }

    @OriginalMember(owner = "sh", name = "c", descriptor = "(III)V")
    public final synchronized void method1188(int arg0, int arg1, int arg2) {
        this.method1172(arg2, true, arg0);
        field3246++;
        if (arg1 != 16) {
            this.method1175(-64);
        }
    }

    @OriginalMember(owner = "sh", name = "c", descriptor = "(II)V")
    private final void method1189(int arg0, int arg1) {
        if (arg0 >= -85) {
            return;
        }
        field3265++;
        int var3 = arg1 & 0xF0;
        if (var3 == 128) {
            int var4 = arg1 >> 8 & 0x7F;
            int var5 = arg1 >> 16 & 0x7F;
            int var6 = arg1 & 0xF;
            this.method1165(var6, var4, -110, var5);
        } else if (var3 == 144) {
            int var7 = arg1 & 0xF;
            int var8 = arg1 >> 8 & 0x7F;
            int var9 = arg1 >> 16 & 0x7F;
            if (var9 <= 0) {
                this.method1165(var7, var8, 122, 64);
            } else {
                this.method1183(var7, var8, (byte) -28, var9);
            }
        } else if (var3 == 160) {
            int var10 = arg1 & 0xF;
            int var11 = arg1 >> 16 & 0x7F;
            int var12 = arg1 >> 8 & 0x7F;
            this.method1185(true, var12, var10, var11);
        } else if (var3 == 176) {
            int var13 = arg1 & 0xF;
            int var14 = arg1 >> 8 & 0x7F;
            int var15 = arg1 >> 16 & 0x7F;
            if (var14 == 0) {
                this.field3261[var13] = class170.method1140(this.field3261[var13], -2080769) + (var15 << 14);
            }
            if (var14 == 32) {
                this.field3261[var13] = (var15 << 7) + class170.method1140(-16257, this.field3261[var13]);
            }
            if (var14 == 1) {
                this.field3253[var13] = class170.method1140(-16257, this.field3253[var13]) + (var15 << 7);
            }
            if (var14 == 33) {
                this.field3253[var13] = class170.method1140(this.field3253[var13], -128) + var15;
            }
            if (var14 == 5) {
                this.field3242[var13] = class170.method1140(this.field3242[var13], -16257) + (var15 << 7);
            }
            if (var14 == 37) {
                this.field3242[var13] = class170.method1140(-128, this.field3242[var13]) + var15;
            }
            if (var14 == 7) {
                this.field3243[var13] = class170.method1140(this.field3243[var13], -16257) + (var15 << 7);
            }
            if (var14 == 39) {
                this.field3243[var13] = var15 + class170.method1140(-128, this.field3243[var13]);
            }
            if (var14 == 10) {
                this.field3254[var13] = (var15 << 7) + class170.method1140(this.field3254[var13], -16257);
            }
            if (var14 == 42) {
                this.field3254[var13] = var15 + class170.method1140(this.field3254[var13], -128);
            }
            if (var14 == 11) {
                this.field3249[var13] = (var15 << 7) + class170.method1140(this.field3249[var13], -16257);
            }
            if (var14 == 43) {
                this.field3249[var13] = var15 + class170.method1140(-128, this.field3249[var13]);
            }
            if (var14 == 64) {
                if (var15 >= 64) {
                    this.field3285[var13] = class31.method262(this.field3285[var13], 1);
                } else {
                    this.field3285[var13] = class170.method1140(this.field3285[var13], -2);
                }
            }
            if (var14 == 65) {
                if (var15 >= 64) {
                    this.field3285[var13] = class31.method262(this.field3285[var13], 2);
                } else {
                    this.method1177(51, var13);
                    this.field3285[var13] = class170.method1140(this.field3285[var13], -3);
                }
            }
            if (var14 == 99) {
                this.field3307[var13] = (var15 << 7) + class170.method1140(127, this.field3307[var13]);
            }
            if (var14 == 98) {
                this.field3307[var13] = class170.method1140(this.field3307[var13], 16256) + var15;
            }
            if (var14 == 101) {
                this.field3307[var13] = (var15 << 7) + class170.method1140(127, this.field3307[var13]) + 16384;
            }
            if (var14 == 100) {
                this.field3307[var13] = class170.method1140(16256, this.field3307[var13]) + var15 + 16384;
            }
            if (var14 == 120) {
                this.method1190(0, var13);
            }
            if (var14 == 121) {
                this.method1166((byte) -117, var13);
            }
            if (var14 == 123) {
                this.method1168(var13, 0);
            }
            if (var14 == 6) {
                int var16 = this.field3307[var13];
                if (var16 == 16384) {
                    this.field3267[var13] = class170.method1140(this.field3267[var13], -16257) + (var15 << 7);
                }
            }
            if (var14 == 38) {
                int var17 = this.field3307[var13];
                if (var17 == 16384) {
                    this.field3267[var13] = var15 + class170.method1140(-128, this.field3267[var13]);
                }
            }
            if (var14 == 16) {
                this.field3240[var13] = (var15 << 7) + class170.method1140(this.field3240[var13], -16257);
            }
            if (var14 == 48) {
                this.field3240[var13] = class170.method1140(this.field3240[var13], -128) + var15;
            }
            if (var14 == 81) {
                if (var15 < 64) {
                    this.method1191(var13, 128);
                    this.field3285[var13] = class170.method1140(this.field3285[var13], -5);
                } else {
                    this.field3285[var13] = class31.method262(this.field3285[var13], 4);
                }
            }
            if (var14 == 17) {
                this.method1186(var13, (this.field3264[var13] & 0xFFFFC07F) + (var15 << 7), 2795);
            }
            if (var14 == 49) {
                this.method1186(var13, (this.field3264[var13] & 0xFFFFFF80) + var15, 2795);
            }
        } else if (var3 == 192) {
            int var18 = arg1 & 0xF;
            int var19 = arg1 >> 8 & 0x7F;
            this.method1169(-113, this.field3261[var18] + var19, var18);
        } else if (var3 == 208) {
            int var20 = arg1 & 0xF;
            int var21 = arg1 >> 8 & 0x7F;
            this.method1184(var21, var20, (byte) -9);
        } else if (var3 == 224) {
            int var22 = arg1 & 0xF;
            int var23 = (arg1 >> 9 & 0x3F80) + (arg1 >> 8 & 0x7F);
            this.method1179(var22, var23, (byte) -93);
        } else {
            int var24 = arg1 & 0xFF;
            if (var24 == 255) {
                this.method1175(-89);
            }
        }
    }

    @OriginalMember(owner = "sh", name = "d", descriptor = "(II)V")
    private final void method1190(int arg0, int arg1) {
        field3303++;
        class199 var3 = (class199) this.field3316.field2324.method1230(27);
        if (arg0 != 0) {
            this.field3266 = null;
        }
        while (var3 != null) {
            if (arg1 < 0 || var3.field3808 == arg1) {
                if (var3.field3792 != null) {
                    var3.field3792.method647(class23.field519 / 100);
                    if (var3.field3792.method624()) {
                        this.field3316.field2335.method1196(var3.field3792);
                    }
                    var3.method1311((byte) 113);
                }
                if (var3.field3782 < 0) {
                    this.field3291[var3.field3808][var3.field3813] = null;
                }
                var3.method452(true);
            }
            var3 = (class199) this.field3316.field2324.method1234(-1);
        }
    }

    @OriginalMember(owner = "sh", name = "e", descriptor = "(II)V")
    private final void method1191(int arg0, int arg1) {
        field3256++;
        if ((this.field3285[arg0] & 0x4) != 0) {
            for (class199 var3 = (class199) this.field3316.field2324.method1230(arg1 ^ 0xF5); var3 != null; var3 = (class199) this.field3316.field2324.method1234(-1)) {
                if (var3.field3808 == arg0) {
                    var3.field3802 = 0;
                }
            }
        }
        if (arg1 != 128) {
            this.method1195((byte) -62);
        }
    }

    @OriginalMember(owner = "sh", name = "a", descriptor = "(IB)V")
    public final synchronized void method1192(int arg0, byte arg1) {
        this.field3273 = arg0;
        if (arg1 != -34) {
            this.field3307 = null;
        }
        field3274++;
    }

    @OriginalMember(owner = "sh", name = "b", descriptor = "(Lvf;B)I")
    private final int method1193(class199 arg0, byte arg1) {
        field3278++;
        int var3 = (arg0.field3807 * arg0.field3788 >> 12) + arg0.field3781;
        class126 var4 = arg0.field3814;
        int var5 = ((this.field3255[arg0.field3808] - 8192) * this.field3267[arg0.field3808] >> 12) + var3;
        if (var4.field2425 > 0 && (var4.field2431 > 0 || this.field3253[arg0.field3808] > 0)) {
            int var6 = var4.field2439 << 1;
            int var7 = var4.field2431 << 2;
            if (arg0.field3809 < var6) {
                var7 = arg0.field3809 * var7 / var6;
            }
            int var8 = (this.field3253[arg0.field3808] >> 7) + var7;
            double var9 = Math.sin((double) (arg0.field3791 & 0x1FF) * 0.01227184630308513D);
            var5 += (int) ((double) var8 * var9);
        }
        if (arg1 != 37) {
            this.field3262 = null;
        }
        int var11 = (int) ((double) (arg0.field3799.field1931 * 256) * Math.pow(2.0D, (double) var5 * 3.255208333333333E-4D) / (double) class23.field519 + 0.5D);
        return var11 >= 1 ? var11 : 1;
    }

    @OriginalMember(owner = "sh", name = "b", descriptor = "(BLvf;)Z")
    public final boolean method1194(byte arg0, class199 arg1) {
        if (arg0 < 41) {
            method1174(-59L, 83);
        }
        field3275++;
        if (arg1.field3792 != null) {
            return false;
        }
        if (arg1.field3782 >= 0) {
            arg1.method452(true);
            if (arg1.field3811 > 0 && this.field3277[arg1.field3808][arg1.field3811] == arg1) {
                this.field3277[arg1.field3808][arg1.field3811] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "sh", name = "f", descriptor = "(B)V")
    public final synchronized void method1195(byte arg0) {
        field3282++;
        this.field3269.method1051();
        this.method1175(-106);
        if (arg0 <= 20) {
            this.field3243 = null;
        }
    }

    @OriginalMember(owner = "sh", name = "<init>", descriptor = "()V")
    public class174() {
        this.method1175(-123);
    }
}
