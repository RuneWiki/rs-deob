import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class131 {

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "[Z")
    public static boolean[] field2021 = new boolean[100];

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2022 = "flash2:";

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Z")
    public static boolean field2026 = false;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Z")
    public static boolean field2025;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 6)
    public static void method969(int arg0) {
        if (arg0 < 24) {
            field2024 = 74;
        }
        field2022 = null;
        field2021 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lqa;ILqa;)V", line = 28)
    public static final void method970(class101 arg0, int arg1, class101 arg2) {
        field2023++;
        int var3 = 125 % ((arg1 + 11) / 60);
        if (arg2.field1599 != null) {
            arg2.method714(-72);
        }
        arg2.field1595 = arg0;
        arg2.field1599 = arg0.field1599;
        arg2.field1599.field1595 = arg2;
        arg2.field1595.field1599 = arg2;
    }
}
