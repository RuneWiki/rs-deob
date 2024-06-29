import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class8 extends class126 {

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "Lr;")
    private static class100 field116;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "()V")
    public static void method41() {
        field116 = null;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "()I")
    public final int method42() {
        return field116.method760((byte) 122);
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "()V")
    public final void method43() {
        field116.method763(class126.field2729);
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lqd;Ljava/awt/Component;)V")
    public class8(class99 arg0, Component arg1) throws Exception {
        super(22050);
        field116 = arg0.method758(0);
        field116.method764(true, arg1);
        this.method929(arg0, 16384);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public final void method44(int arg0) throws Exception {
        field116.method762(-14979, arg0);
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "()V")
    public final void method45() {
        field116.method761(-87);
    }
}
