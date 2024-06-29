import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class306 extends class418 {

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "[S")
    public short[] field4570;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "[B")
    public byte[] field4569;

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([S[B)V")
    public class306(short[] arg0, byte[] arg1) {
        this.field4570 = arg0;
        this.field4569 = arg1;
    }
}
