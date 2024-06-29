import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class20 extends class99 {

    @OriginalMember(owner = "client!db", name = "O", descriptor = "Lvc;")
    public static class128 field528 = new class128(64);

    @OriginalMember(owner = "client!db", name = "nb", descriptor = "Lpd;")
    private static class94 field539 = class28.method249(71, "Please wait)3)3)3");

    @OriginalMember(owner = "client!db", name = "rb", descriptor = "Lpd;")
    private static class94 field543 = class28.method249(-54, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!db", name = "vb", descriptor = "Lpd;")
    public static class94 field547 = class28.method249(-92, "Titelbild geladen)3");

    @OriginalMember(owner = "client!db", name = "kb", descriptor = "Lpd;")
    public static class94 field536 = field543;

    @OriginalMember(owner = "client!db", name = "xb", descriptor = "Lpd;")
    private static class94 field549 = class28.method249(36, "From");

    @OriginalMember(owner = "client!db", name = "jb", descriptor = "I")
    public static int field535 = 0;

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "Lpd;")
    public static class94 field533 = field549;

    @OriginalMember(owner = "client!db", name = "yb", descriptor = "Lpd;")
    public static class94 field550 = field539;

    @OriginalMember(owner = "client!db", name = "wb", descriptor = "[I")
    public static int[] field548 = new int[128];

    @OriginalMember(owner = "client!db", name = "Eb", descriptor = "Lpd;")
    public static class94 field556 = class28.method249(81, "");

    @OriginalMember(owner = "client!db", name = "lb", descriptor = "I")
    public static int field537 = 127;

    @OriginalMember(owner = "client!db", name = "Fb", descriptor = "I")
    public static int field557 = 0;

    @OriginalMember(owner = "client!db", name = "Db", descriptor = "Lpd;")
    public static class94 field555 = class28.method249(-121, "mod_icons");

    @OriginalMember(owner = "client!db", name = "ub", descriptor = "Lhb;")
    public static class43 field546 = new class43(5000);

    @OriginalMember(owner = "client!db", name = "Kb", descriptor = "Lpd;")
    public static class94 field562 = class28.method249(-53, "Mitteilung");

    @OriginalMember(owner = "client!db", name = "Jb", descriptor = "Lpd;")
    public static class94 field561 = class28.method249(-101, ")3");

    @OriginalMember(owner = "client!db", name = "Mb", descriptor = "I")
    public static int field564 = 50;

    @OriginalMember(owner = "client!db", name = "Nb", descriptor = "Lpd;")
    public static class94 field565 = class28.method249(-94, " )2> @whi@");

    @OriginalMember(owner = "client!db", name = "db", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!db", name = "mb", descriptor = "I")
    public int field538;

    @OriginalMember(owner = "client!db", name = "pb", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!db", name = "qb", descriptor = "I")
    public int field542;

    @OriginalMember(owner = "client!db", name = "sb", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!db", name = "zb", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!db", name = "Ab", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "client!db", name = "Bb", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!db", name = "Cb", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!db", name = "Hb", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!db", name = "Ib", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!db", name = "Lb", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!db", name = "ob", descriptor = "[I")
    public int[] field540;

    @OriginalMember(owner = "client!db", name = "Gb", descriptor = "[I")
    public int[] field558;

    @OriginalMember(owner = "client!db", name = "tb", descriptor = "[Lpd;")
    public class94[] field545;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lod;IILde;IIIBII)V", line = 7)
    public static final void method151(class88 arg0, int arg1, int arg2, class24 arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field531++;
        int var10 = class41.field1049[arg1][arg2][arg5];
        int var11 = class41.field1049[arg1][arg2 + 1][arg5];
        int var12 = class41.field1049[arg1][arg2][arg5 + 1];
        int var13 = class41.field1049[arg1][arg2 + 1][arg5 + 1];
        int var14 = var10 + var11 + var13 + var12 >> 2;
        int var15 = (arg4 << 14) + (arg5 << 7) + arg2 + 1073741824;
        class27 var16 = class55.method440(arg4, (byte) 76);
        int var17 = (arg8 << 6) + arg9;
        if (var16.field739 == 1) {
            var17 += 256;
        }
        if (var16.field726 == 0) {
            var15 += Integer.MIN_VALUE;
        }
        if (arg9 == 22) {
            class12 var18;
            if (var16.field755 == -1 && var16.field764 == null) {
                var18 = var16.method240(22, arg8, var11, arg7 - 33, var12, var10, var13);
            } else {
                var18 = new class51(arg4, 22, arg8, var10, var11, var13, var12, var16.field755, true, null);
            }
            arg3.method199(arg6, arg2, arg5, var14, var18, var15, var17);
            if (var16.field727 && var16.field726 == 1) {
                arg0.method661(arg2, arg5, 2097152);
            }
        } else if (arg9 == 10 || arg9 == 11) {
            class12 var38;
            if (var16.field755 == -1 && var16.field764 == null) {
                var38 = var16.method240(10, arg8, var11, arg7 ^ 0xFFFFFF89, var12, var10, var13);
            } else {
                var38 = new class51(arg4, 10, arg8, var10, var11, var13, var12, var16.field755, true, null);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg8 == 1 || arg8 == 3) {
                    var40 = var16.field715;
                    var39 = var16.field771;
                } else {
                    var39 = var16.field715;
                    var40 = var16.field771;
                }
                int var41 = 0;
                if (arg9 == 11) {
                    var41 += 256;
                }
                arg3.method176(arg6, arg2, arg5, var14, var40, var39, var38, var41, var15, var17);
            }
            if (var16.field727) {
                arg0.method647(var16.field771, arg8, var16.field715, var16.field725, arg7 + 7, arg5, arg2);
            }
        } else if (arg9 >= 12) {
            class12 var19;
            if (var16.field755 == -1 && var16.field764 == null) {
                var19 = var16.method240(arg9, arg8, var11, -83, var12, var10, var13);
            } else {
                var19 = new class51(arg4, arg9, arg8, var10, var11, var13, var12, var16.field755, true, null);
            }
            arg3.method176(arg6, arg2, arg5, var14, 1, 1, var19, 0, var15, var17);
            if (var16.field727) {
                arg0.method647(var16.field771, arg8, var16.field715, var16.field725, -4, arg5, arg2);
            }
        } else if (arg9 == 0) {
            class12 var20;
            if (var16.field755 == -1 && var16.field764 == null) {
                var20 = var16.method240(0, arg8, var11, 7, var12, var10, var13);
            } else {
                var20 = new class51(arg4, 0, arg8, var10, var11, var13, var12, var16.field755, true, null);
            }
            arg3.method174(arg6, arg2, arg5, var14, var20, null, class89.field2323[arg8], 0, var15, var17);
            if (var16.field727) {
                arg0.method655(-112, var16.field725, arg9, arg5, arg2, arg8);
            }
        } else {
            if (arg7 != -11) {
                field528 = null;
            }
            if (arg9 == 1) {
                class12 var21;
                if (var16.field755 == -1 && var16.field764 == null) {
                    var21 = var16.method240(1, arg8, var11, arg7 + 121, var12, var10, var13);
                } else {
                    var21 = new class51(arg4, 1, arg8, var10, var11, var13, var12, var16.field755, true, null);
                }
                arg3.method174(arg6, arg2, arg5, var14, var21, null, class25.field682[arg8], 0, var15, var17);
                if (var16.field727) {
                    arg0.method655(-108, var16.field725, arg9, arg5, arg2, arg8);
                }
            } else if (arg9 == 2) {
                int var22 = arg8 + 1 & 0x3;
                class12 var23;
                class12 var24;
                if (var16.field755 == -1 && var16.field764 == null) {
                    var23 = var16.method240(2, arg8 + 4, var11, arg7 ^ 0xFFFFFF83, var12, var10, var13);
                    var24 = var16.method240(2, var22, var11, arg7 - 36, var12, var10, var13);
                } else {
                    var23 = new class51(arg4, 2, arg8 + 4, var10, var11, var13, var12, var16.field755, true, null);
                    var24 = new class51(arg4, 2, var22, var10, var11, var13, var12, var16.field755, true, null);
                }
                arg3.method174(arg6, arg2, arg5, var14, var23, var24, class89.field2323[arg8], class89.field2323[var22], var15, var17);
                if (var16.field727) {
                    arg0.method655(-87, var16.field725, arg9, arg5, arg2, arg8);
                }
            } else if (arg9 == 3) {
                class12 var25;
                if (var16.field755 == -1 && var16.field764 == null) {
                    var25 = var16.method240(3, arg8, var11, 120, var12, var10, var13);
                } else {
                    var25 = new class51(arg4, 3, arg8, var10, var11, var13, var12, var16.field755, true, null);
                }
                arg3.method174(arg6, arg2, arg5, var14, var25, null, class25.field682[arg8], 0, var15, var17);
                if (var16.field727) {
                    arg0.method655(-110, var16.field725, arg9, arg5, arg2, arg8);
                }
            } else if (arg9 == 9) {
                class12 var26;
                if (var16.field755 == -1 && var16.field764 == null) {
                    var26 = var16.method240(arg9, arg8, var11, -127, var12, var10, var13);
                } else {
                    var26 = new class51(arg4, arg9, arg8, var10, var11, var13, var12, var16.field755, true, null);
                }
                arg3.method176(arg6, arg2, arg5, var14, 1, 1, var26, 0, var15, var17);
                if (var16.field727) {
                    arg0.method647(var16.field771, arg8, var16.field715, var16.field725, -4, arg5, arg2);
                }
            } else {
                if (var16.field767) {
                    if (arg8 == 1) {
                        int var27 = var12;
                        var12 = var13;
                        var13 = var11;
                        var11 = var10;
                        var10 = var27;
                    } else if (arg8 == 2) {
                        int var29 = var12;
                        var12 = var11;
                        var11 = var29;
                        int var30 = var13;
                        var13 = var10;
                        var10 = var30;
                    } else if (arg8 == 3) {
                        int var28 = var12;
                        var12 = var10;
                        var10 = var11;
                        var11 = var13;
                        var13 = var28;
                    }
                }
                if (arg9 == 4) {
                    class12 var31;
                    if (var16.field755 == -1 && var16.field764 == null) {
                        var31 = var16.method240(4, 0, var11, arg7 ^ 0xFFFFFF89, var12, var10, var13);
                    } else {
                        var31 = new class51(arg4, 4, 0, var10, var11, var13, var12, var16.field755, true, null);
                    }
                    arg3.method215(arg6, arg2, arg5, var14, var31, class89.field2323[arg8], arg8 * 512, 0, 0, var15, var17);
                } else if (arg9 == 5) {
                    int var32 = 16;
                    int var33 = arg3.method182(arg6, arg2, arg5);
                    if (var33 > 0) {
                        var32 = class55.method440(var33 >> 14 & 0x7FFF, (byte) 76).field753;
                    }
                    class12 var34;
                    if (var16.field755 == -1 && var16.field764 == null) {
                        var34 = var16.method240(4, 0, var11, 26, var12, var10, var13);
                    } else {
                        var34 = new class51(arg4, 4, 0, var10, var11, var13, var12, var16.field755, true, null);
                    }
                    arg3.method215(arg6, arg2, arg5, var14, var34, class89.field2323[arg8], arg8 * 512, class64.field1574[arg8] * var32, class28.field812[arg8] * var32, var15, var17);
                } else if (arg9 == 6) {
                    class12 var35;
                    if (var16.field755 == -1 && var16.field764 == null) {
                        var35 = var16.method240(4, 0, var11, arg7 + 134, var12, var10, var13);
                    } else {
                        var35 = new class51(arg4, 4, 0, var10, var11, var13, var12, var16.field755, true, null);
                    }
                    arg3.method215(arg6, arg2, arg5, var14, var35, 256, arg8, 0, 0, var15, var17);
                } else if (arg9 == 7) {
                    class12 var36;
                    if (var16.field755 == -1 && var16.field764 == null) {
                        var36 = var16.method240(4, 0, var11, -72, var12, var10, var13);
                    } else {
                        var36 = new class51(arg4, 4, 0, var10, var11, var13, var12, var16.field755, true, null);
                    }
                    arg3.method215(arg6, arg2, arg5, var14, var36, 512, arg8, 0, 0, var15, var17);
                } else if (arg9 == 8) {
                    class12 var37;
                    if (var16.field755 == -1 && var16.field764 == null) {
                        var37 = var16.method240(4, 0, var11, -82, var12, var10, var13);
                    } else {
                        var37 = new class51(arg4, 4, 0, var10, var11, var13, var12, var16.field755, true, null);
                    }
                    arg3.method215(arg6, arg2, arg5, var14, var37, 768, arg8, 0, 0, var15, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)I", line = 312)
    public static final int method152(int arg0, int arg1) {
        field559++;
        class52 var2 = class111.method812(arg1, 118);
        int var3 = var2.field1297;
        int var4 = var2.field1292;
        int var5 = var2.field1296;
        int var6 = class29.field843[var5 - var3];
        if (arg0 != -2) {
            method151(null, 7, -80, null, -93, 65, -29, (byte) 24, 51, -76);
        }
        return var6 & class37.field953[var4] >> var3;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V", line = 342)
    public static void method153(int arg0) {
        field536 = null;
        field548 = null;
        field556 = null;
        field561 = null;
        field550 = null;
        field565 = null;
        field533 = null;
        field547 = null;
        field539 = null;
        if (arg0 != 4) {
            method152(60, 96);
        }
        field562 = null;
        field549 = null;
        field528 = null;
        field543 = null;
        field546 = null;
        field555 = null;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(Z)V", line = 381)
    public static final void method154(boolean arg0) {
        field554++;
        for (class82 var1 = (class82) class102.field2564.method895(-14156); var1 != null; var1 = (class82) class102.field2564.method893(true)) {
            if (class64.field1589 != var1.field2093 || var1.field2096) {
                var1.method1074((byte) -28);
            } else if (class26.field699 >= var1.field2087) {
                var1.method610(arg0, class66.field1620);
                if (var1.field2096) {
                    var1.method1074((byte) -28);
                } else {
                    class64.field1585.method177(var1.field2093, var1.field2082, var1.field2101, var1.field2091, 60, var1, 0, -1, false);
                }
            }
        }
        if (arg0) {
            field546 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 482)
    public static final void method155(Component arg0, byte arg1) {
        field532++;
        Method var2 = class11.field281;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        if (arg1 != -73) {
            method152(-112, -61);
        }
        arg0.addKeyListener(class100.field2526);
        arg0.addFocusListener(class100.field2526);
    }
}
