import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "Lea;")
    public static class10 field4 = class3.method8("Vegetable Store", 111);

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "Lea;")
    public static class10 field3 = class3.method8("Farming shop", -88);

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "Lea;")
    public static class10 field6 = class3.method8("Crafting Shop", 99);

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "I")
    public static int field5 = -1;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "Lba;")
    public static class4 field2;

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "[[Lr;")
    public static class33[][] field7;

    @OriginalMember(owner = "mapview!a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 10)
    public final void keyTyped(KeyEvent arg0) {
        if (class8.field61 != null) {
            int var2 = class25.method196((byte) 105, arg0);
            if (var2 >= 0) {
                int var3 = class13.field147 + 1 & 0x7F;
                if (class16.field181 != var3) {
                    class18.field191[class13.field147] = -1;
                    class18.field193[class13.field147] = var2;
                    class13.field147 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 49)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(B)V", line = 76)
    public static void method1(byte arg0) {
        field6 = null;
        field3 = null;
        field4 = null;
        field2 = null;
        field7 = null;
        if (arg0 != -77) {
            field6 = null;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 99)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class8.field61 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && mapview.field302.length > var2) {
                var3 = mapview.field302[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (mapview.field371 >= 0 && var3 >= 0) {
                class35.field482[mapview.field371] = ~var3;
                mapview.field371 = mapview.field371 + 1 & 0x7F;
                if (mapview.field371 == class19.field203) {
                    mapview.field371 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(ILs;ILs;Z)Lt;", line = 143)
    public static final class37 method2(int arg0, class35 arg1, int arg2, class35 arg3, boolean arg4) {
        if (class19.method133(arg2, arg0, arg3, (byte) 20)) {
            return arg4 ? class4.method13(90, arg1.method237(-31985, arg2, arg0)) : (class37) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(BILjava/awt/Component;I)Li;", line = 161)
    public static final class16 method3(byte arg0, int arg1, Component arg2, int arg3) {
        try {
            Class var4 = Class.forName("v");
            if (arg0 == 10) {
                class16 var5 = (class16) var4.getDeclaredConstructor().newInstance();
                var5.method99(true, arg2, arg3, arg1);
                return var5;
            } else {
                return (class16) null;
            }
        } catch (Throwable var8) {
            class14 var7 = new class14();
            var7.method99(true, arg2, arg3, arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 209)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class8.field61 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && mapview.field302.length > var2) {
            var3 = mapview.field302[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (mapview.field371 >= 0 && var3 >= 0) {
            class35.field482[mapview.field371] = var3;
            mapview.field371 = mapview.field371 + 1 & 0x7F;
            if (mapview.field371 == class19.field203) {
                mapview.field371 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class13.field147 + 1 & 0x7F;
            if (class16.field181 != var4) {
                class18.field191[class13.field147] = var3;
                class18.field193[class13.field147] = -1;
                class13.field147 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 285)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class8.field61 != null) {
            mapview.field371 = -1;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ljava/lang/Object;BLfa;)V", line = 312)
    public static final void method4(Object arg0, byte arg1, class12 arg2) {
        if (arg2.field105 == null) {
            return;
        }
        int var3 = 79 % ((arg1 - 25) / 57);
        for (int var4 = 0; var4 < 50 && arg2.field105.peekEvent() != null; var4++) {
            class31.method220(1L, -17164);
        }
        if (arg0 != null) {
            arg2.field105.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }
}
