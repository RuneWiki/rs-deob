import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class class89 extends class69 {

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "Lrd;")
    public class106 field2179;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "Z")
    public boolean field2180;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()I", line = 7)
    public int method740() {
        return 255;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
    public abstract void method738(int arg0);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([III)I")
    public abstract int method739(int[] arg0, int arg1, int arg2);
}
