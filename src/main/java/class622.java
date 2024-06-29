import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public abstract class class622 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!vfa", name = "y", descriptor = "Z")
    private boolean field8926 = false;

    @OriginalMember(owner = "client!vfa", name = "G", descriptor = "Z")
    private boolean field8934 = false;

    @OriginalMember(owner = "client!vfa", name = "r", descriptor = "[I")
    public static int[] field8919 = new int[14];

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "I")
    public static int field8904;

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "I")
    public static int field8905;

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "I")
    public static int field8907;

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!vfa", name = "i", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!vfa", name = "j", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!vfa", name = "k", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!vfa", name = "l", descriptor = "I")
    public static int field8913;

    @OriginalMember(owner = "client!vfa", name = "m", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!vfa", name = "n", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!vfa", name = "o", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!vfa", name = "p", descriptor = "I")
    public static int field8917;

    @OriginalMember(owner = "client!vfa", name = "q", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!vfa", name = "s", descriptor = "I")
    public static int field8920;

    @OriginalMember(owner = "client!vfa", name = "t", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!vfa", name = "u", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!vfa", name = "v", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!vfa", name = "w", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!vfa", name = "x", descriptor = "I")
    public static int field8925;

    @OriginalMember(owner = "client!vfa", name = "z", descriptor = "I")
    public static int field8927;

    @OriginalMember(owner = "client!vfa", name = "A", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!vfa", name = "B", descriptor = "I")
    public static int field8929;

    @OriginalMember(owner = "client!vfa", name = "C", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!vfa", name = "D", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!vfa", name = "E", descriptor = "I")
    public static int field8932;

    @OriginalMember(owner = "client!vfa", name = "F", descriptor = "I")
    public static int field8933;

    @OriginalMember(owner = "client!vfa", name = "H", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!vfa", name = "J", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!vfa", name = "K", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!vfa", name = "L", descriptor = "I")
    public static int field8939;

    @OriginalMember(owner = "client!vfa", name = "N", descriptor = "I")
    public static int field8941;

    @OriginalMember(owner = "client!vfa", name = "O", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!vfa", name = "Q", descriptor = "I")
    public static int field8944;

    @OriginalMember(owner = "client!vfa", name = "R", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!vfa", name = "V", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!vfa", name = "Y", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!vfa", name = "I", descriptor = "Ljn;")
    public static class668 field8936;

    @OriginalMember(owner = "client!vfa", name = "M", descriptor = "Z")
    public static boolean field8940;

    @OriginalMember(owner = "client!vfa", name = "P", descriptor = "Z")
    public static boolean field8943;

    @OriginalMember(owner = "client!vfa", name = "S", descriptor = "Z")
    public static boolean field8946;

    @OriginalMember(owner = "client!vfa", name = "T", descriptor = "Z")
    public static boolean field8947;

    @OriginalMember(owner = "client!vfa", name = "U", descriptor = "Z")
    public static boolean field8948;

    @OriginalMember(owner = "client!vfa", name = "W", descriptor = "Z")
    public static boolean field8950;

    @OriginalMember(owner = "client!vfa", name = "X", descriptor = "Z")
    public static boolean field8951;

    @OriginalMember(owner = "client!vfa", name = "Z", descriptor = "Z")
    public static boolean field8953;

    @OriginalMember(owner = "client!vfa", name = "ab", descriptor = "Z")
    public static boolean field8954;

    @OriginalMember(owner = "client!vfa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 3)
    public final AppletContext getAppletContext() {
        field8923++;
        if (class646.field9189 == null) {
            return class627.field8991 == null || class627.field8991 == this ? super.getAppletContext() : class627.field8991.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 18)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field8932++;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Ljava/lang/String;IIIBII)V", line = 26)
    public final void method3555(String arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field8904++;
        try {
            if (class66.field1028 == null) {
                class681.field9747 = class627.field8991;
                class66.field1028 = this;
                class468.field6542 = arg3;
                class300.field4038 = arg1;
                class417.field5913 = arg1;
                class675.field9684 = 0;
                class181.field2222 = 0;
                class467.field6533 = arg6;
                class226.field2929 = arg6;
                class53.field849 = class517.field7570 = new class248(arg5, arg0, arg2, class627.field8991 != null);
                class477 var8 = class517.field7570.method1521(this, 1, 86);
                if (arg4 <= -118) {
                    while (var8.field6693 == 0) {
                        class151.method974((byte) -102, 10L);
                    }
                }
            } else {
                class661.field9386++;
                if (class661.field9386 >= 3) {
                    this.method3557((byte) -90, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class544.method3184(23383, null, var10);
            this.method3557((byte) -109, "crash");
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V", line = 78)
    private final void method3556(byte arg0) {
        field8928++;
        long var2 = class301.method1787((byte) 62);
        long var4 = class314.field4123[class258.field3547];
        class314.field4123[class258.field3547] = var2;
        class258.field3547 = class258.field3547 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class307.field4073 = ((var6 >> 1) + 32000) / var6;
        }
        if (class53.field855++ > 50) {
            class288.field3885 = true;
            class53.field855 -= 50;
            class646.field9190.setSize(class467.field6533, class300.field4038);
            class646.field9190.setVisible(true);
            if (class646.field9189 != null && class617.field8851 == null) {
                Insets var7 = class646.field9189.getInsets();
                class646.field9190.setLocation(class181.field2222 + var7.left, class675.field9684 + var7.top);
            } else {
                class646.field9190.setLocation(class181.field2222, class675.field9684);
            }
        }
        if (arg0 >= 84) {
            this.method1658((byte) 110);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 123)
    public final void windowDeactivated(WindowEvent arg0) {
        field8937++;
    }

    @OriginalMember(owner = "client!vfa", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 131)
    public static final void provideLoaderApplet(Applet arg0) {
        field8907++;
        class627.field8991 = arg0;
    }

    @OriginalMember(owner = "client!vfa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 139)
    public final void windowIconified(WindowEvent arg0) {
        field8925++;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BLjava/lang/String;)V", line = 148)
    public final void method3557(byte arg0, String arg1) {
        field8915++;
        if (this.field8926) {
            return;
        }
        this.field8926 = true;
        System.out.println("error_game_" + arg1);
        if (arg0 > -70) {
            field8905 = -25;
        }
        try {
            class140.method923(class627.field8991, (byte) -88, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BIIIILjava/lang/String;IZ)V", line = 178)
    public final void method3558(byte arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, boolean arg7) {
        field8918++;
        try {
            class675.field9684 = 0;
            class681.field9747 = null;
            class181.field2222 = 0;
            class467.field6533 = arg2;
            class226.field2929 = arg2;
            class468.field6542 = arg3;
            class300.field4038 = arg1;
            class417.field5913 = arg1;
            class66.field1028 = this;
            class646.field9189 = new Frame();
            class646.field9189.setTitle("Jagex");
            class646.field9189.setResizable(true);
            class646.field9189.addWindowListener(this);
            class646.field9189.setVisible(true);
            int var9 = 106 % ((15 - arg0) / 56);
            class646.field9189.toFront();
            Insets var10 = class646.field9189.getInsets();
            class646.field9189.setSize(class226.field2929 + var10.left + var10.right, class417.field5913 + var10.top + var10.bottom);
            class53.field849 = class517.field7570 = new class248(arg6, arg5, arg4, true);
            class477 var11 = class517.field7570.method1521(this, 1, 107);
            while (var11.field6693 == 0) {
                class151.method974((byte) -102, 10L);
            }
        } catch (Exception var13) {
            class544.method3184(23383, null, var13);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 219)
    public final void windowActivated(WindowEvent arg0) {
        field8921++;
    }

    @OriginalMember(owner = "client!vfa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 228)
    public final void windowClosed(WindowEvent arg0) {
        field8924++;
    }

    @OriginalMember(owner = "client!vfa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 235)
    public final void windowDeiconified(WindowEvent arg0) {
        field8914++;
    }

    @OriginalMember(owner = "client!vfa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 243)
    public final synchronized void paint(Graphics arg0) {
        field8938++;
        if (class66.field1028 != this || class471.field6574) {
            return;
        }
        class288.field3885 = true;
        if (class677.field9706 && (class301.method1787((byte) -74) - class335.field4456) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class226.field2929 && class417.field5913 <= var2.height) {
                class322.field4241 = true;
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)Z", line = 266)
    public final boolean method3559(int arg0) {
        field8931++;
        if (arg0 != 7087) {
            this.method3559(58);
        }
        return class602.method3469(6298, "jagmisc");
    }

    @OriginalMember(owner = "client!vfa", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 278)
    public final URL getCodeBase() {
        field8917++;
        if (class646.field9189 == null) {
            return class627.field8991 == null || class627.field8991 == this ? super.getCodeBase() : class627.field8991.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)V", line = 297)
    public synchronized void method1662(int arg0) {
        if (arg0 != -3) {
            return;
        }
        if (class646.field9190 != null) {
            class646.field9190.removeFocusListener(this);
            class646.field9190.getParent().setBackground(Color.black);
            class646.field9190.getParent().remove(class646.field9190);
        }
        field8922++;
        Container var2;
        if (class617.field8851 != null) {
            var2 = class617.field8851;
        } else if (class646.field9189 != null) {
            var2 = class646.field9189;
        } else if (class627.field8991 == null) {
            var2 = class66.field1028;
        } else {
            var2 = class627.field8991;
        }
        var2.setLayout(null);
        class646.field9190 = new class344(this);
        var2.add(class646.field9190);
        class646.field9190.setSize(class467.field6533, class300.field4038);
        class646.field9190.setVisible(true);
        if (class646.field9189 == var2) {
            Insets var3 = class646.field9189.getInsets();
            class646.field9190.setLocation(class181.field2222 + var3.left, class675.field9684 + var3.top);
        } else {
            class646.field9190.setLocation(class181.field2222, class675.field9684);
        }
        class646.field9190.addFocusListener(this);
        class646.field9190.requestFocus();
        class190.field2319 = true;
        class445.field6325 = true;
        class288.field3885 = true;
        class322.field4241 = false;
        class335.field4456 = class301.method1787((byte) -33);
    }

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "(B)V", line = 350)
    public static final void method3560(byte arg0) {
        field8910++;
        int var1 = 0;
        if (arg0 < 109) {
            field8936 = null;
        }
        if (class221.field2851 != null) {
            var1 = class221.field2851.method1759(class375.field5039, -107);
        }
        if (var1 == 2) {
            int var4 = class226.field2929 > 800 ? 800 : class226.field2929;
            int var5 = class417.field5913 > 600 ? 600 : class417.field5913;
            class467.field6533 = var4;
            class181.field2222 = (class226.field2929 - var4) / 2;
            class300.field4038 = var5;
            class675.field9684 = 0;
        } else if (var1 == 1) {
            int var2 = class226.field2929 <= 1024 ? class226.field2929 : 1024;
            class181.field2222 = (class226.field2929 - var2) / 2;
            class467.field6533 = var2;
            int var3 = class417.field5913 <= 768 ? class417.field5913 : 768;
            class300.field4038 = var3;
            class675.field9684 = 0;
        } else {
            class181.field2222 = 0;
            class675.field9684 = 0;
            class300.field4038 = class417.field5913;
            class467.field6533 = class226.field2929;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "(I)Z", line = 399)
    public final boolean method3561(int arg0) {
        field8913++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else {
            if (arg0 != 0) {
                this.paint(null);
            }
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method3557((byte) -73, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 435)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field8906++;
    }

    @OriginalMember(owner = "client!vfa", name = "start", descriptor = "()V", line = 444)
    public final void start() {
        field8902++;
        if (class66.field1028 == this && !class471.field6574) {
            class253.field3453 = 0L;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)Lmba;", line = 457)
    public static final class386 method3562(int arg0, int arg1) {
        field8929++;
        int var2 = 114 % ((arg0 + 11) / 35);
        if (arg1 == 0) {
            return new class375();
        } else if (arg1 == 1) {
            return new class73();
        } else if (arg1 == 2) {
            return new class574();
        } else if (arg1 == 3) {
            return new class168();
        } else if (arg1 == 4) {
            return new class547();
        } else if (arg1 == 5) {
            return new class76();
        } else if (arg1 == 6) {
            return new class325();
        } else if (arg1 == 7) {
            return new class418();
        } else if (arg1 == 8) {
            return new class478();
        } else if (arg1 == 9) {
            return new class457();
        } else if (arg1 == 10) {
            return new class224();
        } else if (arg1 == 11) {
            return new class500();
        } else if (arg1 == 12) {
            return new class380();
        } else if (arg1 == 13) {
            return new class227();
        } else if (arg1 == 14) {
            return new class150();
        } else if (arg1 == 15) {
            return new class487();
        } else if (arg1 == 16) {
            return new class620();
        } else if (arg1 == 17) {
            return new class192();
        } else if (arg1 == 18) {
            return new class680();
        } else if (arg1 == 19) {
            return new class651();
        } else if (arg1 == 20) {
            return new class89();
        } else if (arg1 == 21) {
            return new class563();
        } else if (arg1 == 22) {
            return new class129();
        } else if (arg1 == 23) {
            return new class209();
        } else if (arg1 == 24) {
            return new class445();
        } else if (arg1 == 25) {
            return new class434();
        } else if (arg1 == 26) {
            return new class367();
        } else if (arg1 == 27) {
            return new class23();
        } else if (arg1 == 28) {
            return new class258();
        } else if (arg1 == 29) {
            return new class350();
        } else if (arg1 == 30) {
            return new class78();
        } else if (arg1 == 31) {
            return new class102();
        } else if (arg1 == 32) {
            return new class643();
        } else if (arg1 == 33) {
            return new class167();
        } else if (arg1 == 34) {
            return new class263();
        } else if (arg1 == 35) {
            return new class328();
        } else if (arg1 == 36) {
            return new class320();
        } else if (arg1 == 37) {
            return new class335();
        } else if (arg1 == 38) {
            return new class99();
        } else if (arg1 == 39) {
            return new class141();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 779)
    public final URL getDocumentBase() {
        field8920++;
        if (class646.field9189 == null) {
            return class627.field8991 == null || class627.field8991 == this ? super.getDocumentBase() : class627.field8991.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "run", descriptor = "()V", line = 794)
    public final void run() {
        field8916++;
        try {
            if (class248.field3402 != null) {
                String var1 = class248.field3402.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class248.field3398;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method3557((byte) -96, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class248.field3398 == null || class248.field3398.equals("1.4.2"))) {
                    this.method3557((byte) -126, "wrongjava");
                    return;
                }
            }
            if (class248.field3398 != null && class248.field3398.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class248.field3398.length() > var3) {
                    char var5 = class248.field3398.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + (var5 - '0');
                    var3++;
                }
                if (var4 >= 5) {
                    class677.field9706 = true;
                }
            }
            Applet var6 = class66.field1028;
            if (class627.field8991 != null) {
                var6 = class627.field8991;
            }
            Method var7 = class248.field3414;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class490.method2858(1048576);
            class376.method2187(24);
            this.method1662(-3);
            this.method1661((byte) -24);
            class150.field1859 = class403.method2431(1);
            while (class253.field3453 == 0L || class301.method1787((byte) -112) < class253.field3453) {
                class238.field3290 = class150.field1859.method1970(class197.field2381, -128);
                for (int var8 = 0; var8 < class238.field3290; var8++) {
                    this.method3566(113);
                }
                this.method3556((byte) 111);
                class142.method933(class517.field7570, -51, class646.field9190);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class544.method3184(23383, this.method1657(true), var20);
            this.method3557((byte) -101, "crash");
        } finally {
            Object var13 = null;
            this.method3564(true, 1);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "(I)V", line = 917)
    public static void method3563(int arg0) {
        field8936 = null;
        if (arg0 == -8079) {
            field8919 = null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 936)
    public final String getParameter(String arg0) {
        field8935++;
        if (class646.field9189 == null) {
            return class627.field8991 == null || class627.field8991 == this ? super.getParameter(arg0) : class627.field8991.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ZI)V", line = 950)
    private final void method3564(boolean arg0, int arg1) {
        field8908++;
        synchronized (this) {
            if (class471.field6574) {
                return;
            }
            class471.field6574 = true;
        }
        System.out.println("Shutdown start - clean:" + arg0);
        if (class627.field8991 != null) {
            class627.field8991.destroy();
        }
        try {
            this.method1656(0);
        } catch (Exception var9) {
        }
        if (this.field8934) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field8934 = false;
        }
        class542.method3174(true, (byte) -121);
        class690.method3899((byte) -32);
        if (arg1 != 1) {
            field8905 = -68;
        }
        if (class646.field9190 != null) {
            try {
                class646.field9190.removeFocusListener(this);
                class646.field9190.getParent().remove(class646.field9190);
            } catch (Exception var7) {
            }
        }
        if (class517.field7570 != null) {
            try {
                class517.field7570.method1515(0);
            } catch (Exception var6) {
            }
        }
        this.method1642(false);
        if (class646.field9189 != null) {
            class646.field9189.setVisible(false);
            class646.field9189.dispose();
            class646.field9189 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!vfa", name = "destroy", descriptor = "()V", line = 1024)
    public final void destroy() {
        field8939++;
        if (class66.field1028 == this && !class471.field6574) {
            class253.field3453 = class301.method1787((byte) 67);
            class151.method974((byte) -102, 5000L);
            class53.field849 = null;
            this.method3564(false, 1);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1041)
    public final void windowOpened(WindowEvent arg0) {
        field8903++;
    }

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "(B)Z", line = 1052)
    public final boolean method3565(byte arg0) {
        int var2 = 51 % ((arg0 + 68) / 43);
        field8912++;
        return class602.method3469(6298, "jaclib");
    }

    @OriginalMember(owner = "client!vfa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1066)
    public final void focusGained(FocusEvent arg0) {
        field8909++;
        class445.field6325 = true;
        class288.field3885 = true;
    }

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "(I)V", line = 1077)
    private final void method3566(int arg0) {
        field8927++;
        long var2 = class301.method1787((byte) 125);
        int var4 = 37 % ((-arg0 - 23) / 42);
        long var5 = class690.field9836[class112.field1440];
        class690.field9836[class112.field1440] = var2;
        boolean var10000;
        if (var5 == 0L || var5 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class112.field1440 = class112.field1440 + 1 & 0x1F;
        synchronized (this) {
            class190.field2319 = class445.field6325;
        }
        this.method1643(false);
    }

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "(Z)Ljava/lang/String;", line = 1110)
    public String method1657(boolean arg0) {
        if (!arg0) {
            this.method1658((byte) 22);
        }
        field8933++;
        return null;
    }

    @OriginalMember(owner = "client!vfa", name = "stop", descriptor = "()V", line = 1131)
    public final void stop() {
        field8911++;
        if (class66.field1028 == this && !class471.field6574) {
            class253.field3453 = class301.method1787((byte) 118) + 4000L;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1145)
    public final void focusLost(FocusEvent arg0) {
        class445.field6325 = false;
        field8930++;
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(B)V")
    public abstract void method1658(byte arg0);

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Z)V")
    public abstract void method1642(boolean arg0);

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "(B)V")
    public abstract void method1661(byte arg0);

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "(I)V")
    public abstract void method1656(int arg0);

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(Z)V")
    public abstract void method1643(boolean arg0);

    @OriginalMember(owner = "client!vfa", name = "init", descriptor = "()V")
    public abstract void init();
}
