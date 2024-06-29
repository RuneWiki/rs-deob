import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class190 extends class176 {

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "B")
    public byte field2540;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "B")
    public byte field2539;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public int field2537;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "B")
    public byte field2543;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "B")
    public byte field2538;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "[S")
    public short[] field2542;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "[B")
    public byte[] field2541;

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class190(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field2540 = (byte) arg0;
        this.field2539 = (byte) arg1;
        this.field2537 = arg2;
        this.field2543 = (byte) arg3;
        this.field2538 = (byte) arg4;
        this.field2542 = arg5;
        this.field2541 = arg6;
    }
}
