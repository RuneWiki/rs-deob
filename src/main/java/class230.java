import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class230 extends class181 {

    @OriginalMember(owner = "client!aca", name = "u", descriptor = "I")
    public int field3099 = -1;

    @OriginalMember(owner = "client!aca", name = "t", descriptor = "Lrn;")
    public static class633 field3098 = new class633(0, 0);

    @OriginalMember(owner = "client!aca", name = "o", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!aca", name = "p", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!aca", name = "q", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!aca", name = "s", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!aca", name = "x", descriptor = "I")
    public int field3102;

    @OriginalMember(owner = "client!aca", name = "v", descriptor = "Ljava/lang/String;")
    public String field3100;

    @OriginalMember(owner = "client!aca", name = "w", descriptor = "Ljava/lang/String;")
    public String field3101;

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "Z")
    public static boolean field3104;

    @OriginalMember(owner = "client!aca", name = "y", descriptor = "[I")
    public static int[] field3103;

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "(B)Lwfa;")
    public final class408 method1475(byte arg0) {
        ++field3097;
        return arg0 <= 62 ? null : class397.field5237[super.field2473];
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V")
    public static void method1476(boolean arg0) {
        field3103 = null;
        if (arg0) {
            field3098 = null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(BI)Lfba;")
    public static final class368 method1477(byte arg0, int arg1) {
        ++field3095;
        int var2 = -71 / ((83 - arg0) / 35);
        class368 var3 = (class368) class121.field1624.method1941((long) arg1, (byte) -107);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class67.field884.method139(arg1, (byte) -94, 0);
            if (var4 != null && ~var4.length < -2) {
                class368 var5;
                try {
                    var5 = class310.method1830(var4, -119);
                } catch (Exception var7) {
                    throw new RuntimeException(var7.getMessage() + " S: " + arg1);
                }
                class121.field1624.method1936(var5, (long) arg1, -120);
                return var5;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(JBI)Ljava/lang/String;")
    public static final String method1478(long arg0, byte arg1, int arg2) {
        ++field3094;
        if (arg1 < 67) {
            return null;
        } else {
            class525.method2886(-120, arg0);
            int var4 = class368.field4508.get(5);
            int var5 = class368.field4508.get(2) - -1;
            int var6 = class368.field4508.get(1);
            return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
        }
    }
}
