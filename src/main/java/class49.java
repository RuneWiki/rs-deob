import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class49 extends class45 {

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "Lsc;")
    private static class109 field1266;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "()V", line = 3)
    public final void method387() {
        field1266.method899(class45.field1190);
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lcc;Ljava/awt/Component;)V", line = 6)
    public class49(class15 arg0, Component arg1) throws Exception {
        super(22050);
        field1266 = arg0.method98(false);
        field1266.method896(52, arg1);
        this.method388(arg0, 16384);
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "()V", line = 12)
    public final void method382() {
        field1266.method897(-1188);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "()I", line = 15)
    public final int method380() {
        return field1266.method898((byte) 96);
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "()V", line = 18)
    public static void method403() {
        field1266 = null;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 22)
    public final void method383(int arg0) throws Exception {
        field1266.method895(arg0, (byte) -120);
    }
}
