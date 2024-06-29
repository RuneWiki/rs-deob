import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class26 extends class288 {

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public int field297;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public int field298;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "Ljava/lang/String;")
    public static String field304 = "Loaded title screen";

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "Lef;")
    public static class241 field299 = new class241(64);

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public static volatile int field310 = 0;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "Ljava/lang/String;")
    public static String field314 = "Use";

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "Z")
    public static volatile boolean field315 = true;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "Lc;")
    public static class284 field313 = new class284(16);

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "Lbc;")
    public static class282 field305;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "Lbc;")
    public static class282 field312;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "Lwe;")
    public static class82 field311;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
    public static final void method152(int arg0, int arg1) {
        if (arg1 == 0) {
            field308++;
            class72.field857.method62(arg1 - 53, arg0);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILbc;)I")
    public static final int method153(int arg0, class282 arg1) {
        if (arg0 != 4) {
            field299 = null;
        }
        int var2 = 0;
        if (arg1.method1842(class60.field716, -5012)) {
            var2++;
        }
        if (arg1.method1842(class96.field1281, -5012)) {
            var2++;
        }
        field301++;
        if (arg1.method1842(class30.field366, -5012)) {
            var2++;
        }
        if (arg1.method1842(class72.field869, arg0 ^ 0xFFFFEC68)) {
            var2++;
        }
        if (arg1.method1842(class3.field36, arg0 ^ 0xFFFFEC68)) {
            var2++;
        }
        if (arg1.method1842(class161.field2324, -5012)) {
            var2++;
        }
        if (arg1.method1842(class277.field4213, arg0 - 5016)) {
            var2++;
        }
        if (arg1.method1842(class243.field3547, arg0 - 5016)) {
            var2++;
        }
        if (arg1.method1842(class223.field3152, arg0 ^ 0xFFFFEC68)) {
            var2++;
        }
        if (arg1.method1842(class241.field3512, -5012)) {
            var2++;
        }
        if (arg1.method1842(class135.field1971, -5012)) {
            var2++;
        }
        if (arg1.method1842(class21.field254, -5012)) {
            var2++;
        }
        if (arg1.method1842(class97.field1299, -5012)) {
            var2++;
        }
        if (arg1.method1842(class152.field2203, -5012)) {
            var2++;
        }
        if (arg1.method1842(class280.field4250, arg0 ^ 0xFFFFEC68)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III[Lhl;IIZ[B)[I")
    public static final int[] method154(int arg0, int arg1, int arg2, class137[] arg3, int arg4, int arg5, boolean arg6, byte[] arg7) {
        field307++;
        byte var8;
        if (arg6) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg6) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg0 + var10 > 0 && (arg0 + var10) < 103 && arg4 + var11 > 0 && (arg4 + var11) < 103) {
                            arg3[var9].field1988[arg0 + var10][arg4 + var11] = class5.method26(arg3[var9].field1988[arg0 + var10][arg4 + var11], -2097153);
                        }
                    }
                }
            }
        }
        class216 var12 = new class216(arg7);
        int var13 = arg1 + arg0;
        int var14 = arg2 + arg4;
        for (int var15 = 0; var15 < var8; var15++) {
            for (int var39 = 0; var39 < 64; var39++) {
                for (int var40 = 0; var40 < 64; var40++) {
                    class130.method856(arg0 + var39, arg6, 0, var40 + arg4, false, var13 + var39, var12, var15, (byte) 117, var14 + var40, 0, 0);
                }
            }
        }
        boolean var16 = false;
        if (arg5 != -105) {
            method160((byte) 24);
        }
        boolean var17 = false;
        while (var12.field3021 < var12.field3030.length) {
            int var18 = var12.method1407(111);
            if (var18 == 128) {
                class287.field4478[0] = var12.method1380(true);
                class287.field4478[1] = var12.method1357((byte) 50);
                class287.field4478[2] = var12.method1357((byte) 50);
                var16 = true;
                class287.field4478[3] = var12.method1357((byte) 50);
                class287.field4478[4] = var12.method1380(true);
            } else {
                if (var18 != 129) {
                    var12.field3021--;
                    break;
                }
                for (int var19 = 0; var19 < 4; var19++) {
                    byte var20 = var12.method1355(true);
                    if (var20 == 0) {
                        int var30 = arg0;
                        int var31 = arg0 + 64;
                        if (arg0 < 0) {
                            var30 = 0;
                        } else if (arg0 >= 104) {
                            var30 = 104;
                        }
                        int var32 = arg4 + 64;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 >= 104) {
                            var31 = 104;
                        }
                        int var33 = arg4;
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 >= 104) {
                            var32 = 104;
                        }
                        if (arg4 < 0) {
                            var33 = 0;
                        } else if (arg4 >= 104) {
                            var33 = 104;
                        }
                        while (var30 < var31) {
                            while (var33 < var32) {
                                class214.field2986[var19][var30][var33] = 0;
                                var33++;
                            }
                            var30++;
                        }
                    } else if (var20 == 1) {
                        for (int var25 = 0; var25 < 64; var25 += 4) {
                            for (int var26 = 0; var26 < 64; var26 += 4) {
                                byte var27 = var12.method1355(true);
                                for (int var28 = arg0 + var25; var28 < (arg0 + var25 + 4); var28++) {
                                    for (int var29 = arg4 + var26; var29 < (arg4 + var26 + 4); var29++) {
                                        if (var28 >= 0 && var28 < 104 && var29 >= 0 && var29 < 104) {
                                            class214.field2986[var19][var28][var29] = var27;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2 && var19 > 0) {
                        int var21 = arg0 + 64;
                        int var22 = arg0;
                        if (var21 < 0) {
                            var21 = 0;
                        } else if (var21 >= 104) {
                            var21 = 104;
                        }
                        if (arg0 < 0) {
                            var22 = 0;
                        } else if (arg0 >= 104) {
                            var22 = 104;
                        }
                        int var23 = arg4;
                        if (arg4 < 0) {
                            var23 = 0;
                        } else if (arg4 >= 104) {
                            var23 = 104;
                        }
                        int var24 = arg4 + 64;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 >= 104) {
                            var24 = 104;
                        }
                        while (var21 > var22) {
                            while (var24 > var23) {
                                class214.field2986[var19][var22][var23] = class214.field2986[var19 - 1][var22][var23];
                                var23++;
                            }
                            var22++;
                        }
                    }
                }
                var17 = true;
            }
        }
        if (!var17) {
            for (int var34 = 0; var34 < 4; var34++) {
                for (int var35 = 0; var35 < 16; var35++) {
                    for (int var36 = 0; var36 < 16; var36++) {
                        int var37 = (arg0 >> 2) + var35;
                        int var38 = (arg4 >> 2) + var36;
                        if (var37 >= 0 && var37 < 26 && var38 >= 0 && var38 < 26) {
                            class214.field2986[var34][var37][var38] = 0;
                        }
                    }
                }
            }
        }
        if (var16) {
            return class287.field4478;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)V")
    public static final void method155(int arg0, boolean arg1) {
        field303++;
        byte[][] var2 = class261.field3801;
        byte var3 = 4;
        for (int var4 = 0; var4 < var3; var4++) {
            class6.method32(arg0 ^ 0x48);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class124.field1791[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x34FDAD2) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0xFFCA4E) >> 14;
                            int var10 = var7 >> 1 & 0x3;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var9 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class190.field2739.length; var13++) {
                                if (class190.field2739[var13] == var12 && var2[var13] != null) {
                                    class54.method329(var10, arg1, var8, (var11 & 0x7) * 8, var2[var13], var4, var5 * 8, (var9 & 0x7) * 8, arg0 ^ 0x78, class127.field1825, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 8) {
            field305 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V")
    public static final void method156(byte arg0) {
        field309++;
        class274.field4074.method71(-76);
        class28.field336.method71(-112);
        int var1 = 86 % ((-arg0 - 60) / 57);
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(II)V")
    public class26(int arg0, int arg1) {
        this.field297 = arg0;
        this.field298 = arg1;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(ILbc;)V")
    public static final void method157(int arg0, class282 arg1) {
        field300++;
        if (arg0 >= -7) {
            method158(82, -60, 41);
        }
        class257.field3709 = arg1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)Lcf;")
    public static final class163 method158(int arg0, int arg1, int arg2) {
        class133 var3 = class6.field94[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1920;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)I")
    public static final int method159(boolean arg0, int arg1) {
        field306++;
        if (!arg0) {
            method155(-71, false);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(B)V")
    public static void method160(byte arg0) {
        field305 = null;
        field314 = null;
        field299 = null;
        field312 = null;
        field311 = null;
        field313 = null;
        if (arg0 >= 60) {
            field304 = null;
        }
    }
}
