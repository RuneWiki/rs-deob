import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AJSSLSFA")
public class class2 {

    @OriginalMember(owner = "AJSSLSFA", name = "a", descriptor = "B")
    private byte field10 = 1;

    @OriginalMember(owner = "AJSSLSFA", name = "b", descriptor = "J")
    public long field11;

    @OriginalMember(owner = "AJSSLSFA", name = "c", descriptor = "LAJSSLSFA;")
    public class2 field12;

    @OriginalMember(owner = "AJSSLSFA", name = "d", descriptor = "LAJSSLSFA;")
    public class2 field13;

    @OriginalMember(owner = "AJSSLSFA", name = "e", descriptor = "Z")
    public static boolean field14;

    @OriginalMember(owner = "AJSSLSFA", name = "a", descriptor = "()V")
    public void method1() {
        if (this.field13 != null) {
            this.field13.field12 = this.field12;
            this.field12.field13 = this.field13;
            this.field12 = null;
            this.field13 = null;
        }
    }
}
