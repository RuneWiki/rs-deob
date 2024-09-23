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

@OriginalClass("a")
public class GameShell extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "a", name = "a", descriptor = "Z")
    private boolean _flowObfuscator1 = false;

    @OriginalMember(owner = "a", name = "b", descriptor = "Z")
    private boolean _flowObfuscator2 = false;

    @OriginalMember(owner = "a", name = "d", descriptor = "Z")
    private boolean _flowObfuscator4 = false;

    @OriginalMember(owner = "a", name = "e", descriptor = "B")
    private byte _flowObfuscator5 = 3;

    @OriginalMember(owner = "a", name = "f", descriptor = "I")
    private int _flowObfuscator6 = 27808;

    @OriginalMember(owner = "a", name = "h", descriptor = "I")
    private int deltime = 20;

    @OriginalMember(owner = "a", name = "i", descriptor = "I")
    public int mindel = 1;

    @OriginalMember(owner = "a", name = "j", descriptor = "[J")
    private long[] otim = new long[10];

    @OriginalMember(owner = "a", name = "p", descriptor = "[Lhb;")
    public Pix32[] temp = new Pix32[6];

    @OriginalMember(owner = "a", name = "r", descriptor = "Z")
    public boolean refresh = true;

    @OriginalMember(owner = "a", name = "z", descriptor = "[I")
    public int[] actionKey = new int[128];

    @OriginalMember(owner = "a", name = "A", descriptor = "[I")
    private int[] keyQueue = new int[128];

    @OriginalMember(owner = "a", name = "c", descriptor = "I")
    private int _flowObfuscator3;

    @OriginalMember(owner = "a", name = "D", descriptor = "I")
    public static int _flowObfuscator7;

    @OriginalMember(owner = "a", name = "k", descriptor = "I")
    public int fps;

    @OriginalMember(owner = "a", name = "s", descriptor = "I")
    public int idleCycles;

    @OriginalMember(owner = "a", name = "B", descriptor = "I")
    private int keyQueueReadPos;

    @OriginalMember(owner = "a", name = "C", descriptor = "I")
    private int keyQueueWritePos;

    @OriginalMember(owner = "a", name = "t", descriptor = "I")
    public int mouseButton;

    @OriginalMember(owner = "a", name = "w", descriptor = "I")
    public int mouseClickButton;

    @OriginalMember(owner = "a", name = "y", descriptor = "I")
    public int mouseClickY;

    @OriginalMember(owner = "a", name = "x", descriptor = "I")
    public int mouseClikcX;

    @OriginalMember(owner = "a", name = "u", descriptor = "I")
    public int mouseX;

    @OriginalMember(owner = "a", name = "v", descriptor = "I")
    public int mouseY;

    @OriginalMember(owner = "a", name = "m", descriptor = "I")
    public int screenHeight;

    @OriginalMember(owner = "a", name = "l", descriptor = "I")
    public int screenWidth;

    @OriginalMember(owner = "a", name = "g", descriptor = "I")
    private int state;

    @OriginalMember(owner = "a", name = "o", descriptor = "Lqb;")
    public PixMap drawArea;

    @OriginalMember(owner = "a", name = "q", descriptor = "Lb;")
    public ViewBox frame;

    @OriginalMember(owner = "a", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics graphics;

    @OriginalMember(owner = "a", name = "a", descriptor = "(III)V")
    public final void initApplication(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this._flowObfuscator3 = 411;
        }
        this.screenWidth = arg1;
        this.screenHeight = arg0;
        this.frame = new ViewBox(this.screenHeight, 35731, this, this.screenWidth);
        this.graphics = this.getBaseComponent(this._flowObfuscator5).getGraphics();
        this.drawArea = new PixMap(this.getBaseComponent(this._flowObfuscator5), this.screenWidth, 299, this.screenHeight);
        this.startThread(this, 1);
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(IZI)V")
    public final void initApplet(int arg0, boolean arg1, int arg2) {
        this.screenWidth = arg2;
        this.screenHeight = arg0;
        this.graphics = this.getBaseComponent(this._flowObfuscator5).getGraphics();
        this.drawArea = new PixMap(this.getBaseComponent(this._flowObfuscator5), this.screenWidth, 299, this.screenHeight);
        if (arg1) {
            this._flowObfuscator3 = -370;
        }
        this.startThread(this, 1);
    }

    @OriginalMember(owner = "a", name = "run", descriptor = "()V")
    public void run() {
        this.getBaseComponent(this._flowObfuscator5).addMouseListener(this);
        this.getBaseComponent(this._flowObfuscator5).addMouseMotionListener(this);
        this.getBaseComponent(this._flowObfuscator5).addKeyListener(this);
        this.getBaseComponent(this._flowObfuscator5).addFocusListener(this);
        if (this.frame != null) {
            this.frame.addWindowListener(this);
        }
        this.drawProgress(true, "Loading...", 0);
        this.load();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        for (int var5 = 0; var5 < 10; var5++) {
            this.otim[var5] = System.currentTimeMillis();
        }
        long var6 = System.currentTimeMillis();
        while (this.state >= 0) {
            if (this.state > 0) {
                this.state--;
                if (this.state == 0) {
                    this.shutdown(-652);
                    return;
                }
            }
            int var8 = var2;
            int var9 = var3;
            var2 = 300;
            var3 = 1;
            long var10 = System.currentTimeMillis();
            if (this.otim[var1] == 0L) {
                var2 = var8;
                var3 = var9;
            } else if (var10 > this.otim[var1]) {
                var2 = (int) ((long) (this.deltime * 2560) / (var10 - this.otim[var1]));
            }
            if (var2 < 25) {
                var2 = 25;
            }
            if (var2 > 256) {
                var2 = 256;
                var3 = (int) ((long) this.deltime - (var10 - this.otim[var1]) / 10L);
            }
            this.otim[var1] = var10;
            var1 = (var1 + 1) % 10;
            if (var3 > 1) {
                for (int var12 = 0; var12 < 10; var12++) {
                    if (this.otim[var12] != 0L) {
                        this.otim[var12] += var3;
                    }
                }
            }
            if (var3 < this.mindel) {
                var3 = this.mindel;
            }
            try {
                Thread.sleep((long) var3);
            } catch (InterruptedException var13) {
            }
            while (var4 < 256) {
                this.update(437);
                this.mouseClickButton = 0;
                this.keyQueueReadPos = this.keyQueueWritePos;
                var4 += var2;
            }
            var4 &= 0xFF;
            if (this.deltime > 0) {
                this.fps = var2 * 1000 / (this.deltime * 256);
            }
            this.draw(false);
        }
        if (this.state == -1) {
            this.shutdown(-652);
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(I)V")
    public final void shutdown(int arg0) {
        while (arg0 >= 0) {
            this._flowObfuscator4 = !this._flowObfuscator4;
        }
        this.state = -2;
        this.unload((byte) -28);
        try {
            Thread.sleep(1000L);
        } catch (Exception var3) {
        }
        try {
            System.exit(0);
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(II)V")
    public final void setFramerate(int arg0, int arg1) {
        this.deltime = 1000 / arg1;
        if (arg0 <= 0) {
            this._flowObfuscator1 = !this._flowObfuscator1;
        }
    }

    @OriginalMember(owner = "a", name = "start", descriptor = "()V")
    public final void start() {
        if (this.state >= 0) {
            this.state = 0;
        }
    }

    @OriginalMember(owner = "a", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.state >= 0) {
            this.state = 4000 / this.deltime;
        }
    }

    @OriginalMember(owner = "a", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.state = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.state == -1) {
            this.shutdown(-652);
        }
    }

    @OriginalMember(owner = "a", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.graphics == null) {
            this.graphics = arg0;
        }
        this.refresh = true;
        this.refresh(3);
    }

    @OriginalMember(owner = "a", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.graphics == null) {
            this.graphics = arg0;
        }
        this.refresh = true;
        this.refresh(3);
    }

    @OriginalMember(owner = "a", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.frame != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.idleCycles = 0;
        this.mouseClikcX = var2;
        this.mouseClickY = var3;
        if (arg0.isMetaDown()) {
            this.mouseClickButton = 2;
            this.mouseButton = 2;
        } else {
            this.mouseClickButton = 1;
            this.mouseButton = 1;
        }
        if (InputTracking.field76) {
            InputTracking.method39(var2, arg0.isMetaDown() ? 1 : 0, var3, (byte) 4);
        }
    }

    @OriginalMember(owner = "a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.idleCycles = 0;
        this.mouseButton = 0;
        if (InputTracking.field76) {
            InputTracking.method40(arg0.isMetaDown() ? 1 : 0, 0);
        }
    }

    @OriginalMember(owner = "a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
        if (InputTracking.field76) {
            InputTracking.method46(-657);
        }
    }

    @OriginalMember(owner = "a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        if (InputTracking.field76) {
            InputTracking.method47(false);
        }
    }

    @OriginalMember(owner = "a", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.frame != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.idleCycles = 0;
        this.mouseX = var2;
        this.mouseY = var3;
        if (InputTracking.field76) {
            InputTracking.method41(var3, true, var2);
        }
    }

    @OriginalMember(owner = "a", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.frame != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.idleCycles = 0;
        this.mouseX = var2;
        this.mouseY = var3;
        if (InputTracking.field76) {
            InputTracking.method41(var3, true, var2);
        }
    }

    @OriginalMember(owner = "a", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.idleCycles = 0;
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
            this.actionKey[var3] = 1;
        }
        if (var3 > 4) {
            this.keyQueue[this.keyQueueWritePos] = var3;
            this.keyQueueWritePos = this.keyQueueWritePos + 1 & 0x7F;
        }
        if (InputTracking.field76) {
            InputTracking.method42(var3, true);
        }
    }

    @OriginalMember(owner = "a", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.idleCycles = 0;
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
            this.actionKey[var3] = 0;
        }
        if (InputTracking.field76) {
            InputTracking.method43(var3, 1);
        }
    }

    @OriginalMember(owner = "a", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.refresh = true;
        this.refresh(3);
        if (InputTracking.field76) {
            InputTracking.method44(-936);
        }
    }

    @OriginalMember(owner = "a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        if (InputTracking.field76) {
            InputTracking.method45(0);
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Z)I")
    public final int pollKey(boolean arg0) {
        int var2 = -1;
        if (arg0) {
            return 2;
        }
        if (this.keyQueueWritePos != this.keyQueueReadPos) {
            var2 = this.keyQueue[this.keyQueueReadPos];
            this.keyQueueReadPos = this.keyQueueReadPos + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "a", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "a", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "()V")
    public void load() {
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(I)V")
    public void update(int arg0) {
        if (arg0 <= 0) {
            this._flowObfuscator2 = !this._flowObfuscator2;
        }
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(B)V")
    public void unload(byte arg0) {
        if (arg0 != -28) {
            this._flowObfuscator6 = -407;
        }
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(Z)V")
    public void draw(boolean arg0) {
        if (arg0) {
            this._flowObfuscator4 = !this._flowObfuscator4;
        }
    }

    @OriginalMember(owner = "a", name = "c", descriptor = "(I)V")
    public void refresh(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            this._flowObfuscator2 = !this._flowObfuscator2;
        }
    }

    @OriginalMember(owner = "a", name = "b", descriptor = "(B)Ljava/awt/Component;")
    public java.awt.Component getBaseComponent(byte arg0) {
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        return this.frame == null ? this : this.frame;
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void startThread(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "a", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public void drawProgress(boolean arg0, String arg1, int arg2) {
        while (this.graphics == null) {
            this.graphics = this.getBaseComponent(this._flowObfuscator5).getGraphics();
            try {
                this.getBaseComponent(this._flowObfuscator5).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.getBaseComponent(this._flowObfuscator5).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.getBaseComponent(this._flowObfuscator5).getFontMetrics(var6);
        if (this.refresh) {
            this.graphics.setColor(Color.black);
            this.graphics.fillRect(0, 0, this.screenWidth, this.screenHeight);
            this.refresh = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.screenHeight / 2 - 18;
        this.graphics.setColor(var7);
        this.graphics.drawRect(this.screenWidth / 2 - 152, var8, 304, 34);
        this.graphics.fillRect(this.screenWidth / 2 - 150, var8 + 2, arg2 * 3, 30);
        this.graphics.setColor(Color.black);
        this.graphics.fillRect(arg2 * 3 + this.screenWidth / 2 - 150, var8 + 2, 300 - arg2 * 3, 30);
        this.graphics.setFont(var4);
        this.graphics.setColor(Color.white);
        if (arg0) {
            this.graphics.drawString(arg1, (this.screenWidth - var5.stringWidth(arg1)) / 2, var8 + 22);
        }
    }
}
