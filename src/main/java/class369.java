import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class369 {

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "Lwb;")
    private class45 field5278 = new class45(256);

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "Lwb;")
    private class45 field5284 = new class45(256);

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "Lg;")
    private class470 field5279;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "Lg;")
    private class470 field5273;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "Lwb;")
    public static class45 field5270 = new class45(8);

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public static int field5280 = 0;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "[I")
    public static int[] field5283 = new int[4];

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IB[II)Ljk;")
    private final class436 method2228(int arg0, byte arg1, int[] arg2, int arg3) {
        if (arg1 != 46) {
            return null;
        }
        field5282++;
        int var5 = (arg0 << 4 & 0xFFF9 | arg0 >>> 12) ^ arg3;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class436 var9 = (class436) this.field5284.method233(124, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class9 var10 = (class9) this.field5278.method233(-110, var7);
            if (var10 == null) {
                var10 = class9.method64(this.field5273, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field5278.method234(arg1 - 132, var7, var10);
            }
            class436 var11 = var10.method61(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method702((byte) -114);
                this.field5284.method234(-53, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)I")
    public static final int method2229(int arg0, int arg1) {
        if (arg0 != 32481) {
            field5283 = null;
        }
        field5281++;
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xD2) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I[IB)Ljk;")
    public final class436 method2230(int arg0, int[] arg1, byte arg2) {
        if (arg2 != 57) {
            method2229(-81, -81);
        }
        field5276++;
        if (this.field5273.method2756(true) == 1) {
            return this.method2228(0, (byte) 46, arg1, arg0);
        } else if (this.field5273.method2755(arg2 - 161, arg0) == 1) {
            return this.method2228(arg0, (byte) 46, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
    public static void method2231(int arg0) {
        field5283 = null;
        field5270 = null;
        if (arg0 <= 66) {
            field5280 = 123;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "([III)Ljk;")
    public final class436 method2232(int[] arg0, int arg1, int arg2) {
        if (arg1 != -29797) {
            this.field5273 = null;
        }
        field5274++;
        if (this.field5279.method2756(true) == 1) {
            return this.method2234(arg0, arg2, 0, -1690955440);
        } else if (this.field5279.method2755(-82, arg2) == 1) {
            return this.method2234(arg0, 0, arg2, arg1 ^ 0x64C99ACB);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V")
    public static final void method2233(int arg0) {
        if (arg0 != 9776) {
            method2229(37, 66);
        }
        field5272++;
        if (class206.field2836) {
            class68.field848 = null;
            class206.field2836 = false;
            class94.field1180 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "([IIII)Ljk;")
    private final class436 method2234(int[] arg0, int arg1, int arg2, int arg3) {
        field5275++;
        int var5 = arg1 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFF7);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class436 var9 = (class436) this.field5284.method233(arg3 + 1690955320, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class245 var10 = class245.method1333(this.field5279, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class436 var11 = var10.method1334();
            this.field5284.method234(-70, var7, var11);
            if (arg0 != null) {
                arg0[0] -= var11.field6268.length;
            }
            if (arg3 != -1690955440) {
                field5270 = null;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(II)V")
    public static final void method2235(int arg0, int arg1) {
        if (class88.field1096 == null || arg0 > class88.field1096.length) {
            class88.field1096 = new int[arg0];
        }
        field5277++;
        if (arg1 <= 66) {
            method2229(-80, 29);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lqh;IILoj;ILhu;IIIIIZIII)Lqh;")
    public static final class352 method2236(class352 arg0, int arg1, int arg2, class280 arg3, int arg4, class207 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, int arg12, int arg13, int arg14) {
        field5271++;
        if (arg0 == null) {
            return null;
        }
        int var15 = 1031;
        if (arg5 != null) {
            int var16 = var15 | arg5.method1143(false, arg14, -1632205712, -1);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg13 << 48) + ((long) arg7 << 32) + (long) ((arg4 << 16) + (arg6 << 24) + arg9);
        class210 var19 = class160.field1926;
        class352 var20;
        synchronized (class160.field1926) {
            var20 = (class352) class160.field1926.method1163((byte) 111, var17);
        }
        if (var20 == null || arg3.method1473(var20.method1719(), var15) != 0) {
            if (var20 != null) {
                var15 = arg3.method1443(var15, var20.method1719());
            }
            byte var21;
            if (arg9 == 1) {
                var21 = 9;
            } else if (arg9 == 2) {
                var21 = 12;
            } else if (arg9 == 3) {
                var21 = 15;
            } else if (arg9 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class10 var24 = new class10(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
            int var25 = var24.method73(0, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class16.field212[var31] * var28 >> 15;
                    int var33 = class16.field214[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method73(0, var32, 0, var33);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg4 * var36 + arg6 * var35 >> 8);
                short var38 = (short) (((arg7 & 0x7F) * var36 + (arg13 & 0x7F) * var35 & 0x7F00) + ((arg7 & 0x380) * var36 + (arg13 & 0x380) * var35 & 0x38000) + ((arg7 & 0xFC00) * var36 + (arg13 & 0xFC00) * var35 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method71(-68, (byte) -1, var25, var37, (short) -1, var26[0][(var39 + 1) % var21], var26[0][var39], var38, (byte) 1);
                    } else {
                        var24.method71(-25, (byte) -1, var26[var34 - 1][var39], var37, (short) -1, var26[var34 - 1][(var39 + 1) % var21], var26[var34][(var39 + 1) % var21], var38, (byte) 1);
                        var24.method71(-114, (byte) -1, var26[var34 - 1][var39], var37, (short) -1, var26[var34][(var39 + 1) % var21], var26[var34][var39], var38, (byte) 1);
                    }
                }
            }
            var20 = arg3.method1346(var24, var15, class259.field3742, 64, 768);
            class210 var40 = class160.field1926;
            synchronized (class160.field1926) {
                class160.field1926.method1172(var17, 1, var20);
            }
        }
        int var41 = arg9 * 64 - 1;
        int var42 = -var41;
        int var43 = -var41;
        if (arg12 <= 21) {
            field5270 = null;
        }
        int var44 = var41;
        int var45 = var41;
        if (arg11) {
            if (arg10 > 9216 && arg10 < 15360) {
                var44 = var41 + 128;
            }
            if (arg10 > 1024 && arg10 < 7168) {
                var42 -= 128;
            }
            if (arg10 > 5120 && arg10 < 11264) {
                var45 = var41 + 128;
            }
            if (arg10 > 13312 || arg10 < 3072) {
                var43 -= 128;
            }
        }
        int var46 = arg0.method1739();
        int var47 = arg0.method1742();
        int var48 = arg0.method1741();
        if (var47 > var44) {
            var47 = var44;
        }
        if (var43 > var48) {
            var48 = var43;
        }
        int var49 = arg0.method1730();
        if (var46 < var42) {
            var46 = var42;
        }
        if (var49 > var45) {
            var49 = var45;
        }
        class170 var50 = null;
        if (arg5 != null) {
            int var51 = arg5.field2853[arg14];
            var50 = class175.field2103.method1265(var51 >> 16, -8990);
            arg14 = var51 & 0xFFFF;
        }
        class352 var52;
        if (var50 == null) {
            var52 = var20.method1749((byte) 3, var15, true);
            var52.method1692((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method1700((var46 + var47) / 2, 0, (var48 + var49) / 2);
        } else {
            var52 = var20.method1749((byte) 3, var15, true);
            var52.method1692((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method1700((var46 + var47) / 2, 0, (var48 + var49) / 2);
            var52.method2139(false, var50, arg14);
        }
        if (arg2 != 0) {
            var52.method1750(arg2);
        }
        if (arg1 != 0) {
            var52.method1740(arg1);
        }
        if (arg8 != 0) {
            var52.method1700(0, arg8, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lg;Lg;)V")
    public class369(class470 arg0, class470 arg1) {
        this.field5279 = arg0;
        this.field5273 = arg1;
    }

    static {
        new class40("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field5285 = 0;
    }
}
