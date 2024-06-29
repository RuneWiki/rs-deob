import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class230 extends class303 {

    @OriginalMember(owner = "client!rha", name = "V", descriptor = "I")
    public int field3338 = 0;

    @OriginalMember(owner = "client!rha", name = "fb", descriptor = "I")
    public int field3348 = -1;

    @OriginalMember(owner = "client!rha", name = "cb", descriptor = "I")
    public int field3345 = -1;

    @OriginalMember(owner = "client!rha", name = "bb", descriptor = "I")
    private int field3344 = 0;

    @OriginalMember(owner = "client!rha", name = "U", descriptor = "Z")
    private boolean field3337 = false;

    @OriginalMember(owner = "client!rha", name = "S", descriptor = "I")
    public static int field3335 = -50;

    @OriginalMember(owner = "client!rha", name = "hb", descriptor = "Ljava/lang/String;")
    public static String field3350 = "";

    @OriginalMember(owner = "client!rha", name = "K", descriptor = "I")
    public int field3332;

    @OriginalMember(owner = "client!rha", name = "P", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!rha", name = "R", descriptor = "I")
    public int field3334;

    @OriginalMember(owner = "client!rha", name = "T", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!rha", name = "W", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!rha", name = "X", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!rha", name = "Y", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!rha", name = "Z", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!rha", name = "ab", descriptor = "I")
    public int field3343;

    @OriginalMember(owner = "client!rha", name = "db", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!rha", name = "eb", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!rha", name = "gb", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!rha", name = "ib", descriptor = "I")
    public int field3351;

    @OriginalMember(owner = "client!rha", name = "jb", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!rha", name = "kb", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(IIIII)V")
    public class230(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "(B)Z")
    public final boolean method248(byte arg0) {
        ++field3346;
        if (arg0 != -55) {
            this.method248((byte) 91);
        }
        return this.field3337;
    }

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "(B)Z")
    public final boolean method254(byte arg0) {
        ++field3333;
        return arg0 != 104;
    }

    @OriginalMember(owner = "client!rha", name = "d", descriptor = "(B)V")
    public static void method1597(byte arg0) {
        field3350 = null;
        if (arg0 >= -80) {
            method1598(47, (byte) 15);
        }
    }

    @OriginalMember(owner = "client!rha", name = "j", descriptor = "(I)I")
    public final int method239(int arg0) {
        if (arg0 >= -9) {
            field3335 = -75;
        }
        ++field3341;
        return this.field3344;
    }

    @OriginalMember(owner = "client!rha", name = "g", descriptor = "(I)I")
    public final int method246(int arg0) {
        ++field3336;
        if (arg0 >= -104) {
            this.field3345 = 70;
        }
        return -10;
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(IB)V")
    public static final void method1598(int arg0, byte arg1) {
        class449.field6433 = arg0;
        int var2 = 25 % ((35 - arg1) / 43);
        ++field3347;
        class118.field1471.method2364(1);
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(IZLha;I)Z")
    public final boolean method253(int arg0, boolean arg1, class66 arg2, int arg3) {
        ++field3349;
        class378 var5 = arg2.method433();
        var5.method1959(super.field7718, super.field7723 + -10, super.field7719);
        class501 var6 = class526.field7490.method3567(this.field3332, arg1);
        class495 var7 = var6.method2919(131072, 0, 115, this.field3343, 0, -1, arg2, (class129) null, (class515) null);
        if (var7 != null && (class475.field6760 ? var7.method84(arg3, arg0, var5, true, var6.field7156, class412.field5822) : var7.method83(arg3, arg0, var5, true, var6.field7156))) {
            return true;
        } else {
            if (~this.field3345 != 0) {
                class501 var8 = class526.field7490.method3567(this.field3345, true);
                class495 var9 = var8.method2919(131072, 0, -39, this.field3334, 0, -1, arg2, (class129) null, (class515) null);
                if (var9 != null && (!class475.field6760 ? var9.method83(arg3, arg0, var5, true, var8.field7156) : var9.method84(arg3, arg0, var5, true, var8.field7156, class412.field5822))) {
                    return true;
                }
            }
            if (this.field3348 != -1) {
                class501 var10 = class526.field7490.method3567(this.field3348, true);
                class495 var11 = var10.method2919(131072, 0, -120, this.field3351, 0, -1, arg2, (class129) null, (class515) null);
                if (var11 != null && (class475.field6760 ? var11.method84(arg3, arg0, var5, true, var10.field7156, class412.field5822) : var11.method83(arg3, arg0, var5, true, var10.field7156))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rha", name = "k", descriptor = "(I)I")
    public final int method1599(int arg0) {
        ++field3342;
        class501 var2 = class526.field7490.method3567(this.field3332, true);
        int var3 = var2.field7156;
        if (this.field3345 != -1) {
            class501 var4 = class526.field7490.method3567(this.field3345, true);
            if (var3 < var4.field7156) {
                var3 = var4.field7156;
            }
        }
        if (this.field3348 != -1) {
            class501 var5 = class526.field7490.method3567(this.field3348, true);
            if (~var3 > ~var5.field7156) {
                var3 = var5.field7156;
            }
        }
        if (arg0 >= -118) {
            this.field3348 = -82;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lha;B)Lhq;")
    public final class167 method258(class66 arg0, byte arg1) {
        ++field3340;
        class393 var3 = class338.method2169(super.field7710, super.field7718 >> class310.field4616, super.field7719 >> class310.field4616);
        class736 var4 = class728.method4087(super.field7710, super.field7718 >> class310.field4616, super.field7719 >> class310.field4616);
        int var5 = 0;
        if (var3 != null && var3.field5578.field10732) {
            var5 = var3.field5578.method246(-107);
        }
        if (var4 != null && ~(-var5) > ~var4.field10280) {
            var5 = -var4.field10280;
        }
        if (this.field3338 != var5) {
            super.field7723 -= this.field3338;
            this.field3338 = var5;
            super.field7723 += var5;
        }
        class378 var6 = arg0.method433();
        var6.method1956();
        if (this.field3338 == 0) {
            boolean var7 = false;
            boolean var8 = false;
            boolean var9 = false;
            class292 var10 = class622.field8777[super.field7711];
            int var11 = this.field3344 << 1;
            int var13 = -var11 / 2;
            int var14 = -var11 / 2;
            int var15 = var10.method1977((byte) 113, super.field7718 + var13, super.field7719 + var14);
            int var16 = var11 / 2;
            int var17 = -var11 / 2;
            int var18 = var10.method1977((byte) 127, super.field7718 - -var16, super.field7719 + var17);
            int var19 = -var11 / 2;
            int var20 = var11 / 2;
            int var21 = var10.method1977((byte) -16, super.field7718 + var19, super.field7719 + var20);
            int var22 = var11 / 2;
            int var23 = var11 / 2;
            int var24 = var10.method1977((byte) 117, super.field7718 + var22, super.field7719 - -var23);
            int var25 = var15 < var18 ? var15 : var18;
            int var26 = var24 <= var21 ? var24 : var21;
            int var27 = ~var24 < ~var18 ? var18 : var24;
            int var28 = var15 >= var21 ? var21 : var15;
            if (var11 != 0) {
                int var29 = (int) (2607.5945876176133D * Math.atan2((double) (-var26 + var25), (double) var11)) & 16383;
                if (var29 != 0) {
                    var6.method1957(var29);
                }
            }
            if (var11 != 0) {
                int var30 = (int) (2607.5945876176133D * Math.atan2((double) (-var27 + var28), (double) var11)) & 16383;
                if (~var30 != -1) {
                    var6.method1942(-var30);
                }
            }
            int var31 = var15 - -var24;
            if (var18 + var21 < var31) {
                var31 = var18 - -var21;
            }
            int var32 = (var31 >> 1) + -super.field7723;
            if (var32 != 0) {
                var6.method1952(0, var32, 0);
            }
        }
        var6.method1952(super.field7718, super.field7723 + -10, super.field7719);
        class167 var33 = class653.method3739(0, 3, true);
        this.field3344 = 0;
        this.field3337 = false;
        if (this.field3348 != -1) {
            class495 var34 = class526.field7490.method3567(this.field3348, true).method2919(2048, 0, -52, this.field3351, 0, -1, arg0, (class129) null, (class515) null);
            if (var34 != null) {
                if (!class475.field6760) {
                    var34.method108(var6, var33.field2426[2], 0);
                } else {
                    var34.method91(var6, var33.field2426[2], class412.field5822, 0);
                }
                this.field3337 |= var34.method88();
                this.field3344 = var34.method67();
            }
        }
        if (~this.field3345 != 0) {
            class495 var35 = class526.field7490.method3567(this.field3345, true).method2919(2048, 0, -42, this.field3334, 0, -1, arg0, (class129) null, (class515) null);
            if (var35 != null) {
                if (!class475.field6760) {
                    var35.method108(var6, var33.field2426[1], 0);
                } else {
                    var35.method91(var6, var33.field2426[1], class412.field5822, 0);
                }
                this.field3337 |= var35.method88();
                if (~var35.method67() < ~this.field3344) {
                    this.field3344 = var35.method67();
                }
            }
        }
        class495 var36 = class526.field7490.method3567(this.field3332, true).method2919(2048, 0, -33, this.field3343, 0, -1, arg0, (class129) null, (class515) null);
        if (var36 != null) {
            if (!class475.field6760) {
                var36.method108(var6, var33.field2426[0], 0);
            } else {
                var36.method91(var6, var33.field2426[0], class412.field5822, 0);
            }
            this.field3337 |= var36.method88();
            if (~var36.method67() < ~this.field3344) {
                this.field3344 = var36.method67();
            }
        }
        if (arg1 != 10) {
            this.field3345 = 12;
        }
        return var33;
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lha;I)V")
    public final void method257(class66 arg0, int arg1) {
        ++field3353;
        if (arg1 < 60) {
            this.field3344 = 124;
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZIIII)V")
    public static final void method1600(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3339;
        if (arg0 || ~class388.field5531 != ~arg3 || ~class481.field6839 != ~arg1 || ~class573.field8111 != ~class410.field5771 && ~class145.field1852.field9018.method2757((byte) -60) != -2) {
            class481.field6839 = arg1;
            class573.field8111 = class410.field5771;
            class388.field5531 = arg3;
            if (class145.field1852.field9018.method2757((byte) -83) == 1) {
                class573.field8111 = 0;
            }
            class374.method2323(arg2, (byte) 76);
            class54.method348(class157.field2343, false, class564.field8008, class638.field8979, true, class674.field9563.method3825((byte) -10, class526.field7494));
            int var5 = class103.field1295;
            int var6 = class175.field2496;
            class103.field1295 = (class388.field5531 - (class109.field1314 >> 4)) * 8;
            class175.field2496 = (class481.field6839 - (class760.field10479 >> 4)) * 8;
            class273.field3814 = class436.method2628(class388.field5531 * 8, class481.field6839 * 8);
            class663.field9307 = null;
            int var7 = -var5 + class103.field1295;
            int var8 = -var6 + class175.field2496;
            if (~arg2 != -12) {
                boolean var9 = false;
                class26.field379 = 0;
                int var10 = class109.field1314 * 512 + -512;
                int var11 = class760.field10479 * 512 - 512;
                for (int var12 = 0; ~var12 > ~class662.field9292; ++var12) {
                    class14 var13 = class642.field9044[var12];
                    if (var13 != null) {
                        class645 var14 = var13.field262;
                        var14.field7718 -= var7 * 512;
                        var14.field7719 -= var8 * 512;
                        if (var14.field7718 >= 0 && var14.field7718 <= var10 && var14.field7719 >= 0 && ~var14.field7719 >= ~var11) {
                            boolean var15 = true;
                            for (int var16 = 0; var16 < 10; ++var16) {
                                var14.field6448[var16] -= var7;
                                var14.field6445[var16] -= var8;
                                if (var14.field6448[var16] < 0 || var14.field6448[var16] >= class109.field1314 || ~var14.field6445[var16] > -1 || var14.field6445[var16] >= class760.field10479) {
                                    var15 = false;
                                }
                            }
                            if (var15) {
                                class790.field10846[class26.field379++] = var14.field6361;
                            } else {
                                var14.method3686((class279) null, (byte) -52);
                                var9 = true;
                                var13.method3117((byte) 56);
                            }
                        } else {
                            var14.method3686((class279) null, (byte) -52);
                            var9 = true;
                            var13.method3117((byte) -93);
                        }
                    }
                }
                if (var9) {
                    class662.field9292 = class543.field7606.method381(65);
                    class543.field7606.method385(0, class642.field9044);
                }
            } else {
                for (int var17 = 0; ~var17 > ~class662.field9292; ++var17) {
                    class14 var31 = class642.field9044[var17];
                    if (var31 != null) {
                        class645 var32 = var31.field262;
                        for (int var33 = 0; ~var33 > -11; ++var33) {
                            var32.field6448[var33] -= var7;
                            var32.field6445[var33] -= var8;
                        }
                        var32.field7718 -= var7 * 512;
                        var32.field7719 -= var8 * 512;
                    }
                }
            }
            for (int var18 = 0; ~var18 > -2049; ++var18) {
                class559 var29 = class581.field8250[var18];
                if (var29 != null) {
                    for (int var30 = 0; var30 < 10; ++var30) {
                        var29.field6448[var30] -= var7;
                        var29.field6445[var30] -= var8;
                    }
                    var29.field7719 -= var8 * 512;
                    var29.field7718 -= var7 * 512;
                }
            }
            class253[] var19 = class443.field6310;
            int var20 = 0;
            if (arg4 == -22710) {
                while (var20 < var19.length) {
                    class253 var28 = var19[var20];
                    if (var28 != null) {
                        var28.field3564 -= var8 * 512;
                        var28.field3559 -= var7 * 512;
                    }
                    ++var20;
                }
                for (class455 var21 = (class455) class715.field10079.method2508((byte) -91); var21 != null; var21 = (class455) class715.field10079.method2505((byte) -55)) {
                    var21.field6523 -= var8;
                    var21.field6529 -= var7;
                    if (class64.field867 != 4 && (var21.field6529 < 0 || var21.field6523 < 0 || class109.field1314 <= var21.field6529 || ~var21.field6523 <= ~class760.field10479)) {
                        var21.method3117((byte) -125);
                    }
                }
                for (class455 var22 = (class455) class110.field1360.method2508((byte) 127); var22 != null; var22 = (class455) class110.field1360.method2505((byte) -55)) {
                    var22.field6523 -= var8;
                    var22.field6529 -= var7;
                    if (~class64.field867 != -5 && (var22.field6529 < 0 || ~var22.field6523 > -1 || var22.field6529 >= class109.field1314 || class760.field10479 <= var22.field6523)) {
                        var22.method3117((byte) 77);
                    }
                }
                if (class64.field867 != 4) {
                    for (class541 var23 = (class541) class70.field959.method382(0); var23 != null; var23 = (class541) class70.field959.method391(37)) {
                        int var24 = (int) (16383L & var23.field7577);
                        int var25 = -class103.field1295 + var24;
                        int var26 = (int) (16383L & var23.field7577 >> 14);
                        int var27 = -class175.field2496 + var26;
                        if (var25 < 0 || ~var27 > -1 || var25 >= class109.field1314 || var27 >= class760.field10479) {
                            var23.method3117((byte) -5);
                        }
                    }
                }
                if (~class697.field9843 != -1) {
                    class336.field4995 -= var8;
                    class697.field9843 -= var7;
                }
                class277.method1801(arg4 + 2876);
                if (arg2 == 11) {
                    if (~class763.field10510 != -5) {
                        class180.field2732 = -1;
                        class406.field5746 = -1;
                        class763.field10510 = 1;
                    } else {
                        class75.field1009 -= var7 * 512;
                        class238.field3434 -= var8 * 512;
                        class4.field54 -= var7 * 512;
                        class579.field8185 -= var8 * 512;
                    }
                } else {
                    class785.field10789 -= var7;
                    class277.field3866 -= var7 * 512;
                    class717.field10088 -= var8;
                    class359.field5216 -= var8 * 512;
                    class719.field10104 -= var8;
                    class2.field21 -= var7;
                    if (Math.abs(var7) > class109.field1314 || ~Math.abs(var8) < ~class760.field10479) {
                        class696.method3921((byte) -21);
                    }
                }
                class426.method2540(-119);
                class281.method1905((byte) 107);
                class299.field4496.method2503(arg4 + 22720);
                class399.field5668.method2503(10);
                class602.field8486.method2024((byte) -106);
                class326.method2115((byte) 108);
            }
        }
    }

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "(Lha;B)Lpw;")
    public final class733 method255(class66 arg0, byte arg1) {
        ++field3352;
        int var3 = -104 % ((-45 - arg1) / 63);
        return null;
    }
}
