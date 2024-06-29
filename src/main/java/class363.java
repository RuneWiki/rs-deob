import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class363 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Llf;")
    public static class215 field4779;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method2069(int arg0) {
        if (arg0 != 15597) {
            method2070(5, 69);
        }
        field4779 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
    public static final int method2070(int arg0, int arg1) {
        if (arg0 <= 70) {
            field4779 = null;
        }
        field4778++;
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
