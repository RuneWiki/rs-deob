import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class336 {

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field5346 = 0;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "F")
    public static float field5344 = 0.0F;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "[I")
    public static int[] field5345 = new int[200];

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[S")
    public static short[] field5343;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 10)
    public static void method2365(byte arg0) {
        field5345 = null;
        if (arg0 < 71) {
            field5346 = 55;
        }
        field5343 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZZ)V", line = 31)
    public static final void method2366(boolean arg0, boolean arg1) {
        field5342++;
        if (class201.field3365 == arg1) {
            return;
        }
        class201.field3365 = arg1;
        class195.method1346(-61);
        if (!arg0) {
            method2367(-24);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 46)
    public static final void method2367(int arg0) {
        if (arg0 != 0) {
            field5345 = (int[]) null;
        }
        class223.field3691.method895(arg0 ^ 0x80);
        field5341++;
    }
}
