import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class603 implements class721 {

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public int field8437;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field8439 = new String[100];

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "J")
    public static long field8443 = 0L;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "F")
    public static float field8441;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public static int field8442;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "Lod;")
    public static class534 field8440;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "[[B")
    public static byte[][] field8438;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)Laca;")
    public final class758 method228(int arg0) {
        field8442++;
        return arg0 == 1 ? class325.field4443 : null;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(I)V")
    public class603(int arg0) {
        this.field8437 = arg0;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
    public static void method3423(byte arg0) {
        if (arg0 >= -54) {
            field8440 = null;
        }
        field8439 = null;
        field8438 = null;
        field8440 = null;
    }
}
