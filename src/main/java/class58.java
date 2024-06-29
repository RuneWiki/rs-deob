import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class58 {

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    public int field892 = -1;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field885 = -1;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "Ljn;")
    public class136 field893;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "Lgga;")
    public static class513 field898;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "[I")
    public int[] field888;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "[J")
    public long[] field891;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "[Ljava/lang/String;")
    public String[] field895;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBII)V")
    public static final void method614(int arg0, byte arg1, int arg2, int arg3) {
        if (arg0 == 1011) {
            class46.method356(class732.field10177, arg2, arg3);
        } else if (arg0 == 1003) {
            class46.method356(class438.field6080, arg2, arg3);
        } else if (arg0 == 1012) {
            class46.method356(class104.field1514, arg2, arg3);
        } else if (arg0 == 1004) {
            class46.method356(class352.field4996, arg2, arg3);
        } else if (arg0 == 1010) {
            class46.method356(class5.field73, arg2, arg3);
        }
        if (arg1 > -3) {
            method614(98, (byte) -65, -57, 35);
        }
        field894++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public static void method615(int arg0) {
        field898 = null;
        if (arg0 < 74) {
            method620(88, (byte) -40, 35, null, null);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILjava/io/File;I)[B")
    public static final byte[] method616(int arg0, File arg1, int arg2) {
        if (arg2 < 109) {
            field898 = null;
        }
        field889++;
        try {
            byte[] var3 = new byte[arg0];
            class483.method2850(var3, 0, arg0, arg1);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
    public static final void method617(byte arg0) {
        field897++;
        class255.method1679((byte) -120, class420.field5820.field9480.method1896(17539) == 1, 2, 22050);
        class646.field9183 = class259.method1687(22050, 0, class336.field4775, class213.field3128, (byte) 101);
        class222.method1526(-32672, true, class645.method3654(-18547, null));
        class500.field6868 = class259.method1687(2048, 1, class336.field4775, class213.field3128, (byte) -90);
        class234.field3399 = new class764();
        if (arg0 != 91) {
            field885 = 35;
        }
        class500.field6868.method3615((byte) 126, class234.field3399);
        class191.field2877 = new class292(22050, class702.field9843);
        class646.method3658((byte) -96);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V")
    public static final void method618(boolean arg0) {
        class491.field6733 = class675.field9477.field6402 + class675.field9477.field6399 + 2;
        if (!arg0) {
            return;
        }
        field887++;
        class531.field7399 = class30.field322.field6402 + class30.field322.field6399 + 2;
        class334.field4738 = new String[500];
        for (int var1 = 0; var1 < class334.field4738.length; var1++) {
            class334.field4738[var1] = "";
        }
        class30.method251(false, class563.field7799.method3281(class423.field5892, -1));
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIZILuf;)V")
    public static final void method619(int arg0, int arg1, boolean arg2, int arg3, class519 arg4) {
        field886++;
        int var5 = arg4.field7128;
        if (arg4.field7261 == 0) {
            arg4.field7128 = arg4.field7166;
        } else if (arg4.field7261 == 1) {
            arg4.field7128 = arg0 - arg4.field7166;
        } else if (arg4.field7261 == 2) {
            arg4.field7128 = arg4.field7166 * arg0 >> 14;
        }
        int var6 = arg4.field7255;
        if (arg4.field7287 == 0) {
            arg4.field7255 = arg4.field7299;
        } else if (arg4.field7287 == 1) {
            arg4.field7255 = arg1 - arg4.field7299;
        } else if (arg4.field7287 == 2) {
            arg4.field7255 = arg4.field7299 * arg1 >> 14;
        }
        if (arg3 != 5) {
            method620(52, (byte) -101, 96, null, null);
        }
        if (arg4.field7261 == 4) {
            arg4.field7128 = arg4.field7255 * arg4.field7142 / arg4.field7251;
        }
        if (arg4.field7287 == 4) {
            arg4.field7255 = arg4.field7251 * arg4.field7128 / arg4.field7142;
        }
        if (class346.field4929 && (client.method885(arg4).field2564 != 0 || arg4.field7190 == 0)) {
            if (arg4.field7255 < 5 && arg4.field7128 < 5) {
                arg4.field7255 = 5;
                arg4.field7128 = 5;
            } else {
                if (arg4.field7128 <= 0) {
                    arg4.field7128 = 5;
                }
                if (arg4.field7255 <= 0) {
                    arg4.field7255 = 5;
                }
            }
        }
        if (class744.field10340 == arg4.field7232) {
            class341.field4857 = arg4;
        }
        if (arg2 && arg4.field7168 != null && arg4.field7128 != var5 || arg4.field7255 != var6) {
            class511 var7 = new class511();
            var7.field7021 = arg4.field7168;
            var7.field7023 = arg4;
            class37.field441.method3728((byte) 122, var7);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBILkja;Lea;)V")
    public static final void method620(int arg0, byte arg1, int arg2, class373 arg3, class21 arg4) {
        field890++;
        byte var5 = -1;
        if ((arg2 & 0x40000) != 0) {
            int var6 = arg3.method2557(14929);
            int[] var7 = new int[var6];
            int[] var8 = new int[var6];
            for (int var9 = 0; var9 < var6; var9++) {
                int var10 = arg3.method2580((byte) 68);
                if ((var10 & 0xC000) == 49152) {
                    int var11 = arg3.method2568((byte) -80);
                    var7[var9] = class694.method3895(var10 << 16, var11);
                } else {
                    var7[var9] = var10;
                }
                var8[var9] = arg3.method2568((byte) -80);
            }
            arg4.method1789(var7, -19286, var8);
        }
        if ((arg2 & 0x4000) != 0) {
            arg4.field4079 = arg3.method2544(0);
            arg4.field4070 = arg3.method2544(0);
            arg4.field4105 = arg3.method2581(97);
            arg4.field4058 = arg3.method2581(93);
            arg4.field4099 = arg3.method2580((byte) 36) + class594.field8494;
            arg4.field4060 = arg3.method2565((byte) -124) + class594.field8494;
            arg4.field4042 = arg3.method2561((byte) -94);
            arg4.field4140 = 0;
            if (arg4.field218) {
                arg4.field4105 += arg4.field210;
                arg4.field4058 += arg4.field247;
                arg4.field4070 += arg4.field247;
                arg4.field4141 = 0;
                arg4.field4079 += arg4.field210;
            } else {
                arg4.field4070 += arg4.field4136[0];
                arg4.field4141 = 1;
                arg4.field4079 += arg4.field4142[0];
                arg4.field4058 += arg4.field4136[0];
                arg4.field4105 += arg4.field4142[0];
            }
        }
        if ((arg2 & 0x8) != 0) {
            int var12 = arg3.method2561((byte) -94);
            byte[] var13 = new byte[var12];
            class431 var14 = new class431(var13);
            arg3.method2550((byte) -123, 0, var12, var13);
            class39.field456[arg0] = var14;
            arg4.method195((byte) -120, var14);
        }
        if ((arg2 & 0x80000) != 0) {
            arg4.field4072 = arg3.method2544(0);
            arg4.field4081 = arg3.method2581(91);
            arg4.field4074 = arg3.method2519(true);
            arg4.field4046 = (byte) arg3.method2561((byte) -94);
            arg4.field4092 = class594.field8494 + arg3.method2568((byte) -80);
            arg4.field4121 = class594.field8494 + arg3.method2568((byte) -80);
        }
        if ((arg2 & 0x1000) != 0) {
            arg4.field4069 = arg3.method2532((byte) -121);
            if (arg4.field4069.charAt(0) == '~') {
                arg4.field4069 = arg4.field4069.substring(1);
                class437.method2608(arg4.method190(true, -116), arg4.field4069, 2, arg4.field224, (byte) 120, arg4.method208(16383, false), 0);
            } else if (class719.field10041 == arg4) {
                class437.method2608(arg4.method190(true, -116), arg4.field4069, 2, arg4.field224, (byte) 120, arg4.method208(16383, false), 0);
            }
            arg4.field4091 = 0;
            arg4.field4102 = 150;
            arg4.field4118 = 0;
        }
        if ((arg2 & 0x100) != 0) {
            int var15 = arg3.method2560(true);
            int[] var16 = new int[var15];
            int[] var17 = new int[var15];
            int[] var18 = new int[var15];
            for (int var19 = 0; var19 < var15; var19++) {
                int var20 = arg3.method2576(115);
                if (var20 == 65535) {
                    var20 = -1;
                }
                var16[var19] = var20;
                var17[var19] = arg3.method2560(true);
                var18[var19] = arg3.method2568((byte) -80);
            }
            class656.method3684(arg4, var17, var16, var18, (byte) -34);
        }
        if ((arg2 & 0x20000) != 0) {
            arg4.field215 = arg3.method2557(14929) == 1;
        }
        if ((arg2 & 0x8000) != 0) {
            int var21 = arg3.method2568((byte) -80);
            if (var21 == 65535) {
                var21 = -1;
            }
            int var22 = arg3.method2526(17);
            int var23 = arg3.method2561((byte) -94);
            int var24 = var23 & 0x7;
            int var25 = var23 >> 3 & 0xF;
            if (var25 == 15) {
                var25 = -1;
            }
            arg4.method1799(1, var25, 0, var22, var21, var24);
        }
        if ((arg2 & 0x40) != 0) {
            arg4.field211 = arg3.method2568((byte) -80);
            if (arg4.field4141 == 0) {
                arg4.method1791(arg4.field211, (byte) -55);
                arg4.field211 = -1;
            }
        }
        if ((arg2 & 0x2000) != 0) {
            int var26 = arg3.method2565((byte) -93);
            arg4.field4112 = arg3.method2557(14929);
            arg4.field4116 = arg3.method2555(126);
            arg4.field4094 = (var26 & 0x8000) != 0;
            arg4.field4075 = var26 & 0x7FFF;
            arg4.field4103 = class594.field8494 - (-arg4.field4112 - arg4.field4075);
        }
        if ((arg2 & 0x10000) != 0) {
            int var27 = arg3.method2580((byte) 96);
            int var28 = arg3.method2526(17);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var29 = arg3.method2557(14929);
            int var30 = var29 & 0x7;
            int var31 = var29 >> 3 & 0xF;
            if (var31 == 15) {
                var31 = -1;
            }
            arg4.method1799(2, var31, 0, var28, var27, var30);
        }
        if ((arg2 & 0x800) != 0) {
            arg4.field206 = arg3.method2555(127) == 1;
        }
        if ((arg2 & 0x4) != 0) {
            int var32 = arg3.method2555(125);
            if (var32 > 0) {
                for (int var33 = 0; var33 < var32; var33++) {
                    int var34 = -1;
                    int var35 = -1;
                    int var36 = arg3.method2527((byte) -24);
                    int var37 = -1;
                    if (var36 == 32767) {
                        var36 = arg3.method2527((byte) -24);
                        var35 = arg3.method2527((byte) -24);
                        var34 = arg3.method2527((byte) -24);
                        var37 = arg3.method2527((byte) -24);
                    } else if (var36 == 32766) {
                        var36 = -1;
                    } else {
                        var35 = arg3.method2527((byte) -24);
                    }
                    int var38 = arg3.method2527((byte) -24);
                    int var39 = arg3.method2557(14929);
                    arg4.method1794(var34, 86, var39, var35, class594.field8494, var36, var38, var37);
                }
            }
        }
        if ((arg2 & 0x10) != 0) {
            int[] var40 = new int[4];
            for (int var41 = 0; var41 < 4; var41++) {
                var40[var41] = arg3.method2576(126);
                if (var40[var41] == 65535) {
                    var40[var41] = -1;
                }
            }
            int var42 = arg3.method2555(125);
            class45.method341(var40, -1, var42, arg4);
        }
        if ((arg2 & 0x400) != 0) {
            var5 = arg3.method2519(true);
        }
        if ((arg2 & 0x2) != 0) {
            int var43 = arg3.method2580((byte) 123);
            if (var43 == 65535) {
                var43 = -1;
            }
            arg4.field4054 = var43;
        }
        if ((arg2 & 0x1) != 0) {
            int var44 = arg3.method2565((byte) -117);
            int var45 = arg3.method2577(118);
            if (var44 == 65535) {
                var44 = -1;
            }
            int var46 = arg3.method2560(true);
            int var47 = var46 & 0x7;
            int var48 = (var46 & 0x7D) >> 3;
            if (var48 == 15) {
                var48 = -1;
            }
            arg4.method1799(0, var48, 0, var45, var44, var47);
        }
        if ((arg2 & 0x80) != 0) {
            class279.field4025[arg0] = arg3.method2529(69);
        }
        int var49 = -13 % (arg1 / 48);
        if (!arg4.field218) {
            return;
        }
        if (var5 == 127) {
            arg4.method189(arg4.field210, arg4.field247, -20480);
            return;
        }
        byte var50;
        if (var5 == -1) {
            var50 = class279.field4025[arg0];
        } else {
            var50 = var5;
        }
        class102.method841(false, arg4, var50);
        arg4.method188(arg4.field247, var50, arg4.field210, (byte) 84);
    }
}
