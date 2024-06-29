import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class168 {

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    private int field2894 = 32;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "J")
    private long field2892 = class27.method193((byte) 74);

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    private int field2902 = 0;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    private int field2906 = 0;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "Z")
    private boolean field2908 = true;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "J")
    private long field2907 = 0L;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "[Lrd;")
    private class185[] field2910 = new class185[8];

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "J")
    private long field2909 = 0L;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    private int field2912 = 0;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "[Lrd;")
    private class185[] field2913 = new class185[8];

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    private int field2911 = 0;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Ldj;")
    private static class44 field2874 = class89.method650(255, "Welcome to RuneScape");

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Ldj;")
    public static class44 field2881 = class89.method650(255, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "Ldj;")
    public static class44 field2893 = field2874;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "Ldj;")
    public static class44 field2884 = class89.method650(255, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public int field2901;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public int field2903;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    private int field2905;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "Lrd;")
    private class185 field2900;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "[I")
    public int[] field2889;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public final synchronized void method1063(int arg0) {
        field2883++;
        if (this.field2889 == null) {
            return;
        }
        long var2 = class27.method193((byte) 95);
        try {
            if (this.field2907 != 0L) {
                if (this.field2907 > var2) {
                    return;
                }
                this.method635(this.field2903);
                this.field2907 = 0L;
                this.field2908 = true;
            }
            int var4 = this.method638();
            if (arg0 > -82) {
                this.method1070(null, -19, -4);
            }
            int var5 = this.field2905 + this.field2901;
            if (this.field2912 - var4 > this.field2911) {
                this.field2911 = this.field2912 - var4;
            }
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field2903) {
                this.field2903 += 1024;
                var4 = 0;
                if (this.field2903 > 16384) {
                    this.field2903 = 16384;
                }
                this.method637();
                this.method635(this.field2903);
                this.field2908 = true;
                if (this.field2903 < var5 + 256) {
                    var5 = this.field2903 - 256;
                    this.field2905 = var5 - this.field2901;
                }
            }
            while (var5 > var4) {
                this.method1074(this.field2889, 256);
                this.method636();
                var4 += 256;
            }
            if (var2 > this.field2909) {
                if (this.field2908) {
                    this.field2908 = false;
                } else if (this.field2911 == 0 && this.field2906 == 0) {
                    this.method637();
                    this.field2907 = var2 + 2000L;
                    return;
                } else {
                    this.field2905 = Math.min(this.field2906, this.field2911);
                    this.field2906 = this.field2911;
                }
                this.field2909 = var2 + 2000L;
                this.field2911 = 0;
            }
            this.field2912 = var4;
        } catch (Exception var7) {
            this.method637();
            this.field2907 = var2 + 2000L;
        }
        try {
            if (var2 > this.field2892 + 500000L) {
                var2 = this.field2892;
            }
            while (var2 > this.field2892 + 5000L) {
                this.method1072(-27910, 256);
                this.field2892 += 256000 / class170.field2935;
            }
        } catch (Exception var6) {
            this.field2892 = var2;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBI)V")
    public static final void method1064(int arg0, byte arg1, int arg2) {
        field2888++;
        long var3 = (long) ((arg2 << 16) + arg0);
        class236 var5 = (class236) class88.field1675.method828(var3, (byte) -40);
        if (var5 != null) {
            class87.field1664.method846(var5, 107);
            if (arg1 < 44) {
                field2878 = 98;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public static void method1065(int arg0) {
        field2881 = null;
        field2893 = null;
        field2874 = null;
        int var1 = 3 / ((arg0 + 42) / 54);
        field2884 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2885++;
        if (arg0 < 128 || arg6 < 128 || arg0 > 13056 || arg6 > 13056) {
            class119.field2124 = -1;
            class83.field1626 = -1;
            return;
        }
        int var8 = class40.method278(arg6, class194.field3403, arg0, (byte) 101) - arg1;
        int var9 = class206.field3700[class199.field3527];
        int var10 = arg0 - field2878;
        int var11 = var8 - class35.field628;
        int var12 = arg6 - class102.field1858;
        int var13 = class206.field3684[class199.field3527];
        int var14 = class206.field3684[class38.field675];
        int var15 = class206.field3700[class38.field675];
        int var16 = var10 * var15 + var12 * var14 >> 16;
        int var17 = var12 * var15 - var10 * var14 >> 16;
        if (arg7 >= -35) {
            field2878 = 113;
        }
        int var19 = var9 * var11 - var13 * var17 >> 16;
        int var20 = var9 * var17 + var11 * var13 >> 16;
        if (var20 < 50) {
            class119.field2124 = -1;
            class83.field1626 = -1;
        } else {
            class119.field2124 = (var16 << 9) / var20 + arg4;
            class83.field1626 = arg3 + (var19 << 9) / var20;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
    public void method635(int arg0) throws Exception {
        field2890++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public final synchronized void method1067(byte arg0) {
        field2899++;
        this.field2908 = true;
        try {
            if (arg0 < 98) {
                this.method1068(false);
            }
            this.method633();
        } catch (Exception var2) {
            this.method637();
            this.field2907 = class27.method193((byte) 81) + 2000L;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method634(Component arg0) throws Exception {
        field2879++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()V")
    public void method636() throws Exception {
        field2891++;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "()V")
    public void method637() {
        field2877++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
    public final void method1068(boolean arg0) {
        field2886++;
        if (!arg0) {
            this.field2908 = true;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "()I")
    public int method638() throws Exception {
        field2887++;
        return this.field2903;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
    public static final void method1069(int arg0, int arg1) {
        if (arg1 < 0) {
            field2878 = -92;
        }
        field2880++;
        if (class219.field3970 == null || arg0 > class219.field3970.length) {
            class219.field3970 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lrd;II)V")
    private final void method1070(class185 arg0, int arg1, int arg2) {
        field2898++;
        int var4 = arg1 >> 5;
        if (arg2 > -12) {
            this.field2909 = -39L;
        }
        class185 var5 = this.field2913[var4];
        if (var5 == null) {
            this.field2910[var4] = arg0;
        } else {
            var5.field3207 = arg0;
        }
        this.field2913[var4] = arg0;
        arg0.field3205 = arg1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILrd;)V")
    public final synchronized void method1071(int arg0, class185 arg1) {
        this.field2900 = arg1;
        if (arg0 != -386) {
            this.method1073(69);
        }
        field2895++;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
    private final void method1072(int arg0, int arg1) {
        field2904++;
        if (arg0 != -27910) {
            return;
        }
        this.field2902 -= arg1;
        if (this.field2902 < 0) {
            this.field2902 = 0;
        }
        if (this.field2900 != null) {
            this.field2900.method99(arg1);
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "()V")
    public void method633() throws Exception {
        field2882++;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public final synchronized void method1073(int arg0) {
        if (class27.field477 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class27.field477.field2575[var3] == this) {
                    class27.field477.field2575[var3] = null;
                }
                if (class27.field477.field2575[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class27.field477.field2569 = true;
                while (class27.field477.field2571) {
                    class82.method617((byte) 31, 50L);
                }
                class27.field477 = null;
            }
        }
        this.method637();
        field2897++;
        if (arg0 < -44) {
            this.field2889 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([II)V")
    private final void method1074(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class158.field2748) {
            var3 = arg1 << 1;
        }
        class18.method145(arg0, 0, var3);
        this.field2902 -= arg1;
        if (this.field2900 != null && this.field2902 <= 0) {
            this.field2902 += class170.field2935 >> 4;
            class59.method445(8, this.field2900);
            this.method1070(this.field2900, this.field2900.method739(), -46);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class185 var10 = null;
                        class185 var11 = this.field2910[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class91 var12 = var11.field3204;
                                if (var12 == null || var12.field1709 <= var8) {
                                    var11.field3206 = true;
                                    int var13 = var11.method110();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1709 += var13;
                                    }
                                    if (var4 >= this.field2894) {
                                        break label107;
                                    }
                                    class185 var14 = var11.method105();
                                    if (var14 != null) {
                                        int var15 = var11.field3205;
                                        while (var14 != null) {
                                            this.method1070(var14, var15 * var14.method739() >> 8, -32);
                                            var14 = var11.method107();
                                        }
                                    }
                                    class185 var16 = var11.field3207;
                                    var11.field3207 = null;
                                    if (var10 == null) {
                                        this.field2910[var7] = var16;
                                    } else {
                                        var10.field3207 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2913[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3207;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class185 var18 = this.field2910[var17];
                this.field2910[var17] = this.field2913[var17] = null;
                while (var18 != null) {
                    class185 var19 = var18.field3207;
                    var18.field3207 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2902 < 0) {
            this.field2902 = 0;
        }
        if (this.field2900 != null) {
            this.field2900.method100(arg0, 0, arg1);
        }
        this.field2892 = class27.method193((byte) 88);
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V")
    public static final void method1075(int arg0) {
        if (arg0 != 1) {
            method1075(-116);
        }
        field2875++;
        for (class119 var1 = (class119) class227.field4266.method1189(0); var1 != null; var1 = (class119) class227.field4266.method1192((byte) -101)) {
            class179 var2 = var1.field2116;
            if (class194.field3403 != var2.field3093 || class46.field868 > var2.field3067) {
                var1.method1148(-13215);
            } else if (class46.field868 >= var2.field3089) {
                if (var2.field3095 > 0) {
                    class121 var3 = class170.field2960[var2.field3095 - 1];
                    if (var3 != null && var3.field2260 >= 0 && var3.field2260 < 13312 && var3.field2195 >= 0 && var3.field2195 < 13312) {
                        var2.method1132(var3.field2195, class40.method278(var3.field2195, var2.field3093, var3.field2260, (byte) 101) - var2.field3090, true, var3.field2260, class46.field868);
                    }
                }
                if (var2.field3095 < 0) {
                    int var4 = -var2.field3095 - 1;
                    class24 var5;
                    if (class123.field2188 == var4) {
                        var5 = class96.field1774;
                    } else {
                        var5 = class122.field2168[var4];
                    }
                    if (var5 != null && var5.field2260 >= 0 && var5.field2260 < 13312 && var5.field2195 >= 0 && var5.field2195 < 13312) {
                        var2.method1132(var5.field2195, class40.method278(var5.field2195, var2.field3093, var5.field2260, (byte) 101) - var2.field3090, true, var5.field2260, class46.field868);
                    }
                }
                var2.method1131(class102.field1855, arg0 ^ 0x1);
                class183.method1149(class194.field3403, (int) var2.field3084, (int) var2.field3072, (int) var2.field3098, 60, var2, var2.field3073, -1L, false);
            }
        }
    }
}
