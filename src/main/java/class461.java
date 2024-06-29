import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public abstract class class461 extends class499 {

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "Lht;")
    public class410 field6700;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "[I")
    public static int[] field6705 = new int[64];

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field6707 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "Luf;")
    public static class310 field6704 = new class310(66, 1);

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public static int field6709 = 0;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "Ljm;")
    public static class485 field6710 = new class485(37, 7);

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Lf;")
    public static class529 field6703;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "Z")
    public boolean field6708;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "[Ljb;")
    public static class340[] field6699;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I", line = 10)
    public final int method2712(int arg0) {
        field6706++;
        if (arg0 != 5696) {
            field6705 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V", line = 22)
    public static void method2713(int arg0) {
        field6707 = null;
        field6703 = null;
        field6699 = null;
        field6705 = null;
        field6704 = null;
        if (arg0 == 37) {
            field6710 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)Z", line = 41)
    public final boolean method2714(int arg0) {
        field6701++;
        return arg0 == 64 ? this.field6708 : true;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)Z", line = 52)
    public final boolean method2715(boolean arg0) {
        field6702++;
        return arg0 ? false : false;
    }

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)I", line = 67)
    public int method1461(int arg0) {
        field6698++;
        if (arg0 != 26615) {
            field6704 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lht;)V", line = 93)
    public class461(class410 arg0) {
        this.field6700 = arg0;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
    public abstract void method1467(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)V")
    public abstract void method1469(int arg0, byte arg1);

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)Z")
    public abstract boolean method1466(int arg0);

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)Z")
    public abstract boolean method1464(int arg0);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBLqv;Lqv;)V")
    public abstract void method1463(int arg0, byte arg1, class308 arg2, class308 arg3);

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)V")
    public abstract void method1468(boolean arg0);
}
