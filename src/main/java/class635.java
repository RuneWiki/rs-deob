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

@OriginalClass("client!qf")
public abstract class class635 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Z")
    private boolean field9126 = false;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "Z")
    private boolean field9129 = false;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "[I")
    public static int[] field9130 = new int[1];

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "Ljava/lang/String;")
    public static String field9133 = null;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field9116;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field9118;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field9121;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field9128;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field9135;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    public static int field9139;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field9141;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public static int field9142;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public static int field9144;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field9145;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field9148;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public static int field9149;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field9150;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field9151;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field9152;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field9153;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field9158;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public static int field9161;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "I")
    public static int field9165;

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!qf", name = "ab", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!qf", name = "bb", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!qf", name = "cb", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Lqfa;")
    public static class85 field9123;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qf", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field9155;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "Z")
    public static boolean field9156;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "Z")
    public static boolean field9157;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "Z")
    public static boolean field9160;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "Z")
    public static boolean field9162;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "Z")
    public static boolean field9163;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "Z")
    public static boolean field9164;

    @OriginalMember(owner = "client!qf", name = "db", descriptor = "Z")
    public static boolean field9170;

    @OriginalMember(owner = "client!qf", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field9125++;
        if (class369.field5463 == this && !class377.field5601) {
            class574.field8344 = class525.method3074((byte) -101);
            class185.method1354(5000L, 10);
            class261.field3838 = null;
            this.method3624(true, false);
        }
    }

    @OriginalMember(owner = "client!qf", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        class416.field6017 = arg0;
        field9154++;
    }

    @OriginalMember(owner = "client!qf", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field9122++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public abstract void method1806(byte arg0);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Ljava/lang/String;")
    public String method1809(int arg0) {
        if (arg0 == 100) {
            field9145++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIZBILjava/lang/String;I)V")
    public final void method3617(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5, String arg6, int arg7) {
        try {
            class369.field5463 = this;
            class496.field7073 = arg0;
            class310.field4626 = arg5;
            class193.field3033 = arg5;
            class139.field2459 = 0;
            class506.field7173 = arg7;
            class513.field7237 = arg7;
            class537.field7520 = null;
            class594.field8553 = 0;
            class112.field2017 = new Frame();
            class112.field2017.setTitle("Jagex");
            class112.field2017.setResizable(true);
            class112.field2017.addWindowListener(this);
            class112.field2017.setVisible(true);
            class112.field2017.toFront();
            Insets var9 = class112.field2017.getInsets();
            class112.field2017.setSize(class513.field7237 + var9.left + var9.right, class193.field3033 + var9.top + var9.bottom);
            class261.field3838 = class604.field8775 = new class17(arg2, arg6, arg1, true);
            class456 var10 = class604.field8775.method400(1, this, false);
            if (arg4 != -28) {
                this.init();
            }
            while (var10.field6502 == 0) {
                class185.method1354(10L, 10);
            }
        } catch (Exception var12) {
            class374.method2357(null, 101, var12);
        }
        field9140++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lfda;I)I")
    public static final int method3618(class294 arg0, int arg1) {
        if (arg1 != 1) {
            return -98;
        }
        field9138++;
        if (class610.field8884 == arg0) {
            return 6407;
        } else if (class121.field2214 == arg0) {
            return 6408;
        } else if (class410.field5938 == arg0) {
            return 6406;
        } else if (class101.field1782 == arg0) {
            return 6409;
        } else if (class288.field4304 == arg0) {
            return 6410;
        } else if (class364.field5413 == arg0) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qf", name = "start", descriptor = "()V")
    public final void start() {
        field9118++;
        if (class369.field5463 == this && !class377.field5601) {
            class574.field8344 = 0L;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)Z")
    public final boolean method3619(int arg0) {
        field9146++;
        if (arg0 != 14288) {
            field9123 = null;
        }
        return class251.method1681("jagmisc", arg0 ^ 0x369E);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3620(String arg0, int arg1) {
        field9135++;
        if (class396.field5780 == null) {
            return;
        }
        class675.field9600++;
        class275 var2 = class185.method1355(0, class284.field4225, class395.field5772);
        var2.field4103.method693((byte) 106, class511.method3019(arg0, arg1 ^ 0xFFFFFFAD));
        var2.field4103.method750(115, arg0);
        if (arg1 != 1) {
            provideLoaderApplet(null);
        }
        class140.method1141(var2, arg1 + 19320);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
    public abstract void method1820(byte arg0);

    @OriginalMember(owner = "client!qf", name = "stop", descriptor = "()V")
    public final void stop() {
        field9127++;
        if (class369.field5463 == this && !class377.field5601) {
            class574.field8344 = class525.method3074((byte) -101) + 4000L;
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)Z")
    public final boolean method3621(int arg0) {
        if (arg0 == -1) {
            field9150++;
            return class251.method1681("jaclib", arg0 + 335);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field9120++;
        if (class369.field5463 != this || class377.field5601) {
            return;
        }
        class153.field2605 = true;
        if (class653.field9407 && (class525.method3074((byte) -101) - class540.field7559) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class513.field7237 && var2.height >= class193.field3033) {
                class183.field2940 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field9116++;
        class430.field6220 = true;
        class153.field2605 = true;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)V")
    public static void method3622(byte arg0) {
        field9123 = null;
        field9133 = null;
        if (arg0 == -106) {
            field9130 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZIIIIIIILr;)V")
    public static final void method3623(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class167 arg8) {
        if (arg0) {
            return;
        }
        field9151++;
        class83 var9 = (class83) class264.method1729(arg4, arg6, arg5);
        if (var9 != null) {
            class56 var10 = class237.field3521.method3515(var9.method841((byte) 52), 50);
            int var11 = var9.method846((byte) -105) & 0x3;
            int var12 = var9.method844((byte) -108);
            if (var10.field1233 == -1) {
                int var13 = arg3;
                if (var10.field1290 > 0) {
                    var13 = arg7;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg8.method1272((byte) 77, arg2, 4, var13, arg1);
                    } else if (var11 == 1) {
                        arg8.method1270(arg2, var13, 4, (byte) -32, arg1);
                    } else if (var11 == 2) {
                        arg8.method1272((byte) 88, arg2 + 3, 4, var13, arg1);
                    } else if (var11 == 3) {
                        arg8.method1270(arg2, var13, 4, (byte) -32, arg1 + 3);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg8.method1267(arg1, 1, 1, 1, arg2, var13);
                    } else if (var11 == 1) {
                        arg8.method1267(arg1, 1, 1, 1, arg2 + 3, var13);
                    } else if (var11 == 2) {
                        arg8.method1267(arg1 + 3, 1, 1, 1, arg2 + 3, var13);
                    } else if (var11 == 3) {
                        arg8.method1267(arg1 + 3, 1, 1, 1, arg2, var13);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg8.method1270(arg2, var13, 4, (byte) -32, arg1);
                    } else if (var11 == 1) {
                        arg8.method1272((byte) 112, arg2 + 3, 4, var13, arg1);
                    } else if (var11 == 2) {
                        arg8.method1270(arg2, var13, 4, (byte) -32, arg1 + 3);
                    } else if (var11 == 3) {
                        arg8.method1272((byte) 41, arg2, 4, var13, arg1);
                    }
                }
            } else {
                class629.method3602(7427, arg1, var11, var10, arg2, arg8);
            }
        }
        class83 var14 = (class83) class63.method756(arg4, arg6, arg5, field9155 == null ? (field9155 = method3631("qu")) : field9155);
        if (var14 != null) {
            class56 var15 = class237.field3521.method3515(var14.method841((byte) 52), 50);
            int var16 = var14.method846((byte) -105) & 0x3;
            int var17 = var14.method844((byte) 106);
            if (var15.field1233 != -1) {
                class629.method3602(7427, arg1, var16, var15, arg2, arg8);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field1290 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg8.method1263(arg2 + 3, 256, arg1, arg1 + 3, arg2, var18);
                } else {
                    arg8.method1263(arg2 + 3, 256, arg1 + 3, arg1, arg2, var18);
                }
            }
        }
        class83 var19 = (class83) class697.method3897(arg4, arg6, arg5);
        if (var19 == null) {
            return;
        }
        class56 var20 = class237.field3521.method3515(var19.method841((byte) 52), 50);
        int var21 = var19.method846((byte) -105) & 0x3;
        if (var20.field1233 != -1) {
            class629.method3602(7427, arg1, var21, var20, arg2, arg8);
            return;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZZ)V")
    private final void method3624(boolean arg0, boolean arg1) {
        field9142++;
        synchronized (this) {
            if (class377.field5601) {
                return;
            }
            class377.field5601 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class416.field6017 != null) {
            class416.field6017.destroy();
        }
        try {
            this.method1805(25736);
        } catch (Exception var9) {
        }
        if (this.field9126) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field9126 = false;
        }
        class541.method3122(arg0, -48);
        class494.method2960(0);
        if (class699.field9853 != null) {
            try {
                class699.field9853.removeFocusListener(this);
                class699.field9853.getParent().remove(class699.field9853);
            } catch (Exception var7) {
            }
        }
        if (class604.field8775 != null) {
            try {
                class604.field8775.method407(0);
            } catch (Exception var6) {
            }
        }
        this.method1810(107);
        if (class112.field2017 != null) {
            class112.field2017.setVisible(false);
            class112.field2017.dispose();
            class112.field2017 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)V")
    public abstract void method1812(byte arg0);

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V")
    public static final void method3625(int arg0) {
        field9139++;
        for (int var1 = 0; var1 < class517.field7301.length; var1++) {
            for (int var3 = 0; var3 < class517.field7301[0].length; var3++) {
                for (int var4 = 0; var4 < class517.field7301[0][0].length; var4++) {
                    class517.field7301[var1][var3][var4] = 0;
                }
            }
        }
        int var2 = 119 / ((arg0 - 65) / 45);
    }

    @OriginalMember(owner = "client!qf", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field9141++;
        if (class112.field2017 == null) {
            return class416.field6017 == null || class416.field6017 == this ? super.getParameter(arg0) : class416.field6017.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V")
    private final void method3626(int arg0) {
        field9121++;
        long var2 = class525.method3074((byte) -101);
        long var4 = class168.field2822[class269.field4006];
        class168.field2822[class269.field4006] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class269.field4006 = arg0 & class269.field4006 + 1;
        synchronized (this) {
            class533.field7479 = class430.field6220;
        }
        this.method1812((byte) -125);
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(B)V")
    public synchronized void method1829(byte arg0) {
        field9137++;
        if (class699.field9853 != null) {
            class699.field9853.removeFocusListener(this);
            class699.field9853.getParent().setBackground(Color.black);
            class699.field9853.getParent().remove(class699.field9853);
        }
        int var2 = -33 % ((29 - arg0) / 49);
        Container var3;
        if (class413.field5977 != null) {
            var3 = class413.field5977;
        } else if (class112.field2017 != null) {
            var3 = class112.field2017;
        } else if (class416.field6017 == null) {
            var3 = class369.field5463;
        } else {
            var3 = class416.field6017;
        }
        var3.setLayout(null);
        class699.field9853 = new class420(this);
        var3.add(class699.field9853);
        class699.field9853.setSize(class506.field7173, class310.field4626);
        class699.field9853.setVisible(true);
        if (class112.field2017 == var3) {
            Insets var4 = class112.field2017.getInsets();
            class699.field9853.setLocation(class594.field8553 + var4.left, class139.field2459 + var4.top);
        } else {
            class699.field9853.setLocation(class594.field8553, class139.field2459);
        }
        class699.field9853.addFocusListener(this);
        class699.field9853.requestFocus();
        class430.field6220 = true;
        class533.field7479 = true;
        class153.field2605 = true;
        class183.field2940 = false;
        class540.field7559 = class525.method3074((byte) -101);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    private final void method3627(boolean arg0) {
        field9128++;
        if (arg0) {
            this.getParameter(null);
        }
        long var2 = class525.method3074((byte) -101);
        long var4 = class238.field3525[class659.field9502];
        class238.field3525[class659.field9502] = var2;
        class659.field9502 = class659.field9502 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class349.field5192 = ((var6 >> 1) + 32000) / var6;
        }
        if (class678.field9629++ > 50) {
            class678.field9629 -= 50;
            class153.field2605 = true;
            class699.field9853.setSize(class506.field7173, class310.field4626);
            class699.field9853.setVisible(true);
            if (class112.field2017 != null && class413.field5977 == null) {
                Insets var7 = class112.field2017.getInsets();
                class699.field9853.setLocation(var7.left + class594.field8553, var7.top - -class139.field2459);
            } else {
                class699.field9853.setLocation(class594.field8553, class139.field2459);
            }
        }
        this.method1806((byte) -4);
    }

    @OriginalMember(owner = "client!qf", name = "run", descriptor = "()V")
    public final void run() {
        field9149++;
        try {
            if (class17.field778 != null) {
                String var1 = class17.field778.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class17.field793;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method3629("wrongjava", (byte) -60);
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class17.field793 == null || class17.field793.equals("1.4.2"))) {
                    this.method3629("wrongjava", (byte) -60);
                    return;
                }
            }
            if (class17.field793 != null && class17.field793.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class17.field793.length()) {
                    char var5 = class17.field793.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var5 - (48 - var4 * 10);
                }
                if (var4 >= 5) {
                    class653.field9407 = true;
                }
            }
            Applet var6 = class369.field5463;
            if (class416.field6017 != null) {
                var6 = class416.field6017;
            }
            Method var7 = class17.field784;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class44.method573(116);
            class160.method1238(0);
            this.method1829((byte) 84);
            this.method1820((byte) -36);
            class358.field5340 = class623.method3555(512);
            while (class574.field8344 == 0L || class525.method3074((byte) -101) < class574.field8344) {
                class50.field1182 = class358.field5340.method2391(0, class260.field3821);
                for (int var8 = 0; var8 < class50.field1182; var8++) {
                    this.method3626(31);
                }
                this.method3627(false);
                class285.method1891(-17749, class699.field9853, class604.field8775);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class374.method2357(this.method1809(100), 106, var20);
            this.method3629("crash", (byte) -60);
        } finally {
            Object var13 = null;
            this.method3624(true, true);
        }
    }

    @OriginalMember(owner = "client!qf", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field9147++;
    }

    @OriginalMember(owner = "client!qf", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field9148++;
        if (class112.field2017 == null) {
            return class416.field6017 == null || class416.field6017 == this ? super.getAppletContext() : class416.field6017.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field9136++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!qf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field9119++;
        class430.field6220 = false;
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
    public abstract void method1805(int arg0);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method3628(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9134++;
        try {
            if (class369.field5463 == null) {
                class496.field7073 = arg1;
                class537.field7520 = class416.field6017;
                class139.field2459 = 0;
                class594.field8553 = 0;
                class310.field4626 = arg3;
                class193.field3033 = arg3;
                class506.field7173 = arg2;
                class513.field7237 = arg2;
                class369.field5463 = this;
                class261.field3838 = class604.field8775 = new class17(arg6, arg0, arg4, class416.field6017 != null);
                if (arg5 < -127) {
                    class456 var8 = class604.field8775.method400(1, this, false);
                    while (var8.field6502 == 0) {
                        class185.method1354(10L, 10);
                    }
                }
            } else {
                class112.field2020++;
                if (class112.field2020 >= 3) {
                    this.method3629("alreadyloaded", (byte) -60);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class374.method2357(null, 104, var10);
            this.method3629("crash", (byte) -60);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method3629(String arg0, byte arg1) {
        field9143++;
        if (this.field9129) {
            return;
        }
        this.field9129 = true;
        System.out.println("error_game_" + arg0);
        try {
            class31.method507(13009, "loggedout", class416.field6017);
            if (arg1 != -60) {
                this.field9126 = false;
            }
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!qf", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field9152++;
    }

    @OriginalMember(owner = "client!qf", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field9131++;
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(B)Z")
    public final boolean method3630(byte arg0) {
        field9117++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else if (arg0 >= -15) {
            return false;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method3629("invalidhost", (byte) -60);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field9153++;
    }

    @OriginalMember(owner = "client!qf", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field9115++;
    }

    @OriginalMember(owner = "client!qf", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field9132++;
        if (class112.field2017 == null) {
            return class416.field6017 == null || class416.field6017 == this ? super.getDocumentBase() : class416.field6017.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)V")
    public abstract void method1810(int arg0);

    @OriginalMember(owner = "client!qf", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field9144++;
        if (class112.field2017 == null) {
            return class416.field6017 == null || class416.field6017 == this ? super.getCodeBase() : class416.field6017.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field9124++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3631(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
