import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class305 extends class68 {

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "Lce;")
    public class126 field5125;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field5121 = 0;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Lvc;")
    public static class129 field5124 = new class129();

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "[I")
    public static int[] field5127 = new int[2];

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "Lce;")
    public static class126 field5128 = class206.method1445(-7923, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "Lce;")
    public static class126 field5129 = class206.method1445(-7923, "<col=ffff00>");

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)Lhd;", line = 10)
    public static final class319 method2049(int arg0, byte arg1) {
        if (arg1 < 103) {
            return (class319) null;
        }
        class319 var2 = (class319) class183.field3188.method303((long) arg0, 0);
        field5123++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class313.field5366.method2173(class111.method728(true, arg0), class253.method1718(arg0, 0), (byte) -51);
        class319 var4 = new class319();
        if (var3 != null) {
            var4.method2219((byte) 119, new class134(var3));
        }
        class183.field3188.method308(var4, (long) arg0, (byte) 118);
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 50)
    public static void method2050(int arg0) {
        field5128 = null;
        field5127 = null;
        field5124 = null;
        field5129 = null;
        if (arg0 != 2) {
            method2050(23);
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 67)
    public class305() {
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lce;)V", line = 78)
    public class305(class126 arg0) {
        this.field5125 = arg0;
    }
}
