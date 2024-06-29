import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class224 {

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "Lwp;")
    public static class453 field2803 = new class453(17, 5);

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "Lnw;")
    public static class347 field2806 = new class347();

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field2807 = 0;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public static int field2810 = -1;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "Z")
    public static boolean field2808 = false;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "Lpl;")
    public static class612 field2809;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "[J")
    public static long[] field2801;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIII)V", line = 3)
    public static final void method1348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 3) {
            field2801 = null;
        }
        field2805++;
        if (arg1 != 8 && arg1 != 16) {
            class75 var7 = class270.field3423[arg5][arg4][arg3];
            if (var7 == null) {
                var7 = new class75(arg5);
            }
            if (arg1 == 1) {
                var7.field1029 = (short) arg6;
                var7.field1033 = (short) arg2;
            } else if (arg1 == 2) {
                var7.field1027 = (short) arg6;
                var7.field1032 = (short) arg2;
            }
            if (class269.field3404) {
                class272.method1564(2);
                return;
            }
            return;
        }
        if (arg1 == 8) {
            int var8 = arg4 << class52.field775;
            int var9 = var8 + class702.field9928;
            int var10 = arg3 << class52.field775;
            int var11 = class702.field9928 + var10;
            int var12 = class256.field3127[arg5].method1562(arg3, (byte) 51, arg4);
            int var13 = class256.field3127[arg5].method1562(arg3 + 1, (byte) 51, arg4 + 1);
            class311.field3980[class472.field5992++] = new class199(arg1, arg5, var8, var9, var9, var8, var12, var13, var13 - arg2, var12 - arg2, var10, var11, var11, var10);
            return;
        }
        int var14 = (arg4 << class52.field775) + class702.field9928;
        int var15 = var14 - class702.field9928;
        int var16 = arg3 << class52.field775;
        int var17 = class702.field9928 + var16;
        int var18 = class256.field3127[arg5].method1562(arg3, (byte) 51, arg4 + 1);
        int var19 = class256.field3127[arg5].method1562(arg3 + 1, (byte) 51, arg4);
        class311.field3980[class472.field5992++] = new class199(arg1, arg5, var14, var15, var15, var14, var18, var19, var19 - arg2, var18 - arg2, var16, var17, var17, var16);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V", line = 80)
    public static void method1349(int arg0) {
        field2806 = null;
        field2809 = null;
        if (arg0 != -5) {
            method1351(98);
        }
        field2803 = null;
        field2801 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIBZ)I", line = 94)
    public static final int method1350(int arg0, int arg1, byte arg2, boolean arg3) {
        field2802++;
        int var4 = 122 % ((arg2 - 64) / 55);
        class492 var5 = class183.method1141(arg3, (byte) 94, arg0);
        if (var5 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var5.field6495.length) {
            return var5.field6495[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V", line = 124)
    public static final void method1351(int arg0) {
        field2804++;
        if (class367.field4671 == 0 || class367.field4671 == 6) {
            return;
        }
        try {
            if ((++class310.field3953) > 2000) {
                if (class446.field5686 != null) {
                    class446.field5686.method1235(0);
                    class446.field5686 = null;
                }
                if (class123.field1561 >= 2) {
                    class367.field4671 = 0;
                    class544.method2939((byte) 108, -5);
                    return;
                }
                if (class126.field1583 == 2 || class126.field1583 == 3) {
                    class131.field1628.method1667(0);
                } else {
                    class381.field4817.method1667(0);
                }
                class367.field4671 = 1;
                class123.field1561++;
                class310.field3953 = 0;
            }
            if (class367.field4671 == 1) {
                if (class126.field1583 == 2 || class126.field1583 == 3) {
                    class42.field553 = class131.field1628.method1664(0, class590.field8289);
                } else {
                    class42.field553 = class381.field4817.method1664(0, class590.field8289);
                }
                class367.field4671 = 2;
            }
            if (class367.field4671 == 2) {
                if (class42.field553.field3358 == 2) {
                    throw new IOException();
                }
                if (class42.field553.field3358 != 1) {
                    return;
                }
                class446.field5686 = class190.method1158(-119, (Socket) class42.field553.field3356, 7500);
                class42.field553 = null;
                long var1 = class396.field4996 = class102.method576(0, class402.field5035);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class232.method1397(-66);
                class704 var4 = class573.method3163(-117);
                var4.field9929.method3509(class350.field4469.field2831, (byte) -125);
                var4.field9929.method3509(var3, (byte) -127);
                class122.method654(var4, (byte) -36);
                class558.method3071((byte) 123);
                class367.field4671 = 3;
            }
            if (class367.field4671 == 3) {
                if (!class446.field5686.method1232(1, (byte) -107)) {
                    return;
                }
                class446.field5686.method1228((byte) 112, 0, class298.field3671.field8804, 1);
                int var5 = class298.field3671.field8804[0] & 0xFF;
                if (var5 != 0) {
                    class367.field4671 = 0;
                    class544.method2939((byte) 84, var5);
                    class446.field5686.method1235(0);
                    class446.field5686 = null;
                    class649.method3646((byte) -61);
                    return;
                }
                class367.field4671 = 4;
            }
            if (class367.field4671 == 4) {
                if (!class446.field5686.method1232(8, (byte) 126)) {
                    return;
                }
                class446.field5686.method1228((byte) 127, 0, class298.field3671.field8804, 8);
                class298.field3671.field8812 = 0;
                class145.field1880 = class298.field3671.method3527(false);
                class630 var6 = new class630(518);
                int[] var7 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class145.field1880 >> 32), (int) class145.field1880 };
                var6.method3509(10, (byte) -117);
                var6.method3464(var7[0], -107);
                var6.method3464(var7[1], -125);
                var6.method3464(var7[2], -126);
                var6.method3464(var7[3], -105);
                var6.method3494(class102.method576(0, class402.field5035), -16719);
                var6.method3489(class507.field6866, -20);
                var6.method3494(class418.field5253, -16719);
                var6.method3494(class348.field4457, -16719);
                var6.method3477(class37.field500, 120, class384.field4841);
                class232.method1397(100);
                class704 var8 = class573.method3163(-108);
                class30 var9 = var8.field9929;
                if (class126.field1583 == 2 || class126.field1583 == 3) {
                    if (class504.field6675 == 13) {
                        var9.method3509(class350.field4474.field2831, (byte) -124);
                    } else {
                        var9.method3509(class350.field4472.field2831, (byte) -113);
                    }
                    var9.method3526(0, 13469);
                    int var11 = var9.field8812;
                    var9.method3464(621, -98);
                    var9.method3509(class304.field3746, (byte) -115);
                    var9.method3509(class193.method1167(-116), (byte) -122);
                    var9.method3526(class523.field7111, 13469);
                    var9.method3526(class244.field3022, 13469);
                    var9.method3509(class301.field3698.field6645, (byte) -109);
                    class475.method2514(var9, 0);
                    var9.method3489(class92.field1288, -121);
                    var9.method3464(class322.field4130, -112);
                    class630 var12 = new class630(class529.method2877(4929));
                    class301.field3698.method2698(92, var12);
                    var9.method3509(var12.field8812, (byte) -115);
                    var9.method3475(65536, var12.field8812, 0, var12.field8804);
                    class206.field2617 = true;
                    class630 var13 = new class630(class512.method2761(-1));
                    (new class32(true, class590.field8289)).method213(var13, -1);
                    var9.method3475(65536, var13.field8804.length, 0, var13.field8804);
                    var9.method3526(class70.field942, 13469);
                    var9.method3494(class49.field702, -16719);
                    var9.method3509(class195.field2446 == null ? 0 : 1, (byte) -110);
                    if (class195.field2446 != null) {
                        var9.method3489(class195.field2446, -61);
                    }
                    class23.method170(2797, var9);
                    var9.method3475(65536, var6.field8812, 0, var6.field8804);
                    var9.method3481(var9.field8812 - var11, false);
                } else {
                    var9.method3509(class350.field4475.field2831, (byte) -114);
                    var9.method3526(0, 13469);
                    int var10 = var9.field8812;
                    var9.method3464(621, -102);
                    var9.method3509(class98.field1337.field1469, (byte) -124);
                    var9.method3509(class250.field3068, (byte) -112);
                    class475.method2514(var9, 0);
                    var9.method3489(class92.field1288, -28);
                    var9.method3464(class322.field4130, -104);
                    class23.method170(2797, var9);
                    var9.method3475(65536, var6.field8812, 0, var6.field8804);
                    var9.method3481(var9.field8812 - var10, false);
                }
                class122.method654(var8, (byte) -36);
                class558.method3071((byte) 88);
                class400.field5014 = new class608(var7);
                for (int var14 = 0; var14 < 4; var14++) {
                    var7[var14] += 50;
                }
                class298.field3671.method208((byte) -55, var7);
                class367.field4671 = 5;
            }
            if (class367.field4671 == 5) {
                if (!class446.field5686.method1232(1, (byte) -83)) {
                    return;
                }
                class446.field5686.method1228((byte) 48, 0, class298.field3671.field8804, 1);
                int var15 = class298.field3671.field8804[0] & 0xFF;
                if (var15 == 21) {
                    class367.field4671 = 8;
                } else if (var15 == 29) {
                    class367.field4671 = 14;
                } else if (var15 == 1) {
                    class367.field4671 = 6;
                    class544.method2939((byte) 17, var15);
                    return;
                } else if (var15 == 2) {
                    class367.field4671 = 9;
                } else if (var15 == 15) {
                    class8.field162 = -2;
                    class367.field4671 = 15;
                } else if (var15 == 23 && class123.field1561 < 2) {
                    class367.field4671 = 1;
                    class123.field1561++;
                    class310.field3953 = 0;
                    class446.field5686.method1235(0);
                    class446.field5686 = null;
                    return;
                } else {
                    class367.field4671 = 0;
                    class544.method2939((byte) 14, var15);
                    class446.field5686.method1235(0);
                    class446.field5686 = null;
                    class649.method3646((byte) -121);
                    return;
                }
            }
            int var16 = 90 / ((-arg0 - 34) / 33);
            if (class367.field4671 == 7) {
                class232.method1397(-110);
                class704 var17 = class573.method3163(-122);
                class30 var18 = var17.field9929;
                var18.method198((byte) 99, class400.field5014);
                var18.method197(26951, class350.field4482.field2831);
                class122.method654(var17, (byte) -36);
                class558.method3071((byte) 100);
                class367.field4671 = 5;
            } else if (class367.field4671 == 8) {
                if (class446.field5686.method1232(1, (byte) -74)) {
                    class446.field5686.method1228((byte) 50, 0, class298.field3671.field8804, 1);
                    int var19 = class298.field3671.field8804[0] & 0xFF;
                    class367.field4671 = 0;
                    class589.field8276 = (var19 + 3) * 60;
                    class544.method2939((byte) 46, 21);
                    class446.field5686.method1235(0);
                    class446.field5686 = null;
                    class649.method3646((byte) -100);
                }
            } else if (class367.field4671 == 14) {
                if (class446.field5686.method1232(1, (byte) -8)) {
                    class446.field5686.method1228((byte) 104, 0, class298.field3671.field8804, 1);
                    class433.field5421 = class298.field3671.field8804[0] & 0xFF;
                    class367.field4671 = 0;
                    class544.method2939((byte) 52, 29);
                    class446.field5686.method1235(0);
                    class446.field5686 = null;
                    class649.method3646((byte) -35);
                }
            } else if (class367.field4671 != 9) {
                if (class367.field4671 == 10) {
                    class30 var20 = class298.field3671;
                    if (class126.field1583 == 3) {
                        class341.field4399 = true;
                    } else {
                        class341.field4399 = false;
                    }
                    if (class126.field1583 == 2 || class126.field1583 == 3) {
                        if (!class446.field5686.method1232(class18.field279, (byte) 112)) {
                            return;
                        }
                        class446.field5686.method1228((byte) 65, 0, var20.field8804, class18.field279);
                        var20.field8812 = 0;
                        class199.field2531 = var20.method3501(-9268);
                        class135.field1770 = var20.method3501(-9268);
                        class242.field3012 = var20.method3501(-9268) == 1;
                        class450.field5747 = var20.method3501(-9268) == 1;
                        class347.field4451 = var20.method3501(-9268) == 1;
                        class553.field7703 = var20.method3501(-9268) == 1;
                        class167.field2200 = var20.method3470(13111);
                        class162.field2138 = var20.method3501(-9268) == 1;
                        class83.field1172 = var20.method3524((byte) -60);
                        class66.field896 = var20.method3501(-9268) == 1;
                        if (class126.field1583 == 3) {
                            boolean var21 = var20.method3501(-9268) == 1;
                            if (var21) {
                                long var22 = var20.method3527(false);
                                String var24 = class577.method3181((byte) -119, var22);
                                int var25 = var20.method3501(-9268);
                                byte[] var26 = new byte[var25];
                                var20.method205(0, var25, var26, -59);
                                String var27 = class85.method488(-129, var26);
                                class479 var28 = null;
                                try {
                                    class264 var29 = class590.field8289.method3641("3", (byte) -28, false);
                                    while (var29.field3358 == 0) {
                                        class419.method2233(-28448, 1L);
                                    }
                                    if (var29.field3358 == 1) {
                                        var28 = (class479) var29.field3356;
                                        int var30 = var24.length() + 17 - (-var27.length() + -2 + -1);
                                        if (class195.field2446 != null) {
                                            var30 += class195.field2446.length() + 2;
                                        }
                                        if (var30 > 120) {
                                            throw new RuntimeException(">120");
                                        }
                                        class630 var31 = new class630(var30 + 1);
                                        var31.method3509(var30, (byte) -126);
                                        var31.method3509(3, (byte) -114);
                                        var31.method3476(var24, 77);
                                        var31.method3476(var27, -122);
                                        var31.method3526(class322.field4130, 13469);
                                        var31.method3494(class49.field702, -16719);
                                        var31.method3509(class195.field2446 == null ? 0 : 1, (byte) -111);
                                        if (class195.field2446 != null) {
                                            var31.method3476(class195.field2446, 91);
                                        }
                                        var31.method3469((byte) -120);
                                        var28.method2605(0, (byte) 104, var31.field8812, var31.field8804);
                                    }
                                } catch (Exception var41) {
                                }
                                try {
                                    if (var28 != null) {
                                        var28.method2603((byte) -128);
                                    }
                                } catch (Exception var39) {
                                }
                                try {
                                    class371.method2028(true, "demoaccountcreated", class422.field5308);
                                } catch (Throwable var38) {
                                }
                            }
                        }
                        class428.field5352.method3143(class66.field896, -6407);
                        class633.field8881.method431(class66.field896, 5);
                        class287.field3581.method1493(class66.field896, (byte) 116);
                    } else if (class446.field5686.method1232(class18.field279, (byte) -52)) {
                        class446.field5686.method1228((byte) 93, 0, var20.field8804, class18.field279);
                        var20.field8812 = 0;
                        class199.field2531 = var20.method3501(-9268);
                        class135.field1770 = var20.method3501(-9268);
                        class242.field3012 = var20.method3501(-9268) == 1;
                        class450.field5747 = var20.method3501(-9268) == 1;
                        class347.field4451 = var20.method3501(-9268) == 1;
                        class567.field7931 = var20.method3510(49);
                        class162.field2138 = class567.field7931 > 0;
                        class86.field1211 = var20.method3470(13111);
                        class10.field189 = var20.method3470(13111);
                        class362.field4609 = var20.method3470(13111);
                        class565.field7885 = var20.method3483(119);
                        class595.field8377 = class590.field8289.method3628(class565.field7885, (byte) 116);
                        class361.field4593 = var20.method3501(-9268);
                        class209.field2634 = var20.method3470(13111);
                        class124.field1564 = var20.method3470(13111);
                        class598.field8399 = var20.method3501(-9268) == 1;
                        class376.field4748.field7017 = class376.field4748.field6990 = var20.method3497(-1);
                        class636.field8928 = var20.method3501(-9268);
                        class350.field4466 = var20.method3483(65);
                        class186.field2358 = new class300();
                        class186.field2358.field3685 = var20.method3470(13111);
                        if (class186.field2358.field3685 == 65535) {
                            class186.field2358.field3685 = -1;
                        }
                        class186.field2358.field3680 = var20.method3497(-1);
                        if (class591.field8310 != class1.field9) {
                            class186.field2358.field3688 = class186.field2358.field3685 + 40000;
                            class186.field2358.field3686 = class186.field2358.field3685 + 50000;
                        }
                        if (class591.field8310 != class408.field5117 && (class131.field1628.method1666(class584.field8165, (byte) 28) || class131.field1628.method1666(class82.field1091, (byte) 28))) {
                            class13.method105((byte) -60);
                        }
                    } else {
                        return;
                    }
                    if ((!class242.field3012 || class347.field4451) && !class162.field2138) {
                        try {
                            class371.method2028(true, "unzap", class422.field5308);
                        } catch (Throwable var36) {
                        }
                    } else {
                        try {
                            class371.method2028(true, "zap", class422.field5308);
                        } catch (Throwable var40) {
                            if (class545.field7263) {
                                try {
                                    class422.field5308.getAppletContext().showDocument(new URL(class422.field5308.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var37) {
                                }
                            }
                        }
                    }
                    if (class591.field8310 == class1.field9) {
                        try {
                            class371.method2028(true, "loggedin", class422.field5308);
                        } catch (Throwable var35) {
                        }
                    }
                    if (class126.field1583 != 2 && class126.field1583 != 3) {
                        class367.field4671 = 0;
                        class544.method2939((byte) 36, 2);
                        class221.method1303(true);
                        class361.method1987(7, -119);
                        class11.field192 = null;
                        return;
                    }
                    class367.field4671 = 12;
                }
                if (class367.field4671 == 12) {
                    if (!class446.field5686.method1232(3, (byte) -53)) {
                        return;
                    }
                    class446.field5686.method1228((byte) 57, 0, class298.field3671.field8804, 3);
                    class367.field4671 = 13;
                }
                if (class367.field4671 == 13) {
                    class30 var32 = class298.field3671;
                    var32.field8812 = 0;
                    if (var32.method204((byte) 17)) {
                        if (!class446.field5686.method1232(1, (byte) 121)) {
                            return;
                        }
                        class446.field5686.method1228((byte) 84, 3, var32.field8804, 1);
                    }
                    class11.field192 = class385.method2075((byte) 103)[var32.method199(false)];
                    class8.field162 = var32.method3470(13111);
                    class367.field4671 = 11;
                }
                if (class367.field4671 == 11) {
                    if (class446.field5686.method1232(class8.field162, (byte) -65)) {
                        class446.field5686.method1228((byte) 88, 0, class298.field3671.field8804, class8.field162);
                        class298.field3671.field8812 = 0;
                        class367.field4671 = 0;
                        int var33 = class8.field162;
                        class544.method2939((byte) 84, 2);
                        class188.method1149(0);
                        class423.method2245(class298.field3671, 0);
                        class313.field4036 = -1;
                        if (class538.field7222 == class11.field192) {
                            class344.method1915(-510117917);
                        } else {
                            class590.method3244(2072317608);
                        }
                        if (class298.field3671.field8812 != var33) {
                            throw new RuntimeException("lswp pos:" + class298.field3671.field8812 + " psize:" + var33);
                        }
                        class11.field192 = null;
                    }
                } else if (class367.field4671 == 15) {
                    if (class8.field162 == -2) {
                        if (!class446.field5686.method1232(2, (byte) 122)) {
                            return;
                        }
                        class446.field5686.method1228((byte) 64, 0, class298.field3671.field8804, 2);
                        class298.field3671.field8812 = 0;
                        class8.field162 = class298.field3671.method3470(13111);
                    }
                    if (class446.field5686.method1232(class8.field162, (byte) 117)) {
                        class446.field5686.method1228((byte) 100, 0, class298.field3671.field8804, class8.field162);
                        class298.field3671.field8812 = 0;
                        class367.field4671 = 0;
                        int var34 = class8.field162;
                        class544.method2939((byte) 105, 15);
                        class424.method2253(29723);
                        class423.method2245(class298.field3671, 0);
                        if (class298.field3671.field8812 != var34) {
                            throw new RuntimeException("lswpr pos:" + class298.field3671.field8812 + " psize:" + var34);
                        }
                        class11.field192 = null;
                    }
                }
            } else if (class446.field5686.method1232(1, (byte) -31)) {
                class446.field5686.method1228((byte) 81, 0, class298.field3671.field8804, 1);
                class18.field279 = class298.field3671.field8804[0] & 0xFF;
                class367.field4671 = 10;
            }
        } catch (IOException var42) {
            if (class446.field5686 != null) {
                class446.field5686.method1235(0);
                class446.field5686 = null;
            }
            if (class123.field1561 >= 2) {
                class367.field4671 = 0;
                class544.method2939((byte) 49, -4);
                class649.method3646((byte) -31);
            } else {
                if (class126.field1583 == 2 || class126.field1583 == 3) {
                    class131.field1628.method1667(0);
                } else {
                    class381.field4817.method1667(0);
                }
                class310.field3953 = 0;
                class123.field1561++;
                class367.field4671 = 1;
            }
        }
    }
}
