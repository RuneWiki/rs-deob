import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class443 extends class478 {

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    private int field6258 = 585;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "Z")
    public static boolean field6260 = false;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "Lcq;")
    public static class110 field6254 = new class110(80, -1);

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "Ljava/lang/String;")
    public static String field6259;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)[I", line = 3)
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != -11323) {
            this.field6258 = 91;
        }
        ++field6252;
        int[] var3 = super.field6886.method789(arg0, (byte) 123);
        if (super.field6886.field1592) {
            int var4 = class695.field9740[arg0];
            for (int var5 = 0; class436.field6154 > var5; ++var5) {
                int var6 = class684.field9645[var5];
                if (var6 > this.field6258 && ~var6 > ~(4096 - this.field6258) && -this.field6258 + 2048 < var4 && 2048 - -this.field6258 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field6258 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (-this.field6258 + 2048 < var6 && ~var6 > ~(2048 - -this.field6258)) {
                    int var11 = var4 - 2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field6258;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field6258);
                } else if (var4 >= this.field6258 && ~var4 >= ~(-this.field6258 + 4096)) {
                    if (~var6 <= ~this.field6258 && var6 <= -this.field6258 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field6258 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field6258;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field6258 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)V", line = 87)
    public static final void method2566(int arg0, int arg1, int arg2, int arg3) {
        ++field6255;
        int var4 = class26.field245 + arg1;
        int var5 = class231.field2860 + arg0;
        if (class487.field7044 != null && arg1 >= 0 && ~arg0 <= -1 && ~class142.field1574 < ~arg1 && ~class140.field1550 < ~arg0) {
            if (class639.field9075.method2641(class430.field6109, (byte) 34) || ~class362.field4859.field5166 == ~arg3) {
                long var6 = (long) (var5 << 14 | arg3 << 28 | var4);
                class310 var8 = (class310) class200.field2354.method3669(var6, arg2 ^ 2098890838);
                if (var8 == null) {
                    class240.method1430(arg3, arg1, arg0);
                } else {
                    class190 var9 = (class190) var8.field3833.method3434((byte) 2);
                    if (var9 == null) {
                        class240.method1430(arg3, arg1, arg0);
                    } else if (arg2 == -2098890839) {
                        class696 var10 = (class696) class240.method1430(arg3, arg1, arg0);
                        if (var10 == null) {
                            var10 = new class696(arg1 << 9, class156.field1743[arg3].method1608(arg0, 840, arg1), arg0 << 9, arg3, arg3);
                        } else {
                            var10.field9770 = var10.field9761 = -1;
                        }
                        var10.field9765 = var9.field2177;
                        var10.field9769 = var9.field2179;
                        label61: while (true) {
                            class190 var11 = (class190) var8.field3833.method3430(true);
                            if (var11 == null) {
                                break;
                            }
                            if (~var10.field9765 != ~var11.field2177) {
                                var10.field9771 = var11.field2179;
                                var10.field9770 = var11.field2177;
                                while (true) {
                                    class190 var12 = (class190) var8.field3833.method3430(true);
                                    if (var12 == null) {
                                        break label61;
                                    }
                                    if (~var10.field9765 != ~var12.field2177 && ~var10.field9770 != ~var12.field2177) {
                                        var10.field9768 = var12.field2179;
                                        var10.field9761 = var12.field2177;
                                    }
                                }
                            }
                        }
                        int var13 = class593.method3335((arg0 << 9) - -256, arg3, 27648, (arg1 << 9) + 256);
                        var10.field5178 = var13;
                        var10.field9758 = 0;
                        var10.field5166 = (byte) arg3;
                        var10.field5176 = arg0 << 9;
                        var10.field5179 = arg1 << 9;
                        var10.field5169 = (byte) arg3;
                        if (class568.method3221(arg0, arg1, 0)) {
                            ++var10.field5169;
                        }
                        class238.method1424(arg3, arg1, arg0, var13, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILnp;I)V", line = 186)
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (arg0 == 255) {
            if (arg2 == 0) {
                this.field6258 = arg1.method643((byte) -77);
            }
            ++field6257;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V", line = 218)
    public static final void method2567(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 == 16767564) {
            ++field6256;
            if (arg4 <= arg0) {
                class315.method1809(class557.field7954[arg1], arg2, -128, arg4, arg0);
            } else {
                class315.method1809(class557.field7954[arg1], arg2, arg3 ^ -16767540, arg0, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([IIIIIIII)V", line = 237)
    public static final void method2568(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6251;
        if (arg1 > 0 && !class483.method2792(arg1, arg5 ^ -29913)) {
            throw new IllegalArgumentException("");
        } else if (~arg3 < -1 && !class483.method2792(arg3, -3)) {
            throw new IllegalArgumentException("");
        } else if (~arg4 != -32994) {
            throw new IllegalArgumentException("");
        } else {
            int var8 = 0;
            int var9 = arg3 > arg1 ? arg1 : arg3;
            int var10 = arg1 >> 1;
            int var11 = arg3 >> 1;
            if (arg5 != 29914) {
                field6254 = null;
            }
            int[] var12 = arg0;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg7, var8, arg6, arg1, arg3, 0, arg4, arg2, var12, 0);
                if (~var9 >= -2) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = var15 - -arg1;
                int[] var17 = var13;
                for (int var18 = 0; ~var11 < ~var18; ++var18) {
                    for (int var19 = 0; ~var10 < ~var19; ++var19) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = 255 & var20 >> 24;
                        int var24 = var20 & 255;
                        int var25 = var12[var16++];
                        int var26 = 255 & var20 >> 8;
                        int var27 = (16733217 & var20) >> 16;
                        int var28 = (var22 & 255) + var24;
                        int var29 = ((var22 & 16767564) >> 16) + var27;
                        int var30 = (var22 >> 24 & 255) + var23;
                        int var31 = (var22 >> 8 & 255) + var26;
                        int var32 = (var21 & 255) + var28;
                        int var33 = (255 & var21 >> 16) + var29;
                        int var34 = ((65367 & var21) >> 8) + var31;
                        int var35 = (255 & var21 >> 24) + var30;
                        int var36 = (var25 & 255) + var32;
                        int var37 = (var25 >> 8 & 255) + var34;
                        int var38 = (var25 >> 24 & 255) + var35;
                        int var39 = (var25 >> 16 & 255) + var33;
                        var13[var14++] = class422.method2436(class105.method572(1020, var36) >> 2, class422.method2436(class105.method572(var37 << 6, 65280), class422.method2436(class105.method572(1020, var39) << 14, class105.method572(var38, 1020) << 22)));
                    }
                    var16 += arg1;
                    var15 += arg1;
                }
                var13 = var12;
                arg3 = var11;
                arg1 = var10;
                var12 = var17;
                var11 >>= 1;
                var10 >>= 1;
                var9 >>= 1;
                ++var8;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(III)I", line = 345)
    public static final int method2569(int arg0, int arg1, int arg2) {
        if (arg2 != 255) {
            field6254 = null;
        }
        ++field6250;
        int var3 = 0;
        while (~arg0 < -1) {
            var3 = var3 << 1 | arg1 & 1;
            --arg0;
            arg1 >>>= 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V", line = 386)
    public class443() {
        super(0, true);
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 375)
    public static void method2570(int arg0) {
        field6259 = null;
        if (arg0 != 0) {
            method2567(110, -26, 72, 100, 69);
        }
        field6254 = null;
    }
}
