import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class170 extends class145 {

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    private final int field3198;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    private final int field3190;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    private final int field3199;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    private final int field3194;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "Lsg;")
    public static class30 field3189 = class167.method1221((byte) 33, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "Lb;")
    public static class48 field3195 = new class48();

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public static volatile int field3202 = 0;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "Lod;")
    public static class21 field3204;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "Ldl;")
    public static class31 field3192;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "[I")
    public static int[] field3203;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public static void method1251(int arg0) {
        field3192 = null;
        field3204 = null;
        field3203 = null;
        field3195 = null;
        int var1 = 35 / ((43 - arg0) / 59);
        field3189 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZB)V")
    public static final void method1252(boolean arg0, byte arg1) {
        ++field3196;
        if (~(class247.field4394.field1360 >> 7) == ~class210.field3771 && ~(class247.field4394.field1336 >> 7) == ~class173.field3239) {
            class210.field3771 = 0;
        }
        int var2 = class28.field528;
        if (arg0) {
            var2 = 1;
        }
        if (arg1 == 88) {
            for (int var3 = 0; var3 < var2; ++var3) {
                class120 var4;
                long var5;
                if (arg0) {
                    var4 = class247.field4394;
                    var5 = 8791798054912L;
                } else {
                    var4 = class75.field1670[class183.field3378[var3]];
                    var5 = (long) class183.field3378[var3] << 32;
                }
                if (var4 != null && var4.method568((byte) -95)) {
                    int var7 = var4.field1360 >> 7;
                    int var8 = var4.field1336 >> 7;
                    var4.field2355 = false;
                    if ((class39.field928 && class28.field528 > 200 || class28.field528 > 50) && !arg0 && ~var4.field1370 == ~var4.field1362) {
                        var4.field2355 = true;
                    }
                    if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                        if (var4.field2339 != null && ~var4.field2367 >= ~class133.field2617 && class133.field2617 < var4.field2361) {
                            var4.field2355 = false;
                            var4.field1379 = class31.method303(var4.field1360, var4.field1336, class159.field2998, -4);
                            class69.method616(class159.field2998, var4.field1360, var4.field1336, var4.field1379, var4, var4.field1389, var5, var4.field2362, var4.field2371, var4.field2374, var4.field2337);
                        } else {
                            if (~var4.method574(true) == -2 && ~(127 & var4.field1360) == -65 && ~(var4.field1336 & 127) == -65) {
                                if (~class193.field3482[var7][var8] == ~class116.field2290) {
                                    continue;
                                }
                                class193.field3482[var7][var8] = class116.field2290;
                            }
                            var4.field1379 = class31.method303(var4.field1360, var4.field1336, class159.field2998, arg1 + -92);
                            class22.method206(class159.field2998, var4.field1360, var4.field1336, var4.field1379, -64 + (64 * var4.method574(true) - -60), var4, var4.field1389, var5, var4.field1343);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(III)I")
    public static final int method1253(int arg0, int arg1, int arg2) {
        ++field3197;
        class109 var3 = (class109) class208.field3730.method1168(-3, (long) arg1);
        if (var3 == null) {
            return -1;
        } else {
            if (arg2 < 97) {
                method1253(60, -9, 86);
            }
            return arg0 >= 0 && arg0 < var3.field2195.length ? var3.field2195[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIII)V")
    public static final void method1254(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (-arg2 + arg1 >= class48.field1096 && ~(arg1 + arg2) >= ~class252.field4458 && ~class275.field4804 >= ~(-arg2 + arg3) && ~class167.field3064 <= ~(arg2 + arg3)) {
            class9.method106(arg3, arg1, arg4, (byte) 6, arg2);
        } else {
            class65.method581(arg3, (byte) -70, arg4, arg1, arg2);
        }
        ++field3188;
        if (arg0 < 61) {
            field3192 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIIII)V")
    public class170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3198 = arg2;
        this.field3190 = arg0;
        this.field3199 = arg1;
        this.field3194 = arg3;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public static final void method1255(boolean arg0) {
        ++field3193;
        if (!arg0) {
            method1252(false, (byte) -47);
        }
        if (class193.field3485 == 30) {
            class253.method1764((byte) -85, 25);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(ZII)V")
    public final void method790(boolean arg0, int arg1, int arg2) {
        ++field3200;
        if (arg0) {
            method1255(true);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lse;IIIIIIZ)V")
    public static final void method1256(class10 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field191.length;
        for (int var9 = 0; var9 < var8; ++var9) {
            int var22 = arg0.field191[var9] - class254.field4478;
            int var23 = arg0.field176[var9] - class21.field382;
            int var24 = arg0.field196[var9] - class108.field2177;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field179 != null) {
                class10.field186[var9] = var25;
                class10.field193[var9] = var28;
                class10.field177[var9] = var29;
            }
            class10.field180[var9] = (var25 << 9) / var29 + class213.field3859;
            class10.field195[var9] = (var28 << 9) / var29 + class213.field3855;
        }
        class213.field3848 = 0;
        int var10 = arg0.field192.length;
        for (int var11 = 0; var11 < var10; ++var11) {
            int var12 = arg0.field192[var11];
            int var13 = arg0.field187[var11];
            int var14 = arg0.field184[var11];
            int var15 = class10.field180[var12];
            int var16 = class10.field180[var13];
            int var17 = class10.field180[var14];
            int var18 = class10.field195[var12];
            int var19 = class10.field195[var13];
            int var20 = class10.field195[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class45.field1059 && class247.method1734(class257.field4540 + class213.field3859, class213.field3855 + class200.field3578, var18, var19, var20, var15, var16, var17)) {
                    class275.field4808 = arg5;
                    class252.field4448 = arg6;
                }
                if (!arg7) {
                    class213.field3851 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class213.field3843 || var16 > class213.field3843 || var17 > class213.field3843) {
                        class213.field3851 = true;
                    }
                    if (arg0.field179 != null && arg0.field179[var11] != -1) {
                        if (class104.field2102) {
                            if (arg0.field175) {
                                class213.method1526(var18, var19, var20, var15, var16, var17, arg0.field194[var11], arg0.field182[var11], arg0.field189[var11], class10.field186[0], class10.field186[1], class10.field186[3], class10.field193[0], class10.field193[1], class10.field193[3], class10.field177[0], class10.field177[1], class10.field177[3], arg0.field179[var11]);
                            } else {
                                class213.method1526(var18, var19, var20, var15, var16, var17, arg0.field194[var11], arg0.field182[var11], arg0.field189[var11], class10.field186[var12], class10.field186[var13], class10.field186[var14], class10.field193[var12], class10.field193[var13], class10.field193[var14], class10.field177[var12], class10.field177[var13], class10.field177[var14], arg0.field179[var11]);
                            }
                        } else {
                            int var21 = class213.field3850.method510(arg0.field179[var11], (byte) 40);
                            class213.method1520(var18, var19, var20, var15, var16, var17, class108.method862(var21, arg0.field194[var11]), class108.method862(var21, arg0.field182[var11]), class108.method862(var21, arg0.field189[var11]));
                        }
                    } else if (arg0.field194[var11] != 12345678) {
                        class213.method1520(var18, var19, var20, var15, var16, var17, arg0.field194[var11], arg0.field182[var11], arg0.field189[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZII)V")
    public final void method792(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field3205 = 68;
        }
        ++field3191;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V")
    public final void method788(int arg0, int arg1, int arg2) {
        ++field3201;
        int var4 = this.field3198 * arg2 >> 12;
        int var5 = this.field3199 * arg0 >> 12;
        int var6 = this.field3190 * arg2 >> 12;
        if (arg1 <= 120) {
            this.method788(-115, 23, 10);
        }
        int var7 = this.field3194 * arg0 >> 12;
        class39.method408(var4, var5, super.field2779, var6, var7, -1450271316);
    }
}
