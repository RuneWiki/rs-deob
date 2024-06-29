import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class40 extends class75 {

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "Z")
    public boolean field956 = false;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public int field951 = -1;

    @OriginalMember(owner = "client!fd", name = "nb", descriptor = "[I")
    private int[] field976 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "Lod;")
    public static class101 field949 = class46.method335(-114, "::gc");

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "Lod;")
    public static class101 field948 = class46.method335(-87, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
    public static int field958 = 0;

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "Lod;")
    private static class101 field965 = class46.method335(122, "Select");

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field947 = 0;

    @OriginalMember(owner = "client!fd", name = "hb", descriptor = "Lod;")
    private static class101 field970 = class46.method335(-98, " has logged out)3");

    @OriginalMember(owner = "client!fd", name = "kb", descriptor = "Lod;")
    public static class101 field973 = field970;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "Lod;")
    public static class101 field950 = class46.method335(109, "(U(Y");

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
    public static int field961 = 0;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "I")
    public static int field959 = 0;

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "Lod;")
    private static class101 field966 = class46.method335(-106, "Please contact customer support)3");

    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "Lod;")
    private static class101 field967 = class46.method335(-121, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "Lod;")
    public static class101 field954 = field966;

    @OriginalMember(owner = "client!fd", name = "gb", descriptor = "Lod;")
    public static class101 field969 = field965;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "Lod;")
    public static class101 field943 = field967;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!fd", name = "ib", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!fd", name = "jb", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!fd", name = "mb", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!fd", name = "ob", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!fd", name = "pb", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!fd", name = "fb", descriptor = "Lsa;")
    public static class126 field968;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "Lmd;")
    public static class87 field945;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "[I")
    private int[] field944;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "[S")
    private short[] field952;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "[S")
    private short[] field953;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "[S")
    private short[] field957;

    @OriginalMember(owner = "client!fd", name = "lb", descriptor = "[S")
    private short[] field974;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)Z")
    public final boolean method296(int arg0) {
        field975++;
        if (arg0 != -25254) {
            this.method305(-58);
        }
        if (this.field944 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field944.length; var3++) {
            if (!class27.field727.method118(this.field944[var3], 99, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)Lpf;")
    public final class110 method297(boolean arg0) {
        field946++;
        if (this.field944 == null) {
            return null;
        }
        class110[] var2 = new class110[this.field944.length];
        for (int var3 = 0; var3 < this.field944.length; var3++) {
            var2[var3] = class110.method808(class27.field727, this.field944[var3], 0);
        }
        if (!arg0) {
            field948 = null;
        }
        class110 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class110(var2, var2.length);
        }
        if (this.field957 != null) {
            for (int var5 = 0; var5 < this.field957.length; var5++) {
                var4.method796(this.field957[var5], this.field953[var5]);
            }
        }
        if (this.field974 != null) {
            for (int var6 = 0; var6 < this.field974.length; var6++) {
                var4.method802(this.field974[var6], this.field952[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ltf;B)V")
    public final void method298(class138 arg0, byte arg1) {
        if (arg1 != -7) {
            this.method298(null, (byte) 48);
        }
        while (true) {
            int var3 = arg0.method1055(117);
            if (var3 == 0) {
                field962++;
                return;
            }
            this.method303(arg0, var3, 2);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)Lpf;")
    public final class110 method299(byte arg0) {
        field978++;
        if (arg0 != -49) {
            field965 = null;
        }
        int var2 = 0;
        class110[] var3 = new class110[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field976[var4] != -1) {
                var3[var2++] = class110.method808(class27.field727, this.field976[var4], 0);
            }
        }
        class110 var5 = new class110(var3, var2);
        if (this.field957 != null) {
            for (int var6 = 0; var6 < this.field957.length; var6++) {
                var5.method796(this.field957[var6], this.field953[var6]);
            }
        }
        if (this.field974 != null) {
            for (int var7 = 0; var7 < this.field974.length; var7++) {
                var5.method802(this.field974[var7], this.field952[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLsa;)V")
    public static final void method300(boolean arg0, class126 arg1) {
        field971++;
        if (arg0) {
            field973 = null;
        }
        if (class158.field3636 == arg1.field2855) {
            class129.field2938[arg1.field2830] = true;
        }
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V")
    public static void method301(int arg0) {
        field950 = null;
        field954 = null;
        if (arg0 > -63) {
            method306(75, -33, 86, 116, false, -124, -117, -41, -52, -78, 59, (byte) -54);
        }
        field945 = null;
        field973 = null;
        field949 = null;
        field943 = null;
        field948 = null;
        field969 = null;
        field966 = null;
        field968 = null;
        field970 = null;
        field967 = null;
        field965 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILrc;)V")
    public static final void method302(int arg0, class121 arg1) {
        if (arg0 != 0) {
            method300(false, null);
        }
        field972++;
        if (class53.field1210) {
            class93.method646(-94, arg1);
            return;
        }
        if (class119.field2629 == 1 && class147.field3369 >= 715 && class80.field1684 >= 453) {
            class46.field1087 = !class46.field1087;
            if (class46.field1087) {
                class140.method1122(true);
            } else {
                class48.method360(true, class12.field245, 255, class85.field1863, class105.field2266, false);
            }
        }
        if (class145.field3335 == 5) {
            return;
        }
        class119.field2619++;
        if (class145.field3335 != 10) {
            return;
        }
        if (class56.field1259 != 2 && class13.field287 == 0) {
            if (class119.field2629 == 1) {
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 5;
                byte var5 = 35;
                if (class147.field3369 >= var4 && class147.field3369 <= var3 + var4 && var2 <= class80.field1684 && class80.field1684 <= var2 + var5) {
                    class100.method697(-107);
                    return;
                }
            }
            if (class129.field2939 != null) {
                class100.method697(-94);
            }
        }
        int var6 = class119.field2629;
        int var7 = class147.field3369;
        int var8 = class80.field1684;
        if (class140.field3229 == 0) {
            short var17 = 291;
            short var18 = 302;
            if (var6 == 1 && var18 - 75 <= var7 && var18 + 75 >= var7 && var8 >= var17 - 20 && var8 <= var17 + 20) {
                class32.field817 = 0;
                class140.field3229 = 3;
            }
            short var19 = 462;
            if (var6 == 1 && var19 - 75 <= var7 && var19 + 75 >= var7 && var17 - 20 <= var8 && var17 + 20 >= var8) {
                class85.field1881 = class80.field1673;
                class85.field1865 = class137.field3137;
                class140.field3229 = 2;
                class85.field1868 = class80.field1672;
                class32.field817 = 0;
            }
        } else if (class140.field3229 == 2) {
            short var11 = 231;
            short var12 = 302;
            short var13 = 321;
            int var20 = var11 + 30;
            if (var6 == 1 && var8 >= var20 - 15 && var20 > var8) {
                class32.field817 = 0;
            }
            var20 += 15;
            if (var6 == 1 && var8 >= var20 - 15 && var20 > var8) {
                class32.field817 = 1;
            }
            var20 += 15;
            if (var6 == 1 && var12 - 75 <= var7 && var12 + 75 >= var7 && var8 >= var13 - 20 && var13 + 20 >= var8) {
                class85.field1856 = class85.field1856.method709(18419).method714(-116);
                if (class85.field1856.method737(0) == 0) {
                    class53.method383(class34.field871, class80.field1716, -5, class80.field1711);
                    return;
                }
                if (class85.field1846.method737(0) == 0) {
                    class53.method383(class93.field2005, class80.field1696, -5, class80.field1679);
                    return;
                }
                class53.method383(class105.field2262, class80.field1674, -5, class80.field1678);
                class35.method262(0, 20);
                return;
            }
            short var14 = 462;
            if (var6 == 1 && var7 >= var14 - 75 && var14 + 75 >= var7 && var13 - 20 <= var8 && var8 <= var13 + 20) {
                class140.field3229 = 0;
                class85.field1856 = class85.field1863;
                class85.field1846 = class85.field1863;
            }
            while (true) {
                boolean var15;
                label209: do {
                    while (class48.method359((byte) -82)) {
                        var15 = false;
                        for (int var16 = 0; class135.field3115.method737(0) > var16; var16++) {
                            if (class11.field204 == class135.field3115.method730(-108, var16)) {
                                var15 = true;
                                break;
                            }
                        }
                        if (class32.field817 != 0) {
                            continue label209;
                        }
                        if (class99.field2147 == 85 && class85.field1856.method737(0) > 0) {
                            class85.field1856 = class85.field1856.method725(0, -105, class85.field1856.method737(0) - 1);
                        }
                        if (class99.field2147 == 84 || class99.field2147 == 80) {
                            class32.field817 = 1;
                        }
                        if (var15 && class85.field1856.method737(0) < 12) {
                            class85.field1856 = class85.field1856.method715((byte) 110, class11.field204);
                        }
                    }
                    return;
                } while (class32.field817 != 1);
                if (class99.field2147 == 85 && class85.field1846.method737(arg0) > 0) {
                    class85.field1846 = class85.field1846.method725(0, -118, class85.field1846.method737(0) - 1);
                }
                if (class99.field2147 == 84 || class99.field2147 == 80) {
                    class32.field817 = 0;
                }
                if (class141.field3243 == 2 && class99.field2147 == 84) {
                    class85.field1856 = class85.field1856.method709(18419).method714(-120);
                    if (class85.field1856.method737(0) == 0) {
                        class53.method383(class34.field871, class80.field1716, -5, class80.field1711);
                        return;
                    }
                    if (class85.field1846.method737(0) == 0) {
                        class53.method383(class93.field2005, class80.field1696, arg0 ^ 0xFFFFFFFB, class80.field1679);
                        return;
                    }
                    class53.method383(class105.field2262, class80.field1674, -5, class80.field1678);
                    class35.method262(0, 20);
                    return;
                }
                if (var15 && class85.field1846.method737(arg0) < 20) {
                    class85.field1846 = class85.field1846.method715((byte) 114, class11.field204);
                }
            }
        } else if (class140.field3229 == 3) {
            short var9 = 382;
            short var10 = 321;
            if (var6 == 1 && var7 >= var9 - 75 && var9 + 75 >= var7 && var10 - 20 <= var8 && var10 + 20 >= var8) {
                class140.field3229 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ltf;II)V")
    private final void method303(class138 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field951 = arg0.method1055(118);
        } else if (arg1 == 2) {
            int var4 = arg0.method1055(124);
            this.field944 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field944[var5] = arg0.method1098(true);
            }
        } else if (arg1 == 3) {
            this.field956 = true;
        } else if (arg1 == 40) {
            int var8 = arg0.method1055(118);
            this.field953 = new short[var8];
            this.field957 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field957[var9] = (short) arg0.method1098(true);
                this.field953[var9] = (short) arg0.method1098(true);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method1055(124);
            this.field974 = new short[var6];
            this.field952 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field974[var7] = (short) arg0.method1098(true);
                this.field952[var7] = (short) arg0.method1098(true);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field976[arg1 - 60] = arg0.method1098(true);
        }
        field964++;
        if (arg2 != 2) {
            this.method299((byte) -56);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lod;Lod;Lc;I)[Lrd;")
    public static final class122[] method304(class101 arg0, class101 arg1, class15 arg2, int arg3) {
        int var4 = arg2.method110(0, arg1);
        field960++;
        if (arg3 != -1) {
            field947 = 15;
        }
        int var5 = arg2.method125(2, arg0, var4);
        return class97.method677(5424, arg2, var5, var4);
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)Z")
    public final boolean method305(int arg0) {
        field955++;
        boolean var2 = true;
        if (arg0 != 27291) {
            this.method303(null, -39, -107);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field976[var3] != -1 && !class27.field727.method118(this.field976[var3], arg0 - 27189, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIZIIIIIIB)Z")
    public static final boolean method306(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, byte arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class120.field2651[var12][var36] = 0;
                class17.field351[var12][var36] = 99999999;
            }
        }
        field963++;
        int var13 = arg5;
        byte var14 = 0;
        boolean var15 = false;
        int var16 = 0;
        class120.field2651[arg5][arg6] = 99;
        class17.field351[arg5][arg6] = 0;
        class18.field373[var14] = arg5;
        int var37 = var14 + 1;
        class98.field2123[var14] = arg6;
        int var17 = arg6;
        if (arg11 != 47) {
            method306(-18, 100, 19, 54, false, -111, -79, -50, -121, -74, 106, (byte) 88);
        }
        int[][] var18 = class57.field1331[class95.field2040].field1118;
        int var19 = class18.field373.length;
        while (var37 != var16) {
            var17 = class98.field2123[var16];
            var13 = class18.field373[var16];
            var16 = (var16 + 1) % var19;
            if (arg9 == var13 && arg0 == var17) {
                var15 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class57.field1331[class95.field2040].method349(var17, arg8 - 1, arg9, var13, arg2, (byte) 58, arg0)) {
                    var15 = true;
                    break;
                }
                if (arg8 < 10 && class57.field1331[class95.field2040].method340(var17, arg2, arg8 - 1, arg0, (byte) 116, arg9, var13)) {
                    var15 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg3 != 0 && class57.field1331[class95.field2040].method338(-127, arg7, var13, arg9, arg0, arg1, arg3, var17)) {
                var15 = true;
                break;
            }
            int var35 = class17.field351[var13][var17] + 1;
            if (var13 > 0 && class120.field2651[var13 - 1][var17] == 0 && (var18[var13 - 1][var17] & 0x12C0108) == 0) {
                class18.field373[var37] = var13 - 1;
                class98.field2123[var37] = var17;
                var37 = (var37 + 1) % var19;
                class120.field2651[var13 - 1][var17] = 2;
                class17.field351[var13 - 1][var17] = var35;
            }
            if (var13 < 103 && class120.field2651[var13 + 1][var17] == 0 && (var18[var13 + 1][var17] & 0x12C0180) == 0) {
                class18.field373[var37] = var13 + 1;
                class98.field2123[var37] = var17;
                var37 = (var37 + 1) % var19;
                class120.field2651[var13 + 1][var17] = 8;
                class17.field351[var13 + 1][var17] = var35;
            }
            if (var17 > 0 && class120.field2651[var13][var17 - 1] == 0 && (var18[var13][var17 - 1] & 0x12C0102) == 0) {
                class18.field373[var37] = var13;
                class98.field2123[var37] = var17 - 1;
                var37 = (var37 + 1) % var19;
                class120.field2651[var13][var17 - 1] = 1;
                class17.field351[var13][var17 - 1] = var35;
            }
            if (var17 < 103 && class120.field2651[var13][var17 + 1] == 0 && (var18[var13][var17 + 1] & 0x12C0120) == 0) {
                class18.field373[var37] = var13;
                class98.field2123[var37] = var17 + 1;
                class120.field2651[var13][var17 + 1] = 4;
                var37 = (var37 + 1) % var19;
                class17.field351[var13][var17 + 1] = var35;
            }
            if (var13 > 0 && var17 > 0 && class120.field2651[var13 - 1][var17 - 1] == 0 && (var18[var13 - 1][var17 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var17] & 0x12C0108) == 0 && (var18[var13][var17 - 1] & 0x12C0102) == 0) {
                class18.field373[var37] = var13 - 1;
                class98.field2123[var37] = var17 - 1;
                var37 = (var37 + 1) % var19;
                class120.field2651[var13 - 1][var17 - 1] = 3;
                class17.field351[var13 - 1][var17 - 1] = var35;
            }
            if (var13 < 103 && var17 > 0 && class120.field2651[var13 + 1][var17 - 1] == 0 && (var18[var13 + 1][var17 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var17] & 0x12C0180) == 0 && (var18[var13][var17 - 1] & 0x12C0102) == 0) {
                class18.field373[var37] = var13 + 1;
                class98.field2123[var37] = var17 - 1;
                class120.field2651[var13 + 1][var17 - 1] = 9;
                class17.field351[var13 + 1][var17 - 1] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var13 > 0 && var17 < 103 && class120.field2651[var13 - 1][var17 + 1] == 0 && (var18[var13 - 1][var17 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var17] & 0x12C0108) == 0 && (var18[var13][var17 + 1] & 0x12C0120) == 0) {
                class18.field373[var37] = var13 - 1;
                class98.field2123[var37] = var17 + 1;
                var37 = (var37 + 1) % var19;
                class120.field2651[var13 - 1][var17 + 1] = 6;
                class17.field351[var13 - 1][var17 + 1] = var35;
            }
            if (var13 < 103 && var17 < 103 && class120.field2651[var13 + 1][var17 + 1] == 0 && (var18[var13 + 1][var17 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var17] & 0x12C0180) == 0 && (var18[var13][var17 + 1] & 0x12C0120) == 0) {
                class18.field373[var37] = var13 + 1;
                class98.field2123[var37] = var17 + 1;
                var37 = (var37 + 1) % var19;
                class120.field2651[var13 + 1][var17 + 1] = 12;
                class17.field351[var13 + 1][var17 + 1] = var35;
            }
        }
        class24.field598 = 0;
        if (!var15) {
            if (!arg4) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg9 - var22; var23 <= arg9 + var22; var23++) {
                for (int var24 = arg0 - var22; var24 <= arg0 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class17.field351[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg9 > var23) {
                            var25 = arg9 - var23;
                        } else if (arg1 + arg9 - 1 < var23) {
                            var25 = var23 + 1 - arg9 - arg1;
                        }
                        int var26 = 0;
                        if (arg0 > var24) {
                            var26 = arg0 - var24;
                        } else if (arg0 + arg3 - 1 < var24) {
                            var26 = var24 + 1 - arg0 - arg3;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && class17.field351[var23][var24] < var21) {
                            var20 = var27;
                            var13 = var23;
                            var17 = var24;
                            var21 = class17.field351[var23][var24];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg5 == var13 && arg6 == var17) {
                return false;
            }
            class24.field598 = 1;
        }
        byte var28 = 0;
        class18.field373[var28] = var13;
        int var38 = var28 + 1;
        class98.field2123[var28] = var17;
        int var29;
        int var30 = var29 = class120.field2651[var13][var17];
        while (arg5 != var13 || arg6 != var17) {
            if (var29 != var30) {
                var29 = var30;
                class18.field373[var38] = var13;
                class98.field2123[var38++] = var17;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var17++;
            } else if ((var30 & 0x4) != 0) {
                var17--;
            }
            var30 = class120.field2651[var13][var17];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class18.field373[var38];
            int var33 = class98.field2123[var38];
            if (arg10 == 0) {
                class17.field364.method419(123, (byte) 0);
                class43.field1033++;
                class17.field364.method1101(var31 + var31 + 3, (byte) -32);
            }
            if (arg10 == 1) {
                class17.field364.method419(95, (byte) 0);
                class32.field838++;
                class17.field364.method1101(var31 + var31 + 3 + 14, (byte) -32);
            }
            if (arg10 == 2) {
                class17.field364.method419(52, (byte) 0);
                class148.field3376++;
                class17.field364.method1101(var31 + var31 + 3, (byte) -32);
            }
            class17.field364.method1078(arg11 + 81, class75.field1597 + var33);
            class17.field364.method1078(128, var32 + class56.field1260);
            class152.field3470 = class98.field2123[0];
            class130.field2973 = class18.field373[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class17.field364.method1101(class18.field373[var38] - var32, (byte) -32);
                class17.field364.method1101(class98.field2123[var38] - var33, (byte) -32);
            }
            class17.field364.method1071(class28.field753[82] ? 1 : 0, arg11 ^ 0x20);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
