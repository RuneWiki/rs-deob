import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class259 extends class431 {

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "J")
    public long field3973;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "Lks;")
    public static class305 field3974 = new class305();

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
    public static int field3976 = -1;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3977;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
    public static final void method1734(byte arg0, String arg1, String arg2) {
        class97.field1393 = arg1;
        field3975++;
        class124.field1847 = arg2;
        if (class6.field66 != 3 && class97.field1393.equals("") || class124.field1847.equals("")) {
            class501.method2972(3, -2);
            return;
        }
        class191.field3222 = false;
        if (class6.field66 != 1) {
            class452.field6604 = 0;
            class118.field1793 = -1;
        }
        class501.method2972(-3, -2);
        class500.field7185 = 1;
        class188.field2824 = 0;
        int var3 = 25 % ((arg0 - 1) / 57);
        class10.field139 = 0;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V")
    public static void method1735(boolean arg0) {
        field3974 = null;
        if (!arg0) {
            field3974 = null;
        }
        field3977 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method1736(int arg0) {
        field3972++;
        String var1 = "www";
        if (arg0 != -7264) {
            return null;
        }
        if (class310.field4662 == class100.field1425) {
            var1 = "www-wtrc";
        } else if (class459.field6684 == class310.field4662) {
            var1 = "www-wtqa";
        } else if (class313.field4716 == class310.field4662) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class6.field71 != null) {
            var2 = "/p=" + class6.field71;
        }
        return "http://" + var1 + "." + class312.field4691.field6917 + ".com/l=" + class224.field3673 + "/a=" + class341.field5067 + var2 + "/";
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
    public class259() {
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(J)V")
    public class259(long arg0) {
        this.field3973 = arg0;
    }
}
