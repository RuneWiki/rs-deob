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
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public abstract class class18 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Z")
    private boolean field376 = false;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Lpe;")
    public static class95 field389 = new class95(5000);

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
    public static int field407 = -1;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "Lrc;")
    public static class105 field408 = class43.method374(" x", 0);

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "Lrc;")
    public static class105 field413 = class43.method374(":", 0);

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "[I")
    public static int[] field417 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
    public static int field418 = -1;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
    public static int field420 = 0;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "Lfb;")
    public static class33 field414;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "Lpb;")
    public static class92 field419;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "Ljava/awt/Frame;")
    public static Frame field412;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "Z")
    public static boolean field422;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "[[[B")
    public static byte[][][] field410;

    @OriginalMember(owner = "client!ce", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 6)
    public final void windowActivated(WindowEvent arg0) {
        field388++;
    }

    @OriginalMember(owner = "client!ce", name = "stop", descriptor = "()V", line = 16)
    public final void stop() {
        field394++;
        if (class110.field2554 == this && !class98.field2270) {
            class108.field2469 = class1.method3(false) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ce", name = "destroy", descriptor = "()V", line = 31)
    public final void destroy() {
        field399++;
        if (class110.field2554 == this && !class98.field2270) {
            class108.field2469 = class1.method3(false);
            class75.method634(5000L, 20306);
            field414 = null;
            this.method204(-21633);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 45)
    public static void method186(int arg0) {
        field417 = null;
        field412 = null;
        field408 = null;
        field419 = null;
        field413 = null;
        field389 = null;
        field410 = null;
        if (arg0 == 4500) {
            field414 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 62)
    public final synchronized void paint(Graphics arg0) {
        field397++;
        if (class110.field2554 != this || class98.field2270) {
            return;
        }
        class67.field1506 = true;
        if (class33.field765 != null && class33.field765.startsWith("1.5") && class1.method3(false) - class64.field1439 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class107.field2440 && class14.field283 <= var2.height) {
                class119.field2775 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 98)
    private final void method187(byte arg0) {
        field395++;
        if (arg0 != 69) {
            field418 = 119;
        }
        long var2 = class1.method3(false);
        long var4 = class36.field834[class97.field2252];
        class36.field834[class97.field2252] = var2;
        class97.field2252 = class97.field2252 + 1 & 0x1F;
        synchronized (this) {
            class74.field1648 = class74.field1645;
        }
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        this.method185(false);
    }

    @OriginalMember(owner = "client!ce", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 127)
    public final URL getDocumentBase() {
        field375++;
        if (field412 == null) {
            return class122.field2991 == null || class122.field2991.field767 == this ? super.getDocumentBase() : class122.field2991.field767.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIBI)V", line = 142)
    public final void method188(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field398++;
        try {
            if (class110.field2554 == null) {
                class60.field1331 = arg2;
                class14.field283 = arg4;
                class107.field2440 = arg0;
                int var6 = -73 % ((60 - arg3) / 62);
                class110.field2554 = this;
                if (class122.field2991 == null) {
                    field414 = class122.field2991 = new class33(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg1, null, 0);
                }
                class122.field2991.method318(1, -68, this);
            } else {
                this.method203(20, "alreadyloaded");
            }
        } catch (Exception var8) {
            class19.method225(0, null, var8);
            this.method203(20, "crash");
        }
    }

    @OriginalMember(owner = "client!ce", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 174)
    public final void windowDeactivated(WindowEvent arg0) {
        field415++;
    }

    @OriginalMember(owner = "client!ce", name = "providesignlink", descriptor = "(Lfb;)V", line = 185)
    public static final void providesignlink(class33 arg0) {
        field411++;
        class122.field2991 = arg0;
        field414 = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 196)
    public final synchronized void method189(int arg0) {
        field393++;
        Container var2;
        if (field412 == null) {
            var2 = class122.field2991.field767;
        } else {
            var2 = field412;
        }
        if (class41.field935 != null) {
            class41.field935.removeFocusListener(this);
            var2.remove(class41.field935);
        }
        class41.field935 = new class41(this);
        var2.add(class41.field935);
        class41.field935.setSize(class107.field2440, class14.field283);
        class41.field935.setVisible(true);
        if (field412 == null) {
            class41.field935.setLocation(0, 0);
        } else {
            Insets var3 = field412.getInsets();
            class41.field935.setLocation(var3.left, var3.top);
        }
        class41.field935.addFocusListener(this);
        class41.field935.requestFocus();
        class67.field1506 = true;
        if (arg0 <= 48) {
            field414 = null;
        }
        class119.field2775 = false;
        class64.field1439 = class1.method3(false);
    }

    @OriginalMember(owner = "client!ce", name = "run", descriptor = "()V", line = 239)
    public final void run() {
        field377++;
        try {
            if (class33.field771 != null) {
                String var1 = class33.field771.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class33.field765;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method203(20, "wrongjava");
                        return;
                    }
                    class97.field2244 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class33.field765 == null || class33.field765.equals("1.4.2"))) {
                    this.method203(20, "wrongjava");
                    return;
                }
            }
            if (class122.field2991.field767 != null) {
                Method var3 = class33.field778;
                if (var3 != null) {
                    try {
                        var3.invoke(class122.field2991.field767, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method189(55);
            class42.field944 = class86.method712(-117, class14.field283, class107.field2440, class41.field935);
            this.method195(true);
            class12.field234 = class115.method934(400);
            class12.field234.method306((byte) 89);
            while (class108.field2469 == 0L || class1.method3(false) < class108.field2469) {
                class81.field1822 = class12.field234.method304(-2, class127.field3073, class97.field2244);
                for (int var4 = 0; var4 < class81.field1822; var4++) {
                    this.method187((byte) 69);
                }
                this.method206(0);
            }
        } catch (Exception var7) {
            class19.method225(0, null, var7);
            this.method203(20, "crash");
        }
        this.method204(-21633);
    }

    @OriginalMember(owner = "client!ce", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 318)
    public final String getParameter(String arg0) {
        field409++;
        if (field412 == null) {
            return class122.field2991 == null || class122.field2991.field767 == this ? super.getParameter(arg0) : class122.field2991.field767.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 334)
    public final void windowIconified(WindowEvent arg0) {
        field372++;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V", line = 343)
    public static final void method191(byte arg0) {
        if (class24.field580 > 1) {
            class24.field580--;
        }
        if (class120.field2893 > 0) {
            class120.field2893--;
        }
        field387++;
        if (class7.field134) {
            class7.field134 = false;
            class110.method909(-23359);
            return;
        }
        for (int var1 = 0; var1 < 100 && class9.method121(-1); var1++) {
        }
        if (class78.field1761 != 30 && class78.field1761 != 35) {
            return;
        }
        if (class10.field217 && class78.field1761 == 30) {
            class9.field183 = 0;
            class104.field2371 = 0;
            while (class14.method159(2)) {
            }
            for (int var2 = 0; var2 < class55.field1111.length; var2++) {
                class55.field1111[var2] = false;
            }
        }
        class80.method689(224, class66.field1472, -22071);
        if (arg0 > -39) {
            field419 = null;
        }
        Object var3 = class73.field1609.field2234;
        synchronized (class73.field1609.field2234) {
            if (!class86.field1956) {
                class73.field1609.field2249 = 0;
            } else if (class104.field2371 != 0 || class73.field1609.field2249 >= 40) {
                class12.field248++;
                class66.field1472.method781(87, (byte) -96);
                class66.field1472.method102((byte) 123, 0);
                int var4 = class66.field1472.field143;
                int var5 = 0;
                for (int var6 = 0; var6 < class73.field1609.field2249 && class66.field1472.field143 - var4 < 240; var6++) {
                    int var7 = class73.field1609.field2248[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = class73.field1609.field2247[var6];
                    var5++;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    int var9 = var7 * 765 + var8;
                    if (class73.field1609.field2248[var6] == -1 && class73.field1609.field2247[var6] == -1) {
                        var7 = -1;
                        var8 = -1;
                        var9 = 524287;
                    }
                    if (class58.field1292 != var8 || class6.field81 != var7) {
                        int var10 = var8 - class58.field1292;
                        class58.field1292 = var8;
                        int var11 = var7 - class6.field81;
                        class6.field81 = var7;
                        if (field420 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            class66.field1472.method113((field420 << 12) + (var10 << 6) + var11, 78);
                            field420 = 0;
                        } else if (field420 < 8) {
                            class66.field1472.method91((byte) -86, (field420 << 19) + var9 + 8388608);
                            field420 = 0;
                        } else {
                            class66.field1472.method100((field420 << 19) + var9 - 1073741824, false);
                            field420 = 0;
                        }
                    } else if (field420 < 2047) {
                        field420++;
                    }
                }
                class66.field1472.method107((byte) 7, class66.field1472.field143 - var4);
                if (var5 < class73.field1609.field2249) {
                    class73.field1609.field2249 -= var5;
                    for (int var12 = 0; var12 < class73.field1609.field2249; var12++) {
                        class73.field1609.field2247[var12] = class73.field1609.field2247[var5 + var12];
                        class73.field1609.field2248[var12] = class73.field1609.field2248[var12 + var5];
                    }
                } else {
                    class73.field1609.field2249 = 0;
                }
            }
        }
        if (class104.field2371 != 0) {
            int var13 = class30.field683;
            long var14 = (class19.field481 - class93.field2173) / 50L;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 502) {
                var13 = 502;
            }
            class39.field891++;
            if (var14 > 4095L) {
                var14 = 4095L;
            }
            class93.field2173 = class19.field481;
            int var16 = class86.field1937;
            byte var17 = 0;
            if (class104.field2371 == 2) {
                var17 = 1;
            }
            int var18 = (int) var14;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 764) {
                var16 = 764;
            }
            int var19 = var13 * 765 + var16;
            class66.field1472.method781(79, (byte) -84);
            class66.field1472.method100((var17 << 19) + (var18 << 20) + var19, false);
        }
        if (class107.field2445 > 0) {
            class107.field2445--;
        }
        if (class55.field1111[96] || class55.field1111[97] || class55.field1111[98] || class55.field1111[99]) {
            class129.field3134 = true;
        }
        if (class129.field3134 && class107.field2445 <= 0) {
            class107.field2445 = 20;
            class19.field467++;
            class129.field3134 = false;
            class66.field1472.method781(210, (byte) -88);
            class66.field1472.method68(client.field432, (byte) 31);
            class66.field1472.method111(class34.field806, -27867);
        }
        if (class74.field1648 && !class42.field962) {
            class26.field599++;
            class42.field962 = true;
            class66.field1472.method781(155, (byte) -80);
            class66.field1472.method102((byte) 123, 1);
        }
        if (!class74.field1648 && class42.field962) {
            class42.field962 = false;
            class66.field1472.method781(155, (byte) -74);
            class66.field1472.method102((byte) 123, 0);
            class26.field599++;
        }
        class23.method235((byte) -37);
        if (class78.field1761 != 30 && class78.field1761 != 35) {
            return;
        }
        class37.method342(true);
        class26.method243(-14892);
        class72.field1593++;
        if (class72.field1593 > 750) {
            class110.method909(-23359);
            return;
        }
        class133.method1053((byte) 99);
        class7.method83(0);
        class59.method476((byte) 23);
        if (class117.field2735 != 0) {
            class66.field1475++;
            if (class66.field1475 >= 15) {
                if (class117.field2735 == 2) {
                    class80.field1805 = true;
                }
                if (class117.field2735 == 3) {
                    class90.field2064 = true;
                }
                class117.field2735 = 0;
            }
        }
        class59.field1319++;
        if (class24.field583 != 0) {
            class133.field3228 += 20;
            if (class133.field3228 >= 400) {
                class24.field583 = 0;
            }
        }
        if (class75.field1674 != 0) {
            if (class75.field1664 > class74.field1650 + 5 || class75.field1664 < class74.field1650 - 5 || class35.field816 > class73.field1615 + 5 || class73.field1615 - 5 > class35.field816) {
                class93.field2178 = true;
            }
            class71.field1558++;
            if (class9.field183 == 0) {
                if (class75.field1674 == 2) {
                    class80.field1805 = true;
                }
                if (class75.field1674 == 3) {
                    class90.field2064 = true;
                }
                class75.field1674 = 0;
                if (class93.field2178 && class71.field1558 >= 5) {
                    class136.field3322 = -1;
                    class89.method739((byte) -39);
                    if (class16.field345 == class136.field3322 && class83.field1850 != class115.field2675) {
                        class119 var20 = class119.method964(65535, class16.field345);
                        class28.field617++;
                        byte var21 = 0;
                        if (class121.field2969 == 1 && var20.field2847 == 206) {
                            var21 = 1;
                        }
                        if (var20.field2770[class115.field2675] <= 0) {
                            var21 = 0;
                        }
                        if (var20.field2834) {
                            int var24 = class83.field1850;
                            int var25 = class115.field2675;
                            var20.field2770[var25] = var20.field2770[var24];
                            var20.field2804[var25] = var20.field2804[var24];
                            var20.field2770[var24] = -1;
                            var20.field2804[var24] = 0;
                        } else if (var21 == 1) {
                            int var22 = class83.field1850;
                            int var23 = class115.field2675;
                            while (var22 != var23) {
                                if (var23 < var22) {
                                    var20.method963(var22, var22 - 1, (byte) -110);
                                    var22--;
                                } else if (var23 > var22) {
                                    var20.method963(var22, var22 + 1, (byte) -110);
                                    var22++;
                                }
                            }
                        } else {
                            var20.method963(class83.field1850, class115.field2675, (byte) -110);
                        }
                        class66.field1472.method781(116, (byte) -28);
                        class66.field1472.method100(class16.field345, false);
                        class66.field1472.method113(class83.field1850, 80);
                        class66.field1472.method102((byte) 123, var21);
                        class66.field1472.method113(class115.field2675, 126);
                    }
                } else if ((class1.field9 == 1 || class66.method561(class113.field2652 - 1, 10024)) && class113.field2652 > 2) {
                    class14.method158(8);
                } else if (class113.field2652 > 0) {
                    class74.method626((byte) -91, class113.field2652 - 1);
                }
                class104.field2371 = 0;
                class66.field1475 = 10;
            }
        }
        byte var26 = 34;
        if (class95.field2191 == -1) {
            if (field418 != -1) {
                class136.method1071(0, 516, var26, field418, 4, 338, 4);
            }
            if (client.field424 != -1) {
                class136.method1071(0, 743, var26, client.field424, 205, 466, 553);
            } else if (class120.field2901[class134.field3265] != -1) {
                class136.method1071(0, 743, var26, class120.field2901[class134.field3265], 205, 466, 553);
            }
            if (class1.field4 != -1) {
                class136.method1071(0, 496, var26, class1.field4, 357, 453, 17);
            } else if (class51.field1069 != -1) {
                class136.method1071(0, 496, var26, class51.field1069, 357, 453, 17);
            }
        } else {
            class136.method1071(0, 765, var26, class95.field2191, 0, 503, 0);
            if (class31.field746 != -1) {
                class136.method1071(0, 765, var26, class31.field746, 0, 503, 0);
            }
        }
        if (class95.field2191 == -1) {
            if (field418 != -1) {
                class136.method1071(0, 516, ~var26, field418, 4, 338, 4);
            }
            if (client.field424 != -1) {
                class136.method1071(0, 743, ~var26, client.field424, 205, 466, 553);
            } else if (class120.field2901[class134.field3265] != -1) {
                class136.method1071(0, 743, ~var26, class120.field2901[class134.field3265], 205, 466, 553);
            }
            if (class1.field4 != -1) {
                class136.method1071(0, 496, ~var26, class1.field4, 357, 453, 17);
            } else if (class51.field1069 != -1) {
                class136.method1071(0, 496, ~var26, class51.field1069, 357, 453, 17);
            }
        } else {
            class136.method1071(0, 765, ~var26, class95.field2191, 0, 503, 0);
            if (class31.field746 != -1) {
                class136.method1071(0, 765, ~var26, class31.field746, 0, 503, 0);
            }
        }
        class108.method876(-1);
        if (class62.field1387 != -1) {
            int var27 = class62.field1387;
            int var28 = class62.field1393;
            boolean var29 = class93.method773((byte) 80, var28, 0, class119.field2842.field1281[0], true, 0, 0, 0, 0, class119.field2842.field1261[0], 0, var27);
            class62.field1387 = -1;
            if (var29) {
                class81.field1835 = class30.field683;
                class16.field334 = class86.field1937;
                class133.field3228 = 0;
                class24.field583 = 1;
            }
        }
        if (class104.field2371 == 1 && class58.field1293 != null) {
            class104.field2371 = 0;
            class90.field2064 = true;
            class58.field1293 = null;
        }
        class95.method783(-4632);
        if (class95.field2191 == -1) {
            class80.method684(126);
            class58.method467((byte) -57);
            class125.method1012((byte) 46);
        }
        if (class76.field1692 == -1 && class42.field949 == -1 && class123.field3029 == -1) {
            if (class58.field1280 > 0) {
                class58.field1280--;
            }
        } else if (class58.field1280 < class107.field2464) {
            class58.field1280++;
            if (class58.field1280 == class107.field2464) {
                if (class42.field949 != -1) {
                    class80.field1805 = true;
                }
                if (class76.field1692 != -1) {
                    class90.field2064 = true;
                }
            }
        }
        if (class9.field183 == 1 || class104.field2371 == 1) {
            class59.field1312++;
        }
        class93.method776(60);
        if (class117.field2738) {
            class71.method605(128);
        }
        for (int var30 = 0; var30 < 5; var30++) {
            int var10002 = class104.field2358[var30]++;
        }
        class81.method692((byte) 102);
        int var31 = class28.method269(true);
        int var32 = class6.method56(true);
        if (var31 > 4500 && var32 > 4500) {
            class65.field1454++;
            class120.field2893 = 250;
            class110.method892(4000, 0);
            class66.field1472.method781(135, (byte) -65);
        }
        class112.field2643++;
        class121.field2916++;
        if (class121.field2916 > 500) {
            int var33 = (int) (Math.random() * 8.0D);
            class121.field2916 = 0;
            if ((var33 & 0x2) == 2) {
                class113.field2656 += class85.field1894;
            }
            if ((var33 & 0x4) == 4) {
                class81.field1813 += class85.field1900;
            }
            if ((var33 & 0x1) == 1) {
                class45.field1022 += class31.field733;
            }
        }
        if (class112.field2643 > 500) {
            class112.field2643 = 0;
            int var34 = (int) (Math.random() * 8.0D);
            if ((var34 & 0x1) == 1) {
                class12.field249 += class83.field1860;
            }
            if ((var34 & 0x2) == 2) {
                class35.field807 += class89.field2056;
            }
        }
        if (class12.field249 < -60) {
            class83.field1860 = 2;
        }
        if (class81.field1813 < -40) {
            class85.field1900 = 1;
        }
        if (class81.field1813 > 40) {
            class85.field1900 = -1;
        }
        if (class113.field2656 < -55) {
            class85.field1894 = 2;
        }
        if (class35.field807 < -20) {
            class89.field2056 = 1;
        }
        if (class113.field2656 > 55) {
            class85.field1894 = -2;
        }
        if (class35.field807 > 10) {
            class89.field2056 = -1;
        }
        if (class12.field249 > 60) {
            class83.field1860 = -2;
        }
        class67.field1519++;
        if (class45.field1022 < -50) {
            class31.field733 = 2;
        }
        if (class45.field1022 > 50) {
            class31.field733 = -2;
        }
        if (class67.field1519 > 50) {
            class66.field1472.method781(185, (byte) -33);
            class36.field835++;
        }
        try {
            if (class24.field576 != null && class66.field1472.field143 > 0) {
                class24.field576.method1034(0, class66.field1472.field117, -109, class66.field1472.field143);
                class66.field1472.field143 = 0;
                class67.field1519 = 0;
            }
        } catch (IOException var35) {
            class110.method909(-23359);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILjava/net/InetAddress;IIILjava/lang/String;II)V", line = 989)
    public final void method192(int arg0, InetAddress arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field405++;
        try {
            class110.field2554 = this;
            class107.field2440 = arg3;
            class14.field283 = arg7;
            class60.field1331 = arg6;
            field412 = new Frame();
            if (arg0 != 1) {
                field414 = null;
            }
            field412.setTitle("Jagex");
            field412.setResizable(false);
            field412.addWindowListener(this);
            field412.setVisible(true);
            field412.toFront();
            Insets var9 = field412.getInsets();
            field412.setSize(var9.right + arg3 + var9.left, var9.top - -var9.bottom + arg7);
            field414 = class122.field2991 = new class33(true, null, arg1, arg4, arg5, arg2);
            class122.field2991.method318(1, arg0 ^ 0xFFFFFFBA, this);
        } catch (Exception var11) {
            class19.method225(0, null, var11);
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)Z", line = 1020)
    public final boolean method193(byte arg0) {
        field380++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.endsWith("jagex.com")) {
            return true;
        } else if (var2.endsWith("runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (arg0 <= 82) {
                field412 = null;
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method203(20, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIZI[B)V", line = 1050)
    public static final void method194(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        int var5 = 19 / ((arg3 - 62) / 48);
        field406++;
        if (class74.field1634 == null) {
            return;
        }
        if (class64.field1431 >= 0) {
            arg1 -= 20;
            if (arg1 < 1) {
                arg1 = 1;
            }
            class67.field1518 = arg1;
            if (class64.field1431 == 0) {
                class104.field2356 = 0;
            } else {
                int var6 = class113.method929((byte) 127, class64.field1431);
                int var7 = var6 - class125.field3054;
                class104.field2356 = (var7 + arg1 + 3600 - 1) / arg1;
            }
            field416 = arg0;
            class75.field1677 = arg2;
            class112.field2619 = arg4;
        } else if (class67.field1518 == 0) {
            class65.method547(arg4, arg2, (byte) 109, arg0);
        } else {
            class75.field1677 = arg2;
            class112.field2619 = arg4;
            field416 = arg0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lb;B)[Ljava/lang/Object;", line = 1101)
    public static final Object[] method196(class7 arg0, byte arg1) {
        field390++;
        int var2 = arg0.method96(27023);
        if (var2 == 0) {
            return null;
        }
        Object[] var3 = new Object[var2];
        if (arg1 > -102) {
            field407 = 8;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = arg0.method96(27023);
            if (var5 == 0) {
                var3[var4] = Integer.valueOf(arg0.method104(-1699));
            } else if (var5 == 1) {
                var3[var4] = arg0.method62((byte) 106);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1137)
    public final void focusGained(FocusEvent arg0) {
        field384++;
        class74.field1645 = true;
        class67.field1506 = true;
    }

    @OriginalMember(owner = "client!ce", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1146)
    public final void windowDeiconified(WindowEvent arg0) {
        field382++;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V", line = 1155)
    public static final void method197(int arg0) {
        field401++;
        class6.field65.method602((byte) -70);
        if (arg0 != 2) {
            field418 = -56;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIB)I", line = 1166)
    public static final int method198(int arg0, int arg1, byte arg2) {
        field374++;
        if (arg2 != 25) {
            method191((byte) -73);
        }
        int var3 = class118.method957(4, arg0 + 45365, arg1 + 91923, arg2 - 142) + (class118.method957(2, arg0 + 10294, arg1 + 37821, -125) - 128 >> 1) + (class118.method957(1, arg0, arg1, -89) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ce", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 1199)
    public final AppletContext getAppletContext() {
        field403++;
        if (field412 == null) {
            return class122.field2991 == null || class122.field2991.field767 == this ? super.getAppletContext() : class122.field2991.field767.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1214)
    public final void windowOpened(WindowEvent arg0) {
        field402++;
    }

    @OriginalMember(owner = "client!ce", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1222)
    public final void focusLost(FocusEvent arg0) {
        field400++;
        class74.field1645 = false;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BII)I", line = 1235)
    public static final int method199(byte arg0, int arg1, int arg2) {
        if (arg2 > arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        field421++;
        if (arg0 != 111) {
            field410 = null;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZI[BI)V", line = 1263)
    public static final void method200(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        field391++;
        if (arg4 != -1) {
            field420 = -23;
        }
        if (class74.field1634 == null) {
            return;
        }
        if (class64.field1431 >= 0) {
            class104.field2356 = arg0;
            if (class64.field1431 == 0) {
                class67.field1518 = 1;
            } else {
                int var5 = class113.method929((byte) 119, class64.field1431);
                int var6 = var5 - class125.field3054;
                class67.field1518 = (var6 + 3600) / arg0;
                if (class67.field1518 < 1) {
                    class67.field1518 = 1;
                }
            }
            field416 = arg2;
            class75.field1677 = arg1;
            class112.field2619 = arg3;
        } else if (class67.field1518 == 0) {
            class65.method547(arg3, arg1, (byte) 91, arg2);
        } else {
            field416 = arg2;
            class112.field2619 = arg3;
            class75.field1677 = arg1;
        }
    }

    @OriginalMember(owner = "client!ce", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 1315)
    public final URL getCodeBase() {
        field379++;
        if (field412 == null) {
            return class122.field2991 == null || class122.field2991.field767 == this ? super.getCodeBase() : class122.field2991.field767.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1333)
    public final void windowClosed(WindowEvent arg0) {
        field396++;
    }

    @OriginalMember(owner = "client!ce", name = "start", descriptor = "()V", line = 1341)
    public final void start() {
        field386++;
        if (class110.field2554 == this && !class98.field2270) {
            class108.field2469 = 0L;
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V", line = 1353)
    public static final void method202(int arg0) {
        if (arg0 != 0) {
            field407 = -64;
        }
        field378++;
        while (field389.method780(class80.field1794, 51) >= 11) {
            int var1 = field389.method785(205, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class58.field1303[var1] == null) {
                var2 = true;
                class58.field1303[var1] = new class15();
                if (class78.field1745[var1] != null) {
                    class58.field1303[var1].method166((byte) -119, class78.field1745[var1]);
                }
            }
            class121.field2956[class97.field2250++] = var1;
            class15 var3 = class58.field1303[var1];
            var3.field1269 = class104.field2351;
            int var4 = field389.method785(arg0 + 205, 1);
            int var5 = field389.method785(arg0 + 205, 1);
            if (var5 == 1) {
                class122.field3001[class76.field1701++] = var1;
            }
            int var6 = field389.method785(205, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class23.field551[field389.method785(205, 3)];
            if (var2) {
                var3.field1226 = var7;
            }
            int var8 = field389.method785(205, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method469((byte) 57, class119.field2842.field1261[0] + var8, var4 == 1, class119.field2842.field1281[0] + var6);
        }
        field389.method789((byte) -80);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILjava/lang/String;)V", line = 1417)
    public final void method203(int arg0, String arg1) {
        field404++;
        if (arg0 != 20) {
            field418 = 40;
        }
        if (this.field376) {
            return;
        }
        this.field376 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"));
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ce", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1444)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field373++;
    }

    @OriginalMember(owner = "client!ce", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 1463)
    public final void update(Graphics arg0) {
        field381++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V", line = 1471)
    private final synchronized void method204(int arg0) {
        field392++;
        if (class98.field2270) {
            return;
        }
        class98.field2270 = true;
        if (arg0 != -21633) {
            method191((byte) -52);
        }
        try {
            class41.field935.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method205((byte) -97);
        } catch (Exception var4) {
        }
        if (field412 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class122.field2991 != null) {
            try {
                class122.field2991.method319(false);
            } catch (Exception var2) {
            }
        }
        this.method190(false);
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)V", line = 1528)
    private final void method206(int arg0) {
        field371++;
        if (arg0 != 0) {
            this.method185(false);
        }
        long var2 = class1.method3(false);
        long var4 = class64.field1429[class34.field795];
        class64.field1429[class34.field795] = var2;
        class34.field795 = class34.field795 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class26.field588 = ((var6 >> 1) + 32000) / var6;
        }
        if (class118.field2768++ > 50) {
            class67.field1506 = true;
            class118.field2768 -= 50;
            class41.field935.setSize(class107.field2440, class14.field283);
            class41.field935.setVisible(true);
            if (field412 == null) {
                class41.field935.setLocation(0, 0);
            } else {
                Insets var7 = field412.getInsets();
                class41.field935.setLocation(var7.left, var7.top);
            }
        }
        this.method201(false);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
    public abstract void method185(boolean arg0);

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V")
    public abstract void method190(boolean arg0);

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(Z)V")
    public abstract void method195(boolean arg0);

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(Z)V")
    public abstract void method201(boolean arg0);

    @OriginalMember(owner = "client!ce", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)V")
    public abstract void method205(byte arg0);
}
