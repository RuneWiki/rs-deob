import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class95 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Lmb;")
    public static class84 field2349 = class79.method672(true, "(U3");

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Lmb;")
    public static class84 field2356 = class79.method672(true, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2347 = 0;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "[B")
    public static byte[] field2358 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "Z")
    public static boolean field2365 = false;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field2363 = 0;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    public static int field2369 = 0;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    public static int field2371 = 0;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Lmb;")
    public static class84 field2361 = class79.method672(true, "");

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Lmb;")
    public static class84 field2367 = field2361;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Lmb;")
    public static class84 field2351 = field2361;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Lmb;")
    public static class84 field2360 = field2361;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lmb;")
    public static class84 field2344 = field2361;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lmb;")
    public static class84 field2345 = field2361;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lmb;")
    public static class84 field2346 = field2361;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Lmb;")
    public static class84 field2350 = field2361;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "J")
    public static long field2341;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Ldf;")
    public static class28 field2364;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "[[[B")
    public static byte[][][] field2353;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public static void method794(boolean arg0) {
        field2367 = null;
        field2351 = null;
        field2346 = null;
        field2360 = null;
        field2344 = null;
        field2349 = null;
        field2358 = null;
        field2350 = null;
        field2364 = null;
        if (arg0) {
            field2369 = 47;
        }
        field2345 = null;
        field2356 = null;
        field2361 = null;
        field2353 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BII)Z")
    public static final boolean method795(byte arg0, int arg1, int arg2) {
        field2368++;
        if (arg2 == 0 && class36.field798 == arg1) {
            return true;
        }
        if (arg0 >= -76) {
            field2346 = null;
        }
        if (arg2 == 1 && class41.field940 == arg1) {
            return true;
        } else {
            return (arg2 == 2 || arg2 == 3) && class134.field3206 == arg1;
        }
    }

    @OriginalMember(owner = "client!oa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field2357++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
    public static final void method796(int arg0, int arg1) {
        field2348++;
        if (arg1 == -1 || !class47.method338(110, arg1)) {
            return;
        }
        class57[] var2 = class24.field557[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class57 var4 = var2[var3];
            if (var4.field1352 != null) {
                class43.method320(0, null, 0, var4.field1352, true, 0, var4);
            }
        }
        if (arg0 <= 101) {
            field2344 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2366++;
        if (class107.field2598 != null) {
            class68.field1646 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class125.field3026.length > var2) {
                var3 = class125.field3026[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            int var4;
            if (var3 == 85 || var3 == 80 || var3 == 84 || var3 == 0 || var3 == 101) {
                var4 = -1;
            } else {
                var4 = class110.method898(arg0, (byte) 81);
            }
            if (class41.field930 >= 0 && var3 >= 0) {
                class106.field2568[class41.field930] = var3;
                class41.field930 = class41.field930 + 1 & 0x7F;
                if (class8.field135 == class41.field930) {
                    class41.field930 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class90.field2261 + 1 & 0x7F;
                if (class68.field1657 != var5) {
                    class66.field1630[class90.field2261] = var3;
                    class8.field139[class90.field2261] = var4;
                    class90.field2261 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static final void method797(byte arg0) {
        field2352++;
        for (class144 var1 = (class144) class91.field2281.method104((byte) 101); var1 != null; var1 = (class144) class91.field2281.method107(arg0 ^ 0xFFFFFF91)) {
            if (var1.field3458 == -1) {
                var1.field3468 = 0;
                class77.method663(var1, -105);
            } else {
                var1.method121(false);
            }
        }
        if (arg0 != 111) {
            method795((byte) -1, -50, 78);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILjc;IIIIILi;I)V")
    public static final void method798(int arg0, int arg1, class65 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class56 arg8, int arg9) {
        int var10 = class52.field1168[arg1][arg6][arg9];
        field2362++;
        int var11 = class52.field1168[arg1][arg6 + 1][arg9 + 1];
        int var12 = class52.field1168[arg1][arg6 + 1][arg9];
        int var13 = class52.field1168[arg1][arg6][arg9 + 1];
        int var14 = var10 + var12 + var11 + var13 >> 2;
        class36 var15 = class77.method661(arg0, -74);
        int var16 = (arg7 << 6) + arg5;
        int var17 = arg6 + (arg9 << 7) + (arg0 << 14) + 1073741824;
        if (var15.field755 == 0) {
            var17 += Integer.MIN_VALUE;
        }
        if (var15.field759 == 1) {
            var16 += 256;
        }
        if (arg5 == 22) {
            class68 var18;
            if (var15.field758 == -1 && var15.field802 == null) {
                var18 = var15.method266(22, var10, var12, var11, var13, arg7, 5);
            } else {
                var18 = new class82(arg0, 22, arg7, var10, var12, var11, var13, var15.field758, true, null);
            }
            arg8.method469(arg3, arg6, arg9, var14, var18, var17, var16);
            if (var15.field816 && var15.field755 == 1) {
                arg2.method589(arg9, (byte) -126, arg6);
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class68 var39;
            if (var15.field758 == -1 && var15.field802 == null) {
                var39 = var15.method266(10, var10, var12, var11, var13, arg7, 5);
            } else {
                var39 = new class82(arg0, 10, arg7, var10, var12, var11, var13, var15.field758, true, null);
            }
            if (var39 != null) {
                int var40;
                int var41;
                if (arg7 == 1 || arg7 == 3) {
                    var41 = var15.field767;
                    var40 = var15.field756;
                } else {
                    var40 = var15.field767;
                    var41 = var15.field756;
                }
                int var42 = 0;
                if (arg5 == 11) {
                    var42 += 256;
                }
                arg8.method483(arg3, arg6, arg9, var14, var40, var41, var39, var42, var17, var16);
            }
            if (var15.field816) {
                arg2.method584(var15.field756, var15.field773, arg7, arg9, var15.field767, arg6, (byte) -41);
            }
        } else if (arg5 >= 12) {
            class68 var19;
            if (var15.field758 == -1 && var15.field802 == null) {
                var19 = var15.method266(arg5, var10, var12, var11, var13, arg7, 5);
            } else {
                var19 = new class82(arg0, arg5, arg7, var10, var12, var11, var13, var15.field758, true, null);
            }
            arg8.method483(arg3, arg6, arg9, var14, 1, 1, var19, 0, var17, var16);
            if (var15.field816) {
                arg2.method584(var15.field756, var15.field773, arg7, arg9, var15.field767, arg6, (byte) -55);
            }
        } else if (arg5 == 0) {
            class68 var20;
            if (var15.field758 == -1 && var15.field802 == null) {
                var20 = var15.method266(0, var10, var12, var11, var13, arg7, 5);
            } else {
                var20 = new class82(arg0, 0, arg7, var10, var12, var11, var13, var15.field758, true, null);
            }
            arg8.method490(arg3, arg6, arg9, var14, var20, null, class68.field1661[arg7], 0, var17, var16);
            if (var15.field816) {
                arg2.method586(true, arg7, var15.field773, arg5, arg9, arg6);
            }
        } else if (arg5 == 1) {
            class68 var21;
            if (var15.field758 == -1 && var15.field802 == null) {
                var21 = var15.method266(1, var10, var12, var11, var13, arg7, 5);
            } else {
                var21 = new class82(arg0, 1, arg7, var10, var12, var11, var13, var15.field758, true, null);
            }
            arg8.method490(arg3, arg6, arg9, var14, var21, null, class38.field856[arg7], 0, var17, var16);
            if (var15.field816) {
                arg2.method586(true, arg7, var15.field773, arg5, arg9, arg6);
            }
        } else if (arg5 == 2) {
            int var22 = arg7 + 1 & 0x3;
            class68 var23;
            class68 var24;
            if (var15.field758 == -1 && var15.field802 == null) {
                var23 = var15.method266(2, var10, var12, var11, var13, arg7 + 4, 5);
                var24 = var15.method266(2, var10, var12, var11, var13, var22, 5);
            } else {
                var23 = new class82(arg0, 2, arg7 + 4, var10, var12, var11, var13, var15.field758, true, null);
                var24 = new class82(arg0, 2, var22, var10, var12, var11, var13, var15.field758, true, null);
            }
            arg8.method490(arg3, arg6, arg9, var14, var23, var24, class68.field1661[arg7], class68.field1661[var22], var17, var16);
            if (var15.field816) {
                arg2.method586(true, arg7, var15.field773, arg5, arg9, arg6);
            }
        } else {
            int var25 = -34 % ((81 - arg4) / 39);
            if (arg5 == 3) {
                class68 var26;
                if (var15.field758 == -1 && var15.field802 == null) {
                    var26 = var15.method266(3, var10, var12, var11, var13, arg7, 5);
                } else {
                    var26 = new class82(arg0, 3, arg7, var10, var12, var11, var13, var15.field758, true, null);
                }
                arg8.method490(arg3, arg6, arg9, var14, var26, null, class38.field856[arg7], 0, var17, var16);
                if (var15.field816) {
                    arg2.method586(true, arg7, var15.field773, arg5, arg9, arg6);
                }
            } else if (arg5 == 9) {
                class68 var27;
                if (var15.field758 == -1 && var15.field802 == null) {
                    var27 = var15.method266(arg5, var10, var12, var11, var13, arg7, 5);
                } else {
                    var27 = new class82(arg0, arg5, arg7, var10, var12, var11, var13, var15.field758, true, null);
                }
                arg8.method483(arg3, arg6, arg9, var14, 1, 1, var27, 0, var17, var16);
                if (var15.field816) {
                    arg2.method584(var15.field756, var15.field773, arg7, arg9, var15.field767, arg6, (byte) -86);
                }
            } else {
                if (var15.field805) {
                    if (arg7 == 1) {
                        int var31 = var13;
                        var13 = var11;
                        var11 = var12;
                        var12 = var10;
                        var10 = var31;
                    } else if (arg7 == 2) {
                        int var28 = var13;
                        var13 = var12;
                        var12 = var28;
                        int var29 = var11;
                        var11 = var10;
                        var10 = var29;
                    } else if (arg7 == 3) {
                        int var30 = var13;
                        var13 = var10;
                        var10 = var12;
                        var12 = var11;
                        var11 = var30;
                    }
                }
                if (arg5 == 4) {
                    class68 var32;
                    if (var15.field758 == -1 && var15.field802 == null) {
                        var32 = var15.method266(4, var10, var12, var11, var13, 0, 5);
                    } else {
                        var32 = new class82(arg0, 4, 0, var10, var12, var11, var13, var15.field758, true, null);
                    }
                    arg8.method455(arg3, arg6, arg9, var14, var32, class68.field1661[arg7], arg7 * 512, 0, 0, var17, var16);
                } else if (arg5 == 5) {
                    int var33 = arg8.method487(arg3, arg6, arg9);
                    int var34 = 16;
                    if (var33 != 0) {
                        var34 = class77.method661(var33 >> 14 & 0x7FFF, -70).field765;
                    }
                    class68 var35;
                    if (var15.field758 == -1 && var15.field802 == null) {
                        var35 = var15.method266(4, var10, var12, var11, var13, 0, 5);
                    } else {
                        var35 = new class82(arg0, 4, 0, var10, var12, var11, var13, var15.field758, true, null);
                    }
                    arg8.method455(arg3, arg6, arg9, var14, var35, class68.field1661[arg7], arg7 * 512, class17.field374[arg7] * var34, class93.field2311[arg7] * var34, var17, var16);
                } else if (arg5 == 6) {
                    class68 var36;
                    if (var15.field758 == -1 && var15.field802 == null) {
                        var36 = var15.method266(4, var10, var12, var11, var13, 0, 5);
                    } else {
                        var36 = new class82(arg0, 4, 0, var10, var12, var11, var13, var15.field758, true, null);
                    }
                    arg8.method455(arg3, arg6, arg9, var14, var36, 256, arg7, 0, 0, var17, var16);
                } else if (arg5 == 7) {
                    class68 var37;
                    if (var15.field758 == -1 && var15.field802 == null) {
                        var37 = var15.method266(4, var10, var12, var11, var13, 0, 5);
                    } else {
                        var37 = new class82(arg0, 4, 0, var10, var12, var11, var13, var15.field758, true, null);
                    }
                    arg8.method455(arg3, arg6, arg9, var14, var37, 512, arg7, 0, 0, var17, var16);
                } else if (arg5 == 8) {
                    class68 var38;
                    if (var15.field758 == -1 && var15.field802 == null) {
                        var38 = var15.method266(4, var10, var12, var11, var13, 0, 5);
                    } else {
                        var38 = new class82(arg0, 4, 0, var10, var12, var11, var13, var15.field758, true, null);
                    }
                    arg8.method455(arg3, arg6, arg9, var14, var38, 768, arg7, 0, 0, var17, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2354++;
        if (class107.field2598 != null) {
            class41.field930 = -1;
        }
    }

    @OriginalMember(owner = "client!oa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class107.field2598 != null) {
            class68.field1646 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class125.field3026.length) {
                var3 = class125.field3026[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class41.field930 >= 0 && var3 >= 0) {
                class106.field2568[class41.field930] = ~var3;
                class41.field930 = class41.field930 + 1 & 0x7F;
                if (class8.field135 == class41.field930) {
                    class41.field930 = -1;
                }
            }
        }
        arg0.consume();
        field2355++;
    }

    @OriginalMember(owner = "client!oa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2343++;
    }
}
