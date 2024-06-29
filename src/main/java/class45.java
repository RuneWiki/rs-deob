import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class45 {

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field866 = 0;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "[I")
    public static int[] field867 = new int[99];

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lob;")
    public static class141 field865 = class175.method1195(40, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lob;")
    public static class141 field863 = class175.method1195(40, "::rect_debug");

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field869 = 0;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Lob;")
    public static class141 field871;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Lob;")
    public static class141 field872;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Lja;")
    public static class90 field873;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lra;BII)V")
    public static final void method299(class170 arg0, byte arg1, int arg2, int arg3) {
        if (arg0.field3386 == 1) {
            class65.method430(class111.field2128, arg0.field3384, 0, (short) 39, 0L, 0, arg0.field3396);
            class19.field337++;
        }
        field870++;
        if (arg0.field3386 == 2 && !class61.field1194) {
            class141 var4 = class41.method270((byte) -11, arg0);
            if (var4 != null) {
                class39.field781++;
                class65.method430(class220.method1422(new class141[] { class197.field3762, arg0.field3341 }, -3), var4, 0, (short) 36, 0L, -1, arg0.field3396);
            }
        }
        if (arg0.field3386 == 3) {
            class65.method430(class111.field2128, class61.field1204, 0, (short) 12, 0L, 0, arg0.field3396);
            class195.field3730++;
        }
        if (arg0.field3386 == 4) {
            class65.method430(class111.field2128, arg0.field3384, 0, (short) 50, 0L, 0, arg0.field3396);
            class162.field3141++;
        }
        if (arg0.field3386 == 5) {
            class65.method430(class111.field2128, arg0.field3384, 0, (short) 25, 0L, 0, arg0.field3396);
            class151.field2902++;
        }
        int var5 = 111 % ((55 - arg1) / 63);
        if (arg0.field3386 == 6 && class181.field3555 == null) {
            class150.field2898++;
            class65.method430(class111.field2128, arg0.field3384, 0, (short) 35, 0L, -1, arg0.field3396);
        }
        if (arg0.field3392 == 2) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.field3284; var7++) {
                for (int var8 = 0; var8 < arg0.field3299; var8++) {
                    int var9 = (arg0.field3321 + 32) * var7;
                    int var10 = (arg0.field3340 + 32) * var8;
                    if (var6 < 20) {
                        var9 += arg0.field3265[var6];
                        var10 += arg0.field3274[var6];
                    }
                    if (var10 <= arg3 && var9 <= arg2 && var10 + 32 > arg3 && arg2 < var9 + 32) {
                        class218.field4139 = var6;
                        class82.field1637 = arg0;
                        if (arg0.field3385[var6] > 0) {
                            class50 var11 = class96.method645((byte) -61, arg0.field3385[var6] - 1);
                            if (class29.field568 == 1 && class76.method531(70, class26.method180(arg0, 18125))) {
                                if (class16.field285 != arg0.field3396 || class6.field71 != var6) {
                                    class65.method430(class220.method1422(new class141[] { class179.field3522, class215.field4102, var11.field937 }, -3), class59.field1150, 0, (short) 21, (long) var11.field957, var6, arg0.field3396);
                                    class216.field4113++;
                                }
                            } else if (!class61.field1194 || !class76.method531(67, class26.method180(arg0, 18125))) {
                                class78.field1580++;
                                class141[] var12 = var11.field952;
                                if (class72.field1446) {
                                    var12 = class195.method1316(true, var12);
                                }
                                if (class76.method531(81, class26.method180(arg0, 18125))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var12 != null && var12[var13] != null) {
                                            class10.field207++;
                                            byte var14;
                                            if (var13 == 3) {
                                                var14 = 28;
                                            } else {
                                                var14 = 58;
                                            }
                                            class65.method430(class220.method1422(new class141[] { class114.field2185, var11.field937 }, -3), var12[var13], 0, var14, (long) var11.field957, var6, arg0.field3396);
                                        } else if (var13 == 4) {
                                            class21.field352++;
                                            class65.method430(class220.method1422(new class141[] { class114.field2185, var11.field937 }, -3), class190.field3672, 0, (short) 58, (long) var11.field957, var6, arg0.field3396);
                                        }
                                    }
                                }
                                if (class8.method56(class26.method180(arg0, 18125), 4)) {
                                    class65.method430(class220.method1422(new class141[] { class114.field2185, var11.field937 }, -3), class59.field1150, 0, (short) 3, (long) var11.field957, var6, arg0.field3396);
                                    client.field599++;
                                }
                                if (class76.method531(94, class26.method180(arg0, 18125)) && var12 != null) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var12[var15] != null) {
                                            class85.field1694++;
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 10;
                                            }
                                            if (var15 == 1) {
                                                var16 = 31;
                                            }
                                            if (var15 == 2) {
                                                var16 = 1;
                                            }
                                            class65.method430(class220.method1422(new class141[] { class114.field2185, var11.field937 }, -3), var12[var15], 0, var16, (long) var11.field957, var6, arg0.field3396);
                                        }
                                    }
                                }
                                class141[] var17 = arg0.field3375;
                                if (class72.field1446) {
                                    var17 = class195.method1316(true, var17);
                                }
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; var18--) {
                                        if (var17[var18] != null) {
                                            class173.field3433++;
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 49;
                                            }
                                            if (var18 == 1) {
                                                var19 = 7;
                                            }
                                            if (var18 == 2) {
                                                var19 = 8;
                                            }
                                            if (var18 == 3) {
                                                var19 = 33;
                                            }
                                            if (var18 == 4) {
                                                var19 = 4;
                                            }
                                            class65.method430(class220.method1422(new class141[] { class114.field2185, var11.field937 }, -3), var17[var18], 0, var19, (long) var11.field957, var6, arg0.field3396);
                                        }
                                    }
                                }
                                class65.method430(class220.method1422(new class141[] { class114.field2185, var11.field937 }, -3), class96.field1896, 0, (short) 1001, (long) var11.field957, var6, arg0.field3396);
                            } else if ((class111.field2155 & 0x10) == 16) {
                                class70.field1412++;
                                class65.method430(class220.method1422(new class141[] { class185.field3607, class215.field4102, var11.field937 }, -3), class4.field45, 0, (short) 20, (long) var11.field957, var6, arg0.field3396);
                            }
                        }
                    }
                    var6++;
                }
            }
        }
        if (!arg0.field3305) {
            return;
        }
        if (!class61.field1194) {
            for (int var20 = 9; var20 >= 5; var20--) {
                class141 var24 = class18.method109(var20, true, arg0);
                if (var24 != null) {
                    class65.method430(arg0.field3352, var24, 0, (short) 1003, (long) (var20 + 1), arg0.field3357, arg0.field3396);
                    class42.field822++;
                }
            }
            class141 var21 = class41.method270((byte) -11, arg0);
            if (var21 != null) {
                class65.method430(arg0.field3352, var21, 0, (short) 36, 0L, arg0.field3357, arg0.field3396);
                class39.field781++;
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class141 var23 = class18.method109(var22, true, arg0);
                if (var23 != null) {
                    class42.field822++;
                    class65.method430(arg0.field3352, var23, 0, (short) 15, (long) (var22 + 1), arg0.field3357, arg0.field3396);
                }
            }
            if (!class156.method1087(class26.method180(arg0, 18125), (byte) 42)) {
                return;
            }
            class65.method430(class111.field2128, class103.field2003, 0, (short) 35, 0L, arg0.field3357, arg0.field3396);
            class150.field2898++;
        } else if (class142.method940(class26.method180(arg0, 18125), 10) && (class111.field2155 & 0x20) == 32) {
            class170.field3371++;
            class65.method430(class220.method1422(new class141[] { class185.field3607, class115.field2201, arg0.field3352 }, -3), class4.field45, 0, (short) 22, 0L, arg0.field3357, arg0.field3396);
            return;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method300(int arg0) {
        if (arg0 != -24701) {
            method301(-59, 23, -70);
        }
        field867 = null;
        field873 = null;
        field863 = null;
        field865 = null;
        field871 = null;
        field872 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
    public static final void method301(int arg0, int arg1, int arg2) {
        if (arg2 > -57) {
            field869 = -110;
        }
        if (class117.field2272 != arg0) {
            class15.field272 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class15.field272[var3] = (var3 << 12) / arg0;
            }
            class117.field2272 = arg0;
            class106.field2030 = arg0 - 1;
            class163.field3151 = arg0 == 64 ? 2048 : 4096;
        }
        if (class60.field1174 != arg1) {
            if (class60.field1174 == class117.field2272) {
                class177.field3503 = class15.field272;
            } else {
                class177.field3503 = new int[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    class177.field3503[var4] = (var4 << 12) / arg1;
                }
            }
            class54.field1050 = arg1 - 1;
            class60.field1174 = arg1;
        }
        field868++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lud;BI)V")
    public static final void method302(class203 arg0, byte arg1, int arg2) {
        class124.method800(arg2, arg0.field3854, arg0.field3889, (byte) -25);
        if (arg1 == -8) {
            field864++;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field867[var1] = var0 / 4;
        }
        field871 = class175.method1195(40, "Fehler beim Laden Ihres Spielcharakters)3");
        field872 = class175.method1195(40, " ");
    }
}
