import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class class194 extends class247 {

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Z")
    public volatile boolean field3071 = true;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "Log;")
    public class194 field3073;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "Lhe;")
    public class87 field3074;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()Log;")
    public abstract class194 method988();

    @OriginalMember(owner = "client!og", name = "b", descriptor = "()I")
    public int method973() {
        return 255;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "()Log;")
    public abstract class194 method947();

    @OriginalMember(owner = "client!og", name = "d", descriptor = "()I")
    public abstract int method948();

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([III)V")
    public abstract void method969(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!og", name = "b", descriptor = "([III)V")
    public final void method1360(int[] arg0, int arg1, int arg2) {
        if (this.field3071) {
            this.method969(arg0, arg1, arg2);
        } else {
            this.method952(arg2);
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
    public abstract void method952(int arg0);
}
