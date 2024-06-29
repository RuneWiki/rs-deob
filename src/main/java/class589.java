import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class589 {

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
    public int field7683 = 1;

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "Z")
    public static boolean field7687 = false;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
    public static int field7684 = 0;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "C")
    public char field7682;

    @OriginalMember(owner = "client!eba", name = "h", descriptor = "D")
    public static double field7688;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!eba", name = "i", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IILee;)V")
    private final void method3213(int arg0, int arg1, class677 arg2) {
        if (arg0 == 1) {
            this.field7682 = class703.method3957((byte) -71, arg2.method3811(82));
        } else if (arg0 == 2) {
            this.field7683 = 0;
        }
        field7686++;
        if (arg1 != 0) {
            field7684 = -105;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lee;B)V")
    public final void method3214(class677 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method3821((byte) 120);
            if (var3 == 0) {
                if (arg1 < 22) {
                    return;
                }
                field7685++;
                return;
            }
            this.method3213(var3, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lfha;ILwd;II)V")
    public static final void method3215(class383 arg0, int arg1, class276 arg2, int arg3, int arg4) {
        field7681++;
        byte var5 = -1;
        if ((arg3 & 0x8) != 0) {
            arg0.field5320 = arg2.method3809(true);
            if (arg0.field10316 == 0) {
                arg0.method4132(false, arg0.field5320);
                arg0.field5320 = -1;
            }
        }
        int var6 = 22 % ((arg1 - 82) / 33);
        if ((arg3 & 0x2000) != 0) {
            arg0.field5349 = arg2.method3791(true) == 1;
        }
        if ((arg3 & 0x800) != 0) {
            arg0.field10267 = arg2.method3793(15598);
            if (arg0.field10267.charAt(0) == '~') {
                arg0.field10267 = arg0.field10267.substring(1);
                class494.method2789(0, arg0.field10267, arg0.field5339, (byte) -15, arg0.method2267(-116, true), arg0.method2264((byte) -120, false), 2);
            } else if (class472.field6475 == arg0) {
                class494.method2789(0, arg0.field10267, arg0.field5339, (byte) -15, arg0.method2267(-116, true), arg0.method2264((byte) -100, false), 2);
            }
            arg0.field10275 = 0;
            arg0.field10294 = 150;
            arg0.field10271 = 0;
        }
        if ((arg3 & 0x10000) != 0) {
            arg0.field10290 = arg2.method3811(33);
            arg0.field10226 = arg2.method3825(-33);
            arg0.field10298 = arg2.method3834(-8996);
            arg0.field10263 = (byte) arg2.method3783((byte) -45);
            arg0.field10292 = class29.field474 + arg2.method3782(128);
            arg0.field10234 = class29.field474 + arg2.method3807(-1);
        }
        if ((arg3 & 0x100) != 0) {
            int var7 = arg2.method3815((byte) 57);
            int[] var8 = new int[var7];
            int[] var9 = new int[var7];
            int[] var10 = new int[var7];
            for (int var11 = 0; var11 < var7; var11++) {
                int var12 = arg2.method3782(128);
                if (var12 == 65535) {
                    var12 = -1;
                }
                var8[var11] = var12;
                var9[var11] = arg2.method3821((byte) 112);
                var10[var11] = arg2.method3807(-1);
            }
            class360.method2148(var9, 0, var10, arg0, var8);
        }
        if ((arg3 & 0x1000) != 0) {
            int var13 = arg2.method3782(128);
            int var14 = arg2.method3777((byte) -65);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var15 = arg2.method3815((byte) 120);
            int var16 = var15 & 0x7;
            int var17 = var15 >> 3 & 0xF;
            if (var17 == 15) {
                var17 = -1;
            }
            arg0.method4131(var17, var13, var14, 1, (byte) 115, var16);
        }
        if ((arg3 & 0x4000) != 0) {
            int var18 = arg2.method3816(-126);
            arg0.field10225 = arg2.method3791(true);
            arg0.field10262 = arg2.method3821((byte) 69);
            arg0.field10253 = var18 & 0x7FFF;
            arg0.field10264 = (var18 & 0x8000) != 0;
            arg0.field10303 = class29.field474 + arg0.field10253 + arg0.field10225;
        }
        if ((arg3 & 0x20) != 0) {
            class261.field3636[arg4] = arg2.method3825(-93);
        }
        if ((arg3 & 0x1) != 0) {
            int var19 = arg2.method3816(-96);
            if (var19 == 65535) {
                var19 = -1;
            }
            arg0.field10287 = var19;
        }
        if ((arg3 & 0x20000) != 0) {
            int var20 = arg2.method3782(128);
            int var21 = arg2.method3799(false);
            if (var20 == 65535) {
                var20 = -1;
            }
            int var22 = arg2.method3821((byte) -50);
            int var23 = var22 & 0x7;
            int var24 = (var22 & 0x79) >> 3;
            if (var24 == 15) {
                var24 = -1;
            }
            arg0.method4131(var24, var20, var21, 2, (byte) 117, var23);
        }
        if ((arg3 & 0x40) != 0) {
            int[] var25 = new int[4];
            for (int var26 = 0; var26 < 4; var26++) {
                var25[var26] = arg2.method3809(true);
                if (var25[var26] == 65535) {
                    var25[var26] = -1;
                }
            }
            int var27 = arg2.method3783((byte) -45);
            class585.method3194(var27, arg0, (byte) 66, var25);
        }
        if ((arg3 & 0x10) != 0) {
            int var28 = arg2.method3815((byte) -127);
            byte[] var29 = new byte[var28];
            class677 var30 = new class677(var29);
            arg2.method3812(var28, var29, false, 0);
            class388.field5407[arg4] = var30;
            arg0.method2260(true, var30);
        }
        if ((arg3 & 0x400) != 0) {
            arg0.field10230 = arg2.method3825(-34);
            arg0.field10241 = arg2.method3834(-8996);
            arg0.field10235 = arg2.method3768((byte) 127);
            arg0.field10228 = arg2.method3834(-8996);
            arg0.field10231 = arg2.method3816(-102) + class29.field474;
            arg0.field10273 = arg2.method3782(128) + class29.field474;
            arg0.field10274 = arg2.method3821((byte) 120);
            if (arg0.field5360) {
                arg0.field10235 += arg0.field5343;
                arg0.field10230 += arg0.field5343;
                arg0.field10241 += arg0.field5365;
                arg0.field10316 = 0;
                arg0.field10228 += arg0.field5365;
            } else {
                arg0.field10316 = 1;
                arg0.field10235 += arg0.field10322[0];
                arg0.field10241 += arg0.field10321[0];
                arg0.field10228 += arg0.field10321[0];
                arg0.field10230 += arg0.field10322[0];
            }
            arg0.field10318 = 0;
        }
        if ((arg3 & 0x8000) != 0) {
            var5 = arg2.method3768((byte) 94);
        }
        if ((arg3 & 0x2) != 0) {
            int var31 = arg2.method3791(true);
            if (var31 > 0) {
                for (int var32 = 0; var32 < var31; var32++) {
                    int var33 = -1;
                    int var34 = -1;
                    int var35 = -1;
                    int var36 = arg2.method3790((byte) 22);
                    if (var36 == 32767) {
                        var36 = arg2.method3790((byte) 22);
                        var34 = arg2.method3790((byte) 22);
                        var33 = arg2.method3790((byte) 22);
                        var35 = arg2.method3790((byte) 22);
                    } else if (var36 == 32766) {
                        var36 = -1;
                    } else {
                        var34 = arg2.method3790((byte) 22);
                    }
                    int var37 = arg2.method3790((byte) 22);
                    int var38 = arg2.method3783((byte) -45);
                    arg0.method4142(var33, 80, var34, var37, class29.field474, var36, var38, var35);
                }
            }
        }
        if ((arg3 & 0x80) != 0) {
            int var39 = arg2.method3782(128);
            int var40 = arg2.method3777((byte) -112);
            if (var39 == 65535) {
                var39 = -1;
            }
            int var41 = arg2.method3815((byte) 112);
            int var42 = var41 & 0x7;
            int var43 = var41 >> 3 & 0xF;
            if (var43 == 15) {
                var43 = -1;
            }
            arg0.method4131(var43, var39, var40, 0, (byte) 116, var42);
        }
        if ((arg3 & 0x40000) != 0) {
            int var44 = arg2.method3815((byte) 78);
            int[] var45 = new int[var44];
            int[] var46 = new int[var44];
            for (int var47 = 0; var47 < var44; var47++) {
                int var48 = arg2.method3816(-102);
                if ((var48 & 0xC000) == 49152) {
                    int var49 = arg2.method3782(128);
                    var45[var47] = class446.method2556(var49, var48 << 16);
                } else {
                    var45[var47] = var48;
                }
                var46[var47] = arg2.method3816(-110);
            }
            arg0.method4139(var46, false, var45);
        }
        if (!arg0.field5360) {
            return;
        }
        if (var5 == 127) {
            arg0.method2262(arg0.field5365, arg0.field5343, (byte) -73);
            return;
        }
        byte var50;
        if (var5 == -1) {
            var50 = class261.field3636[arg4];
        } else {
            var50 = var5;
        }
        class725.method4083(arg0, var50, 0);
        arg0.method2263(var50, 0, arg0.field5365, arg0.field5343);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "()V")
    public static final void method3216() {
        for (int var0 = 0; var0 < class550.field7263.length; var0++) {
            class550.field7263[var0].method3273();
        }
        class550.field7263 = null;
    }
}
