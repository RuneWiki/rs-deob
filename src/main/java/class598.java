import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class598 implements Runnable {

    @OriginalMember(owner = "client!it", name = "u", descriptor = "Lida;")
    private class211 field8457 = new class73();

    @OriginalMember(owner = "client!it", name = "y", descriptor = "Lida;")
    private class211 field8461 = null;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "I")
    public static int field8450 = 0;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "[Z")
    public static boolean[] field8449 = new boolean[5];

    @OriginalMember(owner = "client!it", name = "t", descriptor = "F")
    public static float field8456;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field8437;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field8439;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field8440;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field8441;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field8442;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "I")
    public static int field8445;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    public static int field8446;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field8447;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "I")
    public static int field8448;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "I")
    public static int field8452;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!it", name = "s", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!it", name = "v", descriptor = "I")
    private int field8458;

    @OriginalMember(owner = "client!it", name = "B", descriptor = "I")
    private int field8464;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "J")
    public static long field8454;

    @OriginalMember(owner = "client!it", name = "w", descriptor = "J")
    private long field8459;

    @OriginalMember(owner = "client!it", name = "x", descriptor = "J")
    private long field8460;

    @OriginalMember(owner = "client!it", name = "z", descriptor = "Lfga;")
    private class229 field8462;

    @OriginalMember(owner = "client!it", name = "A", descriptor = "Ljava/lang/String;")
    private String field8463;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "Z")
    private volatile boolean field8438;

    @OriginalMember(owner = "client!it", name = "o", descriptor = "Z")
    private boolean field8451;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)I")
    public final int method3374(int arg0) {
        field8441++;
        if (this.field8462 == null) {
            return 0;
        }
        int var2 = this.field8462.method1585(94);
        if (this.field8462.field3570 && this.field8458 < this.field8462.field3564) {
            return this.field8458 + 1;
        }
        if (arg0 != 0) {
            this.field8451 = true;
        }
        if (var2 >= 0 && class412.field6003.length - 1 > var2) {
            return this.field8462.field3560 == this.field8458 ? this.field8462.field3564 : this.field8462.field3560;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)Z")
    public final synchronized boolean method3375(int arg0) {
        field8443++;
        if (arg0 != -1) {
            this.field8461 = null;
        }
        return this.field8457.method696(-50, this.field8459);
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
    public final synchronized void method3376(int arg0) {
        if (arg0 != 2) {
            field8449 = null;
        }
        field8445++;
        this.field8451 = true;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILida;)V")
    public final synchronized void method3377(int arg0, class211 arg1) {
        this.field8461 = this.field8457;
        if (arg0 > 18) {
            field8452++;
            this.field8457 = arg1;
            this.field8459 = class490.method2840(true);
        }
    }

    @OriginalMember(owner = "client!it", name = "run", descriptor = "()V")
    public final void run() {
        field8439++;
        while (!this.field8438) {
            long var1 = class490.method2840(true);
            synchronized (this) {
                try {
                    if (this.field8457 instanceof class73) {
                        this.field8457.method704(this.field8451, (byte) -48);
                    } else {
                        this.field8464++;
                        long var4 = class490.method2840(true);
                        if (class282.field4228 == null || this.field8461 == null || this.field8461.method700(false) == 0 || this.field8459 < var4 - ((long) this.field8461.method700(false))) {
                            if (this.field8461 != null) {
                                this.field8451 = true;
                                this.field8461.method703(104);
                                this.field8461 = null;
                            }
                            if (this.field8451) {
                                class157.method1089(0);
                                if (class282.field4228 != null) {
                                    class282.field4228.method139(0);
                                }
                            }
                            this.field8457.method704(this.field8451 || class282.field4228 != null && class282.field4228.method166(), (byte) -48);
                        } else {
                            int var6 = (int) ((var4 - this.field8459) * 255L / (long) this.field8461.method700(false));
                            int var7 = 255 - var6;
                            int var8 = var6 << 24 | 0xFFFFFF;
                            class157.method1089(0);
                            int var9 = var7 << 24 | 0xFFFFFF;
                            class282.field4228.method139(0);
                            class702 var10 = class282.field4228.method175(class487.field6930, class31.field494, true);
                            class282.field4228.method1152(-114, var10);
                            this.field8461.method704(true, (byte) -48);
                            class282.field4228.method213();
                            var10.method929(0, 0, 0, var9, 1);
                            class282.field4228.method1152(-51, var10);
                            class282.field4228.method139(0);
                            this.field8457.method704(true, (byte) -48);
                            class282.field4228.method213();
                            var10.method929(0, 0, 0, var8, 1);
                        }
                        try {
                            if (class282.field4228 != null && !(this.field8457 instanceof class73)) {
                                class282.field4228.method203();
                            }
                        } catch (class621 var17) {
                            class699.method3896(87, var17, var17.getMessage() + " (Recovered) " + class565.field7967.method1774(83));
                            class33.method363(-30052, 0);
                        }
                    }
                    this.field8451 = false;
                } catch (Exception var18) {
                    continue;
                }
            }
            long var12 = class490.method2840(true);
            int var14 = (int) (var1 + 20L - var12);
            if (var14 > 0) {
                class561.method3202((long) var14, (byte) -59);
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "(I)J")
    public final long method3378(int arg0) {
        int var2 = 11 / ((arg0 + 24) / 33);
        field8442++;
        return this.field8460;
    }

    @OriginalMember(owner = "client!it", name = "e", descriptor = "(I)Lfga;")
    public final class229 method3379(int arg0) {
        field8455++;
        return arg0 < 9 ? null : this.field8462;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILvg;BI)V")
    public static final void method3380(int arg0, class49 arg1, byte arg2, int arg3) {
        if (arg1.field940 == 0) {
            arg1.field957 = arg1.field869;
        } else if (arg1.field940 == 1) {
            arg1.field957 = (arg3 - arg1.field967) / 2 + arg1.field869;
        } else if (arg1.field940 == 2) {
            arg1.field957 = arg3 - arg1.field967 - arg1.field869;
        } else if (arg1.field940 == 3) {
            arg1.field957 = arg1.field869 * arg3 >> 14;
        } else if (arg1.field940 == 4) {
            arg1.field957 = (arg1.field869 * arg3 >> 14) + (arg3 - arg1.field967) / 2;
        } else {
            arg1.field957 = arg3 - (arg1.field869 * arg3 >> 14) - arg1.field967;
        }
        if (arg1.field873 == 0) {
            arg1.field920 = arg1.field926;
        } else if (arg1.field873 == 1) {
            arg1.field920 = (arg0 - arg1.field877) / 2 + arg1.field926;
        } else if (arg1.field873 == 2) {
            arg1.field920 = arg0 - arg1.field926 - arg1.field877;
        } else if (arg1.field873 == 3) {
            arg1.field920 = arg1.field926 * arg0 >> 14;
        } else if (arg1.field873 == 4) {
            arg1.field920 = (arg1.field926 * arg0 >> 14) + (arg0 - arg1.field877) / 2;
        } else {
            arg1.field920 = arg0 - arg1.field877 - (arg1.field926 * arg0 >> 14);
        }
        field8447++;
        int var4 = 107 % ((-arg2 - 53) / 39);
        if (!class681.field9611) {
            return;
        }
        if (client.method1767(arg1).field1943 == 0 && arg1.field980 != 0) {
            return;
        }
        if (arg1.field957 < 0) {
            arg1.field957 = 0;
        } else if (arg3 < (arg1.field957 + arg1.field967)) {
            arg1.field957 = arg3 - arg1.field967;
        }
        if (arg1.field920 < 0) {
            arg1.field920 = 0;
            return;
        }
        if (arg0 < (arg1.field920 + arg1.field877)) {
            arg1.field920 = arg0 - arg1.field877;
            return;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lmw;Z)Z")
    public static final boolean method3381(class454 arg0, boolean arg1) {
        boolean var2 = class499.field7071 == class296.field4340;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method2555(0);
        if (arg0.field6524 < 0 || arg0.field6521 < 0 || arg0.field6526 >= class302.field4492 || arg0.field6516 >= class8.field82) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field6524; var7 <= arg0.field6526; var7++) {
            for (int var11 = arg0.field6521; var11 <= arg0.field6516; var11++) {
                class40 var12 = class151.method1065(arg0.field3019, var7, var11);
                if (var12 != null) {
                    class106 var13 = class147.method1056((byte) -123, arg0);
                    class106 var14 = var12.field671;
                    if (var14 == null) {
                        var12.field671 = var13;
                    } else {
                        while (var14.field1641 != null) {
                            var14 = var14.field1641;
                        }
                        var14.field1641 = var13;
                    }
                    if (var2 && (class161.field2313[var7][var11] & 0xFF000000) != 0) {
                        var3 = class161.field2313[var7][var11];
                        var4 = class386.field5441[var7][var11];
                        var5 = class252.field3889[var7][var11];
                    }
                    if (!arg1 && var12.field663 != null && var12.field663.field9906 > var6) {
                        var6 = var12.field663.field9906;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field6524; var8 <= arg0.field6526; var8++) {
                for (int var9 = arg0.field6521; var9 <= arg0.field6516; var9++) {
                    if ((class161.field2313[var8][var9] & 0xFF000000) == 0) {
                        class161.field2313[var8][var9] = var3;
                        class386.field5441[var8][var9] = var4;
                        class252.field3889[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class518.field7307[class282.field4237++] = arg0;
        } else {
            int var10 = class499.field7071 == class296.field4340 ? 1 : 0;
            if (!arg0.method1181(-1)) {
                class471.field6741[var10][class127.field1896[var10]++] = arg0;
            } else if (arg0.method1184(-101)) {
                class232.field3618[var10][class59.field1130[var10]++] = arg0;
            } else {
                class496.field7034[var10][class313.field4626[var10]++] = arg0;
            }
        }
        if (arg1) {
            arg0.field3018 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)V")
    public static final void method3382(byte arg0, int arg1) {
        class229.field3593.method2290(false, arg1);
        int var2 = -88 % ((arg0 - 2) / 44);
        field8444++;
    }

    @OriginalMember(owner = "client!it", name = "f", descriptor = "(I)V")
    public static void method3383(int arg0) {
        field8449 = null;
        if (arg0 != 2929) {
            method3381(null, false);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)V")
    public final void method3384(boolean arg0) {
        field8446++;
        this.field8438 = arg0;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)I")
    public final int method3385(byte arg0) {
        field8440++;
        if (arg0 != 0) {
            this.method3388(61L, null, 23, null, -37);
        }
        return this.field8464;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(Z)I")
    public final int method3386(boolean arg0) {
        if (arg0) {
            return 112;
        } else {
            field8437++;
            return this.field8458;
        }
    }

    @OriginalMember(owner = "client!it", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method3387(int arg0) {
        field8448++;
        if (arg0 != 0) {
            field8450 = 102;
        }
        return this.field8463;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(JLjava/lang/String;ILfga;I)V")
    public final synchronized void method3388(long arg0, String arg1, int arg2, class229 arg3, int arg4) {
        this.field8463 = arg1;
        if (arg4 != 0) {
            this.method3376(102);
        }
        field8453++;
        this.field8458 = arg2;
        this.field8462 = arg3;
        this.field8460 = arg0;
    }
}
