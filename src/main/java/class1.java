import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class1 extends class573 {

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Lrw;")
    public static class535 field3 = new class535(16);

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field2;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field4;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1(int arg0, int arg1, int arg2, int arg3) {
        field2++;
        class289 var4 = (class289) class147.method997(arg0, arg2, arg1);
        if (arg3 != 7913) {
            field3 = null;
        }
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class45.method278(var4, -127);
        }
        class289 var6 = (class289) class609.method3354(arg0, arg2, arg1, field4 == null ? (field4 = method4("dda")) : field4);
        if (var6 != null) {
            var5 &= class45.method278(var6, -95);
        }
        class289 var7 = (class289) class618.method3391(arg0, arg2, arg1);
        if (var7 != null) {
            var5 &= class45.method278(var7, -85);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method2(int arg0) {
        field3 = null;
        if (arg0 != -2) {
            method1(-13, 5, 68, -43);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lve;")
    public static final class421 method3(Throwable arg0, String arg1) {
        field1++;
        class421 var2;
        if (arg0 instanceof class421) {
            var2 = (class421) arg0;
            var2.field5867 = var2.field5867 + ' ' + arg1;
        } else {
            var2 = new class421(arg0, arg1);
        }
        return var2;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
