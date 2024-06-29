import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class206 extends class478 {

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    private int field2899;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    private int field2902;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    private int field2901;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    private int field2898;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Lnea;")
    public static class664 field2894 = new class664(22, 14);

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "Luc;")
    public static class27 field2903 = new class27("", 13);

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "[F")
    public static float[] field2905 = new float[4];

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "Z")
    public static boolean field2906 = false;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "Lpu;")
    public static class522 field2904;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ui", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field2907;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
    public static void method1366(byte arg0) {
        if (arg0 != 109) {
            field2906 = true;
        }
        field2894 = null;
        field2903 = null;
        field2905 = null;
        field2904 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBI)V")
    public final void method1343(int arg0, byte arg1, int arg2) {
        ++field2893;
        if (arg1 != 56) {
            method1366((byte) -122);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "()V")
    public static final void method1367() {
        for (int var0 = 0; var0 < class258.field3938; ++var0) {
            if (!class60.field1141[var0]) {
                class506 var1 = class580.field8172[var0];
                class498 var2 = var1.field7165;
                int var3 = var1.field7160;
                int var4 = var2.method2880(-15) - class683.field9623;
                int var5 = (var4 * 2 >> class310.field4593) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2883(127) - var4 >> class310.field4593;
                int var9 = var2.method2875(true) - var4 >> class310.field4593;
                int var10 = var2.method2875(true) + var4 >> class310.field4593;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class8.field82) {
                    var10 = class8.field82 - 1;
                }
                for (int var11 = var9; var11 <= var10; ++var11) {
                    short var12 = var1.field7158[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 255) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class302.field4492) {
                        var16 = class302.field4492 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; ++var17) {
                        byte var18 = 1;
                        class454 var19 = class349.method2155(var3, var17, var11, field2907 != null ? field2907 : (field2907 = method1370("mw")));
                        if (var19 != null && var19.field6517 != 0) {
                            if (var19.field6517 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field7158[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 255) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field7158[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 255) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field7158[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 255) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field7158[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 255) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    ++var6;
                }
                class60.field1141[var0] = true;
                class296.field4340[var3].method429(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
    public final void method1340(int arg0, int arg1, int arg2) {
        ++field2896;
        int var4 = this.field2899 * arg2 >> 12;
        int var5 = this.field2898 * arg2 >> 12;
        if (arg1 != 0) {
            method1369((class695) null, (byte) -104);
        }
        int var6 = this.field2901 * arg0 >> 12;
        int var7 = this.field2902 * arg0 >> 12;
        class394.method2435(super.field6795, var5, (byte) -16, var6, var4, var7);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(III)V")
    public final void method1339(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field2905 = null;
        }
        ++field2897;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lde;[I[I[IB)V")
    public static final void method1368(class491 arg0, int[] arg1, int[] arg2, int[] arg3, byte arg4) {
        int var5 = 0;
        if (arg4 == -55) {
            while (arg2.length > var5) {
                int var6 = arg2[var5];
                int var7 = arg3[var5];
                int var8 = arg1[var5];
                for (int var9 = 0; var7 != 0 && ~arg0.field6229.length < ~var9; ++var9) {
                    if (~(var7 & 1) != -1) {
                        if (~var6 != 0) {
                            class30 var10 = class188.field2708.method2140(var6, 125);
                            int var11 = var10.field461;
                            class300 var12 = arg0.field6229[var9];
                            if (var12 != null) {
                                if (var12.field4466 == var6) {
                                    if (var11 == 0) {
                                        var12 = arg0.field6229[var9] = null;
                                    } else if (~var11 == -2) {
                                        var12.field4471 = 0;
                                        var12.field4464 = var8;
                                        var12.field4474 = 0;
                                        var12.field4465 = 0;
                                        var12.field4475 = 1;
                                        class603.method3399(var10, arg0.field3024, 0, class648.field9106 == arg0, -87, arg0.field3029, arg0.field3019);
                                    } else if (~var11 == -3) {
                                        var12.field4474 = 0;
                                    }
                                } else if (~var10.field462 <= ~class188.field2708.method2140(var12.field4466, 123).field462) {
                                    var12 = arg0.field6229[var9] = null;
                                }
                            }
                            if (var12 == null) {
                                class300 var13 = arg0.field6229[var9] = new class300();
                                var13.field4471 = 0;
                                var13.field4474 = 0;
                                var13.field4465 = 0;
                                var13.field4464 = var8;
                                var13.field4475 = 1;
                                var13.field4466 = var6;
                                class603.method3399(var10, arg0.field3024, 0, class648.field9106 == arg0, -69, arg0.field3029, arg0.field3019);
                            }
                        } else {
                            arg0.field6229[var9] = null;
                        }
                    }
                    var7 >>>= 1;
                }
                ++var5;
            }
            ++field2900;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IIIIII)V")
    public class206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2899 = arg0;
        this.field2902 = arg3;
        this.field2901 = arg1;
        this.field2898 = arg2;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lmo;B)Lul;")
    public static final class531 method1369(class695 arg0, byte arg1) {
        int var2 = -82 % ((arg1 - 59) / 62);
        ++field2895;
        int var3 = arg0.method3847((byte) 118);
        return new class531(var3);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1370(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
