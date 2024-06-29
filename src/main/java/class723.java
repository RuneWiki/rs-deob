import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class723 extends class134 {

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Lbq;")
    public class289 field10131 = new class289();

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field10130 = new String[100];

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Ldh;")
    public static class320 field10127 = new class320(45, 2);

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "[I")
    public static int[] field10132 = new int[1];

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field10128;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field10129;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field10134;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "Lrfa;")
    public static class199 field10133;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z[[[BIBIIZ)V")
    public static final void method4027(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class479.field6842 = 0;
        class211.field2489 = 0;
        class188.field2234++;
        if ((arg5 & 0x2) == 0) {
            for (class361 var8 = class436.field6357[var7]; var8 != null; var8 = var8.field4634) {
                if (!class35.method163(var8, arg0, arg1, arg2, arg3)) {
                    class233.method1365(var8);
                    if (var8.field4639 != -1) {
                        class119.field1228[class479.field6842++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 0x1) == 0) {
            for (class361 var9 = class300.field3729[var7]; var9 != null; var9 = var9.field4634) {
                if (!class35.method163(var9, arg0, arg1, arg2, arg3)) {
                    class233.method1365(var9);
                    if (var9.field4639 != -1) {
                        class461.field6573[class211.field2489++] = var9;
                    }
                }
            }
            for (class361 var10 = class228.field2626[var7]; var10 != null; var10 = var10.field4634) {
                if (!class35.method163(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method989(-116)) {
                        class233.method1365(var10);
                        if (var10.field4639 != -1) {
                            class461.field6573[class211.field2489++] = var10;
                        }
                    } else {
                        class233.method1365(var10);
                        if (var10.field4639 != -1) {
                            class119.field1228[class479.field6842++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class485.field6894; var11++) {
                    if (!class35.method163(class139.field1560[var11], arg0, arg1, arg2, arg3)) {
                        class233.method1365(class139.field1560[var11]);
                        if (class139.field1560[var11].field4639 != -1) {
                            if (class139.field1560[var11].method989(-123)) {
                                class461.field6573[class211.field2489++] = class139.field1560[var11];
                            } else {
                                class119.field1228[class479.field6842++] = class139.field1560[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class479.field6842 > 0) {
            class127.method808(class119.field1228, 0, class479.field6842 - 1);
            for (int var12 = 0; var12 < class479.field6842; var12++) {
                class718.method4005(class119.field1228[var12], true, arg6);
            }
        }
        if (class748.field10424) {
            class563.field8026.method321(0, null);
        }
        if ((arg5 & 0x2) == 0) {
            for (int var13 = class351.field4526; var13 < field10134; var13++) {
                if (var13 < arg2 || arg1 == null) {
                    int var23 = class233.field2770.length;
                    if (class233.field2770.length + class224.field2576 > class284.field3473) {
                        var23 -= class233.field2770.length + class224.field2576 - class284.field3473;
                    }
                    int var24 = class233.field2770[0].length;
                    if (class233.field2770[0].length + class304.field3795 > class151.field1664) {
                        var24 -= class233.field2770[0].length + class304.field3795 - class151.field1664;
                    }
                    boolean[][] var25 = class511.field7298;
                    if (class292.field3592) {
                        if (class625.field8980) {
                            var25 = class391.field5395[var13];
                        }
                        for (int var26 = class706.field9949; var26 < var23; var26++) {
                            int var27 = class224.field2576 + var26 - class706.field9949;
                            for (int var28 = class661.field9432; var28 < var24; var28++) {
                                if (class233.field2770[var26][var28] && !class240.method1414(30633, var27, class304.field3795 + var28 - class661.field9432, var13)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class625.field8980) {
                        if (arg4 >= 0) {
                            class504.field7120[var13].method1670(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class504.field7120[var13].method1667(0, 0, 0, null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class128.field1340; var29++) {
                            class727.field10181[var29].method3371(false, new class89(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class504.field7120[var13].method1670(class440.field6387, class444.field6433, class626.field8992, class511.field7298, true, arg4, arg5);
                    } else {
                        class504.field7120[var13].method1667(class440.field6387, class444.field6433, class626.field8992, class511.field7298, true, arg5);
                    }
                } else {
                    int var14 = class233.field2770.length;
                    if (class233.field2770.length + class224.field2576 > class284.field3473) {
                        var14 -= class233.field2770.length + class224.field2576 - class284.field3473;
                    }
                    int var15 = class233.field2770[0].length;
                    if (class233.field2770[0].length + class304.field3795 > class151.field1664) {
                        var15 -= class233.field2770[0].length + class304.field3795 - class151.field1664;
                    }
                    boolean[][] var16 = class511.field7298;
                    if (class292.field3592) {
                        if (class625.field8980) {
                            var16 = class391.field5395[var13];
                        }
                        for (int var17 = class706.field9949; var17 < var14; var17++) {
                            int var18 = class224.field2576 + var17 - class706.field9949;
                            for (int var19 = class661.field9432; var19 < var15; var19++) {
                                var16[var17][var19] = false;
                                if (class233.field2770[var17][var19]) {
                                    int var20 = class304.field3795 + var19 - class661.field9432;
                                    for (int var21 = var13; var21 >= 0; var21--) {
                                        if (class638.field9170[var21][var18][var20] != null && class638.field9170[var21][var18][var20].field9727 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class240.method1414(30633, var18, var20, var13)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class625.field8980) {
                        if (arg4 >= 0) {
                            class504.field7120[var13].method1670(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class504.field7120[var13].method1667(0, 0, 0, null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class128.field1340; var22++) {
                            class727.field10181[var22].method3371(false, new class89(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class504.field7120[var13].method1670(class440.field6387, class444.field6433, class626.field8992, class511.field7298, false, arg4, arg5);
                    } else {
                        class504.field7120[var13].method1667(class440.field6387, class444.field6433, class626.field8992, class511.field7298, false, arg5);
                    }
                }
            }
        }
        if (class211.field2489 > 0) {
            class541.method3182(class461.field6573, 0, class211.field2489 - 1);
            for (int var30 = 0; var30 < class211.field2489; var30++) {
                class718.method4005(class461.field6573[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method4028(int arg0) {
        field10130 = null;
        field10132 = null;
        field10127 = null;
        if (arg0 > -127) {
            field10130 = null;
        }
        field10133 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLd;Lha;)V")
    public static final void method4029(byte arg0, class150 arg1, class58 arg2) {
        field10129++;
        if (class656.field9357 == null || arg0 >= -56) {
            return;
        }
        if (class284.field3471 < 10) {
            if (!class656.field9359.method2466(class656.field9357.field962, -111)) {
                class284.field3471 = class385.field5354.method2476(false, class656.field9357.field962) / 10;
                return;
            }
            class658.method3749(-67);
            class284.field3471 = 10;
        }
        if (class284.field3471 == 10) {
            class656.field9374 = class656.field9357.field953 >> 6 << 6;
            class656.field9386 = class656.field9357.field961 >> 6 << 6;
            class656.field9373 = (class656.field9357.field950 >> 6 << 6) + 64 - class656.field9386;
            class656.field9372 = (class656.field9357.field963 >> 6 << 6) + 64 - class656.field9374;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class656.field9357.method624(class90.field937.field4628, 8, (class90.field937.field4635 >> 9) + class464.field6624, (class90.field937.field4629 >> 9) + class181.field2144, var3)) {
                var5 = var3[2] - class656.field9374;
                var4 = var3[1] - class656.field9386;
            }
            if (!class136.field1550 && var4 >= 0 && class656.field9373 > var4 && var5 >= 0 && class656.field9372 > var5) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + ((int) (Math.random() * 10.0D) - 5);
                class116.field1211 = var7;
                class30.field352 = var6;
            } else if (class635.field9136 == -1 || class506.field7219 == -1) {
                class656.field9357.method623(class656.field9357.field949 & 0x3FFF, class656.field9357.field949 >> 14 & 0x3FFF, (byte) -66, var3);
                class116.field1211 = var3[2] - class656.field9374;
                class30.field352 = var3[1] - class656.field9386;
            } else {
                class656.field9357.method623(class506.field7219, class635.field9136, (byte) -66, var3);
                class506.field7219 = -1;
                class635.field9136 = -1;
                class136.field1550 = false;
                if (var3 != null) {
                    class116.field1211 = var3[2] - class656.field9374;
                    class30.field352 = var3[1] - class656.field9386;
                }
            }
            if (class656.field9357.field946 == 37) {
                class656.field9363 = 3.0F;
                class656.field9370 = 3.0F;
            } else if (class656.field9357.field946 == 50) {
                class656.field9363 = 4.0F;
                class656.field9370 = 4.0F;
            } else if (class656.field9357.field946 == 75) {
                class656.field9363 = 6.0F;
                class656.field9370 = 6.0F;
            } else if (class656.field9357.field946 == 100) {
                class656.field9363 = 8.0F;
                class656.field9370 = 8.0F;
            } else if (class656.field9357.field946 == 200) {
                class656.field9363 = 16.0F;
                class656.field9370 = 16.0F;
            } else {
                class656.field9363 = 8.0F;
                class656.field9370 = 8.0F;
            }
            class656.field9366 = (int) class656.field9363 >> 1;
            class656.field9368 = class389.method2399(class656.field9366, (byte) -29);
            class674.method3838(-1);
            class656.method3725();
            class685.field9680 = new class289();
            class656.field9365 += (int) (Math.random() * 5.0D) - 2;
            if (class656.field9365 < -8) {
                class656.field9365 = -8;
            }
            if (class656.field9365 > 8) {
                class656.field9365 = 8;
            }
            class656.field9367 += (int) (Math.random() * 5.0D) - 2;
            if (class656.field9367 < -16) {
                class656.field9367 = -16;
            }
            if (class656.field9367 > 16) {
                class656.field9367 = 16;
            }
            class656.method3731(arg1, class656.field9365 >> 2 << 10, class656.field9367 >> 1);
            class656.field9360.method2056(true, 256, 1024);
            class656.field9356.method2342(-5, 256, 256);
            class656.field9355.method3977(30, 4096);
            class628.field9019.method1410((byte) 96, 256);
            class284.field3471 = 20;
        } else if (class284.field3471 == 20) {
            class231.method1339((byte) -98, true);
            class656.method3743(arg2, class656.field9365, class656.field9367);
            class284.field3471 = 60;
            class231.method1339((byte) -95, true);
            class310.method1847(0);
        } else if (class284.field3471 == 60) {
            if (class656.field9359.method2469(-26492, class656.field9357.field962 + "_staticelements")) {
                if (!class656.field9359.method2466(class656.field9357.field962 + "_staticelements", -117)) {
                    return;
                }
                class656.field9364 = class215.method1261(class656.field9359, false, class656.field9357.field962 + "_staticelements", class511.field7290);
            } else {
                class656.field9364 = new class664(0);
            }
            class656.method3724();
            class284.field3471 = 70;
            class231.method1339((byte) -103, true);
            class310.method1847(0);
        } else if (class284.field3471 == 70) {
            class114.field1192 = new class536(arg2, 11, true, class618.field8849);
            class284.field3471 = 73;
            class231.method1339((byte) -119, true);
            class310.method1847(0);
        } else if (class284.field3471 == 73) {
            class465.field6643 = new class536(arg2, 12, true, class618.field8849);
            class284.field3471 = 76;
            class231.method1339((byte) -95, true);
            class310.method1847(0);
        } else if (class284.field3471 == 76) {
            class107.field1126 = new class536(arg2, 14, true, class618.field8849);
            class284.field3471 = 79;
            class231.method1339((byte) -35, true);
            class310.method1847(0);
        } else if (class284.field3471 == 79) {
            class298.field3715 = new class536(arg2, 17, true, class618.field8849);
            class284.field3471 = 82;
            class231.method1339((byte) -114, true);
            class310.method1847(0);
        } else if (class284.field3471 == 82) {
            class141.field1589 = new class536(arg2, 19, true, class618.field8849);
            class284.field3471 = 85;
            class231.method1339((byte) -108, true);
            class310.method1847(0);
        } else if (class284.field3471 == 85) {
            class313.field3883 = new class536(arg2, 22, true, class618.field8849);
            class284.field3471 = 88;
            class231.method1339((byte) -68, true);
            class310.method1847(0);
        } else if (class284.field3471 == 88) {
            class427.field6191 = new class536(arg2, 26, true, class618.field8849);
            class284.field3471 = 91;
            class231.method1339((byte) -55, true);
            class310.method1847(0);
        } else {
            class219.field2532 = new class536(arg2, 30, true, class618.field8849);
            class284.field3471 = 100;
            class231.method1339((byte) -111, true);
            class310.method1847(0);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(JZIZJZILjava/lang/String;IIZILjava/lang/String;)V")
    public static final void method4030(long arg0, boolean arg1, int arg2, boolean arg3, long arg4, boolean arg5, int arg6, String arg7, int arg8, int arg9, boolean arg10, int arg11, String arg12) {
        field10128++;
        if (class149.field1652 || class343.field4449 >= 500) {
            return;
        }
        int var15 = arg11 == -1 ? class61.field627 : arg11;
        if (arg5) {
            field10134 = -111;
        }
        class649 var16 = new class649(arg7, arg12, var15, arg6, arg2, arg4, arg9, arg8, arg10, arg3, arg0, arg1);
        class260.method1566((byte) -120, var16);
    }
}
