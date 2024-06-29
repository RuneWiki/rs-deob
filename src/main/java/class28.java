import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public abstract class class28 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "[I")
    public static int[] field254 = new int[64];

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Lvj;")
    public static class382 field255;

    static {
        new class487("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 7)
    public static void method124(int arg0) {
        if (arg0 != 90) {
            method124(-3);
        }
        field255 = null;
        field254 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)I", line = 20)
    public static final int method125(boolean arg0) {
        field253++;
        class167 var1 = class379.field5558;
        boolean var2 = arg0;
        if (class239.field3499 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class167.method1062(0, 0, var3, null, null, 0);
            var2 = true;
        }
        long var4 = class450.method2719((byte) -51);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method1039(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class450.method2719((byte) -52) - var4);
        var1.method1066((byte) 61, 0, -16777216, 0, 100, 100);
        if (var2) {
            var1.method1061(127);
        }
        return var7;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILvn;)Lvn;")
    public abstract class331 method123(int arg0, class331 arg1);
}
