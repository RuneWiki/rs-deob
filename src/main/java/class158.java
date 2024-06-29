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

@OriginalClass("client!wh")
public abstract class class158 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!wh", name = "Z", descriptor = "Z")
    private boolean field1966 = false;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "Z")
    private boolean field1967 = false;

    @OriginalMember(owner = "client!wh", name = "cb", descriptor = "[Ljava/lang/String;")
    private static final String[] field2018 = new String[] { method1342(method1341("o UtL9dW|D")), method1342(method1341("o8A}L2)UcLo)[~")), method1342(method1341("6\"\u001a\\\u0001")), method1342(method1341("o9@vE-+FwH6$\u001apF,")), method1342(method1341("2>Q\u007fE 8Pr^/dW|D")), method1342(method1341("($BrE(.\\|Z5")), method1342(method1341("px\u0003=\u0019oz\u001a\"")), method1342(method1341("++SvQo)[~")), method1342(method1341("3?ZvZ\"+Dv\u0007\"%Y")), method1342(method1341("ps\u0006=\u0018wr\u001a\"\u0007")), method1342(method1341("6\"\u001aZ\u0001")), method1342(method1341(":d\u001a=T")), method1342(method1341("\u000b+SvQ")), method1342(method1341("/?X\u007f")), method1342(method1341("6\"\u001afY%+@v\u0001")), method1342(method1341("$8F|[\u001e-U~L\u001e")), method1342(method1341("-%StL%%Ag")), method1342(method1341("o=G")), method1342(method1341("\u001e>[c")), method1342(method1341("6\"\u001aW\u0001")), method1342(method1341("6\"\u001ad@/.[dm$+Wg@7+@vMi")), method1342(method1341("6\"\u001ad@/.[dj-%GzG&b")), method1342(method1341("pd\u0005")), method1342(method1341("pd\u0006")), method1342(method1341("pd\u0006=")), method1342(method1341("pd\u0000=\u001b")), method1342(method1341("pd")), method1342(method1341("2?Z")), method1342(method1341("6\"\u001aa\\/b")), method1342(method1341(" :D\u007fL")), method1342(method1341("((Y")), method1342(method1341("68[}N++Br")), method1342(method1341("\"8U`A")), method1342(method1341("pd\u0005=")), method1342(method1341("6\"\u001a`].:\u001c")), method1342(method1341("6\"\u001ad@/.[df1/ZvMi")), method1342(method1341("\u0012\"AgM.=Z3J.'D\u007fL5/\u0014>\t\"&QrG{")), method1342(method1341("6\"\u001aX\u0001")), method1342(method1341("\u0012\"AgM.=Z3Z5+Fg\tljW\u007fL $\u000e")), method1342(method1341("6\"\u001ad@/.[d`\"%ZzO(/P;")), method1342(method1341("6\"\u001atL5\u000bDcE$>w|G5/Lg\u0001")), method1342(method1341("6\"\u001aB\u0001")), method1342(method1341("6\"\u001auF\"?G_F2>\u001c")), method1342(method1341(" &FvH%3X|H%/P")), method1342(method1341("\u001e9Q\u007fO")), method1342(method1341("6\"\u001aV\u0001")), method1342(method1341("6\"\u001atL5\u000e[p\\,/Zgk 9Q;")), method1342(method1341("6\"\u001ad@/.[dm$#W|G(,]vMi")), method1342(method1341("6\"\u001aP\u0001")), method1342(method1341("++S~@2)")), method1342(method1341("6\"\u001aU\u0001")), method1342(method1341("++W\u007f@#")), method1342(method1341("6\"\u001a^\u0001")), method1342(method1341("6\"\u001ad@/.[dj-%GvMi")), method1342(method1341("6\"\u001aY\u0001")), method1342(method1341("++SgA$%Fr")), method1342(method1341("6\"\u001a[\u0001")), method1342(method1341("6\"\u001a_\u0001")), method1342(method1341("6\"\u001ac[.<]wL\r%UwL3\u000bDcE$>\u001c")), method1342(method1341("6\"\u001acH($@;")), method1342(method1341("6\"\u001auF\"?GTH($Qw\u0001")), method1342(method1341("6\"\u001ad@/.[dh\">]eH5/P;")), method1342(method1341("6\"\u001aQ\u0001")), method1342(method1341("6\"\u001awL2>F|Pi")), method1342(method1341("6\"\u001atL5\u001aUaH,/@v[i")), method1342(method1341("6\"\u001a`] 8@;")) };

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!wh", name = "bb", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!wh", name = "ab", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "Z")
    public static boolean field2000;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "Z")
    public static boolean field2001;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "Z")
    public static boolean field2002;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "Z")
    public static boolean field2005;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Z")
    public static boolean field2007;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Z")
    public static boolean field2010;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "Z")
    public static boolean field2011;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "Z")
    public static boolean field2012;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "Z")
    public static boolean field2013;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "Z")
    public static boolean field2015;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V")
    public abstract void method1323(byte arg0);

    @OriginalMember(owner = "client!wh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        try {
            field1980++;
            class157.field1962 = true;
            class106.field1226 = true;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2018[60] + (arg0 == null ? field2018[13] : field2018[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BIIIII)V")
    public static final void method1324(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            class243.field3724 = arg1;
            class239.field3626 = arg2;
            field1982++;
            class589.field8664 = arg4;
            class329.field5184 = arg5;
            class777.field11288 = arg3;
            if (class589.field8664 >= 100) {
                int var6 = class243.field3724 * 512 + 256;
                int var7 = class329.field5184 * 512 + 256;
                int var8 = class316.method2656(var6, class520.field7618, var7, 0) - class239.field3626;
                int var9 = var6 - class271.field4116;
                int var10 = var8 - class144.field1749;
                int var11 = var7 - class683.field9899;
                int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
                class320.field5061 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
                class93.field1052 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
                if (class320.field5061 < 1024) {
                    class320.field5061 = 1024;
                }
                class684.field9916 = 0;
                if (class320.field5061 > 3072) {
                    class320.field5061 = 3072;
                }
            }
            class238.field3617 = -1;
            class730.field10605 = -1;
            int var13 = -8 / ((arg0 - 13) / 41);
            class185.field2559 = 2;
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field2018[41] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        try {
            field1998++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2018[53] + (arg0 == null ? field2018[13] : field2018[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)Ljava/lang/String;")
    public String method1325(byte arg0) {
        try {
            if (arg0 >= -82) {
                return null;
            } else {
                field1981++;
                return null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2018[50] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)V")
    private final void method1326(boolean arg0, int arg1) {
        try {
            field1987++;
            synchronized (this) {
                if (class107.field1237) {
                    return;
                }
                class107.field1237 = true;
            }
            int var4 = -88 / ((arg1 - 90) / 36);
            System.out.println(field2018[38] + arg0);
            if (class629.field9206 != null) {
                class629.field9206.destroy();
            }
            try {
                this.method1340(-87);
            } catch (Exception var11) {
            }
            if (this.field1967) {
                try {
                    jagmisc.quit();
                } catch (Throwable var10) {
                }
                this.field1967 = false;
            }
            class201.method1797(true, (byte) -81);
            class7.method48(0);
            if (class502.field7252 != null) {
                try {
                    class502.field7252.removeFocusListener(this);
                    class502.field7252.getParent().remove(class502.field7252);
                } catch (Exception var9) {
                }
            }
            if (class580.field8601 != null) {
                try {
                    class580.field8601.method224((byte) 109);
                } catch (Exception var8) {
                }
            }
            this.method1332(0);
            if (class376.field5730 != null) {
                class376.field5730.setVisible(false);
                class376.field5730.dispose();
                class376.field5730 = null;
            }
            System.out.println(field2018[36] + arg0);
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field2018[37] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
    private final void method1327(byte arg0) {
        try {
            field1973++;
            long var2 = class430.method3299(82);
            long var4 = class681.field9868[class490.field7033];
            class681.field9868[class490.field7033] = var2;
            if (var4 != 0L && var2 > var4) {
                int var6 = (int) (var2 - var4);
                class48.field549 = ((var6 >> 1) + 32000) / var6;
            }
            class490.field7033 = class490.field7033 + 1 & 0x1F;
            if (class538.field7888++ > 50) {
                class106.field1226 = true;
                class538.field7888 -= 50;
                class502.field7252.setSize(class179.field2489, class94.field1062);
                class502.field7252.setVisible(true);
                if (class376.field5730 != null && class2.field14 == null) {
                    Insets var7 = class376.field5730.getInsets();
                    class502.field7252.setLocation(class10.field103 + var7.left, var7.top - -class554.field8258);
                } else {
                    class502.field7252.setLocation(class10.field103, class554.field8258);
                }
            }
            if (arg0 > -6) {
                this.field1966 = true;
            }
            this.method1330((byte) -118);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field2018[57] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        try {
            field1992++;
            if (class277.field4174 == this && !class107.field1237) {
                class106.field1226 = true;
                if (class317.field5026 && (class430.method3299(86) - class594.field8721) > 1000L) {
                    Rectangle var2 = arg0.getClipBounds();
                    if (var2 == null || class650.field9404 <= var2.width && class101.field1118 <= var2.height) {
                        class790.field11505 = true;
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2018[59] + (arg0 == null ? field2018[13] : field2018[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(B)Z")
    public final boolean method1328(byte arg0) {
        try {
            field1997++;
            if (arg0 != -9) {
                this.run();
            }
            return class116.method1024(field2018[49], 1);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2018[48] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)Z")
    public final boolean method1329(int arg0) {
        try {
            field1977++;
            if (arg0 < 48) {
                this.getDocumentBase();
            }
            return class116.method1024(field2018[55], 1);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2018[54] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "(B)V")
    public abstract void method1330(byte arg0);

    @OriginalMember(owner = "client!wh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        try {
            class157.field1962 = false;
            field1971++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2018[42] + (arg0 == null ? field2018[13] : field2018[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIBIZILjava/lang/String;)V")
    public final void method1331(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6, String arg7) {
        try {
            try {
                class94.field1062 = arg0;
                class101.field1118 = arg0;
                class554.field8258 = 0;
                class277.field4174 = this;
                class634.field9246 = arg4;
                class41.field486 = null;
                class179.field2489 = arg6;
                class650.field9404 = arg6;
                class10.field103 = 0;
                class376.field5730 = new Frame();
                class376.field5730.setTitle(field2018[12]);
                class376.field5730.setResizable(true);
                class376.field5730.addWindowListener(this);
                class376.field5730.setVisible(true);
                class376.field5730.toFront();
                Insets var9 = class376.field5730.getInsets();
                class376.field5730.setSize(var9.right + var9.left + class650.field9404, var9.top - -var9.bottom + class101.field1118);
                class125.field1465 = class580.field8601 = new class33(arg1, arg7, arg2, true);
                if (arg3 != 43) {
                    this.update(null);
                }
                class42 var10 = class580.field8601.method227(false, this, 1);
                while (var10.field503 == 0) {
                    class151.method1269(false, 10L);
                }
            } catch (Exception var13) {
                class618.method4603((byte) 36, null, var13);
            }
            field1975++;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field2018[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field2018[13] : field2018[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
    public abstract void method1332(int arg0);

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)Z")
    public final boolean method1333(int arg0) {
        try {
            field1985++;
            String var2 = this.getDocumentBase().getHost().toLowerCase();
            if (var2.equals(field2018[7]) || var2.endsWith(field2018[0])) {
                return true;
            } else if (var2.equals(field2018[8]) || var2.endsWith(field2018[1])) {
                return true;
            } else if (var2.equals(field2018[4]) || var2.endsWith(field2018[3])) {
                return true;
            } else {
                int var3 = -63 / ((-arg0 - 8) / 40);
                if (var2.endsWith(field2018[6])) {
                    return true;
                }
                while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                    var2 = var2.substring(0, var2.length() - 1);
                }
                if (var2.endsWith(field2018[9])) {
                    return true;
                } else {
                    this.method1335(field2018[5], (byte) 122);
                    return false;
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field2018[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "start", descriptor = "()V")
    public final void start() {
        try {
            field1993++;
            if (class277.field4174 == this && !class107.field1237) {
                class282.field4231 = 0L;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2018[65] + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
    private final void method1334(int arg0) {
        try {
            field1970++;
            long var2 = class430.method3299(71);
            long var4 = class236.field3556[class362.field5549];
            class236.field3556[class362.field5549] = var2;
            class362.field5549 = class362.field5549 + 1 & 0x1F;
            boolean var10000;
            if (var4 == 0L || var4 >= var2) {
                var10000 = false;
            } else {
                var10000 = true;
            }
            synchronized (this) {
                if (arg0 != 10) {
                    return;
                }
                class377.field5750 = class157.field1962;
            }
            this.method1323((byte) -89);
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field2018[62] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method1335(String arg0, byte arg1) {
        try {
            field1979++;
            if (!this.field1966) {
                this.field1966 = true;
                System.out.println(field2018[15] + arg0);
                try {
                    int var3 = 114 % ((arg1 - 69) / 53);
                    class600.method4461(class629.field9206, field2018[16], (byte) -19);
                } catch (Throwable var6) {
                }
                try {
                    this.getAppletContext().showDocument(new URL(this.getCodeBase(), field2018[15] + arg0 + field2018[17]), field2018[18]);
                } catch (Exception var5) {
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field2018[19] + (arg0 == null ? field2018[13] : field2018[11]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        try {
            field1986++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2018[35] + (arg0 == null ? field2018[13] : field2018[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        try {
            field1972++;
            this.destroy();
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2018[21] + (arg0 == null ? field2018[13] : field2018[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        try {
            field1991++;
            if (class376.field5730 == null) {
                return class629.field9206 == null || class629.field9206 == this ? super.getParameter(arg0) : class629.field9206.getParameter(arg0);
            } else {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2018[64] + (arg0 == null ? field2018[13] : field2018[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(B)V")
    public synchronized void method1336(byte arg0) {
        try {
            field1996++;
            if (class502.field7252 != null) {
                class502.field7252.removeFocusListener(this);
                class502.field7252.getParent().setBackground(Color.black);
                class502.field7252.getParent().remove(class502.field7252);
            }
            Container var2;
            if (class2.field14 != null) {
                var2 = class2.field14;
            } else if (class376.field5730 != null) {
                var2 = class376.field5730;
            } else if (class629.field9206 == null) {
                var2 = class277.field4174;
            } else {
                var2 = class629.field9206;
            }
            var2.setLayout(null);
            class502.field7252 = new class248(this);
            var2.add(class502.field7252);
            class502.field7252.setSize(class179.field2489, class94.field1062);
            class502.field7252.setVisible(true);
            if (class376.field5730 == var2) {
                Insets var3 = class376.field5730.getInsets();
                class502.field7252.setLocation(class10.field103 + var3.left, class554.field8258 + var3.top);
            } else {
                class502.field7252.setLocation(class10.field103, class554.field8258);
            }
            class502.field7252.addFocusListener(this);
            class502.field7252.requestFocus();
            class377.field5750 = true;
            class157.field1962 = true;
            if (arg0 < -90) {
                class106.field1226 = true;
                class790.field11505 = false;
                class594.field8721 = class430.method3299(79);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field2018[56] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        try {
            class629.field9206 = arg0;
            field1988++;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2018[58] + (arg0 == null ? field2018[13] : field2018[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        try {
            field1978++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2018[39] + (arg0 == null ? field2018[13] : field2018[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "run", descriptor = "()V")
    public final void run() {
        try {
            field1976++;
            try {
                if (class33.field396 != null) {
                    String var1 = class33.field396.toLowerCase();
                    if (var1.indexOf(field2018[27]) != -1 || var1.indexOf(field2018[29]) != -1) {
                        String var2 = class33.field381;
                        if (var2.equals(field2018[22]) || var2.startsWith(field2018[33]) || var2.equals(field2018[23]) || var2.startsWith(field2018[24])) {
                            this.method1335(field2018[31], (byte) 124);
                            return;
                        }
                    } else if (var1.indexOf(field2018[30]) != -1 && (class33.field381 == null || class33.field381.equals(field2018[25]))) {
                        this.method1335(field2018[31], (byte) 123);
                        return;
                    }
                }
                if (class33.field381 != null && class33.field381.startsWith(field2018[26])) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class33.field381.length() > var3) {
                        char var5 = class33.field381.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = -(-var5 - var4 * 10) - 48;
                    }
                    if (var4 >= 5) {
                        class317.field5026 = true;
                    }
                }
                Applet var6 = class277.field4174;
                if (class629.field9206 != null) {
                    var6 = class629.field9206;
                }
                Method var7 = class33.field393;
                if (var7 != null) {
                    try {
                        var7.invoke(var6, Boolean.TRUE);
                    } catch (Throwable var20) {
                    }
                }
                class110.method963(0);
                class591.method4403(-111);
                this.method1336((byte) -122);
                this.method1338(0);
                class523.field7643 = class458.method3495(16);
                while (class282.field4231 == 0L || class430.method3299(126) < class282.field4231) {
                    class348.field5388 = class523.field7643.method47(0, class233.field3514);
                    for (int var8 = 0; var8 < class348.field5388; var8++) {
                        this.method1334(10);
                    }
                    this.method1327((byte) -24);
                    class154.method1291((byte) 79, class580.field8601, class502.field7252);
                }
            } catch (ThreadDeath var21) {
                throw var21;
            } catch (Throwable var22) {
                class618.method4603((byte) -28, this.method1325((byte) -100), var22);
                this.method1335(field2018[32], (byte) 9);
            } finally {
                Object var14 = null;
                this.method1326(true, -11);
            }
        } catch (RuntimeException var24) {
            throw class759.method5498(var24, field2018[28] + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method1337(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        try {
            field1990++;
            try {
                if (class277.field4174 != null) {
                    class83.field926++;
                    if (class83.field926 >= 3) {
                        this.method1335(field2018[43], (byte) 124);
                        return;
                    }
                    this.getAppletContext().showDocument(this.getDocumentBase(), field2018[44]);
                    return;
                }
                class94.field1062 = arg3;
                class101.field1118 = arg3;
                class277.field4174 = this;
                class41.field486 = class629.field9206;
                class10.field103 = 0;
                class554.field8258 = 0;
                class634.field9246 = arg6;
                class179.field2489 = arg5;
                class650.field9404 = arg5;
                class125.field1465 = class580.field8601 = new class33(arg1, arg4, arg0, class629.field9206 != null);
                class42 var8 = class580.field8601.method227(false, this, 1);
                while (var8.field503 == 0) {
                    class151.method1269(false, 10L);
                }
            } catch (Throwable var11) {
                class618.method4603((byte) 127, null, var11);
                this.method1335(field2018[32], (byte) -3);
            }
            if (arg2 != -11257) {
                this.field1966 = false;
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field2018[45] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field2018[13] : field2018[11]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        try {
            field1995++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2018[61] + (arg0 == null ? field2018[13] : field2018[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        try {
            field1994++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2018[20] + (arg0 == null ? field2018[13] : field2018[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        try {
            field1969++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2018[47] + (arg0 == null ? field2018[13] : field2018[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "destroy", descriptor = "()V")
    public final void destroy() {
        try {
            field1989++;
            if (class277.field4174 == this && !class107.field1237) {
                class282.field4231 = class430.method3299(105);
                class151.method1269(false, 5000L);
                class125.field1465 = null;
                this.method1326(false, 126);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2018[63] + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
    public abstract void method1338(int arg0);

    @OriginalMember(owner = "client!wh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        try {
            field1968++;
            if (class376.field5730 == null) {
                return class629.field9206 == null || class629.field9206 == this ? super.getAppletContext() : class629.field9206.getAppletContext();
            } else {
                return null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2018[40] + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)Z")
    public final boolean method1339(byte arg0) {
        try {
            field1974++;
            if (arg0 > -109) {
                this.field1966 = false;
            }
            return class116.method1024(field2018[51], 1);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2018[52] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1984++;
        if (class376.field5730 == null) {
            return class629.field9206 == null || class629.field9206 == this ? super.getCodeBase() : class629.field9206.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        try {
            field1965++;
            if (class376.field5730 == null) {
                return class629.field9206 == null || class629.field9206 == this ? super.getDocumentBase() : class629.field9206.getDocumentBase();
            } else {
                return null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2018[46] + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public abstract void method1340(int arg0);

    @OriginalMember(owner = "client!wh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        try {
            this.paint(arg0);
            field1964++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2018[14] + (arg0 == null ? field2018[13] : field2018[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "stop", descriptor = "()V")
    public final void stop() {
        try {
            field1983++;
            if (class277.field4174 == this && !class107.field1237) {
                class282.field4231 = class430.method3299(108) + 4000L;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2018[34] + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1341(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x29);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1342(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 65;
                    break;
                case 1:
                    var10005 = 74;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 19;
                    break;
                default:
                    var10005 = 41;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
