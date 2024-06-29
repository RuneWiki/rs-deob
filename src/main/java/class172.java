import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class172 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public int field2327 = -1;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
    public static int[] field2329 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field2331 = 0;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Lln;")
    public class94 field2328;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "[I")
    public int[] field2330;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "[Ljava/lang/String;")
    public String[] field2332;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static void method1091(int arg0) {
        if (arg0 == 2) {
            field2329 = null;
        }
    }
}
