import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class112 extends class20 {

    @OriginalMember(owner = "client!qe", name = "Mb", descriptor = "I")
    private int field2790;

    @OriginalMember(owner = "client!qe", name = "Nb", descriptor = "Ln;")
    private static class89 field2791;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "()V")
    public static void method918() {
        field2791 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()V")
    public final void method100() {
        field2791.method785(this.field2790, 8540);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public final void method101(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2791.method786(arg0, (byte) -97, this.field2790);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method99(Component arg0) throws Exception {
        field2791.method788(class85.field2224, arg0, class59.field1633, (byte) -78);
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "()V")
    public final void method102() {
        field2791.method784(this.field2790, super.field508);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "()V")
    public final void method97() {
        field2791.method783(1567, this.field2790);
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lba;I)V")
    public class112(class9 arg0, int arg1) {
        field2791 = arg0.method65((byte) -108);
        this.field2790 = arg1;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "()I")
    public final int method98() {
        return field2791.method787(this.field2790, (byte) 74);
    }
}
