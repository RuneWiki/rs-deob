import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class7 extends class431 {

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field214;

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "[F")
    public static float[] field212 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "[[I")
    public static int[][] field213 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!kw", name = "B", descriptor = "I")
    public static int field215 = 0;

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!kw", name = "C", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!kw", name = "D", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!kw", name = "E", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 3)
    public final Object method38(int arg0) {
        field211++;
        return arg0 == 4 ? this.field214 : null;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V", line = 16)
    public static final void method39(byte arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class401.field6039[var1] = null;
        }
        if (arg0 >= -104) {
            method39((byte) 81);
        }
        field216++;
        class394.field5963 = 0;
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 38)
    public class7(Object arg0, int arg1) {
        super(arg1);
        this.field214 = arg0;
    }

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "(I)Z", line = 51)
    public final boolean method40(int arg0) {
        if (arg0 <= 11) {
            field212 = null;
        }
        field217++;
        return false;
    }

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "(I)V", line = 62)
    public static void method41(int arg0) {
        if (arg0 != 8788) {
            field215 = -93;
        }
        field212 = null;
        field213 = null;
    }

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "(I)V", line = 77)
    public static final void method42(int arg0) {
        field218++;
        class29.method187(false, -5963);
        class30.field518 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class476.field6823.length; var2++) {
            if (class221.field2933[var2] != -1 && class476.field6823[var2] == null) {
                class476.field6823[var2] = class43.field625.method1844(class221.field2933[var2], class145.method1006(arg0, -31331), 0);
                if (class476.field6823[var2] == null) {
                    var1 = false;
                    class30.field518++;
                }
            }
            if (class372.field5505[var2] != -1 && class47.field751[var2] == null) {
                class47.field751[var2] = class43.field625.method1834(class372.field5505[var2], 0, class654.field9367[var2], (byte) -108);
                if (class47.field751[var2] == null) {
                    class30.field518++;
                    var1 = false;
                }
            }
            if (class299.field4396[var2] != -1 && class246.field3253[var2] == null) {
                class246.field3253[var2] = class43.field625.method1844(class299.field4396[var2], 31330, 0);
                if (class246.field3253[var2] == null) {
                    var1 = false;
                    class30.field518++;
                }
            }
            if (class443.field6438[var2] != -1 && class51.field801[var2] == null) {
                class51.field801[var2] = class43.field625.method1844(class443.field6438[var2], class145.method1006(arg0, -31331), 0);
                if (class51.field801[var2] == null) {
                    var1 = false;
                    class30.field518++;
                }
            }
            if (class480.field6863 != null && class108.field1609[var2] == null && class480.field6863[var2] != -1) {
                class108.field1609[var2] = class43.field625.method1834(class480.field6863[var2], 0, class654.field9367[var2], (byte) -109);
                if (class108.field1609[var2] == null) {
                    var1 = false;
                    class30.field518++;
                }
            }
        }
        if (class103.field1546 == null) {
            if (class583.field8474 == null || !class326.field4732.method1815(class583.field8474.field8737 + "_staticelements", -49)) {
                class103.field1546 = new class69(0);
            } else if (class326.field4732.method1823(class583.field8474.field8737 + "_staticelements", true)) {
                class103.field1546 = class572.method3284(class583.field8474.field8737 + "_staticelements", class232.field3066, class326.field4732, (byte) 65);
            } else {
                class30.field518++;
                var1 = false;
            }
        }
        if (!var1) {
            class520.field7295 = 1;
            return;
        }
        class65.field1040 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class476.field6823.length; var4++) {
            byte[] var21 = class47.field751[var4];
            if (var21 != null) {
                int var22 = (class505.field7147[var4] >> 8) * 64 - class397.field6005;
                int var23 = (class505.field7147[var4] & 0xFF) * 64 - class403.field6049;
                if (class57.field938 != 0) {
                    var22 = 10;
                    var23 = 10;
                }
                var3 &= class70.method407(var21, 250423814, class72.field1144, class668.field9444, var23, var22);
            }
            byte[] var24 = class51.field801[var4];
            if (var24 != null) {
                int var25 = (class505.field7147[var4] >> 8) * 64 - class397.field6005;
                int var26 = (class505.field7147[var4] & 0xFF) * 64 - class403.field6049;
                if (class57.field938 != 0) {
                    var26 = 10;
                    var25 = 10;
                }
                var3 &= class70.method407(var24, 250423814, class72.field1144, class668.field9444, var26, var25);
            }
        }
        if (!var3) {
            class520.field7295 = 2;
            return;
        }
        if (class520.field7295 != 0) {
            class453.method2656(~arg0, class244.field3236, class279.field3637.method1654(113, class262.field3401) + "<br>(100%)", class332.field4821, true, class624.field9024);
        }
        class413.method2520(false);
        class245.method1499(-93);
        boolean var5 = false;
        if (class332.field4821.method649() && class335.field4872.field9491) {
            for (int var6 = 0; var6 < class476.field6823.length; var6++) {
                if (class51.field801[var6] != null || class246.field3253[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class335.field4872.field9487) {
            var7 = class96.field1478[class122.field1817];
        } else {
            var7 = class374.field5525[class122.field1817];
        }
        if (class332.field4821.method694()) {
            var7++;
        }
        class10.method72(class332.field4821, class280.field3704, 9, 4, class72.field1144, class668.field9444, var7, var5, arg0 > ~class332.field4821.method669());
        class127.method911(class448.field6500);
        if (class448.field6500 == 0) {
            class309.method1932(null);
        } else {
            class309.method1932(class597.field8642);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class629.field9104[var8].method2907((byte) -58);
        }
        class15.method104((byte) 19);
        class32.method200((byte) -53, false);
        class365.method2238((byte) 107);
        class321.field4680 = false;
        class383.field5750 = null;
        class413.method2520(false);
        System.gc();
        class29.method187(true, -5963);
        class369.method2280((byte) 111);
        class181.field2502 = class335.field4872.method3786(class62.field996, false);
        class430.field6257 = class335.field4872.field9491;
        class180.field2491 = class190.field2576 >= 96;
        class678.field9598 = class335.field4872.method3785(class62.field996, 3);
        class377.field5665 = !class335.field4872.field9497;
        class565.field8250 = class335.field4872.method3439(class62.field996, false) ? -1 : class432.field6276;
        class138.field2016 = class287.method1726(2097152, class62.field996) || class335.field4872.field9475;
        class66.field1054 = class335.field4872.field9465;
        class619.field8968 = new class94(4, class72.field1144, class668.field9444, false);
        if (class57.field938 == 0) {
            class552.method3219((byte) -21, class619.field8968, class476.field6823);
        } else {
            class618.method3561(class619.field8968, (byte) 107, class476.field6823);
        }
        class520.method2941(class72.field1144 >> 4, false, class668.field9444 >> 4);
        class351.method2180(-17040);
        if (var5) {
            class243.method1491(true);
            class263.field3414 = new class94(1, class72.field1144, class668.field9444, true);
            if (class57.field938 == 0) {
                class552.method3219((byte) -21, class263.field3414, class246.field3253);
                class29.method187(true, -5963);
            } else {
                class618.method3561(class263.field3414, (byte) 24, class246.field3253);
                class29.method187(true, -5963);
            }
            class263.field3414.method3860(0, class619.field8968.field9731[0], -2128096759);
            class263.field3414.method3855(null, class332.field4821, arg0 ^ 0x15FE, null);
            class243.method1491(false);
        }
        class619.field8968.method3855(var5 ? class263.field3414.field9731 : null, class332.field4821, -5631, class629.field9104);
        if (class57.field938 == 0) {
            class29.method187(true, -5963);
            class538.method3102((byte) -74, class47.field751, class619.field8968);
            if (class108.field1609 != null) {
                class478.method2743((byte) -85);
            }
        } else {
            class29.method187(true, -5963);
            class701.method3934(class619.field8968, class47.field751, (byte) 104);
        }
        class245.method1499(-122);
        if (class190.field2576 < 96) {
            class308.method1923(0);
        }
        class29.method187(true, -5963);
        class619.field8968.method3859(null, var5 ? class383.field5753[0] : null, (byte) 73, class332.field4821);
        class619.field8968.method589(false, arg0 + 63, class332.field4821);
        class29.method187(true, -5963);
        if (var5) {
            class243.method1491(true);
            class29.method187(true, -5963);
            if (class57.field938 == 0) {
                class538.method3102((byte) 105, class51.field801, class263.field3414);
            } else {
                class701.method3934(class263.field3414, class51.field801, (byte) 104);
            }
            class245.method1499(-114);
            class29.method187(true, -5963);
            class263.field3414.method3859(class262.field3404[0], null, (byte) -42, class332.field4821);
            class263.field3414.method589(true, 107, class332.field4821);
            class29.method187(true, arg0 - 5962);
            class243.method1491(false);
        }
        class360.method2216(-12527);
        int var9 = class619.field8968.field1456;
        if (class49.field779 < var9) {
            var9 = class49.field779;
        }
        if (var9 < (class49.field779 - 1)) {
            var9 = class49.field779 - 1;
        }
        if (class335.field4872.method3439(class62.field996, false)) {
            class242.method1482(0);
        } else {
            class242.method1482(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class72.field1144; var19++) {
                for (int var20 = 0; var20 < class668.field9444; var20++) {
                    class408.method2505(var10, var20, var19, (byte) 36);
                }
            }
        }
        class508.method2889((byte) 0);
        class413.method2520(false);
        class698.method3920(0);
        class245.method1499(-86);
        class272.method1624((byte) 125);
        if (class388.field5808 != null && class230.field3051 != null && class264.field3451 == 11) {
            class191.field2587++;
            class654 var11 = class631.method3628(class557.field8175, (byte) -51, class357.field5280);
            var11.field9358.method3146(1057001181, 80);
            class444.method2623(127, var11);
        }
        if (class57.field938 == 0) {
            int var12 = (class697.field9827 - (class72.field1144 >> 4)) / 8;
            int var13 = ((class72.field1144 >> 4) + class697.field9827) / 8;
            int var14 = (class22.field426 - (class668.field9444 >> 4)) / 8;
            int var15 = (class22.field426 + (class668.field9444 >> 4)) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var12 > var16 || var13 < var16 || var14 > var17 || var17 > var15) {
                        class43.field625.method1835("m" + var16 + "_" + var17, -123);
                        class43.field625.method1835("l" + var16 + "_" + var17, -111);
                    }
                }
            }
        }
        if (class264.field3451 == 4) {
            class322.method2003(0, 3);
        } else if (class264.field3451 == 8) {
            class322.method2003(arg0 + 1, 7);
        } else {
            class322.method2003(0, 10);
            if (class230.field3051 != null) {
                class654 var18 = class631.method3628(class556.field8168, (byte) -51, class357.field5280);
                class444.method2623(116, var18);
            }
        }
        class258.method1543(112);
        class413.method2520(false);
        class232.method1437(-45);
        if (class149.field2114) {
            class600.method3415("Took: " + (class60.method371(false) - class338.field4910) + "ms", true);
            class149.field2114 = false;
        }
    }
}
