import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZSZDCWXM")
public class class72 {

    @OriginalMember(owner = "ZSZDCWXM", name = "a", descriptor = "I")
    private int field1709 = -82;

    @OriginalMember(owner = "ZSZDCWXM", name = "b", descriptor = "J")
    public long field1710;

    @OriginalMember(owner = "ZSZDCWXM", name = "c", descriptor = "LZSZDCWXM;")
    public class72 field1711;

    @OriginalMember(owner = "ZSZDCWXM", name = "d", descriptor = "LZSZDCWXM;")
    public class72 field1712;

    @OriginalMember(owner = "ZSZDCWXM", name = "e", descriptor = "Z")
    public static boolean field1713;

    @OriginalMember(owner = "ZSZDCWXM", name = "a", descriptor = "()V")
    public void method589() {
        if (this.field1712 != null) {
            this.field1712.field1711 = this.field1711;
            this.field1711.field1712 = this.field1712;
            this.field1711 = null;
            this.field1712 = null;
        }
    }
}
