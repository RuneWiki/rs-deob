import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ICYTWAKR")
public class class29 {

    @OriginalMember(owner = "ICYTWAKR", name = "a", descriptor = "J")
    public long field875;

    @OriginalMember(owner = "ICYTWAKR", name = "b", descriptor = "LICYTWAKR;")
    public class29 field876;

    @OriginalMember(owner = "ICYTWAKR", name = "c", descriptor = "LICYTWAKR;")
    public class29 field877;

    @OriginalMember(owner = "ICYTWAKR", name = "d", descriptor = "Z")
    public static boolean field878;

    @OriginalMember(owner = "ICYTWAKR", name = "a", descriptor = "()V")
    public void method290() {
        if (this.field877 != null) {
            this.field877.field876 = this.field876;
            this.field876.field877 = this.field877;
            this.field876 = null;
            this.field877 = null;
        }
    }
}
