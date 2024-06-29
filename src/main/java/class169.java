import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class169 extends class12 {

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    private int field2967 = 0;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "Ldk;")
    private class275 field2964 = new class275(16);

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    private int field2987 = 0;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "Ldd;")
    private class132 field2988 = new class132();

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "J")
    private long field2993 = 0L;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "Llk;")
    private class81 field2971;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    private int field2968;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "Z")
    private boolean field2990;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "Ldd;")
    private class132 field2989;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    private int field2959;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    private int field2986;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "Z")
    private boolean field2992;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Lgb;")
    private class147 field2962;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "Llk;")
    private class81 field2966;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Lp;")
    private class284 field2957;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "Lsb;")
    private class223 field2963;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "[Lfk;")
    public static class14[] field2953 = new class14[2048];

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "Lqk;")
    private static class207 field2965 = class24.method212(255, "");

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "Lqk;")
    public static class207 field2975 = class24.method212(255, " <col=ffff00>");

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Lqk;")
    private static class207 field2955 = class24.method212(255, " has logged in)3");

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Lqk;")
    public static class207 field2952 = class24.method212(255, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "Lqk;")
    public static class207 field2977 = field2955;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "Lqk;")
    public static class207 field2981 = field2965;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "S")
    public static short field2972 = 205;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "Ltf;")
    public static class106 field2970 = new class106();

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "Ldg;")
    public static class139 field2961;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Lwf;")
    private class1 field2958;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "Z")
    private boolean field2991;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "[B")
    private byte[] field2974;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I")
    public final int method67(int arg0, int arg1) {
        class223 var3 = (class223) this.field2964.method1867((long) arg1, true);
        field2978++;
        if (var3 == null) {
            return arg0 == 100 ? 0 : -41;
        } else {
            return var3.method1181(7595);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)I")
    public final int method1209(byte arg0) {
        if (arg0 != -94) {
            return 104;
        }
        field2983++;
        if (this.method70((byte) 103) == null) {
            return this.field2963 == null ? 0 : this.field2963.method1181(7595);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
    public static void method1210(int arg0) {
        field2981 = null;
        field2970 = null;
        field2977 = null;
        field2961 = null;
        field2955 = null;
        field2965 = null;
        field2975 = null;
        field2953 = null;
        field2952 = null;
        if (arg0 != 100) {
            field2970 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V")
    public final void method1211(byte arg0) {
        field2979++;
        if (this.field2989 == null || this.method70((byte) 125) == null || arg0 > -66) {
            return;
        }
        for (class194 var2 = this.field2988.method922((byte) 106); var2 != null; var2 = this.field2988.method928(-49)) {
            int var3 = (int) var2.field3407;
            if (var3 < 0 || this.field2958.field7 <= var3 || this.field2958.field9[var3] == 0) {
                var2.method1346((byte) -16);
            } else {
                if (this.field2974[var3] == 0) {
                    this.method1212(0, var3, 1);
                }
                if (this.field2974[var3] == -1) {
                    this.method1212(0, var3, 2);
                }
                if (this.field2974[var3] == 1) {
                    var2.method1346((byte) -16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Lsb;")
    private final class223 method1212(int arg0, int arg1, int arg2) {
        field2984++;
        class223 var4 = (class223) this.field2964.method1867((long) arg1, true);
        if (arg0 != 0) {
            this.method69(44, (byte) -126);
        }
        if (var4 != null && arg2 == 0 && !var4.field4078 && var4.field4084) {
            var4.method1346((byte) -16);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field2971 == null || this.field2974[arg1] == -1) {
                    if (this.field2962.method1029(8512)) {
                        return null;
                    }
                    var4 = this.field2962.method1021(true, arg1, this.field2968, 31039, (byte) 2);
                } else {
                    var4 = this.field2957.method1930(arg1, (byte) -41, this.field2971);
                }
            } else if (arg2 == 1) {
                if (this.field2971 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2957.method1927(arg1, (byte) -81, this.field2971);
            } else if (arg2 == 2) {
                if (this.field2971 == null) {
                    throw new RuntimeException();
                }
                if (this.field2974[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2962.method1020(-21)) {
                    return null;
                }
                var4 = this.field2962.method1021(false, arg1, this.field2968, 31039, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field2964.method1863((byte) 104, var4, (long) arg1);
        }
        if (var4.field4084) {
            return null;
        }
        byte[] var5 = var4.method1180((byte) 39);
        if (!var4 instanceof class163) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class241.field4395.reset();
                class241.field4395.update(var5, 0, var5.length - 2);
                int var6 = (int) class241.field4395.getValue();
                if (this.field2958.field26[arg1] != var6) {
                    throw new RuntimeException();
                }
                this.field2962.field2544 = 0;
                this.field2962.field2545 = 0;
            } catch (RuntimeException var12) {
                this.field2962.method1024(1);
                var4.method1346((byte) -16);
                if (var4.field4078 && !this.field2962.method1029(arg0 ^ 0x2140)) {
                    class237 var7 = this.field2962.method1021(true, arg1, this.field2968, 31039, (byte) 2);
                    this.field2964.method1863((byte) 85, var7, (long) arg1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2958.field8[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field2958.field8[arg1];
            if (this.field2971 != null) {
                this.field2957.method1932(var5, this.field2971, arg1, (byte) 74);
                if (this.field2974[arg1] != 1) {
                    this.field2967++;
                    this.field2974[arg1] = 1;
                }
            }
            if (!var4.field4078) {
                var4.method1346((byte) -16);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class241.field4395.reset();
            class241.field4395.update(var5, 0, var5.length - 2);
            int var8 = (int) class241.field4395.getValue();
            if (this.field2958.field26[arg1] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2958.field8[arg1] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field2974[arg1] != 1) {
                this.field2967++;
                this.field2974[arg1] = 1;
            }
            if (!var4.field4078) {
                var4.method1346((byte) -16);
            }
            return var4;
        } catch (Exception var11) {
            this.field2974[arg1] = -1;
            var4.method1346((byte) -16);
            if (var4.field4078 && !this.field2962.method1029(8512)) {
                class237 var10 = this.field2962.method1021(true, arg1, this.field2968, 31039, (byte) 2);
                this.field2964.method1863((byte) -91, var10, (long) arg1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)[Luh;")
    public static final class100[] method1213(int arg0) {
        field2956++;
        class100[] var1 = new class100[class280.field4928];
        for (int var2 = 0; var2 < class280.field4928; var2++) {
            byte[] var3 = class185.field3286[var2];
            int var4 = class241.field4402[var2] * class107.field1895[var2];
            if (class44.field865[var2]) {
                int[] var5 = new int[var4];
                byte[] var6 = class134.field2327[var2];
                for (int var7 = 0; var7 < var4; var7++) {
                    var5[var7] = class281.method1906(class243.field4421[class121.method860(var3[var7], 255)], class121.method860(var6[var7], 255) << 24);
                }
                var1[var2] = new class50(class242.field4406, class230.field4224, class287.field5127[var2], class170.field3021[var2], class107.field1895[var2], class241.field4402[var2], var5);
            } else {
                int[] var8 = new int[var4];
                for (int var9 = 0; var9 < var4; var9++) {
                    var8[var9] = class243.field4421[class121.method860(var3[var9], 255)];
                }
                var1[var2] = new class139(class242.field4406, class230.field4224, class287.field5127[var2], class170.field3021[var2], class107.field1895[var2], class241.field4402[var2], var8);
            }
        }
        class116.method821((byte) -126);
        if (arg0 != 2008) {
            field2955 = null;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V")
    public final void method1214(int arg0) {
        field2982++;
        int var2 = 53 % ((13 - arg0) / 32);
        if (this.field2989 != null) {
            if (this.method70((byte) 100) == null) {
                return;
            }
            if (this.field2990) {
                boolean var7 = true;
                for (class194 var8 = this.field2989.method922((byte) 120); var8 != null; var8 = this.field2989.method928(-110)) {
                    int var10 = (int) var8.field3407;
                    if (this.field2974[var10] == 0) {
                        this.method1212(0, var10, 1);
                    }
                    if (this.field2974[var10] == 0) {
                        var7 = false;
                    } else {
                        var8.method1346((byte) -16);
                    }
                }
                while (this.field2987 < this.field2958.field9.length) {
                    if (this.field2958.field9[this.field2987] == 0) {
                        this.field2987++;
                    } else {
                        if (this.field2957.field4994 >= 250) {
                            var7 = false;
                            break;
                        }
                        if (this.field2974[this.field2987] == 0) {
                            this.method1212(0, this.field2987, 1);
                        }
                        if (this.field2974[this.field2987] == 0) {
                            var7 = false;
                            class194 var9 = new class194();
                            var9.field3407 = (long) this.field2987;
                            this.field2989.method931(var9, 117);
                        }
                        this.field2987++;
                    }
                }
                if (var7) {
                    this.field2990 = false;
                    this.field2987 = 0;
                }
            } else if (this.field2991) {
                boolean var3 = true;
                for (class194 var4 = this.field2989.method922((byte) 122); var4 != null; var4 = this.field2989.method928(-124)) {
                    int var6 = (int) var4.field3407;
                    if (this.field2974[var6] != 1) {
                        this.method1212(0, var6, 2);
                    }
                    if (this.field2974[var6] == 1) {
                        var4.method1346((byte) -16);
                    } else {
                        var3 = false;
                    }
                }
                while (this.field2987 < this.field2958.field9.length) {
                    if (this.field2958.field9[this.field2987] == 0) {
                        this.field2987++;
                    } else {
                        if (this.field2962.method1020(-21)) {
                            var3 = false;
                            break;
                        }
                        if (this.field2974[this.field2987] != 1) {
                            this.method1212(0, this.field2987, 2);
                        }
                        if (this.field2974[this.field2987] != 1) {
                            var3 = false;
                            class194 var5 = new class194();
                            var5.field3407 = (long) this.field2987;
                            this.field2989.method931(var5, 115);
                        }
                        this.field2987++;
                    }
                }
                if (var3) {
                    this.field2987 = 0;
                    this.field2991 = false;
                }
            } else {
                this.field2989 = null;
            }
        }
        if (!this.field2992 || class53.method405(127) < this.field2993) {
            return;
        }
        for (class223 var11 = (class223) this.field2964.method1873((byte) -85); var11 != null; var11 = (class223) this.field2964.method1866((byte) -7)) {
            if (!var11.field4084) {
                if (var11.field4075) {
                    if (!var11.field4078) {
                        throw new RuntimeException();
                    }
                    var11.method1346((byte) -16);
                } else {
                    var11.field4075 = true;
                }
            }
        }
        this.field2993 = class53.method405(92) + 1000L;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)V")
    public final void method69(int arg0, byte arg1) {
        field2954++;
        if (arg1 != -59) {
            this.method1216(-29);
        }
        if (this.field2971 == null) {
            return;
        }
        for (class194 var3 = this.field2988.method922((byte) 58); var3 != null; var3 = this.field2988.method928(arg1 ^ 0xFFFFFF99)) {
            if (((long) arg0) == var3.field3407) {
                return;
            }
        }
        class194 var4 = new class194();
        var4.field3407 = (long) arg0;
        this.field2988.method931(var4, 122);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V")
    public static final void method1215(int arg0, int arg1) {
        class174 var2 = class82.field1498[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class174 var4 = class82.field1498[var3][arg0][arg1] = class82.field1498[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3132--;
                for (int var5 = 0; var5 < var4.field3138; var5++) {
                    class288 var6 = var4.field3140[var5];
                    if ((var6.field5129 >> 29 & 0x3L) == 2L && var6.field5150 == arg0 && var6.field5140 == arg1) {
                        var6.field5143--;
                    }
                }
            }
        }
        if (class82.field1498[0][arg0][arg1] == null) {
            class82.field1498[0][arg0][arg1] = new class174(0, arg0, arg1);
        }
        class82.field1498[0][arg0][arg1].field3131 = var2;
        class82.field1498[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)I")
    public final int method1216(int arg0) {
        field2960++;
        if (this.field2958 == null) {
            return 0;
        } else {
            if (arg0 != 23125) {
                method1213(-26);
            }
            return this.field2958.field6;
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)V")
    public final void method1217(byte arg0) {
        field2985++;
        if (arg0 < 89) {
            this.method1216(-58);
        }
        if (this.field2971 != null) {
            this.field2991 = true;
            if (this.field2989 == null) {
                this.field2989 = new class132();
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)Lwf;")
    public final class1 method70(byte arg0) {
        field2969++;
        if (this.field2958 != null) {
            return this.field2958;
        }
        if (this.field2963 == null) {
            if (this.field2962.method1029(8512)) {
                return null;
            }
            this.field2963 = this.field2962.method1021(true, this.field2968, 255, 31039, (byte) 0);
        }
        if (this.field2963.field4084) {
            return null;
        }
        byte[] var2 = this.field2963.method1180((byte) 39);
        if (this.field2963 instanceof class163) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2958 = new class1(var2, this.field2959);
                if (this.field2958.field24 != this.field2986) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field2958 = null;
                if (this.field2962.method1029(8512)) {
                    this.field2963 = null;
                } else {
                    this.field2963 = this.field2962.method1021(true, this.field2968, 255, 31039, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2958 = new class1(var2, this.field2959);
            } catch (RuntimeException var4) {
                this.field2962.method1024(1);
                this.field2958 = null;
                if (this.field2962.method1029(8512)) {
                    this.field2963 = null;
                } else {
                    this.field2963 = this.field2962.method1021(true, this.field2968, 255, 31039, (byte) 0);
                }
                return null;
            }
            if (this.field2966 != null) {
                this.field2957.method1932(var2, this.field2966, this.field2968, (byte) 103);
            }
        }
        if (arg0 < 9) {
            this.field2968 = 23;
        }
        this.field2963 = null;
        if (this.field2971 != null) {
            this.field2967 = 0;
            this.field2974 = new byte[this.field2958.field7];
        }
        return this.field2958;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)[B")
    public final byte[] method66(byte arg0, int arg1) {
        field2973++;
        if (arg0 < 41) {
            this.field2991 = false;
        }
        class223 var3 = this.method1212(0, arg1, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1180((byte) 39);
            var3.method1346((byte) -16);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)I")
    public final int method1218(byte arg0) {
        field2976++;
        if (arg0 != 70) {
            this.method70((byte) -27);
        }
        return this.field2967;
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)I")
    public final int method1219(int arg0) {
        field2980++;
        if (this.field2958 == null) {
            return 0;
        } else if (this.field2990) {
            int var2 = 89 / ((9 - arg0) / 52);
            class194 var3 = this.field2989.method922((byte) 98);
            return var3 == null ? 0 : (int) var3.field3407;
        } else {
            return this.field2958.field6;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(ILlk;Llk;Lgb;Lp;IIZ)V")
    public class169(int arg0, class81 arg1, class81 arg2, class147 arg3, class284 arg4, int arg5, int arg6, boolean arg7) {
        this.field2971 = arg1;
        this.field2968 = arg0;
        if (this.field2971 == null) {
            this.field2990 = false;
        } else {
            this.field2990 = true;
            this.field2989 = new class132();
        }
        this.field2959 = arg5;
        this.field2986 = arg6;
        this.field2992 = arg7;
        this.field2962 = arg3;
        this.field2966 = arg2;
        this.field2957 = arg4;
        if (this.field2966 != null) {
            this.field2963 = this.field2957.method1930(this.field2968, (byte) -41, this.field2966);
        }
    }
}
