import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class156 extends class243 {

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    private int field2307;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "Lqfa;")
    private static class107 field2306;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()I", line = 3)
    public final int method1229() {
        return field2306.method722(this.field2307, (byte) -86);
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "()V", line = 6)
    public final void method1230() {
        field2306.method720(this.field2307, super.field3475);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V", line = 9)
    public final void method1231(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2306.method723(this.field2307, (byte) -120, arg0);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "()V", line = 15)
    public final void method1232() {
        field2306.method724(0, this.field2307);
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "()V", line = 18)
    public static void method1233() {
        field2306 = null;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "()V", line = 22)
    public final void method1234() {
        field2306.method725(4729, this.field2307);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 26)
    public final void method1235(Component arg0) throws Exception {
        field2306.method721(class110.field1367, class488.field6909, false, arg0);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lkj;I)V", line = 28)
    public class156(class590 arg0, int arg1) {
        field2306 = (class107) arg0.method3413(true);
        this.field2307 = arg1;
    }
}
