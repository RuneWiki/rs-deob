import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class405 extends class55 {

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "[B")
    public byte[] field5723;

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "([B)V")
    public class405(byte[] arg0) {
        this.field5723 = arg0;
    }
}
