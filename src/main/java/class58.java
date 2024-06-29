import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class58 extends class487 {

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "I")
    private int field1028;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    private int field1024;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "I")
    private int field1031;

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "I")
    private int field1034;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    private int field1029;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    private int field1022;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    private int field1021;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "I")
    private int field1033;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "Liv;")
    public static class64 field1026 = new class64(69, 2);

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IBI)V")
    public final void method515(int arg0, byte arg1, int arg2) {
        ++field1035;
        int var4 = this.field1033 * arg0 >> 12;
        int var5 = this.field1028 * arg2 >> 12;
        int var6 = this.field1031 * arg0 >> 12;
        int var7 = this.field1022 * arg2 >> 12;
        int var8 = this.field1021 * arg0 >> 12;
        int var9 = this.field1034 * arg2 >> 12;
        int var10 = this.field1024 * arg0 >> 12;
        if (arg1 != 12) {
            this.field1033 = 18;
        }
        int var11 = this.field1029 * arg2 >> 12;
        class388.method2395(var7, var11, var8, (byte) 13, super.field7216, var5, var6, var10, var9, var4);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V")
    public final void method516(int arg0, int arg1, int arg2) {
        ++field1027;
        if (arg2 <= 41) {
            this.method516(24, 81, 68);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "([II)Ljava/lang/String;")
    public static final String method517(int[] arg0, int arg1) {
        ++field1030;
        StringBuffer var2 = new StringBuffer();
        if (arg1 <= 87) {
            return null;
        } else {
            int var3 = class214.field3081;
            for (int var4 = 0; arg0.length > var4; ++var4) {
                class402 var5 = class495.field7314.method972((byte) 74, arg0[var4]);
                if (var5.field6052 != -1) {
                    class529 var6 = (class529) class171.field2647.method494(0, (long) var5.field6052);
                    if (var6 == null) {
                        class279 var7 = class279.method1789(class151.field2407, var5.field6052, 0);
                        if (var7 != null) {
                            var6 = class4.field109.method304(var7, true);
                            class171.field2647.method485((long) var5.field6052, (byte) -125, var6);
                        }
                    }
                    if (var6 != null) {
                        class11.field186[var3] = var6;
                        var2.append(" <img=").append(var3).append(">");
                        ++var3;
                    }
                }
            }
            return var2.toString();
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1028 = arg1;
        this.field1024 = arg6;
        this.field1031 = arg2;
        this.field1034 = arg5;
        this.field1029 = arg7;
        this.field1022 = arg3;
        this.field1021 = arg4;
        this.field1033 = arg0;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lln;Lck;III)V")
    public static final void method518(class256 arg0, class452 arg1, int arg2, int arg3, int arg4) {
        ++field1025;
        if (~(1 & arg4) != -1) {
            int var5 = arg1.method1063((byte) -77);
            byte[] var6 = new byte[var5];
            class145 var7 = new class145(var6);
            arg1.method1087(var6, var5, 16711680, 0);
            class445.field6640[arg2] = var7;
            arg0.method1661((byte) -108, var7);
        }
        byte var8 = -1;
        if (~(arg4 & 64) != -1) {
            arg0.field3726 = arg1.method1069((byte) -60);
            if (arg0.field7690 == 0) {
                arg0.method3088(arg0.field3726, -80);
                arg0.field3726 = -1;
            }
        }
        if ((arg4 & 16384) != 0) {
            int var9 = class531.field7821;
            int var10 = arg1.method1119(-125);
            int var11 = arg1.method1065((byte) -125);
            arg0.method3084(var10, 16842, var9, var11);
        }
        if (~(arg4 & 65536) != -1) {
            int var12 = arg1.method1079(arg3 + 22460);
            if (~var12 == -65536) {
                var12 = -1;
            }
            int var13 = arg1.method1077(1148025000);
            int var14 = arg1.method1063((byte) -79);
            arg0.method3082((byte) -90, var14, var12, var13, true);
        }
        if (~(4096 & arg4) != -1) {
            arg0.field3685 = arg1.method1063((byte) 105) == 1;
        }
        if ((arg4 & 128) != 0) {
            int var15 = arg1.method1119(arg3 ^ -22517);
            int var16 = arg1.method1063((byte) -14);
            arg0.method3084(var15, 16842, class531.field7821, var16);
            arg0.field7616 = class531.field7821 + 300;
            arg0.field7652 = arg1.method1063((byte) 102);
        }
        if ((arg4 & 16) != 0) {
            class515.field7582[arg2] = arg1.method1100(85);
        }
        if ((8 & arg4) != 0) {
            int var17 = arg1.method1116(arg3 + 22599);
            int var18 = arg1.method1118(-14);
            int var19 = arg1.method1120((byte) -15);
            int var20 = arg1.field2289;
            boolean var21 = (var17 & 32768) != 0;
            if (arg0.field3684 != null && arg0.field3717 != null) {
                boolean var22 = false;
                if (var18 <= 1) {
                    if (var21 || (!class436.field6497 || class45.field853) && !class63.field1091) {
                        if (class334.method2140(0, arg0.field3684)) {
                            var22 = true;
                        }
                    } else {
                        var22 = true;
                    }
                }
                if (!var22 && ~class8.field143 == -1) {
                    class242.field3483.field2289 = 0;
                    arg1.method1087(class242.field3483.field2270, var19, 16711680, 0);
                    class242.field3483.field2289 = 0;
                    int var23 = -1;
                    String var25;
                    if (var21) {
                        var17 &= 32767;
                        class511 var24 = class388.method2397(-121, class242.field3483);
                        var23 = var24.field7537;
                        var25 = var24.field7545.method190((byte) 89, class242.field3483);
                    } else {
                        var25 = class263.method1698(class449.method2684(arg3 ^ -10298, class242.field3483), 0);
                    }
                    arg0.field7657 = var25.trim();
                    arg0.field7653 = 255 & var17;
                    arg0.field7606 = 150;
                    arg0.field7643 = var17 >> 8;
                    int var26;
                    if (~var18 != -2 && var18 != 2) {
                        var26 = !var21 ? 2 : 17;
                    } else {
                        var26 = !var21 ? 1 : 17;
                    }
                    if (~var18 != -3) {
                        if (~var18 == -2) {
                            class80.method640((byte) 93, var25, var26, var23, (String) null, "<img=0>" + arg0.method1660((byte) -127, false), "<img=0>" + arg0.method1663((byte) 74, true), 0);
                        } else {
                            class80.method640((byte) 124, var25, var26, var23, (String) null, arg0.method1660((byte) -128, false), arg0.method1663((byte) 118, true), 0);
                        }
                    } else {
                        class80.method640((byte) 124, var25, var26, var23, (String) null, "<img=1>" + arg0.method1660((byte) 99, false), "<img=1>" + arg0.method1663((byte) 100, true), 0);
                    }
                }
            }
            arg1.field2289 = var19 + var20;
        }
        if ((arg4 & 32768) != 0) {
            var8 = arg1.method1093(15);
        }
        if (~(arg4 & 256) != -1) {
            arg0.field7657 = arg1.method1101((byte) -125);
            if (arg0.field7657.charAt(0) != '~') {
                if (class139.field2224 == arg0) {
                    class431.method2581(0, 2, arg0.field7657, arg0.method1663((byte) 69, true), arg0.method1660((byte) 27, false), (byte) 52);
                }
            } else {
                arg0.field7657 = arg0.field7657.substring(1);
                class431.method2581(0, 2, arg0.field7657, arg0.method1663((byte) 89, true), arg0.method1660((byte) 24, false), (byte) 72);
            }
            arg0.field7653 = 0;
            arg0.field7606 = 150;
            arg0.field7643 = 0;
        }
        if ((arg4 & 131072) != 0) {
            int var27 = arg1.method1118(-29);
            int[] var28 = new int[var27];
            int[] var29 = new int[var27];
            int[] var30 = new int[var27];
            for (int var31 = 0; var27 > var31; ++var31) {
                int var32 = arg1.method1079(arg3 + 22578);
                if (var32 == 65535) {
                    var32 = -1;
                }
                var28[var31] = var32;
                var29[var31] = arg1.method1120((byte) -67);
                var30[var31] = arg1.method1116(128);
            }
            class317.method2063(var28, arg0, -115, var29, var30);
        }
        if ((arg4 & 2048) != 0) {
            arg0.field7648 = arg1.method1093(15);
            arg0.field7615 = arg1.method1100(arg3 ^ -22442);
            arg0.field7654 = arg1.method1093(15);
            arg0.field7672 = arg1.method1111((byte) -110);
            arg0.field7611 = arg1.method1069((byte) -66) - -class531.field7821;
            arg0.field7677 = arg1.method1069((byte) -24) + class531.field7821;
            arg0.field7671 = arg1.method1118(-70);
            if (arg0.field3691) {
                arg0.field7690 = 0;
                arg0.field7648 += arg0.field3724;
                arg0.field7672 += arg0.field3704;
                arg0.field7654 += arg0.field3724;
                arg0.field7615 += arg0.field3704;
            } else {
                arg0.field7690 = 1;
                arg0.field7648 += arg0.field7692[0];
                arg0.field7672 += arg0.field7694[0];
                arg0.field7654 += arg0.field7692[0];
                arg0.field7615 += arg0.field7694[0];
            }
            arg0.field7687 = 0;
        }
        if (arg3 == -22471) {
            if (~(arg4 & 4) != -1) {
                int var33 = arg1.method1074((byte) -81);
                if (var33 == 65535) {
                    var33 = -1;
                }
                int var34 = arg1.method1118(arg3 + 22369);
                class478.method2853(var34, (byte) -120, arg0, var33);
            }
            if (~(arg4 & 32) != -1) {
                int var35 = arg1.method1074((byte) -41);
                if (var35 == 65535) {
                    var35 = -1;
                }
                arg0.field7602 = var35;
            }
            if (~(arg4 & 8192) != -1) {
                int var36 = arg1.method1069((byte) -36);
                arg0.field7660 = arg1.method1065((byte) 16);
                arg0.field7633 = arg1.method1120((byte) -17);
                arg0.field7609 = var36 & 32767;
                arg0.field7668 = ~(32768 & var36) != -1;
                arg0.field7605 = class531.field7821 + arg0.field7609 + arg0.field7660;
            }
            if (~(arg4 & 262144) != -1) {
                arg0.field7622 = arg1.method1100(85);
                arg0.field7640 = arg1.method1111((byte) -60);
                arg0.field7596 = arg1.method1100(arg3 + 22555);
                arg0.field7601 = (byte) arg1.method1120((byte) -116);
                arg0.field7636 = class531.field7821 - -arg1.method1116(arg3 ^ -22343);
                arg0.field7641 = class531.field7821 + arg1.method1074((byte) -90);
            }
            if (~(1024 & arg4) != -1) {
                int var37 = arg1.method1074((byte) -81);
                if (var37 == 65535) {
                    var37 = -1;
                }
                int var38 = arg1.method1097(90);
                int var39 = arg1.method1118(-10);
                arg0.method3082((byte) -90, var39, var37, var38, false);
            }
            if (arg0.field3691) {
                if (var8 != 127) {
                    byte var40;
                    if (var8 == -1) {
                        var40 = class515.field7582[arg2];
                    } else {
                        var40 = var8;
                    }
                    arg0.method1656(arg0.field3704, arg0.field3724, var40, (byte) 19);
                } else {
                    arg0.method1655(arg0.field3724, arg3 ^ 22521, arg0.field3704);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIZ)V")
    public final void method519(int arg0, int arg1, boolean arg2) {
        ++field1023;
        if (arg2) {
            this.field1031 = 107;
        }
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)V")
    public static void method520(byte arg0) {
        if (arg0 != -47) {
            method517((int[]) null, -16);
        }
        field1026 = null;
    }
}
