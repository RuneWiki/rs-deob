import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class245 extends class11 implements class338 {

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "B")
    private byte field3265;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "B")
    private byte field3274;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "Z")
    private boolean field3247;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "S")
    private short field3256;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "B")
    private byte field3266;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "Z")
    private boolean field3269;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "Z")
    private boolean field3259;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "Lc;")
    private class121 field3258;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "Lj;")
    private class377 field3263;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "[I")
    public static int[] field3264 = new int[4];

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "Z")
    public static boolean field3267;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "[[Z")
    public static boolean[][] field3273;

    static {
        new class304("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)I", line = 5)
    public final int method344(int arg0) {
        ++field3246;
        return arg0 != -4534 ? -82 : this.field3266;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)I", line = 16)
    public final int method347(byte arg0) {
        ++field3249;
        if (arg0 != -87) {
            this.method342(121);
        }
        return this.field3256 & 65535;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)[Lff;", line = 27)
    public static final class9[] method1492(byte arg0) {
        ++field3272;
        if (arg0 <= 119) {
            field3273 = null;
        }
        return new class9[] { class202.field2794, class307.field4045, class412.field5690, class121.field1770, class157.field2290, class494.field6862, class76.field1131, class209.field2867, class319.field4183, class72.field1093, class37.field572, class317.field4157, class465.field6418, class290.field3793, class45.field668, class430.field5887, class156.field2277, class232.field3116, class14.field265, class367.field4962, class518.field7669, class377.field5104, class103.field1516, class54.field844, class487.field6765, class295.field3861, class386.field5258, class372.field5011, class117.field1667, class340.field4478, class261.field3450, class62.field968, class220.field2981, class17.field294, class55.field868, class367.field4961, class206.field2841, class268.field3537, class123.field1805, class302.field3986, class514.field7585, class53.field830, class128.field1865, class352.field4761, class26.field447, class337.field4408, class428.field5842, class76.field1134, class228.field3081, class146.field2067, class203.field2821, class174.field2540, class103.field1522, class92.field1393, class238.field3183, class478.field6582, class288.field3765, class379.field5185, class302.field3990, class129.field1885, class488.field6778, class506.field7030, class297.field3879, class35.field554, class316.field4152, class379.field5187, class375.field5090, class78.field1176, class525.field7771, class1.field93, class309.field4068, class289.field3776, class494.field6863, class28.field466, class315.field4121, class212.field2886, class376.field5100, class103.field1519, class114.field1618, class411.field5652, class301.field3984, class56.field874, class478.field6596, class258.field3416, class237.field3174, class34.field549, class525.field7740, class96.field1449, class189.field2664, class135.field1936, class320.field4192, class1.field87, class228.field3079, class478.field6595, class176.field2565, class299.field3963, class237.field3175, class48.field751, class61.field964, class386.field5255, class264.field3487, class55.field871, class78.field1170, class484.field6738, class466.field6435, class451.field6138, class350.field4717, class73.field1106, class353.field4765, class364.field4933 };
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V", line = 40)
    public static void method1493(int arg0) {
        field3264 = null;
        if (arg0 > 65) {
            field3273 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 51)
    public final void method342(int arg0) {
        ++field3253;
        int var2 = -117 % ((56 - arg0) / 52);
        if (this.field3258 != null) {
            this.field3258.method837();
        }
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(B)V", line = 64)
    public static final void method1494(byte arg0) {
        ++field3245;
        if (arg0 != 55) {
            method1492((byte) -98);
        }
        class461.field6368 = 0;
        for (int var1 = 0; ~var1 > -2049; ++var1) {
            class406.field5589[var1] = null;
            class150.field2133[var1] = 1;
            class449.field6120[var1] = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)I", line = 90)
    public final int method128(byte arg0) {
        ++field3262;
        if (arg0 < 44) {
            field3267 = true;
        }
        return this.field3258 == null ? 0 : this.field3258.method861();
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILqa;Z)Len;", line = 101)
    private final class208 method1495(int arg0, int arg1, class162 arg2, boolean arg3) {
        ++field3248;
        class1 var5 = class402.field5388.method1994(-17294, 65535 & this.field3256);
        class35 var6;
        class35 var7;
        if (this.field3269) {
            var6 = class37.field582[this.field3274];
            var7 = class209.field2868[0];
        } else {
            if (~this.field3274 > -4) {
                var7 = class209.field2868[this.field3274 + 1];
            } else {
                var7 = null;
            }
            var6 = class209.field2868[this.field3274];
        }
        if (arg0 >= -72) {
            field3264 = null;
        }
        return var5.method19(arg3, this.field3265, arg2, super.field242, var6, arg1, 74, var7, super.field241, this.field3266, super.field237);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLqa;I)Lc;", line = 135)
    public final class121 method336(byte arg0, class162 arg1, int arg2) {
        if (arg0 != -102) {
            this.method345(-106);
        }
        ++field3260;
        return this.method1496(arg2, false, arg1);
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)I", line = 147)
    public final int method345(int arg0) {
        if (arg0 != -1736) {
            return -115;
        } else {
            ++field3270;
            return this.field3265;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILqa;I)Z", line = 167)
    public final boolean method343(int arg0, int arg1, class162 arg2, int arg3) {
        ++field3250;
        class121 var5 = this.method1496(131072, false, arg2);
        if (arg0 != -1) {
            return false;
        } else if (var5 != null) {
            class414 var6 = arg2.method611();
            var6.method971(super.field241, super.field237, super.field242);
            return var5.method847(arg3, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lqa;I)V", line = 196)
    public final void method340(class162 arg0, int arg1) {
        if (arg1 != 20203) {
            this.field3274 = -106;
        }
        ++field3257;
        Object var3 = null;
        class377 var5;
        if (this.field3263 == null && this.field3259) {
            class208 var4 = this.method1495(-92, 262144, arg0, true);
            var5 = var4 != null ? var4.field2862 : null;
        } else {
            var5 = this.field3263;
            this.field3263 = null;
        }
        if (var5 != null) {
            class238.method1477(var5, this.field3274, super.field241, super.field242, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZLqa;)Lc;", line = 224)
    private final class121 method1496(int arg0, boolean arg1, class162 arg2) {
        ++field3261;
        if (this.field3258 != null && ~arg2.method564(this.field3258.method854(), arg0) == -1) {
            return this.field3258;
        } else {
            class208 var4 = this.method1495(-110, arg0, arg2, arg1);
            return var4 == null ? null : var4.field2861;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILqa;)V", line = 243)
    public final void method337(int arg0, class162 arg1) {
        ++field3251;
        Object var3 = null;
        if (arg0 == -7803) {
            class377 var5;
            if (this.field3263 == null && this.field3259) {
                class208 var4 = this.method1495(-128, 262144, arg1, true);
                var5 = var4 != null ? var4.field2862 : null;
            } else {
                var5 = this.field3263;
                this.field3263 = null;
            }
            if (var5 != null) {
                class382.method2269(var5, this.field3274, super.field241, super.field242, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lqa;Lus;IIIIZIIIII)V", line = 273)
    public class245(class162 arg0, class1 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class174.method1175(arg10, arg11, (byte) 90));
        super.field242 = arg5;
        this.field3265 = (byte) arg10;
        this.field3274 = (byte) arg2;
        this.field3247 = arg1.field83 != 0 && !arg6;
        this.field3256 = (short) arg1.field33;
        this.field3266 = (byte) arg11;
        super.field241 = arg3;
        this.field3269 = arg6;
        this.field3259 = arg0.method557() && arg1.field71 && !this.field3269 && class154.field2244.method3089((byte) 107, class166.field2414) != 0;
        class208 var13 = this.method1495(-74, 2048, arg0, this.field3259);
        if (var13 != null) {
            this.field3258 = var13.field2861;
            this.field3263 = var13.field2862;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lqa;Z)V", line = 298)
    public final void method334(class162 arg0, boolean arg1) {
        ++field3271;
        if (!arg1) {
            field3268 = 86;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(ILqa;)Lfm;", line = 308)
    public final class514 method339(int arg0, class162 arg1) {
        ++field3254;
        if (arg0 != 9124) {
            this.field3259 = true;
        }
        if (this.field3258 == null) {
            return null;
        } else {
            class414 var3 = arg1.method611();
            var3.method971(super.field241 + super.field233, super.field237, super.field242 + super.field235);
            class514 var4 = null;
            if (this.field3247) {
                var4 = class148.method1020(arg0 ^ 9124, 1);
            }
            this.field3258.method853(var3, var4 == null ? null : var4.field7563[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)Z", line = 342)
    public final boolean method338(int arg0) {
        ++field3252;
        if (arg0 > -8) {
            this.field3259 = false;
        }
        return this.field3259;
    }
}
