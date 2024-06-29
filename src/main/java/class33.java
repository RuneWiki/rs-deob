import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class class33 {

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field455 = -2;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "[[I")
    public static int[][] field456 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Ldp;")
    public static class347 field454 = new class347("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field457 = 0;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Laa;")
    public static class76 field458 = new class76(81, 2);

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Lgn;")
    public static class526 field459 = new class526(0, 4);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)[B")
    public abstract byte[] method282(int arg0);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)[B")
    public abstract byte[] method283(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([BI)V")
    public abstract void method284(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method285(byte arg0) {
        field459 = null;
        field454 = null;
        field458 = null;
        int var1 = 25 % ((68 - arg0) / 41);
        field456 = null;
    }
}
