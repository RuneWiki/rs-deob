import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class626 extends class573 {

    @OriginalMember(owner = "client!st", name = "h", descriptor = "[Lls;")
    public class148[] field8920;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "Lqj;")
    public static class511 field8921 = new class511(7, 3);

    @OriginalMember(owner = "client!st", name = "j", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)J")
    public static final long method3530(int arg0) {
        field8923++;
        if (arg0 != 0) {
            field8921 = null;
        }
        return class418.field5949.method898(-8905);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(II)I")
    public static final int method3531(int arg0, int arg1) {
        return class352.field4941 == null ? 0 : class352.field4941[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "([Lls;)V")
    public class626(class148[] arg0) {
        this.field8920 = arg0;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIB)V")
    public static final void method3532(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var8 = arg0 + 1;
        class223.method1484(class657.field9275[arg0], arg1, arg5 + 7, arg2, arg3);
        field8922++;
        int var9 = arg4 - 1;
        class223.method1484(class657.field9275[arg4], arg1, -125, arg2, arg3);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class657.field9275[var6];
            var7[arg3] = var7[arg1] = arg2;
        }
        if (arg5 != -122) {
            field8921 = null;
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(B)V")
    public static void method3533(byte arg0) {
        if (arg0 > 49) {
            field8921 = null;
        }
    }
}
