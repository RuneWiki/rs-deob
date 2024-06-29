import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class45 extends class37 {

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "Lld;")
    public static class111 field971 = new class111(100);

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "Ldd;")
    public static class35 field974 = class180.method1196((byte) -111, "me");

    @OriginalMember(owner = "client!ed", name = "cb", descriptor = "Ldd;")
    public static class35 field980 = class180.method1196((byte) 127, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!ed", name = "ab", descriptor = "Ldd;")
    public static class35 field978 = class180.method1196((byte) -24, "Untersuchen");

    @OriginalMember(owner = "client!ed", name = "bb", descriptor = "Ldd;")
    private static class35 field979 = class180.method1196((byte) -47, " seconds)3");

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "Ldd;")
    public static class35 field977 = class180.method1196((byte) 126, ")3runescape)3com");

    @OriginalMember(owner = "client!ed", name = "db", descriptor = "Ldd;")
    public static class35 field981 = null;

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "Ldd;")
    public static class35 field976 = field979;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ed", name = "eb", descriptor = "[Lba;")
    public static class12[] field982;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)V")
    public static void method406(boolean arg0) {
        field971 = null;
        field974 = null;
        field981 = null;
        field979 = null;
        field977 = null;
        field978 = null;
        if (!arg0) {
            method407(3, true);
        }
        field980 = null;
        field976 = null;
        field982 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)V")
    public static final void method407(int arg0, boolean arg1) {
        class102.field2252 = arg1;
        ++field967;
        if (!class102.field2252) {
            int var2 = class172.field3441.method250(arg0 + 28246);
            int var3 = class172.field3441.method250(28198);
            int var4 = class172.field3441.method250(arg0 + 28246);
            int var5 = class172.field3441.method252(arg0 + 303);
            int var6 = class172.field3441.method248(true);
            int var7 = (-class172.field3441.field527 + class101.field2224) / 16;
            class133.field2844 = new int[var7][4];
            for (int var8 = 0; ~var8 > ~var7; ++var8) {
                for (int var14 = 0; var14 < 4; ++var14) {
                    class133.field2844[var8][var14] = class172.field3441.method231(65280);
                }
            }
            class167.field3374 = new int[var7];
            class118.field2624 = new byte[var7][];
            class73.field1734 = new int[var7];
            class110.field2434 = new int[var7];
            class129.field2783 = new byte[var7][];
            boolean var9 = false;
            if ((~(var4 / 8) == -49 || ~(var4 / 8) == -50) && ~(var3 / 8) == -49) {
                var9 = true;
            }
            if (var4 / 8 == 48 && ~(var3 / 8) == -149) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var4 + -6) / 8; (var4 + 6) / 8 >= var11; ++var11) {
                for (int var12 = (var3 + -6) / 8; (var3 - -6) / 8 >= var12; ++var12) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || ~var12 != -50 && ~var12 != -150 && var12 != 147 && ~var11 != -51 && (~var11 != -50 || ~var12 != -48)) {
                        class167.field3374[var10] = var13;
                        class110.field2434[var10] = class48.field1055.method37(class63.method529(new class35[] { class20.field396, class3.method19(var11, -29578), class107.field2376, class3.method19(var12, -29578) }, (byte) 72), (byte) -62);
                        class73.field1734[var10] = class48.field1055.method37(class63.method529(new class35[] { class110.field2435, class3.method19(var11, arg0 + -29530), class107.field2376, class3.method19(var12, -29578) }, (byte) 112), (byte) -62);
                        ++var10;
                    }
                }
            }
            class73.method580(var6, 112, var5, var2, var4, var3);
        } else {
            int var15 = class172.field3441.method221(-90);
            int var16 = class172.field3441.method250(28198);
            int var17 = class172.field3441.method248(true);
            class172.field3441.method662(118);
            for (int var18 = 0; ~var18 > -5; ++var18) {
                for (int var35 = 0; var35 < 13; ++var35) {
                    for (int var36 = 0; ~var36 > -14; ++var36) {
                        int var37 = class172.field3441.method661(1, (byte) -79);
                        if (~var37 == -2) {
                            class44.field954[var18][var35][var36] = class172.field3441.method661(26, (byte) -79);
                        } else {
                            class44.field954[var18][var35][var36] = -1;
                        }
                    }
                }
            }
            class172.field3441.method667(false);
            int var19 = (-class172.field3441.field527 + class101.field2224) / 16;
            class133.field2844 = new int[var19][4];
            for (int var20 = 0; var20 < var19; ++var20) {
                for (int var34 = 0; var34 < 4; ++var34) {
                    class133.field2844[var20][var34] = class172.field3441.method216((byte) 124);
                }
            }
            int var21 = class172.field3441.method250(28198);
            int var22 = class172.field3441.method256((byte) -78);
            class118.field2624 = new byte[var19][];
            class110.field2434 = new int[var19];
            class167.field3374 = new int[var19];
            class129.field2783 = new byte[var19][];
            class73.field1734 = new int[var19];
            int var23 = 0;
            for (int var24 = 0; ~var24 > -5; ++var24) {
                for (int var25 = 0; ~var25 > -14; ++var25) {
                    for (int var26 = 0; var26 < 13; ++var26) {
                        int var27 = class44.field954[var24][var25][var26];
                        if (var27 != -1) {
                            int var28 = 2047 & var27 >> 3;
                            int var29 = (var27 & 16776996) >> 14;
                            int var30 = (var29 / 8 << 8) + var28 / 8;
                            for (int var31 = 0; ~var31 > ~var23; ++var31) {
                                if (~class167.field3374[var31] == ~var30) {
                                    var30 = -1;
                                    break;
                                }
                            }
                            if (var30 != -1) {
                                class167.field3374[var23] = var30;
                                int var32 = 255 & var30;
                                int var33 = 255 & var30 >> 8;
                                class110.field2434[var23] = class48.field1055.method37(class63.method529(new class35[] { class20.field396, class3.method19(var33, -29578), class107.field2376, class3.method19(var32, -29578) }, (byte) 113), (byte) -62);
                                class73.field1734[var23] = class48.field1055.method37(class63.method529(new class35[] { class110.field2435, class3.method19(var33, -29578), class107.field2376, class3.method19(var32, -29578) }, (byte) 121), (byte) -62);
                                ++var23;
                            }
                        }
                    }
                }
            }
            class73.method580(var22, 115, var15, var17, var16, var21);
        }
        if (arg0 != -48) {
            field977 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method408(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field968;
        if (arg0 == 15) {
            if (class193.method1261((byte) 111, arg7)) {
                class200.method1331(-1, 1, class163.field3299[arg7], arg4, arg3, arg1, arg2, arg5, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 != 75) {
            field978 = null;
        }
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (super.field816.field3661) {
            int var4 = class22.field450[arg1];
            for (int var5 = 0; ~var5 > ~class72.field1719; ++var5) {
                var3[var5] = this.method409(var4, class118.field2622[var5], (byte) -96) % 4096;
            }
        }
        ++field973;
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class45() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIB)I")
    private final int method409(int arg0, int arg1, byte arg2) {
        ++field970;
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 ^ var4 << 1;
        if (arg2 > -9) {
            method406(false);
        }
        return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}
