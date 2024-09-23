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

@OriginalClass("IVVPRVRY")
public class class33 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "IVVPRVRY", name = "a", descriptor = "I")
    private int field1087 = 7603;

    @OriginalMember(owner = "IVVPRVRY", name = "b", descriptor = "I")
    private int field1088 = -223;

    @OriginalMember(owner = "IVVPRVRY", name = "c", descriptor = "I")
    private int field1089 = -223;

    @OriginalMember(owner = "IVVPRVRY", name = "d", descriptor = "B")
    private byte field1090 = 8;

    @OriginalMember(owner = "IVVPRVRY", name = "e", descriptor = "Z")
    private boolean field1091 = true;

    @OriginalMember(owner = "IVVPRVRY", name = "g", descriptor = "I")
    private int field1093 = 20;

    @OriginalMember(owner = "IVVPRVRY", name = "h", descriptor = "I")
    public int field1094 = 1;

    @OriginalMember(owner = "IVVPRVRY", name = "i", descriptor = "[J")
    private long[] field1095 = new long[10];

    @OriginalMember(owner = "IVVPRVRY", name = "k", descriptor = "Z")
    public boolean field1097 = false;

    @OriginalMember(owner = "IVVPRVRY", name = "p", descriptor = "[LJONKABPT;")
    public class37[] field1102 = new class37[6];

    @OriginalMember(owner = "IVVPRVRY", name = "r", descriptor = "Z")
    public boolean field1104 = true;

    @OriginalMember(owner = "IVVPRVRY", name = "s", descriptor = "Z")
    public boolean field1105 = true;

    @OriginalMember(owner = "IVVPRVRY", name = "F", descriptor = "[I")
    public int[] field1118 = new int[128];

    @OriginalMember(owner = "IVVPRVRY", name = "G", descriptor = "[I")
    private int[] field1119 = new int[128];

    @OriginalMember(owner = "IVVPRVRY", name = "f", descriptor = "I")
    private int field1092;

    @OriginalMember(owner = "IVVPRVRY", name = "j", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "IVVPRVRY", name = "l", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "IVVPRVRY", name = "m", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "IVVPRVRY", name = "t", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "IVVPRVRY", name = "u", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "IVVPRVRY", name = "v", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "IVVPRVRY", name = "w", descriptor = "I")
    public int field1109;

    @OriginalMember(owner = "IVVPRVRY", name = "x", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "IVVPRVRY", name = "y", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "IVVPRVRY", name = "z", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "IVVPRVRY", name = "B", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "IVVPRVRY", name = "C", descriptor = "I")
    public int field1115;

    @OriginalMember(owner = "IVVPRVRY", name = "D", descriptor = "I")
    public int field1116;

    @OriginalMember(owner = "IVVPRVRY", name = "H", descriptor = "I")
    private int field1120;

    @OriginalMember(owner = "IVVPRVRY", name = "I", descriptor = "I")
    private int field1121;

    @OriginalMember(owner = "IVVPRVRY", name = "J", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "IVVPRVRY", name = "A", descriptor = "J")
    public long field1113;

    @OriginalMember(owner = "IVVPRVRY", name = "E", descriptor = "J")
    public long field1117;

    @OriginalMember(owner = "IVVPRVRY", name = "o", descriptor = "LFETXLXVZ;")
    public class16 field1101;

    @OriginalMember(owner = "IVVPRVRY", name = "q", descriptor = "LVIXZTSSP;")
    public class65 field1103;

    @OriginalMember(owner = "IVVPRVRY", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1100;

    @OriginalMember(owner = "IVVPRVRY", name = "a", descriptor = "(IBI)V")
    public final void method399(int arg0, byte arg1, int arg2) {
        this.field1098 = arg2;
        if (arg1 != 1) {
            return;
        }
        boolean var4 = false;
        this.field1099 = arg0;
        this.field1103 = new class65((byte) 4, this, this.field1098, this.field1099);
        this.field1100 = this.method190(0).getGraphics();
        this.field1101 = new class16(this.method190(0), 30871, this.field1098, this.field1099);
        this.method117(this, 1);
    }

    @OriginalMember(owner = "IVVPRVRY", name = "a", descriptor = "(ZII)V")
    public final void method400(boolean arg0, int arg1, int arg2) {
        this.field1098 = arg2;
        this.field1099 = arg1;
        this.field1100 = this.method190(0).getGraphics();
        this.field1101 = new class16(this.method190(0), 30871, this.field1098, this.field1099);
        this.method117(this, 1);
        if (!arg0) {
            this.field1091 = !this.field1091;
        }
    }

    @OriginalMember(owner = "IVVPRVRY", name = "run", descriptor = "()V")
    public void run() {
        this.method190(0).addMouseListener(this);
        this.method190(0).addMouseMotionListener(this);
        this.method190(0).addKeyListener(this);
        this.method190(0).addFocusListener(this);
        if (this.field1103 != null) {
            this.field1103.addWindowListener(this);
        }
        this.method200("Loading...", 0, 5);
        this.method197();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1095[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1092 < 0) {
                    if (this.field1092 == -1) {
                        this.method401((byte) -30);
                    }
                    return;
                }
                if (this.field1092 > 0) {
                    this.field1092--;
                    if (this.field1092 == 0) {
                        this.method401((byte) -30);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1095[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1095[var1]) {
                    var2 = (int) ((long) (this.field1093 * 2560) / (var11 - this.field1095[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1093 - (var11 - this.field1095[var1]) / 10L);
                }
                if (var3 > this.field1093) {
                    var3 = this.field1093;
                }
                this.field1095[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1095[var13] != 0L) {
                            this.field1095[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1094) {
                    var3 = this.field1094;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1114 = this.field1110;
                    this.field1115 = this.field1111;
                    this.field1116 = this.field1112;
                    this.field1117 = this.field1113;
                    this.field1110 = 0;
                    this.method136(this.field1088);
                    this.field1120 = this.field1121;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1093 > 0) {
                    this.field1096 = var2 * 1000 / (this.field1093 * 256);
                }
                this.method115((byte) 8);
            } while (!this.field1097);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1095[var15]);
            }
            System.out.println("fps:" + this.field1096 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1093 + " mindel:" + this.field1094);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1097 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "IVVPRVRY", name = "a", descriptor = "(B)V")
    public final void method401(byte arg0) {
        this.field1092 = -2;
        if (arg0 != -30) {
            return;
        }
        this.method176(false);
        if (this.field1103 == null) {
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

    @OriginalMember(owner = "IVVPRVRY", name = "a", descriptor = "(BI)V")
    public final void method402(byte arg0, int arg1) {
        this.field1093 = 1000 / arg1;
        if (arg0 != 41) {
            this.field1091 = !this.field1091;
        }
    }

    @OriginalMember(owner = "IVVPRVRY", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1092 >= 0) {
            this.field1092 = 0;
        }
    }

    @OriginalMember(owner = "IVVPRVRY", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1092 >= 0) {
            this.field1092 = 4000 / this.field1093;
        }
    }

    @OriginalMember(owner = "IVVPRVRY", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1092 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field1092 == -1) {
            this.method401((byte) -30);
        }
    }

    @OriginalMember(owner = "IVVPRVRY", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1100 == null) {
            this.field1100 = arg0;
        }
        this.field1104 = true;
        this.method86(false);
    }

    @OriginalMember(owner = "IVVPRVRY", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1100 == null) {
            this.field1100 = arg0;
        }
        this.field1104 = true;
        this.method86(false);
    }

    @OriginalMember(owner = "IVVPRVRY", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1103 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1106 = 0;
        this.field1111 = var2;
        this.field1112 = var3;
        this.field1113 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1110 = 2;
            this.field1107 = 2;
        } else {
            this.field1110 = 1;
            this.field1107 = 1;
        }
    }

    @OriginalMember(owner = "IVVPRVRY", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1106 = 0;
        this.field1107 = 0;
    }

    @OriginalMember(owner = "IVVPRVRY", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "IVVPRVRY", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "IVVPRVRY", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1106 = 0;
        this.field1108 = -1;
        this.field1109 = -1;
    }

    @OriginalMember(owner = "IVVPRVRY", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1103 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1106 = 0;
        this.field1108 = var2;
        this.field1109 = var3;
    }

    @OriginalMember(owner = "IVVPRVRY", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1103 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1106 = 0;
        this.field1108 = var2;
        this.field1109 = var3;
    }

    @OriginalMember(owner = "IVVPRVRY", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1106 = 0;
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
            this.field1118[var3] = 1;
        }
        if (var3 > 4) {
            this.field1119[this.field1121] = var3;
            this.field1121 = this.field1121 + 1 & 0x7F;
        }
        if (class45.field1265) {
        }
    }

    @OriginalMember(owner = "IVVPRVRY", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1106 = 0;
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
            this.field1118[var3] = 0;
        }
    }

    @OriginalMember(owner = "IVVPRVRY", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "IVVPRVRY", name = "a", descriptor = "(I)I")
    public final int method403(int arg0) {
        int var2 = -1;
        if (arg0 != -27156) {
            return 4;
        }
        if (this.field1121 != this.field1120) {
            var2 = this.field1119[this.field1120];
            this.field1120 = this.field1120 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "IVVPRVRY", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1105 = true;
        this.field1104 = true;
        this.method86(false);
    }

    @OriginalMember(owner = "IVVPRVRY", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1105 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1118[var2] = 0;
        }
    }

    @OriginalMember(owner = "IVVPRVRY", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "IVVPRVRY", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "IVVPRVRY", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "IVVPRVRY", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "IVVPRVRY", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "IVVPRVRY", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "IVVPRVRY", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "IVVPRVRY", name = "a", descriptor = "()V")
    public void method197() {
    }

    @OriginalMember(owner = "IVVPRVRY", name = "b", descriptor = "(I)V")
    public void method136(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "IVVPRVRY", name = "a", descriptor = "(Z)V")
    public void method176(boolean arg0) {
        if (arg0) {
            this.field1087 = 138;
        }
    }

    @OriginalMember(owner = "IVVPRVRY", name = "b", descriptor = "(B)V")
    public void method115(byte arg0) {
        if (this.field1090 == arg0) {
            boolean var2 = false;
        }
    }

    @OriginalMember(owner = "IVVPRVRY", name = "b", descriptor = "(Z)V")
    public void method86(boolean arg0) {
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "IVVPRVRY", name = "c", descriptor = "(I)Ljava/awt/Component;")
    public Component method190(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return this.field1103 == null ? this : this.field1103;
    }

    @OriginalMember(owner = "IVVPRVRY", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method117(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "IVVPRVRY", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public void method200(String arg0, int arg1, int arg2) {
        while (this.field1100 == null) {
            this.field1100 = this.method190(0).getGraphics();
            try {
                this.method190(0).repaint();
            } catch (Exception var11) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var10) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method190(0).getFontMetrics(var4);
        if (arg2 != 5) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        Font var7 = new Font("Helvetica", 0, 13);
        this.method190(0).getFontMetrics(var7);
        if (this.field1104) {
            this.field1100.setColor(Color.black);
            this.field1100.fillRect(0, 0, this.field1098, this.field1099);
            this.field1104 = false;
        }
        Color var8 = new Color(140, 17, 17);
        int var9 = this.field1099 / 2 - 18;
        this.field1100.setColor(var8);
        this.field1100.drawRect(this.field1098 / 2 - 152, var9, 304, 34);
        this.field1100.fillRect(this.field1098 / 2 - 150, var9 + 2, arg1 * 3, 30);
        this.field1100.setColor(Color.black);
        this.field1100.fillRect(arg1 * 3 + this.field1098 / 2 - 150, var9 + 2, 300 - arg1 * 3, 30);
        this.field1100.setFont(var4);
        this.field1100.setColor(Color.white);
        this.field1100.drawString(arg0, (this.field1098 - var5.stringWidth(arg0)) / 2, var9 + 22);
    }
}
