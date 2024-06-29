import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class182 {

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Lob;")
    public static class141 field3577 = class175.method1195(40, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lob;")
    public static class141 field3575 = class175.method1195(40, ")4slr)3ws?order=LPWM");

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field3581 = 1;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lob;")
    private static class141 field3578 = class175.method1195(40, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lob;")
    public static class141 field3576 = class175.method1195(40, "gleiten:");

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lob;")
    public static class141 field3574 = field3578;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lob;")
    private static class141 field3582 = class175.method1195(40, "Username: ");

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field3579 = -1;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Lob;")
    public static class141 field3583 = field3582;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Z")
    public static boolean field3585;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[BI)Lob;")
    public static final class141 method1227(int arg0, int arg1, byte[] arg2, int arg3) {
        field3573++;
        class141 var4 = new class141();
        var4.field2705 = 0;
        var4.field2701 = new byte[arg3];
        for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
            if (arg2[var5] != 0) {
                var4.field2701[var4.field2705++] = arg2[var5];
            }
        }
        if (arg0 != 1) {
            method1229(108, -66);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Lbh;")
    public static final class19 method1228(byte arg0) {
        int var1 = 79 % ((arg0 - 74) / 42);
        field3584++;
        try {
            return (class19) Class.forName("ma").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
    public static final void method1229(int arg0, int arg1) {
        field3580++;
        if (arg0 == -16361 && (class211.field4014 == null || class211.field4014.length < arg1)) {
            class211.field4014 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1230(int arg0) {
        field3577 = null;
        field3576 = null;
        field3574 = null;
        field3582 = null;
        if (arg0 > 113) {
            field3583 = null;
            field3578 = null;
            field3575 = null;
        }
    }
}
