import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class234 {

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "Lmt;")
    public static class321 field3854;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "[B")
    public byte[] field3857;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "[S")
    public short[] field3855;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "[S")
    public short[] field3856;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "[S")
    public short[] field3862;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public static void method1658(int arg0) {
        field3854 = null;
        int var1 = 84 / ((26 - arg0) / 63);
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V")
    public static final void method1659(int arg0) {
        field3859++;
        int[] var1 = new int[class337.field5262.field4840];
        int var2 = arg0;
        for (int var3 = 0; var3 < class337.field5262.field4840; var3++) {
            class196 var5 = class337.field5262.method2077((byte) -65, var3);
            if (var5.field2989 >= 0 || var5.field3024 >= 0) {
                var1[var2++] = var3;
            }
        }
        class279.field4422 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class279.field4422[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIII)V")
    public static final void method1660(int arg0, int arg1, int arg2, int arg3) {
        class416.field6309 = new byte[arg2][arg0][arg1];
        field3858++;
        if (arg3 < 31) {
            field3861 = -33;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILza;)V")
    public static final void method1661(int arg0, class497 arg1) {
        if (class377.field5794) {
            class147.method894(arg1, (byte) 66);
        } else {
            class156.method957(arg1, true);
        }
        field3860++;
        if (arg0 != 0) {
            field3854 = null;
        }
    }

    static {
        new class213("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field3861 = 0;
    }
}
