import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class120 {

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Lvb;")
    public static class192 field2303 = new class192();

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lai;")
    public static class10 field2305 = class44.method278("Die Adresse dieses Computers wurde gesperrt)1", -91);

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field2304 = 0;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Lai;")
    public static class10 field2311 = class44.method278(":", 111);

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field2314 = 0;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field2312 = -1;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "Lai;")
    public static class10 field2315 = class44.method278("null", -60);

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lai;")
    private static class10 field2307 = class44.method278("Connecting to update server", 105);

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field2309 = 0;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field2317 = 127;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "Lai;")
    public static class10 field2318 = class44.method278("Keine Antwort vom Server)3", 118);

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field2310 = 0;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lai;")
    public static class10 field2319 = field2307;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lai;")
    public static class10 field2308 = class44.method278(")1j", 114);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Lih;")
    public static class81 field2313;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBIIII)V")
    public static final void method849(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 106 % ((-arg1 - 13) / 32);
        int var7 = class36.field560.method563(arg5, arg4, arg0);
        field2302++;
        if (var7 != 0) {
            int var8 = class36.field560.method588(arg5, arg4, arg0, var7);
            int var9 = var8 & 0x1F;
            int var10 = arg3;
            if (var7 > 0) {
                var10 = arg2;
            }
            int var11 = var8 >> 6 & 0x3;
            int var12 = arg4 * 4 + (-arg0 + 103) * 2048 + 24624;
            int[] var13 = class67.field1172.field258;
            int var14 = var7 >> 14 & 0x7FFF;
            class47 var15 = class184.method1189(var14, 6);
            if (var15.field821 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var11 == 0) {
                        var13[var12] = var10;
                        var13[var12 + 512] = var10;
                        var13[var12 + 1024] = var10;
                        var13[var12 + 1536] = var10;
                    } else if (var11 == 1) {
                        var13[var12] = var10;
                        var13[var12 + 1] = var10;
                        var13[var12 + 2] = var10;
                        var13[var12 + 3] = var10;
                    } else if (var11 == 2) {
                        var13[var12 + 3] = var10;
                        var13[var12 + 512 + 3] = var10;
                        var13[var12 + 1024 + 3] = var10;
                        var13[var12 + 1536 + 3] = var10;
                    } else if (var11 == 3) {
                        var13[var12 + 1536] = var10;
                        var13[var12 + 1 + 1536] = var10;
                        var13[var12 + 1536 + 2] = var10;
                        var13[var12 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var11 == 0) {
                        var13[var12] = var10;
                    } else if (var11 == 1) {
                        var13[var12 + 3] = var10;
                    } else if (var11 == 2) {
                        var13[var12 + 1539] = var10;
                    } else if (var11 == 3) {
                        var13[var12 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var11 == 3) {
                        var13[var12] = var10;
                        var13[var12 + 512] = var10;
                        var13[var12 + 1024] = var10;
                        var13[var12 + 1536] = var10;
                    } else if (var11 == 0) {
                        var13[var12] = var10;
                        var13[var12 + 1] = var10;
                        var13[var12 + 2] = var10;
                        var13[var12 + 3] = var10;
                    } else if (var11 == 1) {
                        var13[var12 + 3] = var10;
                        var13[var12 + 515] = var10;
                        var13[var12 + 1027] = var10;
                        var13[var12 + 3 + 1536] = var10;
                    } else if (var11 == 2) {
                        var13[var12 + 1536] = var10;
                        var13[var12 + 1537] = var10;
                        var13[var12 + 1538] = var10;
                        var13[var12 + 1536 + 3] = var10;
                    }
                }
            } else {
                class173 var16 = class93.field1680[var15.field821];
                if (var16 != null) {
                    int var17 = (var15.field804 * 4 - var16.field3341) / 2;
                    int var18 = (var15.field792 * 4 - var16.field3342) / 2;
                    var16.method1134(arg4 * 4 + var17 + 48, (-arg0 + 104 + -var15.field792) * 4 + var18 + 48);
                }
            }
        }
        int var19 = class36.field560.method571(arg5, arg4, arg0);
        if (var19 != 0) {
            int var20 = class36.field560.method588(arg5, arg4, arg0, var19);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = var19 >> 14 & 0x7FFF;
            class47 var24 = class184.method1189(var23, 6);
            if (var24.field821 != -1) {
                class173 var28 = class93.field1680[var24.field821];
                if (var28 != null) {
                    int var29 = (var24.field804 * 4 - var28.field3341) / 2;
                    int var30 = (var24.field792 * 4 - var28.field3342) / 2;
                    var28.method1134(arg4 * 4 + var29 + 48, (104 - (var24.field792 + arg0)) * 4 + 48 + var30);
                }
            } else if (var22 == 9) {
                int[] var25 = class67.field1172.field258;
                int var26 = 15658734;
                int var27 = (103 - arg0) * 4 * 512 + arg4 * 4 + 24624;
                if (var19 > 0) {
                    var26 = 15597568;
                }
                if (var21 == 0 || var21 == 2) {
                    var25[var27 + 1536] = var26;
                    var25[var27 + 1024 + 1] = var26;
                    var25[var27 + 512 + 2] = var26;
                    var25[var27 + 3] = var26;
                } else {
                    var25[var27] = var26;
                    var25[var27 + 1 + 512] = var26;
                    var25[var27 + 1024 + 2] = var26;
                    var25[var27 + 1536 + 3] = var26;
                }
            }
        }
        int var31 = class36.field560.method580(arg5, arg4, arg0);
        if (var31 == 0) {
            return;
        }
        int var32 = var31 >> 14 & 0x7FFF;
        class47 var33 = class184.method1189(var32, 6);
        if (var33.field821 == -1) {
            return;
        }
        class173 var34 = class93.field1680[var33.field821];
        if (var34 != null) {
            int var35 = (var33.field804 * 4 - var34.field3341) / 2;
            int var36 = (var33.field792 * 4 - var34.field3342) / 2;
            var34.method1134(arg4 * 4 + var35 + 48, (104 - arg0 + -var33.field792) * 4 + 48 + var36);
            return;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
    public static void method850(boolean arg0) {
        field2315 = null;
        field2318 = null;
        field2313 = null;
        if (arg0) {
            field2309 = 74;
        }
        field2319 = null;
        field2307 = null;
        field2311 = null;
        field2303 = null;
        field2305 = null;
        field2308 = null;
    }
}
