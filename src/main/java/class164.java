import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class164 extends class175 {

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    private int field2182 = 0;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    private int field2186 = 0;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    private int field2191 = 0;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "Ljb;")
    public static class519 field2187 = new class519(75, 1);

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "S")
    public static short field2189 = 32767;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "Lag;")
    public static class710 field2195 = new class710();

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "Ljb;")
    public static class519 field2196 = new class519(33, 16);

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "Ljb;")
    public static class519 field2197 = new class519(38, -2);

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    private int field2180;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    private int field2181;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    private int field2185;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    private int field2188;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
    private int field2193;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "I")
    private int field2194;

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 7)
    public class164() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILdt;Z)V", line = 17)
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        ++field2184;
        if (arg2) {
            field2195 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field2191 = (arg1.method1737(!arg2) << 12) / 100;
                }
            } else {
                this.field2186 = (arg1.method1737(!arg2) << 12) / 100;
            }
        } else {
            this.field2182 = arg1.method1695(423951304);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 68)
    public static final void method1132(boolean arg0, int arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        ++field2183;
        short[] var4 = new short[arg1];
        int var5 = 0;
        int var6 = !arg0 ? 0 : 32768;
        int var7 = (arg0 ? class749.field10088.field8241 : class749.field10088.field8237) + var6;
        for (int var8 = var6; ~var7 < ~var8; ++var8) {
            class667 var11 = class749.field10088.method3391(var8, arg1 ^ 83);
            if (var11.field8935 && var11.method3679(-1).toLowerCase().indexOf(var3) != -1) {
                if (~var5 <= -51) {
                    class236.field3145 = -1;
                    class235.field3136 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var5 > var13; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class235.field3136 = var4;
        class585.field7967 = 0;
        class236.field3145 = var5;
        String[] var9 = new String[class236.field3145];
        for (int var10 = 0; ~class236.field3145 < ~var10; ++var10) {
            var9[var10] = class749.field10088.method3391(var4[var10], 6).method3679(-1);
        }
        class573.method3257(class235.field3136, var9, arg1 + -1);
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)I", line = 141)
    public static final int method1133(int arg0) {
        if (arg0 != -15388) {
            return 37;
        } else {
            ++field2190;
            if (class393.field5661 != null) {
                return 3;
            } else {
                return class360.field5237 ? 2 : 1;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)[[I", line = 156)
    public final int[][] method238(int arg0, byte arg1) {
        if (arg1 >= -47) {
            field2196 = null;
        }
        ++field2192;
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (super.field2316.field8746) {
            int[][] var4 = this.method1205(0, arg0, 29179);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class598.field8136; ++var11) {
                this.method1134(var5[var11], var7[var11], 87, var6[var11]);
                this.field2185 += this.field2182;
                this.field2194 += this.field2191;
                this.field2193 += this.field2186;
                while (this.field2185 < 0) {
                    this.field2185 += 4096;
                }
                while (~this.field2185 < -4097) {
                    this.field2185 -= 4096;
                }
                if (~this.field2193 > -1) {
                    this.field2193 = 0;
                }
                if (~this.field2193 < -4097) {
                    this.field2193 = 4096;
                }
                if (~this.field2194 > -1) {
                    this.field2194 = 0;
                }
                if (~this.field2194 < -4097) {
                    this.field2194 = 4096;
                }
                this.method1136(this.field2194, this.field2185, -6, this.field2193);
                var8[var11] = this.field2188;
                var9[var11] = this.field2181;
                var10[var11] = this.field2180;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V", line = 231)
    private final void method1134(int arg0, int arg1, int arg2, int arg3) {
        ++field2178;
        if (arg2 < 78) {
            this.field2182 = 90;
        }
        int var5 = arg3 >= arg0 ? arg3 : arg0;
        int var6 = ~arg0 > ~arg3 ? arg0 : arg3;
        int var7 = ~var5 > ~arg1 ? arg1 : var5;
        int var8 = ~arg1 <= ~var6 ? var6 : arg1;
        int var9 = var7 - var8;
        this.field2194 = (var7 + var8) / 2;
        if (this.field2194 > 0 && this.field2194 < 4096) {
            this.field2193 = (var9 << 12) / (this.field2194 > 2048 ? -(this.field2194 * 2) + 8192 : this.field2194 * 2);
        } else {
            this.field2193 = 0;
        }
        if (var9 <= 0) {
            this.field2185 = 0;
        } else {
            int var10 = (-arg0 + var7 << 12) / var9;
            int var11 = (var7 - arg3 << 12) / var9;
            int var12 = (var7 - arg1 << 12) / var9;
            if (arg0 != var7) {
                if (arg3 != var7) {
                    this.field2185 = arg0 != var8 ? 20480 - var10 : var11 + 12288;
                } else {
                    this.field2185 = ~arg1 != ~var8 ? -var12 + 12288 : var10 + 4096;
                }
            } else {
                this.field2185 = arg3 != var8 ? -var11 + 4096 : var12 + 20480;
            }
            this.field2185 /= 6;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V", line = 285)
    public static void method1135(byte arg0) {
        field2187 = null;
        field2196 = null;
        field2195 = null;
        if (arg0 != -17) {
            field2197 = null;
        }
        field2197 = null;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(IIII)V", line = 298)
    private final void method1136(int arg0, int arg1, int arg2, int arg3) {
        ++field2179;
        if (arg2 != -6) {
            this.method44(-38, (class254) null, true);
        }
        int var5 = ~arg0 < -2049 ? arg0 + arg3 + -(arg0 * arg3 >> 12) : (arg3 + 4096) * arg0 >> 12;
        if (~var5 >= -1) {
            this.field2188 = this.field2181 = this.field2180 = arg0;
        } else {
            int var6 = arg1 * 6;
            int var7 = arg0 - (-arg0 + var5);
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (var9 != 3) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field2188 = var5;
                                    this.field2180 = var15;
                                    this.field2181 = var7;
                                }
                            } else {
                                this.field2181 = var7;
                                this.field2188 = var14;
                                this.field2180 = var5;
                            }
                        } else {
                            this.field2188 = var7;
                            this.field2180 = var5;
                            this.field2181 = var15;
                        }
                    } else {
                        this.field2180 = var14;
                        this.field2181 = var5;
                        this.field2188 = var7;
                    }
                } else {
                    this.field2181 = var5;
                    this.field2180 = var7;
                    this.field2188 = var15;
                }
            } else {
                this.field2181 = var14;
                this.field2180 = var7;
                this.field2188 = var5;
            }
        }
    }
}
