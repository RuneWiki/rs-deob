import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class226 extends class178 {

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "[B")
    public byte[] field3940;

    @OriginalMember(owner = "client!vh", name = "ab", descriptor = "I")
    public static int field3947 = 50;

    @OriginalMember(owner = "client!vh", name = "Z", descriptor = "Loc;")
    private static class151 field3946 = class137.method873(2, "Welcome to RuneScape");

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "[Loc;")
    public static class151[] field3936 = new class151[field3947];

    @OriginalMember(owner = "client!vh", name = "X", descriptor = "Loc;")
    private static class151 field3944 = class137.method873(2, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!vh", name = "U", descriptor = "I")
    public static int field3941 = 0;

    @OriginalMember(owner = "client!vh", name = "W", descriptor = "Loc;")
    public static class151 field3943 = field3946;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "[I")
    public static int[] field3938 = new int[field3947];

    @OriginalMember(owner = "client!vh", name = "V", descriptor = "Loc;")
    public static class151 field3942 = class137.method873(2, "details)3dat");

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "[I")
    public static int[] field3931 = new int[field3947];

    @OriginalMember(owner = "client!vh", name = "cb", descriptor = "[I")
    public static int[] field3949 = new int[field3947];

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "[I")
    public static int[] field3935 = new int[field3947];

    @OriginalMember(owner = "client!vh", name = "bb", descriptor = "[I")
    public static int[] field3948 = new int[field3947];

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "Loc;")
    public static class151 field3934 = field3944;

    @OriginalMember(owner = "client!vh", name = "S", descriptor = "[I")
    public static int[] field3939 = new int[field3947];

    @OriginalMember(owner = "client!vh", name = "Y", descriptor = "[I")
    public static int[] field3945 = new int[field3947];

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lwa;I)Loc;")
    public static final class151 method1417(class229 arg0, int arg1) {
        field3937++;
        if (arg1 != 50) {
            field3943 = null;
        }
        return class126.method762((byte) 117, 32767, arg0);
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "([B)V")
    public class226(byte[] arg0) {
        this.field3940 = arg0;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(Z)V")
    public static void method1418(boolean arg0) {
        field3934 = null;
        field3945 = null;
        field3943 = null;
        field3931 = null;
        field3948 = null;
        field3936 = null;
        if (arg0) {
            method1418(true);
        }
        field3946 = null;
        field3944 = null;
        field3938 = null;
        field3949 = null;
        field3935 = null;
        field3939 = null;
        field3942 = null;
    }
}
