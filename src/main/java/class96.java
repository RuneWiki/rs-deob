import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class96 {

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public int field1435;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field1431 = 0;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lma;")
    public static class5 field1436 = class12.method119("overlay", (byte) 111);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Lof;")
    public static class251 field1432;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lpg;")
    public static class295 field1433;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 15)
    public static void method616(byte arg0) {
        field1436 = null;
        field1433 = null;
        if (arg0 == -14) {
            field1432 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(IIIIIIZ)V", line = 41)
    public class96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1435 = arg5;
        this.field1434 = arg2;
    }
}
