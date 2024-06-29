import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class121 extends class438 {

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "B")
    public byte field1830;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "B")
    public byte field1829;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "B")
    public byte field1825;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "B")
    public byte field1827;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "[S")
    public short[] field1828;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "[B")
    public byte[] field1831;

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class121(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field1830 = (byte) arg0;
        this.field1829 = (byte) arg1;
        this.field1826 = arg2;
        this.field1825 = (byte) arg3;
        this.field1827 = (byte) arg4;
        this.field1828 = arg5;
        this.field1831 = arg6;
    }
}
