import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class91 extends class147 {

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    private int field2145;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "Lgf;")
    private static class48 field2144;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "()V", line = 3)
    public final void method778() {
        field2144.method545(this.field2145, super.field3668);
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "()V", line = 6)
    public final void method779() {
        field2144.method546(this.field2145, -30424);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()I", line = 9)
    public final int method780() {
        return field2144.method542((byte) -88, this.field2145);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 13)
    public final void method781(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2144.method544(this.field2145, 5470, arg0);
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "()V", line = 20)
    public final void method782() {
        field2144.method541(this.field2145, (byte) -106);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 23)
    public final void method783(Component arg0) throws Exception {
        field2144.method543(class93.field2181, class12.field319, arg0, -112);
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "()V", line = 26)
    public static void method784() {
        field2144 = null;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Ltc;I)V", line = 28)
    public class91(class133 arg0, int arg1) {
        field2144 = arg0.method1081(-88);
        this.field2145 = arg1;
    }
}
