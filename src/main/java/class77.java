import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class77 extends class119 {

    @OriginalMember(owner = "client!ic", name = "vc", descriptor = "Led;")
    public static class43 field1536 = class191.method1219("Standort", false);

    @OriginalMember(owner = "client!ic", name = "Dc", descriptor = "Led;")
    public static class43 field1544 = class191.method1219(" loggt sich ein)3", false);

    @OriginalMember(owner = "client!ic", name = "wc", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ic", name = "xc", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!ic", name = "Ac", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!ic", name = "Cc", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!ic", name = "Bc", descriptor = "Lmd;")
    public static class113 field1542;

    @OriginalMember(owner = "client!ic", name = "yc", descriptor = "Lgb;")
    public class59 field1539;

    @OriginalMember(owner = "client!ic", name = "zc", descriptor = "[Lnb;")
    public static class120[] field1540;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method475(byte arg0) {
        field1540 = null;
        field1544 = null;
        field1542 = null;
        field1536 = null;
        if (arg0 >= -123) {
            field1544 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZ)V")
    public static final void method476(boolean arg0, boolean arg1) {
        ++field1541;
        class203.field3964 = arg0;
        if (class203.field3964) {
            int var2 = class38.field723.method563(-25695);
            int var3 = class38.field723.method544(true);
            int var4 = class38.field723.method560((byte) -69);
            int var5 = class38.field723.method579(93);
            int var6 = class38.field723.method544(!arg1);
            class38.field723.method334(-36);
            for (int var7 = 0; var7 < 4; ++var7) {
                for (int var22 = 0; var22 < 13; ++var22) {
                    for (int var23 = 0; var23 < 13; ++var23) {
                        int var24 = class38.field723.method330((byte) 91, 1);
                        if (var24 != 1) {
                            class171.field3403[var7][var22][var23] = -1;
                        } else {
                            class171.field3403[var7][var22][var23] = class38.field723.method330((byte) 82, 26);
                        }
                    }
                }
            }
            class38.field723.method337(-116);
            int var8 = (-class38.field723.field1727 + class114.field2215) / 16;
            class95.field1861 = new int[var8][4];
            for (int var9 = 0; var8 > var9; ++var9) {
                for (int var21 = 0; ~var21 > -5; ++var21) {
                    class95.field1861[var9][var21] = class38.field723.method547(-77);
                }
            }
            class95.field1851 = new byte[var8][];
            class91.field1809 = new int[var8];
            class112.field2147 = new int[var8];
            class27.field488 = new byte[var8][];
            class107.field2050 = new int[var8];
            int var10 = 0;
            for (int var11 = 0; ~var11 > -5; ++var11) {
                for (int var12 = 0; ~var12 > -14; ++var12) {
                    for (int var13 = 0; ~var13 > -14; ++var13) {
                        int var14 = class171.field3403[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = 1023 & var14 >> 14;
                            int var16 = var14 >> 3 & 2047;
                            int var17 = (var15 / 8 << 8) - -(var16 / 8);
                            for (int var18 = 0; var10 > var18; ++var18) {
                                if (~class91.field1809[var18] == ~var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (var17 != -1) {
                                int var19 = (65499 & var17) >> 8;
                                class91.field1809[var10] = var17;
                                int var20 = var17 & 255;
                                class112.field2147[var10] = class4.field90.method347(class167.method1036(new class43[] { class92.field1829, class30.method161(var19, 10), class71.field1393, class30.method161(var20, 10) }, !arg1), (byte) 99);
                                class107.field2050[var10] = class4.field90.method347(class167.method1036(new class43[] { class90.field1804, class30.method161(var19, 10), class71.field1393, class30.method161(var20, 10) }, true), (byte) 60);
                                ++var10;
                            }
                        }
                    }
                }
            }
            class89.method569(var5, var2, 71211880, var3, var6, var4);
        } else {
            int var25 = class38.field723.method544(true);
            int var26 = (-class38.field723.field1727 + class114.field2215) / 16;
            class95.field1861 = new int[var26][4];
            for (int var27 = 0; ~var27 > ~var26; ++var27) {
                for (int var37 = 0; ~var37 > -5; ++var37) {
                    class95.field1861[var27][var37] = class38.field723.method540((byte) -119);
                }
            }
            int var28 = class38.field723.method579(104);
            int var29 = class38.field723.method555(-1113627096);
            int var30 = class38.field723.method543(-6);
            int var31 = class38.field723.method563(-25695);
            class107.field2050 = new int[var26];
            class112.field2147 = new int[var26];
            class95.field1851 = new byte[var26][];
            boolean var32 = false;
            class27.field488 = new byte[var26][];
            class91.field1809 = new int[var26];
            int var33 = 0;
            if ((var29 / 8 == 48 || var29 / 8 == 49) && var25 / 8 == 48) {
                var32 = true;
            }
            if (var29 / 8 == 48 && var25 / 8 == 148) {
                var32 = true;
            }
            for (int var34 = (var29 + -6) / 8; var34 <= (var29 + 6) / 8; ++var34) {
                for (int var35 = (var25 - 6) / 8; ~var35 >= ~((var25 - -6) / 8); ++var35) {
                    int var36 = (var34 << 8) + var35;
                    if (!var32 || ~var35 != -50 && ~var35 != -150 && ~var35 != -148 && var34 != 50 && (~var34 != -50 || ~var35 != -48)) {
                        class91.field1809[var33] = var36;
                        class112.field2147[var33] = class4.field90.method347(class167.method1036(new class43[] { class92.field1829, class30.method161(var34, 10), class71.field1393, class30.method161(var35, 10) }, true), (byte) -79);
                        class107.field2050[var33] = class4.field90.method347(class167.method1036(new class43[] { class90.field1804, class30.method161(var34, 10), class71.field1393, class30.method161(var35, 10) }, true), (byte) -59);
                        ++var33;
                    }
                }
            }
            class89.method569(var28, var25, 71211880, var31, var29, var30);
        }
        if (arg1) {
            method477((byte) 6, -4, 89, (class1) null);
        }
    }

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "(I)Z")
    public final boolean method4(int arg0) {
        int var2 = -44 / ((-22 - arg0) / 34);
        ++field1538;
        return this.field1539 != null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BIILa;)V")
    public static final void method477(byte arg0, int arg1, int arg2, class1 arg3) {
        if (arg0 != 75) {
            method476(true, false);
        }
        ++field1543;
        if (arg3.field2351 == arg1 && arg1 != -1) {
            int var4 = class175.method1101(arg1, true).field3997;
            if (var4 == 1) {
                arg3.field2375 = 0;
                arg3.field2315 = 0;
                arg3.field2355 = arg2;
                arg3.field2360 = 0;
            }
            if (var4 == 2) {
                arg3.field2315 = 0;
            }
        } else {
            if (~arg1 == 0 || ~arg3.field2351 == 0 || ~class175.method1101(arg1, true).field3983 <= ~class175.method1101(arg3.field2351, true).field3983) {
                arg3.field2355 = arg2;
                arg3.field2351 = arg1;
                arg3.field2360 = 0;
                arg3.field2375 = 0;
                arg3.field2315 = 0;
                arg3.field2348 = arg3.field2377;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1537;
        if (this.field1539 != null) {
            class205 var10 = super.field2351 != -1 && ~super.field2355 == -1 ? class175.method1101(super.field2351, true) : null;
            class205 var11 = super.field2344 == -1 || super.field2344 == super.field2326 && var10 != null ? null : class175.method1101(super.field2344, true);
            class199 var12 = this.field1539.method370((byte) 71, super.field2346, super.field2360, var10, var11);
            if (var12 != null) {
                var12.method1304();
                super.field1819 = var12.field1819;
                if (~this.field1539.field1223 != -1 && ~this.field1539.field1198 != -1) {
                    int var13 = class135.field2798[arg0];
                    int var14 = class135.field2797[arg0];
                    short var15 = this.field1539.field1223;
                    short var16 = this.field1539.field1198;
                    int var17 = -var16 / 2;
                    int var18 = -var15 / 2;
                    int var19 = var15 / 2;
                    int var20 = -var16 / 2;
                    int var21 = var13 * var17 + -(var14 * var18) >> 16;
                    int var22 = var13 * var18 + var14 * var17 >> 16;
                    int var23 = var13 * var19 + var14 * var20 >> 16;
                    int var24 = class108.method668(super.field2328 + var21, super.field2347 + var22, -127, class93.field1839);
                    int var25 = var16 / 2;
                    int var26 = var13 * var20 + -(var14 * var19) >> 16;
                    int var27 = class108.method668(super.field2328 + var26, super.field2347 + var23, -127, class93.field1839);
                    int var28 = -var15 / 2;
                    int var29 = var13 * var25 + -(var14 * var28) >> 16;
                    int var30 = var13 * var28 + var14 * var25 >> 16;
                    int var31 = class108.method668(super.field2328 - -var29, super.field2347 + var30, -128, class93.field1839);
                    int var32 = var15 / 2;
                    int var33 = var16 / 2;
                    int var34 = var13 * var32 + var14 * var33 >> 16;
                    int var35 = var13 * var33 + -(var14 * var32) >> 16;
                    int var36 = class108.method668(super.field2328 - -var35, super.field2347 + var34, -128, class93.field1839);
                    int var37 = var24 >= var27 ? var27 : var24;
                    int var38 = var31 >= var36 ? var36 : var31;
                    int var39 = 2047 & (int) (320.0D * Math.atan2((double) (-var38 + var37), (double) var16));
                    int var40 = var27 >= var36 ? var36 : var27;
                    int var41 = var24 < var31 ? var24 : var31;
                    var12.method1300(var39);
                    int var42 = (int) (Math.atan2((double) (var41 - var40), (double) var15) * 320.0D) & 2047;
                    int var43 = (var37 + var38 + var40 + var41) / 4;
                    var12.method1303(var42);
                    var12.method1297(0, -super.field2338 + var43, 0);
                }
                class199 var44 = null;
                if (super.field2364 != -1 && ~super.field2325 != 0) {
                    var44 = class16.method70(-1, super.field2364).method1237(64, super.field2325);
                    if (var44 != null) {
                        var44.method1297(0, -super.field2366, 0);
                    }
                }
                if (var44 != null) {
                    var12 = ((class63) var12).method393(var44);
                }
                if (this.field1539.field1219 == 1) {
                    var12.field3921 = true;
                }
                var12.method2(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }
}
