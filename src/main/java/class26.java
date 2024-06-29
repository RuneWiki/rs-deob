import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class26 extends class595 {

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Z")
    private boolean field457 = false;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIZZI)V")
    public static final void method294(boolean arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        ++field458;
        class154.method1005(0, arg3, arg4, arg0, arg1, class35.field749.length + -1, (byte) 32);
        class277.field3828 = 0;
        if (!arg2) {
            field462 = -64;
        }
        class472.field6635 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZII)Z")
    public static final boolean method295(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method300((byte) 96, -77);
        }
        ++field464;
        return (arg1 & 256) != 0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BILj;ILdu;Lqa;)Z")
    public static final boolean method296(byte arg0, int arg1, class463 arg2, int arg3, class299 arg4, class207 arg5) {
        ++field467;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg2.field6517 != null) {
            var9 = -((arg2.field6518 - (-arg4.field4089 - -class413.field5825)) * (-class413.field5823 + class413.field5827) / (-class413.field5825 + class413.field5840)) + class413.field5827;
            var8 = class413.field5827 - (-class413.field5825 + arg2.field6525 - -arg4.field4089) * (-class413.field5823 + class413.field5827) / (class413.field5840 - class413.field5825);
            var6 = (-class413.field5832 + arg2.field6509 + arg4.field4087) * (-class413.field5834 + class413.field5841) / (-class413.field5832 + class413.field5831) + class413.field5834;
            var7 = class413.field5834 - -((arg2.field6530 + arg4.field4087 + -class413.field5832) * (-class413.field5834 + class413.field5841) / (-class413.field5832 + class413.field5831));
        }
        class52 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg2.field6512 != -1) {
            if (arg4.field4091 && ~arg2.field6497 != 0) {
                var10 = arg2.method2700(14, true, arg5);
            } else {
                var10 = arg2.method2700(14, false, arg5);
            }
            if (var10 != null) {
                var11 = arg4.field4090 - (var10.method419() - -1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var12 = arg4.field4090 - -(1 + var10.method419() >> 1);
                var13 = arg4.field4084 - (1 + var10.method432() >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                if (~var13 > ~var8) {
                    var8 = var13;
                }
                var14 = arg4.field4084 + (1 + var10.method432() >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class240 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg2.field6531 != null) {
            var15 = class316.method1966(arg2.field6538, (byte) 97);
            if (var15 != null) {
                var16 = class451.field6372.method2821(class118.field1937, (class52[]) null, -1, arg2.field6531, (int[]) null);
                int var23 = arg4.field4084;
                if (var10 != null) {
                    var17 = var23 - ((var10.method432() >> 1) + var15.method1497() * var16);
                } else {
                    var17 = var23 - var15.method1500() * var16 / 2;
                }
                for (int var24 = 0; var24 < var16; ++var24) {
                    String var25 = class118.field1937[var24];
                    if (~(var16 + -1) < ~var24) {
                        var25 = var25.substring(0, -4 + var25.length());
                    }
                    int var26 = var15.method1495(var25);
                    if (~var18 > ~var26) {
                        var18 = var26;
                    }
                }
                var19 = -(var18 / 2) + arg4.field4090 - -arg3;
                if (~var19 > ~var6) {
                    var6 = var19;
                }
                var20 = var18 / 2 - -arg3 + arg4.field4090;
                if (var7 < var20) {
                    var7 = var20;
                }
                var21 = var17 - -arg1;
                var22 = arg1 + var17 - -(var15.method1497() * var16);
                if (~var8 < ~var21) {
                    var8 = var21;
                }
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (~class413.field5834 >= ~var7 && var6 <= class413.field5841 && ~var9 <= ~class413.field5823 && var8 <= class413.field5827) {
            if (arg2.field6517 != null) {
                int[] var27 = new int[arg2.field6517.length];
                for (int var28 = 0; ~var28 > ~(var27.length / 2); ++var28) {
                    int var30 = arg2.field6517[var28 * 2] + arg4.field4087;
                    int var31 = arg2.field6517[var28 * 2 + 1] + arg4.field4089;
                    var27[var28 * 2] = (class413.field5841 - class413.field5834) * (-class413.field5832 + var30) / (-class413.field5832 + class413.field5831) + class413.field5834;
                    var27[var28 * 2 + 1] = -((-class413.field5825 + var31) * (-class413.field5823 + class413.field5827) / (-class413.field5825 + class413.field5840)) + class413.field5827;
                }
                class290.method1865(arg5, var27, arg2.field6510);
                for (int var29 = 0; ~(var27.length / 2 - 1) < ~var29; ++var29) {
                    arg5.method1367(var27[var29 * 2 + 1], var27[(var29 + 1) * 2], var27[(var29 + 1) * 2 - -1], arg2.field6529, var27[var29 * 2], true);
                }
                arg5.method1367(var27[var27.length + -1], var27[0], var27[1], arg2.field6529, var27[var27.length + -2], true);
            }
            if (var10 != null) {
                if (class592.field8498 > 0 && (~class365.field4961 != 0 && class365.field4961 == arg4.field4088 || ~class640.field9317 != 0 && ~class640.field9317 == ~arg2.field6499)) {
                    int var32;
                    if (~class314.field4237 < -51) {
                        var32 = -(class314.field4237 * 2) + 200;
                    } else {
                        var32 = class314.field4237 * 2;
                    }
                    int var33 = var32 << 24 | 16776960;
                    arg5.method1331(var33, arg4.field4090, 7 + var10.method429() / 2, 0, arg4.field4084);
                    arg5.method1331(var33, arg4.field4090, 5 + var10.method429() / 2, arg0 ^ 81, arg4.field4084);
                    arg5.method1331(var33, arg4.field4090, 3 + var10.method429() / 2, 0, arg4.field4084);
                    arg5.method1331(var33, arg4.field4090, 1 + var10.method429() / 2, arg0 ^ 81, arg4.field4084);
                    arg5.method1331(var33, arg4.field4090, var10.method429() / 2, 0, arg4.field4084);
                }
                var10.method497(arg4.field4090 + -(var10.method419() >> 1), arg4.field4084 + -(var10.method432() >> 1));
            }
            if (arg2.field6531 != null && var15 != null) {
                class532.method3058(arg4, arg2, 0, arg5, var17, var15, var18, var16);
            }
            if (arg2.field6512 != -1 || arg2.field6531 != null) {
                class542 var34 = new class542(arg4);
                var34.field7544 = var19;
                var34.field7545 = var13;
                var34.field7543 = var12;
                var34.field7541 = var22;
                var34.field7548 = var21;
                var34.field7546 = var11;
                var34.field7542 = var20;
                var34.field7538 = var14;
                class317.field4305.method463(var34, -118);
            }
            return arg0 != 81;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)Z")
    public final boolean method297(byte arg0) {
        if (arg0 > -119) {
            this.method298((byte) 124);
        }
        ++field466;
        return true;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(B)V")
    public final void method298(byte arg0) {
        ++field465;
        if (!this.field457) {
            super.field8612.method2326(arg0 + 151, 0, class583.field8185);
        } else {
            super.field8612.method2296(arg0 + 60, 1);
            super.field8612.method1647(class438.field6223, 120);
            super.field8612.method2313(class167.field2417, arg0 + 177, class167.field2417);
            super.field8612.method2315(class610.field8770, 2, arg0 ^ -52);
            super.field8612.method2326(90, 0, class583.field8185);
            super.field8612.method2325(1);
            super.field8612.method2267(2, (class445) null);
            super.field8612.method2296(0, 0);
            this.field457 = false;
        }
        super.field8612.method2313(class167.field2417, -127, class167.field2417);
        if (arg0 != -60) {
            field462 = -22;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
    public final void method299(int arg0, boolean arg1) {
        if (arg0 == -1) {
            super.field8612.method2313(class137.field2155, -30, class167.field2417);
            ++field459;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lwr;)V")
    public class26(class388 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V")
    public static final void method300(byte arg0, int arg1) {
        ++field463;
        int var2 = -class280.field3889 + class405.field5763;
        if (var2 >= 100) {
            class107.field1653 = 1;
        } else {
            int var3 = (int) class18.field224;
            if (var3 < class430.field6125 >> 8) {
                var3 = class430.field6125 >> 8;
            }
            if (class84.field1367[4] && ~var3 > ~(class495.field6927[4] + 128)) {
                var3 = class495.field6927[4] - -128;
            }
            int var4 = 16383 & (int) class1.field13 + class254.field3521;
            class252.method1570(class414.field5848, arg1, 99, var3, -50 + class183.method1144(108, class645.field9372.field6037, class645.field9372.field6029, class206.field2901), var4, class487.field6841, (var3 >> 3) * 3 + 600 << 0);
            float var5 = 1.0F - (float) ((100 - var2) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F;
            if (arg0 < -126) {
                class160.field2349 = (int) ((float) (-class297.field4075 + class160.field2349) * var5 + (float) class297.field4075);
                class117.field1930 = (int) ((float) (class117.field1930 - class404.field5744) * var5 + (float) class404.field5744);
                class462.field6488 = (int) ((float) (class462.field6488 - class162.field2362) * var5 + (float) class162.field2362);
                class563.field7794 = (int) ((float) (-class43.field818 + class563.field7794) * var5 + (float) class43.field818);
                int var6 = -class393.field5548 + class88.field1391;
                if (~var6 < -8193) {
                    var6 -= 16384;
                } else if (~var6 > 8191) {
                    var6 += 16384;
                }
                class88.field1391 = (int) ((float) var6 * var5 + (float) class393.field5548);
                class88.field1391 &= 16383;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lbaa;II)V")
    public final void method301(class445 arg0, int arg1, int arg2) {
        super.field8612.method2267(2, arg0);
        ++field461;
        super.field8612.method2334(arg2, (byte) -67);
        if (arg1 != -1) {
            method300((byte) 80, 25);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZZ)V")
    public final void method302(boolean arg0, boolean arg1) {
        ++field460;
        class284 var3 = super.field8612.method2336(17812);
        if (var3 != null && arg0) {
            super.field8612.method2296(0, 1);
            super.field8612.method2267(2, var3);
            super.field8612.method1647(class525.field7383, 101);
            super.field8612.method2296(0, 1);
            super.field8612.method2313(class137.field2155, -60, class583.field8102);
            super.field8612.method1641(true, false, 2, class459.field6466, 0);
            super.field8612.method2326(113, 0, class453.field6402);
            class557 var4 = super.field8612.method2289(-48);
            var4.method3166(-28, super.field8612.method2337(-22447));
            super.field8612.method2299(119, class184.field2590);
            super.field8612.method2296(0, 0);
            this.field457 = true;
        } else {
            super.field8612.method2326(117, 0, class453.field6402);
        }
        if (!arg1) {
            this.method299(-57, false);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
    public final void method303(int arg0, int arg1, int arg2) {
        ++field456;
        if (arg2 >= -114) {
            this.method299(-9, false);
        }
    }
}
