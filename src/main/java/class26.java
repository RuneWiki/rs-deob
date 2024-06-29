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

@OriginalClass("client!HJHAUOBE")
public class class26 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!HJHAUOBE", name = "a", descriptor = "I")
    private int field925 = 339;

    @OriginalMember(owner = "client!HJHAUOBE", name = "b", descriptor = "I")
    private int field926 = 3;

    @OriginalMember(owner = "client!HJHAUOBE", name = "c", descriptor = "Z")
    private boolean field927 = false;

    @OriginalMember(owner = "client!HJHAUOBE", name = "d", descriptor = "Z")
    private boolean field928 = true;

    @OriginalMember(owner = "client!HJHAUOBE", name = "e", descriptor = "I")
    private int field929 = 33560;

    @OriginalMember(owner = "client!HJHAUOBE", name = "g", descriptor = "I")
    private int field931 = 20;

    @OriginalMember(owner = "client!HJHAUOBE", name = "h", descriptor = "I")
    public int field932 = 1;

    @OriginalMember(owner = "client!HJHAUOBE", name = "i", descriptor = "[J")
    private long[] field933 = new long[10];

    @OriginalMember(owner = "client!HJHAUOBE", name = "k", descriptor = "Z")
    public boolean field935 = false;

    @OriginalMember(owner = "client!HJHAUOBE", name = "p", descriptor = "[LWQACZBNG;")
    public class58[] field940 = new class58[6];

    @OriginalMember(owner = "client!HJHAUOBE", name = "r", descriptor = "Z")
    public boolean field942 = true;

    @OriginalMember(owner = "client!HJHAUOBE", name = "s", descriptor = "Z")
    public boolean field943 = true;

    @OriginalMember(owner = "client!HJHAUOBE", name = "F", descriptor = "[I")
    public int[] field956 = new int[128];

    @OriginalMember(owner = "client!HJHAUOBE", name = "G", descriptor = "[I")
    private int[] field957 = new int[128];

    @OriginalMember(owner = "client!HJHAUOBE", name = "f", descriptor = "I")
    private int field930;

    @OriginalMember(owner = "client!HJHAUOBE", name = "j", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!HJHAUOBE", name = "l", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "client!HJHAUOBE", name = "m", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!HJHAUOBE", name = "t", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!HJHAUOBE", name = "u", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!HJHAUOBE", name = "v", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "client!HJHAUOBE", name = "w", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "client!HJHAUOBE", name = "x", descriptor = "I")
    public int field948;

    @OriginalMember(owner = "client!HJHAUOBE", name = "y", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!HJHAUOBE", name = "z", descriptor = "I")
    public int field950;

    @OriginalMember(owner = "client!HJHAUOBE", name = "B", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "client!HJHAUOBE", name = "C", descriptor = "I")
    public int field953;

    @OriginalMember(owner = "client!HJHAUOBE", name = "D", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "client!HJHAUOBE", name = "H", descriptor = "I")
    private int field958;

    @OriginalMember(owner = "client!HJHAUOBE", name = "I", descriptor = "I")
    private int field959;

    @OriginalMember(owner = "client!HJHAUOBE", name = "J", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!HJHAUOBE", name = "A", descriptor = "J")
    public long field951;

    @OriginalMember(owner = "client!HJHAUOBE", name = "E", descriptor = "J")
    public long field955;

    @OriginalMember(owner = "client!HJHAUOBE", name = "o", descriptor = "LDRNBRPSO;")
    public class10 field939;

    @OriginalMember(owner = "client!HJHAUOBE", name = "q", descriptor = "LBXWMHFQK;")
    public class4 field941;

    @OriginalMember(owner = "client!HJHAUOBE", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics field938;

    @OriginalMember(owner = "client!HJHAUOBE", name = "a", descriptor = "(III)V")
    public final void method259(int arg0, int arg1, int arg2) {
        this.field936 = arg0;
        this.field937 = arg1;
        this.field941 = new class4(this.field936, this.field937, false, this);
        this.field938 = this.method153(-518).getGraphics();
        this.field939 = new class10(this.field937, this.field936, this.method153(-518), 384);
        if (arg2 == 0) {
            this.method139(this, 1);
        }
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "b", descriptor = "(III)V")
    public final void method260(int arg0, int arg1, int arg2) {
        this.field936 = arg2;
        this.field937 = arg0;
        this.field938 = this.method153(-518).getGraphics();
        this.field939 = new class10(this.field937, this.field936, this.method153(-518), 384);
        this.method139(this, 1);
        if (arg1 != 45241) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "run", descriptor = "()V")
    public void run() {
        this.method153(-518).addMouseListener(this);
        this.method153(-518).addMouseMotionListener(this);
        this.method153(-518).addKeyListener(this);
        this.method153(-518).addFocusListener(this);
        if (this.field941 != null) {
            this.field941.addWindowListener(this);
        }
        this.method55("Loading...", false, 0);
        this.method121();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field933[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field930 < 0) {
                    if (this.field930 == -1) {
                        this.method261(this.field925);
                    }
                    return;
                }
                if (this.field930 > 0) {
                    this.field930--;
                    if (this.field930 == 0) {
                        this.method261(this.field925);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field933[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field933[var1]) {
                    var2 = (int) ((long) (this.field931 * 2560) / (var11 - this.field933[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field931 - (var11 - this.field933[var1]) / 10L);
                }
                if (var3 > this.field931) {
                    var3 = this.field931;
                }
                this.field933[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field933[var13] != 0L) {
                            this.field933[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field932) {
                    var3 = this.field932;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field952 = this.field948;
                    this.field953 = this.field949;
                    this.field954 = this.field950;
                    this.field955 = this.field951;
                    this.field948 = 0;
                    this.method110(0);
                    this.field958 = this.field959;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field931 > 0) {
                    this.field934 = var2 * 1000 / (this.field931 * 256);
                }
                this.method106((byte) 2);
            } while (!this.field935);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field933[var15]);
            }
            System.out.println("fps:" + this.field934 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field931 + " mindel:" + this.field932);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field935 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "a", descriptor = "(I)V")
    public final void method261(int arg0) {
        int var2 = 30 / arg0;
        this.field930 = -2;
        this.method39(this.field926);
        if (this.field941 == null) {
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

    @OriginalMember(owner = "client!HJHAUOBE", name = "a", descriptor = "(ZI)V")
    public final void method262(boolean arg0, int arg1) {
        this.field931 = 1000 / arg1;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field930 >= 0) {
            this.field930 = 0;
        }
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field930 >= 0) {
            this.field930 = 4000 / this.field931;
        }
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field930 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field930 == -1) {
            this.method261(this.field925);
        }
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field938 == null) {
            this.field938 = arg0;
        }
        this.field942 = true;
        this.method96(0);
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field938 == null) {
            this.field938 = arg0;
        }
        this.field942 = true;
        this.method96(0);
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field941 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field944 = 0;
        this.field949 = var2;
        this.field950 = var3;
        this.field951 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field948 = 2;
            this.field945 = 2;
        } else {
            this.field948 = 1;
            this.field945 = 1;
        }
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field944 = 0;
        this.field945 = 0;
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field944 = 0;
        this.field946 = -1;
        this.field947 = -1;
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field941 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field944 = 0;
        this.field946 = var2;
        this.field947 = var3;
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field941 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field944 = 0;
        this.field946 = var2;
        this.field947 = var3;
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field944 = 0;
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
            this.field956[var3] = 1;
        }
        if (var3 > 4) {
            this.field957[this.field959] = var3;
            this.field959 = this.field959 + 1 & 0x7F;
        }
        if (class8.field622) {
        }
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field944 = 0;
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
            this.field956[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "b", descriptor = "(I)I")
    public final int method263(int arg0) {
        int var2 = -1;
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field959 != this.field958) {
            var2 = this.field957[this.field958];
            this.field958 = this.field958 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field943 = true;
        this.field942 = true;
        this.method96(0);
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field943 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field956[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "a", descriptor = "()V")
    public void method121() {
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "c", descriptor = "(I)V")
    public void method110(int arg0) {
        if (arg0 != 0) {
            this.field928 = !this.field928;
        }
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "d", descriptor = "(I)V")
    public void method39(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "a", descriptor = "(B)V")
    public void method106(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
        }
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "e", descriptor = "(I)V")
    public void method96(int arg0) {
        if (arg0 < 0 || arg0 > 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "f", descriptor = "(I)Ljava/awt/Component;")
    public Component method153(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field941 == null ? this : this.field941;
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method139(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!HJHAUOBE", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public void method55(String arg0, boolean arg1, int arg2) {
        while (this.field938 == null) {
            this.field938 = this.method153(-518).getGraphics();
            try {
                this.method153(-518).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method153(-518).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method153(-518).getFontMetrics(var6);
        if (this.field942) {
            this.field938.setColor(Color.black);
            this.field938.fillRect(0, 0, this.field936, this.field937);
            this.field942 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field937 / 2 - 18;
        this.field938.setColor(var7);
        this.field938.drawRect(this.field936 / 2 - 152, var8, 304, 34);
        if (arg1) {
            this.field929 = 243;
        }
        this.field938.fillRect(this.field936 / 2 - 150, var8 + 2, arg2 * 3, 30);
        this.field938.setColor(Color.black);
        this.field938.fillRect(arg2 * 3 + this.field936 / 2 - 150, var8 + 2, 300 - arg2 * 3, 30);
        this.field938.setFont(var4);
        this.field938.setColor(Color.white);
        this.field938.drawString(arg0, (this.field936 - var5.stringWidth(arg0)) / 2, var8 + 22);
    }
}
