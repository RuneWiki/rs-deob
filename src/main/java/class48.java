import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class48 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lee;")
    public static class49 field1033;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Lae;")
    public static class6 field1036;

    @OriginalMember(owner = "client!ed", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class98.field1828 != null) {
            class239.field4399 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class39.field830.length) {
                var3 = class39.field830[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class95.field1785 >= 0 && var3 >= 0) {
                class205.field3837[class95.field1785] = var3;
                class95.field1785 = class95.field1785 + 1 & 0x7F;
                if (class95.field1785 == class157.field2852) {
                    class95.field1785 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class81.field1555 + 1 & 0x7F;
                if (class6.field137 != var4) {
                    class62.field1315[class81.field1555] = var3;
                    class162.field2929[class81.field1555] = -1;
                    class81.field1555 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field1032++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
    public static final void method319(int arg0, int arg1) {
        if (arg1 <= 118) {
            method320(7);
        }
        field1035++;
        if (class107.field2000 == 0) {
            class237.field4378.method668(arg0, (byte) 113);
        } else {
            class237.field4361 = arg0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class98.field1828 != null) {
            int var2 = class88.method585(-24794, arg0);
            if (var2 >= 0) {
                int var3 = class81.field1555 + 1 & 0x7F;
                if (class6.field137 != var3) {
                    class62.field1315[class81.field1555] = -1;
                    class162.field2929[class81.field1555] = var2;
                    class81.field1555 = var3;
                }
            }
        }
        field1030++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method320(int arg0) {
        if (arg0 != 0) {
            field1036 = null;
        }
        field1036 = null;
        field1033 = null;
    }

    @OriginalMember(owner = "client!ed", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1034++;
        if (class98.field1828 != null) {
            class95.field1785 = -1;
        }
    }

    @OriginalMember(owner = "client!ed", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1037++;
        if (class98.field1828 != null) {
            class239.field4399 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class39.field830.length) {
                var3 = class39.field830[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class95.field1785 >= 0 && var3 >= 0) {
                class205.field3837[class95.field1785] = ~var3;
                class95.field1785 = class95.field1785 + 1 & 0x7F;
                if (class95.field1785 == class157.field2852) {
                    class95.field1785 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ed", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1031++;
    }
}
