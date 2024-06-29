import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class252 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "[B")
    public static byte[] field4429 = new byte[520];

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Z")
    public static boolean field4431 = false;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Ltg;")
    public static class215 field4427 = new class215(4096);

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field4434 = 0;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "Lqc;")
    public static class245 field4433 = new class245(50);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Llh;")
    public static class249 field4432;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static final void method1698(int arg0) {
        class249.field4395 = null;
        class192.field3326 = null;
        class133.field2483 = null;
        class242.field4241 = null;
        class24.field307 = null;
        class47.field848 = null;
        class34.field514 = null;
        class193.field3350 = null;
        class250.field4413 = null;
        field4430++;
        class165.field2971 = null;
        if (arg0 < 27) {
            method1699(-93);
        }
        class187.field3232 = null;
    }

    @OriginalMember(owner = "client!vf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4424++;
    }

    @OriginalMember(owner = "client!vf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field4426++;
        if (class218.field3747 == null) {
            return;
        }
        class9.field104 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class12.field154.length > var2) {
            var3 = class12.field154[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class9.field90 >= 0 && var3 >= 0) {
            class62.field1048[class9.field90] = var3;
            class9.field90 = class9.field90 + 1 & 0x7F;
            if (class9.field90 == class139.field2582) {
                class9.field90 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class1.field12 + 1 & 0x7F;
            if (class73.field1447 != var4) {
                class15.field184[class1.field12] = var3;
                class160.field2867[class1.field12] = -1;
                class1.field12 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public static void method1699(int arg0) {
        field4429 = null;
        field4433 = null;
        field4427 = null;
        if (arg0 == 24205) {
            field4432 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class218.field3747 != null) {
            class9.field104 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class12.field154.length > var2) {
                var3 = class12.field154[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class9.field90 >= 0 && var3 >= 0) {
                class62.field1048[class9.field90] = ~var3;
                class9.field90 = class9.field90 + 1 & 0x7F;
                if (class9.field90 == class139.field2582) {
                    class9.field90 = -1;
                }
            }
        }
        arg0.consume();
        field4423++;
    }

    @OriginalMember(owner = "client!vf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class218.field3747 != null) {
            class9.field90 = -1;
        }
        field4425++;
    }

    @OriginalMember(owner = "client!vf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field4428++;
        if (class218.field3747 != null) {
            int var2 = class102.method705(true, arg0);
            if (var2 >= 0) {
                int var3 = class1.field12 + 1 & 0x7F;
                if (class73.field1447 != var3) {
                    class15.field184[class1.field12] = -1;
                    class160.field2867[class1.field12] = var2;
                    class1.field12 = var3;
                }
            }
        }
        arg0.consume();
    }
}
