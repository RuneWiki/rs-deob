import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class82 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field1210 = -1;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1213;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 9)
    public static void method745(int arg0) {
        if (arg0 != 28392) {
            field1210 = 3;
        }
        field1213 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)I", line = 22)
    public static final int method746(int arg0, int arg1, int arg2) {
        field1211++;
        int var3 = 48 / ((arg0 + 8) / 36);
        class329 var4 = (class329) class19.field374.method614(-113, (long) arg2);
        if (var4 == null) {
            return 0;
        } else if (arg1 >= 0 && var4.field4473.length > arg1) {
            return var4.field4473[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 46)
    public static final void method747(byte arg0) {
        field1212++;
        int var1 = 87 % ((-arg0 - 47) / 62);
        for (class5 var2 = (class5) class323.field4395.method1240((byte) -69); var2 != null; var2 = (class5) class323.field4395.method1245(1)) {
            class438 var3 = var2.field31;
            if (class69.field1046 != var3.field3170 || var3.field6270) {
                var2.method2367(5);
                var3.method2725((byte) -42);
            } else if (var3.field6265 <= class414.field5793) {
                var3.method2716(class339.field4628, (byte) -105);
                if (var3.field6270) {
                    var2.method2367(5);
                } else {
                    class384.method2379(var3, true, true);
                }
            }
        }
    }
}
