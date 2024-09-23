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

@OriginalClass("AMTYETOI")
public class class1 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "AMTYETOI", name = "a", descriptor = "Z")
    private boolean field1 = false;

    @OriginalMember(owner = "AMTYETOI", name = "b", descriptor = "I")
    private int field2 = 531;

    @OriginalMember(owner = "AMTYETOI", name = "d", descriptor = "I")
    private int field4 = 20;

    @OriginalMember(owner = "AMTYETOI", name = "e", descriptor = "I")
    public int field5 = 1;

    @OriginalMember(owner = "AMTYETOI", name = "f", descriptor = "[J")
    private long[] field6 = new long[10];

    @OriginalMember(owner = "AMTYETOI", name = "h", descriptor = "Z")
    public boolean field8 = false;

    @OriginalMember(owner = "AMTYETOI", name = "m", descriptor = "[LIBHVCUAH;")
    public class19[] field13 = new class19[6];

    @OriginalMember(owner = "AMTYETOI", name = "o", descriptor = "Z")
    public boolean field15 = true;

    @OriginalMember(owner = "AMTYETOI", name = "p", descriptor = "Z")
    public boolean field16 = true;

    @OriginalMember(owner = "AMTYETOI", name = "C", descriptor = "[I")
    public int[] field29 = new int[128];

    @OriginalMember(owner = "AMTYETOI", name = "D", descriptor = "[I")
    private int[] field30 = new int[128];

    @OriginalMember(owner = "AMTYETOI", name = "j", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "AMTYETOI", name = "q", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "AMTYETOI", name = "r", descriptor = "I")
    public int field18;

    @OriginalMember(owner = "AMTYETOI", name = "s", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "AMTYETOI", name = "t", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "AMTYETOI", name = "u", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "AMTYETOI", name = "v", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "AMTYETOI", name = "w", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "AMTYETOI", name = "y", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "AMTYETOI", name = "z", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "AMTYETOI", name = "A", descriptor = "I")
    public int field27;

    @OriginalMember(owner = "AMTYETOI", name = "c", descriptor = "I")
    private int field3;

    @OriginalMember(owner = "AMTYETOI", name = "E", descriptor = "I")
    private int field31;

    @OriginalMember(owner = "AMTYETOI", name = "F", descriptor = "I")
    private int field32;

    @OriginalMember(owner = "AMTYETOI", name = "G", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "AMTYETOI", name = "g", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "AMTYETOI", name = "i", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "AMTYETOI", name = "x", descriptor = "J")
    public long field24;

    @OriginalMember(owner = "AMTYETOI", name = "B", descriptor = "J")
    public long field28;

    @OriginalMember(owner = "AMTYETOI", name = "n", descriptor = "LAMZVDPPJ;")
    public class2 field14;

    @OriginalMember(owner = "AMTYETOI", name = "l", descriptor = "LPKTDMNAV;")
    public class42 field12;

    @OriginalMember(owner = "AMTYETOI", name = "k", descriptor = "Ljava/awt/Graphics;")
    public Graphics field11;

    @OriginalMember(owner = "AMTYETOI", name = "a", descriptor = "(III)V")
    public final void method1(int arg0, int arg1, int arg2) {
        this.field9 = arg1;
        if (arg0 != 2) {
            return;
        }
        this.field10 = arg2;
        this.field14 = new class2(false, this, this.field10, this.field9);
        this.field11 = this.method11(false).getGraphics();
        this.field12 = new class42(this.field9, this.method11(false), this.field10, (byte) 33);
        this.method12(this, 1);
    }

    @OriginalMember(owner = "AMTYETOI", name = "a", descriptor = "(IIB)V")
    public final void method2(int arg0, int arg1, byte arg2) {
        this.field9 = arg1;
        this.field10 = arg0;
        this.field11 = this.method11(false).getGraphics();
        this.field12 = new class42(this.field9, this.method11(false), this.field10, (byte) 33);
        this.method12(this, 1);
        if (arg2 == 19) {
            ;
        }
    }

    @OriginalMember(owner = "AMTYETOI", name = "run", descriptor = "()V")
    public void run() {
        this.method11(false).addMouseListener(this);
        this.method11(false).addMouseMotionListener(this);
        this.method11(false).addKeyListener(this);
        this.method11(false).addFocusListener(this);
        if (this.field14 != null) {
            this.field14.addWindowListener(this);
        }
        this.method13(0, "Loading...", false);
        this.method6();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field6[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field3 < 0) {
                    if (this.field3 == -1) {
                        this.method3(false);
                    }
                    return;
                }
                if (this.field3 > 0) {
                    this.field3--;
                    if (this.field3 == 0) {
                        this.method3(false);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field6[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field6[var1]) {
                    var2 = (int) ((long) (this.field4 * 2560) / (var11 - this.field6[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field4 - (var11 - this.field6[var1]) / 10L);
                }
                if (var3 > this.field4) {
                    var3 = this.field4;
                }
                this.field6[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field6[var13] != 0L) {
                            this.field6[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field5) {
                    var3 = this.field5;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field25 = this.field21;
                    this.field26 = this.field22;
                    this.field27 = this.field23;
                    this.field28 = this.field24;
                    this.field21 = 0;
                    this.method7(true);
                    this.field31 = this.field32;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field4 > 0) {
                    this.field7 = var2 * 1000 / (this.field4 * 256);
                }
                this.method9(-601);
            } while (!this.field8);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field6[var15]);
            }
            System.out.println("fps:" + this.field7 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field4 + " mindel:" + this.field5);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field8 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "AMTYETOI", name = "a", descriptor = "(Z)V")
    public final void method3(boolean arg0) {
        this.field3 = -2;
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.method8(0);
        if (this.field14 == null) {
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

    @OriginalMember(owner = "AMTYETOI", name = "a", descriptor = "(IZ)V")
    public final void method4(int arg0, boolean arg1) {
        if (!arg1) {
            this.field2 = 422;
        }
        this.field4 = 1000 / arg0;
    }

    @OriginalMember(owner = "AMTYETOI", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field3 >= 0) {
            this.field3 = 0;
        }
    }

    @OriginalMember(owner = "AMTYETOI", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field3 >= 0) {
            this.field3 = 4000 / this.field4;
        }
    }

    @OriginalMember(owner = "AMTYETOI", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field3 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field3 == -1) {
            this.method3(false);
        }
    }

    @OriginalMember(owner = "AMTYETOI", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field11 == null) {
            this.field11 = arg0;
        }
        this.field15 = true;
        this.method10(true);
    }

    @OriginalMember(owner = "AMTYETOI", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field11 == null) {
            this.field11 = arg0;
        }
        this.field15 = true;
        this.method10(true);
    }

    @OriginalMember(owner = "AMTYETOI", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field14 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field17 = 0;
        this.field22 = var2;
        this.field23 = var3;
        this.field24 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field21 = 2;
            this.field18 = 2;
        } else {
            this.field21 = 1;
            this.field18 = 1;
        }
    }

    @OriginalMember(owner = "AMTYETOI", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field17 = 0;
        this.field18 = 0;
    }

    @OriginalMember(owner = "AMTYETOI", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "AMTYETOI", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "AMTYETOI", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field17 = 0;
        this.field19 = -1;
        this.field20 = -1;
    }

    @OriginalMember(owner = "AMTYETOI", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field14 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field17 = 0;
        this.field19 = var2;
        this.field20 = var3;
    }

    @OriginalMember(owner = "AMTYETOI", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field14 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field17 = 0;
        this.field19 = var2;
        this.field20 = var3;
    }

    @OriginalMember(owner = "AMTYETOI", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field17 = 0;
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
            this.field29[var3] = 1;
        }
        if (var3 > 4) {
            this.field30[this.field32] = var3;
            this.field32 = this.field32 + 1 & 0x7F;
        }
        if (class40.field1193) {
        }
    }

    @OriginalMember(owner = "AMTYETOI", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field17 = 0;
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
            this.field29[var3] = 0;
        }
    }

    @OriginalMember(owner = "AMTYETOI", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "AMTYETOI", name = "b", descriptor = "(Z)I")
    public final int method5(boolean arg0) {
        int var2 = -1;
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field32 != this.field31) {
            var2 = this.field30[this.field31];
            this.field31 = this.field31 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "AMTYETOI", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field16 = true;
        this.field15 = true;
        this.method10(true);
    }

    @OriginalMember(owner = "AMTYETOI", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field16 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field29[var2] = 0;
        }
    }

    @OriginalMember(owner = "AMTYETOI", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AMTYETOI", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AMTYETOI", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "AMTYETOI", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AMTYETOI", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AMTYETOI", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AMTYETOI", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "AMTYETOI", name = "a", descriptor = "()V")
    public void method6() {
    }

    @OriginalMember(owner = "AMTYETOI", name = "c", descriptor = "(Z)V")
    public void method7(boolean arg0) {
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "AMTYETOI", name = "a", descriptor = "(I)V")
    public void method8(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "AMTYETOI", name = "b", descriptor = "(I)V")
    public void method9(int arg0) {
        if (arg0 >= 0) {
            this.field1 = !this.field1;
        }
    }

    @OriginalMember(owner = "AMTYETOI", name = "d", descriptor = "(Z)V")
    public void method10(boolean arg0) {
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "AMTYETOI", name = "e", descriptor = "(Z)Ljava/awt/Component;")
    public Component method11(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else if (this.field14 == null) {
            return this;
        } else {
            return this.field14;
        }
    }

    @OriginalMember(owner = "AMTYETOI", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method12(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "AMTYETOI", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public void method13(int arg0, String arg1, boolean arg2) {
        while (this.field11 == null) {
            this.field11 = this.method11(false).getGraphics();
            try {
                this.method11(false).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method11(false).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method11(false).getFontMetrics(var6);
        if (this.field15) {
            this.field11.setColor(Color.black);
            this.field11.fillRect(0, 0, this.field9, this.field10);
            this.field15 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field10 / 2 - 18;
        this.field11.setColor(var7);
        this.field11.drawRect(this.field9 / 2 - 152, var8, 304, 34);
        this.field11.fillRect(this.field9 / 2 - 150, var8 + 2, arg0 * 3, 30);
        this.field11.setColor(Color.black);
        this.field11.fillRect(arg0 * 3 + this.field9 / 2 - 150, var8 + 2, 300 - arg0 * 3, 30);
        this.field11.setFont(var4);
        this.field11.setColor(Color.white);
        if (arg2) {
            this.field1 = !this.field1;
        }
        this.field11.drawString(arg1, (this.field9 - var5.stringWidth(arg1)) / 2, var8 + 22);
    }
}
