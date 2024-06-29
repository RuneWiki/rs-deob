import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public abstract class class145 extends class343 {

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "Lfg;")
    public class85 field2224;

    @OriginalMember(owner = "client!eq", name = "C", descriptor = "I")
    public int field2238;

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "I")
    public int field2235;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field2214 = 0;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field2218 = 0;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field2217 = 0;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public static int field2220 = 0;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
    private static int field2227 = 0;

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "I")
    public static int field2240 = 0;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public static int field2213 = 0;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "I")
    private static int field2225 = 0;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    private static int field2215;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    private static int field2216;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    private static int field2221;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    public int field2226;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
    public int field2230;

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "I")
    private static int field2234;

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!eq", name = "B", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "I")
    public int field2239;

    @OriginalMember(owner = "client!eq", name = "F", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "[I")
    private int[] field2212;

    @OriginalMember(owner = "client!eq", name = "V", descriptor = "()I")
    public final int method367() {
        return this.field2235;
    }

    @OriginalMember(owner = "client!eq", name = "PA", descriptor = "(IIIIIII)V")
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2224.method633()) {
            throw new IllegalStateException();
        }
        if (this.field2212 == null) {
            this.field2212 = new int[4];
        }
        this.field2224.method246(this.field2212);
        this.field2224.method185(this.field2224.field1381, this.field2224.field1374, arg0 + arg2, arg1 + arg3);
        int var8 = this.method376();
        int var9 = this.method374();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method370(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field2224.method345(this.field2212[0], this.field2212[1], this.field2212[2], this.field2212[3]);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([I[III)V")
    public abstract void method913(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILi;II)V")
    public abstract void method368(int arg0, int arg1, class31 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "()I")
    public final int method376() {
        return this.field2238 + this.field2230 + this.field2226;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method1038(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field2238 + this.field2230 + this.field2226;
        int var8 = this.field2239 + this.field2235 + this.field2233;
        if (this.field2238 != var7 || this.field2235 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field2239 * var11;
            float var14 = (float) this.field2239 * var12;
            float var15 = (float) this.field2230 * var9;
            float var16 = (float) this.field2230 * var10;
            float var17 = (float) this.field2226 * -var9;
            float var18 = (float) this.field2226 * -var10;
            float var19 = (float) this.field2233 * -var11;
            float var20 = (float) this.field2233 * -var12;
            arg0 += var13 + var15;
            arg1 += var14 + var16;
            arg2 += var13 + var17;
            arg3 += var14 + var18;
            arg4 += var15 + var19;
            arg5 += var16 + var20;
        }
        float var21 = arg2 + arg4 - arg0;
        float var22 = arg5 + arg3 - arg1;
        float var23;
        float var24;
        if (arg0 < arg2) {
            var23 = arg0;
            var24 = arg2;
        } else {
            var23 = arg2;
            var24 = arg0;
        }
        if (arg4 < var23) {
            var23 = arg4;
        }
        if (var21 < var23) {
            var23 = var21;
        }
        if (arg4 > var24) {
            var24 = arg4;
        }
        if (var21 > var24) {
            var24 = var21;
        }
        float var25;
        float var26;
        if (arg1 < arg3) {
            var25 = arg1;
            var26 = arg3;
        } else {
            var25 = arg3;
            var26 = arg1;
        }
        if (arg5 < var25) {
            var25 = arg5;
        }
        if (var22 < var25) {
            var25 = var22;
        }
        if (arg5 > var26) {
            var26 = arg5;
        }
        if (var22 > var26) {
            var26 = var22;
        }
        if (var23 < (float) this.field2224.field1381) {
            var23 = this.field2224.field1381;
        }
        if (var24 > (float) this.field2224.field1377) {
            var24 = this.field2224.field1377;
        }
        if (var25 < (float) this.field2224.field1374) {
            var25 = this.field2224.field1374;
        }
        if (var26 > (float) this.field2224.field1384) {
            var26 = this.field2224.field1384;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field2241 = this.field2224.field1370;
        field2237 = (int) ((float) ((int) var25 * field2241) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field2223 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field2238 / var29);
        field2228 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field2235 / var30);
        field2232 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field2238 / var30);
        field2210 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field2235 / var29);
        field2216 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field2234 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field2219 = (this.field2238 >> 1 << 12) + (field2234 * field2232 >> 4);
        field2242 = (this.field2235 >> 1 << 12) + (field2234 * field2210 >> 4);
        field2231 = field2223 * field2216 >> 4;
        field2211 = field2228 * field2216 >> 4;
        field2221 = (int) var23;
        field2236 = (int) var27;
        field2215 = (int) var25;
        field2229 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!eq", name = "XA", descriptor = "(IIIIIII)V")
    public abstract void method372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(II)V")
    public abstract void method914(int arg0, int arg1);

    @OriginalMember(owner = "client!eq", name = "ga", descriptor = "()I")
    public final int method374() {
        return this.field2239 + this.field2235 + this.field2233;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(FFFFFFLi;II)V")
    public final void method379(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class31 arg6, int arg7, int arg8) {
        if (this.field2224.method633()) {
            throw new IllegalStateException();
        } else if (this.method1038(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class472 var10 = (class472) arg6;
            this.method913(var10.field6866, var10.field6865, field2221 - arg7, -arg8 - (field2229 - field2215));
        }
    }

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "(IIIII)V")
    public abstract void method370(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!eq", name = "ta", descriptor = "(FFFFFFIII)V")
    public final void method377(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field2224.method633()) {
            throw new IllegalStateException();
        } else if (this.method1038(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field2222 = arg7;
            if (arg6 != 1) {
                field2240 = arg7 >>> 24;
                field2220 = 256 - field2240;
                if (arg6 == 0) {
                    field2217 = (arg7 & 0xFF0000) >> 16;
                    field2214 = (arg7 & 0xFF00) >> 8;
                    field2213 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field2225 = arg7 >>> 24;
                    field2227 = 256 - field2225;
                    int var10 = (arg7 & 0xFF00FF) * field2227 & 0xFF00FF00;
                    int var11 = (arg7 & 0xFF00) * field2227 & 0xFF0000;
                    field2218 = (var10 | var11) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method914(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method914(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method914(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method914(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method914(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method914(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method914(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method914(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method914(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method914(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method914(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method914(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "(IIII)V")
    public final void method375(int arg0, int arg1, int arg2, int arg3) {
        this.field2230 = arg0;
        this.field2239 = arg1;
        this.field2226 = arg2;
        this.field2233 = arg3;
    }

    @OriginalMember(owner = "client!eq", name = "TA", descriptor = "()I")
    public final int method378() {
        return this.field2238;
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lfg;II)V")
    public class145(class85 arg0, int arg1, int arg2) {
        this.field2224 = arg0;
        this.field2238 = arg1;
        this.field2235 = arg2;
    }
}
