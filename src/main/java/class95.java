import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class95 {

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "[I")
    public static int[] field1607 = new int[25];

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "[I")
    public static int[] field1605 = new int[500];

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "Z")
    public static boolean field1608;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "Lc;")
    public class121 field1606;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "Lqa;")
    public static class162 field1609;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "Lj;")
    public class377 field1602;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mr", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field1610;

    // $FF: synthetic method
    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method732(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class494("", 76);
        field1608 = false;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIII)Z", line = 3)
    public static final boolean method730(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 76) {
            method730(-5, -61, 79, 25);
        }
        field1604++;
        class248 var4 = (class248) class310.method2028(arg1, arg3, arg2);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class71.method585((byte) 3, var4);
        }
        class248 var6 = (class248) class367.method2294(arg1, arg3, arg2, field1610 == null ? (field1610 = method732("pa")) : field1610);
        if (var6 != null) {
            var5 &= class71.method585((byte) -76, var6);
        }
        class248 var7 = (class248) class412.method2496(arg1, arg3, arg2);
        if (var7 != null) {
            var5 &= class71.method585((byte) 123, var7);
        }
        return var5;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V", line = 39)
    public static void method731(int arg0) {
        field1609 = null;
        field1605 = null;
        if (arg0 == 500) {
            field1607 = null;
        }
    }
}
