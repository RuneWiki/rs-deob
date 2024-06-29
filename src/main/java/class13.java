import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class13 {

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Lde;")
    public static class10 field140;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "[I")
    public static int[] field141;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Lwg;")
    public static class41 field136;

    static {
        new class157("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field140 = new class10(15, 0, 1, 0);
        field141 = new int[6];
        field142 = 0;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILsv;)Leg;", line = 9)
    public static final class34 method90(int arg0, class319 arg1) {
        arg1.method1869(-104);
        field139++;
        int var2 = arg1.method1869(-89);
        class34 var3 = class343.method2073(var2, 5255);
        if (arg0 >= -59) {
            method92((byte) 72);
        }
        var3.field519 = arg1.method1869(-105);
        int var4 = arg1.method1869(-126);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1869(-116);
            var3.method69(arg1, 37, var6);
        }
        var3.method146((byte) -120);
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZII)V", line = 46)
    public static final void method91(boolean arg0, int arg1, int arg2) {
        field138++;
        class314 var3 = class177.method1213(arg0, 12, arg1);
        var3.method1808(-7412);
        var3.field4253 = arg2;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V", line = 60)
    public static void method92(byte arg0) {
        field136 = null;
        if (arg0 != 6) {
            field142 = -10;
        }
        field140 = null;
        field141 = null;
    }
}
