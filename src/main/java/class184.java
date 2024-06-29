import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class184 extends class194 {

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Z")
    public volatile boolean field3271 = true;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Lda;")
    public class184 field3274;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Lnc;")
    public class84 field3273;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()Lda;")
    public abstract class184 method210();

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()I")
    public abstract int method187();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([III)V")
    public final void method1294(int[] arg0, int arg1, int arg2) {
        if (this.field3271) {
            this.method191(arg0, arg1, arg2);
        } else {
            this.method203(arg2);
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()I")
    public int method579() {
        return 255;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()Lda;")
    public abstract class184 method196();

    @OriginalMember(owner = "client!da", name = "b", descriptor = "([III)V")
    public abstract void method191(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public abstract void method203(int arg0);
}
