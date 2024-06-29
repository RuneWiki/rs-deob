import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class51 extends class22 {

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "Lld;")
    public class70 field1200;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "Z")
    public boolean field1201;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()I", line = 6)
    public int method365() {
        return 255;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([III)I")
    public abstract int method248(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public abstract void method245(int arg0);
}
