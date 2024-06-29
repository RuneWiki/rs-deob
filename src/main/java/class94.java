import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public abstract class class94 extends class24 {

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "Lwc;")
    public class49 field1210;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    private static int field1193 = 0;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public static int field1208 = 0;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public static int field1201 = 0;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    private static int field1217 = 0;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field1194 = 0;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
    public static int field1220 = 0;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field1197 = 0;

    @OriginalMember(owner = "client!fn", name = "I", descriptor = "I")
    public static int field1225 = 0;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    private static int field1206;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    private static int field1207;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    public int field1209;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    private static int field1212;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "I")
    public int field1216;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "I")
    private static int field1222;

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "[I")
    private int[] field1200;

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "(FFFFFFIII)V", line = 10)
    public final void method158(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field1210.method296()) {
            throw new IllegalStateException();
        }
        this.method667(arg0, arg1, arg2, arg3, arg4, arg5);
        field1224 = arg7;
        if (arg6 != 1) {
            field1197 = arg7 >>> 24;
            field1220 = 256 - field1197;
            if (arg6 == 0) {
                field1225 = (arg7 & 0xFF0000) >> 16;
                field1208 = (arg7 & 0xFF00) >> 8;
                field1194 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field1193 = arg7 >>> 24;
                field1217 = 256 - field1193;
                int var10 = (arg7 & 0xFF00FF) * field1217 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field1217 & 0xFF0000;
                field1201 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method197(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method197(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method197(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method197(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method197(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method197(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method197(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method197(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method197(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method197(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method197(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method197(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "YA", descriptor = "()I", line = 106)
    public final int method146() {
        return this.field1211;
    }

    @OriginalMember(owner = "client!fn", name = "Q", descriptor = "()I", line = 110)
    public final int method157() {
        return this.field1209 + this.field1198 + this.field1214;
    }

    @OriginalMember(owner = "client!fn", name = "ha", descriptor = "(IIII)V", line = 118)
    public final void method152(int arg0, int arg1, int arg2, int arg3) {
        this.field1216 = arg0;
        this.field1209 = arg1;
        this.field1205 = arg2;
        this.field1214 = arg3;
    }

    @OriginalMember(owner = "client!fn", name = "la", descriptor = "(IIIIIII)V", line = 126)
    public final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1210.method296()) {
            throw new IllegalStateException();
        }
        if (this.field1200 == null) {
            this.field1200 = new int[4];
        }
        this.field1210.method343(this.field1200);
        this.field1210.method346(this.field1210.field587, this.field1210.field605, arg0 + arg2, arg1 + arg3);
        int var8 = this.method145();
        int var9 = this.method157();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method144(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field1210.method301(this.field1200[0], this.field1200[1], this.field1200[2], this.field1200[3]);
    }

    @OriginalMember(owner = "client!fn", name = "ZA", descriptor = "()I", line = 165)
    public final int method155() {
        return this.field1198;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(FFFFFFLta;II)V", line = 181)
    public final void method154(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class145 arg6, int arg7, int arg8) {
        if (this.field1210.method296()) {
            throw new IllegalStateException();
        }
        this.method667(arg0, arg1, arg2, arg3, arg4, arg5);
        class138 var10 = (class138) arg6;
        this.method198(var10.field1811, var10.field1812, field1212 - arg7, -arg8 - (field1215 - field1222));
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(FFFFFF)V", line = 210)
    private final void method667(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field1216 + this.field1211 + this.field1205;
        int var8 = this.field1209 + this.field1198 + this.field1214;
        if (this.field1211 != var7 || this.field1198 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field1209 * var11;
            float var14 = (float) this.field1209 * var12;
            float var15 = (float) this.field1216 * var9;
            float var16 = (float) this.field1216 * var10;
            float var17 = (float) this.field1205 * -var9;
            float var18 = (float) this.field1205 * -var10;
            float var19 = (float) this.field1214 * -var11;
            float var20 = (float) this.field1214 * -var12;
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
        if (var23 < (float) this.field1210.field587) {
            var23 = this.field1210.field587;
        }
        if (var24 > (float) this.field1210.field573) {
            var24 = this.field1210.field573;
        }
        if (var25 < (float) this.field1210.field605) {
            var25 = this.field1210.field605;
        }
        if (var26 > (float) this.field1210.field596) {
            var26 = this.field1210.field596;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field1219 = this.field1210.field597;
        field1199 = (int) ((float) ((int) var25 * field1219) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field1223 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field1211 / var29);
        field1221 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field1198 / var30);
        field1204 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field1211 / var30);
        field1213 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field1198 / var29);
        field1206 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field1207 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field1196 = (this.field1211 >> 1 << 12) + (field1207 * field1204 >> 4);
        field1202 = (this.field1198 >> 1 << 12) + (field1213 * field1207 >> 4);
        field1195 = field1223 * field1206 >> 4;
        field1203 = field1221 * field1206 >> 4;
        field1212 = (int) var23;
        field1218 = (int) var27;
        field1222 = (int) var25;
        field1215 = (int) var28;
    }

    @OriginalMember(owner = "client!fn", name = "RA", descriptor = "()I", line = 348)
    public final int method145() {
        return this.field1216 + this.field1211 + this.field1205;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lwc;II)V", line = 359)
    public class94(class49 arg0, int arg1, int arg2) {
        this.field1210 = arg0;
        this.field1211 = arg1;
        this.field1198 = arg2;
    }

    @OriginalMember(owner = "client!fn", name = "W", descriptor = "(IIIII)V")
    public abstract void method144(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILta;II)V")
    public abstract void method148(int arg0, int arg1, class145 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([I[III)V")
    public abstract void method198(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(II)V")
    public abstract void method197(int arg0, int arg1);

    @OriginalMember(owner = "client!fn", name = "ya", descriptor = "(IIIIIII)V")
    public abstract void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
