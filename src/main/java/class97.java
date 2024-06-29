import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class97 extends class337 {

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "S")
    public short field1310;

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "I")
    public static int field1311 = 0;

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "()V", line = 6)
    public class97() {
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(S)V", line = 11)
    public class97(short arg0) {
        this.field1310 = arg0;
    }
}
