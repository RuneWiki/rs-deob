import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class379 {

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "J")
    public long field5279;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "[S")
    public short[] field5283;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "[S")
    public short[] field5282;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "[I")
    public int[] field5277;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field5278 = 0;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field5281 = -1;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "[I")
    public static int[] field5284;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "[Ldga;")
    public static class208[] field5280;

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(J[I[S[S)V", line = 13)
    public class379(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field5279 = arg0;
        this.field5283 = arg3;
        this.field5282 = arg2;
        this.field5277 = arg1;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V", line = 23)
    protected class379() {
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 31)
    public static void method2242(byte arg0) {
        if (arg0 > -2) {
            field5280 = null;
        }
        field5280 = null;
        field5284 = null;
    }
}
