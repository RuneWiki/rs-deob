import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 extends class91 {

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
    private int field1;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "Lpk;")
    private static class120 field2;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "()V", line = 3)
    public final void method1() {
        field2.method837((byte) 93, this.field1);
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "()V", line = 6)
    public static void method2() {
        field2 = null;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "()V", line = 9)
    public final void method3() {
        field2.method835(this.field1, this.field1383);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 12)
    public final void method4(Component arg0) throws Exception {
        field2.method836(class98.field1499, arg0, true, class264.field4185);
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V", line = 15)
    public final void method5(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field2.method834(492, arg0, this.field1);
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "()I", line = 22)
    public final int method6() {
        return field2.method833((byte) 78, this.field1);
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lgn;I)V", line = 25)
    public class1(class6 arg0, int arg1) {
        field2 = arg0.method45(1);
        this.field1 = arg1;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()V", line = 30)
    public final void method7() {
        field2.method838(-128, this.field1);
    }
}
