import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class76 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Lsc;")
    public static class181 field1215 = class149.method967(255, "name_icons");

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "[S")
    public static short[] field1216 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field1222 = -1;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Lre;")
    public static class78 field1223 = new class78(5000);

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "Lsc;")
    private static class181 field1229 = class149.method967(255, "Type");

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "Lsc;")
    public static class181 field1228 = class149.method967(255, ":duelfriend:");

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "Lsc;")
    public static class181 field1233 = field1229;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "Lsc;")
    private static class181 field1235 = class149.method967(255, "flash1:");

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "Lsc;")
    public static class181 field1231 = field1235;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Lsc;")
    public static class181 field1227 = field1235;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "Ljb;")
    public static class11 field1225;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Ls;")
    public static class29 field1221;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Z")
    public static boolean field1226;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
    public static void method527(boolean arg0) {
        if (arg0) {
            method530(2, -57, 9, -87, 78, 122, -59, 52);
        }
        field1225 = null;
        field1227 = null;
        field1215 = null;
        field1216 = null;
        field1221 = null;
        field1235 = null;
        field1223 = null;
        field1229 = null;
        field1231 = null;
        field1228 = null;
        field1233 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBIII)V")
    public static final void method528(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1217++;
        int var5 = arg2;
        int var6 = 0;
        int var7 = -1;
        int var8 = -arg2;
        int var9 = class144.method931(119, class124.field2032, class11.field219, arg2 + arg3);
        int var10 = class144.method931(-51, class124.field2032, class11.field219, arg3 - arg2);
        class171.method1133(class149.field2507[arg4], var10, arg0, var9, (byte) 127);
        if (arg1 >= -27) {
            method531(-12, (class116) null, (class178) null, (class148) null, -60, 117, -124, -41);
        }
        while (var6 < var5) {
            var7 += 2;
            var8 += var7;
            if (var8 > 0) {
                var5--;
                var8 -= var5 << 1;
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                if (class23.field408 <= var11 && class125.field2056 >= var12) {
                    int var13 = class144.method931(110, class124.field2032, class11.field219, arg3 + var6);
                    int var14 = class144.method931(-47, class124.field2032, class11.field219, arg3 - var6);
                    if (class125.field2056 >= var11) {
                        class171.method1133(class149.field2507[var11], var14, arg0, var13, (byte) 125);
                    }
                    if (class23.field408 <= var12) {
                        class171.method1133(class149.field2507[var12], var14, arg0, var13, (byte) 126);
                    }
                }
            }
            var6++;
            int var15 = arg4 + var6;
            int var16 = arg4 - var6;
            if (class23.field408 <= var15 && var16 <= class125.field2056) {
                int var17 = class144.method931(124, class124.field2032, class11.field219, arg3 + var5);
                int var18 = class144.method931(123, class124.field2032, class11.field219, arg3 - var5);
                if (var15 <= class125.field2056) {
                    class171.method1133(class149.field2507[var15], var18, arg0, var17, (byte) 127);
                }
                if (class23.field408 <= var16) {
                    class171.method1133(class149.field2507[var16], var18, arg0, var17, (byte) 126);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)I")
    public static final int method529(byte arg0) {
        if (arg0 <= 100) {
            return 76;
        } else {
            field1219++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 >= 0 && arg6 >= 0 && arg7 < 103 && arg6 < 103) {
            if (arg2 == 0) {
                class75 var8 = class9.method76(arg4, arg7, arg6);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field1213 >>> 32);
                    if (arg0 == 2) {
                        var8.field1203 = new class96(var9, 2, arg3 + 4, arg4, arg7, arg6, arg5, false, var8.field1203);
                        var8.field1212 = new class96(var9, 2, arg3 + 1 & 0x3, arg4, arg7, arg6, arg5, false, var8.field1212);
                    } else {
                        var8.field1203 = new class96(var9, arg0, arg3, arg4, arg7, arg6, arg5, false, var8.field1203);
                    }
                }
            }
            if (arg2 == 1) {
                class106 var10 = class159.method1069(arg4, arg7, arg6);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field1718 >>> 32);
                    if (arg0 == 4 || arg0 == 5) {
                        var10.field1735 = new class96(var11, 4, arg3, arg4, arg7, arg6, arg5, false, var10.field1735);
                    } else if (arg0 == 6) {
                        var10.field1735 = new class96(var11, 4, arg3 + 4, arg4, arg7, arg6, arg5, false, var10.field1735);
                    } else if (arg0 == 7) {
                        var10.field1735 = new class96(var11, 4, (arg3 + 2 & 0x3) + 4, arg4, arg7, arg6, arg5, false, var10.field1735);
                    } else if (arg0 == 8) {
                        var10.field1735 = new class96(var11, 4, arg3 + 4, arg4, arg7, arg6, arg5, false, var10.field1735);
                        var10.field1726 = new class96(var11, 4, (arg3 + 2 & 0x3) + 4, arg4, arg7, arg6, arg5, false, var10.field1726);
                    }
                }
            }
            if (arg2 == 2) {
                class100 var12 = class3.method28(arg4, arg7, arg6);
                if (arg0 == 11) {
                    arg0 = 10;
                }
                if (var12 != null) {
                    var12.field1681 = new class96((int) (var12.field1677 >>> 32) & Integer.MAX_VALUE, arg0, arg3, arg4, arg7, arg6, arg5, false, var12.field1681);
                }
            }
            if (arg2 == 3) {
                class164 var13 = class257.method1748(arg4, arg7, arg6);
                if (var13 != null) {
                    var13.field2795 = new class96((int) (var13.field2787 >>> 32) & Integer.MAX_VALUE, 22, arg3, arg4, arg7, arg6, arg5, false, var13.field2795);
                }
            }
        }
        field1220++;
        if (arg1 != 957) {
            method531(91, (class116) null, (class178) null, (class148) null, 114, 58, 38, -76);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILed;Lmj;Lra;IIII)V")
    public static final void method531(int arg0, class116 arg1, class178 arg2, class148 arg3, int arg4, int arg5, int arg6, int arg7) {
        field1218++;
        if (arg0 != 9522) {
            method531(36, (class116) null, (class178) null, (class148) null, 91, 123, 96, 85);
        }
        class264 var8 = new class264();
        var8.field4596 = arg7 * 128;
        var8.field4589 = arg5 * 128;
        var8.field4611 = arg6;
        if (arg3 != null) {
            var8.field4608 = arg3.field2454;
            var8.field4615 = arg3.field2422;
            var8.field4610 = arg3.field2458;
            var8.field4587 = arg3.field2442;
            var8.field4592 = arg3;
            int var10 = arg3.field2433;
            var8.field4590 = arg3.field2423 * 128;
            int var11 = arg3.field2466;
            if (arg4 == 1 || arg4 == 3) {
                var10 = arg3.field2466;
                var11 = arg3.field2433;
            }
            var8.field4588 = (arg5 + var11) * 128;
            var8.field4599 = (arg7 + var10) * 128;
            if (arg3.field2446 != null) {
                var8.field4586 = true;
                var8.method1787((byte) 121);
            }
            if (var8.field4608 != null) {
                var8.field4612 = (int) (Math.random() * (double) (var8.field4587 - var8.field4615)) + var8.field4615;
            }
            class94.field1493.method1689(var8, arg0 - 9467);
            return;
        }
        if (arg2 != null) {
            var8.field4597 = arg2;
            class64 var9 = arg2.field3117;
            if (var9.field1050 != null) {
                var8.field4586 = true;
                var9 = var9.method458((byte) -54);
            }
            if (var9 != null) {
                var8.field4599 = (var9.field995 + arg7) * 128;
                var8.field4588 = (var9.field995 + arg5) * 128;
                var8.field4610 = class19.method176(arg0 ^ 0xFFFFDACD, arg2);
                var8.field4590 = var9.field1014 * 128;
            }
            class7.field118.method1689(var8, arg0 ^ 0x2572);
            return;
        }
        if (arg1 == null) {
            return;
        }
        var8.field4599 = (arg1.field2619 + arg7) * 128;
        var8.field4595 = arg1;
        var8.field4588 = (arg5 + arg1.field2619) * 128;
        var8.field4610 = class20.method189(arg1, true);
        var8.field4590 = arg1.field1925 * 128;
        class123.field2014.method1422(arg1.field1883.method1197(arg0 - 9648), var8, -1);
        return;
    }
}
