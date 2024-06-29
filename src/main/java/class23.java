import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class23 extends class5 {

    @OriginalMember(owner = "client!da", name = "K", descriptor = "Z")
    public volatile boolean field650 = true;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "Lda;")
    public class23 field648;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "Lea;")
    public class30 field649;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()I")
    public abstract int method134();

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()Lda;")
    public abstract class23 method104();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([III)V")
    public abstract void method109(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()Lda;")
    public abstract class23 method135();

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public abstract void method111(int arg0);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()I")
    public int method185() {
        return 255;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "([III)V")
    public final void method186(int[] arg0, int arg1, int arg2) {
        if (this.field650) {
            this.method109(arg0, arg1, arg2);
        } else {
            this.method111(arg2);
        }
    }
}
