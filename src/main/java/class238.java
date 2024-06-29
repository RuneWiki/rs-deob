import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class238 {

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field3533 = 0;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "[[I")
    public static int[][] field3536;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public static final void method1599(int arg0) {
        field3534++;
        if (arg0 != -22428 || !class157.field2118) {
            return;
        }
        while (true) {
            while (class388.field5681 < class223.field3277.length) {
                class177 var1 = class223.field3277[class388.field5681];
                if (var1 != null && var1.field2446 == -1) {
                    if (class241.field3581 == null) {
                        class241.field3581 = class67.field893.method1852(0, var1.field2448);
                    }
                    int var2 = class241.field3581.field5771;
                    if (var2 == -1) {
                        return;
                    }
                    var1.field2446 = var2;
                    class241.field3581 = null;
                    class388.field5681++;
                } else {
                    class388.field5681++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIBI)V")
    public static final void method1600(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3535++;
        int var5 = 44 % ((arg3 + 52) / 49);
        if (class309.field4559 == 1) {
            class328.field4886[class31.field435 / 100].method1915(class56.field688 - 8, class150.field2043 + -8);
        }
        if (class309.field4559 == 2) {
            class328.field4886[class31.field435 / 100 + 4].method1915(class56.field688 - 8, class150.field2043 + -8);
        }
        class409.method2541(95);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
    public static void method1601(byte arg0) {
        if (arg0 != 46) {
            method1601((byte) -107);
        }
        field3536 = null;
    }

    static {
        new class409("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field3536 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
        field3537 = -1;
    }
}
