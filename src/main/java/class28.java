import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class28 extends class127 {

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "Lse;")
    private static class113 field716;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()V", line = 3)
    public final void method234() {
        field716.method899(15548);
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Laa;Ljava/awt/Component;)V", line = 6)
    public class28(class2 arg0, Component arg1) throws Exception {
        super(22050);
        field716 = arg0.method5(0);
        field716.method901((byte) -117, arg1);
        this.method984(arg0, 16384);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V", line = 12)
    public final void method235(int arg0) throws Exception {
        field716.method900(arg0, (byte) -123);
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "()V", line = 15)
    public final void method236() {
        field716.method898(class127.field3038);
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "()I", line = 18)
    public final int method237() {
        return field716.method897(4311);
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "()V", line = 21)
    public static void method238() {
        field716 = null;
    }
}
