import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Lob;")
    public static class99 field353 = new class99(30);

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field362 = 0;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "[[B")
    public static byte[][] field364 = new byte[50][];

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "Lje;")
    public static class67 field365 = class85.method592(255, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public static int field366 = 1;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public static int field367 = 0;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "Lje;")
    public static class67 field368 = class85.method592(255, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "Lje;")
    public static class67 field369 = class85.method592(255, "Stufe)2");

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "Lje;")
    public static class67 field370 = class85.method592(255, "logo");

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "[Lkd;")
    public static class73[] field363;

    @OriginalMember(owner = "client!cd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field350++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
    public static final void method132(int arg0, int arg1) {
        int var2 = 123 / ((-arg0 - 32) / 51);
        field351++;
        if (arg1 == -1 || !class135.method1024(arg1, (byte) -15)) {
            return;
        }
        class72[] var3 = class55.field1062[arg1];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class72 var5 = var3[var4];
            if (var5.field1472 != null) {
                class35 var6 = new class35();
                var6.field630 = var5.field1472;
                var6.field640 = var5;
                class71.method513((byte) 94, var6);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field356++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method133(byte arg0) {
        field368 = null;
        field364 = null;
        field365 = null;
        field363 = null;
        field369 = null;
        field370 = null;
        if (arg0 != 64) {
            field369 = null;
        }
        field353 = null;
    }

    @OriginalMember(owner = "client!cd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class60.field1203 != null) {
            class6.field139 = 0;
            class135.field3048 = arg0.getX();
            class151.field3456 = arg0.getY();
        }
        field358++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILhb;IIIIIILee;)V")
    public static final void method134(int arg0, class51 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class34 arg8) {
        field345++;
        if (class41.field773 && (class82.field1809[0][arg5][arg4] & 0x2) == 0) {
            if ((class82.field1809[arg2][arg5][arg4] & 0x10) != 0) {
                return;
            }
            if (class140.method1053(arg4, (byte) 88, arg5, arg2) != class2.field13) {
                return;
            }
        }
        if (arg2 < class2.field21) {
            class2.field21 = arg2;
        }
        class47 var9 = class130.method993(arg3, (byte) 110);
        int var10;
        int var11;
        if (arg6 == 1 || arg6 == 3) {
            var11 = var9.field875;
            var10 = var9.field931;
        } else {
            var10 = var9.field875;
            var11 = var9.field931;
        }
        int var12;
        int var13;
        if (arg5 + var10 > 104) {
            var12 = arg5 + 1;
            var13 = arg5;
        } else {
            var13 = (var10 >> 1) + arg5;
            var12 = (var10 + 1 >> 1) + arg5;
        }
        int var14;
        int var15;
        if (arg4 + var11 > 104) {
            var14 = arg4;
            var15 = arg4 + 1;
        } else {
            var14 = (var11 >> 1) + arg4;
            var15 = (var11 + 1 >> 1) + arg4;
        }
        int[][] var16 = class142.field3253[arg2];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg5 << 7) + (var10 << 6);
        int var19 = (arg4 << 7) + (var11 << 6);
        int var20 = (arg4 << 7) + ((arg3 << 14) + arg5 + 1073741824);
        int var21 = (arg6 << 6) + arg0;
        if (var9.field932 == 0) {
            var20 += Integer.MIN_VALUE;
        }
        if (var9.field883 == 1) {
            var21 += 256;
        }
        if (var9.method303(-14302)) {
            class140.method1062(arg2, arg5, var9, arg4, arg7 ^ 0xFFFFD77D, arg6);
        }
        if (arg0 == 22) {
            if (!class41.field773 || var9.field932 != 0 || var9.field894 == 1 || var9.field892) {
                class105 var22;
                if (var9.field903 == -1 && var9.field919 == null) {
                    var22 = var9.method300(var18, var17, var19, 22, (byte) -93, var16, arg6);
                } else {
                    var22 = new class3(arg3, 22, arg6, arg2, arg5, arg4, var9.field903, true, null);
                }
                arg1.method349(arg2, arg5, arg4, var17, var22, var20, var21);
                if (var9.field894 == 1 && arg8 != null) {
                    arg8.method218(arg4, arg5, (byte) -79);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class105 var45;
            if (var9.field903 == -1 && var9.field919 == null) {
                var45 = var9.method300(var18, var17, var19, 10, (byte) 91, var16, arg6);
            } else {
                var45 = new class3(arg3, 10, arg6, arg2, arg5, arg4, var9.field903, true, null);
            }
            if (var45 != null && arg1.method341(arg2, arg5, arg4, var17, var10, var11, var45, arg0 == 11 ? 256 : 0, var20, var21) && var9.field934) {
                int var46 = 15;
                if (var45 instanceof class5) {
                    var46 = ((class5) var45).method45() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (class106.field2424[arg2][arg5 + var47][arg4 + var48] < var46) {
                            class106.field2424[arg2][arg5 + var47][arg4 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field894 != 0 && arg8 != null) {
                arg8.method212((byte) -35, var11, arg5, var9.field918, var10, arg4);
            }
        } else if (arg0 >= 12) {
            class105 var23;
            if (var9.field903 == -1 && var9.field919 == null) {
                var23 = var9.method300(var18, var17, var19, arg0, (byte) -48, var16, arg6);
            } else {
                var23 = new class3(arg3, arg0, arg6, arg2, arg5, arg4, var9.field903, true, null);
            }
            arg1.method341(arg2, arg5, arg4, var17, 1, 1, var23, 0, var20, var21);
            if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg2 > 0) {
                class80.field1757[arg2][arg5][arg4] = class82.method579(class80.field1757[arg2][arg5][arg4], 2340);
            }
            if (var9.field894 != 0 && arg8 != null) {
                arg8.method212((byte) -35, var11, arg5, var9.field918, var10, arg4);
            }
        } else if (arg0 == 0) {
            class105 var24;
            if (var9.field903 == -1 && var9.field919 == null) {
                var24 = var9.method300(var18, var17, var19, 0, (byte) 121, var16, arg6);
            } else {
                var24 = new class3(arg3, 0, arg6, arg2, arg5, arg4, var9.field903, true, null);
            }
            arg1.method330(arg2, arg5, arg4, var17, var24, null, class122.field2737[arg6], 0, var20, var21);
            if (arg6 == 0) {
                if (var9.field934) {
                    class106.field2424[arg2][arg5][arg4] = 50;
                    class106.field2424[arg2][arg5][arg4 + 1] = 50;
                }
                if (var9.field905) {
                    class80.field1757[arg2][arg5][arg4] = class82.method579(class80.field1757[arg2][arg5][arg4], 585);
                }
            } else if (arg6 == 1) {
                if (var9.field934) {
                    class106.field2424[arg2][arg5][arg4 + 1] = 50;
                    class106.field2424[arg2][arg5 + 1][arg4 + 1] = 50;
                }
                if (var9.field905) {
                    class80.field1757[arg2][arg5][arg4 + 1] = class82.method579(class80.field1757[arg2][arg5][arg4 + 1], 1170);
                }
            } else if (arg6 == 2) {
                if (var9.field934) {
                    class106.field2424[arg2][arg5 + 1][arg4] = 50;
                    class106.field2424[arg2][arg5 + 1][arg4 + 1] = 50;
                }
                if (var9.field905) {
                    class80.field1757[arg2][arg5 + 1][arg4] = class82.method579(class80.field1757[arg2][arg5 + 1][arg4], 585);
                }
            } else if (arg6 == 3) {
                if (var9.field934) {
                    class106.field2424[arg2][arg5][arg4] = 50;
                    class106.field2424[arg2][arg5 + 1][arg4] = 50;
                }
                if (var9.field905) {
                    class80.field1757[arg2][arg5][arg4] = class82.method579(class80.field1757[arg2][arg5][arg4], 1170);
                }
            }
            if (var9.field894 != 0 && arg8 != null) {
                arg8.method224(arg4, arg6, var9.field918, arg5, arg7 - 24846, arg0);
            }
            if (var9.field906 != 16) {
                arg1.method329(arg2, arg5, arg4, var9.field906);
            }
        } else if (arg0 == 1) {
            class105 var25;
            if (var9.field903 == -1 && var9.field919 == null) {
                var25 = var9.method300(var18, var17, var19, 1, (byte) 124, var16, arg6);
            } else {
                var25 = new class3(arg3, 1, arg6, arg2, arg5, arg4, var9.field903, true, null);
            }
            arg1.method330(arg2, arg5, arg4, var17, var25, null, class144.field3298[arg6], 0, var20, var21);
            if (var9.field934) {
                if (arg6 == 0) {
                    class106.field2424[arg2][arg5][arg4 + 1] = 50;
                } else if (arg6 == 1) {
                    class106.field2424[arg2][arg5 + 1][arg4 + 1] = 50;
                } else if (arg6 == 2) {
                    class106.field2424[arg2][arg5 + 1][arg4] = 50;
                } else if (arg6 == 3) {
                    class106.field2424[arg2][arg5][arg4] = 50;
                }
            }
            if (var9.field894 != 0 && arg8 != null) {
                arg8.method224(arg4, arg6, var9.field918, arg5, arg7 - 25085, arg0);
            }
        } else if (arg0 == 2) {
            int var26 = arg6 + 1 & 0x3;
            class105 var27;
            class105 var28;
            if (var9.field903 == -1 && var9.field919 == null) {
                var27 = var9.method300(var18, var17, var19, 2, (byte) 93, var16, arg6 + 4);
                var28 = var9.method300(var18, var17, var19, 2, (byte) -99, var16, var26);
            } else {
                var27 = new class3(arg3, 2, arg6 + 4, arg2, arg5, arg4, var9.field903, true, null);
                var28 = new class3(arg3, 2, var26, arg2, arg5, arg4, var9.field903, true, null);
            }
            arg1.method330(arg2, arg5, arg4, var17, var27, var28, class122.field2737[arg6], class122.field2737[var26], var20, var21);
            if (var9.field905) {
                if (arg6 == 0) {
                    class80.field1757[arg2][arg5][arg4] = class82.method579(class80.field1757[arg2][arg5][arg4], 585);
                    class80.field1757[arg2][arg5][arg4 + 1] = class82.method579(class80.field1757[arg2][arg5][arg4 + 1], 1170);
                } else if (arg6 == 1) {
                    class80.field1757[arg2][arg5][arg4 + 1] = class82.method579(class80.field1757[arg2][arg5][arg4 + 1], 1170);
                    class80.field1757[arg2][arg5 + 1][arg4] = class82.method579(class80.field1757[arg2][arg5 + 1][arg4], 585);
                } else if (arg6 == 2) {
                    class80.field1757[arg2][arg5 + 1][arg4] = class82.method579(class80.field1757[arg2][arg5 + 1][arg4], 585);
                    class80.field1757[arg2][arg5][arg4] = class82.method579(class80.field1757[arg2][arg5][arg4], 1170);
                } else if (arg6 == 3) {
                    class80.field1757[arg2][arg5][arg4] = class82.method579(class80.field1757[arg2][arg5][arg4], 1170);
                    class80.field1757[arg2][arg5][arg4] = class82.method579(class80.field1757[arg2][arg5][arg4], 585);
                }
            }
            if (var9.field894 != 0 && arg8 != null) {
                arg8.method224(arg4, arg6, var9.field918, arg5, 97, arg0);
            }
            if (var9.field906 != 16) {
                arg1.method329(arg2, arg5, arg4, var9.field906);
            }
        } else if (arg0 == 3) {
            class105 var29;
            if (var9.field903 == -1 && var9.field919 == null) {
                var29 = var9.method300(var18, var17, var19, 3, (byte) 118, var16, arg6);
            } else {
                var29 = new class3(arg3, 3, arg6, arg2, arg5, arg4, var9.field903, true, null);
            }
            arg1.method330(arg2, arg5, arg4, var17, var29, null, class144.field3298[arg6], 0, var20, var21);
            if (var9.field934) {
                if (arg6 == 0) {
                    class106.field2424[arg2][arg5][arg4 + 1] = 50;
                } else if (arg6 == 1) {
                    class106.field2424[arg2][arg5 + 1][arg4 + 1] = 50;
                } else if (arg6 == 2) {
                    class106.field2424[arg2][arg5 + 1][arg4] = 50;
                } else if (arg6 == 3) {
                    class106.field2424[arg2][arg5][arg4] = 50;
                }
            }
            if (var9.field894 != 0 && arg8 != null) {
                arg8.method224(arg4, arg6, var9.field918, arg5, -92, arg0);
            }
        } else if (arg0 == 9) {
            class105 var30;
            if (var9.field903 == -1 && var9.field919 == null) {
                var30 = var9.method300(var18, var17, var19, arg0, (byte) -41, var16, arg6);
            } else {
                var30 = new class3(arg3, arg0, arg6, arg2, arg5, arg4, var9.field903, true, null);
            }
            arg1.method341(arg2, arg5, arg4, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field894 != 0 && arg8 != null) {
                arg8.method212((byte) -35, var11, arg5, var9.field918, var10, arg4);
            }
            if (var9.field906 != 16) {
                arg1.method329(arg2, arg5, arg4, var9.field906);
            }
        } else if (arg0 == 4) {
            class105 var31;
            if (var9.field903 == -1 && var9.field919 == null) {
                var31 = var9.method300(var18, var17, var19, 4, (byte) -106, var16, arg6);
            } else {
                var31 = new class3(arg3, 4, arg6, arg2, arg5, arg4, var9.field903, true, null);
            }
            arg1.method338(arg2, arg5, arg4, var17, var31, null, class122.field2737[arg6], 0, 0, 0, var20, var21);
        } else {
            if (arg7 != 24971) {
                method133((byte) -126);
            }
            if (arg0 == 5) {
                int var32 = 16;
                int var33 = arg1.method347(arg2, arg5, arg4);
                if (var33 != 0) {
                    var32 = class130.method993(var33 >> 14 & 0x7FFF, (byte) 121).field906;
                }
                class105 var34;
                if (var9.field903 == -1 && var9.field919 == null) {
                    var34 = var9.method300(var18, var17, var19, 4, (byte) -48, var16, arg6);
                } else {
                    var34 = new class3(arg3, 4, arg6, arg2, arg5, arg4, var9.field903, true, null);
                }
                arg1.method338(arg2, arg5, arg4, var17, var34, null, class122.field2737[arg6], 0, class126.field2762[arg6] * var32, class66.field1290[arg6] * var32, var20, var21);
            } else if (arg0 == 6) {
                int var35 = arg1.method347(arg2, arg5, arg4);
                int var36 = 8;
                if (var35 != 0) {
                    var36 = class130.method993(var35 >> 14 & 0x7FFF, (byte) 108).field906 / 2;
                }
                class105 var37;
                if (var9.field903 == -1 && var9.field919 == null) {
                    var37 = var9.method300(var18, var17, var19, 4, (byte) 73, var16, arg6 + 4);
                } else {
                    var37 = new class3(arg3, 4, arg6 + 4, arg2, arg5, arg4, var9.field903, true, null);
                }
                arg1.method338(arg2, arg5, arg4, var17, var37, null, 256, arg6, class85.field1881[arg6] * var36, class72.field1465[arg6] * var36, var20, var21);
            } else if (arg0 == 7) {
                int var38 = arg6 + 2 & 0x3;
                class105 var39;
                if (var9.field903 == -1 && var9.field919 == null) {
                    var39 = var9.method300(var18, var17, var19, 4, (byte) -97, var16, var38 + 4);
                } else {
                    var39 = new class3(arg3, 4, var38 + 4, arg2, arg5, arg4, var9.field903, true, null);
                }
                arg1.method338(arg2, arg5, arg4, var17, var39, null, 256, var38, 0, 0, var20, var21);
            } else if (arg0 == 8) {
                int var40 = arg1.method347(arg2, arg5, arg4);
                int var41 = 8;
                if (var40 != 0) {
                    var41 = class130.method993(var40 >> 14 & 0x7FFF, (byte) 116).field906 / 2;
                }
                int var42 = arg6 + 2 & 0x3;
                class105 var43;
                class105 var44;
                if (var9.field903 == -1 && var9.field919 == null) {
                    var43 = var9.method300(var18, var17, var19, 4, (byte) 106, var16, arg6 + 4);
                    var44 = var9.method300(var18, var17, var19, 4, (byte) -57, var16, var42 + 4);
                } else {
                    var43 = new class3(arg3, 4, arg6 + 4, arg2, arg5, arg4, var9.field903, true, null);
                    var44 = new class3(arg3, 4, var42 + 4, arg2, arg5, arg4, var9.field903, true, null);
                }
                arg1.method338(arg2, arg5, arg4, var17, var43, var44, 256, arg6, class85.field1881[arg6] * var41, class72.field1465[arg6] * var41, var20, var21);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class60.field1203 != null) {
            class6.field139 = 0;
            class135.field3048 = arg0.getX();
            class151.field3456 = arg0.getY();
        }
        field361++;
    }

    @OriginalMember(owner = "client!cd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class60.field1203 != null) {
            class6.field139 = 0;
            class135.field3048 = -1;
            class151.field3456 = -1;
        }
        field347++;
    }

    @OriginalMember(owner = "client!cd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field349++;
        if (class60.field1203 != null) {
            class6.field139 = 0;
            class75.field1623 = arg0.getX();
            class56.field1128 = arg0.getY();
            class80.field1758 = class150.method1148(-85808345);
            if (arg0.isMetaDown()) {
                class91.field2008 = 2;
                class89.field1978 = 2;
            } else {
                class91.field2008 = 1;
                class89.field1978 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class60.field1203 != null) {
            class6.field139 = 0;
            class135.field3048 = arg0.getX();
            class151.field3456 = arg0.getY();
        }
        field348++;
    }

    @OriginalMember(owner = "client!cd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class60.field1203 != null) {
            class89.field1978 = 0;
        }
        field354++;
    }

    @OriginalMember(owner = "client!cd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class60.field1203 != null) {
            class6.field139 = 0;
            class89.field1978 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field355++;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
    public static final void method135(byte arg0) {
        field346++;
        class55 var1 = (class55) class144.field3299.method26((byte) -94);
        if (arg0 != -81) {
            field363 = null;
        }
        while (var1 != null) {
            if (class128.field2817 != var1.field1066 || var1.field1101 < class34.field627) {
                var1.method115(26851);
            } else if (var1.field1086 <= class34.field627) {
                if (var1.field1065 > 0) {
                    class24 var2 = class152.field3479[var1.field1065 - 1];
                    if (var2 != null && var2.field2957 >= 0 && var2.field2957 < 13312 && var2.field2963 >= 0 && var2.field2963 < 13312) {
                        var1.method384(class114.method924(var2.field2957, var1.field1066, var2.field2963, -112) - var1.field1108, var2.field2963, var2.field2957, class34.field627, true);
                    }
                }
                if (var1.field1065 < 0) {
                    int var3 = -var1.field1065 - 1;
                    class83 var4;
                    if (class68.field1362 == var3) {
                        var4 = class37.field667;
                    } else {
                        var4 = class85.field1885[var3];
                    }
                    if (var4 != null && var4.field2957 >= 0 && var4.field2957 < 13312 && var4.field2963 >= 0 && var4.field2963 < 13312) {
                        var1.method384(class114.method924(var4.field2957, var1.field1066, var4.field2963, -110) - var1.field1108, var4.field2963, var4.field2957, class34.field627, true);
                    }
                }
                var1.method383(arg0 - 35, class60.field1204);
                class134.field3044.method360(class128.field2817, (int) var1.field1083, (int) var1.field1094, (int) var1.field1105, 60, var1, var1.field1074, -1, false);
            }
            var1 = (class55) class144.field3299.method18((byte) -128);
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)V")
    public static final void method136(byte arg0) {
        while (true) {
            if (class9.field196.method286(class155.field3544, -5) >= 11) {
                int var1 = class9.field196.method283(8, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class85.field1885[var1] == null) {
                        class85.field1885[var1] = new class83();
                        var2 = true;
                        if (class4.field59[var1] != null) {
                            class85.field1885[var1].method587(5653, class4.field59[var1]);
                        }
                    }
                    class151.field3464[class155.field3540++] = var1;
                    class83 var3 = class85.field1885[var1];
                    var3.field2979 = class34.field627;
                    int var4 = class9.field196.method283(8, 5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class9.field196.method283(8, 1);
                    int var6 = class55.field1109[class9.field196.method283(8, 3)];
                    if (var2) {
                        var3.field2972 = var3.field2992 = var6;
                    }
                    int var7 = class9.field196.method283(8, 1);
                    if (var7 == 1) {
                        class89.field1961[class71.field1442++] = var1;
                    }
                    int var8 = class9.field196.method283(8, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method1013(var5 == 1, class37.field667.field2993[0] + var4, class37.field667.field2942[0] + var8, -9);
                    continue;
                }
            }
            if (arg0 >= -105) {
                field370 = null;
            }
            field344++;
            class9.field196.method287(65);
            return;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIII)V")
    public static final void method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field360++;
        int var6 = class134.field3044.method347(arg0, arg1, arg4);
        if (var6 != 0) {
            int var7 = class134.field3044.method371(arg0, arg1, arg4, var6);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int[] var10 = class61.field1215.field2571;
            int var11 = arg2;
            int var12 = (103 - arg4) * 512 * 4 + arg1 * 4 + 24624;
            if (var6 > 0) {
                var11 = arg5;
            }
            int var13 = var6 >> 14 & 0x7FFF;
            class47 var14 = class130.method993(var13, (byte) 106);
            if (var14.field909 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var10[var12] = var11;
                        var10[var12 + 512] = var11;
                        var10[var12 + 1024] = var11;
                        var10[var12 + 1536] = var11;
                    } else if (var8 == 1) {
                        var10[var12] = var11;
                        var10[var12 + 1] = var11;
                        var10[var12 + 2] = var11;
                        var10[var12 + 3] = var11;
                    } else if (var8 == 2) {
                        var10[var12 + 3] = var11;
                        var10[var12 + 515] = var11;
                        var10[var12 + 1024 + 3] = var11;
                        var10[var12 + 3 + 1536] = var11;
                    } else if (var8 == 3) {
                        var10[var12 + 1536] = var11;
                        var10[var12 + 1537] = var11;
                        var10[var12 + 1536 + 2] = var11;
                        var10[var12 + 1536 + 3] = var11;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var10[var12] = var11;
                    } else if (var8 == 1) {
                        var10[var12 + 3] = var11;
                    } else if (var8 == 2) {
                        var10[var12 + 1536 + 3] = var11;
                    } else if (var8 == 3) {
                        var10[var12 + 1536] = var11;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var10[var12] = var11;
                        var10[var12 + 512] = var11;
                        var10[var12 + 1024] = var11;
                        var10[var12 + 1536] = var11;
                    } else if (var8 == 0) {
                        var10[var12] = var11;
                        var10[var12 + 1] = var11;
                        var10[var12 + 2] = var11;
                        var10[var12 + 3] = var11;
                    } else if (var8 == 1) {
                        var10[var12 + 3] = var11;
                        var10[var12 + 3 + 512] = var11;
                        var10[var12 + 3 + 1024] = var11;
                        var10[var12 + 3 + 1536] = var11;
                    } else if (var8 == 2) {
                        var10[var12 + 1536] = var11;
                        var10[var12 + 1 + 1536] = var11;
                        var10[var12 + 2 + 1536] = var11;
                        var10[var12 + 1539] = var11;
                    }
                }
            } else {
                class73 var15 = class30.field534[var14.field909];
                if (var15 != null) {
                    int var16 = (var14.field931 * 4 - var15.field1590) / 2;
                    int var17 = (var14.field875 * 4 - var15.field1592) / 2;
                    var15.method531(arg1 * 4 + var17 + 48, (104 - arg4 + -var14.field931) * 4 + var16 + 48);
                }
            }
        }
        int var18 = class134.field3044.method366(arg0, arg1, arg4);
        if (var18 != 0) {
            int var19 = class134.field3044.method371(arg0, arg1, arg4, var18);
            int var20 = var18 >> 14 & 0x7FFF;
            class47 var21 = class130.method993(var20, (byte) 107);
            int var22 = var19 & 0x1F;
            int var23 = var19 >> 6 & 0x3;
            if (var21.field909 != -1) {
                class73 var24 = class30.field534[var21.field909];
                if (var24 != null) {
                    int var25 = (var21.field875 * 4 - var24.field1592) / 2;
                    int var26 = (var21.field931 * 4 - var24.field1590) / 2;
                    var24.method531(arg1 * 4 + var25 + 48, (-arg4 + 104 + -var21.field931) * 4 + 48 + var26);
                }
            } else if (var22 == 9) {
                int var27 = 15658734;
                if (var18 > 0) {
                    var27 = 15597568;
                }
                int[] var28 = class61.field1215.field2571;
                int var29 = (103 - arg4) * 4 * 512 + arg1 * 4 + 24624;
                if (var23 == 0 || var23 == 2) {
                    var28[var29 + 1536] = var27;
                    var28[var29 + 1025] = var27;
                    var28[var29 + 514] = var27;
                    var28[var29 + 3] = var27;
                } else {
                    var28[var29] = var27;
                    var28[var29 + 513] = var27;
                    var28[var29 + 1026] = var27;
                    var28[var29 + 1536 + 3] = var27;
                }
            }
        }
        int var30 = class134.field3044.method352(arg0, arg1, arg4);
        if (var30 != 0) {
            int var31 = var30 >> 14 & 0x7FFF;
            class47 var32 = class130.method993(var31, (byte) 112);
            if (var32.field909 != -1) {
                class73 var33 = class30.field534[var32.field909];
                if (var33 != null) {
                    int var34 = (var32.field875 * 4 - var33.field1592) / 2;
                    int var35 = (var32.field931 * 4 - var33.field1590) / 2;
                    var33.method531(arg1 * 4 + var34 + 48, (104 - arg4 + -var32.field931) * 4 + 48 + var35);
                }
            }
        }
        if (arg3 != 1024) {
            method134(-118, null, 66, -111, 54, -51, -102, -53, null);
        }
    }
}
