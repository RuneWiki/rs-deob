import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class class28 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field353 = 0;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Z")
    public static boolean field354 = false;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field358 = -1;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Ljava/lang/String;")
    public static String field357 = null;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "F")
    public static float field356;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I")
    public static final int method139(int arg0, int arg1) {
        field359++;
        if (arg0 != 0) {
            field356 = 1.1017282F;
        }
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZLqh;)V")
    public static final void method140(int arg0, boolean arg1, class47 arg2) {
        field360++;
        if (class330.field4948 >= 400) {
            return;
        }
        if (class286.field4329 == arg2) {
            if (class306.field4636 && (class331.field4966 & 0x10) != 0) {
                class329.field4928++;
                class221.method1345(class200.field3175 + " -> <col=ffffff>" + class187.field2967.method2473(class406.field5898, -109), 19, 0, 0, class217.field3347, true, field357, -1, (byte) -121, 0L, false);
            }
        } else if (arg0 == 0) {
            String var9;
            if (arg2.field675 == 0) {
                boolean var3 = true;
                if (class286.field4329.field714 != -1 && arg2.field714 != -1) {
                    int var4 = class286.field4329.field672 <= arg2.field672 ? arg2.field672 : class286.field4329.field672;
                    int var5 = arg2.field714 > class286.field4329.field714 ? class286.field4329.field714 : arg2.field714;
                    int var6 = var4 * 10 / 100 + (var5 + 5);
                    int var7 = class286.field4329.field672 - arg2.field672;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var6 < var7) {
                        var3 = false;
                    }
                }
                String var8 = class64.field1064 == class298.field4512 ? class414.field6002.method2473(class406.field5898, -106) : class178.field2789.method2473(class406.field5898, -105);
                if (arg2.field693 <= arg2.field672) {
                    var9 = arg2.method327(115, true) + (var3 ? class448.method2677(arg2.field672, class286.field4329.field672, (byte) 77) : "<col=ffffff>") + " (" + var8 + arg2.field672 + ")";
                } else {
                    var9 = arg2.method327(115, true) + (var3 ? class448.method2677(arg2.field672, class286.field4329.field672, (byte) 53) : "<col=ffffff>") + " (" + var8 + arg2.field672 + "+" + (arg2.field693 - arg2.field672) + ")";
                }
            } else {
                var9 = arg2.method327(115, true) + " (" + class216.field3338.method2473(class406.field5898, -85) + arg2.field675 + ")";
            }
            if (class306.field4636) {
                if (!arg1 && (class331.field4966 & 0x8) != 0) {
                    class221.method1345(class200.field3175 + " -> <col=ffffff>" + var9, 2, 0, 0, class217.field3347, true, field357, -1, (byte) -121, (long) arg2.field2197, false);
                    class421.field6043++;
                }
            } else if (arg1) {
                class221.method1345("", -1, 0, 0, -1, false, "<col=cccccc>" + var9, 0, (byte) -121, 0L, true);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class139.field2286[var10] != null) {
                        short var11 = 0;
                        if (class329.field4936 == class298.field4512 && class139.field2286[var10].equalsIgnoreCase(class484.field7394.method2473(class406.field5898, -110))) {
                            if (arg2.field672 > class286.field4329.field672) {
                                var11 = 2000;
                            }
                            if (class286.field4329.field699 != 0 && arg2.field699 != 0) {
                                if (class286.field4329.field699 == arg2.field699) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class287.field4347[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class338.field5057[var10] + var11);
                        int var13 = class264.field3997[var10] == -1 ? class76.field1372 : class264.field3997[var10];
                        class221.method1345("<col=ffffff>" + var9, var12, 0, 0, var13, true, class139.field2286[var10], -1, (byte) -121, (long) arg2.field2197, false);
                        class290.field4400++;
                    }
                }
            }
            if (!arg1) {
                for (class2 var14 = (class2) class329.field4932.method8((byte) -98); var14 != null; var14 = (class2) class329.field4932.method17((byte) -67)) {
                    if (var14.field17 == 13) {
                        var14.field16 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)I")
    public static final int method141(int arg0, int arg1) {
        if (arg1 != 19) {
            method143((byte) -50);
        }
        field355++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lpi;III)V")
    public static final void method142(class329 arg0, int arg1, int arg2, int arg3) {
        long var4 = class155.field2450[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field4923 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field4926[arg0.field4923++] = class162.field2532[var8 - 1].field3534;
            var6 += 16L;
        }
        for (int var9 = arg0.field4923; var9 < 4; var9++) {
            arg0.field4926[var9] = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static void method143(byte arg0) {
        if (arg0 != 123) {
            field357 = null;
        }
        field357 = null;
    }
}
