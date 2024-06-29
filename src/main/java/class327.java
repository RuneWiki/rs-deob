import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class327 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Lhe;")
    public static class94 field5579 = new class94(32);

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field5584 = 0;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "Lsf;")
    public static class108 field5585 = class140.method973(255, "unzap");

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Lsf;")
    private static class108 field5581 = class140.method973(255, "Select");

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Lsf;")
    public static class108 field5583 = field5581;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "[[[B")
    public static byte[][][] field5582;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "[[[B")
    public static byte[][][] field5586;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V", line = 7)
    public static final void method2230(int arg0, int arg1) {
        field5580++;
        class120 var2 = class248.method1704(arg0, 47, arg1);
        var2.method843((byte) 28);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILik;)V", line = 27)
    public static final void method2231(int arg0, class262 arg1) {
        class227.field3985 = arg1;
        class72.field1099 = class227.field3985.method1876(arg0, (byte) -88);
        field5578++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 52)
    public static void method2232(int arg0) {
        if (arg0 >= -102) {
            method2230(-88, 55);
        }
        field5586 = (byte[][][]) null;
        field5585 = null;
        field5581 = null;
        field5583 = null;
        field5579 = null;
        field5582 = (byte[][][]) null;
    }
}
