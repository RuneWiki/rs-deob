import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class81 extends class431 {

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
    private int field1177;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    private int field1175;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    private int field1173;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    private int field1179;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    private int field1170;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
    public int field1185;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    public static int field1178 = -1;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)Z")
    public final boolean method680(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.field1182 = 55;
        }
        field1171++;
        return arg2 >= this.field1182 && arg2 <= this.field1185 && arg1 >= this.field1180 && this.field1176 >= arg1;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II[II)V")
    public final void method681(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[1] = -this.field1177 - (-this.field1182 - arg0);
        arg2[0] = 0;
        if (arg1 != 10714) {
            this.method687(-4, 75, -107, (byte) -63);
        }
        arg2[2] = arg3 + this.field1180 - this.field1170;
        field1174++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "([IIII)V")
    public final void method682(int[] arg0, int arg1, int arg2, int arg3) {
        arg0[2] = arg1 + this.field1170 - this.field1180;
        field1183++;
        arg0[1] = this.field1177 + arg2 - this.field1182;
        if (arg3 == 1839) {
            arg0[0] = this.field1175;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIILqv;Lqv;)V")
    public static final void method683(int arg0, int arg1, int arg2, class312 arg3, class312 arg4) {
        class138 var5 = class297.method1929(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field2114 = arg3;
            var5.field2104 = arg4;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)V")
    public static final void method684(byte arg0, int arg1) {
        class508.field7444.method91(92, arg1);
        int var2 = 45 % ((-arg0 - 79) / 33);
        field1186++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BII)Z")
    public final boolean method685(byte arg0, int arg1, int arg2) {
        field1184++;
        int var4 = -14 % ((53 - arg0) / 32);
        return arg1 >= this.field1177 && arg1 <= this.field1179 && this.field1170 <= arg2 && this.field1173 >= arg2;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1172++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg4 - arg3;
        int var12 = arg2 - arg3;
        if (arg1 < 9) {
            return;
        }
        int var13 = arg4 * arg4;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        if (arg7 >= class404.field5987 && class433.field6414 >= arg7) {
            int[] var38 = class416.field6200[arg7];
            int var39 = class385.method2403(class184.field2777, class327.field4931, arg6 - arg4, true);
            int var40 = class385.method2403(class184.field2777, class327.field4931, arg6 + arg4, true);
            int var41 = class385.method2403(class184.field2777, class327.field4931, arg6 - var11, true);
            int var42 = class385.method2403(class184.field2777, class327.field4931, arg6 + var11, true);
            class359.method2255((byte) -91, var38, var41, var39, arg5);
            class359.method2255((byte) -66, var38, var42, var41, arg0);
            class359.method2255((byte) -87, var38, var40, var42, arg5);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var25 += -var43;
                var26 += -var34;
                var43 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var9--;
            var32 -= var27;
            int var45 = arg7 - var9;
            int var46 = arg7 + var9;
            if (class404.field5987 <= var46 && class433.field6414 >= var45) {
                int var47 = class385.method2403(class184.field2777, class327.field4931, arg6 + var8, true);
                int var48 = class385.method2403(class184.field2777, class327.field4931, arg6 - var8, true);
                if (var44) {
                    int var49 = class385.method2403(class184.field2777, class327.field4931, arg6 + var10, true);
                    int var50 = class385.method2403(class184.field2777, class327.field4931, arg6 - var10, true);
                    if (class404.field5987 <= var45) {
                        int[] var51 = class416.field6200[var45];
                        class359.method2255((byte) -112, var51, var50, var48, arg5);
                        class359.method2255((byte) -77, var51, var49, var50, arg0);
                        class359.method2255((byte) -83, var51, var47, var49, arg5);
                    }
                    if (class433.field6414 >= var46) {
                        int[] var52 = class416.field6200[var46];
                        class359.method2255((byte) -73, var52, var50, var48, arg5);
                        class359.method2255((byte) -65, var52, var49, var50, arg0);
                        class359.method2255((byte) -107, var52, var47, var49, arg5);
                    }
                } else {
                    if (class404.field5987 <= var45) {
                        class359.method2255((byte) -81, class416.field6200[var45], var47, var48, arg5);
                    }
                    if (var46 <= class433.field6414) {
                        class359.method2255((byte) -124, class416.field6200[var46], var47, var48, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIB)Z")
    public final boolean method687(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 9) {
            this.field1185 = -54;
        }
        field1181++;
        return this.field1175 == arg1 && this.field1177 <= arg2 && arg2 <= this.field1179 && arg0 >= this.field1170 && this.field1173 >= arg0;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field1182 = arg5;
        this.field1180 = arg6;
        this.field1177 = arg1;
        this.field1175 = arg0;
        this.field1173 = arg4;
        this.field1176 = arg8;
        this.field1179 = arg3;
        this.field1170 = arg2;
        this.field1185 = arg7;
    }
}
