import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class class382 extends class189 {

    @OriginalMember(owner = "client!es", name = "j", descriptor = "I")
    public static int field5463 = 0;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(B)I")
    public abstract int method779(byte arg0);

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)I")
    public abstract int method776(int arg0);

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)I")
    public abstract int method778(int arg0);

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(I)I")
    public abstract int method772(int arg0);

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IB[B)I")
    public static final int method2428(int arg0, byte arg1, byte[] arg2) {
        if (arg1 != 28) {
            method2428(-37, (byte) -49, null);
        }
        field5464++;
        return class74.method602(arg2, true, arg0, 0);
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(I)J")
    public abstract long method773(int arg0);
}
