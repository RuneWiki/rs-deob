import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class194 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Lkb;")
    public static class93 field3766 = class76.method390("mn", 0);

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "[I")
    public static int[] field3768 = new int[2000];

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Lkb;")
    private static class93 field3770 = class76.method390("Unexpected server response)3", 0);

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Lkb;")
    public static class93 field3769 = field3770;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Lkb;")
    public static class93 field3762 = null;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Lkb;")
    public static class93 field3772 = class76.method390("und loggen sich dann erneut ein)3", 0);

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!vd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3771++;
    }

    @OriginalMember(owner = "client!vd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class203.field3915 != null) {
            int var2 = class85.method432((byte) 116, arg0);
            if (var2 >= 0) {
                int var3 = class205.field3976 + 1 & 0x7F;
                if (class111.field2003 != var3) {
                    class161.field3225[class205.field3976] = -1;
                    class59.field948[class205.field3976] = var2;
                    class205.field3976 = var3;
                }
            }
        }
        arg0.consume();
        field3765++;
    }

    @OriginalMember(owner = "client!vd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class203.field3915 != null) {
            class161.field3227 = -1;
        }
        field3763++;
    }

    @OriginalMember(owner = "client!vd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class203.field3915 != null) {
            class65.field1059 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class24.field364.length > var2) {
                var3 = class24.field364[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class161.field3227 >= 0 && var3 >= 0) {
                class169.field3366[class161.field3227] = ~var3;
                class161.field3227 = class161.field3227 + 1 & 0x7F;
                if (class18.field301 == class161.field3227) {
                    class161.field3227 = -1;
                }
            }
        }
        arg0.consume();
        field3767++;
    }

    @OriginalMember(owner = "client!vd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3773++;
        if (class203.field3915 == null) {
            return;
        }
        class65.field1059 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class24.field364.length) {
            var3 = class24.field364[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class161.field3227 >= 0 && var3 >= 0) {
            class169.field3366[class161.field3227] = var3;
            class161.field3227 = class161.field3227 + 1 & 0x7F;
            if (class18.field301 == class161.field3227) {
                class161.field3227 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class205.field3976 + 1 & 0x7F;
            if (class111.field2003 != var4) {
                class161.field3225[class205.field3976] = var3;
                class59.field948[class205.field3976] = -1;
                class205.field3976 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method1246(int arg0) {
        field3769 = null;
        field3768 = null;
        field3770 = null;
        field3766 = null;
        if (arg0 != -1) {
            method1246(48);
        }
        field3762 = null;
        field3772 = null;
    }
}
