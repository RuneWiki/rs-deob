import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class110 {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)J")
    public abstract long method796(boolean arg0);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BILjn;I)Lkk;")
    public static final class173 method797(byte arg0, int arg1, class668 arg2, int arg3) {
        field1424++;
        byte[] var4 = arg2.method3800(arg1, arg3, (byte) -92);
        if (arg0 != 104) {
            method797((byte) 97, -11, null, 43);
        }
        return var4 == null ? null : new class173(var4);
    }
}
