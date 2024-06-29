import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class292 extends class45 {

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "I")
    public volatile int field3853 = -1;

    @OriginalMember(owner = "client!taa", name = "p", descriptor = "Ljava/lang/String;")
    public volatile String field3860;

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3854 = new String[200];

    @OriginalMember(owner = "client!taa", name = "n", descriptor = "[Lpfa;")
    public static class279[] field3858 = new class279[100];

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!taa", name = "m", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!taa", name = "o", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "Lnda;")
    public static class586 field3855;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V", line = 4)
    public static void method1729(byte arg0) {
        field3855 = null;
        field3858 = null;
        if (arg0 != -91) {
            field3858 = null;
        }
        field3854 = null;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Lwv;B)Lwv;", line = 21)
    public static final class423 method1730(class423 arg0, byte arg1) {
        field3857++;
        if (arg0.field5585 != -1) {
            return class592.method3271(arg0.field5585, (byte) -128);
        }
        if (arg1 != -122) {
            field3854 = null;
        }
        int var2 = arg0.field5685 >>> 16;
        class110 var3 = new class110(class152.field2079);
        for (class137 var4 = (class137) var3.method596(69); var4 != null; var4 = (class137) var3.method601((byte) 39)) {
            if (var4.field1870 == var2) {
                return class592.method3271((int) var4.field545, (byte) -89);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 85)
    public class292(String arg0) {
        this.field3860 = arg0;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIIBI)V", line = 60)
    public static final void method1731(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3859++;
        class229 var5 = class298.method1751(95);
        var5.field2971.method915(-31914, class624.field8649.field799);
        var5.field2971.method915(-31914, arg1);
        var5.field2971.method915(-31914, arg2);
        var5.field2971.method918(24551, arg4);
        if (arg3 <= 33) {
            return;
        }
        var5.field2971.method918(24551, arg0);
        class307.method1805(var5, -14704);
        class329.field4423 = 0;
        class279.field3685 = -3;
        class589.field8123 = 1;
        class50.field585 = 0;
    }
}
