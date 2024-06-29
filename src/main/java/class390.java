import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class390 implements class113 {

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "Lqg;")
    private class432 field5153;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "Lhi;")
    public static class193 field5155 = new class193(1);

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "[I")
    public static int[] field5156 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)Z", line = 7)
    public final boolean method913(int arg0) {
        if (arg0 < 13) {
            return true;
        } else {
            field5152++;
            return true;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lcu;ILtb;)Lrba;", line = 18)
    public static final class402 method2252(class206 arg0, int arg1, class371 arg2) {
        field5154++;
        class402 var3 = class456.method2604(-1);
        if (arg1 > -74) {
            method2253(false);
        }
        var3.field5347 = arg0;
        var3.field5350 = arg0.field2968;
        if (var3.field5350 == -1) {
            var3.field5354 = new class201(260);
        } else if (var3.field5350 == -2) {
            var3.field5354 = new class201(10000);
        } else if (var3.field5350 <= 18) {
            var3.field5354 = new class201(20);
        } else if (var3.field5350 <= 98) {
            var3.field5354 = new class201(100);
        } else {
            var3.field5354 = new class201(260);
        }
        var3.field5354.method1320(arg2, true);
        var3.field5354.method1310(105, var3.field5347.method1337(-100));
        var3.field5349 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V", line = 53)
    public final void method911(byte arg0) {
        field5149++;
        if (arg0 != -13) {
            field5155 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V", line = 66)
    public static void method2253(boolean arg0) {
        if (!arg0) {
            field5155 = null;
        }
        field5156 = null;
        field5155 = null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZI)V", line = 77)
    public final void method912(boolean arg0, int arg1) {
        field5150++;
        if (arg0) {
            class10.field197.method415(0, 0, class627.field8461, class149.field2387, this.field5153.field5906, 0);
        }
        if (arg1 != -20667) {
            field5156 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lqg;)V", line = 99)
    public class390(class432 arg0) {
        this.field5153 = arg0;
    }
}
