import java.applet.Applet;
import java.awt.Color;
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

@OriginalClass("client!JWWAIQPI")
public class GameShell extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!JWWAIQPI", name = "a", descriptor = "I")
    private int field938 = 8;

    @OriginalMember(owner = "client!JWWAIQPI", name = "b", descriptor = "Z")
    private boolean field939 = false;

    @OriginalMember(owner = "client!JWWAIQPI", name = "c", descriptor = "Z")
    private boolean field940 = false;

    @OriginalMember(owner = "client!JWWAIQPI", name = "d", descriptor = "I")
    private int field941 = 3;

    @OriginalMember(owner = "client!JWWAIQPI", name = "g", descriptor = "I")
    private int field944 = 20;

    @OriginalMember(owner = "client!JWWAIQPI", name = "h", descriptor = "I")
    public int field945 = 1;

    @OriginalMember(owner = "client!JWWAIQPI", name = "i", descriptor = "[J")
    private long[] field946 = new long[10];

    @OriginalMember(owner = "client!JWWAIQPI", name = "k", descriptor = "Z")
    public boolean field948 = false;

    @OriginalMember(owner = "client!JWWAIQPI", name = "p", descriptor = "[LEPQDEJTO;")
    public Pix24[] field953 = new Pix24[6];

    @OriginalMember(owner = "client!JWWAIQPI", name = "r", descriptor = "Z")
    public boolean field955 = true;

    @OriginalMember(owner = "client!JWWAIQPI", name = "s", descriptor = "Z")
    public boolean field956 = true;

    @OriginalMember(owner = "client!JWWAIQPI", name = "F", descriptor = "[I")
    public int[] field969 = new int[128];

    @OriginalMember(owner = "client!JWWAIQPI", name = "G", descriptor = "[I")
    private int[] field970 = new int[128];

    @OriginalMember(owner = "client!JWWAIQPI", name = "e", descriptor = "I")
    private int field942;

    @OriginalMember(owner = "client!JWWAIQPI", name = "f", descriptor = "I")
    private int field943;

    @OriginalMember(owner = "client!JWWAIQPI", name = "j", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "client!JWWAIQPI", name = "l", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!JWWAIQPI", name = "m", descriptor = "I")
    public int field950;

    @OriginalMember(owner = "client!JWWAIQPI", name = "t", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!JWWAIQPI", name = "u", descriptor = "I")
    public int field958;

    @OriginalMember(owner = "client!JWWAIQPI", name = "v", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "client!JWWAIQPI", name = "w", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "client!JWWAIQPI", name = "x", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "client!JWWAIQPI", name = "y", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "client!JWWAIQPI", name = "z", descriptor = "I")
    public int field963;

    @OriginalMember(owner = "client!JWWAIQPI", name = "B", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "client!JWWAIQPI", name = "C", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "client!JWWAIQPI", name = "D", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "client!JWWAIQPI", name = "H", descriptor = "I")
    private int field971;

    @OriginalMember(owner = "client!JWWAIQPI", name = "I", descriptor = "I")
    private int field972;

    @OriginalMember(owner = "client!JWWAIQPI", name = "J", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!JWWAIQPI", name = "A", descriptor = "J")
    public long field964;

    @OriginalMember(owner = "client!JWWAIQPI", name = "E", descriptor = "J")
    public long field968;

    @OriginalMember(owner = "client!JWWAIQPI", name = "o", descriptor = "LISZGOOMR;")
    public PixMap field952;

    @OriginalMember(owner = "client!JWWAIQPI", name = "q", descriptor = "LIEJCKZCR;")
    public ViewBox field954;

    @OriginalMember(owner = "client!JWWAIQPI", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics field951;

    @OriginalMember(owner = "client!JWWAIQPI", name = "a", descriptor = "(III)V")
    public final void method266(int arg0, int arg1, int arg2) {
        this.field949 = arg2;
        this.field950 = arg1;
        this.field954 = new ViewBox(this.field941, this.field950, this, this.field949);
        if (arg0 < 0) {
            this.field951 = this.method164(-756).getGraphics();
            this.field952 = new PixMap(this.field950, (byte) -12, this.method164(-756), this.field949);
            this.method142(this, 1);
        }
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "b", descriptor = "(III)V")
    public final void method267(int arg0, int arg1, int arg2) {
        this.field949 = arg0;
        if (arg2 == 2) {
            this.field950 = arg1;
            this.field951 = this.method164(-756).getGraphics();
            this.field952 = new PixMap(this.field950, (byte) -12, this.method164(-756), this.field949);
            this.method142(this, 1);
        }
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "run", descriptor = "()V")
    public void run() {
        this.method164(-756).addMouseListener(this);
        this.method164(-756).addMouseMotionListener(this);
        this.method164(-756).addKeyListener(this);
        this.method164(-756).addFocusListener(this);
        if (this.field954 != null) {
            this.field954.addWindowListener(this);
        }
        this.method165(0, true, "Loading...");
        this.method86();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field946[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field943 < 0) {
                    if (this.field943 == -1) {
                        this.method268(this.field939);
                    }
                    return;
                }
                if (this.field943 > 0) {
                    this.field943--;
                    if (this.field943 == 0) {
                        this.method268(this.field939);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field946[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field946[var1]) {
                    var2 = (int) ((long) (this.field944 * 2560) / (var11 - this.field946[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field944 - (var11 - this.field946[var1]) / 10L);
                }
                if (var3 > this.field944) {
                    var3 = this.field944;
                }
                this.field946[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field946[var13] != 0L) {
                            this.field946[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field945) {
                    var3 = this.field945;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field965 = this.field961;
                    this.field966 = this.field962;
                    this.field967 = this.field963;
                    this.field968 = this.field964;
                    this.field961 = 0;
                    this.method113((byte) -111);
                    this.field971 = this.field972;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field944 > 0) {
                    this.field947 = var2 * 1000 / (this.field944 * 256);
                }
                this.method152(818);
            } while (!this.field948);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field946[var15]);
            }
            System.out.println("fps:" + this.field947 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field944 + " mindel:" + this.field945);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field948 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "a", descriptor = "(Z)V")
    public final void method268(boolean arg0) {
        this.field943 = -2;
        this.method40(277);
        if (arg0 || this.field954 == null) {
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

    @OriginalMember(owner = "client!JWWAIQPI", name = "a", descriptor = "(BI)V")
    public final void method269(byte arg0, int arg1) {
        if (arg0 != 103) {
            this.field938 = 388;
        }
        this.field944 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field943 >= 0) {
            this.field943 = 0;
        }
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field943 >= 0) {
            this.field943 = 4000 / this.field944;
        }
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field943 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field943 == -1) {
            this.method268(this.field939);
        }
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field951 == null) {
            this.field951 = arg0;
        }
        this.field955 = true;
        this.method82((byte) -99);
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field951 == null) {
            this.field951 = arg0;
        }
        this.field955 = true;
        this.method82((byte) -99);
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field954 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field957 = 0;
        this.field962 = var2;
        this.field963 = var3;
        this.field964 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field961 = 2;
            this.field958 = 2;
        } else {
            this.field961 = 1;
            this.field958 = 1;
        }
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field957 = 0;
        this.field958 = 0;
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field957 = 0;
        this.field959 = -1;
        this.field960 = -1;
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field954 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field957 = 0;
        this.field959 = var2;
        this.field960 = var3;
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field954 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field957 = 0;
        this.field959 = var2;
        this.field960 = var3;
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field957 = 0;
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
            this.field969[var3] = 1;
        }
        if (var3 > 4) {
            this.field970[this.field972] = var3;
            this.field972 = this.field972 + 1 & 0x7F;
        }
        if (Linkable.field1772) {
        }
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field957 = 0;
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
            this.field969[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "a", descriptor = "(I)I")
    public final int method270(int arg0) {
        while (arg0 >= 0) {
            this.field942 = -9;
        }
        int var2 = -1;
        if (this.field972 != this.field971) {
            var2 = this.field970[this.field971];
            this.field971 = this.field971 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field956 = true;
        this.field955 = true;
        this.method82((byte) -99);
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field956 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field969[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "a", descriptor = "()V")
    public void method86() {
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "a", descriptor = "(B)V")
    public void method113(byte arg0) {
        if (arg0 != -111) {
            this.field942 = -400;
        }
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "b", descriptor = "(I)V")
    public void method40(int arg0) {
        int var2 = 41 / arg0;
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "c", descriptor = "(I)V")
    public void method152(int arg0) {
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "b", descriptor = "(B)V")
    public void method82(byte arg0) {
        if (arg0 == -99) {
            ;
        }
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public java.awt.Component method164(int arg0) {
        if (arg0 >= 0) {
            this.field941 = 329;
        }
        return this.field954 == null ? this : this.field954;
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method142(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!JWWAIQPI", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public void method165(int arg0, boolean arg1, String arg2) {
        while (this.field951 == null) {
            this.field951 = this.method164(-756).getGraphics();
            try {
                this.method164(-756).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method164(-756).getFontMetrics(var4);
        if (!arg1) {
            this.field938 = -145;
        }
        Font var6 = new Font("Helvetica", 0, 13);
        this.method164(-756).getFontMetrics(var6);
        if (this.field955) {
            this.field951.setColor(Color.black);
            this.field951.fillRect(0, 0, this.field949, this.field950);
            this.field955 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field950 / 2 - 18;
        this.field951.setColor(var7);
        this.field951.drawRect(this.field949 / 2 - 152, var8, 304, 34);
        this.field951.fillRect(this.field949 / 2 - 150, var8 + 2, arg0 * 3, 30);
        this.field951.setColor(Color.black);
        this.field951.fillRect(arg0 * 3 + this.field949 / 2 - 150, var8 + 2, 300 - arg0 * 3, 30);
        this.field951.setFont(var4);
        this.field951.setColor(Color.white);
        this.field951.drawString(arg2, (this.field949 - var5.stringWidth(arg2)) / 2, var8 + 22);
    }
}
