import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class612 {

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Lhp;")
    private class277 field8905 = new class277(128);

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lkea;")
    private class203 field8907;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field8902 = 0;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lkca;")
    public static class73 field8906 = new class73(9, -1);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "J")
    public static long field8904;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)Luu;")
    public final class242 method3539(int arg0, byte arg1) {
        field8901++;
        class277 var3 = this.field8905;
        class242 var4;
        synchronized (this.field8905) {
            if (arg1 > 0) {
                this.method3539(-53, (byte) -58);
            }
            var4 = (class242) this.field8905.method1801(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field8907.method1286(class580.method3369(86, arg0), class201.method1275(arg0, true), (byte) -49);
        class242 var6 = new class242();
        if (var5 != null) {
            var6.method1615(126, new class194(var5));
        }
        class277 var7 = this.field8905;
        synchronized (this.field8905) {
            this.field8905.method1808((long) arg0, var6, (byte) -42);
            return var6;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lcda;ILkea;)V")
    public class612(class149 arg0, int arg1, class203 arg2) {
        this.field8907 = arg2;
        if (this.field8907 != null) {
            int var4 = this.field8907.method1282(-83) - 1;
            this.field8907.method1309(1675886592, var4);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method3540(int arg0) {
        if (arg0 == -1) {
            field8906 = null;
        }
    }
}
