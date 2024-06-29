import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class154 {

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lb;")
    private class201 field2295;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public int field2290;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field2292 = -1;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Z")
    public static boolean field2294 = true;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII)V")
    public static final void method969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2293++;
        int var10 = arg4 + 1;
        class103.method579((byte) 115, arg2, arg3, arg0, class128.field1676[arg4]);
        int var9 = arg1 - 1;
        class103.method579((byte) 115, arg2, arg3, arg0, class128.field1676[arg1]);
        if (arg5 == -1) {
            for (int var6 = var10; var6 <= var9; var6++) {
                int[] var7 = class128.field1676[var6];
                var7[arg2] = var7[arg3] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lea;ILb;)V")
    public class154(class353 arg0, int arg1, class201 arg2) {
        new class232(64);
        this.field2295 = arg2;
        this.field2290 = this.field2295.method1235(0, 15);
    }

    static {
        new class326("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field2296 = 1405;
    }
}
