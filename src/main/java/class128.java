import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class128 extends class113 {

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "I")
    private int field3240 = 0;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "Z")
    private boolean field3243 = false;

    @OriginalMember(owner = "client!sd", name = "sb", descriptor = "I")
    private int field3257 = 0;

    @OriginalMember(owner = "client!sd", name = "jb", descriptor = "I")
    private int field3248;

    @OriginalMember(owner = "client!sd", name = "Db", descriptor = "I")
    public int field3268;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
    private int field3244;

    @OriginalMember(owner = "client!sd", name = "rb", descriptor = "I")
    public int field3256;

    @OriginalMember(owner = "client!sd", name = "Rb", descriptor = "I")
    public int field3282;

    @OriginalMember(owner = "client!sd", name = "Bb", descriptor = "I")
    private int field3266;

    @OriginalMember(owner = "client!sd", name = "nb", descriptor = "I")
    public int field3252;

    @OriginalMember(owner = "client!sd", name = "Ob", descriptor = "I")
    private int field3279;

    @OriginalMember(owner = "client!sd", name = "Tb", descriptor = "I")
    private int field3284;

    @OriginalMember(owner = "client!sd", name = "Qb", descriptor = "I")
    public int field3281;

    @OriginalMember(owner = "client!sd", name = "Eb", descriptor = "I")
    private int field3269;

    @OriginalMember(owner = "client!sd", name = "Mb", descriptor = "Lqe;")
    private class116 field3277;

    @OriginalMember(owner = "client!sd", name = "pb", descriptor = "Z")
    public static boolean field3254 = false;

    @OriginalMember(owner = "client!sd", name = "ub", descriptor = "Lfc;")
    public static class39 field3259 = class90.method774("Das ist eine Mitglieder)2Welt(Q", -122);

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "Z")
    public static boolean field3242 = false;

    @OriginalMember(owner = "client!sd", name = "Kb", descriptor = "I")
    public static int field3275 = 0;

    @OriginalMember(owner = "client!sd", name = "Ab", descriptor = "I")
    public static int field3265 = 0;

    @OriginalMember(owner = "client!sd", name = "ob", descriptor = "I")
    public static int field3253 = 0;

    @OriginalMember(owner = "client!sd", name = "yb", descriptor = "Lfc;")
    private static class39 field3263 = class90.method774("Create a free account", -84);

    @OriginalMember(owner = "client!sd", name = "Lb", descriptor = "Lfc;")
    public static class39 field3276 = class90.method774("backright1", -94);

    @OriginalMember(owner = "client!sd", name = "vb", descriptor = "Lfc;")
    public static class39 field3260 = class90.method774("und loggen sich dann erneut ein)3", -108);

    @OriginalMember(owner = "client!sd", name = "Sb", descriptor = "Lfc;")
    public static class39 field3283 = field3263;

    @OriginalMember(owner = "client!sd", name = "gb", descriptor = "D")
    private double field3245;

    @OriginalMember(owner = "client!sd", name = "lb", descriptor = "D")
    private double field3250;

    @OriginalMember(owner = "client!sd", name = "qb", descriptor = "D")
    public double field3255;

    @OriginalMember(owner = "client!sd", name = "xb", descriptor = "D")
    public double field3262;

    @OriginalMember(owner = "client!sd", name = "zb", descriptor = "D")
    private double field3264;

    @OriginalMember(owner = "client!sd", name = "Fb", descriptor = "D")
    private double field3270;

    @OriginalMember(owner = "client!sd", name = "Ib", descriptor = "D")
    private double field3273;

    @OriginalMember(owner = "client!sd", name = "Ub", descriptor = "D")
    public double field3285;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!sd", name = "hb", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!sd", name = "ib", descriptor = "I")
    public int field3247;

    @OriginalMember(owner = "client!sd", name = "kb", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!sd", name = "mb", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!sd", name = "tb", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!sd", name = "wb", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!sd", name = "Gb", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!sd", name = "Jb", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!sd", name = "Nb", descriptor = "I")
    private int field3278;

    @OriginalMember(owner = "client!sd", name = "Pb", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!sd", name = "Cb", descriptor = "Loc;")
    public static class100 field3267;

    @OriginalMember(owner = "client!sd", name = "Hb", descriptor = "Lmf;")
    public static class89 field3272;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(B)V", line = 4)
    public static void method1058(byte arg0) {
        field3263 = null;
        field3267 = null;
        field3259 = null;
        if (arg0 != 3) {
            method1061(-99, 64, 82, 1);
        }
        field3260 = null;
        field3276 = null;
        field3272 = null;
        field3283 = null;
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(B)V", line = 24)
    public static final void method1059(byte arg0) {
        field3274++;
        if (arg0 != 0) {
            method1065(-107);
        }
        class27.method341(0, class78.field1777);
        if (class108.field2708 != -1) {
            class27.method341(0, class108.field2708);
        }
        client.field547 = 0;
        class17.field492.method691(-44);
        class40.method490();
        class152.method1217();
        class28.method354(class78.field1777, 503, 0, 0, (byte) 74, 0, 765);
        if (class108.field2708 != -1) {
            class28.method354(class108.field2708, 503, 0, 0, (byte) -86, 0, 765);
        }
        if (class94.field2206) {
            class30.method366(16776960);
        } else {
            method1065(arg0 ^ 0x42);
            class17.method208((byte) 117);
        }
        try {
            Graphics var1 = class140.field3523.getGraphics();
            class17.field492.method129(var1, 0, 0, (byte) -128);
        } catch (Exception var2) {
            class140.field3523.repaint();
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 439)
    public class128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field3248 = arg4;
        this.field3268 = arg5;
        this.field3244 = arg7;
        this.field3256 = arg9;
        this.field3282 = arg1;
        this.field3266 = arg0;
        this.field3252 = arg10;
        this.field3279 = arg2;
        this.field3284 = arg3;
        this.field3281 = arg6;
        this.field3243 = false;
        this.field3269 = arg8;
        int var12 = class60.method598(this.field3266, 32).field2691;
        if (var12 == -1) {
            this.field3277 = null;
        } else {
            this.field3277 = class38.method430(2238, var12);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIB)V", line = 77)
    public final void method1060(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (!this.field3243) {
            double var6 = (double) (arg0 - this.field3284);
            double var8 = (double) (arg2 - this.field3279);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3285 = (double) this.field3269 * var6 / var10 + (double) this.field3284;
            this.field3262 = (double) this.field3269 * var8 / var10 + (double) this.field3279;
            this.field3255 = this.field3248;
        }
        field3251++;
        double var12 = (double) (this.field3281 + 1 - arg3);
        this.field3273 = ((double) arg2 - this.field3262) / var12;
        this.field3250 = ((double) arg0 - this.field3285) / var12;
        this.field3245 = Math.sqrt(this.field3273 * this.field3273 + this.field3250 * this.field3250);
        if (!this.field3243) {
            this.field3264 = -this.field3245 * Math.tan((double) this.field3244 * 0.02454369D);
        }
        if (arg4 <= 67) {
            field3253 = -23;
        }
        this.field3270 = ((double) arg1 - this.field3255 - this.field3264 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)Lda;", line = 109)
    public final class23 method153(int arg0) {
        field3241++;
        class107 var2 = class60.method598(this.field3266, 32);
        if (arg0 != 64) {
            this.field3256 = 72;
        }
        class23 var3 = var2.method943(this.field3240, 16664);
        if (var3 == null) {
            return null;
        } else {
            var3.method271(this.field3278);
            return var3;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)V", line = 138)
    public static final void method1061(int arg0, int arg1, int arg2, int arg3) {
        field3271++;
        if (arg0 != -28653) {
            field3259 = null;
        }
        class99 var4 = class72.method663(arg1, 0, arg3);
        if (var4 != null && var4.field2387 != null) {
            class30.method365(arg0 + 28657, var4, var4.field2387, null, 0, 0, 0);
        }
        class55.field1392 = arg3;
        class109.field2790 = arg2;
        class97.field2313 = true;
        class65.field1565 = arg1;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V", line = 171)
    public final void method1062(int arg0, int arg1) {
        this.field3243 = true;
        this.field3262 += (double) arg0 * this.field3273;
        this.field3285 += (double) arg0 * this.field3250;
        this.field3255 += this.field3270 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field3264;
        this.field3264 += (double) arg0 * this.field3270;
        this.field3247 = (int) (Math.atan2(this.field3273, this.field3250) * 325.949D) + 1024 & 0x7FF;
        this.field3278 = (int) (Math.atan2(this.field3264, this.field3245) * 325.949D) & 0x7FF;
        field3246++;
        if (arg1 != -13439 || this.field3277 == null) {
            return;
        }
        this.field3257 += arg0;
        while (true) {
            do {
                do {
                    if (this.field3257 <= this.field3277.field3035[this.field3240]) {
                        return;
                    }
                    this.field3257 -= this.field3277.field3035[this.field3240];
                    this.field3240++;
                } while (this.field3240 < this.field3277.field3057.length);
                this.field3240 -= this.field3277.field3041;
            } while (this.field3240 >= 0 && this.field3240 < this.field3277.field3057.length);
            this.field3240 = 0;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILob;)Lfc;", line = 221)
    public static final class39 method1063(int arg0, class99 arg1) {
        field3280++;
        if (class67.method639(class89.method768(arg1, arg0 ^ 0xFFFF8046), 33) == 0) {
            return null;
        } else if (arg1.field2346 == null || arg1.field2346.method448((byte) -127).method437(arg0 ^ 0xFFFF807A) == 0) {
            return class38.field1026 ? class39.field1087 : null;
        } else if (arg0 == -32738) {
            return arg1.field2346;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(JI)V", line = 251)
    public static final void method1064(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
            if (arg1 != -4409) {
                field3259 = null;
            }
        } catch (InterruptedException var3) {
        }
        field3258++;
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V", line = 284)
    public static final void method1065(int arg0) {
        field3261++;
        if (class60.field1477 != 0) {
            return;
        }
        class109.field2805[0] = 1003;
        class126.field3207 = 1;
        class97.field2315[0] = class43.field1187;
        if (class78.field1777 != -1) {
            class100.field2465 = -1;
            class1.field5 = -1;
            class24.method277(0, class12.field314, 503, 0, 0, -1, class131.field3322, class78.field1777, 765);
            class57.field1417 = class100.field2465;
            class31.field872 = class1.field5;
            return;
        }
        class137.method1113((byte) 45);
        class1.field5 = -1;
        class100.field2465 = -1;
        if (class12.field314 > 4 && class131.field3322 > 4 && class12.field314 < 516 && class131.field3322 < 338) {
            if (class126.field3198 == -1) {
                class71.method656(false);
            } else {
                class24.method277(4, class12.field314, 338, 4, 0, -1, class131.field3322, class126.field3198, 516);
            }
        }
        class31.field872 = class1.field5;
        class1.field5 = -1;
        class57.field1417 = class100.field2465;
        int var1 = -48 / ((arg0 + 23) / 59);
        boolean var2 = false;
        class100.field2465 = -1;
        if (class12.field314 > 553 && class131.field3322 > 205 && class12.field314 < 743 && class131.field3322 < 466) {
            if (class37.field1018 != -1) {
                class24.method277(205, class12.field314, 466, 553, 1, -1, class131.field3322, class37.field1018, 743);
            } else if (class25.field740[class104.field2633] != -1) {
                class24.method277(205, class12.field314, 466, 553, 1, -1, class131.field3322, class25.field740[class104.field2633], 743);
            }
        }
        if (class9.field246 != class100.field2465) {
            class9.field246 = class100.field2465;
            class104.field2638 = true;
        }
        if (class150.field3715 != class1.field5) {
            class104.field2638 = true;
            class150.field3715 = class1.field5;
        }
        class100.field2465 = -1;
        class1.field5 = -1;
        if (class12.field314 > 17 && class131.field3322 > 357 && class12.field314 < 496 && class131.field3322 < 453) {
            if (class37.field1008 != -1) {
                class24.method277(357, class12.field314, 453, 17, 2, -1, class131.field3322, class37.field1008, 496);
            } else if (class126.field3203 != -1) {
                class24.method277(357, class12.field314, 453, 17, 3, -1, class131.field3322, class126.field3203, 496);
            } else if (class131.field3322 < 434 && class12.field314 < 426) {
                class151.method1204(class12.field314 - 17, 113, class131.field3322 - 357);
            }
        }
        if ((class37.field1008 != -1 || class126.field3203 != -1) && class62.field1527 != class100.field2465) {
            class62.field1527 = class100.field2465;
            field3242 = true;
        }
        if ((class37.field1008 != -1 || class126.field3203 != -1) && class114.field2998 != class1.field5) {
            field3242 = true;
            class114.field2998 = class1.field5;
        }
        while (!var2) {
            var2 = true;
            for (int var3 = 0; var3 < class126.field3207 - 1; var3++) {
                if (class109.field2805[var3] < 1000 && class109.field2805[var3 + 1] > 1000) {
                    var2 = false;
                    class39 var4 = class97.field2315[var3];
                    class97.field2315[var3] = class97.field2315[var3 + 1];
                    class97.field2315[var3 + 1] = var4;
                    int var5 = class109.field2805[var3];
                    class109.field2805[var3] = class109.field2805[var3 + 1];
                    class109.field2805[var3 + 1] = var5;
                    int var6 = class99.field2439[var3];
                    class99.field2439[var3] = class99.field2439[var3 + 1];
                    class99.field2439[var3 + 1] = var6;
                    int var7 = class54.field1340[var3];
                    class54.field1340[var3] = class54.field1340[var3 + 1];
                    class54.field1340[var3 + 1] = var7;
                    int var8 = class117.field3076[var3];
                    class117.field3076[var3] = class117.field3076[var3 + 1];
                    class117.field3076[var3 + 1] = var8;
                }
            }
        }
    }
}
