import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class350 extends class116 {

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Z")
    private boolean field5082 = false;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    private int field5084 = 0;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    private int field5091 = 0;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    private int field5095 = 0;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
    private int field5104 = 0;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    private int field5096;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    private int field5088;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Lkw;")
    private class174 field5085;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Lhc;")
    private class391 field5077;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "Z")
    private boolean field5094;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Z")
    private boolean field5089;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "Z")
    private boolean field5097;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Z")
    private boolean field5078;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "[I")
    public static int[] field5081 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field5086 = 0;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field5079 = 0;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lre;")
    public static class582 field5071;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)I", line = 6)
    public static final int method2140(int arg0, int arg1, int arg2) {
        field5090++;
        int var3 = class251.method1593(arg2 + 45365, arg0, arg0 - 5, arg1 - -91923) + ((class251.method1593(arg2 + 10294, 2, -1, arg1 - -37821) + -128 >> 1) - -(class251.method1593(arg2, 1, arg0 + -5, arg1) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILpa;II)V", line = 25)
    public final void method236(int arg0, int arg1, class594 arg2, int arg3, int arg4) {
        field5102++;
        class183 var6 = (class183) arg2;
        int var7 = this.field5084 + arg1;
        class391 var8 = var6.field2791;
        int var9 = this.field5091 + arg0;
        this.field5077.method379(class577.field8511, 2068);
        this.field5085.method1125(2048);
        this.field5085.method1152(this.field5077, true);
        this.field5085.method1098(1, false);
        this.field5085.method1142(192, 1);
        class124 var10 = this.field5085.method1137(0);
        var10.method758((byte) 100, (float) this.field5096, 0.0F, (float) this.field5088);
        var10.method619(var9, var7, 0);
        this.field5085.method1099(0);
        class124 var11 = this.field5085.method1122((byte) 65);
        var11.method758((byte) 100, this.field5077.method565(-32442, (float) this.field5096), 1.0F, this.field5077.method569(-2297, (float) this.field5088));
        this.field5085.method1100(class235.field3452, -1);
        this.field5085.method1159(1, false);
        this.field5085.method1152(var8, true);
        this.field5085.method1102(class43.field527, class609.field8962, -1);
        this.field5085.method1160(0, (byte) -113, class352.field5118);
        class124 var12 = this.field5085.method1122((byte) 65);
        var12.method758((byte) 100, var8.method565(-32442, (float) this.field5096), 1.0F, var8.method569(-2297, (float) this.field5088));
        var12.method759(var8.method569(-2297, (float) (var7 - arg4)), var8.method565(-32442, (float) (var9 - arg3)), -31285, 0.0F);
        this.field5085.method1100(class235.field3452, -1);
        this.field5085.method1143(3160);
        this.field5085.method1109(5);
        this.field5085.method1160(0, (byte) -113, class248.field3625);
        this.field5085.method1102(class609.field8962, class609.field8962, -20);
        this.field5085.method1152(null, true);
        this.field5085.method1159(0, false);
        this.field5085.method1109(5);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)[Lhh;", line = 70)
    public static final class608[] method2141(int arg0) {
        if (arg0 != 3) {
            method2142(86, -114, (byte) 103);
        }
        field5070++;
        return new class608[] { class538.field7955, class538.field7959, class538.field7960, class538.field7961, class538.field7962, class538.field7963, class538.field7964, class538.field7965, class538.field7966, class538.field7967, class538.field7968, class538.field7969, class538.field7970, class538.field7971 };
    }

    @OriginalMember(owner = "client!cf", name = "BA", descriptor = "(III)V", line = 85)
    public final void method235(int arg0, int arg1, int arg2) {
        field5098++;
    }

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "(IIIIIII)V", line = 94)
    public final void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5093++;
        class124 var8 = this.field5085.method1137(0);
        class124 var9 = this.field5085.method1122((byte) 65);
        this.field5077.method379(class577.field8511, 2068);
        this.field5085.method1125(2048);
        this.field5085.method1152(this.field5077, true);
        this.field5085.method1098(arg6, false);
        this.field5085.method1142(192, arg4);
        this.field5085.method1160(1, (byte) -113, class455.field6635);
        this.field5085.method1097(-14186, class455.field6635, 1);
        this.field5085.method1168(arg5, (byte) -104);
        boolean var10 = this.field5078 && this.field5084 == 0 && this.field5104 == 0;
        boolean var11 = this.field5097 && this.field5091 == 0 && this.field5095 == 0;
        if ((var11 & var10)) {
            var9.method758((byte) 100, this.field5077.method565(-32442, (float) arg2), 1.0F, this.field5077.method569(-2297, (float) arg3));
            var8.method758((byte) 100, (float) arg2, 0.0F, (float) arg3);
            var8.method619(arg0, arg1, 0);
            this.field5085.method1100(class235.field3452, -1);
            this.field5085.method1099(0);
            this.field5085.method1143(3160);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method714();
            var9.method758((byte) 100, this.field5077.method565(-32442, (float) arg2), 1.0F, this.field5077.method569(-2297, (float) this.field5088));
            this.field5085.method1100(class235.field3452, -1);
            int var14 = this.field5084 + arg1;
            int var15 = var14 + this.field5088;
            while (var15 <= var12) {
                var8.method758((byte) 100, (float) arg2, 0.0F, (float) this.field5088);
                var8.method619(arg0, var14, 0);
                this.field5085.method1099(0);
                var15 += var13;
                this.field5085.method1143(3160);
                var14 += var13;
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method758((byte) 100, this.field5077.method565(-32442, (float) arg2), 1.0F, this.field5077.method569(-2297, (float) var16));
                this.field5085.method1100(class235.field3452, -1);
                var8.method758((byte) 100, (float) arg2, 0.0F, (float) var16);
                var8.method619(arg0, var14, 0);
                this.field5085.method1099(0);
                this.field5085.method1143(3160);
            }
        } else if (var10) {
            int var30 = arg0 + arg2;
            int var31 = this.method722();
            var9.method758((byte) 100, this.field5077.method565(-32442, (float) this.field5096), 1.0F, this.field5077.method569(-2297, (float) arg3));
            this.field5085.method1100(class235.field3452, -1);
            int var32 = arg0 + this.field5091;
            for (int var33 = this.field5096 + var32; var33 <= var30; var33 += var31) {
                var8.method758((byte) 100, (float) this.field5096, 0.0F, (float) arg3);
                var8.method619(var32, arg1, 0);
                this.field5085.method1099(0);
                var32 += var31;
                this.field5085.method1143(3160);
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method758((byte) 100, this.field5077.method565(-32442, (float) var34), 1.0F, this.field5077.method569(-2297, (float) arg3));
                this.field5085.method1100(class235.field3452, -1);
                var8.method758((byte) 100, (float) var34, 0.0F, (float) arg3);
                var8.method619(var32, arg1, 0);
                this.field5085.method1099(0);
                this.field5085.method1143(3160);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method722();
            int var20 = this.method714();
            int var21 = this.field5084 + arg1;
            for (int var22 = this.field5088 + var21; var22 <= var17; var22 += var20) {
                var9.method758((byte) 100, this.field5077.method565(-32442, (float) this.field5096), 1.0F, this.field5077.method569(-2297, (float) this.field5088));
                this.field5085.method1100(class235.field3452, -1);
                int var27 = this.field5091 + arg0;
                int var28 = this.field5096 + var27;
                while (var18 >= var28) {
                    var8.method758((byte) 100, (float) this.field5096, 0.0F, (float) this.field5088);
                    var8.method619(var27, var21, 0);
                    this.field5085.method1099(0);
                    var27 += var19;
                    var28 += var19;
                    this.field5085.method1143(3160);
                }
                if (var27 < var18) {
                    int var29 = var18 - var27;
                    var9.method758((byte) 100, this.field5077.method565(-32442, (float) var29), 1.0F, this.field5077.method569(-2297, (float) this.field5088));
                    this.field5085.method1100(class235.field3452, -1);
                    var8.method758((byte) 100, (float) var29, 0.0F, (float) this.field5088);
                    var8.method619(var27, var21, 0);
                    this.field5085.method1099(0);
                    this.field5085.method1143(3160);
                }
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method758((byte) 100, this.field5077.method565(-32442, (float) this.field5096), 1.0F, this.field5077.method569(-2297, (float) var23));
                this.field5085.method1100(class235.field3452, -1);
                int var24 = this.field5091 + arg0;
                int var25 = this.field5096 + var24;
                while (var18 >= var25) {
                    var8.method758((byte) 100, (float) this.field5096, 0.0F, (float) var23);
                    var8.method619(var24, var21, 0);
                    this.field5085.method1099(0);
                    var25 += var19;
                    this.field5085.method1143(3160);
                    var24 += var19;
                }
                if (var18 > var24) {
                    int var26 = var18 - var24;
                    var9.method758((byte) 100, this.field5077.method565(-32442, (float) var26), 1.0F, this.field5077.method569(-2297, (float) var23));
                    this.field5085.method1100(class235.field3452, -1);
                    var8.method758((byte) 100, (float) var26, 0.0F, (float) var23);
                    var8.method619(var24, var21, 0);
                    this.field5085.method1099(0);
                    this.field5085.method1143(3160);
                }
            }
        }
        this.field5085.method1109(5);
        this.field5085.method1160(1, (byte) -113, class352.field5118);
        this.field5085.method1097(-14186, class352.field5118, 1);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIB)Z", line = 298)
    public static final boolean method2142(int arg0, int arg1, byte arg2) {
        field5099++;
        if (arg2 != -96) {
            field5081 = null;
        }
        return class264.method1693(arg1, -126, arg0) & class647.method3735((byte) -111, arg0, arg1);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIII)V", line = 309)
    public static final void method2143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5092++;
        if (arg2 == arg4) {
            class595.method3455(arg6, arg0, false, arg1, arg5, arg4, arg7);
            return;
        }
        if (class130.field1712 <= (arg7 - arg4) && arg4 + arg7 <= class401.field5755 && (arg1 - arg2) >= class483.field7334 && class202.field3021 >= (arg1 + arg2)) {
            class558.method3269(arg1, arg5, 123, arg7, arg0, arg2, arg4, arg6);
        } else {
            class562.method3289(116, arg2, arg0, arg7, arg6, arg1, arg4, arg5);
        }
        if (arg3 != 1) {
            field5079 = -1;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(FFFFFFLpa;II)V", line = 333)
    public final void method712(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class594 arg6, int arg7, int arg8) {
        field5103++;
        class124 var10 = this.field5085.method1137(0);
        class124 var11 = this.field5085.method1122((byte) 65);
        class183 var12 = (class183) arg6;
        class391 var13 = var12.field2791;
        this.field5077.method379(class579.field8529, 2068);
        this.field5085.method1125(2048);
        this.field5085.method1152(this.field5077, true);
        this.field5085.method1098(1, false);
        this.field5085.method1142(192, 1);
        if (this.field5082) {
            float var14 = (float) this.field5096 / (float) this.method722();
            float var15 = (float) this.field5088 / (float) this.method714();
            var10.method748(1.0F, 0.0F, (arg2 - arg0) * var14, false, 0.0F, (arg5 - arg1) * var15, (arg4 - arg0) * var15, 0.0F, (arg3 - arg1) * var14, 0.0F);
            var10.method759(((float) this.field5084 + arg1) * var15, ((float) this.field5091 + arg0) * var14, -31285, 0.0F);
        } else {
            var10.method748(1.0F, 0.0F, arg2 - arg0, false, 0.0F, arg5 - arg1, arg4 - arg0, 0.0F, arg3 - arg1, 0.0F);
            var10.method759(arg1, arg0, -31285, 0.0F);
        }
        var11.method758((byte) 100, this.field5077.method565(-32442, (float) this.field5096), 1.0F, this.field5077.method569(-2297, (float) this.field5088));
        this.field5085.method1100(class235.field3452, -1);
        this.field5085.method1159(1, false);
        this.field5085.method1152(var13, true);
        this.field5085.method1102(class43.field527, class609.field8962, -89);
        this.field5085.method1160(0, (byte) -113, class352.field5118);
        class124 var16 = this.field5085.method1122((byte) 65);
        var16.method618(var10);
        var16.method619(-arg7, -arg8, 0);
        var16.method751(var13.method569(-2297, 1.0F), true, 1.0F, var13.method565(-32442, 1.0F));
        this.field5085.method1100(class235.field3452, -1);
        this.field5085.method1099(0);
        this.field5085.method1143(3160);
        this.field5085.method1109(5);
        this.field5085.method1160(0, (byte) -113, class248.field3625);
        this.field5085.method1102(class609.field8962, class609.field8962, -43);
        this.field5085.method1152(null, true);
        this.field5085.method1159(0, false);
        this.field5085.method1109(5);
    }

    @OriginalMember(owner = "client!cf", name = "KA", descriptor = "(IIII)V", line = 408)
    public final void method720(int arg0, int arg1, int arg2, int arg3) {
        this.field5095 = arg2;
        this.field5104 = arg3;
        this.field5084 = arg1;
        this.field5091 = arg0;
        field5101++;
        this.field5082 = this.field5091 != 0 || this.field5084 != 0 || this.field5095 != 0 || this.field5104 != 0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII[III)V", line = 423)
    private final void method2144(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field5077.method561(arg0, 12382, arg3, arg4, arg6, arg1, arg5, arg2);
        field5105++;
    }

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "(IIIIII)V", line = 434)
    public final void method231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5083++;
        int[] var7 = this.field5085.method327(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class313.method1926(var7[var8], -16777216);
            }
            this.method2144(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 457)
    public static void method2145(byte arg0) {
        field5071 = null;
        if (arg0 != -56) {
            method2145((byte) -121);
        }
        field5081 = null;
    }

    @OriginalMember(owner = "client!cf", name = "DA", descriptor = "(IIIII)V", line = 469)
    public final void method237(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5069++;
        class124 var6 = this.field5085.method1137(0);
        class124 var7 = this.field5085.method1122((byte) 65);
        int var8 = this.field5091 + arg0;
        int var9 = this.field5084 + arg1;
        this.field5077.method379(class577.field8511, 2068);
        this.field5085.method1125(2048);
        this.field5085.method1152(this.field5077, true);
        this.field5085.method1098(arg4, false);
        this.field5085.method1142(192, arg2);
        this.field5085.method1160(1, (byte) -113, class455.field6635);
        this.field5085.method1097(-14186, class455.field6635, 1);
        this.field5085.method1168(arg3, (byte) -114);
        var6.method758((byte) 100, (float) this.field5096, 0.0F, (float) this.field5088);
        var6.method619(var8, var9, 0);
        var7.method758((byte) 100, this.field5077.method565(-32442, (float) this.field5096), 1.0F, this.field5077.method569(-2297, (float) this.field5088));
        this.field5085.method1100(class235.field3452, -1);
        this.field5085.method1099(0);
        this.field5085.method1143(3160);
        this.field5085.method1109(5);
        this.field5085.method1160(1, (byte) -113, class352.field5118);
        this.field5085.method1097(-14186, class352.field5118, 1);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lkw;IIZ)V", line = 685)
    public class350(class174 arg0, int arg1, int arg2, boolean arg3) {
        this.field5096 = arg1;
        this.field5088 = arg2;
        this.field5085 = arg0;
        this.field5077 = arg0.method317(arg1, class629.field9208, arg3 ? class411.field5856 : class639.field9293, -120, arg2);
        this.field5094 = arg1 != this.field5077.method567(true);
        this.field5089 = this.field5077.method564(7427) != arg2;
        this.field5097 = !this.field5094 && this.field5077.method568(25992);
        this.field5078 = !this.field5089 && this.field5077.method568(25992);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lkw;II[III)V", line = 700)
    public class350(class174 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field5096 = arg1;
        this.field5085 = arg0;
        this.field5088 = arg2;
        this.field5077 = arg0.method285(arg5, arg3, arg1, arg2, false, (byte) 84, arg4);
        this.field5094 = this.field5077.method567(true) != arg1;
        this.field5089 = arg2 != this.field5077.method564(7427);
        this.field5097 = !this.field5094 && this.field5077.method568(25992);
        this.field5078 = !this.field5089 && this.field5077.method568(25992);
    }

    @OriginalMember(owner = "client!cf", name = "la", descriptor = "()I", line = 503)
    public final int method721() {
        field5075++;
        return this.field5088;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "()I", line = 511)
    public final int method718() {
        field5073++;
        return this.field5096;
    }

    @OriginalMember(owner = "client!cf", name = "CA", descriptor = "(FFFFFFIII)V", line = 524)
    public final void method724(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field5076++;
        class124 var10 = this.field5085.method1137(0);
        class124 var11 = this.field5085.method1122((byte) 65);
        this.field5077.method379(this.field5094 || this.field5089 ? class577.field8511 : class579.field8529, 2068);
        this.field5085.method1125(2048);
        this.field5085.method1152(this.field5077, true);
        this.field5085.method1098(arg8, false);
        this.field5085.method1142(192, arg6);
        this.field5085.method1160(1, (byte) -113, class455.field6635);
        this.field5085.method1097(-14186, class455.field6635, 1);
        this.field5085.method1168(arg7, (byte) -112);
        if (this.field5082) {
            float var12 = (float) this.method722();
            float var13 = (float) this.method714();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field5084 * var16;
            float var19 = (float) this.field5084 * var17;
            float var20 = (float) this.field5091 * var14;
            float var21 = (float) this.field5091 * var15;
            float var22 = (float) this.field5095 * -var14;
            float var23 = (float) this.field5095 * -var15;
            float var24 = (float) this.field5104 * -var16;
            arg4 = arg4 + var20 + var24;
            arg3 = arg3 + var23 + var19;
            arg2 = arg2 + var22 + var18;
            float var25 = (float) this.field5104 * -var17;
            arg1 = arg1 + var21 + var19;
            arg0 = arg0 + var20 + var18;
            arg5 = arg5 + var21 + var25;
        }
        var10.method748(1.0F, 0.0F, arg2 - arg0, false, 0.0F, arg5 - arg1, -arg0 + arg4, 0.0F, arg3 - arg1, 0.0F);
        var10.method759(arg1, arg0, -31285, 0.0F);
        var11.method758((byte) 100, this.field5077.method565(-32442, (float) this.field5096), 1.0F, this.field5077.method569(-2297, (float) this.field5088));
        this.field5085.method1100(class235.field3452, -1);
        this.field5085.method1099(0);
        this.field5085.method1143(3160);
        this.field5085.method1109(5);
        this.field5085.method1160(1, (byte) -113, class352.field5118);
        this.field5085.method1097(-14186, class352.field5118, 1);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BIII[BI)V", line = 593)
    public static final void method2146(byte arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field5074++;
        if (arg1 <= arg5) {
            return;
        }
        int var6 = arg2 + arg5;
        int var7 = arg1 - arg5 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg1 - arg5 & 0x3;
                if (arg0 != -5) {
                    field5086 = 120;
                }
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg4[var6++] = 1;
                }
            }
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!cf", name = "EA", descriptor = "()I", line = 627)
    public final int method722() {
        field5100++;
        return this.field5096 + this.field5091 + this.field5095;
    }

    @OriginalMember(owner = "client!cf", name = "ma", descriptor = "()I", line = 636)
    public final int method714() {
        field5080++;
        return this.field5088 + this.field5084 + this.field5104;
    }

    @OriginalMember(owner = "client!cf", name = "ra", descriptor = "(IIIIIII)V", line = 645)
    public final void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5072++;
        class124 var8 = this.field5085.method1137(0);
        class124 var9 = this.field5085.method1122((byte) 65);
        this.field5077.method379(this.field5094 || this.field5089 ? class577.field8511 : class579.field8529, 2068);
        this.field5085.method1125(2048);
        this.field5085.method1152(this.field5077, true);
        this.field5085.method1098(arg6, false);
        this.field5085.method1142(192, arg4);
        this.field5085.method1160(1, (byte) -113, class455.field6635);
        this.field5085.method1097(-14186, class455.field6635, 1);
        this.field5085.method1168(arg5, (byte) -119);
        var9.method758((byte) 100, this.field5077.method565(-32442, (float) this.field5096), 1.0F, this.field5077.method569(-2297, (float) this.field5088));
        if (this.field5082) {
            arg2 = this.field5096 * arg2 / this.method722();
            arg3 = this.field5088 * arg3 / this.method714();
            arg1 += this.field5084 * arg3 / this.field5088;
            arg0 += this.field5091 * arg2 / this.field5096;
        }
        var8.method758((byte) 100, (float) arg2, 0.0F, (float) arg3);
        var8.method619(arg0, arg1, 0);
        this.field5085.method1100(class235.field3452, -1);
        this.field5085.method1099(0);
        this.field5085.method1143(3160);
        this.field5085.method1109(5);
        this.field5085.method1160(1, (byte) -113, class352.field5118);
        this.field5085.method1097(-14186, class352.field5118, 1);
    }
}
