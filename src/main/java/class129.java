import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class129 {

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Z")
    public boolean field2113 = false;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Z")
    private boolean field2115 = false;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public int field2114 = -1;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public int field2111 = 5;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public int field2128 = -1;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public int field2120 = -1;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public int field2131 = -1;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public int field2122 = -1;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public int field2139 = 99;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public int field2140 = 2;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "[I")
    public static int[] field2126 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field2137 = 0;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Ltl;")
    public static class59 field2123 = class85.method639("details", 9588);

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "Lkl;")
    public static class64 field2134 = new class64();

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "[I")
    public int[] field2118;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "[I")
    private int[] field2124;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "[I")
    private int[] field2125;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "[I")
    public int[] field2132;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "[I")
    public static int[] field2143;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "[[I")
    public int[][] field2141;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V", line = 10)
    public static void method942(byte arg0) {
        field2126 = null;
        field2134 = null;
        field2123 = null;
        if (arg0 < -8) {
            field2143 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ls;II)V", line = 26)
    private final void method943(class170 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            int var13 = arg0.method1214(-18254);
            this.field2132 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2132[var14] = arg0.method1214(-18254);
            }
            this.field2118 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field2118[var15] = arg0.method1214(-18254);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field2118[var16] += arg0.method1214(arg1 - 40970) << 16;
            }
        } else if (arg2 == 2) {
            this.field2114 = arg0.method1214(-18254);
        } else if (arg2 == 3) {
            int var4 = arg0.method1221(127);
            this.field2124 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2124[var5] = arg0.method1221(127);
            }
            this.field2124[var4] = 9999999;
        } else if (arg2 == 4) {
            this.field2113 = true;
        } else if (arg2 == 5) {
            this.field2111 = arg0.method1221(122);
        } else if (arg2 == 6) {
            this.field2131 = arg0.method1214(-18254);
        } else if (arg2 == 7) {
            this.field2122 = arg0.method1214(-18254);
        } else if (arg2 == 8) {
            this.field2139 = arg0.method1221(113);
        } else if (arg2 == 9) {
            this.field2120 = arg0.method1221(71);
        } else if (arg2 == 10) {
            this.field2128 = arg0.method1221(97);
        } else if (arg2 == 11) {
            this.field2140 = arg0.method1221(102);
        } else if (arg2 == 12) {
            int var10 = arg0.method1221(108);
            this.field2125 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2125[var11] = arg0.method1214(-18254);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field2125[var12] = (arg0.method1214(-18254) << 16) + this.field2125[var12];
            }
        } else if (arg2 == 13) {
            int var6 = arg0.method1214(arg1 ^ 0xFFFFE00E);
            this.field2141 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method1221(arg1 ^ 0x58CA);
                if (var8 > 0) {
                    this.field2141[var7] = new int[var8];
                    this.field2141[var7][0] = arg0.method1208((byte) -126);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field2141[var7][var9] = arg0.method1214(-18254);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field2115 = true;
        }
        if (arg1 != 22716) {
            this.method951(-15, 46, (class57) null);
        }
        field2112++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILca;)Lca;", line = 184)
    public final class57 method944(int arg0, int arg1, class57 arg2) {
        int var4 = this.field2118[arg1];
        if (arg0 <= 36) {
            return (class57) null;
        }
        field2121++;
        class40 var5 = class182.method1351(var4 >> 16, (byte) -77);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method431(true, true);
        } else {
            class57 var7 = arg2.method431(!var5.method262(var6, 108), !this.field2115);
            var7.method434(var5, var6, this.field2115);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V", line = 208)
    public static final void method945(int arg0, int arg1) {
        field2130++;
        class206.field3362.method1486(false, arg1);
        class46.field755.method1486(false, arg1);
        int var2 = 5 / ((arg0 - 20) / 52);
        class171.field2798.method1486(false, arg1);
        class12.field159.method1486(false, arg1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)I", line = 227)
    public static final int method946(int arg0, boolean arg1) {
        field2142++;
        long var2 = class205.method1451(56);
        class19 var4 = arg1 ? (class19) class33.field474.method692(arg0 + 64) : (class19) class33.field474.method693((byte) 106);
        if (arg0 != 0) {
            method945(119, -18);
        }
        while (var4 != null) {
            if (var2 > (var4.field255 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field255 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field4932;
                    class116.field1915[var5] = class308.field5244[var5];
                    var4.method2000(arg0 ^ 0xFFFFFFF0);
                    return var5;
                }
                var4.method2000(119);
            }
            var4 = (class19) class33.field474.method693((byte) 106);
        }
        return -1;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V", line = 282)
    public final void method947(boolean arg0) {
        if (arg0) {
            method952(-109, 73);
        }
        if (this.field2120 == -1) {
            if (this.field2124 == null) {
                this.field2120 = 0;
            } else {
                this.field2120 = 2;
            }
        }
        if (this.field2128 == -1) {
            if (this.field2124 == null) {
                this.field2128 = 0;
            } else {
                this.field2128 = 2;
            }
        }
        field2138++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILca;II)Lca;", line = 326)
    public final class57 method948(int arg0, class57 arg1, int arg2, int arg3) {
        field2117++;
        int var5 = this.field2118[arg0];
        class40 var6 = class182.method1351(var5 >> 16, (byte) -109);
        int var7 = var5 & 0xFFFF;
        if (arg2 != 28020) {
            this.field2114 = 113;
        }
        if (var6 == null) {
            return arg1.method431(true, true);
        }
        int var8 = arg3 & 0x3;
        class57 var9 = arg1.method431(!var6.method262(var7, -113), !this.field2115);
        if (var8 == 1) {
            var9.method425();
        } else if (var8 == 2) {
            var9.method438();
        } else if (var8 == 3) {
            var9.method430();
        }
        var9.method434(var6, var7, this.field2115);
        if (var8 == 1) {
            var9.method430();
        } else if (var8 == 2) {
            var9.method438();
        } else if (var8 == 3) {
            var9.method425();
        }
        return var9;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLca;I)Lca;", line = 386)
    public final class57 method949(boolean arg0, class57 arg1, int arg2) {
        field2119++;
        int var4 = this.field2118[arg2];
        class40 var5 = class182.method1351(var4 >> 16, (byte) -106);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method431(true, true);
        }
        class40 var7 = null;
        if (!arg0) {
            return (class57) null;
        }
        int var8 = 0;
        if (this.field2125 != null && arg2 < this.field2125.length) {
            int var9 = this.field2125[arg2];
            var7 = class182.method1351(var9 >> 16, (byte) -64);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class57 var11 = arg1.method431(!var5.method262(var6, 78), !this.field2115);
            var11.method434(var5, var6, this.field2115);
            return var11;
        } else {
            class57 var10 = arg1.method431(!var5.method262(var6, 92) & !var7.method262(var8, -6), !this.field2115);
            var10.method434(var5, var6, this.field2115);
            var10.method434(var7, var8, this.field2115);
            return var10;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ls;I)V", line = 431)
    public final void method950(class170 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1221(89);
            if (var3 == 0) {
                if (arg1 != -14860) {
                    this.field2131 = 82;
                }
                field2127++;
                return;
            }
            this.method943(arg0, 22716, var3);
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(IILca;)Lca;", line = 453)
    public final class57 method951(int arg0, int arg1, class57 arg2) {
        field2116++;
        int var4 = this.field2118[arg1];
        class40 var5 = class182.method1351(var4 >> 16, (byte) -24);
        int var6 = var4 & arg0;
        if (var5 == null) {
            return arg2.method429(true, true);
        } else {
            class57 var7 = arg2.method429(!var5.method262(var6, 4), !this.field2115);
            var7.method434(var5, var6, this.field2115);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)V", line = 477)
    public static final void method952(int arg0, int arg1) {
        if (arg0 != -18388) {
            method952(65, -8);
        }
        class161.field2617.method1486(false, arg1);
        field2135++;
        class231.field3793.method1486(false, arg1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lqg;IIBLca;)Lca;", line = 503)
    public final class57 method953(class129 arg0, int arg1, int arg2, byte arg3, class57 arg4) {
        field2129++;
        int var6 = this.field2118[arg1];
        class40 var7 = class182.method1351(var6 >> 16, (byte) -71);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg0.method944(87, arg2, arg4);
        }
        int var9 = arg0.field2118[arg2];
        class40 var10 = class182.method1351(var9 >> 16, (byte) -97);
        int var11 = var9 & 0xFFFF;
        if (arg3 >= -66) {
            method945(98, 41);
        }
        if (var10 == null) {
            class57 var12 = arg4.method431(!var7.method262(var8, -120), !this.field2115);
            var12.method434(var7, var8, this.field2115);
            return var12;
        } else {
            class57 var13 = arg4.method431(!var7.method262(var8, -6) & !var10.method262(var11, -8), !arg0.field2115 & !this.field2115);
            var13.method445(var7, var8, var10, var11, this.field2124, this.field2115 | arg0.field2115);
            return var13;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/awt/Component;IIILim;)Lbi;", line = 535)
    public static final class67 method954(Component arg0, int arg1, int arg2, int arg3, class175 arg4) {
        field2133++;
        if (class84.field1322 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg2 < arg1) {
                arg2 = 256;
            }
            try {
                class67 var5 = (class67) Class.forName("ra").getDeclaredConstructor().newInstance();
                var5.field1024 = new int[(class274.field4723 ? 2 : 1) * 256];
                var5.field1037 = arg2;
                var5.method548(arg0);
                var5.field1041 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field1041 > 16384) {
                    var5.field1041 = 16384;
                }
                var5.method560(var5.field1041);
                if (class189.field3167 > 0 && class232.field3809 == null) {
                    class232.field3809 = new class194();
                    class232.field3809.field3225 = arg4;
                    arg4.method1290(class189.field3167, class232.field3809, -90);
                }
                if (class232.field3809 != null) {
                    if (class232.field3809.field3226[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class232.field3809.field3226[arg3] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class244 var7 = new class244(arg4, arg3);
                    var7.field1037 = arg2;
                    var7.field1024 = new int[(class274.field4723 ? 2 : 1) * 256];
                    var7.method548(arg0);
                    var7.field1041 = 16384;
                    var7.method560(var7.field1041);
                    if (class189.field3167 > 0 && class232.field3809 == null) {
                        class232.field3809 = new class194();
                        class232.field3809.field3225 = arg4;
                        arg4.method1290(class189.field3167, class232.field3809, arg1 ^ 0x13A);
                    }
                    if (class232.field3809 != null) {
                        if (class232.field3809.field3226[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class232.field3809.field3226[arg3] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class67();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
