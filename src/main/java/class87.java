import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class87 extends class35 {

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "Lbe;")
    private static class13 field2020;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Component;IZ)V", line = 4)
    public final void method303(Component arg0, int arg1, boolean arg2) throws Exception {
        field2020.method111(122, arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()I", line = 7)
    public final int method293() {
        return field2020.method108((byte) -43);
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lc;)V", line = 9)
    public class87(class15 arg0) {
        field2020 = arg0.method128(false);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V", line = 13)
    public final void method300(int arg0) throws Exception {
        field2020.method109(arg0, 1682);
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "()V", line = 16)
    public final void method302() {
        field2020.method110(false);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()V", line = 19)
    public final void method297() {
        field2020.method112(class35.field843);
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "()V", line = 22)
    public static void method684() {
        field2020 = null;
    }
}
