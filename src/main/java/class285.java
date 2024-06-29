import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
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

@OriginalClass("client!qq")
public abstract class class285 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "Z")
    private boolean field4202 = false;

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "Z")
    private boolean field4201 = false;

    @OriginalMember(owner = "client!qq", name = "u", descriptor = "I")
    public static int field4206 = 0;

    @OriginalMember(owner = "client!qq", name = "x", descriptor = "Lec;")
    public static class40 field4209 = new class40("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!qq", name = "t", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!qq", name = "v", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!qq", name = "w", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!qq", name = "y", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!qq", name = "B", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!qq", name = "C", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!qq", name = "D", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!qq", name = "E", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!qq", name = "Q", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "Z")
    public static boolean field4224;

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "Z")
    public static boolean field4225;

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "Z")
    public static boolean field4226;

    @OriginalMember(owner = "client!qq", name = "P", descriptor = "Z")
    public static boolean field4227;

    @OriginalMember(owner = "client!qq", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 9)
    public final URL getCodeBase() {
        field4190++;
        if (class41.field500 == null) {
            return class42.field512 == null || class42.field512.field5106 == this ? super.getCodeBase() : class42.field512.field5106.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 25)
    public final void windowClosed(WindowEvent arg0) {
        field4218++;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)V", line = 34)
    private final void method1785(boolean arg0) {
        field4199++;
        if (!arg0) {
            return;
        }
        long var2 = class434.method2591(-19310);
        long var4 = class66.field832[class310.field4532];
        class66.field832[class310.field4532] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class310.field4532 = class310.field4532 + 1 & 0x1F;
        synchronized (this) {
            class87.field1087 = class199.field2772;
        }
        this.method1657(21);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V", line = 68)
    public final void method1786(byte arg0) {
        field4216++;
        if (arg0 <= 28) {
            this.getDocumentBase();
        }
        if (this.field4201) {
            return;
        }
        try {
            class405 var2 = class42.field512.method2174(class251.field3524.getClass(), (byte) 35);
            while (var2.field5759 == 0) {
                class85.method433(100L, -42);
            }
            if (var2.field5755 != null) {
                throw (Throwable) var2.field5755;
            }
            jagmisc.init();
            this.field4201 = true;
            class122.field1512 = class255.method1568(-1);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZZ)V", line = 103)
    private final void method1787(boolean arg0, boolean arg1) {
        field4195++;
        synchronized (this) {
            if (class426.field6138) {
                return;
            }
            class426.field6138 = arg1;
        }
        if (class42.field512.field5106 != null) {
            class42.field512.field5106.destroy();
        }
        try {
            this.method1655((byte) 126);
        } catch (Exception var11) {
        }
        if (this.field4201) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field4201 = false;
        }
        class405 var4 = class42.field512.method2156((byte) 82, class251.field3524.getClass());
        while (var4.field5759 == 0) {
            class85.method433(100L, -78);
        }
        if (class126.field1542 != null) {
            try {
                class126.field1542.removeFocusListener(this);
                class126.field1542.getParent().remove(class126.field1542);
            } catch (Exception var9) {
            }
        }
        if (class42.field512 != null) {
            try {
                class42.field512.method2149(0);
            } catch (Exception var8) {
            }
        }
        this.method1666((byte) -77);
        if (class41.field500 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!qq", name = "stop", descriptor = "()V", line = 181)
    public final void stop() {
        field4217++;
        if (class251.field3524 == this && !class426.field6138) {
            class483.field6831 = class434.method2591(-19310) + 4000L;
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(Z)V", line = 192)
    public static void method1788(boolean arg0) {
        field4209 = null;
        if (!arg0) {
            field4209 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "run", descriptor = "()V", line = 204)
    public final void run() {
        try {
            label108: {
                if (class355.field5100 != null) {
                    String var1 = class355.field5100.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class355.field5104;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1794("wrongjava", (byte) 117);
                            break label108;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class355.field5104 == null || class355.field5104.equals("1.4.2"))) {
                        this.method1794("wrongjava", (byte) 120);
                        break label108;
                    }
                }
                if (class355.field5104 != null && class355.field5104.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class355.field5104.length() > var3) {
                        char var5 = class355.field5104.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class482.field6813 = true;
                    }
                }
                if (class42.field512.field5106 != null) {
                    Method var6 = class355.field5109;
                    if (var6 != null) {
                        try {
                            var6.invoke(class42.field512.field5106, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class158.method761(16882);
                class371.method2242(false);
                this.method1796((byte) 7);
                this.method1664((byte) 63);
                class122.field1512 = class255.method1568(-1);
                this.method1786((byte) 60);
                while (class483.field6831 == 0L || class483.field6831 > class434.method2591(-19310)) {
                    class430.field6228 = class122.field1512.method1958(24, class470.field6610);
                    for (int var7 = 0; var7 < class430.field6228; var7++) {
                        this.method1785(true);
                    }
                    this.method1793(31);
                    class382.method2293(class42.field512, (byte) -119, class126.field1542);
                }
            }
        } catch (Exception var10) {
            class144.method678(var10, true, (String) null);
            this.method1794("crash", (byte) 123);
        }
        field4187++;
        this.method1787(true, true);
    }

    @OriginalMember(owner = "client!qq", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 324)
    public final synchronized void paint(Graphics arg0) {
        field4192++;
        if (class251.field3524 != this || class426.field6138) {
            return;
        }
        class2.field9 = true;
        if (class482.field6813 && (class434.method2591(-19310) - class284.field4139) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class74.field898 <= var2.width && var2.height >= class119.field1473) {
                class226.field3133 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "destroy", descriptor = "()V", line = 345)
    public final void destroy() {
        field4188++;
        if (class251.field3524 == this && !class426.field6138) {
            class483.field6831 = class434.method2591(-19310);
            class85.method433(5000L, -89);
            class404.field5753 = null;
            this.method1787(false, true);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILjava/lang/String;ZZIIII)V", line = 360)
    public final void method1789(int arg0, String arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class324.field4679 = arg7;
            class251.field3524 = this;
            class428.field6173 = 0;
            class464.field6541 = arg4;
            class119.field1473 = arg4;
            class171.field2020 = 0;
            class110.field1336 = arg6;
            class74.field898 = arg6;
            class41.field500 = new Frame();
            class41.field500.setTitle("Jagex");
            class41.field500.setResizable(arg3);
            class41.field500.addWindowListener(this);
            class41.field500.setVisible(true);
            class41.field500.toFront();
            Insets var9 = class41.field500.getInsets();
            class41.field500.setSize(var9.right + var9.left + class74.field898, class119.field1473 + var9.top + var9.bottom);
            class404.field5753 = class42.field512 = new class355((Applet) null, arg0, arg1, arg5);
            class405 var10 = class42.field512.method2157(1, arg3, this);
            while (var10.field5759 == 0) {
                class85.method433(10L, 110);
            }
        } catch (Exception var12) {
            class144.method678(var12, true, (String) null);
        }
        field4205++;
    }

    @OriginalMember(owner = "client!qq", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 399)
    public final void windowDeiconified(WindowEvent arg0) {
        field4220++;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V", line = 406)
    public static final void method1790(int arg0) {
        if (arg0 > -91) {
            return;
        }
        class73.field890 = 0;
        field4213++;
        class4.field52 = -1;
        class263.field3786 = -1;
        class158.field1886 = -1;
    }

    @OriginalMember(owner = "client!qq", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 421)
    public final void update(Graphics arg0) {
        field4219++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!qq", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 429)
    public final void focusGained(FocusEvent arg0) {
        field4194++;
        class199.field2772 = true;
        class2.field9 = true;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)Z", line = 438)
    public final boolean method1791(byte arg0) {
        field4193++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else if (arg0 != 31) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1794("invalidhost", (byte) 126);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIII)V", line = 474)
    public final void method1792(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4212++;
        try {
            if (class251.field3524 != null) {
                class166.field1989++;
                if (class166.field1989 >= 3) {
                    this.method1794("alreadyloaded", (byte) 126);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            } else if (arg0 == 31) {
                class324.field4679 = arg4;
                class428.field6173 = 0;
                class464.field6541 = arg3;
                class119.field1473 = arg3;
                class171.field2020 = 0;
                class110.field1336 = arg2;
                class74.field898 = arg2;
                class251.field3524 = this;
                if (class42.field512 == null) {
                    class404.field5753 = class42.field512 = new class355(this, arg1, (String) null, 0);
                }
                class405 var6 = class42.field512.method2157(1, true, this);
                while (var6.field5759 == 0) {
                    class85.method433(10L, 110);
                }
            }
        } catch (Exception var8) {
            class144.method678(var8, true, (String) null);
            this.method1794("crash", (byte) 125);
        }
    }

    @OriginalMember(owner = "client!qq", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 523)
    public final void windowIconified(WindowEvent arg0) {
        field4203++;
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V", line = 531)
    private final void method1793(int arg0) {
        field4198++;
        long var2 = class434.method2591(-19310);
        long var4 = class357.field5164[class28.field374];
        class357.field5164[class28.field374] = var2;
        class28.field374 = class28.field374 + 1 & arg0;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class354.field5086 = ((var6 >> 1) + 32000) / var6;
        }
        if (class118.field1469++ > 50) {
            class118.field1469 -= 50;
            class2.field9 = true;
            class126.field1542.setSize(class110.field1336, class464.field6541);
            class126.field1542.setVisible(true);
            if (class41.field500 != null && class348.field4961 == null) {
                Insets var7 = class41.field500.getInsets();
                class126.field1542.setLocation(var7.left + class171.field2020, var7.top - -class428.field6173);
            } else {
                class126.field1542.setLocation(class171.field2020, class428.field6173);
            }
        }
        this.method1663(4);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 576)
    public final void method1794(String arg0, byte arg1) {
        field4223++;
        if (this.field4202) {
            return;
        }
        this.field4202 = true;
        System.out.println("error_game_" + arg0);
        try {
            class336.method2038(class42.field512.field5106, -123, "loggedout");
        } catch (Throwable var4) {
        }
        if (arg1 < 116) {
            this.field4202 = false;
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!qq", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 602)
    public final void windowActivated(WindowEvent arg0) {
        field4191++;
    }

    @OriginalMember(owner = "client!qq", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 609)
    public final void windowOpened(WindowEvent arg0) {
        field4222++;
    }

    @OriginalMember(owner = "client!qq", name = "start", descriptor = "()V", line = 628)
    public final void start() {
        field4189++;
        if (class251.field3524 == this && !class426.field6138) {
            class483.field6831 = 0L;
        }
    }

    @OriginalMember(owner = "client!qq", name = "providesignlink", descriptor = "(Lkd;)V", line = 640)
    public static final void providesignlink(class355 arg0) {
        field4196++;
        class42.field512 = arg0;
        class404.field5753 = arg0;
    }

    @OriginalMember(owner = "client!qq", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 655)
    public final void focusLost(FocusEvent arg0) {
        class199.field2772 = false;
        field4200++;
    }

    @OriginalMember(owner = "client!qq", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 663)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4204++;
    }

    @OriginalMember(owner = "client!qq", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 678)
    public final AppletContext getAppletContext() {
        field4197++;
        if (class41.field500 == null) {
            return class42.field512 == null || class42.field512.field5106 == this ? super.getAppletContext() : class42.field512.field5106.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lfc;Loj;Lso;ILfg;III)V", line = 694)
    public static final void method1795(class209 arg0, class280 arg1, class334 arg2, int arg3, class21 arg4, int arg5, int arg6, int arg7) {
        field4214++;
        int var8 = arg4.field298 - arg3 / 2 - 5;
        int var9 = arg7 + 2;
        if (arg2.field4788 != 0) {
            arg1.method1759(-6923, (arg7 - (var9 - (arg0.method1159() * arg5))) + 1, arg3 + 10, var9, arg2.field4788, var8);
        }
        if (arg6 < 85) {
            field4206 = 30;
        }
        if (arg2.field4821 != 0) {
            arg1.method1755(-4867, arg7 + (arg0.method1159() * arg5) + 1 - var9, var8, arg3 + 10, arg2.field4821, var9);
        }
        int var10 = arg2.field4778;
        if (arg4.field297 && arg2.field4790 != -1) {
            var10 = arg2.field4790;
        }
        for (int var11 = 0; var11 < arg5; var11++) {
            String var12 = class179.field2220[var11];
            if (var11 < (arg5 - 1)) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg0.method1160(arg1, var12, arg4.field298, arg7, var10, true);
            arg7 += arg0.method1159();
        }
    }

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "(B)V", line = 737)
    public final synchronized void method1796(byte arg0) {
        if (class126.field1542 != null) {
            class126.field1542.removeFocusListener(this);
            class126.field1542.getParent().remove(class126.field1542);
        }
        field4207++;
        Container var2;
        if (class348.field4961 != null) {
            var2 = class348.field4961;
        } else if (class41.field500 == null) {
            var2 = class42.field512.field5106;
        } else {
            var2 = class41.field500;
        }
        var2.setLayout((LayoutManager) null);
        class126.field1542 = new class477(this);
        var2.add(class126.field1542);
        class126.field1542.setSize(class110.field1336, class464.field6541);
        class126.field1542.setVisible(true);
        if (class41.field500 == var2) {
            Insets var3 = class41.field500.getInsets();
            class126.field1542.setLocation(var3.left + class171.field2020, class428.field6173 + var3.top);
        } else {
            class126.field1542.setLocation(class171.field2020, class428.field6173);
        }
        class126.field1542.addFocusListener(this);
        if (arg0 != 7) {
            field4221 = 93;
        }
        class126.field1542.requestFocus();
        class199.field2772 = true;
        class87.field1087 = true;
        class2.field9 = true;
        class226.field3133 = false;
        class284.field4139 = class434.method2591(-19310);
    }

    @OriginalMember(owner = "client!qq", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 784)
    public final URL getDocumentBase() {
        field4211++;
        if (class41.field500 == null) {
            return class42.field512 == null || class42.field512.field5106 == this ? super.getDocumentBase() : class42.field512.field5106.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 799)
    public final String getParameter(String arg0) {
        field4208++;
        if (class41.field500 == null) {
            return class42.field512 == null || class42.field512.field5106 == this ? super.getParameter(arg0) : class42.field512.field5106.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 825)
    public final void windowDeactivated(WindowEvent arg0) {
        field4215++;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
    public abstract void method1663(int arg0);

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(B)V")
    public abstract void method1655(byte arg0);

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(B)V")
    public abstract void method1664(byte arg0);

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)V")
    public abstract void method1657(int arg0);

    @OriginalMember(owner = "client!qq", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(B)V")
    public abstract void method1666(byte arg0);
}
