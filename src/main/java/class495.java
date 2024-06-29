import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class495 {

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "I")
    public int field6742;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "[I")
    public int[] field6741;

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "[I")
    public int[] field6747;

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "Z")
    public static boolean field6748 = true;

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field6746;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)V")
    public static void method2791(byte arg0) {
        if (arg0 > 30) {
            field6746 = null;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILac;)Lfm;")
    public static final class684 method2792(int arg0, class501 arg1) {
        field6744++;
        int var2 = 84 % ((arg0 - 68) / 47);
        return new class684(arg1.method2875(false), arg1.method2875(false), arg1.method2875(false), arg1.method2875(false), arg1.method2819((byte) 72), arg1.method2874((byte) -75));
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(I)V")
    public class495(int arg0) {
        this.field6742 = arg0;
        this.field6741 = new int[this.field6742];
        this.field6747 = new int[this.field6742];
    }
}
