import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class27 extends InputStream {

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Z")
    public static boolean field471 = false;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Lpi;")
    public static class340 field466 = new class340(101, -1);

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIZ)Z", line = 5)
    public static final boolean method183(int arg0, int arg1, boolean arg2) {
        field468++;
        if (arg2) {
            return false;
        } else {
            return class255.method1593(arg0, 118, arg1) || class386.method2304(arg1, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!nf", name = "read", descriptor = "()I", line = 19)
    public final int read() {
        class463.method2773(30000L, -125);
        field469++;
        return -1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 28)
    public static void method184(int arg0) {
        int var1 = 68 % ((-arg0 - 47) / 45);
        field466 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILeo;)Z", line = 37)
    public static final boolean method185(int arg0, class423 arg1) {
        if (arg0 > -12) {
            field471 = false;
        }
        field467++;
        if (class225.field2918 == arg1.field5800) {
            class311.field4022 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V", line = 64)
    public static final void method186(int arg0) {
        field470++;
        if (!class422.field5662 || arg0 != -1) {
            return;
        }
        while (true) {
            while (class457.field6376 < class167.field2177.length) {
                class311 var1 = class167.field2177[class457.field6376];
                if (var1 != null && var1.field4010 == -1) {
                    if (class432.field5950 == null) {
                        class432.field5950 = class339.field4332.method2518(var1.field4012, 116);
                    }
                    int var2 = class432.field5950.field3152;
                    if (var2 == -1) {
                        return;
                    }
                    class432.field5950 = null;
                    var1.field4010 = var2;
                    class457.field6376++;
                } else {
                    class457.field6376++;
                }
            }
            return;
        }
    }
}
