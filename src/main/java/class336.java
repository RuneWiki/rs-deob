import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class class336 extends class745 {

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "[[I")
    public static int[][] field4774 = new int[128][128];

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "Lcea;")
    public static class111 field4775;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "[[[B")
    public static byte[][][] field4782;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLha;)Z", line = 11)
    public final boolean method1428(byte arg0, class475 arg1) {
        ++field4777;
        if (arg0 > -88) {
            this.method194(119, -64, 33, (class475) null, (class745) null, false, 31);
        }
        class11 var3 = class156.method1209(super.field10361, super.field10347 >> class679.field9600, super.field10350 >> class679.field9600);
        return var3 != null && var3.field143.field3037 ? class446.method2646(0, super.field10361, super.field10347 >> class679.field9600, var3.field143.method1167(84) - -this.method1167(117), super.field10350 >> class679.field9600) : class291.method1845(super.field10350 >> class679.field9600, (byte) -53, super.field10347 >> class679.field9600, super.field10361);
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V", line = 29)
    public final void method196(int arg0) {
        if (arg0 != -10382) {
            this.method196(50);
        }
        ++field4778;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIII)V", line = 40)
    public class336(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field10350 = arg2;
        super.field10347 = arg0;
        super.field10358 = arg1;
        super.field10361 = (byte) arg3;
        super.field10349 = (byte) arg4;
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(B)Z", line = 54)
    public final boolean method1429(byte arg0) {
        if (arg0 < 123) {
            method2060(41);
        }
        ++field4776;
        return class737.field10233[(super.field10347 >> class679.field9600) + -class277.field3995 + class162.field2499][(super.field10350 >> class679.field9600) + -class3.field47 - -class162.field2499];
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[Lmfa;)I", line = 67)
    public final int method1424(int arg0, class217[] arg1) {
        if (arg0 != 4) {
            field4782 = null;
        }
        ++field4781;
        return this.method4113(arg1, super.field10350 >> class679.field9600, (byte) 122, super.field10347 >> class679.field9600);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIILha;Lnfa;ZI)V", line = 78)
    public final void method194(int arg0, int arg1, int arg2, class475 arg3, class745 arg4, boolean arg5, int arg6) {
        if (arg0 != -24659) {
            field4774 = null;
        }
        ++field4779;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(Z)Z", line = 89)
    public final boolean method197(boolean arg0) {
        ++field4780;
        if (!arg0) {
            field4775 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 100)
    public static void method2060(int arg0) {
        field4774 = null;
        field4775 = null;
        if (arg0 != 128) {
            method2060(79);
        }
        field4782 = null;
    }
}
