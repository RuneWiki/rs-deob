import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class688 {

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field9763 = 0;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field9760;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "Lmn;")
    public class212 field9761;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "[Lf;")
    public static class257[] field9762;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)Lpn;", line = 14)
    public static final class295 method3879(int arg0) {
        field9760++;
        int var1 = -12 % ((-arg0 - 40) / 62);
        return class43.field585;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V", line = 24)
    public static void method3880(byte arg0) {
        int var1 = -65 / ((arg0 - 43) / 39);
        field9762 = null;
    }
}
