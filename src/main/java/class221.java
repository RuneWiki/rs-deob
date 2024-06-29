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
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public abstract class class221 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "Z")
    private boolean field3642 = false;

    @OriginalMember(owner = "client!pp", name = "K", descriptor = "Z")
    private boolean field3675 = false;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "Lgi;")
    public static class403 field3660 = new class403(8);

    @OriginalMember(owner = "client!pp", name = "J", descriptor = "I")
    public static int field3674 = 0;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!pp", name = "E", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!pp", name = "H", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!pp", name = "N", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!pp", name = "M", descriptor = "Lvq;")
    public static class267 field3677;

    @OriginalMember(owner = "client!pp", name = "L", descriptor = "Lmo;")
    public static class447 field3676;

    @OriginalMember(owner = "client!pp", name = "O", descriptor = "Z")
    public static boolean field3679;

    @OriginalMember(owner = "client!pp", name = "P", descriptor = "Z")
    public static boolean field3680;

    @OriginalMember(owner = "client!pp", name = "Q", descriptor = "Z")
    public static boolean field3681;

    @OriginalMember(owner = "client!pp", name = "R", descriptor = "Z")
    public static boolean field3682;

    @OriginalMember(owner = "client!pp", name = "S", descriptor = "Z")
    public static boolean field3683;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIBI)V")
    public final void method1574(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3667++;
        try {
            if (class133.field2087 == null) {
                class409.field6058 = arg1;
                class13.field192 = 0;
                class108.field1512 = 0;
                class133.field2087 = this;
                if (arg3 != -114) {
                    field3674 = -81;
                }
                class369.field5615 = arg2;
                class318.field4984 = arg2;
                class430.field6324 = arg4;
                class284.field4567 = arg4;
                if (class63.field822 == null) {
                    class379.field5742 = class63.field822 = new class279(this, arg0, (String) null, 0);
                }
                class26 var6 = class63.field822.method1897(1, this, 2);
                while (var6.field304 == 0) {
                    class84.method517((byte) -75, 10L);
                }
            } else {
                class56.field705++;
                if (class56.field705 >= 3) {
                    this.method1580("alreadyloaded", arg3 ^ 0xFFFFFF84);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class272.method1845(var8, 124, (String) null);
            this.method1580("crash", 10);
        }
    }

    @OriginalMember(owner = "client!pp", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class302.field4778 = false;
        field3659++;
    }

    @OriginalMember(owner = "client!pp", name = "start", descriptor = "()V")
    public final void start() {
        field3643++;
        if (class133.field2087 == this && !class312.field4910) {
            class68.field855 = 0L;
        }
    }

    @OriginalMember(owner = "client!pp", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3673++;
    }

    @OriginalMember(owner = "client!pp", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3654++;
        if (class47.field587 == null) {
            return class63.field822 == null || class63.field822.field4464 == this ? super.getAppletContext() : class63.field822.field4464.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
    public final void method1575(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field3651++;
        if (this.field3675) {
            return;
        }
        try {
            class26 var2 = class63.field822.method1886(class133.field2087.getClass(), true);
            while (var2.field304 == 0) {
                class84.method517((byte) -95, 100L);
            }
            if (var2.field305 != null) {
                throw (Throwable) var2.field305;
            }
            jagmisc.init();
            this.field3675 = true;
            class249.field4072 = class324.method2146(true);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
    public final synchronized void method1576(int arg0) {
        field3663++;
        if (arg0 != 0) {
            this.method1575(59);
        }
        if (class86.field1073 != null) {
            class86.field1073.removeFocusListener(this);
            class86.field1073.getParent().remove(class86.field1073);
        }
        Container var2;
        if (class395.field5920 != null) {
            var2 = class395.field5920;
        } else if (class47.field587 == null) {
            var2 = class63.field822.field4464;
        } else {
            var2 = class47.field587;
        }
        var2.setLayout((LayoutManager) null);
        class86.field1073 = new class183(this);
        var2.add(class86.field1073);
        class86.field1073.setSize(class369.field5615, class430.field6324);
        class86.field1073.setVisible(true);
        if (class47.field587 == var2) {
            Insets var3 = class47.field587.getInsets();
            class86.field1073.setLocation(class13.field192 + var3.left, var3.top - -class108.field1512);
        } else {
            class86.field1073.setLocation(class13.field192, class108.field1512);
        }
        class86.field1073.addFocusListener(this);
        class86.field1073.requestFocus();
        class348.field5345 = true;
        class302.field4778 = true;
        class208.field3353 = true;
        class191.field3117 = false;
        class277.field4417 = class46.method297(27104);
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)V")
    public abstract void method1148(int arg0);

    @OriginalMember(owner = "client!pp", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3670++;
    }

    @OriginalMember(owner = "client!pp", name = "providesignlink", descriptor = "(Lap;)V")
    public static final void providesignlink(class279 arg0) {
        class63.field822 = arg0;
        class379.field5742 = arg0;
        field3653++;
    }

    @OriginalMember(owner = "client!pp", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3641++;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)Z")
    public final boolean method1577(byte arg0) {
        field3647++;
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
            if (var2.endsWith("192.168.1.")) {
                return true;
            }
            if (arg0 < 52) {
                field3660 = null;
            }
            this.method1580("invalidhost", 10);
            return false;
        }
    }

    @OriginalMember(owner = "client!pp", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3650++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZ)V")
    private final void method1578(int arg0, boolean arg1) {
        field3661++;
        synchronized (this) {
            if (class312.field4910) {
                return;
            }
            class312.field4910 = true;
        }
        if (class63.field822.field4464 != null) {
            class63.field822.field4464.destroy();
        }
        try {
            this.method1142(-5342);
            if (arg0 != -1074) {
                field3677 = null;
            }
        } catch (Exception var11) {
        }
        if (this.field3675) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field3675 = false;
        }
        class26 var4 = class63.field822.method1903(arg0 ^ 0x4680, class133.field2087.getClass());
        while (var4.field304 == 0) {
            class84.method517((byte) 120, 100L);
        }
        if (class86.field1073 != null) {
            try {
                class86.field1073.removeFocusListener(this);
                class86.field1073.getParent().remove(class86.field1073);
            } catch (Exception var9) {
            }
        }
        if (class63.field822 != null) {
            try {
                class63.field822.method1895(5953);
            } catch (Exception var8) {
            }
        }
        this.method1141(-93);
        if (class47.field587 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V")
    private final void method1579(byte arg0) {
        field3644++;
        if (arg0 != 6) {
            return;
        }
        long var2 = class46.method297(27104);
        long var4 = class19.field252[class410.field6083];
        class19.field252[class410.field6083] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class410.field6083 = class410.field6083 + 1 & 0x1F;
        synchronized (this) {
            class348.field5345 = class302.field4778;
        }
        this.method1152((byte) 92);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method1580(String arg0, int arg1) {
        field3662++;
        if (this.field3642) {
            return;
        }
        this.field3642 = true;
        if (arg1 != 10) {
            this.field3675 = true;
        }
        System.out.println("error_game_" + arg0);
        try {
            class169.method1180(class63.field822.field4464, "loggedout", false);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!pp", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class302.field4778 = true;
        field3666++;
        class208.field3353 = true;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IILhj;)V")
    public static final void method1581(int arg0, int arg1, class338 arg2) {
        if (arg0 != 4) {
            field3660 = null;
        }
        field3672++;
        while (true) {
            class361 var3 = (class361) class58.field752.method253((byte) -6);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field5520; var5++) {
                if (var3.field5512[var5] != null) {
                    if (var3.field5512[var5].field304 == 2) {
                        var3.field5514[var5] = -5;
                    }
                    if (var3.field5512[var5].field304 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field5521[var5] != null) {
                    if (var3.field5521[var5].field304 == 2) {
                        var3.field5514[var5] = -6;
                    }
                    if (var3.field5521[var5].field304 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method2224(arg1, (byte) 0);
            arg2.method1312(0, -70);
            int var6 = arg2.field3044;
            arg2.method1315(var3.field5518, (byte) 15);
            for (int var7 = 0; var7 < var3.field5520; var7++) {
                if (var3.field5514[var7] == 0) {
                    try {
                        int var8 = var3.field5519[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field5512[var7].field305;
                            int var10 = var9.getInt((Object) null);
                            arg2.method1312(0, arg0 - 99);
                            arg2.method1315(var10, (byte) 125);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field5512[var7].field305;
                            var11.setInt((Object) null, var3.field5516[var7]);
                            arg2.method1312(0, -30);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field5512[var7].field305;
                            int var13 = var12.getModifiers();
                            arg2.method1312(0, arg0 ^ 0xFFFFFF8C);
                            arg2.method1315(var13, (byte) 65);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field5521[var7].field305;
                            byte[][] var17 = var3.field5511[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method1312(0, -26);
                            } else if ((var21 instanceof Number)) {
                                arg2.method1312(1, arg0 - 117);
                                arg2.method1318(arg0 - 4, ((Number) var21).longValue());
                            } else if ((var21 instanceof String)) {
                                arg2.method1312(2, -46);
                                arg2.method1301((String) var21, 127);
                            } else {
                                arg2.method1312(4, -27);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field5521[var7].field305;
                            int var15 = var14.getModifiers();
                            arg2.method1312(0, -30);
                            arg2.method1315(var15, (byte) 34);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1312(-10, -23);
                    } catch (InvalidClassException var23) {
                        arg2.method1312(-11, -125);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1312(-12, arg0 - 126);
                    } catch (OptionalDataException var25) {
                        arg2.method1312(-13, -82);
                    } catch (IllegalAccessException var26) {
                        arg2.method1312(-14, -40);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1312(-15, -71);
                    } catch (InvocationTargetException var28) {
                        arg2.method1312(-16, -113);
                    } catch (SecurityException var29) {
                        arg2.method1312(-17, -33);
                    } catch (IOException var30) {
                        arg2.method1312(-18, -87);
                    } catch (NullPointerException var31) {
                        arg2.method1312(-19, -22);
                    } catch (Exception var32) {
                        arg2.method1312(-20, -58);
                    } catch (Throwable var33) {
                        arg2.method1312(-21, -34);
                    }
                } else {
                    arg2.method1312(var3.field5514[var7], -107);
                }
            }
            arg2.method1304(var6, -3);
            arg2.method1297(arg2.field3044 - var6, -1);
            var3.method1120(arg0 - 98);
        }
    }

    @OriginalMember(owner = "client!pp", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3678++;
        if (class47.field587 == null) {
            return class63.field822 == null || class63.field822.field4464 == this ? super.getDocumentBase() : class63.field822.field4464.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3658++;
        this.destroy();
    }

    @OriginalMember(owner = "client!pp", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3640++;
        if (class133.field2087 == this && !class312.field4910) {
            class68.field855 = class46.method297(27104);
            class84.method517((byte) 126, 5000L);
            class379.field5742 = null;
            this.method1578(-1074, false);
        }
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)V")
    public abstract void method1141(int arg0);

    @OriginalMember(owner = "client!pp", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3657++;
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)V")
    public abstract void method1152(byte arg0);

    @OriginalMember(owner = "client!pp", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3656++;
    }

    @OriginalMember(owner = "client!pp", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3649++;
    }

    @OriginalMember(owner = "client!pp", name = "run", descriptor = "()V")
    public final void run() {
        try {
            label107: {
                if (class279.field4458 != null) {
                    String var1 = class279.field4458.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class279.field4457;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1580("wrongjava", 10);
                            break label107;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class279.field4457 == null || class279.field4457.equals("1.4.2"))) {
                        this.method1580("wrongjava", 10);
                        break label107;
                    }
                }
                if (class279.field4457 != null && class279.field4457.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class279.field4457.length()) {
                        char var5 = class279.field4457.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 - (48 - var5);
                    }
                    if (var4 >= 5) {
                        class329.field5158 = true;
                    }
                }
                if (class63.field822.field4464 != null) {
                    Method var6 = class279.field4477;
                    if (var6 != null) {
                        try {
                            var6.invoke(class63.field822.field4464, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class385.method2436(-115);
                class275.method1855((byte) 52);
                this.method1576(0);
                this.method1145(-22253);
                class249.field4072 = class324.method2146(true);
                this.method1575(0);
                while (class68.field855 == 0L || class68.field855 > class46.method297(27104)) {
                    class257.field4170 = class249.field4072.method1367(false, class134.field2094);
                    for (int var7 = 0; var7 < class257.field4170; var7++) {
                        this.method1579((byte) 6);
                    }
                    this.method1587((byte) -104);
                    class422.method2625(class86.field1073, -128, class63.field822);
                }
            }
        } catch (Exception var10) {
            class272.method1845(var10, 127, (String) null);
            this.method1580("crash", 10);
        }
        field3652++;
        this.method1578(-1074, true);
    }

    @OriginalMember(owner = "client!pp", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3668++;
        if (class133.field2087 != this || class312.field4910) {
            return;
        }
        class208.field3353 = true;
        if (class329.field5158 && class46.method297(27104) - class277.field4417 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class318.field4984 <= var2.width && class284.field4567 <= var2.height) {
                class191.field3117 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "stop", descriptor = "()V")
    public final void stop() {
        field3664++;
        if (class133.field2087 == this && !class312.field4910) {
            class68.field855 = class46.method297(27104) + 4000L;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZIIIILjava/lang/String;ZI)V")
    public final void method1582(boolean arg0, int arg1, int arg2, int arg3, int arg4, String arg5, boolean arg6, int arg7) {
        field3671++;
        try {
            class13.field192 = 0;
            class409.field6058 = arg1;
            class369.field5615 = arg7;
            class318.field4984 = arg7;
            class133.field2087 = this;
            class108.field1512 = 0;
            class430.field6324 = arg3;
            class284.field4567 = arg3;
            class47.field587 = new Frame();
            class47.field587.setTitle("Jagex");
            class47.field587.setResizable(true);
            class47.field587.addWindowListener(this);
            class47.field587.setVisible(arg6);
            class47.field587.toFront();
            Insets var9 = class47.field587.getInsets();
            class47.field587.setSize(class318.field4984 + var9.left + var9.right, class284.field4567 + var9.top + var9.bottom);
            class379.field5742 = class63.field822 = new class279((Applet) null, arg2, arg5, arg4);
            class26 var10 = class63.field822.method1897(1, this, 2);
            while (var10.field304 == 0) {
                class84.method517((byte) -106, 10L);
            }
        } catch (Exception var12) {
            class272.method1845(var12, 127, (String) null);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIBII)Lvq;")
    public static final class267 method1583(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3648++;
        if (arg2 != -2) {
            return null;
        }
        class439[] var5 = null;
        class132 var6 = class59.method387(arg0, true);
        if (var6.field2070 != null) {
            var5 = new class439[var6.field2070.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class270 var8 = class325.method2157(8530, var6.field2070[var7]);
                var5[var7] = new class439(var8.field4325, var8.field4332, var8.field4328, var8.field4330, var8.field4333, var8.field4335, var8.field4327, var8.field4336);
            }
        }
        return new class267(var6.field2069, var5, var6.field2059, arg1, arg4, arg3);
    }

    @OriginalMember(owner = "client!pp", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3646++;
        if (class47.field587 == null) {
            return class63.field822 == null || class63.field822.field4464 == this ? super.getCodeBase() : class63.field822.field4464.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)V")
    public static void method1584(int arg0) {
        field3660 = null;
        if (arg0 == -31051) {
            field3676 = null;
            field3677 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lmo;IBIIZI)V")
    public static final void method1585(class447 arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class358.field5471 = arg1;
        field3655++;
        class417.field6178 = 1;
        class390.field5860 = arg0;
        class277.field4419 = arg6;
        class220.field3625 = arg4;
        if (arg2 < -46) {
            class263.field4241 = arg3;
            class150.field2350 = arg5;
        }
    }

    @OriginalMember(owner = "client!pp", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3669++;
        if (class47.field587 == null) {
            return class63.field822 == null || class63.field822.field4464 == this ? super.getParameter(arg0) : class63.field822.field4464.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V")
    public static final void method1586(int arg0, int arg1) {
        class296.method1997(-3660);
        field3665++;
        class75.method478(false);
        class62.method406(true, arg1, false);
        if (arg0 != -1009) {
            return;
        }
        class287.method1942(class284.field4547, 8820, class223.field3727, class33.field407);
        class183.method1248(class223.field3727, class284.field4547, 118);
        class124.method906(class181.field2960, 29865);
        class56.method370((byte) -124);
        class193.method1356((byte) -70);
        if (class262.field4219 == 10) {
            class334.method2209(false, (byte) -60);
        } else if (class262.field4219 == 30) {
            class128.method953(arg0 ^ 0xFFFFC342, 25);
        } else if (class262.field4219 == 5) {
            class110.method815(class223.field3727, 17272, class284.field4547);
            return;
        }
    }

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "(I)V")
    public abstract void method1142(int arg0);

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "(I)V")
    public abstract void method1145(int arg0);

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(B)V")
    private final void method1587(byte arg0) {
        field3645++;
        long var2 = class46.method297(27104);
        long var4 = class29.field328[class41.field516];
        class29.field328[class41.field516] = var2;
        class41.field516 = class41.field516 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class208.field3333 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class448.field6539++) > 50) {
            class208.field3353 = true;
            class448.field6539 -= 50;
            class86.field1073.setSize(class369.field5615, class430.field6324);
            class86.field1073.setVisible(true);
            if (class47.field587 != null && class395.field5920 == null) {
                Insets var7 = class47.field587.getInsets();
                class86.field1073.setLocation(class13.field192 + var7.left, class108.field1512 + var7.top);
            } else {
                class86.field1073.setLocation(class13.field192, class108.field1512);
            }
        }
        if (arg0 < -88) {
            this.method1148(85);
        }
    }
}
