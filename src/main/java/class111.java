import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class111 extends class205 {

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
    private int field2070 = 0;

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
    private int field2068 = 4096;

    @OriginalMember(owner = "client!kc", name = "sb", descriptor = "I")
    private int field2089 = 0;

    @OriginalMember(owner = "client!kc", name = "tb", descriptor = "I")
    private int field2090 = 12288;

    @OriginalMember(owner = "client!kc", name = "db", descriptor = "I")
    private int field2074 = 2048;

    @OriginalMember(owner = "client!kc", name = "rb", descriptor = "I")
    private int field2088 = 2048;

    @OriginalMember(owner = "client!kc", name = "ub", descriptor = "I")
    private int field2091 = 8192;

    @OriginalMember(owner = "client!kc", name = "eb", descriptor = "Lvd;")
    private static class222 field2075 = class212.method1357("Loaded wordpack", 10731);

    @OriginalMember(owner = "client!kc", name = "ib", descriptor = "Lvd;")
    public static class222 field2079 = class212.method1357(")2", 10731);

    @OriginalMember(owner = "client!kc", name = "cb", descriptor = "Lvd;")
    public static class222 field2073 = class212.method1357("Lade Texturen )2 ", 10731);

    @OriginalMember(owner = "client!kc", name = "gb", descriptor = "[I")
    public static int[] field2077 = new int[32];

    @OriginalMember(owner = "client!kc", name = "fb", descriptor = "[Lka;")
    public static class109[] field2076 = new class109[2048];

    @OriginalMember(owner = "client!kc", name = "lb", descriptor = "Lvd;")
    public static class222 field2082 = field2075;

    @OriginalMember(owner = "client!kc", name = "pb", descriptor = "Z")
    public static boolean field2086 = false;

    @OriginalMember(owner = "client!kc", name = "jb", descriptor = "Lcf;")
    public static class28 field2080 = new class28();

    @OriginalMember(owner = "client!kc", name = "wb", descriptor = "Lvd;")
    public static class222 field2093 = class212.method1357("Angreifen", 10731);

    @OriginalMember(owner = "client!kc", name = "Ab", descriptor = "Lvd;")
    public static class222 field2097 = class212.method1357("cookieprefix", 10731);

    @OriginalMember(owner = "client!kc", name = "zb", descriptor = "Lvd;")
    private static class222 field2096 = class212.method1357("Please use a different world)3", 10731);

    @OriginalMember(owner = "client!kc", name = "xb", descriptor = "Lvd;")
    public static class222 field2094 = field2096;

    @OriginalMember(owner = "client!kc", name = "vb", descriptor = "Lvd;")
    public static class222 field2092 = field2096;

    @OriginalMember(owner = "client!kc", name = "yb", descriptor = "Lig;")
    public static class93 field2095 = new class93(64);

    @OriginalMember(owner = "client!kc", name = "Eb", descriptor = "J")
    public static volatile long field2101 = 0L;

    @OriginalMember(owner = "client!kc", name = "Fb", descriptor = "Lvd;")
    public static class222 field2102 = class212.method1357("oder ung-Ultiges Passwort)3", 10731);

    @OriginalMember(owner = "client!kc", name = "Bb", descriptor = "[Z")
    public static boolean[] field2098 = new boolean[100];

    @OriginalMember(owner = "client!kc", name = "Db", descriptor = "Lvd;")
    public static class222 field2100 = class212.method1357("leuchten2:", 10731);

    @OriginalMember(owner = "client!kc", name = "Cb", descriptor = "Lvd;")
    private static class222 field2099 = class212.method1357("Starting game engine)3)3)3", 10731);

    @OriginalMember(owner = "client!kc", name = "Gb", descriptor = "Lvd;")
    public static class222 field2103 = field2099;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!kc", name = "bb", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!kc", name = "hb", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!kc", name = "kb", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!kc", name = "mb", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!kc", name = "nb", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!kc", name = "ob", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!kc", name = "qb", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        if (arg0) {
            field2073 = null;
        }
        ++field2071;
        class121.method771((byte) 62);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V")
    public static final void method717(byte arg0) {
        if (class104.field1929 > class229.field4313) {
            class229.field4313 /= 30.0D;
            if (class229.field4313 > class104.field1929) {
                class229.field4313 = class104.field1929;
            }
            class21.method207(-1);
        } else if (class229.field4313 > class104.field1929) {
            class229.field4313 /= 30.0D;
            if (class104.field1929 > class229.field4313) {
                class229.field4313 = class104.field1929;
            }
            class21.method207(-1);
        }
        if (arg0 <= -110) {
            if (~class121.field2314 != 0 && ~class218.field4052 != 0) {
                int var1 = class218.field4052 - class122.field2334;
                int var2 = -class175.field3287 + class121.field2314;
                if (~var2 > -3 || var2 > 2) {
                    var2 >>= 4;
                }
                class175.field3287 += var2;
                if (~var1 > -3 || var1 > 2) {
                    var1 >>= 4;
                }
                if (~var2 == -1 && ~var1 == -1) {
                    class121.field2314 = -1;
                    class218.field4052 = -1;
                }
                class122.field2334 += var1;
                class21.method207(-1);
            }
            ++field2085;
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(B)V")
    public static void method718(byte arg0) {
        field2095 = null;
        field2079 = null;
        field2077 = null;
        field2082 = null;
        field2103 = null;
        field2075 = null;
        if (arg0 <= -127) {
            field2096 = null;
            field2093 = null;
            field2100 = null;
            field2076 = null;
            field2094 = null;
            field2098 = null;
            field2097 = null;
            field2099 = null;
            field2092 = null;
            field2080 = null;
            field2102 = null;
            field2073 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(B)V")
    public static final void method719(byte arg0) {
        ++field2069;
        class179.field3327 = 0;
        if (arg0 <= 46) {
            field2096 = null;
        }
        class162.field3088 = 0;
        class217.method1379((byte) 112);
        class51.method369(0);
        class26.method224(0);
        for (int var1 = 0; class179.field3327 > var1; ++var1) {
            int var3 = class42.field900[var1];
            if (~class175.field3280 != ~class202.field3696[var3].field1348) {
                class202.field3696[var3].field3558 = null;
                class202.field3696[var3] = null;
            }
        }
        if (class70.field1306 != class21.field505.field2053) {
            throw new RuntimeException("gnp1 pos:" + class21.field505.field2053 + " psize:" + class70.field1306);
        } else {
            for (int var2 = 0; var2 < class173.field3263; ++var2) {
                if (class202.field3696[class113.field2123[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class173.field3263);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field2091 = arg0.method675(2);
                                }
                            } else {
                                this.field2068 = arg0.method675(2);
                            }
                        } else {
                            this.field2090 = arg0.method675(2);
                        }
                    } else {
                        this.field2074 = arg0.method675(2);
                    }
                } else {
                    this.field2089 = arg0.method675(2);
                }
            } else {
                this.field2070 = arg0.method675(2);
            }
        } else {
            this.field2088 = arg0.method675(2);
        }
        int var5 = 78 / ((-47 - arg1) / 34);
        ++field2078;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(IBI)Z")
    private final boolean method720(int arg0, byte arg1, int arg2) {
        int var4 = (-arg0 + arg2) * this.field2090 >> 12;
        ++field2084;
        int var5 = class8.field135[(1046279 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field2090;
        int var7 = (var6 << 12) / this.field2091;
        if (arg1 <= 2) {
            this.method2((class109) null, (byte) -92, -15);
        }
        int var8 = this.field2068 * var7 >> 12;
        return ~var8 < ~(arg0 + arg2) && ~(-var8) > ~(arg0 + arg2);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class111() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIB)Z")
    private final boolean method721(int arg0, int arg1, byte arg2) {
        int var4 = (arg1 - -arg0) * this.field2090 >> 12;
        ++field2072;
        int var5 = class8.field135[(var4 * 255 & 1045228) >> 12];
        int var6 = (var5 << 12) / this.field2090;
        if (arg2 != -73) {
            field2080 = null;
        }
        int var7 = (var6 << 12) / this.field2091;
        int var8 = this.field2068 * var7 >> 12;
        return -arg0 + arg1 < var8 && ~(-var8) > ~(-arg0 + arg1);
    }

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)V")
    public static final void method722(int arg0) {
        ++field2067;
        int var1 = class125.field2392 + class17.field432.field1353;
        if (class6.field98[96]) {
            class137.field2649 += (-class137.field2649 + -24) / 2;
        } else if (class6.field98[97]) {
            class137.field2649 += (-class137.field2649 + 24) / 2;
        } else {
            class137.field2649 /= 2;
        }
        int var2 = class31.field658 + class17.field432.field1360;
        class116.field2218 += class137.field2649 / 2;
        if (-var1 + class1.field8 < -500 || -var1 + class1.field8 > 500 || -var2 + class229.field4312 < -500 || -var2 + class229.field4312 > 500) {
            class229.field4312 = var2;
            class1.field8 = var1;
        }
        if (arg0 != 0) {
            method722(-54);
        }
        if (!class6.field98[98]) {
            if (class6.field98[99]) {
                class99.field1854 += (-class99.field1854 + -12) / 2;
            } else {
                class99.field1854 /= 2;
            }
        } else {
            class99.field1854 += (-class99.field1854 + 12) / 2;
        }
        class140.field2697 += class99.field1854 / 2;
        if (~class229.field4312 != ~var2) {
            class229.field4312 += (-class229.field4312 + var2) / 16;
        }
        if (class1.field8 != var1) {
            class1.field8 += (-class1.field8 + var1) / 16;
        }
        class128.method806(87);
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(B)V")
    public static final void method723(byte arg0) {
        ++field2081;
        for (int var1 = 0; ~class162.field3088 < ~var1; ++var1) {
            int var2 = class122.field2341[var1];
            class38 var3 = class54.field1024[var2];
            int var4 = class21.field505.method662((byte) -91);
            if (~(4 & var4) != -1) {
                var4 += class21.field505.method662((byte) -87) << 8;
            }
            class137.method867(var4, 2, var2, var3);
        }
        if (arg0 >= -26) {
            field2099 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field2083;
        int[] var3 = super.field3810.method557(arg0 + 6978, arg1);
        if (arg0 != 0) {
            this.method4(104, 1);
        }
        if (super.field3810.field1635) {
            int var4 = class218.field4051[arg1] + -2048;
            for (int var5 = 0; var5 < class118.field2245; ++var5) {
                int var6 = this.field2070 + var4;
                int var7 = class230.field4319[var5] + -2048;
                int var8 = var6 >= -2048 ? var6 : var6 - -4096;
                int var9 = ~var8 < -2049 ? var8 - 4096 : var8;
                int var10 = var7 - -this.field2088;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = ~var11 < -2049 ? var11 - 4096 : var11;
                int var13 = this.field2089 + var7;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = this.field2074 + var4;
                int var16 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var17 = var15 >= -2048 ? var15 : var15 + 4096;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method720(var12, (byte) 107, var9) && !this.method721(var16, var18, (byte) -73) ? 0 : 4096;
            }
        }
        return var3;
    }
}
