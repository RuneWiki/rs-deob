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

@OriginalClass("KWRIFYWM")
public class class38 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "KWRIFYWM", name = "a", descriptor = "B")
    private byte field1038 = 4;

    @OriginalMember(owner = "KWRIFYWM", name = "b", descriptor = "I")
    private int field1039 = 6;

    @OriginalMember(owner = "KWRIFYWM", name = "c", descriptor = "Z")
    private boolean field1040 = false;

    @OriginalMember(owner = "KWRIFYWM", name = "e", descriptor = "I")
    private int field1042 = 20;

    @OriginalMember(owner = "KWRIFYWM", name = "f", descriptor = "I")
    public int field1043 = 1;

    @OriginalMember(owner = "KWRIFYWM", name = "g", descriptor = "[J")
    private long[] field1044 = new long[10];

    @OriginalMember(owner = "KWRIFYWM", name = "i", descriptor = "Z")
    public boolean field1046 = false;

    @OriginalMember(owner = "KWRIFYWM", name = "n", descriptor = "[LHOSNGCXH;")
    public class28[] field1051 = new class28[6];

    @OriginalMember(owner = "KWRIFYWM", name = "p", descriptor = "Z")
    public boolean field1053 = true;

    @OriginalMember(owner = "KWRIFYWM", name = "q", descriptor = "Z")
    public boolean field1054 = true;

    @OriginalMember(owner = "KWRIFYWM", name = "D", descriptor = "[I")
    public int[] field1067 = new int[128];

    @OriginalMember(owner = "KWRIFYWM", name = "E", descriptor = "[I")
    private int[] field1068 = new int[128];

    @OriginalMember(owner = "KWRIFYWM", name = "d", descriptor = "I")
    private int field1041;

    @OriginalMember(owner = "KWRIFYWM", name = "h", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "KWRIFYWM", name = "j", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "KWRIFYWM", name = "k", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "KWRIFYWM", name = "r", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "KWRIFYWM", name = "s", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "KWRIFYWM", name = "t", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "KWRIFYWM", name = "u", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "KWRIFYWM", name = "v", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "KWRIFYWM", name = "w", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "KWRIFYWM", name = "x", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "KWRIFYWM", name = "z", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "KWRIFYWM", name = "A", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "KWRIFYWM", name = "B", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "KWRIFYWM", name = "F", descriptor = "I")
    private int field1069;

    @OriginalMember(owner = "KWRIFYWM", name = "G", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "KWRIFYWM", name = "H", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "KWRIFYWM", name = "y", descriptor = "J")
    public long field1062;

    @OriginalMember(owner = "KWRIFYWM", name = "C", descriptor = "J")
    public long field1066;

    @OriginalMember(owner = "KWRIFYWM", name = "o", descriptor = "LHAQQOONQ;")
    public class26 field1052;

    @OriginalMember(owner = "KWRIFYWM", name = "m", descriptor = "LYJGBGRIO;")
    public class68 field1050;

    @OriginalMember(owner = "KWRIFYWM", name = "l", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1049;

    @OriginalMember(owner = "KWRIFYWM", name = "a", descriptor = "(IIZ)V")
    public final void method408(int arg0, int arg1, boolean arg2) {
        this.field1047 = arg1;
        this.field1048 = arg0;
        if (arg2) {
            this.field1040 = !this.field1040;
        }
        this.field1052 = new class26(this.field1048, this, true, this.field1047);
        this.field1049 = this.method139(this.field1039).getGraphics();
        this.field1050 = new class68(this.method139(this.field1039), true, this.field1047, this.field1048);
        this.method51(this, 1);
    }

    @OriginalMember(owner = "KWRIFYWM", name = "a", descriptor = "(III)V")
    public final void method409(int arg0, int arg1, int arg2) {
        this.field1047 = arg2;
        if (arg0 == 1) {
            this.field1048 = arg1;
            this.field1049 = this.method139(this.field1039).getGraphics();
            this.field1050 = new class68(this.method139(this.field1039), true, this.field1047, this.field1048);
            this.method51(this, 1);
        }
    }

    @OriginalMember(owner = "KWRIFYWM", name = "run", descriptor = "()V")
    public void run() {
        this.method139(this.field1039).addMouseListener(this);
        this.method139(this.field1039).addMouseMotionListener(this);
        this.method139(this.field1039).addKeyListener(this);
        this.method139(this.field1039).addFocusListener(this);
        if (this.field1052 != null) {
            this.field1052.addWindowListener(this);
        }
        this.method92("Loading...", 0, (byte) 8);
        this.method151();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1044[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1041 < 0) {
                    if (this.field1041 == -1) {
                        this.method410(1);
                    }
                    return;
                }
                if (this.field1041 > 0) {
                    this.field1041--;
                    if (this.field1041 == 0) {
                        this.method410(1);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1044[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1044[var1]) {
                    var2 = (int) ((long) (this.field1042 * 2560) / (var11 - this.field1044[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1042 - (var11 - this.field1044[var1]) / 10L);
                }
                if (var3 > this.field1042) {
                    var3 = this.field1042;
                }
                this.field1044[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1044[var13] != 0L) {
                            this.field1044[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1043) {
                    var3 = this.field1043;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1063 = this.field1059;
                    this.field1064 = this.field1060;
                    this.field1065 = this.field1061;
                    this.field1066 = this.field1062;
                    this.field1059 = 0;
                    this.method127((byte) 0);
                    this.field1069 = this.field1070;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1042 > 0) {
                    this.field1045 = var2 * 1000 / (this.field1042 * 256);
                }
                this.method150((byte) 0);
            } while (!this.field1046);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1044[var15]);
            }
            System.out.println("fps:" + this.field1045 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1042 + " mindel:" + this.field1043);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1046 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "KWRIFYWM", name = "a", descriptor = "(I)V")
    public final void method410(int arg0) {
        this.field1041 = -2;
        if (arg0 < 1 || arg0 > 1) {
            return;
        }
        this.method147((byte) 2);
        if (this.field1052 == null) {
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

    @OriginalMember(owner = "KWRIFYWM", name = "a", descriptor = "(BI)V")
    public final void method411(byte arg0, int arg1) {
        this.field1042 = 1000 / arg1;
        if (this.field1038 == arg0) {
            ;
        }
    }

    @OriginalMember(owner = "KWRIFYWM", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1041 >= 0) {
            this.field1041 = 0;
        }
    }

    @OriginalMember(owner = "KWRIFYWM", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1041 >= 0) {
            this.field1041 = 4000 / this.field1042;
        }
    }

    @OriginalMember(owner = "KWRIFYWM", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1041 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field1041 == -1) {
            this.method410(1);
        }
    }

    @OriginalMember(owner = "KWRIFYWM", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1049 == null) {
            this.field1049 = arg0;
        }
        this.field1053 = true;
        this.method109((byte) 94);
    }

    @OriginalMember(owner = "KWRIFYWM", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1049 == null) {
            this.field1049 = arg0;
        }
        this.field1053 = true;
        this.method109((byte) 94);
    }

    @OriginalMember(owner = "KWRIFYWM", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1052 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1055 = 0;
        this.field1060 = var2;
        this.field1061 = var3;
        this.field1062 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1059 = 2;
            this.field1056 = 2;
        } else {
            this.field1059 = 1;
            this.field1056 = 1;
        }
    }

    @OriginalMember(owner = "KWRIFYWM", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1055 = 0;
        this.field1056 = 0;
    }

    @OriginalMember(owner = "KWRIFYWM", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "KWRIFYWM", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "KWRIFYWM", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1055 = 0;
        this.field1057 = -1;
        this.field1058 = -1;
    }

    @OriginalMember(owner = "KWRIFYWM", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1052 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1055 = 0;
        this.field1057 = var2;
        this.field1058 = var3;
    }

    @OriginalMember(owner = "KWRIFYWM", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1052 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1055 = 0;
        this.field1057 = var2;
        this.field1058 = var3;
    }

    @OriginalMember(owner = "KWRIFYWM", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1055 = 0;
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
            this.field1067[var3] = 1;
        }
        if (var3 > 4) {
            this.field1068[this.field1070] = var3;
            this.field1070 = this.field1070 + 1 & 0x7F;
        }
        if (class33.field1009) {
        }
    }

    @OriginalMember(owner = "KWRIFYWM", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1055 = 0;
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
            this.field1067[var3] = 0;
        }
    }

    @OriginalMember(owner = "KWRIFYWM", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "KWRIFYWM", name = "a", descriptor = "(Z)I")
    public final int method412(boolean arg0) {
        int var2 = -1;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1070 != this.field1069) {
            var2 = this.field1068[this.field1069];
            this.field1069 = this.field1069 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "KWRIFYWM", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1054 = true;
        this.field1053 = true;
        this.method109((byte) 94);
    }

    @OriginalMember(owner = "KWRIFYWM", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1054 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1067[var2] = 0;
        }
    }

    @OriginalMember(owner = "KWRIFYWM", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "KWRIFYWM", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "KWRIFYWM", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "KWRIFYWM", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "KWRIFYWM", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "KWRIFYWM", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "KWRIFYWM", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "KWRIFYWM", name = "a", descriptor = "()V")
    public void method151() {
    }

    @OriginalMember(owner = "KWRIFYWM", name = "a", descriptor = "(B)V")
    public void method127(byte arg0) {
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "KWRIFYWM", name = "b", descriptor = "(B)V")
    public void method147(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
        }
    }

    @OriginalMember(owner = "KWRIFYWM", name = "c", descriptor = "(B)V")
    public void method150(byte arg0) {
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "KWRIFYWM", name = "d", descriptor = "(B)V")
    public void method109(byte arg0) {
        if (arg0 == 94) {
            ;
        }
    }

    @OriginalMember(owner = "KWRIFYWM", name = "b", descriptor = "(I)Ljava/awt/Component;")
    public Component method139(int arg0) {
        if (arg0 < 6 || arg0 > 6) {
            throw new NullPointerException();
        }
        return this.field1052 == null ? this : this.field1052;
    }

    @OriginalMember(owner = "KWRIFYWM", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method51(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "KWRIFYWM", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public void method92(String arg0, int arg1, byte arg2) {
        while (this.field1049 == null) {
            this.field1049 = this.method139(this.field1039).getGraphics();
            try {
                this.method139(this.field1039).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method139(this.field1039).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method139(this.field1039).getFontMetrics(var6);
        if (this.field1053) {
            this.field1049.setColor(Color.black);
            this.field1049.fillRect(0, 0, this.field1047, this.field1048);
            this.field1053 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field1048 / 2 - 18;
        this.field1049.setColor(var7);
        this.field1049.drawRect(this.field1047 / 2 - 152, var8, 304, 34);
        this.field1049.fillRect(this.field1047 / 2 - 150, var8 + 2, arg1 * 3, 30);
        this.field1049.setColor(Color.black);
        if (arg2 != 8) {
            this.field1040 = !this.field1040;
        }
        this.field1049.fillRect(arg1 * 3 + this.field1047 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field1049.setFont(var4);
        this.field1049.setColor(Color.white);
        this.field1049.drawString(arg0, (this.field1047 - var5.stringWidth(arg0)) / 2, var8 + 22);
    }
}
