import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class122 extends class120 {

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "B")
    public byte field1519;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "B")
    public byte field1516;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    public int field1514;

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "B")
    public byte field1518;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "B")
    public byte field1517;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "[S")
    public short[] field1513;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "[B")
    public byte[] field1515;

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class122(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field1519 = (byte) arg0;
        this.field1516 = (byte) arg1;
        this.field1514 = arg2;
        this.field1518 = (byte) arg3;
        this.field1517 = (byte) arg4;
        this.field1513 = arg5;
        this.field1515 = arg6;
    }
}
