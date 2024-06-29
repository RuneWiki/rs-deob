import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class112 extends class51 {

    @OriginalMember(owner = "client!jl", name = "Y", descriptor = "Lab;")
    private final class295 field2031;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "Lmh;")
    public final class276 field2015;

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "Lhi;")
    private static class82 field2024 = class95.method664((byte) -54, "scroll:");

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "Lhi;")
    public static class82 field2014 = field2024;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "Lhi;")
    private static class82 field2017 = class95.method664((byte) -117, "K");

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "Lhi;")
    public static class82 field2025 = field2024;

    @OriginalMember(owner = "client!jl", name = "Z", descriptor = "I")
    public static int field2032 = 3;

    @OriginalMember(owner = "client!jl", name = "X", descriptor = "Lhi;")
    public static class82 field2030 = field2017;

    @OriginalMember(owner = "client!jl", name = "ab", descriptor = "I")
    public static int field2033 = 0;

    @OriginalMember(owner = "client!jl", name = "bb", descriptor = "Lhi;")
    public static class82 field2034 = field2017;

    @OriginalMember(owner = "client!jl", name = "cb", descriptor = "I")
    public static volatile int field2035 = 0;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    public int field2011;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "I")
    public int field2020;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
    public int field2021;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
    public int field2022;

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "I")
    public int field2023;

    @OriginalMember(owner = "client!jl", name = "T", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!jl", name = "U", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!jl", name = "V", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "[I")
    public static int[] field2013;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "[Lgf;")
    public static class115[] field2018;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "[Luh;")
    public static class67[] field2016;

    @OriginalMember(owner = "client!jl", name = "W", descriptor = "[[Luk;")
    public static class108[][] field2029;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II[BIIII[Luf;BZI)V", line = 4)
    public static final void method773(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, class189[] arg7, byte arg8, boolean arg9, int arg10) {
        field2028++;
        if (!arg9) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if (arg6 + var11 > 0 && (arg6 + var11) < 103 && arg10 + var12 > 0 && arg10 + var12 < 103) {
                        arg7[arg0].field3159[arg6 + var11][arg10 + var12] = class277.method1935(arg7[arg0].field3159[arg6 + var11][arg10 + var12], -16777217);
                    }
                }
            }
        }
        byte var13;
        if (arg9) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class153 var14 = new class153(arg2);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg5 == var15 && arg3 <= var16 && var16 < arg3 + 8 && arg4 <= var17 && var17 < arg4 + 8) {
                        class149.method1032(-26283, arg10 + class293.method2017(var16 & 0x7, arg1, var17 & 0x7, -30911), arg9, arg0, arg6 + class109.method744(var16 & 0x7, (byte) 107, arg1, var17 & 0x7), arg1, 0, 0, var14);
                    } else {
                        class149.method1032(-26283, -1, arg9, 0, -1, 0, 0, 0, var14);
                    }
                }
            }
        }
        boolean var18 = false;
        while (var14.field2611 < var14.field2598.length) {
            int var19 = var14.method1082(-102);
            if (var19 != 129) {
                var14.field2611--;
                break;
            }
            for (int var20 = 0; var20 < 4; var20++) {
                byte var21 = var14.method1104(-1);
                if (var21 == 0) {
                    if (arg5 >= var20) {
                        int var22 = arg6;
                        int var23 = arg10;
                        if (arg10 < 0) {
                            var23 = 0;
                        } else if (arg10 >= 104) {
                            var23 = 104;
                        }
                        if (arg6 < 0) {
                            var22 = 0;
                        } else if (arg6 >= 104) {
                            var22 = 104;
                        }
                        int var24 = arg6 + 7;
                        int var25 = arg10 + 7;
                        if (var25 < 0) {
                            var25 = 0;
                        } else if (var25 >= 104) {
                            var25 = 104;
                        }
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 >= 104) {
                            var24 = 104;
                        }
                        while (var24 > var22) {
                            while (var25 > var23) {
                                class153.field2608[arg0][var22][var23] = 0;
                                var23++;
                            }
                            var22++;
                        }
                    }
                } else if (var21 == 1) {
                    for (int var26 = 0; var26 < 64; var26 += 4) {
                        for (int var27 = 0; var27 < 64; var27 += 4) {
                            byte var28 = var14.method1104(-1);
                            if (arg5 >= var20) {
                                int var29 = var26;
                                while (var29 < (var26 + 4)) {
                                    int var30 = var27;
                                    while (var30 < (var27 + 4)) {
                                        if (arg3 <= var29 && var29 < (arg3 + 8) && var30 >= arg4 && arg4 < arg4 + 8) {
                                            int var31 = class109.method744(var29 & 0x7, (byte) 107, arg1, var30 & 0x7) + arg6;
                                            int var32 = class293.method2017(var29 & 0x7, arg1, var30 & 0x7, arg8 - 30841) + arg10;
                                            if (var31 >= 0 && var31 < 104 && var32 >= 0 && var32 < 104) {
                                                class153.field2608[arg0][var31][var32] = var28;
                                            }
                                        }
                                        var27++;
                                    }
                                    var26++;
                                }
                            }
                        }
                    }
                } else if (var21 == 2) {
                }
            }
        }
        if (class147.field2485 && !arg9) {
            class309 var33 = null;
            while (true) {
                while (var14.field2598.length > var14.field2611) {
                    int var34 = var14.method1082(arg8 ^ 0x19);
                    if (var34 == 0) {
                        var33 = new class309(var14);
                    } else if (var34 == 1) {
                        int var35 = var14.method1082(-82);
                        if (var35 > 0) {
                            for (int var36 = 0; var36 < var35; var36++) {
                                class300 var37 = new class300(var14);
                                int var38 = var37.field5101 >> 7;
                                int var39 = var37.field5105 >> 7;
                                if (var37.field5114 == arg5 && arg3 <= var38 && (arg3 + 8) > var38 && arg4 <= var39 && (arg4 + 8) > var39) {
                                    int var40 = (arg6 << 7) + class32.method252(arg1, var37.field5105 & 0x3FF, true, var37.field5101 & 0x3FF);
                                    int var41 = (arg10 << 7) + class279.method1943(var37.field5101 & 0x3FF, arg8 ^ 0xFFFFFFBB, arg1, var37.field5105 & 0x3FF);
                                    var37.field5101 = var40;
                                    int var42 = var37.field5101 >> 7;
                                    var37.field5105 = var41;
                                    int var43 = var37.field5105 >> 7;
                                    if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                                        var37.field5118 = class245.field4255[var37.field5114][var42][var43] - var37.field5118;
                                        class2.method11(var37);
                                    }
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var33 == null) {
                    var33 = new class309();
                }
                class276.field4646[arg6 >> 3][arg10 >> 3] = var33;
                break;
            }
        }
        if (arg8 != -70) {
            method774(-42);
        }
        if (var18) {
            return;
        }
        int var44 = arg6 + 7;
        int var45 = arg10 + 7;
        for (int var46 = arg6; var46 < var44; var46++) {
            for (int var47 = arg10; var47 < var45; var47++) {
                class153.field2608[arg0][var46][var47] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "(I)V", line = 330)
    public static void method774(int arg0) {
        field2013 = null;
        field2034 = null;
        field2029 = (class108[][]) null;
        if (arg0 >= -9) {
            field2016 = (class67[]) null;
        }
        field2018 = null;
        field2024 = null;
        field2017 = null;
        field2025 = null;
        field2014 = null;
        field2030 = null;
        field2016 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIII)V", line = 369)
    public final void method775(int arg0, int arg1, int arg2, int arg3) {
        field2019++;
        if (arg1 != 30697) {
            method773(-108, -3, (byte[]) null, 75, 67, 77, 15, (class189[]) null, (byte) -71, true, 58);
        }
        this.field2011 = arg0;
        this.field2026 = arg2;
        this.field2022 = arg3;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lmh;Lab;)V", line = 410)
    public class112(class276 arg0, class295 arg1) {
        this.field2031 = arg1;
        this.field2015 = arg0;
    }
}
