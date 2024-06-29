import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class236 extends class224 {

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "Z")
    public static boolean field3776 = false;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    public static int field3774 = 0;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "[Z")
    public static boolean[] field3788 = new boolean[100];

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "Ldl;")
    public static class123 field3775;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "[I")
    public static int[] field3777;

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class236() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static final void method1599(byte arg0) {
        if (~class39.field530 > -129) {
            class39.field530 = 128;
        }
        ++field3787;
        class29.field392 &= 2047;
        int var1 = class250.field4000 >> 7;
        int var2 = class269.field4288 >> 7;
        if (class39.field530 > 383) {
            class39.field530 = 383;
        }
        int var3 = 0;
        int var4 = class99.method658(class269.field4288, class276.field4398, class250.field4000, -7185);
        if (~var1 < -4 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var1 + 4 >= var5; ++var5) {
                for (int var6 = var2 + -4; var6 <= var2 + 4; ++var6) {
                    int var7 = class276.field4398;
                    if (~var7 > -4 && ~(2 & class35.field449[1][var5][var6]) == -3) {
                        ++var7;
                    }
                    int var8 = (class253.field4065[var7][var5][var6] & 255) * 8 + -class200.field3128[var7][var5][var6] + var4;
                    if (~var3 > ~var8) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (~var9 < -98049) {
            var9 = 98048;
        }
        int var10 = 56 % ((25 - arg0) / 50);
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 <= class231.field3719) {
            if (~class231.field3719 < ~var9) {
                class231.field3719 += (var9 - class231.field3719) / 80;
                return;
            }
        } else {
            class231.field3719 += (-class231.field3719 + var9) / 24;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ldl;Ldl;ZLcg;B)V")
    public static final void method1600(class123 arg0, class123 arg1, boolean arg2, class166 arg3, byte arg4) {
        class152.field2249 = arg0;
        class130.field1898 = arg2;
        class37.field493 = arg1;
        int var5 = -1 + class37.field493.method812(-36);
        ++field3781;
        class98.field1529 = var5 * 256 - -class37.field493.method820(var5, 112);
        class38.field522 = arg3;
        class3.field39 = new String[] { null, null, null, null, class130.field1911 };
        class231.field3721 = new String[] { null, null, class72.field1017, null, null };
        if (arg4 < 10) {
            method1599((byte) 52);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field3784;
        int[][] var3 = super.field3616.method1341(false, arg0);
        if (arg1 != 1) {
            field3780 = 91;
        }
        if (super.field3616.field3042) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class78.field1108; ++var7) {
                this.method1603(var7, arg0, 32631);
                int[][] var8 = this.method1532(arg1 + 31, 0, class40.field547);
                var4[var7] = var8[0][class247.field3958];
                var5[var7] = var8[1][class247.field3958];
                var6[var7] = var8[2][class247.field3958];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg2 > -46) {
            method1600((class123) null, (class123) null, true, (class166) null, (byte) -90);
        }
        if (~arg1 == -1) {
            super.field3624 = arg0.method201(255) == 1;
        }
        ++field3783;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(Z)V")
    public static final void method1601(boolean arg0) {
        ++field3782;
        class270.field4300.method516(-29395);
        if (!arg0) {
            method1599((byte) 19);
        }
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class60.field847[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; ++var2) {
            class243.field3889[var2] = 0L;
        }
        class276.field4396 = 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIILdl;)Lwe;")
    public static final class15 method1602(int arg0, int arg1, int arg2, class123 arg3) {
        ++field3779;
        if (!class214.method1445((byte) 117, arg3, arg2, arg0)) {
            return null;
        } else {
            if (arg1 != 1) {
                method1604(-8, 84, 18);
            }
            return class225.method1535(-28385);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field3778;
            int[] var3 = super.field3625.method1862(arg0, (byte) 52);
            if (super.field3625.field4425) {
                for (int var4 = 0; class78.field1108 > var4; ++var4) {
                    this.method1603(var4, arg0, 32631);
                    int[] var5 = this.method1527(class40.field547, 0, (byte) 84);
                    var3[var4] = var5[class247.field3958];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(III)V")
    private final void method1603(int arg0, int arg1, int arg2) {
        ++field3786;
        int var4 = class251.field4018[arg1];
        int var5 = class243.field3893[arg0];
        float var6 = (float) Math.atan2((double) (var5 - 2048), (double) (var4 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class247.field3958 = arg0;
            class40.field547 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class40.field547 = arg0;
            class247.field3958 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class247.field3958 = -arg1 + class78.field1108;
            class40.field547 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class40.field547 = -arg1 + class36.field471;
            class247.field3958 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class247.field3958 = -arg0 + class78.field1108;
            class40.field547 = class36.field471 - arg1;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class40.field547 = -arg0 + class36.field471;
            class247.field3958 = -arg1 + class78.field1108;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class247.field3958 = arg1;
            class40.field547 = class36.field471 - arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class40.field547 = arg1;
            class247.field3958 = class78.field1108 - arg0;
        }
        if (arg2 != 32631) {
            field3788 = null;
        }
        class40.field547 &= class261.field4217;
        class247.field3958 &= class206.field3220;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(III)V")
    public static final void method1604(int arg0, int arg1, int arg2) {
        ++field3785;
        class170 var3 = class163.method1117((byte) -7, arg0);
        int var4 = var3.field2672;
        int var5 = var3.field2661;
        int var6 = var3.field2660;
        if (arg1 != -17396) {
            field3775 = null;
        }
        int var7 = class146.field2150[-var5 + var6];
        if (~arg2 > -1 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class31.method254(65280, var4, class258.field4166[var4] & ~var8 | arg2 << var5 & var8);
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V")
    public static void method1605(int arg0) {
        field3788 = null;
        field3775 = null;
        field3777 = null;
        if (arg0 > -115) {
            method1605(-4);
        }
    }
}
