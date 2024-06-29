import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class91 extends class176 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lsq;")
    public class108 field1127;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public int field1130;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public int field1132;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field1126 = 0;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    private static int field1137 = 0;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field1133 = 0;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field1140 = 0;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field1134 = 0;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field1145 = 0;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public static int field1156 = 0;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    private static int field1151 = 0;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    private static int field1139;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    private static int field1144;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    private static int field1146;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
    private static int field1152;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "[I")
    private int[] field1149;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIII)V")
    public abstract void method144(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "()I")
    public final int method516() {
        return this.field1154 + this.field1130 + this.field1131;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(FFFFFF)V")
    private final void method517(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field1154 + this.field1130 + this.field1131;
        int var8 = this.field1155 + this.field1132 + this.field1129;
        if (this.field1130 != var7 || this.field1132 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field1155 * var11;
            float var14 = (float) this.field1155 * var12;
            float var15 = (float) this.field1154 * var9;
            float var16 = (float) this.field1154 * var10;
            float var17 = (float) this.field1131 * -var9;
            float var18 = (float) this.field1131 * -var10;
            float var19 = (float) this.field1129 * -var11;
            float var20 = (float) this.field1129 * -var12;
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
        if (var23 < (float) this.field1127.field1372) {
            var23 = (float) this.field1127.field1372;
        }
        if (var24 > (float) this.field1127.field1367) {
            var24 = (float) this.field1127.field1367;
        }
        if (var25 < (float) this.field1127.field1387) {
            var25 = (float) this.field1127.field1387;
        }
        if (var26 > (float) this.field1127.field1356) {
            var26 = (float) this.field1127.field1356;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field1135 = this.field1127.field1357;
        field1142 = (int) ((float) ((int) var25 * field1135) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field1148 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field1130 / var29);
        field1153 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field1132 / var30);
        field1128 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field1130 / var30);
        field1138 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field1132 / var29);
        field1144 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field1152 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field1143 = (this.field1130 >> 1 << 12) + (field1152 * field1128 >> 4);
        field1158 = (this.field1132 >> 1 << 12) + (field1152 * field1138 >> 4);
        field1141 = field1148 * field1144 >> 4;
        field1136 = field1153 * field1144 >> 4;
        field1139 = (int) var23;
        field1147 = (int) var27;
        field1146 = (int) var25;
        field1150 = (int) var28;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "()I")
    public final int method518() {
        return this.field1130;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIII)V")
    public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1127.method674()) {
            throw new IllegalStateException();
        }
        if (this.field1149 == null) {
            this.field1149 = new int[4];
        }
        this.field1127.method690(this.field1149);
        this.field1127.method669(this.field1127.field1372, this.field1127.field1387, arg0 + arg2, arg1 + arg3);
        int var8 = this.method516();
        int var9 = this.method524();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method144(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field1127.method617(this.field1149[0], this.field1149[1], this.field1149[2], this.field1149[3]);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILsm;II)V")
    public abstract void method141(int arg0, int arg1, class171 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)V")
    public final void method520(int arg0, int arg1, int arg2, int arg3) {
        this.field1154 = arg0;
        this.field1155 = arg1;
        this.field1131 = arg2;
        this.field1129 = arg3;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()I")
    public final int method521() {
        return this.field1132;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([I[III)V")
    public abstract void method139(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(FFFFFFLsm;II)V")
    public final void method522(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class171 arg6, int arg7, int arg8) {
        if (this.field1127.method674()) {
            throw new IllegalStateException();
        }
        this.method517(arg0, arg1, arg2, arg3, arg4, arg5);
        class81 var10 = (class81) arg6;
        this.method139(var10.field989, var10.field993, field1139 - arg7, -arg8 - (field1150 - field1146));
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lsq;II)V")
    public class91(class108 arg0, int arg1, int arg2) {
        this.field1127 = arg0;
        this.field1130 = arg1;
        this.field1132 = arg2;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V")
    public abstract void method143(int arg0, int arg1);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method523(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field1127.method674()) {
            throw new IllegalStateException();
        }
        this.method517(arg0, arg1, arg2, arg3, arg4, arg5);
        field1157 = arg7;
        if (arg6 != 0) {
            field1145 = arg7 >>> 24;
            field1126 = 256 - field1145;
            if (arg6 == 1) {
                field1140 = (arg7 & 0xFF0000) >> 16;
                field1133 = (arg7 & 0xFF00) >> 8;
                field1134 = arg7 & 0xFF;
            } else {
                field1137 = arg7 >>> 24;
                field1151 = 256 - field1137;
                int var10 = (arg7 & 0xFF00FF) * field1151 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field1151 & 0xFF0000;
                field1156 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method143(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method143(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method143(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method143(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method143(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method143(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method143(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method143(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method143(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "()I")
    public final int method524() {
        return this.field1155 + this.field1132 + this.field1129;
    }
}
