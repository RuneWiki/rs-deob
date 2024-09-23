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

@OriginalClass("ITJBTECW")
public class class22 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "ITJBTECW", name = "a", descriptor = "I")
    private int field901 = 6;

    @OriginalMember(owner = "ITJBTECW", name = "b", descriptor = "Z")
    private boolean field902 = false;

    @OriginalMember(owner = "ITJBTECW", name = "c", descriptor = "I")
    private int field903 = -19353;

    @OriginalMember(owner = "ITJBTECW", name = "d", descriptor = "B")
    private byte field904 = 7;

    @OriginalMember(owner = "ITJBTECW", name = "e", descriptor = "B")
    private byte field905 = 0;

    @OriginalMember(owner = "ITJBTECW", name = "f", descriptor = "I")
    private int field906 = 8;

    @OriginalMember(owner = "ITJBTECW", name = "g", descriptor = "Z")
    private boolean field907 = true;

    @OriginalMember(owner = "ITJBTECW", name = "h", descriptor = "Z")
    private boolean field908 = false;

    @OriginalMember(owner = "ITJBTECW", name = "j", descriptor = "I")
    private int field910 = 20;

    @OriginalMember(owner = "ITJBTECW", name = "k", descriptor = "I")
    public int field911 = 1;

    @OriginalMember(owner = "ITJBTECW", name = "l", descriptor = "[J")
    private long[] field912 = new long[10];

    @OriginalMember(owner = "ITJBTECW", name = "n", descriptor = "Z")
    public boolean field914 = false;

    @OriginalMember(owner = "ITJBTECW", name = "s", descriptor = "[LLXRBRCRX;")
    public class30[] field919 = new class30[6];

    @OriginalMember(owner = "ITJBTECW", name = "u", descriptor = "Z")
    public boolean field921 = true;

    @OriginalMember(owner = "ITJBTECW", name = "v", descriptor = "Z")
    public boolean field922 = true;

    @OriginalMember(owner = "ITJBTECW", name = "I", descriptor = "[I")
    public int[] field935 = new int[128];

    @OriginalMember(owner = "ITJBTECW", name = "J", descriptor = "[I")
    private int[] field936 = new int[128];

    @OriginalMember(owner = "ITJBTECW", name = "i", descriptor = "I")
    private int field909;

    @OriginalMember(owner = "ITJBTECW", name = "m", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "ITJBTECW", name = "o", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "ITJBTECW", name = "p", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "ITJBTECW", name = "w", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "ITJBTECW", name = "x", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "ITJBTECW", name = "y", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "ITJBTECW", name = "z", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "ITJBTECW", name = "A", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "ITJBTECW", name = "B", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "ITJBTECW", name = "C", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "ITJBTECW", name = "E", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "ITJBTECW", name = "F", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "ITJBTECW", name = "G", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "ITJBTECW", name = "K", descriptor = "I")
    private int field937;

    @OriginalMember(owner = "ITJBTECW", name = "L", descriptor = "I")
    private int field938;

    @OriginalMember(owner = "ITJBTECW", name = "M", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "ITJBTECW", name = "D", descriptor = "J")
    public long field930;

    @OriginalMember(owner = "ITJBTECW", name = "H", descriptor = "J")
    public long field934;

    @OriginalMember(owner = "ITJBTECW", name = "r", descriptor = "LECAKBTRA;")
    public class16 field918;

    @OriginalMember(owner = "ITJBTECW", name = "t", descriptor = "LCGMKGPCO;")
    public class5 field920;

    @OriginalMember(owner = "ITJBTECW", name = "q", descriptor = "Ljava/awt/Graphics;")
    public Graphics field917;

    @OriginalMember(owner = "ITJBTECW", name = "a", descriptor = "(III)V")
    public final void method231(int arg0, int arg1, int arg2) {
        this.field915 = arg1;
        if (this.field903 != arg0) {
            this.field907 = !this.field907;
        }
        this.field916 = arg2;
        this.field920 = new class5(this.field915, this.field916, (byte) -103, this);
        this.field917 = this.method49(8).getGraphics();
        this.field918 = new class16(this.field916, this.method49(8), true, this.field915);
        this.method124(this, 1);
    }

    @OriginalMember(owner = "ITJBTECW", name = "b", descriptor = "(III)V")
    public final void method232(int arg0, int arg1, int arg2) {
        this.field915 = arg1;
        while (arg0 >= 0) {
            this.field902 = !this.field902;
        }
        this.field916 = arg2;
        this.field917 = this.method49(8).getGraphics();
        this.field918 = new class16(this.field916, this.method49(8), true, this.field915);
        this.method124(this, 1);
    }

    @OriginalMember(owner = "ITJBTECW", name = "run", descriptor = "()V")
    public void run() {
        this.method49(8).addMouseListener(this);
        this.method49(8).addMouseMotionListener(this);
        this.method49(8).addKeyListener(this);
        this.method49(8).addFocusListener(this);
        if (this.field920 != null) {
            this.field920.addWindowListener(this);
        }
        this.method81(0, -947, "Loading...");
        this.method173();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field912[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field909 < 0) {
                    if (this.field909 == -1) {
                        this.method233(-375);
                    }
                    return;
                }
                if (this.field909 > 0) {
                    this.field909--;
                    if (this.field909 == 0) {
                        this.method233(-375);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field912[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field912[var1]) {
                    var2 = (int) ((long) (this.field910 * 2560) / (var11 - this.field912[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field910 - (var11 - this.field912[var1]) / 10L);
                }
                if (var3 > this.field910) {
                    var3 = this.field910;
                }
                this.field912[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field912[var13] != 0L) {
                            this.field912[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field911) {
                    var3 = this.field911;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field931 = this.field927;
                    this.field932 = this.field928;
                    this.field933 = this.field929;
                    this.field934 = this.field930;
                    this.field927 = 0;
                    this.method169(-723);
                    this.field937 = this.field938;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field910 > 0) {
                    this.field913 = var2 * 1000 / (this.field910 * 256);
                }
                this.method160(0);
            } while (!this.field914);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field912[var15]);
            }
            System.out.println("fps:" + this.field913 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field910 + " mindel:" + this.field911);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field914 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "ITJBTECW", name = "a", descriptor = "(I)V")
    public final void method233(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        this.field909 = -2;
        this.method141(this.field904);
        if (this.field920 == null) {
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

    @OriginalMember(owner = "ITJBTECW", name = "a", descriptor = "(IZ)V")
    public final void method234(int arg0, boolean arg1) {
        if (!arg1) {
            this.field903 = -380;
        }
        this.field910 = 1000 / arg0;
    }

    @OriginalMember(owner = "ITJBTECW", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field909 >= 0) {
            this.field909 = 0;
        }
    }

    @OriginalMember(owner = "ITJBTECW", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field909 >= 0) {
            this.field909 = 4000 / this.field910;
        }
    }

    @OriginalMember(owner = "ITJBTECW", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field909 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field909 == -1) {
            this.method233(-375);
        }
    }

    @OriginalMember(owner = "ITJBTECW", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field917 == null) {
            this.field917 = arg0;
        }
        this.field921 = true;
        this.method79(this.field905);
    }

    @OriginalMember(owner = "ITJBTECW", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field917 == null) {
            this.field917 = arg0;
        }
        this.field921 = true;
        this.method79(this.field905);
    }

    @OriginalMember(owner = "ITJBTECW", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field920 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field923 = 0;
        this.field928 = var2;
        this.field929 = var3;
        this.field930 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field927 = 2;
            this.field924 = 2;
        } else {
            this.field927 = 1;
            this.field924 = 1;
        }
    }

    @OriginalMember(owner = "ITJBTECW", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field923 = 0;
        this.field924 = 0;
    }

    @OriginalMember(owner = "ITJBTECW", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "ITJBTECW", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "ITJBTECW", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field923 = 0;
        this.field925 = -1;
        this.field926 = -1;
    }

    @OriginalMember(owner = "ITJBTECW", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field920 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field923 = 0;
        this.field925 = var2;
        this.field926 = var3;
    }

    @OriginalMember(owner = "ITJBTECW", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field920 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field923 = 0;
        this.field925 = var2;
        this.field926 = var3;
    }

    @OriginalMember(owner = "ITJBTECW", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field923 = 0;
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
            this.field935[var3] = 1;
        }
        if (var3 > 4) {
            this.field936[this.field938] = var3;
            this.field938 = this.field938 + 1 & 0x7F;
        }
    }

    @OriginalMember(owner = "ITJBTECW", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field923 = 0;
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
            this.field935[var3] = 0;
        }
    }

    @OriginalMember(owner = "ITJBTECW", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "ITJBTECW", name = "b", descriptor = "(I)I")
    public final int method235(int arg0) {
        int var2 = -1;
        if (arg0 != 47275) {
            this.field908 = !this.field908;
        }
        if (this.field938 != this.field937) {
            var2 = this.field936[this.field937];
            this.field937 = this.field937 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "ITJBTECW", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field922 = true;
        this.field921 = true;
        this.method79(this.field905);
    }

    @OriginalMember(owner = "ITJBTECW", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field922 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field935[var2] = 0;
        }
    }

    @OriginalMember(owner = "ITJBTECW", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "ITJBTECW", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "ITJBTECW", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "ITJBTECW", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "ITJBTECW", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "ITJBTECW", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "ITJBTECW", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "ITJBTECW", name = "a", descriptor = "()V")
    public void method173() {
    }

    @OriginalMember(owner = "ITJBTECW", name = "c", descriptor = "(I)V")
    public void method169(int arg0) {
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "ITJBTECW", name = "a", descriptor = "(B)V")
    public void method141(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
        }
    }

    @OriginalMember(owner = "ITJBTECW", name = "d", descriptor = "(I)V")
    public void method160(int arg0) {
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "ITJBTECW", name = "b", descriptor = "(B)V")
    public void method79(byte arg0) {
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "ITJBTECW", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public Component method49(int arg0) {
        if (arg0 < this.field906 || arg0 > this.field906) {
            this.field901 = -256;
        }
        return this.field920 == null ? this : this.field920;
    }

    @OriginalMember(owner = "ITJBTECW", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method124(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "ITJBTECW", name = "a", descriptor = "(IILjava/lang/String;)V")
    public void method81(int arg0, int arg1, String arg2) {
        while (this.field917 == null) {
            this.field917 = this.method49(8).getGraphics();
            try {
                this.method49(8).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method49(8).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method49(8).getFontMetrics(var6);
        if (this.field921) {
            this.field917.setColor(Color.black);
            this.field917.fillRect(0, 0, this.field915, this.field916);
            this.field921 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field916 / 2 - 18;
        if (arg1 >= 0) {
            return;
        }
        this.field917.setColor(var7);
        this.field917.drawRect(this.field915 / 2 - 152, var8, 304, 34);
        this.field917.fillRect(this.field915 / 2 - 150, var8 + 2, arg0 * 3, 30);
        this.field917.setColor(Color.black);
        this.field917.fillRect(arg0 * 3 + this.field915 / 2 - 150, var8 + 2, 300 - arg0 * 3, 30);
        this.field917.setFont(var4);
        this.field917.setColor(Color.white);
        this.field917.drawString(arg2, (this.field915 - var5.stringWidth(arg2)) / 2, var8 + 22);
    }

    @OriginalMember(owner = "ITJBTECW", name = "<init>", descriptor = "()V")
    public class22() {
        if (class72.field1737) {
        }
    }
}
