import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IYPTVTAD")
public class class30 extends class6 {

    @OriginalMember(owner = "IYPTVTAD", name = "e", descriptor = "Z")
    private boolean field987 = false;

    @OriginalMember(owner = "IYPTVTAD", name = "h", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "IYPTVTAD", name = "f", descriptor = "LIYPTVTAD;")
    public class30 field988;

    @OriginalMember(owner = "IYPTVTAD", name = "g", descriptor = "LIYPTVTAD;")
    public class30 field989;

    @OriginalMember(owner = "IYPTVTAD", name = "b", descriptor = "()V")
    public void method373() {
        if (this.field989 != null) {
            this.field989.field988 = this.field988;
            this.field988.field989 = this.field989;
            this.field988 = null;
            this.field989 = null;
        }
    }
}
