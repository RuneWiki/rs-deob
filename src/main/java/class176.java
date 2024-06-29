import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class176 extends class238 {

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "Z")
    private boolean field2096 = false;

    @OriginalMember(owner = "client!ru", name = "x", descriptor = "Z")
    public boolean field2108 = false;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "I")
    private int field2098 = 0;

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "J")
    private long field2110;

    @OriginalMember(owner = "client!ru", name = "H", descriptor = "Ldg;")
    public class375 field2118;

    @OriginalMember(owner = "client!ru", name = "L", descriptor = "Lhm;")
    public class202 field2122;

    @OriginalMember(owner = "client!ru", name = "O", descriptor = "Lsf;")
    public class478 field2125;

    @OriginalMember(owner = "client!ru", name = "v", descriptor = "Lqo;")
    public class21 field2106;

    @OriginalMember(owner = "client!ru", name = "N", descriptor = "I")
    public static int field2124 = -1;

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "Lgl;")
    public static class547 field2099 = new class547(6, 7);

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
    private int field2090;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "I")
    private int field2091;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    private int field2092;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
    private int field2093;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
    public int field2094;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
    public int field2097;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
    private int field2100;

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "I")
    private int field2101;

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
    private int field2102;

    @OriginalMember(owner = "client!ru", name = "s", descriptor = "I")
    private int field2103;

    @OriginalMember(owner = "client!ru", name = "t", descriptor = "I")
    private int field2104;

    @OriginalMember(owner = "client!ru", name = "u", descriptor = "I")
    private int field2105;

    @OriginalMember(owner = "client!ru", name = "w", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!ru", name = "y", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!ru", name = "A", descriptor = "I")
    private int field2111;

    @OriginalMember(owner = "client!ru", name = "B", descriptor = "I")
    public int field2112;

    @OriginalMember(owner = "client!ru", name = "C", descriptor = "I")
    private int field2113;

    @OriginalMember(owner = "client!ru", name = "D", descriptor = "I")
    private int field2114;

    @OriginalMember(owner = "client!ru", name = "E", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!ru", name = "F", descriptor = "I")
    private int field2116;

    @OriginalMember(owner = "client!ru", name = "G", descriptor = "I")
    private int field2117;

    @OriginalMember(owner = "client!ru", name = "I", descriptor = "I")
    private int field2119;

    @OriginalMember(owner = "client!ru", name = "J", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!ru", name = "K", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!ru", name = "M", descriptor = "I")
    public int field2123;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)Z")
    public static final boolean method1025(int arg0) {
        field2121++;
        if (class527.method2998("jaclib", (byte) 14)) {
            if (arg0 >= -48) {
                method1031(true);
            }
            return class527.method2998("hw3d", (byte) 14);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIB)Ljava/lang/String;")
    public static final String method1026(int arg0, int arg1, byte arg2) {
        field2109++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else {
            int var4 = -86 / ((arg2 - 58) / 53);
            if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(III[BLjava/lang/String;I)I")
    public static final int method1027(int arg0, int arg1, int arg2, byte[] arg3, String arg4, int arg5) {
        if (arg1 > -40) {
            field2099 = null;
        }
        field2115++;
        int var6 = arg0 - arg2;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg3[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg3[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg3[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg3[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg3[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg3[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg3[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg3[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg3[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg3[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg3[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg3[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg3[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg3[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg3[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg3[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg3[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg3[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg3[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg3[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg3[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg3[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg3[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg3[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg3[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg3[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg3[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg3[arg5 + var7] = -97;
            } else {
                arg3[arg5 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)V")
    public final void method1028(int arg0) {
        this.field2103 = this.field2118.field4885;
        this.field2090 = this.field2118.field4870;
        this.field2119 = this.field2118.field4864;
        if (arg0 != -383) {
            this.field2114 = -1;
        }
        this.field2111 = this.field2118.field4879;
        this.field2105 = this.field2118.field4867;
        this.field2102 = this.field2118.field4868;
        this.field2091 = this.field2118.field4875;
        this.field2093 = this.field2118.field4869;
        field2107++;
        this.field2092 = this.field2118.field4881;
        if (this.field2093 == this.field2090 && this.field2111 == this.field2093 && this.field2102 == this.field2091 && this.field2092 == this.field2091 && this.field2119 == this.field2103 && this.field2105 == this.field2103) {
            this.field2096 = true;
            return;
        }
        this.field2096 = false;
        int var2 = (this.field2090 + this.field2111 + this.field2093) / 3;
        int var3 = (this.field2102 + this.field2092 + this.field2091) / 3;
        int var4 = (this.field2119 + this.field2105 + this.field2103) / 3;
        if (this.field2097 == var2 && this.field2112 == var3 && this.field2094 == var4) {
            return;
        }
        this.field2094 = var4;
        this.field2112 = var3;
        this.field2097 = var2;
        int var5 = this.field2093 - this.field2090;
        int var6 = this.field2091 - this.field2102;
        int var7 = this.field2103 - this.field2119;
        int var8 = this.field2111 - this.field2090;
        int var9 = this.field2092 - this.field2102;
        int var10 = this.field2105 - this.field2119;
        this.field2101 = var6 * var10 - var7 * var9;
        this.field2100 = var5 * var9 - var6 * var8;
        this.field2114 = var7 * var8 - (var5 * var10);
        while (this.field2101 > 32767 || this.field2114 > 32767 || this.field2100 > 32767 || this.field2101 < -32767 || this.field2114 < -32767 || this.field2100 < -32767) {
            this.field2114 >>= 0x1;
            this.field2101 >>= 0x1;
            this.field2100 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field2101 * this.field2101 + (this.field2114 * this.field2114) + (this.field2100 * this.field2100)));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field2101 = this.field2101 * 32767 / var11;
        this.field2114 = this.field2114 * 32767 / var11;
        this.field2100 = this.field2100 * 32767 / var11;
        if (this.field2125.field6995 <= 0 && this.field2125.field7019 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field2100, (double) this.field2101) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field2114, Math.sqrt((double) (this.field2101 * this.field2101 + this.field2100 * this.field2100))) * 2607.5945876176133D);
        this.field2113 = this.field2125.field6995 - this.field2125.field7006;
        this.field2104 = this.field2125.field7006 + var12 - (this.field2113 >> 1);
        this.field2117 = this.field2125.field7019 - this.field2125.field6998;
        this.field2116 = var13 + this.field2125.field6998 - (this.field2117 >> 1);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IBLoa;JZ)V")
    public final void method1029(int arg0, byte arg1, class635 arg2, long arg3, boolean arg4) {
        if (arg1 != -125) {
            this.method1030(null, -118L, (byte) 37);
        }
        field2095++;
        if (this.field2108) {
            arg4 = false;
        } else if (class533.field7631 < this.field2125.field6985) {
            arg4 = false;
        } else if (class220.field2667[class533.field7631] < class190.field2300) {
            arg4 = false;
        } else if (this.field2096) {
            arg4 = false;
        } else if (this.field2125.field6983 != -1) {
            int var7 = (int) (arg3 - this.field2110);
            if (this.field2125.field7014 || this.field2125.field6983 >= var7) {
                var7 %= this.field2125.field6983;
            } else {
                arg4 = false;
            }
            if (!this.field2125.field7007 && this.field2125.field6980 > var7) {
                arg4 = false;
            }
            if (this.field2125.field7007 && this.field2125.field6980 <= var7) {
                arg4 = false;
            }
        }
        if (arg4) {
            this.field2098 += (int) (((double) this.field2125.field7020 + Math.random() * (double) (this.field2125.field6999 - this.field2125.field7020)) * (double) arg0);
            if (this.field2098 > 63) {
                int var8 = this.field2098 >> 6;
                this.field2098 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field2125.field6995 <= 0 && this.field2125.field7019 <= 0) {
                        var10 = this.field2114;
                        var11 = this.field2101;
                        var12 = this.field2100;
                    } else {
                        int var13 = this.field2104 + ((int) ((double) this.field2113 * Math.random()));
                        int var14 = var13 & 0x3FFF;
                        int var15 = class285.field3655[var14];
                        int var16 = class285.field3656[var14];
                        int var17 = this.field2116 + ((int) (Math.random() * (double) this.field2117));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class285.field3655[var18];
                        int var20 = class285.field3656[var18];
                        byte var21 = 13;
                        var11 = var16 * var19 >> var21;
                        var10 = (var20 << 1) * -1;
                        var12 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if (var22 + var23 > 65535) {
                        var23 = 65535 - var23;
                        var22 = 65535 - var22;
                    }
                    int var24 = 65535 - var22 - var23;
                    int var25 = (int) ((long) this.field2090 * (long) var22 + ((long) this.field2093 * (long) var23) + ((long) this.field2111 * (long) var24) >> 16);
                    int var26 = (int) ((long) this.field2091 * (long) var23 + ((long) this.field2102 * (long) var22 + ((long) this.field2092 * (long) var24)) >> 16);
                    int var27 = (int) ((long) this.field2103 * (long) var23 + (long) this.field2119 * (long) var22 + (long) this.field2105 * (long) var24 >> 16);
                    int var28 = (int) (Math.random() * (double) (this.field2125.field6976 - this.field2125.field6986)) + this.field2125.field6986;
                    int var29 = (int) (Math.random() * (double) (this.field2125.field6959 - this.field2125.field6984)) + this.field2125.field6984;
                    int var30 = this.field2125.field6975 + ((int) ((double) (this.field2125.field6987 - this.field2125.field6975) * Math.random()));
                    int var33;
                    if (this.field2125.field6997) {
                        double var31 = Math.random();
                        var33 = (int) ((double) this.field2125.field6991 * Math.random() + (double) this.field2125.field6969) << 24 | (int) ((double) this.field2125.field7028 * var31 + (double) this.field2125.field6957) | (int) ((double) this.field2125.field6962 * var31 + (double) this.field2125.field6996) << 16 | (int) ((double) this.field2125.field6966 * var31 + (double) this.field2125.field6979) << 8;
                    } else {
                        var33 = (int) ((double) this.field2125.field6957 + (double) this.field2125.field7028 * Math.random()) | (int) ((double) this.field2125.field6996 + Math.random() * (double) this.field2125.field6962) << 16 | (int) ((double) this.field2125.field6979 + (double) this.field2125.field6966 * Math.random()) << 8 | (int) (Math.random() * (double) this.field2125.field6991 + (double) this.field2125.field6969) << 24;
                    }
                    int var34 = this.field2125.field6992;
                    if (!arg2.method360() && !this.field2125.field6963) {
                        var34 = -1;
                    }
                    if (class73.field765 == class576.field8237) {
                        new class391(this, var25, var26, var27, var11, var10, var12, var28, var29, var33, var30, var34, this.field2125.field6974, this.field2125.field6960);
                    } else {
                        class391 var36 = class554.field7899[class576.field8237];
                        class576.field8237 = class576.field8237 + 1 & 0x3FF;
                        var36.method2138(this, var25, var26, var27, var11, var10, var12, var28, var29, var33, var30, var34, this.field2125.field6974, this.field2125.field6960);
                    }
                }
            }
        }
        this.field2123 = 0;
        for (class391 var37 = (class391) this.field2106.method93((byte) 96); var37 != null; var37 = (class391) this.field2106.method92(0)) {
            var37.method2135(arg3, arg0);
            this.field2123++;
        }
        class43.field452 += this.field2123;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Loa;JB)V")
    public final void method1030(class635 arg0, long arg1, byte arg2) {
        field2120++;
        if (arg2 <= 10) {
            this.field2103 = 3;
        }
        for (class391 var5 = (class391) this.field2106.method93((byte) 121); var5 != null; var5 = (class391) this.field2106.method92(0)) {
            var5.method2136(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)V")
    public static void method1031(boolean arg0) {
        if (arg0) {
            method1027(-79, -128, -62, null, null, 121);
        }
        field2099 = null;
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Loa;Ldg;Lhm;J)V")
    public class176(class635 arg0, class375 arg1, class202 arg2, long arg3) {
        this.field2110 = arg3;
        this.field2118 = arg1;
        this.field2122 = arg2;
        this.field2125 = this.field2118.method2063(5439488);
        if (!arg0.method360() && this.field2125.field7011 != -1) {
            this.field2125 = class463.method2639(this.field2125.field7011, false);
        }
        this.field2106 = new class21();
        this.field2098 = (int) ((double) this.field2098 + Math.random() * 64.0D);
        this.method1028(-383);
    }
}
