import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class89 {

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1118 = 0;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1117 = "";

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field1119 = 2;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lwf;", line = 9)
    public static final class333 method644(int arg0, int arg1) {
        field1120++;
        int var2 = arg1 >> 16;
        int var3 = 124 / ((-arg0 - 34) / 58);
        int var4 = arg1 & 0xFFFF;
        if (class26.field308[var2] == null || class26.field308[var2][var4] == null) {
            boolean var5 = class140.method1081(-93, var2);
            if (!var5) {
                return null;
            }
        }
        return class26.field308[var2][var4];
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V", line = 33)
    public static void method645(boolean arg0) {
        field1117 = null;
        if (arg0) {
            field1117 = (String) null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)Ljc;", line = 54)
    public static final class321 method646(int arg0, byte arg1) {
        field1121++;
        if (arg1 > -31) {
            field1117 = (String) null;
        }
        class321 var2 = (class321) class160.field2273.method1116(17301, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class75.field989.method1089(11, (byte) 114, arg0);
        class321 var4 = new class321();
        if (var3 != null) {
            var4.method2217(new class299(var3), 121);
        }
        class160.field2273.method1115((long) arg0, 88, var4);
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)Lqa;", line = 85)
    public static final class25 method647(int arg0, int arg1) {
        class25 var2 = (class25) class225.field3238.method2265((long) arg1, (byte) -118);
        field1122++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -27169) {
            field1117 = (String) null;
        }
        byte[] var3 = class258.field3751.method1089(3, (byte) 118, arg1);
        class25 var4 = new class25();
        if (var3 != null) {
            var4.method172(true, new class299(var3));
        }
        class225.field3238.method2257(-128, var4, (long) arg1);
        return var4;
    }
}
