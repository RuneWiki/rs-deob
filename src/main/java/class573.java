import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class573 extends class66 {

    @OriginalMember(owner = "client!aaa", name = "q", descriptor = "J")
    public long field8181;

    @OriginalMember(owner = "client!aaa", name = "r", descriptor = "Lpca;")
    public static class665 field8182 = null;

    @OriginalMember(owner = "client!aaa", name = "s", descriptor = "Lla;")
    public static class418 field8183;

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "()V")
    public class573() {
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(J)V")
    public class573(long arg0) {
        this.field8181 = arg0;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
    public static void method3370(int arg0) {
        if (arg0 != 11738) {
            field8182 = null;
        }
        field8183 = null;
        field8182 = null;
    }
}
