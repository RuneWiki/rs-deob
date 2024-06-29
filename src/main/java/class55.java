import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class55 extends class161 {

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "[S")
    public short[] field686;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "[B")
    public byte[] field687;

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "([S[B)V")
    public class55(short[] arg0, byte[] arg1) {
        this.field686 = arg0;
        this.field687 = arg1;
    }
}
