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

@OriginalClass("client!BFZNZUKL")
public class class2 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "I")
    private int field13 = -35195;

    @OriginalMember(owner = "client!BFZNZUKL", name = "b", descriptor = "Z")
    private boolean field14 = true;

    @OriginalMember(owner = "client!BFZNZUKL", name = "c", descriptor = "I")
    private int field15 = 10685;

    @OriginalMember(owner = "client!BFZNZUKL", name = "d", descriptor = "Z")
    private boolean field16 = true;

    @OriginalMember(owner = "client!BFZNZUKL", name = "f", descriptor = "I")
    private int field18 = 20;

    @OriginalMember(owner = "client!BFZNZUKL", name = "g", descriptor = "I")
    public int field19 = 1;

    @OriginalMember(owner = "client!BFZNZUKL", name = "h", descriptor = "[J")
    private long[] field20 = new long[10];

    @OriginalMember(owner = "client!BFZNZUKL", name = "j", descriptor = "Z")
    public boolean field22 = false;

    @OriginalMember(owner = "client!BFZNZUKL", name = "o", descriptor = "[LQEHNWGKD;")
    public class48[] field27 = new class48[6];

    @OriginalMember(owner = "client!BFZNZUKL", name = "q", descriptor = "Z")
    public boolean field29 = true;

    @OriginalMember(owner = "client!BFZNZUKL", name = "r", descriptor = "Z")
    public boolean field30 = true;

    @OriginalMember(owner = "client!BFZNZUKL", name = "E", descriptor = "[I")
    public int[] field43 = new int[128];

    @OriginalMember(owner = "client!BFZNZUKL", name = "F", descriptor = "[I")
    private int[] field44 = new int[128];

    @OriginalMember(owner = "client!BFZNZUKL", name = "e", descriptor = "I")
    private int field17;

    @OriginalMember(owner = "client!BFZNZUKL", name = "i", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "client!BFZNZUKL", name = "k", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "client!BFZNZUKL", name = "l", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "client!BFZNZUKL", name = "s", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!BFZNZUKL", name = "t", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!BFZNZUKL", name = "u", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "client!BFZNZUKL", name = "v", descriptor = "I")
    public int field34;

    @OriginalMember(owner = "client!BFZNZUKL", name = "w", descriptor = "I")
    public int field35;

    @OriginalMember(owner = "client!BFZNZUKL", name = "x", descriptor = "I")
    public int field36;

    @OriginalMember(owner = "client!BFZNZUKL", name = "y", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "client!BFZNZUKL", name = "A", descriptor = "I")
    public int field39;

    @OriginalMember(owner = "client!BFZNZUKL", name = "B", descriptor = "I")
    public int field40;

    @OriginalMember(owner = "client!BFZNZUKL", name = "C", descriptor = "I")
    public int field41;

    @OriginalMember(owner = "client!BFZNZUKL", name = "G", descriptor = "I")
    private int field45;

    @OriginalMember(owner = "client!BFZNZUKL", name = "H", descriptor = "I")
    private int field46;

    @OriginalMember(owner = "client!BFZNZUKL", name = "I", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!BFZNZUKL", name = "z", descriptor = "J")
    public long field38;

    @OriginalMember(owner = "client!BFZNZUKL", name = "D", descriptor = "J")
    public long field42;

    @OriginalMember(owner = "client!BFZNZUKL", name = "n", descriptor = "LMEXICRKY;")
    public class35 field26;

    @OriginalMember(owner = "client!BFZNZUKL", name = "p", descriptor = "LVCIVYIXH;")
    public class58 field28;

    @OriginalMember(owner = "client!BFZNZUKL", name = "m", descriptor = "Ljava/awt/Graphics;")
    public Graphics field25;

    @OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "(IZI)V")
    public final void method1(int arg0, boolean arg1, int arg2) {
        this.field23 = arg0;
        this.field24 = arg2;
        this.field28 = new class58(this.field24, this, this.field23, 0);
        this.field25 = this.method11(735).getGraphics();
        this.field26 = new class35(this.field24, 0, this.field23, this.method11(735));
        this.method12(this, 1);
        if (!arg1) {
            this.field13 = -194;
        }
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "(IIB)V")
    public final void method2(int arg0, int arg1, byte arg2) {
        if (arg2 != -94) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field23 = arg0;
        this.field24 = arg1;
        this.field25 = this.method11(735).getGraphics();
        this.field26 = new class35(this.field24, 0, this.field23, this.method11(735));
        this.method12(this, 1);
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "run", descriptor = "()V")
    public void run() {
        this.method11(735).addMouseListener(this);
        this.method11(735).addMouseMotionListener(this);
        this.method11(735).addKeyListener(this);
        this.method11(735).addFocusListener(this);
        if (this.field28 != null) {
            this.field28.addWindowListener(this);
        }
        this.method13(0, (byte) 6, "Loading...");
        this.method6();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field20[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field17 < 0) {
                    if (this.field17 == -1) {
                        this.method3(true);
                    }
                    return;
                }
                if (this.field17 > 0) {
                    this.field17--;
                    if (this.field17 == 0) {
                        this.method3(true);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field20[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field20[var1]) {
                    var2 = (int) ((long) (this.field18 * 2560) / (var11 - this.field20[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field18 - (var11 - this.field20[var1]) / 10L);
                }
                if (var3 > this.field18) {
                    var3 = this.field18;
                }
                this.field20[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field20[var13] != 0L) {
                            this.field20[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field19) {
                    var3 = this.field19;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field39 = this.field35;
                    this.field40 = this.field36;
                    this.field41 = this.field37;
                    this.field42 = this.field38;
                    this.field35 = 0;
                    this.method7(10685);
                    this.field45 = this.field46;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field18 > 0) {
                    this.field21 = var2 * 1000 / (this.field18 * 256);
                }
                this.method9(0);
            } while (!this.field22);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field20[var15]);
            }
            System.out.println("fps:" + this.field21 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field18 + " mindel:" + this.field19);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field22 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "(Z)V")
    public final void method3(boolean arg0) {
        this.field17 = -2;
        if (!arg0) {
            return;
        }
        this.method8(false);
        if (this.field28 == null) {
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

    @OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "(II)V")
    public final void method4(int arg0, int arg1) {
        this.field18 = 1000 / arg1;
        if (arg0 < 1 || arg0 > 1) {
            this.field16 = !this.field16;
        }
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field17 >= 0) {
            this.field17 = 0;
        }
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field17 >= 0) {
            this.field17 = 4000 / this.field18;
        }
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field17 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field17 == -1) {
            this.method3(true);
        }
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field25 == null) {
            this.field25 = arg0;
        }
        this.field29 = true;
        this.method10(25399);
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field25 == null) {
            this.field25 = arg0;
        }
        this.field29 = true;
        this.method10(25399);
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field28 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field31 = 0;
        this.field36 = var2;
        this.field37 = var3;
        this.field38 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field35 = 2;
            this.field32 = 2;
        } else {
            this.field35 = 1;
            this.field32 = 1;
        }
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field31 = 0;
        this.field32 = 0;
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field31 = 0;
        this.field33 = -1;
        this.field34 = -1;
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field28 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field31 = 0;
        this.field33 = var2;
        this.field34 = var3;
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field28 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field31 = 0;
        this.field33 = var2;
        this.field34 = var3;
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field31 = 0;
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
            this.field43[var3] = 1;
        }
        if (var3 > 4) {
            this.field44[this.field46] = var3;
            this.field46 = this.field46 + 1 & 0x7F;
        }
        if (class3.field51) {
        }
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field31 = 0;
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
            this.field43[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "(I)I")
    public final int method5(int arg0) {
        int var2 = -1;
        if (arg0 != -36198) {
            this.field16 = !this.field16;
        }
        if (this.field46 != this.field45) {
            var2 = this.field44[this.field45];
            this.field45 = this.field45 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field30 = true;
        this.field29 = true;
        this.method10(25399);
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field30 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field43[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "()V")
    public void method6() {
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "b", descriptor = "(I)V")
    public void method7(int arg0) {
        if (this.field15 != arg0) {
            this.field14 = !this.field14;
        }
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "b", descriptor = "(Z)V")
    public void method8(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "c", descriptor = "(I)V")
    public void method9(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "d", descriptor = "(I)V")
    public void method10(int arg0) {
        if (arg0 == 25399) {
            ;
        }
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public Component method11(int arg0) {
        int var2 = 12 / arg0;
        return this.field28 == null ? this : this.field28;
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method12(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!BFZNZUKL", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public void method13(int arg0, byte arg1, String arg2) {
        while (this.field25 == null) {
            this.field25 = this.method11(735).getGraphics();
            try {
                this.method11(735).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method11(735).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method11(735).getFontMetrics(var6);
        if (arg1 != 6) {
            this.field15 = 227;
        }
        if (this.field29) {
            this.field25.setColor(Color.black);
            this.field25.fillRect(0, 0, this.field23, this.field24);
            this.field29 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field24 / 2 - 18;
        this.field25.setColor(var7);
        this.field25.drawRect(this.field23 / 2 - 152, var8, 304, 34);
        this.field25.fillRect(this.field23 / 2 - 150, var8 + 2, arg0 * 3, 30);
        this.field25.setColor(Color.black);
        this.field25.fillRect(arg0 * 3 + this.field23 / 2 - 150, var8 + 2, 300 - arg0 * 3, 30);
        this.field25.setFont(var4);
        this.field25.setColor(Color.white);
        this.field25.drawString(arg2, (this.field23 - var5.stringWidth(arg2)) / 2, var8 + 22);
    }
}
