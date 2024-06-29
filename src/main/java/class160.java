import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class160 {

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public int field2085 = 0;

    @OriginalMember(owner = "client!tr", name = "L", descriptor = "B")
    public byte field2108 = 0;

    @OriginalMember(owner = "client!tr", name = "A", descriptor = "I")
    public int field2097 = 0;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public int field2083 = 0;

    @OriginalMember(owner = "client!tr", name = "N", descriptor = "I")
    public int field2110 = 0;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "[S")
    public short[] field2082;

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "[B")
    public byte[] field2091;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "[B")
    public byte[] field2084;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "[B")
    public byte[] field2089;

    @OriginalMember(owner = "client!tr", name = "G", descriptor = "[B")
    public byte[] field2103;

    @OriginalMember(owner = "client!tr", name = "R", descriptor = "[B")
    public byte[] field2114;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "[B")
    public byte[] field2079;

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "[B")
    public byte[] field2090;

    @OriginalMember(owner = "client!tr", name = "K", descriptor = "[S")
    public short[] field2107;

    @OriginalMember(owner = "client!tr", name = "S", descriptor = "[B")
    public byte[] field2115;

    @OriginalMember(owner = "client!tr", name = "y", descriptor = "[S")
    public short[] field2095;

    @OriginalMember(owner = "client!tr", name = "H", descriptor = "[B")
    public byte[] field2104;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "[S")
    public short[] field2087;

    @OriginalMember(owner = "client!tr", name = "X", descriptor = "[S")
    public short[] field2120;

    @OriginalMember(owner = "client!tr", name = "O", descriptor = "[S")
    public short[] field2111;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "[S")
    public short[] field2078;

    @OriginalMember(owner = "client!tr", name = "w", descriptor = "[I")
    public int[] field2093;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "[S")
    public short[] field2081;

    @OriginalMember(owner = "client!tr", name = "U", descriptor = "[I")
    public int[] field2117;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "[I")
    public int[] field2080;

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "[S")
    public short[] field2092;

    @OriginalMember(owner = "client!tr", name = "J", descriptor = "[I")
    public int[] field2106;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "[S")
    public short[] field2072;

    @OriginalMember(owner = "client!tr", name = "D", descriptor = "[I")
    public int[] field2100;

    @OriginalMember(owner = "client!tr", name = "C", descriptor = "[B")
    public byte[] field2099;

    @OriginalMember(owner = "client!tr", name = "M", descriptor = "[S")
    public short[] field2109;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "[S")
    public short[] field2073;

    @OriginalMember(owner = "client!tr", name = "T", descriptor = "[Lqh;")
    public class42[] field2116;

    @OriginalMember(owner = "client!tr", name = "B", descriptor = "[Ldj;")
    public class190[] field2098;

    @OriginalMember(owner = "client!tr", name = "P", descriptor = "[S")
    public short[] field2112;

    @OriginalMember(owner = "client!tr", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field2101;

    @OriginalMember(owner = "client!tr", name = "Q", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!tr", name = "W", descriptor = "F")
    public static float field2119;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!tr", name = "x", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!tr", name = "z", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!tr", name = "F", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!tr", name = "I", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!tr", name = "V", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!tr", name = "Y", descriptor = "I")
    public static int field2121;

    static {
        new class362("Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.");
        field2101 = new String[100];
        field2113 = 0;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B[B)V", line = 5)
    private final void method1019(byte arg0, byte[] arg1) {
        field2121++;
        boolean var3 = false;
        boolean var4 = false;
        class236 var5 = new class236(arg1);
        class236 var6 = new class236(arg1);
        class236 var7 = new class236(arg1);
        class236 var8 = new class236(arg1);
        class236 var9 = new class236(arg1);
        var5.field3320 = arg1.length - 18;
        this.field2097 = var5.method1617((byte) 48);
        this.field2110 = var5.method1617((byte) 48);
        this.field2085 = var5.method1574(-9);
        int var10 = var5.method1574(-72);
        int var11 = var5.method1574(-50);
        int var12 = var5.method1574(-116);
        int var13 = -87 / ((-arg0 - 1) / 48);
        int var14 = var5.method1574(-108);
        int var15 = var5.method1574(-46);
        int var16 = var5.method1617((byte) 48);
        int var17 = var5.method1617((byte) 48);
        int var18 = var5.method1617((byte) 48);
        int var19 = var5.method1617((byte) 48);
        byte var20 = 0;
        int var22 = this.field2097 + var20;
        int var24 = this.field2110 + var22;
        int var25 = var24;
        if (var11 == 255) {
            var24 += this.field2110;
        }
        int var26 = var24;
        if (var14 == 1) {
            var24 += this.field2110;
        }
        int var27 = var24;
        if (var10 == 1) {
            var24 += this.field2110;
        }
        int var28 = var24;
        if (var15 == 1) {
            var24 += this.field2097;
        }
        int var29 = var24;
        if (var12 == 1) {
            var24 += this.field2110;
        }
        int var31 = var19 + var24;
        int var33 = this.field2110 * 2 + var31;
        int var35 = this.field2085 * 6 + var33;
        int var37 = var16 + var35;
        int var39 = var17 + var37;
        this.field2082 = new short[this.field2110];
        if (var14 == 1) {
            this.field2080 = new int[this.field2110];
        }
        if (var12 == 1) {
            this.field2089 = new byte[this.field2110];
        }
        var5.field3320 = var20;
        this.field2081 = new short[this.field2110];
        if (this.field2085 > 0) {
            this.field2095 = new short[this.field2085];
            this.field2079 = new byte[this.field2085];
            this.field2120 = new short[this.field2085];
            this.field2087 = new short[this.field2085];
        }
        this.field2106 = new int[this.field2097];
        this.field2109 = new short[this.field2110];
        if (var15 == 1) {
            this.field2093 = new int[this.field2097];
        }
        if (var10 == 1) {
            this.field2092 = new short[this.field2110];
            this.field2099 = new byte[this.field2110];
            this.field2084 = new byte[this.field2110];
        }
        int var10000 = var18 + var39;
        if (var11 == 255) {
            this.field2091 = new byte[this.field2110];
        } else {
            this.field2108 = (byte) var11;
        }
        this.field2100 = new int[this.field2097];
        this.field2117 = new int[this.field2097];
        this.field2072 = new short[this.field2110];
        var6.field3320 = var35;
        var7.field3320 = var37;
        var8.field3320 = var39;
        var9.field3320 = var28;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        for (int var45 = 0; var45 < this.field2097; var45++) {
            int var61 = var5.method1574(-26);
            int var62 = 0;
            if ((var61 & 0x1) != 0) {
                var62 = var6.method1577(-1640531527);
            }
            int var63 = 0;
            if ((var61 & 0x2) != 0) {
                var63 = var7.method1577(-1640531527);
            }
            int var64 = 0;
            if ((var61 & 0x4) != 0) {
                var64 = var8.method1577(-1640531527);
            }
            this.field2100[var45] = var42 + var62;
            this.field2106[var45] = var43 + var63;
            this.field2117[var45] = var44 + var64;
            var44 = this.field2117[var45];
            var42 = this.field2100[var45];
            var43 = this.field2106[var45];
            if (var15 == 1) {
                this.field2093[var45] = var9.method1574(-13);
            }
        }
        var5.field3320 = var31;
        var6.field3320 = var27;
        var7.field3320 = var25;
        var8.field3320 = var29;
        var9.field3320 = var26;
        for (int var46 = 0; var46 < this.field2110; var46++) {
            this.field2082[var46] = (short) var5.method1617((byte) 48);
            if (var10 == 1) {
                int var60 = var6.method1574(-15);
                if ((var60 & 0x1) == 1) {
                    var3 = true;
                    this.field2084[var46] = 1;
                } else {
                    this.field2084[var46] = 0;
                }
                if ((var60 & 0x2) == 2) {
                    this.field2099[var46] = (byte) (var60 >> 2);
                    this.field2092[var46] = this.field2082[var46];
                    this.field2082[var46] = 127;
                    if (this.field2092[var46] != -1) {
                        var4 = true;
                    }
                } else {
                    this.field2099[var46] = -1;
                    this.field2092[var46] = -1;
                }
            }
            if (var11 == 255) {
                this.field2091[var46] = var7.method1589(false);
            }
            if (var12 == 1) {
                this.field2089[var46] = var8.method1589(false);
            }
            if (var14 == 1) {
                this.field2080[var46] = var9.method1574(-95);
            }
        }
        this.field2083 = -1;
        var5.field3320 = var24;
        var6.field3320 = var22;
        short var47 = 0;
        short var48 = 0;
        short var49 = 0;
        short var50 = 0;
        for (int var51 = 0; var51 < this.field2110; var51++) {
            int var56 = var6.method1574(-30);
            if (var56 == 1) {
                var47 = (short) (var5.method1577(-1640531527) + var50);
                var48 = (short) (var47 + var5.method1577(-1640531527));
                var49 = (short) (var48 + var5.method1577(-1640531527));
                this.field2109[var51] = var47;
                var50 = var49;
                this.field2072[var51] = var48;
                this.field2081[var51] = var49;
                if (var47 > this.field2083) {
                    this.field2083 = var47;
                }
                if (var48 > this.field2083) {
                    this.field2083 = var48;
                }
                if (var49 > this.field2083) {
                    this.field2083 = var49;
                }
            }
            if (var56 == 2) {
                var48 = var49;
                var49 = (short) (var5.method1577(-1640531527) + var50);
                var50 = var49;
                this.field2109[var51] = var47;
                this.field2072[var51] = var48;
                this.field2081[var51] = var49;
                if (this.field2083 < var49) {
                    this.field2083 = var49;
                }
            }
            if (var56 == 3) {
                var47 = var49;
                var49 = (short) (var50 + var5.method1577(-1640531527));
                this.field2109[var51] = var47;
                var50 = var49;
                this.field2072[var51] = var48;
                this.field2081[var51] = var49;
                if (this.field2083 < var49) {
                    this.field2083 = var49;
                }
            }
            if (var56 == 4) {
                short var59 = var47;
                var47 = var48;
                var49 = (short) (var50 + var5.method1577(-1640531527));
                var48 = var59;
                this.field2109[var51] = var47;
                var50 = var49;
                this.field2072[var51] = var59;
                this.field2081[var51] = var49;
                if (var49 > this.field2083) {
                    this.field2083 = var49;
                }
            }
        }
        var5.field3320 = var33;
        this.field2083++;
        for (int var52 = 0; var52 < this.field2085; var52++) {
            this.field2079[var52] = 0;
            this.field2095[var52] = (short) var5.method1617((byte) 48);
            this.field2120[var52] = (short) var5.method1617((byte) 48);
            this.field2087[var52] = (short) var5.method1617((byte) 48);
        }
        if (this.field2099 != null) {
            boolean var53 = false;
            for (int var54 = 0; var54 < this.field2110; var54++) {
                int var55 = this.field2099[var54] & 0xFF;
                if (var55 != 255) {
                    if ((this.field2095[var55] & 0xFFFF) == this.field2109[var54] && (this.field2120[var55] & 0xFFFF) == this.field2072[var54] && (this.field2087[var55] & 0xFFFF) == this.field2081[var54]) {
                        this.field2099[var54] = -1;
                    } else {
                        var53 = true;
                    }
                }
            }
            if (!var53) {
                this.field2099 = null;
            }
        }
        if (!var3) {
            this.field2084 = null;
        }
        if (!var4) {
            this.field2092 = null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIZI)V", line = 385)
    public final void method1020(int arg0, int arg1, boolean arg2, int arg3) {
        field2075++;
        if (!arg2) {
            this.field2106 = null;
        }
        if (arg1 != 0) {
            int var5 = class158.field2055[arg1];
            int var6 = class158.field2059[arg1];
            for (int var7 = 0; var7 < this.field2097; var7++) {
                int var8 = this.field2106[var7] * var5 + this.field2100[var7] * var6 >> 15;
                this.field2106[var7] = this.field2106[var7] * var6 - this.field2100[var7] * var5 >> 15;
                this.field2100[var7] = var8;
            }
        }
        if (arg0 != 0) {
            int var9 = class158.field2055[arg0];
            int var10 = class158.field2059[arg0];
            for (int var11 = 0; var11 < this.field2097; var11++) {
                int var12 = this.field2106[var11] * var10 - (this.field2117[var11] * var9) >> 15;
                this.field2117[var11] = this.field2117[var11] * var10 + this.field2106[var11] * var9 >> 15;
                this.field2106[var11] = var12;
            }
        }
        if (arg3 == 0) {
            return;
        }
        int var13 = class158.field2055[arg3];
        int var14 = class158.field2059[arg3];
        for (int var15 = 0; var15 < this.field2097; var15++) {
            int var16 = this.field2117[var15] * var13 + this.field2100[var15] * var14 >> 15;
            this.field2117[var15] = this.field2117[var15] * var14 - (this.field2100[var15] * var13) >> 15;
            this.field2100[var15] = var16;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIII)I", line = 457)
    public final int method1021(int arg0, int arg1, int arg2, int arg3) {
        field2086++;
        for (int var5 = 0; var5 < this.field2097; var5++) {
            if (this.field2100[var5] == arg1 && this.field2106[var5] == arg0 && this.field2117[var5] == arg3) {
                return var5;
            }
        }
        this.field2100[this.field2097] = arg1;
        this.field2106[this.field2097] = arg0;
        this.field2117[this.field2097] = arg3;
        this.field2083 = this.field2097 + arg2;
        return this.field2097++;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BBBSZSSSSS)B", line = 483)
    public final byte method1022(byte arg0, byte arg1, byte arg2, short arg3, boolean arg4, short arg5, short arg6, short arg7, short arg8, short arg9) {
        field2077++;
        if (this.field2085 >= 255) {
            throw new IllegalStateException();
        }
        this.field2079[this.field2085] = 3;
        this.field2095[this.field2085] = arg3;
        this.field2120[this.field2085] = arg8;
        this.field2087[this.field2085] = arg9;
        this.field2107[this.field2085] = arg5;
        this.field2111[this.field2085] = arg6;
        this.field2078[this.field2085] = arg7;
        this.field2115[this.field2085] = arg1;
        if (!arg4) {
            this.field2104 = null;
        }
        this.field2103[this.field2085] = arg0;
        this.field2104[this.field2085] = arg2;
        return (byte) (this.field2085++);
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(IIII)Z", line = 511)
    public static final boolean method1023(int arg0, int arg1, int arg2, int arg3) {
        if (class261.method1746(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class331.method2131(var4 + 1, class161.field2122[arg0].method328(arg1, arg2) + arg3, var5 + 1) && class331.method2131(var4 + 128 - 1, class161.field2122[arg0].method328(arg1 + 1, arg2) + arg3, var5 + 1) && class331.method2131(var4 + 128 - 1, class161.field2122[arg0].method328(arg1 + 1, arg2 + 1) + arg3, var5 + 128 - 1) && class331.method2131(var4 + 1, class161.field2122[arg0].method328(arg1, arg2 + 1) + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ltr;IIS)I", line = 530)
    private final int method1024(class160 arg0, int arg1, int arg2, short arg3) {
        field2071++;
        int var5 = arg0.field2100[arg1];
        int var6 = arg0.field2106[arg1];
        int var7 = arg0.field2117[arg1];
        for (int var8 = arg2; var8 < this.field2097; var8++) {
            if (this.field2100[var8] == var5 && this.field2106[var8] == var6 && this.field2117[var8] == var7) {
                this.field2112[var8] = (short) class429.method2704(this.field2112[var8], arg3);
                return var8;
            }
        }
        this.field2100[this.field2097] = var5;
        this.field2106[this.field2097] = var6;
        this.field2117[this.field2097] = var7;
        this.field2112[this.field2097] = arg3;
        this.field2093[this.field2097] = arg0.field2093 == null ? -1 : arg0.field2093[arg1];
        return this.field2097++;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ISBBISIBZ)I", line = 565)
    public final int method1025(int arg0, short arg1, byte arg2, byte arg3, int arg4, short arg5, int arg6, byte arg7, boolean arg8) {
        field2074++;
        this.field2109[this.field2110] = (short) arg0;
        this.field2072[this.field2110] = (short) arg4;
        this.field2081[this.field2110] = (short) arg6;
        this.field2084[this.field2110] = arg7;
        this.field2099[this.field2110] = arg2;
        this.field2082[this.field2110] = arg1;
        if (!arg8) {
            this.field2107 = null;
        }
        this.field2089[this.field2110] = arg3;
        this.field2092[this.field2110] = arg5;
        return this.field2110++;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIZ)V", line = 592)
    public final void method1026(int arg0, int arg1, int arg2, boolean arg3) {
        for (int var5 = 0; var5 < this.field2097; var5++) {
            this.field2100[var5] += arg2;
            this.field2106[var5] += arg1;
            this.field2117[var5] += arg0;
        }
        if (!arg3) {
            this.method1027((byte) 110, (short) -103, (short) 61);
        }
        field2096++;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BSS)V", line = 616)
    public final void method1027(byte arg0, short arg1, short arg2) {
        field2102++;
        if (this.field2092 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field2110; var4++) {
            if (this.field2092[var4] == arg2) {
                this.field2092[var4] = arg1;
            }
        }
        if (arg0 < 36) {
            this.method1020(-126, -86, false, 1);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V", line = 642)
    public static void method1028(byte arg0) {
        field2101 = null;
        if (arg0 != -86) {
            field2105 = -56;
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)[[I", line = 661)
    public final int[][] method1029(byte arg0) {
        field2088++;
        int[] var2 = new int[256];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2110; var4++) {
            int var9 = this.field2080[var4];
            if (var9 >= 0) {
                if (var9 > var3) {
                    var3 = var9;
                }
                int var10002 = var2[var9]++;
            }
        }
        int[][] var5 = new int[var3 + 1][];
        if (arg0 < 107) {
            this.field2087 = null;
        }
        for (int var6 = 0; var6 <= var3; var6++) {
            var5[var6] = new int[var2[var6]];
            var2[var6] = 0;
        }
        for (int var7 = 0; var7 < this.field2110; var7++) {
            int var8 = this.field2080[var7];
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "([B)V", line = 1368)
    public class160(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1030(arg0, -1);
        } else {
            this.method1019((byte) 111, arg0);
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(III)V", line = 1379)
    public class160(int arg0, int arg1, int arg2) {
        this.field2082 = new short[arg1];
        this.field2091 = new byte[arg1];
        this.field2084 = new byte[arg1];
        this.field2089 = new byte[arg1];
        if (arg2 > 0) {
            this.field2103 = new byte[arg2];
            this.field2114 = new byte[arg2];
            this.field2079 = new byte[arg2];
            this.field2090 = new byte[arg2];
            this.field2107 = new short[arg2];
            this.field2115 = new byte[arg2];
            this.field2095 = new short[arg2];
            this.field2104 = new byte[arg2];
            this.field2087 = new short[arg2];
            this.field2120 = new short[arg2];
            this.field2111 = new short[arg2];
            this.field2078 = new short[arg2];
        }
        this.field2093 = new int[arg0];
        this.field2081 = new short[arg1];
        this.field2117 = new int[arg0];
        this.field2080 = new int[arg1];
        this.field2092 = new short[arg1];
        this.field2106 = new int[arg0];
        this.field2072 = new short[arg1];
        this.field2100 = new int[arg0];
        this.field2099 = new byte[arg1];
        this.field2109 = new short[arg1];
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "([Ltr;I)V", line = 1416)
    public class160(class160[] arg0, int arg1) {
        this.field2110 = 0;
        this.field2097 = 0;
        this.field2085 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        this.field2108 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class160 var31 = arg0[var11];
            if (var31 != null) {
                this.field2110 += var31.field2110;
                this.field2097 += var31.field2097;
                this.field2085 += var31.field2085;
                if (var31.field2098 != null) {
                    var4 += var31.field2098.length;
                }
                var5 |= var31.field2084 != null;
                if (var31.field2116 != null) {
                    var3 += var31.field2116.length;
                }
                var8 |= var31.field2099 != null;
                var7 |= var31.field2089 != null;
                if (var31.field2091 == null) {
                    if (this.field2108 == -1) {
                        this.field2108 = var31.field2108;
                    }
                    if (this.field2108 != var31.field2108) {
                        var6 = true;
                    }
                } else {
                    var6 = true;
                }
                var10 |= var31.field2080 != null;
                var9 |= var31.field2092 != null;
            }
        }
        if (this.field2085 > 0) {
            this.field2111 = new short[this.field2085];
            this.field2120 = new short[this.field2085];
            this.field2107 = new short[this.field2085];
            this.field2090 = new byte[this.field2085];
            this.field2095 = new short[this.field2085];
            this.field2079 = new byte[this.field2085];
            this.field2103 = new byte[this.field2085];
            this.field2104 = new byte[this.field2085];
            this.field2115 = new byte[this.field2085];
            this.field2087 = new short[this.field2085];
            this.field2114 = new byte[this.field2085];
            this.field2078 = new short[this.field2085];
        }
        this.field2100 = new int[this.field2097];
        this.field2081 = new short[this.field2110];
        if (var6) {
            this.field2091 = new byte[this.field2110];
        }
        this.field2073 = new short[this.field2110];
        this.field2109 = new short[this.field2110];
        if (var3 > 0) {
            this.field2116 = new class42[var3];
        }
        if (var8) {
            this.field2099 = new byte[this.field2110];
        }
        this.field2106 = new int[this.field2097];
        this.field2117 = new int[this.field2097];
        this.field2072 = new short[this.field2110];
        if (var10) {
            this.field2080 = new int[this.field2110];
        }
        this.field2093 = new int[this.field2097];
        if (var4 > 0) {
            this.field2098 = new class190[var4];
        }
        if (var9) {
            this.field2092 = new short[this.field2110];
        }
        this.field2112 = new short[this.field2097];
        this.field2082 = new short[this.field2110];
        if (var5) {
            this.field2084 = new byte[this.field2110];
        }
        if (var7) {
            this.field2089 = new byte[this.field2110];
        }
        this.field2097 = 0;
        int var12 = 0;
        int var13 = 0;
        this.field2110 = 0;
        this.field2085 = 0;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var22 = (short) (0x1 << var14);
            class160 var23 = arg0[var14];
            if (var23 != null) {
                for (int var24 = 0; var24 < var23.field2110; var24++) {
                    if (var5 && var23.field2084 != null) {
                        this.field2084[this.field2110] = var23.field2084[var24];
                    }
                    if (var6) {
                        if (var23.field2091 == null) {
                            this.field2091[this.field2110] = var23.field2108;
                        } else {
                            this.field2091[this.field2110] = var23.field2091[var24];
                        }
                    }
                    if (var7 && var23.field2089 != null) {
                        this.field2089[this.field2110] = var23.field2089[var24];
                    }
                    if (var9) {
                        if (var23.field2092 == null) {
                            this.field2092[this.field2110] = -1;
                        } else {
                            this.field2092[this.field2110] = var23.field2092[var24];
                        }
                    }
                    if (var10) {
                        if (var23.field2080 == null) {
                            this.field2080[this.field2110] = -1;
                        } else {
                            this.field2080[this.field2110] = var23.field2080[var24];
                        }
                    }
                    this.field2109[this.field2110] = (short) this.method1024(var23, var23.field2109[var24], 0, var22);
                    this.field2072[this.field2110] = (short) this.method1024(var23, var23.field2072[var24], 0, var22);
                    this.field2081[this.field2110] = (short) this.method1024(var23, var23.field2081[var24], 0, var22);
                    this.field2073[this.field2110] = var22;
                    this.field2082[this.field2110] = var23.field2082[var24];
                    this.field2110++;
                }
                if (var23.field2116 != null) {
                    for (int var25 = 0; var25 < var23.field2116.length; var25++) {
                        int var26 = this.method1024(var23, var23.field2116[var25].field513, 0, var22);
                        int var27 = this.method1024(var23, var23.field2116[var25].field508, 0, var22);
                        int var28 = this.method1024(var23, var23.field2116[var25].field507, 0, var22);
                        this.field2116[var13] = new class42(var23.field2116[var25].field510, var26, var27, var28, var23.field2116[var25].field525);
                        var13++;
                    }
                }
                if (var23.field2098 != null) {
                    for (int var29 = 0; var29 < var23.field2098.length; var29++) {
                        int var30 = this.method1024(var23, var23.field2098[var29].field2738, 0, var22);
                        this.field2098[var12] = new class190(var23.field2098[var29].field2740, var30);
                        var12++;
                    }
                }
            }
        }
        int var15 = 0;
        this.field2083 = this.field2097;
        for (int var16 = 0; var16 < arg1; var16++) {
            short var17 = (short) (0x1 << var16);
            class160 var18 = arg0[var16];
            if (var18 != null) {
                for (int var19 = 0; var19 < var18.field2110; var19++) {
                    if (var8) {
                        this.field2099[var15++] = (byte) (var18.field2099 == null || var18.field2099[var19] == -1 ? -1 : var18.field2099[var19] + this.field2085);
                    }
                }
                for (int var20 = 0; var20 < var18.field2085; var20++) {
                    byte var21 = this.field2079[this.field2085] = var18.field2079[var20];
                    if (var21 == 0) {
                        this.field2095[this.field2085] = (short) this.method1024(var18, var18.field2095[var20], 0, var17);
                        this.field2120[this.field2085] = (short) this.method1024(var18, var18.field2120[var20], 0, var17);
                        this.field2087[this.field2085] = (short) this.method1024(var18, var18.field2087[var20], 0, var17);
                    }
                    if (var21 >= 1 && var21 <= 3) {
                        this.field2095[this.field2085] = var18.field2095[var20];
                        this.field2120[this.field2085] = var18.field2120[var20];
                        this.field2087[this.field2085] = var18.field2087[var20];
                        this.field2107[this.field2085] = var18.field2107[var20];
                        this.field2111[this.field2085] = var18.field2111[var20];
                        this.field2078[this.field2085] = var18.field2078[var20];
                        this.field2115[this.field2085] = var18.field2115[var20];
                        this.field2103[this.field2085] = var18.field2103[var20];
                        this.field2104[this.field2085] = var18.field2104[var20];
                    }
                    if (var21 == 2) {
                        this.field2090[this.field2085] = var18.field2090[var20];
                        this.field2114[this.field2085] = var18.field2114[var20];
                    }
                    this.field2085++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "([BI)V", line = 751)
    private final void method1030(byte[] arg0, int arg1) {
        field2076++;
        class236 var3 = new class236(arg0);
        class236 var4 = new class236(arg0);
        class236 var5 = new class236(arg0);
        class236 var6 = new class236(arg0);
        class236 var7 = new class236(arg0);
        class236 var8 = new class236(arg0);
        class236 var9 = new class236(arg0);
        var3.field3320 = arg0.length - 23;
        this.field2097 = var3.method1617((byte) 48);
        this.field2110 = var3.method1617((byte) 48);
        this.field2085 = var3.method1574(-85);
        int var10 = var3.method1574(-85);
        boolean var11 = (var10 & 0x1) == 1;
        boolean var12 = (var10 & 0x2) == 2;
        int var13 = var3.method1574(arg1 ^ 0x76);
        int var14 = var3.method1574(-66);
        int var15 = var3.method1574(arg1 ^ 0x62);
        int var16 = var3.method1574(-124);
        int var17 = var3.method1574(-5);
        int var18 = var3.method1617((byte) 48);
        int var19 = var3.method1617((byte) 48);
        int var20 = var3.method1617((byte) 48);
        int var21 = var3.method1617((byte) 48);
        int var22 = var3.method1617((byte) 48);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (~this.field2085 < arg1) {
            this.field2079 = new byte[this.field2085];
            var3.field3320 = 0;
            for (int var26 = 0; var26 < this.field2085; var26++) {
                byte var27 = this.field2079[var26] = var3.method1589(false);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var28 = this.field2085;
        int var30 = this.field2097 + var28;
        int var31 = var30;
        if (var11) {
            var30 += this.field2110;
        }
        int var33 = this.field2110 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += this.field2110;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += this.field2110;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += this.field2097;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += this.field2110;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += this.field2110 * 2;
        }
        int var42 = var22 + var39;
        int var44 = this.field2110 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        if (var11) {
            this.field2084 = new byte[this.field2110];
        }
        if (var16 == 1) {
            this.field2092 = new short[this.field2110];
        }
        this.field2106 = new int[this.field2097];
        if (var17 == 1) {
            this.field2093 = new int[this.field2097];
        }
        if (var15 == 1) {
            this.field2080 = new int[this.field2110];
        }
        var3.field3320 = var28;
        if (var13 == 255) {
            this.field2091 = new byte[this.field2110];
        } else {
            this.field2108 = (byte) var13;
        }
        this.field2072 = new short[this.field2110];
        this.field2109 = new short[this.field2110];
        this.field2082 = new short[this.field2110];
        this.field2081 = new short[this.field2110];
        if (this.field2085 > 0) {
            if (var25 > 0) {
                this.field2114 = new byte[var25];
                this.field2090 = new byte[var25];
            }
            this.field2087 = new short[this.field2085];
            this.field2120 = new short[this.field2085];
            if (var24 > 0) {
                this.field2104 = new byte[var24];
                this.field2115 = new byte[var24];
                this.field2103 = new byte[var24];
                this.field2111 = new short[var24];
                this.field2078 = new short[var24];
                this.field2107 = new short[var24];
            }
            this.field2095 = new short[this.field2085];
        }
        this.field2100 = new int[this.field2097];
        this.field2117 = new int[this.field2097];
        if (var16 == 1 && this.field2085 > 0) {
            this.field2099 = new byte[this.field2110];
        }
        if (var14 == 1) {
            this.field2089 = new byte[this.field2110];
        }
        var4.field3320 = var44;
        var5.field3320 = var46;
        var6.field3320 = var48;
        var7.field3320 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < this.field2097; var67++) {
            int var87 = var3.method1574(-26);
            int var88 = 0;
            if ((var87 & 0x1) != 0) {
                var88 = var4.method1577(-1640531527);
            }
            int var89 = 0;
            if ((var87 & 0x2) != 0) {
                var89 = var5.method1577(-1640531527);
            }
            int var90 = 0;
            if ((var87 & 0x4) != 0) {
                var90 = var6.method1577(-1640531527);
            }
            this.field2100[var67] = var64 + var88;
            this.field2106[var67] = var65 + var89;
            this.field2117[var67] = var66 + var90;
            var66 = this.field2117[var67];
            var65 = this.field2106[var67];
            var64 = this.field2100[var67];
            if (var17 == 1) {
                this.field2093[var67] = var7.method1574(-52);
            }
        }
        var3.field3320 = var42;
        var4.field3320 = var31;
        var5.field3320 = var34;
        var6.field3320 = var37;
        var7.field3320 = var35;
        var8.field3320 = var40;
        var9.field3320 = var39;
        for (int var68 = 0; var68 < this.field2110; var68++) {
            this.field2082[var68] = (short) var3.method1617((byte) 48);
            if (var11) {
                this.field2084[var68] = var4.method1589(false);
            }
            if (var13 == 255) {
                this.field2091[var68] = var5.method1589(false);
            }
            if (var14 == 1) {
                this.field2089[var68] = var6.method1589(false);
            }
            if (var15 == 1) {
                this.field2080[var68] = var7.method1574(-102);
            }
            if (var16 == 1) {
                this.field2092[var68] = (short) (var8.method1617((byte) 48) - 1);
            }
            if (this.field2099 != null) {
                if (this.field2092[var68] == -1) {
                    this.field2099[var68] = -1;
                } else {
                    this.field2099[var68] = (byte) (var9.method1574(-9) - 1);
                }
            }
        }
        this.field2083 = -1;
        var3.field3320 = var33;
        var4.field3320 = var30;
        short var69 = 0;
        short var70 = 0;
        short var71 = 0;
        short var72 = 0;
        for (int var73 = 0; var73 < this.field2110; var73++) {
            int var83 = var4.method1574(-125);
            if (var83 == 1) {
                var69 = (short) (var72 + var3.method1577(-1640531527));
                var70 = (short) (var69 + var3.method1577(-1640531527));
                var71 = (short) (var70 + var3.method1577(-1640531527));
                var72 = var71;
                this.field2109[var73] = var69;
                this.field2072[var73] = var70;
                this.field2081[var73] = var71;
                if (var69 > this.field2083) {
                    this.field2083 = var69;
                }
                if (var70 > this.field2083) {
                    this.field2083 = var70;
                }
                if (var71 > this.field2083) {
                    this.field2083 = var71;
                }
            }
            if (var83 == 2) {
                var70 = var71;
                var71 = (short) (var3.method1577(-1640531527) + var72);
                this.field2109[var73] = var69;
                var72 = var71;
                this.field2072[var73] = var70;
                this.field2081[var73] = var71;
                if (this.field2083 < var71) {
                    this.field2083 = var71;
                }
            }
            if (var83 == 3) {
                var69 = var71;
                var71 = (short) (var3.method1577(-1640531527) + var72);
                var72 = var71;
                this.field2109[var73] = var69;
                this.field2072[var73] = var70;
                this.field2081[var73] = var71;
                if (this.field2083 < var71) {
                    this.field2083 = var71;
                }
            }
            if (var83 == 4) {
                short var86 = var69;
                var69 = var70;
                var70 = var86;
                var71 = (short) (var3.method1577(-1640531527) + var72);
                this.field2109[var73] = var69;
                var72 = var71;
                this.field2072[var73] = var86;
                this.field2081[var73] = var71;
                if (this.field2083 < var71) {
                    this.field2083 = var71;
                }
            }
        }
        this.field2083++;
        var3.field3320 = var50;
        var4.field3320 = var52;
        var5.field3320 = var54;
        var6.field3320 = var56;
        var7.field3320 = var58;
        var8.field3320 = var60;
        for (int var74 = 0; var74 < this.field2085; var74++) {
            int var82 = this.field2079[var74] & 0xFF;
            if (var82 == 0) {
                this.field2095[var74] = (short) var3.method1617((byte) 48);
                this.field2120[var74] = (short) var3.method1617((byte) 48);
                this.field2087[var74] = (short) var3.method1617((byte) 48);
            }
            if (var82 == 1) {
                this.field2095[var74] = (short) var4.method1617((byte) 48);
                this.field2120[var74] = (short) var4.method1617((byte) 48);
                this.field2087[var74] = (short) var4.method1617((byte) 48);
                this.field2107[var74] = (short) var5.method1617((byte) 48);
                this.field2111[var74] = (short) var5.method1617((byte) 48);
                this.field2078[var74] = (short) var5.method1617((byte) 48);
                this.field2115[var74] = var6.method1589(false);
                this.field2103[var74] = var7.method1589(false);
                this.field2104[var74] = var8.method1589(false);
            }
            if (var82 == 2) {
                this.field2095[var74] = (short) var4.method1617((byte) 48);
                this.field2120[var74] = (short) var4.method1617((byte) 48);
                this.field2087[var74] = (short) var4.method1617((byte) 48);
                this.field2107[var74] = (short) var5.method1617((byte) 48);
                this.field2111[var74] = (short) var5.method1617((byte) 48);
                this.field2078[var74] = (short) var5.method1617((byte) 48);
                this.field2115[var74] = var6.method1589(false);
                this.field2103[var74] = var7.method1589(false);
                this.field2104[var74] = var8.method1589(false);
                this.field2090[var74] = var8.method1589(false);
                this.field2114[var74] = var8.method1589(false);
            }
            if (var82 == 3) {
                this.field2095[var74] = (short) var4.method1617((byte) 48);
                this.field2120[var74] = (short) var4.method1617((byte) 48);
                this.field2087[var74] = (short) var4.method1617((byte) 48);
                this.field2107[var74] = (short) var5.method1617((byte) 48);
                this.field2111[var74] = (short) var5.method1617((byte) 48);
                this.field2078[var74] = (short) var5.method1617((byte) 48);
                this.field2115[var74] = var6.method1589(false);
                this.field2103[var74] = var7.method1589(false);
                this.field2104[var74] = var8.method1589(false);
            }
        }
        if (!var12) {
            return;
        }
        var3.field3320 = var62;
        int var75 = var3.method1574(-76);
        if (var75 > 0) {
            this.field2116 = new class42[var75];
            for (int var76 = 0; var76 < var75; var76++) {
                int var77 = var3.method1617((byte) 48);
                int var78 = var3.method1617((byte) 48);
                byte var79;
                if (var13 == 255) {
                    var79 = this.field2091[var78];
                } else {
                    var79 = (byte) var13;
                }
                this.field2116[var76] = new class42(var77, this.field2109[var78], this.field2072[var78], this.field2081[var78], var79);
            }
        }
        int var80 = var3.method1574(-41);
        if (var80 <= 0) {
            return;
        }
        this.field2098 = new class190[var80];
        for (int var81 = 0; var81 < var80; var81++) {
            this.field2098[var81] = new class190(var3.method1617((byte) 48), var3.method1617((byte) 48));
        }
        return;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(SIS)V", line = 1279)
    public final void method1031(short arg0, int arg1, short arg2) {
        field2094++;
        for (int var4 = arg1; var4 < this.field2110; var4++) {
            if (this.field2082[var4] == arg0) {
                this.field2082[var4] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)[[I", line = 1306)
    public final int[][] method1032(boolean arg0) {
        field2118++;
        int[] var2 = new int[256];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2083; var4++) {
            int var9 = this.field2093[var4];
            if (var9 >= 0) {
                if (var3 < var9) {
                    var3 = var9;
                }
                int var10002 = var2[var9]++;
            }
        }
        if (arg0) {
            return null;
        }
        int[][] var5 = new int[var3 + 1][];
        for (int var6 = 0; var6 <= var3; var6++) {
            var5[var6] = new int[var2[var6]];
            var2[var6] = 0;
        }
        for (int var7 = 0; var7 < this.field2083; var7++) {
            int var8 = this.field2093[var7];
            if (var8 >= 0) {
                var5[var8][var2[var8]++] = var7;
            }
        }
        return var5;
    }
}
