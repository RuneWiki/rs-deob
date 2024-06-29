import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class116 extends class22 {

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "Lac;")
    public class4 field2631 = new class4();

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "Llb;")
    public class78 field2633 = new class78();

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "Lub;")
    private class141 field2624;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "Lje;")
    private static class67 field2612 = class85.method592(255, "glow2:");

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "Lje;")
    public static class67 field2626 = class85.method592(255, "");

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "Lje;")
    public static class67 field2610 = field2612;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "[I")
    public static int[] field2629 = new int[5];

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "[I")
    public static int[] field2628 = new int[5];

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public static int field2621 = 0;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "Lje;")
    public static class67 field2632 = field2612;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "Loe;")
    public static class102 field2625;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "Lqb;")
    public static class113 field2620;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "[S")
    public static short[] field2613;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "[[B")
    public static byte[][] field2616;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Llc;B)V")
    public static final void method932(class79 arg0, byte arg1) {
        field2630++;
        if (class75.field1620) {
            class44.method281(-80, arg0);
            return;
        }
        if (class84.field1855 == 1 && class50.field961 >= 715 && class126.field2773 >= 453) {
            class134.field3016 = !class134.field3016;
            if (class134.field3016) {
                class64.method434(true);
            } else {
                class158.method1215(127, 255, class27.field494, class106.field2422, false, class76.field1640);
            }
        }
        if (class128.field2823 == 5) {
            return;
        }
        if (arg1 >= -17) {
            method935((byte) -100);
        }
        class123.field2741++;
        if (class128.field2823 != 10) {
            return;
        }
        if (class3.field44 != 2 && class23.field415 == 0) {
            if (class84.field1855 == 1) {
                byte var2 = 5;
                short var3 = 463;
                byte var4 = 100;
                byte var5 = 35;
                if (class50.field961 >= var2 && class50.field961 <= var2 + var4 && class126.field2773 >= var3 && var3 + var5 >= class126.field2773) {
                    class117.method939(0);
                    return;
                }
            }
            if (class85.field1876 != null) {
                class117.method939(0);
            }
        }
        int var6 = class84.field1855;
        int var7 = class50.field961;
        int var8 = class126.field2773;
        if (class142.field3265 == 0) {
            short var9 = 291;
            short var10 = 302;
            if (var6 == 1 && var7 >= var10 - 75 && var7 <= var10 + 75 && var9 - 20 <= var8 && var8 <= var9 + 20) {
                class142.field3265 = 3;
                class135.field3065 = 0;
            }
            short var11 = 462;
            if (var6 == 1 && var7 >= var11 - 75 && var11 + 75 >= var7 && var8 >= var9 - 20 && var9 + 20 >= var8) {
                class135.field3065 = 0;
                class142.field3265 = 2;
                class106.field2412 = class9.field158;
                class106.field2423 = class9.field199;
                class106.field2414 = class55.field1090;
            }
        } else if (class142.field3265 == 2) {
            short var12 = 321;
            short var13 = 302;
            short var14 = 231;
            int var20 = var14 + 30;
            if (var6 == 1 && var20 - 15 <= var8 && var20 > var8) {
                class135.field3065 = 0;
            }
            var20 += 15;
            if (var6 == 1 && var8 >= var20 - 15 && var8 < var20) {
                class135.field3065 = 1;
            }
            var20 += 15;
            if (var6 == 1 && var7 >= var13 - 75 && var13 + 75 >= var7 && var12 - 20 <= var8 && var8 <= var12 + 20) {
                class106.field2413 = class106.field2413.method484((byte) 113).method460(125);
                if (class106.field2413.method445(false) == 0) {
                    class68.method501(class135.field3064, class9.field171, class9.field170, (byte) -95);
                } else if (class106.field2416.method445(false) == 0) {
                    class68.method501(class84.field1868, class9.field160, class9.field189, (byte) -77);
                } else {
                    class68.method501(class148.field3400, class9.field201, class9.field168, (byte) -83);
                    class27.method181(20, -105);
                }
            } else {
                short var15 = 462;
                if (var6 == 1 && var7 >= var15 - 75 && var7 <= var15 + 75 && var12 - 20 <= var8 && var8 <= var12 + 20) {
                    class106.field2416 = class106.field2422;
                    class106.field2413 = class106.field2422;
                    class142.field3265 = 0;
                }
                while (true) {
                    while (class127.method976(-14101)) {
                        boolean var16 = false;
                        for (int var17 = 0; class34.field619.method445(false) > var17; var17++) {
                            if (class59.field1187 == class34.field619.method477(var17, (byte) 123)) {
                                var16 = true;
                                break;
                            }
                        }
                        if (class135.field3065 == 0) {
                            if (class72.field1554 == 85 && class106.field2413.method445(false) > 0) {
                                class106.field2413 = class106.field2413.method448(0, class106.field2413.method445(false) - 1, -127);
                            }
                            if (class72.field1554 == 84 || class72.field1554 == 80) {
                                class135.field3065 = 1;
                            }
                            if (var16 && class106.field2413.method445(false) < 12) {
                                class106.field2413 = class106.field2413.method478(false, class59.field1187);
                            }
                        } else if (class135.field3065 == 1) {
                            if (class72.field1554 == 85 && class106.field2416.method445(false) > 0) {
                                class106.field2416 = class106.field2416.method448(0, class106.field2416.method445(false) - 1, -122);
                            }
                            if (class72.field1554 == 84 || class72.field1554 == 80) {
                                class135.field3065 = 0;
                            }
                            if (class41.field769 == 2 && class72.field1554 == 84) {
                                class106.field2413 = class106.field2413.method484((byte) 113).method460(94);
                                if (class106.field2413.method445(false) == 0) {
                                    class68.method501(class135.field3064, class9.field171, class9.field170, (byte) -60);
                                    return;
                                }
                                if (class106.field2416.method445(false) == 0) {
                                    class68.method501(class84.field1868, class9.field160, class9.field189, (byte) -4);
                                    return;
                                }
                                class68.method501(class148.field3400, class9.field201, class9.field168, (byte) -76);
                                class27.method181(20, -116);
                                return;
                            }
                            if (var16 && class106.field2416.method445(false) < 20) {
                                class106.field2416 = class106.field2416.method478(false, class59.field1187);
                            }
                        }
                    }
                    return;
                }
            }
        } else if (class142.field3265 == 3) {
            short var18 = 321;
            short var19 = 382;
            if (var6 == 1 && var19 - 75 <= var7 && var7 <= var19 + 75 && var8 >= var18 - 20 && var18 + 20 >= var8) {
                class142.field3265 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()Ld;")
    public final class22 method153() {
        field2615++;
        class142 var1;
        do {
            var1 = (class142) this.field2631.method18((byte) -128);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3243 == null);
        return var1.field3243;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILuc;)V")
    private final void method933(int arg0, int arg1, class142 arg2) {
        if ((this.field2624.field3168[arg2.field3270] & 0x4) != 0 && arg2.field3251 < 0) {
            int var4 = this.field2624.field3192[arg2.field3270] / class84.field1873;
            int var5 = (var4 + 1048575 - arg2.field3280) / var4;
            arg2.field3280 = arg0 * var4 + arg2.field3280 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field2624.field3180[arg2.field3270] == 0) {
                    arg2.field3243 = class94.method698(arg2.field3248, arg2.field3243.method702(), arg2.field3243.method723(), arg2.field3243.method724());
                } else {
                    arg2.field3243 = class94.method698(arg2.field3248, arg2.field3243.method702(), 0, arg2.field3243.method724());
                    this.field2624.method1070(-16257, arg2, arg2.field3258.field552[arg2.field3245] < 0);
                }
                if (arg2.field3258.field552[arg2.field3245] < 0) {
                    arg2.field3243.method730(-1);
                }
                arg0 = arg2.field3280 / var4;
            }
        }
        arg2.field3243.method158(arg0);
        if (arg1 != 24856) {
            this.method156(null, -89, -14);
        }
        field2617++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILuc;[IIII)V")
    private final void method934(int arg0, class142 arg1, int[] arg2, int arg3, int arg4, int arg5) {
        if (~(this.field2624.field3168[arg1.field3270] & 0x4) != arg0 && arg1.field3251 < 0) {
            int var7 = this.field2624.field3192[arg1.field3270] / class84.field1873;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field3280) / var7;
                if (var8 > arg4) {
                    arg1.field3280 += arg4 * var7;
                    break;
                }
                arg4 -= var8;
                arg1.field3243.method156(arg2, arg3, var8);
                class94 var9 = arg1.field3243;
                arg1.field3280 += var7 * var8 - 1048576;
                arg3 += var8;
                int var10 = class84.field1873 / 100;
                int var11 = 262144 / var7;
                if (var11 < var10) {
                    var10 = var11;
                }
                if (this.field2624.field3180[arg1.field3270] == 0) {
                    arg1.field3243 = class94.method698(arg1.field3248, var9.method702(), var9.method723(), var9.method724());
                } else {
                    arg1.field3243 = class94.method698(arg1.field3248, var9.method702(), 0, var9.method724());
                    this.field2624.method1070(-16257, arg1, arg1.field3258.field552[arg1.field3245] < 0);
                    arg1.field3243.method711(var10, var9.method723());
                }
                if (arg1.field3258.field552[arg1.field3245] < 0) {
                    arg1.field3243.method730(-1);
                }
                var9.method704(var10);
                var9.method156(arg2, arg3, arg5 - arg3);
                if (var9.method700()) {
                    this.field2633.method554(var9);
                }
            }
        }
        field2619++;
        arg1.field3243.method156(arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
    public static void method935(byte arg0) {
        field2626 = null;
        field2613 = null;
        field2616 = null;
        field2629 = null;
        field2612 = null;
        if (arg0 != -17) {
            return;
        }
        field2625 = null;
        field2628 = null;
        field2610 = null;
        field2632 = null;
        field2620 = null;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "()Ld;")
    public final class22 method159() {
        field2614++;
        class142 var1 = (class142) this.field2631.method26((byte) 99);
        if (var1 == null) {
            return null;
        } else if (var1.field3243 == null) {
            return this.method153();
        } else {
            return var1.field3243;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "()I")
    public final int method154() {
        field2618++;
        return 0;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "([III)V")
    public final void method156(int[] arg0, int arg1, int arg2) {
        this.field2633.method156(arg0, arg1, arg2);
        field2623++;
        for (class142 var4 = (class142) this.field2631.method26((byte) -66); var4 != null; var4 = (class142) this.field2631.method18((byte) -128)) {
            if (!this.field2624.method1077(0, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field3259 >= var5) {
                        this.method934(-1, var4, arg0, var6, var5, var5 + var6);
                        var4.field3259 -= var5;
                        break;
                    }
                    this.method934(-1, var4, arg0, var6, var4.field3259, var5 + var6);
                    var5 -= var4.field3259;
                    var6 += var4.field3259;
                } while (!this.field2624.method1074(arg0, (byte) 99, var5, var6, var4));
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public final void method158(int arg0) {
        this.field2633.method158(arg0);
        field2627++;
        for (class142 var2 = (class142) this.field2631.method26((byte) -75); var2 != null; var2 = (class142) this.field2631.method18((byte) -128)) {
            if (!this.field2624.method1077(0, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3259) {
                        this.method933(var3, 24856, var2);
                        var2.field3259 -= var3;
                        break;
                    }
                    this.method933(var2.field3259, 24856, var2);
                    var3 -= var2.field3259;
                } while (!this.field2624.method1074(null, (byte) 82, var3, 0, var2));
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLfd;ILfd;)V")
    public static final void method936(boolean arg0, class40 arg1, int arg2, class40 arg3) {
        if (arg2 == 2) {
            field2611++;
            class115.field2596 = arg3;
            class85.field1895 = arg1;
            class45.field835 = arg0;
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lub;)V")
    public class116(class141 arg0) {
        this.field2624 = arg0;
    }
}
