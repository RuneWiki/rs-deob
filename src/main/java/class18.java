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

@OriginalClass("EUDZGBGU")
public class class18 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "EUDZGBGU", name = "a", descriptor = "I")
    private int field748 = 2;

    @OriginalMember(owner = "EUDZGBGU", name = "b", descriptor = "Z")
    private boolean field749 = true;

    @OriginalMember(owner = "EUDZGBGU", name = "c", descriptor = "Z")
    private boolean field750 = false;

    @OriginalMember(owner = "EUDZGBGU", name = "d", descriptor = "Z")
    private boolean field751 = false;

    @OriginalMember(owner = "EUDZGBGU", name = "e", descriptor = "Z")
    private boolean field752 = true;

    @OriginalMember(owner = "EUDZGBGU", name = "g", descriptor = "I")
    private int field754 = 20;

    @OriginalMember(owner = "EUDZGBGU", name = "h", descriptor = "I")
    public int field755 = 1;

    @OriginalMember(owner = "EUDZGBGU", name = "i", descriptor = "[J")
    private long[] field756 = new long[10];

    @OriginalMember(owner = "EUDZGBGU", name = "k", descriptor = "Z")
    public boolean field758 = false;

    @OriginalMember(owner = "EUDZGBGU", name = "p", descriptor = "[LPDMJJHOP;")
    public class55[] field763 = new class55[6];

    @OriginalMember(owner = "EUDZGBGU", name = "r", descriptor = "Z")
    public boolean field765 = true;

    @OriginalMember(owner = "EUDZGBGU", name = "s", descriptor = "Z")
    public boolean field766 = true;

    @OriginalMember(owner = "EUDZGBGU", name = "F", descriptor = "[I")
    public int[] field779 = new int[128];

    @OriginalMember(owner = "EUDZGBGU", name = "G", descriptor = "[I")
    private int[] field780 = new int[128];

    @OriginalMember(owner = "EUDZGBGU", name = "f", descriptor = "I")
    private int field753;

    @OriginalMember(owner = "EUDZGBGU", name = "j", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "EUDZGBGU", name = "l", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "EUDZGBGU", name = "m", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "EUDZGBGU", name = "t", descriptor = "I")
    public int field767;

    @OriginalMember(owner = "EUDZGBGU", name = "u", descriptor = "I")
    public int field768;

    @OriginalMember(owner = "EUDZGBGU", name = "v", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "EUDZGBGU", name = "w", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "EUDZGBGU", name = "x", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "EUDZGBGU", name = "y", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "EUDZGBGU", name = "z", descriptor = "I")
    public int field773;

    @OriginalMember(owner = "EUDZGBGU", name = "B", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "EUDZGBGU", name = "C", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "EUDZGBGU", name = "D", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "EUDZGBGU", name = "H", descriptor = "I")
    private int field781;

    @OriginalMember(owner = "EUDZGBGU", name = "I", descriptor = "I")
    private int field782;

    @OriginalMember(owner = "EUDZGBGU", name = "J", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "EUDZGBGU", name = "A", descriptor = "J")
    public long field774;

    @OriginalMember(owner = "EUDZGBGU", name = "E", descriptor = "J")
    public long field778;

    @OriginalMember(owner = "EUDZGBGU", name = "o", descriptor = "LBVMYRJQC;")
    public class10 field762;

    @OriginalMember(owner = "EUDZGBGU", name = "q", descriptor = "LIUROYOHP;")
    public class26 field764;

    @OriginalMember(owner = "EUDZGBGU", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics field761;

    @OriginalMember(owner = "EUDZGBGU", name = "a", descriptor = "(BII)V")
    public final void method207(byte arg0, int arg1, int arg2) {
        this.field759 = arg2;
        this.field760 = arg1;
        this.field764 = new class26(this.field760, true, this.field759, this);
        if (arg0 == 6) {
            boolean var4 = false;
        } else {
            this.field750 = !this.field750;
        }
        this.field761 = this.method107(4).getGraphics();
        this.field762 = new class10(this.field760, this.method107(4), false, this.field759);
        this.method47(this, 1);
    }

    @OriginalMember(owner = "EUDZGBGU", name = "a", descriptor = "(III)V")
    public final void method208(int arg0, int arg1, int arg2) {
        this.field759 = arg2;
        this.field760 = arg1;
        if (arg0 > 0) {
            this.field761 = this.method107(4).getGraphics();
            this.field762 = new class10(this.field760, this.method107(4), false, this.field759);
            this.method47(this, 1);
        }
    }

    @OriginalMember(owner = "EUDZGBGU", name = "run", descriptor = "()V")
    public void run() {
        this.method107(4).addMouseListener(this);
        this.method107(4).addMouseMotionListener(this);
        this.method107(4).addKeyListener(this);
        this.method107(4).addFocusListener(this);
        if (this.field764 != null) {
            this.field764.addWindowListener(this);
        }
        this.method142(0, "Loading...", 9);
        this.method81();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field756[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field753 < 0) {
                    if (this.field753 == -1) {
                        this.method209(false);
                    }
                    return;
                }
                if (this.field753 > 0) {
                    this.field753--;
                    if (this.field753 == 0) {
                        this.method209(false);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field756[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field756[var1]) {
                    var2 = (int) ((long) (this.field754 * 2560) / (var11 - this.field756[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field754 - (var11 - this.field756[var1]) / 10L);
                }
                if (var3 > this.field754) {
                    var3 = this.field754;
                }
                this.field756[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field756[var13] != 0L) {
                            this.field756[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field755) {
                    var3 = this.field755;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field775 = this.field771;
                    this.field776 = this.field772;
                    this.field777 = this.field773;
                    this.field778 = this.field774;
                    this.field771 = 0;
                    this.method92(9);
                    this.field781 = this.field782;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field754 > 0) {
                    this.field757 = var2 * 1000 / (this.field754 * 256);
                }
                this.method182((byte) 5);
            } while (!this.field758);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field756[var15]);
            }
            System.out.println("fps:" + this.field757 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field754 + " mindel:" + this.field755);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field758 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "EUDZGBGU", name = "a", descriptor = "(Z)V")
    public final void method209(boolean arg0) {
        this.field753 = -2;
        if (arg0) {
            this.field750 = !this.field750;
        }
        this.method53(-615);
        if (this.field764 == null) {
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

    @OriginalMember(owner = "EUDZGBGU", name = "a", descriptor = "(II)V")
    public final void method210(int arg0, int arg1) {
        this.field754 = 1000 / arg1;
        if (arg0 != 0) {
            this.field750 = !this.field750;
        }
    }

    @OriginalMember(owner = "EUDZGBGU", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field753 >= 0) {
            this.field753 = 0;
        }
    }

    @OriginalMember(owner = "EUDZGBGU", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field753 >= 0) {
            this.field753 = 4000 / this.field754;
        }
    }

    @OriginalMember(owner = "EUDZGBGU", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field753 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field753 == -1) {
            this.method209(false);
        }
    }

    @OriginalMember(owner = "EUDZGBGU", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field761 == null) {
            this.field761 = arg0;
        }
        this.field765 = true;
        this.method91((byte) -8);
    }

    @OriginalMember(owner = "EUDZGBGU", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field761 == null) {
            this.field761 = arg0;
        }
        this.field765 = true;
        this.method91((byte) -8);
    }

    @OriginalMember(owner = "EUDZGBGU", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field764 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field767 = 0;
        this.field772 = var2;
        this.field773 = var3;
        this.field774 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field771 = 2;
            this.field768 = 2;
        } else {
            this.field771 = 1;
            this.field768 = 1;
        }
    }

    @OriginalMember(owner = "EUDZGBGU", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field767 = 0;
        this.field768 = 0;
    }

    @OriginalMember(owner = "EUDZGBGU", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "EUDZGBGU", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "EUDZGBGU", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field767 = 0;
        this.field769 = -1;
        this.field770 = -1;
    }

    @OriginalMember(owner = "EUDZGBGU", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field764 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field767 = 0;
        this.field769 = var2;
        this.field770 = var3;
    }

    @OriginalMember(owner = "EUDZGBGU", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field764 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field767 = 0;
        this.field769 = var2;
        this.field770 = var3;
    }

    @OriginalMember(owner = "EUDZGBGU", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field767 = 0;
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
            this.field779[var3] = 1;
        }
        if (var3 > 4) {
            this.field780[this.field782] = var3;
            this.field782 = this.field782 + 1 & 0x7F;
        }
        if (class54.field1301) {
        }
    }

    @OriginalMember(owner = "EUDZGBGU", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field767 = 0;
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
            this.field779[var3] = 0;
        }
    }

    @OriginalMember(owner = "EUDZGBGU", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "EUDZGBGU", name = "a", descriptor = "(I)I")
    public final int method211(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = -1;
        if (this.field782 != this.field781) {
            var3 = this.field780[this.field781];
            this.field781 = this.field781 + 1 & 0x7F;
        }
        return var3;
    }

    @OriginalMember(owner = "EUDZGBGU", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field766 = true;
        this.field765 = true;
        this.method91((byte) -8);
    }

    @OriginalMember(owner = "EUDZGBGU", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field766 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field779[var2] = 0;
        }
    }

    @OriginalMember(owner = "EUDZGBGU", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "EUDZGBGU", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "EUDZGBGU", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "EUDZGBGU", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "EUDZGBGU", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "EUDZGBGU", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "EUDZGBGU", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "EUDZGBGU", name = "a", descriptor = "()V")
    public void method81() {
    }

    @OriginalMember(owner = "EUDZGBGU", name = "b", descriptor = "(I)V")
    public void method92(int arg0) {
        if (arg0 != 9) {
            this.field751 = !this.field751;
        }
    }

    @OriginalMember(owner = "EUDZGBGU", name = "c", descriptor = "(I)V")
    public void method53(int arg0) {
        while (arg0 >= 0) {
            this.field748 = -197;
        }
    }

    @OriginalMember(owner = "EUDZGBGU", name = "a", descriptor = "(B)V")
    public void method182(byte arg0) {
        if (arg0 != 5) {
            this.field752 = !this.field752;
        }
    }

    @OriginalMember(owner = "EUDZGBGU", name = "b", descriptor = "(B)V")
    public void method91(byte arg0) {
        if (arg0 == -8) {
            ;
        }
    }

    @OriginalMember(owner = "EUDZGBGU", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public Component method107(int arg0) {
        if (arg0 != 4) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field764 == null ? this : this.field764;
    }

    @OriginalMember(owner = "EUDZGBGU", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method47(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "EUDZGBGU", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public void method142(int arg0, String arg1, int arg2) {
        while (this.field761 == null) {
            this.field761 = this.method107(4).getGraphics();
            try {
                this.method107(4).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method107(4).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method107(4).getFontMetrics(var6);
        if (this.field765) {
            this.field761.setColor(Color.black);
            this.field761.fillRect(0, 0, this.field759, this.field760);
            this.field765 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field760 / 2 - 18;
        this.field761.setColor(var7);
        this.field761.drawRect(this.field759 / 2 - 152, var8, 304, 34);
        this.field761.fillRect(this.field759 / 2 - 150, var8 + 2, arg0 * 3, 30);
        this.field761.setColor(Color.black);
        this.field761.fillRect(arg0 * 3 + this.field759 / 2 - 150, var8 + 2, 300 - arg0 * 3, 30);
        this.field761.setFont(var4);
        this.field761.setColor(Color.white);
        this.field761.drawString(arg1, (this.field759 - var5.stringWidth(arg1)) / 2, var8 + 22);
        if (arg2 != 9) {
            this.field749 = !this.field749;
        }
    }
}
