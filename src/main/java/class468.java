import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class468 {

    @OriginalMember(owner = "client!so", name = "c", descriptor = "Ltp;")
    public static class532 field6697 = null;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field6698 = 52;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field6699 = 0;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V")
    public static void method2833(byte arg0) {
        int var1 = -27 % ((arg0 + 4) / 47);
        field6697 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ILnaa;II)V")
    public static final void method2834(int arg0, class71 arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            field6699 = -87;
        }
        field6695++;
        class97.field1020[arg3][arg0] = arg1;
    }

    @OriginalMember(owner = "client!so", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6696++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(II)V")
    public class468(int arg0, int arg1) {
    }
}
