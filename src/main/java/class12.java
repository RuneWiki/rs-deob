import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class12 extends class17 {

    @OriginalMember(owner = "client!be", name = "E", descriptor = "Lqc;")
    private static class99 field220;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "()V", line = 3)
    public final void method81() {
        field220.method783(class17.field334);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Ljb;Ljava/awt/Component;)V", line = 6)
    public class12(class56 arg0, Component arg1) throws Exception {
        super(22050);
        field220 = arg0.method518((byte) 101);
        field220.method782(arg1, (byte) -97);
        this.method117(arg0, 16384);
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V", line = 12)
    public final void method82(int arg0) throws Exception {
        field220.method779(arg0, true);
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "()I", line = 15)
    public final int method83() {
        return field220.method780((byte) -76);
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "()V", line = 18)
    public static void method84() {
        field220 = null;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "()V", line = 21)
    public final void method85() {
        field220.method781((byte) -124);
    }
}
