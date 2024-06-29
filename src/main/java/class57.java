import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class57 extends class23 {

    @OriginalMember(owner = "client!fa", name = "db", descriptor = "Z")
    private boolean field1088 = true;

    @OriginalMember(owner = "client!fa", name = "eb", descriptor = "Z")
    private boolean field1089 = true;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "Z")
    public static boolean field1077 = false;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "Li;")
    public static class88 field1080 = class208.method1425(105, "AUS");

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "Li;")
    private static class88 field1078 = class208.method1425(105, "wave:");

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "Li;")
    public static class88 field1084 = class208.method1425(105, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "Li;")
    public static class88 field1083 = field1078;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "Li;")
    public static class88 field1086 = field1078;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!fa", name = "cb", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!fa", name = "fb", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!fa", name = "gb", descriptor = "Lq;")
    public static class174 field1091;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        ++field1079;
        if (arg1 != -3) {
            this.method11((class46) null, -86, -108);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field369 = ~arg0.method347(26119) == -2;
                }
            } else {
                this.field1088 = ~arg0.method347(26119) == -2;
            }
        } else {
            this.field1089 = arg0.method347(26119) == 1;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIILq;I)V")
    public static final void method416(boolean arg0, int arg1, int arg2, class174 arg3, int arg4) {
        ++field1081;
        int var5 = arg3.field3382;
        if (~arg3.field3465 != -1) {
            if (~arg3.field3465 == -2) {
                arg3.field3382 = arg2 - arg3.field3503;
            } else if (arg3.field3465 == 2) {
                arg3.field3382 = arg3.field3503 * arg2 >> 14;
            } else if (arg3.field3465 == 3) {
                if (~arg3.field3392 != -3) {
                    if (~arg3.field3392 == -8) {
                        arg3.field3382 = (arg3.field3503 + -1) * arg3.field3468 + arg3.field3503 * 115;
                    }
                } else {
                    arg3.field3382 = (arg3.field3503 + -1) * arg3.field3468 + arg3.field3503 * 32;
                }
            }
        } else {
            arg3.field3382 = arg3.field3503;
        }
        int var6 = arg3.field3424;
        if (arg3.field3396 != 0) {
            if (~arg3.field3396 == -2) {
                arg3.field3424 = -arg3.field3420 + arg1;
            } else if (~arg3.field3396 == -3) {
                arg3.field3424 = arg3.field3420 * arg1 >> 14;
            } else if (arg3.field3396 == 3) {
                if (arg3.field3392 != 2) {
                    if (~arg3.field3392 == -8) {
                        arg3.field3424 = (arg3.field3420 - 1) * arg3.field3510 + arg3.field3420 * 12;
                    }
                } else {
                    arg3.field3424 = (arg3.field3420 + -1) * arg3.field3510 + arg3.field3420 * 32;
                }
            }
        } else {
            arg3.field3424 = arg3.field3420;
        }
        if (arg4 >= -93) {
            method420(45);
        }
        if (class116.field2105 && (~class80.method530(-881710560, arg3) != -1 || arg3.field3392 == 0)) {
            if (arg3.field3424 < 5 && ~arg3.field3382 > -6) {
                arg3.field3382 = 5;
                arg3.field3424 = 5;
            } else {
                if (~arg3.field3424 >= -1) {
                    arg3.field3424 = 5;
                }
                if (arg3.field3382 <= 0) {
                    arg3.field3382 = 5;
                }
            }
        }
        if (arg0 && arg3.field3428 != null) {
            if (~arg3.field3382 != ~var5 || ~arg3.field3424 != ~var6) {
                class39 var7 = new class39();
                var7.field681 = arg3.field3428;
                var7.field678 = arg3;
                class200.method1375(var7, -876775538);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)V")
    public static final void method417(int arg0, int arg1) {
        ++field1076;
        if (arg1 != -3) {
            if (arg1 != -2) {
                if (~arg1 == 0) {
                    class34.method227((byte) 125, class70.field1271, class29.field478, class223.field4196);
                } else if (arg1 != 3) {
                    if (arg1 == 4) {
                        class34.method227((byte) 119, class70.field1291, class8.field117, class55.field1016);
                    } else if (arg1 != 5) {
                        if (arg1 == 6) {
                            class34.method227((byte) -99, class70.field1266, class114.field2066, class65.field1186);
                        } else if (~arg1 != -8) {
                            if (~arg1 == -9) {
                                class34.method227((byte) 122, class70.field1267, class217.field4058, class159.field3076);
                            } else if (arg1 != 9) {
                                if (arg1 == 10) {
                                    class34.method227((byte) 122, class70.field1280, class217.field4059, class171.field3331);
                                } else if (arg1 != 11) {
                                    if (~arg1 != -13) {
                                        if (arg1 == 13) {
                                            class34.method227((byte) -127, class70.field1299, class80.field1445, class223.field4199);
                                        } else if (~arg1 != -15) {
                                            if (arg1 == 16) {
                                                class34.method227((byte) -43, class70.field1278, class227.field4261, class53.field998);
                                            } else if (arg1 != 17) {
                                                if (arg1 != 18) {
                                                    if (~arg1 != -20) {
                                                        if (~arg1 == -21) {
                                                            class34.method227((byte) 13, class70.field1289, class4.field56, class223.field4202);
                                                        } else if (~arg1 == -23) {
                                                            class34.method227((byte) -72, class70.field1284, class48.field896, class246.field4510);
                                                        } else if (~arg1 != -24) {
                                                            if (~arg1 != -25) {
                                                                if (arg1 == 25) {
                                                                    class34.method227((byte) 118, class70.field1283, class10.field143, class223.field4208);
                                                                } else if (arg1 == 26) {
                                                                    class34.method227((byte) -100, class70.field1301, class53.field983, class109.field2000);
                                                                } else if (~arg1 != -28) {
                                                                    class34.method227((byte) -117, class70.field1304, class247.field4526, class223.field4209);
                                                                } else {
                                                                    class34.method227((byte) 119, class70.field1279, class70.field1296, class161.field3114);
                                                                }
                                                            } else {
                                                                class34.method227((byte) -57, class70.field1303, class132.field2472, class232.field4350);
                                                            }
                                                        } else {
                                                            class34.method227((byte) 118, class70.field1269, class48.field906, class154.field2990);
                                                        }
                                                    } else {
                                                        class34.method227((byte) 121, class230.field4319, class155.field3004, class117.field2113);
                                                    }
                                                } else {
                                                    class34.method227((byte) 117, class70.field1287, class29.field480, class102.field1848);
                                                }
                                            } else {
                                                class34.method227((byte) -3, class70.field1272, class20.field312, class153.field2953);
                                            }
                                        } else {
                                            class34.method227((byte) 119, class70.field1300, class166.field3193, class154.field2970);
                                        }
                                    } else {
                                        class34.method227((byte) -38, class70.field1282, class122.field2228, class210.field3993);
                                    }
                                } else {
                                    class34.method227((byte) 125, class70.field1286, class48.field902, class200.field3825);
                                }
                            } else {
                                class34.method227((byte) -49, class70.field1293, class220.field4167, class16.field243);
                            }
                        } else {
                            class34.method227((byte) 120, class70.field1302, class88.field1655, class230.field4321);
                        }
                    } else {
                        class34.method227((byte) -16, class70.field1305, class223.field4207, class175.field3527);
                    }
                } else {
                    class34.method227((byte) 120, class70.field1297, class70.field1268, class236.field4401);
                }
            } else {
                class34.method227((byte) 127, class70.field1274, class70.field1294, class151.field2928);
            }
        } else {
            class34.method227((byte) 120, class70.field1273, class11.field162, class223.field4211);
        }
        int var2 = -36 % ((-35 - arg0) / 60);
        class131.method883(10, 65536);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIILq;Lrc;I)V")
    public static final void method418(int arg0, int arg1, int arg2, int arg3, class174 arg4, class188 arg5, int arg6) {
        ++field1082;
        if (arg5 != null) {
            int var7 = 2047 & class52.field943 + class207.field3932;
            int var8 = arg3 * arg3 + arg6 * arg6;
            int var9 = 10 + Math.max(arg4.field3382 / 2, arg4.field3424 / 2);
            if (~var8 >= ~(var9 * var9)) {
                int var10 = class173.field3356[var7];
                int var11 = var10 * 256 / (class65.field1185 + 256);
                if (arg2 != 13481) {
                    method420(21);
                }
                int var12 = class173.field3361[var7];
                int var13 = var12 * 256 / (class65.field1185 - -256);
                int var14 = arg3 * var11 + -(arg6 * var13) >> 16;
                int var15 = arg3 * var13 + arg6 * var11 >> 16;
                ((class169) arg5).method1167(arg4.field3382 / 2 + arg1 + var15 + -(arg5.field3651 / 2), arg4.field3424 / 2 + -(arg5.field3647 / 2) + arg0 + -var14, arg4.field3404, arg4.field3423);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class57() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        if (arg1 != 13) {
            return null;
        } else {
            ++field1085;
            int[][] var3 = super.field364.method1541(true, arg0);
            if (super.field364.field4312) {
                int[][] var4 = this.method121(0, (byte) 97, !this.field1088 ? arg0 : -arg0 + class220.field4160);
                int[] var5 = var4[0];
                int[] var6 = var4[2];
                int[] var7 = var4[1];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (!this.field1089) {
                    for (int var11 = 0; ~class70.field1276 < ~var11; ++var11) {
                        var8[var11] = var5[var11];
                        var9[var11] = var7[var11];
                        var10[var11] = var6[var11];
                    }
                } else {
                    for (int var12 = 0; ~class70.field1276 < ~var12; ++var12) {
                        var8[var12] = var5[-var12 + class45.field789];
                        var9[var12] = var7[-var12 + class45.field789];
                        var10[var12] = var6[class45.field789 - var12];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        ++field1075;
        int[] var3 = super.field379.method1080(false, arg0);
        if (super.field379.field3100) {
            int[] var4 = this.method120(this.field1088 ? -arg0 + class220.field4160 : arg0, false, 0);
            if (this.field1089) {
                for (int var5 = 0; var5 < class70.field1276; ++var5) {
                    var3[var5] = var4[-var5 + class45.field789];
                }
            } else {
                class124.method840(var4, 0, var3, 0, class70.field1276);
            }
        }
        if (arg1 <= 19) {
            method418(-104, -17, 75, 42, (class174) null, (class188) null, -52);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)I")
    public static final int method419(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1090;
        int var5 = -class173.field3356[arg3 * 1024 / arg0] + 65536 >> 1;
        int var6 = 118 / ((-76 - arg1) / 47);
        return ((65536 - var5) * arg2 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V")
    public static void method420(int arg0) {
        field1083 = null;
        field1080 = null;
        field1078 = null;
        if (arg0 == -15) {
            field1091 = null;
            field1084 = null;
            field1086 = null;
        }
    }
}
