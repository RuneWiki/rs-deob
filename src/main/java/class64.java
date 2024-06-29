import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class class64 extends class338 {

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Z")
    public volatile boolean field668 = true;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Lcd;")
    public class43 field667;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "Lle;")
    public class64 field669;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([III)V")
    public abstract void method359(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
    public abstract void method360(int arg0);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()Lle;")
    public abstract class64 method361();

    @OriginalMember(owner = "client!le", name = "b", descriptor = "()I")
    public int method362() {
        return 255;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "()Lle;")
    public abstract class64 method363();

    @OriginalMember(owner = "client!le", name = "b", descriptor = "([III)V")
    public final void method364(int[] arg0, int arg1, int arg2) {
        if (this.field668) {
            this.method359(arg0, arg1, arg2);
        } else {
            this.method360(arg2);
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "()I")
    public abstract int method365();
}
