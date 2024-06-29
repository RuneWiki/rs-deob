import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public abstract class class407 extends class498 {

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "Z")
    public volatile boolean field5762 = true;

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
    public int field5761;

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "Lcv;")
    public class407 field5763;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "Lil;")
    public class7 field5764;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "()I", line = 3)
    public int method1473() {
        return 255;
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "([III)V", line = 17)
    public final void method2416(int[] arg0, int arg1, int arg2) {
        if (this.field5762) {
            this.method512(arg0, arg1, arg2);
        } else {
            this.method519(arg2);
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "()I")
    public abstract int method518();

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "([III)V")
    public abstract void method512(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "()Lcv;")
    public abstract class407 method520();

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "()Lcv;")
    public abstract class407 method511();

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
    public abstract void method519(int arg0);
}
