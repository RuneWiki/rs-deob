import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class121 extends class183 {

    @OriginalMember(owner = "client!b", name = "q", descriptor = "B")
    public byte field1500;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "B")
    public byte field1497;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public int field1495;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "B")
    public byte field1496;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "B")
    public byte field1498;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "[S")
    public short[] field1499;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "[B")
    public byte[] field1494;

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class121(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field1500 = (byte) arg0;
        this.field1497 = (byte) arg1;
        this.field1495 = arg2;
        this.field1496 = (byte) arg3;
        this.field1498 = (byte) arg4;
        this.field1499 = arg5;
        this.field1494 = arg6;
    }
}
