import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class class15 extends Canvas {

    @OriginalMember(owner = "mapview!i", name = "h", descriptor = "Ljava/awt/Component;")
    private Component field248;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "Lj;")
    public static class17 field241 = class30.method190(-107, "Fishing Spot");

    @OriginalMember(owner = "mapview!i", name = "f", descriptor = "[J")
    public static long[] field246 = new long[32];

    @OriginalMember(owner = "mapview!i", name = "i", descriptor = "Lj;")
    public static class17 field249 = class30.method190(-94, "Next page");

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "Lj;")
    public static class17 field242 = class30.method190(-128, "Anvil");

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "Lj;")
    public static class17 field244 = class30.method190(-102, "Loading )3)3)3");

    @OriginalMember(owner = "mapview!i", name = "j", descriptor = "Lj;")
    public static class17 field250 = class30.method190(-92, "Cooking Range");

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "Lj;")
    public static class17 field245 = class30.method190(-97, "Hunter Store");

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "Lj;")
    public static class17 field243 = class30.method190(-87, "Transportation");

    @OriginalMember(owner = "mapview!i", name = "g", descriptor = "Lo;")
    public static class27 field247;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(IILt;I)Lfa;", line = 7)
    public static final class10 method103(int arg0, int arg1, class34 arg2, int arg3) {
        if (class8.method76(arg3, arg1, arg2, (byte) -86)) {
            if (arg0 != -3492) {
                field242 = null;
            }
            return class34.method234(arg0 ^ 0xFFFFC6C9);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 23)
    public static final void method104(byte arg0, Component arg1) {
        arg1.addMouseListener(class28.field367);
        arg1.addMouseMotionListener(class28.field367);
        if (arg0 < 6) {
            method107(40, 1, -87);
        }
        arg1.addFocusListener(class28.field367);
    }

    @OriginalMember(owner = "mapview!i", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 38)
    public final void update(Graphics arg0) {
        this.field248.update(arg0);
    }

    @OriginalMember(owner = "mapview!i", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 55)
    public final void paint(Graphics arg0) {
        this.field248.paint(arg0);
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(I)Z", line = 66)
    public static final boolean method105(int arg0) {
        class23 var1 = class28.field364;
        synchronized (class28.field364) {
            if (class26.field338 == class11.field219) {
                return false;
            } else {
                class24.field323 = class18.field278[class11.field219];
                class24.field316 = class1.field74[class11.field219];
                class11.field219 = class11.field219 - arg0 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "(I)V", line = 93)
    public static void method106(int arg0) {
        field250 = null;
        field243 = null;
        field246 = null;
        if (arg0 != 38) {
            field244 = null;
        }
        field242 = null;
        field244 = null;
        field241 = null;
        field249 = null;
        field247 = null;
        field245 = null;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(III)B", line = 114)
    public static final byte method107(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 6;
        if (arg1 != 0) {
            return 65;
        }
        int var4 = arg2 >> 6;
        if (class20.field293[var3][var4] == null) {
            return 0;
        } else if (class20.field293[var3][var4].field366 == null) {
            return class20.field293[var3][var4].field362;
        } else {
            return class20.field293[var3][var4].field366[(arg0 & 0xFC0) + arg2 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V", line = 152)
    public static final void method108(String arg0, int arg1, Throwable arg2) {
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class30.method194(108, arg2);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            if (arg1 <= 46) {
                field247 = null;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class37 var8 = class17.field258.method69(-77, new URL(class17.field258.field139.getCodeBase(), "clienterror.ws?c=" + class6.field125 + "&u=" + class11.field226 + "&v1=" + class7.field141 + "&v2=" + class7.field140 + "&e=" + var7));
            while (var8.field458 == 0) {
                class26.method177(25, 1L);
            }
            if (var8.field458 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field459;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 203)
    public class15(Component arg0) {
        this.field248 = arg0;
    }
}
