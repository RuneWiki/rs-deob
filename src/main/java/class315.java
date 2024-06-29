import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class315 extends RuntimeException {

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "Ljava/lang/String;")
    public String field4213;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4217;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field4214 = 104;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field4215 = 0;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "Z")
    public static boolean field4216 = false;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "[Llb;")
    public static class208[] field4218 = new class208[14];

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)Ljava/lang/String;", line = 8)
    public static final String method1825(int arg0, int arg1) {
        field4220++;
        if (arg1 == 34) {
            return arg0 < 999999999 ? Integer.toString(arg0) : "*";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 38)
    public static void method1826(int arg0) {
        field4218 = null;
        if (arg0 != 7015) {
            field4214 = -36;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)Llf;", line = 53)
    public static final class339 method1827(int arg0, byte arg1) {
        field4219++;
        class339 var2 = (class339) class160.field2061.method616(123, (long) arg0);
        if (arg1 < 41) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class109.field1341.method1687(arg0, 34, 255);
            class339 var4 = new class339();
            if (var3 != null) {
                var4.method1977(arg0, -38, new class250(var3));
            }
            class160.field2061.method615((byte) -108, (long) arg0, var4);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 76)
    public class315(Throwable arg0, String arg1) {
        this.field4213 = arg1;
        this.field4217 = arg0;
    }
}
