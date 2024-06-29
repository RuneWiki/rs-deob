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

@OriginalClass("client!sf")
public abstract class class237 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "Z")
    private boolean field4192 = false;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lha;")
    public static class46 field4184 = class271.method1828("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", -46);

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "Z")
    public static boolean field4193 = true;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "Lha;")
    public static class46 field4191 = class271.method1828("compass", -46);

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "Lha;")
    public static class46 field4197 = null;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field4202 = 0;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "Lha;")
    public static class46 field4209 = class271.method1828("event_opbase", -46);

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lha;")
    public static class46 field4182 = class271.method1828(" <col=00ff80>", -46);

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Lwf;")
    public static class16 field4188 = new class16(64);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "Z")
    public static boolean field4218;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "Z")
    public static boolean field4219;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    private final void method1620(byte arg0) {
        int var2 = 25 % ((arg0 + 42) / 56);
        field4211++;
        long var3 = class223.method1537(-26619);
        long var5 = class70.field1204[class226.field3950];
        class70.field1204[class226.field3950] = var3;
        boolean var10000;
        if (var5 == 0L || var5 >= var3) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class226.field3950 = class226.field3950 + 1 & 0x1F;
        synchronized (this) {
            class216.field3828 = class220.field3874;
        }
        this.method1626((byte) 54);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
    public abstract void method1621(boolean arg0);

    @OriginalMember(owner = "client!sf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class220.field3874 = false;
        field4200++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public final void method1622(String arg0, boolean arg1) {
        if (arg1) {
            field4202 = -9;
        }
        field4215++;
        if (this.field4192) {
            return;
        }
        this.field4192 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    private final void method1623(int arg0) {
        field4204++;
        long var2 = class239.field4264[class245.field4346];
        long var4 = class223.method1537(-26619);
        class239.field4264[class245.field4346] = var4;
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class3.field44 = ((var6 >> 1) + 32000) / var6;
        }
        class245.field4346 = class245.field4346 + 1 & 0x1F;
        if (arg0 < class92.field1715++) {
            class184.field3291 = true;
            class92.field1715 -= 50;
            class258.field4508.setSize(class50.field876, class163.field2895);
            class258.field4508.setVisible(true);
            if (class227.field3983 != null && class161.field2851 == null) {
                Insets var7 = class227.field3983.getInsets();
                class258.field4508.setLocation(class73.field1297 + var7.left, class64.field1079 + var7.top);
            } else {
                class258.field4508.setLocation(class73.field1297, class64.field1079);
            }
        }
        this.method1621(true);
    }

    @OriginalMember(owner = "client!sf", name = "start", descriptor = "()V")
    public final void start() {
        field4187++;
        if (class236.field4161 == this && !class226.field3970) {
            class53.field921 = 0L;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1624(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class252.field4443++;
        field4196++;
        if (!arg0) {
            class150.method1106(false, true);
            class86.method676((byte) -105, true);
            class150.method1106(false, false);
        }
        class86.method676((byte) -104, false);
        if (!arg0) {
            class261.method1747(3222);
        }
        class77.method612((byte) 53);
        if (class154.field2735 == 1) {
            int var6 = class249.field4414 + class142.field2588 & 0x7FF;
            int var7 = class207.field3710;
            if (var7 < class60.field999 / 256) {
                var7 = class60.field999 / 256;
            }
            if (class201.field3584[4] && var7 < (class258.field4498[4] + 128)) {
                var7 = class258.field4498[4] + 128;
            }
            class37.method245(var7, class134.field2429, class206.method1461(class277.field4824.field2546, class135.field2450, class277.field4824.field2585, 4) - 50, (byte) 90, arg2, var7 * 3 + 600, class147.field2647, var6);
        }
        int var8 = class161.field2849;
        int var9 = class57.field958;
        int var10 = class10.field178;
        int var11 = class134.field2425;
        int var12 = class26.field513;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class201.field3584[var13]) {
                int var19 = (int) ((double) (class227.field3975[var13] * 2 + 1) * Math.random() + Math.sin((double) class227.field3990[var13] / 100.0D * (double) class220.field3879[var13]) * (double) class258.field4498[var13] - (double) class227.field3975[var13]);
                if (var13 == 3) {
                    class10.field178 = class10.field178 + var19 & 0x7FF;
                }
                if (var13 == 2) {
                    class134.field2425 += var19;
                }
                if (var13 == 4) {
                    class57.field958 += var19;
                    if (class57.field958 < 128) {
                        class57.field958 = 128;
                    }
                    if (class57.field958 > 383) {
                        class57.field958 = 383;
                    }
                }
                if (var13 == 1) {
                    class26.field513 += var19;
                }
                if (var13 == 0) {
                    class161.field2849 += var19;
                }
            }
        }
        class81.method637(arg4 - 3);
        class262.method1753(arg5, arg1, arg3 + arg5, arg1 + arg2);
        class62.method438();
        if (class222.field3910 || arg5 > class197.field3517 || class197.field3517 >= (arg3 + arg5) || arg1 > class250.field4420 || (arg1 + arg2) <= class250.field4420) {
            class263.field4568 = 0;
            class245.field4358 = false;
        } else {
            class263.field4568 = 0;
            class245.field4358 = true;
            int var14 = class144.field2623;
            int var15 = class52.field897;
            class2.field30 = (class197.field3517 - arg5) * (var15 - var14) / arg3 + var14;
            int var16 = class261.field4546;
            int var17 = class20.field269;
            class111.field2113 = (class250.field4420 - arg1) * (var17 - var16) / arg2 + var16;
        }
        class267.method1789(89);
        byte var18 = class258.method1737(arg4) == 2 ? (byte) class252.field4443 : 1;
        class262.method1762(arg5, arg1, arg3, arg2, 0);
        class138.method1056(class161.field2849, class26.field513, class134.field2425, class57.field958, class10.field178, class60.field1001, class98.field1825, class84.field1606, class89.field1691, class15.field228, class102.field1860, class135.field2450 + 1, var18, class277.field4824.field2585 >> 7, class277.field4824.field2546 >> 7);
        class267.method1789(88);
        class249.method1694();
        class268.method1797(arg1, arg2, arg3, 99, arg5, 256, 256);
        class95.method748(arg1, 256, arg5, (byte) -120, arg3, arg2, 256);
        ((class93) class62.field1040).method726(field4202, 97);
        class169.method1204(arg1, arg5, arg2, arg3, 8);
        class10.field178 = var10;
        class26.field513 = var12;
        class161.field2849 = var8;
        class57.field958 = var9;
        class134.field2425 = var11;
        if (class154.field2708 && class205.field3677.method1246(-128) == 0) {
            class154.field2708 = false;
        }
        if (class154.field2708) {
            class262.method1762(arg5, arg1, arg3, arg2, 0);
            class131.method1014((byte) -104, false, class181.field3256);
        }
        if (!arg0 && !class154.field2708 && !class222.field3910 && class197.field3517 >= arg5 && (arg5 + arg3) > class197.field3517 && class250.field4420 >= arg1 && (arg1 + arg2) > class250.field4420) {
            class49.method362(class250.field4420, arg2, class197.field3517, arg3, arg5, (byte) 114, arg1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field4201++;
        if (class227.field3983 == null) {
            return class8.field130 == null || class8.field130.field143 == this ? super.getDocumentBase() : class8.field130.field143.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBII)V")
    public static final void method1625(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == 111) {
            field4190++;
            class46 var4 = class109.method855(0, new class46[] { class268.field4638, class115.method932(false, arg0), class115.field2165, class115.method932(false, arg2 >> 6), class115.field2165, class115.method932(false, arg3 >> 6), class115.field2165, class115.method932(false, arg2 & 0x3F), class115.field2165, class115.method932(false, arg3 & 0x3F) });
            var4.method332(arg1 ^ 0x6F);
            class187.method1362(var4, arg1 ^ 0x6D);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
    public abstract void method1626(byte arg0);

    @OriginalMember(owner = "client!sf", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4207++;
    }

    @OriginalMember(owner = "client!sf", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field4203++;
        if (class227.field3983 == null) {
            return class8.field130 == null || class8.field130.field143 == this ? super.getParameter(arg0) : class8.field130.field143.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field4205++;
        if (class227.field3983 == null) {
            return class8.field130 == null || class8.field130.field143 == this ? super.getCodeBase() : class8.field130.field143.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
    public static void method1627(int arg0) {
        field4209 = null;
        field4191 = null;
        field4184 = null;
        field4197 = null;
        field4188 = null;
        field4182 = null;
        if (arg0 != 2) {
            field4184 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
    public static final void method1628(int arg0, int arg1, int arg2) {
        class183.field3285++;
        class58.field967.method285((byte) -90, arg1);
        class58.field967.method547((byte) -67, arg2);
        class58.field967.method544(arg0, (byte) -104);
        field4183++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)V")
    public final void method1629(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4217++;
        try {
            if (class236.field4161 == null) {
                class270.field4713 = arg2;
                class73.field1297 = 0;
                class50.field876 = arg0;
                class29.field565 = arg0;
                class64.field1079 = 0;
                if (arg3 != 1) {
                    this.getCodeBase();
                }
                class163.field2895 = arg4;
                class236.field4118 = arg4;
                class236.field4161 = this;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class8.field130 == null) {
                    class47.field824 = class8.field130 = new class9(this, arg1, (String) null, 0);
                }
                class165 var7 = class8.field130.method36(this, -111, 1);
                while (var7.field2925 == 0) {
                    class187.method1360((byte) -103, 10L);
                }
            } else {
                class71.field1285++;
                if (class71.field1285 >= 3) {
                    this.method1622("alreadyloaded", false);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class272.method1835(var9, -57, (String) null);
            this.method1622("crash", false);
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V")
    public abstract void method1630(byte arg0);

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
    public final synchronized void method1631(int arg0) {
        field4178++;
        if (class258.field4508 != null) {
            class258.field4508.removeFocusListener(this);
            class258.field4508.getParent().remove(class258.field4508);
        }
        Container var2;
        if (class161.field2851 != null) {
            var2 = class161.field2851;
        } else if (class227.field3983 == null) {
            var2 = class8.field130.field143;
        } else {
            var2 = class227.field3983;
        }
        if (arg0 >= -84) {
            this.windowIconified((WindowEvent) null);
        }
        var2.setLayout((LayoutManager) null);
        class258.field4508 = new class261(this);
        var2.add(class258.field4508);
        class258.field4508.setSize(class50.field876, class163.field2895);
        class258.field4508.setVisible(true);
        if (class227.field3983 == var2) {
            Insets var3 = class227.field3983.getInsets();
            class258.field4508.setLocation(class73.field1297 + var3.left, class64.field1079 + var3.top);
        } else {
            class258.field4508.setLocation(class73.field1297, class64.field1079);
        }
        class258.field4508.addFocusListener(this);
        class258.field4508.requestFocus();
        class220.field3874 = true;
        class184.field3291 = true;
        class183.field3278 = false;
        class216.field3828 = true;
        class174.field3110 = class223.method1537(-26619);
    }

    @OriginalMember(owner = "client!sf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4179++;
        class220.field3874 = true;
        class184.field3291 = true;
    }

    @OriginalMember(owner = "client!sf", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field4210++;
    }

    @OriginalMember(owner = "client!sf", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field4199++;
        if (class227.field3983 == null) {
            return class8.field130 == null || class8.field130.field143 == this ? super.getAppletContext() : class8.field130.field143.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field4186++;
    }

    @OriginalMember(owner = "client!sf", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field4206++;
    }

    @OriginalMember(owner = "client!sf", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field4194++;
        if (class236.field4161 == this && !class226.field3970) {
            class53.field921 = class223.method1537(-26619);
            class187.method1360((byte) -124, 5000L);
            class47.field824 = null;
            this.method1636(false, -95);
        }
    }

    @OriginalMember(owner = "client!sf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field4216++;
    }

    @OriginalMember(owner = "client!sf", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field4214++;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
    public abstract void method1632(int arg0);

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
    public abstract void method1633(int arg0);

    @OriginalMember(owner = "client!sf", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!sf", name = "run", descriptor = "()V")
    public final void run() {
        field4185++;
        try {
            if (class9.field152 != null) {
                String var1 = class9.field152.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class9.field155;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1622("wrongjava", false);
                        return;
                    }
                    class270.field4711 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class9.field155 == null || class9.field155.equals("1.4.2"))) {
                    this.method1622("wrongjava", false);
                    return;
                }
            }
            if (class9.field155 != null && class9.field155.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class9.field155.length() > var3) {
                    char var5 = class9.field155.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 - (48 - var5);
                    var3++;
                }
                if (var4 >= 5) {
                    class102.field1853 = true;
                }
            }
            if (class8.field130.field143 != null) {
                Method var6 = class9.field162;
                if (var6 != null) {
                    try {
                        var6.invoke(class8.field130.field143, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            this.method1631(-127);
            class177.field3176 = class265.method1784(class258.field4508, class50.field876, (byte) -125, class163.field2895);
            this.method1630((byte) -123);
            class85.field1618 = class144.method1077(73);
            while (class53.field921 == 0L || class223.method1537(-26619) < class53.field921) {
                class197.field3512 = class85.field1618.method162(0, class131.field2411, class270.field4711);
                for (int var7 = 0; var7 < class197.field3512; var7++) {
                    this.method1620((byte) -119);
                }
                this.method1623(50);
                class268.method1792(class258.field4508, (byte) -61, class8.field130);
            }
        } catch (Exception var10) {
            class272.method1835(var10, -96, (String) null);
            this.method1622("crash", false);
        }
        this.method1636(true, -114);
    }

    @OriginalMember(owner = "client!sf", name = "providesignlink", descriptor = "(Lrc;)V")
    public static final void providesignlink(class9 arg0) {
        class8.field130 = arg0;
        class47.field824 = arg0;
        field4180++;
    }

    @OriginalMember(owner = "client!sf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field4189++;
        if (class236.field4161 != this || class226.field3970) {
            return;
        }
        class184.field3291 = true;
        if (class102.field1853 && class223.method1537(-26619) - class174.field3110 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class29.field565 && var2.height >= class236.field4118) {
                class183.field3278 = true;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)Z")
    public final boolean method1634(boolean arg0) {
        field4213++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
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
                this.method1622("invalidhost", arg0);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field4208++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method1635(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class236.field4161 = this;
            class64.field1079 = 0;
            class270.field4713 = arg6;
            class73.field1297 = 0;
            class50.field876 = arg5;
            class29.field565 = arg5;
            class163.field2895 = arg3;
            class236.field4118 = arg3;
            class227.field3983 = new Frame();
            class227.field3983.setTitle("Jagex");
            class227.field3983.setResizable(true);
            if (arg4 != 64) {
                field4188 = null;
            }
            class227.field3983.addWindowListener(this);
            class227.field3983.setVisible(true);
            class227.field3983.toFront();
            Insets var8 = class227.field3983.getInsets();
            class227.field3983.setSize(class29.field565 + var8.left + var8.right, class236.field4118 + var8.bottom + var8.top);
            class47.field824 = class8.field130 = new class9((Applet) null, arg1, arg0, arg2);
            class165 var9 = class8.field130.method36(this, arg4 ^ 0xFFFFFFFC, 1);
            while (var9.field2925 == 0) {
                class187.method1360((byte) 126, 10L);
            }
        } catch (Exception var11) {
            class272.method1835(var11, -22, (String) null);
        }
        field4195++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)V")
    private final void method1636(boolean arg0, int arg1) {
        field4198++;
        synchronized (this) {
            if (class226.field3970) {
                return;
            }
            class226.field3970 = true;
        }
        if (class8.field130.field143 != null) {
            class8.field130.field143.destroy();
        }
        try {
            if (arg1 >= -94) {
                return;
            }
            this.method1632(37);
        } catch (Exception var9) {
        }
        if (class258.field4508 != null) {
            try {
                class258.field4508.removeFocusListener(this);
                class258.field4508.getParent().remove(class258.field4508);
            } catch (Exception var8) {
            }
        }
        if (class8.field130 != null) {
            try {
                class8.field130.method45(true);
            } catch (Exception var7) {
            }
        }
        this.method1633(-114);
        if (class227.field3983 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!sf", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field4181++;
    }

    @OriginalMember(owner = "client!sf", name = "stop", descriptor = "()V")
    public final void stop() {
        field4212++;
        if (class236.field4161 == this && !class226.field3970) {
            class53.field921 = class223.method1537(-26619) + 4000L;
        }
    }
}
