import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public abstract class class645 {

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field9382 = 0;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field9383;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B[B)[B", line = 9)
    public static final byte[] method3717(byte arg0, byte[] arg1) {
        field9383++;
        int var2 = arg1.length;
        if (arg0 <= 87) {
            method3717((byte) -120, null);
        }
        byte[] var3 = new byte[var2];
        class164.method1151(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)Lbs;")
    public abstract class200 method2176(boolean arg0);

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
    public abstract void method2179(byte arg0);

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZ)Z")
    public abstract boolean method2183(int arg0, boolean arg1);

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
    public abstract void method2177(int arg0);
}
