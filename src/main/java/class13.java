import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class class13 {

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lsv;")
    public static class570 field159 = new class570(51, 4);

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lpf;")
    public static class30 field160 = new class30();

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Lin;")
    public static class380 field161 = new class380(112, 3);

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Lgga;")
    public static class513 field162;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)[B")
    public abstract byte[] method163(int arg0, int arg1);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Lwu;")
    public abstract class170 method164(byte arg0);

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)V")
    public abstract void method165(int arg0, int arg1);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method166(int arg0) {
        field159 = null;
        field160 = null;
        field161 = null;
        field162 = null;
        if (arg0 != -16368) {
            method166(12);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)I")
    public abstract int method167(byte arg0, int arg1);
}
