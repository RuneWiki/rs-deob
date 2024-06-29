import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class47 extends class7 {

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "[I")
    private int[] field890 = new int[3];

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    private int field894 = 409;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "I")
    private int field900 = 4096;

    @OriginalMember(owner = "client!ef", name = "kb", descriptor = "I")
    private int field907 = 4096;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
    private int field899 = 4096;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "J")
    public static long field893 = 0L;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "Z")
    public static boolean field892 = false;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "Lob;")
    public static class141 field898 = class175.method1195(40, "Spieler");

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "[Lhi;")
    public static class79[] field888 = new class79[4];

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "Lob;")
    public static class141 field901 = class175.method1195(40, "Benutzername: ");

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "[I")
    public static int[] field903 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!ef", name = "lb", descriptor = "[I")
    public static int[] field908 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "Lob;")
    private static class141 field891 = class175.method1195(40, "slide:");

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "Lob;")
    public static class141 field902 = field891;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "Lob;")
    public static class141 field895 = field891;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!ef", name = "hb", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ef", name = "jb", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!ef", name = "mb", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!ef", name = "nb", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!ef", name = "ib", descriptor = "Z")
    public static boolean field905;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "[Lfa;")
    public static class52[] field897;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLob;)V")
    public static final void method311(byte arg0, class141 arg1) {
        ++field889;
        if (~class2.field20 <= -3) {
            if (arg1.method933((byte) -57, class211.field4035)) {
                for (int var2 = 0; ~var2 > -11; ++var2) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() + -var3.freeMemory()) / 1024L);
                class131.method836(0, (byte) -105, (class141) null, class220.method1422(new class141[] { class32.field660, class78.method543((byte) 93, var4), class59.field1151 }, -3));
            }
            if (arg1.method933((byte) -87, class98.field1946)) {
                class4.method20(25005);
            }
            if (arg1.method933((byte) -58, class37.field740)) {
                class116.field2233 = true;
            }
            if (arg1.method933((byte) -56, class66.field1281)) {
                class116.field2233 = false;
            }
            arg1.method933((byte) -74, class107.field2055);
            arg1.method933((byte) -83, class9.field160);
            if (arg1.method933((byte) -86, class6.field81)) {
                for (int var5 = 0; ~var5 > -5; ++var5) {
                    for (int var6 = 1; ~var6 > -104; ++var6) {
                        for (int var7 = 1; ~var7 > -104; ++var7) {
                            field888[var5].field1592[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method932(-93, class68.field1349) && class160.field3097 != 0) {
                class65.method439(arg1.method907((byte) 75, 6).method927(10), -12885);
            }
            if (arg1.method933((byte) -84, class191.field3690) && ~class160.field3097 == -3) {
                throw new RuntimeException();
            }
            if (arg1.method932(-76, class45.field863)) {
                class176.field3490 = arg1.method907((byte) 87, 12).method924(38).method927(10);
                class131.method836(0, (byte) -125, (class141) null, class220.method1422(new class141[] { class39.field783, class78.method543((byte) 93, class176.field3490) }, -3));
            }
            if (arg1.method933((byte) -78, class36.field720)) {
                class97.field1923 = true;
            }
        }
        ++class158.field3061;
        class7.field120.method32(123, 12885);
        class7.field120.method997(125, -1 + arg1.method908(false));
        int var8 = 72 % ((-91 - arg0) / 34);
        class7.field120.method999(arg1.method907((byte) 107, 2), (byte) -80);
    }

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "(I)V")
    public static final void method312(int arg0) {
        ++field909;
        int var1 = class114.field2188;
        int var2 = class197.field3770;
        int var3 = class203.field3890;
        int var4 = class79.field1594;
        int var5 = 6116423;
        class148.method1030(var1, var2, var3, var4, var5);
        class148.method1030(var1 + 1, var2 + 1, var3 + -2, 16, 0);
        class148.method1021(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        if (arg0 != 31970) {
            method311((byte) 47, (class141) null);
        }
        class81.field1624.method866(class11.field218, var1 - -3, var2 - -14, var5, -1);
        int var6 = class146.field2794;
        int var7 = class174.field3452;
        for (int var8 = 0; ~var8 > ~class188.field3637; ++var8) {
            int var9 = 16777215;
            int var10 = var2 - -((class188.field3637 - (var8 + 1)) * 15) + 31;
            if (~var6 < ~var1 && ~var6 > ~(var1 + var3) && ~(var10 + -13) > ~var7 && ~(var10 + 3) < ~var7) {
                var9 = 16776960;
            }
            class81.field1624.method866(class46.method306(var8, (byte) 8), var1 + 3, var10, var9, 0);
        }
        class172.method1184(false, class79.field1594, class203.field3890, class114.field2188, class197.field3770);
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class47() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        ++field904;
        int var3 = 26 % ((-42 - arg1) / 41);
        int[][] var4 = super.field97.method1396(arg0, (byte) 45);
        if (super.field97.field4093) {
            int[][] var5 = this.method42(arg0, -110, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[2];
            int[] var10 = var4[0];
            int[] var11 = var4[1];
            for (int var12 = 0; ~class117.field2272 < ~var12; ++var12) {
                int var13 = var6[var12];
                int var14 = -this.field890[0] + var13;
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (~var14 < ~this.field894) {
                    var10[var12] = var13;
                    var11[var12] = var7[var12];
                    var9[var12] = var8[var12];
                } else {
                    int var15 = var7[var12];
                    int var16 = -this.field890[1] + var15;
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (~this.field894 > ~var16) {
                        var10[var12] = var13;
                        var11[var12] = var15;
                        var9[var12] = var8[var12];
                    } else {
                        int var17 = var8[var12];
                        int var18 = -this.field890[2] + var17;
                        if (var18 < 0) {
                            var18 = -var18;
                        }
                        if (this.field894 < var18) {
                            var10[var12] = var13;
                            var11[var12] = var15;
                            var9[var12] = var17;
                        } else {
                            var10[var12] = this.field900 * var13 >> 12;
                            var11[var12] = this.field907 * var15 >> 12;
                            var9[var12] = this.field899 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
    public static void method313(byte arg0) {
        field895 = null;
        field902 = null;
        field898 = null;
        field891 = null;
        field903 = null;
        field897 = null;
        if (arg0 == 85) {
            field888 = null;
            field901 = null;
            field908 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBLpe;I)Lfa;")
    public static final class52 method314(int arg0, byte arg1, class154 arg2, int arg3) {
        ++field910;
        if (!class53.method353(-101, arg3, arg2, arg0)) {
            return null;
        } else {
            int var4 = -66 % ((-4 - arg1) / 37);
            return class115.method743(false);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        ++field896;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            int var5 = arg2.method1012(-1);
                            this.field890[0] = class15.method94(16711680, var5) << 4;
                            this.field890[2] = class15.method94(0, var5 >> 12);
                            this.field890[1] = class15.method94(var5 >> 4, 4080);
                        }
                    } else {
                        this.field900 = arg2.method1007(58);
                    }
                } else {
                    this.field907 = arg2.method1007(62);
                }
            } else {
                this.field899 = arg2.method1007(84);
            }
        } else {
            this.field894 = arg2.method1007(33);
        }
        int var6 = 86 % ((arg1 - 66) / 57);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lna;I)V")
    public static final void method315(class130 arg0, int arg1) {
        ++field906;
        if (arg1 == 3) {
            if (class164.field3170 == 1) {
                short var2 = 280;
                if (~var2 >= ~class81.field1630 && ~(var2 + 14) <= ~class81.field1630 && ~class195.field3737 <= -5 && ~class195.field3737 >= -19) {
                    class1.method3(0, -24129, 0);
                    return;
                }
                if (var2 + 15 <= class81.field1630 && ~(var2 + 80) <= ~class81.field1630 && class195.field3737 >= 4 && class195.field3737 <= 18) {
                    class1.method3(0, -24129, 1);
                    return;
                }
                short var3 = 390;
                if (~var3 >= ~class81.field1630 && ~class81.field1630 >= ~(var3 - -14) && class195.field3737 >= 4 && class195.field3737 <= 18) {
                    class1.method3(1, -24129, 0);
                    return;
                }
                if (var3 + 15 <= class81.field1630 && var3 + 80 >= class81.field1630 && class195.field3737 >= 4 && ~class195.field3737 >= -19) {
                    class1.method3(1, -24129, 1);
                    return;
                }
                short var4 = 500;
                if (~class81.field1630 <= ~var4 && ~(var4 + 14) <= ~class81.field1630 && class195.field3737 >= 4 && ~class195.field3737 >= -19) {
                    class1.method3(2, -24129, 0);
                    return;
                }
                if (~(var4 - -15) >= ~class81.field1630 && ~class81.field1630 >= ~(var4 + 80) && ~class195.field3737 <= -5 && class195.field3737 <= 18) {
                    class1.method3(2, -24129, 1);
                    return;
                }
                short var5 = 610;
                if (~var5 >= ~class81.field1630 && ~(var5 - -14) <= ~class81.field1630 && class195.field3737 >= 4 && ~class195.field3737 >= -19) {
                    class1.method3(3, -24129, 0);
                    return;
                }
                if (class81.field1630 >= var5 + 15 && class81.field1630 <= var5 + 80 && ~class195.field3737 <= -5 && class195.field3737 <= 18) {
                    class1.method3(3, -24129, 1);
                    return;
                }
                if (~class81.field1630 <= -709 && class195.field3737 >= 4 && class81.field1630 <= 758 && ~class195.field3737 >= -21) {
                    class87.field1739 = false;
                    class107.field2051.method681(0, 0);
                    class146.field2798.method681(382, 0);
                    class159.field3071.method349(-(class159.field3071.field1003 / 2) + 382, 18);
                    return;
                }
                if (class132.field2520 != -1) {
                    class25 var6 = class42.field827[class132.field2520];
                    if (var6.field468 != !class118.field2296) {
                        byte[] var7 = class220.method1422(new class141[] { var6.field476, class6.field78 }, arg1 + -6).method909(-35);
                        class50.field978 = new String(var7, 0, var7.length);
                        class87.field1739 = false;
                        class173.field3443 = var6.field475;
                        if (~class160.field3097 != -1) {
                            class160.field3097 = 0;
                            class169.field3251 = 443;
                            class164.field3178 = 43594;
                            class69.field1354 = 43594;
                        }
                        class107.field2051.method681(0, 0);
                        class146.field2798.method681(382, 0);
                        class159.field3071.method349(-(class159.field3071.field1003 / 2) + 382, 18);
                        return;
                    }
                    class141 var8 = class220.method1422(new class141[] { class191.field3698, var6.field476, class6.field78, class111.field2138, class32.field668, class78.method543((byte) 93, class8.field128 ? 1 : 0), class118.field2297, class78.method543((byte) 93, class142.field2747), class223.field4208, class78.method543((byte) 93, client.field613) }, -3);
                    try {
                        arg0.getAppletContext().showDocument(var8.method923((byte) -54), "_self");
                        return;
                    } catch (Exception var9) {
                        return;
                    }
                }
            }
        }
    }
}
