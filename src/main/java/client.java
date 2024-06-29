import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class147 {

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field2314 = -1;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "Llf;")
    public static class211 field2315 = new class211(260);

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "[I")
    public static int[] field2330 = new int[500];

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
    public static int[] field2332 = new int[14];

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Ldl;")
    public static class123 field2331;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "[Lek;")
    public static class164[] field2329;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lef;)Lef;")
    public static final class214 method1032(class214 arg0) {
        int var1 = method1038(arg0).method485(-120);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class206.method1403((byte) 7, arg0.field3477);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)V")
    public static final void method1033(int arg0, int arg1, int arg2) {
        field2324++;
        class287 var3 = class261.method1786(arg0, false, 12);
        var3.method1914((byte) 46);
        if (arg1 != 0) {
            method1035(-37, 90L);
        }
        var3.field4547 = arg2;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class268.method1824(124, "argument count");
            }
            class231.field3718 = Integer.parseInt(arg0[0]);
            class184.field2892 = 2;
            if (arg0[1].equals("live")) {
                class165.field2562 = 0;
            } else if (arg0[1].equals("rc")) {
                class165.field2562 = 1;
            } else if (arg0[1].equals("wip")) {
                class165.field2562 = 2;
            } else {
                class268.method1824(118, "modewhat");
            }
            class236.field3776 = false;
            class48.field614 = class105.method691(arg0[2], (byte) -55);
            if (class48.field614 == -1) {
                if (arg0[2].equals("english")) {
                    class48.field614 = 0;
                } else if (arg0[2].equals("german")) {
                    class48.field614 = 1;
                } else {
                    class268.method1824(113, "language");
                }
            }
            class190.method1330(class48.field614, 0);
            class248.field3965 = false;
            class201.field3141 = false;
            if (arg0[3].equals("game0")) {
                class80.field1151 = 0;
            } else if (arg0[3].equals("game1")) {
                class80.field1151 = 1;
            } else {
                class268.method1824(122, "game");
            }
            class134.field1949 = false;
            class204.field3201 = 0;
            class167.field2574 = "";
            class266.field4268 = 0;
            client var1 = new client();
            class215.field3506 = var1;
            var1.method976(768, class165.field2562 + 32, (byte) 114, 28, 1024, "runescape", 532, false);
            class215.field3519.setLocation(40, 40);
        } catch (Exception var3) {
            class48.method359(1, var3, (String) null);
        }
        field2312++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    private final void method1034(int arg0) {
        field2322++;
        if (class68.field958.field3683 > class212.field3324) {
            class186.field2929 = (class68.field958.field3683 - 1) * 50 * 5;
            if (class186.field2929 > 3000) {
                class186.field2929 = 3000;
            }
            if (class198.field3109 == class177.field2760) {
                class177.field2760 = class104.field1607;
            } else {
                class177.field2760 = class198.field3109;
            }
            if (class68.field958.field3683 >= 2 && class68.field958.field3686 == 6) {
                this.method979((byte) 47, "js5connect_outofdate");
                class203.field3182 = 1000;
                return;
            }
            if (class68.field958.field3683 >= 4 && class68.field958.field3686 == -1) {
                this.method979((byte) 47, "js5crc");
                class203.field3182 = 1000;
                return;
            }
            if (class68.field958.field3683 >= 4 && (class203.field3182 == 0 || class203.field3182 == 5)) {
                if (class68.field958.field3686 == 7 || class68.field958.field3686 == 9) {
                    this.method979((byte) 47, "js5connect_full");
                } else if (class68.field958.field3686 <= 0) {
                    this.method979((byte) 47, "js5io");
                } else {
                    this.method979((byte) 47, "js5connect");
                }
                class203.field3182 = 1000;
                return;
            }
        }
        if (arg0 <= 46) {
            field2328 = -119;
        }
        class212.field3324 = class68.field958.field3683;
        if (class186.field2929 > 0) {
            class186.field2929--;
            return;
        }
        try {
            if (class96.field1480 == 0) {
                class17.field204 = class2.field23.method140(-6412, class34.field442, class177.field2760);
                class96.field1480++;
            }
            if (class96.field1480 == 1) {
                if (class17.field204.field3247 == 2) {
                    this.method1037((byte) -101, 1000);
                    return;
                }
                if (class17.field204.field3247 == 1) {
                    class96.field1480++;
                }
            }
            if (class96.field1480 == 2) {
                class91.field1391 = new class273((Socket) class17.field204.field3249, class2.field23);
                class25 var2 = new class25(5);
                var2.method184(15, 100);
                var2.method166(532, -3);
                class91.field1391.method1843(-119, var2.field339, 5, 0);
                class96.field1480++;
                class195.field3069 = class260.method1785((byte) -119);
            }
            if (class96.field1480 == 3) {
                if (class203.field3182 == 0 || class203.field3182 == 5 || class91.field1391.method1840((byte) 118) > 0) {
                    int var3 = class91.field1391.method1839((byte) -50);
                    if (var3 != 0) {
                        this.method1037((byte) -101, var3);
                        return;
                    }
                    class96.field1480++;
                } else if (class260.method1785((byte) -105) - class195.field3069 > 30000L) {
                    this.method1037((byte) -101, 1001);
                    return;
                }
            }
            if (class96.field1480 == 4) {
                boolean var4 = class203.field3182 == 5 || class203.field3182 == 10 || class203.field3182 == 28;
                class68.field958.method1550(!var4, 28817, class91.field1391);
                class96.field1480 = 0;
                class91.field1391 = null;
                class17.field204 = null;
            }
        } catch (IOException var5) {
            this.method1037((byte) -101, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
    public static final void method1035(int arg0, long arg1) {
        field2323++;
        if (arg1 != 0L) {
            class96.field1490++;
            class13.field165.method892(arg0, (byte) -105);
            class13.field165.method206(-5061, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lef;IIIIIII)V")
    public static final void method1036(class214[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class214 var9 = arg0[var8];
            if (var9 != null && var9.field3477 == arg1 && (!var9.field3360 || var9.field3447 == 0 || var9.field3499 || method1038(var9).field1029 != 0 || class105.field1622 == var9 || var9.field3390 == 1338) && (!var9.field3360 || !method1041(var9))) {
                int var10 = var9.field3373 + arg6;
                int var11 = var9.field3418 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3447 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3473 + var10;
                    int var17 = var9.field3369 + var11;
                    if (var9.field3447 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class243.field3885 == var9) {
                    class86.field1365 = true;
                    class2.field18 = var10;
                    class223.field3606 = var11;
                }
                if (!var9.field3360 || var12 < var14 && var13 < var15) {
                    if (var9.field3447 == 0) {
                        if (!var9.field3360 && method1041(var9) && class56.field787 != var9) {
                            continue;
                        }
                        if (var9.field3335 && class31.field416 >= var12 && class141.field2074 >= var13 && class31.field416 < var14 && class141.field2074 < var15) {
                            for (class142 var18 = (class142) class175.field2735.method350(8240); var18 != null; var18 = (class142) class175.field2735.method353((byte) -125)) {
                                if (var18.field2076) {
                                    var18.method784(false);
                                    var18.field2079.field3461 = false;
                                }
                            }
                            if (class248.field3969 == 0) {
                                class243.field3885 = null;
                                class105.field1622 = null;
                            }
                            class62.field859 = 0;
                        }
                    }
                    if (var9.field3360) {
                        boolean var19;
                        if (class31.field416 >= var12 && class141.field2074 >= var13 && class31.field416 < var14 && class141.field2074 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class106.field1638 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class173.field2720 == 1 && class59.field836 >= var12 && class145.field2140 >= var13 && class59.field836 < var14 && class145.field2140 < var15) {
                            var21 = true;
                        }
                        if (var9.field3348 != null) {
                            for (int var22 = 0; var22 < var9.field3348.length; var22++) {
                                if (class123.field1844[var9.field3348[var22]]) {
                                    if (var9.field3380 == null || class111.field1684 >= var9.field3380[var22]) {
                                        byte var23 = var9.field3412[var22];
                                        if (var23 == 0 || ((var23 & 0x2) == 0 || class123.field1844[86]) && ((var23 & 0x1) == 0 || class123.field1844[82]) && ((var23 & 0x4) == 0 || class123.field1844[81])) {
                                            class280.method1872(var9.field3474, "", 871127916, var22 + 1, -1);
                                            int var24 = var9.field3484[var22];
                                            if (var9.field3380 == null) {
                                                var9.field3380 = new int[var9.field3348.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field3380[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field3380[var22] = class111.field1684 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field3380 != null) {
                                    var9.field3380[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class141.method947(class59.field836 - var10, var9, class145.field2140 - var11, (byte) 115);
                        }
                        if (class243.field3885 != null && class243.field3885 != var9 && var19 && method1038(var9).method489((byte) -38)) {
                            class136.field2036 = var9;
                        }
                        if (class105.field1622 == var9) {
                            class154.field2293 = true;
                            class3.field40 = var10;
                            class17.field196 = var11;
                        }
                        if (var9.field3499 || var9.field3390 != 0) {
                            if (var19 && class232.field3728 != 0 && var9.field3331 != null) {
                                class142 var25 = new class142();
                                var25.field2076 = true;
                                var25.field2079 = var9;
                                var25.field2078 = class232.field3728;
                                var25.field2086 = var9.field3331;
                                class175.field2735.method349(var25, true);
                            }
                            if (class243.field3885 != null || class251.field4016 != null || class286.field4542 || var9.field3390 != 1400 && class62.field859 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3390 != 0) {
                                if (var9.field3390 == 1337) {
                                    class175.field2732 = var9;
                                    class55.method397(0, var9);
                                    continue;
                                }
                                if (var9.field3390 == 1338) {
                                    if (var21) {
                                        class18.field219 = class59.field836 - var10;
                                        class41.field557 = class145.field2140 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field3390 == 1400) {
                                    class72.field1015 = var9;
                                    if (var21) {
                                        if (class123.field1844[82] && class280.field4438 > 0) {
                                            int var26 = (int) ((double) (class59.field836 - var10 - var9.field3473 / 2) * 2.0D / (double) class7.field106);
                                            int var27 = (int) ((double) (class145.field2140 - var11 - var9.field3369 / 2) * 2.0D / (double) class7.field106);
                                            int var28 = class219.field3563 + var26;
                                            int var29 = class158.field2435 + var27;
                                            int var30 = class47.field599 + var28;
                                            int var31 = class104.field1611 + class120.field1751 - var29 - 1;
                                            class257.method1767(var30, 0, var31, 29102);
                                            class222.method1509(29191);
                                            continue;
                                        }
                                        class62.field859 = 1;
                                        class1.field5 = class31.field416;
                                        class1.field12 = class141.field2074;
                                        continue;
                                    }
                                    if (var20 && class62.field859 > 0) {
                                        if (class62.field859 == 1 && (class31.field416 != class1.field5 || class141.field2074 != class1.field12)) {
                                            class282.field4476 = class219.field3563;
                                            class212.field3320 = class158.field2435;
                                            class62.field859 = 2;
                                        }
                                        if (class62.field859 == 2) {
                                            class13.method97((int) ((double) (class1.field5 - class31.field416) * 2.0D / (double) class60.field842) + class282.field4476, true);
                                            class268.method1823((int) ((double) (class1.field12 - class141.field2074) * 2.0D / (double) class60.field842) + class212.field3320, true);
                                        }
                                        continue;
                                    }
                                    class62.field859 = 0;
                                    continue;
                                }
                                if (var9.field3390 == 1401) {
                                    if (var20) {
                                        class228.method1564(class31.field416 - var10, var9.field3369, (byte) -91, var9.field3473, class141.field2074 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field3390 == 1402) {
                                    class55.method397(0, var9);
                                    continue;
                                }
                            }
                            if (!var9.field3339 && var21) {
                                var9.field3339 = true;
                                if (var9.field3415 != null) {
                                    class142 var32 = new class142();
                                    var32.field2076 = true;
                                    var32.field2079 = var9;
                                    var32.field2084 = class59.field836 - var10;
                                    var32.field2078 = class145.field2140 - var11;
                                    var32.field2086 = var9.field3415;
                                    class175.field2735.method349(var32, true);
                                }
                            }
                            if (var9.field3339 && var20 && var9.field3351 != null) {
                                class142 var33 = new class142();
                                var33.field2076 = true;
                                var33.field2079 = var9;
                                var33.field2084 = class31.field416 - var10;
                                var33.field2078 = class141.field2074 - var11;
                                var33.field2086 = var9.field3351;
                                class175.field2735.method349(var33, true);
                            }
                            if (var9.field3339 && !var20) {
                                var9.field3339 = false;
                                if (var9.field3439 != null) {
                                    class142 var34 = new class142();
                                    var34.field2076 = true;
                                    var34.field2079 = var9;
                                    var34.field2084 = class31.field416 - var10;
                                    var34.field2078 = class141.field2074 - var11;
                                    var34.field2086 = var9.field3439;
                                    class200.field3127.method349(var34, true);
                                }
                            }
                            if (var20 && var9.field3478 != null) {
                                class142 var35 = new class142();
                                var35.field2076 = true;
                                var35.field2079 = var9;
                                var35.field2084 = class31.field416 - var10;
                                var35.field2078 = class141.field2074 - var11;
                                var35.field2086 = var9.field3478;
                                class175.field2735.method349(var35, true);
                            }
                            if (!var9.field3461 && var19) {
                                var9.field3461 = true;
                                if (var9.field3453 != null) {
                                    class142 var36 = new class142();
                                    var36.field2076 = true;
                                    var36.field2079 = var9;
                                    var36.field2084 = class31.field416 - var10;
                                    var36.field2078 = class141.field2074 - var11;
                                    var36.field2086 = var9.field3453;
                                    class175.field2735.method349(var36, true);
                                }
                            }
                            if (var9.field3461 && var19 && var9.field3430 != null) {
                                class142 var37 = new class142();
                                var37.field2076 = true;
                                var37.field2079 = var9;
                                var37.field2084 = class31.field416 - var10;
                                var37.field2078 = class141.field2074 - var11;
                                var37.field2086 = var9.field3430;
                                class175.field2735.method349(var37, true);
                            }
                            if (var9.field3461 && !var19) {
                                var9.field3461 = false;
                                if (var9.field3370 != null) {
                                    class142 var38 = new class142();
                                    var38.field2076 = true;
                                    var38.field2079 = var9;
                                    var38.field2084 = class31.field416 - var10;
                                    var38.field2078 = class141.field2074 - var11;
                                    var38.field2086 = var9.field3370;
                                    class200.field3127.method349(var38, true);
                                }
                            }
                            if (var9.field3462 != null) {
                                class142 var39 = new class142();
                                var39.field2079 = var9;
                                var39.field2086 = var9.field3462;
                                class21.field254.method349(var39, true);
                            }
                            if (var9.field3480 != null && class94.field1458 > var9.field3396) {
                                if (var9.field3444 == null || class94.field1458 - var9.field3396 > 32) {
                                    class142 var44 = new class142();
                                    var44.field2079 = var9;
                                    var44.field2086 = var9.field3480;
                                    class175.field2735.method349(var44, true);
                                } else {
                                    label565: for (int var40 = var9.field3396; var40 < class94.field1458; var40++) {
                                        int var41 = class214.field3392[var40 & 0x1F];
                                        for (int var42 = 0; var42 < var9.field3444.length; var42++) {
                                            if (var9.field3444[var42] == var41) {
                                                class142 var43 = new class142();
                                                var43.field2079 = var9;
                                                var43.field2086 = var9.field3480;
                                                class175.field2735.method349(var43, true);
                                                break label565;
                                            }
                                        }
                                    }
                                }
                                var9.field3396 = class94.field1458;
                            }
                            if (var9.field3372 != null && class175.field2741 > var9.field3417) {
                                if (var9.field3397 == null || class175.field2741 - var9.field3417 > 32) {
                                    class142 var49 = new class142();
                                    var49.field2079 = var9;
                                    var49.field2086 = var9.field3372;
                                    class175.field2735.method349(var49, true);
                                } else {
                                    label541: for (int var45 = var9.field3417; var45 < class175.field2741; var45++) {
                                        int var46 = class271.field4306[var45 & 0x1F];
                                        for (int var47 = 0; var47 < var9.field3397.length; var47++) {
                                            if (var9.field3397[var47] == var46) {
                                                class142 var48 = new class142();
                                                var48.field2079 = var9;
                                                var48.field2086 = var9.field3372;
                                                class175.field2735.method349(var48, true);
                                                break label541;
                                            }
                                        }
                                    }
                                }
                                var9.field3417 = class175.field2741;
                            }
                            if (var9.field3432 != null && class216.field3529 > var9.field3465) {
                                if (var9.field3359 == null || class216.field3529 - var9.field3465 > 32) {
                                    class142 var54 = new class142();
                                    var54.field2079 = var9;
                                    var54.field2086 = var9.field3432;
                                    class175.field2735.method349(var54, true);
                                } else {
                                    label517: for (int var50 = var9.field3465; var50 < class216.field3529; var50++) {
                                        int var51 = class247.field3954[var50 & 0x1F];
                                        for (int var52 = 0; var52 < var9.field3359.length; var52++) {
                                            if (var9.field3359[var52] == var51) {
                                                class142 var53 = new class142();
                                                var53.field2079 = var9;
                                                var53.field2086 = var9.field3432;
                                                class175.field2735.method349(var53, true);
                                                break label517;
                                            }
                                        }
                                    }
                                }
                                var9.field3465 = class216.field3529;
                            }
                            if (var9.field3414 != null && class1.field2 > var9.field3467) {
                                if (var9.field3457 == null || class1.field2 - var9.field3467 > 32) {
                                    class142 var59 = new class142();
                                    var59.field2079 = var9;
                                    var59.field2086 = var9.field3414;
                                    class175.field2735.method349(var59, true);
                                } else {
                                    label493: for (int var55 = var9.field3467; var55 < class1.field2; var55++) {
                                        int var56 = class241.field3866[var55 & 0x1F];
                                        for (int var57 = 0; var57 < var9.field3457.length; var57++) {
                                            if (var9.field3457[var57] == var56) {
                                                class142 var58 = new class142();
                                                var58.field2079 = var9;
                                                var58.field2086 = var9.field3414;
                                                class175.field2735.method349(var58, true);
                                                break label493;
                                            }
                                        }
                                    }
                                }
                                var9.field3467 = class1.field2;
                            }
                            if (var9.field3435 != null && class258.field4163 > var9.field3385) {
                                if (var9.field3459 == null || class258.field4163 - var9.field3385 > 32) {
                                    class142 var64 = new class142();
                                    var64.field2079 = var9;
                                    var64.field2086 = var9.field3435;
                                    class175.field2735.method349(var64, true);
                                } else {
                                    label469: for (int var60 = var9.field3385; var60 < class258.field4163; var60++) {
                                        int var61 = class96.field1494[var60 & 0x1F];
                                        for (int var62 = 0; var62 < var9.field3459.length; var62++) {
                                            if (var9.field3459[var62] == var61) {
                                                class142 var63 = new class142();
                                                var63.field2079 = var9;
                                                var63.field2086 = var9.field3435;
                                                class175.field2735.method349(var63, true);
                                                break label469;
                                            }
                                        }
                                    }
                                }
                                var9.field3385 = class258.field4163;
                            }
                            if (class40.field542 > var9.field3429 && var9.field3342 != null) {
                                class142 var65 = new class142();
                                var65.field2079 = var9;
                                var65.field2086 = var9.field3342;
                                class175.field2735.method349(var65, true);
                            }
                            if (class111.field1681 > var9.field3429 && var9.field3420 != null) {
                                class142 var66 = new class142();
                                var66.field2079 = var9;
                                var66.field2086 = var9.field3420;
                                class175.field2735.method349(var66, true);
                            }
                            if (class216.field3522 > var9.field3429 && var9.field3463 != null) {
                                class142 var67 = new class142();
                                var67.field2079 = var9;
                                var67.field2086 = var9.field3463;
                                class175.field2735.method349(var67, true);
                            }
                            if (class244.field3907 > var9.field3429 && var9.field3353 != null) {
                                class142 var68 = new class142();
                                var68.field2079 = var9;
                                var68.field2086 = var9.field3353;
                                class175.field2735.method349(var68, true);
                            }
                            if (class261.field4210 > var9.field3429 && var9.field3377 != null) {
                                class142 var69 = new class142();
                                var69.field2079 = var9;
                                var69.field2086 = var9.field3377;
                                class175.field2735.method349(var69, true);
                            }
                            var9.field3429 = class141.field2067;
                            if (var9.field3487 != null) {
                                for (int var70 = 0; var70 < class52.field724; var70++) {
                                    class142 var71 = new class142();
                                    var71.field2079 = var9;
                                    var71.field2082 = class278.field4412[var70];
                                    var71.field2083 = class271.field4312[var70];
                                    var71.field2086 = var9.field3487;
                                    class175.field2735.method349(var71, true);
                                }
                            }
                            if (class100.field1558 && var9.field3488 != null) {
                                class142 var72 = new class142();
                                var72.field2079 = var9;
                                var72.field2086 = var9.field3488;
                                class175.field2735.method349(var72, true);
                            }
                        }
                    }
                    if (!var9.field3360 && class243.field3885 == null && class251.field4016 == null && !class286.field4542) {
                        if ((var9.field3403 >= 0 || var9.field3502 != 0) && class31.field416 >= var12 && class141.field2074 >= var13 && class31.field416 < var14 && class141.field2074 < var15) {
                            if (var9.field3403 >= 0) {
                                class56.field787 = arg0[var9.field3403];
                            } else {
                                class56.field787 = var9;
                            }
                        }
                        if (var9.field3447 == 8 && class31.field416 >= var12 && class141.field2074 >= var13 && class31.field416 < var14 && class141.field2074 < var15) {
                            class257.field4149 = var9;
                        }
                        if (var9.field3378 > var9.field3369) {
                            class18.method124(-19103, var9, var9.field3369, var9.field3378, var9.field3473 + var10, class141.field2074, class31.field416, var11);
                        }
                    }
                    if (var9.field3447 == 0) {
                        method1036(arg0, var9.field3474, var12, var13, var14, var15, var10 - var9.field3448, var11 - var9.field3455);
                        if (var9.field3357 != null) {
                            method1036(var9.field3357, var9.field3474, var12, var13, var14, var15, var10 - var9.field3448, var11 - var9.field3455);
                        }
                        class35 var73 = (class35) class2.field22.method665((byte) -124, (long) var9.field3474);
                        if (var73 != null) {
                            class264.method1807(var12, var10, var73.field456, var11, var13, -113, var14, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    private final void method1037(byte arg0, int arg1) {
        class17.field204 = null;
        class68.field958.field3683++;
        if (arg0 != -101) {
            this.method986((byte) -4);
        }
        field2316++;
        class91.field1391 = null;
        class96.field1480 = 0;
        class68.field958.field3686 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method985(int arg0) {
        field2317++;
        if (class203.field3182 == 1000) {
            return;
        }
        if (arg0 != 70) {
            method1036((class214[]) null, -75, 20, 13, 54, -126, 55, -113);
        }
        boolean var2 = class238.method1614(20786);
        if (var2 && class284.field4509 && class239.field3821 != null) {
            class239.field3821.method393(arg0 + 1930);
        }
        if ((class203.field3182 == 30 || class203.field3182 == 10) && (class82.field1199 || class169.field2656 != 0L && class169.field2656 < class260.method1785((byte) -127))) {
            class71.method481(class277.method1859(-117), class192.field3041, class261.field4220, -9267, class82.field1199);
        }
        if (class154.field2291 == null) {
            Container var3;
            if (class154.field2291 != null) {
                var3 = class154.field2291;
            } else if (class215.field3519 == null) {
                var3 = class2.field23.field237;
            } else {
                var3 = class215.field3519;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class215.field3519 == var3) {
                Insets var6 = class215.field3519.getInsets();
                var4 -= var6.right + var6.left;
                var5 -= var6.top + var6.bottom;
            }
            if (class99.field1542 != var4 || class19.field223 != var5) {
                if (class20.field244.startsWith("mac")) {
                    class19.field223 = var5;
                    class99.field1542 = var4;
                } else {
                    class99.method656(-21335);
                }
                class169.field2656 = class260.method1785((byte) -97) + 500L;
            }
        }
        boolean var7 = false;
        if (class83.field1311) {
            var7 = true;
            class83.field1311 = false;
        }
        if (var7) {
            class261.method1790(false);
        }
        if (class203.field3182 == 0) {
            class67.method460((byte) -57, (Color) null, var7, class139.field2054, class115.field1697);
        } else if (class203.field3182 == 5) {
            class124.method842(class232.field3734, 7772, false);
        } else if (class203.field3182 == 10) {
            class25.method219((byte) -44);
        } else if (class203.field3182 == 25 || class203.field3182 == 28) {
            if (class121.field1761 == 1) {
                if (class94.field1453 > class54.field742) {
                    class54.field742 = class94.field1453;
                }
                int var9 = (class54.field742 - class94.field1453) * 50 / class54.field742;
                class34.method272((byte) 124, class165.field2559 + "<br>(" + var9 + "%)", false);
            } else if (class121.field1761 == 2) {
                if (class285.field4522 < class269.field4294) {
                    class285.field4522 = class269.field4294;
                }
                int var8 = (class285.field4522 - class269.field4294) * 50 / class285.field4522 + 50;
                class34.method272((byte) 62, class165.field2559 + "<br>(" + var8 + "%)", false);
            } else {
                class34.method272((byte) 124, class165.field2559, false);
            }
        } else if (class203.field3182 == 30) {
            class262.method1798((byte) -43);
        } else if (class203.field3182 == 40) {
            class34.method272((byte) 31, class47.field602 + "<br>" + class130.field1910, false);
        }
        if ((class203.field3182 == 30 || class203.field3182 == 10) && class4.field56 == 0 && !var7) {
            try {
                Graphics var10 = class86.field1364.getGraphics();
                for (int var11 = 0; var11 < class146.field2154; var11++) {
                    if (class80.field1162[var11]) {
                        class26.field369.method292(class272.field4336[var11], true, var10, class149.field2229[var11], class283.field4485[var11], class155.field2306[var11]);
                        class80.field1162[var11] = false;
                    }
                }
            } catch (Exception var15) {
                class86.field1364.repaint();
            }
        } else if (class203.field3182 != 0) {
            try {
                Graphics var12 = class86.field1364.getGraphics();
                class26.field369.method295(true, 0, var12, 0);
                for (int var13 = 0; var13 < class146.field2154; var13++) {
                    class80.field1162[var13] = false;
                }
            } catch (Exception var14) {
                class86.field1364.repaint();
            }
        }
        if (class64.field901) {
            class269.method1826((byte) -127);
        }
        if (class244.field3910 && class203.field3182 == 10 && class242.field3880 != -1) {
            class244.field3910 = false;
            class7.method45(255, class2.field23);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lef;)Ltd;")
    public static final class72 method1038(class214 arg0) {
        class72 var1 = (class72) class34.field436.method665((byte) -37, ((long) arg0.field3474 << 32) + (long) arg0.field3471);
        return var1 == null ? arg0.field3482 : var1;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method987(byte arg0) {
        field2326++;
        method1044(true);
        class18.method123((byte) -121);
        class162.method1110(-8760);
        class78.method531(126);
        class146.method970((byte) 113);
        class140.method941(-127);
        class189.method1328(-14);
        class76.method515(71);
        class75.method512(4);
        class54.method392(-1);
        class194.method1351(false);
        class25.method176(-65);
        class273.method1845((byte) -39);
        class227.method1546(-112);
        class67.method455(33);
        class241.method1628((byte) -118);
        class123.method825((byte) -56);
        class149.method1001(false);
        class237.method1607(-91);
        class211.method1423(-90);
        class56.method415(-13638);
        class131.method890(true);
        class79.method536(-770);
        class214.method1441(1073741824);
        class186.method1297(1);
        class46.method348(8482);
        class229.method1566(221);
        class100.method667((byte) -127);
        class68.method464((byte) -63);
        class164.method1127(15719);
        if (arg0 < 122) {
            return;
        }
        class262.method1799(92);
        class168.method1171(false);
        class93.method624((byte) 98);
        class249.method1677(-23110);
        class198.method1368(70);
        class82.method571(126);
        class49.method362((byte) -86);
        class181.method1262((byte) -111);
        class136.method921(false);
        class35.method276((byte) -117);
        class72.method486(7897223);
        class120.method786(12993);
        class216.method1462((byte) -90);
        class52.method380((byte) 56);
        class218.method1473(-102);
        class205.method1402(121);
        class286.method1909((byte) 73);
        class232.method1584(10576);
        class206.method1404((byte) -115);
        class73.method498(11286);
        class64.method444((byte) -60);
        class158.method1063(0);
        class29.method240(106);
        class175.method1227((byte) -103);
        class167.method1145(-11878);
        class45.method341(-5984);
        class184.method1281(1);
        class182.method1275(-25503);
        class160.method1082();
        class141.method945((byte) 2);
        class253.method1705(-122);
        class156.method1046();
        class130.method885(false);
        class250.method1683(24037);
        class40.method316(127);
        class116.method772(-20666);
        class145.method963(119);
        class188.method1311();
        class228.method1560(0);
        class274.method1847((byte) 89);
        class221.method1495();
        class161.method1105((byte) -21);
        class290.method1928((byte) -26);
        class148.method990(-86);
        class180.method1254();
        class41.method324((byte) 104);
        class201.method1386(1);
        class62.method435(-24047);
        class111.method724(16);
        class127.method872();
        class261.method1788((byte) 53);
        class102.method673(-32709);
        class110.method719((byte) 121);
        class135.method914((byte) -100);
        class115.method769(-1);
        class185.method1287(-118);
        class154.method1022(-1);
        class39.method310(256);
        class245.method1659(-116);
        class212.method1436(true);
        class226.method1541(true);
        class155.method1026(78);
        class85.method590(true);
        class70.method474(11465);
        class170.method1184(-20079);
        class5.method28(9);
        class234.method1589((byte) 126);
        class283.method1891((byte) 27);
        class6.method34(90);
        class165.method1135(-63);
        class80.method560((byte) 110);
        class235.method1596(-4);
        class1.method4(30651);
        class276.method1856(-31200);
        class144.method961(0);
        class36.method288(-109);
        class171.method1206();
        class163.method1122((byte) -125);
        class270.method1831(false);
        class19.method131(1);
        class157.method1061((byte) -45);
        class124.method841((byte) 103);
        class8.method53(false);
        class172.method1212(-87);
        class199.method1375(true);
        class142.method950(-5628);
        class219.method1480((byte) 90);
        class284.method1898((byte) -68);
        class13.method94(0);
        class69.method469((byte) 93);
        class264.method1808(-5);
        class17.method120(-24);
        class215.method1458(23951);
        class81.method561();
        class152.method1012(0);
        class94.method629((byte) -121);
        class151.method1007(-1);
        class233.method1587();
        class231.method1579(2048);
        class139.method935(-2);
        class134.method910(27915);
        class16.method115((byte) 103);
        class287.method1918(120);
        class33.method267((byte) -99);
        class190.method1338(11093);
        class238.method1615((byte) 7);
        class285.method1900(524287);
        class210.method1415();
        class84.method583(4);
        class243.method1641(-75);
        class104.method686(-51);
        class50.method371((byte) -52);
        class98.method649(true);
        class126.method854((byte) -75);
        class177.method1236(-37);
        class63.method438(-1);
        class252.method1688((byte) -101);
        class179.method1243((byte) -126);
        class247.method1665(-105);
        class108.method705(true);
        class282.method1883(3);
        class37.method294((byte) 84);
        class71.method480(144);
        class125.method849(-111);
        class200.method1380(false);
        class51.method378((byte) 59);
        class230.method1574();
        class92.method616(true);
        class86.method593(false);
        class97.method646((byte) 93);
        class268.method1825(1);
        class99.method657(-461681754);
        class207.method1407(114);
        class193.method1348();
        class9.method57();
        class2.method7(-12928);
        class103.method682(127);
        class121.method789((byte) 89);
        class11.method67((byte) 19);
        class259.method1778();
        class220.method1482();
        class4.method21(17237);
        class101.method672((byte) 113);
        class224.method1531(1);
        class159.method1066(2014593029);
        class192.method1346(-5753);
        class278.method1866(false);
        class173.method1222(false);
        class209.method1413(-89);
        class96.method639((byte) -95);
        class21.method149(-83);
        class77.method522((byte) 39);
        class128.method880(-67);
        class10.method61(100);
        class31.method252((byte) -33);
        class203.method1394((byte) -104);
        class90.method608(true);
        class240.method1624(4096);
        class47.method355(23171);
        class244.method1644(1);
        class3.method11(3);
        class106.method692((byte) -5);
        class257.method1764(false);
        class137.method931(-1829358495);
        class266.method1818(119);
        class22.method153((byte) 97);
        class58.method417(true);
        class204.method1398((byte) 62);
        class251.method1687(24107);
        class91.method611(1047037348);
        class178.method1241(1);
        class118.method780(0);
        class107.method698(0);
        class53.method385(true);
        class236.method1605(-117);
        class279.method1868((byte) 112);
        class242.method1635((byte) 92);
        class246.method1663(22420);
        class74.method503(0);
        class153.method1016(-1);
        class176.method1233((byte) -107);
        class66.method450(6116423);
        class225.method1534((byte) 106);
        class143.method953(3495);
        class258.method1769(26141);
        class38.method302((byte) 96);
        class281.method1877(true);
        class7.method44(0);
        class223.method1518(-91);
        class269.method1829((byte) -72);
        class117.method779(false);
        class23.method163(-29900);
        class28.method235(-1);
        class248.method1670(5);
        class26.method229(-63);
        class95.method633((byte) 16);
        class34.method274((byte) -126);
        class202.method1392(0);
        class174.method1224((byte) 39);
        class30.method242(16);
        class280.method1874(2);
        class271.method1833(0);
        class60.method429((byte) -126);
        class44.method334(0);
        class105.method689(100);
        class272.method1837(false);
        class239.method1621(-1229893588);
        class222.method1515(94);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    private final void method1039(int arg0) {
        if (!class244.field3910) {
            label233: while (true) {
                do {
                    if (!class172.method1216(arg0 - 26245)) {
                        break label233;
                    }
                } while (class141.field2069 != 's' && class141.field2069 != 'S');
                class244.field3910 = true;
            }
        }
        if (arg0 != 75) {
            this.method1040(44);
        }
        field2319++;
        if (class121.field1764 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class260.method1785((byte) -100);
            if (class280.field4439 == 0L) {
                class280.field4439 = var4;
            }
            if (var3 > 16384 && (var4 - class280.field4439) < 5000L) {
                if (var4 - class247.field3951 > 1000L) {
                    System.gc();
                    class247.field3951 = var4;
                }
                class139.field2054 = class211.field3290;
                class115.field1697 = 5;
            } else {
                class121.field1764 = 10;
                class139.field2054 = class128.field1882;
                class115.field1697 = 5;
            }
        } else if (class121.field1764 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class290.field4574[var6] = new class79(104, 104);
            }
            class139.field2054 = class199.field3122;
            class115.field1697 = 10;
            class121.field1764 = 30;
        } else if (class121.field1764 == 30) {
            if (class50.field656 == null) {
                class50.field656 = new class241(class68.field958, class75.field1063);
            }
            if (class50.field656.method1631(true)) {
                class13.field179 = class122.method801(true, true, false, false, 0);
                class118.field1738 = class122.method801(true, true, false, false, 1);
                class154.field2292 = class122.method801(true, false, true, false, 2);
                class170.field2668 = class122.method801(true, true, false, false, 3);
                class49.field633 = class122.method801(true, true, false, false, 4);
                class102.field1582 = class122.method801(true, true, true, false, 5);
                class98.field1509 = class122.method801(false, true, true, false, 6);
                class282.field4462 = class122.method801(true, true, false, false, 7);
                class237.field3802 = class122.method801(true, true, false, false, 8);
                class271.field4315 = class122.method801(true, true, false, false, 9);
                class16.field186 = class122.method801(true, true, false, false, 10);
                class261.field4209 = class122.method801(true, true, false, false, 11);
                class63.field892 = class122.method801(true, true, false, false, 12);
                field2331 = class122.method801(true, true, false, false, 13);
                class8.field123 = class122.method801(false, true, false, false, 14);
                class244.field3913 = class122.method801(true, true, false, false, 15);
                class199.field3124 = class122.method801(true, true, false, false, 16);
                class21.field259 = class122.method801(true, true, false, false, 17);
                class37.field487 = class122.method801(true, true, false, false, 18);
                class163.field2536 = class122.method801(true, true, false, false, 19);
                class192.field3024 = class122.method801(true, true, false, false, 20);
                class243.field3892 = class122.method801(true, true, false, false, 21);
                class284.field4501 = class122.method801(true, true, false, false, 22);
                class252.field4030 = class122.method801(true, true, true, false, 23);
                class123.field1838 = class122.method801(true, true, false, false, 24);
                class30.field397 = class122.method801(true, true, false, false, 25);
                class204.field3204 = class122.method801(true, true, true, false, 26);
                class228.field3695 = class122.method801(true, true, false, false, 27);
                class139.field2054 = class276.field4395;
                class115.field1697 = 15;
                class121.field1764 = 40;
            } else {
                class115.field1697 = 12;
                class139.field2054 = class227.field3659;
            }
        } else if (class121.field1764 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 28; var8++) {
                var7 += class175.field2742[var8].method797((byte) 114) * class290.field4580[var8] / 100;
            }
            if (var7 == 100) {
                class115.field1697 = 20;
                class139.field2054 = class202.field3161;
                class190.method1334(arg0 - 9174, class237.field3802);
                class82.method567(class237.field3802, arg0 - 75);
                class116.method771((byte) 73, class237.field3802);
                class121.field1764 = 45;
            } else {
                if (var7 != 0) {
                    class139.field2054 = class227.field3671 + var7 + "%";
                }
                class115.field1697 = 20;
            }
        } else if (class121.field1764 == 45) {
            class242.method1634(class16.field192, 2, 22050, (byte) 77);
            class52.field717 = new class168();
            class52.field717.method1181(9, 128, 54);
            class239.field3821 = class253.method1698(class86.field1364, -127, 0, class2.field23, 22050);
            class239.field3821.method396(class52.field717, 255);
            class274.method1848(class49.field633, class244.field3913, class52.field717, class8.field123, -24564);
            class54.field739 = class253.method1698(class86.field1364, -51, 1, class2.field23, 2048);
            class130.field1907 = new class109();
            class54.field739.method396(class130.field1907, 255);
            class26.field368 = new class93(22050, class290.field4582);
            class245.field3917 = class98.field1509.method813("scape main", -1);
            class121.field1764 = 50;
            class139.field2054 = class186.field2908;
            class115.field1697 = 30;
        } else if (class121.field1764 == 50) {
            int var9 = class36.method281(arg0 - 65, class237.field3802, field2331);
            int var10 = class36.method287(true);
            if (var9 < var10) {
                class139.field2054 = class102.field1588 + var9 * 100 / var10 + "%";
                class115.field1697 = 35;
            } else {
                class139.field2054 = class60.field838;
                class115.field1697 = 35;
                class121.field1764 = 60;
            }
        } else if (class121.field1764 == 60) {
            int var11 = class139.method937(class237.field3802, (byte) -16);
            int var12 = class10.method62((byte) -71);
            if (var12 > var11) {
                class139.field2054 = class45.field575 + var11 * 100 / var12 + "%";
                class115.field1697 = 40;
            } else {
                class139.field2054 = class162.field2518;
                class121.field1764 = 65;
                class115.field1697 = 40;
            }
        } else if (class121.field1764 == 65) {
            class83.method580(-13168, field2331, class237.field3802);
            class115.field1697 = 45;
            class139.field2054 = class257.field4157;
            class245.method1650(5, (byte) -106);
            class121.field1764 = 70;
        } else if (class121.field1764 == 70) {
            class154.field2292.method836(30759);
            byte var13 = 0;
            int var14 = var13 + class154.field2292.method805(1);
            class199.field3124.method836(arg0 + 30684);
            int var15 = var14 + class199.field3124.method805(arg0 ^ 0x4A);
            class21.field259.method836(30759);
            int var16 = var15 + class21.field259.method805(arg0 ^ 0x4A);
            class37.field487.method836(30759);
            int var17 = var16 + class37.field487.method805(1);
            class163.field2536.method836(30759);
            int var18 = var17 + class163.field2536.method805(arg0 ^ 0x4A);
            class192.field3024.method836(30759);
            int var19 = var18 + class192.field3024.method805(arg0 ^ 0x4A);
            class243.field3892.method836(30759);
            int var20 = var19 + class243.field3892.method805(1);
            class284.field4501.method836(30759);
            int var21 = var20 + class284.field4501.method805(1);
            class123.field1838.method836(30759);
            int var22 = var21 + class123.field1838.method805(1);
            class30.field397.method836(arg0 ^ 0x786C);
            int var23 = var22 + class30.field397.method805(1);
            class228.field3695.method836(30759);
            int var24 = var23 + class228.field3695.method805(1);
            if (var24 < 1100) {
                class115.field1697 = 50;
                class139.field2054 = class239.field3819 + var24 / 11 + "%";
            } else {
                class16.method114(128, class154.field2292);
                class90.method604(false, class154.field2292);
                class172.method1214(0, class154.field2292);
                class46.method347(class154.field2292, class282.field4462, 110);
                class34.method268(true, (byte) 123, class199.field3124, class282.field4462);
                class159.method1068(class282.field4462, arg0 + 21, class37.field487);
                class236.method1600(class282.field4462, class163.field2536, true, class49.field628, (byte) 96);
                class18.method125(1, class154.field2292);
                class96.method640(class13.field179, class192.field3024, class118.field1738, (byte) 24);
                class211.method1419(0, class154.field2292);
                class68.method462((byte) 111, class282.field4462, class243.field3892);
                class78.method524(class284.field4501, 31);
                class80.method555(class154.field2292, (byte) -85);
                class285.method1902(class237.field3802, class170.field2668, arg0 ^ 0x48, class282.field4462, field2331);
                class251.method1686(class154.field2292, (byte) -125);
                class222.method1513(9970, class21.field259);
                class159.method1065(class123.field1838, 1, class30.field397, new class165());
                class48.method360(class30.field397, class123.field1838, false);
                class69.method471(-111, class154.field2292);
                class78.method526(class154.field2292, -57, class237.field3802);
                class77.method518(class237.field3802, class154.field2292, (byte) 117);
                class115.field1697 = 50;
                class139.field2054 = class174.field2725;
                class285.method1903((byte) -101);
                class121.field1764 = 80;
            }
        } else if (class121.field1764 == 80) {
            int var25 = class95.method631(0, class237.field3802);
            int var26 = class237.method1611(15);
            if (var26 > var25) {
                class139.field2054 = class155.field2305 + var25 * 100 / var26 + "%";
                class115.field1697 = 60;
            } else {
                class225.method1533(126, class237.field3802);
                class115.field1697 = 60;
                class121.field1764 = 90;
                class139.field2054 = class258.field4164;
            }
        } else if (class121.field1764 == 90) {
            if (class204.field3204.method836(30759)) {
                class144 var27 = new class144(class271.field4315, class204.field3204, class237.field3802, 20, !class239.field3814);
                class171.method1202(var27);
                if (class59.field835 == 1) {
                    class171.method1203(0.9F);
                }
                if (class59.field835 == 2) {
                    class171.method1203(0.8F);
                }
                if (class59.field835 == 3) {
                    class171.method1203(0.7F);
                }
                if (class59.field835 == 4) {
                    class171.method1203(0.6F);
                }
                class121.field1764 = 100;
                class139.field2054 = class286.field4540;
                class115.field1697 = 70;
            } else {
                class139.field2054 = class248.field3971 + class204.field3204.method805(1) + "%";
                class115.field1697 = 70;
            }
        } else if (class121.field1764 == 100) {
            if (class50.method366(class237.field3802, arg0 ^ 0x6B)) {
                class121.field1764 = 110;
            }
        } else if (class121.field1764 == 110) {
            class176.field2746 = new class54();
            class2.field23.method134((byte) -88, 10, class176.field2746);
            class121.field1764 = 120;
            class139.field2054 = class115.field1704;
            class115.field1697 = 75;
        } else if (class121.field1764 == 120) {
            if (class16.field186.method828("", "huffman", 2)) {
                class163 var28 = new class163(class16.field186.method819("", "huffman", arg0 - 273));
                class124.method846(var28, 5);
                class121.field1764 = 130;
                class139.field2054 = class232.field3731;
                class115.field1697 = 80;
            } else {
                class115.field1697 = 80;
                class139.field2054 = class211.field3307 + "0%";
            }
        } else if (class121.field1764 == 130) {
            if (!class170.field2668.method836(arg0 + 30684)) {
                class139.field2054 = class225.field3643 + class170.field2668.method805(1) * 3 / 4 + "%";
                class115.field1697 = 85;
            } else if (!class63.field892.method836(arg0 ^ 0x786C)) {
                class139.field2054 = class225.field3643 + (class63.field892.method805(1) / 10 + 75) + "%";
                class115.field1697 = 85;
            } else if (!field2331.method836(arg0 + 30684)) {
                class139.field2054 = class225.field3643 + (field2331.method805(1) / 20 + 85) + "%";
                class115.field1697 = 85;
            } else if (class252.field4030.method814("details", true)) {
                class83.method578(class173.field2724, 75, class252.field4030);
                class121.field1764 = 135;
                class139.field2054 = class16.field194;
                class115.field1697 = 95;
            } else {
                class139.field2054 = class225.field3643 + (class252.field4030.method816("details", (byte) 80) / 10 + 90) + "%";
                class115.field1697 = 85;
            }
        } else if (class121.field1764 == 135) {
            int var29 = class66.method451(arg0 ^ 0x4013);
            if (var29 == -1) {
                class139.field2054 = class16.field187;
                class115.field1697 = 95;
            } else if (var29 == 7 || var29 == 9) {
                this.method979((byte) 47, "worldlistfull");
                class245.method1650(1000, (byte) 59);
            } else if (class287.field4546) {
                class115.field1697 = 96;
                class121.field1764 = 140;
                class139.field2054 = class227.field3673;
            } else {
                this.method979((byte) 47, "worldlistio_" + var29);
                class245.method1650(1000, (byte) -54);
            }
        } else if (class121.field1764 == 140) {
            class187.field2946 = class170.field2668.method813("loginscreen", -1);
            class102.field1582.method826(arg0 ^ 0x37, false, true);
            class98.field1509.method826(120, true, true);
            class237.field3802.method826(119, true, true);
            field2331.method826(100, true, true);
            class16.field186.method826(arg0 ^ 0x10, true, true);
            class170.field2668.method826(arg0 + 36, true, true);
            class115.field1697 = 97;
            class139.field2054 = class110.field1666;
            class64.field901 = true;
            class121.field1764 = 150;
        } else if (class121.field1764 == 150) {
            if (class244.field3910) {
                class185.field2900 = 0;
                class18.field215 = 0;
                class8.field124 = 0;
                class229.field3703 = 0;
            }
            class244.field3910 = true;
            class7.method45(255, class2.field23);
            class71.method481(class8.field124, -1, -1, -9267, false);
            class115.field1697 = 100;
            class139.field2054 = class224.field3622;
            class121.field1764 = 160;
        } else if (class121.field1764 == 160) {
            class162.method1111(arg0 ^ 0xFFFFFFEE, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method1040(int arg0) {
        if (arg0 > -116) {
            return;
        }
        field2325++;
        for (class52.field724 = 0; class172.method1216(-26170) && class52.field724 < 128; class52.field724++) {
            class278.field4412[class52.field724] = class194.field3061;
            class271.field4312[class52.field724] = class141.field2069;
        }
        class80.field1166++;
        if (class242.field3880 != -1) {
            class264.method1807(0, 0, class242.field3880, 0, 0, -92, class135.field1960, class98.field1510);
        }
        class141.field2067++;
        class27.method233(-30617);
        while (true) {
            class142 var2;
            class214 var3;
            class214 var4;
            do {
                var2 = (class142) class21.field254.method344((byte) -5);
                if (var2 == null) {
                    while (true) {
                        class142 var5;
                        class214 var6;
                        class214 var7;
                        do {
                            var5 = (class142) class200.field3127.method344((byte) -5);
                            if (var5 == null) {
                                while (true) {
                                    class142 var8;
                                    class214 var9;
                                    class214 var10;
                                    do {
                                        var8 = (class142) class175.field2735.method344((byte) -5);
                                        if (var8 == null) {
                                            if (class243.field3885 != null) {
                                                class44.method331(-2);
                                            }
                                            if (class243.field3888 != null && class243.field3888.field3247 == 1) {
                                                if (class243.field3888.field3249 != null) {
                                                    class224.method1525(class246.field3942, class35.field446, 1);
                                                }
                                                class246.field3942 = null;
                                                class35.field446 = false;
                                                class243.field3888 = null;
                                            }
                                            if (class111.field1684 % 1500 == 0) {
                                                class52.method382(false);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field2079;
                                        if (var9.field3471 < 0) {
                                            break;
                                        }
                                        var10 = class206.method1403((byte) 7, var9.field3477);
                                    } while (var10 == null || var10.field3357 == null || var9.field3471 >= var10.field3357.length || var10.field3357[var9.field3471] != var9);
                                    class202.method1390(var8, (byte) 81);
                                }
                            }
                            var6 = var5.field2079;
                            if (var6.field3471 < 0) {
                                break;
                            }
                            var7 = class206.method1403((byte) 7, var6.field3477);
                        } while (var7 == null || var7.field3357 == null || var6.field3471 >= var7.field3357.length || var7.field3357[var6.field3471] != var6);
                        class202.method1390(var5, (byte) -108);
                    }
                }
                var3 = var2.field2079;
                if (var3.field3471 < 0) {
                    break;
                }
                var4 = class206.method1403((byte) 7, var3.field3477);
            } while (var4 == null || var4.field3357 == null || var4.field3357.length <= var3.field3471 || var4.field3357[var3.field3471] != var3);
            class202.method1390(var2, (byte) -76);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lef;)Z")
    public static final boolean method1041(class214 arg0) {
        if (class22.field270) {
            if (method1038(arg0).field1029 != 0) {
                return false;
            }
            if (arg0.field3447 == 0) {
                return false;
            }
        }
        return arg0.field3358;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method986(byte arg0) {
        if (class176.field2746 != null) {
            class176.field2746.field744 = false;
        }
        class176.field2746 = null;
        if (class240.field3833 != null) {
            class240.field3833.method1842(false);
            class240.field3833 = null;
        }
        class286.method1904(class86.field1364, 5952);
        class153.method1017(0, class86.field1364);
        if (class40.field545 != null) {
            class40.field545.method467(class86.field1364, (byte) 117);
        }
        class240.method1623(0);
        class276.method1852(9366);
        field2320++;
        class40.field545 = null;
        if (class239.field3821 != null) {
            class239.field3821.method395((byte) 116);
        }
        if (class54.field739 != null) {
            class54.field739.method395((byte) 116);
        }
        class68.field958.method1551(-3);
        class75.field1063.method461(22);
        try {
            if (class184.field2890 != null) {
                class184.field2890.method997(true);
            }
            if (arg0 <= 118) {
                method1036((class214[]) null, -28, 94, -75, -16, -24, -57, 102);
            }
            if (class186.field2919 != null) {
                for (int var2 = 0; var2 < class186.field2919.length; var2++) {
                    if (class186.field2919[var2] != null) {
                        class186.field2919[var2].method997(true);
                    }
                }
            }
            if (class223.field3608 != null) {
                class223.field3608.method997(true);
            }
            if (class98.field1528 != null) {
                class98.field1528.method997(true);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method974(byte arg0) {
        class99.method656(-21335);
        class75.field1063 = new class67();
        class68.field958 = new class227();
        field2318++;
        if (class165.field2562 != 0) {
            class40.field551 = new byte[50][];
        }
        class46.method345(class2.field23, 382);
        if (class184.field2892 == 0) {
            class235.field3773 = this.getCodeBase().getHost();
            class202.field3170 = 43594;
            class209.field3263 = 443;
        } else if (class184.field2892 == 1) {
            class235.field3773 = this.getCodeBase().getHost();
            class202.field3170 = class231.field3718 + 40000;
            class209.field3263 = class231.field3718 + 50000;
        } else if (class184.field2892 == 2) {
            class235.field3773 = "127.0.0.1";
            class202.field3170 = class231.field3718 + 40000;
            class209.field3263 = class231.field3718 + 50000;
        }
        if (class80.field1151 == 1) {
            class227.field3654 = class232.field3729;
            class46.field591 = class186.field2907;
            class129.field1890 = true;
            class224.field3613 = class50.field667;
            class135.field1956 = class56.field788;
        } else {
            class135.field1956 = class276.field4391;
            class46.field591 = class51.field712;
            class224.field3613 = class204.field3203;
            class227.field3654 = class153.field2266;
        }
        class198.field3109 = class202.field3170;
        class34.field442 = class235.field3773;
        class155.field2304 = class202.field3170;
        class104.field1607 = class209.field3263;
        class177.field2760 = class155.field2304;
        if (class20.field248 == 3 && class184.field2892 != 2) {
            class30.field402 = class231.field3718;
        }
        class252.field4027 = class280.field4444 = class282.field4475 = class157.field2424 = new short[256];
        class290.method1927(22);
        class229.method1569(256, class86.field1364);
        class222.method1508((byte) -124, class86.field1364);
        class40.field545 = class290.method1930((byte) -63);
        int var2 = 109 / ((9 - arg0) / 43);
        if (class40.field545 != null) {
            class40.field545.method465(20646, class86.field1364);
        }
        class76.field1073 = class20.field248;
        try {
            if (class2.field23.field234 != null) {
                class184.field2890 = new class149(class2.field23.field234, 5200, 0);
                for (int var3 = 0; var3 < 28; var3++) {
                    class186.field2919[var3] = new class149(class2.field23.field245[var3], 6000, 0);
                }
                class223.field3608 = new class149(class2.field23.field242, 6000, 0);
                class266.field4272 = new class237(255, class184.field2890, class223.field3608, 500000);
                class98.field1528 = new class149(class2.field23.field239, 24, 0);
                class2.field23.field245 = null;
                class2.field23.field239 = null;
                class2.field23.field234 = null;
                class2.field23.field242 = null;
            }
        } catch (IOException var4) {
            class266.field4272 = null;
            class184.field2890 = null;
            class98.field1528 = null;
            class223.field3608 = null;
        }
        if (class184.field2892 != 0) {
            class248.field3966 = true;
        }
        class204.field3202 = class62.field855;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1042() {
        for (int var0 = 0; var0 < class243.field3890; var0++) {
            class284 var1 = class190.field2993[var0];
            class268.method1821(var1);
            class190.field2993[var0] = null;
        }
        class243.field3890 = 0;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2313++;
        if (!this.method977(true)) {
            return;
        }
        class231.field3718 = Integer.parseInt(this.getParameter("worldid"));
        class184.field2892 = Integer.parseInt(this.getParameter("modewhere"));
        if (class184.field2892 < 0 || class184.field2892 > 1) {
            class184.field2892 = 0;
        }
        class165.field2562 = Integer.parseInt(this.getParameter("modewhat"));
        if (class165.field2562 < 0 || class165.field2562 > 2) {
            class165.field2562 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class236.field3776 = true;
        } else {
            class236.field3776 = false;
        }
        try {
            class48.field614 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class48.field614 = 0;
        }
        class190.method1330(class48.field614, 0);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class201.field3141 = true;
        } else {
            class201.field3141 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class248.field3965 = true;
        } else {
            class248.field3965 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class80.field1151 = 1;
        } else {
            class80.field1151 = 0;
        }
        try {
            class266.field4268 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class266.field4268 = 0;
        }
        class167.field2574 = this.getParameter("settings");
        if (class167.field2574 == null) {
            class167.field2574 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class204.field3201 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class204.field3201 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class134.field1949 = true;
        } else {
            class134.field1949 = false;
        }
        class215.field3506 = this;
        this.method975(765, class165.field2562 + 32, 503, true, 532);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1043(byte arg0) {
        field2321++;
        boolean var2 = class68.field958.method1547(111);
        int var3 = 83 % ((29 - arg0) / 56);
        if (!var2) {
            this.method1034(84);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public static void method1044(boolean arg0) {
        if (!arg0) {
            method1038((class214) null);
        }
        field2315 = null;
        field2329 = null;
        field2331 = null;
        field2330 = null;
        field2332 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method978(int arg0) {
        field2327++;
        if (class203.field3182 == 1000) {
            return;
        }
        if (arg0 > -13) {
            field2330 = null;
        }
        class111.field1684++;
        if (class111.field1684 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class142.field2090 = var2.get(11) * 600 - (-(var2.get(12) * 10) - var2.get(13) / 6);
            class131.field1915.setSeed((long) class142.field2090);
        }
        this.method1043((byte) 123);
        if (class50.field656 != null) {
            class50.field656.method1632(-7049);
        }
        class242.method1636(7822);
        class10.method63(13371);
        class140.method939(-6635);
        class153.method1019(-66);
        if (class40.field545 != null) {
            int var3 = class40.field545.method463(2);
            class232.field3728 = var3;
        }
        if (class203.field3182 == 0) {
            this.method1039(75);
            class236.method1601(true);
        } else if (class203.field3182 == 5) {
            this.method1039(75);
            class236.method1601(true);
        } else if (class203.field3182 == 25 || class203.field3182 == 28) {
            class241.method1629(2314);
        }
        if (class203.field3182 == 10) {
            this.method1040(-124);
            class190.method1336(true);
            class50.method364(-5);
            class177.method1235(false);
        } else if (class203.field3182 == 30) {
            class45.method343((byte) 82);
        } else if (class203.field3182 == 40) {
            class177.method1235(false);
            if (class149.field2208 != -3) {
                if (class149.field2208 == 15) {
                    class268.method1820(1);
                } else if (class149.field2208 != 2) {
                    class147.method984((byte) -120);
                    return;
                }
                return;
            }
        }
    }
}
