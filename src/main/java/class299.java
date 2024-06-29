import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public abstract class class299 {

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field4394 = 0;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field4395 = 0;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "[I")
    public static int[] field4396;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method1863(boolean arg0);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)[B")
    public abstract byte[] method1864(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public static void method1865(int arg0) {
        field4396 = null;
        if (arg0 != 0) {
            method1865(-26);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "([BI)V")
    public abstract void method1866(byte[] arg0, int arg1);
}
