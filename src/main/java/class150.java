import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class150 extends class395 {

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    private int field1905;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "Lla;")
    private static class221 field1904;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "()V", line = 3)
    public final void method11() {
        field1904.method1449(3390, this.field1905);
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "()V", line = 6)
    public static void method1031() {
        field1904 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 9)
    public final void method8(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1904.method1450(this.field1905, arg0, -17561);
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "()V", line = 16)
    public final void method6() {
        field1904.method1448(this.field1905, super.field5749);
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "()V", line = 19)
    public final void method9() {
        field1904.method1446(this.field1905, true);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()I", line = 22)
    public final int method7() {
        return field1904.method1445(this.field1905, -73);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 26)
    public final void method10(Component arg0) throws Exception {
        field1904.method1447(arg0, 16646, class25.field449, class388.field5673);
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lde;I)V", line = 28)
    public class150(class364 arg0, int arg1) {
        field1904 = arg0.method2409(false);
        this.field1905 = arg1;
    }
}
