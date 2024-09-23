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

@OriginalClass("KISFBCOP")
public class class27 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "KISFBCOP", name = "a", descriptor = "Z")
    private boolean field892 = false;

    @OriginalMember(owner = "KISFBCOP", name = "b", descriptor = "I")
    private int field893 = 171;

    @OriginalMember(owner = "KISFBCOP", name = "c", descriptor = "Z")
    private boolean field894 = true;

    @OriginalMember(owner = "KISFBCOP", name = "d", descriptor = "I")
    private int field895 = 19413;

    @OriginalMember(owner = "KISFBCOP", name = "e", descriptor = "I")
    private int field896 = 883;

    @OriginalMember(owner = "KISFBCOP", name = "g", descriptor = "I")
    private int field898 = 20;

    @OriginalMember(owner = "KISFBCOP", name = "h", descriptor = "I")
    public int field899 = 1;

    @OriginalMember(owner = "KISFBCOP", name = "i", descriptor = "[J")
    private long[] field900 = new long[10];

    @OriginalMember(owner = "KISFBCOP", name = "k", descriptor = "Z")
    public boolean field902 = false;

    @OriginalMember(owner = "KISFBCOP", name = "p", descriptor = "[LXANVNPIN;")
    public class65[] field907 = new class65[6];

    @OriginalMember(owner = "KISFBCOP", name = "r", descriptor = "Z")
    public boolean field909 = true;

    @OriginalMember(owner = "KISFBCOP", name = "s", descriptor = "Z")
    public boolean field910 = true;

    @OriginalMember(owner = "KISFBCOP", name = "F", descriptor = "[I")
    public int[] field923 = new int[128];

    @OriginalMember(owner = "KISFBCOP", name = "G", descriptor = "[I")
    private int[] field924 = new int[128];

    @OriginalMember(owner = "KISFBCOP", name = "f", descriptor = "I")
    private int field897;

    @OriginalMember(owner = "KISFBCOP", name = "j", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "KISFBCOP", name = "l", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "KISFBCOP", name = "m", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "KISFBCOP", name = "t", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "KISFBCOP", name = "u", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "KISFBCOP", name = "v", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "KISFBCOP", name = "w", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "KISFBCOP", name = "x", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "KISFBCOP", name = "y", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "KISFBCOP", name = "z", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "KISFBCOP", name = "B", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "KISFBCOP", name = "C", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "KISFBCOP", name = "D", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "KISFBCOP", name = "H", descriptor = "I")
    private int field925;

    @OriginalMember(owner = "KISFBCOP", name = "I", descriptor = "I")
    private int field926;

    @OriginalMember(owner = "KISFBCOP", name = "J", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "KISFBCOP", name = "A", descriptor = "J")
    public long field918;

    @OriginalMember(owner = "KISFBCOP", name = "E", descriptor = "J")
    public long field922;

    @OriginalMember(owner = "KISFBCOP", name = "o", descriptor = "LTRQPVNER;")
    public class57 field906;

    @OriginalMember(owner = "KISFBCOP", name = "q", descriptor = "LUNSEVWCI;")
    public class60 field908;

    @OriginalMember(owner = "KISFBCOP", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics field905;

    @OriginalMember(owner = "KISFBCOP", name = "a", descriptor = "(III)V")
    public final void method297(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        this.field903 = arg0;
        this.field904 = arg1;
        this.field908 = new class60(this, this.field903, 2, this.field904);
        this.field905 = this.method73((byte) 0).getGraphics();
        this.field906 = new class57(this.field903, true, this.method73((byte) 0), this.field904);
        this.method86(this, 1);
    }

    @OriginalMember(owner = "KISFBCOP", name = "a", descriptor = "(IZI)V")
    public final void method298(int arg0, boolean arg1, int arg2) {
        this.field903 = arg2;
        this.field904 = arg0;
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field905 = this.method73((byte) 0).getGraphics();
        this.field906 = new class57(this.field903, true, this.method73((byte) 0), this.field904);
        this.method86(this, 1);
    }

    @OriginalMember(owner = "KISFBCOP", name = "run", descriptor = "()V")
    public void run() {
        this.method73((byte) 0).addMouseListener(this);
        this.method73((byte) 0).addMouseMotionListener(this);
        this.method73((byte) 0).addKeyListener(this);
        this.method73((byte) 0).addFocusListener(this);
        if (this.field908 != null) {
            this.field908.addWindowListener(this);
        }
        this.method27(0, "Loading...", -211);
        this.method93();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field900[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field897 < 0) {
                    if (this.field897 == -1) {
                        this.method299((byte) -101);
                    }
                    return;
                }
                if (this.field897 > 0) {
                    this.field897--;
                    if (this.field897 == 0) {
                        this.method299((byte) -101);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field900[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field900[var1]) {
                    var2 = (int) ((long) (this.field898 * 2560) / (var11 - this.field900[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field898 - (var11 - this.field900[var1]) / 10L);
                }
                if (var3 > this.field898) {
                    var3 = this.field898;
                }
                this.field900[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field900[var13] != 0L) {
                            this.field900[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field899) {
                    var3 = this.field899;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field919 = this.field915;
                    this.field920 = this.field916;
                    this.field921 = this.field917;
                    this.field922 = this.field918;
                    this.field915 = 0;
                    this.method56(-25033);
                    this.field925 = this.field926;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field898 > 0) {
                    this.field901 = var2 * 1000 / (this.field898 * 256);
                }
                this.method58((byte) 91);
            } while (!this.field902);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field900[var15]);
            }
            System.out.println("fps:" + this.field901 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field898 + " mindel:" + this.field899);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field902 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "KISFBCOP", name = "a", descriptor = "(B)V")
    public final void method299(byte arg0) {
        this.field897 = -2;
        this.method81(false);
        if (arg0 != -101) {
            this.field896 = 418;
        }
        if (this.field908 == null) {
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

    @OriginalMember(owner = "KISFBCOP", name = "a", descriptor = "(II)V")
    public final void method300(int arg0, int arg1) {
        this.field898 = 1000 / arg0;
        if (arg1 != 0) {
            this.field896 = 185;
        }
    }

    @OriginalMember(owner = "KISFBCOP", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field897 >= 0) {
            this.field897 = 0;
        }
    }

    @OriginalMember(owner = "KISFBCOP", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field897 >= 0) {
            this.field897 = 4000 / this.field898;
        }
    }

    @OriginalMember(owner = "KISFBCOP", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field897 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field897 == -1) {
            this.method299((byte) -101);
        }
    }

    @OriginalMember(owner = "KISFBCOP", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field905 == null) {
            this.field905 = arg0;
        }
        this.field909 = true;
        this.method89(-789);
    }

    @OriginalMember(owner = "KISFBCOP", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field905 == null) {
            this.field905 = arg0;
        }
        this.field909 = true;
        this.method89(-789);
    }

    @OriginalMember(owner = "KISFBCOP", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field908 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field911 = 0;
        this.field916 = var2;
        this.field917 = var3;
        this.field918 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field915 = 2;
            this.field912 = 2;
        } else {
            this.field915 = 1;
            this.field912 = 1;
        }
    }

    @OriginalMember(owner = "KISFBCOP", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field911 = 0;
        this.field912 = 0;
    }

    @OriginalMember(owner = "KISFBCOP", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "KISFBCOP", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "KISFBCOP", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field911 = 0;
        this.field913 = -1;
        this.field914 = -1;
    }

    @OriginalMember(owner = "KISFBCOP", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field908 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field911 = 0;
        this.field913 = var2;
        this.field914 = var3;
    }

    @OriginalMember(owner = "KISFBCOP", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field908 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field911 = 0;
        this.field913 = var2;
        this.field914 = var3;
    }

    @OriginalMember(owner = "KISFBCOP", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field911 = 0;
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
            this.field923[var3] = 1;
        }
        if (var3 > 4) {
            this.field924[this.field926] = var3;
            this.field926 = this.field926 + 1 & 0x7F;
        }
        if (class2.field14) {
        }
    }

    @OriginalMember(owner = "KISFBCOP", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field911 = 0;
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
            this.field923[var3] = 0;
        }
    }

    @OriginalMember(owner = "KISFBCOP", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "KISFBCOP", name = "a", descriptor = "(Z)I")
    public final int method301(boolean arg0) {
        int var2 = -1;
        if (!arg0) {
            this.field892 = !this.field892;
        }
        if (this.field926 != this.field925) {
            var2 = this.field924[this.field925];
            this.field925 = this.field925 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "KISFBCOP", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field910 = true;
        this.field909 = true;
        this.method89(-789);
    }

    @OriginalMember(owner = "KISFBCOP", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field910 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field923[var2] = 0;
        }
    }

    @OriginalMember(owner = "KISFBCOP", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "KISFBCOP", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "KISFBCOP", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "KISFBCOP", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "KISFBCOP", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "KISFBCOP", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "KISFBCOP", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "KISFBCOP", name = "a", descriptor = "()V")
    public void method93() {
    }

    @OriginalMember(owner = "KISFBCOP", name = "a", descriptor = "(I)V")
    public void method56(int arg0) {
        if (arg0 == -25033) {
            ;
        }
    }

    @OriginalMember(owner = "KISFBCOP", name = "b", descriptor = "(Z)V")
    public void method81(boolean arg0) {
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "KISFBCOP", name = "b", descriptor = "(B)V")
    public void method58(byte arg0) {
        if (arg0 == 91) {
            ;
        }
    }

    @OriginalMember(owner = "KISFBCOP", name = "b", descriptor = "(I)V")
    public void method89(int arg0) {
        while (arg0 >= 0) {
            this.field893 = 382;
        }
    }

    @OriginalMember(owner = "KISFBCOP", name = "c", descriptor = "(B)Ljava/awt/Component;")
    public Component method73(byte arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return this.field908 == null ? this : this.field908;
    }

    @OriginalMember(owner = "KISFBCOP", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method86(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "KISFBCOP", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public void method27(int arg0, String arg1, int arg2) {
        while (this.field905 == null) {
            this.field905 = this.method73((byte) 0).getGraphics();
            try {
                this.method73((byte) 0).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method73((byte) 0).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method73((byte) 0).getFontMetrics(var6);
        if (this.field909) {
            this.field905.setColor(Color.black);
            this.field905.fillRect(0, 0, this.field903, this.field904);
            this.field909 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field904 / 2 - 18;
        this.field905.setColor(var7);
        this.field905.drawRect(this.field903 / 2 - 152, var8, 304, 34);
        this.field905.fillRect(this.field903 / 2 - 150, var8 + 2, arg0 * 3, 30);
        if (arg2 >= 0) {
            return;
        }
        this.field905.setColor(Color.black);
        this.field905.fillRect(arg0 * 3 + this.field903 / 2 - 150, var8 + 2, 300 - arg0 * 3, 30);
        this.field905.setFont(var4);
        this.field905.setColor(Color.white);
        this.field905.drawString(arg1, (this.field903 - var5.stringWidth(arg1)) / 2, var8 + 22);
    }
}
