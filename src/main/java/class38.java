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

@OriginalClass("client!NCIKLCII")
public class class38 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "I")
    private int field1104 = -636;

    @OriginalMember(owner = "client!NCIKLCII", name = "b", descriptor = "B")
    private byte field1105 = 5;

    @OriginalMember(owner = "client!NCIKLCII", name = "c", descriptor = "I")
    private int field1106 = 17935;

    @OriginalMember(owner = "client!NCIKLCII", name = "d", descriptor = "I")
    private int field1107 = 8607;

    @OriginalMember(owner = "client!NCIKLCII", name = "e", descriptor = "Z")
    private boolean field1108 = true;

    @OriginalMember(owner = "client!NCIKLCII", name = "f", descriptor = "I")
    private int field1109 = 5200;

    @OriginalMember(owner = "client!NCIKLCII", name = "g", descriptor = "Z")
    private boolean field1110 = false;

    @OriginalMember(owner = "client!NCIKLCII", name = "i", descriptor = "I")
    private int field1112 = 20;

    @OriginalMember(owner = "client!NCIKLCII", name = "j", descriptor = "I")
    public int field1113 = 1;

    @OriginalMember(owner = "client!NCIKLCII", name = "k", descriptor = "[J")
    private long[] field1114 = new long[10];

    @OriginalMember(owner = "client!NCIKLCII", name = "m", descriptor = "Z")
    public boolean field1116 = false;

    @OriginalMember(owner = "client!NCIKLCII", name = "r", descriptor = "[LTPIBHECB;")
    public class56[] field1121 = new class56[6];

    @OriginalMember(owner = "client!NCIKLCII", name = "t", descriptor = "Z")
    public boolean field1123 = true;

    @OriginalMember(owner = "client!NCIKLCII", name = "u", descriptor = "Z")
    public boolean field1124 = true;

    @OriginalMember(owner = "client!NCIKLCII", name = "H", descriptor = "[I")
    public int[] field1137 = new int[128];

    @OriginalMember(owner = "client!NCIKLCII", name = "I", descriptor = "[I")
    private int[] field1138 = new int[128];

    @OriginalMember(owner = "client!NCIKLCII", name = "h", descriptor = "I")
    private int field1111;

    @OriginalMember(owner = "client!NCIKLCII", name = "l", descriptor = "I")
    public int field1115;

    @OriginalMember(owner = "client!NCIKLCII", name = "n", descriptor = "I")
    public int field1117;

    @OriginalMember(owner = "client!NCIKLCII", name = "o", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "client!NCIKLCII", name = "v", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!NCIKLCII", name = "w", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "client!NCIKLCII", name = "x", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!NCIKLCII", name = "y", descriptor = "I")
    public int field1128;

    @OriginalMember(owner = "client!NCIKLCII", name = "z", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "client!NCIKLCII", name = "A", descriptor = "I")
    public int field1130;

    @OriginalMember(owner = "client!NCIKLCII", name = "B", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "client!NCIKLCII", name = "D", descriptor = "I")
    public int field1133;

    @OriginalMember(owner = "client!NCIKLCII", name = "E", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!NCIKLCII", name = "F", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!NCIKLCII", name = "J", descriptor = "I")
    private int field1139;

    @OriginalMember(owner = "client!NCIKLCII", name = "K", descriptor = "I")
    private int field1140;

    @OriginalMember(owner = "client!NCIKLCII", name = "L", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!NCIKLCII", name = "C", descriptor = "J")
    public long field1132;

    @OriginalMember(owner = "client!NCIKLCII", name = "G", descriptor = "J")
    public long field1136;

    @OriginalMember(owner = "client!NCIKLCII", name = "q", descriptor = "LIUZTBIWV;")
    public class28 field1120;

    @OriginalMember(owner = "client!NCIKLCII", name = "s", descriptor = "LBLPTISPL;")
    public class8 field1122;

    @OriginalMember(owner = "client!NCIKLCII", name = "p", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1119;

    @OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "(III)V")
    public final void method397(int arg0, int arg1, int arg2) {
        this.field1117 = arg2;
        this.field1118 = arg1;
        this.field1122 = new class8(-965, this.field1118, this, this.field1117);
        this.field1119 = this.method117((byte) 0).getGraphics();
        this.field1120 = new class28(this.method117((byte) 0), this.field1117, (byte) 0, this.field1118);
        if (arg0 != 0) {
            this.field1108 = !this.field1108;
        }
        this.method97(this, 1);
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "b", descriptor = "(III)V")
    public final void method398(int arg0, int arg1, int arg2) {
        this.field1117 = arg1;
        if (arg0 >= 0) {
            this.field1109 = 308;
        }
        this.field1118 = arg2;
        this.field1119 = this.method117((byte) 0).getGraphics();
        this.field1120 = new class28(this.method117((byte) 0), this.field1117, (byte) 0, this.field1118);
        this.method97(this, 1);
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "run", descriptor = "()V")
    public void run() {
        this.method117((byte) 0).addMouseListener(this);
        this.method117((byte) 0).addMouseMotionListener(this);
        this.method117((byte) 0).addKeyListener(this);
        this.method117((byte) 0).addFocusListener(this);
        if (this.field1122 != null) {
            this.field1122.addWindowListener(this);
        }
        this.method149("Loading...", 0, false);
        this.method176();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1114[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1111 < 0) {
                    if (this.field1111 == -1) {
                        this.method399((byte) 8);
                    }
                    return;
                }
                if (this.field1111 > 0) {
                    this.field1111--;
                    if (this.field1111 == 0) {
                        this.method399((byte) 8);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1114[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1114[var1]) {
                    var2 = (int) ((long) (this.field1112 * 2560) / (var11 - this.field1114[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1112 - (var11 - this.field1114[var1]) / 10L);
                }
                if (var3 > this.field1112) {
                    var3 = this.field1112;
                }
                this.field1114[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1114[var13] != 0L) {
                            this.field1114[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1113) {
                    var3 = this.field1113;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1133 = this.field1129;
                    this.field1134 = this.field1130;
                    this.field1135 = this.field1131;
                    this.field1136 = this.field1132;
                    this.field1129 = 0;
                    this.method122(true);
                    this.field1139 = this.field1140;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1112 > 0) {
                    this.field1115 = var2 * 1000 / (this.field1112 * 256);
                }
                this.method146(this.field1107);
            } while (!this.field1116);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1114[var15]);
            }
            System.out.println("fps:" + this.field1115 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1112 + " mindel:" + this.field1113);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1116 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "(B)V")
    public final void method399(byte arg0) {
        if (arg0 != 8) {
            return;
        }
        boolean var2 = false;
        this.field1111 = -2;
        this.method168(154);
        if (this.field1122 == null) {
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

    @OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "(BI)V")
    public final void method400(byte arg0, int arg1) {
        if (this.field1105 == arg0) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1112 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1111 >= 0) {
            this.field1111 = 0;
        }
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1111 >= 0) {
            this.field1111 = 4000 / this.field1112;
        }
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1111 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field1111 == -1) {
            this.method399((byte) 8);
        }
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1119 == null) {
            this.field1119 = arg0;
        }
        this.field1123 = true;
        this.method45(false);
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1119 == null) {
            this.field1119 = arg0;
        }
        this.field1123 = true;
        this.method45(false);
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1122 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1125 = 0;
        this.field1130 = var2;
        this.field1131 = var3;
        this.field1132 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1129 = 2;
            this.field1126 = 2;
        } else {
            this.field1129 = 1;
            this.field1126 = 1;
        }
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1125 = 0;
        this.field1126 = 0;
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1125 = 0;
        this.field1127 = -1;
        this.field1128 = -1;
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1122 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1125 = 0;
        this.field1127 = var2;
        this.field1128 = var3;
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1122 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1125 = 0;
        this.field1127 = var2;
        this.field1128 = var3;
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1125 = 0;
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
            this.field1137[var3] = 1;
        }
        if (var3 > 4) {
            this.field1138[this.field1140] = var3;
            this.field1140 = this.field1140 + 1 & 0x7F;
        }
        if (class1.field4) {
        }
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1125 = 0;
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
            this.field1137[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "b", descriptor = "(B)I")
    public final int method401(byte arg0) {
        if (arg0 != 0) {
            this.field1110 = !this.field1110;
        }
        int var2 = -1;
        if (this.field1140 != this.field1139) {
            var2 = this.field1138[this.field1139];
            this.field1139 = this.field1139 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1124 = true;
        this.field1123 = true;
        this.method45(false);
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1124 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1137[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "()V")
    public void method176() {
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "(Z)V")
    public void method122(boolean arg0) {
        if (!arg0) {
            this.field1106 = -292;
        }
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "(I)V")
    public void method168(int arg0) {
        if (arg0 <= 0) {
            this.field1110 = !this.field1110;
        }
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "b", descriptor = "(I)V")
    public void method146(int arg0) {
        if (arg0 != 8607) {
            this.field1110 = !this.field1110;
        }
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "b", descriptor = "(Z)V")
    public void method45(boolean arg0) {
        if (arg0) {
            this.field1107 = -455;
        }
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "c", descriptor = "(B)Ljava/awt/Component;")
    public Component method117(byte arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return this.field1122 == null ? this : this.field1122;
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method97(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!NCIKLCII", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public void method149(String arg0, int arg1, boolean arg2) {
        while (this.field1119 == null) {
            this.field1119 = this.method117((byte) 0).getGraphics();
            try {
                this.method117((byte) 0).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method117((byte) 0).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method117((byte) 0).getFontMetrics(var6);
        if (this.field1123) {
            this.field1119.setColor(Color.black);
            this.field1119.fillRect(0, 0, this.field1117, this.field1118);
            this.field1123 = false;
        }
        Color var7 = new Color(140, 17, 17);
        if (arg2) {
            this.field1106 = -132;
        }
        int var8 = this.field1118 / 2 - 18;
        this.field1119.setColor(var7);
        this.field1119.drawRect(this.field1117 / 2 - 152, var8, 304, 34);
        this.field1119.fillRect(this.field1117 / 2 - 150, var8 + 2, arg1 * 3, 30);
        this.field1119.setColor(Color.black);
        this.field1119.fillRect(arg1 * 3 + this.field1117 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field1119.setFont(var4);
        this.field1119.setColor(Color.white);
        this.field1119.drawString(arg0, (this.field1117 - var5.stringWidth(arg0)) / 2, var8 + 22);
    }
}
