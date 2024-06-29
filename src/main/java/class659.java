import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class659 {

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "Lmq;")
    public static class78 field9047 = new class78(18, 8);

    @OriginalMember(owner = "client!gha", name = "e", descriptor = "I")
    public static int field9051 = -1;

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "I")
    public static int field9048;

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "I")
    public static int field9049;

    @OriginalMember(owner = "client!gha", name = "d", descriptor = "I")
    public static int field9050;

    @OriginalMember(owner = "client!gha", name = "f", descriptor = "Z")
    public static boolean field9052;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)V", line = 3)
    public static void method3577(int arg0) {
        field9047 = null;
        if (arg0 != 10) {
            field9051 = 89;
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "([BB)Ljava/lang/String;", line = 13)
    public static final String method3578(byte[] arg0, byte arg1) {
        field9048++;
        if (arg1 >= -34) {
            method3579(-14, null);
        }
        return class324.method1916(arg0, 0, (byte) 56, arg0.length);
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(ILtn;)Lcda;", line = 31)
    public static final class569 method3579(int arg0, class179 arg1) {
        field9050++;
        class619 var2 = class505.method2921(18413, arg1);
        int var3 = arg1.method1107(false);
        if (arg0 != 65) {
            return null;
        }
        int var4 = arg1.method1107(false);
        int var5 = arg1.method1107(false);
        int var6 = arg1.method1107(false);
        int var7 = arg1.method1107(false);
        int var8 = arg1.method1107(false);
        return new class569(var2.field8672, var2.field8662, var2.field8674, var2.field8675, var2.field8673, var2.field8665, var2.field8667, var2.field8663, var2.field8669, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "(I)Z", line = 60)
    public static final boolean method3580(int arg0) {
        if (arg0 != -123) {
            method3578(null, (byte) 109);
        }
        field9049++;
        if (class536.field7527) {
            try {
                class193.method1213(arg0 - 13358, "showVideoAd", class745.field10393);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }
}
