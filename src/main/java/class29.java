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

@OriginalClass("HXQNMAEJ")
public class class29 extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    @OriginalMember(owner = "HXQNMAEJ", name = "a", descriptor = "Z")
    private boolean field951 = true;

    @OriginalMember(owner = "HXQNMAEJ", name = "b", descriptor = "B")
    private byte field952 = -102;

    @OriginalMember(owner = "HXQNMAEJ", name = "c", descriptor = "I")
    private int field953 = 7129;

    @OriginalMember(owner = "HXQNMAEJ", name = "e", descriptor = "I")
    private int field955 = -353;

    @OriginalMember(owner = "HXQNMAEJ", name = "g", descriptor = "I")
    private int field957 = 20;

    @OriginalMember(owner = "HXQNMAEJ", name = "h", descriptor = "I")
    public int field958 = 1;

    @OriginalMember(owner = "HXQNMAEJ", name = "i", descriptor = "[J")
    private long[] field959 = new long[10];

    @OriginalMember(owner = "HXQNMAEJ", name = "k", descriptor = "Z")
    public boolean field961 = false;

    @OriginalMember(owner = "HXQNMAEJ", name = "p", descriptor = "[LDUMEPGRH;")
    public class10[] field966 = new class10[6];

    @OriginalMember(owner = "HXQNMAEJ", name = "r", descriptor = "Z")
    public boolean field968 = true;

    @OriginalMember(owner = "HXQNMAEJ", name = "s", descriptor = "Z")
    public boolean field969 = true;

    @OriginalMember(owner = "HXQNMAEJ", name = "F", descriptor = "[I")
    public int[] field982 = new int[128];

    @OriginalMember(owner = "HXQNMAEJ", name = "G", descriptor = "[I")
    private int[] field983 = new int[128];

    @OriginalMember(owner = "HXQNMAEJ", name = "d", descriptor = "I")
    private int field954;

    @OriginalMember(owner = "HXQNMAEJ", name = "f", descriptor = "I")
    private int field956;

    @OriginalMember(owner = "HXQNMAEJ", name = "j", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "HXQNMAEJ", name = "l", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "HXQNMAEJ", name = "m", descriptor = "I")
    public int field963;

    @OriginalMember(owner = "HXQNMAEJ", name = "t", descriptor = "I")
    public int field970;

    @OriginalMember(owner = "HXQNMAEJ", name = "u", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "HXQNMAEJ", name = "v", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "HXQNMAEJ", name = "w", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "HXQNMAEJ", name = "x", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "HXQNMAEJ", name = "y", descriptor = "I")
    public int field975;

    @OriginalMember(owner = "HXQNMAEJ", name = "z", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "HXQNMAEJ", name = "B", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "HXQNMAEJ", name = "C", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "HXQNMAEJ", name = "D", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "HXQNMAEJ", name = "H", descriptor = "I")
    private int field984;

    @OriginalMember(owner = "HXQNMAEJ", name = "I", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "HXQNMAEJ", name = "J", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "HXQNMAEJ", name = "A", descriptor = "J")
    public long field977;

    @OriginalMember(owner = "HXQNMAEJ", name = "E", descriptor = "J")
    public long field981;

    @OriginalMember(owner = "HXQNMAEJ", name = "o", descriptor = "LTWKZMYGD;")
    public class55 field965;

    @OriginalMember(owner = "HXQNMAEJ", name = "q", descriptor = "LDQQGYYJG;")
    public class8 field967;

    @OriginalMember(owner = "HXQNMAEJ", name = "n", descriptor = "Ljava/awt/Graphics;")
    public Graphics field964;

    @OriginalMember(owner = "HXQNMAEJ", name = "a", descriptor = "(III)V")
    public final void method368(int arg0, int arg1, int arg2) {
        if (arg0 >= 0) {
            return;
        }
        this.field962 = arg1;
        this.field963 = arg2;
        this.field967 = new class8(this.field963, this.field954, this.field962, this);
        this.field964 = this.method71(this.field953).getGraphics();
        this.field965 = new class55(this.field963, this.field962, (byte) 22, this.method71(this.field953));
        this.method64(this, 1);
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "b", descriptor = "(III)V")
    public final void method369(int arg0, int arg1, int arg2) {
        this.field962 = arg1;
        this.field963 = arg2;
        if (arg0 != 11004) {
            this.field953 = -333;
        }
        this.field964 = this.method71(this.field953).getGraphics();
        this.field965 = new class55(this.field963, this.field962, (byte) 22, this.method71(this.field953));
        this.method64(this, 1);
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "run", descriptor = "()V")
    public void run() {
        this.method71(this.field953).addMouseListener(this);
        this.method71(this.field953).addMouseMotionListener(this);
        this.method71(this.field953).addKeyListener(this);
        this.method71(this.field953).addFocusListener(this);
        if (this.field967 != null) {
            this.field967.addWindowListener(this);
        }
        this.method23(0, "Loading...", 0);
        this.method83();
        int var1 = 0;
        int var2 = 256;
        int var3 = 1;
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < 10; var6++) {
            this.field959[var6] = System.currentTimeMillis();
        }
        long var7 = System.currentTimeMillis();
        while (true) {
            long var11;
            do {
                if (this.field956 < 0) {
                    if (this.field956 == -1) {
                        this.method370(this.field952);
                    }
                    return;
                }
                if (this.field956 > 0) {
                    this.field956--;
                    if (this.field956 == 0) {
                        this.method370(this.field952);
                        return;
                    }
                }
                int var9 = var2;
                int var10 = var3;
                var2 = 300;
                var3 = 1;
                var11 = System.currentTimeMillis();
                if (this.field959[var1] == 0L) {
                    var2 = var9;
                    var3 = var10;
                } else if (var11 > this.field959[var1]) {
                    var2 = (int) ((long) (this.field957 * 2560) / (var11 - this.field959[var1]));
                }
                if (var2 < 25) {
                    var2 = 25;
                }
                if (var2 > 256) {
                    var2 = 256;
                    var3 = (int) ((long) this.field957 - (var11 - this.field959[var1]) / 10L);
                }
                if (var3 > this.field957) {
                    var3 = this.field957;
                }
                this.field959[var1] = var11;
                var1 = (var1 + 1) % 10;
                if (var3 > 1) {
                    for (int var13 = 0; var13 < 10; var13++) {
                        if (this.field959[var13] != 0L) {
                            this.field959[var13] += var3;
                        }
                    }
                }
                if (var3 < this.field958) {
                    var3 = this.field958;
                }
                try {
                    Thread.sleep((long) var3);
                } catch (InterruptedException var16) {
                    var5++;
                }
                while (var4 < 256) {
                    this.field978 = this.field974;
                    this.field979 = this.field975;
                    this.field980 = this.field976;
                    this.field981 = this.field977;
                    this.field974 = 0;
                    this.method61(true);
                    this.field984 = this.field985;
                    var4 += var2;
                }
                var4 &= 0xFF;
                if (this.field957 > 0) {
                    this.field960 = var2 * 1000 / (this.field957 * 256);
                }
                this.method11((byte) -90);
            } while (!this.field961);
            System.out.println("ntime:" + var11);
            for (int var14 = 0; var14 < 10; var14++) {
                int var15 = (var1 + 20 - var14 - 1) % 10;
                System.out.println("otim" + var15 + ":" + this.field959[var15]);
            }
            System.out.println("fps:" + this.field960 + " ratio:" + var2 + " count:" + var4);
            System.out.println("del:" + var3 + " deltime:" + this.field957 + " mindel:" + this.field958);
            System.out.println("intex:" + var5 + " opos:" + var1);
            this.field961 = false;
            var5 = 0;
        }
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "a", descriptor = "(B)V")
    public final void method370(byte arg0) {
        this.field956 = -2;
        if (arg0 != -102) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.method37(1);
        if (this.field967 == null) {
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

    @OriginalMember(owner = "HXQNMAEJ", name = "a", descriptor = "(II)V")
    public final void method371(int arg0, int arg1) {
        while (arg1 >= 0) {
            this.field951 = !this.field951;
        }
        this.field957 = 1000 / arg0;
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "start", descriptor = "()V")
    public final void start() {
        if (this.field956 >= 0) {
            this.field956 = 0;
        }
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "stop", descriptor = "()V")
    public final void stop() {
        if (this.field956 >= 0) {
            this.field956 = 4000 / this.field957;
        }
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "destroy", descriptor = "()V")
    public final void destroy() {
        this.field956 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception var1) {
        }
        if (this.field956 == -1) {
            this.method370(this.field952);
        }
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        if (this.field964 == null) {
            this.field964 = arg0;
        }
        this.field968 = true;
        this.method90((byte) 0);
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        if (this.field964 == null) {
            this.field964 = arg0;
        }
        this.field968 = true;
        this.method90((byte) 0);
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mousePressed(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field967 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field970 = 0;
        this.field975 = var2;
        this.field976 = var3;
        this.field977 = System.currentTimeMillis();
        if (arg0.isMetaDown()) {
            this.field974 = 2;
            this.field971 = 2;
        } else {
            this.field974 = 1;
            this.field971 = 1;
        }
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseReleased(MouseEvent arg0) {
        this.field970 = 0;
        this.field971 = 0;
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseEntered(MouseEvent arg0) {
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseExited(MouseEvent arg0) {
        this.field970 = 0;
        this.field972 = -1;
        this.field973 = -1;
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseDragged(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field967 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field970 = 0;
        this.field972 = var2;
        this.field973 = var3;
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseMoved(MouseEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        if (this.field967 != null) {
            var2 -= 4;
            var3 -= 22;
        }
        this.field970 = 0;
        this.field972 = var2;
        this.field973 = var3;
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyPressed(KeyEvent arg0) {
        this.field970 = 0;
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
            this.field982[var3] = 1;
        }
        if (var3 > 4) {
            this.field983[this.field985] = var3;
            this.field985 = this.field985 + 1 & 0x7F;
        }
        if (class6.field545) {
        }
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyReleased(KeyEvent arg0) {
        this.field970 = 0;
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
            this.field982[var3] = 0;
        }
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "a", descriptor = "(Z)I")
    public final int method372(boolean arg0) {
        if (arg0) {
            return this.field953;
        }
        int var2 = -1;
        if (this.field985 != this.field984) {
            var2 = this.field983[this.field984];
            this.field984 = this.field984 + 1 & 0x7F;
        }
        return var2;
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        this.field969 = true;
        this.field968 = true;
        this.method90((byte) 0);
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        this.field969 = false;
        for (int var2 = 0; var2 < 128; var2++) {
            this.field982[var2] = 0;
        }
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "a", descriptor = "()V")
    public void method83() {
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "b", descriptor = "(Z)V")
    public void method61(boolean arg0) {
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "a", descriptor = "(I)V")
    public void method37(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            ;
        }
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "b", descriptor = "(B)V")
    public void method11(byte arg0) {
        if (arg0 != -90) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "c", descriptor = "(B)V")
    public void method90(byte arg0) {
        if (arg0 != 0) {
            this.field955 = -400;
        }
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "b", descriptor = "(I)Ljava/awt/Component;")
    public Component method71(int arg0) {
        if (arg0 != 7129) {
            this.field954 = -17;
        }
        return this.field967 == null ? this : this.field967;
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public void method64(Runnable arg0, int arg1) {
        Thread var3 = new Thread(arg0);
        var3.start();
        var3.setPriority(arg1);
    }

    @OriginalMember(owner = "HXQNMAEJ", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public void method23(int arg0, String arg1, int arg2) {
        while (this.field964 == null) {
            this.field964 = this.method71(this.field953).getGraphics();
            try {
                this.method71(this.field953).repaint();
            } catch (Exception var10) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception var9) {
            }
        }
        Font var4 = new Font("Helvetica", 1, 13);
        FontMetrics var5 = this.method71(this.field953).getFontMetrics(var4);
        Font var6 = new Font("Helvetica", 0, 13);
        this.method71(this.field953).getFontMetrics(var6);
        if (this.field968) {
            this.field964.setColor(Color.black);
            this.field964.fillRect(0, 0, this.field962, this.field963);
            this.field968 = false;
        }
        Color var7 = new Color(140, 17, 17);
        int var8 = this.field963 / 2 - 18;
        this.field964.setColor(var7);
        this.field964.drawRect(this.field962 / 2 - 152, var8, 304, 34);
        this.field964.fillRect(this.field962 / 2 - 150, var8 + 2, arg2 * 3, 30);
        if (arg0 != 0) {
            return;
        }
        this.field964.setColor(Color.black);
        this.field964.fillRect(arg2 * 3 + this.field962 / 2 - 150, var8 + 2, 300 - arg2 * 3, 30);
        this.field964.setFont(var4);
        this.field964.setColor(Color.white);
        this.field964.drawString(arg1, (this.field962 - var5.stringWidth(arg1)) / 2, var8 + 22);
    }
}
