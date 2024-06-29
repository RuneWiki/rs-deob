import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class525 extends class513 {

    @OriginalMember(owner = "client!uba", name = "l", descriptor = "[S")
    public short[] field7354;

    @OriginalMember(owner = "client!uba", name = "k", descriptor = "[B")
    public byte[] field7353;

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class525(short[] arg0, byte[] arg1) {
        this.field7354 = arg0;
        this.field7353 = arg1;
    }
}
