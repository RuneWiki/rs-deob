import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class44 extends class186 {

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    private int field946 = 0;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    private int field970 = 0;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
    private int field985 = -32768;

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "Z")
    private boolean field986 = false;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    private int field971;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public int field969;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    private int field951;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    private int field948;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    private int field956;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "I")
    private int field966;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "I")
    private int field978;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "Lki;")
    private class117 field952;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "Lqe;")
    public static class179 field950 = class206.method1380(" )2> <col=ffffff>", (byte) -126);

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Z")
    public static boolean field944 = false;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field953 = 50;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "Lqe;")
    public static class179 field954 = class206.method1380("<img=0>", (byte) 28);

    @OriginalMember(owner = "client!e", name = "C", descriptor = "Ltd;")
    public static class208 field957 = null;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public static int field968 = 0;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "Lqe;")
    private static class179 field975 = class206.method1380(" seconds)3", (byte) 22);

    @OriginalMember(owner = "client!e", name = "A", descriptor = "Lqe;")
    public static class179 field955 = field975;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "D")
    private double field947;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "D")
    public double field959;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "D")
    public double field960;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "D")
    private double field961;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "D")
    private double field963;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "D")
    private double field964;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "D")
    public double field979;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "D")
    private double field980;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    private int field972;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "Leh;")
    public static class52 field958;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field962++;
        class75 var11 = this.method287((byte) 124);
        if (var11 != null) {
            var11.method286(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field985 = var11.method295();
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)Lgj;")
    private final class75 method287(byte arg0) {
        class54 var2 = class180.method1180(114, this.field971);
        field981++;
        if (arg0 <= 53) {
            return null;
        }
        class75 var3 = var2.method375(this.field970, (byte) -123);
        if (var3 == null) {
            return null;
        } else {
            var3.method487(this.field972);
            return var3;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)V")
    public final void method288(int arg0, byte arg1) {
        if (arg1 <= 54) {
            this.field947 = 1.2771877286089968D;
        }
        this.field960 += (double) arg0 * this.field961;
        this.field959 += this.field964 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field980;
        this.field980 += (double) arg0 * this.field964;
        this.field986 = true;
        this.field979 += (double) arg0 * this.field947;
        field967++;
        this.field974 = (int) (Math.atan2(this.field961, this.field947) * 325.949D) + 1024 & 0x7FF;
        this.field972 = (int) (Math.atan2(this.field980, this.field963) * 325.949D) & 0x7FF;
        if (this.field952 == null) {
            return;
        }
        this.field946 += arg0;
        while (true) {
            do {
                do {
                    if (this.field952.field2199[this.field970] >= this.field946) {
                        return;
                    }
                    this.field946 -= this.field952.field2199[this.field970];
                    this.field970++;
                } while (this.field970 < this.field952.field2217.length);
                this.field970 -= this.field952.field2208;
            } while (this.field970 >= 0 && this.field970 < this.field952.field2217.length);
            this.field970 = 0;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
    public static void method289(byte arg0) {
        field958 = null;
        field950 = null;
        field954 = null;
        field975 = null;
        field955 = null;
        if (arg0 != 27) {
            method291(72, 68, false);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V")
    public static final void method290(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field976++;
        class239.field4401++;
        class55.method383(true, 61);
        class219.method1426(true, (byte) 93);
        class55.method383(false, 74);
        class219.method1426(false, (byte) 93);
        class98.method627(-13313);
        class30.method200(arg1 + 158);
        if (!class112.field2108) {
            int var5 = class236.field4342 + class195.field3627 & 0x7FF;
            int var6 = class175.field3145;
            if (var6 < class128.field2336 / 256) {
                var6 = class128.field2336 / 256;
            }
            if (class243.field4450[4] && class11.field296[4] + 128 > var6) {
                var6 = class11.field296[4] + 128;
            }
            class238.method1546(class234.field4321, var6, class202.method1341(arg1 ^ 0x43, class61.field1298.field3159, class49.field1038, class61.field1298.field3198) - 50, -40, arg2, var5, var6 * 3 + 600, class230.field4253);
        }
        int var7;
        if (class112.field2108) {
            var7 = class119.method768(12);
        } else {
            var7 = client.method214(arg1 + 112);
        }
        int var8 = class22.field538;
        int var9 = class198.field3700;
        int var10 = class225.field4177;
        int var11 = class18.field480;
        int var12 = class61.field1300;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class243.field4450[var13]) {
                int var20 = (int) ((double) -class146.field2654[var13] + Math.random() * (double) (class146.field2654[var13] * 2 + 1) + Math.sin((double) class95.field1779[var13] / 100.0D * (double) class71.field1424[var13]) * (double) class11.field296[var13]);
                if (var13 == 0) {
                    class22.field538 += var20;
                }
                if (var13 == 1) {
                    class225.field4177 += var20;
                }
                if (var13 == 4) {
                    class18.field480 += var20;
                    if (class18.field480 < 128) {
                        class18.field480 = 128;
                    }
                    if (class18.field480 > 383) {
                        class18.field480 = 383;
                    }
                }
                if (var13 == 2) {
                    class198.field3700 += var20;
                }
                if (var13 == 3) {
                    class61.field1300 = class61.field1300 + var20 & 0x7FF;
                }
            }
        }
        class145.method918(arg4, arg3, arg0 + arg4, arg2 + arg3);
        class27.method169();
        if (arg1 != -33) {
            field954 = null;
        }
        int var14 = class4.field61;
        int var15 = class139.field2559;
        if (var14 >= arg4 && var14 < arg0 + arg4 && arg3 <= var15 && arg2 + arg3 > var15) {
            int var16 = class17.field453;
            int var17 = class138.field2547;
            class68.field1369 = (class4.field61 - arg4) * (var17 - var16) / arg0 + var16;
            field944 = true;
            int var18 = class111.field2087;
            class50.field1080 = 0;
            int var19 = class123.field2281;
            class6.field211 = (var19 - var18) * (class139.field2559 - arg3) / arg2 + var18;
        } else {
            class50.field1080 = 0;
            field944 = false;
        }
        class218.method1422(3516);
        class145.method937(arg4, arg3, arg0, arg2, 0);
        class71.method455(class22.field538, class225.field4177, class198.field3700, class18.field480, class61.field1300, var7);
        class218.method1422(arg1 ^ 0xFFFFF263);
        class152.method968();
        class134.method857(arg0, 256, 0, arg4, arg3, 256, arg2);
        class111.method721(0, arg3, 256, arg4, arg2, arg0, 256);
        ((class81) class27.field597).method518(class66.field1342, (byte) -84);
        class117.method749(arg4, arg2, -4, arg3, arg0);
        class198.field3700 = var9;
        class61.field1300 = var12;
        class18.field480 = var11;
        class22.field538 = var8;
        class225.field4177 = var10;
        if (class43.field927 && class125.method792(true, false, (byte) 127) == 0) {
            class43.field927 = false;
        }
        if (class43.field927) {
            class145.method937(arg4, arg3, arg0, arg2, 0);
            class163.method1045(4, false, class32.field683);
        }
        if (!class43.field927 && !class182.field3358 && arg4 <= var14 && var14 < arg0 + arg4 && arg3 <= var15 && var15 < arg2 + arg3) {
            class39.method254(arg3, 1006, var14, var15, arg2, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZ)Lqe;")
    public static final class179 method291(int arg0, int arg1, boolean arg2) {
        if (arg0 <= 41) {
            return null;
        } else {
            field943++;
            return class42.method281(arg1, 10, -118, arg2);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Lje;")
    public static final class102 method292(int arg0, int arg1) {
        field982++;
        if (arg1 != -12437) {
            field954 = null;
        }
        if (arg0 == 0) {
            return new class34();
        } else if (arg0 == 1) {
            return new class235();
        } else if (arg0 == 2) {
            return new class56();
        } else if (arg0 == 3) {
            return new class129();
        } else if (arg0 == 4) {
            return new class111();
        } else if (arg0 == 5) {
            return new class38();
        } else if (arg0 == 6) {
            return new class2();
        } else if (arg0 == 7) {
            return new class119();
        } else if (arg0 == 8) {
            return new class205();
        } else if (arg0 == 9) {
            return new class238();
        } else if (arg0 == 10) {
            return new class227();
        } else if (arg0 == 11) {
            return new class234();
        } else if (arg0 == 12) {
            return new class86();
        } else if (arg0 == 13) {
            return new class190();
        } else if (arg0 == 14) {
            return new class214();
        } else if (arg0 == 15) {
            return new class187();
        } else if (arg0 == 16) {
            return new class146();
        } else if (arg0 == 17) {
            return new class77();
        } else if (arg0 == 18) {
            return new class113();
        } else if (arg0 == 19) {
            return new class88();
        } else if (arg0 == 20) {
            return new class125();
        } else if (arg0 == 21) {
            return new class231();
        } else if (arg0 == 22) {
            return new class161();
        } else if (arg0 == 23) {
            return new class192();
        } else if (arg0 == 24) {
            return new class9();
        } else if (arg0 == 25) {
            return new class243();
        } else if (arg0 == 26) {
            return new class236();
        } else if (arg0 == 27) {
            return new class218();
        } else if (arg0 == 28) {
            return new class95();
        } else if (arg0 == 29) {
            return new class193();
        } else if (arg0 == 30) {
            return new class223();
        } else if (arg0 == 31) {
            return new class17();
        } else if (arg0 == 32) {
            return new class132();
        } else if (arg0 == 33) {
            return new class198();
        } else if (arg0 == 34) {
            return new class29();
        } else if (arg0 == 35) {
            return new class207();
        } else if (arg0 == 36) {
            return new class221();
        } else if (arg0 == 37) {
            return new class189();
        } else if (arg0 == 38) {
            return new class50();
        } else if (arg0 == 39) {
            return new class69();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(IIIII)V")
    public final void method293(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field983++;
        if (!this.field986) {
            double var6 = (double) (arg3 - this.field966);
            double var8 = (double) (arg1 - this.field956);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field959 = this.field948;
            this.field979 = (double) this.field978 * var6 / var10 + (double) this.field966;
            this.field960 = (double) this.field978 * var8 / var10 + (double) this.field956;
        }
        double var12 = (double) (this.field945 + arg2 - arg0);
        this.field947 = ((double) arg3 - this.field979) / var12;
        this.field961 = ((double) arg1 - this.field960) / var12;
        this.field963 = Math.sqrt(this.field961 * this.field961 + this.field947 * this.field947);
        if (!this.field986) {
            this.field980 = -this.field963 * Math.tan((double) this.field951 * 0.02454369D);
        }
        this.field964 = ((double) arg4 - this.field959 - this.field980 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(JB)V")
    public static final void method294(long arg0, byte arg1) {
        field973++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 <= 56) {
            method289((byte) 87);
        }
        class46.field996++;
        class81.field1564.method70((byte) -62, 74);
        class81.field1564.method1232(arg0, (byte) 124);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()I")
    public final int method295() {
        field977++;
        return this.field985;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field971 = arg0;
        this.field969 = arg1;
        this.field986 = false;
        this.field951 = arg7;
        this.field948 = arg4;
        this.field965 = arg9;
        this.field945 = arg6;
        this.field984 = arg5;
        this.field956 = arg2;
        this.field966 = arg3;
        this.field978 = arg8;
        this.field949 = arg10;
        int var12 = class180.method1180(122, this.field971).field1188;
        if (var12 == -1) {
            this.field952 = null;
        } else {
            this.field952 = class239.method1550(var12, (byte) 107);
        }
    }
}
