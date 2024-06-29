import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class60 extends class62 {

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    private int field1484;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "Lce;")
    private static class24 field1483;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public final void method430(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1483.method143(-31114, this.field1484, arg0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "()V")
    public final void method431() {
        field1483.method141(this.field1484, (byte) 126);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "()V")
    public final void method432() {
        field1483.method140(this.field1484, super.field1501);
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "()V")
    public static void method433() {
        field1483 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method434(Component arg0) throws Exception {
        field1483.method142(arg0, class83.field1974, (byte) -99, class87.field2030);
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "()I")
    public final int method435() {
        return field1483.method144((byte) 123, this.field1484);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "()V")
    public final void method436() {
        field1483.method139(this.field1484, true);
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lod;I)V")
    public class60(class129 arg0, int arg1) {
        field1483 = arg0.method950(-122);
        this.field1484 = arg1;
    }
}
