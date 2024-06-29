import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class478 {

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "Ltk;")
    private class230 field6993 = new class230();

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    private int field6996;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    private int field7000;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "Lek;")
    private class352 field7001;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "Lap;")
    public static class335 field6998 = new class335("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "[F")
    public static float[] field7005 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BI)V", line = 7)
    public final void method2912(byte arg0, int arg1) {
        field6992++;
        if (arg0 != -59) {
            this.method2916(null, -60, -75, null);
        }
        if (class109.field1456 == null) {
            return;
        }
        for (class481 var3 = (class481) this.field6993.method1399(110); var3 != null; var3 = (class481) this.field6993.method1394((byte) 14)) {
            if (var3.method910((byte) 71)) {
                if (var3.method909(arg0 ^ 0xFFFFFFC5) == null) {
                    var3.method2165(16225);
                    var3.method701(arg0 ^ 0xFFFFFF82);
                    this.field6996 += var3.field7029;
                }
            } else if ((long) arg1 < ++var3.field1098) {
                class481 var4 = class109.field1456.method682(14185, var3);
                this.field7001.method2019((byte) -125, var4, var3.field5043);
                class145.method975((byte) -17, var3, var4);
                var3.method2165(arg0 ^ 0xFFFFC0A4);
                var3.method701(arg0 ^ 0xFFFFFF83);
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BLhf;)V", line = 61)
    private final void method2913(byte arg0, class272 arg1) {
        field6990++;
        if (arg0 < 71) {
            this.method2918(null, 66);
        }
        long var3 = arg1.method1612((byte) 66);
        for (class481 var5 = (class481) this.field7001.method2022(-1, var3); var5 != null; var5 = (class481) this.field7001.method2020((byte) -102)) {
            if (var5.field7026.method1611(-40, arg1)) {
                this.method2918(var5, -1001);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILhf;)Ljava/lang/Object;", line = 95)
    public final Object method2914(int arg0, class272 arg1) {
        field7004++;
        long var3 = arg1.method1612((byte) 66);
        for (class481 var5 = (class481) this.field7001.method2022(-1, var3); var5 != null; var5 = (class481) this.field7001.method2020((byte) -91)) {
            if (var5.field7026.method1611(-59, arg1)) {
                Object var6 = var5.method909(0);
                if (var6 != null) {
                    if (var5.method910((byte) 71)) {
                        class129 var7 = new class129(arg1, var6, var5.field7029);
                        this.field7001.method2019((byte) -47, var7, var5.field5043);
                        this.field6993.method1400(false, var7);
                        var7.field1098 = 0L;
                        var5.method2165(16225);
                        var5.method701(arg0 ^ 0x7C);
                    } else {
                        this.field6993.method1400(false, var5);
                        var5.field1098 = 0L;
                    }
                    return var6;
                }
                var5.method2165(16225);
                var5.method701(arg0 ^ 0x46);
                this.field6996 += var5.field7029;
            }
        }
        if (arg0 != 0) {
            this.method2917(36);
        }
        return null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)V", line = 147)
    public static void method2915(boolean arg0) {
        field6998 = null;
        field7005 = null;
        if (arg0) {
            method2920(null, -49, null);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/Object;IILhf;)V", line = 158)
    private final void method2916(Object arg0, int arg1, int arg2, class272 arg3) {
        field6994++;
        if (this.field7000 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method2913((byte) 91, arg3);
        this.field6996 -= arg2;
        while (this.field6996 < 0) {
            class481 var6 = (class481) this.field6993.method1393((byte) 127);
            this.method2918(var6, -1001);
        }
        class129 var5 = new class129(arg3, arg0, arg2);
        this.field7001.method2019((byte) -39, var5, arg3.method1612((byte) 66));
        this.field6993.method1400(false, var5);
        if (arg1 <= 67) {
            this.field6993 = null;
        }
        var5.field1098 = 0L;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)I", line = 188)
    public final int method2917(int arg0) {
        if (arg0 == -4) {
            field6999++;
            return this.field6996;
        } else {
            return 56;
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(I)V", line = 256)
    public class478(int arg0) {
        this.field6996 = arg0;
        this.field7000 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field7001 = new class352(var2);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lqf;I)V", line = 203)
    private final void method2918(class481 arg0, int arg1) {
        field6989++;
        if (arg0 != null) {
            arg0.method2165(arg1 + 17226);
            arg0.method701(106);
            this.field6996 += arg0.field7029;
        }
        if (arg1 != -1001) {
            field6998 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V", line = 220)
    public final void method2919(int arg0) {
        if (arg0 != -7) {
            this.field7000 = -84;
        }
        this.field6993.method1396(arg0 - 114);
        field6997++;
        this.field7001.method2024(false);
        this.field6996 = this.field7000;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lqn;ILqn;)V", line = 233)
    public static final void method2920(class47 arg0, int arg1, class47 arg2) {
        field7003++;
        class65.field838 = arg0;
        class228.field2922 = arg2;
        if (arg1 != 1) {
            method2920(null, 101, null);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lhf;ILjava/lang/Object;)V", line = 245)
    public final void method2921(class272 arg0, int arg1, Object arg2) {
        field6995++;
        if (arg1 <= -39) {
            this.method2916(arg2, 76, 1, arg0);
        }
    }

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)I", line = 271)
    public final int method2922(int arg0) {
        field6991++;
        int var2 = -124 / ((arg0 - 34) / 36);
        return this.field7000;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILmv;Lmv;IZ)I", line = 282)
    public static final int method2923(int arg0, class254 arg1, class254 arg2, int arg3, boolean arg4) {
        field7006++;
        int var5 = -74 % ((arg0 - 75) / 35);
        if (arg3 == 1) {
            int var6 = arg2.field2700;
            int var7 = arg1.field2700;
            if (!arg4) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var7 == -1) {
                    var7 = 2001;
                }
            }
            return var6 - var7;
        } else if (arg3 == 2) {
            return class176.method1130(class11.field177, arg2.method1529(-18827).field286, 0, arg1.method1529(-18827).field286);
        } else if (arg3 == 3) {
            if (arg2.field3238.equals("-")) {
                if (arg1.field3238.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field3238.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class176.method1130(class11.field177, arg2.field3238, 0, arg1.field3238);
            }
        } else if (arg3 == 4) {
            if (arg2.method1295((byte) -115)) {
                return arg1.method1295((byte) -115) ? 0 : 1;
            } else if (arg1.method1295((byte) -115)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 5) {
            if (arg2.method1300(-1)) {
                return arg1.method1300(-1) ? 0 : 1;
            } else if (arg1.method1300(-1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 6) {
            if (arg2.method1296(-93)) {
                return arg1.method1296(-84) ? 0 : 1;
            } else if (arg1.method1296(-54)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 7) {
            if (arg2.method1297(42)) {
                return arg1.method1297(71) ? 0 : 1;
            } else if (arg1.method1297(104)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 8) {
            int var8 = arg2.field3244;
            int var9 = arg1.field3244;
            if (arg4) {
                if (var9 == 1000) {
                    var9 = -1;
                }
                if (var8 == 1000) {
                    var8 = -1;
                }
            } else {
                if (var9 == -1) {
                    var9 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var8 - var9;
        } else {
            return arg2.field3236 - arg1.field3236;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V", line = 390)
    public final void method2924(byte arg0) {
        field7002++;
        class481 var2 = (class481) this.field6993.method1399(113);
        if (arg0 > -103) {
            return;
        }
        while (var2 != null) {
            if (var2.method910((byte) 71)) {
                var2.method2165(16225);
                var2.method701(82);
                this.field6996 += var2.field7029;
            }
            var2 = (class481) this.field6993.method1394((byte) 14);
        }
    }
}
