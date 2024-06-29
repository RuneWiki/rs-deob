import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class359 {

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Z")
    public static boolean field4899 = false;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "J")
    public static long field4898 = 0L;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4901 = 0;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILnq;)V")
    public static final void method2300(int arg0, class268 arg1) {
        class333.field4595 = arg1;
        if (arg0 == 15021) {
            field4900++;
        }
    }
}
