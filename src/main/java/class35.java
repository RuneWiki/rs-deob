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

@OriginalClass("MUZNSFEY")
public class class35 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "MUZNSFEY", name = "a", descriptor = "I")
    private int field1026 = 664;

    @OriginalMember(owner = "MUZNSFEY", name = "b", descriptor = "I")
    private int field1027 = 7;

    @OriginalMember(owner = "MUZNSFEY", name = "c", descriptor = "B")
    private byte field1028 = 1;

    @OriginalMember(owner = "MUZNSFEY", name = "d", descriptor = "Z")
    private boolean field1029 = false;

    @OriginalMember(owner = "MUZNSFEY", name = "f", descriptor = "I")
    private int field1031 = 20;

    @OriginalMember(owner = "MUZNSFEY", name = "g", descriptor = "I")
    public int field1032 = 1;

    @OriginalMember(owner = "MUZNSFEY", name = "h", descriptor = "[J")
    private long[] field1033 = new long[10];

    @OriginalMember(owner = "MUZNSFEY", name = "j", descriptor = "Z")
    public boolean field1035 = false;

    @OriginalMember(owner = "MUZNSFEY", name = "o", descriptor = "[LDYPVESKW;")
    public class14[] field1040 = new class14[6];

    @OriginalMember(owner = "MUZNSFEY", name = "q", descriptor = "Z")
    public boolean field1042 = true;

    @OriginalMember(owner = "MUZNSFEY", name = "r", descriptor = "Z")
    public boolean field1043 = true;

    @OriginalMember(owner = "MUZNSFEY", name = "E", descriptor = "[I")
    public int[] field1056 = new int[128];

    @OriginalMember(owner = "MUZNSFEY", name = "F", descriptor = "[I")
    private int[] field1057 = new int[128];

    @OriginalMember(owner = "MUZNSFEY", name = "e", descriptor = "I")
    private int field1030;

    @OriginalMember(owner = "MUZNSFEY", name = "i", descriptor = "I")
    public int field1034;

    @OriginalMember(owner = "MUZNSFEY", name = "k", descriptor = "I")
    public int field1036;

    @OriginalMember(owner = "MUZNSFEY", name = "l", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "MUZNSFEY", name = "s", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "MUZNSFEY", name = "t", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "MUZNSFEY", name = "u", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "MUZNSFEY", name = "v", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "MUZNSFEY", name = "w", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "MUZNSFEY", name = "x", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "MUZNSFEY", name = "y", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "MUZNSFEY", name = "A", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "MUZNSFEY", name = "B", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "MUZNSFEY", name = "C", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "MUZNSFEY", name = "G", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "MUZNSFEY", name = "H", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "MUZNSFEY", name = "I", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "MUZNSFEY", name = "z", descriptor = "J")
    public long field1051;

    @OriginalMember(owner = "MUZNSFEY", name = "D", descriptor = "J")
    public long field1055;

    @OriginalMember(owner = "MUZNSFEY", name = "n", descriptor = "LOIDSBDUP;")
    public class40 field1039;

    @OriginalMember(owner = "MUZNSFEY", name = "p", descriptor = "LYNCFRRRI;")
    public class66 field1041;

    @OriginalMember(owner = "MUZNSFEY", name = "m", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1038;

    @OriginalMember(owner = "MUZNSFEY", name = "a", descriptor = "(IBI)V")
    public final void method333(int arg0, byte arg1, int arg2) {
        this.field1036 = arg2;
        if (arg1 != 9) {
            return;
        }
        this.field1037 = arg0;
        this.field1041 = new class66(this, this.field1036, this.field1037, (byte) 26);
        this.field1038 = this.method45(-33).getGraphics();
        this.field1039 = new class40(this.method45(-33), this.field1036, this.field1037, false);
        this.method141(this, 1);
    }

    @OriginalMember(owner = "MUZNSFEY", name = "a", descriptor = "(IIB)V")
    public final void method334(int arg0, int arg1, byte arg2) {
        this.field1036 = arg0;
        this.field1037 = arg1;
        this.field1038 = this.method45(-33).getGraphics();
        this.field1039 = new class40(this.method45(-33), this.field1036, this.field1037, false);
        this.method141(this, 1);
        if (arg2 == -61) {
            ;
        }
    }

    @OriginalMember(owner = "MUZNSFEY", name = "run", descriptor = "()V")
    public void run() {
        this.method45(-33).addMouseListener(this);
        this.method45(-33).addMouseMotionListener(this);
        this.method45(-33).addKeyListener(this);
        this.method45(-33).addFocusListener(this);
        if (this.field1041 != null) {
            this.field1041.addWindowListener(this);
        }
        this.method156((byte) 63, 0, "Loading...");
        this.method119();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1033[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1030 < 0) {
                    if (this.field1030 == -1) {
                        this.method335(-38618);
                    }
                    return;
                }
                if (this.field1030 > 0) {
                    this.field1030--;
                    if (this.field1030 == 0) {
                        this.method335(-38618);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1033[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1033[var1]) {
                    var2 = (int) ((long) (this.field1031 * 2560) / (var11 - this.field1033[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1031 - (var11 - this.field1033[var1]) / 10L);
                }
                if (var3 > this.field1031) {
                    var3 = this.field1031;
                }
                this.field1033[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1033[var13] != 0L) {
                            this.field1033[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1032) {
                    var3 = this.field1032;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1052 = this.field1048;
                    this.field1053 = this.field1049;
                    this.field1054 = this.field1050;
                    this.field1055 = this.field1051;
                    this.field1048 = 0;
                    this.method40((byte) 1);
                    this.field1058 = this.field1059;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1031 > 0) {
                    this.field1034 = var2 * 1000 / (this.field1031 * 256);
                }
                this.method79(-2522);
            } while (!this.field1035);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1033[var15]);
            }
            System.out.println("fps:" + this.field1034 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1031 + " mindel:" + this.field1032);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1035 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "MUZNSFEY", name = "a", descriptor = "(I)V")
    public final void method335(int arg0) {
        if (arg0 != -38618) {
            return;
        }
        this.field1030 = -2;
        this.method142(-160);
        if (this.field1041 == null) {
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

    @OriginalMember(owner = "MUZNSFEY", name = "a", descriptor = "(ZI)V")
    public final void method336(boolean arg0, int arg1) {
        this.field1031 = 1000 / arg1;
        if (!arg0) {
            this.field1026 = -135;
        }
    }

    @OriginalMember(owner = "MUZNSFEY", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1030 >= 0) {
            this.field1030 = 0;
        }
    }

    @OriginalMember(owner = "MUZNSFEY", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1030 >= 0) {
            this.field1030 = 4000 / this.field1031;
        }
    }

    @OriginalMember(owner = "MUZNSFEY", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1030 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field1030 == -1) {
            this.method335(-38618);
        }
    }

    @OriginalMember(owner = "MUZNSFEY", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1038 == null) {
            this.field1038 = arg0;
        }
        this.field1042 = true;
        this.method27(false);
    }

    @OriginalMember(owner = "MUZNSFEY", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1038 == null) {
            this.field1038 = arg0;
        }
        this.field1042 = true;
        this.method27(false);
    }

    @OriginalMember(owner = "MUZNSFEY", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1041 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1044 = 0;
        this.field1049 = var2;
        this.field1050 = var3;
        this.field1051 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1048 = 2;
            this.field1045 = 2;
        } else {
            this.field1048 = 1;
            this.field1045 = 1;
        }
    }

    @OriginalMember(owner = "MUZNSFEY", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1044 = 0;
        this.field1045 = 0;
    }

    @OriginalMember(owner = "MUZNSFEY", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "MUZNSFEY", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "MUZNSFEY", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1044 = 0;
        this.field1046 = -1;
        this.field1047 = -1;
    }

    @OriginalMember(owner = "MUZNSFEY", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1041 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1044 = 0;
        this.field1046 = var2;
        this.field1047 = var3;
    }

    @OriginalMember(owner = "MUZNSFEY", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1041 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1044 = 0;
        this.field1046 = var2;
        this.field1047 = var3;
    }

    @OriginalMember(owner = "MUZNSFEY", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1044 = 0;
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
            this.field1056[var3] = 1;
        }
        if (var3 > 4) {
            this.field1057[this.field1059] = var3;
            this.field1059 = this.field1059 + 1 & 0x7F;
        }
        if (class72.field1713) {
        }
    }

    @OriginalMember(owner = "MUZNSFEY", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1044 = 0;
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
            this.field1056[var3] = 0;
        }
    }

    @OriginalMember(owner = "MUZNSFEY", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "MUZNSFEY", name = "b", descriptor = "(I)I")
    public final int method337(int arg0) {
        int var2 = -1;
        if (arg0 < this.field1027 || arg0 > this.field1027) {
            this.field1029 = !this.field1029;
        }
        if (this.field1059 != this.field1058) {
            var2 = this.field1057[this.field1058];
            this.field1058 = this.field1058 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "MUZNSFEY", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1043 = true;
        this.field1042 = true;
        this.method27(false);
    }

    @OriginalMember(owner = "MUZNSFEY", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1043 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1056[var2] = 0;
        }
    }

    @OriginalMember(owner = "MUZNSFEY", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "MUZNSFEY", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "MUZNSFEY", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "MUZNSFEY", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "MUZNSFEY", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "MUZNSFEY", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "MUZNSFEY", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "MUZNSFEY", name = "a", descriptor = "()V")
    public void method119() {
    }

    @OriginalMember(owner = "MUZNSFEY", name = "a", descriptor = "(B)V")
    public void method40(byte arg0) {
        if (this.field1028 == arg0) {
            ;
        }
    }

    @OriginalMember(owner = "MUZNSFEY", name = "c", descriptor = "(I)V")
    public void method142(int arg0) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "MUZNSFEY", name = "d", descriptor = "(I)V")
    public void method79(int arg0) {
        if (arg0 == -2522) {
            ;
        }
    }

    @OriginalMember(owner = "MUZNSFEY", name = "a", descriptor = "(Z)V")
    public void method27(boolean arg0) {
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "MUZNSFEY", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public Component method45(int arg0) {
        if (arg0 >= 0) {
            this.field1029 = !this.field1029;
        }
        return this.field1041 == null ? this : this.field1041;
    }

    @OriginalMember(owner = "MUZNSFEY", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method141(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "MUZNSFEY", name = "a", descriptor = "(BILjava/lang/String;)V")
    public void method156(byte arg0, int arg1, String arg2) {
        while (this.field1038 == null) {
            this.field1038 = this.method45(-33).getGraphics();
            try {
                this.method45(-33).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method45(-33).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method45(-33).getFontMetrics(var6);
        if (this.field1042) {
            this.field1038.setColor(Color.black);
            this.field1038.fillRect(0, 0, this.field1036, this.field1037);
            this.field1042 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field1037 / 2 - 18;
        this.field1038.setColor(var7);
        this.field1038.drawRect(this.field1036 / 2 - 152, var8, 304, 34);
        this.field1038.fillRect(this.field1036 / 2 - 150, var8 + 2, arg1 * 3, 30);
        if (arg0 != 63) {
            return;
        }
        this.field1038.setColor(Color.black);
        this.field1038.fillRect(arg1 * 3 + this.field1036 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field1038.setFont(var4);
        this.field1038.setColor(Color.white);
        this.field1038.drawString(arg2, (this.field1036 - var5.stringWidth(arg2)) / 2, var8 + 22);
    }
}
