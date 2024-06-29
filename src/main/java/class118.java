import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class118 extends class328 {

    @OriginalMember(owner = "client!fq", name = "D", descriptor = "Lhf;")
    public static class573 field1908 = new class573(1);

    @OriginalMember(owner = "client!fq", name = "F", descriptor = "Z")
    public static boolean field1910 = false;

    @OriginalMember(owner = "client!fq", name = "E", descriptor = "Led;")
    public static class115 field1909 = new class115();

    @OriginalMember(owner = "client!fq", name = "B", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!fq", name = "C", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field1907;
        int[] var3 = super.field4720.method2872(1, arg0);
        int var4 = 62 / ((48 - arg1) / 56);
        if (super.field4720.field7109) {
            class164.method1149(var3, 0, class449.field6539, class638.field9258[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "(I)V")
    public static void method973(int arg0) {
        field1909 = null;
        field1908 = null;
        if (arg0 != 9055) {
            method974(-16, -124);
        }
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(II)Z")
    public static final boolean method974(int arg0, int arg1) {
        ++field1906;
        int var2 = -106 % ((55 - arg1) / 32);
        return ~arg0 == -4 || arg0 == 7 || ~arg0 == -11;
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V")
    public class118() {
        super(0, true);
    }
}
