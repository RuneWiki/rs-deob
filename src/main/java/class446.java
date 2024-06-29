import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class class446 extends class45 {

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "Z")
    public volatile boolean field6543 = true;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public int field6544;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "Lpl;")
    public class446 field6545;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "Lip;")
    public class49 field6542;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "()I", line = 3)
    public int method875() {
        return 255;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([III)V", line = 10)
    public final void method2809(int[] arg0, int arg1, int arg2) {
        if (this.field6543) {
            this.method495(arg0, arg1, arg2);
        } else {
            this.method470(arg2);
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "()Lpl;")
    public abstract class446 method469();

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
    public abstract void method470(int arg0);

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "([III)V")
    public abstract void method495(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "()Lpl;")
    public abstract class446 method501();

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "()I")
    public abstract int method490();
}
