import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class118 extends class228 {

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "[Lmj;")
    public static class113[] field2083 = new class113[50];

    @OriginalMember(owner = "client!hh", name = "db", descriptor = "Loa;")
    private static class99 field2093 = class221.method1463(2844, "Loading sprites )2 ");

    @OriginalMember(owner = "client!hh", name = "cb", descriptor = "I")
    public static int field2092 = 0;

    @OriginalMember(owner = "client!hh", name = "eb", descriptor = "I")
    public static int field2094 = 0;

    @OriginalMember(owner = "client!hh", name = "Z", descriptor = "Loa;")
    public static class99 field2089 = class221.method1463(2844, "overlay2");

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "Loa;")
    public static class99 field2082 = field2093;

    @OriginalMember(owner = "client!hh", name = "gb", descriptor = "I")
    public static int field2096 = 0;

    @OriginalMember(owner = "client!hh", name = "fb", descriptor = "Lgd;")
    public static class74 field2095 = new class74(128);

    @OriginalMember(owner = "client!hh", name = "kb", descriptor = "Loa;")
    public static class99 field2100 = class221.method1463(2844, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!hh", name = "jb", descriptor = "I")
    public static int field2099 = -2;

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!hh", name = "X", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!hh", name = "Y", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!hh", name = "ab", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!hh", name = "hb", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!hh", name = "ib", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!hh", name = "lb", descriptor = "Ltg;")
    public static class182 field2101;

    @OriginalMember(owner = "client!hh", name = "bb", descriptor = "[Lij;")
    private class196[] field2091;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIBI)V")
    public static final void method791(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var6 = -arg5 + arg1;
        ++field2085;
        int var7 = arg3 - arg2;
        if (var7 != 0) {
            if (var6 == 0) {
                class206.method1381(arg2, arg5, 122, arg3, arg0);
            } else {
                if (arg4 < 123) {
                    method794(74, -73, -39, 125, (class99) null, -96L, 72);
                }
                int var8 = (var6 << 12) / var7;
                int var9 = arg5 - (arg2 * var8 >> 12);
                int var10;
                int var11;
                if (~class197.field3437 < ~arg3) {
                    var10 = class197.field3437;
                    var11 = var9 - -(class197.field3437 * var8 >> 12);
                } else if (~class79.field1395 <= ~arg3) {
                    var11 = arg1;
                    var10 = arg3;
                } else {
                    var10 = class79.field1395;
                    var11 = (class79.field1395 * var8 >> 12) + var9;
                }
                if (var11 >= class178.field3101) {
                    if (~var11 < ~class137.field2414) {
                        var11 = class137.field2414;
                        var10 = (-var9 + class137.field2414 << 12) / var8;
                    }
                } else {
                    var11 = class178.field3101;
                    var10 = (class178.field3101 - var9 << 12) / var8;
                }
                int var12;
                int var13;
                if (class197.field3437 <= arg2) {
                    if (~class79.field1395 <= ~arg2) {
                        var12 = arg2;
                        var13 = arg5;
                    } else {
                        var13 = var9 - -(class79.field1395 * var8 >> 12);
                        var12 = class79.field1395;
                    }
                } else {
                    var12 = class197.field3437;
                    var13 = var9 - -(class197.field3437 * var8 >> 12);
                }
                if (~var13 <= ~class178.field3101) {
                    if (var13 > class137.field2414) {
                        var12 = (-var9 + class137.field2414 << 12) / var8;
                        var13 = class137.field2414;
                    }
                } else {
                    var12 = (class178.field3101 - var9 << 12) / var8;
                    var13 = class178.field3101;
                }
                class224.method1482(var13, var12, var11, arg0, true, var10);
            }
        } else {
            if (~var6 != -1) {
                class227.method1494(arg0, arg2, arg5, (byte) -127, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class118() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
        if (arg0 != -27) {
            return null;
        } else {
            if (super.field3948.field4791) {
                int var4 = class234.field4046;
                int var5 = class179.field3122;
                int[][][] var6 = super.field3948.method1799((byte) 28);
                int[][] var7 = new int[var5][var4];
                this.method793((byte) -128, var7);
                for (int var8 = 0; ~var8 > ~class179.field3122; ++var8) {
                    int[][] var9 = var6[var8];
                    int[] var10 = var9[0];
                    int[] var11 = var7[var8];
                    int[] var12 = var9[2];
                    int[] var13 = var9[1];
                    for (int var14 = 0; ~var14 > ~class234.field4046; ++var14) {
                        int var15 = var11[var14];
                        var12[var14] = class71.method502(4080, var15 << 4);
                        var13[var14] = class71.method502(4080, var15 >> 4);
                        var10[var14] = class71.method502(4080, var15 >> 12);
                    }
                }
            }
            ++field2084;
            return var3;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg2 != -7618) {
            method791(-7, -113, 29, -89, (byte) 120, -56);
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field3943 = arg1.method1693((byte) -123) == 1;
            }
        } else {
            this.field2091 = new class196[arg1.method1693((byte) 33)];
            for (int var4 = 0; var4 < this.field2091.length; ++var4) {
                int var5 = arg1.method1693((byte) -103);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field2091[var4] = class132.method883(arg2 + 7624, arg1);
                            }
                        } else {
                            this.field2091[var4] = class33.method273(class28.method249(arg2, -13024), arg1);
                        }
                    } else {
                        this.field2091[var4] = class290.method1945((byte) 127, arg1);
                    }
                } else {
                    this.field2091[var4] = class212.method1422(arg1, 115);
                }
            }
        }
        ++field2086;
    }

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(B)V")
    public static final void method792(byte arg0) {
        ++field2087;
        class169.method1147();
        for (int var1 = 0; var1 < 4; ++var1) {
            class177.field3091[var1].method864((byte) -109);
        }
        if (arg0 >= 107) {
            System.gc();
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B[[I)V")
    private final void method793(byte arg0, int[][] arg1) {
        ++field2088;
        if (arg0 >= -92) {
            this.method19((byte) 126, 86);
        }
        int var3 = class179.field3122;
        int var4 = class234.field4046;
        class55.method376(arg1, -26304);
        class125.method830(class250.field4309, 0, class190.field3345, 0, (byte) -83);
        if (this.field2091 != null) {
            for (int var5 = 0; ~this.field2091.length < ~var5; ++var5) {
                class196 var6 = this.field2091[var5];
                int var7 = var6.field3421;
                int var8 = var6.field3412;
                if (var7 >= 0) {
                    if (var8 < 0) {
                        var6.method271(var4, var3, (byte) 108);
                    } else {
                        var6.method277(var4, var3, 0);
                    }
                } else if (~var8 <= -1) {
                    var6.method275(var4, var3, 205);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIILoa;JI)V")
    public static final void method794(int arg0, int arg1, int arg2, int arg3, class99 arg4, long arg5, int arg6) {
        ++field2090;
        class261 var8 = new class261(128);
        var8.method1691(10, (byte) 53);
        var8.method1745((int) (99999.0D * Math.random()), (byte) 5);
        var8.method1745(524, (byte) 5);
        var8.method1699(arg5, arg1 ^ -99999894);
        var8.method1701((int) (9.9999999E7D * Math.random()), 4994);
        var8.method1725(arg4, 97);
        var8.method1701((int) (Math.random() * 9.9999999E7D), 4994);
        var8.method1745(class64.field1083, (byte) 5);
        var8.method1691(arg3, (byte) 53);
        var8.method1691(arg2, (byte) 53);
        var8.method1701((int) (Math.random() * 9.9999999E7D), 4994);
        var8.method1745(arg6, (byte) 5);
        var8.method1745(arg0, (byte) 5);
        var8.method1701((int) ((double) arg1 * Math.random()), 4994);
        var8.method1717(class124.field2170, class103.field1738, arg1 + -99999876);
        class131.field2277.field4587 = 0;
        class131.field2277.method1691(5, (byte) 53);
        class131.field2277.method1691(var8.field4587, (byte) 53);
        class131.field2277.method1703(arg1 ^ 92937984, var8.field4587, var8.field4619, 0);
        class234.field4031 = 0;
        class236.field4073 = 1;
        field2099 = -3;
        class98.field1643 = 0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        ++field2098;
        int[] var3 = super.field3952.method1262(arg0, 7492);
        if (super.field3952.field3276) {
            this.method793((byte) -95, super.field3952.method1261(-104));
        }
        if (arg1 != -3) {
            field2089 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "(B)Z")
    public static final boolean method795(byte arg0) {
        ++field2097;
        if (arg0 != 124) {
            field2092 = 11;
        }
        return class53.field873 != 0 ? true : class116.field2065.method175((byte) 113);
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
    public static void method796(int arg0) {
        field2082 = null;
        field2100 = null;
        field2095 = null;
        if (arg0 != -27110) {
            field2089 = null;
        }
        field2089 = null;
        field2101 = null;
        field2093 = null;
        field2083 = null;
    }
}
