import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class153 {

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
    private int field2913 = 0;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "[Lej;")
    private class54[] field2900;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    private int field2904;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2888 = 0;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Ldc;")
    public static class37 field2890 = class185.method1233((byte) 86, "leuchten2:");

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Ldc;")
    private static class37 field2894 = class185.method1233((byte) 86, "Welcome to RuneScape");

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Ldc;")
    public static class37 field2898 = class185.method1233((byte) 86, "(U0a )2 in: ");

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Ldc;")
    public static class37 field2897 = class185.method1233((byte) 86, "scape main");

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Ldc;")
    public static class37 field2895 = field2894;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Ldc;")
    private static class37 field2905 = class185.method1233((byte) 86, "Please remove ");

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Ldc;")
    public static class37 field2899 = field2905;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "Ldc;")
    public static class37 field2903 = field2905;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "[I")
    public static int[] field2896 = new int[1000];

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "[I")
    public static int[] field2907 = new int[2000];

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field2912 = 0;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "J")
    private long field2902;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Ldj;")
    public static class44 field2892;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Lej;")
    private class54 field2893;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "Lej;")
    private class54 field2911;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "[[Z")
    public static boolean[][] field2908;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)Lej;")
    public final class54 method1041(boolean arg0) {
        field2889++;
        if (this.field2913 > 0 && this.field2900[this.field2913 - 1] != this.field2911) {
            class54 var2 = this.field2911;
            this.field2911 = var2.field1062;
            return var2;
        }
        if (!arg0) {
            this.method1047((byte) -6, 111L);
        }
        while (this.field2904 > this.field2913) {
            class54 var3 = this.field2900[this.field2913++].field1062;
            if (this.field2900[this.field2913 - 1] != var3) {
                this.field2911 = var3.field1062;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)Lej;")
    public final class54 method1042(byte arg0) {
        field2909++;
        if (arg0 != -25) {
            field2888 = -30;
        }
        this.field2913 = 0;
        return this.method1041(true);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lli;B)V")
    public static final void method1043(class128 arg0, byte arg1) {
        field2906++;
        if (class181.field3371) {
            class181.method1204(arg0, (byte) -21);
            return;
        }
        if (class97.field1698 == 1 && class205.field3805 >= 715 && class200.field3745 >= 453) {
            class167.field3190 = !class167.field3190;
            if (class167.field3190) {
                class97.method649(false);
            } else {
                class167.method1118(class10.field131, class68.field1236, arg1 - 100, 0, 255, false);
            }
        }
        if (arg1 != 101 || class109.field1891 == 5) {
            return;
        }
        class200.field3732++;
        if (class109.field1891 != 10) {
            return;
        }
        if (class107.field1876 != 2) {
            if (class97.field1698 == 1) {
                byte var2 = 5;
                byte var3 = 100;
                short var4 = 463;
                byte var5 = 35;
                if (class205.field3805 >= var2 && var2 + var3 >= class205.field3805 && var4 <= class200.field3745 && class200.field3745 <= var4 + var5) {
                    class170.method1152(2874);
                    return;
                }
            }
            if (class54.field1055 != null) {
                class170.method1152(arg1 + 2773);
            }
        }
        int var6 = class97.field1698;
        int var7 = class205.field3805;
        int var8 = class200.field3745;
        if (class242.field4442 == 0) {
            short var17 = 302;
            short var18 = 291;
            if (var6 == 1 && var7 >= var17 - 75 && var17 + 75 >= var7 && var18 - 20 <= var8 && var8 <= var18 + 20) {
                class123.field2211 = 0;
                class242.field4442 = 3;
            }
            boolean var19 = false;
            if (class50.field1018 != 0) {
                while (class44.method388(arg1 ^ 0x61D3)) {
                    if (class198.field3700 == 84) {
                        var19 = true;
                        break;
                    }
                }
            }
            short var20 = 462;
            if (var19 || var6 == 1 && var7 >= var20 - 75 && var7 <= var20 + 75 && var18 - 20 <= var8 && var8 <= var18 + 20) {
                class242.field4442 = 2;
                class123.field2211 = 0;
                class19.field321 = class156.field2950;
                class19.field324 = class156.field2973;
                class19.field322 = class245.field4475;
            }
            return;
        }
        if (class242.field4442 == 2) {
            short var9 = 231;
            int var21 = var9 + 30;
            short var10 = 302;
            short var11 = 321;
            if (var6 == 1 && var8 >= var21 - 15 && var21 > var8) {
                class123.field2211 = 0;
            }
            var21 += 15;
            if (var6 == 1 && var8 >= var21 - 15 && var21 > var8) {
                class123.field2211 = 1;
            }
            var21 += 15;
            if (var6 == 1 && var10 - 75 <= var7 && var10 + 75 >= var7 && var8 >= var11 - 20 && var8 <= var11 + 20) {
                class19.field325 = class19.field325.method308((byte) -107).method317((byte) 59);
                if (class19.field325.method334(-61) == 0) {
                    class65.method478(class156.field2966, class191.field3556, class156.field2953, (byte) 98);
                    return;
                }
                if (class19.field326.method334(arg1 - 162) == 0) {
                    class65.method478(class156.field2956, class127.field2355, class156.field2945, (byte) 98);
                    return;
                }
                class65.method478(class156.field2932, class165.field3143, class156.field2935, (byte) 98);
                class236.method1525(20, arg1 ^ 0x6A41);
                return;
            }
            short var12 = 462;
            if (var6 == 1 && var12 - 75 <= var7 && var12 + 75 >= var7 && var8 >= var11 - 20 && var11 + 20 >= var8) {
                class19.field326 = class19.field323;
                class242.field4442 = 0;
                class19.field325 = class19.field323;
            }
            while (true) {
                boolean var13;
                label204: do {
                    while (class44.method388(arg1 ^ 0x61D3)) {
                        var13 = false;
                        for (int var14 = 0; class207.field3875.method334(arg1 ^ 0xFFFFFFA6) > var14; var14++) {
                            if (class118.field2107 == class207.field3875.method329((byte) 107, var14)) {
                                var13 = true;
                                break;
                            }
                        }
                        if (class123.field2211 != 0) {
                            continue label204;
                        }
                        if (class198.field3700 == 85 && class19.field325.method334(-61) > 0) {
                            class19.field325 = class19.field325.method311(class19.field325.method334(-61) - 1, 0, true);
                        }
                        if (class198.field3700 == 84 || class198.field3700 == 80) {
                            class123.field2211 = 1;
                        }
                        if (var13 && class19.field325.method334(-61) < 12) {
                            class19.field325 = class19.field325.method328(-18, class118.field2107);
                        }
                    }
                    return;
                } while (class123.field2211 != 1);
                if (class198.field3700 == 85 && class19.field326.method334(arg1 ^ 0xFFFFFFA6) > 0) {
                    class19.field326 = class19.field326.method311(class19.field326.method334(arg1 - 162) - 1, 0, true);
                }
                if (class198.field3700 == 84 || class198.field3700 == 80) {
                    class123.field2211 = 0;
                }
                if (class50.field1018 != 0 && class198.field3700 == 84) {
                    class19.field325 = class19.field325.method308((byte) -107).method317((byte) 59);
                    if (class19.field325.method334(arg1 ^ 0xFFFFFFA6) == 0) {
                        class65.method478(class156.field2966, class191.field3556, class156.field2953, (byte) 98);
                        return;
                    }
                    if (class19.field326.method334(-61) == 0) {
                        class65.method478(class156.field2956, class127.field2355, class156.field2945, (byte) 98);
                        return;
                    }
                    class65.method478(class156.field2932, class165.field3143, class156.field2935, (byte) 98);
                    class236.method1525(20, arg1 ^ 0x6A41);
                    return;
                }
                if (var13 && class19.field326.method334(-61) < 20) {
                    class19.field326 = class19.field326.method328(-122, class118.field2107);
                }
            }
        }
        if (class242.field4442 != 3) {
            return;
        }
        short var15 = 382;
        short var16 = 321;
        if (var6 == 1 && var7 >= var15 - 75 && var7 <= var15 + 75 && var8 >= var16 - 20 && var8 <= var16 + 20) {
            class242.field4442 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lej;BJ)V")
    public final void method1044(class54 arg0, byte arg1, long arg2) {
        if (arg0.field1068 != null) {
            arg0.method433(0);
        }
        field2891++;
        class54 var5 = this.field2900[(int) ((long) (this.field2904 - 1) & arg2)];
        arg0.field1066 = arg2;
        arg0.field1068 = var5.field1068;
        if (arg1 == -14) {
            arg0.field1062 = var5;
            arg0.field1068.field1062 = arg0;
            arg0.field1062.field1068 = arg0;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Lej;")
    public final class54 method1045(int arg0) {
        field2901++;
        if (this.field2893 == null) {
            return null;
        }
        class54 var2 = this.field2900[(int) ((long) (this.field2904 - 1) & this.field2902)];
        int var3 = 63 % ((49 - arg0) / 49);
        while (this.field2893 != var2) {
            if (this.field2893.field1066 == this.field2902) {
                class54 var4 = this.field2893;
                this.field2893 = this.field2893.field1062;
                return var4;
            }
            this.field2893 = this.field2893.field1062;
        }
        this.field2893 = null;
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)Lse;")
    public static final class201 method1046(int arg0, int arg1, int arg2, int arg3) {
        class201 var4 = new class201();
        var4.field3746 = arg1;
        var4.field3751 = arg0;
        class85.field1499.method1044(var4, (byte) -14, (long) arg2);
        field2887++;
        class15.method101(15532, arg1);
        class136 var5 = class180.method1200(arg2, (byte) 111);
        if (var5 != null) {
            class210.method1395((byte) 29, var5);
        }
        if (class152.field2877 != null) {
            class210.method1395((byte) 29, class152.field2877);
            class152.field2877 = null;
        }
        class118.field2114 = false;
        class97.field1701 = 0;
        class241.method1579(class225.field4164, class149.field2826, class246.field4491, class10.field141, true);
        if (arg3 != -22002) {
            return null;
        }
        if (var5 != null) {
            class129.method909(var5, true);
        }
        class78.method539(arg1, true);
        if (class149.field2828 != -1) {
            class142.method987(class149.field2828, 1, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BJ)Lej;")
    public final class54 method1047(byte arg0, long arg1) {
        field2910++;
        this.field2902 = arg1;
        class54 var4 = this.field2900[(int) (arg1 & (long) (this.field2904 - 1))];
        this.field2893 = var4.field1062;
        int var5 = 79 / ((31 - arg0) / 59);
        while (this.field2893 != var4) {
            if (this.field2893.field1066 == arg1) {
                class54 var6 = this.field2893;
                this.field2893 = this.field2893.field1062;
                return var6;
            }
            this.field2893 = this.field2893.field1062;
        }
        this.field2893 = null;
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(I)V")
    public class153(int arg0) {
        this.field2900 = new class54[arg0];
        this.field2904 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class54 var3 = this.field2900[var2] = new class54();
            var3.field1062 = var3;
            var3.field1068 = var3;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static void method1048(int arg0) {
        field2903 = null;
        if (arg0 < 37) {
            method1043(null, (byte) 126);
        }
        field2905 = null;
        field2899 = null;
        field2896 = null;
        field2898 = null;
        field2908 = null;
        field2894 = null;
        field2907 = null;
        field2897 = null;
        field2890 = null;
        field2895 = null;
        field2892 = null;
    }
}
