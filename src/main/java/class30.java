import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JZLLDEPM")
public class class30 {

    @OriginalMember(owner = "client!JZLLDEPM", name = "a", descriptor = "Z")
    private boolean field1019 = true;

    @OriginalMember(owner = "client!JZLLDEPM", name = "b", descriptor = "J")
    public long field1020;

    @OriginalMember(owner = "client!JZLLDEPM", name = "c", descriptor = "LJZLLDEPM;")
    public class30 field1021;

    @OriginalMember(owner = "client!JZLLDEPM", name = "d", descriptor = "LJZLLDEPM;")
    public class30 field1022;

    @OriginalMember(owner = "client!JZLLDEPM", name = "e", descriptor = "Z")
    public static boolean field1023;

    @OriginalMember(owner = "client!JZLLDEPM", name = "a", descriptor = "()V")
    public void method329() {
        if (this.field1022 != null) {
            this.field1022.field1021 = this.field1021;
            this.field1021.field1022 = this.field1022;
            this.field1021 = null;
            this.field1022 = null;
        }
    }
}
