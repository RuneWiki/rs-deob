import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class194 extends class463 {

    @OriginalMember(owner = "client!tf", name = "Fb", descriptor = "[Lid;")
    public static class415[] field2501 = new class415[14];

    @OriginalMember(owner = "client!tf", name = "Rb", descriptor = "Lap;")
    public static class335 field2513 = new class335("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!tf", name = "Gb", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!tf", name = "Hb", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!tf", name = "Ib", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!tf", name = "Jb", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!tf", name = "Kb", descriptor = "I")
    private int field2506;

    @OriginalMember(owner = "client!tf", name = "Lb", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!tf", name = "Mb", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!tf", name = "Nb", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!tf", name = "Ob", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!tf", name = "Pb", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!tf", name = "Qb", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!tf", name = "Sb", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!tf", name = "Ub", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!tf", name = "Tb", descriptor = "Ljq;")
    private class356 field2515;

    @OriginalMember(owner = "client!tf", name = "Vb", descriptor = "[[[I")
    public static int[][][] field2517;

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(I)V", line = 8)
    public class194(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILfh;)Lom;", line = 13)
    public static final class253 method1193(int arg0, class463 arg1) {
        ++field2510;
        if (arg0 != 0) {
            method1203();
        }
        return new class253(arg1.method2791(true), arg1.method2791(true), arg1.method2791(true), arg1.method2791(true), arg1.method2791(true), arg1.method2791(true), arg1.method2791(true), arg1.method2791(true), arg1.method2738(-87), arg1.method2737(false));
    }

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "(Z)I", line = 24)
    public final int method1194(boolean arg0) {
        ++field2516;
        if (!arg0) {
            this.method1197(66);
        }
        int var2 = super.field6618[super.field6631++] + -this.field2515.method2038(false) & 255;
        return ~var2 > -129 ? var2 : (var2 + -128 << 8) + (255 & super.field6618[super.field6631++] - this.field2515.method2038(false));
    }

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "(I)V", line = 42)
    public static void method1195(int arg0) {
        if (arg0 > 71) {
            field2513 = null;
            field2517 = null;
            field2501 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([IZ)V", line = 54)
    public final void method1196(int[] arg0, boolean arg1) {
        if (arg1) {
            field2501 = null;
        }
        ++field2504;
        this.field2515 = new class356(arg0);
    }

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "(I)Z", line = 66)
    public final boolean method1197(int arg0) {
        if (arg0 != 32348) {
            this.method1197(-123);
        }
        ++field2514;
        int var2 = super.field6618[super.field6631] - this.field2515.method2039(-121) & 255;
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(BI)I", line = 88)
    public final int method1198(byte arg0, int arg1) {
        ++field2502;
        if (arg0 >= -41) {
            this.method1204(false);
        }
        return arg1 * 8 + -this.field2506;
    }

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "(II)I", line = 99)
    public final int method1199(int arg0, int arg1) {
        ++field2505;
        if (arg0 != 30304) {
            return -95;
        } else {
            int var3 = this.field2506 >> 3;
            int var4 = -(this.field2506 & 7) + 8;
            this.field2506 += arg1;
            int var5 = 0;
            while (var4 < arg1) {
                var5 += (super.field6618[var3++] & class27.field386[var4]) << -var4 + arg1;
                arg1 -= var4;
                var4 = 8;
            }
            int var6;
            if (arg1 == var4) {
                var6 = (super.field6618[var3] & class27.field386[var4]) + var5;
            } else {
                var6 = (super.field6618[var3] >> -arg1 + var4 & class27.field386[arg1]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIIII)V", line = 133)
    public static final void method1200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 != 3827) {
            method1203();
        }
        ++field2511;
        if (arg1 >= 1 && arg6 >= 1 && ~(class452.field6526 + -2) <= ~arg1 && ~arg6 >= ~(class440.field6307 + -2)) {
            int var9 = arg2;
            if (arg2 < 3 && class256.method1538(2, arg1, arg6)) {
                var9 = arg2 + 1;
            }
            if (!class407.field5817.method580(class377.field4959, (byte) -35) && !class471.method2842(var9, (byte) -117, arg1, class415.field5926, arg6)) {
                return;
            }
            if (class125.field1664 == null) {
                return;
            }
            class532.field7825.method20(arg5, arg6, 2592, arg2, class33.field416, class172.field2185[arg2], arg1);
            if (arg7 >= 0) {
                boolean var10 = class407.field5817.field3618;
                class407.field5817.field3618 = true;
                class532.field7825.method18(arg0, arg6, arg8, arg7, arg2, class172.field2185[arg2], class33.field416, var9, arg4, -32, arg1);
                class407.field5817.field3618 = var10;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[B)[B", line = 175)
    public static final byte[] method1201(int arg0, int arg1, byte[] arg2) {
        ++field2503;
        byte[] var3 = new byte[arg1];
        class318.method1875(arg2, 0, var3, 0, arg1);
        return arg0 > -91 ? null : var3;
    }

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "(I)V", line = 197)
    public final void method1202(int arg0) {
        ++field2508;
        super.field6631 = (this.field2506 - arg0) / 8;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()V", line = 205)
    public static final void method1203() {
        if (class38.field506 != null) {
            for (int var0 = 0; var0 < class38.field506.length; ++var0) {
                for (int var1 = 0; var1 < class470.field6825; ++var1) {
                    for (int var2 = 0; var2 < class105.field1336; ++var2) {
                        if (class38.field506[var0][var1][var2] != null) {
                            class38.field506[var0][var1][var2].method2971((byte) 0);
                        }
                        class38.field506[var0][var1][var2] = null;
                    }
                }
            }
        }
        class38.field506 = null;
        class531.field7811 = null;
        if (class159.field2027 != null) {
            for (int var3 = 0; var3 < class159.field2027.length; ++var3) {
                for (int var4 = 0; var4 < class470.field6825; ++var4) {
                    for (int var5 = 0; var5 < class105.field1336; ++var5) {
                        if (class159.field2027[var3][var4][var5] != null) {
                            class159.field2027[var3][var4][var5].method2971((byte) 0);
                        }
                        class159.field2027[var3][var4][var5] = null;
                    }
                }
            }
        }
        class159.field2027 = null;
        class140.field1808 = null;
        class125.field1664 = null;
        class520.field7520 = null;
        class283.field3606 = 0;
        if (class238.field3048 != null) {
            for (int var6 = 0; var6 < class283.field3606; ++var6) {
                class238.field3048[var6] = null;
            }
        }
        if (class250.field3208 != null) {
            for (int var7 = 0; var7 < class201.field2618; ++var7) {
                class250.field3208[var7] = null;
            }
            class201.field2618 = 0;
        }
        if (class187.field2441 != null) {
            for (int var8 = 0; var8 < class180.field2382; ++var8) {
                class187.field2441[var8] = null;
            }
            for (int var9 = 0; var9 < class524.field7753; ++var9) {
                for (int var10 = 0; var10 < class470.field6825; ++var10) {
                    for (int var11 = 0; var11 < class105.field1336; ++var11) {
                        class470.field6828[var9][var10][var11] = 0L;
                    }
                }
            }
            class180.field2382 = 0;
        }
        field2517 = null;
        class47.method462(0);
        class170.field2183.method2095(-127);
        class214.field2756 = null;
        class140.field1804 = null;
        class382.field5040 = null;
        class523.field7719 = null;
        class443.field6354 = null;
        class481.field7025 = null;
    }

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "(Z)V", line = 348)
    public final void method1204(boolean arg0) {
        if (arg0) {
            this.field2506 = super.field6631 * 8;
            ++field2509;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI[BI)V", line = 359)
    public final void method1205(boolean arg0, int arg1, byte[] arg2, int arg3) {
        ++field2512;
        if (!arg0) {
            for (int var5 = 0; ~var5 > ~arg3; ++var5) {
                arg2[var5 - -arg1] = (byte) (super.field6618[super.field6631++] + -this.field2515.method2038(arg0));
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "(II)V", line = 379)
    public final void method1206(int arg0, int arg1) {
        ++field2507;
        if (arg0 != 0) {
            this.method1196((int[]) null, false);
        }
        super.field6618[super.field6631++] = (byte) (this.field2515.method2038(false) + arg1);
    }
}
