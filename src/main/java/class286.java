import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class286 extends class154 {

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "Lrk;")
    public static class14 field5044 = null;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "Leg;")
    public static class37 field5045 = class174.method1167(" autres options", -59);

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "Lbf;")
    public static class202 field5043 = new class202(64);

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "J")
    public static volatile long field5049 = 0L;

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "[I")
    public static int[] field5051 = new int[5];

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "I")
    public static int field5050 = 0;

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "[[[Lw;")
    public static class111[][][] field5048;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        if (arg1 == 1075962732) {
            field5047++;
            return class239.field4263;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)V")
    public static void method1917(byte arg0) {
        field5043 = null;
        field5048 = null;
        if (arg0 >= -80) {
            field5045 = null;
        }
        field5051 = null;
        field5045 = null;
        field5044 = null;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class286() {
        super(0, true);
    }
}
