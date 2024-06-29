import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class246 extends class322 {

    @OriginalMember(owner = "client!vea", name = "I", descriptor = "I")
    private int field3819;

    @OriginalMember(owner = "client!vea", name = "H", descriptor = "Lic;")
    private static class649 field3818;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "()V", line = 4)
    public final void method1398() {
        field3818.method2178(this.field3819, -123);
    }

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "()V", line = 7)
    public final void method1397() {
        field3818.method2180(this.field3819, 1);
    }

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "()V", line = 10)
    public final void method1395() {
        field3818.method2177(this.field3819, super.field4737);
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "()I", line = 14)
    public final int method1396() {
        return field3818.method2176(this.field3819, 65535);
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lft;I)V", line = 16)
    public class246(class4 arg0, int arg1) {
        field3818 = (class649) arg0.method25(0);
        this.field3819 = arg1;
    }

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "()V", line = 21)
    public static void method1659() {
        field3818 = null;
    }

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)V", line = 24)
    public final void method1400(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3818.method2175(arg0, 0, this.field3819);
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 30)
    public final void method1399(Component arg0) throws Exception {
        field3818.method2179(arg0, class465.field6683, (byte) -44, class22.field297);
    }
}
