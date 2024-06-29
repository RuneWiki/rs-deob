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

@OriginalClass("client!RMDQJLZZ")
public class class47 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "Z")
    private boolean field1327 = false;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "c", descriptor = "B")
    private byte field1329 = 4;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "e", descriptor = "I")
    private int field1331 = 20;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "f", descriptor = "I")
    public int field1332 = 1;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "g", descriptor = "[J")
    private long[] field1333 = new long[10];

    @OriginalMember(owner = "client!RMDQJLZZ", name = "i", descriptor = "Z")
    public boolean field1335 = false;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "n", descriptor = "[LTPUDHOHI;")
    public class52[] field1340 = new class52[6];

    @OriginalMember(owner = "client!RMDQJLZZ", name = "p", descriptor = "Z")
    public boolean field1342 = true;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "q", descriptor = "Z")
    public boolean field1343 = true;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "D", descriptor = "[I")
    public int[] field1356 = new int[128];

    @OriginalMember(owner = "client!RMDQJLZZ", name = "E", descriptor = "[I")
    private int[] field1357 = new int[128];

    @OriginalMember(owner = "client!RMDQJLZZ", name = "b", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "d", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "h", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "j", descriptor = "I")
    public int field1336;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "k", descriptor = "I")
    public int field1337;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "r", descriptor = "I")
    public int field1344;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "s", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "t", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "u", descriptor = "I")
    public int field1347;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "v", descriptor = "I")
    public int field1348;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "w", descriptor = "I")
    public int field1349;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "x", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "z", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "A", descriptor = "I")
    public int field1353;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "B", descriptor = "I")
    public int field1354;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "F", descriptor = "I")
    private int field1358;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "G", descriptor = "I")
    private int field1359;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "H", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "y", descriptor = "J")
    public long field1351;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "C", descriptor = "J")
    public long field1355;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "o", descriptor = "LIWUEUKZJ;")
    public class20 field1341;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "m", descriptor = "LVFZXUVTW;")
    public class60 field1339;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "l", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1338;

    @OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "(III)V")
    public final void method414(int arg0, int arg1, int arg2) {
        this.field1336 = arg2;
        if (arg0 != -31255) {
            return;
        }
        this.field1337 = arg1;
        this.field1341 = new class20(this.field1336, this, 208, this.field1337);
        this.field1338 = this.method167(0).getGraphics();
        this.field1339 = new class60(this.field1337, this.field1336, this.field1329, this.method167(0));
        this.method108(this, 1);
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "(IIB)V")
    public final void method415(int arg0, int arg1, byte arg2) {
        if (arg2 != 9) {
            this.field1328 = 149;
        }
        this.field1336 = arg0;
        this.field1337 = arg1;
        this.field1338 = this.method167(0).getGraphics();
        this.field1339 = new class60(this.field1337, this.field1336, this.field1329, this.method167(0));
        this.method108(this, 1);
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "run", descriptor = "()V")
    public void run() {
        this.method167(0).addMouseListener(this);
        this.method167(0).addMouseMotionListener(this);
        this.method167(0).addKeyListener(this);
        this.method167(0).addFocusListener(this);
        if (this.field1341 != null) {
            this.field1341.addWindowListener(this);
        }
        this.method61(0, (byte) -127, "Loading...");
        this.method158();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1333[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1330 < 0) {
                    if (this.field1330 == -1) {
                        this.method416(-23199);
                    }
                    if (class27.field954) {
                    }
                    return;
                }
                if (this.field1330 > 0) {
                    this.field1330--;
                    if (this.field1330 == 0) {
                        this.method416(-23199);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1333[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1333[var1]) {
                    var2 = (int) ((long) (this.field1331 * 2560) / (var11 - this.field1333[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1331 - (var11 - this.field1333[var1]) / 10L);
                }
                if (var3 > this.field1331) {
                    var3 = this.field1331;
                }
                this.field1333[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1333[var13] != 0L) {
                            this.field1333[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1332) {
                    var3 = this.field1332;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1352 = this.field1348;
                    this.field1353 = this.field1349;
                    this.field1354 = this.field1350;
                    this.field1355 = this.field1351;
                    this.field1348 = 0;
                    this.method46(-531);
                    this.field1358 = this.field1359;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1331 > 0) {
                    this.field1334 = var2 * 1000 / (this.field1331 * 256);
                }
                this.method137((byte) 71);
            } while (!this.field1335);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1333[var15]);
            }
            System.out.println("fps:" + this.field1334 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1331 + " mindel:" + this.field1332);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1335 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "(I)V")
    public final void method416(int arg0) {
        if (arg0 != -23199) {
            return;
        }
        this.field1330 = -2;
        this.method132((byte) 4);
        if (this.field1341 == null) {
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

    @OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "(II)V")
    public final void method417(int arg0, int arg1) {
        if (arg0 < 0) {
            this.field1331 = 1000 / arg1;
        }
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1330 >= 0) {
            this.field1330 = 0;
        }
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1330 >= 0) {
            this.field1330 = 4000 / this.field1331;
        }
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1330 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field1330 == -1) {
            this.method416(-23199);
        }
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1338 == null) {
            this.field1338 = arg0;
        }
        this.field1342 = true;
        this.method110(-258);
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1338 == null) {
            this.field1338 = arg0;
        }
        this.field1342 = true;
        this.method110(-258);
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1341 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1344 = 0;
        this.field1349 = var2;
        this.field1350 = var3;
        this.field1351 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1348 = 2;
            this.field1345 = 2;
        } else {
            this.field1348 = 1;
            this.field1345 = 1;
        }
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1344 = 0;
        this.field1345 = 0;
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1344 = 0;
        this.field1346 = -1;
        this.field1347 = -1;
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1341 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1344 = 0;
        this.field1346 = var2;
        this.field1347 = var3;
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1341 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1344 = 0;
        this.field1346 = var2;
        this.field1347 = var3;
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1344 = 0;
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
            this.field1356[var3] = 1;
        }
        if (var3 > 4) {
            this.field1357[this.field1359] = var3;
            this.field1359 = this.field1359 + 1 & 0x7F;
        }
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1344 = 0;
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
            this.field1356[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "(Z)I")
    public final int method418(boolean arg0) {
        int var2 = -1;
        if (arg0) {
            this.field1328 = -96;
        }
        if (this.field1359 != this.field1358) {
            var2 = this.field1357[this.field1358];
            this.field1358 = this.field1358 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1343 = true;
        this.field1342 = true;
        this.method110(-258);
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1343 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1356[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "()V")
    public void method158() {
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "b", descriptor = "(I)V")
    public void method46(int arg0) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "(B)V")
    public void method132(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        }
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "b", descriptor = "(B)V")
    public void method137(byte arg0) {
        if (arg0 != 71) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "c", descriptor = "(I)V")
    public void method110(int arg0) {
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public Component method167(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return this.field1341 == null ? this : this.field1341;
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method108(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!RMDQJLZZ", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public void method61(int arg0, byte arg1, String arg2) {
        while (this.field1338 == null) {
            this.field1338 = this.method167(0).getGraphics();
            try {
                this.method167(0).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method167(0).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method167(0).getFontMetrics(var6);
        if (this.field1342) {
            this.field1338.setColor(Color.black);
            this.field1338.fillRect(0, 0, this.field1336, this.field1337);
            this.field1342 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field1337 / 2 - 18;
        if (arg1 != -127) {
            return;
        }
        this.field1338.setColor(var7);
        this.field1338.drawRect(this.field1336 / 2 - 152, var8, 304, 34);
        this.field1338.fillRect(this.field1336 / 2 - 150, var8 + 2, arg0 * 3, 30);
        this.field1338.setColor(Color.black);
        this.field1338.fillRect(arg0 * 3 + this.field1336 / 2 - 150, var8 + 2, 300 - arg0 * 3, 30);
        this.field1338.setFont(var4);
        this.field1338.setColor(Color.white);
        this.field1338.drawString(arg2, (this.field1336 - var5.stringWidth(arg2)) / 2, var8 + 22);
    }
}
