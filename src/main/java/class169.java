import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class169 extends class139 {

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "Z")
    private boolean field2982 = false;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    private int field2995 = 0;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "I")
    private int field3006 = -32768;

    @OriginalMember(owner = "client!sg", name = "V", descriptor = "I")
    private int field3011 = 0;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    private int field2987;

    @OriginalMember(owner = "client!sg", name = "Y", descriptor = "I")
    private int field3014;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public int field2990;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    public int field2991;

    @OriginalMember(owner = "client!sg", name = "W", descriptor = "I")
    public int field3012;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    private int field2979;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    private int field2992;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public int field2977;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    private int field2989;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    private int field2986;

    @OriginalMember(owner = "client!sg", name = "ab", descriptor = "I")
    public int field3016;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "Lwk;")
    private class170 field2984;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
    public static int field2996 = 0;

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "Lha;")
    public static class46 field3007 = class271.method1828("(U5", -46);

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field2980 = 0;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "D")
    private double field2976;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "D")
    private double field2978;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "D")
    private double field2981;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "D")
    private double field2988;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "D")
    public double field2998;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "D")
    public double field3003;

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "D")
    public double field3004;

    @OriginalMember(owner = "client!sg", name = "bb", descriptor = "D")
    private double field3017;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
    private int field3005;

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!sg", name = "X", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!sg", name = "Z", descriptor = "Lhi;")
    public static class24 field3015;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "[I")
    public static int[] field2999;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != -7748) {
            return;
        }
        if (arg6 >= 0 && arg3 >= 0 && arg6 < 103 && arg3 < 103) {
            if (arg7 == 0) {
                class255 var8 = class201.method1429(arg5, arg6, arg3);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field4464 >>> 32);
                    if (arg2 == 2) {
                        var8.field4466 = new class127(var9, 2, arg0 + 4, arg5, arg6, arg3, arg1, false, var8.field4466);
                        var8.field4463 = new class127(var9, 2, arg0 + 1 & 0x3, arg5, arg6, arg3, arg1, false, var8.field4463);
                    } else {
                        var8.field4466 = new class127(var9, arg2, arg0, arg5, arg6, arg3, arg1, false, var8.field4466);
                    }
                }
            }
            if (arg7 == 1) {
                class168 var10 = class7.method32(arg5, arg6, arg3);
                if (var10 != null) {
                    int var11 = (int) (var10.field2949 >>> 32) & Integer.MAX_VALUE;
                    if (arg2 == 4 || arg2 == 5) {
                        var10.field2951 = new class127(var11, 4, arg0, arg5, arg6, arg3, arg1, false, var10.field2951);
                    } else if (arg2 == 6) {
                        var10.field2951 = new class127(var11, 4, arg0 + 4, arg5, arg6, arg3, arg1, false, var10.field2951);
                    } else if (arg2 == 7) {
                        var10.field2951 = new class127(var11, 4, (arg0 + 2 & 0x3) + 4, arg5, arg6, arg3, arg1, false, var10.field2951);
                    } else if (arg2 == 8) {
                        var10.field2951 = new class127(var11, 4, arg0 + 4, arg5, arg6, arg3, arg1, false, var10.field2951);
                        var10.field2964 = new class127(var11, 4, (arg0 + 2 & 0x3) + 4, arg5, arg6, arg3, arg1, false, var10.field2964);
                    }
                }
            }
            if (arg7 == 2) {
                if (arg2 == 11) {
                    arg2 = 10;
                }
                class197 var12 = class193.method1396(arg5, arg6, arg3);
                if (var12 != null) {
                    var12.field3532 = new class127((int) (var12.field3523 >>> 32) & Integer.MAX_VALUE, arg2, arg0, arg5, arg6, arg3, arg1, false, var12.field3532);
                }
            }
            if (arg7 == 3) {
                class182 var13 = class199.method1420(arg5, arg6, arg3);
                if (var13 != null) {
                    var13.field3269 = new class127((int) (var13.field3272 >>> 32) & Integer.MAX_VALUE, 22, arg0, arg5, arg6, arg3, arg1, false, var13.field3269);
                }
            }
        }
        field3002++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1200(Component arg0, byte arg1) {
        arg0.removeKeyListener(class48.field830);
        arg0.removeFocusListener(class48.field830);
        if (arg1 >= -116) {
            field3009 = 19;
        }
        class149.field2674 = -1;
        field2983++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method1201(int arg0) {
        if (arg0 != 100) {
            method1201(-107);
        }
        field3015 = null;
        field3007 = null;
        field2999 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()I")
    public final int method183() {
        field2994++;
        return this.field3006;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3008++;
        class36 var11 = this.method1202(100);
        if (var11 != null) {
            var11.method185(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3006 = var11.method183();
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)Lme;")
    private final class36 method1202(int arg0) {
        class272 var2 = class138.method1054(-22225, this.field2992);
        field3010++;
        class36 var3 = var2.method1831((byte) 18, this.field3011);
        if (var3 == null) {
            return null;
        } else {
            int var4 = -53 % ((arg0 + 42) / 50);
            var3.method242(this.field3005);
            return var3;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public static final void method1203(byte arg0) {
        class185.method1336((byte) -69, false);
        class3.field47 = 0;
        field3001++;
        boolean var1 = true;
        int var2 = 0;
        if (arg0 != 70) {
            method1200((Component) null, (byte) -61);
        }
        while (var2 < class131.field2398.length) {
            if (class194.field3491[var2] != -1 && class131.field2398[var2] == null) {
                class131.field2398[var2] = class232.field4018.method1293(0, class194.field3491[var2], (byte) 120);
                if (class131.field2398[var2] == null) {
                    class3.field47++;
                    var1 = false;
                }
            }
            if (class269.field4664[var2] != -1 && class119.field2231[var2] == null) {
                class119.field2231[var2] = class232.field4018.method1308(0, class269.field4664[var2], (byte) 58, class139.field2493[var2]);
                if (class119.field2231[var2] == null) {
                    class3.field47++;
                    var1 = false;
                }
            }
            if (class190.field3393 != null && class235.field4082[var2] == null && class190.field3393[var2] != -1) {
                class235.field4082[var2] = class232.field4018.method1308(0, class190.field3393[var2], (byte) 122, class139.field2493[var2]);
                if (class235.field4082[var2] == null) {
                    class3.field47++;
                    var1 = false;
                }
            }
            var2++;
        }
        if (class227.field3974 == null) {
            if (class255.field4467 == null || !class26.field516.method1300(false, class109.method855(0, new class46[] { class255.field4467.field1325, class188.field3366 }))) {
                class227.field3974 = new class238(0);
            } else if (class26.field516.method1316(class109.method855(0, new class46[] { class255.field4467.field1325, class188.field3366 }), arg0 - 24)) {
                class227.field3974 = class173.method1245(class26.field516, class109.method855(arg0 - 70, new class46[] { class255.field4467.field1325, class188.field3366 }), arg0 + 50);
            } else {
                class3.field47++;
                var1 = false;
            }
        }
        if (!var1) {
            class33.field617 = 1;
            return;
        }
        class155.field2753 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class131.field2398.length; var4++) {
            byte[] var20 = class119.field2231[var4];
            if (var20 != null) {
                int var21 = (class92.field1717[var4] >> 8) * 64 - class29.field567;
                int var22 = (class92.field1717[var4] & 0xFF) * 64 - class77.field1432;
                if (class213.field3790) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class148.method1097(var21, var22, var20, 1);
            }
        }
        if (!var3) {
            class33.field617 = 2;
            return;
        }
        if (class33.field617 != 0) {
            class131.method1014((byte) -125, true, class109.method855(0, new class46[] { class181.field3256, class63.field1069 }));
        }
        class267.method1789(78);
        class199.method1421(-28124);
        boolean var5 = false;
        class79.method631(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class183.field3282[var6].method1119(true);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class111.field2081[var7][var18][var19] = 0;
                }
            }
        }
        class90.method698(64, false);
        class267.method1789(arg0 ^ 0x3F);
        System.gc();
        class185.method1336((byte) -69, true);
        class208.method1468((byte) -85, false);
        if (!class213.field3790) {
            class52.method378(false, true);
            class185.method1336((byte) -69, true);
            class171.method1221(false, false);
            if (class235.field4082 != null) {
                class190.method1380((byte) 90);
            }
        }
        if (class213.field3790) {
            class79.method628(false, (byte) 125);
            class185.method1336((byte) -69, true);
            class187.method1359(false, 26953);
        }
        class199.method1421(arg0 - 28194);
        class185.method1336((byte) -69, true);
        class275.method1858(class183.field3282, -7682, false);
        class185.method1336((byte) -69, true);
        int var8 = class203.field3637;
        if (class135.field2450 < var8) {
            var8 = class135.field2450;
        }
        if (var8 < class135.field2450 - 1) {
            int var9 = class135.field2450 - 1;
        }
        if (class180.method1291(2047)) {
            class258.method1732(0);
        } else {
            class258.method1732(class203.field3637);
        }
        class216.method1511(16085);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class189.method1373(-102, var17, var10);
            }
        }
        class272.method1838(-119);
        class267.method1789(68);
        class227.method1552((byte) 91);
        class199.method1421(arg0 - 28194);
        if (class227.field3983 != null && class71.field1214 != null && class135.field2448 == 25) {
            class58.field967.method285((byte) -90, 25);
            class58.field967.method581(true, 1057001181);
            class201.field3578++;
        }
        if (!class213.field3790) {
            int var11 = (class38.field669 - 6) / 8;
            int var12 = (class97.field1801 - 6) / 8;
            int var13 = (class38.field669 + 6) / 8;
            int var14 = (class97.field1801 + 6) / 8;
            for (int var15 = var11 - 1; var15 <= var13 + 1; var15++) {
                for (int var16 = var12 - 1; var16 <= (var14 + 1); var16++) {
                    if (var11 > var15 || var13 < var15 || var16 < var12 || var16 > var14) {
                        class232.field4018.method1297((byte) -92, class109.method855(0, new class46[] { class235.field4091, class115.method932(false, var15), class141.field2558, class115.method932(false, var16) }));
                        class232.field4018.method1297((byte) -92, class109.method855(0, new class46[] { class77.field1436, class115.method932(false, var15), class141.field2558, class115.method932(false, var16) }));
                    }
                }
            }
        }
        if (class135.field2448 == 28) {
            class83.method661(10, 0);
        } else {
            class83.method661(30, 0);
            if (class71.field1214 != null) {
                class58.field967.method285((byte) -90, 70);
            }
        }
        class267.method1789(94);
        class82.method654((byte) -76);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIII)V")
    public static final void method1204(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 8) {
            field2996 = -127;
        }
        field3013++;
        if (class126.field2313 == 1) {
            class197.field3521[class58.field964 / 100].method119(class78.field1493 - 8, class277.field4821 + -8);
        }
        if (class126.field2313 == 2) {
            class197.field3521[class58.field964 / 100 + 4].method119(class78.field1493 - 8, class277.field4821 - 8);
        }
        class134.method1028((byte) 38);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIZII)V")
    public final void method1205(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!this.field2982) {
            double var6 = (double) (arg4 - this.field2987);
            double var8 = (double) (arg0 - this.field2979);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3004 = (double) this.field2989;
            this.field2998 = (double) this.field2986 * var6 / var10 + (double) this.field2987;
            this.field3003 = (double) this.field2986 * var8 / var10 + (double) this.field2979;
        }
        if (!arg2) {
            method1204(46, 116, -111, 111, -96);
        }
        field3000++;
        double var12 = (double) (this.field2991 + 1 - arg1);
        this.field2988 = ((double) arg0 - this.field3003) / var12;
        this.field2981 = ((double) arg4 - this.field2998) / var12;
        this.field3017 = Math.sqrt(this.field2988 * this.field2988 + this.field2981 * this.field2981);
        if (!this.field2982) {
            this.field2978 = -this.field3017 * Math.tan((double) this.field3014 * 0.02454369D);
        }
        this.field2976 = ((double) arg3 - this.field3004 - (this.field2978 * var12)) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZI)V")
    public final void method1206(boolean arg0, int arg1) {
        this.field2982 = true;
        this.field3003 += (double) arg1 * this.field2988;
        field2997++;
        this.field2998 += (double) arg1 * this.field2981;
        this.field3004 += this.field2976 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2978;
        this.field2978 += (double) arg1 * this.field2976;
        this.field2985 = (int) (Math.atan2(this.field2981, this.field2988) * 325.949D) + 1024 & 0x7FF;
        this.field3005 = (int) (Math.atan2(this.field2978, this.field3017) * 325.949D) & 0x7FF;
        if (arg0 || this.field2984 == null) {
            return;
        }
        this.field2995 += arg1;
        while (true) {
            do {
                do {
                    if (this.field2984.field3040[this.field3011] >= this.field2995) {
                        return;
                    }
                    this.field2995 -= this.field2984.field3040[this.field3011];
                    this.field3011++;
                } while (this.field2984.field3020.length > this.field3011);
                this.field3011 -= this.field2984.field3047;
            } while (this.field3011 >= 0 && this.field2984.field3020.length > this.field3011);
            this.field3011 = 0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2987 = arg2;
        this.field3014 = arg7;
        this.field2990 = arg5;
        this.field2991 = arg6;
        this.field3012 = arg9;
        this.field2979 = arg3;
        this.field2992 = arg0;
        this.field2977 = arg1;
        this.field2989 = arg4;
        this.field2986 = arg8;
        this.field2982 = false;
        this.field3016 = arg10;
        int var12 = class138.method1054(-22225, this.field2992).field4745;
        if (var12 == -1) {
            this.field2984 = null;
        } else {
            this.field2984 = class119.method951(0, var12);
        }
    }
}
