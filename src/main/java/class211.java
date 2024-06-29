import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class211 {

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3056 = 0;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Leh;")
    public static class246 field3061 = null;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Ldq;")
    public static class501 field3058;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "[[S")
    public static short[][] field3059;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 10)
    public static void method1332(int arg0) {
        field3061 = null;
        field3059 = null;
        field3058 = null;
        if (arg0 < 46) {
            field3061 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILoi;)V", line = 22)
    public static final void method1333(int arg0, class53 arg1) {
        class10.field143 = arg1.method429("titlebg", arg0 - 27153);
        if (arg0 != 27152) {
            field3061 = null;
        }
        field3057++;
        class380.field5369 = arg1.method429("logo", -1);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V", line = 40)
    public static final void method1334(int arg0, int arg1) {
        field3060++;
        if (class120.method807(-8810, arg0)) {
            class280.method1750(class494.field6988[arg0], arg1, false);
        }
    }
}
