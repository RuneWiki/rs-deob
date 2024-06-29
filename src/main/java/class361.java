import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public abstract class class361 extends class433 {

    @OriginalMember(owner = "client!hea", name = "w", descriptor = "Lfk;")
    public class569 field5130;

    @OriginalMember(owner = "client!hea", name = "G", descriptor = "I")
    public int field5140;

    @OriginalMember(owner = "client!hea", name = "q", descriptor = "I")
    public int field5124;

    @OriginalMember(owner = "client!hea", name = "r", descriptor = "I")
    public static int field5125 = 0;

    @OriginalMember(owner = "client!hea", name = "k", descriptor = "I")
    private static int field5118 = 0;

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "I")
    public static int field5113 = 0;

    @OriginalMember(owner = "client!hea", name = "n", descriptor = "I")
    public static int field5121 = 0;

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "I")
    public static int field5111 = 0;

    @OriginalMember(owner = "client!hea", name = "j", descriptor = "I")
    private static int field5117 = 0;

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "I")
    public static int field5133 = 0;

    @OriginalMember(owner = "client!hea", name = "l", descriptor = "I")
    public static int field5119 = 0;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "I")
    public int field5108;

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "I")
    public int field5115;

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "I")
    public int field5116;

    @OriginalMember(owner = "client!hea", name = "m", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!hea", name = "p", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!hea", name = "s", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!hea", name = "t", descriptor = "I")
    public int field5127;

    @OriginalMember(owner = "client!hea", name = "u", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!hea", name = "x", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!hea", name = "y", descriptor = "I")
    private static int field5132;

    @OriginalMember(owner = "client!hea", name = "A", descriptor = "I")
    private static int field5134;

    @OriginalMember(owner = "client!hea", name = "B", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!hea", name = "C", descriptor = "I")
    private static int field5136;

    @OriginalMember(owner = "client!hea", name = "D", descriptor = "I")
    private static int field5137;

    @OriginalMember(owner = "client!hea", name = "E", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!hea", name = "F", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!hea", name = "v", descriptor = "[I")
    private int[] field5129;

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "()I")
    public final int method1576() {
        return this.field5124;
    }

    @OriginalMember(owner = "client!hea", name = "QA", descriptor = "()I")
    public final int method1570() {
        return this.field5140;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IILfa;II)V")
    public abstract void method1572(int arg0, int arg1, class199 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!hea", name = "I", descriptor = "(IIIII)V")
    public abstract void method1571(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!hea", name = "sa", descriptor = "(FFFFFFIII)V")
    public final void method1583(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field5130.method3299()) {
            throw new IllegalStateException();
        } else if (this.method2248(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field5122 = arg7;
            if (arg6 != 1) {
                field5125 = arg7 >>> 24;
                field5121 = 256 - field5125;
                if (arg6 == 0) {
                    field5119 = (arg7 & 0xFF0000) >> 16;
                    field5113 = (arg7 & 0xFF00) >> 8;
                    field5111 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field5118 = arg7 >>> 24;
                    field5117 = 256 - field5118;
                    int var10 = (arg7 & 0xFF00FF) * field5117 & 0xFF00FF00;
                    int var11 = (arg7 & 0xFF00) * field5117 & 0xFF0000;
                    field5133 = (var10 | var11) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method2247(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method2247(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method2247(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method2247(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method2247(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method2247(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method2247(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method2247(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method2247(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method2247(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method2247(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method2247(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "KA", descriptor = "(IIIIIII)V")
    public abstract void method1582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(II)V")
    public abstract void method2247(int arg0, int arg1);

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method2248(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field5140 + this.field5116 + this.field5115;
        int var8 = this.field5124 + this.field5108 + this.field5127;
        if (this.field5140 != var7 || this.field5124 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field5108 * var11;
            float var14 = (float) this.field5108 * var12;
            float var15 = (float) this.field5116 * var9;
            float var16 = (float) this.field5116 * var10;
            float var17 = (float) this.field5115 * -var9;
            float var18 = (float) this.field5115 * -var10;
            float var19 = (float) this.field5127 * -var11;
            float var20 = (float) this.field5127 * -var12;
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
        if (var23 < (float) this.field5130.field8190) {
            var23 = this.field5130.field8190;
        }
        if (var24 > (float) this.field5130.field8194) {
            var24 = this.field5130.field8194;
        }
        if (var25 < (float) this.field5130.field8196) {
            var25 = this.field5130.field8196;
        }
        if (var26 > (float) this.field5130.field8168) {
            var26 = this.field5130.field8168;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field5131 = this.field5130.field8205;
        field5139 = (int) ((float) ((int) var25 * field5131) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field5109 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field5140 / var29);
        field5128 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field5124 / var30);
        field5135 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field5140 / var30);
        field5110 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field5124 / var29);
        field5132 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field5137 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field5123 = (this.field5140 >> 1 << 12) + (field5137 * field5135 >> 4);
        field5112 = (this.field5124 >> 1 << 12) + (field5137 * field5110 >> 4);
        field5138 = field5132 * field5109 >> 4;
        field5126 = field5132 * field5128 >> 4;
        field5134 = (int) var23;
        field5120 = (int) var27;
        field5136 = (int) var25;
        field5114 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method1578(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class199 arg6, int arg7, int arg8) {
        if (this.field5130.method3299()) {
            throw new IllegalStateException();
        } else if (this.method2248(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class595 var10 = (class595) arg6;
            this.method2249(var10.field8687, var10.field8691, field5134 - arg7, -arg8 - (field5114 - field5136));
        }
    }

    @OriginalMember(owner = "client!hea", name = "ba", descriptor = "(IIIIIII)V")
    public final void method1574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field5130.method3299()) {
            throw new IllegalStateException();
        }
        if (this.field5129 == null) {
            this.field5129 = new int[4];
        }
        this.field5130.method403(this.field5129);
        this.field5130.method333(this.field5130.field8190, this.field5130.field8196, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1577();
        int var9 = this.method1568();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method1571(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field5130.method368(this.field5129[0], this.field5129[1], this.field5129[2], this.field5129[3]);
    }

    @OriginalMember(owner = "client!hea", name = "EA", descriptor = "(IIII)V")
    public final void method1580(int arg0, int arg1, int arg2, int arg3) {
        this.field5116 = arg0;
        this.field5108 = arg1;
        this.field5115 = arg2;
        this.field5127 = arg3;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "()I")
    public final int method1568() {
        return this.field5124 + this.field5108 + this.field5127;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "([I[III)V")
    public abstract void method2249(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lfk;II)V")
    public class361(class569 arg0, int arg1, int arg2) {
        this.field5130 = arg0;
        this.field5140 = arg1;
        this.field5124 = arg2;
    }

    @OriginalMember(owner = "client!hea", name = "AA", descriptor = "()I")
    public final int method1577() {
        return this.field5140 + this.field5116 + this.field5115;
    }
}
