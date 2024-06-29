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

@OriginalClass("client!wa")
public abstract class class265 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "Z")
    private boolean field4227 = false;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4214 = "slide:";

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "J")
    public static long field4212;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "Lhc;")
    public static class235 field4241;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "Z")
    public static boolean field4244;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public final synchronized void method1787(int arg0) {
        if (class230.field3651 != null) {
            class230.field3651.removeFocusListener(this);
            class230.field3651.getParent().remove(class230.field3651);
        }
        field4243++;
        Container var2;
        if (class39.field547 != null) {
            var2 = class39.field547;
        } else if (class47.field685 == null) {
            var2 = class179.field2788.field479;
        } else {
            var2 = class47.field685;
        }
        var2.setLayout((LayoutManager) null);
        if (arg0 != 10) {
            field4215 = -78;
        }
        class230.field3651 = new class201(this);
        var2.add(class230.field3651);
        class230.field3651.setSize(class29.field409, class79.field1310);
        class230.field3651.setVisible(true);
        if (class47.field685 == var2) {
            Insets var3 = class47.field685.getInsets();
            class230.field3651.setLocation(class87.field1457 + var3.left, class103.field1717 + var3.top);
        } else {
            class230.field3651.setLocation(class87.field1457, class103.field1717);
        }
        class230.field3651.addFocusListener(this);
        class230.field3651.requestFocus();
        class287.field4537 = true;
        class75.field1244 = true;
        class88.field1473 = true;
        class148.field2351 = false;
        class143.field2173 = class134.method924(false);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)Z")
    public final boolean method1788(int arg0) {
        field4238++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else if (arg0 == -4) {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1790((byte) -124, "invalidhost");
                return false;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIII)V")
    public final void method1789(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4239++;
        try {
            if (class157.field2441 == null) {
                class79.field1310 = arg0;
                client.field2439 = arg0;
                if (arg2 <= 53) {
                    this.start();
                }
                class157.field2441 = this;
                class29.field409 = arg1;
                class266.field4249 = arg1;
                class87.field1457 = 0;
                class198.field3124 = arg4;
                class103.field1717 = 0;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class179.field2788 == null) {
                    class84.field1415 = class179.field2788 = new class32(this, arg3, (String) null, 0);
                }
                class76 var7 = class179.field2788.method257(1, this, (byte) -13);
                while (var7.field1255 == 0) {
                    class150.method1011((byte) 41, 10L);
                }
            } else {
                class5.field80++;
                if (class5.field80 >= 3) {
                    this.method1790((byte) 27, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class168.method1130((String) null, var9, -105);
            this.method1790((byte) -122, "crash");
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    public abstract void method1048(int arg0);

    @OriginalMember(owner = "client!wa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field4230++;
    }

    @OriginalMember(owner = "client!wa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field4234++;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
    public abstract void method1043(int arg0);

    @OriginalMember(owner = "client!wa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class75.field1244 = true;
        field4242++;
        class88.field1473 = true;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method1790(byte arg0, String arg1) {
        field4222++;
        if (this.field4227) {
            return;
        }
        this.field4227 = true;
        System.out.println("error_game_" + arg1);
        try {
            class215.method1453(class179.field2788.field479, 110, "loggedout");
        } catch (Throwable var5) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
        int var3 = 24 % ((-arg0 - 42) / 60);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLhc;)V")
    public static final void method1791(byte arg0, class235 arg1) {
        field4240++;
        if (class250.field4036) {
            return;
        }
        class211.method1414();
        class45.field642 = class88.method674(-64, arg1, class248.field4008);
        int var2 = class79.field1310;
        int var3 = var2 * 956 / 503;
        class45.field642.method845((class29.field409 - var3) / 2, 0, var3, var2);
        int var4 = 42 % ((49 - arg0) / 44);
        class170.field2646 = class238.method1635(class22.field312, arg1, (byte) 118);
        class170.field2646.method1296(class29.field409 / 2 - (class170.field2646.field2985 / 2), 18);
        class250.field4036 = true;
    }

    @OriginalMember(owner = "client!wa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field4210++;
        if (class157.field2441 != this || class223.field3417) {
            return;
        }
        class88.field1473 = true;
        if (class70.field1121 && class134.method924(false) - class143.field2173 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class266.field4249 && client.field2439 <= var2.height) {
                class148.field2351 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field4224++;
        if (class47.field685 == null) {
            return class179.field2788 == null || class179.field2788.field479 == this ? super.getCodeBase() : class179.field2788.field479.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class75.field1244 = false;
        field4213++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public abstract void method1051(byte arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIZILjava/lang/String;B)V")
    public final void method1792(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, String arg6, byte arg7) {
        try {
            class103.field1717 = 0;
            class29.field409 = arg5;
            class266.field4249 = arg5;
            class79.field1310 = arg1;
            client.field2439 = arg1;
            class198.field3124 = arg3;
            class157.field2441 = this;
            class87.field1457 = 0;
            class47.field685 = new Frame();
            class47.field685.setTitle("Jagex");
            class47.field685.setResizable(true);
            class47.field685.addWindowListener(this);
            class47.field685.setVisible(true);
            class47.field685.toFront();
            Insets var9 = class47.field685.getInsets();
            class47.field685.setSize(var9.right + var9.left + class266.field4249, client.field2439 - -var9.top + var9.bottom);
            class84.field1415 = class179.field2788 = new class32((Applet) null, arg0, arg6, arg2);
            class76 var10 = class179.field2788.method257(1, this, (byte) -13);
            while (var10.field1255 == 0) {
                class150.method1011((byte) 41, 10L);
            }
        } catch (Exception var12) {
            class168.method1130((String) null, var12, -112);
        }
        if (arg7 > -2) {
            this.focusGained((FocusEvent) null);
        }
        field4236++;
    }

    @OriginalMember(owner = "client!wa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field4219++;
        if (class47.field685 == null) {
            return class179.field2788 == null || class179.field2788.field479 == this ? super.getAppletContext() : class179.field2788.field479.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V")
    public abstract void method1055(int arg0);

    @OriginalMember(owner = "client!wa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field4208++;
    }

    @OriginalMember(owner = "client!wa", name = "start", descriptor = "()V")
    public final void start() {
        field4217++;
        if (class157.field2441 == this && !class223.field3417) {
            class69.field1118 = 0L;
        }
    }

    @OriginalMember(owner = "client!wa", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!wa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field4221++;
    }

    @OriginalMember(owner = "client!wa", name = "stop", descriptor = "()V")
    public final void stop() {
        field4225++;
        if (class157.field2441 == this && !class223.field3417) {
            class69.field1118 = class134.method924(false) + 4000L;
        }
    }

    @OriginalMember(owner = "client!wa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field4237++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLnj;)V")
    public static final void method1793(byte arg0, class144 arg1) {
        arg1.field2200 = false;
        if (arg1.field2250 != -1) {
            class30 var2 = class148.method996(arg0 - 201, arg1.field2250);
            if (var2 == null || var2.field439 == null) {
                arg1.field2250 = -1;
            } else {
                arg1.field2291++;
                if (var2.field439.length > arg1.field2212 && var2.field423[arg1.field2212] < arg1.field2291) {
                    arg1.field2287++;
                    arg1.field2212++;
                    arg1.field2291 = 1;
                    class52.method390(class283.field4473 == arg1, var2, arg1.field2212, arg0 ^ 0x3, arg1.field2278, arg1.field2240);
                }
                if (var2.field439.length <= arg1.field2212) {
                    arg1.field2291 = 0;
                    arg1.field2212 = 0;
                    class52.method390(class283.field4473 == arg1, var2, arg1.field2212, 127, arg1.field2278, arg1.field2240);
                }
                arg1.field2287 = arg1.field2212 + 1;
                if (var2.field439.length <= arg1.field2287) {
                    arg1.field2287 = 0;
                }
            }
        }
        if (arg1.field2299 != -1 && class192.field2978 >= arg1.field2236) {
            class238 var3 = class16.method158(arg1.field2299, true);
            int var4 = var3.field3852;
            if (var4 == -1) {
                arg1.field2299 = -1;
            } else {
                label299: {
                    class30 var5 = class148.method996(-122, var4);
                    if (var3.field3866) {
                        if (var5.field448 == 3) {
                            if (arg1.field2281 > 0 && class192.field2978 >= arg1.field2276 && class192.field2978 > arg1.field2294) {
                                arg1.field2299 = -1;
                                break label299;
                            }
                        } else if (var5.field448 == 1 && arg1.field2281 > 0 && class192.field2978 >= arg1.field2276 && class192.field2978 > arg1.field2294) {
                            arg1.field2236 = class192.field2978 + 1;
                            break label299;
                        }
                    }
                    if (var5 == null || var5.field439 == null) {
                        arg1.field2299 = -1;
                    } else {
                        if (arg1.field2289 < 0) {
                            arg1.field2289 = 0;
                            class52.method390(class283.field4473 == arg1, var5, 0, 111, arg1.field2278, arg1.field2240);
                        }
                        arg1.field2203++;
                        if (var5.field439.length > arg1.field2289 && arg1.field2203 > var5.field423[arg1.field2289]) {
                            arg1.field2203 = 1;
                            arg1.field2289++;
                            class52.method390(class283.field4473 == arg1, var5, arg1.field2289, 100, arg1.field2278, arg1.field2240);
                        }
                        if (arg1.field2289 >= var5.field439.length) {
                            if (var3.field3866) {
                                arg1.field2289 -= var5.field418;
                                arg1.field2300++;
                                if (arg1.field2300 >= var5.field446) {
                                    arg1.field2299 = -1;
                                } else if (arg1.field2289 >= 0 && var5.field439.length > arg1.field2289) {
                                    class52.method390(class283.field4473 == arg1, var5, arg1.field2289, 107, arg1.field2278, arg1.field2240);
                                } else {
                                    arg1.field2299 = -1;
                                }
                            } else {
                                arg1.field2299 = -1;
                            }
                        }
                        arg1.field2261 = arg1.field2289 + 1;
                        if (var5.field439.length <= arg1.field2261) {
                            if (var3.field3866) {
                                arg1.field2261 -= var5.field418;
                                if (var5.field446 <= arg1.field2300 + 1) {
                                    arg1.field2261 = -1;
                                } else if (arg1.field2261 < 0 || var5.field439.length <= arg1.field2261) {
                                    arg1.field2261 = -1;
                                }
                            } else {
                                arg1.field2261 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field2214 != -1 && arg1.field2239 <= 1) {
            class30 var6 = class148.method996(-46, arg1.field2214);
            if (var6.field448 == 3) {
                if (arg1.field2281 > 0 && class192.field2978 >= arg1.field2276 && arg1.field2294 < class192.field2978) {
                    arg1.field2214 = -1;
                }
            } else if (var6.field448 == 1 && arg1.field2281 > 0 && class192.field2978 >= arg1.field2276 && class192.field2978 > arg1.field2294) {
                arg1.field2239 = 1;
            }
        }
        if (arg0 != 122) {
            providesignlink((class32) null);
        }
        if (arg1.field2214 != -1 && arg1.field2239 == 0) {
            class30 var7 = class148.method996(arg0 - 242, arg1.field2214);
            if (var7 == null || var7.field439 == null) {
                arg1.field2214 = -1;
            } else {
                arg1.field2288++;
                if (arg1.field2199 < var7.field439.length && arg1.field2288 > var7.field423[arg1.field2199]) {
                    arg1.field2199++;
                    arg1.field2288 = 1;
                    class52.method390(class283.field4473 == arg1, var7, arg1.field2199, 102, arg1.field2278, arg1.field2240);
                }
                if (arg1.field2199 >= var7.field439.length) {
                    arg1.field2220++;
                    arg1.field2199 -= var7.field418;
                    if (arg1.field2220 >= var7.field446) {
                        arg1.field2214 = -1;
                    } else if (arg1.field2199 >= 0 && arg1.field2199 < var7.field439.length) {
                        class52.method390(class283.field4473 == arg1, var7, arg1.field2199, 103, arg1.field2278, arg1.field2240);
                    } else {
                        arg1.field2214 = -1;
                    }
                }
                arg1.field2296 = arg1.field2199 + 1;
                if (var7.field439.length <= arg1.field2296) {
                    arg1.field2296 -= var7.field418;
                    if (arg1.field2220 + 1 >= var7.field446) {
                        arg1.field2296 = -1;
                    } else if (arg1.field2296 < 0 || var7.field439.length <= arg1.field2296) {
                        arg1.field2296 = -1;
                    }
                }
                arg1.field2200 = var7.field429;
            }
        }
        if (arg1.field2239 > 0) {
            arg1.field2239--;
        }
        for (int var8 = 0; var8 < arg1.field2273.length; var8++) {
            class65 var9 = arg1.field2273[var8];
            if (var9 != null) {
                if (var9.field1097 > 0) {
                    var9.field1097--;
                } else {
                    class30 var10 = class148.method996(-107, var9.field1094);
                    if (var10 == null || var10.field439 == null) {
                        arg1.field2273[var8] = null;
                    } else {
                        var9.field1088++;
                        if (var9.field1095 < var10.field439.length && var9.field1088 > var10.field423[var9.field1095]) {
                            var9.field1088 = 1;
                            var9.field1095++;
                            class52.method390(class283.field4473 == arg1, var10, var9.field1095, 126, arg1.field2278, arg1.field2240);
                        }
                        if (var10.field439.length <= var9.field1095) {
                            var9.field1095 -= var10.field418;
                            var9.field1086++;
                            if (var10.field446 <= var9.field1086) {
                                arg1.field2273[var8] = null;
                            } else if (var9.field1095 >= 0 && var10.field439.length > var9.field1095) {
                                class52.method390(class283.field4473 == arg1, var10, var9.field1095, 121, arg1.field2278, arg1.field2240);
                            } else {
                                arg1.field2273[var8] = null;
                            }
                        }
                        var9.field1087 = var9.field1095 + 1;
                        if (var9.field1087 >= var10.field439.length) {
                            var9.field1087 -= var10.field418;
                            if ((var9.field1086 + 1) >= var10.field446) {
                                var9.field1087 = -1;
                            } else if (var9.field1087 < 0 || var10.field439.length <= var9.field1087) {
                                var9.field1087 = -1;
                            }
                        }
                    }
                }
            }
        }
        field4220++;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V")
    public abstract void method1045(byte arg0);

    @OriginalMember(owner = "client!wa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field4231++;
        if (class47.field685 == null) {
            return class179.field2788 == null || class179.field2788.field479 == this ? super.getParameter(arg0) : class179.field2788.field479.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4228++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V")
    public static void method1794(int arg0) {
        field4214 = null;
        if (arg0 != 0) {
            field4223 = 48;
        }
        field4241 = null;
    }

    @OriginalMember(owner = "client!wa", name = "providesignlink", descriptor = "(Lna;)V")
    public static final void providesignlink(class32 arg0) {
        field4218++;
        class179.field2788 = arg0;
        class84.field1415 = arg0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZB)V")
    private final void method1795(boolean arg0, byte arg1) {
        int var3 = 11 / ((arg1 - 82) / 33);
        field4216++;
        synchronized (this) {
            if (class223.field3417) {
                return;
            }
            class223.field3417 = true;
        }
        if (class179.field2788.field479 != null) {
            class179.field2788.field479.destroy();
        }
        try {
            this.method1043(86);
        } catch (Exception var10) {
        }
        if (class230.field3651 != null) {
            try {
                class230.field3651.removeFocusListener(this);
                class230.field3651.getParent().remove(class230.field3651);
            } catch (Exception var9) {
            }
        }
        if (class179.field2788 != null) {
            try {
                class179.field2788.method252(-12529);
            } catch (Exception var8) {
            }
        }
        this.method1048(11492);
        if (class47.field685 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!wa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field4232++;
    }

    @OriginalMember(owner = "client!wa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field4207++;
        if (class47.field685 == null) {
            return class179.field2788 == null || class179.field2788.field479 == this ? super.getDocumentBase() : class179.field2788.field479.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field4209++;
        if (class157.field2441 == this && !class223.field3417) {
            class69.field1118 = class134.method924(false);
            class150.method1011((byte) 41, 5000L);
            class84.field1415 = null;
            this.method1795(false, (byte) -41);
        }
    }

    @OriginalMember(owner = "client!wa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field4226++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
    private final void method1796(boolean arg0) {
        field4235++;
        long var2 = class134.method924(false);
        if (!arg0) {
            return;
        }
        long var4 = class83.field1396[class100.field1673];
        class83.field1396[class100.field1673] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class106.field1771 = ((var6 >> 1) + 32000) / var6;
        }
        class100.field1673 = class100.field1673 + 1 & 0x1F;
        if (class125.field1979++ > 50) {
            class125.field1979 -= 50;
            class88.field1473 = true;
            class230.field3651.setSize(class29.field409, class79.field1310);
            class230.field3651.setVisible(true);
            if (class47.field685 != null && class39.field547 == null) {
                Insets var7 = class47.field685.getInsets();
                class230.field3651.setLocation(var7.left + class87.field1457, class103.field1717 + var7.top);
            } else {
                class230.field3651.setLocation(class87.field1457, class103.field1717);
            }
        }
        this.method1055(40);
    }

    @OriginalMember(owner = "client!wa", name = "run", descriptor = "()V")
    public final void run() {
        field4211++;
        try {
            if (class32.field484 != null) {
                String var1 = class32.field484.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class32.field476;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1790((byte) 94, "wrongjava");
                        return;
                    }
                    class61.field1052 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class32.field476 == null || class32.field476.equals("1.4.2"))) {
                    this.method1790((byte) 26, "wrongjava");
                    return;
                }
            }
            if (class32.field476 != null && class32.field476.startsWith("1.")) {
                int var3 = 0;
                for (int var4 = 2; class32.field476.length() > var4; var4++) {
                    char var5 = class32.field476.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3 = var3 * 10 + var5 - 48;
                }
                if (var3 >= 5) {
                    class70.field1121 = true;
                }
            }
            if (class179.field2788.field479 != null) {
                Method var6 = class32.field485;
                if (var6 != null) {
                    try {
                        var6.invoke(class179.field2788.field479, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class56.method429(-733);
            this.method1787(10);
            class249.field4023 = class87.method618((byte) -115, class79.field1310, class230.field3651, class29.field409);
            this.method1051((byte) -10);
            class160.field2499 = class203.method1370(-31440);
            while (class69.field1118 == 0L || class134.method924(false) < class69.field1118) {
                class127.field2009 = class160.field2499.method353(2, class61.field1052, class192.field2974);
                for (int var7 = 0; var7 < class127.field2009; var7++) {
                    this.method1797(false);
                }
                this.method1796(true);
                class2.method9(-38, class230.field3651, class179.field2788);
            }
        } catch (Exception var10) {
            class168.method1130((String) null, var10, -103);
            this.method1790((byte) -112, "crash");
        }
        this.method1795(true, (byte) 31);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)V")
    private final void method1797(boolean arg0) {
        long var2 = class134.method924(arg0);
        field4233++;
        long var4 = class84.field1425[class87.field1458];
        class84.field1425[class87.field1458] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class87.field1458 = class87.field1458 + 1 & 0x1F;
        synchronized (this) {
            class287.field4537 = class75.field1244;
        }
        this.method1045((byte) 122);
    }
}
