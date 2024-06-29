import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public class class26 extends Canvas {

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field248;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "[I")
    public static int[] field246 = new int[256];

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "Lu;")
    public static class38 field247 = class28.method177("Amulet Shop", (byte) -84);

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "Lu;")
    public static class38 field249 = class28.method177("-5bersicht", (byte) -84);

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "I")
    public static volatile int field250;

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "Lu;")
    public static class38 field251;

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "Lu;")
    public static class38 field252;

    @OriginalMember(owner = "mapview!ma", name = "h", descriptor = "Lu;")
    public static class38 field253;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Z)V", line = 11)
    public static final void method150(boolean arg0) {
        if (++class17.field168 >= 64) {
            class17.field168 = 0;
            class29.field363++;
            if (class29.field362 >> 6 > class29.field363) {
                class30.method182((byte) -7);
            }
        }
        if (!arg0) {
            field253 = null;
        }
        class22.field213 = (class17.field168 << 6) + class32.field396;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(I)V", line = 35)
    public static final void method151(int arg0) {
        if (arg0 > -57) {
            method152(true, 43);
        }
        if (class39.field499.toLowerCase().indexOf("microsoft") != -1) {
            class34.field423[191] = 73;
            class34.field423[223] = 28;
            class34.field423[192] = 58;
            class34.field423[187] = 27;
            class34.field423[190] = 72;
            class34.field423[189] = 26;
            class34.field423[186] = 57;
            class34.field423[222] = 59;
            class34.field423[221] = 43;
            class34.field423[188] = 71;
            class34.field423[220] = 74;
            class34.field423[219] = 42;
            return;
        }
        class34.field423[91] = 42;
        class34.field423[92] = 74;
        class34.field423[61] = 27;
        class34.field423[45] = 26;
        class34.field423[47] = 73;
        class34.field423[93] = 43;
        class34.field423[59] = 57;
        class34.field423[44] = 71;
        if (class39.field504 == null) {
            class34.field423[222] = 59;
            class34.field423[192] = 58;
        } else {
            class34.field423[192] = 28;
            class34.field423[520] = 59;
            class34.field423[222] = 58;
        }
        class34.field423[46] = 72;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(ZI)Lu;", line = 84)
    public static final class38 method152(boolean arg0, int arg1) {
        return arg0 ? (class38) null : class19.method109(10, 46, false, arg1);
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(I)V", line = 94)
    public static void method153(int arg0) {
        field247 = null;
        field252 = null;
        field251 = null;
        field253 = null;
        if (arg0 >= -88) {
            field250 = -56;
        }
        field249 = null;
        field246 = null;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Ljava/lang/Object;ZLua;)V", line = 109)
    public static final void method154(Object arg0, boolean arg1, class39 arg2) {
        if (arg1 || arg2.field512 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field512.peekEvent() != null; var3++) {
            class11.method53(0, 1L);
        }
        if (arg0 != null) {
            arg2.field512.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field246[var0] = var1;
        }
        field250 = -1;
        field251 = class28.method177("Transportation", (byte) -84);
        field252 = class28.method177("Skirt Shop", (byte) -84);
        field253 = class28.method177("Shield Shop", (byte) -84);
    }

    @OriginalMember(owner = "mapview!ma", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 135)
    public final void update(Graphics arg0) {
        this.field248.update(arg0);
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V", line = 151)
    public static final void method155(byte arg0, String arg1, Throwable arg2) {
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = mapview.method157(arg2, (byte) 105);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class38.field478.field514 == null) {
                return;
            }
            class41 var8 = class38.field478.method248(new URL(class38.field478.field514.getCodeBase(), "clienterror.ws?c=" + class28.field356 + "&u=" + class20.field203 + "&v1=" + class39.field499 + "&v2=" + class39.field501 + "&e=" + var7), -4155);
            while (var8.field524 == 0) {
                class11.method53(0, 1L);
            }
            if (var8.field524 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field522;
                var9.read();
                var9.close();
            }
            int var10 = -76 / ((-arg0 - 61) / 44);
        } catch (Exception var12) {
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 211)
    public class26(Component arg0) {
        this.field248 = arg0;
    }

    @OriginalMember(owner = "mapview!ma", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 221)
    public final void paint(Graphics arg0) {
        this.field248.paint(arg0);
    }
}
