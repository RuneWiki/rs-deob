import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class308 {

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "Z")
    public static boolean field3941 = false;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field3942 = -1;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "Lim;")
    public static class353 field3939 = new class353(3, 0);

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "F")
    public static float field3938;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)Lgj;")
    public static final class93 method1846(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field3940++;
        class93 var1 = (class93) class157.field2045.method1880(109);
        if (var1 == null) {
            return new class93();
        } else {
            class624.field9032--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)V")
    public static void method1847(int arg0) {
        int var1 = -43 % ((43 - arg0) / 41);
        field3939 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "([BII)[B")
    public static final byte[] method1848(byte[] arg0, int arg1, int arg2) {
        field3936++;
        byte[] var3 = new byte[arg1];
        class205.method1311(arg0, arg2, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1849(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method1849(true, 21, 1);
        }
        field3937++;
        return class359.method2230(arg2, arg1, 0) || class241.method1503(arg2, arg1, 0);
    }
}
