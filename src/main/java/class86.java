import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class class86 extends class529 {

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Lhh;")
    public class84 field1311;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public int field1308;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    public int field1333;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field1309 = 0;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    private static int field1302 = 0;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field1313 = 0;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public static int field1319 = 0;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1305 = 0;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    public static int field1330 = 0;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    private static int field1323 = 0;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public static int field1331 = 0;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    private static int field1314;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public int field1320;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    private static int field1324;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    private static int field1326;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    private static int field1332;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "[I")
    private int[] field1307;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "(IIIIIII)V")
    public abstract void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!kc", name = "YA", descriptor = "(IIIII)V")
    public abstract void method158(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kc", name = "ja", descriptor = "()I")
    public final int method151() {
        return this.field1315 + this.field1308 + this.field1320;
    }

    @OriginalMember(owner = "client!kc", name = "ka", descriptor = "(IIII)V")
    public final void method152(int arg0, int arg1, int arg2, int arg3) {
        this.field1315 = arg0;
        this.field1327 = arg1;
        this.field1320 = arg2;
        this.field1303 = arg3;
    }

    @OriginalMember(owner = "client!kc", name = "JA", descriptor = "()I")
    public final int method149() {
        return this.field1333 + this.field1327 + this.field1303;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(FFFFFFLea;II)V")
    public final void method162(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8) {
        if (this.field1311.method608()) {
            throw new IllegalStateException();
        }
        this.method635(arg0, arg1, arg2, arg3, arg4, arg5);
        class332 var10 = (class332) arg6;
        this.method634(var10.field4366, var10.field4367, field1326 - arg7, -arg8 - (field1316 - field1314));
    }

    @OriginalMember(owner = "client!kc", name = "qa", descriptor = "()I")
    public final int method161() {
        return this.field1333;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([I[III)V")
    public abstract void method634(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kc", name = "UA", descriptor = "()I")
    public final int method154() {
        return this.field1308;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILea;II)V")
    public abstract void method157(int arg0, int arg1, class381 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kc", name = "aa", descriptor = "(FFFFFFIII)V")
    public final void method160(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field1311.method608()) {
            throw new IllegalStateException();
        }
        this.method635(arg0, arg1, arg2, arg3, arg4, arg5);
        field1304 = arg7;
        if (arg6 != 1) {
            field1319 = arg7 >>> 24;
            field1331 = 256 - field1319;
            if (arg6 == 0) {
                field1313 = (arg7 & 0xFF0000) >> 16;
                field1330 = (arg7 & 0xFF00) >> 8;
                field1305 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field1323 = arg7 >>> 24;
                field1302 = 256 - field1323;
                int var10 = (arg7 & 0xFF00FF) * field1302 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field1302 & 0xFF0000;
                field1309 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method636(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method636(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method636(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method636(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method636(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method636(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method636(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method636(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method636(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method636(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method636(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method636(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "(IIIIIII)V")
    public final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1311.method608()) {
            throw new IllegalStateException();
        }
        if (this.field1307 == null) {
            this.field1307 = new int[4];
        }
        this.field1311.method613(this.field1307);
        this.field1311.method590(this.field1311.field1281, this.field1311.field1284, arg0 + arg2, arg1 + arg3);
        int var8 = this.method151();
        int var9 = this.method149();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method158(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field1311.method572(this.field1307[0], this.field1307[1], this.field1307[2], this.field1307[3]);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(FFFFFF)V")
    private final void method635(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field1315 + this.field1308 + this.field1320;
        int var8 = this.field1333 + this.field1327 + this.field1303;
        if (this.field1308 != var7 || this.field1333 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field1327 * var11;
            float var14 = (float) this.field1327 * var12;
            float var15 = (float) this.field1315 * var9;
            float var16 = (float) this.field1315 * var10;
            float var17 = (float) this.field1320 * -var9;
            float var18 = (float) this.field1320 * -var10;
            float var19 = (float) this.field1303 * -var11;
            float var20 = (float) this.field1303 * -var12;
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
        if (var23 < (float) this.field1311.field1281) {
            var23 = this.field1311.field1281;
        }
        if (var24 > (float) this.field1311.field1255) {
            var24 = this.field1311.field1255;
        }
        if (var25 < (float) this.field1311.field1284) {
            var25 = this.field1311.field1284;
        }
        if (var26 > (float) this.field1311.field1275) {
            var26 = this.field1311.field1275;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field1310 = this.field1311.field1258;
        field1312 = (int) ((float) ((int) var25 * field1310) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field1328 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field1308 / var29);
        field1317 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field1333 / var30);
        field1318 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field1308 / var30);
        field1322 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field1333 / var29);
        field1324 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field1332 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field1301 = (this.field1308 >> 1 << 12) + (field1332 * field1318 >> 4);
        field1329 = (this.field1333 >> 1 << 12) + (field1332 * field1322 >> 4);
        field1321 = field1328 * field1324 >> 4;
        field1325 = field1324 * field1317 >> 4;
        field1326 = (int) var23;
        field1306 = (int) var27;
        field1314 = (int) var25;
        field1316 = (int) var28;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
    public abstract void method636(int arg0, int arg1);

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lhh;II)V")
    public class86(class84 arg0, int arg1, int arg2) {
        this.field1311 = arg0;
        this.field1308 = arg1;
        this.field1333 = arg2;
    }
}
