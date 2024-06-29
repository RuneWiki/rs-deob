import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class class10 {

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "Z")
    public static boolean field93 = false;

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "Lna;")
    public static class26 field94 = class33.method219("???", 105);

    @OriginalMember(owner = "mapview!f", name = "e", descriptor = "Lna;")
    public static class26 field96 = class33.method219("Pub)4Bar", 87);

    @OriginalMember(owner = "mapview!f", name = "d", descriptor = "Lpa;")
    public static class30 field95 = new class30();

    @OriginalMember(owner = "mapview!f", name = "g", descriptor = "Lna;")
    public static class26 field98 = class33.method219("Altar", 111);

    @OriginalMember(owner = "mapview!f", name = "j", descriptor = "J")
    public static volatile long field101 = 0L;

    @OriginalMember(owner = "mapview!f", name = "k", descriptor = "Lna;")
    public static class26 field102 = class33.method219("overlay)3dat", 104);

    @OriginalMember(owner = "mapview!f", name = "h", descriptor = "Lm;")
    public static class23 field99;

    @OriginalMember(owner = "mapview!f", name = "f", descriptor = "Ljava/lang/String;")
    public static String field97;

    @OriginalMember(owner = "mapview!f", name = "i", descriptor = "[I")
    public static int[] field100;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "[I")
    public static int[] field92;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V", line = 9)
    public static final void method49(Throwable arg0, String arg1, int arg2) {
        try {
            String var3 = "";
            int var4 = -45 % ((arg2 - 1) / 33);
            if (arg0 != null) {
                var3 = class29.method197(arg0, 5);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var5 = var3.replace(':', '.');
            String var6 = var5.replace('@', '_');
            String var7 = var6.replace('&', '_');
            String var8 = var7.replace('#', '_');
            if (class38.field507.field142 == null) {
                return;
            }
            class7 var9 = class38.field507.method79(-127, new URL(class38.field507.field142.getCodeBase(), "clienterror.ws?c=" + class12.field115 + "&u=" + class32.field470 + "&v1=" + class14.field141 + "&v2=" + class14.field138 + "&e=" + var8));
            while (var9.field74 == 0) {
                class34.method228(1L, true);
            }
            if (var9.field74 == 1) {
                DataInputStream var10 = (DataInputStream) var9.field75;
                var10.read();
                var10.close();
            }
        } catch (Exception var12) {
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Z)J", line = 78)
    public static final synchronized long method50(boolean arg0) {
        long var1 = System.currentTimeMillis();
        if (class32.field466 > var1) {
            class24.field258 += class32.field466 - var1;
        }
        if (arg0) {
            return -30L;
        } else {
            class32.field466 = var1;
            return class24.field258 + var1;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Lh;Ljava/lang/Object;I)V", line = 112)
    public static final void method51(class14 arg0, Object arg1, int arg2) {
        if (arg0.field147 == null) {
            return;
        }
        if (arg2 > -69) {
            method50(true);
        }
        for (int var3 = 0; var3 < 50 && arg0.field147.peekEvent() != null; var3++) {
            class34.method228(1L, true);
        }
        if (arg1 != null) {
            arg0.field147.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(I)V", line = 139)
    public static void method52(int arg0) {
        if (arg0 > -41) {
            field96 = null;
        }
        field98 = null;
        field96 = null;
        field94 = null;
        field99 = null;
        field100 = null;
        field92 = null;
        field97 = null;
        field95 = null;
        field102 = null;
    }
}
