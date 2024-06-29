import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class93 {

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "[I")
    private int[] field1862;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
    private int[] field1855;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lob;")
    public static class141 field1856 = class175.method1195(40, "<)4col> x");

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1854 = 0;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lob;")
    public static class141 field1860 = class175.method1195(40, ")2");

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    private int field1853;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    private int field1857;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    private int field1863;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    private int field1864;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    private final void method633(int arg0) {
        field1865++;
        this.field1857 += ++this.field1853;
        if (arg0 != -28703) {
            this.method634((byte) -66);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1862[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1863 ^= this.field1863 << 13;
                } else {
                    this.field1863 ^= this.field1863 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1863 ^= this.field1863 << 2;
            } else {
                this.field1863 ^= this.field1863 >>> 16;
            }
            this.field1863 += this.field1862[var2 + 128 & 0xFF];
            int var4;
            this.field1862[var2] = var4 = this.field1857 + this.field1863 + this.field1862[class15.method94(var3 >> 2, 255)];
            this.field1855[var2] = this.field1857 = this.field1862[class15.method94(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I")
    public final int method634(byte arg0) {
        if (this.field1864-- == 0) {
            this.method633(-28703);
            this.field1864 = 255;
        }
        field1867++;
        if (arg0 > -70) {
            method638(46L, (byte) 90);
        }
        return this.field1855[this.field1864];
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static void method635(int arg0) {
        field1860 = null;
        if (arg0 == -28934) {
            field1856 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILra;I)I")
    public static final int method636(int arg0, class170 arg1, int arg2) {
        field1859++;
        if (arg1.field3300 == null || arg1.field3300.length <= arg0) {
            return -2;
        }
        if (arg2 != -31519) {
            method638(-1L, (byte) 41);
        }
        try {
            int[] var3 = arg1.field3300[arg0];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class36.field728[var3[var5++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 2) {
                    var8 = class68.field1344[var3[var5++]];
                }
                if (var7 == 3) {
                    var8 = class38.field768[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class170 var12 = class192.method1268(var11, -78);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class96.method645((byte) -61, var13).field971 || class118.field2296)) {
                        for (int var14 = 0; var14 < var12.field3385.length; var14++) {
                            if (var13 + 1 == var12.field3385[var14]) {
                                var8 += var12.field3319[var14];
                            }
                        }
                    }
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 5) {
                    var8 = class180.field3538[var3[var5++]];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 6) {
                    var8 = class45.field867[class68.field1344[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class180.field3538[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class114.field2176.field767;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class66.field1279[var15]) {
                            var8 += class68.field1344[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class170 var18 = class192.method1268(var17, -122);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class96.method645((byte) -61, var19).field971 || class118.field2296)) {
                        for (int var20 = 0; var20 < var18.field3385.length; var20++) {
                            if (var19 + 1 == var18.field3385[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class109.field2098;
                }
                if (var7 == 12) {
                    var8 = class170.field3296;
                }
                if (var7 == 13) {
                    int var21 = class180.field3538[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class7.method53(var23, -36);
                }
                if (var7 == 18) {
                    var8 = (class114.field2176.field3889 >> 7) + class83.field1649;
                }
                if (var7 == 19) {
                    var8 = (class114.field2176.field3854 >> 7) + class83.field1644;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)I")
    public static final int method637(int arg0, int arg1, int arg2) {
        int var3 = arg2 >>> 31;
        if (arg1 != -30453) {
            field1860 = null;
        }
        field1866++;
        return (arg2 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(JB)V")
    public static final void method638(long arg0, byte arg1) {
        if (arg1 != -8) {
            method638(41L, (byte) -44);
        }
        field1861++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class108.method716(-18314, arg0 - 1L);
            class108.method716(arg1 ^ 0x478E, 1L);
        } else {
            class108.method716(-18314, arg0);
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
    private final void method639(int arg0) {
        field1868++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            var4 = var72 ^ var70 >>> 4;
            int var73 = var2 + var5;
            int var74 = var70 + var73;
            var3 = var74 ^ var73 << 8;
            int var75 = var4 + var61;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var8 = var3 + var64;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1855[var11 + 3] + var6;
            int var38 = this.field1855[var11] + var9;
            int var39 = this.field1855[var11 + 1] + var8;
            int var40 = this.field1855[var11 + 6] + var3;
            int var41 = this.field1855[var11 + 2] + var7;
            int var42 = this.field1855[var11 + 5] + var4;
            int var43 = this.field1855[var11 + 7] + var2;
            int var44 = this.field1855[var11 + 4] + var5;
            int var45 = var38 ^ var39 << 11;
            int var46 = var39 + var41;
            int var47 = var37 + var45;
            int var48 = var46 ^ var41 >>> 2;
            int var49 = var44 + var48;
            int var50 = var41 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var47 + var49;
            int var53 = var42 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var6 + var40;
            int var55 = var49 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var43;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field1862[var11] = var9;
            this.field1862[var11 + 1] = var8;
            this.field1862[var11 + 2] = var7;
            this.field1862[var11 + 3] = var6;
            this.field1862[var11 + 4] = var5;
            this.field1862[var11 + 5] = var4;
            this.field1862[var11 + 6] = var3;
            this.field1862[var11 + 7] = var2;
        }
        if (arg0 != 7) {
            field1860 = null;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1862[var12 + 4] + var5;
            int var14 = this.field1862[var12 + 5] + var4;
            int var15 = this.field1862[var12 + 2] + var7;
            int var16 = this.field1862[var12 + 7] + var2;
            int var17 = this.field1862[var12] + var9;
            int var18 = this.field1862[var12 + 6] + var3;
            int var19 = this.field1862[var12 + 3] + var6;
            int var20 = this.field1862[var12 + 1] + var8;
            int var21 = var17 ^ var20 << 11;
            int var22 = var19 + var21;
            int var23 = var15 + var20;
            int var24 = var23 ^ var15 >>> 2;
            int var25 = var13 + var24;
            int var26 = var15 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var14 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var6 + var18;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var29 + var30;
            var4 = var32 ^ var30 >>> 4;
            int var33 = var5 + var16;
            int var34 = var30 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            int var36 = var33 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field1862[var12] = var9;
            this.field1862[var12 + 1] = var8;
            this.field1862[var12 + 2] = var7;
            this.field1862[var12 + 3] = var6;
            this.field1862[var12 + 4] = var5;
            this.field1862[var12 + 5] = var4;
            this.field1862[var12 + 6] = var3;
            this.field1862[var12 + 7] = var2;
        }
        this.method633(-28703);
        this.field1864 = 256;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[Lhi;I[BII)V")
    public static final void method640(int arg0, int arg1, class79[] arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg0 + var12 > 0 && arg0 + var12 < 103 && arg5 + var13 > 0 && arg5 + var13 < 103) {
                        arg2[var7].field1592[arg0 + var12][arg5 + var13] = class15.method94(arg2[var7].field1592[arg0 + var12][arg5 + var13], -16777217);
                    }
                }
            }
        }
        field1858++;
        if (arg3 > -24) {
            method637(0, -6, 2);
        }
        class146 var8 = new class146(arg4);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class105.method700(arg1, 90, var10 + arg0, arg5 + var11, var9, arg6, var8, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    private class93() {
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "([I)V")
    public class93(int[] arg0) {
        this.field1862 = new int[256];
        this.field1855 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1855[var2] = arg0[var2];
        }
        this.method639(7);
    }
}
