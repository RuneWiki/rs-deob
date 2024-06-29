import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class34 extends class60 {

    @OriginalMember(owner = "client!va", name = "w", descriptor = "Lub;")
    public static class227 field556 = class257.method1749("runes", 17263);

    @OriginalMember(owner = "client!va", name = "E", descriptor = "Lub;")
    private static class227 field564 = class257.method1749("Jul", 17263);

    @OriginalMember(owner = "client!va", name = "D", descriptor = "Lub;")
    private static class227 field563 = class257.method1749("Sep", 17263);

    @OriginalMember(owner = "client!va", name = "z", descriptor = "Lub;")
    private static class227 field559 = class257.method1749("Aug", 17263);

    @OriginalMember(owner = "client!va", name = "H", descriptor = "Lub;")
    private static class227 field567 = class257.method1749("Oct", 17263);

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Lub;")
    private static class227 field571 = class257.method1749("Jun", 17263);

    @OriginalMember(owner = "client!va", name = "B", descriptor = "Lub;")
    private static class227 field561 = class257.method1749("Mar", 17263);

    @OriginalMember(owner = "client!va", name = "T", descriptor = "Lub;")
    private static class227 field579 = class257.method1749("Nov", 17263);

    @OriginalMember(owner = "client!va", name = "F", descriptor = "Lub;")
    public static class227 field565 = class257.method1749("Sprites geladen)3", 17263);

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "Lub;")
    private static class227 field586 = class257.method1749("May", 17263);

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "[I")
    public static int[] field585 = new int[50];

    @OriginalMember(owner = "client!va", name = "y", descriptor = "Lub;")
    private static class227 field558 = class257.method1749("Apr", 17263);

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "Lub;")
    public static class227 field587 = class257.method1749("Nehmen", 17263);

    @OriginalMember(owner = "client!va", name = "O", descriptor = "Lub;")
    private static class227 field574 = class257.method1749("Dec", 17263);

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "Lub;")
    private static class227 field588 = class257.method1749("Feb", 17263);

    @OriginalMember(owner = "client!va", name = "P", descriptor = "Lub;")
    private static class227 field575 = class257.method1749("Jan", 17263);

    @OriginalMember(owner = "client!va", name = "x", descriptor = "[Lub;")
    public static class227[] field557 = new class227[] { field575, field588, field561, field558, field586, field571, field564, field559, field563, field567, field579, field574 };

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public int field569;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "Lta;")
    public class105 field582;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "Lta;")
    public class105 field583;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "La;")
    public static class20 field581;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "Lnf;")
    public static class213 field584;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "Lub;")
    public class227 field562;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "Z")
    public boolean field573;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "[Ljava/lang/Object;")
    public Object[] field568;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(BI)I")
    public static final int method177(byte arg0, int arg1) {
        field560++;
        int var2 = -107 % ((3 - arg0) / 51);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)Z")
    public static final boolean method178(boolean arg0) {
        if (!arg0) {
            method179(1);
        }
        field566++;
        return class67.field1216;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)Lc;")
    public static final class122 method179(int arg0) {
        if (arg0 != 0) {
            field574 = null;
        }
        field572++;
        try {
            return (class122) Class.forName("pg").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class100();
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
    public static void method180(int arg0) {
        field586 = null;
        field558 = null;
        field574 = null;
        field561 = null;
        field565 = null;
        field556 = null;
        field571 = null;
        field579 = null;
        field581 = null;
        field575 = null;
        field567 = null;
        field585 = null;
        field588 = null;
        field557 = null;
        field564 = null;
        field584 = null;
        if (arg0 >= -13) {
            method179(37);
        }
        field563 = null;
        field559 = null;
        field587 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI[[[Lck;II)V")
    public static final void method181(boolean arg0, int arg1, class108[][][] arg2, int arg3, int arg4) {
        if (arg0) {
            method181(true, -46, (class108[][][]) null, 57, -96);
        }
        field577++;
        byte var5 = (byte) (class87.field1508 & 0xFF);
        if (class130.field2280[class64.field1171][arg4][arg1] == var5) {
            return;
        }
        byte var6 = 0;
        class40.field659[var6] = arg4;
        int var30 = var6 + 1;
        class120.field2188[var6] = arg1;
        class130.field2280[class64.field1171][arg4][arg1] = var5;
        int var7 = 0;
        while (var30 != var7) {
            int var8 = class40.field659[var7] & 0xFFFF;
            int var9 = (class40.field659[var7] & 0xFF3AAA) >> 16;
            int var10 = class120.field2188[var7] & 0xFFFF;
            int var11 = class40.field659[var7] >> 24 & 0xFF;
            boolean var12 = false;
            if ((class40.field654[class64.field1171][var8][var10] & 0x4) == 0) {
                var12 = true;
            }
            int var13 = (class120.field2188[var7] & 0xFF54F1) >> 16;
            var7 = var7 + 1 & 0xFFF;
            boolean var14 = false;
            label220: for (int var15 = class64.field1171 + 1; var15 <= 3; var15++) {
                if ((class40.field654[var15][var8][var10] & 0x8) == 0) {
                    if (var12 && arg2[var15][var8][var10] != null) {
                        if (arg2[var15][var8][var10].field2024 != null) {
                            int var18 = class161.method988((byte) 36, var9);
                            if (arg2[var15][var8][var10].field2024.field878 == var18 || arg2[var15][var8][var10].field2024.field883 == var18) {
                                continue;
                            }
                            if (var11 != 0) {
                                int var19 = class161.method988((byte) 36, var11);
                                if (arg2[var15][var8][var10].field2024.field878 == var19 || arg2[var15][var8][var10].field2024.field883 == var19) {
                                    continue;
                                }
                            }
                            if (var13 != 0) {
                                int var20 = class161.method988((byte) 36, var13);
                                if (arg2[var15][var8][var10].field2024.field878 == var20 || arg2[var15][var8][var10].field2024.field883 == var20) {
                                    continue;
                                }
                            }
                        }
                        if (arg2[var15][var8][var10].field2021 != null) {
                            for (int var21 = 0; var21 < arg2[var15][var8][var10].field2012; var21++) {
                                int var22 = (int) (arg2[var15][var8][var10].field2021[var21].field4029 >> 14 & 0x3FL);
                                if (var22 == 21) {
                                    var22 = 19;
                                }
                                int var23 = (int) (arg2[var15][var8][var10].field2021[var21].field4029 >> 20 & 0x3L);
                                int var24 = var23 << 6 | var22;
                                if (var9 == var24 || var11 != 0 && var11 == var24 || var13 != 0 && var13 == var24) {
                                    continue label220;
                                }
                            }
                        }
                    }
                    var14 = true;
                    class108 var25 = arg2[var15][var8][var10];
                    if (var25 != null && var25.field2012 > 0) {
                        for (int var26 = 0; var26 < var25.field2012; var26++) {
                            class230 var27 = var25.field2021[var26];
                            if (var27.field4032 != var27.field4020 || var27.field4025 != var27.field4015) {
                                for (int var28 = var27.field4032; var28 <= var27.field4020; var28++) {
                                    for (int var29 = var27.field4025; var29 <= var27.field4015; var29++) {
                                        class130.field2280[var15][var28][var29] = var5;
                                    }
                                }
                            }
                        }
                    }
                    class130.field2280[var15][var8][var10] = var5;
                }
            }
            if (var14) {
                if (class98.field1717[class64.field1171 + 1][var8][var10] > class190.field3227[arg3]) {
                    class190.field3227[arg3] = class98.field1717[class64.field1171 + 1][var8][var10];
                }
                int var16 = var10 << 7;
                int var17 = var8 << 7;
                if (var17 < class87.field1511[arg3]) {
                    class87.field1511[arg3] = var17;
                } else if (var17 > class211.field3571[arg3]) {
                    class211.field3571[arg3] = var17;
                }
                if (class33.field534[arg3] > var16) {
                    class33.field534[arg3] = var16;
                } else if (var16 > class144.field2485[arg3]) {
                    class144.field2485[arg3] = var16;
                }
            }
            if (!var12) {
                if (var8 >= 1 && class130.field2280[class64.field1171][var8 - 1][var10] != var5) {
                    class40.field659[var30] = class246.method1640(class246.method1640(var8 - 1, 1179648), -754974720);
                    class120.field2188[var30] = class246.method1640(var10, 1245184);
                    var30 = var30 + 1 & 0xFFF;
                    class130.field2280[class64.field1171][var8 - 1][var10] = var5;
                }
                var10++;
                if (var10 < 104) {
                    if (var8 - 1 >= 0 && class130.field2280[class64.field1171][var8 - 1][var10] != var5 && (class40.field654[class64.field1171][var8][var10] & 0x4) == 0 && (class40.field654[class64.field1171][var8 - 1][var10 - 1] & 0x4) == 0) {
                        class40.field659[var30] = class246.method1640(class246.method1640(1179648, var8 - 1), 1375731712);
                        class120.field2188[var30] = class246.method1640(var10, 1245184);
                        var30 = var30 + 1 & 0xFFF;
                        class130.field2280[class64.field1171][var8 - 1][var10] = var5;
                    }
                    if (class130.field2280[class64.field1171][var8][var10] != var5) {
                        class40.field659[var30] = class246.method1640(318767104, class246.method1640(5373952, var8));
                        class120.field2188[var30] = class246.method1640(var10, 5439488);
                        var30 = var30 + 1 & 0xFFF;
                        class130.field2280[class64.field1171][var8][var10] = var5;
                    }
                    if (var8 + 1 < 104 && class130.field2280[class64.field1171][var8 + 1][var10] != var5 && (class40.field654[class64.field1171][var8][var10] & 0x4) == 0 && (class40.field654[class64.field1171][var8 + 1][var10 - 1] & 0x4) == 0) {
                        class40.field659[var30] = class246.method1640(-1845493760, class246.method1640(var8 + 1, 5373952));
                        class120.field2188[var30] = class246.method1640(var10, 5439488);
                        var30 = var30 + 1 & 0xFFF;
                        class130.field2280[class64.field1171][var8 + 1][var10] = var5;
                    }
                }
                var10--;
                if (var8 + 1 < 104 && class130.field2280[class64.field1171][var8 + 1][var10] != var5) {
                    class40.field659[var30] = class246.method1640(class246.method1640(var8 + 1, 9568256), 1392508928);
                    class120.field2188[var30] = class246.method1640(var10, 9633792);
                    var30 = var30 + 1 & 0xFFF;
                    class130.field2280[class64.field1171][var8 + 1][var10] = var5;
                }
                var10--;
                if (var10 >= 0) {
                    if (var8 - 1 >= 0 && class130.field2280[class64.field1171][var8 - 1][var10] != var5 && (class40.field654[class64.field1171][var8][var10] & 0x4) == 0 && (class40.field654[class64.field1171][var8 - 1][var10 + 1] & 0x4) == 0) {
                        class40.field659[var30] = class246.method1640(301989888, class246.method1640(13762560, var8 - 1));
                        class120.field2188[var30] = class246.method1640(var10, 13828096);
                        var30 = var30 + 1 & 0xFFF;
                        class130.field2280[class64.field1171][var8 - 1][var10] = var5;
                    }
                    if (class130.field2280[class64.field1171][var8][var10] != var5) {
                        class40.field659[var30] = class246.method1640(-1828716544, class246.method1640(13762560, var8));
                        class120.field2188[var30] = class246.method1640(var10, 13828096);
                        class130.field2280[class64.field1171][var8][var10] = var5;
                        var30 = var30 + 1 & 0xFFF;
                    }
                    if ((var8 + 1) < 104 && class130.field2280[class64.field1171][var8 + 1][var10] != var5 && (class40.field654[class64.field1171][var8][var10] & 0x4) == 0 && (class40.field654[class64.field1171][var8 + 1][var10 + 1] & 0x4) == 0) {
                        class40.field659[var30] = class246.method1640(-771751936, class246.method1640(9568256, var8 + 1));
                        class120.field2188[var30] = class246.method1640(var10, 9633792);
                        var30 = var30 + 1 & 0xFFF;
                        class130.field2280[class64.field1171][var8 + 1][var10] = var5;
                    }
                }
            }
        }
        if (class190.field3227[arg3] == -1000000) {
            return;
        }
        class190.field3227[arg3] += 10;
        class87.field1511[arg3] -= 50;
        class211.field3571[arg3] += 50;
        class144.field2485[arg3] += 50;
        class33.field534[arg3] -= 50;
    }
}
