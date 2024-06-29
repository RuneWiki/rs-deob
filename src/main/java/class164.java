import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class164 extends class179 {

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    private int field2900 = 20;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
    private int field2910 = 0;

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
    private int field2917 = 0;

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
    private int field2918 = 1365;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "[I")
    public static int[] field2902 = new int[4];

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "Lke;")
    private static class256 field2905 = class316.method2202("glow2:", 27626);

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "Lke;")
    public static class256 field2903 = class316.method2202("<col=ff7000>", 27626);

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "Lke;")
    public static class256 field2911 = class316.method2202("<)4col>", 27626);

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "Lke;")
    public static class256 field2915 = field2905;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "[I")
    public static int[] field2906 = new int[1000];

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "Z")
    public static boolean field2914 = false;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "Lke;")
    public static class256 field2916 = field2905;

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "Lke;")
    public static class256 field2913 = class316.method2202(" GMT", 27626);

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "[Lel;")
    public static class232[] field2907;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method41(int arg0, int arg1) {
        field2901++;
        if (arg1 != -31598) {
            return (int[]) null;
        }
        int[] var3 = this.field3157.method1258(arg1 + 31541, arg0);
        if (this.field3157.field3081) {
            for (int var4 = 0; var4 < class161.field2858; var4++) {
                int var5 = (class290.field5017[var4] << 12) / this.field2918 + this.field2910;
                int var6 = (class292.field5049[arg0] << 12) / this.field2918 + this.field2917;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var5 * var5 >> 12;
                int var11 = var6 * var6 >> 12;
                int var12 = var6;
                int var13;
                for (var13 = 0; (var10 + var11) < 16384 && this.field2900 > var13; var13++) {
                    var12 = (var9 * var12 >> 12) * 2 + var8;
                    var9 = var7 + var10 - var11;
                    var10 = var9 * var9 >> 12;
                    var11 = var12 * var12 >> 12;
                }
                var3[var4] = this.field2900 - 1 > var13 ? (var13 << 12) / this.field2900 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILra;I)V", line = 68)
    public final void method54(int arg0, class41 arg1, int arg2) {
        field2908++;
        if (arg2 == 0) {
            this.field2918 = arg1.method346(-16);
        } else if (arg2 == 1) {
            this.field2900 = arg1.method346(-16);
        } else if (arg2 == 2) {
            this.field2910 = arg1.method346(-16);
        } else if (arg2 == 3) {
            this.field2917 = arg1.method346(-16);
        }
        if (arg0 <= 108) {
            method1206(-66, 47, -35);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIZLsd;I)V", line = 124)
    public static final void method1203(int arg0, int arg1, int arg2, int arg3, boolean arg4, class37 arg5, int arg6) {
        field2904++;
        long var7 = 0L;
        boolean var9 = true;
        if (arg2 == 0) {
            var7 = class308.method2141(arg0, arg6, arg1);
        } else if (arg2 == 1) {
            var7 = class161.method1191(arg0, arg6, arg1);
        } else if (arg2 == 2) {
            var7 = class229.method1560(arg0, arg6, arg1);
        } else if (arg2 == 3) {
            var7 = client.method824(arg0, arg6, arg1);
        }
        boolean var10 = false;
        if (arg4) {
            field2915 = (class256) null;
        }
        boolean var11 = false;
        int var12 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        int var13 = (int) var7 >> 20 & 0x3;
        int var14 = ((int) var7 & 0x7CE8C) >> 14;
        class273 var15 = class271.method1871(125, var12);
        if (var15.method1892((byte) -5)) {
            class74.method556(var15, arg1, arg0, arg6, false);
        }
        if (var7 == 0L) {
            return;
        }
        class51 var16 = null;
        class51 var17 = null;
        if (arg2 == 0) {
            class197 var21 = class154.method1150(arg0, arg6, arg1);
            if (var21 != null) {
                var17 = var21.field3596;
                var16 = var21.field3597;
            }
            if (var15.field4710 != 0) {
                arg5.method273(arg1, var15.field4661, arg6, var13, (byte) -121, var14);
            }
        } else if (arg2 == 1) {
            class39 var20 = class171.method1247(arg0, arg6, arg1);
            if (var20 != null) {
                var16 = var20.field700;
                var17 = var20.field711;
            }
        } else if (arg2 == 2) {
            class269 var19 = class143.method1044(arg0, arg6, arg1);
            if (var19 != null) {
                var16 = var19.field4590;
            }
            if (var15.field4710 != 0 && arg6 + var15.field4662 < 104 && (var15.field4662 + arg1) < 104 && (var15.field4711 + arg6) < 104 && (arg1 + var15.field4711) < 104) {
                arg5.method283(arg6, var13, arg1, var15.field4662, var15.field4661, var15.field4711, (byte) 35);
            }
        } else if (arg2 == 3) {
            class223 var18 = class188.method1360(arg0, arg6, arg1);
            if (var18 != null) {
                var16 = var18.field3905;
            }
            if (var15.field4710 == 1) {
                arg5.method275(arg6, -262145, arg1);
            }
        }
        if (!class253.field4323 || !var15.field4714) {
            return;
        }
        if (var14 == 2) {
            if (var16 instanceof class101) {
                ((class101) var16).method725(false);
            } else {
                class203.method1442(0, var15, var13 + 4, var14, -103, 0, arg1, arg6, arg3);
            }
            if (var17 instanceof class101) {
                ((class101) var17).method725(false);
            } else {
                class203.method1442(0, var15, var13 + 1 & 0x3, var14, -119, 0, arg1, arg6, arg3);
            }
        } else if (var14 == 5) {
            if ((var16 instanceof class101)) {
                ((class101) var16).method725(false);
            } else {
                class203.method1442(class256.field4378[var13] * 8, var15, var13, 4, 100, class124.field2198[var13] * 8, arg1, arg6, arg3);
            }
        } else if (var14 == 6) {
            if (var16 instanceof class101) {
                ((class101) var16).method725(false);
            } else {
                class203.method1442(class198.field3612[var13] * 8, var15, var13 + 4, 4, 64, class297.field5145[var13] * 8, arg1, arg6, arg3);
            }
        } else if (var14 == 7) {
            if (var16 instanceof class101) {
                ((class101) var16).method725(false);
            } else {
                class203.method1442(0, var15, (var13 + 2 & 0x3) + 4, 4, -111, 0, arg1, arg6, arg3);
            }
        } else if (var14 == 8) {
            if ((var16 instanceof class101)) {
                ((class101) var16).method725(arg4);
            } else {
                class203.method1442(class198.field3612[var13] * 8, var15, var13 + 4, 4, -106, class297.field5145[var13] * 8, arg1, arg6, arg3);
            }
            if (var17 instanceof class101) {
                ((class101) var17).method725(false);
            } else {
                class203.method1442(class198.field3612[var13] * 8, var15, (var13 + 2 & 0x3) + 4, 4, 34, class297.field5145[var13] * 8, arg1, arg6, arg3);
            }
        } else if (var14 == 11) {
            if ((var16 instanceof class101)) {
                ((class101) var16).method725(arg4);
            } else {
                class203.method1442(0, var15, var13 + 4, 10, 98, 0, arg1, arg6, arg3);
            }
        } else if ((var16 instanceof class101)) {
            ((class101) var16).method725(arg4);
        } else {
            class203.method1442(0, var15, var13, var14, 40, 0, arg1, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[BII)Z", line = 313)
    public static final boolean method1204(int arg0, byte[] arg1, int arg2, int arg3) {
        field2919++;
        class41 var4 = new class41(arg1);
        int var5 = 77 % ((26 - arg0) / 33);
        boolean var6 = true;
        int var7 = -1;
        label57: while (true) {
            int var8 = var4.method306(false);
            if (var8 == 0) {
                return var6;
            }
            int var9 = 0;
            var7 += var8;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var4.method354((byte) -124);
                    if (var12 == 0) {
                        continue label57;
                    }
                    var9 += var12 - 1;
                    int var13 = var9 & 0x3F;
                    int var14 = var9 >> 6 & 0x3F;
                    int var15 = var4.method357(false) >> 2;
                    int var16 = arg2 + var13;
                    int var17 = var14 + arg3;
                    if (var17 > 0 && var16 > 0 && var17 < 103 && var16 < 103) {
                        class273 var18 = class271.method1871(126, var7);
                        if (var15 != 22 || class65.field1167 || var18.field4685 != 0 || var18.field4710 == 1 || var18.field4666) {
                            if (!var18.method1885(107)) {
                                class29.field414++;
                                var6 = false;
                            }
                            var10 = true;
                        }
                    }
                }
                int var11 = var4.method354((byte) 41);
                if (var11 == 0) {
                    break;
                }
                var4.method357(false);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V", line = 405)
    public class164() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "(I)V", line = 422)
    public static void method1205(int arg0) {
        field2903 = null;
        field2905 = null;
        field2906 = null;
        field2915 = null;
        field2907 = null;
        field2916 = null;
        field2911 = null;
        field2902 = null;
        if (arg0 != -4548) {
            field2914 = false;
        }
        field2913 = null;
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(III)I", line = 463)
    public static final int method1206(int arg0, int arg1, int arg2) {
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        if (arg2 != 28720) {
            method1204(-75, (byte[]) null, 33, -29);
        }
        field2909++;
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIILrb;)V", line = 514)
    public static final void method1207(int arg0, int arg1, int arg2, class144 arg3) {
        if (arg3.field1202 == arg2 && arg2 != -1) {
            class117 var4 = class250.method1682(arg2, true);
            int var5 = var4.field2062;
            if (var5 == 1) {
                arg3.field1231 = 0;
                arg3.field1189 = 0;
                arg3.field1214 = 0;
                arg3.field1196 = arg0;
                class49.method391(arg3.field1192, class121.field2124 == arg3, arg3.field1197, arg3.field1231, var4, -11067);
            }
            if (var5 == 2) {
                arg3.field1189 = 0;
            }
        } else if (arg2 == -1 || arg3.field1202 == -1 || class250.method1682(arg2, true).field2048 >= class250.method1682(arg3.field1202, true).field2048) {
            arg3.field1202 = arg2;
            arg3.field1189 = 0;
            arg3.field1196 = arg0;
            arg3.field1219 = arg3.field1239;
            arg3.field1214 = 0;
            arg3.field1231 = 0;
            if (arg3.field1202 != -1) {
                class49.method391(arg3.field1192, class121.field2124 == arg3, arg3.field1197, arg3.field1231, class250.method1682(arg3.field1202, true), -11067);
            }
        }
        if (arg1 == -25800) {
            field2899++;
        }
    }
}
