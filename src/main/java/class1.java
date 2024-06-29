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

@OriginalClass("client!n")
public abstract class class1 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!n", name = "v", descriptor = "Z")
    private boolean field22 = false;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "[S")
    public static short[] field6 = new short[] { 32, 37, 31, 44, 49, 2, 15, 22 };

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lsc;")
    public static class181 field8 = class149.method967(255, "::fps ");

    @OriginalMember(owner = "client!n", name = "d", descriptor = "[Llh;")
    public static class43[] field4 = new class43[50];

    @OriginalMember(owner = "client!n", name = "J", descriptor = "Z")
    public static boolean field36 = false;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field5 = 0;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Lsc;")
    public static class181 field14 = class149.method967(255, ":");

    @OriginalMember(owner = "client!n", name = "l", descriptor = "[[I")
    public static int[][] field12 = new int[104][104];

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "J")
    public static long field38;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "Z")
    public static boolean field43;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "Z")
    public static boolean field44;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "Z")
    public static boolean field45;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "[[[B")
    public static byte[][][] field29;

    @OriginalMember(owner = "client!n", name = "run", descriptor = "()V")
    public final void run() {
        field40++;
        try {
            if (class142.field2287 != null) {
                String var1 = class142.field2287.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class142.field2295;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method4(116, "wrongjava");
                        return;
                    }
                    class21.field384 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class142.field2295 == null || class142.field2295.equals("1.4.2"))) {
                    this.method4(54, "wrongjava");
                    return;
                }
            }
            if (class224.field3870.field2285 != null) {
                Method var3 = class142.field2291;
                if (var3 != null) {
                    try {
                        var3.invoke(class224.field3870.field2285, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method13((byte) 75);
            class90.field1438 = class261.method1766(class143.field2321, class41.field620, class107.field1740, 0);
            this.method18(true);
            class2.field55 = class88.method588(1023);
            while (class163.field2785 == 0L || class213.method1414(-9292) < class163.field2785) {
                class186.field3295 = class2.field55.method31(54, class21.field384, class38.field584);
                for (int var4 = 0; var4 < class186.field3295; var4++) {
                    this.method1(-73);
                }
                this.method16((byte) 23);
                class228.method1498(0, class107.field1740, class224.field3870);
            }
        } catch (Exception var7) {
            class83.method565(var7, (String) null, 121);
            this.method4(61, "crash");
        }
        this.method17(false, true);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    private final void method1(int arg0) {
        field27++;
        long var2 = class213.method1414(-9292);
        long var4 = class164.field2790[class91.field1442];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class164.field2790[class91.field1442] = var2;
        int var6 = 118 % ((9 - arg0) / 35);
        class91.field1442 = class91.field1442 + 1 & 0x1F;
        synchronized (this) {
            class76.field1226 = class33.field540;
        }
        this.method10(2);
    }

    @OriginalMember(owner = "client!n", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field24++;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public abstract void method2(int arg0);

    @OriginalMember(owner = "client!n", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field16++;
    }

    @OriginalMember(owner = "client!n", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field39++;
        if (class43.field677 == null) {
            return class224.field3870 == null || class224.field3870.field2285 == this ? super.getAppletContext() : class224.field3870.field2285.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)Z")
    public final boolean method3(byte arg0) {
        field23++;
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
            } else if (arg0 == -87) {
                this.method4(66, "invalidhost");
                return false;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method4(int arg0, String arg1) {
        field11++;
        if (this.field22) {
            return;
        }
        this.field22 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
        if (arg0 <= 9) {
            field8 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "start", descriptor = "()V")
    public final void start() {
        field3++;
        if (class61.field924 == this && !class213.field3672) {
            class163.field2785 = 0L;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLeg;)V")
    public static final void method5(byte arg0, class157 arg1) {
        field42++;
        int var2 = arg1.field2677 - class237.field4125;
        if (arg1.field2626 == 0) {
            arg1.field2616 = 1024;
        }
        arg1.field2651 = 0;
        int var3 = arg1.field2666 * 128 + arg1.field2619 * 64;
        arg1.field2654 += (var3 - arg1.field2654) / var2;
        int var4 = arg1.field2646 * 128 + arg1.field2619 * 64;
        if (arg1.field2626 == 1) {
            arg1.field2616 = 1536;
        }
        arg1.field2681 += (var4 - arg1.field2681) / var2;
        if (arg0 != 86) {
            field29 = null;
        }
        if (arg1.field2626 == 2) {
            arg1.field2616 = 0;
        }
        if (arg1.field2626 == 3) {
            arg1.field2616 = 512;
        }
    }

    @OriginalMember(owner = "client!n", name = "stop", descriptor = "()V")
    public final void stop() {
        field37++;
        if (class61.field924 == this && !class213.field3672) {
            class163.field2785 = class213.method1414(-9292) + 4000L;
        }
    }

    @OriginalMember(owner = "client!n", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class33.field540 = true;
        class35.field543 = true;
        field2++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILre;I)V")
    public static final void method6(int arg0, class78 arg1, int arg2) {
        field19++;
        if (arg0 != 2) {
            return;
        }
        while (true) {
            class88 var3 = (class88) class203.field3485.method1686((byte) -83);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1398; var5++) {
                if (var3.field1394[var5] != null) {
                    if (var3.field1394[var5].field1933 == 2) {
                        var3.field1396[var5] = -5;
                    }
                    if (var3.field1394[var5].field1933 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1400[var5] != null) {
                    if (var3.field1400[var5].field1933 == 2) {
                        var3.field1396[var5] = -6;
                    }
                    if (var3.field1400[var5].field1933 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method541(arg2, 64);
            arg1.method1538(0, (byte) 87);
            int var6 = arg1.field3933;
            arg1.method1544(var3.field1407, -3165);
            for (int var7 = 0; var7 < var3.field1398; var7++) {
                if (var3.field1396[var7] == 0) {
                    try {
                        int var8 = var3.field1395[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field1394[var7].field1935;
                            int var13 = var12.getInt((Object) null);
                            arg1.method1538(0, (byte) 123);
                            arg1.method1544(var13, -3165);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field1394[var7].field1935;
                            var11.setInt((Object) null, var3.field1404[var7]);
                            arg1.method1538(0, (byte) 71);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field1394[var7].field1935;
                            int var10 = var9.getModifiers();
                            arg1.method1538(0, (byte) -59);
                            arg1.method1544(var10, -3165);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field1400[var7].field1935;
                            byte[][] var17 = var3.field1399[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg1.method1538(0, (byte) 77);
                            } else if (var21 instanceof Number) {
                                arg1.method1538(1, (byte) -118);
                                arg1.method1511(false, ((Number) var21).longValue());
                            } else if (var21 instanceof class181) {
                                arg1.method1538(2, (byte) 109);
                                arg1.method1550((class181) var21, 67);
                            } else {
                                arg1.method1538(4, (byte) 45);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field1400[var7].field1935;
                            int var15 = var14.getModifiers();
                            arg1.method1538(0, (byte) -64);
                            arg1.method1544(var15, -3165);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1538(-10, (byte) -76);
                    } catch (InvalidClassException var23) {
                        arg1.method1538(-11, (byte) 97);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1538(-12, (byte) -116);
                    } catch (OptionalDataException var25) {
                        arg1.method1538(-13, (byte) 90);
                    } catch (IllegalAccessException var26) {
                        arg1.method1538(-14, (byte) 81);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1538(-15, (byte) 126);
                    } catch (InvocationTargetException var28) {
                        arg1.method1538(-16, (byte) 119);
                    } catch (SecurityException var29) {
                        arg1.method1538(-17, (byte) -65);
                    } catch (IOException var30) {
                        arg1.method1538(-18, (byte) 126);
                    } catch (NullPointerException var31) {
                        arg1.method1538(-19, (byte) -95);
                    } catch (Exception var32) {
                        arg1.method1538(-20, (byte) 42);
                    } catch (Throwable var33) {
                        arg1.method1538(-21, (byte) 89);
                    }
                } else {
                    arg1.method1538(var3.field1396[var7], (byte) 51);
                }
            }
            arg1.method1506(var6, true);
            arg1.method1553(arg1.field3933 - var6, false);
            var3.method290((byte) -48);
        }
    }

    @OriginalMember(owner = "client!n", name = "providesignlink", descriptor = "(Lej;)V")
    public static final void providesignlink(class142 arg0) {
        field9++;
        class224.field3870 = arg0;
        class194.field3393 = arg0;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
    public static void method7(byte arg0) {
        field6 = null;
        field14 = null;
        field12 = null;
        field8 = null;
        field4 = null;
        if (arg0 != -108) {
            method5((byte) -17, (class157) null);
        }
        field29 = null;
    }

    @OriginalMember(owner = "client!n", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field28++;
        if (class43.field677 == null) {
            return class224.field3870 == null || class224.field3870.field2285 == this ? super.getParameter(arg0) : class224.field3870.field2285.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field15++;
        class33.field540 = false;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        try {
            class182.field3207 = 0;
            class41.field620 = arg4;
            class213.field3675 = arg4;
            class143.field2321 = arg0;
            class165.field2799 = arg0;
            class46.field730 = arg3;
            class140.field2261 = 0;
            if (arg1 != 15246) {
                this.getAppletContext();
            }
            class61.field924 = this;
            class43.field677 = new Frame();
            class43.field677.setTitle("Jagex");
            class43.field677.setResizable(true);
            class43.field677.addWindowListener(this);
            class43.field677.setVisible(true);
            class43.field677.toFront();
            Insets var8 = class43.field677.getInsets();
            class43.field677.setSize(class165.field2799 + var8.left + var8.right, var8.top + var8.bottom + class213.field3675);
            class194.field3393 = class224.field3870 = new class142(true, (Applet) null, arg6, arg5, arg2);
            class224.field3870.method918(1, 0, this);
        } catch (Exception var10) {
            class83.method565(var10, (String) null, 120);
        }
        field17++;
    }

    @OriginalMember(owner = "client!n", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field30++;
        if (class61.field924 != this || class213.field3672) {
            return;
        }
        class35.field543 = true;
        if (class142.field2295 != null && class142.field2295.startsWith("1.5") && class213.method1414(-9292) - class243.field4223 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class165.field2799 <= var2.width && var2.height >= class213.field3675) {
                class173.field2906 = true;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III[B)Lsc;")
    public static final class181 method9(int arg0, int arg1, int arg2, byte[] arg3) {
        field18++;
        class181 var4 = new class181();
        var4.field3155 = 0;
        var4.field3166 = new byte[arg2];
        for (int var5 = arg0; var5 < (arg0 + arg2); var5++) {
            if (arg3[var5] != 0) {
                var4.field3166[var4.field3155++] = arg3[var5];
            }
        }
        if (arg1 == -1) {
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field13++;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
    public abstract void method10(int arg0);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)V")
    public final void method11(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field41++;
        try {
            if (class61.field924 == null) {
                class46.field730 = arg4;
                class143.field2321 = arg1;
                class165.field2799 = arg1;
                class61.field924 = this;
                class182.field3207 = 0;
                class41.field620 = arg2;
                class213.field3675 = arg2;
                class140.field2261 = 0;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class224.field3870 == null) {
                    class194.field3393 = class224.field3870 = new class142(false, this, arg0, (String) null, 0);
                }
                class224.field3870.method918(1, arg3, this);
            } else {
                class186.field3299++;
                if (class186.field3299 >= 3) {
                    this.method4(35, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class83.method565(var8, (String) null, 126);
            this.method4(127, "crash");
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
    public abstract void method12(int arg0);

    @OriginalMember(owner = "client!n", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field21++;
        if (class43.field677 == null) {
            return class224.field3870 == null || class224.field3870.field2285 == this ? super.getDocumentBase() : class224.field3870.field2285.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
    public final synchronized void method13(byte arg0) {
        field26++;
        if (arg0 != 75) {
            return;
        }
        if (class107.field1740 != null) {
            class107.field1740.removeFocusListener(this);
            class107.field1740.getParent().remove(class107.field1740);
        }
        Container var2;
        if (client.field2692 != null) {
            var2 = client.field2692;
        } else if (class43.field677 == null) {
            var2 = class224.field3870.field2285;
        } else {
            var2 = class43.field677;
        }
        var2.setLayout((LayoutManager) null);
        class107.field1740 = new class172(this);
        var2.add(class107.field1740);
        class107.field1740.setSize(class143.field2321, class41.field620);
        class107.field1740.setVisible(true);
        if (class43.field677 == var2) {
            Insets var3 = class43.field677.getInsets();
            class107.field1740.setLocation(var3.left + class182.field3207, var3.top - -class140.field2261);
        } else {
            class107.field1740.setLocation(class182.field3207, class140.field2261);
        }
        class107.field1740.addFocusListener(this);
        class107.field1740.requestFocus();
        class33.field540 = true;
        class35.field543 = true;
        class76.field1226 = true;
        class173.field2906 = false;
        class243.field4223 = class213.method1414(-9292);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZB)V")
    public static final void method14(boolean arg0, byte arg1) {
        field35++;
        class4.method36((byte) 18);
        if (class5.field106 != 30 && class5.field106 != 25) {
            return;
        }
        class170.field2858++;
        if (class170.field2858 < 50 && !arg0 || arg1 >= -103) {
            return;
        }
        class170.field2858 = 0;
        if (!class38.field588 && class216.field3713 != null) {
            class187.field3302++;
            class141.field2275.method541(120, -82);
            try {
                class216.field3713.method317(class141.field2275.field3933, 92, class141.field2275.field3977, 0);
                class141.field2275.field3933 = 0;
            } catch (IOException var2) {
                class38.field588 = true;
            }
        }
        class4.method36((byte) 18);
    }

    @OriginalMember(owner = "client!n", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field25++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public abstract void method15(boolean arg0);

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(B)V")
    private final void method16(byte arg0) {
        field33++;
        long var2 = class213.method1414(arg0 - 9315);
        if (arg0 != 23) {
            method6(-116, (class78) null, -115);
        }
        long var4 = class149.field2491[class203.field3504];
        class149.field2491[class203.field3504] = var2;
        class203.field3504 = class203.field3504 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class195.field3408 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class172.field2875++) > 50) {
            class172.field2875 -= 50;
            class35.field543 = true;
            class107.field1740.setSize(class143.field2321, class41.field620);
            class107.field1740.setVisible(true);
            if (class43.field677 != null && client.field2692 == null) {
                Insets var7 = class43.field677.getInsets();
                class107.field1740.setLocation(class182.field3207 + var7.left, var7.top - -class140.field2261);
            } else {
                class107.field1740.setLocation(class182.field3207, class140.field2261);
            }
        }
        this.method2(-11);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZZ)V")
    private final void method17(boolean arg0, boolean arg1) {
        field1++;
        synchronized (this) {
            if (class213.field3672) {
                return;
            }
            class213.field3672 = true;
        }
        if (class224.field3870.field2285 != null) {
            class224.field3870.field2285.destroy();
        }
        try {
            this.method15(arg0);
        } catch (Exception var9) {
        }
        if (class107.field1740 != null) {
            try {
                class107.field1740.removeFocusListener(this);
                class107.field1740.getParent().remove(class107.field1740);
            } catch (Exception var8) {
            }
        }
        if (class224.field3870 != null) {
            try {
                class224.field3870.method914(0);
            } catch (Exception var7) {
            }
        }
        this.method12(46);
        if (class43.field677 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)V")
    public abstract void method18(boolean arg0);

    @OriginalMember(owner = "client!n", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!n", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field34++;
        if (class43.field677 == null) {
            return class224.field3870 == null || class224.field3870.field2285 == this ? super.getCodeBase() : class224.field3870.field2285.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field7++;
    }

    @OriginalMember(owner = "client!n", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field31++;
    }

    @OriginalMember(owner = "client!n", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field20++;
        if (class61.field924 == this && !class213.field3672) {
            class163.field2785 = class213.method1414(-9292);
            class95.method632(true, 5000L);
            class194.field3393 = null;
            this.method17(false, false);
        }
    }

    @OriginalMember(owner = "client!n", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field10++;
    }

    @OriginalMember(owner = "client!n", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field32++;
    }
}
