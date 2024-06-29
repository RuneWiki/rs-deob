import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class82 {

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    public int field1515;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "Lqe;")
    public static class465 field1516 = new class465(96, 3);

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "Lqe;")
    public static class465 field1518 = new class465(67, 0);

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "[I")
    public static int[] field1520;

    @OriginalMember(owner = "client!kca", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field1514++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V", line = 15)
    public static void method798(byte arg0) {
        field1516 = null;
        field1520 = null;
        if (arg0 > -107) {
            method798((byte) -57);
        }
        field1518 = null;
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(I)V", line = 26)
    public class82(int arg0) {
        this.field1515 = arg0;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(BIIIIII)V", line = 38)
    public static final void method799(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class156.field2337 <= arg3 - arg5 && arg3 + arg5 <= class612.field8854 && arg4 - arg5 >= class558.field7940 && (arg4 + arg5) <= class748.field10458) {
            class535.method3141(arg5, arg6, arg3, arg2, arg0 + 1698753450, arg1, arg4);
        } else {
            class463.method2813(arg3, arg4, arg1, arg6, (byte) 121, arg5, arg2);
        }
        field1519++;
        if (arg0 != 87) {
            method798((byte) -128);
        }
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(B)V", line = 60)
    public static final void method800(byte arg0) {
        field1521++;
        int var1 = 103 / ((-arg0 - 49) / 59);
        for (class236 var2 = (class236) class160.field2387.method4209(false); var2 != null; var2 = (class236) class160.field2387.method4207(9356)) {
            if (var2.field3346) {
                var2.field3346 = false;
            } else {
                class272.method1799(-79, var2.field3343);
            }
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lha;Z)V", line = 84)
    public static final void method801(class58 arg0, boolean arg1) {
        if (!arg1) {
            method801(null, false);
        }
        field1517++;
        if (class34.field450) {
            class535.method3140(arg0, -15251);
        } else {
            class44.method408(arg0, Integer.MAX_VALUE);
        }
    }
}
