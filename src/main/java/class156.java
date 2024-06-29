import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class156 extends class50 {

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    private int field2949;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "Lvh;")
    private static class42 field2950;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "()V")
    public final void method496() {
        field2950.method437((byte) 51, this.field2949);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()I")
    public final int method488() {
        return field2950.method440(this.field2949, (byte) -89);
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "()V")
    public final void method492() {
        field2950.method436(-7836, this.field2949);
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "()V")
    public static void method1163() {
        field2950 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method489(Component arg0) throws Exception {
        field2950.method438(class134.field2618, class121.field2389, 126, arg0);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "()V")
    public final void method491() {
        field2950.method439(this.field2949, super.field1130);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lbi;I)V")
    public class156(class66 arg0, int arg1) {
        field2950 = arg0.method596(-4866);
        this.field2949 = arg1;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public final void method497(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2950.method435(14256, arg0, this.field2949);
        }
    }
}
