import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class210 extends class270 {

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Ljava/lang/String;")
    public String field2548;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field2549 = 0;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "[I")
    public static int[] field2551 = new int[1];

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2550 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "Lhh;")
    public static class116 field2553 = new class116(2);

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V", line = 6)
    public class210() {
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBZ)V", line = 11)
    public static final void method1264(int arg0, byte arg1, boolean arg2) {
        class347.field4526 = arg0;
        class19.field176 = 3;
        field2552++;
        if (arg1 > -110) {
            method1264(-40, (byte) 127, true);
        }
        class485.method2815(class152.field1726.field3992, -32012, class152.field1726.field3986);
        if (arg2) {
            class363.method1993("", false, "", 68);
        } else {
            class396.method2164((byte) -124);
            class363.method1993(class316.field4114, false, class375.field4865, 17);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Z", line = 34)
    public static final boolean method1265(int arg0) {
        field2547++;
        return class636.field9006 == arg0 ? class112.field1304.method649((byte) 116) : true;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 46)
    public static void method1266(int arg0) {
        field2550 = null;
        if (arg0 == 3) {
            field2553 = null;
            field2551 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 60)
    public class210(String arg0) {
        this.field2548 = arg0;
    }
}
