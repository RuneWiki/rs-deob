import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class243 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Loa;")
    public static class99 field4202 = class221.method1463(2844, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Loa;")
    public static class99 field4203 = class221.method1463(2844, "glissement:");

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Ldd;")
    public static final class133 method1575(byte arg0) {
        field4200++;
        try {
            if (arg0 >= -109) {
                field4202 = null;
            }
            return (class133) Class.forName("od").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public static void method1576(boolean arg0) {
        if (arg0) {
            field4202 = null;
        }
        field4202 = null;
        field4203 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[Ltf;IZII)V")
    public static final void method1577(int arg0, class107[] arg1, int arg2, boolean arg3, int arg4, int arg5) {
        for (int var6 = 0; var6 < arg1.length; var6++) {
            class107 var7 = arg1[var6];
            if (var7 != null && var7.field1801 == arg0) {
                class169.method1143(var7, arg4, arg3, arg5, 19);
                class150.method1003(var7, arg4, 122, arg5);
                if (var7.field1803 - var7.field1793 < var7.field1832) {
                    var7.field1832 = var7.field1803 - var7.field1793;
                }
                if (var7.field1871 > var7.field1796 - var7.field1933) {
                    var7.field1871 = var7.field1796 - var7.field1933;
                }
                if (var7.field1832 < 0) {
                    var7.field1832 = 0;
                }
                if (var7.field1871 < 0) {
                    var7.field1871 = 0;
                }
                if (var7.field1814 == 0) {
                    class216.method1446(arg3, (byte) 84, var7);
                }
            }
        }
        if (arg2 != -4441) {
            method1576(false);
        }
        field4201++;
    }
}
