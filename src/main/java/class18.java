import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HMUIJBAH")
public class class18 extends class71 {

    @OriginalMember(owner = "HMUIJBAH", name = "l", descriptor = "I")
    private int field907;

    @OriginalMember(owner = "HMUIJBAH", name = "m", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "HMUIJBAH", name = "n", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "HMUIJBAH", name = "a", descriptor = "(Z)LOQIGXOFQ;")
    public final class35 method171(boolean arg0) {
        class72 var2 = class72.method590(this.field908);
        if (arg0) {
            this.field907 = -224;
        }
        return var2.method597(this.field909);
    }
}
