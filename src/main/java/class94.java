import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class94 extends class112 {

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "Lia;")
    private static class49 field2108;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "()I", line = 3)
    public final int method629() {
        return field2108.method356(32403);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()V", line = 6)
    public final void method630() {
        field2108.method357(102);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V", line = 9)
    public final void method631(int arg0) throws Exception {
        field2108.method354(26853, arg0);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "()V", line = 12)
    public final void method632() {
        field2108.method355(class112.field2490);
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "()V", line = 15)
    public static void method633() {
        field2108 = null;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Ls;Ljava/awt/Component;)V", line = 18)
    public class94(class105 arg0, Component arg1) throws Exception {
        super(22050);
        field2108 = arg0.method782(0);
        field2108.method353((byte) 113, arg1);
        this.method816(arg0, 16384);
    }
}
