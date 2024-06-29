import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class287 extends class30 {

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Lal;")
    public static class52 field4601 = new class52(50);

    @OriginalMember(owner = "client!va", name = "P", descriptor = "[I")
    public static int[] field4605 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    public static int field4604 = 0;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4606 = null;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "Lmo;")
    public static class447 field4607;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[I", line = 6)
    public final int[] method116(int arg0, byte arg1) {
        ++field4602;
        int[] var3 = super.field371.method2367((byte) 120, arg0);
        if (super.field371.field5586) {
            class408.method2558(var3, 0, class369.field5610, class132.field2064[arg0]);
        }
        if (arg1 <= 49) {
            field4604 = -2;
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 32)
    public class287() {
        super(0, true);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)V", line = 39)
    public static void method1940(boolean arg0) {
        field4601 = null;
        if (!arg0) {
            method1942((class312) null, -34, (class447) null, (class447) null);
        }
        field4605 = null;
        field4606 = null;
        field4607 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZZ)V", line = 53)
    public static final void method1941(boolean arg0, boolean arg1) {
        if (arg1) {
            ++field4600;
            class236.field3947 = arg0;
            if (class236.field3947) {
                int var2 = class158.field2514.method1279(255);
                int var3 = class158.field2514.method1273((byte) -50);
                boolean var4 = class158.field2514.method1285((byte) -33) == 1;
                int var5 = class158.field2514.method1313(-42);
                int var6 = class158.field2514.method1273((byte) -38);
                int var7 = class158.field2514.method1285((byte) -33);
                int var8 = class158.field2514.method1273((byte) -94);
                class124.method915(var5, (byte) -32);
                class158.field2514.method2223(8);
                for (int var9 = 0; ~var9 > -5; ++var9) {
                    for (int var24 = 0; var24 < class80.field1003 >> 3; ++var24) {
                        for (int var25 = 0; ~var25 > ~(class380.field5751 >> 3); ++var25) {
                            int var26 = class158.field2514.method2225(-52, 1);
                            if (~var26 != -2) {
                                class230.field3839[var9][var24][var25] = -1;
                            } else {
                                class230.field3839[var9][var24][var25] = class158.field2514.method2225(92, 26);
                            }
                        }
                    }
                }
                class158.field2514.method2226(7);
                int var10 = (-class158.field2514.field3044 + class345.field5331) / 16;
                class440.field6449 = new int[var10][4];
                for (int var11 = 0; ~var10 < ~var11; ++var11) {
                    for (int var23 = 0; var23 < 4; ++var23) {
                        class440.field6449[var11][var23] = class158.field2514.method1284(8388607);
                    }
                }
                class436.field6417 = new int[var10];
                class102.field1425 = new int[var10];
                class71.field876 = null;
                class376.field5690 = new byte[var10][];
                class376.field5693 = new byte[var10][];
                class236.field3945 = new int[var10];
                class52.field640 = new int[var10];
                class254.field4123 = new byte[var10][];
                class362.field5524 = new int[var10];
                class246.field4031 = null;
                class431.field6341 = new byte[var10][];
                int var12 = 0;
                for (int var13 = 0; ~var13 > -5; ++var13) {
                    for (int var14 = 0; class80.field1003 >> 3 > var14; ++var14) {
                        for (int var15 = 0; var15 < class380.field5751 >> 3; ++var15) {
                            int var16 = class230.field3839[var13][var14][var15];
                            if (~var16 != 0) {
                                int var17 = (var16 & 16765477) >> 14;
                                int var18 = (var16 & 16379) >> 3;
                                int var19 = (var17 / 8 << 8) - -(var18 / 8);
                                for (int var20 = 0; var20 < var12; ++var20) {
                                    if (class52.field640[var20] == var19) {
                                        var19 = -1;
                                        break;
                                    }
                                }
                                if (~var19 != 0) {
                                    class52.field640[var12] = var19;
                                    int var21 = var19 >> 8 & 255;
                                    int var22 = var19 & 255;
                                    class362.field5524[var12] = class212.field3401.method2791((byte) -101, "m" + var21 + "_" + var22);
                                    class436.field6417[var12] = class212.field3401.method2791((byte) -107, "l" + var21 + "_" + var22);
                                    class102.field1425[var12] = class212.field3401.method2791((byte) -96, "um" + var21 + "_" + var22);
                                    class236.field3945[var12] = class212.field3401.method2791((byte) 78, "ul" + var21 + "_" + var22);
                                    ++var12;
                                }
                            }
                        }
                    }
                }
                class414.method2589(false, (byte) -81, var7, var6, var4, var8, var2, var3);
            } else {
                int var27 = class158.field2514.method1287(false);
                int var28 = (-class158.field2514.field3044 + class345.field5331) / 16;
                class440.field6449 = new int[var28][4];
                for (int var29 = 0; ~var29 > ~var28; ++var29) {
                    for (int var41 = 0; var41 < 4; ++var41) {
                        class440.field6449[var29][var41] = class158.field2514.method1328(255);
                    }
                }
                boolean var30 = class158.field2514.method1287(false) == 1;
                int var31 = class158.field2514.method1313(-17);
                int var32 = class158.field2514.method1273((byte) -92);
                int var33 = class158.field2514.method1273((byte) -108);
                int var34 = class158.field2514.method1273((byte) -111);
                int var35 = class158.field2514.method1279(255);
                class124.method915(var31, (byte) -32);
                class362.field5524 = new int[var28];
                class431.field6341 = new byte[var28][];
                class436.field6417 = new int[var28];
                class254.field4123 = new byte[var28][];
                class376.field5693 = new byte[var28][];
                class246.field4031 = null;
                class236.field3945 = new int[var28];
                class376.field5690 = new byte[var28][];
                class71.field876 = null;
                class52.field640 = new int[var28];
                class102.field1425 = new int[var28];
                boolean var36 = false;
                if ((var34 / 8 == 48 || ~(var34 / 8) == -50) && var32 / 8 == 48) {
                    var36 = true;
                }
                if (var34 / 8 == 48 && var32 / 8 == 148) {
                    var36 = true;
                }
                int var37 = 0;
                for (int var38 = (-(class80.field1003 >> 4) + var34) / 8; ((class80.field1003 >> 4) + var34) / 8 >= var38; ++var38) {
                    for (int var39 = (var32 - (class380.field5751 >> 4)) / 8; var39 <= ((class380.field5751 >> 4) + var32) / 8; ++var39) {
                        int var40 = (var38 << 8) + var39;
                        if (!var36 || ~var39 != -50 && var39 != 149 && ~var39 != -148 && var38 != 50 && (~var38 != -50 || var39 != 47)) {
                            class52.field640[var37] = var40;
                            class362.field5524[var37] = class212.field3401.method2791((byte) 126, "m" + var38 + "_" + var39);
                            class436.field6417[var37] = class212.field3401.method2791((byte) -92, "l" + var38 + "_" + var39);
                            class102.field1425[var37] = class212.field3401.method2791((byte) 39, "um" + var38 + "_" + var39);
                            class236.field3945[var37] = class212.field3401.method2791((byte) -124, "ul" + var38 + "_" + var39);
                        } else {
                            class52.field640[var37] = var40;
                            class362.field5524[var37] = -1;
                            class436.field6417[var37] = -1;
                            class102.field1425[var37] = -1;
                            class236.field3945[var37] = -1;
                        }
                        ++var37;
                    }
                }
                class414.method2589(false, (byte) -61, var27, var34, var30, var35, var33, var32);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Le;ILmo;Lmo;)V", line = 305)
    public static final void method1942(class312 arg0, int arg1, class447 arg2, class447 arg3) {
        ++field4603;
        class13.field185 = class107.method807(class225.field3743, 70, 0, arg3);
        if (arg1 == 8820) {
            class292.field4680 = arg0.method612(class13.field185, class100.method750(arg2, class225.field3743, 0), true);
            class31.field383 = class107.method807(class187.field3082, 68, 0, arg3);
            class435.field6411 = arg0.method612(class31.field383, class100.method750(arg2, class187.field3082, 0), true);
            class413.field6111 = class107.method807(class349.field5409, 74, 0, arg3);
            class11.field133 = arg0.method612(class413.field6111, class100.method750(arg2, class349.field5409, 0), true);
        }
    }
}
