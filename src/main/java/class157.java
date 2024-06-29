import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public abstract class class157 {

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field2580 = 0;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "[Z")
    public static boolean[] field2581 = new boolean[112];

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "[I")
    public static int[] field2579;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[B)V")
    public abstract void method569(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)[B")
    public abstract byte[] method568(int arg0);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static void method1182(byte arg0) {
        if (arg0 < -59) {
            field2579 = null;
            field2581 = null;
        }
    }
}
