import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class343 extends class114 {

    @OriginalMember(owner = "client!pn", name = "H", descriptor = "I")
    private int field5320;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
    private int field5316;

    @OriginalMember(owner = "client!pn", name = "I", descriptor = "I")
    private int field5321;

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "I")
    private int field5310;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
    public static int field5317 = 0;

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "I")
    private int field5312;

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "I")
    private int field5314;

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!pn", name = "J", descriptor = "I")
    private int field5322;

    @OriginalMember(owner = "client!pn", name = "K", descriptor = "I")
    private int field5323;

    @OriginalMember(owner = "client!pn", name = "L", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!pn", name = "M", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "Z")
    public static boolean field5307;

    @OriginalMember(owner = "client!pn", name = "y", descriptor = "[B")
    private byte[] field5311;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V", line = 7)
    public final void method286(int arg0, int arg1, int arg2) {
        if (arg0 <= 31) {
            return;
        }
        if (arg1 == 0) {
            this.field5323 = 4096;
            this.field5322 = this.field5316 - (arg2 >= 0 ? arg2 : -arg2);
            this.field5322 = this.field5322 * this.field5322 >> 12;
            this.field5312 = this.field5322;
        } else {
            this.field5323 = this.field5322 * this.field5320 >> 12;
            this.field5322 = this.field5316 - (arg2 >= 0 ? arg2 : -arg2);
            if (this.field5323 < 0) {
                this.field5323 = 0;
            } else if (this.field5323 > 4096) {
                this.field5323 = 4096;
            }
            this.field5322 = this.field5322 * this.field5322 >> 12;
            this.field5322 = this.field5323 * this.field5322 >> 12;
            this.field5312 += this.field5322 * this.field5310 >> 12;
            this.field5310 = this.field5321 * this.field5310 >> 12;
        }
        field5315++;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)I", line = 42)
    public static final int method2372(int arg0, int arg1) {
        if (arg0 != 0) {
            field5318 = -88;
        }
        field5313++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(IIIIIFFF)V", line = 53)
    public class343(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field5320 = (int) (arg7 * 4096.0F);
        this.field5316 = (int) (arg6 * 4096.0F);
        this.field5310 = this.field5321 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIII)V", line = 69)
    public static final void method2373(int arg0, int arg1, int arg2, int arg3) {
        field5324++;
        class188 var4 = class147.method1111(-19, arg0, arg3);
        var4.method1392((byte) -48);
        var4.field2959 = arg1;
        var4.field2954 = arg2;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(IB)V", line = 82)
    public void method906(int arg0, byte arg1) {
        this.field5311[arg0] = arg1;
        field5319++;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V", line = 92)
    public final void method288(byte arg0) {
        this.field5310 = this.field5321;
        if (arg0 <= 112) {
            this.field5310 = -119;
        }
        this.field5312 >>= 0x4;
        if (this.field5312 < 0) {
            this.field5312 = 0;
        } else if (this.field5312 > 255) {
            this.field5312 = 255;
        }
        this.method906(this.field5314++, (byte) this.field5312);
        this.field5312 = 0;
        field5325++;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIILr;Lbd;IIZIIIII)Lr;", line = 116)
    public static final class74 method2374(int arg0, int arg1, int arg2, int arg3, class74 arg4, class28 arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        long var14 = ((long) arg1 << 48) + (long) ((arg3 << 24) + (arg13 << 16) + arg10) + ((long) arg9 << 32);
        field5308++;
        class74 var16 = (class74) class149.field2251.method747(var14, (byte) 79);
        if (var16 == null) {
            byte var17;
            if (arg10 == 1) {
                var17 = 9;
            } else if (arg10 == 2) {
                var17 = 12;
            } else if (arg10 == 3) {
                var17 = 15;
            } else if (arg10 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class128 var20 = new class128(var17 * var18 + 1, var17 * 2 * var18 + -var17, 0);
            int[][] var21 = new int[var18][var17];
            int var22 = var20.method975(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var19[var23];
                int var25 = var19[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = arg7 + (class164.field2650[var27] * var24) >> 16;
                    int var29 = class164.field2664[var27] * var25 + arg2 >> 16;
                    var21[var23][var26] = var20.method975(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg3 * var31 + arg13 * var32 >> 8);
                short var34 = (short) (((arg1 & 0x7F) * var31 + (arg9 & 0x7F) * var32 & 0x7F00) + ((arg1 & 0xFC00) * var31 + (arg9 & 0xFC00) * var32 & 0xFC0000) + ((arg1 & 0x380) * var31 + (arg9 & 0x380) * var32 & 0x38000) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method960(var22, var21[0][(var35 + 1) % var17], var21[0][var35], (byte) 1, var34, var33);
                    } else {
                        var20.method960(var21[var30 - 1][var35], var21[var30 - 1][(var35 + 1) % var17], var21[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var20.method960(var21[var30 - 1][var35], var21[var30][(var35 + 1) % var17], var21[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var20.method967(64, 768, -50, -10, -50);
            class149.field2251.method744(var16, arg0 ^ 0xFFFFC2B7, var14);
        }
        int var36 = arg10 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        if (arg8) {
            if (arg11 > 640 && arg11 < 1408) {
                var40 = var36 + 128;
            }
            if (arg11 > 1664 || arg11 < 384) {
                var37 -= 128;
            }
            if (arg11 > 128 && arg11 < 896) {
                var38 -= 128;
            }
            if (arg11 > 1152 && arg11 < 1920) {
                var39 = var36 + 128;
            }
        }
        int var41 = arg4.method582();
        int var42 = arg4.method575();
        if (var38 > var41) {
            var41 = var38;
        }
        int var43 = arg4.method587();
        if (var43 < var37) {
            var43 = var37;
        }
        if (var42 > var39) {
            var42 = var39;
        }
        int var44 = arg4.method583();
        if (var44 > var40) {
            var44 = var40;
        }
        class10 var45 = null;
        if (arg5 != null) {
            int var46 = arg5.field312[arg6];
            var45 = class110.method839(var46 >> 16, arg0 ^ 0xFFFFFF91);
            arg6 = var46 & 0xFFFF;
        }
        class74 var47;
        if (var45 == null) {
            var47 = var16.method591(true, true, true);
            var47.method588((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method567((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method591(!var45.method93(arg6, (byte) -115), !var45.method90(arg6, 117), true);
            var47.method588((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method567((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method561(var45, arg6);
        }
        if (arg11 != 0) {
            var47.method579(arg11);
        }
        if (arg0 != 3) {
            field5307 = true;
        }
        if (class73.field1058) {
            class140 var50 = (class140) var47;
            if (arg12 != class328.method2291(class265.field4112, arg2 + var43, arg7 + var41, arg0 + 122) || arg12 != class328.method2291(class265.field4112, arg2 + var44, arg7 + var42, 89)) {
                for (int var51 = 0; var51 < var50.field2132; var51++) {
                    var50.field2102[var51] += class328.method2291(class265.field4112, var50.field2128[var51] + arg2, var50.field2131[var51] + arg7, 116) - arg12;
                }
                var50.field2101.field488 = false;
                var50.field2104.field3547 = false;
            }
        } else {
            class113 var48 = (class113) var47;
            if (class328.method2291(class265.field4112, arg2 + var43, arg7 + var41, 113) != arg12 || arg12 != class328.method2291(class265.field4112, arg2 + var44, arg7 - -var42, 118)) {
                for (int var49 = 0; var49 < var48.field1700; var49++) {
                    var48.field1718[var49] += class328.method2291(class265.field4112, var48.field1720[var49] + arg2, var48.field1735[var49] + arg7, 123) - arg12;
                }
                var48.field1711 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V", line = 341)
    public final void method285(int arg0) {
        this.field5314 = 0;
        if (arg0 != 255) {
            this.method288((byte) 103);
        }
        field5309++;
        this.field5312 = 0;
    }
}
