import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public abstract class class105 extends class318 {

    @OriginalMember(owner = "client!aja", name = "t", descriptor = "Lnia;")
    public class30 field1225;

    @OriginalMember(owner = "client!aja", name = "z", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!aja", name = "c", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!aja", name = "f", descriptor = "I")
    public static int field1211 = 0;

    @OriginalMember(owner = "client!aja", name = "x", descriptor = "I")
    private static int field1229 = 0;

    @OriginalMember(owner = "client!aja", name = "B", descriptor = "I")
    public static int field1233 = 0;

    @OriginalMember(owner = "client!aja", name = "p", descriptor = "I")
    public static int field1221 = 0;

    @OriginalMember(owner = "client!aja", name = "u", descriptor = "I")
    private static int field1226 = 0;

    @OriginalMember(owner = "client!aja", name = "v", descriptor = "I")
    public static int field1227 = 0;

    @OriginalMember(owner = "client!aja", name = "d", descriptor = "I")
    public static int field1209 = 0;

    @OriginalMember(owner = "client!aja", name = "F", descriptor = "I")
    public static int field1237 = 0;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!aja", name = "e", descriptor = "I")
    private static int field1210;

    @OriginalMember(owner = "client!aja", name = "g", descriptor = "I")
    private static int field1212;

    @OriginalMember(owner = "client!aja", name = "h", descriptor = "I")
    public int field1213;

    @OriginalMember(owner = "client!aja", name = "i", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!aja", name = "j", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!aja", name = "k", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!aja", name = "l", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!aja", name = "m", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!aja", name = "n", descriptor = "I")
    public int field1219;

    @OriginalMember(owner = "client!aja", name = "o", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!aja", name = "r", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!aja", name = "s", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!aja", name = "w", descriptor = "I")
    private static int field1228;

    @OriginalMember(owner = "client!aja", name = "y", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!aja", name = "A", descriptor = "I")
    private static int field1232;

    @OriginalMember(owner = "client!aja", name = "C", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!aja", name = "D", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!aja", name = "E", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!aja", name = "G", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!aja", name = "q", descriptor = "[I")
    private int[] field1222;

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "()I", line = 11)
    public final int method736() {
        return this.field1230 + this.field1208 + this.field1213;
    }

    @OriginalMember(owner = "client!aja", name = "d", descriptor = "()I", line = 14)
    public final int method737() {
        return this.field1231;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "()I", line = 18)
    public final int method738() {
        return this.field1208;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(FFFFFF)Z", line = 39)
    private final boolean method740(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field1231 + this.field1219 + this.field1223;
        int var8 = this.field1230 + this.field1208 + this.field1213;
        if (this.field1231 != var7 || this.field1208 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field1230 * var11;
            float var14 = (float) this.field1230 * var12;
            float var15 = (float) this.field1219 * var9;
            float var16 = (float) this.field1219 * var10;
            float var17 = (float) this.field1223 * -var9;
            float var18 = (float) this.field1223 * -var10;
            float var19 = (float) this.field1213 * -var11;
            float var20 = (float) this.field1213 * -var12;
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
        if (var23 < (float) this.field1225.field258) {
            var23 = this.field1225.field258;
        }
        if (var24 > (float) this.field1225.field264) {
            var24 = this.field1225.field264;
        }
        if (var25 < (float) this.field1225.field276) {
            var25 = this.field1225.field276;
        }
        if (var26 > (float) this.field1225.field256) {
            var26 = this.field1225.field256;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field1220 = this.field1225.field275;
        field1224 = (int) ((float) ((int) var25 * field1220) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field1234 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field1231 / var29);
        field1217 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field1208 / var30);
        field1206 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field1231 / var30);
        field1218 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field1208 / var29);
        field1210 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field1232 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field1238 = (this.field1231 >> 1 << 12) + (field1232 * field1206 >> 4);
        field1215 = (this.field1208 >> 1 << 12) + (field1232 * field1218 >> 4);
        field1216 = field1234 * field1210 >> 4;
        field1214 = field1217 * field1210 >> 4;
        field1212 = (int) var23;
        field1235 = (int) var27;
        field1228 = (int) var25;
        field1236 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(IIII)V", line = 173)
    public final void method741(int arg0, int arg1, int arg2, int arg3) {
        this.field1219 = arg0;
        this.field1230 = arg1;
        this.field1223 = arg2;
        this.field1213 = arg3;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(FFFFFFIIII)V", line = 179)
    public final void method742(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field1225.method144()) {
            throw new IllegalStateException();
        } else if (this.method740(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field1207 = arg7;
            if (arg6 != 1) {
                field1227 = arg7 >>> 24;
                field1221 = 256 - field1227;
                if (arg6 == 0) {
                    field1209 = (arg7 & 0xFF0000) >> 16;
                    field1233 = (arg7 & 0xFF00) >> 8;
                    field1237 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field1226 = arg7 >>> 24;
                    field1229 = 256 - field1226;
                    int var11 = (arg7 & 0xFF00FF) * field1229 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field1229 & 0xFF0000;
                    field1211 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method743(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method743(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method743(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method743(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method743(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method743(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method743(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method743(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method743(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method743(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method743(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method743(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "([I)V", line = 282)
    public final void method744(int[] arg0) {
        arg0[0] = this.field1219;
        arg0[1] = this.field1230;
        arg0[2] = this.field1223;
        arg0[3] = this.field1213;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 288)
    public final void method745(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class87 arg7, int arg8, int arg9) {
        if (this.field1225.method144()) {
            throw new IllegalStateException();
        } else if (this.method740(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class16 var11 = (class16) arg7;
            this.method734(var11.field99, var11.field94, field1212 - arg8, -arg9 - (field1236 - field1228));
        }
    }

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(IIIIIII)V", line = 321)
    public final void method748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1225.method144()) {
            throw new IllegalStateException();
        }
        if (this.field1222 == null) {
            this.field1222 = new int[4];
        }
        this.field1225.method160(this.field1222);
        this.field1225.method252(this.field1225.field258, this.field1225.field276, arg0 + arg2, arg1 + arg3);
        int var8 = this.method749();
        int var9 = this.method736();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method746(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field1225.method225(this.field1222[0], this.field1222[1], this.field1222[2], this.field1222[3]);
    }

    @OriginalMember(owner = "client!aja", name = "c", descriptor = "()I", line = 363)
    public final int method749() {
        return this.field1231 + this.field1219 + this.field1223;
    }

    @OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(Lnia;II)V", line = 376)
    public class105(class30 arg0, int arg1, int arg2) {
        this.field1225 = arg0;
        this.field1231 = arg1;
        this.field1208 = arg2;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "([I[III)V")
    public abstract void method734(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method735(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(II)V")
    public abstract void method743(int arg0, int arg1);

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIIII)V")
    public abstract void method746(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method747(int arg0, int arg1, class87 arg2, int arg3, int arg4);
}
