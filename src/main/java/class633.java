import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class633 extends class333 {

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "[I")
    public static int[] field8924 = new int[1];

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "Z")
    public static boolean field8927 = true;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field8919;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public int field8920;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public int field8921;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field8925;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public static int field8926;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Lrn;")
    public static class336 field8923;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 8)
    public static final void method3557(byte arg0) {
        field8926++;
        if (arg0 != 123) {
            field8927 = false;
        }
        for (class152 var1 = (class152) class372.field5072.method3434((byte) 2); var1 != null; var1 = (class152) class372.field5072.method3430(true)) {
            class34 var2 = var1.field1683;
            if (var2.field325) {
                var1.method1922(122);
                var2.method171(arg0 - 123);
            } else if (var2.field315 <= class678.field9539) {
                var2.method181(class569.field8088, true);
                if (var2.field325) {
                    var1.method1922(76);
                } else {
                    class631.method3538(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)Lwp;", line = 46)
    public static final class452 method3558(int arg0, int arg1, int arg2) {
        field8922++;
        class452 var3 = class92.method464(arg0, -167823504);
        if (arg1 == arg2) {
            return var3;
        } else if (var3 == null || var3.field6399 == null || arg2 >= var3.field6399.length) {
            return null;
        } else {
            return var3.field6399[arg2];
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V", line = 67)
    public static void method3559(byte arg0) {
        if (arg0 != -31) {
            field8924 = null;
        }
        field8924 = null;
        field8923 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V", line = 81)
    public static final void method3560(boolean arg0) {
        field8925++;
        if (!arg0) {
            method3557((byte) 81);
        }
        if (!class257.field3237) {
            return;
        }
        while (true) {
            while (class359.field4828 < class114.field1202.length) {
                class130 var1 = class114.field1202[class359.field4828];
                if (var1 != null && var1.field1467 == -1) {
                    if (class347.field4655 == null) {
                        class347.field4655 = class351.field4737.method224(!arg0, var1.field1461);
                    }
                    int var2 = class347.field4655.field3380;
                    if (var2 == -1) {
                        return;
                    }
                    class347.field4655 = null;
                    var1.field1467 = var2;
                    class359.field4828++;
                } else {
                    class359.field4828++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZII)V", line = 124)
    public static final void method3561(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method3557((byte) 2);
        }
        field8919++;
        if (class255.method1506(arg1, (byte) 113)) {
            class77.method410(class102.field1106[arg1], arg2, -98);
        }
    }
}
