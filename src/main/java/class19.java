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

@OriginalClass("FDVCDUHZ")
public class class19 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "FDVCDUHZ", name = "a", descriptor = "Z")
    private boolean field791 = false;

    @OriginalMember(owner = "FDVCDUHZ", name = "b", descriptor = "Z")
    private boolean field792 = true;

    @OriginalMember(owner = "FDVCDUHZ", name = "d", descriptor = "I")
    private int field794 = 654;

    @OriginalMember(owner = "FDVCDUHZ", name = "f", descriptor = "I")
    private int field796 = 20;

    @OriginalMember(owner = "FDVCDUHZ", name = "g", descriptor = "I")
    public int field797 = 1;

    @OriginalMember(owner = "FDVCDUHZ", name = "h", descriptor = "[J")
    private long[] field798 = new long[10];

    @OriginalMember(owner = "FDVCDUHZ", name = "j", descriptor = "Z")
    public boolean field800 = false;

    @OriginalMember(owner = "FDVCDUHZ", name = "o", descriptor = "[LXKULRNBA;")
    public class65[] field805 = new class65[6];

    @OriginalMember(owner = "FDVCDUHZ", name = "q", descriptor = "Z")
    public boolean field807 = true;

    @OriginalMember(owner = "FDVCDUHZ", name = "r", descriptor = "Z")
    public boolean field808 = true;

    @OriginalMember(owner = "FDVCDUHZ", name = "E", descriptor = "[I")
    public int[] field821 = new int[128];

    @OriginalMember(owner = "FDVCDUHZ", name = "F", descriptor = "[I")
    private int[] field822 = new int[128];

    @OriginalMember(owner = "FDVCDUHZ", name = "c", descriptor = "I")
    private int field793;

    @OriginalMember(owner = "FDVCDUHZ", name = "e", descriptor = "I")
    private int field795;

    @OriginalMember(owner = "FDVCDUHZ", name = "i", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "FDVCDUHZ", name = "k", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "FDVCDUHZ", name = "l", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "FDVCDUHZ", name = "s", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "FDVCDUHZ", name = "t", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "FDVCDUHZ", name = "u", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "FDVCDUHZ", name = "v", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "FDVCDUHZ", name = "w", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "FDVCDUHZ", name = "x", descriptor = "I")
    public int field814;

    @OriginalMember(owner = "FDVCDUHZ", name = "y", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "FDVCDUHZ", name = "A", descriptor = "I")
    public int field817;

    @OriginalMember(owner = "FDVCDUHZ", name = "B", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "FDVCDUHZ", name = "C", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "FDVCDUHZ", name = "G", descriptor = "I")
    private int field823;

    @OriginalMember(owner = "FDVCDUHZ", name = "H", descriptor = "I")
    private int field824;

    @OriginalMember(owner = "FDVCDUHZ", name = "I", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "FDVCDUHZ", name = "z", descriptor = "J")
    public long field816;

    @OriginalMember(owner = "FDVCDUHZ", name = "D", descriptor = "J")
    public long field820;

    @OriginalMember(owner = "FDVCDUHZ", name = "n", descriptor = "LLWAVUJVV;")
    public class39 field804;

    @OriginalMember(owner = "FDVCDUHZ", name = "p", descriptor = "LNYZFOQAO;")
    public class46 field806;

    @OriginalMember(owner = "FDVCDUHZ", name = "m", descriptor = "Ljava/awt/Graphics;")
    public Graphics field803;

    @OriginalMember(owner = "FDVCDUHZ", name = "a", descriptor = "(III)V")
    public final void method252(int arg0, int arg1, int arg2) {
        this.field801 = arg2;
        this.field802 = arg1;
        if (arg0 >= 0) {
            this.field793 = -135;
        }
        this.field806 = new class46(this.field801, this.field802, this, -14612);
        this.field803 = this.method136(0).getGraphics();
        this.field804 = new class39(this.field801, this.field802, this.method136(0), 0);
        this.method113(this, 1);
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "a", descriptor = "(IZI)V")
    public final void method253(int arg0, boolean arg1, int arg2) {
        this.field801 = arg2;
        this.field802 = arg0;
        this.field803 = this.method136(0).getGraphics();
        this.field804 = new class39(this.field801, this.field802, this.method136(0), 0);
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.method113(this, 1);
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "run", descriptor = "()V")
    public void run() {
        this.method136(0).addMouseListener(this);
        this.method136(0).addMouseMotionListener(this);
        this.method136(0).addKeyListener(this);
        this.method136(0).addFocusListener(this);
        if (this.field806 != null) {
            this.field806.addWindowListener(this);
        }
        this.method120("Loading...", 0, 7);
        this.method149();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field798[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field795 < 0) {
                    if (this.field795 == -1) {
                        this.method254(0);
                    }
                    return;
                }
                if (this.field795 > 0) {
                    this.field795--;
                    if (this.field795 == 0) {
                        this.method254(0);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field798[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field798[var1]) {
                    var2 = (int) ((long) (this.field796 * 2560) / (var11 - this.field798[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field796 - (var11 - this.field798[var1]) / 10L);
                }
                if (var3 > this.field796) {
                    var3 = this.field796;
                }
                this.field798[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field798[var13] != 0L) {
                            this.field798[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field797) {
                    var3 = this.field797;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field817 = this.field813;
                    this.field818 = this.field814;
                    this.field819 = this.field815;
                    this.field820 = this.field816;
                    this.field813 = 0;
                    this.method111(-44087);
                    this.field823 = this.field824;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field796 > 0) {
                    this.field799 = var2 * 1000 / (this.field796 * 256);
                }
                this.method114(-767);
            } while (!this.field800);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field798[var15]);
            }
            System.out.println("fps:" + this.field799 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field796 + " mindel:" + this.field797);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field800 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "a", descriptor = "(I)V")
    public final void method254(int arg0) {
        if (arg0 != 0) {
            this.field794 = -352;
        }
        this.field795 = -2;
        this.method52(true);
        if (this.field806 == null) {
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

    @OriginalMember(owner = "FDVCDUHZ", name = "a", descriptor = "(II)V")
    public final void method255(int arg0, int arg1) {
        if (arg1 != 14025) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field796 = 1000 / arg0;
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field795 >= 0) {
            this.field795 = 0;
        }
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field795 >= 0) {
            this.field795 = 4000 / this.field796;
        }
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field795 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field795 == -1) {
            this.method254(0);
        }
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field803 == null) {
            this.field803 = arg0;
        }
        this.field807 = true;
        this.method38(true);
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field803 == null) {
            this.field803 = arg0;
        }
        this.field807 = true;
        this.method38(true);
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field806 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field809 = 0;
        this.field814 = var2;
        this.field815 = var3;
        this.field816 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field813 = 2;
            this.field810 = 2;
        } else {
            this.field813 = 1;
            this.field810 = 1;
        }
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field809 = 0;
        this.field810 = 0;
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field809 = 0;
        this.field811 = -1;
        this.field812 = -1;
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field806 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field809 = 0;
        this.field811 = var2;
        this.field812 = var3;
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field806 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field809 = 0;
        this.field811 = var2;
        this.field812 = var3;
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field809 = 0;
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
            this.field821[var3] = 1;
        }
        if (var3 > 4) {
            this.field822[this.field824] = var3;
            this.field824 = this.field824 + 1 & 0x7F;
        }
        if (class13.field723) {
        }
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field809 = 0;
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
            this.field821[var3] = 0;
        }
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "a", descriptor = "(Z)I")
    public final int method256(boolean arg0) {
        if (arg0) {
            return 3;
        }
        int var2 = -1;
        if (this.field824 != this.field823) {
            var2 = this.field822[this.field823];
            this.field823 = this.field823 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field808 = true;
        this.field807 = true;
        this.method38(true);
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field808 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field821[var2] = 0;
        }
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "a", descriptor = "()V")
    public void method149() {
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "b", descriptor = "(I)V")
    public void method111(int arg0) {
        if (arg0 == -44087) {
            ;
        }
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "b", descriptor = "(Z)V")
    public void method52(boolean arg0) {
        if (!arg0) {
            this.field791 = !this.field791;
        }
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "c", descriptor = "(I)V")
    public void method114(int arg0) {
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "c", descriptor = "(Z)V")
    public void method38(boolean arg0) {
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public Component method136(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field806 == null ? this : this.field806;
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method113(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "FDVCDUHZ", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public void method120(String arg0, int arg1, int arg2) {
        while (this.field803 == null) {
            this.field803 = this.method136(0).getGraphics();
            try {
                this.method136(0).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method136(0).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method136(0).getFontMetrics(var6);
        if (this.field807) {
            this.field803.setColor(Color.black);
            this.field803.fillRect(0, 0, this.field801, this.field802);
            this.field807 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field802 / 2 - 18;
        this.field803.setColor(var7);
        this.field803.drawRect(this.field801 / 2 - 152, var8, 304, 34);
        this.field803.fillRect(this.field801 / 2 - 150, var8 + 2, arg1 * 3, 30);
        this.field803.setColor(Color.black);
        this.field803.fillRect(arg1 * 3 + this.field801 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field803.setFont(var4);
        if (arg2 < 7 || arg2 > 7) {
            this.field792 = !this.field792;
        }
        this.field803.setColor(Color.white);
        this.field803.drawString(arg0, (this.field801 - var5.stringWidth(arg0)) / 2, var8 + 22);
    }
}
