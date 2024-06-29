import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class244 extends RuntimeException {

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4274;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Ljava/lang/String;")
    public String field4266;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lr;")
    public static class66 field4267 = class93.method641(43, " <col=ffffff>");

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lr;")
    public static class66 field4259 = class93.method641(43, "http:)4)4");

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lr;")
    private static class66 field4271 = class93.method641(43, "glow1:");

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lr;")
    public static class66 field4257 = field4271;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field4258 = 0;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Lr;")
    public static class66 field4270 = field4271;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Lni;")
    public static class168 field4273;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lcj;")
    public static class28 field4263;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILjh;ILuc;IIIIIIIZ)Ljh;")
    public static final class262 method1604(int arg0, int arg1, int arg2, class262 arg3, int arg4, class224 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13) {
        long var14 = ((long) arg7 << 48) + ((long) arg11 << 32) + (long) ((arg6 << 24) + (arg10 << 16) + arg9);
        field4265++;
        class262 var16 = (class262) class255.field4476.method1617(14366, var14);
        if (var16 == null) {
            byte var17;
            if (arg9 == 1) {
                var17 = 9;
            } else if (arg9 == 2) {
                var17 = 12;
            } else if (arg9 == 3) {
                var17 = 15;
            } else if (arg9 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            int[][] var20 = new int[var18][var17];
            class118 var21 = new class118((var17 * var18) + 1, var17 * 2 * var18 + -var17, 0);
            int var22 = var21.method805(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = arg8 + (class123.field2314[var33] * var31) >> 16;
                    int var35 = arg0 + (class123.field2326[var33] * var30) >> 16;
                    var20[var23][var32] = var21.method805(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                short var27 = (short) (((arg7 & 0x7F) * var25 + (arg11 & 0x7F) * var26 & 0x7F00) + ((arg7 & 0x380) * var25 + (arg11 & 0x380) * var26 & 0x38000) + ((arg7 & 0xFC00) * var25 + (arg11 & 0xFC00) * var26 & 0xFC0000) >> 8);
                byte var28 = (byte) (arg6 * var25 + arg10 * var26 >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var21.method810(var22, var20[0][(var29 + 1) % var17], var20[0][var29], (byte) 1, var27, var28);
                    } else {
                        var21.method810(var20[var24 - 1][var29], var20[var24 - 1][(var29 + 1) % var17], var20[var24][(var29 + 1) % var17], (byte) 1, var27, var28);
                        var21.method810(var20[var24 - 1][var29], var20[var24][(var29 + 1) % var17], var20[var24][var29], (byte) 1, var27, var28);
                    }
                }
            }
            var16 = var21.method801(64, 768, -50, -10, -50);
            class255.field4476.method1615(var16, 127, var14);
        }
        int var36 = arg9 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        int var41 = arg3.method1477();
        if (arg13) {
            if (arg1 > 640 && arg1 < 1408) {
                var40 = var36 + 128;
            }
            if (arg1 > 128 && arg1 < 896) {
                var37 -= 128;
            }
            if (arg1 > 1664 || arg1 < 384) {
                var38 -= 128;
            }
            if (arg1 > 1152 && arg1 < 1920) {
                var39 = var36 + 128;
            }
        }
        if (var41 < var37) {
            var41 = var37;
        }
        int var42 = arg3.method1475();
        if (var42 > var39) {
            var42 = var39;
        }
        int var43 = arg3.method1481();
        if (var43 < var38) {
            var43 = var38;
        }
        class154 var44 = null;
        int var45 = arg3.method1463();
        if (arg5 != null) {
            int var46 = arg5.field3811[arg4];
            var44 = class241.method1592(var46 >> 16, (byte) -96);
            arg4 = var46 & 0xFFFF;
        }
        int var47 = 125 % ((-arg12 - 7) / 52);
        if (var40 < var45) {
            var45 = var40;
        }
        class262 var48;
        if (var44 == null) {
            var48 = var16.method1482(true, true);
            var48.method1467((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var48.method1471((var41 + var42) / 2, 0, (var43 + var45) / 2);
        } else {
            var48 = var16.method1482(!var44.method1050(true, arg4), true);
            var48.method1467((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var48.method1471((var41 + var42) / 2, 0, (var43 + var45) / 2);
            var48.method1487(var44, arg4);
        }
        if (arg1 != 0) {
            var48.method1491(arg1);
        }
        class229 var49 = (class229) var48;
        if (arg2 != class45.method327(arg8 + var41, class196.field3401, arg0 + var43, false) || class45.method327(arg8 + var42, class196.field3401, arg0 + var45, false) != arg2) {
            for (int var50 = 0; var50 < var49.field3931; var50++) {
                var49.field3910[var50] += class45.method327(var49.field3930[var50] + arg8, class196.field3401, var49.field3919[var50] + arg0, false) - arg2;
            }
            var49.field3921 = false;
        }
        return var48;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method1605(int arg0) {
        field4257 = null;
        field4271 = null;
        field4259 = null;
        field4270 = null;
        field4273 = null;
        field4263 = null;
        if (arg0 != 64) {
            method1609(false, 79, 66, (byte) 113, 45, (class247) null, (byte) 12);
        }
        field4267 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)I")
    public static final int method1606(int arg0, int arg1) {
        field4264++;
        if (arg1 <= 44) {
            field4268 = 118;
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
    public static final void method1607(int arg0, int arg1, int arg2) {
        if (arg0 >= 65) {
            field4260++;
            if (class164.method1107(arg1, (byte) -2)) {
                class52.method361(arg2, class31.field466[arg1], 16);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZIIII[BI[Lga;II)V")
    public static final void method1608(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, class165[] arg8, int arg9, int arg10) {
        field4272++;
        int var11 = -1;
        if (arg9 < 67) {
            field4273 = null;
        }
        class249 var12 = new class249(arg6);
        while (true) {
            int var13 = var12.method1664(true);
            if (var13 == 0) {
                return;
            }
            int var14 = 0;
            var11 += var13;
            while (true) {
                int var15 = var12.method1639(255);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = (var14 & 0xFC8) >> 6;
                int var17 = var14 >> 12;
                int var18 = var12.method1677(-6677);
                int var19 = var14 & 0x3F;
                int var20 = var18 >> 2;
                int var21 = var18 & 0x3;
                if (arg7 == var17 && arg5 <= var16 && (arg5 + 8) > var16 && var19 >= arg2 && (arg2 + 8) > var19) {
                    class231 var22 = class52.method359(110, var11);
                    int var23 = arg3 + class214.method1379(var21, var19 & 0x7, var22.field4021, var16 & 0x7, var22.field4020, -120, arg4);
                    int var24 = arg10 + class219.method1404(var21, var22.field4021, arg4, var19 & 0x7, var22.field4020, var16 & 0x7, (byte) -128);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class165 var25 = null;
                        if (!arg1) {
                            int var26 = arg0;
                            if ((class47.field846[1][var23][var24] & 0x2) == 2) {
                                var26 = arg0 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg8[var26];
                            }
                        }
                        class154.method1051(var25, 1, arg1, var24, var21 + arg4 & 0x3, var23, var20, arg0, arg0, !arg1, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZIIBILsg;B)V")
    public static final void method1609(boolean arg0, int arg1, int arg2, byte arg3, int arg4, class247 arg5, byte arg6) {
        long var7 = (long) ((arg2 << 16) + arg4);
        field4261++;
        class54 var9 = (class54) class252.field4427.method1381(var7, -58);
        if (arg6 != 22 || var9 != null) {
            return;
        }
        class54 var10 = (class54) class156.field2775.method1381(var7, -47);
        if (var10 != null) {
            return;
        }
        class54 var11 = (class54) class249.field4398.method1381(var7, 73);
        if (var11 == null) {
            if (!arg0) {
                class54 var12 = (class54) class257.field4519.method1381(var7, -100);
                if (var12 != null) {
                    return;
                }
            }
            class54 var13 = new class54();
            var13.field939 = arg5;
            var13.field937 = arg1;
            var13.field936 = arg3;
            if (arg0) {
                class252.field4427.method1380((byte) 119, var13, var7);
                class87.field1707++;
            } else {
                class207.field3589.method1135(125, var13);
                class249.field4398.method1380((byte) 127, var13, var7);
                class167.field3008++;
            }
        } else if (arg0) {
            var11.method704((byte) 73);
            class252.field4427.method1380((byte) 123, var11, var7);
            class87.field1707++;
            class167.field3008--;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class244(Throwable arg0, String arg1) {
        this.field4274 = arg0;
        this.field4266 = arg1;
    }
}
