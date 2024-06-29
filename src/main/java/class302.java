import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class302 {

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field4304 = 0;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public int field4302;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "Lfc;")
    public class156 field4306;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "[I")
    public int[] field4303;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V")
    public static final void method1880(byte arg0) {
        field4301++;
        class140.field1858 = new class486();
        int var1 = -73 / ((-arg0 - 70) / 56);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIBI)V")
    public static final void method1881(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = -61 / ((-arg2 - 37) / 52);
        field4305++;
        int var5 = class314.field4438.field5794 * arg1 >> 8;
        if (arg0 == -1 && !class420.field5875) {
            class2.method11((byte) 122);
        } else if (arg0 != -1 && (class268.field3923 != arg0 || !class86.method481(122)) && var5 != 0 && !class420.field5875) {
            class113.method715(arg3, var5, 7, arg0, class360.field5189, false, 0);
        }
        class268.field3923 = arg0;
    }
}
