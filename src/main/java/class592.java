import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public abstract class class592 extends class496 {

    @OriginalMember(owner = "client!nu", name = "k", descriptor = "Lao;")
    public class289 field8086;

    @OriginalMember(owner = "client!nu", name = "v", descriptor = "I")
    public int field8097;

    @OriginalMember(owner = "client!nu", name = "u", descriptor = "I")
    public int field8096;

    @OriginalMember(owner = "client!nu", name = "p", descriptor = "I")
    public static int field8091 = 0;

    @OriginalMember(owner = "client!nu", name = "y", descriptor = "I")
    public static int field8100 = 0;

    @OriginalMember(owner = "client!nu", name = "w", descriptor = "I")
    public static int field8098 = 0;

    @OriginalMember(owner = "client!nu", name = "n", descriptor = "I")
    public static int field8089 = 0;

    @OriginalMember(owner = "client!nu", name = "t", descriptor = "I")
    public static int field8095 = 0;

    @OriginalMember(owner = "client!nu", name = "B", descriptor = "I")
    public static int field8103 = 0;

    @OriginalMember(owner = "client!nu", name = "j", descriptor = "I")
    private static int field8085 = 0;

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "I")
    private static int field8081 = 0;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
    public static int field8076;

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
    public static int field8077;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "I")
    public static int field8079;

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "I")
    public int field8080;

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "I")
    public int field8082;

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!nu", name = "l", descriptor = "I")
    public int field8087;

    @OriginalMember(owner = "client!nu", name = "o", descriptor = "I")
    public int field8090;

    @OriginalMember(owner = "client!nu", name = "q", descriptor = "I")
    private static int field8092;

    @OriginalMember(owner = "client!nu", name = "r", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!nu", name = "s", descriptor = "I")
    public static int field8094;

    @OriginalMember(owner = "client!nu", name = "x", descriptor = "I")
    private static int field8099;

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "I")
    public static int field8101;

    @OriginalMember(owner = "client!nu", name = "A", descriptor = "I")
    private static int field8102;

    @OriginalMember(owner = "client!nu", name = "C", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
    public static int field8105;

    @OriginalMember(owner = "client!nu", name = "E", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!nu", name = "G", descriptor = "I")
    private static int field8108;

    @OriginalMember(owner = "client!nu", name = "m", descriptor = "[I")
    private int[] field8088;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "()I", line = 6)
    public final int method1626() {
        return this.field8097;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "([I)V", line = 9)
    public final void method1625(int[] arg0) {
        arg0[0] = this.field8087;
        arg0[1] = this.field8090;
        arg0[2] = this.field8080;
        arg0[3] = this.field8082;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIIII)V", line = 16)
    public final void method1622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field8086.method1885()) {
            throw new IllegalStateException();
        }
        if (this.field8088 == null) {
            this.field8088 = new int[4];
        }
        this.field8086.method206(this.field8088);
        this.field8086.method279(this.field8086.field4039, this.field8086.field4019, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1618();
        int var9 = this.method1614();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method1200(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field8086.method303(this.field8088[0], this.field8088[1], this.field8088[2], this.field8088[3]);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 59)
    public final void method1623(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class487 arg7, int arg8, int arg9) {
        if (this.field8086.method1885()) {
            throw new IllegalStateException();
        } else if (this.method3375(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class301 var11 = (class301) arg7;
            this.method1197(var11.field4196, var11.field4197, field8099 - arg8, -arg9 - (field8094 - field8092));
        }
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(IIII)V", line = 72)
    public final void method1615(int arg0, int arg1, int arg2, int arg3) {
        this.field8087 = arg0;
        this.field8090 = arg1;
        this.field8080 = arg2;
        this.field8082 = arg3;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(FFFFFFIIII)V", line = 97)
    public final void method1621(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field8086.method1885()) {
            throw new IllegalStateException();
        } else if (this.method3375(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field8106 = arg7;
            if (arg6 != 1) {
                field8103 = arg7 >>> 24;
                field8098 = 256 - field8103;
                if (arg6 == 0) {
                    field8095 = (arg7 & 0xFF0000) >> 16;
                    field8089 = (arg7 & 0xFF00) >> 8;
                    field8091 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field8085 = arg7 >>> 24;
                    field8081 = 256 - field8085;
                    int var11 = (arg7 & 0xFF00FF) * field8081 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field8081 & 0xFF0000;
                    field8100 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method1198(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1198(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1198(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method1198(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1198(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1198(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method1198(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1198(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1198(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method1198(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1198(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1198(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "()I", line = 208)
    public final int method1619() {
        return this.field8096;
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "()I", line = 221)
    public final int method1614() {
        return this.field8096 + this.field8090 + this.field8082;
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lao;II)V", line = 224)
    public class592(class289 arg0, int arg1, int arg2) {
        this.field8086 = arg0;
        this.field8097 = arg1;
        this.field8096 = arg2;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "()I", line = 231)
    public final int method1618() {
        return this.field8097 + this.field8087 + this.field8080;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(FFFFFF)Z", line = 241)
    private final boolean method3375(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field8097 + this.field8087 + this.field8080;
        int var8 = this.field8096 + this.field8090 + this.field8082;
        if (this.field8097 != var7 || this.field8096 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field8090 * var11;
            float var14 = (float) this.field8090 * var12;
            float var15 = (float) this.field8087 * var9;
            float var16 = (float) this.field8087 * var10;
            float var17 = (float) this.field8080 * -var9;
            float var18 = (float) this.field8080 * -var10;
            float var19 = (float) this.field8082 * -var11;
            float var20 = (float) this.field8082 * -var12;
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
        if (var23 < (float) this.field8086.field4039) {
            var23 = this.field8086.field4039;
        }
        if (var24 > (float) this.field8086.field4050) {
            var24 = this.field8086.field4050;
        }
        if (var25 < (float) this.field8086.field4019) {
            var25 = this.field8086.field4019;
        }
        if (var26 > (float) this.field8086.field4046) {
            var26 = this.field8086.field4046;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field8079 = this.field8086.field4020;
        field8077 = (int) ((float) ((int) var25 * field8079) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field8107 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field8097 / var29);
        field8076 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field8096 / var30);
        field8083 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field8097 / var30);
        field8078 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field8096 / var29);
        field8102 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field8108 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field8084 = (this.field8097 >> 1 << 12) + (field8108 * field8083 >> 4);
        field8093 = (this.field8096 >> 1 << 12) + (field8108 * field8078 >> 4);
        field8105 = field8107 * field8102 >> 4;
        field8101 = field8102 * field8076 >> 4;
        field8099 = (int) var23;
        field8104 = (int) var27;
        field8092 = (int) var25;
        field8094 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIII)V")
    public abstract void method1200(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(II)V")
    public abstract void method1198(int arg0, int arg1);

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "([I[III)V")
    public abstract void method1197(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method1195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method1196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method1199(int arg0, int arg1, class487 arg2, int arg3, int arg4);
}
