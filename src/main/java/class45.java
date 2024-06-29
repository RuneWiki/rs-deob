import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class45 {

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "Ljo;")
    private class303 field501;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIII)V", line = 18)
    public static final void method221(int arg0, int arg1, int arg2, int arg3) {
        field503++;
        class530 var4 = class242.method1402(-62, arg3, arg1);
        var4.method3025((byte) -69);
        var4.field7589 = arg2;
        var4.field7593 = arg0;
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Ljda;ILjo;)V", line = 35)
    public class45(class207 arg0, int arg1, class303 arg2) {
        new class653(64);
        this.field501 = arg2;
        this.field502 = this.field501.method1727(-77, 15);
    }
}
