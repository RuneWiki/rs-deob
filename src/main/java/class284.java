import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public abstract class class284 extends class61 {

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "Z")
    public volatile boolean field4823 = true;

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "Lwm;")
    public static class152 field4827 = class157.method1048("::mm", 108);

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "Lwm;")
    public static class152 field4829 = class157.method1048("RuneScape wird geladen )2 bitte warten)3)3)3", 93);

    @OriginalMember(owner = "client!dm", name = "M", descriptor = "[Lwm;")
    public static class152[] field4832 = new class152[1000];

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "Lne;")
    public static class235 field4831 = new class235(4);

    @OriginalMember(owner = "client!dm", name = "O", descriptor = "[I")
    public static int[] field4834 = new int[128];

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "B")
    public static byte field4828;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "Lbg;")
    public static class203 field4824;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "Z")
    public boolean field4825;

    @OriginalMember(owner = "client!dm", name = "N", descriptor = "Z")
    public boolean field4833;

    @OriginalMember(owner = "client!dm", name = "P", descriptor = "[I")
    public static int[] field4835;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIII)V", line = 19)
    public static final void method1924(int arg0, int arg1, int arg2, int arg3) {
        class34 var4 = class287.field4857[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class275 var5 = var4.field554;
        if (var5 != null) {
            var5.field4708 = var5.field4708 * arg3 / 16;
            var5.field4703 = var5.field4703 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V", line = 40)
    public static void method1925(int arg0) {
        field4827 = null;
        field4829 = null;
        if (arg0 >= -119) {
            field4834 = (int[]) null;
        }
        field4835 = null;
        field4832 = null;
        field4831 = null;
        field4834 = null;
        field4824 = null;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)I")
    public abstract int method509(byte arg0);

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)[B")
    public abstract byte[] method510(byte arg0);
}
