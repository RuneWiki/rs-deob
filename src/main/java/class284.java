import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class284 extends class270 {

    @OriginalMember(owner = "client!va", name = "jb", descriptor = "I")
    private int field4860 = 6;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "Lmh;")
    private static class62 field4847 = class201.method1405(true, "Continue");

    @OriginalMember(owner = "client!va", name = "gb", descriptor = "Lmh;")
    public static class62 field4857 = field4847;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4852 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!va", name = "nb", descriptor = "Lmh;")
    public static class62 field4864 = class201.method1405(true, "sl_back");

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "F")
    public static float field4853;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!va", name = "hb", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!va", name = "kb", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!va", name = "lb", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!va", name = "ib", descriptor = "[Lwg;")
    public static class24[] field4859;

    @OriginalMember(owner = "client!va", name = "mb", descriptor = "[[I")
    public static int[][] field4863;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lmi;II)V", line = 5)
    public final void method8(class92 arg0, int arg1, int arg2) {
        int var4 = -99 % ((-arg2 - 8) / 53);
        field4858++;
        if (arg1 == 0) {
            this.field4860 = arg0.method702(-1);
        } else if (arg1 == 1) {
            this.field4588 = arg0.method702(-1) == 1;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V", line = 47)
    public static final void method1929(int arg0) {
        field4856++;
        class1.field2.method1392(0);
        if (arg0 != 1) {
            method1937(-91, -94, -87, -25, true, 116, -70, (int[]) null, 23, true, -48);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 58)
    public class284() {
        super(2, false);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)V", line = 63)
    public static final void method1930(byte arg0, int arg1) {
        field4849++;
        class151 var2 = class165.method1194((byte) 1, 5, arg1);
        var2.method1081(128);
        if (arg0 != -127) {
            field4863 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!va", name = "i", descriptor = "(B)V", line = 83)
    public static final void method1931(byte arg0) {
        if (arg0 != 93) {
            field4853 = -1.2224727F;
        }
        for (int var1 = 0; var1 < class294.field5010; var1++) {
            int var2 = class21.field224[var1];
            class204 var3 = class301.field5186[var2];
            int var4 = class75.field1223.method702(-1);
            if ((var4 & 0x8) != 0) {
                var3.field3869 = class75.field1223.method696((byte) 47);
                var3.field3844 = 100;
            }
            if ((var4 & 0x4) != 0) {
                var3.field3848 = class75.field1223.method734(false);
                if (var3.field3848 == 65535) {
                    var3.field3848 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field3861 = class75.field1223.method691(arg0 ^ 0xDD);
                var3.field3835 = class75.field1223.method721(21);
            }
            if ((var4 & 0x80) != 0) {
                int var5 = class75.field1223.method734(false);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class75.field1223.method702(-1);
                class129.method957(var5, var3, var6, true);
            }
            if ((var4 & 0x10) != 0) {
                int var7 = class75.field1223.method720(true);
                int var8 = class75.field1223.method744(105);
                var3.method1576(var7, class199.field3367, 74, var8);
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field3435.method1881((byte) -49)) {
                    class293.method1988(var3, 90);
                }
                var3.field3435 = class226.method1601(768, class75.field1223.method691(arg0 ^ 0xDD));
                var3.method1581((byte) 29, var3.field3435.field4714);
                var3.field3879 = var3.field3435.field4682;
                var3.field3817 = var3.field3435.field4664;
                var3.field3811 = var3.field3435.field4667;
                var3.field3868 = var3.field3435.field4677;
                var3.field3831 = var3.field3435.field4699;
                var3.field3870 = var3.field3435.field4715;
                var3.field3815 = var3.field3435.field4675;
                var3.field3816 = var3.field3435.field4669;
                if (var3.field3435.method1881((byte) -77)) {
                    class271.method1857((class216) null, (class153) null, class7.field85, var3.field3828[0], 78, 0, var3.field3846[0], var3);
                }
            }
            if ((var4 & 0x1) != 0) {
                int var9 = class75.field1223.method720(true);
                int var10 = class75.field1223.method720(true);
                var3.method1576(var9, class199.field3367, -128, var10);
                var3.field3863 = class199.field3367 + 300;
                var3.field3867 = class75.field1223.method744(arg0 - 6);
            }
            if ((var4 & 0x20) != 0) {
                var3.field3847 = class75.field1223.method748(-3);
                int var11 = class75.field1223.method703(arg0 + 12553);
                if (var3.field3847 == 65535) {
                    var3.field3847 = -1;
                }
                var3.field3851 = 0;
                var3.field3871 = (var11 & 0xFFFF) + class199.field3367;
                var3.field3813 = 0;
                var3.field3855 = var11 >> 16;
                if (class199.field3367 < var3.field3871) {
                    var3.field3813 = -1;
                }
                if (var3.field3847 != -1 && class199.field3367 == var3.field3871) {
                    int var12 = class115.method895(107, var3.field3847).field4611;
                    if (var12 != -1) {
                        class96 var13 = class151.method1085(var12, (byte) 107);
                        if (var13 != null && var13.field1586 != null) {
                            class113.method881(var13, var3.field3821, var3.field3814, false, (byte) -100, 0);
                        }
                    }
                }
            }
        }
        field4861++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lmi;I)Lke;", line = 224)
    public static final class214 method1932(class92 arg0, int arg1) {
        class214 var2 = new class214();
        var2.field3635 = arg0.method721(45);
        var2.field3640 = class31.method206(var2.field3635, false);
        field4855++;
        return arg1 == 255 ? var2 : (class214) null;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V", line = 240)
    public static final void method1933(int arg0) {
        field4850++;
        if (class111.field1810 != null) {
            class109 var1 = class111.field1810;
            synchronized (class111.field1810) {
                class111.field1810 = null;
            }
        }
        int var3 = -68 / ((arg0 + 63) / 46);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)[[I", line = 260)
    public final int[][] method11(boolean arg0, int arg1) {
        if (arg0) {
            method1937(1, 98, 95, -126, false, -88, 107, (int[]) null, -27, false, 65);
        }
        field4843++;
        int[][] var3 = this.field4589.method605(arg1, 19195);
        if (this.field4589.field1320) {
            int[][] var4 = this.method1855(false, arg1, 0);
            int[][] var5 = this.method1855(false, arg1, 1);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var4[0];
            int[] var9 = var4[2];
            int[] var10 = var5[0];
            int[] var11 = var4[1];
            int[] var12 = var3[0];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field4860;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class109.field1770; var63++) {
                    var12[var63] = var8[var63] + var10[var63];
                    var6[var63] = var11[var63] + var14[var63];
                    var7[var63] = var9[var63] + var13[var63];
                }
            } else if (var15 == 2) {
                for (int var16 = 0; var16 < class109.field1770; var16++) {
                    var12[var16] = var8[var16] - var10[var16];
                    var6[var16] = var11[var16] - var14[var16];
                    var7[var16] = var9[var16] - var13[var16];
                }
            } else if (var15 == 3) {
                for (int var17 = 0; var17 < class109.field1770; var17++) {
                    var12[var17] = var8[var17] * var10[var17] >> 12;
                    var6[var17] = var11[var17] * var14[var17] >> 12;
                    var7[var17] = var9[var17] * var13[var17] >> 12;
                }
            } else if (var15 == 4) {
                for (int var59 = 0; var59 < class109.field1770; var59++) {
                    int var60 = var10[var59];
                    int var61 = var14[var59];
                    int var62 = var13[var59];
                    var12[var59] = var60 == 0 ? 4096 : (var8[var59] << 12) / var60;
                    var6[var59] = var61 == 0 ? 4096 : (var11[var59] << 12) / var61;
                    var7[var59] = var62 == 0 ? 4096 : (var9[var59] << 12) / var62;
                }
            } else if (var15 == 5) {
                for (int var18 = 0; var18 < class109.field1770; var18++) {
                    var12[var18] = 4096 - ((4096 - var8[var18]) * (4096 - var10[var18]) >> 12);
                    var6[var18] = 4096 - ((4096 - var11[var18]) * (4096 - var14[var18]) >> 12);
                    var7[var18] = 4096 - ((4096 - var9[var18]) * (4096 - var13[var18]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var19 = 0; var19 < class109.field1770; var19++) {
                    int var20 = var13[var19];
                    int var21 = var14[var19];
                    int var22 = var10[var19];
                    var12[var19] = var22 < 2048 ? var8[var19] * var22 >> 11 : 4096 - ((4096 - var8[var19]) * (4096 - var22) >> 11);
                    var6[var19] = var21 < 2048 ? var11[var19] * var21 >> 11 : 4096 - ((4096 - var21) * (4096 - var11[var19]) >> 11);
                    var7[var19] = var20 >= 2048 ? 4096 - ((4096 - var9[var19]) * (4096 - var20) >> 11) : var9[var19] * var20 >> 11;
                }
            } else if (var15 == 7) {
                for (int var55 = 0; var55 < class109.field1770; var55++) {
                    int var56 = var11[var55];
                    int var57 = var9[var55];
                    int var58 = var8[var55];
                    var12[var55] = var58 == 4096 ? 4096 : (var10[var55] << 12) / (4096 - var58);
                    var6[var55] = var56 == 4096 ? 4096 : (var14[var55] << 12) / (4096 - var56);
                    var7[var55] = var57 == 4096 ? 4096 : (var13[var55] << 12) / (4096 - var57);
                }
            } else if (var15 == 8) {
                for (int var51 = 0; var51 < class109.field1770; var51++) {
                    int var52 = var8[var51];
                    int var53 = var9[var51];
                    int var54 = var11[var51];
                    var12[var51] = var52 == 0 ? 0 : 4096 - (4096 - var10[var51] << 12) / var52;
                    var6[var51] = var54 == 0 ? 0 : 4096 - (4096 - var14[var51] << 12) / var54;
                    var7[var51] = var53 == 0 ? 0 : 4096 - ((4096 - var13[var51] << 12) / var53);
                }
            } else if (var15 == 9) {
                for (int var44 = 0; var44 < class109.field1770; var44++) {
                    int var45 = var8[var44];
                    int var46 = var14[var44];
                    int var47 = var13[var44];
                    int var48 = var10[var44];
                    int var49 = var11[var44];
                    int var50 = var9[var44];
                    var12[var44] = var45 < var48 ? var45 : var48;
                    var6[var44] = var46 <= var49 ? var46 : var49;
                    var7[var44] = var47 <= var50 ? var47 : var50;
                }
            } else if (var15 == 10) {
                for (int var23 = 0; var23 < class109.field1770; var23++) {
                    int var24 = var11[var23];
                    int var25 = var9[var23];
                    int var26 = var8[var23];
                    int var27 = var13[var23];
                    int var28 = var10[var23];
                    int var29 = var14[var23];
                    var12[var23] = var28 >= var26 ? var28 : var26;
                    var6[var23] = var24 <= var29 ? var29 : var24;
                    var7[var23] = var27 < var25 ? var25 : var27;
                }
            } else if (var15 == 11) {
                for (int var37 = 0; var37 < class109.field1770; var37++) {
                    int var38 = var8[var37];
                    int var39 = var10[var37];
                    int var40 = var13[var37];
                    int var41 = var9[var37];
                    int var42 = var14[var37];
                    int var43 = var11[var37];
                    var12[var37] = var39 < var38 ? var38 - var39 : -var38 + var39;
                    var6[var37] = var43 > var42 ? var43 - var42 : var42 - var43;
                    var7[var37] = var41 <= var40 ? var40 - var41 : -var40 + var41;
                }
            } else if (var15 == 12) {
                for (int var30 = 0; var30 < class109.field1770; var30++) {
                    int var31 = var10[var30];
                    int var32 = var14[var30];
                    int var33 = var13[var30];
                    int var34 = var11[var30];
                    int var35 = var9[var30];
                    int var36 = var8[var30];
                    var12[var30] = var36 + var31 - (var31 * var36 >> 11);
                    var6[var30] = var32 + var34 - (var32 * var34 >> 11);
                    var7[var30] = var35 + var33 - (var33 * var35 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIZIIZ)Lwj;", line = 577)
    public static final class135 method1934(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        field4854++;
        int var6 = (arg0 << 17) + (arg4 << 19) + arg1 + (arg2 ? 65536 : 0);
        long var8 = (long) var6 * 3849834839L + (long) arg3 * 3147483667L;
        if (!arg5) {
            method1930((byte) 44, 24);
        }
        class135 var10 = (class135) class294.field5004.method1396(0, var8);
        if (var10 != null) {
            return var10;
        }
        class23.field243 = false;
        class135 var11 = class135.method1026(false, -113, arg1, arg3, arg4, arg0, false, arg2);
        if (var11 != null && !class23.field243) {
            class294.field5004.method1397(var8, var11, true);
        }
        return var11;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)[I", line = 606)
    public final int[] method6(int arg0, int arg1) {
        field4844++;
        if (arg0 != 18693) {
            field4852 = (BigInteger) null;
        }
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            int[] var4 = this.method1850(0, 0, arg1);
            int[] var5 = this.method1850(1, arg0 ^ 0x4905, arg1);
            int var6 = this.field4860;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class109.field1770; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var8 = 0; var8 < class109.field1770; var8++) {
                    var3[var8] = var4[var8] - var5[var8];
                }
            } else if (var6 == 3) {
                for (int var9 = 0; var9 < class109.field1770; var9++) {
                    var3[var9] = var4[var9] * var5[var9] >> 12;
                }
            } else if (var6 == 4) {
                for (int var10 = 0; var10 < class109.field1770; var10++) {
                    int var11 = var5[var10];
                    var3[var10] = var11 == 0 ? 4096 : (var4[var10] << 12) / var11;
                }
            } else if (var6 == 5) {
                for (int var30 = 0; var30 < class109.field1770; var30++) {
                    var3[var30] = 4096 - ((4096 - var4[var30]) * (4096 - var5[var30]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var12 = 0; var12 < class109.field1770; var12++) {
                    int var13 = var5[var12];
                    var3[var12] = var13 < 2048 ? var4[var12] * var13 >> 11 : 4096 - ((4096 - var4[var12]) * (4096 - var13) >> 11);
                }
            } else if (var6 == 7) {
                for (int var14 = 0; var14 < class109.field1770; var14++) {
                    int var15 = var4[var14];
                    var3[var14] = var15 == 4096 ? 4096 : (var5[var14] << 12) / (4096 - var15);
                }
            } else if (var6 == 8) {
                for (int var16 = 0; var16 < class109.field1770; var16++) {
                    int var17 = var4[var16];
                    var3[var16] = var17 == 0 ? 0 : 4096 - ((4096 - var5[var16] << 12) / var17);
                }
            } else if (var6 == 9) {
                for (int var18 = 0; var18 < class109.field1770; var18++) {
                    int var19 = var5[var18];
                    int var20 = var4[var18];
                    var3[var18] = var20 >= var19 ? var19 : var20;
                }
            } else if (var6 == 10) {
                for (int var21 = 0; var21 < class109.field1770; var21++) {
                    int var22 = var5[var21];
                    int var23 = var4[var21];
                    var3[var21] = var22 >= var23 ? var22 : var23;
                }
            } else if (var6 == 11) {
                for (int var24 = 0; var24 < class109.field1770; var24++) {
                    int var25 = var5[var24];
                    int var26 = var4[var24];
                    var3[var24] = var25 >= var26 ? var25 - var26 : -var25 + var26;
                }
            } else if (var6 == 12) {
                for (int var27 = 0; var27 < class109.field1770; var27++) {
                    int var28 = var4[var27];
                    int var29 = var5[var27];
                    var3[var27] = var28 + var29 - (var28 * var29 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V", line = 861)
    public static void method1935(int arg0) {
        if (arg0 != 0) {
            method1934(8, -2, false, 49, 96, true);
        }
        field4852 = null;
        field4863 = (int[][]) null;
        field4847 = null;
        field4859 = null;
        field4857 = null;
        field4864 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIZIIIIIII)V", line = 880)
    public static final void method1936(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg5 - arg8;
        field4851++;
        if (class184.field2955 > arg5) {
            var11++;
        }
        int var12 = arg0 - arg7;
        if (class248.field4219 > arg0) {
            var12++;
        }
        if (arg3) {
            return;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = arg6 + (arg4 * var13) >> 16;
            int var15 = (var13 + 1) * arg4 + arg6 >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = arg8 + var13 >> 6;
                if (var17 >= 0 && (class177.field2841.length - 1) >= var17) {
                    int var18 = arg1 + var14;
                    int[][] var19 = class177.field2841[var17];
                    int var20 = arg1 + var15;
                    byte[][] var21 = class41.field619[var17];
                    byte[][] var22 = class266.field4497[var17];
                    byte[][] var23 = class14.field118[var17];
                    byte[][] var24 = class226.field3941[var17];
                    byte[][] var25 = class271.field4609[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = arg10 * var26 + arg9 >> 16;
                        int var28 = (var26 + 1) * arg10 + arg9 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg7 + var26 >> 6;
                            int var31 = arg7 + var26 & 0x3F;
                            int var32 = arg2 + var28;
                            int var33 = arg2 + var27;
                            int var34 = arg8 + var13 & 0x3F;
                            int var35 = (var31 << 6) + var34;
                            int var36;
                            if (var30 < 0 || (var19.length - 1) < var30 || var19[var30] == null) {
                                if (class304.field5235.field4648 != -1) {
                                    var36 = class304.field5235.field4648;
                                } else if ((var26 + arg7 & 0x4) == (arg8 + var13 & 0x4)) {
                                    var36 = class192.field3234[class293.field4992 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var30 < 0 || var30 > (var19.length - 1)) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class280.method1913(var18, var33, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var19[var30][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var23[var30] == null ? 0 : class192.field3234[var23[var30][var35] & 0xFF];
                            int var38 = var21[var30] == null ? 0 : class192.field3234[var21[var30][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class280.method1913(var18, var33, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var22[var30] == null ? 0 : var22[var30][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class280.method1913(var18, var33, var16, var29, var37);
                                    } else {
                                        method1937(var36, var18, var29, var37, true, var16, var33, class280.field4795, var40 >> 2, true, var39 & 0x3);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var24[var30][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class280.method1913(var18, var33, var16, var29, var38);
                                    }
                                    method1937(0, var18, var29, var38, true, var16, var33, class280.field4795, var42 >> 2, var37 == 0, var41 & 0x3);
                                }
                            }
                            if (var25[var30] != null) {
                                int var43 = var25[var30][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var29 == 1) {
                                        var44 = var33;
                                    } else {
                                        var44 = var32 - 1;
                                    }
                                    int var45 = 13421772;
                                    int var46;
                                    if (var16 == 1) {
                                        var46 = var18;
                                    } else {
                                        var46 = var20 - 1;
                                    }
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var43 -= 4;
                                        var45 = 13369344;
                                    }
                                    if (var43 == 1) {
                                        class280.method1911(var18, var33, var29, var45);
                                    } else if (var43 == 2) {
                                        class280.method1905(var18, var33, var16, var45);
                                    } else if (var43 == 3) {
                                        class280.method1911(var46, var33, var29, var45);
                                    } else if (var43 == 4) {
                                        class280.method1905(var18, var44, var16, var45);
                                    } else if (var43 == 9) {
                                        class280.method1911(var18, var33, var29, 16777215);
                                        class280.method1905(var18, var33, var16, var45);
                                    } else if (var43 == 10) {
                                        class280.method1911(var46, var33, var29, 16777215);
                                        class280.method1905(var18, var33, var16, var45);
                                    } else if (var43 == 11) {
                                        class280.method1911(var46, var33, var29, 16777215);
                                        class280.method1905(var18, var44, var16, var45);
                                    } else if (var43 == 12) {
                                        class280.method1911(var18, var33, var29, 16777215);
                                        class280.method1905(var18, var44, var16, var45);
                                    } else if (var43 == 17) {
                                        class280.method1905(var18, var33, 1, var45);
                                    } else if (var43 == 18) {
                                        class280.method1905(var46, var33, 1, var45);
                                    } else if (var43 == 19) {
                                        class280.method1905(var46, var44, 1, var45);
                                    } else if (var43 == 20) {
                                        class280.method1905(var18, var44, 1, var45);
                                    } else if (var43 == 25) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class280.method1905(var18 + var48, -var48 + var44, 1, var45);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class280.method1905(var18 + var47, var33 + var47, 1, var45);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var49 = arg1 + var14;
                    var10000 = arg1 + var15;
                    for (int var51 = 0; var51 < var12; var51++) {
                        int var52;
                        if (class304.field5235.field4648 != -1) {
                            var52 = class304.field5235.field4648;
                        } else if ((arg7 + var51 & 0x4) == (arg8 + var13 & 0x4)) {
                            var52 = class192.field3234[class293.field4992 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var53 = ((var51 + 1) * arg10 + arg9 >> 16) + arg2;
                        int var54 = (arg10 * var51 + arg9 >> 16) + arg2;
                        int var55 = var53 - var54;
                        class280.method1913(var49, var54, var16, var55, var52);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < var11 + 2; var56++) {
            int var57 = (var56 + 1) * arg4 + arg6 >> 16;
            int var58 = arg4 * var56 + arg6 >> 16;
            int var59 = var57 - var58;
            if (var59 > 0) {
                var10000 = arg1 + var57;
                int var61 = arg1 + var58;
                int var62 = arg8 + var56 >> 6;
                if (var62 >= 0 && class238.field4075.length - 1 >= var62) {
                    short[][] var63 = class238.field4075[var62];
                    for (int var64 = -2; var64 < var12 + 2; var64++) {
                        int var65 = arg9 + (arg10 * var64) >> 16;
                        int var66 = (var64 + 1) * arg10 + arg9 >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            int var68 = arg2 + var65;
                            var10000 = arg2 + var66;
                            int var70 = var64 + arg7 >> 6;
                            if (var70 >= 0 && var63.length - 1 >= var70) {
                                int var71 = (arg7 + var64 & 0x3F << 6) + (arg8 + var56 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71] & 0x3FFF;
                                    int var73 = (var63[var70][var71] & 0xE04E) >> 14;
                                    if (var72 != 0) {
                                        if (var73 == 0) {
                                            int var74 = class110.field1788[var72 - 1].field262 * var59 / 4;
                                            int var75 = class110.field1788[var72 - 1].field261 * var67 / 4;
                                            int var76 = class110.field1788[var72 - 1].field259 * var67 / 4;
                                            class110.field1788[var72 - 1].method397(var61, var68 - var75, var74, var76);
                                        } else if (var73 == 1) {
                                            int var77 = class78.field1311[var72 - 1].field262 * var59 / 4;
                                            int var78 = class78.field1311[var72 - 1].field259 * var67 / 4;
                                            int var79 = class78.field1311[var72 - 1].field261 * var67 / 4;
                                            class78.field1311[var72 - 1].method397(var61, var68 - var79, var77, var78);
                                        } else if (var73 == 2) {
                                            int var80 = class203.field3423[var72 - 1].field259 * var67 / 4;
                                            int var81 = class203.field3423[var72 - 1].field262 * var59 / 4;
                                            int var82 = class203.field3423[var72 - 1].field261 * var67 / 4;
                                            class203.field3423[var72 - 1].method397(var61, var68 - var82, var81, var80);
                                        } else if (var73 == 3) {
                                            int var83 = class113.field1881[var72 - 1].field262 * var59 / 4;
                                            int var84 = class113.field1881[var72 - 1].field259 * var67 / 4;
                                            int var85 = class113.field1881[var72 - 1].field261 * var67 / 4;
                                            class113.field1881[var72 - 1].method397(var61, var68 - var85, var83, var84);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIZII[IIZI)V", line = 1307)
    private static final void method1937(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int[] arg7, int arg8, boolean arg9, int arg10) {
        int var11 = arg1;
        field4845++;
        if (arg1 >= class280.field4790) {
            return;
        }
        int var12 = arg1 + arg5;
        if (arg1 < class280.field4788) {
            var11 = class280.field4788;
        }
        if (class280.field4788 >= var12) {
            return;
        }
        if (var12 > class280.field4790) {
            var12 = class280.field4790;
        }
        int var13 = arg6;
        if (class280.field4789 <= arg6) {
            return;
        }
        if (class280.field4794 > arg6) {
            var13 = class280.field4794;
        }
        int var14 = arg2 + arg6;
        if (class280.field4794 >= var14) {
            return;
        }
        if (var14 > class280.field4789) {
            var14 = class280.field4789;
        }
        int var15 = var14 - arg6;
        if (arg8 == 9) {
            arg10 = arg10 + 1 & 0x3;
            arg8 = 1;
        }
        int var16 = class280.field4787 * var13 + var11;
        int var17 = var11 + class280.field4787 - var12;
        if (arg8 == 10) {
            arg8 = 1;
            arg10 = arg10 + 3 & 0x3;
        }
        if (arg8 == 11) {
            arg10 = arg10 + 3 & 0x3;
            arg8 = 8;
        }
        int var18 = var13 - arg6;
        int var19 = var12 - arg1;
        int var20 = var11 - arg1;
        int var21 = arg2 - var18;
        if (!arg4) {
            field4847 = (class62) null;
        }
        int var22 = arg5 - var20;
        int var23 = arg2 - var15;
        int var24 = arg5 - var19;
        if (arg8 == 1) {
            if (arg10 == 0) {
                for (int var25 = var18; var25 < var15; var25++) {
                    for (int var26 = var20; var26 < var19; var26++) {
                        if (var26 <= var25) {
                            arg7[var16] = arg3;
                        } else if (arg9) {
                            arg7[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg10 == 1) {
                for (int var31 = var21 - 1; var31 >= var23; var31--) {
                    for (int var32 = var20; var32 < var19; var32++) {
                        if (var32 <= var31) {
                            arg7[var16] = arg3;
                        } else if (arg9) {
                            arg7[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg10 == 2) {
                for (int var27 = var18; var27 < var15; var27++) {
                    for (int var28 = var20; var28 < var19; var28++) {
                        if (var27 <= var28) {
                            arg7[var16] = arg3;
                        } else if (arg9) {
                            arg7[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg10 == 3) {
                for (int var29 = var21 - 1; var29 >= var23; var29--) {
                    for (int var30 = var20; var30 < var19; var30++) {
                        if (var30 >= var29) {
                            arg7[var16] = arg3;
                        } else if (arg9) {
                            arg7[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg8 == 2) {
            if (arg10 == 0) {
                for (int var87 = var21 - 1; var87 >= var23; var87--) {
                    for (int var88 = var20; var88 < var19; var88++) {
                        if (var87 >> 1 >= var88) {
                            arg7[var16] = arg3;
                        } else if (arg9) {
                            arg7[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg10 == 1) {
                for (int var81 = var18; var81 < var15; var81++) {
                    for (int var82 = var20; var82 < var19; var82++) {
                        if (var16 >= 0 && arg7.length > var16) {
                            if ((var81 << 1) <= var82) {
                                arg7[var16] = arg3;
                            } else if (arg9) {
                                arg7[var16] = arg0;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var17;
                }
            } else if (arg10 == 2) {
                for (int var85 = var18; var85 < var15; var85++) {
                    for (int var86 = var22 - 1; var86 >= var24; var86--) {
                        if (var85 >> 1 >= var86) {
                            arg7[var16] = arg3;
                        } else if (arg9) {
                            arg7[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg10 == 3) {
                for (int var83 = var21 - 1; var83 >= var23; var83--) {
                    for (int var84 = var22 - 1; var84 >= var24; var84--) {
                        if (var83 << 1 <= var84) {
                            arg7[var16] = arg3;
                        } else if (arg9) {
                            arg7[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg8 == 3) {
            if (arg10 == 0) {
                for (int var39 = var21 - 1; var39 >= var23; var39--) {
                    for (int var40 = var22 - 1; var40 >= var24; var40--) {
                        if (var40 <= (var39 >> 1)) {
                            arg7[var16] = arg3;
                        } else if (arg9) {
                            arg7[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg10 == 1) {
                for (int var37 = var21 - 1; var37 >= var23; var37--) {
                    for (int var38 = var20; var38 < var19; var38++) {
                        if ((var37 << 1) <= var38) {
                            arg7[var16] = arg3;
                        } else if (arg9) {
                            arg7[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg10 == 2) {
                for (int var35 = var18; var35 < var15; var35++) {
                    for (int var36 = var20; var36 < var19; var36++) {
                        if (var35 >> 1 >= var36) {
                            arg7[var16] = arg3;
                        } else if (arg9) {
                            arg7[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg10 == 3) {
                for (int var33 = var18; var33 < var15; var33++) {
                    for (int var34 = var22 - 1; var34 >= var24; var34--) {
                        if (var34 >= (var33 << 1)) {
                            arg7[var16] = arg3;
                        } else if (arg9) {
                            arg7[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg8 == 4) {
            if (arg10 == 0) {
                for (int var73 = var21 - 1; var73 >= var23; var73--) {
                    for (int var74 = var20; var74 < var19; var74++) {
                        if (var74 >= var73 >> 1) {
                            arg7[var16] = arg3;
                        } else if (arg9) {
                            arg7[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg10 == 1) {
                for (int var75 = var18; var75 < var15; var75++) {
                    for (int var76 = var20; var76 < var19; var76++) {
                        if ((var75 << 1) >= var76) {
                            arg7[var16] = arg3;
                        } else if (arg9) {
                            arg7[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg10 == 2) {
                for (int var77 = var18; var77 < var15; var77++) {
                    for (int var78 = var22 - 1; var78 >= var24; var78--) {
                        if (var78 >= var77 >> 1) {
                            arg7[var16] = arg3;
                        } else if (arg9) {
                            arg7[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg10 == 3) {
                for (int var79 = var21 - 1; var79 >= var23; var79--) {
                    for (int var80 = var22 - 1; var80 >= var24; var80--) {
                        if (var80 <= var79 << 1) {
                            arg7[var16] = arg3;
                        } else if (arg9) {
                            arg7[var16] = arg0;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg8 != 5) {
            if (arg8 == 6) {
                if (arg10 == 0) {
                    for (int var63 = var18; var63 < var15; var63++) {
                        for (int var64 = var20; var64 < var19; var64++) {
                            if (var64 <= (arg5 / 2)) {
                                arg7[var16] = arg3;
                            } else if (arg9) {
                                arg7[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var41 = var18; var41 < var15; var41++) {
                        for (int var42 = var20; var42 < var19; var42++) {
                            if (var41 <= arg2 / 2) {
                                arg7[var16] = arg3;
                            } else if (arg9) {
                                arg7[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var43 = var18; var43 < var15; var43++) {
                        for (int var44 = var20; var44 < var19; var44++) {
                            if ((arg5 / 2) <= var44) {
                                arg7[var16] = arg3;
                            } else if (arg9) {
                                arg7[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var45 = var18; var45 < var15; var45++) {
                        for (int var46 = var20; var46 < var19; var46++) {
                            if (var45 >= (arg2 / 2)) {
                                arg7[var16] = arg3;
                            } else if (arg9) {
                                arg7[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
            }
            if (arg8 == 7) {
                if (arg10 == 0) {
                    for (int var47 = var18; var47 < var15; var47++) {
                        for (int var48 = var20; var48 < var19; var48++) {
                            if (var48 <= var47 - arg2 / 2) {
                                arg7[var16] = arg3;
                            } else if (arg9) {
                                arg7[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var49 = var21 - 1; var49 >= var23; var49--) {
                        for (int var50 = var20; var50 < var19; var50++) {
                            if (var49 - (arg2 / 2) >= var50) {
                                arg7[var16] = arg3;
                            } else if (arg9) {
                                arg7[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var61 = var21 - 1; var61 >= var23; var61--) {
                        for (int var62 = var22 - 1; var62 >= var24; var62--) {
                            if (var62 <= var61 - (arg2 / 2)) {
                                arg7[var16] = arg3;
                            } else if (arg9) {
                                arg7[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var51 = var18; var51 < var15; var51++) {
                        for (int var52 = var22 - 1; var52 >= var24; var52--) {
                            if (var52 <= (var51 - arg2 / 2)) {
                                arg7[var16] = arg3;
                            } else if (arg9) {
                                arg7[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
            }
            if (arg8 == 8) {
                if (arg10 == 0) {
                    for (int var53 = var18; var53 < var15; var53++) {
                        for (int var54 = var20; var54 < var19; var54++) {
                            if (var54 >= (var53 - (arg2 / 2))) {
                                arg7[var16] = arg3;
                            } else if (arg9) {
                                arg7[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg10 == 1) {
                    for (int var59 = var21 - 1; var59 >= var23; var59--) {
                        for (int var60 = var20; var60 < var19; var60++) {
                            if (var60 >= var59 - (arg2 / 2)) {
                                arg7[var16] = arg3;
                            } else if (arg9) {
                                arg7[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg10 == 2) {
                    for (int var55 = var21 - 1; var55 >= var23; var55--) {
                        for (int var56 = var22 - 1; var56 >= var24; var56--) {
                            if (var56 >= var55 - arg2 / 2) {
                                arg7[var16] = arg3;
                            } else if (arg9) {
                                arg7[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg10 == 3) {
                    for (int var57 = var18; var57 < var15; var57++) {
                        for (int var58 = var22 - 1; var58 >= var24; var58--) {
                            if (var58 >= var57 - (arg2 / 2)) {
                                arg7[var16] = arg3;
                            } else if (arg9) {
                                arg7[var16] = arg0;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
            }
        } else if (arg10 == 0) {
            for (int var71 = var21 - 1; var71 >= var23; var71--) {
                for (int var72 = var22 - 1; var72 >= var24; var72--) {
                    if ((var71 >> 1) <= var72) {
                        arg7[var16] = arg3;
                    } else if (arg9) {
                        arg7[var16] = arg0;
                    }
                    var16++;
                }
                var16 += var17;
            }
        } else if (arg10 == 1) {
            for (int var69 = var21 - 1; var69 >= var23; var69--) {
                for (int var70 = var20; var70 < var19; var70++) {
                    if ((var69 << 1) >= var70) {
                        arg7[var16] = arg3;
                    } else if (arg9) {
                        arg7[var16] = arg0;
                    }
                    var16++;
                }
                var16 += var17;
            }
        } else if (arg10 == 2) {
            for (int var65 = var18; var65 < var15; var65++) {
                for (int var66 = var20; var66 < var19; var66++) {
                    if ((var65 >> 1) <= var66) {
                        arg7[var16] = arg3;
                    } else if (arg9) {
                        arg7[var16] = arg0;
                    }
                    var16++;
                }
                var16 += var17;
            }
        } else if (arg10 == 3) {
            for (int var67 = var18; var67 < var15; var67++) {
                for (int var68 = var22 - 1; var68 >= var24; var68--) {
                    if (var67 << 1 >= var68) {
                        arg7[var16] = arg3;
                    } else if (arg9) {
                        arg7[var16] = arg0;
                    }
                    var16++;
                }
                var16 += var17;
            }
        }
    }
}
