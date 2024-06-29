import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class12 {

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "Lcc;")
    public static class209 field230 = class95.method669(119, "Untersuchen");

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Lcc;")
    public static class209 field228 = class95.method669(126, "<col=ffff00>");

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field231 = 0;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Lji;")
    public static class42 field232;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
    public static int[] field233;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static void method94(byte arg0) {
        field233 = null;
        field230 = null;
        if (arg0 <= 54) {
            method95((byte) -8);
        }
        field228 = null;
        field232 = null;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
    public static final void method95(byte arg0) {
        int var1 = 119 / ((-arg0 - 35) / 54);
        class230.field4177.method664(-12);
        field229++;
    }
}
