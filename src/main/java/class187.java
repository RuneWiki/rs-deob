import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class187 extends class19 {

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    private int field3012;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "Lc;")
    private static class295 field3013;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "()I", line = 3)
    public final int method123() {
        return field3013.method2019(true, this.field3012);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 6)
    public final void method124(Component arg0) throws Exception {
        field3013.method2022(arg0, class25.field448, class292.field4890, (byte) -115);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()V", line = 9)
    public final void method105() {
        field3013.method2020(true, this.field3012);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "()V", line = 12)
    public final void method109() {
        field3013.method2021(this.field3012, -116);
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "()V", line = 16)
    public static void method1353() {
        field3013 = null;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "()V", line = 20)
    public final void method120() {
        field3013.method2018(this.field3012, this.field294);
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lke;I)V", line = 22)
    public class187(class107 arg0, int arg1) {
        field3013 = arg0.method808((byte) -126);
        this.field3012 = arg1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 27)
    public final void method110(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field3013.method2017(arg0, this.field3012, 21);
    }
}
