import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class374 {

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "Lng;")
    public static class190 field5331 = new class190(8);

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "[I")
    public static int[] field5341 = new int[14];

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "Lng;")
    public static class190 field5343 = new class190(64);

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "[Z")
    public static boolean[] field5344 = new boolean[8];

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public int field5330;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    private int field5336;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public int field5340;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "Llf;")
    public static class130 field5345;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "Lqj;")
    public static class296 field5342;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILsh;II)V", line = 5)
    public static final void method2441(int arg0, class44 arg1, int arg2, int arg3) {
        if (arg2 != 32712) {
            method2446((byte) 69, -127, (class61) null, -117, -72);
        }
        class184.field2571[arg3][arg0] = arg1;
        field5335++;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIILeb;)V", line = 17)
    private final void method2442(int arg0, int arg1, int arg2, class371 arg3) {
        field5329++;
        if (arg2 < 1) {
            return;
        }
        if (arg0 == 1) {
            this.field5336 = arg3.method2403((byte) 114);
        } else if (arg0 == 2) {
            this.field5340 = arg3.method2429(0);
            this.field5330 = arg3.method2429(0);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILeb;I)V", line = 40)
    public final void method2443(int arg0, class371 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method2429(0);
            if (var4 == 0) {
                if (arg0 != 0) {
                    field5331 = null;
                }
                field5332++;
                return;
            }
            this.method2442(var4, arg2, 73, arg1);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 60)
    public static final void method2444(int arg0) {
        field5333++;
        class362.field5087.method1249(1);
        if (arg0 != -8014) {
            field5342 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILsm;)V", line = 76)
    public static final void method2445(int arg0, class156 arg1) {
        class249.field3456[arg0] = arg1;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BILjj;II)V", line = 79)
    public static final void method2446(byte arg0, int arg1, class61 arg2, int arg3, int arg4) {
        field5338++;
        class312 var5 = arg2.method402(0);
        int var6 = arg2.field863 - arg2.field859.field5373 & 0x3FFF;
        if (arg1 == -1) {
            if (var6 != 0 || arg2.field872 > 25) {
                arg2.field861 = false;
                if (arg3 < 0 && var5.field4272 != -1) {
                    arg2.field928 = var5.field4272;
                } else if (arg3 <= 0 || var5.field4276 == -1) {
                    arg2.field928 = var5.field4296;
                } else {
                    arg2.field928 = var5.field4276;
                }
            } else if (!arg2.field861 || !var5.method1971(-72, arg2.field928)) {
                arg2.field928 = var5.method1979((byte) -23);
                arg2.field861 = arg2.field928 != -1;
            }
        } else if (arg2.field915 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class309.field4242[arg4] - arg2.field859.field5373 & 0x3FFF;
            arg2.field861 = false;
            if (arg1 == 2 && var5.field4295 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4285 != -1) {
                    arg2.field928 = var5.field4285;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4294 != -1) {
                    arg2.field928 = var5.field4294;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4299 == -1) {
                    arg2.field928 = var5.field4295;
                } else {
                    arg2.field928 = var5.field4299;
                }
            } else if (arg1 == 0 && var5.field4309 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4305 != -1) {
                    arg2.field928 = var5.field4305;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4286 != -1) {
                    arg2.field928 = var5.field4286;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4280 == -1) {
                    arg2.field928 = var5.field4309;
                } else {
                    arg2.field928 = var5.field4280;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field4307 != -1) {
                arg2.field928 = var5.field4307;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field4267 != -1) {
                arg2.field928 = var5.field4267;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field4278 == -1) {
                arg2.field928 = var5.field4296;
            } else {
                arg2.field928 = var5.field4278;
            }
        } else if (var6 == 0 && arg2.field872 <= 25) {
            if (arg1 == 2 && var5.field4295 != -1) {
                arg2.field928 = var5.field4295;
            } else if (arg1 == 0 && var5.field4309 != -1) {
                arg2.field928 = var5.field4309;
            } else {
                arg2.field928 = var5.field4296;
            }
            arg2.field861 = false;
        } else {
            arg2.field861 = false;
            if (arg1 == 2 && var5.field4295 != -1) {
                if (arg3 < 0 && var5.field4279 != -1) {
                    arg2.field928 = var5.field4279;
                } else if (arg3 <= 0 || var5.field4262 == -1) {
                    arg2.field928 = var5.field4295;
                } else {
                    arg2.field928 = var5.field4262;
                }
            } else if (arg1 == 0 && var5.field4309 != -1) {
                if (arg3 < 0 && var5.field4301 != -1) {
                    arg2.field928 = var5.field4301;
                } else if (arg3 <= 0 || var5.field4297 == -1) {
                    arg2.field928 = var5.field4309;
                } else {
                    arg2.field928 = var5.field4297;
                }
            } else if (arg3 < 0 && var5.field4283 != -1) {
                arg2.field928 = var5.field4283;
            } else if (arg3 <= 0 || var5.field4270 == -1) {
                arg2.field928 = var5.field4296;
            } else {
                arg2.field928 = var5.field4270;
            }
        }
        int var8 = -93 % ((73 - arg0) / 47);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V", line = 238)
    public static final void method2447(byte arg0) {
        field5337++;
        if (class346.field4846 > 0) {
            class83.method590(arg0 ^ 0xFFFFFFF6);
            return;
        }
        if (arg0 != -10) {
            method2450((byte) -125);
        }
        class48.field736 = class199.field2749;
        class199.field2749 = null;
        class312.method1977(40, (byte) 124);
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)Lnc;", line = 260)
    public final class18 method2448(int arg0) {
        if (arg0 != -1312) {
            field5343 = null;
        }
        field5334++;
        class18 var2 = (class18) class248.field3438.method1246((byte) -38, (long) this.field5336);
        if (var2 != null) {
            return var2;
        }
        class18 var3 = class18.method119(class262.field3582, this.field5336, 0);
        if (var3 != null) {
            class248.field3438.method1247((long) this.field5336, (byte) -83, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)V", line = 294)
    public static final void method2449(boolean arg0, int arg1) {
        field5339++;
        byte var2;
        byte[][] var3;
        if (arg0) {
            var3 = class149.field2149;
            var2 = 1;
        } else {
            var2 = 4;
            var3 = class387.field5635;
        }
        int var4 = -7 / ((arg1 - 22) / 35);
        int var5 = var3.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int[] var12 = null;
            byte[] var13 = var3[var6];
            int var14 = class324.field4432[var6] >> 8;
            int var15 = class324.field4432[var6] & 0xFF;
            int var16 = var14 * 64 - class449.field6509;
            int var17 = var15 * 64 - class354.field4981;
            if (var13 != null) {
                class154.method1038(0);
                var12 = class323.method2040(class408.field5920, false, var17, var13, arg0, var2, class24.field326, class449.field6509, var16, class354.field4981);
            }
            if (!arg0 && class419.field6055 / 8 == var14 && (class430.field6183 / 8) == var15) {
                if (var12 == null) {
                    class66.field1040 = null;
                } else {
                    class66.field1040 = class313.method1987(var12[1], var12[2], var12[3], 77, var12[0]);
                    class23.field305 = var12[4];
                }
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = (class324.field4432[var7] >> 8) * 64 - class449.field6509;
            int var9 = (class324.field4432[var7] & 0xFF) * 64 - class354.field4981;
            byte[] var10 = var3[var7];
            if (var10 == null && class430.field6183 < 800) {
                class154.method1038(0);
                for (int var11 = 0; var11 < var2; var11++) {
                    class261.method1607(var8, 64, true, 64, var9, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)V", line = 390)
    public static void method2450(byte arg0) {
        field5343 = null;
        if (arg0 < 91) {
            return;
        }
        field5345 = null;
        field5341 = null;
        field5344 = null;
        field5331 = null;
        field5342 = null;
    }
}
