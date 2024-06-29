import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class91 extends class759 {

    @OriginalMember(owner = "client!cea", name = "C", descriptor = "Ltm;")
    public static class334 field1368 = new class334(6, 6);

    @OriginalMember(owner = "client!cea", name = "z", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!cea", name = "A", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!cea", name = "B", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!cea", name = "D", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!cea", name = "E", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(IIIIIF)V", line = 3)
    public class91(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIB)V", line = 6)
    public final void method8(int arg0, int arg1, int arg2, byte arg3) {
        super.field10594 = arg0;
        ++field1365;
        super.field10593 = arg2;
        if (arg3 != -28) {
            method769(-19, (class461) null);
        }
        super.field10584 = arg1;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILcca;)I", line = 19)
    public static final int method769(int arg0, class461 arg1) {
        ++field1367;
        class504 var2 = arg1.field6688;
        if (var2.field7308 != null) {
            var2 = var2.method3046(-88, class422.field6216);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = 97 % ((arg0 - 41) / 34);
        int var4 = var2.field7337;
        class228 var5 = arg1.method885(115);
        if (~arg1.field1679 != 0 && !arg1.field1598) {
            if (~arg1.field1679 != ~var5.field3660 && ~arg1.field1679 != ~var5.field3653 && ~arg1.field1679 != ~var5.field3670 && ~arg1.field1679 != ~var5.field3662) {
                if (arg1.field1679 == var5.field3661 || arg1.field1679 == var5.field3656 || arg1.field1679 == var5.field3689 || arg1.field1679 == var5.field3699) {
                    var4 = var2.field7298;
                }
            } else {
                var4 = var2.field7357;
            }
        } else {
            var4 = var2.field7306;
        }
        return var4;
    }

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "(I)V", line = 55)
    public static void method770(int arg0) {
        if (arg0 != 0) {
            method770(-28);
        }
        field1368 = null;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZF)V", line = 70)
    public final void method9(boolean arg0, float arg1) {
        super.field10589 = arg1;
        if (arg0) {
            this.method9(true, 0.9649873F);
        }
        ++field1369;
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(Z)Lsr;", line = 81)
    public static final class540 method771(boolean arg0) {
        ++field1366;
        class540 var1 = class292.method1903((byte) -87);
        var1.field7708 = 0;
        var1.field7703 = null;
        if (arg0) {
            return null;
        } else {
            var1.field7707 = new class702(5000);
            return var1;
        }
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(ILgba;)V", line = 103)
    public static final void method772(int arg0, class702 arg1) {
        ++field1370;
        int var2 = 0;
        arg1.method3908(true);
        for (int var3 = 0; ~class472.field6857 < ~var3; ++var3) {
            int var15 = class96.field1419[var3];
            if (~(1 & class604.field8543[var15]) == -1) {
                if (var2 > 0) {
                    --var2;
                    class604.field8543[var15] = (byte) class112.method903(class604.field8543[var15], 2);
                } else {
                    int var16 = arg1.method3905(-4, 1);
                    if (var16 == 0) {
                        var2 = class759.method4225(78, arg1);
                        class604.field8543[var15] = (byte) class112.method903(class604.field8543[var15], 2);
                    } else {
                        class660.method3714(var15, arg1, (byte) -81);
                    }
                }
            }
        }
        arg1.method3909((byte) 102);
        if (~var2 != -1) {
            throw new RuntimeException("nsn0");
        } else {
            arg1.method3908(true);
            for (int var4 = 0; class472.field6857 > var4; ++var4) {
                int var13 = class96.field1419[var4];
                if ((1 & class604.field8543[var13]) != 0) {
                    if (~var2 < -1) {
                        --var2;
                        class604.field8543[var13] = (byte) class112.method903(class604.field8543[var13], 2);
                    } else {
                        int var14 = arg1.method3905(-4, 1);
                        if (~var14 == -1) {
                            var2 = class759.method4225(89, arg1);
                            class604.field8543[var13] = (byte) class112.method903(class604.field8543[var13], 2);
                        } else {
                            class660.method3714(var13, arg1, (byte) -58);
                        }
                    }
                }
            }
            arg1.method3909((byte) 91);
            if (var2 != 0) {
                throw new RuntimeException("nsn1");
            } else {
                arg1.method3908(true);
                for (int var5 = 0; ~var5 > ~class550.field7846; ++var5) {
                    int var11 = class289.field4443[var5];
                    if (~(class604.field8543[var11] & 1) != -1) {
                        if (~var2 < -1) {
                            class604.field8543[var11] = (byte) class112.method903(class604.field8543[var11], 2);
                            --var2;
                        } else {
                            int var12 = arg1.method3905(-4, 1);
                            if (var12 == 0) {
                                var2 = class759.method4225(80, arg1);
                                class604.field8543[var11] = (byte) class112.method903(class604.field8543[var11], 2);
                            } else if (class442.method2710(5, var11, arg1)) {
                                class604.field8543[var11] = (byte) class112.method903(class604.field8543[var11], 2);
                            }
                        }
                    }
                }
                arg1.method3909((byte) 93);
                if (~var2 != -1) {
                    throw new RuntimeException("nsn2");
                } else {
                    arg1.method3908(true);
                    for (int var6 = 0; ~var6 > ~class550.field7846; ++var6) {
                        int var9 = class289.field4443[var6];
                        if (~(1 & class604.field8543[var9]) == -1) {
                            if (~var2 < -1) {
                                --var2;
                                class604.field8543[var9] = (byte) class112.method903(class604.field8543[var9], 2);
                            } else {
                                int var10 = arg1.method3905(-4, 1);
                                if (var10 == 0) {
                                    var2 = class759.method4225(119, arg1);
                                    class604.field8543[var9] = (byte) class112.method903(class604.field8543[var9], 2);
                                } else if (class442.method2710(5, var9, arg1)) {
                                    class604.field8543[var9] = (byte) class112.method903(class604.field8543[var9], 2);
                                }
                            }
                        }
                    }
                    arg1.method3909((byte) -114);
                    if (var2 != 0) {
                        throw new RuntimeException("nsn3");
                    } else {
                        class472.field6857 = 0;
                        class550.field7846 = 0;
                        for (int var7 = 1; var7 < 2048; ++var7) {
                            class604.field8543[var7] = (byte) (class604.field8543[var7] >> 1);
                            class573 var8 = class279.field4271[var7];
                            if (var8 != null) {
                                class96.field1419[class472.field6857++] = var7;
                            } else {
                                class289.field4443[class550.field7846++] = var7;
                            }
                        }
                        if (arg0 <= 78) {
                            field1368 = null;
                        }
                    }
                }
            }
        }
    }
}
