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

@OriginalClass("CMOCHGYM")
public class class3 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "CMOCHGYM", name = "a", descriptor = "Z")
    private boolean field523 = true;

    @OriginalMember(owner = "CMOCHGYM", name = "c", descriptor = "Z")
    private boolean field525 = true;

    @OriginalMember(owner = "CMOCHGYM", name = "e", descriptor = "I")
    private int field527 = 20;

    @OriginalMember(owner = "CMOCHGYM", name = "f", descriptor = "I")
    public int field528 = 1;

    @OriginalMember(owner = "CMOCHGYM", name = "g", descriptor = "[J")
    private long[] field529 = new long[10];

    @OriginalMember(owner = "CMOCHGYM", name = "i", descriptor = "Z")
    public boolean field531 = false;

    @OriginalMember(owner = "CMOCHGYM", name = "n", descriptor = "[LZWUMKFUX;")
    public class72[] field536 = new class72[6];

    @OriginalMember(owner = "CMOCHGYM", name = "p", descriptor = "Z")
    public boolean field538 = true;

    @OriginalMember(owner = "CMOCHGYM", name = "q", descriptor = "Z")
    public boolean field539 = true;

    @OriginalMember(owner = "CMOCHGYM", name = "D", descriptor = "[I")
    public int[] field552 = new int[128];

    @OriginalMember(owner = "CMOCHGYM", name = "E", descriptor = "[I")
    private int[] field553 = new int[128];

    @OriginalMember(owner = "CMOCHGYM", name = "b", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "CMOCHGYM", name = "d", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "CMOCHGYM", name = "h", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "CMOCHGYM", name = "j", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "CMOCHGYM", name = "k", descriptor = "I")
    public int field533;

    @OriginalMember(owner = "CMOCHGYM", name = "r", descriptor = "I")
    public int field540;

    @OriginalMember(owner = "CMOCHGYM", name = "s", descriptor = "I")
    public int field541;

    @OriginalMember(owner = "CMOCHGYM", name = "t", descriptor = "I")
    public int field542;

    @OriginalMember(owner = "CMOCHGYM", name = "u", descriptor = "I")
    public int field543;

    @OriginalMember(owner = "CMOCHGYM", name = "v", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "CMOCHGYM", name = "w", descriptor = "I")
    public int field545;

    @OriginalMember(owner = "CMOCHGYM", name = "x", descriptor = "I")
    public int field546;

    @OriginalMember(owner = "CMOCHGYM", name = "z", descriptor = "I")
    public int field548;

    @OriginalMember(owner = "CMOCHGYM", name = "A", descriptor = "I")
    public int field549;

    @OriginalMember(owner = "CMOCHGYM", name = "B", descriptor = "I")
    public int field550;

    @OriginalMember(owner = "CMOCHGYM", name = "F", descriptor = "I")
    private int field554;

    @OriginalMember(owner = "CMOCHGYM", name = "G", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "CMOCHGYM", name = "H", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "CMOCHGYM", name = "y", descriptor = "J")
    public long field547;

    @OriginalMember(owner = "CMOCHGYM", name = "C", descriptor = "J")
    public long field551;

    @OriginalMember(owner = "CMOCHGYM", name = "o", descriptor = "LFLFIRZAJ;")
    public class10 field537;

    @OriginalMember(owner = "CMOCHGYM", name = "m", descriptor = "LVOQVBLJN;")
    public class56 field535;

    @OriginalMember(owner = "CMOCHGYM", name = "l", descriptor = "Ljava/awt/Graphics;")
    public Graphics field534;

    @OriginalMember(owner = "CMOCHGYM", name = "a", descriptor = "(ZII)V")
    public final void method151(boolean arg0, int arg1, int arg2) {
        this.field532 = arg2;
        this.field533 = arg1;
        this.field537 = new class10(this, this.field532, this.field533, 0);
        this.field534 = this.method92(true).getGraphics();
        this.field535 = new class56(this.field533, 5, this.field532, this.method92(true));
        this.method74(this, 1);
        if (!arg0) {
            this.field523 = !this.field523;
        }
    }

    @OriginalMember(owner = "CMOCHGYM", name = "a", descriptor = "(III)V")
    public final void method152(int arg0, int arg1, int arg2) {
        this.field532 = arg1;
        this.field533 = arg0;
        this.field534 = this.method92(true).getGraphics();
        this.field535 = new class56(this.field533, 5, this.field532, this.method92(true));
        this.method74(this, 1);
        if (arg2 >= 0) {
            this.field524 = -272;
        }
    }

    @OriginalMember(owner = "CMOCHGYM", name = "run", descriptor = "()V")
    public void run() {
        this.method92(true).addMouseListener(this);
        this.method92(true).addMouseMotionListener(this);
        this.method92(true).addKeyListener(this);
        this.method92(true).addFocusListener(this);
        if (this.field537 != null) {
            this.field537.addWindowListener(this);
        }
        this.method32(3, 0, "Loading...");
        this.method116();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field529[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field526 < 0) {
                    if (this.field526 == -1) {
                        this.method153(21126);
                    }
                    return;
                }
                if (this.field526 > 0) {
                    this.field526--;
                    if (this.field526 == 0) {
                        this.method153(21126);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field529[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field529[var1]) {
                    var2 = (int) ((long) (this.field527 * 2560) / (var11 - this.field529[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field527 - (var11 - this.field529[var1]) / 10L);
                }
                if (var3 > this.field527) {
                    var3 = this.field527;
                }
                this.field529[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field529[var13] != 0L) {
                            this.field529[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field528) {
                    var3 = this.field528;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field548 = this.field544;
                    this.field549 = this.field545;
                    this.field550 = this.field546;
                    this.field551 = this.field547;
                    this.field544 = 0;
                    this.method46(false);
                    this.field554 = this.field555;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field527 > 0) {
                    this.field530 = var2 * 1000 / (this.field527 * 256);
                }
                this.method49(0);
            } while (!this.field531);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field529[var15]);
            }
            System.out.println("fps:" + this.field530 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field527 + " mindel:" + this.field528);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field531 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "CMOCHGYM", name = "a", descriptor = "(I)V")
    public final void method153(int arg0) {
        if (arg0 != 21126) {
            return;
        }
        this.field526 = -2;
        this.method31(-21214);
        if (this.field537 == null) {
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

    @OriginalMember(owner = "CMOCHGYM", name = "a", descriptor = "(II)V")
    public final void method154(int arg0, int arg1) {
        int var3 = 20 / arg0;
        this.field527 = 1000 / arg1;
    }

    @OriginalMember(owner = "CMOCHGYM", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field526 >= 0) {
            this.field526 = 0;
        }
    }

    @OriginalMember(owner = "CMOCHGYM", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field526 >= 0) {
            this.field526 = 4000 / this.field527;
        }
    }

    @OriginalMember(owner = "CMOCHGYM", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field526 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field526 == -1) {
            this.method153(21126);
        }
    }

    @OriginalMember(owner = "CMOCHGYM", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field534 == null) {
            this.field534 = arg0;
        }
        this.field538 = true;
        this.method33(9);
    }

    @OriginalMember(owner = "CMOCHGYM", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field534 == null) {
            this.field534 = arg0;
        }
        this.field538 = true;
        this.method33(9);
    }

    @OriginalMember(owner = "CMOCHGYM", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field537 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field540 = 0;
        this.field545 = var2;
        this.field546 = var3;
        this.field547 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field544 = 2;
            this.field541 = 2;
        } else {
            this.field544 = 1;
            this.field541 = 1;
        }
    }

    @OriginalMember(owner = "CMOCHGYM", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field540 = 0;
        this.field541 = 0;
    }

    @OriginalMember(owner = "CMOCHGYM", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "CMOCHGYM", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "CMOCHGYM", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field540 = 0;
        this.field542 = -1;
        this.field543 = -1;
    }

    @OriginalMember(owner = "CMOCHGYM", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field537 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field540 = 0;
        this.field542 = var2;
        this.field543 = var3;
    }

    @OriginalMember(owner = "CMOCHGYM", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field537 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field540 = 0;
        this.field542 = var2;
        this.field543 = var3;
    }

    @OriginalMember(owner = "CMOCHGYM", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field540 = 0;
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
            this.field552[var3] = 1;
        }
        if (var3 > 4) {
            this.field553[this.field555] = var3;
            this.field555 = this.field555 + 1 & 0x7F;
        }
        if (class34.field1089) {
        }
    }

    @OriginalMember(owner = "CMOCHGYM", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field540 = 0;
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
            this.field552[var3] = 0;
        }
    }

    @OriginalMember(owner = "CMOCHGYM", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "CMOCHGYM", name = "b", descriptor = "(I)I")
    public final int method155(int arg0) {
        int var2 = -1;
        while (arg0 >= 0) {
            this.field523 = !this.field523;
        }
        if (this.field555 != this.field554) {
            var2 = this.field553[this.field554];
            this.field554 = this.field554 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "CMOCHGYM", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field539 = true;
        this.field538 = true;
        this.method33(9);
    }

    @OriginalMember(owner = "CMOCHGYM", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field539 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field552[var2] = 0;
        }
    }

    @OriginalMember(owner = "CMOCHGYM", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "CMOCHGYM", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "CMOCHGYM", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "CMOCHGYM", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "CMOCHGYM", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "CMOCHGYM", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "CMOCHGYM", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "CMOCHGYM", name = "a", descriptor = "()V")
    public void method116() {
    }

    @OriginalMember(owner = "CMOCHGYM", name = "a", descriptor = "(Z)V")
    public void method46(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "CMOCHGYM", name = "c", descriptor = "(I)V")
    public void method31(int arg0) {
        if (arg0 == -21214) {
            ;
        }
    }

    @OriginalMember(owner = "CMOCHGYM", name = "d", descriptor = "(I)V")
    public void method49(int arg0) {
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "CMOCHGYM", name = "e", descriptor = "(I)V")
    public void method33(int arg0) {
        if (arg0 != 9) {
            this.field525 = !this.field525;
        }
    }

    @OriginalMember(owner = "CMOCHGYM", name = "b", descriptor = "(Z)Ljava/awt/Component;")
    public Component method92(boolean arg0) {
        if (!arg0) {
            this.field524 = -84;
        }
        return this.field537 == null ? this : this.field537;
    }

    @OriginalMember(owner = "CMOCHGYM", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method74(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "CMOCHGYM", name = "a", descriptor = "(IILjava/lang/String;)V")
    public void method32(int arg0, int arg1, String arg2) {
        while (this.field534 == null) {
            this.field534 = this.method92(true).getGraphics();
            try {
                this.method92(true).repaint();
            } catch (Exception var11) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var10) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method92(true).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method92(true).getFontMetrics(var6);
        if (this.field538) {
            this.field534.setColor(Color.black);
            this.field534.fillRect(0, 0, this.field532, this.field533);
            this.field538 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field533 / 2 - 18;
        this.field534.setColor(var7);
        if (arg0 != 3) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field534.drawRect(this.field532 / 2 - 152, var8, 304, 34);
        this.field534.fillRect(this.field532 / 2 - 150, var8 + 2, arg1 * 3, 30);
        this.field534.setColor(Color.black);
        this.field534.fillRect(arg1 * 3 + this.field532 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field534.setFont(var4);
        this.field534.setColor(Color.white);
        this.field534.drawString(arg2, (this.field532 - var5.stringWidth(arg2)) / 2, var8 + 22);
    }
}
