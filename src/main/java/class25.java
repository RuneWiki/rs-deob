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

@OriginalClass("client!HXUVWQPY")
public class class25 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "Z")
    private boolean field877 = true;

    @OriginalMember(owner = "client!HXUVWQPY", name = "b", descriptor = "I")
    private int field878 = 720;

    @OriginalMember(owner = "client!HXUVWQPY", name = "e", descriptor = "I")
    private int field881 = 20;

    @OriginalMember(owner = "client!HXUVWQPY", name = "f", descriptor = "I")
    public int field882 = 1;

    @OriginalMember(owner = "client!HXUVWQPY", name = "g", descriptor = "[J")
    private long[] field883 = new long[10];

    @OriginalMember(owner = "client!HXUVWQPY", name = "i", descriptor = "Z")
    public boolean field885 = false;

    @OriginalMember(owner = "client!HXUVWQPY", name = "n", descriptor = "[LLOVQYTIZ;")
    public class38[] field890 = new class38[6];

    @OriginalMember(owner = "client!HXUVWQPY", name = "p", descriptor = "Z")
    public boolean field892 = true;

    @OriginalMember(owner = "client!HXUVWQPY", name = "q", descriptor = "Z")
    public boolean field893 = true;

    @OriginalMember(owner = "client!HXUVWQPY", name = "D", descriptor = "[I")
    public int[] field906 = new int[128];

    @OriginalMember(owner = "client!HXUVWQPY", name = "E", descriptor = "[I")
    private int[] field907 = new int[128];

    @OriginalMember(owner = "client!HXUVWQPY", name = "c", descriptor = "I")
    private int field879;

    @OriginalMember(owner = "client!HXUVWQPY", name = "d", descriptor = "I")
    private int field880;

    @OriginalMember(owner = "client!HXUVWQPY", name = "h", descriptor = "I")
    public int field884;

    @OriginalMember(owner = "client!HXUVWQPY", name = "j", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "client!HXUVWQPY", name = "k", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "client!HXUVWQPY", name = "r", descriptor = "I")
    public int field894;

    @OriginalMember(owner = "client!HXUVWQPY", name = "s", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "client!HXUVWQPY", name = "t", descriptor = "I")
    public int field896;

    @OriginalMember(owner = "client!HXUVWQPY", name = "u", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "client!HXUVWQPY", name = "v", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!HXUVWQPY", name = "w", descriptor = "I")
    public int field899;

    @OriginalMember(owner = "client!HXUVWQPY", name = "x", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!HXUVWQPY", name = "z", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!HXUVWQPY", name = "A", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "client!HXUVWQPY", name = "B", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "client!HXUVWQPY", name = "F", descriptor = "I")
    private int field908;

    @OriginalMember(owner = "client!HXUVWQPY", name = "G", descriptor = "I")
    private int field909;

    @OriginalMember(owner = "client!HXUVWQPY", name = "H", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!HXUVWQPY", name = "y", descriptor = "J")
    public long field901;

    @OriginalMember(owner = "client!HXUVWQPY", name = "C", descriptor = "J")
    public long field905;

    @OriginalMember(owner = "client!HXUVWQPY", name = "m", descriptor = "LAKBGAGNS;")
    public class1 field889;

    @OriginalMember(owner = "client!HXUVWQPY", name = "o", descriptor = "LLKLMGHHW;")
    public class37 field891;

    @OriginalMember(owner = "client!HXUVWQPY", name = "l", descriptor = "Ljava/awt/Graphics;")
    public Graphics field888;

    @OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "(III)V")
    public final void method246(int arg0, int arg1, int arg2) {
        this.field886 = arg0;
        this.field887 = arg1;
        this.field891 = new class37(this, this.field886, false, this.field887);
        this.field888 = this.method85(this.field877).getGraphics();
        if (arg2 != 1) {
            this.field877 = !this.field877;
        }
        this.field889 = new class1(this.field887, -826, this.method85(this.field877), this.field886);
        this.method154(this, 1);
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "b", descriptor = "(III)V")
    public final void method247(int arg0, int arg1, int arg2) {
        this.field886 = arg2;
        this.field887 = arg1;
        this.field888 = this.method85(this.field877).getGraphics();
        this.field889 = new class1(this.field887, -826, this.method85(this.field877), this.field886);
        if (arg0 != 37470) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.method154(this, 1);
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "run", descriptor = "()V")
    public void run() {
        this.method85(this.field877).addMouseListener(this);
        this.method85(this.field877).addMouseMotionListener(this);
        this.method85(this.field877).addKeyListener(this);
        this.method85(this.field877).addFocusListener(this);
        if (this.field891 != null) {
            this.field891.addWindowListener(this);
        }
        this.method118(0, "Loading...", 0);
        this.method124();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field883[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field880 < 0) {
                    if (this.field880 == -1) {
                        this.method248(-16);
                    }
                    return;
                }
                if (this.field880 > 0) {
                    this.field880--;
                    if (this.field880 == 0) {
                        this.method248(-16);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field883[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field883[var1]) {
                    var2 = (int) ((long) (this.field881 * 2560) / (var11 - this.field883[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field881 - (var11 - this.field883[var1]) / 10L);
                }
                if (var3 > this.field881) {
                    var3 = this.field881;
                }
                this.field883[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field883[var13] != 0L) {
                            this.field883[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field882) {
                    var3 = this.field882;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field902 = this.field898;
                    this.field903 = this.field899;
                    this.field904 = this.field900;
                    this.field905 = this.field901;
                    this.field898 = 0;
                    this.method147(670);
                    this.field908 = this.field909;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field881 > 0) {
                    this.field884 = var2 * 1000 / (this.field881 * 256);
                }
                this.method102(0);
            } while (!this.field885);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field883[var15]);
            }
            System.out.println("fps:" + this.field884 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field881 + " mindel:" + this.field882);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field885 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "(I)V")
    public final void method248(int arg0) {
        this.field880 = -2;
        this.method168(-41727);
        if (arg0 >= 0) {
            this.field878 = 177;
        }
        if (this.field891 == null) {
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

    @OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "(BI)V")
    public final void method249(byte arg0, int arg1) {
        if (arg0 != 3) {
            this.field879 = -335;
        }
        this.field881 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field880 >= 0) {
            this.field880 = 0;
        }
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field880 >= 0) {
            this.field880 = 4000 / this.field881;
        }
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field880 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field880 == -1) {
            this.method248(-16);
        }
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field888 == null) {
            this.field888 = arg0;
        }
        this.field892 = true;
        this.method51(true);
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field888 == null) {
            this.field888 = arg0;
        }
        this.field892 = true;
        this.method51(true);
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field891 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field894 = 0;
        this.field899 = var2;
        this.field900 = var3;
        this.field901 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field898 = 2;
            this.field895 = 2;
        } else {
            this.field898 = 1;
            this.field895 = 1;
        }
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field894 = 0;
        this.field895 = 0;
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field894 = 0;
        this.field896 = -1;
        this.field897 = -1;
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field891 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field894 = 0;
        this.field896 = var2;
        this.field897 = var3;
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field891 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field894 = 0;
        this.field896 = var2;
        this.field897 = var3;
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field894 = 0;
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
            this.field906[var3] = 1;
        }
        if (var3 > 4) {
            this.field907[this.field909] = var3;
            this.field909 = this.field909 + 1 & 0x7F;
        }
        if (class67.field1688) {
        }
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field894 = 0;
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
            this.field906[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "(B)I")
    public final int method250(byte arg0) {
        if (arg0 == 8) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = -1;
        if (this.field909 != this.field908) {
            var4 = this.field907[this.field908];
            this.field908 = this.field908 + 1 & 0x7F;
        }
        return var4;
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field893 = true;
        this.field892 = true;
        this.method51(true);
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field893 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field906[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "()V")
    public void method124() {
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "b", descriptor = "(I)V")
    public void method147(int arg0) {
        int var2 = 90 / arg0;
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "c", descriptor = "(I)V")
    public void method168(int arg0) {
        if (arg0 != -41727) {
            this.field879 = -88;
        }
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "d", descriptor = "(I)V")
    public void method102(int arg0) {
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "(Z)V")
    public void method51(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "b", descriptor = "(Z)Ljava/awt/Component;")
    public Component method85(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return this.field891 == null ? this : this.field891;
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method154(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!HXUVWQPY", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public void method118(int arg0, String arg1, int arg2) {
        while (this.field888 == null) {
            this.field888 = this.method85(this.field877).getGraphics();
            try {
                this.method85(this.field877).repaint();
            } catch (Exception var11) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var10) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method85(this.field877).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method85(this.field877).getFontMetrics(var6);
        if (this.field892) {
            this.field888.setColor(Color.black);
            this.field888.fillRect(0, 0, this.field886, this.field887);
            this.field892 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field887 / 2 - 18;
        this.field888.setColor(var7);
        this.field888.drawRect(this.field886 / 2 - 152, var8, 304, 34);
        this.field888.fillRect(this.field886 / 2 - 150, var8 + 2, arg0 * 3, 30);
        this.field888.setColor(Color.black);
        if (arg2 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field888.fillRect(arg0 * 3 + this.field886 / 2 - 150, var8 + 2, 300 - arg0 * 3, 30);
        this.field888.setFont(var4);
        this.field888.setColor(Color.white);
        this.field888.drawString(arg1, (this.field886 - var5.stringWidth(arg1)) / 2, var8 + 22);
    }
}
