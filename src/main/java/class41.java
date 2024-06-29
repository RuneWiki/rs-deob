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

@OriginalClass("client!PKBEYUWN")
public class class41 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "I")
    private int field1118 = 9;

    @OriginalMember(owner = "client!PKBEYUWN", name = "b", descriptor = "I")
    private int field1119 = 490;

    @OriginalMember(owner = "client!PKBEYUWN", name = "c", descriptor = "Z")
    private boolean field1120 = false;

    @OriginalMember(owner = "client!PKBEYUWN", name = "e", descriptor = "I")
    private int field1122 = 20;

    @OriginalMember(owner = "client!PKBEYUWN", name = "f", descriptor = "I")
    public int field1123 = 1;

    @OriginalMember(owner = "client!PKBEYUWN", name = "g", descriptor = "[J")
    private long[] field1124 = new long[10];

    @OriginalMember(owner = "client!PKBEYUWN", name = "i", descriptor = "Z")
    public boolean field1126 = false;

    @OriginalMember(owner = "client!PKBEYUWN", name = "n", descriptor = "[LBISLJVZR;")
    public class5[] field1131 = new class5[6];

    @OriginalMember(owner = "client!PKBEYUWN", name = "p", descriptor = "Z")
    public boolean field1133 = true;

    @OriginalMember(owner = "client!PKBEYUWN", name = "q", descriptor = "Z")
    public boolean field1134 = true;

    @OriginalMember(owner = "client!PKBEYUWN", name = "D", descriptor = "[I")
    public int[] field1147 = new int[128];

    @OriginalMember(owner = "client!PKBEYUWN", name = "E", descriptor = "[I")
    private int[] field1148 = new int[128];

    @OriginalMember(owner = "client!PKBEYUWN", name = "d", descriptor = "I")
    private int field1121;

    @OriginalMember(owner = "client!PKBEYUWN", name = "h", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!PKBEYUWN", name = "j", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!PKBEYUWN", name = "k", descriptor = "I")
    public int field1128;

    @OriginalMember(owner = "client!PKBEYUWN", name = "r", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!PKBEYUWN", name = "s", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "client!PKBEYUWN", name = "t", descriptor = "I")
    public int field1137;

    @OriginalMember(owner = "client!PKBEYUWN", name = "u", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!PKBEYUWN", name = "v", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "client!PKBEYUWN", name = "w", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "client!PKBEYUWN", name = "x", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "client!PKBEYUWN", name = "z", descriptor = "I")
    public int field1143;

    @OriginalMember(owner = "client!PKBEYUWN", name = "A", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "client!PKBEYUWN", name = "B", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!PKBEYUWN", name = "F", descriptor = "I")
    private int field1149;

    @OriginalMember(owner = "client!PKBEYUWN", name = "G", descriptor = "I")
    private int field1150;

    @OriginalMember(owner = "client!PKBEYUWN", name = "H", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!PKBEYUWN", name = "y", descriptor = "J")
    public long field1142;

    @OriginalMember(owner = "client!PKBEYUWN", name = "C", descriptor = "J")
    public long field1146;

    @OriginalMember(owner = "client!PKBEYUWN", name = "o", descriptor = "LFRBOSPAH;")
    public class16 field1132;

    @OriginalMember(owner = "client!PKBEYUWN", name = "m", descriptor = "LIOGVZQTL;")
    public class26 field1130;

    @OriginalMember(owner = "client!PKBEYUWN", name = "l", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1129;

    @OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "(III)V")
    public final void method426(int arg0, int arg1, int arg2) {
        this.field1127 = arg2;
        this.field1128 = arg1;
        this.field1132 = new class16(this.field1127, this.field1128, 0, this);
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1129 = this.method194(1).getGraphics();
        this.field1130 = new class26(this.field1127, this.field1128, this.method194(1), this.field1120);
        this.method164(this, 1);
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "b", descriptor = "(III)V")
    public final void method427(int arg0, int arg1, int arg2) {
        this.field1127 = arg0;
        this.field1128 = arg2;
        this.field1129 = this.method194(1).getGraphics();
        this.field1130 = new class26(this.field1127, this.field1128, this.method194(1), this.field1120);
        this.method164(this, 1);
        if (this.field1118 != arg1) {
            this.field1120 = !this.field1120;
        }
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "run", descriptor = "()V")
    public void run() {
        this.method194(1).addMouseListener(this);
        this.method194(1).addMouseMotionListener(this);
        this.method194(1).addKeyListener(this);
        this.method194(1).addFocusListener(this);
        if (this.field1132 != null) {
            this.field1132.addWindowListener(this);
        }
        this.method158((byte) 6, 0, "Loading...");
        this.method128();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1124[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1121 < 0) {
                    if (this.field1121 == -1) {
                        this.method428(490);
                    }
                    return;
                }
                if (this.field1121 > 0) {
                    this.field1121--;
                    if (this.field1121 == 0) {
                        this.method428(490);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1124[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1124[var1]) {
                    var2 = (int) ((long) (this.field1122 * 2560) / (var11 - this.field1124[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1122 - (var11 - this.field1124[var1]) / 10L);
                }
                if (var3 > this.field1122) {
                    var3 = this.field1122;
                }
                this.field1124[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1124[var13] != 0L) {
                            this.field1124[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1123) {
                    var3 = this.field1123;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1143 = this.field1139;
                    this.field1144 = this.field1140;
                    this.field1145 = this.field1141;
                    this.field1146 = this.field1142;
                    this.field1139 = 0;
                    this.method255(0);
                    this.field1149 = this.field1150;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1122 > 0) {
                    this.field1125 = var2 * 1000 / (this.field1122 * 256);
                }
                this.method233((byte) 84);
            } while (!this.field1126);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1124[var15]);
            }
            System.out.println("fps:" + this.field1125 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1122 + " mindel:" + this.field1123);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1126 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "(I)V")
    public final void method428(int arg0) {
        this.field1121 = -2;
        this.method186(false);
        if (arg0 <= 0 || this.field1132 == null) {
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

    @OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "(BI)V")
    public final void method429(byte arg0, int arg1) {
        this.field1122 = 1000 / arg1;
        if (arg0 != -48) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1121 >= 0) {
            this.field1121 = 0;
        }
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1121 >= 0) {
            this.field1121 = 4000 / this.field1122;
        }
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1121 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field1121 == -1) {
            this.method428(490);
        }
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1129 == null) {
            this.field1129 = arg0;
        }
        this.field1133 = true;
        this.method182(-725);
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1129 == null) {
            this.field1129 = arg0;
        }
        this.field1133 = true;
        this.method182(-725);
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1132 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1135 = 0;
        this.field1140 = var2;
        this.field1141 = var3;
        this.field1142 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1139 = 2;
            this.field1136 = 2;
        } else {
            this.field1139 = 1;
            this.field1136 = 1;
        }
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1135 = 0;
        this.field1136 = 0;
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1135 = 0;
        this.field1137 = -1;
        this.field1138 = -1;
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1132 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1135 = 0;
        this.field1137 = var2;
        this.field1138 = var3;
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1132 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1135 = 0;
        this.field1137 = var2;
        this.field1138 = var3;
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1135 = 0;
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
            this.field1147[var3] = 1;
        }
        if (var3 > 4) {
            this.field1148[this.field1150] = var3;
            this.field1150 = this.field1150 + 1 & 0x7F;
        }
        if (class56.field1535) {
        }
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1135 = 0;
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
            this.field1147[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "b", descriptor = "(I)I")
    public final int method430(int arg0) {
        int var2 = -1;
        if (arg0 <= 0) {
            return 2;
        }
        if (this.field1150 != this.field1149) {
            var2 = this.field1148[this.field1149];
            this.field1149 = this.field1149 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1134 = true;
        this.field1133 = true;
        this.method182(-725);
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1134 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1147[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "()V")
    public void method128() {
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "c", descriptor = "(I)V")
    public void method255(int arg0) {
        if (arg0 != 0) {
            this.field1119 = -478;
        }
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "(Z)V")
    public void method186(boolean arg0) {
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "(B)V")
    public void method233(byte arg0) {
        if (arg0 != 84) {
            this.field1120 = !this.field1120;
        }
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "d", descriptor = "(I)V")
    public void method182(int arg0) {
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public Component method194(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field1132 == null ? this : this.field1132;
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method164(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!PKBEYUWN", name = "a", descriptor = "(BILjava/lang/String;)V")
    public void method158(byte arg0, int arg1, String arg2) {
        while (this.field1129 == null) {
            this.field1129 = this.method194(1).getGraphics();
            try {
                this.method194(1).repaint();
            } catch (Exception var11) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var10) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method194(1).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method194(1).getFontMetrics(var6);
        if (this.field1133) {
            this.field1129.setColor(Color.black);
            this.field1129.fillRect(0, 0, this.field1127, this.field1128);
            this.field1133 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field1128 / 2 - 18;
        this.field1129.setColor(var7);
        this.field1129.drawRect(this.field1127 / 2 - 152, var8, 304, 34);
        this.field1129.fillRect(this.field1127 / 2 - 150, var8 + 2, arg1 * 3, 30);
        this.field1129.setColor(Color.black);
        this.field1129.fillRect(arg1 * 3 + this.field1127 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        if (arg0 == 6) {
            boolean var9 = false;
        } else {
            this.field1120 = !this.field1120;
        }
        this.field1129.setFont(var4);
        this.field1129.setColor(Color.white);
        this.field1129.drawString(arg2, (this.field1127 - var5.stringWidth(arg2)) / 2, var8 + 22);
    }
}
