import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class591 {

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "Ltf;")
    private class701 field8343;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public int field8346;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "Lwd;")
    public static class357 field8345 = new class357(14, 0, 4, 1);

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public static int field8344;

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "Ljava/applet/Applet;")
    public static Applet field8347;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IBILvc;)V")
    public static final void method3329(int arg0, byte arg1, int arg2, class390 arg3) {
        field8344++;
        if (arg1 < -12) {
            class266.field3308[arg0][arg2] = arg3;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
    public static void method3330(int arg0) {
        field8345 = null;
        field8347 = null;
        int var1 = -57 / ((arg0 + 8) / 46);
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lqh;ILtf;)V")
    public class591(class320 arg0, int arg1, class701 arg2) {
        new class19(64);
        this.field8343 = arg2;
        this.field8346 = this.field8343.method3883(15, 0);
    }
}
