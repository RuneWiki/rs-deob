import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class203 implements class243 {

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "Ljava/lang/String;")
    private String field2444;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "Ljn;")
    private class668 field2445;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "J")
    public static long field2447;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)Lkea;")
    public static final class216 method1234(int arg0, int arg1) {
        field2443++;
        class216 var2 = (class216) class685.field9782.method2766(-128, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class215.field2734.method3800(arg0, 0, (byte) -92);
        if (arg1 >= -2) {
            field2447 = 7L;
        }
        class216 var4 = new class216();
        if (var3 != null) {
            var4.method1320(new class389(var3), 6077);
        }
        var4.method1317((byte) -93);
        class685.field9782.method2772(var4, true, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)I")
    public final int method365(int arg0) {
        if (arg0 <= 81) {
            return -126;
        } else {
            field2446++;
            return this.field2445.method3810(30416, this.field2444) ? 100 : this.field2445.method3789(this.field2444, 3);
        }
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Ljn;Ljava/lang/String;)V")
    public class203(class668 arg0, String arg1) {
        this.field2444 = arg1;
        this.field2445 = arg0;
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)Luv;")
    public final class333 method360(int arg0) {
        if (arg0 != -21954) {
            method1234(-29, -93);
        }
        field2442++;
        return class333.field4431;
    }
}
