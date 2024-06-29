import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class49 extends class508 {

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "[S")
    public short[] field688;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "[B")
    public byte[] field689;

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class49(short[] arg0, byte[] arg1) {
        this.field688 = arg0;
        this.field689 = arg1;
    }
}
