import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class534 extends class299 implements class697 {

    @OriginalMember(owner = "client!ku", name = "y", descriptor = "[I")
    public static int[] field7337 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "B")
    private byte field7338;

    @OriginalMember(owner = "client!ku", name = "D", descriptor = "F")
    public static float field7342;

    @OriginalMember(owner = "client!ku", name = "v", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!ku", name = "w", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!ku", name = "x", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!ku", name = "A", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!ku", name = "B", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!ku", name = "C", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!ku", name = "E", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!ku", name = "F", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!ku", name = "G", descriptor = "I")
    public static int field7345;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ku", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field7346;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(II)V")
    public static final void method2996(int arg0, int arg1) {
        if (arg0 != 7308) {
            field7337 = null;
        }
        class109.field1287 = arg1;
        ++field7344;
        class496.field6835.method2168((byte) -125);
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)Z")
    public final boolean method2564(int arg0) {
        int var2 = 119 % ((arg0 - 56) / 54);
        ++field7334;
        return super.method1754(0, super.field3965.field7123);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
    public static void method2997(byte arg0) {
        if (arg0 == 28) {
            field7337 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "(I)I")
    public final int method2998(int arg0) {
        if (arg0 > -35) {
            return -117;
        } else {
            ++field7340;
            return this.field7338;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    public final Buffer method2566(boolean arg0, byte arg1) {
        ++field7335;
        if (arg1 != 6) {
            this.field7338 = -104;
        }
        return super.method1762(super.field3965.field7123, arg0, 10176);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBI)Z")
    public final boolean method2567(int arg0, byte arg1, int arg2) {
        if (arg1 >= -115) {
            field7337 = null;
        }
        this.field7338 = (byte) arg0;
        ++field7343;
        super.method1765(arg2, 30907);
        return true;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "()V")
    public static final void method2999() {
        for (int var0 = 0; var0 < class645.field8927; ++var0) {
            if (!class499.field6860[var0]) {
                class628 var1 = class141.field1915[var0];
                class392 var2 = var1.field8687;
                int var3 = var1.field8702;
                int var4 = var2.method2260(2) - class332.field4443;
                int var5 = (var4 * 2 >> class62.field762) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2258((byte) -117) - var4 >> class62.field762;
                int var9 = var2.method2257(-17895) - var4 >> class62.field762;
                int var10 = var2.method2257(-17895) + var4 >> class62.field762;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class641.field8846) {
                    var10 = class641.field8846 - 1;
                }
                for (int var11 = var9; var11 <= var10; ++var11) {
                    short var12 = var1.field8696[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 255) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class329.field4421) {
                        var16 = class329.field4421 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; ++var17) {
                        byte var18 = 1;
                        class29 var19 = class303.method1782(var3, var17, var11, field7346 != null ? field7346 : (field7346 = method3001("rc")));
                        if (var19 != null && var19.field416 != 0) {
                            if (var19.field416 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field8696[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 255) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field8696[var6 - 1];
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
                                    short var30 = var1.field8696[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 255) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field8696[var6 + 1];
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
                class499.field6860[var0] = true;
                class246.field3214[var3].method1351(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)V")
    public final void method1758(byte arg0) {
        super.method1758((byte) -62);
        ++field7345;
        int var2 = -6 / ((67 - arg0) / 38);
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lqi;Z)V")
    public class534(class510 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z")
    public final boolean method2568(Source arg0, int arg1, int arg2, int arg3) {
        this.field7338 = (byte) arg1;
        ++field7336;
        super.method1756(arg0, (byte) -21, arg3);
        if (arg2 != -19467) {
            this.field7338 = 50;
        }
        return true;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILua;ILjava/lang/String;Lla;Lwv;IIIIILaga;)V")
    public static final void method3000(int arg0, class596 arg1, int arg2, String arg3, class409 arg4, class423 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class658 arg11) {
        ++field7339;
        int var12;
        if (~class311.field4200 != -5) {
            var12 = (int) class565.field7707 + class478.field6651 & 16383;
        } else {
            var12 = (int) class565.field7707 & 16383;
        }
        int var13 = Math.max(arg5.field5561 / 2, arg5.field5672 / 2) - -10;
        int var14 = arg2 * arg2 - -(arg6 * arg6);
        if (~var14 >= ~(var13 * var13)) {
            int var15 = class240.field3176[var12];
            if (arg8 != 256) {
                field7337 = null;
            }
            int var16 = class240.field3177[var12];
            if (~class311.field4200 != -5) {
                var15 = var15 * 256 / (class424.field5716 + 256);
                var16 = var16 * 256 / (class424.field5716 + 256);
            }
            int var17 = arg2 * var16 + arg6 * var15 >> 14;
            int var18 = arg6 * var16 + -(arg2 * var15) >> 14;
            int var19 = arg11.method3768(30061, (class532[]) null, 100, arg3);
            int var20 = arg11.method3759(0, 1, 100, arg3, (class532[]) null);
            int var21 = var17 - var19 / 2;
            if (-arg5.field5561 <= var21 && arg5.field5561 >= var21 && var18 >= -arg5.field5672 && arg5.field5672 >= var18) {
                arg4.method2332(var19, arg5.field5672 / 2 + arg0 - var18 + -arg10 + -var20, (int[]) null, 0, arg3, arg1, 0, arg0, arg7, 50, 0, arg9, (class532[]) null, arg5.field5561 / 2 + arg7 + var21, 0, 1);
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)I")
    public final int method1755(int arg0) {
        ++field7341;
        if (arg0 != 16383) {
            field7342 = 1.569301F;
        }
        return super.method1755(16383);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3001(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
