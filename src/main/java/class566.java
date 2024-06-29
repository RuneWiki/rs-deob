import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class566 {

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Ltt;")
    public static class338 field7716 = new class338(1, 4);

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZI)V", line = 4)
    public static final void method3136(int arg0, boolean arg1, int arg2) {
        field7714++;
        class16 var3 = class351.method2078(0, arg1, arg0);
        if (var3 != null && arg2 >= 53) {
            var3.method242(true);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILkba;Ljd;BI)V", line = 27)
    public static final void method3137(int arg0, class573 arg1, class537 arg2, byte arg3, int arg4) {
        field7713++;
        if ((arg0 & 0x10) != 0) {
            int var5 = arg2.method954(2);
            if (var5 == 65535) {
                var5 = -1;
            }
            arg1.field3045 = var5;
        }
        byte var6 = -1;
        if ((arg0 & 0x1000) != 0) {
            arg1.field7818 = arg2.method945((byte) -111) == 1;
        }
        if ((arg0 & 0x20000) != 0) {
            int var7 = class327.field4404;
            int var8 = arg2.method964(125);
            int var9 = arg2.method909(16);
            arg1.method1430(var7, 70, var9, var8);
        }
        if ((arg0 & 0x200) != 0) {
            var6 = arg2.method970(-107);
        }
        if ((arg0 & 0x10000) != 0) {
            arg1.field3055 = arg2.method924(47);
            arg1.field3037 = arg2.method911(57);
            arg1.field3007 = arg2.method969(3);
            arg1.field2988 = (byte) arg2.method919(-83);
            arg1.field3016 = class327.field4404 + arg2.method963(-127);
            arg1.field3075 = class327.field4404 + arg2.method931(65);
        }
        if ((arg0 & 0x2000) != 0) {
            arg1.field3050 = arg2.method969(3);
            arg1.field3060 = arg2.method969(3);
            arg1.field3033 = arg2.method969(3);
            arg1.field3039 = arg2.method924(74);
            arg1.field3036 = arg2.method961(-4349) + class327.field4404;
            arg1.field2984 = arg2.method961(-4349) + class327.field4404;
            arg1.field3069 = arg2.method945((byte) -124);
            if (arg1.field7813) {
                arg1.field3060 += arg1.field7822;
                arg1.field3033 += arg1.field7800;
                arg1.field3095 = 0;
                arg1.field3039 += arg1.field7822;
                arg1.field3050 += arg1.field7800;
            } else {
                arg1.field3050 += arg1.field3088[0];
                arg1.field3095 = 1;
                arg1.field3033 += arg1.field3088[0];
                arg1.field3039 += arg1.field3086[0];
                arg1.field3060 += arg1.field3086[0];
            }
            arg1.field3085 = 0;
        }
        if ((arg0 & 0x80) != 0) {
            class394.field5265[arg4] = arg2.method924(118);
        }
        if ((arg0 & 0x4000) != 0) {
            int var10 = arg2.method963(-120);
            if (var10 == 65535) {
                var10 = -1;
            }
            int var11 = arg2.method935(-125);
            int var12 = arg2.method919(-56);
            arg1.method1431(var11, var12, true, 91, var10);
        }
        if ((arg0 & 0x2) != 0) {
            int var13 = arg2.method919(90);
            byte[] var14 = new byte[var13];
            class157 var15 = new class157(var14);
            arg2.method956(0, var13, false, var14);
            class540.field7405[arg4] = var15;
            arg1.method3172(111, var15);
        }
        if ((arg0 & 0x20) != 0) {
            int[] var16 = new int[4];
            for (int var17 = 0; var17 < 4; var17++) {
                var16[var17] = arg2.method954(2);
                if (var16[var17] == 65535) {
                    var16[var17] = -1;
                }
            }
            int var18 = arg2.method930(255);
            class225.method1406(var18, arg1, var16, true);
        }
        if (arg3 >= -103) {
            return;
        }
        if ((arg0 & 0x100) != 0) {
            int var19 = arg2.method919(99);
            int[] var20 = new int[var19];
            int[] var21 = new int[var19];
            int[] var22 = new int[var19];
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = arg2.method954(2);
                if (var24 == 65535) {
                    var24 = -1;
                }
                var20[var23] = var24;
                var21[var23] = arg2.method930(255);
                var22[var23] = arg2.method954(2);
            }
            class600.method3339(-122, var20, arg1, var22, var21);
        }
        if ((arg0 & 0x8) != 0) {
            arg1.field7806 = arg2.method961(-4349);
            if (arg1.field3095 == 0) {
                arg1.method1427(10973, arg1.field7806);
                arg1.field7806 = -1;
            }
        }
        if ((arg0 & 0x40) != 0) {
            int var25 = arg2.method964(92);
            int var26 = arg2.method909(16);
            arg1.method1430(class327.field4404, 70, var26, var25);
            arg1.field3032 = class327.field4404 + 300;
            arg1.field2994 = arg2.method930(255);
        }
        if ((arg0 & 0x4) != 0) {
            int var27 = arg2.method963(-118);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var28 = arg2.method935(-47);
            int var29 = arg2.method930(255);
            arg1.method1431(var28, var29, false, 55, var27);
        }
        if ((arg0 & 0x8000) != 0) {
            int var30 = arg2.method954(2);
            arg1.field3076 = arg2.method930(255);
            arg1.field3078 = arg2.method945((byte) -115);
            arg1.field3071 = (var30 & 0x8000) != 0;
            arg1.field3046 = var30 & 0x7FFF;
            arg1.field2987 = class327.field4404 + arg1.field3046 + arg1.field3076;
        }
        if ((arg0 & 0x400) != 0) {
            arg1.field3062 = arg2.method925(72);
            if (arg1.field3062.charAt(0) == '~') {
                arg1.field3062 = arg1.field3062.substring(1);
                class116.method681(arg1.method3173(true, (byte) 0), arg1.method3171(false, (byte) -42), arg1.field7811, 114, 0, arg1.field3062, 2);
            } else if (class408.field5369 == arg1) {
                class116.method681(arg1.method3173(true, (byte) 0), arg1.method3171(false, (byte) -12), arg1.field7811, 111, 0, arg1.field3062, 2);
            }
            arg1.field3077 = 150;
            arg1.field3019 = 0;
            arg1.field3072 = 0;
        }
        if (!arg1.field7813) {
            return;
        }
        if (var6 == 127) {
            arg1.method3167(false, arg1.field7800, arg1.field7822);
            return;
        }
        byte var31;
        if (var6 == -1) {
            var31 = class394.field5265[arg4];
        } else {
            var31 = var6;
        }
        arg1.method3170(arg1.field7800, -1, arg1.field7822, var31);
    }

    @OriginalMember(owner = "client!tl", name = "toString", descriptor = "()Ljava/lang/String;", line = 295)
    public final String toString() {
        field7711++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 306)
    public static void method3138(int arg0) {
        field7716 = null;
        int var1 = 120 % ((18 - arg0) / 52);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BII)I", line = 315)
    public final int method3139(byte arg0, int arg1, int arg2) {
        field7712++;
        int var4 = class399.field5301 > arg2 ? class399.field5301 : arg2;
        if (class122.field1593 == this) {
            return 0;
        } else if (class15.field192 == this) {
            return var4 - arg1;
        } else {
            int var5 = 105 / ((arg0 + 32) / 62);
            return class32.field446 == this ? (var4 - arg1) / 2 : 0;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 339)
    public static final void method3140(int arg0) {
        class206.field2757.method2172(-15112);
        field7715++;
        class315.field4217.method2172(-15112);
        class615.field8516.method2172(-15112);
        class302.field3992.method2172(-15112);
        if (arg0 != -2247) {
            method3140(-12);
        }
    }
}
