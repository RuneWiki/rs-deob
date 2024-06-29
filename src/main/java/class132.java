import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class132 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2037 = 0;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!ob", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class258.field3955 != null) {
            class175.field2594 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class291.field4580.length > var2) {
                var3 = class291.field4580[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class259.field3961 >= 0 && var3 >= 0) {
                class223.field3517[class259.field3961] = var3;
                class259.field3961 = class259.field3961 + 1 & 0x7F;
                if (class259.field3961 == class178.field2665) {
                    class259.field3961 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class177.field2653 + 1 & 0x7F;
                if (class41.field671 != var4) {
                    class267.field4261[class177.field2653] = var3;
                    class242.field3739[class177.field2653] = '\u0000';
                    class177.field2653 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field2038++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method925(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2034++;
        if (arg0 >= class75.field1265 && class261.field4025 >= arg1 && class271.field4289 <= arg4 && class113.field1779 >= arg3) {
            class44.method370(arg0, arg4, arg6, arg5, arg1, arg2, (byte) 33, arg3);
        } else {
            class190.method1286(arg0, arg1, arg3, arg2, -102, arg4, arg5, arg6);
        }
        if (arg7 <= 64) {
            field2037 = -35;
        }
    }

    @OriginalMember(owner = "client!ob", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class258.field3955 != null) {
            class175.field2594 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class291.field4580.length > var2) {
                var3 = class291.field4580[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class259.field3961 >= 0 && var3 >= 0) {
                class223.field3517[class259.field3961] = ~var3;
                class259.field3961 = class259.field3961 + 1 & 0x7F;
                if (class259.field3961 == class178.field2665) {
                    class259.field3961 = -1;
                }
            }
        }
        arg0.consume();
        field2040++;
    }

    @OriginalMember(owner = "client!ob", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2039++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIBII)V")
    public static final void method926(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field2032++;
        int var7 = arg1 + arg3;
        int var8 = arg5 - arg3;
        if (arg4 != 104) {
            method926(-93, -113, 33, 6, (byte) 93, -74, -109);
        }
        for (int var9 = arg1; var9 < var7; var9++) {
            class263.method1788(arg2, -18732, arg6, class156.field2379[var9], arg0);
        }
        int var10 = arg0 - arg3;
        for (int var11 = arg5; var11 > var8; var11--) {
            class263.method1788(arg2, -18732, arg6, class156.field2379[var11], arg0);
        }
        int var12 = arg2 + arg3;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class156.field2379[var13];
            class263.method1788(arg2, arg4 ^ 0xFFFFB6BC, arg6, var14, var12);
            class263.method1788(var10, -18732, arg6, var14, arg0);
        }
    }

    @OriginalMember(owner = "client!ob", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class258.field3955 != null) {
            class259.field3961 = -1;
        }
        field2035++;
    }

    @OriginalMember(owner = "client!ob", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class258.field3955 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class220.method1475(122, var2)) {
                int var3 = class177.field2653 + 1 & 0x7F;
                if (class41.field671 != var3) {
                    class267.field4261[class177.field2653] = -1;
                    class242.field3739[class177.field2653] = var2;
                    class177.field2653 = var3;
                }
            }
        }
        arg0.consume();
        field2033++;
    }
}
