import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class95 {

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "[I")
    public static int[] field1645 = new int[25];

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field1646 = 0;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Z")
    public static boolean field1643;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "[[[I")
    public static int[][][] field1642;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static final void method606(byte arg0) {
        class292.field4664 = 0;
        field1648++;
        class61.field1071 = 0;
        class224.method1504(1);
        class171.method1150(0);
        class1.method6(121);
        class184.method1212((byte) -70);
        int var1 = 0;
        if (arg0 > -74) {
            field1643 = true;
        }
        while (class61.field1071 > var1) {
            int var3 = class248.field4070[var1];
            if (class266.field4301 != class105.field1874[var3].field1406) {
                if (class105.field1874[var3].field4596 > 0) {
                    class125.method856(1, class105.field1874[var3]);
                }
                class105.field1874[var3] = null;
            }
            var1++;
        }
        if (class101.field1747 != class248.field4058.field1762) {
            throw new RuntimeException("gpp1 pos:" + class248.field4058.field1762 + " psize:" + class101.field1747);
        }
        for (int var2 = 0; var2 < class157.field2624; var2++) {
            if (class105.field1874[class280.field4458[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class157.field2624);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method607(int arg0) {
        field1645 = null;
        if (arg0 == 0) {
            field1642 = null;
        }
    }
}
