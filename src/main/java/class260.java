import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class260 extends class138 {

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V")
    public class260() {
        System.nanoTime();
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)J")
    public final long method43(int arg0) {
        if (arg0 >= -126) {
            this.method43(-40);
        }
        return System.nanoTime();
    }
}
