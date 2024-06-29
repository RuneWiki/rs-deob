import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class224 {

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Luf;")
    private class380 field2906 = new class380(64);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Luf;")
    public class380 field2917 = new class380(50);

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Lur;")
    public class389 field2919 = new class389(250);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Lsp;")
    private class675 field2920 = new class675();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public int field2899;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Lga;")
    public class332 field2907;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "Lka;")
    private class622 field2922;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Lga;")
    private class332 field2909;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Z")
    private boolean field2900;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public int field2902;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field2923;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field2924;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field2901 = 52;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field2910 = 2;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public int field2921;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Ltw;", line = 3)
    public final class584 method1394(int arg0, int arg1) {
        field2918++;
        class380 var3 = this.field2906;
        class584 var4;
        synchronized (this.field2906) {
            var4 = (class584) this.field2906.method2176(-127, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field2909;
        byte[] var6;
        synchronized (this.field2909) {
            var6 = this.field2909.method1938(class637.method3527(103, arg1), class523.method2965(arg1, -367701752), -17);
        }
        class584 var7 = new class584();
        if (arg0 >= -44) {
            this.field2906 = null;
        }
        var7.field8066 = this;
        var7.field8051 = arg1;
        var7.field8007 = new String[] { null, null, class371.field4886.method2141(this.field2899, true), null, null };
        var7.field8008 = new String[] { null, null, null, null, class371.field4887.method2141(this.field2899, true) };
        if (var6 != null) {
            var7.method3222(28, new class157(var6));
        }
        var7.method3238(-17603);
        if (var7.field8006 != -1) {
            var7.method3226(this.method1394(-92, var7.field8068), 128, this.method1394(-88, var7.field8006));
        }
        if (var7.field8023 != -1) {
            var7.method3237(this.method1394(-55, var7.field8053), this.method1394(-112, var7.field8023), -118);
        }
        if (!this.field2900 && var7.field8022) {
            var7.field8032 = class371.field4884.method2141(this.field2899, true);
            var7.field8058 = null;
            var7.field8008 = this.field2924;
            var7.field8007 = this.field2923;
            var7.field8063 = false;
            var7.field8025 = 0;
            if (var7.field8041 != null) {
                boolean var8 = false;
                for (class45 var9 = var7.field8041.method3053((byte) 88); var9 != null; var9 = var7.field8041.method3056(18113)) {
                    class119 var10 = this.field2922.method3462((byte) -79, (int) var9.field545);
                    if (var10.field1517) {
                        var9.method242(true);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field8041 = null;
                }
            }
        }
        class380 var11 = this.field2906;
        synchronized (this.field2906) {
            this.field2906.method2174(var7, (long) arg1, (byte) 127);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 83)
    public final void method1395(byte arg0) {
        field2905++;
        class380 var2 = this.field2906;
        synchronized (this.field2906) {
            if (arg0 > -66) {
                this.field2909 = null;
            }
            this.field2906.method2168((byte) -77);
        }
        class380 var3 = this.field2917;
        synchronized (this.field2917) {
            this.field2917.method2168((byte) -95);
        }
        class389 var4 = this.field2919;
        synchronized (this.field2919) {
            this.field2919.method2250(1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)V", line = 102)
    public final void method1396(int arg0, byte arg1) {
        this.field2921 = arg0;
        if (arg1 > -74) {
            this.method1401(26, 103, null, null, false, false, 8, (byte) 69, -51, 115, null, null);
        }
        field2912++;
        class380 var3 = this.field2917;
        synchronized (this.field2917) {
            this.field2917.method2168((byte) -113);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 116)
    public final void method1397(int arg0) {
        class380 var2 = this.field2917;
        synchronized (this.field2917) {
            this.field2917.method2168((byte) -113);
            if (arg0 != 9713) {
                this.field2919 = null;
            }
        }
        field2898++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBI)Z", line = 134)
    public static final boolean method1398(int arg0, byte arg1, int arg2) {
        if (arg1 < 69) {
            method1400(-124, 28, 56, 91, 115, -1, 12);
        }
        field2904++;
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V", line = 146)
    public final void method1399(int arg0, int arg1) {
        field2915++;
        class380 var3 = this.field2906;
        synchronized (this.field2906) {
            this.field2906.method2179(false, arg0);
        }
        class380 var4 = this.field2917;
        synchronized (this.field2917) {
            this.field2917.method2179(false, arg0);
        }
        class389 var5 = this.field2919;
        synchronized (this.field2919) {
            this.field2919.method2249(arg0, 0);
        }
        if (arg1 != 1) {
            this.method1397(-95);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V", line = 169)
    public static final void method1400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class551.method3081(-16528, arg6);
        field2911++;
        int var7 = arg0;
        int var8 = arg6 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class6.field66 <= arg2 && class151.field2071 >= arg2) {
            int[] var15 = class315.field4224[arg2];
            int var16 = class496.method2826(arg5 - arg6, (byte) 36, class281.field3703, class255.field3350);
            int var17 = class496.method2826(arg5 + arg6, (byte) 36, class281.field3703, class255.field3350);
            int var18 = class496.method2826(arg5 - var8, (byte) 36, class281.field3703, class255.field3350);
            int var19 = class496.method2826(arg5 + var8, (byte) 36, class281.field3703, class255.field3350);
            class285.method1691(var18, var15, -7, var16, arg1);
            class285.method1691(var19, var15, arg0 ^ 0xFFFFFFF9, var18, arg4);
            class285.method1691(var17, var15, -7, var19, arg1);
        }
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class46.field559[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg2 - var9;
                int var21 = arg2 + var9;
                if (var21 >= class6.field66 && class151.field2071 >= var20) {
                    if (var9 >= var8) {
                        int var22 = class496.method2826(arg5 + var7, (byte) 36, class281.field3703, class255.field3350);
                        int var23 = class496.method2826(arg5 - var7, (byte) 36, class281.field3703, class255.field3350);
                        if (class151.field2071 >= var21) {
                            class285.method1691(var22, class315.field4224[var21], -7, var23, arg1);
                        }
                        if (var20 >= class6.field66) {
                            class285.method1691(var22, class315.field4224[var20], -7, var23, arg1);
                        }
                    } else {
                        int var24 = class46.field559[var9];
                        int var25 = class496.method2826(arg5 + var7, (byte) 36, class281.field3703, class255.field3350);
                        int var26 = class496.method2826(arg5 - var7, (byte) 36, class281.field3703, class255.field3350);
                        int var27 = class496.method2826(arg5 + var24, (byte) 36, class281.field3703, class255.field3350);
                        int var28 = class496.method2826(arg5 - var24, (byte) 36, class281.field3703, class255.field3350);
                        if (var21 <= class151.field2071) {
                            int[] var29 = class315.field4224[var21];
                            class285.method1691(var28, var29, -7, var26, arg1);
                            class285.method1691(var27, var29, -7, var28, arg4);
                            class285.method1691(var25, var29, -7, var27, arg1);
                        }
                        if (class6.field66 <= var20) {
                            int[] var30 = class315.field4224[var20];
                            class285.method1691(var28, var30, arg0 - 7, var26, arg1);
                            class285.method1691(var27, var30, -7, var28, arg4);
                            class285.method1691(var25, var30, -7, var27, arg1);
                        }
                    }
                }
            }
            int var31 = arg2 - var7;
            int var32 = arg2 + var7;
            if (class6.field66 <= var32 && class151.field2071 >= var31) {
                int var33 = arg5 + var9;
                int var34 = arg5 - var9;
                if (class281.field3703 <= var33 && class255.field3350 >= var34) {
                    int var35 = class496.method2826(var33, (byte) 36, class281.field3703, class255.field3350);
                    int var36 = class496.method2826(var34, (byte) 36, class281.field3703, class255.field3350);
                    if (var8 <= var7) {
                        if (var32 <= class151.field2071) {
                            class285.method1691(var35, class315.field4224[var32], -7, var36, arg1);
                        }
                        if (class6.field66 <= var31) {
                            class285.method1691(var35, class315.field4224[var31], -7, var36, arg1);
                        }
                    } else {
                        int var37 = var7 > var11 ? class46.field559[var7] : var11;
                        int var38 = class496.method2826(arg5 + var37, (byte) 36, class281.field3703, class255.field3350);
                        int var39 = class496.method2826(arg5 - var37, (byte) 36, class281.field3703, class255.field3350);
                        if (class151.field2071 >= var32) {
                            int[] var40 = class315.field4224[var32];
                            class285.method1691(var39, var40, arg0 ^ 0xFFFFFFF9, var36, arg1);
                            class285.method1691(var38, var40, arg0 - 7, var39, arg4);
                            class285.method1691(var35, var40, -7, var38, arg1);
                        }
                        if (var31 >= class6.field66) {
                            int[] var41 = class315.field4224[var31];
                            class285.method1691(var39, var41, -7, var36, arg1);
                            class285.method1691(var38, var41, -7, var39, arg4);
                            class285.method1691(var35, var41, arg0 ^ 0xFFFFFFF9, var38, arg1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILbl;Lr;ZZIBIILr;Lla;)Lf;", line = 354)
    public final class532 method1401(int arg0, int arg1, class321 arg2, class562 arg3, boolean arg4, boolean arg5, int arg6, byte arg7, int arg8, int arg9, class562 arg10, class409 arg11) {
        if (arg7 < 33) {
            this.method1403(9);
        }
        field2908++;
        class532 var13 = this.method1402(arg0, arg9, arg1, arg3, arg8, (byte) -3, arg6, arg2);
        if (var13 != null) {
            return var13;
        }
        class584 var14 = this.method1394(-106, arg0);
        if (arg1 > 1 && var14.field8050 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg1 >= var14.field8024[var16] && var14.field8024[var16] != 0) {
                    var15 = var14.field8050[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method1394(-113, var15);
            }
        }
        int[] var17 = var14.method3229(arg6, arg1, 128, arg9, arg3, arg4, arg10, arg8, arg11, arg2);
        if (var17 == null) {
            return null;
        }
        class532 var18;
        if (arg5) {
            var18 = arg10.method1122(var17, 0, 36, 36, 32);
        } else {
            var18 = arg3.method1122(var17, 0, 36, 36, 32);
        }
        if (!arg5) {
            class675 var19 = new class675();
            var19.field9596 = arg0;
            var19.field9601 = arg9;
            var19.field9603 = arg8;
            var19.field9602 = arg3.field7672;
            var19.field9599 = arg1;
            var19.field9595 = arg6;
            var19.field9597 = arg2 != null;
            this.field2919.method2244(var18, var19, (byte) 85);
        }
        return var18;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILr;IBILbl;)Lf;", line = 425)
    public final class532 method1402(int arg0, int arg1, int arg2, class562 arg3, int arg4, byte arg5, int arg6, class321 arg7) {
        this.field2920.field9595 = arg6;
        this.field2920.field9596 = arg0;
        this.field2920.field9599 = arg2;
        if (arg5 != -3) {
            return null;
        }
        field2916++;
        this.field2920.field9601 = arg1;
        this.field2920.field9602 = arg3.field7672;
        this.field2920.field9597 = arg7 != null;
        this.field2920.field9603 = arg4;
        return (class532) this.field2919.method2243(25024, this.field2920);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lnq;IZLka;Lga;Lga;)V", line = 515)
    public class224(class650 arg0, int arg1, boolean arg2, class622 arg3, class332 arg4, class332 arg5) {
        this.field2899 = arg1;
        this.field2907 = arg5;
        this.field2922 = arg3;
        this.field2909 = arg4;
        this.field2900 = arg2;
        if (this.field2909 == null) {
            this.field2902 = 0;
        } else {
            int var7 = this.field2909.method1933(-122) - 1;
            this.field2902 = this.field2909.method1939(0, var7) + var7 * 256;
        }
        this.field2923 = new String[] { null, null, class371.field4886.method2141(this.field2899, true), null, null };
        this.field2924 = new String[] { null, null, null, null, class371.field4887.method2141(this.field2899, true) };
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 450)
    public final void method1403(int arg0) {
        field2913++;
        class389 var2 = this.field2919;
        synchronized (this.field2919) {
            this.field2919.method2250(1);
            if (arg0 >= -47) {
                this.method1403(-43);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 463)
    public final void method1404(int arg0) {
        class380 var2 = this.field2906;
        synchronized (this.field2906) {
            this.field2906.method2172(-15112);
        }
        field2914++;
        class380 var3 = this.field2917;
        synchronized (this.field2917) {
            this.field2917.method2172(-15112);
            if (arg0 != 2) {
                this.method1402(-92, -50, -59, null, -103, (byte) 7, -15, null);
            }
        }
        class389 var4 = this.field2919;
        synchronized (this.field2919) {
            this.field2919.method2241(-97);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)V", line = 483)
    public final void method1405(int arg0, boolean arg1) {
        field2903++;
        if (this.field2900 == arg1) {
            return;
        }
        this.field2900 = arg1;
        if (arg0 != 0) {
            this.method1401(-4, 44, null, null, false, true, -98, (byte) -7, -16, -22, null, null);
        }
        this.method1395((byte) -89);
    }
}
