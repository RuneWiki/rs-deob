import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class33 extends Canvas implements WindowListener {

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Ljava/applet/Applet;")
    private Applet field657;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Ljava/awt/Frame;")
    private Frame field650;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "[I")
    public static int[] field661 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field654 = 0;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field660 = -1;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "Llc;")
    public static class69 field664 = class69.method470((byte) -124, "chatback");

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "[I")
    public static int[] field655;

    @OriginalMember(owner = "client!fb", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field647++;
    }

    @OriginalMember(owner = "client!fb", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field652++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static final void method209(byte arg0) {
        if (arg0 != -85) {
            return;
        }
        field659++;
        int var1 = (class46.field974.field1058 >> 7) + field648;
        class81.field1836 = 0;
        int var2 = (class46.field974.field1065 >> 7) + class60.field1234;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class81.field1836 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class81.field1836 = 1;
        }
        if (class81.field1836 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class81.field1836 = 0;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILpd;)Llc;")
    public static final class69 method210(int arg0, class94 arg1) {
        field649++;
        if (arg0 <= 122) {
            field648 = 60;
        }
        return class42.method249(arg1, 32767, 113);
    }

    @OriginalMember(owner = "client!fb", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field651++;
    }

    @OriginalMember(owner = "client!fb", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.field657.destroy();
        field653++;
    }

    @OriginalMember(owner = "client!fb", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field643++;
    }

    @OriginalMember(owner = "client!fb", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field657.update(arg0);
        field646++;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ljava/applet/Applet;II)V")
    public class33(Applet arg0, int arg1, int arg2) {
        this.field657 = arg0;
        this.field650 = new Frame();
        this.field650.setTitle("Jagex");
        this.field650.setResizable(false);
        this.setSize(arg1, arg2);
        this.field650.add(this);
        this.field650.pack();
        this.field650.addWindowListener(this);
        this.field650.setVisible(true);
        this.field650.toFront();
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public static void method211(boolean arg0) {
        field655 = null;
        field661 = null;
        if (arg0) {
            field664 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field645++;
    }

    @OriginalMember(owner = "client!fb", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field644++;
    }

    @OriginalMember(owner = "client!fb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field657.paint(arg0);
        field663++;
    }
}
