import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class453 extends class326 {

    @OriginalMember(owner = "client!dq", name = "U", descriptor = "I")
    public static int field6150 = 1;

    @OriginalMember(owner = "client!dq", name = "N", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!dq", name = "O", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!dq", name = "Q", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!dq", name = "S", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!dq", name = "T", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!dq", name = "V", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!dq", name = "W", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!dq", name = "X", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!dq", name = "Y", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!dq", name = "Z", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!dq", name = "R", descriptor = "Lwm;")
    public static class364 field6147;

    @OriginalMember(owner = "client!dq", name = "P", descriptor = "[I")
    public static int[] field6145;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(II)I", line = 5)
    public static final int method2656(int arg0, int arg1) {
        ++field6151;
        return arg0 != -1633151289 ? 111 : arg1 >>> 7;
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(Z)V", line = 16)
    public static void method2657(boolean arg0) {
        if (!arg0) {
            field6147 = null;
        }
        field6147 = null;
        field6145 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIII)Z", line = 29)
    public static final boolean method2658(int arg0, int arg1, int arg2, int arg3) {
        if (!class17.method110(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << class302.field4025;
            int var5 = arg2 << class302.field4025;
            return class472.method2772(var4 + 1, class221.field2945[arg0].method371(arg1, arg2) + arg3, var5 + 1) && class472.method2772(class230.field3020 + var4 - 1, class221.field2945[arg0].method371(arg1 + 1, arg2) + arg3, var5 + 1) && class472.method2772(class230.field3020 + var4 - 1, class221.field2945[arg0].method371(arg1 + 1, arg2 + 1) + arg3, class230.field3020 + var5 - 1) && class472.method2772(var4 + 1, class221.field2945[arg0].method371(arg1, arg2 + 1) + arg3, class230.field3020 + var5 - 1);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILnk;I)V", line = 44)
    public static final void method2659(int arg0, int arg1, class464 arg2, int arg3) {
        ++field6143;
        if (arg1 != 82) {
            method2658(34, -34, 27, -29);
        }
        class162.field2257 = arg2;
        class450.field6117 = arg0;
        class87.field1216 = arg3;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILbt;I)V", line = 59)
    public final void method33(int arg0, class32 arg1, int arg2) {
        ++field6148;
        if (arg2 >= -3) {
            field6150 = 65;
        }
        if (~arg0 == -1) {
            super.field4358 = ~arg1.method201((byte) -119) == -2;
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V", line = 74)
    public class453() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(IIII)V", line = 77)
    public static final void method2660(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == arg3) {
            ++class143.field2077;
            class491.method2861(class263.field3500, 1);
        }
        ++field6154;
        if (arg3 == 1) {
            ++class271.field3613;
            class491.method2861(class137.field1989, 1);
        }
        class203.field2751.method213((byte) 126, !class449.field6111.method882((byte) 76, 82) ? 0 : 1);
        class203.field2751.method229(class162.field2260 + arg1, 1309449544);
        class203.field2751.method216(class266.field3511 + arg2, -1);
        class187.field2565 = false;
        class345.field4761 = arg1;
        class124.field1817 = arg2;
        class1.method5(true);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BI)[I", line = 105)
    public final int[] method30(byte arg0, int arg1) {
        ++field6152;
        int[] var3 = super.field4344.method130(arg1, 54);
        if (super.field4344.field286) {
            int[] var4 = this.method1824(0, false, arg1);
            for (int var5 = 0; ~var5 > ~class181.field2495; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        if (arg0 > -6) {
            field6145 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(IB)[[I", line = 138)
    public final int[][] method48(int arg0, byte arg1) {
        if (arg1 >= -52) {
            return null;
        } else {
            ++field6149;
            int[][] var3 = super.field4343.method2356(arg0, 125);
            if (super.field4343.field5336) {
                int[][] var4 = this.method1828(0, true, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class181.field2495 > var11; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = -var7[var11] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lbu;I[[B)V", line = 186)
    public static final void method2661(class17 arg0, int arg1, byte[][] arg2) {
        for (int var3 = 0; arg0.field6813 > var3; ++var3) {
            class183.method1073(-1);
            for (int var4 = 0; var4 < class295.field3947 >> 3; ++var4) {
                for (int var5 = 0; ~var5 > ~(class39.field567 >> 3); ++var5) {
                    int var6 = class137.field1993[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 63719305) >> 24;
                        if (!arg0.field6802 || var7 == 0) {
                            int var8 = (var6 & 6) >> 1;
                            int var9 = var6 >> 14 & 1023;
                            int var10 = (16380 & var6) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; ~class306.field4050.length < ~var12; ++var12) {
                                if (class306.field4050[var12] == var11 && arg2[var12] != null) {
                                    arg0.method111(var8, var7, var3, (var9 & 7) * 8, arg2[var12], (byte) -24, var4 * 8, class98.field1432, class60.field805, var5 * 8, (7 & var10) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 >= -37) {
            method2661((class17) null, -123, (byte[][]) null);
        }
        ++field6146;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)Las;", line = 263)
    public static final class95 method2662(byte arg0) {
        ++field6153;
        try {
            return new class275();
        } catch (Throwable var2) {
            if (arg0 >= -113) {
                field6144 = -47;
            }
            try {
                return (class95) Class.forName("op").newInstance();
            } catch (Throwable var1) {
                return new class22();
            }
        }
    }
}
