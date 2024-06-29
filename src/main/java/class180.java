import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class180 extends class194 {

    @OriginalMember(owner = "client!sn", name = "M", descriptor = "[I")
    public static int[] field2097 = new int[13];

    @OriginalMember(owner = "client!sn", name = "J", descriptor = "Lbb;")
    public static class270 field2094 = new class270();

    @OriginalMember(owner = "client!sn", name = "I", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!sn", name = "K", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!sn", name = "L", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!sn", name = "N", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!sn", name = "O", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!sn", name = "P", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZIIZIBI)V")
    public static final void method1125(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6) {
        if (arg6 > arg4) {
            int var7 = (arg4 + arg6) / 2;
            int var8 = arg4;
            class27 var9 = class213.field2614[var7];
            class213.field2614[var7] = class213.field2614[arg6];
            class213.field2614[arg6] = var9;
            for (int var10 = arg4; ~var10 > ~arg6; ++var10) {
                if (~class352.method2237((byte) -61, arg1, class213.field2614[var10], arg0, arg3, arg2, var9) >= -1) {
                    class27 var11 = class213.field2614[var10];
                    class213.field2614[var10] = class213.field2614[var8];
                    class213.field2614[var8++] = var11;
                }
            }
            class213.field2614[arg6] = class213.field2614[var8];
            class213.field2614[var8] = var9;
            method1125(arg0, arg1, arg2, arg3, arg4, (byte) -94, var8 + -1);
            method1125(arg0, arg1, arg2, arg3, var8 + 1, (byte) -95, arg6);
        }
        if (arg5 > -74) {
            field2094 = null;
        }
        ++field2093;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZI)V")
    public static final void method1126(boolean arg0, int arg1) {
        ++field2100;
        if (arg1 >= -125) {
            field2094 = null;
        }
        class383.field5241 = arg0;
        if (class383.field5241) {
            int var2 = class215.field2658.method1569(true);
            boolean var3 = ~class215.field2658.method1572(-3) == -2;
            int var4 = class215.field2658.method1572(-3);
            int var5 = class215.field2658.method1578(118);
            int var6 = class215.field2658.method1569(true);
            int var7 = class215.field2658.method1551(59);
            int var8 = class215.field2658.method1567(true);
            class394.method2444(var4, true);
            class215.field2658.method2167(-113);
            for (int var9 = 0; var9 < 4; ++var9) {
                for (int var24 = 0; var24 < class22.field232 >> 3; ++var24) {
                    for (int var25 = 0; class196.field2329 >> 3 > var25; ++var25) {
                        int var26 = class215.field2658.method2171(1, 126);
                        if (~var26 == -2) {
                            class225.field2848[var9][var24][var25] = class215.field2658.method2171(26, 84);
                        } else {
                            class225.field2848[var9][var24][var25] = -1;
                        }
                    }
                }
            }
            class215.field2658.method2168(109);
            int var10 = (-class215.field2658.field3211 + class134.field1533) / 16;
            class244.field3251 = new int[var10][4];
            for (int var11 = 0; ~var11 > ~var10; ++var11) {
                for (int var23 = 0; ~var23 > -5; ++var23) {
                    class244.field3251[var11][var23] = class215.field2658.method1576((byte) 126);
                }
            }
            class358.field4867 = new int[var10];
            class431.field5881 = new byte[var10][];
            class262.field3375 = null;
            class31.field345 = new byte[var10][];
            class103.field1205 = new int[var10];
            class325.field4337 = null;
            class412.field5671 = new int[var10];
            class126.field1411 = new byte[var10][];
            class208.field2537 = new byte[var10][];
            class352.field4796 = new int[var10];
            class203.field2385 = new int[var10];
            int var12 = 0;
            for (int var13 = 0; var13 < 4; ++var13) {
                for (int var14 = 0; class22.field232 >> 3 > var14; ++var14) {
                    for (int var15 = 0; ~var15 > ~(class196.field2329 >> 3); ++var15) {
                        int var16 = class225.field2848[var13][var14][var15];
                        if (var16 != -1) {
                            int var17 = (16776585 & var16) >> 14;
                            int var18 = (16379 & var16) >> 3;
                            int var19 = (var17 / 8 << 8) + var18 / 8;
                            for (int var20 = 0; var12 > var20; ++var20) {
                                if (class358.field4867[var20] == var19) {
                                    var19 = -1;
                                    break;
                                }
                            }
                            if (~var19 != 0) {
                                class358.field4867[var12] = var19;
                                int var21 = (65382 & var19) >> 8;
                                int var22 = 255 & var19;
                                class412.field5671[var12] = class335.field4572.method1806((byte) -114, "m" + var21 + "_" + var22);
                                class203.field2385[var12] = class335.field4572.method1806((byte) -102, "l" + var21 + "_" + var22);
                                class103.field1205[var12] = class335.field4572.method1806((byte) -113, "um" + var21 + "_" + var22);
                                class352.field4796[var12] = class335.field4572.method1806((byte) -98, "ul" + var21 + "_" + var22);
                                ++var12;
                            }
                        }
                    }
                }
            }
            class314.method1978(false, var6, var8, var5, var3, (byte) -125, var7, var2);
        } else {
            int var27 = class215.field2658.method1563(-128);
            int var28 = class215.field2658.method1551(110);
            int var29 = class215.field2658.method1572(-3);
            int var30 = (-class215.field2658.field3211 + class134.field1533) / 16;
            class244.field3251 = new int[var30][4];
            for (int var31 = 0; var30 > var31; ++var31) {
                for (int var41 = 0; var41 < 4; ++var41) {
                    class244.field3251[var31][var41] = class215.field2658.method1585((byte) -128);
                }
            }
            int var32 = class215.field2658.method1578(-26);
            boolean var33 = ~class215.field2658.method1567(true) == -2;
            int var34 = class215.field2658.method1587((byte) -102);
            int var35 = class215.field2658.method1587((byte) -102);
            class394.method2444(var29, true);
            class262.field3375 = null;
            class352.field4796 = new int[var30];
            class412.field5671 = new int[var30];
            class325.field4337 = null;
            class31.field345 = new byte[var30][];
            class103.field1205 = new int[var30];
            class358.field4867 = new int[var30];
            class431.field5881 = new byte[var30][];
            class203.field2385 = new int[var30];
            class126.field1411 = new byte[var30][];
            class208.field2537 = new byte[var30][];
            boolean var36 = false;
            if ((var35 / 8 == 48 || ~(var35 / 8) == -50) && ~(var34 / 8) == -49) {
                var36 = true;
            }
            if (~(var35 / 8) == -49 && var34 / 8 == 148) {
                var36 = true;
            }
            int var37 = 0;
            for (int var38 = (-(class22.field232 >> 4) + var35) / 8; ((class22.field232 >> 4) + var35) / 8 >= var38; ++var38) {
                for (int var39 = (var34 - (class196.field2329 >> 4)) / 8; ~var39 >= ~(((class196.field2329 >> 4) + var34) / 8); ++var39) {
                    int var40 = (var38 << 8) + var39;
                    if (!var36 || ~var39 != -50 && var39 != 149 && ~var39 != -148 && ~var38 != -51 && (var38 != 49 || ~var39 != -48)) {
                        class358.field4867[var37] = var40;
                        class412.field5671[var37] = class335.field4572.method1806((byte) -110, "m" + var38 + "_" + var39);
                        class203.field2385[var37] = class335.field4572.method1806((byte) -121, "l" + var38 + "_" + var39);
                        class103.field1205[var37] = class335.field4572.method1806((byte) -95, "um" + var38 + "_" + var39);
                        class352.field4796[var37] = class335.field4572.method1806((byte) -113, "ul" + var38 + "_" + var39);
                    } else {
                        class358.field4867[var37] = var40;
                        class412.field5671[var37] = -1;
                        class203.field2385[var37] = -1;
                        class103.field1205[var37] = -1;
                        class352.field4796[var37] = -1;
                    }
                    ++var37;
                }
            }
            class314.method1978(false, var28, var27, var35, var33, (byte) -123, var32, var34);
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V")
    public class180() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "(I)V")
    public static void method1127(int arg0) {
        field2094 = null;
        if (arg0 < 79) {
            method1127(30);
        }
        field2097 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIB)V")
    public static final void method1128(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -57) {
            field2097 = null;
        }
        class222.field2770 = new byte[arg1][arg0][arg2];
        ++field2099;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lwo;B)V")
    public static final void method1129(class285 arg0, byte arg1) {
        if (arg1 != -9) {
            method1125(true, 94, -49, false, -108, (byte) -127, 3);
        }
        ++field2095;
        class429.field5866 = arg0;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field2098;
        int var3 = 29 / ((arg1 - 57) / 46);
        int[] var4 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            class114.method665(var4, 0, class138.field1579, class249.field3283[arg0]);
        }
        return var4;
    }
}
