import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class646 extends class363 {

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public int field8746;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Lsea;")
    public class652 field8748;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field8749 = 0;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "F")
    public static float field8747;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method2115(byte arg0);

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lsea;I)V")
    public class646(class652 arg0, int arg1) {
        this.field8746 = arg1;
        this.field8748 = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)V")
    public static final void method3611(int arg0, int arg1) {
        field8750++;
        class243 var2 = class546.method2926(arg1, arg0, true);
        var2.method1455(true);
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)Z")
    public abstract boolean method2112(int arg0);
}
