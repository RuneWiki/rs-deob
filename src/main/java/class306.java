import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class306 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "Ltl;")
    public static class59 field5181 = class85.method639("p12_full", 9588);

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Ltl;")
    public static class59 field5188 = class85.method639("Okay", 9588);

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Ltl;")
    public static class59 field5189 = class85.method639(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 9588);

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field5194 = 0;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "Lki;")
    public static class166 field5192;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "[[[S")
    public static short[][][] field5195;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIIIIII)V", line = 7)
    public static final void method2121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg10 - arg9;
        int var12 = 16 / ((arg1 + 33) / 46);
        int var13 = arg3 - arg5;
        if (arg10 < class62.field966) {
            var11++;
        }
        field5196++;
        if (arg3 < class216.field3532) {
            var13++;
        }
        int var10000;
        for (int var14 = 0; var14 < var11; var14++) {
            int var15 = arg6 + (arg7 * var14) >> 16;
            int var16 = arg6 + ((var14 + 1) * arg7) >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg9 + var14 >> 6;
                if (var18 >= 0 && (class288.field4942.length - 1) >= var18) {
                    int var19 = arg2 + var16;
                    int var20 = arg2 + var15;
                    int[][] var21 = class288.field4942[var18];
                    byte[][] var22 = class248.field4134[var18];
                    byte[][] var23 = class131.field2169[var18];
                    byte[][] var24 = class262.field4366[var18];
                    byte[][] var25 = class183.field3062[var18];
                    byte[][] var26 = class11.field148[var18];
                    for (int var27 = 0; var27 < var13; var27++) {
                        int var28 = arg0 + (arg4 * var27) >> 16;
                        int var29 = (var27 + 1) * arg4 + arg0 >> 16;
                        int var30 = var29 - var28;
                        if (var30 > 0) {
                            int var31 = arg8 + var28;
                            int var32 = arg5 + var27 >> 6;
                            int var33 = arg8 + var29;
                            int var34 = arg9 + var14 & 0x3F;
                            int var35 = arg5 + var27 & 0x3F;
                            int var36 = (var35 << 6) + var34;
                            int var37;
                            if (var32 < 0 || var32 > var21.length - 1 || var21[var32] == null) {
                                if (class53.field788.field4691 != -1) {
                                    var37 = class53.field788.field4691;
                                } else if ((arg5 + var27 & 0x4) == (arg9 + var14 & 0x4)) {
                                    var37 = class213.field3495[class236.field3922 + 1];
                                } else {
                                    var37 = 4936552;
                                }
                                if (var32 < 0 || var21.length - 1 < var32) {
                                    if (var37 == 0) {
                                        var37 = 1;
                                    }
                                    class272.method1892(var20, var31, var17, var30, var37);
                                    continue;
                                }
                            } else {
                                var37 = var21[var32][var36];
                            }
                            int var38 = var22[var32] == null ? 0 : class213.field3495[var22[var32][var36] & 0xFF];
                            int var39 = var23[var32] == null ? 0 : class213.field3495[var23[var32][var36] & 0xFF];
                            if (var37 == 0) {
                                var37 = 1;
                            }
                            if (var38 == 0 && var39 == 0) {
                                class272.method1892(var20, var31, var17, var30, var37);
                            } else {
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = 1;
                                    }
                                    byte var40 = var24[var32] == null ? 0 : var24[var32][var36];
                                    int var41 = var40 & 0xFC;
                                    if (var41 == 0 || var17 <= 1 || var30 <= 1) {
                                        class272.method1892(var20, var31, var17, var30, var38);
                                    } else {
                                        class43.method295(var40 & 0x3, true, var20, var30, var41 >> 2, var17, var37, class272.field4709, var38, 1, var31);
                                    }
                                }
                                if (var39 != 0) {
                                    if (var39 == -1) {
                                        var39 = var37;
                                    }
                                    byte var42 = var25[var32][var36];
                                    int var43 = var42 & 0xFC;
                                    if (var43 == 0 || var17 <= 1 || var30 <= 1) {
                                        class272.method1892(var20, var31, var17, var30, var39);
                                    }
                                    class43.method295(var42 & 0x3, var38 == 0, var20, var30, var43 >> 2, var17, 0, class272.field4709, var39, 1, var31);
                                }
                            }
                            if (var26[var32] != null) {
                                int var44 = var26[var32][var36] & 0xFF;
                                if (var44 != 0) {
                                    int var45;
                                    if (var30 == 1) {
                                        var45 = var31;
                                    } else {
                                        var45 = var33 - 1;
                                    }
                                    int var46;
                                    if (var17 == 1) {
                                        var46 = var20;
                                    } else {
                                        var46 = var19 - 1;
                                    }
                                    int var47 = 13421772;
                                    if (var44 >= 5 && var44 <= 8 || var44 >= 13 && var44 <= 16 || var44 >= 21 && var44 <= 24 || var44 == 27 || var44 == 28) {
                                        var44 -= 4;
                                        var47 = 13369344;
                                    }
                                    if (var44 == 1) {
                                        class272.method1897(var20, var31, var30, var47);
                                    } else if (var44 == 2) {
                                        class272.method1900(var20, var31, var17, var47);
                                    } else if (var44 == 3) {
                                        class272.method1897(var46, var31, var30, var47);
                                    } else if (var44 == 4) {
                                        class272.method1900(var20, var45, var17, var47);
                                    } else if (var44 == 9) {
                                        class272.method1897(var20, var31, var30, 16777215);
                                        class272.method1900(var20, var31, var17, var47);
                                    } else if (var44 == 10) {
                                        class272.method1897(var46, var31, var30, 16777215);
                                        class272.method1900(var20, var31, var17, var47);
                                    } else if (var44 == 11) {
                                        class272.method1897(var46, var31, var30, 16777215);
                                        class272.method1900(var20, var45, var17, var47);
                                    } else if (var44 == 12) {
                                        class272.method1897(var20, var31, var30, 16777215);
                                        class272.method1900(var20, var45, var17, var47);
                                    } else if (var44 == 17) {
                                        class272.method1900(var20, var31, 1, var47);
                                    } else if (var44 == 18) {
                                        class272.method1900(var46, var31, 1, var47);
                                    } else if (var44 == 19) {
                                        class272.method1900(var46, var45, 1, var47);
                                    } else if (var44 == 20) {
                                        class272.method1900(var20, var45, 1, var47);
                                    } else if (var44 == 25) {
                                        for (int var48 = 0; var48 < var30; var48++) {
                                            class272.method1900(var20 + var48, -var48 + var45, 1, var47);
                                        }
                                    } else if (var44 == 26) {
                                        for (int var49 = 0; var49 < var30; var49++) {
                                            class272.method1900(var20 + var49, var31 + var49, 1, var47);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg2 + var16;
                    int var51 = arg2 + var15;
                    for (int var52 = 0; var52 < var13; var52++) {
                        int var53;
                        if (class53.field788.field4691 != -1) {
                            var53 = class53.field788.field4691;
                        } else if ((var52 + arg5 & 0x4) == (arg9 + var14 & 0x4)) {
                            var53 = class213.field3495[class236.field3922 + 1];
                        } else {
                            var53 = 4936552;
                        }
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        int var54 = (arg4 * var52 + arg0 >> 16) + arg8;
                        int var55 = ((var52 + 1) * arg4 + arg0 >> 16) + arg8;
                        int var56 = var55 - var54;
                        class272.method1892(var51, var54, var17, var56, var53);
                    }
                }
            }
        }
        for (int var57 = -2; var57 < var11 + 2; var57++) {
            int var58 = (var57 + 1) * arg7 + arg6 >> 16;
            int var59 = arg7 * var57 + arg6 >> 16;
            int var60 = var58 - var59;
            if (var60 > 0) {
                var10000 = arg2 + var58;
                int var62 = arg2 + var59;
                int var63 = arg9 + var57 >> 6;
                if (var63 >= 0 && (field5195.length - 1) >= var63) {
                    short[][] var64 = field5195[var63];
                    for (int var65 = -2; var65 < var13 + 2; var65++) {
                        int var66 = arg4 * var65 + arg0 >> 16;
                        int var67 = (var65 + 1) * arg4 + arg0 >> 16;
                        int var68 = var67 - var66;
                        if (var68 > 0) {
                            int var69 = arg8 + var66;
                            int var70 = var65 + arg5 >> 6;
                            var10000 = arg8 + var67;
                            if (var70 >= 0 && (var64.length - 1) >= var70) {
                                int var72 = ((arg5 + var65 & 0x3F) << 6) + (arg9 + var57 & 0x3F);
                                if (var64[var70] != null) {
                                    int var73 = var64[var70][var72] & 0x3FFF;
                                    int var74 = (var64[var70][var72] & 0xE4D6) >> 14;
                                    if (var73 != 0) {
                                        if (var74 == 0) {
                                            int var75 = class198.field3279[var73 - 1].field3168 * var68 / 4;
                                            int var76 = class198.field3279[var73 - 1].field3157 * var68 / 4;
                                            int var77 = class198.field3279[var73 - 1].field3173 * var60 / 4;
                                            class198.field3279[var73 - 1].method42(var62, var69 - var76, var77, var75);
                                        } else if (var74 == 1) {
                                            int var84 = class38.field571[var73 - 1].field3173 * var60 / 4;
                                            int var85 = class38.field571[var73 - 1].field3168 * var68 / 4;
                                            int var86 = class38.field571[var73 - 1].field3157 * var68 / 4;
                                            class38.field571[var73 - 1].method42(var62, var69 - var86, var84, var85);
                                        } else if (var74 == 2) {
                                            int var78 = class307.field5204[var73 - 1].field3173 * var60 / 4;
                                            int var79 = class307.field5204[var73 - 1].field3168 * var68 / 4;
                                            int var80 = class307.field5204[var73 - 1].field3157 * var68 / 4;
                                            class307.field5204[var73 - 1].method42(var62, var69 - var80, var78, var79);
                                        } else if (var74 == 3) {
                                            int var81 = class157.field2580[var73 - 1].field3173 * var60 / 4;
                                            int var82 = class157.field2580[var73 - 1].field3157 * var68 / 4;
                                            int var83 = class157.field2580[var73 - 1].field3168 * var68 / 4;
                                            class157.field2580[var73 - 1].method42(var62, var69 - var82, var81, var83);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 437)
    public final void keyTyped(KeyEvent arg0) {
        field5191++;
        if (class236.field3916 != null) {
            int var2 = class120.method894(arg0, -1);
            if (var2 >= 0) {
                int var3 = class198.field3289 + 1 & 0x7F;
                if (class303.field5163 != var3) {
                    class295.field5066[class198.field3289] = -1;
                    class72.field1128[class198.field3289] = var2;
                    class198.field3289 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIII)V", line = 466)
    public static final void method2122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class55.field815) {
            int var8 = arg5 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = class58.field854 + ((class152.field2500 - class58.field854) * var8 / 100);
            arg2 = arg2 * var9 >> 8;
        }
        int var10 = 2048 - arg7 & 0x7FF;
        int var11 = -96 / ((-arg0 - 13) / 39);
        int var12 = 0;
        field5184++;
        int var13 = 2048 - arg6 & 0x7FF;
        int var14 = arg2;
        int var15 = 0;
        if (var10 != 0) {
            int var16 = class298.field5095[var10];
            var12 = -arg2 * var16 >> 16;
            int var17 = class298.field5094[var10];
            var14 = arg2 * var17 >> 16;
        }
        if (var13 != 0) {
            int var18 = class298.field5094[var13];
            int var19 = class298.field5095[var13];
            var15 = var14 * var19 >> 16;
            var14 = var14 * var18 >> 16;
        }
        class216.field3528 = arg1 - var14;
        class100.field1627 = arg7;
        class58.field853 = arg6;
        class226.field3640 = arg3 - var15;
        class185.field3109 = arg4 - var12;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ls;II)Ltl;", line = 572)
    public static final class59 method2123(class170 arg0, int arg1, int arg2) {
        field5187++;
        try {
            class59 var3 = new class59();
            var3.field863 = arg0.method1249(false);
            if (arg1 < var3.field863) {
                var3.field863 = arg1;
            }
            var3.field889 = new byte[var3.field863];
            arg0.field2787 += class303.field5159.method132(arg0.field2787, var3.field889, 0, arg2, var3.field863, arg0.field2758);
            return var3;
        } catch (Exception var5) {
            return class269.field4665;
        }
    }

    @OriginalMember(owner = "client!si", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 611)
    public final synchronized void focusLost(FocusEvent arg0) {
        field5186++;
        if (class236.field3916 != null) {
            class160.field2608 = -1;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V", line = 628)
    public static void method2124(boolean arg0) {
        field5181 = null;
        if (!arg0) {
            field5192 = null;
            field5188 = null;
            field5189 = null;
            field5195 = (short[][][]) null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V", line = 650)
    public static final void method2125(int arg0, int arg1) {
        class292.field4990.method1486(false, arg1);
        field5193++;
        if (arg0 <= 27) {
            field5189 = (class59) null;
        }
    }

    @OriginalMember(owner = "client!si", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 670)
    public final void focusGained(FocusEvent arg0) {
        field5198++;
    }

    @OriginalMember(owner = "client!si", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 687)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class236.field3916 != null) {
            class26.field344 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class285.field4901.length > var2) {
                var3 = class285.field4901[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class160.field2608 >= 0 && var3 >= 0) {
                class227.field3664[class160.field2608] = ~var3;
                class160.field2608 = class160.field2608 + 1 & 0x7F;
                if (class70.field1072 == class160.field2608) {
                    class160.field2608 = -1;
                }
            }
        }
        field5185++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V", line = 722)
    public static final void method2126(String arg0, int arg1, Throwable arg2) {
        field5197++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class152.method1093((byte) -123, arg2);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            if (arg1 != -13) {
                return;
            }
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class97.field1555.field2870 == null) {
                return;
            }
            class257 var8 = class97.field1555.method1296((byte) 85, new URL(class97.field1555.field2870.getCodeBase(), "clienterror.ws?c=" + class211.field3439 + "&u=" + class65.field999 + "&v1=" + class175.field2872 + "&v2=" + class175.field2876 + "&e=" + var7));
            while (var8.field4256 == 0) {
                class183.method1360(false, 1L);
            }
            if (var8.field4256 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field4255;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!si", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 796)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class236.field3916 != null) {
            class26.field344 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class285.field4901.length > var2) {
                var3 = class285.field4901[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class160.field2608 >= 0 && var3 >= 0) {
                class227.field3664[class160.field2608] = var3;
                class160.field2608 = class160.field2608 + 1 & 0x7F;
                if (class70.field1072 == class160.field2608) {
                    class160.field2608 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class198.field3289 + 1 & 0x7F;
                if (class303.field5163 != var4) {
                    class295.field5066[class198.field3289] = var3;
                    class72.field1128[class198.field3289] = -1;
                    class198.field3289 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field5190++;
    }
}
