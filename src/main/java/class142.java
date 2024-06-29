import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class142 extends class248 {

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    private int field2092 = 0;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "Z")
    private boolean field2106 = false;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    private int field2080 = -32768;

    @OriginalMember(owner = "client!ok", name = "Y", descriptor = "I")
    private int field2110 = 0;

    @OriginalMember(owner = "client!ok", name = "ab", descriptor = "Z")
    private boolean field2112 = false;

    @OriginalMember(owner = "client!ok", name = "gb", descriptor = "I")
    private int field2118 = -1;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
    private int field2103;

    @OriginalMember(owner = "client!ok", name = "eb", descriptor = "I")
    public int field2116;

    @OriginalMember(owner = "client!ok", name = "db", descriptor = "I")
    private int field2115;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public int field2073;

    @OriginalMember(owner = "client!ok", name = "Z", descriptor = "I")
    private int field2111;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
    private int field2100;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    public int field2095;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "I")
    public int field2108;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "I")
    private int field2102;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    private int field2076;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "Lqk;")
    private class57 field2084;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field2081 = 0;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "Lfe;")
    public static class231 field2079 = null;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "I")
    public static int field2094 = 0;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "D")
    private double field2072;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "D")
    private double field2083;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "D")
    public double field2085;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "D")
    private double field2088;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "D")
    public double field2089;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "D")
    private double field2101;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "D")
    private double field2105;

    @OriginalMember(owner = "client!ok", name = "cb", descriptor = "D")
    public double field2114;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    private int field2082;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    public int field2096;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!ok", name = "bb", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!ok", name = "fb", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Leb;")
    public static class109 field2074;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "Lom;")
    private class65 field2078;

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "Ljava/lang/String;")
    public static String field2109;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZI)V")
    public final void method919(boolean arg0, int arg1) {
        this.field2112 = true;
        field2097++;
        if (this.field2103 == -1) {
            this.field2089 += (double) arg1 * this.field2072;
        } else {
            this.field2089 += this.field2101 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2072;
            this.field2072 += (double) arg1 * this.field2101;
        }
        this.field2114 += (double) arg1 * this.field2105;
        this.field2085 += (double) arg1 * this.field2088;
        this.field2096 = (int) (Math.atan2(this.field2088, this.field2105) * 325.949D) + 1024 & 0x7FF;
        this.field2082 = (int) (Math.atan2(this.field2072, this.field2083) * 325.949D) & 0x7FF;
        if (this.field2084 != null) {
            this.field2092 += arg1;
            label45: while (true) {
                do {
                    do {
                        if (this.field2092 <= this.field2084.field828[this.field2110]) {
                            break label45;
                        }
                        this.field2092 -= this.field2084.field828[this.field2110];
                        this.field2110++;
                        if (this.field2084.field850.length <= this.field2110) {
                            this.field2110 -= this.field2084.field830;
                            if (this.field2110 < 0 || this.field2110 >= this.field2084.field850.length) {
                                this.field2110 = 0;
                            }
                        }
                        this.field2118 = this.field2110 + 1;
                    } while (this.field2118 < this.field2084.field850.length);
                    this.field2118 -= this.field2084.field830;
                } while (this.field2118 >= 0 && this.field2084.field850.length > this.field2118);
                this.field2118 = -1;
            }
        }
        if (arg0) {
            this.method3(13, -4, 8, -23, 109);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)Lli;")
    private final class208 method920(boolean arg0) {
        class214 var2 = class92.method629(this.field2100, 12288);
        field2099++;
        if (!arg0) {
            this.field2080 = -48;
        }
        class208 var3 = var2.method1500(this.field2092, this.field2110, this.field2118, (byte) -94);
        if (var3 == null) {
            return null;
        } else {
            var3.method323(this.field2082);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(CB)Z")
    public static final boolean method921(char arg0, byte arg1) {
        field2075++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class117.field1694;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        if (arg1 != -21) {
            method928((class1) null, (byte) -120);
        }
        return false;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIII)V")
    public final void method3(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2086++;
        if (!this.field2106) {
            class208 var6 = this.method920(true);
            if (var6 == null) {
                return;
            }
            this.method924(104, var6);
        }
        if (this.field2078 != null) {
            this.field2078.method416(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
    public static final void method922(byte arg0) {
        field2090++;
        if (arg0 != -121) {
            method922((byte) -2);
        }
        class164.field2542.method1511((byte) 125);
        class231.field3624.method1511((byte) 95);
        class36.field438.method1511((byte) 107);
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V")
    public static void method923(byte arg0) {
        if (arg0 == 118) {
            field2074 = null;
            field2109 = null;
            field2079 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()I")
    public final int method4() {
        field2113++;
        return this.field2080;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIIJILom;)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class65 arg10) {
        class208 var13 = this.method920(true);
        field2107++;
        if (var13 != null) {
            this.method924(104, var13);
            var13.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2078);
            this.field2080 = var13.method4();
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILli;)V")
    private final void method924(int arg0, class208 arg1) {
        class51 var3 = (class51) arg1;
        if (arg0 != 104) {
            return;
        }
        if ((this.field2078 == null || this.field2078.field933) && (var3.field653 != null || var3.field665 != null)) {
            this.field2078 = new class65(class311.field4996, 1, 1);
        }
        if (this.field2078 != null) {
            this.field2078.method427(var3.field653, var3.field665, false, var3.field647, var3.field649, var3.field673);
        }
        field2098++;
        this.field2106 = true;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)V")
    public static final void method925(byte arg0, int arg1) {
        if (class19.field259 == null) {
            class19.field259 = new byte[4][104][104];
        }
        for (int var2 = arg1; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class19.field259[var2][var3][var4] = arg0;
                }
            }
        }
        field2077++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BC)Z")
    public static final boolean method926(byte arg0, char arg1) {
        field2117++;
        if (arg0 > -3) {
            return false;
        } else {
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(IIIII)V")
    public final void method927(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field2112) {
            double var6 = (double) (arg1 - this.field2076);
            double var8 = (double) (arg3 - this.field2115);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2089 = (double) this.field2111;
            this.field2085 = (double) this.field2102 * var6 / var10 + (double) this.field2076;
            this.field2114 = (double) this.field2102 * var8 / var10 + (double) this.field2115;
        }
        double var12 = (double) (this.field2108 + 1 - arg4);
        this.field2088 = ((double) arg1 - this.field2085) / var12;
        this.field2105 = ((double) arg3 - this.field2114) / var12;
        field2104++;
        this.field2083 = Math.sqrt(this.field2105 * this.field2105 + this.field2088 * this.field2088);
        if (~this.field2103 == arg2) {
            this.field2072 = ((double) arg0 - this.field2089) / var12;
        } else {
            if (!this.field2112) {
                this.field2072 = -this.field2083 * Math.tan((double) this.field2103 * 0.02454369D);
            }
            this.field2101 = ((double) arg0 - this.field2089 - this.field2072 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Laj;B)V")
    public static final void method928(class1 arg0, byte arg1) {
        field2093++;
        class251 var2 = (class251) class13.field190.method1064(-1, class176.method1256((byte) 127, arg0.field31));
        if (arg1 >= -127 || var2 == null) {
            return;
        }
        if (var2.field4099 != null) {
            class81.field1231.method1931(var2.field4099);
            var2.field4099 = null;
        }
        var2.method1764(64);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIZIII[BII[Lji;I)[I")
    public static final int[] method929(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, class99[] arg9, int arg10) {
        int var11 = (arg3 & 0x7) * 8;
        field2087++;
        int var12 = (arg0 & 0x7) * 8;
        byte var13;
        if (arg2) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        if (!arg2) {
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class238.method1669(arg4, -32302, var15 & 0x7, var14 & 0x7) + arg7;
                    int var17 = arg10 + class105.method700(var14 & 0x7, var15 & 0x7, arg4, true);
                    if (var16 > 0 && var16 < 103 && var17 > 0 && var17 < 103) {
                        arg9[arg8].field1493[var16][var17] = class205.method1411(arg9[arg8].field1493[var16][var17], -2097153);
                    }
                }
            }
        }
        int var18 = (arg3 & 0xFFFFFFF8) << 3;
        class170 var19 = new class170(arg6);
        byte var20 = 0;
        int var21 = (arg0 & 0xFFFFFFF8) << 3;
        byte var22 = 0;
        if (arg4 == 1) {
            var22 = 1;
        } else if (arg4 == 2) {
            var20 = 1;
            var22 = 1;
        } else if (arg4 == 3) {
            var20 = 1;
        }
        for (int var23 = 0; var23 < var13; var23++) {
            for (int var44 = 0; var44 < 64; var44++) {
                for (int var45 = 0; var45 < 64; var45++) {
                    if (arg5 != var23 || var11 > var44 || var11 + 8 < var44 || var12 > var45 || var45 > var12 + 8) {
                        class111.method737(0, 0, var19, arg1 - 230176582, 0, -1, arg2, 0, false, -1, 0, 0);
                    } else if ((var11 + 8) == var44 || (var12 + 8) == var45) {
                        int var52;
                        int var53;
                        if (arg4 == 0) {
                            var52 = var44 + arg7 - var11;
                            var53 = var45 + arg10 - var12;
                        } else if (arg4 == 1) {
                            var52 = var45 + arg7 - var12;
                            var53 = arg10 - (-var11 - 8) - var44;
                        } else if (arg4 == 2) {
                            var53 = var12 + arg10 + 8 - var45;
                            var52 = arg7 + var11 + 8 - var44;
                        } else {
                            var52 = arg7 + var12 + 8 - var45;
                            var53 = var44 + arg10 - var11;
                        }
                        class111.method737(0, var21 + var45, var19, 105, var18 + var44, var53, arg2, 0, true, var52, arg8, 0);
                    } else {
                        int var46 = arg7 + class238.method1669(arg4, arg1 - 230208945, var45 & 0x7, var44 & 0x7);
                        int var47 = class105.method700(var44 & 0x7, var45 & 0x7, arg4, true) + arg10;
                        class111.method737(arg4, var21 + var45, var19, 107, var18 + var44, var47, arg2, var22, false, var46, arg8, var20);
                        if (var44 == 63 || var45 == 63) {
                            int var48 = var44 == 63 ? 64 : var44;
                            int var49 = var45 == 63 ? 64 : var45;
                            int var50;
                            int var51;
                            if (arg4 == 0) {
                                var50 = var49 + arg10 - var12;
                                var51 = var48 + arg7 - var11;
                            } else if (arg4 == 1) {
                                var51 = var49 + arg7 - var12;
                                var50 = var11 + arg10 + 8 - var48;
                            } else if (arg4 == 2) {
                                var50 = arg10 + var12 + 8 - var49;
                                var51 = var11 + arg7 + 8 - var48;
                            } else {
                                var51 = arg7 + var12 + 8 - var49;
                                var50 = arg10 + var48 - var11;
                            }
                            if (var51 >= 0 && var51 < 104 && var50 >= 0 && var50 < 104) {
                                class8.field114[arg8][var51][var50] = class8.field114[arg8][var46 + var20][var22 + var47];
                            }
                        }
                    }
                }
            }
        }
        boolean var24 = false;
        if (arg1 != 230176643) {
            return null;
        }
        boolean var25 = false;
        while (var19.field2650.length > var19.field2676) {
            int var26 = var19.method1218(-42);
            if (var26 == 128) {
                var25 = true;
                class268.field4351[0] = var19.method1186((byte) -49);
                class268.field4351[1] = var19.method1193(arg1 - 230176644);
                class268.field4351[2] = var19.method1193(-1);
                class268.field4351[3] = var19.method1193(-1);
                class268.field4351[4] = var19.method1186((byte) -115);
            } else {
                if (var26 != 129) {
                    var19.field2676--;
                    break;
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    byte var28 = var19.method1215(arg1 ^ 0xDB83703);
                    if (var28 == 0) {
                        if (var27 <= arg5) {
                            int var29 = arg7;
                            if (arg7 < 0) {
                                var29 = 0;
                            } else if (arg7 >= 104) {
                                var29 = 104;
                            }
                            int var30 = arg7 + 7;
                            int var31 = arg10;
                            int var32 = arg10 + 7;
                            if (var30 < 0) {
                                var30 = 0;
                            } else if (var30 >= 104) {
                                var30 = 104;
                            }
                            if (var32 < 0) {
                                var32 = 0;
                            } else if (var32 >= 104) {
                                var32 = 104;
                            }
                            if (arg10 < 0) {
                                var31 = 0;
                            } else if (arg10 >= 104) {
                                var31 = 104;
                            }
                            while (var29 < var30) {
                                while (var31 < var32) {
                                    class15.field218[arg8][var29][var31] = 0;
                                    var31++;
                                }
                                var29++;
                            }
                        }
                    } else if (var28 == 1) {
                        for (int var33 = 0; var33 < 64; var33 += 4) {
                            for (int var34 = 0; var34 < 64; var34 += 4) {
                                byte var35 = var19.method1215(128);
                                if (var27 <= arg5) {
                                    for (int var36 = var33; var36 < var33 + 4; var36++) {
                                        for (int var37 = var34; var37 < (var34 + 4); var37++) {
                                            if (var36 >= var11 && var11 + 8 > var36 && var37 >= var12 && var12 < (var12 + 8)) {
                                                int var38 = class238.method1669(arg4, -32302, var37 & 0x7, var36 & 0x7) + arg7;
                                                int var39 = arg10 + class105.method700(var36 & 0x7, var37 & 0x7, arg4, true);
                                                if (var38 >= 0 && var38 < 104 && var39 >= 0 && var39 < 104) {
                                                    class15.field218[arg8][var38][var39] = var35;
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
        }
        if (!var24) {
            int var40 = arg7 + 7;
            int var41 = arg10 + 7;
            for (int var42 = arg7; var42 < var40; var42++) {
                for (int var43 = arg10; var43 < var41; var43++) {
                    class15.field218[arg8][var42][var43] = 0;
                }
            }
        }
        if (var25) {
            return class268.field4351;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2112 = false;
        this.field2103 = arg7;
        this.field2116 = arg10;
        this.field2115 = arg3;
        this.field2091 = arg9;
        this.field2073 = arg5;
        this.field2111 = arg4;
        this.field2100 = arg0;
        this.field2095 = arg1;
        this.field2108 = arg6;
        this.field2102 = arg8;
        this.field2076 = arg2;
        int var12 = class92.method629(this.field2100, 12288).field3338;
        if (var12 == -1) {
            this.field2084 = null;
        } else {
            this.field2084 = class174.method1241(-128, var12);
        }
    }
}
