import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class191 {

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "[I")
    public static int[] field2863 = new int[50];

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "[I")
    public static int[] field2861 = new int[200];

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BI)V", line = 14)
    public static final void method1340(byte arg0, int arg1) {
        field2862++;
        int var2 = 50 % ((76 - arg0) / 49);
        class334 var3 = class352.method2172(arg1, 7, 16711935);
        var3.method2099(true);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V", line = 32)
    public static void method1341(int arg0) {
        if (arg0 != 15) {
            field2863 = null;
        }
        field2863 = null;
        field2861 = null;
    }
}
