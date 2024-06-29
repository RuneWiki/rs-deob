import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class448 {

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Ltl;")
    private class403 field6093 = new class403();

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "Lwc;")
    private class46 field6104 = new class46();

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    private int field6100;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    private int field6102;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "Lad;")
    private class268 field6101;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Lh;")
    public static class434 field6090 = new class434(44, 8);

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field6098 = 0;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field6099 = 0;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "Lvi;")
    public static class347 field6097;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "[[[I")
    public static int[][][] field6103;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBLhb;)Lbi;", line = 9)
    public static final class309 method2632(int arg0, byte arg1, class471 arg2) {
        field6092++;
        class309 var3;
        if (class433.field5896 == null) {
            var3 = new class309();
        } else {
            var3 = class433.field5896;
            class433.field5896 = class433.field5896.field4084;
            class492.field6871--;
            var3.field4084 = null;
        }
        var3.field4091 = arg2;
        var3.field4082 = arg0;
        if (arg1 > -126) {
            field6090 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIZZI)I", line = 38)
    public static final int method2633(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field6089++;
        class257 var5 = class80.method525(arg2, -7967, arg4);
        if (var5 == null) {
            return 0;
        }
        int var6 = arg1;
        for (int var7 = 0; var7 < var5.field3418.length; var7++) {
            if (var5.field3418[var7] >= 0 && var5.field3418[var7] < class175.field2385.field3658) {
                class443 var8 = class175.field2385.method1557(var5.field3418[var7], 21992);
                int var9 = var8.method2589(121, class94.field1387.method164(27, arg0).field1702, arg0);
                if (arg3) {
                    var6 += var5.field3415[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 75)
    public static void method2634(byte arg0) {
        field6097 = null;
        int var1 = -32 % ((arg0 + 42) / 51);
        field6090 = null;
        field6103 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(JB)Ltl;", line = 89)
    public final class403 method2635(long arg0, byte arg1) {
        if (arg1 >= -54) {
            return null;
        }
        field6095++;
        class403 var4 = (class403) this.field6101.method1528(arg0, 97);
        if (var4 != null) {
            this.field6104.method336(-22, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V", line = 112)
    public final void method2636(byte arg0) {
        field6096++;
        this.field6104.method337((byte) 124);
        if (arg0 < -93) {
            this.field6101.method1519(-16576);
            this.field6093 = new class403();
            this.field6102 = this.field6100;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII)V", line = 127)
    public static final void method2637(int arg0, int arg1, int arg2, int arg3) {
        field6091++;
        if (class289.field3897 == null) {
            return;
        }
        long var4 = (long) (arg0 | arg2 << 28 | arg3 << 14);
        class223 var6 = (class223) class33.field505.method1528(var4, arg1 + 828);
        if (var6 == null) {
            class202.method1155(arg2, arg0, arg3);
            return;
        }
        class459 var7 = (class459) var6.field2963.method652((byte) 37);
        if (var7 == null) {
            class202.method1155(arg2, arg0, arg3);
            return;
        }
        class15 var8 = (class15) class202.method1155(arg2, arg0, arg3);
        if (var8 == null) {
            var8 = new class15();
        } else {
            var8.field216 = var8.field217 = -1;
        }
        var8.field221 = var7.field6224;
        var8.field222 = var7.field6222;
        label48: while (true) {
            class459 var9 = (class459) var6.field2963.method653(arg1 + 809);
            if (var9 == null) {
                break;
            }
            if (var8.field222 != var9.field6222) {
                var8.field213 = var9.field6224;
                var8.field216 = var9.field6222;
                while (true) {
                    class459 var10 = (class459) var6.field2963.method653(50);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field222 != var10.field6222 && var8.field216 != var10.field6222) {
                        var8.field218 = var10.field6224;
                        var8.field217 = var10.field6222;
                    }
                }
            }
        }
        if (arg1 != -751) {
            field6097 = null;
        }
        int var11 = class247.method1385(17, (arg0 << 7) + 64, (arg3 << 7) + 64, arg2);
        class146.method871(arg2, arg0, arg3, var11, var8);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLtl;J)V", line = 210)
    public final void method2638(byte arg0, class403 arg1, long arg2) {
        if (this.field6102 == 0) {
            class403 var5 = this.field6104.method334(27830);
            var5.method2614((byte) -96);
            var5.method2441((byte) -83);
            if (this.field6093 == var5) {
                class403 var6 = this.field6104.method334(27830);
                var6.method2614((byte) -84);
                var6.method2441((byte) -93);
            }
        } else {
            this.field6102--;
        }
        int var7 = -60 / ((arg0 - 38) / 63);
        field6088++;
        this.field6101.method1525((byte) 19, arg1, arg2);
        this.field6104.method336(-117, arg1);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILwm;)V", line = 241)
    public static final void method2639(int arg0, class364 arg1) {
        field6094++;
        if (!(class475.field6540 >= 2 || class289.field3899) || class385.field5314 != null) {
            return;
        }
        if (arg0 != 4) {
            field6099 = -31;
        }
        String var2;
        if (class289.field3899 && class475.field6540 < 2) {
            var2 = class491.field6867 + class205.field2782.method1176(class110.field1676, (byte) -110) + class31.field407 + " ->";
        } else if (class266.field3517 && class449.field6111.method882((byte) -111, 81) && class475.field6540 > 2) {
            var2 = class293.method1640((byte) 90, (class395) class450.field6121.field1573.field6048.field6048);
        } else {
            class395 var3 = (class395) class450.field6121.field1573.field6048;
            var2 = class293.method1640((byte) 90, var3);
            int[] var4 = null;
            if (class346.method2135(var3.field5469, arg0 - 18)) {
                var4 = class175.field2385.method1557((int) var3.field5480, 21992).field5960;
            } else if (var3.field5478 != -1) {
                var4 = class175.field2385.method1557(var3.field5478, 21992).field5960;
            } else if (class215.method1218(var3.field5469, -6)) {
                class121 var7 = class221.field2941[(int) var3.field5480];
                if (var7 != null) {
                    class429 var8 = var7.field1780;
                    if (var8.field5824 != null) {
                        var8 = var8.method2531(class38.field562, 105);
                    }
                    if (var8 != null) {
                        var4 = var8.field5843;
                    }
                }
            } else if (class294.method1649((byte) 105, var3.field5469)) {
                Object var5 = null;
                class88 var6;
                if (var3.field5469 == 1010) {
                    var6 = class1.field23.method935((int) var3.field5480, (byte) 119);
                } else {
                    var6 = class1.field23.method935((int) (var3.field5480 >>> 32 & 0x7FFFFFFFL), (byte) -123);
                }
                if (var6.field1269 != null) {
                    var6 = var6.method574(-125, class38.field562);
                }
                if (var6 != null) {
                    var4 = var6.field1275;
                }
            }
            if (var4 != null) {
                var2 = var2 + class279.method1573((byte) -50, var4);
            }
        }
        if (class475.field6540 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class475.field6540 - 2) + class251.field3339.method1176(class110.field1676, (byte) -113);
        }
        if (class162.field2257 != null) {
            class345 var9 = class162.field2257.method2730(arg1, (byte) 67);
            if (var9 == null) {
                var9 = class93.field1366;
            }
            var9.method2129(class450.field6117, var2, class87.field1216, class209.field2831, class162.field2257.field6391, class91.field1348, class162.field2257.field6320, class162.field2257.field6308, class162.field2257.field6382, class47.field636, class467.field6465, class162.field2257.field6340, class162.field2257.field6398, class143.field2061, true);
            class446.method2623(class91.field1348[2], arg0 ^ 0xD4873C00, class91.field1348[0], class91.field1348[3], class91.field1348[1]);
        } else if (class163.field2265 != null && class404.field5538 == class343.field4601) {
            int var10 = class93.field1366.method2126(class433.field5892 + 4, class47.field636, class467.field6465, class209.field2831, 16777215, class329.field4370 + 16, arg0 ^ 0xFFFFFB, class143.field2061, var2, 0);
            class446.method2623(class392.field5448.method2145(var2, 13938) + var10, -729334780, class433.field5892 + 4, 16, class329.field4370);
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I)V", line = 374)
    public class448(int arg0) {
        this.field6100 = arg0;
        this.field6102 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field6101 = new class268(var2);
    }
}
