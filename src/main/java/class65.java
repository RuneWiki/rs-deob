import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class65 extends class4 {

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    private int field1326;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "Lic;")
    private static class59 field1327;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "()V")
    public final void method45() {
        field1327.method452(-127, this.field1326);
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "()V")
    public static void method509() {
        field1327 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()V")
    public final void method36() {
        field1327.method451((byte) -89, this.field1326);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "()V")
    public final void method41() {
        field1327.method450(this.field1326, super.field116);
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
    public final void method35(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1327.method453(261, arg0, this.field1326);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "()I")
    public final int method40() {
        return field1327.method455(44, this.field1326);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method44(Component arg0) throws Exception {
        field1327.method454(class127.field2816, class35.field772, (byte) -122, arg0);
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Ldf;I)V")
    public class65(class28 arg0, int arg1) {
        field1327 = arg0.method251(5);
        this.field1326 = arg1;
    }
}
