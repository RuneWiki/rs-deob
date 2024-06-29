import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class412 extends class406 {

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
    public int field6261 = -1;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "[I")
    public static int[] field6265 = new int[1000];

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
    public static int field6263 = 0;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "I")
    public int field6264;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "Ljava/lang/String;")
    public String field6257;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "Ljava/lang/String;")
    public String field6260;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIIIIBI)V", line = 9)
    public static final void method2537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        ++field6258;
        if (class86.method587(-123, arg6)) {
            int var10 = 41 % ((-49 - arg8) / 41);
            if (class41.field614[arg6] != null) {
                client.method1341(class41.field614[arg6], -1, arg7, arg2, arg3, arg0, arg9, arg1, arg4, arg5);
            } else {
                client.method1341(class263.field3690[arg6], -1, arg7, arg2, arg3, arg0, arg9, arg1, arg4, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)Z", line = 29)
    public static final boolean method2538(int arg0, int arg1, int arg2) {
        ++field6267;
        if (arg2 != 34) {
            field6263 = 107;
        }
        return (arg0 & 34) != 0;
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)V", line = 41)
    public static void method2539(int arg0) {
        if (arg0 != 0) {
            method2539(-27);
        }
        field6265 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BIILik;Lwk;)V", line = 63)
    public static final void method2540(byte arg0, int arg1, int arg2, class141 arg3, class96 arg4) {
        ++field6259;
        if (~(8 & arg1) != -1) {
            class487.field7212[arg2] = arg3.method1092(true);
        }
        byte var5 = -1;
        if ((arg1 & 2) != 0) {
            arg4.field1386 = arg3.method1058(-882090520);
            if (~arg4.field3918 == -1) {
                arg4.method1766((byte) -117, arg4.field1386);
                arg4.field1386 = -1;
            }
        }
        if (~(arg1 & 4) != -1) {
            int var6 = arg3.method1077((byte) -119);
            int var7 = arg3.method1086((byte) 16);
            arg4.method1770(var7, var6, class393.field6017, -29331);
            arg4.field3865 = class393.field6017 + 300;
            arg4.field3898 = arg3.method1087(false);
        }
        if ((arg1 & 16) != 0) {
            int var8 = arg3.method1058(arg0 + -882090451);
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg3.method1086((byte) 126);
            class328.method2117(var8, arg4, var9, false);
        }
        if (~(2048 & arg1) != -1) {
            arg4.field1388 = arg3.method1087(false) == 1;
        }
        if (~(262144 & arg1) != -1) {
            int var10 = arg3.method1079(-13703);
            if (~var10 == -65536) {
                var10 = -1;
            }
            int var11 = arg3.method1059((byte) 30);
            int var12 = arg3.method1086((byte) 2);
            arg4.method1773(true, var12, var11, var10, (byte) -73);
        }
        if ((arg1 & 4096) != 0) {
            int var13 = class393.field6017;
            int var14 = arg3.method1077((byte) -119);
            int var15 = arg3.method1067(false);
            arg4.method1770(var15, var14, var13, -29331);
        }
        if (~(64 & arg1) != -1) {
            int var16 = arg3.method1058(-882090520);
            int var17 = arg3.method1087(false);
            int var18 = arg3.method1067(false);
            int var19 = arg3.field2185;
            boolean var20 = (32768 & var16) != 0;
            if (arg4.field1393 != null && arg4.field1401 != null) {
                boolean var21 = false;
                if (~var17 >= -2) {
                    if (var20 || (!class230.field3300 || class60.field865) && !class195.field2613) {
                        if (class240.method1578((byte) -101, arg4.field1393)) {
                            var21 = true;
                        }
                    } else {
                        var21 = true;
                    }
                }
                if (!var21 && class288.field4211 == 0) {
                    class405.field6145.field2185 = 0;
                    arg3.method1106(var18, (byte) -72, class405.field6145.field2219, 0);
                    class405.field6145.field2185 = 0;
                    int var22 = -1;
                    String var24;
                    if (var20) {
                        var16 &= 32767;
                        class186 var23 = class487.method2919(true, class405.field6145);
                        var22 = var23.field2504;
                        var24 = var23.field2507.method1236(false, class405.field6145);
                    } else {
                        var24 = class319.method1993(class109.method688(class405.field6145, true), 13499);
                    }
                    arg4.field3862 = var24.trim();
                    arg4.field3816 = var16 >> 8;
                    arg4.field3854 = var16 & 255;
                    arg4.field3879 = 150;
                    int var25;
                    if (var17 != 1 && ~var17 != -3) {
                        var25 = !var20 ? 2 : 17;
                    } else {
                        var25 = var20 ? 17 : 1;
                    }
                    if (~var17 != -3) {
                        if (var17 != 1) {
                            class525.method3111(var24, (String) null, var25, arg4.method640(arg0 + 324, true), var22, arg0 ^ -28294, arg4.method645((byte) 90, false), 0);
                        } else {
                            class525.method3111(var24, (String) null, var25, "<img=0>" + arg4.method640(255, true), var22, 28353, "<img=0>" + arg4.method645((byte) 90, false), 0);
                        }
                    } else {
                        class525.method3111(var24, (String) null, var25, "<img=1>" + arg4.method640(255, true), var22, 28353, "<img=1>" + arg4.method645((byte) 90, false), 0);
                    }
                }
            }
            arg3.field2185 = var18 + var19;
        }
        if (~(1024 & arg1) != -1) {
            int var26 = arg3.method1100(-25469);
            arg4.field3904 = arg3.method1087(false);
            arg4.field3866 = arg3.method1067(false);
            arg4.field3883 = var26 & 32767;
            arg4.field3858 = (32768 & var26) != 0;
            arg4.field3876 = class393.field6017 - -arg4.field3883 - -arg4.field3904;
        }
        if (arg0 != -69) {
            method2537(43, -106, 44, 68, 66, 11, 6, 127, (byte) -125, 48);
        }
        if ((256 & arg1) != 0) {
            arg4.field3830 = arg3.method1065(-3881);
            arg4.field3857 = arg3.method1065(-3881);
            arg4.field3869 = arg3.method1103(0);
            arg4.field3841 = arg3.method1092(true);
            arg4.field3817 = arg3.method1079(-13703) - -class393.field6017;
            arg4.field3870 = arg3.method1074(-635989152) + class393.field6017;
            arg4.field3814 = arg3.method1067(false);
            arg4.field3910 = 0;
            if (arg4.field1427) {
                arg4.field3918 = 0;
                arg4.field3857 += arg4.field1387;
                arg4.field3841 += arg4.field1387;
                arg4.field3869 += arg4.field1432;
                arg4.field3830 += arg4.field1432;
            } else {
                arg4.field3918 = 1;
                arg4.field3869 += arg4.field3917[0];
                arg4.field3830 += arg4.field3917[0];
                arg4.field3857 += arg4.field3915[0];
                arg4.field3841 += arg4.field3915[0];
            }
        }
        if ((32768 & arg1) != 0) {
            int var27 = arg3.method1100(-25469);
            int var28 = arg3.method1059((byte) 30);
            if (~var27 == -65536) {
                var27 = -1;
            }
            int var29 = arg3.method1087(false);
            arg4.method1773(false, var29, var28, var27, (byte) -73);
        }
        if ((32 & arg1) != 0) {
            int var30 = arg3.method1100(-25469);
            if (~var30 == -65536) {
                var30 = -1;
            }
            arg4.field3833 = var30;
        }
        if (~(arg1 & 512) != -1) {
            var5 = arg3.method1092(true);
        }
        if (~(131072 & arg1) != -1) {
            int var31 = arg3.method1086((byte) 110);
            int[] var32 = new int[var31];
            int[] var33 = new int[var31];
            int[] var34 = new int[var31];
            for (int var35 = 0; ~var35 > ~var31; ++var35) {
                int var36 = arg3.method1100(-25469);
                if (var36 == 65535) {
                    var36 = -1;
                }
                var32[var35] = var36;
                var33[var35] = arg3.method1087(false);
                var34[var35] = arg3.method1100(-25469);
            }
            class537.method3170((byte) 104, var34, var33, var32, arg4);
        }
        if ((65536 & arg1) != 0) {
            arg4.field3873 = arg3.method1103(arg0 ^ -69);
            arg4.field3826 = arg3.method1088((byte) 109);
            arg4.field3881 = arg3.method1103(arg0 ^ -69);
            arg4.field3825 = (byte) arg3.method1086((byte) 121);
            arg4.field3903 = class393.field6017 - -arg3.method1074(-635989152);
            arg4.field3896 = class393.field6017 + arg3.method1074(-635989152);
        }
        if ((16384 & arg1) != 0) {
            arg4.field3862 = arg3.method1064(false);
            if (arg4.field3862.charAt(0) == '~') {
                arg4.field3862 = arg4.field3862.substring(1);
                class71.method494(0, arg4.method640(255, true), 2, (byte) 89, arg4.method645((byte) 90, false), arg4.field3862);
            } else if (class56.field800 == arg4) {
                class71.method494(0, arg4.method640(arg0 ^ -188, true), 2, (byte) 110, arg4.method645((byte) 90, false), arg4.field3862);
            }
            arg4.field3854 = 0;
            arg4.field3816 = 0;
            arg4.field3879 = 150;
        }
        if (~(128 & arg1) != -1) {
            int var37 = arg3.method1067(false);
            byte[] var38 = new byte[var37];
            class164 var39 = new class164(var38);
            arg3.method1106(var37, (byte) -103, var38, 0);
            class391.field5980[arg2] = var39;
            arg4.method641(var39, (byte) 90);
        }
        if (arg4.field1427) {
            if (var5 == 127) {
                arg4.method635(arg4.field1387, arg4.field1432, -1);
            } else {
                byte var40;
                if (~var5 == 0) {
                    var40 = class487.field7212[arg2];
                } else {
                    var40 = var5;
                }
                arg4.method639((byte) 116, var40, arg4.field1387, arg4.field1432);
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)Lgp;", line = 399)
    public final class35 method2541(int arg0) {
        ++field6262;
        if (arg0 != 4) {
            this.field6261 = 106;
        }
        return class325.field4735[super.field6159];
    }
}
