import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class41 {

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Lpd;")
    public static class94 field1041 = class28.method249(-110, "titlebutton");

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Lpd;")
    public static class94 field1042 = class28.method249(-74, "::noclip");

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "[[[I")
    public static int[][][] field1049 = new int[4][105][105];

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field1043 = 0;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Lpd;")
    public static class94 field1051 = class28.method249(-126, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Lpd;")
    public static class94 field1047 = class28.method249(122, "@gr3@");

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Lpd;")
    public static class94 field1054 = class28.method249(-80, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "[I")
    public static int[] field1045;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "[I")
    public static int[] field1046;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[Ltc;")
    public static class116[] field1044;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)[B", line = 17)
    public static final synchronized byte[] method307(int arg0, int arg1) {
        field1052++;
        if (arg1 == 100 && class128.field3224 > 0) {
            byte[] var2 = class81.field2071[--class128.field3224];
            class81.field2071[class128.field3224] = null;
            return var2;
        } else if (arg1 == 5000 && class20.field557 > 0) {
            byte[] var3 = class115.field2920[--class20.field557];
            class115.field2920[class20.field557] = null;
            return var3;
        } else if (arg1 == 30000 && class64.field1571 > 0) {
            byte[] var4 = class128.field3236[--class64.field1571];
            class128.field3236[class64.field1571] = null;
            return var4;
        } else if (arg0 > -27) {
            return null;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 56)
    public static void method308(int arg0) {
        field1041 = null;
        field1044 = null;
        field1051 = null;
        field1045 = null;
        if (arg0 != -1) {
            field1042 = null;
        }
        field1047 = null;
        field1046 = null;
        field1054 = null;
        field1049 = null;
        field1042 = null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)Loc;", line = 85)
    public static final class86 method309(int arg0, int arg1) {
        field1050++;
        if (arg0 != 13) {
            return null;
        }
        class86 var2 = (class86) class89.field2301.method1007((long) arg1, (byte) -103);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class54.field1370.method808((byte) 93, 13, arg1);
        class86 var4 = new class86();
        var4.field2175 = arg1;
        if (var3 != null) {
            var4.method631(true, new class122(var3));
        }
        class89.field2301.method1012(50, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lme;I)[I", line = 116)
    public static final int[] method310(class77 arg0, int arg1) {
        field1040++;
        int var2;
        if (arg0.field1928 >= 0) {
            var2 = arg0.field1928 >> 16;
        } else {
            var2 = arg0.field1920 >> 16;
        }
        if (arg1 > -44) {
            method308(90);
        }
        if (!class98.method741((byte) -89, var2)) {
            return null;
        }
        int var3 = arg0.field1878;
        int var4 = arg0.field1920;
        int var5 = arg0.field1961;
        while (var4 != -1) {
            class77 var7 = class108.field2673[var2][var4 & 0xFFFF];
            var3 += var7.field1878 - var7.field1873;
            var5 += var7.field1961 - var7.field1915;
            var4 = var7.field1920;
        }
        return new int[] { var3, var5 };
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILpd;BLpd;)V", line = 161)
    public static final void method311(int arg0, class94 arg1, byte arg2, class94 arg3) {
        if (arg0 == 0 && class75.field1837 != -1) {
            class86.field2157 = 0;
            class76.field1855 = arg3;
        }
        if (class115.field2925 == -1) {
            class73.field1781 = true;
        }
        field1048++;
        if (arg2 <= 57) {
            field1042 = null;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class82.field2110[var4] = class82.field2110[var4 - 1];
            class42.field1067[var4] = class42.field1067[var4 - 1];
            class55.field1410[var4] = class55.field1410[var4 - 1];
        }
        class82.field2110[0] = arg0;
        class42.field1067[0] = arg1;
        class55.field1410[0] = arg3;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 217)
    public static final void method312(int arg0) {
        if (class126.field3178 == 0 && class31.field882 == 0) {
            class110.field2751++;
            class97.method738(class84.field2121, class94.field2411, class8.field230, class102.field2575, 0, 55, -30801);
        }
        field1055++;
        int var1 = -1;
        if (arg0 != 1) {
            method311(32, null, (byte) -99, null);
        }
        for (int var2 = 0; var2 < class48.field1190; var2++) {
            int var3 = class48.field1206[var2];
            int var4 = var3 & 0x7F;
            int var5 = var3 >> 7 & 0x7F;
            int var6 = var3 >> 29 & 0x3;
            int var7 = var3 >> 14 & 0x7FFF;
            if (var1 != var3) {
                var1 = var3;
                if (var6 == 2 && class64.field1585.method175(class64.field1589, var4, var5, var3) >= 0) {
                    class27 var8 = class55.method440(var7, (byte) 76);
                    if (var8.field764 != null) {
                        var8 = var8.method247(false);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (class126.field3178 == 1) {
                        class97.method738(var5, var4, class4.method20(new class94[] { class113.field2848, class103.field2602, var8.field709 }, true), class99.field2492, var3, 25, -30801);
                        class133.field3251++;
                    } else if (class31.field882 != 1) {
                        class135.field3314++;
                        class94[] var9 = var8.field762;
                        if (class4.field99) {
                            var9 = class70.method511(var9, arg0 + 4);
                        }
                        if (var9 != null) {
                            for (int var10 = 4; var10 >= 0; var10--) {
                                if (var9[var10] != null) {
                                    class27.field763++;
                                    short var11 = 0;
                                    if (var10 == 0) {
                                        var11 = 48;
                                    }
                                    if (var10 == 1) {
                                        var11 = 17;
                                    }
                                    if (var10 == 2) {
                                        var11 = 56;
                                    }
                                    if (var10 == 3) {
                                        var11 = 12;
                                    }
                                    if (var10 == 4) {
                                        var11 = 1005;
                                    }
                                    class97.method738(var5, var4, class4.method20(new class94[] { class75.field1829, var8.field709 }, true), var9[var10], var3, var11, -30801);
                                }
                            }
                        }
                        class97.method738(var5, var4, class4.method20(new class94[] { class75.field1829, var8.field709 }, true), class70.field1701, var8.field770 << 14, 1004, -30801);
                    } else if ((class67.field1647 & 0x4) == 4) {
                        class97.method738(var5, var4, class4.method20(new class94[] { class66.field1632, class103.field2602, var8.field709 }, true), class19.field526, var3, 7, -30801);
                        class2.field67++;
                    }
                }
                if (var6 == 1) {
                    class80 var12 = class28.field803[var7];
                    if (var12.field2037.field2854 == 1 && (var12.field177 & 0x7F) == 64 && (var12.field222 & 0x7F) == 64) {
                        for (int var13 = 0; var13 < class115.field2906; var13++) {
                            class80 var16 = class28.field803[class95.field2442[var13]];
                            if (var16 != null && var12 != var16 && var16.field2037.field2854 == 1 && var12.field177 == var16.field177 && var12.field222 == var16.field222) {
                                class74.method552(-9913, var16.field2037, class95.field2442[var13], var4, var5);
                            }
                        }
                        for (int var14 = 0; var14 < class113.field2886; var14++) {
                            class89 var15 = class85.field2138[class38.field985[var14]];
                            if (var15 != null && var12.field177 == var15.field177 && var12.field222 == var15.field222) {
                                class64.method482(true, var15, var5, class38.field985[var14], var4);
                            }
                        }
                    }
                    class74.method552(arg0 ^ 0xFFFFD946, var12.field2037, var7, var4, var5);
                }
                if (var6 == 0) {
                    class89 var17 = class85.field2138[var7];
                    if ((var17.field177 & 0x7F) == 64 && (var17.field222 & 0x7F) == 64) {
                        for (int var18 = 0; var18 < class115.field2906; var18++) {
                            class80 var21 = class28.field803[class95.field2442[var18]];
                            if (var21 != null && var21.field2037.field2854 == 1 && var17.field177 == var21.field177 && var17.field222 == var21.field222) {
                                class74.method552(arg0 ^ 0xFFFFD946, var21.field2037, class95.field2442[var18], var4, var5);
                            }
                        }
                        for (int var19 = 0; var19 < class113.field2886; var19++) {
                            class89 var20 = class85.field2138[class38.field985[var19]];
                            if (var20 != null && var17 != var20 && var17.field177 == var20.field177 && var17.field222 == var20.field222) {
                                class64.method482(true, var20, var5, class38.field985[var19], var4);
                            }
                        }
                    }
                    class64.method482(true, var17, var5, var7, var4);
                }
                if (var6 == 3) {
                    class119 var22 = class9.field243[class64.field1589][var4][var5];
                    if (var22 != null) {
                        for (class17 var23 = (class17) var22.method890(false); var23 != null; var23 = (class17) var22.method897((byte) 57)) {
                            class110 var24 = class39.method295(var23.field418, 1);
                            if (class126.field3178 == 1) {
                                class90.field2341++;
                                class97.method738(var5, var4, class4.method20(new class94[] { class113.field2848, class14.field364, var24.field2713 }, true), class99.field2492, var23.field418, 46, arg0 ^ 0xFFFF87AE);
                            } else if (class31.field882 != 1) {
                                class94[] var25 = var24.field2698;
                                if (class4.field99) {
                                    var25 = class70.method511(var25, 5);
                                }
                                class92.field2371++;
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25 != null && var25[var26] != null) {
                                        class90.field2349++;
                                        byte var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 28;
                                        }
                                        if (var26 == 1) {
                                            var27 = 39;
                                        }
                                        if (var26 == 2) {
                                            var27 = 52;
                                        }
                                        if (var26 == 3) {
                                            var27 = 19;
                                        }
                                        if (var26 == 4) {
                                            var27 = 33;
                                        }
                                        class97.method738(var5, var4, class4.method20(new class94[] { class51.field1275, var24.field2713 }, true), var25[var26], var23.field418, var27, -30801);
                                    } else if (var26 == 2) {
                                        class97.method738(var5, var4, class4.method20(new class94[] { class51.field1275, var24.field2713 }, true), class39.field1004, var23.field418, 52, -30801);
                                        class36.field942++;
                                    }
                                }
                                class97.method738(var5, var4, class4.method20(new class94[] { class51.field1275, var24.field2713 }, true), class70.field1701, var23.field418, 1002, -30801);
                            } else if ((class67.field1647 & 0x1) == 1) {
                                class97.method738(var5, var4, class4.method20(new class94[] { class66.field1632, class14.field364, var24.field2713 }, true), class19.field526, var23.field418, 21, -30801);
                                class128.field3210++;
                            }
                        }
                    }
                }
            }
        }
    }
}
