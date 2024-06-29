import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class146 extends class452 {

    @OriginalMember(owner = "client!jh", name = "Gb", descriptor = "Lpr;")
    public static class407 field1637 = new class407(54, -1);

    @OriginalMember(owner = "client!jh", name = "Jb", descriptor = "Lpr;")
    public static class407 field1640 = new class407(24, 8);

    @OriginalMember(owner = "client!jh", name = "Kb", descriptor = "Lfv;")
    public static class108 field1641 = new class108(6, 0, 4, 2);

    @OriginalMember(owner = "client!jh", name = "Db", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!jh", name = "Eb", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!jh", name = "Fb", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!jh", name = "Hb", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!jh", name = "Ib", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!jh", name = "Lb", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IF)V", line = 3)
    public final void method796(int arg0, float arg1) {
        ++field1636;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field6209[super.field6215++] = (byte) var3;
        if (arg0 != 6144) {
            method799(-94, -107);
        }
        super.field6209[super.field6215++] = (byte) (var3 >> 8);
        super.field6209[super.field6215++] = (byte) (var3 >> 16);
        super.field6209[super.field6215++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(FB)V", line = 20)
    public final void method797(float arg0, byte arg1) {
        ++field1638;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field6209[super.field6215++] = (byte) (var3 >> 24);
        super.field6209[super.field6215++] = (byte) (var3 >> 16);
        int var4 = 117 / ((arg1 - 37) / 45);
        super.field6209[super.field6215++] = (byte) (var3 >> 8);
        super.field6209[super.field6215++] = (byte) var3;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V", line = 36)
    public class146(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lfp;BIII)V", line = 39)
    public static final void method798(class292 arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -86) {
            method800(-7, (byte[][]) null, (class420) null);
        }
        ++field1634;
        class468 var5 = arg0.method1653(1);
        int var6 = arg0.field3749 - arg0.field3765.field3532 & 16383;
        if (~arg4 != 0) {
            if (~arg0.field3803 != 0 && (~var6 <= -10241 || ~var6 >= -2049)) {
                int var7 = class529.field7537[arg2] + -arg0.field3765.field3532 & 16383;
                arg0.field3779 = false;
                if (~arg4 == -3 && var5.field6507 != -1) {
                    if (var7 > 2048 && ~var7 >= -6145 && ~var5.field6489 != 0) {
                        arg0.field3782 = var5.field6489;
                    } else if (~var7 <= -10241 && ~var7 > -14337 && ~var5.field6520 != 0) {
                        arg0.field3782 = var5.field6520;
                    } else if (~var7 < -6145 && ~var7 > -10241 && var5.field6504 != -1) {
                        arg0.field3782 = var5.field6504;
                    } else {
                        arg0.field3782 = var5.field6507;
                    }
                } else if (~arg4 == -1 && ~var5.field6486 != 0) {
                    if (~var7 < -2049 && var7 <= 6144 && ~var5.field6491 != 0) {
                        arg0.field3782 = var5.field6491;
                    } else if (~var7 <= -10241 && ~var7 > -14337 && ~var5.field6523 != 0) {
                        arg0.field3782 = var5.field6523;
                    } else if (~var7 < -6145 && var7 < 10240 && ~var5.field6485 != 0) {
                        arg0.field3782 = var5.field6485;
                    } else {
                        arg0.field3782 = var5.field6486;
                    }
                } else if (~var7 < -2049 && ~var7 >= -6145 && ~var5.field6519 != 0) {
                    arg0.field3782 = var5.field6519;
                } else if (~var7 <= -10241 && var7 < 14336 && var5.field6529 != -1) {
                    arg0.field3782 = var5.field6529;
                } else if (~var7 < -6145 && ~var7 > -10241 && ~var5.field6482 != 0) {
                    arg0.field3782 = var5.field6482;
                } else {
                    arg0.field3782 = var5.field6528;
                }
            } else if (var6 == 0 && ~arg0.field3781 >= -26) {
                if (arg4 == 2 && ~var5.field6507 != 0) {
                    arg0.field3782 = var5.field6507;
                } else if (arg4 == 0 && var5.field6486 != -1) {
                    arg0.field3782 = var5.field6486;
                } else {
                    arg0.field3782 = var5.field6528;
                }
                arg0.field3779 = false;
            } else {
                if (arg4 == 2 && var5.field6507 != -1) {
                    if (~arg3 > -1 && var5.field6499 != -1) {
                        arg0.field3782 = var5.field6499;
                    } else if (arg3 > 0 && var5.field6487 != -1) {
                        arg0.field3782 = var5.field6487;
                    } else {
                        arg0.field3782 = var5.field6507;
                    }
                } else if (~arg4 == -1 && var5.field6486 != -1) {
                    if (~arg3 > -1 && var5.field6527 != -1) {
                        arg0.field3782 = var5.field6527;
                    } else if (arg3 > 0 && ~var5.field6488 != 0) {
                        arg0.field3782 = var5.field6488;
                    } else {
                        arg0.field3782 = var5.field6486;
                    }
                } else if (~arg3 > -1 && ~var5.field6503 != 0) {
                    arg0.field3782 = var5.field6503;
                } else if (arg3 > 0 && var5.field6524 != -1) {
                    arg0.field3782 = var5.field6524;
                } else {
                    arg0.field3782 = var5.field6528;
                }
                arg0.field3779 = false;
            }
        } else if (~var6 == -1 && arg0.field3781 <= 25) {
            if (!arg0.field3779 || !var5.method2651(arg0.field3782, -31)) {
                arg0.field3782 = var5.method2653((byte) 100);
                arg0.field3779 = ~arg0.field3782 != 0;
            }
        } else {
            arg0.field3779 = false;
            if (arg3 < 0 && ~var5.field6511 != 0) {
                arg0.field3782 = var5.field6511;
            } else if (~arg3 < -1 && ~var5.field6484 != 0) {
                arg0.field3782 = var5.field6484;
            } else {
                arg0.field3782 = var5.field6528;
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "(II)I", line = 200)
    public static final int method799(int arg0, int arg1) {
        ++field1635;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg1 >= -110) {
            method801(false);
        }
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[[BLnq;)V", line = 217)
    public static final void method800(int arg0, byte[][] arg1, class420 arg2) {
        ++field1639;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        for (int var5 = 0; ~var4 < ~var5; ++var5) {
            byte[] var11 = arg1[var5];
            if (var11 != null) {
                class452 var12 = new class452(var11);
                int var13 = class287.field3696[var5] >> 8;
                int var14 = class287.field3696[var5] & 255;
                int var15 = var13 * 64 + -class682.field9685;
                int var16 = var14 * 64 - field1642;
                class73.method470((byte) 84);
                arg2.method2604(class475.field6919, var12, field1642, class682.field9685, var15, var16, 1283);
                arg2.method2270(var12, class453.field6284, var15, var16, var3, 109);
                if (!arg2.field6377 && class65.field687 / 8 == var13 && class311.field4022 / 8 == var14 && var3[0] != -1) {
                    class309.field4008 = class196.field2366.method547(var3[1], class246.field3174, var3[3], (byte) -105, var3[0], var3[2]);
                    class554.field7898 = var3[4];
                }
            }
        }
        int var6 = -33 / (-arg0 / 33);
        for (int var7 = 0; ~var4 < ~var7; ++var7) {
            int var8 = (class287.field3696[var7] >> 8) * 64 + -class682.field9685;
            int var9 = (class287.field3696[var7] & 255) * 64 + -field1642;
            byte[] var10 = arg1[var7];
            if (var10 == null && class311.field4022 < 800) {
                class73.method470((byte) 84);
                arg2.method2601(var8, 64, 0, 64, var9);
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(Z)V", line = 292)
    public static void method801(boolean arg0) {
        field1641 = null;
        field1640 = null;
        field1637 = null;
        if (!arg0) {
            method798((class292) null, (byte) 8, 104, 43, 40);
        }
    }
}
