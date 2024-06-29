import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class454 {

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
    public static int field6756 = 0;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "Lmf;")
    public static class291 field6754;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "Lph;")
    public static class459 field6753;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILph;I)Let;")
    public static final class424 method2712(int arg0, class459 arg1, int arg2) {
        field6755++;
        byte[] var3 = arg1.method2760((byte) 119, arg0);
        if (var3 == null) {
            return null;
        } else {
            int var4 = 87 / ((arg2 + 45) / 32);
            return new class424(var3);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
    public static void method2713(int arg0) {
        field6753 = null;
        if (arg0 == -30451) {
            field6754 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method2714(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class418.field6293 = arg2;
        class509.field7428 = arg6;
        class524.field7614 = arg1;
        class335.field5063 = arg4;
        class144.field2437 = arg5;
        field6751++;
        if (arg0) {
            field6752 = 38;
        }
        class447.field6663 = arg3;
    }
}
