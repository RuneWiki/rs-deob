import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class321 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4988 = "Loaded textures";

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIBII)V", line = 6)
    public static final void method2237(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var6 = 62 % ((-arg3 - 63) / 43);
        int var7 = arg1 - arg4;
        field4991++;
        int var8 = arg2 - arg5;
        if (var7 == 0) {
            if (var8 != 0) {
                class294.method2092(arg5, arg2, arg0, true, arg4);
            }
        } else if (var8 == 0) {
            class259.method1828(arg1, arg4, (byte) 18, arg5, arg0);
        } else {
            int var9 = (var8 << 12) / var7;
            int var10 = arg5 - (arg4 * var9 >> 12);
            int var11;
            int var12;
            if (arg1 < class337.field5389) {
                var11 = (class337.field5389 * var9 >> 12) + var10;
                var12 = class337.field5389;
            } else if (arg1 <= class344.field5460) {
                var12 = arg1;
                var11 = arg2;
            } else {
                var11 = (class344.field5460 * var9 >> 12) + var10;
                var12 = class344.field5460;
            }
            if (var11 < class244.field3844) {
                var11 = class244.field3844;
                var12 = (class244.field3844 - var10 << 12) / var9;
            } else if (class2.field22 < var11) {
                var11 = class2.field22;
                var12 = (class2.field22 - var10 << 12) / var9;
            }
            int var13;
            int var14;
            if (class337.field5389 > arg4) {
                var13 = class337.field5389;
                var14 = var10 + (class337.field5389 * var9 >> 12);
            } else if (arg4 > class344.field5460) {
                var14 = (class344.field5460 * var9 >> 12) + var10;
                var13 = class344.field5460;
            } else {
                var14 = arg5;
                var13 = arg4;
            }
            if (class244.field3844 > var14) {
                var14 = class244.field3844;
                var13 = (class244.field3844 - var10 << 12) / var9;
            } else if (class2.field22 < var14) {
                var14 = class2.field22;
                var13 = (class2.field22 - var10 << 12) / var9;
            }
            class156.method1140(23194, var13, var12, var14, arg0, var11);
        }
    }

    @OriginalMember(owner = "client!mk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 107)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class188.field2839 != null) {
            class205.field3106 = -1;
        }
        field4990++;
    }

    @OriginalMember(owner = "client!mk", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 123)
    public final void keyTyped(KeyEvent arg0) {
        if (class188.field2839 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class115.method744((byte) 20, var2)) {
                int var3 = class72.field895 + 1 & 0x7F;
                if (class63.field750 != var3) {
                    class285.field4532[class72.field895] = -1;
                    class62.field737[class72.field895] = var2;
                    class72.field895 = var3;
                }
            }
        }
        field4986++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!mk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 151)
    public final void focusGained(FocusEvent arg0) {
        field4994++;
    }

    @OriginalMember(owner = "client!mk", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 165)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class188.field2839 != null) {
            class123.field1694 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class16.field196.length) {
                var3 = class16.field196[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class205.field3106 >= 0 && var3 >= 0) {
                class289.field4549[class205.field3106] = var3;
                class205.field3106 = class205.field3106 + 1 & 0x7F;
                if (class71.field882 == class205.field3106) {
                    class205.field3106 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class72.field895 + 1 & 0x7F;
                if (class63.field750 != var4) {
                    class285.field4532[class72.field895] = var3;
                    class62.field737[class72.field895] = '\u0000';
                    class72.field895 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field4993++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 223)
    public static void method2238(byte arg0) {
        if (arg0 <= 67) {
            field4988 = (String) null;
        }
        field4988 = null;
    }

    @OriginalMember(owner = "client!mk", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 235)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class188.field2839 != null) {
            class123.field1694 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class16.field196.length) {
                var3 = class16.field196[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class205.field3106 >= 0 && var3 >= 0) {
                class289.field4549[class205.field3106] = ~var3;
                class205.field3106 = class205.field3106 + 1 & 0x7F;
                if (class71.field882 == class205.field3106) {
                    class205.field3106 = -1;
                }
            }
        }
        arg0.consume();
        field4989++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)I", line = 272)
    public static final int method2239(int arg0, byte arg1) {
        field4992++;
        if (arg1 != -15) {
            field4988 = (String) null;
        }
        return arg0 >>> 10;
    }
}
