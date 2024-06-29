import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class294 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field4630 = -1;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "[I")
    public static int[] field4631 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field4633 = 255;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4636 = "purple:";

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method1962(int arg0) {
        field4636 = null;
        field4631 = null;
        if (arg0 >= -38) {
            field4630 = 68;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public static final void method1963(int arg0, String arg1, int arg2, int arg3, int arg4) {
        field4634++;
        class228 var5 = class31.method239(arg3, -1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3536 != null) {
            class116 var6 = new class116();
            var6.field1892 = var5;
            var6.field1893 = arg1;
            var6.field1895 = var5.field3536;
            var6.field1887 = arg0;
            class44.method322(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field3549 > 0) {
            var7 = class248.method1708(var5, true);
        }
        if (!var7 || !client.method1059(var5).method1832(arg0 - 1, 1)) {
            return;
        }
        if (arg0 == 1) {
            class237.field3849++;
            client.field2435.method536((byte) -104, 53);
            client.field2435.method639(arg2, (byte) -100);
            client.field2435.method634(arg3, 78);
        }
        if (arg0 == 2) {
            class4.field37++;
            client.field2435.method536((byte) -104, 77);
            client.field2435.method639(arg2, (byte) -107);
            client.field2435.method634(arg3, 90);
        }
        if (arg0 == 3) {
            client.field2435.method536((byte) -104, 3);
            class90.field1574++;
            client.field2435.method639(arg2, (byte) -110);
            client.field2435.method634(arg3, 98);
        }
        if (arg0 == 4) {
            client.field2435.method536((byte) -104, 111);
            client.field2435.method639(arg2, (byte) -100);
            client.field2435.method634(arg3, 45);
            class50.field735++;
        }
        if (arg0 == 5) {
            class240.field3900++;
            client.field2435.method536((byte) -104, 235);
            client.field2435.method639(arg2, (byte) -112);
            client.field2435.method634(arg3, 111);
        }
        if (arg0 == 6) {
            client.field2435.method536((byte) -104, 166);
            client.field2435.method639(arg2, (byte) -118);
            client.field2435.method634(arg3, 72);
            class237.field3838++;
        }
        int var8 = -5 % ((arg4 - 66) / 52);
        if (arg0 == 7) {
            class46.field655++;
            client.field2435.method536((byte) -104, 42);
            client.field2435.method639(arg2, (byte) -112);
            client.field2435.method634(arg3, 29);
        }
        if (arg0 == 8) {
            client.field2435.method536((byte) -104, 134);
            client.field2435.method639(arg2, (byte) -114);
            class98.field1647++;
            client.field2435.method634(arg3, 52);
        }
        if (arg0 == 9) {
            class11.field199++;
            client.field2435.method536((byte) -104, 113);
            client.field2435.method639(arg2, (byte) -128);
            client.field2435.method634(arg3, 74);
        }
        if (arg0 == 10) {
            client.field2435.method536((byte) -104, 52);
            client.field2435.method639(arg2, (byte) -109);
            class44.field630++;
            client.field2435.method634(arg3, 28);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)V")
    public static final void method1964(byte arg0, int arg1) {
        class53 var2 = (class53) class291.field4590.method285((long) arg1, 13821);
        field4632++;
        if (arg0 == -128 && var2 != null) {
            var2.method1123(0);
        }
    }
}
