import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class67 extends class84 {

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    private int field973 = 0;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    private int field977 = 4096;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    private int field979 = 8192;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    private int field978 = 12288;

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "I")
    private int field983 = 2048;

    @OriginalMember(owner = "client!ri", name = "bb", descriptor = "I")
    private int field987 = 2048;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    private int field981 = 0;

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "[J")
    public static long[] field984 = new long[256];

    @OriginalMember(owner = "client!ri", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field986 = "Allocated memory";

    @OriginalMember(owner = "client!ri", name = "fb", descriptor = "Lnj;")
    public static class144 field991;

    @OriginalMember(owner = "client!ri", name = "gb", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!ri", name = "cb", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!ri", name = "db", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!ri", name = "eb", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!ri", name = "hb", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!ri", name = "jb", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!ri", name = "ib", descriptor = "Lwc;")
    public static class237 field994;

    @OriginalMember(owner = "client!ri", name = "kb", descriptor = "Llc;")
    public static class86 field996;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "[I")
    public static int[] field980;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(IB)V")
    public static final void method475(int arg0, byte arg1) {
        class59.field832.method1548(arg0, 0);
        if (arg1 >= 65) {
            ++field995;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        ++field982;
        if (arg0 > -125) {
            field986 = null;
        }
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (super.field1228.field3651) {
            int var4 = class26.field301[arg1] + -2048;
            for (int var5 = 0; ~var5 > ~class20.field221; ++var5) {
                int var6 = class184.field2967[var5] - 2048;
                int var7 = var6 - -this.field983;
                int var8 = var7 >= -2048 ? var7 : var7 - -4096;
                int var9 = var6 - -this.field973;
                int var10 = var8 > 2048 ? var8 + -4096 : var8;
                int var11 = var9 >= -2048 ? var9 : var9 + 4096;
                int var12 = this.field981 + var4;
                int var13 = var4 - -this.field987;
                int var14 = var13 >= -2048 ? var13 : var13 - -4096;
                int var15 = var14 > 2048 ? var14 + -4096 : var14;
                int var16 = ~var12 > 2047 ? var12 + 4096 : var12;
                int var17 = ~var11 >= -2049 ? var11 : var11 - 4096;
                int var18 = ~var16 >= -2049 ? var16 : var16 - 4096;
                var3[var5] = !this.method477(var10, var18, 31449) && !this.method483(var15, var17, (byte) 94) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)I")
    public static final int method476(int arg0, int arg1, int arg2) {
        ++field975;
        if (~arg2 < ~arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        if (arg1 != -6) {
            method480((class86) null, -114, -92);
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(III)Z")
    private final boolean method477(int arg0, int arg1, int arg2) {
        if (arg2 != 31449) {
            method482((class243) null, (class86) null, (class86) null, (class86) null, (byte) 14);
        }
        ++field985;
        int var4 = (-arg0 + arg1) * this.field978 >> 12;
        int var5 = class24.field282[(var4 * 255 & 1046458) >> 12];
        int var6 = (var5 << 12) / this.field978;
        int var7 = (var6 << 12) / this.field979;
        int var8 = this.field977 * var7 >> 12;
        return ~var8 < ~(arg0 + arg1) && arg0 + arg1 > -var8;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        ++field972;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field979 = arg0.method1126(false);
                                }
                            } else {
                                this.field977 = arg0.method1126(false);
                            }
                        } else {
                            this.field978 = arg0.method1126(false);
                        }
                    } else {
                        this.field987 = arg0.method1126(false);
                    }
                } else {
                    this.field973 = arg0.method1126(false);
                }
            } else {
                this.field981 = arg0.method1126(false);
            }
        } else {
            this.field983 = arg0.method1126(false);
        }
        if (arg1 < 87) {
            field984 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "(I)V")
    public static void method478(int arg0) {
        field980 = null;
        int var1 = -56 % ((12 - arg0) / 48);
        field996 = null;
        field994 = null;
        field986 = null;
        field984 = null;
        field991 = null;
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(III)V")
    public static final void method479(int arg0, int arg1, int arg2) {
        if (client.field2578 > 0) {
            class216.method1554((byte) -122, client.field2578);
            client.field2578 = 0;
        }
        ++field993;
        if (arg2 != 26404) {
            method476(-82, -50, -12);
        }
        int var3 = class70.field1030 * arg0;
        short var4 = 256;
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 1; ~var7 > ~(var4 + -1); ++var7) {
            int var8 = (-var7 + var4) * class26.field300[var7] / var4;
            if (var8 < 0) {
                var8 = 0;
            }
            var6 += var8;
            for (int var9 = var8; ~var9 > -129; ++var9) {
                int var11 = class220.field3527[var6++];
                int var12 = class70.field1031[arg1 + var3++];
                if (var11 != 0) {
                    int var13 = var11 - -18;
                    int var14 = -18 - var11 + 256;
                    int var15 = class181.field2923[var11];
                    if (~var13 < -256) {
                        var13 = 255;
                    }
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class169.field2728.field2251[var5++] = class179.method1337(-16711936, class179.method1337(16711935, var15) * var13 - -(var14 * class179.method1337(16711935, var12))) + class179.method1337(var14 * class179.method1337(65280, var12) + var13 * class179.method1337(var15, 65280), 16711680) >> 8;
                } else {
                    class169.field2728.field2251[var5++] = var12;
                }
            }
            for (int var10 = 0; var10 < var8; ++var10) {
                class169.field2728.field2251[var5++] = class70.field1031[arg1 - -(var3++)];
            }
            var3 += class70.field1030 + -128;
        }
        class169.field2728.method69(arg1, arg0);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Llc;II)Lsi;")
    public static final class204 method480(class86 arg0, int arg1, int arg2) {
        ++field974;
        if (!class149.method1060(arg1, -114, arg0)) {
            return null;
        } else {
            if (arg2 != -129) {
                method479(-26, 38, -84);
            }
            return class166.method1221(arg2 + 232);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        class239.method1677((byte) 80);
        ++field976;
        if (arg0) {
            field996 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class67() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ldc;Llc;Llc;Llc;B)Z")
    public static final boolean method482(class243 arg0, class86 arg1, class86 arg2, class86 arg3, byte arg4) {
        class254.field4191 = arg0;
        ++field989;
        class209.field3352 = arg3;
        field996 = arg2;
        if (arg4 != 80) {
            field980 = null;
        }
        class132.field2178 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIB)Z")
    private final boolean method483(int arg0, int arg1, byte arg2) {
        if (arg2 != 94) {
            return false;
        } else {
            ++field990;
            int var4 = (arg0 + arg1) * this.field978 >> 12;
            int var5 = class24.field282[(1047172 & var4 * 255) >> 12];
            int var6 = (var5 << 12) / this.field978;
            int var7 = (var6 << 12) / this.field979;
            int var8 = this.field977 * var7 >> 12;
            return var8 > -arg1 + arg0 && ~(-arg1 + arg0) < ~(-var8);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; ++var3) {
                if (~(1L & var1) == -2L) {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field984[var0] = var1;
        }
        field991 = new class144(32);
        field992 = 0;
    }
}
