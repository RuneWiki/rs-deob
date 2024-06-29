import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class60 {

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "Llg;")
    public static class284 field799 = new class284(10, 3);

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "Lc;")
    public class121 field803;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "Lj;")
    public class378 field801;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tt", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field806;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)Lls;")
    public static final class92 method380(int arg0) {
        field804++;
        if (class481.field7037 == null || class365.field5130 == null) {
            return null;
        }
        for (class92 var1 = (class92) class365.field5130.method2205(arg0 ^ 0xB17BAE43); var1 != null; var1 = (class92) class365.field5130.method2205(1317274464)) {
            class191 var2 = class481.field7031.method850((byte) 78, var1.field1236);
            if (var2 != null && var2.field2687 && var2.method1149(arg0 + 21213, class481.field7030)) {
                return var1;
            }
        }
        if (arg0 != -21213) {
            field799 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V")
    public static void method381(byte arg0) {
        if (arg0 >= -29) {
            method382((byte) -106);
        }
        field799 = null;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(B)V")
    public static final void method382(byte arg0) {
        if (class397.field5519 == 2) {
            class463.field6730 = 96;
        } else {
            try {
                Method var1 = (field806 == null ? (field806 = method385("java.lang.Runtime")) : field806).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class463.field6730 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field805++;
        if (arg0 != -104) {
            field799 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V")
    public static final void method383(int arg0) {
        field800++;
        if (arg0 != -16780) {
            method382((byte) -21);
        }
        for (class64 var1 = (class64) class114.field1552.method3072((byte) 109); var1 != null; var1 = (class64) class114.field1552.method3066(2)) {
            if (var1.field873 > 0) {
                var1.field873--;
            }
            if (var1.field873 != 0) {
                if (var1.field880 > 0) {
                    var1.field880--;
                }
                if (var1.field880 == 0 && var1.field885 >= 1 && var1.field884 >= 1 && var1.field885 <= (class442.field6435 - 2) && class232.field3217 - 2 >= var1.field884 && (var1.field874 < 0 || class24.method180(false, var1.field874, var1.field881))) {
                    class151.method955(var1.field883, var1.field885, var1.field881, var1.field874, var1.field884, var1.field882, (byte) -6, -1, var1.field876);
                    var1.field880 = -1;
                    if (var1.field879 == var1.field874 && var1.field879 == -1) {
                        var1.method2946(-125);
                    } else if (var1.field879 == var1.field874 && var1.field882 == var1.field875 && var1.field881 == var1.field877) {
                        var1.method2946(-111);
                    }
                }
            } else if (var1.field879 < 0 || class24.method180(false, var1.field879, var1.field877)) {
                class151.method955(var1.field883, var1.field885, var1.field877, var1.field879, var1.field884, var1.field875, (byte) -6, -1, var1.field876);
                var1.method2946(arg0 ^ 0x41F4);
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lss;B)V")
    public static final void method384(class295 arg0, byte arg1) {
        if (arg0.field3984 == 5 && arg0.field4072 != -1) {
            class295.method1694(117, arg0, class418.field6109);
        }
        field802++;
        if (arg1 >= -15) {
            method381((byte) -13);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method385(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
