import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class170 extends class99 {

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "[J")
    private long[] field3015 = new long[10];

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    private int field3023 = 0;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
    private int field3022 = 1;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    private int field3020 = 256;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "J")
    private long field3008 = class224.method1536(false);

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "Lke;")
    public static class256 field3010 = class316.method2202("Polices charg-Bes", 27626);

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "Lke;")
    public static class256 field3014 = class316.method2202("scrollbar", 27626);

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "Lke;")
    public static class256 field3018 = class316.method2202("W-=hlen Sie eine Option", 27626);

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    private int field3016;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "Lng;")
    public static class138 field3009;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "Lvf;")
    public static class61 field3017;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 6)
    public final void method709(int arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field3015[var2] = 0L;
        }
        field3021++;
        if (arg0 != 2) {
            method1241((class138) null, (byte) 76);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZLra;)V", line = 24)
    public static final void method1237(boolean arg0, class41 arg1) {
        if (!arg0) {
            return;
        }
        while (true) {
            while (arg1.field772.length > arg1.field738) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg1.method357(!arg0) == 1) {
                    var2 = arg1.method357(false);
                    var4 = arg1.method357(!arg0);
                    var3 = true;
                }
                int var5 = arg1.method357(false);
                int var6 = arg1.method357(false);
                int var7 = var5 * 64 - class313.field5383;
                int var8 = class8.field133 + class154.field2753 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && (var7 + 63) < class40.field731 && var8 < class154.field2753) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var11 >= var2 * 8 && (var2 * 8 + 8) > var11 && var12 >= var4 * 8 && var4 * 8 + 8 > var12) {
                                byte var13 = arg1.method323(9092);
                                if (var13 != 0) {
                                    if (class126.field2242[var10][var9] == null) {
                                        class126.field2242[var10][var9] = new byte[4096];
                                    }
                                    class126.field2242[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method323(9092);
                                    if (class185.field3260[var10][var9] == null) {
                                        class185.field3260[var10][var9] = new byte[4096];
                                    }
                                    class185.field3260[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method323(9092);
                        if (var16 != 0) {
                            arg1.field738++;
                        }
                    }
                }
            }
            field3019++;
            return;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V", line = 124)
    public static final void method1238(int arg0, int arg1) {
        if (class83.field1518 == 0) {
            class188.field3429.method1950(16384, arg0);
        } else {
            class121.field2129 = arg0;
        }
        if (arg1 == -28708) {
            field3007++;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IBI)I", line = 145)
    public final int method715(int arg0, byte arg1, int arg2) {
        if (arg1 <= 22) {
            return -93;
        }
        field3012++;
        int var4 = this.field3020;
        this.field3020 = 300;
        int var5 = this.field3022;
        this.field3022 = 1;
        this.field3008 = class224.method1536(false);
        if (this.field3015[this.field3016] == 0L) {
            this.field3022 = var5;
            this.field3020 = var4;
        } else if (this.field3008 > this.field3015[this.field3016]) {
            this.field3020 = (int) ((long) (arg2 * 2560) / (this.field3008 - this.field3015[this.field3016]));
        }
        if (this.field3020 < 25) {
            this.field3020 = 25;
        }
        if (this.field3020 > 256) {
            this.field3020 = 256;
            this.field3022 = (int) ((long) arg2 - ((this.field3008 - this.field3015[this.field3016]) / 10L));
        }
        if (arg2 < this.field3022) {
            this.field3022 = arg2;
        }
        this.field3015[this.field3016] = this.field3008;
        this.field3016 = (this.field3016 + 1) % 10;
        if (this.field3022 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field3015[var6] != 0L) {
                    this.field3015[var6] -= -((long) this.field3022);
                }
            }
        }
        if (arg0 > this.field3022) {
            this.field3022 = arg0;
        }
        int var7 = 0;
        class46.method381((long) this.field3022, -110);
        while (this.field3023 < 256) {
            var7++;
            this.field3023 += this.field3020;
        }
        this.field3023 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIIII)V", line = 223)
    public static final void method1239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3013++;
        if (arg6 < 128 || arg1 < 128 || arg6 > 13056 || arg1 > 13056) {
            class161.field2860 = -1;
            class203.field3677 = -1;
            return;
        }
        int var8 = class297.method2080(arg6, 109, class255.field4377, arg1) - arg4;
        int var9 = arg1 - class72.field1319;
        int var10 = 7 % ((-arg7 - 53) / 55);
        int var11 = arg6 - class50.field926;
        int var12 = class136.field2366[class180.field3192];
        int var13 = var8 - class10.field152;
        int var14 = class136.field2372[class180.field3192];
        int var15 = class136.field2366[class210.field3784];
        int var16 = class136.field2372[class210.field3784];
        int var17 = var9 * var15 + var11 * var16 >> 16;
        int var18 = var9 * var16 - var11 * var15 >> 16;
        int var20 = var13 * var14 - (var12 * var18) >> 16;
        int var21 = var12 * var13 + var14 * var18 >> 16;
        if (var21 < 50) {
            class203.field3677 = -1;
            class161.field2860 = -1;
        } else if (class253.field4323) {
            int var23 = arg2 * 512 >> 8;
            class161.field2860 = var17 * var23 / var21 + arg5;
            int var24 = arg3 * 512 >> 8;
            class203.field3677 = var20 * var24 / var21 + arg0;
        } else {
            class161.field2860 = (var17 << 9) / var21 + arg5;
            class203.field3677 = arg0 + ((var20 << 9) / var21);
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V", line = 299)
    public static void method1240(int arg0) {
        field3009 = null;
        field3018 = null;
        field3010 = null;
        field3014 = null;
        if (arg0 >= -116) {
            field3009 = (class138) null;
        }
        field3017 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lng;B)V", line = 328)
    public static final void method1241(class138 arg0, byte arg1) {
        class42.field808 = arg0;
        if (arg1 == 107) {
            field3006++;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(JI)V", line = 340)
    public static final void method1242(long arg0, int arg1) {
        field3011++;
        int var3 = 99 / ((arg1 + 39) / 37);
        if (arg0 != 0L) {
            class308.field5322.method1599(157, (byte) -56);
            class308.field5322.method330(255, arg0);
            class104.field1850++;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;", line = 356)
    public static final Object method1243(boolean arg0, byte[] arg1, int arg2) {
        field3005++;
        if (arg2 > -90) {
            return (Object) null;
        } else if (arg1 == null) {
            return null;
        } else {
            if (arg1.length > 136 && !class165.field2928) {
                try {
                    class160 var3 = (class160) Class.forName("ii").getDeclaredConstructor().newInstance();
                    var3.method1185(arg1, (byte) -90);
                    return var3;
                } catch (Throwable var5) {
                    class165.field2928 = true;
                }
            }
            return arg0 ? class79.method593(arg1, true) : arg1;
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V", line = 392)
    public class170() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field3015[var1] = this.field3008;
        }
    }
}
