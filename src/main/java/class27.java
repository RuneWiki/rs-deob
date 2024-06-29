import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IZSDUVJF")
public class class27 extends class54 {

    @OriginalMember(owner = "client!IZSDUVJF", name = "e", descriptor = "Z")
    private boolean field915 = true;

    @OriginalMember(owner = "client!IZSDUVJF", name = "h", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!IZSDUVJF", name = "f", descriptor = "LIZSDUVJF;")
    public class27 field916;

    @OriginalMember(owner = "client!IZSDUVJF", name = "g", descriptor = "LIZSDUVJF;")
    public class27 field917;

    @OriginalMember(owner = "client!IZSDUVJF", name = "b", descriptor = "()V")
    public void method256() {
        if (this.field917 != null) {
            this.field917.field916 = this.field916;
            this.field916.field917 = this.field917;
            this.field916 = null;
            this.field917 = null;
        }
    }
}
