import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class144 extends class228 {

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "Z")
    private boolean field2167 = false;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    private int field2172 = 0;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    private int field2174 = -32768;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    private int field2180 = 0;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    private int field2168 = -1;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
    public int field2187;

    @OriginalMember(owner = "client!sf", name = "lb", descriptor = "I")
    private int field2196;

    @OriginalMember(owner = "client!sf", name = "pb", descriptor = "I")
    private int field2200;

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "I")
    public int field2190;

    @OriginalMember(owner = "client!sf", name = "nb", descriptor = "I")
    public int field2198;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
    public int field2176;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
    private int field2165;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "Lqi;")
    private class209 field2166;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "[I")
    public static int[] field2169 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "D")
    private double field2171;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "D")
    private double field2175;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "D")
    private double field2178;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "D")
    private double field2181;

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "D")
    private double field2186;

    @OriginalMember(owner = "client!sf", name = "kb", descriptor = "D")
    private double field2195;

    @OriginalMember(owner = "client!sf", name = "ob", descriptor = "D")
    private double field2199;

    @OriginalMember(owner = "client!sf", name = "sb", descriptor = "D")
    private double field2203;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
    private int field2179;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
    private int field2191;

    @OriginalMember(owner = "client!sf", name = "hb", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!sf", name = "ib", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!sf", name = "jb", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!sf", name = "mb", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!sf", name = "qb", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!sf", name = "rb", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "Lha;")
    private class48 field2189;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "[[[I")
    public static int[][][] field2184;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V", line = 7)
    public final void method1108(byte arg0) {
        int var2 = -55 / ((arg0 - 40) / 39);
        super.field3161 = super.field3178 = (short) ((int) (this.field2199 / 128.0D));
        super.field3172 = super.field3162 = (short) ((int) (this.field2195 / 128.0D));
        ++field2192;
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)I", line = 19)
    public final int method579(int arg0) {
        ++field2164;
        if (arg0 != 0) {
            this.method581(-92, (class391) null);
        }
        return this.field2174;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lsj;ILpe;)V", line = 31)
    private final void method1109(class73 arg0, int arg1, class391 arg2) {
        ++field2177;
        if (arg1 != 10) {
            this.field2165 = 123;
        }
        class227[] var4 = arg0.method447();
        class276[] var5 = arg0.method472();
        if ((this.field2189 == null || this.field2189.field816) && (var4 != null || var5 != null)) {
            this.field2189 = new class48(class414.field5793);
        }
        if (this.field2189 != null) {
            this.field2189.method482(arg2, (long) class414.field5793, var4, var5, false);
            this.field2189.method493(super.field3170, super.field3172, super.field3162, super.field3161, super.field3178);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILpe;)V", line = 59)
    public final void method581(int arg0, class391 arg1) {
        ++field2201;
        class73 var3 = this.method1114(arg0, -1868876313, arg1);
        if (var3 != null) {
            class156 var4 = arg1.method226();
            var4.method318(this.field2179);
            var4.method320(this.field2191);
            var4.method319((int) this.field2195, (int) this.field2186, (int) this.field2199);
            this.field2174 = var3.method420();
            this.method1109(var3, arg0 ^ 10, arg1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 238)
    public class144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field2187 = arg5;
        this.field2196 = arg8;
        this.field2200 = arg0;
        this.field2167 = false;
        this.field2190 = arg6;
        this.field2198 = arg9;
        this.field2176 = arg10;
        this.field2165 = arg7;
        int var12 = class71.method613(this.field2200, (byte) -119).field3765;
        if (~var12 == 0) {
            this.field2166 = null;
        } else {
            this.field2166 = class288.method1819(var12, (byte) 105);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 86)
    public static void method1110(int arg0) {
        if (arg0 != 9) {
            method1110(-63);
        }
        field2169 = null;
        field2184 = null;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V", line = 99)
    public final void method535(byte arg0) {
        ++field2170;
        if (arg0 > 110) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)Z", line = 114)
    public final boolean method537(int arg0) {
        if (arg0 > -48) {
            this.method1108((byte) 47);
        }
        ++field2197;
        return false;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZILhh;Lpe;III)V", line = 128)
    public final void method532(boolean arg0, int arg1, class184 arg2, class391 arg3, int arg4, int arg5, int arg6) {
        int var8 = 2 % ((76 - arg1) / 38);
        ++field2202;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lpe;B)Lca;", line = 140)
    public final class415 method572(class391 arg0, byte arg1) {
        ++field2194;
        class73 var3 = this.method1114(1024, -1868876313, arg0);
        if (arg1 > -45) {
            this.method1113(false);
        }
        if (var3 == null) {
            return null;
        } else {
            class156 var4 = arg0.method226();
            var4.method318(this.field2179);
            var4.method320(this.field2191);
            var4.method319((int) this.field2195, (int) this.field2186, (int) this.field2199);
            if (this.field2189 != null) {
                class374 var5 = this.field2189.method489();
                arg0.method166(var3, var5, var4, (class197) null, 0);
            } else {
                var3.method478(var4, (class197) null, 0);
            }
            this.field2174 = var3.method420();
            this.method1109(var3, 10, arg0);
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)V", line = 172)
    public final void method1111(int arg0, byte arg1) {
        this.field2195 += (double) arg0 * this.field2171;
        if (~this.field2165 == 0) {
            this.field2186 += (double) arg0 * this.field2181;
        } else {
            this.field2186 += this.field2175 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field2181;
            this.field2181 += (double) arg0 * this.field2175;
        }
        this.field2167 = true;
        ++field2185;
        this.field2199 += (double) arg0 * this.field2203;
        this.field2191 = (int) (Math.atan2(this.field2171, this.field2203) * 2607.5945876176133D) - -8192 & 16383;
        this.field2179 = (int) (2607.5945876176133D * Math.atan2(this.field2181, this.field2178)) & 16383;
        if (this.field2166 != null) {
            this.field2172 += arg0;
            label41: while (true) {
                do {
                    do {
                        if (~this.field2166.field2894[this.field2180] <= ~this.field2172) {
                            break label41;
                        }
                        this.field2172 -= this.field2166.field2894[this.field2180];
                        ++this.field2180;
                        if (this.field2166.field2915.length <= this.field2180) {
                            this.field2180 -= this.field2166.field2896;
                            if (~this.field2180 > -1 || this.field2166.field2915.length <= this.field2180) {
                                this.field2180 = 0;
                            }
                        }
                        this.field2168 = this.field2180 + 1;
                    } while (~this.field2166.field2915.length < ~this.field2168);
                    this.field2168 -= this.field2166.field2896;
                } while (this.field2168 >= 0 && this.field2166.field2915.length > this.field2168);
                this.field2168 = -1;
            }
        }
        int var3 = 48 % ((arg1 - 7) / 52);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)V", line = 264)
    public final void method1112(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field2167) {
            double var6 = (double) (-super.field3176 + arg4);
            double var8 = (double) (-super.field3167 + arg2);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2199 = (double) this.field2196 * var8 / var10 + (double) super.field3167;
            this.field2186 = (double) super.field3168;
            this.field2195 = (double) this.field2196 * var6 / var10 + (double) super.field3176;
        }
        ++field2188;
        double var12 = (double) (-arg1 + this.field2190 - -1);
        this.field2203 = ((double) arg2 + -this.field2199) / var12;
        this.field2171 = ((double) arg4 - this.field2195) / var12;
        this.field2178 = Math.sqrt(this.field2203 * this.field2203 + this.field2171 * this.field2171);
        if (this.field2165 != arg3) {
            if (!this.field2167) {
                this.field2181 = -this.field2178 * Math.tan((double) this.field2165 * 0.02454369D);
            }
            this.field2175 = ((double) arg0 + -this.field2186 + -(this.field2181 * var12)) * 2.0D / (var12 * var12);
        } else {
            this.field2181 = ((double) arg0 + -this.field2186) / var12;
        }
    }

    @OriginalMember(owner = "client!sf", name = "finalize", descriptor = "()V", line = 302)
    protected final void finalize() {
        ++field2182;
        if (this.field2189 != null) {
            this.field2189.method486();
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V", line = 316)
    public final void method1113(boolean arg0) {
        if (!arg0) {
            this.method535((byte) 87);
        }
        ++field2173;
        if (this.field2189 != null) {
            this.field2189.method486();
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILpe;I)Z", line = 330)
    public final boolean method583(int arg0, int arg1, class391 arg2, int arg3) {
        if (arg3 != 65536) {
            this.field2174 = -25;
        }
        ++field2193;
        return false;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILpe;)Lsj;", line = 349)
    private final class73 method1114(int arg0, int arg1, class391 arg2) {
        ++field2183;
        class282 var4 = class71.method613(this.field2200, (byte) -128);
        if (arg1 != -1868876313) {
            this.field2171 = 0.5448717186278186D;
        }
        return var4.method1780(true, this.field2180, this.field2168, arg2, this.field2172, arg0);
    }
}
