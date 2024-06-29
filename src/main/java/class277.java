import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class277 extends class171 {

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "Ljava/lang/String;")
    public String field4292;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "[I")
    public static int[] field4287 = new int[200];

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4291 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4290 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4294 = "Discard";

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4295 = "Examine";

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4285;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z[B[Ljb;ZIIII)[I")
    public static final int[] method1850(boolean arg0, byte[] arg1, class276[] arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field4293++;
        if (!arg0) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if (arg5 + var9 > 0 && arg5 + var9 < 103 && (arg4 + var10) > 0 && (arg4 + var10) < 103) {
                            arg2[var8].field4272[arg5 + var9][arg4 + var10] = class235.method1572(arg2[var8].field4272[arg5 + var9][arg4 + var10], -2097153);
                        }
                    }
                }
            }
        }
        if (!arg3) {
            field4294 = null;
        }
        byte var11;
        if (arg0) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class224 var12 = new class224(arg1);
        int var13 = arg5 + arg6;
        int var14 = arg4 + arg7;
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var39 = 0; var39 < 64; var39++) {
                for (int var40 = 0; var40 < 64; var40++) {
                    class135.method916(var14 + var40, 84, arg5 + var39, var13 + var39, var15, arg4 + var40, 0, false, arg0, var12);
                }
            }
        }
        boolean var16 = false;
        boolean var17 = false;
        while (var12.field3402 < var12.field3336.length) {
            int var18 = var12.method1453((byte) -127);
            if (var18 == 128) {
                class285.field4471[0] = var12.method1445(false);
                var16 = true;
                class285.field4471[1] = var12.method1479(false);
                class285.field4471[2] = var12.method1479(false);
                class285.field4471[3] = var12.method1479(!arg3);
                class285.field4471[4] = var12.method1445(!arg3);
            } else {
                if (var18 != 129) {
                    var12.field3402--;
                    break;
                }
                for (int var19 = 0; var19 < 4; var19++) {
                    byte var20 = var12.method1437((byte) -122);
                    if (var20 == 0) {
                        int var30 = arg5;
                        if (arg5 < 0) {
                            var30 = 0;
                        } else if (arg5 >= 104) {
                            var30 = 104;
                        }
                        int var31 = arg5 + 64;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 >= 104) {
                            var31 = 104;
                        }
                        int var32 = arg4 + 64;
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
                        while (var31 > var30) {
                            while (var32 > var33) {
                                class228.field3447[var19][var30][var33] = 0;
                                var33++;
                            }
                            var30++;
                        }
                    } else if (var20 == 1) {
                        for (int var21 = 0; var21 < 64; var21 += 4) {
                            for (int var22 = 0; var22 < 64; var22 += 4) {
                                byte var23 = var12.method1437((byte) -104);
                                for (int var24 = arg5 + var21; var24 < var21 + arg5 + 4; var24++) {
                                    for (int var25 = arg4 + var22; var25 < (arg4 + var22 + 4); var25++) {
                                        if (var24 >= 0 && var24 < 104 && var25 >= 0 && var25 < 104) {
                                            class228.field3447[var19][var24][var25] = var23;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2 && var19 > 0) {
                        int var26 = arg5 + 64;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 >= 104) {
                            var26 = 104;
                        }
                        int var27 = arg5;
                        if (arg5 < 0) {
                            var27 = 0;
                        } else if (arg5 >= 104) {
                            var27 = 104;
                        }
                        int var28 = arg4;
                        int var29 = arg4 + 64;
                        if (arg4 < 0) {
                            var28 = 0;
                        } else if (arg4 >= 104) {
                            var28 = 104;
                        }
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 >= 104) {
                            var29 = 104;
                        }
                        while (var27 < var26) {
                            while (var28 < var29) {
                                class228.field3447[var19][var27][var28] = class228.field3447[var19 - 1][var27][var28];
                                var28++;
                            }
                            var27++;
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
                        int var37 = (arg5 >> 2) + var35;
                        int var38 = (arg4 >> 2) + var36;
                        if (var37 >= 0 && var37 < 26 && var38 >= 0 && var38 < 26) {
                            class228.field3447[var34][var37][var38] = 0;
                        }
                    }
                }
            }
        }
        if (var16) {
            return class285.field4471;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "(I)V")
    public static void method1851(int arg0) {
        field4287 = null;
        field4295 = null;
        if (arg0 == -4) {
            field4290 = null;
            field4291 = null;
            field4285 = null;
            field4294 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZB)I")
    public static final int method1852(boolean arg0, byte arg1) {
        field4289++;
        long var2 = class223.method1433((byte) -120);
        class248 var4 = arg0 ? (class248) class230.field3487.method21((byte) 67) : (class248) class230.field3487.method22(true);
        int var5 = 58 % ((-arg1 - 8) / 40);
        while (var4 != null) {
            if (var2 > (var4.field3801 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field3801 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var4.field2369;
                    class120.field1688[var6] = class119.field1677[var6];
                    var4.method1115(80);
                    return var6;
                }
                var4.method1115(36);
            }
            var4 = (class248) class230.field3487.method22(true);
        }
        return -1;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
    public class277() {
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class277(String arg0, int arg1) {
        this.field4292 = arg0;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)V")
    public static final void method1853(byte arg0) {
        field4286++;
        class282.field4364.method19((byte) 11);
        if (arg0 > -90) {
            field4294 = null;
        }
        class205.field2854.method1888(0);
        class118.field1672.method1888(0);
    }
}
