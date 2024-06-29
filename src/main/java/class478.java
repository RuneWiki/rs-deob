import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class478 extends class75 {

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
    private int field7061;

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "Lur;")
    private static class254 field7062;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 3)
    public final void method530(Component arg0) throws Exception {
        field7062.method1725(class175.field2777, (byte) -82, arg0, class12.field141);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 6)
    public final void method525(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field7062.method1727(arg0, this.field7061, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "()I", line = 13)
    public final int method526() {
        return field7062.method1724(-20362, this.field7061);
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lnv;I)V", line = 15)
    public class478(class493 arg0, int arg1) {
        field7062 = arg0.method2888((byte) -119);
        this.field7061 = arg1;
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "()V", line = 20)
    public final void method538() {
        field7062.method1726(26602, this.field7061);
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "()V", line = 23)
    public static void method2820() {
        field7062 = null;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "()V", line = 26)
    public final void method531() {
        field7062.method1722(this.field7061, super.field1280);
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "()V", line = 30)
    public final void method543() {
        field7062.method1723(this.field7061, (byte) -103);
    }
}
