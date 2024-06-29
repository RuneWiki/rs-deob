import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class269 {

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field3930 = 0;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lsf;")
    public static class143 field3933 = new class143(8);

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Z")
    public static boolean field3931;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "[I")
    public static int[] field3934;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLil;)V")
    public static final void method1731(byte arg0, class265 arg1) {
        int var2 = 0;
        if (arg0 != -67) {
            field3930 = -112;
        }
        while (class444.field6470 > var2) {
            int var3 = arg1.method1680(-1647926640);
            int var4 = arg1.method1685(8104);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class168.field2208[var3] != null) {
                class168.field2208[var3].field3444 = var4;
            }
            var2++;
        }
        field3932++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method1732(int arg0) {
        if (arg0 == -16033) {
            field3933 = null;
            field3934 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
    public static final void method1733(int arg0, int arg1) {
        class394.field5916.method215(arg1 + arg1, arg0);
        field3935++;
    }
}
