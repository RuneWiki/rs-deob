import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class139 extends class235 {

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    private int field2023;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "Lgq;")
    private static class531 field2024;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()V", line = 3)
    public final void method924() {
        field2024.method3137((byte) -15, this.field2023);
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "()I", line = 6)
    public final int method925() {
        return field2024.method3138(this.field2023, 18);
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "()V", line = 9)
    public final void method926() {
        field2024.method3135(9063, this.field2023);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V", line = 13)
    public final void method927(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2024.method3133(this.field2023, arg0, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lhu;I)V", line = 19)
    public class139(class469 arg0, int arg1) {
        field2024 = arg0.method2795((byte) -83);
        this.field2023 = arg1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 24)
    public final void method928(Component arg0) throws Exception {
        field2024.method3134(class462.field6769, arg0, class40.field620, (byte) -128);
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "()V", line = 27)
    public static void method929() {
        field2024 = null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "()V", line = 30)
    public final void method930() {
        field2024.method3136(this.field2023, super.field3339);
    }
}
