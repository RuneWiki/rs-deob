import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class96 extends class6 {

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
    private int field1886;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "Lic;")
    private static class140 field1885;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()V")
    public final void method48() {
        field1885.method976(this.field1886, super.field80);
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "()V")
    public final void method64() {
        field1885.method974(-7836, this.field1886);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "()I")
    public final int method58() {
        return field1885.method977(-15536, this.field1886);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method51(Component arg0) throws Exception {
        field1885.method975(class32.field577, class192.field3479, arg0, true);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public final void method50(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1885.method979(this.field1886, arg0, false);
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "()V")
    public static void method675() {
        field1885 = null;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "()V")
    public final void method53() {
        field1885.method978(this.field1886, (byte) -126);
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lw;I)V")
    public class96(class143 arg0, int arg1) {
        field1885 = arg0.method1004(26207);
        this.field1886 = arg1;
    }
}
