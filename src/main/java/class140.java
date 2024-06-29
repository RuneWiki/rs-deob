import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class140 extends class134 {

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "[J")
    private long[] field2440 = new long[10];

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    private int field2432 = 256;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    private int field2427 = 0;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    private int field2428 = 1;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "J")
    private long field2433 = class28.method155((byte) 119);

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "Lcf;")
    private static class93 field2437 = class147.method1066("Loading title screen )2 ", -48);

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Lcf;")
    public static class93 field2430 = field2437;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "[I")
    public static int[] field2441 = new int[32];

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "Llj;")
    public static class25 field2439 = new class25(512);

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    private int field2435;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "Lvh;")
    public static class274 field2436;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "[Lwh;")
    public static class193[] field2434;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public final void method979(byte arg0) {
        if (arg0 > -55) {
            this.field2433 = 82L;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2440[var2] = 0L;
        }
        field2442++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lhg;I)I")
    public static final int method1019(class177 arg0, int arg1) {
        int var2 = arg1;
        field2426++;
        if (arg0.method1280(class37.field567, (byte) -126)) {
            var2 = arg1 + 1;
        }
        if (arg0.method1280(class227.field4063, (byte) -58)) {
            var2++;
        }
        if (arg0.method1280(class29.field430, (byte) -107)) {
            var2++;
        }
        if (arg0.method1280(class177.field3071, (byte) -101)) {
            var2++;
        }
        if (arg0.method1280(class238.field4258, (byte) -76)) {
            var2++;
        }
        if (arg0.method1280(class180.field3179, (byte) -62)) {
            var2++;
        }
        if (arg0.method1280(class46.field751, (byte) -30)) {
            var2++;
        }
        if (arg0.method1280(class11.field150, (byte) -43)) {
            var2++;
        }
        if (arg0.method1280(class33.field519, (byte) -67)) {
            var2++;
        }
        if (arg0.method1280(class143.field2481, (byte) -74)) {
            var2++;
        }
        if (arg0.method1280(class159.field2797, (byte) -93)) {
            var2++;
        }
        if (arg0.method1280(class38.field574, (byte) -87)) {
            var2++;
        }
        if (arg0.method1280(class272.field4849, (byte) -127)) {
            var2++;
        }
        if (arg0.method1280(class253.field4560, (byte) -47)) {
            var2++;
        }
        if (arg0.method1280(class146.field2577, (byte) -115)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
    public static void method1020(byte arg0) {
        field2441 = null;
        field2436 = null;
        field2434 = null;
        field2430 = null;
        if (arg0 <= 3) {
            field2439 = null;
        }
        field2439 = null;
        field2437 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)I")
    public final int method978(int arg0, int arg1, int arg2) {
        field2431++;
        int var4 = this.field2428;
        int var5 = this.field2432;
        this.field2428 = 1;
        this.field2432 = 300;
        this.field2433 = class28.method155((byte) 114);
        if (this.field2440[this.field2435] == 0L) {
            this.field2432 = var5;
            this.field2428 = var4;
        } else if (this.field2440[this.field2435] < this.field2433) {
            this.field2432 = (int) ((long) (arg0 * 2560) / (this.field2433 - this.field2440[this.field2435]));
        }
        if (this.field2432 < 25) {
            this.field2432 = 25;
        }
        if (arg1 != 4) {
            method1022((byte[]) null, 123, 24, -72, 40, -46, 93, true, -114, (class102[]) null, -13);
        }
        if (this.field2432 > 256) {
            this.field2432 = 256;
            this.field2428 = (int) ((long) arg0 - ((this.field2433 - this.field2440[this.field2435]) / 10L));
        }
        if (this.field2428 > arg0) {
            this.field2428 = arg0;
        }
        this.field2440[this.field2435] = this.field2433;
        this.field2435 = (this.field2435 + 1) % 10;
        if (this.field2428 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2440[var6] != 0L) {
                    this.field2440[var6] -= -((long) this.field2428);
                }
            }
        }
        if (arg2 > this.field2428) {
            this.field2428 = arg2;
        }
        class53.method290((long) this.field2428, true);
        int var7 = 0;
        while (this.field2427 < 256) {
            this.field2427 += this.field2432;
            var7++;
        }
        this.field2427 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V")
    public static final void method1021(boolean arg0) {
        field2438++;
        if (class286.field5126.toLowerCase().indexOf("microsoft") == -1) {
            class4.field55[93] = 43;
            class4.field55[47] = 73;
            class4.field55[44] = 71;
            class4.field55[59] = 57;
            class4.field55[45] = 26;
            class4.field55[61] = 27;
            class4.field55[91] = 42;
            class4.field55[46] = 72;
            class4.field55[92] = 74;
            if (class286.field5130 == null) {
                class4.field55[222] = 59;
                class4.field55[192] = 58;
            } else {
                class4.field55[192] = 28;
                class4.field55[222] = 58;
                class4.field55[520] = 59;
            }
        } else {
            class4.field55[222] = 59;
            class4.field55[189] = 26;
            class4.field55[187] = 27;
            class4.field55[190] = 72;
            class4.field55[191] = 73;
            class4.field55[186] = 57;
            class4.field55[223] = 28;
            class4.field55[221] = 43;
            class4.field55[220] = 74;
            class4.field55[192] = 58;
            class4.field55[188] = 71;
            class4.field55[219] = 42;
        }
        if (!arg0) {
            method1022((byte[]) null, -53, 90, -85, -21, 40, -77, true, 76, (class102[]) null, -77);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([BIIIIIIZI[Lvf;I)V")
    public static final void method1022(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, class102[] arg9, int arg10) {
        field2429++;
        if (arg6 != 16656) {
            field2430 = null;
        }
        byte var11;
        if (arg7) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg7) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if ((arg5 + var12) > 0 && (arg5 + var12) < 103 && (arg8 + var13) > 0 && (arg8 + var13) < 103) {
                        arg9[arg3].field1769[arg5 + var12][arg8 + var13] = class58.method333(arg9[arg3].field1769[arg5 + var12][arg8 + var13], -16777217);
                    }
                }
            }
        }
        class280 var14 = new class280(arg0);
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var35 = 0; var35 < 64; var35++) {
                for (int var36 = 0; var36 < 64; var36++) {
                    if (arg1 == var15 && arg4 <= var35 && arg4 + 8 > var35 && var36 >= arg10 && var36 < (arg10 + 8)) {
                        class264.method1772(arg2, arg7, class74.method502(var36 & 0x7, arg2, arg6 - 16542, var35 & 0x7) + arg8, 104, 0, var14, 0, class151.method1087(arg2, -2, var36 & 0x7, var35 & 0x7) + arg5, arg3);
                    } else {
                        class264.method1772(0, arg7, -1, 104, 0, var14, 0, -1, 0);
                    }
                }
            }
        }
        boolean var16 = false;
        while (var14.field5011.length > var14.field5027) {
            int var17 = var14.method1907(arg6 + 176);
            if (var17 != 129) {
                var14.field5027--;
                break;
            }
            for (int var22 = 0; var22 < 4; var22++) {
                byte var23 = var14.method1925(true);
                if (var23 == 0) {
                    if (var22 <= arg1) {
                        int var24 = arg5;
                        int var25 = arg5 + 7;
                        int var26 = arg8;
                        if (var25 < 0) {
                            var25 = 0;
                        } else if (var25 >= 104) {
                            var25 = 104;
                        }
                        if (arg5 < 0) {
                            var24 = 0;
                        } else if (arg5 >= 104) {
                            var24 = 104;
                        }
                        if (arg8 < 0) {
                            var26 = 0;
                        } else if (arg8 >= 104) {
                            var26 = 104;
                        }
                        int var27 = arg8 + 7;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 >= 104) {
                            var27 = 104;
                        }
                        while (var25 > var24) {
                            while (var26 < var27) {
                                class134.field2350[arg3][var24][var26] = 0;
                                var26++;
                            }
                            var24++;
                        }
                    }
                } else if (var23 == 1) {
                    for (int var28 = 0; var28 < 64; var28 += 4) {
                        for (int var29 = 0; var29 < 64; var29 += 4) {
                            byte var30 = var14.method1925(true);
                            if (var22 <= arg1) {
                                for (int var31 = var28; var31 < (var28 + 4); var31++) {
                                    for (int var32 = var29; var32 < var29 + 4; var32++) {
                                        if (arg4 <= var31 && var31 < arg4 + 8 && arg10 <= var32 && arg10 < arg10 + 8) {
                                            int var33 = arg5 + class151.method1087(arg2, arg6 - 16658, var32 & 0x7, var31 & 0x7);
                                            int var34 = class74.method502(var32 & 0x7, arg2, 121, var31 & 0x7) + arg8;
                                            if (var33 >= 0 && var33 < 104 && var34 >= 0 && var34 < 104) {
                                                class134.field2350[arg3][var33][var34] = var30;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var16) {
            return;
        }
        int var18 = arg8 + 7;
        int var19 = arg5 + 7;
        for (int var20 = arg5; var20 < var19; var20++) {
            for (int var21 = arg8; var21 < var18; var21++) {
                class134.field2350[arg3][var20][var21] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class140() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2440[var1] = this.field2433;
        }
    }
}
