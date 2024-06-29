import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class560 extends class566 {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)J", line = 4)
    public final long method783(int arg0) {
        return arg0 == 24111 ? System.nanoTime() : 27L;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 12)
    public class560() {
        System.nanoTime();
    }
}
