import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class69 extends class74 {

    @OriginalMember(owner = "client!af", name = "O", descriptor = "Lgb;")
    public static class149 field1092 = new class149();

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field1097 = -1;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "Ljava/lang/String;")
    public static String field1099 = "glow3:";

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!af", name = "W", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!af", name = "X", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "Luf;")
    public static class176 field1095;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "Lne;")
    public static class52 field1102;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V")
    public static void method537(int arg0) {
        field1092 = null;
        if (arg0 == 0) {
            field1099 = null;
            field1095 = null;
            field1102 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        ++field1101;
        if (arg2 == 0) {
            super.field1245 = arg1.method333((byte) -59) == 1;
        }
        if (arg0 != -79) {
            field1092 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        if (arg0 != 4) {
            field1098 = -17;
        }
        ++field1093;
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (super.field1254.field3118) {
            int[] var4 = this.method590(0, 0, arg1);
            for (int var5 = 0; ~class178.field2662 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        int[][] var3 = super.field1248.method269(false, arg0);
        ++field1096;
        if (super.field1248.field550) {
            int[][] var4 = this.method592(arg0, 0, 114);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class178.field2662; ++var11) {
                var7[var11] = -var6[var11] + 4096;
                var9[var11] = 4096 - var5[var11];
                var10[var11] = -var8[var11] + 4096;
            }
        }
        return arg1 >= -112 ? null : var3;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class69() {
        super(1, false);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILoe;IIII)V")
    public static final void method538(int arg0, class144 arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1091;
        if (~arg1.field2243 != 0 || arg1.field2227 != null) {
            int var6 = class253.field3896 * arg1.field2232 >> 8;
            int var7 = 0;
            if (arg1.field2248 >= arg4) {
                if (~arg1.field2242 < ~arg4) {
                    var7 += arg1.field2242 - arg4;
                }
            } else {
                var7 += -arg1.field2248 + arg4;
            }
            if (arg1.field2245 >= arg5) {
                if (~arg1.field2241 < ~arg5) {
                    var7 += -arg5 + arg1.field2241;
                }
            } else {
                var7 += arg5 - arg1.field2245;
            }
            if (~arg1.field2244 != -1 && var7 + -64 <= arg1.field2244 && class253.field3896 != 0 && ~arg1.field2250 == ~arg2) {
                if (arg0 != 1424) {
                    method538(-15, (class144) null, -112, 64, -19, -48);
                }
                var7 -= 64;
                if (~var7 > -1) {
                    var7 = 0;
                }
                int var8 = (arg1.field2244 - var7) * var6 / arg1.field2244;
                if (arg1.field2233 != null) {
                    arg1.field2233.method650(var8);
                } else if (~arg1.field2243 <= -1) {
                    class27 var9 = class27.method215(class72.field1152, arg1.field2243, 0);
                    if (var9 != null) {
                        class192 var10 = var9.method216().method1295(class140.field2156);
                        class82 var11 = class82.method671(var10, 100, var8);
                        var11.method667(-1);
                        class39.field661.method722(var11);
                        arg1.field2233 = var11;
                    }
                }
                if (arg1.field2237 != null) {
                    arg1.field2237.method650(var8);
                    if (!arg1.field2237.method694(false)) {
                        arg1.field2237 = null;
                    }
                } else {
                    if (arg1.field2227 != null && (arg1.field2239 -= arg3) <= 0) {
                        int var12 = (int) ((double) arg1.field2227.length * Math.random());
                        class27 var13 = class27.method215(class72.field1152, arg1.field2227[var12], 0);
                        if (var13 != null) {
                            class192 var14 = var13.method216().method1295(class140.field2156);
                            class82 var15 = class82.method671(var14, 100, var8);
                            var15.method667(0);
                            class39.field661.method722(var15);
                            arg1.field2237 = var15;
                            arg1.field2239 = (int) ((double) (-arg1.field2235 + arg1.field2252) * Math.random()) + arg1.field2235;
                            return;
                        }
                    }
                }
            } else {
                if (arg1.field2233 != null) {
                    class39.field661.method718(arg1.field2233);
                    arg1.field2233 = null;
                }
                if (arg1.field2237 != null) {
                    class39.field661.method718(arg1.field2237);
                    arg1.field2237 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Luf;Lhl;ZILuf;)V")
    public static final void method539(class176 arg0, class40 arg1, boolean arg2, int arg3, class176 arg4) {
        ++field1090;
        class66.field1065 = arg4;
        int var5 = -117 % ((-37 - arg3) / 51);
        class216.field3343 = arg2;
        class169.field2533 = arg0;
        int var6 = class169.field2533.method1167(-123) + -1;
        class292.field4595 = var6 * 256 - -class169.field2533.method1165(3, var6);
        class28.field423 = arg1;
        class15.field251 = new String[] { null, null, null, null, class1.field17 };
        class147.field2280 = new String[] { null, null, class247.field3827, null, null };
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lf;B)V")
    public static final void method540(class37 arg0, byte arg1) {
        int var2 = arg0.method285((byte) 35);
        class66.field1044 = new class238[var2];
        for (int var3 = 0; var2 > var3; ++var3) {
            class66.field1044[var3] = new class238();
            class66.field1044[var3].field3683 = arg0.method285((byte) 35);
            class66.field1044[var3].field3677 = arg0.method300(11006);
        }
        class149.field2309 = arg0.method285((byte) 35);
        class137.field2130 = arg0.method285((byte) 35);
        class222.field3474 = arg0.method285((byte) 35);
        if (arg1 < 5) {
            field1098 = -29;
        }
        class276.field4356 = new class209[class137.field2130 + 1 + -class149.field2309];
        ++field1094;
        for (int var4 = 0; ~var4 > ~class222.field3474; ++var4) {
            int var5 = arg0.method285((byte) 35);
            class209 var6 = class276.field4356[var5] = new class209();
            var6.field1785 = arg0.method333((byte) -59);
            var6.field1791 = arg0.method307(-50);
            var6.field3245 = class149.field2309 + var5;
            var6.field3240 = arg0.method300(11006);
            var6.field3244 = arg0.method300(11006);
        }
        class264.field4211 = arg0.method307(-96);
        class244.field3791 = true;
    }
}
