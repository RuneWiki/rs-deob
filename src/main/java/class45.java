import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PXORWIXO")
public class class45 {

    @OriginalMember(owner = "client!PXORWIXO", name = "a", descriptor = "J")
    public long field1314;

    @OriginalMember(owner = "client!PXORWIXO", name = "b", descriptor = "LPXORWIXO;")
    public class45 field1315;

    @OriginalMember(owner = "client!PXORWIXO", name = "c", descriptor = "LPXORWIXO;")
    public class45 field1316;

    @OriginalMember(owner = "client!PXORWIXO", name = "d", descriptor = "Z")
    public static boolean field1317;

    @OriginalMember(owner = "client!PXORWIXO", name = "a", descriptor = "()V")
    public void method464() {
        if (this.field1316 != null) {
            this.field1316.field1315 = this.field1315;
            this.field1315.field1316 = this.field1316;
            this.field1315 = null;
            this.field1316 = null;
        }
    }
}
