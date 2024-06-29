import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class24 extends class287 {

    @OriginalMember(owner = "client!u", name = "k", descriptor = "Z")
    public volatile boolean field315 = true;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Lfi;")
    public class110 field316;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "Lu;")
    public class24 field317;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()I", line = 6)
    public int method153() {
        return 255;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([III)V", line = 10)
    public final void method155(int[] arg0, int arg1, int arg2) {
        if (this.field315) {
            this.method157(arg0, arg1, arg2);
        } else {
            this.method154(arg2);
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
    public abstract void method154(int arg0);

    @OriginalMember(owner = "client!u", name = "b", descriptor = "()Lu;")
    public abstract class24 method156();

    @OriginalMember(owner = "client!u", name = "b", descriptor = "([III)V")
    public abstract void method157(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!u", name = "c", descriptor = "()Lu;")
    public abstract class24 method158();

    @OriginalMember(owner = "client!u", name = "d", descriptor = "()I")
    public abstract int method159();
}
