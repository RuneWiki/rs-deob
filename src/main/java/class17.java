import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class17 {

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
    private int field242 = 0;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "[Lim;")
    public class183[] field226;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public int field231;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field224 = 0;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "Z")
    public static boolean field239 = false;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field235 = 2301979;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "J")
    private long field237;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Lim;")
    private class183 field221;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "Lim;")
    private class183 field243;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)Lim;", line = 4)
    public final class183 method110(int arg0) {
        this.field242 = arg0;
        field222++;
        return this.method115(0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IJ)Lim;", line = 14)
    public final class183 method111(int arg0, long arg1) {
        this.field237 = arg1;
        class183 var4 = this.field226[(int) ((long) (this.field231 - 1) & arg1)];
        int var5 = -22 % ((arg0 + 67) / 36);
        field233++;
        for (this.field221 = var4.field2523; this.field221 != var4; this.field221 = this.field221.field2523) {
            if (this.field221.field2522 == arg1) {
                class183 var6 = this.field221;
                this.field221 = this.field221.field2523;
                return var6;
            }
        }
        this.field221 = null;
        return null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLcg;)V", line = 44)
    public static final void method112(byte arg0, class316 arg1) {
        field223++;
        while (true) {
            while (arg1.field4798.length > arg1.field4777) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method2219(16448) == 1) {
                    var2 = true;
                    var3 = arg1.method2219(16448);
                    var4 = arg1.method2219(arg0 + 16516);
                }
                int var5 = arg1.method2219(16448);
                int var6 = arg1.method2219(16448);
                int var7 = var5 * 64 - class174.field2374;
                int var8 = class56.field765 + class42.field481 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class20.field258 > var7 + 63 && class56.field765 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && (var3 * 8 + 8) > var11 && var12 >= (var4 * 8) && var12 < var4 * 8 + 8) {
                                byte var13 = arg1.method2192(3);
                                if (var13 != 0) {
                                    if (class256.field3703[var9][var10] == null) {
                                        class256.field3703[var9][var10] = new byte[4096];
                                    }
                                    class256.field3703[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method2192(arg0 ^ 0xFFFFFFBF);
                                    if (class194.field2704[var9][var10] == null) {
                                        class194.field2704[var9][var10] = new byte[4096];
                                    }
                                    class194.field2704[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method2192(3);
                        if (var16 != 0) {
                            arg1.field4777++;
                        }
                    }
                }
            }
            if (arg0 != -68) {
                field224 = 3;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)I", line = 145)
    public final int method113(boolean arg0) {
        if (!arg0) {
            this.field237 = 95L;
        }
        field238++;
        return this.field231;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)I", line = 158)
    public final int method114(int arg0) {
        field229++;
        int var2 = 68 / ((-arg0 - 71) / 46);
        int var3 = 0;
        for (int var4 = 0; var4 < this.field231; var4++) {
            class183 var5 = this.field226[var4];
            for (class183 var6 = var5.field2523; var6 != var5; var6 = var6.field2523) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)Lim;", line = 191)
    public final class183 method115(int arg0) {
        field230++;
        if (this.field242 > arg0 && this.field226[this.field242 - 1] != this.field243) {
            class183 var2 = this.field243;
            this.field243 = var2.field2523;
            return var2;
        }
        class183 var3;
        do {
            if (this.field242 >= this.field231) {
                return null;
            }
            var3 = this.field226[this.field242++].field2523;
        } while (this.field226[this.field242 - 1] == var3);
        this.field243 = var3.field2523;
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I", line = 222)
    public static final int method116(int arg0, int arg1) {
        if (arg1 == 1) {
            field240++;
            return arg0 >>> 8;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([Lim;B)I", line = 233)
    public final int method117(class183[] arg0, byte arg1) {
        field225++;
        int var3 = 0;
        int var4 = 61 / ((arg1 + 33) / 44);
        for (int var5 = 0; var5 < this.field231; var5++) {
            class183 var6 = this.field226[var5];
            for (class183 var7 = var6.field2523; var7 != var6; var7 = var7.field2523) {
                arg0[var3++] = var7;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 271)
    public final void method118(byte arg0) {
        int var2 = 0;
        if (arg0 >= -11) {
            return;
        }
        while (var2 < this.field231) {
            class183 var3 = this.field226[var2];
            while (true) {
                class183 var4 = var3.field2523;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method1274((byte) -26);
            }
        }
        this.field243 = null;
        this.field221 = null;
        field234++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLin;)V", line = 303)
    public static final void method119(byte arg0, class344 arg1) {
        if (arg0 > -75) {
            return;
        }
        class344 var2 = class310.method2131(-104, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class64.field836;
            var4 = class187.field2592;
        } else {
            var4 = var2.field5334;
            var3 = var2.field5293;
        }
        field232++;
        class202.method1435(var4, var3, false, arg1, (byte) 121);
        class33.method187(222, var3, arg1, var4);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(JLim;I)V", line = 332)
    public final void method120(long arg0, class183 arg1, int arg2) {
        if (arg1.field2518 != null) {
            arg1.method1274((byte) -26);
        }
        class183 var5 = this.field226[(int) ((long) (this.field231 - 1) & arg0)];
        arg1.field2518 = var5.field2518;
        arg1.field2522 = arg0;
        field236++;
        arg1.field2523 = var5;
        if (arg2 != -22851) {
            this.field231 = -53;
        }
        arg1.field2518.field2523 = arg1;
        arg1.field2523.field2518 = arg1;
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)Lim;", line = 361)
    public final class183 method121(int arg0) {
        field227++;
        if (arg0 < 116) {
            return (class183) null;
        } else if (this.field221 == null) {
            return null;
        } else {
            class183 var2 = this.field226[(int) (this.field237 & (long) (this.field231 - 1))];
            while (this.field221 != var2) {
                if (this.field221.field2522 == this.field237) {
                    class183 var3 = this.field221;
                    this.field221 = this.field221.field2523;
                    return var3;
                }
                this.field221 = this.field221.field2523;
            }
            this.field221 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V", line = 393)
    public class17(int arg0) {
        this.field226 = new class183[arg0];
        this.field231 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class183 var3 = this.field226[var2] = new class183();
            var3.field2518 = var3;
            var3.field2523 = var3;
        }
    }
}
