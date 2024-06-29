import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class180 extends class145 {

    @OriginalMember(owner = "client!fq", name = "I", descriptor = "Lbo;")
    public static class355 field2637 = new class355();

    @OriginalMember(owner = "client!fq", name = "M", descriptor = "[J")
    public static long[] field2641 = new long[32];

    @OriginalMember(owner = "client!fq", name = "G", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!fq", name = "H", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!fq", name = "J", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!fq", name = "K", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!fq", name = "L", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!fq", name = "N", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZI)[[I", line = 3)
    public final int[][] method4(boolean arg0, int arg1) {
        ++field2642;
        int[][] var3 = super.field2217.method2549(arg1, 0);
        if (super.field2217.field5771) {
            int[][] var4 = this.method1121(arg1, 0, 2);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class156.field2364; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        if (!arg0) {
            method1327(28, 85, 62, 48, 55, (class289) null, -84, true, true, -53, false, -98);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)[I", line = 55)
    public final int[] method3(int arg0, int arg1) {
        ++field2640;
        int var3 = 106 / ((16 - arg1) / 49);
        int[] var4 = super.field2218.method1614(121, arg0);
        if (super.field2218.field3396) {
            int[] var5 = this.method1119(0, 0, arg0);
            for (int var6 = 0; class156.field2364 > var6; ++var6) {
                var4[var6] = -var5[var6] + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lap;BI)V", line = 88)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            super.field2205 = arg0.method1861((byte) -72) == 1;
        }
        ++field2639;
        int var4 = 8 / ((11 - arg1) / 52);
    }

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "(I)I", line = 101)
    public static final int method1326(int arg0) {
        ++field2635;
        if (!class94.field1369 && class415.field5808 > 0) {
            return class199.field2834 && class234.field3242[81] && ~class415.field5808 < -3 ? ((class63) class268.field3613.field2454.field5348.field5348).field962 : ((class63) class268.field3613.field2454.field5348).field962;
        } else {
            int var1 = class391.field5490;
            int var2 = class312.field4220;
            int var3 = class381.field5345;
            int var4 = class127.field1791;
            int var5 = class277.field3735;
            if (var3 < var1 && var1 < var3 + var5) {
                int var6 = -1;
                for (int var7 = 0; ~var7 > ~class415.field5808; ++var7) {
                    if (!class427.field6056) {
                        int var11 = (-1 - var7 + class415.field5808) * 16 + var4 + 31;
                        if (var11 + -13 < var2 && ~(var11 + 3) <= ~var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = var4 + 33 - -((-var7 + -1 + class415.field5808) * 16);
                        if (var2 > var12 + -13 && ~var2 >= ~(var12 - -3)) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class204 var9 = new class204(class268.field3613);
                    for (class63 var10 = (class63) var9.method1418((byte) 57); var10 != null; var10 = (class63) var9.method1421((byte) 74)) {
                        if (~(var8++) == ~var6) {
                            return var10.field962;
                        }
                    }
                }
            }
            int var13 = -103 / ((arg0 - 48) / 33);
            return -1;
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V", line = 189)
    public class180() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIIILap;IZZIZI)V", line = 196)
    public static final void method1327(int arg0, int arg1, int arg2, int arg3, int arg4, class289 arg5, int arg6, boolean arg7, boolean arg8, int arg9, boolean arg10, int arg11) {
        if (~arg6 != -2) {
            if (arg6 == 2) {
                arg1 = 1;
                arg3 = 1;
            } else if (~arg6 == -4) {
                arg1 = 1;
            }
        } else {
            arg3 = 1;
        }
        ++field2636;
        if (arg8) {
            field2637 = null;
        }
        if (~arg0 <= -1 && arg0 < class116.field1621 && arg2 >= 0 && class385.field5425 > arg2) {
            if (!arg7 && !arg10) {
                class7.field57[arg11][arg0][arg2] = 0;
            }
            while (true) {
                int var12 = arg5.method1861((byte) -72);
                if (~var12 == -1) {
                    if (!arg7) {
                        if (arg11 != 0) {
                            class44.field703[arg11][arg0 - -arg1][arg2 + arg3] = class44.field703[arg11 + -1][arg0 - -arg1][arg2 + arg3] + -240;
                            return;
                        } else {
                            class44.field703[0][arg0 - -arg1][arg2 + arg3] = 8 * -class161.method1207(arg4 + 556238, 127, arg9 + 932731);
                            return;
                        }
                    } else {
                        class44.field703[0][arg0 + arg1][arg2 - -arg3] = class265.field3566[0].method1509(arg0 - -arg1, arg2 + arg3);
                        return;
                    }
                }
                if (~var12 == -2) {
                    int var13 = arg5.method1861((byte) -72);
                    if (arg7) {
                        class44.field703[0][arg0 + arg1][arg2 + arg3] = class265.field3566[0].method1509(arg0 + arg1, arg2 + arg3) - -(var13 * 8);
                        return;
                    }
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg11 != 0) {
                        class44.field703[arg11][arg0 + arg1][arg2 + arg3] = class44.field703[arg11 + -1][arg0 + arg1][arg2 + arg3] + -(var13 * 8);
                        return;
                    }
                    class44.field703[0][arg0 + arg1][arg2 + arg3] = -var13 * 8;
                    return;
                }
                if (~var12 >= -50) {
                    if (arg10) {
                        arg5.method1861((byte) -72);
                    } else {
                        class236.field3283[arg11][arg0][arg2] = arg5.method1868((byte) -128);
                        class236.field3287[arg11][arg0][arg2] = (byte) ((var12 + -2) / 4);
                        class77.field1152[arg11][arg0][arg2] = (byte) class323.method2059(3, arg6 + -2 + var12);
                    }
                } else if (var12 <= 81) {
                    if (!arg7 && !arg10) {
                        class7.field57[arg11][arg0][arg2] = (byte) (var12 + -49);
                    }
                } else if (!arg10) {
                    class422.field5901[arg11][arg0][arg2] = (byte) (var12 + -81);
                }
            }
        } else {
            while (true) {
                int var14 = arg5.method1861((byte) -72);
                if (var14 == 0) {
                    return;
                }
                if (~var14 == -2) {
                    arg5.method1861((byte) -72);
                    return;
                }
                if (var14 <= 49) {
                    arg5.method1861((byte) -72);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "(I)V", line = 327)
    public static void method1328(int arg0) {
        if (arg0 == 4) {
            field2641 = null;
            field2637 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "([II[Ljava/lang/Object;BI)V", line = 338)
    public static final void method1329(int[] arg0, int arg1, Object[] arg2, byte arg3, int arg4) {
        int var5 = -52 / ((arg3 - 24) / 47);
        ++field2638;
        if (~arg4 > ~arg1) {
            int var6 = (arg4 - -arg1) / 2;
            int var7 = arg4;
            int var8 = arg0[var6];
            arg0[var6] = arg0[arg1];
            arg0[arg1] = var8;
            Object var9 = arg2[var6];
            arg2[var6] = arg2[arg1];
            arg2[arg1] = var9;
            for (int var10 = arg4; ~arg1 < ~var10; ++var10) {
                if ((1 & var10) + var8 > arg0[var10]) {
                    int var11 = arg0[var10];
                    arg0[var10] = arg0[var7];
                    arg0[var7] = var11;
                    Object var12 = arg2[var10];
                    arg2[var10] = arg2[var7];
                    arg2[var7++] = var12;
                }
            }
            arg0[arg1] = arg0[var7];
            arg0[var7] = var8;
            arg2[arg1] = arg2[var7];
            arg2[var7] = var9;
            method1329(arg0, var7 - 1, arg2, (byte) 106, arg4);
            method1329(arg0, arg1, arg2, (byte) -88, var7 - -1);
        }
    }
}
