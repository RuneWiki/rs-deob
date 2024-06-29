import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public abstract class class19 extends class435 {

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "Z")
    public volatile boolean field272 = true;

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
    public int field271;

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "Lrf;")
    public class158 field273;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "Lnr;")
    public class19 field270;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "([III)V", line = 9)
    public final void method204(int[] arg0, int arg1, int arg2) {
        if (this.field272) {
            this.method203(arg0, arg1, arg2);
        } else {
            this.method201(arg2);
        }
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "()I", line = 21)
    public int method206() {
        return 255;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public abstract void method201(int arg0);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "()Lnr;")
    public abstract class19 method202();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([III)V")
    public abstract void method203(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "()I")
    public abstract int method205();

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "()Lnr;")
    public abstract class19 method207();
}
