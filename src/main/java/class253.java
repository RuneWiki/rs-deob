import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class253 {

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Lmh;")
    public static class128 field4365 = class22.method156(127, "hint_mapedge");

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "[Z")
    public static boolean[] field4366 = new boolean[100];

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Lmh;")
    public static class128 field4369 = class22.method156(123, "um");

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "Lmh;")
    private static class128 field4371 = class22.method156(124, "white:");

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "Lo;")
    public static class197 field4372 = null;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Lmh;")
    public static class128 field4364 = field4371;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "Z")
    public static boolean field4370 = false;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "Lmh;")
    public static class128 field4368 = field4371;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Lmh;")
    public static class128 field4373 = class22.method156(125, "Untersuchen");

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([Lmh;I)[Lmh;", line = 13)
    public static final class128[] method1795(class128[] arg0, int arg1) {
        field4374++;
        if (arg1 != 5) {
            field4373 = (class128) null;
        }
        class128[] var2 = new class128[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class28.method177((byte) -106, new class128[] { class257.method1811(var3, (byte) -122), class90.field1543 });
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class28.method177((byte) -67, new class128[] { var2[var3], arg0[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 39)
    public static void method1796(int arg0) {
        field4368 = null;
        field4364 = null;
        if (arg0 != 5) {
            method1795((class128[]) null, 127);
        }
        field4372 = null;
        field4371 = null;
        field4369 = null;
        field4373 = null;
        field4366 = null;
        field4365 = null;
    }
}
