import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class class24 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!db", name = "B", descriptor = "Z")
    private boolean field699 = false;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Lwd;")
    public static class150 field684 = class2.method9(true, ")4lang)4de");

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field674 = -1;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Lwd;")
    public static class150 field675 = class2.method9(true, "::qa_op_test");

    @OriginalMember(owner = "client!db", name = "o", descriptor = "[I")
    public static int[] field686 = new int[50];

    @OriginalMember(owner = "client!db", name = "O", descriptor = "Lwd;")
    private static class150 field712 = class2.method9(true, "Enter name of player to delete from list");

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Lwd;")
    public static class150 field681 = field712;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field695 = 3;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field715 = 1;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field688 = 0;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lff;")
    public static class42 field678;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "Z")
    public static boolean field720;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "[Lhb;")
    public static class51[] field719;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "[[I")
    public static int[][] field685;

    @OriginalMember(owner = "client!db", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field676++;
        if (class40.field1064 == null) {
            return class10.field243 == null || class10.field243.field3255 == this ? super.getDocumentBase() : class10.field243.field3255.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class90.field2098 = true;
        class97.field2225 = true;
        field696++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static final void method190(int arg0) {
        class123.field2838 = false;
        if (arg0 <= 86) {
            field675 = null;
        }
        field708++;
        class20.field517 = false;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public static void method191(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field678 = null;
        field681 = null;
        field685 = null;
        field686 = null;
        field684 = null;
        field719 = null;
        field675 = null;
        field712 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public abstract void method181(byte arg0);

    @OriginalMember(owner = "client!db", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field700++;
    }

    @OriginalMember(owner = "client!db", name = "start", descriptor = "()V")
    public final void start() {
        field711++;
        if (class90.field2097 == this && !class148.field3629) {
            class141.field3420 = 0L;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)Lrb;")
    public static final class118 method192(int arg0, byte arg1) {
        field703++;
        class118 var2 = (class118) class134.field3157.method440((long) arg0, 26976);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class136.field3204.method315(arg0, true, 9);
        class118 var4 = new class118();
        var4.field2722 = arg0;
        if (arg1 >= -96) {
            field715 = -5;
        }
        if (var3 != null) {
            var4.method857(new class148(var3), 4087);
        }
        var4.method853(-3396);
        class134.field3157.method433(var4, (long) arg0, (byte) -122);
        return var4;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Z")
    public final boolean method193(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field679++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 >= -102) {
                field715 = -50;
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
                this.method201("invalidhost", (byte) -66);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field698++;
        if (class40.field1064 == null) {
            return class10.field243 == null || class10.field243.field3255 == this ? super.getAppletContext() : class10.field243.field3255.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "providesignlink", descriptor = "(Lue;)V")
    public static final void providesignlink(class139 arg0) {
        class10.field243 = arg0;
        class20.field507 = arg0;
        field694++;
    }

    @OriginalMember(owner = "client!db", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field710++;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V")
    public abstract void method170(byte arg0);

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V")
    public final synchronized void method194(byte arg0) {
        field672++;
        if (arg0 < 73) {
            return;
        }
        Container var2;
        if (class40.field1064 == null) {
            var2 = class10.field243.field3255;
        } else {
            var2 = class40.field1064;
        }
        if (class142.field3439 != null) {
            class142.field3439.removeFocusListener(this);
            var2.remove(class142.field3439);
        }
        class142.field3439 = new class3(this);
        var2.add(class142.field3439);
        class142.field3439.setSize(class128.field3038, class63.field1624);
        class142.field3439.setVisible(true);
        if (class40.field1064 == null) {
            class142.field3439.setLocation(0, 0);
        } else {
            Insets var3 = class40.field1064.getInsets();
            class142.field3439.setLocation(var3.left, var3.top);
        }
        class142.field3439.addFocusListener(this);
        class142.field3439.requestFocus();
        class97.field2225 = true;
        class146.field3523 = false;
        class131.field3082 = class55.method430(0);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLwd;Lwd;Z)V")
    public static final void method195(boolean arg0, class150 arg1, class150 arg2, boolean arg3) {
        field680++;
        if (class97.field2225) {
            class41.method294(-2607);
            class97.field2225 = false;
            class147.method1101(-102);
            class83.method600(15164);
            class109.method780(90);
            class136.method1013(107);
            class38.method283(class134.field3149, class135.field3183, class6.field151, class22.field646, (byte) -127);
            class94.method663(-1, field695, class118.field2702 == -1, 6366, class42.field1111);
            class91.field2130 = true;
            class135.field3186 = true;
            class18.field487 = true;
        }
        client.method179(-27652);
        short var4 = 151;
        if (arg0) {
            method195(false, null, null, false);
        }
        int var6 = var4 - 3;
        class22.field646.method1052(arg1, 257, var6, 0);
        class22.field646.method1052(arg1, 256, var6 - 1, 16777215);
        if (arg2 != null) {
            var6 += 15;
            if (arg3) {
                int var5 = class22.field646.method1038(arg2) + 4;
                class120.method872(257 - var5 / 2, var6 - 11, var5, 11, 0);
            }
            class22.field646.method1052(arg2, 257, var6, 0);
            class22.field646.method1052(arg2, 256, var6 - 1, 16777215);
        }
        class12.method77(4);
    }

    @OriginalMember(owner = "client!db", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field705++;
    }

    @OriginalMember(owner = "client!db", name = "stop", descriptor = "()V")
    public final void stop() {
        field677++;
        if (class90.field2097 == this && !class148.field3629) {
            class141.field3420 = class55.method430(0) + 4000L;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public abstract void method175(int arg0);

    @OriginalMember(owner = "client!db", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field704++;
        if (class40.field1064 == null) {
            return class10.field243 == null || class10.field243.field3255 == this ? super.getCodeBase() : class10.field243.field3255.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIBII)V")
    public final void method196(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field716++;
        try {
            if (class90.field2097 == null) {
                class128.field3038 = arg0;
                class8.field192 = arg1;
                class63.field1624 = arg3;
                class90.field2097 = this;
                if (class10.field243 == null) {
                    class20.field507 = class10.field243 = new class139(false, this, arg4, null, 0);
                }
                int var6 = 8 / ((-arg2 - 32) / 63);
                class10.field243.method1031(1, this, 58);
            } else {
                class98.field2246++;
                if (class98.field2246 >= 3) {
                    this.method201("alreadyloaded", (byte) -66);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase());
                }
            }
        } catch (Exception var8) {
            class61.method467(null, (byte) -105, var8);
            this.method201("crash", (byte) -66);
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
    private final void method197(int arg0) {
        field718++;
        long var2 = class104.field2348[class21.field590];
        long var4 = class55.method430(arg0);
        class104.field2348[class21.field590] = var4;
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class66.field1692 = ((var6 >> 1) + 32000) / var6;
        }
        class21.field590 = class21.field590 + 1 & 0x1F;
        if (class16.field422++ > 50) {
            class16.field422 -= 50;
            class97.field2225 = true;
            class142.field3439.setSize(class128.field3038, class63.field1624);
            class142.field3439.setVisible(true);
            if (class40.field1064 == null) {
                class142.field3439.setLocation(0, 0);
            } else {
                Insets var7 = class40.field1064.getInsets();
                class142.field3439.setLocation(var7.left, var7.top);
            }
        }
        this.method170((byte) -73);
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(B)V")
    private final synchronized void method198(byte arg0) {
        field682++;
        if (class148.field3629) {
            return;
        }
        if (arg0 <= 41) {
            field715 = 44;
        }
        class148.field3629 = true;
        try {
            class142.field3439.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method175(-91);
        } catch (Exception var4) {
        }
        if (class40.field1064 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class10.field243 != null) {
            try {
                class10.field243.method1029((byte) -104);
            } catch (Exception var2) {
            }
        }
        this.method181((byte) -13);
    }

    @OriginalMember(owner = "client!db", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field709++;
        if (class90.field2097 != this || class148.field3629) {
            return;
        }
        class97.field2225 = true;
        if (class139.field3259 != null && class139.field3259.startsWith("1.5") && class55.method430(0) - class131.field3082 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class128.field3038 && var2.height >= class63.field1624) {
                class146.field3523 = true;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field683++;
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
    public static final void method199(int arg0) {
        if (arg0 != 50) {
            field719 = null;
        }
        for (class68 var1 = (class68) class130.field3059.method702((byte) -128); var1 != null; var1 = (class68) class130.field3059.method698(-1610612736)) {
            if (var1.field1705 != null) {
                class146.field3541.method660(var1.field1705);
                var1.field1705 = null;
            }
            if (var1.field1718 != null) {
                class146.field3541.method660(var1.field1718);
                var1.field1718 = null;
            }
        }
        field701++;
        class130.field3059.method709(arg0 ^ 0xFFFFC2FF);
    }

    @OriginalMember(owner = "client!db", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!db", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field697++;
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
    public abstract void method182(int arg0);

    @OriginalMember(owner = "client!db", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field687++;
        if (class40.field1064 == null) {
            return class10.field243 == null || class10.field243.field3255 == this ? super.getParameter(arg0) : class10.field243.field3255.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field689++;
    }

    @OriginalMember(owner = "client!db", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field706++;
    }

    @OriginalMember(owner = "client!db", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field690++;
        if (class90.field2097 == this && !class148.field3629) {
            class141.field3420 = class55.method430(0);
            class72.method548(-47, 5000L);
            class20.field507 = null;
            this.method198((byte) 98);
        }
    }

    @OriginalMember(owner = "client!db", name = "run", descriptor = "()V")
    public final void run() {
        field713++;
        try {
            if (class139.field3249 != null) {
                String var1 = class139.field3249.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class139.field3259;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method201("wrongjava", (byte) -66);
                        return;
                    }
                    class125.field2887 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class139.field3259 == null || class139.field3259.equals("1.4.2"))) {
                    this.method201("wrongjava", (byte) -66);
                    return;
                }
            }
            if (class10.field243.field3255 != null) {
                Method var3 = class139.field3262;
                if (var3 != null) {
                    try {
                        var3.invoke(class10.field243.field3255, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method194((byte) 116);
            class41.field1071 = class82.method591((byte) -111, class142.field3439, class63.field1624, class128.field3038);
            this.method180(20911);
            class15.field405 = class127.method961(-11957);
            class15.field405.method354((byte) 34);
            while (class141.field3420 == 0L || class55.method430(0) < class141.field3420) {
                class106.field2399 = class15.field405.method358(class125.field2887, -1, class15.field402);
                for (int var4 = 0; var4 < class106.field2399; var4++) {
                    this.method200(-126);
                }
                this.method197(0);
                class69.method529(0, true);
            }
        } catch (Exception var7) {
            class61.method467(null, (byte) -122, var7);
            this.method201("crash", (byte) -66);
        }
        this.method198((byte) 116);
    }

    @OriginalMember(owner = "client!db", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field714++;
        class90.field2098 = false;
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
    private final void method200(int arg0) {
        long var2 = class55.method430(0);
        field691++;
        long var4 = class50.field1355[class31.field919];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class50.field1355[class31.field919] = var2;
        int var6 = 34 % ((arg0 + 49) / 58);
        class31.field919 = class31.field919 + 1 & 0x1F;
        synchronized (this) {
            class124.field2870 = class90.field2098;
        }
        this.method182(-65);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method201(String arg0, byte arg1) {
        field717++;
        if (this.field699) {
            return;
        }
        if (arg1 != -66) {
            field684 = null;
        }
        this.field699 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
    public abstract void method180(int arg0);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method202(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        try {
            class90.field2097 = this;
            class128.field3038 = arg6;
            class8.field192 = arg1;
            class63.field1624 = arg2;
            class40.field1064 = new Frame();
            class40.field1064.setTitle("Jagex");
            class40.field1064.setResizable(false);
            class40.field1064.addWindowListener(this);
            class40.field1064.setVisible(true);
            class40.field1064.toFront();
            Insets var8 = class40.field1064.getInsets();
            class40.field1064.setSize(arg6 + var8.left + var8.right, var8.top - -var8.bottom + arg2);
            class20.field507 = class10.field243 = new class139(true, null, arg5, arg3, arg4);
            class10.field243.method1031(arg0, this, 122);
        } catch (Exception var10) {
            class61.method467(null, (byte) -120, var10);
        }
        field693++;
    }

    @OriginalMember(owner = "client!db", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field702++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBI[Lwd;)Lwd;")
    public static final class150 method203(int arg0, byte arg1, int arg2, class150[] arg3) {
        field673++;
        int var4 = 0;
        if (arg1 >= -81) {
            field707 = 30;
        }
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg3[arg0 + var5] == null) {
                arg3[arg0 + var5] = class109.field2526;
            }
            var4 += arg3[arg0 + var5].field3718;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg2; var8++) {
            class150 var10 = arg3[arg0 + var8];
            class79.method577(var10.field3678, 0, var6, var7, var10.field3718);
            var7 += var10.field3718;
        }
        class150 var9 = new class150();
        var9.field3678 = var6;
        var9.field3718 = var4;
        return var9;
    }
}
