import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class264 extends class196 {

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "[Z")
    public static boolean[] field4613 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "[I")
    public static int[] field4609 = new int[99];

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "Ldf;")
    public static class51 field4617 = class46.method233("M", 100);

    @OriginalMember(owner = "client!lh", name = "db", descriptor = "Ldf;")
    public static class51 field4621 = class46.method233(" <col=00ff80>", 100);

    @OriginalMember(owner = "client!lh", name = "ib", descriptor = "Ldf;")
    public static class51 field4626;

    @OriginalMember(owner = "client!lh", name = "jb", descriptor = "Lvh;")
    public static class252 field4627;

    @OriginalMember(owner = "client!lh", name = "lb", descriptor = "Ldf;")
    public static class51 field4629;

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!lh", name = "fb", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!lh", name = "gb", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!lh", name = "hb", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!lh", name = "kb", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!lh", name = "mb", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "[Ljg;")
    public static class158[] field4620;

    @OriginalMember(owner = "client!lh", name = "eb", descriptor = "[Ljb;")
    private class248[] field4622;

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "[[I")
    public static int[][] field4619;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([[II)V")
    private final void method1789(int[][] arg0, int arg1) {
        ++field4618;
        int var3 = class49.field767;
        int var4 = class234.field4079;
        class134.method977(arg0, 121);
        if (arg1 == -1) {
            class31.method157(false, 0, class135.field2245, 0, class214.field3717);
            if (this.field4622 != null) {
                for (int var5 = 0; ~var5 > ~this.field4622.length; ++var5) {
                    class248 var6 = this.field4622[var5];
                    int var7 = var6.field4368;
                    int var8 = var6.field4372;
                    if (var7 >= 0) {
                        if (~var8 > -1) {
                            var6.method153(var4, (byte) 98, var3);
                        } else {
                            var6.method152(var4, var3, 115);
                        }
                    } else if (~var8 <= -1) {
                        var6.method154(var4, 127, var3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
    public static void method1790(boolean arg0) {
        field4629 = null;
        if (!arg0) {
            method1793(77);
        }
        field4626 = null;
        field4617 = null;
        field4609 = null;
        field4613 = null;
        field4620 = null;
        field4619 = null;
        field4627 = null;
        field4621 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4611;
        int var7 = arg5 + arg6;
        int var8 = -arg6 + arg3;
        int var9 = arg4 - -arg6;
        if (arg0 == 0) {
            for (int var10 = arg5; var7 > var10; ++var10) {
                class242.method1660((byte) -79, class80.field1324[var10], arg1, arg2, arg4);
            }
            int var11 = -arg6 + arg2;
            for (int var12 = arg3; ~var8 > ~var12; --var12) {
                class242.method1660((byte) -79, class80.field1324[var12], arg1, arg2, arg4);
            }
            for (int var13 = var7; var13 <= var8; ++var13) {
                int[] var14 = class80.field1324[var13];
                class242.method1660((byte) -79, var14, arg1, var9, arg4);
                class242.method1660((byte) -79, var14, arg1, arg2, var11);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class264() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field4612;
        int[] var3 = super.field3274.method1476(true, arg0);
        if (arg1 != 10565) {
            method1795(5);
        }
        if (super.field3274.field3741) {
            this.method1789(super.field3274.method1481(false), -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BIILu;)[Lg;")
    public static final class254[] method1792(byte arg0, int arg1, int arg2, class111 arg3) {
        ++field4625;
        if (arg0 <= 13) {
            method1796((byte) -76);
        }
        return !class69.method480(arg1, 57, arg2, arg3) ? null : class105.method754(30);
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)Z")
    public static final boolean method1793(int arg0) {
        if (arg0 != 2) {
            field4613 = null;
        }
        ++field4615;
        return class52.field876 != 0 ? true : class162.field2656.method565(-6177080);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field3291 = ~arg1.method897(arg2 ^ -7) == -2;
            }
        } else {
            this.field4622 = new class248[arg1.method897(-59)];
            for (int var4 = 0; this.field4622.length > var4; ++var4) {
                int var5 = arg1.method897(arg2 + 39);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field4622[var4] = class183.method1296(arg1, -1);
                            }
                        } else {
                            this.field4622[var4] = class169.method1173(arg1, 0);
                        }
                    } else {
                        this.field4622[var4] = class190.method1364(arg1, 115);
                    }
                } else {
                    this.field4622[var4] = class114.method842(arg1, arg2 + 7817);
                }
            }
        }
        if (arg2 != 82) {
            field4629 = null;
        }
        ++field4623;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1794(boolean arg0, int arg1) {
        if (arg0) {
            method1796((byte) 116);
        }
        ++field4610;
        return (1 & arg1 >> 20) != 0;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        if (arg0 != 11) {
            method1791(102, 85, -29, -55, 19, -46, -14);
        }
        ++field4628;
        int[][] var3 = super.field3285.method1548(arg1, (byte) -77);
        if (super.field3285.field3963) {
            int var4 = class49.field767;
            int var5 = class234.field4079;
            int[][][] var6 = super.field3285.method1550(32767);
            int[][] var7 = new int[var5][var4];
            this.method1789(var7, -1);
            for (int var8 = 0; ~var8 > ~class234.field4079; ++var8) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[2];
                int[] var13 = var10[1];
                for (int var14 = 0; ~var14 > ~class49.field767; ++var14) {
                    int var15 = var9[var14];
                    var12[var14] = class191.method1366(255, var15) << 4;
                    var13[var14] = class191.method1366(var15 >> 4, 4080);
                    var11[var14] = class191.method1366(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)V")
    public static final void method1795(int arg0) {
        ++field4608;
        Object var1 = class23.field355;
        synchronized (class23.field355) {
            if (arg0 != 5) {
                field4626 = null;
            }
            if (~class239.field4163 == -1) {
                class25.field376.method1570(new class179(), -28437, 5);
            }
            class239.field4163 = 600;
        }
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)V")
    public static final void method1796(byte arg0) {
        ++field4614;
        int var1 = 0;
        if (arg0 != -1) {
            field4613 = null;
        }
        while (~var1 > ~class218.field3788) {
            int var2 = class193.field3242[var1];
            class83 var3 = class34.field512[var2];
            if (var3 != null) {
                class63.method418(var3, true, var3.field1392.field118);
            }
            ++var1;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field4609[var1] = var0 / 4;
        }
        field4626 = class46.method233("::fpson", 100);
        field4627 = new class252();
        field4629 = class46.method233("p12_full", 100);
    }
}
