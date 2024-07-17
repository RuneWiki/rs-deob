import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PPOHBEGB")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "PPOHBEGB", name = "h", descriptor = "I")
    public static int _flowObfuscator3;

    @OriginalMember(owner = "PPOHBEGB", name = "f", descriptor = "LPPOHBEGB;")
    public DoublyLinkable nextDouble;

    @OriginalMember(owner = "PPOHBEGB", name = "g", descriptor = "LPPOHBEGB;")
    public DoublyLinkable prevDouble;

    @OriginalMember(owner = "PPOHBEGB", name = "b", descriptor = "()V")
    public void unlinkDouble() {
        if (this.prevDouble != null) {
            this.prevDouble.nextDouble = this.nextDouble;
            this.nextDouble.prevDouble = this.prevDouble;
            this.nextDouble = null;
            this.prevDouble = null;
        }
    }
}
