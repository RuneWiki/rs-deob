import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class class83 extends class20 {

    @OriginalMember(owner = "client!m", name = "C", descriptor = "Z")
    public volatile boolean field1848 = true;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "Lle;")
    public class81 field1849;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "Lm;")
    public class83 field1850;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([III)V")
    public final void method608(int[] arg0, int arg1, int arg2) {
        if (this.field1848) {
            this.method372(arg0, arg1, arg2);
        } else {
            this.method360(arg2);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()Lm;")
    public abstract class83 method353();

    @OriginalMember(owner = "client!m", name = "b", descriptor = "()I")
    public int method609() {
        return 255;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "()I")
    public abstract int method357();

    @OriginalMember(owner = "client!m", name = "d", descriptor = "()Lm;")
    public abstract class83 method377();

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
    public abstract void method360(int arg0);

    @OriginalMember(owner = "client!m", name = "b", descriptor = "([III)V")
    public abstract void method372(int[] arg0, int arg1, int arg2);
}
