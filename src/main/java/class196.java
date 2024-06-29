import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class196 extends class45 {

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
    public static int field3152 = 0;

    @OriginalMember(owner = "client!sf", name = "lb", descriptor = "I")
    public static int field3157 = 0;

    @OriginalMember(owner = "client!sf", name = "hb", descriptor = "Z")
    public static boolean field3153 = false;

    @OriginalMember(owner = "client!sf", name = "kb", descriptor = "[[I")
    public static int[][] field3156 = new int[5][5000];

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!sf", name = "ib", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!sf", name = "jb", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!sf", name = "mb", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!sf", name = "nb", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!sf", name = "ob", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!sf", name = "pb", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)Lag;", line = 4)
    public static final class202 method1256(int arg0) {
        field3150++;
        class202 var1 = new class202(34);
        var1.method1311(11, 10964);
        var1.method1311(class331.field5068, 10964);
        var1.method1311(class250.field3925 ? 1 : 0, 10964);
        if (arg0 < 96) {
            method1258((Component) null, 49);
        }
        var1.method1311(class104.field1794 ? 1 : 0, 10964);
        var1.method1311(class64.field1227 ? 1 : 0, 10964);
        var1.method1311(class318.field4809 ? 1 : 0, 10964);
        var1.method1311(class79.field1555 ? 1 : 0, 10964);
        var1.method1311(client.field902 ? 1 : 0, 10964);
        var1.method1311(class157.field2572 ? 1 : 0, 10964);
        var1.method1311(class259.field4030 ? 1 : 0, 10964);
        var1.method1311(class305.field4620, 10964);
        var1.method1311(class334.field5115 ? 1 : 0, 10964);
        var1.method1311(class45.field926 ? 1 : 0, 10964);
        var1.method1311(class140.field2314 ? 1 : 0, 10964);
        var1.method1311(class337.field5238, 10964);
        var1.method1311(class191.field3110 ? 1 : 0, 10964);
        var1.method1311(class202.field3278, 10964);
        var1.method1311(class171.field2751, 10964);
        var1.method1311(class80.field1573, 10964);
        var1.method1313(class180.field2902, -376480);
        var1.method1313(class171.field2757, -376480);
        var1.method1311(class275.method1842(), 10964);
        var1.method1359(16705, class211.field3397);
        var1.method1311(class52.field1051, 10964);
        var1.method1311(class236.field3714 ? 1 : 0, 10964);
        var1.method1311(class6.field136 ? 1 : 0, 10964);
        var1.method1311(class259.field4028, 10964);
        var1.method1311(class28.field539 ? 1 : 0, 10964);
        var1.method1311(class290.field4460 ? 1 : 0, 10964);
        return var1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILkl;B)V", line = 49)
    public static final void method1257(int arg0, int arg1, class68 arg2, byte arg3) {
        field3151++;
        if (arg2.field1404 == 1) {
            class6.method62(arg2.field1284, (short) 44, -1, 0L, -1, arg2.field1426, 0, "");
            class140.field2319++;
        }
        if (arg2.field1404 == 2 && !class86.field1617) {
            String var4 = class8.method71(arg2, true);
            if (var4 != null) {
                class27.field525++;
                class6.method62(arg2.field1284, (short) 10, -1, 0L, -1, var4, -1, "<col=00ff00>" + arg2.field1450);
            }
        }
        if (arg2.field1404 == 3) {
            class6.method62(arg2.field1284, (short) 40, -1, 0L, -1, class80.field1570, 0, "");
            class301.field4555++;
        }
        if (arg2.field1404 == 4) {
            class6.method62(arg2.field1284, (short) 32, -1, 0L, -1, arg2.field1426, 0, "");
            class147.field2403++;
        }
        if (arg3 != 22) {
            field3154 = 44;
        }
        if (arg2.field1404 == 5) {
            class138.field2301++;
            class6.method62(arg2.field1284, (short) 1, -1, 0L, -1, arg2.field1426, 0, "");
        }
        if (arg2.field1404 == 6 && class317.field4795 == null) {
            class6.method62(arg2.field1284, (short) 39, -1, 0L, -1, arg2.field1426, -1, "");
            class290.field4455++;
        }
        if (arg2.field1358 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field1386; var6++) {
                for (int var7 = 0; var7 < arg2.field1381; var7++) {
                    int var8 = (arg2.field1318 + 32) * var7;
                    int var9 = (arg2.field1389 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field1422[var5];
                        var9 += arg2.field1371[var5];
                    }
                    if (var8 <= arg1 && var9 <= arg0 && arg1 < (var8 + 32) && (var9 + 32) > arg0) {
                        class227.field3595 = arg2;
                        class268.field4127 = var5;
                        if (arg2.field1341[var5] > 0) {
                            class268 var10 = client.method359(arg2);
                            class337 var11 = class95.method636(22111, arg2.field1341[var5] - 1);
                            if (class21.field447 == 1 && var10.method1784((byte) -109)) {
                                if (class109.field1881 != arg2.field1284 || class224.field3530 != var5) {
                                    class6.method62(arg2.field1284, (short) 15, -1, (long) var11.field5245, -1, class94.field1693, var5, class170.field2749 + " -> <col=ff9040>" + var11.field5227);
                                    class176.field2840++;
                                }
                            } else if (class86.field1617 && var10.method1784((byte) -111)) {
                                class74 var12 = class18.field331 == -1 ? null : class121.method784(11, class18.field331);
                                if ((class81.field1581 & 0x10) != 0 && (var12 == null || var11.method2332(class18.field331, (byte) -55, var12.field1515) != var12.field1515)) {
                                    class191.field3112++;
                                    class6.method62(arg2.field1284, (short) 11, class183.field2934, (long) var11.field5245, -1, class281.field4323, var5, class223.field3523 + " -> <col=ff9040>" + var11.field5227);
                                }
                            } else {
                                class286.field4424++;
                                String[] var13 = var11.field5199;
                                if (class138.field2302) {
                                    var13 = class253.method1700(arg3 ^ 0xFFFFFFEC, var13);
                                }
                                if (var10.method1784((byte) -122)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class189.field3059++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 2;
                                            } else {
                                                var15 = 38;
                                            }
                                            class6.method62(arg2.field1284, var15, -1, (long) var11.field5245, arg3 ^ 0xFFFFFFE9, var13[var14], var5, "<col=ff9040>" + var11.field5227);
                                        }
                                    }
                                }
                                if (var10.method1779(arg3 ^ 0xFFFFFFDA)) {
                                    class6.method62(arg2.field1284, (short) 28, class114.field1989, (long) var11.field5245, arg3 ^ 0xFFFFFFE9, class94.field1693, var5, "<col=ff9040>" + var11.field5227);
                                    class29.field555++;
                                }
                                if (var10.method1784((byte) -96) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class149.field2440++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 47;
                                            }
                                            if (var16 == 1) {
                                                var17 = 36;
                                            }
                                            if (var16 == 2) {
                                                var17 = 26;
                                            }
                                            class6.method62(arg2.field1284, var17, -1, (long) var11.field5245, -1, var13[var16], var5, "<col=ff9040>" + var11.field5227);
                                        }
                                    }
                                }
                                String[] var18 = arg2.field1349;
                                if (class138.field2302) {
                                    var18 = class253.method1700(-6, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            byte var20 = 0;
                                            class260.field4046++;
                                            if (var19 == 0) {
                                                var20 = 46;
                                            }
                                            if (var19 == 1) {
                                                var20 = 34;
                                            }
                                            if (var19 == 2) {
                                                var20 = 37;
                                            }
                                            if (var19 == 3) {
                                                var20 = 13;
                                            }
                                            if (var19 == 4) {
                                                var20 = 19;
                                            }
                                            class6.method62(arg2.field1284, var20, -1, (long) var11.field5245, -1, var18[var19], var5, "<col=ff9040>" + var11.field5227);
                                        }
                                    }
                                }
                                class6.method62(arg2.field1284, (short) 1007, class116.field2040, (long) var11.field5245, -1, class226.field3580, var5, "<col=ff9040>" + var11.field5227);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field1429) {
            return;
        }
        if (!class86.field1617) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = class180.method1136(var21, arg2, (byte) -104);
                if (var22 != null) {
                    class6.method62(arg2.field1284, (short) 1006, class325.method2254(arg2, arg3 ^ 0x19DF, var21), (long) (var21 + 1), arg3 - 23, var22, arg2.field1365, arg2.field1346);
                    class47.field983++;
                }
            }
            String var23 = class8.method71(arg2, true);
            if (var23 != null) {
                class6.method62(arg2.field1284, (short) 10, -1, 0L, -1, var23, arg2.field1365, arg2.field1346);
                class27.field525++;
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class180.method1136(var24, arg2, (byte) -9);
                if (var25 != null) {
                    class47.field983++;
                    class6.method62(arg2.field1284, (short) 30, class325.method2254(arg2, 6601, var24), (long) (var24 + 1), -1, var25, arg2.field1365, arg2.field1346);
                }
            }
            if (client.method359(arg2).method1777((byte) 121)) {
                class290.field4455++;
                if (arg2.field1321 == null) {
                    class6.method62(arg2.field1284, (short) 39, -1, 0L, -1, class128.field2194, arg2.field1365, "");
                } else {
                    class6.method62(arg2.field1284, (short) 39, -1, 0L, -1, arg2.field1321, arg2.field1365, "");
                }
            }
        } else if (client.method359(arg2).method1785(109) && (class81.field1581 & 0x20) != 0) {
            class6.method62(arg2.field1284, (short) 7, class183.field2934, 0L, -1, class281.field4323, arg2.field1365, class223.field3523 + " -> " + arg2.field1346);
            class228.field3605++;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 373)
    public static final void method1258(Component arg0, int arg1) {
        arg0.removeMouseListener(class95.field1710);
        field3159++;
        arg0.removeMouseMotionListener(class95.field1710);
        arg0.removeFocusListener(class95.field1710);
        int var2 = -89 % ((-arg1 - 18) / 40);
        class75.field1528 = 0;
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)V", line = 389)
    public static final void method1259(int arg0) {
        class14.field263.method80(arg0, (byte) 118);
        field3161++;
        class18.field325++;
        class14.field263.method1313(class79.field1565, -376480);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(IB)[[I", line = 404)
    public final int[][] method175(int arg0, byte arg1) {
        field3158++;
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (arg1 < 16) {
            method1256(55);
        }
        if (this.field441.field532 && this.method362((byte) -107)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = arg0 % this.field924 * this.field924;
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class294.field4489; var8++) {
                int var9 = this.field936[var8 % this.field927 + var6];
                var7[var8] = class61.method475(var9 << 4, 4080);
                var5[var8] = class61.method475(var9, 65280) >> 4;
                var4[var8] = class61.method475(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)V", line = 454)
    public static final void method1260(int arg0, int arg1) {
        field3160++;
        if (arg0 > 110) {
            class157.field2550.method1883(2047773287, arg1);
            class106.field1825.method1883(2047773287, arg1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "(I)V", line = 467)
    public static void method1261(int arg0) {
        if (arg0 != 0) {
            method1258((Component) null, 38);
        }
        field3156 = (int[][]) null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIIILsc;IZJ)Z", line = 487)
    public static final boolean method1262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class19 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class45.field923 == class136.field2290;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class306.field4629 || var16 >= class39.field762) {
                    return false;
                }
                class47 var17 = class326.field4975[arg0][var15][var16];
                if (var17 != null && var17.field969 >= 5) {
                    return false;
                }
            }
        }
        class271 var18 = new class271();
        var18.field4191 = arg11;
        var18.field4175 = arg0;
        var18.field4179 = arg5;
        var18.field4185 = arg6;
        var18.field4174 = arg7;
        var18.field4182 = arg8;
        var18.field4188 = arg9;
        var18.field4180 = arg1;
        var18.field4187 = arg2;
        var18.field4176 = arg1 + arg3 - 1;
        var18.field4181 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class326.field4975[var22][var19][var20] == null) {
                        class326.field4975[var22][var19][var20] = new class47(var22, var19, var20);
                    }
                }
                class47 var23 = class326.field4975[arg0][var19][var20];
                var23.field974[var23.field969] = var18;
                var23.field982[var23.field969] = var21;
                var23.field980 |= var21;
                var23.field969++;
                if (var13 && class25.field498[var19][var20] != 0) {
                    var14 = class25.field498[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class25.field498[var24][var25] == 0) {
                        class25.field498[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class2.field37[class175.field2819++] = var18;
        }
        return true;
    }
}
