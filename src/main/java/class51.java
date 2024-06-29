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

@OriginalClass("client!UBLCAEEN")
public class class51 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "I")
    private int field1352 = -943;

    @OriginalMember(owner = "client!UBLCAEEN", name = "b", descriptor = "Z")
    private boolean field1353 = true;

    @OriginalMember(owner = "client!UBLCAEEN", name = "c", descriptor = "Z")
    private boolean field1354 = false;

    @OriginalMember(owner = "client!UBLCAEEN", name = "d", descriptor = "Z")
    private boolean field1355 = false;

    @OriginalMember(owner = "client!UBLCAEEN", name = "f", descriptor = "I")
    private int field1357 = 20;

    @OriginalMember(owner = "client!UBLCAEEN", name = "g", descriptor = "I")
    public int field1358 = 1;

    @OriginalMember(owner = "client!UBLCAEEN", name = "h", descriptor = "[J")
    private long[] field1359 = new long[10];

    @OriginalMember(owner = "client!UBLCAEEN", name = "j", descriptor = "Z")
    public boolean field1361 = false;

    @OriginalMember(owner = "client!UBLCAEEN", name = "o", descriptor = "[LTFHGRYAS;")
    public class50[] field1366 = new class50[6];

    @OriginalMember(owner = "client!UBLCAEEN", name = "q", descriptor = "Z")
    public boolean field1368 = true;

    @OriginalMember(owner = "client!UBLCAEEN", name = "r", descriptor = "Z")
    public boolean field1369 = true;

    @OriginalMember(owner = "client!UBLCAEEN", name = "E", descriptor = "[I")
    public int[] field1382 = new int[128];

    @OriginalMember(owner = "client!UBLCAEEN", name = "F", descriptor = "[I")
    private int[] field1383 = new int[128];

    @OriginalMember(owner = "client!UBLCAEEN", name = "e", descriptor = "I")
    private int field1356;

    @OriginalMember(owner = "client!UBLCAEEN", name = "i", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "client!UBLCAEEN", name = "k", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!UBLCAEEN", name = "l", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!UBLCAEEN", name = "s", descriptor = "I")
    public int field1370;

    @OriginalMember(owner = "client!UBLCAEEN", name = "t", descriptor = "I")
    public int field1371;

    @OriginalMember(owner = "client!UBLCAEEN", name = "u", descriptor = "I")
    public int field1372;

    @OriginalMember(owner = "client!UBLCAEEN", name = "v", descriptor = "I")
    public int field1373;

    @OriginalMember(owner = "client!UBLCAEEN", name = "w", descriptor = "I")
    public int field1374;

    @OriginalMember(owner = "client!UBLCAEEN", name = "x", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "client!UBLCAEEN", name = "y", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "client!UBLCAEEN", name = "A", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!UBLCAEEN", name = "B", descriptor = "I")
    public int field1379;

    @OriginalMember(owner = "client!UBLCAEEN", name = "C", descriptor = "I")
    public int field1380;

    @OriginalMember(owner = "client!UBLCAEEN", name = "G", descriptor = "I")
    private int field1384;

    @OriginalMember(owner = "client!UBLCAEEN", name = "H", descriptor = "I")
    private int field1385;

    @OriginalMember(owner = "client!UBLCAEEN", name = "I", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!UBLCAEEN", name = "z", descriptor = "J")
    public long field1377;

    @OriginalMember(owner = "client!UBLCAEEN", name = "D", descriptor = "J")
    public long field1381;

    @OriginalMember(owner = "client!UBLCAEEN", name = "n", descriptor = "LXBLPPVAP;")
    public class59 field1365;

    @OriginalMember(owner = "client!UBLCAEEN", name = "p", descriptor = "LZQDWDFIV;")
    public class69 field1367;

    @OriginalMember(owner = "client!UBLCAEEN", name = "m", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1364;

    @OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "(III)V")
    public final void method432(int arg0, int arg1, int arg2) {
        this.field1362 = arg2;
        this.field1363 = arg0;
        this.field1367 = new class69(this.field1363, 183, this.field1362, this);
        if (arg1 >= 6 && arg1 <= 6) {
            this.field1364 = this.method119((byte) 75).getGraphics();
            this.field1365 = new class59(this.method119((byte) 75), this.field1362, this.field1363, false);
            this.method185(this, 1);
        }
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "b", descriptor = "(III)V")
    public final void method433(int arg0, int arg1, int arg2) {
        this.field1362 = arg2;
        this.field1363 = arg0;
        this.field1364 = this.method119((byte) 75).getGraphics();
        this.field1365 = new class59(this.method119((byte) 75), this.field1362, this.field1363, false);
        this.method185(this, 1);
        if (arg1 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "run", descriptor = "()V")
    public void run() {
        this.method119((byte) 75).addMouseListener(this);
        this.method119((byte) 75).addMouseMotionListener(this);
        this.method119((byte) 75).addKeyListener(this);
        this.method119((byte) 75).addFocusListener(this);
        if (this.field1367 != null) {
            this.field1367.addWindowListener(this);
        }
        this.method98("Loading...", 0, (byte) 5);
        this.method81();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1359[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1356 < 0) {
                    if (this.field1356 == -1) {
                        this.method434(true);
                    }
                    return;
                }
                if (this.field1356 > 0) {
                    this.field1356--;
                    if (this.field1356 == 0) {
                        this.method434(true);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1359[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1359[var1]) {
                    var2 = (int) ((long) (this.field1357 * 2560) / (var11 - this.field1359[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1357 - (var11 - this.field1359[var1]) / 10L);
                }
                if (var3 > this.field1357) {
                    var3 = this.field1357;
                }
                this.field1359[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1359[var13] != 0L) {
                            this.field1359[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1358) {
                    var3 = this.field1358;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1378 = this.field1374;
                    this.field1379 = this.field1375;
                    this.field1380 = this.field1376;
                    this.field1381 = this.field1377;
                    this.field1374 = 0;
                    this.method52(this.field1353);
                    this.field1384 = this.field1385;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1357 > 0) {
                    this.field1360 = var2 * 1000 / (this.field1357 * 256);
                }
                this.method90((byte) 0);
            } while (!this.field1361);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1359[var15]);
            }
            System.out.println("fps:" + this.field1360 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1357 + " mindel:" + this.field1358);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1361 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "(Z)V")
    public final void method434(boolean arg0) {
        this.field1356 = -2;
        if (!arg0) {
            this.field1355 = !this.field1355;
        }
        this.method48(271);
        if (this.field1367 == null) {
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

    @OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "(II)V")
    public final void method435(int arg0, int arg1) {
        this.field1357 = 1000 / arg1;
        if (arg0 < 7 || arg0 > 7) {
            this.field1352 = -133;
        }
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1356 >= 0) {
            this.field1356 = 0;
        }
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1356 >= 0) {
            this.field1356 = 4000 / this.field1357;
        }
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1356 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field1356 == -1) {
            this.method434(true);
        }
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1364 == null) {
            this.field1364 = arg0;
        }
        this.field1368 = true;
        this.method108(true);
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1364 == null) {
            this.field1364 = arg0;
        }
        this.field1368 = true;
        this.method108(true);
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1367 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1370 = 0;
        this.field1375 = var2;
        this.field1376 = var3;
        this.field1377 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1374 = 2;
            this.field1371 = 2;
        } else {
            this.field1374 = 1;
            this.field1371 = 1;
        }
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1370 = 0;
        this.field1371 = 0;
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1370 = 0;
        this.field1372 = -1;
        this.field1373 = -1;
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1367 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1370 = 0;
        this.field1372 = var2;
        this.field1373 = var3;
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1367 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1370 = 0;
        this.field1372 = var2;
        this.field1373 = var3;
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1370 = 0;
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
            this.field1382[var3] = 1;
        }
        if (var3 > 4) {
            this.field1383[this.field1385] = var3;
            this.field1385 = this.field1385 + 1 & 0x7F;
        }
        if (class34.field1027) {
        }
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1370 = 0;
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
            this.field1382[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "(I)I")
    public final int method436(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            this.field1352 = 413;
        }
        int var2 = -1;
        if (this.field1385 != this.field1384) {
            var2 = this.field1383[this.field1384];
            this.field1384 = this.field1384 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1369 = true;
        this.field1368 = true;
        this.method108(true);
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1369 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1382[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "()V")
    public void method81() {
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "b", descriptor = "(Z)V")
    public void method52(boolean arg0) {
        if (!arg0) {
            this.field1353 = !this.field1353;
        }
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "b", descriptor = "(I)V")
    public void method48(int arg0) {
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "(B)V")
    public void method90(byte arg0) {
        if (arg0 == 0) {
            boolean var2 = false;
        } else {
            this.field1355 = !this.field1355;
        }
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "c", descriptor = "(Z)V")
    public void method108(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "b", descriptor = "(B)Ljava/awt/Component;")
    public Component method119(byte arg0) {
        if (arg0 != 75) {
            throw new NullPointerException();
        }
        return this.field1367 == null ? this : this.field1367;
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method185(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!UBLCAEEN", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public void method98(String arg0, int arg1, byte arg2) {
        while (this.field1364 == null) {
            this.field1364 = this.method119((byte) 75).getGraphics();
            try {
                this.method119((byte) 75).repaint();
            } catch (Exception var11) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var10) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method119((byte) 75).getFontMetrics(var4);
        if (arg2 == 5) {
            boolean var6 = false;
        } else {
            this.field1354 = !this.field1354;
        }
        Font var7 = new Font("Helvetica", 0, 13);
        this.method119((byte) 75).getFontMetrics(var7);
        if (this.field1368) {
            this.field1364.setColor(Color.black);
            this.field1364.fillRect(0, 0, this.field1362, this.field1363);
            this.field1368 = false;
        }
        Color var8 = new Color(140, 17, 17);
        int var9 = this.field1363 / 2 - 18;
        this.field1364.setColor(var8);
        this.field1364.drawRect(this.field1362 / 2 - 152, var9, 304, 34);
        this.field1364.fillRect(this.field1362 / 2 - 150, var9 + 2, arg1 * 3, 30);
        this.field1364.setColor(Color.black);
        this.field1364.fillRect(arg1 * 3 + this.field1362 / 2 - 150, var9 + 2, 300 - arg1 * 3, 30);
        this.field1364.setFont(var4);
        this.field1364.setColor(Color.white);
        this.field1364.drawString(arg0, (this.field1362 - var5.stringWidth(arg0)) / 2, var9 + 22);
    }
}
