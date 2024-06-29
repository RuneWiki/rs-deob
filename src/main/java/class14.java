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

@OriginalClass("client!ml")
public abstract class class14 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "Z")
    private boolean field230 = false;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "Z")
    private boolean field254 = false;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    public static int field237 = 0;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public static int field231 = 0;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field227 = -1;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "Z")
    public static boolean field257;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "[I")
    public static int[] field226;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public abstract void method85(byte arg0);

    @OriginalMember(owner = "client!ml", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field218++;
    }

    @OriginalMember(owner = "client!ml", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field224++;
        if (class31.field469 == null) {
            return class45.field667 == null || class45.field667.field744 == this ? super.getDocumentBase() : class45.field667.field744.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public final synchronized void method86(int arg0) {
        if (class291.field4645 != null) {
            class291.field4645.removeFocusListener(this);
            class291.field4645.getParent().remove(class291.field4645);
        }
        Container var2;
        if (class43.field653 != null) {
            var2 = class43.field653;
        } else if (class31.field469 == null) {
            var2 = class45.field667.field744;
        } else {
            var2 = class31.field469;
        }
        var2.setLayout((LayoutManager) null);
        field235++;
        class291.field4645 = new class216(this);
        var2.add(class291.field4645);
        class291.field4645.setSize(class218.field3386, class174.field2460);
        class291.field4645.setVisible(true);
        if (class31.field469 == var2) {
            Insets var3 = class31.field469.getInsets();
            class291.field4645.setLocation(var3.left + class11.field186, class212.field3196 + var3.top);
        } else {
            class291.field4645.setLocation(class11.field186, class212.field3196);
        }
        class291.field4645.addFocusListener(this);
        if (arg0 != 48) {
            this.getAppletContext();
        }
        class291.field4645.requestFocus();
        class75.field1050 = true;
        class306.field4930 = true;
        class292.field4665 = true;
        class197.field3020 = false;
        class159.field2219 = class299.method2006(9594);
    }

    @OriginalMember(owner = "client!ml", name = "run", descriptor = "()V")
    public final void run() {
        field221++;
        try {
            if (class52.field739 != null) {
                String var1 = class52.field739.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class52.field742;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method87("wrongjava", false);
                        return;
                    }
                    class245.field3849 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class52.field742 == null || class52.field742.equals("1.4.2"))) {
                    this.method87("wrongjava", false);
                    return;
                }
            }
            if (class52.field742 != null && class52.field742.startsWith("1.")) {
                int var3 = 0;
                int var4 = 2;
                while (class52.field742.length() > var4) {
                    char var5 = class52.field742.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4++;
                    var3 = var3 * 10 + (var5 - '0');
                }
                if (var3 >= 5) {
                    class109.field1560 = true;
                }
            }
            if (class45.field667.field744 != null) {
                Method var6 = class52.field748;
                if (var6 != null) {
                    try {
                        var6.invoke(class45.field667.field744, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class82.method521(-1163264472);
            this.method86(48);
            class24.field382 = class112.method716(class291.field4645, 113, class218.field3386, class174.field2460);
            this.method95(28);
            class157.field2162 = class39.method262(62);
            this.method98(-114);
            while (class211.field3184 == 0L || class299.method2006(9594) < class211.field3184) {
                class144.field1971 = class157.field2162.method384((byte) 56, class245.field3849, class302.field4802);
                for (int var7 = 0; var7 < class144.field1971; var7++) {
                    this.method101(13300);
                }
                this.method92((byte) 124);
                class274.method1780(class291.field4645, 113, class45.field667);
            }
        } catch (Exception var10) {
            class121.method780(160, (String) null, var10);
            this.method87("crash", false);
        }
        this.method102((byte) 101, true);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public final void method87(String arg0, boolean arg1) {
        field234++;
        if (this.field254) {
            return;
        }
        this.field254 = true;
        System.out.println("error_game_" + arg0);
        try {
            class172.method1097("loggedout", true, class45.field667.field744);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
        if (arg1) {
            this.method94((byte) -103);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method88(String arg0, int arg1) {
        int var2 = 21 / ((arg1 - 35) / 51);
        field233++;
        String var3 = class245.method1606(0, class92.method594(-15250, arg0));
        if (var3 == null) {
            var3 = "";
        }
        return var3;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
    public static void method89(byte arg0) {
        if (arg0 <= 60) {
            field227 = -119;
        }
        field226 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILjava/lang/String;IIZZI)V")
    public final void method90(int arg0, int arg1, String arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        try {
            class11.field186 = 0;
            class212.field3196 = 0;
            class218.field3386 = arg4;
            class284.field4553 = arg4;
            class174.field2460 = arg3;
            class39.field590 = arg3;
            class154.field2132 = this;
            class47.field684 = arg1;
            class31.field469 = new Frame();
            class31.field469.setTitle("Jagex");
            class31.field469.setResizable(true);
            if (arg5) {
                field227 = 28;
            }
            class31.field469.addWindowListener(this);
            class31.field469.setVisible(true);
            class31.field469.toFront();
            Insets var9 = class31.field469.getInsets();
            class31.field469.setSize(var9.right + var9.left + class284.field4553, class39.field590 + var9.bottom - -var9.top);
            class231.field3609 = class45.field667 = new class52((Applet) null, arg0, arg2, arg7);
            class286 var10 = class45.field667.method325((byte) -79, this, 1);
            while (var10.field4570 == 0) {
                class17.method116(127, 10L);
            }
        } catch (Exception var12) {
            class121.method780(160, (String) null, var12);
        }
        field249++;
    }

    @OriginalMember(owner = "client!ml", name = "stop", descriptor = "()V")
    public final void stop() {
        field241++;
        if (class154.field2132 == this && !client.field4862) {
            class211.field3184 = class299.method2006(9594) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ml", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field229++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lam;ZII)V")
    public static final void method91(class314 arg0, boolean arg1, int arg2, int arg3) {
        if ((arg2 & 0x10) != 0) {
            arg0.field4125 = class131.field1830.method1380((byte) 45);
            arg0.field4132 = class131.field1830.method1373(2);
        }
        field228++;
        if ((arg2 & 0x4) != 0) {
            int var4 = class131.field1830.method1366(255);
            byte[] var5 = new byte[var4];
            class215 var6 = new class215(var5);
            class131.field1830.method1357(var5, 128, 0, var4);
            class227.field3546[arg3] = var6;
            arg0.method2118(var6, 14706, arg3);
        }
        if ((arg2 & 0x8) != 0) {
            int var7 = class131.field1830.method1347(!arg1);
            int var8 = class131.field1830.method1366(255);
            arg0.method1677(class35.field533, var8, var7, -1854);
            arg0.field4076 = class35.field533 + 300;
            arg0.field4056 = class131.field1830.method1377(25190);
        }
        if ((arg2 & 0x800) != 0) {
            int var9 = class131.field1830.method1390(28203);
            int[] var10 = new int[var9];
            int[] var11 = new int[var9];
            int[] var12 = new int[var9];
            for (int var13 = 0; var13 < var9; var13++) {
                int var14 = class131.field1830.method1373(2);
                if (var14 == 65535) {
                    var14 = -1;
                }
                var10[var13] = var14;
                var11[var13] = class131.field1830.method1374((byte) -60);
                var12[var13] = class131.field1830.method1379(-123);
            }
            class275.method1789(var11, arg0, arg1, var10, var12);
        }
        if ((arg2 & 0x400) != 0) {
            int var15 = class131.field1830.method1347(!arg1);
            int var16 = class131.field1830.method1390(28203);
            arg0.method1677(class35.field533, var16, var15, -1854);
        }
        if ((arg2 & 0x40) != 0) {
            arg0.field4074 = class131.field1830.method1376(-11);
            if (arg0.field4074.charAt(0) == '~') {
                arg0.field4074 = arg0.field4074.substring(1);
                class82.method524(2, (byte) 79, arg0.field4074, 0, arg0.method2117(102400, false), arg0.method2117(102400, true));
            } else if (class250.field3905 == arg0) {
                class82.method524(2, (byte) 79, arg0.field4074, 0, arg0.method2117(102400, false), arg0.method2117(102400, true));
            }
            arg0.field4109 = 150;
            arg0.field4040 = 0;
            arg0.field4115 = 0;
        }
        if ((arg2 & 0x80) != 0) {
            int var17 = class131.field1830.method1380((byte) 45);
            int var18 = class131.field1830.method1374((byte) -60);
            int var19 = class131.field1830.method1390(28203);
            int var20 = class131.field1830.field3280;
            boolean var21 = (var17 & 0x8000) != 0;
            if (arg0.field5053 != null && arg0.field5066 != null) {
                boolean var22 = false;
                if (var18 <= 1) {
                    if (!var21 && (class225.field3527 && !class103.field1477 || class164.field2322)) {
                        var22 = true;
                    } else if (class225.method1487(arg0.field5053, (byte) -128)) {
                        var22 = true;
                    }
                }
                if (!var22 && class241.field3791 == 0) {
                    class235.field3665.field3280 = 0;
                    class131.field1830.method1388(var19, 0, true, class235.field3665.field3287);
                    class235.field3665.field3280 = 0;
                    int var23 = -1;
                    String var24;
                    if (var21) {
                        var17 &= 0x7FFF;
                        class98 var25 = class108.method689((byte) -83, class235.field3665);
                        var23 = var25.field1428;
                        var24 = var25.field1424.method32((byte) -99, class235.field3665);
                    } else {
                        var24 = class33.method226(class224.method1483(class227.method1502(32767, class235.field3665), true));
                    }
                    arg0.field4074 = var24.trim();
                    arg0.field4040 = var17 & 0xFF;
                    arg0.field4109 = 150;
                    int var26;
                    if (var18 == 1 || var18 == 2) {
                        var26 = var21 ? 17 : 1;
                    } else {
                        var26 = var21 ? 17 : 2;
                    }
                    arg0.field4115 = var17 >> 8;
                    if (var18 == 2) {
                        class233.method1530((String) null, var24, var23, "<img=1>" + arg0.method2117(102400, true), 0, (byte) -51, var26, "<img=1>" + arg0.method2117(102400, false));
                    } else if (var18 == 1) {
                        class233.method1530((String) null, var24, var23, "<img=0>" + arg0.method2117(102400, true), 0, (byte) -51, var26, "<img=0>" + arg0.method2117(102400, false));
                    } else {
                        class233.method1530((String) null, var24, var23, arg0.method2117(102400, true), 0, (byte) -51, var26, arg0.method2117(102400, false));
                    }
                }
            }
            class131.field1830.field3280 = var19 + var20;
        }
        if ((arg2 & 0x2) != 0) {
            int var27 = class131.field1830.method1373(2);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var28 = class131.field1830.method1366(255);
            class69.method465(arg0, var28, -2, var27);
        }
        if ((arg2 & 0x100) != 0) {
            int var29 = class131.field1830.method1353((byte) 114);
            int var30 = class131.field1830.method1348((byte) -75);
            boolean var31 = true;
            if (var29 == 65535) {
                var29 = -1;
            }
            if (var29 != -1 && arg0.field4073 != -1 && class280.method1815(class291.method1952(0, var29).field2375, -62).field2992 < class280.method1815(class291.method1952(0, arg0.field4073).field2375, 92).field2992) {
                var31 = false;
            }
            if (var31) {
                arg0.field4086 = 0;
                arg0.field4098 = var30 >> 16;
                arg0.field4073 = var29;
                arg0.field4116 = 1;
                arg0.field4100 = (var30 & 0xFFFF) + class35.field533;
                arg0.field4123 = 0;
                if (class35.field533 < arg0.field4100) {
                    arg0.field4086 = -1;
                }
                if (arg0.field4073 != -1 && class35.field533 == arg0.field4100) {
                    int var32 = class291.method1952(0, arg0.field4073).field2375;
                    if (var32 != -1) {
                        class195 var33 = class280.method1815(var32, 100);
                        if (var33 != null && var33.field2989 != null) {
                            class181.method1152(class250.field3905 == arg0, arg0.field4081, 0, arg0.field4140, false, var33);
                        }
                    }
                }
            }
        }
        if (arg1) {
            field253 = 103;
        }
        if ((arg2 & 0x1) != 0) {
            arg0.field4047 = class131.field1830.method1373(2);
            if (arg0.field4047 == 65535) {
                arg0.field4047 = -1;
            }
        }
        if ((arg2 & 0x200) == 0) {
            return;
        }
        arg0.field4071 = class131.field1830.method1377(25190);
        arg0.field4036 = class131.field1830.method1390(28203);
        arg0.field4061 = class131.field1830.method1390(28203);
        arg0.field4084 = class131.field1830.method1390(28203);
        arg0.field4037 = class131.field1830.method1373(2) + class35.field533;
        arg0.field4082 = class131.field1830.method1379(-104) + class35.field533;
        arg0.field4101 = class131.field1830.method1377(25190);
        arg0.field4064 = 1;
        arg0.field4046 = 0;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)V")
    private final void method92(byte arg0) {
        field251++;
        long var2 = class299.method2006(9594);
        int var4 = 48 % ((arg0 - 16) / 56);
        long var5 = class53.field751[class104.field1502];
        class53.field751[class104.field1502] = var2;
        if (var5 != 0L && var5 < var2) {
            int var7 = (int) (var2 - var5);
            class15.field266 = ((var7 >> 1) + 32000) / var7;
        }
        class104.field1502 = class104.field1502 + 1 & 0x1F;
        if (class197.field3019++ > 50) {
            class197.field3019 -= 50;
            class292.field4665 = true;
            class291.field4645.setSize(class218.field3386, class174.field2460);
            class291.field4645.setVisible(true);
            if (class31.field469 != null && class43.field653 == null) {
                Insets var8 = class31.field469.getInsets();
                class291.field4645.setLocation(var8.left + class11.field186, var8.top - -class212.field3196);
            } else {
                class291.field4645.setLocation(class11.field186, class212.field3196);
            }
        }
        this.method94((byte) -12);
    }

    @OriginalMember(owner = "client!ml", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class306.field4930 = false;
        field236++;
    }

    @OriginalMember(owner = "client!ml", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V")
    public final void method93(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field247++;
        try {
            if (class154.field2132 == null) {
                class212.field3196 = 0;
                class154.field2132 = this;
                class47.field684 = arg2;
                if (arg1 != -1) {
                    this.paint((Graphics) null);
                }
                class174.field2460 = arg3;
                class39.field590 = arg3;
                class11.field186 = 0;
                class218.field3386 = arg0;
                class284.field4553 = arg0;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class45.field667 == null) {
                    class231.field3609 = class45.field667 = new class52(this, arg4, (String) null, 0);
                }
                class286 var7 = class45.field667.method325((byte) -102, this, 1);
                while (var7.field4570 == 0) {
                    class17.method116(arg1 + 118, 10L);
                }
            } else {
                class96.field1391++;
                if (class96.field1391 >= 3) {
                    this.method87("alreadyloaded", false);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class121.method780(160, (String) null, var9);
            this.method87("crash", false);
        }
    }

    @OriginalMember(owner = "client!ml", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field243++;
        if (class154.field2132 != this || client.field4862) {
            return;
        }
        class292.field4665 = true;
        if (class109.field1560 && class299.method2006(9594) - class159.field2219 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class284.field4553 <= var2.width && class39.field590 <= var2.height) {
                class197.field3020 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(B)V")
    public abstract void method94(byte arg0);

    @OriginalMember(owner = "client!ml", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field225++;
        if (class31.field469 == null) {
            return class45.field667 == null || class45.field667.field744 == this ? super.getCodeBase() : class45.field667.field744.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "providesignlink", descriptor = "(Lfk;)V")
    public static final void providesignlink(class52 arg0) {
        class45.field667 = arg0;
        class231.field3609 = arg0;
        field223++;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
    public abstract void method95(int arg0);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)Lim;")
    public static final class178 method96(int arg0, int arg1, int arg2) {
        field222++;
        class178 var3 = class166.method1057(109, arg1);
        if (arg0 == arg2) {
            return var3;
        } else if (var3 == null || var3.field2642 == null || arg2 >= var3.field2642.length) {
            return null;
        } else {
            return var3.field2642[arg2];
        }
    }

    @OriginalMember(owner = "client!ml", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field232++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ml", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field252++;
        if (class31.field469 == null) {
            return class45.field667 == null || class45.field667.field744 == this ? super.getAppletContext() : class45.field667.field744.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
    public static final void method97(int arg0, int arg1) {
        class39 var2 = class149.method935(-101, arg0, 9);
        if (arg1 <= -60) {
            var2.method268((byte) -19);
            field246++;
        }
    }

    @OriginalMember(owner = "client!ml", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field239++;
        if (class154.field2132 == this && !client.field4862) {
            class211.field3184 = class299.method2006(9594);
            class17.method116(-71, 5000L);
            class231.field3609 = null;
            this.method102((byte) 101, false);
        }
    }

    @OriginalMember(owner = "client!ml", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field242++;
        class306.field4930 = true;
        class292.field4665 = true;
    }

    @OriginalMember(owner = "client!ml", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field216++;
    }

    @OriginalMember(owner = "client!ml", name = "start", descriptor = "()V")
    public final void start() {
        field240++;
        if (class154.field2132 == this && !client.field4862) {
            class211.field3184 = 0L;
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
    public final void method98(int arg0) {
        if (arg0 > -64) {
            return;
        }
        field219++;
        if (this.field230) {
            return;
        }
        try {
            class286 var2 = class45.field667.method327(20, class154.field2132.getClass());
            while (var2.field4570 == 0) {
                class17.method116(101, 100L);
            }
            if (var2.field4567 != null) {
                throw (Throwable) var2.field4567;
            }
            jagmisc.init();
            this.field230 = true;
            class157.field2162 = class39.method262(106);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!ml", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field214++;
        if (class31.field469 == null) {
            return class45.field667 == null || class45.field667.field744 == this ? super.getParameter(arg0) : class45.field667.field744.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(B)V")
    public abstract void method99(byte arg0);

    @OriginalMember(owner = "client!ml", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field220++;
    }

    @OriginalMember(owner = "client!ml", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field215++;
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(B)Z")
    public final boolean method100(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field244++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            int var3 = 37 / ((82 - arg0) / 41);
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method87("invalidhost", false);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field238++;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
    private final void method101(int arg0) {
        field248++;
        long var2 = class213.field3208[class138.field1885];
        long var4 = class299.method2006(9594);
        class213.field3208[class138.field1885] = var4;
        class138.field1885 = class138.field1885 + 1 & 0x1F;
        synchronized (this) {
            if (arg0 != 13300) {
                this.paint((Graphics) null);
            }
            class75.field1050 = class306.field4930;
        }
        boolean var10000;
        if (var2 == 0L || var4 <= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        this.method85((byte) 85);
    }

    @OriginalMember(owner = "client!ml", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field245++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BZ)V")
    private final void method102(byte arg0, boolean arg1) {
        field250++;
        synchronized (this) {
            if (client.field4862) {
                return;
            }
            if (arg0 != 101) {
                field253 = -125;
            }
            client.field4862 = true;
        }
        if (class45.field667.field744 != null) {
            class45.field667.field744.destroy();
        }
        try {
            this.method99((byte) 7);
        } catch (Exception var10) {
        }
        if (this.field230) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field230 = false;
        }
        class45.field667.method323(class154.field2132.getClass(), false);
        if (class291.field4645 != null) {
            try {
                class291.field4645.removeFocusListener(this);
                class291.field4645.getParent().remove(class291.field4645);
            } catch (Exception var8) {
            }
        }
        if (class45.field667 != null) {
            try {
                class45.field667.method317(79);
            } catch (Exception var7) {
            }
        }
        this.method103((byte) 114);
        if (class31.field469 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "(B)V")
    public abstract void method103(byte arg0);
}
