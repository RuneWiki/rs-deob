import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class122 {

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "[Luq;")
    private class339[] field1595;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    private int field1594;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "[I")
    public static int[] field1589 = new int[5];

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Ltl;")
    public static class566 field1593 = new class566();

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Ltt;")
    public static class338 field1598 = new class338(21, -1);

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Z")
    public static boolean field1599 = false;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "J")
    private long field1591;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Luq;")
    private class339 field1592;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Luq;IJ)V", line = 4)
    public final void method719(class339 arg0, int arg1, long arg2) {
        field1590++;
        if (arg0.field4562 != null) {
            arg0.method1982((byte) -24);
        }
        class339 var5 = this.field1595[(int) (arg2 & (long) (this.field1594 - 1))];
        arg0.field4562 = var5.field4562;
        arg0.field4567 = var5;
        arg0.field4562.field4567 = arg0;
        if (arg1 >= -100) {
            field1593 = null;
        }
        arg0.field4564 = arg2;
        arg0.field4567.field4562 = arg0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IJ)Luq;", line = 37)
    public final class339 method720(int arg0, long arg1) {
        this.field1591 = arg1;
        if (arg0 != -4412) {
            this.method719(null, -35, -21L);
        }
        field1597++;
        class339 var4 = this.field1595[(int) (arg1 & (long) (this.field1594 - 1))];
        for (this.field1592 = var4.field4567; this.field1592 != var4; this.field1592 = this.field1592.field4567) {
            if (this.field1592.field4564 == arg1) {
                class339 var5 = this.field1592;
                this.field1592 = this.field1592.field4567;
                return var5;
            }
        }
        this.field1592 = null;
        return null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 74)
    public static void method721(int arg0) {
        if (arg0 == -1) {
            field1593 = null;
            field1598 = null;
            field1589 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)Luq;", line = 91)
    public final class339 method722(int arg0) {
        field1596++;
        if (this.field1592 == null) {
            return null;
        }
        class339 var2 = this.field1595[(int) (this.field1591 & (long) (this.field1594 - 1))];
        while (this.field1592 != var2) {
            if (this.field1592.field4564 == this.field1591) {
                class339 var3 = this.field1592;
                this.field1592 = this.field1592.field4567;
                return var3;
            }
            this.field1592 = this.field1592.field4567;
        }
        this.field1592 = null;
        return arg0 < 9 ? null : null;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(I)V", line = 129)
    public class122(int arg0) {
        this.field1595 = new class339[arg0];
        this.field1594 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class339 var3 = this.field1595[var2] = new class339();
            var3.field4567 = var3;
            var3.field4562 = var3;
        }
    }
}
