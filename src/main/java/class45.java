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

@OriginalClass("QNTDRCTM")
public class class45 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "QNTDRCTM", name = "a", descriptor = "Z")
    private boolean field1165 = true;

    @OriginalMember(owner = "QNTDRCTM", name = "b", descriptor = "I")
    private int field1166 = -281;

    @OriginalMember(owner = "QNTDRCTM", name = "c", descriptor = "I")
    private int field1167 = -515;

    @OriginalMember(owner = "QNTDRCTM", name = "d", descriptor = "I")
    private int field1168 = 398;

    @OriginalMember(owner = "QNTDRCTM", name = "e", descriptor = "Z")
    private boolean field1169 = false;

    @OriginalMember(owner = "QNTDRCTM", name = "f", descriptor = "Z")
    private boolean field1170 = true;

    @OriginalMember(owner = "QNTDRCTM", name = "h", descriptor = "I")
    private int field1172 = 20;

    @OriginalMember(owner = "QNTDRCTM", name = "i", descriptor = "I")
    public int field1173 = 1;

    @OriginalMember(owner = "QNTDRCTM", name = "j", descriptor = "[J")
    private long[] field1174 = new long[10];

    @OriginalMember(owner = "QNTDRCTM", name = "l", descriptor = "Z")
    public boolean field1176 = false;

    @OriginalMember(owner = "QNTDRCTM", name = "q", descriptor = "[LBFUTXOBU;")
    public class4[] field1181 = new class4[6];

    @OriginalMember(owner = "QNTDRCTM", name = "s", descriptor = "Z")
    public boolean field1183 = true;

    @OriginalMember(owner = "QNTDRCTM", name = "t", descriptor = "Z")
    public boolean field1184 = true;

    @OriginalMember(owner = "QNTDRCTM", name = "G", descriptor = "[I")
    public int[] field1197 = new int[128];

    @OriginalMember(owner = "QNTDRCTM", name = "H", descriptor = "[I")
    private int[] field1198 = new int[128];

    @OriginalMember(owner = "QNTDRCTM", name = "g", descriptor = "I")
    private int field1171;

    @OriginalMember(owner = "QNTDRCTM", name = "k", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "QNTDRCTM", name = "m", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "QNTDRCTM", name = "n", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "QNTDRCTM", name = "u", descriptor = "I")
    public int field1185;

    @OriginalMember(owner = "QNTDRCTM", name = "v", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "QNTDRCTM", name = "w", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "QNTDRCTM", name = "x", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "QNTDRCTM", name = "y", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "QNTDRCTM", name = "z", descriptor = "I")
    public int field1190;

    @OriginalMember(owner = "QNTDRCTM", name = "A", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "QNTDRCTM", name = "C", descriptor = "I")
    public int field1193;

    @OriginalMember(owner = "QNTDRCTM", name = "D", descriptor = "I")
    public int field1194;

    @OriginalMember(owner = "QNTDRCTM", name = "E", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "QNTDRCTM", name = "I", descriptor = "I")
    private int field1199;

    @OriginalMember(owner = "QNTDRCTM", name = "J", descriptor = "I")
    private int field1200;

    @OriginalMember(owner = "QNTDRCTM", name = "K", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "QNTDRCTM", name = "B", descriptor = "J")
    public long field1192;

    @OriginalMember(owner = "QNTDRCTM", name = "F", descriptor = "J")
    public long field1196;

    @OriginalMember(owner = "QNTDRCTM", name = "r", descriptor = "LGBQVGMFE;")
    public class21 field1182;

    @OriginalMember(owner = "QNTDRCTM", name = "p", descriptor = "LSBWJLPSR;")
    public class48 field1180;

    @OriginalMember(owner = "QNTDRCTM", name = "o", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1179;

    @OriginalMember(owner = "QNTDRCTM", name = "a", descriptor = "(IBI)V")
    public final void method385(int arg0, byte arg1, int arg2) {
        this.field1177 = arg0;
        this.field1178 = arg2;
        this.field1182 = new class21(this, this.field1178, this.field1177, 19388);
        this.field1179 = this.method73(-13961).getGraphics();
        this.field1180 = new class48(this.field1178, -41603, this.field1177, this.method73(-13961));
        this.method102(this, 1);
        if (arg1 != 13) {
            this.field1170 = !this.field1170;
        }
    }

    @OriginalMember(owner = "QNTDRCTM", name = "a", descriptor = "(III)V")
    public final void method386(int arg0, int arg1, int arg2) {
        if (arg2 >= 0) {
            this.field1168 = -236;
        }
        this.field1177 = arg0;
        this.field1178 = arg1;
        this.field1179 = this.method73(-13961).getGraphics();
        this.field1180 = new class48(this.field1178, -41603, this.field1177, this.method73(-13961));
        this.method102(this, 1);
    }

    @OriginalMember(owner = "QNTDRCTM", name = "run", descriptor = "()V")
    public void run() {
        this.method73(-13961).addMouseListener(this);
        this.method73(-13961).addMouseMotionListener(this);
        this.method73(-13961).addKeyListener(this);
        this.method73(-13961).addFocusListener(this);
        if (this.field1182 != null) {
            this.field1182.addWindowListener(this);
        }
        this.method163(this.field1169, 0, "Loading...");
        this.method44();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1174[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1171 < 0) {
                    if (this.field1171 == -1) {
                        this.method387(true);
                    }
                    return;
                }
                if (this.field1171 > 0) {
                    this.field1171--;
                    if (this.field1171 == 0) {
                        this.method387(true);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1174[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1174[var1]) {
                    var2 = (int) ((long) (this.field1172 * 2560) / (var11 - this.field1174[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1172 - (var11 - this.field1174[var1]) / 10L);
                }
                if (var3 > this.field1172) {
                    var3 = this.field1172;
                }
                this.field1174[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1174[var13] != 0L) {
                            this.field1174[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1173) {
                    var3 = this.field1173;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1193 = this.field1189;
                    this.field1194 = this.field1190;
                    this.field1195 = this.field1191;
                    this.field1196 = this.field1192;
                    this.field1189 = 0;
                    this.method147(-281);
                    this.field1199 = this.field1200;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1172 > 0) {
                    this.field1175 = var2 * 1000 / (this.field1172 * 256);
                }
                this.method105(this.field1168);
            } while (!this.field1176);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1174[var15]);
            }
            System.out.println("fps:" + this.field1175 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1172 + " mindel:" + this.field1173);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1176 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "QNTDRCTM", name = "a", descriptor = "(Z)V")
    public final void method387(boolean arg0) {
        if (!arg0) {
            this.field1168 = 42;
        }
        this.field1171 = -2;
        this.method56(-515);
        if (this.field1182 == null) {
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

    @OriginalMember(owner = "QNTDRCTM", name = "a", descriptor = "(IZ)V")
    public final void method388(int arg0, boolean arg1) {
        if (arg1) {
            this.field1172 = 1000 / arg0;
        }
    }

    @OriginalMember(owner = "QNTDRCTM", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1171 >= 0) {
            this.field1171 = 0;
        }
    }

    @OriginalMember(owner = "QNTDRCTM", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1171 >= 0) {
            this.field1171 = 4000 / this.field1172;
        }
    }

    @OriginalMember(owner = "QNTDRCTM", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1171 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field1171 == -1) {
            this.method387(true);
        }
    }

    @OriginalMember(owner = "QNTDRCTM", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1179 == null) {
            this.field1179 = arg0;
        }
        this.field1183 = true;
        this.method143(1890);
    }

    @OriginalMember(owner = "QNTDRCTM", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1179 == null) {
            this.field1179 = arg0;
        }
        this.field1183 = true;
        this.method143(1890);
    }

    @OriginalMember(owner = "QNTDRCTM", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1182 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1185 = 0;
        this.field1190 = var2;
        this.field1191 = var3;
        this.field1192 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1189 = 2;
            this.field1186 = 2;
        } else {
            this.field1189 = 1;
            this.field1186 = 1;
        }
    }

    @OriginalMember(owner = "QNTDRCTM", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1185 = 0;
        this.field1186 = 0;
    }

    @OriginalMember(owner = "QNTDRCTM", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "QNTDRCTM", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "QNTDRCTM", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1185 = 0;
        this.field1187 = -1;
        this.field1188 = -1;
    }

    @OriginalMember(owner = "QNTDRCTM", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1182 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1185 = 0;
        this.field1187 = var2;
        this.field1188 = var3;
    }

    @OriginalMember(owner = "QNTDRCTM", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1182 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1185 = 0;
        this.field1187 = var2;
        this.field1188 = var3;
    }

    @OriginalMember(owner = "QNTDRCTM", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1185 = 0;
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
            this.field1197[var3] = 1;
        }
        if (var3 > 4) {
            this.field1198[this.field1200] = var3;
            this.field1200 = this.field1200 + 1 & 0x7F;
        }
        if (class15.field717) {
        }
    }

    @OriginalMember(owner = "QNTDRCTM", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1185 = 0;
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
            this.field1197[var3] = 0;
        }
    }

    @OriginalMember(owner = "QNTDRCTM", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "QNTDRCTM", name = "a", descriptor = "(I)I")
    public final int method389(int arg0) {
        if (arg0 <= 0) {
            this.field1168 = 333;
        }
        int var2 = -1;
        if (this.field1200 != this.field1199) {
            var2 = this.field1198[this.field1199];
            this.field1199 = this.field1199 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "QNTDRCTM", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1184 = true;
        this.field1183 = true;
        this.method143(1890);
    }

    @OriginalMember(owner = "QNTDRCTM", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1184 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1197[var2] = 0;
        }
    }

    @OriginalMember(owner = "QNTDRCTM", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "QNTDRCTM", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "QNTDRCTM", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "QNTDRCTM", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "QNTDRCTM", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "QNTDRCTM", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "QNTDRCTM", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "QNTDRCTM", name = "a", descriptor = "()V")
    public void method44() {
    }

    @OriginalMember(owner = "QNTDRCTM", name = "b", descriptor = "(I)V")
    public void method147(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "QNTDRCTM", name = "c", descriptor = "(I)V")
    public void method56(int arg0) {
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "QNTDRCTM", name = "d", descriptor = "(I)V")
    public void method105(int arg0) {
        int var2 = 12 / arg0;
    }

    @OriginalMember(owner = "QNTDRCTM", name = "e", descriptor = "(I)V")
    public void method143(int arg0) {
        if (arg0 == 1890) {
            ;
        }
    }

    @OriginalMember(owner = "QNTDRCTM", name = "f", descriptor = "(I)Ljava/awt/Component;")
    public Component method73(int arg0) {
        if (arg0 != -13961) {
            this.field1168 = 282;
        }
        return this.field1182 == null ? this : this.field1182;
    }

    @OriginalMember(owner = "QNTDRCTM", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method102(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "QNTDRCTM", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public void method163(boolean arg0, int arg1, String arg2) {
        while (this.field1179 == null) {
            this.field1179 = this.method73(-13961).getGraphics();
            try {
                this.method73(-13961).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method73(-13961).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        if (arg0) {
            this.field1165 = !this.field1165;
        }
        this.method73(-13961).getFontMetrics(var6);
        if (this.field1183) {
            this.field1179.setColor(Color.black);
            this.field1179.fillRect(0, 0, this.field1177, this.field1178);
            this.field1183 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field1178 / 2 - 18;
        this.field1179.setColor(var7);
        this.field1179.drawRect(this.field1177 / 2 - 152, var8, 304, 34);
        this.field1179.fillRect(this.field1177 / 2 - 150, var8 + 2, arg1 * 3, 30);
        this.field1179.setColor(Color.black);
        this.field1179.fillRect(arg1 * 3 + this.field1177 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field1179.setFont(var4);
        this.field1179.setColor(Color.white);
        this.field1179.drawString(arg2, (this.field1177 - var5.stringWidth(arg2)) / 2, var8 + 22);
    }
}
