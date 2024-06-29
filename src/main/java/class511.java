import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class511 extends class583 {

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "Lok;")
    public class253 field7300;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "Lve;")
    public class503 field7301;

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "I")
    public static int field7305 = 0;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "I")
    public int field7302;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "I")
    public int field7306;

    @OriginalMember(owner = "client!jq", name = "y", descriptor = "I")
    public int field7307;

    @OriginalMember(owner = "client!jq", name = "A", descriptor = "I")
    public int field7309;

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
    public int field7313;

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "Lfp;")
    public static class323 field7308;

    @OriginalMember(owner = "client!jq", name = "C", descriptor = "Lfp;")
    public static class323 field7311;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public static void method3017(int arg0) {
        field7311 = null;
        field7308 = null;
        if (arg0 != -4220) {
            field7299 = 82;
        }
    }

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)V")
    public final void method3018(int arg0) {
        field7304++;
        this.field7307 = this.field7300.field3702;
        this.field7309 = this.field7300.field3698;
        this.field7313 = this.field7300.field3706;
        if (arg0 != -24485) {
            return;
        }
        if (this.field7300.field3701 != null) {
            this.field7300.field3701.method338(this.field7301.field7219, this.field7301.field7215, this.field7301.field7226, class253.field3700);
        }
        this.field7306 = class253.field3700[0];
        this.field7302 = class253.field3700[2];
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIIIII[II[ILuu;IZ)I")
    public static final int method3019(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10, int[] arg11, class285 arg12, int arg13, boolean arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class584.field8220[var15][var35] = 0;
                class207.field2722[var15][var35] = 99999999;
            }
        }
        field7312++;
        boolean var16;
        if (arg0 == 1) {
            var16 = class567.method3267(arg1, arg13, arg12, arg5, arg3, arg8, arg10, arg2, arg6, 112, arg7);
        } else if (arg0 == 2) {
            var16 = class263.method1724(arg1, arg8, arg7, arg2, arg10, arg12, -118, arg13, arg6, arg3, arg5);
        } else {
            var16 = class400.method2501(arg12, arg6, arg5, arg0, arg13, arg2, arg3, arg1, arg8, arg4 + 29375, arg7, arg10);
        }
        int var17 = arg1 - 64;
        int var18 = arg2 - 64;
        int var19 = class721.field10007;
        int var20 = class102.field1217;
        if (!var16) {
            if (!arg14) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg8 - var23; var24 <= (arg8 + var23); var24++) {
                for (int var25 = arg7 - var23; var25 <= (arg7 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class207.field2722[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg8 > var24) {
                            var28 = arg8 - var24;
                        } else if ((arg8 - (1 - arg5)) < var24) {
                            var28 = var24 + 1 - arg5 - arg8;
                        }
                        int var29 = 0;
                        if (var25 < arg7) {
                            var29 = arg7 - var25;
                        } else if (var25 > (arg7 + arg6 - 1)) {
                            var29 = var25 + 1 - arg7 - arg6;
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var30 < var21 || var21 == var30 && class207.field2722[var26][var27] < var22) {
                            var22 = class207.field2722[var26][var27];
                            var19 = var24;
                            var20 = var25;
                            var21 = var30;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg1 == var19 && arg2 == var20) {
            return 0;
        }
        byte var31 = 0;
        class584.field8223[var31] = var19;
        int var37 = var31 + 1;
        class538.field7549[var31] = var20;
        int var32;
        int var33 = var32 = class584.field8220[var19 - var17][var20 - var18];
        while (arg1 != var19 || arg2 != var20) {
            if (var32 != var33) {
                class584.field8223[var37] = var19;
                var32 = var33;
                class538.field7549[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class584.field8220[var19 - var17][var20 - var18];
        }
        if (arg4 != -29375) {
            method3020(-32, 48, (byte) 58);
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg11[var34] = class584.field8223[var37];
            arg9[var34++] = class538.field7549[var37];
            if (var34 >= arg11.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3020(int arg0, int arg1, byte arg2) {
        field7310++;
        if ((class461.method2738(arg2 + 127, arg0, arg1) | (arg1 & 0x10000) != 0) || class351.method2265(arg0, (byte) -44, arg1)) {
            return true;
        } else if (arg2 == -27) {
            return (arg0 & 0x37) == 0 && class129.method862(4285, arg1, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lok;Lur;)V")
    public class511(class253 arg0, class537 arg1) {
        this.field7300 = arg0;
        this.field7301 = this.field7300.method1675(124);
        this.method3018(-24485);
    }
}
