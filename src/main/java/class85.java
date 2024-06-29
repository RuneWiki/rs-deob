import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class85 extends class390 {

    @OriginalMember(owner = "client!as", name = "m", descriptor = "B")
    public byte field1304;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "B")
    public byte field1308;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "I")
    public int field1305;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "B")
    public byte field1307;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "B")
    public byte field1306;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "[S")
    public short[] field1303;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "[B")
    public byte[] field1309;

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field1304 = (byte) arg0;
        this.field1308 = (byte) arg1;
        this.field1305 = arg2;
        this.field1307 = (byte) arg3;
        this.field1306 = (byte) arg4;
        this.field1303 = arg5;
        this.field1309 = arg6;
    }
}
