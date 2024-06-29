import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class717 {

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Lda;")
    public class66 field9941 = null;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Lie;")
    public class6 field9943 = null;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field9940;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field9942;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 5)
    public static final void method4022(byte arg0) {
        class220.field3409.method2240(107);
        if (arg0 >= 31) {
            field9942++;
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lda;)V", line = 43)
    public class717(class66 arg0) {
        this.field9941 = arg0;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lda;Lie;)V", line = 50)
    public class717(class66 arg0, class6 arg1) {
        this.field9941 = arg0;
        this.field9943 = arg1;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILng;)V", line = 23)
    public static final void method4023(int arg0, class360 arg1) {
        field9940++;
        int var2 = 4 % ((arg0 + 22) / 61);
        arg1.field5053 = null;
        if (class343.field4789 < 20) {
            class763.field10504.method2173(-55, arg1);
            class343.field4789++;
        }
    }
}
