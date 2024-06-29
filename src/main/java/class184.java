import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class184 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "[I")
    public static int[] field3070 = new int[32];

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field3073 = 0;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lok;")
    public static class146 field3072 = class235.method1724(-12908, "<img=1>");

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1446(int arg0) {
        class226.field3765.method791(8);
        field3074++;
        class159.field2689.method791(8);
        class85.field1348.method791(8);
        class205.field3402.method791(8);
        if (arg0 > -123) {
            method1447((byte) -36);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 31)
    public static void method1447(byte arg0) {
        if (arg0 >= -34) {
            field3072 = (class146) null;
        }
        field3072 = null;
        field3070 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lr;I)Z", line = 48)
    public static final boolean method1448(class264 arg0, int arg1) {
        if (arg1 != 16237) {
            return true;
        }
        field3071++;
        if (arg0.field4470 == 205) {
            class40.field700 = 250;
            return true;
        } else {
            return false;
        }
    }
}
