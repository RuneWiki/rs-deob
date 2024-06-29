import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class154 extends class445 {

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public int field2158;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public int field2157;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V", line = 7)
    public static final void method906(byte arg0) {
        class110.field1671.method645(0);
        field2159++;
        for (class395 var1 = (class395) class450.field6121.method652((byte) 37); var1 != null; var1 = (class395) class450.field6121.method653(103)) {
            if (var1.field5469 < 1000) {
                var1.method2614((byte) -99);
                class110.field1671.method641(var1, (byte) -93);
            }
        }
        class110.field1671.method643(class450.field6121, -2886);
        int var2 = -1;
        if (class187.field2569 != null) {
            var2 = class187.field2569.method1546(true);
        }
        if (class385.field5334) {
            if (var2 == -1) {
                int var3 = class34.field523.method1916((byte) -21);
                int var4 = class34.field523.method1925(50);
                if (var3 < (class2.field40 - 10) || var3 > (class2.field40 + class97.field1419 + 10) || var4 < (class94.field1390 - 10) || var4 > class94.field1390 + class103.field1491 + 10) {
                    class385.field5334 = false;
                    class446.method2623(class97.field1419, -729334780, class2.field40, class103.field1491, class94.field1390);
                }
            }
            if (var2 == 0) {
                int var5 = class2.field40;
                int var6 = class94.field1390;
                int var7 = class97.field1419;
                int var8 = class187.field2569.method1551(128);
                int var9 = class187.field2569.method1549((byte) 108);
                int var10 = -1;
                for (int var11 = 0; var11 < class475.field6540; var11++) {
                    if (class316.field4178) {
                        int var15 = (class475.field6540 - (var11 + 1)) * 16 + var6 + 33;
                        if (var5 < var8 && (var5 + var7) > var8 && var9 > var15 - 13 && var15 + 4 > var9) {
                            var10 = var11;
                        }
                    } else {
                        int var16 = (class475.field6540 - var11 - 1) * 16 + var6 + 31;
                        if (var5 < var8 && var8 < (var5 + var7) && var16 - 13 < var9 && var9 < (var16 + 3)) {
                            var10 = var11;
                        }
                    }
                }
                if (var10 != -1) {
                    int var12 = 0;
                    class260 var13 = new class260(class450.field6121);
                    for (class395 var14 = (class395) var13.method1466((byte) 46); var14 != null; var14 = (class395) var13.method1463(86)) {
                        if (var10 == var12) {
                            class220.method1248(var14, var8, true, var9);
                        }
                        var12++;
                    }
                }
                class385.field5334 = false;
                class446.method2623(class97.field1419, -729334780, class2.field40, class103.field1491, class94.field1390);
            }
        } else {
            if (var2 == 0 && (class208.field2811 == 1 && class475.field6540 > 2 || class351.method2174(-1))) {
                var2 = 2;
            }
            if (var2 == 2 && class475.field6540 > 0 && class187.field2569 != null) {
                if (class385.field5314 == null && class23.field308 == 0) {
                    class469.method2756(class187.field2569.method1551(128), false, class187.field2569.method1549((byte) 108));
                } else {
                    class409.field5600 = 2;
                }
            }
            if (var2 == 0 && class475.field6540 > 0) {
                class147.method873(-25786);
            }
            if (class385.field5314 == null && class23.field308 == 0) {
                class409.field5600 = 0;
                class246.field3290 = null;
            }
        }
        int var17 = -103 % ((arg0 + 67) / 32);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V", line = 158)
    public static final void method907(int arg0) {
        field2156++;
        class314.field4171.method1665(-2);
        int var1 = class314.field4171.method1664((byte) -13, 8);
        if (var1 < class202.field2734) {
            for (int var2 = var1; var2 < class202.field2734; var2++) {
                class233.field3099[class39.field570++] = class412.field5638[var2];
            }
        }
        if (class202.field2734 < var1) {
            throw new RuntimeException("gnpov1");
        } else if (arg0 == 16082) {
            class202.field2734 = 0;
            for (int var3 = 0; var3 < var1; var3++) {
                int var4 = class412.field5638[var3];
                class121 var5 = class221.field2941[var4];
                int var6 = class314.field4171.method1664((byte) -13, 1);
                if (var6 == 0) {
                    class412.field5638[class202.field2734++] = var4;
                    var5.field1153 = class70.field968;
                } else {
                    int var7 = class314.field4171.method1664((byte) -13, 2);
                    if (var7 == 0) {
                        class412.field5638[class202.field2734++] = var4;
                        var5.field1153 = class70.field968;
                        class270.field3608[class343.field4589++] = var4;
                    } else if (var7 == 1) {
                        class412.field5638[class202.field2734++] = var4;
                        var5.field1153 = class70.field968;
                        int var8 = class314.field4171.method1664((byte) -13, 3);
                        var5.method753(1, false, var8);
                        int var9 = class314.field4171.method1664((byte) -13, 1);
                        if (var9 == 1) {
                            class270.field3608[class343.field4589++] = var4;
                        }
                    } else if (var7 == 2) {
                        class412.field5638[class202.field2734++] = var4;
                        var5.field1153 = class70.field968;
                        if (class314.field4171.method1664((byte) -13, 1) == 1) {
                            int var11 = class314.field4171.method1664((byte) -13, 3);
                            var5.method753(2, false, var11);
                            int var12 = class314.field4171.method1664((byte) -13, 3);
                            var5.method753(2, false, var12);
                        } else {
                            int var10 = class314.field4171.method1664((byte) -13, 3);
                            var5.method753(0, false, var10);
                        }
                        int var13 = class314.field4171.method1664((byte) -13, 1);
                        if (var13 == 1) {
                            class270.field3608[class343.field4589++] = var4;
                        }
                    } else if (var7 == 3) {
                        class233.field3099[class39.field570++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)Loo;", line = 273)
    public static final class408 method908(byte arg0) {
        field2154++;
        class408 var1 = (class408) class103.field1473.method2773((byte) 4);
        if (var1 == null) {
            int var2 = 19 % ((-arg0 - 21) / 55);
            return new class408();
        } else {
            class324.field4326--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(II)V", line = 294)
    public class154(int arg0, int arg1) {
        this.field2158 = arg1;
        this.field2157 = arg0;
    }
}
