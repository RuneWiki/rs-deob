import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class22 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Lna;")
    public static class26 field309 = class69.method505(" autres options", (byte) -120);

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field310 = 0;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Z")
    public static boolean field307 = true;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Lna;")
    public static class26 field320 = class69.method505("scrollbar", (byte) -127);

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Ln;")
    public static class282 field315 = new class282(260);

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Lna;")
    public static class26 field324 = class69.method505(" <col=00ff80>", (byte) -117);

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Lna;")
    public static class26 field322 = class69.method505("Null", (byte) -126);

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field325 = 0;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Lve;")
    public static class266 field323;

    @OriginalMember(owner = "client!uf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 11)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class320.field5503 != null) {
            class315.field5399 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class193.field3007.length > var2) {
                var3 = class193.field3007[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class283.field4737 >= 0 && var3 >= 0) {
                class203.field3167[class283.field4737] = var3;
                class283.field4737 = class283.field4737 + 1 & 0x7F;
                if (class37.field602 == class283.field4737) {
                    class283.field4737 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class39.field646 + 1 & 0x7F;
                if (class33.field558 != var4) {
                    class271.field4530[class39.field646] = var3;
                    class53.field846[class39.field646] = -1;
                    class39.field646 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field317++;
    }

    @OriginalMember(owner = "client!uf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 77)
    public final void keyTyped(KeyEvent arg0) {
        field314++;
        if (class320.field5503 != null) {
            int var2 = class232.method1560(true, arg0);
            if (var2 >= 0) {
                int var3 = class39.field646 + 1 & 0x7F;
                if (class33.field558 != var3) {
                    class271.field4530[class39.field646] = -1;
                    class53.field846[class39.field646] = var2;
                    class39.field646 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!uf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 138)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class320.field5503 != null) {
            class283.field4737 = -1;
        }
        field316++;
    }

    @OriginalMember(owner = "client!uf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 154)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field312++;
        if (class320.field5503 != null) {
            class315.field5399 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class193.field3007.length > var2) {
                var3 = class193.field3007[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class283.field4737 >= 0 && var3 >= 0) {
                class203.field3167[class283.field4737] = ~var3;
                class283.field4737 = class283.field4737 + 1 & 0x7F;
                if (class37.field602 == class283.field4737) {
                    class283.field4737 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!uf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 185)
    public final void focusGained(FocusEvent arg0) {
        field306++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 206)
    public static void method141(int arg0) {
        field315 = null;
        field323 = null;
        if (arg0 > 81) {
            field322 = null;
            field320 = null;
            field324 = null;
            field309 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 225)
    public static final void method142(byte arg0) {
        if (arg0 < 62) {
            return;
        }
        field319++;
        int var1 = class113.field1781 + class13.field221.field3962;
        int var2 = class13.field221.field3972 + class61.field988;
        if ((class72.field1113 - var1) < -500 || (class72.field1113 - var1) > 500 || (class212.field3277 - var2) < -500 || (class212.field3277 - var2) > 500) {
            class72.field1113 = var1;
            class212.field3277 = var2;
        }
        if (class212.field3277 != var2) {
            class212.field3277 += (var2 - class212.field3277) / 16;
        }
        if (class72.field1113 != var1) {
            class72.field1113 += (var1 - class72.field1113) / 16;
        }
        if (class316.field5411) {
            for (int var3 = 0; var3 < class323.field5556; var3++) {
                int var4 = class37.field616[var3];
                if (var4 == 98) {
                    class224.field3534 = class224.field3534 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class224.field3534 = class224.field3534 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class300.field5156 = class300.field5156 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class300.field5156 = class300.field5156 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class78.field1183[98]) {
                class322.field5535 += (12 - class322.field5535) / 2;
            } else if (class78.field1183[99]) {
                class322.field5535 += (-class322.field5535 - 12) / 2;
            } else {
                class322.field5535 /= 2;
            }
            if (class78.field1183[96]) {
                class265.field4359 += (-class265.field4359 - 24) / 2;
            } else if (class78.field1183[97]) {
                class265.field4359 += (24 - class265.field4359) / 2;
            } else {
                class265.field4359 /= 2;
            }
            class224.field3534 += class322.field5535 / 2;
            class300.field5156 += class265.field4359 / 2;
        }
        class5.method34((byte) -94);
    }
}
