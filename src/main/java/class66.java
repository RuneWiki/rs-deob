import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class66 extends class252 {

    @OriginalMember(owner = "client!af", name = "W", descriptor = "I")
    private int field1204 = 0;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "I")
    private int field1207 = 1024;

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
    private int field1208 = 4;

    @OriginalMember(owner = "client!af", name = "hb", descriptor = "I")
    private int field1215 = 409;

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "I")
    private int field1210 = 204;

    @OriginalMember(owner = "client!af", name = "nb", descriptor = "I")
    private int field1221 = 8;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "I")
    private int field1206 = 81;

    @OriginalMember(owner = "client!af", name = "mb", descriptor = "I")
    private int field1220 = 1024;

    @OriginalMember(owner = "client!af", name = "kb", descriptor = "Ljd;")
    public static class85 field1218 = class221.method1499("zap", (byte) -60);

    @OriginalMember(owner = "client!af", name = "gb", descriptor = "Ljd;")
    public static class85 field1214 = class221.method1499("Lade)3)3)3", (byte) -113);

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!af", name = "X", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!af", name = "db", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client!af", name = "fb", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!af", name = "jb", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!af", name = "qb", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!af", name = "rb", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!af", name = "tb", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client!af", name = "ub", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!af", name = "pb", descriptor = "Lge;")
    public static class68 field1223;

    @OriginalMember(owner = "client!af", name = "lb", descriptor = "[I")
    private int[] field1219;

    @OriginalMember(owner = "client!af", name = "ob", descriptor = "[I")
    public static int[] field1222;

    @OriginalMember(owner = "client!af", name = "ib", descriptor = "[[I")
    private int[][] field1216;

    @OriginalMember(owner = "client!af", name = "sb", descriptor = "[[I")
    private int[][] field1226;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)V")
    public static void method440(boolean arg0) {
        field1222 = null;
        field1218 = null;
        field1214 = null;
        if (arg0) {
            method440(false);
        }
        field1223 = null;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field1211;
        int[] var3 = super.field4356.method868(arg0, (byte) -94);
        if (super.field4356.field2258) {
            int var4;
            for (var4 = class39.field622[arg0] + this.field1204; var4 < 0; var4 += 4096) {
            }
            while (~var4 < -4097) {
                var4 -= 4096;
            }
            int var5;
            for (var5 = 0; this.field1221 > var5 && this.field1219[var5] <= var4; ++var5) {
            }
            int var6 = this.field1219[var5 - 1];
            boolean var7 = (1 & var5) == 0;
            int var8 = this.field1219[var5];
            int var9 = var5 + -1;
            if (~(this.field1212 + var6) > ~var4 && var4 < -this.field1212 + var8) {
                for (int var10 = 0; var10 < class5.field63; ++var10) {
                    int var11 = var7 ? this.field1207 : -this.field1207;
                    int var12 = 0;
                    int var13;
                    for (var13 = class105.field1838[var10] - -(this.field1227 * var11 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (var12 < this.field1208 && var13 >= this.field1216[var9][var12]) {
                        ++var12;
                    }
                    int var14 = this.field1216[var9][var12];
                    int var15 = var12 - 1;
                    int var16 = this.field1216[var9][var15];
                    if (this.field1212 + var16 < var13 && ~(-this.field1212 + var14) < ~var13) {
                        var3[var10] = this.field1226[var9][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class248.method1723(var3, 0, class5.field63, 0);
            }
        }
        return arg1 != -55 ? null : var3;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lge;III)Lee;")
    public static final class266 method441(class68 arg0, int arg1, int arg2, int arg3) {
        ++field1209;
        if (!class253.method1750(arg1, arg0, (byte) 125, arg3)) {
            return null;
        } else {
            if (arg2 != -27067) {
                field1222 = null;
            }
            return class31.method217(true);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLjd;)I")
    public static final int method442(byte arg0, class85 arg1) {
        ++field1203;
        if (arg0 != -34) {
            method445(-58, -9);
        }
        return arg1.method586(true) + 1;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V")
    public static final void method443(byte arg0) {
        class201.field3505 = class233.field4037;
        class232.field4015 = client.field2558;
        class83.field1521 = class161.field2779;
        class273.field4829 = class239.field4126;
        class202.field3532 = class218.field3832;
        class86.field1621 = class106.field1880;
        class25.field363 = class114.field2046;
        class196.field3374 = class123.field2183;
        class171.field2960 = class115.field2061;
        class65.field1188 = class261.field4616;
        class163.field2799 = class172.field2983;
        class117.field2092 = class35.field544;
        class107.field1890 = class261.field4621;
        class264.field4723 = class153.field2646;
        class137.field2385 = class203.field3538;
        class79.field1454 = class147.field2498;
        class142.field2448 = class31.field458;
        class184.field3141 = class121.field2135;
        class169.field2912 = class79.field1457;
        class159.field2722 = class99.field1777;
        class24.field359 = class83.field1509;
        ++field1217;
        class67.field1244 = class79.field1445;
        class90.field1662 = class247.field4215;
        class207.field3622 = class253.field4366;
        class207.field3623 = class253.field4366;
        class213.field3741 = class214.field3754;
        class230.field3976 = class228.field3958;
        class116.field2084 = class101.field1801;
        class37.field573 = class204.field3553;
        class59.field1074 = class208.field3652;
        class105.field1847 = class131.field2286;
        class94.field1716 = class217.field3810;
        class272.field4818 = class16.field238;
        class233.field4021 = class231.field3988;
        class99.field1778 = class168.field2905;
        class251.field4333 = class11.field179;
        class38.field595 = class73.field1371;
        class24.field350 = class208.field3628;
        if (arg0 != 121) {
            field1214 = null;
        }
        class130.field2274 = class2.field15;
        class108.field1901 = class18.field265;
        class193.field3293 = class153.field2605;
        class93.field1707 = class172.field2981;
        class202.field3527 = class195.field3326;
        class187.field3220 = class142.field2462;
        class168.field2903 = class93.field1697;
        class148.field2518 = class208.field3629;
        class22.field314 = class237.field4098;
        class198.field3399 = class27.field415;
        class210.field3675 = class93.field1710;
        class47.field828 = class246.field4211;
        class217.field3815 = class226.field3932;
        class199.field3471 = class4.field42;
        class102.field1808 = class90.field1661;
        class272.field4806 = class213.field3743;
        class213.field3749 = class253.field4374;
        class77.field1425 = class92.field1689;
        class28.field425 = class154.field2659;
        class116.field2073 = class50.field879;
        class64.field1176 = class130.field2277;
        class229.field3967 = class39.field619;
        class15.field224 = class100.field1788;
        class93.field1703 = class44.field771;
        client.field2566 = class16.field235;
        class200.field3485 = class3.field27;
        class232.field4009 = class18.field252;
        class272.field4815 = class5.field65;
        class105.field1841 = class131.field2286;
        class254.field4381 = class130.field2270;
        class74.field1383 = class33.field498;
        class72.field1359 = class215.field3779;
        class36.field554 = class64.field1180;
        class67.field1242 = class73.field1367;
        class219.field3859 = class54.field959;
        class95.field1733 = class58.field1048;
        class198.field3394 = class176.field3022;
        class68.field1291 = class102.field1828;
        class24.field352 = class184.field3162;
        class45.field806 = class76.field1403;
        class57.field997 = class47.field834;
        class22.field319 = class95.field1736;
        class102.field1816 = class86.field1619;
        class184.field3153 = class113.field2021;
        class230.field3970 = class247.field4273;
        class38.field586 = class263.field4670;
        class234.field4054 = class134.field2333;
        class132.field2310 = class264.field4715;
        class153.field2606 = class240.field4143;
        class187.field3213 = class142.field2462;
        class244.field4179 = class264.field4733;
        class239.field4116 = class211.field3703;
        class168.field2892 = class272.field4814;
        class234.field4058 = class3.field28;
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
    private final void method444(int arg0) {
        Random var2 = new Random((long) this.field1221);
        this.field1226 = new int[this.field1221][this.field1208];
        this.field1216 = new int[this.field1221][this.field1208 - arg0];
        this.field1212 = this.field1206 / 2;
        this.field1219 = new int[this.field1221 + 1];
        this.field1205 = 4096 / this.field1221;
        int var3 = this.field1205 / 2;
        this.field1219[0] = 0;
        ++field1202;
        this.field1227 = 4096 / this.field1208;
        int var4 = this.field1227 / 2;
        for (int var5 = 0; var5 < this.field1221; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field1205;
                int var7 = (class135.method901(Integer.MIN_VALUE, 4096, var2) - 2048) * this.field1210 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field1219[var5] = this.field1219[var5 - 1] - -var8;
            }
            this.field1216[var5][0] = 0;
            for (int var9 = 0; var9 < this.field1208; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field1227;
                    int var11 = (class135.method901(Integer.MIN_VALUE, 4096, var2) - 2048) * this.field1215 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field1216[var5][var9] = this.field1216[var5][var9 + -1] - -var12;
                }
                this.field1226[var5][var9] = ~this.field1220 < -1 ? -class135.method901(Integer.MIN_VALUE, this.field1220, var2) + 4096 : 4096;
            }
            this.field1216[var5][this.field1208] = 4096;
        }
        this.field1219[this.field1221] = 4096;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (~arg1 == -8) {
                                        this.field1220 = arg0.method1694((byte) -100);
                                    }
                                } else {
                                    this.field1206 = arg0.method1694((byte) -100);
                                }
                            } else {
                                this.field1204 = arg0.method1694((byte) -100);
                            }
                        } else {
                            this.field1207 = arg0.method1694((byte) -100);
                        }
                    } else {
                        this.field1210 = arg0.method1694((byte) -100);
                    }
                } else {
                    this.field1215 = arg0.method1694((byte) -100);
                }
            } else {
                this.field1221 = arg0.method1711((byte) -67);
            }
        } else {
            this.field1208 = arg0.method1711((byte) -67);
        }
        ++field1228;
        if (arg2 != -99) {
            this.field1212 = -8;
        }
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V")
    public final void method230(int arg0) {
        ++field1224;
        this.method444(arg0 + -3907);
        if (arg0 != 3906) {
            this.field1208 = -37;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
    public static final void method445(int arg0, int arg1) {
        int var2 = 6 / ((-67 - arg0) / 46);
        ++field1225;
        if (class222.method1508(0, arg1)) {
            class16.method119(-1, -14874, class215.field3774[arg1]);
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class66() {
        super(0, true);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljb;ZB)V")
    public static final void method446(class255 arg0, boolean arg1, byte arg2) {
        ++field1213;
        int var3 = arg0.field4466 == 0 ? arg0.field4482 : arg0.field4466;
        if (arg2 == 57) {
            int var4 = arg0.field4443 != 0 ? arg0.field4443 : arg0.field4513;
            class27.method193(var4, class215.field3774[arg0.field4479 >> 16], arg1, arg0.field4479, (byte) 18, var3);
            if (arg0.field4549 != null) {
                class27.method193(var4, arg0.field4549, arg1, arg0.field4479, (byte) 18, var3);
            }
            class129 var5 = (class129) class121.field2126.method1398(1, (long) arg0.field4479);
            if (var5 != null) {
                class74.method522(var5.field2264, 1, var4, arg1, var3);
            }
        }
    }
}
