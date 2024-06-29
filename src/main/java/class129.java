import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class129 extends class4 {

    @OriginalMember(owner = "client!nd", name = "rc", descriptor = "Ljd;")
    public static class92 field2589 = class202.method1325((byte) 90, "Stufe)2");

    @OriginalMember(owner = "client!nd", name = "vc", descriptor = "Ljd;")
    public static class92 field2593 = class202.method1325((byte) 90, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!nd", name = "qc", descriptor = "I")
    public static int field2588 = 5063219;

    @OriginalMember(owner = "client!nd", name = "xc", descriptor = "Ljd;")
    public static class92 field2595 = class202.method1325((byte) 90, "mapflag");

    @OriginalMember(owner = "client!nd", name = "Cc", descriptor = "I")
    public static int field2600 = 0;

    @OriginalMember(owner = "client!nd", name = "Fc", descriptor = "Ljd;")
    public static class92 field2603 = class202.method1325((byte) 90, "leuchten2:");

    @OriginalMember(owner = "client!nd", name = "Ac", descriptor = "I")
    public static int field2598 = 0;

    @OriginalMember(owner = "client!nd", name = "Ec", descriptor = "I")
    public static int field2602 = 128;

    @OriginalMember(owner = "client!nd", name = "sc", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!nd", name = "tc", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!nd", name = "wc", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!nd", name = "yc", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!nd", name = "zc", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!nd", name = "Dc", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!nd", name = "Bc", descriptor = "Lrf;")
    public static class167 field2599;

    @OriginalMember(owner = "client!nd", name = "uc", descriptor = "Lji;")
    public class97 field2592;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIBI)V")
    public static final void method852(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        for (class187 var5 = (class187) class135.field2699.method103(57); var5 != null; var5 = (class187) class135.field2699.method100(-49)) {
            if (var5.field3541 != -1 || var5.field3543 != null) {
                int var6 = 0;
                if (var5.field3531 >= arg4) {
                    if (~var5.field3524 < ~arg4) {
                        var6 += var5.field3524 - arg4;
                    }
                } else {
                    var6 += -var5.field3531 + arg4;
                }
                if (var5.field3537 < arg2) {
                    var6 += -var5.field3537 + arg2;
                } else if (arg2 < var5.field3544) {
                    var6 += -arg2 + var5.field3544;
                }
                if (~var5.field3532 <= ~(var6 + -64) && class136.field2730 != 0 && ~var5.field3525 == ~arg0) {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (-var6 + var5.field3532) * class136.field2730 / var5.field3532;
                    if (var5.field3528 == null) {
                        if (~var5.field3541 <= -1) {
                            class23 var8 = class23.method144(class214.field4183, var5.field3541, 0);
                            if (var8 != null) {
                                class203 var9 = var8.method146().method1329(class67.field1361);
                                class71 var10 = class71.method471(var9, 100, var7);
                                var10.method500(-1);
                                class55.field1136.method375(var10);
                                var5.field3528 = var10;
                            }
                        }
                    } else {
                        var5.field3528.method502(var7);
                    }
                    if (var5.field3545 == null) {
                        if (var5.field3543 != null && (var5.field3542 -= arg1) <= 0) {
                            int var11 = (int) (Math.random() * (double) var5.field3543.length);
                            class23 var12 = class23.method144(class214.field4183, var5.field3543[var11], 0);
                            if (var12 != null) {
                                class203 var13 = var12.method146().method1329(class67.field1361);
                                class71 var14 = class71.method471(var13, 100, var7);
                                var14.method500(0);
                                class55.field1136.method375(var14);
                                var5.field3542 = var5.field3522 + (int) ((double) (-var5.field3522 + var5.field3523) * Math.random());
                                var5.field3545 = var14;
                            }
                        }
                    } else {
                        var5.field3545.method502(var7);
                        if (!var5.field3545.method1371((byte) -62)) {
                            var5.field3545 = null;
                        }
                    }
                } else {
                    if (var5.field3528 != null) {
                        class55.field1136.method373(var5.field3528);
                        var5.field3528 = null;
                    }
                    if (var5.field3545 != null) {
                        class55.field1136.method373(var5.field3545);
                        var5.field3545 = null;
                    }
                }
            }
        }
        if (arg3 != 10) {
            method854(-28, -9, (class92[]) null, 71);
        }
        ++field2590;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(B)V")
    public static void method853(byte arg0) {
        if (arg0 <= -55) {
            field2599 = null;
            field2603 = null;
            field2593 = null;
            field2595 = null;
            field2589 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[Ljd;I)Ljd;")
    public static final class92 method854(int arg0, int arg1, class92[] arg2, int arg3) {
        ++field2594;
        int var4 = 0;
        for (int var5 = 0; arg1 > var5; ++var5) {
            if (arg2[arg3 + var5] == null) {
                arg2[arg3 + var5] = class73.field1545;
            }
            var4 += arg2[arg3 + var5].field1838;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; ~arg1 < ~var8; ++var8) {
            class92 var10 = arg2[arg3 + var8];
            class11.method75(var10.field1856, 0, var7, var6, var10.field1838);
            var6 += var10.field1838;
        }
        class92 var9 = new class92();
        var9.field1856 = var7;
        var9.field1838 = var4;
        if (arg0 < 53) {
            field2598 = 118;
        }
        return var9;
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)Z")
    public final boolean method24(int arg0) {
        ++field2591;
        if (this.field2592 == null) {
            return false;
        } else {
            if (arg0 != 100) {
                method852(37, -120, 8, (byte) 53, 112);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field2596;
        if (this.field2592 != null) {
            class22 var11 = super.field215 != -1 && super.field254 == 0 ? class153.method978(super.field215, -123) : null;
            class22 var12 = super.field216 == -1 || super.field224 == super.field216 && var11 != null ? null : class153.method978(super.field216, -120);
            class38 var13 = this.field2592.method679(var11, super.field221, super.field260, -129, var12);
            if (var13 != null) {
                var13.method236();
                super.field3511 = var13.field3511;
                if (this.field2592.field1982 != 0 && this.field2592.field1937 != 0) {
                    int var14 = class194.field3787[arg0];
                    short var15 = this.field2592.field1982;
                    int var16 = -var15 / 2;
                    int var17 = class194.field3803[arg0];
                    short var18 = this.field2592.field1937;
                    int var19 = var15 / 2;
                    int var20 = -var18 / 2;
                    int var21 = var14 * var20 + var16 * var17 >> 16;
                    int var22 = var17 * var20 + -(var14 * var16) >> 16;
                    int var23 = -var18 / 2;
                    int var24 = var14 * var23 + var17 * var19 >> 16;
                    int var25 = var17 * var23 + -(var14 * var19) >> 16;
                    int var26 = -var15 / 2;
                    int var27 = class118.method804(super.field246 - -var21, class81.field1639, super.field208 - -var22, 0);
                    int var28 = class118.method804(super.field246 - -var24, class81.field1639, super.field208 - -var25, 0);
                    int var29 = var18 / 2;
                    int var30 = var14 * var29 + var17 * var26 >> 16;
                    int var31 = var17 * var29 + -(var14 * var26) >> 16;
                    int var32 = var15 / 2;
                    int var33 = class118.method804(super.field246 + var30, class81.field1639, super.field208 + var31, 0);
                    int var34 = var18 / 2;
                    int var35 = var17 * var34 + -(var14 * var32) >> 16;
                    int var36 = var14 * var34 - -(var17 * var32) >> 16;
                    int var37 = class118.method804(super.field246 + var36, class81.field1639, super.field208 + var35, 0);
                    int var38 = ~var37 < ~var33 ? var33 : var37;
                    int var39 = ~var28 <= ~var37 ? var37 : var28;
                    int var40 = ~var27 > ~var28 ? var27 : var28;
                    int var41 = (int) (320.0D * Math.atan2((double) (-var38 + var40), (double) var18)) & 2047;
                    var13.method243(var41);
                    int var42 = var33 > var27 ? var27 : var33;
                    int var43 = 2047 & (int) (Math.atan2((double) (-var39 + var42), (double) var15) * 320.0D);
                    int var44 = (var39 + var42 + var38 + var40) / 4;
                    var13.method247(var43);
                    var13.method241(0, -super.field248 + var44, 0);
                }
                class38 var45 = null;
                if (~super.field238 != 0 && ~super.field240 != 0) {
                    var45 = class102.method702((byte) -98, super.field238).method383(super.field240, -47);
                    if (var45 != null) {
                        var45.method241(0, -super.field214, 0);
                    }
                }
                if (var45 != null) {
                    var13 = ((class191) var13).method1261(var45);
                }
                if (~this.field2592.field1963 == -2) {
                    var13.field868 = true;
                }
                var13.method600(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZJ)Ljd;")
    public static final class92 method855(boolean arg0, long arg1) {
        ++field2597;
        if (arg1 > 0L && arg1 < 6582952005840035281L) {
            if (~(arg1 % 37L) == -1L) {
                return null;
            } else {
                if (arg0) {
                    method852(74, -79, 51, (byte) 92, 10);
                }
                int var3 = 0;
                long var4 = arg1;
                while (~var4 != -1L) {
                    var4 /= 37L;
                    ++var3;
                }
                byte[] var6 = new byte[var3];
                while (arg1 != 0L) {
                    long var8 = arg1;
                    arg1 /= 37L;
                    --var3;
                    var6[var3] = class118.field2392[(int) (-(arg1 * 37L) + var8)];
                }
                class92 var7 = new class92();
                var7.field1856 = var6;
                var7.field1838 = var6.length;
                return var7;
            }
        } else {
            return null;
        }
    }
}
