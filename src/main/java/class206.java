import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class206 extends class408 implements class118 {

    @OriginalMember(owner = "client!pq", name = "J", descriptor = "Lwj;")
    private class415 field2659;

    @OriginalMember(owner = "client!pq", name = "E", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!pq", name = "G", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!pq", name = "H", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!pq", name = "I", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!pq", name = "K", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!pq", name = "L", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!pq", name = "M", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!pq", name = "N", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!pq", name = "O", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!pq", name = "P", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ldt;I)Lcd;")
    public static final class333 method1349(class254 arg0, int arg1) {
        ++field2654;
        if (arg1 != 7402) {
            method1350(118, (class459) null, 127, 80, (class758) null);
        }
        class673 var2 = class746.method4088((byte) 121)[arg0.method1731((byte) 64)];
        class705 var3 = class717.method3966((byte) 27)[arg0.method1731((byte) 64)];
        int var4 = arg0.method1695(arg1 ^ 423946018);
        int var5 = arg0.method1695(arg1 ^ 423946018);
        int var6 = arg0.method1728((byte) 81);
        int var7 = arg0.method1728((byte) 55);
        int var8 = arg0.method1695(423951304);
        int var9 = arg0.method1672(-16516);
        int var10 = arg0.method1672(-16516);
        return new class333(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILaf;IILcm;)V")
    public static final void method1350(int arg0, class459 arg1, int arg2, int arg3, class758 arg4) {
        ++field2665;
        byte var5 = -1;
        if (~(512 & arg2) != -1) {
            int var6 = arg1.method1712(0);
            arg4.field6131 = arg1.method1731((byte) 64);
            arg4.field6152 = arg1.method1691(111);
            arg4.field6159 = 32767 & var6;
            arg4.field6145 = (32768 & var6) != 0;
            arg4.field6130 = class572.field7788 + arg4.field6159 - -arg4.field6131;
        }
        if ((arg2 & 4) != 0) {
            int var7 = arg1.method1712(0);
            if (~var7 == -65536) {
                var7 = -1;
            }
            arg4.field6149 = var7;
        }
        if ((arg2 & 262144) != 0) {
            int var8 = arg1.method1736(117);
            int var9 = arg1.method1724(arg0 ^ 11725);
            if (~var8 == -65536) {
                var8 = -1;
            }
            int var10 = arg1.method1731((byte) 64);
            int var11 = var10 & 7;
            int var12 = (var10 & 120) >> 3;
            if (~var12 == -16) {
                var12 = -1;
            }
            arg4.method2557(2, (byte) -84, var11, var12, var8, var9);
        }
        if ((arg2 & 128) != 0) {
            int[] var13 = new int[4];
            for (int var14 = 0; ~var14 > -5; ++var14) {
                var13[var14] = arg1.method1703((byte) 93);
                if (var13[var14] == 65535) {
                    var13[var14] = -1;
                }
            }
            int var15 = arg1.method1691(arg0 ^ 11673);
            class661.method3663(arg4, var13, (byte) 91, var15);
        }
        if ((arg2 & 32768) != 0) {
            int var16 = arg1.method1736(-13);
            int var17 = arg1.method1672(-16516);
            if (~var16 == -65536) {
                var16 = -1;
            }
            int var18 = arg1.method1711(-122);
            int var19 = 7 & var18;
            int var20 = (126 & var18) >> 3;
            if (~var20 == -16) {
                var20 = -1;
            }
            arg4.method2557(1, (byte) -84, var19, var20, var16, var17);
        }
        if ((8 & arg2) != 0) {
            int var21 = arg1.method1711(arg0 + -11842);
            if (var21 > 0) {
                for (int var22 = 0; ~var21 < ~var22; ++var22) {
                    int var23 = -1;
                    int var24 = -1;
                    int var25 = arg1.method1673(-32768);
                    int var26 = -1;
                    if (~var25 != -32768) {
                        if (~var25 != -32767) {
                            var24 = arg1.method1673(-32768);
                        } else {
                            var25 = -1;
                        }
                    } else {
                        var25 = arg1.method1673(arg0 ^ -21043);
                        var24 = arg1.method1673(-32768);
                        var23 = arg1.method1673(-32768);
                        var26 = arg1.method1673(arg0 + -44493);
                    }
                    int var27 = arg1.method1673(arg0 + -44493);
                    int var28 = arg1.method1691(99);
                    arg4.method2569(var25, var23, var27, class572.field7788, var26, arg0 + -11525, var24, var28);
                }
            }
        }
        if ((arg2 & 256) != 0) {
            int var29 = arg1.method1676(arg0 ^ 11570);
            int[] var30 = new int[var29];
            int[] var31 = new int[var29];
            int[] var32 = new int[var29];
            for (int var33 = 0; var29 > var33; ++var33) {
                int var34 = arg1.method1728((byte) 49);
                if (~var34 == -65536) {
                    var34 = -1;
                }
                var30[var33] = var34;
                var31[var33] = arg1.method1691(126);
                var32[var33] = arg1.method1728((byte) 124);
            }
            class659.method3656((byte) 101, arg4, var31, var32, var30);
        }
        if ((arg2 & 32) != 0) {
            class747.field10072[arg3] = arg1.method1683(-32070);
        }
        if (arg0 == 11725) {
            if (~(524288 & arg2) != -1) {
                arg4.field6148 = arg1.method1683(-32070);
                arg4.field6113 = arg1.method1737(true);
                arg4.field6120 = arg1.method1683(arg0 ^ -20617);
                arg4.field6153 = (byte) arg1.method1731((byte) 64);
                arg4.field6185 = class572.field7788 - -arg1.method1736(124);
                arg4.field6129 = class572.field7788 - -arg1.method1703((byte) 121);
            }
            if (~(arg2 & 8192) != -1) {
                arg4.field10373 = ~arg1.method1691(111) == -2;
            }
            if ((arg2 & 2) != 0) {
                int var35 = arg1.method1703((byte) 75);
                int var36 = arg1.method1724(0);
                if (~var35 == -65536) {
                    var35 = -1;
                }
                int var37 = arg1.method1691(109);
                int var38 = 7 & var37;
                int var39 = 15 & var37 >> 3;
                if (var39 == 15) {
                    var39 = -1;
                }
                arg4.method2557(0, (byte) -84, var38, var39, var35, var36);
            }
            if (~(arg2 & 1024) != -1) {
                var5 = arg1.method1687(-128);
            }
            if ((arg2 & 16) != 0) {
                int var40 = arg1.method1691(114);
                byte[] var41 = new byte[var40];
                class254 var42 = new class254(var41);
                arg1.method1714((byte) 126, 0, var40, var41);
                class243.field3193[arg3] = var42;
                arg4.method4155(false, var42);
            }
            if ((131072 & arg2) != 0) {
                arg4.field10397 = ~arg1.method1711(arg0 ^ -11699) == -2;
            }
            if ((2048 & arg2) != 0) {
                arg4.field6182 = arg1.method1699(-115);
                if (arg4.field6182.charAt(0) != '~') {
                    if (class625.field8475 == arg4) {
                        class26.method148(0, arg4.field6182, -120, arg4.field10354, 2, arg4.method4156((byte) 40, true), arg4.method4159(0, false));
                    }
                } else {
                    arg4.field6182 = arg4.field6182.substring(1);
                    class26.method148(0, arg4.field6182, -75, arg4.field10354, 2, arg4.method4156((byte) 40, true), arg4.method4159(0, false));
                }
                arg4.field6123 = 0;
                arg4.field6133 = 150;
                arg4.field6137 = 0;
            }
            if (~(16384 & arg2) != -1) {
                arg4.field6105 = arg1.method1687(arg0 ^ -11699);
                arg4.field6126 = arg1.method1680(arg0 ^ -11650);
                arg4.field6154 = arg1.method1683(arg0 ^ -20617);
                arg4.field6102 = arg1.method1683(-32070);
                arg4.field6165 = arg1.method1712(0) - -class572.field7788;
                arg4.field6104 = arg1.method1728((byte) 83) - -class572.field7788;
                arg4.field6107 = arg1.method1676(arg0 + -11470);
                if (arg4.field10359) {
                    arg4.field6102 += arg4.field10376;
                    arg4.field6126 += arg4.field10376;
                    arg4.field6154 += arg4.field10352;
                    arg4.field6195 = 0;
                    arg4.field6105 += arg4.field10352;
                } else {
                    arg4.field6154 += arg4.field6198[0];
                    arg4.field6195 = 1;
                    arg4.field6126 += arg4.field6197[0];
                    arg4.field6102 += arg4.field6197[0];
                    arg4.field6105 += arg4.field6198[0];
                }
                arg4.field6200 = 0;
            }
            if ((arg2 & 1) != 0) {
                arg4.field10368 = arg1.method1728((byte) 94);
                if (arg4.field6195 == 0) {
                    arg4.method2558(arg4.field10368, -1);
                    arg4.field10368 = -1;
                }
            }
            if ((arg2 & 65536) != 0) {
                int var43 = arg1.method1676(255);
                int[] var44 = new int[var43];
                int[] var45 = new int[var43];
                for (int var46 = 0; var46 < var43; ++var46) {
                    int var47 = arg1.method1736(arg0 + -11603);
                    if (~(49152 & var47) != -49153) {
                        var44[var46] = var47;
                    } else {
                        int var48 = arg1.method1736(122);
                        var44[var46] = class670.method3699(var47 << 16, var48);
                    }
                    var45[var46] = arg1.method1736(119);
                }
                arg4.method2572(var44, -28573, var45);
            }
            if (arg4.field10359) {
                if (var5 != 127) {
                    byte var49;
                    if (~var5 != 0) {
                        var49 = var5;
                    } else {
                        var49 = class747.field10072[arg3];
                    }
                    class249.method1560(var49, true, arg4);
                    arg4.method4166(arg4.field10352, arg4.field10376, 2, var49);
                } else {
                    arg4.method4163(arg4.field10376, (byte) -111, arg4.field10352);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIILha;IIIIILmfa;I)V")
    public static final void method1351(int arg0, int arg1, int arg2, int arg3, class66 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class641 arg10, int arg11) {
        if (arg11 != 34963) {
            field2664 = 2;
        }
        ++field2661;
        if (arg3 > arg2 && arg3 < arg2 + arg6 && arg1 + -13 < arg0 && ~(arg1 + 3) < ~arg0) {
            arg5 = arg7;
        }
        String var12 = class624.method3444(arg10, 98);
        class88.field1251.method558(0, arg5, class634.field8573, class584.field7966, arg1, 0, arg2 + 3, var12);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)I")
    public final int method84(int arg0) {
        if (arg0 > -80) {
            return -44;
        } else {
            ++field2658;
            return super.method84(-92);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z[[[BIBIIZ)V")
    public static final void method1352(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class781.field10714 = 0;
        class683.field9124 = 0;
        ++class228.field2949;
        if ((arg5 & 2) == 0) {
            for (class214 var8 = class737.field10005[var7]; var8 != null; var8 = var8.field2808) {
                if (!class760.method4188(var8, arg0, arg1, arg2, arg3)) {
                    class134.method942(var8);
                    if (var8.field2806 != -1) {
                        class98.field1437[class781.field10714++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 1) == 0) {
            for (class214 var9 = class151.field2056[var7]; var9 != null; var9 = var9.field2808) {
                if (!class760.method4188(var9, arg0, arg1, arg2, arg3)) {
                    class134.method942(var9);
                    if (var9.field2806 != -1) {
                        class347.field4909[class683.field9124++] = var9;
                    }
                }
            }
            for (class214 var10 = class570.field7774[var7]; var10 != null; var10 = var10.field2808) {
                if (!class760.method4188(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method777(-117)) {
                        class134.method942(var10);
                        if (var10.field2806 != -1) {
                            class347.field4909[class683.field9124++] = var10;
                        }
                    } else {
                        class134.method942(var10);
                        if (var10.field2806 != -1) {
                            class98.field1437[class781.field10714++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class25.field250; ++var11) {
                    if (!class760.method4188(class281.field4062[var11], arg0, arg1, arg2, arg3)) {
                        class134.method942(class281.field4062[var11]);
                        if (class281.field4062[var11].field2806 != -1) {
                            if (class281.field4062[var11].method777(70)) {
                                class347.field4909[class683.field9124++] = class281.field4062[var11];
                            } else {
                                class98.field1437[class781.field10714++] = class281.field4062[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class781.field10714 > 0) {
            class608.method3386(class98.field1437, 0, class781.field10714 - 1);
            for (int var12 = 0; var12 < class781.field10714; ++var12) {
                class462.method2732(class98.field1437[var12], true, arg6);
            }
        }
        if (class181.field2375) {
            class34.field372.method481(0, (class127[]) null);
        }
        if ((arg5 & 2) == 0) {
            for (int var13 = class455.field6519; var13 < class504.field7090; ++var13) {
                if (var13 >= arg2 && arg1 != null) {
                    int var14 = class408.field5778.length;
                    if (class408.field5778.length + class226.field2923 > class196.field2540) {
                        var14 -= class408.field5778.length + class226.field2923 - class196.field2540;
                    }
                    int var15 = class408.field5778[0].length;
                    if (class408.field5778[0].length + class177.field2342 > class247.field3229) {
                        var15 -= class408.field5778[0].length + class177.field2342 - class247.field3229;
                    }
                    boolean[][] var16 = class368.field5311;
                    if (class148.field1989) {
                        if (class522.field7253) {
                            var16 = class767.field10529[var13];
                        }
                        for (int var17 = class473.field6656; var17 < var14; ++var17) {
                            int var18 = class226.field2923 + var17 - class473.field6656;
                            for (int var19 = class377.field5491; var19 < var15; ++var19) {
                                var16[var17][var19] = false;
                                if (class408.field5778[var17][var19]) {
                                    int var20 = class177.field2342 + var19 - class377.field5491;
                                    for (int var21 = var13; var21 >= 0; --var21) {
                                        if (class443.field6387[var21][var18][var20] != null && class443.field6387[var21][var18][var20].field2521 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class482.method2835(83, var13, var18, var20)) {
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
                    if (class522.field7253) {
                        if (arg4 >= 0) {
                            class645.field8694[var13].method194(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
                        } else {
                            class645.field8694[var13].method185(0, 0, 0, (boolean[][]) null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class419.field6025; ++var22) {
                            class267.field3910[var22].method1091(new class463(var13 + 1), 0);
                        }
                    } else if (arg4 >= 0) {
                        class645.field8694[var13].method194(class130.field1787, class468.field6610, class278.field4025, class368.field5311, false, arg4, arg5);
                    } else {
                        class645.field8694[var13].method185(class130.field1787, class468.field6610, class278.field4025, class368.field5311, false, arg5);
                    }
                } else {
                    int var23 = class408.field5778.length;
                    if (class408.field5778.length + class226.field2923 > class196.field2540) {
                        var23 -= class408.field5778.length + class226.field2923 - class196.field2540;
                    }
                    int var24 = class408.field5778[0].length;
                    if (class408.field5778[0].length + class177.field2342 > class247.field3229) {
                        var24 -= class408.field5778[0].length + class177.field2342 - class247.field3229;
                    }
                    boolean[][] var25 = class368.field5311;
                    if (class148.field1989) {
                        if (class522.field7253) {
                            var25 = class767.field10529[var13];
                        }
                        for (int var26 = class473.field6656; var26 < var23; ++var26) {
                            int var27 = class226.field2923 + var26 - class473.field6656;
                            for (int var28 = class377.field5491; var28 < var24; ++var28) {
                                if (class408.field5778[var26][var28] && !class482.method2835(-59, var13, var27, class177.field2342 + var28 - class377.field5491)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class522.field7253) {
                        if (arg4 >= 0) {
                            class645.field8694[var13].method194(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
                        } else {
                            class645.field8694[var13].method185(0, 0, 0, (boolean[][]) null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class419.field6025; ++var29) {
                            class267.field3910[var29].method1091(new class463(var13 + 1), 0);
                        }
                    } else if (arg4 >= 0) {
                        class645.field8694[var13].method194(class130.field1787, class468.field6610, class278.field4025, class368.field5311, true, arg4, arg5);
                    } else {
                        class645.field8694[var13].method185(class130.field1787, class468.field6610, class278.field4025, class368.field5311, true, arg5);
                    }
                }
            }
        }
        if (class683.field9124 > 0) {
            class329.method2133(class347.field4909, 0, class683.field9124 - 1);
            for (int var30 = 0; var30 < class683.field9124; ++var30) {
                class462.method2732(class347.field4909[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)Lwj;")
    public final class415 method848(byte arg0) {
        if (arg0 != -92) {
            this.method848((byte) 115);
        }
        ++field2657;
        return this.field2659;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIFII[BIFFFIFILmm;)V")
    public static final void method1353(int arg0, int arg1, float arg2, int arg3, int arg4, byte[] arg5, int arg6, float arg7, float arg8, float arg9, int arg10, float arg11, int arg12, class294 arg13) {
        ++field2655;
        int var14 = arg10 * arg12;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg1; ++var16) {
            arg13.method1891(arg2 / (float) arg4, var15, arg3, arg4, -87, arg10, arg12, 0, arg11 / (float) arg10, arg7 * 127.0F, arg8 / (float) arg12);
            int var19 = arg0;
            arg8 *= 2.0F;
            for (int var20 = 0; var14 > var20; ++var20) {
                arg5[var19] = (byte) ((int) ((float) arg5[var19] + var15[var20]));
                ++var19;
            }
            arg11 *= 2.0F;
            arg2 *= 2.0F;
            arg7 *= arg9;
        }
        int var17 = arg0;
        if (arg6 != 1) {
            field2664 = -100;
        }
        for (int var18 = 0; ~var14 < ~var18; ++var18) {
            arg5[var17] = (byte) (arg5[var17] + 127);
            ++var17;
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lsha;Lwj;Z)V")
    public class206(class757 arg0, class415 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field2659 = arg1;
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V")
    public final void method851(int arg0) {
        ++field2660;
        super.method851(arg0);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V")
    public final void method850(int arg0, int arg1) {
        if (arg0 == -8165) {
            ++field2656;
            super.method850(arg0, this.field2659.field5982 * arg1);
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Z")
    public final boolean method849(int arg0) {
        ++field2663;
        if (arg0 != 18579) {
            this.field2659 = null;
        }
        return super.method2454(super.field5769.field10328, true);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method847(int arg0, boolean arg1) {
        if (arg0 >= -115) {
            this.field2659 = null;
        }
        ++field2662;
        return super.method2450((byte) 93, super.field5769.field10328, arg1);
    }
}
