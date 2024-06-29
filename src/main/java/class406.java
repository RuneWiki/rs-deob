import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class406 {

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "Luq;")
    private class172 field5754;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public int field5755;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field5756 = -1;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lkw;ILuq;)V", line = 23)
    public class406(class263 arg0, int arg1, class172 arg2) {
        new class535(64);
        this.field5754 = arg2;
        this.field5755 = this.field5754.method1175(15, (byte) 78);
    }
}
