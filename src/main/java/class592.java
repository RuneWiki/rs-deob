import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class592 extends class651 {

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public int field7967;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public int field7962;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field7964 = 0;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "Lmt;")
    public static class419 field7963 = new class419(9, 0, 4, 1);

    @OriginalMember(owner = "client!k", name = "u", descriptor = "Leo;")
    public static class314 field7968 = new class314();

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field7961;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field7965;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field7966;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "[Luea;")
    public static class336[] field7969;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
    public static void method3298(int arg0) {
        field7963 = null;
        if (arg0 != -17839) {
            field7963 = null;
        }
        field7968 = null;
        field7969 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljp;I)Laia;")
    public static final class241 method3299(class376 arg0, int arg1) {
        if (arg1 != 20859) {
            field7964 = -25;
        }
        field7966++;
        int var2 = arg0.method2384(37);
        return new class241(var2);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lur;Lcf;IIIIIIIIII)V")
    public class592(class564 arg0, class631 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7967 = arg10;
        this.field7962 = arg11;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)Lei;")
    public static final class190 method3300(boolean arg0) {
        if (arg0) {
            method3298(50);
        }
        field7961++;
        try {
            return (class190) Class.forName("du").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class591();
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)Lhv;")
    public final class546 method1557(byte arg0) {
        field7965++;
        if (arg0 > -35) {
            field7964 = 46;
        }
        return class148.field2077;
    }
}
