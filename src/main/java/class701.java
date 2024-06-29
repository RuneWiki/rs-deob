import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class701 {

    @OriginalMember(owner = "client!no", name = "b", descriptor = "Ljava/lang/String;")
    public static String field9774 = null;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field9773;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field9775;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V", line = 3)
    public static final void method3948(byte arg0) {
        field9775++;
        class145.field2086.method161(-118);
        for (int var1 = 0; var1 < 32; var1++) {
            class464.field6575[var1] = 0L;
        }
        int var2 = 0;
        int var3 = -95 / ((arg0 - 1) / 62);
        while (var2 < 32) {
            class363.field5145[var2] = 0L;
            var2++;
        }
        class96.field1138 = 0;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)[I", line = 34)
    public static final int[] method3949(int arg0) {
        int var1 = -35 % ((-arg0 - 3) / 46);
        field9773++;
        return new int[] { class508.field7273, class279.field3941, class20.field299 };
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V", line = 46)
    public static void method3950(int arg0) {
        if (arg0 != 0) {
            method3950(46);
        }
        field9774 = null;
    }
}
