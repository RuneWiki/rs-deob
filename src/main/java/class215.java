import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class215 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field3986 = -1;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Lvd;")
    public static class222 field3990 = class212.method1357("::", 10731);

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Lvd;")
    private static class222 field3994 = class212.method1357("Loaded input handler", 10731);

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "Lvd;")
    public static class222 field3996 = field3994;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!ug", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class180.field3335 != null) {
            class13.field230 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class228.field4278.length > var2) {
                var3 = class228.field4278[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class114.field2140 >= 0 && var3 >= 0) {
                class36.field788[class114.field2140] = ~var3;
                class114.field2140 = class114.field2140 + 1 & 0x7F;
                if (class129.field2509 == class114.field2140) {
                    class114.field2140 = -1;
                }
            }
        }
        arg0.consume();
        field3993++;
    }

    @OriginalMember(owner = "client!ug", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class180.field3335 != null) {
            int var2 = class197.method1214(arg0, 128);
            if (var2 >= 0) {
                int var3 = class66.field1248 + 1 & 0x7F;
                if (class138.field2673 != var3) {
                    class226.field4239[class66.field1248] = -1;
                    class7.field109[class66.field1248] = var2;
                    class66.field1248 = var3;
                }
            }
        }
        arg0.consume();
        field3988++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIB)V")
    public static final void method1368(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class106.field1958 == 1) {
            class44.field927[class119.field2256 / 100].method163(class138.field2669 - 8, class57.field1070 + -8);
        }
        if (class106.field1958 == 2) {
            class44.field927[class119.field2256 / 100 + 4].method163(class138.field2669 - 8, class57.field1070 + -8);
        }
        field3995++;
        if (arg4 != -90) {
            method1369(true, 22, null);
        }
        class101.method626((byte) -116);
        if (!class209.field3886) {
            return;
        }
        int var5 = arg0 + 20;
        int var6 = arg2 + 512 - 5;
        class91.field1717.method882(class234.method1531(new class222[] { class184.field3414, class56.method414(arg4 ^ 0x2A, class50.field973) }, -10949), var6, var5, 16776960, -1);
        int var7 = 16776960;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        int var10 = var5 + 15;
        if (var9 > 32768 && class122.field2331) {
            var7 = 16711680;
        }
        if (var9 > 65536 && !class122.field2331) {
            var7 = 16711680;
        }
        class91.field1717.method882(class234.method1531(new class222[] { class42.field891, class56.method414(-116, var9), class1.field1 }, arg4 ^ 0x2A9D), var6, var10, var7, -1);
        var5 = var10 + 15;
    }

    @OriginalMember(owner = "client!ug", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class180.field3335 != null) {
            class13.field230 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class228.field4278.length > var2) {
                var3 = class228.field4278[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class114.field2140 >= 0 && var3 >= 0) {
                class36.field788[class114.field2140] = var3;
                class114.field2140 = class114.field2140 + 1 & 0x7F;
                if (class129.field2509 == class114.field2140) {
                    class114.field2140 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class66.field1248 + 1 & 0x7F;
                if (class138.field2673 != var4) {
                    class226.field4239[class66.field1248] = var3;
                    class7.field109[class66.field1248] = -1;
                    class66.field1248 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field3983++;
    }

    @OriginalMember(owner = "client!ug", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3985++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZILvd;)V")
    public static final void method1369(boolean arg0, int arg1, class222 arg2) {
        field3984++;
        class222 var3 = arg2.method1431(0);
        int var4 = 0;
        short[] var5 = new short[16];
        for (int var6 = 0; var6 < class173.field3245; var6++) {
            class204 var9 = class112.method728(var6, (byte) -97);
            if ((!arg0 || var9.field3793) && var9.field3777.method1431(0).method1445(var3, (byte) -38) != -1) {
                if (var4 >= 250) {
                    class14.field393 = -1;
                    class192.field3535 = null;
                    return;
                }
                if (var4 >= var5.length) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var6;
            }
        }
        class14.field393 = var4;
        class31.field651 = 0;
        class192.field3535 = var5;
        if (arg1 != 100) {
            return;
        }
        class222[] var7 = new class222[class14.field393];
        for (int var8 = 0; var8 < class14.field393; var8++) {
            var7[var8] = class112.method728(var5[var8], (byte) 119).field3777;
        }
        class166.method1070(var7, class192.field3535, (byte) -124);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method1370(byte arg0) {
        field3990 = null;
        if (arg0 != -53) {
            field3996 = null;
        }
        field3994 = null;
        field3996 = null;
    }

    @OriginalMember(owner = "client!ug", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class180.field3335 != null) {
            class114.field2140 = -1;
        }
        field3991++;
    }
}
