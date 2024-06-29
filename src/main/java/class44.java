import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class44 extends class170 {

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
    private int field860 = 2048;

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "I")
    private int field863 = 8192;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "I")
    private int field862 = 4096;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "I")
    private int field861 = 0;

    @OriginalMember(owner = "client!kh", name = "ib", descriptor = "I")
    private int field870 = 2048;

    @OriginalMember(owner = "client!kh", name = "jb", descriptor = "I")
    private int field871 = 0;

    @OriginalMember(owner = "client!kh", name = "qb", descriptor = "I")
    private int field878 = 12288;

    @OriginalMember(owner = "client!kh", name = "gb", descriptor = "Lqk;")
    public static class207 field868 = null;

    @OriginalMember(owner = "client!kh", name = "kb", descriptor = "B")
    public static byte field872;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!kh", name = "eb", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!kh", name = "fb", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!kh", name = "lb", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!kh", name = "mb", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!kh", name = "nb", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!kh", name = "ob", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!kh", name = "rb", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!kh", name = "sb", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!kh", name = "hb", descriptor = "Lpk;")
    public static class99 field869;

    @OriginalMember(owner = "client!kh", name = "pb", descriptor = "[I")
    public static int[] field877;

    @OriginalMember(owner = "client!kh", name = "db", descriptor = "[Z")
    public static boolean[] field865;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        ++field867;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field863 = arg0.method1050(1272006568);
                                }
                            } else {
                                this.field862 = arg0.method1050(1272006568);
                            }
                        } else {
                            this.field878 = arg0.method1050(1272006568);
                        }
                    } else {
                        this.field870 = arg0.method1050(1272006568);
                    }
                } else {
                    this.field861 = arg0.method1050(arg1 + 1272000691);
                }
            } else {
                this.field871 = arg0.method1050(1272006568);
            }
        } else {
            this.field860 = arg0.method1050(1272006568);
        }
        if (arg1 != 5877) {
            this.method339(77, true, 88);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)V")
    public static final void method334(int arg0, int arg1, int arg2, int arg3) {
        ++field879;
        class90 var4 = class221.method1575(9, arg0, arg2 + 1651477856);
        var4.method648((byte) -68);
        if (arg2 != 4096) {
            field864 = -76;
        }
        var4.field1621 = arg3;
        var4.field1613 = arg1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILmd;)I")
    public static final int method335(int arg0, int arg1, class220 arg2) {
        if (arg1 < 72) {
            field864 = -9;
        }
        ++field873;
        if (!client.method1112(arg2).method827(arg0, 58) && arg2.field4057 == null) {
            return -1;
        } else {
            return arg2.field3981 != null && arg0 < arg2.field3981.length ? arg2.field3981[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V")
    public static void method336(byte arg0) {
        field877 = null;
        if (arg0 >= 67) {
            field868 = null;
            field865 = null;
            field869 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
    public final void method50(int arg0) {
        if (arg0 > 14) {
            class235.method1681(60);
            ++field866;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class44() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        ++field875;
        int[] var3 = super.field3001.method1538(120, arg1);
        if (arg0 != -30) {
            return null;
        } else {
            if (super.field3001.field3835) {
                int var4 = class282.field4964[arg1] + -2048;
                for (int var5 = 0; class88.field1595 > var5; ++var5) {
                    int var6 = class68.field1211[var5] + -2048;
                    int var7 = this.field860 + var6;
                    int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                    int var9 = this.field871 + var4;
                    int var10 = var8 > 2048 ? var8 + -4096 : var8;
                    int var11 = var9 >= -2048 ? var9 : var9 + 4096;
                    int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                    int var13 = this.field861 + var6;
                    int var14 = this.field870 + var4;
                    int var15 = ~var13 <= 2047 ? var13 : var13 + 4096;
                    int var16 = ~var14 <= 2047 ? var14 : var14 + 4096;
                    int var17 = ~var16 >= -2049 ? var16 : var16 + -4096;
                    int var18 = var15 <= 2048 ? var15 : var15 - 4096;
                    var3[var5] = !this.method337((byte) 38, var10, var12) && !this.method339(var18, false, var17) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BII)Z")
    private final boolean method337(byte arg0, int arg1, int arg2) {
        if (arg0 < 36) {
            method334(-128, 10, -45, 8);
        }
        ++field876;
        int var4 = (-arg1 + arg2) * this.field878 >> 12;
        int var5 = class207.field3689[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field878;
        int var7 = (var6 << 12) / this.field863;
        int var8 = this.field862 * var7 >> 12;
        return var8 > arg1 - -arg2 && arg1 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)V")
    public static final void method338(int arg0) {
        class209.field3701 = class277.field4870;
        class219.field3866 = class32.field657;
        class56.field1046 = class288.field5148;
        class124.field2162 = class83.field1522;
        class99.field1781 = class183.field3269;
        class87.field1582 = class86.field1575;
        class9.field119 = class182.field3244;
        class225.field4106 = class141.field2447;
        class117.field2026 = class288.field5149;
        class165.field2919 = class213.field3778;
        class11.field153 = class75.field1374;
        class276.field4840 = class46.field918;
        class202.field3560 = class112.field1955;
        class190.field3353 = class92.field1634;
        class200.field3521 = class3.field43;
        class207.field3675 = class93.field1641;
        class261.field4658 = class196.field3453;
        class214.field3800 = class108.field1918;
        class15.field244 = class170.field3019;
        class72.field1337 = class171.field3031;
        class262.field4666 = class191.field3377;
        class71.field1262 = class192.field3393;
        class164.field2891 = class262.field4660;
        class71.field1270 = class245.field4439;
        class13.field179 = class51.field984;
        class170.field3027 = class241.field4390;
        class88.field1593 = class204.field3583;
        class169.field2977 = class159.field2804;
        class40.field798 = class60.field1111;
        class73.field1345 = class243.field4420;
        class192.field3385 = class277.field4867;
        class188.field3327 = class156.field2739;
        class55.field1029 = class12.field169;
        class185.field3285 = class51.field983;
        class93.field1648 = class248.field4498;
        class156.field2744 = class165.field2913;
        class175.field3175 = class194.field3419;
        class5.field83 = class217.field3849;
        class128.field2232 = class255.field4564;
        class18.field298 = class11.field159;
        ++field880;
        class192.field3386 = class78.field1414;
        class31.field626 = class242.field4405;
        class111.field1933 = class32.field652;
        class134.field2320 = class269.field4765;
        class13.field189 = class223.field4077;
        class20.field331 = class82.field1489;
        class79.field1453 = class194.field3416;
        class68.field1213 = class83.field1527;
        class213.field3783 = class25.field525;
        if (arg0 != -28747) {
            field874 = -116;
        }
        class100.field1796 = class178.field3206;
        class2.field41 = class138.field2389;
        class200.field3513 = class241.field4400;
        class144.field2483 = class214.field3803;
        class245.field4448 = class259.field4618;
        class281.field4934 = class200.field3509;
        class235.field4340 = class219.field3871;
        class51.field993 = class49.field961;
        class220.field3961 = class263.field4680;
        class56.field1047 = class288.field5148;
        class255.field4572 = class112.field1944;
        class156.field2755 = class246.field4469;
        class171.field3030 = class206.field3608;
        class141.field2440 = class151.field2648;
        class214.field3787 = class52.field1009;
        class170.field3020 = class4.field56;
        class285.field4999 = class161.field2848;
        class59.field1081 = class132.field2275;
        class73.field1341 = class169.field2952;
        class27.field552 = class118.field2051;
        class36.field697 = class58.field1062;
        class189.field3339 = class259.field4615;
        class105.field1857 = class47.field945;
        class275.field4829 = class143.field2476;
        class129.field2260 = class120.field2086;
        class199.field3479 = class276.field4843;
        class9.field133 = class147.field2531;
        class15.field239 = class170.field3019;
        class232.field4241 = class256.field4589;
        class95.field1694 = class175.field3165;
        class172.field3040 = class269.field4753;
        class279.field4903 = class178.field3210;
        class81.field1466 = class269.field4759;
        class162.field2864 = class5.field82;
        class133.field2302 = class13.field195;
        class279.field4899 = class276.field4838;
        class175.field3163 = class78.field1428;
        class124.field2140 = class83.field1522;
        class83.field1533 = class159.field2819;
        class107.field1905 = class102.field1835;
        class207.field3688 = class75.field1393;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZI)Z")
    private final boolean method339(int arg0, boolean arg1, int arg2) {
        ++field858;
        int var4 = (arg0 + arg2) * this.field878 >> 12;
        if (arg1) {
            this.method50(82);
        }
        int var5 = class207.field3689[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field878;
        int var7 = (var6 << 12) / this.field863;
        int var8 = this.field862 * var7 >> 12;
        return var8 > -arg0 + arg2 && arg2 - arg0 > -var8;
    }
}
