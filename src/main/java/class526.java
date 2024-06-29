import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class526 extends class325 {

    @OriginalMember(owner = "client!bia", name = "H", descriptor = "I")
    private int field7201 = 409;

    @OriginalMember(owner = "client!bia", name = "M", descriptor = "I")
    private int field7206 = 1024;

    @OriginalMember(owner = "client!bia", name = "F", descriptor = "I")
    private int field7199 = 2048;

    @OriginalMember(owner = "client!bia", name = "J", descriptor = "I")
    private int field7203 = 0;

    @OriginalMember(owner = "client!bia", name = "R", descriptor = "I")
    private int field7211 = 1024;

    @OriginalMember(owner = "client!bia", name = "O", descriptor = "I")
    private int field7208 = 0;

    @OriginalMember(owner = "client!bia", name = "D", descriptor = "I")
    private int field7197 = 1024;

    @OriginalMember(owner = "client!bia", name = "Y", descriptor = "I")
    private int field7218 = 1024;

    @OriginalMember(owner = "client!bia", name = "T", descriptor = "I")
    private int field7213 = 819;

    @OriginalMember(owner = "client!bia", name = "W", descriptor = "Z")
    public static boolean field7216 = false;

    @OriginalMember(owner = "client!bia", name = "C", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!bia", name = "E", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!bia", name = "G", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!bia", name = "I", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!bia", name = "K", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!bia", name = "L", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!bia", name = "N", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!bia", name = "P", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!bia", name = "Q", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!bia", name = "S", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!bia", name = "U", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!bia", name = "V", descriptor = "I")
    private int field7215;

    @OriginalMember(owner = "client!bia", name = "X", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Ljp;IB)V", line = 5)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (~arg1 != -8) {
                                        if (arg1 == 8) {
                                            this.field7218 = arg0.method2359(-1);
                                        }
                                    } else {
                                        this.field7206 = arg0.method2359(-1);
                                    }
                                } else {
                                    this.field7208 = arg0.method2398(-1372747256);
                                }
                            } else {
                                this.field7197 = arg0.method2359(-1);
                            }
                        } else {
                            this.field7213 = arg0.method2359(-1);
                        }
                    } else {
                        this.field7201 = arg0.method2359(-1);
                    }
                } else {
                    this.field7199 = arg0.method2359(-1);
                }
            } else {
                this.field7211 = arg0.method2359(-1);
            }
        } else {
            this.field7203 = arg0.method2398(-1372747256);
        }
        if (arg2 > -41) {
            this.field7199 = -46;
        }
        ++field7214;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(II[[ILjava/util/Random;III)V", line = 101)
    private final void method3030(int arg0, int arg1, int[][] arg2, Random arg3, int arg4, int arg5, int arg6) {
        ++field7196;
        int var8 = ~this.field7218 >= -1 ? 4096 : 4096 + -class739.method4090(arg3, -121, this.field7218);
        int var9 = this.field7215 * this.field7206 >> 12;
        int var10 = this.field7215 - (var9 > 0 ? class739.method4090(arg3, 120, var9) : 0);
        if (~class261.field3874 >= ~arg6) {
            arg6 -= class261.field3874;
        }
        if (arg0 != 2) {
            method3034(-101, 20, (class65) null, -19, -12, -91);
        }
        if (~var10 >= -1) {
            if (class261.field3874 >= arg4 + arg6) {
                for (int var11 = 0; ~arg5 < ~var11; ++var11) {
                    class278.method1802(arg2[arg1 - -var11], arg6, arg4, var8);
                }
            } else {
                int var12 = -arg6 + class261.field3874;
                for (int var13 = 0; ~arg5 < ~var13; ++var13) {
                    int[] var14 = arg2[arg1 + var13];
                    class278.method1802(var14, arg6, var12, var8);
                    class278.method1802(var14, 0, arg4 - var12, var8);
                }
            }
        } else if (arg5 > 0 && ~arg4 < -1) {
            int var15 = arg4 / 2;
            int var16 = arg5 / 2;
            int var17 = var10 > var15 ? var15 : var10;
            int var18 = ~var10 >= ~var16 ? var10 : var16;
            int var19 = arg6 + var17;
            int var20 = -(var17 * 2) + arg4;
            for (int var21 = 0; ~arg5 < ~var21; ++var21) {
                int[] var22 = arg2[var21 - -arg1];
                if (~var21 > ~var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field7208 != 0) {
                        for (int var24 = 0; ~var17 < ~var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class440.method2643(arg6 + var24, class625.field8423)] = var22[class440.method2643(arg6 - var24 - 1 + arg4, class625.field8423)] = var23 > var25 ? var25 : var23;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class440.method2643(class625.field8423, arg6 - -var26)] = var22[class440.method2643(arg6 - var26 + arg4 - 1, class625.field8423)] = var23 * var28 >> 12;
                        }
                    }
                    if (var19 + var20 <= class261.field3874) {
                        class278.method1802(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class261.field3874;
                        class278.method1802(var22, var19, var27, var23);
                        class278.method1802(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg5 + -1;
                    if (var29 < var18) {
                        int var30 = var8 * var29 / var18;
                        if (this.field7208 == 0) {
                            for (int var31 = 0; ~var31 > ~var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class440.method2643(arg6 + var31, class625.field8423)] = var22[class440.method2643(arg6 - -arg4 - var31 + -1, class625.field8423)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var17 > var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class440.method2643(class625.field8423, arg6 + var33)] = var22[class440.method2643(-var33 - 1 + arg6 + arg4, class625.field8423)] = ~var30 >= ~var35 ? var30 : var35;
                            }
                        }
                        if (~class261.field3874 <= ~(var19 + var20)) {
                            class278.method1802(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class261.field3874;
                            class278.method1802(var22, var19, var34, var30);
                            class278.method1802(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var17 < ~var36; ++var36) {
                            var22[class440.method2643(class625.field8423, arg6 + var36)] = var22[class440.method2643(arg6 - -arg4 + -1 - var36, class625.field8423)] = var8 * var36 / var17;
                        }
                        if (class261.field3874 >= var19 + var20) {
                            class278.method1802(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class261.field3874;
                            class278.method1802(var22, var19, var37, var8);
                            class278.method1802(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "(IB)Z", line = 299)
    public static final boolean method3031(int arg0, byte arg1) {
        ++field7198;
        if (arg1 < 7) {
            method3032((class65) null, true, -14, (byte) 57);
        }
        return ~arg0 == -2 || arg0 == 3 || arg0 == 5;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Lha;ZIB)Lvga;", line = 314)
    public static final class93 method3032(class65 arg0, boolean arg1, int arg2, byte arg3) {
        ++field7217;
        if (~arg2 == 0) {
            return null;
        } else {
            if (class383.field5611 != null) {
                for (int var4 = 0; ~class383.field5611.length < ~var4; ++var4) {
                    if (class383.field5611[var4] == arg2) {
                        return class174.field2339[var4];
                    }
                }
            }
            class93 var5 = (class93) class617.field8329.method1541(arg3 + -20, (long) arg2);
            if (var5 != null) {
                if (arg1 && var5.field1331 == null) {
                    class255 var6 = class194.method1335(class569.field7583, arg3 ^ -5697, arg2);
                    if (var6 == null) {
                        return null;
                    }
                    var5.field1331 = var6;
                }
                return var5;
            } else {
                class508[] var7 = class508.method2943(class543.field7371, arg2);
                if (var7 == null) {
                    return null;
                } else if (arg3 != 10) {
                    return null;
                } else {
                    class255 var8 = class194.method1335(class569.field7583, -5707, arg2);
                    if (var8 == null) {
                        return null;
                    } else {
                        class93 var9;
                        if (arg1) {
                            var9 = new class93(arg0.method545(var8, var7, true), var8);
                        } else {
                            var9 = new class93(arg0.method545(var8, var7, true));
                        }
                        class617.field8329.method1544(true, var9, (long) arg2);
                        return var9;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "()V", line = 406)
    public class526() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IBI)B", line = 383)
    public static final byte method3033(int arg0, byte arg1, int arg2) {
        ++field7212;
        if (arg1 != 110) {
            field7216 = false;
        }
        if (~arg2 != -10) {
            return 0;
        } else {
            return (byte) ((arg0 & 1) != 0 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IILha;III)V", line = 412)
    public static final void method3034(int arg0, int arg1, class65 arg2, int arg3, int arg4, int arg5) {
        arg2.method456(arg3, arg1, arg3 - -arg4, arg1 + arg5);
        ++field7205;
        arg2.method462(51, arg4, arg1, arg5, arg3, -16777216);
        if (class37.field579 >= 100) {
            if (arg0 < 120) {
                field7210 = -79;
            }
            float var6 = (float) class375.field5436 / (float) class375.field5448;
            int var7 = arg4;
            int var8 = arg5;
            if (!(var6 < 1.0F)) {
                var7 = (int) ((float) arg5 / var6);
            } else {
                var8 = (int) ((float) arg4 * var6);
            }
            int var9 = (arg5 - var8) / 2 + arg1;
            int var10 = (-var7 + arg4) / 2 + arg3;
            if (class768.field10592 == null || ~arg4 != ~class768.field10592.method1107() || ~arg5 != ~class768.field10592.method1110()) {
                class375.method2345(class375.field5447, class375.field5436 + class375.field5434, class375.field5447 - -class375.field5448, class375.field5434, var10, var9, var7 + var10, var8 + var9);
                class375.method2327(arg2);
                class768.field10592 = arg2.method562(var10, var9, var7, var8, false);
            }
            class768.field10592.method1102(var10, var9);
            int var11 = class183.field2452 * var7 / class375.field5448;
            int var12 = class64.field907 * var8 / class375.field5436;
            int var13 = class131.field1946 * var7 / class375.field5448 + var10;
            int var14 = var8 + var9 - var12 + -(class360.field5268 * var8 / class375.field5436);
            int var15 = -1996554240;
            if (class21.field332 == class180.field2393) {
                var15 = -1996488705;
            }
            arg2.method563(var13, var14, var11, var12, var15, 1);
            arg2.method538(var13, var14, var11, var12, var15, 0);
            if (~class653.field9062 < -1) {
                int var16;
                if (field7210 > 50) {
                    var16 = (100 - field7210) * 5;
                } else {
                    var16 = field7210 * 5;
                }
                for (class57 var17 = (class57) class375.field5423.method2551((byte) -108); var17 != null; var17 = (class57) class375.field5423.method2542(-112)) {
                    class680 var18 = class375.field5418.method2232(var17.field793, -99);
                    if (class482.method2804(var18, -2080)) {
                        if (class258.field3853 == var17.field793) {
                            int var19 = var17.field803 * var7 / class375.field5448 + var10;
                            int var20 = (-var17.field794 + class375.field5436) * var8 / class375.field5436 + var9;
                            arg2.method462(-126, 4, var20 + -2, 4, var19 + -2, 16776960 | var16 << 24);
                        } else if (class354.field5196 != -1 && ~class354.field5196 == ~var18.field9512) {
                            int var21 = var17.field803 * var7 / class375.field5448 + var10;
                            int var22 = (-var17.field794 + class375.field5436) * var8 / class375.field5436 + var9;
                            arg2.method462(-125, 4, var22 + -2, 4, var21 + -2, 16776960 | var16 << 24);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(ILsaa;Z)V", line = 508)
    public static final void method3035(int arg0, class347 arg1, boolean arg2) {
        if (!arg2) {
            if (class243.field3267) {
                arg0 = 0;
                class243.field3267 = false;
            }
            ++field7207;
            if (class791.field10888 == null || !class791.field10888.method2194(arg1, (byte) 64)) {
                class791.field10888 = arg1;
                class177.field2372 = class302.method1910(0);
                class413.field5935 = arg0;
                class333.field4852 = arg0;
                if (class333.field4852 != 0) {
                    class326.field4751 = class3.field15;
                    class13.field207 = class114.field1554;
                    class11.field174 = class380.field5557;
                    class522.field7161 = class379.field5543;
                    class760.field10524 = class40.field638;
                    class110.field1516 = class306.field4437;
                    class364.field5308 = class389.field5669;
                    class652.field9037 = class162.field2200;
                    class93.field1332 = class270.field3979;
                    class103.field1423 = class490.field6804;
                    return;
                }
                class402.method2507(2);
            }
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(I[B)V", line = 558)
    public static final void method3036(int arg0, byte[] arg1) {
        ++field7202;
        class376 var2 = new class376(arg1);
        if (arg0 != 1412) {
            method3033(-19, (byte) 31, -50);
        }
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = var2.method2398(-1372747256);
                if (var4 == 0) {
                    if (var3) {
                        return;
                    }
                    if (class309.field4457 == null) {
                        class206.field2699 = 4;
                        class793.field10900 = new int[4];
                        class309.field4457 = new int[4];
                    }
                    for (int var6 = 0; class309.field4457.length > var6; ++var6) {
                        class309.field4457[var6] = 0;
                        class793.field10900[var6] = var6 * 20;
                    }
                    return;
                }
                if (~var4 == -2) {
                    if (class309.field4457 == null) {
                        class206.field2699 = 4;
                        class309.field4457 = new int[4];
                        class793.field10900 = new int[4];
                    }
                    var3 = true;
                    for (int var5 = 0; ~class309.field4457.length < ~var5; ++var5) {
                        class309.field4457[var5] = var2.method2355(arg0 + -1409);
                        class793.field10900[var5] = var2.method2355(3);
                    }
                } else if (~var4 == -3) {
                    class207.field2711 = var2.method2359(arg0 + -1413);
                } else if (var4 == 3) {
                    class206.field2699 = var2.method2398(-1372747256);
                    class309.field4457 = new int[class206.field2699];
                    class793.field10900 = new int[class206.field2699];
                }
            }
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(BIZIII)V", line = 638)
    public static final void method3037(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field7200;
        if (class626.field8501 == null) {
            class379.field5542.method462(71, arg4, arg3, arg5, arg1, -16777216);
        } else if (~class551.field7456.field2257 <= -1 && ~(class597.field8132 * 512) < ~class551.field7456.field2257 && class551.field7456.field2259 >= 0 && ~(class628.field8800 * 512) < ~class551.field7456.field2259) {
            ++class320.field4604;
            if (class551.field7456 != null && class551.field7456.field2257 - (-1 + class551.field7456.method655(-128)) * 256 >> 9 == class779.field10689 && class551.field7456.field2259 + -(256 * (-1 + class551.field7456.method655(-126))) >> 9 == class692.field9714) {
                class779.field10689 = -1;
                class692.field9714 = -1;
                class212.method1405(-77);
            }
            class647.method3616(0);
            if (!arg2) {
                class781.method4315(0);
            }
            class626.method3468((byte) 14);
            class89.method722(arg4, arg5, 6680, arg1, arg3, true);
            int var6 = class142.field2056;
            int var7 = class634.field8854;
            int var8 = class754.field10468;
            int var9 = class62.field892;
            class330.field4773 = class330.field4772;
            if (class502.field6938 == 1) {
                int var10 = (int) class282.field4151;
                if (~var10 > ~(class363.field5289 >> 8)) {
                    var10 = class363.field5289 >> 8;
                }
                if (class220.field2986[4] && var10 < class103.field1417[4] + 128) {
                    var10 = class103.field1417[4] + 128;
                }
                int var11 = 16383 & (int) class135.field1974 + class344.field5063;
                class445.method2670(class400.field5843, var11, -200 + class783.method4338(class610.field8296, class551.field7456.field2257, -12040, class551.field7456.field2259), var10, var7, class262.field3888, (var10 >> 3) * 3 + 600 << 2, (byte) 87);
            } else if (~class502.field6938 == -5) {
                int var12 = (int) class282.field4151;
                if (class363.field5289 >> 8 > var12) {
                    var12 = class363.field5289 >> 8;
                }
                if (class220.field2986[4] && class103.field1417[4] + 128 > var12) {
                    var12 = class103.field1417[4] + 128;
                }
                int var13 = 16383 & (int) class135.field1974;
                class445.method2670(class400.field5843, var13, class783.method4338(class610.field8296, class500.field6902, -12040, class734.field10175) - 200, var12, var7, class262.field3888, (var12 >> 3) * 3 + 600 << 2, (byte) 87);
            } else if (~class502.field6938 == -6) {
                class440.method2649(var7, (byte) 8);
            }
            int var14 = class634.field8856;
            int var15 = class405.field5867;
            int var16 = class350.field5138;
            int var17 = class253.field3733;
            int var18 = class718.field10019;
            for (int var19 = 0; var19 < 5; ++var19) {
                if (class220.field2986[var19]) {
                    int var23 = (int) ((double) (-class422.field6039[var19]) + (double) (class422.field6039[var19] * 2 + 1) * Math.random() + Math.sin((double) class184.field2458[var19] / 100.0D * (double) class314.field4525[var19]) * (double) class103.field1417[var19]);
                    if (~var19 == -2) {
                        class405.field5867 += var23 << 2;
                    }
                    if (~var19 == -4) {
                        class718.field10019 = class718.field10019 - -var23 & 16383;
                    }
                    if (var19 == 2) {
                        class350.field5138 += var23 << 2;
                    }
                    if (var19 == 0) {
                        class634.field8856 += var23 << 2;
                    }
                    if (var19 == 4) {
                        class253.field3733 += var23;
                        if (class253.field3733 >= 1024) {
                            if (class253.field3733 > 3072) {
                                class253.field3733 = 3072;
                            }
                        } else {
                            class253.field3733 = 1024;
                        }
                    }
                }
            }
            if (~class634.field8856 > -1) {
                class634.field8856 = 0;
            }
            if (class350.field5138 < 0) {
                class350.field5138 = 0;
            }
            if (class634.field8856 > (class405.field5875 << 9) + -1) {
                class634.field8856 = (class405.field5875 << 9) + -1;
            }
            int var20 = -79 / ((arg0 - -68) / 55);
            if (~class350.field5138 < ~((class710.field9947 << 9) + -1)) {
                class350.field5138 = (class710.field9947 << 9) + -1;
            }
            class105.method804(94);
            class122.method999(1204339692);
            class379.field5542.method456(var8, var9, var6 + var8, var7 + var9);
            class565.method3163(true, (byte) -102);
            if (!class130.field1934) {
                class379.field5542.method483();
                int var21 = class380.field5557;
                if (class296.field4302 == null) {
                    class379.field5542.method458(var21);
                } else {
                    class296.field4302.method3948(-121, class253.field3733, class379.field5542, class319.field4602 << 3, var8, class718.field10019, var6, var9, var7, var21);
                }
            } else {
                class478.method2790(class380.field5557, (byte) 6);
                if (~class330.field4773 != ~class308.field4449) {
                    class768.field10591 = true;
                }
                class308.field4449 = class330.field4773;
            }
            class230.method1508((byte) -68);
            class334.field4865.method984(class634.field8856, class405.field5867, class350.field5138, -class253.field3733 & 16383, -class718.field10019 & 16383, 16383 & -class162.field2209);
            class379.field5542.method526(class334.field4865);
            class379.field5542.method540(var6 / 2 + var8, var7 / 2 + var9, class165.field2233 << 1, class165.field2233 << 1);
            class319.method2027(var8 - -(var6 / 2), var9 - -(var7 / 2), 3, class165.field2233 << 1, class165.field2233 << 1);
            class369.method2298(-class253.field3733 & 16383, -class718.field10019 & 16383, -class162.field2209 & 16383, (byte) 110, class634.field8856, class350.field5138, class405.field5867);
            byte var22 = class712.field9959.field1313.method1949(9) == 2 ? (byte) class320.field4604 : 1;
            if (class130.field1934) {
                class668.method3717(16383 & -class253.field3733, -class162.field2209 & 16383, (byte) 66, 16383 & -class718.field10019);
                class719.method4013(var22, class5.field53, class405.field5867, class625.field8439, class350.field5138, class778.field10683, class330.field4773, class597.field8135, class551.field7456.field2250 + 1, class551.field7456.field2257 >> 9, class364.field5305, class100.field1401, true, class712.field9959.field1281.method3011(42) == 0, class121.field1768, class551.field7456.field2259 >> 9, 0, class634.field8856);
            } else {
                class743.method4113(class100.field1401, class634.field8856, class405.field5867, class350.field5138, class625.field8439, class778.field10683, class121.field1768, class364.field5305, class5.field53, class597.field8135, class551.field7456.field2250 - -1, var22, class551.field7456.field2257 >> 9, class551.field7456.field2259 >> 9, ~class712.field9959.field1281.method3011(95) == -1, true, !class200.field2658 ? -1 : class330.field4773, 0, false);
            }
            class230.method1508((byte) -110);
            if (class458.field6355 == 10) {
                class52.method378(256, var7, 2, var8, var6, var9, 256);
                class279.method1807(var9, var8, 256, -80, var7, 256, var6);
                class705.method3951(256, var8, 1780724097, var7, var6, 256, var9);
                class751.method4176(var6, var7, var9, -8, var8);
            }
            class315.method1989();
            class405.field5867 = var15;
            class718.field10019 = var18;
            class350.field5138 = var16;
            class634.field8856 = var14;
            class253.field3733 = var17;
            if (class685.field9630 && class647.field8984.method3276(0) == 0) {
                class685.field9630 = false;
            }
            if (class685.field9630) {
                class379.field5542.method462(-126, var6, var9, var7, var8, -16777216);
                class660.method3653(class105.field1452, class379.field5542, class7.field76, false, -67, class474.field6551.method2780(96, class38.field589));
            }
            class565.method3163(false, (byte) -102);
        } else {
            class379.field5542.method462(-128, arg4, arg3, arg5, arg1, -16777216);
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(BI)[I", line = 857)
    public final int[] method100(byte arg0, int arg1) {
        ++field7204;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (super.field4727.field6067) {
            int[][] var4 = super.field4727.method2602(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class261.field3874 * this.field7211 >> 12;
            int var15 = class261.field3874 * this.field7199 >> 12;
            int var16 = class657.field9077 * this.field7201 >> 12;
            int var17 = class657.field9077 * this.field7213 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            } else {
                this.field7215 = class261.field3874 / 8 * this.field7197 >> 12;
                int var18 = class261.field3874 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field7203);
                while (true) {
                    while (true) {
                        int var22 = var14 + class739.method4090(var21, -110, var15 - var14);
                        int var23 = class739.method4090(var21, 36, var17 - var16) + var16;
                        int var24 = var8 - -var22;
                        if (class261.field3874 < var24) {
                            var22 = -var8 + class261.field3874;
                            var24 = class261.field3874;
                        }
                        int var10000;
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var5 + var24;
                            if (~var29 > -1) {
                                var29 += class261.field3874;
                            }
                            if (~class261.field3874 > ~var29) {
                                var29 -= class261.field3874;
                            }
                            var25 = var27[2];
                            while (true) {
                                int[] var30 = var20[var26];
                                if (var30[0] <= var29 && ~var30[1] <= ~var29) {
                                    if (var9 != var26) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class261.field3874;
                                        }
                                        if (var31 > class261.field3874) {
                                            var31 -= class261.field3874;
                                        }
                                        for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                            int[] var34 = var20[(var9 - -var33) % var12];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 <= ~var29) {
                                                    if (~var36 != -1) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class261.field3874;
                                                    } else {
                                                        var39 = Math.min(var29, var37);
                                                        var38 = 0;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method3030(2, var35, var4, var21, var39 - var38, -var35 + var25, var38 - -var7);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                var10000 = ~var12;
                                ++var26;
                                if (var10000 >= ~var26) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~class657.field9077 <= ~(var25 - -var23)) {
                            var10 = false;
                        } else {
                            var23 = -var25 + class657.field9077;
                        }
                        if (class261.field3874 == var24) {
                            this.method3030(2, var25, var4, var21, var22, var23, var6 + var8);
                            if (var10) {
                                return arg0 < 21 ? null : var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var25;
                            var41[1] = var24;
                            var41[0] = var8;
                            int[][] var42 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var42;
                            var7 = var6;
                            var13 = 0;
                            var6 = class739.method4090(var21, -120, class261.field3874);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var43 = var5;
                            if (var5 < 0) {
                                var43 = class261.field3874 + var5;
                            }
                            if (~var43 < ~class261.field3874) {
                                var43 -= class261.field3874;
                            }
                            var9 = 0;
                            var11 = false;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var44[0] >= ~var43 && var43 <= var44[1]) {
                                    break;
                                }
                                var10000 = ~var12;
                                ++var9;
                                if (var10000 >= ~var9) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[0] = var8;
                            var45[1] = var24;
                            var45[2] = var23 + var25;
                            this.method3030(2, var25, var4, var21, var22, var23, var8 - -var6);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return arg0 < 21 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Z)V", line = 1116)
    public final void method101(boolean arg0) {
        ++field7209;
        if (!arg0) {
            field7210 = -124;
        }
    }
}
