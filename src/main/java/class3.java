import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public abstract class class3 extends class183 {

    @OriginalMember(owner = "client!an", name = "o", descriptor = "Z")
    public volatile boolean field25 = true;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "Lan;")
    public class3 field26;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "Lsh;")
    public class60 field23;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([III)V", line = 3)
    public final void method11(int[] arg0, int arg1, int arg2) {
        if (this.field25) {
            this.method16(arg0, arg1, arg2);
        } else {
            this.method14(arg2);
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "()I", line = 12)
    public int method13() {
        return 255;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "()Lan;")
    public abstract class3 method12();

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
    public abstract void method14(int arg0);

    @OriginalMember(owner = "client!an", name = "c", descriptor = "()I")
    public abstract int method15();

    @OriginalMember(owner = "client!an", name = "b", descriptor = "([III)V")
    public abstract void method16(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!an", name = "d", descriptor = "()Lan;")
    public abstract class3 method17();
}
