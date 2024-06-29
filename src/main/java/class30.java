import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class30 {

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field363 = 0;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Luc;")
    public static class27 field361 = new class27(17, 0);

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "Lfc;")
    public static class235 field366 = new class235(24, -1);

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "Lsr;")
    public static class228 field367 = new class228();

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V", line = 3)
    public static void method135(byte arg0) {
        field366 = null;
        if (arg0 < 85) {
            method136(77, -128, 4, null);
        }
        field361 = null;
        field367 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIILaca;)V", line = 23)
    public static final void method136(int arg0, int arg1, int arg2, class667 arg3) {
        field362++;
        class568.field7648[arg2][arg1] = arg3;
        if (arg0 != 0) {
            method135((byte) 127);
        }
    }
}
