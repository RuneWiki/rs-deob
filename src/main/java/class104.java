import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class104 {

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Lbf;")
    public static class372 field1446;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "Lsp;")
    public static class448 field1451;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "Z")
    public static boolean field1459;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "Z")
    public static boolean field1461;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "B")
    public byte field1438;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "B")
    public byte field1442;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "B")
    public byte field1443;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "B")
    public byte field1444;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "B")
    public byte field1445;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "B")
    public byte field1449;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "B")
    public byte field1450;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public int field1441;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "Ljn;")
    public static class503 field1460;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "Lin;")
    public static class60 field1458;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "S")
    public short field1454;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Z")
    public boolean field1435;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Z")
    public boolean field1437;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Z")
    public boolean field1439;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Z")
    public boolean field1440;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "Z")
    public boolean field1447;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "Z")
    public boolean field1448;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "Z")
    public boolean field1452;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "Z")
    public boolean field1453;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "Z")
    public boolean field1456;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method868(int arg0) {
        field1451 = null;
        field1458 = null;
        if (arg0 != 0) {
            field1458 = null;
        }
        field1460 = null;
        field1446 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZZI)V")
    public static final void method869(int arg0, boolean arg1, boolean arg2, int arg3) {
        field1457++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class312.field4449 = arg3;
        if (arg2) {
            field1460 = null;
        }
        class405.field6017 = arg0;
        class241.field3572 = arg1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZLuu;)Ljava/lang/String;")
    public static final String method870(int arg0, boolean arg1, class188 arg2) {
        field1455++;
        if (!client.method1380(arg2).method1783(arg0, 1) && arg2.field2643 == null) {
            return null;
        } else if (arg2.field2698 == null || arg2.field2698.length <= arg0 || arg2.field2698[arg0] == null || arg2.field2698[arg0].trim().length() == 0) {
            return class407.field6069 ? "Hidden-" + arg0 : null;
        } else {
            if (arg1) {
                field1461 = true;
            }
            return arg2.field2698[arg0];
        }
    }

    static {
        new class331("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field1446 = new class372(8, 3);
        field1451 = new class448("WTWIP", 3);
        new class331("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field1459 = false;
        field1461 = false;
        new class331("Use", "Benutzen", "Utiliser", "Usar");
    }
}
