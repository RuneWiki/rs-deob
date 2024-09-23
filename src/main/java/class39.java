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

@OriginalClass("OFXQYNOM")
public class class39 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "OFXQYNOM", name = "a", descriptor = "I")
    private int field1183 = 862;

    @OriginalMember(owner = "OFXQYNOM", name = "c", descriptor = "B")
    private byte field1185 = 5;

    @OriginalMember(owner = "OFXQYNOM", name = "d", descriptor = "Z")
    private boolean field1186 = true;

    @OriginalMember(owner = "OFXQYNOM", name = "f", descriptor = "I")
    private int field1188 = 20;

    @OriginalMember(owner = "OFXQYNOM", name = "g", descriptor = "I")
    public int field1189 = 1;

    @OriginalMember(owner = "OFXQYNOM", name = "h", descriptor = "[J")
    private long[] field1190 = new long[10];

    @OriginalMember(owner = "OFXQYNOM", name = "j", descriptor = "Z")
    public boolean field1192 = false;

    @OriginalMember(owner = "OFXQYNOM", name = "o", descriptor = "[LTTWFVYGB;")
    public class52[] field1197 = new class52[6];

    @OriginalMember(owner = "OFXQYNOM", name = "q", descriptor = "Z")
    public boolean field1199 = true;

    @OriginalMember(owner = "OFXQYNOM", name = "r", descriptor = "Z")
    public boolean field1200 = true;

    @OriginalMember(owner = "OFXQYNOM", name = "E", descriptor = "[I")
    public int[] field1213 = new int[128];

    @OriginalMember(owner = "OFXQYNOM", name = "F", descriptor = "[I")
    private int[] field1214 = new int[128];

    @OriginalMember(owner = "OFXQYNOM", name = "b", descriptor = "I")
    private int field1184;

    @OriginalMember(owner = "OFXQYNOM", name = "e", descriptor = "I")
    private int field1187;

    @OriginalMember(owner = "OFXQYNOM", name = "i", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "OFXQYNOM", name = "k", descriptor = "I")
    public int field1193;

    @OriginalMember(owner = "OFXQYNOM", name = "l", descriptor = "I")
    public int field1194;

    @OriginalMember(owner = "OFXQYNOM", name = "s", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "OFXQYNOM", name = "t", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "OFXQYNOM", name = "u", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "OFXQYNOM", name = "v", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "OFXQYNOM", name = "w", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "OFXQYNOM", name = "x", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "OFXQYNOM", name = "y", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "OFXQYNOM", name = "A", descriptor = "I")
    public int field1209;

    @OriginalMember(owner = "OFXQYNOM", name = "B", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "OFXQYNOM", name = "C", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "OFXQYNOM", name = "G", descriptor = "I")
    private int field1215;

    @OriginalMember(owner = "OFXQYNOM", name = "H", descriptor = "I")
    private int field1216;

    @OriginalMember(owner = "OFXQYNOM", name = "I", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "OFXQYNOM", name = "z", descriptor = "J")
    public long field1208;

    @OriginalMember(owner = "OFXQYNOM", name = "D", descriptor = "J")
    public long field1212;

    @OriginalMember(owner = "OFXQYNOM", name = "p", descriptor = "LJYOWNEXJ;")
    public class25 field1198;

    @OriginalMember(owner = "OFXQYNOM", name = "n", descriptor = "LMVSFNVJP;")
    public class34 field1196;

    @OriginalMember(owner = "OFXQYNOM", name = "m", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1195;

    @OriginalMember(owner = "OFXQYNOM", name = "a", descriptor = "(BII)V")
    public final void method403(byte arg0, int arg1, int arg2) {
        this.field1193 = arg2;
        this.field1194 = arg1;
        this.field1198 = new class25(this.field1193, this, this.field1194, 9);
        if (arg0 == 80) {
            this.field1195 = this.method174(false).getGraphics();
            this.field1196 = new class34(this.method174(false), this.field1194, this.field1193, 284);
            this.method164(this, 1);
        }
    }

    @OriginalMember(owner = "OFXQYNOM", name = "a", descriptor = "(IIB)V")
    public final void method404(int arg0, int arg1, byte arg2) {
        this.field1193 = arg0;
        this.field1194 = arg1;
        if (arg2 != 57) {
            this.field1183 = -103;
        }
        this.field1195 = this.method174(false).getGraphics();
        this.field1196 = new class34(this.method174(false), this.field1194, this.field1193, 284);
        this.method164(this, 1);
    }

    @OriginalMember(owner = "OFXQYNOM", name = "run", descriptor = "()V")
    public void run() {
        this.method174(false).addMouseListener(this);
        this.method174(false).addMouseMotionListener(this);
        this.method174(false).addKeyListener(this);
        this.method174(false).addFocusListener(this);
        if (this.field1198 != null) {
            this.field1198.addWindowListener(this);
        }
        this.method188(53, "Loading...", 0);
        this.method123();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1190[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1187 < 0) {
                    if (this.field1187 == -1) {
                        this.method405(807);
                    }
                    return;
                }
                if (this.field1187 > 0) {
                    this.field1187--;
                    if (this.field1187 == 0) {
                        this.method405(807);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1190[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1190[var1]) {
                    var2 = (int) ((long) (this.field1188 * 2560) / (var11 - this.field1190[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1188 - (var11 - this.field1190[var1]) / 10L);
                }
                if (var3 > this.field1188) {
                    var3 = this.field1188;
                }
                this.field1190[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1190[var13] != 0L) {
                            this.field1190[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1189) {
                    var3 = this.field1189;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1209 = this.field1205;
                    this.field1210 = this.field1206;
                    this.field1211 = this.field1207;
                    this.field1212 = this.field1208;
                    this.field1205 = 0;
                    this.method184(0);
                    this.field1215 = this.field1216;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1188 > 0) {
                    this.field1191 = var2 * 1000 / (this.field1188 * 256);
                }
                this.method137(0);
            } while (!this.field1192);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1190[var15]);
            }
            System.out.println("fps:" + this.field1191 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1188 + " mindel:" + this.field1189);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1192 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "OFXQYNOM", name = "a", descriptor = "(I)V")
    public final void method405(int arg0) {
        this.field1187 = -2;
        this.method108((byte) 8);
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field1198 == null) {
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

    @OriginalMember(owner = "OFXQYNOM", name = "a", descriptor = "(IZ)V")
    public final void method406(int arg0, boolean arg1) {
        if (arg1) {
            this.field1188 = 1000 / arg0;
        }
    }

    @OriginalMember(owner = "OFXQYNOM", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1187 >= 0) {
            this.field1187 = 0;
        }
    }

    @OriginalMember(owner = "OFXQYNOM", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1187 >= 0) {
            this.field1187 = 4000 / this.field1188;
        }
    }

    @OriginalMember(owner = "OFXQYNOM", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1187 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field1187 == -1) {
            this.method405(807);
        }
    }

    @OriginalMember(owner = "OFXQYNOM", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1195 == null) {
            this.field1195 = arg0;
        }
        this.field1199 = true;
        this.method162(-591);
    }

    @OriginalMember(owner = "OFXQYNOM", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1195 == null) {
            this.field1195 = arg0;
        }
        this.field1199 = true;
        this.method162(-591);
    }

    @OriginalMember(owner = "OFXQYNOM", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1198 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1201 = 0;
        this.field1206 = var2;
        this.field1207 = var3;
        this.field1208 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1205 = 2;
            this.field1202 = 2;
        } else {
            this.field1205 = 1;
            this.field1202 = 1;
        }
    }

    @OriginalMember(owner = "OFXQYNOM", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1201 = 0;
        this.field1202 = 0;
    }

    @OriginalMember(owner = "OFXQYNOM", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "OFXQYNOM", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "OFXQYNOM", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1201 = 0;
        this.field1203 = -1;
        this.field1204 = -1;
    }

    @OriginalMember(owner = "OFXQYNOM", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1198 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1201 = 0;
        this.field1203 = var2;
        this.field1204 = var3;
    }

    @OriginalMember(owner = "OFXQYNOM", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1198 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1201 = 0;
        this.field1203 = var2;
        this.field1204 = var3;
    }

    @OriginalMember(owner = "OFXQYNOM", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1201 = 0;
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
            this.field1213[var3] = 1;
        }
        if (var3 > 4) {
            this.field1214[this.field1216] = var3;
            this.field1216 = this.field1216 + 1 & 0x7F;
        }
        if (class8.field617) {
        }
    }

    @OriginalMember(owner = "OFXQYNOM", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1201 = 0;
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
            this.field1213[var3] = 0;
        }
    }

    @OriginalMember(owner = "OFXQYNOM", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "OFXQYNOM", name = "a", descriptor = "(Z)I")
    public final int method407(boolean arg0) {
        int var2 = -1;
        if (arg0) {
            return this.field1184;
        }
        if (this.field1216 != this.field1215) {
            var2 = this.field1214[this.field1215];
            this.field1215 = this.field1215 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "OFXQYNOM", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1200 = true;
        this.field1199 = true;
        this.method162(-591);
    }

    @OriginalMember(owner = "OFXQYNOM", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1200 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1213[var2] = 0;
        }
    }

    @OriginalMember(owner = "OFXQYNOM", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "OFXQYNOM", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "OFXQYNOM", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "OFXQYNOM", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "OFXQYNOM", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "OFXQYNOM", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "OFXQYNOM", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "OFXQYNOM", name = "a", descriptor = "()V")
    public void method123() {
    }

    @OriginalMember(owner = "OFXQYNOM", name = "b", descriptor = "(I)V")
    public void method184(int arg0) {
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "OFXQYNOM", name = "a", descriptor = "(B)V")
    public void method108(byte arg0) {
        if (arg0 == 8) {
            boolean var2 = false;
        } else {
            this.field1186 = !this.field1186;
        }
    }

    @OriginalMember(owner = "OFXQYNOM", name = "c", descriptor = "(I)V")
    public void method137(int arg0) {
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "OFXQYNOM", name = "d", descriptor = "(I)V")
    public void method162(int arg0) {
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "OFXQYNOM", name = "b", descriptor = "(Z)Ljava/awt/Component;")
    public Component method174(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field1198 == null ? this : this.field1198;
    }

    @OriginalMember(owner = "OFXQYNOM", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method164(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "OFXQYNOM", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public void method188(int arg0, String arg1, int arg2) {
        while (this.field1195 == null) {
            this.field1195 = this.method174(false).getGraphics();
            try {
                this.method174(false).repaint();
            } catch (Exception var11) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var10) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method174(false).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method174(false).getFontMetrics(var6);
        if (this.field1199) {
            this.field1195.setColor(Color.black);
            this.field1195.fillRect(0, 0, this.field1193, this.field1194);
            this.field1199 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = 36 / arg0;
        int var9 = this.field1194 / 2 - 18;
        this.field1195.setColor(var7);
        this.field1195.drawRect(this.field1193 / 2 - 152, var9, 304, 34);
        this.field1195.fillRect(this.field1193 / 2 - 150, var9 + 2, arg2 * 3, 30);
        this.field1195.setColor(Color.black);
        this.field1195.fillRect(arg2 * 3 + this.field1193 / 2 - 150, var9 + 2, 300 - arg2 * 3, 30);
        this.field1195.setFont(var4);
        this.field1195.setColor(Color.white);
        this.field1195.drawString(arg1, (this.field1193 - var5.stringWidth(arg1)) / 2, var9 + 22);
    }
}
