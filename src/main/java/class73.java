import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class73 {

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Z")
    public static boolean field1032 = false;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Lir;")
    public static class185 field1034;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Z")
    public static final boolean method596(int arg0, int arg1) {
        class338.field5002 = true;
        field1029++;
        class416.field6024 = arg1 + 1 & arg0;
        return true;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)Lmd;")
    public static final class233 method597(int arg0, int arg1) {
        field1030++;
        class51 var2 = class163.field2221;
        class233 var3;
        synchronized (class163.field2221) {
            var3 = (class233) class163.field2221.method378((byte) 28, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        if (arg1 != -1) {
            method597(34, 100);
        }
        byte[] var4 = class78.field1096.method1235(class261.method1751(arg0, false), false, class305.method2039(arg0, arg1 ^ 0x6));
        class233 var5 = new class233();
        var5.field3255 = arg0;
        if (var4 != null) {
            var5.method1518(new class341(var4), (byte) 98);
        }
        var5.method1515(-100);
        class51 var6 = class163.field2221;
        synchronized (class163.field2221) {
            class163.field2221.method367((long) arg0, var5, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method598(int arg0) {
        field1034 = null;
        int var1 = -1 % ((-arg0 - 33) / 38);
    }
}
