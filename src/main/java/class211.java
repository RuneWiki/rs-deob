import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class211 extends class350 implements class395 {

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "Lcp;")
    public class397 field3128;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "Z")
    private boolean field3131;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3144 = "Loaded config";

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "Ljj;")
    public static class156 field3137 = new class156(8);

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "Lbc;")
    public static class283 field3146;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dd", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field3147;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1620(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lja;Lfb;IIIIIIIZIIII)V", line = 6)
    public class211(class90 arg0, class45 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg6, arg7, arg8, arg10, arg11, arg12, class219.method1665((byte) 86, arg2, arg3));
        this.field3128 = new class397(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
        this.field3131 = ~arg1.field697 != -1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILja;II)Z", line = 15)
    public final boolean method132(int arg0, class90 arg1, int arg2, int arg3) {
        ++field3132;
        class100 var5 = this.field3128.method2522(false, arg1, super.field4980, 65536, false, (byte) -42, super.field4975);
        if (var5 == null) {
            return false;
        } else {
            class202 var6 = arg1.method709();
            var6.method1527(super.field4980 + super.field4979, super.field4972, super.field4978 + super.field4975);
            return arg2 != 28033 ? false : var5.method574(arg3, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Z", line = 37)
    public final boolean method1018(byte arg0) {
        if (arg0 >= -16) {
            return false;
        } else {
            ++field3142;
            return this.field3128.method2536(16426);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILja;)V", line = 49)
    public final void method137(int arg0, class90 arg1) {
        int var3 = 5 % ((arg0 - -31) / 51);
        ++field3134;
        class100 var4 = this.field3128.method2522(true, arg1, super.field4980, 131072, false, (byte) -126, super.field4975);
        if (var4 != null) {
            this.field3128.method2525(super.field4980 >> 7, arg1, false, super.field4975 >> 7, var4, false, super.field4980 >> 7, super.field4975 >> 7);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)I", line = 66)
    public final int method1024(int arg0) {
        if (arg0 != 20691) {
            return 84;
        } else {
            ++field3140;
            return this.field3128.field5827;
        }
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)I", line = 78)
    public final int method1457(int arg0) {
        ++field3141;
        return arg0 != 12124 ? -7 : this.field3128.method2535((byte) 88);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BILja;)Lrc;", line = 97)
    public final class100 method1025(byte arg0, int arg1, class90 arg2) {
        if (arg0 != -84) {
            field3144 = null;
        }
        ++field3133;
        return this.field3128.method2522(false, arg2, 0, arg1, false, (byte) -88, 0);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I", line = 108)
    public final int method1020(int arg0) {
        ++field3145;
        if (arg0 != 15829) {
            this.method1013(true);
        }
        return this.field3128.field5834;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLja;)Lkh;", line = 121)
    public final class69 method134(byte arg0, class90 arg1) {
        ++field3129;
        class100 var3 = this.field3128.method2522(true, arg1, super.field4980, 1024, false, (byte) -48, super.field4975);
        if (var3 == null) {
            return null;
        } else if (arg0 < 90) {
            return null;
        } else {
            class202 var4 = arg1.method709();
            var4.method1527(super.field4980 + super.field4979, super.field4972, super.field4978 + super.field4975);
            class69 var5 = null;
            if (this.field3131) {
                var5 = class256.method1849(1, 109);
            }
            if (this.field3128.field5813 != null) {
                class30 var6 = this.field3128.field5813.method427();
                arg1.method698(var3, var6, var4, var5 != null ? var5.field1128[0] : null, 0);
            } else {
                var3.method530(var4, var5 == null ? null : var5.field1128[0], 0);
            }
            this.field3128.method2525(super.field4980 >> 7, arg1, false, super.field4975 >> 7, var3, true, super.field4980 >> 7, super.field4975 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)I", line = 158)
    public final int method1013(boolean arg0) {
        if (arg0) {
            return -52;
        } else {
            ++field3138;
            return this.field3128.field5841;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLja;)V", line = 169)
    public final void method1022(boolean arg0, class90 arg1) {
        this.field3128.method2527(arg1, 122);
        if (!arg0) {
            field3146 = null;
        }
        ++field3143;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lja;I)V", line = 180)
    public final void method1021(class90 arg0, int arg1) {
        ++field3139;
        this.field3128.method2523(-17547, arg0);
        int var3 = -12 / ((-58 - arg1) / 56);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([IIII[J)V", line = 190)
    public static final void method1615(int[] arg0, int arg1, int arg2, int arg3, long[] arg4) {
        ++field3130;
        int var5 = -31 % ((-88 - arg2) / 32);
        if (arg1 > arg3) {
            int var6 = (arg1 + arg3) / 2;
            int var7 = arg3;
            long var8 = arg4[var6];
            arg4[var6] = arg4[arg1];
            arg4[arg1] = var8;
            int var10 = arg0[var6];
            arg0[var6] = arg0[arg1];
            arg0[arg1] = var10;
            for (int var11 = arg3; ~var11 > ~arg1; ++var11) {
                if (var8 - -((long) (1 & var11)) > arg4[var11]) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var7];
                    arg4[var7] = var12;
                    int var14 = arg0[var11];
                    arg0[var11] = arg0[var7];
                    arg0[var7++] = var14;
                }
            }
            arg4[arg1] = arg4[var7];
            arg4[var7] = var8;
            arg0[arg1] = arg0[var7];
            arg0[var7] = var10;
            method1615(arg0, var7 + -1, -126, arg3, arg4);
            method1615(arg0, arg1, -120, var7 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZIIII)V", line = 245)
    public static final void method1616(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class267.field4001 = 0L;
        if (arg3 > -20) {
            method1617(-6);
        }
        ++field3135;
        int var5 = class285.method2015(6071);
        if (~arg2 == -4 || ~var5 == -4) {
            arg0 = true;
        }
        if (!class73.field1235.method705()) {
            arg0 = true;
        }
        class270.method1928(arg2, var5, arg1, arg4, arg0, 124);
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V", line = 265)
    public static final void method1617(int arg0) {
        ++field3127;
        int var1 = -39 / ((arg0 - 42) / 62);
        int var2 = 0;
        if (class169.field2515) {
            int var3 = var2 | 1;
            int var4 = var3 | 16;
            int var5 = var4 | 32;
            int var6 = var5 | 2;
            var2 = var6 | 4;
        }
        class282.method1998((byte) 20, var2);
        class278.method1983(var2, false);
        class437.method2738(var2, true);
        class238.method1734(var2, false);
        class50.method400(true, var2);
        class383.method2432((byte) 73, var2);
        class205.method1552(true, var2);
        class61.method465(-3, var2);
        class429.method2675(var2, (byte) -5);
        if (class240.field3463 == 10) {
            class168.method1288(-6, 28);
        } else if (class240.field3463 == 30) {
            class168.method1288(-6, 25);
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V", line = 303)
    public final void method1023(int arg0) {
        if (arg0 <= 40) {
            this.method1022(true, (class90) null);
        }
        ++field3126;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V", line = 313)
    public static void method1618(byte arg0) {
        field3144 = null;
        field3137 = null;
        field3146 = null;
        if (arg0 != 121) {
            method1616(true, 19, -17, -84, -5);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILja;IIIILc;B)V", line = 333)
    public static final void method1619(int arg0, class90 arg1, int arg2, int arg3, int arg4, int arg5, class158 arg6, byte arg7) {
        ++field3136;
        class395 var8 = null;
        if (arg0 == 0) {
            var8 = (class395) class219.method1656(arg5, arg4, arg2);
        }
        if (~arg0 == -2) {
            var8 = (class395) class336.method2189(arg5, arg4, arg2);
        }
        if (~arg0 == -3) {
            var8 = (class395) class371.method2358(arg5, arg4, arg2, field3147 != null ? field3147 : (field3147 = method1620("sc")));
        }
        if (arg7 <= 7) {
            field3146 = null;
        }
        if (arg0 == 3) {
            var8 = (class395) class37.method311(arg5, arg4, arg2);
        }
        if (var8 != null) {
            int var9 = var8.method1024(20691);
            int var10 = var8.method1020(15829);
            class45 var11 = class451.method2812(41, var8.method1013(false));
            if (var11.method370((byte) -123)) {
                class393.method2501(128, arg2, arg5, arg4, var11);
            }
            if (var8.method1018((byte) -49)) {
                var8.method1021(arg1, -125);
            }
            if (arg0 == 0) {
                class75.method592(arg5, arg4, arg2);
                if (var11.field714 != 0) {
                    arg6.method1252(var10, !var11.field711, -1, arg4, arg2, var9, var11.field694);
                    return;
                }
                return;
            }
            if (~arg0 == -2) {
                class179.method1403(arg5, arg4, arg2);
                return;
            }
            if (arg0 == 2) {
                class161.method1262(arg5, arg4, arg2, field3147 != null ? field3147 : (field3147 = method1620("sc")));
                if (~var11.field714 != -1 && ~class183.field2703 < ~(arg4 - -var11.field717) && ~class66.field1056 < ~(var11.field717 + arg2) && ~class183.field2703 < ~(var11.field724 + arg4) && class66.field1056 > arg2 - -var11.field724) {
                    arg6.method1246(arg2, arg4, var10, var11.field694, var11.field724, var11.field717, !var11.field711, 102);
                    return;
                }
                return;
            }
            if (~arg0 == -4) {
                class205.method1553(arg5, arg4, arg2);
                if (var11.field714 == 1) {
                    arg6.method1243(arg4, -128, arg2);
                    return;
                }
            }
        }
    }
}
