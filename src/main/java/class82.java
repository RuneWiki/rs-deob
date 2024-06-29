import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public abstract class class82 extends class226 {

    @OriginalMember(owner = "client!ho", name = "y", descriptor = "Lma;")
    public class8 field1175;

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public int field1160;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public static int field1158 = 0;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field1159 = 0;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field1152 = 0;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    public static int field1166 = 0;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field1155 = 0;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "I")
    private static int field1170 = 0;

    @OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
    private static int field1178 = 0;

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "I")
    public static int field1183 = 0;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public int field1151;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public int field1156;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    private static int field1169;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "I")
    private static int field1171;

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
    private static int field1173;

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!ho", name = "C", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!ho", name = "D", descriptor = "I")
    private static int field1180;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "[I")
    private int[] field1157;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFFLep;II)V", line = 4)
    public final void method592(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class241 arg6, int arg7, int arg8) {
        if (this.field1175.method112()) {
            throw new IllegalStateException();
        }
        this.method599(arg0, arg1, arg2, arg3, arg4, arg5);
        class288 var10 = (class288) arg6;
        this.method586(var10.field4054, var10.field4051, field1180 - arg7, -arg8 - (field1163 - field1171));
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(IIIIIII)V", line = 15)
    public final void method593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1175.method112()) {
            throw new IllegalStateException();
        }
        if (this.field1157 == null) {
            this.field1157 = new int[4];
        }
        this.field1175.method107(this.field1157);
        this.field1175.method53(this.field1175.field122, this.field1175.field158, arg0 + arg2, arg1 + arg3);
        int var8 = this.method597();
        int var9 = this.method596();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method587(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field1175.method136(this.field1157[0], this.field1157[1], this.field1157[2], this.field1157[3]);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFFIII)V", line = 55)
    public final void method594(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field1175.method112()) {
            throw new IllegalStateException();
        }
        this.method599(arg0, arg1, arg2, arg3, arg4, arg5);
        field1174 = arg7;
        if (arg6 != 0) {
            field1158 = arg7 >>> 24;
            field1166 = 256 - field1158;
            if (arg6 == 1) {
                field1155 = (arg7 & 0xFF0000) >> 16;
                field1159 = (arg7 & 0xFF00) >> 8;
                field1183 = arg7 & 0xFF;
            } else {
                field1178 = arg7 >>> 24;
                field1170 = 256 - field1178;
                int var10 = (arg7 & 0xFF00FF) * field1170 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field1170 & 0xFF0000;
                field1152 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method589(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method589(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method589(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method589(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method589(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method589(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method589(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method589(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method589(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(IIII)V", line = 139)
    public final void method595(int arg0, int arg1, int arg2, int arg3) {
        this.field1151 = arg0;
        this.field1162 = arg1;
        this.field1156 = arg2;
        this.field1181 = arg3;
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "()I", line = 152)
    public final int method596() {
        return this.field1162 + this.field1160 + this.field1181;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "()I", line = 174)
    public final int method597() {
        return this.field1176 + this.field1151 + this.field1156;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "()I", line = 185)
    public final int method598() {
        return this.field1160;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(FFFFFF)V", line = 189)
    private final void method599(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field1176 + this.field1151 + this.field1156;
        int var8 = this.field1162 + this.field1160 + this.field1181;
        if (this.field1176 != var7 || this.field1160 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field1162 * var11;
            float var14 = (float) this.field1162 * var12;
            float var15 = (float) this.field1151 * var9;
            float var16 = (float) this.field1151 * var10;
            float var17 = (float) this.field1156 * -var9;
            float var18 = (float) this.field1156 * -var10;
            float var19 = (float) this.field1181 * -var11;
            float var20 = (float) this.field1181 * -var12;
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
        if (var23 < (float) this.field1175.field122) {
            var23 = (float) this.field1175.field122;
        }
        if (var24 > (float) this.field1175.field117) {
            var24 = (float) this.field1175.field117;
        }
        if (var25 < (float) this.field1175.field158) {
            var25 = (float) this.field1175.field158;
        }
        if (var26 > (float) this.field1175.field114) {
            var26 = (float) this.field1175.field114;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field1179 = this.field1175.field121;
        field1153 = (int) ((float) ((int) var25 * field1179) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field1177 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field1176 / var29);
        field1182 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field1160 / var30);
        field1154 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field1176 / var30);
        field1167 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field1160 / var29);
        field1173 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field1169 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field1164 = (this.field1176 >> 1 << 12) + (field1169 * field1154 >> 4);
        field1168 = (this.field1160 >> 1 << 12) + (field1169 * field1167 >> 4);
        field1165 = field1177 * field1173 >> 4;
        field1161 = field1182 * field1173 >> 4;
        field1180 = (int) var23;
        field1172 = (int) var27;
        field1171 = (int) var25;
        field1163 = (int) var28;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lma;II)V", line = 327)
    public class82(class8 arg0, int arg1, int arg2) {
        this.field1175 = arg0;
        this.field1176 = arg1;
        this.field1160 = arg2;
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "()I", line = 340)
    public final int method600() {
        return this.field1176;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(II)V")
    public abstract void method589(int arg0, int arg1);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILep;II)V")
    public abstract void method585(int arg0, int arg1, class241 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([I[III)V")
    public abstract void method586(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIII)V")
    public abstract void method587(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
