import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class435 extends class788 {

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "(I)J", line = 5)
    public final long method1512(int arg0) {
        int var2 = -123 % ((arg0 - 10) / 63);
        return System.nanoTime();
    }

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "()V", line = 11)
    public class435() {
        System.nanoTime();
    }
}
