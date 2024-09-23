import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JBHJGXME")
public class class27 {

    @OriginalMember(owner = "JBHJGXME", name = "a", descriptor = "J")
    public long field919;

    @OriginalMember(owner = "JBHJGXME", name = "b", descriptor = "LJBHJGXME;")
    public class27 field920;

    @OriginalMember(owner = "JBHJGXME", name = "c", descriptor = "LJBHJGXME;")
    public class27 field921;

    @OriginalMember(owner = "JBHJGXME", name = "d", descriptor = "Z")
    public static boolean field922;

    @OriginalMember(owner = "JBHJGXME", name = "a", descriptor = "()V")
    public void method254() {
        if (this.field921 != null) {
            this.field921.field920 = this.field920;
            this.field920.field921 = this.field921;
            this.field920 = null;
            this.field921 = null;
        }
    }
}
