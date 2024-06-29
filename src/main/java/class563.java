import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class563 {

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public int field8228 = 128;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
    public int field8236 = 128;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
    public int field8237;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public int field8227;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public int field8230;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public int field8232;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "[I")
    public static int[] field8229 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "Liba;")
    public static class211 field8234 = new class211(24, 7);

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "Lwfa;")
    public static class153 field8235;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V", line = 6)
    public static void method3252(int arg0) {
        if (arg0 == -21590) {
            field8234 = null;
            field8235 = null;
            field8229 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)Lcs;", line = 22)
    public final class563 method3253(byte arg0) {
        if (arg0 < 12) {
            this.method3254(108, null);
        }
        field8233++;
        return new class563(this.field8237, this.field8236, this.field8228, this.field8232, this.field8227, this.field8230);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILcs;)V", line = 33)
    public final void method3254(int arg0, class563 arg1) {
        this.field8228 = arg1.field8228;
        if (arg0 >= -70) {
            this.method3254(-104, null);
        }
        field8231++;
        this.field8236 = arg1.field8236;
        this.field8232 = arg1.field8232;
        this.field8230 = arg1.field8230;
        this.field8237 = arg1.field8237;
        this.field8227 = arg1.field8227;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(I)V", line = 66)
    public class563(int arg0) {
        this.field8237 = arg0;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(IIIIII)V", line = 73)
    private class563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8227 = arg4;
        this.field8228 = arg2;
        this.field8236 = arg1;
        this.field8237 = arg0;
        this.field8230 = arg5;
        this.field8232 = arg3;
    }
}
