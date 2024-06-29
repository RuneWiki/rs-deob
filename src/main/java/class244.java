import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class244 {

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "Ltm;")
    public static class112 field3447 = new class112("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "Z")
    public static boolean field3449 = false;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "Lfn;")
    public static class52 field3450 = new class52(11, 1);

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "Lcs;")
    public static class351 field3451 = new class351(55, 0);

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "F")
    public static float field3452 = 0.0F;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "Z")
    public static boolean field3453;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "Lfn;")
    public static class52 field3454;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "[I")
    public static int[] field3455;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
    public static void method1523(int arg0) {
        field3447 = null;
        field3454 = null;
        field3450 = null;
        field3455 = null;
        field3451 = null;
        if (arg0 != 16) {
            field3451 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIII)V")
    public static final void method1524(int arg0, int arg1, int arg2, int arg3) {
        class406 var4 = class455.field6293[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class87 var5 = var4.field5625;
        class87 var6 = var4.field5608;
        if (var5 != null) {
            var5.field1331 = var5.field1331 * arg3 / 16;
            var5.field1332 = var5.field1332 * arg3 / 16;
        }
        if (var6 != null) {
            var6.field1331 = var6.field1331 * arg3 / 16;
            var6.field1332 = var6.field1332 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IB)V")
    public static final void method1525(int arg0, byte arg1) {
        field3448++;
        class265 var2 = class440.method2554(arg0, 2, 6);
        var2.method1677(21748);
        if (arg1 != 16) {
            method1523(20);
        }
    }

    static {
        new class112("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field3453 = true;
        field3454 = new class52(26, 6);
        field3455 = new int[32];
    }
}
