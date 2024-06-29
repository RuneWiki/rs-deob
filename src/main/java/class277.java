import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class277 {

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Lfa;")
    private class312 field4283 = new class312();

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Ljh;")
    public static class207 field4275;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "Lfa;")
    private class312 field4285;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 4)
    public static final void method1817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class212 var20 = new class212(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class90.field1375[var21][arg1][arg2] == null) {
                    class90.field1375[var21][arg1][arg2] = new class174(var21, arg1, arg2);
                }
            }
            class90.field1375[arg0][arg1][arg2].field2648 = var20;
        } else if (arg3 == 1) {
            class212 var22 = new class212(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class90.field1375[var23][arg1][arg2] == null) {
                    class90.field1375[var23][arg1][arg2] = new class174(var23, arg1, arg2);
                }
            }
            class90.field1375[arg0][arg1][arg2].field2648 = var22;
        } else {
            class62 var24 = new class62(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class90.field1375[var25][arg1][arg2] == null) {
                    class90.field1375[var25][arg1][arg2] = new class174(var25, arg1, arg2);
                }
            }
            class90.field1375[arg0][arg1][arg2].field2657 = var24;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)I", line = 55)
    public final int method1818(byte arg0) {
        if (arg0 != 22) {
            return 1;
        }
        class312 var2 = this.field4283.field4944;
        field4279++;
        int var3 = 0;
        while (this.field4283 != var2) {
            var3++;
            var2 = var2.field4944;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)Lmd;", line = 80)
    public static final class17 method1819(byte arg0, int arg1) {
        class17 var2 = (class17) class283.field4351.method1294((long) arg1, 122);
        field4281++;
        int var3 = 27 / ((arg0 - 74) / 52);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class174.field2658.method2103(0, class199.method1339(arg1, true), class177.method1194(-16584, arg1));
        class17 var5 = new class17();
        var5.field196 = arg1;
        if (var4 != null) {
            var5.method137(new class303(var4), -123);
        }
        var5.method128(0);
        if (!class44.field622 && var5.field200) {
            var5.field217 = null;
        }
        if (var5.field213) {
            var5.field233 = 0;
            var5.field218 = false;
        }
        class283.field4351.method1292((long) arg1, 127, var5);
        return var5;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 115)
    public static void method1820(int arg0) {
        field4275 = null;
        if (arg0 != 0) {
            method1821(78, (class303) null);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILgn;)V", line = 127)
    public static final void method1821(int arg0, class303 arg1) {
        field4277++;
        int var2 = class221.field3521 >> 2 << 10;
        byte[][] var3 = new byte[class204.field3088][class129.field2021];
        int var4 = class266.field4099 >> 1;
        while (arg1.field4716.length > arg1.field4679) {
            int var5 = 0;
            int var6 = 0;
            boolean var7 = false;
            if (arg1.method2043((byte) -119) == 1) {
                var7 = true;
                var5 = arg1.method2043((byte) -106);
                var6 = arg1.method2043((byte) -116);
            }
            int var8 = arg1.method2043((byte) -119);
            int var9 = arg1.method2043((byte) -123);
            int var10 = class338.field5233 + class129.field2021 - (var9 * 64) - 1;
            int var11 = var8 * 64 - class78.field1161;
            if (var11 >= 0 && var10 - 63 >= 0 && class204.field3088 > var11 + 63 && class129.field2021 > var10) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var3[var11 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var7 || (var5 * 8) <= var12 && var12 < (var5 * 8 + 8) && var14 >= var6 * 8 && var14 < (var6 * 8 + 8)) {
                            var13[var10 - var14] = arg1.method2001(-3);
                        }
                    }
                }
            } else if (var7) {
                arg1.field4679 += 64;
            } else {
                arg1.field4679 += 4096;
            }
        }
        int var15 = class204.field3088;
        int var16 = class129.field2021;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var15 > var24) {
                    int var25 = var3[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class183 var26 = class79.method549((byte) -65, var25 - 1);
                        var17[var23] += var26.field2809;
                        var18[var23] += var26.field2810;
                        var21[var23] += var26.field2792;
                        var19[var23] += var26.field2793;
                        var10002 = var20[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var3[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class183 var29 = class79.method549((byte) -48, var28 - 1);
                        var17[var23] -= var29.field2809;
                        var18[var23] -= var29.field2810;
                        var21[var23] -= var29.field2792;
                        var19[var23] -= var29.field2793;
                        var10002 = var20[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int var30 = 0;
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int[][] var34 = class165.field2548[var22 >> 6];
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    int var38 = var36 - 5;
                    if (var16 > var37) {
                        var32 += var18[var37];
                        var31 += var17[var37];
                        var30 += var21[var37];
                        var33 += var19[var37];
                        var35 += var20[var37];
                    }
                    if (var38 >= 0) {
                        var32 -= var18[var38];
                        var35 -= var20[var38];
                        var31 -= var17[var38];
                        var30 -= var21[var38];
                        var33 -= var19[var38];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var34[var36 >> 6];
                        int var40 = var33 == 0 ? 0 : class30.method229(var30 / var35, var32 / var35, var31 * 256 / var33, 4138);
                        if (var3[var22][var36] != 0) {
                            int var41 = (var40 & 0x7F) + var4;
                            if (var39 == null) {
                                var39 = var34[var36 >> 6] = new int[4096];
                            }
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var2 + var40 & 0xFC00) - (-(var40 & 0x380) - var41);
                            var39[class311.method2135(63, var22) + (class311.method2135(var36, 63) << 6)] = class12.field129[class307.method2110(var42, 96, 3326)];
                        } else if (var39 != null) {
                            var39[class311.method2135(63, var22) + class311.method2135(var36 << 6, 4032)] = 0;
                        }
                    }
                }
            }
        }
        if (arg0 != 64512) {
            method1821(-86, (class303) null);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILjh;)V", line = 355)
    public static final void method1822(int arg0, class207 arg1) {
        if (class283.field4343 == arg1.field3159) {
            class2.field12[arg1.field3284] = true;
        }
        if (arg0 != 4096) {
            field4276 = -115;
        }
        field4282++;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)Lfa;", line = 384)
    public final class312 method1823(byte arg0) {
        field4274++;
        if (arg0 != -128) {
            this.field4283 = (class312) null;
        }
        class312 var2 = this.field4285;
        if (this.field4283 == var2) {
            this.field4285 = null;
            return null;
        } else {
            this.field4285 = var2.field4944;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lfa;B)V", line = 406)
    public final void method1824(class312 arg0, byte arg1) {
        if (arg0.field4936 != null) {
            arg0.method2143((byte) 125);
        }
        arg0.field4936 = this.field4283.field4936;
        field4273++;
        arg0.field4944 = this.field4283;
        arg0.field4936.field4944 = arg0;
        arg0.field4944.field4936 = arg0;
        int var3 = 14 / ((arg1 + 41) / 60);
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)Lfa;", line = 424)
    public final class312 method1825(byte arg0) {
        int var2 = -95 % ((arg0 - 42) / 41);
        field4284++;
        class312 var3 = this.field4283.field4944;
        if (this.field4283 == var3) {
            return null;
        } else {
            var3.method2143((byte) 125);
            return var3;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)Lfa;", line = 446)
    public final class312 method1826(int arg0) {
        int var2 = 118 / ((-arg0 - 48) / 62);
        class312 var3 = this.field4283.field4944;
        field4278++;
        if (this.field4283 == var3) {
            this.field4285 = null;
            return null;
        } else {
            this.field4285 = var3.field4944;
            return var3;
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)I", line = 464)
    public static final int method1827(int arg0) {
        field4271++;
        class46.field645 = arg0;
        return class307.method2116(32);
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V", line = 474)
    public final void method1828(int arg0) {
        field4272++;
        while (true) {
            class312 var2 = this.field4283.field4944;
            if (this.field4283 == var2) {
                this.field4285 = null;
                if (arg0 != -5) {
                    this.method1826(-98);
                }
                return;
            }
            var2.method2143((byte) 125);
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V", line = 499)
    public class277() {
        this.field4283.field4936 = this.field4283;
        this.field4283.field4944 = this.field4283;
    }
}
