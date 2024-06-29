import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class class76 {

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field1232 = 2;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "J")
    public static long field1224 = 0L;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "[I")
    public static int[] field1230 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field1235 = 0;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lrf;")
    public static class289 field1233;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Lpf;")
    public static class294 field1228;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "[[I")
    public static int[][] field1222;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "[[S")
    public static short[][] field1227;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "[[[I")
    public static int[][][] field1223;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method506(int arg0) {
        field1230 = null;
        field1233 = null;
        if (arg0 != 31900) {
            method507(-70);
        }
        field1228 = null;
        field1227 = null;
        field1223 = null;
        field1222 = null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public static final void method507(int arg0) {
        field1231++;
        class295.method1980(class276.field4158, 0);
        class188.field2878++;
        if (class1.field14 && class30.field428) {
            int var1 = class91.field1438;
            int var2 = class276.field4158.field4482;
            int var3 = class203.field3065;
            int var4 = var1 - class48.field773;
            int var5 = var3 - class183.field2769;
            if (class173.field2637 > var4) {
                var4 = class173.field2637;
            }
            int var6 = -124 % ((arg0 + 57) / 54);
            if ((class173.field2637 + class15.field183.field4478) < (class276.field4158.field4478 + var4)) {
                var4 = class173.field2637 + class15.field183.field4478 - class276.field4158.field4478;
            }
            int var7 = var4 + class15.field183.field4396 - class173.field2637;
            int var8 = var4 - class31.field455;
            if (class11.field142 > var5) {
                var5 = class11.field142;
            }
            if (class276.field4158.field4444 + var5 > class11.field142 + class15.field183.field4444) {
                var5 = class15.field183.field4444 + class11.field142 - class276.field4158.field4444;
            }
            int var9 = var5 + class15.field183.field4460 - class11.field142;
            int var10 = var5 - class114.field1741;
            if (class188.field2878 > class276.field4158.field4412 && (var2 < var8 || -var2 > var8 || var10 > var2 || (-var2) > var10)) {
                class262.field3967 = true;
            }
            if (class276.field4158.field4498 != null && class262.field3967) {
                class234 var11 = new class234();
                var11.field3531 = var9;
                var11.field3518 = var7;
                var11.field3533 = class276.field4158.field4498;
                var11.field3528 = class276.field4158;
                class228.method1456((byte) 119, var11);
            }
            if (class267.field4025 == 0) {
                if (class262.field3967) {
                    if (class276.field4158.field4456 != null) {
                        class234 var12 = new class234();
                        var12.field3524 = class160.field2456;
                        var12.field3518 = var7;
                        var12.field3528 = class276.field4158;
                        var12.field3531 = var9;
                        var12.field3533 = class276.field4158.field4456;
                        class228.method1456((byte) -24, var12);
                    }
                    if (class160.field2456 != null && client.method973(class276.field4158) != null) {
                        class196.field2979.method1106(90, false);
                        class196.field2979.method1599(9611, class160.field2456.field4530);
                        class231.field3491++;
                        class196.field2979.method1569(class276.field4158.field4530, -7355);
                        class196.field2979.method1613(false, class160.field2456.field4504);
                        class196.field2979.method1613(false, class276.field4158.field4504);
                    }
                } else if ((class158.field2417 == 1 || class16.method116(29960, class218.field3278 - 1)) && class218.field3278 > 2) {
                    class295.method1977((byte) -123);
                } else if (class218.field3278 > 0) {
                    class61.method408(125);
                }
                class276.field4158 = null;
            }
        } else if (class188.field2878 > 1) {
            class276.field4158 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lpf;Lpf;Lpf;ILpf;)V")
    public static final void method508(class294 arg0, class294 arg1, class294 arg2, int arg3, class294 arg4) {
        class154.field2312 = arg2;
        class292.field4599 = arg0;
        class236.field3559 = arg4;
        class124.field1874 = arg1;
        field1225++;
        if (arg3 != -3761) {
            field1233 = null;
        }
        class234.field3532 = new class289[class154.field2312.method1962(true)][];
        class220.field3307 = new boolean[class154.field2312.method1962(true)];
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
    public static final void method509(int arg0, int arg1) {
        if (arg1 == 5651) {
            field1226++;
            class39.field524 = (class175) class145.field2120.method1666((long) arg0, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Lud;")
    public static final class2 method510(int arg0, int arg1, int arg2) {
        class270 var3 = class33.field487[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4071; var4++) {
            class2 var5 = var3.field4069[var4];
            if ((var5.field28 >> 29 & 0x3L) == 2L && var5.field26 == arg1 && var5.field23 == arg2) {
                class126.method794(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lfh;B)Lfh;")
    public abstract class134 method129(class134 arg0, byte arg1);
}
