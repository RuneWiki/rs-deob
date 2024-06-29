import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class593 {

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "Lgga;")
    private class513 field8490;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "I")
    public int field8491;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "Z")
    public static boolean field8489 = false;

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lmca;ILgga;)V", line = 24)
    public class593(class41 arg0, int arg1, class513 arg2) {
        new class494(64);
        this.field8490 = arg2;
        this.field8491 = this.field8490.method3007(-1, 15);
    }
}
