import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class189 extends class13 {

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "[I")
    public static int[] field2608 = new int[4];

    @OriginalMember(owner = "client!cs", name = "H", descriptor = "Z")
    public static boolean field2610 = false;

    @OriginalMember(owner = "client!cs", name = "E", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!cs", name = "I", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!cs", name = "J", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!cs", name = "K", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "(B)V", line = 8)
    public static final void method1229(byte arg0) {
        if (arg0 >= 0) {
            ++field2613;
            class131 var1 = class73.field1045;
            synchronized (class73.field1045) {
                class73.field1045.method905((byte) 26);
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLer;)V", line = 21)
    public static final void method1230(byte arg0, class55 arg1) {
        if (arg1.field757 != null) {
            arg1.field757.field6114 = 0;
        }
        arg1.field760 = false;
        ++field2609;
        for (class55 var2 = arg1.method454(); var2 != null; var2 = arg1.method453()) {
            method1230((byte) 127, var2);
        }
        if (arg0 <= 126) {
            method1232(-52);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIBI)I", line = 46)
    public static final int method1231(int arg0, int arg1, byte arg2, int arg3) {
        ++field2612;
        int var4 = arg0 & 3;
        if (var4 == 0) {
            return arg1;
        } else if (arg2 != 74) {
            return 109;
        } else if (var4 == 1) {
            return arg3;
        } else {
            return ~var4 == -3 ? -arg1 + 1023 : -arg3 + 1023;
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V", line = 68)
    public class189() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)V", line = 71)
    public static void method1232(int arg0) {
        if (arg0 > -121) {
            field2608 = null;
        }
        field2608 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZI)[I", line = 84)
    public final int[] method29(boolean arg0, int arg1) {
        ++field2607;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (!arg0) {
            field2608 = null;
        }
        if (super.field263.field1845) {
            int[][] var4 = this.method227(!arg0, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class269.field3751; ++var8) {
                var3[var8] = (var5[var8] - -var6[var8] - -var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(ZI)V", line = 125)
    public static final void method1233(boolean arg0, int arg1) {
        class243.field3452 = arg0;
        if (arg1 != -30088) {
            method1231(-69, -51, (byte) -82, -120);
        }
        ++field2611;
        if (!class243.field3452) {
            int var2 = class333.field4591.method158(true);
            int var3 = class333.field4591.method166(false);
            int var4 = class333.field4591.method177((byte) 55);
            int var5 = (-class333.field4591.field191 + class15.field290) / 16;
            class406.field5776 = new int[var5][4];
            for (int var6 = 0; ~var6 > ~var5; ++var6) {
                for (int var16 = 0; ~var16 > -5; ++var16) {
                    class406.field5776[var6][var16] = class333.field4591.method205(-957401312);
                }
            }
            int var7 = class333.field4591.method177((byte) 55);
            int var8 = class333.field4591.method166(false);
            boolean var9 = ~class333.field4591.method172((byte) 52) == -2;
            int var10 = class333.field4591.method166(false);
            class142.method979(var4, arg1 + 29979);
            class284.field4005 = new int[var5];
            class5.field91 = null;
            class247.field3495 = new byte[var5][];
            class161.field2249 = new byte[var5][];
            class155.field2191 = new int[var5];
            class403.field5718 = null;
            class426.field5997 = new int[var5];
            class67.field1014 = new byte[var5][];
            class268.field3742 = new int[var5];
            class276.field3839 = new int[var5];
            class446.field6257 = new byte[var5][];
            boolean var11 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && ~(var10 / 8) == -49) {
                var11 = true;
            }
            if (var3 / 8 == 48 && var10 / 8 == 148) {
                var11 = true;
            }
            int var12 = 0;
            for (int var13 = (var3 - (class211.field2954 >> 4)) / 8; ~var13 >= ~(((class211.field2954 >> 4) + var3) / 8); ++var13) {
                for (int var14 = (-(class290.field4061 >> 4) + var10) / 8; ~var14 >= ~(((class290.field4061 >> 4) + var10) / 8); ++var14) {
                    int var15 = (var13 << 8) + var14;
                    if (!var11 || ~var14 != -50 && ~var14 != -150 && ~var14 != -148 && var13 != 50 && (~var13 != -50 || var14 != 47)) {
                        class155.field2191[var12] = var15;
                        class276.field3839[var12] = class20.field375.method1751(arg1 + 30164, "m" + var13 + "_" + var14);
                        class426.field5997[var12] = class20.field375.method1751(arg1 + 30206, "l" + var13 + "_" + var14);
                        class268.field3742[var12] = class20.field375.method1751(class108.method765(arg1, -30124), "um" + var13 + "_" + var14);
                        class284.field4005[var12] = class20.field375.method1751(60, "ul" + var13 + "_" + var14);
                    } else {
                        class155.field2191[var12] = var15;
                        class276.field3839[var12] = -1;
                        class426.field5997[var12] = -1;
                        class268.field3742[var12] = -1;
                        class284.field4005[var12] = -1;
                    }
                    ++var12;
                }
            }
            class316.method2051(false, var2, var3, var9, arg1 ^ -30206, var8, var10, var7);
        } else {
            int var17 = class333.field4591.method172((byte) 52);
            boolean var18 = ~class333.field4591.method206(-119) == -2;
            int var19 = class333.field4591.method174(255);
            int var20 = class333.field4591.method158(true);
            int var21 = class333.field4591.method206(-121);
            int var22 = class333.field4591.method166(false);
            int var23 = class333.field4591.method174(arg1 ^ -30073);
            class142.method979(var21, arg1 ^ 30188);
            class333.field4591.method1188(90);
            for (int var24 = 0; var24 < 4; ++var24) {
                for (int var39 = 0; ~(class211.field2954 >> 3) < ~var39; ++var39) {
                    for (int var40 = 0; var40 < class290.field4061 >> 3; ++var40) {
                        int var41 = class333.field4591.method1186((byte) -97, 1);
                        if (~var41 == -2) {
                            class210.field2941[var24][var39][var40] = class333.field4591.method1186((byte) -97, 26);
                        } else {
                            class210.field2941[var24][var39][var40] = -1;
                        }
                    }
                }
            }
            class333.field4591.method1185((byte) 109);
            int var25 = (-class333.field4591.field191 + class15.field290) / 16;
            class406.field5776 = new int[var25][4];
            for (int var26 = 0; ~var25 < ~var26; ++var26) {
                for (int var38 = 0; var38 < 4; ++var38) {
                    class406.field5776[var26][var38] = class333.field4591.method185(25239);
                }
            }
            class268.field3742 = new int[var25];
            class155.field2191 = new int[var25];
            class446.field6257 = new byte[var25][];
            class403.field5718 = null;
            class5.field91 = null;
            class247.field3495 = new byte[var25][];
            class67.field1014 = new byte[var25][];
            class284.field4005 = new int[var25];
            class276.field3839 = new int[var25];
            class161.field2249 = new byte[var25][];
            class426.field5997 = new int[var25];
            int var27 = 0;
            for (int var28 = 0; ~var28 > -5; ++var28) {
                for (int var29 = 0; ~(class211.field2954 >> 3) < ~var29; ++var29) {
                    for (int var30 = 0; ~(class290.field4061 >> 3) < ~var30; ++var30) {
                        int var31 = class210.field2941[var28][var29][var30];
                        if (~var31 != 0) {
                            int var32 = (var31 & 16763490) >> 14;
                            int var33 = var31 >> 3 & 2047;
                            int var34 = (var32 / 8 << 8) - -(var33 / 8);
                            for (int var35 = 0; ~var35 > ~var27; ++var35) {
                                if (~class155.field2191[var35] == ~var34) {
                                    var34 = -1;
                                    break;
                                }
                            }
                            if (var34 != -1) {
                                class155.field2191[var27] = var34;
                                int var36 = (65306 & var34) >> 8;
                                int var37 = var34 & 255;
                                class276.field3839[var27] = class20.field375.method1751(class108.method765(arg1, -30115), "m" + var36 + "_" + var37);
                                class426.field5997[var27] = class20.field375.method1751(class108.method765(arg1, -30207), "l" + var36 + "_" + var37);
                                class268.field3742[var27] = class20.field375.method1751(57, "um" + var36 + "_" + var37);
                                class284.field4005[var27] = class20.field375.method1751(35, "ul" + var36 + "_" + var37);
                                ++var27;
                            }
                        }
                    }
                }
            }
            class316.method2051(false, var20, var19, var18, 68, var23, var22, var17);
        }
    }
}
