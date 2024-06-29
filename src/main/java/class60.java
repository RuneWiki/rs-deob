import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class60 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lvd;")
    public static class4 field839 = null;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Llc;")
    public static class86 field842;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ll;")
    public static final class163 method429(Throwable arg0, String arg1) {
        class163 var2;
        if ((arg0 instanceof class163)) {
            var2 = (class163) arg0;
            var2.field2643 = var2.field2643 + ' ' + arg1;
        } else {
            var2 = new class163(arg0, arg1);
        }
        field843++;
        return var2;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static void method430(byte arg0) {
        field839 = null;
        field842 = null;
        if (arg0 < 106) {
            field839 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public static final void method431(int arg0, String arg1, int arg2, int arg3, int arg4) {
        field841++;
        class131 var5 = class161.method1200((byte) 74, arg3, arg4);
        if (var5 == null) {
            return;
        }
        if (var5.field2141 != null) {
            class294 var6 = new class294();
            var6.field4669 = arg0;
            var6.field4668 = var5;
            var6.field4672 = arg1;
            var6.field4664 = var5.field2141;
            class266.method1852(var6, 1);
        }
        boolean var7 = true;
        if (var5.field2005 > 0) {
            var7 = class66.method473(1, var5);
        }
        if (arg2 != 164) {
            method429((Throwable) null, (String) null);
        }
        if (!var7 || !client.method1168(var5).method532(arg0 - 1, (byte) -29)) {
            return;
        }
        if (arg0 == 1) {
            class220.field3532.method557(143, 8);
            class122.field1787++;
            class220.field3532.method1119(arg4, (byte) 75);
            class220.field3532.method1094(arg2 ^ 0xD639B14C, arg3);
        }
        if (arg0 == 2) {
            class220.field3532.method557(246, arg2 - 156);
            class43.field597++;
            class220.field3532.method1119(arg4, (byte) 31);
            class220.field3532.method1094(-700861976, arg3);
        }
        if (arg0 == 3) {
            class220.field3532.method557(164, 8);
            class82.field1182++;
            class220.field3532.method1119(arg4, (byte) 83);
            class220.field3532.method1094(-700861976, arg3);
        }
        if (arg0 == 4) {
            class112.field1614++;
            class220.field3532.method557(54, 8);
            class220.field3532.method1119(arg4, (byte) 42);
            class220.field3532.method1094(-700861976, arg3);
        }
        if (arg0 == 5) {
            class220.field3532.method557(192, 8);
            class220.field3532.method1119(arg4, (byte) 115);
            class231.field3718++;
            class220.field3532.method1094(-700861976, arg3);
        }
        if (arg0 == 6) {
            class39.field558++;
            class220.field3532.method557(128, 8);
            class220.field3532.method1119(arg4, (byte) 51);
            class220.field3532.method1094(arg2 - 700862140, arg3);
        }
        if (arg0 == 7) {
            class155.field2550++;
            class220.field3532.method557(73, arg2 - 156);
            class220.field3532.method1119(arg4, (byte) -107);
            class220.field3532.method1094(arg2 - 700862140, arg3);
        }
        if (arg0 == 8) {
            class131.field1999++;
            class220.field3532.method557(232, 8);
            class220.field3532.method1119(arg4, (byte) 118);
            class220.field3532.method1094(-700861976, arg3);
        }
        if (arg0 == 9) {
            class265.field4295++;
            class220.field3532.method557(40, 8);
            class220.field3532.method1119(arg4, (byte) 105);
            class220.field3532.method1094(-700861976, arg3);
        }
        if (arg0 == 10) {
            class91.field1345++;
            class220.field3532.method557(29, 8);
            class220.field3532.method1119(arg4, (byte) 41);
            class220.field3532.method1094(-700861976, arg3);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[[I)V")
    public static final void method432(int arg0, int[][] arg1) {
        field840++;
        if (arg0 != 40) {
            field839 = null;
        }
        class240.field3831 = arg1;
    }
}
