import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class60 extends Canvas implements WindowListener {

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Ljava/applet/Applet;")
    private Applet field1236;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "Ljava/awt/Frame;")
    private Frame field1251;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Lo;")
    public static class84 field1249 = class15.method124("flash2:", 255);

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1243 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!k", name = "x", descriptor = "[Lo;")
    public static class84[] field1256 = new class84[200];

    @OriginalMember(owner = "client!k", name = "A", descriptor = "I")
    public static volatile int field1259 = 0;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "Lo;")
    public static class84 field1255 = class15.method124("l", 255);

    @OriginalMember(owner = "client!k", name = "z", descriptor = "Lo;")
    public static class84 field1258 = class15.method124("Please remove ", 255);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "Lqb;")
    public static class96 field1247;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "Lqb;")
    public static class96 field1250;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "[I")
    public static int[] field1257;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "[[Lmc;")
    public static class75[][] field1254;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIILfb;ILsd;BIII)V", line = 6)
    public static final void method480(int arg0, int arg1, int arg2, class33 arg3, int arg4, class108 arg5, byte arg6, int arg7, int arg8, int arg9) {
        field1252++;
        int var10 = class110.field2377[arg0][arg9][arg1];
        int var11 = class110.field2377[arg0][arg9 + 1][arg1];
        int var12 = class110.field2377[arg0][arg9 + 1][arg1 + 1];
        int var13 = class110.field2377[arg0][arg9][arg1 + 1];
        int var14 = var12 + var13 + var10 + var11 >> 2;
        class49 var15 = class110.method856((byte) -107, arg4);
        int var16 = (arg7 << 6) + arg2;
        int var17 = (arg1 << 7) + (arg4 << 14) + arg9 + 1073741824;
        if (var15.field1059 == 0) {
            var17 += Integer.MIN_VALUE;
        }
        if (var15.field1016 == 1) {
            var16 += 256;
        }
        if (arg2 == 22) {
            class58 var18;
            if (var15.field1048 == -1 && var15.field1041 == null) {
                var18 = var15.method414(arg7, var11, var13, var10, 22, -107, var12);
            } else {
                var18 = new class105(arg4, 22, arg7, var10, var11, var12, var13, var15.field1048, true);
            }
            arg5.method802(arg8, arg9, arg1, var14, var18, var17, var16);
            if (var15.field1021 && var15.field1059 == 1) {
                arg3.method303(arg1, 2097152, arg9);
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class58 var38;
            if (var15.field1048 == -1 && var15.field1041 == null) {
                var38 = var15.method414(arg7, var11, var13, var10, 10, -112, var12);
            } else {
                var38 = new class105(arg4, 10, arg7, var10, var11, var12, var13, var15.field1048, true);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg2 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg7 == 1 || arg7 == 3) {
                    var40 = var15.field1035;
                    var41 = var15.field1028;
                } else {
                    var40 = var15.field1028;
                    var41 = var15.field1035;
                }
                arg5.method796(arg8, arg9, arg1, var14, var40, var41, var38, var39, var17, var16);
            }
            if (var15.field1021) {
                arg3.method298(var15.field1035, var15.field1030, arg9, arg7, 19398920, arg1, var15.field1028);
            }
        } else if (arg2 >= 12) {
            class58 var19;
            if (var15.field1048 == -1 && var15.field1041 == null) {
                var19 = var15.method414(arg7, var11, var13, var10, arg2, arg6 ^ 0xFFFFFF99, var12);
            } else {
                var19 = new class105(arg4, arg2, arg7, var10, var11, var12, var13, var15.field1048, true);
            }
            arg5.method796(arg8, arg9, arg1, var14, 1, 1, var19, 0, var17, var16);
            if (var15.field1021) {
                arg3.method298(var15.field1035, var15.field1030, arg9, arg7, 19398920, arg1, var15.field1028);
            }
        } else if (arg2 == 0) {
            class58 var20;
            if (var15.field1048 == -1 && var15.field1041 == null) {
                var20 = var15.method414(arg7, var11, var13, var10, 0, -40, var12);
            } else {
                var20 = new class105(arg4, 0, arg7, var10, var11, var12, var13, var15.field1048, true);
            }
            arg5.method826(arg8, arg9, arg1, var14, var20, null, class6.field122[arg7], 0, var17, var16);
            if (var15.field1021) {
                arg3.method295(var15.field1030, true, arg7, arg1, arg9, arg2);
            }
        } else if (arg2 == 1) {
            class58 var21;
            if (var15.field1048 == -1 && var15.field1041 == null) {
                var21 = var15.method414(arg7, var11, var13, var10, 1, arg6 - 204, var12);
            } else {
                var21 = new class105(arg4, 1, arg7, var10, var11, var12, var13, var15.field1048, true);
            }
            arg5.method826(arg8, arg9, arg1, var14, var21, null, class118.field2589[arg7], 0, var17, var16);
            if (var15.field1021) {
                arg3.method295(var15.field1030, true, arg7, arg1, arg9, arg2);
            }
        } else if (arg2 == 2) {
            int var22 = arg7 + 1 & 0x3;
            class58 var23;
            class58 var24;
            if (var15.field1048 == -1 && var15.field1041 == null) {
                var23 = var15.method414(arg7 + 4, var11, var13, var10, 2, arg6 - 203, var12);
                var24 = var15.method414(var22, var11, var13, var10, 2, -111, var12);
            } else {
                var23 = new class105(arg4, 2, arg7 + 4, var10, var11, var12, var13, var15.field1048, true);
                var24 = new class105(arg4, 2, var22, var10, var11, var12, var13, var15.field1048, true);
            }
            arg5.method826(arg8, arg9, arg1, var14, var23, var24, class6.field122[arg7], class6.field122[var22], var17, var16);
            if (var15.field1021) {
                arg3.method295(var15.field1030, true, arg7, arg1, arg9, arg2);
            }
        } else if (arg2 == 3) {
            class58 var25;
            if (var15.field1048 == -1 && var15.field1041 == null) {
                var25 = var15.method414(arg7, var11, var13, var10, 3, -99, var12);
            } else {
                var25 = new class105(arg4, 3, arg7, var10, var11, var12, var13, var15.field1048, true);
            }
            arg5.method826(arg8, arg9, arg1, var14, var25, null, class118.field2589[arg7], 0, var17, var16);
            if (var15.field1021) {
                arg3.method295(var15.field1030, true, arg7, arg1, arg9, arg2);
            }
        } else if (arg6 == 79) {
            if (arg2 == 9) {
                class58 var26;
                if (var15.field1048 == -1 && var15.field1041 == null) {
                    var26 = var15.method414(arg7, var11, var13, var10, arg2, -81, var12);
                } else {
                    var26 = new class105(arg4, arg2, arg7, var10, var11, var12, var13, var15.field1048, true);
                }
                arg5.method796(arg8, arg9, arg1, var14, 1, 1, var26, 0, var17, var16);
                if (var15.field1021) {
                    arg3.method298(var15.field1035, var15.field1030, arg9, arg7, 19398920, arg1, var15.field1028);
                }
            } else {
                if (var15.field1072) {
                    if (arg7 == 1) {
                        int var30 = var13;
                        var13 = var12;
                        var12 = var11;
                        var11 = var10;
                        var10 = var30;
                    } else if (arg7 == 2) {
                        int var28 = var13;
                        var13 = var11;
                        var11 = var28;
                        int var29 = var12;
                        var12 = var10;
                        var10 = var29;
                    } else if (arg7 == 3) {
                        int var27 = var13;
                        var13 = var10;
                        var10 = var11;
                        var11 = var12;
                        var12 = var27;
                    }
                }
                if (arg2 == 4) {
                    class58 var31;
                    if (var15.field1048 == -1 && var15.field1041 == null) {
                        var31 = var15.method414(0, var11, var13, var10, 4, -85, var12);
                    } else {
                        var31 = new class105(arg4, 4, 0, var10, var11, var12, var13, var15.field1048, true);
                    }
                    arg5.method832(arg8, arg9, arg1, var14, var31, class6.field122[arg7], arg7 * 512, 0, 0, var17, var16);
                } else if (arg2 == 5) {
                    int var32 = arg5.method845(arg8, arg9, arg1);
                    int var33 = 16;
                    if (var32 > 0) {
                        var33 = class110.method856((byte) -107, var32 >> 14 & 0x7FFF).field1054;
                    }
                    class58 var34;
                    if (var15.field1048 == -1 && var15.field1041 == null) {
                        var34 = var15.method414(0, var11, var13, var10, 4, -81, var12);
                    } else {
                        var34 = new class105(arg4, 4, 0, var10, var11, var12, var13, var15.field1048, true);
                    }
                    arg5.method832(arg8, arg9, arg1, var14, var34, class6.field122[arg7], arg7 * 512, class101.field2139[arg7] * var33, class64.field1332[arg7] * var33, var17, var16);
                } else if (arg2 == 6) {
                    class58 var35;
                    if (var15.field1048 == -1 && var15.field1041 == null) {
                        var35 = var15.method414(0, var11, var13, var10, 4, -128, var12);
                    } else {
                        var35 = new class105(arg4, 4, 0, var10, var11, var12, var13, var15.field1048, true);
                    }
                    arg5.method832(arg8, arg9, arg1, var14, var35, 256, arg7, 0, 0, var17, var16);
                } else if (arg2 == 7) {
                    class58 var36;
                    if (var15.field1048 == -1 && var15.field1041 == null) {
                        var36 = var15.method414(0, var11, var13, var10, 4, -43, var12);
                    } else {
                        var36 = new class105(arg4, 4, 0, var10, var11, var12, var13, var15.field1048, true);
                    }
                    arg5.method832(arg8, arg9, arg1, var14, var36, 512, arg7, 0, 0, var17, var16);
                } else if (arg2 == 8) {
                    class58 var37;
                    if (var15.field1048 == -1 && var15.field1041 == null) {
                        var37 = var15.method414(0, var11, var13, var10, 4, arg6 - 186, var12);
                    } else {
                        var37 = new class105(arg4, 4, 0, var10, var11, var12, var13, var15.field1048, true);
                    }
                    arg5.method832(arg8, arg9, arg1, var14, var37, 768, arg7, 0, 0, var17, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 306)
    public final void windowDeiconified(WindowEvent arg0) {
        field1253++;
    }

    @OriginalMember(owner = "client!k", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 313)
    public final void windowClosing(WindowEvent arg0) {
        this.field1236.destroy();
        field1239++;
    }

    @OriginalMember(owner = "client!k", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 330)
    public final void windowIconified(WindowEvent arg0) {
        field1238++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILkc;II)V", line = 337)
    public static final void method481(int arg0, class63 arg1, int arg2, int arg3) {
        if ((arg2 & 0x80) != 0) {
            arg1.field1442 = class65.field1405.method228(117);
            if (arg1.field1442 == 65535) {
                arg1.field1442 = -1;
            }
        }
        if ((arg2 & 0x40) != 0) {
            int var4 = class65.field1405.method238(-121);
            byte[] var5 = new byte[var4];
            class27 var6 = new class27(var5);
            class65.field1405.method215(var5, 118, 0, var4);
            class69.field1474[arg0] = var6;
            arg1.method492(var6, -10496);
        }
        field1233++;
        if (arg3 != -31566) {
            return;
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field1416 = class65.field1405.method244((byte) 127);
            if (arg1.field1416.method644(false, 0) == 126) {
                arg1.field1416 = arg1.field1416.method655(28418, 1);
                class67.method514(2, arg1.field1312, arg1.field1416, true);
            } else if (class107.field2271 == arg1) {
                class67.method514(2, arg1.field1312, arg1.field1416, true);
            }
            arg1.field1415 = 0;
            arg1.field1408 = 150;
            arg1.field1376 = 0;
        }
        if ((arg2 & 0x8) != 0) {
            int var7 = class65.field1405.method228(116);
            int var8 = class65.field1405.method238(arg3 + 31538);
            if (var7 == 65535) {
                var7 = -1;
            }
            if (arg1.field1423 == var7 && var7 != -1) {
                int var9 = class74.method554(var7, 4867).field610;
                if (var9 == 1) {
                    arg1.field1414 = 0;
                    arg1.field1370 = 0;
                    arg1.field1432 = 0;
                    arg1.field1429 = var8;
                }
                if (var9 == 2) {
                    arg1.field1414 = 0;
                }
            } else if (var7 == -1 || arg1.field1423 == -1 || class74.method554(var7, 4867).field606 >= class74.method554(arg1.field1423, 4867).field606) {
                arg1.field1370 = 0;
                arg1.field1423 = var7;
                arg1.field1432 = 0;
                arg1.field1429 = var8;
                arg1.field1388 = arg1.field1425;
                arg1.field1414 = 0;
            }
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field1433 = class65.field1405.method238(6);
            arg1.field1438 = class65.field1405.method229(false);
            arg1.field1427 = class65.field1405.method238(arg3 ^ 0x7B32);
            arg1.field1393 = class65.field1405.method238(-115);
            arg1.field1383 = class65.field1405.method228(87) + class128.field2837;
            arg1.field1411 = class65.field1405.method204(arg3 + 31632) + class128.field2837;
            arg1.field1430 = class65.field1405.method229(false);
            arg1.method506(-2);
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field1417 = class65.field1405.method204(arg3 ^ 0xFFFF84CC);
            int var10 = class65.field1405.method251((byte) 105);
            arg1.field1401 = 0;
            if (arg1.field1417 == 65535) {
                arg1.field1417 = -1;
            }
            arg1.field1437 = class128.field2837 + (var10 & 0xFFFF);
            if (arg1.field1437 > class128.field2837) {
                arg1.field1401 = -1;
            }
            arg1.field1398 = var10 >> 16;
            arg1.field1372 = 0;
        }
        if ((arg2 & 0x1) != 0) {
            int var11 = class65.field1405.method228(arg3 ^ 0xFFFF84EB);
            int var12 = class65.field1405.method238(-122);
            int var13 = class65.field1405.method238(20);
            int var14 = class65.field1405.field482;
            if (arg1.field1312 != null && arg1.field1322 != null) {
                boolean var15 = false;
                long var16 = arg1.field1312.method649((byte) -127);
                if (var12 <= 1) {
                    for (int var18 = 0; var18 < class118.field2629; var18++) {
                        if (class103.field2166[var18] == var16) {
                            var15 = true;
                            break;
                        }
                    }
                }
                if (!var15 && class24.field405 == 0) {
                    class114.field2469.field482 = 0;
                    class65.field1405.method215(class114.field2469.field502, 114, 0, var13);
                    class114.field2469.field482 = 0;
                    class84 var19 = class8.method68(-46, class114.field2469).method636((byte) 29);
                    arg1.field1416 = var19.method648((byte) 12);
                    arg1.field1408 = 150;
                    arg1.field1415 = var11 >> 8;
                    arg1.field1376 = var11 & 0xFF;
                    if (var12 == 2 || var12 == 3) {
                        class67.method514(1, class97.method746(0, new class84[] { class111.field2412, arg1.field1312 }), var19, true);
                    } else if (var12 == 1) {
                        class67.method514(1, class97.method746(0, new class84[] { class49.field1067, arg1.field1312 }), var19, true);
                    } else {
                        class67.method514(2, arg1.field1312, var19, true);
                    }
                }
            }
            class65.field1405.field482 = var13 + var14;
        }
        if ((arg2 & 0x200) != 0) {
            int var20 = class65.field1405.method231(255);
            int var21 = class65.field1405.method231(255);
            arg1.method503(var20, 87, class128.field2837, var21);
            arg1.field1431 = class128.field2837 + 300;
            arg1.field1412 = class65.field1405.method229(false);
            arg1.field1386 = class65.field1405.method238(arg3 ^ 0xFFFF84E8);
        }
        if ((arg2 & 0x20) != 0) {
            int var22 = class65.field1405.method253(-17254);
            int var23 = class65.field1405.method231(255);
            arg1.method503(var22, 92, class128.field2837, var23);
            arg1.field1431 = class128.field2837 + 300;
            arg1.field1412 = class65.field1405.method229(false);
            arg1.field1386 = class65.field1405.method229(false);
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field1387 = class65.field1405.method228(127);
            arg1.field1406 = class65.field1405.method204(-33);
        }
    }

    @OriginalMember(owner = "client!k", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 566)
    public final void windowActivated(WindowEvent arg0) {
        field1235++;
    }

    @OriginalMember(owner = "client!k", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 575)
    public final void windowOpened(WindowEvent arg0) {
        field1234++;
    }

    @OriginalMember(owner = "client!k", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 585)
    public final void windowClosed(WindowEvent arg0) {
        field1245++;
    }

    @OriginalMember(owner = "client!k", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 594)
    public final void update(Graphics arg0) {
        this.field1236.update(arg0);
        field1244++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 602)
    public static void method482(int arg0) {
        field1255 = null;
        field1247 = null;
        field1250 = null;
        field1256 = null;
        field1257 = null;
        field1243 = null;
        field1254 = null;
        field1249 = null;
        if (arg0 != 1) {
            field1247 = null;
        }
        field1258 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IBLad;Lcb;)V", line = 621)
    public static final void method483(int arg0, byte arg1, class5 arg2, class15 arg3) {
        field1241++;
        class62 var4 = new class62();
        var4.field1289 = 1;
        var4.field1291 = arg2;
        var4.field1292 = arg3;
        var4.field731 = arg0;
        class88 var5 = class25.field421;
        synchronized (class25.field421) {
            class25.field421.method692((byte) -98, var4);
        }
        if (arg1 == 55) {
            class67.method517(-122);
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/applet/Applet;II)V", line = 649)
    public class60(Applet arg0, int arg1, int arg2) {
        this.field1236 = arg0;
        this.field1251 = new Frame();
        this.field1251.setTitle("Jagex");
        this.field1251.setResizable(false);
        this.setSize(arg1, arg2);
        this.field1251.add(this);
        this.field1251.pack();
        this.field1251.addWindowListener(this);
        this.field1251.setVisible(true);
        this.field1251.toFront();
    }

    @OriginalMember(owner = "client!k", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 669)
    public final void windowDeactivated(WindowEvent arg0) {
        field1246++;
    }

    @OriginalMember(owner = "client!k", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 676)
    public final void paint(Graphics arg0) {
        this.field1236.paint(arg0);
        field1240++;
    }
}
