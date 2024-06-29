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

@OriginalClass("client!EPVRYXOV")
public class class9 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "Z")
    private boolean field595 = true;

    @OriginalMember(owner = "client!EPVRYXOV", name = "b", descriptor = "I")
    private int field596 = 718;

    @OriginalMember(owner = "client!EPVRYXOV", name = "e", descriptor = "I")
    private int field599 = 7;

    @OriginalMember(owner = "client!EPVRYXOV", name = "h", descriptor = "I")
    private int field602 = 20;

    @OriginalMember(owner = "client!EPVRYXOV", name = "i", descriptor = "I")
    public int field603 = 1;

    @OriginalMember(owner = "client!EPVRYXOV", name = "j", descriptor = "[J")
    private long[] field604 = new long[10];

    @OriginalMember(owner = "client!EPVRYXOV", name = "l", descriptor = "Z")
    public boolean field606 = false;

    @OriginalMember(owner = "client!EPVRYXOV", name = "q", descriptor = "[LFKNRMZJV;")
    public class13[] field611 = new class13[6];

    @OriginalMember(owner = "client!EPVRYXOV", name = "s", descriptor = "Z")
    public boolean field613 = true;

    @OriginalMember(owner = "client!EPVRYXOV", name = "t", descriptor = "Z")
    public boolean field614 = true;

    @OriginalMember(owner = "client!EPVRYXOV", name = "G", descriptor = "[I")
    public int[] field627 = new int[128];

    @OriginalMember(owner = "client!EPVRYXOV", name = "H", descriptor = "[I")
    private int[] field628 = new int[128];

    @OriginalMember(owner = "client!EPVRYXOV", name = "c", descriptor = "I")
    private int field597;

    @OriginalMember(owner = "client!EPVRYXOV", name = "d", descriptor = "I")
    private int field598;

    @OriginalMember(owner = "client!EPVRYXOV", name = "f", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client!EPVRYXOV", name = "g", descriptor = "I")
    private int field601;

    @OriginalMember(owner = "client!EPVRYXOV", name = "k", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "client!EPVRYXOV", name = "m", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "client!EPVRYXOV", name = "n", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!EPVRYXOV", name = "u", descriptor = "I")
    public int field615;

    @OriginalMember(owner = "client!EPVRYXOV", name = "v", descriptor = "I")
    public int field616;

    @OriginalMember(owner = "client!EPVRYXOV", name = "w", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!EPVRYXOV", name = "x", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!EPVRYXOV", name = "y", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "client!EPVRYXOV", name = "z", descriptor = "I")
    public int field620;

    @OriginalMember(owner = "client!EPVRYXOV", name = "A", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "client!EPVRYXOV", name = "C", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "client!EPVRYXOV", name = "D", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!EPVRYXOV", name = "E", descriptor = "I")
    public int field625;

    @OriginalMember(owner = "client!EPVRYXOV", name = "I", descriptor = "I")
    private int field629;

    @OriginalMember(owner = "client!EPVRYXOV", name = "J", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client!EPVRYXOV", name = "K", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!EPVRYXOV", name = "B", descriptor = "J")
    public long field622;

    @OriginalMember(owner = "client!EPVRYXOV", name = "F", descriptor = "J")
    public long field626;

    @OriginalMember(owner = "client!EPVRYXOV", name = "p", descriptor = "LERQSZFRT;")
    public class10 field610;

    @OriginalMember(owner = "client!EPVRYXOV", name = "r", descriptor = "LINDYOKOE;")
    public class20 field612;

    @OriginalMember(owner = "client!EPVRYXOV", name = "o", descriptor = "Ljava/awt/Graphics;")
    public Graphics field609;

    @OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "(IIZ)V")
    public final void method168(int arg0, int arg1, boolean arg2) {
        this.field607 = arg0;
        this.field608 = arg1;
        this.field612 = new class20(this.field608, this, -773, this.field607);
        this.field609 = this.method73(0).getGraphics();
        if (!arg2) {
            this.field599 = 31;
        }
        this.field610 = new class10(this.field608, this.field607, this.method73(0), (byte) 0);
        this.method142(this, 1);
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "(III)V")
    public final void method169(int arg0, int arg1, int arg2) {
        if (arg1 != 34288) {
            return;
        }
        this.field607 = arg2;
        this.field608 = arg0;
        this.field609 = this.method73(0).getGraphics();
        this.field610 = new class10(this.field608, this.field607, this.method73(0), (byte) 0);
        this.method142(this, 1);
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "run", descriptor = "()V")
    public void run() {
        this.method73(0).addMouseListener(this);
        this.method73(0).addMouseMotionListener(this);
        this.method73(0).addKeyListener(this);
        this.method73(0).addFocusListener(this);
        if (this.field612 != null) {
            this.field612.addWindowListener(this);
        }
        this.method101(this.field598, 0, "Loading...");
        this.method132();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field604[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field601 < 0) {
                    if (this.field601 == -1) {
                        this.method170(6);
                    }
                    return;
                }
                if (this.field601 > 0) {
                    this.field601--;
                    if (this.field601 == 0) {
                        this.method170(6);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field604[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field604[var1]) {
                    var2 = (int) ((long) (this.field602 * 2560) / (var11 - this.field604[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field602 - (var11 - this.field604[var1]) / 10L);
                }
                if (var3 > this.field602) {
                    var3 = this.field602;
                }
                this.field604[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field604[var13] != 0L) {
                            this.field604[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field603) {
                    var3 = this.field603;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field623 = this.field619;
                    this.field624 = this.field620;
                    this.field625 = this.field621;
                    this.field626 = this.field622;
                    this.field619 = 0;
                    this.method81(this.field595);
                    this.field629 = this.field630;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field602 > 0) {
                    this.field605 = var2 * 1000 / (this.field602 * 256);
                }
                this.method137(718);
            } while (!this.field606);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field604[var15]);
            }
            System.out.println("fps:" + this.field605 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field602 + " mindel:" + this.field603);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field606 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "(I)V")
    public final void method170(int arg0) {
        this.field601 = -2;
        this.method136(638);
        if (arg0 != 6) {
            this.field595 = !this.field595;
        }
        if (this.field612 == null) {
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

    @OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "(IB)V")
    public final void method171(int arg0, byte arg1) {
        this.field602 = 1000 / arg0;
        if (arg1 == 2) {
            boolean var3 = false;
        }
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field601 >= 0) {
            this.field601 = 0;
        }
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field601 >= 0) {
            this.field601 = 4000 / this.field602;
        }
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field601 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field601 == -1) {
            this.method170(6);
        }
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field609 == null) {
            this.field609 = arg0;
        }
        this.field613 = true;
        this.method114(0);
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field609 == null) {
            this.field609 = arg0;
        }
        this.field613 = true;
        this.method114(0);
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field612 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field615 = 0;
        this.field620 = var2;
        this.field621 = var3;
        this.field622 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field619 = 2;
            this.field616 = 2;
        } else {
            this.field619 = 1;
            this.field616 = 1;
        }
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field615 = 0;
        this.field616 = 0;
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field615 = 0;
        this.field617 = -1;
        this.field618 = -1;
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field612 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field615 = 0;
        this.field617 = var2;
        this.field618 = var3;
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field612 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field615 = 0;
        this.field617 = var2;
        this.field618 = var3;
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field615 = 0;
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
            this.field627[var3] = 1;
        }
        if (var3 > 4) {
            this.field628[this.field630] = var3;
            this.field630 = this.field630 + 1 & 0x7F;
        }
        if (class35.field1047) {
        }
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field615 = 0;
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
            this.field627[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "b", descriptor = "(I)I")
    public final int method172(int arg0) {
        int var2 = -1;
        if (arg0 != 0) {
            this.field600 = 172;
        }
        if (this.field630 != this.field629) {
            var2 = this.field628[this.field629];
            this.field629 = this.field629 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field614 = true;
        this.field613 = true;
        this.method114(0);
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field614 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field627[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "()V")
    public void method132() {
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "(Z)V")
    public void method81(boolean arg0) {
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "c", descriptor = "(I)V")
    public void method136(int arg0) {
        int var2 = 68 / arg0;
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "d", descriptor = "(I)V")
    public void method137(int arg0) {
        if (arg0 <= 0) {
            this.field599 = -333;
        }
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "e", descriptor = "(I)V")
    public void method114(int arg0) {
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "f", descriptor = "(I)Ljava/awt/Component;")
    public Component method73(int arg0) {
        if (this.field597 != arg0) {
            throw new NullPointerException();
        }
        return this.field612 == null ? this : this.field612;
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method142(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!EPVRYXOV", name = "a", descriptor = "(IILjava/lang/String;)V")
    public void method101(int arg0, int arg1, String arg2) {
        while (this.field609 == null) {
            this.field609 = this.method73(0).getGraphics();
            try {
                this.method73(0).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method73(0).getFontMetrics(var4);
        if (arg0 != 0) {
            this.field596 = 290;
        }
        Font var6 = new Font("Helvetica", 0, 13);
        this.method73(0).getFontMetrics(var6);
        if (this.field613) {
            this.field609.setColor(Color.black);
            this.field609.fillRect(0, 0, this.field607, this.field608);
            this.field613 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field608 / 2 - 18;
        this.field609.setColor(var7);
        this.field609.drawRect(this.field607 / 2 - 152, var8, 304, 34);
        this.field609.fillRect(this.field607 / 2 - 150, var8 + 2, arg1 * 3, 30);
        this.field609.setColor(Color.black);
        this.field609.fillRect(arg1 * 3 + this.field607 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field609.setFont(var4);
        this.field609.setColor(Color.white);
        this.field609.drawString(arg2, (this.field607 - var5.stringWidth(arg2)) / 2, var8 + 22);
    }
}
