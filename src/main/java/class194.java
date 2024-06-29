import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class194 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field3022 = 0;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field3029 = 0;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lma;")
    public static class5 field3026 = class12.method119(" steht bereits auf Ihrer Ignorieren)2Liste(Q", (byte) 95);

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field3032 = 0;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Lma;")
    public static class5 field3025 = class12.method119(" )2> <col=ffffff>", (byte) 69);

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Lma;")
    private static class5 field3031 = class12.method119("Select a world", (byte) 53);

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field3027 = 0;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Lma;")
    public static class5 field3020 = field3031;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V", line = 22)
    public static void method1270(int arg0) {
        field3031 = null;
        if (arg0 < 38) {
            field3029 = 103;
        }
        field3020 = null;
        field3025 = null;
        field3026 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lni;Lni;I)V", line = 77)
    public static final void method1271(class202 arg0, class202 arg1, int arg2) {
        class169.field2597 = arg1;
        class144.field2093 = arg0;
        if (arg2 != 19661187) {
            method1272(59, -114, 39, -127, 72, true, 93, 121, -121, -107, (byte) 31, 18, -95);
        }
        field3028++;
    }

    @OriginalMember(owner = "client!va", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 95)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3033++;
        if (class61.field954 != null) {
            class153.field2255 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class116.field1722.length > var2) {
                var3 = class116.field1722[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class15.field280 >= 0 && var3 >= 0) {
                class303.field5114[class15.field280] = ~var3;
                class15.field280 = class15.field280 + 1 & 0x7F;
                if (class303.field5115 == class15.field280) {
                    class15.field280 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIZIIIIBII)Z", line = 126)
    public static final boolean method1272(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class165.field2518[var13][var14] = 0;
                class202.field3199[var13][var14] = 99999999;
            }
        }
        class165.field2518[arg0][arg1] = 99;
        if (arg10 != -107) {
            field3032 = 49;
        }
        field3024++;
        int var15 = arg0;
        int var16 = arg1;
        class202.field3199[arg0][arg1] = 0;
        byte var17 = 0;
        class111.field1649[var17] = arg0;
        int var18 = 0;
        int var41 = var17 + 1;
        class65.field1021[var17] = arg1;
        int[][] var19 = class242.field4031[class276.field4701].field793;
        boolean var20 = false;
        label392: while (var41 != var18) {
            var16 = class65.field1021[var18];
            var15 = class111.field1649[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg8 == var15 && arg9 == var16) {
                var20 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class242.field4031[class276.field4701].method384(var16, arg9, arg11 - 1, (byte) 124, arg8, arg3, arg2, var15)) {
                    var20 = true;
                    break;
                }
                if (arg11 < 10 && class242.field4031[class276.field4701].method373(arg3, var15, arg2, (byte) 8, arg8, arg11 - 1, arg9, var16)) {
                    var20 = true;
                    break;
                }
            }
            if (arg12 != 0 && arg6 != 0 && class242.field4031[class276.field4701].method387(arg12, arg9, arg2, arg8, arg6, -128, arg7, var16, var15)) {
                var20 = true;
                break;
            }
            int var21 = class202.field3199[var15][var16] + 1;
            if (var15 > 0 && class165.field2518[var15 - 1][var16] == 0 && (var19[var15 - 1][var16] & 0x12C010E) == 0 && (var19[var15 - 1][arg2 + var16 - 1] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if (var22 >= (arg2 - 1)) {
                        class111.field1649[var41] = var15 - 1;
                        class65.field1021[var41] = var16;
                        class165.field2518[var15 - 1][var16] = 2;
                        var41 = var41 + 1 & 0xFFF;
                        class202.field3199[var15 - 1][var16] = var21;
                        break;
                    }
                    if ((var19[var15 - 1][var16 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class165.field2518[var15 + 1][var16] == 0 && (var19[var15 + arg2][var16] & 0x12C0183) == 0 && (var19[arg2 + var15][var16 + arg2 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if (var23 >= arg2 - 1) {
                        class111.field1649[var41] = var15 + 1;
                        class65.field1021[var41] = var16;
                        var41 = var41 + 1 & 0xFFF;
                        class165.field2518[var15 + 1][var16] = 8;
                        class202.field3199[var15 + 1][var16] = var21;
                        break;
                    }
                    if ((var19[var15 + arg2][var16 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var16 > 0 && class165.field2518[var15][var16 - 1] == 0 && (var19[var15][var16 - 1] & 0x12C010E) == 0 && (var19[arg2 + var15 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if (var24 >= arg2 - 1) {
                        class111.field1649[var41] = var15;
                        class65.field1021[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class165.field2518[var15][var16 - 1] = 1;
                        class202.field3199[var15][var16 - 1] = var21;
                        break;
                    }
                    if ((var19[var15 + var24][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var16 < 102 && class165.field2518[var15][var16 + 1] == 0 && (var19[var15][arg2 + var16] & 0x12C0138) == 0 && (var19[var15 + arg2 - 1][arg2 + var16] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if (var25 >= (arg2 - 1)) {
                        class111.field1649[var41] = var15;
                        class65.field1021[var41] = var16 + 1;
                        class165.field2518[var15][var16 + 1] = 4;
                        class202.field3199[var15][var16 + 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var15 + var25][var16 + arg2] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var16 > 0 && class165.field2518[var15 - 1][var16 - 1] == 0 && (var19[var15 - 1][arg2 + var16 - 1 - 1] & 0x12C0138) == 0 && (var19[var15 - 1][var16 - 1] & 0x12C010E) == 0 && (var19[arg2 + var15 - 1 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if ((arg2 - 1) <= var26) {
                        class111.field1649[var41] = var15 - 1;
                        class65.field1021[var41] = var16 - 1;
                        class165.field2518[var15 - 1][var16 - 1] = 3;
                        class202.field3199[var15 - 1][var16 - 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var15 - 1][var16 + var26 - 1] & 0x12C013E) != 0 || (var19[var26 + var15 - 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var16 > 0 && class165.field2518[var15 + 1][var16 - 1] == 0 && (var19[var15 + 1][var16 - 1] & 0x12C010E) == 0 && (var19[arg2 + var15][var16 - 1] & 0x12C0183) == 0 && (var19[arg2 + var15][var16 - (-arg2 - -1) - 1] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if (var27 >= (arg2 - 1)) {
                        class111.field1649[var41] = var15 + 1;
                        class65.field1021[var41] = var16 - 1;
                        class165.field2518[var15 + 1][var16 - 1] = 9;
                        class202.field3199[var15 + 1][var16 - 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[arg2 + var15][var16 + var27 - 1] & 0x12C01E3) != 0 || (var19[var15 + var27 + 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var16 < 102 && class165.field2518[var15 - 1][var16 + 1] == 0 && (var19[var15 - 1][var16 + 1] & 0x12C010E) == 0 && (var19[var15 - 1][arg2 + var16] & 0x12C0138) == 0 && (var19[var15][var16 + arg2] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (var28 >= (arg2 - 1)) {
                        class111.field1649[var41] = var15 - 1;
                        class65.field1021[var41] = var16 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class165.field2518[var15 - 1][var16 + 1] = 6;
                        class202.field3199[var15 - 1][var16 + 1] = var21;
                        break;
                    }
                    if ((var19[var15 - 1][var16 + var28 + 1] & 0x12C013E) != 0 || (var19[var15 - (1 - var28)][arg2 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var16 < 102 && class165.field2518[var15 + 1][var16 + 1] == 0 && (var19[var15 + 1][var16 + arg2] & 0x12C0138) == 0 && (var19[var15 + arg2][arg2 + var16] & 0x12C01E0) == 0 && (var19[var15 + arg2][var16 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < (arg2 - 1); var29++) {
                    if ((var19[var15 + var29 + 1][arg2 + var16] & 0x12C01F8) != 0 || (var19[arg2 + var15][var29 + var16 + 1] & 0x12C01E3) != 0) {
                        continue label392;
                    }
                }
                class111.field1649[var41] = var15 + 1;
                class65.field1021[var41] = var16 + 1;
                class165.field2518[var15 + 1][var16 + 1] = 12;
                var41 = var41 + 1 & 0xFFF;
                class202.field3199[var15 + 1][var16 + 1] = var21;
            }
        }
        class261.field4464 = 0;
        if (!var20) {
            if (!arg5) {
                return false;
            }
            int var30 = 1000;
            int var31 = 100;
            byte var32 = 10;
            for (int var33 = arg8 - var32; var33 <= (arg8 + var32); var33++) {
                for (int var34 = arg9 - var32; var34 <= (arg9 + var32); var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class202.field3199[var33][var34] < 100) {
                        int var35 = 0;
                        int var36 = 0;
                        if (var34 < arg9) {
                            var36 = arg9 - var34;
                        } else if (arg6 + arg9 - 1 < var34) {
                            var36 = var34 + 1 - arg9 - arg6;
                        }
                        if (arg8 > var33) {
                            var35 = arg8 - var33;
                        } else if (arg12 + arg8 - 1 < var33) {
                            var35 = var33 + 1 - arg8 - arg12;
                        }
                        int var37 = var35 * var35 + var36 * var36;
                        if (var30 > var37 || var30 == var37 && class202.field3199[var33][var34] < var31) {
                            var15 = var33;
                            var31 = class202.field3199[var33][var34];
                            var16 = var34;
                            var30 = var37;
                        }
                    }
                }
            }
            if (var30 == 1000) {
                return false;
            }
            if (arg0 == var15 && arg1 == var16) {
                return false;
            }
            class261.field4464 = 1;
        }
        byte var38 = 0;
        class111.field1649[var38] = var15;
        int var42 = var38 + 1;
        class65.field1021[var38] = var16;
        int var39;
        int var40 = var39 = class165.field2518[var15][var16];
        while (arg0 != var15 || arg1 != var16) {
            if (var39 != var40) {
                class111.field1649[var42] = var15;
                class65.field1021[var42++] = var16;
                var39 = var40;
            }
            if ((var40 & 0x1) != 0) {
                var16++;
            } else if ((var40 & 0x4) != 0) {
                var16--;
            }
            if ((var40 & 0x2) != 0) {
                var15++;
            } else if ((var40 & 0x8) != 0) {
                var15--;
            }
            var40 = class165.field2518[var15][var16];
        }
        if (var42 > 0) {
            class250.method1750(false, arg4, var42);
            return true;
        } else if (arg4 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!va", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 627)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3019++;
        if (class61.field954 == null) {
            return;
        }
        class153.field2255 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class116.field1722.length > var2) {
            var3 = class116.field1722[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class15.field280 >= 0 && var3 >= 0) {
            class303.field5114[class15.field280] = var3;
            class15.field280 = class15.field280 + 1 & 0x7F;
            if (class303.field5115 == class15.field280) {
                class15.field280 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class29.field475 + 1 & 0x7F;
            if (client.field1760 != var4) {
                class106.field1576[class29.field475] = var3;
                class48.field741[class29.field475] = -1;
                class29.field475 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!va", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 720)
    public final void keyTyped(KeyEvent arg0) {
        field3021++;
        if (class61.field954 != null) {
            int var2 = class214.method1411(arg0, -9758);
            if (var2 >= 0) {
                int var3 = class29.field475 + 1 & 0x7F;
                if (client.field1760 != var3) {
                    class106.field1576[class29.field475] = -1;
                    class48.field741[class29.field475] = var2;
                    class29.field475 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!va", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 752)
    public final void focusGained(FocusEvent arg0) {
        field3034++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIII)V", line = 788)
    public static final void method1273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class39.method280(arg1, false);
        field3023++;
        int var7 = 0;
        int var8 = arg1 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -1;
        int var13 = -1;
        int var14 = -var8;
        int[] var15 = class137.field2032[arg5];
        int var16 = arg3 - var8;
        int var17 = arg3 + var8;
        int var18 = 97 / ((26 - arg6) / 63);
        class239.method1690(arg3 - arg1, 23267, var16, var15, arg2);
        class239.method1690(var16, 23267, var17, var15, arg0);
        class239.method1690(var17, 23267, arg1 + arg3, var15, arg2);
        while (var9 > var7) {
            var12 += 2;
            var10 += var12;
            var13 += 2;
            var14 += var13;
            if (var14 >= 0 && var11 >= 1) {
                class248.field4101[var11] = var7;
                var11--;
                var14 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var19 = class137.field2032[arg5 + var9];
                    int[] var20 = class137.field2032[arg5 - var9];
                    int var21 = class248.field4101[var9];
                    int var22 = arg3 - var7;
                    int var23 = arg3 + var7;
                    int var24 = arg3 + var21;
                    int var25 = arg3 - var21;
                    class239.method1690(var22, 23267, var25, var19, arg2);
                    class239.method1690(var25, 23267, var24, var19, arg0);
                    class239.method1690(var24, 23267, var23, var19, arg2);
                    class239.method1690(var22, 23267, var25, var20, arg2);
                    class239.method1690(var25, 23267, var24, var20, arg0);
                    class239.method1690(var24, 23267, var23, var20, arg2);
                } else {
                    int[] var26 = class137.field2032[arg5 + var9];
                    int var27 = arg3 - var7;
                    int[] var28 = class137.field2032[arg5 - var9];
                    int var29 = arg3 + var7;
                    class239.method1690(var27, 23267, var29, var26, arg2);
                    class239.method1690(var27, 23267, var29, var28, arg2);
                }
            }
            int var30 = arg3 + var9;
            int[] var31 = class137.field2032[arg5 - var7];
            int var32 = arg3 - var9;
            int[] var33 = class137.field2032[arg5 + var7];
            if (var8 > var7) {
                int var34 = var7 <= var11 ? var11 : class248.field4101[var7];
                int var35 = arg3 - var34;
                class239.method1690(var32, 23267, var35, var33, arg2);
                int var36 = arg3 + var34;
                class239.method1690(var35, 23267, var36, var33, arg0);
                class239.method1690(var36, 23267, var30, var33, arg2);
                class239.method1690(var32, 23267, var35, var31, arg2);
                class239.method1690(var35, 23267, var36, var31, arg0);
                class239.method1690(var36, 23267, var30, var31, arg2);
            } else {
                class239.method1690(var32, 23267, var30, var33, arg2);
                class239.method1690(var32, 23267, var30, var31, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Lkg;", line = 917)
    public static final class107 method1274(int arg0, int arg1, int arg2) {
        class198 var3 = class43.field646[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3162; var4++) {
            class107 var5 = var3.field3166[var4];
            if ((var5.field1590 >> 29 & 0x3L) == 2L && var5.field1597 == arg1 && var5.field1595 == arg2) {
                class89.method588(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!va", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 942)
    public final synchronized void focusLost(FocusEvent arg0) {
        field3030++;
        if (class61.field954 != null) {
            class15.field280 = -1;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIILkb;IJ)Z", line = 965)
    public static final boolean method1275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class280 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class204.method1356(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }
}
