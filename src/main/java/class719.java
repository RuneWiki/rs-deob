import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class719 {

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Lml;")
    public static class410 field10027 = new class410("", 17);

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field10029 = 0;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field10023;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field10025;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field10026;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field10028;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Lcd;")
    public static class334 field10024;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jm", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field10031;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "[[[I")
    public static int[][][] field10030;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B[II[[[BI[II[III[IIZZ[IIII)V")
    public static final void method4013(byte arg0, int[] arg1, int arg2, byte[][][] arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9, int[] arg10, int arg11, boolean arg12, boolean arg13, int[] arg14, int arg15, int arg16, int arg17) {
        field10026++;
        if (class669.field9399 == -1) {
            return;
        }
        int[] var18 = class86.field1200.method496();
        int var19 = var18[0];
        int var20 = var18[1];
        int var21 = var18[2];
        int var22 = var18[3];
        int var23 = var21;
        int var24 = var22;
        if (class669.field9399 == 1) {
            var23 = (int) ((double) class670.field9427 * (double) var21 / (double) class756.field10491);
            var24 = (int) ((double) class670.field9427 * (double) var22 / (double) class756.field10491);
        }
        if (!class768.field10591) {
            if (class669.field9399 == 1) {
                class478.method2789((byte) 27);
            }
            int var25 = arg17 - class135.field1983;
            int var26 = arg2 - class134.field1965;
            int var27 = arg4 - class750.field10333;
            int var28 = (int) (((double) var27 * class48.field723 + (double) var25 * class464.field6455 + (double) var26 * class34.field558) * (double) var23 / (double) arg6);
            int var29 = (int) (((double) var27 * class74.field1099 + (double) var25 * class456.field6331 + (double) var26 * class243.field3265) * (double) var24 / (double) arg6);
            double var30 = (double) var27 * class168.field2260 + (double) var25 * class206.field2702 + (double) var26 * class310.field4461;
            int var32 = class111.field1526 + var28 - class65.field918;
            int var33 = class38.field584 + var29 - class314.field4523;
            int var34 = class564.field7561 + var32;
            int var35 = class670.field9427 + var33;
            if (!(var32 < 0 || var33 < 0 || var34 > class688.field9675 || var35 > class756.field10491) || class669.field9399 == 2) {
                class109.field1510 = var32;
                class107.field1479 = var33;
                if (class669.field9399 == 2) {
                    class784.field10799 = -var30;
                }
            } else if (var34 > 0 && var35 > 0 && var32 < class688.field9675 && var33 < class756.field10491) {
                int var36 = var32 - class111.field1526;
                int var37 = var33 - class38.field584;
                int var38 = 0;
                int var39 = 0;
                int var40 = 0;
                int var41 = 0;
                double var42 = 0.0D;
                if (class669.field9399 == 0) {
                    var42 = class784.field10799 + var30;
                    var38 = var36;
                    var39 = var37;
                } else if (class669.field9399 == 1) {
                    var40 = var36 / class639.field8876;
                    var41 = var37 / class462.field6403;
                    var39 = class462.field6403 * var41;
                    var38 = class639.field8876 * var40;
                    var42 = (class784.field10799 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 + var37 * var37);
                }
                double var44 = -var42;
                int var46 = 0;
                int var47 = 0;
                int var48 = 0;
                int var49 = 0;
                int var50 = 0;
                int var51 = 0;
                int var52;
                int var53;
                int var54;
                int var55;
                if (var38 >= 0) {
                    var52 = 0;
                    var53 = class688.field9675 - var38;
                    if (class669.field9399 == 1) {
                        var50 = var40;
                        var48 = class704.field9863 - var40;
                    }
                    var54 = var38;
                    var55 = var53;
                } else {
                    var53 = class688.field9675 + var38;
                    var55 = 0;
                    var52 = -var38;
                    if (class669.field9399 == 1) {
                        var50 = -var40;
                        var48 = 0;
                    }
                    var54 = var52;
                }
                int var56;
                int var57;
                int var58;
                int var59;
                int var60;
                int var61;
                if (var39 >= 0) {
                    var56 = class756.field10491 - var39;
                    var57 = 0;
                    var58 = 0;
                    if (class669.field9399 == 1) {
                        var49 = 0;
                        var46 = class40.field637 - var41;
                        var47 = var41;
                        var51 = var46;
                    }
                    var59 = var56;
                    var60 = var39;
                    var61 = var56;
                } else {
                    var61 = 0;
                    var56 = class756.field10491 + var39;
                    var57 = -var39;
                    var60 = var57;
                    if (class669.field9399 == 1) {
                        var47 = -var41;
                        var46 = 0;
                        var51 = class40.field637 + var41;
                        var49 = var47;
                    }
                    var58 = var57;
                    var59 = var56;
                }
                class15 var62 = class712.field9964.field171;
                for (class176 var63 = (class176) var62.method109(0); var63 != null; var63 = (class176) var62.method115((byte) -107)) {
                    class431[] var69 = var63.field2345;
                    boolean var70 = true;
                    for (int var71 = 0; var71 < var69.length; var71++) {
                        class431 var72 = var69[var71];
                        int var73 = var72.field6123;
                        int var74 = var72.field6124;
                        int var75 = var72.field6125;
                        int var76 = var72.field6122;
                        int var77;
                        var72.field6123 = var77 = var73 - var38;
                        int var78 = var72.field6121;
                        int var79;
                        var72.field6124 = var79 = var74 - var39;
                        int var80;
                        var72.field6125 = var80 = var75 - var38;
                        int var81;
                        var72.field6122 = var81 = var76 - var39;
                        if (var70) {
                            int var82 = (var77 < var80 ? var77 : var80) - var78;
                            if (class688.field9675 >= var82) {
                                int var83 = (var81 <= var79 ? var81 : var79) - var78;
                                if (var83 <= class756.field10491) {
                                    int var84 = (var80 <= var77 ? var77 : var80) + var78;
                                    if (var84 >= 0) {
                                        int var85 = (var81 <= var79 ? var79 : var81) + var78;
                                        if (var85 >= 0) {
                                            var70 = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var70) {
                        var63.method2922((byte) -95);
                        class670.method3726(var63, (byte) 72);
                    }
                }
                if (class669.field9399 == 0) {
                    class86.field1200.method549(class269.field3968);
                }
                class86.field1200.method492(-var38, -var39);
                class86.field1200.method447(var52, var57, var53, var56, var44);
                class554.method3129((byte) -53, class784.field10799 + var44);
                class9.field137 = class784.field10799 + var44;
                if (class669.field9399 == 1) {
                    class664.field9176 = var24;
                    class404.field5866 = var23;
                    class344.field5061 = var20 - (class314.field4523 + var39);
                    class550.field7452 = var19 - class65.field918 - var38;
                    class86.field1200.method540(class550.field7452, class344.field5061, class404.field5866, class664.field9176);
                } else {
                    class664.field9176 = var24;
                    class550.field7452 = class111.field1526 + var19 - class65.field918 - var38;
                    class344.field5061 = var20 - (class314.field4523 - class38.field584) - var39;
                    class404.field5866 = var23;
                    class86.field1200.method540(class550.field7452, class344.field5061, class404.field5866, class664.field9176);
                }
                class775.method4298(class712.field9964);
                if (var60 > 0) {
                    class86.field1200.method456(0, var61, class688.field9675, var60 + var61);
                    class86.field1200.method483();
                    class86.field1200.method458(class326.field4748);
                    class743.method4113(arg11, arg17, arg2, arg4, arg3, arg5, arg14, arg10, arg1, arg7, arg8, arg0, arg9, arg15, arg13, arg12, arg6, 1, false);
                }
                if (var54 > 0) {
                    class86.field1200.method456(var55, var58, var54 + var55, var58 - -var59);
                    class86.field1200.method483();
                    class86.field1200.method458(class326.field4748);
                    class743.method4113(arg11, arg17, arg2, arg4, arg3, arg5, arg14, arg10, arg1, arg7, arg8, arg0, arg9, arg15, arg13, arg12, arg6, 1, false);
                }
                class86.field1200.method543();
                class763.method4240();
                if (class669.field9399 == 0) {
                    class86.field1200.method511();
                }
                class65.field918 += var38;
                class314.field4523 += var39;
                class784.field10799 += var44;
                class107.field1479 = class38.field584 + var29 - class314.field4523;
                class109.field1510 = class111.field1526 + var28 - class65.field918;
                if (class669.field9399 == 1) {
                    class781.field10707 += var41;
                    class405.field5877 += var40;
                    for (int var64 = 0; var64 < class40.field637; var64++) {
                        int var65 = class402.method2505(class40.field637, class781.field10707 + var64, -126) * class704.field9863;
                        for (int var66 = 0; var66 < class704.field9863; var66++) {
                            int var67 = var65 + class402.method2505(class704.field9863, class405.field5877 + var66, -127);
                            boolean var68 = var46 <= var64 && var64 < var46 + var47 || var64 >= var49 && var64 < (var49 + var51) && var66 >= var48 && var48 + var50 > var66;
                            class205.field2686[var67].method2187(class639.field8876 * var66, class462.field6403 * var64, class639.field8876, class462.field6403, 0, 0, var68, true);
                        }
                    }
                }
            } else {
                class768.field10591 = true;
            }
        }
        if (class768.field10591) {
            class135.field1983 = arg17;
            class65.field918 = 0;
            class784.field10799 = 0.0D;
            class750.field10333 = arg4;
            class314.field4523 = 0;
            class134.field1965 = arg2;
            class109.field1510 = class111.field1526;
            class107.field1479 = class38.field584;
            if (class669.field9399 == 0) {
                class86.field1200.method549(class269.field3968);
            }
            class86.field1200.method543();
            class86.field1200.method483();
            class86.field1200.method458(class326.field4748);
            class298.field4325.method984(class135.field1983, class134.field1965, class750.field10333, class122.field1781, class373.field5401, class671.field9443);
            class86.field1200.method526(class298.field4325);
            if (class669.field9399 == 1) {
                class664.field9176 = var24;
                class404.field5866 = var23;
                class344.field5061 = var20;
                class550.field7452 = var19;
                class86.field1200.method540(class550.field7452, class344.field5061, class404.field5866, class664.field9176);
            } else {
                class344.field5061 = class38.field584 + var20;
                class664.field9176 = var24;
                class550.field7452 = class111.field1526 + var19;
                class404.field5866 = var23;
                class86.field1200.method540(class550.field7452, class344.field5061, class404.field5866, class664.field9176);
            }
            class9.field137 = 0.0D;
            class712.field9964.method91(0);
            class775.method4298(class712.field9964);
            class743.method4113(arg11, arg17, arg2, arg4, arg3, arg5, arg14, arg10, arg1, arg7, arg8, arg0, arg9, arg15, arg13, arg12, arg6, 1, false);
            class763.method4240();
            class768.field10591 = false;
            if (class669.field9399 == 0) {
                class86.field1200.method511();
            }
            if (class669.field9399 == 1) {
                class94.method756(15696);
            }
        }
        if (class669.field9399 == 0) {
            class269.field3968.method2188(class109.field1510, class107.field1479, class564.field7561, class670.field9427, 0, 0, true, true);
        }
        class37.field575++;
        class554.method3129((byte) -114, class784.field10799);
        class268.field3943 = class784.field10799;
        if (class669.field9399 == arg16 || class669.field9399 == 2) {
            if (class669.field9399 == 2) {
                class86.field1200.method458(class326.field4748);
                class86.field1200.method483();
            }
            class99.field1362 = var19 + class111.field1526 - class109.field1510 - class65.field918;
            class24.field383 = var20 + class38.field584 - class314.field4523 - class107.field1479;
            class670.field9425 = var23;
            class659.field9119 = var24;
            class86.field1200.method540(class99.field1362, class24.field383, class670.field9425, class659.field9119);
        } else if (class669.field9399 == 1) {
            class670.field9425 = var23;
            class24.field383 = var20 - class314.field4523;
            class99.field1362 = var19 - class65.field918;
            class659.field9119 = var24;
            class86.field1200.method540(class99.field1362, class24.field383, class670.field9425, class659.field9119);
            class86.field1200.method456(class109.field1510, class107.field1479, class564.field7561 + class109.field1510, class670.field9427 + class107.field1479);
        }
        class743.method4113(arg11, arg17, arg2, arg4, arg3, arg5, arg14, arg10, arg1, arg7, arg8, arg0, arg9, arg15, arg13, arg12, arg6, class669.field9399 == 2 ? 0 : 2, class669.field9399 == 1);
        class86.field1200.method543();
        class86.field1200.method540(var19, var20, var21, var22);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IB)I")
    public static final int method4014(int arg0, byte arg1) {
        field10025++;
        int var7 = arg0 - 1;
        if (arg1 != -100) {
            field10030 = null;
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
    public static void method4015(boolean arg0) {
        field10030 = null;
        field10024 = null;
        field10027 = null;
        if (!arg0) {
            field10030 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lfg;I)V")
    public static final void method4016(class139 arg0, int arg1) {
        if (arg1 != -3361) {
            method4014(-4, (byte) -60);
        }
        field10023++;
        if (class626.field8501 == null) {
            return;
        }
        class392 var2 = null;
        if (arg0.field2029 == 0) {
            var2 = (class392) class94.method752(arg0.field2018, arg0.field2034, arg0.field2033);
        }
        if (arg0.field2029 == 1) {
            var2 = (class392) class471.method2772(arg0.field2018, arg0.field2034, arg0.field2033);
        }
        if (arg0.field2029 == 2) {
            var2 = (class392) class771.method4264(arg0.field2018, arg0.field2034, arg0.field2033, field10031 == null ? (field10031 = method4018("he")) : field10031);
        }
        if (arg0.field2029 == 3) {
            var2 = (class392) class119.method988(arg0.field2018, arg0.field2034, arg0.field2033);
        }
        if (var2 == null) {
            arg0.field2019 = 0;
            arg0.field2028 = -1;
            arg0.field2026 = 0;
        } else {
            arg0.field2028 = var2.method31(-23356);
            arg0.field2026 = var2.method18(-10908);
            arg0.field2019 = var2.method17(-2132);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILsw;)I")
    public static final int method4017(int arg0, class787 arg1) {
        if (arg0 < 32) {
            return 88;
        }
        field10028++;
        if (class742.field10243 == arg1) {
            return 6407;
        } else if (class305.field4404 == arg1) {
            return 6408;
        } else if (class250.field3704 == arg1) {
            return 6406;
        } else if (class170.field2268 == arg1) {
            return 6409;
        } else if (class125.field1891 == arg1) {
            return 6410;
        } else if (class166.field2239 == arg1) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4018(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
