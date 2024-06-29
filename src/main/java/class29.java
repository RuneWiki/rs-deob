import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public class class29 extends Canvas {

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field401;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "La;")
    public static class1 field398 = class3.method36("-5bersicht", -96);

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "La;")
    public static class1 field399 = class3.method36("b12_full", -111);

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "La;")
    public static class1 field404 = class3.method36("Kebab Seller", -128);

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field402;

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "[I")
    public static int[] field403;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(B)V", line = 7)
    public static void method191(byte arg0) {
        int var1 = -38 / ((arg0 + 16) / 38);
        field403 = null;
        field399 = null;
        field404 = null;
        field402 = null;
        field398 = null;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V", line = 24)
    public static final void method192(int arg0, Throwable arg1, String arg2) {
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class4.method42(71, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            if (arg0 > -101) {
                field400 = -127;
            }
            String var7 = var6.replace('#', '_');
            if (class31.field427.field147 == null) {
                return;
            }
            class15 var8 = class31.field427.method82(9, new URL(class31.field427.field147.getCodeBase(), "clienterror.ws?c=" + class41.field525 + "&u=" + class39.field495 + "&v1=" + class17.field146 + "&v2=" + class17.field156 + "&e=" + var7));
            while (var8.field136 == 0) {
                class1.method11(1L, (byte) -61);
            }
            if (var8.field136 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field135;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!p", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 73)
    public final void paint(Graphics arg0) {
        this.field401.paint(arg0);
    }

    @OriginalMember(owner = "mapview!p", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 110)
    public class29(Component arg0) {
        this.field401 = arg0;
    }

    @OriginalMember(owner = "mapview!p", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 120)
    public final void update(Graphics arg0) {
        this.field401.update(arg0);
    }
}
