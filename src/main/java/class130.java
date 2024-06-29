import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class130 {

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lbe;")
    public static class283 field2207 = class153.method941(127, "Hidden)2use");

    @OriginalMember(owner = "client!la", name = "e", descriptor = "[I")
    public static int[] field2206 = new int[2];

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Lbe;")
    public static class283 field2205 = class153.method941(-72, "Nehmen");

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public int field2210;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lef;")
    public class306 field2208;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "[I")
    public int[] field2209;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lek;B)V", line = 10)
    public static final void method814(class172 arg0, byte arg1) {
        class166.field2766 = arg0;
        int var2 = -62 / ((arg1 - 24) / 36);
        field2203++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)V", line = 22)
    public static final void method815(byte arg0, int arg1) {
        field2204++;
        class74 var2 = (class74) class170.field2860.method1612((long) arg1, arg0 + 99);
        if (var2 != null) {
            var2.method557((byte) -89);
            if (arg0 != 16) {
                method815((byte) -47, 118);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 47)
    public static void method816(int arg0) {
        field2205 = null;
        if (arg0 <= 52) {
            method816(-36);
        }
        field2207 = null;
        field2206 = null;
    }
}
