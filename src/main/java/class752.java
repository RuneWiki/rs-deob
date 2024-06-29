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

@OriginalClass("client!ch")
public abstract class class752 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "Z")
    private boolean field10707 = false;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "Z")
    private boolean field10725 = false;

    @OriginalMember(owner = "client!ch", name = "fb", descriptor = "[Ljava/lang/String;")
    private static final String[] field10762 = new String[] { method5457(method5456("T]\u0012xk")), method5457(method5456("T]\u0012|k")), method5457(method5456("T]\u0012wk")), method5457(method5456("Y@PZ")), method5457(method5456("L\u001b\u0012\u0018>")), method5457(method5456("T]\u0012P,T@Oz,DA\u0014")), method5457(method5456("]T[[*DV")), method5457(method5456("T]\u0012tk")), method5457(method5456("T]\u0012E7VGH\u001e")), method5457(method5456("[Z[Q&SZIB")), method5457(method5456("T]\u0012~k")), method5457(method5456("hASF")), method5457(method5456("\u0019BO")), method5457(method5456("RGNY1hR][&h")), method5457(method5456("T]\u0012A*YQSA\u0000[ZOS'\u001f")), method5457(method5456("d]IB'XBR\u0016 XXLZ&CP\u001c\u001bcTYYW-\r")), method5457(method5456("d]IB'XBR\u00160CTNBc\u001a\u0015_Z&V[\u0006")), method5457(method5456("T]\u0012}k")), method5457(method5456("T]\u0012A*YQSA\u0002TAU@\"CPX\u001e")), method5457(method5456("T]\u0012A*YQSA\fGPRS'\u001f")), method5457(method5456("]T[B+RZNW")), method5457(method5456("T]\u0012uk")), method5457(method5456("^WQ")), method5457(method5456("@GSX$]TJW")), method5457(method5456("\u0006\u001b")), method5457(method5456("\u0006\u001b\u000e")), method5457(method5456("\u0006\u001b\r")), method5457(method5456("TG]E+")), method5457(method5456("\u0006\u001b\u000e\u0018")), method5457(method5456("D@R")), method5457(method5456("VELZ&")), method5457(method5456("\u0006\u001b\b\u0018q")), method5457(method5456("\u0006\u001b\r\u0018")), method5457(method5456("T]\u0012D6Y\u001d")), method5457(method5456("T]\u0012E7XE\u0014")), method5457(method5456("T]\u0012A*YQSA\u0000[ZO_-P\u001d")), method5457(method5456("}T[S;")), method5457(method5456("T]\u0012qk")), method5457(method5456("T]\u0012Q&CqSU6ZPRB\u0001VFY\u001e")), method5457(method5456("T]\u0012Q&CtLF/RA\u007fY-CPDBk")), method5457(method5456("T]\u0012P,T@Oq\"^[YRk")), method5457(method5456("hFYZ%")), method5457(method5456("VYNS\"SLPY\"SPX")), method5457(method5456("T]\u0012\u007fk")), method5457(method5456("T]\u0012F1XCUR&{Z]R&EtLF/RA\u0014")), method5457(method5456("T]\u0012F\"^[H\u001e")), method5457(method5456("T]\u0012R&DANY:\u001f")), method5457(method5456("T]\u0012A*YQSA\nTZR_%^PX\u001e")), method5457(method5456("T]\u0012A*YQSA\u0007RT_B*ATHS'\u001f")), method5457(method5456("T]\u0012Q&Ce]D\"ZPHS1\u001f")), method5457(method5456("E@RS0TTLSmTZQ")), method5457(method5456("DAYZ/VGXW4Y\u001b_Y.")), method5457(method5456("\u0019GIX&DV]F&\u0019VS[")), method5457(method5456("^[JW/^QTY0C")), method5457(method5456("]T[S;\u0019VS[")), method5457(method5456("T]\u0012dk")), method5457(method5456("\u0019FHS/[TNR\"@[\u0012U,Z")), method5457(method5456("\u0006\u0007\u000b\u0018s\u0019\u0005\u0012\u0007")), method5457(method5456("\u0006\f\u000e\u0018r\u0001\r\u0012\u0007m")), method5457(method5456("\u0019_]Q&O\u001b_Y.")), method5457(method5456("T]\u0012{k")), method5457(method5456("]T_Z*U")), method5457(method5456("T]\u0012yk")), method5457(method5456("T]\u0012A*YQSA\u0007R\\_Y-^SUS'\u001f")), method5457(method5456("T]\u0012C3STHSk")), method5457(method5456("T]\u0012sk")) };

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Lvl;")
    public static class340 field10732 = new class340(128);

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "Lmv;")
    public static class125 field10740 = new class125(12, 8);

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "[Z")
    public static boolean[] field10742 = new boolean[100];

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "Lmv;")
    public static class125 field10741 = new class125(22, -1);

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    public static int field10705;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public static int field10706;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "I")
    public static int field10708;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field10709;

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "I")
    public static int field10710;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public static int field10711;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field10712;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field10713;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field10714;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    public static int field10715;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public static int field10716;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field10717;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
    public static int field10718;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field10719;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field10720;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field10721;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    public static int field10722;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field10723;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public static int field10724;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field10726;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
    public static int field10727;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    public static int field10728;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public static int field10729;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public static int field10730;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field10731;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "I")
    public static int field10733;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public static int field10734;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    public static int field10735;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field10736;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field10737;

    @OriginalMember(owner = "client!ch", name = "eb", descriptor = "I")
    public static int field10738;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "I")
    public static int field10739;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    public static int field10744;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field10745;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public static int field10748;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field10750;

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "I")
    public static int field10753;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field10754;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field10756;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field10761;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "Z")
    public static boolean field10743;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "Z")
    public static boolean field10746;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "Z")
    public static boolean field10747;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "Z")
    public static boolean field10749;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "Z")
    public static boolean field10751;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Z")
    public static boolean field10752;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Z")
    public static boolean field10755;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Z")
    public static boolean field10757;

    @OriginalMember(owner = "client!ch", name = "db", descriptor = "Z")
    public static boolean field10758;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "Z")
    public static boolean field10759;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "Z")
    public static boolean field10760;

    @OriginalMember(owner = "client!ch", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 7)
    public final void update(Graphics arg0) {
        try {
            this.paint(arg0);
            field10729++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10762[64] + (arg0 == null ? field10762[3] : field10762[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)Z", line = 17)
    public final boolean method5445(int arg0) {
        try {
            field10726++;
            String var2 = this.getDocumentBase().getHost().toLowerCase();
            if (var2.equals(field10762[54]) || var2.endsWith(field10762[59])) {
                return true;
            } else if (var2.equals(field10762[50]) || var2.endsWith(field10762[52])) {
                return true;
            } else if (var2.equals(field10762[51]) || var2.endsWith(field10762[56])) {
                return true;
            } else if (arg0 > -41) {
                return true;
            } else if (var2.endsWith(field10762[57])) {
                return true;
            } else {
                while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                    var2 = var2.substring(0, var2.length() - 1);
                }
                if (var2.endsWith(field10762[58])) {
                    return true;
                } else {
                    this.method5450(6935, field10762[53]);
                    return false;
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10762[55] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "(I)Z", line = 64)
    public final boolean method5446(int arg0) {
        try {
            if (arg0 == 26393) {
                field10712++;
                return class743.method5382(field10762[6], true);
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10762[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V", line = 76)
    private final void method5447(byte arg0) {
        try {
            field10706++;
            long var2 = class614.method4531(-38);
            long var4 = class790.field11496[class375.field5483];
            class790.field11496[class375.field5483] = var2;
            boolean var10000;
            if (var4 == 0L || var2 <= var4) {
                var10000 = false;
            } else {
                var10000 = true;
            }
            class375.field5483 = class375.field5483 + 1 & 0x1F;
            if (arg0 != 98) {
                field10732 = null;
            }
            synchronized (this) {
                class257.field3676 = class584.field8425;
            }
            this.method4967(arg0 ^ 0x17);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field10762[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)Z", line = 108)
    public final boolean method5448(int arg0) {
        try {
            field10717++;
            if (arg0 != -1) {
                this.method5446(48);
            }
            return class743.method5382(field10762[20], true);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10762[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V", line = 119)
    public synchronized void method4979(int arg0) {
        try {
            if (class560.field8153 != null) {
                class560.field8153.removeFocusListener(this);
                class560.field8153.getParent().setBackground(Color.black);
                class560.field8153.getParent().remove(class560.field8153);
            }
            field10722++;
            Container var2;
            if (class321.field4374 != null) {
                var2 = class321.field4374;
            } else if (class543.field7942 != null) {
                var2 = class543.field7942;
            } else if (class290.field4091 == null) {
                var2 = class743.field10561;
            } else {
                var2 = class290.field4091;
            }
            var2.setLayout(null);
            class560.field8153 = new class409(this);
            var2.add(class560.field8153);
            class560.field8153.setSize(class391.field5700, class711.field9998);
            class560.field8153.setVisible(true);
            if (class543.field7942 == var2) {
                Insets var3 = class543.field7942.getInsets();
                class560.field8153.setLocation(class349.field5061 + var3.left, var3.top - -class232.field3346);
            } else {
                class560.field8153.setLocation(class349.field5061, class232.field3346);
            }
            class560.field8153.addFocusListener(this);
            int var4 = -89 / ((-arg0 - 12) / 39);
            class560.field8153.requestFocus();
            class257.field3676 = true;
            class584.field8425 = true;
            class485.field7121 = true;
            class706.field9874 = false;
            class103.field1368 = class614.method4531(-30);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10762[65] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 171)
    public final void windowDeiconified(WindowEvent arg0) {
        try {
            field10705++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10762[63] + (arg0 == null ? field10762[3] : field10762[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 178)
    public final URL getDocumentBase() {
        try {
            field10735++;
            if (class543.field7942 == null) {
                return class290.field4091 == null || class290.field4091 == this ? super.getDocumentBase() : class290.field4091.getDocumentBase();
            } else {
                return null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10762[38] + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "stop", descriptor = "()V", line = 193)
    public final void stop() {
        try {
            field10711++;
            if (class743.field10561 == this && !class273.field3872) {
                class743.field10555 = class614.method4531(-97) + 4000L;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10762[34] + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 205)
    public final AppletContext getAppletContext() {
        try {
            field10713++;
            if (class543.field7942 == null) {
                return class290.field4091 == null || class290.field4091 == this ? super.getAppletContext() : class290.field4091.getAppletContext();
            } else {
                return null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10762[39] + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZZ)V", line = 221)
    private final void method5449(boolean arg0, boolean arg1) {
        try {
            field10721++;
            synchronized (this) {
                if (class273.field3872) {
                    return;
                }
                class273.field3872 = true;
            }
            System.out.println(field10762[16] + arg0);
            if (class290.field4091 != null) {
                class290.field4091.destroy();
            }
            try {
                this.method4973(!arg1);
            } catch (Exception var10) {
            }
            if (this.field10707) {
                try {
                    jagmisc.quit();
                } catch (Throwable var9) {
                }
                this.field10707 = false;
            }
            class579.method4301((byte) -28, true);
            class556.method4162(1558512524);
            if (!arg1) {
                if (class560.field8153 != null) {
                    try {
                        class560.field8153.removeFocusListener(this);
                        class560.field8153.getParent().remove(class560.field8153);
                    } catch (Exception var8) {
                    }
                }
                if (class651.field9249 != null) {
                    try {
                        class651.field9249.method1573(0);
                    } catch (Exception var7) {
                    }
                }
                this.method4970((byte) 103);
                if (class543.field7942 != null) {
                    class543.field7942.setVisible(false);
                    class543.field7942.dispose();
                    class543.field7942 = null;
                }
                System.out.println(field10762[15] + arg0);
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field10762[17] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)Ljava/lang/String;", line = 300)
    public String method4953(int arg0) {
        try {
            field10708++;
            int var2 = -5 % ((arg0 + 28) / 41);
            return null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10762[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/lang/String;)V", line = 311)
    public final void method5450(int arg0, String arg1) {
        try {
            field10724++;
            if (!this.field10725) {
                this.field10725 = true;
                System.out.println(field10762[13] + arg1);
                try {
                    class192.method1601(field10762[9], class290.field4091, arg0 - 2567);
                } catch (Throwable var5) {
                }
                try {
                    this.getAppletContext().showDocument(new URL(this.getCodeBase(), field10762[13] + arg1 + field10762[12]), field10762[11]);
                    if (arg0 != 6935) {
                        this.field10725 = true;
                    }
                } catch (Exception var4) {
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10762[10] + arg0 + ',' + (arg1 == null ? field10762[3] : field10762[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 336)
    public final void windowActivated(WindowEvent arg0) {
        try {
            field10734++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10762[18] + (arg0 == null ? field10762[3] : field10762[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 343)
    public static final void provideLoaderApplet(Applet arg0) {
        try {
            class290.field4091 = arg0;
            field10728++;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10762[44] + (arg0 == null ? field10762[3] : field10762[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZLjava/lang/String;IIIIZ)V", line = 351)
    public final void method5451(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        try {
            field10719++;
            try {
                class349.field5061 = 0;
                class410.field5920 = arg4;
                class232.field3346 = 0;
                class391.field5700 = arg0;
                class792.field11523 = arg0;
                class743.field10561 = this;
                class795.field11566 = null;
                class711.field9998 = arg5;
                class40.field615 = arg5;
                class543.field7942 = new Frame();
                class543.field7942.setTitle(field10762[36]);
                class543.field7942.setResizable(true);
                class543.field7942.addWindowListener(this);
                class543.field7942.setVisible(true);
                class543.field7942.toFront();
                Insets var9 = class543.field7942.getInsets();
                class543.field7942.setSize(class792.field11523 + var9.right + var9.left, class40.field615 + var9.bottom - -var9.top);
                class709.field9903 = class651.field9249 = new class188(arg3, arg2, arg6, arg7);
                class328 var10 = class651.field9249.method1572(this, (byte) -94, 1);
                while (var10.field4486 == 0) {
                    class449.method3474(20817, 10L);
                }
            } catch (Exception var13) {
                class162.method1374(var13, null, (byte) -93);
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field10762[37] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10762[3] : field10762[4]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 391)
    public final void windowIconified(WindowEvent arg0) {
        try {
            field10733++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10762[47] + (arg0 == null ? field10762[3] : field10762[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)Z", line = 398)
    public final boolean method5452(byte arg0) {
        try {
            if (arg0 != 48) {
                this.method4967(88);
            }
            field10730++;
            return class743.method5382(field10762[61], true);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10762[60] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 412)
    public final void windowClosing(WindowEvent arg0) {
        try {
            this.destroy();
            field10738++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10762[35] + (arg0 == null ? field10762[3] : field10762[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 426)
    public final void focusLost(FocusEvent arg0) {
        try {
            class584.field8425 = false;
            field10715++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10762[5] + (arg0 == null ? field10762[3] : field10762[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 436)
    public final void windowOpened(WindowEvent arg0) {
        try {
            field10714++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10762[19] + (arg0 == null ? field10762[3] : field10762[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 445)
    public final void windowClosed(WindowEvent arg0) {
        try {
            field10709++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10762[14] + (arg0 == null ? field10762[3] : field10762[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 453)
    public final void windowDeactivated(WindowEvent arg0) {
        try {
            field10710++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10762[48] + (arg0 == null ? field10762[3] : field10762[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILjava/lang/String;IIII)V", line = 460)
    public final void method5453(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field10737++;
            try {
                if (class743.field10561 == null) {
                    class410.field5920 = arg0;
                    class391.field5700 = arg6;
                    class792.field11523 = arg6;
                    class711.field9998 = arg4;
                    class40.field615 = arg4;
                    class232.field3346 = 0;
                    class795.field11566 = class290.field4091;
                    class743.field10561 = this;
                    class349.field5061 = arg3;
                    class709.field9903 = class651.field9249 = new class188(arg5, arg2, arg1, class290.field4091 != null);
                    class328 var8 = class651.field9249.method1572(this, (byte) -68, 1);
                    while (var8.field4486 == 0) {
                        class449.method3474(arg3 + 20817, 10L);
                    }
                } else {
                    class261.field3701++;
                    if (class261.field3701 >= 3) {
                        this.method5450(6935, field10762[42]);
                    } else {
                        this.getAppletContext().showDocument(this.getDocumentBase(), field10762[41]);
                    }
                }
            } catch (Throwable var11) {
                class162.method1374(var11, null, (byte) -93);
                this.method5450(6935, field10762[27]);
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field10762[43] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10762[3] : field10762[4]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V", line = 503)
    private final void method5454(int arg0) {
        try {
            if (arg0 == -8317) {
                field10723++;
                long var2 = class614.method4531(-96);
                long var4 = class553.field8064[class527.field7670];
                class553.field8064[class527.field7670] = var2;
                if (var4 != 0L && var4 < var2) {
                    int var6 = (int) (var2 - var4);
                    class736.field10492 = ((var6 >> 1) + 32000) / var6;
                }
                class527.field7670 = class527.field7670 + 1 & 0x1F;
                if ((class357.field5197++) > 50) {
                    class485.field7121 = true;
                    class357.field5197 -= 50;
                    class560.field8153.setSize(class391.field5700, class711.field9998);
                    class560.field8153.setVisible(true);
                    if (class543.field7942 != null && class321.field4374 == null) {
                        Insets var7 = class543.field7942.getInsets();
                        class560.field8153.setLocation(class349.field5061 + var7.left, var7.top - -class232.field3346);
                    } else {
                        class560.field8153.setLocation(class349.field5061, class232.field3346);
                    }
                }
                this.method4960(true);
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field10762[62] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "destroy", descriptor = "()V", line = 548)
    public final void destroy() {
        try {
            field10718++;
            if (class743.field10561 == this && !class273.field3872) {
                class743.field10555 = class614.method4531(-67);
                class449.method3474(20817, 5000L);
                class709.field9903 = null;
                this.method5449(false, false);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10762[46] + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "start", descriptor = "()V", line = 562)
    public final void start() {
        try {
            field10736++;
            if (class743.field10561 == this && !class273.field3872) {
                class743.field10555 = 0L;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10762[8] + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "run", descriptor = "()V", line = 577)
    public final void run() {
        try {
            field10727++;
            try {
                if (class188.field2488 != null) {
                    String var1 = class188.field2488.toLowerCase();
                    if (var1.indexOf(field10762[29]) != -1 || var1.indexOf(field10762[30]) != -1) {
                        String var2 = class188.field2487;
                        if (var2.equals(field10762[26]) || var2.startsWith(field10762[32]) || var2.equals(field10762[25]) || var2.startsWith(field10762[28])) {
                            this.method5450(6935, field10762[23]);
                            return;
                        }
                    } else if (var1.indexOf(field10762[22]) != -1 && (class188.field2487 == null || class188.field2487.equals(field10762[31]))) {
                        this.method5450(6935, field10762[23]);
                        return;
                    }
                }
                if (class188.field2487 != null && class188.field2487.startsWith(field10762[24])) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class188.field2487.length()) {
                        char var5 = class188.field2487.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 + var5 - 48;
                        var3++;
                    }
                    if (var4 >= 5) {
                        class71.field1035 = true;
                    }
                }
                Applet var6 = class743.field10561;
                if (class290.field4091 != null) {
                    var6 = class290.field4091;
                }
                Method var7 = class188.field2486;
                if (var7 != null) {
                    try {
                        var7.invoke(var6, Boolean.TRUE);
                    } catch (Throwable var20) {
                    }
                }
                class612.method4520(true);
                class301.method2408((byte) 113);
                this.method4979(32);
                this.method4976((byte) -122);
                class476.field7025 = class63.method676(75);
                while (class743.field10555 == 0L || class743.field10555 > class614.method4531(-101)) {
                    class117.field1493 = class476.field7025.method2537(class651.field9252, (byte) 105);
                    for (int var8 = 0; var8 < class117.field1493; var8++) {
                        this.method5447((byte) 98);
                    }
                    this.method5454(-8317);
                    class320.method2535(class560.field8153, class651.field9249, 256);
                }
            } catch (ThreadDeath var21) {
                throw var21;
            } catch (Throwable var22) {
                class162.method1374(var22, this.method4953(121), (byte) -93);
                this.method5450(6935, field10762[27]);
            } finally {
                Object var14 = null;
                this.method5449(true, false);
            }
        } catch (RuntimeException var24) {
            throw class665.method4799(var24, field10762[33] + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 709)
    public final String getParameter(String arg0) {
        try {
            field10731++;
            if (class543.field7942 == null) {
                return class290.field4091 == null || class290.field4091 == this ? super.getParameter(arg0) : class290.field4091.getParameter(arg0);
            } else {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10762[49] + (arg0 == null ? field10762[3] : field10762[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 724)
    public static void method5455(int arg0) {
        try {
            field10742 = null;
            field10741 = null;
            field10732 = null;
            field10740 = null;
            if (arg0 != 0) {
                method5455(63);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10762[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 739)
    public final void focusGained(FocusEvent arg0) {
        try {
            class584.field8425 = true;
            field10720++;
            class485.field7121 = true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10762[40] + (arg0 == null ? field10762[3] : field10762[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 748)
    public final synchronized void paint(Graphics arg0) {
        try {
            field10739++;
            if (class743.field10561 == this && !class273.field3872) {
                class485.field7121 = true;
                if (class71.field1035 && class614.method4531(-77) - class103.field1368 > 1000L) {
                    Rectangle var2 = arg0.getClipBounds();
                    if (var2 == null || var2.width >= class792.field11523 && class40.field615 <= var2.height) {
                        class706.field9874 = true;
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10762[45] + (arg0 == null ? field10762[3] : field10762[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ch", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 770)
    public final URL getCodeBase() {
        field10716++;
        if (class543.field7942 == null) {
            return class290.field4091 == null || class290.field4091 == this ? super.getCodeBase() : class290.field4091.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V")
    public abstract void method4976(byte arg0);

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)V")
    public abstract void method4967(int arg0);

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(B)V")
    public abstract void method4970(byte arg0);

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
    public abstract void method4973(boolean arg0);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
    public abstract void method4960(boolean arg0);

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5456(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5457(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 55;
                    break;
                case 1:
                    var10005 = 53;
                    break;
                case 2:
                    var10005 = 60;
                    break;
                case 3:
                    var10005 = 54;
                    break;
                default:
                    var10005 = 67;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
