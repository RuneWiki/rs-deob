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

@OriginalClass("client!MKANHSMC")
public class class37 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "Z")
    private boolean field1159 = true;

    @OriginalMember(owner = "client!MKANHSMC", name = "b", descriptor = "Z")
    private boolean field1160 = false;

    @OriginalMember(owner = "client!MKANHSMC", name = "d", descriptor = "B")
    private byte field1162 = 26;

    @OriginalMember(owner = "client!MKANHSMC", name = "e", descriptor = "I")
    private int field1163 = 451;

    @OriginalMember(owner = "client!MKANHSMC", name = "g", descriptor = "I")
    private int field1165 = 20;

    @OriginalMember(owner = "client!MKANHSMC", name = "h", descriptor = "I")
    public int field1166 = 1;

    @OriginalMember(owner = "client!MKANHSMC", name = "i", descriptor = "[J")
    private long[] field1167 = new long[10];

    @OriginalMember(owner = "client!MKANHSMC", name = "k", descriptor = "Z")
    public boolean field1169 = false;

    @OriginalMember(owner = "client!MKANHSMC", name = "p", descriptor = "[LGPLGZASP;")
    public class21[] field1174 = new class21[6];

    @OriginalMember(owner = "client!MKANHSMC", name = "r", descriptor = "Z")
    public boolean field1176 = true;

    @OriginalMember(owner = "client!MKANHSMC", name = "s", descriptor = "Z")
    public boolean field1177 = true;

    @OriginalMember(owner = "client!MKANHSMC", name = "F", descriptor = "[I")
    public int[] field1190 = new int[128];

    @OriginalMember(owner = "client!MKANHSMC", name = "G", descriptor = "[I")
    private int[] field1191 = new int[128];

    @OriginalMember(owner = "client!MKANHSMC", name = "c", descriptor = "I")
    private int field1161;

    @OriginalMember(owner = "client!MKANHSMC", name = "f", descriptor = "I")
    private int field1164;

    @OriginalMember(owner = "client!MKANHSMC", name = "j", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "client!MKANHSMC", name = "l", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "client!MKANHSMC", name = "m", descriptor = "I")
    public int field1171;

    @OriginalMember(owner = "client!MKANHSMC", name = "t", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "client!MKANHSMC", name = "u", descriptor = "I")
    public int field1179;

    @OriginalMember(owner = "client!MKANHSMC", name = "v", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "client!MKANHSMC", name = "w", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!MKANHSMC", name = "x", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "client!MKANHSMC", name = "y", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "client!MKANHSMC", name = "z", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "client!MKANHSMC", name = "B", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "client!MKANHSMC", name = "C", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "client!MKANHSMC", name = "D", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "client!MKANHSMC", name = "H", descriptor = "I")
    private int field1192;

    @OriginalMember(owner = "client!MKANHSMC", name = "I", descriptor = "I")
    private int field1193;

    @OriginalMember(owner = "client!MKANHSMC", name = "J", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!MKANHSMC", name = "A", descriptor = "J")
    public long field1185;

    @OriginalMember(owner = "client!MKANHSMC", name = "E", descriptor = "J")
    public long field1189;

    @OriginalMember(owner = "client!MKANHSMC", name = "o", descriptor = "LDTPUNZHN;")
    public class11 field1173;

    @OriginalMember(owner = "client!MKANHSMC", name = "q", descriptor = "LGLDYLWRM;")
    public class19 field1175;

    @OriginalMember(owner = "client!MKANHSMC", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1172;

    @OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "(III)V")
    public final void method353(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.field1163 = -14;
        }
        this.field1170 = arg2;
        this.field1171 = arg1;
        this.field1175 = new class19(true, this, this.field1171, this.field1170);
        this.field1172 = this.method135((byte) 1).getGraphics();
        this.field1173 = new class11(this.field1162, this.field1171, this.field1170, this.method135((byte) 1));
        this.method90(this, 1);
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "b", descriptor = "(III)V")
    public final void method354(int arg0, int arg1, int arg2) {
        this.field1170 = arg0;
        this.field1171 = arg1;
        this.field1172 = this.method135((byte) 1).getGraphics();
        this.field1173 = new class11(this.field1162, this.field1171, this.field1170, this.method135((byte) 1));
        this.method90(this, 1);
        if (arg2 == -43024) {
            ;
        }
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "run", descriptor = "()V")
    public void run() {
        this.method135((byte) 1).addMouseListener(this);
        this.method135((byte) 1).addMouseMotionListener(this);
        this.method135((byte) 1).addKeyListener(this);
        this.method135((byte) 1).addFocusListener(this);
        if (this.field1175 != null) {
            this.field1175.addWindowListener(this);
        }
        this.method125("Loading...", 0, (byte) 6);
        this.method176();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1167[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1164 < 0) {
                    if (this.field1164 == -1) {
                        this.method355(21668);
                    }
                    return;
                }
                if (this.field1164 > 0) {
                    this.field1164--;
                    if (this.field1164 == 0) {
                        this.method355(21668);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1167[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1167[var1]) {
                    var2 = (int) ((long) (this.field1165 * 2560) / (var11 - this.field1167[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1165 - (var11 - this.field1167[var1]) / 10L);
                }
                if (var3 > this.field1165) {
                    var3 = this.field1165;
                }
                this.field1167[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1167[var13] != 0L) {
                            this.field1167[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1166) {
                    var3 = this.field1166;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1186 = this.field1182;
                    this.field1187 = this.field1183;
                    this.field1188 = this.field1184;
                    this.field1189 = this.field1185;
                    this.field1182 = 0;
                    this.method94((byte) 8);
                    this.field1192 = this.field1193;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1165 > 0) {
                    this.field1168 = var2 * 1000 / (this.field1165 * 256);
                }
                this.method73(true);
            } while (!this.field1169);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1167[var15]);
            }
            System.out.println("fps:" + this.field1168 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1165 + " mindel:" + this.field1166);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1169 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "(I)V")
    public final void method355(int arg0) {
        this.field1164 = -2;
        this.method64(-27208);
        if (arg0 != 21668 || this.field1175 == null) {
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

    @OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "(IZ)V")
    public final void method356(int arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1165 = 1000 / arg0;
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1164 >= 0) {
            this.field1164 = 0;
        }
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1164 >= 0) {
            this.field1164 = 4000 / this.field1165;
        }
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1164 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field1164 == -1) {
            this.method355(21668);
        }
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1172 == null) {
            this.field1172 = arg0;
        }
        this.field1176 = true;
        this.method186(this.field1161);
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1172 == null) {
            this.field1172 = arg0;
        }
        this.field1176 = true;
        this.method186(this.field1161);
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1175 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1178 = 0;
        this.field1183 = var2;
        this.field1184 = var3;
        this.field1185 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1182 = 2;
            this.field1179 = 2;
        } else {
            this.field1182 = 1;
            this.field1179 = 1;
        }
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1178 = 0;
        this.field1179 = 0;
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1178 = 0;
        this.field1180 = -1;
        this.field1181 = -1;
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1175 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1178 = 0;
        this.field1180 = var2;
        this.field1181 = var3;
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1175 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1178 = 0;
        this.field1180 = var2;
        this.field1181 = var3;
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1178 = 0;
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
            this.field1190[var3] = 1;
        }
        if (var3 > 4) {
            this.field1191[this.field1193] = var3;
            this.field1193 = this.field1193 + 1 & 0x7F;
        }
        if (class71.field1729) {
        }
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1178 = 0;
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
            this.field1190[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "b", descriptor = "(I)I")
    public final int method357(int arg0) {
        if (arg0 != -23366) {
            this.field1163 = 430;
        }
        int var2 = -1;
        if (this.field1193 != this.field1192) {
            var2 = this.field1191[this.field1192];
            this.field1192 = this.field1192 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1177 = true;
        this.field1176 = true;
        this.method186(this.field1161);
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1177 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1190[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "()V")
    public void method176() {
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "(B)V")
    public void method94(byte arg0) {
        if (arg0 == 8) {
            ;
        }
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "c", descriptor = "(I)V")
    public void method64(int arg0) {
        if (arg0 == -27208) {
            ;
        }
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "(Z)V")
    public void method73(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "d", descriptor = "(I)V")
    public void method186(int arg0) {
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "b", descriptor = "(B)Ljava/awt/Component;")
    public Component method135(byte arg0) {
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            this.field1159 = !this.field1159;
        }
        return this.field1175 == null ? this : this.field1175;
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method90(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!MKANHSMC", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public void method125(String arg0, int arg1, byte arg2) {
        while (this.field1172 == null) {
            this.field1172 = this.method135((byte) 1).getGraphics();
            try {
                this.method135((byte) 1).repaint();
            } catch (Exception var11) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var10) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method135((byte) 1).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method135((byte) 1).getFontMetrics(var6);
        if (this.field1176) {
            this.field1172.setColor(Color.black);
            this.field1172.fillRect(0, 0, this.field1170, this.field1171);
            this.field1176 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field1171 / 2 - 18;
        this.field1172.setColor(var7);
        this.field1172.drawRect(this.field1170 / 2 - 152, var8, 304, 34);
        this.field1172.fillRect(this.field1170 / 2 - 150, var8 + 2, arg1 * 3, 30);
        this.field1172.setColor(Color.black);
        this.field1172.fillRect(arg1 * 3 + this.field1170 / 2 - 150, var8 + 2, 300 - arg1 * 3, 30);
        this.field1172.setFont(var4);
        if (arg2 == 6) {
            boolean var9 = false;
        } else {
            this.field1159 = !this.field1159;
        }
        this.field1172.setColor(Color.white);
        this.field1172.drawString(arg0, (this.field1170 - var5.stringWidth(arg0)) / 2, var8 + 22);
    }
}
