import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class289 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "[I")
    public static int[] field4501 = new int[14];

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field4500 = new String[1000];

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4491 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)V")
    public static final void method1937(boolean arg0, int arg1) {
        field4498++;
        for (class116 var2 = (class116) class72.field865.method1532(-100); var2 != null; var2 = (class116) class72.field865.method1523(-124)) {
            if (var2.field1610 != null) {
                class14.field178.method189(var2.field1610);
                var2.field1610 = null;
            }
            if (var2.field1622 != null) {
                class14.field178.method189(var2.field1622);
                var2.field1622 = null;
            }
            var2.method1935(104);
        }
        if (arg1 != 0) {
            field4502 = 35;
        }
        if (!arg0) {
            return;
        }
        for (class116 var3 = (class116) class254.field3665.method1532(-105); var3 != null; var3 = (class116) class254.field3665.method1523(-121)) {
            if (var3.field1610 != null) {
                class14.field178.method189(var3.field1610);
                var3.field1610 = null;
            }
            var3.method1935(116);
        }
        for (class116 var4 = (class116) class60.field715.method1890((byte) 118); var4 != null; var4 = (class116) class60.field715.method1889(false)) {
            if (var4.field1610 != null) {
                class14.field178.method189(var4.field1610);
                var4.field1610 = null;
            }
            var4.method1935(112);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method1938(int arg0) {
        field4501 = null;
        field4491 = null;
        field4500 = null;
        if (arg0 != -19929) {
            method1937(false, 127);
        }
    }

    @OriginalMember(owner = "client!qb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class280.field4251 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class73.method452(var2, -20346)) {
                int var3 = class90.field1231 + 1 & 0x7F;
                if (class109.field1465 != var3) {
                    class196.field2791[class90.field1231] = -1;
                    class123.field1774[class90.field1231] = var2;
                    class90.field1231 = var3;
                }
            }
        }
        arg0.consume();
        field4495++;
    }

    @OriginalMember(owner = "client!qb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4494++;
    }

    @OriginalMember(owner = "client!qb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class280.field4251 != null) {
            class228.field3210 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class195.field2784.length > var2) {
                var3 = class195.field2784[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class296.field4675 >= 0 && var3 >= 0) {
                class136.field1978[class296.field4675] = var3;
                class296.field4675 = class296.field4675 + 1 & 0x7F;
                if (class296.field4675 == class178.field2539) {
                    class296.field4675 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class90.field1231 + 1 & 0x7F;
                if (class109.field1465 != var4) {
                    class196.field2791[class90.field1231] = var3;
                    class123.field1774[class90.field1231] = '\u0000';
                    class90.field1231 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field4497++;
    }

    @OriginalMember(owner = "client!qb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class280.field4251 != null) {
            class296.field4675 = -1;
        }
        field4493++;
    }

    @OriginalMember(owner = "client!qb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class280.field4251 != null) {
            class228.field3210 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class195.field2784.length) {
                var3 = class195.field2784[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class296.field4675 >= 0 && var3 >= 0) {
                class136.field1978[class296.field4675] = ~var3;
                class296.field4675 = class296.field4675 + 1 & 0x7F;
                if (class296.field4675 == class178.field2539) {
                    class296.field4675 = -1;
                }
            }
        }
        arg0.consume();
        field4492++;
    }
}
