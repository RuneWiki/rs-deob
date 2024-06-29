import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class725 {

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "Lpq;")
    private class194 field10036;

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
    public int field10037;

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "F")
    public static float field10034;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
    public static int field10033;

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "I")
    public static int field10035;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "[[I")
    public static int[][] field10032;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V", line = 5)
    public static void method4035(int arg0) {
        field10032 = null;
        if (arg0 > -120) {
            field10034 = -2.4620144F;
        }
    }

    @OriginalMember(owner = "client!cca", name = "finalize", descriptor = "()V", line = 17)
    protected final void finalize() throws Throwable {
        field10035++;
        this.field10036.method1221(17353, this.field10037);
        super.finalize();
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IILsha;)I", line = 26)
    public static final int method4036(int arg0, int arg1, class115 arg2) {
        field10033++;
        if (!client.method779(arg2).method1108(-112857776, arg1) && arg2.field1477 == null) {
            return -1;
        } else if (arg0 == -1) {
            return arg2.field1556 == null || arg1 >= arg2.field1556.length ? -1 : arg2.field1556[arg1];
        } else {
            return -50;
        }
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lpq;II)V", line = 44)
    public class725(class194 arg0, int arg1, int arg2) {
        this.field10036 = arg0;
        this.field10037 = arg2;
    }
}
