import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class145 extends class166 {

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "B")
    public byte field1874;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "B")
    public byte field1871;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public int field1870;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "B")
    public byte field1873;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "B")
    public byte field1872;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "[S")
    public short[] field1875;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "[B")
    public byte[] field1876;

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class145(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field1874 = (byte) arg0;
        this.field1871 = (byte) arg1;
        this.field1870 = arg2;
        this.field1873 = (byte) arg3;
        this.field1872 = (byte) arg4;
        this.field1875 = arg5;
        this.field1876 = arg6;
    }
}
