import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class25 extends class178 {

    @OriginalMember(owner = "client!cb", name = "lb", descriptor = "Z")
    public boolean field548 = false;

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "Ldg;")
    private class41 field531;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "Z")
    public boolean field525;

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "Z")
    public boolean field542;

    @OriginalMember(owner = "client!cb", name = "nb", descriptor = "I")
    public int field550;

    @OriginalMember(owner = "client!cb", name = "qb", descriptor = "Z")
    private boolean field553;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "Z")
    private boolean field535;

    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "client!cb", name = "kb", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client!cb", name = "pb", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "Loc;")
    private static class151 field532 = class137.method873(2, "OFF");

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "Loc;")
    public static class151 field533 = class137.method873(2, "::autoshadow off");

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "Loc;")
    public static class151 field536 = class137.method873(2, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
    public static int field524 = 100;

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "Loc;")
    public static class151 field537 = field532;

    @OriginalMember(owner = "client!cb", name = "ib", descriptor = "Loc;")
    public static class151 field545 = class137.method873(2, "Texturen geladen)3");

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "Loc;")
    public static class151 field523 = class137.method873(2, "Nehmen");

    @OriginalMember(owner = "client!cb", name = "ob", descriptor = "Z")
    public static boolean field551 = true;

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "[I")
    public static int[] field526 = new int[4000];

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "F")
    private float field527;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!cb", name = "jb", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!cb", name = "mb", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!cb", name = "rb", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "Lsd;")
    public static class192 field540;

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "[I")
    private int[] field543;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILj;FLsd;B)[I")
    public final int[] method194(int arg0, class97 arg1, float arg2, class192 arg3, byte arg4) {
        if (arg4 <= 14) {
            this.method196(-118, null, null);
        }
        field538++;
        if (this.field543 == null || this.field527 != arg2) {
            if (!this.field531.method296((byte) 116, arg1, arg3)) {
                return null;
            }
            int var6 = arg0 >= this.field550 ? this.field550 : arg0;
            this.field543 = this.field531.method297(var6, this.field535, arg3, arg1, true, var6, (double) arg2, 255);
            this.field527 = arg2;
            if (this.field553) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6 * var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var12 = var6 - 1;
                int var14 = var6;
                int var15 = var6;
                int var16 = var6 * var6;
                for (int var17 = 2; var17 >= 0; var17--) {
                    for (int var34 = var12; var34 >= 0; var34--) {
                        var14--;
                        int var35 = this.field543[var14];
                        var7[var34] += class26.method206(var35, 16737399) >> 16;
                        var10[var34] += class26.method206(65465, var35) >> 8;
                        var8[var34] += class26.method206(255, var35);
                    }
                    if (var14 == 0) {
                        var14 = var16;
                    }
                }
                int var18 = var6 - 1;
                int var19 = var16;
                for (int var20 = var18; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 1;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var21--;
                        var23 += var10[var21];
                        var24 += var8[var21];
                        var25 += var7[var21];
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var27 = var12; var27 >= 0; var27--) {
                        int var31 = var25 / 9;
                        int var32 = var24 / 9;
                        var22--;
                        var21--;
                        int var33 = var23 / 9;
                        var19--;
                        var9[var19] = class73.method479(class73.method479(var31 << 16, var33 << 8), var32);
                        var23 += var10[var21] - var10[var22];
                        var24 += var8[var21] - var8[var22];
                        var25 += var7[var21] - var7[var22];
                        if (var22 == 0) {
                            var22 = var11;
                        }
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var28 = var12; var28 >= 0; var28--) {
                        var15--;
                        int var29 = this.field543[var15];
                        var14--;
                        int var30 = this.field543[var14];
                        var7[var28] += -(class26.method206(16773676, var29) >> 16) + (class26.method206(var30, 16728404) >> 16);
                        var10[var28] += (class26.method206(65296, var30) >> 8) - class26.method206(var29 >> 8, 255);
                        var8[var28] += class26.method206(255, var30) - class26.method206(var29, 255);
                    }
                    if (var15 == 0) {
                        var15 = var16;
                    }
                    if (var14 == 0) {
                        var14 = var16;
                    }
                }
                this.field543 = var9;
            }
        }
        return this.field543;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILoc;IZ)V")
    public static final void method195(int arg0, int arg1, class151 arg2, int arg3, boolean arg4) {
        class232 var5 = class197.method1235(-125, arg0, arg3);
        field522++;
        if (var5 == null) {
            return;
        }
        if (var5.field4226 != null) {
            class224 var6 = new class224();
            var6.field3894 = arg1;
            var6.field3905 = var5;
            var6.field3906 = arg2;
            var6.field3895 = var5.field4226;
            class110.method664(1785261985, var6);
        }
        boolean var7 = arg4;
        if (var5.field4148 > 0) {
            var7 = class166.method1080((byte) 61, var5);
        }
        if (!var7 || !class117.method718(class174.method1110(arg4, var5), arg1 - 1, 1)) {
            return;
        }
        if (arg1 == 1) {
            class66.field1273++;
            class48.field984.method650(-13721, 60);
            class48.field984.method1461(arg0, (byte) 79);
            class48.field984.method1463(-96, arg3);
        }
        if (arg1 == 2) {
            class48.field984.method650(-13721, 149);
            class193.field3448++;
            class48.field984.method1461(arg0, (byte) 75);
            class48.field984.method1463(-63, arg3);
        }
        if (arg1 == 3) {
            class42.field865++;
            class48.field984.method650(-13721, 81);
            class48.field984.method1461(arg0, (byte) 75);
            class48.field984.method1463(-120, arg3);
        }
        if (arg1 == 4) {
            class220.field3823++;
            class48.field984.method650(-13721, 43);
            class48.field984.method1461(arg0, (byte) 124);
            class48.field984.method1463(-88, arg3);
        }
        if (arg1 == 5) {
            class129.field2328++;
            class48.field984.method650(-13721, 3);
            class48.field984.method1461(arg0, (byte) 99);
            class48.field984.method1463(-100, arg3);
        }
        if (arg1 == 6) {
            class218.field3790++;
            class48.field984.method650(-13721, 246);
            class48.field984.method1461(arg0, (byte) 38);
            class48.field984.method1463(-38, arg3);
        }
        if (arg1 == 7) {
            class48.field984.method650(-13721, 80);
            class51.field1025++;
            class48.field984.method1461(arg0, (byte) 86);
            class48.field984.method1463(-86, arg3);
        }
        if (arg1 == 8) {
            class48.field984.method650(-13721, 12);
            class188.field3338++;
            class48.field984.method1461(arg0, (byte) 67);
            class48.field984.method1463(-48, arg3);
        }
        if (arg1 == 9) {
            class168.field3071++;
            class48.field984.method650(-13721, 124);
            class48.field984.method1461(arg0, (byte) 126);
            class48.field984.method1463(-34, arg3);
        }
        if (arg1 == 10) {
            class110.field1950++;
            class48.field984.method650(-13721, 68);
            class48.field984.method1461(arg0, (byte) 94);
            class48.field984.method1463(-89, arg3);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILj;Lsd;)Z")
    public final boolean method196(int arg0, class97 arg1, class192 arg2) {
        int var4 = 19 / ((arg0 - 35) / 57);
        field554++;
        return this.field531.method296((byte) -103, arg1, arg2);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)V")
    public final void method197(byte arg0, int arg1) {
        field539++;
        if (this.field543 == null) {
            return;
        }
        int var3 = -53 / ((arg0 + 37) / 43);
        if (this.field552 == 0 && this.field534 == 0) {
            return;
        }
        int var4 = this.field534 * arg1;
        if (class178.field3221 == null || class178.field3221.length < this.field543.length) {
            class178.field3221 = new int[this.field543.length];
        }
        int var5 = this.field543.length;
        int var6 = this.field543.length == 4096 ? 64 : 128;
        int var7 = this.field552 * var6 * arg1;
        int var8 = var5 - 1;
        int var9 = var6 - 1;
        for (int var10 = 0; var10 < var5; var10 += var6) {
            int var12 = var8 & var7 + var10;
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = var10 + var13;
                int var15 = var12 + (var9 & var4 + var13);
                class178.field3221[var14] = this.field543[var15];
            }
        }
        int[] var11 = this.field543;
        this.field543 = class178.field3221;
        class178.field3221 = var11;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
    public static final void method198(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class116.field2100; var3++) {
            for (int var4 = 0; var4 < class228.field4032; var4++) {
                for (int var5 = 0; var5 < class225.field3924; var5++) {
                    class72 var6 = class95.field1776[var3][var4][var5];
                    if (var6 != null) {
                        class23 var7 = var6.field1412;
                        if (var7 != null && var7.field518.method75()) {
                            class200.method1251(var7.field518, var3, var4, var5, 1, 1);
                            if (var7.field517 != null && var7.field517.method75()) {
                                class200.method1251(var7.field517, var3, var4, var5, 1, 1);
                                var7.field518.method77(var7.field517, 0, 0, 0, false);
                                var7.field517 = var7.field517.method81(arg0, arg1, arg2);
                            }
                            var7.field518 = var7.field518.method81(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1397; var8++) {
                            class124 var10 = var6.field1405[var8];
                            if (var10 != null && var10.field2220.method75()) {
                                class200.method1251(var10.field2220, var3, var4, var5, var10.field2218 + 1 - var10.field2224, var10.field2225 - var10.field2214 + 1);
                                var10.field2220 = var10.field2220.method81(arg0, arg1, arg2);
                            }
                        }
                        class73 var9 = var6.field1400;
                        if (var9 != null && var9.field1423.method75()) {
                            class108.method646(var9.field1423, var3, var4, var5);
                            var9.field1423 = var9.field1423.method81(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    public static final void method199(int arg0) {
        short var1 = 256;
        if (~class5.field98 < arg0) {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class5.field98 > 768) {
                    class140.field2551[var4] = class182.method1143(class109.field1933[var4], 1024 - class5.field98, class112.method675(arg0, -88), class236.field4410[var4]);
                } else if (class5.field98 > 256) {
                    class140.field2551[var4] = class236.field4410[var4];
                } else {
                    class140.field2551[var4] = class182.method1143(class236.field4410[var4], 256 - class5.field98, arg0 + 99, class109.field1933[var4]);
                }
            }
        } else if (class64.field1249 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class64.field1249 > 768) {
                    class140.field2551[var2] = class182.method1143(class109.field1933[var2], 1024 - class64.field1249, 98, class163.field2946[var2]);
                } else if (class64.field1249 > 256) {
                    class140.field2551[var2] = class163.field2946[var2];
                } else {
                    class140.field2551[var2] = class182.method1143(class163.field2946[var2], 256 - class64.field1249, 56, class109.field1933[var2]);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                class140.field2551[var3] = class109.field1933[var3];
            }
        }
        field530++;
        int var5 = class20.field434.field1586 * 9;
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 1; var8 < var1 - 1; var8++) {
            int var21 = (var1 - var8) * class63.field1232[var8] / var1 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var6 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var24 = class192.field3419[var6++];
                int var25 = class20.field434.field1590[var5++];
                if (var24 == 0) {
                    class212.field3732.field1590[var7++] = var25;
                } else {
                    int var27 = 256 - var24;
                    int var28 = class140.field2551[var24];
                    class212.field3732.field1590[var7++] = class26.method206(-16711936, class26.method206(var28, 16711935) * var24 + var27 * class26.method206(16711935, var25)) + class26.method206(16711680, class26.method206(var25, 65280) * var27 + class26.method206(65280, var28) * var24) >> 8;
                }
            }
            for (int var23 = 0; var23 < var21; var23++) {
                class212.field3732.field1590[var7++] = class20.field434.field1590[var5++];
            }
            var5 += class20.field434.field1586 - 128;
        }
        class212.field3732.method544(0, 9);
        int var9 = 0;
        int var10 = 0;
        int var11 = class20.field434.field1586 * 9 + 128;
        for (int var12 = 1; var12 < var1 - 1; var12++) {
            int var13 = (var1 - var12) * class63.field1232[var12] / var1 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; var14 < var13; var14++) {
                int var10001 = var9++;
                var11--;
                class11.field203.field1590[var10001] = class20.field434.field1590[var11];
            }
            for (int var15 = var13; var15 < 128; var15++) {
                int var16 = class192.field3419[var10++];
                var11--;
                int var17 = class20.field434.field1590[var11];
                if (var16 == 0) {
                    class11.field203.field1590[var9++] = var17;
                } else {
                    int var18 = 256 - var16;
                    int var20 = class140.field2551[var16];
                    class11.field203.field1590[var9++] = class26.method206(16711680, class26.method206(var17, 65280) * var18 + class26.method206(65280, var20) * var16) + class26.method206(-16711936, var18 * class26.method206(var17, 16711935) + var16 * class26.method206(var20, 16711935)) >> 8;
                }
            }
            var11 += class20.field434.field1586 + 128;
            var10 += var13;
        }
        class11.field203.method544(637, 9);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 < 46) {
            field541 = 26;
        }
        if (class79.field1526 <= arg6 && arg0 <= field524 && arg3 >= class233.field4281 && arg2 <= class154.field2793) {
            if (arg1 == 1) {
                class2.method22(arg3, arg5, -6, arg6, arg0, arg2);
            } else {
                class144.method920(arg0, arg3, arg5, arg1, arg2, arg6, (byte) 127);
            }
        } else if (arg1 == 1) {
            class171.method1098(arg6, arg2, arg0, arg3, arg5, (byte) 15);
        } else {
            class121.method734(arg6, arg3, arg1, arg0, arg5, 2, arg2);
        }
        field549++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lj;Lsd;BI)[I")
    public final int[] method201(class97 arg0, class192 arg1, byte arg2, int arg3) {
        field529++;
        if (!this.field531.method296((byte) 101, arg0, arg1)) {
            return null;
        } else if (arg2 == -97) {
            int var5 = arg3 < this.field550 ? arg3 : this.field550;
            return this.field531.method297(var5, this.field535, arg1, arg0, false, var5, 1.0D, 255);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
    public static void method202(int arg0) {
        field545 = null;
        field536 = null;
        field540 = null;
        field523 = null;
        field526 = null;
        field532 = null;
        if (arg0 > 104) {
            field533 = null;
            field537 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field528++;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lwa;)V")
    public class25(class229 arg0) {
        this.field531 = new class41(arg0);
        int var2 = arg0.method1475(255);
        this.field525 = (var2 & 0x2) != 0;
        int var3 = var2 >> 3 & 0x3;
        this.field542 = (var2 & 0x1) != 0;
        int var4 = arg0.method1475(255);
        this.field550 = 0x1 << (var4 & 0x7) + 1;
        this.field553 = (var4 & 0x8) != 0;
        this.field535 = (var4 & 0x80) != 0;
        this.field544 = arg0.method1490((byte) 73);
        this.field547 = arg0.method1475(255);
        if (this.field547 == 255) {
            this.field547 = 256;
        }
        this.field534 = arg0.method1457(-2);
        this.field552 = arg0.method1457(-2);
        arg0.method1475(255);
        arg0.method1475(255);
        arg0.method1475(255);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class25() {
        this.field531 = new class41();
        this.field542 = true;
        this.field550 = 64;
    }
}
