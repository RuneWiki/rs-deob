import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class366 {

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    public int field4812 = 128;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public int field4806 = 128;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    public int field4811;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "I")
    public int field4813;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public int field4808;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public int field4807;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "Lcea;")
    public static class180 field4815 = new class180("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "[I")
    public static int[] field4817;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
    public static void method2045(int arg0) {
        field4815 = null;
        if (arg0 == 128) {
            field4817 = null;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4816++;
        int var10 = 127 / ((42 - arg8) / 33);
        class541 var11 = null;
        for (class541 var12 = (class541) class54.field461.method1050((byte) 73); var12 != null; var12 = (class541) class54.field461.method1047(-7962)) {
            if (var12.field7914 == arg7 && var12.field7913 == arg4 && var12.field7901 == arg6 && var12.field7912 == arg5) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class541();
            var11.field7901 = arg6;
            var11.field7912 = arg5;
            var11.field7914 = arg7;
            var11.field7913 = arg4;
            if (arg4 >= 0 && arg6 >= 0 && arg4 < class106.field1289 && class422.field5452 > arg6) {
                class7.method41(var11, -73);
            }
            class54.field461.method1040(var11, -120);
        }
        var11.field7908 = arg3;
        var11.field7900 = arg9;
        var11.field7905 = arg0;
        var11.field7909 = arg1;
        var11.field7907 = arg2;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)Lst;")
    public final class366 method2047(byte arg0) {
        int var2 = 53 / ((arg0 - 2) / 42);
        field4809++;
        return new class366(this.field4811, this.field4812, this.field4806, this.field4807, this.field4813, this.field4808);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lst;I)V")
    public final void method2048(class366 arg0, int arg1) {
        this.field4811 = arg0.field4811;
        this.field4806 = arg0.field4806;
        if (arg1 <= 32) {
            return;
        }
        this.field4812 = arg0.field4812;
        this.field4813 = arg0.field4813;
        this.field4808 = arg0.field4808;
        field4814++;
        this.field4807 = arg0.field4807;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Ln;ILdn;)V")
    public static final void method2049(class17 arg0, int arg1, class438 arg2) {
        field4810++;
        class559.field8238 = arg2;
        class98.field1217 = arg0;
        if (arg1 != 23197) {
            field4815 = null;
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(I)V")
    public class366(int arg0) {
        this.field4811 = arg0;
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(IIIIII)V")
    private class366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4806 = arg2;
        this.field4813 = arg4;
        this.field4808 = arg5;
        this.field4812 = arg1;
        this.field4811 = arg0;
        this.field4807 = arg3;
    }
}
