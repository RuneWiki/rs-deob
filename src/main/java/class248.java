import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class248 {

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Lbe;")
    public static class283 field4232 = class153.method941(-89, " ");

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Lbe;")
    public static class283 field4235 = class153.method941(5, "www)2wtrc");

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "[I")
    public static int[] field4233 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Z")
    public static boolean field4238 = false;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "Lbe;")
    private static class283 field4239 = class153.method941(126, " has logged in)3");

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Lbe;")
    public static class283 field4234 = field4239;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "[I")
    public static int[] field4236;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "[Lnh;")
    public static class107[] field4230;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)Lnj;", line = 9)
    public static final class214 method1685(int arg0) {
        if (arg0 != 1) {
            field4234 = (class283) null;
        }
        field4240++;
        try {
            return (class214) Class.forName("ac").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class187();
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 29)
    public static void method1686(byte arg0) {
        field4230 = null;
        field4239 = null;
        if (arg0 != -48) {
            return;
        }
        field4235 = null;
        field4236 = null;
        field4233 = null;
        field4232 = null;
        field4234 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)I", line = 51)
    public static final int method1687(byte arg0, int arg1) {
        if (arg0 > -4) {
            return -93;
        } else {
            field4237++;
            return arg1 >>> 7;
        }
    }
}
