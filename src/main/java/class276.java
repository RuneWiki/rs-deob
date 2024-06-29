import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class276 {

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "Lej;")
    public static class124 field3871 = new class124(42, 8);

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "Lej;")
    public static class124 field3875 = new class124(55, 4);

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!vea", name = "g", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "Loea;")
    public static class597 field3876;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 5)
    public static final void method1817(String arg0, int arg1) {
        field3872++;
        class564 var2 = class209.method1438(true);
        var2.field7778.method1526(false, class250.field3621.field7212);
        var2.field7778.method1485((byte) 107, 0);
        int var3 = var2.field7778.field3109;
        var2.field7778.method1485((byte) 107, 634);
        int[] var4 = class216.method1549(var2, false);
        int var5 = var2.field7778.field3109;
        var2.field7778.method1481((byte) -5, arg0);
        var2.field7778.method1526(false, class607.field8336);
        var2.field7778.field3109 += 7;
        var2.field7778.method1498(var5, true, var4, var2.field7778.field3109);
        var2.field7778.method1531(1809639944, var2.field7778.field3109 - var3);
        class167.method1260(118, var2);
        if (arg1 <= 99) {
            method1819(null, 70);
        }
        class189.field2825 = 1;
        class547.field7542 = -3;
        class166.field2604 = 0;
        class232.field3355 = 0;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)V", line = 37)
    public static void method1818(byte arg0) {
        field3875 = null;
        field3876 = null;
        field3871 = null;
        if (arg0 != 77) {
            method1818((byte) -107);
        }
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 51)
    public static final int method1819(String arg0, int arg1) {
        field3873++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class299.method1953(arg0.charAt(var4), false) + ((var3 << 5) - var3);
        }
        return arg1 == -29286 ? var3 : 0;
    }
}
