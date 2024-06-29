import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class101 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Lke;")
    private static class65 field2627 = class1.method17(" is already on your friend list", -114);

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lke;")
    public static class65 field2620 = class1.method17("Nehmen", -114);

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Z")
    public static boolean field2625 = false;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "Lke;")
    public static class65 field2631 = class1.method17("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", -124);

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "Lke;")
    public static class65 field2633 = field2627;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "[I")
    public static int[] field2630 = new int[99];

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "Lke;")
    public static class65 field2634;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "Lke;")
    private static class65 field2637;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "Lke;")
    public static class65 field2641;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "Z")
    public static boolean field2632;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "[Lkb;")
    public static class61[] field2638;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2630[var1] = var0 / 4;
        }
        field2635 = 0;
        field2634 = null;
        field2639 = 0;
        field2640 = 0;
        field2637 = class1.method17("Continue", -125);
        field2641 = field2637;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 14)
    public static void method840(int arg0) {
        field2620 = null;
        field2641 = null;
        field2630 = null;
        if (arg0 != 0) {
            return;
        }
        field2634 = null;
        field2631 = null;
        field2637 = null;
        field2627 = null;
        field2633 = null;
        field2638 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lke;ILke;I)V", line = 43)
    public static final void method841(class65 arg0, int arg1, class65 arg2, int arg3) {
        if (class117.field2939 == -1) {
            class39.field996 = true;
        }
        field2619++;
        if (arg1 == 0 && class51.field1312 != -1) {
            class46.field1215 = 0;
            class73.field1933 = arg0;
        }
        if (arg3 != 10751) {
            return;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class47.field1229[var4] = class47.field1229[var4 - 1];
            class48.field1256[var4] = class48.field1256[var4 - 1];
            class78.field2084[var4] = class78.field2084[var4 - 1];
        }
        class47.field1229[0] = arg1;
        class48.field1256[0] = arg2;
        class78.field2084[0] = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIBIIII)I", line = 82)
    public static final int method842(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 & 0x3;
        field2624++;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg4;
            arg4 = var8;
        }
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return 1 + 7 - arg6 - arg3;
        } else if (arg2 == 13) {
            return var7 == 2 ? 7 + 1 - arg5 - arg4 : arg3;
        } else {
            return -107;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 137)
    public static final void method843(byte arg0) {
        field2626++;
        if (arg0 != 10) {
            method841(null, 114, null, 24);
        }
        if (class93.field2464 == null) {
            return;
        }
        class125.method986(127);
        if (class12.field246 > 0) {
            class93.field2464.method88(256, (byte) -61);
            class12.field246 = 0;
        }
        class93.field2464.method85((byte) 75);
        class93.field2464 = null;
    }

    @OriginalMember(owner = "client!qe", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 181)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class52.field1327 != null) {
            class80.field2129 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class87.field2322.length) {
                var3 = class87.field2322[var2];
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
                var4 = class3.method24(arg0, 112);
            }
            if (class17.field359 >= 0 && var3 >= 0) {
                class35.field888[class17.field359] = var3;
                class17.field359 = class17.field359 + 1 & 0x7F;
                if (class17.field359 == class10.field203) {
                    class17.field359 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class123.field2996 + 1 & 0x7F;
                if (class83.field2177 != var5) {
                    class78.field2093[class123.field2996] = var3;
                    class5.field100[class123.field2996] = var4;
                    class123.field2996 = var5;
                }
            }
        }
        field2629++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!qe", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 242)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2618++;
        if (class52.field1327 != null) {
            class80.field2129 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class87.field2322.length) {
                var3 = class87.field2322[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class17.field359 >= 0 && var3 >= 0) {
                class35.field888[class17.field359] = ~var3;
                class17.field359 = class17.field359 + 1 & 0x7F;
                if (class17.field359 == class10.field203) {
                    class17.field359 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!qe", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 273)
    public final synchronized void focusLost(FocusEvent arg0) {
        field2623++;
        if (class52.field1327 != null) {
            class17.field359 = -1;
        }
    }

    @OriginalMember(owner = "client!qe", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 292)
    public final void focusGained(FocusEvent arg0) {
        field2628++;
    }

    @OriginalMember(owner = "client!qe", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 308)
    public final void keyTyped(KeyEvent arg0) {
        field2617++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Luc;I)V", line = 317)
    public static final void method844(class119 arg0, int arg1) {
        field2621++;
        for (int var2 = 0; var2 < class74.field1980.length; var2++) {
            class74.field1980[var2] = 0;
        }
        short var3 = 256;
        if (arg1 >= -112) {
            return;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class74.field1980[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class35.field886[var15] = (class74.field1980[var15 - 1] + class74.field1980[var15 + 1] + class74.field1980[var15 + -128] + class74.field1980[var15 + 128]) / 4;
                }
            }
            int[] var13 = class74.field1980;
            class74.field1980 = class35.field886;
            class35.field886 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field2949; var7++) {
            for (int var8 = 0; var8 < arg0.field2954; var8++) {
                if (arg0.field2947[var6++] != 0) {
                    int var9 = arg0.field2953 + var7 + 16;
                    int var10 = arg0.field2948 + var8 + 16;
                    int var11 = (var9 << 7) + var10;
                    class74.field1980[var11] = 0;
                }
            }
        }
    }
}
