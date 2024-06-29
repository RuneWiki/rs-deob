import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class23 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Ljava/lang/String;")
    public static String field315 = "Please remove ";

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field318 = 1;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "F")
    public static float field313;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field325;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "[[I")
    public static int[][] field317;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method128(int arg0, int arg1, int arg2) {
        field314++;
        if (!class196.field3204) {
            return false;
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class221.field3547[var3] == null || class221.field3547[var3][var4] == null) {
            return false;
        } else if (arg0 > -22) {
            return false;
        } else {
            class157 var5 = class221.field3547[var3][var4];
            if (arg2 == -1 && var5.field2478 == 0) {
                for (int var6 = 0; var6 < class185.field3070; var6++) {
                    if (class113.field1727[var6] == 50 || class113.field1727[var6] == 1004 || class113.field1727[var6] == 46 || class113.field1727[var6] == 29 || class113.field1727[var6] == 13) {
                        for (class157 var7 = class142.method1053(class343.field5338[var6], 65535); var7 != null; var7 = class319.method2243(21695, var7)) {
                            if (var5.field2486 == var7.field2486) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (int var8 = 0; var8 < class185.field3070; var8++) {
                    if (class193.field3155[var8] == arg2 && class343.field5338[var8] == var5.field2486 && (class113.field1727[var8] == 50 || class113.field1727[var8] == 1004 || class113.field1727[var8] == 46 || class113.field1727[var8] == 29 || class113.field1727[var8] == 13)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 72)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class29.field396 != null) {
            class182.field3026 = -1;
        }
        field319++;
    }

    @OriginalMember(owner = "client!ug", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 85)
    public final void focusGained(FocusEvent arg0) {
        field320++;
    }

    @OriginalMember(owner = "client!ug", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 93)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field324++;
        if (class29.field396 == null) {
            return;
        }
        class298.field4703 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class208.field3416.length) {
            var3 = class208.field3416[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class182.field3026 >= 0 && var3 >= 0) {
            client.field1675[class182.field3026] = var3;
            class182.field3026 = class182.field3026 + 1 & 0x7F;
            if (class182.field3026 == class15.field173) {
                class182.field3026 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class194.field3182 + 1 & 0x7F;
            if (class53.field753 != var4) {
                class213.field3480[class194.field3182] = var3;
                class192.field3139[class194.field3182] = '\u0000';
                class194.field3182 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ug", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 151)
    public final void keyTyped(KeyEvent arg0) {
        field316++;
        if (class29.field396 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class297.method2120(var2, (byte) -102)) {
                int var3 = class194.field3182 + 1 & 0x7F;
                if (class53.field753 != var3) {
                    class213.field3480[class194.field3182] = -1;
                    class192.field3139[class194.field3182] = var2;
                    class194.field3182 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 186)
    public static void method129(int arg0) {
        field317 = (int[][]) null;
        field315 = null;
        if (arg0 != 0) {
            method130((class172) null, (byte) 15);
        }
        field325 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lak;B)V", line = 199)
    public static final void method130(class172 arg0, byte arg1) {
        if (arg1 != 75) {
            method128(119, 119, 90);
        }
        class67.field961 = arg0.method1298((byte) 69, "titlebg");
        field321++;
        class100.field1454 = arg0.method1298((byte) 73, "logo");
    }

    @OriginalMember(owner = "client!ug", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 227)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field322++;
        if (class29.field396 != null) {
            class298.field4703 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class208.field3416.length) {
                var3 = class208.field3416[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class182.field3026 >= 0 && var3 >= 0) {
                client.field1675[class182.field3026] = ~var3;
                class182.field3026 = class182.field3026 + 1 & 0x7F;
                if (class182.field3026 == class15.field173) {
                    class182.field3026 = -1;
                }
            }
        }
        arg0.consume();
    }
}
