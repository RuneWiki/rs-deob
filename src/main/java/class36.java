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

@OriginalClass("client!MKNKYTZT")
public class class36 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!MKNKYTZT", name = "a", descriptor = "Z")
    private boolean field1094 = false;

    @OriginalMember(owner = "client!MKNKYTZT", name = "b", descriptor = "I")
    private int field1095 = 11419;

    @OriginalMember(owner = "client!MKNKYTZT", name = "d", descriptor = "I")
    private int field1097 = 20;

    @OriginalMember(owner = "client!MKNKYTZT", name = "e", descriptor = "I")
    public int field1098 = 1;

    @OriginalMember(owner = "client!MKNKYTZT", name = "f", descriptor = "[J")
    private long[] field1099 = new long[10];

    @OriginalMember(owner = "client!MKNKYTZT", name = "h", descriptor = "Z")
    public boolean field1101 = false;

    @OriginalMember(owner = "client!MKNKYTZT", name = "m", descriptor = "[LEFVUNBHT;")
    public class16[] field1106 = new class16[6];

    @OriginalMember(owner = "client!MKNKYTZT", name = "o", descriptor = "Z")
    public boolean field1108 = true;

    @OriginalMember(owner = "client!MKNKYTZT", name = "p", descriptor = "Z")
    public boolean field1109 = true;

    @OriginalMember(owner = "client!MKNKYTZT", name = "C", descriptor = "[I")
    public int[] field1122 = new int[128];

    @OriginalMember(owner = "client!MKNKYTZT", name = "D", descriptor = "[I")
    private int[] field1123 = new int[128];

    @OriginalMember(owner = "client!MKNKYTZT", name = "c", descriptor = "I")
    private int field1096;

    @OriginalMember(owner = "client!MKNKYTZT", name = "g", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!MKNKYTZT", name = "i", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!MKNKYTZT", name = "j", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!MKNKYTZT", name = "q", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!MKNKYTZT", name = "r", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!MKNKYTZT", name = "s", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "client!MKNKYTZT", name = "t", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!MKNKYTZT", name = "u", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "client!MKNKYTZT", name = "v", descriptor = "I")
    public int field1115;

    @OriginalMember(owner = "client!MKNKYTZT", name = "w", descriptor = "I")
    public int field1116;

    @OriginalMember(owner = "client!MKNKYTZT", name = "y", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "client!MKNKYTZT", name = "z", descriptor = "I")
    public int field1119;

    @OriginalMember(owner = "client!MKNKYTZT", name = "A", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "client!MKNKYTZT", name = "E", descriptor = "I")
    private int field1124;

    @OriginalMember(owner = "client!MKNKYTZT", name = "F", descriptor = "I")
    private int field1125;

    @OriginalMember(owner = "client!MKNKYTZT", name = "G", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!MKNKYTZT", name = "x", descriptor = "J")
    public long field1117;

    @OriginalMember(owner = "client!MKNKYTZT", name = "B", descriptor = "J")
    public long field1121;

    @OriginalMember(owner = "client!MKNKYTZT", name = "n", descriptor = "LSGXZRDZF;")
    public class51 field1107;

    @OriginalMember(owner = "client!MKNKYTZT", name = "l", descriptor = "LYZGYDKDO;")
    public class70 field1105;

    @OriginalMember(owner = "client!MKNKYTZT", name = "k", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1104;

    @OriginalMember(owner = "client!MKNKYTZT", name = "a", descriptor = "(III)V")
    public final void method386(int arg0, int arg1, int arg2) {
        this.field1102 = arg2;
        this.field1103 = arg0;
        if (arg1 < 0) {
            this.field1107 = new class51(this, true, this.field1102, this.field1103);
            this.field1104 = this.method57(-5092).getGraphics();
            this.field1105 = new class70(this.method57(-5092), this.field1102, this.field1103, (byte) 52);
            this.method139(this, 1);
        }
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "b", descriptor = "(III)V")
    public final void method387(int arg0, int arg1, int arg2) {
        this.field1102 = arg2;
        this.field1103 = arg0;
        if (arg1 == 35865) {
            this.field1104 = this.method57(-5092).getGraphics();
            this.field1105 = new class70(this.method57(-5092), this.field1102, this.field1103, (byte) 52);
            this.method139(this, 1);
        }
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "run", descriptor = "()V")
    public void run() {
        this.method57(-5092).addMouseListener(this);
        this.method57(-5092).addMouseMotionListener(this);
        this.method57(-5092).addKeyListener(this);
        this.method57(-5092).addFocusListener(this);
        if (this.field1107 != null) {
            this.field1107.addWindowListener(this);
        }
        this.method98(0, "Loading...", (byte) 1);
        this.method133();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1099[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1096 < 0) {
                    if (this.field1096 == -1) {
                        this.method388(92);
                    }
                    return;
                }
                if (this.field1096 > 0) {
                    this.field1096--;
                    if (this.field1096 == 0) {
                        this.method388(92);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1099[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1099[var1]) {
                    var2 = (int) ((long) (this.field1097 * 2560) / (var11 - this.field1099[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1097 - (var11 - this.field1099[var1]) / 10L);
                }
                if (var3 > this.field1097) {
                    var3 = this.field1097;
                }
                this.field1099[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1099[var13] != 0L) {
                            this.field1099[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1098) {
                    var3 = this.field1098;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1118 = this.field1114;
                    this.field1119 = this.field1115;
                    this.field1120 = this.field1116;
                    this.field1121 = this.field1117;
                    this.field1114 = 0;
                    this.method158(9800);
                    this.field1124 = this.field1125;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1097 > 0) {
                    this.field1100 = var2 * 1000 / (this.field1097 * 256);
                }
                this.method81(false);
            } while (!this.field1101);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1099[var15]);
            }
            System.out.println("fps:" + this.field1100 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1097 + " mindel:" + this.field1098);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1101 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        this.field1096 = -2;
        this.method130(0);
        int var2 = 75 / arg0;
        if (this.field1107 == null) {
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

    @OriginalMember(owner = "client!MKNKYTZT", name = "a", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        this.field1097 = 1000 / arg1;
        int var3 = 39 / arg0;
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1096 >= 0) {
            this.field1096 = 0;
        }
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1096 >= 0) {
            this.field1096 = 4000 / this.field1097;
        }
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1096 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field1096 == -1) {
            this.method388(92);
        }
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1104 == null) {
            this.field1104 = arg0;
        }
        this.field1108 = true;
        this.method84(277);
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1104 == null) {
            this.field1104 = arg0;
        }
        this.field1108 = true;
        this.method84(277);
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1107 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1110 = 0;
        this.field1115 = var2;
        this.field1116 = var3;
        this.field1117 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1114 = 2;
            this.field1111 = 2;
        } else {
            this.field1114 = 1;
            this.field1111 = 1;
        }
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1110 = 0;
        this.field1111 = 0;
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1110 = 0;
        this.field1112 = -1;
        this.field1113 = -1;
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1107 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1110 = 0;
        this.field1112 = var2;
        this.field1113 = var3;
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1107 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1110 = 0;
        this.field1112 = var2;
        this.field1113 = var3;
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1110 = 0;
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
            this.field1122[var3] = 1;
        }
        if (var3 > 4) {
            this.field1123[this.field1125] = var3;
            this.field1125 = this.field1125 + 1 & 0x7F;
        }
        if (class13.field714) {
        }
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1110 = 0;
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
            this.field1122[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "b", descriptor = "(I)I")
    public final int method390(int arg0) {
        int var2 = -1;
        if (arg0 != -1372) {
            return 2;
        }
        if (this.field1125 != this.field1124) {
            var2 = this.field1123[this.field1124];
            this.field1124 = this.field1124 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1109 = true;
        this.field1108 = true;
        this.method84(277);
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1109 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1122[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "a", descriptor = "()V")
    public void method133() {
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "c", descriptor = "(I)V")
    public void method158(int arg0) {
        if (arg0 == 9800) {
            ;
        }
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "d", descriptor = "(I)V")
    public void method130(int arg0) {
        if (arg0 != 0) {
            this.field1094 = !this.field1094;
        }
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "a", descriptor = "(Z)V")
    public void method81(boolean arg0) {
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "e", descriptor = "(I)V")
    public void method84(int arg0) {
        if (arg0 <= 0) {
            this.field1095 = -315;
        }
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "f", descriptor = "(I)Ljava/awt/Component;")
    public Component method57(int arg0) {
        if (arg0 != -5092) {
            throw new NullPointerException();
        }
        return this.field1107 == null ? this : this.field1107;
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method139(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!MKNKYTZT", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public void method98(int arg0, String arg1, byte arg2) {
        while (this.field1104 == null) {
            this.field1104 = this.method57(-5092).getGraphics();
            try {
                this.method57(-5092).repaint();
            } catch (Exception var12) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var11) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method57(-5092).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method57(-5092).getFontMetrics(var6);
        if (this.field1108) {
            this.field1104.setColor(Color.black);
            this.field1104.fillRect(0, 0, this.field1102, this.field1103);
            this.field1108 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field1103 / 2 - 18;
        this.field1104.setColor(var7);
        this.field1104.drawRect(this.field1102 / 2 - 152, var8, 304, 34);
        if (arg2 == 1) {
            boolean var9 = false;
        } else {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        this.field1104.fillRect(this.field1102 / 2 - 150, var8 + 2, arg0 * 3, 30);
        this.field1104.setColor(Color.black);
        this.field1104.fillRect(arg0 * 3 + this.field1102 / 2 - 150, var8 + 2, 300 - arg0 * 3, 30);
        this.field1104.setFont(var4);
        this.field1104.setColor(Color.white);
        this.field1104.drawString(arg1, (this.field1102 - var5.stringWidth(arg1)) / 2, var8 + 22);
    }
}
