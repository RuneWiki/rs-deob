import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class9 extends class266 {

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "Lcd;")
    private static class64 field193 = class44.method335((byte) 71, "glow3:");

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field187 = 0;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "[Lcd;")
    public static class64[] field196 = new class64[100];

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "Lcd;")
    public static class64 field199 = field193;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "Lcd;")
    public static class64 field194 = field193;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "Lcd;")
    public static class64 field197 = class44.method335((byte) 71, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "Lcd;")
    public class64 field191;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "Lcd;")
    public class64 field192;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)Lgk;", line = 5)
    public static final class6 method79(byte arg0, int arg1) {
        field195++;
        class6 var2 = (class6) class149.field2616.method1194((long) arg1, (byte) -53);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 94) {
            field197 = (class64) null;
        }
        byte[] var3 = class277.field4772.method1580(0, class173.method1212((byte) 100, arg1), class36.method293(80, arg1));
        class6 var4 = new class6();
        var4.field129 = arg1;
        if (var3 != null) {
            var4.method59(25389, new class13(var3));
        }
        var4.method61(true);
        class149.field2616.method1190(12669, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZIIZZI)V", line = 29)
    public static final void method80(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        field198++;
        if (arg5) {
            class123.method892();
        }
        if (class263.field4514 != null && (arg2 != 3 || class268.field4616 != arg3 || class289.field4937 != arg0)) {
            class274.method1901(class263.field4514, 10, class228.field3876);
            class263.field4514 = null;
        }
        if (arg2 == 3 && class263.field4514 == null) {
            class263.field4514 = class183.method1293(arg0, arg3, -52, 0, class228.field3876, 0);
            if (class263.field4514 != null) {
                class289.field4937 = arg0;
                class268.field4616 = arg3;
                class274.method1899(class228.field3876, (byte) -41);
            }
        }
        if (arg2 == 3 && class263.field4514 == null) {
            method80(-1, true, class304.field5200, -1, false, true, arg6);
            return;
        }
        Container var7;
        if (class263.field4514 != null) {
            var7 = class263.field4514;
        } else if (class27.field441 == null) {
            var7 = class228.field3876.field4845;
        } else {
            var7 = class27.field441;
        }
        class34.field549 = var7.getSize().width;
        class2.field7 = var7.getSize().height;
        if (class27.field441 == var7) {
            Insets var8 = class27.field441.getInsets();
            class2.field7 -= var8.top + var8.bottom;
            class34.field549 -= var8.right + var8.left;
        }
        if (arg2 >= 2) {
            class13.field290 = class34.field549;
            class2.field14 = 0;
            class58.field960 = class2.field7;
            class277.field4774 = 0;
        } else {
            class2.field14 = (class34.field549 - 765) / 2;
            class277.field4774 = 0;
            class13.field290 = 765;
            class58.field960 = 503;
        }
        if (arg1) {
            class281.method1945(-7058, class307.field5251);
            class59.method460(66, class307.field5251);
            if (class43.field703 != null) {
                class43.field703.method198(class307.field5251, -90);
            }
            class134.field2370.method1323(-87);
            class122.method859(false, class307.field5251);
            class165.method1181((byte) 125, class307.field5251);
            if (class43.field703 != null) {
                class43.field703.method196((byte) -7, class307.field5251);
            }
        } else {
            if (class123.field2216) {
                class123.method887(class13.field290, class58.field960);
            }
            class307.field5251.setSize(class13.field290, class58.field960);
            if (class27.field441 == var7) {
                Insets var9 = class27.field441.getInsets();
                class307.field5251.setLocation(class2.field14 + var9.left, class277.field4774 + var9.top);
            } else {
                class307.field5251.setLocation(class2.field14, class277.field4774);
            }
        }
        if (arg2 == 0 && arg6 > 0) {
            class123.method878(class307.field5251);
        }
        if (arg5 && arg2 > 0) {
            class307.field5251.setIgnoreRepaint(true);
            if (!class223.field3807) {
                class74.method595();
                class183.field3130 = null;
                class183.field3130 = class32.method273(class307.field5251, class13.field290, -51, class58.field960);
                class210.method1457();
                if (class128.field2277 == 5) {
                    class292.method2016(16917, true, class75.field1419);
                } else {
                    class78.method617(false, class139.field2466, (byte) -110);
                }
                try {
                    Graphics var10 = class307.field5251.getGraphics();
                    class183.field3130.method673(76, var10, 0, 0);
                } catch (Exception var14) {
                }
                class109.method795(0);
                if (arg6 == 0) {
                    class183.field3130 = class32.method273(class307.field5251, 765, -51, 503);
                } else {
                    class183.field3130 = null;
                }
                class22 var12 = class228.field3876.method1954(class134.field2370.getClass(), true);
                while (var12.field375 == 0) {
                    class267.method1871(10, 100L);
                }
                if (var12.field375 == 1) {
                    class223.field3807 = true;
                }
            }
            if (class223.field3807) {
                class123.method900(class307.field5251, class155.field2741 * 2);
            }
        }
        if (!class123.field2216 && arg2 > 0) {
            method80(-1, true, 0, -1, arg4, true, arg6);
            return;
        }
        if (arg2 > 0 && arg6 == 0) {
            class66.field1313.setPriority(5);
            class183.field3130 = null;
            class5.method26();
            ((class241) class50.field816).method1754(0, 200);
            if (class274.field4701) {
                class50.method361(0.7F);
            }
        } else if (arg2 == 0 && arg6 > 0) {
            class66.field1313.setPriority(1);
            class183.field3130 = class32.method273(class307.field5251, 765, -51, 503);
            class5.method38();
            ((class241) class50.field816).method1754(0, 20);
            if (class274.field4701) {
                if (class201.field3441 == 1) {
                    class50.method361(0.9F);
                }
                if (class201.field3441 == 2) {
                    class50.method361(0.8F);
                }
                if (class201.field3441 == 3) {
                    class50.method361(0.7F);
                }
                if (class201.field3441 == 4) {
                    class50.method361(0.6F);
                }
            }
            class204.method1426();
        }
        if (arg5) {
            class31.method266(25);
        }
        if (arg2 >= 2) {
            class276.field4751 = true;
        } else {
            class276.field4751 = false;
        }
        if (class83.field1524 != -1) {
            class267.method1866(true, 90);
        }
        if (arg4) {
            return;
        }
        if (class216.field3626 != null && (class128.field2277 == 30 || class128.field2277 == 25)) {
            class83.method644(61);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class249.field4328[var13] = true;
        }
        class168.field2916 = true;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLkh;)V", line = 263)
    public static final void method81(byte arg0, class13 arg1) {
        field189++;
        int var2 = arg1.method163(arg0 ^ 0xDD);
        class113.field2091 = new class63[var2];
        if (arg0 != 34) {
            method85(-1);
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class113.field2091[var3] = new class63();
            class113.field2091[var3].field1220 = arg1.method163(arg0 ^ 0xDD);
            class113.field2091[var3].field1219 = arg1.method107((byte) -51);
        }
        class113.field2086 = arg1.method163(255);
        class61.field1196 = arg1.method163(255);
        class72.field1398 = arg1.method163(arg0 ^ 0xDD);
        class70.field1344 = new class9[class61.field1196 + 1 - class113.field2086];
        for (int var4 = 0; var4 < class72.field1398; var4++) {
            int var5 = arg1.method163(255);
            class9 var6 = class70.field1344[var5] = new class9();
            var6.field4574 = arg1.method152((byte) -75);
            var6.field4567 = arg1.method105((byte) 74);
            var6.field186 = class113.field2086 + var5;
            var6.field191 = arg1.method107((byte) -58);
            var6.field192 = arg1.method107((byte) -21);
        }
        class17.field348 = arg1.method105((byte) 41);
        class272.field4674 = true;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZILwf;IIIZIZI)V", line = 315)
    public static final void method82(int arg0, boolean arg1, int arg2, class54 arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9, int arg10) {
        field190++;
        if (arg7 && !class141.method1001((byte) -111) && (class82.field1508[0][arg4][arg8] & 0x2) == 0) {
            if ((class82.field1508[arg2][arg4][arg8] & 0x10) != 0) {
                return;
            }
            if (class77.method611(arg4, arg2, arg8, (byte) -82) != class27.field438) {
                return;
            }
        }
        if (arg2 < class120.field2173) {
            class120.field2173 = arg2;
        }
        class290 var11 = class172.method1207(arg5, -119);
        if (class123.field2216 && var11.field4968) {
            return;
        }
        int var12;
        int var13;
        if (arg10 == 1 || arg10 == 3) {
            var12 = var11.field5017;
            var13 = var11.field4957;
        } else {
            var12 = var11.field4957;
            var13 = var11.field5017;
        }
        int var14;
        int var15;
        if (arg4 + var13 > 104) {
            var14 = arg4 + 1;
            var15 = arg4;
        } else {
            var14 = (var13 + 1 >> 1) + arg4;
            var15 = (var13 >> 1) + arg4;
        }
        int var16;
        int var17;
        if ((arg8 + var12) <= 104) {
            var16 = (var12 >> 1) + arg8;
            var17 = (var12 + 1 >> 1) + arg8;
        } else {
            var16 = arg8;
            var17 = arg8 + 1;
        }
        int var18 = (arg8 << 7) + (var12 << 6);
        int var19 = (arg4 << 7) + (var13 << 6);
        int[][] var20 = class96.field1764[arg6];
        int var21 = var20[var14][var16] + var20[var15][var16] + var20[var14][var17] + var20[var15][var17] >> 2;
        int var22 = 0;
        if (class123.field2216 && arg6 != 0) {
            int[][] var23 = class96.field1764[0];
            var22 = var21 - (var23[var15][var16] + var23[var15][var17] + var23[var14][var17] + var23[var14][var16] >> 2);
        }
        int[][] var24 = (int[][]) null;
        long var25 = (long) (arg10 << 20 | arg4 | arg8 << 7 | arg0 << 14 | 0x40000000);
        if (arg9) {
            var24 = class266.field4571[0];
        } else if (arg6 < 3) {
            var24 = class96.field1764[arg6 + 1];
        }
        if (var11.field4967 == 0 || arg9) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field5009 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field5006) {
            var25 |= 0x80000000L;
        }
        long var27 = var25 | (long) arg5 << 32;
        if (var11.method2003(false)) {
            class296.method2065(arg4, arg8, -109, arg2, (class232) null, arg10, var11, (class41) null);
        }
        boolean var29 = !arg9 & var11.field5013;
        if (arg0 == 22) {
            if (class222.field3762 || var11.field4967 != 0 || var11.field4966 == 1 || var11.field5022) {
                class262 var77;
                if (var11.field5005 == -1 && var11.field4993 == null) {
                    class1 var76 = var11.method2000(var18, var20, -1, (class176) null, var19, var29, arg7, var24, 22, var21, arg10);
                    if (class123.field2216 && var29) {
                        class302.method2112(var76.field1, var19, var22, var18);
                    }
                    var77 = var76.field6;
                } else {
                    var77 = new class216(arg5, 22, arg10, arg6, arg4, arg8, var11.field5005, var11.field5008, (class262) null);
                }
                class122.method854(arg2, arg4, arg8, var21, var77, var27, var11.field5023);
                if (var11.field4966 == 1 && arg3 != null) {
                    arg3.method419(arg4, (byte) 109, arg8);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class262 var71;
            if (var11.field5005 == -1 && var11.field4993 == null) {
                class1 var70 = var11.method2000(var18, var20, -1, (class176) null, var19, var29, arg7, var24, 10, var21, arg0 == 11 ? arg10 + 4 : arg10);
                if (class123.field2216 && var29) {
                    class302.method2112(var70.field1, var19, var22, var18);
                }
                var71 = var70.field6;
            } else {
                var71 = new class216(arg5, 10, arg0 == 11 ? arg10 + 4 : arg10, arg6, arg4, arg8, var11.field5005, var11.field5008, (class262) null);
            }
            if (var71 != null) {
                boolean var72 = class58.method445(arg2, arg4, arg8, var21, var13, var12, var71, 0, var27);
                if (var11.field5016 && var72 && arg7) {
                    int var73 = 15;
                    if (var71 instanceof class243) {
                        var73 = ((class243) var71).method32() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var13; var74++) {
                        for (int var75 = 0; var75 <= var12; var75++) {
                            if (var73 > class168.field2912[arg2][arg4 + var74][arg8 + var75]) {
                                class168.field2912[arg2][arg4 + var74][arg8 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field4966 != 0 && arg3 != null) {
                arg3.method404(var13, arg4, var12, var11.field5021, arg8, -1);
            }
        } else if (arg0 >= 12) {
            class262 var31;
            if (var11.field5005 == -1 && var11.field4993 == null) {
                class1 var30 = var11.method2000(var18, var20, -1, (class176) null, var19, var29, arg7, var24, arg0, var21, arg10);
                if (class123.field2216 && var29) {
                    class302.method2112(var30.field1, var19, var22, var18);
                }
                var31 = var30.field6;
            } else {
                var31 = new class216(arg5, arg0, arg10, arg6, arg4, arg8, var11.field5005, var11.field5008, (class262) null);
            }
            class58.method445(arg2, arg4, arg8, var21, 1, 1, var31, 0, var27);
            if (arg7 && arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg2 > 0) {
                class222.field3784[arg2][arg4][arg8] = class11.method91(class222.field3784[arg2][arg4][arg8], 4);
            }
            if (var11.field4966 != 0 && arg3 != null) {
                arg3.method404(var13, arg4, var12, var11.field5021, arg8, -1);
            }
        } else if (arg0 == 0) {
            class262 var33;
            if (var11.field5005 == -1 && var11.field4993 == null) {
                class1 var32 = var11.method2000(var18, var20, -1, (class176) null, var19, var29, arg7, var24, 0, var21, arg10);
                if (class123.field2216 && var29) {
                    class302.method2112(var32.field1, var19, var22, var18);
                }
                var33 = var32.field6;
            } else {
                var33 = new class216(arg5, 0, arg10, arg6, arg4, arg8, var11.field5005, var11.field5008, (class262) null);
            }
            class131.method941(arg2, arg4, arg8, var21, var33, (class262) null, class94.field1743[arg10], 0, var27);
            if (arg7) {
                if (arg10 == 0) {
                    if (var11.field5016) {
                        class168.field2912[arg2][arg4][arg8] = 50;
                        class168.field2912[arg2][arg4][arg8 + 1] = 50;
                    }
                    if (var11.field4971) {
                        class222.field3784[arg2][arg4][arg8] = class11.method91(class222.field3784[arg2][arg4][arg8], 1);
                    }
                } else if (arg10 == 1) {
                    if (var11.field5016) {
                        class168.field2912[arg2][arg4][arg8 + 1] = 50;
                        class168.field2912[arg2][arg4 + 1][arg8 + 1] = 50;
                    }
                    if (var11.field4971) {
                        class222.field3784[arg2][arg4][arg8 + 1] = class11.method91(class222.field3784[arg2][arg4][arg8 + 1], 2);
                    }
                } else if (arg10 == 2) {
                    if (var11.field5016) {
                        class168.field2912[arg2][arg4 + 1][arg8] = 50;
                        class168.field2912[arg2][arg4 + 1][arg8 + 1] = 50;
                    }
                    if (var11.field4971) {
                        class222.field3784[arg2][arg4 + 1][arg8] = class11.method91(class222.field3784[arg2][arg4 + 1][arg8], 1);
                    }
                } else if (arg10 == 3) {
                    if (var11.field5016) {
                        class168.field2912[arg2][arg4][arg8] = 50;
                        class168.field2912[arg2][arg4 + 1][arg8] = 50;
                    }
                    if (var11.field4971) {
                        class222.field3784[arg2][arg4][arg8] = class11.method91(class222.field3784[arg2][arg4][arg8], 2);
                    }
                }
            }
            if (var11.field4966 != 0 && arg3 != null) {
                arg3.method406(arg10, arg8, (byte) 108, arg4, var11.field5021, arg0);
            }
            if (var11.field4988 != 16) {
                class154.method1116(arg2, arg4, arg8, var11.field4988);
            }
        } else if (arg0 == 1) {
            class262 var69;
            if (var11.field5005 == -1 && var11.field4993 == null) {
                class1 var68 = var11.method2000(var18, var20, -1, (class176) null, var19, var29, arg7, var24, 1, var21, arg10);
                if (class123.field2216 && var29) {
                    class302.method2112(var68.field1, var19, var22, var18);
                }
                var69 = var68.field6;
            } else {
                var69 = new class216(arg5, 1, arg10, arg6, arg4, arg8, var11.field5005, var11.field5008, (class262) null);
            }
            class131.method941(arg2, arg4, arg8, var21, var69, (class262) null, class124.field2244[arg10], 0, var27);
            if (var11.field5016 && arg7) {
                if (arg10 == 0) {
                    class168.field2912[arg2][arg4][arg8 + 1] = 50;
                } else if (arg10 == 1) {
                    class168.field2912[arg2][arg4 + 1][arg8 + 1] = 50;
                } else if (arg10 == 2) {
                    class168.field2912[arg2][arg4 + 1][arg8] = 50;
                } else if (arg10 == 3) {
                    class168.field2912[arg2][arg4][arg8] = 50;
                }
            }
            if (var11.field4966 != 0 && arg3 != null) {
                arg3.method406(arg10, arg8, (byte) 108, arg4, var11.field5021, arg0);
            }
        } else if (arg0 == 2) {
            int var63 = arg10 + 1 & 0x3;
            class262 var65;
            class262 var67;
            if (var11.field5005 == -1 && var11.field4993 == null) {
                class1 var64 = var11.method2000(var18, var20, -1, (class176) null, var19, var29, arg7, var24, 2, var21, arg10 + 4);
                if (class123.field2216 && var29) {
                    class302.method2112(var64.field1, var19, var22, var18);
                }
                var65 = var64.field6;
                class1 var66 = var11.method2000(var18, var20, -1, (class176) null, var19, var29, arg7, var24, 2, var21, var63);
                if (class123.field2216 && var29) {
                    class302.method2112(var66.field1, var19, var22, var18);
                }
                var67 = var66.field6;
            } else {
                var65 = new class216(arg5, 2, arg10 + 4, arg6, arg4, arg8, var11.field5005, var11.field5008, (class262) null);
                var67 = new class216(arg5, 2, var63, arg6, arg4, arg8, var11.field5005, var11.field5008, (class262) null);
            }
            class131.method941(arg2, arg4, arg8, var21, var65, var67, class94.field1743[arg10], class94.field1743[var63], var27);
            if (var11.field4971 && arg7) {
                if (arg10 == 0) {
                    class222.field3784[arg2][arg4][arg8] = class11.method91(class222.field3784[arg2][arg4][arg8], 1);
                    class222.field3784[arg2][arg4][arg8 + 1] = class11.method91(class222.field3784[arg2][arg4][arg8 + 1], 2);
                } else if (arg10 == 1) {
                    class222.field3784[arg2][arg4][arg8 + 1] = class11.method91(class222.field3784[arg2][arg4][arg8 + 1], 2);
                    class222.field3784[arg2][arg4 + 1][arg8] = class11.method91(class222.field3784[arg2][arg4 + 1][arg8], 1);
                } else if (arg10 == 2) {
                    class222.field3784[arg2][arg4 + 1][arg8] = class11.method91(class222.field3784[arg2][arg4 + 1][arg8], 1);
                    class222.field3784[arg2][arg4][arg8] = class11.method91(class222.field3784[arg2][arg4][arg8], 2);
                } else if (arg10 == 3) {
                    class222.field3784[arg2][arg4][arg8] = class11.method91(class222.field3784[arg2][arg4][arg8], 2);
                    class222.field3784[arg2][arg4][arg8] = class11.method91(class222.field3784[arg2][arg4][arg8], 1);
                }
            }
            if (var11.field4966 != 0 && arg3 != null) {
                arg3.method406(arg10, arg8, (byte) 108, arg4, var11.field5021, arg0);
            }
            if (var11.field4988 != 16) {
                class154.method1116(arg2, arg4, arg8, var11.field4988);
            }
        } else if (arg0 == 3) {
            class262 var62;
            if (var11.field5005 == -1 && var11.field4993 == null) {
                class1 var61 = var11.method2000(var18, var20, -1, (class176) null, var19, var29, arg7, var24, 3, var21, arg10);
                if (class123.field2216 && var29) {
                    class302.method2112(var61.field1, var19, var22, var18);
                }
                var62 = var61.field6;
            } else {
                var62 = new class216(arg5, 3, arg10, arg6, arg4, arg8, var11.field5005, var11.field5008, (class262) null);
            }
            class131.method941(arg2, arg4, arg8, var21, var62, (class262) null, class124.field2244[arg10], 0, var27);
            if (var11.field5016 && arg7) {
                if (arg10 == 0) {
                    class168.field2912[arg2][arg4][arg8 + 1] = 50;
                } else if (arg10 == 1) {
                    class168.field2912[arg2][arg4 + 1][arg8 + 1] = 50;
                } else if (arg10 == 2) {
                    class168.field2912[arg2][arg4 + 1][arg8] = 50;
                } else if (arg10 == 3) {
                    class168.field2912[arg2][arg4][arg8] = 50;
                }
            }
            if (var11.field4966 != 0 && arg3 != null) {
                arg3.method406(arg10, arg8, (byte) 108, arg4, var11.field5021, arg0);
            }
        } else if (arg0 == 9) {
            class262 var35;
            if (var11.field5005 == -1 && var11.field4993 == null) {
                class1 var34 = var11.method2000(var18, var20, -1, (class176) null, var19, var29, arg7, var24, arg0, var21, arg10);
                if (class123.field2216 && var29) {
                    class302.method2112(var34.field1, var19, var22, var18);
                }
                var35 = var34.field6;
            } else {
                var35 = new class216(arg5, arg0, arg10, arg6, arg4, arg8, var11.field5005, var11.field5008, (class262) null);
            }
            class58.method445(arg2, arg4, arg8, var21, 1, 1, var35, 0, var27);
            if (var11.field4966 != 0 && arg3 != null) {
                arg3.method404(var13, arg4, var12, var11.field5021, arg8, -1);
            }
            if (var11.field4988 != 16) {
                class154.method1116(arg2, arg4, arg8, var11.field4988);
            }
        } else if (arg0 == 4) {
            class262 var60;
            if (var11.field5005 == -1 && var11.field4993 == null) {
                class1 var59 = var11.method2000(var18, var20, -1, (class176) null, var19, var29, arg7, var24, 4, var21, arg10);
                if (class123.field2216 && var29) {
                    class302.method2112(var59.field1, var19, var22, var18);
                }
                var60 = var59.field6;
            } else {
                var60 = new class216(arg5, 4, arg10, arg6, arg4, arg8, var11.field5005, var11.field5008, (class262) null);
            }
            class197.method1384(arg2, arg4, arg8, var21, var60, (class262) null, class94.field1743[arg10], 0, 0, 0, var27);
        } else if (arg0 == 5) {
            int var36 = 16;
            long var37 = class313.method2167(arg2, arg4, arg8);
            if (var37 != 0L) {
                var36 = class172.method1207(Integer.MAX_VALUE & (int) (var37 >>> 32), -114).field4988;
            }
            class262 var40;
            if (var11.field5005 == -1 && var11.field4993 == null) {
                class1 var39 = var11.method2000(var18, var20, -1, (class176) null, var19, var29, arg7, var24, 4, var21, arg10);
                if (class123.field2216 && var29) {
                    class302.method2112(var39.field1, var19 - (class106.field1950[arg10] * 8), var22, var18 - (class229.field3881[arg10] * 8));
                }
                var40 = var39.field6;
            } else {
                var40 = new class216(arg5, 4, arg10, arg6, arg4, arg8, var11.field5005, var11.field5008, (class262) null);
            }
            class197.method1384(arg2, arg4, arg8, var21, var40, (class262) null, class94.field1743[arg10], 0, class106.field1950[arg10] * var36, class229.field3881[arg10] * var36, var27);
        } else {
            if (!arg1) {
                method85(-43);
            }
            if (arg0 == 6) {
                int var54 = 8;
                long var55 = class313.method2167(arg2, arg4, arg8);
                if (var55 != 0L) {
                    var54 = class172.method1207((int) (var55 >>> 32) & Integer.MAX_VALUE, -120).field4988 / 2;
                }
                class262 var58;
                if (var11.field5005 == -1 && var11.field4993 == null) {
                    class1 var57 = var11.method2000(var18, var20, -1, (class176) null, var19, var29, arg7, var24, 4, var21, arg10 + 4);
                    if (class123.field2216 && var29) {
                        class302.method2112(var57.field1, var19 - (class29.field495[arg10] * 8), var22, var18 - class182.field3127[arg10] * 8);
                    }
                    var58 = var57.field6;
                } else {
                    var58 = new class216(arg5, 4, arg10 + 4, arg6, arg4, arg8, var11.field5005, var11.field5008, (class262) null);
                }
                class197.method1384(arg2, arg4, arg8, var21, var58, (class262) null, 256, arg10, class29.field495[arg10] * var54, class182.field3127[arg10] * var54, var27);
            } else if (arg0 == 7) {
                int var41 = arg10 + 2 & 0x3;
                class262 var43;
                if (var11.field5005 == -1 && var11.field4993 == null) {
                    class1 var42 = var11.method2000(var18, var20, -1, (class176) null, var19, var29, arg7, var24, 4, var21, var41 + 4);
                    if (class123.field2216 && var29) {
                        class302.method2112(var42.field1, var19, var22, var18);
                    }
                    var43 = var42.field6;
                } else {
                    var43 = new class216(arg5, 4, var41 + 4, arg6, arg4, arg8, var11.field5005, var11.field5008, (class262) null);
                }
                class197.method1384(arg2, arg4, arg8, var21, var43, (class262) null, 256, var41, 0, 0, var27);
            } else if (arg0 == 8) {
                long var44 = class313.method2167(arg2, arg4, arg8);
                int var46 = arg10 + 2 & 0x3;
                int var47 = 8;
                if (var44 != 0L) {
                    var47 = class172.method1207((int) (var44 >>> 32) & Integer.MAX_VALUE, -112).field4988 / 2;
                }
                class262 var51;
                class262 var53;
                if (var11.field5005 == -1 && var11.field4993 == null) {
                    int var48 = class29.field495[arg10] * 8;
                    int var49 = class182.field3127[arg10] * 8;
                    class1 var50 = var11.method2000(var18, var20, -1, (class176) null, var19, var29, arg7, var24, 4, var21, arg10 + 4);
                    if (class123.field2216 && var29) {
                        class302.method2112(var50.field1, var19 - var48, var22, var18 - var49);
                    }
                    var51 = var50.field6;
                    class1 var52 = var11.method2000(var18, var20, -1, (class176) null, var19, var29, arg7, var24, 4, var21, var46 + 4);
                    if (class123.field2216 && var29) {
                        class302.method2112(var52.field1, var19 - var48, var22, var18 - var49);
                    }
                    var53 = var52.field6;
                } else {
                    var51 = new class216(arg5, 4, arg10 + 4, arg6, arg4, arg8, var11.field5005, var11.field5008, (class262) null);
                    var53 = new class216(arg5, 4, var46 + 4, arg6, arg4, arg8, var11.field5005, var11.field5008, (class262) null);
                }
                class197.method1384(arg2, arg4, arg8, var21, var51, var53, 256, arg10, class29.field495[arg10] * var47, class182.field3127[arg10] * var47, var27);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)Lri;", line = 987)
    public final class63 method83(byte arg0) {
        field200++;
        if (arg0 > -23) {
            field193 = (class64) null;
        }
        return class113.field2091[this.field4574];
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V", line = 999)
    public static final void method84(byte arg0) {
        field188++;
        class295.method2062(false);
        class153.method1108((byte) 3);
        class25.method234((byte) 39);
        class60.method476(5249);
        class226.method1633(-114);
        if (arg0 > -2) {
            return;
        }
        class157.method1132(-1868475513);
        class163.method1170(3301);
        class19.method190(-89);
        class19.method192((byte) 121);
        class159.method1144((byte) 107);
        class20.method194(0);
        class288.method1991(8);
        class312.method2153(255);
        class289.method1997((byte) -92);
        class258.field4460.method1198(false);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V", line = 1039)
    public static void method85(int arg0) {
        field193 = null;
        field196 = null;
        field197 = null;
        field194 = null;
        field199 = null;
        if (arg0 != 104) {
            method80(-86, true, 99, 87, true, true, -14);
        }
    }
}
