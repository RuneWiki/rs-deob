import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class163 extends class83 {

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    private int field2856;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "Luj;")
    private static class48 field2855;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "()V")
    public final void method629() {
        field2855.method376(-18732, this.field2856);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()V")
    public final void method627() {
        field2855.method377(this.field2856, super.field1610);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method625(Component arg0) throws Exception {
        field2855.method373(class102.field1899, arg0, -22156, class134.field2399);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()V")
    public final void method623() {
        field2855.method375(this.field2856, false);
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "()I")
    public final int method632() {
        return field2855.method374(93, this.field2856);
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "()V")
    public static void method1125() {
        field2855 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public final void method621(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2855.method378(this.field2856, arg0, -22599);
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lmi;I)V")
    public class163(class100 arg0, int arg1) {
        field2855 = arg0.method719(-116);
        this.field2856 = arg1;
    }
}
