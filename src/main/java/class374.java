import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class374 extends class211 {

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "Loe;")
    public static class127 field5459 = null;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "Lfi;")
    public class374 field5454;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "Lfi;")
    public class374 field5456;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method2250(int arg0) {
        field5457++;
        String var1 = "www";
        if (class372.field5448 == class230.field3507) {
            var1 = "www-wtrc";
        } else if (class504.field7623 == class230.field3507) {
            var1 = "www-wtqa";
        } else if (class8.field98 == class230.field3507) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class138.field2274 != null) {
            var2 = "/p=" + class138.field2274;
        }
        if (arg0 != 2) {
            field5459 = null;
        }
        return "http://" + var1 + "." + class298.field4512.field7461 + ".com/l=" + class406.field5898 + "/a=" + class90.field1620 + var2 + "/";
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
    public final void method2251(int arg0) {
        field5460++;
        if (this.field5454 == null) {
            return;
        }
        this.field5454.field5456 = this.field5456;
        this.field5456.field5454 = this.field5454;
        this.field5454 = null;
        this.field5456 = null;
        if (arg0 != 29959) {
            method2253(47);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method2252(int arg0, String arg1, int arg2) {
        field5455++;
        class64 var3 = class230.method1387(arg2, (byte) 40, arg0);
        var3.method441((byte) 58);
        var3.field1057 = arg1;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V")
    public static void method2253(int arg0) {
        field5459 = null;
        if (arg0 != 13159) {
            method2250(2);
        }
    }
}
