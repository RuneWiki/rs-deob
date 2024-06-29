import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class161 extends RuntimeException {

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3042;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Ljava/lang/String;")
    public String field3044;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[I")
    public static int[] field3040 = new int[50];

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "J")
    public static long field3039 = 0L;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Lli;")
    public static class185 field3043 = class245.method1649("blinken3:", 123);

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field3041 = 0;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Lli;")
    public static class185 field3047 = class245.method1649(":trade:", 124);

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Lhi;")
    public static class250 field3045;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1165(int arg0) {
        if (arg0 >= -32) {
            field3041 = 64;
        }
        field3043 = null;
        field3040 = null;
        field3047 = null;
        field3045 = null;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class161(Throwable arg0, String arg1) {
        this.field3042 = arg0;
        this.field3044 = arg1;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static final void method1166(int arg0) {
        if (arg0 != -22256) {
            field3039 = 20L;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class37.field583[var1] = false;
        }
        class119.field2182 = 0;
        class32.field526 = 0;
        class109.field1971 = -1;
        field3046++;
        class188.field3475 = -1;
        class211.field3848 = 1;
    }
}
