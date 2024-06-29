import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class759 extends class499 {

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public int field10562;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Laea;")
    public static class50 field10559 = new class50();

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Lhda;")
    public static class752 field10561 = new class752(39, -1);

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field10560;

    // $FF: synthetic field
    @OriginalMember(owner = "client!f", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field10563;

    // $FF: synthetic method
    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4228(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIB)Z", line = 5)
    public static final boolean method4226(int arg0, int arg1, int arg2, byte arg3) {
        field10560++;
        class624 var4 = (class624) class672.method3710(arg0, arg2, arg1);
        boolean var5 = true;
        if (arg3 != 12) {
            method4227(-20);
        }
        if (var4 != null) {
            var5 &= class207.method1383(var4, (byte) 62);
        }
        class624 var6 = (class624) class490.method2780(arg0, arg2, arg1, field10563 == null ? (field10563 = method4228("paa")) : field10563);
        if (var6 != null) {
            var5 &= class207.method1383(var6, (byte) 88);
        }
        class624 var7 = (class624) class694.method3906(arg0, arg2, arg1);
        if (var7 != null) {
            var5 &= class207.method1383(var7, (byte) 124);
        }
        return var5;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 38)
    public static void method4227(int arg0) {
        field10559 = null;
        field10561 = null;
        if (arg0 >= -59) {
            method4226(-3, -60, -91, (byte) 2);
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(I)V", line = 54)
    public class759(int arg0) {
        this.field10562 = arg0;
    }
}
