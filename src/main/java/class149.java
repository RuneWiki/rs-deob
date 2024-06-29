import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class149 {

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "Lem;")
    public static class206 field2201 = new class206(100, 0);

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "[I")
    public static int[] field2203 = new int[4096];

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method1089(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class610.field8462 = arg0;
        class611.field8476 = arg4;
        if (arg2 != 4096) {
            method1090((byte) 30);
        }
        field2202++;
        class521.field7093 = arg1;
        class239.field3283 = arg3;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)V", line = 24)
    public static void method1090(byte arg0) {
        field2203 = null;
        field2201 = null;
        int var1 = -73 % ((arg0 + 24) / 40);
    }
}
