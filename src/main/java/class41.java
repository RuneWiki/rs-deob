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

@OriginalClass("client!NZBGSSTU")
public class class41 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "I")
    private int field1252 = -52;

    @OriginalMember(owner = "client!NZBGSSTU", name = "b", descriptor = "I")
    private int field1253 = 625;

    @OriginalMember(owner = "client!NZBGSSTU", name = "c", descriptor = "Z")
    private boolean field1254 = false;

    @OriginalMember(owner = "client!NZBGSSTU", name = "d", descriptor = "Z")
    private boolean field1255 = false;

    @OriginalMember(owner = "client!NZBGSSTU", name = "f", descriptor = "I")
    private int field1257 = 20;

    @OriginalMember(owner = "client!NZBGSSTU", name = "g", descriptor = "I")
    public int field1258 = 1;

    @OriginalMember(owner = "client!NZBGSSTU", name = "h", descriptor = "[J")
    private long[] field1259 = new long[10];

    @OriginalMember(owner = "client!NZBGSSTU", name = "j", descriptor = "Z")
    public boolean field1261 = false;

    @OriginalMember(owner = "client!NZBGSSTU", name = "o", descriptor = "[LIBHUFTPE;")
    public class22[] field1266 = new class22[6];

    @OriginalMember(owner = "client!NZBGSSTU", name = "q", descriptor = "Z")
    public boolean field1268 = true;

    @OriginalMember(owner = "client!NZBGSSTU", name = "r", descriptor = "Z")
    public boolean field1269 = true;

    @OriginalMember(owner = "client!NZBGSSTU", name = "E", descriptor = "[I")
    public int[] field1282 = new int[128];

    @OriginalMember(owner = "client!NZBGSSTU", name = "F", descriptor = "[I")
    private int[] field1283 = new int[128];

    @OriginalMember(owner = "client!NZBGSSTU", name = "e", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client!NZBGSSTU", name = "i", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "client!NZBGSSTU", name = "k", descriptor = "I")
    public int field1262;

    @OriginalMember(owner = "client!NZBGSSTU", name = "l", descriptor = "I")
    public int field1263;

    @OriginalMember(owner = "client!NZBGSSTU", name = "s", descriptor = "I")
    public int field1270;

    @OriginalMember(owner = "client!NZBGSSTU", name = "t", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!NZBGSSTU", name = "u", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!NZBGSSTU", name = "v", descriptor = "I")
    public int field1273;

    @OriginalMember(owner = "client!NZBGSSTU", name = "w", descriptor = "I")
    public int field1274;

    @OriginalMember(owner = "client!NZBGSSTU", name = "x", descriptor = "I")
    public int field1275;

    @OriginalMember(owner = "client!NZBGSSTU", name = "y", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "client!NZBGSSTU", name = "A", descriptor = "I")
    public int field1278;

    @OriginalMember(owner = "client!NZBGSSTU", name = "B", descriptor = "I")
    public int field1279;

    @OriginalMember(owner = "client!NZBGSSTU", name = "C", descriptor = "I")
    public int field1280;

    @OriginalMember(owner = "client!NZBGSSTU", name = "G", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client!NZBGSSTU", name = "H", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client!NZBGSSTU", name = "I", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!NZBGSSTU", name = "z", descriptor = "J")
    public long field1277;

    @OriginalMember(owner = "client!NZBGSSTU", name = "D", descriptor = "J")
    public long field1281;

    @OriginalMember(owner = "client!NZBGSSTU", name = "n", descriptor = "LESGPTMPA;")
    public class11 field1265;

    @OriginalMember(owner = "client!NZBGSSTU", name = "p", descriptor = "LWHTHTILQ;")
    public class62 field1267;

    @OriginalMember(owner = "client!NZBGSSTU", name = "m", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1264;

    @OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "(BII)V")
    public final void method405(byte arg0, int arg1, int arg2) {
        this.field1262 = arg1;
        if (arg0 != 7) {
            return;
        }
        boolean var4 = false;
        this.field1263 = arg2;
        this.field1267 = new class62(this, this.field1263, this.field1262, 0);
        this.field1264 = this.method119(0).getGraphics();
        this.field1265 = new class11(this.field1263, this.field1262, this.method119(0), this.field1253);
        this.method169(this, 1);
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "(IIZ)V")
    public final void method406(int arg0, int arg1, boolean arg2) {
        this.field1262 = arg1;
        this.field1263 = arg0;
        this.field1264 = this.method119(0).getGraphics();
        this.field1265 = new class11(this.field1263, this.field1262, this.method119(0), this.field1253);
        if (!arg2) {
            this.method169(this, 1);
        }
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "run", descriptor = "()V")
    public void run() {
        this.method119(0).addMouseListener(this);
        this.method119(0).addMouseMotionListener(this);
        this.method119(0).addKeyListener(this);
        this.method119(0).addFocusListener(this);
        if (this.field1267 != null) {
            this.field1267.addWindowListener(this);
        }
        this.method72(-618, 0, "Loading...");
        this.method147();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1259[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1256 < 0) {
                    if (this.field1256 == -1) {
                        this.method407(false);
                    }
                    return;
                }
                if (this.field1256 > 0) {
                    this.field1256--;
                    if (this.field1256 == 0) {
                        this.method407(false);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1259[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1259[var1]) {
                    var2 = (int) ((long) (this.field1257 * 2560) / (var11 - this.field1259[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1257 - (var11 - this.field1259[var1]) / 10L);
                }
                if (var3 > this.field1257) {
                    var3 = this.field1257;
                }
                this.field1259[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1259[var13] != 0L) {
                            this.field1259[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1258) {
                    var3 = this.field1258;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1278 = this.field1274;
                    this.field1279 = this.field1275;
                    this.field1280 = this.field1276;
                    this.field1281 = this.field1277;
                    this.field1274 = 0;
                    this.method153(true);
                    this.field1284 = this.field1285;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1257 > 0) {
                    this.field1260 = var2 * 1000 / (this.field1257 * 256);
                }
                this.method75(true);
            } while (!this.field1261);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1259[var15]);
            }
            System.out.println("fps:" + this.field1260 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1257 + " mindel:" + this.field1258);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1261 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "(Z)V")
    public final void method407(boolean arg0) {
        this.field1256 = -2;
        if (arg0) {
            return;
        }
        this.method148(true);
        if (this.field1267 == null) {
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

    @OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "(II)V")
    public final void method408(int arg0, int arg1) {
        this.field1257 = 1000 / arg0;
        while (arg1 >= 0) {
            this.field1255 = !this.field1255;
        }
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1256 >= 0) {
            this.field1256 = 0;
        }
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1256 >= 0) {
            this.field1256 = 4000 / this.field1257;
        }
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1256 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field1256 == -1) {
            this.method407(false);
        }
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1264 == null) {
            this.field1264 = arg0;
        }
        this.field1268 = true;
        this.method191(0);
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1264 == null) {
            this.field1264 = arg0;
        }
        this.field1268 = true;
        this.method191(0);
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1267 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1270 = 0;
        this.field1275 = var2;
        this.field1276 = var3;
        this.field1277 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1274 = 2;
            this.field1271 = 2;
        } else {
            this.field1274 = 1;
            this.field1271 = 1;
        }
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1270 = 0;
        this.field1271 = 0;
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1270 = 0;
        this.field1272 = -1;
        this.field1273 = -1;
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1267 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1270 = 0;
        this.field1272 = var2;
        this.field1273 = var3;
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1267 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1270 = 0;
        this.field1272 = var2;
        this.field1273 = var3;
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1270 = 0;
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
            this.field1282[var3] = 1;
        }
        if (var3 > 4) {
            this.field1283[this.field1285] = var3;
            this.field1285 = this.field1285 + 1 & 0x7F;
        }
        if (class66.field1692) {
        }
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1270 = 0;
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
            this.field1282[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "(I)I")
    public final int method409(int arg0) {
        if (arg0 <= 0) {
            this.field1255 = !this.field1255;
        }
        int var2 = -1;
        if (this.field1285 != this.field1284) {
            var2 = this.field1283[this.field1284];
            this.field1284 = this.field1284 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1269 = true;
        this.field1268 = true;
        this.method191(0);
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1269 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1282[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "()V")
    public void method147() {
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "b", descriptor = "(Z)V")
    public void method153(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "c", descriptor = "(Z)V")
    public void method148(boolean arg0) {
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "d", descriptor = "(Z)V")
    public void method75(boolean arg0) {
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "b", descriptor = "(I)V")
    public void method191(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "c", descriptor = "(I)Ljava/awt/Component;")
    public Component method119(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return this.field1267 == null ? this : this.field1267;
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method169(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!NZBGSSTU", name = "a", descriptor = "(IILjava/lang/String;)V")
    public void method72(int arg0, int arg1, String arg2) {
        while (this.field1264 == null) {
            this.field1264 = this.method119(0).getGraphics();
            try {
                this.method119(0).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method119(0).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method119(0).getFontMetrics(var6);
        if (this.field1268) {
            this.field1264.setColor(Color.black);
            this.field1264.fillRect(0, 0, this.field1262, this.field1263);
            this.field1268 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field1263 / 2 - 18;
        this.field1264.setColor(var7);
        this.field1264.drawRect(this.field1262 / 2 - 152, var8, 304, 34);
        this.field1264.fillRect(this.field1262 / 2 - 150, var8 + 2, arg1 * 3, 30);
        this.field1264.setColor(Color.black);
        this.field1264.fillRect(arg1 * 3 + this.field1262 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field1264.setFont(var4);
        while (arg0 >= 0) {
            this.field1254 = !this.field1254;
        }
        this.field1264.setColor(Color.white);
        this.field1264.drawString(arg2, (this.field1262 - var5.stringWidth(arg2)) / 2, var8 + 22);
    }
}
