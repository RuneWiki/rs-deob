import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class760 extends class540 {

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public int field10480;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public int field10481;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field10479 = 104;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lke;")
    public static class622 field10482 = new class622(83, 4);

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Ljava/awt/Image;")
    public static Image field10483;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 5)
    public static void method4192(byte arg0) {
        field10482 = null;
        if (arg0 <= -61) {
            field10483 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V", line = 21)
    public class760(int arg0, int arg1) {
        this.field10480 = arg1;
        this.field10481 = arg0;
    }
}
