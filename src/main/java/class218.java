import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class218 extends class267 {

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
    public int field3230 = -1;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "[Lrs;")
    public static class238[] field3225 = new class238[16];

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "[I")
    public static int[] field3229 = new int[250];

    @OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
    public static int field3234 = -1;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
    public int field3233;

    @OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "Ldj;")
    public static class304 field3232;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "Ljava/lang/String;")
    public String field3223;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "Ljava/lang/String;")
    public String field3227;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BI)I")
    public static final int method1645(byte arg0, int arg1) {
        ++field3235;
        int var2 = 0;
        if (~arg1 > -1 || ~arg1 <= -65537) {
            var2 += 16;
            arg1 >>>= 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 8;
            var2 += 8;
        }
        if (~arg1 <= -17) {
            arg1 >>>= 4;
            var2 += 4;
        }
        if (arg0 != -120) {
            field3229 = null;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 2;
        }
        if (arg1 >= 1) {
            ++var2;
            arg1 >>>= 1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)V")
    public static void method1646(byte arg0) {
        field3225 = null;
        if (arg0 < 87) {
            method1651(true, (class90) null);
        }
        field3229 = null;
        field3232 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)Z")
    public static final boolean method1647(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class204.field2997; ++var3) {
            class137 var4 = class77.field1313[var3];
            if (var4.field2179 == 1) {
                int var5 = var4.field2193 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2184 * var5 >> 8) + var4.field2177;
                    int var7 = (var4.field2202 * var5 >> 8) + var4.field2191;
                    int var8 = (var4.field2201 * var5 >> 8) + var4.field2187;
                    int var9 = (var4.field2185 * var5 >> 8) + var4.field2194;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2179 == 2) {
                int var10 = arg0 - var4.field2193;
                if (var10 > 0) {
                    int var11 = (var4.field2184 * var10 >> 8) + var4.field2177;
                    int var12 = (var4.field2202 * var10 >> 8) + var4.field2191;
                    int var13 = (var4.field2201 * var10 >> 8) + var4.field2187;
                    int var14 = (var4.field2185 * var10 >> 8) + var4.field2194;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2179 == 3) {
                int var15 = var4.field2177 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2180 * var15 >> 8) + var4.field2193;
                    int var17 = (var4.field2195 * var15 >> 8) + var4.field2186;
                    int var18 = (var4.field2201 * var15 >> 8) + var4.field2187;
                    int var19 = (var4.field2185 * var15 >> 8) + var4.field2194;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2179 == 4) {
                int var20 = arg2 - var4.field2177;
                if (var20 > 0) {
                    int var21 = (var4.field2180 * var20 >> 8) + var4.field2193;
                    int var22 = (var4.field2195 * var20 >> 8) + var4.field2186;
                    int var23 = (var4.field2201 * var20 >> 8) + var4.field2187;
                    int var24 = (var4.field2185 * var20 >> 8) + var4.field2194;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2179 == 5) {
                int var25 = arg1 - var4.field2187;
                if (var25 > 0) {
                    int var26 = (var4.field2180 * var25 >> 8) + var4.field2193;
                    int var27 = (var4.field2195 * var25 >> 8) + var4.field2186;
                    int var28 = (var4.field2184 * var25 >> 8) + var4.field2177;
                    int var29 = (var4.field2202 * var25 >> 8) + var4.field2191;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)Lvb;")
    public final class91 method1648(int arg0) {
        ++field3231;
        return arg0 != 8 ? null : class22.field327[super.field4008];
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lja;Lnf;IIIII)V")
    public static final void method1649(class90 arg0, class256 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; ++var12) {
            if (class13.field218 != var12) {
                for (int var13 = var8; var13 <= var9; ++var13) {
                    if (var13 >= 0 && var13 < class139.field2209) {
                        for (int var14 = var10; var14 <= var11; ++var14) {
                            if (var14 >= 0 && var14 < class436.field6353 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class168 var15 = class443.field6447[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class50.field816[var12].method794(var13, var14) + class50.field816[var12].method794(var13 + 1, var14) + class50.field816[var12].method794(var13, var14 + 1) + class50.field816[var12].method794(var13 + 1, var14 + 1)) / 4 - (class50.field816[arg2].method794(arg3, arg4) + class50.field816[arg2].method794(arg3 + 1, arg4) + class50.field816[arg2].method794(arg3, arg4 + 1) + class50.field816[arg2].method794(arg3 + 1, arg4 + 1)) / 4;
                                    class148 var17 = var15.field2505;
                                    class148 var18 = var15.field2510;
                                    if (var17 != null && var17.method53((byte) 79)) {
                                        arg1.method47(var16, (byte) 47, var7, (var13 - arg3) * 128 + (1 - arg5) * 64, (var14 - arg4) * 128 + (1 - arg6) * 64, var17, arg0);
                                    }
                                    if (var18 != null && var18.method53((byte) 114)) {
                                        arg1.method47(var16, (byte) 47, var7, (var13 - arg3) * 128 + (1 - arg5) * 64, (var14 - arg4) * 128 + (1 - arg6) * 64, var18, arg0);
                                    }
                                    for (class36 var19 = var15.field2488; var19 != null; var19 = var19.field505) {
                                        class447 var20 = var19.field511;
                                        if (var20 != null && var20.method53((byte) 81) && (var20.field6526 == var13 || var8 == var13) && (var20.field6513 == var14 || var10 == var14)) {
                                            int var21 = var20.field6504 - var20.field6526 + 1;
                                            int var22 = var20.field6508 - var20.field6513 + 1;
                                            arg1.method47(var16, (byte) 47, var7, (var20.field6526 - arg3) * 128 + (var21 - arg5) * 64, (var20.field6513 - arg4) * 128 + (var22 - arg6) * 64, var20, arg0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var8;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIILjs;Ljs;)V")
    public static final void method1650(int arg0, int arg1, int arg2, class148 arg3, class148 arg4) {
        if (class443.field6447[arg0][arg1][arg2] == null) {
            class253.method1833(arg0, arg1, arg2);
        }
        class443.field6447[arg0][arg1][arg2].field2505 = arg3;
        class443.field6447[arg0][arg1][arg2].field2510 = arg4;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZLja;)V")
    public static final void method1651(boolean arg0, class90 arg1) {
        ++field3228;
        if (class88.field1408.method146(false) != 0) {
            if (class288.field4303 != 0 && class288.field4303 != 2) {
                if (class305.field4460 == null) {
                    Canvas var2 = new Canvas();
                    var2.setSize(36, 32);
                    class305.field4460 = class150.method1161(class188.field2783, var2, class196.field2873, 0, 0, -29623);
                    class390.field5645 = class305.field4460.method765(class110.method961(44, class375.field5314, class275.field4139, 0), class344.method2211(class100.field1561, class375.field5314, 0), true);
                }
                for (class441 var3 = (class441) class88.field1408.method157((byte) -125); var3 != null; var3 = (class441) class88.field1408.method145(-5)) {
                    class375.method2384(var3.field6399 ? class86.field1394.field2072 : null, var3.field6406, false, var3.field6395, var3.field6401, class390.field5645, class305.field4460, var3.field6397, arg1, false, (byte) 125, var3.field6402);
                    var3.method251(79);
                }
            } else {
                for (class441 var4 = (class441) class88.field1408.method157((byte) -125); var4 != null; var4 = (class441) class88.field1408.method145(-101)) {
                    class375.method2384(!var4.field6399 ? null : class86.field1394.field2072, var4.field6406, false, var4.field6395, var4.field6401, class273.field4110, arg1, var4.field6397, arg1, false, (byte) 105, var4.field6402);
                    var4.method251(87);
                }
                class126.method1061(!arg0);
            }
            if (!arg0) {
                method1645((byte) 102, 5);
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILdp;)V")
    public static final void method1652(int arg0, class174 arg1) {
        class1.field7 = arg1;
        int var2 = -31 % ((arg0 - 12) / 60);
        ++field3226;
    }
}
