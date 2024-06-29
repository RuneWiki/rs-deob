import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class200 extends class160 {

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "[I")
    public static int[] field3100;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V")
    public static final void method1413(int arg0, int arg1, int arg2) {
        class257.field4090[arg1] = arg0;
        field3099++;
        class140 var3 = (class140) class254.field4055.method2043((long) arg1, -1);
        if (arg2 <= 14) {
            return;
        }
        if (var3 == null) {
            class140 var4 = new class140(class242.method1650(37) + 500L);
            class254.field4055.method2046(var4, -57, (long) arg1);
        } else {
            var3.field2085 = class242.method1650(19) + 500L;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1414(int arg0, String[] arg1) {
        field3098++;
        if (arg0 > -46) {
            field3097 = 126;
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static void method1415(int arg0) {
        field3100 = null;
        if (arg0 != -6) {
            method1416(-72, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)Laa;")
    public static final class175 method1416(int arg0, byte arg1) {
        field3103++;
        class175 var2 = (class175) class152.field2249.method1173((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class54.field861.method721((byte) -117, 29, arg0);
        class175 var4 = new class175();
        if (var3 != null) {
            var4.method1251(1, new class31(var3), arg0);
        }
        class152.field2249.method1167(arg1, var4, (long) arg0);
        return var4;
    }
}
