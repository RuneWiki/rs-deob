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

@OriginalClass("client!LJUNUWBY")
public class class31 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "I")
    private int field922 = -397;

    @OriginalMember(owner = "client!LJUNUWBY", name = "b", descriptor = "Z")
    private boolean field923 = true;

    @OriginalMember(owner = "client!LJUNUWBY", name = "c", descriptor = "I")
    private int field924 = 6;

    @OriginalMember(owner = "client!LJUNUWBY", name = "d", descriptor = "Z")
    private boolean field925 = false;

    @OriginalMember(owner = "client!LJUNUWBY", name = "f", descriptor = "I")
    private int field927 = 20;

    @OriginalMember(owner = "client!LJUNUWBY", name = "g", descriptor = "I")
    public int field928 = 1;

    @OriginalMember(owner = "client!LJUNUWBY", name = "h", descriptor = "[J")
    private long[] field929 = new long[10];

    @OriginalMember(owner = "client!LJUNUWBY", name = "j", descriptor = "Z")
    public boolean field931 = false;

    @OriginalMember(owner = "client!LJUNUWBY", name = "o", descriptor = "[LAIRMECOM;")
    public class3[] field936 = new class3[6];

    @OriginalMember(owner = "client!LJUNUWBY", name = "q", descriptor = "Z")
    public boolean field938 = true;

    @OriginalMember(owner = "client!LJUNUWBY", name = "r", descriptor = "Z")
    public boolean field939 = true;

    @OriginalMember(owner = "client!LJUNUWBY", name = "E", descriptor = "[I")
    public int[] field952 = new int[128];

    @OriginalMember(owner = "client!LJUNUWBY", name = "F", descriptor = "[I")
    private int[] field953 = new int[128];

    @OriginalMember(owner = "client!LJUNUWBY", name = "e", descriptor = "I")
    private int field926;

    @OriginalMember(owner = "client!LJUNUWBY", name = "i", descriptor = "I")
    public int field930;

    @OriginalMember(owner = "client!LJUNUWBY", name = "k", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "client!LJUNUWBY", name = "l", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!LJUNUWBY", name = "s", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "client!LJUNUWBY", name = "t", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!LJUNUWBY", name = "u", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!LJUNUWBY", name = "v", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "client!LJUNUWBY", name = "w", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!LJUNUWBY", name = "x", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!LJUNUWBY", name = "y", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "client!LJUNUWBY", name = "A", descriptor = "I")
    public int field948;

    @OriginalMember(owner = "client!LJUNUWBY", name = "B", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!LJUNUWBY", name = "C", descriptor = "I")
    public int field950;

    @OriginalMember(owner = "client!LJUNUWBY", name = "G", descriptor = "I")
    private int field954;

    @OriginalMember(owner = "client!LJUNUWBY", name = "H", descriptor = "I")
    private int field955;

    @OriginalMember(owner = "client!LJUNUWBY", name = "I", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!LJUNUWBY", name = "z", descriptor = "J")
    public long field947;

    @OriginalMember(owner = "client!LJUNUWBY", name = "D", descriptor = "J")
    public long field951;

    @OriginalMember(owner = "client!LJUNUWBY", name = "p", descriptor = "LMEWJABWI;")
    public class34 field937;

    @OriginalMember(owner = "client!LJUNUWBY", name = "n", descriptor = "LPRSDKOTZ;")
    public class46 field935;

    @OriginalMember(owner = "client!LJUNUWBY", name = "m", descriptor = "Ljava/awt/Graphics;")
    public Graphics field934;

    @OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "(ZII)V")
    public final void method295(boolean arg0, int arg1, int arg2) {
        this.field932 = arg1;
        this.field933 = arg2;
        this.field937 = new class34(this.field933, 42686, this.field932, this);
        this.field934 = this.method99(false).getGraphics();
        this.field935 = new class46(3, this.field933, this.field932, this.method99(false));
        this.method54(this, 1);
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "(III)V")
    public final void method296(int arg0, int arg1, int arg2) {
        this.field932 = arg1;
        this.field933 = arg2;
        if (arg0 > 0) {
            this.field934 = this.method99(false).getGraphics();
            this.field935 = new class46(3, this.field933, this.field932, this.method99(false));
            this.method54(this, 1);
        }
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "run", descriptor = "()V")
    public void run() {
        this.method99(false).addMouseListener(this);
        this.method99(false).addMouseMotionListener(this);
        this.method99(false).addKeyListener(this);
        this.method99(false).addFocusListener(this);
        if (this.field937 != null) {
            this.field937.addWindowListener(this);
        }
        this.method146(0, "Loading...", this.field925);
        this.method134();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field929[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field926 < 0) {
                    if (this.field926 == -1) {
                        this.method297(970);
                    }
                    return;
                }
                if (this.field926 > 0) {
                    this.field926--;
                    if (this.field926 == 0) {
                        this.method297(970);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field929[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field929[var1]) {
                    var2 = (int) ((long) (this.field927 * 2560) / (var11 - this.field929[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field927 - (var11 - this.field929[var1]) / 10L);
                }
                if (var3 > this.field927) {
                    var3 = this.field927;
                }
                this.field929[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field929[var13] != 0L) {
                            this.field929[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field928) {
                    var3 = this.field928;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field948 = this.field944;
                    this.field949 = this.field945;
                    this.field950 = this.field946;
                    this.field951 = this.field947;
                    this.field944 = 0;
                    this.method78(6);
                    this.field954 = this.field955;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field927 > 0) {
                    this.field930 = var2 * 1000 / (this.field927 * 256);
                }
                this.method73((byte) 7);
            } while (!this.field931);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field929[var15]);
            }
            System.out.println("fps:" + this.field930 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field927 + " mindel:" + this.field928);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field931 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "(I)V")
    public final void method297(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field926 = -2;
        this.method83(false);
        if (this.field937 == null) {
            return;
        }
        try {
            Thread.sleep(1000L);
        } catch (Exception var4) {
        }
        try {
            System.exit(0);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "(II)V")
    public final void method298(int arg0, int arg1) {
        if (arg0 != 31071) {
            this.field922 = 170;
        }
        this.field927 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field926 >= 0) {
            this.field926 = 0;
        }
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field926 >= 0) {
            this.field926 = 4000 / this.field927;
        }
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field926 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field926 == -1) {
            this.method297(970);
        }
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field934 == null) {
            this.field934 = arg0;
        }
        this.field938 = true;
        this.method32(false);
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field934 == null) {
            this.field934 = arg0;
        }
        this.field938 = true;
        this.method32(false);
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field937 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field940 = 0;
        this.field945 = var2;
        this.field946 = var3;
        this.field947 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field944 = 2;
            this.field941 = 2;
        } else {
            this.field944 = 1;
            this.field941 = 1;
        }
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field940 = 0;
        this.field941 = 0;
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field940 = 0;
        this.field942 = -1;
        this.field943 = -1;
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field937 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field940 = 0;
        this.field942 = var2;
        this.field943 = var3;
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field937 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field940 = 0;
        this.field942 = var2;
        this.field943 = var3;
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field940 = 0;
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
            this.field952[var3] = 1;
        }
        if (var3 > 4) {
            this.field953[this.field955] = var3;
            this.field955 = this.field955 + 1 & 0x7F;
        }
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field940 = 0;
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
            this.field952[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "b", descriptor = "(I)I")
    public final int method299(int arg0) {
        if (arg0 != -33830) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = -1;
        if (this.field955 != this.field954) {
            var3 = this.field953[this.field954];
            this.field954 = this.field954 + 1 & 0x7F;
        }
        return var3;
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field939 = true;
        this.field938 = true;
        this.method32(false);
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field939 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field952[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "()V")
    public void method134() {
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "c", descriptor = "(I)V")
    public void method78(int arg0) {
        if (this.field924 == arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "(Z)V")
    public void method83(boolean arg0) {
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "(B)V")
    public void method73(byte arg0) {
        if (arg0 == 7) {
            ;
        }
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "b", descriptor = "(Z)V")
    public void method32(boolean arg0) {
        if (arg0) {
            this.field925 = !this.field925;
        }
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "c", descriptor = "(Z)Ljava/awt/Component;")
    public Component method99(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else if (this.field937 == null) {
            return this;
        } else {
            return this.field937;
        }
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method54(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!LJUNUWBY", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public void method146(int arg0, String arg1, boolean arg2) {
        while (this.field934 == null) {
            this.field934 = this.method99(false).getGraphics();
            try {
                this.method99(false).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method99(false).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method99(false).getFontMetrics(var6);
        if (this.field938) {
            this.field934.setColor(Color.black);
            this.field934.fillRect(0, 0, this.field932, this.field933);
            this.field938 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field933 / 2 - 18;
        this.field934.setColor(var7);
        this.field934.drawRect(this.field932 / 2 - 152, var8, 304, 34);
        if (arg2) {
            return;
        }
        this.field934.fillRect(this.field932 / 2 - 150, var8 + 2, arg0 * 3, 30);
        this.field934.setColor(Color.black);
        this.field934.fillRect(arg0 * 3 + this.field932 / 2 - 150, var8 + 2, 300 - arg0 * 3, 30);
        this.field934.setFont(var4);
        this.field934.setColor(Color.white);
        this.field934.drawString(arg1, (this.field932 - var5.stringWidth(arg1)) / 2, var8 + 22);
        if (class8.field113) {
        }
    }
}
