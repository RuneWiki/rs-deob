import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class122 extends class308 {

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "Lgb;")
    public class92 field1822;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "J")
    public static long field1819 = 0L;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lnm;IIB)[Lle;", line = 4)
    public static final class137[] method793(class221 arg0, int arg1, int arg2, byte arg3) {
        field1820++;
        if (class334.method2361(arg1, arg0, 16836, arg2)) {
            if (arg3 != 114) {
                method796(-35, (byte) -43, -34, 0);
            }
            return class185.method1280((byte) 43);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIII)V", line = 18)
    public static final void method794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1823++;
        if (arg5 != -10991) {
            field1819 = -83L;
        }
        if (arg0 < 1 || arg2 < 1 || arg0 > 102 || arg2 > 102) {
            return;
        }
        if (!class261.method1836(0) && (class148.field2392[0][arg0][arg2] & 0x2) == 0) {
            int var8 = arg6;
            if ((class148.field2392[arg6][arg0][arg2] & 0x8) != 0) {
                var8 = 0;
            }
            if (class119.field1760 != var8) {
                return;
            }
        }
        int var9 = arg6;
        if (arg6 < 3 && (class148.field2392[1][arg0][arg2] & 0x2) == 2) {
            var9 = arg6 + 1;
        }
        class259.method1829(var9, arg2, arg6, arg0, arg7, class124.field1860[arg6], (byte) -68);
        if (arg4 >= 0) {
            boolean var10 = class118.field1725;
            class118.field1725 = true;
            client.method899(false, arg1, arg4, var9, arg3, false, arg0, arg6, 0, arg2, class124.field1860[arg6]);
            class118.field1725 = var10;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lud;IIIIIIIZ)V", line = 81)
    public static final void method795(class20 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class244.field3847;
        int var11;
        int var12 = var11 = (arg7 << 7) - class228.field3584;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class101.field1457[arg1][arg6][arg7] - class65.field959;
        int var18 = class101.field1457[arg1][arg6 + 1][arg7] - class65.field959;
        int var19 = class101.field1457[arg1][arg6 + 1][arg7 + 1] - class65.field959;
        int var20 = class101.field1457[arg1][arg6][arg7 + 1] - class65.field959;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class272.field4466;
        int var46 = (var24 << 9) / var25 + class272.field4481;
        int var47 = (var27 << 9) / var31 + class272.field4466;
        int var48 = (var30 << 9) / var31 + class272.field4481;
        int var49 = (var33 << 9) / var37 + class272.field4466;
        int var50 = (var36 << 9) / var37 + class272.field4481;
        int var51 = (var39 << 9) / var43 + class272.field4466;
        int var52 = (var42 << 9) / var43 + class272.field4481;
        class272.field4477 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class146.field2361 && class203.method1388(class272.field4466 + class213.field3235, class272.field4481 + class109.field1611, var50, var52, var48, var49, var51, var47)) {
                class196.field3019 = arg6;
                class196.field3009 = arg7;
            }
            if (!class245.field3886 && !arg8) {
                class272.field4469 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class272.field4476 || var51 > class272.field4476 || var47 > class272.field4476) {
                    class272.field4469 = true;
                }
                if (arg0.field234 == -1) {
                    if (arg0.field246 != 12345678) {
                        class272.method1925(var50, var52, var48, var49, var51, var47, arg0.field246, arg0.field238, arg0.field239);
                    }
                } else if (!class121.field1814) {
                    int var53 = class272.field4467.method405(arg0.field234, -8237);
                    class272.method1925(var50, var52, var48, var49, var51, var47, class148.method1051(var53, arg0.field246), class148.method1051(var53, arg0.field238), class148.method1051(var53, arg0.field239));
                } else if (arg0.field237) {
                    class272.method1913(var50, var52, var48, var49, var51, var47, arg0.field246, arg0.field238, arg0.field239, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field234);
                } else {
                    class272.method1913(var50, var52, var48, var49, var51, var47, arg0.field246, arg0.field238, arg0.field239, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field234);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class146.field2361 && class203.method1388(class272.field4466 + class213.field3235, class272.field4481 + class109.field1611, var46, var48, var52, var45, var47, var51)) {
            class196.field3019 = arg6;
            class196.field3009 = arg7;
        }
        if (class245.field3886 || arg8) {
            return;
        }
        class272.field4469 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class272.field4476 || var47 > class272.field4476 || var51 > class272.field4476) {
            class272.field4469 = true;
        }
        if (arg0.field234 == -1) {
            if (arg0.field242 != 12345678) {
                class272.method1925(var46, var48, var52, var45, var47, var51, arg0.field242, arg0.field239, arg0.field238);
            }
        } else if (class121.field1814) {
            class272.method1913(var46, var48, var52, var45, var47, var51, arg0.field242, arg0.field239, arg0.field238, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field234);
        } else {
            int var54 = class272.field4467.method405(arg0.field234, -8237);
            class272.method1925(var46, var48, var52, var45, var47, var51, class148.method1051(var54, arg0.field242), class148.method1051(var54, arg0.field239), class148.method1051(var54, arg0.field238));
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBII)I", line = 243)
    public static final int method796(int arg0, byte arg1, int arg2, int arg3) {
        field1821++;
        int var4 = 15 / ((arg1 - 56) / 50);
        if ((class148.field2392[arg2][arg0][arg3] & 0x8) == 0) {
            return arg2 <= 0 || (class148.field2392[1][arg0][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lgb;)V", line = 257)
    public class122(class92 arg0) {
        this.field1822 = arg0;
    }
}
