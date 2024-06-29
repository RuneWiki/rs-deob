import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class48 {

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Lrf;")
    private static class163 field938 = class53.method392(-65, "purple:");

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field936 = 0;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field941 = 0;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "Lrf;")
    public static class163 field943 = field938;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Lrf;")
    private static class163 field933 = class53.method392(52, "Connection lost)3");

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "Lrf;")
    public static class163 field946 = class53.method392(80, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "[I")
    public static int[] field942 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Lrf;")
    public static class163 field930 = field933;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field944 = 0;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Lrf;")
    public static class163 field940 = field938;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "[I")
    public static int[] field935;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZB)V")
    public static final void method288(boolean arg0, byte arg1) {
        class186.field3715 = arg0;
        if (class186.field3715) {
            int var15 = class105.field2195.method387((byte) 88);
            int var16 = class105.field2195.method378(false);
            int var17 = class105.field2195.method387((byte) 88);
            class105.field2195.method328(-99);
            for (int var18 = 0; var18 < 4; var18++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    for (int var37 = 0; var37 < 13; var37++) {
                        int var38 = class105.field2195.method331(1, -2055311549);
                        if (var38 == 1) {
                            class16.field270[var18][var36][var37] = class105.field2195.method331(26, -2055311549);
                        } else {
                            class16.field270[var18][var36][var37] = -1;
                        }
                    }
                }
            }
            class105.field2195.method334(-7);
            int var19 = (class74.field1554 - class105.field2195.field1033) / 16;
            class60.field1221 = new int[var19][4];
            for (int var20 = 0; var20 < var19; var20++) {
                for (int var35 = 0; var35 < 4; var35++) {
                    class60.field1221[var20][var35] = class105.field2195.method339((byte) -59);
                }
            }
            int var21 = class105.field2195.method390((byte) 110);
            int var22 = class105.field2195.method349((byte) 93);
            class39.field809 = new int[var19];
            class73.field1524 = new int[var19];
            class163.field3347 = new byte[var19][];
            class25.field460 = new int[var19];
            class163.field3324 = new byte[var19][];
            int var23 = 0;
            for (int var24 = 0; var24 < 4; var24++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    for (int var27 = 0; var27 < 13; var27++) {
                        int var28 = class16.field270[var24][var26][var27];
                        if (var28 != -1) {
                            int var29 = var28 >> 14 & 0x3FF;
                            int var30 = var28 >> 3 & 0x7FF;
                            int var31 = (var29 / 8 << 8) + var30 / 8;
                            for (int var32 = 0; var32 < var23; var32++) {
                                if (class25.field460[var32] == var31) {
                                    var31 = -1;
                                    break;
                                }
                            }
                            if (var31 != -1) {
                                class25.field460[var23] = var31;
                                int var33 = var31 & 0xFF;
                                int var34 = var31 >> 8 & 0xFF;
                                class73.field1524[var23] = class72.field1519.method1228(93, class180.method1216(new class163[] { class39.field804, class34.method217(var34, -66), class115.field2431, class34.method217(var33, -59) }, false));
                                class39.field809[var23] = class72.field1519.method1228(90, class180.method1216(new class163[] { class74.field1549, class34.method217(var34, -81), class115.field2431, class34.method217(var33, -115) }, false));
                                var23++;
                            }
                        }
                    }
                }
            }
            class189.method1281(var16, var17, true, var15, var21, var22);
        } else {
            int var2 = class105.field2195.method390((byte) 91);
            int var3 = class105.field2195.method390((byte) 102);
            int var4 = class105.field2195.method344(255);
            int var5 = (class74.field1554 - class105.field2195.field1033) / 16;
            class60.field1221 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class60.field1221[var6][var14] = class105.field2195.method339((byte) 126);
                }
            }
            int var7 = class105.field2195.method349((byte) 93);
            int var8 = class105.field2195.method387((byte) 88);
            class25.field460 = new int[var5];
            boolean var9 = false;
            class39.field809 = new int[var5];
            class163.field3347 = new byte[var5][];
            class163.field3324 = new byte[var5][];
            if ((var7 / 8 == 48 || var7 / 8 == 49) && (var8 / 8) == 48) {
                var9 = true;
            }
            if (var7 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            class73.field1524 = new int[var5];
            int var10 = 0;
            for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class25.field460[var10] = var13;
                        class73.field1524[var10] = class72.field1519.method1228(105, class180.method1216(new class163[] { class39.field804, class34.method217(var11, -72), class115.field2431, class34.method217(var12, -61) }, false));
                        class39.field809[var10] = class72.field1519.method1228(92, class180.method1216(new class163[] { class74.field1549, class34.method217(var11, -91), class115.field2431, class34.method217(var12, -49) }, false));
                        var10++;
                    }
                }
            }
            class189.method1281(var4, var8, true, var2, var3, var7);
        }
        field934++;
        int var25 = 29 % ((arg1 + 32) / 60);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
    public static void method289(boolean arg0) {
        field933 = null;
        field940 = null;
        if (arg0) {
            method292(null, 113, null, null, null);
        }
        field943 = null;
        field935 = null;
        field946 = null;
        field938 = null;
        field942 = null;
        field930 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lne;ILne;)V")
    public static final void method290(class126 arg0, int arg1, class126 arg2) {
        if (class58.field1172 == null) {
            class58.field1172 = class177.method1202(-851066580, class175.field3517, class33.field643, class202.field3986);
        }
        field931++;
        if (class3.field34 == null) {
            class3.field34 = class146.method945(class90.field1945, class175.field3517, class202.field3986, (byte) -35);
        }
        if (class114.field2414 == null) {
            class114.field2414 = class146.method945(class7.field140, class175.field3517, class202.field3986, (byte) -35);
        }
        if (class95.field2035 == null) {
            class95.field2035 = class146.method945(class148.field3051, class175.field3517, class202.field3986, (byte) -35);
        }
        class173.method1173(0, 23, 765, 480, 0);
        class173.method1165(0, 0, 125, 23, 12425273, 9135624);
        class173.method1165(125, 0, 640, 23, 5197647, 2697513);
        if (arg1 != 5) {
            field943 = null;
        }
        arg0.method583(class170.field3461, 62, 15, 0, -1);
        if (class95.field2035 != null) {
            class95.field2035[1].method944(140, 1);
            arg2.method577(class40.field830, 152, 10, 16777215, -1);
            class95.field2035[0].method944(140, 12);
            arg2.method577(class21.field374, 152, 21, 16777215, -1);
        }
        if (class114.field2414 != null) {
            short var3 = 280;
            if (class134.field2780[0] == 0 && class23.field399[0] == 0) {
                class114.field2414[2].method944(var3, 4);
            } else {
                class114.field2414[0].method944(var3, 4);
            }
            if (class134.field2780[0] == 0 && class23.field399[0] == 1) {
                class114.field2414[3].method944(var3 + 15, 4);
            } else {
                class114.field2414[1].method944(var3 + 15, 4);
            }
            short var4 = 390;
            arg0.method577(class130.field2704, var3 + 32, 17, 16777215, -1);
            short var5 = 500;
            if (class134.field2780[0] == 1 && class23.field399[0] == 0) {
                class114.field2414[2].method944(var4, 4);
            } else {
                class114.field2414[0].method944(var4, 4);
            }
            short var6 = 610;
            if (class134.field2780[0] == 1 && class23.field399[0] == 1) {
                class114.field2414[3].method944(var4 + 15, 4);
            } else {
                class114.field2414[1].method944(var4 + 15, 4);
            }
            arg0.method577(class43.field875, var4 + 32, 17, 16777215, -1);
            if (class134.field2780[0] == 2 && class23.field399[0] == 0) {
                class114.field2414[2].method944(var5, 4);
            } else {
                class114.field2414[0].method944(var5, 4);
            }
            if (class134.field2780[0] == 2 && class23.field399[0] == 1) {
                class114.field2414[3].method944(var5 + 15, 4);
            } else {
                class114.field2414[1].method944(var5 + 15, 4);
            }
            arg0.method577(class26.field487, var5 + 32, 17, 16777215, -1);
            if (class134.field2780[0] == 3 && class23.field399[0] == 0) {
                class114.field2414[2].method944(var6, 4);
            } else {
                class114.field2414[0].method944(var6, 4);
            }
            if (class134.field2780[0] == 3 && class23.field399[0] == 1) {
                class114.field2414[3].method944(var6 + 15, 4);
            } else {
                class114.field2414[1].method944(var6 + 15, 4);
            }
            arg0.method577(class120.field2531, var6 + 32, 17, 16777215, -1);
        }
        class173.method1173(708, 4, 50, 16, 0);
        arg2.method583(class75.field1559, 733, 16, 16777215, -1);
        class142.field2910 = -1;
        if (class58.field1172 == null) {
            return;
        }
        byte var7 = 88;
        byte var8 = 19;
        int var9 = 765 / (var7 + 1);
        int var10 = 480 / (var8 + 1);
        int var11;
        int var12;
        do {
            var11 = var10;
            var12 = var9;
            if (class168.field3426 <= (var9 - 1) * var10) {
                var9--;
            }
            if ((var10 - 1) * var9 >= class168.field3426) {
                var10--;
            }
            if (class168.field3426 <= (var10 - 1) * var9) {
                var10--;
            }
        } while (var10 != var11 || var9 != var12);
        int var13 = (765 - var7 * var9) / (var9 + 1);
        int var14 = (480 - var8 * var10) / (var10 + 1);
        if (var13 > 5) {
            var13 = 5;
        }
        int var15 = (765 - var7 * var9 - (var9 + -1) * var13) / 2;
        int var16 = 0;
        if (var14 > 5) {
            var14 = 5;
        }
        int var17 = (480 - (var10 - 1) * var14 - var8 * var10) / 2;
        int var18 = var15;
        int var19 = var17 + 23;
        for (int var20 = 0; var20 < class168.field3426; var20++) {
            class23 var21 = class25.field454[var20];
            boolean var22 = true;
            class163 var23 = class34.method217(var21.field404, arg1 ^ 0xFFFFFFDD);
            if (var21.field404 == -1) {
                var23 = class180.field3623;
                var22 = false;
            } else if (var21.field404 > 1980) {
                var23 = class210.field4096;
                var22 = false;
            }
            if (class22.field394 >= var18 && var19 <= class75.field1555 && var18 + var7 > class22.field394 && class75.field1555 < var8 + var19 && var22) {
                class142.field2910 = var20;
                class58.field1172[var21.field406 ? 1 : 0].method1108(var18, var19, 128, 16777215);
            } else {
                class58.field1172[var21.field406 ? 1 : 0].method1116(var18, var19);
            }
            if (class3.field34 != null) {
                class3.field34[(var21.field406 ? 8 : 0) + var21.field397].method944(var18 + 29, var19);
            }
            arg0.method583(class34.method217(var21.field400, -62), var18 + 15, var8 / 2 + (var19 - -5), 0, -1);
            arg2.method583(var23, var18 + 60, var8 / 2 + var19 + 5, 268435455, -1);
            var19 += var8 + var14;
            int var10000 = ~var10;
            var16++;
            if (var10000 >= ~var16) {
                var18 += var7 + var13;
                var19 = var17 + 23;
                var16 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLde;I)V")
    public static final void method291(byte arg0, class36 arg1, int arg2) {
        if (arg1.field673 > class51.field1023) {
            class100.method685(arg0 ^ 0xFFFFFF03, arg1);
        } else if (class51.field1023 <= arg1.field738) {
            class158.method1001(arg1, arg0 + 126);
        } else {
            class92.method644(arg1, (byte) 120);
        }
        field947++;
        if (arg1.field716 < 128 || arg1.field679 < 128 || arg1.field716 >= 13184 || arg1.field679 >= 13184) {
            arg1.field730 = -1;
            arg1.field716 = arg1.field692[0] * 128 + arg1.field684 * 64;
            arg1.field738 = 0;
            arg1.field741 = -1;
            arg1.field679 = arg1.field718[0] * 128 + arg1.field684 * 64;
            arg1.field673 = 0;
            arg1.method227(true);
        }
        if (arg0 != -125) {
            method296(false);
        }
        if (class56.field1136 == arg1 && (arg1.field716 < 1536 || arg1.field679 < 1536 || arg1.field716 >= 11776 || arg1.field679 >= 11776)) {
            arg1.field730 = -1;
            arg1.field738 = 0;
            arg1.field716 = arg1.field692[0] * 128 + arg1.field684 * 64;
            arg1.field679 = arg1.field718[0] * 128 + arg1.field684 * 64;
            arg1.field673 = 0;
            arg1.field741 = -1;
            arg1.method227(true);
        }
        class108.method729(0, arg1);
        class180.method1214(arg1, (byte) 84);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lu;ILu;Lu;Lle;)Z")
    public static final boolean method292(class184 arg0, int arg1, class184 arg2, class184 arg3, class109 arg4) {
        if (arg1 >= -77) {
            return false;
        }
        class108.field2251 = arg2;
        class49.field949 = arg4;
        class93.field2011 = arg3;
        field932++;
        class68.field1430 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLrf;Z)V")
    public static final void method293(boolean arg0, class163 arg1, boolean arg2) {
        field929++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        if (!arg2) {
            return;
        }
        int var6 = class121.field2556.method582(arg1, 250);
        int var7 = class121.field2556.method571(arg1, 250) * 13;
        class173.method1173(var4 - var3, var5 - var3, var6 + var3 + var3, var3 + var7 + var3, 0);
        class173.method1177(var4 - var3, var5 - var3, var6 + var3 + var3, var3 + var7 + var3, 16777215);
        class121.field2556.method568(arg1, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class191.method1287(var4 - var3, -var3 + var5, var3 + var7 + var3, var3 + var6 + var3, -7807);
        if (!arg0) {
            class40.method250(var5, var4, var7, var6, (byte) -84);
            return;
        }
        try {
            Graphics var8 = class25.field445.getGraphics();
            class31.field622.method165(var8, 0, 8, 0);
        } catch (Exception var9) {
            class25.field445.repaint();
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)J")
    public static final long method294(int arg0, int arg1, int arg2) {
        class111 var3 = class97.field2054[arg0][arg1][arg2];
        return var3 == null || var3.field2357 == null ? 0L : var3.field2357.field192;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lu;Lu;ILu;)V")
    public static final void method295(class184 arg0, class184 arg1, int arg2, class184 arg3) {
        class112.field2366 = arg0;
        class72.field1507 = arg3;
        field937++;
        if (arg2 != 1) {
            field933 = null;
        }
        class118.field2497 = arg1;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)V")
    public static final void method296(boolean arg0) {
        if (arg0) {
            field933 = null;
        }
        field945++;
        try {
            if (class180.field3611 == 1) {
                int var1 = class49.field949.method758(true);
                if (var1 > 0 && class49.field949.method733(0)) {
                    int var2 = var1 - class29.field543;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class49.field949.method746(var2, 127);
                } else {
                    class49.field949.method750(16);
                    class49.field949.method742(true);
                    client.field613 = null;
                    class194.field3811 = null;
                    if (class155.field3210 == null) {
                        class180.field3611 = 0;
                    } else {
                        class180.field3611 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class49.field949.method750(16);
            class155.field3210 = null;
            class194.field3811 = null;
            client.field613 = null;
            class180.field3611 = 0;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static final void method297(byte arg0) {
        class49.field949.method750(arg0 - 53);
        field939++;
        if (arg0 != 69) {
            field944 = -101;
        }
        class155.field3210 = null;
        class180.field3611 = 1;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)Lig;")
    public static final class84 method298(int arg0, int arg1, int arg2) {
        field948++;
        class84 var3 = class138.method907(arg0, false);
        if (~arg1 == arg2) {
            return var3;
        } else if (var3 == null || var3.field1804 == null || arg1 >= var3.field1804.length) {
            return null;
        } else {
            return var3.field1804[arg1];
        }
    }
}
