import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class13 {

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "Z")
    public static boolean field114 = false;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "[[Lrb;")
    public static class383[][] field115;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lwp;BI)Ljava/lang/String;", line = 3)
    public static final String method61(class452 arg0, byte arg1, int arg2) {
        field113++;
        if (!client.method3750(arg0).method1803(arg2, -22899) && arg0.field6320 == null) {
            return null;
        } else if (arg0.field6376 == null || arg0.field6376.length <= arg2 || arg0.field6376[arg2] == null || arg0.field6376[arg2].trim().length() == 0) {
            return class590.field8339 ? "Hidden-" + arg2 : null;
        } else {
            if (arg1 != -32) {
                field115 = null;
            }
            return arg0.field6376[arg2];
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V", line = 32)
    public static void method62(int arg0) {
        field115 = null;
        if (arg0 != -1) {
            field115 = null;
        }
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)V", line = 43)
    public static final void method63(int arg0) {
        if (arg0 != -1) {
            field115 = null;
        }
        field112++;
        class403.field5395.method3667(arg0 + 5489);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lwn;Lce;III)V", line = 54)
    public static final void method64(class236 arg0, class445 arg1, int arg2, int arg3, int arg4) {
        field116++;
        if (arg2 != 19946) {
            field115 = null;
        }
        byte var5 = -1;
        if ((arg4 & 0x2) != 0) {
            class649.field9141[arg3] = arg1.method657(false);
        }
        if ((arg4 & 0x4) != 0) {
            int var6 = arg1.method643((byte) -77);
            if (var6 == 65535) {
                var6 = -1;
            }
            arg0.field9448 = var6;
        }
        if ((arg4 & 0x10000) != 0) {
            arg0.field9485 = arg1.method618(98);
            arg0.field9464 = arg1.method632(true);
            arg0.field9507 = arg1.method657(false);
            arg0.field9458 = (byte) arg1.method651((byte) -118);
            arg0.field9460 = class678.field9539 + arg1.method623(-113);
            arg0.field9486 = class678.field9539 + arg1.method623(-121);
        }
        if ((arg4 & 0x1) != 0) {
            int[] var7 = new int[4];
            for (int var8 = 0; var8 < 4; var8++) {
                var7[var8] = arg1.method650((byte) -26);
                if (var7[var8] == 65535) {
                    var7[var8] = -1;
                }
            }
            int var9 = arg1.method649(255);
            class277.method1622(arg0, var9, var7, (byte) 26);
        }
        if ((arg4 & 0x1000) != 0) {
            arg0.field2895 = arg1.method630(30426) == 1;
        }
        if ((arg4 & 0x200) != 0) {
            var5 = arg1.method632(true);
        }
        if ((arg4 & 0x2000) != 0) {
            arg0.field9454 = arg1.method626(arg2 ^ 0x4DBC);
            if (arg0.field9454.charAt(0) == '~') {
                arg0.field9454 = arg0.field9454.substring(1);
                class416.method2341(0, arg0.field9454, arg0.method1418(arg2 - 46846, true), arg0.method1412(false, 131072), 0, 2, arg0.field2927);
            } else if (class362.field4859 == arg0) {
                class416.method2341(0, arg0.field9454, arg0.method1418(-26900, true), arg0.method1412(false, 131072), 0, 2, arg0.field2927);
            }
            arg0.field9462 = 0;
            arg0.field9461 = 150;
            arg0.field9437 = 0;
        }
        if ((arg4 & 0x8000) != 0) {
            arg0.field9459 = arg1.method657(false);
            arg0.field9414 = arg1.method611((byte) 93);
            arg0.field9480 = arg1.method632(true);
            arg0.field9491 = arg1.method657(false);
            arg0.field9479 = arg1.method650((byte) -117) + class678.field9539;
            arg0.field9506 = arg1.method643((byte) -77) + class678.field9539;
            arg0.field9500 = arg1.method649(255);
            arg0.field9516 = 0;
            if (arg0.field2932) {
                arg0.field9480 += arg0.field2889;
                arg0.field9414 += arg0.field2906;
                arg0.field9459 += arg0.field2889;
                arg0.field9518 = 0;
                arg0.field9491 += arg0.field2906;
            } else {
                arg0.field9414 += arg0.field9513[0];
                arg0.field9518 = 1;
                arg0.field9459 += arg0.field9517[0];
                arg0.field9491 += arg0.field9513[0];
                arg0.field9480 += arg0.field9517[0];
            }
        }
        if ((arg4 & 0x10) != 0) {
            int var10 = arg1.method620((byte) 28);
            byte[] var11 = new byte[var10];
            class115 var12 = new class115(var11);
            arg1.method628(0, var10, var11, (byte) -105);
            class304.field3766[arg3] = var12;
            arg0.method1405(20512, var12);
        }
        if ((arg4 & 0x400) != 0) {
            int var13 = arg1.method623(75);
            arg0.field9419 = arg1.method651((byte) -93);
            arg0.field9430 = arg1.method649(255);
            arg0.field9472 = (var13 & 0x8000) != 0;
            arg0.field9433 = var13 & 0x7FFF;
            arg0.field9493 = class678.field9539 + arg0.field9433 + arg0.field9419;
        }
        if ((arg4 & 0x40) != 0) {
            arg0.field2918 = arg1.method623(arg2 - 19840);
            if (arg0.field9518 == 0) {
                arg0.method3740((byte) -29, arg0.field2918);
                arg0.field2918 = -1;
            }
        }
        if ((arg4 & 0x8) != 0) {
            int var14 = arg1.method662(true);
            int var15 = arg1.method630(30426);
            arg0.method3742(var14, -19309, class678.field9539, var15);
            arg0.field9471 = class678.field9539 + 300;
            arg0.field9426 = arg1.method630(30426);
        }
        if ((arg4 & 0x20000) != 0) {
            int var16 = class678.field9539;
            int var17 = arg1.method662(true);
            int var18 = arg1.method649(arg2 - 19691);
            arg0.method3742(var17, -19309, var16, var18);
        }
        if ((arg4 & 0x4000) != 0) {
            int var19 = arg1.method620((byte) -127);
            int[] var20 = new int[var19];
            int[] var21 = new int[var19];
            int[] var22 = new int[var19];
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = arg1.method643((byte) -77);
                if (var24 == 65535) {
                    var24 = -1;
                }
                var20[var23] = var24;
                var21[var23] = arg1.method630(arg2 + 10480);
                var22[var23] = arg1.method650((byte) -70);
            }
            class9.method54(arg0, var20, var22, var21, (byte) 81);
        }
        if ((arg4 & 0x20) != 0) {
            int var25 = arg1.method650((byte) -46);
            int var26 = arg1.method674(-16777216);
            if (var25 == 65535) {
                var25 = -1;
            }
            int var27 = arg1.method620((byte) -126);
            arg0.method3735(var26, -120, var27, var25, false);
        }
        if ((arg4 & 0x100) != 0) {
            int var28 = arg1.method643((byte) -77);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var29 = arg1.method631(false);
            int var30 = arg1.method630(30426);
            arg0.method3735(var29, -123, var30, var28, true);
        }
        if (!arg0.field2932) {
            return;
        }
        if (var5 == 127) {
            arg0.method1403(arg0.field2889, -124, arg0.field2906);
            return;
        }
        byte var31;
        if (var5 == -1) {
            var31 = class649.field9141[arg3];
        } else {
            var31 = var5;
        }
        arg0.method1413(arg0.field2889, arg0.field2906, arg2 ^ 0x4DEA, var31);
    }
}
