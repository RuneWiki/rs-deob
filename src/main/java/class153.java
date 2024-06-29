import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class153 {

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "[I")
    public static int[] field2678 = new int[32768];

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Lij;")
    public static class50 field2677 = class78.method578(122, "<img=1>");

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Lij;")
    public static class50 field2682 = class78.method578(125, "underlay)3dat");

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field2683 = 0;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "[I")
    public static int[] field2676;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[Loe;")
    public static class207[] field2681;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "[[[B")
    public static byte[][][] field2679;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method1082(int arg0) {
        field2677 = null;
        field2678 = null;
        field2681 = null;
        field2679 = null;
        field2676 = null;
        field2682 = null;
        if (arg0 <= 68) {
            field2676 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILda;Lda;I)Lqj;")
    public static final class152 method1083(int arg0, int arg1, class22 arg2, class22 arg3, int arg4) {
        if (arg0 != 27526) {
            method1082(66);
        }
        field2684++;
        return class79.method581((byte) -118, arg4, arg2, arg1) ? class254.method1721((byte) 24, arg3.method190((byte) -83, arg1, arg4)) : null;
    }
}
