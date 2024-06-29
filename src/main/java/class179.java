import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class179 {

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    private int field3115 = -1;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    private int field3112 = 0;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field3110 = 0;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field3123 = 20;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public int field3117;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public int field3119;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public int field3121;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Z")
    public static boolean field3116;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)I")
    public static int method1194(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZLik;)V")
    public static final void method1195(boolean arg0, class261 arg1) {
        if (arg0) {
            field3110 = -117;
        }
        field3111++;
        while (true) {
            while (arg1.field4619.length > arg1.field4587) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1693((byte) 101) == 1) {
                    var4 = arg1.method1693((byte) -80);
                    var3 = arg1.method1693((byte) 89);
                    var2 = true;
                }
                int var5 = arg1.method1693((byte) -93);
                int var6 = arg1.method1693((byte) 106);
                int var7 = class230.field3983 - (1 - class112.field2026) - var6 * 64;
                int var8 = var5 * 64 - class48.field802;
                if (var8 >= 0 && (var7 - 63) >= 0 && class218.field3794 > (var8 + 63) && class230.field3983 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var4 * 8) <= var11 && var11 < (var4 * 8 + 8) && (var3 * 8) <= var12 && var3 * 8 + 8 > var12) {
                                byte var13 = arg1.method1706(10819);
                                if (var13 != 0) {
                                    if (class13.field126[var9][var10] == null) {
                                        class13.field126[var9][var10] = new byte[4096];
                                    }
                                    class13.field126[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1706(10819);
                                    if (class273.field4825[var9][var10] == null) {
                                        class273.field4825[var9][var10] = new byte[4096];
                                    }
                                    class273.field4825[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1706(10819);
                        if (var16 != 0) {
                            arg1.field4587++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILik;II)V")
    private final void method1196(int arg0, class261 arg1, int arg2, int arg3) {
        int var5 = -102 % ((23 - arg3) / 47);
        if (arg0 == 1) {
            this.field3112 = arg1.method1747(false);
            this.method1201(this.field3112, (byte) 89);
        } else if (arg0 == 2) {
            this.field3115 = arg1.method1740((byte) 103);
            if (this.field3115 == 65535) {
                this.field3115 = -1;
            }
        } else if (arg0 == 3) {
            arg1.method1740((byte) 115);
        }
        field3114++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static final void method1197(int arg0) {
        int var1 = -84 / ((-arg0 - 51) / 56);
        field3118++;
        if (class156.field2808 == 30) {
            class138.method943(0, 25);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)Lki;")
    public static final class62 method1198(int arg0, int arg1, int arg2) {
        class216 var3 = class128.field2236[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3758;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ltg;Loa;B)Lue;")
    public static final class88 method1199(class182 arg0, class99 arg1, byte arg2) {
        field3124++;
        int var3 = arg0.method1245(arg1, false);
        if (var3 == -1) {
            return new class88(0);
        }
        int[] var4 = arg0.method1252(true, var3);
        class88 var5 = new class88(var4.length);
        int var6 = -74 / ((arg2 - 11) / 58);
        for (int var7 = 0; var7 < var5.field1524; var7++) {
            class261 var8 = new class261(arg0.method1242(var4[var7], var3, 6801));
            var5.field1529[var7] = var8.method1705(4);
            var5.field1516[var7] = var8.method1706(10819);
            var5.field1523[var7] = (short) var8.method1740((byte) 112);
            var5.field1517[var7] = (short) var8.method1740((byte) 63);
            var5.field1525[var7] = var8.method1712(-4);
        }
        return var5;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILik;I)V")
    public final void method1200(int arg0, class261 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1693((byte) 34);
            if (var4 == 0) {
                field3113++;
                if (arg0 != 0) {
                    method1198(-50, 6, 59);
                    return;
                }
                return;
            }
            this.method1196(var4, arg1, arg2, 93);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)V")
    private final void method1201(int arg0, byte arg1) {
        field3120++;
        if (arg1 < 60) {
            return;
        }
        double var3 = (double) ((arg0 & 0xFF1ED3) >> 16) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF76) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        double var13 = 0.0D;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var3 < var5) {
            var11 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var15 = 0.0D;
        if (var11 < var7) {
            var11 = var7;
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field3121 = (int) (var17 * 256.0D);
        if (this.field3121 < 0) {
            this.field3121 = 0;
        } else if (this.field3121 > 255) {
            this.field3121 = 255;
        }
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field3108 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field3108 < 0) {
            this.field3108 = 0;
        } else if (this.field3108 > 255) {
            this.field3108 = 255;
        }
        if (var17 > 0.5D) {
            this.field3119 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3119 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3119 < 1) {
            this.field3119 = 1;
        }
        this.field3117 = (int) ((double) this.field3119 * var19);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3125++;
        int var9 = arg1 - arg2;
        int var10 = arg0 - arg8;
        int var11 = (arg3 - arg7 << 16) / var10;
        int var12 = (arg6 - arg5 << 16) / var9;
        if (arg4 != 32390) {
            field3123 = -84;
        }
        class200.method1343(arg0, arg8, (byte) -128, arg5, arg7, 0, 0, var12, arg2, var11, arg1);
    }
}
