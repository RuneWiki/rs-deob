import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class171 {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "[[I")
    private int[][] field2676;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    private int field2688;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    private int field2686;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)I")
    public static final int method1183(int arg0, int arg1) {
        field2675++;
        int var2 = arg0 & 0x3F;
        if (arg1 >= -111) {
            method1184(64);
        }
        int var3 = (arg0 & 0xCE) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static final void method1184(int arg0) {
        field2674++;
        class427.method2646(false, (byte) -65);
        class322.field5031 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class254.field4123.length; var2++) {
            if (class362.field5524[var2] != -1 && class254.field4123[var2] == null) {
                class254.field4123[var2] = class212.field3401.method2771(class362.field5524[var2], 0, 3);
                if (class254.field4123[var2] == null) {
                    var1 = false;
                    class322.field5031++;
                }
            }
            if (class436.field6417[var2] != -1 && class376.field5693[var2] == null) {
                class376.field5693[var2] = class212.field3401.method2759(class436.field6417[var2], 0, class440.field6449[var2], 27149);
                if (class376.field5693[var2] == null) {
                    class322.field5031++;
                    var1 = false;
                }
            }
            if (class102.field1425[var2] != -1 && class376.field5690[var2] == null) {
                class376.field5690[var2] = class212.field3401.method2771(class102.field1425[var2], 0, 3);
                if (class376.field5690[var2] == null) {
                    var1 = false;
                    class322.field5031++;
                }
            }
            if (class236.field3945[var2] != -1 && class431.field6341[var2] == null) {
                class431.field6341[var2] = class212.field3401.method2771(class236.field3945[var2], 0, class121.method873(arg0, -31084));
                if (class431.field6341[var2] == null) {
                    var1 = false;
                    class322.field5031++;
                }
            }
            if (class71.field876 != null && class246.field4031[var2] == null && class71.field876[var2] != -1) {
                class246.field4031[var2] = class212.field3401.method2759(class71.field876[var2], 0, class440.field6449[var2], class121.method873(arg0, -4966));
                if (class246.field4031[var2] == null) {
                    var1 = false;
                    class322.field5031++;
                }
            }
        }
        if (class396.field5932 == null) {
            if (class336.field5228 == null || !class311.field4900.method2769(class336.field5228.field273 + "_staticelements", arg0 ^ 0xFFFF8692)) {
                class396.field5932 = new class362(0);
            } else if (class311.field4900.method2780(class336.field5228.field273 + "_staticelements", (byte) 89)) {
                class396.field5932 = class54.method359(-90, class311.field4900, class336.field5228.field273 + "_staticelements", class84.field1040);
            } else {
                var1 = false;
                class322.field5031++;
            }
        }
        if (!var1) {
            class201.field3224 = 1;
            return;
        }
        class239.field3975 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class254.field4123.length; var4++) {
            byte[] var20 = class376.field5693[var4];
            if (var20 != null) {
                int var21 = (class52.field640[var4] >> 8) * 64 - class409.field6048;
                int var22 = (class52.field640[var4] & 0xFF) * 64 - class444.field6481;
                if (class236.field3947) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class119.method860(var22, var20, var21, false);
            }
            byte[] var23 = class431.field6341[var4];
            if (var23 != null) {
                int var24 = (class52.field640[var4] >> 8) * 64 - class409.field6048;
                int var25 = (class52.field640[var4] & 0xFF) * 64 - class444.field6481;
                if (class236.field3947) {
                    var25 = 10;
                    var24 = 10;
                }
                var3 &= class119.method860(var25, var23, var24, false);
            }
        }
        if (!var3) {
            class201.field3224 = 2;
            return;
        }
        if (class201.field3224 != 0) {
            class136.method996(class330.field5168 + "<br>(100%)", true, (byte) -69, class435.field6411);
        }
        class409.method2566(true);
        class346.method2261(15);
        boolean var5 = false;
        if (class284.field4547.method660() && class220.field3627) {
            for (int var6 = 0; var6 < class254.field4123.length; var6++) {
                if (class431.field6341[var6] != null || class376.field5690[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class241.field3987) {
            var7 = class238.field3960[class198.field3191];
        } else {
            var7 = class376.field5691[class198.field3191];
        }
        if (class284.field4547.method594()) {
            var7++;
        }
        class136.method994(4, class80.field1003, class380.field5751, var7, var5, class284.field4547.method606() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class162.field2547[var8].method465(2097152);
        }
        class391.method2466(arg0 ^ 0xFFFF868C);
        class186.method1320(-2097152, false);
        class53.method342(0);
        class409.method2566(true);
        System.gc();
        class427.method2646(true, (byte) -107);
        class158.method1109(false, 4, (byte) -73);
        int[][] var9 = null;
        if (!class236.field3947) {
            class263.method1801(false, (byte) -109);
            class35.method230(class261.field4201.field1906[0] >> 3, class261.field4201.field1916[0] >> 3, (byte) 68);
            class223.method1594(-124);
            class40.method267(arg0 + 39342, class284.field4547, 4, (int[][]) null, false);
            var9 = class281.field4509[0];
            class427.method2646(true, (byte) -96);
            class223.method1601(-99, false);
            if (class246.field4031 != null) {
                class166.method1166(-93);
            }
        }
        if (class236.field3947) {
            class421.method2617(false, true);
            class35.method230(class261.field4201.field1906[0] >> 3, class261.field4201.field1916[0] >> 3, (byte) 61);
            class223.method1594(arg0 ^ 0xFFFF86D9);
            class40.method267(arg0 + 39342, class284.field4547, 4, (int[][]) null, false);
            var9 = class281.field4509[0];
            class427.method2646(true, (byte) -125);
            class372.method2375(-29832, false);
        }
        class346.method2261(15);
        class427.method2646(true, (byte) -124);
        class230.method1637(false, 4, (byte) 120, class284.field4547, class162.field2547, (class129) null);
        class138.method1006(4, class284.field4547, -121);
        class427.method2646(true, (byte) -103);
        int var10 = class51.field632;
        if (var10 > class266.field4286) {
            var10 = class266.field4286;
        }
        if (class266.field4286 - 1 > var10) {
            var10 = class266.field4286 - 1;
        }
        if (arg0 != -31081) {
            method1185(7);
        }
        if (class117.method852(true)) {
            class304.method2052(0);
        } else {
            class304.method2052(var10);
        }
        class426.method2643((byte) 116);
        if (var5) {
            class91.method539(true);
            class158.method1109(true, 1, (byte) -69);
            if (!class236.field3947) {
                class263.method1801(true, (byte) -123);
                class40.method267(8261, class284.field4547, 1, var9, true);
                class427.method2646(true, (byte) -68);
                class223.method1601(-91, true);
                class138.method1006(1, class284.field4547, -116);
            }
            if (class236.field3947) {
                class421.method2617(true, true);
                class40.method267(8261, class284.field4547, 1, var9, true);
                class427.method2646(true, (byte) -72);
                class372.method2375(arg0 ^ 0xDEF, true);
            }
            class346.method2261(15);
            class427.method2646(true, (byte) -101);
            class230.method1637(true, 1, (byte) 125, class284.field4547, class162.field2547, class181.field2961[0]);
            class138.method1006(1, class284.field4547, -112);
            class427.method2646(true, (byte) -102);
            class426.method2643((byte) 34);
            class91.method539(false);
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var18 = 0; var18 < class80.field1003; var18++) {
                for (int var19 = 0; var19 < class380.field5751; var19++) {
                    class309.method2072(var11, var19, var18, (byte) -35);
                }
            }
        }
        class111.method825((byte) -128);
        class409.method2566(true);
        class297.method2005(108);
        class346.method2261(15);
        class255.field4136 = false;
        class183.method1253((byte) 89);
        if (class47.field587 != null && class421.field6216 != null && class262.field4219 == 25) {
            class375.field5677++;
            class11.field139.method2224(151, (byte) 0);
            class11.field139.method1315(1057001181, (byte) 103);
        }
        if (!class236.field3947) {
            int var12 = (class418.field6195 - (class80.field1003 >> 4)) / 8;
            int var13 = ((class80.field1003 >> 4) + class418.field6195) / 8;
            int var14 = (class222.field3698 - (class380.field5751 >> 4)) / 8;
            int var15 = ((class380.field5751 >> 4) + class222.field3698) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= var15 + 1; var17++) {
                    if (var12 > var16 || var13 < var16 || var14 > var17 || var17 > var15) {
                        class212.field3401.method2790(false, "m" + var16 + "_" + var17);
                        class212.field3401.method2790(false, "l" + var16 + "_" + var17);
                    }
                }
            }
        }
        if (class262.field4219 == 28) {
            class128.method953(16205, 10);
        } else {
            class128.method953(16205, 30);
            if (class421.field6216 != null) {
                class11.field139.method2224(135, (byte) 0);
            }
        }
        class298.method2010(true);
        class409.method2566(true);
        class448.method2793(-115);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static final void method1185(int arg0) {
        field2677++;
        try {
            if (arg0 != 0) {
                field2684 = 98;
            }
            if (class417.field6178 == 1) {
                int var1 = class285.field4582.method1512(8048);
                if (var1 > 0 && class285.field4582.method1531((byte) 111)) {
                    int var2 = var1 - class220.field3625;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class285.field4582.method1527(122, var2);
                } else {
                    class285.field4582.method1536(126);
                    class285.field4582.method1519(false);
                    class359.field5487 = null;
                    if (class390.field5860 == null) {
                        class417.field6178 = 0;
                    } else {
                        class417.field6178 = 2;
                    }
                    class70.field868 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class285.field4582.method1536(126);
            class70.field868 = null;
            class390.field5860 = null;
            class417.field6178 = 0;
            class359.field5487 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)I")
    public static final int method1186(byte arg0) {
        field2683++;
        if (arg0 != -78) {
            field2684 = 118;
        }
        return 2;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
    public static final Object method1187(int arg0, byte[] arg1, boolean arg2) {
        field2681++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 < arg1.length && !class54.field684) {
            try {
                class107 var3 = (class107) Class.forName("il").getDeclaredConstructor().newInstance();
                var3.method79(arg1, (byte) 26);
                return var3;
            } catch (Throwable var4) {
                class54.field684 = true;
            }
        }
        return arg2 ? class264.method1806(-100, arg1) : arg1;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BB)V")
    public static final void method1188(byte arg0, byte arg1) {
        field2679++;
        if (class427.field6304 == null) {
            class427.field6304 = new byte[4][class80.field1003][class380.field5751];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class80.field1003; var3++) {
                for (int var4 = 0; var4 < class380.field5751; var4++) {
                    class427.field6304[var2][var3][var4] = arg0;
                }
            }
        }
        if (arg1 != 19) {
            method1184(33);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)I")
    public final int method1189(byte arg0, int arg1) {
        if (this.field2676 != null) {
            arg1 = (int) ((long) this.field2686 * (long) arg1 / (long) this.field2688);
        }
        field2682++;
        if (arg0 <= 37) {
            method1187(-8, (byte[]) null, false);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)I")
    public final int method1190(int arg0, int arg1) {
        int var3 = 15 % ((arg1 - 75) / 44);
        field2689++;
        if (this.field2676 != null) {
            arg0 = (int) ((long) this.field2686 * (long) arg0 / (long) this.field2688) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(II)V")
    public class171(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class395.method2491(arg1, (byte) 127, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field2676 = new int[var5][14];
            this.field2688 = var5;
            this.field2686 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2676[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([BI)[B")
    public final byte[] method1191(byte[] arg0, int arg1) {
        if (arg1 != 0) {
            field2684 = 86;
        }
        field2678++;
        if (this.field2676 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field2686 / (long) this.field2688) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field2676[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2686 + var6;
                int var14 = var13 / this.field2688;
                var6 = var13 - this.field2688 * var14;
                var5 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V")
    public static final void method1192(int arg0, int arg1, int arg2) {
        field2687++;
        class211 var3 = class281.method1921(14, arg1, (byte) -109);
        var3.method1490((byte) 117);
        if (arg0 != 24554) {
            method1184(6);
        }
        var3.field3379 = arg2;
    }
}
