import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class118 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Ljd;")
    public static class86 field2308 = class122.method868("Ablegen", true);

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Ljd;")
    public static class86 field2322 = class122.method868(")1", true);

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "[I")
    public static int[] field2320 = new int[256];

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Z")
    public static boolean field2321 = false;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Ljd;")
    public static class86 field2323 = class122.method868("Lade Konfiguration )2 ", true);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Lgb;")
    public static class144 field2313;

    @OriginalMember(owner = "client!fc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class108.field2079 != null) {
            int var2 = method846(arg0, -29855);
            if (var2 >= 0) {
                int var3 = class27.field614 + 1 & 0x7F;
                if (class30.field643 != var3) {
                    class90.field1843[class27.field614] = -1;
                    class66.field1298[class27.field614] = var2;
                    class27.field614 = var3;
                }
            }
        }
        field2310++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIB)V")
    public static final void method842(int arg0, int arg1, byte arg2) {
        if (arg2 != -98) {
            method842(113, 29, (byte) -80);
        }
        field2318++;
        class127.field2460++;
        class36.field809.method1356(33, true);
        class36.field809.method1428((byte) 69, arg0);
        class36.field809.method1380(arg1, -2097152);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method843(int arg0) {
        field2313 = null;
        field2320 = null;
        field2323 = null;
        field2322 = null;
        field2308 = null;
        if (arg0 >= -105) {
            method842(-49, 29, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V")
    public static final void method844(int arg0, int arg1, int arg2) {
        field2319++;
        int var3 = arg0;
        if (arg0 > 25) {
            var3 = 25;
        }
        arg0--;
        int var4 = class111.field2124[arg0];
        int var5 = class164.field3068[arg0];
        if (~arg2 == arg1) {
            class36.field809.method1356(22, true);
            class36.field809.method1388(arg1 - 33, var3 + var3 - -3);
            class86.field1709++;
        }
        if (arg2 == 1) {
            class36.field809.method1356(221, true);
            class213.field3849++;
            class36.field809.method1388(-86, var3 + var3 + 3 + 14);
        }
        if (arg2 == 2) {
            class36.field809.method1356(209, true);
            class36.field809.method1388(arg1 ^ 0x7A, var3 + var3 + 3);
            class193.field3447++;
        }
        class36.field809.method1420((byte) 120, class79.field1554 + var5);
        class36.field809.method1388(-103, class9.field295[82] ? 1 : 0);
        class36.field809.method1428((byte) -22, class252.field4481 + var4);
        class133.field2514 = class111.field2124[0];
        class193.field3459 = class164.field3068[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class36.field809.method1390((byte) 83, class111.field2124[arg0] - var4);
            class36.field809.method1426((byte) -125, class164.field3068[arg0] - var5);
        }
    }

    @OriginalMember(owner = "client!fc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2309++;
        if (class108.field2079 != null) {
            class6.field97 = -1;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lwj;I)Z")
    public static final boolean method845(class6 arg0, int arg1) {
        field2311++;
        if (arg0.field227 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field227.length; var2++) {
            int var3 = class62.method442(var2, (byte) 98, arg0);
            int var4 = arg0.field161[var2];
            if (arg0.field227[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field227[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field227[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg1 != -1) {
            field2320 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    private static final int method846(KeyEvent arg0, int arg1) {
        if (arg1 != -29855) {
            field2323 = null;
        }
        int var2 = arg0.getKeyChar();
        field2316++;
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class108.field2079 != null) {
            class260.field4657 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class178.field3220.length > var2) {
                var3 = class178.field3220[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class6.field97 >= 0 && var3 >= 0) {
                class158.field2974[class6.field97] = ~var3;
                class6.field97 = class6.field97 + 1 & 0x7F;
                if (class9.field274 == class6.field97) {
                    class6.field97 = -1;
                }
            }
        }
        arg0.consume();
        field2312++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method847(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2315++;
        class157.method1143(21520, arg5);
        int var7 = 0;
        int var8 = arg5 - arg6;
        int var9 = arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int var15 = arg2 - var8;
        int[] var16 = class249.field4420[arg4];
        int var17 = arg2 + var8;
        class56.method412(arg0, (byte) -125, var15, var16, arg2 - arg5);
        class56.method412(arg1, (byte) -99, var17, var16, var15);
        if (arg3 >= -119) {
            field2321 = false;
        }
        class56.method412(arg0, (byte) -100, arg2 + arg5, var16, var17);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var13;
            var10 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class267.field4707[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class249.field4420[arg4 + var9];
                    int var19 = class267.field4707[var9];
                    int[] var20 = class249.field4420[arg4 - var9];
                    int var21 = arg2 + var7;
                    int var22 = arg2 - var7;
                    int var23 = arg2 + var19;
                    int var24 = arg2 - var19;
                    class56.method412(arg0, (byte) -113, var24, var18, var22);
                    class56.method412(arg1, (byte) -99, var23, var18, var24);
                    class56.method412(arg0, (byte) -111, var21, var18, var23);
                    class56.method412(arg0, (byte) -99, var24, var20, var22);
                    class56.method412(arg1, (byte) -96, var23, var20, var24);
                    class56.method412(arg0, (byte) -103, var21, var20, var23);
                } else {
                    int[] var25 = class249.field4420[arg4 - var9];
                    int[] var26 = class249.field4420[arg4 + var9];
                    int var27 = arg2 + var7;
                    int var28 = arg2 - var7;
                    class56.method412(arg0, (byte) -123, var27, var26, var28);
                    class56.method412(arg0, (byte) -113, var27, var25, var28);
                }
            }
            int[] var29 = class249.field4420[arg4 + var7];
            int[] var30 = class249.field4420[arg4 - var7];
            int var31 = arg2 + var9;
            int var32 = arg2 - var9;
            if (var7 >= var8) {
                class56.method412(arg0, (byte) -123, var31, var29, var32);
                class56.method412(arg0, (byte) -95, var31, var30, var32);
            } else {
                int var33 = var7 > var11 ? class267.field4707[var7] : var11;
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class56.method412(arg0, (byte) -113, var35, var29, var32);
                class56.method412(arg1, (byte) -93, var34, var29, var35);
                class56.method412(arg0, (byte) -123, var31, var29, var34);
                class56.method412(arg0, (byte) -105, var35, var30, var32);
                class56.method412(arg1, (byte) -119, var34, var30, var35);
                class56.method412(arg0, (byte) -111, var31, var30, var34);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2314++;
        if (class108.field2079 == null) {
            return;
        }
        class260.field4657 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class178.field3220.length) {
            var3 = class178.field3220[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class6.field97 >= 0 && var3 >= 0) {
            class158.field2974[class6.field97] = var3;
            class6.field97 = class6.field97 + 1 & 0x7F;
            if (class9.field274 == class6.field97) {
                class6.field97 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class27.field614 + 1 & 0x7F;
            if (class30.field643 != var4) {
                class90.field1843[class27.field614] = var3;
                class66.field1298[class27.field614] = -1;
                class27.field614 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2317++;
    }
}
