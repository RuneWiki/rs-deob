import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class219 extends class138 {

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    private int field3394;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "Lck;")
    private static class1 field3395;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "()V")
    public final void method873() {
        field3395.method1(this.field3394, (byte) 60);
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "()V")
    public static void method1429() {
        field3395 = null;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "()V")
    public final void method884() {
        field3395.method2(this.field3394, super.field1911);
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "()V")
    public final void method880() {
        field3395.method6(this.field3394, -7516);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "()I")
    public final int method869() {
        return field3395.method5(-10501, this.field3394);
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)V")
    public final void method885(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3395.method3(arg0, -5224, this.field3394);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method868(Component arg0) throws Exception {
        field3395.method4(class53.field760, 31487, class175.field2476, arg0);
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lfk;I)V")
    public class219(class52 arg0, int arg1) {
        field3395 = arg0.method321((byte) -96);
        this.field3394 = arg1;
    }
}
