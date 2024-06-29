import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class167 {

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public int field2416 = -1;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public int field2418 = -1;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Ljp;")
    public static class236 field2417 = new class236(4);

    @OriginalMember(owner = "client!se", name = "m", descriptor = "[I")
    public static int[] field2427 = new int[1000];

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Lff;")
    public static class9 field2425;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "[I")
    public int[] field2419;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lmd;I)V", line = 4)
    public final void method1118(class379 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2238(255);
            if (var3 == 0) {
                field2415++;
                if (arg1 != -330) {
                    this.field2419 = null;
                    return;
                }
                return;
            }
            this.method1120(-103, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 28)
    public static final String method1119(boolean arg0, String arg1) {
        field2420++;
        if (arg0) {
            field2425 = null;
        }
        String var2 = class339.method1926(1007, class33.method259(arg1, 0));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILmd;I)V", line = 46)
    private final void method1120(int arg0, class379 arg1, int arg2) {
        int var4 = 27 / ((25 - arg0) / 52);
        if (arg2 == 1) {
            this.field2416 = arg1.method2212((byte) 83);
        } else if (arg2 == 2) {
            this.field2419 = new int[arg1.method2238(255)];
            for (int var5 = 0; var5 < this.field2419.length; var5++) {
                this.field2419[var5] = arg1.method2212((byte) 83);
            }
        } else if (arg2 == 3) {
            this.field2418 = arg1.method2238(255);
        }
        field2424++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 78)
    public static void method1121(int arg0) {
        field2425 = null;
        field2417 = null;
        field2427 = null;
        int var1 = -16 / ((70 - arg0) / 56);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V", line = 90)
    public static final void method1122(int arg0, int arg1, int arg2) {
        field2421++;
        class253 var3 = class332.method1911(arg1, (byte) -124, 5);
        var3.method1522(0);
        if (arg2 >= -84) {
            field2425 = null;
        }
        var3.field3356 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)I", line = 109)
    public static final int method1123(int arg0, boolean arg1) {
        if (arg1) {
            method1124(34, 90, false, (byte) -7, false);
        }
        field2426++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZBZ)V", line = 121)
    public static final void method1124(int arg0, int arg1, boolean arg2, byte arg3, boolean arg4) {
        field2422++;
        if (!arg4 && class522.field7715 == arg0 && class176.field2564 == arg1 && class455.field6229 == class411.field5656 || class154.field2244.method1855((byte) -109, class166.field2414)) {
            return;
        }
        class455.field6229 = class411.field5656;
        class176.field2564 = arg1;
        class522.field7715 = arg0;
        if (class154.field2244.method1855((byte) -91, class166.field2414)) {
            class455.field6229 = 0;
        }
        if (arg2) {
            class507.method2898(1, 28);
        } else {
            class507.method2898(1, 25);
        }
        class253.method1525(class299.field3960.method1764(class489.field6789, false), class302.field3995, 1, true);
        int var5 = class401.field5382;
        int var6 = class421.field5762;
        class401.field5382 = (class522.field7715 - (class12.field251 >> 4)) * 8;
        class421.field5762 = (class176.field2564 - (class289.field3782 >> 4)) * 8;
        class376.field5097 = class6.method34(class522.field7715 * 8, class176.field2564 * 8);
        class277.field3629 = null;
        int var7 = class401.field5382 - var5;
        int var8 = class421.field5762 - var6;
        if (arg2) {
            class60.field942 = 0;
            int var9 = class12.field251 * 128 - 128;
            int var10 = (class289.field3782 - 1) * 128;
            for (int var11 = 0; var11 < 32768; var11++) {
                class117 var12 = class291.field3822[var11];
                if (var12 != null) {
                    var12.field574 -= var8 * 128;
                    var12.field584 -= var7 * 128;
                    if (var12.field584 >= 0 && var12.field584 <= var9 && var12.field574 >= 0 && var12.field574 <= var10) {
                        boolean var13 = true;
                        for (int var14 = 0; var14 < 10; var14++) {
                            var12.field6261[var14] -= var7;
                            var12.field6266[var14] -= var8;
                            if (var12.field6261[var14] < 0 || class12.field251 <= var12.field6261[var14] || var12.field6266[var14] < 0 || class289.field3782 <= var12.field6266[var14]) {
                                var13 = false;
                            }
                        }
                        if (var13) {
                            class162.field2369[class60.field942++] = var11;
                        } else {
                            class291.field3822[var11].method803(null, (byte) 125);
                            class291.field3822[var11] = null;
                        }
                    } else {
                        class291.field3822[var11].method803(null, (byte) 123);
                        class291.field3822[var11] = null;
                    }
                }
            }
        } else {
            for (int var15 = 0; var15 < 32768; var15++) {
                class117 var23 = class291.field3822[var15];
                if (var23 != null) {
                    for (int var24 = 0; var24 < 10; var24++) {
                        var23.field6261[var24] -= var7;
                        var23.field6266[var24] -= var8;
                    }
                    var23.field574 -= var8 * 128;
                    var23.field584 -= var7 * 128;
                }
            }
        }
        for (int var16 = 0; var16 < 2048; var16++) {
            class515 var21 = class499.field6901[var16];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field6261[var22] -= var7;
                    var21.field6266[var22] -= var8;
                }
                var21.field584 -= var7 * 128;
                var21.field574 -= var8 * 128;
            }
        }
        class370[] var17 = class335.field4395;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class370 var20 = var17[var18];
            if (var20 != null) {
                var20.field4982 -= var7 * 128;
                var20.field4976 -= var8 * 128;
            }
        }
        class495.method2846((byte) -83, var8, var7);
        for (class322 var19 = (class322) class157.field2287.method1672((byte) -96); var19 != null; var19 = (class322) class157.field2287.method1668(arg3 ^ 0xFFFFFF97)) {
            var19.field4228 -= var8;
            var19.field4224 -= var7;
            if (class55.field872 != 3 && (var19.field4224 < 0 || var19.field4228 < 0 || var19.field4224 >= class12.field251 || class289.field3782 <= var19.field4228)) {
                var19.method300(false);
            }
        }
        if (class11.field239 != 0) {
            class11.field239 -= var7;
            class497.field6888 -= var8;
        }
        class75.method482(-96);
        if (arg3 != 104) {
            field2425 = null;
        }
        if (arg2) {
            class438.field6001 -= var8;
            class168.field2438 -= var8 * 128;
            class202.field2799 -= var7;
            class430.field5888 -= var7 * 128;
            class31.field511 -= var7;
            class315.field4134 -= var8;
            if (Math.abs(var7) > class12.field251 || Math.abs(var8) > class289.field3782) {
                class489.method2809(0);
            }
        } else if (class42.field623 == 4) {
            class150.field2135 -= var7 * 128;
            class429.field5883 -= var8 * 128;
            class183.field2610 -= var8 * 128;
            class375.field5094 -= var7 * 128;
        } else {
            class42.field623 = 1;
        }
        class362.method2107(4);
        class54.method398((byte) 21);
        class375.field5093.method1670((byte) -104);
        class373.field5031.method1670((byte) -104);
        class321.field4209.method1775((byte) 127);
        class317.method1836(100);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZI)I", line = 352)
    public static final int method1125(boolean arg0, int arg1) {
        if (arg0) {
            field2423++;
            return arg1 >>> 8;
        } else {
            return -104;
        }
    }
}
