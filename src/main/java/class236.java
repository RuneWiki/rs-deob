import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class236 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Z")
    public static boolean field3586 = false;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Llc;")
    public static class86 field3594 = new class86(2);

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field3596 = 0;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field3595 = -1;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!wc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class287.field4533 != null) {
            class266.field4000 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class135.field1895.length) {
                var3 = class135.field1895[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class237.field3604 >= 0 && var3 >= 0) {
                class111.field1618[class237.field3604] = ~var3;
                class237.field3604 = class237.field3604 + 1 & 0x7F;
                if (class4.field19 == class237.field3604) {
                    class237.field3604 = -1;
                }
            }
        }
        field3589++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static void method1582(byte arg0) {
        field3594 = null;
        if (arg0 < 3) {
            method1585(-93, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lse;I)V")
    public static final void method1583(class211 arg0, int arg1) {
        if (arg1 == 0) {
            field3587++;
            if (class136.field1907 == arg0.field3116) {
                class42.field640[arg0.field3061] = true;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class287.field4533 != null) {
            class266.field4000 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class135.field1895.length > var2) {
                var3 = class135.field1895[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class237.field3604 >= 0 && var3 >= 0) {
                class111.field1618[class237.field3604] = var3;
                class237.field3604 = class237.field3604 + 1 & 0x7F;
                if (class4.field19 == class237.field3604) {
                    class237.field3604 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class184.field2557 + 1 & 0x7F;
                if (class169.field2349 != var4) {
                    class265.field3972[class184.field2557] = var3;
                    class207.field2894[class184.field2557] = '\u0000';
                    class184.field2557 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field3598++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
    public static final void method1584(int arg0, int arg1) {
        if (arg1 != 1) {
            method1587(113, (byte) 12, 96, -61, 75, true, -57, -11, -79, -91);
        }
        field3597++;
        if (class178.field2489 == null || arg0 > class178.field2489.length) {
            class178.field2489 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[B)V")
    public static final void method1585(int arg0, byte[] arg1) {
        class224 var2 = new class224(arg1);
        var2.field3402 = arg1.length - 2;
        class175.field2465 = var2.method1445(false);
        class140.field1956 = new byte[class175.field2465][];
        field3590++;
        class284.field4429 = new boolean[class175.field2465];
        class273.field4208 = new int[class175.field2465];
        class154.field2142 = new byte[class175.field2465][];
        class50.field729 = new int[class175.field2465];
        class39.field576 = new int[class175.field2465];
        class198.field2749 = new int[class175.field2465];
        var2.field3402 = arg1.length - (class175.field2465 * 8) - 7;
        class21.field296 = var2.method1445(false);
        class287.field4535 = var2.method1445(false);
        int var3 = (var2.method1453((byte) -127) & 0xFF) + 1;
        for (int var4 = 0; var4 < class175.field2465; var4++) {
            class273.field4208[var4] = var2.method1445(false);
        }
        if (arg0 != -17859) {
            return;
        }
        for (int var5 = 0; var5 < class175.field2465; var5++) {
            class198.field2749[var5] = var2.method1445(false);
        }
        for (int var6 = 0; var6 < class175.field2465; var6++) {
            class50.field729[var6] = var2.method1445(false);
        }
        for (int var7 = 0; var7 < class175.field2465; var7++) {
            class39.field576[var7] = var2.method1445(false);
        }
        var2.field3402 = arg1.length - class175.field2465 * 8 - ((var3 + -1) * 3) - 7;
        class9.field79 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class9.field79[var8] = var2.method1454(85);
            if (class9.field79[var8] == 0) {
                class9.field79[var8] = 1;
            }
        }
        var2.field3402 = 0;
        for (int var9 = 0; var9 < class175.field2465; var9++) {
            int var10 = class50.field729[var9];
            int var11 = class39.field576[var9];
            int var12 = var10 * var11;
            boolean var13 = false;
            byte[] var14 = new byte[var12];
            byte[] var15 = new byte[var12];
            class140.field1956[var9] = var14;
            class154.field2142[var9] = var15;
            int var16 = var2.method1453((byte) -128);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var14[var22] = var2.method1437((byte) -107);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var15[var23] = var2.method1437((byte) -80);
                        var13 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label92: while (true) {
                    if (var17 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var18 = 0;
                        while (true) {
                            if (var10 <= var18) {
                                break label92;
                            }
                            for (int var19 = 0; var19 < var11; var19++) {
                                byte var20 = var15[var10 * var19 + var18] = var2.method1437((byte) -104);
                                var13 |= var20 != -1;
                            }
                            var18++;
                        }
                    }
                    for (int var21 = 0; var21 < var11; var21++) {
                        var14[var10 * var21 + var17] = var2.method1437((byte) -119);
                    }
                    var17++;
                }
            }
            class284.field4429[var9] = var13;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
    public static final void method1586(byte arg0) {
        if (arg0 != -88) {
            return;
        }
        field3592++;
        if (class253.field3871 == 0) {
            return;
        }
        try {
            if ((++class66.field896) > 2000) {
                if (class290.field4567 != null) {
                    class290.field4567.method1958(5000);
                    class290.field4567 = null;
                }
                if (class227.field3441 >= 1) {
                    class253.field3871 = 0;
                    class35.field540 = -5;
                    return;
                }
                if (class56.field810 == class285.field4466) {
                    class56.field810 = class198.field2766;
                } else {
                    class56.field810 = class285.field4466;
                }
                class66.field896 = 0;
                class227.field3441++;
                class253.field3871 = 1;
            }
            if (class253.field3871 == 1) {
                class32.field498 = class200.field2784.method1637(class56.field810, false, class19.field273);
                class253.field3871 = 2;
            }
            if (class253.field3871 == 2) {
                if (class32.field498.field1663 == 2) {
                    throw new IOException();
                }
                if (class32.field498.field1663 != 1) {
                    return;
                }
                class290.field4567 = new class293((Socket) class32.field498.field1665, class200.field2784);
                class32.field498 = null;
                class290.field4567.method1967(class281.field4359.field3336, 0, class281.field4359.field3402, 0);
                if (class139.field1933 != null) {
                    class139.field1933.method857((byte) -36);
                }
                if (class234.field3537 != null) {
                    class234.field3537.method857((byte) -36);
                }
                int var1 = class290.field4567.method1959(-117);
                if (class139.field1933 != null) {
                    class139.field1933.method857((byte) -36);
                }
                if (class234.field3537 != null) {
                    class234.field3537.method857((byte) -36);
                }
                if (var1 != 21) {
                    class35.field540 = var1;
                    class253.field3871 = 0;
                    class290.field4567.method1958(5000);
                    class290.field4567 = null;
                    return;
                }
                class253.field3871 = 3;
            }
            if (class253.field3871 == 3) {
                if (class290.field4567.method1960(-1) < 1) {
                    return;
                }
                class83.field1138 = new String[class290.field4567.method1959(-106)];
                class253.field3871 = 4;
            }
            if (class253.field3871 == 4 && class290.field4567.method1960(-1) >= class83.field1138.length * 8) {
                class233.field3518.field3402 = 0;
                class290.field4567.method1963(class83.field1138.length * 8, class233.field3518.field3336, 0, false);
                for (int var2 = 0; var2 < class83.field1138.length; var2++) {
                    class83.field1138[var2] = class197.method1258(class233.field3518.method1491(-21241), (byte) -62);
                }
                class35.field540 = 21;
                class253.field3871 = 0;
                class290.field4567.method1958(5000);
                class290.field4567 = null;
            }
        } catch (IOException var3) {
            if (class290.field4567 != null) {
                class290.field4567.method1958(5000);
                class290.field4567 = null;
            }
            if (class227.field3441 < 1) {
                class66.field896 = 0;
                if (class56.field810 == class285.field4466) {
                    class56.field810 = class198.field2766;
                } else {
                    class56.field810 = class285.field4466;
                }
                class253.field3871 = 1;
                class227.field3441++;
            } else {
                class253.field3871 = 0;
                class35.field540 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field3585++;
        if (class287.field4533 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class44.method293(false, var2)) {
                int var3 = class184.field2557 + 1 & 0x7F;
                if (class169.field2349 != var3) {
                    class265.field3972[class184.field2557] = -1;
                    class207.field2894[class184.field2557] = var2;
                    class184.field2557 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!wc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3591++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBIIIZIIII)V")
    public static final void method1587(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = arg3 - arg2;
        field3593++;
        if (arg1 != 56) {
            method1587(-12, (byte) 21, -94, 61, -89, true, 11, 8, 27, -112);
        }
        int var11 = arg0 - arg6;
        int var12 = (arg8 - arg4 << 16) / var10;
        int var13 = (arg9 - arg7 << 16) / var11;
        class296.method1980(0, arg3, var13, arg6, 0, arg5, arg4, arg0, arg7, var12, -114, arg2);
    }

    @OriginalMember(owner = "client!wc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class287.field4533 != null) {
            class237.field3604 = -1;
        }
        field3588++;
    }
}
