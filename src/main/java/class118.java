import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class118 {

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "Lpfa;")
    private class275 field1470;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Z")
    public static volatile boolean field1468 = true;

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lbs;ILpfa;)V", line = 22)
    public class118(class643 arg0, int arg1, class275 arg2) {
        new class208(64);
        this.field1470 = arg2;
        this.field1469 = this.field1470.method1655(15, (byte) -82);
    }
}
