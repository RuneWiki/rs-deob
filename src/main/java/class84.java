import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class84 extends class392 {

    @OriginalMember(owner = "client!mba", name = "j", descriptor = "[B")
    public static byte[] field1268 = new byte[2048];

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!mba", name = "i", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!mba", name = "m", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!mba", name = "n", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!mba", name = "o", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!mba", name = "p", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)V")
    public static void method744(int arg0) {
        field1268 = null;
        if (arg0 > -47) {
            field1268 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "(I)I")
    public final int method745(int arg0) {
        ++field1266;
        if (arg0 != 17539) {
            this.method290(-104, 8);
        }
        return super.field5452;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;B)V")
    public static final void method746(int arg0, boolean arg1, String arg2, String arg3, byte arg4) {
        ++field1274;
        class302 var5 = class99.method815(-18016);
        var5.field4341.method2524(false, class260.field3691.field9792);
        if (arg4 >= -48) {
            method747((byte) -49, (class431) null);
        }
        var5.field4341.method2546(true, 0);
        int var6 = var5.field4341.field5983;
        var5.field4341.method2546(true, 643);
        int[] var7 = class14.method168((byte) 118, var5);
        int var8 = var5.field4341.field5983;
        var5.field4341.method2566(-2, arg3);
        var5.field4341.method2546(true, class276.field3953);
        var5.field4341.method2566(-2, arg2);
        var5.field4341.method2563(true, class578.field8335);
        var5.field4341.method2524(false, class423.field5892);
        var5.field4341.method2524(false, class113.field1647.field482);
        class113.method932((byte) -117, var5.field4341);
        String var9 = class18.field190;
        var5.field4341.method2524(false, var9 != null ? 1 : 0);
        if (var9 != null) {
            var5.field4341.method2566(-2, var9);
        }
        var5.field4341.method2524(false, arg0);
        var5.field4341.method2524(false, arg1 ? 1 : 0);
        var5.field4341.field5983 += 7;
        var5.field4341.method2583(var5.field4341.field5983, var7, -58, var8);
        var5.field4341.method2516(-var6 + var5.field4341.field5983, true);
        class501.method2928(0, var5);
        class657.field9273 = -3;
        class624.field8862 = 0;
        class100.field1492 = 1;
        class578.field8333 = 0;
        if (arg0 < 13) {
            class477.field6535 = true;
            class337.method2063((byte) -51);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BLol;)Lfaa;")
    public static final class473 method747(byte arg0, class431 arg1) {
        ++field1265;
        class473 var2 = new class473();
        var2.field6436 = arg1.method2565((byte) -117);
        if (arg0 != 74) {
            return null;
        } else {
            var2.field6431 = class502.field6884.method2392(var2.field6436, 32767);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Luf;Lha;III)V")
    public static final void method748(class519 arg0, class475 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 71) {
            method746(-86, true, (String) null, (String) null, (byte) 59);
        }
        ++field1267;
        class88 var5 = arg0.method3047(115, arg1);
        if (var5 != null) {
            arg1.method488(arg2, arg4, arg0.field7128 + arg2, arg0.field7255 + arg4);
            if (class198.field2985 != 2 && class198.field2985 != 5 && class136.field2268 != null) {
                int var6;
                int var7;
                int var8;
                int var9;
                if (class783.field10725 == 4) {
                    var6 = class45.field598;
                    var7 = (int) (-class98.field1423) & 16383;
                    var8 = class374.field5256;
                    var9 = 4096;
                } else {
                    var6 = class719.field10041.field10350;
                    var7 = (int) (-class98.field1423) + class654.field9251 & 16383;
                    var9 = -(class592.field8487 * 16) + 4096;
                    var8 = class719.field10041.field10347;
                }
                int var10 = 48 - (-(var8 / 128) - 208 - -(class192.field2891 * 2));
                int var11 = class456.field6225 * 4 + 48 - (var6 / 128 + (class456.field6225 - 104) * 2);
                class136.field2268.method753((float) arg0.field7128 / 2.0F + (float) arg2, (float) arg0.field7255 / 2.0F + (float) arg4, (float) var10, (float) var11, var9, var7 << 2, var5, arg2, arg4);
                for (class725 var12 = (class725) class470.field6400.method3731((byte) -75); var12 != null; var12 = (class725) class470.field6400.method3729((byte) -111)) {
                    int var58 = var12.field10098;
                    int var59 = ((268432246 & class447.field6170.field1167[var58]) >> 14) + -class222.field3266;
                    int var60 = (class447.field6170.field1167[var58] & 16383) - class697.field9798;
                    int var61 = var59 * 4 + 2 + -(var8 / 128);
                    int var62 = var60 * 4 - -2 + -(var6 / 128);
                    class780.method4282(arg4, var5, arg0, arg1, arg2, var62, class447.field6170.field1168[var58], (byte) 106, var61);
                }
                for (int var13 = 0; class504.field6921 > var13; ++var13) {
                    int var55 = class608.field8644[var13] * 4 + -(var8 / 128) + 2;
                    int var56 = class102.field1503[var13] * 4 - var6 / 128 + 2;
                    class416 var57 = class312.field4418.method369((byte) 125, class361.field5090[var13]);
                    if (var57.field5736 != null) {
                        var57 = var57.method2458(class578.field8328, -1);
                        if (var57 == null || var57.field5737 == -1) {
                            continue;
                        }
                    }
                    class780.method4282(arg4, var5, arg0, arg1, arg2, var56, var57.field5737, (byte) 77, var55);
                }
                for (class482 var14 = (class482) class400.field5509.method4254((byte) 8); var14 != null; var14 = (class482) class400.field5509.method4251(-104)) {
                    int var50 = (int) (3L & var14.field10592 >> 28);
                    if (~class286.field4207 == ~var50) {
                        int var51 = (int) (16383L & var14.field10592) - class222.field3266;
                        int var52 = (int) (var14.field10592 >> 14 & 16383L) - class697.field9798;
                        int var53 = var51 * 4 - -2 + -(var8 / 128);
                        int var54 = var52 * 4 + 2 + -(var6 / 128);
                        class406.method2403(arg0, arg2, (byte) -118, var5, arg4, var54, var53, class673.field9427[0]);
                    }
                }
                for (int var15 = 0; var15 < class657.field9270; ++var15) {
                    class647 var45 = (class647) class486.field6697.method4253((long) class350.field4963[var15], -1);
                    if (var45 != null) {
                        class506 var46 = var45.field9191;
                        if (var46.method2967(-115) && ~class719.field10041.field10361 == ~var46.field10361) {
                            class179 var47 = var46.field6964;
                            if (var47 != null && var47.field2683 != null) {
                                var47 = var47.method1304(class578.field8328, -25917);
                            }
                            if (var47 != null && var47.field2726 && var47.field2720) {
                                int var48 = var46.field10347 / 128 + -(var8 / 128);
                                int var49 = var46.field10350 / 128 + -(var6 / 128);
                                if (~var47.field2679 != 0) {
                                    class780.method4282(arg4, var5, arg0, arg1, arg2, var49, var47.field2679, (byte) 114, var48);
                                } else {
                                    class406.method2403(arg0, arg2, (byte) 59, var5, arg4, var49, var48, class673.field9427[1]);
                                }
                            }
                        }
                    }
                }
                int var16 = class469.field6382;
                int[] var17 = class464.field6311;
                for (int var18 = 0; var16 > var18; ++var18) {
                    class21 var37 = class588.field8451[var17[var18]];
                    if (var37 != null && var37.method206(-91) && !var37.field221 && class719.field10041 != var37 && ~class719.field10041.field10361 == ~var37.field10361) {
                        int var38 = var37.field10347 / 128 + -(var8 / 128);
                        int var39 = var37.field10350 / 128 - var6 / 128;
                        boolean var40 = false;
                        for (int var41 = 0; var41 < class381.field5340; ++var41) {
                            if (var37.field212.equals(class586.field8428[var41]) && class276.field3930[var41] != 0) {
                                var40 = true;
                                break;
                            }
                        }
                        boolean var42 = false;
                        for (int var43 = 0; class92.field1324 > var43; ++var43) {
                            if (var37.field212.equals(class288.field4217[var43].field9309)) {
                                var42 = true;
                                break;
                            }
                        }
                        boolean var44 = false;
                        if (~class719.field10041.field204 != -1 && var37.field204 != 0 && class719.field10041.field204 == var37.field204) {
                            var44 = true;
                        }
                        if (!var37.field206) {
                            if (!var37.field215) {
                                if (!var40) {
                                    if (!var42) {
                                        if (var44) {
                                            class406.method2403(arg0, arg2, (byte) -93, var5, arg4, var39, var38, class673.field9427[4]);
                                        } else {
                                            class406.method2403(arg0, arg2, (byte) -85, var5, arg4, var39, var38, class673.field9427[2]);
                                        }
                                    } else {
                                        class406.method2403(arg0, arg2, (byte) 73, var5, arg4, var39, var38, class673.field9427[5]);
                                    }
                                } else {
                                    class406.method2403(arg0, arg2, (byte) -79, var5, arg4, var39, var38, class673.field9427[3]);
                                }
                            } else {
                                class406.method2403(arg0, arg2, (byte) 60, var5, arg4, var39, var38, class673.field9427[7]);
                            }
                        } else {
                            class406.method2403(arg0, arg2, (byte) -127, var5, arg4, var39, var38, class673.field9427[6]);
                        }
                    }
                }
                class780[] var19 = class55.field870;
                for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                    class780 var23 = var19[var20];
                    if (var23 != null && var23.field10692 != 0 && class594.field8494 % 20 < 10) {
                        if (var23.field10692 == 1) {
                            class647 var24 = (class647) class486.field6697.method4253((long) var23.field10686, -1);
                            if (var24 != null) {
                                class506 var25 = var24.field9191;
                                int var26 = var25.field10347 / 128 - var8 / 128;
                                int var27 = var25.field10350 / 128 + -(var6 / 128);
                                class203.method1427(arg2, arg4, arg0, var26, var27, 360000L, var5, -68, var23.field10689);
                            }
                        }
                        if (~var23.field10692 == -3) {
                            int var28 = var23.field10688 / 128 + -(var8 / 128);
                            int var29 = var23.field10687 / 128 + -(var6 / 128);
                            long var30 = (long) (var23.field10693 << 7);
                            long var32 = var30 * var30;
                            class203.method1427(arg2, arg4, arg0, var28, var29, var32, var5, -62, var23.field10689);
                        }
                        if (~var23.field10692 == -11 && var23.field10686 >= 0 && class588.field8451.length > var23.field10686) {
                            class21 var34 = class588.field8451[var23.field10686];
                            if (var34 != null) {
                                int var35 = var34.field10347 / 128 + -(var8 / 128);
                                int var36 = var34.field10350 / 128 + -(var6 / 128);
                                class203.method1427(arg2, arg4, arg0, var35, var36, 360000L, var5, -98, var23.field10689);
                            }
                        }
                    }
                }
                if (~class783.field10725 != -5) {
                    if (class263.field3717 != 0) {
                        int var21 = class263.field3717 * 4 + 2 + -(var8 / 128) + (class719.field10041.method209(true) + -1) * 2;
                        int var22 = class104.field1516 * 4 + -(var6 / 128) + 2 - (-(class719.field10041.method209(true) * 2) - -2);
                        class406.method2403(arg0, arg2, (byte) 99, var5, arg4, var22, var21, class329.field4677[class687.field9717 ? 1 : 0]);
                    }
                    if (!class719.field10041.field221) {
                        arg1.method2765(arg0.field7255 / 2 + (arg4 - 1), 3, 118, -1, arg0.field7128 / 2 + arg2 + -1, 3);
                        return;
                    }
                }
            } else {
                arg1.method464(-16777216, var5, arg2, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(Z)V")
    public final void method291(boolean arg0) {
        if (super.field5454.field9482.method2337((byte) 82) && !class402.method2391(-2, super.field5454.field9482.method2338(17539))) {
            super.field5452 = 0;
        }
        ++field1270;
        if (arg0) {
            this.method292(true);
        }
        if (super.field5452 < 0 || ~super.field5452 < -3) {
            super.field5452 = this.method292(!arg0);
        }
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(II)I")
    public final int method290(int arg0, int arg1) {
        ++field1273;
        if (!class402.method2391(-2, super.field5454.field9482.method2338(17539))) {
            return 3;
        } else {
            if (arg1 >= -124) {
                field1268 = null;
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)I")
    public final int method292(boolean arg0) {
        ++field1272;
        if (!arg0) {
            method747((byte) 47, (class431) null);
        }
        return 0;
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lw;)V")
    public class84(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BI)V")
    public final void method286(byte arg0, int arg1) {
        super.field5452 = arg1;
        ++field1271;
        int var3 = 127 % ((arg0 - -80) / 38);
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(ILw;)V")
    public class84(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "(I)Z")
    public final boolean method749(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field1269;
            return class402.method2391(-2, super.field5454.field9482.method2338(17539));
        }
    }
}
