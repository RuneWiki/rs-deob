import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class87 extends class82 {

    @OriginalMember(owner = "client!oc", name = "db", descriptor = "Lud;")
    public class124 field2171;

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "Z")
    public boolean field2170;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()I", line = 5)
    public int method591() {
        return 255;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public abstract void method128(int arg0);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([III)I")
    public abstract int method135(int[] arg0, int arg1, int arg2);
}
