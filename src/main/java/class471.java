import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class471 extends class14 {

    @OriginalMember(owner = "client!t", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field6485 = new String[200];

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    public static int field6484 = 0;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!t", name = "O", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
    public static void method2675(int arg0) {
        field6485 = null;
        if (arg0 < 92) {
            field6485 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lwv;I)Z")
    public static final boolean method2676(class26 arg0, int arg1) {
        if (arg1 != 10) {
            return false;
        } else {
            ++field6488;
            return class22.field389 == arg0 || class152.field2203 == arg0 || class339.field4426 == arg0 || class507.field7042 == arg0;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BLcr;IILqa;)V")
    public static final void method2677(byte arg0, class403 arg1, int arg2, int arg3, class162 arg4) {
        ++field6486;
        class381 var5 = arg1.method2345(-1, arg4);
        if (var5 != null) {
            arg4.method572(arg3, arg2, arg1.field5450 + arg3, arg1.field5404 + arg2);
            int var6 = 114 % ((-78 - arg0) / 41);
            if (~class130.field1894 != -3 && class130.field1894 != 5 && client.field2740 != null) {
                int var7;
                int var8;
                int var9;
                int var10;
                if (class42.field623 != 4) {
                    var7 = 16383 & (int) (-class184.field2621) + class361.field4871;
                    var8 = class385.field5232.field584;
                    var9 = class385.field5232.field574;
                    var10 = -(class514.field7589 * 16) + 4096;
                } else {
                    var8 = class375.field5094;
                    var9 = class183.field2610;
                    var10 = 4096;
                    var7 = 16383 & (int) (-class184.field2621);
                }
                int var11 = var8 / 32 + 48 + -(class12.field251 * 2) + 208;
                int var12 = class289.field3782 * 4 + 48 + -(var9 / 32) - (class289.field3782 + -104) * 2;
                client.field2740.method3112((float) arg1.field5450 / 2.0F + (float) arg3, (float) arg1.field5404 / 2.0F + (float) arg2, (float) var11, (float) var12, var10, var7 << 2, var5, arg3, arg2);
                for (class387 var13 = (class387) class166.field2411.method1672((byte) -89); var13 != null; var13 = (class387) class166.field2411.method1668(-1)) {
                    int var55 = var13.field5264;
                    int var56 = ((268432041 & class277.field3629.field5354[var55]) >> 14) + -class401.field5382;
                    int var57 = (16383 & class277.field3629.field5354[var55]) - class421.field5762;
                    int var58 = var56 * 4 + 2 + -(var8 / 32);
                    int var59 = var57 * 4 + 2 + -(var9 / 32);
                    class334.method1915(class277.field3629.field5357[var55], arg2, arg4, arg3, arg1, var59, 0, var58, var5);
                }
                for (int var14 = 0; ~var14 > ~class108.field1574; ++var14) {
                    int var52 = class457.field6300[var14] * 4 + 2 + -(var8 / 32);
                    int var53 = class409.field5617[var14] * 4 + -(var9 / 32) + 2;
                    class1 var54 = class402.field5388.method1994(-17294, class167.field2427[var14]);
                    if (var54.field58 != null) {
                        var54 = var54.method17(class301.field3980, -110);
                        if (var54 == null || ~var54.field92 == 0) {
                            continue;
                        }
                    }
                    class334.method1915(var54.field92, arg2, arg4, arg3, arg1, var53, 0, var52, var5);
                }
                for (class289 var15 = (class289) class436.field5982.method181((byte) -70); var15 != null; var15 = (class289) class436.field5982.method179(1)) {
                    int var49 = (int) (var15.field622 >> 28 & 3L);
                    if (class473.field6514 == var49) {
                        int var50 = (int) (var15.field622 & 16383L) * 4 - -2 + -(var8 / 32);
                        int var51 = -(var9 / 32) + 2 + 4 * (int) (16383L & var15.field622 >> 14);
                        class482.method2778(arg3, arg1, var51, class241.field3210[0], arg2, var5, true, var50);
                    }
                }
                for (int var16 = 0; ~class60.field942 < ~var16; ++var16) {
                    class117 var45 = class291.field3822[class162.field2369[var16]];
                    if (var45 != null && var45.method801((byte) -78) && class385.field5232.field573 == var45.field573) {
                        class506 var46 = var45.field1661;
                        if (var46 != null && var46.field6971 != null) {
                            var46 = var46.method2885(84, class301.field3980);
                        }
                        if (var46 != null && var46.field6976 && var46.field6991) {
                            int var47 = var45.field584 / 32 - var8 / 32;
                            int var48 = var45.field574 / 32 - var9 / 32;
                            if (~var46.field6960 != 0) {
                                class334.method1915(var46.field6960, arg2, arg4, arg3, arg1, var48, 0, var47, var5);
                            } else {
                                class482.method2778(arg3, arg1, var48, class241.field3210[1], arg2, var5, true, var47);
                            }
                        }
                    }
                }
                int var17 = class461.field6368;
                int[] var18 = class461.field6370;
                for (int var19 = 0; var19 < var17; ++var19) {
                    class515 var37 = class499.field6901[var18[var19]];
                    if (var37 != null && var37.method3037((byte) -78) && class385.field5232 != var37 && class385.field5232.field573 == var37.field573) {
                        int var38 = var37.field584 / 32 + -(var8 / 32);
                        int var39 = var37.field574 / 32 - var9 / 32;
                        boolean var40 = false;
                        for (int var41 = 0; ~class267.field3528 < ~var41; ++var41) {
                            if (var37.field7638.equals(field6485[var41]) && ~class127.field1853[var41] != -1) {
                                var40 = true;
                                break;
                            }
                        }
                        boolean var42 = false;
                        for (int var43 = 0; ~var43 > ~class237.field3176; ++var43) {
                            if (var37.field7638.equals(class265.field3506[var43].field5084)) {
                                var42 = true;
                                break;
                            }
                        }
                        boolean var44 = false;
                        if (~class385.field5232.field7612 != -1 && var37.field7612 != 0 && ~class385.field5232.field7612 == ~var37.field7612) {
                            var44 = true;
                        }
                        if (var37.field7639) {
                            class482.method2778(arg3, arg1, var39, class241.field3210[6], arg2, var5, true, var38);
                        } else if (var40) {
                            class482.method2778(arg3, arg1, var39, class241.field3210[3], arg2, var5, true, var38);
                        } else if (var42) {
                            class482.method2778(arg3, arg1, var39, class241.field3210[5], arg2, var5, true, var38);
                        } else if (var44) {
                            class482.method2778(arg3, arg1, var39, class241.field3210[4], arg2, var5, true, var38);
                        } else {
                            class482.method2778(arg3, arg1, var39, class241.field3210[2], arg2, var5, true, var38);
                        }
                    }
                }
                class370[] var20 = class335.field4395;
                for (int var21 = 0; var20.length > var21; ++var21) {
                    class370 var24 = var20[var21];
                    if (var24 != null && var24.field4980 != 0 && class31.field516 % 20 < 10) {
                        if (var24.field4980 == 1 && ~var24.field4973 <= -1 && ~var24.field4973 > ~class291.field3822.length) {
                            class117 var25 = class291.field3822[var24.field4973];
                            if (var25 != null) {
                                int var26 = var25.field584 / 32 + -(var8 / 32);
                                int var27 = var25.field574 / 32 - var9 / 32;
                                class307.method1783(arg1, var5, var24.field4977, var26, arg2, var27, (byte) 76, 360000L, arg3);
                            }
                        }
                        if (~var24.field4980 == -3) {
                            int var28 = var24.field4982 / 32 + -(var8 / 32);
                            int var29 = var24.field4976 / 32 + -(var9 / 32);
                            long var30 = (long) (var24.field4978 << 5);
                            long var32 = var30 * var30;
                            class307.method1783(arg1, var5, var24.field4977, var28, arg2, var29, (byte) -98, var32, arg3);
                        }
                        if (var24.field4980 == 10 && var24.field4973 >= 0 && ~class499.field6901.length < ~var24.field4973) {
                            class515 var34 = class499.field6901[var24.field4973];
                            if (var34 != null) {
                                int var35 = var34.field584 / 32 + -(var8 / 32);
                                int var36 = var34.field574 / 32 + -(var9 / 32);
                                class307.method1783(arg1, var5, var24.field4977, var35, arg2, var36, (byte) 87, 360000L, arg3);
                            }
                        }
                    }
                }
                if (class42.field623 != 4) {
                    if (~class11.field239 != -1) {
                        int var22 = class11.field239 * 4 + -(var8 / 32) + 2 + (class385.field5232.method2590(0) - 1) * 2;
                        int var23 = class497.field6888 * 4 - -2 - var9 / 32 - -(2 * (class385.field5232.method2590(0) - 1));
                        class482.method2778(arg3, arg1, var23, class174.field2550[!class413.field5717 ? 0 : 1], arg2, var5, true, var22);
                    }
                    arg4.method1093(3, arg1.field5450 / 2 + arg3 + -1, arg1.field5404 / 2 + -1 + arg2, 3, 3, -1);
                    return;
                }
            } else {
                arg4.method576(-16777216, var5, arg3, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
    public static final void method2678(int arg0) {
        int var1 = 23 % ((arg0 - -2) / 58);
        ++field6481;
        class203.field2816 = 0;
        class445.field6098 = 0;
        class115.field1635 = 0;
        class514.field7587 = 0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IB[F)[F")
    public static final float[] method2679(int arg0, byte arg1, float[] arg2) {
        ++field6487;
        float[] var3 = new float[arg0];
        class254.method1532(arg2, 0, var3, 0, arg0);
        if (arg1 <= 87) {
            field6485 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BZ)V")
    public static final void method2680(byte arg0, boolean arg1) {
        ++field6483;
        class88.method641((byte) 119);
        if (class454.field6161 == 30 || class454.field6161 == 25) {
            ++class285.field3725;
            if (~class285.field3725 <= -51 || arg1) {
                class285.field3725 = 0;
                if (!class407.field5593 && class304.field4004 != null) {
                    class118.method822(123, class261.field3468);
                    ++class93.field1408;
                    try {
                        class304.field4004.method1880(class193.field2708.field5152, 115, 0, class193.field2708.field5173);
                        class193.field2708.field5173 = 0;
                    } catch (IOException var2) {
                        class407.field5593 = true;
                    }
                }
                class88.method641((byte) 123);
                if (arg0 != -8) {
                    method2678(-111);
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    public class471() {
        super(0, true);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field6482;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (arg1 >= -2) {
            return null;
        } else {
            if (super.field270.field5222) {
                class254.method1530(var3, 0, class115.field1637, class273.field3590[arg0]);
            }
            return var3;
        }
    }
}
