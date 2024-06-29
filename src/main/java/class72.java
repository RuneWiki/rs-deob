import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class72 {

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
    public static int field1003 = 1338;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "[I")
    public static int[] field1000 = new int[25];

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "[F")
    public static float[] field1010 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
    public int field1004;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public int field1007;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "[Lrba;")
    public static class435[] field1005;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZLria;)V", line = 3)
    public static final void method641(boolean arg0, class288 arg1) {
        field1006++;
        if (!class8.field103) {
            return;
        }
        if (arg1.field3753 != null) {
            class288 var2 = class466.method2658(class100.field1388, class27.field489, 30639);
            if (var2 != null) {
                class694 var3 = new class694();
                var3.field9640 = var2;
                var3.field9635 = arg1;
                var3.field9645 = arg1.field3753;
                class188.method1262(var3);
            }
        }
        class366.field4715++;
        class589 var4 = class514.method2994(-29488, class760.field10605, class447.field5935);
        var4.field8251.method2568(arg1.field3696, -535701016);
        var4.field8251.method2624(-127, class100.field1388);
        if (!arg0) {
            field1003 = 1;
        }
        var4.field8251.method2620(arg1.field3740, false);
        var4.field8251.method2568(class27.field489, -535701016);
        var4.field8251.method2611(class718.field10004, (byte) -37);
        var4.field8251.method2620(arg1.field3700, !arg0);
        class737.method4107(var4, 7);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lei;ILrl;II)V", line = 54)
    public static final void method642(class180 arg0, int arg1, class724 arg2, int arg3, int arg4) {
        field1011++;
        int var5 = 66 % ((34 - arg1) / 38);
        if ((arg3 & 0x8000) != 0) {
            int var6 = arg0.method2606((byte) -103);
            int[] var7 = new int[var6];
            int[] var8 = new int[var6];
            int[] var9 = new int[var6];
            for (int var10 = 0; var10 < var6; var10++) {
                int var11 = arg0.method2566(-2);
                if (var11 == 65535) {
                    var11 = -1;
                }
                var7[var10] = var11;
                var8[var10] = arg0.method2606((byte) -103);
                var9[var10] = arg0.method2604((byte) -127);
            }
            class368.method2126(var8, arg2, var9, 0, var7);
        }
        byte var12 = -1;
        if ((arg3 & 0x8) != 0) {
            class182.field2548[arg4] = arg0.method2627(15802);
        }
        if ((arg3 & 0x200) != 0) {
            var12 = arg0.method2593((byte) 120);
        }
        if ((arg3 & 0x800) != 0) {
            int var13 = arg0.method2604((byte) -127);
            arg2.field183 = arg0.method2600((byte) -123);
            arg2.field224 = arg0.method2629(-123);
            arg2.field170 = (var13 & 0x8000) != 0;
            arg2.field190 = var13 & 0x7FFF;
            arg2.field196 = class463.field6224 + arg2.field190 + arg2.field183;
        }
        if ((arg3 & 0x80) != 0) {
            int var14 = arg0.method2566(-2);
            if (var14 == 65535) {
                var14 = -1;
            }
            int var15 = arg0.method2571(21166);
            int var16 = arg0.method2629(-110);
            int var17 = var16 & 0x7;
            int var18 = var16 >> 3 & 0xF;
            if (var18 == 15) {
                var18 = -1;
            }
            arg2.method99(var14, var18, var15, var17, true, false);
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field10101 = arg0.method2566(-2);
            if (arg2.field263 == 0) {
                arg2.method90(arg2.field10101, (byte) -18);
                arg2.field10101 = -1;
            }
        }
        if ((arg3 & 0x10000) != 0) {
            int var19 = arg0.method2629(-88);
            int[] var20 = new int[var19];
            int[] var21 = new int[var19];
            for (int var22 = 0; var22 < var19; var22++) {
                int var23 = arg0.method2566(-2);
                if ((var23 & 0xC000) == 49152) {
                    int var24 = arg0.method2566(-2);
                    var20[var22] = class683.method3840(var24, var23 << 16);
                } else {
                    var20[var22] = var23;
                }
                var21[var22] = arg0.method2617((byte) 73);
            }
            arg2.method97(var20, -12780, var21);
        }
        if ((arg3 & 0x2) != 0) {
            int var25 = arg0.method2606((byte) -103);
            if (var25 > 0) {
                for (int var26 = 0; var26 < var25; var26++) {
                    int var27 = -1;
                    int var28 = -1;
                    int var29 = arg0.method2594(3340);
                    int var30 = -1;
                    if (var29 == 32767) {
                        var29 = arg0.method2594(3340);
                        var28 = arg0.method2594(3340);
                        var27 = arg0.method2594(3340);
                        var30 = arg0.method2594(3340);
                    } else if (var29 == 32766) {
                        var29 = -1;
                    } else {
                        var28 = arg0.method2594(3340);
                    }
                    int var31 = arg0.method2594(3340);
                    int var32 = arg0.method2600((byte) -123);
                    arg2.method95(var27, var32, var28, class463.field6224, var31, false, var29, var30);
                }
            }
        }
        if ((arg3 & 0x4000) != 0) {
            int var33 = arg0.method2595((byte) 103);
            if (var33 == 65535) {
                var33 = -1;
            }
            int var34 = arg0.method2622(-539564808);
            int var35 = arg0.method2583(false);
            int var36 = var35 & 0x7;
            int var37 = var35 >> 3 & 0xF;
            if (var37 == 15) {
                var37 = -1;
            }
            arg2.method99(var33, var37, var34, var36, true, true);
        }
        if ((arg3 & 0x1) != 0) {
            int[] var38 = new int[4];
            for (int var39 = 0; var39 < 4; var39++) {
                var38[var39] = arg0.method2595((byte) 97);
                if (var38[var39] == 65535) {
                    var38[var39] = -1;
                }
            }
            int var40 = arg0.method2583(false);
            class621.method3493(arg2, var40, var38, -110);
        }
        if ((arg3 & 0x40000) != 0) {
            arg2.field156 = arg0.method2579(125);
            arg2.field161 = arg0.method2627(15802);
            arg2.field151 = arg0.method2627(15802);
            arg2.field219 = (byte) arg0.method2583(false);
            arg2.field217 = class463.field6224 + arg0.method2617((byte) 72);
            arg2.field222 = class463.field6224 + arg0.method2617((byte) 90);
        }
        if ((arg3 & 0x2000) != 0) {
            arg2.field214 = arg0.method2574(-1);
            if (arg2.field214.charAt(0) == '~') {
                arg2.field214 = arg2.field214.substring(1);
                class64.method588(1699767752, arg2.field214, 0, arg2.method4038(false, true), arg2.method4041(-1, false), 2, arg2.field10064);
            } else if (class380.field4847 == arg2) {
                class64.method588(1699767752, arg2.field214, 0, arg2.method4038(false, true), arg2.method4041(-1, false), 2, arg2.field10064);
            }
            arg2.field247 = 150;
            arg2.field228 = 0;
            arg2.field209 = 0;
        }
        if ((arg3 & 0x1000) != 0) {
            arg2.field10074 = arg0.method2606((byte) -103) == 1;
        }
        if ((arg3 & 0x4) != 0) {
            int var41 = arg0.method2583(false);
            byte[] var42 = new byte[var41];
            class461 var43 = new class461(var42);
            arg0.method2588(28973, var42, var41, 0);
            class511.field7199[arg4] = var43;
            arg2.method4046(var43, false);
        }
        if ((arg3 & 0x20) != 0) {
            int var44 = arg0.method2604((byte) -126);
            if (var44 == 65535) {
                var44 = -1;
            }
            arg2.field221 = var44;
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field185 = arg0.method2593((byte) 86);
            arg2.field154 = arg0.method2579(120);
            arg2.field162 = arg0.method2579(75);
            arg2.field240 = arg0.method2593((byte) 84);
            arg2.field238 = arg0.method2604((byte) -127) + class463.field6224;
            arg2.field176 = arg0.method2617((byte) 110) + class463.field6224;
            arg2.field164 = arg0.method2600((byte) -123);
            if (arg2.field10058) {
                arg2.field263 = 0;
                arg2.field240 += arg2.field10078;
                arg2.field154 += arg2.field10078;
                arg2.field162 += arg2.field10083;
                arg2.field185 += arg2.field10083;
            } else {
                arg2.field263 = 1;
                arg2.field240 += arg2.field260[0];
                arg2.field154 += arg2.field260[0];
                arg2.field185 += arg2.field264[0];
                arg2.field162 += arg2.field264[0];
            }
            arg2.field266 = 0;
        }
        if (!arg2.field10058) {
            return;
        }
        if (var12 == 127) {
            arg2.method4040(arg2.field10083, -119, arg2.field10078);
            return;
        }
        byte var45;
        if (var12 == -1) {
            var45 = class182.field2548[arg4];
        } else {
            var45 = var12;
        }
        class541.method3104(-88, var45, arg2);
        arg2.method4042(arg2.field10083, arg2.field10078, (byte) -111, var45);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)Z", line = 393)
    public static final boolean method643(int arg0, int arg1, int arg2) {
        field1002++;
        if (!class14.field276) {
            return false;
        }
        int var3 = arg2 >> 16;
        if (arg1 != -16) {
            return true;
        }
        int var4 = arg2 & 0xFFFF;
        if (class218.field2938[var3] == null || class218.field2938[var3][var4] == null) {
            return false;
        }
        class288 var5 = class218.field2938[var3][var4];
        if (arg0 == -1 && var5.field3655 == 0) {
            for (class277 var6 = (class277) class343.field4334.method3672(-1); var6 != null; var6 = (class277) class343.field4334.method3662(-1)) {
                if (var6.field3478 == 6 || var6.field3478 == 1007 || var6.field3478 == 51 || var6.field3478 == 23 || var6.field3478 == 3) {
                    for (class288 var7 = class501.method2936(arg1 ^ 0x56, var6.field3481); var7 != null; var7 = class645.method3618(var7, -36)) {
                        if (var5.field3696 == var7.field3696) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class277 var8 = (class277) class343.field4334.method3672(-1); var8 != null; var8 = (class277) class343.field4334.method3662(arg1 ^ 0xF)) {
                if (var8.field3471 == arg0 && var5.field3696 == var8.field3481 && (var8.field3478 == 6 || var8.field3478 == 1007 || var8.field3478 == 51 || var8.field3478 == 23 || var8.field3478 == 3)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V", line = 464)
    public static void method644(int arg0) {
        field1005 = null;
        if (arg0 != -1) {
            method641(false, null);
        }
        field1010 = null;
        field1000 = null;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V", line = 481)
    public static final void method645(int arg0, Rectangle[] arg1, int arg2) throws class230 {
        if (class259.field3281 == 1) {
            class565.field7943.method432(arg1, arg0, class89.field1237, class480.field6536);
        } else {
            class565.field7943.method432(arg1, arg0, 0, 0);
        }
        field1008++;
        if (arg2 < 39) {
            field1000 = null;
        }
    }
}
