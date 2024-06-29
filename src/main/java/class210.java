import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class210 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lha;")
    public static class46 field3745 = class271.method1828("Konfig geladen)3", -46);

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Lha;")
    public static class46 field3752 = class74.method542((byte) 96, 160);

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Lha;")
    private static class46 field3758 = class271.method1828(" from your ignore list first)3", -46);

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Lha;")
    public static class46 field3757 = field3758;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "[I")
    public static int[] field3761 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field3759 = 0;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "[I")
    public static int[] field3762 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "[[[B")
    public static byte[][][] field3760;

    @OriginalMember(owner = "client!gf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class48.field830 != null) {
            int var2 = class186.method1351((byte) 5, arg0);
            if (var2 >= 0) {
                int var3 = class227.field3987 + 1 & 0x7F;
                if (class76.field1426 != var3) {
                    class184.field3288[class227.field3987] = -1;
                    class83.field1593[class227.field3987] = var2;
                    class227.field3987 = var3;
                }
            }
        }
        field3753++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBIIII)V")
    public static final void method1478(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field3754++;
        int var8 = arg2 + 1;
        class24.method170((byte) 33, arg0, class6.field100[arg2], arg3, arg5);
        int var9 = arg4 - 1;
        class24.method170((byte) 33, arg0, class6.field100[arg4], arg3, arg5);
        if (arg1 < 20) {
            field3760 = null;
        }
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class6.field100[var6];
            var7[arg0] = var7[arg3] = arg5;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1479(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field3755++;
        int var7 = class15.method77(arg1, class4.field70, class70.field1205, -69);
        int var8 = class15.method77(arg2, class4.field70, class70.field1205, -95);
        int var9 = class15.method77(arg0, class135.field2445, class73.field1309, -65);
        int var10 = class15.method77(arg5, class135.field2445, class73.field1309, -77);
        if (arg3 > -12) {
            method1478(56, (byte) -105, -76, 12, 123, -29);
        }
        int var11 = class15.method77(arg1 + arg6, class4.field70, class70.field1205, -107);
        int var12 = class15.method77(arg2 - arg6, class4.field70, class70.field1205, -87);
        for (int var13 = var7; var13 < var11; var13++) {
            class24.method170((byte) 33, var9, class6.field100[var13], var10, arg4);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class24.method170((byte) 33, var9, class6.field100[var14], var10, arg4);
        }
        int var15 = class15.method77(arg0 + arg6, class135.field2445, class73.field1309, -39);
        int var16 = class15.method77(arg5 - arg6, class135.field2445, class73.field1309, -61);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class6.field100[var17];
            class24.method170((byte) 33, var9, var18, var15, arg4);
            class24.method170((byte) 33, var16, var18, var10, arg4);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)V")
    public static final void method1480(byte arg0, int arg1) {
        field3747++;
        if (arg0 != 115) {
            method1481((byte) -16, 46, 28, -30, -95, (class24) null, -73, -98);
        }
        class150.field2684.method81((byte) 30, arg1);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BIIIILhi;II)V")
    public static final void method1481(byte arg0, int arg1, int arg2, int arg3, int arg4, class24 arg5, int arg6, int arg7) {
        field3751++;
        if (class212.field3771) {
            class24.field351 = 32;
        } else {
            class24.field351 = 0;
        }
        class212.field3771 = false;
        if (class177.field3183 != 0) {
            if (arg4 >= arg7 && arg7 + 16 > arg4 && arg3 >= arg2 && arg3 < (arg2 + 16)) {
                arg5.field412 -= 4;
                class226.method1549(false, arg5);
            } else if (arg4 >= arg7 && (arg7 + 16) > arg4 && arg3 >= arg2 + arg1 - 16 && arg1 + arg2 > arg3) {
                arg5.field412 += 4;
                class226.method1549(false, arg5);
            } else if (arg4 >= (arg7 - class24.field351) && arg7 + class24.field351 + 16 > arg4 && arg3 >= arg2 + 16 && arg1 + arg2 - 16 > arg3) {
                int var8 = (arg1 - 32) * arg1 / arg6;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg1 - var8 - 32;
                int var10 = arg3 - arg2 - (var8 / 2) - 16;
                arg5.field412 = (arg6 - arg1) * var10 / var9;
                class226.method1549(false, arg5);
                class212.field3771 = true;
            }
        }
        if (class114.field2152 != 0) {
            int var11 = arg5.field468;
            if (arg4 >= (arg7 - var11) && arg2 <= arg3 && arg4 < arg7 + 16 && arg3 <= (arg1 + arg2)) {
                arg5.field412 += class114.field2152 * 45;
                class226.method1549(false, arg5);
            }
        }
        if (arg0 != 71) {
            method1479(-69, -109, 83, (byte) -96, -83, 126, 62);
        }
    }

    @OriginalMember(owner = "client!gf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class48.field830 != null) {
            class168.field2965 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class33.field611.length > var2) {
                var3 = class33.field611[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class149.field2674 >= 0 && var3 >= 0) {
                class275.field4798[class149.field2674] = ~var3;
                class149.field2674 = class149.field2674 + 1 & 0x7F;
                if (class149.field2674 == class139.field2490) {
                    class149.field2674 = -1;
                }
            }
        }
        arg0.consume();
        field3749++;
    }

    @OriginalMember(owner = "client!gf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3748++;
    }

    @OriginalMember(owner = "client!gf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class48.field830 != null) {
            class168.field2965 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class33.field611.length > var2) {
                var3 = class33.field611[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class149.field2674 >= 0 && var3 >= 0) {
                class275.field4798[class149.field2674] = var3;
                class149.field2674 = class149.field2674 + 1 & 0x7F;
                if (class149.field2674 == class139.field2490) {
                    class149.field2674 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class227.field3987 + 1 & 0x7F;
                if (class76.field1426 != var4) {
                    class184.field3288[class227.field3987] = var3;
                    class83.field1593[class227.field3987] = -1;
                    class227.field3987 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field3746++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIILj;JZ)V")
    public static final void method1482(int arg0, int arg1, int arg2, int arg3, class139 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class182 var8 = new class182();
        var8.field3269 = arg4;
        var8.field3271 = arg1 * 128 + 64;
        var8.field3277 = arg2 * 128 + 64;
        var8.field3274 = arg3;
        var8.field3272 = arg5;
        if (class111.field2080[arg0][arg1][arg2] == null) {
            class111.field2080[arg0][arg1][arg2] = new class201(arg0, arg1, arg2);
        }
        class111.field2080[arg0][arg1][arg2].field3607 = var8;
    }

    @OriginalMember(owner = "client!gf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3756++;
        if (class48.field830 != null) {
            class149.field2674 = -1;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILpi;Lpi;)V")
    public static final void method1483(int arg0, class181 arg1, class181 arg2) {
        field3750++;
        class37.field663 = class38.method259(0, arg0 - 16711824, class141.field2563, arg1, arg2);
        class126.field2318 = (class256) class37.field663;
        class261.field4547 = class38.method259(0, 106, class202.field3613, arg1, arg2);
        if (arg0 != 16711935) {
            field3757 = null;
        }
        class190.field3384 = class38.method259(0, 109, class147.field2648, arg1, arg2);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method1484(int arg0) {
        field3758 = null;
        field3761 = null;
        field3760 = null;
        field3762 = null;
        field3745 = null;
        if (arg0 != -23908) {
            method1481((byte) 1, -94, 78, -68, 47, (class24) null, 75, 3);
        }
        field3757 = null;
        field3752 = null;
    }
}
