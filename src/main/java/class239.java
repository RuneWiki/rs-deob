import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class239 {

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lqe;")
    public static class179 field4402 = class206.method1380("3D)2Softwarebibliothek gestartet)3", (byte) -126);

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field4401 = 0;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lqe;")
    public static class179 field4403 = class206.method1380("(U(Y", (byte) -127);

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static volatile int field4399 = 0;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lqe;")
    public static class179 field4407 = class206.method1380("b12_full", (byte) -127);

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field4406 = 0;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIIILrb;IZJ)Z")
    public static final boolean method1548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class186 arg8, int arg9, boolean arg10, long arg11) {
        for (int var13 = arg1; var13 < arg1 + arg3; var13++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                if (var13 < 0 || var20 < 0 || var13 >= class39.field834 || var20 >= class33.field719) {
                    return false;
                }
                class197 var21 = class229.field4232[arg0][var13][var20];
                if (var21 != null && var21.field3662 >= 5) {
                    return false;
                }
            }
        }
        class167 var14 = new class167();
        var14.field3014 = arg11;
        var14.field3013 = arg0;
        var14.field3022 = arg5;
        var14.field3004 = arg6;
        var14.field3002 = arg7;
        var14.field3010 = arg8;
        var14.field3017 = arg9;
        var14.field3006 = arg1;
        var14.field3018 = arg2;
        var14.field3011 = arg1 + arg3 - 1;
        var14.field3023 = arg2 + arg4 - 1;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                int var17 = 0;
                if (var15 > arg1) {
                    var17++;
                }
                if (var15 < arg1 + arg3 - 1) {
                    var17 += 4;
                }
                if (var16 > arg2) {
                    var17 += 8;
                }
                if (var16 < arg2 + arg4 - 1) {
                    var17 += 2;
                }
                for (int var18 = arg0; var18 >= 0; var18--) {
                    if (class229.field4232[var18][var15][var16] == null) {
                        class229.field4232[var18][var15][var16] = new class197(var18, var15, var16);
                    }
                }
                class197 var19 = class229.field4232[arg0][var15][var16];
                var19.field3672[var19.field3662] = var14;
                var19.field3674[var19.field3662] = var17;
                var19.field3686 |= var17;
                var19.field3662++;
            }
        }
        if (arg10) {
            class177.field3217[class73.field1434++] = var14;
        }
        return true;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public static void method1549(byte arg0) {
        field4403 = null;
        field4402 = null;
        int var1 = 43 / ((56 - arg0) / 61);
        field4407 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)Lki;")
    public static final class117 method1550(int arg0, byte arg1) {
        field4404++;
        class117 var2 = (class117) class221.field4085.method1299((byte) -117, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class87.field1666.method342(class112.method723(true, arg0), class144.method906(11913, arg0), (byte) 124);
        class117 var4 = new class117();
        if (var3 != null) {
            var4.method762((byte) -115, new class185(var3));
        }
        if (arg1 != 107) {
            method1553(-16, -109, null, 90, (byte) -72);
        }
        var4.method756(arg1 - 107);
        class221.field4085.method1303(var4, (long) arg0, (byte) -69);
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)J")
    public static final long method1551(int arg0, int arg1, int arg2) {
        class197 var3 = class229.field4232[arg0][arg1][arg2];
        return var3 == null || var3.field3680 == null ? 0L : var3.field3680.field4379;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IB)V")
    public static final void method1552(int arg0, byte arg1) {
        field4396++;
        if (arg1 >= -69) {
            method1548(-17, 37, 87, 69, -93, 30, 74, -61, null, -38, false, -32L);
        }
        if (class152.method976(true, arg0)) {
            class233.method1520(-1, 0, class199.field3710[arg0]);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILqf;IB)V")
    public static final void method1553(int arg0, int arg1, class180 arg2, int arg3, byte arg4) {
        field4400++;
        if (class113.field2118 >= 400 || arg4 != 19) {
            return;
        }
        if (arg2.field3305 != null) {
            arg2 = arg2.method1179((byte) -98);
        }
        if (arg2 == null || !arg2.field3347) {
            return;
        }
        class179 var5 = arg2.field3325;
        if (arg2.field3319 != 0) {
            var5 = class78.method502((byte) -83, new class179[] { var5, class132.method848(arg2.field3319, class61.field1298.field2161, 85), class62.field1316, class223.field4117, class148.method949((byte) -14, arg2.field3319), class229.field4229 });
        }
        if (class172.field3086 == 1) {
            class49.method330(class232.field4285, arg1, arg0, class78.method502((byte) -114, new class179[] { class114.field2139, class31.field667, var5 }), (short) 42, (byte) 114, (long) arg3);
            class167.field3012++;
        } else if (!class163.field2940) {
            class215.field3995++;
            class179[] var6 = arg2.field3330;
            if (class91.field1726) {
                var6 = class84.method566(-32701, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class205.field3842 != 0 || !var6[var7].method1138(false, class209.field3927))) {
                        class237.field4377++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 13;
                        }
                        if (var7 == 1) {
                            var8 = 48;
                        }
                        if (var7 == 2) {
                            var8 = 12;
                        }
                        if (var7 == 3) {
                            var8 = 33;
                        }
                        if (var7 == 4) {
                            var8 = 47;
                        }
                        class49.method330(var6[var7], arg1, arg0, class78.method502((byte) -108, new class179[] { class173.field3099, var5 }), var8, (byte) 14, (long) arg3);
                    }
                }
            }
            if (class205.field3842 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1138(false, class209.field3927)) {
                        class232.field4270++;
                        short var10 = 0;
                        short var11 = 0;
                        if (class61.field1298.field2161 < arg2.field3319) {
                            var11 = 2000;
                        }
                        if (var9 == 0) {
                            var10 = 13;
                        }
                        if (var9 == 1) {
                            var10 = 48;
                        }
                        if (var9 == 2) {
                            var10 = 12;
                        }
                        if (var9 == 3) {
                            var10 = 33;
                        }
                        if (var9 == 4) {
                            var10 = 47;
                        }
                        if (var10 != 0) {
                            var10 += var11;
                        }
                        class49.method330(var6[var9], arg1, arg0, class78.method502((byte) -99, new class179[] { class173.field3099, var5 }), var10, (byte) 94, (long) arg3);
                    }
                }
            }
            class49.method330(class120.field2246, arg1, arg0, class78.method502((byte) -84, new class179[] { class173.field3099, var5 }), (short) 1001, (byte) -127, (long) arg3);
            return;
        } else if ((class88.field1679 & 0x2) == 2) {
            class49.method330(class195.field3630, arg1, arg0, class78.method502((byte) -103, new class179[] { class187.field3487, class31.field667, var5 }), (short) 31, (byte) -123, (long) arg3);
            class40.field847++;
            return;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static final void method1554(int arg0) {
        class11.field295.method1297((byte) 89);
        if (arg0 == 1) {
            class163.field2939.method1339((byte) 110);
            field4405++;
            class15.field422.method1297((byte) 89);
        }
    }
}
