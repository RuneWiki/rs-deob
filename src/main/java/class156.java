import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class156 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "[I")
    public int[] field1909 = new int[3];

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "[Lqk;")
    public class12[] field1910 = new class12[8];

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "[I")
    public int[] field1915 = new int[100];

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "[Lwl;")
    public class233[] field1917 = new class233[100];

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "Z")
    public static boolean field1916 = true;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public int field1911;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field1914;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V", line = 3)
    public static final void method936(byte arg0) {
        field1913++;
        for (class302 var1 = (class302) class393.field5547.method506((byte) -128); var1 != null; var1 = (class302) class393.field5547.method514(true)) {
            if (class46.method271(var1.field4247, 17)) {
                class388.method2475(0, var1);
            }
        }
        if (arg0 != -121) {
            field1916 = true;
        }
        if (class208.field2958 == 1) {
            class435.field6270 = false;
            class186.method1280(0, class302.field4246, class8.field120, class379.field5341, class113.field1393);
            return;
        }
        class186.method1280(0, class302.field4246, class8.field120, class379.field5341, class113.field1393);
        int var2 = class371.field5232.method2264(class193.field2764.method2331(25, class271.field3836), 16);
        for (class302 var3 = (class302) class393.field5547.method506((byte) -128); var3 != null; var3 = (class302) class393.field5547.method514(true)) {
            int var4 = class345.method2210(var3, (byte) 107);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class113.field1393 = var2 + 8;
        class302.field4246 = class208.field2958 * 16 + (class331.field4686 ? 26 : 22);
    }
}
