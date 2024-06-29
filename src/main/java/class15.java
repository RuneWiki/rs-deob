import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GRXJFORE")
public class class15 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!GRXJFORE", name = "a", descriptor = "Z")
    private boolean field764 = false;

    @OriginalMember(owner = "client!GRXJFORE", name = "b", descriptor = "I")
    private int field765 = 932;

    @OriginalMember(owner = "client!GRXJFORE", name = "c", descriptor = "I")
    private int field766 = 5;

    @OriginalMember(owner = "client!GRXJFORE", name = "e", descriptor = "Z")
    private boolean field768 = true;

    @OriginalMember(owner = "client!GRXJFORE", name = "g", descriptor = "I")
    private int field770 = 20;

    @OriginalMember(owner = "client!GRXJFORE", name = "h", descriptor = "I")
    public int field771 = 1;

    @OriginalMember(owner = "client!GRXJFORE", name = "i", descriptor = "[J")
    private long[] field772 = new long[10];

    @OriginalMember(owner = "client!GRXJFORE", name = "k", descriptor = "Z")
    public boolean field774 = false;

    @OriginalMember(owner = "client!GRXJFORE", name = "p", descriptor = "[LWSNKRVXZ;")
    public class66[] field779 = new class66[6];

    @OriginalMember(owner = "client!GRXJFORE", name = "r", descriptor = "Z")
    public boolean field781 = true;

    @OriginalMember(owner = "client!GRXJFORE", name = "s", descriptor = "Z")
    public boolean field782 = true;

    @OriginalMember(owner = "client!GRXJFORE", name = "F", descriptor = "[I")
    public int[] field795 = new int[128];

    @OriginalMember(owner = "client!GRXJFORE", name = "G", descriptor = "[I")
    private int[] field796 = new int[128];

    @OriginalMember(owner = "client!GRXJFORE", name = "d", descriptor = "I")
    private int field767;

    @OriginalMember(owner = "client!GRXJFORE", name = "f", descriptor = "I")
    private int field769;

    @OriginalMember(owner = "client!GRXJFORE", name = "j", descriptor = "I")
    public int field773;

    @OriginalMember(owner = "client!GRXJFORE", name = "l", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "client!GRXJFORE", name = "m", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "client!GRXJFORE", name = "t", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "client!GRXJFORE", name = "u", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "client!GRXJFORE", name = "v", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "client!GRXJFORE", name = "w", descriptor = "I")
    public int field786;

    @OriginalMember(owner = "client!GRXJFORE", name = "x", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!GRXJFORE", name = "y", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!GRXJFORE", name = "z", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!GRXJFORE", name = "B", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!GRXJFORE", name = "C", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!GRXJFORE", name = "D", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!GRXJFORE", name = "H", descriptor = "I")
    private int field797;

    @OriginalMember(owner = "client!GRXJFORE", name = "I", descriptor = "I")
    private int field798;

    @OriginalMember(owner = "client!GRXJFORE", name = "J", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!GRXJFORE", name = "A", descriptor = "J")
    public long field790;

    @OriginalMember(owner = "client!GRXJFORE", name = "E", descriptor = "J")
    public long field794;

    @OriginalMember(owner = "client!GRXJFORE", name = "o", descriptor = "LGYXQUUFC;")
    public class17 field778;

    @OriginalMember(owner = "client!GRXJFORE", name = "q", descriptor = "LJWHKCZBF;")
    public class28 field780;

    @OriginalMember(owner = "client!GRXJFORE", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics field777;

    @OriginalMember(owner = "client!GRXJFORE", name = "a", descriptor = "(III)V")
    public final void method240(int arg0, int arg1, int arg2) {
        if (arg0 != -12006) {
            this.field765 = 366;
        }
        this.field775 = arg1;
        this.field776 = arg2;
        this.field780 = new class28(this, this.field776, -45071, this.field775);
        this.field777 = this.method117(0).getGraphics();
        this.field778 = new class17(3, this.field776, this.field775, this.method117(0));
        this.method31(this, 1);
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "b", descriptor = "(III)V")
    public final void method241(int arg0, int arg1, int arg2) {
        this.field775 = arg1;
        this.field776 = arg2;
        this.field777 = this.method117(0).getGraphics();
        if (arg0 != 37560) {
            this.field764 = !this.field764;
        }
        this.field778 = new class17(3, this.field776, this.field775, this.method117(0));
        this.method31(this, 1);
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "run", descriptor = "()V")
    public void run() {
        this.method117(0).addMouseListener(this);
        this.method117(0).addMouseMotionListener(this);
        this.method117(0).addKeyListener(this);
        this.method117(0).addFocusListener(this);
        if (this.field780 != null) {
            this.field780.addWindowListener(this);
        }
        this.method58((byte) -59, 0, "Loading...");
        this.method102();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field772[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field769 < 0) {
                    if (this.field769 == -1) {
                        this.method242((byte) -15);
                    }
                    return;
                }
                if (this.field769 > 0) {
                    this.field769--;
                    if (this.field769 == 0) {
                        this.method242((byte) -15);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field772[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field772[var1]) {
                    var2 = (int) ((long) (this.field770 * 2560) / (var11 - this.field772[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field770 - (var11 - this.field772[var1]) / 10L);
                }
                if (var3 > this.field770) {
                    var3 = this.field770;
                }
                this.field772[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field772[var13] != 0L) {
                            this.field772[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field771) {
                    var3 = this.field771;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field791 = this.field787;
                    this.field792 = this.field788;
                    this.field793 = this.field789;
                    this.field794 = this.field790;
                    this.field787 = 0;
                    this.method32(this.field766);
                    this.field797 = this.field798;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field770 > 0) {
                    this.field773 = var2 * 1000 / (this.field770 * 256);
                }
                this.method157(7);
            } while (!this.field774);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field772[var15]);
            }
            System.out.println("fps:" + this.field773 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field770 + " mindel:" + this.field771);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field774 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "a", descriptor = "(B)V")
    public final void method242(byte arg0) {
        if (arg0 != -15) {
            this.field764 = !this.field764;
        }
        this.field769 = -2;
        this.method168(297);
        if (this.field780 == null) {
            return;
        }
        try {
            Thread.sleep(1000L);
        } catch (Exception var3) {
        }
        try {
            System.exit(0);
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "a", descriptor = "(ZI)V")
    public final void method243(boolean arg0, int arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field770 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field769 >= 0) {
            this.field769 = 0;
        }
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field769 >= 0) {
            this.field769 = 4000 / this.field770;
        }
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field769 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field769 == -1) {
            this.method242((byte) -15);
        }
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field777 == null) {
            this.field777 = arg0;
        }
        this.field781 = true;
        this.method71(23974);
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field777 == null) {
            this.field777 = arg0;
        }
        this.field781 = true;
        this.method71(23974);
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field780 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field783 = 0;
        this.field788 = var2;
        this.field789 = var3;
        this.field790 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field787 = 2;
            this.field784 = 2;
        } else {
            this.field787 = 1;
            this.field784 = 1;
        }
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field783 = 0;
        this.field784 = 0;
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field783 = 0;
        this.field785 = -1;
        this.field786 = -1;
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field780 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field783 = 0;
        this.field785 = var2;
        this.field786 = var3;
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field780 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field783 = 0;
        this.field785 = var2;
        this.field786 = var3;
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field783 = 0;
        int var2 = arg0.getKeyCode();
        int var3 = arg0.getKeyChar();
        if (var3 < 30) {
            var3 = 0;
        }
        if (var2 == 37) {
            var3 = 1;
        }
        if (var2 == 39) {
            var3 = 2;
        }
        if (var2 == 38) {
            var3 = 3;
        }
        if (var2 == 40) {
            var3 = 4;
        }
        if (var2 == 17) {
            var3 = 5;
        }
        if (var2 == 8) {
            var3 = 8;
        }
        if (var2 == 127) {
            var3 = 8;
        }
        if (var2 == 9) {
            var3 = 9;
        }
        if (var2 == 10) {
            var3 = 10;
        }
        if (var2 >= 112 && var2 <= 123) {
            var3 = var2 + 1008 - 112;
        }
        if (var2 == 36) {
            var3 = 1000;
        }
        if (var2 == 35) {
            var3 = 1001;
        }
        if (var2 == 33) {
            var3 = 1002;
        }
        if (var2 == 34) {
            var3 = 1003;
        }
        if (var3 > 0 && var3 < 128) {
            this.field795[var3] = 1;
        }
        if (var3 > 4) {
            this.field796[this.field798] = var3;
            this.field798 = this.field798 + 1 & 0x7F;
        }
        if (class33.field960) {
        }
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field783 = 0;
        int var2 = arg0.getKeyCode();
        char var3 = arg0.getKeyChar();
        if (var3 < '\u001E') {
            var3 = '\u0000';
        }
        if (var2 == 37) {
            var3 = '\u0001';
        }
        if (var2 == 39) {
            var3 = '\u0002';
        }
        if (var2 == 38) {
            var3 = '\u0003';
        }
        if (var2 == 40) {
            var3 = '\u0004';
        }
        if (var2 == 17) {
            var3 = '\u0005';
        }
        if (var2 == 8) {
            var3 = '\b';
        }
        if (var2 == 127) {
            var3 = '\b';
        }
        if (var2 == 9) {
            var3 = '\t';
        }
        if (var2 == 10) {
            var3 = '\n';
        }
        if (var3 > '\u0000' && var3 < '\u0080') {
            this.field795[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "a", descriptor = "(I)I")
    public final int method244(int arg0) {
        if (arg0 <= 0) {
            this.field767 = -97;
        }
        int var2 = -1;
        if (this.field798 != this.field797) {
            var2 = this.field796[this.field797];
            this.field797 = this.field797 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field782 = true;
        this.field781 = true;
        this.method71(23974);
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field782 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field795[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "a", descriptor = "()V")
    public void method102() {
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "b", descriptor = "(I)V")
    public void method32(int arg0) {
        if (arg0 < this.field766 || arg0 > this.field766) {
            this.field764 = !this.field764;
        }
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "c", descriptor = "(I)V")
    public void method168(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "d", descriptor = "(I)V")
    public void method157(int arg0) {
        if (arg0 != 7) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "e", descriptor = "(I)V")
    public void method71(int arg0) {
        if (arg0 != 23974) {
            this.field765 = -326;
        }
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "f", descriptor = "(I)Ljava/awt/Component;")
    public Component method117(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return this.field780 == null ? this : this.field780;
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method31(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!GRXJFORE", name = "a", descriptor = "(BILjava/lang/String;)V")
    public void method58(byte arg0, int arg1, String arg2) {
        while (this.field777 == null) {
            this.field777 = this.method117(0).getGraphics();
            try {
                this.method117(0).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method117(0).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method117(0).getFontMetrics(var6);
        if (this.field781) {
            this.field777.setColor(Color.black);
            this.field777.fillRect(0, 0, this.field775, this.field776);
            this.field781 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field776 / 2 - 18;
        this.field777.setColor(var7);
        this.field777.drawRect(this.field775 / 2 - 152, var8, 304, 34);
        this.field777.fillRect(this.field775 / 2 - 150, var8 + 2, arg1 * 3, 30);
        if (arg0 != -59) {
            this.field768 = !this.field768;
        }
        this.field777.setColor(Color.black);
        this.field777.fillRect(arg1 * 3 + this.field775 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field777.setFont(var4);
        this.field777.setColor(Color.white);
        this.field777.drawString(arg2, (this.field775 - var5.stringWidth(arg2)) / 2, var8 + 22);
    }
}
