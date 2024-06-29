import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class266 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Ljn;")
    public static class324 field3898 = new class324(4, 1, 1, 1);

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Lid;")
    public static class467 field3901;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "[Lfd;")
    public static class298[] field3897;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[[Luv;")
    public static class755[][] field3900;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)Lgca;")
    public static final class209 method1814(byte arg0, int arg1) {
        field3899++;
        class209 var2 = (class209) class424.field5953.method3898((byte) -42, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class211.field2790.method1572(1, 0, arg1);
        class209 var4 = new class209();
        if (arg0 != 119) {
            field3898 = null;
        }
        var4.field2715 = arg1;
        if (var3 != null) {
            var4.method1247(29045, new class63(var3));
        }
        var4.method1246(120);
        if (var4.field2729 == 2 && class526.field7306.method812(105, (long) arg1) == null) {
            class526.field7306.method820((long) arg1, (byte) -42, new class27(class437.field6101));
            class70.field1066[class437.field6101++] = var4;
        }
        class424.field5953.method3899(-127, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static void method1815(byte arg0) {
        field3897 = null;
        if (arg0 >= -66) {
            method1815((byte) 50);
        }
        field3900 = null;
        field3901 = null;
        field3898 = null;
    }
}
