import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class58 extends class140 {

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    private int field1010;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "Lk;")
    private static class179 field1009;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method357(Component arg0) throws Exception {
        field1009.method1253(class17.field256, -41, arg0, class113.field1937);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()V")
    public final void method358() {
        field1009.method1251(48, this.field1010);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public final void method359(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1009.method1250((byte) -84, this.field1010, arg0);
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "()V")
    public final void method360() {
        field1009.method1252(-128, this.field1010);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()I")
    public final int method361() {
        return field1009.method1249(18576, this.field1010);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "()V")
    public final void method362() {
        field1009.method1248(this.field1010, super.field2557);
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lfb;I)V")
    public class58(class29 arg0, int arg1) {
        field1009 = arg0.method177(-106);
        this.field1010 = arg1;
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "()V")
    public static void method363() {
        field1009 = null;
    }
}
