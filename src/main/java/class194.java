import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class194 extends class175 {

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    private int field3221 = 0;

    @OriginalMember(owner = "client!bk", name = "Z", descriptor = "I")
    private int field3229 = 4096;

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "Lij;")
    public static class50 field3224 = class78.method578(126, "<col=c0ff00>");

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "Z")
    public static boolean field3216 = false;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "Lij;")
    public static class50 field3217 = class78.method578(122, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "Lij;")
    public static class50 field3219 = class78.method578(126, ":clan:");

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!bk", name = "T", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!bk", name = "V", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!bk", name = "W", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!bk", name = "X", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!bk", name = "Y", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "Lhk;")
    public static class83 field3222;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "Z")
    public static boolean field3214;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)I")
    public static final int method1310(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 74) {
            field3222 = null;
        }
        if (arg3 > 243) {
            arg2 >>= 4;
        } else if (arg3 > 217) {
            arg2 >>= 3;
        } else if (~arg3 >= -193) {
            if (~arg3 < -180) {
                arg2 >>= 1;
            }
        } else {
            arg2 >>= 2;
        }
        ++field3218;
        return (arg0 >> 2 << 10) + (arg2 >> 5 << 7) - -(arg3 >> 1);
    }

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)V")
    public static void method1311(int arg0) {
        field3219 = null;
        field3222 = null;
        if (arg0 != 44) {
            method1313(123, -77, -79, 79, (class62) null);
        }
        field3224 = null;
        field3217 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lce;II)I")
    public static final int method1312(class10 arg0, int arg1, int arg2) {
        ++field3226;
        if (arg0.field162 != null && ~arg2 > ~arg0.field162.length) {
            try {
                int[] var3 = arg0.field162[arg2];
                if (arg1 != 100) {
                    return 84;
                } else {
                    int var4 = 0;
                    byte var5 = 0;
                    int var6 = 0;
                    while (true) {
                        int var7 = var3[var4++];
                        int var8 = 0;
                        byte var9 = 0;
                        if (~var7 == -1) {
                            return var6;
                        }
                        if (var7 == 15) {
                            var9 = 1;
                        }
                        if (var7 == 1) {
                            var8 = class190.field3154[var3[var4++]];
                        }
                        if (var7 == 2) {
                            var8 = class83.field1542[var3[var4++]];
                        }
                        if (~var7 == -4) {
                            var8 = class86.field1662[var3[var4++]];
                        }
                        if (var7 == 4) {
                            int var10 = var3[var4++] << 16;
                            int var11 = var10 + var3[var4++];
                            class10 var12 = class89.method698(var11, (byte) 94);
                            int var13 = var3[var4++];
                            if (var13 != -1 && (!class15.method111(var13, false).field4077 || class151.field2628)) {
                                for (int var14 = 0; ~var12.field298.length < ~var14; ++var14) {
                                    if (var13 + 1 == var12.field298[var14]) {
                                        var8 += var12.field152[var14];
                                    }
                                }
                            }
                        }
                        if (var7 == 5) {
                            var8 = class54.field968[var3[var4++]];
                        }
                        if (var7 == 16) {
                            var9 = 2;
                        }
                        if (~var7 == -7) {
                            var8 = class69.field1292[-1 + class83.field1542[var3[var4++]]];
                        }
                        if (~var7 == -18) {
                            var9 = 3;
                        }
                        if (var7 == 7) {
                            var8 = class54.field968[var3[var4++]] * 100 / 46875;
                        }
                        if (~var7 == -9) {
                            var8 = class239.field4067.field3089;
                        }
                        if (var7 == 9) {
                            for (int var15 = 0; var15 < 25; ++var15) {
                                if (class256.field4457[var15]) {
                                    var8 += class83.field1542[var15];
                                }
                            }
                        }
                        if (~var7 == -11) {
                            int var16 = var3[var4++] << 16;
                            int var17 = var16 + var3[var4++];
                            class10 var18 = class89.method698(var17, (byte) 94);
                            int var19 = var3[var4++];
                            if (var19 != -1 && (!class15.method111(var19, false).field4077 || class151.field2628)) {
                                for (int var20 = 0; var20 < var18.field298.length; ++var20) {
                                    if (~(var19 - -1) == ~var18.field298[var20]) {
                                        var8 = 999999999;
                                        break;
                                    }
                                }
                            }
                        }
                        if (~var7 == -12) {
                            var8 = class224.field3766;
                        }
                        if (var7 == 12) {
                            var8 = class191.field3171;
                        }
                        if (~var7 == -14) {
                            int var21 = class54.field968[var3[var4++]];
                            int var22 = var3[var4++];
                            var8 = ~(1 << var22 & var21) != -1 ? 1 : 0;
                        }
                        if (~var7 == -15) {
                            int var23 = var3[var4++];
                            var8 = class197.method1326(false, var23);
                        }
                        if (var7 == 18) {
                            var8 = (class239.field4067.field3990 >> 7) + class61.field1124;
                        }
                        if (var7 == 19) {
                            var8 = (class239.field4067.field4027 >> 7) + class254.field4394;
                        }
                        if (~var7 == -21) {
                            var8 = var3[var4++];
                        }
                        if (~var9 != -1) {
                            var5 = var9;
                        } else {
                            if (~var5 == -1) {
                                var6 += var8;
                            }
                            if (var5 == 1) {
                                var6 -= var8;
                            }
                            if (~var5 == -3 && var8 != 0) {
                                var6 /= var8;
                            }
                            if (~var5 == -4) {
                                var6 *= var8;
                            }
                            var5 = 0;
                        }
                    }
                }
            } catch (Exception var24) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
    public class194() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        int[] var3 = super.field2941.method1427(-21281, arg0);
        if (super.field2941.field3565) {
            int[] var4 = this.method1210(0, arg0, arg1 ^ -11529);
            for (int var5 = 0; ~var5 > ~class211.field3514; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field3221 && this.field3229 >= var6 ? 4096 : 0;
            }
        }
        ++field3225;
        if (arg1 != -27746) {
            this.method39(false, -102, (class217) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIILha;)V")
    public static final void method1313(int arg0, int arg1, int arg2, int arg3, class62 arg4) {
        ++field3220;
        if (class136.field2368 < 400) {
            if (arg4.field1160 != null) {
                arg4 = arg4.method486((byte) -112);
            }
            if (arg4 != null) {
                if (arg4.field1185) {
                    class50 var5 = arg4.field1180;
                    if (~arg4.field1147 != arg0) {
                        var5 = class80.method589(new class50[] { var5, class131.method926(arg4.field1147, (byte) 124, class239.field4067.field3089), class121.field2130, class102.field1871, class78.method579(arg4.field1147, -26225), class71.field1364 }, arg0 + 28744);
                    }
                    if (~class114.field1992 == -2) {
                        class129.method921(class220.field3686, class80.method589(new class50[] { class19.field407, class223.field3749, var5 }, 28743), arg3, arg2, (short) 5, true, (long) arg1);
                        ++class7.field89;
                    } else if (!class188.field3116) {
                        ++class245.field4269;
                        class50[] var6 = arg4.field1137;
                        if (class140.field2454) {
                            var6 = class243.method1647(-6, var6);
                        }
                        if (var6 != null) {
                            for (int var7 = 4; var7 >= 0; --var7) {
                                if (var6[var7] != null && (~class57.field1037 != -1 || !var6[var7].method387(class139.field2430, true))) {
                                    byte var8 = 0;
                                    ++class196.field3256;
                                    if (~var7 == -1) {
                                        var8 = 43;
                                    }
                                    if (~var7 == -2) {
                                        var8 = 35;
                                    }
                                    if (~var7 == -3) {
                                        var8 = 45;
                                    }
                                    if (~var7 == -4) {
                                        var8 = 16;
                                    }
                                    if (~var7 == -5) {
                                        var8 = 44;
                                    }
                                    class129.method921(var6[var7], class80.method589(new class50[] { class206.field3417, var5 }, 28743), arg3, arg2, var8, true, (long) arg1);
                                }
                            }
                        }
                        if (~class57.field1037 == -1 && var6 != null) {
                            for (int var9 = 4; ~var9 <= -1; --var9) {
                                if (var6[var9] != null && var6[var9].method387(class139.field2430, true)) {
                                    ++class219.field3654;
                                    short var10 = 0;
                                    short var11 = 0;
                                    if (~var9 == -1) {
                                        var11 = 43;
                                    }
                                    if (class239.field4067.field3089 < arg4.field1147) {
                                        var10 = 2000;
                                    }
                                    if (var9 == 1) {
                                        var11 = 35;
                                    }
                                    if (var9 == 2) {
                                        var11 = 45;
                                    }
                                    if (var9 == 3) {
                                        var11 = 16;
                                    }
                                    if (var9 == 4) {
                                        var11 = 44;
                                    }
                                    if (~var11 != -1) {
                                        var11 += var10;
                                    }
                                    class129.method921(var6[var9], class80.method589(new class50[] { class206.field3417, var5 }, 28743), arg3, arg2, var11, true, (long) arg1);
                                }
                            }
                        }
                        class129.method921(class109.field1959, class80.method589(new class50[] { class206.field3417, var5 }, 28743), arg3, arg2, (short) 1007, true, (long) arg1);
                    } else if (~(class129.field2270 & 2) == -3) {
                        class129.method921(class41.field766, class80.method589(new class50[] { class18.field396, class223.field3749, var5 }, 28743), arg3, arg2, (short) 18, true, (long) arg1);
                        ++class260.field4536;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        ++field3227;
        if (!arg0) {
            method1312((class10) null, -16, 0);
        }
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field3229 = arg2.method1441(75);
            }
        } else {
            this.field3221 = arg2.method1441(-53);
        }
    }
}
