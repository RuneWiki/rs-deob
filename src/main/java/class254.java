import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class254 extends class305 {

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "[Laf;")
    public class399[] field3902;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "J")
    public static long field3901 = 0L;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "[I")
    public static int[] field3898 = null;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "F")
    public static float field3899;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "Lmn;")
    public static class333 field3900;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sm", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field3905;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1695(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)V", line = 10)
    public static void method1693(boolean arg0) {
        if (!arg0) {
            field3898 = null;
            field3900 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIII)Z", line = 27)
    public static final boolean method1694(int arg0, int arg1, int arg2, int arg3) {
        field3903++;
        class614 var4 = (class614) class149.method1061(arg1, arg2, arg0);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class485.method2819(var4, (byte) 49);
        }
        if (arg3 != 13088) {
            field3904 = 3;
        }
        class614 var6 = (class614) class349.method2155(arg1, arg2, arg0, field3905 == null ? (field3905 = method1695("rda")) : field3905);
        if (var6 != null) {
            var5 &= class485.method2819(var6, (byte) 49);
        }
        class614 var7 = (class614) class124.method946(arg1, arg2, arg0);
        if (var7 != null) {
            var5 &= class485.method2819(var7, (byte) 49);
        }
        return var5;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "([Laf;)V", line = 54)
    public class254(class399[] arg0) {
        this.field3902 = arg0;
    }
}
