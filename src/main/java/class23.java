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

@OriginalClass("GYSHSTYO")
public class class23 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "GYSHSTYO", name = "a", descriptor = "I")
    private int field791 = 431;

    @OriginalMember(owner = "GYSHSTYO", name = "b", descriptor = "Z")
    private boolean field792 = false;

    @OriginalMember(owner = "GYSHSTYO", name = "c", descriptor = "Z")
    private boolean field793 = false;

    @OriginalMember(owner = "GYSHSTYO", name = "d", descriptor = "I")
    private int field794 = 6;

    @OriginalMember(owner = "GYSHSTYO", name = "g", descriptor = "I")
    private int field797 = 20;

    @OriginalMember(owner = "GYSHSTYO", name = "h", descriptor = "I")
    public int field798 = 1;

    @OriginalMember(owner = "GYSHSTYO", name = "i", descriptor = "[J")
    private long[] field799 = new long[10];

    @OriginalMember(owner = "GYSHSTYO", name = "k", descriptor = "Z")
    public boolean field801 = false;

    @OriginalMember(owner = "GYSHSTYO", name = "p", descriptor = "[LVDSDFSIV;")
    public class57[] field806 = new class57[6];

    @OriginalMember(owner = "GYSHSTYO", name = "r", descriptor = "Z")
    public boolean field808 = true;

    @OriginalMember(owner = "GYSHSTYO", name = "s", descriptor = "Z")
    public boolean field809 = true;

    @OriginalMember(owner = "GYSHSTYO", name = "F", descriptor = "[I")
    public int[] field822 = new int[128];

    @OriginalMember(owner = "GYSHSTYO", name = "G", descriptor = "[I")
    private int[] field823 = new int[128];

    @OriginalMember(owner = "GYSHSTYO", name = "e", descriptor = "I")
    private int field795;

    @OriginalMember(owner = "GYSHSTYO", name = "f", descriptor = "I")
    private int field796;

    @OriginalMember(owner = "GYSHSTYO", name = "j", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "GYSHSTYO", name = "l", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "GYSHSTYO", name = "m", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "GYSHSTYO", name = "t", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "GYSHSTYO", name = "u", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "GYSHSTYO", name = "v", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "GYSHSTYO", name = "w", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "GYSHSTYO", name = "x", descriptor = "I")
    public int field814;

    @OriginalMember(owner = "GYSHSTYO", name = "y", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "GYSHSTYO", name = "z", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "GYSHSTYO", name = "B", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "GYSHSTYO", name = "C", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "GYSHSTYO", name = "D", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "GYSHSTYO", name = "H", descriptor = "I")
    private int field824;

    @OriginalMember(owner = "GYSHSTYO", name = "I", descriptor = "I")
    private int field825;

    @OriginalMember(owner = "GYSHSTYO", name = "J", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "GYSHSTYO", name = "A", descriptor = "J")
    public long field817;

    @OriginalMember(owner = "GYSHSTYO", name = "E", descriptor = "J")
    public long field821;

    @OriginalMember(owner = "GYSHSTYO", name = "o", descriptor = "LCMDDPBTD;")
    public class6 field805;

    @OriginalMember(owner = "GYSHSTYO", name = "q", descriptor = "LCYMTUWTR;")
    public class8 field807;

    @OriginalMember(owner = "GYSHSTYO", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics field804;

    @OriginalMember(owner = "GYSHSTYO", name = "a", descriptor = "(IZI)V")
    public final void method284(int arg0, boolean arg1, int arg2) {
        this.field802 = arg2;
        this.field803 = arg0;
        this.field807 = new class8(323, this.field802, this.field803, this);
        if (!arg1) {
            this.field804 = this.method140(9).getGraphics();
            this.field805 = new class6(this.field803, this.method140(9), (byte) 47, this.field802);
            this.method93(this, 1);
        }
    }

    @OriginalMember(owner = "GYSHSTYO", name = "a", descriptor = "(III)V")
    public final void method285(int arg0, int arg1, int arg2) {
        this.field802 = arg2;
        this.field803 = arg0;
        if (arg1 != -8753) {
            this.field791 = -498;
        }
        this.field804 = this.method140(9).getGraphics();
        this.field805 = new class6(this.field803, this.method140(9), (byte) 47, this.field802);
        this.method93(this, 1);
    }

    @OriginalMember(owner = "GYSHSTYO", name = "run", descriptor = "()V")
    public void run() {
        this.method140(9).addMouseListener(this);
        this.method140(9).addMouseMotionListener(this);
        this.method140(9).addKeyListener(this);
        this.method140(9).addFocusListener(this);
        if (this.field807 != null) {
            this.field807.addWindowListener(this);
        }
        this.method110("Loading...", 0, (byte) -27);
        this.method114();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field799[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field796 < 0) {
                    if (this.field796 == -1) {
                        this.method286(false);
                    }
                    return;
                }
                if (this.field796 > 0) {
                    this.field796--;
                    if (this.field796 == 0) {
                        this.method286(false);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field799[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field799[var1]) {
                    var2 = (int) ((long) (this.field797 * 2560) / (var11 - this.field799[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field797 - (var11 - this.field799[var1]) / 10L);
                }
                if (var3 > this.field797) {
                    var3 = this.field797;
                }
                this.field799[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field799[var13] != 0L) {
                            this.field799[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field798) {
                    var3 = this.field798;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field818 = this.field814;
                    this.field819 = this.field815;
                    this.field820 = this.field816;
                    this.field821 = this.field817;
                    this.field814 = 0;
                    this.method156(this.field795);
                    this.field824 = this.field825;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field797 > 0) {
                    this.field800 = var2 * 1000 / (this.field797 * 256);
                }
                this.method92(-16092);
            } while (!this.field801);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field799[var15]);
            }
            System.out.println("fps:" + this.field800 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field797 + " mindel:" + this.field798);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field801 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "GYSHSTYO", name = "a", descriptor = "(Z)V")
    public final void method286(boolean arg0) {
        this.field796 = -2;
        this.method36(0);
        if (arg0 || this.field807 == null) {
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

    @OriginalMember(owner = "GYSHSTYO", name = "a", descriptor = "(II)V")
    public final void method287(int arg0, int arg1) {
        this.field797 = 1000 / arg1;
        int var3 = 41 / arg0;
    }

    @OriginalMember(owner = "GYSHSTYO", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field796 >= 0) {
            this.field796 = 0;
        }
    }

    @OriginalMember(owner = "GYSHSTYO", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field796 >= 0) {
            this.field796 = 4000 / this.field797;
        }
    }

    @OriginalMember(owner = "GYSHSTYO", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field796 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field796 == -1) {
            this.method286(false);
        }
    }

    @OriginalMember(owner = "GYSHSTYO", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field804 == null) {
            this.field804 = arg0;
        }
        this.field808 = true;
        this.method68((byte) 2);
    }

    @OriginalMember(owner = "GYSHSTYO", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field804 == null) {
            this.field804 = arg0;
        }
        this.field808 = true;
        this.method68((byte) 2);
    }

    @OriginalMember(owner = "GYSHSTYO", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field807 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field810 = 0;
        this.field815 = var2;
        this.field816 = var3;
        this.field817 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field814 = 2;
            this.field811 = 2;
        } else {
            this.field814 = 1;
            this.field811 = 1;
        }
    }

    @OriginalMember(owner = "GYSHSTYO", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field810 = 0;
        this.field811 = 0;
    }

    @OriginalMember(owner = "GYSHSTYO", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "GYSHSTYO", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "GYSHSTYO", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field810 = 0;
        this.field812 = -1;
        this.field813 = -1;
    }

    @OriginalMember(owner = "GYSHSTYO", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field807 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field810 = 0;
        this.field812 = var2;
        this.field813 = var3;
    }

    @OriginalMember(owner = "GYSHSTYO", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field807 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field810 = 0;
        this.field812 = var2;
        this.field813 = var3;
    }

    @OriginalMember(owner = "GYSHSTYO", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field810 = 0;
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
            this.field822[var3] = 1;
        }
        if (var3 > 4) {
            this.field823[this.field825] = var3;
            this.field825 = this.field825 + 1 & 0x7F;
        }
        if (class54.field1472) {
        }
    }

    @OriginalMember(owner = "GYSHSTYO", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field810 = 0;
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
            this.field822[var3] = 0;
        }
    }

    @OriginalMember(owner = "GYSHSTYO", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "GYSHSTYO", name = "a", descriptor = "(I)I")
    public final int method288(int arg0) {
        int var2 = -1;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field825 != this.field824) {
            var2 = this.field823[this.field824];
            this.field824 = this.field824 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "GYSHSTYO", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field809 = true;
        this.field808 = true;
        this.method68((byte) 2);
    }

    @OriginalMember(owner = "GYSHSTYO", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field809 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field822[var2] = 0;
        }
    }

    @OriginalMember(owner = "GYSHSTYO", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "GYSHSTYO", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "GYSHSTYO", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "GYSHSTYO", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "GYSHSTYO", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "GYSHSTYO", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "GYSHSTYO", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "GYSHSTYO", name = "a", descriptor = "()V")
    public void method114() {
    }

    @OriginalMember(owner = "GYSHSTYO", name = "b", descriptor = "(I)V")
    public void method156(int arg0) {
        if (arg0 != 0) {
            this.field794 = 388;
        }
    }

    @OriginalMember(owner = "GYSHSTYO", name = "c", descriptor = "(I)V")
    public void method36(int arg0) {
        if (arg0 != 0) {
            this.field792 = !this.field792;
        }
    }

    @OriginalMember(owner = "GYSHSTYO", name = "d", descriptor = "(I)V")
    public void method92(int arg0) {
        if (arg0 != -16092) {
            this.field791 = 371;
        }
    }

    @OriginalMember(owner = "GYSHSTYO", name = "a", descriptor = "(B)V")
    public void method68(byte arg0) {
        if (arg0 == 2) {
            ;
        }
    }

    @OriginalMember(owner = "GYSHSTYO", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public Component method140(int arg0) {
        if (arg0 < 9 || arg0 > 9) {
            this.field793 = !this.field793;
        }
        return this.field807 == null ? this : this.field807;
    }

    @OriginalMember(owner = "GYSHSTYO", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method93(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "GYSHSTYO", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public void method110(String arg0, int arg1, byte arg2) {
        while (this.field804 == null) {
            this.field804 = this.method140(9).getGraphics();
            try {
                this.method140(9).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method140(9).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method140(9).getFontMetrics(var6);
        if (this.field808) {
            this.field804.setColor(Color.black);
            this.field804.fillRect(0, 0, this.field802, this.field803);
            this.field808 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field803 / 2 - 18;
        this.field804.setColor(var7);
        this.field804.drawRect(this.field802 / 2 - 152, var8, 304, 34);
        this.field804.fillRect(this.field802 / 2 - 150, var8 + 2, arg1 * 3, 30);
        this.field804.setColor(Color.black);
        this.field804.fillRect(arg1 * 3 + this.field802 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field804.setFont(var4);
        if (arg2 == -27) {
            this.field804.setColor(Color.white);
            this.field804.drawString(arg0, (this.field802 - var5.stringWidth(arg0)) / 2, var8 + 22);
        }
    }
}
