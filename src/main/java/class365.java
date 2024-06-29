import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class365 {

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Lnn;")
    public static class151 field5363 = new class151("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Lpf;")
    public static class425 field5366 = new class425(26, -1);

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "Z")
    public static boolean field5368 = false;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Lsf;")
    public static class398 field5369 = new class398();

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static void method2190(int arg0) {
        if (arg0 != -7758) {
            field5363 = null;
        }
        field5366 = null;
        field5369 = null;
        field5363 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public static final void method2191(byte arg0) {
        class424.field6232.method710(255);
        field5361++;
        int var1 = class424.field6232.method717(8, false);
        if (arg0 != -110) {
            return;
        }
        if (class38.field458 > var1) {
            for (int var2 = var1; var2 < class38.field458; var2++) {
                class148.field2046[class115.field1515++] = class87.field1235[var2];
            }
        }
        if (class38.field458 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class38.field458 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class87.field1235[var3];
            class155 var5 = class170.field2626[var4];
            int var6 = class424.field6232.method717(1, false);
            if (var6 == 0) {
                class87.field1235[class38.field458++] = var4;
                var5.field1977 = class26.field332;
            } else {
                int var7 = class424.field6232.method717(2, false);
                if (var7 == 0) {
                    class87.field1235[class38.field458++] = var4;
                    var5.field1977 = class26.field332;
                    class28.field358[class324.field4875++] = var4;
                } else if (var7 == 1) {
                    class87.field1235[class38.field458++] = var4;
                    var5.field1977 = class26.field332;
                    int var8 = class424.field6232.method717(3, false);
                    var5.method960(1, (byte) 59, var8);
                    int var9 = class424.field6232.method717(1, false);
                    if (var9 == 1) {
                        class28.field358[class324.field4875++] = var4;
                    }
                } else if (var7 == 2) {
                    class87.field1235[class38.field458++] = var4;
                    var5.field1977 = class26.field332;
                    if (class424.field6232.method717(1, false) == 1) {
                        int var11 = class424.field6232.method717(3, false);
                        var5.method960(2, (byte) 59, var11);
                        int var12 = class424.field6232.method717(3, false);
                        var5.method960(2, (byte) 59, var12);
                    } else {
                        int var10 = class424.field6232.method717(3, false);
                        var5.method960(0, (byte) 59, var10);
                    }
                    int var13 = class424.field6232.method717(1, false);
                    if (var13 == 1) {
                        class28.field358[class324.field4875++] = var4;
                    }
                } else if (var7 == 3) {
                    class148.field2046[class115.field1515++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
    public static final void method2192(int arg0) {
        class241 var1 = class427.field6289;
        synchronized (class427.field6289) {
            class427.field6289.method1485(-22032);
        }
        field5367++;
        if (arg0 != -1) {
            field5369 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V")
    public static final void method2193(int arg0) {
        class134.field1770.method2512((byte) 4);
        field5364++;
        for (class306 var1 = (class306) class372.field5433.method2514((byte) 61); var1 != null; var1 = (class306) class372.field5433.method2511(-120)) {
            if (var1.field4616 < 1000) {
                var1.method625((byte) -50);
                class134.field1770.method2504(42, var1);
            }
        }
        class134.field1770.method2505(class372.field5433, 25778);
        if (class14.field173 != null || class462.field6819 > 0) {
            return;
        }
        int var2 = -1;
        if (class465.field6850 != null) {
            var2 = class465.field6850.method461(110);
        }
        if (arg0 <= 38) {
            return;
        }
        if (!class306.field4628) {
            if (class37.field451 >= 0) {
                var2 = class37.field451;
            }
            class37.field451 = -1;
            if (var2 == 0 && (class412.field6129 == 1 && class149.field2067 > 2 || class328.method2024(false))) {
                var2 = 2;
            }
            if (var2 == 2 && class149.field2067 > 0) {
                if (class465.field6850 == null) {
                    class115.method696(class455.field6755, class180.field2714, 1);
                } else {
                    class115.method696(class465.field6850.method465((byte) -100), class465.field6850.method467(9), 1);
                }
            }
            if (var2 == 0 && class149.field2067 > 0) {
                class435.method2671((byte) 118);
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var3 = class74.field1004.method505((byte) -104);
            int var4 = class74.field1004.method501(65);
            if ((class331.field4957 - 10) > var3 || class331.field4957 + class331.field4946 + 10 < var3 || var4 < class353.field5219 - 10 || class258.field3957 + class353.field5219 + 10 < var4) {
                class306.field4628 = false;
                class238.method1436(class331.field4957, class258.field3957, class331.field4946, class353.field5219, 21);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var5 = class331.field4957;
        int var6 = class353.field5219;
        int var7 = class331.field4946;
        int var8 = class465.field6850.method467(9);
        int var9 = class465.field6850.method465((byte) -119);
        int var10 = -1;
        for (int var11 = 0; var11 < class149.field2067; var11++) {
            if (class338.field5046) {
                int var16 = (class149.field2067 - var11 - 1) * 16 + var6 + 33;
                if (var8 > var5 && var5 + var7 > var8 && var9 > var16 - 13 && var16 + 4 > var9) {
                    var10 = var11;
                }
            } else {
                int var15 = (class149.field2067 - var11 - 1) * 16 + (var6 + 31);
                if (var8 > var5 && var8 < var5 + var7 && var9 > (var15 - 13) && (var15 + 3) > var9) {
                    var10 = var11;
                }
            }
        }
        if (var10 != -1) {
            int var12 = 0;
            class172 var13 = new class172(class372.field5433);
            for (class306 var14 = (class306) var13.method1064(1); var14 != null; var14 = (class306) var13.method1061(1)) {
                if (var10 == var12) {
                    class42.method245((byte) -108, var14);
                }
                var12++;
            }
        }
        class306.field4628 = false;
        class238.method1436(class331.field4957, class258.field3957, class331.field4946, class353.field5219, 98);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)V")
    public static final void method2194(byte arg0, int arg1) {
        class302.field4570.method1481(3, arg1);
        field5365++;
        if (arg0 != 15) {
            field5366 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)I")
    public static final int method2195(boolean arg0) {
        field5362++;
        if (arg0) {
            field5369 = null;
        }
        class241 var1 = class386.field5705;
        synchronized (class386.field5705) {
            return class386.field5705.method1478(0);
        }
    }
}
