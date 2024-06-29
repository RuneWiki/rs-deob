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

@OriginalClass("client!EBSHSFRY")
public class class13 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!EBSHSFRY", name = "a", descriptor = "Z")
    private boolean field781 = true;

    @OriginalMember(owner = "client!EBSHSFRY", name = "b", descriptor = "Z")
    private boolean field782 = true;

    @OriginalMember(owner = "client!EBSHSFRY", name = "c", descriptor = "B")
    private byte field783 = 4;

    @OriginalMember(owner = "client!EBSHSFRY", name = "d", descriptor = "I")
    private int field784 = 474;

    @OriginalMember(owner = "client!EBSHSFRY", name = "f", descriptor = "I")
    private int field786 = 148;

    @OriginalMember(owner = "client!EBSHSFRY", name = "h", descriptor = "I")
    private int field788 = 20;

    @OriginalMember(owner = "client!EBSHSFRY", name = "i", descriptor = "I")
    public int field789 = 1;

    @OriginalMember(owner = "client!EBSHSFRY", name = "j", descriptor = "[J")
    private long[] field790 = new long[10];

    @OriginalMember(owner = "client!EBSHSFRY", name = "l", descriptor = "Z")
    public boolean field792 = false;

    @OriginalMember(owner = "client!EBSHSFRY", name = "q", descriptor = "[LVZJVQLEE;")
    public class59[] field797 = new class59[6];

    @OriginalMember(owner = "client!EBSHSFRY", name = "s", descriptor = "Z")
    public boolean field799 = true;

    @OriginalMember(owner = "client!EBSHSFRY", name = "t", descriptor = "Z")
    public boolean field800 = true;

    @OriginalMember(owner = "client!EBSHSFRY", name = "G", descriptor = "[I")
    public int[] field813 = new int[128];

    @OriginalMember(owner = "client!EBSHSFRY", name = "H", descriptor = "[I")
    private int[] field814 = new int[128];

    @OriginalMember(owner = "client!EBSHSFRY", name = "e", descriptor = "I")
    private int field785;

    @OriginalMember(owner = "client!EBSHSFRY", name = "g", descriptor = "I")
    private int field787;

    @OriginalMember(owner = "client!EBSHSFRY", name = "k", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!EBSHSFRY", name = "m", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!EBSHSFRY", name = "n", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!EBSHSFRY", name = "u", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "client!EBSHSFRY", name = "v", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "client!EBSHSFRY", name = "w", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "client!EBSHSFRY", name = "x", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "client!EBSHSFRY", name = "y", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!EBSHSFRY", name = "z", descriptor = "I")
    public int field806;

    @OriginalMember(owner = "client!EBSHSFRY", name = "A", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "client!EBSHSFRY", name = "C", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!EBSHSFRY", name = "D", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "client!EBSHSFRY", name = "E", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "client!EBSHSFRY", name = "I", descriptor = "I")
    private int field815;

    @OriginalMember(owner = "client!EBSHSFRY", name = "J", descriptor = "I")
    private int field816;

    @OriginalMember(owner = "client!EBSHSFRY", name = "K", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!EBSHSFRY", name = "B", descriptor = "J")
    public long field808;

    @OriginalMember(owner = "client!EBSHSFRY", name = "F", descriptor = "J")
    public long field812;

    @OriginalMember(owner = "client!EBSHSFRY", name = "r", descriptor = "LGDXGVBDZ;")
    public class22 field798;

    @OriginalMember(owner = "client!EBSHSFRY", name = "p", descriptor = "LHURULSIZ;")
    public class25 field796;

    @OriginalMember(owner = "client!EBSHSFRY", name = "o", descriptor = "Ljava/awt/Graphics;")
    public Graphics field795;

    @OriginalMember(owner = "client!EBSHSFRY", name = "a", descriptor = "(IBI)V")
    public final void method246(int arg0, byte arg1, int arg2) {
        this.field793 = arg2;
        this.field794 = arg0;
        this.field798 = new class22(this.field793, this.field794, this, true);
        if (this.field783 == arg1) {
            boolean var4 = false;
        } else {
            this.field786 = -105;
        }
        this.field795 = this.method65(true).getGraphics();
        this.field796 = new class25(this.field794, this.field793, this.method65(true), this.field785);
        this.method58(this, 1);
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "b", descriptor = "(IBI)V")
    public final void method247(int arg0, byte arg1, int arg2) {
        this.field793 = arg2;
        this.field794 = arg0;
        this.field795 = this.method65(true).getGraphics();
        if (arg1 == 5) {
            boolean var4 = false;
        } else {
            this.field786 = 7;
        }
        this.field796 = new class25(this.field794, this.field793, this.method65(true), this.field785);
        this.method58(this, 1);
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "run", descriptor = "()V")
    public void run() {
        this.method65(true).addMouseListener(this);
        this.method65(true).addMouseMotionListener(this);
        this.method65(true).addKeyListener(this);
        this.method65(true).addFocusListener(this);
        if (this.field798 != null) {
            this.field798.addWindowListener(this);
        }
        this.method51(0, "Loading...", -71);
        this.method113();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field790[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field787 < 0) {
                    if (this.field787 == -1) {
                        this.method248(false);
                    }
                    if (class45.field1317) {
                    }
                    return;
                }
                if (this.field787 > 0) {
                    this.field787--;
                    if (this.field787 == 0) {
                        this.method248(false);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field790[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field790[var1]) {
                    var2 = (int) ((long) (this.field788 * 2560) / (var11 - this.field790[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field788 - (var11 - this.field790[var1]) / 10L);
                }
                if (var3 > this.field788) {
                    var3 = this.field788;
                }
                this.field790[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field790[var13] != 0L) {
                            this.field790[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field789) {
                    var3 = this.field789;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field809 = this.field805;
                    this.field810 = this.field806;
                    this.field811 = this.field807;
                    this.field812 = this.field808;
                    this.field805 = 0;
                    this.method140(this.field784);
                    this.field815 = this.field816;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field788 > 0) {
                    this.field791 = var2 * 1000 / (this.field788 * 256);
                }
                this.method30(0);
            } while (!this.field792);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field790[var15]);
            }
            System.out.println("fps:" + this.field791 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field788 + " mindel:" + this.field789);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field792 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "a", descriptor = "(Z)V")
    public final void method248(boolean arg0) {
        if (arg0) {
            return;
        }
        this.field787 = -2;
        this.method123(1);
        if (this.field798 == null) {
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

    @OriginalMember(owner = "client!EBSHSFRY", name = "a", descriptor = "(II)V")
    public final void method249(int arg0, int arg1) {
        this.field788 = 1000 / arg0;
        while (arg1 >= 0) {
            this.field782 = !this.field782;
        }
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field787 >= 0) {
            this.field787 = 0;
        }
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field787 >= 0) {
            this.field787 = 4000 / this.field788;
        }
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field787 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field787 == -1) {
            this.method248(false);
        }
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field795 == null) {
            this.field795 = arg0;
        }
        this.field799 = true;
        this.method60(-83);
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field795 == null) {
            this.field795 = arg0;
        }
        this.field799 = true;
        this.method60(-83);
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field798 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field801 = 0;
        this.field806 = var2;
        this.field807 = var3;
        this.field808 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field805 = 2;
            this.field802 = 2;
        } else {
            this.field805 = 1;
            this.field802 = 1;
        }
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field801 = 0;
        this.field802 = 0;
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field801 = 0;
        this.field803 = -1;
        this.field804 = -1;
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field798 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field801 = 0;
        this.field803 = var2;
        this.field804 = var3;
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field798 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field801 = 0;
        this.field803 = var2;
        this.field804 = var3;
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field801 = 0;
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
            this.field813[var3] = 1;
        }
        if (var3 > 4) {
            this.field814[this.field816] = var3;
            this.field816 = this.field816 + 1 & 0x7F;
        }
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field801 = 0;
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
            this.field813[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "b", descriptor = "(Z)I")
    public final int method250(boolean arg0) {
        if (!arg0) {
            return 2;
        }
        int var2 = -1;
        if (this.field816 != this.field815) {
            var2 = this.field814[this.field815];
            this.field815 = this.field815 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field800 = true;
        this.field799 = true;
        this.method60(-83);
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field800 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field813[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "a", descriptor = "()V")
    public void method113() {
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "a", descriptor = "(I)V")
    public void method140(int arg0) {
        int var2 = 31 / arg0;
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "b", descriptor = "(I)V")
    public void method123(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            ;
        }
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "c", descriptor = "(I)V")
    public void method30(int arg0) {
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "d", descriptor = "(I)V")
    public void method60(int arg0) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "c", descriptor = "(Z)Ljava/awt/Component;")
    public Component method65(boolean arg0) {
        if (!arg0) {
            this.field781 = !this.field781;
        }
        return this.field798 == null ? this : this.field798;
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method58(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!EBSHSFRY", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public void method51(int arg0, String arg1, int arg2) {
        if (arg2 >= 0) {
            return;
        }
        while (this.field795 == null) {
            this.field795 = this.method65(true).getGraphics();
            try {
                this.method65(true).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method65(true).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method65(true).getFontMetrics(var6);
        if (this.field799) {
            this.field795.setColor(Color.black);
            this.field795.fillRect(0, 0, this.field793, this.field794);
            this.field799 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field794 / 2 - 18;
        this.field795.setColor(var7);
        this.field795.drawRect(this.field793 / 2 - 152, var8, 304, 34);
        this.field795.fillRect(this.field793 / 2 - 150, var8 + 2, arg0 * 3, 30);
        this.field795.setColor(Color.black);
        this.field795.fillRect(arg0 * 3 + this.field793 / 2 - 150, var8 + 2, 300 - arg0 * 3, 30);
        this.field795.setFont(var4);
        this.field795.setColor(Color.white);
        this.field795.drawString(arg1, (this.field793 - var5.stringWidth(arg1)) / 2, var8 + 22);
    }
}
