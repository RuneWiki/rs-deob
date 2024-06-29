import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class258 extends class128 {

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "[I")
    private int[] field3918 = new int[257];

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "Ljava/lang/String;")
    public static String field3919 = "shake:";

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "Z")
    public static boolean field3925;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "[[I")
    private int[][] field3927;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)V", line = 5)
    public final void method130(boolean arg0) {
        if (this.field3927 == null) {
            this.method1865(111, 1);
        }
        this.method1872(0);
        field3924++;
        if (arg0) {
            this.field3918 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)V", line = 26)
    private final void method1865(int arg0, int arg1) {
        field3916++;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field3927 = new int[2][4];
                this.field3927[0][2] = 0;
                this.field3927[0][3] = 0;
                this.field3927[1][2] = 4096;
                this.field3927[0][1] = 0;
                this.field3927[1][1] = 4096;
                this.field3927[0][0] = 0;
                this.field3927[1][0] = 4096;
                this.field3927[1][3] = 4096;
            } else if (arg1 == 2) {
                this.field3927 = new int[8][4];
                this.field3927[0][2] = 2602;
                this.field3927[0][0] = 0;
                this.field3927[1][2] = 1799;
                this.field3927[2][2] = 1734;
                this.field3927[0][1] = 2650;
                this.field3927[1][0] = 2867;
                this.field3927[3][2] = 1220;
                this.field3927[1][1] = 2313;
                this.field3927[0][3] = 2361;
                this.field3927[4][2] = 963;
                this.field3927[2][1] = 2618;
                this.field3927[5][2] = 2152;
                this.field3927[3][1] = 2296;
                this.field3927[1][3] = 1558;
                this.field3927[4][1] = 2072;
                this.field3927[2][3] = 1413;
                this.field3927[2][0] = 3072;
                this.field3927[3][3] = 947;
                this.field3927[5][1] = 2730;
                this.field3927[4][3] = 722;
                this.field3927[3][0] = 3276;
                this.field3927[5][3] = 1766;
                this.field3927[6][3] = 915;
                this.field3927[6][2] = 1060;
                this.field3927[7][3] = 1140;
                this.field3927[7][2] = 1413;
                this.field3927[6][1] = 2232;
                this.field3927[4][0] = 3481;
                this.field3927[5][0] = 3686;
                this.field3927[6][0] = 3891;
                this.field3927[7][1] = 1686;
                this.field3927[7][0] = 4096;
            } else if (arg1 == 3) {
                this.field3927 = new int[7][4];
                this.field3927[0][1] = 0;
                this.field3927[0][0] = 0;
                this.field3927[1][0] = 663;
                this.field3927[2][0] = 1363;
                this.field3927[1][1] = 0;
                this.field3927[0][2] = 0;
                this.field3927[2][1] = 0;
                this.field3927[3][1] = 4096;
                this.field3927[1][2] = 4096;
                this.field3927[3][0] = 2048;
                this.field3927[2][2] = 4096;
                this.field3927[3][2] = 4096;
                this.field3927[4][1] = 4096;
                this.field3927[5][1] = 4096;
                this.field3927[4][2] = 0;
                this.field3927[5][2] = 0;
                this.field3927[6][1] = 0;
                this.field3927[4][0] = 2727;
                this.field3927[0][3] = 4096;
                this.field3927[6][2] = 0;
                this.field3927[5][0] = 3411;
                this.field3927[6][0] = 4096;
                this.field3927[1][3] = 4096;
                this.field3927[2][3] = 0;
                this.field3927[3][3] = 0;
                this.field3927[4][3] = 0;
                this.field3927[5][3] = 4096;
                this.field3927[6][3] = 4096;
            } else if (arg1 == 4) {
                this.field3927 = new int[6][4];
                this.field3927[0][3] = 0;
                this.field3927[0][0] = 0;
                this.field3927[1][3] = 1493;
                this.field3927[0][1] = 0;
                this.field3927[1][0] = 1843;
                this.field3927[0][2] = 0;
                this.field3927[1][1] = 0;
                this.field3927[1][2] = 0;
                this.field3927[2][1] = 0;
                this.field3927[3][1] = 0;
                this.field3927[2][0] = 2457;
                this.field3927[2][3] = 2939;
                this.field3927[2][2] = 0;
                this.field3927[4][1] = 546;
                this.field3927[3][3] = 3565;
                this.field3927[5][1] = 4096;
                this.field3927[4][3] = 4031;
                this.field3927[3][2] = 1124;
                this.field3927[3][0] = 2781;
                this.field3927[4][0] = 3481;
                this.field3927[5][0] = 4096;
                this.field3927[4][2] = 3084;
                this.field3927[5][3] = 4096;
                this.field3927[5][2] = 4096;
            } else if (arg1 == 5) {
                this.field3927 = new int[16][4];
                this.field3927[0][3] = 321;
                this.field3927[0][0] = 0;
                this.field3927[0][1] = 80;
                this.field3927[1][1] = 321;
                this.field3927[1][0] = 155;
                this.field3927[2][1] = 578;
                this.field3927[1][3] = 562;
                this.field3927[2][3] = 803;
                this.field3927[3][1] = 947;
                this.field3927[0][2] = 192;
                this.field3927[2][0] = 389;
                this.field3927[4][1] = 1285;
                this.field3927[3][0] = 671;
                this.field3927[1][2] = 449;
                this.field3927[3][3] = 1140;
                this.field3927[2][2] = 690;
                this.field3927[4][3] = 1509;
                this.field3927[5][3] = 1413;
                this.field3927[3][2] = 995;
                this.field3927[6][3] = 1333;
                this.field3927[4][0] = 897;
                this.field3927[7][3] = 1702;
                this.field3927[8][3] = 2056;
                this.field3927[5][0] = 1175;
                this.field3927[6][0] = 1368;
                this.field3927[9][3] = 2666;
                this.field3927[7][0] = 1507;
                this.field3927[5][1] = 1525;
                this.field3927[4][2] = 1397;
                this.field3927[6][1] = 1734;
                this.field3927[8][0] = 1736;
                this.field3927[10][3] = 3276;
                this.field3927[5][2] = 1429;
                this.field3927[6][2] = 1461;
                this.field3927[7][2] = 1525;
                this.field3927[8][2] = 1590;
                this.field3927[7][1] = 1413;
                this.field3927[8][1] = 1108;
                this.field3927[9][1] = 1766;
                this.field3927[9][2] = 2056;
                this.field3927[10][2] = 2586;
                this.field3927[9][0] = 2088;
                this.field3927[11][2] = 3148;
                this.field3927[10][0] = 2355;
                this.field3927[11][0] = 2691;
                this.field3927[12][0] = 3031;
                this.field3927[13][0] = 3522;
                this.field3927[14][0] = 3727;
                this.field3927[11][3] = 3228;
                this.field3927[12][2] = 3710;
                this.field3927[13][2] = 3421;
                this.field3927[12][3] = 3196;
                this.field3927[15][0] = 4096;
                this.field3927[10][1] = 2409;
                this.field3927[13][3] = 3019;
                this.field3927[11][1] = 3116;
                this.field3927[12][1] = 3806;
                this.field3927[13][1] = 3437;
                this.field3927[14][2] = 3148;
                this.field3927[14][1] = 3116;
                this.field3927[14][3] = 3228;
                this.field3927[15][2] = 2505;
                this.field3927[15][3] = 2746;
                this.field3927[15][1] = 2377;
            } else if (arg1 == 6) {
                this.field3927 = new int[4][4];
                this.field3927[0][3] = 0;
                this.field3927[0][0] = 2048;
                this.field3927[0][1] = 0;
                this.field3927[1][0] = 2867;
                this.field3927[1][3] = 0;
                this.field3927[2][0] = 3276;
                this.field3927[3][0] = 4096;
                this.field3927[0][2] = 4096;
                this.field3927[1][1] = 4096;
                this.field3927[1][2] = 4096;
                this.field3927[2][2] = 4096;
                this.field3927[3][2] = 0;
                this.field3927[2][3] = 0;
                this.field3927[2][1] = 4096;
                this.field3927[3][3] = 0;
                this.field3927[3][1] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg0 < 85) {
            field3919 = (String) null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)V", line = 279)
    public static final void method1866(int arg0, int arg1) {
        if (class281.field4357 == 0) {
            class195.field2802.method1570(arg0, -12088);
        } else {
            class267.field4212 = arg0;
        }
        field3917++;
        int var2 = -44 % ((-arg1 - 8) / 44);
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(BI)V", line = 297)
    public static final void method1867(byte arg0, int arg1) {
        class280.field4351[0] = (float) (class229.method1613(arg1, 16734695) >> 16) / 255.0F;
        int var2 = -35 / ((63 - arg0) / 61);
        class280.field4351[1] = (float) class229.method1613(255, arg1 >> 8) / 255.0F;
        class280.field4351[2] = (float) class229.method1613(arg1, 255) / 255.0F;
        class134.method893(3, 16168);
        field3921++;
        class134.method893(4, 16168);
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(II)V", line = 314)
    public static final void method1868(int arg0, int arg1) {
        field3928++;
        class96 var2 = class141.method935(arg1, 10, 60);
        var2.method582(-1);
        if (arg0 != 1002) {
            field3925 = true;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[[I", line = 332)
    public final int[][] method102(int arg0, int arg1) {
        if (arg1 != 5110) {
            return (int[][]) ((int[][]) null);
        }
        field3915++;
        int[][] var3 = this.field1755.method875(46, arg0);
        if (this.field1755.field1815) {
            int[] var4 = this.method851((byte) -70, 0, arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class10.field141; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3918[var9];
                var5[var8] = class229.method1613(16711680, var10) >> 12;
                var6[var8] = class229.method1613(var10, 65280) >> 4;
                var7[var8] = class229.method1613(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V", line = 587)
    public class258() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(Z)V", line = 383)
    public static void method1869(boolean arg0) {
        if (!arg0) {
            method1867((byte) -10, 60);
        }
        field3919 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIILen;JLen;Len;)V", line = 393)
    public static final void method1870(int arg0, int arg1, int arg2, int arg3, class47 arg4, long arg5, class47 arg6, class47 arg7) {
        class146 var9 = new class146();
        var9.field2028 = arg4;
        var9.field2026 = arg1 * 128 + 64;
        var9.field2032 = arg2 * 128 + 64;
        var9.field2034 = arg3;
        var9.field2029 = arg5;
        var9.field2036 = arg6;
        var9.field2024 = arg7;
        int var10 = 0;
        class225 var11 = class158.field2184[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3214; var12++) {
                class80 var13 = var11.field3199[var12];
                if ((var13.field1026 & 0x400000L) == 4194304L) {
                    int var14 = var13.field1024.method11();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2027 = -var10;
        if (class158.field2184[arg0][arg1][arg2] == null) {
            class158.field2184[arg0][arg1][arg2] = new class225(arg0, arg1, arg2);
        }
        class158.field2184[arg0][arg1][arg2].field3206 = var9;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lcc;I)Lcc;", line = 438)
    public static final class263 method1871(class263 arg0, int arg1) {
        field3923++;
        if (arg1 != 16011) {
            method1873(55, -128);
        }
        if (arg0.field4065 != -1) {
            return class91.method530(arg0.field4065, 10989328);
        }
        int var2 = arg0.field4083 >>> 16;
        class120 var3 = new class120(class292.field4585);
        for (class343 var4 = (class343) var3.method813((byte) -122); var4 != null; var4 = (class343) var3.method811((byte) -99)) {
            if (var4.field5329 == var2) {
                return class91.method530((int) var4.field5065, 10989328);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V", line = 470)
    private final void method1872(int arg0) {
        field3920++;
        int var2 = this.field3927.length;
        if (arg0 >= var2) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var6 < var2 && var5 >= this.field3927[var6][0]; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var4 >= var2) {
                int[] var7 = this.field3927[var2 - 1];
                var8 = var7[3];
                var9 = var7[1];
                var10 = var7[2];
            } else {
                int[] var11 = this.field3927[var4];
                if (var4 > 0) {
                    int[] var12 = this.field3927[var4 - 1];
                    int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                    var9 = var11[1] * var13 + var12[1] * var14 >> 12;
                    var10 = var11[2] * var13 + var12[2] * var14 >> 12;
                } else {
                    var9 = var11[1];
                    var8 = var11[3];
                    var10 = var11[2];
                }
            }
            int var15 = var10 >> 4;
            int var16 = var8 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var17 = var9 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field3918[var3] = class48.method283(var16, class48.method283(var15 << 8, var17 << 16));
        }
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(II)I", line = 571)
    public static final int method1873(int arg0, int arg1) {
        int var7 = arg0 - 1;
        field3922++;
        int var2 = var7 | var7 >>> 1;
        if (arg1 != 832520144) {
            field3925 = false;
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lp;II)V", line = 597)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg2 >= -85) {
            method1870(107, 89, 55, -2, (class47) null, 15L, (class47) null, (class47) null);
        }
        field3926++;
        if (arg1 != 0) {
            return;
        }
        int var4 = arg0.method661(-1);
        if (var4 != 0) {
            this.method1865(115, var4);
            return;
        }
        this.field3927 = new int[arg0.method661(-1)][4];
        for (int var5 = 0; var5 < this.field3927.length; var5++) {
            this.field3927[var5][0] = arg0.method624(14612);
            this.field3927[var5][1] = arg0.method661(-1) << 4;
            this.field3927[var5][2] = arg0.method661(-1) << 4;
            this.field3927[var5][3] = arg0.method661(-1) << 4;
        }
    }
}
