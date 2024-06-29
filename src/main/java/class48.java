import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public abstract class class48 extends class45 {

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "Z")
    public volatile boolean field566 = true;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Leg;")
    public class48 field565;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Lrj;")
    public class644 field564;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "()I", line = 10)
    public int method256() {
        return 255;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "([III)V", line = 14)
    public final void method258(int[] arg0, int arg1, int arg2) {
        if (this.field566) {
            this.method253(arg0, arg1, arg2);
        } else {
            this.method255(arg2);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "()I")
    public abstract int method252();

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([III)V")
    public abstract void method253(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "()Leg;")
    public abstract class48 method254();

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public abstract void method255(int arg0);

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "()Leg;")
    public abstract class48 method257();
}
