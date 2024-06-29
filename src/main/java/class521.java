import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class521 extends class334 {

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "[I")
    public static int[] field7716;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method3117(int arg0) {
        field7717++;
        class523.field7733.method2189(false);
        if (arg0 != 0) {
            method3117(-20);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)V")
    public static void method3118(boolean arg0) {
        field7716 = null;
        if (arg0) {
            field7716 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)V")
    public static final void method3119(byte arg0, int arg1) {
        field7718++;
        if (class240.field3908 == null) {
            class240.field3908 = new byte[4][class135.field1839][class197.field3038];
        }
        int var2 = 0;
        if (arg1 > -46) {
            method3118(false);
        }
        while (var2 < 4) {
            for (int var3 = 0; var3 < class135.field1839; var3++) {
                for (int var4 = 0; var4 < class197.field3038; var4++) {
                    class240.field3908[var2][var3][var4] = arg0;
                }
            }
            var2++;
        }
    }

    static {
        new class213("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
    }
}
