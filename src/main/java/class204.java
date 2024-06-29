import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class204 {

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Lma;")
    public static class5 field3264 = class12.method119("<br>", (byte) 54);

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Z")
    public static boolean field3265 = false;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Lma;")
    public static class5 field3263 = class12.method119(":chalreq:", (byte) 60);

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "[I")
    public static int[] field3266 = new int[1000];

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Lma;")
    public static class5 field3267 = class12.method119("Lade Benutzeroberfl-=che )2 ", (byte) 82);

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "[[Ltk;")
    public static class135[][] field3262 = new class135[13][13];

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "[Lla;")
    public static class178[] field3271;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "[Lrj;")
    public static class237[] field3261;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIZILii;IZI)V", line = 4)
    public static final void method1353(int arg0, int arg1, int arg2, boolean arg3, int arg4, class221 arg5, int arg6, boolean arg7, int arg8) {
        field3269++;
        if (arg4 >= 0 && arg4 < 104 && arg1 >= 0 && arg1 < 104) {
            if (!arg3) {
                class18.field321[arg8][arg4][arg1] = 0;
            }
            while (true) {
                int var9 = arg5.method1509(true);
                if (var9 == 0) {
                    if (arg3) {
                        class208.field3304[0][arg4][arg1] = class88.field1318[0][arg4][arg1];
                    } else if (arg8 == 0) {
                        class208.field3304[0][arg4][arg1] = -class249.method1739(arg2 + arg4 + 932731, 556238 - -arg1 - -arg0, (byte) 15) * 8;
                    } else {
                        class208.field3304[arg8][arg4][arg1] = class208.field3304[arg8 - 1][arg4][arg1] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg5.method1509(true);
                    if (arg3) {
                        class208.field3304[0][arg4][arg1] = class88.field1318[0][arg4][arg1] + (var10 * 8);
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg8 == 0) {
                            class208.field3304[0][arg4][arg1] = -var10 * 8;
                        } else {
                            class208.field3304[arg8][arg4][arg1] = class208.field3304[arg8 - 1][arg4][arg1] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class152.field2235[arg8][arg4][arg1] = arg5.method1543(false);
                    class111.field1641[arg8][arg4][arg1] = (byte) ((var9 - 2) / 4);
                    class279.field4733[arg8][arg4][arg1] = (byte) method1354(arg6 + var9 - 2, 3);
                } else if (var9 > 81) {
                    class78.field1213[arg8][arg4][arg1] = (byte) (var9 - 81);
                } else if (!arg3) {
                    class18.field321[arg8][arg4][arg1] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg5.method1509(true);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg5.method1509(true);
                    break;
                }
                if (var11 <= 49) {
                    arg5.method1509(true);
                }
            }
        }
        if (!arg7) {
            field3262 = (class135[][]) ((class135[][]) null);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)I", line = 107)
    public static int method1354(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 114)
    public static final void method1355(byte arg0) {
        field3270++;
        if (class1.field11 != null) {
            class1.field11.method1120((byte) -67);
        }
        if (class49.field766 != null) {
            class49.field766.method1120((byte) -106);
        }
        class155.method992(2, 22050, -46, class80.field1239);
        class1.field11 = class129.method858(22050, class267.field4597, class147.field2141, (byte) 9, 0);
        class1.field11.method1127(class114.field1693, true);
        class49.field766 = class129.method858(2048, class267.field4597, class147.field2141, (byte) 31, 1);
        class49.field766.method1127(class235.field3889, true);
        if (arg0 != -108) {
            method1357(-22, 104);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIIILkb;IZJ)Z", line = 161)
    public static final boolean method1356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class280 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class208.field3304 == class181.field2769;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class115.field1721 || var16 >= class179.field2708) {
                    return false;
                }
                class198 var17 = class43.field646[arg0][var15][var16];
                if (var17 != null && var17.field3162 >= 5) {
                    return false;
                }
            }
        }
        class107 var18 = new class107();
        var18.field1590 = arg11;
        var18.field1596 = arg0;
        var18.field1603 = arg5;
        var18.field1604 = arg6;
        var18.field1591 = arg7;
        var18.field1589 = arg8;
        var18.field1602 = arg9;
        var18.field1597 = arg1;
        var18.field1595 = arg2;
        var18.field1587 = arg1 + arg3 - 1;
        var18.field1598 = arg2 + arg4 - 1;
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
                    if (class43.field646[var22][var19][var20] == null) {
                        class43.field646[var22][var19][var20] = new class198(var22, var19, var20);
                    }
                }
                class198 var23 = class43.field646[arg0][var19][var20];
                var23.field3166[var23.field3162] = var18;
                var23.field3146[var23.field3162] = var21;
                var23.field3168 |= var21;
                var23.field3162++;
                if (var13 && class150.field2162[var19][var20] != 0) {
                    var14 = class150.field2162[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class150.field2162[var24][var25] == 0) {
                        class150.field2162[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class111.field1650[class194.field3029++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)V", line = 285)
    public static final void method1357(int arg0, int arg1) {
        if (arg0 > -104) {
            method1353(-93, 5, 77, false, 22, (class221) null, 66, true, 80);
        }
        field3268++;
        class131.field1963.method517(false, arg1);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V", line = 303)
    public static void method1358(byte arg0) {
        field3261 = null;
        if (arg0 > -117) {
            return;
        }
        field3266 = null;
        field3264 = null;
        field3271 = null;
        field3267 = null;
        field3262 = (class135[][]) null;
        field3263 = null;
    }
}
