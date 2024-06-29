import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public abstract class class432 extends class499 {

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "Lkr;")
    public class524 field5901;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    public int field5902;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(B)Z")
    public abstract boolean method1620(byte arg0);

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lkr;I)V")
    public class432(class524 arg0, int arg1) {
        this.field5901 = arg0;
        this.field5902 = arg1;
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1621(byte arg0);
}
