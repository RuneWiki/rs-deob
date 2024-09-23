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

@OriginalClass("OGVKVTJB")
public class class38 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "OGVKVTJB", name = "a", descriptor = "Z")
    private boolean field1159 = true;

    @OriginalMember(owner = "OGVKVTJB", name = "b", descriptor = "I")
    private int field1160 = -617;

    @OriginalMember(owner = "OGVKVTJB", name = "c", descriptor = "B")
    private byte field1161 = -35;

    @OriginalMember(owner = "OGVKVTJB", name = "d", descriptor = "B")
    private byte field1162 = -35;

    @OriginalMember(owner = "OGVKVTJB", name = "e", descriptor = "I")
    private int field1163 = -573;

    @OriginalMember(owner = "OGVKVTJB", name = "f", descriptor = "I")
    private int field1164 = -573;

    @OriginalMember(owner = "OGVKVTJB", name = "g", descriptor = "I")
    private int field1165 = 3;

    @OriginalMember(owner = "OGVKVTJB", name = "h", descriptor = "Z")
    private boolean field1166 = true;

    @OriginalMember(owner = "OGVKVTJB", name = "j", descriptor = "I")
    private int field1168 = 20;

    @OriginalMember(owner = "OGVKVTJB", name = "k", descriptor = "I")
    public int field1169 = 1;

    @OriginalMember(owner = "OGVKVTJB", name = "l", descriptor = "[J")
    private long[] field1170 = new long[10];

    @OriginalMember(owner = "OGVKVTJB", name = "n", descriptor = "Z")
    public boolean field1172 = false;

    @OriginalMember(owner = "OGVKVTJB", name = "s", descriptor = "[LTNNDDWAZ;")
    public class57[] field1177 = new class57[6];

    @OriginalMember(owner = "OGVKVTJB", name = "u", descriptor = "Z")
    public boolean field1179 = true;

    @OriginalMember(owner = "OGVKVTJB", name = "v", descriptor = "Z")
    public boolean field1180 = true;

    @OriginalMember(owner = "OGVKVTJB", name = "I", descriptor = "[I")
    public int[] field1193 = new int[128];

    @OriginalMember(owner = "OGVKVTJB", name = "J", descriptor = "[I")
    private int[] field1194 = new int[128];

    @OriginalMember(owner = "OGVKVTJB", name = "i", descriptor = "I")
    private int field1167;

    @OriginalMember(owner = "OGVKVTJB", name = "m", descriptor = "I")
    public int field1171;

    @OriginalMember(owner = "OGVKVTJB", name = "o", descriptor = "I")
    public int field1173;

    @OriginalMember(owner = "OGVKVTJB", name = "p", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "OGVKVTJB", name = "w", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "OGVKVTJB", name = "x", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "OGVKVTJB", name = "y", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "OGVKVTJB", name = "z", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "OGVKVTJB", name = "A", descriptor = "I")
    public int field1185;

    @OriginalMember(owner = "OGVKVTJB", name = "B", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "OGVKVTJB", name = "C", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "OGVKVTJB", name = "E", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "OGVKVTJB", name = "F", descriptor = "I")
    public int field1190;

    @OriginalMember(owner = "OGVKVTJB", name = "G", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "OGVKVTJB", name = "K", descriptor = "I")
    private int field1195;

    @OriginalMember(owner = "OGVKVTJB", name = "L", descriptor = "I")
    private int field1196;

    @OriginalMember(owner = "OGVKVTJB", name = "M", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "OGVKVTJB", name = "D", descriptor = "J")
    public long field1188;

    @OriginalMember(owner = "OGVKVTJB", name = "H", descriptor = "J")
    public long field1192;

    @OriginalMember(owner = "OGVKVTJB", name = "r", descriptor = "LPFNLOREN;")
    public class42 field1176;

    @OriginalMember(owner = "OGVKVTJB", name = "t", descriptor = "LWLLHZSAS;")
    public class65 field1178;

    @OriginalMember(owner = "OGVKVTJB", name = "q", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1175;

    @OriginalMember(owner = "OGVKVTJB", name = "a", descriptor = "(III)V")
    public final void method410(int arg0, int arg1, int arg2) {
        this.field1173 = arg1;
        this.field1174 = arg0;
        this.field1178 = new class65(this, this.field1173, this.field1174, false);
        this.field1175 = this.method192(-240).getGraphics();
        this.field1176 = new class42(this.field1173, 0, this.method192(-240), this.field1174);
        this.method102(this, 1);
        if (arg2 >= 0) {
            this.field1160 = -307;
        }
    }

    @OriginalMember(owner = "OGVKVTJB", name = "a", descriptor = "(IIB)V")
    public final void method411(int arg0, int arg1, byte arg2) {
        this.field1173 = arg0;
        this.field1174 = arg1;
        this.field1175 = this.method192(-240).getGraphics();
        this.field1176 = new class42(this.field1173, 0, this.method192(-240), this.field1174);
        if (arg2 == 72) {
            this.method102(this, 1);
        }
    }

    @OriginalMember(owner = "OGVKVTJB", name = "run", descriptor = "()V")
    public void run() {
        this.method192(-240).addMouseListener(this);
        this.method192(-240).addMouseMotionListener(this);
        this.method192(-240).addKeyListener(this);
        this.method192(-240).addFocusListener(this);
        if (this.field1178 != null) {
            this.field1178.addWindowListener(this);
        }
        this.method70("Loading...", 0, (byte) 7);
        this.method116();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1170[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1167 < 0) {
                    if (this.field1167 == -1) {
                        this.method412(this.field1161);
                    }
                    return;
                }
                if (this.field1167 > 0) {
                    this.field1167--;
                    if (this.field1167 == 0) {
                        this.method412(this.field1161);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1170[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1170[var1]) {
                    var2 = (int) ((long) (this.field1168 * 2560) / (var11 - this.field1170[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1168 - (var11 - this.field1170[var1]) / 10L);
                }
                if (var3 > this.field1168) {
                    var3 = this.field1168;
                }
                this.field1170[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1170[var13] != 0L) {
                            this.field1170[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1169) {
                    var3 = this.field1169;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1189 = this.field1185;
                    this.field1190 = this.field1186;
                    this.field1191 = this.field1187;
                    this.field1192 = this.field1188;
                    this.field1185 = 0;
                    this.method169(this.field1163);
                    this.field1195 = this.field1196;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1168 > 0) {
                    this.field1171 = var2 * 1000 / (this.field1168 * 256);
                }
                this.method180((byte) 67);
            } while (!this.field1172);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1170[var15]);
            }
            System.out.println("fps:" + this.field1171 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1168 + " mindel:" + this.field1169);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1172 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "OGVKVTJB", name = "a", descriptor = "(B)V")
    public final void method412(byte arg0) {
        this.field1167 = -2;
        this.method159(0);
        if (this.field1162 != arg0) {
            this.field1165 = -409;
        }
        if (this.field1178 == null) {
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

    @OriginalMember(owner = "OGVKVTJB", name = "a", descriptor = "(BI)V")
    public final void method413(byte arg0, int arg1) {
        this.field1168 = 1000 / arg1;
        if (arg0 != 92) {
            this.field1166 = !this.field1166;
        }
    }

    @OriginalMember(owner = "OGVKVTJB", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1167 >= 0) {
            this.field1167 = 0;
        }
    }

    @OriginalMember(owner = "OGVKVTJB", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1167 >= 0) {
            this.field1167 = 4000 / this.field1168;
        }
    }

    @OriginalMember(owner = "OGVKVTJB", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1167 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field1167 == -1) {
            this.method412(this.field1161);
        }
    }

    @OriginalMember(owner = "OGVKVTJB", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1175 == null) {
            this.field1175 = arg0;
        }
        this.field1179 = true;
        this.method189(117);
    }

    @OriginalMember(owner = "OGVKVTJB", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1175 == null) {
            this.field1175 = arg0;
        }
        this.field1179 = true;
        this.method189(117);
    }

    @OriginalMember(owner = "OGVKVTJB", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1178 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1181 = 0;
        this.field1186 = var2;
        this.field1187 = var3;
        this.field1188 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1185 = 2;
            this.field1182 = 2;
        } else {
            this.field1185 = 1;
            this.field1182 = 1;
        }
    }

    @OriginalMember(owner = "OGVKVTJB", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1181 = 0;
        this.field1182 = 0;
    }

    @OriginalMember(owner = "OGVKVTJB", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "OGVKVTJB", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "OGVKVTJB", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1181 = 0;
        this.field1183 = -1;
        this.field1184 = -1;
    }

    @OriginalMember(owner = "OGVKVTJB", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1178 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1181 = 0;
        this.field1183 = var2;
        this.field1184 = var3;
    }

    @OriginalMember(owner = "OGVKVTJB", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1178 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1181 = 0;
        this.field1183 = var2;
        this.field1184 = var3;
    }

    @OriginalMember(owner = "OGVKVTJB", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1181 = 0;
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
            this.field1193[var3] = 1;
        }
        if (var3 > 4) {
            this.field1194[this.field1196] = var3;
            this.field1196 = this.field1196 + 1 & 0x7F;
        }
        if (class1.field4) {
        }
    }

    @OriginalMember(owner = "OGVKVTJB", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1181 = 0;
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
            this.field1193[var3] = 0;
        }
    }

    @OriginalMember(owner = "OGVKVTJB", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "OGVKVTJB", name = "b", descriptor = "(B)I")
    public final int method414(byte arg0) {
        int var2 = -1;
        if (arg0 != 3) {
            this.field1163 = -137;
        }
        if (this.field1196 != this.field1195) {
            var2 = this.field1194[this.field1195];
            this.field1195 = this.field1195 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "OGVKVTJB", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1180 = true;
        this.field1179 = true;
        this.method189(117);
    }

    @OriginalMember(owner = "OGVKVTJB", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1180 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1193[var2] = 0;
        }
    }

    @OriginalMember(owner = "OGVKVTJB", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "OGVKVTJB", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "OGVKVTJB", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "OGVKVTJB", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "OGVKVTJB", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "OGVKVTJB", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "OGVKVTJB", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "OGVKVTJB", name = "a", descriptor = "()V")
    public void method116() {
    }

    @OriginalMember(owner = "OGVKVTJB", name = "a", descriptor = "(I)V")
    public void method169(int arg0) {
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "OGVKVTJB", name = "b", descriptor = "(I)V")
    public void method159(int arg0) {
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "OGVKVTJB", name = "c", descriptor = "(B)V")
    public void method180(byte arg0) {
        if (arg0 == 67) {
            ;
        }
    }

    @OriginalMember(owner = "OGVKVTJB", name = "c", descriptor = "(I)V")
    public void method189(int arg0) {
        if (arg0 <= 0) {
            this.field1165 = 239;
        }
    }

    @OriginalMember(owner = "OGVKVTJB", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public Component method192(int arg0) {
        while (arg0 >= 0) {
            this.field1159 = !this.field1159;
        }
        if (this.field1178 == null) {
            return this;
        } else {
            return this.field1178;
        }
    }

    @OriginalMember(owner = "OGVKVTJB", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method102(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "OGVKVTJB", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public void method70(String arg0, int arg1, byte arg2) {
        if (arg2 == 7) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        while (this.field1175 == null) {
            this.field1175 = this.method192(-240).getGraphics();
            try {
                this.method192(-240).repaint();
            } catch (Exception var12) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var11) {
            }
        }
        Font var6 = new Font("Helvetica", 1, 13);
        FontMetrics var7 = this.method192(-240).getFontMetrics(var6);
        Font var8 = new Font("Helvetica", 0, 13);
        this.method192(-240).getFontMetrics(var8);
        if (this.field1179) {
            this.field1175.setColor(Color.black);
            this.field1175.fillRect(0, 0, this.field1173, this.field1174);
            this.field1179 = false;
        }
        Color var9 = new Color(140, 17, 17);
        int var10 = this.field1174 / 2 - 18;
        this.field1175.setColor(var9);
        this.field1175.drawRect(this.field1173 / 2 - 152, var10, 304, 34);
        this.field1175.fillRect(this.field1173 / 2 - 150, var10 + 2, arg1 * 3, 30);
        this.field1175.setColor(Color.black);
        this.field1175.fillRect(arg1 * 3 + this.field1173 / 2 - 150, var10 + 2, 300 - arg1 * 3, 30);
        this.field1175.setFont(var6);
        this.field1175.setColor(Color.white);
        this.field1175.drawString(arg0, (this.field1173 - var7.stringWidth(arg0)) / 2, var10 + 22);
    }
}
