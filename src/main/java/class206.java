import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class206 extends class90 {

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field4024 = 0;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "[[I")
    public static int[][] field4032 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "Lrf;")
    private static class163 field4035 = class53.method392(65, "green:");

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "Lrf;")
    public static class163 field4026 = class53.method392(95, "Hier wechseln");

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "Lrf;")
    public static class163 field4030 = field4035;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "Lrf;")
    public static class163 field4028 = field4035;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "B")
    public byte field4029;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public int field4034;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "Lrf;")
    public class163 field4027;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "[I")
    public static int[] field4025;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    public static void method1349(int arg0) {
        if (arg0 <= 51) {
            return;
        }
        field4028 = null;
        field4035 = null;
        field4032 = null;
        field4026 = null;
        field4025 = null;
        field4030 = null;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V")
    public static final void method1350(byte arg0) {
        field4031++;
        class27.field496.method399(false);
        if (arg0 != -67) {
            field4028 = null;
        }
    }
}
