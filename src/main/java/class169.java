import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public abstract class class169 extends class172 {

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "Z")
    public volatile boolean field2677 = true;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public int field2676;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Lph;")
    public class169 field2678;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "Lfi;")
    public class80 field2679;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "()I", line = 4)
    public int method56() {
        return 255;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "([III)V", line = 12)
    public final void method1339(int[] arg0, int arg1, int arg2) {
        if (this.field2677) {
            this.method47(arg0, arg1, arg2);
        } else {
            this.method82(arg2);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "()Lph;")
    public abstract class169 method61();

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([III)V")
    public abstract void method47(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V")
    public abstract void method82(int arg0);

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "()Lph;")
    public abstract class169 method81();

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "()I")
    public abstract int method88();
}
