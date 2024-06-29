import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public abstract class class274 {

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "[Lhca;")
    public static class365[] field3603 = new class365[5];

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "[Lcg;")
    public static class11[] field3604 = new class11[300];

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Loa;B)Lpl;")
    public abstract class215 method71(class43 arg0, byte arg1);

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V")
    public static void method1662(int arg0) {
        field3603 = null;
        field3604 = null;
        if (arg0 != -1009) {
            field3604 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(Loa;I)V")
    public abstract void method67(class43 arg0, int arg1);

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "(Loa;I)Lcd;")
    public abstract class564 method72(class43 arg0, int arg1);

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "(B)V")
    public abstract void method77(byte arg0);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IILoa;ILcq;ZI)V")
    public abstract void method73(int arg0, int arg1, class43 arg2, int arg3, class274 arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)Z")
    public abstract boolean method78(int arg0);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IILoa;I)Z")
    public abstract boolean method74(int arg0, int arg1, class43 arg2, int arg3);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIII)V")
    public static final void method1663(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -13116) {
            return;
        }
        if (arg3 == 1008) {
            class709.method3893(class247.field3306, arg2, arg1);
        } else if (arg3 == 1010) {
            class709.method3893(class20.field224, arg2, arg1);
        } else if (arg3 == 1012) {
            class709.method3893(class700.field9769, arg2, arg1);
        } else if (arg3 == 1011) {
            class709.method3893(class303.field3934, arg2, arg1);
        } else if (arg3 == 1007) {
            class709.method3893(class328.field4260, arg2, arg1);
        }
        field3605++;
    }

    static {
        for (int var0 = 0; var0 < field3603.length; var0++) {
            field3603[var0] = new class365();
        }
    }
}
