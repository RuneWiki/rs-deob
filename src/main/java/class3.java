import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field16 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field20 = 0;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Ldc;")
    public static class37 field24 = class185.method1233((byte) 86, ":duelfriend:");

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Ldc;")
    private static class37 field21 = class185.method1233((byte) 86, "M");

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field25 = 0;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Ldc;")
    public static class37 field23 = class185.method1233((byte) 86, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Ldc;")
    private static class37 field26 = class185.method1233((byte) 86, "Close");

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Ldc;")
    private static class37 field30 = class185.method1233((byte) 86, "Bad session id)3");

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Ldc;")
    public static class37 field22 = field21;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "Ldc;")
    public static class37 field29 = field21;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Ldc;")
    public static class37 field27 = field30;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Ldc;")
    public static class37 field19 = field26;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method27(int arg0) {
        field21 = null;
        field23 = null;
        field19 = null;
        field27 = null;
        if (arg0 != 32) {
            method27(65);
        }
        field29 = null;
        field22 = null;
        field30 = null;
        field24 = null;
        field26 = null;
        field16 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZLmf;I)V")
    public static final void method28(int arg0, int arg1, boolean arg2, class136 arg3, int arg4) {
        field15++;
        if (arg2) {
            field24 = null;
        }
        class108.method707((byte) 80);
        class48.method408(arg4, arg0, arg3.field2638 + arg4, arg3.field2509 + arg0);
        if (class239.field4389 == 2 || class239.field4389 == 5) {
            class48.method414(arg4, arg0, 0, arg3.field2574, arg3.field2619);
        } else {
            int var5 = class82.field1454 + class91.field1571 & 0x7FF;
            int var6 = 464 - class238.field4382.field3490 / 32;
            int var7 = class238.field4382.field3505 / 32 + 48;
            ((class182) class118.field2115).method1221(arg4, arg0, arg3.field2638, arg3.field2509, var7, var6, var5, class123.field2208 + 256, arg3.field2574, arg3.field2619);
            for (int var8 = 0; var8 < class233.field4256; var8++) {
                int var41 = class235.field4274[var8] * 4 + 2 - class238.field4382.field3505 / 32;
                int var42 = class153.field2896[var8] * 4 + 2 - class238.field4382.field3490 / 32;
                class30 var43 = class73.method519(class92.field1581[var8], -21035);
                if (var43.field554 != null) {
                    var43 = var43.method256(176743434);
                    if (var43 == null || var43.field559 == -1) {
                        continue;
                    }
                }
                class14.method88(arg3, arg0, var42, 90, var41, class112.field1983[var43.field559], arg4);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var37 = 0; var37 < 104; var37++) {
                    class203 var38 = class183.field3389[class125.field2246][var9][var37];
                    if (var38 != null) {
                        int var39 = var37 * 4 + 2 - class238.field4382.field3490 / 32;
                        int var40 = var9 * 4 + 2 - class238.field4382.field3505 / 32;
                        class14.method88(arg3, arg0, var39, 90, var40, client.field679[0], arg4);
                    }
                }
            }
            for (int var10 = 0; var10 < class95.field1669; var10++) {
                class66 var33 = class70.field1262[class92.field1579[var10]];
                if (var33 != null && var33.method482((byte) -108)) {
                    class206 var34 = var33.field1190;
                    if (var34 != null && var34.field3831 != null) {
                        var34 = var34.method1356(674);
                    }
                    if (var34 != null && var34.field3832 && var34.field3847) {
                        int var35 = var33.field3490 / 32 - class238.field4382.field3490 / 32;
                        int var36 = var33.field3505 / 32 - class238.field4382.field3505 / 32;
                        class14.method88(arg3, arg0, var35, 90, var36, client.field679[1], arg4);
                    }
                }
            }
            for (int var11 = 0; var11 < class76.field1342; var11++) {
                class123 var25 = class8.field107[class9.field122[var11]];
                if (var25 != null && var25.method482((byte) -108)) {
                    int var26 = var25.field3505 / 32 - class238.field4382.field3505 / 32;
                    boolean var27 = false;
                    int var28 = var25.field3490 / 32 - class238.field4382.field3490 / 32;
                    long var29 = var25.field2187.method347(-85);
                    for (int var31 = 0; var31 < class104.field1808; var31++) {
                        if (class147.field2795[var31] == var29 && class162.field3069[var31] != 0) {
                            var27 = true;
                            break;
                        }
                    }
                    boolean var32 = false;
                    if (class238.field4382.field2196 != 0 && var25.field2196 != 0 && class238.field4382.field2196 == var25.field2196) {
                        var32 = true;
                    }
                    if (var27) {
                        class14.method88(arg3, arg0, var28, 90, var26, client.field679[3], arg4);
                    } else if (var32) {
                        class14.method88(arg3, arg0, var28, 90, var26, client.field679[4], arg4);
                    } else {
                        class14.method88(arg3, arg0, var28, 90, var26, client.field679[2], arg4);
                    }
                }
            }
            class25[] var12 = class246.field4504;
            for (int var13 = 0; var13 < var12.length; var13++) {
                class25 var16 = var12[var13];
                if (var16 != null && var16.field429 != 0 && class203.field3758 % 20 < 10) {
                    if (var16.field429 == 1 && var16.field435 >= 0 && class70.field1262.length > var16.field435) {
                        class66 var17 = class70.field1262[var16.field435];
                        if (var17 != null) {
                            int var18 = var17.field3490 / 32 - class238.field4382.field3490 / 32;
                            int var19 = var17.field3505 / 32 - class238.field4382.field3505 / 32;
                            class69.method505(arg3, (byte) -100, arg0, var18, var19, arg4, var16.field431);
                        }
                    }
                    if (var16.field429 == 2) {
                        int var20 = (var16.field437 - class99.field1735) * 4 + 2 - class238.field4382.field3505 / 32;
                        int var21 = (var16.field438 - class124.field2212) * 4 + 2 - class238.field4382.field3490 / 32;
                        class69.method505(arg3, (byte) -100, arg0, var21, var20, arg4, var16.field431);
                    }
                    if (var16.field429 == 10 && var16.field435 >= 0 && class8.field107.length > var16.field435) {
                        class123 var22 = class8.field107[var16.field435];
                        if (var22 != null) {
                            int var23 = var22.field3490 / 32 - class238.field4382.field3490 / 32;
                            int var24 = var22.field3505 / 32 - class238.field4382.field3505 / 32;
                            class69.method505(arg3, (byte) -100, arg0, var23, var24, arg4, var16.field431);
                        }
                    }
                }
            }
            if (class191.field3577 != 0) {
                int var14 = class191.field3577 * 4 + 2 - class238.field4382.field3505 / 32;
                int var15 = class194.field3610 * 4 + 2 - class238.field4382.field3490 / 32;
                class14.method88(arg3, arg0, var15, 90, var14, class229.field4206, arg4);
            }
            class48.method420(arg3.field2638 / 2 + arg4 - 1, arg3.field2509 / 2 - 1 + arg0, 3, 3, 16777215);
        }
        class85.field1505[arg1] = true;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILce;ILbi;)V")
    public static final void method29(int arg0, class28 arg1, int arg2, class21 arg3) {
        field17++;
        int var4 = -115 / ((10 - arg2) / 40);
        class246 var5 = new class246();
        var5.field4502 = arg1.method215(-1797813752);
        var5.field4494 = arg1.method226(-48);
        var5.field4493 = new class132[var5.field4502];
        var5.field4492 = new byte[var5.field4502][][];
        var5.field4490 = new int[var5.field4502];
        var5.field4500 = new class132[var5.field4502];
        var5.field4501 = new int[var5.field4502];
        var5.field4496 = new int[var5.field4502];
        for (int var6 = 0; var6 < var5.field4502; var6++) {
            try {
                int var7 = arg1.method215(-1797813752);
                if (var7 == 0 || var7 == 1 || var7 == 2) {
                    String var18 = new String(arg1.method180(2).method310(true));
                    int var19 = 0;
                    String var20 = new String(arg1.method180(2).method310(true));
                    if (var7 == 1) {
                        var19 = arg1.method226(116);
                    }
                    var5.field4501[var6] = var7;
                    var5.field4490[var6] = var19;
                    var5.field4500[var6] = arg3.method144(class242.method1582(var18, (byte) -65), -99, var20);
                } else if (var7 == 3 || var7 == 4) {
                    String var8 = new String(arg1.method180(2).method310(true));
                    String var9 = new String(arg1.method180(2).method310(true));
                    int var10 = arg1.method215(-1797813752);
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = new String(arg1.method180(2).method310(true));
                    }
                    byte[][] var13 = new byte[var10][];
                    if (var7 == 3) {
                        for (int var14 = 0; var14 < var10; var14++) {
                            int var15 = arg1.method226(-25);
                            var13[var14] = new byte[var15];
                            arg1.method204(var15, var13[var14], 96, 0);
                        }
                    }
                    var5.field4501[var6] = var7;
                    Class[] var16 = new Class[var10];
                    for (int var17 = 0; var17 < var10; var17++) {
                        var16[var17] = class242.method1582(var11[var17], (byte) -65);
                    }
                    var5.field4493[var6] = arg3.method143(var9, var16, class242.method1582(var8, (byte) -65), 2);
                    var5.field4492[var6] = var13;
                }
            } catch (ClassNotFoundException var21) {
                var5.field4496[var6] = -1;
            } catch (SecurityException var22) {
                var5.field4496[var6] = -2;
            } catch (NullPointerException var23) {
                var5.field4496[var6] = -3;
            } catch (Exception var24) {
                var5.field4496[var6] = -4;
            } catch (Throwable var25) {
                var5.field4496[var6] = -5;
            }
        }
        class163.field3076.method1340(61, var5);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ldc;I)V")
    public static final void method30(class37 arg0, int arg1) {
        field18++;
        if (class10.field130.field347 == null) {
            return;
        }
        try {
            class37 var2 = class168.field3199.method335(arg1 ^ 0xFFFFC18C, class10.field130.field347);
            class37 var3 = class190.field3536.method335(arg1 ^ 0xFFFFC18C, class10.field130.field347);
            class37 var4 = class80.method548(new class37[] { var2, class39.field813, arg0, class204.field3793, var3 }, -108);
            class37 var5;
            if (arg0.method334(-61) == arg1) {
                var5 = class80.method548(new class37[] { var4, class221.field4105 }, arg1 - 48);
            } else {
                var5 = class80.method548(new class37[] { var4, class81.field1444, class125.method848((byte) 86, class214.method1416(22624) + 94608000000L), class15.field230, class174.method1175(-16309, 94608000L) }, -60);
            }
            class80.method548(new class37[] { class149.field2827, var5, class14.field202 }, -55).method306(0, class10.field130.field347);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IJ)V")
    public static final void method31(int arg0, long arg1) {
        field14++;
        if (arg1 == 0L) {
            return;
        }
        if (class59.field1100 >= 100) {
            class215.method1418(0, ~arg0, class31.field626, class243.field4462);
            return;
        }
        class37 var3 = class184.method1228(-1, arg1).method317((byte) 59);
        for (int var4 = 0; var4 < class59.field1100; var4++) {
            if (class193.field3606[var4] == arg1) {
                class215.method1418(0, -1, class80.method548(new class37[] { var3, class176.field3331 }, -19), class243.field4462);
                return;
            }
        }
        for (int var5 = arg0; var5 < class104.field1808; var5++) {
            if (class147.field2795[var5] == arg1) {
                class215.method1418(0, -1, class80.method548(new class37[] { class153.field2903, var3, class120.field2138 }, -90), class243.field4462);
                return;
            }
        }
        if (var3.method346(class238.field4382.field2187, (byte) -49)) {
            class215.method1418(0, -1, class104.field1805, class243.field4462);
            return;
        }
        class35.field712++;
        class193.field3606[class59.field1100] = arg1;
        class128.field2388[class59.field1100++] = class184.method1228(arg0 - 1, arg1);
        class168.field3197 = class112.field1963;
        class49.field970.method1503(137, arg0 + 2976);
        class49.field970.method190(arg1, (byte) -123);
    }
}
