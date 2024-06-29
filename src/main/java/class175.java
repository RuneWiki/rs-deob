import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class175 extends class89 {

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "I")
    private int field3151;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    public static int field3149 = 0;

    @OriginalMember(owner = "client!pg", name = "cb", descriptor = "[I")
    public static int[] field3156 = new int[100];

    @OriginalMember(owner = "client!pg", name = "ab", descriptor = "I")
    public static int field3154 = 0;

    @OriginalMember(owner = "client!pg", name = "db", descriptor = "Lrk;")
    public static class179 field3157 = null;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!pg", name = "bb", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!pg", name = "eb", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public static void method1254(int arg0) {
        field3157 = null;
        field3156 = null;
        if (arg0 != 1) {
            method1260(120, (byte) -5);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lwe;I)V")
    public static final void method1255(class75 arg0, int arg1) {
        byte[] var2 = new byte[24];
        ++field3145;
        if (class66.field1115 != null) {
            try {
                int var3 = 0;
                class66.field1115.method1736(109, 0L);
                class66.field1115.method1734(var2, 0);
                while (~var3 > -25 && ~var2[var3] == -1) {
                    ++var3;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; ~var4 > -25; ++var4) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method555(24, 778443592, var2, 0);
        if (arg1 != -23066) {
            method1259(90, (byte) -99);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILpi;IZII)V")
    public static final void method1256(int arg0, int arg1, class181 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class118.field2202 = arg5;
        class111.field2110 = arg2;
        ++field3158;
        if (arg1 != 17085) {
            field3154 = 91;
        }
        class217.field3838 = arg3;
        class76.field1427 = 1;
        class83.field1600 = arg6;
        class109.field2032 = arg0;
        class206.field3697 = arg4;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        int[] var3 = super.field1688.method936(1, arg0);
        if (super.field1688.field2200) {
            class104.method787(var3, 0, class241.field4284, this.field3151);
        }
        int var4 = 32 / ((arg1 - 51) / 44);
        ++field3150;
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)I")
    public static final int method1257(int arg0, int arg1) {
        ++field3152;
        return arg0 > -90 ? 42 : arg1 & 127;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIILj;Lj;IIJ)V")
    public static final void method1258(int arg0, int arg1, int arg2, int arg3, class139 arg4, class139 arg5, int arg6, int arg7, long arg8) {
        if (arg4 != null || arg5 != null) {
            class255 var10 = new class255();
            var10.field4464 = arg8;
            var10.field4469 = arg1 * 128 + 64;
            var10.field4460 = arg2 * 128 + 64;
            var10.field4472 = arg3;
            var10.field4466 = arg4;
            var10.field4463 = arg5;
            var10.field4468 = arg6;
            var10.field4473 = arg7;
            for (int var11 = arg0; var11 >= 0; --var11) {
                if (class111.field2080[var11][arg1][arg2] == null) {
                    class111.field2080[var11][arg1][arg2] = new class201(var11, arg1, arg2);
                }
            }
            class111.field2080[arg0][arg1][arg2].field3589 = var10;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(IB)Z")
    public static final boolean method1259(int arg0, byte arg1) {
        ++field3155;
        if (class139.field2492[arg0]) {
            return true;
        } else if (!class168.field2972.method1314(arg0, 19609)) {
            return false;
        } else {
            int var2 = class168.field2972.method1327(false, arg0);
            if (var2 == 0) {
                class139.field2492[arg0] = true;
                return true;
            } else {
                if (arg1 <= 32) {
                    method1256(49, -65, (class181) null, 97, true, 71, 90);
                }
                if (class215.field3809[arg0] == null) {
                    class215.field3809[arg0] = new class24[var2];
                }
                for (int var3 = 0; ~var3 > ~var2; ++var3) {
                    if (class215.field3809[arg0][var3] == null) {
                        byte[] var4 = class168.field2972.method1293(var3, arg0, (byte) 125);
                        if (var4 != null) {
                            class215.field3809[arg0][var3] = new class24();
                            class215.field3809[arg0][var3].field374 = (arg0 << 16) + var3;
                            if (var4[0] == -1) {
                                class215.field3809[arg0][var3].method169((byte) -108, new class75(var4));
                            } else {
                                class215.field3809[arg0][var3].method176(new class75(var4), (byte) 0);
                            }
                        }
                    }
                }
                class139.field2492[arg0] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(IB)Lg;")
    public static final class225 method1260(int arg0, byte arg1) {
        class225 var2 = (class225) class260.field4538.method1364((long) arg0, -21987);
        ++field3146;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class108.field2022.method1293(0, arg0, (byte) -91);
            if (var3 == null) {
                return null;
            } else {
                class225 var4 = new class225();
                class75 var5 = new class75(var3);
                var5.field1380 = var5.field1368.length + -2;
                int var6 = var5.method545((byte) -112);
                int var7 = var5.field1368.length - 2 + -var6 - 12;
                var5.field1380 = var7;
                int var8 = var5.method562((byte) -71);
                var4.field3933 = var5.method545((byte) -57);
                var4.field3924 = var5.method545((byte) 67);
                var4.field3928 = var5.method545((byte) 69);
                var4.field3925 = var5.method545((byte) -116);
                int var9 = var5.method558(1);
                if (~var9 < -1) {
                    var4.field3935 = new class235[var9];
                    for (int var10 = 0; var9 > var10; ++var10) {
                        int var11 = var5.method545((byte) 121);
                        class235 var12 = new class235(class127.method987(var11, 1868387312));
                        var4.field3935[var10] = var12;
                        while (~(var11--) < -1) {
                            int var13 = var5.method562((byte) -71);
                            int var14 = var5.method562((byte) -71);
                            var12.method1597((long) var13, (byte) -126, new class176(var14));
                        }
                    }
                }
                var5.field1380 = 0;
                int var15 = 0;
                var4.field3923 = var5.method568((byte) 84);
                var4.field3932 = new int[var8];
                var4.field3926 = new class46[var8];
                var4.field3930 = new int[var8];
                while (var7 > var5.field1380) {
                    int var16 = var5.method545((byte) 83);
                    if (~var16 != -4) {
                        if (var16 < 100 && var16 != 21 && ~var16 != -39 && ~var16 != -40) {
                            var4.field3932[var15] = var5.method562((byte) -71);
                        } else {
                            var4.field3932[var15] = var5.method558(1);
                        }
                    } else {
                        var4.field3926[var15] = var5.method577(0);
                    }
                    var4.field3930[var15++] = var16;
                }
                class260.field4538.method1366(true, var4, (long) arg0);
                if (arg1 >= -126) {
                    return null;
                } else {
                    return var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        ++field3148;
        if (arg2 == 0) {
            this.field3151 = (arg0.method558(arg1 + 641641493) << 12) / 255;
        }
        if (arg1 != -641641492) {
            this.field3151 = 96;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(I)V")
    private class175(int arg0) {
        super(0, true);
        this.field3151 = 4096;
        this.field3151 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
    public static final void method1261(int arg0, int arg1) {
        ++field3153;
        if (arg0 == 64) {
            class146 var2 = class6.method22((byte) 16, 8, arg1);
            var2.method1082((byte) -119);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZLcb;I)V")
    public static final void method1262(boolean arg0, class31 arg1, int arg2) {
        ++field3147;
        int var3 = (int) arg1.field1195;
        if (arg2 == 24) {
            int var4 = arg1.field582;
            arg1.method501(0);
            if (arg0) {
                class24.method165(var4, true);
            }
            class128.method991((byte) 112, var4);
            class24 var5 = class13.method73(1506528624, var3);
            if (var5 != null) {
                class226.method1549(false, var5);
            }
            int var6 = class242.field4290;
            for (int var7 = 0; ~var6 < ~var7; ++var7) {
                if (class261.method1746(class215.field3807[var7], (byte) -127)) {
                    class2.method3(var7, 2638);
                }
            }
            if (~class242.field4290 != -2) {
                class109.method861(0, class187.field3345, class270.field4707, class109.field2062, class248.field4378);
                int var8 = class190.field3384.method153(class196.field3506);
                for (int var9 = 0; ~var9 > ~class242.field4290; ++var9) {
                    int var10 = class190.field3384.method153(class155.method1147((byte) -46, var9));
                    if (var8 < var10) {
                        var8 = var10;
                    }
                }
                class248.field4378 = var8 - -8;
                class270.field4707 = class242.field4290 * 15 + 22;
            } else {
                class222.field3910 = false;
                class109.method861(0, class187.field3345, class270.field4707, class109.field2062, class248.field4378);
            }
            if (class114.field2157 != -1) {
                class32.method211(1, class114.field2157, 31083);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class175() {
        this(4096);
    }
}
