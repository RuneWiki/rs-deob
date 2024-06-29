import java.awt.Frame;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!w")
public class class41 {

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "Lta;")
    public static class37 field533 = class20.method87(-107, "Axe Shop");

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "Lta;")
    public static class37 field534 = class20.method87(-91, "world");

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "Lta;")
    public static class37 field535 = class20.method87(-99, "Spinning Wheel");

    @OriginalMember(owner = "mapview!w", name = "g", descriptor = "Lta;")
    public static class37 field539 = class20.method87(-118, "Key");

    @OriginalMember(owner = "mapview!w", name = "f", descriptor = "Lp;")
    public static class30 field538 = null;

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "Lta;")
    public static class37 field536 = class20.method87(-125, "Windmill");

    @OriginalMember(owner = "mapview!w", name = "h", descriptor = "Lta;")
    public static class37 field540 = class20.method87(-105, "");

    @OriginalMember(owner = "mapview!w", name = "i", descriptor = "Lta;")
    public static class37 field541 = class20.method87(-96, "Fishing Spot");

    @OriginalMember(owner = "mapview!w", name = "j", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "mapview!w", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field537;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(I[BII)Lta;", line = 7)
    public static final class37 method263(int arg0, byte[] arg1, int arg2, int arg3) {
        class37 var4 = new class37();
        var4.field509 = 0;
        var4.field499 = new byte[arg3];
        int var5 = arg2;
        if (arg0 != -26007) {
            return (class37) null;
        }
        while (var5 < arg2 + arg3) {
            if (arg1[var5] != 0) {
                var4.field499[var4.field509++] = arg1[var5];
            }
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(I)I", line = 41)
    public static final int method264(int arg0) {
        if (arg0 != 0) {
            method267(-63);
        }
        if (class15.field163 == null) {
            return 0;
        } else if (class15.field163.field441 == null) {
            return class1.field10[class15.field163.field439 & 0xFF];
        } else {
            return class1.field10[class15.field163.field441[class11.field127] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(B)V", line = 61)
    public static final void method265(byte arg0) {
        if (arg0 != -120) {
            field535 = null;
        }
        if (class21.field238 != null) {
            class12 var1 = class21.field238;
            synchronized (class21.field238) {
                class21.field238 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V", line = 81)
    public static final void method266(byte arg0, String arg1, Throwable arg2) {
        try {
            String var3 = "";
            if (arg0 != -97) {
                method263(50, null, 53, 40);
            }
            if (arg2 != null) {
                var3 = class36.method220(arg0 ^ 0xFFFFEEA6, arg2);
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
            if (class4.field42.field36 == null) {
                return;
            }
            class19 var8 = class4.field42.method11((byte) 43, new URL(class4.field42.field36.getCodeBase(), "clienterror.ws?c=" + field542 + "&u=" + class7.field88 + "&v1=" + class3.field23 + "&v2=" + class3.field35 + "&e=" + var7));
            while (var8.field182 == 0) {
                class30.method183(1L, arg0 ^ 0xFFFFFC77);
            }
            if (var8.field182 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field185;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(I)V", line = 136)
    public static void method267(int arg0) {
        field534 = null;
        field539 = null;
        field533 = null;
        field541 = null;
        field536 = null;
        field537 = null;
        field540 = null;
        if (arg0 != 0) {
            field536 = null;
        }
        field535 = null;
    }
}
