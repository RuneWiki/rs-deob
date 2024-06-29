import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class92 extends class37 {

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Lrc;")
    public class102 field2028;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Z")
    public boolean field2029;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()I", line = 5)
    public int method549() {
        return 255;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([III)I")
    public abstract int method545(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public abstract void method544(int arg0);
}
