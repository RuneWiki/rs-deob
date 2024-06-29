import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class174 extends class424 {

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Lkb;")
    public class633 field2181;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public int field2178;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2168 = 0;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field2167 = 0;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    private static int field2166 = 0;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field2182 = 0;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field2188 = 0;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    private static int field2175 = 0;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field2190 = 0;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field2187 = 0;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    private static int field2165;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    private static int field2176;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    private static int field2179;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public int field2183;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public int field2189;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    private static int field2193;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "[I")
    private int[] field2177;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFFFFF)Z", line = 11)
    private final boolean method1153(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field2189 + this.field2178 + this.field2183;
        int var8 = this.field2194 + this.field2172 + this.field2191;
        if (this.field2178 != var7 || this.field2172 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field2194 * var11;
            float var14 = (float) this.field2194 * var12;
            float var15 = (float) this.field2189 * var9;
            float var16 = (float) this.field2189 * var10;
            float var17 = (float) this.field2183 * -var9;
            float var18 = (float) this.field2183 * -var10;
            float var19 = (float) this.field2191 * -var11;
            float var20 = (float) this.field2191 * -var12;
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
        if (var23 < (float) this.field2181.field8620) {
            var23 = this.field2181.field8620;
        }
        if (var24 > (float) this.field2181.field8596) {
            var24 = this.field2181.field8596;
        }
        if (var25 < (float) this.field2181.field8612) {
            var25 = this.field2181.field8612;
        }
        if (var26 > (float) this.field2181.field8624) {
            var26 = this.field2181.field8624;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field2184 = this.field2181.field8633;
        field2180 = (int) ((float) ((int) var25 * field2184) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field2169 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field2178 / var29);
        field2163 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field2172 / var30);
        field2186 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field2178 / var30);
        field2174 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field2172 / var29);
        field2193 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field2165 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field2170 = (this.field2178 >> 1 << 12) + (field2186 * field2165 >> 4);
        field2171 = (this.field2172 >> 1 << 12) + (field2174 * field2165 >> 4);
        field2195 = field2193 * field2169 >> 4;
        field2173 = field2193 * field2163 >> 4;
        field2179 = (int) var23;
        field2185 = (int) var27;
        field2176 = (int) var25;
        field2192 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()I", line = 151)
    public final int method1154() {
        return this.field2172;
    }

    @OriginalMember(owner = "client!ac", name = "EA", descriptor = "(IIII)V", line = 156)
    public final void method1155(int arg0, int arg1, int arg2, int arg3) {
        this.field2189 = arg0;
        this.field2194 = arg1;
        this.field2183 = arg2;
        this.field2191 = arg3;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFFFFFLfa;II)V", line = 162)
    public final void method1156(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class185 arg6, int arg7, int arg8) {
        if (this.field2181.method3450()) {
            throw new IllegalStateException();
        } else if (this.method1153(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class330 var10 = (class330) arg6;
            this.method64(var10.field4837, var10.field4833, field2179 - arg7, -arg8 - (field2192 - field2176));
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()I", line = 183)
    public final int method1157() {
        return this.field2194 + this.field2172 + this.field2191;
    }

    @OriginalMember(owner = "client!ac", name = "sa", descriptor = "(FFFFFFIII)V", line = 190)
    public final void method1158(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field2181.method3450()) {
            throw new IllegalStateException();
        } else if (this.method1153(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field2164 = arg7;
            if (arg6 != 1) {
                field2168 = arg7 >>> 24;
                field2188 = 256 - field2168;
                if (arg6 == 0) {
                    field2182 = (arg7 & 0xFF0000) >> 16;
                    field2167 = (arg7 & 0xFF00) >> 8;
                    field2190 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field2166 = arg7 >>> 24;
                    field2175 = 256 - field2166;
                    int var10 = (arg7 & 0xFF00FF) * field2175 & 0xFF00FF00;
                    int var11 = (arg7 & 0xFF00) * field2175 & 0xFF0000;
                    field2187 = (var10 | var11) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method69(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method69(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method69(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method69(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method69(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method69(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method69(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method69(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method69(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method69(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method69(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method69(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "QA", descriptor = "()I", line = 287)
    public final int method1159() {
        return this.field2178;
    }

    @OriginalMember(owner = "client!ac", name = "AA", descriptor = "()I", line = 294)
    public final int method1160() {
        return this.field2189 + this.field2178 + this.field2183;
    }

    @OriginalMember(owner = "client!ac", name = "ba", descriptor = "(IIIIIII)V", line = 329)
    public final void method1161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2181.method3450()) {
            throw new IllegalStateException();
        }
        if (this.field2177 == null) {
            this.field2177 = new int[4];
        }
        this.field2181.method1910(this.field2177);
        this.field2181.method1970(this.field2181.field8620, this.field2181.field8612, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1160();
        int var9 = this.method1157();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method67(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field2181.method1908(this.field2177[0], this.field2177[1], this.field2177[2], this.field2177[3]);
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lkb;II)V", line = 368)
    public class174(class633 arg0, int arg1, int arg2) {
        this.field2181 = arg0;
        this.field2178 = arg1;
        this.field2172 = arg2;
    }

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "(IIIII)V")
    public abstract void method67(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILfa;II)V")
    public abstract void method63(int arg0, int arg1, class185 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ac", name = "KA", descriptor = "(IIIIIII)V")
    public abstract void method65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V")
    public abstract void method69(int arg0, int arg1);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([I[III)V")
    public abstract void method64(int[] arg0, int[] arg1, int arg2, int arg3);
}
