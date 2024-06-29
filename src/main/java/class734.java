import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public abstract class class734 {

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
    public static int field10153 = 0;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "F")
    public static float field10152;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public static int field10151;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1952(int arg0);

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IBI)[B")
    public abstract byte[] method1953(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "([BB)V")
    public abstract void method1951(byte[] arg0, byte arg1);
}
