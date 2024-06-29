import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class53 extends class128 {

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "Lod;")
    public static class29 field828 = null;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "C")
    private char field829;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "Ljava/lang/String;")
    public String field826;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "Z")
    public static boolean field824;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)V", line = 6)
    public static final void method477(byte arg0, int arg1) {
        field822++;
        int var2 = class291.field4664;
        if (arg1 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class205 var4;
            if (arg1 == 0) {
                var4 = class218.field3632;
            } else {
                var4 = class135.field2359[class119.field2064[var3]];
            }
            if (var4 != null && var4.method981((byte) -90)) {
                int var5 = var4.method987(3047);
                if (arg1 == 0 || arg1 == var5) {
                    if (var5 == 1) {
                        if ((var4.field2036 & 0x7F) == 64 && (var4.field1985 & 0x7F) == 64) {
                            int var12 = var4.field2036 >> 7;
                            int var13 = var4.field1985 >> 7;
                            if (var12 >= 0 && var12 < 104 && var13 >= 0 && var13 < 104) {
                                var10002 = class332.field5284[var12][var13]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field2036 & 0x7F) == 0 && (var4.field1985 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field2036 & 0x7F) == 64 && (var4.field1985 & 0x7F) == 64)) {
                        int var6 = var4.field2036 - (var5 * 64) >> 7;
                        int var7 = var4.field1985 - (var5 * 64) >> 7;
                        int var8 = var4.method987(3047) + var6;
                        if (var8 > 104) {
                            var8 = 104;
                        }
                        if (var6 < 0) {
                            var6 = 0;
                        }
                        int var9 = var7 + var4.method987(3047);
                        if (var7 < 0) {
                            var7 = 0;
                        }
                        if (var9 > 104) {
                            var9 = 104;
                        }
                        for (int var10 = var6; var10 < var8; var10++) {
                            for (int var11 = var7; var11 < var9; var11++) {
                                var10002 = class332.field5284[var10][var11]++;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 <= 28) {
            field833 = 48;
        }
        label226: for (int var14 = 0; var14 < var2; var14++) {
            long var15;
            class205 var17;
            if (arg1 == 0) {
                var15 = 8791798054912L;
                var17 = class218.field3632;
            } else {
                var15 = (long) class119.field2064[var14] << 32;
                var17 = class135.field2359[class119.field2064[var14]];
            }
            if (var17 != null && var17.method981((byte) -90)) {
                int var18 = var17.method987(3047);
                if (arg1 == 0 || arg1 == var18) {
                    var17.field1982 = true;
                    var17.field3501 = false;
                    if ((class291.field4666 && class291.field4664 > 200 || class291.field4664 > 50) && arg1 != 0 && var17.field2000 == var17.method980((byte) 73).field5521) {
                        var17.field3501 = true;
                    }
                    if (var18 == 1) {
                        if ((var17.field2036 & 0x7F) == 64 && (var17.field1985 & 0x7F) == 64) {
                            int var19 = var17.field2036 >> 7;
                            int var20 = var17.field1985 >> 7;
                            if (var19 < 0 || var19 >= 104 || var20 < 0 || var20 >= 104) {
                                continue;
                            }
                            if (class332.field5284[var19][var20] > 1) {
                                var10002 = class332.field5284[var19][var20]--;
                                continue;
                            }
                        }
                    } else if ((var18 & 0x1) == 0 && (var17.field2036 & 0x7F) == 0 && (var17.field1985 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var17.field2036 & 0x7F) == 64 && (var17.field1985 & 0x7F) == 0) {
                        int var21 = var17.field2036 - (var18 * 64) >> 7;
                        int var22 = var17.field1985 - var18 * 64 >> 7;
                        int var23 = var18 + var22;
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var23 > 104) {
                            var23 = 104;
                        }
                        boolean var24 = true;
                        int var25 = var18 + var21;
                        if (var25 > 104) {
                            var25 = 104;
                        }
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        for (int var26 = var21; var26 < var25; var26++) {
                            for (int var27 = var22; var27 < var23; var27++) {
                                if (class332.field5284[var26][var27] <= 1) {
                                    var24 = false;
                                    break;
                                }
                            }
                        }
                        if (var24) {
                            int var28 = var21;
                            while (true) {
                                if (var25 <= var28) {
                                    continue label226;
                                }
                                for (int var29 = var22; var29 < var23; var29++) {
                                    var10002 = class332.field5284[var28][var29]--;
                                }
                                var28++;
                            }
                        }
                    }
                    if (var17.field1936 == null || class181.field3045 < var17.field1949 || class181.field3045 >= var17.field1956) {
                        var17.field1982 = false;
                        var17.field2011 = class223.method1627((byte) -123, var17.field1985, var17.field2036, class205.field3497);
                        class243.method1702(class205.field3497, var17.field2036, var17.field1985, var17.field2011, (var18 - 1) * 64 + 60, var17, var17.field1946, var15, var17.field1984);
                    } else {
                        var17.field1982 = false;
                        var17.field3501 = false;
                        var17.field2011 = class223.method1627((byte) -123, var17.field1985, var17.field2036, class205.field3497);
                        class75.method700(class205.field3497, var17.field2036, var17.field1985, var17.field2011, var17, var17.field1946, var15, var17.field2014, var17.field1963, var17.field2021, var17.field2004);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBLpi;)V", line = 270)
    private final void method478(int arg0, byte arg1, class336 arg2) {
        field825++;
        if (arg0 == 1) {
            this.field829 = class99.method860((byte) 29, arg2.method2323(-112));
        } else if (arg0 == 2) {
            this.field832 = arg2.method2338((byte) 23);
        } else if (arg0 == 5) {
            this.field826 = arg2.method2365(104);
        }
        if (arg1 <= 39) {
            method477((byte) -46, 6);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILcg;)I", line = 299)
    public static final int method479(int arg0, class49 arg1) {
        if (arg0 < 93) {
            method484(61);
        }
        int var2 = 0;
        field820++;
        if (arg1.method432(class161.field2864, false)) {
            var2++;
        }
        if (arg1.method432(class33.field476, false)) {
            var2++;
        }
        if (arg1.method432(class298.field4754, false)) {
            var2++;
        }
        if (arg1.method432(class83.field1336, false)) {
            var2++;
        }
        if (arg1.method432(class143.field2615, false)) {
            var2++;
        }
        if (arg1.method432(class126.field2167, false)) {
            var2++;
        }
        if (arg1.method432(class317.field5035, false)) {
            var2++;
        }
        if (arg1.method432(class353.field5578, false)) {
            var2++;
        }
        if (arg1.method432(class38.field556, false)) {
            var2++;
        }
        if (arg1.method432(class21.field332, false)) {
            var2++;
        }
        if (arg1.method432(class221.field3692, false)) {
            var2++;
        }
        if (arg1.method432(class60.field937, false)) {
            var2++;
        }
        if (arg1.method432(class35.field495, false)) {
            var2++;
        }
        if (arg1.method432(class349.field5550, false)) {
            var2++;
        }
        if (arg1.method432(class102.field1646, false)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILpi;)V", line = 364)
    public final void method480(int arg0, class336 arg1) {
        field830++;
        if (arg0 != 63) {
            method484(-126);
        }
        while (true) {
            int var3 = arg1.method2364(-9069);
            if (var3 == 0) {
                return;
            }
            this.method478(var3, (byte) 106, arg1);
        }
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(Z)Z", line = 384)
    public final boolean method481(boolean arg0) {
        if (!arg0) {
            method477((byte) -48, -106);
        }
        field831++;
        return this.field829 == 's';
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V", line = 398)
    public static final void method482(int arg0) {
        field827++;
        class160.field2823.method470(arg0 ^ 0x3DB6);
        if (arg0 != 15802) {
            method483((byte) 44, (class336) null);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLpi;)Loa;", line = 418)
    public static final class313 method483(byte arg0, class336 arg1) {
        field821++;
        arg1.method2364(-9069);
        if (arg0 != 12) {
            field828 = (class29) null;
        }
        int var2 = arg1.method2364(-9069);
        class313 var3 = class254.method1767((byte) -93, var2);
        var3.field4963 = arg1.method2364(-9069);
        int var4 = arg1.method2364(arg0 - 9081);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method2364(-9069);
            var3.method185(var6, -17848, arg1);
        }
        var3.method182(arg0 ^ 0x64E5);
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V", line = 454)
    public static final void method484(int arg0) {
        field823++;
        int var1 = class100.field1618.length;
        int var2 = 0;
        if (arg0 != -105) {
            method483((byte) 4, (class336) null);
        }
        while (var2 < var1) {
            if (class100.field1618[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class38.field573; var4++) {
                    if (class84.field1351[var4] == class56.field866[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class84.field1351[class38.field573] = class56.field866[var2];
                    var3 = class38.field573++;
                }
                int var5 = 0;
                class336 var6 = new class336(class100.field1618[var2]);
                while (var6.field5353 < class100.field1618[var2].length && var5 < 511) {
                    int var7 = var3 | var5++ << 6;
                    int var8 = var6.method2339((byte) -46);
                    int var9 = var8 >> 14;
                    int var10 = var8 & 0x3F;
                    int var11 = var8 >> 7 & 0x3F;
                    int var12 = (class56.field866[var2] >> 8) * 64 + var11 - class24.field345;
                    int var13 = (class56.field866[var2] & 0xFF) * 64 + var10 - class34.field484;
                    class12 var14 = class224.method1637(var6.method2339((byte) -46), (byte) 123);
                    if (class320.field5071[var7] == null && (var14.field140 & 0x1) > 0 && class321.field5086 == var9 && var12 >= 0 && (var14.field202 + var12) < 104 && var13 >= 0 && (var14.field202 + var13) < 104) {
                        class320.field5071[var7] = new class278();
                        class278 var15 = class320.field5071[var7];
                        class33.field468[class191.field3200++] = var7;
                        var15.field2029 = class181.field3045;
                        var15.method1908(var14, 24717);
                        var15.method985(var15.field4413.field202, arg0 ^ 0xFFFFE8EF);
                        var15.field1951 = var15.field1946 = class114.field1923[var15.field4413.field180];
                        var15.field1962 = var15.field4413.field183;
                        var15.field1979 = var15.field4413.field178;
                        if (var15.field1979 == 0) {
                            var15.field1946 = 0;
                        }
                        var15.method989(true, (byte) -55, var13, var15.method987(arg0 ^ 0xFFFFF470), var12);
                    }
                }
            }
            var2++;
        }
    }
}
