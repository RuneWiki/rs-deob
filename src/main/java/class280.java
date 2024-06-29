import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public abstract class class280 {

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Lms;")
    public static class363 field3854 = null;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Lcs;")
    public static class351 field3853 = new class351(48, 3);

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Z")
    public static volatile boolean field3857 = true;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "[I")
    public static int[] field3860;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Lll;")
    public static class248 field3859;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "[I")
    public static int[] field3862;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "F")
    public static float field3861;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field3856;

    static {
        new class112("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field3858 = 500;
        field3860 = new int[64];
        field3859 = new class248("LOCAL", 4);
        field3862 = new int[2];
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V", line = 3)
    public static void method1748(int arg0) {
        field3859 = null;
        field3853 = null;
        if (arg0 != -8) {
            field3861 = -0.710599F;
        }
        field3854 = null;
        field3862 = null;
        field3860 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Ljava/lang/String;", line = 21)
    public static final String method1749(int arg0, int arg1) {
        if (arg1 >= -119) {
            field3861 = -0.037271697F;
        }
        field3856++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class274.field3794.method695(-114, class487.field6867) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class228.field3229.method695(-117, class487.field6867) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 55)
    public static final void method1750(boolean arg0, String arg1) {
        field3855++;
        if (arg1.equals("")) {
            return;
        }
        class131.method793(class266.field3705, -48);
        class332.field4555++;
        if (!arg0) {
            class366.field5214.method2470((byte) -74, class42.method349(arg1, 1));
            class366.field5214.method2493((byte) -119, arg1);
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(Lkm;I)V")
    public abstract void method197(class487 arg0, int arg1);

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lkm;BII)Z")
    public abstract boolean method199(class487 arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(Lkm;I)Lto;")
    public abstract class370 method193(class487 arg0, int arg1);

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILkm;IZILkj;B)V")
    public abstract void method198(int arg0, class487 arg1, int arg2, boolean arg3, int arg4, class280 arg5, byte arg6);

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)Z")
    public abstract boolean method195(int arg0);

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public abstract void method202(byte arg0);
}
