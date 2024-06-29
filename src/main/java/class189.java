import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class189 extends class107 {

    @OriginalMember(owner = "client!be", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field2883;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "[B")
    private byte[] field2877;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BZI)V")
    public final void method630(byte arg0, boolean arg1, int arg2) {
        field2878++;
        if (!arg1) {
            return;
        }
        byte var4 = (byte) ((arg0 >> 1 & 0x7F) + 127);
        int var5 = arg2 * 2;
        int var6 = var5 + 1;
        this.field2877[var5] = var4;
        this.field2877[var6] = var4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILps;)Lki;")
    private static final class295 method1231(int arg0, class428 arg1) {
        field2879++;
        class295 var2 = new class295();
        var2.field4321 = arg1.method2620(36);
        if (arg0 < 27) {
            field2883 = null;
        }
        var2.field4323 = class609.field8967.method741(-3877, var2.field4321);
        return var2;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIB)[B")
    public final byte[] method1232(int arg0, int arg1, int arg2, byte arg3) {
        this.field2877 = new byte[arg0 * arg2 * arg1 * 2];
        int var5 = 24 % ((arg3 + 34) / 35);
        field2880++;
        this.method2960(4095, arg2, arg1, arg0);
        return this.field2877;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILhca;IBLno;)V")
    public static final void method1233(int arg0, class179 arg1, int arg2, byte arg3, class483 arg4) {
        field2881++;
        byte var5 = -1;
        if ((arg2 & 0x20) != 0) {
            int var6 = arg4.method2587(11615);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = arg4.method2615(255);
            class453.method2728(var7, 123, var6, arg1);
        }
        if ((arg2 & 0x1000) != 0) {
            int var8 = class576.field8505;
            int var9 = arg4.method2573(-14319);
            int var10 = arg4.method2574((byte) 104);
            arg1.method497(110, var8, var9, var10);
        }
        if ((arg2 & 0x8000) != 0) {
            int var11 = arg4.method2620(106);
            arg1.field995 = arg4.method2600(125);
            arg1.field1006 = arg4.method2574((byte) 107);
            arg1.field1078 = (var11 & 0x8000) != 0;
            arg1.field1020 = var11 & 0x7FFF;
            arg1.field1085 = class576.field8505 + arg1.field1020 + arg1.field995;
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field2739 = arg4.method2587(11615);
            if (arg1.field1091 == 0) {
                arg1.method499(-3569, arg1.field2739);
                arg1.field2739 = -1;
            }
        }
        if ((arg2 & 0x800) != 0) {
            var5 = arg4.method2598(true);
        }
        if ((arg2 & 0x4000) != 0) {
            int var12 = arg4.method2621(-18757);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = arg4.method2588(-97);
            int var14 = arg4.method2574((byte) 93);
            arg1.method507(var12, var14, false, var13, 91);
        }
        if (arg3 >= -53) {
            method1235(-105);
        }
        if ((arg2 & 0x1) != 0) {
            int var15 = arg4.method2620(44);
            if (var15 == 65535) {
                var15 = -1;
            }
            arg1.field1037 = var15;
        }
        if ((arg2 & 0x2000) != 0) {
            arg1.field2744 = arg4.method2615(255) == 1;
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field1042 = arg4.method2585(107);
            if (arg1.field1042.charAt(0) == '~') {
                arg1.field1042 = arg1.field1042.substring(1);
                class549.method3214(116, arg1.field1042, arg1.method1196(true, true), 0, arg1.method1200(false, (byte) 105), 2);
            } else if (class239.field3493 == arg1) {
                class549.method3214(-96, arg1.field1042, arg1.method1196(true, true), 0, arg1.method1200(false, (byte) 105), 2);
            }
            arg1.field1064 = 0;
            arg1.field1055 = 0;
            arg1.field1027 = 150;
        }
        if ((arg2 & 0x4) != 0) {
            class139.field1830[arg0] = arg4.method2626(-128);
        }
        if ((arg2 & 0x20000) != 0) {
            int var16 = arg4.method2620(30);
            int var17 = arg4.method2588(-101);
            if (var16 == 65535) {
                var16 = -1;
            }
            int var18 = arg4.method2600(124);
            arg1.method507(var16, var18, true, var17, -88);
        }
        if ((arg2 & 0x40000) != 0) {
            int var19 = arg4.method2561((byte) 110);
            int[] var20 = new int[var19];
            int[] var21 = new int[var19];
            int[] var22 = new int[var19];
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = arg4.method2620(127);
                if (var24 == 65535) {
                    var24 = -1;
                }
                var20[var23] = var24;
                var21[var23] = arg4.method2600(-99);
                var22[var23] = arg4.method2621(-18757);
            }
            class490.method2963(var21, arg1, 112, var20, var22);
        }
        if ((arg2 & 0x2) != 0) {
            int var25 = arg4.method2620(48);
            int var26 = arg4.method2615(255);
            int var27 = arg4.method2600(23);
            int var28 = arg4.field6221;
            boolean var29 = (var25 & 0x8000) != 0;
            if (arg1.field2718 != null && arg1.field2711 != null) {
                boolean var30 = false;
                if (var26 <= 1) {
                    if (!var29 && (class506.field7545 && !class80.field916 || class163.field2181)) {
                        var30 = true;
                    } else if (class14.method64(arg1.field2718, (byte) 73)) {
                        var30 = true;
                    }
                }
                if (!var30 && class218.field3226 == 0) {
                    class362.field5228.field6221 = 0;
                    arg4.method2560(var27, -127, class362.field5228.field6162, 0);
                    class362.field5228.field6221 = 0;
                    int var31 = -1;
                    String var32;
                    if (var29) {
                        var25 &= 0x7FFF;
                        class295 var33 = method1231(113, class362.field5228);
                        var31 = var33.field4321;
                        var32 = var33.field4323.method1928(class362.field5228, 0);
                    } else {
                        var32 = class358.method2199(class384.method2326(class362.field5228, -103), -61);
                    }
                    arg1.field1042 = var32.trim();
                    arg1.field1027 = 150;
                    arg1.field1055 = var25 & 0xFF;
                    arg1.field1064 = var25 >> 8;
                    int var34;
                    if (var26 == 1 || var26 == 2) {
                        var34 = var29 ? 17 : 1;
                    } else {
                        var34 = var29 ? 17 : 2;
                    }
                    if (var26 == 2) {
                        class588.method3430(0, var32, 83, var31, "<img=1>" + arg1.method1200(false, (byte) 105), null, var34, "<img=1>" + arg1.method1196(true, true));
                    } else if (var26 == 1) {
                        class588.method3430(0, var32, 76, var31, "<img=0>" + arg1.method1200(false, (byte) 105), null, var34, "<img=0>" + arg1.method1196(true, true));
                    } else {
                        class588.method3430(0, var32, 48, var31, arg1.method1200(false, (byte) 105), null, var34, arg1.method1196(true, true));
                    }
                }
            }
            arg4.field6221 = var28 + var27;
        }
        if ((arg2 & 0x8) != 0) {
            int var35 = arg4.method2573(-14319);
            int var36 = arg4.method2615(255);
            arg1.method497(-63, class576.field8505, var35, var36);
            arg1.field1032 = class576.field8505 + 300;
            arg1.field1014 = arg4.method2574((byte) -111);
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field1015 = arg4.method2604(27700);
            arg1.field1030 = arg4.method2604(27700);
            arg1.field1018 = arg4.method2598(true);
            arg1.field1040 = arg4.method2598(true);
            arg1.field1045 = arg4.method2587(11615) + class576.field8505;
            arg1.field1004 = arg4.method2616(79) + class576.field8505;
            arg1.field1077 = arg4.method2561((byte) 110);
            if (arg1.field2756) {
                arg1.field1030 += arg1.field2741;
                arg1.field1040 += arg1.field2741;
                arg1.field1091 = 0;
                arg1.field1018 += arg1.field2708;
                arg1.field1015 += arg1.field2708;
            } else {
                arg1.field1091 = 1;
                arg1.field1015 += arg1.field1090[0];
                arg1.field1018 += arg1.field1090[0];
                arg1.field1040 += arg1.field1089[0];
                arg1.field1030 += arg1.field1089[0];
            }
            arg1.field1097 = 0;
        }
        if ((arg2 & 0x10000) != 0) {
            arg1.field1011 = arg4.method2626(-128);
            arg1.field1073 = arg4.method2598(true);
            arg1.field1001 = arg4.method2570((byte) 57);
            arg1.field1063 = (byte) arg4.method2600(-128);
            arg1.field1075 = class576.field8505 + arg4.method2621(-18757);
            arg1.field1080 = class576.field8505 + arg4.method2621(-18757);
        }
        if ((arg2 & 0x80) != 0) {
            int var37 = arg4.method2600(-81);
            byte[] var38 = new byte[var37];
            class428 var39 = new class428(var38);
            arg4.method2578(-1, var38, 0, var37);
            class156.field1996[arg0] = var39;
            arg1.method1190(-122, var39);
        }
        if (!arg1.field2756) {
            return;
        }
        if (var5 == 127) {
            arg1.method1197(arg1.field2708, true, arg1.field2741);
            return;
        }
        byte var40;
        if (var5 == -1) {
            var40 = class139.field1830[arg0];
        } else {
            var40 = var5;
        }
        arg1.method1201(arg1.field2708, (byte) -22, arg1.field2741, var40);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BII)I")
    public static final int method1234(byte arg0, int arg1, int arg2) {
        int var3 = 87 / ((-arg0 - 39) / 40);
        field2882++;
        int var4 = (arg2 & 0x7F) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg2 & 0xFF80) + var4;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
    public static void method1235(int arg0) {
        field2883 = null;
        if (arg0 != 20935) {
            field2883 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class189() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    static {
        new class487("Use", "Benutzen", "Utiliser", "Usar");
        field2883 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
    }
}
