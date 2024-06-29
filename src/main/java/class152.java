import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class152 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2136 = 0;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2137 = 0;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "F")
    public static float field2138;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method1173(int arg0, byte arg1) {
        class135.field1842.method2264((byte) -68, arg0);
        if (arg1 != -23) {
            field2138 = 0.5809334F;
        }
        field2135++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1090(int arg0);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[B)V")
    public abstract void method1091(int arg0, byte[] arg1);
}
