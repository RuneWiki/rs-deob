import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class253 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field4377 = 0;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lwm;")
    public static class152 field4376 = class157.method1048("Prendre", 126);

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field4387 = -1;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public static int field4388 = 0;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public static int field4386 = 0;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lbg;")
    public static class203 field4382;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "[I")
    public static int[] field4383;

    @OriginalMember(owner = "client!t", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 40)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class236.field3866 != null) {
            class183.field2915 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class294.field5032.length) {
                var3 = class294.field5032[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class216.field3510 >= 0 && var3 >= 0) {
                class268.field4519[class216.field3510] = ~var3;
                class216.field3510 = class216.field3510 + 1 & 0x7F;
                if (class303.field5214 == class216.field3510) {
                    class216.field3510 = -1;
                }
            }
        }
        arg0.consume();
        field4381++;
    }

    @OriginalMember(owner = "client!t", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 81)
    public final synchronized void focusLost(FocusEvent arg0) {
        field4380++;
        if (class236.field3866 != null) {
            class216.field3510 = -1;
        }
    }

    @OriginalMember(owner = "client!t", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 96)
    public final void keyTyped(KeyEvent arg0) {
        if (class236.field3866 != null) {
            int var2 = class15.method95(30, arg0);
            if (var2 >= 0) {
                int var3 = class59.field906 + 1 & 0x7F;
                if (client.field4352 != var3) {
                    class12.field178[class59.field906] = -1;
                    class284.field4834[class59.field906] = var2;
                    class59.field906 = var3;
                }
            }
        }
        arg0.consume();
        field4373++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)Z", line = 124)
    public static final boolean method1762(int arg0, int arg1) {
        field4374++;
        return ~arg0 <= arg1 && class3.field48.length > arg0 ? class3.field48[arg0] : false;
    }

    @OriginalMember(owner = "client!t", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 165)
    public final void focusGained(FocusEvent arg0) {
        field4379++;
    }

    @OriginalMember(owner = "client!t", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 187)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class236.field3866 != null) {
            class183.field2915 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class294.field5032.length > var2) {
                var3 = class294.field5032[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class216.field3510 >= 0 && var3 >= 0) {
                class268.field4519[class216.field3510] = var3;
                class216.field3510 = class216.field3510 + 1 & 0x7F;
                if (class303.field5214 == class216.field3510) {
                    class216.field3510 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class59.field906 + 1 & 0x7F;
                if (client.field4352 != var4) {
                    class12.field178[class59.field906] = var3;
                    class284.field4834[class59.field906] = -1;
                    class59.field906 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field4385++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BLah;Lah;)V", line = 273)
    public static final void method1763(byte arg0, class205 arg1, class205 arg2) {
        class197.field3161 = arg1;
        class70.field1015 = arg2;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        class70.field1015.method1375(34, 0);
        field4378++;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 41.0D) - 20;
        class100.field1447 = var4 + var5;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class64.field968 = var6 + var5;
        int var7 = 1 % ((arg0 + 17) / 35);
        class90.field1260 = var3 + var5;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)V", line = 305)
    public static final void method1764(int arg0, byte arg1) {
        field4384++;
        if (arg0 == -1 || !class132.field2005[arg0]) {
            return;
        }
        class23.field408.method1382(arg0, true);
        int var2 = 8 % ((6 - arg1) / 56);
        if (class215.field3501[arg0] == null) {
            return;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < class215.field3501[arg0].length; var4++) {
            if (class215.field3501[arg0][var4] != null) {
                if (class215.field3501[arg0][var4].field1902 == 2) {
                    var3 = false;
                } else {
                    class215.field3501[arg0][var4] = null;
                }
            }
        }
        if (var3) {
            class215.field3501[arg0] = null;
        }
        class132.field2005[arg0] = false;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 357)
    public static void method1765(int arg0) {
        int var1 = -123 % ((arg0 - 17) / 62);
        field4376 = null;
        field4383 = null;
        field4382 = null;
    }
}
