import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class48 extends class24 {

    @OriginalMember(owner = "client!i", name = "G", descriptor = "Lsc;")
    public class110 field1228;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "Z")
    public boolean field1227;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()I", line = 4)
    public int method211() {
        return 255;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
    public abstract void method209(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([III)I")
    public abstract int method205(int[] arg0, int arg1, int arg2);
}
