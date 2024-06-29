import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class438 {

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "Lhi;")
    public static class45 field6317 = new class45(46, -1);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "Lls;")
    public static class338 field6318;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method2590(boolean arg0) {
        if (arg0) {
            class103.field1632 = class239.field3306;
            class492.field7122 = class36.field554;
        } else {
            class103.field1632 = class134.field2046;
            class492.field7122 = class348.field5000;
        }
        class265.field3571 = class103.field1632.length;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V", line = 19)
    public static void method2591(byte arg0) {
        field6318 = null;
        field6317 = null;
        if (arg0 != 101) {
            field6317 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZ)Lea;", line = 33)
    public static final class115 method2592(int arg0, boolean arg1) {
        field6316++;
        class115[] var2 = class364.method2180(9);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class115 var4 = var2[var3];
            if (var4.field1834 == arg0) {
                return var4;
            }
        }
        if (!arg1) {
            field6317 = null;
        }
        return null;
    }
}
