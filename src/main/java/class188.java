import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class188 extends class175 {

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "[Lij;")
    public static class50[] field3105 = new class50[100];

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
    public static int field3103 = 0;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "Lpe;")
    public static class100 field3107 = new class100(50);

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "Lij;")
    private static class50 field3112 = class78.method578(126, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
    public static int field3114 = 0;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "Lij;")
    public static class50 field3115 = field3112;

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "Z")
    public static boolean field3116 = false;

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "Lij;")
    public static class50 field3117 = class78.method578(125, "_");

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "Lij;")
    private static class50 field3118 = class78.method578(125, "Loaded config");

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "Lij;")
    public static class50 field3111 = field3118;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "[I")
    public static int[] field3113;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z[Llj;III[B)V")
    public static final void method1267(boolean arg0, class44[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg4 != 3) {
            field3107 = null;
        }
        ++field3109;
        class217 var6 = new class217(arg5);
        int var7 = -1;
        while (true) {
            int var8 = var6.method1449(0);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1436(arg4 ^ -71);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 12;
                int var12 = 63 & var9;
                int var13 = var6.method1487(255);
                int var14 = var13 >> 2;
                int var15 = var13 & 3;
                int var16 = (var9 & 4074) >> 6;
                int var17 = var16 - -arg3;
                int var18 = var12 - -arg2;
                if (~var17 < -1 && ~var18 < -1 && var17 < 103 && ~var18 > -104) {
                    class44 var19 = null;
                    if (!arg0) {
                        int var20 = var11;
                        if ((class210.field3495[1][var17][var18] & 2) == 2) {
                            var20 = var11 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg1[var20];
                        }
                    }
                    class24.method237(var11, var15, !arg0, var11, var7, var18, -52, arg0, var17, var14, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class188() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        ++field3106;
        if (arg1 != -27746) {
            return null;
        } else {
            int[] var3 = super.field2941.method1427(arg1 ^ 16193, arg0);
            if (super.field2941.field3565) {
                for (int var4 = 0; class211.field3514 > var4; ++var4) {
                    this.method1268(arg0, true, var4);
                    int[] var5 = this.method1210(0, class87.field1685, arg1 ^ -11529);
                    var3[var4] = var5[class214.field3549];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZI)V")
    private final void method1268(int arg0, boolean arg1, int arg2) {
        ++field3108;
        int var4 = class129.field2272[arg2];
        int var5 = class29.field616[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if (!arg1) {
            method1270(-110);
        }
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class87.field1685 = arg0;
            class214.field3549 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class87.field1685 = arg2;
            class214.field3549 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class87.field1685 = arg2;
            class214.field3549 = -arg0 + class211.field3514;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class214.field3549 = arg2;
            class87.field1685 = -arg0 + class220.field3690;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class214.field3549 = -arg2 + class211.field3514;
            class87.field1685 = class220.field3690 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class87.field1685 = -arg2 + class220.field3690;
            class214.field3549 = -arg0 + class211.field3514;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class87.field1685 = -arg2 + class220.field3690;
            class214.field3549 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class214.field3549 = -arg2 + class211.field3514;
            class87.field1685 = arg0;
        }
        class214.field3549 &= class161.field2765;
        class87.field1685 &= class108.field1928;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        int[][] var3 = super.field2920.method117(arg0, (byte) -46);
        ++field3102;
        if (arg1 != -20740) {
            this.method32(-108, 19);
        }
        if (super.field2920.field356) {
            int[] var4 = var3[2];
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            for (int var7 = 0; class211.field3514 > var7; ++var7) {
                this.method1268(arg0, true, var7);
                int[][] var8 = this.method1206(0, class87.field1685, (byte) 60);
                var6[var7] = var8[0][class214.field3549];
                var5[var7] = var8[1][class214.field3549];
                var4[var7] = var8[2][class214.field3549];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IJ)V")
    public static final void method1269(int arg0, long arg1) {
        ++field3104;
        if (arg1 != 0L) {
            if (~class73.field1379 <= -101) {
                class54.method431(class236.field3963, 0, 0, class245.field4271);
            } else {
                class50 var3 = class223.method1533((byte) -30, arg1).method375(true);
                for (int var4 = 0; class73.field1379 > var4; ++var4) {
                    if (class227.field3823[var4] == arg1) {
                        class54.method431(class80.method589(new class50[] { var3, class199.field3281 }, arg0 ^ -17052), 0, 0, class245.field4271);
                        return;
                    }
                }
                for (int var5 = 0; class227.field3830 > var5; ++var5) {
                    if (~class59.field1070[var5] == ~arg1) {
                        class54.method431(class80.method589(new class50[] { class176.field2949, var3, class87.field1669 }, arg0 + 41764), 0, 0, class245.field4271);
                        return;
                    }
                }
                if (arg0 != -13021) {
                    method1267(true, (class44[]) null, 35, -102, 113, (byte[]) null);
                }
                if (var3.method367(class239.field4067.field3097, 1)) {
                    class54.method431(class204.field3392, 0, arg0 ^ -13021, class245.field4271);
                } else {
                    ++class241.field4163;
                    class227.field3823[class73.field1379] = arg1;
                    class20.field426[class73.field1379++] = class223.method1533((byte) -30, arg1);
                    class184.field3023 = class217.field3649;
                    class190.field3141.method1598((byte) -112, 47);
                    class190.field3141.method1464(arg1, arg0 ^ -867346101);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
    public static void method1270(int arg0) {
        field3118 = null;
        field3111 = null;
        field3115 = null;
        field3117 = null;
        field3107 = null;
        field3113 = null;
        field3112 = null;
        int var1 = -41 / ((arg0 - 27) / 42);
        field3105 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        ++field3110;
        if (!arg0) {
            this.method1268(-98, true, 35);
        }
        if (arg1 == 0) {
            super.field2925 = arg2.method1487(255) == 1;
        }
    }
}
