import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class146 extends class75 {

    @OriginalMember(owner = "client!v", name = "P", descriptor = "[Lqf;")
    public class117[] field3348;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "Lod;")
    public static class101 field3352 = class46.method335(-109, ")4slr)3ws?order=LPWM");

    @OriginalMember(owner = "client!v", name = "O", descriptor = "Lcb;")
    public static class17 field3347 = new class17(100);

    @OriginalMember(owner = "client!v", name = "U", descriptor = "Lod;")
    private static class101 field3353 = class46.method335(85, "Unexpected server response");

    @OriginalMember(owner = "client!v", name = "V", descriptor = "Lod;")
    public static class101 field3354 = field3353;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
    public static void method1150(byte arg0) {
        if (arg0 >= 0) {
            field3347 = null;
            field3353 = null;
            field3354 = null;
            field3352 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Z")
    public static final boolean method1151(int arg0, int arg1) {
        field3343++;
        if (arg1 == 0) {
            return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lme;Lme;Z)V")
    public static final void method1152(class88 arg0, class88 arg1, boolean arg2) {
        field3344++;
        if (class61.field1367 == null) {
            class61.field1367 = class40.method304(class85.field1863, class7.field99, class20.field442, -1);
        }
        if (class131.field2996 == null) {
            class131.field2996 = class100.method691(class93.field1989, class20.field442, class85.field1863, -1860);
        }
        if (class131.field2986 == null) {
            class131.field2986 = class100.method691(class34.field866, class20.field442, class85.field1863, -1860);
        }
        if (arg2) {
            field3355 = -122;
        }
        if (class92.field1982 == null) {
            class92.field1982 = class100.method691(class26.field661, class20.field442, class85.field1863, -1860);
        }
        class38.method275(0, 23, 765, 480, 0);
        class38.method283(0, 0, 125, 23, 12425273, 9135624);
        class38.method283(125, 0, 640, 23, 5197647, 2697513);
        arg1.method850(class10.field146, 62, 15, 0, -1);
        if (class92.field1982 != null) {
            class92.field1982[1].method884(140, 1);
            arg0.method852(class148.field3379, 152, 10, 16777215, -1);
            class92.field1982[0].method884(140, 12);
            arg0.method852(class54.field1220, 152, 21, 16777215, -1);
        }
        if (class131.field2986 != null) {
            short var3 = 280;
            short var4 = 390;
            if (class80.field1709[0] == 0 && class3.field54[0] == 0) {
                class131.field2986[2].method884(var3, 4);
            } else {
                class131.field2986[0].method884(var3, 4);
            }
            short var5 = 500;
            if (class80.field1709[0] == 0 && class3.field54[0] == 1) {
                class131.field2986[3].method884(var3 + 15, 4);
            } else {
                class131.field2986[1].method884(var3 + 15, 4);
            }
            arg1.method852(class27.field722, var3 + 32, 17, 16777215, -1);
            if (class80.field1709[0] == 1 && class3.field54[0] == 0) {
                class131.field2986[2].method884(var4, 4);
            } else {
                class131.field2986[0].method884(var4, 4);
            }
            if (class80.field1709[0] == 1 && class3.field54[0] == 1) {
                class131.field2986[3].method884(var4 + 15, 4);
            } else {
                class131.field2986[1].method884(var4 + 15, 4);
            }
            short var6 = 610;
            arg1.method852(class89.field1934, var4 + 32, 17, 16777215, -1);
            if (class80.field1709[0] == 2 && class3.field54[0] == 0) {
                class131.field2986[2].method884(var5, 4);
            } else {
                class131.field2986[0].method884(var5, 4);
            }
            if (class80.field1709[0] == 2 && class3.field54[0] == 1) {
                class131.field2986[3].method884(var5 + 15, 4);
            } else {
                class131.field2986[1].method884(var5 + 15, 4);
            }
            arg1.method852(class31.field793, var5 + 32, 17, 16777215, -1);
            if (class80.field1709[0] == 3 && class3.field54[0] == 0) {
                class131.field2986[2].method884(var6, 4);
            } else {
                class131.field2986[0].method884(var6, 4);
            }
            if (class80.field1709[0] == 3 && class3.field54[0] == 1) {
                class131.field2986[3].method884(var6 + 15, 4);
            } else {
                class131.field2986[1].method884(var6 + 15, 4);
            }
            arg1.method852(class52.field1187, var6 + 32, 17, 16777215, -1);
        }
        class38.method275(708, 4, 50, 16, 0);
        arg0.method850(class144.field3327, 733, 16, 16777215, -1);
        class32.field839 = -1;
        if (class61.field1367 != null) {
            byte var7 = 19;
            byte var8 = 88;
            int var9 = 765 / (var8 + 1);
            int var10 = 480 / (var7 + 1);
            int var11;
            int var12;
            do {
                var11 = var9;
                if ((var9 - 1) * var10 >= class158.field3630) {
                    var9--;
                }
                var12 = var10;
                if (class158.field3630 <= (var10 - 1) * var9) {
                    var10--;
                }
                if ((var10 - 1) * var9 >= class158.field3630) {
                    var10--;
                }
            } while (var10 != var12 || var9 != var11);
            int var13 = (480 - var7 * var10) / (var10 + 1);
            int var14 = (765 - var8 * var9) / (var9 + 1);
            if (var13 > 5) {
                var13 = 5;
            }
            if (var14 > 5) {
                var14 = 5;
            }
            int var15 = (480 - (var10 - 1) * var13 - var7 * var10) / 2;
            int var16 = 0;
            int var17 = var15 + 23;
            int var18 = (765 - var8 * var9 - (var9 + -1) * var14) / 2;
            int var19 = var18;
            for (int var20 = 0; var20 < class158.field3630; var20++) {
                class34 var21 = class95.field2042[var20];
                class101 var22 = class82.method592(false, var21.field880);
                boolean var23 = true;
                if (var21.field880 == -1) {
                    var22 = class32.field837;
                    var23 = false;
                } else if (var21.field880 > 1980) {
                    var22 = class26.field670;
                    var23 = false;
                }
                if (class40.field947 >= var19 && var17 <= class105.field2264 && var8 + var19 > class40.field947 && var7 + var17 > class105.field2264 && var23) {
                    class32.field839 = var20;
                    class61.field1367[var21.field875 ? 1 : 0].method915(var19, var17, 128, 16777215);
                } else {
                    class61.field1367[var21.field875 ? 1 : 0].method934(var19, var17);
                }
                if (class131.field2996 != null) {
                    class131.field2996[var21.field876 + (var21.field875 ? 8 : 0)].method884(var19 + 29, var17);
                }
                arg1.method850(class82.method592(arg2, var21.field879), var19 + 15, var7 / 2 + var17 + 5, 0, -1);
                arg0.method850(var22, var19 + 60, var7 / 2 + var17 + 5, 268435455, -1);
                var17 += var7 + var13;
                var16++;
                if (var16 >= var10) {
                    var16 = 0;
                    var17 = var15 + 23;
                    var19 += var8 + var14;
                }
            }
        }
        try {
            Graphics var24 = class134.field3062.getGraphics();
            class106.field2294.method156(var24, 0, 0, 0);
        } catch (Exception var25) {
            class134.field3062.repaint();
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public static final void method1153(boolean arg0) {
        field3351++;
        if (arg0) {
            method1154(-32, -80);
        }
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(1);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)V")
    public static final void method1154(int arg0, int arg1) {
        class42 var2 = (class42) class153.field3494.method1142((byte) -92);
        if (arg1 != -1) {
            method1152(null, null, false);
        }
        while (var2 != null) {
            if ((long) arg0 == (var2.field2723 >> 48 & 0xFFFFL)) {
                var2.method959(arg1 ^ 0xFFFFD1C4);
            }
            var2 = (class42) class153.field3494.method1136(-9485);
        }
        field3349++;
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
    public static final void method1155(int arg0) {
        if (class54.field1228 > 0) {
            class54.field1228--;
        }
        field3346++;
        if (class20.field435 > 1) {
            class20.field435--;
        }
        if (class83.field1820) {
            class83.field1820 = false;
            class141.method1125(92);
            return;
        }
        for (int var1 = 0; var1 < 100 && class64.method436(false); var1++) {
        }
        if (class145.field3335 != 30) {
            return;
        }
        class129.method997(class17.field364, 208, (byte) -86);
        Object var2 = class39.field941.field1054;
        synchronized (class39.field941.field1054) {
            if (!class150.field3440) {
                class39.field941.field1056 = 0;
            } else if (class119.field2629 != 0 || class39.field941.field1056 >= 40) {
                class93.field2001++;
                class17.field364.method419(58, (byte) 0);
                class17.field364.method1101(0, (byte) -32);
                int var3 = class17.field364.field3175;
                int var4 = 0;
                for (int var5 = 0; class39.field941.field1056 > var5 && class17.field364.field3175 - var3 < 240; var5++) {
                    int var6 = class39.field941.field1060[var5];
                    var4++;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = class39.field941.field1062[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class39.field941.field1060[var5] == -1 && class39.field941.field1062[var5] == -1) {
                        var6 = -1;
                        var8 = 524287;
                        var7 = -1;
                    }
                    if (class150.field3438 != var7 || class95.field2064 != var6) {
                        int var9 = var6 - class95.field2064;
                        class95.field2064 = var6;
                        int var10 = var7 - class150.field3438;
                        class150.field3438 = var7;
                        if (class43.field1025 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class17.field364.method1068((class43.field1025 << 12) + (var10 << 6) + var9, 28588);
                            class43.field1025 = 0;
                        } else if (class43.field1025 < 8) {
                            class17.field364.method1081((class43.field1025 << 19) + var8 + 8388608, 215180960);
                            class43.field1025 = 0;
                        } else {
                            class17.field364.method1090((byte) 38, var8 + (class43.field1025 << 19) - 1073741824);
                            class43.field1025 = 0;
                        }
                    } else if (class43.field1025 < 2047) {
                        class43.field1025++;
                    }
                }
                class17.field364.method1099(class17.field364.field3175 - var3, false);
                if (var4 >= class39.field941.field1056) {
                    class39.field941.field1056 = 0;
                } else {
                    class39.field941.field1056 -= var4;
                    for (int var11 = 0; var11 < class39.field941.field1056; var11++) {
                        class39.field941.field1062[var11] = class39.field941.field1062[var4 + var11];
                        class39.field941.field1060[var11] = class39.field941.field1060[var11 + var4];
                    }
                }
            }
        }
        if (class119.field2629 != 0) {
            long var12 = (class118.field2615 - class133.field3043) / 50L;
            class120.field2636++;
            class133.field3043 = class118.field2615;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            int var14 = class147.field3369;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 764) {
                var14 = 764;
            }
            int var15 = class80.field1684;
            int var16 = (int) var12;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            int var17 = var15 * 765 + var14;
            byte var18 = 0;
            if (class119.field2629 == 2) {
                var18 = 1;
            }
            class17.field364.method419(43, (byte) 0);
            class17.field364.method1102((var16 << 20) + (var18 << 19) + var17, -1207872368);
        }
        if (class28.field753[96] || class28.field753[97] || class28.field753[98] || class28.field753[99]) {
            class24.field619 = true;
        }
        if (class35.field895 > 0) {
            class35.field895--;
        }
        if (class24.field619 && class35.field895 <= 0) {
            class24.field619 = false;
            class157.field3616++;
            class35.field895 = 20;
            class17.field364.method419(73, (byte) 0);
            class17.field364.method1054(-107593528, class54.field1226);
            class17.field364.method1078(128, class97.field2100);
        }
        if (class119.field2624 && !class36.field915) {
            class67.field1496++;
            class36.field915 = true;
            class17.field364.method419(83, (byte) 0);
            class17.field364.method1101(1, (byte) -32);
        }
        if (!class119.field2624 && class36.field915) {
            class67.field1496++;
            class36.field915 = false;
            class17.field364.method419(83, (byte) 0);
            class17.field364.method1101(0, (byte) -32);
        }
        class25.method198(-32013);
        if (class145.field3335 != 30) {
            return;
        }
        class29.method230((byte) -112);
        class56.method397((byte) -42);
        class120.field2638++;
        if (class120.field2638 > 750) {
            class141.method1125(79);
            return;
        }
        class35.method261(false);
        class17.method139(0);
        class5.method26(-25561);
        if (class86.field1909 != 0) {
            class83.field1817 += 20;
            if (class83.field1817 >= 400) {
                class86.field1909 = 0;
            }
        }
        class141.field3255++;
        if (class26.field698 != null) {
            class83.field1821++;
            if (class83.field1821 >= 15) {
                class40.method300(false, class26.field698);
                class26.field698 = null;
            }
        }
        if (class93.field2000 != null) {
            class40.method300(false, class93.field2000);
            if (class111.field2378 + 5 < class40.field947 || class40.field947 < class111.field2378 - 5 || class20.field436 + 5 < class105.field2264 || class20.field436 - 5 > class105.field2264) {
                class92.field1983 = true;
            }
            class145.field3330++;
            if (class27.field724 == 0) {
                if (class92.field1983 && class145.field3330 >= 5) {
                    if (class93.field2000 == class90.field1966 && class86.field1906 != class52.field1180) {
                        class62.field1379++;
                        class126 var19 = class93.field2000;
                        byte var20 = 0;
                        if (class105.field2268 == 1 && var19.field2856 == 206) {
                            var20 = 1;
                        }
                        if (var19.field2841[class52.field1180] <= 0) {
                            var20 = 0;
                        }
                        if (class44.method322((byte) -27, class42.method313(var19, (byte) -121))) {
                            int var21 = class86.field1906;
                            int var22 = class52.field1180;
                            var19.field2841[var22] = var19.field2841[var21];
                            var19.field2838[var22] = var19.field2838[var21];
                            var19.field2841[var21] = -1;
                            var19.field2838[var21] = 0;
                        } else if (var20 == 1) {
                            int var23 = class86.field1906;
                            int var24 = class52.field1180;
                            while (var23 != var24) {
                                if (var24 < var23) {
                                    var19.method964(var23, (byte) 45, var23 - 1);
                                    var23--;
                                } else if (var23 < var24) {
                                    var19.method964(var23, (byte) 45, var23 + 1);
                                    var23++;
                                }
                            }
                        } else {
                            var19.method964(class86.field1906, (byte) 45, class52.field1180);
                        }
                        class17.field364.method419(124, (byte) 0);
                        class17.field364.method1068(class86.field1906, 28588);
                        class17.field364.method1063((byte) 125, class93.field2000.field2780);
                        class17.field364.method1101(var20, (byte) -32);
                        class17.field364.method1085(false, class52.field1180);
                    }
                } else if ((client.field482 == 1 || class157.method1216(class54.field1244 - 1, true)) && class54.field1244 > 2) {
                    class102.method744(765);
                } else if (class54.field1244 > 0) {
                    class118.method892(0, class54.field1244 - 1);
                }
                class119.field2629 = 0;
                class83.field1821 = 10;
                class93.field2000 = null;
            }
        }
        class140.field3232 = false;
        class17.field366 = false;
        class57.field1338 = 0;
        class34.field872 = null;
        class126 var25 = client.field485;
        class126 var26 = class153.field3501;
        class153.field3501 = null;
        client.field485 = null;
        while (class48.method359((byte) -68) && class57.field1338 < 128) {
            class121.field2656[class57.field1338] = class99.field2147;
            class34.field878[class57.field1338] = class11.field204;
            class57.field1338++;
        }
        class6.method32(class62.field1382, 0, 503, 765, 0, 0, 0, (byte) 113);
        class108.field2306++;
        while (true) {
            class141 var27;
            class126 var28;
            class126 var29;
            do {
                var27 = (class141) class53.field1202.method536(-8898);
                if (var27 == null) {
                    while (true) {
                        class141 var30;
                        class126 var31;
                        class126 var32;
                        do {
                            var30 = (class141) class24.field573.method536(-8898);
                            if (var30 == null) {
                                while (true) {
                                    class141 var33;
                                    class126 var34;
                                    class126 var35;
                                    do {
                                        var33 = (class141) class28.field747.method536(-8898);
                                        if (var33 == null) {
                                            if (class99.field2146 != null) {
                                                class96.method671(-1201781456);
                                            }
                                            if (class81.field1753 != -1) {
                                                int var36 = class81.field1753;
                                                int var37 = class81.field1732;
                                                boolean var38 = class40.method306(var37, 0, 0, 0, true, class82.field1778.field1291[0], class82.field1778.field1271[0], 0, 0, var36, 0, (byte) 47);
                                                class81.field1753 = -1;
                                                if (var38) {
                                                    class140.field3228 = class80.field1684;
                                                    class83.field1817 = 0;
                                                    class86.field1909 = 1;
                                                    class27.field718 = class147.field3369;
                                                }
                                            }
                                            class11.method53(true);
                                            if (client.field485 != var25) {
                                                if (var25 != null) {
                                                    class40.method300(false, var25);
                                                }
                                                if (client.field485 != null) {
                                                    class40.method300(false, client.field485);
                                                }
                                            }
                                            if (class153.field3501 != var26 && class154.field3511 == class148.field3374) {
                                                if (var26 != null) {
                                                    class40.method300(false, var26);
                                                }
                                                if (class153.field3501 != null) {
                                                    class40.method300(false, class153.field3501);
                                                }
                                            }
                                            if (class153.field3501 == null) {
                                                if (class154.field3511 > 0) {
                                                    class154.field3511--;
                                                }
                                            } else if (class154.field3511 < class148.field3374) {
                                                class154.field3511++;
                                                if (class154.field3511 == class148.field3374) {
                                                    class40.method300(false, class153.field3501);
                                                }
                                            }
                                            class25.method205(false);
                                            if (class84.field1823) {
                                                class42.method312((byte) -18);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class143.field3292[var39]++;
                                            }
                                            int var40 = class46.method332(27);
                                            int var41 = class85.method614((byte) -69);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class13.field257++;
                                                class54.field1228 = 250;
                                                class25.method201(5953, 4000);
                                                class17.field364.method419(35, (byte) 0);
                                            }
                                            class53.field1201++;
                                            if (class53.field1201 > 500) {
                                                class53.field1201 = 0;
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x1) == 1) {
                                                    class15.field317 += class44.field1044;
                                                }
                                                if ((var42 & 0x4) == 4) {
                                                    class155.field3563 += class11.field158;
                                                }
                                                if ((var42 & 0x2) == 2) {
                                                    class57.field1314 += class106.field2295;
                                                }
                                            }
                                            class85.field1847++;
                                            if (class155.field3563 < -40) {
                                                class11.field158 = 1;
                                            }
                                            if (class85.field1847 > 500) {
                                                int var43 = (int) (Math.random() * 8.0D);
                                                class85.field1847 = 0;
                                                if ((var43 & 0x2) == 2) {
                                                    class141.field3260 += class90.field1959;
                                                }
                                                if ((var43 & 0x1) == 1) {
                                                    class79.field1652 += class42.field1020;
                                                }
                                            }
                                            if (class155.field3563 > 40) {
                                                class11.field158 = -1;
                                            }
                                            if (class141.field3260 < -20) {
                                                class90.field1959 = 1;
                                            }
                                            class142.field3271++;
                                            if (class79.field1652 < -60) {
                                                class42.field1020 = 2;
                                            }
                                            if (class57.field1314 < -55) {
                                                class106.field2295 = 2;
                                            }
                                            if (class79.field1652 > 60) {
                                                class42.field1020 = -2;
                                            }
                                            if (class15.field317 < -50) {
                                                class44.field1044 = 2;
                                            }
                                            if (arg0 > -97) {
                                                return;
                                            }
                                            if (class57.field1314 > 55) {
                                                class106.field2295 = -2;
                                            }
                                            if (class141.field3260 > 10) {
                                                class90.field1959 = -1;
                                            }
                                            if (class15.field317 > 50) {
                                                class44.field1044 = -2;
                                            }
                                            if (class142.field3271 > 50) {
                                                class118.field2591++;
                                                class17.field364.method419(164, (byte) 0);
                                            }
                                            try {
                                                if (class90.field1958 != null && class17.field364.field3175 > 0) {
                                                    class90.field1958.method442(class17.field364.field3175, -111, 0, class17.field364.field3213);
                                                    class142.field3271 = 0;
                                                    class17.field364.field3175 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class141.method1125(118);
                                                return;
                                            }
                                        }
                                        var34 = var33.field3238;
                                        if (var34.field2807 < 0) {
                                            break;
                                        }
                                        var35 = class78.method532(0, var34.field2794);
                                    } while (var35 == null || var35.field2822 == null || var35.field2822.length <= var34.field2807 || var35.field2822[var34.field2807] != var34);
                                    class31.method237((byte) -71, var33);
                                }
                            }
                            var31 = var30.field3238;
                            if (var31.field2807 < 0) {
                                break;
                            }
                            var32 = class78.method532(0, var31.field2794);
                        } while (var32 == null || var32.field2822 == null || var31.field2807 >= var32.field2822.length || var32.field2822[var31.field2807] != var31);
                        class31.method237((byte) -71, var30);
                    }
                }
                var28 = var27.field3238;
                if (var28.field2807 < 0) {
                    break;
                }
                var29 = class78.method532(0, var28.field2794);
            } while (var29 == null || var29.field2822 == null || var28.field2807 >= var29.field2822.length || var29.field2822[var28.field2807] != var28);
            class31.method237((byte) -71, var27);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)Z")
    public final boolean method1156(byte arg0, int arg1) {
        if (arg0 < 29) {
            field3353 = null;
        }
        field3340++;
        return this.field3348[arg1].field2579;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lc;Lc;IZ)V")
    public class146(class15 arg0, class15 arg1, int arg2, boolean arg3) {
        class78 var5 = new class78();
        int var6 = arg0.method112(arg2, 1);
        this.field3348 = new class117[var6];
        int[] var7 = arg0.method113(arg2, 0);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method114((byte) 113, arg2, var7[var8]);
            int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            class137 var11 = null;
            for (class137 var12 = (class137) var5.method523(false); var12 != null; var12 = (class137) var5.method527(true)) {
                if (var12.field3133 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method123(0, (byte) 112, var10);
                } else {
                    var13 = arg1.method123(var10, (byte) 112, 0);
                }
                var11 = new class137(var10, var13);
                var5.method529(var11, 19002);
            }
            this.field3348[var7[var8]] = new class117(var9, var11);
        }
    }
}
