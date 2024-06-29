import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class106 extends class86 {

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    private int field1991;

    @OriginalMember(owner = "client!ji", name = "db", descriptor = "Luf;")
    private static class22 field1992;

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lbd;I)V", line = 3)
    public class106(class305 arg0, int arg1) {
        field1992 = arg0.method2155((byte) -80);
        this.field1991 = arg1;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "()V", line = 8)
    public final void method750() {
        field1992.method203(this.field1991, this.field1633);
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "()I", line = 11)
    public final int method756() {
        return field1992.method201((byte) 112, this.field1991);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V", line = 14)
    public final void method757(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field1992.method205(this.field1991, arg0, 19968);
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "()V", line = 20)
    public static void method888() {
        field1992 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V", line = 23)
    public final void method746() {
        field1992.method202(this.field1991, 30817);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "()V", line = 26)
    public final void method753() {
        field1992.method204(this.field1991, (byte) 6);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 30)
    public final void method749(Component arg0) throws Exception {
        field1992.method206(class312.field5524, class287.field5132, -112, arg0);
    }
}
