import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class145 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field1913 = 0;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field1915 = 0;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field1917 = 20;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Z")
    public static final boolean method899(int arg0, int arg1, int arg2) {
        field1916++;
        if (arg1 != 458752) {
            field1913 = 94;
        }
        return class426.method2524(arg2, 116, arg0) | (arg2 & 0x70000) != 0 || class508.method3031(arg0, arg2, (byte) -2);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
    public static final int method900(int arg0, int arg1) {
        field1914++;
        int var2 = -62 / ((39 - arg0) / 32);
        return arg1 & 0x3FF;
    }
}
