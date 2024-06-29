import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class332 implements class549 {

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "Lps;")
    public class105 field4105;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public int field4109;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "Lft;")
    public class4 field4107;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public int field4106;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public int field4104;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "Lqo;")
    public static class24 field4110;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "Lbq;")
    public static class307 field4108;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
    public static void method1971(int arg0) {
        field4110 = null;
        field4108 = null;
        if (arg0 != 19969) {
            field4110 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(ILps;Lft;II)V")
    public class332(int arg0, class105 arg1, class4 arg2, int arg3, int arg4) {
        this.field4105 = arg1;
        this.field4109 = arg3;
        this.field4107 = arg2;
        this.field4106 = arg4;
        this.field4104 = arg0;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)Llf;")
    public class251 method94(int arg0) {
        if (arg0 != 1024) {
            this.field4106 = -93;
        }
        field4103++;
        return class354.field4404;
    }
}
