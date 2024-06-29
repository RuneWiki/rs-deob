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

@OriginalClass("client!NHAOTYHM")
public class class38 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "Z")
    private boolean field1062 = true;

    @OriginalMember(owner = "client!NHAOTYHM", name = "b", descriptor = "I")
    private int field1063 = 374;

    @OriginalMember(owner = "client!NHAOTYHM", name = "c", descriptor = "I")
    private int field1064 = 672;

    @OriginalMember(owner = "client!NHAOTYHM", name = "d", descriptor = "Z")
    private boolean field1065 = false;

    @OriginalMember(owner = "client!NHAOTYHM", name = "e", descriptor = "I")
    private int field1066 = 827;

    @OriginalMember(owner = "client!NHAOTYHM", name = "f", descriptor = "I")
    private int field1067 = 3;

    @OriginalMember(owner = "client!NHAOTYHM", name = "h", descriptor = "I")
    private int field1069 = 20;

    @OriginalMember(owner = "client!NHAOTYHM", name = "i", descriptor = "I")
    public int field1070 = 1;

    @OriginalMember(owner = "client!NHAOTYHM", name = "j", descriptor = "[J")
    private long[] field1071 = new long[10];

    @OriginalMember(owner = "client!NHAOTYHM", name = "l", descriptor = "Z")
    public boolean field1073 = false;

    @OriginalMember(owner = "client!NHAOTYHM", name = "q", descriptor = "[LZSWNSCUQ;")
    public class72[] field1078 = new class72[6];

    @OriginalMember(owner = "client!NHAOTYHM", name = "s", descriptor = "Z")
    public boolean field1080 = true;

    @OriginalMember(owner = "client!NHAOTYHM", name = "t", descriptor = "Z")
    public boolean field1081 = true;

    @OriginalMember(owner = "client!NHAOTYHM", name = "G", descriptor = "[I")
    public int[] field1094 = new int[128];

    @OriginalMember(owner = "client!NHAOTYHM", name = "H", descriptor = "[I")
    private int[] field1095 = new int[128];

    @OriginalMember(owner = "client!NHAOTYHM", name = "g", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "client!NHAOTYHM", name = "k", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!NHAOTYHM", name = "m", descriptor = "I")
    public int field1074;

    @OriginalMember(owner = "client!NHAOTYHM", name = "n", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "client!NHAOTYHM", name = "u", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!NHAOTYHM", name = "v", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!NHAOTYHM", name = "w", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "client!NHAOTYHM", name = "x", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "client!NHAOTYHM", name = "y", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "client!NHAOTYHM", name = "z", descriptor = "I")
    public int field1087;

    @OriginalMember(owner = "client!NHAOTYHM", name = "A", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!NHAOTYHM", name = "C", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "client!NHAOTYHM", name = "D", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "client!NHAOTYHM", name = "E", descriptor = "I")
    public int field1092;

    @OriginalMember(owner = "client!NHAOTYHM", name = "I", descriptor = "I")
    private int field1096;

    @OriginalMember(owner = "client!NHAOTYHM", name = "J", descriptor = "I")
    private int field1097;

    @OriginalMember(owner = "client!NHAOTYHM", name = "K", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!NHAOTYHM", name = "B", descriptor = "J")
    public long field1089;

    @OriginalMember(owner = "client!NHAOTYHM", name = "F", descriptor = "J")
    public long field1093;

    @OriginalMember(owner = "client!NHAOTYHM", name = "p", descriptor = "LHVBGFDBD;")
    public class19 field1077;

    @OriginalMember(owner = "client!NHAOTYHM", name = "r", descriptor = "LVZJCTUDQ;")
    public class65 field1079;

    @OriginalMember(owner = "client!NHAOTYHM", name = "o", descriptor = "Ljava/awt/Graphics;")
    public Graphics field1076;

    @OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "(BII)V")
    public final void method317(byte arg0, int arg1, int arg2) {
        this.field1074 = arg2;
        this.field1075 = arg1;
        this.field1079 = new class65(-859, this, this.field1075, this.field1074);
        if (arg0 == 3) {
            boolean var4 = false;
        } else {
            this.field1066 = -229;
        }
        this.field1076 = this.method128(-489).getGraphics();
        this.field1077 = new class19(this.method128(-489), this.field1075, 45981, this.field1074);
        this.method123(this, 1);
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "(III)V")
    public final void method318(int arg0, int arg1, int arg2) {
        this.field1074 = arg1;
        if (arg2 < 4 || arg2 > 4) {
            this.field1066 = 398;
        }
        this.field1075 = arg0;
        this.field1076 = this.method128(-489).getGraphics();
        this.field1077 = new class19(this.method128(-489), this.field1075, 45981, this.field1074);
        this.method123(this, 1);
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "run", descriptor = "()V")
    public void run() {
        this.method128(-489).addMouseListener(this);
        this.method128(-489).addMouseMotionListener(this);
        this.method128(-489).addKeyListener(this);
        this.method128(-489).addFocusListener(this);
        if (this.field1079 != null) {
            this.field1079.addWindowListener(this);
        }
        this.method174("Loading...", 27936, 0);
        this.method113();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field1071[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field1068 < 0) {
                    if (this.field1068 == -1) {
                        this.method319(0);
                    }
                    return;
                }
                if (this.field1068 > 0) {
                    this.field1068--;
                    if (this.field1068 == 0) {
                        this.method319(0);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field1071[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field1071[var1]) {
                    var2 = (int) ((long) (this.field1069 * 2560) / (var11 - this.field1071[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field1069 - (var11 - this.field1071[var1]) / 10L);
                }
                if (var3 > this.field1069) {
                    var3 = this.field1069;
                }
                this.field1071[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field1071[var13] != 0L) {
                            this.field1071[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field1070) {
                    var3 = this.field1070;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field1090 = this.field1086;
                    this.field1091 = this.field1087;
                    this.field1092 = this.field1088;
                    this.field1093 = this.field1089;
                    this.field1086 = 0;
                    this.method180(-872);
                    this.field1096 = this.field1097;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field1069 > 0) {
                    this.field1072 = var2 * 1000 / (this.field1069 * 256);
                }
                this.method161(672);
            } while (!this.field1073);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field1071[var15]);
            }
            System.out.println("fps:" + this.field1072 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field1069 + " mindel:" + this.field1070);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field1073 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "(I)V")
    public final void method319(int arg0) {
        this.field1068 = -2;
        this.method148(374);
        if (arg0 != 0 || this.field1079 == null) {
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

    @OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "(II)V")
    public final void method320(int arg0, int arg1) {
        this.field1069 = 1000 / arg0;
        if (arg1 != 0) {
            this.field1062 = !this.field1062;
        }
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field1068 >= 0) {
            this.field1068 = 0;
        }
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field1068 >= 0) {
            this.field1068 = 4000 / this.field1069;
        }
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field1068 = -1;
        try {
            Thread.sleep(10000L);
        } catch (Exception var1) {
        }
        if (this.field1068 == -1) {
            this.method319(0);
        }
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field1076 == null) {
            this.field1076 = arg0;
        }
        this.field1080 = true;
        this.method101(false);
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field1076 == null) {
            this.field1076 = arg0;
        }
        this.field1080 = true;
        this.method101(false);
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1079 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1082 = 0;
        this.field1087 = var2;
        this.field1088 = var3;
        this.field1089 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field1086 = 2;
            this.field1083 = 2;
        } else {
            this.field1086 = 1;
            this.field1083 = 1;
        }
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field1082 = 0;
        this.field1083 = 0;
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field1082 = 0;
        this.field1084 = -1;
        this.field1085 = -1;
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1079 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1082 = 0;
        this.field1084 = var2;
        this.field1085 = var3;
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field1079 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field1082 = 0;
        this.field1084 = var2;
        this.field1085 = var3;
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field1082 = 0;
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
            this.field1094[var3] = 1;
        }
        if (var3 > 4) {
            this.field1095[this.field1097] = var3;
            this.field1097 = this.field1097 + 1 & 0x7F;
        }
        if (class57.field1577) {
        }
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field1082 = 0;
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
            this.field1094[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "(B)I")
    public final int method321(byte arg0) {
        if (arg0 != 9) {
            return this.field1066;
        }
        int var2 = -1;
        if (this.field1097 != this.field1096) {
            var2 = this.field1095[this.field1096];
            this.field1096 = this.field1096 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field1081 = true;
        this.field1080 = true;
        this.method101(false);
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field1081 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field1094[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "()V")
    public void method113() {
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "b", descriptor = "(I)V")
    public void method180(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "c", descriptor = "(I)V")
    public void method148(int arg0) {
        int var2 = 25 / arg0;
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "d", descriptor = "(I)V")
    public void method161(int arg0) {
        int var2 = 74 / arg0;
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "(Z)V")
    public void method101(boolean arg0) {
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public Component method128(int arg0) {
        if (arg0 >= 0) {
            this.field1067 = -127;
        }
        return this.field1079 == null ? this : this.field1079;
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method123(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "client!NHAOTYHM", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public void method174(String arg0, int arg1, int arg2) {
        while (this.field1076 == null) {
            this.field1076 = this.method128(-489).getGraphics();
            try {
                this.method128(-489).repaint();
            } catch (Exception var11) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var10) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method128(-489).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method128(-489).getFontMetrics(var6);
        if (this.field1080) {
            this.field1076.setColor(Color.black);
            this.field1076.fillRect(0, 0, this.field1074, this.field1075);
            this.field1080 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field1075 / 2 - 18;
        this.field1076.setColor(var7);
        this.field1076.drawRect(this.field1074 / 2 - 152, var8, 304, 34);
        this.field1076.fillRect(this.field1074 / 2 - 150, var8 + 2, arg2 * 3, 30);
        if (arg1 != 27936) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field1076.setColor(Color.black);
        this.field1076.fillRect(arg2 * 3 + this.field1074 / 2 - 150, var8 + 2, 300 - arg2 * 3, 30);
        this.field1076.setFont(var4);
        this.field1076.setColor(Color.white);
        this.field1076.drawString(arg0, (this.field1074 - var5.stringWidth(arg0)) / 2, var8 + 22);
    }
}
