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

@OriginalClass("PXJVLLTT")
public class class47 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "PXJVLLTT", name = "a", descriptor = "I")
    private int field1230 = -9522;

    @OriginalMember(owner = "PXJVLLTT", name = "b", descriptor = "I")
    private int field1231 = 44758;

    @OriginalMember(owner = "PXJVLLTT", name = "c", descriptor = "B")
    private byte field1232 = 6;

    @OriginalMember(owner = "PXJVLLTT", name = "d", descriptor = "Z")
    private boolean field1233 = false;

    @OriginalMember(owner = "PXJVLLTT", name = "f", descriptor = "I")
    private int field1235 = 20;

    @OriginalMember(owner = "PXJVLLTT", name = "g", descriptor = "I")
    public int field1236 = 1;

    @OriginalMember(owner = "PXJVLLTT", name = "h", descriptor = "[J")
    private long[] field1237 = new long[10];

    @OriginalMember(owner = "PXJVLLTT", name = "j", descriptor = "Z")
    public boolean field1239 = false;

    @OriginalMember(owner = "PXJVLLTT", name = "o", descriptor = "[LTTFRDWZK;")
    public class58[] field1244 = new class58[6];

    @OriginalMember(owner = "PXJVLLTT", name = "q", descriptor = "Z")
    public boolean field1246 = true;

    @OriginalMember(owner = "PXJVLLTT", name = "r", descriptor = "Z")
    public boolean field1247 = true;

    @OriginalMember(owner = "PXJVLLTT", name = "E", descriptor = "[I")
    public int[] field1260 = new int[128];

    @OriginalMember(owner = "PXJVLLTT", name = "F", descriptor = "[I")
    private int[] field1261 = new int[128];

    @OriginalMember(owner = "PXJVLLTT", name = "e", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "PXJVLLTT", name = "i", descriptor = "I")
    public int field1238;

    @OriginalMember(owner = "PXJVLLTT", name = "k", descriptor = "I")
    public int field1240;

    @OriginalMember(owner = "PXJVLLTT", name = "l", descriptor = "I")
    public int field1241;

    @OriginalMember(owner = "PXJVLLTT", name = "s", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "PXJVLLTT", name = "t", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "PXJVLLTT", name = "u", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "PXJVLLTT", name = "v", descriptor = "I")
    public int field1251;

    @OriginalMember(owner = "PXJVLLTT", name = "w", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "PXJVLLTT", name = "x", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "PXJVLLTT", name = "y", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "PXJVLLTT", name = "A", descriptor = "I")
    public int field1256;

    @OriginalMember(owner = "PXJVLLTT", name = "B", descriptor = "I")
    public int field1257;

    @OriginalMember(owner = "PXJVLLTT", name = "C", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "PXJVLLTT", name = "G", descriptor = "I")
    private int field1262;

    @OriginalMember(owner = "PXJVLLTT", name = "H", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "PXJVLLTT", name = "I", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "PXJVLLTT", name = "z", descriptor = "J")
    public long field1255;

    @OriginalMember(owner = "PXJVLLTT", name = "D", descriptor = "J")
    public long field1259;

    @OriginalMember(owner = "PXJVLLTT", name = "p", descriptor = "LRBKIQEVU;")
    public class51 field1245;

    @OriginalMember(owner = "PXJVLLTT", name = "n", descriptor = "LBEVLZSVU;")
    public class6 field1243;

    @OriginalMember(owner = "PXJVLLTT", name = "m", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1242;

    @OriginalMember(owner = "PXJVLLTT", name = "a", descriptor = "(III)V")
    public final void method442(int arg0, int arg1, int arg2) {
        this.field1240 = arg2;
        this.field1241 = arg0;
        this.field1245 = new class51((byte) 6, this, this.field1240, this.field1241);
        this.field1242 = this.method161(9).getGraphics();
        this.field1243 = new class6(this.field1241, this.field1240, this.method161(9), false);
        this.method135(this, 1);
        int var4 = 50 / arg1;
    }

    @OriginalMember(owner = "PXJVLLTT", name = "a", descriptor = "(IBI)V")
    public final void method443(int arg0, byte arg1, int arg2) {
        if (this.field1232 != arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1240 = arg0;
        this.field1241 = arg2;
        this.field1242 = this.method161(9).getGraphics();
        this.field1243 = new class6(this.field1241, this.field1240, this.method161(9), false);
        this.method135(this, 1);
    }

    @OriginalMember(owner = "PXJVLLTT", name = "run", descriptor = "()V")
    public void run() {
        this.method161(9).addMouseListener(this);
        this.method161(9).addMouseMotionListener(this);
        this.method161(9).addKeyListener(this);
        this.method161(9).addFocusListener(this);
        if (this.field1245 != null) {
            this.field1245.addWindowListener(this);
        }
        this.method138("Loading...", -460, 0);
        this.method61();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1237[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1234 < 0) {
                    if (this.field1234 == -1) {
                        this.method444(true);
                    }
                    return;
                }
                if (this.field1234 > 0) {
                    this.field1234--;
                    if (this.field1234 == 0) {
                        this.method444(true);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1237[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1237[var1]) {
                    var2 = (int) ((long) (this.field1235 * 2560) / (var11 - this.field1237[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1235 - (var11 - this.field1237[var1]) / 10L);
                }
                if (var3 > this.field1235) {
                    var3 = this.field1235;
                }
                this.field1237[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1237[var13] != 0L) {
                            this.field1237[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1236) {
                    var3 = this.field1236;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1256 = this.field1252;
                    this.field1257 = this.field1253;
                    this.field1258 = this.field1254;
                    this.field1259 = this.field1255;
                    this.field1252 = 0;
                    this.method144(0);
                    this.field1262 = this.field1263;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1235 > 0) {
                    this.field1238 = var2 * 1000 / (this.field1235 * 256);
                }
                this.method151(4);
            } while (!this.field1239);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1237[var15]);
            }
            System.out.println("fps:" + this.field1238 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1235 + " mindel:" + this.field1236);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1239 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "PXJVLLTT", name = "a", descriptor = "(Z)V")
    public final void method444(boolean arg0) {
        if (!arg0) {
            return;
        }
        this.field1234 = -2;
        this.method167(744);
        if (this.field1245 == null) {
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

    @OriginalMember(owner = "PXJVLLTT", name = "a", descriptor = "(BI)V")
    public final void method445(byte arg0, int arg1) {
        this.field1235 = 1000 / arg1;
        if (arg0 == 2) {
            ;
        }
    }

    @OriginalMember(owner = "PXJVLLTT", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1234 >= 0) {
            this.field1234 = 0;
        }
    }

    @OriginalMember(owner = "PXJVLLTT", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1234 >= 0) {
            this.field1234 = 4000 / this.field1235;
        }
    }

    @OriginalMember(owner = "PXJVLLTT", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1234 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field1234 == -1) {
            this.method444(true);
        }
    }

    @OriginalMember(owner = "PXJVLLTT", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1242 == null) {
            this.field1242 = arg0;
        }
        this.field1246 = true;
        this.method163(true);
    }

    @OriginalMember(owner = "PXJVLLTT", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1242 == null) {
            this.field1242 = arg0;
        }
        this.field1246 = true;
        this.method163(true);
    }

    @OriginalMember(owner = "PXJVLLTT", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1245 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1248 = 0;
        this.field1253 = var2;
        this.field1254 = var3;
        this.field1255 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1252 = 2;
            this.field1249 = 2;
        } else {
            this.field1252 = 1;
            this.field1249 = 1;
        }
    }

    @OriginalMember(owner = "PXJVLLTT", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1248 = 0;
        this.field1249 = 0;
    }

    @OriginalMember(owner = "PXJVLLTT", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "PXJVLLTT", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "PXJVLLTT", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1248 = 0;
        this.field1250 = -1;
        this.field1251 = -1;
    }

    @OriginalMember(owner = "PXJVLLTT", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1245 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1248 = 0;
        this.field1250 = var2;
        this.field1251 = var3;
    }

    @OriginalMember(owner = "PXJVLLTT", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1245 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1248 = 0;
        this.field1250 = var2;
        this.field1251 = var3;
    }

    @OriginalMember(owner = "PXJVLLTT", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1248 = 0;
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
            this.field1260[var3] = 1;
        }
        if (var3 > 4) {
            this.field1261[this.field1263] = var3;
            this.field1263 = this.field1263 + 1 & 0x7F;
        }
        if (class27.field922) {
        }
    }

    @OriginalMember(owner = "PXJVLLTT", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1248 = 0;
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
            this.field1260[var3] = 0;
        }
    }

    @OriginalMember(owner = "PXJVLLTT", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "PXJVLLTT", name = "b", descriptor = "(Z)I")
    public final int method446(boolean arg0) {
        int var2 = -1;
        if (!arg0) {
            return this.field1231;
        }
        if (this.field1263 != this.field1262) {
            var2 = this.field1261[this.field1262];
            this.field1262 = this.field1262 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "PXJVLLTT", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1247 = true;
        this.field1246 = true;
        this.method163(true);
    }

    @OriginalMember(owner = "PXJVLLTT", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1247 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1260[var2] = 0;
        }
    }

    @OriginalMember(owner = "PXJVLLTT", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "PXJVLLTT", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "PXJVLLTT", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "PXJVLLTT", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "PXJVLLTT", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "PXJVLLTT", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "PXJVLLTT", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "PXJVLLTT", name = "a", descriptor = "()V")
    public void method61() {
    }

    @OriginalMember(owner = "PXJVLLTT", name = "a", descriptor = "(I)V")
    public void method144(int arg0) {
        if (arg0 != 0) {
            this.field1233 = !this.field1233;
        }
    }

    @OriginalMember(owner = "PXJVLLTT", name = "b", descriptor = "(I)V")
    public void method167(int arg0) {
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "PXJVLLTT", name = "c", descriptor = "(I)V")
    public void method151(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            ;
        }
    }

    @OriginalMember(owner = "PXJVLLTT", name = "c", descriptor = "(Z)V")
    public void method163(boolean arg0) {
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "PXJVLLTT", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public Component method161(int arg0) {
        if (arg0 < 9 || arg0 > 9) {
            throw new NullPointerException();
        }
        return this.field1245 == null ? this : this.field1245;
    }

    @OriginalMember(owner = "PXJVLLTT", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method135(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "PXJVLLTT", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public void method138(String arg0, int arg1, int arg2) {
        while (this.field1242 == null) {
            this.field1242 = this.method161(9).getGraphics();
            try {
                this.method161(9).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method161(9).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method161(9).getFontMetrics(var6);
        if (this.field1246) {
            this.field1242.setColor(Color.black);
            this.field1242.fillRect(0, 0, this.field1240, this.field1241);
            this.field1246 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field1241 / 2 - 18;
        this.field1242.setColor(var7);
        this.field1242.drawRect(this.field1240 / 2 - 152, var8, 304, 34);
        this.field1242.fillRect(this.field1240 / 2 - 150, var8 + 2, arg2 * 3, 30);
        this.field1242.setColor(Color.black);
        if (arg1 >= 0) {
            this.field1231 = -329;
        }
        this.field1242.fillRect(arg2 * 3 + this.field1240 / 2 - 150, var8 + 2, 300 - arg2 * 3, 30);
        this.field1242.setFont(var4);
        this.field1242.setColor(Color.white);
        this.field1242.drawString(arg0, (this.field1240 - var5.stringWidth(arg0)) / 2, var8 + 22);
    }
}
