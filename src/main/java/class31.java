import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class31 extends class304 {

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
    private int field372 = 0;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "I")
    private int field367 = 0;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "I")
    private int field373 = 0;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
    public static int field370 = 0;

    @OriginalMember(owner = "client!wc", name = "db", descriptor = "[I")
    public static int[] field380 = new int[8];

    @OriginalMember(owner = "client!wc", name = "gb", descriptor = "Ljava/lang/String;")
    public static String field383 = "slide:";

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!wc", name = "cb", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!wc", name = "eb", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!wc", name = "fb", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!wc", name = "hb", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!wc", name = "ib", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!wc", name = "jb", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client!wc", name = "kb", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!wc", name = "lb", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!wc", name = "mb", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!wc", name = "nb", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!wc", name = "ob", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "Ljd;")
    public static class95 field371;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLhk;)V", line = 7)
    public static final void method232(byte arg0, class42 arg1) {
        for (int var2 = 0; var2 < class254.field3820.length; var2++) {
            class254.field3820[var2] = 0;
        }
        short var3 = 256;
        int var4 = 22 % ((arg0 + 36) / 47);
        for (int var5 = 0; var5 < 5000; var5++) {
            int var6 = (int) (Math.random() * 128.0D * (double) var3);
            class254.field3820[var6] = (int) (Math.random() * 284.0D);
        }
        field378++;
        for (int var7 = 0; var7 < 20; var7++) {
            for (int var8 = 1; var8 < (var3 - 1); var8++) {
                for (int var9 = 1; var9 < 127; var9++) {
                    int var10 = (var8 << 7) + var9;
                    class278.field4322[var10] = (class254.field3820[var10 + 1] + class254.field3820[var10 - 1] + class254.field3820[var10 - -128] + class254.field3820[var10 + -128]) / 4;
                }
            }
            int[] var11 = class254.field3820;
            class254.field3820 = class278.field4322;
            class278.field4322 = var11;
        }
        if (arg1 == null) {
            return;
        }
        int var12 = 0;
        for (int var13 = 0; var13 < arg1.field5049; var13++) {
            for (int var14 = 0; var14 < arg1.field5047; var14++) {
                if (arg1.field603[var12++] != 0) {
                    int var15 = arg1.field5045 + var13 + 16;
                    int var16 = var14 + arg1.field5044 + 16;
                    int var17 = (var15 << 7) + var16;
                    class254.field3820[var17] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILjd;)Z", line = 99)
    public static final boolean method233(int arg0, int arg1, int arg2, class95 arg3) {
        byte[] var4 = arg3.method696(arg0, (byte) 100, arg2);
        field375++;
        if (arg1 != 0) {
            return true;
        } else if (var4 == null) {
            return false;
        } else {
            class225.method1605((byte) -125, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V", line = 119)
    public static void method234(int arg0) {
        if (arg0 == -1) {
            field371 = null;
            field380 = null;
            field383 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)V", line = 131)
    private final void method235(int arg0, int arg1, int arg2, int arg3) {
        field390++;
        if (arg1 != 8192) {
            this.method235(-42, 69, -99, 9);
        }
        int var5 = arg2 >= arg3 ? arg2 : arg3;
        int var6 = var5 >= arg0 ? var5 : arg0;
        int var7 = arg3 < arg2 ? arg3 : arg2;
        int var8 = var7 <= arg0 ? var7 : arg0;
        this.field385 = (var6 + var8) / 2;
        int var9 = var6 - var8;
        if (this.field385 > 0 && this.field385 < 4096) {
            this.field386 = (var9 << 12) / (this.field385 <= 2048 ? this.field385 * 2 : 8192 - (this.field385 * 2));
        } else {
            this.field386 = 0;
        }
        if (var9 <= 0) {
            this.field381 = 0;
            return;
        }
        int var10 = (var6 - arg2 << 12) / var9;
        int var11 = (var6 - arg0 << 12) / var9;
        int var12 = (var6 - arg3 << 12) / var9;
        if (arg3 == var6) {
            this.field381 = arg2 == var8 ? var11 + 20480 : -var10 + 4096;
        } else if (arg2 == var6) {
            this.field381 = arg0 == var8 ? var12 + 4096 : -var11 + 12288;
        } else {
            this.field381 = arg3 == var8 ? var10 + 12288 : -var12 + 20480;
        }
        this.field381 /= 6;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BIIIZI[B[Lf;III)V", line = 185)
    public static final void method236(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, byte[] arg6, class345[] arg7, int arg8, int arg9, int arg10) {
        if (arg0 < 44) {
            return;
        }
        field379++;
        int var11 = -1;
        class254 var12 = new class254(arg6);
        while (true) {
            int var13 = var12.method1753(0);
            if (var13 == 0) {
                return;
            }
            int var14 = 0;
            var11 += var13;
            while (true) {
                int var15 = var12.method1730(false);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = (var14 & 0xFCA) >> 6;
                int var18 = var14 >> 12;
                int var19 = var12.method1774((byte) -99);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg10 == var18 && arg5 <= var17 && (arg5 + 8) > var17 && var16 >= arg9 && arg9 + 8 > var16) {
                    class32 var22 = class226.method1607(-122, var11);
                    int var23 = class227.method1611(var22.field413, var22.field416, var21, var17 & 0x7, var16 & 0x7, 57, arg8) + arg1;
                    int var24 = arg3 + class166.method1258(var22.field416, var22.field413, arg8, var17 & 0x7, -124, var21, var16 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class345 var25 = null;
                        if (!arg4) {
                            int var26 = arg2;
                            if ((class324.field5005[1][var23][var24] & 0x2) == 2) {
                                var26 = arg2 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg7[var26];
                            }
                        }
                        class278.method1928(var23, !arg4, var25, arg4, var20, arg8 + var21 & 0x3, -108, arg2, arg2, var11, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lwm;II)V", line = 265)
    public final void method69(class254 arg0, int arg1, int arg2) {
        field368++;
        if (arg2 != -2828) {
            field371 = (class95) null;
        }
        if (arg1 == 0) {
            this.field373 = arg0.method1768(65536);
        } else if (arg1 == 1) {
            this.field372 = (arg0.method1733(2023893896) << 12) / 100;
        } else if (arg1 == 2) {
            this.field367 = (arg0.method1733(2023893896) << 12) / 100;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)[[I", line = 309)
    public final int[][] method75(int arg0, int arg1) {
        field377++;
        int[][] var3 = this.field4663.method886(arg0, 3);
        if (this.field4663.field1820) {
            int[][] var4 = this.method2082(0, (byte) -73, arg0);
            int[] var5 = var3[1];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[2];
            int[] var10 = var4[0];
            for (int var11 = 0; var11 < class218.field3333; var11++) {
                this.method235(var6[var11], 8192, var8[var11], var10[var11]);
                for (this.field381 += this.field373; this.field381 < 0; this.field381 += 4096) {
                }
                while (this.field381 > 4096) {
                    this.field381 -= 4096;
                }
                this.field385 += this.field367;
                if (this.field385 < 0) {
                    this.field385 = 0;
                }
                if (this.field385 > 4096) {
                    this.field385 = 4096;
                }
                this.field386 += this.field372;
                if (this.field386 < 0) {
                    this.field386 = 0;
                }
                if (this.field386 > 4096) {
                    this.field386 = 4096;
                }
                this.method238(false, this.field381, this.field385, this.field386);
                var7[var11] = this.field384;
                var5[var11] = this.field382;
                var9[var11] = this.field387;
            }
        }
        if (arg1 != 0) {
            method234(-24);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIB)V", line = 380)
    public static final void method237(int arg0, int arg1, byte arg2) {
        field391++;
        if (arg2 >= -112) {
            field380 = (int[]) null;
        }
        class207 var3 = class28.method212((byte) -120, arg1);
        int var4 = var3.field3174;
        int var5 = var3.field3181;
        int var6 = var3.field3182;
        int var7 = class23.field256[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class333.method2329(var4, -122, var8 & arg0 << var5 | ~var8 & class154.field2330[var4]);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIII)V", line = 412)
    private final void method238(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            method240(-122);
        }
        int var5 = arg2 > 2048 ? arg2 + arg3 - (arg2 * arg3 >> 12) : (arg3 + 4096) * arg2 >> 12;
        if (var5 > 0) {
            int var6 = arg1 * 6;
            int var7 = arg2 + arg2 - var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var11 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var11 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (var9 == 0) {
                this.field387 = var7;
                this.field384 = var5;
                this.field382 = var14;
            } else if (var9 == 1) {
                this.field382 = var5;
                this.field384 = var15;
                this.field387 = var7;
            } else if (var9 == 2) {
                this.field387 = var14;
                this.field384 = var7;
                this.field382 = var5;
            } else if (var9 == 3) {
                this.field382 = var15;
                this.field384 = var7;
                this.field387 = var5;
            } else if (var9 == 4) {
                this.field384 = var14;
                this.field387 = var5;
                this.field382 = var7;
            } else if (var9 == 5) {
                this.field384 = var5;
                this.field387 = var15;
                this.field382 = var7;
            }
        } else {
            this.field384 = this.field382 = this.field387 = arg2;
        }
        field374++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BJ)V", line = 524)
    public static final void method239(byte arg0, long arg1) {
        field389++;
        if (class268.field4168 == 1 || class268.field4168 == 5) {
            class177.method1330(arg0 - 122, arg1);
        } else if (class268.field4168 == 2) {
            class341.method2371((byte) 107);
        } else {
            class209.method1500(2);
        }
        if (!class330.field5089) {
            class336.field5229[0] = class38.field552;
            class118.field1843[0] = 1005;
            class32.field393 = 1;
            if (class5.field65 != 0) {
                class234.field3562 = class89.field1266;
                class272.field4253 = class2.field32;
            } else if (class305.field4751 == 0) {
                class234.field3562 = class108.field1622;
                class272.field4253 = class290.field4468;
            } else {
                class272.field4253 = class109.field1643;
                class234.field3562 = class47.field640;
            }
            class204.field3122[0] = class239.field3646;
            class311.field4832[0] = "";
        }
        if (class28.field334 != -1) {
            class13.method98(-17099, class28.field334);
        }
        for (int var3 = 0; var3 < class184.field2913; var3++) {
            if (class121.field1861[var3]) {
                class331.field5117[var3] = true;
            }
            class30.field357[var3] = class121.field1861[var3];
            class121.field1861[var3] = false;
        }
        if (class73.field1058) {
            class174.field2802 = true;
        }
        class163.field2648 = -1;
        class322.field4971 = null;
        class2.field27 = null;
        class98.field1404 = class233.field3542;
        class213.field3275 = -1;
        if (arg0 != 122) {
            field370 = -21;
        }
        if (class28.field334 != -1) {
            class184.field2913 = 0;
            class270.method1899(0);
        }
        if (class73.field1058) {
            class175.method1314();
        } else {
            class287.method1985();
        }
        class30.method229((byte) 100);
        if (class330.field5089) {
            if (class264.field4093) {
                class1.method7(arg0 ^ 0x7A);
            } else {
                class230.method1622((byte) -128);
            }
        } else if (class2.field27 != null) {
            class102.method767(class37.field535, class2.field27, 16777215, class263.field4057);
        } else if (class213.field3275 != -1) {
            class102.method767(class213.field3275, (class161) null, arg0 + 16777093, class163.field2648);
        }
        int var4 = class330.field5089 ? -1 : class75.method592(1771981208);
        if (var4 == -1) {
            var4 = class340.field5284;
        }
        class171.method1292((byte) 101, var4);
        if (class304.field4647 == 1) {
            class304.field4647 = 2;
        }
        if (class216.field3306 == 1) {
            class216.field3306 = 2;
        }
        if (class8.field122 == 3) {
            for (int var5 = 0; var5 < class184.field2913; var5++) {
                if (class30.field357[var5]) {
                    if (class73.field1058) {
                        class175.method1311(class41.field602[var5], class120.field1850[var5], class174.field2803[var5], class97.field1400[var5], 16711935, 128);
                    } else {
                        class287.method1978(class41.field602[var5], class120.field1850[var5], class174.field2803[var5], class97.field1400[var5], 16711935, 128);
                    }
                } else if (class331.field5117[var5]) {
                    if (class73.field1058) {
                        class175.method1311(class41.field602[var5], class120.field1850[var5], class174.field2803[var5], class97.field1400[var5], 16711680, 128);
                    } else {
                        class287.method1978(class41.field602[var5], class120.field1850[var5], class174.field2803[var5], class97.field1400[var5], 16711680, 128);
                    }
                }
            }
        }
        class32.method242(class265.field4112, (byte) 117, class228.field3488, class39.field575.field4713, class39.field575.field4731);
        class228.field3488 = 0;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 674)
    public class31() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V", line = 678)
    public static final void method240(int arg0) {
        if (arg0 != 16699) {
            field380 = (int[]) null;
        }
        field388++;
        if (class43.field605 != -1) {
            class215.method1538(-1, class43.field605, (byte) 85, -1);
            class43.field605 = -1;
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(B)V", line = 721)
    public static final void method241(byte arg0) {
        field369++;
        if (arg0 >= -75) {
            field371 = (class95) null;
        }
        class224.field3428.method750((byte) 83);
        class71.field1021.method750((byte) 120);
    }
}
