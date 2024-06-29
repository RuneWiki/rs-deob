import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class534 {

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Z")
    public static boolean field7494 = false;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Z")
    public static boolean field7498 = false;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field7501 = "";

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field7493;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([BZ)[B")
    public final byte[] method3036(byte[] arg0, boolean arg1) {
        if (!arg1) {
            return null;
        }
        field7500++;
        class179 var3 = new class179(arg0);
        var3.field2354 = arg0.length - 4;
        int var4 = var3.method1138(27980);
        byte[] var5 = new byte[var4];
        var3.field2354 = 0;
        this.method3037(var3, -1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class534() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ltn;I[B)V")
    public final void method3037(class179 arg0, int arg1, byte[] arg2) {
        if (arg1 != -1) {
            return;
        }
        field7496++;
        if (arg0.field2325[arg0.field2354] != 31 || arg0.field2325[arg0.field2354 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field7493 == null) {
            this.field7493 = new Inflater(true);
        }
        try {
            this.field7493.setInput(arg0.field2325, arg0.field2354 + 10, arg0.field2325.length + -arg0.field2354 + -18);
            this.field7493.inflate(arg2);
        } catch (Exception var4) {
            this.field7493.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field7493.reset();
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIBI)V")
    public static final void method3038(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field7499++;
        if (arg3 != -69) {
            return;
        }
        int var5 = class393.field5484;
        if (var5 == 0) {
            return;
        }
        if (var5 == 1) {
            class423.field6027 = arg1;
            class393.field5484 = 2;
            class303.field3890 = arg4;
            class453.field6360 = arg2;
            class614.field8598 = arg0;
        } else if (var5 == 2) {
            if (class453.field6360 > arg2) {
                class453.field6360 = arg2;
            }
            if (class303.field3890 < arg4) {
                class303.field3890 = arg4;
            }
            if (arg0 < class614.field8598) {
                class614.field8598 = arg0;
            }
            if (class423.field6027 < arg1) {
                class423.field6027 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBILha;)V")
    public static final void method3039(int arg0, byte arg1, int arg2, class454 arg3) {
        field7497++;
        if (arg2 < 0 || arg0 < 0 || class717.field10116 == 0 || class127.field1535 == 0) {
            return;
        }
        int var4;
        int var5;
        int var6;
        int var7;
        class376 var8;
        int var9;
        int var10;
        if (class107.field1323) {
            class614.method3370(true, false);
            var8 = arg3.method94();
            int[] var11 = arg3.method71();
            var6 = var11[2];
            var7 = var11[0];
            var4 = var11[3];
            var5 = var11[1];
            var9 = class457.method2677(false, (byte) -94) + arg2;
            var10 = class192.method1207(126, false) + arg0;
        } else {
            arg3.method117(class54.field784, class462.field6692, class717.field10116, class127.field1535);
            var4 = class127.field1535;
            var5 = class462.field6692;
            var6 = class717.field10116;
            var7 = class54.field784;
            arg3.method131(class349.field4521, class409.field5776, class717.field10116, class127.field1535);
            var8 = arg3.method125();
            var8.method1966(class273.field3456, class376.field5267, class543.field7643, class236.field3044, class666.field9118, class700.field9879);
            arg3.method77(var8);
            var9 = arg2;
            var10 = arg0;
        }
        class702.method3896(-123, true);
        if (var6 == 0) {
            var6 = 1;
        }
        if (var4 == 0) {
            var4 = 1;
        }
        if (class716.field10106 != null && (!class138.field1656 || (class337.field4352 & 0x40) != 0)) {
            int var12 = -1;
            int var13 = -1;
            int var14 = arg3.method147();
            int var15 = arg3.method108();
            int var16;
            int var17;
            int var18;
            int var19;
            if (class306.field3936) {
                var17 = var16 = (var10 - var5) * class468.field6738 / var4;
                var19 = var18 = (var9 - var7) * class468.field6738 / var6;
            } else {
                var16 = (var10 - var5) * var15 / var4;
                var18 = (var9 - var7) * var15 / var6;
                var17 = (var10 - var5) * var14 / var4;
                var19 = (var9 - var7) * var14 / var6;
            }
            int[] var20 = new int[] { var19, var17, var14 };
            int[] var21 = new int[] { var18, var16, var15 };
            var8.method1968(var20);
            var8.method1968(var21);
            float var22 = class590.method3281((float) var20[2], (byte) 110, (float) var21[1], (float) var20[1], (float) var20[0], (float) var21[2], (float) var21[0], 4);
            if (var22 > 0.0F) {
                int var23 = var21[0] - var20[0];
                int var24 = var21[2] - var20[2];
                int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                var12 = var25 + (class339.field4374.method253((byte) -27) - 1 << 8) >> 9;
                var13 = var26 + (class339.field4374.method253((byte) -27) - 1 << 8) >> 9;
                byte var27 = class339.field4374.field5779;
                if (var27 < 3 && (class215.field2728[1][var25 >> 9][var26 >> 9] & 0x2) != 0) {
                    int var87 = var27 + 1;
                }
            }
            if (var12 != -1 && var13 != -1) {
                if (class138.field1656 && (class337.field4352 & 0x40) != 0) {
                    class460 var28 = class611.method3340(class210.field2693, class545.field7651, -96);
                    if (var28 == null) {
                        class463.method2742((byte) 88);
                    } else {
                        class425.method2528(10, " ->", -1, true, arg1 - 238, (long) (var12 << 0 | var13), class556.field7800, 0L, false, var12, var13, true, class586.field8192);
                    }
                } else {
                    if (class245.field3148) {
                        class425.method2528(49, "", -1, true, 1, (long) (var13 | var12 << 0), class586.field8152.method3261(class416.field5920, (byte) 82), 0L, false, var12, var13, true, -1);
                    }
                    class425.method2528(48, "", -1, true, -113, (long) (var13 | var12 << 0), class364.field5167, 0L, false, var12, var13, true, class548.field7736);
                    class524.field7414++;
                }
            }
        }
        if (class107.field1323) {
            class586.method3263((byte) -106);
        }
        for (int var29 = 0; var29 < (class107.field1323 ? 2 : 1); var29++) {
            boolean var30 = var29 == 0;
            class616 var31 = var30 ? class469.field6740 : class220.field2793;
            int var32 = arg2;
            int var33 = arg0;
            if (class107.field1323) {
                class614.method3370(true, var30);
                var32 = arg2 + class457.method2677(var30, (byte) 112);
                var33 = arg0 + class192.method1207(arg1 - 1, var30);
            }
            class314 var34 = var31.field8623;
            for (class607 var35 = (class607) var34.method1839(-121); var35 != null; var35 = (class607) var34.method1836((byte) -26)) {
                if ((class7.field77 || class339.field4374.field5779 == var35.field8417.field5779) && var35.method3330(var32, var33, -94, arg3)) {
                    boolean var36 = false;
                    boolean var37 = false;
                    int var38;
                    int var39;
                    if ((var35.field8417 instanceof class451)) {
                        var39 = ((class451) var35.field8417).field6321;
                        var38 = ((class451) var35.field8417).field6328;
                    } else {
                        var38 = var35.field8417.field5784 >> 9;
                        var39 = var35.field8417.field5790 >> 9;
                    }
                    if (var35.field8417 instanceof class546) {
                        class546 var40 = (class546) var35.field8417;
                        int var41 = var40.method253((byte) -27);
                        if ((var41 & 0x1) == 0 && (var40.field5790 & 0x1FF) == 0 && (var40.field5784 & 0x1FF) == 0 || (var41 & 0x1) == 1 && (var40.field5790 & 0x1FF) == 256 && (var40.field5784 & 0x1FF) == 256) {
                            int var42 = var40.field5790 - (var40.method253((byte) -27) - 1 << 8);
                            int var43 = var40.field5784 - (var40.method253((byte) -27) - 1 << 8);
                            for (int var44 = 0; var44 < class443.field6200; var44++) {
                                class247 var51 = (class247) class563.field7875.method3248((long) class61.field832[var44], 0);
                                if (var51 != null) {
                                    class124 var52 = var51.field3158;
                                    if (class266.field3368 != var52.field410 && var52.field417) {
                                        int var53 = var52.field5790 - (var52.field1486.field1928 - 1 << 8);
                                        int var54 = var52.field5784 - (var52.field1486.field1928 - 1 << 8);
                                        if (var53 >= var42 && var52.field1486.field1928 <= (var40.method253((byte) -27) - (var53 - var42 >> 9)) && var43 <= var54 && var52.field1486.field1928 <= (var40.method253((byte) -27) - (var54 - var43 >> 9))) {
                                            class348.method2038(class339.field4374.field5779 != var35.field8417.field5779, (byte) 126, var52);
                                            var52.field410 = class266.field3368;
                                        }
                                    }
                                }
                            }
                            int var45 = class627.field8745;
                            int[] var46 = class274.field3465;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class546 var48 = class447.field6287[var46[var47]];
                                if (var48 != null && class266.field3368 != var48.field410 && var40 != var48 && var48.field417) {
                                    int var49 = var48.field5790 - (var48.method253((byte) -27) - 1 << 8);
                                    int var50 = var48.field5784 - (var48.method253((byte) -27) - 1 << 8);
                                    if (var42 <= var49 && var48.method253((byte) -27) <= (var40.method253((byte) -27) - (var49 - var42 >> 9)) && var43 <= var50 && var48.method253((byte) -27) <= var40.method253((byte) -27) - (var50 - var43 >> 9)) {
                                        class654.method3532(var48, (byte) 14, class339.field4374.field5779 != var35.field8417.field5779);
                                        var48.field410 = class266.field3368;
                                    }
                                }
                            }
                        }
                        if (class266.field3368 == var40.field410) {
                            continue;
                        }
                        class654.method3532(var40, (byte) 14, class339.field4374.field5779 != var35.field8417.field5779);
                        var40.field410 = class266.field3368;
                    }
                    if (var35.field8417 instanceof class124) {
                        class124 var55 = (class124) var35.field8417;
                        if (var55.field1486 != null) {
                            if ((var55.field1486.field1928 & 0x1) == 0 && (var55.field5790 & 0x1FF) == 0 && (var55.field5784 & 0x1FF) == 0 || (var55.field1486.field1928 & 0x1) == 1 && (var55.field5790 & 0x1FF) == 256 && (var55.field5784 & 0x1FF) == 256) {
                                int var56 = var55.field5790 - (var55.field1486.field1928 - 1 << 8);
                                int var57 = var55.field5784 - (var55.field1486.field1928 - 1 << 8);
                                for (int var58 = 0; var58 < class443.field6200; var58++) {
                                    class247 var65 = (class247) class563.field7875.method3248((long) class61.field832[var58], 0);
                                    if (var65 != null) {
                                        class124 var66 = var65.field3158;
                                        if (class266.field3368 != var66.field410 && var55 != var66 && var66.field417) {
                                            int var67 = var66.field5790 - (var66.field1486.field1928 - 1 << 8);
                                            int var68 = var66.field5784 - (var66.field1486.field1928 - 1 << 8);
                                            if (var56 <= var67 && (var55.field1486.field1928 - (var67 - var56 >> 9)) >= var66.field1486.field1928 && var68 >= var57 && (var55.field1486.field1928 - (var68 - var57 >> 9)) >= var66.field1486.field1928) {
                                                class348.method2038(class339.field4374.field5779 != var35.field8417.field5779, (byte) 119, var66);
                                                var66.field410 = class266.field3368;
                                            }
                                        }
                                    }
                                }
                                int var59 = class627.field8745;
                                int[] var60 = class274.field3465;
                                for (int var61 = 0; var61 < var59; var61++) {
                                    class546 var62 = class447.field6287[var60[var61]];
                                    if (var62 != null && class266.field3368 != var62.field410 && var62.field417) {
                                        int var63 = var62.field5790 - (var62.method253((byte) -27) - 1 << 8);
                                        int var64 = var62.field5784 - (var62.method253((byte) -27) - 1 << 8);
                                        if (var56 <= var63 && var62.method253((byte) -27) <= (var55.field1486.field1928 - (var63 - var56 >> 9)) && var57 <= var64 && var62.method253((byte) -27) <= (var55.field1486.field1928 - (var64 - var57 >> 9))) {
                                            class654.method3532(var62, (byte) 14, class339.field4374.field5779 != var35.field8417.field5779);
                                            var62.field410 = class266.field3368;
                                        }
                                    }
                                }
                            }
                            if (class266.field3368 == var55.field410) {
                                continue;
                            }
                            class348.method2038(class339.field4374.field5779 != var35.field8417.field5779, (byte) 121, var55);
                            var55.field410 = class266.field3368;
                        }
                    }
                    if (var35.field8417 instanceof class118) {
                        int var69 = class63.field851 + var39;
                        int var70 = class753.field10509 + var38;
                        class585 var71 = (class585) class497.field7028.method3248((long) (var69 | var70 << 14 | var35.field8417.field5779 << 28), 0);
                        if (var71 != null) {
                            int var72 = 0;
                            for (class11 var73 = (class11) var71.field8118.method3119(true); var73 != null; var73 = (class11) var71.field8118.method3120((byte) 93)) {
                                class167 var74 = class190.field2488.method3944(256, var73.field127);
                                if (class138.field1656 && class339.field4374.field5779 == var35.field8417.field5779) {
                                    class49 var75 = class652.field8984 == -1 ? null : class188.field2466.method3449(arg1 + 2408, class652.field8984);
                                    if ((class337.field4352 & 0x1) != 0 && (var75 == null || var74.method1048(false, class652.field8984, var75.field720) != var75.field720)) {
                                        class425.method2528(25, class741.field10370 + " -> <col=ff9040>" + var74.field2149, -1, true, 22, (long) var72, class556.field7800, (long) var73.field127, false, var39, var38, false, class586.field8192);
                                        class388.field5392++;
                                    }
                                }
                                if (class339.field4374.field5779 == var35.field8417.field5779) {
                                    String[] var76 = var74.field2197;
                                    for (int var77 = 4; var77 >= 0; var77--) {
                                        if (var76 != null && var76[var77] != null) {
                                            byte var78 = 0;
                                            if (var77 == 0) {
                                                var78 = 4;
                                            }
                                            int var79 = class423.field6015;
                                            if (var77 == 1) {
                                                var78 = 9;
                                            }
                                            if (var77 == 2) {
                                                var78 = 23;
                                            }
                                            if (var77 == 3) {
                                                var78 = 19;
                                            }
                                            if (var74.field2172 == var77) {
                                                var79 = var74.field2147;
                                            }
                                            if (var77 == 4) {
                                                var78 = 12;
                                            }
                                            if (var74.field2209 == var77) {
                                                var79 = var74.field2182;
                                            }
                                            class425.method2528(var78, "<col=ff9040>" + var74.field2149, -1, true, 71, (long) var72, var76[var77], (long) var73.field127, false, var39, var38, false, var79);
                                            class529.field7468++;
                                        }
                                    }
                                }
                                class425.method2528(1010, "<col=ff9040>" + var74.field2149, -1, true, -94, (long) var72, class586.field8147.method3261(class416.field5920, (byte) 82), (long) var73.field127, class339.field4374.field5779 != var35.field8417.field5779, var39, var38, false, class464.field6716);
                                class24.field420++;
                                var72++;
                            }
                        }
                    }
                    if (var35.field8417 instanceof class559) {
                        class559 var80 = (class559) var35.field8417;
                        class290 var81 = class358.field5112.method890(var80.method735(24123), false);
                        if (var81.field3685 != null) {
                            var81 = var81.method1739((byte) -120, class461.field6637);
                        }
                        if (var81 != null) {
                            if (class138.field1656 && class339.field4374.field5779 == var35.field8417.field5779) {
                                class49 var82 = class652.field8984 == -1 ? null : class188.field2466.method3449(arg1 + 2408, class652.field8984);
                                if ((class337.field4352 & 0x4) != 0 && (var82 == null || var81.method1742(var82.field720, 49, class652.field8984) != var82.field720)) {
                                    class414.field5848++;
                                    class425.method2528(5, class741.field10370 + " -> <col=00ffff>" + var81.field3699, -1, true, -93, (long) var80.hashCode(), class556.field7800, class432.method2571(var39, var80, -1980257458, var38), false, var39, var38, false, class586.field8192);
                                }
                            }
                            if (class339.field4374.field5779 == var35.field8417.field5779) {
                                String[] var83 = var81.field3722;
                                if (var83 != null) {
                                    for (int var84 = 4; var84 >= 0; var84--) {
                                        if (var83[var84] != null) {
                                            short var85 = 0;
                                            int var86 = class423.field6015;
                                            if (var84 == 0) {
                                                var85 = 51;
                                            }
                                            if (var84 == 1) {
                                                var85 = 44;
                                            }
                                            if (var84 == 2) {
                                                var85 = 3;
                                            }
                                            if (var84 == 3) {
                                                var85 = 50;
                                            }
                                            if (var81.field3719 == var84) {
                                                var86 = var81.field3693;
                                            }
                                            if (var84 == 4) {
                                                var85 = 1003;
                                            }
                                            if (var81.field3714 == var84) {
                                                var86 = var81.field3775;
                                            }
                                            class425.method2528(var85, "<col=00ffff>" + var81.field3699, -1, true, arg1 - 113, (long) var80.hashCode(), var83[var84], class432.method2571(var39, var80, arg1 ^ 0x89F7AB37, var38), false, var39, var38, false, var86);
                                            class292.field3790++;
                                        }
                                    }
                                }
                                class425.method2528(1002, "<col=00ffff>" + var81.field3699, -1, true, 39, (long) var80.hashCode(), class586.field8147.method3261(class416.field5920, (byte) 82), (long) var81.field3771, class339.field4374.field5779 != var35.field8417.field5779, var39, var38, false, class464.field6716);
                                class317.field4073++;
                            }
                        }
                    }
                }
            }
            if (class107.field1323) {
                class586.method3263((byte) -107);
            }
        }
        if (arg1 != 121) {
            field7495 = 78;
        }
        class702.method3896(arg1 - 124, false);
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(III)V")
    private class534(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static void method3040(byte arg0) {
        if (arg0 >= -124) {
            method3040((byte) 74);
        }
        field7501 = null;
    }
}
