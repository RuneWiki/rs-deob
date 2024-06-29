import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class97 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field2169 = 0;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field2171 = 0;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field2164 = 0;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Z")
    public static boolean field2168 = false;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lva;")
    private static class121 field2174 = class107.method797("Your profile will be transferred in:", -10983);

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Lva;")
    public static class121 field2176 = field2174;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lnd;")
    public static class82 field2162 = new class82();

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "Lva;")
    private static class121 field2182 = class107.method797(" has logged out)3", -10983);

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "Lva;")
    private static class121 field2184 = class107.method797("scroll:", -10983);

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "Lva;")
    public static class121 field2186 = field2184;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "Lva;")
    public static class121 field2187 = class107.method797(" @whi@(X", -10983);

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "Lva;")
    public static class121 field2191 = class107.method797("::clientdrop", -10983);

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "Lva;")
    private static class121 field2183 = class107.method797("System update in: ", -10983);

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "Z")
    public static boolean field2180 = false;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "[I")
    public static int[] field2190 = new int[128];

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field2179 = 0;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "Lva;")
    public static class121 field2185 = field2183;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "Z")
    public static boolean field2189 = false;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "Lva;")
    private static class121 field2181 = class107.method797("Please try again)3", -10983);

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "Lva;")
    public static class121 field2192 = field2182;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "Lva;")
    public static class121 field2188 = field2181;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "[I")
    public static int[] field2166;

    @OriginalMember(owner = "client!qb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 32)
    public final void keyTyped(KeyEvent arg0) {
        field2178++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!qb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 63)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class69.field1628 != null) {
            class61.field1452 = -1;
        }
        field2172++;
    }

    @OriginalMember(owner = "client!qb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 84)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2177++;
        if (class69.field1628 != null) {
            class115.field2612 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class1.field4.length) {
                var3 = class1.field4[var2];
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
                var4 = class113.method818((byte) 120, arg0);
            }
            if (class61.field1452 >= 0 && var3 >= 0) {
                class41.field946[class61.field1452] = var3;
                class61.field1452 = class61.field1452 + 1 & 0x7F;
                if (class61.field1452 == class45.field1041) {
                    class61.field1452 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class42.field977 + 1 & 0x7F;
                if (class116.field2646 != var5) {
                    class35.field837[class42.field977] = var3;
                    field2190[class42.field977] = var4;
                    class42.field977 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 145)
    public static void method657(int arg0) {
        field2192 = null;
        if (arg0 < 82) {
            field2162 = null;
        }
        field2176 = null;
        field2182 = null;
        field2183 = null;
        field2190 = null;
        field2166 = null;
        field2187 = null;
        field2181 = null;
        field2188 = null;
        field2184 = null;
        field2174 = null;
        field2186 = null;
        field2191 = null;
        field2185 = null;
        field2162 = null;
    }

    @OriginalMember(owner = "client!qb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 207)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2173++;
        if (class69.field1628 != null) {
            class115.field2612 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class1.field4.length) {
                var3 = class1.field4[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class61.field1452 >= 0 && var3 >= 0) {
                class41.field946[class61.field1452] = ~var3;
                class61.field1452 = class61.field1452 + 1 & 0x7F;
                if (class61.field1452 == class45.field1041) {
                    class61.field1452 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 250)
    public static final void method658(byte arg0) {
        field2175++;
        class127.method990(127);
        class20.method177(1000);
        class76.method527(true);
        class75.method522((byte) -106);
        class37.method258(-118);
        class84.method590(60);
        class45.method301(26551);
        class78.method541(-571);
        class41.method269(-32536);
        class129.method1006(126);
        class80.method551((byte) 88);
        class119.method925((byte) -84);
        ((class8) class83.field1935).method48(-27241);
        class60.field1435.method327(11);
        class12.field199.method327(-94);
        class43.field990.method327(-55);
        class125.field2844.method327(121);
        class69.field1665.method327(-35);
        class128.field2956.method327(108);
        if (arg0 <= 78) {
            return;
        }
        class126.field2882.method327(126);
        class75.field1721.method327(110);
        class25.field644.method327(122);
        class128.field2936.method327(16);
        class119.field2756.method327(-27);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIII)V", line = 294)
    public static final void method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2170++;
        if (!class38.field879) {
            arg0 = 0;
        }
        if (class60.field1448 == arg2 && class100.field2221 == arg4 && class76.field1743 == arg0) {
            return;
        }
        class100.field2221 = arg4;
        class60.field1448 = arg2;
        class76.field1743 = arg0;
        class60.method437((byte) 67, 25);
        class71.method491(false, null, 1932, class115.field2616);
        int var6 = class9.field132;
        class9.field132 = arg4 * 8 - 48;
        int var7 = class129.field2977;
        int var8 = class9.field132 - var6;
        int var9 = class9.field132;
        class129.field2977 = (arg2 - 6) * 8;
        int var10 = class129.field2977 - var7;
        int var11 = class129.field2977;
        for (int var12 = 0; var12 < 16384; var12++) {
            class50 var28 = class8.field110[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field767[var29] -= var10;
                    var28.field730[var29] -= var8;
                }
                var28.field750 -= var10 * 128;
                var28.field742 -= var8 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class77 var26 = class127.field2895[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field767[var27] -= var10;
                    var26.field730[var27] -= var8;
                }
                var26.field750 -= var10 * 128;
                var26.field742 -= var8 * 128;
            }
        }
        class121.field2807 = arg0;
        byte var14 = 0;
        byte var15 = 104;
        class62.field1494.method233(arg5, false, false, arg3);
        byte var16 = 1;
        byte var17 = 0;
        if (arg1 > var10) {
            var15 = -1;
            var14 = 103;
            var16 = -1;
        }
        byte var18 = 104;
        byte var19 = 1;
        if (var8 < 0) {
            var17 = 103;
            var18 = -1;
            var19 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var22 = var17; var22 != var18; var22 += var19) {
                int var23 = var10 + var20;
                int var24 = var8 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class14.field249[var25][var20][var22] = class14.field249[var25][var23][var24];
                    } else {
                        class14.field249[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class25 var21 = (class25) class67.field1607.method57((byte) 86); var21 != null; var21 = (class25) class67.field1607.method66(-29860)) {
            var21.field627 -= var10;
            var21.field633 -= var8;
            if (var21.field627 < 0 || var21.field633 < 0 || var21.field627 >= 104 || var21.field633 >= 104) {
                var21.method187((byte) 39);
            }
        }
        class21.field550 = -1;
        class116.field2632 = false;
        if (class43.field988 != 0) {
            class60.field1444 -= var8;
            class43.field988 -= var10;
        }
        class15.field297.method67(2);
        class108.field2461.method67(2);
    }

    @OriginalMember(owner = "client!qb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 489)
    public final void focusGained(FocusEvent arg0) {
        field2163++;
    }
}
