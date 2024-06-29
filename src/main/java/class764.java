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

@OriginalClass("client!pj")
public abstract class class764 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Z")
    private boolean field10474 = false;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "Z")
    private boolean field10501 = false;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "[I")
    public static int[] field10477 = new int[1];

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public static int field10507 = 0;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field10473;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field10475;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field10476;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field10478;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field10479;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field10480;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field10481;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field10482;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field10483;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field10484;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field10485;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field10486;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field10487;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field10488;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field10489;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field10490;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field10491;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field10492;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field10493;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public static int field10494;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public static int field10495;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public static int field10496;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    public static int field10497;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    public static int field10498;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    public static int field10499;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
    public static int field10500;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    public static int field10502;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "I")
    public static int field10503;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    public static int field10504;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    public static int field10505;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public static int field10506;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    public static int field10508;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    public static int field10509;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    public static int field10510;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    public static int field10511;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public static int field10512;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    public static int field10513;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
    public static int field10514;

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
    public static int field10519;

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
    public static int field10520;

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "I")
    public static int field10521;

    @OriginalMember(owner = "client!pj", name = "ab", descriptor = "I")
    public static int field10524;

    @OriginalMember(owner = "client!pj", name = "fb", descriptor = "I")
    public static int field10529;

    @OriginalMember(owner = "client!pj", name = "gb", descriptor = "I")
    public static int field10530;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "Z")
    public static boolean field10515;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "Z")
    public static boolean field10516;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "Z")
    public static boolean field10517;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "Z")
    public static boolean field10518;

    @OriginalMember(owner = "client!pj", name = "Y", descriptor = "Z")
    public static boolean field10522;

    @OriginalMember(owner = "client!pj", name = "Z", descriptor = "Z")
    public static boolean field10523;

    @OriginalMember(owner = "client!pj", name = "bb", descriptor = "Z")
    public static boolean field10525;

    @OriginalMember(owner = "client!pj", name = "cb", descriptor = "Z")
    public static boolean field10526;

    @OriginalMember(owner = "client!pj", name = "db", descriptor = "Z")
    public static boolean field10527;

    @OriginalMember(owner = "client!pj", name = "eb", descriptor = "Z")
    public static boolean field10528;

    @OriginalMember(owner = "client!pj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 9)
    public final void windowClosing(WindowEvent arg0) {
        field10486++;
        this.destroy();
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([ILib;[I[IZ)V", line = 17)
    public static final void method4208(int[] arg0, class723 arg1, int[] arg2, int[] arg3, boolean arg4) {
        field10492++;
        if (arg4) {
            method4220(-91, 48, null, null);
        }
        for (int var5 = 0; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg2[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && arg1.field9164.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field9164[var9] = null;
                    } else {
                        class73 var10 = class571.field8029.method3695(var6, (byte) -118);
                        int var11 = var10.field818;
                        class695 var12 = arg1.field9164[var9];
                        if (var12 != null) {
                            if (var12.field9692 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field9164[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field9697 = 1;
                                    var12.field9700 = 0;
                                    var12.field9694 = var8;
                                    var12.field9690 = 0;
                                    var12.field9689 = 0;
                                    if (!arg1.field9136) {
                                        class538.method3196(arg1, 0, true, var10);
                                    }
                                } else if (var11 == 2) {
                                    var12.field9700 = 0;
                                }
                            } else if (var10.field802 >= class571.field8029.method3695(var12.field9692, (byte) -113).field802) {
                                var12 = arg1.field9164[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class695 var13 = arg1.field9164[var9] = new class695();
                            var13.field9700 = 0;
                            var13.field9689 = 0;
                            var13.field9694 = var8;
                            var13.field9690 = 0;
                            var13.field9692 = var6;
                            var13.field9697 = 1;
                            if (!arg1.field9136) {
                                class538.method3196(arg1, 0, true, var10);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILjava/lang/String;ZBIII)V", line = 121)
    public final void method4209(int arg0, int arg1, String arg2, boolean arg3, byte arg4, int arg5, int arg6, int arg7) {
        try {
            class607.field8509 = arg1;
            class288.field4238 = null;
            class424.field5890 = 0;
            class785.field10774 = this;
            class249.field3700 = arg0;
            class277.field3991 = arg0;
            class339.field4915 = 0;
            class742.field10226 = arg6;
            class20.field163 = arg6;
            class43.field453 = new Frame();
            class43.field453.setTitle("Jagex");
            class43.field453.setResizable(true);
            class43.field453.addWindowListener(this);
            class43.field453.setVisible(true);
            class43.field453.toFront();
            Insets var9 = class43.field453.getInsets();
            class43.field453.setSize(class20.field163 + var9.left + var9.right, class277.field3991 - (-var9.top - var9.bottom));
            if (arg4 > -32) {
                field10477 = null;
            }
            class122.field1621 = class129.field1674 = new class768(arg7, arg2, arg5, true);
            class344 var10 = class129.field1674.method4236(this, 1, 0);
            while (var10.field4970 == 0) {
                class730.method4066((byte) -45, 10L);
            }
        } catch (Exception var12) {
            class502.method2937(var12, (byte) -93, null);
        }
        field10506++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 165)
    private final void method4210(int arg0) {
        field10484++;
        long var2 = class683.method3903((byte) 4);
        long var4 = class44.field464[class407.field5728];
        class44.field464[class407.field5728] = var2;
        class407.field5728 = class407.field5728 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class536.field7412 = class352.field5108;
        }
        if (arg0 != -3406) {
            this.method4210(-4);
        }
        this.method795((byte) 113);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V", line = 202)
    public static void method4211(int arg0) {
        if (arg0 == -1) {
            field10477 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "destroy", descriptor = "()V", line = 213)
    public final void destroy() {
        field10476++;
        if (class785.field10774 == this && !class185.field2309) {
            class15.field85 = class683.method3903((byte) 4);
            class730.method4066((byte) -45, 5000L);
            class122.field1621 = null;
            this.method4217((byte) -127, false);
        }
    }

    @OriginalMember(owner = "client!pj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 228)
    public final void windowDeactivated(WindowEvent arg0) {
        field10482++;
    }

    @OriginalMember(owner = "client!pj", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 239)
    public final URL getCodeBase() {
        field10494++;
        if (class43.field453 == null) {
            return class511.field7007 == null || class511.field7007 == this ? super.getCodeBase() : class511.field7007.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 254)
    public final void focusLost(FocusEvent arg0) {
        class352.field5108 = false;
        field10490++;
    }

    @OriginalMember(owner = "client!pj", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 271)
    public final void update(Graphics arg0) {
        field10497++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/lang/String;)V", line = 279)
    public final void method4212(int arg0, String arg1) {
        field10491++;
        int var3 = 107 / ((-arg0 - 25) / 41);
        if (this.field10501) {
            return;
        }
        this.field10501 = true;
        System.out.println("error_game_" + arg1);
        try {
            class552.method3253(class511.field7007, 96, "loggedout");
        } catch (Throwable var5) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)Ljava/lang/String;", line = 304)
    public String method773(byte arg0) {
        if (arg0 >= -120) {
            field10473 = -41;
        }
        field10500++;
        return null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 319)
    public final void method4213(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field10478++;
        try {
            if (class785.field10774 == null) {
                class785.field10774 = this;
                class288.field4238 = class511.field7007;
                class607.field8509 = arg2;
                class249.field3700 = arg1;
                class277.field3991 = arg1;
                class742.field10226 = arg3;
                class20.field163 = arg3;
                class339.field4915 = 0;
                class424.field5890 = arg5;
                class122.field1621 = class129.field1674 = new class768(arg6, arg0, arg4, class511.field7007 != null);
                class344 var8 = class129.field1674.method4236(this, 1, arg5);
                while (var8.field4970 == 0) {
                    class730.method4066((byte) -45, 10L);
                }
            } else {
                class305.field4422++;
                if (class305.field4422 >= 3) {
                    this.method4212(38, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class502.method2937(var10, (byte) 39, null);
            this.method4212(-77, "crash");
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)Z", line = 368)
    public final boolean method4214(byte arg0) {
        field10481++;
        int var2 = -41 / ((arg0 + 6) / 43);
        return class161.method1027(90, "jagtheora");
    }

    @OriginalMember(owner = "client!pj", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 378)
    public static final void provideLoaderApplet(Applet arg0) {
        field10499++;
        class511.field7007 = arg0;
    }

    @OriginalMember(owner = "client!pj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 388)
    public final void windowClosed(WindowEvent arg0) {
        field10489++;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V", line = 396)
    private final void method4215(int arg0) {
        field10483++;
        long var2 = class683.method3903((byte) 4);
        long var4 = class289.field4266[class703.field9796];
        class289.field4266[class703.field9796] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class744.field10277 = ((var6 >> 1) + 32000) / var6;
        }
        class703.field9796 = class703.field9796 + 1 & 0x1F;
        if (class560.field7888++ > 50) {
            class516.field7074 = true;
            class560.field7888 -= 50;
            class749.field10341.setSize(class742.field10226, class249.field3700);
            class749.field10341.setVisible(true);
            if (class43.field453 != null && class661.field9305 == null) {
                Insets var7 = class43.field453.getInsets();
                class749.field10341.setLocation(class339.field4915 + var7.left, class424.field5890 + var7.top);
            } else {
                class749.field10341.setLocation(class339.field4915, class424.field5890);
            }
        }
        if (arg0 != 13502) {
            field10473 = -17;
        }
        this.method774(65);
    }

    @OriginalMember(owner = "client!pj", name = "run", descriptor = "()V", line = 439)
    public final void run() {
        field10496++;
        try {
            if (class768.field10568 != null) {
                String var1 = class768.field10568.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class768.field10573;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method4212(115, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class768.field10573 == null || class768.field10573.equals("1.4.2"))) {
                    this.method4212(50, "wrongjava");
                    return;
                }
            }
            if (class768.field10573 != null && class768.field10573.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class768.field10573.length()) {
                    char var5 = class768.field10573.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class491.field6760 = true;
                }
            }
            Applet var6 = class785.field10774;
            if (class511.field7007 != null) {
                var6 = class511.field7007;
            }
            Method var7 = class768.field10571;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class450.method2718(1);
            class273.method1776(10371);
            this.method783(6868);
            this.method771(-117);
            class731.field10109 = class597.method3473(true);
            while (class15.field85 == 0L || class15.field85 > class683.method3903((byte) 4)) {
                class556.field7792 = class731.field10109.method3250((byte) -84, class531.field7311);
                for (int var8 = 0; var8 < class556.field7792; var8++) {
                    this.method4210(-3406);
                }
                this.method4215(13502);
                class473.method2824(115, class749.field10341, class129.field1674);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class502.method2937(var20, (byte) 103, this.method773((byte) -122));
            this.method4212(-126, "crash");
        } finally {
            Object var13 = null;
            this.method4217((byte) 120, true);
        }
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)V", line = 562)
    public synchronized void method783(int arg0) {
        field10487++;
        if (class749.field10341 != null) {
            class749.field10341.removeFocusListener(this);
            class749.field10341.getParent().setBackground(Color.black);
            class749.field10341.getParent().remove(class749.field10341);
        }
        if (arg0 != 6868) {
            this.start();
        }
        Container var2;
        if (class661.field9305 != null) {
            var2 = class661.field9305;
        } else if (class43.field453 != null) {
            var2 = class43.field453;
        } else if (class511.field7007 == null) {
            var2 = class785.field10774;
        } else {
            var2 = class511.field7007;
        }
        var2.setLayout(null);
        class749.field10341 = new class679(this);
        var2.add(class749.field10341);
        class749.field10341.setSize(class742.field10226, class249.field3700);
        class749.field10341.setVisible(true);
        if (class43.field453 == var2) {
            Insets var3 = class43.field453.getInsets();
            class749.field10341.setLocation(class339.field4915 + var3.left, class424.field5890 + var3.top);
        } else {
            class749.field10341.setLocation(class339.field4915, class424.field5890);
        }
        class749.field10341.addFocusListener(this);
        class749.field10341.requestFocus();
        class352.field5108 = true;
        class536.field7412 = true;
        class516.field7074 = true;
        class326.field4590 = false;
        class59.field687 = class683.method3903((byte) 4);
    }

    @OriginalMember(owner = "client!pj", name = "stop", descriptor = "()V", line = 615)
    public final void stop() {
        field10502++;
        if (class785.field10774 == this && !class185.field2309) {
            class15.field85 = class683.method3903((byte) 4) + 4000L;
        }
    }

    @OriginalMember(owner = "client!pj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 628)
    public final synchronized void paint(Graphics arg0) {
        field10510++;
        if (class785.field10774 != this || class185.field2309) {
            return;
        }
        class516.field7074 = true;
        if (class491.field6760 && (class683.method3903((byte) 4) - class59.field687) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class20.field163 && class277.field3991 <= var2.height) {
                class326.field4590 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)Z", line = 651)
    public final boolean method4216(boolean arg0) {
        field10509++;
        if (arg0) {
            field10477 = null;
        }
        return class161.method1027(95, "jaclib");
    }

    @OriginalMember(owner = "client!pj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 663)
    public final void windowActivated(WindowEvent arg0) {
        field10475++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BZ)V", line = 675)
    private final void method4217(byte arg0, boolean arg1) {
        field10511++;
        synchronized (this) {
            if (class185.field2309) {
                return;
            }
            class185.field2309 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class511.field7007 != null) {
            class511.field7007.destroy();
        }
        try {
            this.method781((byte) -26);
        } catch (Exception var10) {
        }
        if (this.field10474) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field10474 = false;
        }
        int var4 = -73 % ((57 - arg0) / 52);
        class398.method2450(true, 65);
        class433.method2598((byte) -94);
        if (class749.field10341 != null) {
            try {
                class749.field10341.removeFocusListener(this);
                class749.field10341.getParent().remove(class749.field10341);
            } catch (Exception var8) {
            }
        }
        if (class129.field1674 != null) {
            try {
                class129.field1674.method4237(-124);
            } catch (Exception var7) {
            }
        }
        this.method789((byte) 102);
        if (class43.field453 != null) {
            class43.field453.setVisible(false);
            class43.field453.dispose();
            class43.field453 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!pj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 751)
    public final void focusGained(FocusEvent arg0) {
        field10480++;
        class352.field5108 = true;
        class516.field7074 = true;
    }

    @OriginalMember(owner = "client!pj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 760)
    public final void windowOpened(WindowEvent arg0) {
        field10505++;
    }

    @OriginalMember(owner = "client!pj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 777)
    public final AppletContext getAppletContext() {
        field10479++;
        if (class43.field453 == null) {
            return class511.field7007 == null || class511.field7007 == this ? super.getAppletContext() : class511.field7007.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 791)
    public final void windowDeiconified(WindowEvent arg0) {
        field10488++;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)Z", line = 798)
    public final boolean method4218(boolean arg0) {
        field10495++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (!arg0) {
                this.field10474 = false;
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method4212(30, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(Z)Z", line = 833)
    public final boolean method4219(boolean arg0) {
        field10503++;
        if (arg0) {
            field10477 = null;
        }
        return class161.method1027(55, "jagmisc");
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILib;[I)V", line = 846)
    public static final void method4220(int arg0, int arg1, class723 arg2, int[] arg3) {
        field10485++;
        if (arg1 != 10) {
            method4220(27, -22, null, null);
        }
        if (arg2.field9173 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg2.field9173.length; var5++) {
                if (arg2.field9173[var5] != arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg2.field9150 != -1) {
                class73 var6 = class571.field8029.method3695(arg2.field9150, (byte) -116);
                int var7 = var6.field818;
                if (var7 == 1) {
                    arg2.field9135 = arg0;
                    arg2.field9123 = 0;
                    arg2.field9168 = 0;
                    arg2.field9203 = 0;
                    arg2.field9117 = 1;
                    if (!arg2.field9136) {
                        class538.method3196(arg2, arg2.field9203, true, var6);
                    }
                }
                if (var7 == 2) {
                    arg2.field9168 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg3.length; var9++) {
            if (arg3[var9] != -1) {
                var8 = false;
            }
            if (arg2.field9173 == null || arg2.field9173[var9] == -1 || class571.field8029.method3695(arg3[var9], (byte) -128).field802 >= class571.field8029.method3695(arg2.field9173[var9], (byte) -110).field802) {
                arg2.field9173 = arg3;
                arg2.field9135 = arg0;
                break;
            }
        }
        if (var8) {
            arg2.field9135 = arg0;
            arg2.field9173 = arg3;
        }
    }

    @OriginalMember(owner = "client!pj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 932)
    public final void windowIconified(WindowEvent arg0) {
        field10508++;
    }

    @OriginalMember(owner = "client!pj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 946)
    public final String getParameter(String arg0) {
        field10504++;
        if (class43.field453 == null) {
            return class511.field7007 == null || class511.field7007 == this ? super.getParameter(arg0) : class511.field7007.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 961)
    public final URL getDocumentBase() {
        field10498++;
        if (class43.field453 == null) {
            return class511.field7007 == null || class511.field7007 == this ? super.getDocumentBase() : class511.field7007.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "start", descriptor = "()V", line = 976)
    public final void start() {
        field10493++;
        if (class785.field10774 == this && !class185.field2309) {
            class15.field85 = 0L;
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
    public abstract void method771(int arg0);

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public abstract void method795(byte arg0);

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
    public abstract void method774(int arg0);

    @OriginalMember(owner = "client!pj", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V")
    public abstract void method789(byte arg0);

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(B)V")
    public abstract void method781(byte arg0);
}
