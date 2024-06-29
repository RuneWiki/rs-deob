import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class281 extends class300 {

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    private int field4567 = 1;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    private int field4566 = 0;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
    private int field4579 = 0;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "[I")
    public static int[] field4580 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "Ljf;")
    public static class216 field4572 = new class216(64);

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "Ljf;")
    public static class216 field4581 = new class216(64);

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "Lfe;")
    public static class231 field4569;

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "Lvl;")
    public static class73 field4582;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "[Z")
    public static boolean[] field4576;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        ++field4575;
        if (arg1 != -957953300) {
            this.field4566 = -38;
        }
        int[] var3 = super.field4797.method217(arg0, true);
        if (super.field4797.field470) {
            int var4 = class235.field3797[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class180.field2826; ++var6) {
                int var7 = class5.field73[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field4566 == 0) {
                    var9 = (-var4 + var7) * this.field4567;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field4567 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (this.field4579 == 0) {
                    var12 = class299.field4774[255 & var12 >> 4] - -4096 >> 1;
                } else if (~this.field4579 == -3) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIZIIIZI)V")
    public static final void method1934(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        ++field4573;
        if (arg2 || class97.field1464 != arg1 || class22.field288 != arg0 || ~class250.field4051 != ~arg3 && !class60.method384(-4)) {
            if (arg5 != 2048) {
                field4572 = null;
            }
            class22.field288 = arg0;
            class250.field4051 = arg3;
            class97.field1464 = arg1;
            if (class60.method384(arg5 + -2052)) {
                class250.field4051 = 0;
            }
            if (!arg6) {
                class95.method651(25, (byte) 99);
            } else {
                class95.method651(28, (byte) 23);
            }
            class49.method304(class33.field397, true, 4);
            int var8 = class5.field77;
            class5.field77 = arg0 * 8 + -48;
            int var9 = class113.field1653;
            class113.field1653 = (arg1 - 6) * 8;
            class290.field4671 = class207.method1433(class97.field1464 * 8, class22.field288 * 8);
            class79.field1202 = null;
            int var10 = -var9 + class113.field1653;
            int var11 = class113.field1653;
            int var12 = -var8 + class5.field77;
            int var13 = class5.field77;
            if (!arg6) {
                for (int var14 = 0; var14 < 32768; ++var14) {
                    class86 var15 = class191.field3045[var14];
                    if (var15 != null) {
                        for (int var16 = 0; ~var16 > -11; ++var16) {
                            var15.field3970[var16] -= var10;
                            var15.field3972[var16] -= var12;
                        }
                        var15.field3920 -= var12 * 128;
                        var15.field3915 -= var10 * 128;
                    }
                }
            } else {
                class80.field1211 = 0;
                for (int var17 = 0; ~var17 > -32769; ++var17) {
                    class86 var33 = class191.field3045[var17];
                    if (var33 != null) {
                        var33.field3915 -= var10 * 128;
                        var33.field3920 -= var12 * 128;
                        if (var33.field3915 >= 0 && ~var33.field3915 >= -13185 && ~var33.field3920 <= -1 && var33.field3920 <= 13184) {
                            for (int var34 = 0; ~var34 > -11; ++var34) {
                                var33.field3970[var34] -= var10;
                                var33.field3972[var34] -= var12;
                            }
                            class187.field2939[class80.field1211++] = var17;
                        } else {
                            class191.field3045[var17].method586(true, (class134) null);
                            class191.field3045[var17] = null;
                        }
                    }
                }
            }
            for (int var18 = 0; var18 < 2048; ++var18) {
                class1 var31 = class35.field409[var18];
                if (var31 != null) {
                    for (int var32 = 0; var32 < 10; ++var32) {
                        var31.field3970[var32] -= var10;
                        var31.field3972[var32] -= var12;
                    }
                    var31.field3920 -= var12 * 128;
                    var31.field3915 -= var10 * 128;
                }
            }
            class148.field2204 = arg3;
            class214.field3347.method5(false, 360000, arg4, arg7);
            byte var19 = 0;
            byte var20 = 1;
            byte var21 = 0;
            byte var22 = 104;
            if (var10 < 0) {
                var20 = -1;
                var19 = 103;
                var22 = -1;
            }
            byte var23 = 1;
            byte var24 = 104;
            if (var12 < 0) {
                var21 = 103;
                var24 = -1;
                var23 = -1;
            }
            for (int var25 = var19; var22 != var25; var25 += var20) {
                for (int var27 = var21; var24 != var27; var27 += var23) {
                    int var28 = var10 + var25;
                    int var29 = var12 + var27;
                    for (int var30 = 0; var30 < 4; ++var30) {
                        if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                            class74.field1128[var30][var25][var27] = class74.field1128[var30][var28][var29];
                        } else {
                            class74.field1128[var30][var25][var27] = null;
                        }
                    }
                }
            }
            for (class183 var26 = (class183) class192.field3051.method1548(0); var26 != null; var26 = (class183) class192.field3051.method1549(arg5 + -1940)) {
                var26.field2870 -= var10;
                var26.field2877 -= var12;
                if (var26.field2870 < 0 || var26.field2877 < 0 || var26.field2870 >= 104 || var26.field2877 >= 104) {
                    var26.method1764(arg5 + -1984);
                }
            }
            if (!arg6) {
                class158.field2370 = 1;
            } else {
                class50.field639 -= var12;
                class99.field1474 -= var10 * 128;
                class255.field4159 -= var12 * 128;
                class13.field187 -= var10;
                class82.field1250 -= var10;
                class248.field4033 -= var12;
            }
            if (class31.field380 != 0) {
                class121.field1741 -= var12;
                class31.field380 -= var10;
            }
            class210.field3275 = 0;
            class182.method1292((byte) 123);
            class181.field2857.method1544((byte) 43);
            class108.field1576.method1544((byte) 43);
            class65.method419();
        }
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)V")
    public static void method1935(int arg0) {
        field4582 = null;
        field4576 = null;
        field4580 = null;
        if (arg0 > -127) {
            method1937(-45, -125, 125, 10, 51, -110, 25);
        }
        field4569 = null;
        field4581 = null;
        field4572 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public static final void method1936(boolean arg0) {
        ++field4570;
        if (!class147.field2187) {
            class89.field1345 = arg0;
            if (class180.field2832) {
                class215.field3356 = (float) (-16 & (int) class215.field3356 + 47);
            } else {
                class233.field3768 += (12.0F - class233.field3768) / 2.0F;
            }
            class147.field2187 = true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~(arg4 & 1) == -2) {
            int var7 = arg5;
            arg5 = arg0;
            arg0 = var7;
        }
        int var8 = arg3 & 3;
        ++field4568;
        if (var8 == 0) {
            return arg6;
        } else if (arg1 != -15874) {
            return -125;
        } else if (var8 == 1) {
            return arg2;
        } else {
            return ~var8 == -3 ? -arg5 - (-1 - -arg6 - 7) : -arg0 - (-8 - -arg2);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        ++field4577;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 3) {
                    this.field4567 = arg0.method1218(-73);
                }
            } else {
                this.field4579 = arg0.method1218(-123);
            }
        } else {
            this.field4566 = arg0.method1218(-46);
        }
        if (arg1 >= -43) {
            this.field4566 = 83;
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)V")
    public static final void method1938(byte arg0) {
        if (class205.field3214 != null) {
            class56 var1 = class205.field3214;
            synchronized (class205.field3214) {
                class205.field3214 = null;
            }
        }
        ++field4574;
        if (arg0 != -27) {
            field4572 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class281() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (arg0 < 126) {
            field4582 = null;
        }
        class123.method801(94);
        ++field4571;
    }
}
