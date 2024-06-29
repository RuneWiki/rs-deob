import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class156 extends class349 {

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "B")
    public byte field1974;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "B")
    public byte field1975;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    public int field1973;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "B")
    public byte field1979;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "B")
    public byte field1977;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "[S")
    public short[] field1978;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "[B")
    public byte[] field1976;

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class156(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field1974 = (byte) arg0;
        this.field1975 = (byte) arg1;
        this.field1973 = arg2;
        this.field1979 = (byte) arg3;
        this.field1977 = (byte) arg4;
        this.field1978 = arg5;
        this.field1976 = arg6;
    }
}
