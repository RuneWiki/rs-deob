import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class3 extends class68 {

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "Lga;")
    public class39 field28;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "Z")
    public boolean field29;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()I", line = 6)
    public int method14() {
        return 255;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([III)I")
    public abstract int method13(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
    public abstract void method15(int arg0);
}
