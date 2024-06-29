import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class556 {

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public int field7076 = 128;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public int field7075 = 128;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    public int field7079;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public int field7072;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
    public int field7078;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public int field7071;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "[I")
    public static int[] field7074 = new int[14];

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)Lgr;")
    public final class556 method3018(byte arg0) {
        if (arg0 != 100) {
            this.method3018((byte) 8);
        }
        field7077++;
        return new class556(this.field7079, this.field7075, this.field7076, this.field7072, this.field7078, this.field7071);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILgr;)V")
    public final void method3019(int arg0, class556 arg1) {
        this.field7078 = arg1.field7078;
        this.field7075 = arg1.field7075;
        this.field7071 = arg1.field7071;
        this.field7079 = arg1.field7079;
        int var3 = 69 / ((-arg0 - 70) / 41);
        field7073++;
        this.field7072 = arg1.field7072;
        this.field7076 = arg1.field7076;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public static void method3020(int arg0) {
        if (arg0 != 5571) {
            field7074 = null;
        }
        field7074 = null;
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(I)V")
    public class556(int arg0) {
        this.field7079 = arg0;
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(IIIIII)V")
    private class556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7076 = arg2;
        this.field7079 = arg0;
        this.field7072 = arg3;
        this.field7078 = arg4;
        this.field7071 = arg5;
        this.field7075 = arg1;
    }
}
