import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class127 extends class629 {

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    private int field2122;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    private int field2124;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    private int field2125;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
    private int field2131;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "Lcu;")
    public static class206 field2134 = new class206(42, 3);

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "Z")
    public static boolean field2140 = false;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    private int field2129;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
    private int field2130;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "I")
    private int field2138;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "I")
    private int field2139;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "[B")
    private byte[] field2133;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 4)
    public final void method974(int arg0) {
        if (arg0 != 4) {
            method981(79, 5, -69);
        }
        this.field2129 = 0;
        field2135++;
        this.field2130 = 0;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([IZII[Ljava/lang/Object;)V", line = 21)
    public static final void method975(int[] arg0, boolean arg1, int arg2, int arg3, Object[] arg4) {
        field2126++;
        if (arg1 || arg2 >= arg3) {
            return;
        }
        int var5 = (arg2 + arg3) / 2;
        int var6 = arg2;
        int var7 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var7;
        Object var8 = arg4[var5];
        arg4[var5] = arg4[arg3];
        arg4[arg3] = var8;
        int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
        for (int var10 = arg2; var10 < arg3; var10++) {
            if (((var9 & var10) + var7) > arg0[var10]) {
                int var11 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6] = var11;
                Object var12 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6++] = var12;
            }
        }
        arg0[arg3] = arg0[var6];
        arg0[var6] = var7;
        arg4[arg3] = arg4[var6];
        arg4[var6] = var8;
        method975(arg0, false, arg2, var6 - 1, arg4);
        method975(arg0, false, var6 + 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(IIIIIFFF)V", line = 78)
    public class127(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2122 = (int) (arg7 * 4096.0F);
        this.field2124 = (int) (arg6 * 4096.0F);
        this.field2131 = this.field2125 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)V", line = 92)
    public static void method976(byte arg0) {
        if (arg0 <= 65) {
            field2134 = null;
        }
        field2134 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lst;Lcea;III)V", line = 102)
    public static final void method977(class403 arg0, class201 arg1, int arg2, int arg3, int arg4) {
        field2127++;
        if ((arg2 & 0x1) != 0) {
            int[] var5 = new int[4];
            for (int var6 = 0; var6 < 4; var6++) {
                var5[var6] = arg1.method1996(false);
                if (var5[var6] == 65535) {
                    var5[var6] = -1;
                }
            }
            int var7 = arg1.method2028(true);
            class633.method3495(arg0, var7, -1, var5);
        }
        if (arg3 != 31136) {
            field2134 = null;
        }
        byte var8 = -1;
        if ((arg2 & 0x20000) != 0) {
            int var9 = class642.field8626;
            int var10 = arg1.method1997(arg3 ^ 0xFFFF86DF);
            int var11 = arg1.method2033(arg3 - 26085);
            arg0.method2362(var9, var10, -99, var11);
        }
        if ((arg2 & 0x4) != 0) {
            int var12 = arg1.method1997(-129);
            int var13 = arg1.method2034(255);
            arg0.method2362(class642.field8626, var12, arg3 ^ 0xFFFF863B, var13);
            arg0.field5603 = class642.field8626 + 300;
            arg0.field5636 = arg1.method2033(5051);
        }
        if ((arg2 & 0x800) != 0) {
            int var14 = arg1.method1996(false);
            arg0.field5626 = arg1.method2033(5051);
            arg0.field5625 = arg1.method2046((byte) 120);
            arg0.field5621 = (var14 & 0x8000) != 0;
            arg0.field5585 = var14 & 0x7FFF;
            arg0.field5550 = class642.field8626 + arg0.field5585 + arg0.field5626;
        }
        if ((arg2 & 0x2000) != 0) {
            arg0.field5394 = arg1.method2028(true) == 1;
        }
        if ((arg2 & 0x400) != 0) {
            arg0.field5587 = arg1.method2029((byte) -105);
            if (arg0.field5587.charAt(0) == '~') {
                arg0.field5587 = arg0.field5587.substring(1);
                class135.method1011(arg0.method2316(true, (byte) 110), arg0.field5378, arg0.field5587, 2, arg0.method2311(false, arg3 + 460), 0, -59);
            } else if (class199.field2897 == arg0) {
                class135.method1011(arg0.method2316(true, (byte) 114), arg0.field5378, arg0.field5587, 2, arg0.method2311(false, 31596), 0, arg3 - 31167);
            }
            arg0.field5599 = 150;
            arg0.field5597 = 0;
            arg0.field5558 = 0;
        }
        if ((arg2 & 0x10000) != 0) {
            arg0.field5594 = arg1.method2044(-104);
            arg0.field5571 = arg1.method2000(true);
            arg0.field5604 = arg1.method2000(true);
            arg0.field5555 = (byte) arg1.method2028(true);
            arg0.field5583 = class642.field8626 + arg1.method2001((byte) -83);
            arg0.field5549 = class642.field8626 + arg1.method2013(121);
        }
        if ((arg2 & 0x1000) != 0) {
            arg0.field5589 = arg1.method2023((byte) 46);
            arg0.field5578 = arg1.method2023((byte) 46);
            arg0.field5632 = arg1.method2044(100);
            arg0.field5601 = arg1.method2040(-102);
            arg0.field5548 = arg1.method2013(-73) + class642.field8626;
            arg0.field5610 = arg1.method2001((byte) -83) + class642.field8626;
            arg0.field5627 = arg1.method2034(arg3 ^ 0x795F);
            arg0.field5641 = 0;
            if (arg0.field5386) {
                arg0.field5589 += arg0.field5373;
                arg0.field5601 += arg0.field5389;
                arg0.field5578 += arg0.field5389;
                arg0.field5632 += arg0.field5373;
                arg0.field5642 = 0;
            } else {
                arg0.field5601 += arg0.field5649[0];
                arg0.field5589 += arg0.field5643[0];
                arg0.field5642 = 1;
                arg0.field5578 += arg0.field5649[0];
                arg0.field5632 += arg0.field5643[0];
            }
        }
        if ((arg2 & 0x4000) != 0) {
            int var15 = arg1.method2046((byte) 52);
            int[] var16 = new int[var15];
            int[] var17 = new int[var15];
            int[] var18 = new int[var15];
            for (int var19 = 0; var19 < var15; var19++) {
                int var20 = arg1.method2024((byte) 39);
                if (var20 == 65535) {
                    var20 = -1;
                }
                var16[var19] = var20;
                var17[var19] = arg1.method2034(255);
                var18[var19] = arg1.method2013(120);
            }
            class362.method2140(arg3 ^ 0x79A0, var17, var18, arg0, var16);
        }
        if ((arg2 & 0x100) != 0) {
            int var21 = arg1.method2024((byte) 100);
            if (var21 == 65535) {
                var21 = -1;
            }
            int var22 = arg1.method1992(-121);
            int var23 = arg1.method2028(true);
            arg0.method2350(var22, var21, var23, (byte) -34, true);
        }
        if ((arg2 & 0x200) != 0) {
            var8 = arg1.method2044(-111);
        }
        if ((arg2 & 0x2) != 0) {
            int var24 = arg1.method2046((byte) 114);
            byte[] var25 = new byte[var24];
            class335 var26 = new class335(var25);
            arg1.method2005(0, var24, var25, -4);
            class131.field2156[arg4] = var26;
            arg0.method2318(var26, 795);
        }
        if ((arg2 & 0x10) != 0) {
            int var27 = arg1.method2013(-125);
            if (var27 == 65535) {
                var27 = -1;
            }
            arg0.field5551 = var27;
        }
        if ((arg2 & 0x80) != 0) {
            arg0.field5364 = arg1.method1996(false);
            if (arg0.field5642 == 0) {
                arg0.method2360(arg3 - 31016, arg0.field5364);
                arg0.field5364 = -1;
            }
        }
        if ((arg2 & 0x8) != 0) {
            int var28 = arg1.method2024((byte) 85);
            int var29 = arg1.method2045(-98);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var30 = arg1.method2034(255);
            arg0.method2350(var29, var28, var30, (byte) -59, false);
        }
        if ((arg2 & 0x40) != 0) {
            class425.field5841[arg4] = arg1.method2000(true);
        }
        if (!arg0.field5386) {
            return;
        }
        if (var8 == 127) {
            arg0.method2314(arg0.field5389, 0, arg0.field5373);
            return;
        }
        byte var31;
        if (var8 == -1) {
            var31 = class425.field5841[arg4];
        } else {
            var31 = var8;
        }
        arg0.method2315(arg0.field5373, arg3 - 31136, var31, arg0.field5389);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZI)V", line = 372)
    public final void method978(int arg0, boolean arg1, int arg2) {
        if (arg0 == 0) {
            this.field2139 = this.field2124 - (arg2 >= 0 ? arg2 : -arg2);
            this.field2139 = this.field2139 * this.field2139 >> 12;
            this.field2138 = 4096;
            this.field2129 = this.field2139;
        } else {
            this.field2138 = this.field2139 * this.field2122 >> 12;
            this.field2139 = this.field2124 - (arg2 >= 0 ? arg2 : -arg2);
            if (this.field2138 < 0) {
                this.field2138 = 0;
            } else if (this.field2138 > 4096) {
                this.field2138 = 4096;
            }
            this.field2139 = this.field2139 * this.field2139 >> 12;
            this.field2139 = this.field2139 * this.field2138 >> 12;
            this.field2129 += this.field2139 * this.field2131 >> 12;
            this.field2131 = this.field2131 * this.field2125 >> 12;
        }
        field2136++;
        if (arg1) {
            this.method974(-102);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIB)V", line = 409)
    public void method979(int arg0, int arg1, byte arg2) {
        if (arg1 != -1) {
            this.method978(-120, false, -67);
        }
        field2123++;
        this.field2133[arg0] = arg2;
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)V", line = 422)
    public final void method980(int arg0) {
        this.field2131 = this.field2125;
        field2132++;
        this.field2129 >>= 0x4;
        if (this.field2129 < 0) {
            this.field2129 = 0;
        } else if (this.field2129 > 255) {
            this.field2129 = 255;
        }
        this.method979(this.field2130++, -1, (byte) this.field2129);
        int var2 = -127 % ((arg0 + 43) / 42);
        this.field2129 = 0;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)B", line = 442)
    public static final byte method981(int arg0, int arg1, int arg2) {
        if (arg1 >= -57) {
            method976((byte) 60);
        }
        field2128++;
        if (arg0 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
