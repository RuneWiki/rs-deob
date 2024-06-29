import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class40 extends class94 {

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "Lle;")
    private static class71 field1081;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V", line = 3)
    public final void method434(int arg0) throws Exception {
        field1081.method667(arg0, (byte) 76);
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "()I", line = 6)
    public final int method435() {
        return field1081.method670((byte) -112);
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Llc;Ljava/awt/Component;)V", line = 9)
    public class40(class69 arg0, Component arg1) throws Exception {
        super(22050);
        field1081 = arg0.method652(-25100);
        field1081.method671(arg1, 126);
        this.method821(arg0, 16384);
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "()V", line = 16)
    public final void method436() {
        field1081.method669(false);
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "()V", line = 19)
    public final void method437() {
        field1081.method668(class94.field2350);
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "()V", line = 22)
    public static void method438() {
        field1081 = null;
    }
}
