import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class138 extends class45 {

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public int field2283;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public int field2282;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field2278 = -2;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static volatile int field2276 = 0;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2277 = "Starting 3d Library";

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "Lcj;")
    public static class147 field2280;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Lla;")
    public static class203 field2279;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 5)
    public static final void method1039(int arg0) {
        class98.method774(false);
        class329.method2317((byte) -101);
        field2281++;
        class19.method112((byte) -84);
        class35.method238((byte) 58);
        class332.method2328((byte) 88);
        class43.method322((byte) -37);
        class165.method1287(12);
        class239.method1823(126);
        class20.method115(104);
        class213.method1606(-1);
        class103.method797(arg0 + 15367);
        class229.method1774((byte) -13);
        class325.method2290((byte) 115);
        class183.method1443(1);
        class164.method1267((byte) -63);
        class73.method612(96);
        class301.method2156(0);
        class316.method2238((byte) 50);
        class304.method2172(arg0 ^ 0xFFFFFFFC);
        class164.method1279(arg0 + 3792);
        class173.method1356(-29882);
        if (arg0 != -2) {
            field2280 = (class147) null;
        }
        class101.field1655.method2327(arg0 + 3);
        class183.field2948.method2327(1);
        class106.field1755.method2327(arg0 + 3);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V", line = 45)
    public static void method1040(boolean arg0) {
        if (!arg0) {
            field2280 = (class147) null;
        }
        field2279 = null;
        field2277 = null;
        field2280 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Lme;", line = 73)
    public static final class339 method1041(int arg0, int arg1, int arg2) {
        class36 var3 = class129.field2184[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class339 var4 = var3.field526;
            var3.field526 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(II)V", line = 87)
    public class138(int arg0, int arg1) {
        this.field2283 = arg1;
        this.field2282 = arg0;
    }
}
