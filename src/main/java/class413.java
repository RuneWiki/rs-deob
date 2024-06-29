import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public abstract class class413 extends class159 {

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "Z")
    public volatile boolean field5944 = true;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public int field5943;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "Lwd;")
    public class288 field5941;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "Lpp;")
    public class413 field5942;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "()I", line = 5)
    public int method1936() {
        return 255;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "([III)V", line = 9)
    public final void method2489(int[] arg0, int arg1, int arg2) {
        if (this.field5944) {
            this.method18(arg0, arg1, arg2);
        } else {
            this.method17(arg2);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
    public abstract void method17(int arg0);

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "()Lpp;")
    public abstract class413 method13();

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "()Lpp;")
    public abstract class413 method15();

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "()I")
    public abstract int method24();

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "([III)V")
    public abstract void method18(int[] arg0, int arg1, int arg2);
}
