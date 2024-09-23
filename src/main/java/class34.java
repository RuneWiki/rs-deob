import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MRGQMKFG")
public class class34 {

    @OriginalMember(owner = "MRGQMKFG", name = "a", descriptor = "J")
    public long field1086;

    @OriginalMember(owner = "MRGQMKFG", name = "b", descriptor = "LMRGQMKFG;")
    public class34 field1087;

    @OriginalMember(owner = "MRGQMKFG", name = "c", descriptor = "LMRGQMKFG;")
    public class34 field1088;

    @OriginalMember(owner = "MRGQMKFG", name = "d", descriptor = "Z")
    public static boolean field1089;

    @OriginalMember(owner = "MRGQMKFG", name = "a", descriptor = "()V")
    public void method336() {
        if (this.field1088 != null) {
            this.field1088.field1087 = this.field1087;
            this.field1087.field1088 = this.field1088;
            this.field1087 = null;
            this.field1088 = null;
        }
    }
}
