import java.awt.Canvas;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class261 extends Canvas {

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field4548;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Lha;")
    public static class46 field4556 = class271.method1828("Update)2Liste geladen)3", -46);

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Lha;")
    public static class46 field4555 = class271.method1828("gleiten:", -46);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Lpi;")
    public static class181 field4545;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lpi;")
    public static class181 field4549;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lwg;")
    public static class22 field4547;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
    public static final void method1743(int arg0, int arg1) {
        if (arg1 != -18568) {
            method1745(82);
        }
        field4558++;
        class111.field2100.method81((byte) 30, arg0);
        class188.field3356.method81((byte) 30, arg0);
        class174.field3140.method81((byte) 30, arg0);
        client.field4679.method81((byte) 30, arg0);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZIZIIII)V")
    public static final void method1744(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field4550++;
        if (arg6 == 3) {
            method1744(true, -1, true, arg3, -1, 126, class138.field2484);
            return;
        }
        Container var7;
        if (class161.field2851 != null) {
            var7 = class161.field2851;
        } else if (class227.field3983 == null) {
            var7 = class8.field130.field143;
        } else {
            var7 = class227.field3983;
        }
        int var8 = -44 % ((arg5 - 63) / 32);
        class29.field565 = var7.getSize().width;
        class236.field4118 = var7.getSize().height;
        if (class227.field3983 == var7) {
            Insets var9 = class227.field3983.getInsets();
            class236.field4118 -= var9.top + var9.bottom;
            class29.field565 -= var9.right + var9.left;
        }
        if (arg6 < 2) {
            class73.field1297 = (class29.field565 - 765) / 2;
            class50.field876 = 765;
            class163.field2895 = 503;
            class64.field1079 = 0;
        } else {
            class50.field876 = class29.field565;
            class64.field1079 = 0;
            class73.field1297 = 0;
            class163.field2895 = class236.field4118;
        }
        if (arg2) {
            class169.method1200(class258.field4508, (byte) -122);
            class120.method957(class258.field4508, 11225);
            if (class5.field77 != null) {
                class5.field77.method94(class258.field4508, 28786);
            }
            class42.field710.method1631(-126);
            class10.method54(class258.field4508, (byte) -19);
            class269.method1804((byte) 126, class258.field4508);
            if (class5.field77 != null) {
                class5.field77.method93(class258.field4508, 65480);
            }
        } else {
            class258.field4508.setSize(class50.field876, class163.field2895);
            if (class227.field3983 == var7) {
                Insets var10 = class227.field3983.getInsets();
                class258.field4508.setLocation(var10.left + class73.field1297, class64.field1079 + var10.top);
            } else {
                class258.field4508.setLocation(class73.field1297, class64.field1079);
            }
        }
        if (arg6 > 0) {
            method1744(true, -1, true, arg3, -1, -32, 0);
            return;
        }
        class83.field1603 = !class180.method1291(2047);
        if (class114.field2157 != -1) {
            class81.method644((byte) 79, true);
        }
        if (class71.field1214 != null && (class135.field2448 == 30 || class135.field2448 == 25)) {
            class265.method1783(-60);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class31.field592[var11] = true;
        }
        class184.field3291 = true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method1745(int arg0) {
        field4555 = null;
        if (arg0 < 53) {
            method1744(true, -68, false, 28, 48, -49, 105);
        }
        field4547 = null;
        field4545 = null;
        field4556 = null;
        field4549 = null;
    }

    @OriginalMember(owner = "client!qe", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4543++;
        this.field4548.update(arg0);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(SB)Z")
    public static final boolean method1746(short arg0, byte arg1) {
        if (arg1 >= -8) {
            field4554 = -24;
        }
        field4552++;
        if (arg0 == 16 || arg0 == 38 || arg0 == 22 || arg0 == 30 || arg0 == 5 || arg0 == 8 || arg0 == 32 || arg0 == 46) {
            return true;
        } else if (arg0 == 3 || arg0 == 17 || arg0 == 1007 || arg0 == 1005) {
            return true;
        } else if (arg0 == 2 || arg0 == 50 || arg0 == 59 || arg0 == 20 || arg0 == 39) {
            return true;
        } else {
            return arg0 == 51 || arg0 == 24 || arg0 == 18 || arg0 == 43 || arg0 == 34 || arg0 == 31;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public static final void method1747(int arg0) {
        field4551++;
        class187 var1 = (class187) class15.field222.method264(arg0 - 3309);
        if (arg0 != 3222) {
            method1746((short) -17, (byte) -9);
        }
        while (var1 != null) {
            class169 var2 = var1.field3341;
            if (class135.field2450 != var2.field2977 || class157.field2803 > var2.field2991) {
                var1.method501(arg0 - 3222);
            } else if (var2.field2990 <= class157.field2803) {
                if (var2.field3012 > 0) {
                    class26 var3 = class2.field29[var2.field3012 - 1];
                    if (var3 != null && var3.field2585 >= 0 && var3.field2585 < 13312 && var3.field2546 >= 0 && var3.field2546 < 13312) {
                        var2.method1205(var3.field2546, class157.field2803, true, class206.method1461(var3.field2546, var2.field2977, var3.field2585, arg0 - 3218) - var2.field3016, var3.field2585);
                    }
                }
                if (var2.field3012 < 0) {
                    int var4 = -var2.field3012 - 1;
                    class81 var5;
                    if (class114.field2158 == var4) {
                        var5 = class277.field4824;
                    } else {
                        var5 = class1.field6[var4];
                    }
                    if (var5 != null && var5.field2585 >= 0 && var5.field2585 < 13312 && var5.field2546 >= 0 && var5.field2546 < 13312) {
                        var2.method1205(var5.field2546, class157.field2803, true, class206.method1461(var5.field2546, var2.field2977, var5.field2585, 4) - var2.field3016, var5.field2585);
                    }
                }
                var2.method1206(false, class237.field4202);
                class24.method166(class135.field2450, (int) var2.field2998, (int) var2.field3003, (int) var2.field3004, 60, var2, var2.field2985, -1L, false);
            }
            var1 = (class187) class15.field222.method269((byte) 7);
        }
    }

    @OriginalMember(owner = "client!qe", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field4548.paint(arg0);
        field4557++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIILuf;IIZIZ)V")
    public static final void method1748(int arg0, int arg1, int arg2, int arg3, int arg4, class154 arg5, int arg6, int arg7, boolean arg8, int arg9, boolean arg10) {
        field4553++;
        if (arg10 && !class180.method1291(arg9 ^ 0x7E9) && (class111.field2081[0][arg0][arg7] & 0x2) == 0) {
            if ((class111.field2081[arg3][arg0][arg7] & 0x10) != 0) {
                return;
            }
            if (class218.method1520(arg0, arg7, arg3, 21944) != class243.field4321) {
                return;
            }
        }
        if (arg3 < class203.field3637) {
            class203.field3637 = arg3;
        }
        class236 var11 = class157.method1158(arg6, 125);
        int var12;
        int var13;
        if (arg1 == 1 || arg1 == 3) {
            var13 = var11.field4130;
            var12 = var11.field4152;
        } else {
            var12 = var11.field4130;
            var13 = var11.field4152;
        }
        int var14;
        int var15;
        if (arg0 + var13 <= 104) {
            var14 = (var13 + 1 >> 1) + arg0;
            var15 = (var13 >> 1) + arg0;
        } else {
            var14 = arg0 + 1;
            var15 = arg0;
        }
        int var16;
        int var17;
        if (arg7 + var12 <= 104) {
            var16 = (var12 + 1 >> 1) + arg7;
            var17 = (var12 >> 1) + arg7;
        } else {
            var17 = arg7;
            var16 = arg7 + 1;
        }
        int[][] var18 = class119.field2228[arg4];
        int var19 = var18[var15][var17] + var18[var14][var17] + var18[var15][var16] + var18[var14][var16] >> 2;
        int var20 = (arg0 << 7) + (var13 << 6);
        int[][] var21 = null;
        int var22 = (arg7 << 7) + (var12 << 6);
        if (arg8) {
            var21 = class2.field33[0];
        } else if (arg4 < 3) {
            var21 = class119.field2228[arg4 + 1];
        }
        long var23 = (long) (arg1 | 0x400 << 20 | arg0 | arg7 << 7 | arg2 << 14);
        if (var11.field4133 == 0 || arg8) {
            var23 |= Long.MIN_VALUE;
        }
        if (var11.field4136 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field4108) {
            var23 |= 0x80000000L;
        }
        if (var11.method1619(-100)) {
            class66.method455(var11, (class81) null, arg9 ^ 0x16, arg3, arg1, (class26) null, arg0, arg7);
        }
        long var25 = var23 | (long) arg6 << 32;
        boolean var27 = var11.field4115 & !arg8;
        if (arg2 == 22) {
            if (class268.field4631 || var11.field4133 != 0 || var11.field4157 == 1 || var11.field4172) {
                class139 var29;
                if (var11.field4165 == -1 && var11.field4142 == null) {
                    class167 var28 = var11.method1618((class179) null, arg10, (byte) 16, var18, arg1, var21, var22, var27, 22, var19, var20);
                    var29 = var28.field2944;
                } else {
                    var29 = new class127(arg6, 22, arg1, arg4, arg0, arg7, var11.field4165, var11.field4177, (class139) null);
                }
                class210.method1482(arg3, arg0, arg7, var19, var29, var25, var11.field4124);
                if (var11.field4157 == 1 && arg5 != null) {
                    arg5.method1132(262144, arg7, arg0);
                }
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class139 var69;
            if (var11.field4165 == -1 && var11.field4142 == null) {
                class167 var68 = var11.method1618((class179) null, arg10, (byte) 93, var18, arg2 == 11 ? arg1 + 4 : arg1, var21, var22, var27, 10, var19, var20);
                var69 = var68.field2944;
            } else {
                var69 = new class127(arg6, 10, arg2 == 11 ? arg1 + 4 : arg1, arg4, arg0, arg7, var11.field4165, var11.field4177, (class139) null);
            }
            if (var69 != null) {
                boolean var70 = class202.method1430(arg3, arg0, arg7, var19, var13, var12, var69, 0, var25);
                if (var11.field4176 && var70 && arg10) {
                    int var71 = 15;
                    if (var69 instanceof class36) {
                        var71 = ((class36) var69).method231() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (var71 > class10.field171[arg3][arg0 + var72][arg7 + var73]) {
                                class10.field171[arg3][arg0 + var72][arg7 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field4157 != 0 && arg5 != null) {
                arg5.method1116(var13, var12, var11.field4139, arg0, arg7, (byte) -32);
            }
        } else if (arg2 >= 12) {
            class139 var31;
            if (var11.field4165 == -1 && var11.field4142 == null) {
                class167 var30 = var11.method1618((class179) null, arg10, (byte) 72, var18, arg1, var21, var22, var27, arg2, var19, var20);
                var31 = var30.field2944;
            } else {
                var31 = new class127(arg6, arg2, arg1, arg4, arg0, arg7, var11.field4165, var11.field4177, (class139) null);
            }
            class202.method1430(arg3, arg0, arg7, var19, 1, 1, var31, 0, var25);
            if (arg10 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg3 > 0) {
                class120.field2249[arg3][arg0][arg7] = class235.method1595(class120.field2249[arg3][arg0][arg7], 4);
            }
            if (var11.field4157 != 0 && arg5 != null) {
                arg5.method1116(var13, var12, var11.field4139, arg0, arg7, (byte) -121);
            }
        } else if (arg2 == 0) {
            class139 var33;
            if (var11.field4165 == -1 && var11.field4142 == null) {
                class167 var32 = var11.method1618((class179) null, arg10, (byte) 73, var18, arg1, var21, var22, var27, 0, var19, var20);
                var33 = var32.field2944;
            } else {
                var33 = new class127(arg6, 0, arg1, arg4, arg0, arg7, var11.field4165, var11.field4177, (class139) null);
            }
            class175.method1258(arg3, arg0, arg7, var19, var33, (class139) null, class40.field703[arg1], 0, var25);
            if (arg10) {
                if (arg1 == 0) {
                    if (var11.field4176) {
                        class10.field171[arg3][arg0][arg7] = 50;
                        class10.field171[arg3][arg0][arg7 + 1] = 50;
                    }
                    if (var11.field4166) {
                        class120.field2249[arg3][arg0][arg7] = class235.method1595(class120.field2249[arg3][arg0][arg7], 1);
                    }
                } else if (arg1 == 1) {
                    if (var11.field4176) {
                        class10.field171[arg3][arg0][arg7 + 1] = 50;
                        class10.field171[arg3][arg0 + 1][arg7 + 1] = 50;
                    }
                    if (var11.field4166) {
                        class120.field2249[arg3][arg0][arg7 + 1] = class235.method1595(class120.field2249[arg3][arg0][arg7 + 1], 2);
                    }
                } else if (arg1 == 2) {
                    if (var11.field4176) {
                        class10.field171[arg3][arg0 + 1][arg7] = 50;
                        class10.field171[arg3][arg0 + 1][arg7 + 1] = 50;
                    }
                    if (var11.field4166) {
                        class120.field2249[arg3][arg0 + 1][arg7] = class235.method1595(class120.field2249[arg3][arg0 + 1][arg7], 1);
                    }
                } else if (arg1 == 3) {
                    if (var11.field4176) {
                        class10.field171[arg3][arg0][arg7] = 50;
                        class10.field171[arg3][arg0 + 1][arg7] = 50;
                    }
                    if (var11.field4166) {
                        class120.field2249[arg3][arg0][arg7] = class235.method1595(class120.field2249[arg3][arg0][arg7], 2);
                    }
                }
            }
            if (var11.field4157 != 0 && arg5 != null) {
                arg5.method1122(var11.field4139, arg2, arg1, arg0, (byte) -19, arg7);
            }
            if (var11.field4167 != 16) {
                class274.method1854(arg3, arg0, arg7, var11.field4167);
            }
        } else if (arg2 == 1) {
            class139 var35;
            if (var11.field4165 == -1 && var11.field4142 == null) {
                class167 var34 = var11.method1618((class179) null, arg10, (byte) 35, var18, arg1, var21, var22, var27, 1, var19, var20);
                var35 = var34.field2944;
            } else {
                var35 = new class127(arg6, 1, arg1, arg4, arg0, arg7, var11.field4165, var11.field4177, (class139) null);
            }
            class175.method1258(arg3, arg0, arg7, var19, var35, (class139) null, class112.field2127[arg1], 0, var25);
            if (var11.field4176 && arg10) {
                if (arg1 == 0) {
                    class10.field171[arg3][arg0][arg7 + 1] = 50;
                } else if (arg1 == 1) {
                    class10.field171[arg3][arg0 + 1][arg7 + 1] = 50;
                } else if (arg1 == 2) {
                    class10.field171[arg3][arg0 + 1][arg7] = 50;
                } else if (arg1 == 3) {
                    class10.field171[arg3][arg0][arg7] = 50;
                }
            }
            if (var11.field4157 != 0 && arg5 != null) {
                arg5.method1122(var11.field4139, arg2, arg1, arg0, (byte) -19, arg7);
            }
        } else if (arg2 == 2) {
            int var36 = arg1 + 1 & 0x3;
            class139 var38;
            class139 var40;
            if (var11.field4165 == -1 && var11.field4142 == null) {
                class167 var37 = var11.method1618((class179) null, arg10, (byte) 74, var18, arg1 + 4, var21, var22, var27, 2, var19, var20);
                var38 = var37.field2944;
                class167 var39 = var11.method1618((class179) null, arg10, (byte) 120, var18, var36, var21, var22, var27, 2, var19, var20);
                var40 = var39.field2944;
            } else {
                var38 = new class127(arg6, 2, arg1 + 4, arg4, arg0, arg7, var11.field4165, var11.field4177, (class139) null);
                var40 = new class127(arg6, 2, var36, arg4, arg0, arg7, var11.field4165, var11.field4177, (class139) null);
            }
            class175.method1258(arg3, arg0, arg7, var19, var38, var40, class40.field703[arg1], class40.field703[var36], var25);
            if (var11.field4166 && arg10) {
                if (arg1 == 0) {
                    class120.field2249[arg3][arg0][arg7] = class235.method1595(class120.field2249[arg3][arg0][arg7], 1);
                    class120.field2249[arg3][arg0][arg7 + 1] = class235.method1595(class120.field2249[arg3][arg0][arg7 + 1], 2);
                } else if (arg1 == 1) {
                    class120.field2249[arg3][arg0][arg7 + 1] = class235.method1595(class120.field2249[arg3][arg0][arg7 + 1], 2);
                    class120.field2249[arg3][arg0 + 1][arg7] = class235.method1595(class120.field2249[arg3][arg0 + 1][arg7], 1);
                } else if (arg1 == 2) {
                    class120.field2249[arg3][arg0 + 1][arg7] = class235.method1595(class120.field2249[arg3][arg0 + 1][arg7], 1);
                    class120.field2249[arg3][arg0][arg7] = class235.method1595(class120.field2249[arg3][arg0][arg7], 2);
                } else if (arg1 == 3) {
                    class120.field2249[arg3][arg0][arg7] = class235.method1595(class120.field2249[arg3][arg0][arg7], 2);
                    class120.field2249[arg3][arg0][arg7] = class235.method1595(class120.field2249[arg3][arg0][arg7], 1);
                }
            }
            if (var11.field4157 != 0 && arg5 != null) {
                arg5.method1122(var11.field4139, arg2, arg1, arg0, (byte) -19, arg7);
            }
            if (var11.field4167 != 16) {
                class274.method1854(arg3, arg0, arg7, var11.field4167);
            }
        } else {
            if (arg9 != 22) {
                field4546 = -92;
            }
            if (arg2 == 3) {
                class139 var42;
                if (var11.field4165 == -1 && var11.field4142 == null) {
                    class167 var41 = var11.method1618((class179) null, arg10, (byte) 119, var18, arg1, var21, var22, var27, 3, var19, var20);
                    var42 = var41.field2944;
                } else {
                    var42 = new class127(arg6, 3, arg1, arg4, arg0, arg7, var11.field4165, var11.field4177, (class139) null);
                }
                class175.method1258(arg3, arg0, arg7, var19, var42, (class139) null, class112.field2127[arg1], 0, var25);
                if (var11.field4176 && arg10) {
                    if (arg1 == 0) {
                        class10.field171[arg3][arg0][arg7 + 1] = 50;
                    } else if (arg1 == 1) {
                        class10.field171[arg3][arg0 + 1][arg7 + 1] = 50;
                    } else if (arg1 == 2) {
                        class10.field171[arg3][arg0 + 1][arg7] = 50;
                    } else if (arg1 == 3) {
                        class10.field171[arg3][arg0][arg7] = 50;
                    }
                }
                if (var11.field4157 != 0 && arg5 != null) {
                    arg5.method1122(var11.field4139, arg2, arg1, arg0, (byte) -19, arg7);
                }
            } else if (arg2 == 9) {
                class139 var44;
                if (var11.field4165 == -1 && var11.field4142 == null) {
                    class167 var43 = var11.method1618((class179) null, arg10, (byte) 49, var18, arg1, var21, var22, var27, arg2, var19, var20);
                    var44 = var43.field2944;
                } else {
                    var44 = new class127(arg6, arg2, arg1, arg4, arg0, arg7, var11.field4165, var11.field4177, (class139) null);
                }
                class202.method1430(arg3, arg0, arg7, var19, 1, 1, var44, 0, var25);
                if (var11.field4157 != 0 && arg5 != null) {
                    arg5.method1116(var13, var12, var11.field4139, arg0, arg7, (byte) -42);
                }
                if (var11.field4167 != 16) {
                    class274.method1854(arg3, arg0, arg7, var11.field4167);
                }
            } else if (arg2 == 4) {
                class139 var46;
                if (var11.field4165 == -1 && var11.field4142 == null) {
                    class167 var45 = var11.method1618((class179) null, arg10, (byte) 125, var18, arg1, var21, var22, var27, 4, var19, var20);
                    var46 = var45.field2944;
                } else {
                    var46 = new class127(arg6, 4, arg1, arg4, arg0, arg7, var11.field4165, var11.field4177, (class139) null);
                }
                class112.method913(arg3, arg0, arg7, var19, var46, (class139) null, class40.field703[arg1], 0, 0, 0, var25);
            } else if (arg2 == 5) {
                long var47 = class264.method1779(arg3, arg0, arg7);
                int var49 = 16;
                if (var47 != 0L) {
                    var49 = class157.method1158((int) (var47 >>> 32) & Integer.MAX_VALUE, 109).field4167;
                }
                class139 var51;
                if (var11.field4165 == -1 && var11.field4142 == null) {
                    class167 var50 = var11.method1618((class179) null, arg10, (byte) 27, var18, arg1, var21, var22, var27, 4, var19, var20);
                    var51 = var50.field2944;
                } else {
                    var51 = new class127(arg6, 4, arg1, arg4, arg0, arg7, var11.field4165, var11.field4177, (class139) null);
                }
                class112.method913(arg3, arg0, arg7, var19, var51, (class139) null, class40.field703[arg1], 0, class152.field2703[arg1] * var49, class210.field3761[arg1] * var49, var25);
            } else if (arg2 == 6) {
                int var52 = 8;
                long var53 = class264.method1779(arg3, arg0, arg7);
                if (var53 != 0L) {
                    var52 = class157.method1158(Integer.MAX_VALUE & (int) (var53 >>> 32), 107).field4167 / 2;
                }
                class139 var56;
                if (var11.field4165 == -1 && var11.field4142 == null) {
                    class167 var55 = var11.method1618((class179) null, arg10, (byte) 95, var18, arg1 + 4, var21, var22, var27, 4, var19, var20);
                    var56 = var55.field2944;
                } else {
                    var56 = new class127(arg6, 4, arg1 + 4, arg4, arg0, arg7, var11.field4165, var11.field4177, (class139) null);
                }
                class112.method913(arg3, arg0, arg7, var19, var56, (class139) null, 256, arg1, class238.field4238[arg1] * var52, class102.field1857[arg1] * var52, var25);
            } else if (arg2 == 7) {
                int var57 = arg1 + 2 & 0x3;
                class139 var59;
                if (var11.field4165 == -1 && var11.field4142 == null) {
                    class167 var58 = var11.method1618((class179) null, arg10, (byte) 18, var18, var57 + 4, var21, var22, var27, 4, var19, var20);
                    var59 = var58.field2944;
                } else {
                    var59 = new class127(arg6, 4, var57 + 4, arg4, arg0, arg7, var11.field4165, var11.field4177, (class139) null);
                }
                class112.method913(arg3, arg0, arg7, var19, var59, (class139) null, 256, var57, 0, 0, var25);
            } else if (arg2 == 8) {
                int var60 = 8;
                long var61 = class264.method1779(arg3, arg0, arg7);
                if (var61 != 0L) {
                    var60 = class157.method1158((int) (var61 >>> 32) & Integer.MAX_VALUE, 105).field4167 / 2;
                }
                int var63 = arg1 + 2 & 0x3;
                class139 var65;
                class139 var67;
                if (var11.field4165 == -1 && var11.field4142 == null) {
                    class167 var64 = var11.method1618((class179) null, arg10, (byte) 41, var18, arg1 + 4, var21, var22, var27, 4, var19, var20);
                    var65 = var64.field2944;
                    class167 var66 = var11.method1618((class179) null, arg10, (byte) 44, var18, var63 + 4, var21, var22, var27, 4, var19, var20);
                    var67 = var66.field2944;
                } else {
                    var65 = new class127(arg6, 4, arg1 + 4, arg4, arg0, arg7, var11.field4165, var11.field4177, (class139) null);
                    var67 = new class127(arg6, 4, var63 + 4, arg4, arg0, arg7, var11.field4165, var11.field4177, (class139) null);
                }
                class112.method913(arg3, arg0, arg7, var19, var65, var67, 256, arg1, class238.field4238[arg1] * var60, class102.field1857[arg1] * var60, var25);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class261(Component arg0) {
        this.field4548 = arg0;
    }
}
