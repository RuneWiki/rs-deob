import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class22 {

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Ljava/lang/String;")
    public String field351;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Ljava/lang/String;")
    public String field356;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "J")
    public long field353;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "S")
    public static short field354 = 205;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field352 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field358 = 0;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method241(int arg0) {
        field352 = null;
        int var1 = 92 / ((54 - arg0) / 48);
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class22(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field355 = arg0;
        this.field351 = arg3;
        this.field357 = arg2;
        this.field356 = arg1;
        this.field353 = arg4;
    }
}
