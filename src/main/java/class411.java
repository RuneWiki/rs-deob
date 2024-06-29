import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class411 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field6143 = 0;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "Z")
    public static boolean field6154 = false;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field6142 = 0;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "Ljava/lang/String;")
    public static String field6153 = "Allocating memory";

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "Lqj;")
    public static class238 field6150;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "Lqj;")
    public static class238 field6155;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "[Lja;")
    public static class90[] field6149;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2672(byte arg0) {
        field6145++;
        class24 var1 = class228.field3212;
        synchronized (class228.field3212) {
            class228.field3212.method212(arg0 ^ 0x47);
            if (arg0 != -43) {
                field6142 = -14;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 16)
    public final void keyTyped(KeyEvent arg0) {
        if (class310.field4436 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class376.method2491((byte) 34, var2)) {
                int var3 = field6143 + 1 & 0x7F;
                if (class318.field4544 != var3) {
                    class154.field2015[field6143] = -1;
                    class66.field935[field6143] = var2;
                    field6143 = var3;
                }
            }
        }
        field6141++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)Lfp;", line = 45)
    public static final class7 method2673(byte arg0, int arg1) {
        field6146++;
        class24 var2 = class23.field395;
        class7 var3;
        synchronized (class23.field395) {
            var3 = (class7) class23.field395.method209(arg0 + 208, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class77.field1058.method1472(arg1, 16, 0);
        class7 var5 = new class7();
        if (arg0 != -87) {
            method2675(-7, -23, 6, 92, 29, -88, 74, false, -15, 39);
        }
        if (var4 != null) {
            var5.method59((byte) 126, new class265(var4));
        }
        class24 var6 = class23.field395;
        synchronized (class23.field395) {
            class23.field395.method202(true, var5, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V", line = 78)
    public static void method2674(boolean arg0) {
        field6153 = null;
        field6149 = null;
        if (arg0) {
            method2673((byte) -17, 63);
        }
        field6155 = null;
        field6150 = null;
    }

    @OriginalMember(owner = "client!cn", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 97)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class310.field4436 != null) {
            class37.field603 = -1;
        }
        field6144++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIIIZII)V", line = 116)
    public static final void method2675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        if (arg7) {
            method2673((byte) -93, 40);
        }
        if (arg4 >= class203.field2942 && arg4 <= class297.field4268 && arg9 >= class203.field2942 && arg9 <= class297.field4268 && arg3 >= class203.field2942 && arg3 <= class297.field4268 && arg6 >= class203.field2942 && arg6 <= class297.field4268 && arg5 >= class180.field2375 && arg5 <= class50.field695 && class180.field2375 <= arg1 && class50.field695 >= arg1 && class180.field2375 <= arg2 && arg2 <= class50.field695 && class180.field2375 <= arg8 && class50.field695 >= arg8) {
            class214.method1339(arg3, arg0, arg5, arg1, arg2, arg4, arg7, arg6, arg9, arg8);
        } else {
            class188.method1173(arg1, arg4, arg5, arg8, arg6, arg9, (byte) 111, arg2, arg0, arg3);
        }
        field6152++;
    }

    @OriginalMember(owner = "client!cn", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 133)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field6148++;
        if (class310.field4436 == null) {
            return;
        }
        class368.field5476 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class447.field6519.length > var2) {
            var3 = class447.field6519[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class37.field603 >= 0 && var3 >= 0) {
            class271.field3972[class37.field603] = var3;
            class37.field603 = class37.field603 + 1 & 0x7F;
            if (class37.field603 == class122.field1625) {
                class37.field603 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field6143 + 1 & 0x7F;
            if (class318.field4544 != var4) {
                class154.field2015[field6143] = var3;
                class66.field935[field6143] = '\u0000';
                field6143 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cn", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 198)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class310.field4436 != null) {
            class368.field5476 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class447.field6519.length > var2) {
                var3 = class447.field6519[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class37.field603 >= 0 && var3 >= 0) {
                class271.field3972[class37.field603] = ~var3;
                class37.field603 = class37.field603 + 1 & 0x7F;
                if (class37.field603 == class122.field1625) {
                    class37.field603 = -1;
                }
            }
        }
        field6151++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!cn", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 235)
    public final void focusGained(FocusEvent arg0) {
        field6147++;
    }
}
