import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HSUOZGYX")
public class class20 extends class38 {

    @OriginalMember(owner = "HSUOZGYX", name = "e", descriptor = "LHSUOZGYX;")
    public class20 field850;

    @OriginalMember(owner = "HSUOZGYX", name = "f", descriptor = "LHSUOZGYX;")
    public class20 field851;

    @OriginalMember(owner = "HSUOZGYX", name = "g", descriptor = "Z")
    public static boolean field852;

    @OriginalMember(owner = "HSUOZGYX", name = "b", descriptor = "()V")
    public void method298() {
        if (this.field851 != null) {
            this.field851.field850 = this.field850;
            this.field850.field851 = this.field851;
            this.field850 = null;
            this.field851 = null;
        }
    }
}
