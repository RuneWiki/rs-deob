import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public class class182 {

    @OriginalMember(owner = "client!mja", name = "c", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!mja", name = "b", descriptor = "[Lho;")
    public static class318[] field2292;

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "[[[J")
    public static long[][][] field2291;

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1153(boolean arg0) {
        if (arg0) {
            field2291 = null;
        }
        field2291 = null;
        field2292 = null;
    }
}
