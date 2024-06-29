import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class261 extends class48 {

    @OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!uu", name = "O", descriptor = "I")
    public int field4269;

    @OriginalMember(owner = "client!uu", name = "Q", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!uu", name = "T", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!uu", name = "U", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!uu", name = "S", descriptor = "Lmu;")
    public class275 field4272;

    @OriginalMember(owner = "client!uu", name = "R", descriptor = "[B")
    public byte[] field4271;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)I")
    public final int method553(int arg0) {
        ++field4274;
        if (arg0 != 100) {
            return -20;
        } else {
            return super.field644 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(III)Z")
    public static final boolean method1858(int arg0, int arg1, int arg2) {
        if (arg2 != 262144) {
            return true;
        } else {
            ++field4270;
            return class70.method724(arg2 + -261888, arg1, arg0) | (262144 & arg0) != 0 || class653.method3762(arg0, arg2 ^ -262249, arg1);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Z)[B")
    public final byte[] method552(boolean arg0) {
        ++field4268;
        if (super.field644) {
            throw new RuntimeException();
        } else {
            return arg0 ? null : this.field4271;
        }
    }
}
