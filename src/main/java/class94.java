import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class94 extends class589 {

    @OriginalMember(owner = "client!vga", name = "k", descriptor = "B")
    public byte field1319;

    @OriginalMember(owner = "client!vga", name = "m", descriptor = "B")
    public byte field1321;

    @OriginalMember(owner = "client!vga", name = "g", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "client!vga", name = "h", descriptor = "B")
    public byte field1316;

    @OriginalMember(owner = "client!vga", name = "l", descriptor = "B")
    public byte field1320;

    @OriginalMember(owner = "client!vga", name = "i", descriptor = "[S")
    public short[] field1317;

    @OriginalMember(owner = "client!vga", name = "j", descriptor = "[B")
    public byte[] field1318;

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field1319 = (byte) arg0;
        this.field1321 = (byte) arg1;
        this.field1315 = arg2;
        this.field1316 = (byte) arg3;
        this.field1320 = (byte) arg4;
        this.field1317 = arg5;
        this.field1318 = arg6;
    }
}
