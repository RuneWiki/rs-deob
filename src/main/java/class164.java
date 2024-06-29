import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class class164 {

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "[I")
    public static int[] field2670 = new int[100];

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Lsb;")
    public static class124 field2668;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public abstract void method919(int arg0);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)Lgl;")
    public static final class273 method1181(byte arg0, int arg1) {
        if (arg0 < 124) {
            return null;
        }
        field2671++;
        if (arg1 == 0) {
            return new class46();
        } else if (arg1 == 1) {
            return new class270();
        } else if (arg1 == 2) {
            return new class265();
        } else if (arg1 == 3) {
            return new class201();
        } else if (arg1 == 4) {
            return new class285();
        } else if (arg1 == 5) {
            return new class64();
        } else if (arg1 == 6) {
            return new class1();
        } else if (arg1 == 7) {
            return new class226();
        } else if (arg1 == 8) {
            return new class44();
        } else if (arg1 == 9) {
            return new class32();
        } else if (arg1 == 10) {
            return new class91();
        } else if (arg1 == 11) {
            return new class232();
        } else if (arg1 == 12) {
            return new class21();
        } else if (arg1 == 13) {
            return new class42();
        } else if (arg1 == 14) {
            return new class240();
        } else if (arg1 == 15) {
            return new class27();
        } else if (arg1 == 16) {
            return new class211();
        } else if (arg1 == 17) {
            return new class34();
        } else if (arg1 == 18) {
            return new class11();
        } else if (arg1 == 19) {
            return new class210();
        } else if (arg1 == 20) {
            return new class31();
        } else if (arg1 == 21) {
            return new class206();
        } else if (arg1 == 22) {
            return new class58();
        } else if (arg1 == 23) {
            return new class75();
        } else if (arg1 == 24) {
            return new class295();
        } else if (arg1 == 25) {
            return new class84();
        } else if (arg1 == 26) {
            return new class118();
        } else if (arg1 == 27) {
            return new class279();
        } else if (arg1 == 28) {
            return new class155();
        } else if (arg1 == 29) {
            return new class3();
        } else if (arg1 == 30) {
            return new class15();
        } else if (arg1 == 31) {
            return new class220();
        } else if (arg1 == 32) {
            return new class225();
        } else if (arg1 == 33) {
            return new class4();
        } else if (arg1 == 34) {
            return new class163();
        } else if (arg1 == 35) {
            return new class56();
        } else if (arg1 == 36) {
            return new class20();
        } else if (arg1 == 37) {
            return new class216();
        } else if (arg1 == 38) {
            return new class26();
        } else if (arg1 == 39) {
            return new class244();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static final void method1182(int arg0) {
        class52.field940 = -1;
        class198.field3226 = false;
        class18.field263 = 0;
        class87.field1405.field2231 = 0;
        class222.field3547 = 0;
        class151.field2474 = 0;
        class26.field461 = -1;
        class71.field1191 = 0;
        class143.field2360.field2231 = 0;
        class38.field649 = arg0;
        class59.field1020 = 0;
        class42.field776 = 0;
        field2667++;
        client.field4578 = -1;
        for (int var1 = 0; var1 < class191.field3129.length; var1++) {
            if (class191.field3129[var1] != null) {
                class191.field3129[var1].field2832 = -1;
            }
        }
        for (int var2 = 0; var2 < class3.field45.length; var2++) {
            if (class3.field45[var2] != null) {
                class3.field45[var2].field2832 = -1;
            }
        }
        class187.method1297((byte) -72);
        class184.field3033 = 1;
        class274.method1856(30, 5);
        for (int var3 = 0; var3 < 100; var3++) {
            class118.field1991[var3] = true;
        }
        client.method1921(125);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)I")
    public abstract int method921(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1183(byte[] arg0, int arg1) {
        if (arg1 != -843) {
            field2670 = null;
        }
        int var2 = arg0.length;
        field2666++;
        byte[] var3 = new byte[var2];
        class68.method529(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)J")
    public abstract long method920(int arg0);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BZLvc;)V")
    public static final void method1184(byte arg0, boolean arg1, class167 arg2) {
        field2669++;
        int var3 = arg2.field2756;
        int var4 = (int) arg2.field2406;
        if (arg0 != 66) {
            method1186((byte) -41);
        }
        arg2.method1074((byte) -123);
        if (arg1) {
            method1185(var3, -3);
        }
        class265.method1806((byte) -60, var3);
        class114 var5 = class8.method43(var4, (byte) -67);
        if (var5 != null) {
            class72.method556(0, var5);
        }
        int var6 = class42.field776;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class293.method1959(class94.field1468[var7], false)) {
                class245.method1626(var7, -12726);
            }
        }
        if (class42.field776 == 1) {
            class198.field3226 = false;
            class3.method19((byte) 95, class190.field3121, class267.field4274, class66.field1088, class224.field3569);
        } else {
            class3.method19((byte) 98, class190.field3121, class267.field4274, class66.field1088, class224.field3569);
            int var8 = class23.field362.method579(class139.field2332);
            for (int var9 = 0; var9 < class42.field776; var9++) {
                int var10 = class23.field362.method579(class55.method447(-105, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class66.field1088 = class42.field776 * 15 + (class38.field661 ? 26 : 22);
            class190.field3121 = var8 + 8;
        }
        if (class223.field3558 != -1) {
            class165.method1196(1, class223.field3558, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
    public static final void method1185(int arg0, int arg1) {
        field2665++;
        if (arg0 == -1 || !class285.field4548[arg0]) {
            return;
        }
        class71.field1183.method894(true, arg0);
        if (class128.field2119[arg0] == null) {
            return;
        }
        if (arg1 != -3) {
            method1183((byte[]) null, 73);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class128.field2119[arg0].length; var3++) {
            if (class128.field2119[arg0][var3] != null) {
                if (class128.field2119[arg0][var3].field1898 == 2) {
                    var2 = false;
                } else {
                    class128.field2119[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class128.field2119[arg0] = null;
        }
        class285.field4548[arg0] = false;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public static void method1186(byte arg0) {
        field2668 = null;
        field2670 = null;
        if (arg0 != 19) {
            field2668 = null;
        }
    }
}
